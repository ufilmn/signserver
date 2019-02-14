/*************************************************************************
 *                                                                       *
 *  SignServer: The OpenSource Automated Signing Server                  *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.signserver.server.signers;

import java.io.IOException;
import javax.persistence.EntityManager;
import org.signserver.common.CryptoTokenOfflineException;
import org.signserver.common.IllegalRequestException;
import org.signserver.common.RequestContext;
import org.signserver.common.SignServerException;
import org.signserver.common.WorkerConfig;
import org.signserver.server.WorkerContext;
import org.apache.log4j.Logger;
import org.signserver.server.BaseProcessable;
import org.signserver.common.data.ReadableData;
import org.signserver.common.data.Request;
import org.signserver.common.data.Response;
import org.signserver.common.data.SignatureRequest;
import org.signserver.common.data.SignatureResponse;
import org.signserver.common.data.WritableData;

/**
 * Worker simply echoing the request back.
 *
 * @author Markus Kilås
 * @version $Id: EchoWorker.java 7620 2016-07-14 14:50:30Z netmackan $
 */
public class EchoWorker extends BaseProcessable {
    
    /** Logger for this class. */
    private static final Logger LOG = Logger.getLogger(EchoWorker.class);
    
    /** Worker property: number of milliseconds to sleep simulating work. */
    private long sleep;
    
    @Override
    public void init(final int workerId, final WorkerConfig config,
            final WorkerContext workerContext, final EntityManager workerEM) {
        super.init(workerId, config, workerContext, workerEM);
        
        // Optional worker property SLEEP
        String sleepValue = config.getProperty("SLEEP", "0");
        sleep = Long.parseLong(sleepValue);
    }

    @Override
    public Response processData(Request signRequest, RequestContext requestContext) throws IllegalRequestException, CryptoTokenOfflineException, SignServerException {

        // Check that the request is of right type
        if (!(signRequest instanceof SignatureRequest)) {
            throw new IllegalRequestException("Unexpected request type");
        }
        final SignatureRequest request = (SignatureRequest) signRequest;

        // The result is simply the data from the request
        final ReadableData requestData = request.getRequestData();
        final WritableData responseData = request.getResponseData();
        byte[] signedbytes;
        try {
            signedbytes = requestData.getAsByteArray();
        } catch (IOException ex) {
            throw new SignServerException("Unable to obtain data", ex);
        }
        
        String archiveId = createArchiveId(signedbytes, (String) requestContext.get(RequestContext.TRANSACTION_ID));
        
        // Simulate crypto operations by sleeping
        if (LOG.isDebugEnabled()) {
            LOG.debug("Simulating crypto operation for " + sleep + " seconds");
        }
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException ex) {
            throw new SignServerException("Interrupted", ex);
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("Done with crypto");
        }

        // Return the response as usual
        return new SignatureResponse(request.getRequestID(), responseData,
                    null,
                    archiveId, null, "application/octet-stream");
    }

}

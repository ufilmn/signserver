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
package org.signserver.common;

/**
 * Interface used for requests to WorkerSession.process method. Should
 * be implemented by all types of validator requests.
 *
 * @author Markus Kilås
 * @version $Id: IValidationRequest.java 7565 2016-06-28 08:01:12Z malu9369 $
 */
public interface IValidationRequest {

    /**
     * Should contain a unique request id used to identify the request.
     * 
     * @return Request ID
     */
    int getRequestID();

    /**
     * Should contain the data that should be validated.
     * 
     * @return Request data
     */
    Object getRequestData();
}

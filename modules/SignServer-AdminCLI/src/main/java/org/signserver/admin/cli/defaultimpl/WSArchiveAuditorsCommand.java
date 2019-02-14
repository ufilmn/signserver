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
package org.signserver.admin.cli.defaultimpl;

/**
 * Command for managing the list of authorized WS auditors.
 *
 * @version $Id: WSArchiveAuditorsCommand.java 5211 2014-09-23 16:07:05Z malu9369 $
 */
public class WSArchiveAuditorsCommand extends AbstractWSClientsCommand {
    
    private static final String USAGE =
            "Usage: signserver wsarchiveauditors -add -certserialno <certificate serial number (in hex)> -issuerdn <issuer DN>\n"
                + "Usage: signserver warchiveauditors -add -cert <PEM or DER file>\n"
            + "Usage: signserver warchiveauditors -remove -certserialno <certificate serial number (in hex)> -issuerdn <issuer DN>\n"
            + "Usage: signserver warchiveauditors -list\n"
            + "Example 1: signserver warchiveauditors -add -certserialno 123ABCDEF -issuerdn \"CN=Neo Morpheus, C=SE\"\n"
            + "Example 2: signserver warchiveauditors -add -cert wsauditor.pem\n"
            + "Example 3: signserver warchiveauditors -remove -certserialno 123ABCDEF -issuerdn \"CN=Neo Morpheus, C=SE\"\n"
            + "Example 4: signserver warchiveauditors -list";

    @Override
    public String getDescription() {
        return "Manages authorizations for WS auditors";
    }

    @Override
    public String getUsages() {
        return USAGE;
    }

    @Override
    protected String getClientsProperty() {
        return "WSARCHIVEAUDITORS";
    }
}

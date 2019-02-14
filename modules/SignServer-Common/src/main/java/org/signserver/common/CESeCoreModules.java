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
 * Names of known CESeCore EJB modules.
 *
 * @author Markus Kilås
 * @version $Id: CESeCoreModules.java 6914 2015-12-18 09:50:31Z netmackan $
 */
public interface CESeCoreModules {

    /** The main CESeCore ejb-jar. */
    String CORE = "cesecore-ejb-6.4.1";
}

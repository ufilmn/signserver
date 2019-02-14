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
package org.signserver.statusrepo;

import javax.ejb.Local;

/**
 * Interface towards the status repository session bean.
 * 
 * @author Markus Kilås
 * @version $Id: StatusRepositorySessionLocal.java 6969 2015-12-29 18:24:25Z netmackan $
 */
@Local
public interface StatusRepositorySessionLocal extends StatusRepositorySession {
}
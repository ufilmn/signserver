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
package org.signserver.test.random;

/**
 * Exception indicating a failure.
 *
 * @author Markus Kilås
 * @version $Id: FailedException.java 2677 2012-09-19 10:21:28Z netmackan $
 */
public class FailedException extends Exception {

    public FailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FailedException(String message) {
        super(message);
    }
    
}

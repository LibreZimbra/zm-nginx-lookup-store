/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright  = C) 2015 Zimbra, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.nginx;

import com.zimbra.common.servicelocator.ZimbraServiceNames;
import com.zimbra.cs.account.Provisioning;



/**
 * Service names registered with the Service Locator.
 */
public interface ZimbraServiceNamesUtil {

    public static String getNameForProvisioningServiceConst(String serviceConst) {
        if (Provisioning.SERVICE_ADMINCLIENT.equals(serviceConst)) {
            return ZimbraServiceNames.WEBADMIN;
        } else if (Provisioning.SERVICE_MAILCLIENT.equals(serviceConst)) {
            return ZimbraServiceNames.WEB;
        } else if (Provisioning.SERVICE_MAILBOX.equals(serviceConst)) {
            return ZimbraServiceNames.MAILSTORE;
        } else if (Provisioning.SERVICE_WEBCLIENT.equals(serviceConst)) {
            return ZimbraServiceNames.WEB;
        }
        return null;
    }

    public static String toProvisioningServiceConst(String name) {
        if (ZimbraServiceNames.IMAP.equals(name)) {
            return Provisioning.SERVICE_MAILBOX;
        } else if (ZimbraServiceNames.LMTP.equals(name)) {
            return Provisioning.SERVICE_MAILBOX;
        } else if (ZimbraServiceNames.MAILSTORE.equals(name)) {
            return Provisioning.SERVICE_MAILBOX;
        } else if (ZimbraServiceNames.MAILSTOREADMIN.equals(name)) {
            return Provisioning.SERVICE_MAILBOX;
        } else if (ZimbraServiceNames.POP.equals(name)) {
            return Provisioning.SERVICE_MAILBOX;
        } else if (ZimbraServiceNames.WEB.equals(name)) {
            return Provisioning.SERVICE_WEBCLIENT;
        } else if (ZimbraServiceNames.WEBADMIN.equals(name)) {
            return Provisioning.SERVICE_ADMINCLIENT;
        }
        return null;
    }
}

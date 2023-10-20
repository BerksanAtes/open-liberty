/*******************************************************************************
 * Copyright (c) 2023 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package hello;

import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

// TO-DO: Add tests that modifiy header values to ensure that modifying a header that's
// marked with header = true on the @WebParam in the SEI can be done from a handler without
// unexpected behavior from the runtime.
public class SecurityHeaderHandler implements SOAPHandler<SOAPMessageContext> {

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outBoundProperty) {
            SOAPMessage message = context.getMessage();

            try {
                // Added security header even though there is no security configured in yet
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();

                SOAPElement security = header.addChildElement("Security", "wsse", "http://schemas.xmlsoap.org/ws/2003/06/secext");

                SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://schemas.xmlsoap.org/ws/2003/06/secext");

                SOAPElement username = usernameToken.addChildElement("Username", "wsse");
                username.addTextNode("test_username");

                SOAPElement password = usernameToken.addChildElement("Password", "wsse");
                password.addTextNode("test_password");

                message.saveChanges();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        final QName securityHeader = new QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Security", "wsse");

        final HashSet headers = new HashSet();
        headers.add(securityHeader);

        return headers;
    }
}
/*******************************************************************************
 * Copyright (c) 2023 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.ibm.ws.properties.test.servlet;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import org.junit.Test;

import com.ibm.ws.properties.test.client.stub.ImageService;
import com.ibm.ws.properties.test.client.stub.ImageServiceImplService;
import com.ibm.ws.properties.test.client.stub.ImageServiceImplServiceTwo;
import com.ibm.ws.properties.test.client.stub.ImageServiceTwo;

import componenttest.app.FATServlet;

/**
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/LibertyCXFPositivePropertiesTestServlet")
public class LibertyCXFPositivePropertiesTestServlet extends FATServlet {

    @WebServiceRef(value = ImageServiceImplService.class, name = "services/ImageServicePropertyImplService")
    ImageServiceImplService imageService;

    @WebServiceRef(value = ImageServiceImplServiceTwo.class, name = "services/ImageServiceImplServiceTwo")
    ImageServiceImplServiceTwo imageServiceTwo;

    private static final String serverURL = "https://localhost" + ":" + Integer.getInteger("bvt.prop.HTTP_default.secure");

    private static final long serialVersionUID = 1L;

    private DataHandler imageDataHandler = null;

    /*
     * Testing cxf.multipart.attachment property is used to skip or not the attachment output
     * If cxf.add.attachments is set to true for Inbound or Outbound messages
     * or cxf.multipart.attachment is set to false, SwAOutInterceptor setup AttachmentOutput
     * If not SwAOutInterceptor skip AttachmentOutput
     *
     * The test method has no asserts because, with the property set, the client is expected
     * to invoke the Web Service correctly
     */
    @Test
    public void testCxfPropertyAttachmentOutputPolicy() throws Exception {

        setImageDataHandler();

        ImageService proxy = imageService.getImageServiceImplPort();

        BindingProvider provider = (BindingProvider) proxy;

        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                         serverURL + "/webServiceRefFeatures/ImageServiceImplService");

        proxy.uploadImage("ServiceInjection", imageDataHandler);

    }

    /*
     * Testing cxf.ignore.unsupported.policy for used alternative policies
     * When this property is set to true, it prevents addition of used policies
     * into ws-policy.validated.alternatives in PolicyVerificationInInterceptor
     *
     * The test method has no asserts because, with the property set, the client is expected
     * to invoke the Web Service correctly
     */
    @Test
    public void testCxfPropertyUsedAlternativePolicy() throws Exception {

        setImageDataHandler();

        ImageService proxy = imageService.getImageServiceImplPort();

        BindingProvider provider = (BindingProvider) proxy;

        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                         serverURL + "/libertyCXFProperty/ImageServiceImplService");

        proxy.uploadImage("ServiceInjection", imageDataHandler);

    }

    /*
     * Testing cxf.ignore.unsupported.policy for not supported alternative policies.
     * Setting this property to true make alternative policies to be potentially supported
     *
     * The test method has no asserts because, with the property set, the client is expected
     * to invoke the Web Service correctly
     */
    @Test
    public void testCxfPropertyUnsupportedPolicy() throws Exception {

        setImageDataHandler();

        ImageServiceTwo proxy2 = imageServiceTwo.getImageServiceImplPortTwo();

        BindingProvider provider = (BindingProvider) proxy2;

        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                         serverURL + "/libertyCXFProperty/ImageServiceImplServiceTwo");

        proxy2.uploadImage("ServiceInjection", imageDataHandler);

    }

    /*
     * We are setting imageDataHandler when needed from classes since we need delayed instantiation
     * to give image file to be ready to copy
     */
    private void setImageDataHandler() {
        if (imageDataHandler == null) {
            try {
                FileDataSource fileDataSource = new FileDataSource("resources/" + "a.jpg");
                this.imageDataHandler = new DataHandler(fileDataSource);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                // Do you need FFDC here? Remember FFDC instrumentation and @FFDCIgnore
                e.printStackTrace();
            }
        }
    }

}

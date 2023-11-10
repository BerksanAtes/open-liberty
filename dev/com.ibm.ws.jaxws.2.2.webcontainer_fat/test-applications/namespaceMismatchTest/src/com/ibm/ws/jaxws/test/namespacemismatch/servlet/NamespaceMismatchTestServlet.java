/*******************************************************************************
 * Copyright (c) 2023 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.ibm.ws.jaxws.test.namespacemismatch.servlet;

import javax.servlet.annotation.WebServlet;

import org.junit.Test;

import com.ibm.ws.jaxws.test.namespacemismatch.stub.Hello;
import com.ibm.ws.jaxws.test.namespacemismatch.stub.HelloService;

import componenttest.app.FATServlet;

/**
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/NamespaceMismatchTestServlet")
public class NamespaceMismatchTestServlet extends FATServlet {

    /*
     * Test for checking correction of OutofBound MessagePartInfos from inheriting the wrong QName from MessageInfo
     *
     */
    @Test
    public void IsNameSpaceMismatchCorrected() {
        HelloService proxy = new HelloService();
        Hello hello = proxy.getHelloPort();
        String response = hello.sayHello("Hello Mismatching QName!");
        System.out.println("Response: " + response);
    }
}

/*******************************************************************************
 * Copyright (c) 2023 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.ibm.ws.jaxws.fat;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ibm.websphere.simplicity.ShrinkHelper;
import com.ibm.ws.jaxws.test.namespacemismatch.servlet.NamespaceMismatchTestServlet;

import componenttest.annotation.Server;
import componenttest.annotation.TestServlet;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.custom.junit.runner.Mode;
import componenttest.custom.junit.runner.Mode.TestMode;
import componenttest.topology.impl.LibertyServer;
import componenttest.topology.utils.FATServletClient;

/**
 *
 */
@RunWith(FATRunner.class)
@Mode(TestMode.FULL)
public class NamespaceMismatchTest extends FATServletClient {

    private static final String APP_NAME = "NamespaceMismatchTest";

    @Server("NamespaceMismatchServer")
    @TestServlet(servlet = NamespaceMismatchTestServlet.class, contextRoot = APP_NAME)
    public static LibertyServer server;

    int CONN_TIMEOUT = 5000;

    @BeforeClass
    public static void setUp() throws Exception {

        ShrinkHelper.defaultDropinApp(server, APP_NAME, "com.ibm.ws.jaxws.test.namespacemismatch.stub", "com.ibm.ws.jaxws.test.namespacemismatch.service",
                                      "com.ibm.ws.jaxws.test.namespacemismatch.servlet");
        server.startServer("NamespaceMismatchTest.log");
        server.waitForStringInLog("CWWKZ0001I.*" + APP_NAME);
    }

    @After
    public void tearDown() throws Exception {
        if (server != null && server.isStarted()) {
            server.stopServer();
        }
    }
}

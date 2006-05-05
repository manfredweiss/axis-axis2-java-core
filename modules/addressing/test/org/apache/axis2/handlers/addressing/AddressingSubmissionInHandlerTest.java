/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.axis2.handlers.addressing;

import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.client.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AddressingSubmissionInHandlerTest extends AddressingInHandlerTestBase {

    private Log log = LogFactory.getLog(getClass());
   
    /**
     * @param testName
     */
    public AddressingSubmissionInHandlerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        super.setUp();
        inHandler = new AddressingSubmissionInHandler();
        addressingNamespace = AddressingConstants.Submission.WSA_NAMESPACE;
        versionDirectory = "submission";
        fromAddress = "http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous";
        secondRelationshipType = "axis2:some.custom.relationship";
    }

    public void testExtractAddressingInformationFromHeaders() {
        try {
            Options options = extractAddressingInformationFromHeaders();
            // Cannot check refparams in 2004/08 case as they can't be extracted until later
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            fail(" An Exception has occured " + e.getMessage());
        }
    }
}

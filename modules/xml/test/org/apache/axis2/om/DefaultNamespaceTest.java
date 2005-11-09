package org.apache.axis2.om;

import junit.framework.TestCase;

import javax.xml.namespace.QName;

/*
 * Copyright 2001-2004 The Apache Software Foundation.
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
 *
 * @author : Eran Chinthaka (chinthaka@apache.org)
 */

public class DefaultNamespaceTest extends TestCase {

    public void testDefaultNamespace() {

        String expectedXML = "<Foo xmlns=\"http://defaultNsUri.org\"><Bar xmlns=\"\"></Bar><Baz></Baz></Foo>";

        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMElement foo = factory.createOMElement(new QName("http://defaultNsUri.org", "Foo"), null);
        OMElement bar = factory.createOMElement("Bar", null, foo);
        OMElement baz = factory.createOMElement(new QName("http://defaultNsUri.org", "Baz"), foo);
        assertEquals(expectedXML, foo.toString());
    }

}

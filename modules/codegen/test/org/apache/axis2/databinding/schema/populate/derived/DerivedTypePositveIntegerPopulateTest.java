package org.apache.axis2.databinding.schema.populate.derived;

import org.apache.axis2.databinding.schema.util.ConverterUtil;
import org.apache.axis2.databinding.schema.types.NonPositiveInteger;
import org.apache.axis2.databinding.schema.types.PositiveInteger;

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

public class DerivedTypePositveIntegerPopulateTest extends AbstractDerivedPopulater{

     private String values[]= {
            "18444",
            "1",
            "5636332" ,
            "0" ,
            "-3453434"

    };

    private String xmlString[] = {
            "<DerivedPositiveInteger>"+values[0]+"</DerivedPositiveInteger>",
            "<DerivedPositiveInteger>"+values[1]+"</DerivedPositiveInteger>",
            "<DerivedPositiveInteger>"+values[2]+"</DerivedPositiveInteger>",
            "<DerivedPositiveInteger>"+values[3]+"</DerivedPositiveInteger>",
            "<DerivedPositiveInteger>"+values[4]+"</DerivedPositiveInteger>"
    };




    protected void setUp() throws Exception {
        className = "org.soapinterop.DerivedPositiveInteger";
        propertyClass = PositiveInteger.class;
    }

    // force others to implement this method
    public void testPopulate() throws Exception {

        for (int i = 0; i < 3; i++) {
            checkValue(xmlString[i],values[i]);
        }
        for (int i = 3; i < values.length; i++) {
            try {
                checkValue(xmlString[i],values[i]);
                fail();
            } catch (Exception e) {

            }
        }
    }

    protected String convertToString(Object o) {
        return ConverterUtil.convertToString((PositiveInteger)o);
    }
}

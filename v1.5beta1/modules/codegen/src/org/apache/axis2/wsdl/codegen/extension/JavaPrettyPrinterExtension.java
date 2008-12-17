/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.wsdl.codegen.extension;

import org.apache.axis2.util.PrettyPrinter;
import org.apache.axis2.wsdl.codegen.CodeGenConfiguration;

import java.io.File;

public class JavaPrettyPrinterExtension extends AbstractPrettyPrinterExtension {


    public JavaPrettyPrinterExtension() {
        /*
        * If the extension for property file changes it might effect this as
        * well !!!
        */
        fileExtension = ".java";
    }

    /**
     * Recursive procedure to prettify the files
     *
     * @param file
     */
    protected void prettify(File file, CodeGenConfiguration configuration) {
        if (file.isFile() &&
                file.exists() &&
                file.getName().toLowerCase().endsWith(fileExtension)) {
            prettifyFile(file);
        } else if (file.isDirectory()) {
            File[] childFiles = file.listFiles();
            if (childFiles != null) {
                for (int i = 0; i < childFiles.length; i++) {
                    prettify(childFiles[i], configuration);
                }
            }
        }
    }

    /**
     * Overridden to call the java pretty printer
     *
     * @param file
     */
    protected void prettifyFile(File file) {
        // Special case jaxbri generated package-info.java 
        // as jalopy corrupts the package level annotations
        if (file.getName().equals("package-info.java")) {
            return;
        }
        PrettyPrinter.prettify(file);
    }
}

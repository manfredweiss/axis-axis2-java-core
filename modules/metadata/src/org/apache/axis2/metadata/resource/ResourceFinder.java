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

package org.apache.axis2.metadata.resource;

import java.net.URL;

/*
 * ResourceFinder will be used to find Resources from a classloader. 
 * for example a ResourceFinder can be used to get all the resources as url from classloader
 * or it can be used to find a class in classpath from Classloader. 
 */

public interface ResourceFinder {
    
    /**
     * This method reads all the resource URLs available to this classLoader.
     * @param cl
     * @return
     */
    URL[] getURLs(ClassLoader cl);

}
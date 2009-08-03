/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.wink.jaxrs.test.constructors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class SubResourcePrivateConstructor {

    final private String whichConstructor;

    private SubResourcePrivateConstructor() {
        whichConstructor = "private";
    }

    private SubResourcePrivateConstructor(String s) {
        whichConstructor = s;
    }

    public static Object getPrivateInstance(String query) {
        if (query == null) {
            return new SubResourcePrivateConstructor();
        }
        return new SubResourcePrivateConstructor(query);
    }

    @GET
    public String info() {
        return whichConstructor;
    }

    @Path("other")
    public SubResourcePackageConstructor other() {
        return new SubResourcePackageConstructor("subpackage");
    }
}

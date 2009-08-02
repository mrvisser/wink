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

package org.apache.wink.jaxrs.test.inheritance.carstorage;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path(value = "/carport")
public class Carport implements CarStorage {

    private static Set<String> cars = new HashSet<String>();

    public Response addCar(String licenseNum) {
        cars.add(licenseNum);
        Response resp = Response.ok().build();
        resp.getMetadata().putSingle("Invoked", "Carport.addCar");
        return resp;
    }

    public Response getCars() {
        StringBuffer sb = new StringBuffer();
        for (String car : cars) {
            sb.append(car).append(";");
        }
        Response resp = Response.ok(sb.toString()).build();
        resp.getMetadata().putSingle("Invoked", "Carport.getCars");
        return resp;
    }

    public static void clear() {
        cars.clear();
    }

}

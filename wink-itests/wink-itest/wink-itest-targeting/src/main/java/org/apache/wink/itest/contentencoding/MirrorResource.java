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

package org.apache.wink.itest.contentencoding;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/bigbook")
public class MirrorResource {

    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    public String postBigBook(String postingBigBook) throws UnsupportedEncodingException {
        return postingBigBook + "helloworld";
    }

    @POST
    @Path("/mirror")
    @Produces("text/plain")
    public byte[] postBigBook(byte[] postingBigBook) throws UnsupportedEncodingException {
        return postingBigBook;
    }
}

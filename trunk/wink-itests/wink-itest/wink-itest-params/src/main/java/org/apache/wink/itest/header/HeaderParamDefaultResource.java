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

package org.apache.wink.itest.header;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/params/headerparam/default")
public class HeaderParamDefaultResource {

    private String customConstructorHeaderParam;

    private String customPropertyHeaderParam;

    private String agent;

    @DefaultValue("english")
    @HeaderParam("Accept-Language")
    private String acceptLanguageHeaderParam;

    public HeaderParamDefaultResource(@DefaultValue("MyCustomConstructorHeader") @HeaderParam("CustomConstructorHeader") String cstrHeaderParam) {
        this.customConstructorHeaderParam = cstrHeaderParam;
    }

    public Response info(String customMethodHeader) {
        Response r =
            Response.status(Status.OK).header("RespCustomConstructorHeader",
                                              customConstructorHeaderParam)
                .header("RespAccept-Language", acceptLanguageHeaderParam)
                .header("RespCustomMethodHeader", customMethodHeader)
                .header("RespUserAgent", agent).header("RespCustomPropertyHeader",
                                                       customPropertyHeaderParam).build();
        return r;
    }

    @DefaultValue("MyAgent")
    @HeaderParam("User-Agent")
    public void setUserAgent(String aUserAgent) {
        agent = aUserAgent;
    }

    public String getUserAgent() {
        return agent;
    }

    @DefaultValue("MyCustomPropertyHeader")
    @HeaderParam("CustomPropertyHeader")
    public void setCustomPropertyHeader(String customProperty) {
        customPropertyHeaderParam = customProperty;
    }

    public String getCustomPropertyHeader() {
        return customPropertyHeaderParam;
    }

    @GET
    public Response getHeaderParam(@DefaultValue("MyCustomMethodHeader") @HeaderParam("CustomMethodHeader") String c) {
        return info(c);
    }

    @POST
    public Response postHeaderParam(@DefaultValue("MyCustomMethodHeader") @HeaderParam("CustomMethodHeader") String c) {
        return info(c);
    }

    @PUT
    public Response putHeaderParam(@DefaultValue("MyCustomMethodHeader") @HeaderParam("CustomMethodHeader") String c) {
        return info(c);
    }

    @DELETE
    public Response deleteHeaderParam(@DefaultValue("MyCustomMethodHeader") @HeaderParam("CustomMethodHeader") String c) {
        return info(c);
    }

    /* FIXME: Check if ResponseBuilder header values can be null */
}

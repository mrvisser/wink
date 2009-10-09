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

package org.apache.wink.itest.readers;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;

@Provider
public class MessageBodyReaderGenericEntityTypeQueue implements MessageBodyReader<Queue> {

    @Context
    private Providers providers;

    public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
        if (arg1 instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType)arg1;
            Type[] actualArgumentTypes = pt.getActualTypeArguments();
            return actualArgumentTypes != null && actualArgumentTypes.length == 1
                && String.class.equals(actualArgumentTypes[0]);
        }
        return false;
    }

    public Queue readFrom(Class<Queue> arg0,
                          Type arg1,
                          Annotation[] arg2,
                          MediaType arg3,
                          MultivaluedMap<String, String> arg4,
                          InputStream arg5) throws IOException, WebApplicationException {
        String str = null;
        try {
            MessageBodyReader<String> strReader =
                providers.getMessageBodyReader(String.class,
                                               String.class,
                                               arg2,
                                               MediaType.TEXT_PLAIN_TYPE);
            str = strReader.readFrom(String.class, String.class, arg2, arg3, arg4, arg5);
        } catch (IOException e) {
            throw new WebApplicationException(e);
        }
        return new ArrayDeque<String>(Arrays.asList(str.split("\r\n")));
    }

}

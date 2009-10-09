/*******************************************************************************
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
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.24 at 01:47:17 PM IDT 
//

package org.apache.wink.common.internal.model.admin;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * org.apache.wink.common.internal.model.admin.resource package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * org.apache.wink.common.internal.model.admin.resource
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubResource }
     */
    public SubResource createSubResource() {
        return new SubResource();
    }

    /**
     * Create an instance of {@link ProducedMediaTypes }
     */
    public ProducedMediaTypes createProducedMediaTypes() {
        return new ProducedMediaTypes();
    }

    /**
     * Create an instance of {@link SubResources }
     */
    public SubResources createSubResources() {
        return new SubResources();
    }

    /**
     * Create an instance of {@link Methods.Method }
     */
    public Methods.Method createMethodsMethod() {
        return new Methods.Method();
    }

    /**
     * Create an instance of {@link Registry }
     */
    public Registry createRegistry() {
        return new Registry();
    }

    /**
     * Create an instance of {@link AcceptMediaTypes }
     */
    public AcceptMediaTypes createAcceptMediaTypes() {
        return new AcceptMediaTypes();
    }

    /**
     * Create an instance of {@link Methods }
     */
    public Methods createMethods() {
        return new Methods();
    }

    /**
     * Create an instance of {@link Parameter }
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link Resource }
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link Resources }
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link MatrixParameters }
     */
    public MatrixParameters createMatrixParameters() {
        return new MatrixParameters();
    }

    /**
     * Create an instance of {@link QueryParameters }
     */
    public QueryParameters createQueryParameters() {
        return new QueryParameters();
    }

}

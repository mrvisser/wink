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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.05.27 at 11:24:25 AM IDT 
//

package org.apache.wink.common.model.atom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.apache.wink.common.model.atom package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Content_QNAME  =
                                                   new QName("http://www.w3.org/2005/Atom",
                                                             "content");
    private final static QName _Title_QNAME    = new QName("http://www.w3.org/2005/Atom", "title");
    private final static QName _Feed_QNAME     = new QName("http://www.w3.org/2005/Atom", "feed");
    private final static QName _Category_QNAME =
                                                   new QName("http://www.w3.org/2005/Atom",
                                                             "category");
    private final static QName _Entry_QNAME    = new QName("http://www.w3.org/2005/Atom", "entry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.apache.wink.common.model.atom
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtomText }
     */
    public AtomText createAtomText() {
        return new AtomText();
    }

    /**
     * Create an instance of {@link AtomLink }
     */
    public AtomLink createAtomLink() {
        return new AtomLink();
    }

    /**
     * Create an instance of {@link AtomPerson }
     */
    public AtomPerson createAtomPerson() {
        return new AtomPerson();
    }

    /**
     * Create an instance of {@link AtomCommonAttributesSimpleContent }
     */
    public AtomCommonAttributesSimpleContent createAtomCommonAttributesSimpleContent() {
        return new AtomCommonAttributesSimpleContent();
    }

    /**
     * Create an instance of {@link AtomEntry }
     */
    public AtomEntry createAtomEntry() {
        return new AtomEntry();
    }

    /**
     * Create an instance of {@link AtomCommonAttributes }
     */
    public AtomCommonAttributes createAtomCommonAttributes() {
        return new AtomCommonAttributes();
    }

    /**
     * Create an instance of {@link AtomFeed }
     */
    public AtomFeed createAtomFeed() {
        return new AtomFeed();
    }

    /**
     * Create an instance of {@link AtomGenerator }
     */
    public AtomGenerator createAtomGenerator() {
        return new AtomGenerator();
    }

    /**
     * Create an instance of {@link AtomContent }
     */
    public AtomContent createAtomContent() {
        return new AtomContent();
    }

    /**
     * Create an instance of {@link AtomCategory }
     */
    public AtomCategory createAtomCategory() {
        return new AtomCategory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomContent }
     * {@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "content")
    public JAXBElement<AtomContent> createContent(AtomContent value) {
        return new JAXBElement<AtomContent>(_Content_QNAME, AtomContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomText }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "title")
    public JAXBElement<AtomText> createTitle(AtomText value) {
        return new JAXBElement<AtomText>(_Title_QNAME, AtomText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomFeed }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "feed")
    public JAXBElement<AtomFeed> createFeed(AtomFeed value) {
        return new JAXBElement<AtomFeed>(_Feed_QNAME, AtomFeed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomCategory }
     * {@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "category")
    public JAXBElement<AtomCategory> createCategory(AtomCategory value) {
        return new JAXBElement<AtomCategory>(_Category_QNAME, AtomCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomEntry }
     * {@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "entry")
    public JAXBElement<AtomEntry> createEntry(AtomEntry value) {
        return new JAXBElement<AtomEntry>(_Entry_QNAME, AtomEntry.class, null, value);
    }

}

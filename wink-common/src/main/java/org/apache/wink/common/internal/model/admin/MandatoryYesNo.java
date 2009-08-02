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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MandatoryYesNo.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name=&quot;MandatoryYesNo&quot;&gt;
 *   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;&gt;
 *     &lt;enumeration value=&quot;yes&quot;/&gt;
 *     &lt;enumeration value=&quot;no&quot;/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MandatoryYesNo")
@XmlEnum
public enum MandatoryYesNo {

    @XmlEnumValue("yes")
    YES("yes"), @XmlEnumValue("no")
    NO("no");
    private final String value;

    MandatoryYesNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MandatoryYesNo fromValue(String v) {
        for (MandatoryYesNo c : MandatoryYesNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

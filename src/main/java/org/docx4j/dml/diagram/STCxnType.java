/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.diagram;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_CxnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_CxnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="parOf"/>
 *     &lt;enumeration value="presOf"/>
 *     &lt;enumeration value="presParOf"/>
 *     &lt;enumeration value="unknownRelationship"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_CxnType")
@XmlEnum
public enum STCxnType {


    /**
     * Parent Of
     * 
     */
    @XmlEnumValue("parOf")
    PAR_OF("parOf"),

    /**
     * Presentation Of
     * 
     */
    @XmlEnumValue("presOf")
    PRES_OF("presOf"),

    /**
     * Presentation Parent Of
     * 
     */
    @XmlEnumValue("presParOf")
    PRES_PAR_OF("presParOf"),

    /**
     * Unknown Relationship
     * 
     */
    @XmlEnumValue("unknownRelationship")
    UNKNOWN_RELATIONSHIP("unknownRelationship");
    private final String value;

    STCxnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STCxnType fromValue(String v) {
        for (STCxnType c: STCxnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/*
 * An XML document type.
 * Localname: length
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one length(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class LengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument {
    private static final long serialVersionUID = 1L;

    public LengthDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "length"),
    };


    /**
     * Gets the "length" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "length" element
     */
    public void setLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet length) {
        generatedSetterHelperImpl(length, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "length" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

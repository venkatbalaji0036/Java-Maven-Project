/*
 * XML Type:  derivationSet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML derivationSet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet$Member
 *     org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet$Member2
 */
public class DerivationSetImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet, org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet.Member, org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet.Member2 {
    private static final long serialVersionUID = 1L;

    public DerivationSetImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected DerivationSetImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet.Member {
        private static final long serialVersionUID = 1L;

        public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.apache.xmlbeans.impl.xb.xsdschema.ReducedDerivationControl.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet.Member2 {
        private static final long serialVersionUID = 1L;

        public MemberImpl2(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}

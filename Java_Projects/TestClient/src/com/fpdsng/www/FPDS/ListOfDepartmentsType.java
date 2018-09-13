/**
 * ListOfDepartmentsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfDepartmentsType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.DepartmentType[] department;

    public ListOfDepartmentsType() {
    }

    public ListOfDepartmentsType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.DepartmentType[] department) {
        super(
            count);
        this.department = department;
    }


    /**
     * Gets the department value for this ListOfDepartmentsType.
     * 
     * @return department
     */
    public com.fpdsng.www.FPDS.DepartmentType[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ListOfDepartmentsType.
     * 
     * @param department
     */
    public void setDepartment(com.fpdsng.www.FPDS.DepartmentType[] department) {
        this.department = department;
    }

    public com.fpdsng.www.FPDS.DepartmentType getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, com.fpdsng.www.FPDS.DepartmentType _value) {
        this.department[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfDepartmentsType)) return false;
        ListOfDepartmentsType other = (ListOfDepartmentsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListOfDepartmentsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfDepartmentsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

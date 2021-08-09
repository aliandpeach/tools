package com.ews.exchange;

import javax.xml.stream.*;

public class RetentionTag
{
    private boolean a;
    private String b;
    
    public RetentionTag() {
    }
    
    public RetentionTag(final String value, final boolean isExplicit) {
        this.b = value;
        this.a = isExplicit;
    }
    
    RetentionTag(final XMLStreamReader reader) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "IsExplicit")) != null && attributeValue.length() > 0) {
            this.a = attributeValue.toLowerCase().equals("true");
        }
        this.b = reader.getElementText();
    }
    
    final String a(String string) {
        final String s = "";
        String s2;
        if (this.a) {
            s2 = s + " IsExplicit=\"true\"";
        }
        else {
            s2 = s + " IsExplicit=\"false\"";
        }
        return string = "<t:" + string + s2 + ">" + d.a(this.b) + "</t:" + string + ">";
    }
    
    public boolean isExplicit() {
        return this.a;
    }
    
    public void setExplicit(final boolean isExplicit) {
        this.a = isExplicit;
    }
    
    public String getValue() {
        return this.b;
    }
    
    public void setValue(final String value) {
        this.b = value;
    }
}

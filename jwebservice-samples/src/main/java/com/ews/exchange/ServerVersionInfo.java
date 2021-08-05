package com.ews.exchange;

import javax.xml.stream.*;

public class ServerVersionInfo
{
    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    
    ServerVersionInfo() {
    }
    
    ServerVersionInfo(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        final String attributeValue = xmlStreamReader.getAttributeValue(null, "MajorVersion");
        final String attributeValue2 = xmlStreamReader.getAttributeValue(null, "MinorVersion");
        final String attributeValue3 = xmlStreamReader.getAttributeValue(null, "MajorBuildNumber");
        final String attributeValue4 = xmlStreamReader.getAttributeValue(null, "MinorBuildNumber");
        this.e = xmlStreamReader.getAttributeValue(null, "Version");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.a = Integer.parseInt(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.b = Integer.parseInt(attributeValue2);
        }
        if (attributeValue3 != null && attributeValue3.length() > 0) {
            this.c = Integer.parseInt(attributeValue3);
        }
        if (attributeValue4 != null && attributeValue4.length() > 0) {
            this.d = Integer.parseInt(attributeValue4);
        }
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("ServerVersionInfo") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    public int getMajorVersion() {
        return this.a;
    }
    
    public int getMinorVersion() {
        return this.b;
    }
    
    public int getMajorBuildNumber() {
        return this.c;
    }
    
    public int getMinorBuildNumber() {
        return this.d;
    }
    
    public String getVersion() {
        return this.e;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class Period
{
    private Duration a;
    private String b;
    private String c;
    
    Period() {
    }
    
    Period(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.b = xmlStreamReader.getAttributeValue(null, "Name");
        this.c = xmlStreamReader.getAttributeValue(null, "Id");
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "Bias")) != null && attributeValue.length() > 0) {
            this.a = Duration.parse(attributeValue);
        }
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("Period") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "";
        if (this.a != null) {
            s = s + " Bias=\"" + this.a.toString() + "\"";
        }
        if (this.b != null) {
            s = s + " Name=\"" + d.a(this.b) + "\"";
        }
        if (this.c != null) {
            s = s + " Id=\"" + d.a(this.c) + "\"";
        }
        return "<t:Period" + s + "/>";
    }
    
    public Duration getBias() {
        return this.a;
    }
    
    public String getName() {
        return this.b;
    }
    
    public String getId() {
        return this.c;
    }
}

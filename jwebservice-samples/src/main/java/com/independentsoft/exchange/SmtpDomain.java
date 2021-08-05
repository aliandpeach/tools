package com.independentsoft.exchange;

import javax.xml.stream.*;

public class SmtpDomain
{
    private String a;
    private boolean b;
    
    private SmtpDomain() {
    }
    
    SmtpDomain(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.a = xmlStreamReader.getAttributeValue(null, "Name");
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "IncludeSubdomains")) != null && attributeValue.length() > 0) {
            this.b = Boolean.parseBoolean(attributeValue);
        }
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("Domain") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    public String getName() {
        return this.a;
    }
    
    public boolean getIncludeSubdomains() {
        return this.b;
    }
}

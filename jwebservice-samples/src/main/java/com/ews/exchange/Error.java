package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Error
{
    private Date a;
    private String b;
    private String c;
    private String d;
    private String e;
    
    public Error() {
    }
    
    Error(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        this.b = xmlStreamReader.getAttributeValue(null, "Id");
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "Time")) != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.d.c(attributeValue);
        }
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DebugData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                this.e = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Error") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public Date getTime() {
        return this.a;
    }
    
    public String getId() {
        return this.b;
    }
    
    public String getCode() {
        return this.c;
    }
    
    public String getMessage() {
        return this.d;
    }
    
    public String getDebugData() {
        return this.e;
    }
}

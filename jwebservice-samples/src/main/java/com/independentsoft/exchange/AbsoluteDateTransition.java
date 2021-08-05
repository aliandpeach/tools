package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class AbsoluteDateTransition extends Transition
{
    private Date c;
    
    public AbsoluteDateTransition() {
    }
    
    AbsoluteDateTransition(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("To") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String attributeValue;
                if ((attributeValue = reader.getAttributeValue(null, "Kind")) != null && attributeValue.length() > 0) {
                    this.a = com.independentsoft.exchange.a.f(attributeValue);
                }
                this.b = reader.getElementText();
            }
            else {
                final String elementText;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.c = d.c(elementText);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AbsoluteDateTransition") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:AbsoluteDateTransition>" + "<t:To Kind=\"" + com.independentsoft.exchange.a.a(this.a) + "\">";
        if (this.b != null) {
            s += d.a(this.b);
        }
        String s2 = s + "</t:To>";
        if (this.c != null) {
            s2 = s2 + "<t:DateTime>" + d.a(this.c) + "</t:DateTime>";
        }
        return s2 + "</t:AbsoluteDateTransition>";
    }
    
    public Date getDate() {
        return this.c;
    }
    
    public void setDate(final Date date) {
        this.c = date;
    }
}

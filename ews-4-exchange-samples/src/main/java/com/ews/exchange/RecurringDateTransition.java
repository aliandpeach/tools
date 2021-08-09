package com.ews.exchange;

import javax.xml.stream.*;

public class RecurringDateTransition extends Transition
{
    private Duration c;
    private Month d;
    private int e;
    
    public RecurringDateTransition() {
        this.d = Month.NONE;
        this.e = -1;
    }
    
    RecurringDateTransition(final XMLStreamReader reader) throws XMLStreamException {
        this.d = Month.NONE;
        this.e = -1;
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("To") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String attributeValue;
                if ((attributeValue = reader.getAttributeValue(null, "Kind")) != null && attributeValue.length() > 0) {
                    this.a = com.ews.exchange.a.f(attributeValue);
                }
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TimeOffset") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.c = Duration.parse(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Month") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.d = com.ews.exchange.a.s(elementText2);
                }
            }
            else {
                final String elementText3;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Day") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.e = Integer.parseInt(elementText3);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurringDateTransition") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:RecurringDateTransition>" + "<t:To Kind=\"" + com.ews.exchange.a.a(this.a) + "\">";
        if (this.b != null) {
            s += com.ews.exchange.d.a(this.b);
        }
        String s2 = s + "</t:To>";
        if (this.c != null) {
            s2 = s2 + "<t:TimeOffset>" + this.c.toString() + "</t:TimeOffset>";
        }
        if (this.d != Month.NONE) {
            s2 = s2 + "<t:Month>" + com.ews.exchange.a.a(this.d) + "</t:Month>";
        }
        if (this.e >= 0) {
            s2 = s2 + "<t:Day>" + this.e + "</t:Day>";
        }
        return s2 + "</t:RecurringDateTransition>";
    }
    
    public Duration getTimeOffset() {
        return this.c;
    }
    
    public void setTimeOffset(final Duration timeOffset) {
        this.c = timeOffset;
    }
    
    public Month getMonth() {
        return this.d;
    }
    
    public void getMonth(final Month month) {
        this.d = month;
    }
    
    public int getDay() {
        return this.e;
    }
    
    public void setDay(final int day) {
        this.e = day;
    }
}

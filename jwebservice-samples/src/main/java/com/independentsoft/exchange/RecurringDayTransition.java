package com.independentsoft.exchange;

import javax.xml.stream.*;

public class RecurringDayTransition extends Transition
{
    private Duration c;
    private Month d;
    private DayOfWeek e;
    private int f;
    
    public RecurringDayTransition() {
        this.d = Month.NONE;
        this.e = DayOfWeek.NONE;
        this.f = -2;
    }
    
    RecurringDayTransition(final XMLStreamReader reader) throws XMLStreamException {
        this.d = Month.NONE;
        this.e = DayOfWeek.NONE;
        this.f = -2;
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("To") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String attributeValue;
                if ((attributeValue = reader.getAttributeValue(null, "Kind")) != null && attributeValue.length() > 0) {
                    this.a = com.independentsoft.exchange.a.f(attributeValue);
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
                    this.d = com.independentsoft.exchange.a.k(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DayOfWeek") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.e = com.independentsoft.exchange.a.q(elementText3);
                }
            }
            else {
                final String elementText4;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Occurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.f = Integer.parseInt(elementText4);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurringDayTransition") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:RecurringDayTransition>" + "<t:To Kind=\"" + com.independentsoft.exchange.a.a(this.a) + "\">";
        if (this.b != null) {
            s += com.independentsoft.exchange.d.a(this.b);
        }
        String s2 = s + "</t:To>";
        if (this.c != null) {
            s2 = s2 + "<t:TimeOffset>" + this.c.toString() + "</t:TimeOffset>";
        }
        if (this.d != Month.NONE) {
            s2 = s2 + "<t:Month>" + com.independentsoft.exchange.a.a(this.d) + "</t:Month>";
        }
        if (this.e != DayOfWeek.NONE) {
            s2 = s2 + "<t:DayOfWeek>" + com.independentsoft.exchange.a.a(this.e) + "</t:DayOfWeek>";
        }
        if (this.f > -2) {
            s2 = s2 + "<t:Occurrence>" + this.f + "</t:Occurrence>";
        }
        return s2 + "</t:RecurringDayTransition>";
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
    
    public DayOfWeek getDayOfWeek() {
        return this.e;
    }
    
    public void getDayOfWeek(final DayOfWeek dayOfWeek) {
        this.e = dayOfWeek;
    }
    
    public int getOccurrence() {
        return this.f;
    }
    
    public void setOccurrence(final int occurrence) {
        this.f = occurrence;
    }
}

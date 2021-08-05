package com.independentsoft.exchange;

import javax.xml.stream.*;

public class SerializableTimeZoneTime
{
    private int a;
    private Time b;
    private DayOrder c;
    private Month d;
    private DayOfWeek e;
    private String f;
    
    public SerializableTimeZoneTime() {
        this.b = new Time();
        this.c = DayOrder.FIRST;
        this.d = Month.NONE;
        this.e = DayOfWeek.MONDAY;
    }
    
    public SerializableTimeZoneTime(final int offset, final Time time, final DayOrder dayOrder, final Month month, final DayOfWeek dayOfWeek) {
        this.b = new Time();
        this.c = DayOrder.FIRST;
        this.d = Month.NONE;
        this.e = DayOfWeek.MONDAY;
        this.a = offset;
        this.b = time;
        this.c = dayOrder;
        this.d = month;
        this.e = dayOfWeek;
    }
    
    public SerializableTimeZoneTime(final int offset, final Time time, final DayOrder dayOrder, final Month month, final DayOfWeek dayOfWeek, final String year) {
        this.b = new Time();
        this.c = DayOrder.FIRST;
        this.d = Month.NONE;
        this.e = DayOfWeek.MONDAY;
        this.a = offset;
        this.b = time;
        this.c = dayOrder;
        this.d = month;
        this.e = dayOfWeek;
        this.f = year;
    }
    
    SerializableTimeZoneTime(final XMLStreamReader reader, final String localName) throws XMLStreamException {
        this.b = new Time();
        this.c = DayOrder.FIRST;
        this.d = Month.NONE;
        this.e = DayOfWeek.MONDAY;
        this.a(reader, localName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Bias") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Time") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = new Time(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOrder") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    final String s2;
                    this.c = ((s2 = elementText3).equals("1") ? DayOrder.FIRST : (s2.equals("2") ? DayOrder.SECOND : (s2.equals("3") ? DayOrder.THIRD : (s2.equals("4") ? DayOrder.FOURTH : DayOrder.LAST))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Month") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.d = com.independentsoft.exchange.a.k(elementText4);
                }
            }
            else {
                final String elementText5;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfWeek") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.e = com.independentsoft.exchange.a.q(elementText5);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a(final String s) {
        String s2 = "<t:" + s + ">" + "<t:Bias>" + this.a + "</t:Bias>";
        if (this.b != null) {
            s2 += this.b.toString();
        }
        final DayOrder c;
        String s3 = s2 + "<t:DayOrder>" + (((c = this.c) == DayOrder.FIRST) ? "1" : ((c == DayOrder.SECOND) ? "2" : ((c == DayOrder.THIRD) ? "3" : ((c == DayOrder.FOURTH) ? "4" : "5")))) + "</t:DayOrder>" + "<t:Month>" + com.independentsoft.exchange.a.a(this.d) + "</t:Month>" + "<t:DayOfWeek>" + com.independentsoft.exchange.a.a(this.e) + "</t:DayOfWeek>";
        if (this.f != null) {
            s3 = s3 + "<t:Year>" + com.independentsoft.exchange.d.a(this.f) + "</t:Year>";
        }
        return s3 + "</t:" + s + ">";
    }
    
    public int getOffset() {
        return this.a;
    }
    
    public void setOffset(final int offset) {
        this.a = offset;
    }
    
    public Time getTime() {
        return this.b;
    }
    
    public void setTime(final Time time) {
        this.b = time;
    }
    
    public DayOrder getDayOrder() {
        return this.c;
    }
    
    public void setDayOrder(final DayOrder dayOrder) {
        this.c = dayOrder;
    }
    
    public Month getMonth() {
        return this.d;
    }
    
    public void setMonth(final Month month) {
        this.d = month;
    }
    
    public DayOfWeek getDayOfWeek() {
        return this.e;
    }
    
    public void setDayOfWeek(final DayOfWeek dayOfWeek) {
        this.e = dayOfWeek;
    }
    
    public String getYear() {
        return this.f;
    }
    
    public void setYear(final String year) {
        this.f = year;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class AbsoluteYearlyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern
{
    private int a;
    private Month b;
    
    public AbsoluteYearlyRecurrencePattern() {
        this.b = Month.NONE;
    }
    
    public AbsoluteYearlyRecurrencePattern(final Month month, final int dayOfMonth) {
        this.b = Month.NONE;
        this.b = month;
        this.a = dayOfMonth;
    }
    
    AbsoluteYearlyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.b = Month.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfMonth") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Month") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = com.independentsoft.exchange.a.s(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteYearlyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:AbsoluteYearlyRecurrence>";
        if (this.a > 0) {
            s = s + "<t:DayOfMonth>" + this.a + "</t:DayOfMonth>";
        }
        if (this.b != Month.NONE) {
            s = s + "<t:Month>" + com.independentsoft.exchange.a.b(this.b) + "</t:Month>";
        }
        return s + "</t:AbsoluteYearlyRecurrence>";
    }
    
    public int getDayOfMonth() {
        return this.a;
    }
    
    public void setDayOfMonth(final int dayOfMonth) {
        this.a = dayOfMonth;
    }
    
    public Month getMonth() {
        return this.b;
    }
    
    public void setMonth(final Month month) {
        this.b = month;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class AbsoluteMonthlyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern
{
    private int a;
    private int b;
    
    public AbsoluteMonthlyRecurrencePattern() {
    }
    
    public AbsoluteMonthlyRecurrencePattern(final int interval, final int dayOfMonth) {
        this.a = interval;
        this.b = dayOfMonth;
    }
    
    AbsoluteMonthlyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Interval") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfMonth") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Integer.parseInt(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteMonthlyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:AbsoluteMonthlyRecurrence>";
        if (this.a > 0) {
            s = s + "<t:Interval>" + this.a + "</t:Interval>";
        }
        if (this.b > 0) {
            s = s + "<t:DayOfMonth>" + this.b + "</t:DayOfMonth>";
        }
        return s + "</t:AbsoluteMonthlyRecurrence>";
    }
    
    public int getInterval() {
        return this.a;
    }
    
    public void setInterval(final int interval) {
        this.a = interval;
    }
    
    public int getDayOfMonth() {
        return this.b;
    }
    
    public void setDayOfMonth(final int dayOfMonth) {
        this.b = dayOfMonth;
    }
}

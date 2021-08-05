package com.independentsoft.exchange;

import javax.xml.stream.*;

public class DailyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern
{
    private int a;
    
    public DailyRecurrencePattern() {
    }
    
    public DailyRecurrencePattern(final int interval) {
        this.a = interval;
    }
    
    DailyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            final String elementText;
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Interval") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                this.a = Integer.parseInt(elementText);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DailyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "<t:DailyRecurrence>";
        if (this.a > 0) {
            string = string + "<t:Interval>" + this.a + "</t:Interval>";
        }
        return string + "</t:DailyRecurrence>";
    }
    
    public int getInterval() {
        return this.a;
    }
    
    public void setInterval(final int interval) {
        this.a = interval;
    }
}

package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class WeeklyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern
{
    private int a;
    private List<DayOfWeek> b;
    
    public WeeklyRecurrencePattern() {
        this.b = new ArrayList<DayOfWeek>();
    }
    
    public WeeklyRecurrencePattern(final int interval) {
        this.b = new ArrayList<DayOfWeek>();
        this.a = interval;
    }
    
    public WeeklyRecurrencePattern(final int interval, final List<DayOfWeek> days) {
        this.b = new ArrayList<DayOfWeek>();
        this.a = interval;
        this.b = days;
    }
    
    WeeklyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<DayOfWeek>();
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
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DaysOfWeek") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    final String[] split = elementText2.split(" ");
                    for (int i = 0; i < split.length; ++i) {
                        if (split[i] != null && split[i].length() > 0) {
                            this.b.add(com.independentsoft.exchange.a.q(split[i]));
                        }
                    }
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WeeklyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:WeeklyRecurrence>";
        if (this.a > 0) {
            s = s + "<t:Interval>" + this.a + "</t:Interval>";
        }
        if (this.b.size() > 0) {
            String s2 = s + "<t:DaysOfWeek>";
            for (int i = 0; i < this.b.size(); ++i) {
                s2 += com.independentsoft.exchange.a.a(this.b.get(i));
                if (i < this.b.size() - 1) {
                    s2 += " ";
                }
            }
            s = s2 + "</t:DaysOfWeek>";
        }
        return s + "</t:WeeklyRecurrence>";
    }
    
    public int getInterval() {
        return this.a;
    }
    
    public void setInterval(final int interval) {
        this.a = interval;
    }
    
    public List<DayOfWeek> getDays() {
        return this.b;
    }
}

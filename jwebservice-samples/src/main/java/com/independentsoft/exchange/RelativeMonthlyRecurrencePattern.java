package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class RelativeMonthlyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern
{
    private int a;
    private List<DayOfWeek> b;
    private DayOfWeekIndex c;
    
    public RelativeMonthlyRecurrencePattern() {
        this.b = new ArrayList<DayOfWeek>();
        this.c = DayOfWeekIndex.NONE;
    }
    
    public RelativeMonthlyRecurrencePattern(final int interval, final List<DayOfWeek> days, final DayOfWeekIndex dayIndex) {
        this.b = new ArrayList<DayOfWeek>();
        this.c = DayOfWeekIndex.NONE;
        this.a = interval;
        this.b = days;
        this.c = dayIndex;
    }
    
    RelativeMonthlyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<DayOfWeek>();
        this.c = DayOfWeekIndex.NONE;
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
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DaysOfWeek") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    final String[] split = elementText2.split(" ");
                    for (int i = 0; i < split.length; ++i) {
                        if (split[i] != null && split[i].length() > 0) {
                            this.b.add(com.independentsoft.exchange.a.q(split[i]));
                        }
                    }
                }
            }
            else {
                final String elementText3;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfWeekIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = com.independentsoft.exchange.a.r(elementText3);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RelativeMonthlyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:RelativeMonthlyRecurrence>";
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
        if (this.c != DayOfWeekIndex.NONE) {
            s = s + "<t:DayOfWeekIndex>" + com.independentsoft.exchange.a.a(this.c) + "</t:DayOfWeekIndex>";
        }
        return s + "</t:RelativeMonthlyRecurrence>";
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
    
    public DayOfWeekIndex getDayIndex() {
        return this.c;
    }
    
    public void setDayIndex(final DayOfWeekIndex dayIndex) {
        this.c = dayIndex;
    }
}

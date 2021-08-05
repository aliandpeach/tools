package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class RelativeYearlyRecurrencePattern implements RecurrencePattern, TaskRecurrencePattern, TimeChangePattern
{
    private List<DayOfWeek> a;
    private DayOfWeekIndex b;
    private Month c;
    
    public RelativeYearlyRecurrencePattern() {
        this.a = new ArrayList<DayOfWeek>();
        this.b = DayOfWeekIndex.NONE;
        this.c = Month.NONE;
    }
    
    public RelativeYearlyRecurrencePattern(final Month month, final List<DayOfWeek> days, final DayOfWeekIndex dayIndex) {
        this.a = new ArrayList<DayOfWeek>();
        this.b = DayOfWeekIndex.NONE;
        this.c = Month.NONE;
        this.c = month;
        this.a = days;
        this.b = dayIndex;
    }
    
    RelativeYearlyRecurrencePattern(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<DayOfWeek>();
        this.b = DayOfWeekIndex.NONE;
        this.c = Month.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DaysOfWeek") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String[] split = elementText.split(" ");
                    for (int i = 0; i < split.length; ++i) {
                        if (split[i] != null && split[i].length() > 0) {
                            this.a.add(com.independentsoft.exchange.a.q(split[i]));
                        }
                    }
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfWeekIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = com.independentsoft.exchange.a.r(elementText2);
                }
            }
            else {
                final String elementText3;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Month") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = com.independentsoft.exchange.a.s(elementText3);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RelativeYearlyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:RelativeYearlyRecurrence>";
        if (this.a.size() > 0) {
            String s2 = s + "<t:DaysOfWeek>";
            for (int i = 0; i < this.a.size(); ++i) {
                s2 += com.independentsoft.exchange.a.a(this.a.get(i));
                if (i < this.a.size() - 1) {
                    s2 += " ";
                }
            }
            s = s2 + "</t:DaysOfWeek>";
        }
        if (this.b != DayOfWeekIndex.NONE) {
            s = s + "<t:DayOfWeekIndex>" + com.independentsoft.exchange.a.a(this.b) + "</t:DayOfWeekIndex>";
        }
        if (this.c != Month.NONE) {
            s = s + "<t:Month>" + com.independentsoft.exchange.a.b(this.c) + "</t:Month>";
        }
        return s + "</t:RelativeYearlyRecurrence>";
    }
    
    public List<DayOfWeek> getDays() {
        return this.a;
    }
    
    public DayOfWeekIndex getDayIndex() {
        return this.b;
    }
    
    public void setDayIndex(final DayOfWeekIndex dayIndex) {
        this.b = dayIndex;
    }
    
    public Month getMonth() {
        return this.c;
    }
    
    public void setMonth(final Month month) {
        this.c = month;
    }
}

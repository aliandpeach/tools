package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class Recurrence
{
    private RecurrencePattern a;
    private RecurrenceRange b;
    
    public Recurrence() {
    }
    
    public Recurrence(final RecurrencePattern pattern) {
        this.a = pattern;
    }
    
    public Recurrence(final RecurrencePattern pattern, final RecurrenceRange range) {
        this.a = pattern;
        this.b = range;
    }
    
    Recurrence(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RelativeYearlyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new RelativeYearlyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AbsoluteYearlyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new AbsoluteYearlyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RelativeMonthlyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new RelativeMonthlyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AbsoluteMonthlyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new AbsoluteMonthlyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("WeeklyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new WeeklyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DailyRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new DailyRecurrencePattern(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NoEndRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new NoEndRecurrenceRange(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndDateRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new EndDateRecurrenceRange(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NumberedRecurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new NumberedRecurrenceRange(reader);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Recurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:Recurrence>";
        if (this.a != null) {
            s += this.a.toString();
        }
        if (this.b != null) {
            s += this.b.toString();
        }
        return s + "</t:Recurrence>";
    }
    
    public RecurrencePattern getPattern() {
        return this.a;
    }
    
    public void setPattern(final RecurrencePattern pattern) {
        this.a = pattern;
    }
    
    public RecurrenceRange getRange() {
        return this.b;
    }
    
    public void setRange(final RecurrenceRange range) {
        this.b = range;
    }
}

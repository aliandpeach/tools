package com.independentsoft.exchange;

import javax.xml.stream.*;
import java.text.*;

public class TimeChange
{
    private String a;
    private Duration b;
    private Time c;
    private TimeChangePattern d;
    
    public TimeChange() {
    }
    
    public TimeChange(final Duration offset) {
        this.b = offset;
    }
    
    public TimeChange(final int offsetHours) {
        this(offsetHours, 0);
    }
    
    public TimeChange(int offsetHours, int offsetMinutes) {
        this.b = new Duration();
        if (offsetHours < 0) {
            this.b.setNegative(true);
        }
        offsetHours = Math.abs(offsetHours);
        offsetMinutes = Math.abs(offsetMinutes);
        this.b.setHours(offsetHours);
        this.b.setMinutes(offsetMinutes);
    }
    
    TimeChange(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException, ParseException {
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException, ParseException {
        this.a = xmlStreamReader.getAttributeValue(null, "TimeZoneName");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Offset") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.b = Duration.parse(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Time") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.c = new Time(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RelativeYearlyRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new RelativeYearlyRecurrencePattern(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new AbsoluteDate(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a(final String s) {
        String string = "";
        if (this.a != null) {
            string = string + " TimeZoneName=\"" + com.independentsoft.exchange.d.a(this.a) + "\"";
        }
        String s2 = "<t:" + s + string + ">";
        if (this.b != null) {
            s2 = s2 + "<t:Offset>" + this.b.toString() + "</t:Offset>";
        }
        if (this.d != null) {
            s2 += this.d.toString();
        }
        if (this.c != null) {
            s2 += this.c.toString();
        }
        return s2 + "</t:" + s + ">";
    }
    
    public String getTimeZone() {
        return this.a;
    }
    
    public void setTimeZone(final String timeZone) {
        this.a = timeZone;
    }
    
    public Duration getOffset() {
        return this.b;
    }
    
    public void setOffset(final Duration offset) {
        this.b = offset;
    }
    
    public Time getTime() {
        return this.c;
    }
    
    public void setTime(final Time time) {
        this.c = time;
    }
    
    public TimeChangePattern getPattern() {
        return this.d;
    }
    
    public void setPattern(final TimeChangePattern pattern) {
        this.d = pattern;
    }
}

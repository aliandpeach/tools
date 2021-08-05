package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class TimeDuration
{
    private Date a;
    private Date b;
    
    public TimeDuration() {
    }
    
    public TimeDuration(final Date startTime, final Date endTime) {
        this.a = startTime;
        this.b = endTime;
    }
    
    TimeDuration(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException, ParseException {
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = d.c(elementText);
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = d.c(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a(final String s, final boolean b) {
        String s2 = "<t:" + s + ">";
        if (this.a != null) {
            if (b) {
                s2 = s2 + "<t:StartTime>" + d.a(this.a) + "</t:StartTime>";
            }
            else {
                s2 = s2 + "<t:StartTime>" + d.b(this.a) + "</t:StartTime>";
            }
        }
        if (this.b != null) {
            if (b) {
                s2 = s2 + "<t:EndTime>" + d.a(this.b) + "</t:EndTime>";
            }
            else {
                s2 = s2 + "<t:EndTime>" + d.b(this.b) + "</t:EndTime>";
            }
        }
        return s2 + "</t:" + s + ">";
    }
    
    public Date getStartTime() {
        return this.a;
    }
    
    public void setStartTime(final Date startTime) {
        this.a = startTime;
    }
    
    public Date getEndTime() {
        return this.b;
    }
    
    public void setEndTime(final Date endTime) {
        this.b = endTime;
    }
}

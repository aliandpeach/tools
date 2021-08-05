package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Flag
{
    private FlagStatus a;
    private Date b;
    private Date c;
    private Date d;
    
    public Flag() {
        this.a = FlagStatus.NONE;
    }
    
    public Flag(final FlagStatus status) {
        this.a = FlagStatus.NONE;
        this.a = status;
    }
    
    Flag(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = FlagStatus.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FlagStatus") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.independentsoft.exchange.a.K(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = com.independentsoft.exchange.d.c(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DueDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = com.independentsoft.exchange.d.c(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CompleteDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = com.independentsoft.exchange.d.c(xmlStreamReader.getElementText());
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Flag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:Flag>";
        if (this.a != FlagStatus.NONE) {
            final FlagStatus a;
            s = s + "<t:FlagStatus>" + (((a = this.a) == FlagStatus.COMPLETE) ? "Complete" : ((a == FlagStatus.MARKED) ? "Flagged" : "0")) + "</t:FlagStatus>";
        }
        if (this.b != null) {
            s = s + "<t:StartDate>" + com.independentsoft.exchange.d.a(this.b) + "</t:StartDate>";
        }
        if (this.c != null) {
            s = s + "<t:DueDate>" + com.independentsoft.exchange.d.a(this.c) + "</t:DueDate>";
        }
        if (this.d != null) {
            s = s + "<t:CompleteDate>" + com.independentsoft.exchange.d.a(this.d) + "</t:CompleteDate>";
        }
        return s + "</t:Flag>";
    }
    
    public String toString() {
        return this.a();
    }
    
    public FlagStatus getStatus() {
        return this.a;
    }
    
    public void setStatus(final FlagStatus status) {
        this.a = status;
    }
    
    public Date getStartDate() {
        return this.b;
    }
    
    public void setStartDate(final Date startDate) {
        this.b = startDate;
    }
    
    public Date getDueDate() {
        return this.c;
    }
    
    public void setDueDate(final Date dueDate) {
        this.c = dueDate;
    }
    
    public Date getCompleteDate() {
        return this.d;
    }
    
    public void setCompleteDate(final Date completeDate) {
        this.d = completeDate;
    }
}

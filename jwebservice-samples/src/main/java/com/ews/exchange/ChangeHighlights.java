package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class ChangeHighlights
{
    private boolean a;
    private String b;
    private boolean c;
    private Date d;
    private boolean e;
    private Date f;
    
    public ChangeHighlights() {
    }
    
    ChangeHighlights(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasLocationChanged") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Boolean.parseBoolean(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Location") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasStartTimeChanged") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.c = Boolean.parseBoolean(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Start") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.d = com.ews.exchange.d.c(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasEndTimeChanged") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.e = Boolean.parseBoolean(elementText4);
                }
            }
            else {
                final String elementText5;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("End") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.f = com.ews.exchange.d.c(elementText5);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ChangeHighlights") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public boolean hasLocationChanged() {
        return this.a;
    }
    
    public void setLocationChanged(final boolean hasLocationChanged) {
        this.a = hasLocationChanged;
    }
    
    public String getLocation() {
        return this.b;
    }
    
    public void setLocation(final String location) {
        this.b = location;
    }
    
    public boolean hasStartTimeChanged() {
        return this.c;
    }
    
    public void setStartTimeChanged(final boolean hasStartTimeChanged) {
        this.c = hasStartTimeChanged;
    }
    
    public Date getStartTime() {
        return this.d;
    }
    
    public void setStartTime(final Date startTime) {
        this.d = startTime;
    }
    
    public boolean hasEndTimeChanged() {
        return this.e;
    }
    
    public void setEndTimeChanged(final boolean hasEndTimeChanged) {
        this.e = hasEndTimeChanged;
    }
    
    public Date getEndTime() {
        return this.f;
    }
    
    public void setEndTime(final Date endTime) {
        this.f = endTime;
    }
}

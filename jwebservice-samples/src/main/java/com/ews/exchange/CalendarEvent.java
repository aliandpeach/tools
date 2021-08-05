package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class CalendarEvent
{
    private Date a;
    private Date b;
    private LegacyFreeBusy c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    
    public CalendarEvent() {
        this.c = LegacyFreeBusy.NONE;
    }
    
    CalendarEvent(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.c = LegacyFreeBusy.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.d.b(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = com.ews.exchange.d.b(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BusyType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = com.ews.exchange.a.I(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEventDetails") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ID") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Subject") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Location") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsMeeting") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText4;
                        if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                            this.g = Boolean.parseBoolean(elementText4);
                        }
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsRecurring") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText5;
                        if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                            this.h = Boolean.parseBoolean(elementText5);
                        }
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsException") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText6;
                        if ((elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                            this.i = Boolean.parseBoolean(elementText6);
                        }
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsReminderSet") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText7;
                        if ((elementText7 = xmlStreamReader.getElementText()) != null && elementText7.length() > 0) {
                            this.j = Boolean.parseBoolean(elementText7);
                        }
                    }
                    else {
                        final String elementText8;
                        if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsPrivate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText8 = xmlStreamReader.getElementText()) != null && elementText8.length() > 0) {
                            this.k = Boolean.parseBoolean(elementText8);
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEventDetails") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEvent") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public Date getStartTime() {
        return this.a;
    }
    
    public Date getEndTime() {
        return this.b;
    }
    
    public LegacyFreeBusy getLegacyFreeBusyStatus() {
        return this.c;
    }
    
    public String getId() {
        return this.d;
    }
    
    public String getSubject() {
        return this.e;
    }
    
    public String getLocation() {
        return this.f;
    }
    
    public boolean isMeeting() {
        return this.g;
    }
    
    public boolean isRecurring() {
        return this.h;
    }
    
    public boolean isException() {
        return this.i;
    }
    
    public boolean getReminderIsSet() {
        return this.j;
    }
    
    public boolean isPrivate() {
        return this.k;
    }
}

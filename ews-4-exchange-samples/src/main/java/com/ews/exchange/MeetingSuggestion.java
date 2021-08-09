package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class MeetingSuggestion
{
    private Position a;
    private String b;
    private String c;
    private String d;
    private Date e;
    private Date f;
    private List<EmailUser> g;
    
    public MeetingSuggestion() {
        this.a = Position.OTHER;
        this.g = new ArrayList<EmailUser>();
    }
    
    MeetingSuggestion(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = Position.OTHER;
        this.g = new ArrayList<EmailUser>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Position") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.a.v(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Location") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingString") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Subject") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.e = com.ews.exchange.d.c(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.f = com.ews.exchange.d.c(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EmailUser") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(new EmailUser(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingSuggestion") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public Position getPosition() {
        return this.a;
    }
    
    public String getLocation() {
        return this.b;
    }
    
    public String getMeeting() {
        return this.c;
    }
    
    public String getSubject() {
        return this.d;
    }
    
    public Date getStartTime() {
        return this.e;
    }
    
    public Date getEndTime() {
        return this.f;
    }
    
    public List<EmailUser> getAttendees() {
        return this.g;
    }
}

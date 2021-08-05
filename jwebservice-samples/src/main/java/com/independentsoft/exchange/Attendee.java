package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Attendee
{
    private Mailbox a;
    private ResponseType b;
    private Date c;
    
    public Attendee() {
        this.b = ResponseType.NONE;
    }
    
    public Attendee(final Mailbox mailbox) {
        this.b = ResponseType.NONE;
        this.a = mailbox;
    }
    
    public Attendee(final String emailAddress) {
        this(new Mailbox(emailAddress));
    }
    
    public Attendee(final String emailAddress, final String name) {
        this(new Mailbox(emailAddress, name));
    }
    
    public Attendee(final Mailbox mailbox, final ResponseType responseType) {
        this.b = ResponseType.NONE;
        this.a = mailbox;
        this.b = responseType;
    }
    
    public Attendee(final String emailAddress, final ResponseType responseType) {
        this(new Mailbox(emailAddress), responseType);
    }
    
    public Attendee(final String emailAddress, final String name, final ResponseType responseType) {
        this(new Mailbox(emailAddress, name), responseType);
    }
    
    Attendee(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.b = ResponseType.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.b = com.independentsoft.exchange.a.B(elementText);
                }
            }
            else {
                final String elementText2;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastResponseTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.c = d.c(elementText2);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendee") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:Attendee>";
        if (this.a != null) {
            s += this.a.a("t:Mailbox");
        }
        if (this.b != ResponseType.NONE) {
            final ResponseType b;
            s = s + "<t:ResponseType>" + (((b = this.b) == ResponseType.ACCEPT) ? "Accept" : ((b == ResponseType.DECLINE) ? "Decline" : ((b == ResponseType.NO_RESPONSE_RECEIVED) ? "NoResponseReceived" : ((b == ResponseType.ORGANIZER) ? "Organizer" : ((b == ResponseType.TENTATIVE) ? "Tentative" : ((b == ResponseType.UNKNOWN) ? "Unknown" : "None")))))) + "</t:ResponseType>";
        }
        return s + "</t:Attendee>";
    }
    
    public String toString() {
        if (this.a != null) {
            return this.a();
        }
        return super.toString();
    }
    
    public Mailbox getMailbox() {
        return this.a;
    }
    
    public void setMailbox(final Mailbox mailbox) {
        this.a = mailbox;
    }
    
    public ResponseType getResponseType() {
        return this.b;
    }
    
    public void setResponseType(final ResponseType responseType) {
        this.b = responseType;
    }
    
    public Date getLastResponseTime() {
        return this.c;
    }
}

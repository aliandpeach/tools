package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class OutOfOffice
{
    private OutOfOfficeState a;
    private ExternalAudience b;
    private TimeDuration c;
    private ReplyBody d;
    private ReplyBody e;
    
    public OutOfOffice() {
        this.a = OutOfOfficeState.ENABLED;
        this.b = ExternalAudience.ALL;
    }
    
    public OutOfOffice(final OutOfOfficeState state) {
        this.a = OutOfOfficeState.ENABLED;
        this.b = ExternalAudience.ALL;
        this.a = state;
    }
    
    OutOfOffice(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = OutOfOfficeState.ENABLED;
        this.b = ExternalAudience.ALL;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OofState") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.a = ((s = elementText).equals("Disabled") ? OutOfOfficeState.DISABLED : (s.equals("Enabled") ? OutOfOfficeState.ENABLED : OutOfOfficeState.SCHEDULED));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExternalAudience") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = com.ews.exchange.a.l(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Duration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new TimeDuration(reader, "Duration");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternalReply") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new ReplyBody(reader, "InternalReply");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExternalReply") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new ReplyBody(reader, "ExternalReply");
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OofSettings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        final OutOfOfficeState a;
        final ExternalAudience b;
        String s = "<t:UserOofSettings>" + "<t:OofState>" + (((a = this.a) == OutOfOfficeState.DISABLED) ? "Disabled" : ((a == OutOfOfficeState.ENABLED) ? "Enabled" : "Scheduled")) + "</t:OofState>" + "<t:ExternalAudience>" + (((b = this.b) == ExternalAudience.ALL) ? "All" : ((b == ExternalAudience.KNOWN) ? "Known" : "None")) + "</t:ExternalAudience>";
        if (this.c != null) {
            s += this.c.a("Duration", true);
        }
        if (this.d != null) {
            s += this.d.a("InternalReply");
        }
        if (this.e != null) {
            s += this.e.a("ExternalReply");
        }
        return s + "</t:UserOofSettings>";
    }
    
    public OutOfOfficeState getState() {
        return this.a;
    }
    
    public void setState(final OutOfOfficeState state) {
        this.a = state;
    }
    
    public ExternalAudience getExternalAudience() {
        return this.b;
    }
    
    public void setExternalAudience(final ExternalAudience externalAudience) {
        this.b = externalAudience;
    }
    
    public TimeDuration getDuration() {
        return this.c;
    }
    
    public void setDuration(final TimeDuration duration) {
        this.c = duration;
    }
    
    public ReplyBody getInternalReply() {
        return this.d;
    }
    
    public void setInternalReply(final ReplyBody internalReply) {
        this.d = internalReply;
    }
    
    public ReplyBody getExternalReply() {
        return this.e;
    }
    
    public void setExternalReply(final ReplyBody externalReply) {
        this.e = externalReply;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class CallInfo
{
    private CallState a;
    private EventCause b;
    
    public CallInfo() {
        this.a = CallState.IDLE;
        this.b = EventCause.NONE;
    }
    
    CallInfo(final XMLStreamReader reader) throws XMLStreamException {
        this.a = CallState.IDLE;
        this.b = EventCause.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CallState") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.a = ((s = elementText).equals("Alerted") ? CallState.ALERTED : (s.equals("Connected") ? CallState.CONNECTED : (s.equals("Connecting") ? CallState.CONNECTING : (s.equals("Disconnected") ? CallState.DISCONNECTED : (s.equals("Forwarding") ? CallState.FORWARDING : (s.equals("Idle") ? CallState.IDLE : (s.equals("Incoming") ? CallState.INCOMING : CallState.TRANSFERRING)))))));
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EventCause") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    final String s2;
                    this.b = ((s2 = elementText2).equals("NoAnswer") ? EventCause.NO_ANSWER : (s2.equals("Other") ? EventCause.OTHER : (s2.equals("UserBusy") ? EventCause.USER_BUSY : EventCause.NONE)));
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GetCallInfoResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public CallState getState() {
        return this.a;
    }
    
    public EventCause getEventCause() {
        return this.b;
    }
}

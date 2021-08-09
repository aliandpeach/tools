package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class Resolution
{
    private Mailbox a;
    private Contact b;
    
    public Resolution() {
    }
    
    Resolution(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Contact") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new Contact(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Resolution") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        if (this.a != null) {
            return this.a.toString();
        }
        return super.toString();
    }
    
    public Mailbox getMailbox() {
        return this.a;
    }
    
    public Contact getContact() {
        return this.b;
    }
}

package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class MailboxHoldResult
{
    private String a;
    private String b;
    private List<MailboxHoldStatus> c;
    
    public MailboxHoldResult() {
        this.c = new ArrayList<MailboxHoldStatus>();
    }
    
    MailboxHoldResult(final XMLStreamReader reader) throws XMLStreamException {
        this.c = new ArrayList<MailboxHoldStatus>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HoldId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Query") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxHoldStatuses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxHoldStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new MailboxHoldStatus(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxHoldStatuses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxHoldResult") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String getHoldId() {
        return this.a;
    }
    
    public String getQuery() {
        return this.b;
    }
    
    public List<MailboxHoldStatus> getMailboxHoldStatuses() {
        return this.c;
    }
}

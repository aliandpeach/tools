package com.ews.exchange;

import javax.xml.stream.*;

public class MailboxHoldStatus
{
    private String a;
    private HoldStatusType b;
    private String c;
    
    public MailboxHoldStatus() {
        this.b = HoldStatusType.NOT_ON_HOLD;
    }
    
    MailboxHoldStatus(final XMLStreamReader reader) throws XMLStreamException {
        this.b = HoldStatusType.NOT_ON_HOLD;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Status") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.b = ((s = elementText).equals("NotOnHold") ? HoldStatusType.NOT_ON_HOLD : (s.equals("Pending") ? HoldStatusType.PENDING : (s.equals("OnHold") ? HoldStatusType.ON_HOLD : (s.equals("PartialHold") ? HoldStatusType.PARTIAL_HOLD : HoldStatusType.FAILED))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AdditionalInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxHoldStatus") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getMailbox() {
        return this.a;
    }
    
    public HoldStatusType getStatus() {
        return this.b;
    }
    
    public String getAdditionalInfo() {
        return this.c;
    }
}

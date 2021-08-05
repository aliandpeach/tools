package com.ews.exchange;

import javax.xml.stream.*;

public class StandardFolderId extends FolderId
{
    private StandardFolder a;
    private Mailbox b;
    
    public StandardFolderId() {
        this.a = StandardFolder.INBOX;
    }
    
    public StandardFolderId(final StandardFolder id) {
        this.a = StandardFolder.INBOX;
        this.a = id;
    }
    
    public StandardFolderId(final StandardFolder id, final String changeKey) {
        this.a = StandardFolder.INBOX;
        this.a = id;
        this.changeKey = changeKey;
    }
    
    public StandardFolderId(final StandardFolder id, final Mailbox mailbox) {
        this.a = StandardFolder.INBOX;
        this.a = id;
        this.b = mailbox;
    }
    
    public StandardFolderId(final StandardFolder id, final String changeKey, final Mailbox mailbox) {
        this.a = StandardFolder.INBOX;
        this.a = id;
        this.changeKey = changeKey;
        this.b = mailbox;
    }
    
    StandardFolderId(final XMLStreamReader reader) throws XMLStreamException {
        this.a = StandardFolder.INBOX;
        this.changeKey = reader.getAttributeValue(null, "ChangeKey");
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "Id")) != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.a.Q(attributeValue);
        }
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new Mailbox(reader);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DistinguishedFolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = " Id=\"" + com.ews.exchange.a.a(this.a) + "\"";
        if (this.changeKey != null) {
            s = s + " ChangeKey=\"" + this.changeKey + "\"";
        }
        String s2 = "<t:DistinguishedFolderId" + s + ">";
        if (this.b != null) {
            s2 += this.b.a("t:Mailbox");
        }
        return s2 + "</t:DistinguishedFolderId>";
    }
    
    public String toString() {
        return com.ews.exchange.a.a(this.a);
    }
    
    public StandardFolder getStandardFolder() {
        return this.a;
    }
    
    public void setStandardFolder(final StandardFolder id) {
        this.a = id;
    }
    
    public Mailbox getMailbox() {
        return this.b;
    }
    
    public void setMailbox(final Mailbox mailbox) {
        this.b = mailbox;
    }
}

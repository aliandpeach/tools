package com.independentsoft.exchange;

import javax.xml.stream.*;

public class MailboxSearchScope
{
    private String a;
    private MailboxSearchLocation b;
    
    public MailboxSearchScope() {
        this.b = MailboxSearchLocation.ALL;
    }
    
    public MailboxSearchScope(final String mailbox) {
        this.b = MailboxSearchLocation.ALL;
        this.a = mailbox;
    }
    
    public MailboxSearchScope(final String mailbox, final MailboxSearchLocation searchScope) {
        this.b = MailboxSearchLocation.ALL;
        this.a = mailbox;
        this.b = searchScope;
    }
    
    MailboxSearchScope(final XMLStreamReader reader) throws XMLStreamException {
        this.b = MailboxSearchLocation.ALL;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else {
                final String elementText;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SearchScope") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.b = ((s = elementText).equals("PrimaryOnly") ? MailboxSearchLocation.PRIMARY_ONLY : (s.equals("ArchiveOnly") ? MailboxSearchLocation.ARCHIVE_ONLY : (s.equals("All") ? MailboxSearchLocation.ALL : MailboxSearchLocation.NONE)));
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxSearchScope") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String string = "<t:MailboxSearchScope>";
        if (this.a != null) {
            string = string + "<t:Mailbox>" + d.a(this.a) + "</t:Mailbox>";
        }
        return string + "<t:SearchScope>" + com.independentsoft.exchange.a.a(this.b) + "</t:SearchScope>" + "</t:MailboxSearchScope>";
    }
    
    public String getMailbox() {
        return this.a;
    }
    
    public void setMailbox(final String mailbox) {
        this.a = mailbox;
    }
    
    public MailboxSearchLocation getSearchScope() {
        return this.b;
    }
    
    public void setSearchScope(final MailboxSearchLocation searchScope) {
        this.b = searchScope;
    }
}

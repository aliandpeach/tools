package com.ews.exchange;

import javax.xml.stream.*;
import java.util.*;

public class MailboxQuery
{
    private String a;
    private List<MailboxSearchScope> b;
    
    public MailboxQuery() {
        this.b = new ArrayList<MailboxSearchScope>();
    }
    
    public MailboxQuery(final String query, final MailboxSearchScope mailboxSearchScope) {
        this.b = new ArrayList<MailboxSearchScope>();
        this.a = query;
        this.b.add(mailboxSearchScope);
    }
    
    public MailboxQuery(final String query, final List<MailboxSearchScope> mailboxSearchScopes) {
        this.b = new ArrayList<MailboxSearchScope>();
        this.a = query;
        this.b = mailboxSearchScopes;
    }
    
    MailboxQuery(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<MailboxSearchScope>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Query") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxSearchScopes") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxSearchScope") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MailboxSearchScope(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxSearchScopes") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxQuery") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String string = "<t:MailboxQuery>";
        if (this.a != null) {
            string = string + "<t:Query>" + d.a(this.a) + "</t:Query>";
        }
        String s = string + "<t:MailboxSearchScopes>";
        final Iterator<MailboxSearchScope> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            s += iterator.next().a();
        }
        return s + "</t:MailboxSearchScopes>" + "</t:MailboxQuery>";
    }
    
    public String getQuery() {
        return this.a;
    }
    
    public void setQuery(final String query) {
        this.a = query;
    }
    
    public List<MailboxSearchScope> getMailboxSearchScopes() {
        return this.b;
    }
}

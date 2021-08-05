package com.ews.exchange;

import javax.xml.stream.*;

public class Mailbox
{
    private String a;
    private String b;
    private String c;
    private MailboxType d;
    private ItemId e;
    private String f;
    
    public Mailbox() {
        this.d = MailboxType.NONE;
    }
    
    public Mailbox(final String emailAddress) {
        this.d = MailboxType.NONE;
        this.b = emailAddress;
    }
    
    public Mailbox(final String emailAddress, final String name) {
        this.d = MailboxType.NONE;
        this.b = emailAddress;
        this.a = name;
    }
    
    public Mailbox(final String emailAddress, final String name, final String routingType) {
        this.d = MailboxType.NONE;
        this.b = emailAddress;
        this.a = name;
        this.c = routingType;
    }
    
    public Mailbox(final String emailAddress, final String name, final String routingType, final MailboxType type) {
        this.d = MailboxType.NONE;
        this.b = emailAddress;
        this.a = name;
        this.c = routingType;
        this.d = type;
    }
    
    public Mailbox(final ItemId itemId) {
        this.d = MailboxType.NONE;
        this.e = itemId;
    }
    
    Mailbox(final XMLStreamReader reader) throws XMLStreamException {
        this.d = MailboxType.NONE;
        this.a(reader, "Mailbox");
    }
    
    Mailbox(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.d = MailboxType.NONE;
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader reader, final String s) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Name") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EmailAddress") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RoutingType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailboxType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    final String s2;
                    this.d = ((s2 = elementText).equals("Contact") ? MailboxType.CONTACT : (s2.equals("Mailbox") ? MailboxType.MAILBOX : (s2.equals("PrivateDL") ? MailboxType.PRIVATE_DISTRIBUTION_LIST : (s2.equals("PublicDL") ? MailboxType.PUBLIC_DISTRIBUTION_LIST : (s2.equals("PublicFolder") ? MailboxType.PUBLIC_FOLDER : (s2.equals("OneOff") ? MailboxType.ONE_OFF : (s2.equals("GroupMailbox") ? MailboxType.GROUP_MAILBOX : (s2.equals("ImplicitContact") ? MailboxType.IMPLICIT_CONTACT : MailboxType.NONE))))))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new ItemId(reader, "ItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OriginalDisplayName") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = reader.getElementText();
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals(s) && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a(final String s) {
        String s2 = "<" + s + ">";
        if (this.a != null) {
            s2 = s2 + "<t:Name>" + com.ews.exchange.d.a(this.a) + "</t:Name>";
        }
        if (this.b != null) {
            s2 = s2 + "<t:EmailAddress>" + com.ews.exchange.d.a(this.b) + "</t:EmailAddress>";
        }
        if (this.c != null) {
            s2 = s2 + "<t:RoutingType>" + com.ews.exchange.d.a(this.c) + "</t:RoutingType>";
        }
        if (this.d != MailboxType.NONE) {
            final MailboxType d;
            s2 = s2 + "<t:MailboxType>" + (((d = this.d) == MailboxType.CONTACT) ? "Contact" : ((d == MailboxType.MAILBOX) ? "Mailbox" : ((d == MailboxType.PRIVATE_DISTRIBUTION_LIST) ? "PrivateDL" : ((d == MailboxType.PUBLIC_DISTRIBUTION_LIST) ? "PublicDL" : ((d == MailboxType.PUBLIC_FOLDER) ? "PublicFolder" : ((d == MailboxType.ONE_OFF) ? "OneOff" : ((d == MailboxType.GROUP_MAILBOX) ? "GroupMailbox" : ((d == MailboxType.IMPLICIT_CONTACT) ? "ImplicitContact" : "Unknown")))))))) + "</t:MailboxType>";
        }
        if (this.e != null) {
            s2 += this.e.a();
        }
        if (this.f != null) {
            s2 = s2 + "<t:OriginalDisplayName>" + com.ews.exchange.d.a(this.f) + "</t:OriginalDisplayName>";
        }
        return s2 + "</" + s + ">";
    }
    
    public String toString() {
        return this.a("t:Mailbox");
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public String getEmailAddress() {
        return this.b;
    }
    
    public void setEmailAddress(final String emailAddress) {
        this.b = emailAddress;
    }
    
    public String getRoutingType() {
        return this.c;
    }
    
    public void setRoutingType(final String routingType) {
        this.c = routingType;
    }
    
    public MailboxType getType() {
        return this.d;
    }
    
    public void setType(final MailboxType type) {
        this.d = type;
    }
    
    public ItemId getItemId() {
        return this.e;
    }
    
    public void setItemId(final ItemId itemId) {
        this.e = itemId;
    }
    
    public String getOriginalDisplayName() {
        return this.f;
    }
    
    public void setOriginalDisplayName(final String originalDisplayName) {
        this.f = originalDisplayName;
    }
}

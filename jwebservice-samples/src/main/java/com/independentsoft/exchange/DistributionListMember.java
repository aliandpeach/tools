package com.independentsoft.exchange;

import javax.xml.stream.*;

public class DistributionListMember
{
    private String a;
    private Mailbox b;
    private DistributionListMemberStatus c;
    
    public DistributionListMember() {
        this.c = DistributionListMemberStatus.NONE;
    }
    
    public DistributionListMember(final Mailbox mailbox) {
        this.c = DistributionListMemberStatus.NONE;
        this.b = mailbox;
    }
    
    public DistributionListMember(final Mailbox mailbox, final DistributionListMemberStatus status) {
        this.c = DistributionListMemberStatus.NONE;
        this.b = mailbox;
        this.c = status;
    }
    
    DistributionListMember(final XMLStreamReader reader) throws XMLStreamException {
        this.c = DistributionListMemberStatus.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        this.a = reader.getAttributeValue(null, "Key");
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new Mailbox(reader, "Mailbox");
            }
            else {
                final String elementText;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Status") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.c = ((s = elementText).equals("Demoted") ? DistributionListMemberStatus.DEMOTED : (s.equals("Normal") ? DistributionListMemberStatus.NORMAL : (s.equals("Unrecognized") ? DistributionListMemberStatus.UNRECOGNIZED : DistributionListMemberStatus.NONE)));
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Member") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String string = "";
        if (this.a != null) {
            string = " Key=\"" + d.a(this.a) + "\"";
        }
        String s = "<t:Member" + string + ">";
        if (this.b != null) {
            s += this.b.a("t:Mailbox");
        }
        if (this.c != DistributionListMemberStatus.NONE) {
            final DistributionListMemberStatus c;
            s = s + "<t:Status>" + (((c = this.c) == DistributionListMemberStatus.DEMOTED) ? "Demoted" : ((c == DistributionListMemberStatus.NORMAL) ? "Normal" : ((c == DistributionListMemberStatus.UNRECOGNIZED) ? "Unrecognized" : "None"))) + "</t:Status>";
        }
        return s + "</t:Member>";
    }
    
    public String getKey() {
        return this.a;
    }
    
    public void setKey(final String key) {
        this.a = key;
    }
    
    public Mailbox getMailbox() {
        return this.b;
    }
    
    public void setMailbox(final Mailbox mailbox) {
        this.b = mailbox;
    }
    
    public DistributionListMemberStatus getStatus() {
        return this.c;
    }
    
    public void setStatus(final DistributionListMemberStatus status) {
        this.c = status;
    }
}

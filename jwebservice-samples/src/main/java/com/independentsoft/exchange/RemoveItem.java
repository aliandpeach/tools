package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class RemoveItem extends ResponseItem
{
    private List<InternetMessageHeader> am;
    private Mailbox an;
    private List<Mailbox> ao;
    private List<Mailbox> ap;
    private List<Mailbox> aq;
    private boolean ar;
    private boolean as;
    private String at;
    private String au;
    private Mailbox av;
    private String ax;
    private boolean ay;
    private boolean az;
    private String aA;
    private List<Mailbox> aB;
    private Mailbox aC;
    private Mailbox aD;
    
    public RemoveItem() {
        this.am = new ArrayList<InternetMessageHeader>();
        this.ao = new ArrayList<Mailbox>();
        this.ap = new ArrayList<Mailbox>();
        this.aq = new ArrayList<Mailbox>();
        this.aB = new ArrayList<Mailbox>();
    }
    
    public RemoveItem(final ItemId referenceItemId) {
        this.am = new ArrayList<InternetMessageHeader>();
        this.ao = new ArrayList<Mailbox>();
        this.ap = new ArrayList<Mailbox>();
        this.aq = new ArrayList<Mailbox>();
        this.aB = new ArrayList<Mailbox>();
        this.aw = referenceItemId;
    }
    
    RemoveItem(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.am = new ArrayList<InternetMessageHeader>();
        this.ao = new ArrayList<Mailbox>();
        this.ap = new ArrayList<Mailbox>();
        this.aq = new ArrayList<Mailbox>();
        this.aB = new ArrayList<Mailbox>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemClass") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sensitivity") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.f = com.independentsoft.exchange.a.N(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Body") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = new Body(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FileAttachment") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new FileAttachmentInfo(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemAttachment") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new ItemAttachmentInfo(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeaders") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeader") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final InternetMessageHeader internetMessageHeader;
                        (internetMessageHeader = new InternetMessageHeader()).setName(xmlStreamReader.getAttributeValue(null, "HeaderName"));
                        internetMessageHeader.setValue(xmlStreamReader.getElementText());
                        this.am.add(internetMessageHeader);
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeaders") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sender") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.an = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ToRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.ao.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ToRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CcRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.ap.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CcRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BccRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aq.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BccRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsReadReceiptRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.ar = Boolean.parseBoolean(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsDeliveryReceiptRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.as = Boolean.parseBoolean(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.at = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationTopic") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.au = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("From") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.av = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ax = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsRead") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.ay = Boolean.parseBoolean(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsResponseRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.az = Boolean.parseBoolean(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("References") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aA = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aB.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReceivedBy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aC = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReceivedRepresenting") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aD = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReferenceItemId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aw = new ItemId(xmlStreamReader, "ReferenceItemId");
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RemoveItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:RemoveItem>";
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.independentsoft.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.independentsoft.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.an != null) {
            s = s + "<t:Sender>" + this.an.a("t:Mailbox") + "</t:Sender>";
        }
        if (this.ao.size() > 0) {
            String s2 = s + "<t:ToRecipients>";
            for (int i = 0; i < this.ao.size(); ++i) {
                s2 += this.ao.get(i).a("t:Mailbox");
            }
            s = s2 + "</t:ToRecipients>";
        }
        if (this.ap.size() > 0) {
            String s3 = s + "<t:CcRecipients>";
            for (int j = 0; j < this.ap.size(); ++j) {
                s3 += this.ap.get(j).a("t:Mailbox");
            }
            s = s3 + "</t:CcRecipients>";
        }
        if (this.aq.size() > 0) {
            String s4 = s + "<t:BccRecipients>";
            for (int k = 0; k < this.aq.size(); ++k) {
                s4 += this.aq.get(k).a("t:Mailbox");
            }
            s = s4 + "</t:BccRecipients>";
        }
        if (this.ar) {
            s += "<t:IsReadReceiptRequested>true</t:IsReadReceiptRequested>";
        }
        if (this.as) {
            s += "<t:IsDeliveryReceiptRequested>true</t:IsDeliveryReceiptRequested>";
        }
        if (this.av != null) {
            s = s + "<t:From>" + this.av.a("t:Mailbox") + "</t:From>";
        }
        if (this.ay) {
            s += "<t:IsRead>true</t:IsRead>";
        }
        String s5;
        if (this.az) {
            s5 = s + "<t:IsResponseRequested>true</t:IsResponseRequested>";
        }
        else {
            s5 = s + "<t:IsResponseRequested>false</t:IsResponseRequested>";
        }
        if (this.aA != null) {
            s5 = s5 + "<t:References>" + com.independentsoft.exchange.d.a(this.aA) + "</t:References>";
        }
        if (this.aB.size() > 0) {
            String s6 = s5 + "<t:ReplyTo>";
            for (int l = 0; l < this.aB.size(); ++l) {
                s6 += this.aB.get(l).a("t:Mailbox");
            }
            s5 = s6 + "</t:ReplyTo>";
        }
        if (this.aw != null) {
            s5 += this.aw.a("t:ReferenceItemId");
        }
        for (int n = 0; n < this.al.size(); ++n) {
            s5 += this.al.get(n).toString();
        }
        return s5 + "</t:RemoveItem>";
    }
    
    public List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.am;
    }
    
    public Mailbox getSender() {
        return this.an;
    }
    
    public void setSender(final Mailbox sender) {
        this.an = sender;
    }
    
    public List<Mailbox> getToRecipients() {
        return this.ao;
    }
    
    public List<Mailbox> getCcRecipients() {
        return this.ap;
    }
    
    public List<Mailbox> getBccRecipients() {
        return this.aq;
    }
    
    public boolean isReadReceiptRequested() {
        return this.ar;
    }
    
    public void setReadReceiptRequested(final boolean isReadReceiptRequested) {
        this.ar = isReadReceiptRequested;
    }
    
    public boolean isDeliveryReceiptRequested() {
        return this.as;
    }
    
    public void setDeliveryReceiptRequested(final boolean isDeliveryReceiptRequested) {
        this.as = isDeliveryReceiptRequested;
    }
    
    public String getConversationIndex() {
        return this.at;
    }
    
    public String getConversationTopic() {
        return this.au;
    }
    
    public Mailbox getFrom() {
        return this.av;
    }
    
    public void setFrom(final Mailbox from) {
        this.av = from;
    }
    
    public String getInternetMessageId() {
        return this.ax;
    }
    
    public boolean isRead() {
        return this.ay;
    }
    
    public void setRead(final boolean isRead) {
        this.ay = isRead;
    }
    
    public boolean isResponseRequested() {
        return this.az;
    }
    
    public void setResponseRequested(final boolean isResponseRequested) {
        this.az = isResponseRequested;
    }
    
    public String getReferences() {
        return this.aA;
    }
    
    public void setReferences(final String references) {
        this.aA = references;
    }
    
    public List<Mailbox> getReplyTo() {
        return this.aB;
    }
    
    public Mailbox getReceivedBy() {
        return this.aC;
    }
    
    public Mailbox getReceivedRepresenting() {
        return this.aD;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class DeclineItem extends MeetingRegistrationResponse
{
    public DeclineItem() {
    }
    
    public DeclineItem(final ItemId referenceItemId) {
        this.aw = referenceItemId;
    }
    
    DeclineItem(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemClass") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Sensitivity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.f = com.ews.exchange.a.N(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Body") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = new Body(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attachments") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FileAttachment") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new FileAttachmentInfo(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemAttachment") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new ItemAttachmentInfo(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attachments") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeaders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeader") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final InternetMessageHeader internetMessageHeader;
                        (internetMessageHeader = new InternetMessageHeader()).setName(reader.getAttributeValue(null, "HeaderName"));
                        internetMessageHeader.setValue(reader.getElementText());
                        this.am.add(internetMessageHeader);
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeaders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Sender") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.an = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.ao.add(new Mailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CcRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.ap.add(new Mailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CcRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BccRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aq.add(new Mailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BccRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsReadReceiptRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.ar = Boolean.parseBoolean(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsDeliveryReceiptRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.as = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("From") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.at = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReceivedBy") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.au = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReceivedRepresenting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.av = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReferenceItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aw = new ItemId(reader, "ReferenceItemId");
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeclineItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:DeclineItem>";
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.ews.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.ews.exchange.a.a(this.f) + "</t:Sensitivity>";
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
        if (this.at != null) {
            s = s + "<t:From>" + this.at.a("t:Mailbox") + "</t:From>";
        }
        if (this.aw != null) {
            s += this.aw.a("t:ReferenceItemId");
        }
        for (int l = 0; l < this.al.size(); ++l) {
            s += this.al.get(l).toString();
        }
        return s + "</t:DeclineItem>";
    }
}

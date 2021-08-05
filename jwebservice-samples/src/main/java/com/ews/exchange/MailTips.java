package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class MailTips
{
    private Mailbox a;
    private MailTipType b;
    private OutOfOfficeMailTip c;
    private boolean d;
    private String e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    
    MailTips() {
        this.b = MailTipType.ALL;
    }
    
    MailTips(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.b = MailTipType.ALL;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RecipientAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Mailbox(xmlStreamReader, "RecipientAddress");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PendingMailTips") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.b = ((s = elementText).equals("All") ? MailTipType.ALL : (s.equals("CustomMailTip") ? MailTipType.CUSTOM_MAIL_TIP : (s.equals("DeliveryRestriction") ? MailTipType.DELIVERY_RESTRICTION : (s.equals("ExternalMemberCount") ? MailTipType.EXTERNAL_MEMBER_COUNT : (s.equals("InvalidRecipient") ? MailTipType.INVALID_RECIPIENT : (s.equals("MailboxFullStatus") ? MailTipType.MAILBOX_FULL_STATUS : (s.equals("MaxMessageSize") ? MailTipType.MAX_MESSAGE_SIZE : (s.equals("ModerationStatus") ? MailTipType.MODERATION_STATUS : (s.equals("OutOfOfficeMessage") ? MailTipType.OUT_OF_OFFICE_MESSAGE : MailTipType.TOTAL_MEMBER_COUNT)))))))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("OutOfOffice") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new OutOfOfficeMailTip(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxFull") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.d = Boolean.parseBoolean(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CustomMailTip") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TotalMemberCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.f = Integer.parseInt(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExternalMemberCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.g = Integer.parseInt(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MaxMessageSize") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.h = Integer.parseInt(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DeliveryRestricted") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    this.i = Boolean.parseBoolean(elementText6);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsModerated") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = xmlStreamReader.getElementText()) != null && elementText7.length() > 0) {
                    this.j = Boolean.parseBoolean(elementText7);
                }
            }
            else {
                final String elementText8;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InvalidRecipient") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText8 = xmlStreamReader.getElementText()) != null && elementText8.length() > 0) {
                    this.k = Boolean.parseBoolean(elementText8);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailTips") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public Mailbox getRecipient() {
        return this.a;
    }
    
    public MailTipType getPendingMailTips() {
        return this.b;
    }
    
    public OutOfOfficeMailTip getOutOfOffice() {
        return this.c;
    }
    
    public boolean isMailboxFull() {
        return this.d;
    }
    
    public String getCustomMailTip() {
        return this.e;
    }
    
    public int getTotalMemberCount() {
        return this.f;
    }
    
    public int getExternalMemberCount() {
        return this.g;
    }
    
    public int getMaxMessageSize() {
        return this.h;
    }
    
    public boolean getDeliveryRestricted() {
        return this.i;
    }
    
    public boolean isModerated() {
        return this.j;
    }
    
    public boolean getInvalidRecipient() {
        return this.k;
    }
}

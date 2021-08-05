package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import java.nio.charset.*;
import java.nio.*;

public class Message extends Item
{
    Date au;
    String av;
    boolean aw;
    boolean ax;
    boolean ay;
    boolean az;
    boolean aA;
    List<InternetMessageHeader> aB;
    Date aC;
    List<ResponseItem> aD;
    String aE;
    String aF;
    Mailbox aG;
    List<Mailbox> aH;
    List<Mailbox> aI;
    List<Mailbox> aJ;
    boolean aK;
    boolean aL;
    String aM;
    String aN;
    Mailbox aO;
    String aP;
    boolean aQ;
    boolean aR;
    String aS;
    List<Mailbox> aT;
    LastVerbExecuted aU;
    String aV;
    FlagStatus aW;
    FlagIcon aX;
    Date aY;
    String aZ;
    boolean ba;
    private List<String> am;
    private String an;
    Date bb;
    Date bc;
    private Date ao;
    private Date ap;
    List<MessageFlag> bd;
    Mailbox be;
    Mailbox bf;
    
    public Message() {
        this.aB = new ArrayList<InternetMessageHeader>();
        this.aD = new ArrayList<ResponseItem>();
        this.aH = new ArrayList<Mailbox>();
        this.aI = new ArrayList<Mailbox>();
        this.aJ = new ArrayList<Mailbox>();
        this.aT = new ArrayList<Mailbox>();
        this.aU = LastVerbExecuted.NONE;
        this.aW = FlagStatus.NONE;
        this.aX = FlagIcon.NONE;
        this.am = new ArrayList<String>();
        this.bd = new ArrayList<MessageFlag>();
    }
    
    public Message(final String subject) {
        this.aB = new ArrayList<InternetMessageHeader>();
        this.aD = new ArrayList<ResponseItem>();
        this.aH = new ArrayList<Mailbox>();
        this.aI = new ArrayList<Mailbox>();
        this.aJ = new ArrayList<Mailbox>();
        this.aT = new ArrayList<Mailbox>();
        this.aU = LastVerbExecuted.NONE;
        this.aW = FlagStatus.NONE;
        this.aX = FlagIcon.NONE;
        this.am = new ArrayList<String>();
        this.bd = new ArrayList<MessageFlag>();
        this.d = subject;
    }
    
    public Message(final MimeContent mimeContent) {
        this.aB = new ArrayList<InternetMessageHeader>();
        this.aD = new ArrayList<ResponseItem>();
        this.aH = new ArrayList<Mailbox>();
        this.aI = new ArrayList<Mailbox>();
        this.aJ = new ArrayList<Mailbox>();
        this.aT = new ArrayList<Mailbox>();
        this.aU = LastVerbExecuted.NONE;
        this.aW = FlagStatus.NONE;
        this.aX = FlagIcon.NONE;
        this.am = new ArrayList<String>();
        this.bd = new ArrayList<MessageFlag>();
        this.e = mimeContent;
    }
    
    Message(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.aB = new ArrayList<InternetMessageHeader>();
        this.aD = new ArrayList<ResponseItem>();
        this.aH = new ArrayList<Mailbox>();
        this.aI = new ArrayList<Mailbox>();
        this.aJ = new ArrayList<Mailbox>();
        this.aT = new ArrayList<Mailbox>();
        this.aU = LastVerbExecuted.NONE;
        this.aW = FlagStatus.NONE;
        this.aX = FlagIcon.NONE;
        this.am = new ArrayList<String>();
        this.bd = new ArrayList<MessageFlag>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(xmlStreamReader, "ItemId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ParentFolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(xmlStreamReader, "ParentFolderId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemClass") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Subject") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MimeContent") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new MimeContent(xmlStreamReader);
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
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Size") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.i = Integer.parseInt(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.j.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Importance") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.k = com.independentsoft.exchange.a.O(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DateTimeCreated") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.l = com.independentsoft.exchange.d.c(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasAttachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.m = Boolean.parseBoolean(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Culture") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.n = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderDueBy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    this.E = com.independentsoft.exchange.d.c(elementText6);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderIsSet") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = xmlStreamReader.getElementText()) != null && elementText7.length() > 0) {
                    this.F = Boolean.parseBoolean(elementText7);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderMinutesBeforeStart") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = xmlStreamReader.getElementText()) != null && elementText8.length() > 0) {
                    this.G = Integer.parseInt(elementText8);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DateTimeReceived") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = xmlStreamReader.getElementText()) != null && elementText9.length() > 0) {
                    this.au = com.independentsoft.exchange.d.c(elementText9);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InReplyTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.av = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsSubmitted") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = xmlStreamReader.getElementText()) != null && elementText10.length() > 0) {
                    this.aw = Boolean.parseBoolean(elementText10);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsDraft") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = xmlStreamReader.getElementText()) != null && elementText11.length() > 0) {
                    this.ax = Boolean.parseBoolean(elementText11);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsFromMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = xmlStreamReader.getElementText()) != null && elementText12.length() > 0) {
                    this.ay = Boolean.parseBoolean(elementText12);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsResend") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = xmlStreamReader.getElementText()) != null && elementText13.length() > 0) {
                    this.az = Boolean.parseBoolean(elementText13);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsUnmodified") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = xmlStreamReader.getElementText()) != null && elementText14.length() > 0) {
                    this.aA = Boolean.parseBoolean(elementText14);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeaders") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeader") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final InternetMessageHeader internetMessageHeader;
                        (internetMessageHeader = new InternetMessageHeader()).setName(xmlStreamReader.getAttributeValue(null, "HeaderName"));
                        internetMessageHeader.setValue(xmlStreamReader.getElementText());
                        this.aB.add(internetMessageHeader);
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageHeaders") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DateTimeSent") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = xmlStreamReader.getElementText()) != null && elementText15.length() > 0) {
                    this.aC = com.independentsoft.exchange.d.c(elementText15);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResponseObjects") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AcceptItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new AcceptItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TentativelyAcceptItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new TentativelyAcceptItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DeclineItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new DeclineItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyToItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ReplyItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ForwardItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ForwardItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyAllToItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ReplyAllItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CancelCalendarItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new CancelItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RemoveItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new RemoveItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SuppressReadReceipt") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new SuppressReadReceipt(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostReplyItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new PostReplyItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AcceptSharingInvitation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new AcceptSharingInvitation(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResponseObjects") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayCc") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aE = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aF = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sender") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aG = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ToRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aH.add(new Mailbox(xmlStreamReader));
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
                        this.aI.add(new Mailbox(xmlStreamReader));
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
                        this.aJ.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BccRecipients") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsReadReceiptRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = xmlStreamReader.getElementText()) != null && elementText16.length() > 0) {
                    this.aK = Boolean.parseBoolean(elementText16);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsDeliveryReceiptRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = xmlStreamReader.getElementText()) != null && elementText17.length() > 0) {
                    this.aL = Boolean.parseBoolean(elementText17);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aM = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationTopic") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aN = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("From") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aO = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternetMessageId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aP = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsRead") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = xmlStreamReader.getElementText()) != null && elementText18.length() > 0) {
                    this.aQ = Boolean.parseBoolean(elementText18);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsResponseRequested") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = xmlStreamReader.getElementText()) != null && elementText19.length() > 0) {
                    this.aR = Boolean.parseBoolean(elementText19);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("References") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aS = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aT.add(new Mailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyTo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReceivedBy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.be = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReceivedRepresenting") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bf = new Mailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsAssociated") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText20;
                if ((elementText20 = xmlStreamReader.getElementText()) != null && elementText20.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText20);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientEditFormQueryString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.y = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientReadFormQueryString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.x = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.z = new ItemId(xmlStreamReader, "ConversationId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StoreEntryId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.A = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UniqueBody") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.B = new Body(xmlStreamReader, "UniqueBody");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EffectiveRights") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.o = new EffectiveRights(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LastModifiedName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.r = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LastModifiedTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText21;
                if ((elementText21 = xmlStreamReader.getElementText()) != null && elementText21.length() > 0) {
                    this.s = com.independentsoft.exchange.d.c(elementText21);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Flag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.H = new Flag(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InstanceKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.I = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PolicyTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.J = new RetentionTag(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ArchiveTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.K = new RetentionTag(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.L = com.independentsoft.exchange.d.c(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Preview") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.M = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NextPredictedAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText22;
                if ((elementText22 = xmlStreamReader.getElementText()) != null && elementText22.length() > 0) {
                    this.N = com.independentsoft.exchange.a.C(elementText22);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupingAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText23;
                if ((elementText23 = xmlStreamReader.getElementText()) != null && elementText23.length() > 0) {
                    this.O = com.independentsoft.exchange.a.C(elementText23);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BlockStatus") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText24;
                if ((elementText24 = xmlStreamReader.getElementText()) != null && elementText24.length() > 0) {
                    this.P = Boolean.parseBoolean(elementText24);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasBlockedImages") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText25;
                if ((elementText25 = xmlStreamReader.getElementText()) != null && elementText25.length() > 0) {
                    this.Q = Boolean.parseBoolean(elementText25);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TextBody") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.R = new Body(xmlStreamReader, "TextBody");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IconIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText26;
                if ((elementText26 = xmlStreamReader.getElementText()) != null && elementText26.length() > 0) {
                    this.S = com.independentsoft.exchange.a.D(elementText26);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EntityExtractionResult") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ak = new EntityExtractionResult(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExtendedProperty") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final ExtendedProperty extendedProperty;
                if ((extendedProperty = new ExtendedProperty(xmlStreamReader)).getPropertyPath() instanceof PropertyTag) {
                    final PropertyTag propertyTag;
                    if ((propertyTag = (PropertyTag)extendedProperty.getPropertyPath()).getTag() == MapiPropertyTag.PR_DISPLAY_NAME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_DISPLAY_NAME.getType()) {
                        this.p = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ENTRYID.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ENTRYID.getType()) {
                        this.q = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_SEARCH_KEY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_SEARCH_KEY.getType()) {
                        this.t = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_HTML.getTag() && propertyTag.getType() == MapiPropertyTag.PR_HTML.getType()) {
                        if (this.g != null && this.g.getType() == BodyType.HTML) {
                            this.u = this.g.getText();
                        }
                        else {
                            final String value;
                            if ((value = extendedProperty.getValue()) != null && value.length() > 0) {
                                this.u = Charset.forName("UTF-8").decode(ByteBuffer.wrap(com.independentsoft.exchange.d.e(value))).toString();
                            }
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_BODY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_BODY.getType()) {
                        this.v = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_COMMENT.getTag() && propertyTag.getType() == MapiPropertyTag.PR_COMMENT.getType()) {
                        this.C = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ACTION.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ACTION.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aj = com.independentsoft.exchange.a.P(Integer.toString(Integer.parseInt(extendedProperty.getValue()) - 768));
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_LAST_VERB_EXECUTED.getTag() && propertyTag.getType() == MapiPropertyTag.PR_LAST_VERB_EXECUTED.getType()) {
                        final String value2;
                        if ((value2 = extendedProperty.getValue()) != null && value2.length() > 0) {
                            this.aU = com.independentsoft.exchange.a.u(value2);
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_MESSAGE_FLAGS.getTag() && propertyTag.getType() == MapiPropertyTag.PR_MESSAGE_FLAGS.getType()) {
                        final String value3;
                        if ((value3 = extendedProperty.getValue()) != null && value3.length() > 0) {
                            this.bd = com.independentsoft.exchange.a.a(Integer.parseInt(value3));
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_IN_REPLY_TO_ID.getTag() && propertyTag.getType() == MapiPropertyTag.PR_IN_REPLY_TO_ID.getType()) {
                        this.aV = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_FLAG_STATUS.getTag() && propertyTag.getType() == MapiPropertyTag.PR_FLAG_STATUS.getType()) {
                        final String value4;
                        if ((value4 = extendedProperty.getValue()) != null && value4.length() > 0) {
                            this.aW = com.independentsoft.exchange.a.J(value4);
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_FLAG_ICON.getTag() && propertyTag.getType() == MapiPropertyTag.PR_FLAG_ICON.getType()) {
                        final String value5;
                        if ((value5 = extendedProperty.getValue()) != null && value5.length() > 0) {
                            this.aX = com.independentsoft.exchange.a.L(value5);
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_FLAG_COMPLETE.getTag() && propertyTag.getType() == MapiPropertyTag.PR_FLAG_COMPLETE.getType()) {
                        final String value6;
                        if ((value6 = extendedProperty.getValue()) != null && value6.length() > 0) {
                            this.aY = com.independentsoft.exchange.d.c(value6);
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_DEFERRED_DELIVERY_TIME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_DEFERRED_DELIVERY_TIME.getType()) {
                        final String value7;
                        if ((value7 = extendedProperty.getValue()) != null && value7.length() > 0) {
                            this.bb = com.independentsoft.exchange.d.c(value7);
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_DEFERRED_SEND_TIME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_DEFERRED_SEND_TIME.getType()) {
                        final String value8;
                        if ((value8 = extendedProperty.getValue()) != null && value8.length() > 0) {
                            this.bc = com.independentsoft.exchange.d.c(value8);
                        }
                    }
                    else {
                        final String value9;
                        if (propertyTag.getTag() == MapiPropertyTag.PR_RTF_COMPRESSED.getTag() && propertyTag.getType() == MapiPropertyTag.PR_RTF_COMPRESSED.getType() && (value9 = extendedProperty.getValue()) != null && value9.length() > 0) {
                            this.D = com.independentsoft.exchange.d.e(value9);
                        }
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof PropertyId) {
                    final PropertyId propertyId;
                    if ((propertyId = (PropertyId)extendedProperty.getPropertyPath()).getId() == 34105 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING_ARRAY) {
                        if (extendedProperty.getValues() != null) {
                            for (int i = 0; i < extendedProperty.getValues().size(); ++i) {
                                this.Y.add(extendedProperty.getValues().get(i));
                            }
                        }
                    }
                    else if (propertyId.getId() == 34105 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING_ARRAY) {
                        if (extendedProperty.getValues() != null) {
                            for (int j = 0; j < extendedProperty.getValues().size(); ++j) {
                                this.Z.add(extendedProperty.getValues().get(j));
                            }
                        }
                    }
                    else if (propertyId.getId() == 34054 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aa = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34070 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ab = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34071 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ac = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34096 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING) {
                        this.aZ = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 34068 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ba = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == MessagePropertyPath.VOTING_OPTIONS.getId() && propertyId.getSet() == MessagePropertyPath.VOTING_OPTIONS.getSet() && propertyId.getType() == MessagePropertyPath.VOTING_OPTIONS.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {}
                    }
                    else if (propertyId.getId() == MessagePropertyPath.VOTING_RESPONSE.getId() && propertyId.getSet() == MessagePropertyPath.VOTING_RESPONSE.getSet() && propertyId.getType() == MessagePropertyPath.VOTING_RESPONSE.getType()) {
                        this.an = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == MessagePropertyPath.START_DATE.getId() && propertyId.getSet() == MessagePropertyPath.START_DATE.getSet() && propertyId.getType() == MessagePropertyPath.START_DATE.getType()) {
                        final String value10;
                        if ((value10 = extendedProperty.getValue()) != null && value10.length() > 0) {
                            this.ao = com.independentsoft.exchange.d.c(value10);
                        }
                    }
                    else {
                        final String value11;
                        if (propertyId.getId() == MessagePropertyPath.DUE_DATE.getId() && propertyId.getSet() == MessagePropertyPath.DUE_DATE.getSet() && propertyId.getType() == MessagePropertyPath.DUE_DATE.getType() && (value11 = extendedProperty.getValue()) != null && value11.length() > 0) {
                            this.ap = com.independentsoft.exchange.d.c(value11);
                        }
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof CustomPropertyId) {
                    final CustomPropertyId customPropertyId;
                    if ((customPropertyId = (CustomPropertyId)extendedProperty.getPropertyPath()).getId() == 34566 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.T = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 34568 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.U = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 34560 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.STRING) {
                        this.V = extendedProperty.getValue();
                    }
                    else if (customPropertyId.getId() == 34578 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.STRING) {
                        this.W = extendedProperty.getValue();
                    }
                    else if (customPropertyId.getId() == 34567 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.X = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 35586 && customPropertyId.getSet().equals("0006200e-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ad = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 35587 && customPropertyId.getSet().equals("0006200e-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ae = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 35588 && customPropertyId.getSet().equals("0006200e-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.af = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 35589 && customPropertyId.getSet().equals("0006200e-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ag = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 35584 && customPropertyId.getSet().equals("0006200e-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.INTEGER && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.ah = com.independentsoft.exchange.a.P(extendedProperty.getValue());
                    }
                }
                this.al.add(extendedProperty);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:Message>";
        if (this.e != null) {
            s += this.e.a();
        }
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.independentsoft.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.d != null) {
            s = s + "<t:Subject>" + com.independentsoft.exchange.d.a(this.d) + "</t:Subject>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.independentsoft.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.j.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.j.size(); ++i) {
                if (this.j.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.independentsoft.exchange.d.a(this.j.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.k != Importance.NONE) {
            s = s + "<t:Importance>" + com.independentsoft.exchange.a.a(this.k) + "</t:Importance>";
        }
        if (this.av != null) {
            s = s + "<t:InReplyTo>" + com.independentsoft.exchange.d.a(this.av) + "</t:InReplyTo>";
        }
        if (this.E != null) {
            s = s + "<t:ReminderDueBy>" + com.independentsoft.exchange.d.a(this.E) + "</t:ReminderDueBy>";
        }
        String s3;
        if (this.F) {
            s3 = s + "<t:ReminderIsSet>true</t:ReminderIsSet>";
        }
        else {
            s3 = s + "<t:ReminderIsSet>false</t:ReminderIsSet>";
        }
        if (this.G >= 0) {
            s3 = s3 + "<t:ReminderMinutesBeforeStart>" + this.G + "</t:ReminderMinutesBeforeStart>";
        }
        if (this.p != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        if (this.aW != FlagStatus.NONE) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_FLAG_STATUS, com.independentsoft.exchange.a.a(this.aW)).toString();
        }
        if (this.aX != FlagIcon.NONE) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_FLAG_ICON, com.independentsoft.exchange.a.a(this.aX)).toString();
        }
        if (this.aY != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_FLAG_COMPLETE, this.aY).toString();
        }
        if (this.bb != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_DEFERRED_DELIVERY_TIME, this.bb).toString();
        }
        if (this.bc != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_DEFERRED_SEND_TIME, this.bc).toString();
        }
        if (this.aZ != null) {
            s3 += new ExtendedProperty(MessagePropertyPath.FLAG_REQUEST, this.aZ).toString();
        }
        if (this.ba) {
            s3 += new ExtendedProperty(MessagePropertyPath.HIDE_ATTACHMENTS, true).toString();
        }
        if (this.bd.size() > 0) {
            s3 += new ExtendedProperty(MessagePropertyPath.MESSAGE_FLAGS, com.independentsoft.exchange.a.a(this.bd)).toString();
        }
        if (this.am.size() > 0) {
            s3 += new ExtendedProperty(MessagePropertyPath.VOTING_OPTIONS, com.independentsoft.exchange.d.b(this.am)).toString();
        }
        if (this.an != null) {
            s3 += new ExtendedProperty(MessagePropertyPath.VOTING_RESPONSE, this.an).toString();
        }
        if (this.ao != null) {
            s3 += new ExtendedProperty(MessagePropertyPath.START_DATE, this.ao).toString();
        }
        if (this.ap != null) {
            s3 += new ExtendedProperty(MessagePropertyPath.DUE_DATE, this.ap).toString();
        }
        if (this.D != null && this.D.length > 0) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_RTF_COMPRESSED, com.independentsoft.exchange.d.a(this.D)).toString();
        }
        for (int j = 0; j < this.al.size(); ++j) {
            s3 += this.al.get(j).toString();
        }
        if (this.H != null) {
            s3 += this.H.a();
        }
        if (this.J != null) {
            s3 += this.J.a("PolicyTag");
        }
        if (this.K != null) {
            s3 += this.K.a("ArchiveTag");
        }
        if (this.L != null) {
            s3 = s3 + "<t:RetentionDate>" + com.independentsoft.exchange.d.a(this.L) + "</t:RetentionDate>";
        }
        if (this.aG != null) {
            s3 = s3 + "<t:Sender>" + this.aG.a("t:Mailbox") + "</t:Sender>";
        }
        if (this.aH.size() > 0) {
            String s4 = s3 + "<t:ToRecipients>";
            for (int k = 0; k < this.aH.size(); ++k) {
                s4 += this.aH.get(k).a("t:Mailbox");
            }
            s3 = s4 + "</t:ToRecipients>";
        }
        if (this.aI.size() > 0) {
            String s5 = s3 + "<t:CcRecipients>";
            for (int l = 0; l < this.aI.size(); ++l) {
                s5 += this.aI.get(l).a("t:Mailbox");
            }
            s3 = s5 + "</t:CcRecipients>";
        }
        if (this.aJ.size() > 0) {
            String s6 = s3 + "<t:BccRecipients>";
            for (int n = 0; n < this.aJ.size(); ++n) {
                s6 += this.aJ.get(n).a("t:Mailbox");
            }
            s3 = s6 + "</t:BccRecipients>";
        }
        if (this.aK) {
            s3 += "<t:IsReadReceiptRequested>true</t:IsReadReceiptRequested>";
        }
        if (this.aL) {
            s3 += "<t:IsDeliveryReceiptRequested>true</t:IsDeliveryReceiptRequested>";
        }
        if (this.aO != null) {
            s3 = s3 + "<t:From>" + this.aO.a("t:Mailbox") + "</t:From>";
        }
        if (this.aQ) {
            s3 += "<t:IsRead>true</t:IsRead>";
        }
        String s7;
        if (this.aR) {
            s7 = s3 + "<t:IsResponseRequested>true</t:IsResponseRequested>";
        }
        else {
            s7 = s3 + "<t:IsResponseRequested>false</t:IsResponseRequested>";
        }
        if (this.aS != null) {
            s7 = s7 + "<t:References>" + com.independentsoft.exchange.d.a(this.aS) + "</t:References>";
        }
        if (this.aT.size() > 0) {
            String s8 = s7 + "<t:ReplyTo>";
            for (int n2 = 0; n2 < this.aT.size(); ++n2) {
                s8 += this.aT.get(n2).a("t:Mailbox");
            }
            s7 = s8 + "</t:ReplyTo>";
        }
        return s7 + "</t:Message>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public Date getReceivedTime() {
        return this.au;
    }
    
    public String getInReplyTo() {
        return this.av;
    }
    
    public void setInReplyTo(final String inReplyTo) {
        this.av = inReplyTo;
    }
    
    public boolean isSubmitted() {
        return this.aw;
    }
    
    public boolean isDraft() {
        return this.ax;
    }
    
    public boolean isFromMe() {
        return this.ay;
    }
    
    public boolean isResend() {
        return this.az;
    }
    
    public boolean isUnmodified() {
        return this.aA;
    }
    
    public List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.aB;
    }
    
    public Date getSentTime() {
        return this.aC;
    }
    
    public List<ResponseItem> getResponseItems() {
        return this.aD;
    }
    
    public String getDisplayCc() {
        return this.aE;
    }
    
    public String getDisplayTo() {
        return this.aF;
    }
    
    public Mailbox getSender() {
        return this.aG;
    }
    
    public void setSender(final Mailbox sender) {
        this.aG = sender;
    }
    
    public List<Mailbox> getToRecipients() {
        return this.aH;
    }
    
    public List<Mailbox> getCcRecipients() {
        return this.aI;
    }
    
    public List<Mailbox> getBccRecipients() {
        return this.aJ;
    }
    
    public boolean isReadReceiptRequested() {
        return this.aK;
    }
    
    public void setReadReceiptRequested(final boolean isReadReceiptRequested) {
        this.aK = isReadReceiptRequested;
    }
    
    public boolean isDeliveryReceiptRequested() {
        return this.aL;
    }
    
    public void setDeliveryReceiptRequested(final boolean isDeliveryReceiptRequested) {
        this.aL = isDeliveryReceiptRequested;
    }
    
    public String getConversationIndex() {
        return this.aM;
    }
    
    public String getConversationTopic() {
        return this.aN;
    }
    
    public Mailbox getFrom() {
        return this.aO;
    }
    
    public void setFrom(final Mailbox from) {
        this.aO = from;
    }
    
    public String getInternetMessageId() {
        return this.aP;
    }
    
    public boolean isRead() {
        return this.aQ;
    }
    
    public void setRead(final boolean isRead) {
        this.aQ = isRead;
    }
    
    public boolean isResponseRequested() {
        return this.aR;
    }
    
    public void setResponseRequested(final boolean isResponseRequested) {
        this.aR = isResponseRequested;
    }
    
    public String getReferences() {
        return this.aS;
    }
    
    public void setReferences(final String references) {
        this.aS = references;
    }
    
    public List<Mailbox> getReplyTo() {
        return this.aT;
    }
    
    public LastVerbExecuted getLastVerbExecuted() {
        return this.aU;
    }
    
    public String getInReplyToId() {
        return this.aV;
    }
    
    public FlagStatus getFlagStatus() {
        return this.aW;
    }
    
    public void setFlagStatus(final FlagStatus flagStatus) {
        this.aW = flagStatus;
    }
    
    public FlagIcon getFlagIcon() {
        return this.aX;
    }
    
    public void setFlagIcon(final FlagIcon flagIcon) {
        this.aX = flagIcon;
    }
    
    public Date getFlagCompleteTime() {
        return this.aY;
    }
    
    public void setFlagCompleteTime(final Date flagCompleteTime) {
        this.aY = flagCompleteTime;
    }
    
    public String getFlagRequest() {
        return this.aZ;
    }
    
    public void setFlagRequest(final String flagRequest) {
        this.aZ = flagRequest;
    }
    
    public boolean getHideAttachments() {
        return this.ba;
    }
    
    public void setHideAttachments(final boolean hideAttachments) {
        this.ba = hideAttachments;
    }
    
    public List<String> getVotingOptions() {
        return this.am;
    }
    
    public void setVotingOptions(final List<String> votingOptions) {
        this.am = votingOptions;
    }
    
    public String getVotingResponse() {
        return this.an;
    }
    
    public void setVotingResponse(final String votingResponse) {
        this.an = votingResponse;
    }
    
    public Date getDeferredDeliveryTime() {
        return this.bb;
    }
    
    public void setDeferredDeliveryTime(final Date deferredDeliveryTime) {
        this.bb = deferredDeliveryTime;
    }
    
    public Date getDeferredSendTime() {
        return this.bc;
    }
    
    public void setDeferredSendTime(final Date deferredSendTime) {
        this.bc = deferredSendTime;
    }
    
    public Date getStartDate() {
        return this.ao;
    }
    
    public void setStartDate(final Date startDate) {
        this.ao = startDate;
    }
    
    public Date getDueDate() {
        return this.ap;
    }
    
    public void setDueDate(final Date dueDate) {
        this.ap = dueDate;
    }
    
    public List<MessageFlag> getMessageFlags() {
        return this.bd;
    }
    
    public Mailbox getReceivedBy() {
        return this.be;
    }
    
    public Mailbox getReceivedRepresenting() {
        return this.bf;
    }
}

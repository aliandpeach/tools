package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import java.nio.charset.*;
import java.nio.*;

public class MeetingRequest extends MeetingMessage
{
    private MeetingRequestType bg;
    private LegacyFreeBusy bh;
    private ChangeHighlights bi;
    private Date bj;
    private Date bk;
    private Date bl;
    private Date bm;
    private Date bn;
    private Date bo;
    private boolean bp;
    private LegacyFreeBusy bq;
    private String br;
    private String bs;
    private boolean bt;
    private boolean bu;
    private boolean bv;
    private boolean bw;
    private InstanceType bx;
    private ResponseType by;
    private Mailbox bz;
    private List<Attendee> bA;
    private List<Attendee> bB;
    private List<Attendee> bC;
    private int bD;
    private int bE;
    private List<Item> bF;
    private List<Item> bG;
    private String bH;
    private String bI;
    private Date bJ;
    private int bK;
    private int bL;
    private Recurrence bM;
    private Occurrence bN;
    private Occurrence bO;
    private List<Occurrence> bP;
    private List<DeletedOccurrence> bQ;
    private TimeZone bR;
    private TimeZoneDefinition bS;
    private TimeZoneDefinition bT;
    private int bU;
    private boolean bV;
    private boolean bW;
    private String bX;
    private String bY;
    private EnhancedLocation bZ;
    private String ca;
    private OnlineMeetingSettings cb;
    private boolean cc;
    private BusyStatus cd;
    private MeetingStatus ce;
    private ResponseStatus cf;
    private Date cg;
    private Date ch;
    private boolean ci;
    private boolean cj;
    private String ck;
    private int cl;
    private String cm;
    private Date cn;
    private Date co;
    private Priority cp;
    
    private MeetingRequest() {
        this.bg = MeetingRequestType.NONE;
        this.bh = LegacyFreeBusy.NONE;
        this.bq = LegacyFreeBusy.NONE;
        this.bx = InstanceType.NONE;
        this.by = ResponseType.NONE;
        this.bA = new ArrayList<Attendee>();
        this.bB = new ArrayList<Attendee>();
        this.bC = new ArrayList<Attendee>();
        this.bF = new ArrayList<Item>();
        this.bG = new ArrayList<Item>();
        this.bP = new ArrayList<Occurrence>();
        this.bQ = new ArrayList<DeletedOccurrence>();
        this.cd = BusyStatus.NONE;
        this.ce = MeetingStatus.NONE;
        this.cf = ResponseStatus.NONE;
        this.cl = -1;
        this.cp = Priority.NONE;
    }
    
    MeetingRequest(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.bg = MeetingRequestType.NONE;
        this.bh = LegacyFreeBusy.NONE;
        this.bq = LegacyFreeBusy.NONE;
        this.bx = InstanceType.NONE;
        this.by = ResponseType.NONE;
        this.bA = new ArrayList<Attendee>();
        this.bB = new ArrayList<Attendee>();
        this.bC = new ArrayList<Attendee>();
        this.bF = new ArrayList<Item>();
        this.bG = new ArrayList<Item>();
        this.bP = new ArrayList<Occurrence>();
        this.bQ = new ArrayList<DeletedOccurrence>();
        this.cd = BusyStatus.NONE;
        this.ce = MeetingStatus.NONE;
        this.cf = ResponseStatus.NONE;
        this.cl = -1;
        this.cp = Priority.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(reader, "ItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ParentFolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(reader, "ParentFolderId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemClass") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Subject") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MimeContent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new MimeContent(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Sensitivity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.f = com.independentsoft.exchange.a.N(elementText);
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Size") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.i = Integer.parseInt(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Categories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.j.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Categories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Importance") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.k = com.independentsoft.exchange.a.O(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTimeCreated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.l = com.independentsoft.exchange.d.c(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasAttachments") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.m = Boolean.parseBoolean(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Culture") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.n = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReminderDueBy") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = reader.getElementText()) != null && elementText6.length() > 0) {
                    this.E = com.independentsoft.exchange.d.c(elementText6);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReminderIsSet") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = reader.getElementText()) != null && elementText7.length() > 0) {
                    this.F = Boolean.parseBoolean(elementText7);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReminderMinutesBeforeStart") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = reader.getElementText()) != null && elementText8.length() > 0) {
                    this.G = Integer.parseInt(elementText8);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTimeReceived") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    this.au = com.independentsoft.exchange.d.c(elementText9);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InReplyTo") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.av = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsSubmitted") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = reader.getElementText()) != null && elementText10.length() > 0) {
                    this.aw = Boolean.parseBoolean(elementText10);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsDraft") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = reader.getElementText()) != null && elementText11.length() > 0) {
                    this.ax = Boolean.parseBoolean(elementText11);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsFromMe") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = reader.getElementText()) != null && elementText12.length() > 0) {
                    this.ay = Boolean.parseBoolean(elementText12);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsResend") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = reader.getElementText()) != null && elementText13.length() > 0) {
                    this.az = Boolean.parseBoolean(elementText13);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsUnmodified") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = reader.getElementText()) != null && elementText14.length() > 0) {
                    this.aA = Boolean.parseBoolean(elementText14);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeaders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeader") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final InternetMessageHeader internetMessageHeader;
                        (internetMessageHeader = new InternetMessageHeader()).setName(reader.getAttributeValue(null, "HeaderName"));
                        internetMessageHeader.setValue(reader.getElementText());
                        this.aB.add(internetMessageHeader);
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageHeaders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTimeSent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = reader.getElementText()) != null && elementText15.length() > 0) {
                    this.aC = com.independentsoft.exchange.d.c(elementText15);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseObjects") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AcceptItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new AcceptItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TentativelyAcceptItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new TentativelyAcceptItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeclineItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new DeclineItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReplyToItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ReplyItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ForwardItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ForwardItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReplyAllToItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new ReplyAllItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CancelCalendarItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new CancelItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RemoveItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new RemoveItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SuppressReadReceipt") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new SuppressReadReceipt(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PostReplyItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new PostReplyItem(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AcceptSharingInvitation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aD.add(new AcceptSharingInvitation(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseObjects") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DisplayCc") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aE = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DisplayTo") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aF = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Sender") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aG = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aH.add(new Mailbox(reader));
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
                        this.aI.add(new Mailbox(reader));
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
                        this.aJ.add(new Mailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BccRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsReadReceiptRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = reader.getElementText()) != null && elementText16.length() > 0) {
                    this.aK = Boolean.parseBoolean(elementText16);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsDeliveryReceiptRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = reader.getElementText()) != null && elementText17.length() > 0) {
                    this.aL = Boolean.parseBoolean(elementText17);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConversationIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aM = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConversationTopic") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aN = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("From") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aO = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternetMessageId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aP = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsRead") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = reader.getElementText()) != null && elementText18.length() > 0) {
                    this.aQ = Boolean.parseBoolean(elementText18);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsResponseRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = reader.getElementText()) != null && elementText19.length() > 0) {
                    this.aR = Boolean.parseBoolean(elementText19);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("References") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aS = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReplyTo") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aT.add(new Mailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReplyTo") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReceivedBy") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.be = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReceivedRepresenting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bf = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AssociatedCalendarItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.am = new ItemId(reader, "AssociatedCalendarItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsDelegated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText20;
                if ((elementText20 = reader.getElementText()) != null && elementText20.length() > 0) {
                    this.an = Boolean.parseBoolean(elementText20);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsOutOfDate") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText21;
                if ((elementText21 = reader.getElementText()) != null && elementText21.length() > 0) {
                    this.ao = Boolean.parseBoolean(elementText21);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasBeenProcessed") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText22;
                if ((elementText22 = reader.getElementText()) != null && elementText22.length() > 0) {
                    this.ap = Boolean.parseBoolean(elementText22);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText23;
                if ((elementText23 = reader.getElementText()) != null && elementText23.length() > 0) {
                    this.aq = com.independentsoft.exchange.a.B(elementText23);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingRequestType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText24;
                if ((elementText24 = reader.getElementText()) != null && elementText24.length() > 0) {
                    this.bg = com.independentsoft.exchange.a.t(elementText24);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IntendedFreeBusyStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText25;
                if ((elementText25 = reader.getElementText()) != null && elementText25.length() > 0) {
                    this.bh = com.independentsoft.exchange.a.I(elementText25);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ChangeHighlights") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bi = new ChangeHighlights(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReminderNextTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bj = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartWallClock") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bk = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndWallClock") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bl = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UID") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ar = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurrenceId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText26;
                if ((elementText26 = reader.getElementText()) != null && elementText26.length() > 0) {
                    this.as = com.independentsoft.exchange.d.c(elementText26);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTimeStamp") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText27;
                if ((elementText27 = reader.getElementText()) != null && elementText27.length() > 0) {
                    this.at = com.independentsoft.exchange.d.c(elementText27);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Start") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText28;
                if ((elementText28 = reader.getElementText()) != null && elementText28.length() > 0) {
                    this.bm = com.independentsoft.exchange.d.c(elementText28);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("End") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText29;
                if ((elementText29 = reader.getElementText()) != null && elementText29.length() > 0) {
                    this.bn = com.independentsoft.exchange.d.c(elementText29);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OriginalStart") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText30;
                if ((elementText30 = reader.getElementText()) != null && elementText30.length() > 0) {
                    this.bo = com.independentsoft.exchange.d.c(elementText30);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAllDayEvent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText31;
                if ((elementText31 = reader.getElementText()) != null && elementText31.length() > 0) {
                    this.bp = Boolean.parseBoolean(elementText31);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LegacyFreeBusyStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText32;
                if ((elementText32 = reader.getElementText()) != null && elementText32.length() > 0) {
                    this.bq = com.independentsoft.exchange.a.I(elementText32);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Location") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.br = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("When") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bs = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsMeeting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText33;
                if ((elementText33 = reader.getElementText()) != null && elementText33.length() > 0) {
                    this.bt = Boolean.parseBoolean(elementText33);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsCancelled") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText34;
                if ((elementText34 = reader.getElementText()) != null && elementText34.length() > 0) {
                    this.bu = Boolean.parseBoolean(elementText34);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsRecurring") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText35;
                if ((elementText35 = reader.getElementText()) != null && elementText35.length() > 0) {
                    this.bv = Boolean.parseBoolean(elementText35);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingRequestWasSent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText36;
                if ((elementText36 = reader.getElementText()) != null && elementText36.length() > 0) {
                    this.bw = Boolean.parseBoolean(elementText36);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsResponseRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText37;
                if ((elementText37 = reader.getElementText()) != null && elementText37.length() > 0) {
                    this.aR = Boolean.parseBoolean(elementText37);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItemType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText38;
                if ((elementText38 = reader.getElementText()) != null && elementText38.length() > 0) {
                    this.bx = com.independentsoft.exchange.a.z(elementText38);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MyResponseType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText39;
                if ((elementText39 = reader.getElementText()) != null && elementText39.length() > 0) {
                    this.by = com.independentsoft.exchange.a.B(elementText39);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Organizer") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bz = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RequiredAttendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendee") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bA.add(new Attendee(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RequiredAttendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OptionalAttendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendee") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bB.add(new Attendee(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OptionalAttendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Resources") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendee") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bC.add(new Attendee(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Resources") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConflictingMeetings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bF.add(new Appointment(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConflictingMeetings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdjacentMeetings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bG.add(new Appointment(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdjacentMeetings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConflictingMeetingCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText40;
                if ((elementText40 = reader.getElementText()) != null && elementText40.length() > 0) {
                    this.bD = Integer.parseInt(elementText40);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdjacentMeetingCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText41;
                if ((elementText41 = reader.getElementText()) != null && elementText41.length() > 0) {
                    this.bE = Integer.parseInt(elementText41);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Duration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bH = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bI = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentReplyTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText42;
                if ((elementText42 = reader.getElementText()) != null && elementText42.length() > 0) {
                    this.bJ = com.independentsoft.exchange.d.c(elementText42);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentSequenceNumber") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText43;
                if ((elementText43 = reader.getElementText()) != null && elementText43.length() > 0) {
                    this.bK = Integer.parseInt(elementText43);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentState") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText44;
                if ((elementText44 = reader.getElementText()) != null && elementText44.length() > 0) {
                    this.bL = Integer.parseInt(elementText44);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Recurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bM = new Recurrence(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FirstOccurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bN = new Occurrence(reader, "FirstOccurrence");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastOccurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bO = new Occurrence(reader, "LastOccurrence");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ModifiedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Occurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bP.add(new Occurrence(reader, "Occurrence"));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ModifiedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeletedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeletedOccurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bQ.add(new DeletedOccurrence(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeletedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bR = new TimeZone(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bS = new TimeZoneDefinition(reader, "StartTimeZone");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bT = new TimeZoneDefinition(reader, "EndTimeZone");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConferenceType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText45;
                if ((elementText45 = reader.getElementText()) != null && elementText45.length() > 0) {
                    this.bU = Integer.parseInt(elementText45);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AllowNewTimeProposal") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText46;
                if ((elementText46 = reader.getElementText()) != null && elementText46.length() > 0) {
                    this.bV = Boolean.parseBoolean(elementText46);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsOnlineMeeting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText47;
                if ((elementText47 = reader.getElementText()) != null && elementText47.length() > 0) {
                    this.bW = Boolean.parseBoolean(elementText47);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingWorkspaceUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bX = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NetShowUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bY = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EnhancedLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bZ = new EnhancedLocation(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("JoinOnlineMeetingUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ca = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OnlineMeetingSettings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.cb = new OnlineMeetingSettings(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAssociated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText48;
                if ((elementText48 = reader.getElementText()) != null && elementText48.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText48);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("WebClientEditFormQueryString") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.y = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("WebClientReadFormQueryString") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.x = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConversationId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.z = new ItemId(reader, "ConversationId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StoreEntryId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.A = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueBody") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.B = new Body(reader, "UniqueBody");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EffectiveRights") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.o = new EffectiveRights(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedName") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.r = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText49;
                if ((elementText49 = reader.getElementText()) != null && elementText49.length() > 0) {
                    this.s = com.independentsoft.exchange.d.c(elementText49);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Flag") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.H = new Flag(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InstanceKey") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.I = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PolicyTag") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.J = new RetentionTag(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ArchiveTag") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.K = new RetentionTag(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RetentionDate") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.L = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Preview") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.M = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NextPredictedAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText50;
                if ((elementText50 = reader.getElementText()) != null && elementText50.length() > 0) {
                    this.N = com.independentsoft.exchange.a.C(elementText50);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupingAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText51;
                if ((elementText51 = reader.getElementText()) != null && elementText51.length() > 0) {
                    this.O = com.independentsoft.exchange.a.C(elementText51);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BlockStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText52;
                if ((elementText52 = reader.getElementText()) != null && elementText52.length() > 0) {
                    this.P = Boolean.parseBoolean(elementText52);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasBlockedImages") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText53;
                if ((elementText53 = reader.getElementText()) != null && elementText53.length() > 0) {
                    this.Q = Boolean.parseBoolean(elementText53);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TextBody") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.R = new Body(reader, "TextBody");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText54;
                if ((elementText54 = reader.getElementText()) != null && elementText54.length() > 0) {
                    this.S = com.independentsoft.exchange.a.D(elementText54);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExtendedProperty") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final ExtendedProperty extendedProperty;
                if ((extendedProperty = new ExtendedProperty(reader)).getPropertyPath() instanceof PropertyTag) {
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
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_PRIORITY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_PRIORITY.getType() && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.cp = com.independentsoft.exchange.a.M(extendedProperty.getValue());
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof PropertyId) {
                    final PropertyId propertyId;
                    if ((propertyId = (PropertyId)extendedProperty.getPropertyPath()).getId() == 34054 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cc = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33285 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cd = com.independentsoft.exchange.a.A(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33304 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cf = com.independentsoft.exchange.a.G(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33303 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ce = com.independentsoft.exchange.a.H(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34070 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cg = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34071 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ch = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34076 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ci = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34078 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cj = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34079 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING) {
                        this.ck = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 33300 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cl = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33330 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.STRING) {
                        this.cm = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 33333 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.cn = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33334 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.co = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34096 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING) {
                        this.aZ = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 34068 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.ba = Boolean.parseBoolean(extendedProperty.getValue());
                    }
                }
                this.al.add(extendedProperty);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingRequest") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public MeetingRequestType getType() {
        return this.bg;
    }
    
    public LegacyFreeBusy getIntendedFreeBusyStatus() {
        return this.bh;
    }
    
    public ChangeHighlights getChangeHighlights() {
        return this.bi;
    }
    
    public Date getReminderNextTime() {
        return this.bj;
    }
    
    public Date getStartWallClock() {
        return this.bk;
    }
    
    public Date getEndWallClock() {
        return this.bl;
    }
    
    public Date getStartTime() {
        return this.bm;
    }
    
    public Date getEndTime() {
        return this.bn;
    }
    
    public Date getOriginalStartTime() {
        return this.bo;
    }
    
    public boolean isAllDayEvent() {
        return this.bp;
    }
    
    public LegacyFreeBusy getLegacyFreeBusyStatus() {
        return this.bq;
    }
    
    public String getLocation() {
        return this.br;
    }
    
    public String getWhen() {
        return this.bs;
    }
    
    public boolean isMeeting() {
        return this.bt;
    }
    
    public boolean isCancelled() {
        return this.bu;
    }
    
    public boolean isRecurring() {
        return this.bv;
    }
    
    public boolean getMeetingRequestWasSent() {
        return this.bw;
    }
    
    public InstanceType getInstanceType() {
        return this.bx;
    }
    
    public ResponseType getMyResponse() {
        return this.by;
    }
    
    public Mailbox getOrganizer() {
        return this.bz;
    }
    
    public List<Attendee> getRequiredAttendees() {
        return this.bA;
    }
    
    public List<Attendee> getOptionalAttendees() {
        return this.bB;
    }
    
    public List<Attendee> getResources() {
        return this.bC;
    }
    
    public int getConflictingMeetingCount() {
        return this.bD;
    }
    
    public int getAdjacentMeetingCount() {
        return this.bE;
    }
    
    public List<Item> getConflictingMeetings() {
        return this.bF;
    }
    
    public List<Item> getAdjacentMeetings() {
        return this.bG;
    }
    
    public String getDuration() {
        return this.bH;
    }
    
    public String getTimeZone() {
        return this.bI;
    }
    
    public Date getReplyTime() {
        return this.bJ;
    }
    
    public int getSequenceNumber() {
        return this.bK;
    }
    
    public int getState() {
        return this.bL;
    }
    
    public Recurrence getRecurrence() {
        return this.bM;
    }
    
    public Occurrence getFirstOccurrence() {
        return this.bN;
    }
    
    public Occurrence getLastOccurrence() {
        return this.bO;
    }
    
    public List<Occurrence> getModifiedOccurrences() {
        return this.bP;
    }
    
    public List<DeletedOccurrence> getDeletedOccurrences() {
        return this.bQ;
    }
    
    public TimeZone getMeetingTimeZone() {
        return this.bR;
    }
    
    public TimeZoneDefinition getStartTimeZone() {
        return this.bS;
    }
    
    public TimeZoneDefinition getEndTimeZone() {
        return this.bT;
    }
    
    public int getConferenceType() {
        return this.bU;
    }
    
    public boolean getAllowNewTimeProposal() {
        return this.bV;
    }
    
    public boolean isOnlineMeeting() {
        return this.bW;
    }
    
    public String getMeetingWorkspaceUrl() {
        return this.bX;
    }
    
    public String getNetShowUrl() {
        return this.bY;
    }
    
    public EnhancedLocation getEnhancedLocation() {
        return this.bZ;
    }
    
    public String getJoinOnlineMeetingUrl() {
        return this.ca;
    }
    
    public OnlineMeetingSettings getOnlineMeetingSettings() {
        return this.cb;
    }
    
    public BusyStatus getBusyStatus() {
        return this.cd;
    }
    
    public MeetingStatus getMeetingStatus() {
        return this.ce;
    }
    
    public ResponseStatus getResponseStatus() {
        return this.cf;
    }
    
    public boolean isPrivate() {
        return this.cc;
    }
    
    public Date getCommonStartTime() {
        return this.cg;
    }
    
    public Date getCommonEndTime() {
        return this.ch;
    }
    
    public boolean getReminderOverrideDefault() {
        return this.ci;
    }
    
    public boolean getReminderPlaySound() {
        return this.cj;
    }
    
    public String getReminderSoundFile() {
        return this.ck;
    }
    
    public int getLabel() {
        return this.cl;
    }
    
    public String getRecurrencePattern() {
        return this.cm;
    }
    
    public Date getRecurrenceStart() {
        return this.cn;
    }
    
    public Date getRecurrenceEnd() {
        return this.co;
    }
    
    public Priority getPriority() {
        return this.cp;
    }
}

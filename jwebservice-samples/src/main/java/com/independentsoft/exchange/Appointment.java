package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import java.nio.charset.*;
import java.nio.*;

public class Appointment extends Item
{
    private Date am;
    private Date an;
    private Date ao;
    private String ap;
    private Date aq;
    private Date ar;
    private Date as;
    private Date at;
    private Date au;
    private boolean av;
    private LegacyFreeBusy aw;
    private String ax;
    private String ay;
    private boolean az;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private InstanceType aE;
    private ResponseType aF;
    private Mailbox aG;
    private List<Attendee> aH;
    private List<Attendee> aI;
    private List<Attendee> aJ;
    private int aK;
    private int aL;
    private List<Item> aM;
    private List<Item> aN;
    private String aO;
    private String aP;
    private Date aQ;
    private int aR;
    private int aS;
    private Recurrence aT;
    private Occurrence aU;
    private Occurrence aV;
    private List<Occurrence> aW;
    private List<DeletedOccurrence> aX;
    private TimeZone aY;
    private TimeZoneDefinition aZ;
    private TimeZoneDefinition ba;
    private int bb;
    private boolean bc;
    private boolean bd;
    private String be;
    private String bf;
    private EnhancedLocation bg;
    private String bh;
    private OnlineMeetingSettings bi;
    private boolean bj;
    private BusyStatus bk;
    private MeetingStatus bl;
    private ResponseStatus bm;
    private Date bn;
    private Date bo;
    private boolean bp;
    private boolean bq;
    private String br;
    private int bs;
    private String bt;
    private Date bu;
    private Date bv;
    private Priority bw;
    
    public Appointment() {
        this.aw = LegacyFreeBusy.NONE;
        this.aE = InstanceType.NONE;
        this.aF = ResponseType.NONE;
        this.aH = new ArrayList<Attendee>();
        this.aI = new ArrayList<Attendee>();
        this.aJ = new ArrayList<Attendee>();
        this.aM = new ArrayList<Item>();
        this.aN = new ArrayList<Item>();
        this.aW = new ArrayList<Occurrence>();
        this.aX = new ArrayList<DeletedOccurrence>();
        this.bk = BusyStatus.NONE;
        this.bl = MeetingStatus.NONE;
        this.bm = ResponseStatus.NONE;
        this.bs = -1;
        this.bw = Priority.NONE;
    }
    
    public Appointment(final String subject) {
        this.aw = LegacyFreeBusy.NONE;
        this.aE = InstanceType.NONE;
        this.aF = ResponseType.NONE;
        this.aH = new ArrayList<Attendee>();
        this.aI = new ArrayList<Attendee>();
        this.aJ = new ArrayList<Attendee>();
        this.aM = new ArrayList<Item>();
        this.aN = new ArrayList<Item>();
        this.aW = new ArrayList<Occurrence>();
        this.aX = new ArrayList<DeletedOccurrence>();
        this.bk = BusyStatus.NONE;
        this.bl = MeetingStatus.NONE;
        this.bm = ResponseStatus.NONE;
        this.bs = -1;
        this.bw = Priority.NONE;
        this.d = subject;
    }
    
    public Appointment(final MimeContent mimeContent) {
        this.aw = LegacyFreeBusy.NONE;
        this.aE = InstanceType.NONE;
        this.aF = ResponseType.NONE;
        this.aH = new ArrayList<Attendee>();
        this.aI = new ArrayList<Attendee>();
        this.aJ = new ArrayList<Attendee>();
        this.aM = new ArrayList<Item>();
        this.aN = new ArrayList<Item>();
        this.aW = new ArrayList<Occurrence>();
        this.aX = new ArrayList<DeletedOccurrence>();
        this.bk = BusyStatus.NONE;
        this.bl = MeetingStatus.NONE;
        this.bm = ResponseStatus.NONE;
        this.bs = -1;
        this.bw = Priority.NONE;
        this.e = mimeContent;
    }
    
    Appointment(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.aw = LegacyFreeBusy.NONE;
        this.aE = InstanceType.NONE;
        this.aF = ResponseType.NONE;
        this.aH = new ArrayList<Attendee>();
        this.aI = new ArrayList<Attendee>();
        this.aJ = new ArrayList<Attendee>();
        this.aM = new ArrayList<Item>();
        this.aN = new ArrayList<Item>();
        this.aW = new ArrayList<Occurrence>();
        this.aX = new ArrayList<DeletedOccurrence>();
        this.bk = BusyStatus.NONE;
        this.bl = MeetingStatus.NONE;
        this.bm = ResponseStatus.NONE;
        this.bs = -1;
        this.bw = Priority.NONE;
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReminderNextTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.am = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartWallClock") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.an = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndWallClock") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ao = com.independentsoft.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UID") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ap = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurrenceId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    this.aq = com.independentsoft.exchange.d.c(elementText9);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateStamp") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = reader.getElementText()) != null && elementText10.length() > 0) {
                    this.ar = com.independentsoft.exchange.d.c(elementText10);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Start") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = reader.getElementText()) != null && elementText11.length() > 0) {
                    this.as = com.independentsoft.exchange.d.c(elementText11);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("End") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = reader.getElementText()) != null && elementText12.length() > 0) {
                    this.at = com.independentsoft.exchange.d.c(elementText12);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OriginalStart") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = reader.getElementText()) != null && elementText13.length() > 0) {
                    this.au = com.independentsoft.exchange.d.c(elementText13);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAllDayEvent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = reader.getElementText()) != null && elementText14.length() > 0) {
                    this.av = Boolean.parseBoolean(elementText14);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LegacyFreeBusyStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = reader.getElementText()) != null && elementText15.length() > 0) {
                    this.aw = com.independentsoft.exchange.a.I(elementText15);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Location") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ax = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("When") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ay = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsMeeting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = reader.getElementText()) != null && elementText16.length() > 0) {
                    this.az = Boolean.parseBoolean(elementText16);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsCancelled") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = reader.getElementText()) != null && elementText17.length() > 0) {
                    this.aA = Boolean.parseBoolean(elementText17);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsRecurring") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = reader.getElementText()) != null && elementText18.length() > 0) {
                    this.aB = Boolean.parseBoolean(elementText18);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingRequestWasSent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = reader.getElementText()) != null && elementText19.length() > 0) {
                    this.aC = Boolean.parseBoolean(elementText19);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsResponseRequested") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText20;
                if ((elementText20 = reader.getElementText()) != null && elementText20.length() > 0) {
                    this.aD = Boolean.parseBoolean(elementText20);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItemType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText21;
                if ((elementText21 = reader.getElementText()) != null && elementText21.length() > 0) {
                    this.aE = com.independentsoft.exchange.a.z(elementText21);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MyResponseType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText22;
                if ((elementText22 = reader.getElementText()) != null && elementText22.length() > 0) {
                    this.aF = com.independentsoft.exchange.a.B(elementText22);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Organizer") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aG = new Mailbox(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RequiredAttendees") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attendee") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aH.add(new Attendee(reader));
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
                        this.aI.add(new Attendee(reader));
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
                        this.aJ.add(new Attendee(reader));
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
                        this.aM.add(new Appointment(reader));
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
                        this.aN.add(new Appointment(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdjacentMeetings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConflictingMeetingsize()") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText23;
                if ((elementText23 = reader.getElementText()) != null && elementText23.length() > 0) {
                    this.aK = Integer.parseInt(elementText23);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdjacentMeetingsize()") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText24;
                if ((elementText24 = reader.getElementText()) != null && elementText24.length() > 0) {
                    this.aL = Integer.parseInt(elementText24);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Duration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aO = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aP = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentReplyTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText25;
                if ((elementText25 = reader.getElementText()) != null && elementText25.length() > 0) {
                    this.aQ = com.independentsoft.exchange.d.c(elementText25);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentSequenceNumber") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText26;
                if ((elementText26 = reader.getElementText()) != null && elementText26.length() > 0) {
                    this.aR = Integer.parseInt(elementText26);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AppointmentState") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText27;
                if ((elementText27 = reader.getElementText()) != null && elementText27.length() > 0) {
                    this.aS = Integer.parseInt(elementText27);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Recurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aT = new Recurrence(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FirstOccurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aU = new Occurrence(reader, "FirstOccurrence");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastOccurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aV = new Occurrence(reader, "LastOccurrence");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ModifiedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Occurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aW.add(new Occurrence(reader, "Occurrence"));
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
                        this.aX.add(new DeletedOccurrence(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeletedOccurrences") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aY = new TimeZone(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aZ = new TimeZoneDefinition(reader, "StartTimeZone");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EndTimeZone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ba = new TimeZoneDefinition(reader, "EndTimeZone");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConferenceType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText28;
                if ((elementText28 = reader.getElementText()) != null && elementText28.length() > 0) {
                    this.bb = Integer.parseInt(elementText28);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AllowNewTimeProposal") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText29;
                if ((elementText29 = reader.getElementText()) != null && elementText29.length() > 0) {
                    this.bc = Boolean.parseBoolean(elementText29);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsOnlineMeeting") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText30;
                if ((elementText30 = reader.getElementText()) != null && elementText30.length() > 0) {
                    this.bd = Boolean.parseBoolean(elementText30);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingWorkspaceUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.be = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NetShowUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bf = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EnhancedLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bg = new EnhancedLocation(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("JoinOnlineMeetingUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bh = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OnlineMeetingSettings") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bi = new OnlineMeetingSettings(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAssociated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText31;
                if ((elementText31 = reader.getElementText()) != null && elementText31.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText31);
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
                final String elementText32;
                if ((elementText32 = reader.getElementText()) != null && elementText32.length() > 0) {
                    this.s = com.independentsoft.exchange.d.c(elementText32);
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
                final String elementText33;
                if ((elementText33 = reader.getElementText()) != null && elementText33.length() > 0) {
                    this.N = com.independentsoft.exchange.a.C(elementText33);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupingAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText34;
                if ((elementText34 = reader.getElementText()) != null && elementText34.length() > 0) {
                    this.O = com.independentsoft.exchange.a.C(elementText34);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BlockStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText35;
                if ((elementText35 = reader.getElementText()) != null && elementText35.length() > 0) {
                    this.P = Boolean.parseBoolean(elementText35);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasBlockedImages") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText36;
                if ((elementText36 = reader.getElementText()) != null && elementText36.length() > 0) {
                    this.Q = Boolean.parseBoolean(elementText36);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TextBody") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.R = new Body(reader, "TextBody");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText37;
                if ((elementText37 = reader.getElementText()) != null && elementText37.length() > 0) {
                    this.S = com.independentsoft.exchange.a.D(elementText37);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EntityExtractionResult") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ak = new EntityExtractionResult(reader);
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
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_PRIORITY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_PRIORITY.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bw = com.independentsoft.exchange.a.M(extendedProperty.getValue());
                        }
                    }
                    else {
                        final String value2;
                        if (propertyTag.getTag() == MapiPropertyTag.PR_RTF_COMPRESSED.getTag() && propertyTag.getType() == MapiPropertyTag.PR_RTF_COMPRESSED.getType() && (value2 = extendedProperty.getValue()) != null && value2.length() > 0) {
                            this.D = com.independentsoft.exchange.d.e(value2);
                        }
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof PropertyId) {
                    final PropertyId propertyId;
                    if ((propertyId = (PropertyId)extendedProperty.getPropertyPath()).getId() == 34054 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bj = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34070 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bn = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34071 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bo = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33285 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bk = com.independentsoft.exchange.a.A(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33304 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bm = com.independentsoft.exchange.a.G(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33303 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bl = com.independentsoft.exchange.a.H(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34076 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bp = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34078 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bq = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34079 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING) {
                        this.br = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 33300 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.INTEGER) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bs = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33330 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.STRING) {
                        this.bt = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 33333 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.bu = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33334 && propertyId.getSet() == StandardPropertySet.APPOINTMENT && propertyId.getType() == MapiPropertyType.SYSTEM_TIME && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.bv = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                    }
                }
                this.al.add(extendedProperty);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:CalendarItem>";
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
        if (this.E != null && this.aY == null) {
            s = s + "<t:ReminderDueBy>" + com.independentsoft.exchange.d.a(this.E) + "</t:ReminderDueBy>";
        }
        else if (this.E != null) {
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
        if (this.bj) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.IS_PRIVATE, "true").toString();
        }
        if (this.bk != BusyStatus.NONE) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.BUSY_STATUS, com.independentsoft.exchange.a.a(this.bk)).toString();
        }
        if (this.bl != MeetingStatus.NONE) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.MEETING_STATUS, com.independentsoft.exchange.a.a(this.bl)).toString();
        }
        if (this.bm != ResponseStatus.NONE) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.RESPONSE_STATUS, com.independentsoft.exchange.a.a(this.bm)).toString();
        }
        if (this.bn != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.COMMON_START_TIME, this.bn).toString();
        }
        if (this.bo != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.COMMON_END_TIME, this.bo).toString();
        }
        if (this.bp) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.REMINDER_OVERRIDE_DEFAULT, "true").toString();
        }
        if (this.bq) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.REMINDER_PLAY_SOUND, "true").toString();
        }
        if (this.br != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.REMINDER_SOUND_FILE, com.independentsoft.exchange.d.a(this.br)).toString();
        }
        if (this.bs >= 0) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.LABEL, this.bs).toString();
        }
        if (this.bt != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.RECURRENCE_PATTERN, com.independentsoft.exchange.d.a(this.bt)).toString();
        }
        if (this.bu != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.RECURRENCE_START, this.bu).toString();
        }
        if (this.bv != null) {
            s3 += new ExtendedProperty(AppointmentPropertyPath.RECURRENCE_END, this.bv).toString();
        }
        if (this.p != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
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
        if (this.ap != null) {
            s3 = s3 + "<t:UID>" + com.independentsoft.exchange.d.a(this.ap) + "</t:UID>";
        }
        if (this.am != null) {
            s3 = s3 + "<t:ReminderNextTime>" + com.independentsoft.exchange.d.a(this.am) + "</t:ReminderNextTime>";
        }
        if (this.as != null && this.aY == null) {
            s3 = s3 + "<t:Start>" + com.independentsoft.exchange.d.a(this.as) + "</t:Start>";
        }
        else if (this.as != null) {
            s3 = s3 + "<t:Start>" + com.independentsoft.exchange.d.a(this.as) + "</t:Start>";
        }
        if (this.at != null && this.aY == null) {
            s3 = s3 + "<t:End>" + com.independentsoft.exchange.d.a(this.at) + "</t:End>";
        }
        else if (this.at != null) {
            s3 = s3 + "<t:End>" + com.independentsoft.exchange.d.a(this.at) + "</t:End>";
        }
        if (this.av) {
            s3 += "<t:IsAllDayEvent>true</t:IsAllDayEvent>";
        }
        if (this.aw != LegacyFreeBusy.NONE) {
            s3 = s3 + "<t:LegacyFreeBusyStatus>" + com.independentsoft.exchange.a.a(this.aw) + "</t:LegacyFreeBusyStatus>";
        }
        if (this.ax != null) {
            s3 = s3 + "<t:Location>" + com.independentsoft.exchange.d.a(this.ax) + "</t:Location>";
        }
        if (this.ay != null) {
            s3 = s3 + "<t:When>" + com.independentsoft.exchange.d.a(this.ay) + "</t:When>";
        }
        String s4;
        if (this.aD) {
            s4 = s3 + "<t:IsResponseRequested>true</t:IsResponseRequested>";
        }
        else {
            s4 = s3 + "<t:IsResponseRequested>false</t:IsResponseRequested>";
        }
        if (this.aH.size() > 0) {
            String s5 = s4 + "<t:RequiredAttendees>";
            for (int k = 0; k < this.aH.size(); ++k) {
                s5 += this.aH.get(k).a();
            }
            s4 = s5 + "</t:RequiredAttendees>";
        }
        if (this.aI.size() > 0) {
            String s6 = s4 + "<t:OptionalAttendees>";
            for (int l = 0; l < this.aI.size(); ++l) {
                s6 += this.aI.get(l).a();
            }
            s4 = s6 + "</t:OptionalAttendees>";
        }
        if (this.aJ.size() > 0) {
            String s7 = s4 + "<t:Resources>";
            for (int n = 0; n < this.aJ.size(); ++n) {
                s7 += this.aJ.get(n).a();
            }
            s4 = s7 + "</t:Resources>";
        }
        if (this.aT != null) {
            s4 += this.aT.toString();
        }
        if (this.aY != null) {
            s4 += this.aY.toString();
        }
        if (this.aZ != null) {
            s4 += this.aZ.a("StartTimeZone");
        }
        if (this.ba != null) {
            s4 += this.ba.a("EndTimeZone");
        }
        if (this.bb > 0) {
            s4 = s4 + "<t:ConferenceType>" + this.bb + "</t:ConferenceType>";
        }
        if (this.bc) {
            s4 += "<t:AllowNewTimeProposal>true</t:AllowNewTimeProposal>";
        }
        if (this.bd) {
            s4 += "<t:IsOnlineMeeting>true</t:IsOnlineMeeting>";
        }
        if (this.be != null) {
            s4 = s4 + "<t:MeetingWorkspaceUrl>" + com.independentsoft.exchange.d.a(this.be) + "</t:MeetingWorkspaceUrl>";
        }
        if (this.bf != null) {
            s4 = s4 + "<t:NetShowUrl>" + com.independentsoft.exchange.d.a(this.bf) + "</t:NetShowUrl>";
        }
        if (this.bh != null) {
            s4 = s4 + "<t:JoinOnlineMeetingUrl>" + com.independentsoft.exchange.d.a(this.bh) + "</t:JoinOnlineMeetingUrl>";
        }
        if (this.bi != null) {
            s4 += this.bi.a();
        }
        return s4 + "</t:CalendarItem>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public Date getReminderNextTime() {
        return this.am;
    }
    
    public void setReminderNextTime(final Date reminderNextTime) {
        this.am = reminderNextTime;
    }
    
    public Date getStartWallClock() {
        return this.an;
    }
    
    public Date getEndWallClock() {
        return this.ao;
    }
    
    public String getUid() {
        return this.ap;
    }
    
    public void setUid(final String uid) {
        this.ap = uid;
    }
    
    public Date getRecurrenceId() {
        return this.aq;
    }
    
    public Date getDateTimeStamp() {
        return this.ar;
    }
    
    public Date getStartTime() {
        return this.as;
    }
    
    public void setStartTime(final Date startTime) {
        this.as = startTime;
    }
    
    public Date getEndTime() {
        return this.at;
    }
    
    public void setEndTime(final Date endTime) {
        this.at = endTime;
    }
    
    public Date getOriginalStartTime() {
        return this.au;
    }
    
    public boolean isAllDayEvent() {
        return this.av;
    }
    
    public void setAllDayEvent(final boolean isAllDayEvent) {
        this.av = isAllDayEvent;
    }
    
    public LegacyFreeBusy getLegacyFreeBusy() {
        return this.aw;
    }
    
    public void setLegacyFreeBusy(final LegacyFreeBusy legacyFreeBusyStatus) {
        this.aw = legacyFreeBusyStatus;
    }
    
    public String getLocation() {
        return this.ax;
    }
    
    public void setLocation(final String location) {
        this.ax = location;
    }
    
    public String getWhen() {
        return this.ay;
    }
    
    public void setWhen(final String when) {
        this.ay = when;
    }
    
    public boolean isMeeting() {
        return this.az;
    }
    
    public boolean isCancelled() {
        return this.aA;
    }
    
    public boolean isRecurring() {
        return this.aB;
    }
    
    public boolean getMeetingRequestWasSent() {
        return this.aC;
    }
    
    public boolean isResponseRequested() {
        return this.aD;
    }
    
    public void setResponseRequested(final boolean isResponseRequested) {
        this.aD = isResponseRequested;
    }
    
    public InstanceType getInstanceType() {
        return this.aE;
    }
    
    public ResponseType getMyResponse() {
        return this.aF;
    }
    
    public Mailbox getOrganizer() {
        return this.aG;
    }
    
    public List<Attendee> getRequiredAttendees() {
        return this.aH;
    }
    
    public List<Attendee> getOptionalAttendees() {
        return this.aI;
    }
    
    public List<Attendee> getResources() {
        return this.aJ;
    }
    
    public int getConflictingMeetingCount() {
        return this.aK;
    }
    
    public int getAdjacentMeetingCount() {
        return this.aL;
    }
    
    public List<Item> getConflictingMeetings() {
        return this.aM;
    }
    
    public List<Item> getAdjacentMeetings() {
        return this.aN;
    }
    
    public String getDuration() {
        return this.aO;
    }
    
    public String getTimeZone() {
        return this.aP;
    }
    
    public Date getReplyTime() {
        return this.aQ;
    }
    
    public int getSequenceNumber() {
        return this.aR;
    }
    
    public int getState() {
        return this.aS;
    }
    
    public Recurrence getRecurrence() {
        return this.aT;
    }
    
    public void setRecurrence(final Recurrence recurrence) {
        this.aT = recurrence;
    }
    
    public Occurrence getFirstOccurrence() {
        return this.aU;
    }
    
    public Occurrence getLastOccurrence() {
        return this.aV;
    }
    
    public List<Occurrence> getModifiedOccurrences() {
        return this.aW;
    }
    
    public List<DeletedOccurrence> getDeletedOccurrences() {
        return this.aX;
    }
    
    public TimeZone getMeetingTimeZone() {
        return this.aY;
    }
    
    public void setMeetingTimeZone(final TimeZone meetingTimeZone) {
        this.aY = meetingTimeZone;
    }
    
    public TimeZoneDefinition getStartTimeZone() {
        return this.aZ;
    }
    
    public void setStartTimeZone(final TimeZoneDefinition startTimeZone) {
        this.aZ = startTimeZone;
    }
    
    public TimeZoneDefinition getEndTimeZone() {
        return this.ba;
    }
    
    public void setEndTimeZone(final TimeZoneDefinition endTimeZone) {
        this.ba = endTimeZone;
    }
    
    public int getConferenceType() {
        return this.bb;
    }
    
    public void setConferenceType(final int conferenceType) {
        this.bb = conferenceType;
    }
    
    public boolean getAllowNewTimeProposal() {
        return this.bc;
    }
    
    public void setAllowNewTimeProposal(final boolean allowNewTimeProposal) {
        this.bc = allowNewTimeProposal;
    }
    
    public boolean isOnlineMeeting() {
        return this.bd;
    }
    
    public void setOnlineMeeting(final boolean isOnlineMeeting) {
        this.bd = isOnlineMeeting;
    }
    
    public String getMeetingWorkspaceUrl() {
        return this.be;
    }
    
    public void setMeetingWorkspaceUrl(final String meetingWorkspaceUrl) {
        this.be = meetingWorkspaceUrl;
    }
    
    public String getNetShowUrl() {
        return this.bf;
    }
    
    public void setNetShowUrl(final String netShowUrl) {
        this.bf = netShowUrl;
    }
    
    public EnhancedLocation getEnhancedLocation() {
        return this.bg;
    }
    
    public void setEnhancedLocation(final EnhancedLocation enhancedLocation) {
        this.bg = enhancedLocation;
    }
    
    public String getJoinOnlineMeetingUrl() {
        return this.bh;
    }
    
    public void setJoinOnlineMeetingUrl(final String joinOnlineMeetingUrl) {
        this.bh = joinOnlineMeetingUrl;
    }
    
    public OnlineMeetingSettings getOnlineMeetingSettings() {
        return this.bi;
    }
    
    public void setOnlineMeetingSettings(final OnlineMeetingSettings onlineMeetingSettings) {
        this.bi = onlineMeetingSettings;
    }
    
    public BusyStatus getBusyStatus() {
        return this.bk;
    }
    
    public void setBusyStatus(final BusyStatus busyStatus) {
        this.bk = busyStatus;
    }
    
    public MeetingStatus getMeetingStatus() {
        return this.bl;
    }
    
    public void setMeetingStatus(final MeetingStatus meetingStatus) {
        this.bl = meetingStatus;
    }
    
    public ResponseStatus getResponseStatus() {
        return this.bm;
    }
    
    public void setResponseStatus(final ResponseStatus responseStatus) {
        this.bm = responseStatus;
    }
    
    public boolean isPrivate() {
        return this.bj;
    }
    
    public void setPrivate(final boolean isPrivate) {
        this.bj = isPrivate;
    }
    
    public Date getCommonStartTime() {
        return this.bn;
    }
    
    public void setCommonStartTime(final Date commonStartTime) {
        this.bn = commonStartTime;
    }
    
    public Date getCommonEndTime() {
        return this.bo;
    }
    
    public void setCommonEndTime(final Date commonEndTime) {
        this.bo = commonEndTime;
    }
    
    public boolean getReminderOverrideDefault() {
        return this.bp;
    }
    
    public void setReminderOverrideDefault(final boolean reminderOverrideDefault) {
        this.bp = reminderOverrideDefault;
    }
    
    public boolean getReminderPlaySound() {
        return this.bq;
    }
    
    public void setReminderPlaySound(final boolean reminderPlaySound) {
        this.bq = reminderPlaySound;
    }
    
    public String getReminderSoundFile() {
        return this.br;
    }
    
    public void setReminderSoundFile(final String reminderSoundFile) {
        this.br = reminderSoundFile;
    }
    
    public int getLabel() {
        return this.bs;
    }
    
    public void setLabel(final int label) {
        this.bs = label;
    }
    
    public String getRecurrencePattern() {
        return this.bt;
    }
    
    public void setRecurrencePattern(final String recurrencePattern) {
        this.bt = recurrencePattern;
    }
    
    public Date getRecurrenceStart() {
        return this.bu;
    }
    
    public void setRecurrenceStart(final Date recurrenceStart) {
        this.bu = recurrenceStart;
    }
    
    public Date getRecurrenceEnd() {
        return this.bv;
    }
    
    public void setRecurrenceEnd(final Date recurrenceEnd) {
        this.bv = recurrenceEnd;
    }
    
    public Priority getPriority() {
        return this.bw;
    }
    
    public void setPriority(final Priority priority) {
        this.bw = priority;
    }
}

package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import java.nio.charset.*;
import java.nio.*;

public class Task extends Item
{
    private int am;
    private Date an;
    private String ao;
    private int ap;
    private List<String> aq;
    private Date ar;
    private List<String> as;
    private TaskDelegateState at;
    private String au;
    private Date av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    private String aA;
    private String aB;
    private double aC;
    private TaskRecurrence aD;
    private Date aE;
    private TaskStatus aF;
    private String aG;
    private int aH;
    private boolean aI;
    private Date aJ;
    private Date aK;
    private boolean aL;
    private boolean aM;
    private String aN;
    private Date aO;
    private Priority aP;
    
    public Task() {
        this.aq = new ArrayList<String>();
        this.as = new ArrayList<String>();
        this.at = TaskDelegateState.NONE;
        this.aF = TaskStatus.NONE;
        this.aP = Priority.NONE;
    }
    
    public Task(final String subject) {
        this.aq = new ArrayList<String>();
        this.as = new ArrayList<String>();
        this.at = TaskDelegateState.NONE;
        this.aF = TaskStatus.NONE;
        this.aP = Priority.NONE;
        this.d = subject;
    }
    
    public Task(final MimeContent mimeContent) {
        this.aq = new ArrayList<String>();
        this.as = new ArrayList<String>();
        this.at = TaskDelegateState.NONE;
        this.aF = TaskStatus.NONE;
        this.aP = Priority.NONE;
        this.e = mimeContent;
    }
    
    Task(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.aq = new ArrayList<String>();
        this.as = new ArrayList<String>();
        this.at = TaskDelegateState.NONE;
        this.aF = TaskStatus.NONE;
        this.aP = Priority.NONE;
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ActualWork") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    this.am = Integer.parseInt(elementText9);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AssignedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = reader.getElementText()) != null && elementText10.length() > 0) {
                    this.an = com.independentsoft.exchange.d.c(elementText10);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BillingInformation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ao = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ChangeCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = reader.getElementText()) != null && elementText11.length() > 0) {
                    this.ap = Integer.parseInt(elementText11);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Companies") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.aq.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Companies") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CompleteDate") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = reader.getElementText()) != null && elementText12.length() > 0) {
                    this.ar = com.independentsoft.exchange.d.c(elementText12);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contacts") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.as.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contacts") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DelegationState") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = reader.getElementText()) != null && elementText13.length() > 0) {
                    final String s;
                    this.at = ((s = elementText13).equals("Accepted") ? TaskDelegateState.ACCEPTED : (s.equals("Declined") ? TaskDelegateState.DECLINED : (s.equals("NoMatch") ? TaskDelegateState.NO_MATCH : (s.equals("Owned") ? TaskDelegateState.OWNED : (s.equals("OwnNew") ? TaskDelegateState.OWN_NEW : TaskDelegateState.NONE)))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Delegator") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.au = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DueDate") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = reader.getElementText()) != null && elementText14.length() > 0) {
                    this.av = com.independentsoft.exchange.d.c(elementText14);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAssignmentEditable") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                if (reader.getElementText().equals("0")) {
                    this.aw = true;
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsComplete") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = reader.getElementText()) != null && elementText15.length() > 0) {
                    this.ax = Boolean.parseBoolean(elementText15);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsRecurring") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = reader.getElementText()) != null && elementText16.length() > 0) {
                    this.ay = Boolean.parseBoolean(elementText16);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsTeamTask") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = reader.getElementText()) != null && elementText17.length() > 0) {
                    this.az = Boolean.parseBoolean(elementText17);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Mileage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aA = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Owner") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aB = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PercentComplete") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = reader.getElementText()) != null && elementText18.length() > 0) {
                    this.aC = Double.parseDouble(elementText18);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Recurrence") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aD = new TaskRecurrence(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StartDate") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = reader.getElementText()) != null && elementText19.length() > 0) {
                    this.aE = com.independentsoft.exchange.d.c(elementText19);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Status") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText20;
                if ((elementText20 = reader.getElementText()) != null && elementText20.length() > 0) {
                    final String s2;
                    this.aF = ((s2 = elementText20).equals("Completed") ? TaskStatus.COMPLETED : (s2.equals("Deferred") ? TaskStatus.DEFERRED : (s2.equals("InProgress") ? TaskStatus.IN_PROGRESS : (s2.equals("NotStarted") ? TaskStatus.NOT_STARTED : (s2.equals("WaitingOnOthers") ? TaskStatus.WAITING_ON_OTHERS : TaskStatus.NONE)))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StatusDescription") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aG = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TotalWork") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText21;
                if ((elementText21 = reader.getElementText()) != null && elementText21.length() > 0) {
                    this.aH = Integer.parseInt(elementText21);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAssociated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText22;
                if ((elementText22 = reader.getElementText()) != null && elementText22.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText22);
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
                final String elementText23;
                if ((elementText23 = reader.getElementText()) != null && elementText23.length() > 0) {
                    this.s = com.independentsoft.exchange.d.c(elementText23);
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
                final String elementText24;
                if ((elementText24 = reader.getElementText()) != null && elementText24.length() > 0) {
                    this.N = com.independentsoft.exchange.a.C(elementText24);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupingAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText25;
                if ((elementText25 = reader.getElementText()) != null && elementText25.length() > 0) {
                    this.O = com.independentsoft.exchange.a.C(elementText25);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BlockStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText26;
                if ((elementText26 = reader.getElementText()) != null && elementText26.length() > 0) {
                    this.P = Boolean.parseBoolean(elementText26);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasBlockedImages") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText27;
                if ((elementText27 = reader.getElementText()) != null && elementText27.length() > 0) {
                    this.Q = Boolean.parseBoolean(elementText27);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TextBody") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.R = new Body(reader, "TextBody");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText28;
                if ((elementText28 = reader.getElementText()) != null && elementText28.length() > 0) {
                    this.S = com.independentsoft.exchange.a.D(elementText28);
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
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_PRIORITY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_PRIORITY.getType() && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.aP = com.independentsoft.exchange.a.M(extendedProperty.getValue());
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof PropertyId) {
                    final PropertyId propertyId;
                    if ((propertyId = (PropertyId)extendedProperty.getPropertyPath()).getId() == 34054 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aI = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34070 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aJ = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34071 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aK = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34076 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aL = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34078 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aM = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34079 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING) {
                        this.aN = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 34050 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.aO = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33055 && propertyId.getSet() == StandardPropertySet.TASK && propertyId.getType() == MapiPropertyType.STRING) {
                        this.aB = extendedProperty.getValue();
                    }
                    else if (propertyId.getId() == 33027 && propertyId.getSet() == StandardPropertySet.TASK && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.az = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33052 && propertyId.getSet() == StandardPropertySet.TASK && propertyId.getType() == MapiPropertyType.BOOLEAN) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.ax = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 33062 && propertyId.getSet() == StandardPropertySet.TASK && propertyId.getType() == MapiPropertyType.BOOLEAN && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.ay = Boolean.parseBoolean(extendedProperty.getValue());
                    }
                }
                this.al.add(extendedProperty);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Task") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:Task>";
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
        if (this.p != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s3 += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        if (this.aI) {
            s3 += new ExtendedProperty(TaskPropertyPath.IS_PRIVATE, "true").toString();
        }
        if (this.aJ != null) {
            s3 += new ExtendedProperty(TaskPropertyPath.COMMON_START_DATE, this.aJ).toString();
        }
        if (this.aK != null) {
            s3 += new ExtendedProperty(TaskPropertyPath.COMMON_END_DATE, this.aK).toString();
        }
        if (this.aL) {
            s3 += new ExtendedProperty(TaskPropertyPath.REMINDER_OVERRIDE_DEFAULT, "true").toString();
        }
        if (this.aM) {
            s3 += new ExtendedProperty(TaskPropertyPath.REMINDER_PLAY_SOUND, "true").toString();
        }
        if (this.aN != null) {
            s3 += new ExtendedProperty(TaskPropertyPath.REMINDER_SOUND_FILE, com.independentsoft.exchange.d.a(this.aN)).toString();
        }
        if (this.aB != null) {
            s3 += new ExtendedProperty(TaskPropertyPath.OWNER, com.independentsoft.exchange.d.a(this.aB)).toString();
        }
        if (this.az) {
            s3 += new ExtendedProperty(TaskPropertyPath.IS_TEAM_TASK, "true").toString();
        }
        if (this.ax) {
            s3 += new ExtendedProperty(TaskPropertyPath.IS_COMPLETE, "true").toString();
        }
        if (this.ay) {
            s3 += new ExtendedProperty(TaskPropertyPath.IS_RECURRING, "true").toString();
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
        if (this.am > 0) {
            s3 = s3 + "<t:ActualWork>" + this.am + "</t:ActualWork>";
        }
        if (this.ao != null) {
            s3 = s3 + "<t:BillingInformation>" + com.independentsoft.exchange.d.a(this.ao) + "</t:BillingInformation>";
        }
        if (this.aq.size() > 0) {
            String s4 = s3 + "<t:Companies>";
            for (int k = 0; k < this.aq.size(); ++k) {
                if (this.aq.get(k) != null) {
                    s4 = s4 + "<t:String>" + com.independentsoft.exchange.d.a(this.aq.get(k)) + "</t:String>";
                }
            }
            s3 = s4 + "</t:Companies>";
        }
        if (this.ar != null) {
            s3 = s3 + "<t:CompleteDate>" + com.independentsoft.exchange.d.a(this.ar) + "</t:CompleteDate>";
        }
        if (this.as.size() > 0) {
            String s5 = s3 + "<t:Contacts>";
            for (int l = 0; l < this.as.size(); ++l) {
                if (this.as.get(l) != null) {
                    s5 = s5 + "<t:String>" + com.independentsoft.exchange.d.a(this.as.get(l)) + "</t:String>";
                }
            }
            s3 = s5 + "</t:Contacts>";
        }
        if (this.av != null) {
            s3 = s3 + "<t:DueDate>" + com.independentsoft.exchange.d.a(this.av) + "</t:DueDate>";
        }
        if (this.aA != null) {
            s3 = s3 + "<t:Mileage>" + com.independentsoft.exchange.d.a(this.aA) + "</t:Mileage>";
        }
        if (this.aC > 0.0) {
            s3 = s3 + "<t:PercentComplete>" + this.aC + "</t:PercentComplete>";
        }
        if (this.aD != null) {
            s3 += this.aD.toString();
        }
        if (this.aE != null) {
            s3 = s3 + "<t:StartDate>" + com.independentsoft.exchange.d.a(this.aE) + "</t:StartDate>";
        }
        if (this.aF != TaskStatus.NONE) {
            s3 = s3 + "<t:Status>" + com.independentsoft.exchange.a.a(this.aF) + "</t:Status>";
        }
        if (this.aH > 0) {
            s3 = s3 + "<t:TotalWork>" + this.aH + "</t:TotalWork>";
        }
        return s3 + "</t:Task>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public int getActualWork() {
        return this.am;
    }
    
    public void setActualWork(final int actualWork) {
        this.am = actualWork;
    }
    
    public Date getAssignedTime() {
        return this.an;
    }
    
    public String getBillingInformation() {
        return this.ao;
    }
    
    public void setBillingInformation(final String billingInformation) {
        this.ao = billingInformation;
    }
    
    public int getChangeCount() {
        return this.ap;
    }
    
    public List<String> getCompanies() {
        return this.aq;
    }
    
    public void setCompanies(final List<String> companies) {
        this.aq = companies;
    }
    
    public Date getCompleteDate() {
        return this.ar;
    }
    
    public void setCompleteDate(final Date completeDate) {
        this.ar = completeDate;
    }
    
    public List<String> getContacts() {
        return this.as;
    }
    
    public void setContacts(final List<String> contacts) {
        this.as = contacts;
    }
    
    public TaskDelegateState getDelegationState() {
        return this.at;
    }
    
    public String getDelegator() {
        return this.au;
    }
    
    public Date getDueDate() {
        return this.av;
    }
    
    public void setDueDate(final Date dueDate) {
        this.av = dueDate;
    }
    
    public boolean isAssignmentEditable() {
        return this.aw;
    }
    
    public boolean isComplete() {
        return this.ax;
    }
    
    public void setComplete(final boolean isComplete) {
        this.ax = isComplete;
    }
    
    public boolean isRecurring() {
        return this.ay;
    }
    
    public void setRecurring(final boolean isRecurring) {
        this.ay = isRecurring;
    }
    
    public boolean isTeamTask() {
        return this.az;
    }
    
    public void setTeamTask(final boolean isTeamTask) {
        this.az = isTeamTask;
    }
    
    public String getMileage() {
        return this.aA;
    }
    
    public void setMileage(final String mileage) {
        this.aA = mileage;
    }
    
    public String getOwner() {
        return this.aB;
    }
    
    public void setOwner(final String owner) {
        this.aB = owner;
    }
    
    public double getPercentComplete() {
        return this.aC;
    }
    
    public void setPercentComplete(final double percentComplete) {
        this.aC = percentComplete;
    }
    
    public TaskRecurrence getRecurrence() {
        return this.aD;
    }
    
    public void setRecurrence(final TaskRecurrence recurrence) {
        this.aD = recurrence;
    }
    
    public Date getStartDate() {
        return this.aE;
    }
    
    public void setStartDate(final Date startDate) {
        this.aE = startDate;
    }
    
    public TaskStatus getStatus() {
        return this.aF;
    }
    
    public void setStatus(final TaskStatus status) {
        this.aF = status;
    }
    
    public String getStatusDescription() {
        return this.aG;
    }
    
    public int getTotalWork() {
        return this.aH;
    }
    
    public void setTotalWork(final int totalWork) {
        this.aH = totalWork;
    }
    
    public boolean isPrivate() {
        return this.aI;
    }
    
    public void setPrivate(final boolean isPrivate) {
        this.aI = isPrivate;
    }
    
    public Date getCommonStartDate() {
        return this.aJ;
    }
    
    public void setCommonStartDate(final Date commonStartDate) {
        this.aJ = commonStartDate;
    }
    
    public Date getCommonEndDate() {
        return this.aK;
    }
    
    public void setCommonEndDate(final Date commonEndDate) {
        this.aK = commonEndDate;
    }
    
    public boolean getReminderOverrideDefault() {
        return this.aL;
    }
    
    public void setReminderOverrideDefault(final boolean reminderOverrideDefault) {
        this.aL = reminderOverrideDefault;
    }
    
    public boolean getReminderPlaySound() {
        return this.aM;
    }
    
    public void setReminderPlaySound(final boolean reminderPlaySound) {
        this.aM = reminderPlaySound;
    }
    
    public String getReminderSoundFile() {
        return this.aN;
    }
    
    public void setReminderSoundFile(final String reminderSoundFile) {
        this.aN = reminderSoundFile;
    }
    
    public Date getReminderTime() {
        return this.aO;
    }
    
    public void setReminderTime(final Date reminderTime) {
        this.aO = reminderTime;
    }
    
    public Priority getPriority() {
        return this.aP;
    }
    
    public void setPriority(final Priority priority) {
        this.aP = priority;
    }
}

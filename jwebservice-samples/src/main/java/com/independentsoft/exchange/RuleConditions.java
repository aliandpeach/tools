package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class RuleConditions
{
    private List<String> a;
    private List<String> b;
    private List<String> c;
    private List<String> d;
    private List<String> e;
    private List<String> f;
    private List<String> g;
    private FlaggedForAction h;
    private List<Mailbox> i;
    private List<String> j;
    private boolean k;
    private Importance l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private List<String> x;
    private List<String> y;
    private boolean z;
    private boolean A;
    private boolean B;
    private List<Mailbox> C;
    private boolean D;
    private boolean E;
    private Sensitivity F;
    private RulePredicateDateRange G;
    private RulePredicateSizeRange H;
    
    public RuleConditions() {
        this.a = new ArrayList<String>();
        this.b = new ArrayList<String>();
        this.c = new ArrayList<String>();
        this.d = new ArrayList<String>();
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
        this.h = FlaggedForAction.NONE;
        this.i = new ArrayList<Mailbox>();
        this.j = new ArrayList<String>();
        this.l = Importance.NONE;
        this.x = new ArrayList<String>();
        this.y = new ArrayList<String>();
        this.C = new ArrayList<Mailbox>();
        this.F = Sensitivity.NONE;
    }
    
    RuleConditions(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = new ArrayList<String>();
        this.b = new ArrayList<String>();
        this.c = new ArrayList<String>();
        this.d = new ArrayList<String>();
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
        this.h = FlaggedForAction.NONE;
        this.i = new ArrayList<Mailbox>();
        this.j = new ArrayList<String>();
        this.l = Importance.NONE;
        this.x = new ArrayList<String>();
        this.y = new ArrayList<String>();
        this.C = new ArrayList<Mailbox>();
        this.F = Sensitivity.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.a.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsBodyStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsBodyStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsHeaderStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsHeaderStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsRecipientStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsRecipientStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSenderStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSenderStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSubjectOrBodyStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSubjectOrBodyStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSubjectStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContainsSubjectStrings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FlaggedForAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.h = com.independentsoft.exchange.a.g(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FromAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Address") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.i.add(new Mailbox(xmlStreamReader, "Address"));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FromAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FromConnectedAccounts") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.j.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FromConnectedAccounts") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasAttachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.k = Boolean.parseBoolean(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Importance") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.l = com.independentsoft.exchange.a.O(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsApprovalRequest") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.m = Boolean.parseBoolean(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsAutomaticForward") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.n = Boolean.parseBoolean(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsAutomaticReply") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.o = Boolean.parseBoolean(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsEncrypted") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    this.p = Boolean.parseBoolean(elementText6);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsMeetingRequest") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = xmlStreamReader.getElementText()) != null && elementText7.length() > 0) {
                    this.q = Boolean.parseBoolean(elementText7);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsMeetingResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = xmlStreamReader.getElementText()) != null && elementText8.length() > 0) {
                    this.r = Boolean.parseBoolean(elementText8);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsNDR") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = xmlStreamReader.getElementText()) != null && elementText9.length() > 0) {
                    this.s = Boolean.parseBoolean(elementText9);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsPermissionControlled") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = xmlStreamReader.getElementText()) != null && elementText10.length() > 0) {
                    this.t = Boolean.parseBoolean(elementText10);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsReadReceipt") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = xmlStreamReader.getElementText()) != null && elementText11.length() > 0) {
                    this.u = Boolean.parseBoolean(elementText11);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsSigned") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = xmlStreamReader.getElementText()) != null && elementText12.length() > 0) {
                    this.v = Boolean.parseBoolean(elementText12);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsVoicemail") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = xmlStreamReader.getElementText()) != null && elementText13.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText13);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemClasses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.x.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemClasses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageClassifications") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.y.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageClassifications") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NotSentToMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = xmlStreamReader.getElementText()) != null && elementText14.length() > 0) {
                    this.z = Boolean.parseBoolean(elementText14);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentCcMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = xmlStreamReader.getElementText()) != null && elementText15.length() > 0) {
                    this.A = Boolean.parseBoolean(elementText15);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentOnlyToMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = xmlStreamReader.getElementText()) != null && elementText16.length() > 0) {
                    this.B = Boolean.parseBoolean(elementText16);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentToAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Address") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.C.add(new Mailbox(xmlStreamReader, "Address"));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentToAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentToMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = xmlStreamReader.getElementText()) != null && elementText17.length() > 0) {
                    this.D = Boolean.parseBoolean(elementText17);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SentToOrCcMe") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = xmlStreamReader.getElementText()) != null && elementText18.length() > 0) {
                    this.E = Boolean.parseBoolean(elementText18);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sensitivity") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = xmlStreamReader.getElementText()) != null && elementText19.length() > 0) {
                    this.F = com.independentsoft.exchange.a.N(elementText19);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WithinDateRange") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.G = new RulePredicateDateRange(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WithinSizeRange") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.H = new RulePredicateSizeRange(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Conditions") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:Conditions>";
        if (this.a != null && this.a.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.a.size(); ++i) {
                if (this.a.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.independentsoft.exchange.d.a(this.a.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.b != null && this.b.size() > 0) {
            String s3 = s + "<t:ContainsBodyStrings>";
            for (int j = 0; j < this.b.size(); ++j) {
                if (this.b.get(j) != null) {
                    s3 = s3 + "<t:String>" + com.independentsoft.exchange.d.a(this.b.get(j)) + "</t:String>";
                }
            }
            s = s3 + "</t:ContainsBodyStrings>";
        }
        if (this.c != null && this.c.size() > 0) {
            String s4 = s + "<t:ContainsHeaderStrings>";
            for (int k = 0; k < this.c.size(); ++k) {
                if (this.c.get(k) != null) {
                    s4 = s4 + "<t:String>" + com.independentsoft.exchange.d.a(this.c.get(k)) + "</t:String>";
                }
            }
            s = s4 + "</t:ContainsHeaderStrings>";
        }
        if (this.d != null && this.d.size() > 0) {
            String s5 = s + "<t:ContainsRecipientStrings>";
            for (int l = 0; l < this.d.size(); ++l) {
                if (this.d.get(l) != null) {
                    s5 = s5 + "<t:String>" + com.independentsoft.exchange.d.a(this.d.get(l)) + "</t:String>";
                }
            }
            s = s5 + "</t:ContainsRecipientStrings>";
        }
        if (this.e != null && this.e.size() > 0) {
            String s6 = s + "<t:ContainsSenderStrings>";
            for (int n = 0; n < this.e.size(); ++n) {
                if (this.e.get(n) != null) {
                    s6 = s6 + "<t:String>" + com.independentsoft.exchange.d.a(this.e.get(n)) + "</t:String>";
                }
            }
            s = s6 + "</t:ContainsSenderStrings>";
        }
        if (this.f != null && this.f.size() > 0) {
            String s7 = s + "<t:ContainsSubjectOrBodyStrings>";
            for (int n2 = 0; n2 < this.f.size(); ++n2) {
                if (this.f.get(n2) != null) {
                    s7 = s7 + "<t:String>" + com.independentsoft.exchange.d.a(this.f.get(n2)) + "</t:String>";
                }
            }
            s = s7 + "</t:ContainsSubjectOrBodyStrings>";
        }
        if (this.g != null && this.g.size() > 0) {
            String s8 = s + "<t:ContainsSubjectStrings>";
            for (int n3 = 0; n3 < this.g.size(); ++n3) {
                if (this.g.get(n3) != null) {
                    s8 = s8 + "<t:String>" + com.independentsoft.exchange.d.a(this.g.get(n3)) + "</t:String>";
                }
            }
            s = s8 + "</t:ContainsSubjectStrings>";
        }
        if (this.h != FlaggedForAction.NONE) {
            s = s + "<t:FlaggedForAction>" + com.independentsoft.exchange.a.a(this.h) + "</t:FlaggedForAction>";
        }
        if (this.i.size() > 0) {
            String s9 = s + "<t:FromAddresses>";
            for (int n4 = 0; n4 < this.i.size(); ++n4) {
                s9 += this.i.get(n4).a("t:Address");
            }
            s = s9 + "</t:FromAddresses>";
        }
        if (this.j != null && this.j.size() > 0) {
            String s10 = s + "<t:FromConnectedAccounts>";
            for (int n5 = 0; n5 < this.j.size(); ++n5) {
                if (this.j.get(n5) != null) {
                    s10 = s10 + "<t:String>" + com.independentsoft.exchange.d.a(this.j.get(n5)) + "</t:String>";
                }
            }
            s = s10 + "</t:FromConnectedAccounts>";
        }
        if (this.k) {
            s += "<t:HasAttachments>true</t:HasAttachments>";
        }
        if (this.l != Importance.NONE) {
            s = s + "<t:Importance>" + com.independentsoft.exchange.a.a(this.l) + "</t:Importance>";
        }
        if (this.m) {
            s += "<t:IsApprovalRequest>true</t:IsApprovalRequest>";
        }
        if (this.n) {
            s += "<t:IsAutomaticForward>true</t:IsAutomaticForward>";
        }
        if (this.o) {
            s += "<t:IsAutomaticReply>true</t:IsAutomaticReply>";
        }
        if (this.p) {
            s += "<t:IsEncrypted>true</t:IsEncrypted>";
        }
        if (this.q) {
            s += "<t:IsMeetingRequest>true</t:IsMeetingRequest>";
        }
        if (this.r) {
            s += "<t:IsMeetingResponse>true</t:IsMeetingResponse>";
        }
        if (this.s) {
            s += "<t:IsNDR>true</t:IsNDR>";
        }
        if (this.t) {
            s += "<t:IsPermissionControlled>true</t:IsPermissionControlled>";
        }
        if (this.u) {
            s += "<t:IsReadReceipt>true</t:IsReadReceipt>";
        }
        if (this.v) {
            s += "<t:IsSigned>true</t:IsSigned>";
        }
        if (this.w) {
            s += "<t:IsVoicemail>true</t:IsVoicemail>";
        }
        if (this.x != null && this.x.size() > 0) {
            String s11 = s + "<t:ItemClasses>";
            for (int n6 = 0; n6 < this.x.size(); ++n6) {
                if (this.x.get(n6) != null) {
                    s11 = s11 + "<t:String>" + com.independentsoft.exchange.d.a(this.x.get(n6)) + "</t:String>";
                }
            }
            s = s11 + "</t:ItemClasses>";
        }
        if (this.y != null && this.y.size() > 0) {
            String s12 = s + "<t:MessageClassifications>";
            for (int n7 = 0; n7 < this.y.size(); ++n7) {
                if (this.y.get(n7) != null) {
                    s12 = s12 + "<t:String>" + com.independentsoft.exchange.d.a(this.y.get(n7)) + "</t:String>";
                }
            }
            s = s12 + "</t:MessageClassifications>";
        }
        if (this.z) {
            s += "<t:NotSentToMe>true</t:NotSentToMe>";
        }
        if (this.A) {
            s += "<t:SentCcMe>true</t:SentCcMe>";
        }
        if (this.B) {
            s += "<t:SentOnlyToMe>true</t:SentOnlyToMe>";
        }
        if (this.C.size() > 0) {
            String s13 = s + "<t:SentToAddresses>";
            for (int n8 = 0; n8 < this.C.size(); ++n8) {
                s13 += this.C.get(n8).a("t:Address");
            }
            s = s13 + "</t:SentToAddresses>";
        }
        if (this.D) {
            s += "<t:SentToMe>true</t:SentToMe>";
        }
        if (this.E) {
            s += "<t:SentToOrCcMe>true</t:SentToOrCcMe>";
        }
        if (this.F != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.independentsoft.exchange.a.a(this.F) + "</t:Sensitivity>";
        }
        if (this.G != null) {
            s += this.G.a();
        }
        if (this.H != null) {
            s += this.H.a();
        }
        return s + "</t:Conditions>";
    }
    
    public List<String> getCategories() {
        return this.a;
    }
    
    public List<String> getContainsBodyStrings() {
        return this.b;
    }
    
    public List<String> getContainsHeaderStrings() {
        return this.c;
    }
    
    public List<String> getContainsRecipientStrings() {
        return this.d;
    }
    
    public List<String> getContainsSenderStrings() {
        return this.e;
    }
    
    public List<String> getContainsSubjectOrBodyStrings() {
        return this.f;
    }
    
    public List<String> getContainsSubjectStrings() {
        return this.g;
    }
    
    public FlaggedForAction getFlaggedForAction() {
        return this.h;
    }
    
    public void setFlaggedForAction(final FlaggedForAction flaggedForAction) {
        this.h = flaggedForAction;
    }
    
    public List<Mailbox> getFromAddresses() {
        return this.i;
    }
    
    public List<String> getFromConnectedAccounts() {
        return this.j;
    }
    
    public boolean hasAttachments() {
        return this.k;
    }
    
    public void setHasAttachments(final boolean hasAttachments) {
        this.k = hasAttachments;
    }
    
    public Importance getImportance() {
        return this.l;
    }
    
    public void setImportance(final Importance importance) {
        this.l = importance;
    }
    
    public boolean isApprovalRequest() {
        return this.m;
    }
    
    public void setAsApprovalRequest(final boolean isApprovalRequest) {
        this.m = isApprovalRequest;
    }
    
    public boolean isAutomaticForward() {
        return this.n;
    }
    
    public void setAsAutomaticForward(final boolean isAutomaticForward) {
        this.n = isAutomaticForward;
    }
    
    public boolean isAutomaticReply() {
        return this.o;
    }
    
    public void setAsAutomaticReply(final boolean isAutomaticReply) {
        this.o = isAutomaticReply;
    }
    
    public boolean isEncrypted() {
        return this.p;
    }
    
    public void setAsEncrypted(final boolean isEncrypted) {
        this.p = isEncrypted;
    }
    
    public boolean isMeetingRequest() {
        return this.q;
    }
    
    public void setAsMeetingRequest(final boolean isMeetingRequest) {
        this.q = isMeetingRequest;
    }
    
    public boolean isMeetingResponse() {
        return this.r;
    }
    
    public void setAsMeetingResponse(final boolean isMeetingResponse) {
        this.r = isMeetingResponse;
    }
    
    public boolean isNDR() {
        return this.s;
    }
    
    public void setAsNDR(final boolean isNDR) {
        this.s = isNDR;
    }
    
    public boolean isPermissionControlled() {
        return this.t;
    }
    
    public void setAsPermissionControlled(final boolean isPermissionControlled) {
        this.t = isPermissionControlled;
    }
    
    public boolean isReadReceipt() {
        return this.u;
    }
    
    public void setAsReadReceipt(final boolean isReadReceipt) {
        this.u = isReadReceipt;
    }
    
    public boolean isSigned() {
        return this.v;
    }
    
    public void setAsSigned(final boolean isSigned) {
        this.v = isSigned;
    }
    
    public boolean isVoiceMail() {
        return this.w;
    }
    
    public void setAsVoiceMail(final boolean isVoiceMail) {
        this.w = isVoiceMail;
    }
    
    public List<String> getItemClasses() {
        return this.x;
    }
    
    public List<String> getMessageClassifications() {
        return this.y;
    }
    
    public boolean getNotSentToMe() {
        return this.z;
    }
    
    public void setNotSentToMe(final boolean notSentToMe) {
        this.z = notSentToMe;
    }
    
    public boolean getSentCcMe() {
        return this.A;
    }
    
    public void setSentCcMe(final boolean sentCcMe) {
        this.A = sentCcMe;
    }
    
    public boolean getSentOnlyToMe() {
        return this.B;
    }
    
    public void setSentOnlyToMe(final boolean sentOnlyToMe) {
        this.B = sentOnlyToMe;
    }
    
    public List<Mailbox> getSentToAddresses() {
        return this.C;
    }
    
    public boolean getSentToMe() {
        return this.D;
    }
    
    public void setSentToMe(final boolean sentToMe) {
        this.D = sentToMe;
    }
    
    public boolean getSentToOrCcMe() {
        return this.E;
    }
    
    public void setSentToOrCcMe(final boolean sentToOrCcMe) {
        this.E = sentToOrCcMe;
    }
    
    public Sensitivity getSensitivity() {
        return this.F;
    }
    
    public void setSensitivity(final Sensitivity sensitivity) {
        this.F = sensitivity;
    }
    
    public RulePredicateDateRange getWithinDateRange() {
        return this.G;
    }
    
    public void setWithinDateRange(final RulePredicateDateRange withinDateRange) {
        this.G = withinDateRange;
    }
    
    public RulePredicateSizeRange getWithinSizeRange() {
        return this.H;
    }
    
    public void setWithinSizeRange(final RulePredicateSizeRange withinSizeRange) {
        this.H = withinSizeRange;
    }
}

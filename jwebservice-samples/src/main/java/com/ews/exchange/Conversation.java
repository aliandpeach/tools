package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Conversation
{
    private ItemId a;
    private String b;
    private List<String> c;
    private List<String> d;
    private List<String> e;
    private List<String> f;
    private List<String> g;
    private List<String> h;
    private Date i;
    private Date j;
    private List<String> k;
    private List<String> l;
    private FlagStatus m;
    private FlagStatus n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private List<String> w;
    private List<String> x;
    private Importance y;
    private Importance z;
    private List<ItemId> A;
    private List<ItemId> B;
    private Date C;
    private String D;
    private String E;
    private PredictedMessageAction F;
    private PredictedMessageAction G;
    private IconIndex H;
    private IconIndex I;
    private List<ItemId> J;
    
    public Conversation() {
        this.c = new ArrayList<String>();
        this.d = new ArrayList<String>();
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
        this.h = new ArrayList<String>();
        this.k = new ArrayList<String>();
        this.l = new ArrayList<String>();
        this.m = FlagStatus.NONE;
        this.n = FlagStatus.NONE;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = new ArrayList<String>();
        this.x = new ArrayList<String>();
        this.y = Importance.NONE;
        this.z = Importance.NONE;
        this.A = new ArrayList<ItemId>();
        this.B = new ArrayList<ItemId>();
        this.F = PredictedMessageAction.NONE;
        this.G = PredictedMessageAction.NONE;
        this.H = IconIndex.NONE;
        this.I = IconIndex.NONE;
        this.J = new ArrayList<ItemId>();
    }
    
    Conversation(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.c = new ArrayList<String>();
        this.d = new ArrayList<String>();
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
        this.h = new ArrayList<String>();
        this.k = new ArrayList<String>();
        this.l = new ArrayList<String>();
        this.m = FlagStatus.NONE;
        this.n = FlagStatus.NONE;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = new ArrayList<String>();
        this.x = new ArrayList<String>();
        this.y = Importance.NONE;
        this.z = Importance.NONE;
        this.A = new ArrayList<ItemId>();
        this.B = new ArrayList<ItemId>();
        this.F = PredictedMessageAction.NONE;
        this.G = PredictedMessageAction.NONE;
        this.H = IconIndex.NONE;
        this.I = IconIndex.NONE;
        this.J = new ArrayList<ItemId>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConversationId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId();
                this.a.id = reader.getAttributeValue(null, "Id");
                this.a.changeKey = reader.getAttributeValue(null, "ChangeKey");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ConversationTopic") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueUnreadSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueUnreadSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueUnreadSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueUnreadSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniqueSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUniqueSenders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastDeliveryTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.i = com.ews.exchange.d.c(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalLastDeliveryTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.j = com.ews.exchange.d.c(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Categories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.k.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Categories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalCategories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.l.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalCategories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FlagStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.m = com.ews.exchange.a.K(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalFlagStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.n = com.ews.exchange.a.K(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasAttachments") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.o = Boolean.parseBoolean(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalHasAttachments") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = reader.getElementText()) != null && elementText6.length() > 0) {
                    this.p = Boolean.parseBoolean(elementText6);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = reader.getElementText()) != null && elementText7.length() > 0) {
                    this.q = Integer.parseInt(elementText7);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalMessageCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = reader.getElementText()) != null && elementText8.length() > 0) {
                    this.r = Integer.parseInt(elementText8);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UnreadCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    this.s = Integer.parseInt(elementText9);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalUnreadCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText10;
                if ((elementText10 = reader.getElementText()) != null && elementText10.length() > 0) {
                    this.t = Integer.parseInt(elementText10);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Size") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = reader.getElementText()) != null && elementText11.length() > 0) {
                    this.u = Integer.parseInt(elementText11);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalSize") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = reader.getElementText()) != null && elementText12.length() > 0) {
                    this.v = Integer.parseInt(elementText12);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemClasses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.w.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemClasses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalItemClasses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.x.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalItemClasses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Importance") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = reader.getElementText()) != null && elementText13.length() > 0) {
                    this.y = com.ews.exchange.a.O(elementText13);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalImportance") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = reader.getElementText()) != null && elementText14.length() > 0) {
                    this.z = com.ews.exchange.a.O(elementText14);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.A.add(new ItemId(reader, "ItemId"));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OccurrenceItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.A.add(new OccurrenceItemId(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurringMasterItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.A.add(new RecurringMasterItemId(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.B.add(new ItemId(reader, "ItemId"));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OccurrenceItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.B.add(new OccurrenceItemId(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurringMasterItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.B.add(new RecurringMasterItemId(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = reader.getElementText()) != null && elementText15.length() > 0) {
                    this.C = com.ews.exchange.d.c(elementText15);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InstanceKey") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.D = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Preview") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.E = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NextPredictedAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText16;
                if ((elementText16 = reader.getElementText()) != null && elementText16.length() > 0) {
                    this.F = com.ews.exchange.a.C(elementText16);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupingAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText17;
                if ((elementText17 = reader.getElementText()) != null && elementText17.length() > 0) {
                    this.G = com.ews.exchange.a.C(elementText17);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText18;
                if ((elementText18 = reader.getElementText()) != null && elementText18.length() > 0) {
                    this.H = com.ews.exchange.a.D(elementText18);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GlobalIconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText19;
                if ((elementText19 = reader.getElementText()) != null && elementText19.length() > 0) {
                    this.I = com.ews.exchange.a.D(elementText19);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DraftItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.J.add(new ItemId(reader, "ItemId"));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OccurrenceItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.J.add(new OccurrenceItemId(reader));
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecurringMasterItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.J.add(new RecurringMasterItemId(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DraftItemIds") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Conversation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public ItemId getId() {
        return this.a;
    }
    
    public String getTopic() {
        return this.b;
    }
    
    public List<String> getUniqueRecipients() {
        return this.c;
    }
    
    public List<String> getGlobalUniqueRecipients() {
        return this.d;
    }
    
    public List<String> getUniqueUnreadSenders() {
        return this.e;
    }
    
    public List<String> getGlobalUniqueUnreadSenders() {
        return this.f;
    }
    
    public List<String> getUniqueSenders() {
        return this.g;
    }
    
    public List<String> getGlobalUniqueSenders() {
        return this.h;
    }
    
    public Date getLastDeliveryTime() {
        return this.i;
    }
    
    public Date getGlobalLastDeliveryTime() {
        return this.j;
    }
    
    public List<String> getCategories() {
        return this.k;
    }
    
    public List<String> getGlobalCategories() {
        return this.l;
    }
    
    public FlagStatus getFlagStatus() {
        return this.m;
    }
    
    public FlagStatus getGlobalFlagStatus() {
        return this.n;
    }
    
    public boolean hasAttachments() {
        return this.o;
    }
    
    public boolean globalHasAttachments() {
        return this.p;
    }
    
    public int getMessageCount() {
        return this.q;
    }
    
    public int getGlobalMessageCount() {
        return this.r;
    }
    
    public int getUnreadCount() {
        return this.s;
    }
    
    public int getGlobalUnreadCount() {
        return this.t;
    }
    
    public int getSize() {
        return this.u;
    }
    
    public int getGlobalSize() {
        return this.v;
    }
    
    public List<String> getItemClasses() {
        return this.w;
    }
    
    public List<String> getGlobalItemClasses() {
        return this.x;
    }
    
    public Importance getImportance() {
        return this.y;
    }
    
    public Importance getGlobalImportance() {
        return this.z;
    }
    
    public List<ItemId> getItemIds() {
        return this.A;
    }
    
    public List<ItemId> getGlobalItemIds() {
        return this.B;
    }
    
    public Date getLastModifiedTime() {
        return this.C;
    }
    
    public String getInstanceKey() {
        return this.D;
    }
    
    public String getPreview() {
        return this.E;
    }
    
    public PredictedMessageAction getNextPredictedAction() {
        return this.F;
    }
    
    public PredictedMessageAction getGroupingAction() {
        return this.G;
    }
    
    public IconIndex getIconIndex() {
        return this.H;
    }
    
    public IconIndex getGlobaIconIndex() {
        return this.I;
    }
    
    public List<ItemId> getDraftItemIds() {
        return this.J;
    }
}

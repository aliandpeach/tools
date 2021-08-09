package com.ews.exchange;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item
{
    ItemId a;
    FolderId b;
    String c;
    String d;
    MimeContent e;
    Sensitivity f;
    Body g;
    List<AttachmentInfo> h;
    int i;
    List<String> j;
    Importance k;
    Date l;
    boolean m;
    String n;
    EffectiveRights o;
    String p;
    String q;
    String r;
    Date s;
    String t;
    String u;
    String v;
    private boolean am;
    boolean w;
    String x;
    String y;
    ItemId z;
    String A;
    Body B;
    String C;
    byte[] D;
    Date E;
    boolean F;
    int G;
    Flag H;
    String I;
    RetentionTag J;
    RetentionTag K;
    Date L;
    String M;
    PredictedMessageAction N;
    PredictedMessageAction O;
    boolean P;
    boolean Q;
    Body R;
    IconIndex S;
    Date T;
    Date U;
    String V;
    String W;
    int X;
    List<String> Y;
    List<String> Z;
    boolean aa;
    Date ab;
    Date ac;
    int ad;
    int ae;
    int af;
    int ag;
    NoteColor ah;
    List<String> ai;
    NoteColor aj;
    EntityExtractionResult ak;
    ExtendedPropertyList al;
    
    public Item() {
        this.f = Sensitivity.NONE;
        this.h = new ArrayList<AttachmentInfo>();
        this.j = new ArrayList<String>();
        this.k = Importance.NONE;
        this.G = -1;
        this.N = PredictedMessageAction.NONE;
        this.O = PredictedMessageAction.NONE;
        this.S = IconIndex.NONE;
        this.Y = new ArrayList<String>();
        this.Z = new ArrayList<String>();
        this.ah = NoteColor.NONE;
        this.ai = new ArrayList<String>();
        this.aj = NoteColor.NONE;
        this.al = new ExtendedPropertyList();
    }
    
    public Item(final String subject) {
        this.f = Sensitivity.NONE;
        this.h = new ArrayList<AttachmentInfo>();
        this.j = new ArrayList<String>();
        this.k = Importance.NONE;
        this.G = -1;
        this.N = PredictedMessageAction.NONE;
        this.O = PredictedMessageAction.NONE;
        this.S = IconIndex.NONE;
        this.Y = new ArrayList<String>();
        this.Z = new ArrayList<String>();
        this.ah = NoteColor.NONE;
        this.ai = new ArrayList<String>();
        this.aj = NoteColor.NONE;
        this.al = new ExtendedPropertyList();
        this.d = subject;
    }
    
    public Item(final String subject, final String itemClass) {
        this.f = Sensitivity.NONE;
        this.h = new ArrayList<AttachmentInfo>();
        this.j = new ArrayList<String>();
        this.k = Importance.NONE;
        this.G = -1;
        this.N = PredictedMessageAction.NONE;
        this.O = PredictedMessageAction.NONE;
        this.S = IconIndex.NONE;
        this.Y = new ArrayList<String>();
        this.Z = new ArrayList<String>();
        this.ah = NoteColor.NONE;
        this.ai = new ArrayList<String>();
        this.aj = NoteColor.NONE;
        this.al = new ExtendedPropertyList();
        this.d = subject;
        this.c = itemClass;
    }
    
    public Item(final MimeContent mimeContent) {
        this.f = Sensitivity.NONE;
        this.h = new ArrayList<AttachmentInfo>();
        this.j = new ArrayList<String>();
        this.k = Importance.NONE;
        this.G = -1;
        this.N = PredictedMessageAction.NONE;
        this.O = PredictedMessageAction.NONE;
        this.S = IconIndex.NONE;
        this.Y = new ArrayList<String>();
        this.Z = new ArrayList<String>();
        this.ah = NoteColor.NONE;
        this.ai = new ArrayList<String>();
        this.aj = NoteColor.NONE;
        this.al = new ExtendedPropertyList();
        this.e = mimeContent;
    }
    
    Item(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.f = Sensitivity.NONE;
        this.h = new ArrayList<AttachmentInfo>();
        this.j = new ArrayList<String>();
        this.k = Importance.NONE;
        this.G = -1;
        this.N = PredictedMessageAction.NONE;
        this.O = PredictedMessageAction.NONE;
        this.S = IconIndex.NONE;
        this.Y = new ArrayList<String>();
        this.Z = new ArrayList<String>();
        this.ah = NoteColor.NONE;
        this.ai = new ArrayList<String>();
        this.aj = NoteColor.NONE;
        this.al = new ExtendedPropertyList();
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
                    this.k = com.ews.exchange.a.O(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DateTimeCreated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.l = com.ews.exchange.d.c(elementText4);
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
                    this.E = com.ews.exchange.d.c(elementText6);
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsAssociated") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    this.w = Boolean.parseBoolean(elementText9);
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
                final String elementText10;
                if ((elementText10 = reader.getElementText()) != null && elementText10.length() > 0) {
                    this.s = com.ews.exchange.d.c(elementText10);
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
                this.L = com.ews.exchange.d.c(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Preview") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.M = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NextPredictedAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = reader.getElementText()) != null && elementText11.length() > 0) {
                    this.N = com.ews.exchange.a.C(elementText11);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupingAction") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText12;
                if ((elementText12 = reader.getElementText()) != null && elementText12.length() > 0) {
                    this.O = com.ews.exchange.a.C(elementText12);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BlockStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = reader.getElementText()) != null && elementText13.length() > 0) {
                    this.P = Boolean.parseBoolean(elementText13);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HasBlockedImages") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText14;
                if ((elementText14 = reader.getElementText()) != null && elementText14.length() > 0) {
                    this.Q = Boolean.parseBoolean(elementText14);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TextBody") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.R = new Body(reader, "TextBody");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IconIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText15;
                if ((elementText15 = reader.getElementText()) != null && elementText15.length() > 0) {
                    this.S = com.ews.exchange.a.D(elementText15);
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
                                this.u = Charset.forName("UTF-8").decode(ByteBuffer.wrap(com.ews.exchange.d.e(value))).toString();
                            }
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_BODY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_BODY.getType()) {
                        this.v = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_COMMENT.getTag() && propertyTag.getType() == MapiPropertyTag.PR_COMMENT.getType()) {
                        this.C = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ACTION.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ACTION.getType() && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.aj = com.ews.exchange.a.P(Integer.toString(Integer.parseInt(extendedProperty.getValue()) - 768));
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
                    else if (propertyId.getId() == 34106 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.STRING_ARRAY) {
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
                            this.ab = com.ews.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyId.getId() == 34071 && propertyId.getSet() == StandardPropertySet.COMMON && propertyId.getType() == MapiPropertyType.SYSTEM_TIME && extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                        this.ac = com.ews.exchange.d.c(extendedProperty.getValue());
                    }
                }
                else if (extendedProperty.getPropertyPath() instanceof CustomPropertyId) {
                    final CustomPropertyId customPropertyId;
                    if ((customPropertyId = (CustomPropertyId)extendedProperty.getPropertyPath()).getId() == 34566 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.T = com.ews.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (customPropertyId.getId() == 34568 && customPropertyId.getSet().equals("0006200a-0000-0000-c000-000000000046") && customPropertyId.getType() == MapiPropertyType.SYSTEM_TIME) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.U = com.ews.exchange.d.c(extendedProperty.getValue());
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
                        this.ah = com.ews.exchange.a.P(extendedProperty.getValue());
                    }
                }
                this.al.add(extendedProperty);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Item") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    String a() {
        String s = "<t:Task>";
        if (this.e != null) {
            s += this.e.a();
        }
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.ews.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.d != null) {
            s = s + "<t:Subject>" + com.ews.exchange.d.a(this.d) + "</t:Subject>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.ews.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.j.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.j.size(); ++i) {
                if (this.j.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.ews.exchange.d.a(this.j.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.k != Importance.NONE) {
            s = s + "<t:Importance>" + com.ews.exchange.a.a(this.k) + "</t:Importance>";
        }
        if (this.p != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        for (int j = 0; j < this.al.size(); ++j) {
            s += this.al.get(j).toString();
        }
        if (this.H != null) {
            s += this.H.a();
        }
        if (this.J != null) {
            s += this.J.a("PolicyTag");
        }
        if (this.K != null) {
            s += this.K.a("ArchiveTag");
        }
        if (this.L != null) {
            s = s + "<t:RetentionDate>" + com.ews.exchange.d.a(this.L) + "</t:RetentionDate>";
        }
        return s + "</t:Item>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public ExtendedProperty getExtendedProperty(final ExtendedPropertyPath propertyPath) {
        for (int i = 0; i < this.al.size(); ++i) {
            if (this.al.get(i) != null && this.al.get(i).getPropertyPath() != null && this.al.get(i).getPropertyPath().isEqual(propertyPath)) {
                return this.al.get(i);
            }
        }
        return null;
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public FolderId getParentId() {
        return this.b;
    }
    
    public String getItemClass() {
        return this.c;
    }
    
    public void setItemClass(final String itemClass) {
        this.c = itemClass;
    }
    
    public String getSubject() {
        return this.d;
    }
    
    public void setSubject(final String subject) {
        this.d = subject;
    }
    
    public MimeContent getMimeContent() {
        return this.e;
    }
    
    public void setMimeContent(final MimeContent mimeContent) {
        this.e = mimeContent;
    }
    
    public Sensitivity getSensitivity() {
        return this.f;
    }
    
    public void setSensitivity(final Sensitivity sensitivity) {
        this.f = sensitivity;
    }
    
    public Body getBody() {
        return this.g;
    }
    
    public void setBody(final Body body) {
        this.g = body;
    }
    
    public byte[] getRtfCompressed() {
        return this.D;
    }
    
    public void setRtfCompressed(final byte[] rtfCompressed) {
        this.D = rtfCompressed;
    }
    
    public byte[] getBodyRtf() {
        if (this.D != null && this.D.length > 16) {
            return com.ews.exchange.d.b(this.D);
        }
        return null;
    }
    
    public void setBodyRtf(final byte[] rtf) {
        if (rtf != null) {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final c c = new c(rtf.length + 12);
                final c c2 = new c(rtf.length);
                final c c3 = new c(1095517517);
                byteArrayOutputStream.write(c.a());
                byteArrayOutputStream.write(c2.a());
                byteArrayOutputStream.write(c3.a());
                final a a;
                (a = new a()).a(rtf, 0, rtf.length);
                byteArrayOutputStream.write(new c(a.a()).a());
                byteArrayOutputStream.write(rtf);
                this.D = byteArrayOutputStream.toByteArray();
                return;
            }
            catch (IOException ex) {
                System.err.print(ex.getStackTrace());
                return;
            }
        }
        this.D = null;
    }
    
    public Date getReminderDueBy() {
        return this.E;
    }
    
    public void setReminderDueBy(final Date reminderDueBy) {
        this.E = reminderDueBy;
    }
    
    public boolean getReminderIsSet() {
        return this.F;
    }
    
    public void setReminderIsSet(final boolean reminderIsSet) {
        this.F = reminderIsSet;
    }
    
    public int getReminderMinutesBeforeStart() {
        return this.G;
    }
    
    public void setReminderMinutesBeforeStart(final int reminderMinutesBeforeStart) {
        this.G = reminderMinutesBeforeStart;
    }
    
    public List<AttachmentInfo> getAttachments() {
        return this.h;
    }
    
    public int getSize() {
        return this.i;
    }
    
    public List<String> getCategories() {
        return this.j;
    }
    
    public void setCategories(final List<String> categories) {
        this.j = categories;
    }
    
    public Importance getImportance() {
        return this.k;
    }
    
    public void setImportance(final Importance importance) {
        this.k = importance;
    }
    
    public Date getCreatedTime() {
        return this.l;
    }
    
    public boolean hasAttachments() {
        return this.m;
    }
    
    public String getCulture() {
        return this.n;
    }
    
    public EffectiveRights getEffectiveRights() {
        return this.o;
    }
    
    public void setEffectiveRights(final EffectiveRights effectiveRights) {
        this.o = effectiveRights;
    }
    
    public String getDisplayName() {
        return this.p;
    }
    
    public void setDisplayName(final String displayName) {
        this.p = displayName;
    }
    
    public String getEntryId() {
        return this.q;
    }
    
    public String getLastModifierName() {
        return this.r;
    }
    
    public Date getLastModifiedTime() {
        return this.s;
    }
    
    public String getSearchKey() {
        return this.t;
    }
    
    public String getBodyHtmlText() {
        return this.u;
    }
    
    public String getBodyPlainText() {
        return this.v;
    }
    
    public boolean isHidden() {
        return this.am;
    }
    
    public void setHidden(final boolean isHidden) {
        this.am = isHidden;
    }
    
    public boolean isAssociated() {
        return this.w;
    }
    
    public String getWebClientReadFormQueryString() {
        return this.x;
    }
    
    public String getWebClientEditFormQueryString() {
        return this.y;
    }
    
    public ItemId getConversationId() {
        return this.z;
    }
    
    public String getStoreEntryId() {
        return this.A;
    }
    
    public Body getUniqueBody() {
        return this.B;
    }
    
    public String getComment() {
        return this.C;
    }
    
    public void setComment(final String comment) {
        this.C = comment;
    }
    
    public Flag getFlag() {
        return this.H;
    }
    
    public void setFlag(final Flag flag) {
        this.H = flag;
    }
    
    public String getInstanceKey() {
        return this.I;
    }
    
    public RetentionTag getRetentionTag() {
        return this.J;
    }
    
    public void setRetentionTag(final RetentionTag retentionTag) {
        this.J = retentionTag;
    }
    
    public RetentionTag getArchiveTag() {
        return this.K;
    }
    
    public void setArchiveTag(final RetentionTag archiveTag) {
        this.K = archiveTag;
    }
    
    public Date getRetentionDate() {
        return this.L;
    }
    
    public void setRetentionDate(final Date retentionDate) {
        this.L = retentionDate;
    }
    
    public String getPreview() {
        return this.M;
    }
    
    public PredictedMessageAction getNextPredictedAction() {
        return this.N;
    }
    
    public PredictedMessageAction getGroupingAction() {
        return this.O;
    }
    
    public boolean isBlockStatus() {
        return this.P;
    }
    
    public boolean hasBlockedImages() {
        return this.Q;
    }
    
    public Body getTextBody() {
        return this.R;
    }
    
    public IconIndex getIconIndex() {
        return this.S;
    }
    
    public EntityExtractionResult getEntityExtractionResult() {
        return this.ak;
    }
    
    public ExtendedPropertyList getExtendedProperties() {
        return this.al;
    }
}

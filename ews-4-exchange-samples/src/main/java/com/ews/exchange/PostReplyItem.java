package com.ews.exchange;

import java.nio.charset.*;
import java.nio.*;
import javax.xml.stream.*;
import java.text.*;

public class PostReplyItem extends ResponseItem
{
    private Body am;
    
    public PostReplyItem() {
    }
    
    public PostReplyItem(final ItemId referenceItemId) {
        this.aw = referenceItemId;
    }
    
    PostReplyItem(final XMLStreamReader reader) throws XMLStreamException, ParseException {
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
                this.e = new MimeContent(reader.getElementText());
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NewBodyContent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.am = new Body(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReferenceItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aw = new ItemId(reader, "ReferenceItemId");
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
                }
                this.al.add(extendedProperty);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PostReplyItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    String a() {
        String s = "<t:PostReplyItem>";
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
        if (this.aw != null) {
            s += this.aw.a("t:ReferenceItemId");
        }
        if (this.am != null) {
            s += this.am.b();
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
        return s + "</t:PostReplyItem>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public Body getNewBody() {
        return this.am;
    }
    
    public void setNewBody(final Body newBody) {
        this.am = newBody;
    }
}

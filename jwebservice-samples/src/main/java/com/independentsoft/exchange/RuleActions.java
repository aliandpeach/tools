package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class RuleActions
{
    private List<String> a;
    private FolderId b;
    private boolean c;
    private List<Mailbox> d;
    private List<Mailbox> e;
    private Importance f;
    private boolean g;
    private FolderId h;
    private boolean i;
    private List<Mailbox> j;
    private List<Mailbox> k;
    private ItemId l;
    private boolean m;
    
    public RuleActions() {
        this.a = new ArrayList<String>();
        this.d = new ArrayList<Mailbox>();
        this.e = new ArrayList<Mailbox>();
        this.f = Importance.NONE;
        this.j = new ArrayList<Mailbox>();
        this.k = new ArrayList<Mailbox>();
    }
    
    RuleActions(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<String>();
        this.d = new ArrayList<Mailbox>();
        this.e = new ArrayList<Mailbox>();
        this.f = Importance.NONE;
        this.j = new ArrayList<Mailbox>();
        this.k = new ArrayList<Mailbox>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AssignCategories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.a.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AssignCategories") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CopyToFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b = new FolderId(reader, "FolderId");
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CopyToFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Delete") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.c = Boolean.parseBoolean(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ForwardAsAttachmentToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Address") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new Mailbox(reader, "Address"));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ForwardAsAttachmentToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ForwardToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Address") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(new Mailbox(reader, "Address"));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ForwardToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MarkImportance") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.f = com.independentsoft.exchange.a.O(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MarkAsRead") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.g = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MoveToFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h = new FolderId(reader, "FolderId");
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MoveToFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PermanentDelete") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.i = Boolean.parseBoolean(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RedirectToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Address") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.j.add(new Mailbox(reader, "Address"));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RedirectToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SendSMSAlertToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Address") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.k.add(new Mailbox(reader, "Address"));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SendSMSAlertToRecipients") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ServerReplyWithMessage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.l = new ItemId(reader, "ServerReplyWithMessage");
            }
            else {
                final String elementText5;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StopProcessingRules") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.m = Boolean.parseBoolean(elementText5);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Actions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:Actions>";
        if (this.a != null && this.a.size() > 0) {
            String s2 = s + "<t:AssignCategories>";
            for (int i = 0; i < this.a.size(); ++i) {
                if (this.a.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.independentsoft.exchange.d.a(this.a.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:AssignCategories>";
        }
        if (this.b != null) {
            s = s + "<t:CopyToFolder>" + this.b.a() + "</t:CopyToFolder>";
        }
        if (this.c) {
            s += "<t:Delete>true</t:Delete>";
        }
        if (this.d.size() > 0) {
            String s3 = s + "<t:ForwardAsAttachmentToRecipients>";
            for (int j = 0; j < this.d.size(); ++j) {
                s3 += this.d.get(j).a("t:Address");
            }
            s = s3 + "</t:ForwardAsAttachmentToRecipients>";
        }
        if (this.e.size() > 0) {
            String s4 = s + "<t:ForwardToRecipients>";
            for (int k = 0; k < this.e.size(); ++k) {
                s4 += this.e.get(k).a("t:Address");
            }
            s = s4 + "</t:ForwardToRecipients>";
        }
        if (this.f != Importance.NONE) {
            s = s + "<t:MarkImportance>" + com.independentsoft.exchange.a.a(this.f) + "</t:MarkImportance>";
        }
        if (this.g) {
            s += "<t:MarkAsRead>true</t:MarkAsRead>";
        }
        if (this.h != null) {
            s = s + "<t:MoveToFolder>" + this.h.a() + "</t:MoveToFolder>";
        }
        if (this.i) {
            s += "<t:PermanentDelete>true</t:PermanentDelete>";
        }
        if (this.j.size() > 0) {
            String s5 = s + "<t:RedirectToRecipients>";
            for (int l = 0; l < this.j.size(); ++l) {
                s5 += this.j.get(l).a("t:Address");
            }
            s = s5 + "</t:RedirectToRecipients>";
        }
        if (this.k.size() > 0) {
            String s6 = s + "<t:SendSMSAlertToRecipients>";
            for (int n = 0; n < this.k.size(); ++n) {
                s6 += this.k.get(n).a("t:Address");
            }
            s = s6 + "</t:SendSMSAlertToRecipients>";
        }
        if (this.l != null) {
            s = s + "<t:ServerReplyWithMessage>" + this.l.a() + "</t:ServerReplyWithMessage>";
        }
        if (this.m) {
            s += "<t:StopProcessingRules>true</t:StopProcessingRules>";
        }
        return s + "</t:Actions>";
    }
    
    public List<String> getAssignCategories() {
        return this.a;
    }
    
    public FolderId getCopyToFolder() {
        return this.b;
    }
    
    public void setCopyToFolder(final FolderId copyToFolder) {
        this.b = copyToFolder;
    }
    
    public boolean getDelete() {
        return this.c;
    }
    
    public void setDelete(final boolean delete) {
        this.c = delete;
    }
    
    public List<Mailbox> getForwardAsAttachmentToRecipients() {
        return this.d;
    }
    
    public List<Mailbox> getForwardToRecipients() {
        return this.e;
    }
    
    public Importance getMarkImportance() {
        return this.f;
    }
    
    public void setMarkImportance(final Importance markImportance) {
        this.f = markImportance;
    }
    
    public boolean getMarkAsRead() {
        return this.g;
    }
    
    public void setMarkAsRead(final boolean markAsRead) {
        this.g = markAsRead;
    }
    
    public FolderId getMoveToFolder() {
        return this.h;
    }
    
    public void setMoveToFolder(final FolderId moveToFolder) {
        this.h = moveToFolder;
    }
    
    public boolean getPermanentDelete() {
        return this.i;
    }
    
    public void setPermanentDelete(final boolean permanentDelete) {
        this.i = permanentDelete;
    }
    
    public List<Mailbox> getRedirectToRecipients() {
        return this.j;
    }
    
    public List<Mailbox> getSendSMSAlertToRecipients() {
        return this.k;
    }
    
    public ItemId getServerReplyWithMessage() {
        return this.l;
    }
    
    public void setServerReplyWithMessage(final ItemId serverReplyWithMessage) {
        this.l = serverReplyWithMessage;
    }
    
    public boolean getStopProcessingRules() {
        return this.m;
    }
    
    public void setStopProcessingRules(final boolean stopProcessingRules) {
        this.m = stopProcessingRules;
    }
}

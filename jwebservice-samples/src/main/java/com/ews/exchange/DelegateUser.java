package com.ews.exchange;

import javax.xml.stream.*;

public class DelegateUser
{
    private UserId a;
    private DelegateFolderPermissionLevel b;
    private DelegateFolderPermissionLevel c;
    private DelegateFolderPermissionLevel d;
    private DelegateFolderPermissionLevel e;
    private DelegateFolderPermissionLevel f;
    private DelegateFolderPermissionLevel g;
    private boolean h;
    private boolean i;
    
    public DelegateUser() {
        this.b = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.c = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.d = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.e = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.f = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.g = DelegateFolderPermissionLevel.NOT_DEFINED;
    }
    
    public DelegateUser(final UserId userId) {
        this.b = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.c = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.d = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.e = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.f = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.g = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.a = userId;
    }
    
    public DelegateUser(final String primarySmtpAddress) {
        this.b = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.c = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.d = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.e = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.f = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.g = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.a = new UserId(primarySmtpAddress);
    }
    
    DelegateUser(final XMLStreamReader reader) throws XMLStreamException {
        this.b = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.c = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.d = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.e = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.f = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.g = DelegateFolderPermissionLevel.NOT_DEFINED;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UserId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new UserId(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DelegatePermissions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText;
                        if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                            this.b = com.ews.exchange.a.p(elementText);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TasksFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText2;
                        if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                            this.c = com.ews.exchange.a.p(elementText2);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InboxFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText3;
                        if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                            this.d = com.ews.exchange.a.p(elementText3);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContactsFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText4;
                        if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                            this.e = com.ews.exchange.a.p(elementText4);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NotesFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String elementText5;
                        if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                            this.f = com.ews.exchange.a.p(elementText5);
                        }
                    }
                    else {
                        final String elementText6;
                        if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("JournalFolderPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText6 = reader.getElementText()) != null && elementText6.length() > 0) {
                            this.g = com.ews.exchange.a.p(elementText6);
                        }
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DelegatePermissions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReceiveCopiesOfMeetingMessages") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = reader.getElementText()) != null && elementText7.length() > 0) {
                    this.h = Boolean.parseBoolean(elementText7);
                }
            }
            else {
                final String elementText8;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ViewPrivateItems") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText8 = reader.getElementText()) != null && elementText8.length() > 0) {
                    this.i = Boolean.parseBoolean(elementText8);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DelegateUser") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:DelegateUser>";
        if (this.a != null) {
            s += this.a.a();
        }
        if (this.b != DelegateFolderPermissionLevel.NOT_DEFINED || this.c != DelegateFolderPermissionLevel.NOT_DEFINED || this.d != DelegateFolderPermissionLevel.NOT_DEFINED || this.e != DelegateFolderPermissionLevel.NOT_DEFINED || this.f != DelegateFolderPermissionLevel.NOT_DEFINED || this.g != DelegateFolderPermissionLevel.NOT_DEFINED) {
            String s2 = s + "<t:DelegatePermissions>";
            if (this.b != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:CalendarFolderPermissionLevel>" + com.ews.exchange.a.a(this.b) + "</t:CalendarFolderPermissionLevel>";
            }
            if (this.c != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:TasksFolderPermissionLevel>" + com.ews.exchange.a.a(this.c) + "</t:TasksFolderPermissionLevel>";
            }
            if (this.d != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:InboxFolderPermissionLevel>" + com.ews.exchange.a.a(this.d) + "</t:InboxFolderPermissionLevel>";
            }
            if (this.e != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:ContactsFolderPermissionLevel>" + com.ews.exchange.a.a(this.e) + "</t:ContactsFolderPermissionLevel>";
            }
            if (this.f != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:NotesFolderPermissionLevel>" + com.ews.exchange.a.a(this.f) + "</t:NotesFolderPermissionLevel>";
            }
            if (this.g != DelegateFolderPermissionLevel.NOT_DEFINED) {
                s2 = s2 + "<t:JournalFolderPermissionLevel>" + com.ews.exchange.a.a(this.g) + "</t:JournalFolderPermissionLevel>";
            }
            s = s2 + "</t:DelegatePermissions>";
        }
        String s3;
        if (this.h) {
            s3 = s + "<t:ReceiveCopiesOfMeetingMessages>true</t:ReceiveCopiesOfMeetingMessages>";
        }
        else {
            s3 = s + "<t:ReceiveCopiesOfMeetingMessages>false</t:ReceiveCopiesOfMeetingMessages>";
        }
        String s4;
        if (this.i) {
            s4 = s3 + "<t:ViewPrivateItems>true</t:ViewPrivateItems>";
        }
        else {
            s4 = s3 + "<t:ViewPrivateItems>false</t:ViewPrivateItems>";
        }
        return s4 + "</t:DelegateUser>";
    }
    
    public UserId getUserId() {
        return this.a;
    }
    
    public void setUserId(final UserId userId) {
        this.a = userId;
    }
    
    public DelegateFolderPermissionLevel getCalendarFolderPermissionLevel() {
        return this.b;
    }
    
    public void setCalendarFolderPermissionLevel(final DelegateFolderPermissionLevel calendarFolderPermissionLevel) {
        this.b = calendarFolderPermissionLevel;
    }
    
    public DelegateFolderPermissionLevel getTasksFolderPermissionLevel() {
        return this.c;
    }
    
    public void setTasksFolderPermissionLevel(final DelegateFolderPermissionLevel tasksFolderPermissionLevel) {
        this.c = tasksFolderPermissionLevel;
    }
    
    public DelegateFolderPermissionLevel getInboxFolderPermissionLevel() {
        return this.d;
    }
    
    public void setInboxFolderPermissionLevel(final DelegateFolderPermissionLevel inboxFolderPermissionLevel) {
        this.d = inboxFolderPermissionLevel;
    }
    
    public DelegateFolderPermissionLevel getContactsFolderPermissionLevel() {
        return this.e;
    }
    
    public void setContactsFolderPermissionLevel(final DelegateFolderPermissionLevel contactsFolderPermissionLevel) {
        this.e = contactsFolderPermissionLevel;
    }
    
    public DelegateFolderPermissionLevel getNotesFolderPermissionLevel() {
        return this.f;
    }
    
    public void setNotesFolderPermissionLevel(final DelegateFolderPermissionLevel notesFolderPermissionLevel) {
        this.f = notesFolderPermissionLevel;
    }
    
    public DelegateFolderPermissionLevel getJournalFolderPermissionLevel() {
        return this.g;
    }
    
    public void setJournalFolderPermissionLevel(final DelegateFolderPermissionLevel journalFolderPermissionLevel) {
        this.g = journalFolderPermissionLevel;
    }
    
    public boolean getReceiveCopiesOfMeetingMessages() {
        return this.h;
    }
    
    public void setReceiveCopiesOfMeetingMessages(final boolean receiveCopiesOfMeetingMessages) {
        this.h = receiveCopiesOfMeetingMessages;
    }
    
    public boolean getViewPrivateItems() {
        return this.i;
    }
    
    public void setViewPrivateItems(final boolean viewPrivateItems) {
        this.i = viewPrivateItems;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class CalendarPermission
{
    private UserId a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private PermissionAction g;
    private PermissionAction h;
    private CalendarPermissionReadAccess i;
    private CalendarPermissionLevel j;
    
    public CalendarPermission() {
        this.g = PermissionAction.NONE;
        this.h = PermissionAction.NONE;
        this.i = CalendarPermissionReadAccess.NONE;
        this.j = CalendarPermissionLevel.NONE;
    }
    
    CalendarPermission(final XMLStreamReader reader) throws XMLStreamException {
        this.g = PermissionAction.NONE;
        this.h = PermissionAction.NONE;
        this.i = CalendarPermissionReadAccess.NONE;
        this.j = CalendarPermissionLevel.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UserId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new UserId(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CanCreateItems") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.b = Boolean.parseBoolean(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CanCreateSubFolders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.c = Boolean.parseBoolean(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsFolderOwner") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.d = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsFolderVisible") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.e = Boolean.parseBoolean(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsFolderContact") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.f = Boolean.parseBoolean(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EditItems") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = reader.getElementText()) != null && elementText6.length() > 0) {
                    this.g = com.independentsoft.exchange.a.o(elementText6);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeleteItems") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = reader.getElementText()) != null && elementText7.length() > 0) {
                    this.h = com.independentsoft.exchange.a.o(elementText7);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReadItems") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = reader.getElementText()) != null && elementText8.length() > 0) {
                    final String s;
                    this.i = ((s = elementText8).equals("FullDetails") ? CalendarPermissionReadAccess.FULL_DETAILS : (s.equals("TimeAndSubjectAndLocation") ? CalendarPermissionReadAccess.TIME_AND_SUBJECT_AND_LOCATION : (s.equals("TimeOnly") ? CalendarPermissionReadAccess.TIME_ONLY : CalendarPermissionReadAccess.NONE)));
                }
            }
            else {
                final String elementText9;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarPermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    final String s2;
                    this.j = ((s2 = elementText9).equals("Author") ? CalendarPermissionLevel.AUTHOR : (s2.equals("Contributor") ? CalendarPermissionLevel.CONTRIBUTOR : (s2.equals("Custom") ? CalendarPermissionLevel.CUSTOM : (s2.equals("Editor") ? CalendarPermissionLevel.EDITOR : (s2.equals("FreeBusyTimeAndSubjectAndLocation") ? CalendarPermissionLevel.FREE_BUSY_TIME_AND_SUBJECT_AND_LOCATION : (s2.equals("FreeBusyTimeOnly") ? CalendarPermissionLevel.FREE_BUSY_TIME_ONLY : (s2.equals("NoneditingAuthor") ? CalendarPermissionLevel.NONEDITING_AUTHOR : (s2.equals("Owner") ? CalendarPermissionLevel.OWNER : (s2.equals("PublishingAuthor") ? CalendarPermissionLevel.PUBLISHING_AUTHOR : (s2.equals("PublishingEditor") ? CalendarPermissionLevel.PUBLISHING_EDITOR : (s2.equals("Reviewer") ? CalendarPermissionLevel.REVIEWER : CalendarPermissionLevel.NONE)))))))))));
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarPermission") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:CalendarPermission>";
        if (this.a != null) {
            s += this.a.a();
        }
        if (this.b) {
            s += "<t:CanCreateItems>true</t:CanCreateItems>";
        }
        if (this.c) {
            s += "<t:CanCreateSubFolders>true</t:CanCreateSubFolders>";
        }
        if (this.d) {
            s += "<t:IsFolderOwner>true</t:IsFolderOwner>";
        }
        if (this.e) {
            s += "<t:IsFolderVisible>true</t:IsFolderVisible>";
        }
        if (this.f) {
            s += "<t:IsFolderContact>true</t:IsFolderContact>";
        }
        if (this.g != PermissionAction.NONE) {
            s = s + "<t:EditItems>" + com.independentsoft.exchange.a.a(this.g) + "</t:EditItems>";
        }
        if (this.h != PermissionAction.NONE) {
            s = s + "<t:DeleteItems>" + com.independentsoft.exchange.a.a(this.h) + "</t:DeleteItems>";
        }
        if (this.i != CalendarPermissionReadAccess.NONE) {
            final CalendarPermissionReadAccess i;
            s = s + "<t:ReadItems>" + (((i = this.i) == CalendarPermissionReadAccess.FULL_DETAILS) ? "FullDetails" : ((i == CalendarPermissionReadAccess.TIME_AND_SUBJECT_AND_LOCATION) ? "TimeAndSubjectAndLocation" : ((i == CalendarPermissionReadAccess.TIME_ONLY) ? "TimeOnly" : "None"))) + "</t:ReadItems>";
        }
        final StringBuilder append = new StringBuilder().append(s).append("<t:CalendarPermissionLevel>");
        final CalendarPermissionLevel j;
        String s2;
        if ((j = this.j) == CalendarPermissionLevel.AUTHOR) {
            s2 = "Author";
        }
        else if (j == CalendarPermissionLevel.CONTRIBUTOR) {
            s2 = "Contributor";
        }
        else {
            if (j != CalendarPermissionLevel.CUSTOM) {
                if (j == CalendarPermissionLevel.EDITOR) {
                    s2 = "Editor";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.FREE_BUSY_TIME_AND_SUBJECT_AND_LOCATION) {
                    s2 = "FreeBusyTimeAndSubjectAndLocation";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.FREE_BUSY_TIME_ONLY) {
                    s2 = "FreeBusyTimeOnly";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.NONEDITING_AUTHOR) {
                    s2 = "NoneditingAuthor";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.OWNER) {
                    s2 = "Owner";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.PUBLISHING_AUTHOR) {
                    s2 = "PublishingAuthor";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.PUBLISHING_EDITOR) {
                    s2 = "PublishingEditor";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
                if (j == CalendarPermissionLevel.REVIEWER) {
                    s2 = "Reviewer";
                    return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
                }
            }
            s2 = "Custom";
        }
        return append.append(s2).append("</t:CalendarPermissionLevel>").toString() + "</t:CalendarPermission>";
    }
    
    public UserId getUserId() {
        return this.a;
    }
    
    public void setUserId(final UserId userId) {
        this.a = userId;
    }
    
    public boolean canCreateItems() {
        return this.b;
    }
    
    public void setCanCreateItems(final boolean canCreateItems) {
        this.b = canCreateItems;
    }
    
    public boolean canCreateSubFolders() {
        return this.c;
    }
    
    public void setCanCreateSubFolders(final boolean canCreateSubFolders) {
        this.c = canCreateSubFolders;
    }
    
    public boolean isFolderOwner() {
        return this.d;
    }
    
    public void setFolderOwner(final boolean isFolderOwner) {
        this.d = isFolderOwner;
    }
    
    public boolean isFolderVisible() {
        return this.e;
    }
    
    public void setFolderVisible(final boolean isFolderVisible) {
        this.e = isFolderVisible;
    }
    
    public boolean isFolderContact() {
        return this.f;
    }
    
    public void setFolderContact(final boolean isFolderContact) {
        this.f = isFolderContact;
    }
    
    public PermissionAction getEditItems() {
        return this.g;
    }
    
    public void setEditItems(final PermissionAction editItems) {
        this.g = editItems;
    }
    
    public PermissionAction getDeleteItems() {
        return this.h;
    }
    
    public void setDeleteItems(final PermissionAction deleteItems) {
        this.h = deleteItems;
    }
    
    public CalendarPermissionReadAccess getReadItems() {
        return this.i;
    }
    
    public void setReadItems(final CalendarPermissionReadAccess readItems) {
        this.i = readItems;
    }
    
    public CalendarPermissionLevel getLevel() {
        return this.j;
    }
    
    public void setLevel(final CalendarPermissionLevel level) {
        this.j = level;
    }
}

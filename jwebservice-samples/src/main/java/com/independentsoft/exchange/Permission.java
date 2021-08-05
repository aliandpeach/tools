package com.independentsoft.exchange;

import javax.xml.stream.*;

public class Permission
{
    private UserId a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private PermissionAction g;
    private PermissionAction h;
    private PermissionReadAccess i;
    private PermissionLevel j;
    
    public Permission() {
        this.g = PermissionAction.NONE;
        this.h = PermissionAction.NONE;
        this.i = PermissionReadAccess.NONE;
        this.j = PermissionLevel.NONE;
    }
    
    Permission(final XMLStreamReader reader) throws XMLStreamException {
        this.g = PermissionAction.NONE;
        this.h = PermissionAction.NONE;
        this.i = PermissionReadAccess.NONE;
        this.j = PermissionLevel.NONE;
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
                    this.i = (elementText8.equals("FullDetails") ? PermissionReadAccess.FULL_DETAILS : PermissionReadAccess.NONE);
                }
            }
            else {
                final String elementText9;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PermissionLevel") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText9 = reader.getElementText()) != null && elementText9.length() > 0) {
                    final String s;
                    this.j = ((s = elementText9).equals("Author") ? PermissionLevel.AUTHOR : (s.equals("Contributor") ? PermissionLevel.CONTRIBUTOR : (s.equals("Custom") ? PermissionLevel.CUSTOM : (s.equals("Editor") ? PermissionLevel.EDITOR : (s.equals("NoneditingAuthor") ? PermissionLevel.NONEDITING_AUTHOR : (s.equals("Owner") ? PermissionLevel.OWNER : (s.equals("PublishingAuthor") ? PermissionLevel.PUBLISHING_AUTHOR : (s.equals("PublishingEditor") ? PermissionLevel.PUBLISHING_EDITOR : (s.equals("Reviewer") ? PermissionLevel.REVIEWER : PermissionLevel.NONE)))))))));
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Permission") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:Permission>";
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
        if (this.i != PermissionReadAccess.NONE) {
            s = s + "<t:ReadItems>" + ((this.i == PermissionReadAccess.FULL_DETAILS) ? "FullDetails" : "None") + "</t:ReadItems>";
        }
        final StringBuilder append = new StringBuilder().append(s).append("<t:PermissionLevel>");
        final PermissionLevel j;
        String s2;
        if ((j = this.j) == PermissionLevel.AUTHOR) {
            s2 = "Author";
        }
        else if (j == PermissionLevel.CONTRIBUTOR) {
            s2 = "Contributor";
        }
        else {
            if (j != PermissionLevel.CUSTOM) {
                if (j == PermissionLevel.EDITOR) {
                    s2 = "Editor";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
                if (j == PermissionLevel.NONEDITING_AUTHOR) {
                    s2 = "NoneditingAuthor";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
                if (j == PermissionLevel.OWNER) {
                    s2 = "Owner";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
                if (j == PermissionLevel.PUBLISHING_AUTHOR) {
                    s2 = "PublishingAuthor";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
                if (j == PermissionLevel.PUBLISHING_EDITOR) {
                    s2 = "PublishingEditor";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
                if (j == PermissionLevel.REVIEWER) {
                    s2 = "Reviewer";
                    return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
                }
            }
            s2 = "Custom";
        }
        return append.append(s2).append("</t:PermissionLevel>").toString() + "</t:Permission>";
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
    
    public PermissionReadAccess getReadItems() {
        return this.i;
    }
    
    public void setReadItems(final PermissionReadAccess readItems) {
        this.i = readItems;
    }
    
    public PermissionLevel getLevel() {
        return this.j;
    }
    
    public void setLevel(final PermissionLevel level) {
        this.j = level;
    }
}

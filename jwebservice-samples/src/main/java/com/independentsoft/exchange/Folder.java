package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Folder
{
    FolderId a;
    FolderId b;
    String c;
    String d;
    ManagedFolderInformation e;
    EffectiveRights f;
    PermissionSet g;
    StandardFolder h;
    RetentionTag i;
    RetentionTag j;
    int k;
    int l;
    int m;
    String n;
    String o;
    Date p;
    Date q;
    long r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    String w;
    ExtendedPropertyList x;
    
    public Folder() {
        this.h = StandardFolder.NONE;
        this.x = new ExtendedPropertyList();
    }
    
    public Folder(final String displayName) {
        this.h = StandardFolder.NONE;
        this.x = new ExtendedPropertyList();
        this.d = displayName;
    }
    
    public Folder(final String displayName, final String folderClass) {
        this.h = StandardFolder.NONE;
        this.x = new ExtendedPropertyList();
        this.d = displayName;
        this.c = folderClass;
    }
    
    Folder(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.h = StandardFolder.NONE;
        this.x = new ExtendedPropertyList();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new FolderId(xmlStreamReader, "FolderId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ParentFolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(xmlStreamReader, "ParentFolderId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FolderClass") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ManagedFolderInformation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new ManagedFolderInformation(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EffectiveRights") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new EffectiveRights(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PermissionSet") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = new PermissionSet(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DistinguishedFolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.h = com.independentsoft.exchange.a.Q(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PolicyTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.i = new RetentionTag(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ArchiveTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.j = new RetentionTag(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TotalCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.k = Integer.parseInt(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ChildFolderCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.l = Integer.parseInt(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExtendedProperty") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final ExtendedProperty extendedProperty;
                if ((extendedProperty = new ExtendedProperty(xmlStreamReader)).getPropertyPath() instanceof PropertyTag) {
                    final PropertyTag propertyTag;
                    if ((propertyTag = (PropertyTag)extendedProperty.getPropertyPath()).getTag() == MapiPropertyTag.PR_CONTENT_UNREAD.getTag() && propertyTag.getType() == MapiPropertyTag.PR_CONTENT_UNREAD.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.m = Integer.parseInt(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_COMMENT.getTag() && propertyTag.getType() == MapiPropertyTag.PR_COMMENT.getType()) {
                        this.n = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ENTRYID.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ENTRYID.getType()) {
                        this.o = extendedProperty.getValue();
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_CREATION_TIME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_CREATION_TIME.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.p = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_LAST_MODIFICATION_TIME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_LAST_MODIFICATION_TIME.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.q = com.independentsoft.exchange.d.c(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_MESSAGE_SIZE_EXTENDED.getTag() && propertyTag.getType() == MapiPropertyTag.PR_MESSAGE_SIZE_EXTENDED.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.r = Long.parseLong(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ATTR_HIDDEN.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ATTR_HIDDEN.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.s = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ATTR_READONLY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ATTR_READONLY.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.t = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_ATTR_SYSTEM.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ATTR_SYSTEM.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.u = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_SUBFOLDERS.getTag() && propertyTag.getType() == MapiPropertyTag.PR_SUBFOLDERS.getType()) {
                        if (extendedProperty.getValue() != null && extendedProperty.getValue().length() > 0) {
                            this.v = Boolean.parseBoolean(extendedProperty.getValue());
                        }
                    }
                    else if (propertyTag.getTag() == MapiPropertyTag.PR_SEARCH_KEY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_SEARCH_KEY.getType()) {
                        this.w = extendedProperty.getValue();
                    }
                }
                this.x.add(extendedProperty);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Folder") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    String a() {
        String s = "<t:Folder>";
        if (this.c != null) {
            s = s + "<t:FolderClass>" + com.independentsoft.exchange.d.a(this.c) + "</t:FolderClass>";
        }
        if (this.d != null) {
            s = s + "<t:DisplayName>" + com.independentsoft.exchange.d.a(this.d) + "</t:DisplayName>";
        }
        if (this.n != null) {
            s = s + "<t:Comment>" + com.independentsoft.exchange.d.a(this.n) + "</t:Comment>";
        }
        if (this.s) {
            s += new ExtendedProperty(MapiPropertyTag.PR_ATTR_HIDDEN, true).toString();
        }
        for (int i = 0; i < this.x.size(); ++i) {
            s += this.x.get(i).toString();
        }
        if (this.g != null) {
            s += this.g.toString();
        }
        return s + "</t:Folder>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public FolderId getFolderId() {
        return this.a;
    }
    
    public FolderId getParentId() {
        return this.b;
    }
    
    public String getFolderClass() {
        return this.c;
    }
    
    public void setFolderClass(final String folderClass) {
        this.c = folderClass;
    }
    
    public String getDisplayName() {
        return this.d;
    }
    
    public void setDisplayName(final String displayName) {
        this.d = displayName;
    }
    
    public ManagedFolderInformation getManagedFolderInformation() {
        return this.e;
    }
    
    public EffectiveRights getEffectiveRights() {
        return this.f;
    }
    
    public PermissionSet getPermissionSet() {
        return this.g;
    }
    
    public void setPermissionSet(final PermissionSet permissionSet) {
        this.g = permissionSet;
    }
    
    public StandardFolder getStandardFolder() {
        return this.h;
    }
    
    public RetentionTag getRetentionTag() {
        return this.i;
    }
    
    public RetentionTag getArchiveTag() {
        return this.j;
    }
    
    public int getTotalCount() {
        return this.k;
    }
    
    public int getChildFolderCount() {
        return this.l;
    }
    
    public int getUnreadCount() {
        return this.m;
    }
    
    public String getComment() {
        return this.n;
    }
    
    public void setComment(final String comment) {
        this.n = comment;
    }
    
    public String getEntryId() {
        return this.o;
    }
    
    public Date getCreationTime() {
        return this.p;
    }
    
    public Date getLastModifiedTime() {
        return this.q;
    }
    
    public long getSize() {
        return this.r;
    }
    
    public boolean isHidden() {
        return this.s;
    }
    
    public void setIsHidden(final boolean isHidden) {
        this.s = isHidden;
    }
    
    public boolean isReadOnly() {
        return this.t;
    }
    
    public boolean isSystem() {
        return this.u;
    }
    
    public boolean hasSubFolders() {
        return this.v;
    }
    
    public String getSearchKey() {
        return this.w;
    }
    
    public ExtendedPropertyList getExtendedProperties() {
        return this.x;
    }
}

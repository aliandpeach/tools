package com.independentsoft.exchange;

import javax.xml.stream.*;
import java.text.*;

public class CalendarFolder extends Folder
{
    private CalendarPermissionSet y;
    
    public CalendarFolder() {
    }
    
    public CalendarFolder(final String displayName) {
        this.d = displayName;
    }
    
    public CalendarFolder(final String displayName, final String folderClass) {
        this.d = displayName;
        this.c = folderClass;
    }
    
    CalendarFolder(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new FolderId(reader, "FolderId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ParentFolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(reader, "ParentFolderId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FolderClass") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DisplayName") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ManagedFolderInformation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new ManagedFolderInformation(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EffectiveRights") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new EffectiveRights(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PermissionSet") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.y = new CalendarPermissionSet(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DistinguishedFolderId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.h = com.independentsoft.exchange.a.Q(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PolicyTag") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.i = new RetentionTag(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ArchiveTag") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.j = new RetentionTag(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TotalCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.k = Integer.parseInt(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ChildFolderCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.l = Integer.parseInt(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExtendedProperty") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final ExtendedProperty extendedProperty;
                if ((extendedProperty = new ExtendedProperty(reader)).getPropertyPath() instanceof PropertyTag) {
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
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:CalendarFolder>";
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
        if (this.y != null) {
            s += this.y.toString();
        }
        return s + "</t:CalendarFolder>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public CalendarPermissionSet getCalendarPermissionSet() {
        return this.y;
    }
    
    public void setCalendarPermissionSet(final CalendarPermissionSet permissionSet) {
        this.y = permissionSet;
    }
}

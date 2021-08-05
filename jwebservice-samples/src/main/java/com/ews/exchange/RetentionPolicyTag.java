package com.ews.exchange;

import javax.xml.stream.*;

public class RetentionPolicyTag
{
    private String a;
    private String b;
    private int c;
    private ElcFolderType d;
    private RetentionAction e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private boolean l;
    private ContentSettings m;
    
    public RetentionPolicyTag() {
        this.d = ElcFolderType.ALL;
        this.e = RetentionAction.NONE;
    }
    
    RetentionPolicyTag(final XMLStreamReader reader) throws XMLStreamException {
        this.d = ElcFolderType.ALL;
        this.e = RetentionAction.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionPeriod") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.c = Integer.parseInt(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Type") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.d = com.ews.exchange.a.n(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.e = com.ews.exchange.a.m(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Description") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsVisible") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.g = Boolean.parseBoolean(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("OptedInto") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.j = Boolean.parseBoolean(elementText5);
                }
            }
            else {
                final String elementText6;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsArchive") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    this.h = Boolean.parseBoolean(elementText6);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionPolicyTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    RetentionPolicyTag(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.d = ElcFolderType.ALL;
        this.e = RetentionAction.NONE;
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader reader, final String s) throws XMLStreamException {
        if (s.equals("ArchiveTag")) {
            this.h = true;
        }
        else if (s.equals("DefaultArchiveTag")) {
            this.i = true;
        }
        this.k = reader.getAttributeValue(null, "ObjectGuid");
        this.b = reader.getAttributeValue(null, "Guid");
        this.a = reader.getAttributeValue(null, "Name");
        this.f = reader.getAttributeValue(null, "Comment");
        final String attributeValue = reader.getAttributeValue(null, "Type");
        final String attributeValue2 = reader.getAttributeValue(null, "MustDisplayComment");
        final String attributeValue3 = reader.getAttributeValue(null, "IsVisible");
        final String attributeValue4 = reader.getAttributeValue(null, "OptedInto");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.d = com.ews.exchange.a.n(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.l = attributeValue2.toLowerCase().equals("true");
        }
        if (attributeValue3 != null && attributeValue3.length() > 0) {
            this.g = attributeValue3.toLowerCase().equals("true");
        }
        if (attributeValue4 != null && attributeValue4.length() > 0) {
            this.j = attributeValue4.toLowerCase().equals("true");
        }
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getLocalName().equals("ContentSettings")) {
                this.m = new ContentSettings(reader);
                this.c = this.m.getPeriod();
                this.e = this.m.getRetentionAction();
            }
            if (reader.getLocalName() != null && reader.getLocalName().equals(s) && reader.isEndElement()) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "PolicyTag";
        if (this.h) {
            s = "ArchiveTag";
        }
        else if (this.i) {
            s = "DefaultArchiveTag";
        }
        String s2 = "<" + s;
        if (this.k != null) {
            s2 = s2 + " ObjectGuid=\"" + com.ews.exchange.d.a(this.k) + "\"";
        }
        if (this.b != null) {
            s2 = s2 + " Guid=\"" + com.ews.exchange.d.a(this.b) + "\"";
        }
        if (this.a != null) {
            s2 = s2 + " Name=\"" + com.ews.exchange.d.a(this.a) + "\"";
        }
        if (this.f != null) {
            s2 = s2 + " Comment=\"" + com.ews.exchange.d.a(this.f) + "\"";
        }
        final ElcFolderType d;
        final String string = s2 + " Type=\"" + (((d = this.d) == ElcFolderType.CALENDAR) ? "Calendar" : ((d == ElcFolderType.CONTACTS) ? "Contacts" : ((d == ElcFolderType.CONVERSATION_HISTORY) ? "ConversationHistory" : ((d == ElcFolderType.DELETED_ITEMS) ? "DeletedItems" : ((d == ElcFolderType.DRAFTS) ? "Drafts" : ((d == ElcFolderType.INBOX) ? "Inbox" : ((d == ElcFolderType.JOURNAL) ? "Journal" : ((d == ElcFolderType.JUNK_EMAIL) ? "JunkEmail" : ((d == ElcFolderType.MANAGED_CUSTOM_FOLDER) ? "ManagedCustomFolder" : ((d == ElcFolderType.NON_IPM_ROOT) ? "NonIpmRoot" : ((d == ElcFolderType.NOTES) ? "Notes" : ((d == ElcFolderType.OUTBOX) ? "Outbox" : ((d == ElcFolderType.PERSONAL) ? "Personal" : ((d == ElcFolderType.RECOVERABLE_ITEMS) ? "RecoverableItems" : ((d == ElcFolderType.RSS_SUBSCRIPTIONS) ? "RssSubscriptions" : ((d == ElcFolderType.SENT_ITEMS) ? "SentItems" : ((d == ElcFolderType.SYNC_ISSUES) ? "SyncIssues" : ((d == ElcFolderType.TASKS) ? "Tasks" : "All")))))))))))))))))) + "\"";
        String s3;
        if (this.l) {
            s3 = string + " MustDisplayComment=\"True\"";
        }
        else {
            s3 = string + " MustDisplayComment=\"False\"";
        }
        String s4;
        if (this.g) {
            s4 = s3 + " IsVisible=\"True\"";
        }
        else {
            s4 = s3 + " IsVisible=\"False\"";
        }
        String s5;
        if (this.j) {
            s5 = s4 + " OptedInto=\"True\"";
        }
        else {
            s5 = s4 + " OptedInto=\"False\"";
        }
        String s6 = s5 + " >";
        if (this.m != null) {
            s6 += this.m.a();
        }
        return s6 + "</" + s + ">";
    }
    
    public String getDisplayName() {
        return this.a;
    }
    
    public void setDisplayName(final String displayName) {
        this.a = displayName;
    }
    
    public String getId() {
        return this.b;
    }
    
    public void setId(final String id) {
        this.b = id;
    }
    
    public int getPeriod() {
        return this.c;
    }
    
    public void setPeriod(final int period) {
        this.c = period;
    }
    
    public ElcFolderType getType() {
        return this.d;
    }
    
    public void setType(final ElcFolderType type) {
        this.d = type;
    }
    
    public RetentionAction getRetentionAction() {
        return this.e;
    }
    
    public void setRetentionAction(final RetentionAction retentionAction) {
        this.e = retentionAction;
    }
    
    public String getDescription() {
        return this.f;
    }
    
    public void setDescription(final String description) {
        this.f = description;
    }
    
    public boolean isVisible() {
        return this.g;
    }
    
    public void setVisible(final boolean isVisible) {
        this.g = isVisible;
    }
    
    public boolean isArchive() {
        return this.h;
    }
    
    public void setArchive(final boolean isArchive) {
        this.h = isArchive;
    }
    
    public boolean isDefaultArchive() {
        return this.i;
    }
    
    public void setDefaultArchive(final boolean isDefaultArchive) {
        this.i = isDefaultArchive;
    }
    
    public boolean isOptedInto() {
        return this.j;
    }
    
    public void setOptedInto(final boolean optedInto) {
        this.j = optedInto;
    }
    
    public String getObjectGuid() {
        return this.k;
    }
    
    public void setObjectGuid(final String objectGuid) {
        this.k = objectGuid;
    }
    
    public boolean isMustDisplayDescription() {
        return this.l;
    }
    
    public void setMustDisplayDescription(final boolean mustDisplayDescription) {
        this.l = mustDisplayDescription;
    }
    
    public ContentSettings getContentSettings() {
        return this.m;
    }
    
    public void setContentSettings(final ContentSettings contentSettings) {
        this.m = contentSettings;
    }
}

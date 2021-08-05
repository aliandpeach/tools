package com.ews.exchange;

import javax.xml.stream.*;

public class ContentSettings
{
    private String a;
    private int b;
    private String c;
    private RetentionAction d;
    
    public ContentSettings() {
        this.d = RetentionAction.NONE;
    }
    
    ContentSettings(final XMLStreamReader reader) {
        this.d = RetentionAction.NONE;
        this.a = reader.getAttributeValue(null, "Guid");
        this.c = reader.getAttributeValue(null, "MessageClass");
        final String attributeValue = reader.getAttributeValue(null, "ExpiryAgeLimit");
        final String attributeValue2 = reader.getAttributeValue(null, "RetentionAction");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.b = Integer.parseInt(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.d = com.ews.exchange.a.m(attributeValue2);
        }
    }
    
    final String a() {
        String s = "<ContentSettings ";
        if (this.a != null) {
            s = s + " Guid=\"" + com.ews.exchange.d.a(this.a) + "\"";
        }
        if (this.b > 0) {
            s = s + " ExpiryAgeLimit=\"" + this.b + "\"";
        }
        if (this.c != null) {
            s = s + " MessageClass=\"" + com.ews.exchange.d.a(this.c) + "\"";
        }
        final RetentionAction d;
        return s + " RetentionAction=\"" + (((d = this.d) == RetentionAction.MOVE_TO_DELETED_ITEMS) ? "MoveToDeletedItems" : ((d == RetentionAction.MOVE_TO_FOLDER) ? "MoveToFolder" : ((d == RetentionAction.DELETE_AND_ALLOW_RECOVERY) ? "DeleteAndAllowRecovery" : ((d == RetentionAction.PERMANENTLY_DELETE) ? "PermanentlyDelete" : ((d == RetentionAction.MARK_AS_PAST_RETENTION_LIMIT) ? "MarkAsPastRetentionLimit" : ((d == RetentionAction.MOVE_TO_ARCHIVE) ? "MoveToArchive" : "None")))))) + "\"" + " />";
    }
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public int getPeriod() {
        return this.b;
    }
    
    public void setPeriod(final int period) {
        this.b = period;
    }
    
    public String getMessageClass() {
        return this.c;
    }
    
    public void setMessageClass(final String messageClass) {
        this.c = messageClass;
    }
    
    public RetentionAction getRetentionAction() {
        return this.d;
    }
    
    public void setRetentionAction(final RetentionAction retentionAction) {
        this.d = retentionAction;
    }
}

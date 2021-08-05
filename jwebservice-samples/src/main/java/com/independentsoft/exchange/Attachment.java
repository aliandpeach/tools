package com.independentsoft.exchange;

import java.util.*;

public abstract class Attachment
{
    protected AttachmentId attachmentId;
    protected String name;
    protected String contentType;
    protected String contentId;
    protected String contentLocation;
    protected int size;
    protected Date lastModifiedTime;
    protected boolean isInline;
    
    abstract String a();
    
    public AttachmentId getAttachmentId() {
        return this.attachmentId;
    }
    
    public void setAttachmentId(final AttachmentId attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }
    
    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(final String contentId) {
        this.contentId = contentId;
    }
    
    public String getContentLocation() {
        return this.contentLocation;
    }
    
    public void setContentLocation(final String contentLocation) {
        this.contentLocation = contentLocation;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public void setSize(final int size) {
        this.size = size;
    }
    
    public Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    
    public void setLastModifiedTime(final Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    public boolean isInline() {
        return this.isInline;
    }
    
    public void setInline(final boolean isInline) {
        this.isInline = isInline;
    }
}

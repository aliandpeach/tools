package com.ews.exchange;

import java.util.*;

public abstract class AttachmentInfo
{
    String a;
    String b;
    String c;
    String d;
    String e;
    int f;
    Date g;
    boolean h;
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public String getName() {
        return this.b;
    }
    
    public void setName(final String name) {
        this.b = name;
    }
    
    public String getContentType() {
        return this.c;
    }
    
    public void setContentType(final String contentType) {
        this.c = contentType;
    }
    
    public String getContentId() {
        return this.d;
    }
    
    public void setContentId(final String contentId) {
        this.d = contentId;
    }
    
    public String getContentLocation() {
        return this.e;
    }
    
    public void setContentLocation(final String contentLocation) {
        this.e = contentLocation;
    }
    
    public int getSize() {
        return this.f;
    }
    
    public void setSize(final int size) {
        this.f = size;
    }
    
    public Date getLastModifiedTime() {
        return this.g;
    }
    
    public void setLastModifiedTime(final Date lastModifiedTime) {
        this.g = lastModifiedTime;
    }
    
    public boolean isInline() {
        return this.h;
    }
    
    public void setInline(final boolean isInline) {
        this.h = isInline;
    }
}

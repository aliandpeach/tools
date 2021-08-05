package com.independentsoft.exchange;

import java.util.*;

public abstract class Subscription
{
    List<FolderId> a;
    List<EventType> b;
    String c;
    boolean d;
    
    public Subscription() {
        this.a = new ArrayList<FolderId>();
        this.b = new ArrayList<EventType>();
    }
    
    abstract String a();
    
    public List<FolderId> getFolders() {
        return this.a;
    }
    
    public List<EventType> getEventTypes() {
        return this.b;
    }
    
    public String getWatermark() {
        return this.c;
    }
    
    public void setWatermark(final String watermark) {
        this.c = watermark;
    }
    
    public boolean isSubscribeToAllFolders() {
        return this.d;
    }
    
    public void setSubscribeToAllFolders(final boolean subscribeToAllFolders) {
        this.d = subscribeToAllFolders;
    }
}

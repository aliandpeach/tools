package com.ews.exchange;

import java.util.*;

public class PushSubscription extends Subscription
{
    private int e;
    private String f;
    private String g;
    
    public PushSubscription() {
    }
    
    public PushSubscription(final boolean subscribeToAllFolders, final EventType eventType) {
        this.d = subscribeToAllFolders;
        this.b.add(eventType);
    }
    
    public PushSubscription(final boolean subscribeToAllFolders, final List<EventType> eventTypes) {
        this.d = subscribeToAllFolders;
        this.b = eventTypes;
    }
    
    public PushSubscription(final FolderId folderId, final String url) {
        this.a.add(folderId);
        this.f = url;
    }
    
    public PushSubscription(final FolderId folderId, final EventType eventType, final String url) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.f = url;
    }
    
    public PushSubscription(final FolderId folderId, final EventType eventType, final String url, final String watermark) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.f = url;
        this.c = watermark;
    }
    
    public PushSubscription(final FolderId folderId, final EventType eventType, final String url, final int statusFrequency) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.f = url;
        this.e = statusFrequency;
    }
    
    public PushSubscription(final FolderId folderId, final EventType eventType, final String url, final int statusFrequency, final String watermark) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.f = url;
        this.e = statusFrequency;
        this.c = watermark;
    }
    
    public PushSubscription(final StandardFolder standardFolder, final String url) {
        this.a.add(new StandardFolderId(standardFolder));
        this.f = url;
    }
    
    public PushSubscription(final StandardFolder standardFolder, final EventType eventType, final String url) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.f = url;
    }
    
    public PushSubscription(final StandardFolder standardFolder, final EventType eventType, final String url, final String watermark) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.f = url;
        this.c = watermark;
    }
    
    public PushSubscription(final StandardFolder standardFolder, final EventType eventType, final String url, final int statusFrequency) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.f = url;
        this.e = statusFrequency;
    }
    
    public PushSubscription(final StandardFolder standardFolder, final EventType eventType, final String url, final int statusFrequency, final String watermark) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.f = url;
        this.e = statusFrequency;
        this.c = watermark;
    }
    
    final String a() {
        String string = "";
        if (this.d) {
            string += " SubscribeToAllFolders=\"true\"";
        }
        String s = "<PushSubscriptionRequest" + string + ">";
        if (this.a != null && this.a.size() > 0) {
            String s2 = s + "<t:FolderIds>";
            for (int i = 0; i < this.a.size(); ++i) {
                s2 += this.a.get(i).a();
            }
            s = s2 + "</t:FolderIds>";
        }
        if (this.b != null && this.b.size() > 0) {
            String s3 = s + "<t:EventTypes>";
            for (int j = 0; j < this.b.size(); ++j) {
                s3 = s3 + "<t:EventType>" + com.ews.exchange.a.a(this.b.get(j)) + "</t:EventType>";
            }
            s = s3 + "</t:EventTypes>";
        }
        if (this.c != null) {
            s = s + "<t:Watermark>" + com.ews.exchange.d.a(this.c) + "</t:Watermark>";
        }
        if (this.e <= 0 || this.e > 1440) {
            this.e = 30;
        }
        String s4 = s + "<t:StatusFrequency>" + this.e + "</t:StatusFrequency>";
        if (this.f != null) {
            s4 = s4 + "<t:URL>" + com.ews.exchange.d.a(this.f) + "</t:URL>";
        }
        if (this.g != null) {
            s4 = s4 + "<t:CallerData>" + com.ews.exchange.d.a(this.g) + "</t:CallerData>";
        }
        return s4 + "</PushSubscriptionRequest>";
    }
    
    public int getStatusFrequency() {
        return this.e;
    }
    
    public void setStatusFrequency(final int statusFrequency) {
        this.e = statusFrequency;
    }
    
    public String getUrl() {
        return this.f;
    }
    
    public void setUrl(final String url) {
        this.f = url;
    }
    
    public String getCallerData() {
        return this.g;
    }
    
    public void setCallerData(final String callerData) {
        this.g = callerData;
    }
}

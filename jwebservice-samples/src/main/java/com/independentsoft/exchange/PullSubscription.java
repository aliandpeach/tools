package com.independentsoft.exchange;

import java.util.*;

public class PullSubscription extends Subscription
{
    private int e;
    
    public PullSubscription() {
    }
    
    public PullSubscription(final boolean subscribeToAllFolders, final EventType eventType) {
        this.d = subscribeToAllFolders;
        this.b.add(eventType);
    }
    
    public PullSubscription(final boolean subscribeToAllFolders, final List<EventType> eventTypes) {
        this.d = subscribeToAllFolders;
        this.b = eventTypes;
    }
    
    public PullSubscription(final FolderId folderId) {
        this.a.add(folderId);
    }
    
    public PullSubscription(final FolderId folderId, final EventType eventType) {
        this.a.add(folderId);
        this.b.add(eventType);
    }
    
    public PullSubscription(final FolderId folderId, final EventType eventType, final int timeout) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.e = timeout;
    }
    
    public PullSubscription(final FolderId folderId, final EventType eventType, final String watermark) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.c = watermark;
    }
    
    public PullSubscription(final FolderId folderId, final EventType eventType, final int timeout, final String watermark) {
        this.a.add(folderId);
        this.b.add(eventType);
        this.e = timeout;
        this.c = watermark;
    }
    
    public PullSubscription(final StandardFolder standardFolder) {
        this.a.add(new StandardFolderId(standardFolder));
    }
    
    public PullSubscription(final StandardFolder standardFolder, final EventType eventType) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
    }
    
    public PullSubscription(final StandardFolder standardFolder, final EventType eventType, final int timeout) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.e = timeout;
    }
    
    public PullSubscription(final StandardFolder standardFolder, final EventType eventType, final String watermark) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.c = watermark;
    }
    
    public PullSubscription(final StandardFolder standardFolder, final EventType eventType, final int timeout, final String watermark) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
        this.e = timeout;
        this.c = watermark;
    }
    
    final String a() {
        String string = "";
        if (this.d) {
            string += " SubscribeToAllFolders=\"true\"";
        }
        String s = "<PullSubscriptionRequest" + string + ">";
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
                s3 = s3 + "<t:EventType>" + com.independentsoft.exchange.a.a(this.b.get(j)) + "</t:EventType>";
            }
            s = s3 + "</t:EventTypes>";
        }
        if (this.c != null) {
            s = s + "<t:Watermark>" + com.independentsoft.exchange.d.a(this.c) + "</t:Watermark>";
        }
        if (this.e <= 0 || this.e > 1440) {
            this.e = 1440;
        }
        return s + "<t:Timeout>" + this.e + "</t:Timeout>" + "</PullSubscriptionRequest>";
    }
    
    public int getTimeout() {
        return this.e;
    }
    
    public void setTimeout(final int timeout) {
        this.e = timeout;
    }
}

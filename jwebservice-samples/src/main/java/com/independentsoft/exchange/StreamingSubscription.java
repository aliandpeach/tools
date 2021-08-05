package com.independentsoft.exchange;

import java.util.*;

public class StreamingSubscription extends Subscription
{
    public StreamingSubscription() {
    }
    
    public StreamingSubscription(final boolean subscribeToAllFolders, final EventType eventType) {
        this.d = subscribeToAllFolders;
        this.b.add(eventType);
    }
    
    public StreamingSubscription(final boolean subscribeToAllFolders, final List<EventType> eventTypes) {
        this.d = subscribeToAllFolders;
        this.b = eventTypes;
    }
    
    public StreamingSubscription(final FolderId folderId, final EventType eventType) {
        this.a.add(folderId);
        this.b.add(eventType);
    }
    
    public StreamingSubscription(final FolderId folderId, final List<EventType> eventTypes) {
        this.a.add(folderId);
        this.b = eventTypes;
    }
    
    public StreamingSubscription(final StandardFolder standardFolder, final EventType eventType) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b.add(eventType);
    }
    
    public StreamingSubscription(final StandardFolder standardFolder, final List<EventType> eventTypes) {
        this.a.add(new StandardFolderId(standardFolder));
        this.b = eventTypes;
    }
    
    public StreamingSubscription(final List<FolderId> folders, final List<EventType> eventTypes) {
        this.a = folders;
        this.b = eventTypes;
    }
    
    final String a() {
        String string = "";
        if (this.d) {
            string += " SubscribeToAllFolders=\"true\"";
        }
        String s = "<StreamingSubscriptionRequest" + string + ">";
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
        return s + "</StreamingSubscriptionRequest>";
    }
}

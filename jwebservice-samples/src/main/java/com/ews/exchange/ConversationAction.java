package com.ews.exchange;

import java.util.*;

public class ConversationAction
{
    private ConversationActionType a;
    private ItemId b;
    private FolderId c;
    private Date d;
    private boolean e;
    private FolderId f;
    private List<String> g;
    private boolean h;
    private boolean i;
    private DeleteType j;
    
    public ConversationAction() {
        this.a = ConversationActionType.ALWAYS_CATEGORIZE;
        this.g = new ArrayList<String>();
        this.j = DeleteType.NONE;
    }
    
    final String a() {
        final ConversationActionType a;
        String s = "<t:ConversationAction>" + "<t:Action>" + (((a = this.a) == ConversationActionType.ALWAYS_CATEGORIZE) ? "AlwaysCategorize" : ((a == ConversationActionType.ALWAYS_DELETE) ? "AlwaysDelete" : ((a == ConversationActionType.ALWAYS_MOVE) ? "AlwaysMove" : ((a == ConversationActionType.DELETE) ? "Delete" : ((a == ConversationActionType.MOVE) ? "Move" : ((a == ConversationActionType.COPY) ? "Copy" : "SetReadState")))))) + "</t:Action>";
        if (this.b != null) {
            s += this.b.a("t:ConversationId");
        }
        if (this.c != null) {
            s = s + "<t:ContextFolderId>" + this.c.a() + "</t:ContextFolderId>";
        }
        if (this.d != null) {
            s = s + "<t:ConversationLastSyncTime>" + com.ews.exchange.d.a(this.d) + "</t:ConversationLastSyncTime>";
        }
        if (this.e) {
            s += "<t:ProcessRightAway>true</t:ProcessRightAway>";
        }
        if (this.f != null) {
            s = s + "<t:DestinationFolderId>" + this.f.a() + "</t:DestinationFolderId>";
        }
        if (this.g != null && this.g.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.g.size(); ++i) {
                if (this.g.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.ews.exchange.d.a(this.g.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.h) {
            s += "<t:EnableAlwaysDelete>true</t:EnableAlwaysDelete>";
        }
        if (this.i) {
            s += "<t:IsRead>true</t:IsRead>";
        }
        if (this.j != DeleteType.NONE) {
            s = s + "<t:DeleteType>" + com.ews.exchange.a.a(this.j) + "</t:DeleteType>";
        }
        return s + "</t:ConversationAction>";
    }
    
    public ConversationActionType getAction() {
        return this.a;
    }
    
    public void setAction(final ConversationActionType action) {
        this.a = action;
    }
    
    public ItemId getConversationId() {
        return this.b;
    }
    
    public void setConversationId(final ItemId conversationId) {
        this.b = conversationId;
    }
    
    public FolderId getContextFolderId() {
        return this.c;
    }
    
    public void setContextFolderId(final FolderId contextFolderId) {
        this.c = contextFolderId;
    }
    
    public Date getConversationLastSyncTime() {
        return this.d;
    }
    
    public void setConversationLastSyncTime(final Date conversationLastSyncTime) {
        this.d = conversationLastSyncTime;
    }
    
    public boolean getProcessRightAway() {
        return this.e;
    }
    
    public void setProcessRightAway(final boolean processRightAway) {
        this.e = processRightAway;
    }
    
    public FolderId getDestinationFolderId() {
        return this.f;
    }
    
    public void setDestinationFolderId(final FolderId destinationFolderId) {
        this.f = destinationFolderId;
    }
    
    public List<String> getCategories() {
        return this.g;
    }
    
    public boolean getEnableAlwaysDelete() {
        return this.h;
    }
    
    public void setEnableAlwaysDelete(final boolean enableAlwaysDelete) {
        this.h = enableAlwaysDelete;
    }
    
    public boolean isRead() {
        return this.i;
    }
    
    public void setAsRead(final boolean isRead) {
        this.i = isRead;
    }
    
    public DeleteType getDeleteType() {
        return this.j;
    }
    
    public void setDeleteType(final DeleteType deleteType) {
        this.j = deleteType;
    }
}

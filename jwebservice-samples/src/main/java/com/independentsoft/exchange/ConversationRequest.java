package com.independentsoft.exchange;

public class ConversationRequest
{
    private ItemId a;
    private String b;
    
    public ConversationRequest() {
    }
    
    public ConversationRequest(final ItemId conversationId) {
        this.a = conversationId;
    }
    
    public ConversationRequest(final ItemId conversationId, final String syncState) {
        this.a = conversationId;
        this.b = syncState;
    }
    
    final String a() {
        String s = "<t:Conversation>" + this.a.a("t:ConversationId");
        if (this.b != null) {
            s = s + "<t:SyncState>" + d.a(this.b) + "</t:SyncState>";
        }
        return s + "</t:Conversation>";
    }
    
    public ItemId getConversationId() {
        return this.a;
    }
    
    public void setConversationId(final ItemId conversationId) {
        this.a = conversationId;
    }
    
    public String getSyncState() {
        return this.b;
    }
    
    public void setSyncState(final String syncState) {
        this.b = syncState;
    }
}

package com.ews.exchange;

public class ClientAccessTokenRequest
{
    private String a;
    private ClientAccessTokenType b;
    
    public ClientAccessTokenRequest() {
        this.b = ClientAccessTokenType.CALLER_IDENTITY;
    }
    
    public ClientAccessTokenRequest(final String id, final ClientAccessTokenType type) {
        this.b = ClientAccessTokenType.CALLER_IDENTITY;
        this.a = id;
        this.b = type;
    }
    
    final String a() {
        return "<t:TokenRequest>" + "<t:Id>" + d.a(this.a) + "</t:Id>" + "<t:TokenType>" + ((this.b == ClientAccessTokenType.CALLER_IDENTITY) ? "CallerIdentity" : "ExtensionCallback") + "</t:TokenType>" + "</t:TokenRequest>";
    }
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public ClientAccessTokenType getType() {
        return this.b;
    }
    
    public void setType(final ClientAccessTokenType type) {
        this.b = type;
    }
}

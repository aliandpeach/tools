package com.ews.exchange;

public class WebProtocol
{
    private ProtocolType a;
    private InternalAccess b;
    private ExternalAccess c;
    
    public WebProtocol() {
        this.a = ProtocolType.EXCHANGE_PROXY;
    }
    
    public ProtocolType getType() {
        return this.a;
    }
    
    public InternalAccess getInternalAccess() {
        return this.b;
    }
    
    public void setInternalAccess(final InternalAccess internalAccess) {
        this.b = internalAccess;
    }
    
    public ExternalAccess getExternalAccess() {
        return this.c;
    }
    
    public void setExternalAccess(final ExternalAccess externalAccess) {
        this.c = externalAccess;
    }
}

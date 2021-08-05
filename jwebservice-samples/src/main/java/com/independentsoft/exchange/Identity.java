package com.independentsoft.exchange;

public class Identity
{
    private String a;
    private String b;
    private String c;
    private String d;
    
    public Identity() {
    }
    
    public Identity(final String primarySmtpAddress) {
        this.c = primarySmtpAddress;
    }
    
    public String getPrincipalName() {
        return this.a;
    }
    
    public void setPrincipalName(final String principalName) {
        this.a = principalName;
    }
    
    public String getSid() {
        return this.b;
    }
    
    public void setSid(final String sid) {
        this.b = sid;
    }
    
    public String getPrimarySmtpAddress() {
        return this.c;
    }
    
    public void setPrimarySmtpAddress(final String primarySmtpAddress) {
        this.c = primarySmtpAddress;
    }
    
    public String getSmtpAddress() {
        return this.d;
    }
    
    public void setSmtpAddress(final String smtpAddress) {
        this.d = smtpAddress;
    }
    
    final String a() {
        String s = "<t:ExchangeImpersonation>" + "<t:ConnectingSID>";
        if (this.a != null) {
            s = s + "<t:PrincipalName>" + com.independentsoft.exchange.d.a(this.a) + "</t:PrincipalName>";
        }
        if (this.b != null) {
            s = s + "<t:SID>" + com.independentsoft.exchange.d.a(this.b) + "</t:SID>";
        }
        if (this.c != null) {
            s = s + "<t:PrimarySmtpAddress>" + com.independentsoft.exchange.d.a(this.c) + "</t:PrimarySmtpAddress>";
        }
        if (this.d != null) {
            s = s + "<t:SmtpAddress>" + com.independentsoft.exchange.d.a(this.d) + "</t:SmtpAddress>";
        }
        return s + "</t:ConnectingSID>" + "</t:ExchangeImpersonation>";
    }
}

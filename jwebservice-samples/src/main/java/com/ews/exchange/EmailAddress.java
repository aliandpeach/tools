package com.ews.exchange;

public class EmailAddress
{
    private String a;
    private String b;
    private String c;
    
    public EmailAddress() {
    }
    
    public EmailAddress(final String address) {
        this.b = address;
    }
    
    public EmailAddress(final String address, final String name) {
        this.b = address;
        this.a = name;
    }
    
    public EmailAddress(final String address, final String name, final String routingType) {
        this.b = address;
        this.a = name;
        this.c = routingType;
    }
    
    final String a(final String s) {
        String s2 = "<t:" + s + ">";
        if (this.a != null) {
            s2 = s2 + "<t:Name>" + d.a(this.a) + "</t:Name>";
        }
        if (this.b != null) {
            s2 = s2 + "<t:Address>" + d.a(this.b) + "</t:Address>";
        }
        if (this.c != null) {
            s2 = s2 + "<t:RoutingType>" + d.a(this.c) + "</t:RoutingType>";
        }
        return s2 + "</t:" + s + ">";
    }
    
    public String toString() {
        if (this.b != null) {
            return this.b;
        }
        return super.toString();
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public String getAddress() {
        return this.b;
    }
    
    public void setAddress(final String address) {
        this.b = address;
    }
    
    public String getRoutingType() {
        return this.c;
    }
    
    public void setRoutingType(final String routingType) {
        this.c = routingType;
    }
}

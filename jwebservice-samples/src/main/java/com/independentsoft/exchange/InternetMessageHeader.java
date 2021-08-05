package com.independentsoft.exchange;

public class InternetMessageHeader
{
    private String a;
    private String b;
    
    public InternetMessageHeader() {
    }
    
    public InternetMessageHeader(final String name, final String value) {
        this.a = name;
        this.b = value;
    }
    
    public String toString() {
        String s = "";
        if (this.a != null) {
            s = s + this.a + ":";
            if (this.b != null) {
                s += this.b;
            }
        }
        return s;
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public String getValue() {
        return this.b;
    }
    
    public void setValue(final String value) {
        this.b = value;
    }
}

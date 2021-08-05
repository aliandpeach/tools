package com.independentsoft.json.parser;

public class Member
{
    private String a;
    private JsonValue b;
    
    public Member() {
    }
    
    public Member(final String name, final JsonValue value) {
        this.a = name;
        this.b = value;
    }
    
    public String toString() {
        return "\"" + this.a + "\":" + this.b.toString();
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public JsonValue getValue() {
        return this.b;
    }
    
    public void setValue(final JsonValue value) {
        this.b = value;
    }
}

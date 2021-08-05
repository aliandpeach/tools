package com.independentsoft.msg;

public class ExtendedPropertyName extends ExtendedPropertyTag
{
    private String a;
    
    public ExtendedPropertyName() {
    }
    
    public ExtendedPropertyName(final String name, final byte[] guid) {
        this.a = name;
        this.guid = guid;
    }
    
    public ExtendedPropertyName(final String name, final byte[] guid, final PropertyType type) {
        this.a = name;
        this.guid = guid;
        this.type = type;
    }
    
    public String toString() {
        return this.a;
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
}

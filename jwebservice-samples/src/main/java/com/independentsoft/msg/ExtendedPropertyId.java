package com.independentsoft.msg;

public class ExtendedPropertyId extends ExtendedPropertyTag
{
    private int a;
    
    public ExtendedPropertyId() {
    }
    
    public ExtendedPropertyId(final int id, final byte[] guid) {
        this.a = id;
        this.guid = guid;
    }
    
    public ExtendedPropertyId(final int id, final byte[] guid, final PropertyType type) {
        this.a = id;
        this.guid = guid;
        this.type = type;
    }
    
    public String toString() {
        return Integer.toString(this.a);
    }
    
    public int getId() {
        return this.a;
    }
    
    public void setId(final int id) {
        this.a = id;
    }
}

package com.ews.msg;

public abstract class ExtendedPropertyTag
{
    protected byte[] guid;
    protected PropertyType type;
    
    public ExtendedPropertyTag() {
        this.type = PropertyType.STRING;
    }
    
    public byte[] getGuid() {
        return this.guid;
    }
    
    public void setGuid(final byte[] guid) {
        this.guid = guid;
    }
    
    public PropertyType getType() {
        return this.type;
    }
    
    public void setType(final PropertyType type) {
        this.type = type;
    }
}

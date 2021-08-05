package com.ews.exchange;

public class PropertyTag extends ExtendedPropertyPath
{
    private int a;
    private MapiPropertyType b;
    
    public PropertyTag() {
        this.b = MapiPropertyType.STRING;
    }
    
    public PropertyTag(final long tag) {
        this.b = MapiPropertyType.STRING;
        this.a = (int)((tag & 0xFFFFFFFFFFFF0000L) >> 16);
        this.b = d.a(tag);
    }
    
    public PropertyTag(final int tag, final MapiPropertyType type) {
        this.b = MapiPropertyType.STRING;
        this.a = tag;
        this.b = type;
    }
    
    public boolean isEqual(final ExtendedPropertyPath propertyPath) {
        final PropertyTag propertyTag;
        return propertyPath instanceof PropertyTag && (propertyTag = (PropertyTag)propertyPath).getTag() == this.a && propertyTag.getType() == this.b;
    }
    
    public String toString() {
        return "<t:ExtendedFieldURI PropertyTag=\"0x" + String.format("%04X", this.a) + "\" PropertyType=\"" + com.ews.exchange.a.a(this.b) + "\" />";
    }
    
    public int getTag() {
        return this.a;
    }
    
    public void setTag(final int tag) {
        this.a = tag;
    }
    
    public MapiPropertyType getType() {
        return this.b;
    }
    
    public void setType(final MapiPropertyType type) {
        this.b = type;
    }
}

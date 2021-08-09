package com.ews.exchange;

public class CustomPropertyId extends ExtendedPropertyPath
{
    private int a;
    private String b;
    private MapiPropertyType c;
    
    public CustomPropertyId() {
        this.c = MapiPropertyType.STRING;
    }
    
    public CustomPropertyId(final int id, final String set) {
        this.c = MapiPropertyType.STRING;
        this.a = id;
        this.b = set;
    }
    
    public CustomPropertyId(final int id, final String set, final MapiPropertyType type) {
        this.c = MapiPropertyType.STRING;
        this.a = id;
        this.b = set;
        this.c = type;
    }
    
    public boolean isEqual(final ExtendedPropertyPath propertyPath) {
        final CustomPropertyId customPropertyId;
        return propertyPath instanceof CustomPropertyId && (customPropertyId = (CustomPropertyId)propertyPath).getId() == this.a && customPropertyId.getSet().equalsIgnoreCase(this.b) && customPropertyId.getType() == this.c;
    }
    
    public String toString() {
        return "<t:ExtendedFieldURI PropertySetId=\"" + d.a(this.b) + "\" PropertyId=\"" + this.a + "\" PropertyType=\"" + com.ews.exchange.a.a(this.c) + "\"/>";
    }
    
    public int getId() {
        return this.a;
    }
    
    public void setId(final int id) {
        this.a = id;
    }
    
    public String getSet() {
        return this.b;
    }
    
    public void setSet(final String set) {
        this.b = set;
    }
    
    public MapiPropertyType getType() {
        return this.c;
    }
    
    public void setType(final MapiPropertyType type) {
        this.c = type;
    }
}

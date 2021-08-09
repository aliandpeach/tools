package com.ews.exchange;

public class PropertyId extends ExtendedPropertyPath
{
    private int a;
    private StandardPropertySet b;
    private MapiPropertyType c;
    
    public PropertyId() {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
    }
    
    public PropertyId(final int id) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = id;
    }
    
    public PropertyId(final int id, final StandardPropertySet set) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = id;
        this.b = set;
    }
    
    public PropertyId(final int id, final StandardPropertySet set, final MapiPropertyType type) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = id;
        this.b = set;
        this.c = type;
    }
    
    public boolean isEqual(final ExtendedPropertyPath propertyPath) {
        final PropertyId propertyId;
        return propertyPath instanceof PropertyId && (propertyId = (PropertyId)propertyPath).getId() == this.a && propertyId.getSet() == this.b && propertyId.getType() == this.c;
    }
    
    public String toString() {
        return "<t:ExtendedFieldURI DistinguishedPropertySetId=\"" + com.ews.exchange.a.a(this.b) + "\" PropertyId=\"" + this.a + "\" PropertyType=\"" + com.ews.exchange.a.a(this.c) + "\"/>";
    }
    
    public int getId() {
        return this.a;
    }
    
    public void setId(final int id) {
        this.a = id;
    }
    
    public StandardPropertySet getSet() {
        return this.b;
    }
    
    public void setSet(final StandardPropertySet set) {
        this.b = set;
    }
    
    public MapiPropertyType getType() {
        return this.c;
    }
    
    public void setType(final MapiPropertyType type) {
        this.c = type;
    }
}

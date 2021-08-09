package com.ews.exchange;

public class PropertyName extends ExtendedPropertyPath
{
    private String a;
    private StandardPropertySet b;
    private MapiPropertyType c;
    
    public PropertyName() {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
    }
    
    public PropertyName(final String name) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = name;
    }
    
    public PropertyName(final String name, final StandardPropertySet set) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = name;
        this.b = set;
    }
    
    public PropertyName(final String name, final StandardPropertySet set, final MapiPropertyType type) {
        this.b = StandardPropertySet.PUBLIC_STRINGS;
        this.c = MapiPropertyType.STRING;
        this.a = name;
        this.b = set;
        this.c = type;
    }
    
    public boolean isEqual(final ExtendedPropertyPath propertyPath) {
        final PropertyName propertyName;
        return propertyPath instanceof PropertyName && (propertyName = (PropertyName)propertyPath).getName().equalsIgnoreCase(this.a) && propertyName.getSet() == this.b && propertyName.getType() == this.c;
    }
    
    public String toString() {
        return "<t:ExtendedFieldURI DistinguishedPropertySetId=\"" + com.ews.exchange.a.a(this.b) + "\" PropertyName=\"" + d.a(this.a) + "\" PropertyType=\"" + com.ews.exchange.a.a(this.c) + "\"/>";
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
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

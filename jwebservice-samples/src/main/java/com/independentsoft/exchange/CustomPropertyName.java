package com.independentsoft.exchange;

public class CustomPropertyName extends ExtendedPropertyPath
{
    private String a;
    private String b;
    private MapiPropertyType c;
    
    public CustomPropertyName() {
        this.c = MapiPropertyType.STRING;
    }
    
    public CustomPropertyName(final String name) {
        this.c = MapiPropertyType.STRING;
        this.a = name;
    }
    
    public CustomPropertyName(final String name, final String set) {
        this.c = MapiPropertyType.STRING;
        this.a = name;
        this.b = set;
    }
    
    public CustomPropertyName(final String name, final String set, final MapiPropertyType type) {
        this.c = MapiPropertyType.STRING;
        this.a = name;
        this.b = set;
        this.c = type;
    }
    
    public boolean isEqual(final ExtendedPropertyPath propertyPath) {
        final CustomPropertyName customPropertyName;
        return propertyPath instanceof CustomPropertyName && (customPropertyName = (CustomPropertyName)propertyPath).getName().equalsIgnoreCase(this.a) && customPropertyName.getSet().equalsIgnoreCase(this.b) && customPropertyName.getType() == this.c;
    }
    
    public String toString() {
        return "<t:ExtendedFieldURI PropertySetId=\"" + d.a(this.b) + "\" PropertyName=\"" + d.a(this.a) + "\" PropertyType=\"" + com.independentsoft.exchange.a.a(this.c) + "\"/>";
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
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

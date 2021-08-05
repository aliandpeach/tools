package com.independentsoft.exchange;

public class Excludes extends Restriction
{
    private PropertyPath a;
    private String b;
    
    public Excludes() {
    }
    
    public Excludes(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public Excludes(final PropertyPath propertyPath, final String bitmask) {
        this.a = propertyPath;
        this.b = bitmask;
    }
    
    public String toString() {
        String string = "";
        if (this.a != null && this.b != null) {
            string = string + "<t:Excludes>" + this.a.toString() + "<t:Bitmask Value=\"" + d.a(this.b) + "\"/>" + "</t:Excludes>";
        }
        return string;
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public String getBitmask() {
        return this.b;
    }
    
    public void setBitmask(final String bitmask) {
        this.b = bitmask;
    }
}

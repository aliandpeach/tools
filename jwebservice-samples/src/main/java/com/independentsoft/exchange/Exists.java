package com.independentsoft.exchange;

public class Exists extends Restriction
{
    private PropertyPath a;
    
    public Exists() {
    }
    
    public Exists(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public String toString() {
        String string = "";
        if (this.a != null) {
            string = string + "<t:Exists>" + this.a.toString() + "</t:Exists>";
        }
        return string;
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
}

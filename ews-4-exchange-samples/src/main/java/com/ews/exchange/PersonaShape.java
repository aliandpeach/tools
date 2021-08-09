package com.ews.exchange;

import java.util.*;

public class PersonaShape
{
    private ShapeType a;
    private List<PropertyPath> b;
    
    public PersonaShape() {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
    }
    
    public PersonaShape(final ShapeType type) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.a = type;
    }
    
    public PersonaShape(final List<PropertyPath> propertyPaths) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.b = propertyPaths;
    }
    
    public PersonaShape(final ShapeType type, final List<PropertyPath> propertyPaths) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.a = type;
        this.b = propertyPaths;
    }
    
    public String toString() {
        String s = "<PersonaShape>" + "<t:BaseShape>" + com.ews.exchange.a.a(this.a) + "</t:BaseShape>";
        if (this.b != null && this.b.size() > 0) {
            String s2 = s + "<t:AdditionalProperties>";
            for (int i = 0; i < this.b.size(); ++i) {
                s2 += this.b.get(i).toString();
            }
            s = s2 + "</t:AdditionalProperties>";
        }
        return s + "</PersonaShape>";
    }
    
    public ShapeType getType() {
        return this.a;
    }
    
    public void setType(final ShapeType type) {
        this.a = type;
    }
    
    public List<PropertyPath> getPropertyPaths() {
        return this.b;
    }
}

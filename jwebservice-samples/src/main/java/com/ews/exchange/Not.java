package com.ews.exchange;

import java.util.*;

public class Not extends Restriction
{
    private String a;
    private String b;
    private Restriction c;
    
    public Not(final PropertyPath propertyPath, final long value) {
        this(propertyPath, Long.toString(value));
    }
    
    public Not(final PropertyPath propertyPath, final double value) {
        this(propertyPath, Double.toString(value));
    }
    
    public Not(final PropertyPath propertyPath, final boolean value) {
        this(propertyPath, Boolean.toString(value).toLowerCase());
    }
    
    public Not(final PropertyPath propertyPath, final Date value) {
        this(propertyPath, d.a(value));
    }
    
    public Not(final PropertyPath propertyPath, final String value) {
        if (propertyPath != null && value != null) {
            this.a = propertyPath.toString();
            this.b = "<t:Constant Value=\"" + d.a(value) + "\"/>";
        }
    }
    
    public Not(final PropertyPath propertyPath1, final PropertyPath propertyPath2) {
        if (propertyPath1 != null && propertyPath2 != null) {
            this.a = propertyPath1.toString();
            this.b = propertyPath2.toString();
        }
    }
    
    public Not(final Restriction restriction) {
        this.c = restriction;
    }
    
    public String toString() {
        String s = "";
        if (this.c != null) {
            s = s + "<t:Not>" + this.c.toString() + "</t:Not>";
        }
        else if (this.a != null && this.b != null) {
            s = s + "<t:Not>" + this.a + "<t:FieldURIOrConstant>" + this.b + "</t:FieldURIOrConstant>" + "</t:Not>";
        }
        return s;
    }
}

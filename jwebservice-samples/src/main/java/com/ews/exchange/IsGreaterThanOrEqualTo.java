package com.ews.exchange;

import java.util.*;

public class IsGreaterThanOrEqualTo extends Restriction
{
    private String a;
    private String b;
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath, final long value) {
        this(propertyPath, Long.toString(value));
    }
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath, final double value) {
        this(propertyPath, Double.toString(value));
    }
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath, final boolean value) {
        this(propertyPath, Boolean.toString(value).toLowerCase());
    }
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath, final Date value) {
        this(propertyPath, d.a(value));
    }
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath, final String value) {
        if (propertyPath != null && value != null) {
            this.a = propertyPath.toString();
            this.b = "<t:Constant Value=\"" + d.a(value) + "\"/>";
        }
    }
    
    public IsGreaterThanOrEqualTo(final PropertyPath propertyPath1, final PropertyPath propertyPath2) {
        if (propertyPath1 != null && propertyPath2 != null) {
            this.a = propertyPath1.toString();
            this.b = propertyPath2.toString();
        }
    }
    
    public String toString() {
        String string = "";
        if (this.a != null && this.b != null) {
            string = string + "<t:IsGreaterThanOrEqualTo>" + this.a + "<t:FieldURIOrConstant>" + this.b + "</t:FieldURIOrConstant>" + "</t:IsGreaterThanOrEqualTo>";
        }
        return string;
    }
}

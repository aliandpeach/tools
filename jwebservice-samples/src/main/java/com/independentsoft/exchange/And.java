package com.independentsoft.exchange;

import java.util.*;

public class And extends Restriction
{
    private String a;
    private String b;
    private List<Restriction> c;
    
    public And(final PropertyPath propertyPath, final long value) {
        this(propertyPath, Long.toString(value));
    }
    
    public And(final PropertyPath propertyPath, final double value) {
        this(propertyPath, Double.toString(value));
    }
    
    public And(final PropertyPath propertyPath, final boolean value) {
        this(propertyPath, Boolean.toString(value).toLowerCase());
    }
    
    public And(final PropertyPath propertyPath, final Date value) {
        this(propertyPath, d.a(value));
    }
    
    public And(final PropertyPath propertyPath, final String value) {
        this.c = new ArrayList<Restriction>();
        if (propertyPath != null && value != null) {
            this.a = propertyPath.toString();
            this.b = "<t:Constant Value=\"" + d.a(value) + "\"/>";
        }
    }
    
    public And(final PropertyPath propertyPath1, final PropertyPath propertyPath2) {
        this.c = new ArrayList<Restriction>();
        if (propertyPath1 != null && propertyPath2 != null) {
            this.a = propertyPath1.toString();
            this.b = propertyPath2.toString();
        }
    }
    
    public And(final Restriction restriction1, final Restriction restriction2) {
        this.c = new ArrayList<Restriction>();
        if (restriction1 != null) {
            this.c.add(restriction1);
        }
        if (restriction2 != null) {
            this.c.add(restriction2);
        }
    }
    
    public And(final Restriction restriction1, final Restriction restriction2, final Restriction restriction3) {
        this.c = new ArrayList<Restriction>();
        if (restriction1 != null) {
            this.c.add(restriction1);
        }
        if (restriction2 != null) {
            this.c.add(restriction2);
        }
        if (restriction3 != null) {
            this.c.add(restriction3);
        }
    }
    
    public And(final Restriction restriction1, final Restriction restriction2, final Restriction restriction3, final Restriction restriction4) {
        this.c = new ArrayList<Restriction>();
        if (restriction1 != null) {
            this.c.add(restriction1);
        }
        if (restriction2 != null) {
            this.c.add(restriction2);
        }
        if (restriction3 != null) {
            this.c.add(restriction3);
        }
        if (restriction4 != null) {
            this.c.add(restriction4);
        }
    }
    
    public And(final List<Restriction> restrictions) {
        this.c = new ArrayList<Restriction>();
        this.c = restrictions;
    }
    
    public String toString() {
        String s = "";
        if (this.c.size() > 0) {
            String s2 = s + "<t:And>";
            for (int i = 0; i < this.c.size(); ++i) {
                if (this.c.get(i) != null) {
                    s2 += this.c.get(i).toString();
                }
            }
            s = s2 + "</t:And>";
        }
        else if (this.a != null && this.b != null) {
            s = s + "<t:And>" + this.a + "<t:FieldURIOrConstant>" + this.b + "</t:FieldURIOrConstant>" + "</t:And>";
        }
        return s;
    }
}

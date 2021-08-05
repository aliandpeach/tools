package com.ews.exchange;

import java.util.*;

public class Contains extends Restriction
{
    private PropertyPath a;
    private String b;
    private ContainmentMode c;
    private ContainmentComparison d;
    
    public Contains() {
        this.c = ContainmentMode.NONE;
        this.d = ContainmentComparison.NONE;
    }
    
    public Contains(final PropertyPath propertyPath, final long value) {
        this(propertyPath, Long.toString(value));
    }
    
    public Contains(final PropertyPath propertyPath, final long value, final ContainmentMode mode) {
        this(propertyPath, Long.toString(value), mode);
    }
    
    public Contains(final PropertyPath propertyPath, final long value, final ContainmentComparison comparison) {
        this(propertyPath, Long.toString(value), comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final long value, final ContainmentMode mode, final ContainmentComparison comparison) {
        this(propertyPath, Long.toString(value), mode, comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final double value) {
        this(propertyPath, Double.toString(value));
    }
    
    public Contains(final PropertyPath propertyPath, final double value, final ContainmentMode mode) {
        this(propertyPath, Double.toString(value), mode);
    }
    
    public Contains(final PropertyPath propertyPath, final double value, final ContainmentComparison comparison) {
        this(propertyPath, Double.toString(value), comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final double value, final ContainmentMode mode, final ContainmentComparison comparison) {
        this(propertyPath, Double.toString(value), mode, comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final boolean value) {
        this(propertyPath, Boolean.toString(value).toLowerCase());
    }
    
    public Contains(final PropertyPath propertyPath, final boolean value, final ContainmentMode mode) {
        this(propertyPath, Boolean.toString(value).toLowerCase(), mode);
    }
    
    public Contains(final PropertyPath propertyPath, final boolean value, final ContainmentComparison comparison) {
        this(propertyPath, Boolean.toString(value).toLowerCase(), comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final boolean value, final ContainmentMode mode, final ContainmentComparison comparison) {
        this(propertyPath, Boolean.toString(value).toLowerCase(), mode, comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final Date value) {
        this(propertyPath, com.ews.exchange.d.a(value));
    }
    
    public Contains(final PropertyPath propertyPath, final Date value, final ContainmentMode mode) {
        this(propertyPath, com.ews.exchange.d.a(value), mode);
    }
    
    public Contains(final PropertyPath propertyPath, final Date value, final ContainmentComparison comparison) {
        this(propertyPath, com.ews.exchange.d.a(value), comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final Date value, final ContainmentMode mode, final ContainmentComparison comparison) {
        this(propertyPath, com.ews.exchange.d.a(value), mode, comparison);
    }
    
    public Contains(final PropertyPath propertyPath, final String value) {
        this.c = ContainmentMode.NONE;
        this.d = ContainmentComparison.NONE;
        this.a = propertyPath;
        this.b = value;
    }
    
    public Contains(final PropertyPath propertyPath, final String value, final ContainmentMode mode) {
        this.c = ContainmentMode.NONE;
        this.d = ContainmentComparison.NONE;
        this.a = propertyPath;
        this.b = value;
        this.c = mode;
    }
    
    public Contains(final PropertyPath propertyPath, final String value, final ContainmentComparison comparison) {
        this.c = ContainmentMode.NONE;
        this.d = ContainmentComparison.NONE;
        this.a = propertyPath;
        this.b = value;
        this.d = comparison;
    }
    
    public Contains(final PropertyPath propertyPath, final String value, final ContainmentMode mode, final ContainmentComparison comparison) {
        this.c = ContainmentMode.NONE;
        this.d = ContainmentComparison.NONE;
        this.a = propertyPath;
        this.b = value;
        this.c = mode;
        this.d = comparison;
    }
    
    public String toString() {
        String s = "";
        if (this.c != ContainmentMode.NONE) {
            final ContainmentMode c;
            s = s + " ContainmentMode=\"" + (((c = this.c) == ContainmentMode.EXACT_PHRASE) ? "ExactPhrase" : ((c == ContainmentMode.FULL_STRING) ? "FullString" : ((c == ContainmentMode.PREFIXED) ? "Prefixed" : ((c == ContainmentMode.PREFIX_ON_WORDS) ? "PrefixOnWords" : ((c == ContainmentMode.SUBSTRING) ? "Substring" : "None"))))) + "\"";
        }
        if (this.d != ContainmentComparison.NONE) {
            final ContainmentComparison d;
            s = s + " ContainmentComparison=\"" + (((d = this.d) == ContainmentComparison.EXACT) ? "Exact" : ((d == ContainmentComparison.IGNORE_CASE) ? "IgnoreCase" : ((d == ContainmentComparison.IGNORE_CASE_AND_NON_SPACING_CHARACTERS) ? "IgnoreCaseAndNonSpacingCharacters" : ((d == ContainmentComparison.IGNORE_NON_SPACING_CHARACTERS) ? "IgnoreNonSpacingCharacters" : ((d == ContainmentComparison.LOOSE) ? "Loose" : ((d == ContainmentComparison.LOOSE_AND_IGNORE_CASE) ? "LooseAndIgnoreCase" : ((d == ContainmentComparison.LOOSE_AND_IGNORE_CASE_AND_IGNORE_NON_SPACE) ? "LooseAndIgnoreCaseAndIgnoreNonSpace" : ((d == ContainmentComparison.LOOSE_AND_IGNORE_NON_SPACE) ? "LooseAndIgnoreNonSpace" : "None")))))))) + "\"";
        }
        String string = "";
        if (this.a != null && this.b != null) {
            string = string + "<t:Contains" + s + ">" + this.a.toString() + "<t:Constant Value=\"" + com.ews.exchange.d.a(this.b) + "\"/>" + "</t:Contains>";
        }
        return string;
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public String getValue() {
        return this.b;
    }
    
    public void setValue(final String value) {
        this.b = value;
    }
    
    public ContainmentMode getMode() {
        return this.c;
    }
    
    public void setMode(final ContainmentMode mode) {
        this.c = mode;
    }
    
    public ContainmentComparison getComparison() {
        return this.d;
    }
    
    public void setComparison(final ContainmentComparison comparison) {
        this.d = comparison;
    }
}

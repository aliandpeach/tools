package com.independentsoft.json.parser;

public class JsonNumber extends JsonValue
{
    private String a;
    
    public JsonNumber(final int value) {
        this.a = Integer.toString(value);
    }
    
    public JsonNumber(final long value) {
        this.a = Long.toString(value);
    }
    
    public JsonNumber(final float value) {
        this.a = Float.toString(value);
    }
    
    public JsonNumber(final double value) {
        this.a = Double.toString(value);
    }
    
    public JsonNumber(final String value) {
        this.a = value;
    }
    
    public int toInteger() {
        return Integer.parseInt(this.a, 10);
    }
    
    public long toLong() {
        return Long.parseLong(this.a, 10);
    }
    
    public float toFloat() {
        return Float.parseFloat(this.a);
    }
    
    public double toDouble() {
        return Double.parseDouble(this.a);
    }
    
    public String toString() {
        return this.a;
    }
    
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean equals(final Object object) {
        return this == object || (object != null && this.getClass() == object.getClass() && this.a.equals(((JsonNumber)object).a));
    }
}

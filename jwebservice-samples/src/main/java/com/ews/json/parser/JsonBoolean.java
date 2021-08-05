package com.ews.json.parser;

public class JsonBoolean extends JsonValue
{
    private boolean a;
    
    public JsonBoolean(final boolean value) {
        this.a = value;
    }
    
    public boolean getValue() {
        return this.a;
    }
    
    public String toString() {
        return Boolean.toString(this.a);
    }
    
    public int hashCode() {
        return super.hashCode();
    }
    
    public boolean equals(final Object object) {
        return this == object || (object != null && this.getClass() == object.getClass() && this.a == ((JsonBoolean)object).a);
    }
}

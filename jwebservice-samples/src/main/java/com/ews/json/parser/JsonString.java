package com.ews.json.parser;

public class JsonString extends JsonValue
{
    private final String a;
    
    public JsonString(final String value) {
        if (value == null) {
            throw new NullPointerException("value is null");
        }
        this.a = value;
    }
    
    public String getValue() {
        return this.a;
    }
    
    public String toString() {
        return "\"" + this.a + "\"";
    }
    
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean equals(final Object object) {
        return this == object || (object != null && this.getClass() == object.getClass() && this.a.equals(((JsonString)object).a));
    }
}

package com.independentsoft.json.parser;

public class JsonNull extends JsonValue
{
    public String toString() {
        return "null";
    }
    
    public int hashCode() {
        return super.hashCode();
    }
    
    public boolean equals(final Object object) {
        return this == object;
    }
}

package com.ews.json.parser;

import java.util.*;

public class JsonArray extends JsonValue
{
    private List<JsonValue> a;
    
    public JsonArray() {
        this.a = new ArrayList<JsonValue>();
    }
    
    public List<JsonValue> getValues() {
        return this.a;
    }
    
    public String toString() {
        String s = new String() + "[";
        for (int i = 0; i < this.a.size(); ++i) {
            s += this.a.get(i).toString();
            if (i < this.a.size() - 1) {
                s += ",";
            }
        }
        return s + "]";
    }
    
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean equals(final Object object) {
        return this == object || (object != null && this.getClass() == object.getClass() && this.a.equals(((JsonArray)object).a));
    }
}

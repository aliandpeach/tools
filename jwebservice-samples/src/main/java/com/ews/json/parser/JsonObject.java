package com.ews.json.parser;

import java.util.*;

public class JsonObject extends JsonValue
{
    private List<Member> a;
    
    public JsonObject() {
        this.a = new ArrayList<Member>();
    }
    
    public List<Member> getMembers() {
        return this.a;
    }
    
    public double getDoubleValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonNumber) {
            return ((JsonNumber)value).toDouble();
        }
        return Double.MIN_VALUE;
    }
    
    public float getFloatValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonNumber) {
            return ((JsonNumber)value).toFloat();
        }
        return Float.MIN_VALUE;
    }
    
    public long getLongValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonNumber) {
            return ((JsonNumber)value).toLong();
        }
        return Long.MIN_VALUE;
    }
    
    public int getIntValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonNumber) {
            return ((JsonNumber)value).toInteger();
        }
        return Integer.MIN_VALUE;
    }
    
    public String getStringValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonString) {
            return ((JsonString)value).getValue();
        }
        return null;
    }
    
    public boolean getBooleanValue(final String name) {
        final JsonValue value;
        return (value = this.getValue(name)) != null && value instanceof JsonBoolean && ((JsonBoolean)value).getValue();
    }
    
    public JsonObject getObjectValue(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonObject) {
            return (JsonObject)value;
        }
        return null;
    }
    
    public JsonValue getValue(final String name) {
        for (int i = 0; i < this.a.size(); ++i) {
            if (this.a.get(i).getName().equals(name)) {
                return this.a.get(i).getValue();
            }
        }
        return null;
    }

    public List<String> getStringArrayValues(final String name)
    {
        final List<JsonValue> arrayValues = this.getArrayValues(name);
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < arrayValues.size(); ++i)
        {
            if (arrayValues.get(i) != null && arrayValues.get(i) instanceof JsonString)
            {
                list.add(((JsonString) arrayValues.get(i)).getValue());
            }
        }
        return list;
    }
    
    public List<JsonValue> getArrayValues(final String name) {
        final JsonValue value;
        if ((value = this.getValue(name)) != null && value instanceof JsonArray) {
            return ((JsonArray)value).getValues();
        }
        return new ArrayList<JsonValue>();
    }
    
    public String toString() {
        String s = new String() + "{";
        for (int i = 0; i < this.a.size(); ++i) {
            s += this.a.get(i).toString();
            if (i < this.a.size() - 1) {
                s += ",";
            }
        }
        return s + "}";
    }
    
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean equals(final Object obj) {
        return this == obj || (obj != null && this.getClass() == obj.getClass() && this.a.equals(((JsonObject)obj).a));
    }
}

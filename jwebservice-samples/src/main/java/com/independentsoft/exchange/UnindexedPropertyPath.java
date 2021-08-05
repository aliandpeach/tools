package com.independentsoft.exchange;

public class UnindexedPropertyPath extends PropertyPath
{
    private String a;
    
    public UnindexedPropertyPath() {
    }
    
    public UnindexedPropertyPath(final String uri) {
        this.a = uri;
    }
    
    public String toString() {
        return "<t:FieldURI FieldURI=\"" + this.a + "\" />";
    }
    
    public String getUri() {
        return this.a;
    }
    
    public void setUri(final String uri) {
        this.a = uri;
    }
}

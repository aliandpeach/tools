package com.independentsoft.exchange;

public class PropertyOrder
{
    private PropertyPath a;
    private SortDirection b;
    
    public PropertyOrder() {
        this.b = SortDirection.ASCENDING;
    }
    
    public PropertyOrder(final PropertyPath propertyPath) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
    }
    
    public PropertyOrder(final PropertyPath propertyPath, final SortDirection order) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
        this.b = order;
    }
    
    public String toString() {
        String s = "<t:FieldOrder Order=\"" + com.independentsoft.exchange.a.a(this.b) + "\">";
        if (this.a != null) {
            s += this.a.toString();
        }
        return s + "</t:FieldOrder>";
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public SortDirection getOrder() {
        return this.b;
    }
    
    public void setOrder(final SortDirection order) {
        this.b = order;
    }
}

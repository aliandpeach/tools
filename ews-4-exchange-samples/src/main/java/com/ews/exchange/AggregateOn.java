package com.ews.exchange;

public class AggregateOn
{
    private PropertyPath a;
    private Aggregate b;
    
    public AggregateOn() {
        this.b = Aggregate.MAXIMUM;
    }
    
    public AggregateOn(final PropertyPath propertyPath) {
        this.b = Aggregate.MAXIMUM;
        this.a = propertyPath;
    }
    
    public AggregateOn(final PropertyPath propertyPath, final Aggregate aggregate) {
        this.b = Aggregate.MAXIMUM;
        this.a = propertyPath;
        this.b = aggregate;
    }
    
    public String toString() {
        String s = "<t:AggregateOn Aggregate=\"" + ((this.b == Aggregate.MAXIMUM) ? "Maximum" : "Minimum") + "\">";
        if (this.a != null) {
            s += this.a.toString();
        }
        return s + "</t:AggregateOn>";
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public Aggregate getAggregate() {
        return this.b;
    }
    
    public void setAggregate(final Aggregate aggregate) {
        this.b = aggregate;
    }
}

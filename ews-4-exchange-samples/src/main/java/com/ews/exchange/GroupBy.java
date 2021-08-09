package com.ews.exchange;

public class GroupBy implements IGroupBy
{
    private PropertyPath a;
    private SortDirection b;
    private AggregateOn c;
    
    public GroupBy() {
        this.b = SortDirection.ASCENDING;
    }
    
    public GroupBy(final PropertyPath propertyPath) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
    }
    
    public GroupBy(final PropertyPath propertyPath, final SortDirection order) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
        this.b = order;
    }
    
    public GroupBy(final PropertyPath propertyPath, final AggregateOn aggregateOn) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
        this.c = aggregateOn;
    }
    
    public GroupBy(final PropertyPath propertyPath, final SortDirection order, final AggregateOn aggregateOn) {
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
        this.b = order;
        this.c = aggregateOn;
    }
    
    public String toString() {
        String s = "<GroupBy Order=\"" + com.ews.exchange.a.a(this.b) + "\">";
        if (this.a != null) {
            s += this.a.toString();
        }
        if (this.c != null) {
            s += this.c.toString();
        }
        return s + "</GroupBy>";
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
    
    public AggregateOn getAggregateOn() {
        return this.c;
    }
    
    public void setAggregateOn(final AggregateOn aggregateOn) {
        this.c = aggregateOn;
    }
}

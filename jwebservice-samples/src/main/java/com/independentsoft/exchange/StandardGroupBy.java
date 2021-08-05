package com.independentsoft.exchange;

public class StandardGroupBy implements IGroupBy
{
    private StandardGroupByPropertyPath a;
    private SortDirection b;
    
    public StandardGroupBy() {
        this.a = StandardGroupByPropertyPath.CONVERSATION_TOPIC;
        this.b = SortDirection.ASCENDING;
    }
    
    public StandardGroupBy(final StandardGroupByPropertyPath propertyPath) {
        this.a = StandardGroupByPropertyPath.CONVERSATION_TOPIC;
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
    }
    
    public StandardGroupBy(final StandardGroupByPropertyPath propertyPath, final SortDirection order) {
        this.a = StandardGroupByPropertyPath.CONVERSATION_TOPIC;
        this.b = SortDirection.ASCENDING;
        this.a = propertyPath;
        this.b = order;
    }
    
    public String toString() {
        return "<t:DistinguishedGroupBy Order=\"" + com.independentsoft.exchange.a.a(this.b) + "\">" + "</t:StandardGroupBy>ConversationTopic" + "</t:StandardGroupBy>" + "</t:DistinguishedGroupBy>";
    }
    
    public StandardGroupByPropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final StandardGroupByPropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public SortDirection getOrder() {
        return this.b;
    }
    
    public void setOrder(final SortDirection order) {
        this.b = order;
    }
}

package com.independentsoft.exchange;

public class SeekToConditionPageItemView extends PageView
{
    private Restriction b;
    private IndexBasePoint c;
    
    public SeekToConditionPageItemView() {
        this.c = IndexBasePoint.BEGINNING;
    }
    
    public SeekToConditionPageItemView(final Restriction restriction) {
        this.c = IndexBasePoint.BEGINNING;
        this.b = restriction;
    }
    
    public SeekToConditionPageItemView(final Restriction restriction, final IndexBasePoint basePoint) {
        this.c = IndexBasePoint.BEGINNING;
        this.b = restriction;
        this.c = basePoint;
    }
    
    final String a(final String s) {
        String s2 = " BasePoint=\"" + com.independentsoft.exchange.a.a(this.c) + "\"";
        if (this.a > 0) {
            s2 = s2 + " MaxEntriesReturned=\"" + this.a + "\"";
        }
        String s3 = "<" + s + s2 + ">";
        if (this.b != null) {
            s3 = s3 + "<t:Condition>" + this.b.toString() + "</t:Condition>";
        }
        return s3 + "</" + s + ">";
    }
    
    public Restriction getRestriction() {
        return this.b;
    }
    
    public void setRestriction(final Restriction restriction) {
        this.b = restriction;
    }
    
    public IndexBasePoint getBasePoint() {
        return this.c;
    }
    
    public void setBasePoint(final IndexBasePoint basePoint) {
        this.c = basePoint;
    }
}

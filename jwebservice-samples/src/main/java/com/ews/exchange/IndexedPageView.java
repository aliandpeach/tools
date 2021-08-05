package com.ews.exchange;

public class IndexedPageView extends PageView
{
    private int b;
    private IndexBasePoint c;
    
    public IndexedPageView() {
        this.c = IndexBasePoint.BEGINNING;
    }
    
    public IndexedPageView(final int offset) {
        this.c = IndexBasePoint.BEGINNING;
        this.b = offset;
    }
    
    public IndexedPageView(final int offset, final IndexBasePoint basePoint) {
        this.c = IndexBasePoint.BEGINNING;
        this.b = offset;
        this.c = basePoint;
    }
    
    public IndexedPageView(final int offset, final IndexBasePoint basePoint, final int maxEntriesReturned) {
        this.c = IndexBasePoint.BEGINNING;
        this.b = offset;
        this.c = basePoint;
        this.a = maxEntriesReturned;
    }
    
    final String a(String s) {
        s = "<" + s;
        if (this.a > 0) {
            s = s + " MaxEntriesReturned=\"" + this.a + "\"";
        }
        if (this.b >= 0) {
            s = s + " Offset=\"" + this.b + "\"";
        }
        s = s + " BasePoint=\"" + com.ews.exchange.a.a(this.c) + "\"";
        return s += "/>";
    }
    
    public int getOffset() {
        return this.b;
    }
    
    public void setOffset(final int offset) {
        this.b = offset;
    }
    
    public IndexBasePoint getBasePoint() {
        return this.c;
    }
    
    public void setBasePoint(final IndexBasePoint basePoint) {
        this.c = basePoint;
    }
}

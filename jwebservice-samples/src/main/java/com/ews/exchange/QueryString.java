package com.ews.exchange;

public class QueryString
{
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    
    public QueryString() {
    }
    
    public QueryString(final String query) {
        this.a = query;
    }
    
    final String a() {
        String s = "";
        if (this.b) {
            s += " ResetCache=\"true\"";
        }
        if (this.c) {
            s += " ReturnHighlightTerms=\"true\"";
        }
        if (this.d) {
            s += " ReturnDeletedItems=\"true\"";
        }
        return "<QueryString" + s + ">" + com.ews.exchange.d.a(this.a) + "</QueryString>";
    }
    
    public String getQuery() {
        return this.a;
    }
    
    public void getQuery(final String query) {
        this.a = query;
    }
    
    public boolean isResetCache() {
        return this.b;
    }
    
    public void getResetCache(final boolean resetCache) {
        this.b = resetCache;
    }
    
    public boolean isReturnHighlightTerms() {
        return this.c;
    }
    
    public void getReturnHighlightTerms(final boolean returnHighlightTerms) {
        this.c = returnHighlightTerms;
    }
    
    public boolean isReturnDeletedItems() {
        return this.d;
    }
    
    public void getReturnDeletedItems(final boolean returnDeletedItems) {
        this.d = returnDeletedItems;
    }
}

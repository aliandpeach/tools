package com.ews.exchange;

public abstract class View
{
    int a;
    
    abstract String a(final String p0);
    
    public int getMaxEntriesReturned() {
        return this.a;
    }
    
    public void setMaxEntriesReturned(final int maxEntriesReturned) {
        this.a = maxEntriesReturned;
    }
}

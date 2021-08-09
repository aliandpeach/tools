package com.ews.exchange;

public abstract class Id
{
    protected String id;
    protected String changeKey;
    
    public void setChangeKey(final String changeKey) {
        this.changeKey = changeKey;
    }
    
    public String getChangeKey() {
        return this.changeKey;
    }
}

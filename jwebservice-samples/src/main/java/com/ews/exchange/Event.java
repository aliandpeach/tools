package com.ews.exchange;

public abstract class Event
{
    String a;
    
    public String getWatermark() {
        return this.a;
    }
}

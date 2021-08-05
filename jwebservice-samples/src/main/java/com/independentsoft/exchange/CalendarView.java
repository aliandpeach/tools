package com.independentsoft.exchange;

import java.util.*;

public class CalendarView extends View
{
    private Date b;
    private Date c;
    
    public CalendarView() {
    }
    
    public CalendarView(final Date startTime, final Date endTime) {
        this.b = startTime;
        this.c = endTime;
    }
    
    public CalendarView(final Date startTime, final Date endTime, final int maxEntriesReturned) {
        this.b = startTime;
        this.c = endTime;
        this.a = maxEntriesReturned;
    }
    
    final String a(String s) {
        s = "<" + s;
        if (this.a > 0) {
            s = s + " MaxEntriesReturned=\"" + this.a + "\"";
        }
        if (this.b != null) {
            s = s + " StartDate=\"" + d.a(this.b) + "\"";
        }
        if (this.c != null) {
            s = s + " EndDate=\"" + d.a(this.c) + "\"";
        }
        return s += "/>";
    }
    
    public Date getStartTime() {
        return this.b;
    }
    
    public void setStartTime(final Date startTime) {
        this.b = startTime;
    }
    
    public Date getEndTime() {
        return this.c;
    }
    
    public void setEndTime(final Date endTime) {
        this.c = endTime;
    }
}

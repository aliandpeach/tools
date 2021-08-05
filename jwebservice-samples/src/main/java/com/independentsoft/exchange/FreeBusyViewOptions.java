package com.independentsoft.exchange;

import java.util.*;

public class FreeBusyViewOptions
{
    private TimeDuration a;
    private int b;
    private FreeBusyViewType c;
    
    public FreeBusyViewOptions() {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
    }
    
    public FreeBusyViewOptions(final TimeDuration timeWindow) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = timeWindow;
    }
    
    public FreeBusyViewOptions(final TimeDuration timeWindow, final int mergedFreeBusyInterval) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = timeWindow;
        this.b = mergedFreeBusyInterval;
    }
    
    public FreeBusyViewOptions(final TimeDuration timeWindow, final FreeBusyViewType requestedView) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = timeWindow;
        this.c = requestedView;
    }
    
    public FreeBusyViewOptions(final TimeDuration timeWindow, final int mergedFreeBusyInterval, final FreeBusyViewType requestedView) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = timeWindow;
        this.b = mergedFreeBusyInterval;
        this.c = requestedView;
    }
    
    public FreeBusyViewOptions(final Date startTime, final Date endTime) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = new TimeDuration(startTime, endTime);
    }
    
    public FreeBusyViewOptions(final Date startTime, final Date endTime, final int mergedFreeBusyInterval) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = new TimeDuration(startTime, endTime);
        this.b = mergedFreeBusyInterval;
    }
    
    public FreeBusyViewOptions(final Date startTime, final Date endTime, final FreeBusyViewType requestedView) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = new TimeDuration(startTime, endTime);
        this.c = requestedView;
    }
    
    public FreeBusyViewOptions(final Date startTime, final Date endTime, final int mergedFreeBusyInterval, final FreeBusyViewType requestedView) {
        this.b = -1;
        this.c = FreeBusyViewType.NONE;
        this.a = new TimeDuration(startTime, endTime);
        this.b = mergedFreeBusyInterval;
        this.c = requestedView;
    }
    
    final String a() {
        String s = "<t:FreeBusyViewOptions>";
        if (this.a != null) {
            s += this.a.a("TimeWindow", false);
        }
        if (this.b >= 0) {
            s = s + "<t:MergedFreeBusyIntervalInMinutes>" + this.b + "</t:MergedFreeBusyIntervalInMinutes>";
        }
        if (this.c != FreeBusyViewType.NONE) {
            final FreeBusyViewType c;
            s = s + "<t:RequestedView>" + (((c = this.c) == FreeBusyViewType.DETAILED) ? "Detailed" : ((c == FreeBusyViewType.DETAILED_MERGED) ? "DetailedMerged" : ((c == FreeBusyViewType.FREE_BUSY) ? "FreeBusy" : ((c == FreeBusyViewType.FREE_BUSY_MERGED) ? "FreeBusyMerged" : ((c == FreeBusyViewType.MERGED_ONLY) ? "MergedOnly" : "None"))))) + "</t:RequestedView>";
        }
        return s + "</t:FreeBusyViewOptions>";
    }
    
    public TimeDuration getTimeWindow() {
        return this.a;
    }
    
    public void setTimeWindow(final TimeDuration timeWindow) {
        this.a = timeWindow;
    }
    
    public int getMergedFreeBusyInterval() {
        return this.b;
    }
    
    public void setMergedFreeBusyInterval(final int mergedFreeBusyInterval) {
        this.b = mergedFreeBusyInterval;
    }
    
    public FreeBusyViewType getRequestedView() {
        return this.c;
    }
    
    public void setRequestedView(final FreeBusyViewType requestedView) {
        this.c = requestedView;
    }
}

package com.ews.exchange;

import java.util.*;

public class SuggestionsViewOptions
{
    private TimeDuration a;
    private int b;
    private int c;
    private int d;
    private int e;
    private SuggestionQuality f;
    private Date g;
    private String h;
    
    public SuggestionsViewOptions() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = SuggestionQuality.NONE;
    }
    
    public SuggestionsViewOptions(final TimeDuration detailedSuggestionsWindow) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = SuggestionQuality.NONE;
        this.a = detailedSuggestionsWindow;
    }
    
    public SuggestionsViewOptions(final TimeDuration detailedSuggestionsWindow, final int meetingDuration) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = SuggestionQuality.NONE;
        this.a = detailedSuggestionsWindow;
        this.e = meetingDuration;
    }
    
    public SuggestionsViewOptions(final Date startTime, final Date endTime) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = SuggestionQuality.NONE;
        this.a = new TimeDuration(startTime, endTime);
    }
    
    public SuggestionsViewOptions(final Date startTime, final Date endTime, final int meetingDuration) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = SuggestionQuality.NONE;
        this.a = new TimeDuration(startTime, endTime);
        this.e = meetingDuration;
    }
    
    final String a() {
        String s = "<t:SuggestionsViewOptions>";
        if (this.b > 0 && this.b < 50) {
            s = s + "<t:GoodThreshold>" + this.b + "</t:GoodThreshold>";
        }
        if (this.c > 0 && this.c < 49) {
            s = s + "<t:MaximumResultsByDay>" + this.c + "</t:MaximumResultsByDay>";
        }
        if (this.d >= 0 && this.c < 49) {
            s = s + "<t:MaximumNonWorkHourResultsByDay>" + this.d + "</t:MaximumNonWorkHourResultsByDay>";
        }
        if (this.e > 0 && this.e < 1441) {
            s = s + "<t:MeetingDurationInMinutes>" + this.e + "</t:MeetingDurationInMinutes>";
        }
        if (this.f != SuggestionQuality.NONE) {
            final SuggestionQuality f;
            s = s + "<t:MinimumSuggestionQuality>" + (((f = this.f) == SuggestionQuality.EXCELLENT) ? "Excellent" : ((f == SuggestionQuality.FAIR) ? "Fair" : ((f == SuggestionQuality.GOOD) ? "Good" : ((f == SuggestionQuality.POOR) ? "Poor" : "None")))) + "</t:MinimumSuggestionQuality>";
        }
        if (this.a != null) {
            s += this.a.a("DetailedSuggestionsWindow", false);
        }
        if (this.g != null) {
            s = s + "<t:CurrentMeetingTime>" + com.ews.exchange.d.a(this.g) + "</t:CurrentMeetingTime>";
        }
        if (this.h != null) {
            s = s + "<t:GlobalObjectId>" + com.ews.exchange.d.a(this.h) + "</t:GlobalObjectId>";
        }
        return s + "</t:SuggestionsViewOptions>";
    }
    
    public TimeDuration getDetailedSuggestionsWindow() {
        return this.a;
    }
    
    public void setDetailedSuggestionsWindow(final TimeDuration detailedSuggestionsWindow) {
        this.a = detailedSuggestionsWindow;
    }
    
    public int getGoodThreshold() {
        return this.b;
    }
    
    public void setGoodThreshold(final int goodThreshold) {
        this.b = goodThreshold;
    }
    
    public int getMaximumResultsByDay() {
        return this.c;
    }
    
    public void setMaximumResultsByDay(final int maximumResultsByDay) {
        this.c = maximumResultsByDay;
    }
    
    public int getMaximumNonWorkHourResultsByDay() {
        return this.d;
    }
    
    public void setMaximumNonWorkHourResultsByDay(final int maximumNonWorkHourResultsByDay) {
        this.d = maximumNonWorkHourResultsByDay;
    }
    
    public int getMeetingDuration() {
        return this.e;
    }
    
    public void setMeetingDuration(final int meetingDuration) {
        this.e = meetingDuration;
    }
    
    public SuggestionQuality getMinimumSuggestionQuality() {
        return this.f;
    }
    
    public void setMinimumSuggestionQuality(final SuggestionQuality minimumSuggestionQuality) {
        this.f = minimumSuggestionQuality;
    }
    
    public Date getCurrentMeetingTime() {
        return this.g;
    }
    
    public void setCurrentMeetingTime(final Date currentMeetingTime) {
        this.g = currentMeetingTime;
    }
    
    public String getGlobalObjectId() {
        return this.h;
    }
    
    public void setGlobalObjectId(final String globalObjectId) {
        this.h = globalObjectId;
    }
}

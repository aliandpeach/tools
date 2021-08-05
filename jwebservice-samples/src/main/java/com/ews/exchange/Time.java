package com.ews.exchange;

public class Time
{
    private int a;
    private int b;
    private int c;
    
    public Time() {
    }
    
    public Time(final int hour) {
        this.setHour(hour);
    }
    
    public Time(final int hour, final int minute) {
        this.setHour(hour);
        this.setMinute(minute);
    }
    
    public Time(final int hour, final int minute, final int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    
    Time(final String time) {
        if (time != null && time.length() == 8) {
            this.a = Integer.parseInt(time.substring(0, 2));
            this.b = Integer.parseInt(time.substring(3, 5));
            this.c = Integer.parseInt(time.substring(6, 8));
        }
    }
    
    public String toString() {
        return "<t:Time>" + String.format("%02d", this.a) + ":" + String.format("%02d", this.b) + ":" + String.format("%02d", this.c) + "</t:Time>";
    }
    
    public int getHour() {
        return this.a;
    }
    
    public void setHour(final int hour) {
        if (hour >= 0 && hour < 24) {
            this.a = hour;
        }
    }
    
    public int getMinute() {
        return this.b;
    }
    
    public void setMinute(final int minute) {
        if (minute >= 0 && minute < 60) {
            this.b = minute;
        }
    }
    
    public int getSecond() {
        return this.c;
    }
    
    public void setSecond(final int second) {
        if (second >= 0 && second < 60) {
            this.c = second;
        }
    }
}

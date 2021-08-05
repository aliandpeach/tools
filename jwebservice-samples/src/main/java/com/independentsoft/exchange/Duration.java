package com.independentsoft.exchange;

public class Duration
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    
    public Duration() {
    }
    
    public Duration(final int years) {
        this.a = years;
    }
    
    public Duration(final int years, final int months) {
        this.a = years;
        this.b = months;
    }
    
    public Duration(final int years, final int months, final int days) {
        this.a = years;
        this.b = months;
        this.c = days;
    }
    
    public Duration(final int years, final int months, final int days, final int hours) {
        this.a = years;
        this.b = months;
        this.c = days;
        this.d = hours;
    }
    
    public Duration(final int years, final int months, final int days, final int hours, final int minutes) {
        this.a = years;
        this.b = months;
        this.c = days;
        this.d = hours;
        this.e = minutes;
    }
    
    public Duration(final int years, final int months, final int days, final int hours, final int minutes, final int seconds) {
        this.a = years;
        this.b = months;
        this.c = days;
        this.d = hours;
        this.e = minutes;
        this.f = seconds;
    }
    
    public Duration(final int years, final int months, final int days, final int hours, final int minutes, final int seconds, final int milliseconds) {
        this.a = years;
        this.b = months;
        this.c = days;
        this.d = hours;
        this.e = minutes;
        this.f = seconds;
        this.g = milliseconds;
    }
    
    public static Duration parse(String duration) {
        final Duration duration2 = new Duration();
        if (duration != null) {
            if ((duration = duration.trim()).startsWith("-")) {
                duration2.setNegative(true);
            }
            final int index;
            if ((index = duration.indexOf("P")) == -1) {
                return duration2;
            }
            final int index2;
            if ((index2 = duration.indexOf("T")) == -1) {
                String s;
                final int index3;
                if ((index3 = (s = duration.substring(index + 1)).indexOf("Y")) > 0) {
                    final String substring;
                    if ((substring = s.substring(0, index3)).length() > 0) {
                        duration2.setYears(Integer.parseInt(substring));
                    }
                    s = s.substring(index3 + 1);
                }
                final int index4;
                if ((index4 = s.indexOf("M")) > 0) {
                    final String substring2;
                    if ((substring2 = s.substring(0, index4)).length() > 0) {
                        duration2.setMonths(Integer.parseInt(substring2));
                    }
                    s = s.substring(index4 + 1);
                }
                final int index5;
                final String substring3;
                if ((index5 = s.indexOf("D")) > 0 && (substring3 = s.substring(0, index5)).length() > 0) {
                    duration2.setDays(Integer.parseInt(substring3));
                }
            }
            else {
                String s2;
                final int index6;
                if ((index6 = (s2 = duration.substring(index + 1, index2)).indexOf("Y")) > 0) {
                    final String substring4;
                    if ((substring4 = s2.substring(0, index6)).length() > 0) {
                        duration2.setYears(Integer.parseInt(substring4));
                    }
                    s2 = s2.substring(index6 + 1);
                }
                final int index7;
                if ((index7 = s2.indexOf("M")) > 0) {
                    final String substring5;
                    if ((substring5 = s2.substring(0, index7)).length() > 0) {
                        duration2.setMonths(Integer.parseInt(substring5));
                    }
                    s2 = s2.substring(index7 + 1);
                }
                final int index8;
                final String substring6;
                if ((index8 = s2.indexOf("D")) > 0 && (substring6 = s2.substring(0, index8)).length() > 0) {
                    duration2.setDays(Integer.parseInt(substring6));
                }
                final int index9;
                if ((index9 = (duration = duration.substring(index2 + 1)).indexOf("H")) > 0) {
                    final String substring7;
                    if ((substring7 = duration.substring(0, index9)).length() > 0) {
                        duration2.setHours(Integer.parseInt(substring7));
                    }
                    duration = duration.substring(index9 + 1);
                }
                final int index10;
                if ((index10 = duration.indexOf("M")) > 0) {
                    final String substring8;
                    if ((substring8 = duration.substring(0, index10)).length() > 0) {
                        duration2.setMinutes(Integer.parseInt(substring8));
                    }
                    duration = duration.substring(index10 + 1);
                }
                final int index11;
                if ((index11 = duration.indexOf("S")) > 0 && (duration = duration.substring(0, index11)).length() > 0) {
                    final int index12;
                    if ((index12 = duration.indexOf(".")) > 0) {
                        final String substring9 = duration.substring(0, index12);
                        duration = duration.substring(index12 + 1);
                        duration2.setSeconds(Integer.parseInt(substring9));
                        duration2.setMilliseconds(Integer.parseInt(duration));
                    }
                    else {
                        duration2.setSeconds(Integer.parseInt(duration));
                    }
                }
            }
        }
        return duration2;
    }
    
    public String toString() {
        String s = (this.h ? "-" : "") + "P";
        if (this.a > 0) {
            s = s + this.a + "Y";
        }
        if (this.b > 0) {
            s = s + this.b + "M";
        }
        if (this.c > 0) {
            s = s + this.c + "D";
        }
        if (this.d > 0 || this.e > 0 || this.f > 0 || this.g > 0) {
            s += "T";
            if (this.d > 0) {
                s = s + this.d + "H";
            }
            if (this.e > 0) {
                s = s + this.e + "M";
            }
            if (this.f > 0) {
                if (this.g > 0) {
                    s = s + this.f + "." + this.g + "S";
                }
                else {
                    s = s + this.f + "S";
                }
            }
            else if (this.g > 0) {
                s = s + "0." + this.g + "S";
            }
        }
        if (s.equals("P") || s.equals("-P")) {
            s = "P0D";
        }
        return s;
    }
    
    public int getYears() {
        return this.a;
    }
    
    public void setYears(final int years) {
        this.a = years;
    }
    
    public int getMonths() {
        return this.b;
    }
    
    public void setMonths(final int months) {
        this.b = months;
    }
    
    public int getDays() {
        return this.c;
    }
    
    public void setDays(final int days) {
        this.c = days;
    }
    
    public int getHours() {
        return this.d;
    }
    
    public void setHours(final int hours) {
        this.d = hours;
    }
    
    public int getMinutes() {
        return this.e;
    }
    
    public void setMinutes(final int minutes) {
        this.e = minutes;
    }
    
    public int getSeconds() {
        return this.f;
    }
    
    public void setSeconds(final int seconds) {
        this.f = seconds;
    }
    
    public int getMilliseconds() {
        return this.g;
    }
    
    public void setMilliseconds(final int milliseconds) {
        this.g = milliseconds;
    }
    
    public boolean isNegative() {
        return this.h;
    }
    
    public void setNegative(final boolean isNegative) {
        this.h = isNegative;
    }
}

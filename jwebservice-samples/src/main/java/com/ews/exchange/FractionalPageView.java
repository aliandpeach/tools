package com.ews.exchange;

public class FractionalPageView extends PageView
{
    private int b;
    private int c;
    
    public FractionalPageView() {
    }
    
    public FractionalPageView(final int numerator, final int denominator) {
        this.b = numerator;
        this.c = denominator;
    }
    
    public FractionalPageView(final int numerator, final int denominator, final int maxEntriesReturned) {
        this.b = numerator;
        this.c = denominator;
        this.a = maxEntriesReturned;
    }
    
    final String a(String s) {
        s = "<" + s;
        if (this.a > 0) {
            s = s + " MaxEntriesReturned=\"" + this.a + "\"";
        }
        if (this.b >= 0) {
            s = s + " Numerator=\"" + this.b + "\"";
        }
        if (this.c >= 0) {
            s = s + " Denominator=\"" + this.c + "\"";
        }
        return s += "/>";
    }
    
    public int getNumerator() {
        return this.b;
    }
    
    public void setNumerator(final int numerator) {
        this.b = numerator;
    }
    
    public int getDenominator() {
        return this.c;
    }
    
    public void setDenominator(final int denominator) {
        this.c = denominator;
    }
}

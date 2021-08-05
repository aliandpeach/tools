package com.independentsoft.exchange;

public class ContactsView extends View
{
    private String b;
    private String c;
    
    public ContactsView() {
    }
    
    public ContactsView(final String initialName, final String finalName) {
        this.b = initialName;
        this.c = finalName;
    }
    
    public ContactsView(final String initialName, final String finalName, final int maxEntriesReturned) {
        this.b = initialName;
        this.c = finalName;
        this.a = maxEntriesReturned;
    }
    
    final String a(String s) {
        s = "<" + s;
        if (this.a > 0) {
            s = s + " MaxEntriesReturned=\"" + this.a + "\"";
        }
        if (this.b != null) {
            s = s + " InitialName=\"" + d.a(this.b) + "\"";
        }
        if (this.c != null) {
            s = s + " FinalName=\"" + d.a(this.c) + "\"";
        }
        return s += "/>";
    }
    
    public String getInitialName() {
        return this.b;
    }
    
    public void setInitialName(final String initialName) {
        this.b = initialName;
    }
    
    public String getFinalName() {
        return this.c;
    }
    
    public void setFinalName(final String finalName) {
        this.c = finalName;
    }
}

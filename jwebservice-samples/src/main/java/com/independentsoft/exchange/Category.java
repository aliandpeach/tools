package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Category
{
    private String a;
    private CategoryColor b;
    private KeyboardShortcut c;
    private int d;
    private Date e;
    private Date f;
    private Date g;
    private Date h;
    private Date i;
    private Date j;
    private Date k;
    private int l;
    private String m;
    private boolean n;
    
    public Category() {
        this.b = CategoryColor.NONE;
        this.c = KeyboardShortcut.NONE;
        this.d = 0;
    }
    
    public Category(final String name) {
        this.b = CategoryColor.NONE;
        this.c = KeyboardShortcut.NONE;
        this.d = 0;
        this.a = name;
    }
    
    public Category(final String name, final CategoryColor color) {
        this.b = CategoryColor.NONE;
        this.c = KeyboardShortcut.NONE;
        this.d = 0;
        this.a = name;
        this.b = color;
    }
    
    public Category(final String name, final CategoryColor color, final KeyboardShortcut keyboardShortcut) {
        this.b = CategoryColor.NONE;
        this.c = KeyboardShortcut.NONE;
        this.d = 0;
        this.a = name;
        this.b = color;
        this.c = keyboardShortcut;
    }
    
    Category(final XMLStreamReader reader) throws ParseException {
        this.b = CategoryColor.NONE;
        this.c = KeyboardShortcut.NONE;
        this.d = 0;
        this.a = reader.getAttributeValue(null, "name");
        this.m = reader.getAttributeValue(null, "guid");
        final String attributeValue = reader.getAttributeValue(null, "color");
        final String attributeValue2 = reader.getAttributeValue(null, "keyboardShortcut");
        final String attributeValue3 = reader.getAttributeValue(null, "usageCount");
        final String attributeValue4 = reader.getAttributeValue(null, "lastTimeUsedNotes");
        final String attributeValue5 = reader.getAttributeValue(null, "lastTimeUsedJournal");
        final String attributeValue6 = reader.getAttributeValue(null, "lastTimeUsedContacts");
        final String attributeValue7 = reader.getAttributeValue(null, "lastTimeUsedTasks");
        final String attributeValue8 = reader.getAttributeValue(null, "lastTimeUsedCalendar");
        final String attributeValue9 = reader.getAttributeValue(null, "lastTimeUsedMail");
        final String attributeValue10 = reader.getAttributeValue(null, "lastTimeUsed");
        final String attributeValue11 = reader.getAttributeValue(null, "lastSessionUsed");
        final String attributeValue12 = reader.getAttributeValue(null, "renameOnFirstUse");
        if (attributeValue != null && attributeValue.length() > 0) {
            final String s;
            this.b = ((s = attributeValue).equals("0") ? CategoryColor.RED : (s.equals("1") ? CategoryColor.ORANGE : (s.equals("2") ? CategoryColor.PEACH : (s.equals("3") ? CategoryColor.YELLOW : (s.equals("4") ? CategoryColor.GREEN : (s.equals("5") ? CategoryColor.TEAL : (s.equals("6") ? CategoryColor.OLIVE : (s.equals("7") ? CategoryColor.BLUE : (s.equals("8") ? CategoryColor.PURPLE : (s.equals("9") ? CategoryColor.MAROON : (s.equals("10") ? CategoryColor.STEEL : (s.equals("11") ? CategoryColor.DARK_STEEL : (s.equals("12") ? CategoryColor.GRAY : (s.equals("13") ? CategoryColor.DARK_GRAY : (s.equals("14") ? CategoryColor.BLACK : (s.equals("15") ? CategoryColor.DARK_RED : (s.equals("16") ? CategoryColor.DARK_ORANGE : (s.equals("17") ? CategoryColor.DARK_PEACH : (s.equals("18") ? CategoryColor.DARK_YELLOW : (s.equals("19") ? CategoryColor.DARK_GREEN : (s.equals("20") ? CategoryColor.DARK_TEAL : (s.equals("21") ? CategoryColor.DARK_OLIVE : (s.equals("22") ? CategoryColor.DARK_BLUE : (s.equals("23") ? CategoryColor.DARK_PURPLE : (s.equals("24") ? CategoryColor.DARK_MAROON : CategoryColor.NONE)))))))))))))))))))))))));
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            final String s2;
            this.c = ((s2 = attributeValue2).equals("1") ? KeyboardShortcut.CTRL_F2 : (s2.equals("2") ? KeyboardShortcut.CTRL_F3 : (s2.equals("3") ? KeyboardShortcut.CTRL_F4 : (s2.equals("4") ? KeyboardShortcut.CTRL_F5 : (s2.equals("5") ? KeyboardShortcut.CTRL_F6 : (s2.equals("6") ? KeyboardShortcut.CTRL_F7 : (s2.equals("7") ? KeyboardShortcut.CTRL_F8 : (s2.equals("8") ? KeyboardShortcut.CTRL_F9 : (s2.equals("9") ? KeyboardShortcut.CTRL_F10 : (s2.equals("10") ? KeyboardShortcut.CTRL_F11 : (s2.equals("11") ? KeyboardShortcut.CTRL_F12 : KeyboardShortcut.NONE)))))))))));
        }
        if (attributeValue3 != null && attributeValue3.length() > 0) {
            this.d = Integer.parseInt(attributeValue3);
        }
        if (attributeValue4 != null && attributeValue4.length() > 0) {
            this.e = com.independentsoft.exchange.d.c(attributeValue4);
        }
        if (attributeValue5 != null && attributeValue5.length() > 0) {
            this.f = com.independentsoft.exchange.d.c(attributeValue5);
        }
        if (attributeValue6 != null && attributeValue6.length() > 0) {
            this.g = com.independentsoft.exchange.d.c(attributeValue6);
        }
        if (attributeValue7 != null && attributeValue7.length() > 0) {
            this.h = com.independentsoft.exchange.d.c(attributeValue7);
        }
        if (attributeValue8 != null && attributeValue8.length() > 0) {
            this.i = com.independentsoft.exchange.d.c(attributeValue8);
        }
        if (attributeValue9 != null && attributeValue9.length() > 0) {
            this.j = com.independentsoft.exchange.d.c(attributeValue9);
        }
        if (attributeValue10 != null && attributeValue10.length() > 0) {
            this.k = com.independentsoft.exchange.d.c(attributeValue10);
        }
        if (attributeValue11 != null && attributeValue11.length() > 0) {
            this.l = Integer.parseInt(attributeValue11);
        }
        if (attributeValue12 != null && attributeValue12.length() > 0 && attributeValue12.equals("1")) {
            this.n = true;
        }
    }
    
    final String a() {
        String string = "<category ";
        if (this.a != null) {
            string = string + " name=\"" + com.independentsoft.exchange.d.a(this.a) + "\"";
        }
        final CategoryColor b;
        final KeyboardShortcut c;
        String s = string + " color=\"" + (((b = this.b) == CategoryColor.RED) ? "0" : ((b == CategoryColor.ORANGE) ? "1" : ((b == CategoryColor.PEACH) ? "2" : ((b == CategoryColor.YELLOW) ? "3" : ((b == CategoryColor.GREEN) ? "4" : ((b == CategoryColor.TEAL) ? "5" : ((b == CategoryColor.OLIVE) ? "6" : ((b == CategoryColor.BLUE) ? "7" : ((b == CategoryColor.PURPLE) ? "8" : ((b == CategoryColor.MAROON) ? "9" : ((b == CategoryColor.STEEL) ? "10" : ((b == CategoryColor.DARK_STEEL) ? "11" : ((b == CategoryColor.GRAY) ? "12" : ((b == CategoryColor.DARK_GRAY) ? "13" : ((b == CategoryColor.BLACK) ? "14" : ((b == CategoryColor.DARK_RED) ? "15" : ((b == CategoryColor.DARK_ORANGE) ? "16" : ((b == CategoryColor.DARK_PEACH) ? "17" : ((b == CategoryColor.DARK_YELLOW) ? "18" : ((b == CategoryColor.DARK_GREEN) ? "19" : ((b == CategoryColor.DARK_TEAL) ? "20" : ((b == CategoryColor.DARK_OLIVE) ? "21" : ((b == CategoryColor.DARK_BLUE) ? "22" : ((b == CategoryColor.DARK_PURPLE) ? "23" : ((b == CategoryColor.DARK_MAROON) ? "24" : "-1"))))))))))))))))))))))))) + "\"" + " keyboardShortcut=\"" + (((c = this.c) == KeyboardShortcut.CTRL_F2) ? "1" : ((c == KeyboardShortcut.CTRL_F3) ? "2" : ((c == KeyboardShortcut.CTRL_F4) ? "3" : ((c == KeyboardShortcut.CTRL_F5) ? "4" : ((c == KeyboardShortcut.CTRL_F6) ? "5" : ((c == KeyboardShortcut.CTRL_F7) ? "6" : ((c == KeyboardShortcut.CTRL_F8) ? "7" : ((c == KeyboardShortcut.CTRL_F9) ? "8" : ((c == KeyboardShortcut.CTRL_F10) ? "9" : ((c == KeyboardShortcut.CTRL_F11) ? "10" : ((c == KeyboardShortcut.CTRL_F12) ? "11" : "0"))))))))))) + "\"" + " usageCount=\"" + this.d + "\"";
        if (this.e != null) {
            s = s + " lastTimeUsedNotes=\"" + com.independentsoft.exchange.d.a(this.e) + "\"";
        }
        if (this.f != null) {
            s = s + " lastTimeUsedJournal=\"" + com.independentsoft.exchange.d.a(this.f) + "\"";
        }
        if (this.g != null) {
            s = s + " lastTimeUsedContacts=\"" + com.independentsoft.exchange.d.a(this.g) + "\"";
        }
        if (this.h != null) {
            s = s + " lastTimeUsedTasks=\"" + com.independentsoft.exchange.d.a(this.h) + "\"";
        }
        if (this.i != null) {
            s = s + " lastTimeUsedCalendar=\"" + com.independentsoft.exchange.d.a(this.i) + "\"";
        }
        if (this.j != null) {
            s = s + " lastTimeUsedMail=\"" + com.independentsoft.exchange.d.a(this.j) + "\"";
        }
        if (this.k != null) {
            s = s + " lastTimeUsed=\"" + com.independentsoft.exchange.d.a(this.k) + "\"";
        }
        String s2 = s + " lastSessionUsed=\"" + this.l + "\"";
        if (this.m != null) {
            s2 = s2 + " guid=\"" + com.independentsoft.exchange.d.a(this.m) + "\"";
        }
        if (this.n) {
            s2 += " renameOnFirstUse=\"1\"";
        }
        return s2 + " />";
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public CategoryColor getColor() {
        return this.b;
    }
    
    public void setColor(final CategoryColor color) {
        this.b = color;
    }
    
    public KeyboardShortcut getKeyboardShortcut() {
        return this.c;
    }
    
    public void setKeyboardShortcut(final KeyboardShortcut keyboardShortcut) {
        this.c = keyboardShortcut;
    }
    
    public int getUsageCount() {
        return this.d;
    }
    
    public void setUsageCount(final int usageCount) {
        this.d = usageCount;
    }
    
    public Date getLastTimeUsedNotes() {
        return this.e;
    }
    
    public void setLastTimeUsedNotes(final Date lastTimeUsedNotes) {
        this.e = lastTimeUsedNotes;
    }
    
    public Date getLastTimeUsedJournal() {
        return this.f;
    }
    
    public void setLastTimeUsedJournal(final Date lastTimeUsedJournal) {
        this.f = lastTimeUsedJournal;
    }
    
    public Date getLastTimeUsedContacts() {
        return this.g;
    }
    
    public void setLastTimeUsedContacts(final Date lastTimeUsedContacts) {
        this.g = lastTimeUsedContacts;
    }
    
    public Date getLastTimeUsedTasks() {
        return this.h;
    }
    
    public void setLastTimeUsedTasks(final Date lastTimeUsedTasks) {
        this.h = lastTimeUsedTasks;
    }
    
    public Date getLastTimeUsedCalendar() {
        return this.i;
    }
    
    public void setLastTimeUsedCalendar(final Date lastTimeUsedCalendar) {
        this.i = lastTimeUsedCalendar;
    }
    
    public Date getLastTimeUsedMail() {
        return this.j;
    }
    
    public void setLastTimeUsedMail(final Date lastTimeUsedMail) {
        this.j = lastTimeUsedMail;
    }
    
    public Date getLastTimeUsed() {
        return this.k;
    }
    
    public void setLastTimeUsed(final Date lastTimeUsed) {
        this.k = lastTimeUsed;
    }
    
    public int getLastSessionUsed() {
        return this.l;
    }
    
    public void setLastSessionUsed(final int lastSessionUsed) {
        this.l = lastSessionUsed;
    }
    
    public String getGuid() {
        return this.m;
    }
    
    public void setGuid(final String guid) {
        this.m = guid;
    }
    
    public boolean getRenameOnFirstUse() {
        return this.n;
    }
    
    public void setRenameOnFirstUse(final boolean renameOnFirstUse) {
        this.n = renameOnFirstUse;
    }
}

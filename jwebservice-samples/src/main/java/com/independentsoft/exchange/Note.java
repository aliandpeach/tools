package com.independentsoft.exchange;

import java.util.*;

public class Note extends Item
{
    public Note() {
        this.setItemClass("IPM.StickyNote");
    }
    
    public Note(final String subject) {
        this();
        this.d = subject;
    }
    
    public Note(final MimeContent mimeContent) {
        this();
        this.e = mimeContent;
    }
    
    Note(final Item item) {
        this.h = item.h;
        this.g = item.g;
        this.j = item.j;
        this.l = item.l;
        this.n = item.n;
        this.p = item.p;
        this.o = item.o;
        this.q = item.q;
        this.al = item.al;
        this.m = item.m;
        this.a = item.a;
        this.k = item.k;
        this.c = item.c;
        this.r = item.r;
        this.s = item.s;
        this.t = item.t;
        this.u = item.u;
        this.v = item.v;
        this.e = item.e;
        this.ah = item.ah;
        this.ae = item.ae;
        this.af = item.af;
        this.ag = item.ag;
        this.ad = item.ad;
        this.ai = item.ai;
        this.aj = item.aj;
        this.b = item.b;
        this.f = item.f;
        this.i = item.i;
        this.d = item.d;
        this.w = item.w;
        this.y = item.y;
        this.x = item.x;
        this.z = item.z;
        this.A = item.A;
        this.B = item.B;
        this.C = item.C;
    }
    
    final String a() {
        String s = "<t:Item>";
        if (this.e != null) {
            s += this.e.a();
        }
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.independentsoft.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.d != null) {
            s = s + "<t:Subject>" + com.independentsoft.exchange.d.a(this.d) + "</t:Subject>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.independentsoft.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.j.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.j.size(); ++i) {
                if (this.j.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.independentsoft.exchange.d.a(this.j.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.k != Importance.NONE) {
            s = s + "<t:Importance>" + com.independentsoft.exchange.a.a(this.k) + "</t:Importance>";
        }
        if (this.p != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        if (this.ad > 0) {
            s += new ExtendedProperty(NotePropertyPath.WIDTH, this.ad).toString();
        }
        if (this.ae > 0) {
            s += new ExtendedProperty(NotePropertyPath.HEIGHT, this.ae).toString();
        }
        if (this.af > 0) {
            s += new ExtendedProperty(NotePropertyPath.LEFT, this.af).toString();
        }
        if (this.ag > 0) {
            s += new ExtendedProperty(NotePropertyPath.TOP, this.ag).toString();
        }
        if (this.ah != NoteColor.NONE) {
            s += new ExtendedProperty(NotePropertyPath.COLOR, com.independentsoft.exchange.a.a(this.ah)).toString();
        }
        if (this.ai.size() > 0) {
            s += new ExtendedProperty(NotePropertyPath.CONTACTS, this.ai).toString();
        }
        if (this.aj != NoteColor.NONE) {
            s += new ExtendedProperty(MapiPropertyTag.PR_ACTION, Integer.parseInt(com.independentsoft.exchange.a.a(this.aj)) + 768).toString();
        }
        for (int j = 0; j < this.al.size(); ++j) {
            s += this.al.get(j).toString();
        }
        if (this.H != null) {
            s += this.H.a();
        }
        if (this.J != null) {
            s += this.J.a("PolicyTag");
        }
        if (this.K != null) {
            s += this.K.a("ArchiveTag");
        }
        if (this.L != null) {
            s = s + "<t:RetentionDate>" + com.independentsoft.exchange.d.a(this.L) + "</t:RetentionDate>";
        }
        return s + "</t:Item>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public int getWidth() {
        return this.ad;
    }
    
    public void setWidth(final int width) {
        this.ad = width;
    }
    
    public int getHeight() {
        return this.ae;
    }
    
    public void setHeight(final int height) {
        this.ae = height;
    }
    
    public int getLeft() {
        return this.af;
    }
    
    public void setLeft(final int left) {
        this.af = left;
    }
    
    public int getTop() {
        return this.ag;
    }
    
    public void setTop(final int top) {
        this.ag = top;
    }
    
    public NoteColor getColor() {
        return this.ah;
    }
    
    public void setColor(final NoteColor color) {
        this.ah = color;
    }
    
    public List<String> getContacts() {
        return this.ai;
    }
    
    public NoteColor getIconColor() {
        return this.aj;
    }
    
    public void setIconColor(final NoteColor color) {
        this.aj = color;
    }
}

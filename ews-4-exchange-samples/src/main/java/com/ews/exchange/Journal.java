package com.ews.exchange;

import java.util.*;

public class Journal extends Item
{
    public Journal() {
        this.setItemClass("IPM.Activity");
    }
    
    public Journal(final String subject) {
        this();
        this.d = subject;
    }
    
    public Journal(final MimeContent mimeContent) {
        this.e = mimeContent;
    }
    
    Journal(final Item item) {
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
        this.ac = item.ac;
        this.ab = item.ab;
        this.Y = item.Y;
        this.Z = item.Z;
        this.X = item.X;
        this.U = item.U;
        this.aa = item.aa;
        this.T = item.T;
        this.V = item.V;
        this.W = item.W;
        this.r = item.r;
        this.s = item.s;
        this.t = item.t;
        this.u = item.u;
        this.v = item.v;
        this.e = item.e;
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
            s = s + "<t:ItemClass>" + com.ews.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.d != null) {
            s = s + "<t:Subject>" + com.ews.exchange.d.a(this.d) + "</t:Subject>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.ews.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.j.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.j.size(); ++i) {
                if (this.j.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.ews.exchange.d.a(this.j.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.k != Importance.NONE) {
            s = s + "<t:Importance>" + com.ews.exchange.a.a(this.k) + "</t:Importance>";
        }
        if (this.p != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        if (this.T != null) {
            s += new ExtendedProperty(JournalPropertyPath.START_TIME, this.T).toString();
        }
        if (this.U != null) {
            s += new ExtendedProperty(JournalPropertyPath.END_TIME, this.U).toString();
        }
        if (this.V != null) {
            s += new ExtendedProperty(JournalPropertyPath.TYPE, com.ews.exchange.d.a(this.V)).toString();
        }
        if (this.W != null) {
            s += new ExtendedProperty(JournalPropertyPath.TYPE_DESCRIPTION, com.ews.exchange.d.a(this.W)).toString();
        }
        if (this.X > 0) {
            s += new ExtendedProperty(JournalPropertyPath.DURATION, this.X).toString();
        }
        if (this.Y.size() > 0) {
            s += new ExtendedProperty(JournalPropertyPath.COMPANIES, this.Y).toString();
        }
        if (this.Z.size() > 0) {
            s += new ExtendedProperty(JournalPropertyPath.CONTACTS, this.Z).toString();
        }
        if (this.aa) {
            s += new ExtendedProperty(JournalPropertyPath.IS_PRIVATE, "true").toString();
        }
        if (this.ab != null) {
            s += new ExtendedProperty(JournalPropertyPath.COMMON_START_TIME, this.ab).toString();
        }
        if (this.ac != null) {
            s += new ExtendedProperty(JournalPropertyPath.COMMON_END_TIME, this.ac).toString();
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
            s = s + "<t:RetentionDate>" + com.ews.exchange.d.a(this.L) + "</t:RetentionDate>";
        }
        return s + "</t:Item>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public Date getStartTime() {
        return this.T;
    }
    
    public void setStartTime(final Date startTime) {
        this.T = startTime;
    }
    
    public Date getEndTime() {
        return this.U;
    }
    
    public void setEndTime(final Date endTime) {
        this.U = endTime;
    }
    
    public String getType() {
        return this.V;
    }
    
    public void setType(final String type) {
        this.V = type;
    }
    
    public String getTypeDescription() {
        return this.W;
    }
    
    public void setTypeDescription(final String typeDescription) {
        this.W = typeDescription;
    }
    
    public int getDuration() {
        return this.X;
    }
    
    public void setDuration(final int duration) {
        this.X = duration;
    }
    
    public List<String> getCompanies() {
        return this.Y;
    }
    
    public List<String> getContacts() {
        return this.Z;
    }
    
    public boolean isPrivate() {
        return this.aa;
    }
    
    public void setPrivate(final boolean isPrivate) {
        this.aa = isPrivate;
    }
    
    public Date getCommonStartTime() {
        return this.ab;
    }
    
    public void setCommonStartTime(final Date commonStartTime) {
        this.ab = commonStartTime;
    }
    
    public Date getCommonEndTime() {
        return this.ac;
    }
    
    public void setCommonEndTime(final Date commonEndTime) {
        this.ac = commonEndTime;
    }
}

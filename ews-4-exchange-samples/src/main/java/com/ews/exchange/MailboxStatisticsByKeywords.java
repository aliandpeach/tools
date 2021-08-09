package com.ews.exchange;

import java.util.*;

public class MailboxStatisticsByKeywords
{
    private List<UserMailbox> a;
    private List<String> b;
    private String c;
    private List<String> d;
    private List<String> e;
    private Date f;
    private Date g;
    private List<SearchItemKind> h;
    private boolean i;
    private boolean j;
    private boolean k;
    
    public MailboxStatisticsByKeywords() {
        this.a = new ArrayList<UserMailbox>();
        this.b = new ArrayList<String>();
        this.d = new ArrayList<String>();
        this.e = new ArrayList<String>();
        this.h = new ArrayList<SearchItemKind>();
    }
    
    final String a() {
        String s = "" + "<Mailboxes>";
        for (int i = 0; i < this.a.size(); ++i) {
            s += this.a.get(i).a();
        }
        String s2 = s + "</Mailboxes>" + "<Keywords>";
        for (int j = 0; j < this.b.size(); ++j) {
            if (this.b.get(j) != null) {
                s2 = s2 + "<t:String>" + com.ews.exchange.d.a(this.b.get(j)) + "</t:String>";
            }
        }
        String s3 = s2 + "</Keywords>";
        if (this.c != null) {
            s3 = s3 + "<Language>" + com.ews.exchange.d.a(this.c) + "</Language>";
        }
        if (this.d != null && this.e.size() > 0) {
            String s4 = s3 + "<Senders>";
            for (int k = 0; k < this.d.size(); ++k) {
                if (this.d.get(k) != null) {
                    s4 = s4 + "<t:SmtpAddress>" + com.ews.exchange.d.a(this.d.get(k)) + "</t:SmtpAddress>";
                }
            }
            s3 = s4 + "</Senders>";
        }
        if (this.e != null && this.e.size() > 0) {
            String s5 = s3 + "<Recipients>";
            for (int l = 0; l < this.e.size(); ++l) {
                if (this.e.get(l) != null) {
                    s5 = s5 + "<t:SmtpAddress>" + com.ews.exchange.d.a(this.e.get(l)) + "</t:SmtpAddress>";
                }
            }
            s3 = s5 + "</Recipients>";
        }
        if (this.f != null) {
            s3 = s3 + "<FromDate>" + com.ews.exchange.d.a(this.f) + "</FromDate>";
        }
        if (this.g != null) {
            s3 = s3 + "<ToDate>" + com.ews.exchange.d.a(this.g) + "</ToDate>";
        }
        if (this.h != null && this.h.size() > 0) {
            String s6 = s3 + "<MessageTypes>";
            for (int n = 0; n < this.h.size(); ++n) {
                final SearchItemKind searchItemKind;
                s6 = s6 + "<t:SearchItemKind>" + (((searchItemKind = this.h.get(n)) == SearchItemKind.EMAIL) ? "Email" : ((searchItemKind == SearchItemKind.MEETINGS) ? "Meetings" : ((searchItemKind == SearchItemKind.TASKS) ? "Tasks" : ((searchItemKind == SearchItemKind.NOTES) ? "Notes" : ((searchItemKind == SearchItemKind.DOCS) ? "Docs" : ((searchItemKind == SearchItemKind.JOURNALS) ? "Journals" : ((searchItemKind == SearchItemKind.CONTACTS) ? "Contacts" : ((searchItemKind == SearchItemKind.IM) ? "Im" : ((searchItemKind == SearchItemKind.VOICE_MAIL) ? "Voicemail" : ((searchItemKind == SearchItemKind.FAXES) ? "Faxes" : ((searchItemKind == SearchItemKind.POSTS) ? "Posts" : "Rssfeeds"))))))))))) + "</t:SearchItemKind>";
            }
            s3 = s6 + "</MessageTypes>";
        }
        if (this.i) {
            s3 += "<SearchDumpster>true</SearchDumpster>";
        }
        if (this.j) {
            s3 += "<IncludePersonalArchive>true</IncludePersonalArchive>";
        }
        if (this.k) {
            s3 += "<IncludeUnsearchableItems>true</IncludeUnsearchableItems>";
        }
        return s3;
    }
    
    public List<UserMailbox> getMailboxes() {
        return this.a;
    }
    
    public List<String> getKeywords() {
        return this.b;
    }
    
    public String getLanguage() {
        return this.c;
    }
    
    public void setLanguage(final String language) {
        this.c = language;
    }
    
    public List<String> getSenders() {
        return this.d;
    }
    
    public List<String> getRecipients() {
        return this.e;
    }
    
    public Date getFromDate() {
        return this.f;
    }
    
    public void setFromDate(final Date fromDate) {
        this.f = fromDate;
    }
    
    public Date getToDate() {
        return this.g;
    }
    
    public void setToDate(final Date toDate) {
        this.g = toDate;
    }
    
    public List<SearchItemKind> getMessageTypes() {
        return this.h;
    }
    
    public boolean getSearchDumpster() {
        return this.i;
    }
    
    public void setSearchDumpster(final boolean searchDumpster) {
        this.i = searchDumpster;
    }
    
    public boolean getIncludePersonalArchive() {
        return this.j;
    }
    
    public void setIncludePersonalArchive(final boolean includePersonalArchive) {
        this.j = includePersonalArchive;
    }
    
    public boolean getincludeUnsearchableItems() {
        return this.k;
    }
    
    public void setIncludeUnsearchableItems(final boolean includeUnsearchableItems) {
        this.k = includeUnsearchableItems;
    }
}

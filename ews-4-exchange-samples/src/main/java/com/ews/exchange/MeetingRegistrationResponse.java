package com.ews.exchange;

import java.util.*;

public abstract class MeetingRegistrationResponse extends ResponseItem
{
    List<InternetMessageHeader> am;
    Mailbox an;
    List<Mailbox> ao;
    List<Mailbox> ap;
    List<Mailbox> aq;
    boolean ar;
    boolean as;
    Mailbox at;
    Mailbox au;
    Mailbox av;
    
    public MeetingRegistrationResponse() {
        this.am = new ArrayList<InternetMessageHeader>();
        this.ao = new ArrayList<Mailbox>();
        this.ap = new ArrayList<Mailbox>();
        this.aq = new ArrayList<Mailbox>();
    }
    
    public List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.am;
    }
    
    public Mailbox getSender() {
        return this.an;
    }
    
    public void setSender(final Mailbox sender) {
        this.an = sender;
    }
    
    public List<Mailbox> getToRecipients() {
        return this.ao;
    }
    
    public List<Mailbox> getCcRecipients() {
        return this.ap;
    }
    
    public List<Mailbox> getBccRecipients() {
        return this.aq;
    }
    
    public boolean isReadReceiptRequested() {
        return this.ar;
    }
    
    public void setReadReceiptRequested(final boolean isReadReceiptRequested) {
        this.ar = isReadReceiptRequested;
    }
    
    public boolean isDeliveryReceiptRequested() {
        return this.as;
    }
    
    public void setDeliveryReceiptRequested(final boolean isDeliveryReceiptRequested) {
        this.as = isDeliveryReceiptRequested;
    }
    
    public Mailbox getFrom() {
        return this.at;
    }
    
    public void setFrom(final Mailbox from) {
        this.at = from;
    }
    
    public Mailbox getReceivedBy() {
        return this.au;
    }
    
    public Mailbox getReceivedRepresenting() {
        return this.av;
    }
}

package com.independentsoft.exchange;

import java.util.*;

public abstract class MessageResponse extends ResponseItem
{
    List<Mailbox> am;
    List<Mailbox> an;
    List<Mailbox> ao;
    boolean ap;
    boolean aq;
    Body ar;
    Mailbox as;
    Mailbox at;
    Mailbox au;
    
    public MessageResponse() {
        this.am = new ArrayList<Mailbox>();
        this.an = new ArrayList<Mailbox>();
        this.ao = new ArrayList<Mailbox>();
    }
    
    public List<Mailbox> getToRecipients() {
        return this.am;
    }
    
    public List<Mailbox> getCcRecipients() {
        return this.an;
    }
    
    public List<Mailbox> getBccRecipients() {
        return this.ao;
    }
    
    public boolean isReadReceiptRequested() {
        return this.ap;
    }
    
    public void setReadReceiptRequested(final boolean isReadReceiptRequested) {
        this.ap = isReadReceiptRequested;
    }
    
    public boolean isDeliveryReceiptRequested() {
        return this.aq;
    }
    
    public void setDeliveryReceiptRequested(final boolean isDeliveryReceiptRequested) {
        this.aq = isDeliveryReceiptRequested;
    }
    
    public Body getNewBody() {
        return this.ar;
    }
    
    public void setNewBody(final Body newBody) {
        this.ar = newBody;
    }
    
    public Mailbox getFrom() {
        return this.as;
    }
    
    public void setFrom(final Mailbox from) {
        this.as = from;
    }
    
    public Mailbox getReceivedBy() {
        return this.at;
    }
    
    public Mailbox getReceivedRepresenting() {
        return this.au;
    }
}

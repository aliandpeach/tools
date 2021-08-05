package com.independentsoft.exchange;

import java.util.*;

public class ReminderItemAction
{
    private ReminderActionType a;
    private ItemId b;
    private Date c;
    
    public ReminderItemAction() {
        this.a = ReminderActionType.DISMISS;
    }
    
    public ReminderItemAction(final ItemId itemId, final ReminderActionType type) {
        this.a = ReminderActionType.DISMISS;
        this.b = itemId;
        this.a = type;
    }
    
    public ReminderItemAction(final ItemId itemId, final ReminderActionType type, final Date newReminderTime) {
        this.a = ReminderActionType.DISMISS;
        this.b = itemId;
        this.a = type;
        this.c = newReminderTime;
    }
    
    final String a() {
        String s = "<t:ReminderItemAction>" + "<t:ActionType>" + ((this.a == ReminderActionType.DISMISS) ? "Dismiss" : "Snooze") + "</t:ActionType>" + this.b.a();
        if (this.c != null) {
            s = s + "<t:NewReminderTime>" + d.a(this.c) + "</t:NewReminderTime>";
        }
        return s + "</t:ReminderItemAction>";
    }
    
    public ReminderActionType getType() {
        return this.a;
    }
    
    public void setType(final ReminderActionType type) {
        this.a = type;
    }
    
    public ItemId getItemId() {
        return this.b;
    }
    
    public void setItemId(final ItemId itemId) {
        this.b = itemId;
    }
    
    public Date getNewReminderTime() {
        return this.c;
    }
    
    public void setNewReminderTime(final Date newReminderTime) {
        this.c = newReminderTime;
    }
}

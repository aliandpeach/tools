package com.ews.exchange;

public abstract class ResponseItem extends Item
{
    ItemId aw;
    
    public ItemId getReferenceItemId() {
        return this.aw;
    }
    
    public void setReferenceItemId(final ItemId referenceItemId) {
        this.aw = referenceItemId;
    }
}

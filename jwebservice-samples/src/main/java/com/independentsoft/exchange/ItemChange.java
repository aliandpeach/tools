package com.independentsoft.exchange;

import java.util.*;

public class ItemChange
{
    private ItemId a;
    private List<Property> b;
    private List<PropertyPath> c;
    private List<Property> d;
    
    public ItemChange() {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
    }
    
    public ItemChange(final ItemId itemId) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
    }
    
    public ItemChange(final ItemId itemId, final Property propertyToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b.add(propertyToSet);
    }
    
    public ItemChange(final ItemId itemId, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.c.add(propertyToDelete);
    }
    
    public ItemChange(final ItemId itemId, final Property propertyToSet, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b.add(propertyToSet);
        this.c.add(propertyToDelete);
    }
    
    public ItemChange(final ItemId itemId, final Property propertyToSet, final Property propertyToAppend) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b.add(propertyToSet);
        this.d.add(propertyToAppend);
    }
    
    public ItemChange(final ItemId itemId, final Property propertyToSet, final PropertyPath propertyToDelete, final Property propertyToAppend) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b.add(propertyToSet);
        this.c.add(propertyToDelete);
        this.d.add(propertyToAppend);
    }
    
    public ItemChange(final ItemId itemId, final List<Property> propertiesToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b = propertiesToSet;
    }
    
    public ItemChange(final ItemId itemId, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b = propertiesToSet;
        this.c = propertiesToDelete;
    }
    
    public ItemChange(final ItemId itemId, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete, final List<Property> propertiesToAppend) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = itemId;
        this.b = propertiesToSet;
        this.c = propertiesToDelete;
        this.d = propertiesToAppend;
    }
    
    public String toString() {
        String string = "<t:ItemChange>";
        if (this.a != null) {
            string += this.a.a();
        }
        String s = string + "<t:Updates>";
        if (this.d != null && this.d.size() > 0) {
            for (int i = 0; i < this.d.size(); ++i) {
                if (this.d.get(i) != null && this.d.get(i).getPropertyPath() != null && (this.d.get(i).getValue() != null || this.d.get(i).getValues().size() > 0)) {
                    s = s + "<t:AppendToItemField>" + this.d.get(i).a() + "</t:AppendToItemField>";
                }
            }
        }
        if (this.b != null && this.b.size() > 0) {
            for (int j = 0; j < this.b.size(); ++j) {
                if (this.b.get(j) != null && this.b.get(j).getPropertyPath() != null && (this.b.get(j).getValue() != null || this.b.get(j).getValues().size() > 0)) {
                    s = s + "<t:SetItemField>" + this.b.get(j).a() + "</t:SetItemField>";
                }
            }
        }
        if (this.c != null && this.c.size() > 0) {
            for (int k = 0; k < this.c.size(); ++k) {
                if (this.c.get(k) != null) {
                    s = s + "<t:DeleteItemField>" + this.c.get(k).toString() + "</t:DeleteItemField>";
                }
            }
        }
        return s + "</t:Updates>" + "</t:ItemChange>";
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public void setItemId(final ItemId itemId) {
        this.a = itemId;
    }
    
    public List<Property> getPropertiesToSet() {
        return this.b;
    }
    
    public List<PropertyPath> getPropertiesToDelete() {
        return this.c;
    }
    
    public List<Property> getPropertiesToAppend() {
        return this.d;
    }
}

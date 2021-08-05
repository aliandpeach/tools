package com.independentsoft.exchange;

import java.util.*;

public class FolderChange
{
    private FolderId a;
    private List<Property> b;
    private List<PropertyPath> c;
    private List<Property> d;
    
    public FolderChange() {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
    }
    
    public FolderChange(final FolderId folderId, final Property propertyToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = folderId;
        this.b.add(propertyToSet);
    }
    
    public FolderChange(final FolderId folderId, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = folderId;
        this.c.add(propertyToDelete);
    }
    
    public FolderChange(final FolderId folderId, final Property propertyToSet, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = folderId;
        this.b.add(propertyToSet);
        this.c.add(propertyToDelete);
    }
    
    public FolderChange(final StandardFolder standardFolder, final Property propertyToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = new StandardFolderId(standardFolder);
        this.b.add(propertyToSet);
    }
    
    public FolderChange(final StandardFolder standardFolder, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = new StandardFolderId(standardFolder);
        this.c.add(propertyToDelete);
    }
    
    public FolderChange(final StandardFolder standardFolder, final Property propertyToSet, final PropertyPath propertyToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = new StandardFolderId(standardFolder);
        this.b.add(propertyToSet);
        this.c.add(propertyToDelete);
    }
    
    public FolderChange(final FolderId folderId, final List<Property> propertiesToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = folderId;
        this.b = propertiesToSet;
    }
    
    public FolderChange(final FolderId folderId, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = folderId;
        this.b = propertiesToSet;
        this.c = propertiesToDelete;
    }
    
    public FolderChange(final StandardFolder standardFolder, final List<Property> propertiesToSet) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = new StandardFolderId(standardFolder);
        this.b = propertiesToSet;
    }
    
    public FolderChange(final StandardFolder standardFolder, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete) {
        this.b = new ArrayList<Property>();
        this.c = new ArrayList<PropertyPath>();
        this.d = new ArrayList<Property>();
        this.a = new StandardFolderId(standardFolder);
        this.b = propertiesToSet;
        this.c = propertiesToDelete;
    }
    
    public String toString() {
        String string = "<t:FolderChange>";
        if (this.a != null) {
            string += this.a.a();
        }
        String s = string + "<t:Updates>";
        if (this.b != null && this.b.size() > 0) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i) != null && this.b.get(i).getPropertyPath() != null && (this.b.get(i).getValue() != null || this.b.get(i).getValues().size() > 0)) {
                    s = s + "<t:SetFolderField>" + this.b.get(i).b() + "</t:SetFolderField>";
                }
            }
        }
        if (this.c != null && this.c.size() > 0) {
            for (int j = 0; j < this.c.size(); ++j) {
                if (this.c.get(j) != null) {
                    s = s + "<t:DeleteFolderField>" + this.c.get(j).toString() + "</t:DeleteFolderField>";
                }
            }
        }
        return s + "</t:Updates>" + "</t:FolderChange>";
    }
    
    public FolderId getFolderId() {
        return this.a;
    }
    
    public void setFolderId(final FolderId folderId) {
        this.a = folderId;
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

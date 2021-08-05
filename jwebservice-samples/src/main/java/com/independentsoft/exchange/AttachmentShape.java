package com.independentsoft.exchange;

import java.util.*;

public class AttachmentShape
{
    private List<PropertyPath> a;
    private boolean b;
    private BodyType c;
    private boolean d;
    
    public AttachmentShape() {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
    }
    
    public AttachmentShape(final boolean includeMimeContent) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.b = includeMimeContent;
    }
    
    public AttachmentShape(final BodyType bodyType) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.c = bodyType;
    }
    
    public AttachmentShape(final boolean includeMimeContent, final BodyType bodyType) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.b = includeMimeContent;
        this.c = bodyType;
    }
    
    public AttachmentShape(final List<PropertyPath> propertyPaths) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.a = propertyPaths;
    }
    
    public AttachmentShape(final List<PropertyPath> propertyPaths, final boolean includeMimeContent) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.a = propertyPaths;
        this.b = includeMimeContent;
    }
    
    public AttachmentShape(final List<PropertyPath> propertyPaths, final BodyType bodyType) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.a = propertyPaths;
        this.c = bodyType;
    }
    
    public AttachmentShape(final List<PropertyPath> propertyPaths, final boolean includeMimeContent, final BodyType bodyType) {
        this.a = new ArrayList<PropertyPath>();
        this.c = BodyType.NONE;
        this.a = propertyPaths;
        this.b = includeMimeContent;
        this.c = bodyType;
    }
    
    public String toString() {
        String s = "<AttachmentShape>";
        if (this.b) {
            s += "<t:IncludeMimeContent>true</t:IncludeMimeContent>";
        }
        if (this.c != BodyType.NONE) {
            s = s + "<t:BodyType>" + com.independentsoft.exchange.a.a(this.c) + "</t:BodyType>";
        }
        if (this.d) {
            s += "<t:FilterHtmlContent>true</t:FilterHtmlContent>";
        }
        if (this.a != null && this.a.size() > 0) {
            String s2 = s + "<t:AdditionalProperties>";
            for (int i = 0; i < this.a.size(); ++i) {
                s2 += this.a.get(i).toString();
            }
            s = s2 + "</t:AdditionalProperties>";
        }
        return s + "</AttachmentShape>";
    }
    
    public List<PropertyPath> getPropertyPaths() {
        return this.a;
    }
    
    public boolean getIncludeMimeContent() {
        return this.b;
    }
    
    public void setIncludeMimeContent(final boolean includeMimeContent) {
        this.b = includeMimeContent;
    }
    
    public BodyType getBodyType() {
        return this.c;
    }
    
    public void setBodyType(final BodyType bodyType) {
        this.c = bodyType;
    }
    
    public boolean isFilterHtmlContent() {
        return this.d;
    }
    
    public void setFilterHtmlContent(final boolean filterHtmlContent) {
        this.d = filterHtmlContent;
    }
}

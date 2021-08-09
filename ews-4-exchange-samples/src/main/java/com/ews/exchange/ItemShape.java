package com.ews.exchange;

import java.util.*;

public class ItemShape
{
    private ShapeType a;
    private List<PropertyPath> b;
    private boolean c;
    private BodyType d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private int j;
    
    public ItemShape() {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
    }
    
    public ItemShape(final ShapeType type) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
    }
    
    public ItemShape(final ShapeType type, final boolean includeMimeContent) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.c = includeMimeContent;
    }
    
    public ItemShape(final ShapeType type, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.d = bodyType;
    }
    
    public ItemShape(final ShapeType type, final boolean includeMimeContent, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.c = includeMimeContent;
        this.d = bodyType;
    }
    
    public ItemShape(final List<PropertyPath> propertyPaths) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.b = propertyPaths;
    }
    
    public ItemShape(final List<PropertyPath> propertyPaths, final boolean includeMimeContent) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.b = propertyPaths;
        this.c = includeMimeContent;
    }
    
    public ItemShape(final List<PropertyPath> propertyPaths, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.b = propertyPaths;
        this.d = bodyType;
    }
    
    public ItemShape(final List<PropertyPath> propertyPaths, final boolean includeMimeContent, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.b = propertyPaths;
        this.c = includeMimeContent;
        this.d = bodyType;
    }
    
    public ItemShape(final ShapeType type, final List<PropertyPath> propertyPaths) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.b = propertyPaths;
    }
    
    public ItemShape(final ShapeType type, final List<PropertyPath> propertyPaths, final boolean includeMimeContent) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.b = propertyPaths;
        this.c = includeMimeContent;
    }
    
    public ItemShape(final ShapeType type, final List<PropertyPath> propertyPaths, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.b = propertyPaths;
        this.d = bodyType;
    }
    
    public ItemShape(final ShapeType type, final List<PropertyPath> propertyPaths, final boolean includeMimeContent, final BodyType bodyType) {
        this.a = ShapeType.ID;
        this.b = new ArrayList<PropertyPath>();
        this.d = BodyType.NONE;
        this.a = type;
        this.b = propertyPaths;
        this.c = includeMimeContent;
        this.d = bodyType;
    }
    
    public String toString() {
        String s = "<ItemShape>" + "<t:BaseShape>" + com.ews.exchange.a.a(this.a) + "</t:BaseShape>";
        if (this.c) {
            s += "<t:IncludeMimeContent>true</t:IncludeMimeContent>";
        }
        if (this.d != BodyType.NONE) {
            s = s + "<t:BodyType>" + com.ews.exchange.a.a(this.d) + "</t:BodyType>";
        }
        if (this.e) {
            s += "<t:FilterHtmlContent>true</t:FilterHtmlContent>";
        }
        if (this.f) {
            s += "<t:ConvertHtmlCodePageToUTF8>true</t:ConvertHtmlCodePageToUTF8>";
        }
        if (this.g != null) {
            s = s + "<t:InlineImageUrlTemplate>" + com.ews.exchange.d.a(this.g) + "</t:InlineImageUrlTemplate>";
        }
        if (this.h) {
            s += "<t:BlockExternalImages>true</t:BlockExternalImages>";
        }
        if (this.i) {
            s += "<t:AddBlankTargetToLinks>true</t:AddBlankTargetToLinks>";
        }
        if (this.j > 0) {
            s = s + "<t:MaximumBodySize>" + this.j + "</t:MaximumBodySize>";
        }
        if (this.b != null && this.b.size() > 0) {
            String s2 = s + "<t:AdditionalProperties>";
            for (int i = 0; i < this.b.size(); ++i) {
                s2 += this.b.get(i).toString();
            }
            s = s2 + "</t:AdditionalProperties>";
        }
        return s + "</ItemShape>";
    }
    
    public ShapeType getType() {
        return this.a;
    }
    
    public void setType(final ShapeType type) {
        this.a = type;
    }
    
    public List<PropertyPath> getPropertyPaths() {
        return this.b;
    }
    
    public boolean getIncludeMimeContent() {
        return this.c;
    }
    
    public void setIncludeMimeContent(final boolean includeMimeContent) {
        this.c = includeMimeContent;
    }
    
    public BodyType getBodyType() {
        return this.d;
    }
    
    public void setBodyType(final BodyType bodyType) {
        this.d = bodyType;
    }
    
    public boolean isFilterHtmlContent() {
        return this.e;
    }
    
    public void setFilterHtmlContent(final boolean filterHtmlContent) {
        this.e = filterHtmlContent;
    }
    
    public boolean isConvertHtmlCodePageToUTF8() {
        return this.f;
    }
    
    public void setConvertHtmlCodePageToUTF8(final boolean convertHtmlCodePageToUTF8) {
        this.f = convertHtmlCodePageToUTF8;
    }
    
    public String getInlineImageUrlTemplate() {
        return this.g;
    }
    
    public void setInlineImageUrlTemplate(final String inlineImageUrlTemplate) {
        this.g = inlineImageUrlTemplate;
    }
    
    public boolean isBlockExternalImages() {
        return this.h;
    }
    
    public void setBlockExternalImages(final boolean blockExternalImages) {
        this.h = blockExternalImages;
    }
    
    public boolean isAddBlankTargetToLinks() {
        return this.i;
    }
    
    public void setAddBlankTargetToLinks(final boolean addBlankTargetToLinks) {
        this.i = addBlankTargetToLinks;
    }
    
    public int getMaximumBodySize() {
        return this.j;
    }
    
    public void setMaximumBodySize(final int maximumBodySize) {
        this.j = maximumBodySize;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;
import java.text.*;
import java.util.*;

public class CategoryList
{
    private String a;
    private int b;
    private Date c;
    private List<Category> d;
    
    public CategoryList() {
        this.d = new ArrayList<Category>();
    }
    
    CategoryList(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.d = new ArrayList<Category>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = reader.getAttributeValue(null, "default");
        final String attributeValue = reader.getAttributeValue(null, "lastSavedSession");
        final String attributeValue2 = reader.getAttributeValue(null, "lastSavedTime");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.b = Integer.parseInt(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.c = com.independentsoft.exchange.d.c(attributeValue2);
        }
        while (reader.hasNext() && reader.next() > 0) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("category") && reader.getNamespaceURI().equals("CategoryList.xsd")) {
                this.d.add(new Category(reader));
            }
        }
    }
    
    final String a() {
        String string = "";
        if (this.a != null) {
            string = string + " default=\"" + com.independentsoft.exchange.d.a(this.a) + "\"";
        }
        String s = string + " lastSavedSession=\"" + this.b + "\"";
        if (this.c != null) {
            s = s + " lastSavedTime=\"" + com.independentsoft.exchange.d.a(this.c) + "\"";
        }
        String s2 = "<?xml version=\"1.0\"?>" + "<categories " + s + " xmlns=\"CategoryList.xsd\">";
        final Iterator<Category> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            s2 += iterator.next().a();
        }
        return s2 + "</categories>";
    }
    
    public String getDefault() {
        return this.a;
    }
    
    public void setDefault(final String defaultCategory) {
        this.a = defaultCategory;
    }
    
    public int getLastSavedSession() {
        return this.b;
    }
    
    public void setLastSavedSession(final int lastSavedSession) {
        this.b = lastSavedSession;
    }
    
    public Date getLastSavedTime() {
        return this.c;
    }
    
    public void setLastSavedTime(final Date lastSavedTime) {
        this.c = lastSavedTime;
    }
    
    public List<Category> getCategories() {
        return this.d;
    }
}

package com.ews.exchange;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class ItemId extends Id
{
    public ItemId() {
    }
    
    public ItemId(final String id) {
        this.id = id;
    }
    
    public ItemId(final String id, final String changeKey) {
        this.id = id;
        this.changeKey = changeKey;
    }
    
    ItemId(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.id = reader.getAttributeValue(null, "Id");
        this.changeKey = reader.getAttributeValue(null, "ChangeKey");
        while (reader.hasNext() && (!reader.isEndElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals(startLocalName) || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            reader.next();
        }
    }
    
    String a() {
        return this.a("t:ItemId");
    }
    
    final String a(String string) {
        String s = "";
        if (this.id != null) {
            s = s + " Id=\"" + this.id + "\"";
        }
        if (this.changeKey != null) {
            s = s + " ChangeKey=\"" + this.changeKey + "\"";
        }
        return string = "<" + string + s + "/>";
    }
    
    public String toString() {
        if (this.id != null) {
            return this.id;
        }
        return super.toString();
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
}

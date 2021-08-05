package com.ews.exchange;

import javax.xml.stream.*;

public class FolderId extends Id
{
    public FolderId() {
    }
    
    public FolderId(final String id) {
        this.id = id;
    }
    
    public FolderId(final String id, final String changeKey) {
        this.id = id;
        this.changeKey = changeKey;
    }
    
    FolderId(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.id = reader.getAttributeValue(null, "Id");
        this.changeKey = reader.getAttributeValue(null, "ChangeKey");
        while (reader.hasNext() && (!reader.isEndElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals(startLocalName) || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            reader.next();
        }
    }
    
    String a() {
        return this.a("t:FolderId");
    }
    
    String a(String string) {
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

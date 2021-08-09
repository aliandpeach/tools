package com.ews.exchange;

import javax.xml.stream.*;

public class OccurrenceItemId extends ItemId
{
    private int a;
    
    public OccurrenceItemId() {
        this.a = -1;
    }
    
    public OccurrenceItemId(final String id) {
        this.a = -1;
        this.id = id;
    }
    
    public OccurrenceItemId(final String id, final String changeKey) {
        this.a = -1;
        this.id = id;
        this.changeKey = changeKey;
    }
    
    public OccurrenceItemId(final String id, final int index) {
        this.a = -1;
        this.id = id;
        this.a = index;
    }
    
    public OccurrenceItemId(final String id, final String changeKey, final int index) {
        this.a = -1;
        this.id = id;
        this.changeKey = changeKey;
        this.a = index;
    }
    
    OccurrenceItemId(final XMLStreamReader reader) throws XMLStreamException {
        this.a = -1;
        this.id = reader.getAttributeValue(null, "Id");
        this.changeKey = reader.getAttributeValue(null, "ChangeKey");
        while (reader.hasNext() && (!reader.isEndElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals("OccurrenceItemId") || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            reader.next();
        }
    }
    
    final String a() {
        String s = "";
        if (this.id != null) {
            s = s + " RecurringMasterId=\"" + this.id + "\"";
        }
        if (this.changeKey != null) {
            s = s + " ChangeKey=\"" + this.changeKey + "\"";
        }
        if (this.a >= 0) {
            s = s + " InstanceIndex=\"" + this.a + "\"";
        }
        return "<t:OccurrenceItemId" + s + "/>";
    }
    
    public String toString() {
        if (this.id != null) {
            return this.id;
        }
        return super.toString();
    }
    
    public int getIndex() {
        return this.a;
    }
    
    public void setIndex(final int index) {
        this.a = index;
    }
}

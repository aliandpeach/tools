package com.independentsoft.exchange;

import javax.xml.stream.*;

public class RecurringMasterItemId extends ItemId
{
    public RecurringMasterItemId() {
    }
    
    public RecurringMasterItemId(final String id) {
        this.id = id;
    }
    
    public RecurringMasterItemId(final String id, final String changeKey) {
        this.id = id;
        this.changeKey = changeKey;
    }
    
    RecurringMasterItemId(final XMLStreamReader reader) throws XMLStreamException {
        this.id = reader.getAttributeValue(null, "Id");
        this.changeKey = reader.getAttributeValue(null, "ChangeKey");
        while (reader.hasNext() && (!reader.isEndElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals("RecurringMasterItemId") || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            reader.next();
        }
    }
    
    final String a() {
        String s = "";
        if (this.id != null) {
            s = s + " OccurrenceId=\"" + this.id + "\"";
        }
        if (this.changeKey != null) {
            s = s + " ChangeKey=\"" + this.changeKey + "\"";
        }
        return "<t:RecurringMasterItemId" + s + "/>";
    }
    
    public String toString() {
        if (this.id != null) {
            return this.id;
        }
        return super.toString();
    }
}

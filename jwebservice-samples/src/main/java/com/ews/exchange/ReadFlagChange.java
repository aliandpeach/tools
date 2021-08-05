package com.ews.exchange;

import javax.xml.stream.*;

public class ReadFlagChange
{
    private ItemId a;
    private boolean b;
    
    public ReadFlagChange() {
    }
    
    ReadFlagChange(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(reader, "ItemId");
            }
            else {
                final String elementText;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsRead") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.b = Boolean.parseBoolean(elementText);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ReadFlagChange") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public boolean isRead() {
        return this.b;
    }
}

package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Occurrence
{
    private ItemId a;
    private Date b;
    private Date c;
    private Date d;
    
    public Occurrence() {
    }
    
    public Occurrence(final ItemId itemId) {
        this.a = itemId;
    }
    
    Occurrence(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException, ParseException {
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader reader, final String s) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(reader, "ItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Start") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.b = com.ews.exchange.d.c(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("End") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.c = com.ews.exchange.d.c(elementText2);
                }
            }
            else {
                final String elementText3;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OriginalStart") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.d = com.ews.exchange.d.c(elementText3);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals(s) && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        if (this.a != null) {
            return this.a.toString();
        }
        return super.toString();
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public void setItemId(final ItemId itemId) {
        this.a = itemId;
    }
    
    public Date getStartTime() {
        return this.b;
    }
    
    public Date getEndTime() {
        return this.c;
    }
    
    public Date getOriginalStartTime() {
        return this.d;
    }
}

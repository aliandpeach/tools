package com.ews.exchange;

import javax.xml.stream.*;

public class MarkAsJunkResponse extends Response
{
    private ItemId g;
    
    private MarkAsJunkResponse() {
    }
    
    MarkAsJunkResponse(final XMLStreamReader reader) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.a.R(attributeValue);
        }
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageText") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseCode") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.b = com.ews.exchange.a.S(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DescriptiveLinkKey") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.e = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageXml") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.d = "";
                while (reader.nextTag() > 0) {
                    if (reader.isStartElement()) {
                        this.d = this.d + "<" + reader.getLocalName() + " xmlns=\"" + reader.getNamespaceURI() + "\">";
                        this.d += reader.getElementText();
                        this.d = this.d + "</" + reader.getLocalName() + ">";
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageXml") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MovedItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.g = new ItemId();
                this.g.id = reader.getAttributeValue(null, "Id");
                this.g.changeKey = reader.getAttributeValue(null, "ChangeKey");
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MarkAsJunkResponseMessage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    public ItemId getMovedItemId() {
        return this.g;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class ImGroupInfoResponse extends Response
{
    private ImGroup g;
    
    private ImGroupInfoResponse() {
    }
    
    ImGroupInfoResponse(final XMLStreamReader reader, final String localName) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
            this.a = com.independentsoft.exchange.a.R(attributeValue);
        }
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageText") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseCode") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.b = com.independentsoft.exchange.a.S(reader.getElementText());
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
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ImGroup") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.g = new ImGroup(reader, "http://schemas.microsoft.com/exchange/services/2006/messages");
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals(localName) && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    public ImGroup getImGroup() {
        return this.g;
    }
}

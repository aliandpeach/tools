package com.ews.exchange;

import javax.xml.stream.*;

public class StatusEvent extends Event
{
    public StatusEvent() {
    }
    
    StatusEvent(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Watermark") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("StatusEvent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
}

package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ExtendedPropertyAttributedValue
{
    private List<String> a;
    
    public ExtendedPropertyAttributedValue() {
        this.a = new ArrayList<String>();
    }
    
    ExtendedPropertyAttributedValue(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (true) {
            if ((!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("Value") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) && xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attributions") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attribution") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.a.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attributions") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExtendedPropertyAttributedValue") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public ExtendedProperty getValue() {
        return null;
    }
    
    public List<String> getAttributions() {
        return this.a;
    }
}

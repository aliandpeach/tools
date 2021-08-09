package com.ews.exchange;

import javax.xml.stream.*;

public class PersonaPhoneNumber
{
    private String a;
    private String b;
    
    public PersonaPhoneNumber() {
    }
    
    PersonaPhoneNumber(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Number") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Type") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getNumber() {
        return this.a;
    }
    
    public String getType() {
        return this.b;
    }
}

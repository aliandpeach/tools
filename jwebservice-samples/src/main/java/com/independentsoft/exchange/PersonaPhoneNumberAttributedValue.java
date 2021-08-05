package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class PersonaPhoneNumberAttributedValue
{
    private PersonaPhoneNumber a;
    private List<String> b;
    
    public PersonaPhoneNumberAttributedValue() {
        this.b = new ArrayList<String>();
    }
    
    PersonaPhoneNumberAttributedValue(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Value") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new PersonaPhoneNumber(reader, "Value");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attributions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attribution") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Attributions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PhoneNumberAttributedValue") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public PersonaPhoneNumber getValue() {
        return this.a;
    }
    
    public List<String> getAttributions() {
        return this.b;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;

public class EnhancedLocation
{
    private String a;
    private String b;
    private PersonaPostalAddress c;
    
    public EnhancedLocation() {
    }
    
    public EnhancedLocation(final String displayName) {
        this.a = displayName;
    }
    
    public EnhancedLocation(final String displayName, final String annotation) {
        this.a = displayName;
        this.b = annotation;
    }
    
    public EnhancedLocation(final String displayName, final String annotation, final PersonaPostalAddress postalAddress) {
        this.a = displayName;
        this.b = annotation;
        this.c = postalAddress;
    }
    
    EnhancedLocation(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DisplayName") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Annotation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PostalAddress") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new PersonaPostalAddress(reader, "PostalAddress");
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EnhancedLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String getDisplayName() {
        return this.a;
    }
    
    public void setDisplayName(final String displayName) {
        this.a = displayName;
    }
    
    public String getAnnotation() {
        return this.b;
    }
    
    public void setAnnotation(final String annotation) {
        this.b = annotation;
    }
    
    public PersonaPostalAddress getPostalAddress() {
        return this.c;
    }
    
    public void setPostalAddress(final PersonaPostalAddress postalAddress) {
        this.c = postalAddress;
    }
}

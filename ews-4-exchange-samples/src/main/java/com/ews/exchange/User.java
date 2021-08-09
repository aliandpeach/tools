package com.ews.exchange;

import javax.xml.stream.*;

public class User
{
    private String a;
    private String b;
    private String c;
    
    public User() {
    }
    
    User(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LegacyDN") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DeploymentId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("User") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getDisplayName() {
        return this.a;
    }
    
    public String getLegacyDN() {
        return this.b;
    }
    
    public String getDeploymentId() {
        return this.c;
    }
}

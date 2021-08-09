package com.ews.exchange;

import javax.xml.stream.*;

public class WebClientUrl
{
    private String a;
    private String b;
    
    public WebClientUrl() {
    }
    
    WebClientUrl(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AuthenticationMethods") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Url") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.b = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientUrl") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getAuthenticationMethods() {
        return this.a;
    }
    
    public String getUrl() {
        return this.b;
    }
}

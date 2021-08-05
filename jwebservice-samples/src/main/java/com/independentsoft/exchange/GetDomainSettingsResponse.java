package com.independentsoft.exchange;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;

public class GetDomainSettingsResponse
{
    private ErrorCode a;
    private String b;
    private List<DomainResponse> c;
    
    public GetDomainSettingsResponse() {
        this.a = ErrorCode.NO_ERROR;
        this.c = new ArrayList<DomainResponse>();
    }
    
    GetDomainSettingsResponse(final InputStream inputStream) throws XMLStreamException {
        this.a = ErrorCode.NO_ERROR;
        this.c = new ArrayList<DomainResponse>();
        this.a(inputStream);
    }
    
    private void a(final InputStream inputStream) throws XMLStreamException {
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) == null || elementText.length() <= 0) {
                    continue;
                }
                this.a = com.independentsoft.exchange.a.a(elementText);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.b = xmlStreamReader.getElementText();
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("DomainResponses") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                    continue;
                }
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DomainResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.c.add(new DomainResponse(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DomainResponses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
        }
    }
    
    public ErrorCode getErrorCode() {
        return this.a;
    }
    
    public String getErrorMessage() {
        return this.b;
    }
    
    public List<DomainResponse> getDomainResponses() {
        return this.c;
    }
}

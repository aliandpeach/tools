package com.independentsoft.exchange;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;

public class GetUserSettingsResponse
{
    private ErrorCode a;
    private String b;
    private List<UserResponse> c;
    
    public GetUserSettingsResponse() {
        this.a = ErrorCode.NO_ERROR;
        this.c = new ArrayList<UserResponse>();
    }
    
    GetUserSettingsResponse(final InputStream inputStream) throws XMLStreamException {
        this.a = ErrorCode.NO_ERROR;
        this.c = new ArrayList<UserResponse>();
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
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("UserResponses") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                    continue;
                }
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.c.add(new UserResponse(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserResponses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
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
    
    public List<UserResponse> getUserResponses() {
        return this.c;
    }
}

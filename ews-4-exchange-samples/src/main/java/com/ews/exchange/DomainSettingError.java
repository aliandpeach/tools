package com.ews.exchange;

import javax.xml.stream.*;

public class DomainSettingError
{
    private ErrorCode a;
    private String b;
    private String c;
    
    public DomainSettingError() {
        this.a = ErrorCode.NO_ERROR;
    }
    
    DomainSettingError(final XMLStreamReader reader) throws XMLStreamException {
        this.a = ErrorCode.NO_ERROR;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.a.a(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SettingName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DomainSettingError") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public ErrorCode getErrorCode() {
        return this.a;
    }
    
    public String getErrorMessage() {
        return this.b;
    }
    
    public String getSettingName() {
        return this.c;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class MobileSyncError
{
    private String a;
    private String b;
    private String c;
    
    public MobileSyncError() {
    }
    
    MobileSyncError(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Status") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DebugData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Error") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getStatus() {
        return this.a;
    }
    
    public String getMessage() {
        return this.b;
    }
    
    public String getDebugData() {
        return this.c;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class MobileSyncServer
{
    private String a;
    private String b;
    private String c;
    
    public MobileSyncServer() {
    }
    
    MobileSyncServer(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Type") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Url") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Name") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Server") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getType() {
        return this.a;
    }
    
    public String getUrl() {
        return this.b;
    }
    
    public String getName() {
        return this.c;
    }
}

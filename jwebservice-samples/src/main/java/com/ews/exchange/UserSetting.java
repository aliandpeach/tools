package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class UserSetting
{
    private String a;
    private String b;
    private String c;
    private List<WebClientUrl> d;
    private List<ProtocolConnection> e;
    
    public UserSetting() {
        this.d = new ArrayList<WebClientUrl>();
        this.e = new ArrayList<ProtocolConnection>();
    }
    
    UserSetting(final XMLStreamReader reader) throws XMLStreamException {
        this.d = new ArrayList<WebClientUrl>();
        this.e = new ArrayList<ProtocolConnection>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.c = xmlStreamReader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Name") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Value") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientUrls") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientUrl") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.d.add(new WebClientUrl(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientUrl") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ProtocolConnections") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ProtocolConnection") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.e.add(new ProtocolConnection(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ProtocolConnections") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSetting") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getName() {
        return this.a;
    }
    
    public String getValue() {
        return this.b;
    }
    
    public String getType() {
        return this.c;
    }
    
    public List<WebClientUrl> getWebClientUrls() {
        return this.d;
    }
    
    public List<ProtocolConnection> getProtocolConnections() {
        return this.e;
    }
}

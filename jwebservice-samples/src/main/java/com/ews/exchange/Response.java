package com.ews.exchange;

import javax.xml.stream.*;

public class Response
{
    ResponseClass a;
    ResponseCode b;
    String c;
    String d;
    String e;
    ServerVersionInfo f;
    
    Response() {
        this.a = ResponseClass.SUCCESS;
        this.b = ResponseCode.NO_ERROR;
    }
    
    Response(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.a = ResponseClass.SUCCESS;
        this.b = ResponseCode.NO_ERROR;
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.a.R(attributeValue);
        }
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResponseMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String attributeValue2;
                if ((attributeValue2 = xmlStreamReader.getAttributeValue(null, "ResponseClass")) != null && attributeValue2.length() > 0) {
                    this.a = com.ews.exchange.a.R(attributeValue2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageText") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResponseCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.b = com.ews.exchange.a.S(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DescriptiveLinkKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.e = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageXml") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.d = "";
                while (xmlStreamReader.nextTag() > 0) {
                    if (xmlStreamReader.isStartElement()) {
                        this.d = this.d + "<" + xmlStreamReader.getLocalName() + " xmlns=\"" + xmlStreamReader.getNamespaceURI() + "\">";
                        this.d += xmlStreamReader.getElementText();
                        this.d = this.d + "</" + xmlStreamReader.getLocalName() + ">";
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageXml") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public ResponseClass getResponseClass() {
        return this.a;
    }
    
    public ResponseCode getResponseCode() {
        return this.b;
    }
    
    public String getMessage() {
        return this.c;
    }
    
    public String getXmlMessage() {
        return this.d;
    }
    
    public String getDescriptiveLinkKey() {
        return this.e;
    }
    
    public ServerVersionInfo getServerVersionInfo() {
        return this.f;
    }
    
    public void setServerVersionInfo(final ServerVersionInfo serverVersionInfo) {
        this.f = serverVersionInfo;
    }
}

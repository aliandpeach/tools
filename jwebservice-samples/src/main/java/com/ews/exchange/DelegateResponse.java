package com.ews.exchange;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;

public class DelegateResponse extends Response
{
    private List<DelegateUserResponse> g;
    private DeliverMeetingRequests h;
    
    private DelegateResponse() {
        this.g = new ArrayList<DelegateUserResponse>();
        this.h = DeliverMeetingRequests.NONE;
    }
    
    DelegateResponse(final InputStream inputStream, final String startLocalName) throws XMLStreamException {
        this.g = new ArrayList<DelegateUserResponse>();
        this.h = DeliverMeetingRequests.NONE;
        this.a(inputStream, startLocalName);
    }
    
    private void a(final InputStream inputStream, final String s) throws XMLStreamException {
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(s) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final String attributeValue;
                if ((attributeValue = xmlStreamReader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
                    this.a = com.ews.exchange.a.R(attributeValue);
                }
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageText") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
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
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DelegateUserResponseMessageType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        this.g.add(new DelegateUserResponse(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DelegateUserResponseMessageType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        final String elementText;
                        this.h = ((elementText = xmlStreamReader.getElementText()).equals("DelegatesAndMe") ? DeliverMeetingRequests.DELEGATES_AND_ME : (elementText.equals("DelegatesAndSendInformationToMe") ? DeliverMeetingRequests.DELEGATES_AND_SEND_INFORMATION_TO_ME : (elementText.equals("DelegatesOnly") ? DeliverMeetingRequests.DELEGATES_ONLY : DeliverMeetingRequests.NONE)));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
        }
    }
    
    public List<DelegateUserResponse> getDelegateUserResponses() {
        return this.g;
    }
    
    public DeliverMeetingRequests getDeliverMeetingRequests() {
        return this.h;
    }
}

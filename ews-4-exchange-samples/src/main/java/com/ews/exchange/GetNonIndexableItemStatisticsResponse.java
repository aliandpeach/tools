package com.ews.exchange;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;

public class GetNonIndexableItemStatisticsResponse extends Response
{
    private List<NonIndexableItemStatistic> g;
    
    private GetNonIndexableItemStatisticsResponse() {
        this.g = new ArrayList<NonIndexableItemStatistic>();
    }
    
    GetNonIndexableItemStatisticsResponse(final InputStream inputStream) throws XMLStreamException {
        this.g = new ArrayList<NonIndexableItemStatistic>();
        this.a(inputStream);
    }
    
    private void a(final InputStream inputStream) throws XMLStreamException {
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new ServerVersionInfo(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GetNonIndexableItemDetailsResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String attributeValue;
                if ((attributeValue = xmlStreamReader.getAttributeValue(null, "ResponseClass")) == null || attributeValue.length() <= 0) {
                    continue;
                }
                this.a = com.ews.exchange.a.R(attributeValue);
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
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("NonIndexableItemStatistics") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NonIndexableItemStatistic") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(new NonIndexableItemStatistic(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NonIndexableItemStatistics") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
        }
    }
    
    public List<NonIndexableItemStatistic> getStatistics() {
        return this.g;
    }
}

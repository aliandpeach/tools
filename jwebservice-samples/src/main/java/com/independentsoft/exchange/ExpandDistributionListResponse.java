package com.independentsoft.exchange;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;

public class ExpandDistributionListResponse extends Response
{
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private List<Mailbox> l;
    
    private ExpandDistributionListResponse() {
        this.l = new ArrayList<Mailbox>();
    }
    
    ExpandDistributionListResponse(final InputStream inputStream) throws XMLStreamException {
        this.l = new ArrayList<Mailbox>();
        this.a(inputStream);
    }
    
    private void a(final InputStream inputStream) throws XMLStreamException {
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("ExpandDLResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final String attributeValue;
                if ((attributeValue = xmlStreamReader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
                    this.a = com.independentsoft.exchange.a.R(attributeValue);
                }
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageText") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        this.c = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResponseCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        this.b = com.independentsoft.exchange.a.S(xmlStreamReader.getElementText());
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
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DLExpansion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        final String attributeValue2 = xmlStreamReader.getAttributeValue(null, "IndexedPagingOffset");
                        final String attributeValue3 = xmlStreamReader.getAttributeValue(null, "NumeratorOffset");
                        final String attributeValue4 = xmlStreamReader.getAttributeValue(null, "AbsoluteDenominator");
                        final String attributeValue5 = xmlStreamReader.getAttributeValue(null, "IncludesLastItemInRange");
                        final String attributeValue6 = xmlStreamReader.getAttributeValue(null, "TotalItemsInView");
                        if (attributeValue2 != null && attributeValue2.length() > 0) {
                            this.g = Integer.parseInt(attributeValue2);
                        }
                        if (attributeValue3 != null && attributeValue3.length() > 0) {
                            this.h = Integer.parseInt(attributeValue3);
                        }
                        if (attributeValue4 != null && attributeValue4.length() > 0) {
                            this.i = Integer.parseInt(attributeValue4);
                        }
                        if (attributeValue5 != null && attributeValue5.length() > 0) {
                            this.j = Boolean.parseBoolean(attributeValue5);
                        }
                        if (attributeValue6 != null && attributeValue6.length() > 0) {
                            this.k = Integer.parseInt(attributeValue6);
                        }
                        while (xmlStreamReader.hasNext()) {
                            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new Mailbox(xmlStreamReader));
                            }
                            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DLExpansion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                                break;
                            }
                            xmlStreamReader.next();
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExpandDLResponseMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
        }
    }
    
    public int getIndexedPagingOffset() {
        return this.g;
    }
    
    public int getNumeratorOffset() {
        return this.h;
    }
    
    public int getAbsoluteDenominator() {
        return this.i;
    }
    
    public boolean getIncludesLastItemInRange() {
        return this.j;
    }
    
    public int getTotalItemsInView() {
        return this.k;
    }
    
    public List<Mailbox> getMailboxes() {
        return this.l;
    }
}

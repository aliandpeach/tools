package com.ews.exchange;

import java.util.*;
import java.io.*;
import java.text.*;
import javax.xml.stream.*;

public class SearchMailboxesResponse extends Response
{
    private List<MailboxQuery> g;
    private SearchResultType h;
    private int i;
    private int j;
    private int k;
    private int l;
    private List<KeywordStatisticsSearchResult> m;
    private List<PreviewItem> n;
    private List<FailedMailbox> o;
    private List<RefinerItem> p;
    private List<MailboxStatisticsItem> q;
    
    private SearchMailboxesResponse() {
        this.g = new ArrayList<MailboxQuery>();
        this.h = SearchResultType.PREVIEW_ONLY;
        this.m = new ArrayList<KeywordStatisticsSearchResult>();
        this.n = new ArrayList<PreviewItem>();
        this.o = new ArrayList<FailedMailbox>();
        this.p = new ArrayList<RefinerItem>();
        this.q = new ArrayList<MailboxStatisticsItem>();
    }
    
    SearchMailboxesResponse(final InputStream inputStream) throws XMLStreamException, ParseException {
        this.g = new ArrayList<MailboxQuery>();
        this.h = SearchResultType.PREVIEW_ONLY;
        this.m = new ArrayList<KeywordStatisticsSearchResult>();
        this.n = new ArrayList<PreviewItem>();
        this.o = new ArrayList<FailedMailbox>();
        this.p = new ArrayList<RefinerItem>();
        this.q = new ArrayList<MailboxStatisticsItem>();
        this.a(inputStream);
    }
    
    private void a(final InputStream inputStream) throws XMLStreamException, ParseException {
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = new ServerVersionInfo(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SearchMailboxesResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
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
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SearchQueries") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxQuery") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(new MailboxQuery(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SearchQueries") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ResultType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.h = (xmlStreamReader.getElementText().equals("StatisticsOnly") ? SearchResultType.STATISTICS_ONLY : SearchResultType.PREVIEW_ONLY);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) == null || elementText.length() <= 0) {
                    continue;
                }
                this.i = Integer.parseInt(elementText);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Size") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) == null || elementText2.length() <= 0) {
                    continue;
                }
                this.j = Integer.parseInt(elementText2);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PageItemCount") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) == null || elementText3.length() <= 0) {
                    continue;
                }
                this.k = Integer.parseInt(elementText3);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PageItemSize") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) == null || elementText4.length() <= 0) {
                    continue;
                }
                this.l = Integer.parseInt(elementText4);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("KeywordStats") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("KeywordStat") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.m.add(new KeywordStatisticsSearchResult(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("KeywordStats") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Items") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SearchPreviewItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.n.add(new PreviewItem(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Items") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FailedMailboxes") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FailedMailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.o.add(new FailedMailbox(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FailedMailboxes") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Refiners") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Refiner") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.p.add(new RefinerItem(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Refiners") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("MailboxStats") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    continue;
                }
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxStat") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.q.add(new MailboxStatisticsItem(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxStats") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
        }
    }
    
    public List<MailboxQuery> getMailboxQueries() {
        return this.g;
    }
    
    public SearchResultType getResultType() {
        return this.h;
    }
    
    public int getItemCount() {
        return this.i;
    }
    
    public int getSize() {
        return this.j;
    }
    
    public int getPageItemCount() {
        return this.k;
    }
    
    public int getPageItemSize() {
        return this.l;
    }
    
    public List<KeywordStatisticsSearchResult> getKeywordStatisticsSearchResults() {
        return this.m;
    }
    
    public List<PreviewItem> getItems() {
        return this.n;
    }
    
    public List<FailedMailbox> getFailedMailboxes() {
        return this.o;
    }
    
    public List<RefinerItem> getRefiners() {
        return this.p;
    }
    
    public List<MailboxStatisticsItem> getMailboxStatisticsItems() {
        return this.q;
    }
}

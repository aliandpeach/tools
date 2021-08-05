package com.independentsoft.exchange;

import javax.xml.stream.*;

public class MailboxStatisticsSearchResult
{
    private UserMailbox a;
    private KeywordStatisticsSearchResult b;
    
    public MailboxStatisticsSearchResult() {
    }
    
    MailboxStatisticsSearchResult(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserMailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new UserMailbox(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("KeywordStatisticsSearchResult") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new KeywordStatisticsSearchResult(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MailboxStatisticsSearchResult") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public UserMailbox getUserMailbox() {
        return this.a;
    }
    
    public KeywordStatisticsSearchResult getKeywordStatisticsSearchResult() {
        return this.b;
    }
}

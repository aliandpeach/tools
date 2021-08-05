package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class RulePredicateDateRange
{
    private Date a;
    private Date b;
    
    public RulePredicateDateRange() {
    }
    
    RulePredicateDateRange(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartDateTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = d.c(elementText);
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndDateTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = d.c(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WithinDateRange") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:WithinDateRange>";
        if (this.a != null) {
            s = s + "<t:StartDateTime>" + d.a(this.a) + "</t:StartDateTime>";
        }
        if (this.b != null) {
            s = s + "<t:EndDateTime>" + d.a(this.b) + "</t:EndDateTime>";
        }
        return s + "</t:WithinDateRange>";
    }
    
    public Date getStartDate() {
        return this.a;
    }
    
    public void setStartDate(final Date startDate) {
        this.a = startDate;
    }
    
    public Date geEndDate() {
        return this.b;
    }
    
    public void setEndDate(final Date endDate) {
        this.b = endDate;
    }
}

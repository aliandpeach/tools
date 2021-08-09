package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class EndDateRecurrenceRange implements RecurrenceRange
{
    private Date a;
    private Date b;
    
    public EndDateRecurrenceRange() {
    }
    
    public EndDateRecurrenceRange(final Date startDate, final Date endDate) {
        this.a = startDate;
        this.b = endDate;
    }
    
    EndDateRecurrenceRange(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = d.a(elementText, "yyyy-MM-dd");
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = d.a(elementText2, "yyyy-MM-dd");
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndDateRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = "<t:EndDateRecurrence>";
        if (this.a != null) {
            s = s + "<t:StartDate>" + simpleDateFormat.format(this.a) + "</t:StartDate>";
        }
        if (this.b != null) {
            s = s + "<t:EndDate>" + simpleDateFormat.format(this.b) + "</t:EndDate>";
        }
        return s + "</t:EndDateRecurrence>";
    }
    
    public Date getStartDate() {
        return this.a;
    }
    
    public void setStartDate(final Date startDate) {
        this.a = startDate;
    }
    
    public Date getEndDate() {
        return this.b;
    }
    
    public void setEndDate(final Date endDate) {
        this.b = endDate;
    }
}

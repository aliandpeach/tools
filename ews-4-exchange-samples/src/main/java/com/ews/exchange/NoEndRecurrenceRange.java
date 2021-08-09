package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class NoEndRecurrenceRange implements RecurrenceRange
{
    private Date a;
    
    public NoEndRecurrenceRange() {
    }
    
    public NoEndRecurrenceRange(final Date startDate) {
        this.a = startDate;
    }
    
    NoEndRecurrenceRange(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            final String elementText;
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                this.a = d.a(elementText, "yyyy-MM-dd");
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NoEndRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "<t:NoEndRecurrence>";
        if (this.a != null) {
            string = string + "<t:StartDate>" + new SimpleDateFormat("yyyy-MM-dd").format(this.a) + "</t:StartDate>";
        }
        return string + "</t:NoEndRecurrence>";
    }
    
    public Date getStartDate() {
        return this.a;
    }
    
    public void setStartDate(final Date startDate) {
        this.a = startDate;
    }
}

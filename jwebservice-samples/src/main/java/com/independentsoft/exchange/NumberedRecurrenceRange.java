package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class NumberedRecurrenceRange implements RecurrenceRange
{
    private Date a;
    private int b;
    
    public NumberedRecurrenceRange() {
    }
    
    public NumberedRecurrenceRange(final Date startDate, final int occurrenceCount) {
        this.a = startDate;
        this.b = occurrenceCount;
    }
    
    NumberedRecurrenceRange(final XMLStreamReader reader) throws XMLStreamException, ParseException {
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
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NumberOfOccurrences") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Integer.parseInt(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NumberedRecurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:NumberedRecurrence>";
        if (this.a != null) {
            s = s + "<t:StartDate>" + new SimpleDateFormat("yyyy-MM-dd").format(this.a) + "</t:StartDate>";
        }
        if (this.b > 0) {
            s = s + "<t:NumberOfOccurrences>" + this.b + "</t:NumberOfOccurrences>";
        }
        return s + "</t:NumberedRecurrence>";
    }
    
    public Date getStartDate() {
        return this.a;
    }
    
    public void setStartDate(final Date startDate) {
        this.a = startDate;
    }
    
    public int getOccurrenceCount() {
        return this.b;
    }
    
    public void setOccurrenceCount(final int occurrenceCount) {
        this.b = occurrenceCount;
    }
}

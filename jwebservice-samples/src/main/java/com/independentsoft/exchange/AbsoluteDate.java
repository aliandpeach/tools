package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class AbsoluteDate implements TimeChangePattern
{
    private Date a;
    
    public AbsoluteDate() {
    }
    
    public AbsoluteDate(final Date date) {
        this.a = date;
    }
    
    AbsoluteDate(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            final String elementText;
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                this.a = d.c(elementText);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "";
        if (this.a != null) {
            string = string + "<t:AbsoluteDate>" + d.a(this.a) + "</t:AbsoluteDate>";
        }
        return string;
    }
    
    public Date getDate() {
        return this.a;
    }
    
    public void setDate(final Date date) {
        this.a = date;
    }
}

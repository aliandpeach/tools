package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class DeletedOccurrence
{
    private Date a;
    
    public DeletedOccurrence() {
    }
    
    DeletedOccurrence(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            final String elementText;
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Start") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                this.a = d.c(elementText);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DeletedOccurrence") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "<t:DeletedOccurrence>";
        if (this.a != null) {
            string = string + "<t:Start>" + d.a(this.a) + "</t:Start>";
        }
        return string + "</t:DeletedOccurrence>";
    }
    
    public Date getStartTime() {
        return this.a;
    }
}

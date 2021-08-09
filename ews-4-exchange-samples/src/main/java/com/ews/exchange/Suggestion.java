package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Suggestion
{
    private Date a;
    private boolean b;
    private SuggestionQuality c;
    private List<AttendeeConflict> d;
    
    public Suggestion() {
        this.c = SuggestionQuality.NONE;
        this.d = new ArrayList<AttendeeConflict>();
    }
    
    public Suggestion(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.c = SuggestionQuality.NONE;
        this.d = new ArrayList<AttendeeConflict>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.d.b(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsWorkTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Boolean.parseBoolean(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SuggestionQuality") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = com.ews.exchange.a.e(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AttendeeConflictDataArray") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IndividualAttendeeConflictData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new IndividualAttendeeConflict(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupAttendeeConflictData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new GroupAttendeeConflict(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TooBigGroupAttendeeConflictData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new TooBigGroupAttendeeConflict());
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UnknownAttendeeConflictData") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new UnknownAttendeeConflict());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AttendeeConflictDataArray") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Suggestion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public Date getMeetingTime() {
        return this.a;
    }
    
    public boolean isWorkTime() {
        return this.b;
    }
    
    public SuggestionQuality getQuality() {
        return this.c;
    }
    
    public List<AttendeeConflict> getAttendeeConflicts() {
        return this.d;
    }
}

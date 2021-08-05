package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class FreeBusyView
{
    private FreeBusyViewType a;
    private String b;
    private List<CalendarEvent> c;
    private WorkingHours d;
    
    public FreeBusyView() {
        this.a = FreeBusyViewType.NONE;
        this.c = new ArrayList<CalendarEvent>();
    }
    
    FreeBusyView(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = FreeBusyViewType.NONE;
        this.c = new ArrayList<CalendarEvent>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FreeBusyViewType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.a = ((s = elementText).equals("Detailed") ? FreeBusyViewType.DETAILED : (s.equals("DetailedMerged") ? FreeBusyViewType.DETAILED_MERGED : (s.equals("FreeBusy") ? FreeBusyViewType.FREE_BUSY : (s.equals("FreeBusyMerged") ? FreeBusyViewType.FREE_BUSY_MERGED : (s.equals("MergedOnly") ? FreeBusyViewType.MERGED_ONLY : FreeBusyViewType.NONE)))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MergedFreeBusy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEventArray") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEvent") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new CalendarEvent(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarEventArray") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WorkingHours") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new WorkingHours(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FreeBusyView") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public FreeBusyViewType getType() {
        return this.a;
    }
    
    public String getMergedFreeBusy() {
        return this.b;
    }
    
    public List<CalendarEvent> getCalendarEvents() {
        return this.c;
    }
    
    public WorkingHours getWorkingHours() {
        return this.d;
    }
}

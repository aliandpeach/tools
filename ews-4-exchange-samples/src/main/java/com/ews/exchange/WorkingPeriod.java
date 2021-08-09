package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class WorkingPeriod
{
    private List<DayOfWeek> a;
    private Time b;
    private Time c;
    
    public WorkingPeriod() {
        this.a = new ArrayList<DayOfWeek>();
    }
    
    WorkingPeriod(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<DayOfWeek>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DayOfWeek") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String[] split = elementText.split(" ");
                    for (int i = 0; i < split.length; ++i) {
                        if (split[i] != null && split[i].length() > 0) {
                            this.a.add(com.ews.exchange.a.q(split[i]));
                        }
                    }
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StartTimeInMinutes") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    final int int1;
                    final int hour = (int1 = Integer.parseInt(elementText2)) / 60;
                    this.b = new Time(hour, int1 - hour * 60);
                }
            }
            else {
                final String elementText3;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EndTimeInMinutes") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    final int int2;
                    final int hour2 = (int2 = Integer.parseInt(elementText3)) / 60;
                    this.c = new Time(hour2, int2 - hour2 * 60);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WorkingPeriod") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public List<DayOfWeek> getDays() {
        return this.a;
    }
    
    public Time getStartTime() {
        return this.b;
    }
    
    public Time getEndTime() {
        return this.c;
    }
}

package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class TransitionsGroup
{
    private String a;
    private List<Transition> b;
    
    TransitionsGroup() {
        this.b = new ArrayList<Transition>();
    }
    
    TransitionsGroup(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.b = new ArrayList<Transition>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        this.a = xmlStreamReader.getAttributeValue(null, "Id");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Transition") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(new Transition(xmlStreamReader));
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AbsoluteDateTransition") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(new AbsoluteDateTransition(xmlStreamReader));
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RecurringDateTransition") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(new RecurringDateTransition(xmlStreamReader));
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RecurringDayTransition") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(new RecurringDayTransition(xmlStreamReader));
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TransitionsGroup") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "";
        if (this.a != null) {
            string = string + " Id=\"" + d.a(this.a) + "\"";
        }
        String s = "<t:TransitionsGroup" + string + ">";
        if (this.b.size() > 0) {
            for (int i = 0; i < this.b.size(); ++i) {
                s += this.b.get(i).toString();
            }
        }
        return s + "</t:TransitionsGroup>";
    }
    
    public String getId() {
        return this.a;
    }
    
    public List<Transition> getTransitions() {
        return this.b;
    }
}

package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class TimeZoneDefinition
{
    private String a;
    private String b;
    private List<Period> c;
    private List<TransitionsGroup> d;
    private List<Transition> e;
    
    TimeZoneDefinition() {
        this.c = new ArrayList<Period>();
        this.d = new ArrayList<TransitionsGroup>();
        this.e = new ArrayList<Transition>();
    }
    
    TimeZoneDefinition(final XMLStreamReader reader, final String localName) throws XMLStreamException, ParseException {
        this.c = new ArrayList<Period>();
        this.d = new ArrayList<TransitionsGroup>();
        this.e = new ArrayList<Transition>();
        this.a(reader, localName);
    }
    
    private void a(final XMLStreamReader reader, final String s) throws XMLStreamException, ParseException {
        this.a = reader.getAttributeValue(null, "Id");
        this.b = reader.getAttributeValue(null, "Name");
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Periods") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Period") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new Period(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Periods") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TransitionsGroups") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TransitionsGroup") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new TransitionsGroup(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TransitionsGroups") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Transitions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Transition") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(new Transition(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Transitions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals(s) && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a(final String s) {
        String s2 = "";
        if (this.a != null) {
            s2 = s2 + " Id=\"" + com.independentsoft.exchange.d.a(this.a) + "\"";
        }
        if (this.b != null) {
            s2 = s2 + " Name=\"" + com.independentsoft.exchange.d.a(this.b) + "\"";
        }
        String s3 = "<t:" + s + " " + s2 + ">";
        if (this.c.size() > 0) {
            String s4 = s3 + "<t:Periods>";
            for (int i = 0; i < this.c.size(); ++i) {
                s4 += this.c.get(i).toString();
            }
            s3 = s4 + "</t:Periods>";
        }
        if (this.d.size() > 0) {
            String s5 = s3 + "<t:TransitionsGroups>";
            for (int j = 0; j < this.d.size(); ++j) {
                s5 += this.d.get(j).toString();
            }
            s3 = s5 + "</t:TransitionsGroups>";
        }
        if (this.e.size() > 0) {
            String s6 = s3 + "<t:Transitions>";
            for (int k = 0; k < this.e.size(); ++k) {
                s6 += this.e.get(k).toString();
            }
            s3 = s6 + "</t:Transitions>";
        }
        return s3 + "</t:" + s + ">";
    }
    
    public String getId() {
        return this.a;
    }
    
    public String getName() {
        return this.b;
    }
    
    public List<Period> getPeriods() {
        return this.c;
    }
    
    public List<TransitionsGroup> getTransitionsGroups() {
        return this.d;
    }
    
    public List<Transition> getTransitons() {
        return this.e;
    }
}

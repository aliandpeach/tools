package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ProtectionRuleAction
{
    private String a;
    private List<String> b;
    
    private ProtectionRuleAction() {
        this.b = new ArrayList<String>();
    }
    
    ProtectionRuleAction(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.a = xmlStreamReader.getAttributeValue(null, "Name");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Argument") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(xmlStreamReader.getAttributeValue(null, "Value"));
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Action") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getName() {
        return this.a;
    }
    
    public List<String> getArguments() {
        return this.b;
    }
}

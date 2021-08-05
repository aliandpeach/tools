package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ProtectionRulesConfiguration
{
    private int a;
    private List<ProtectionRule> b;
    private List<SmtpDomain> c;
    
    private ProtectionRulesConfiguration() {
        this.b = new ArrayList<ProtectionRule>();
        this.c = new ArrayList<SmtpDomain>();
    }
    
    ProtectionRulesConfiguration(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<ProtectionRule>();
        this.c = new ArrayList<SmtpDomain>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "RefreshInterval")) != null && attributeValue.length() > 0) {
            this.a = Integer.parseInt(attributeValue);
        }
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Rules") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Rule") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new ProtectionRule(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Rules") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternalDomains") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Domain") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new SmtpDomain(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InternalDomains") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ProtectionRulesConfiguration") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public int getRefreshInterval() {
        return this.a;
    }
    
    public List<ProtectionRule> getRules() {
        return this.b;
    }
    
    public List<SmtpDomain> getInternalDomains() {
        return this.c;
    }
}

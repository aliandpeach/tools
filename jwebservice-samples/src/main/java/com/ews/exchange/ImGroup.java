package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ImGroup
{
    private ItemId a;
    private String b;
    private String c;
    private List<ItemId> d;
    private String e;
    private ExtendedPropertyList f;
    
    public ImGroup() {
        this.d = new ArrayList<ItemId>();
        this.f = new ExtendedPropertyList();
    }
    
    public ImGroup(final String displayName) {
        this.d = new ArrayList<ItemId>();
        this.f = new ExtendedPropertyList();
        this.b = displayName;
    }
    
    ImGroup(final XMLStreamReader reader, final String startNamespace) throws XMLStreamException {
        this.d = new ArrayList<ItemId>();
        this.f = new ExtendedPropertyList();
        this.a(reader, startNamespace);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExchangeStoreId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(xmlStreamReader, "ExchangeStoreId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupType") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SmtpAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MemberCorrelationKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new ItemId(xmlStreamReader, "ItemId"));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MemberCorrelationKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExtendedProperty")) {
                xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types");
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        if (this.b != null) {
            return this.b;
        }
        return super.toString();
    }
    
    public ItemId getGroupId() {
        return this.a;
    }
    
    public String getDisplayName() {
        return this.b;
    }
    
    public String getGroupType() {
        return this.c;
    }
    
    public List<ItemId> getMemberCorrelationKey() {
        return this.d;
    }
    
    public String getSmtpAddress() {
        return this.e;
    }
    
    public ExtendedPropertyList getExtendedProperties() {
        return this.f;
    }
}

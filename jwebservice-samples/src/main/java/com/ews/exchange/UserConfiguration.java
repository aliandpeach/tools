package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class UserConfiguration
{
    private UserConfigurationName a;
    private ItemId b;
    private List<UserConfigurationDictionaryEntry> c;
    private String d;
    private byte[] e;
    
    public UserConfiguration() {
        this.c = new ArrayList<UserConfigurationDictionaryEntry>();
    }
    
    public UserConfiguration(final UserConfigurationName name) {
        this.c = new ArrayList<UserConfigurationDictionaryEntry>();
        this.a = name;
    }
    
    UserConfiguration(final XMLStreamReader reader) throws XMLStreamException {
        this.c = new ArrayList<UserConfigurationDictionaryEntry>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Name") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new UserConfigurationName(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new ItemId(reader, "ItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Dictionary") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DictionaryEntry") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new UserConfigurationDictionaryEntry(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Dictionary") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("XmlData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else {
                final String elementText;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BinaryData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.e = com.ews.exchange.d.e(elementText);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UserConfiguration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<UserConfiguration>";
        if (this.a != null) {
            s += this.a.a();
        }
        if (this.b != null) {
            s += this.b.a();
        }
        if (this.c != null && this.c.size() > 0) {
            String s2 = s + "<t:Dictionary>";
            for (int i = 0; i < this.c.size(); ++i) {
                if (this.c.get(i) != null) {
                    s2 += this.c.get(i).a();
                }
            }
            s = s2 + "</t:Dictionary>";
        }
        if (this.d != null) {
            s = s + "<t:XmlData>" + com.ews.exchange.d.a(this.d) + "</t:XmlData>";
        }
        if (this.e != null && this.e.length > 0) {
            s = s + "<t:BinaryData>" + com.ews.exchange.d.a(this.e) + "</t:BinaryData>";
        }
        return s + "</UserConfiguration>";
    }
    
    public UserConfigurationName getName() {
        return this.a;
    }
    
    public void setName(final UserConfigurationName name) {
        this.a = name;
    }
    
    public ItemId getItemId() {
        return this.b;
    }
    
    public void setItemId(final ItemId itemId) {
        this.b = itemId;
    }
    
    public List<UserConfigurationDictionaryEntry> getEntries() {
        return this.c;
    }
    
    public String getXmlData() {
        return this.d;
    }
    
    public void setXmlData(final String xmlData) {
        this.d = xmlData;
    }
    
    public byte[] getBinaryData() {
        return this.e;
    }
    
    public void setBinaryData(final byte[] binaryData) {
        this.e = binaryData;
    }
}

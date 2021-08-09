package com.ews.exchange;

import javax.xml.stream.*;

public class UserConfigurationDictionaryEntry
{
    private UserConfigurationDictionaryKey a;
    private UserConfigurationDictionaryValue b;
    
    public UserConfigurationDictionaryEntry() {
    }
    
    public UserConfigurationDictionaryEntry(final UserConfigurationDictionaryKey key, final UserConfigurationDictionaryValue value) {
        this.a = key;
        this.b = value;
    }
    
    UserConfigurationDictionaryEntry(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DictionaryKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new UserConfigurationDictionaryKey(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DictionaryValue") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new UserConfigurationDictionaryValue(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DictionaryEntry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:DictionaryEntry>";
        if (this.a != null) {
            s += this.a.a();
        }
        if (this.b != null) {
            s += this.b.a();
        }
        return s + "</t:DictionaryEntry>";
    }
    
    public UserConfigurationDictionaryKey getKey() {
        return this.a;
    }
    
    public void setKey(final UserConfigurationDictionaryKey key) {
        this.a = key;
    }
    
    public UserConfigurationDictionaryValue getValue() {
        return this.b;
    }
    
    public void setValue(final UserConfigurationDictionaryValue value) {
        this.b = value;
    }
}

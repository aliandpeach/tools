package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class UserConfigurationDictionaryValue
{
    private UserConfigurationDictionaryObjectType a;
    private List<String> b;
    
    public UserConfigurationDictionaryValue() {
        this.a = UserConfigurationDictionaryObjectType.STRING;
        this.b = new ArrayList<String>();
    }
    
    public UserConfigurationDictionaryValue(final UserConfigurationDictionaryObjectType type, final String value) {
        this.a = UserConfigurationDictionaryObjectType.STRING;
        this.b = new ArrayList<String>();
        this.a = type;
        this.b.add(value);
    }
    
    public UserConfigurationDictionaryValue(final UserConfigurationDictionaryObjectType type, final List<String> values) {
        this.a = UserConfigurationDictionaryObjectType.STRING;
        this.b = new ArrayList<String>();
        this.a = type;
        if (values != null) {
            this.b = values;
        }
    }
    
    UserConfigurationDictionaryValue(final XMLStreamReader reader) throws XMLStreamException {
        this.a = UserConfigurationDictionaryObjectType.STRING;
        this.b = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Type") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.independentsoft.exchange.a.d(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Value") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b.add(xmlStreamReader.getElementText());
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DictionaryValue") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:DictionaryValue>" + "<t:Type>" + com.independentsoft.exchange.a.a(this.a) + "</t:Type>";
        for (int i = 0; i < this.b.size(); ++i) {
            if (this.b.get(i) != null) {
                s = s + "<t:Value>" + d.a(this.b.get(i)) + "</t:Value>";
            }
        }
        return s + "</t:DictionaryValue>";
    }
    
    public UserConfigurationDictionaryObjectType getType() {
        return this.a;
    }
    
    public void setType(final UserConfigurationDictionaryObjectType type) {
        this.a = type;
    }
    
    public List<String> getValues() {
        return this.b;
    }
}

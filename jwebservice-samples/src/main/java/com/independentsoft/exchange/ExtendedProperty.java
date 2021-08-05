package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ExtendedProperty extends Property
{
    public ExtendedProperty() {
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final String value) {
        this.a = propertyPath;
        this.b = value;
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final long value) {
        this.a = propertyPath;
        this.b = Long.toString(value);
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final double value) {
        this.a = propertyPath;
        this.b = Double.toString(value);
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final boolean value) {
        this.a = propertyPath;
        this.b = Boolean.toString(value);
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final Date value) {
        this.a = propertyPath;
        this.b = com.independentsoft.exchange.d.a(value);
    }
    
    public ExtendedProperty(final ExtendedPropertyPath propertyPath, final List<String> values) {
        this.a = propertyPath;
        this.c = values;
    }
    
    ExtendedProperty(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExtendedFieldURI") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String attributeValue = reader.getAttributeValue(null, "PropertyTag");
                final String attributeValue2 = reader.getAttributeValue(null, "DistinguishedPropertySetId");
                final String attributeValue3 = reader.getAttributeValue(null, "PropertySetId");
                final String attributeValue4 = reader.getAttributeValue(null, "PropertyName");
                final String attributeValue5 = reader.getAttributeValue(null, "PropertyId");
                final String attributeValue6 = reader.getAttributeValue(null, "PropertyType");
                if (attributeValue != null) {
                    this.a = new PropertyTag(Integer.parseInt(attributeValue.replace("0x", ""), 16), com.independentsoft.exchange.a.F(attributeValue6));
                }
                else if (attributeValue2 != null) {
                    if (attributeValue4 != null) {
                        this.a = new PropertyName(attributeValue4, com.independentsoft.exchange.a.E(attributeValue2), com.independentsoft.exchange.a.F(attributeValue6));
                    }
                    else {
                        this.a = new PropertyId(Integer.parseInt(attributeValue5), com.independentsoft.exchange.a.E(attributeValue2), com.independentsoft.exchange.a.F(attributeValue6));
                    }
                }
                else if (attributeValue3 != null) {
                    if (attributeValue4 != null) {
                        this.a = new CustomPropertyName(attributeValue4, attributeValue3, com.independentsoft.exchange.a.F(attributeValue6));
                    }
                    else {
                        this.a = new CustomPropertyId(Integer.parseInt(attributeValue5), attributeValue3, com.independentsoft.exchange.a.F(attributeValue6));
                    }
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Value") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Values") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new ArrayList<String>();
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Value") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Values") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ExtendedProperty") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:ExtendedProperty>";
        if (this.a != null) {
            s += this.a.toString();
        }
        if (this.b != null) {
            s = s + "<t:Value>" + com.independentsoft.exchange.d.a(this.b) + "</t:Value>";
        }
        else if (this.c != null) {
            String s2 = s + "<t:Values>";
            for (int i = 0; i < this.c.size(); ++i) {
                if (this.c.get(i) != null) {
                    s2 = s2 + "<t:Value>" + com.independentsoft.exchange.d.a(this.c.get(i)) + "</t:Value>";
                }
            }
            s = s2 + "</t:Values>";
        }
        return s + "</t:ExtendedProperty>";
    }
    
    final String a() {
        String string = "";
        if (this.a != null) {
            string += this.a.toString();
        }
        return string + "<t:Item>" + this.toString() + "</t:Item>";
    }
    
    final String b() {
        String string = "";
        if (this.a != null) {
            string += this.a.toString();
        }
        return string + "<t:Folder>" + this.toString() + "</t:Folder>";
    }
    
    public ExtendedPropertyPath getPropertyPath() {
        return (ExtendedPropertyPath)this.a;
    }
    
    public void setPropertyPath(final ExtendedPropertyPath propertyPath) {
        this.a = propertyPath;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;

public class Body
{
    private String a;
    private BodyType b;
    private boolean c;
    
    public Body() {
        this.b = BodyType.TEXT;
    }
    
    public Body(final String text) {
        this.b = BodyType.TEXT;
        this.a = text;
    }
    
    public Body(final BodyType type) {
        this.b = BodyType.TEXT;
        this.b = type;
    }
    
    public Body(final String text, final BodyType type) {
        this.b = BodyType.TEXT;
        this.a = text;
        this.b = type;
    }
    
    public Body(final String text, final BodyType type, final boolean isTruncated) {
        this.b = BodyType.TEXT;
        this.a = text;
        this.b = type;
        this.c = isTruncated;
    }
    
    Body(final XMLStreamReader reader) throws XMLStreamException {
        this.b = BodyType.TEXT;
        this.a(reader, "Body");
    }
    
    Body(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.b = BodyType.TEXT;
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        final String attributeValue = xmlStreamReader.getAttributeValue(null, "BodyType");
        final String attributeValue2 = xmlStreamReader.getAttributeValue(null, "IsTruncated");
        if (attributeValue != null && attributeValue.length() > 0) {
            final String s2;
            this.b = ((s2 = attributeValue).equals("HTML") ? BodyType.HTML : (s2.equals("Text") ? BodyType.TEXT : (s2.equals("Best") ? BodyType.BEST : BodyType.NONE)));
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.c = Boolean.parseBoolean(attributeValue2);
        }
        this.a = xmlStreamReader.getElementText();
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(s) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        final String s = "";
        String s2;
        if (this.b == BodyType.HTML) {
            s2 = s + " BodyType=\"HTML\"";
        }
        else {
            s2 = s + " BodyType=\"Text\"";
        }
        if (this.c) {
            s2 += " IsTruncated=\"true\"";
        }
        return "<t:Body" + s2 + ">" + d.a(this.a) + "</t:Body>";
    }
    
    final String b() {
        final String s = "";
        String s2;
        if (this.b == BodyType.HTML) {
            s2 = s + " BodyType=\"HTML\"";
        }
        else {
            s2 = s + " BodyType=\"Text\"";
        }
        if (this.c) {
            s2 += " IsTruncated=\"true\"";
        }
        return "<t:NewBodyContent" + s2 + ">" + d.a(this.a) + "</t:NewBodyContent>";
    }
    
    public String toString() {
        return this.a();
    }
    
    public String getText() {
        return this.a;
    }
    
    public void setText(final String text) {
        this.a = text;
    }
    
    public BodyType getType() {
        return this.b;
    }
    
    public void setType(final BodyType type) {
        this.b = type;
    }
    
    public boolean isTruncated() {
        return this.c;
    }
    
    public void setTruncated(final boolean isTruncated) {
        this.c = isTruncated;
    }
}

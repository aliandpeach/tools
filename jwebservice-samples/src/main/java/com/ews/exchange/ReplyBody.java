package com.ews.exchange;

import javax.xml.stream.*;

public class ReplyBody
{
    private String a;
    private String b;
    
    public ReplyBody() {
    }
    
    public ReplyBody(final String message) {
        this.a = message;
    }
    
    public ReplyBody(final String message, final String language) {
        this.a = message;
        this.b = language;
    }
    
    ReplyBody(final XMLStreamReader reader, final String startLocalName) throws XMLStreamException {
        this.a(reader, startLocalName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        this.b = xmlStreamReader.getAttributeValue("xml", "lang");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a(final String s) {
        String string = "";
        if (this.b != null) {
            string = string + " xml:lang=\"" + d.a(this.b) + "\"";
        }
        String s2 = "<t:" + s + string + ">";
        if (this.a != null) {
            s2 = s2 + "<t:Message>" + d.a(this.a) + "</t:Message>";
        }
        return s2 + "</t:" + s + ">";
    }
    
    public String getMessage() {
        return this.a;
    }
    
    public void setMessage(final String message) {
        this.a = message;
    }
    
    public String getLanguage() {
        return this.b;
    }
    
    public void setLanguage(final String language) {
        this.b = language;
    }
}

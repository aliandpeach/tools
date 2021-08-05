package com.ews.exchange;

import javax.xml.stream.*;

public class UserMailbox
{
    private String a;
    private boolean b;
    
    public UserMailbox() {
    }
    
    public UserMailbox(final String id) {
        this.a = id;
    }
    
    public UserMailbox(final String id, final boolean isArchive) {
        this.a = id;
        this.b = isArchive;
    }
    
    UserMailbox(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Id") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else {
                final String elementText;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsArchive") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.b = Boolean.parseBoolean(elementText);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserMailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        final String string = " Id=\"" + d.a(this.a) + "\"";
        String s;
        if (this.b) {
            s = string + " IsArchive=\"true\"";
        }
        else {
            s = string + " IsArchive=\"false\"";
        }
        return "<t:UserMailbox" + s + "/>";
    }
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public boolean isArchive() {
        return this.b;
    }
    
    public void setAsArchive(final boolean isArchive) {
        this.b = isArchive;
    }
}

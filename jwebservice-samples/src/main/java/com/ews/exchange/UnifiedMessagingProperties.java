package com.ews.exchange;

import javax.xml.stream.*;

public class UnifiedMessagingProperties
{
    private boolean a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    
    public UnifiedMessagingProperties() {
    }
    
    UnifiedMessagingProperties(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("OofStatus") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Boolean.parseBoolean(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MissedCallNotificationEnabled") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Boolean.parseBoolean(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PlayOnPhoneDialString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TelephoneAccessNumbers") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TelephoneAccessFolderEmail") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.e = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GetUMPropertiesResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public boolean isOutOfOfficeEnabled() {
        return this.a;
    }
    
    public boolean isMissedCallNotificationEnabled() {
        return this.b;
    }
    
    public String getPlayOnPhoneDialString() {
        return this.c;
    }
    
    public String getTelephoneAccessNumbers() {
        return this.d;
    }
    
    public String getTelephoneAccessFolderEmail() {
        return this.e;
    }
}

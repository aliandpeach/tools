package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class UserResponse
{
    private ErrorCode a;
    private String b;
    private String c;
    private List<UserSettingError> d;
    private UserSettingList e;
    
    public UserResponse() {
        this.a = ErrorCode.NO_ERROR;
        this.d = new ArrayList<UserSettingError>();
        this.e = new UserSettingList();
    }
    
    UserResponse(final XMLStreamReader reader) throws XMLStreamException {
        this.a = ErrorCode.NO_ERROR;
        this.d = new ArrayList<UserSettingError>();
        this.e = new UserSettingList();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.a.a(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RedirectTarget") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSettingErrors") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSettingError") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.d.add(new UserSettingError(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSettingErrors") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSettings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSetting") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        this.e.add(new UserSetting(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSettings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/2010/Autodiscover")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public ErrorCode getErrorCode() {
        return this.a;
    }
    
    public String getErrorMessage() {
        return this.b;
    }
    
    public String getRedirectTarget() {
        return this.c;
    }
    
    public List<UserSettingError> getUserSettingErrors() {
        return this.d;
    }
    
    public UserSettingList getUserSettings() {
        return this.e;
    }
}

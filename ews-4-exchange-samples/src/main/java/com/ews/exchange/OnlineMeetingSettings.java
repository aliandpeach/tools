package com.ews.exchange;

import javax.xml.stream.*;

public class OnlineMeetingSettings
{
    private LobbyBypass a;
    private OnlineMeetingAccessLevel b;
    private Presenters c;
    
    public OnlineMeetingSettings() {
        this.a = LobbyBypass.NONE;
        this.b = OnlineMeetingAccessLevel.NONE;
        this.c = Presenters.NONE;
    }
    
    OnlineMeetingSettings(final XMLStreamReader reader) throws XMLStreamException {
        this.a = LobbyBypass.NONE;
        this.b = OnlineMeetingAccessLevel.NONE;
        this.c = Presenters.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        final String attributeValue = xmlStreamReader.getAttributeValue(null, "LobbyBypass");
        final String attributeValue2 = xmlStreamReader.getAttributeValue(null, "AccessLevel");
        final String attributeValue3 = xmlStreamReader.getAttributeValue(null, "Presenters");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.a.j(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.b = com.ews.exchange.a.i(attributeValue2);
        }
        if (attributeValue3 != null && attributeValue3.length() > 0) {
            this.c = com.ews.exchange.a.h(attributeValue3);
        }
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LobbyBypass") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.a.j(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AccessLevel") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = com.ews.exchange.a.i(elementText2);
                }
            }
            else {
                final String elementText3;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Presenters") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = com.ews.exchange.a.h(elementText3);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("OnlineMeetingSettings") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:OnlineMeetingSettings>";
        if (this.a != LobbyBypass.NONE) {
            final LobbyBypass a;
            s = s + "<t:LobbyBypass>" + (((a = this.a) == LobbyBypass.DISABLED) ? "Disabled" : ((a == LobbyBypass.ENABLED_FOR_GATEWAY_PARTICIPANTS) ? "EnabledForGatewayParticipants" : "None")) + "</t:LobbyBypass>";
        }
        if (this.b != OnlineMeetingAccessLevel.NONE) {
            final OnlineMeetingAccessLevel b;
            s = s + "<t:AccessLevel>" + (((b = this.b) == OnlineMeetingAccessLevel.EVERYONE) ? "Everyone" : ((b == OnlineMeetingAccessLevel.INTERNAL) ? "Internal" : ((b == OnlineMeetingAccessLevel.INVITED) ? "Invited" : ((b == OnlineMeetingAccessLevel.LOCKED) ? "Locked" : "None")))) + "</t:AccessLevel>";
        }
        if (this.c != Presenters.NONE) {
            final Presenters c;
            s = s + "<t:Presenters>" + (((c = this.c) == Presenters.DISABLED) ? "Disabled" : ((c == Presenters.INTERNAL) ? "Internal" : ((c == Presenters.EVERYONE) ? "Everyone" : "None"))) + "</t:Presenters>";
        }
        return s + "</t:OnlineMeetingSettings>";
    }
    
    public LobbyBypass getLobbyBypass() {
        return this.a;
    }
    
    public void setLobbyBypass(final LobbyBypass lobbyBypass) {
        this.a = lobbyBypass;
    }
    
    public OnlineMeetingAccessLevel getAccessLevel() {
        return this.b;
    }
    
    public void setAccessLevel(final OnlineMeetingAccessLevel accessLevel) {
        this.b = accessLevel;
    }
    
    public Presenters getPresenters() {
        return this.c;
    }
    
    public void setPresenters(final Presenters presenters) {
        this.c = presenters;
    }
}

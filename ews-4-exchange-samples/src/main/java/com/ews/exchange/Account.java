package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class Account
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ExchangeProtocol g;
    private ExchangeProxyProtocol h;
    private WebProtocol i;
    private Error j;
    
    public Account() {
    }
    
    Account(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AccountType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Action") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RedirectURL") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RedirectAddr") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Image") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.e = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ServiceHome") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.f = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Error") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.j = new Error(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Protocol") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                ProtocolType protocolType = ProtocolType.EXCHANGE;
                AuthenticationPackage authenticationPackage = AuthenticationPackage.NONE;
                String elementText = null;
                String elementText2 = null;
                String elementText3 = null;
                String elementText4 = null;
                String elementText5 = null;
                String elementText6 = null;
                String elementText7 = null;
                String elementText8 = null;
                String elementText9 = null;
                String elementText10 = null;
                boolean b = true;
                String elementText11 = null;
                String elementText12 = null;
                String elementText13 = null;
                String elementText14 = null;
                String elementText15 = null;
                String elementText16 = null;
                String elementText17 = null;
                InternalAccess internalAccess = null;
                ExternalAccess externalAccess = null;
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Type") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        final String elementText18;
                        if ((elementText18 = reader.getElementText()) != null && elementText18.length() > 0) {
                            protocolType = com.ews.exchange.a.b(elementText18);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AuthPackage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        final String elementText19;
                        if ((elementText19 = reader.getElementText()) != null && elementText19.length() > 0) {
                            authenticationPackage = com.ews.exchange.a.c(elementText19);
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Server") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ServerDN") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText2 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ServerVersion") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText3 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AD") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText4 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MdbDN") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText5 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ASUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText6 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EwsUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText7 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UMUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText8 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OOFUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText9 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OABUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText10 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SSL") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        final String lowerCase;
                        if ((lowerCase = reader.getElementText().toLowerCase()).equals("off") || lowerCase.equals("false")) {
                            b = false;
                        }
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText11 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl-um") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText12 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl-aggr") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText13 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl-sms") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText14 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl-mt") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText15 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EcpUrl-ret") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText16 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PublicFolderServer") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        elementText17 = reader.getElementText();
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Internal") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        internalAccess = new InternalAccess(reader);
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("External") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        externalAccess = new ExternalAccess(reader);
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Protocol") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                        break;
                    }
                    reader.next();
                }
                if (protocolType == ProtocolType.EXCHANGE) {
                    (this.g = new ExchangeProtocol()).setAuthenticationPackage(authenticationPackage);
                    this.g.setServer(elementText);
                    this.g.setServerDN(elementText2);
                    this.g.setServerVersion(elementText3);
                    this.g.setActiveDirectory(elementText4);
                    this.g.setMailboxDatabaseLegacyDN(elementText5);
                    this.g.setAvailabilityServiceUrl(elementText6);
                    this.g.setExchangeWebServiceUrl(elementText7);
                    this.g.setUnifiedMessagingServiceUrl(elementText8);
                    this.g.setOutOfOfficeUrl(elementText9);
                    this.g.setOfflineAddressBookUrl(elementText10);
                    this.g.setSslEnabled(b);
                    this.g.setExchangeControlPanelUrl(elementText11);
                    this.g.setExchangeControlPanelUnifiedMessagingUrl(elementText12);
                    this.g.setExchangeControlPanelEmailAggregationUrl(elementText13);
                    this.g.setExchangeControlPanelTextMessagingUrl(elementText14);
                    this.g.setExchangeControlPanelMessageTrackingUrl(elementText15);
                    this.g.setExchangeControlPanelRetentionTagsUrl(elementText16);
                    this.g.setPublicFolderServer(elementText17);
                }
                else if (protocolType == ProtocolType.EXCHANGE_PROXY) {
                    (this.h = new ExchangeProxyProtocol()).setAuthenticationPackage(authenticationPackage);
                    this.h.setServer(elementText);
                    this.h.setServerDN(elementText2);
                    this.h.setServerVersion(elementText3);
                    this.h.setActiveDirectory(elementText4);
                    this.h.setMailboxDatabaseLegacyDN(elementText5);
                    this.h.setAvailabilityServiceUrl(elementText6);
                    this.h.setExchangeWebServiceUrl(elementText7);
                    this.h.setUnifiedMessagingServiceUrl(elementText8);
                    this.h.setOutOfOfficeUrl(elementText9);
                    this.h.setOfflineAddressBookUrl(elementText10);
                    this.h.setSslEnabled(b);
                    this.h.setExchangeControlPanelUrl(elementText11);
                    this.h.setExchangeControlPanelUnifiedMessagingUrl(elementText12);
                    this.h.setExchangeControlPanelEmailAggregationUrl(elementText13);
                    this.h.setExchangeControlPanelTextMessagingUrl(elementText14);
                    this.h.setExchangeControlPanelMessageTrackingUrl(elementText15);
                    this.h.setExchangeControlPanelRetentionTagsUrl(elementText16);
                    this.h.setPublicFolderServer(elementText17);
                }
                else {
                    (this.i = new WebProtocol()).setInternalAccess(internalAccess);
                    this.i.setExternalAccess(externalAccess);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Account") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                break;
            }
            reader.next();
        }
    }
    
    public String getType() {
        return this.a;
    }
    
    public String getAction() {
        return this.b;
    }
    
    public String getRedirectUrl() {
        return this.c;
    }
    
    public String getRedirectEmailAddress() {
        return this.d;
    }
    
    public String getImagePath() {
        return this.e;
    }
    
    public String getServiceHomeUrl() {
        return this.f;
    }
    
    public ExchangeProtocol getExchangeProtocol() {
        return this.g;
    }
    
    public ExchangeProxyProtocol getExchangeProxyProtocol() {
        return this.h;
    }
    
    public WebProtocol getWebProtocol() {
        return this.i;
    }
}

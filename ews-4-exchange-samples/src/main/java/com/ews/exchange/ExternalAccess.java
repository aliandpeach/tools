package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class ExternalAccess
{
    private List<OutlookWebAccessUrl> a;
    private ExchangeProtocol b;
    private ExchangeProxyProtocol c;
    private WebProtocol d;
    
    public ExternalAccess() {
        this.a = new ArrayList<OutlookWebAccessUrl>();
    }
    
    ExternalAccess(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<OutlookWebAccessUrl>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OWAUrl") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.a.add(new OutlookWebAccessUrl(reader));
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
                    (this.b = new ExchangeProtocol()).setAuthenticationPackage(authenticationPackage);
                    this.b.setServer(elementText);
                    this.b.setServerDN(elementText2);
                    this.b.setServerVersion(elementText3);
                    this.b.setActiveDirectory(elementText4);
                    this.b.setMailboxDatabaseLegacyDN(elementText5);
                    this.b.setAvailabilityServiceUrl(elementText6);
                    this.b.setExchangeWebServiceUrl(elementText7);
                    this.b.setUnifiedMessagingServiceUrl(elementText8);
                    this.b.setOutOfOfficeUrl(elementText9);
                    this.b.setOfflineAddressBookUrl(elementText10);
                    this.b.setSslEnabled(b);
                    this.b.setExchangeControlPanelUrl(elementText11);
                    this.b.setExchangeControlPanelUnifiedMessagingUrl(elementText12);
                    this.b.setExchangeControlPanelEmailAggregationUrl(elementText13);
                    this.b.setExchangeControlPanelTextMessagingUrl(elementText14);
                    this.b.setExchangeControlPanelMessageTrackingUrl(elementText15);
                    this.b.setExchangeControlPanelRetentionTagsUrl(elementText16);
                    this.b.setPublicFolderServer(elementText17);
                }
                else if (protocolType == ProtocolType.EXCHANGE_PROXY) {
                    (this.c = new ExchangeProxyProtocol()).setAuthenticationPackage(authenticationPackage);
                    this.c.setServer(elementText);
                    this.c.setServerDN(elementText2);
                    this.c.setServerVersion(elementText3);
                    this.c.setActiveDirectory(elementText4);
                    this.c.setMailboxDatabaseLegacyDN(elementText5);
                    this.c.setAvailabilityServiceUrl(elementText6);
                    this.c.setExchangeWebServiceUrl(elementText7);
                    this.c.setUnifiedMessagingServiceUrl(elementText8);
                    this.c.setOutOfOfficeUrl(elementText9);
                    this.c.setOfflineAddressBookUrl(elementText10);
                    this.c.setSslEnabled(b);
                    this.c.setExchangeControlPanelUrl(elementText11);
                    this.c.setExchangeControlPanelUnifiedMessagingUrl(elementText12);
                    this.c.setExchangeControlPanelEmailAggregationUrl(elementText13);
                    this.c.setExchangeControlPanelTextMessagingUrl(elementText14);
                    this.c.setExchangeControlPanelMessageTrackingUrl(elementText15);
                    this.c.setExchangeControlPanelRetentionTagsUrl(elementText16);
                    this.c.setPublicFolderServer(elementText17);
                }
                else {
                    (this.d = new WebProtocol()).setInternalAccess(internalAccess);
                    this.d.setExternalAccess(externalAccess);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("External") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                break;
            }
            reader.next();
        }
    }
    
    public List<OutlookWebAccessUrl> getOutlookWebAccessUrls() {
        return this.a;
    }
    
    public ExchangeProtocol getExchangeProtocol() {
        return this.b;
    }
    
    public ExchangeProxyProtocol getExchangeProxyProtocol() {
        return this.c;
    }
    
    public WebProtocol getWebProtocol() {
        return this.d;
    }
}

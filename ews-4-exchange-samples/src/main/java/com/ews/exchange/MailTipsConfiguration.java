package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class MailTipsConfiguration
{
    private boolean a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private List<SmtpDomain> f;
    
    private MailTipsConfiguration() {
        this.f = new ArrayList<SmtpDomain>();
    }
    
    MailTipsConfiguration(final XMLStreamReader reader) throws XMLStreamException {
        this.f = new ArrayList<SmtpDomain>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailTipsEnabled") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Boolean.parseBoolean(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MaxRecipientsPerGetMailTipsRequest") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Integer.parseInt(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MaxMessageSize") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = Integer.parseInt(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LargeAudienceThreshold") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.d = Integer.parseInt(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ShowExternalRecipientCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.e = Boolean.parseBoolean(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternalDomains") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Domain") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f.add(new SmtpDomain(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternalDomains") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MailTipsConfiguration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    public boolean isMailTipsEnabled() {
        return this.a;
    }
    
    public int getMaxRecipients() {
        return this.b;
    }
    
    public int getMaxMessageSize() {
        return this.c;
    }
    
    public int getLargeAudienceThreshold() {
        return this.d;
    }
    
    public boolean getShowExternalRecipientCount() {
        return this.e;
    }
    
    public List<SmtpDomain> getInternalDomains() {
        return this.f;
    }
}

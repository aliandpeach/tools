package com.ews.exchange;

import javax.xml.stream.*;

public class UserId
{
    private String a;
    private String b;
    private String c;
    private StandardUser d;
    
    public UserId() {
        this.d = StandardUser.NONE;
    }
    
    public UserId(final String primarySmtpAddress) {
        this.d = StandardUser.NONE;
        this.b = primarySmtpAddress;
    }
    
    public UserId(final String primarySmtpAddress, final String displayName) {
        this.d = StandardUser.NONE;
        this.b = primarySmtpAddress;
        this.c = displayName;
    }
    
    public UserId(final StandardUser standardUser) {
        this.d = StandardUser.NONE;
        this.d = standardUser;
    }
    
    UserId(final XMLStreamReader reader) throws XMLStreamException {
        this.d = StandardUser.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SID") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PrimarySmtpAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else {
                final String elementText;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DistinguishedUser") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.d = ((s = elementText).equals("Default") ? StandardUser.DEFAULT : (s.equals("Anonymous") ? StandardUser.ANONYMOUS : StandardUser.NONE));
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:UserId>";
        if (this.a != null) {
            s = s + "<t:SID>" + com.ews.exchange.d.a(this.a) + "</t:SID>";
        }
        if (this.b != null) {
            s = s + "<t:PrimarySmtpAddress>" + com.ews.exchange.d.a(this.b) + "</t:PrimarySmtpAddress>";
        }
        if (this.c != null) {
            s = s + "<t:DisplayName>" + com.ews.exchange.d.a(this.c) + "</t:DisplayName>";
        }
        if (this.d != StandardUser.NONE) {
            final StandardUser d;
            s = s + "<t:DistinguishedUser>" + (((d = this.d) == StandardUser.DEFAULT) ? "Default" : ((d == StandardUser.ANONYMOUS) ? "Anonymous" : "None")) + "</t:DistinguishedUser>";
        }
        return s + "</t:UserId>";
    }
    
    public String toString() {
        if (this.c != null) {
            return this.c;
        }
        return super.toString();
    }
    
    public String getSid() {
        return this.a;
    }
    
    public void setSid(final String sid) {
        this.a = sid;
    }
    
    public String getPrimarySmtpAddress() {
        return this.b;
    }
    
    public void setPrimarySmtpAddress(final String primarySmtpAddress) {
        this.b = primarySmtpAddress;
    }
    
    public String getDisplayName() {
        return this.c;
    }
    
    public void setDisplayName(final String displayName) {
        this.c = displayName;
    }
    
    public StandardUser getStandardUser() {
        return this.d;
    }
    
    public void setStandardUser(final StandardUser standardUser) {
        this.d = standardUser;
    }
}

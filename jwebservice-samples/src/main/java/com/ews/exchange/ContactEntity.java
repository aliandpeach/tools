package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class ContactEntity
{
    private Position a;
    private String b;
    private String c;
    private String d;
    private List<String> e;
    private List<String> f;
    private List<String> g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    
    public ContactEntity() {
        this.a = Position.OTHER;
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
    }
    
    ContactEntity(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = Position.OTHER;
        this.e = new ArrayList<String>();
        this.f = new ArrayList<String>();
        this.g = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Position") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.a.v(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PersonName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BusinessName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ContactString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Urls") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Url") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Urls") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EmailAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EmailAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EmailAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Addresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Address") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Addresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneNumbers") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String attributeValue = xmlStreamReader.getAttributeValue(null, "Key");
                        final String elementText2 = xmlStreamReader.getElementText();
                        if (attributeValue.equals("AssistantPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.h = elementText2;
                        }
                        else if (attributeValue.equals("BusinessFax") && elementText2 != null && elementText2.length() > 0) {
                            this.i = elementText2;
                        }
                        else if (attributeValue.equals("BusinessPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.j = elementText2;
                        }
                        else if (attributeValue.equals("BusinessPhone2") && elementText2 != null && elementText2.length() > 0) {
                            this.k = elementText2;
                        }
                        else if (attributeValue.equals("Callback") && elementText2 != null && elementText2.length() > 0) {
                            this.l = elementText2;
                        }
                        else if (attributeValue.equals("CarPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.m = elementText2;
                        }
                        else if (attributeValue.equals("CompanyMainPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.n = elementText2;
                        }
                        else if (attributeValue.equals("HomeFax") && elementText2 != null && elementText2.length() > 0) {
                            this.o = elementText2;
                        }
                        else if (attributeValue.equals("HomePhone") && elementText2 != null && elementText2.length() > 0) {
                            this.p = elementText2;
                        }
                        else if (attributeValue.equals("HomePhone2") && elementText2 != null && elementText2.length() > 0) {
                            this.q = elementText2;
                        }
                        else if (attributeValue.equals("Isdn") && elementText2 != null && elementText2.length() > 0) {
                            this.r = elementText2;
                        }
                        else if (attributeValue.equals("MobilePhone") && elementText2 != null && elementText2.length() > 0) {
                            this.s = elementText2;
                        }
                        else if (attributeValue.equals("OtherFax") && elementText2 != null && elementText2.length() > 0) {
                            this.t = elementText2;
                        }
                        else if (attributeValue.equals("OtherTelephone") && elementText2 != null && elementText2.length() > 0) {
                            this.u = elementText2;
                        }
                        else if (attributeValue.equals("Pager") && elementText2 != null && elementText2.length() > 0) {
                            this.v = elementText2;
                        }
                        else if (attributeValue.equals("PrimaryPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.w = elementText2;
                        }
                        else if (attributeValue.equals("RadioPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.x = elementText2;
                        }
                        else if (attributeValue.equals("Telex") && elementText2 != null && elementText2.length() > 0) {
                            this.y = elementText2;
                        }
                        else if (attributeValue.equals("TtyTddPhone") && elementText2 != null && elementText2.length() > 0) {
                            this.z = elementText2;
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneNumbers") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Contact") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public Position getPosition() {
        return this.a;
    }
    
    public String getPersonName() {
        return this.b;
    }
    
    public String getBusinessName() {
        return this.c;
    }
    
    public String getDisplayName() {
        return this.d;
    }
    
    public List<String> getUrls() {
        return this.e;
    }
    
    public List<String> getEmailAddresses() {
        return this.f;
    }
    
    public List<String> getAddresses() {
        return this.g;
    }
    
    public String getAssistantPhone() {
        return this.h;
    }
    
    public String getBusinessFax() {
        return this.i;
    }
    
    public String getBusinessPhone() {
        return this.j;
    }
    
    public String getBusinessPhone2() {
        return this.k;
    }
    
    public String getCallbackPhone() {
        return this.l;
    }
    
    public String getCarPhone() {
        return this.m;
    }
    
    public String getCompanyPhone() {
        return this.n;
    }
    
    public String getHomeFax() {
        return this.o;
    }
    
    public String getHomePhone() {
        return this.p;
    }
    
    public String getHomePhone2() {
        return this.q;
    }
    
    public String getIsdn() {
        return this.r;
    }
    
    public String getMobilePhone() {
        return this.s;
    }
    
    public String getOtherFax() {
        return this.t;
    }
    
    public String getOtherPhone() {
        return this.u;
    }
    
    public String getPager() {
        return this.v;
    }
    
    public String getPrimaryPhone() {
        return this.w;
    }
    
    public String getRadioPhone() {
        return this.x;
    }
    
    public String getTelex() {
        return this.y;
    }
    
    public String getTtyTddPhone() {
        return this.z;
    }
}

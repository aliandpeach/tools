package com.ews.exchange;

import javax.xml.stream.*;

public class PersonaPostalAddress
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private String m;
    private String n;
    private LocationSource o;
    
    public PersonaPostalAddress() {
        this.h = Double.MIN_VALUE;
        this.i = Double.MIN_VALUE;
        this.j = Double.MIN_VALUE;
        this.k = Double.MIN_VALUE;
        this.l = Double.MIN_VALUE;
        this.o = LocationSource.NONE;
    }
    
    PersonaPostalAddress(final XMLStreamReader reader, final String localName) throws XMLStreamException {
        this.h = Double.MIN_VALUE;
        this.i = Double.MIN_VALUE;
        this.j = Double.MIN_VALUE;
        this.k = Double.MIN_VALUE;
        this.l = Double.MIN_VALUE;
        this.o = LocationSource.NONE;
        this.a(reader, localName);
    }
    
    private void a(final XMLStreamReader xmlStreamReader, final String s) throws XMLStreamException {
        while (true) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Street") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("City") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("State") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Country") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostalCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostOfficeBox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Type") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Latitude") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.h = Double.parseDouble(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Longitude") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.i = Double.parseDouble(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Accuracy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.j = Double.parseDouble(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Altitude") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.k = Double.parseDouble(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AltitudeAccuracy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.l = Double.parseDouble(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FormattedAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.m = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LocationUri") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.n = xmlStreamReader.getElementText();
            }
            else {
                final String elementText6;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LocationSource") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    final String s2;
                    this.o = ((s2 = elementText6).equals("Contact") ? LocationSource.CONTACT : (s2.equals("Device") ? LocationSource.DEVICE : (s2.equals("LocationServices") ? LocationSource.LOCATION_SERVICES : (s2.equals("PhonebookServices") ? LocationSource.PHONEBOOK_SERVICES : (s2.equals("Resource") ? LocationSource.RESOURCE : LocationSource.NONE)))));
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals(s) && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getStreet() {
        return this.a;
    }
    
    public void setStreet(final String street) {
        this.a = street;
    }
    
    public String getCity() {
        return this.b;
    }
    
    public void setCity(final String city) {
        this.b = city;
    }
    
    public String getState() {
        return this.c;
    }
    
    public void setState(final String state) {
        this.c = state;
    }
    
    public String getCountry() {
        return this.d;
    }
    
    public void setCountry(final String country) {
        this.d = country;
    }
    
    public String getPostalCode() {
        return this.e;
    }
    
    public void setPostalCode(final String postalCode) {
        this.e = postalCode;
    }
    
    public String getPostOfficeBox() {
        return this.f;
    }
    
    public void setPostOfficeBox(final String postOfficeBox) {
        this.f = postOfficeBox;
    }
    
    public String getType() {
        return this.g;
    }
    
    public void setType(final String type) {
        this.g = type;
    }
    
    public double getLatitude() {
        return this.h;
    }
    
    public void setLatitude(final double latitude) {
        this.h = latitude;
    }
    
    public double getLongitude() {
        return this.i;
    }
    
    public void setLongitude(final double longitude) {
        this.i = longitude;
    }
    
    public double getAccuracy() {
        return this.j;
    }
    
    public void setAccuracy(final double accuracy) {
        this.j = accuracy;
    }
    
    public double getAltitude() {
        return this.k;
    }
    
    public void setAltitude(final double altitude) {
        this.k = altitude;
    }
    
    public double getAltitudeAccuracy() {
        return this.l;
    }
    
    public void setAltitudeAccuracy(final double altitudeAccuracy) {
        this.l = altitudeAccuracy;
    }
    
    public String getFormattedAddress() {
        return this.m;
    }
    
    public void setFormattedAddress(final String formattedAddress) {
        this.m = formattedAddress;
    }
    
    public String getLocationUri() {
        return this.n;
    }
    
    public void setLocationUri(final String locationUri) {
        this.n = locationUri;
    }
    
    public LocationSource getLocationSource() {
        return this.o;
    }
    
    public void setLocationSource(final LocationSource locationSource) {
        this.o = locationSource;
    }
}

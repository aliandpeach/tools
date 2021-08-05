package com.independentsoft.exchange;

public class IndexedPropertyPath extends PropertyPath
{
    private IndexedPropertyPathUri a;
    private String b;
    
    public IndexedPropertyPath() {
        this.a = IndexedPropertyPathUri.STREET;
    }
    
    public IndexedPropertyPath(final IndexedPropertyPathUri uri, final String index) {
        this.a = IndexedPropertyPathUri.STREET;
        this.a = uri;
        this.b = index;
    }
    
    public String toString() {
        final IndexedPropertyPathUri a;
        return "<t:IndexedFieldURI FieldURI=\"" + (((a = this.a) == IndexedPropertyPathUri.CITY) ? "contacts:PhysicalAddress:City" : ((a == IndexedPropertyPathUri.COUNTRY) ? "contacts:PhysicalAddress:CountryOrRegion" : ((a == IndexedPropertyPathUri.EMAIL_ADDRESS) ? "contacts:EmailAddress" : ((a == IndexedPropertyPathUri.INSTANT_MESSENGER_ADDRESS) ? "contacts:ImAddress" : ((a == IndexedPropertyPathUri.INTERNET_MESSAGE_HEADER) ? "item:InternetMessageHeader" : ((a == IndexedPropertyPathUri.PHONE_NUMBER) ? "contacts:PhoneNumber" : ((a == IndexedPropertyPathUri.POSTAL_CODE) ? "contacts:PhysicalAddress:PostalCode" : ((a == IndexedPropertyPathUri.STATE) ? "contacts:PhysicalAddress:State" : "contacts:PhysicalAddress:Street")))))))) + "\" FieldIndex=\"" + this.b + "\" />";
    }
    
    public IndexedPropertyPathUri getUri() {
        return this.a;
    }
    
    public void setUri(final IndexedPropertyPathUri uri) {
        this.a = uri;
    }
    
    public String getIndex() {
        return this.b;
    }
    
    public void setIndex(final String index) {
        this.b = index;
    }
}

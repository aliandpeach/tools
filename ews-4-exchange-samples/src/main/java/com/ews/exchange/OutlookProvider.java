package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class OutlookProvider
{
    private User a;
    private Account b;
    private Error c;
    
    private OutlookProvider() {
    }
    
    OutlookProvider(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext() && reader.next() > 0) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("User") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.a = new User(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Account") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a")) {
                this.b = new Account(reader);
            }
            else {
                if (!reader.isStartElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals("Error") || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006")) {
                    continue;
                }
                this.c = new Error(reader);
            }
        }
    }
    
    public User getUser() {
        return this.a;
    }
    
    public Account getAccount() {
        return this.b;
    }
    
    final Error a() {
        return this.c;
    }
}

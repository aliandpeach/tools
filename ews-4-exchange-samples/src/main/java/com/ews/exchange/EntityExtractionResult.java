package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class EntityExtractionResult
{
    private List<AddressEntity> a;
    private List<MeetingSuggestion> b;
    private List<TaskSuggestion> c;
    private List<EmailAddressEntity> d;
    private List<ContactEntity> e;
    private List<UrlEntity> f;
    private List<PhoneEntity> g;
    
    public EntityExtractionResult() {
        this.a = new ArrayList<AddressEntity>();
        this.b = new ArrayList<MeetingSuggestion>();
        this.c = new ArrayList<TaskSuggestion>();
        this.d = new ArrayList<EmailAddressEntity>();
        this.e = new ArrayList<ContactEntity>();
        this.f = new ArrayList<UrlEntity>();
        this.g = new ArrayList<PhoneEntity>();
    }
    
    EntityExtractionResult(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a = new ArrayList<AddressEntity>();
        this.b = new ArrayList<MeetingSuggestion>();
        this.c = new ArrayList<TaskSuggestion>();
        this.d = new ArrayList<EmailAddressEntity>();
        this.e = new ArrayList<ContactEntity>();
        this.f = new ArrayList<UrlEntity>();
        this.g = new ArrayList<PhoneEntity>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Addresses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AddressEntity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.a.add(new AddressEntity(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Addresses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingSuggestions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingSuggestion") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MeetingSuggestion(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingSuggestions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TaskSuggestions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TaskSuggestion") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new TaskSuggestion(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TaskSuggestions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EmailAddresses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EmailAddressEntity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.d.add(new EmailAddressEntity(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EmailAddresses") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contacts") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contact") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(new ContactEntity(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contacts") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Urls") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UrlEntity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.f.add(new UrlEntity(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Urls") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PhoneNumbers") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Phone") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.g.add(new PhoneEntity(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PhoneNumbers") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EntityExtractionResult") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public List<AddressEntity> getAddresses() {
        return this.a;
    }
    
    public List<MeetingSuggestion> getMeetingSuggestions() {
        return this.b;
    }
    
    public List<TaskSuggestion> getTaskSuggestions() {
        return this.c;
    }
    
    public List<EmailAddressEntity> getEmailAddresses() {
        return this.d;
    }
    
    public List<ContactEntity> getContacts() {
        return this.e;
    }
    
    public List<UrlEntity> getUrls() {
        return this.f;
    }
    
    public List<PhoneEntity> getPhoneNumbers() {
        return this.g;
    }
}

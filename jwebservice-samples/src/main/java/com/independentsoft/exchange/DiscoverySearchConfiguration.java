package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class DiscoverySearchConfiguration
{
    private String a;
    private String b;
    private List<SearchableMailbox> c;
    private String d;
    private String e;
    
    public DiscoverySearchConfiguration() {
        this.c = new ArrayList<SearchableMailbox>();
    }
    
    DiscoverySearchConfiguration(final XMLStreamReader reader) throws XMLStreamException {
        this.c = new ArrayList<SearchableMailbox>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchQuery") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchableMailboxes") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (true) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchableMailbox") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.c.add(new SearchableMailbox(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchableMailboxes") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InPlaceHoldIdentity") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ManagedByOrganization") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = reader.getElementText();
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DiscoverySearchConfiguration") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String getSearchId() {
        return this.a;
    }
    
    public String getSearchQuery() {
        return this.b;
    }
    
    public List<SearchableMailbox> getSearchableMailboxes() {
        return this.c;
    }
    
    public String getInPlaceHoldIdentity() {
        return this.d;
    }
    
    public String getManagedByOrganization() {
        return this.e;
    }
}

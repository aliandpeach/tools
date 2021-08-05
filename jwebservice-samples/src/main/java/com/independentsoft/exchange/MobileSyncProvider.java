package com.independentsoft.exchange;

import javax.xml.stream.*;

public class MobileSyncProvider
{
    private String a;
    private MobileSyncUser b;
    private MobileSyncServer c;
    private MobileSyncError d;
    
    private MobileSyncProvider() {
    }
    
    MobileSyncProvider(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext() && reader.next() > 0) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Culture") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("User") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                this.b = new MobileSyncUser(reader);
            }
            else {
                if (!reader.isStartElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals("Action") || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                    continue;
                }
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Server") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                        this.c = new MobileSyncServer(reader);
                    }
                    else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Error") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                        this.d = new MobileSyncError(reader);
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Action") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006")) {
                        break;
                    }
                    reader.next();
                }
            }
        }
    }
    
    public String getCulture() {
        return this.a;
    }
    
    public MobileSyncUser getUser() {
        return this.b;
    }
    
    public MobileSyncServer getServer() {
        return this.c;
    }
    
    final MobileSyncError a() {
        return this.d;
    }
}

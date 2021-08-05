package com.independentsoft.exchange;

import javax.xml.stream.*;

public class AttachmentId
{
    private String a;
    private String b;
    private String c;
    
    public AttachmentId() {
    }
    
    public AttachmentId(final String id) {
        this.a = id;
    }
    
    public AttachmentId(final String id, final String rootItemId) {
        this.a = id;
        this.b = rootItemId;
    }
    
    public AttachmentId(final String id, final String rootItemId, final String rootItemChangeKey) {
        this.a = id;
        this.b = rootItemId;
        this.c = rootItemChangeKey;
    }
    
    AttachmentId(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.a = xmlStreamReader.getAttributeValue(null, "Id");
        this.b = xmlStreamReader.getAttributeValue(null, "RootItemId");
        this.c = xmlStreamReader.getAttributeValue(null, "RootItemChangeKey");
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("AttachmentId") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        if (this.a != null) {
            return this.a;
        }
        return super.toString();
    }
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public String getRootItemId() {
        return this.b;
    }
    
    public void setRootItemId(final String rootItemId) {
        this.b = rootItemId;
    }
    
    public String getRootItemChangeKey() {
        return this.c;
    }
    
    public void setRootItemChangeKey(final String rootItemChangeKey) {
        this.c = rootItemChangeKey;
    }
}

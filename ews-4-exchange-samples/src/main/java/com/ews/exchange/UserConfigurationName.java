package com.ews.exchange;

import javax.xml.stream.*;

public class UserConfigurationName
{
    private String a;
    private FolderId b;
    
    public UserConfigurationName() {
    }
    
    public UserConfigurationName(final String name, final FolderId folderId) {
        this.a = name;
        this.b = folderId;
    }
    
    UserConfigurationName(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.a = xmlStreamReader.getAttributeValue(null, "Name");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(xmlStreamReader, "FolderId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DistinguishedFolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new StandardFolderId(xmlStreamReader);
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserConfigurationName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        return this.a("t:UserConfigurationName");
    }
    
    final String a(final String s) {
        String string = "";
        if (this.a != null) {
            string = string + " Name=\"" + d.a(this.a) + "\"";
        }
        String s2 = "<" + s + string + ">";
        if (this.b != null) {
            s2 += this.b.a();
        }
        return s2 + "</" + s + ">";
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public FolderId getFolderId() {
        return this.b;
    }
    
    public void setFolderId(final FolderId folderId) {
        this.b = folderId;
    }
}

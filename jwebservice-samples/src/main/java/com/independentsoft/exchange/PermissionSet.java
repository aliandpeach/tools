package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class PermissionSet
{
    private List<Permission> a;
    private List<String> b;
    
    public PermissionSet() {
        this.a = new ArrayList<Permission>();
        this.b = new ArrayList<String>();
    }
    
    PermissionSet(final XMLStreamReader reader) throws XMLStreamException {
        this.a = new ArrayList<Permission>();
        this.b = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Permissions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Permission") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.a.add(new Permission(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Permissions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UnknownEntries") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UnknownEntry") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UnknownEntries") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PermissionSet") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        String s = "<t:PermissionSet>";
        if (this.a != null && this.a.size() > 0) {
            String s2 = s + "<t:Permissions>";
            for (int i = 0; i < this.a.size(); ++i) {
                if (this.a.get(i) != null) {
                    s2 += this.a.get(i).toString();
                }
            }
            s = s2 + "</t:Permissions>";
        }
        if (this.b.size() > 0) {
            String s3 = s + "<t:UnknownEntries>";
            for (int j = 0; j < this.b.size(); ++j) {
                if (this.b.get(j) != null) {
                    s3 = s3 + "<t:UnknownEntry>" + d.a(this.b.get(j)) + "</t:UnknownEntry>";
                }
            }
            s = s3 + "</t:UnknownEntries>";
        }
        return s + "</t:PermissionSet>";
    }
    
    public List<Permission> getPermissions() {
        return this.a;
    }
    
    public List<String> getEntries() {
        return this.b;
    }
}

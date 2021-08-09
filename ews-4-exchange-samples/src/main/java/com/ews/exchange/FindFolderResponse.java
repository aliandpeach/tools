package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class FindFolderResponse extends Response
{
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private List<Folder> l;
    
    private FindFolderResponse() {
        this.l = new ArrayList<Folder>();
    }
    
    FindFolderResponse(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.l = new ArrayList<Folder>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "ResponseClass")) != null && attributeValue.length() > 0) {
            this.a = com.ews.exchange.a.R(attributeValue);
        }
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageText") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ResponseCode") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.b = com.ews.exchange.a.S(reader.getElementText());
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DescriptiveLinkKey") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.e = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageXml") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                this.d = "";
                while (reader.nextTag() > 0) {
                    if (reader.isStartElement()) {
                        this.d = this.d + "<" + reader.getLocalName() + " xmlns=\"" + reader.getNamespaceURI() + "\">";
                        this.d += reader.getElementText();
                        this.d = this.d + "</" + reader.getLocalName() + ">";
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MessageXml") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RootFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                final String attributeValue2 = reader.getAttributeValue(null, "IndexedPagingOffset");
                final String attributeValue3 = reader.getAttributeValue(null, "NumeratorOffset");
                final String attributeValue4 = reader.getAttributeValue(null, "AbsoluteDenominator");
                final String attributeValue5 = reader.getAttributeValue(null, "IncludesLastItemInRange");
                final String attributeValue6 = reader.getAttributeValue(null, "TotalItemsInView");
                if (attributeValue2 != null && attributeValue2.length() > 0) {
                    this.g = Integer.parseInt(attributeValue2);
                }
                if (attributeValue3 != null && attributeValue3.length() > 0) {
                    this.h = Integer.parseInt(attributeValue3);
                }
                if (attributeValue4 != null && attributeValue4.length() > 0) {
                    this.i = Integer.parseInt(attributeValue4);
                }
                if (attributeValue5 != null && attributeValue5.length() > 0) {
                    this.j = Boolean.parseBoolean(attributeValue5);
                }
                if (attributeValue6 != null && attributeValue6.length() > 0) {
                    this.k = Integer.parseInt(attributeValue6);
                }
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Folders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        while (reader.hasNext()) {
                            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Folder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new Folder(reader));
                            }
                            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new CalendarFolder(reader));
                            }
                            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContactsFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new ContactsFolder(reader));
                            }
                            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("TasksFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new TasksFolder(reader));
                            }
                            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SearchFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                this.l.add(new SearchFolder(reader));
                            }
                            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Folders") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                break;
                            }
                            reader.next();
                        }
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RootFolder") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FindFolderResponseMessage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                break;
            }
            reader.next();
        }
    }
    
    public int getIndexedPagingOffset() {
        return this.g;
    }
    
    public int getNumeratorOffset() {
        return this.h;
    }
    
    public int getAbsoluteDenominator() {
        return this.i;
    }
    
    public boolean getIncludesLastItemInRange() {
        return this.j;
    }
    
    public int getTotalItemsInView() {
        return this.k;
    }
    
    public List<Folder> getFolders() {
        return this.l;
    }
}

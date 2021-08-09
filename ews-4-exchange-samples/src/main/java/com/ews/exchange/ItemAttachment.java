package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;

public class ItemAttachment extends Attachment
{
    private Item a;
    
    public ItemAttachment() {
    }
    
    public ItemAttachment(final String name) {
        this.name = name;
    }
    
    public ItemAttachment(final Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null.");
        }
        this.name = item.d;
        this.a = item;
    }
    
    public ItemAttachment(final String name, final Item item) {
        this.name = name;
        this.a = item;
    }
    
    ItemAttachment(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AttachmentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.attachmentId = new AttachmentId(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Name") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.name = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentType = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentId = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentLocation = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Size") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.size = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.lastModifiedTime = d.c(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsInline") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.isInline = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Item") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Item(reader);
                if (this.a.getItemClass() != null && this.a.getItemClass().equals("IPM.Activity")) {
                    this.a = new Journal(this.a);
                }
                else if (this.a.getItemClass() != null && this.a.getItemClass().equals("IPM.StickyNote")) {
                    this.a = new Note(this.a);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Message") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Message(reader);
                if (this.a.getItemClass() != null && this.a.getItemClass().equals("IPM.Activity")) {
                    this.a = new Journal(this.a);
                }
                else if (this.a.getItemClass() != null && this.a.getItemClass().equals("IPM.StickyNote")) {
                    this.a = new Note(this.a);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("CalendarItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Appointment(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Contact") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Contact(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingMessage") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new MeetingMessage(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingRequest") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new MeetingRequest(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingResponse") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new MeetingResponse(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("MeetingCancellation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new MeetingCancellation(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Task") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Task(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("PostItem") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new Post(reader);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemAttachment") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:ItemAttachment>";
        if (this.name != null) {
            s = s + "<t:Name>" + d.a(this.name) + "</t:Name>";
        }
        if (this.contentType != null) {
            s = s + "<t:ContentType>" + d.a(this.contentType) + "</t:ContentType>";
        }
        if (this.contentId != null) {
            s = s + "<t:ContentId>" + d.a(this.contentId) + "</t:ContentId>";
        }
        if (this.contentLocation != null) {
            s = s + "<t:ContentLocation>" + d.a(this.contentLocation) + "</t:ContentLocation>";
        }
        if (this.a != null) {
            s += this.a.a();
        }
        return s + "</t:ItemAttachment>";
    }
    
    public String toString() {
        if (this.name != null) {
            return this.name;
        }
        return super.toString();
    }
    
    public Item getItem() {
        return this.a;
    }
    
    public void setItem(final Item item) {
        this.a = item;
    }
}

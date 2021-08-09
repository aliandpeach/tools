package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class Group
{
    private String a;
    private List<Item> b;
    
    private Group() {
        this.b = new ArrayList<Item>();
    }
    
    Group(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.b = new ArrayList<Item>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Items") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Item") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final Item item;
                        if ((item = new Item(xmlStreamReader)).getItemClass() != null && item.getItemClass().equals("IPM.Activity")) {
                            this.b.add(new Journal(item));
                        }
                        else if (item.getItemClass() != null && item.getItemClass().equals("IPM.StickyNote")) {
                            this.b.add(new Note(item));
                        }
                        else {
                            this.b.add(item);
                        }
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final Message message;
                        if ((message = new Message(xmlStreamReader)).getItemClass() != null && message.getItemClass().equals("IPM.Activity")) {
                            this.b.add(new Journal(message));
                        }
                        else if (message.getItemClass() != null && message.getItemClass().equals("IPM.StickyNote")) {
                            this.b.add(new Note(message));
                        }
                        else {
                            this.b.add(message);
                        }
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CalendarItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new Appointment(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Contact") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new Contact(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DistributionList") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new DistributionList(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MeetingMessage(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingRequest") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MeetingRequest(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MeetingResponse(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingCancellation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new MeetingCancellation(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Task") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new Task(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new Post(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyToItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new ReplyItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ForwardItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new ForwardItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReplyAllToItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new ReplyAllItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AcceptItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new AcceptItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TentativelyAcceptItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new TentativelyAcceptItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DeclineItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new DeclineItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CancelCalendarItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new CancelItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RemoveItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new RemoveItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SuppressReadReceipt") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new SuppressReadReceipt(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostReplyItem") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new PostReplyItem(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AcceptSharingInvitation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new AcceptSharingInvitation(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Items") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupedItems") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getIndex() {
        return this.a;
    }
    
    public List<Item> getItems() {
        return this.b;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class GroupAttendeeConflict extends AttendeeConflict
{
    private int a;
    private int b;
    private int c;
    private int d;
    
    public GroupAttendeeConflict() {
    }
    
    GroupAttendeeConflict(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NumberOfMembers") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NumberOfMembersAvailable") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Integer.parseInt(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NumberOfMembersWithConflict") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.c = Integer.parseInt(elementText3);
                }
            }
            else {
                final String elementText4;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NumberOfMembersWithNoData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.d = Integer.parseInt(elementText4);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("GroupAttendeeConflictData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public int getNumberOfMembers() {
        return this.a;
    }
    
    public int getNumberOfMembersAvailable() {
        return this.b;
    }
    
    public int getNumberOfMembersWithConflict() {
        return this.c;
    }
    
    public int getNumberOfMembersWithNoData() {
        return this.d;
    }
}

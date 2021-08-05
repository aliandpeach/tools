package com.independentsoft.exchange;

import javax.xml.stream.*;

public class IndividualAttendeeConflict extends AttendeeConflict
{
    private LegacyFreeBusy a;
    
    public IndividualAttendeeConflict() {
        this.a = LegacyFreeBusy.NONE;
    }
    
    IndividualAttendeeConflict(final XMLStreamReader reader) throws XMLStreamException {
        this.a = LegacyFreeBusy.NONE;
        while (reader.hasNext()) {
            final String elementText;
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BusyType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText = reader.getElementText()) != null && elementText.length() > 0) {
                this.a = com.independentsoft.exchange.a.I(elementText);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IndividualAttendeeConflictData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public LegacyFreeBusy getBusyType() {
        return this.a;
    }
}

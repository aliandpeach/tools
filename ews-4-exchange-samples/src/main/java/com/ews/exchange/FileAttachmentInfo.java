package com.ews.exchange;

import java.text.*;
import javax.xml.stream.*;

public class FileAttachmentInfo extends AttachmentInfo
{
    private boolean i;
    
    public FileAttachmentInfo() {
    }
    
    FileAttachmentInfo(final XMLStreamReader reader) throws ParseException, XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AttachmentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getAttributeValue(null, "Id");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Name") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Size") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.f = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.g = com.ews.exchange.d.c(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsInline") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.h = Boolean.parseBoolean(elementText3);
                }
            }
            else {
                final String elementText4;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsContactPhoto") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.i = Boolean.parseBoolean(elementText4);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FileAttachment") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String toString() {
        if (this.b != null) {
            return this.b;
        }
        return super.toString();
    }
    
    public boolean isContactPhoto() {
        return this.i;
    }
    
    public void setContactPhoto(final boolean isContactPhoto) {
        this.i = isContactPhoto;
    }
}

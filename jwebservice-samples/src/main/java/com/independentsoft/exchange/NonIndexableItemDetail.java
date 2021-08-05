package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class NonIndexableItemDetail
{
    private ItemId a;
    private ItemIndexError b;
    private String c;
    private boolean d;
    private boolean e;
    private String f;
    private int g;
    private Date h;
    private String i;
    
    public NonIndexableItemDetail() {
        this.b = ItemIndexError.NONE;
    }
    
    NonIndexableItemDetail(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.b = ItemIndexError.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (true) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ItemId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(reader, "ItemId");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ErrorCode") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.b = ((s = elementText).equals("GenericError") ? ItemIndexError.GENERIC_ERROR : (s.equals("Timeout") ? ItemIndexError.TIMEOUT : (s.equals("StaleEvent") ? ItemIndexError.STALE_EVENT : (s.equals("MailboxOffline") ? ItemIndexError.MAILBOX_OFFLINE : (s.equals("AttachmentLimitReached") ? ItemIndexError.ATTACHMENT_LIMIT_REACHED : (s.equals("MarsWriterTruncation") ? ItemIndexError.MARS_WRITER_TRUNCATION : (s.equals("DocumentParserFailure") ? ItemIndexError.DOCUMENT_PARSER_FAILURE : ItemIndexError.NONE)))))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ErrorDescription") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsPartiallyIndexed") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.d = Boolean.parseBoolean(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsPermanentFailure") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.e = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("SortValue") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AttemptCount") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.g = Integer.parseInt(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastAttemptTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.h = com.independentsoft.exchange.d.c(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AdditionalInfo") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.i = reader.getElementText();
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("NonIndexableItemDetail") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public ItemIndexError getErrorCode() {
        return this.b;
    }
    
    public String getErrorDescription() {
        return this.c;
    }
    
    public boolean isPartiallyIndexed() {
        return this.d;
    }
    
    public boolean isPermanentFailure() {
        return this.e;
    }
    
    public String getSortValue() {
        return this.f;
    }
    
    public int getAttemptCount() {
        return this.g;
    }
    
    public Date getLastAttemptTime() {
        return this.h;
    }
    
    public String getAdditionalInfo() {
        return this.i;
    }
}

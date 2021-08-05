package com.independentsoft.exchange;

import javax.xml.stream.*;

public class AlternateId extends SourceId
{
    private IdFormat a;
    private String b;
    private String c;
    private String d;
    private String e;
    
    public AlternateId() {
        this.a = IdFormat.ENTRY_ID;
    }
    
    public AlternateId(final IdFormat format, final String id, final String mailbox) {
        this.a = IdFormat.ENTRY_ID;
        this.a = format;
        this.b = id;
        this.e = mailbox;
    }
    
    AlternateId(final XMLStreamReader reader) throws XMLStreamException {
        this.a = IdFormat.ENTRY_ID;
        this.b = reader.getAttributeValue(null, "Id");
        this.d = reader.getAttributeValue(null, "ItemId");
        this.c = reader.getAttributeValue(null, "FolderId");
        this.e = reader.getAttributeValue(null, "Mailbox");
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "Format")) != null && attributeValue.length() > 0) {
            final String s;
            this.a = ((s = attributeValue).equals("EntryId") ? IdFormat.ENTRY_ID : (s.equals("EwsId") ? IdFormat.EWS_ID : (s.equals("EwsLegacyId") ? IdFormat.EWS_LEGACY_ID : (s.equals("HexEntryId") ? IdFormat.HEX_ENTRY_ID : (s.equals("OwaId") ? IdFormat.OWA_ID : IdFormat.STORE_ID)))));
        }
        while (reader.hasNext() && (!reader.isEndElement() || reader.getLocalName() == null || reader.getNamespaceURI() == null || !reader.getLocalName().equals("AlternateId") || !reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages"))) {
            reader.next();
        }
    }
    
    final String a() {
        String s = "" + " Format=\"" + com.independentsoft.exchange.a.a(this.a) + "\"";
        if (this.b != null) {
            s = s + " Id=\"" + com.independentsoft.exchange.d.a(this.b) + "\"";
        }
        if (this.e != null) {
            s = s + " Mailbox=\"" + com.independentsoft.exchange.d.a(this.e) + "\"";
        }
        return "<t:AlternateId" + s + "/>";
    }
    
    public IdFormat getFormat() {
        return this.a;
    }
    
    public void setFormat(final IdFormat format) {
        this.a = format;
    }
    
    public String getId() {
        return this.b;
    }
    
    public void setId(final String id) {
        this.b = id;
    }
    
    public String getFolderId() {
        return this.c;
    }
    
    public String getItemId() {
        return this.d;
    }
    
    public String getMailbox() {
        return this.e;
    }
    
    public void setMailbox(final String mailbox) {
        this.e = mailbox;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;
import java.nio.charset.*;
import java.nio.*;

public class MimeContent
{
    private String a;
    private String b;
    
    public MimeContent() {
        this.b = "UTF-8";
    }
    
    public MimeContent(final String text) {
        this.b = "UTF-8";
        this.a = text;
    }
    
    public MimeContent(final String text, final String characterSet) {
        this.b = "UTF-8";
        this.a = text;
        this.b = characterSet;
    }
    
    MimeContent(final XMLStreamReader reader) throws XMLStreamException {
        this.b = "UTF-8";
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        this.b = xmlStreamReader.getAttributeValue(null, "CharacterSet");
        final String elementText;
        if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
            if (this.b == null) {
                this.b = "UTF-8";
            }
            this.a = Charset.forName(this.b).decode(ByteBuffer.wrap(d.e(elementText))).toString();
        }
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("MimeContent") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types"))) {
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        if (this.b == null) {
            this.b = "UTF-8";
        }
        final ByteBuffer encode;
        final byte[] array = new byte[(encode = Charset.forName(this.b).encode(this.a)).limit()];
        System.arraycopy(encode.array(), 0, array, 0, array.length);
        final String a = d.a(array);
        String string = "";
        if (this.b != null) {
            string = string + " CharacterSet=\"" + d.a(this.b) + "\"";
        }
        return "<t:MimeContent" + string + ">" + a + "</t:MimeContent>";
    }
    
    public String getText() {
        return this.a;
    }
    
    public void setText(final String text) {
        this.a = text;
    }
    
    public String getCharacterSet() {
        return this.b;
    }
    
    public void setCharacterSet(final String characterSet) {
        this.b = characterSet;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;

public class RulePredicateSizeRange
{
    private int a;
    private int b;
    
    public RulePredicateSizeRange() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }
    
    RulePredicateSizeRange(final XMLStreamReader reader) throws XMLStreamException {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MinimumSize") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else {
                final String elementText2;
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MaximumSize") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.b = Integer.parseInt(elementText2);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WithinSizeRange") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:WithinSizeRange>";
        if (this.a > Integer.MIN_VALUE) {
            s = s + "<t:MinimumSize>" + this.a + "</t:MinimumSize>";
        }
        if (this.b > Integer.MIN_VALUE) {
            s = s + "<t:MaximumSize>" + this.b + "</t:MaximumSize>";
        }
        return s + "</t:WithinSizeRange>";
    }
    
    public int getMinimumSize() {
        return this.a;
    }
    
    public void setMinimumSize(final int minimumSize) {
        this.a = minimumSize;
    }
    
    public int geMaximumSize() {
        return this.b;
    }
    
    public void setMaximumSize(final int maximumSize) {
        this.b = maximumSize;
    }
}

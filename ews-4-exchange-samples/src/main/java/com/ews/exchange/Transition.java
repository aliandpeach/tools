package com.ews.exchange;

import javax.xml.stream.*;

public class Transition
{
    TransitionTarget a;
    String b;
    
    public Transition() {
        this.a = TransitionTarget.PERIOD;
    }
    
    Transition(final XMLStreamReader reader) throws XMLStreamException {
        this.a = TransitionTarget.PERIOD;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("To") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String attributeValue;
                if ((attributeValue = xmlStreamReader.getAttributeValue(null, "Kind")) != null && attributeValue.length() > 0) {
                    this.a = com.ews.exchange.a.f(attributeValue);
                }
                this.b = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Transition") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String s = "<t:Transition>" + "<t:To Kind=\"" + com.ews.exchange.a.a(this.a) + "\">";
        if (this.b != null) {
            s += d.a(this.b);
        }
        return s + "</t:To>" + "</t:Transition>";
    }
    
    public TransitionTarget getTarget() {
        return this.a;
    }
    
    public void setTarget(final TransitionTarget target) {
        this.a = target;
    }
    
    public String getTargetDescription() {
        return this.b;
    }
    
    public void setTargetDescription(final String targetDescription) {
        this.b = targetDescription;
    }
}

package com.ews.exchange;

import javax.xml.stream.*;

public class ProtectionRule
{
    private String a;
    private boolean b;
    private int c;
    private ProtectionRuleAction d;
    
    private ProtectionRule() {
    }
    
    ProtectionRule(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        this.a = reader.getAttributeValue(null, "Name");
        final String attributeValue = reader.getAttributeValue(null, "UserOverridable");
        final String attributeValue2 = reader.getAttributeValue(null, "Priority");
        if (attributeValue != null && attributeValue.length() > 0) {
            this.b = Boolean.parseBoolean(attributeValue);
        }
        if (attributeValue2 != null && attributeValue2.length() > 0) {
            this.c = Integer.parseInt(attributeValue2);
        }
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Action") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new ProtectionRuleAction(reader);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Rule") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public String getName() {
        return this.a;
    }
    
    public boolean isUserOverridable() {
        return this.b;
    }
    
    public int getPriority() {
        return this.c;
    }
    
    public ProtectionRuleAction getAction() {
        return this.d;
    }
}

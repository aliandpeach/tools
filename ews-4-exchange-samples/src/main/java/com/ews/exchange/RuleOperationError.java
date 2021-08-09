package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;

public class RuleOperationError
{
    private int a;
    private List<RuleValidationError> b;
    
    public RuleOperationError() {
        this.b = new ArrayList<RuleValidationError>();
    }
    
    RuleOperationError(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<RuleValidationError>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("OperationIndex") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ValidationErrors") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Error") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.b.add(new RuleValidationError(reader));
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ValidationErrors") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RuleOperationError") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public int getOperationIndex() {
        return this.a;
    }
    
    public List<RuleValidationError> getValidationErrors() {
        return this.b;
    }
}

package com.independentsoft.exchange;

import javax.xml.stream.*;

public class InvalidRecipient
{
    private String a;
    private InvalidRecipientResponseCode b;
    private String c;
    
    InvalidRecipient() {
        this.b = InvalidRecipientResponseCode.RECIPIENT_ORGANIZATION_NOT_FEDERATED;
    }
    
    InvalidRecipient(final XMLStreamReader reader) throws XMLStreamException {
        this.b = InvalidRecipientResponseCode.RECIPIENT_ORGANIZATION_NOT_FEDERATED;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SmtpAddress") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sender") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.b = ((s = elementText).equals("CannotObtainTokenFromSTS") ? InvalidRecipientResponseCode.CANNOT_OBTAIN_TOKEN_FROM_STS : (s.equals("RecipientOrganizationNotFederated") ? InvalidRecipientResponseCode.RECIPIENT_ORGANIZATION_NOT_FEDERATED : InvalidRecipientResponseCode.SYSTEM_POLICY_BLOCKS_SHARING_WITH_THIS_RECIPIENT));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageText") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InvalidRecipient") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String getSmtpAddress() {
        return this.a;
    }
    
    public InvalidRecipientResponseCode getResponseCode() {
        return this.b;
    }
    
    public String getMessageText() {
        return this.c;
    }
}

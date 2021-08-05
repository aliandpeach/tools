package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class RecipientTrackingEvent
{
    private Date a;
    private Mailbox b;
    private MessageTrackingDeliveryStatus c;
    private MessageTrackingEventDescription d;
    private List<String> e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    
    RecipientTrackingEvent() {
        this.c = MessageTrackingDeliveryStatus.UNSUCCESSFUL;
        this.d = MessageTrackingEventDescription.DELIVERED;
        this.e = new ArrayList<String>();
    }
    
    RecipientTrackingEvent(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.c = MessageTrackingDeliveryStatus.UNSUCCESSFUL;
        this.d = MessageTrackingEventDescription.DELIVERED;
        this.e = new ArrayList<String>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Date") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.a = com.ews.exchange.d.c(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Recipient") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new Mailbox(reader, "Recipient");
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DeliveryStatus") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    final String s;
                    this.c = ((s = elementText2).equals("Unsuccessful") ? MessageTrackingDeliveryStatus.UNSUCCESSFUL : (s.equals("Pending") ? MessageTrackingDeliveryStatus.PENDING : (s.equals("Delivered") ? MessageTrackingDeliveryStatus.DELIVERED : (s.equals("Transferred") ? MessageTrackingDeliveryStatus.TRANSFERRED : MessageTrackingDeliveryStatus.READ))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EventDescription") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    final String s2;
                    this.d = ((s2 = elementText3).equals("DelayedAfterTransferToPartnerOrg") ? MessageTrackingEventDescription.DELAYED_AFTER_TRANSFER_TO_PARTNER_ORG : (s2.equals("Delivered") ? MessageTrackingEventDescription.DELIVERED : (s2.equals("Expanded") ? MessageTrackingEventDescription.EXPANDED : (s2.equals("FailedGeneral") ? MessageTrackingEventDescription.FAILED_GENERAL : (s2.equals("FailedModeration") ? MessageTrackingEventDescription.FAILED_MODERATION : (s2.equals("FailedTransportRules") ? MessageTrackingEventDescription.FAILED_TRANSPORT_RULES : (s2.equals("Forwarded") ? MessageTrackingEventDescription.FORWARDED : (s2.equals("MessageDefer") ? MessageTrackingEventDescription.MESSAGE_DEFER : (s2.equals("MovedToFolderByInboxRule") ? MessageTrackingEventDescription.MOVED_TO_FOLDER_BY_INBOX_RULE : (s2.equals("NotRead") ? MessageTrackingEventDescription.NOT_READ : (s2.equals("Pending") ? MessageTrackingEventDescription.PENDING : (s2.equals("PendingModeration") ? MessageTrackingEventDescription.PENDING_MODERATION : (s2.equals("QueueRetry") ? MessageTrackingEventDescription.QUEUE_RETRY : (s2.equals("QueueRetryNoRetryTime") ? MessageTrackingEventDescription.QUEUE_RETRY_NO_RETRY_TIME : (s2.equals("Read") ? MessageTrackingEventDescription.READ : (s2.equals("Resolved") ? MessageTrackingEventDescription.RESOLVED : (s2.equals("RulesCc") ? MessageTrackingEventDescription.RULES_CC : (s2.equals("SmtpReceive") ? MessageTrackingEventDescription.SMTP_RECEIVE : (s2.equals("SmtpSend") ? MessageTrackingEventDescription.SMTP_SEND : (s2.equals("SmtpSendCrossForest") ? MessageTrackingEventDescription.SMTP_SEND_CROSS_FOREST : (s2.equals("SmtpSendCrossSite") ? MessageTrackingEventDescription.SMTP_SEND_CROSS_SITE : (s2.equals("Submitted") ? MessageTrackingEventDescription.SUBMITTED : (s2.equals("TransferredToForeignOrg") ? MessageTrackingEventDescription.TRANSFERRED_TO_FOREIGN_ORG : (s2.equals("TransferredToLegacyExchangeServer") ? MessageTrackingEventDescription.TRANSFERRED_TO_LEGACY_EXCHANGE_SERVER : MessageTrackingEventDescription.TRANSFERRED_TO_PARTNER_ORG))))))))))))))))))))))));
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EventData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (reader.hasNext()) {
                    if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("String") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.e.add(reader.getElementText());
                    }
                    if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("EventData") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    reader.next();
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Server") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.f = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("InternalId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("BccRecipient") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.h = Boolean.parseBoolean(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("HiddenRecipient") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.i = Boolean.parseBoolean(elementText5);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("UniquePathId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.j = reader.getElementText();
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RecipientTrackingEvent") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    public Date getDate() {
        return this.a;
    }
    
    public Mailbox getRecipient() {
        return this.b;
    }
    
    public MessageTrackingDeliveryStatus getDeliveryStatus() {
        return this.c;
    }
    
    public MessageTrackingEventDescription getEventDescription() {
        return this.d;
    }
    
    public List<String> getEventData() {
        return this.e;
    }
    
    public String getServer() {
        return this.f;
    }
    
    public String getInternalId() {
        return this.g;
    }
    
    public boolean getBccRecipient() {
        return this.h;
    }
    
    public boolean getHiddenRecipient() {
        return this.i;
    }
    
    public String getUniquePathId() {
        return this.j;
    }
}

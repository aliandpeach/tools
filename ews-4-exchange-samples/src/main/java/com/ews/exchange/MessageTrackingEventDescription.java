package com.ews.exchange;

public enum MessageTrackingEventDescription
{
    SUBMITTED, 
    RESOLVED, 
    EXPANDED, 
    DELIVERED, 
    MOVED_TO_FOLDER_BY_INBOX_RULE, 
    RULES_CC, 
    FAILED_GENERAL, 
    FAILED_MODERATION, 
    FAILED_TRANSPORT_RULES, 
    SMTP_SEND, 
    SMTP_SEND_CROSS_SITE, 
    SMTP_SEND_CROSS_FOREST, 
    SMTP_RECEIVE, 
    FORWARDED, 
    PENDING, 
    PENDING_MODERATION, 
    QUEUE_RETRY, 
    QUEUE_RETRY_NO_RETRY_TIME, 
    MESSAGE_DEFER, 
    TRANSFERRED_TO_FOREIGN_ORG, 
    TRANSFERRED_TO_PARTNER_ORG, 
    TRANSFERRED_TO_LEGACY_EXCHANGE_SERVER, 
    DELAYED_AFTER_TRANSFER_TO_PARTNER_ORG, 
    READ, 
    NOT_READ;
}

package com.independentsoft.exchange;

public enum ItemIndexError
{
    NONE, 
    GENERIC_ERROR, 
    TIMEOUT, 
    STALE_EVENT, 
    MAILBOX_OFFLINE, 
    ATTACHMENT_LIMIT_REACHED, 
    MARS_WRITER_TRUNCATION, 
    DOCUMENT_PARSER_FAILURE;
}

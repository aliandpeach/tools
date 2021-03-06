package com.ews.exchange;

public enum ResponseCode
{
    NO_ERROR, 
    ERROR_ACCESS_DENIED, 
    ERROR_ACCESS_MODE_SPECIFIED, 
    ERROR_ACCOUNT_DISABLED, 
    ERROR_ADD_DELEGATES_FAILED, 
    ERROR_ADDRESS_SPACE_NOT_FOUND, 
    ERROR_ADOPERATION, 
    ERROR_ADSESSION_FILTER, 
    ERROR_ADUNAVAILABLE, 
    ERROR_AUTO_DISCOVER_FAILED, 
    ERROR_AFFECTED_TASK_OCCURRENCES_REQUIRED, 
    ERROR_ATTACHMENT_NEST_LEVEL_LIMIT_EXCEEDED, 
    ERROR_ATTACHMENT_SIZE_LIMIT_EXCEEDED, 
    ERROR_ARCHIVE_FOLDER_PATH_CREATION, 
    ERROR_ARCHIVE_MAILBOX_NOT_ENABLED, 
    ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED, 
    ERROR_AVAILABILITY_CONFIG_NOT_FOUND, 
    ERROR_BATCH_PROCESSING_STOPPED, 
    ERROR_CALENDAR_CANNOT_MOVE_OR_COPY_OCCURRENCE, 
    ERROR_CALENDAR_CANNOT_UPDATE_DELETED_ITEM, 
    ERROR_CALENDAR_CANNOT_USE_ID_FOR_OCCURRENCE_ID, 
    ERROR_CALENDAR_CANNOT_USE_ID_FOR_RECURRING_MASTER_ID, 
    ERROR_CALENDAR_DURATION_IS_TOO_LONG, 
    ERROR_CALENDAR_END_DATE_IS_EARLIER_THAN_START_DATE, 
    ERROR_CALENDAR_FOLDER_IS_INVALID_FOR_CALENDAR_VIEW, 
    ERROR_CALENDAR_INVALID_ATTRIBUTE_VALUE, 
    ERROR_CALENDAR_INVALID_DAY_FOR_TIME_CHANGE_PATTERN, 
    ERROR_CALENDAR_INVALID_DAY_FOR_WEEKLY_RECURRENCE, 
    ERROR_CALENDAR_INVALID_PROPERTY_STATE, 
    ERROR_CALENDAR_INVALID_PROPERTY_VALUE, 
    ERROR_CALENDAR_INVALID_RECURRENCE, 
    ERROR_CALENDAR_INVALID_TIME_ZONE, 
    ERROR_CALENDAR_IS_CANCELLED_FOR_ACCEPT, 
    ERROR_CALENDAR_IS_CANCELLED_FOR_DECLINE, 
    ERROR_CALENDAR_IS_CANCELLED_FOR_REMOVE, 
    ERROR_CALENDAR_IS_CANCELLED_FOR_TENTATIVE, 
    ERROR_CALENDAR_IS_DELEGATED_FOR_ACCEPT, 
    ERROR_CALENDAR_IS_DELEGATED_FOR_DECLINE, 
    ERROR_CALENDAR_IS_DELEGATED_FOR_REMOVE, 
    ERROR_CALENDAR_IS_DELEGATED_FOR_TENTATIVE, 
    ERROR_CALENDAR_IS_NOT_ORGANIZER, 
    ERROR_CALENDAR_IS_ORGANIZER_FOR_ACCEPT, 
    ERROR_CALENDAR_IS_ORGANIZER_FOR_DECLINE, 
    ERROR_CALENDAR_IS_ORGANIZER_FOR_REMOVE, 
    ERROR_CALENDAR_IS_ORGANIZER_FOR_TENTATIVE, 
    ERROR_CALENDAR_OCCURRENCE_INDEX_IS_OUT_OF_RECURRENCE_RANGE, 
    ERROR_CALENDAR_OCCURRENCE_IS_DELETED_FROM_RECURRENCE, 
    ERROR_CALENDAR_OUT_OF_RANGE, 
    ERROR_CALENDAR_MEETING_REQUEST_IS_OUT_OF_DATE, 
    ERROR_CALENDAR_VIEW_RANGE_TOO_BIG, 
    ERROR_CALLER_IS_INVALID_AD_ACCOUNT, 
    ERROR_CANNOT_ARCHIVE_CALENDAR_CONTACT_TASK_FOLDER_EXCEPTION, 
    ERROR_CANNOT_ARCHIVE_ITEMS_IN_PUBLIC_FOLDERS, 
    ERROR_CANNOT_ARCHIVE_ITEMS_IN_ARCHIVE_MAILBOX, 
    ERROR_CANNOT_CREATE_CALENDAR_ITEM_IN_NON_CALENDAR_FOLDER, 
    ERROR_CANNOT_CREATE_CONTACT_IN_NON_CONTACT_FOLDER, 
    ERROR_CANNOT_CREATE_POST_ITEM_IN_NON_MAIL_FOLDER, 
    ERROR_CANNOT_CREATE_TASK_IN_NON_TASK_FOLDER, 
    ERROR_CANNOT_DELETE_OBJECT, 
    ERROR_CANNOT_DISABLE_MANDATORY_EXTENSION, 
    ERROR_CANNOT_GET_SOURCE_FOLDER_PATH, 
    ERROR_CANNOT_GET_EXTERNAL_ECP_URL, 
    ERROR_CANNOT_OPEN_FILE_ATTACHMENT, 
    ERROR_CANNOT_DELETE_TASK_OCCURRENCE, 
    ERROR_CANNOT_EMPTY_FOLDER, 
    ERROR_CANNOT_SET_CALENDAR_PERMISSION_ON_NON_CALENDAR_FOLDER, 
    ERROR_CANNOT_SET_NON_CALENDAR_PERMISSION_ON_CALENDAR_FOLDER, 
    ERROR_CANNOT_SET_PERMISSION_UNKNOWN_ENTRIES, 
    ERROR_CANNOT_SPECIFY_SEARCH_FOLDER_AS_SOURCE_FOLDER, 
    ERROR_CANNOT_USE_FOLDER_ID_FOR_ITEM_ID, 
    ERROR_CANNOT_USE_ITEM_ID_FOR_FOLDER_ID, 
    ERROR_CHANGE_KEY_REQUIRED, 
    ERROR_CHANGE_KEY_REQUIRED_FOR_WRITE_OPERATIONS, 
    ERROR_CLIENT_DISCONNECTED, 
    ERROR_CLIENT_INTENT_INVALID_STATE_DEFINITION, 
    ERROR_CLIENT_INTENT_NO_FOUND, 
    ERROR_CONNECTION_FAILED, 
    ERROR_CONTAINS_FILTER_WRONG_TYPE, 
    ERROR_CONTENT_CONVERSION_FAILED, 
    ERROR_CONTENT_INDEXING_NOT_ENABLED, 
    ERROR_CORRUPT_DATA, 
    ERROR_CREATE_ITEM_ACCESS_DENIED, 
    ERROR_CREATE_MANAGED_FOLDER_PARTIAL_COMPLETION, 
    ERROR_CREATE_SUBFOLDER_ACCESS_DENIED, 
    ERROR_CROSS_MAILBOX_MOVE_COPY, 
    ERROR_CROSS_SITE_REQUEST, 
    ERROR_DATA_SIZE_LIMIT_EXCEEDED, 
    ERROR_DATA_SOURCE_OPERATION, 
    ERROR_DELEGATE_ALREADY_EXISTS, 
    ERROR_DELEGATE_CANNOT_ADD_OWNER, 
    ERROR_DELEGATE_MISSING_CONFIGURATION, 
    ERROR_DELEGATE_NO_USER, 
    ERROR_DELEGATE_VALIDATION_FAILED, 
    ERROR_DELETE_DISTINGUISHED_FOLDER, 
    ERROR_DELETE_ITEMS_FAILED, 
    ERROR_DELETE_UNIFIED_MESSAGING_PROMPT_FAILED, 
    ERROR_DISTINGUISHED_USER_NOT_SUPPORTED, 
    ERROR_DISTRIBUTION_LIST_MEMBER_NOT_EXIST, 
    ERROR_DUPLICATE_INPUT_FOLDER_NAMES, 
    ERROR_DUPLICATE_USER_IDS_SPECIFIED, 
    ERROR_EMAIL_ADDRESS_MISMATCH, 
    ERROR_EVENT_NOT_FOUND, 
    ERROR_EXCEEDED_CONNECTION_COUNT, 
    ERROR_EXCEEDED_SUBSCRIPTION_COUNT, 
    ERROR_EXCEEDED_FIND_COUNT_LIMIT, 
    ERROR_EXPIRED_SUBSCRIPTION, 
    ERROR_EXTENSION_NOT_FOUND, 
    ERROR_FOLDER_CORRUPT, 
    ERROR_FOLDER_NOT_FOUND, 
    ERROR_FOLDER_PROPERT_REQUEST_FAILED, 
    ERROR_FOLDER_SAVE, 
    ERROR_FOLDER_SAVE_FAILED, 
    ERROR_FOLDER_SAVE_PROPERTY_ERROR, 
    ERROR_FOLDER_EXISTS, 
    ERROR_FREE_BUSY_GENERATION_FAILED, 
    ERROR_GET_SERVER_SECURITY_DESCRIPTOR_FAILED, 
    ERROR_IM_CONTACT_LIMIT_REACHED, 
    ERROR_IM_GROUP_DISPLAY_NAME_ALREADY_EXISTS, 
    ERROR_IM_GROUP_LIMIT_REACHED, 
    ERROR_IMPERSONATE_USER_DENIED, 
    ERROR_IMPERSONATION_DENIED, 
    ERROR_IMPERSONATION_FAILED, 
    ERROR_INCORRECT_SCHEMA_VERSION, 
    ERROR_INCORRECT_UPDATE_PROPERTY_COUNT, 
    ERROR_INDIVIDUAL_MAILBOX_LIMIT_REACHED, 
    ERROR_INSUFFICIENT_RESOURCES, 
    ERROR_INTERNAL_SERVER_ERROR, 
    ERROR_INTERNAL_SERVER_TRANSIENT_ERROR, 
    ERROR_INVALID_ACCESS_LEVEL, 
    ERROR_INVALID_ARGUMENT, 
    ERROR_INVALID_ATTACHMENT_ID, 
    ERROR_INVALID_ATTACHMENT_SUBFILTER, 
    ERROR_INVALID_ATTACHMENT_SUBFILTER_TEXT_FILTER, 
    ERROR_INVALID_AUTHORIZATION_CONTEXT, 
    ERROR_INVALID_CHANGE_KEY, 
    ERROR_INVALID_CLIENT_SECURITY_CONTEXT, 
    ERROR_INVALID_COMPLETE_DATE, 
    ERROR_INVALID_CONTACT_EMAIL_ADDRESS, 
    ERROR_INVALID_CONTACT_EMAIL_INDEX, 
    ERROR_INVALID_CROSS_FOREST_CREDENTIALS, 
    ERROR_INVALID_DELEGATE_PERMISSION, 
    ERROR_INVALID_DELEGATE_USER_ID, 
    ERROR_INVALID_EXCLUDES_RESTRICTION, 
    ERROR_INVALID_EXPRESSION_TYPE_FOR_SUB_FILTER, 
    ERROR_INVALID_EXTENDED_PROPERTY, 
    ERROR_INVALID_EXTENDED_PROPERTY_VALUE, 
    ERROR_INVALID_FOLDER_ID, 
    ERROR_INVALID_FOLDER_TYPE_FOR_OPERATION, 
    ERROR_INVALID_FRACTIONAL_PAGING_PARAMETERS, 
    ERROR_INVALID_FREE_BUSY_VIEW_TYPE, 
    ERROR_INVALID_ID, 
    ERROR_INVALID_ID_EMPTY, 
    ERROR_INVALID_ID_MALFORMED, 
    ERROR_INVALID_ID_MALFORMED_EWS_LEGACY_ID_FORMAT, 
    ERROR_INVALID_ID_MONIKER_TOO_LONG, 
    ERROR_INVALID_ID_NOT_AN_ITEM_ATTACHMENT_ID, 
    ERROR_INVALID_ID_RETURNED_BY_RESOLVE_NAMES, 
    ERROR_INVALID_ID_STORE_OBJECT_ID_TOO_LONG, 
    ERROR_INVALID_ID_TOO_MANY_ATTACHMENT_LEVELS, 
    ERROR_INVALID_ID_XML, 
    ERROR_INVALID_IM_CONTACT_ID, 
    ERROR_INVALID_IM_DISTRIBUTION_GROUP_SMTP_ADDRESS, 
    ERROR_INVALID_IM_GROUP_ID, 
    ERROR_INVALID_INDEXED_PAGING_PARAMETERS, 
    ERROR_INVALID_INTERNET_HEADER_CHILD_NODES, 
    ERROR_INVALID_ITEM_FOR_OPERATION_ARCHIVE_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM_ATTACHMENT, 
    ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_ACCEPT_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_DECLINE_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_CANCEL_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_EXPAND_DL, 
    ERROR_INVALID_ITEM_FOR_OPERATION_REMOVE_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_SEND_ITEM, 
    ERROR_INVALID_ITEM_FOR_OPERATION_TENTATIVE, 
    ERROR_INVALID_LOGON_TYPE, 
    ERROR_INVALID_MAILBOX, 
    ERROR_INVALID_MANAGED_FOLDER_PROPERTY, 
    ERROR_INVALID_MANAGED_FOLDER_QUOTA, 
    ERROR_INVALID_MANAGED_FOLDER_SIZE, 
    ERROR_INVALID_MERGED_FREE_BUSY_INTERVAL, 
    ERROR_INVALID_NAME_FOR_NAME_RESOLUTION, 
    ERROR_INVALID_OPERATION, 
    ERROR_INVALID_NETWORK_SERVICE_CONTEXT, 
    ERROR_INVALID_OOF_PARAMETER, 
    ERROR_INVALID_PAGING_MAX_ROWS, 
    ERROR_INVALID_PARENT_FOLDER, 
    ERROR_INVALID_PERCENT_COMPLETE_VALUE, 
    ERROR_INVALID_PERMISSION_SETTINGS, 
    ERROR_INVALID_PHONE_CALL_ID, 
    ERROR_INVALID_PHONE_NUMBER, 
    ERROR_INVALID_USER_INFO, 
    ERROR_INVALID_PROPERTY_APPEND, 
    ERROR_INVALID_PROPERTY_DELETE, 
    ERROR_INVALID_PROPERTY_FOR_EXISTS, 
    ERROR_INVALID_PROPERTY_FOR_OPERATION, 
    ERROR_INVALID_PROPERTY_REQUEST, 
    ERROR_INVALID_PROPERTY_SET, 
    ERROR_INVALID_PROPERTY_UPDATE_SENT_MESSAGE, 
    ERROR_INVALID_PROXY_SECURITY_CONTEXT, 
    ERROR_INVALID_PULL_SUBSCRIPTION_ID, 
    ERROR_INVALID_PUSH_SUBSCRIPTION_URL, 
    ERROR_INVALID_RECIPIENTS, 
    ERROR_INVALID_RECIPIENT_SUBFILTER, 
    ERROR_INVALID_RECIPIENT_SUBFILTER_COMPARISON, 
    ERROR_INVALID_RECIPIENT_SUBFILTER_ORDER, 
    ERROR_INVALID_RECIPIENT_SUBFILTER_TEXT_FILTER, 
    ERROR_INVALID_REFERENCE_ITEM, 
    ERROR_INVALID_REQUEST, 
    ERROR_INVALID_RESTRICTION, 
    ERROR_INVALID_RETENTION_TAG_TYPE_MISMATCH, 
    ERROR_INVALID_RETENTION_TAG_INVISIBLE, 
    ERROR_INVALID_RETENTION_TAG_INHERITANCE, 
    ERROR_INVALID_RETENTION_TAG_ID_GUID, 
    ERROR_INVALID_ROUTING_TYPE, 
    ERROR_INVALID_SCHEDULED_OOF_DURATION, 
    ERROR_INVALID_SECURITY_DESCRIPTOR, 
    ERROR_INVALID_SEND_ITEM_SAVE_SETTINGS, 
    ERROR_INVALID_SERIALIZED_ACCESS_TOKEN, 
    ERROR_INVALID_SERVER_VERSION, 
    ERROR_INVALID_SID, 
    ERROR_INVALID_SIP_URI, 
    ERROR_INVALID_SMTP_ADDRESS, 
    ERROR_INVALID_SUBFILTER_TYPE, 
    ERROR_INVALID_SUBFILTER_TYPE_NOT_ATTENDEE_TYPE, 
    ERROR_INVALID_SUBFILTER_TYPE_NOT_RECIPIENT_TYPE, 
    ERROR_INVALID_SUBSCRIPTION, 
    ERROR_INVALID_SUBSCRIPTION_REQUEST, 
    ERROR_INVALID_SYNC_STATE_DATA, 
    ERROR_INVALID_TIME_INTERVAL, 
    ERROR_INVALID_USER_OOF_SETTINGS, 
    ERROR_INVALID_USER_PRINCIPAL_NAME, 
    ERROR_INVALID_USER_SID, 
    ERROR_INVALID_USER_SID_MISSING_UPN, 
    ERROR_INVALID_VALUE_FOR_PROPERTY, 
    ERROR_INVALID_WATERMARK, 
    ERROR_IP_GATEWAY_NO_FOUND, 
    ERROR_IRRESOLVABLE_CONFLICT, 
    ERROR_ITEM_CORRUPT, 
    ERROR_ITEM_NOT_FOUND, 
    ERROR_ITEM_PROPERTY_REQUEST_FAILED, 
    ERROR_ITEM_SAVE, 
    ERROR_ITEM_SAVE_PROPERTY_ERROR, 
    ERROR_LEGACY_MAILBOX_FREE_BUSY_VIEW_TYPE_NOT_MERGED, 
    ERROR_LOCAL_SERVER_OBJECT_NOT_FOUND, 
    ERROR_LOGON_AS_NETWORK_SERVICE_FAILED, 
    ERROR_MAILBOX_CONFIGURATION, 
    ERROR_MAILBOX_DATA_ARRAY_EMPTY, 
    ERROR_MAILBOX_DATA_ARRAY_TOO_BIG, 
    ERROR_MAILBOX_HOLD_NOT_FOUND, 
    ERROR_MAILBOX_LOGON_FAILED, 
    ERROR_MAILBOX_MOVE_IN_PROGRESS, 
    ERROR_MAILBOX_STORE_UNAVAILABLE, 
    ERROR_MAIL_RECIPIENT_NOT_FOUND, 
    ERROR_MAIL_TIPS_DISABLED, 
    ERROR_MANAGED_FOLDER_ALREADY_EXISTS, 
    ERROR_MANAGED_FOLDER_NOT_FOUND, 
    ERROR_MANAGED_FOLDERS_ROOT_FAILURE, 
    ERROR_MEETING_SUGGESTION_GENERATION_FAILED, 
    ERROR_MESSAGE_DISPOSITION_REQUIRED, 
    ERROR_MESSAGE_SIZE_EXCEEDED, 
    ERROR_MIME_CONTENT_CONVERSION_FAILED, 
    ERROR_MIME_CONTENT_INVALID, 
    ERROR_MIME_CONTENT_INVALID_BASE64_STRING, 
    ERROR_MISSING_ARGUMENT, 
    ERROR_MISSING_EMAIL_ADDRESS, 
    ERROR_MISSING_EMAIL_ADDRESS_FOR_MANAGED_FOLDER, 
    ERROR_MISSING_INFORMATION_EMAIL_ADDRESS, 
    ERROR_MISSING_INFORMATION_REFERENCE_ITEM_ID, 
    ERROR_MISSING_ITEM_FOR_CREATE_ITEM_ATTACHMENT, 
    ERROR_MISSING_MANAGED_FOLDER_ID, 
    ERROR_MISSING_RECIPIENTS, 
    ERROR_MISSING_USER_ID_INFORMATION, 
    ERROR_MORE_THAN_ONE_ACCESS_MODE_SPECIFIED, 
    ERROR_MOVE_COPY_FAILED, 
    ERROR_MOVE_DISTINGUISHED_FOLDER, 
    ERROR_MULTI_LEGACY_MAILBOX_ACCESS, 
    ERROR_NAME_RESOLUTION_MULTIPLE_RESULTS, 
    ERROR_NAME_RESOLUTION_NO_MAILBOX, 
    ERROR_NAME_RESOLUTION_NO_RESULTS, 
    ERROR_NO_CALENDAR, 
    ERROR_NO_DESTINATION_CASDUE_TO_KERBEROS_REQUIREMENTS, 
    ERROR_NO_DESTINATION_CASDUE_TO_SSLREQUIREMENTS, 
    ERROR_NO_DESTINATION_CASDUE_TO_VERSION_MISMATCH, 
    ERROR_NO_FOLDER_CLASS_OVERRIDE, 
    ERROR_NO_FREE_BUSY_ACCESS, 
    ERROR_NON_EXISTENT_MAILBOX, 
    ERROR_NON_PRIMARY_SMTP_ADDRESS, 
    ERROR_NO_PROPERTY_TAG_FOR_CUSTOM_PROPERTIES, 
    ERROR_NO_PUBLIC_FOLDER_REPLICA_AVAILABLE, 
    ERROR_NO_PUBLIC_FOLDER_SERVER_AVAILABLE, 
    ERROR_NO_RESPONDING_CASIN_DESTINATION_SITE, 
    ERROR_NOT_DELEGATE, 
    ERROR_NOT_ENOUGH_MEMORY, 
    ERROR_OBJECT_TYPE_CHANGED, 
    ERROR_OCCURRENCE_CROSSING_BOUNDARY, 
    ERROR_OCCURRENCE_TIME_SPAN_TOO_BIG, 
    ERROR_OPERATION_NOT_ALLOWED_WITH_PUBLIC_FOLDER_ROOT, 
    ERROR_PARENT_FOLDER_ID_REQUIRED, 
    ERROR_PARENT_FOLDER_NOT_FOUND, 
    ERROR_PASSWORD_CHANGE_REQUIRED, 
    ERROR_PASSWORD_EXPIRED, 
    ERROR_PHONE_NUMBER_NOT_DIALABLE, 
    ERROR_PROPERTY_UPDATE, 
    ERROR_PROMPT_PUBLISHING_OPERATION_FAILED, 
    ERROR_PROPERTY_VALIDATION_FAILURE, 
    ERROR_PROXIED_SUBSCRIPTION_CALL_FAILURE, 
    ERROR_PROXY_CALL_FAILED, 
    ERROR_PROXY_GROUP_SID_LIMIT_EXCEEDED, 
    ERROR_PROXY_REQUEST_NOT_ALLOWED, 
    ERROR_PROXY_REQUEST_PROCESSING_FAILED, 
    ERROR_PROXY_TOKEN_EXPIRED, 
    ERROR_PUBLIC_FOLDER_MAILBOX_DISCOVERY_FAILED, 
    ERROR_PUBLIC_FOLDER_OPERATION_FAILED, 
    ERROR_PUBLIC_FOLDER_REQUEST_PROCESSING_FAILED, 
    ERROR_PUBLIC_FOLDER_SERVER_NOT_FOUND, 
    ERROR_PUBLIC_FOLDER_SYNC_EXCEPTION, 
    ERROR_QUERY_FILTER_TOO_LONG, 
    ERROR_QUOTA_EXCEEDED, 
    ERROR_READ_EVENTS_FAILED, 
    ERROR_READ_RECEIPT_NOT_PENDING, 
    ERROR_RECURRENCE_END_DATE_TOO_BIG, 
    ERROR_RECURRENCE_HAS_NO_OCCURRENCE, 
    ERROR_REMOVE_DELEGATES_FAILED, 
    ERROR_REQUEST_ABORTED, 
    ERROR_REQUEST_STREAM_TOO_BIG, 
    ERROR_REQUIRED_PROPERTY_MISSING, 
    ERROR_RESOLVE_NAMES_INVALID_FOLDER_TYPE, 
    ERROR_RESOLVE_NAMES_ONLY_ONE_CONTACTS_FOLDER_ALLOWED, 
    ERROR_RESPONSE_SCHEMA_VALIDATION, 
    ERROR_RESTRICTION_TOO_LONG, 
    ERROR_RESTRICTION_TOO_COMPLEX, 
    ERROR_RESULT_SET_TOO_BIG, 
    ERROR_INVALID_EXCHANGE_IMPERSONATION_HEADER_DATA, 
    ERROR_SAVED_ITEM_FOLDER_NOT_FOUND, 
    ERROR_SCHEMA_VALIDATION, 
    ERROR_SEARCH_FOLDER_NOT_INITIALIZED, 
    ERROR_SEND_AS_DENIED, 
    ERROR_SEND_MEETING_CANCELLATIONS_REQUIRED, 
    ERROR_SEND_MEETING_INVITATIONS_OR_CANCELLATIONS_REQUIRED, 
    ERROR_SEND_MEETING_INVITATIONS_REQUIRED, 
    ERROR_SENT_MEETING_REQUEST_UPDATE, 
    ERROR_SENT_TASK_REQUEST_UPDATE, 
    ERROR_SERVER_BUSY, 
    ERROR_SERVICE_DISCOVERY_FAILED, 
    ERROR_STALE_OBJECT, 
    ERROR_SUBMISSION_QUOTA_EXCEEDED, 
    ERROR_SUBSCRIPTION_ACCESS_DENIED, 
    ERROR_SUBSCRIPTION_DELEGATE_ACCESS_NOT_SUPPORTED, 
    ERROR_SUBSCRIPTION_NOT_FOUND, 
    ERROR_SUBSCRIPTION_UNSUBSCRIBED, 
    ERROR_SYNC_FOLDER_NOT_FOUND, 
    ERROR_TEAM_MAILBOX_NOT_FOUND, 
    ERROR_TEAM_MAILBOX_NOT_LINKED_TO_SHARE_POINT, 
    ERROR_TEAM_MAILBOX_URL_VALIDATION_FAILED, 
    ERROR_TEAM_MAILBOX_NOT_AUTHORIZED_OWNER, 
    ERROR_TEAM_MAILBOX_ACTIVE_TO_PENDING_DELETE, 
    ERROR_TEAM_MAILBOX_FAILED_SENDING_NOTIFICATIONS, 
    ERROR_TEAM_MAILBOX_ERROR_UNKNOWN, 
    ERROR_TIME_INTERVAL_TOO_BIG, 
    ERROR_TIMEOUT_EXPIRED, 
    ERROR_TO_FOLDER_NOT_FOUND, 
    ERROR_TOKEN_SERIALIZATION_DENIED, 
    ERROR_UPDATE_PROPERTY_MISMATCH, 
    ERROR_UNIFIED_MESSAGING_DIAL_PLAN_NOT_FOUND, 
    ERROR_UNIFIED_MESSAGING_REPORT_DATA_NOT_FOUND, 
    ERROR_UNIFIED_MESSAGING_PROMPT_NOT_FOUND, 
    ERROR_UNIFIED_MESSAGING_REQUEST_FAILED, 
    ERROR_UNIFIED_MESSAGING_SERVER_NOT_FOUND, 
    ERROR_UNABLE_TO_GET_USER_OOF_SETTINGS, 
    ERROR_UNABLE_TO_REMOVE_IM_CONTACT_FROM_GROUP, 
    ERROR_UNSUPPORTED_SUB_FILTER, 
    ERROR_UNSUPPORTED_CULTURE, 
    ERROR_UNSUPPORTED_MAPI_PROPERTY_TYPE, 
    ERROR_UNSUPPORTED_MIME_CONVERSION, 
    ERROR_UNSUPPORTED_PATH_FOR_QUERY, 
    ERROR_UNSUPPORTED_PATH_FOR_SORT_GROUP, 
    ERROR_UNSUPPORTED_PROPERTY_DEFINITION, 
    ERROR_UNSUPPORTED_QUERY_FILTER, 
    ERROR_UNSUPPORTED_RECURRENCE, 
    ERROR_UNSUPPORTED_TYPE_FOR_CONVERSION, 
    ERROR_UPDATE_DELEGATES_FAILED, 
    ERROR_USER_NOT_UNIFIED_MESSAGING_ENABLED, 
    ERROR_VOICE_MAIL_NOT_IMPLEMENTED, 
    ERROR_VALUE_OUT_OF_RANGE, 
    ERROR_VIRUS_DETECTED, 
    ERROR_VIRUS_MESSAGE_DELETED, 
    ERROR_WEB_REQUEST_IN_INVALID_STATE, 
    ERROR_WIN32_INTEROP_ERROR, 
    ERROR_WORKING_HOURS_SAVE_FAILED, 
    ERROR_WORKING_HOURS_XML_MALFORMED, 
    ERROR_WRONG_SERVER_VERSION, 
    ERROR_WRONG_SERVER_VERSION_DELEGATE, 
    ERROR_MISSING_INFORMATION_SHARING_FOLDER_ID, 
    ERROR_DUPLICATE_SOAP_HEADER, 
    ERROR_SHARING_SYNCHRONIZATION_FAILED, 
    ERROR_SHARING_NO_EXTERNAL_EWS_AVAILABLE, 
    ERROR_FREE_BUSY_DL_LIMIT_REACHED, 
    ERROR_INVALID_GET_SHARING_FOLDER_REQUEST, 
    ERROR_NOT_ALLOWED_EXTERNAL_SHARING_BY_POLICY, 
    ERROR_USER_NOT_ALLOWED_BY_POLICY, 
    ERROR_PERMISSION_NOT_ALLOWED_BY_POLICY, 
    ERROR_ORGANIZATIONAL_NOT_FEDERATED, 
    ERROR_MAILBOX_FAILOVER, 
    ERROR_INVALID_EXTERNAL_SHARING_INITIATOR, 
    ERROR_MESSAGE_TRACKING_PERMANENT_ERROR, 
    ERROR_MESSAGE_TRACKING_TRANSIENT_ERROR, 
    ERROR_MESSAGE_TRACKING_NO_SUCH_DOMAIN, 
    ERROR_USER_WITHOUT_FEDERATED_PROXY_ADDRESS, 
    ERROR_INVALID_ORGANIZATION_RELATIONSHIP_FOR_FREE_BUSY, 
    ERROR_INVALID_FEDERATED_ORGANIZATION_ID, 
    ERROR_INVALID_EXTERNAL_SHARING_SUBSCRIBER, 
    ERROR_INVALID_SHARING_DATA, 
    ERROR_INVALID_SHARING_MESSAGE, 
    ERROR_NOT_SUPPORTED_SHARING_MESSAGE, 
    ERROR_APPLY_CONVERSATION_ACTION_FAILED, 
    ERROR_INBOX_RULES_VALIDATION_ERROR, 
    ERROR_OUTLOOK_RULE_BLOB_EXISTS, 
    ERROR_RULES_OVER_QUOTA, 
    ERROR_NEW_EVENT_STREAM_CONNECTION_OPENED, 
    ERROR_MISSED_NOTIFICATION_EVENTS, 
    ERROR_DUPLICATE_LEGACY_DISTINGUISHED_NAME, 
    ERROR_INVALID_CLIENT_ACCESS_TOKEN_REQUEST, 
    ERROR_NO_SPEECH_DETECTED, 
    ERROR_UM_SERVER_UNAVAILABLE, 
    ERROR_RECIPIENT_NOT_FOUND, 
    ERROR_RECOGNIZER_NOT_INSTALLED, 
    ERROR_SPEECH_GRAMMAR_ERROR, 
    ERROR_INVALID_MANAGEMENT_ROLE_HEADER, 
    ERROR_LOCATION_SERVICES_DISABLED, 
    ERROR_LOCATION_SERVICES_REQUEST_TIMED_OUT, 
    ERROR_LOCATION_SERVICES_REQUEST_FAILED, 
    ERROR_LOCATION_SERVICES_INVALID_REQUEST, 
    ERROR_MAILBOX_SCOPE_NOT_ALLOWED_WITHOUT_QUERY_STRING, 
    ERROR_ARCHIVE_MAILBOX_SEARCH_FAILED, 
    ERROR_INVALID_PHOTO_SIZE, 
    ERROR_SEARCH_QUERY_HAS_TOO_MANY_KEYWORDS, 
    ERROR_SEARCH_TOO_MANY_MAILBOXES, 
    ERROR_INVALID_RETENTION_TAG_NONE, 
    ERROR_DISCOVERY_SEARCHES_DISABLED;
}

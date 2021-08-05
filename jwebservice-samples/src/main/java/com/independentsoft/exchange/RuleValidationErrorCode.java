package com.independentsoft.exchange;

public enum RuleValidationErrorCode
{
    AD_OPERATION_FAILURE, 
    CONNECTED_ACCOUNT_NOT_FOUND, 
    CREATE_WITH_RULE_ID, 
    EMPTY_VALUE_FOUND, 
    DUPLICATED_PRIORITY, 
    DUPLICATED_OPERATION_ON_THE_SAME_RULE, 
    FOLDER_DOES_NOT_EXIST, 
    INVALID_ADDRESS, 
    INVALID_DATE_RANGE, 
    INVALID_FOLDER_ID, 
    INVALID_SIZE_RANGE, 
    INVALID_VALUE, 
    MESSAGE_CLASSIFICATION_NOT_FOUND, 
    MISSING_ACTION, 
    MISSING_PARAMETER, 
    MISSING_RANGE_VALUE, 
    NOT_SETTABLE, 
    RECIPIENT_DOES_NOT_EXIST, 
    RULE_NOT_FOUND, 
    SIZE_LESS_THEN_ZERO, 
    STRING_VALUE_TOO_BIG, 
    UNSUPPORTED_ADDRESS, 
    UNEXPECTED_ERROR, 
    UNSUPPORTED_RULE;
}

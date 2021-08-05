package com.independentsoft.exchange;

public enum RetentionAction
{
    MOVE_TO_DELETED_ITEMS, 
    MOVE_TO_FOLDER, 
    DELETE_AND_ALLOW_RECOVERY, 
    PERMANENTLY_DELETE, 
    MARK_AS_PAST_RETENTION_LIMIT, 
    MOVE_TO_ARCHIVE, 
    NONE;
}

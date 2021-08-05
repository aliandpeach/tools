package com.independentsoft.exchange;

import java.util.*;

public class FolderPropertyPath
{
    public static final UnindexedPropertyPath FOLDER_ID;
    public static final UnindexedPropertyPath PARENT_ID;
    public static final UnindexedPropertyPath FOLDER_CLASS;
    public static final UnindexedPropertyPath DISPLAY_NAME;
    public static final UnindexedPropertyPath MANAGED_FOLDER_INFORMATION;
    public static final UnindexedPropertyPath EFFECTIVE_RIGHTS;
    public static final UnindexedPropertyPath PERMISSION_SET;
    public static final UnindexedPropertyPath DISTINGUISHED_FOLDER_ID;
    public static final UnindexedPropertyPath RETENTION_TAG;
    public static final UnindexedPropertyPath ARCHIVE_TAG;
    public static final UnindexedPropertyPath TOTAL_COUNT;
    public static final UnindexedPropertyPath CHILD_FOLDER_COUNT;
    public static final PropertyTag UNREAD_COUNT;
    public static final PropertyTag COMMENT;
    public static final PropertyTag ENTRY_ID;
    public static final PropertyTag CREATION_TIME;
    public static final PropertyTag LAST_MODIFIED_TIME;
    public static final PropertyTag SIZE;
    public static final PropertyTag IS_HIDDEN;
    public static final PropertyTag IS_READ_ONLY;
    public static final PropertyTag IS_SYSTEM;
    public static final PropertyTag HAS_SUB_FOLDERS;
    public static final PropertyTag SEARCH_KEY;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list;
        (list = new ArrayList<PropertyPath>()).add(FolderPropertyPath.FOLDER_ID);
        list.add(FolderPropertyPath.PARENT_ID);
        list.add(FolderPropertyPath.FOLDER_CLASS);
        list.add(FolderPropertyPath.DISPLAY_NAME);
        list.add(FolderPropertyPath.MANAGED_FOLDER_INFORMATION);
        list.add(FolderPropertyPath.EFFECTIVE_RIGHTS);
        list.add(FolderPropertyPath.PERMISSION_SET);
        list.add(FolderPropertyPath.DISTINGUISHED_FOLDER_ID);
        list.add(FolderPropertyPath.RETENTION_TAG);
        list.add(FolderPropertyPath.ARCHIVE_TAG);
        list.add(FolderPropertyPath.TOTAL_COUNT);
        list.add(FolderPropertyPath.CHILD_FOLDER_COUNT);
        list.add(FolderPropertyPath.UNREAD_COUNT);
        list.add(FolderPropertyPath.COMMENT);
        list.add(FolderPropertyPath.ENTRY_ID);
        list.add(FolderPropertyPath.CREATION_TIME);
        list.add(FolderPropertyPath.LAST_MODIFIED_TIME);
        list.add(FolderPropertyPath.SIZE);
        list.add(FolderPropertyPath.IS_HIDDEN);
        list.add(FolderPropertyPath.IS_READ_ONLY);
        list.add(FolderPropertyPath.IS_SYSTEM);
        list.add(FolderPropertyPath.HAS_SUB_FOLDERS);
        list.add(FolderPropertyPath.SEARCH_KEY);
        return (List<PropertyPath>)list;
    }
    
    static {
        FOLDER_ID = new UnindexedPropertyPath("folder:FolderId");
        PARENT_ID = new UnindexedPropertyPath("folder:ParentFolderId");
        FOLDER_CLASS = new UnindexedPropertyPath("folder:FolderClass");
        DISPLAY_NAME = new UnindexedPropertyPath("folder:DisplayName");
        MANAGED_FOLDER_INFORMATION = new UnindexedPropertyPath("folder:ManagedFolderInformation");
        EFFECTIVE_RIGHTS = new UnindexedPropertyPath("folder:EffectiveRights");
        PERMISSION_SET = new UnindexedPropertyPath("folder:PermissionSet");
        DISTINGUISHED_FOLDER_ID = new UnindexedPropertyPath("folder:DistinguishedFolderId");
        RETENTION_TAG = new UnindexedPropertyPath("folder:PolicyTag");
        ARCHIVE_TAG = new UnindexedPropertyPath("folder:ArchiveTag");
        TOTAL_COUNT = new UnindexedPropertyPath("folder:TotalCount");
        CHILD_FOLDER_COUNT = new UnindexedPropertyPath("folder:ChildFolderCount");
        UNREAD_COUNT = MapiPropertyTag.PR_CONTENT_UNREAD;
        COMMENT = MapiPropertyTag.PR_COMMENT;
        ENTRY_ID = MapiPropertyTag.PR_ENTRYID;
        CREATION_TIME = MapiPropertyTag.PR_CREATION_TIME;
        LAST_MODIFIED_TIME = MapiPropertyTag.PR_LAST_MODIFICATION_TIME;
        SIZE = MapiPropertyTag.PR_MESSAGE_SIZE_EXTENDED;
        IS_HIDDEN = MapiPropertyTag.PR_ATTR_HIDDEN;
        IS_READ_ONLY = MapiPropertyTag.PR_ATTR_READONLY;
        IS_SYSTEM = MapiPropertyTag.PR_ATTR_SYSTEM;
        HAS_SUB_FOLDERS = MapiPropertyTag.PR_SUBFOLDERS;
        SEARCH_KEY = MapiPropertyTag.PR_SEARCH_KEY;
    }
}

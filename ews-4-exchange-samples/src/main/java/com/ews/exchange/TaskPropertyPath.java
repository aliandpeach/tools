package com.ews.exchange;

import java.util.*;

public class TaskPropertyPath extends ItemPropertyPath
{
    public static final UnindexedPropertyPath ACTUAL_WORK;
    public static final UnindexedPropertyPath ASSIGNED_TIME;
    public static final UnindexedPropertyPath BILLING_INFORMATION;
    public static final UnindexedPropertyPath CHANGE_COUNT;
    public static final UnindexedPropertyPath COMPANIES;
    public static final UnindexedPropertyPath COMPLETE_DATE;
    public static final UnindexedPropertyPath CONTACTS;
    public static final UnindexedPropertyPath DELEGATION_STATE;
    public static final UnindexedPropertyPath DELEGATOR;
    public static final UnindexedPropertyPath DUE_DATE;
    public static final UnindexedPropertyPath IS_ASSIGNMENT_EDITABLE;
    public static final UnindexedPropertyPath MILEAGE;
    public static final UnindexedPropertyPath PERCENT_COMPLETE;
    public static final UnindexedPropertyPath RECURRENCE;
    public static final UnindexedPropertyPath START_DATE;
    public static final UnindexedPropertyPath STATUS;
    public static final UnindexedPropertyPath STATUS_DESCRIPTION;
    public static final UnindexedPropertyPath TOTAL_WORK;
    public static final PropertyId IS_PRIVATE;
    public static final PropertyId COMMON_START_DATE;
    public static final PropertyId COMMON_END_DATE;
    public static final PropertyId REMINDER_OVERRIDE_DEFAULT;
    public static final PropertyId REMINDER_PLAY_SOUND;
    public static final PropertyId REMINDER_SOUND_FILE;
    public static final PropertyId REMINDER_TIME;
    public static final PropertyId OWNER;
    public static final PropertyId IS_TEAM_TASK;
    public static final PropertyId IS_COMPLETE;
    public static final PropertyId IS_RECURRING;
    public static final PropertyTag PRIORITY;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(TaskPropertyPath.REMINDER_DUE_BY);
        list.add(TaskPropertyPath.REMINDER_IS_SET);
        list.add(TaskPropertyPath.ACTUAL_WORK);
        list.add(TaskPropertyPath.ASSIGNED_TIME);
        list.add(TaskPropertyPath.BILLING_INFORMATION);
        list.add(TaskPropertyPath.CHANGE_COUNT);
        list.add(TaskPropertyPath.COMPANIES);
        list.add(TaskPropertyPath.COMPLETE_DATE);
        list.add(TaskPropertyPath.CONTACTS);
        list.add(TaskPropertyPath.DELEGATION_STATE);
        list.add(TaskPropertyPath.DELEGATOR);
        list.add(TaskPropertyPath.DUE_DATE);
        list.add(TaskPropertyPath.IS_ASSIGNMENT_EDITABLE);
        list.add(TaskPropertyPath.MILEAGE);
        list.add(TaskPropertyPath.PERCENT_COMPLETE);
        list.add(TaskPropertyPath.RECURRENCE);
        list.add(TaskPropertyPath.START_DATE);
        list.add(TaskPropertyPath.STATUS);
        list.add(TaskPropertyPath.STATUS_DESCRIPTION);
        list.add(TaskPropertyPath.TOTAL_WORK);
        list.add(TaskPropertyPath.IS_PRIVATE);
        list.add(TaskPropertyPath.COMMON_START_DATE);
        list.add(TaskPropertyPath.COMMON_END_DATE);
        list.add(TaskPropertyPath.REMINDER_OVERRIDE_DEFAULT);
        list.add(TaskPropertyPath.REMINDER_PLAY_SOUND);
        list.add(TaskPropertyPath.REMINDER_SOUND_FILE);
        list.add(TaskPropertyPath.REMINDER_TIME);
        list.add(TaskPropertyPath.OWNER);
        list.add(TaskPropertyPath.IS_TEAM_TASK);
        list.add(TaskPropertyPath.IS_COMPLETE);
        list.add(TaskPropertyPath.IS_RECURRING);
        list.add(TaskPropertyPath.PRIORITY);
        return (List<PropertyPath>)list;
    }
    
    static {
        ACTUAL_WORK = new UnindexedPropertyPath("task:ActualWork");
        ASSIGNED_TIME = new UnindexedPropertyPath("task:AssignedTime");
        BILLING_INFORMATION = new UnindexedPropertyPath("task:BillingInformation");
        CHANGE_COUNT = new UnindexedPropertyPath("task:ChangeCount");
        COMPANIES = new UnindexedPropertyPath("task:Companies");
        COMPLETE_DATE = new UnindexedPropertyPath("task:CompleteDate");
        CONTACTS = new UnindexedPropertyPath("task:Contacts");
        DELEGATION_STATE = new UnindexedPropertyPath("task:DelegationState");
        DELEGATOR = new UnindexedPropertyPath("task:Delegator");
        DUE_DATE = new UnindexedPropertyPath("task:DueDate");
        IS_ASSIGNMENT_EDITABLE = new UnindexedPropertyPath("task:IsAssignmentEditable");
        MILEAGE = new UnindexedPropertyPath("task:Mileage");
        PERCENT_COMPLETE = new UnindexedPropertyPath("task:PercentComplete");
        RECURRENCE = new UnindexedPropertyPath("task:Recurrence");
        START_DATE = new UnindexedPropertyPath("task:StartDate");
        STATUS = new UnindexedPropertyPath("task:Status");
        STATUS_DESCRIPTION = new UnindexedPropertyPath("task:StatusDescription");
        TOTAL_WORK = new UnindexedPropertyPath("task:TotalWork");
        IS_PRIVATE = new PropertyId(34054, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        COMMON_START_DATE = new PropertyId(34070, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        COMMON_END_DATE = new PropertyId(34071, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        REMINDER_OVERRIDE_DEFAULT = new PropertyId(34076, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        REMINDER_PLAY_SOUND = new PropertyId(34078, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        REMINDER_SOUND_FILE = new PropertyId(34079, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        REMINDER_TIME = new PropertyId(34050, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        OWNER = new PropertyId(33055, StandardPropertySet.TASK, MapiPropertyType.STRING);
        IS_TEAM_TASK = new PropertyId(33027, StandardPropertySet.TASK, MapiPropertyType.BOOLEAN);
        IS_COMPLETE = new PropertyId(33052, StandardPropertySet.TASK, MapiPropertyType.BOOLEAN);
        IS_RECURRING = new PropertyId(33062, StandardPropertySet.TASK, MapiPropertyType.BOOLEAN);
        PRIORITY = MapiPropertyTag.PR_PRIORITY;
    }
}

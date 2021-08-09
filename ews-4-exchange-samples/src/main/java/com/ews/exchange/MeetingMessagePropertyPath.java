package com.ews.exchange;

import java.util.*;

public class MeetingMessagePropertyPath extends MessagePropertyPath
{
    public static final UnindexedPropertyPath APPOINTMENT_ID;
    public static final UnindexedPropertyPath IS_DELEGATED;
    public static final UnindexedPropertyPath IS_OUT_OF_DATE;
    public static final UnindexedPropertyPath HAS_BEEN_PROCESSED;
    public static final UnindexedPropertyPath RESPONSE_TYPE;
    public static final UnindexedPropertyPath UID;
    public static final UnindexedPropertyPath RECURRENCE_ID;
    public static final UnindexedPropertyPath DATE_TIME_STAMP;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < MessagePropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)MessagePropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(MeetingMessagePropertyPath.APPOINTMENT_ID);
        list.add(MeetingMessagePropertyPath.IS_DELEGATED);
        list.add(MeetingMessagePropertyPath.IS_OUT_OF_DATE);
        list.add(MeetingMessagePropertyPath.HAS_BEEN_PROCESSED);
        list.add(MeetingMessagePropertyPath.RESPONSE_TYPE);
        list.add(MeetingMessagePropertyPath.UID);
        list.add(MeetingMessagePropertyPath.RECURRENCE_ID);
        list.add(MeetingMessagePropertyPath.DATE_TIME_STAMP);
        return (List<PropertyPath>)list;
    }
    
    static {
        APPOINTMENT_ID = new UnindexedPropertyPath("meeting:AssociatedCalendarItemId");
        IS_DELEGATED = new UnindexedPropertyPath("meeting:IsDelegated");
        IS_OUT_OF_DATE = new UnindexedPropertyPath("meeting:IsOutOfDate");
        HAS_BEEN_PROCESSED = new UnindexedPropertyPath("meeting:HasBeenProcessed");
        RESPONSE_TYPE = new UnindexedPropertyPath("meeting:ResponseType");
        UID = new UnindexedPropertyPath("calendar:UID");
        RECURRENCE_ID = new UnindexedPropertyPath("calendar:RecurrenceId");
        DATE_TIME_STAMP = new UnindexedPropertyPath("calendar:DateTimeStamp");
    }
}

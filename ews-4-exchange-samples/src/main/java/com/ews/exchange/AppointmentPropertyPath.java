package com.ews.exchange;

import java.util.*;

public class AppointmentPropertyPath extends ItemPropertyPath
{
    public static final UnindexedPropertyPath REMINDER_NEXT_TIME;
    public static final UnindexedPropertyPath START_WALL_CLOCK;
    public static final UnindexedPropertyPath END_WALL_CLOCK;
    public static final UnindexedPropertyPath UID;
    public static final UnindexedPropertyPath RECURRENCE_ID;
    public static final UnindexedPropertyPath DATE_TIME_STAMP;
    public static final UnindexedPropertyPath START_TIME;
    public static final UnindexedPropertyPath END_TIME;
    public static final UnindexedPropertyPath ORIGINAL_START_TIME;
    public static final UnindexedPropertyPath IS_ALL_DAY_EVENT;
    public static final UnindexedPropertyPath LEGACY_FREE_BUSY_STATUS;
    public static final UnindexedPropertyPath LOCATION;
    public static final UnindexedPropertyPath WHEN;
    public static final UnindexedPropertyPath IS_MEETING;
    public static final UnindexedPropertyPath IS_CANCELLED;
    public static final UnindexedPropertyPath IS_RECURRING;
    public static final UnindexedPropertyPath MEETING_REQUEST_WAS_SENT;
    public static final UnindexedPropertyPath IS_RESPONSE_REQUESTED;
    public static final UnindexedPropertyPath INSTANCE_TYPE;
    public static final UnindexedPropertyPath MY_RESPONSE;
    public static final UnindexedPropertyPath ORGANIZER;
    public static final UnindexedPropertyPath REQUIRED_ATTENDEES;
    public static final UnindexedPropertyPath OPTIONAL_ATTENDEES;
    public static final UnindexedPropertyPath RESOURCES;
    public static final UnindexedPropertyPath CONFLICTING_MEETING_COUNT;
    public static final UnindexedPropertyPath ADJACENT_MEETING_COUNT;
    public static final UnindexedPropertyPath CONFLICTING_MEETINGS;
    public static final UnindexedPropertyPath ADJACENT_MEETINGS;
    public static final UnindexedPropertyPath DURATION;
    public static final UnindexedPropertyPath TIME_ZONE;
    public static final UnindexedPropertyPath REPLY_TIME;
    public static final UnindexedPropertyPath SEQUENCE_NUMBER;
    public static final UnindexedPropertyPath STATE;
    public static final UnindexedPropertyPath RECURRENCE;
    public static final UnindexedPropertyPath FIRST_OCCURRENCE;
    public static final UnindexedPropertyPath LAST_OCCURRENCE;
    public static final UnindexedPropertyPath MODIFIED_OCCURRENCES;
    public static final UnindexedPropertyPath DELETED_OCCURRENCES;
    public static final UnindexedPropertyPath MEETING_TIME_ZONE;
    public static final UnindexedPropertyPath START_TIME_ZONE;
    public static final UnindexedPropertyPath END_TIME_ZONE;
    public static final UnindexedPropertyPath CONFERENCE_TYPE;
    public static final UnindexedPropertyPath ALLOW_NEW_TIME_PROPOSAL;
    public static final UnindexedPropertyPath IS_ONLINE_MEETING;
    public static final UnindexedPropertyPath MEETING_WORKSPACE_URL;
    public static final UnindexedPropertyPath NET_SHOW_URL;
    public static final UnindexedPropertyPath ENHANCED_LOCATION;
    public static final UnindexedPropertyPath JOIN_ONLINE_MEETING_URL;
    public static final UnindexedPropertyPath ONLINE_MEETING_SETTINGS;
    public static final PropertyId IS_PRIVATE;
    public static final PropertyId BUSY_STATUS;
    public static final PropertyId MEETING_STATUS;
    public static final PropertyId RESPONSE_STATUS;
    public static final PropertyId COMMON_START_TIME;
    public static final PropertyId COMMON_END_TIME;
    public static final PropertyId REMINDER_OVERRIDE_DEFAULT;
    public static final PropertyId REMINDER_PLAY_SOUND;
    public static final PropertyId REMINDER_SOUND_FILE;
    public static final PropertyId LABEL;
    public static final PropertyId RECURRENCE_PATTERN;
    public static final PropertyId RECURRENCE_START;
    public static final PropertyId RECURRENCE_END;
    public static final PropertyTag PRIORITY;
    public static final PropertyTag BODY_RTF;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add(ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(AppointmentPropertyPath.MIME_CONTENT);
        list.add(AppointmentPropertyPath.REMINDER_DUE_BY);
        list.add(AppointmentPropertyPath.REMINDER_IS_SET);
        list.add(AppointmentPropertyPath.REMINDER_MINUTES_BEFORE_START);
        list.add(AppointmentPropertyPath.UID);
        list.add(AppointmentPropertyPath.RECURRENCE_ID);
        list.add(AppointmentPropertyPath.DATE_TIME_STAMP);
        list.add(AppointmentPropertyPath.START_TIME);
        list.add(AppointmentPropertyPath.END_TIME);
        list.add(AppointmentPropertyPath.ORIGINAL_START_TIME);
        list.add(AppointmentPropertyPath.IS_ALL_DAY_EVENT);
        list.add(AppointmentPropertyPath.LEGACY_FREE_BUSY_STATUS);
        list.add(AppointmentPropertyPath.LOCATION);
        list.add(AppointmentPropertyPath.WHEN);
        list.add(AppointmentPropertyPath.IS_MEETING);
        list.add(AppointmentPropertyPath.IS_CANCELLED);
        list.add(AppointmentPropertyPath.IS_RECURRING);
        list.add(AppointmentPropertyPath.MEETING_REQUEST_WAS_SENT);
        list.add(AppointmentPropertyPath.IS_RESPONSE_REQUESTED);
        list.add(AppointmentPropertyPath.INSTANCE_TYPE);
        list.add(AppointmentPropertyPath.MY_RESPONSE);
        list.add(AppointmentPropertyPath.ORGANIZER);
        list.add(AppointmentPropertyPath.REQUIRED_ATTENDEES);
        list.add(AppointmentPropertyPath.OPTIONAL_ATTENDEES);
        list.add(AppointmentPropertyPath.RESOURCES);
        list.add(AppointmentPropertyPath.CONFLICTING_MEETING_COUNT);
        list.add(AppointmentPropertyPath.ADJACENT_MEETING_COUNT);
        list.add(AppointmentPropertyPath.CONFLICTING_MEETINGS);
        list.add(AppointmentPropertyPath.ADJACENT_MEETINGS);
        list.add(AppointmentPropertyPath.DURATION);
        list.add(AppointmentPropertyPath.TIME_ZONE);
        list.add(AppointmentPropertyPath.REPLY_TIME);
        list.add(AppointmentPropertyPath.SEQUENCE_NUMBER);
        list.add(AppointmentPropertyPath.STATE);
        list.add(AppointmentPropertyPath.RECURRENCE);
        list.add(AppointmentPropertyPath.FIRST_OCCURRENCE);
        list.add(AppointmentPropertyPath.LAST_OCCURRENCE);
        list.add(AppointmentPropertyPath.MODIFIED_OCCURRENCES);
        list.add(AppointmentPropertyPath.DELETED_OCCURRENCES);
        list.add(AppointmentPropertyPath.MEETING_TIME_ZONE);
        list.add(AppointmentPropertyPath.START_TIME_ZONE);
        list.add(AppointmentPropertyPath.END_TIME_ZONE);
        list.add(AppointmentPropertyPath.CONFERENCE_TYPE);
        list.add(AppointmentPropertyPath.ALLOW_NEW_TIME_PROPOSAL);
        list.add(AppointmentPropertyPath.IS_ONLINE_MEETING);
        list.add(AppointmentPropertyPath.MEETING_WORKSPACE_URL);
        list.add(AppointmentPropertyPath.NET_SHOW_URL);
        list.add(AppointmentPropertyPath.IS_PRIVATE);
        list.add(AppointmentPropertyPath.BUSY_STATUS);
        list.add(AppointmentPropertyPath.MEETING_STATUS);
        list.add(AppointmentPropertyPath.RESPONSE_STATUS);
        list.add(AppointmentPropertyPath.COMMON_START_TIME);
        list.add(AppointmentPropertyPath.COMMON_END_TIME);
        list.add(AppointmentPropertyPath.REMINDER_OVERRIDE_DEFAULT);
        list.add(AppointmentPropertyPath.REMINDER_PLAY_SOUND);
        list.add(AppointmentPropertyPath.REMINDER_SOUND_FILE);
        list.add(AppointmentPropertyPath.LABEL);
        list.add(AppointmentPropertyPath.RECURRENCE_PATTERN);
        list.add(AppointmentPropertyPath.RECURRENCE_START);
        list.add(AppointmentPropertyPath.RECURRENCE_END);
        list.add(AppointmentPropertyPath.PRIORITY);
        list.add(AppointmentPropertyPath.BODY_RTF);
        return (List<PropertyPath>)list;
    }
    
    static {
        REMINDER_NEXT_TIME = new UnindexedPropertyPath("item:ReminderNextTime");
        START_WALL_CLOCK = new UnindexedPropertyPath("calendar:StartWallClock");
        END_WALL_CLOCK = new UnindexedPropertyPath("calendar:EndWallClock");
        UID = new UnindexedPropertyPath("calendar:UID");
        RECURRENCE_ID = new UnindexedPropertyPath("calendar:RecurrenceId");
        DATE_TIME_STAMP = new UnindexedPropertyPath("calendar:DateTimeStamp");
        START_TIME = new UnindexedPropertyPath("calendar:Start");
        END_TIME = new UnindexedPropertyPath("calendar:End");
        ORIGINAL_START_TIME = new UnindexedPropertyPath("calendar:OriginalStart");
        IS_ALL_DAY_EVENT = new UnindexedPropertyPath("calendar:IsAllDayEvent");
        LEGACY_FREE_BUSY_STATUS = new UnindexedPropertyPath("calendar:LegacyFreeBusyStatus");
        LOCATION = new UnindexedPropertyPath("calendar:Location");
        WHEN = new UnindexedPropertyPath("calendar:When");
        IS_MEETING = new UnindexedPropertyPath("calendar:IsMeeting");
        IS_CANCELLED = new UnindexedPropertyPath("calendar:IsCancelled");
        IS_RECURRING = new UnindexedPropertyPath("calendar:IsRecurring");
        MEETING_REQUEST_WAS_SENT = new UnindexedPropertyPath("calendar:MeetingRequestWasSent");
        IS_RESPONSE_REQUESTED = new UnindexedPropertyPath("calendar:IsResponseRequested");
        INSTANCE_TYPE = new UnindexedPropertyPath("calendar:CalendarItemType");
        MY_RESPONSE = new UnindexedPropertyPath("calendar:MyResponseType");
        ORGANIZER = new UnindexedPropertyPath("calendar:Organizer");
        REQUIRED_ATTENDEES = new UnindexedPropertyPath("calendar:RequiredAttendees");
        OPTIONAL_ATTENDEES = new UnindexedPropertyPath("calendar:OptionalAttendees");
        RESOURCES = new UnindexedPropertyPath("calendar:Resources");
        CONFLICTING_MEETING_COUNT = new UnindexedPropertyPath("calendar:ConflictingMeetingCount");
        ADJACENT_MEETING_COUNT = new UnindexedPropertyPath("calendar:AdjacentMeetingCount");
        CONFLICTING_MEETINGS = new UnindexedPropertyPath("calendar:ConflictingMeetings");
        ADJACENT_MEETINGS = new UnindexedPropertyPath("calendar:AdjacentMeetings");
        DURATION = new UnindexedPropertyPath("calendar:Duration");
        TIME_ZONE = new UnindexedPropertyPath("calendar:TimeZone");
        REPLY_TIME = new UnindexedPropertyPath("calendar:AppointmentReplyTime");
        SEQUENCE_NUMBER = new UnindexedPropertyPath("calendar:AppointmentSequenceNumber");
        STATE = new UnindexedPropertyPath("calendar:AppointmentState");
        RECURRENCE = new UnindexedPropertyPath("calendar:Recurrence");
        FIRST_OCCURRENCE = new UnindexedPropertyPath("calendar:FirstOccurrence");
        LAST_OCCURRENCE = new UnindexedPropertyPath("calendar:LastOccurrence");
        MODIFIED_OCCURRENCES = new UnindexedPropertyPath("calendar:ModifiedOccurrences");
        DELETED_OCCURRENCES = new UnindexedPropertyPath("calendar:DeletedOccurrences");
        MEETING_TIME_ZONE = new UnindexedPropertyPath("calendar:MeetingTimeZone");
        START_TIME_ZONE = new UnindexedPropertyPath("calendar:StartTimeZone");
        END_TIME_ZONE = new UnindexedPropertyPath("calendar:EndTimeZone");
        CONFERENCE_TYPE = new UnindexedPropertyPath("calendar:ConferenceType");
        ALLOW_NEW_TIME_PROPOSAL = new UnindexedPropertyPath("calendar:AllowNewTimeProposal");
        IS_ONLINE_MEETING = new UnindexedPropertyPath("calendar:IsOnlineMeeting");
        MEETING_WORKSPACE_URL = new UnindexedPropertyPath("calendar:MeetingWorkspaceUrl");
        NET_SHOW_URL = new UnindexedPropertyPath("calendar:NetShowUrl");
        ENHANCED_LOCATION = new UnindexedPropertyPath("calendar:EnhancedLocation");
        JOIN_ONLINE_MEETING_URL = new UnindexedPropertyPath("calendar:JoinOnlineMeetingUrl");
        ONLINE_MEETING_SETTINGS = new UnindexedPropertyPath("calendar:OnlineMeetingSettings");
        IS_PRIVATE = new PropertyId(34054, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        BUSY_STATUS = new PropertyId(33285, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        MEETING_STATUS = new PropertyId(33303, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        RESPONSE_STATUS = new PropertyId(33304, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        COMMON_START_TIME = new PropertyId(34070, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        COMMON_END_TIME = new PropertyId(34071, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        REMINDER_OVERRIDE_DEFAULT = new PropertyId(34076, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        REMINDER_PLAY_SOUND = new PropertyId(34078, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        REMINDER_SOUND_FILE = new PropertyId(34079, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        LABEL = new PropertyId(33300, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        RECURRENCE_PATTERN = new PropertyId(33330, StandardPropertySet.APPOINTMENT, MapiPropertyType.STRING);
        RECURRENCE_START = new PropertyId(33333, StandardPropertySet.APPOINTMENT, MapiPropertyType.SYSTEM_TIME);
        RECURRENCE_END = new PropertyId(33334, StandardPropertySet.APPOINTMENT, MapiPropertyType.SYSTEM_TIME);
        PRIORITY = MapiPropertyTag.PR_PRIORITY;
        BODY_RTF = MapiPropertyTag.PR_RTF_COMPRESSED;
    }
}

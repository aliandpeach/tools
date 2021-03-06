package com.ews.exchange;

import java.util.*;

public class MeetingRequestPropertyPath extends MeetingMessagePropertyPath
{
    public static final UnindexedPropertyPath INTENDED_FREE_BUSY_STATUS;
    public static final UnindexedPropertyPath MEETING_REQUEST_TYPE;
    public static final UnindexedPropertyPath CHANGE_HIGHLIGHTS;
    public static final UnindexedPropertyPath REMINDER_NEXT_TIME;
    public static final UnindexedPropertyPath START_WALL_CLOCK;
    public static final UnindexedPropertyPath END_WALL_CLOCK;
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
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < MeetingMessagePropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)MeetingMessagePropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(MeetingRequestPropertyPath.INTENDED_FREE_BUSY_STATUS);
        list.add(MeetingRequestPropertyPath.MEETING_REQUEST_TYPE);
        list.add(MeetingRequestPropertyPath.CHANGE_HIGHLIGHTS);
        list.add(MeetingRequestPropertyPath.REMINDER_DUE_BY);
        list.add(MeetingRequestPropertyPath.REMINDER_IS_SET);
        list.add(MeetingRequestPropertyPath.END_WALL_CLOCK);
        list.add(MeetingRequestPropertyPath.REMINDER_NEXT_TIME);
        list.add(MeetingRequestPropertyPath.START_WALL_CLOCK);
        list.add(MeetingRequestPropertyPath.REMINDER_MINUTES_BEFORE_START);
        list.add(MeetingRequestPropertyPath.START_TIME);
        list.add(MeetingRequestPropertyPath.END_TIME);
        list.add(MeetingRequestPropertyPath.ORIGINAL_START_TIME);
        list.add(MeetingRequestPropertyPath.IS_ALL_DAY_EVENT);
        list.add(MeetingRequestPropertyPath.LEGACY_FREE_BUSY_STATUS);
        list.add(MeetingRequestPropertyPath.LOCATION);
        list.add(MeetingRequestPropertyPath.WHEN);
        list.add(MeetingRequestPropertyPath.IS_MEETING);
        list.add(MeetingRequestPropertyPath.IS_CANCELLED);
        list.add(MeetingRequestPropertyPath.IS_RECURRING);
        list.add(MeetingRequestPropertyPath.MEETING_REQUEST_WAS_SENT);
        list.add(MeetingRequestPropertyPath.IS_RESPONSE_REQUESTED);
        list.add(MeetingRequestPropertyPath.INSTANCE_TYPE);
        list.add(MeetingRequestPropertyPath.MY_RESPONSE);
        list.add(MeetingRequestPropertyPath.ORGANIZER);
        list.add(MeetingRequestPropertyPath.REQUIRED_ATTENDEES);
        list.add(MeetingRequestPropertyPath.OPTIONAL_ATTENDEES);
        list.add(MeetingRequestPropertyPath.RESOURCES);
        list.add(MeetingRequestPropertyPath.CONFLICTING_MEETING_COUNT);
        list.add(MeetingRequestPropertyPath.ADJACENT_MEETING_COUNT);
        list.add(MeetingRequestPropertyPath.CONFLICTING_MEETINGS);
        list.add(MeetingRequestPropertyPath.ADJACENT_MEETINGS);
        list.add(MeetingRequestPropertyPath.DURATION);
        list.add(MeetingRequestPropertyPath.TIME_ZONE);
        list.add(MeetingRequestPropertyPath.REPLY_TIME);
        list.add(MeetingRequestPropertyPath.SEQUENCE_NUMBER);
        list.add(MeetingRequestPropertyPath.STATE);
        list.add(MeetingRequestPropertyPath.RECURRENCE);
        list.add(MeetingRequestPropertyPath.FIRST_OCCURRENCE);
        list.add(MeetingRequestPropertyPath.LAST_OCCURRENCE);
        list.add(MeetingRequestPropertyPath.MODIFIED_OCCURRENCES);
        list.add(MeetingRequestPropertyPath.DELETED_OCCURRENCES);
        list.add(MeetingRequestPropertyPath.MEETING_TIME_ZONE);
        list.add(MeetingRequestPropertyPath.START_TIME_ZONE);
        list.add(MeetingRequestPropertyPath.END_TIME_ZONE);
        list.add(MeetingRequestPropertyPath.CONFERENCE_TYPE);
        list.add(MeetingRequestPropertyPath.ALLOW_NEW_TIME_PROPOSAL);
        list.add(MeetingRequestPropertyPath.IS_ONLINE_MEETING);
        list.add(MeetingRequestPropertyPath.MEETING_WORKSPACE_URL);
        list.add(MeetingRequestPropertyPath.NET_SHOW_URL);
        list.add(MeetingRequestPropertyPath.IS_PRIVATE);
        list.add(MeetingRequestPropertyPath.BUSY_STATUS);
        list.add(MeetingRequestPropertyPath.MEETING_STATUS);
        list.add(MeetingRequestPropertyPath.RESPONSE_STATUS);
        list.add(MeetingRequestPropertyPath.COMMON_START_TIME);
        list.add(MeetingRequestPropertyPath.COMMON_END_TIME);
        list.add(MeetingRequestPropertyPath.REMINDER_OVERRIDE_DEFAULT);
        list.add(MeetingRequestPropertyPath.REMINDER_PLAY_SOUND);
        list.add(MeetingRequestPropertyPath.REMINDER_SOUND_FILE);
        list.add(MeetingRequestPropertyPath.LABEL);
        list.add(MeetingRequestPropertyPath.RECURRENCE_PATTERN);
        list.add(MeetingRequestPropertyPath.RECURRENCE_START);
        list.add(MeetingRequestPropertyPath.RECURRENCE_END);
        list.add(MeetingRequestPropertyPath.PRIORITY);
        return (List<PropertyPath>)list;
    }
    
    static {
        INTENDED_FREE_BUSY_STATUS = new UnindexedPropertyPath("meetingRequest:IntendedFreeBusyStatus");
        MEETING_REQUEST_TYPE = new UnindexedPropertyPath("meetingRequest:MeetingRequestType");
        CHANGE_HIGHLIGHTS = new UnindexedPropertyPath("meetingRequest:ChangeHighlights");
        REMINDER_NEXT_TIME = new UnindexedPropertyPath("item:ReminderNextTime");
        START_WALL_CLOCK = new UnindexedPropertyPath("calendar:StartWallClock");
        END_WALL_CLOCK = new UnindexedPropertyPath("calendar:EndWallClock");
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
    }
}

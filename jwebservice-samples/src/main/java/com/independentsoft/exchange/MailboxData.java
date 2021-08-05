package com.independentsoft.exchange;

public class MailboxData
{
    private EmailAddress a;
    private MeetingAttendeeType b;
    private boolean c;
    
    public MailboxData() {
        this.b = MeetingAttendeeType.ORGANIZER;
    }
    
    public MailboxData(final EmailAddress emailAddress) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = emailAddress;
    }
    
    public MailboxData(final EmailAddress emailAddress, final MeetingAttendeeType attendeeType) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = emailAddress;
        this.b = attendeeType;
    }
    
    public MailboxData(final EmailAddress emailAddress, final MeetingAttendeeType attendeeType, final boolean excludeConflicts) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = emailAddress;
        this.b = attendeeType;
        this.c = excludeConflicts;
    }
    
    public MailboxData(final String emailAddress) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = new EmailAddress(emailAddress);
    }
    
    public MailboxData(final String emailAddress, final MeetingAttendeeType attendeeType) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = new EmailAddress(emailAddress);
        this.b = attendeeType;
    }
    
    public MailboxData(final String emailAddress, final MeetingAttendeeType attendeeType, final boolean excludeConflicts) {
        this.b = MeetingAttendeeType.ORGANIZER;
        this.a = new EmailAddress(emailAddress);
        this.b = attendeeType;
        this.c = excludeConflicts;
    }
    
    public String toString() {
        String string = "<t:MailboxData>";
        if (this.a != null) {
            string += this.a.a("Email");
        }
        final MeetingAttendeeType b;
        String s = string + "<t:AttendeeType>" + (((b = this.b) == MeetingAttendeeType.OPTIONAL) ? "Optional" : ((b == MeetingAttendeeType.ORGANIZER) ? "Organizer" : ((b == MeetingAttendeeType.REQUIRED) ? "Required" : ((b == MeetingAttendeeType.RESOURCE) ? "Resource" : "Room")))) + "</t:AttendeeType>";
        if (this.c) {
            s += "<t:ExcludeConflicts>true</t:ExcludeConflicts>";
        }
        return s + "</t:MailboxData>";
    }
    
    public EmailAddress getEmailAddress() {
        return this.a;
    }
    
    public void setEmailAddress(final EmailAddress emailAddress) {
        this.a = emailAddress;
    }
    
    public MeetingAttendeeType getAttendeeType() {
        return this.b;
    }
    
    public void setAttendeeType(final MeetingAttendeeType attendeeType) {
        this.b = attendeeType;
    }
    
    public boolean getExcludeConflicts() {
        return this.c;
    }
    
    public void setExcludeConflicts(final boolean excludeConflicts) {
        this.c = excludeConflicts;
    }
}

package com.ews.exchange;

import java.util.*;
import java.io.*;

public class Property
{
    PropertyPath a;
    String b;
    List<String> c;
    private boolean d;
    
    public Property() {
        this.c = new ArrayList<String>();
        this.d = false;
    }
    
    public Property(final PropertyPath propertyPath) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
    }
    
    public Property(final PropertyPath propertyPath, final String value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.b = value;
    }
    
    public Property(final PropertyPath propertyPath, final long value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.b = Long.toString(value);
    }
    
    public Property(final PropertyPath propertyPath, final double value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.b = Double.toString(value);
    }
    
    public Property(final PropertyPath propertyPath, final boolean value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.b = Boolean.toString(value).toLowerCase();
    }
    
    public Property(final PropertyPath propertyPath, final Date value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.b = com.ews.exchange.d.a(value);
    }
    
    public Property(final PropertyPath propertyPath, final byte[] value) {
        this.c = new ArrayList<String>();
        this.d = false;
        if (value == null) {
            throw new IllegalArgumentException("value is null.");
        }
        this.a = propertyPath;
        this.b = com.ews.exchange.d.a(value);
        this.d = true;
    }
    
    public Property(PropertyPath propertyPath, final Object value) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        if (value instanceof Priority) {
            Priority temp;
            this.b = (((temp = (Priority)value) == Priority.LOW) ? "-1" : ((temp == Priority.HIGH) ? "1" : "0"));
            return;
        }
        if (value instanceof FlagIcon) {
            this.b = com.ews.exchange.a.a((FlagIcon)value);
            return;
        }
        if (value instanceof FlagStatus) {
            this.b = com.ews.exchange.a.a((FlagStatus)value);
            return;
        }
        if (value instanceof LegacyFreeBusy) {
            this.b = com.ews.exchange.a.a((LegacyFreeBusy)value);
            return;
        }
        if (value instanceof MeetingStatus) {
            this.b = com.ews.exchange.a.a((MeetingStatus)value);
            return;
        }
        if (value instanceof NoteColor) {
            this.b = com.ews.exchange.a.a((NoteColor)value);
            return;
        }
        if (value instanceof ResponseStatus) {
            this.b = com.ews.exchange.a.a((ResponseStatus)value);
            return;
        }
        if (value instanceof Gender) {
            this.b = com.ews.exchange.a.a((Gender)value);
            return;
        }
        if (value instanceof Sensitivity) {
            this.b = com.ews.exchange.a.a((Sensitivity)value);
            return;
        }
        if (value instanceof TaskStatus) {
            this.b = com.ews.exchange.a.a((TaskStatus)value);
            return;
        }
        if (value instanceof BusyStatus) {
            this.b = com.ews.exchange.a.a((BusyStatus)value);
            return;
        }
        if (value instanceof FileAsMapping) {
            this.b = com.ews.exchange.a.a((FileAsMapping)value);
            return;
        }
        if (value instanceof Importance) {
            this.b = com.ews.exchange.a.a((Importance)value);
            return;
        }
        if (value != null) {
            if (propertyPath == AppointmentPropertyPath.START_TIME_ZONE && value instanceof TimeZoneDefinition) {
//                propertyPath = (PropertyPath)value;
                this.b = ((TimeZoneDefinition)value).a("StartTimeZone");
            }
            else if (propertyPath == AppointmentPropertyPath.END_TIME_ZONE && value instanceof TimeZoneDefinition) {
                this.b = ((TimeZoneDefinition)value).a("EndTimeZone");
            }
            else if (propertyPath == DistributionListPropertyPath.MEMBERS && value instanceof DistributionListMember) {
                this.b = ((DistributionListMember)value).a();
            }
            else if (propertyPath == ItemPropertyPath.FLAG && value instanceof Flag) {
                this.b = ((Flag)value).a();
            }
            else {
                this.b = value.toString();
            }
            this.d = true;
        }
    }
    
    public Property(final PropertyPath propertyPath, final List<String> values) {
        this.c = new ArrayList<String>();
        this.d = false;
        this.a = propertyPath;
        this.c = values;
    }
    
    public String toString() {
        String s = "";
        if (this.a != null) {
            s += this.a.toString();
        }
        if (this.b != null) {
            s = s + "<t:Value>" + com.ews.exchange.d.a(this.b) + "</t:Value>";
        }
        else if (this.c != null) {
            String s2 = s + "<t:Values>";
            for (int i = 0; i < this.c.size(); ++i) {
                if (this.c.get(i) != null) {
                    s2 = s2 + "<t:Value>" + com.ews.exchange.d.a(this.c.get(i)) + "</t:Value>";
                }
            }
            s = s2 + "</t:Values>";
        }
        return new StringBuilder().append(s).toString();
    }
    
    String a() {
        String s = "";
        if (this.b != null && this.a instanceof UnindexedPropertyPath) {
            final UnindexedPropertyPath unindexedPropertyPath = (UnindexedPropertyPath)this.a;
            final String string = s + unindexedPropertyPath.toString();
            final String f = com.ews.exchange.d.f(unindexedPropertyPath.getUri());
            final String g = com.ews.exchange.d.g(unindexedPropertyPath.getUri());
            final String string2 = string + "<t:" + f + ">";
            String s2;
            if (this.d && (this.a == ItemPropertyPath.BODY || this.a == AppointmentPropertyPath.MEETING_TIME_ZONE || this.a == AppointmentPropertyPath.RECURRENCE || this.a == AppointmentPropertyPath.START_TIME_ZONE || this.a == AppointmentPropertyPath.END_TIME_ZONE || this.a == ItemPropertyPath.FLAG)) {
                s2 = string2 + this.b;
            }
            else if (this.d) {
                s2 = string2 + "<t:" + g + ">" + this.b + "</t:" + g + ">";
            }
            else {
                s2 = string2 + "<t:" + g + ">" + com.ews.exchange.d.a(this.b) + "</t:" + g + ">";
            }
            s = s2 + "</t:" + f + ">";
        }
        else if (this.c.size() > 0 && this.a instanceof UnindexedPropertyPath) {
            final UnindexedPropertyPath unindexedPropertyPath2 = (UnindexedPropertyPath)this.a;
            final String string3 = s + unindexedPropertyPath2.toString();
            final String f2 = com.ews.exchange.d.f(unindexedPropertyPath2.getUri());
            final String g2 = com.ews.exchange.d.g(unindexedPropertyPath2.getUri());
            String s3 = string3 + "<t:" + f2 + ">" + "<t:" + g2 + ">";
            for (int i = 0; i < this.c.size(); ++i) {
                s3 = s3 + "<t:String>" + com.ews.exchange.d.a(this.c.get(i)) + "</t:String>";
            }
            s = s3 + "</t:" + g2 + ">" + "</t:" + f2 + ">";
        }
        else if (this.b != null && this.a instanceof IndexedPropertyPath) {
            final IndexedPropertyPath indexedPropertyPath = (IndexedPropertyPath)this.a;
            s = s + indexedPropertyPath.toString() + com.ews.exchange.d.a(indexedPropertyPath.getUri(), indexedPropertyPath.getIndex(), this.b);
        }
        else if (this.a instanceof ExtendedPropertyPath) {
            if (this.d && this.b != null && this.b.length() > 0 && this.a == MapiPropertyTag.PR_RTF_COMPRESSED) {
                try {
                    final byte[] e = com.ews.exchange.d.e(this.b);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    final c c = new c(e.length + 12);
                    final c c2 = new c(e.length);
                    final c c3 = new c(1095517517);
                    byteArrayOutputStream.write(c.a());
                    byteArrayOutputStream.write(c2.a());
                    byteArrayOutputStream.write(c3.a());
                    final a a;
                    (a = new a()).a(e, 0, e.length);
                    byteArrayOutputStream.write(new c(a.a()).a());
                    byteArrayOutputStream.write(e);
                    this.b = com.ews.exchange.d.a(byteArrayOutputStream.toByteArray());
                }
                catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            if (this.a != null) {
                s += this.a.toString();
            }
            s = s + "<t:Item>" + "<t:ExtendedProperty>" + this.toString() + "</t:ExtendedProperty>" + "</t:Item>";
        }
        return s;
    }
    
    String b() {
        String s = "";
        if (this.b != null && this.a instanceof UnindexedPropertyPath) {
            final UnindexedPropertyPath unindexedPropertyPath = (UnindexedPropertyPath)this.a;
            final String string = s + unindexedPropertyPath.toString();
            final String g = com.ews.exchange.d.g(unindexedPropertyPath.getUri());
            if (this.b.indexOf("CalendarPermissions") == -1 && this.d && unindexedPropertyPath == FolderPropertyPath.PERMISSION_SET) {
                s = string + "<t:Folder>" + this.b + "</t:Folder>";
            }
            else if (this.b.indexOf("CalendarPermissions") == -1 && unindexedPropertyPath == FolderPropertyPath.PERMISSION_SET) {
                s = string + "<t:Folder>" + "<t:" + g + ">" + com.ews.exchange.d.a(this.b) + "</t:" + g + ">" + "</t:Folder>";
            }
            else if (this.d && unindexedPropertyPath == FolderPropertyPath.PERMISSION_SET) {
                s = string + "<t:CalendarFolder>" + this.b + "</t:CalendarFolder>";
            }
            else {
                s = string + "<t:Folder>" + "<t:" + g + ">" + com.ews.exchange.d.a(this.b) + "</t:" + g + ">" + "</t:Folder>";
            }
        }
        else if (this.a instanceof ExtendedPropertyPath) {
            s = s + this.a.toString() + "<t:Folder>" + "<t:ExtendedProperty>" + this.toString() + "</t:ExtendedProperty>" + "</t:Folder>";
        }
        return s;
    }
    
    public PropertyPath getPropertyPath() {
        return this.a;
    }
    
    public void setPropertyPath(final PropertyPath propertyPath) {
        this.a = propertyPath;
    }
    
    public String getValue() {
        return this.b;
    }
    
    public void setValue(final String value) {
        this.b = value;
    }
    
    public List<String> getValues() {
        return this.c;
    }
}

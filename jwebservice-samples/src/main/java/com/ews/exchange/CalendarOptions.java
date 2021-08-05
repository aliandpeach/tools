package com.ews.exchange;

import java.util.*;

public class CalendarOptions
{
    private boolean a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    
    public CalendarOptions() {
    }
    
    CalendarOptions(final UserConfiguration userConfiguration) {
        this.a(userConfiguration);
    }
    
    private void a(final UserConfiguration userConfiguration) {
        final Iterator<UserConfigurationDictionaryEntry> iterator = userConfiguration.getEntries().iterator();
        while (iterator.hasNext()) {
            final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry;
            if ((userConfigurationDictionaryEntry = iterator.next()).getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("RemoveForwardedMeetingNotifications")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || userConfigurationDictionaryEntry.getValue().getValues().get(0) == null || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.a = true;
            }
            else if (userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("calAssistAddNewItems")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || userConfigurationDictionaryEntry.getValue().getValues().get(0) == null || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.b = true;
            }
            else if (userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("calAssistProcessExternal")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || userConfigurationDictionaryEntry.getValue().getValues().get(0) == null || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.c = true;
            }
            else if (userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("piRemindDefault")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.d = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("piReminderUpgradeTime")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.e = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0) != null && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("calAssistNoiseReduction")) {
                if (userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || userConfigurationDictionaryEntry.getValue().getValues().get(0) == null || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.f = true;
            }
            else {
                if (userConfigurationDictionaryEntry.getKey().getValues().size() <= 0 || userConfigurationDictionaryEntry.getKey().getValues().get(0) == null || !userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("piAutoProcess") || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || userConfigurationDictionaryEntry.getValue().getValues().get(0) == null || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.g = true;
            }
        }
    }
    
    final List<UserConfigurationDictionaryEntry> a() {
        final UserConfigurationDictionaryKey key = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "RemoveForwardedMeetingNotifications");
        UserConfigurationDictionaryValue value = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false");
        final UserConfigurationDictionaryKey key2 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "calAssistAddNewItems");
        UserConfigurationDictionaryValue value2 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false");
        final UserConfigurationDictionaryKey key3 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "calAssistProcessExternal");
        UserConfigurationDictionaryValue value3 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false");
        final UserConfigurationDictionaryKey key4 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "piRemindDefault");
        UserConfigurationDictionaryValue value4 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.d));
        final UserConfigurationDictionaryKey key5 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "piReminderUpgradeTime");
        UserConfigurationDictionaryValue value5 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.e));
        final UserConfigurationDictionaryKey key6 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "calAssistNoiseReduction");
        UserConfigurationDictionaryValue value6 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false");
        final UserConfigurationDictionaryKey key7 = new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "piAutoProcess");
        UserConfigurationDictionaryValue value7 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false");
        if (this.a) {
            value = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true");
        }
        if (this.b) {
            value2 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true");
        }
        if (this.c) {
            value3 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true");
        }
        if (this.d > 0) {
            value4 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.d));
        }
        if (this.e > 0) {
            value5 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.e));
        }
        if (this.f) {
            value6 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true");
        }
        if (this.g) {
            value7 = new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true");
        }
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry = new UserConfigurationDictionaryEntry(key, value);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry2 = new UserConfigurationDictionaryEntry(key2, value2);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry3 = new UserConfigurationDictionaryEntry(key3, value3);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry4 = new UserConfigurationDictionaryEntry(key4, value4);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry5 = new UserConfigurationDictionaryEntry(key5, value5);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry6 = new UserConfigurationDictionaryEntry(key6, value6);
        final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry7 = new UserConfigurationDictionaryEntry(key7, value7);
        final ArrayList<UserConfigurationDictionaryEntry> list;
        (list = new ArrayList<UserConfigurationDictionaryEntry>()).add(userConfigurationDictionaryEntry);
        list.add(userConfigurationDictionaryEntry2);
        list.add(userConfigurationDictionaryEntry3);
        list.add(userConfigurationDictionaryEntry4);
        list.add(userConfigurationDictionaryEntry5);
        list.add(userConfigurationDictionaryEntry6);
        list.add(userConfigurationDictionaryEntry7);
        return list;
    }
    
    public boolean isRemoveForwardedMeetingNotifications() {
        return this.a;
    }
    
    public void setRemoveForwardedMeetingNotifications(final boolean removeForwardedMeetingNotifications) {
        this.a = removeForwardedMeetingNotifications;
    }
    
    public boolean isAutoProcessNewItems() {
        return this.b;
    }
    
    public void setAutoProcessNewItems(final boolean autoProcessNewItems) {
        this.b = autoProcessNewItems;
    }
    
    public boolean isAutoProcessExternal() {
        return this.c;
    }
    
    public void setAutoProcessExternal(final boolean autoProcessExternal) {
        this.c = autoProcessExternal;
    }
    
    public int getReminderDefault() {
        return this.d;
    }
    
    public void setReminderDefault(final int reminderDefault) {
        this.d = reminderDefault;
    }
    
    public int getReminderUpgradeTime() {
        return this.e;
    }
    
    public void setReminderUpgradeTime(final int reminderUpgradeTime) {
        this.e = reminderUpgradeTime;
    }
    
    public boolean isDeleteUpdatedItems() {
        return this.f;
    }
    
    public void setDeleteUpdatedItems(final boolean deleteUpdatedItems) {
        this.f = deleteUpdatedItems;
    }
    
    public boolean isAutoProcess() {
        return this.g;
    }
    
    public void setAutoProcess(final boolean autoProcess) {
        this.g = autoProcess;
    }
}

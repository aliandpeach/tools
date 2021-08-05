package com.ews.exchange;

import java.util.*;

public class UserSettingList extends ArrayList<UserSetting>
{
    public UserSetting get(final UserSettingName userSettingName) {
        final String a = com.ews.exchange.a.a(userSettingName);
        for (int i = 0; i < this.size(); ++i) {
            if (this.get(i) != null && this.get(i).getName().equals(a)) {
                return this.get(i);
            }
        }
        return null;
    }
}

package com.ews.exchange;

import java.util.*;

public class OwaOptions
{
    private String a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private boolean h;
    private String i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private String v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    private String K;
    private String L;
    private int M;
    private int N;
    
    public OwaOptions() {
    }
    
    OwaOptions(final UserConfiguration userConfiguration) {
        this.a(userConfiguration);
    }
    
    private void a(final UserConfiguration userConfiguration) {
        final Iterator<UserConfigurationDictionaryEntry> iterator = userConfiguration.getEntries().iterator();
        while (iterator.hasNext()) {
            final UserConfigurationDictionaryEntry userConfigurationDictionaryEntry;
            if ((userConfigurationDictionaryEntry = iterator.next()).getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("timeFormat")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.a = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("showweeknumbers")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.b = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("signaturetext")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.c = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("signaturehtml")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.d = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("timezone")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.e = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("firstweekofyear")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.f = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("enablereminders")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.g = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("enableremindersound")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.h = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("dateformat")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.i = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("hourincrement")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.j = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("IsOptimizedForAccessibility")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.k = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("weekstartday")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.l = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("FormatBarState")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.m = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("ShowTreeInListView")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.n = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("markasreaddelaytime")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.o = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("nextselection")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.p = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("spellingdictionarylanguage")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.q = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("ConversationSortOrder")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.r = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("checknameincontactsfirst")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.s = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("spellingcheckbeforesend")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.t = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("themeStorageId")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.v = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("spellingignoreuppercase")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.w = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("emptydeleteditemsonlogoff")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.x = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("previewmarkasread")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.y = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("autoaddsignature")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.z = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("autoaddsignatureonreply")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.A = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("alwaysshowfrom")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.B = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("HideDeletedItems")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.C = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("sendasitemscopiedto")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.D = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("spellingignoremixeddigits")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.E = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("alwaysshowbcc")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.F = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("sendonbehalfofcopiedto")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.G = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("isquicklinksbarvisible")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getValue().getValues().get(0).equals("true")) {
                    continue;
                }
                this.H = true;
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("composemarkup")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.I = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("newitemnotify")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.J = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("composefontname")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.K = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("composefontcolor")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.L = userConfigurationDictionaryEntry.getValue().getValues().get(0);
            }
            else if (userConfigurationDictionaryEntry.getKey() != null && userConfigurationDictionaryEntry.getKey().getValues().size() > 0 && userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("composefontsize")) {
                if (userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.M = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
            else {
                if (userConfigurationDictionaryEntry.getKey() == null || userConfigurationDictionaryEntry.getKey().getValues().size() <= 0 || !userConfigurationDictionaryEntry.getKey().getValues().get(0).equals("composefontflags") || userConfigurationDictionaryEntry.getValue() == null || userConfigurationDictionaryEntry.getValue().getValues().size() <= 0) {
                    continue;
                }
                this.N = Integer.parseInt(userConfigurationDictionaryEntry.getValue().getValues().get(0));
            }
        }
    }
    
    final List<UserConfigurationDictionaryEntry> a() {
        final ArrayList<UserConfigurationDictionaryEntry> list = new ArrayList<UserConfigurationDictionaryEntry>();
        if (this.a != null && this.a.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "timeFormat"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.a)));
        }
        if (this.b) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "showweeknumbers"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "showweeknumbers"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.c != null && this.c.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "signaturetext"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.c)));
        }
        if (this.d != null && this.d.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "signaturehtml"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.d)));
        }
        if (this.e != null && this.e.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "timezone"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.e)));
        }
        if (this.f > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "firstweekofyear"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.f))));
        }
        if (this.g) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "enablereminders"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "enablereminders"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.h) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "enableremindersound"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "enableremindersound"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.i != null && this.i.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "dateformat"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.i)));
        }
        if (this.j > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "hourincrement"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.j))));
        }
        if (this.k) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "IsOptimizedForAccessibility"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "IsOptimizedForAccessibility"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.l > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "weekstartday"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.l))));
        }
        if (this.m > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "FormatBarState"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.m))));
        }
        if (this.n) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "ShowTreeInListView"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "ShowTreeInListView"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.o > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "markasreaddelaytime"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.o))));
        }
        if (this.p > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "nextselection"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.p))));
        }
        if (this.q > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingdictionarylanguage"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.q))));
        }
        if (this.r > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "ConversationSortOrder"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.r))));
        }
        if (this.s) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "checknameincontactsfirst"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "checknameincontactsfirst"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.t) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingcheckbeforesend"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingcheckbeforesend"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.v != null && this.v.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "themeStorageId"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.v)));
        }
        if (this.w) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingignoreuppercase"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingignoreuppercase"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.x) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "emptydeleteditemsonlogoff"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "emptydeleteditemsonlogoff"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.y > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "previewmarkasread"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.y))));
        }
        if (this.z) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "autoaddsignature"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "autoaddsignature"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.A) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "autoaddsignatureonreply"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "autoaddsignatureonreply"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.B) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "alwaysshowfrom"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "alwaysshowfrom"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.C) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "HideDeletedItems"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "HideDeletedItems"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.D > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "sendasitemscopiedto"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.D))));
        }
        if (this.E) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingignoremixeddigits"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "spellingignoremixeddigits"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.F) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "alwaysshowbcc"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "alwaysshowbcc"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.G > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "sendonbehalfofcopiedto"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.G))));
        }
        if (this.H) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "isquicklinksbarvisible"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "true")));
        }
        else {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "isquicklinksbarvisible"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.BOOLEAN, "false")));
        }
        if (this.I > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "composemarkup"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.I))));
        }
        if (this.J >= 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "newitemnotify"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.J))));
        }
        if (this.K != null && this.K.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "composefontname"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.K)));
        }
        if (this.L != null && this.L.length() > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "composefontcolor"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.STRING, this.L)));
        }
        if (this.M > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "composefontsize"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.M))));
        }
        if (this.N > 0) {
            list.add(new UserConfigurationDictionaryEntry(new UserConfigurationDictionaryKey(UserConfigurationDictionaryObjectType.STRING, "composefontflags"), new UserConfigurationDictionaryValue(UserConfigurationDictionaryObjectType.INTEGER32, Integer.toString(this.N))));
        }
        return list;
    }
    
    public String getTimeFormat() {
        return this.a;
    }
    
    public void setTimeFormat(final String timeFormat) {
        this.a = timeFormat;
    }
    
    public boolean showWeekNumbers() {
        return this.b;
    }
    
    public void setShowWeekNumbers(final boolean showWeekNumbers) {
        this.b = showWeekNumbers;
    }
    
    public String getSignatureText() {
        return this.c;
    }
    
    public void setSignatureText(final String signatureText) {
        this.c = signatureText;
    }
    
    public String getSignatureHtml() {
        return this.d;
    }
    
    public void setSignatureHtml(final String signatureHtml) {
        this.d = signatureHtml;
    }
    
    public String getTimeZone() {
        return this.e;
    }
    
    public void setTimeZone(final String timeZone) {
        this.e = timeZone;
    }
    
    public int getFirstWeekOfYear() {
        return this.f;
    }
    
    public void setFirstWeekOfYear(final int firstWeekOfYear) {
        this.f = firstWeekOfYear;
    }
    
    public boolean isEnableReminders() {
        return this.g;
    }
    
    public void enableReminders(final boolean enableReminders) {
        this.g = enableReminders;
    }
    
    public boolean isEnableReminderSound() {
        return this.h;
    }
    
    public void enableReminderSound(final boolean enableReminderSound) {
        this.h = enableReminderSound;
    }
    
    public String getDateFormat() {
        return this.i;
    }
    
    public void setDateFormat(final String dateFormat) {
        this.i = dateFormat;
    }
    
    public int getHourIncrement() {
        return this.j;
    }
    
    public void setHourIncrement(final int hourIncrement) {
        this.j = hourIncrement;
    }
    
    public boolean isOptimizedForAccessibility() {
        return this.k;
    }
    
    public void setOptimizedForAccessibility(final boolean isOptimizedForAccessibility) {
        this.k = isOptimizedForAccessibility;
    }
    
    public int getWeekStartDay() {
        return this.l;
    }
    
    public void setWeekStartDay(final int weekStartDay) {
        this.l = weekStartDay;
    }
    
    public int getFormatBarState() {
        return this.m;
    }
    
    public void setFormatBarState(final int formatBarState) {
        this.m = formatBarState;
    }
    
    public boolean showTreeInListView() {
        return this.n;
    }
    
    public void setShowTreeInListView(final boolean showTreeInListView) {
        this.n = showTreeInListView;
    }
    
    public int getMarkAsReadDelayTime() {
        return this.o;
    }
    
    public void setMarkAsReadDelayTime(final int markAsReadDelayTime) {
        this.o = markAsReadDelayTime;
    }
    
    public int getNextSelection() {
        return this.p;
    }
    
    public void setNextSelection(final int nextSelection) {
        this.p = nextSelection;
    }
    
    public int getSpellingDictionaryLanguage() {
        return this.q;
    }
    
    public void setSpellingDictionaryLanguage(final int spellingDictionaryLanguage) {
        this.q = spellingDictionaryLanguage;
    }
    
    public int getConversationSortOrder() {
        return this.r;
    }
    
    public void setConversationSortOrder(final int conversationSortOrder) {
        this.r = conversationSortOrder;
    }
    
    public boolean isCheckNameInContactsFirst() {
        return this.s;
    }
    
    public void setCheckNameInContactsFirst(final boolean checkNameInContactsFirst) {
        this.s = checkNameInContactsFirst;
    }
    
    public boolean isSpellingCheckBeforeSend() {
        return this.t;
    }
    
    public void setSpellingCheckBeforeSend(final boolean spellingCheckBeforeSend) {
        this.t = spellingCheckBeforeSend;
    }
    
    public int getReadReceipt() {
        return this.u;
    }
    
    public void setReadReceipt(final int readReceipt) {
        this.u = readReceipt;
    }
    
    public String getThemeStorageId() {
        return this.v;
    }
    
    public void setThemeStorageId(final String themeStorageId) {
        this.v = themeStorageId;
    }
    
    public boolean isSpellingIgnoreUpperCase() {
        return this.w;
    }
    
    public void setSpellingIgnoreUpperCase(final boolean spellingIgnoreUpperCase) {
        this.w = spellingIgnoreUpperCase;
    }
    
    public boolean isEmptyDeletedItemsOnLogoff() {
        return this.x;
    }
    
    public void setEmptyDeletedItemsOnLogoff(final boolean emptyDeletedItemsOnLogoff) {
        this.x = emptyDeletedItemsOnLogoff;
    }
    
    public int getPreviewMarkAsRead() {
        return this.y;
    }
    
    public void setPreviewMarkAsRead(final int previewMarkAsRead) {
        this.y = previewMarkAsRead;
    }
    
    public boolean isAutoAddSignature() {
        return this.z;
    }
    
    public void setAutoAddSignature(final boolean autoAddSignature) {
        this.z = autoAddSignature;
    }
    
    public boolean isAutoAddSignatureOnReply() {
        return this.A;
    }
    
    public void setAutoAddSignatureOnReply(final boolean autoAddSignatureOnReply) {
        this.A = autoAddSignatureOnReply;
    }
    
    public boolean isAlwaysShowFrom() {
        return this.B;
    }
    
    public void setAlwaysShowFrom(final boolean alwaysShowFrom) {
        this.B = alwaysShowFrom;
    }
    
    public boolean isHideDeletedItems() {
        return this.C;
    }
    
    public void setHideDeletedItems(final boolean hideDeletedItems) {
        this.C = hideDeletedItems;
    }
    
    public int getSendAsItemsCopiedTo() {
        return this.D;
    }
    
    public void setSendAsItemsCopiedTo(final int sendAsItemsCopiedTo) {
        this.D = sendAsItemsCopiedTo;
    }
    
    public boolean isSpellingIgnoreMixedDigits() {
        return this.E;
    }
    
    public void setSpellingIgnoreMixedDigits(final boolean spellingIgnoreMixedDigits) {
        this.E = spellingIgnoreMixedDigits;
    }
    
    public boolean isAlwaysShowBcc() {
        return this.F;
    }
    
    public void setAlwaysShowBcc(final boolean alwaysShowBcc) {
        this.F = alwaysShowBcc;
    }
    
    public int getSendOnBehalfOfCopiedTo() {
        return this.G;
    }
    
    public void setSendOnBehalfOfCopiedTo(final int sendOnBehalfOfCopiedTo) {
        this.G = sendOnBehalfOfCopiedTo;
    }
    
    public boolean isQuicklinksBarVisible() {
        return this.H;
    }
    
    public void setQuicklinksBarVisible(final boolean isQuicklinksBarVisible) {
        this.H = isQuicklinksBarVisible;
    }
    
    public int getComposeMarkup() {
        return this.I;
    }
    
    public void setComposeMarkup(final int composeMarkup) {
        this.I = composeMarkup;
    }
    
    public int getNewItemNotify() {
        return this.J;
    }
    
    public void setNewItemNotify(final int newItemNotify) {
        this.J = newItemNotify;
    }
    
    public String getFontName() {
        return this.K;
    }
    
    public void setFontName(final String fontName) {
        this.K = fontName;
    }
    
    public String getFontColor() {
        return this.L;
    }
    
    public void setFontColor(final String fontColor) {
        this.L = fontColor;
    }
    
    public int getFontSize() {
        return this.M;
    }
    
    public void setFontSize(final int fontSize) {
        this.M = fontSize;
    }
    
    public int getFontFlags() {
        return this.N;
    }
    
    public void setFontFlags(final int fontFlags) {
        this.N = fontFlags;
    }
}

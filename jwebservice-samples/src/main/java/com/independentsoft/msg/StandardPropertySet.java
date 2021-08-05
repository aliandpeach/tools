package com.independentsoft.msg;

public class StandardPropertySet
{
    public static final byte[] MAPI;
    public static final byte[] PUBLIC_STRINGS;
    public static final byte[] INTERNET_HEADERS;
    public static final byte[] APPOINTMENT;
    public static final byte[] TASK;
    public static final byte[] ADDRESS;
    public static final byte[] COMMON;
    public static final byte[] NOTE;
    public static final byte[] JOURNAL;
    
    static {
        MAPI = new byte[] { 40, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        PUBLIC_STRINGS = new byte[] { 41, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        INTERNET_HEADERS = new byte[] { -122, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        APPOINTMENT = new byte[] { 2, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        TASK = new byte[] { 3, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        ADDRESS = new byte[] { 4, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        COMMON = new byte[] { 8, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        NOTE = new byte[] { 14, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        JOURNAL = new byte[] { 10, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
    }
}

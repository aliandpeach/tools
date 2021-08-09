package com.ews.exchange;

import java.text.*;
import java.io.*;
import java.nio.charset.*;
import java.nio.*;
import com.ews.msg.*;
import java.util.*;
import java.util.TimeZone;

final class d
{
    private static Calendar a;
    private static char[] b;
    
    static String a(final List<String> list) {
        String s = "";
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); ++i) {
                s += list.get(i);
                if (i < list.size() - 1) {
                    s += " ";
                }
            }
            return s;
        }
        return "https://outlook.office365.com/.default";
    }
    
    static String a(String s) {
        if (s == null) {
            return null;
        }
        return s = (s = (s = (s = (s = s.replace("&", "&amp;")).replace("<", "&lt;")).replace(">", "&gt;")).replace("'", "&apos;")).replace("\"", "&quot;");
    }
    
    static synchronized Date b(final String s) throws ParseException {
        String s2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        if (s.indexOf("Z") == -1) {
            s2 = "yyyy-MM-dd'T'HH:mm:ss";
        }
        else if (s.indexOf(".") > 0 && s.indexOf("Z") > s.indexOf(".")) {
            s2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }
        return new SimpleDateFormat(s2, Locale.US).parse(s);
    }
    
    static synchronized Date c(final String s) throws ParseException {
        String s2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        if (s.indexOf("Z") == -1) {
            s2 = "yyyy-MM-dd'T'HH:mm:ss";
        }
        else if (s.indexOf(".") > 0 && s.indexOf("Z") > s.indexOf(".")) {
            s2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }
        final SimpleDateFormat simpleDateFormat;
        (simpleDateFormat = new SimpleDateFormat(s2, Locale.US)).setCalendar(d.a);
        return simpleDateFormat.parse(s);
    }
    
    static synchronized Date a(final String s, final String s2) throws ParseException {
        final SimpleDateFormat simpleDateFormat;
        (simpleDateFormat = new SimpleDateFormat(s2, Locale.US)).setCalendar(d.a);
        return simpleDateFormat.parse(s);
    }
    
    static synchronized String a(final Date date) {
        final SimpleDateFormat simpleDateFormat;
        (simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)).setCalendar(d.a);
        return simpleDateFormat.format(date);
    }
    
    static synchronized String b(final Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).format(date);
    }
    
    static MapiPropertyType a(final long n) {
        final int n3;
        final int n2 = (n3 = (int)(n & 0xFFFFL)) & 0xFFF;
        MapiPropertyType mapiPropertyType;
        if ((n3 & 0xF000) != 0x0) {
            if (n2 == 2) {
                mapiPropertyType = MapiPropertyType.SHORT_ARRAY;
            }
            else if (n2 == 3) {
                mapiPropertyType = MapiPropertyType.INTEGER_ARRAY;
            }
            else if (n2 == 4) {
                mapiPropertyType = MapiPropertyType.FLOAT_ARRAY;
            }
            else if (n2 == 5) {
                mapiPropertyType = MapiPropertyType.DOUBLE_ARRAY;
            }
            else if (n2 == 6) {
                mapiPropertyType = MapiPropertyType.CURRENCY_ARRAY;
            }
            else if (n2 == 7) {
                mapiPropertyType = MapiPropertyType.APPLICATION_TIME_ARRAY;
            }
            else if (n2 == 20) {
                mapiPropertyType = MapiPropertyType.LONG_ARRAY;
            }
            else if (n2 == 30) {
                mapiPropertyType = MapiPropertyType.STRING_ARRAY;
            }
            else if (n2 == 31) {
                mapiPropertyType = MapiPropertyType.STRING_ARRAY;
            }
            else if (n2 == 64) {
                mapiPropertyType = MapiPropertyType.SYSTEM_TIME_ARRAY;
            }
            else if (n2 == 72) {
                mapiPropertyType = MapiPropertyType.CLSID_ARRAY;
            }
            else if (n2 == 258) {
                mapiPropertyType = MapiPropertyType.BINARY_ARRAY;
            }
            else {
                mapiPropertyType = MapiPropertyType.NULL;
            }
        }
        else if (n2 == 2) {
            mapiPropertyType = MapiPropertyType.SHORT;
        }
        else if (n2 == 3) {
            mapiPropertyType = MapiPropertyType.INTEGER;
        }
        else if (n2 == 4) {
            mapiPropertyType = MapiPropertyType.FLOAT;
        }
        else if (n2 == 5) {
            mapiPropertyType = MapiPropertyType.DOUBLE;
        }
        else if (n2 == 6) {
            mapiPropertyType = MapiPropertyType.CURRENCY;
        }
        else if (n2 == 7) {
            mapiPropertyType = MapiPropertyType.APPLICATION_TIME;
        }
        else if (n2 == 10) {
            mapiPropertyType = MapiPropertyType.ERROR;
        }
        else if (n2 == 11) {
            mapiPropertyType = MapiPropertyType.BOOLEAN;
        }
        else if (n2 == 20) {
            mapiPropertyType = MapiPropertyType.LONG;
        }
        else if (n2 == 30) {
            mapiPropertyType = MapiPropertyType.STRING;
        }
        else if (n2 == 31) {
            mapiPropertyType = MapiPropertyType.STRING;
        }
        else if (n2 == 64) {
            mapiPropertyType = MapiPropertyType.SYSTEM_TIME;
        }
        else if (n2 == 72) {
            mapiPropertyType = MapiPropertyType.CLSID;
        }
        else if (n2 == 258) {
            mapiPropertyType = MapiPropertyType.BINARY;
        }
        else {
            mapiPropertyType = MapiPropertyType.NULL;
        }
        return mapiPropertyType;
    }
    
    static byte[] d(final String s) {
        byte[] bytes = null;
        try {
            bytes = s.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return bytes;
    }
    
    static String a(byte[] array) {
        final byte[] array2 = array;
        final int length = array.length;
        array = array2;
        final StringBuffer sb = new StringBuffer(array.length * 3 / 2);
        int n;
        int i;
        for (n = length - 3, i = 0; i <= n; i += 3) {
            final int n2 = (array[i] & 0xFF) << 16 | (array[i + 1] & 0xFF) << 8 | (array[i + 2] & 0xFF);
            sb.append(d.b[n2 >> 18 & 0x3F]);
            sb.append(d.b[n2 >> 12 & 0x3F]);
            sb.append(d.b[n2 >> 6 & 0x3F]);
            sb.append(d.b[n2 & 0x3F]);
        }
        if (i == length + 0 - 2) {
            final int n3 = (array[i] & 0xFF) << 16 | (array[i + 1] & 0xFF) << 8;
            sb.append(d.b[n3 >> 18 & 0x3F]);
            sb.append(d.b[n3 >> 12 & 0x3F]);
            sb.append(d.b[n3 >> 6 & 0x3F]);
            sb.append("=");
        }
        else if (i == length + 0 - 1) {
            final int n4 = (array[i] & 0xFF) << 16;
            sb.append(d.b[n4 >> 18 & 0x3F]);
            sb.append(d.b[n4 >> 12 & 0x3F]);
            sb.append("==");
        }
        return sb.toString();
    }
    
    private static int a(final char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + '\u001a';
        }
        if (c >= '0' && c <= '9') {
            return c - '0' + '\u001a' + '\u001a';
        }
        switch (c) {
            case '+': {
                return 62;
            }
            case '/': {
                return 63;
            }
            case '=': {
                return 0;
            }
            default: {
                throw new RuntimeException("unexpected code: " + c);
            }
        }
    }
    
    static byte[] e(final String s) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(s, byteArrayOutputStream);
        }
        catch (IOException ex) {
            throw new RuntimeException();
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    private static void a(final String s, final OutputStream outputStream) throws IOException {
        int n = 0;
        final int length = s.length();
        while (true) {
            if (n < length && s.charAt(n) <= ' ') {
                ++n;
            }
            else {
                if (n == length) {
                    break;
                }
                final int n2 = (a(s.charAt(n)) << 18) + (a(s.charAt(n + 1)) << 12) + (a(s.charAt(n + 2)) << 6) + a(s.charAt(n + 3));
                outputStream.write(n2 >> 16 & 0xFF);
                if (s.charAt(n + 2) == '=') {
                    break;
                }
                outputStream.write(n2 >> 8 & 0xFF);
                if (s.charAt(n + 3) == '=') {
                    break;
                }
                outputStream.write(n2 & 0xFF);
                n += 4;
            }
        }
    }
    
    static String f(String s) {
        if (s == null) {
            return null;
        }
        final int index;
        if ((index = s.indexOf(":")) <= 0) {
            return null;
        }
        if ((s = (s = s.substring(0, index)).toLowerCase()).equals("message")) {
            return "Message";
        }
        if (s.equals("calendar")) {
            return "CalendarItem";
        }
        if (s.equals("contacts")) {
            return "Contact";
        }
        if (s.equals("task")) {
            return "Task";
        }
        if (s.equals("meeting")) {
            return "MeetingRequest";
        }
        if (s.equals("postitem")) {
            return "PostItem";
        }
        if (s.equals("distributionlist")) {
            return "DistributionList";
        }
        return "Item";
    }
    
    static String g(String substring) {
        if (substring == null) {
            return null;
        }
        final int index;
        if ((index = substring.indexOf(":")) <= 0) {
            return null;
        }
        return substring = substring.substring(index + 1);
    }
    
    static String a(final IndexedPropertyPathUri indexedPropertyPathUri, final String s, final String s2) {
        String s3 = "";
        if (indexedPropertyPathUri == IndexedPropertyPathUri.EMAIL_ADDRESS) {
            s3 = s3 + "<t:Contact>" + "<t:EmailAddresses>" + "<t:Entry Key=\"" + s + "\">" + a(s2) + "</t:Entry>" + "</t:EmailAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.PHONE_NUMBER) {
            s3 = s3 + "<t:Contact>" + "<t:PhoneNumbers>" + "<t:Entry Key=\"" + s + "\">" + a(s2) + "</t:Entry>" + "</t:PhoneNumbers>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.INSTANT_MESSENGER_ADDRESS) {
            s3 = s3 + "<t:Contact>" + "<t:ImAddresses>" + "<t:Entry Key=\"" + s + "\">" + a(s2) + "</t:Entry>" + "</t:ImAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.STREET) {
            s3 = s3 + "<t:Contact>" + "<t:PhysicalAddresses>" + "<t:Entry Key=\"" + s + "\"><t:Street>" + a(s2) + "</t:Street></t:Entry>" + "</t:PhysicalAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.CITY) {
            s3 = s3 + "<t:Contact>" + "<t:PhysicalAddresses>" + "<t:Entry Key=\"" + s + "\"><t:City>" + a(s2) + "</t:City></t:Entry>" + "</t:PhysicalAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.COUNTRY) {
            s3 = s3 + "<t:Contact>" + "<t:PhysicalAddresses>" + "<t:Entry Key=\"" + s + "\"><t:CountryOrRegion>" + a(s2) + "</t:CountryOrRegion></t:Entry>" + "</t:PhysicalAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.POSTAL_CODE) {
            s3 = s3 + "<t:Contact>" + "<t:PhysicalAddresses>" + "<t:Entry Key=\"" + s + "\"><t:PostalCode>" + a(s2) + "</t:PostalCode></t:Entry>" + "</t:PhysicalAddresses>" + "</t:Contact>";
        }
        else if (indexedPropertyPathUri == IndexedPropertyPathUri.STATE) {
            s3 = s3 + "<t:Contact>" + "<t:PhysicalAddresses>" + "<t:Entry Key=\"" + s + "\"><t:State>" + a(s2) + "</t:State></t:Entry>" + "</t:PhysicalAddresses>" + "</t:Contact>";
        }
        return s3;
    }
    
    static byte[] h(String string) {
        final byte[] array = { 0, 0, 0, 0, -127, 43, 31, -92, -66, -93, 16, 25, -99, 110, 0, -35, 1, 15, 84, 2, 0, 0, 1, -128 };
        string = string + "\u0000SMTP\u0000" + string + "\u0000";
        final ByteBuffer encode;
        final byte[] array2 = new byte[(encode = Charset.forName("UTF-16LE").encode(string)).limit()];
        System.arraycopy(encode.array(), 0, array2, 0, array2.length);
        final byte[] array3 = new byte[24 + array2.length];
        System.arraycopy(array, 0, array3, 0, 24);
        System.arraycopy(array2, 0, array3, 24, array2.length);
        return array3;
    }
    
    static String b(final List<String> list) {
        final byte[] array = { 2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 5, 82, 101, 112, 108, 121, 8, 73, 80, 77, 46, 78, 111, 116, 101, 7, 77, 101, 115, 115, 97, 103, 101, 2, 82, 69, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 102, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 12, 82, 101, 112, 108, 121, 32, 116, 111, 32, 65, 108, 108, 8, 73, 80, 77, 46, 78, 111, 116, 101, 7, 77, 101, 115, 115, 97, 103, 101, 2, 82, 69, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 103, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 7, 70, 111, 114, 119, 97, 114, 100, 8, 73, 80, 77, 46, 78, 111, 116, 101, 7, 77, 101, 115, 115, 97, 103, 101, 2, 70, 87, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 104, 0, 0, 0, 4, 0, 0, 0, 3, 0, 0, 0, 15, 82, 101, 112, 108, 121, 32, 116, 111, 32, 70, 111, 108, 100, 101, 114, 8, 73, 80, 77, 46, 80, 111, 115, 116, 4, 80, 111, 115, 116, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 108, 0, 0, 0, 8, 0, 0, 0, 4, 0, 0, 0 };
        final byte[] array2 = { 8, 73, 80, 77, 46, 78, 111, 116, 101, 0 };
        final byte[] array3 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, -1, -1, -1, -1, 4, 0, 0, 0 };
        final byte[] array4 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, -1, -1, -1, -1, 4, 1, 5, 82, 0, 101, 0, 112, 0, 108, 0, 121, 0, 2, 82, 0, 69, 0, 12, 82, 0, 101, 0, 112, 0, 108, 0, 121, 0, 32, 0, 116, 0, 111, 0, 32, 0, 65, 0, 108, 0, 108, 0, 2, 82, 0, 69, 0, 7, 70, 0, 111, 0, 114, 0, 119, 0, 97, 0, 114, 0, 100, 0, 2, 70, 0, 87, 0, 15, 82, 0, 101, 0, 112, 0, 108, 0, 121, 0, 32, 0, 116, 0, 111, 0, 32, 0, 70, 0, 111, 0, 108, 0, 100, 0, 101, 0, 114, 0, 0 };
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = null;
        try {
            byteArrayOutputStream.write(array);
            for (int i = 0; i < list.size(); ++i) {
                final byte[] d = d(list.get(i));
                byteArrayOutputStream.write((byte)d.length);
                byteArrayOutputStream.write(d);
                byteArrayOutputStream.write(array2);
                byteArrayOutputStream.write((byte)d.length);
                byteArrayOutputStream.write(d);
                if (i < list.size() - 1) {
                    byteArrayOutputStream.write(array3);
                }
            }
            byteArrayOutputStream.write(array4);
            for (int j = 0; j < list.size(); ++j) {
                final byte[] d2 = d(list.get(j));
                byteArrayOutputStream.write((byte)d2.length);
                for (int k = 0; k < d2.length; ++k) {
                    byteArrayOutputStream.write(d2[k]);
                    byteArrayOutputStream.write(0);
                }
                byteArrayOutputStream.write((byte)d2.length);
                for (int l = 0; l < d2.length; ++l) {
                    byteArrayOutputStream.write(d2[l]);
                    byteArrayOutputStream.write(0);
                }
            }
            (byteArray = byteArrayOutputStream.toByteArray())[2] = (byte)(list.size() + 4);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return a(byteArray);
    }
    
    static byte[] a(final StandardPropertySet set) {
        if (set == StandardPropertySet.ADDRESS) {
            return new byte[] { 4, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        if (set == StandardPropertySet.APPOINTMENT) {
            return new byte[] { 2, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        if (set == StandardPropertySet.COMMON) {
            return new byte[] { 8, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        if (set == StandardPropertySet.INTERNET_HEADERS) {
            return new byte[] { -122, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        if (set == StandardPropertySet.PUBLIC_STRINGS) {
            return new byte[] { 41, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        if (set == StandardPropertySet.TASK) {
            return new byte[] { 3, 32, 6, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
        }
        return new byte[] { 40, 3, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
    }
    
    static PropertyType a(final MapiPropertyType mapiPropertyType) {
        if (mapiPropertyType == MapiPropertyType.APPLICATION_TIME || mapiPropertyType == MapiPropertyType.SYSTEM_TIME) {
            return PropertyType.TIME;
        }
        if (mapiPropertyType == MapiPropertyType.BINARY) {
            return PropertyType.BINARY;
        }
        if (mapiPropertyType == MapiPropertyType.BOOLEAN) {
            return PropertyType.BOOLEAN;
        }
        if (mapiPropertyType == MapiPropertyType.CLSID) {
            return PropertyType.GUID;
        }
        if (mapiPropertyType == MapiPropertyType.CURRENCY) {
            return PropertyType.CURRENCY;
        }
        if (mapiPropertyType == MapiPropertyType.DOUBLE) {
            return PropertyType.FLOATING64;
        }
        if (mapiPropertyType == MapiPropertyType.FLOAT) {
            return PropertyType.FLOATING32;
        }
        if (mapiPropertyType == MapiPropertyType.INTEGER) {
            return PropertyType.INTEGER32;
        }
        if (mapiPropertyType == MapiPropertyType.LONG) {
            return PropertyType.INTEGER64;
        }
        if (mapiPropertyType == MapiPropertyType.SHORT) {
            return PropertyType.INTEGER16;
        }
        return PropertyType.STRING;
    }
    
    public static byte[] a(final UUID uuid) {
        final long mostSignificantBits = uuid.getMostSignificantBits();
        final long leastSignificantBits = uuid.getLeastSignificantBits();
        final byte[] array = new byte[16];
        for (int i = 0; i < 8; ++i) {
            array[i] = (byte)(mostSignificantBits >>> 8 * (7 - i));
        }
        for (int j = 8; j < 16; ++j) {
            array[j] = (byte)(leastSignificantBits >>> 8 * (7 - j));
        }
        return array;
    }
    
    static byte[] b(byte[] array) {
        final byte[] array2 = Charset.forName("US-ASCII").encode("{\\rtf1\\ansi\\mac\\deff0\\deftab720{\\fonttbl;}{\\f0\\fnil \\froman \\fswiss \\fmodern \\fscript \\fdecor MS Sans SerifSymbolArialTimes New RomanCourier{\\colortbl\\red0\\green0\\blue0\n\r\\par \\pard\\plain\\f0\\fs20\\b\\i\\u\\tab\\tx").array();
        int n = 0;
        if (array == null || array.length < 16) {
            throw new IllegalArgumentException("Invalid PR_RTF_COMPRESSION header");
        }
        final int n2 = (int)a(array, 0);
        n += 4;
        final int n3 = (int)a(array, 4);
        n += 4;
        final int n4 = (int)a(array, 8);
        n += 4;
        n += 4;
        if (n2 != array.length - 4) {
            throw new IllegalArgumentException("Invalid PR_RTF_COMPRESSION size.");
        }
        byte[] array3;
        if (n4 == 1095517517) {
            array3 = new byte[n3];
            System.arraycopy(array, 16, array3, 0, n3);
        }
        else {
            if (n4 != 1967544908) {
                throw new IllegalArgumentException("Wrong magic number.");
            }
            final byte[] array4 = new byte[array2.length + n3];
            System.arraycopy(array2, 0, array4, 0, array2.length);
            int i = array2.length;
            int n5 = 0;
            int n6 = 0;
            while (i < array4.length) {
                if (((n6 = ((n5++ % 8 == 0) ? (array[n++] & 0xFF) : (n6 >> 1))) & 0x1) == 0x1) {
                    final int n7 = array[n++] & 0xFF;
                    final int n8 = array[n++] & 0xFF;
                    final int n9 = n7 << 4 | n8 >> 4;
                    final int n10 = (n8 & 0xF) + 2;
                    int j;
                    if ((j = (i / 4096 << 12) + n9) >= i) {
                        j -= 4096;
                    }
                    while (j < j + n10) {
                        array4[i++] = array4[j++];
                    }
                }
                else {
                    array4[i++] = array[n++];
                }
            }
            array = array4;
            array3 = new byte[n3];
            System.arraycopy(array, array2.length, array3, 0, n3);
        }
        return array3;
    }
    
    private static long a(final byte[] array, final int n) {
        return ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24) & 0xFFFFFFFFL;
    }
    
    static {
        d.a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        d.b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    }
}

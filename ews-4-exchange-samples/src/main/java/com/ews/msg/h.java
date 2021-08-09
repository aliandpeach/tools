package com.ews.msg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

final class h
{
    private static Calendar a;
    private static Calendar b;
    
    static String a(final int n, final byte[] array) {
        if (array != null) {
            return Integer.toString(n) + "-" + new BigInteger(array).toString();
        }
        return Integer.toString(n);
    }
    
    static String a(String string, final byte[] array) {
        if (array != null) {
            return string = string + "-" + new BigInteger(array).toString();
        }
        return string;
    }
    
    static Date a(byte[] array) {
        return new Date((((array = array)[0] & 0xFFL) | (array[1] & 0xFFL) << 8 | (array[2] & 0xFFL) << 16 | (array[3] & 0xFFL) << 24 | (array[4] & 0xFFL) << 32 | (array[5] & 0xFFL) << 40 | (array[6] & 0xFFL) << 48 | (array[7] & 0xFFL) << 56) / 10000L - 11644473600000L);
    }
    
    static byte[] a(final Date time) {
        h.a.set(1601, 0, 1, 0, 0, 0);
        h.b.setTime(time);
        final long n = (h.b.getTimeInMillis() - h.a.getTimeInMillis()) / 1000L * 10000000L;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(8)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(n);
        return allocate.array();
    }
    
    static b b(byte[] substring) {
        final String string;
        final Charset b = b(string = Charset.forName("UTF-8").decode(ByteBuffer.wrap(substring)).toString());
        final HashMap<String, Charset> c = c(string);
        final String replace = string.replace("\n\r{", "{");
        String s = null;
        final int index;
        if ((index = replace.indexOf("{\\*\\htmltag")) >= 0) {
            String s2;
            for (int i = (s2 = replace.substring(index)).indexOf("\\'"); i >= 0; i = s2.indexOf("\\'")) {
                final String s3 = s2;
                final HashMap<String, Charset> hashMap = c;
                final Charset charset = b;
                final int n = i;
                final Charset charset2 = charset;
                final HashMap<String, Charset> hashMap2 = hashMap;
                final String substring2 = s3.substring(0, n);
                Charset charset3 = charset2;
                int n2 = -1;
                for (final String s4 : hashMap2.keySet()) {
                    final int lastIndex;
                    if ((lastIndex = substring2.lastIndexOf("\\" + s4)) >= 0 && lastIndex > n2) {
                        charset3 = ((hashMap2.get(s4) != null) ? hashMap2.get(s4) : charset2);
                        n2 = lastIndex;
                    }
                }
                final Charset charset4 = charset3;
                final int index2 = s2.indexOf("\\'", i + 2);
                String s5 = null;
                try {
                    if (index2 == i + 4) {
                        final String s6 = s2;
                        final int n3 = i;
                        substring = new byte[] { (byte)Integer.parseInt((s5 = s6.substring(n3, n3 + 8)).substring(2, 4), 16), (byte)Integer.parseInt(s5.substring(6, 8), 16) };
                    }
                    else {
                        final String s7 = s2;
                        final int n4 = i;
                        substring = new byte[] { (byte)Integer.parseInt((s5 = s7.substring(n4, n4 + 4)).substring(2), 16) };
                    }
                    if (s5 != null) {
                        s2 = s2.replace(s5, charset4.decode(ByteBuffer.wrap(substring)).toString());
                    }
                }
                catch (NumberFormatException ex) {
                    final String s8 = s2;
                    final String s9 = s5;
                    s2 = s8.replace(s9, s9.substring(1));
                }
                catch (IllegalArgumentException ex2) {
                    final String s10 = s2;
                    final String s11 = s5;
                    s2 = s10.replace(s11, s11.substring(1));
                }
            }
            int j = 0;
            while (j >= 0) {
                if ((j = s2.indexOf("{\\*\\htmltag", 0)) >= 0) {
                    final int index3 = s2.indexOf("}", j);
                    final int index4 = s2.indexOf(" ", j);
                    final int index5;
                    if ((index5 = s2.indexOf("<", j)) >= 0 && index3 >= 0 && index5 < index3 && index5 < index4) {
                        s2 = s2.replace(s2.substring(j, index3 + 1), s2.substring(index5, index3));
                    }
                    else if (index4 >= 0 && index3 >= 0 && index4 < index3) {
                        s2 = s2.replace(s2.substring(j, index3 + 1), s2.substring(index4 + 1, index3));
                    }
                    else {
                        s2 = s2.replace(s2.substring(j, index3 + 1), "");
                    }
                }
            }
            final ArrayList<Integer> list = new ArrayList<Integer>();
            int index6 = 0;
            int index7 = 0;
            while (index6 >= 0 && index7 >= 0) {
                if ((index6 = s2.indexOf("\\htmlrtf", index6)) >= 0) {
                    index7 = s2.indexOf("\\htmlrtf0", index6);
                    final int n5 = (index7 == s2.indexOf("\\htmlrtf0 ", index6)) ? 10 : 9;
                    if (index7 < 0) {
                        continue;
                    }
                    list.add(index6);
                    list.add(index7 + n5);
                    index6 = index7 + n5;
                }
                else {
                    index7 = -1;
                }
            }
            final StringBuilder sb = new StringBuilder(s2.length());
            int n6 = 0;
            for (int k = 0; k < list.size() - 1; k += 2) {
                final int intValue = list.get(k);
                final int intValue2 = list.get(k + 1);
                sb.append(s2.substring(n6, intValue));
                n6 = intValue2;
            }
            sb.append(s2.substring(n6, s2.length()));
            final String string2 = sb.toString();
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            int index8 = 0;
            int index9 = 0;
            while (index8 >= 0 && index9 >= 0) {
                if ((index8 = string2.indexOf("{\\pntext", index8)) >= 0) {
                    if ((index9 = string2.indexOf("}", index8)) < 0) {
                        continue;
                    }
                    list2.add(index8);
                    list2.add(index9 + 1);
                    index8 = index9 + 1;
                }
                else {
                    index9 = -1;
                }
            }
            final StringBuilder sb2 = new StringBuilder(string2.length());
            int n7 = 0;
            for (int l = 0; l < list2.size() - 1; l += 2) {
                final int intValue3 = list2.get(l);
                final int intValue4 = list2.get(l + 1);
                sb2.append(string2.substring(n7, intValue3));
                n7 = intValue4;
            }
            sb2.append(string2.substring(n7, string2.length()));
            for (int n8 = (s = sb2.toString().replace("\\{", "{").replace("\\}", "%x7D").replace("{}", "").replace("}", "").replace("%x7D", "}").replace("\\\\", "\\").replace("\\line", "").replace("\\pard", "").replace("\\par", "").replace("\\tab", "\t").replace("\\plain", "").replace("\\fs20", "").replace("\\f4", "").replace("\\f5", "").replace("\\f6", "").replace("\\objattph", "").replace("\\li360", "").replace("\\li720", "").replace("\\li1080", "").replace("\\li1440", "").replace("\\li1800", "").replace("\\li2160", "").replace("\\li2520", "").replace("\\li2880", "").replace("\\fi-360", "").replace("\\fi-720", "").replace("\\rtlch", "").replace("\\ltrch", "").replace("\\sb100", "").replace("\\intbl", "").replace("\\cbpat1", "").replace("\\cbpat2", "").replace("\\cbpat3", "").replace("\\cbpat4", "").replace("\\cbpat5", "").replace("\\cbpat6", "").replace("\\cbpat7", "").replace("\\cbpat8", "").replace("\\sb90", "").replace("\\sb150", "").replace("\\sb240", "").replace("\\qc", "").replace("\\qr", "").replace("\\fs18", "").replace("\\b0", "").replace("\\b", "").replace("\\protect", "").replace("\\itap2", "").replace("\\itap3", "")).indexOf("\\*\\mhtmltag"); n8 >= 0; n8 = (s = s.substring(0, n8) + s.substring(n8 + 14)).indexOf("\\*\\mhtmltag")) {}
            int index10 = 0;
            while (index10 >= 0) {
                if ((index10 = s.indexOf("\\u", index10)) >= 0) {
                    final int index11;
                    if ((index11 = s.indexOf("?", index10)) >= 0 && index11 <= index10 + 8) {
                        substring = (byte[])(Object)s.substring(index10, index11 + 1);
                        final String substring3 = s.substring(index10 + 2, index11);
                        try {
                            s = s.replace((CharSequence)(Object)substring, Character.toString((char)Integer.parseInt(substring3)));
                            continue;
                        }
                        catch (NumberFormatException ex3) {
                            final String s12 = s;
                            final byte[] array = substring;
                            s = s12.replace((CharSequence)(Object)array, ((String)(Object)array).substring(1));
                            continue;
                        }
                    }
                    ++index10;
                }
            }
        }
        if (s != null) {
            return new b(s, b);
        }
        return null;
    }
    
    private static Charset b(String substring) {
        Charset charset = Charset.forName("windows-1252");
        final int index;
        final int index2;
        if ((index = substring.indexOf("ansicpg")) >= 0 && (index2 = substring.indexOf("\\", index + 7)) >= 0) {
            substring = substring.substring(index + 7, index2);
            try {
                charset = a(Integer.parseInt(substring));
            }
            catch (Exception ex) {}
        }
        return charset;
    }
    
    private static HashMap<String, Charset> c(String substring) {
        final HashMap<String, Charset> hashMap = new HashMap<String, Charset>();
        try {
            final int index;
            final int index2;
            if ((index = ((String)substring).indexOf("{\\fonttbl")) > 0 && (index2 = ((String)substring).indexOf("}}", index)) > 0) {
                substring = ((String)substring).substring(index + 8, index2 + 8);
                BufferedReader reader = new BufferedReader(new StringReader((String)substring));
                String line;
                while ((line = reader.readLine()) != null) {
                    final int index3;
                    final int index4;
                    final String[] split;
                    if ((index3 = line.indexOf("{")) >= 0 && (index4 = line.indexOf("}", index3)) >= 0 && (split = line.substring(index3 + 1, index4).split("(\\s+)|(\\\\)")).length > 1 && split[1].startsWith("f")) {
                        final String s = split[1];
                        Charset charset = null;
                        for (int i = 2; i < split.length; ++i) {
                            if (split[i].equals("fcharset128")) {
                                try {
                                    charset = Charset.forName("cp942");
                                }
                                catch (Exception ex2) {}
                            }
                            else if (split[i].equals("fcharset129")) {
                                try {
                                    charset = Charset.forName("ks_c_5601-1987");
                                }
                                catch (Exception ex3) {}
                            }
                            else if (split[i].equals("fcharset134")) {
                                try {
                                    charset = Charset.forName("gb2312");
                                }
                                catch (Exception ex4) {}
                            }
                            else if (split[i].equals("fcharset136")) {
                                try {
                                    charset = Charset.forName("big5");
                                }
                                catch (Exception ex5) {}
                            }
                            else if (split[i].equals("fcharset161")) {
                                try {
                                    charset = Charset.forName("windows-1253");
                                }
                                catch (Exception ex6) {}
                            }
                            else if (split[i].equals("fcharset162")) {
                                try {
                                    charset = Charset.forName("windows-1254");
                                }
                                catch (Exception ex7) {}
                            }
                            else if (split[i].equals("fcharset163")) {
                                try {
                                    charset = Charset.forName("windows-1258");
                                }
                                catch (Exception ex8) {}
                            }
                            else if (split[i].equals("fcharset177")) {
                                try {
                                    charset = Charset.forName("windows-1255");
                                }
                                catch (Exception ex9) {}
                            }
                            else if (split[i].equals("fcharset178")) {
                                try {
                                    charset = Charset.forName("windows-1256");
                                }
                                catch (Exception ex10) {}
                            }
                            else if (split[i].equals("fcharset186")) {
                                try {
                                    charset = Charset.forName("windows-1257");
                                }
                                catch (Exception ex11) {}
                            }
                            else if (split[i].equals("fcharset204")) {
                                try {
                                    charset = Charset.forName("windows-1251");
                                }
                                catch (Exception ex12) {}
                            }
                            else if (split[i].equals("fcharset222")) {
                                try {
                                    charset = Charset.forName("windows-874");
                                }
                                catch (Exception ex13) {}
                            }
                            else if (split[i].equals("fcharset238")) {
                                try {
                                    charset = Charset.forName("windows-1250");
                                }
                                catch (Exception ex14) {}
                            }
                        }
                        if (hashMap.containsKey(s)) {
                            continue;
                        }
                        hashMap.put(s, charset);
                    }
                }
            }
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
        return hashMap;
    }
    
    static String[] a(final byte[] array, final String s) {
        if (array == null || array.length < 4) {
            return new String[0];
        }
        final ByteBuffer wrap;
        final int int1;
        if ((int1 = (wrap = ByteBuffer.wrap(array)).getInt()) > 32767) {
            return new String[0];
        }
        final Charset forName = Charset.forName(s);
        final String[] array2 = new String[int1];
        for (int i = 0; i < int1; ++i) {
            final int int2 = wrap.getInt((i << 2) + 4);
            int n = array.length;
            if (i < int1 - 1) {
                n = wrap.getInt((i << 2) + 8);
            }
            if (n >= int2) {
                array2[i] = forName.decode(ByteBuffer.wrap(array, int2, n - int2)).toString();
            }
        }
        return array2;
    }
    
    static byte[] a(final String s) {
        final Charset forName = Charset.forName("UTF-16LE");
        final byte[] array = { 0, 0, 0, 0, -127, 43, 31, -92, -66, -93, 16, 19, -99, 110, 0, -35, 1, 15, 84, 2, 0, 0, 1, -128 };
        final ByteBuffer encode;
        final byte[] array2 = new byte[(encode = forName.encode(s + "\u0000SMTP\u0000" + s + "\u0000")).limit()];
        final byte[] array3;
        final int n = (array3 = new byte[36 + array2.length]).length - 8;
        System.arraycopy(encode.array(), 0, array2, 0, array2.length);
        System.arraycopy(array, 0, array3, 0, 24);
        System.arraycopy(array2, 0, array3, 24, array2.length);
        System.arraycopy(new d(1).a(), 0, array3, 0, 4);
        System.arraycopy(new d(n).a(), 0, array3, 4, 4);
        System.arraycopy(new d(n - 6).a(), 0, array3, 8, 4);
        System.arraycopy(array, 0, array3, 12, 24);
        System.arraycopy(array2, 0, array3, 36, array2.length);
        return array3;
    }
    
    static int a(final byte[] array, final PropertyType propertyType, final int n) {
        if (array == null && (propertyType == PropertyType.STRING || propertyType == PropertyType.STRING8)) {
            return 1;
        }
        if (array != null && (propertyType == PropertyType.STRING || propertyType == PropertyType.STRING8)) {
            return array.length + n;
        }
        if (array == null) {
            return 0;
        }
        return array.length;
    }
    
    static int a(final PropertyType propertyType) {
        if (propertyType == PropertyType.INTEGER16) {
            return 2;
        }
        if (propertyType == PropertyType.INTEGER32) {
            return 3;
        }
        if (propertyType == PropertyType.FLOATING32) {
            return 4;
        }
        if (propertyType == PropertyType.FLOATING64) {
            return 5;
        }
        if (propertyType == PropertyType.CURRENCY) {
            return 6;
        }
        if (propertyType == PropertyType.FLOATING_TIME) {
            return 7;
        }
        if (propertyType == PropertyType.BOOLEAN) {
            return 11;
        }
        if (propertyType == PropertyType.OBJECT) {
            return 13;
        }
        if (propertyType == PropertyType.INTEGER64) {
            return 20;
        }
        if (propertyType == PropertyType.STRING8) {
            return 30;
        }
        if (propertyType == PropertyType.STRING) {
            return 31;
        }
        if (propertyType == PropertyType.TIME) {
            return 64;
        }
        if (propertyType == PropertyType.GUID) {
            return 72;
        }
        if (propertyType == PropertyType.BINARY) {
            return 258;
        }
        if (propertyType == PropertyType.MULTIPLE_INTEGER16) {
            return 4098;
        }
        if (propertyType == PropertyType.MULTIPLE_INTEGER32) {
            return 4099;
        }
        if (propertyType == PropertyType.MULTIPLE_FLOATING32) {
            return 4100;
        }
        if (propertyType == PropertyType.MULTIPLE_FLOATING64) {
            return 4101;
        }
        if (propertyType == PropertyType.MULTIPLE_CURRENCY) {
            return 4102;
        }
        if (propertyType == PropertyType.MULTIPLE_FLOATING_TIME) {
            return 4103;
        }
        if (propertyType == PropertyType.MULTIPLE_INTEGER64) {
            return 4116;
        }
        if (propertyType == PropertyType.MULTIPLE_STRING8) {
            return 4126;
        }
        if (propertyType == PropertyType.MULTIPLE_STRING) {
            return 4127;
        }
        if (propertyType == PropertyType.MULTIPLE_TIME) {
            return 4160;
        }
        if (propertyType == PropertyType.MULTIPLE_GUID) {
            return 4168;
        }
        if (propertyType == PropertyType.MULTIPLE_BINARY) {
            return 4354;
        }
        return 30;
    }
    
    static int a(final List<e> list, final e e) {
        if (list.isEmpty()) {
            return -1;
        }
        boolean b = false;
        for (int i = 0; i < list.size(); ++i) {
            final e e2;
            if ((e2 = list.get(i)).b() != null && e.b() != null && e2.b().equals(e.b())) {
                b = true;
            }
            else if (e2.a() != null && e.a() != null && e2.a().longValue() == e.a().longValue() && e2.d() == f.a) {
                b = true;
            }
            if (b) {
                boolean b2 = true;
                if (e2.c() != null && e.c() != null && e2.c().length == e.c().length) {
                    for (int j = 0; j < e2.c().length; ++j) {
                        if (e2.c()[j] != e.c()[j]) {
                            b2 = false;
                        }
                    }
                }
                else {
                    b2 = false;
                }
                if (b2) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static Charset a(final int n) {
        try {
            if (n == 936) {
                return Charset.forName("x-EUC-CN");
            }
            if (n == 949) {
                return Charset.forName("Cp949");
            }
            if (n == 1250) {
                return Charset.forName("windows-1250");
            }
            if (n == 1251) {
                return Charset.forName("windows-1251");
            }
            if (n == 1252) {
                return Charset.forName("windows-1252");
            }
            if (n == 1253) {
                return Charset.forName("windows-1253");
            }
            if (n == 1254) {
                return Charset.forName("windows-1254");
            }
            if (n == 1255) {
                return Charset.forName("windows-1255");
            }
            if (n == 1256) {
                return Charset.forName("windows-1256");
            }
            if (n == 1257) {
                return Charset.forName("windows-1257");
            }
            if (n == 1258) {
                return Charset.forName("windows-1258");
            }
            if (n == 20866) {
                return Charset.forName("KOI8-R");
            }
            if (n == 28591) {
                return Charset.forName("ISO-8859-1");
            }
            if (n == 28592) {
                return Charset.forName("ISO-8859-2");
            }
            if (n == 28593) {
                return Charset.forName("ISO-8859-3");
            }
            if (n == 28594) {
                return Charset.forName("ISO-8859-4");
            }
            if (n == 28595) {
                return Charset.forName("ISO-8859-5");
            }
            if (n == 28596) {
                return Charset.forName("ISO-8859-6");
            }
            if (n == 28597) {
                return Charset.forName("ISO-8859-7");
            }
            if (n == 28598) {
                return Charset.forName("ISO-8859-8");
            }
            if (n == 28599) {
                return Charset.forName("ISO-8859-9");
            }
            if (n == 28603) {
                return Charset.forName("ISO-8859-13");
            }
            if (n == 28605) {
                return Charset.forName("ISO-8859-15");
            }
            if (n == 28605) {
                return Charset.forName("ISO-8859-15");
            }
            if (n == 50220) {
                return Charset.forName("ISO-2022-JP");
            }
        }
        catch (Exception ex) {}
        return Charset.forName("UTF-8");
    }
    
    static byte[] c(byte[] array) {
        final byte[] array2 = Charset.forName("US-ASCII").encode("{\\rtf1\\ansi\\mac\\deff0\\deftab720{\\fonttbl;}{\\f0\\fnil \\froman \\fswiss \\fmodern \\fscript \\fdecor MS Sans SerifSymbolArialTimes New RomanCourier{\\colortbl\\red0\\green0\\blue0\n\r\\par \\pard\\plain\\f0\\fs20\\b\\i\\u\\tab\\tx").array();
        int n = 0;
        if (array == null || array.length < 16) {
            throw new IllegalArgumentException("Invalid PR_RTF_COMPRESSION header");
        }
        final int n2 = (int)a(array, 0);
        n += 4;
        int n3 = (int)a(array, 4);
        n += 4;
        final int n4 = (int)a(array, 8);
        n += 4;
        n += 4;
        if (n2 != array.length - 4) {
            return new byte[0];
        }
        byte[] array3;
        if (n4 == 1095517517) {
            if (n3 > array.length - 16) {
                n3 = array.length - 16;
            }
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
                if (((n6 = ((n5++ % 8 == 0) ? (array[n++] & 0xFF) : (n6 >> 1))) & 0x1) != 0x1) {
                    try {
                        array4[i++] = array[n++];
                        continue;
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        return new byte[0];
                    }
                }
                final int n7 = array[n++] & 0xFF;
                final int n8 = array[n++] & 0xFF;
                final int n9 = n7 << 4 | n8 >> 4;
                final int n10 = (n8 & 0xF) + 2;
                int j;
                if ((j = (i / 4096 << 12) + n9) >= i) {
                    j -= 4096;
                }
                while (j < j + n10) {
                    try {
                        array4[i++] = array4[j++];
                        continue;
                    }
                    catch (ArrayIndexOutOfBoundsException ex2) {
                        return new byte[0];
                    }
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
        h.a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        h.b = Calendar.getInstance();
    }
}

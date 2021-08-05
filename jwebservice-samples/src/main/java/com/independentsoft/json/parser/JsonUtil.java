package com.independentsoft.json.parser;

import java.io.*;

public class JsonUtil
{
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final char[] e;
    private static final char[] f;
    private static final char[] g;
    private static final char[] h;
    
    public static String encodeJson(final String input) throws IOException {
        final int length = input.length();
        final StringWriter stringWriter = new StringWriter(length);
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1;
            char[] array2;
            char[] array;
            if ((char1 = input.charAt(i)) > '\\') {
                array = ((char1 < '\u2028' || char1 > '\u2029') ? (array2 = null) : ((char1 == '\u2028') ? (array2 = JsonUtil.f) : (array2 = JsonUtil.g)));
            }
            else if (char1 == '\\') {
                array = (array2 = JsonUtil.b);
            }
            else if (char1 > '\"') {
                array = (array2 = null);
            }
            else if (char1 == '\"') {
                array = (array2 = JsonUtil.a);
            }
            else if (char1 > '\u001f') {
                array = (array2 = null);
            }
            else if (char1 == '\n') {
                array = (array2 = JsonUtil.c);
            }
            else if (char1 == '\r') {
                array = (array2 = JsonUtil.d);
            }
            else if (char1 == '\t') {
                array = (array2 = JsonUtil.e);
            }
            else {
                final char[] array3 = array2 = (array = new char[6]);
                array3[0] = '\\';
                array3[1] = 'u';
                array3[3] = (array3[2] = '0');
                array3[4] = JsonUtil.h[char1 >> 4 & '\u000f'];
                array3[5] = JsonUtil.h[char1 & '\u000f'];
            }
            final char[] array4 = array2;
            if (array != null) {
                stringWriter.write(input, n, i - n);
                stringWriter.write(array4);
                n = i + 1;
            }
        }
        stringWriter.write(input, n, length - n);
        return stringWriter.toString();
    }
    
    static {
        a = new char[] { '\\', '\"' };
        b = new char[] { '\\', '\\' };
        c = new char[] { '\\', 'n' };
        d = new char[] { '\\', 'r' };
        e = new char[] { '\\', 't' };
        f = new char[] { '\\', 'u', '2', '0', '2', '8' };
        g = new char[] { '\\', 'u', '2', '0', '2', '9' };
        h = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
}

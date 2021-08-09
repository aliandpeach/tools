package com.ews.io.storage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class b
{
    private byte[] a;
    private byte[] b;
    private c c;
    private c d;
    private c e;
    private short f;
    private short g;
    private short h;
    private int i;
    private d j;
    private d k;
    private d l;
    private d m;
    private d n;
    private d o;
    private d p;
    private d q;
    private d r;
    private d[] s;
    
    b() {
        this.a = new byte[] { -48, -49, 17, -32, -95, -79, 26, -31 };
        this.b = new byte[16];
        this.c = new c(62);
        this.d = new c(3);
        this.e = new c(65534);
        this.f = 9;
        this.g = 6;
        this.j = new d(0);
        this.k = new d(0);
        this.l = new d(0);
        this.m = new d(0);
        this.n = new d(4096);
        this.o = new d(0);
        this.p = new d(0);
        this.q = new d(0);
        this.r = new d(0);
        this.s = new d[109];
    }
    
    b(final ByteBuffer byteBuffer) throws IOException {
        this.a = new byte[] { -48, -49, 17, -32, -95, -79, 26, -31 };
        this.b = new byte[16];
        this.c = new c(62);
        this.d = new c(3);
        this.e = new c(65534);
        this.f = 9;
        this.g = 6;
        this.j = new d(0);
        this.k = new d(0);
        this.l = new d(0);
        this.m = new d(0);
        this.n = new d(4096);
        this.o = new d(0);
        this.p = new d(0);
        this.q = new d(0);
        this.r = new d(0);
        this.s = new d[109];
        this.a(byteBuffer);
    }
    
    private void a(final ByteBuffer byteBuffer) throws IOException {
        final byte[] array = new byte[8];
        byteBuffer.get(array, 0, 8);
        for (int i = 0; i < 8; ++i) {
            if (array[i] != this.a[i]) {
                throw new InvalidFileFormatException("Invalid file format.");
            }
        }
        byteBuffer.get(this.b, 0, 16);
        final byte[] array2 = new byte[2];
        byteBuffer.get(array2, 0, 2);
        this.c = new c(array2);
        final byte[] array3 = new byte[2];
        byteBuffer.get(array3, 0, 2);
        this.d = new c(array3);
        final byte[] array4 = new byte[2];
        byteBuffer.get(array4, 0, 2);
        this.e = new c(array4);
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getShort();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getInt();
        final byte[] array5 = new byte[4];
        byteBuffer.get(array5, 0, 4);
        this.j = new d(array5);
        final byte[] array6 = new byte[4];
        byteBuffer.get(array6, 0, 4);
        this.k = new d(array6);
        final byte[] array7 = new byte[4];
        byteBuffer.get(array7, 0, 4);
        this.l = new d(array7);
        final byte[] array8 = new byte[4];
        byteBuffer.get(array8, 0, 4);
        this.m = new d(array8);
        final byte[] array9 = new byte[4];
        byteBuffer.get(array9, 0, 4);
        this.n = new d(array9);
        final byte[] array10 = new byte[4];
        byteBuffer.get(array10, 0, 4);
        this.o = new d(array10);
        final byte[] array11 = new byte[4];
        byteBuffer.get(array11, 0, 4);
        this.p = new d(array11);
        final byte[] array12 = new byte[4];
        byteBuffer.get(array12, 0, 4);
        this.q = new d(array12);
        final byte[] array13 = new byte[4];
        byteBuffer.get(array13, 0, 4);
        this.r = new d(array13);
        final byte[] array14 = new byte[4];
        for (int j = 0; j < 109; ++j) {
            byteBuffer.get(array14, 0, 4);
            this.s[j] = new d(array14);
        }
    }
    
    byte[] a() {
        final byte[] array;
        final ByteBuffer wrap;
        (wrap = ByteBuffer.wrap(array = new byte[this.c()])).order(ByteOrder.LITTLE_ENDIAN);
        wrap.put(this.a);
        wrap.put(this.b);
        wrap.put(this.c.a());
        wrap.put(this.d.a());
        wrap.put(this.e.a());
        wrap.putShort(this.f);
        wrap.putShort(this.g);
        wrap.putShort(this.h);
        wrap.putInt(this.i);
        wrap.put(this.j.a());
        wrap.put(this.k.a());
        wrap.put(this.l.a());
        wrap.put(this.m.a());
        wrap.put(this.n.a());
        wrap.put(this.o.a());
        wrap.put(this.p.a());
        wrap.put(this.q.a());
        wrap.put(this.r.a());
        for (int i = 0; i < 109; ++i) {
            if (this.s[i] == null) {
                this.s[i] = new d(0);
            }
            wrap.put(this.s[i].a());
        }
        return array;
    }
    
    short b() {
        return this.d.shortValue();
    }
    
    void a(final short n) {
        if (n == 3) {
            this.d = new c(n);
            this.f = 9;
            return;
        }
        if (n == 4) {
            this.d = new c(n);
            this.f = 12;
        }
    }
    
    short c() {
        if (this.f == 9) {
            return 512;
        }
        return 4096;
    }
    
    void a(final d j) {
        this.j = j;
    }
    
    d d() {
        return this.k;
    }
    
    void b(final d k) {
        this.k = k;
    }
    
    d e() {
        return this.l;
    }
    
    void c(final d l) {
        this.l = l;
    }
    
    d f() {
        return this.n;
    }
    
    d g() {
        return this.o;
    }
    
    void d(final d o) {
        this.o = o;
    }
    
    d h() {
        return this.p;
    }
    
    void e(final d p) {
        this.p = p;
    }
    
    d i() {
        return this.q;
    }
    
    void f(final d q) {
        this.q = q;
    }
    
    void g(final d r) {
        this.r = r;
    }
    
    d[] j() {
        return this.s;
    }
    
    byte[] k() {
        return this.b;
    }
    
    void a(final byte[] b) {
        this.b = b;
    }
    
    static Date a(final long n, final long n2) {
        Date time = null;
        if (n2 > 0L) {
            final long n3 = n + (n2 << 32);
            final Calendar instance;
            (instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"))).set(1601, 0, 1, 0, 0, 0);
            try {
                final long n4 = n3 / 864000000000L;
                final long n5 = (n3 - n4 * 864000000000L) / 10000L;
                instance.add(5, (int)n4);
                instance.add(14, (int)n5);
                final Calendar instance2;
                (instance2 = Calendar.getInstance()).setTimeInMillis(instance.getTimeInMillis());
                time = instance2.getTime();
            }
            catch (Exception ex) {}
        }
        return time;
    }
}

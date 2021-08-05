package com.ews.msg;

final class d extends Number
{
    private static final long serialVersionUID = -2116457816922305289L;
    private final Long a;
    
    public d(final byte[] array) {
        this.a = ((((0x0L | (array[3] & 0xFF)) << 8 | (array[2] & 0xFF)) << 8 | (array[1] & 0xFF)) << 8 | (array[0] & 0xFF));
    }
    
    public d(final int n) {
        this.a = (n & 0xFFFFFFFFL);
    }
    
    public d(final long n) throws NumberFormatException {
        this.a = n;
    }
    
    public final double doubleValue() {
        return this.a;
    }
    
    public final float floatValue() {
        return this.a;
    }
    
    public final int intValue() {
        return (int)(Object)this.a;
    }
    
    public final long longValue() {
        return this.a;
    }
    
    public final byte[] a() {
        final byte[] array = new byte[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = (byte)(this.a >> (i << 3) & 0xFFL);
        }
        return array;
    }
}

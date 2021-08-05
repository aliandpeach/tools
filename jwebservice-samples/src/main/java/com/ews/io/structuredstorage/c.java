package com.ews.io.structuredstorage;

final class c extends Number
{
    private static final long serialVersionUID = 4603783992856393288L;
    private final Integer a;
    
    public c(final byte[] array) {
        this.a = ((0x0 | (array[1] & 0xFF)) << 8 | (array[0] & 0xFF));
    }
    
    public c(final short n) {
        this.a = (n & 0xFFFF);
    }
    
    public c(final int n) throws NumberFormatException {
        this.a = n;
    }
    
    public final double doubleValue() {
        return this.a;
    }
    
    public final float floatValue() {
        return this.a;
    }
    
    public final int intValue() {
        return this.a;
    }
    
    public final long longValue() {
        return this.a;
    }
    
    public final byte[] a() {
        final byte[] array = new byte[2];
        for (int i = 0; i < 2; ++i) {
            array[i] = (byte)(this.a >> (i << 3));
        }
        return array;
    }
}

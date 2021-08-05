package com.independentsoft.exchange;

final class c extends Number
{
    private static final long serialVersionUID = -2116457816922305289L;
    private final Long a;
    
    c(final int n) {
        this.a = (n & 0xFFFFFFFFL);
    }
    
    c(final long n) throws NumberFormatException {
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

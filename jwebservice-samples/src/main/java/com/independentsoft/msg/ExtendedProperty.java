package com.independentsoft.msg;

import java.nio.charset.*;
import java.nio.*;
import java.util.*;
import java.io.*;

public class ExtendedProperty
{
    private ExtendedPropertyTag a;
    private byte[] b;
    
    public ExtendedProperty() {
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag) {
        this.a = tag;
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final String value) {
        if (tag == null) {
            throw new IllegalArgumentException("tag is null.");
        }
        if (value == null) {
            throw new IllegalArgumentException("value is null.");
        }
        this.a = tag;
        if (tag.getType() == PropertyType.STRING) {
            this.b = Charset.forName("UTF-16LE").encode(value).array();
            return;
        }
        this.b = Charset.forName("UTF-8").encode(value).array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final short value) {
        this.a = tag;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(2)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort(value);
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final int value) {
        this.a = tag;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(4)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(value);
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final long value) {
        this.a = tag;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(8)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(value);
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final double value) {
        this.a = tag;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(8)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putDouble(value);
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final boolean value) {
        this.a = tag;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(2)).order(ByteOrder.LITTLE_ENDIAN);
        if (value) {
            allocate.putShort((short)1);
        }
        else {
            allocate.putShort((short)0);
        }
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final Date value) {
        this.a = tag;
        final Calendar instance;
        (instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"))).set(1601, 0, 1, 0, 0, 0);
        final long timeInMillis = instance.getTimeInMillis();
        final Calendar instance2;
        (instance2 = Calendar.getInstance()).setTime(value);
        final long n = (instance2.getTimeInMillis() - timeInMillis) * 10000L;
        final ByteBuffer allocate;
        (allocate = ByteBuffer.allocate(8)).order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(n);
        this.b = allocate.array();
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final String[] value) throws IOException {
        if (tag == null) {
            throw new IllegalArgumentException("tag is null.");
        }
        if (value == null) {
            throw new IllegalArgumentException("value is null.");
        }
        this.a = tag;
        if (value != null && value.length > 0) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                final int length = value.length;
                final ByteBuffer allocate;
                (allocate = ByteBuffer.allocate(4)).order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(length);
                byteArrayOutputStream.write(allocate.array());
                for (int i = 0; i < length; ++i) {
                    if (tag.getType() == PropertyType.STRING) {
                        final byte[] array;
                        final ByteBuffer allocate2;
                        (allocate2 = ByteBuffer.allocate((array = Charset.forName("UTF-16LE").encode(value[i]).array()).length + 4)).order(ByteOrder.LITTLE_ENDIAN);
                        allocate2.putInt(array.length);
                        allocate2.put(array);
                        byteArrayOutputStream.write(allocate2.array());
                    }
                    else {
                        final byte[] array2;
                        final ByteBuffer allocate3;
                        (allocate3 = ByteBuffer.allocate((array2 = Charset.forName("UTF-8").encode(value[i]).array()).length + 4)).order(ByteOrder.LITTLE_ENDIAN);
                        allocate3.putInt(array2.length);
                        allocate3.put(array2);
                        byteArrayOutputStream.write(allocate3.array());
                    }
                }
                this.b = byteArrayOutputStream.toByteArray();
            }
            finally {
                byteArrayOutputStream.close();
            }
        }
    }
    
    public ExtendedProperty(final ExtendedPropertyTag tag, final byte[] value) {
        this.a = tag;
        this.b = value;
    }
    
    public String getStringValue() {
        if (this.b == null) {
            return null;
        }
        if (this.a.getType() == PropertyType.STRING) {
            return Charset.forName("UTF-16LE").decode(ByteBuffer.wrap(this.b)).toString();
        }
        if (this.a.getType() == PropertyType.STRING8) {
            return Charset.forName("UTF-8").decode(ByteBuffer.wrap(this.b)).toString();
        }
        return null;
    }
    
    public String[] getStringArrayValue() {
        if (this.b == null) {
            return null;
        }
        if (this.a.getType() == PropertyType.MULTIPLE_STRING) {
            return h.a(this.b, "UTF-16LE");
        }
        if (this.a.getType() == PropertyType.MULTIPLE_STRING8) {
            return h.a(this.b, "UTF-8");
        }
        return null;
    }
    
    public boolean getBooleanValue() {
        if (this.b == null) {
            return false;
        }
        if (this.a.getType() == PropertyType.BOOLEAN && this.b.length == 2) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getShort() == 0;
        }
        return false;
    }
    
    public short getShortValue() {
        if (this.b == null) {
            return -32768;
        }
        if (this.a.getType() == PropertyType.INTEGER16 && this.b.length == 2) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getShort();
        }
        return -32768;
    }
    
    public int getIntegerValue() {
        if (this.b == null) {
            return Integer.MIN_VALUE;
        }
        if (this.a.getType() == PropertyType.INTEGER32 && this.b.length == 4) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getInt();
        }
        return Integer.MIN_VALUE;
    }
    
    public long getLongValue() {
        if (this.b == null) {
            return Long.MIN_VALUE;
        }
        if (this.a.getType() == PropertyType.INTEGER64 && this.b.length == 8) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getLong();
        }
        return Long.MIN_VALUE;
    }
    
    public float getFloatValue() {
        if (this.b == null) {
            return Float.MIN_VALUE;
        }
        if (this.a.getType() == PropertyType.FLOATING32 && this.b.length == 4) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getFloat();
        }
        return Float.MIN_VALUE;
    }
    
    public double getDoubleValue() {
        if (this.b == null) {
            return Double.MIN_VALUE;
        }
        if (this.a.getType() == PropertyType.FLOATING64 && this.b.length == 8) {
            final ByteBuffer wrap;
            (wrap = ByteBuffer.wrap(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            return wrap.getDouble();
        }
        return Double.MIN_VALUE;
    }
    
    public Date getDateTimeValue() {
        if (this.b == null) {
            return null;
        }
        if ((this.a.getType() == PropertyType.TIME || this.a.getType() == PropertyType.FLOATING_TIME) && this.b.length == 8) {
            return h.a(this.b);
        }
        return null;
    }
    
    public ExtendedPropertyTag getTag() {
        return this.a;
    }
    
    public void setTag(final ExtendedPropertyTag tag) {
        this.a = tag;
    }
    
    public byte[] getValue() {
        return this.b;
    }
    
    public void setValue(final byte[] value) {
        this.b = value;
    }
}

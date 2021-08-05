package com.independentsoft.io.structuredstorage;

import java.nio.charset.*;
import java.nio.*;
import java.util.*;

public abstract class DirectoryEntry implements Comparable<DirectoryEntry>
{
    protected String name;
    protected DirectoryEntryType type;
    protected a color;
    protected d leftSiblingSid;
    protected d rightSiblingSid;
    protected d childSid;
    protected byte[] classId;
    protected d userFlags;
    protected Date createdTime;
    protected Date lastModifiedTime;
    protected d startSector;
    protected d size;
    protected static final short PROPERTY_TYPE = 0;
    protected byte[] buffer;
    protected DirectoryEntryList directoryEntries;
    protected DirectoryEntry parent;

    public DirectoryEntry() {
        this.type = DirectoryEntryType.INVALID;
        this.color = a.b;
        this.leftSiblingSid = new d(0);
        this.rightSiblingSid = new d(0);
        this.childSid = new d(0);
        this.classId = new byte[16];
        this.userFlags = new d(0);
        this.startSector = new d(0);
        this.size = new d(0);
        this.directoryEntries = new DirectoryEntryList();
    }

    static DirectoryEntry a(ByteBuffer var0) {
        byte[] var1 = new byte[64];
        var0.get(var1);
        short var2 = var0.getShort();
        String var36 = Charset.forName("UTF-16LE").decode(ByteBuffer.wrap(var1)).toString().substring(0, var2 / 2 - 1);
        byte var3;
        DirectoryEntryType var37 = (var3 = var0.get()) == 5 ? DirectoryEntryType.ROOT : (var3 == 4 ? DirectoryEntryType.PROPERTY : (var3 == 3 ? DirectoryEntryType.LOCK_BYTES : (var3 == 2 ? DirectoryEntryType.STREAM : (var3 == 1 ? DirectoryEntryType.STORAGE : DirectoryEntryType.INVALID))));
        a var39 = var0.get() == 0 ? a.a : a.b;
        byte[] var4 = new byte[4];
        var0.get(var4, 0, 4);
        d var42 = new d(var4);
        byte[] var5 = new byte[4];
        var0.get(var5, 0, 4);
        d var43 = new d(var5);
        byte[] var6 = new byte[4];
        var0.get(var6, 0, 4);
        d var44 = new d(var6);
        byte[] var7 = new byte[16];
        var0.get(var7, 0, 16);
        byte[] var8 = new byte[4];
        var0.get(var8, 0, 4);
        d var45 = new d(var8);
        byte[] var9 = new byte[4];
        var0.get(var9, 0, 4);
        d var46 = new d(var9);
        byte[] var10 = new byte[4];
        var0.get(var10, 0, 4);
        d var48 = new d(var10);
        long var22 = var46.longValue();
        long var24 = var48.longValue();
        Date var47 = b.a(var22, var24);
        var10 = new byte[4];
        var0.get(var10, 0, 4);
        var48 = new d(var10);
        byte[] var11 = new byte[4];
        var0.get(var11, 0, 4);
        d var49 = new d(var11);
        long var31 = var48.longValue();
        long var33 = var49.longValue();
        Date var50 = b.a(var31, var33);
        var11 = new byte[4];
        var0.get(var11, 0, 4);
        var49 = new d(var11);
        byte[] var12 = new byte[4];
        var0.get(var12, 0, 4);
        d var35 = new d(var12);
        if (var37 == DirectoryEntryType.ROOT) {
            RootDirectoryEntry var41;
            (var41 = new RootDirectoryEntry()).type = DirectoryEntryType.ROOT;
            var41.name = var36;
            var41.color = var39;
            var41.leftSiblingSid = var42;
            var41.rightSiblingSid = var43;
            var41.childSid = var44;
            var41.classId = var7;
            var41.userFlags = var45;
            var41.createdTime = var47;
            var41.lastModifiedTime = var50;
            var41.startSector = var49;
            var41.size = var35;
            return var41;
        } else if (var37 == DirectoryEntryType.STREAM) {
            Stream var40;
            (var40 = new Stream()).type = DirectoryEntryType.STREAM;
            var40.name = var36;
            var40.color = var39;
            var40.leftSiblingSid = var42;
            var40.rightSiblingSid = var43;
            var40.childSid = var44;
            var40.classId = var7;
            var40.userFlags = var45;
            var40.createdTime = var47;
            var40.lastModifiedTime = var50;
            var40.startSector = var49;
            var40.size = var35;
            return var40;
        } else {
            Storage var38;
            if (var37 == DirectoryEntryType.STORAGE) {
                (var38 = new Storage()).type = DirectoryEntryType.STORAGE;
                var38.name = var36;
                var38.color = var39;
                var38.leftSiblingSid = var42;
                var38.rightSiblingSid = var43;
                var38.childSid = var44;
                var38.classId = var7;
                var38.userFlags = var45;
                var38.createdTime = var47;
                var38.lastModifiedTime = var50;
                var38.startSector = var49;
                var38.size = var35;
                return var38;
            } else {
                (var38 = new Storage()).type = DirectoryEntryType.INVALID;
                var38.name = var36;
                var38.color = var39;
                var38.leftSiblingSid = var42;
                var38.rightSiblingSid = var43;
                var38.childSid = var44;
                var38.classId = var7;
                var38.userFlags = var45;
                var38.createdTime = var47;
                var38.lastModifiedTime = var50;
                var38.startSector = var49;
                var38.size = var35;
                return var38;
            }
        }
    }

    final byte[] a() {
        byte[] var1;
        ByteBuffer var2;
        (var2 = ByteBuffer.wrap(var1 = new byte[128])).order(ByteOrder.LITTLE_ENDIAN);
        byte[] var3 = new byte[64];
        byte[] var4 = Charset.forName("UTF-16LE").encode(this.name).array();

        int var5;
        for(var5 = 0; var5 < var4.length; ++var5) {
            var3[var5] = var4[var5];
        }

        var2.put(var3);
        var2.putShort((short)(this.name.length() + 1 << 1));
        DirectoryEntryType var16;
        var5 = (var16 = this.type) == DirectoryEntryType.ROOT ? 5 : (var16 == DirectoryEntryType.PROPERTY ? 4 : (var16 == DirectoryEntryType.LOCK_BYTES ? 3 : (var16 == DirectoryEntryType.STREAM ? 2 : (var16 == DirectoryEntryType.STORAGE ? 1 : 0))));
        var2.put((byte)var5);
        int var17 = this.color == a.a ? 0 : 1;
        var2.put((byte)var17);
        var2.put(this.leftSiblingSid.a());
        var2.put(this.rightSiblingSid.a());
        var2.put(this.childSid.a());
        var2.put(this.classId);
        var2.put(this.userFlags.a());
        Calendar var18;
        long var9;
        long var14;
        if (this.createdTime != null) {
            (var18 = Calendar.getInstance(TimeZone.getTimeZone("GMT"))).set(1601, 0, 1, 0, 0, 0);
            var9 = var18.getTimeInMillis();
            (var18 = Calendar.getInstance()).setTime(this.createdTime);
            var14 = (var18.getTimeInMillis() - var9) * 10000L;
            var2.putLong(var14);
        } else {
            var2.put((new d(0)).a());
            var2.put((new d(0)).a());
        }

        if (this.lastModifiedTime != null) {
            (var18 = Calendar.getInstance(TimeZone.getTimeZone("GMT"))).set(1601, 0, 1, 0, 0, 0);
            var9 = var18.getTimeInMillis();
            (var18 = Calendar.getInstance()).setTime(this.lastModifiedTime);
            var14 = (var18.getTimeInMillis() - var9) * 10000L;
            var2.putLong(var14);
        } else {
            var2.put((new d(0)).a());
            var2.put((new d(0)).a());
        }

        var2.put(this.startSector.a());
        var2.put(this.size.a());
        return var1;
    }

    public int compareTo(DirectoryEntry entry) {
        if (entry.getName().length() < this.name.length()) {
            return 1;
        } else if (entry.getName().length() == this.name.length()) {
            for(int var2 = 0; var2 < this.name.length(); ++var2) {
                char var3 = entry.name.charAt(var2);
                char var4 = this.name.charAt(var2);
                if (var3 < var4) {
                    return 1;
                }

                if (var3 > var4) {
                    return -1;
                }
            }

            return 1;
        } else {
            return -1;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public long getSize() {
        return this.size.longValue();
    }

    public byte[] getClassId() {
        return this.classId;
    }

    public void setClassId(byte[] classId) {
        this.classId = classId;
    }
}

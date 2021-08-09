package com.ews.io.storage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CompoundFile
{
    private b a;
    private RootDirectoryEntry b;
    
    public CompoundFile() {
        this.a = new b();
        this.b = new RootDirectoryEntry();
    }
    
    public CompoundFile(final String filePath) throws IOException {
        this.a = new b();
        this.b = new RootDirectoryEntry();
        this.open(filePath);
    }
    
    public CompoundFile(final InputStream stream) throws IOException {
        this.a = new b();
        this.b = new RootDirectoryEntry();
        this.open(stream);
    }
    
    public void open(String filePath) throws IOException {
        FileInputStream var_1_08 = new FileInputStream(filePath);
        try {
            this.open((InputStream)var_1_08);
        }
        finally {
            ((FileInputStream)var_1_08).close();
        }
    }
    
    public void open(InputStream inputStream) throws IOException {
        CompoundFile var_1_695 = this;
        Object wrap = new BufferedInputStream(inputStream);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        try {
            for (int i = ((FilterInputStream)wrap).read(array); i != -1; i = ((FilterInputStream)wrap).read(array)) {
                byteArrayOutputStream.write(array, 0, i);
            }
            ((ByteBuffer)(wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray()))).order(ByteOrder.LITTLE_ENDIAN);
        }
        finally {
            byteArrayOutputStream.close();
        }
        ((CompoundFile)var_1_695).a = new b((ByteBuffer)wrap);
        final d[] a = ((CompoundFile)var_1_695).a((ByteBuffer)wrap, ((CompoundFile)var_1_695).a((ByteBuffer)wrap));
        d[] b = null;
        if (((CompoundFile)var_1_695).a.g().longValue() != 4294967294L) {
            b = ((CompoundFile)var_1_695).b((ByteBuffer)wrap, a);
        }
        Object wrap2 = new ArrayList<d>();
        d e = ((CompoundFile)var_1_695).a.e();
        ((List<d>)wrap2).add(e);
        while ((e = a[e.intValue()]).longValue() != 4294967294L) {
            ((List<d>)wrap2).add(e);
        }
        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            for (int j = 0; j < ((List)wrap2).size(); ++j) {
                ((Buffer)wrap).position(((List<d>)wrap2).get(j).intValue() * ((CompoundFile)var_1_695).a.c() + ((CompoundFile)var_1_695).a.c());
                final byte[] array2 = new byte[((CompoundFile)var_1_695).a.c()];
                ((ByteBuffer)wrap).get(array2);
                byteArrayOutputStream2.write(array2, 0, array2.length);
            }
            ((ByteBuffer)(wrap2 = ByteBuffer.wrap(byteArrayOutputStream2.toByteArray()))).order(ByteOrder.LITTLE_ENDIAN);
        }
        finally {
            byteArrayOutputStream2.close();
        }
        ((CompoundFile)var_1_695).b = (RootDirectoryEntry)DirectoryEntry.a((ByteBuffer)wrap2);
        final HashMap<d, DirectoryEntry> hashMap;
        (hashMap = new HashMap<d, DirectoryEntry>()).put(new d(0), ((CompoundFile)var_1_695).b);
        if (((CompoundFile)var_1_695).b.childSid.longValue() != 4294967295L) {
            ((Buffer)wrap2).position(((CompoundFile)var_1_695).b.childSid.intValue() << 7);
            final DirectoryEntry a2 = DirectoryEntry.a((ByteBuffer)wrap2);
            hashMap.put(((CompoundFile)var_1_695).b.childSid, a2);
            ((CompoundFile)var_1_695).b.directoryEntries.add(a2);
            a2.parent = ((CompoundFile)var_1_695).b;
            final Stack<DirectoryEntry> stack = new Stack<DirectoryEntry>();
            final Stack<DirectoryEntry> stack2 = new Stack<DirectoryEntry>();
            final Stack<DirectoryEntry> stack3 = new Stack<DirectoryEntry>();
            stack.push(a2);
            stack2.push(a2);
            stack3.push(a2);
            while (stack.size() > 0 || stack2.size() > 0 || stack3.size() > 0) {
                final DirectoryEntry directoryEntry;
                if (stack.size() > 0 && (directoryEntry = stack.pop()).leftSiblingSid.longValue() != 4294967295L && !hashMap.containsKey(directoryEntry.leftSiblingSid)) {
                    ((Buffer)wrap2).position(directoryEntry.leftSiblingSid.intValue() << 7);
                    final DirectoryEntry a3 = DirectoryEntry.a((ByteBuffer)wrap2);
                    hashMap.put(directoryEntry.leftSiblingSid, a3);
                    directoryEntry.parent.directoryEntries.add(a3);
                    a3.parent = directoryEntry.parent;
                    stack.push(a3);
                    stack2.push(a3);
                    stack3.push(a3);
                }
                else {
                    final DirectoryEntry directoryEntry2;
                    if (stack2.size() > 0 && (directoryEntry2 = stack2.pop()).rightSiblingSid.longValue() != 4294967295L && !hashMap.containsKey(directoryEntry2.rightSiblingSid)) {
                        ((Buffer)wrap2).position(directoryEntry2.rightSiblingSid.intValue() << 7);
                        final DirectoryEntry a4 = DirectoryEntry.a((ByteBuffer)wrap2);
                        hashMap.put(directoryEntry2.rightSiblingSid, a4);
                        directoryEntry2.parent.directoryEntries.add(a4);
                        a4.parent = directoryEntry2.parent;
                        stack.push(a4);
                        stack2.push(a4);
                        stack3.push(a4);
                    }
                    else {
                        if (stack3.size() <= 0) {
                            continue;
                        }
                        final DirectoryEntry parent;
                        if ((parent = stack3.pop()).childSid.longValue() == 4294967295L || hashMap.containsKey(parent.childSid)) {
                            continue;
                        }
                        ((Buffer)wrap2).position(parent.childSid.intValue() << 7);
                        final DirectoryEntry a5 = DirectoryEntry.a((ByteBuffer)wrap2);
                        hashMap.put(parent.childSid, a5);
                        parent.directoryEntries.add(a5);
                        a5.parent = parent;
                        stack.push(a5);
                        stack2.push(a5);
                        stack3.push(a5);
                    }
                }
            }
        }
        final ArrayList<DirectoryEntry> list = new ArrayList<DirectoryEntry>();
        final Iterator<DirectoryEntry> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            final DirectoryEntry directoryEntry3;
            if ((directoryEntry3 = iterator.next()) == ((CompoundFile)var_1_695).b) {
                list.add(0, directoryEntry3);
            }
            else {
                list.add(directoryEntry3);
            }
        }
        ByteBuffer wrap3 = null;
        for (int k = 0; k < list.size(); ++k) {
            final DirectoryEntry directoryEntry4;
            if ((directoryEntry4 = list.get(k)).type != DirectoryEntryType.STORAGE) {
                if (directoryEntry4.type != DirectoryEntryType.ROOT && directoryEntry4.getSize() > 0L && directoryEntry4.getSize() < ((CompoundFile)var_1_695).a.f().longValue()) {
                    final ArrayList<d> list2 = new ArrayList<d>();
                    d startSector = directoryEntry4.startSector;
                    list2.add(startSector);
                    while ((startSector = b[startSector.intValue()]).longValue() != 4294967292L && startSector.longValue() != 4294967293L && startSector.longValue() != 4294967294L && startSector.longValue() != 4294967295L && startSector.longValue() != b[startSector.intValue()].longValue()) {
                        list2.add(startSector);
                    }
                    final ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        for (int l = 0; l < list2.size(); ++l) {
                            wrap3.position(((d)list2.get(l)).intValue() << 6);
                            final byte[] array3 = new byte[64];
                            wrap3.get(array3);
                            byteArrayOutputStream3.write(array3, 0, 64);
                        }
                        directoryEntry4.buffer = ((byteArrayOutputStream3.size() < (int)directoryEntry4.getSize()) ? new byte[byteArrayOutputStream3.size()] : new byte[(int)directoryEntry4.getSize()]);
                        System.arraycopy(byteArrayOutputStream3.toByteArray(), 0, directoryEntry4.buffer, 0, directoryEntry4.buffer.length);
                        continue;
                    }
                    finally {
                        byteArrayOutputStream3.close();
                    }
                }
                if (directoryEntry4.getSize() > 0L) {
                    final ArrayList<d> list3 = new ArrayList<d>();
                    d startSector2 = directoryEntry4.startSector;
                    list3.add(startSector2);
                    while ((startSector2 = a[startSector2.intValue()]).longValue() != 4294967292L && startSector2.longValue() != 4294967293L && startSector2.longValue() != 4294967294L && startSector2.longValue() != 4294967295L && startSector2.longValue() != a[startSector2.intValue()].longValue()) {
                        list3.add(startSector2);
                    }
                    final ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        for (int n = 0; n < list3.size(); ++n) {
                            ((Buffer)wrap).position(((d)list3.get(n)).intValue() * ((CompoundFile)var_1_695).a.c() + ((CompoundFile)var_1_695).a.c());
                            final byte[] array4 = new byte[((CompoundFile)var_1_695).a.c()];
                            final int remaining;
                            if ((remaining = ((Buffer)wrap).remaining()) >= array4.length) {
                                ((ByteBuffer)wrap).get(array4);
                                byteArrayOutputStream4.write(array4, 0, array4.length);
                            }
                            else {
                                ((ByteBuffer)wrap).get(array4, 0, remaining);
                                byteArrayOutputStream4.write(array4, 0, remaining);
                            }
                        }
                        directoryEntry4.buffer = ((byteArrayOutputStream4.size() < (int)directoryEntry4.getSize()) ? new byte[byteArrayOutputStream4.size()] : new byte[(int)directoryEntry4.getSize()]);
                        System.arraycopy(byteArrayOutputStream4.toByteArray(), 0, directoryEntry4.buffer, 0, directoryEntry4.buffer.length);
                    }
                    finally {
                        byteArrayOutputStream4.close();
                    }
                    if (directoryEntry4 == ((CompoundFile)var_1_695).b && ((CompoundFile)var_1_695).b.buffer != null) {
                        wrap3 = ByteBuffer.wrap(((CompoundFile)var_1_695).b.buffer);
                    }
                }
            }
        }
    }
    
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.a());
    }
    
    public byte[] toByteArray() throws IOException {
        return this.a();
    }
    
    public void save(final String filePath) throws IOException {
        this.save(filePath, false);
    }
    
    public void save(String filePath, final boolean overwrite) throws IOException {
        final File file = new File(filePath);
        if (overwrite && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        FileOutputStream var_1_28 = new FileOutputStream(file);
        try {
            this.save((OutputStream)var_1_28);
        }
        finally {
            ((FileOutputStream)var_1_28).close();
        }
    }
    
    public void save(final OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream is null.");
        }
        final byte[] a = this.a();
        outputStream.write(a, 0, a.length);
    }
    
    private byte[] a() throws IOException {
        final Date time = Calendar.getInstance().getTime();
        final DirectoryEntryList list = new DirectoryEntryList();
        final ArrayList<d> list2 = new ArrayList<d>();
        final ArrayList<d> list3 = new ArrayList<d>();
        long n = 4294967294L;
        long n2 = 0L;
        this.b.color = com.ews.io.storage.a.a;
        this.b.type = DirectoryEntryType.ROOT;
        this.b.buffer = null;
        this.b.leftSiblingSid = new d(4294967295L);
        this.b.rightSiblingSid = new d(4294967295L);
        this.b.createdTime = null;
        this.b.lastModifiedTime = null;
        this.b.size = new d(0);
        this.b.startSector = new d(0);
        list.add(this.b);
        this.a(this.b, list, time);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        final ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        final byte []t;
        try {
            for (int i = list.size() - 1; i >= 0; --i) {
                final RootDirectoryEntry rootDirectoryEntry;
                if ((rootDirectoryEntry = (RootDirectoryEntry)list.get(i)).buffer != null) {
                    rootDirectoryEntry.size = new d(rootDirectoryEntry.buffer.length);
                }
                else {
                    rootDirectoryEntry.size = new d(0);
                }
                if (i == 0 && byteArrayOutputStream3.size() > 0) {
                    rootDirectoryEntry.buffer = byteArrayOutputStream3.toByteArray();
                    rootDirectoryEntry.size = new d(rootDirectoryEntry.buffer.length);
                }
                if (i > 0 && rootDirectoryEntry.getSize() > 0L && rootDirectoryEntry.getSize() < this.a.f().longValue()) {
                    rootDirectoryEntry.startSector = new d(list3.size());
                    for (int j = 0; j < rootDirectoryEntry.buffer.length; j += 64) {
                        final byte[] array = new byte[64];
                        int n3 = 64;
                        if (rootDirectoryEntry.buffer.length < j + 64) {
                            n3 = rootDirectoryEntry.buffer.length - j;
                        }
                        System.arraycopy(rootDirectoryEntry.buffer, j, array, 0, n3);
                        byteArrayOutputStream3.write(array);
                        if (j + 64 < rootDirectoryEntry.buffer.length) {
                            list3.add(new d(list3.size() + 1));
                        }
                        else {
                            list3.add(new d(4294967294L));
                        }
                    }
                }
                else if (i > 0 && rootDirectoryEntry.getSize() > 0L && rootDirectoryEntry.getSize() >= this.a.f().longValue()) {
                    rootDirectoryEntry.startSector = new d(list2.size());
                    for (short n4 = 0; n4 < rootDirectoryEntry.buffer.length; n4 += this.a.c()) {
                        final byte[] array2;
                        int length = (array2 = new byte[this.a.c()]).length;
                        if (rootDirectoryEntry.buffer.length < n4 + this.a.c()) {
                            length = rootDirectoryEntry.buffer.length - n4;
                        }
                        System.arraycopy(rootDirectoryEntry.buffer, n4, array2, 0, length);
                        byteArrayOutputStream2.write(array2);
                        if (n4 + this.a.c() < rootDirectoryEntry.buffer.length) {
                            list2.add(new d(list2.size() + 1));
                        }
                        else {
                            list2.add(new d(4294967294L));
                        }
                    }
                }
            }
            final short n5 = (short)(this.a.c() / 64);
            short n6 = 0;
            boolean b = false;
            final long n7 = list2.size();
            if (byteArrayOutputStream3.size() > 0) {
                final byte[] byteArray = byteArrayOutputStream3.toByteArray();
                final byte[] array3 = new byte[this.a.c()];
                for (int k = 0; k < byteArray.length; k += 64) {
                    int n8 = 64;
                    if (byteArray.length < k + 64) {
                        n8 = byteArrayOutputStream3.size() - k;
                    }
                    System.arraycopy(byteArray, k, array3, n6 << 6, n8);
                    ++n6;
                    if (k + 64 >= byteArray.length) {
                        b = true;
                    }
                    if (b || n6 == n5) {
                        n6 = 0;
                        byteArrayOutputStream2.write(array3);
                        if (!b) {
                            list2.add(new d(list2.size() + 1));
                        }
                        else {
                            list2.add(new d(4294967294L));
                        }
                    }
                }
                final short n9 = (short)(this.a.c() / 4);
                n = list2.size();
                for (short n10 = 0; n10 < list3.size(); n10 += n9) {
                    final byte[] array4 = new byte[this.a.c()];
                    for (short n11 = 0; n11 < n9; ++n11) {
                        if (n10 + n11 < list3.size()) {
                            System.arraycopy(((d)list3.get(n10 + n11)).a(), 0, array4, n11 << 2, 4);
                        }
                        else {
                            System.arraycopy(new d(4294967295L).a(), 0, array4, n11 << 2, 4);
                        }
                    }
                    byteArrayOutputStream2.write(array4);
                    ++n2;
                    if (n10 + n9 < list3.size()) {
                        list2.add(new d(list2.size() + 1));
                    }
                    else {
                        list2.add(new d(4294967294L));
                    }
                }
            }
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
            this.a.c(new d(list2.size()));
            int n12 = 0;
            for (short n13 = (short)(this.a.c() / 128), n14 = 0; n14 < list.size(); n14 += n13) {
                if (list.get(n14) == this.b && n7 != -2L) {
                    this.b.startSector = new d(n7);
                }
                final byte[] array5 = new byte[this.a.c()];
                for (short n15 = 0; n15 < n13; ++n15) {
                    if (n14 + n15 < list.size()) {
                        System.arraycopy((list).get(n14 + n15).a(), 0, array5, n15 << 7, 128);
                    }
                }
                byteArrayOutputStream.write(array5);
                ++n12;
                if (n14 + n13 < list.size()) {
                    list2.add(new d(list2.size() + 1));
                }
                else {
                    list2.add(new d(4294967294L));
                }
            }
            if (this.a.b() == 4) {
                this.a.a(new d(n12));
            }
            final short n16 = (short)(this.a.c() / 4);
            int n17;
            if ((n17 = list2.size() / n16) * n16 < list2.size()) {
                ++n17;
            }
            int n18;
            if ((n18 = (list2.size() + n17) / n16) * n16 < list2.size() + n18) {
                ++n18;
            }
            int n19;
            if ((n19 = (n18 - 109) / (n16 - 1)) * n16 < n18 - 109) {
                ++n19;
            }
            this.a.b(new d(n18));
            final ArrayList<d> list4 = new ArrayList<d>();
            final ArrayList<d> list5 = new ArrayList<d>();
            for (int l = 0; l < n18; ++l) {
                list2.add(new d(4294967293L));
                final int n20 = list2.size() - 1;
                if (l < 109) {
                    list4.add(new d(n20));
                }
                else {
                    list5.add(new d(n20));
                }
            }
            for (int n21 = 0; n21 < n19; ++n21) {
                list2.add(new d(4294967292L));
            }
            for (short n22 = 0; n22 < list2.size(); n22 += n16) {
                final byte[] array6 = new byte[this.a.c()];
                for (short n23 = 0; n23 < n16; ++n23) {
                    if (n22 + n23 < list2.size()) {
                        System.arraycopy(((d)list2.get(n22 + n23)).a(), 0, array6, n23 << 2, 4);
                    }
                    else {
                        System.arraycopy(new d(4294967295L).a(), 0, array6, n23 << 2, 4);
                    }
                }
                byteArrayOutputStream.write(array6);
            }
            if (n19 > 0) {
                this.a.f(new d(byteArrayOutputStream.size() / this.a.c()));
            }
            else {
                this.a.f(new d(4294967294L));
            }
            this.a.g(new d(n19));
            for (int n24 = 0; n24 < list4.size(); ++n24) {
                this.a.j()[n24] = (d)list4.get(n24);
            }
            for (int size = list4.size(); size < 109; ++size) {
                this.a.j()[size] = new d(4294967295L);
            }
            int n25 = 1;
            for (short n26 = 0; n26 < list5.size(); n26 += (short)(n16 - 1)) {
                final byte[] array7 = new byte[this.a.c()];
                for (short n27 = 0; n27 < n16 - 1; ++n27) {
                    if (n26 + n27 < list5.size()) {
                        System.arraycopy(((d)list5.get(n26 + n27)).a(), 0, array7, n27 << 2, 4);
                    }
                    else {
                        System.arraycopy(new d(4294967295L).a(), 0, array7, n27 << 2, 4);
                    }
                }
                if (n26 + (n16 - 1) < list5.size()) {
                    System.arraycopy(new d(this.a.i().longValue() + n25++).a(), 0, array7, n16 - 1 << 2, 4);
                }
                else {
                    System.arraycopy(new d(4294967294L).a(), 0, array7, n16 - 1 << 2, 4);
                }
                byteArrayOutputStream.write(array7);
            }
            t = byteArrayOutputStream.toByteArray();
        }
        finally {
            byteArrayOutputStream.close();
            byteArrayOutputStream2.close();
            byteArrayOutputStream3.close();
        }
        this.a.d(new d(n));
        this.a.e(new d(n2));
        final byte[] a = this.a.a();
        final byte[] array8 = new byte[t.length + a.length];
        System.arraycopy(a, 0, array8, 0, a.length);
        System.arraycopy(t, 0, array8, a.length, array8.length - a.length);
        return array8;
    }
    
    private void a(DirectoryEntry directoryEntry, DirectoryEntryList list, final Date date) {
        while (directoryEntry.directoryEntries.size() > 0) {
            Collections.sort(directoryEntry.directoryEntries);
            final int n = directoryEntry.directoryEntries.size() / 2;
            final DirectoryEntry directoryEntry2 = directoryEntry.directoryEntries.get(n);
            if (directoryEntry.color == com.ews.io.storage.a.b) {
                directoryEntry2.color = com.ews.io.storage.a.a;
            }
            else {
                directoryEntry2.color = com.ews.io.storage.a.b;
            }
            final DirectoryEntry directoryEntry3 = directoryEntry2;
            directoryEntry3.lastModifiedTime = date;
            directoryEntry3.createdTime = date;
            if (directoryEntry2.buffer != null) {
                directoryEntry2.size = new d(directoryEntry2.buffer.length);
            }
            else {
                directoryEntry2.size = new d(0);
            }
            directoryEntry2.startSector = new d(0);
            directoryEntry2.leftSiblingSid = new d(4294967295L);
            directoryEntry2.rightSiblingSid = new d(4294967295L);
            directoryEntry2.childSid = new d(4294967295L);
            list.add(directoryEntry2);
            directoryEntry.childSid = new d(list.size() - 1);
            DirectoryEntry directoryEntry4 = directoryEntry2;
            for (int i = n - 1; i >= 0; --i) {
                final DirectoryEntry directoryEntry5 = directoryEntry.directoryEntries.get(i);
                if (directoryEntry.color == com.ews.io.storage.a.b) {
                    directoryEntry5.color = com.ews.io.storage.a.a;
                }
                else {
                    directoryEntry5.color = com.ews.io.storage.a.b;
                }
                final DirectoryEntry directoryEntry6 = directoryEntry5;
                directoryEntry6.lastModifiedTime = date;
                directoryEntry6.createdTime = date;
                if (directoryEntry5.buffer != null) {
                    directoryEntry5.size = new d(directoryEntry5.buffer.length);
                }
                else {
                    directoryEntry5.size = new d(0);
                }
                directoryEntry5.leftSiblingSid = new d(4294967295L);
                directoryEntry5.rightSiblingSid = new d(4294967295L);
                directoryEntry5.childSid = new d(4294967295L);
                list.add(directoryEntry5);
                directoryEntry4.leftSiblingSid = new d(list.size() - 1);
                directoryEntry4 = directoryEntry5;
                if (directoryEntry5 instanceof Storage) {
                    this.a(directoryEntry5, list, date);
                }
            }
            DirectoryEntry directoryEntry7 = directoryEntry2;
            for (int j = n + 1; j < directoryEntry.directoryEntries.size(); ++j) {
                final DirectoryEntry directoryEntry8 = directoryEntry.directoryEntries.get(j);
                if (directoryEntry.color == com.ews.io.storage.a.b) {
                    directoryEntry8.color = com.ews.io.storage.a.a;
                }
                else {
                    directoryEntry8.color = com.ews.io.storage.a.b;
                }
                final DirectoryEntry directoryEntry9 = directoryEntry8;
                directoryEntry9.lastModifiedTime = date;
                directoryEntry9.createdTime = date;
                if (directoryEntry8.buffer != null) {
                    directoryEntry8.size = new d(directoryEntry8.buffer.length);
                }
                else {
                    directoryEntry8.size = new d(0);
                }
                directoryEntry8.leftSiblingSid = new d(4294967295L);
                directoryEntry8.rightSiblingSid = new d(4294967295L);
                directoryEntry8.childSid = new d(4294967295L);
                list.add(directoryEntry8);
                directoryEntry7.rightSiblingSid = new d(list.size() - 1);
                directoryEntry7 = directoryEntry8;
                if (directoryEntry8 instanceof Storage) {
                    this.a(directoryEntry8, list, date);
                }
            }
            if (!(directoryEntry2 instanceof Storage)) {
                break;
            }
            final DirectoryEntry directoryEntry10 = directoryEntry2;
            directoryEntry = directoryEntry10;
        }
    }
    
    private d[] a(final ByteBuffer byteBuffer, final d[] array) {
        final short n = (short)(this.a.c() / 4);
        final d[] array2 = new d[this.a.d().intValue() * n];
        int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            byteBuffer.position(array[i].intValue() * this.a.c() + this.a.c());
            final byte[] array3 = new byte[4];
            for (short n3 = 0; n3 < n; ++n3) {
                byteBuffer.get(array3);
                array2[n2++] = new d(array3);
            }
        }
        return array2;
    }
    
    private d[] b(final ByteBuffer byteBuffer, final d[] array) {
        final short n = (short)(this.a.c() / 4);
        final d[] array2 = new d[this.a.h().intValue() * n];
        final ArrayList<d> list = new ArrayList<d>();
        d g = this.a.g();
        list.add(g);
        while ((g = array[g.intValue()]).longValue() != 4294967294L) {
            list.add(g);
        }
        int n2 = 0;
        for (int i = 0; i < list.size(); ++i) {
            byteBuffer.position(((d)list.get(i)).intValue() * this.a.c() + this.a.c());
            final byte[] array3 = new byte[4];
            for (short n3 = 0; n3 < n; ++n3) {
                byteBuffer.get(array3);
                array2[n2++] = new d(array3);
            }
        }
        return array2;
    }
    
    private d[] a(final ByteBuffer byteBuffer) {
        if (this.a.d().intValue() <= 109) {
            final d[] array = new d[this.a.d().intValue()];
            for (int i = 0; i < this.a.d().intValue(); ++i) {
                array[i] = this.a.j()[i];
            }
            return array;
        }
        final short n;
        final d[] array2 = new d[n = (short)(this.a.c() / 4)];
        final d[] array3 = new d[this.a.d().intValue()];
        for (int j = 0; j < 109; ++j) {
            array3[j] = this.a.j()[j];
        }
        byteBuffer.position(this.a.i().intValue() * this.a.c() + this.a.c());
        int n2 = 109;
        while (true) {
            final byte[] array4 = new byte[4];
            for (short n3 = 0; n3 < n; ++n3) {
                byteBuffer.get(array4);
                array2[n3] = new d(array4);
            }
            for (short n4 = 0; n4 < n - 1; ++n4) {
                if (array2[n4].longValue() != 4294967295L && n2 < array3.length) {
                    array3[n2++] = array2[n4];
                }
            }
            if (array2[n - 1].longValue() == 4294967294L || n2 >= array3.length) {
                break;
            }
            byteBuffer.position(array2[n - 1].intValue() * this.a.c() + this.a.c());
        }
        return array3;
    }
    
    public RootDirectoryEntry getRoot() {
        return this.b;
    }
    
    public short getMajorVersion() {
        return this.a.b();
    }
    
    public void setMajorVersion(final short majorVersion) {
        if (majorVersion == 3 || majorVersion == 4) {
            this.a.a(majorVersion);
        }
    }
    
    public short getSectorSize() {
        return this.a.c();
    }
    
    public short getMiniSectorSize() {
        return 64;
    }
    
    public int getFatSectorCount() {
        return this.a.d().intValue();
    }
    
    public long getMiniStreamMaxSize() {
        return this.a.f().longValue();
    }
    
    public long getMiniFatSectorCount() {
        return this.a.h().longValue();
    }
    
    public byte[] getClassId() {
        return this.a.k();
    }
    
    public void setClassId(final byte[] classId) {
        if (classId != null) {
            this.a.a(classId);
        }
    }
}

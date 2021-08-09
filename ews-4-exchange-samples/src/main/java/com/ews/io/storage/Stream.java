package com.ews.io.storage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Stream extends DirectoryEntry
{
    public Stream() {
        this.type = DirectoryEntryType.STREAM;
    }
    
    public Stream(final String filePath) throws IOException {
        this.type = DirectoryEntryType.STREAM;
        this.load(filePath);
    }
    
    public Stream(final String name, final InputStream stream) throws IOException {
        this.type = DirectoryEntryType.STREAM;
        this.load(name, stream);
    }
    
    public Stream(final String name, final byte[] buffer) {
        this.type = DirectoryEntryType.STREAM;
        this.name = name;
        this.buffer = buffer;
    }
    
    public void load(String filePath) throws IOException {
        final File file = new File(filePath);
        FileInputStream var_1_11 = new FileInputStream(filePath);
        try {
            this.load(file.getName(), (InputStream)var_1_11);
        }
        finally {
            ((FileInputStream)var_1_11).close();
        }
    }
    
    public void load(final String name, final InputStream inputStream) throws IOException {
        this.name = name;
        final ByteBuffer allocate = ByteBuffer.allocate(0);
        final byte[] array = new byte[2048];
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int i = 0;
        while (i >= 0) {
            i = bufferedInputStream.read(array);
            allocate.put(array, 0, i);
        }
    }
    
    public void load(final String name, final byte[] buffer) {
        this.name = name;
        this.buffer = buffer;
    }
    
    public void save(String filePath) throws IOException {
        if (this.buffer != null && this.buffer.length > 0) {
            FileOutputStream var_1_17 = new FileOutputStream(filePath);
            try {
                ((FileOutputStream)var_1_17).write(this.buffer);
            }
            finally {
                ((FileOutputStream)var_1_17).close();
            }
        }
    }
    
    public void save(final OutputStream stream) throws IOException {
        if (stream == null) {
            throw new IllegalArgumentException("stream is null.");
        }
        if (this.buffer != null && this.buffer.length > 0) {
            stream.write(this.buffer);
        }
    }
    
    public InputStream getInputStream() {
        if (this.buffer != null) {
            return new ByteArrayInputStream(this.buffer);
        }
        return null;
    }
    
    public byte[] getBuffer() {
        return this.buffer;
    }
    
    public void setBuffer(final byte[] buffer) {
        this.buffer = buffer;
    }
}

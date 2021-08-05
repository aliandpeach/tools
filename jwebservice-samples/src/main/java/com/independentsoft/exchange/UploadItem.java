package com.independentsoft.exchange;

import java.nio.charset.*;
import java.nio.*;
import java.io.*;

public class UploadItem
{
    private ItemId a;
    private FolderId b;
    private String c;
    private CreateAction d;
    private boolean e;
    
    public UploadItem() {
        this.d = CreateAction.CREATE_NEW;
    }
    
    public UploadItem(String filePath) throws IOException {
        this.d = CreateAction.CREATE_NEW;
        FileInputStream var_1_1C = new FileInputStream(new File(filePath));
        try {
            final BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)var_1_1C);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final byte[] array = new byte[2048];
            try {
                for (int i = bufferedInputStream.read(array); i != -1; i = bufferedInputStream.read(array)) {
                    byteArrayOutputStream.write(array, 0, i);
                }
                this.c = Charset.forName("UTF-8").decode(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())).toString();
            }
            finally {
                byteArrayOutputStream.close();
            }
        }
        finally {
            ((FileInputStream)var_1_1C).close();
        }
    }
    
    public UploadItem(final String filePath, final FolderId parentFolderId) throws IOException {
        this(filePath);
        this.b = parentFolderId;
    }
    
    public UploadItem(final InputStream inputStream) throws IOException {
        this.d = CreateAction.CREATE_NEW;
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream is null.");
        }
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        try {
            for (int i = bufferedInputStream.read(array); i != -1; i = bufferedInputStream.read(array)) {
                byteArrayOutputStream.write(array, 0, i);
            }
            this.c = Charset.forName("UTF-8").decode(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())).toString();
        }
        finally {
            byteArrayOutputStream.close();
        }
    }
    
    public UploadItem(final InputStream inputStream, final FolderId parentFolderId) throws IOException {
        this(inputStream);
        this.b = parentFolderId;
    }
    
    public UploadItem(final byte[] buffer) {
        this.d = CreateAction.CREATE_NEW;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer is null.");
        }
        this.c = Charset.forName("UTF-8").decode(ByteBuffer.wrap(buffer)).toString();
    }
    
    public UploadItem(final byte[] buffer, final FolderId parentFolderId) {
        this.d = CreateAction.CREATE_NEW;
        this.c = Charset.forName("UTF-8").decode(ByteBuffer.wrap(buffer)).toString();
        this.b = parentFolderId;
    }
    
    final String a() {
        final CreateAction d;
        String s = " CreateAction=\"" + (((d = this.d) == CreateAction.CREATE_NEW) ? "CreateNew" : ((d == CreateAction.UPDATE) ? "Update" : "UpdateOrCreate")) + "\"";
        if (this.e) {
            s += " IsAssociated=\"true\"";
        }
        String s2 = "<t:Item" + s + ">";
        if (this.b != null) {
            s2 += this.b.a("t:ParentFolderId");
        }
        if (this.a != null) {
            s2 += this.a.a();
        }
        if (this.c != null) {
            s2 = s2 + "<t:Data>" + this.c + "</t:Data>";
        }
        return s2 + "</t:Item>";
    }
    
    public ItemId getItemId() {
        return this.a;
    }
    
    public void setItemId(final ItemId itemId) {
        this.a = itemId;
    }
    
    public FolderId getParentFolderId() {
        return this.b;
    }
    
    public void setParentFolderId(final FolderId parentFolderId) {
        this.b = parentFolderId;
    }
    
    public String getData() {
        return this.c;
    }
    
    public void setData(final String data) {
        this.c = data;
    }
    
    public CreateAction getCreateAction() {
        return this.d;
    }
    
    public void setCreateAction(final CreateAction createAction) {
        this.d = createAction;
    }
    
    public boolean isAssociated() {
        return this.e;
    }
    
    public void setAsAssociated(final boolean isAssociated) {
        this.e = isAssociated;
    }
}

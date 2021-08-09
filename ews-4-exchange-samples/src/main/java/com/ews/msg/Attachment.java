package com.ews.msg;

import com.ews.io.storage.Storage;
import com.ews.io.storage.Stream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Attachment
{
    private byte[] a;
    private String b;
    private String c;
    private String d;
    private String e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private String j;
    private String k;
    private AttachmentFlags l;
    private String m;
    private String n;
    private AttachmentMethod o;
    private d p;
    private String q;
    private String r;
    private byte[] s;
    private d t;
    private d u;
    private byte[] v;
    private String w;
    private String x;
    private Message y;
    private ObjectType z;
    private boolean A;
    private boolean B;
    private Storage C;
    private Stream D;
    
    public Attachment() {
        this.l = AttachmentFlags.NONE;
        this.o = AttachmentMethod.ATTACH_BY_VALUE;
        this.p = new d(0);
        this.t = new d(0);
        this.u = new d(0);
        this.z = ObjectType.NONE;
    }
    
    public Attachment(final String filePath) throws IOException {
        this.l = AttachmentFlags.NONE;
        this.o = AttachmentMethod.ATTACH_BY_VALUE;
        this.p = new d(0);
        this.t = new d(0);
        this.u = new d(0);
        this.z = ObjectType.NONE;
        final File file = new File(filePath);
        final FileInputStream fileInputStream = new FileInputStream(file);
        try {
            this.a(file.getName(), fileInputStream);
        }
        finally {
            fileInputStream.close();
        }
    }
    
    public Attachment(final String fileName, final InputStream inputStream) throws IOException {
        this.l = AttachmentFlags.NONE;
        this.o = AttachmentMethod.ATTACH_BY_VALUE;
        this.p = new d(0);
        this.t = new d(0);
        this.u = new d(0);
        this.z = ObjectType.NONE;
        this.a(fileName, inputStream);
    }
    
    public Attachment(final String fileName, final byte[] buffer) {
        this.l = AttachmentFlags.NONE;
        this.o = AttachmentMethod.ATTACH_BY_VALUE;
        this.p = new d(0);
        this.t = new d(0);
        this.u = new d(0);
        this.z = ObjectType.NONE;
        this.k = fileName;
        this.f = buffer;
    }
    
    private void a(final String k, InputStream inputStream) throws IOException {
        this.k = k;
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        try {
            for (int i = bufferedInputStream.read(array); i != -1; i = bufferedInputStream.read(array)) {
                byteArrayOutputStream.write(array, 0, i);
            }
            this.f = byteArrayOutputStream.toByteArray();
        }
        finally {
            byteArrayOutputStream.close();
        }
    }
    
    public void save(final String filePath) throws IOException {
        this.save(filePath, false);
    }
    
    public void save(String f, final boolean overwrite) throws IOException {
        final File file = new File(f);
        if (overwrite && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        FileOutputStream var_1_28 = new FileOutputStream(file);
        try {
            this.save(var_1_28);
        }
        finally {
            (var_1_28).close();
        }
    }
    
    public void save(final OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream is null.");
        }
        if (this.f != null && this.f.length > 0) {
            outputStream.write(this.f, 0, this.f.length);
            return;
        }
        if (this.g != null && this.g.length > 0) {
            outputStream.write(this.g, 0, this.g.length);
        }
    }
    
    public byte[] toByteArray() {
        if (this.f != null) {
            return this.f;
        }
        if (this.g != null) {
            return this.g;
        }
        return null;
    }
    
    public InputStream getInputStream() {
        if (this.f != null) {
            return new ByteArrayInputStream(this.f);
        }
        if (this.g != null) {
            return new ByteArrayInputStream(this.g);
        }
        return null;
    }
    
    public byte[] getAdditionalInfo() {
        return this.a;
    }
    
    public void setAdditionalInfo(final byte[] additionalInfo) {
        this.a = additionalInfo;
    }
    
    public String getContentBase() {
        return this.b;
    }
    
    public void setContentBase(final String contentBase) {
        this.b = contentBase;
    }
    
    public String getContentId() {
        return this.c;
    }
    
    public void setContentId(final String contentId) {
        this.c = contentId;
    }
    
    public String getContentLocation() {
        return this.d;
    }
    
    public void setContentLocation(final String contentLocation) {
        this.d = contentLocation;
    }
    
    public String getContentDisposition() {
        return this.e;
    }
    
    public void setContentDisposition(final String contentDisposition) {
        this.e = contentDisposition;
    }
    
    public byte[] getData() {
        return this.f;
    }
    
    public void setData(final byte[] data) {
        this.f = data;
    }
    
    public byte[] getDataObject() {
        return this.g;
    }
    
    public void setDataObject(final byte[] dataObject) {
        this.g = dataObject;
    }
    
    public byte[] getEncoding() {
        return this.h;
    }
    
    public void setEncoding(final byte[] encoding) {
        this.h = encoding;
    }
    
    public byte[] getRecordKey() {
        return this.i;
    }
    
    public void setRecordKey(final byte[] recordKey) {
        this.i = recordKey;
    }
    
    public String getExtension() {
        return this.j;
    }
    
    public void setExtension(final String extension) {
        this.j = extension;
    }
    
    public String getFileName() {
        return this.k;
    }
    
    public void setFileName(final String fileName) {
        this.k = fileName;
    }
    
    public AttachmentFlags getFlags() {
        return this.l;
    }
    
    public void setFlags(final AttachmentFlags flags) {
        this.l = flags;
    }
    
    public String getLongFileName() {
        return this.m;
    }
    
    public void setLongFileName(final String longFileName) {
        this.m = longFileName;
    }
    
    public String getLongPathName() {
        return this.n;
    }
    
    public void setLongPathName(final String longPathName) {
        this.n = longPathName;
    }
    
    public AttachmentMethod getMethod() {
        return this.o;
    }
    
    public void setMethod(final AttachmentMethod method) {
        this.o = method;
    }
    
    public long getMimeSequence() {
        return this.p.longValue();
    }
    
    public void setMimeSequence(final long mimeSequence) {
        this.p = new d(mimeSequence);
    }
    
    public String getMimeTag() {
        return this.q;
    }
    
    public void setMimeTag(final String mimeTag) {
        this.q = mimeTag;
    }
    
    public String getPathName() {
        return this.r;
    }
    
    public void setPathName(final String pathName) {
        this.r = pathName;
    }
    
    public byte[] getRendering() {
        return this.s;
    }
    
    public void setRendering(final byte[] rendering) {
        this.s = rendering;
    }
    
    public long getRenderingPosition() {
        return this.t.longValue();
    }
    
    public void setRenderingPosition(final long renderingPosition) {
        this.t = new d(renderingPosition);
    }
    
    public long getSize() {
        return this.u.longValue();
    }
    
    public void setSize(final long size) {
        this.u = new d(size);
    }
    
    public byte[] getTag() {
        return this.v;
    }
    
    public void setTag(final byte[] tag) {
        this.v = tag;
    }
    
    public String getTransportName() {
        return this.w;
    }
    
    public void setTransportName(final String transportName) {
        this.w = transportName;
    }
    
    public String getDisplayName() {
        return this.x;
    }
    
    public void setDisplayName(final String displayName) {
        this.x = displayName;
    }
    
    public Message getEmbeddedMessage() {
        return this.y;
    }
    
    public void setEmbeddedMessage(final Message embeddedMessage) {
        (this.y = embeddedMessage).setEmbedded(true);
    }
    
    public ObjectType getObjectType() {
        return this.z;
    }
    
    public void setObjectType(final ObjectType objectType) {
        this.z = objectType;
    }
    
    public boolean isHidden() {
        return this.A;
    }
    
    public void setHidden(final boolean isHidden) {
        this.A = isHidden;
    }
    
    public boolean isContactPhoto() {
        return this.B;
    }
    
    public void setContactPhoto(final boolean isContactPhoto) {
        this.B = isContactPhoto;
    }
    
    final Storage a() {
        return this.C;
    }
    
    final void a(final Storage c) {
        this.C = c;
    }
    
    final Stream b() {
        return this.D;
    }
    
    final void a(final Stream d) {
        this.D = d;
    }
}

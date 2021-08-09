package com.ews.exchange;

import javax.xml.stream.*;
import java.text.*;
import java.io.*;

public class FileAttachment extends Attachment
{
    private boolean a;
    private byte[] b;
    
    public FileAttachment() {
    }
    
    public FileAttachment(final String filePath) throws IOException {
        this.a(filePath);
    }
    
    public FileAttachment(final String filePath, final String name) throws IOException {
        this.a(filePath);
        this.name = name;
    }
    
    public FileAttachment(final String filePath, final String name, final String contentType) throws IOException {
        this.a(filePath);
        this.name = name;
        this.contentType = contentType;
    }
    
    public FileAttachment(final InputStream inputStream) throws IOException {
        this.a(null, inputStream);
    }
    
    public FileAttachment(final InputStream inputStream, final String fileName) throws IOException {
        this.a(fileName, inputStream);
    }
    
    public FileAttachment(final InputStream inputStream, final String name, final String contentType) throws IOException {
        this.a(name, inputStream);
        this.contentType = contentType;
    }
    
    public FileAttachment(final byte[] buffer) {
        this.b = buffer;
    }
    
    public FileAttachment(final byte[] buffer, final String name) {
        this.b = buffer;
        this.name = name;
    }
    
    public FileAttachment(final byte[] buffer, final String name, final String contentType) {
        this.b = buffer;
        this.name = name;
        this.contentType = contentType;
    }
    
    FileAttachment(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("AttachmentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.attachmentId = new AttachmentId(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Name") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.name = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentType") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentType = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentId = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("ContentLocation") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.contentLocation = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Size") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.size = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("LastModifiedTime") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.lastModifiedTime = d.c(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsInline") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.isInline = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsContactPhoto") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.a = Boolean.parseBoolean(elementText4);
                }
            }
            else {
                final String elementText5;
                if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Content") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types") && (elementText5 = reader.getElementText()) != null && elementText5.length() > 0) {
                    this.b = d.e(elementText5);
                }
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("FileAttachment") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    private void a(final String s) throws IOException {
        final File file = new File(s);
        final FileInputStream fileInputStream = new FileInputStream(file);
        try {
            this.a(file.getName(), fileInputStream);
        }
        finally {
            fileInputStream.close();
        }
    }
    
    private void a(final String name, InputStream inputStream) throws IOException {
        this.name = name;
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        try {
            for (int i = bufferedInputStream.read(array); i != -1; i = bufferedInputStream.read(array)) {
                (byteArrayOutputStream).write(array, 0, i);
            }
            this.b = (byteArrayOutputStream).toByteArray();
        }
        finally {
            (byteArrayOutputStream).close();
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
        OutputStream var_1_28 = new FileOutputStream(file);
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
        outputStream.write(this.b, 0, this.b.length);
    }
    
    public byte[] toByteArray() {
        return this.b;
    }
    
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.b);
    }
    
    final String a() {
        String s = "<t:FileAttachment>";
        if (this.name != null) {
            s = s + "<t:Name>" + d.a(this.name) + "</t:Name>";
        }
        if (this.contentType != null) {
            s = s + "<t:ContentType>" + d.a(this.contentType) + "</t:ContentType>";
        }
        if (this.contentId != null) {
            s = s + "<t:ContentId>" + d.a(this.contentId) + "</t:ContentId>";
        }
        if (this.contentLocation != null) {
            s = s + "<t:ContentLocation>" + d.a(this.contentLocation) + "</t:ContentLocation>";
        }
        if (this.isInline) {
            s += "<t:IsInline>true</t:IsInline>";
        }
        if (this.a) {
            s += "<t:IsContactPhoto>true</t:IsContactPhoto>";
        }
        if (this.b != null) {
            s = s + "<t:Content>" + d.a(this.b) + "</t:Content>";
        }
        return s + "</t:FileAttachment>";
    }
    
    public String toString() {
        if (this.name != null) {
            return this.name;
        }
        return super.toString();
    }
    
    public boolean isContactPhoto() {
        return this.a;
    }
    
    public void setContactPhoto(final boolean isContactPhoto) {
        this.a = isContactPhoto;
    }
    
    public byte[] getContent() {
        return this.b;
    }
    
    public void setContent(final byte[] content) {
        this.b = content;
    }
}

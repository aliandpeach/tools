package com.ews.exchange;

import javax.xml.stream.*;
import java.util.*;

public class RetentionSettings
{
    private boolean a;
    private String b;
    private String c;
    private boolean d;
    private List<RetentionPolicyTag> e;
    
    public RetentionSettings() {
        this.e = new ArrayList<RetentionPolicyTag>();
    }
    
    RetentionSettings(final XMLStreamReader reader) throws XMLStreamException {
        this.e = new ArrayList<RetentionPolicyTag>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException {
        this.b = reader.getAttributeValue(null, "RetentionComment");
        this.c = reader.getAttributeValue(null, "RetentionUrl");
        final String attributeValue;
        if ((attributeValue = reader.getAttributeValue(null, "Enabled")) != null && attributeValue.length() > 0) {
            this.a = attributeValue.toLowerCase().equals("true");
        }
        while (reader.hasNext() && reader.next() > 0) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getLocalName().equals("PolicyTag")) {
                this.e.add(new RetentionPolicyTag(reader, "PolicyTag"));
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getLocalName().equals("ArchiveTag")) {
                this.e.add(new RetentionPolicyTag(reader, "ArchiveTag"));
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getLocalName().equals("DefaultArchiveTag")) {
                this.e.add(new RetentionPolicyTag(reader, "DefaultArchiveTag"));
            }
            else {
                if (!reader.isStartElement() || reader.getLocalName() == null || !reader.getLocalName().equals("ArchiveSync")) {
                    continue;
                }
                final String attributeValue2;
                if ((attributeValue2 = reader.getAttributeValue(null, "FullCrawlRequired")) == null || attributeValue2.length() <= 0) {
                    continue;
                }
                this.d = attributeValue2.toLowerCase().equals("true");
            }
        }
    }
    
    final String a() {
        final String s = "";
        String s2;
        if (this.a) {
            s2 = s + " Enabled=\"True\"";
        }
        else {
            s2 = s + " Enabled=\"False\"";
        }
        if (this.b != null) {
            s2 = s2 + " RetentionComment=\"" + com.ews.exchange.d.a(this.b) + "\"";
        }
        if (this.c != null) {
            s2 = s2 + " RetentionUrl=\"" + com.ews.exchange.d.a(this.c) + "\"";
        }
        final String string = "<UserConfiguration><Info version=\"Exchange.14\"><Data>" + "<RetentionHold " + s2 + "/>";
        String s3;
        if (this.d) {
            s3 = string + "<ArchiveSync FullCrawlRequired=\"True\"/>";
        }
        else {
            s3 = string + "<ArchiveSync FullCrawlRequired=\"False\"/>";
        }
        final Iterator<RetentionPolicyTag> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            s3 += iterator.next().a();
        }
        return s3 + "</Data></Info></UserConfiguration>";
    }
    
    public boolean isEnabled() {
        return this.a;
    }
    
    public void setEnabled(final boolean enabled) {
        this.a = enabled;
    }
    
    public String getComment() {
        return this.b;
    }
    
    public void setComment(final String comment) {
        this.b = comment;
    }
    
    public String getUrl() {
        return this.c;
    }
    
    public void setUrl(final String url) {
        this.c = url;
    }
    
    public boolean isFullCrawlRequired() {
        return this.d;
    }
    
    public void setFullCrawlRequired(final boolean fullCrawlRequired) {
        this.d = fullCrawlRequired;
    }
    
    public List<RetentionPolicyTag> getRetentionPolicyTags() {
        return this.e;
    }
}

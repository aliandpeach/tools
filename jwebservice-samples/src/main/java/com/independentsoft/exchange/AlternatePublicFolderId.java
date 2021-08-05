package com.independentsoft.exchange;

public class AlternatePublicFolderId extends SourceId
{
    private IdFormat a;
    private String b;
    
    public AlternatePublicFolderId() {
        this.a = IdFormat.ENTRY_ID;
    }
    
    public AlternatePublicFolderId(final IdFormat format, final String folderId) {
        this.a = IdFormat.ENTRY_ID;
        this.a = format;
        this.b = folderId;
    }
    
    final String a() {
        String s = "" + " Format=\"" + com.independentsoft.exchange.a.a(this.a) + "\"";
        if (this.b != null) {
            s = s + " FolderId=\"" + d.a(this.b) + "\"";
        }
        return "<t:AlternatePublicFolderId" + s + "/>";
    }
    
    public IdFormat getFormat() {
        return this.a;
    }
    
    public void setFormat(final IdFormat format) {
        this.a = format;
    }
    
    public String getFolderId() {
        return this.b;
    }
    
    public void setFolderId(final String folderId) {
        this.b = folderId;
    }
}

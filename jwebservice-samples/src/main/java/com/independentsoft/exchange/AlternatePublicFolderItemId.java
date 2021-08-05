package com.independentsoft.exchange;

public class AlternatePublicFolderItemId extends SourceId
{
    private IdFormat a;
    private String b;
    private String c;
    
    public AlternatePublicFolderItemId() {
        this.a = IdFormat.ENTRY_ID;
    }
    
    public AlternatePublicFolderItemId(final IdFormat format, final String folderId, final String itemId) {
        this.a = IdFormat.ENTRY_ID;
        this.a = format;
        this.b = folderId;
        this.c = itemId;
    }
    
    final String a() {
        String s = "" + " Format=\"" + com.independentsoft.exchange.a.a(this.a) + "\"";
        if (this.c != null) {
            s = s + " FolderId=\"" + d.a(this.c) + "\"";
        }
        if (this.c != null) {
            s = s + " ItemId=\"" + d.a(this.c) + "\"";
        }
        return "<t:AlternatePublicFolderItemId" + s + "/>";
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
    
    public String getItemId() {
        return this.c;
    }
    
    public void setItemId(final String itemId) {
        this.c = itemId;
    }
}

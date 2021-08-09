package com.ews.exchange;

public class AddressListId extends FolderId
{
    public AddressListId() {
    }
    
    public AddressListId(final String id) {
        this.id = id;
    }
    
    final String a() {
        return this.a("t:AddressListId");
    }
    
    final String a(String string) {
        String string2 = "";
        if (this.id != null) {
            string2 = string2 + " Id=\"" + this.id + "\"";
        }
        return string = "<" + string + string2 + "/>";
    }
    
    public String toString() {
        if (this.id != null) {
            return this.id;
        }
        return super.toString();
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
}

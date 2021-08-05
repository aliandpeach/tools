package com.independentsoft.msg;

public class Recipient
{
    private String a;
    private String b;
    private String c;
    private ObjectType d;
    private RecipientType e;
    private DisplayType f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private int o;
    private String p;
    private String q;
    
    public Recipient() {
        this.d = ObjectType.NONE;
        this.e = RecipientType.NONE;
        this.f = DisplayType.NONE;
    }
    
    public String getDisplayName() {
        return this.a;
    }
    
    public void setDisplayName(final String displayName) {
        this.a = displayName;
    }
    
    public String getEmailAddress() {
        return this.b;
    }
    
    public void setEmailAddress(final String emailAddress) {
        this.b = emailAddress;
    }
    
    public String getAddressType() {
        return this.c;
    }
    
    public void setAddressType(final String addressType) {
        this.c = addressType;
    }
    
    public ObjectType getObjectType() {
        return this.d;
    }
    
    public void setObjectType(final ObjectType objectType) {
        this.d = objectType;
    }
    
    public RecipientType getRecipientType() {
        return this.e;
    }
    
    public void setRecipientType(final RecipientType recipientType) {
        this.e = recipientType;
    }
    
    public DisplayType getDisplayType() {
        return this.f;
    }
    
    public void setDisplayType(final DisplayType displayType) {
        this.f = displayType;
    }
    
    public byte[] getEntryId() {
        return this.g;
    }
    
    public void setEntryId(final byte[] entryId) {
        this.g = entryId;
    }
    
    public byte[] getInstanceKey() {
        return this.h;
    }
    
    public void setInstanceKey(final byte[] instanceKey) {
        this.h = instanceKey;
    }
    
    public byte[] getSearchKey() {
        return this.i;
    }
    
    public void setSearchKey(final byte[] searchKey) {
        this.i = searchKey;
    }
    
    public boolean getResponsibility() {
        return this.j;
    }
    
    public void setResponsibility(final boolean responsibility) {
        this.j = responsibility;
    }
    
    public String getSmtpAddress() {
        return this.k;
    }
    
    public void setSmtpAddress(final String smtpAddress) {
        this.k = smtpAddress;
    }
    
    public String getDisplayName7Bit() {
        return this.l;
    }
    
    public void setDisplayName7Bit(final String displayName7Bit) {
        this.l = displayName7Bit;
    }
    
    public String getTransmitableDisplayName() {
        return this.m;
    }
    
    public void setTransmitableDisplayName(final String transmitableDisplayName) {
        this.m = transmitableDisplayName;
    }
    
    public boolean getSendRichInfo() {
        return this.n;
    }
    
    public void setSendRichInfo(final boolean sendRichInfo) {
        this.n = sendRichInfo;
    }
    
    public int getSendInternetEncoding() {
        return this.o;
    }
    
    public void setSendInternetEncoding(final int sendInternetEncoding) {
        this.o = sendInternetEncoding;
    }
    
    public String getOriginatingAddressType() {
        return this.p;
    }
    
    public void setOriginatingAddressType(final String originatingAddressType) {
        this.p = originatingAddressType;
    }
    
    public String getOriginatingEmailAddress() {
        return this.q;
    }
    
    public void setOriginatingEmailAddress(final String originatingEmailAddress) {
        this.q = originatingEmailAddress;
    }
}

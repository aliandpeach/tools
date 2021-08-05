package com.ews.exchange;

public class ExchangeProxyProtocol
{
    private ProtocolType a;
    private AuthenticationPackage b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    
    public ExchangeProxyProtocol() {
        this.a = ProtocolType.EXCHANGE_PROXY;
        this.b = AuthenticationPackage.NONE;
        this.m = true;
    }
    
    public ProtocolType getType() {
        return this.a;
    }
    
    public AuthenticationPackage getAuthenticationPackage() {
        return this.b;
    }
    
    public void setAuthenticationPackage(final AuthenticationPackage authenticationPackage) {
        this.b = authenticationPackage;
    }
    
    public String getServer() {
        return this.c;
    }
    
    public void setServer(final String server) {
        this.c = server;
    }
    
    public String getServerDN() {
        return this.d;
    }
    
    public void setServerDN(final String serverDN) {
        this.d = serverDN;
    }
    
    public String getServerVersion() {
        return this.e;
    }
    
    public void setServerVersion(final String serverVersion) {
        this.e = serverVersion;
    }
    
    public String getActiveDirectory() {
        return this.f;
    }
    
    public void setActiveDirectory(final String activeDirectory) {
        this.f = activeDirectory;
    }
    
    public String getMailboxDatabaseLegacyDN() {
        return this.g;
    }
    
    public void setMailboxDatabaseLegacyDN(final String mailboxDatabaseLegacyDN) {
        this.g = mailboxDatabaseLegacyDN;
    }
    
    public String getAvailabilityServiceUrl() {
        return this.h;
    }
    
    public void setAvailabilityServiceUrl(final String availabilityServiceUrl) {
        this.h = availabilityServiceUrl;
    }
    
    public String getExchangeWebServiceUrl() {
        return this.i;
    }
    
    public void setExchangeWebServiceUrl(final String exchangeWebServiceUrl) {
        this.i = exchangeWebServiceUrl;
    }
    
    public String getUnifiedMessagingServiceUrl() {
        return this.j;
    }
    
    public void setUnifiedMessagingServiceUrl(final String unifiedMessagingServiceUrl) {
        this.j = unifiedMessagingServiceUrl;
    }
    
    public String getOutOfOfficeUrl() {
        return this.k;
    }
    
    public void setOutOfOfficeUrl(final String outOfOfficeUrl) {
        this.k = outOfOfficeUrl;
    }
    
    public String getOfflineAddressBookUrl() {
        return this.l;
    }
    
    public void setOfflineAddressBookUrl(final String offlineAddressBookUrl) {
        this.l = offlineAddressBookUrl;
    }
    
    public boolean isSslEnabled() {
        return this.m;
    }
    
    public void setSslEnabled(final boolean sslEnabled) {
        this.m = sslEnabled;
    }
    
    public String getExchangeControlPanelUrl() {
        return this.n;
    }
    
    public void setExchangeControlPanelUrl(final String exchangeControlPanelUrl) {
        this.n = exchangeControlPanelUrl;
    }
    
    public String getExchangeControlPanelUnifiedMessagingUrl() {
        return this.o;
    }
    
    public void setExchangeControlPanelUnifiedMessagingUrl(final String exchangeControlPanelUnifiedMessagingUrl) {
        this.o = exchangeControlPanelUnifiedMessagingUrl;
    }
    
    public String getExchangeControlPanelEmailAggregationUrl() {
        return this.p;
    }
    
    public void setExchangeControlPanelEmailAggregationUrl(final String exchangeControlPanelEmailAggregationUrl) {
        this.p = exchangeControlPanelEmailAggregationUrl;
    }
    
    public String getExchangeControlPanelTextMessagingUrl() {
        return this.q;
    }
    
    public void setExchangeControlPanelTextMessagingUrl(final String exchangeControlPanelTextMessagingUrl) {
        this.q = exchangeControlPanelTextMessagingUrl;
    }
    
    public String getExchangeControlPanelMessageTrackingUrl() {
        return this.r;
    }
    
    public void setExchangeControlPanelMessageTrackingUrl(final String exchangeControlPanelMessageTrackingUrl) {
        this.r = exchangeControlPanelMessageTrackingUrl;
    }
    
    public String getExchangeControlPanelRetentionTagsUrl() {
        return this.s;
    }
    
    public void setExchangeControlPanelRetentionTagsUrl(final String exchangeControlPanelRetentionTagsUrl) {
        this.s = exchangeControlPanelRetentionTagsUrl;
    }
    
    public String getPublicFolderServer() {
        return this.t;
    }
    
    public void setPublicFolderServer(final String publicFolderServer) {
        this.t = publicFolderServer;
    }
}

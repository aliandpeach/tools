package com.independentsoft.exchange;

import org.apache.http.conn.*;
import org.apache.http.client.config.*;
import org.apache.http.conn.ssl.*;
import java.security.cert.*;
import java.security.*;
import org.apache.http.conn.socket.*;
import org.apache.http.impl.conn.*;

import java.text.ParseException;
import java.util.logging.*;
import javax.net.ssl.*;
import org.apache.http.entity.*;
import org.apache.http.auth.*;
import org.apache.http.impl.auth.*;
import org.apache.http.config.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.*;
import org.apache.http.impl.client.*;
import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import org.apache.http.*;
import java.net.*;
import java.io.*;

public class AutodiscoverService
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Identity f;
    private RequestServerVersion g;
    private boolean h;
    private Proxy i;
    private int j;
    private int k;
    private CloseableHttpClient l;
    private Credentials m;
    private HttpHost n;
    private HttpClientConnectionManager o;
    private RequestConfig p;
    private SSLConnectionSocketFactory q;
    private Header[] r;
    
    public AutodiscoverService() {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a();
    }
    
    public AutodiscoverService(final String url) {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a = url;
        this.a();
    }
    
    public AutodiscoverService(final String url, final String username, final String password) {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a = url;
        this.b = username;
        this.c = password;
        this.a();
    }
    
    public AutodiscoverService(final String url, final String username, final String password, final String domain) {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a = url;
        this.b = username;
        this.c = password;
        this.d = domain;
        this.a();
    }
    
    private void a() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                public final boolean verify(final String hostname, final SSLSession session) {
                    return true;
                }
            });
            final SSLContext build;
            (build = SSLContexts.custom().useTLS().build()).init(null, new X509TrustManager[] { new X509TrustManager() {
                    public final void checkClientTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
                    }
                    
                    public final void checkServerTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
                    }
                    
                    public final X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                } }, new SecureRandom());
            this.q = new SSLConnectionSocketFactory(build, new NoopHostnameVerifier());
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.INSTANCE)
                    .register("https", this.q)
                    .build();
            this.o = new PoolingHttpClientConnectionManager(registry);
            HttpsURLConnection.setDefaultSSLSocketFactory(build.getSocketFactory());
            Logger.getLogger("org.apache.http.impl.client.DefaultRequestDirector").setLevel(Level.OFF);
            this.p = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).setProxyPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).setTargetPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).build();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private InputStream a(final String s) throws Exception {
        return this.a(this.a, s);
    }
    
    private InputStream a(String a, final String requestBody) throws Exception {
        com.independentsoft.exchange.b.a();
        if (!this.h) {
            final StringEntity entity;
            (entity = new StringEntity(requestBody, "UTF-8")).setContentType("text/xml; charset=utf-8");
            Object execute = null;
            int i = 1;
            while (i != 0) {
                final URI uri = new URI(a);
                final HttpPost httpPost;
                (httpPost = new HttpPost(uri)).setHeader("User-Agent", com.independentsoft.exchange.b.a);
                httpPost.setEntity((HttpEntity)entity);
                if (this.r != null) {
                    httpPost.setHeaders(this.r);
                }
                final CredentialsProvider defaultCredentialsProvider;
                (defaultCredentialsProvider = (CredentialsProvider)new BasicCredentialsProvider()).setCredentials(new AuthScope(uri.getHost(), uri.getPort(), AuthScope.ANY_REALM), (Credentials)new UsernamePasswordCredentials(this.b, this.c));
                defaultCredentialsProvider.setCredentials(new AuthScope(uri.getHost(), uri.getPort(), AuthScope.ANY_REALM), (Credentials)new NTCredentials(this.b, this.c, uri.getHost(), (this.d != null) ? this.d : ""));
                if (this.n != null && this.m != null) {
                    defaultCredentialsProvider.setCredentials(new AuthScope(this.n.getHostName(), this.n.getPort(), AuthScope.ANY_REALM), this.m);
                }
                final HttpClientBuilder custom = HttpClients.custom();
                if (this.n != null) {
                    custom.setProxy(this.n);
                }
                if (this.p != null) {
                    custom.setDefaultRequestConfig(this.p);
                }
                if (this.o != null) {
                    custom.setConnectionManager(this.o);
                }
                custom.setDefaultAuthSchemeRegistry((Lookup)RegistryBuilder.create().register("NTLM", (Object)new NTLMSchemeFactory()).register("Digest", (Object)new DigestSchemeFactory()).register("Negotiate", (Object)new SPNegoSchemeFactory()).register("Kerberos", (Object)new KerberosSchemeFactory()).register("Basic", (Object)new BasicSchemeFactory()).build());
                this.l = custom.setDefaultCredentialsProvider(defaultCredentialsProvider).build();
                final StatusLine statusLine;
                if ((statusLine = ((HttpResponse)(execute = this.l.execute((HttpUriRequest)httpPost))).getStatusLine()).getStatusCode() >= 300 && statusLine.getStatusCode() < 400) {
                    final Header[] headers;
                    if ((headers = ((HttpResponse)execute).getHeaders("Location")).length > 0) {
                        this.a = headers[0].getValue();
                        a = this.a;
                        continue;
                    }
                }
                else if (statusLine.getStatusCode() >= 400) {
                    throw new ServiceException(Integer.toString(statusLine.getStatusCode()), statusLine.getReasonPhrase(), null, requestBody, null);
                }
                i = 0;
            }
            return ((HttpResponse)execute).getEntity().getContent();
        }
        OutputStream outputStream = null;
        Object o;
        try {
            if (this.b != null && this.c != null) {
                Authenticator.setDefault(new Authenticator() {
                    protected final PasswordAuthentication getPasswordAuthentication() {
                        if (AutodiscoverService.this.d != null) {
                            return new PasswordAuthentication(AutodiscoverService.this.d + "\\" + AutodiscoverService.this.b, AutodiscoverService.this.c.toCharArray());
                        }
                        return new PasswordAuthentication(AutodiscoverService.this.b, AutodiscoverService.this.c.toCharArray());
                    }
                });
            }
            ((HttpURLConnection)(o = new URL(a).openConnection(this.i))).setInstanceFollowRedirects(true);
            ((URLConnection)o).setDoInput(true);
            ((URLConnection)o).setDoOutput(true);
            ((HttpURLConnection)o).setRequestMethod("POST");
            ((URLConnection)o).setUseCaches(false);
            ((URLConnection)o).setConnectTimeout(this.j);
            ((URLConnection)o).setReadTimeout(this.k);
            ((URLConnection)o).setRequestProperty("Content-Type", "text/xml");
            ((URLConnection)o).setRequestProperty("Content-Length", new StringBuilder().append(requestBody.getBytes("UTF-8").length).toString());
            ((URLConnection)o).setRequestProperty("User-Agent", com.independentsoft.exchange.b.a);
            ((URLConnection)o).connect();
            (outputStream = ((URLConnection)o).getOutputStream()).write(requestBody.getBytes("UTF-8"));
            outputStream.flush();
            o = new ByteArrayInputStream(c(((URLConnection)o).getInputStream()));
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException ex) {}
            }
        }
        return (InputStream)o;
    }
    
    public MobileSyncProvider autodiscoverMobileSyncProvider(final String emailAddress) throws ServiceException, AutodiscoverException {
        return this.b(emailAddress);
    }
    
    private MobileSyncProvider b(final String s) throws ServiceException, AutodiscoverException {
        InputStream var2 = null;
        String var3 = "<Autodiscover xmlns=\"http://schemas.microsoft.com/exchange/autodiscover/mobilesync/requestschema/2006\">";
        var3 = var3 + "<Request>";
        var3 = var3 + "<EMailAddress>" + com.independentsoft.exchange.d.a(s) + "</EMailAddress>";
        var3 = var3 + "<AcceptableResponseSchema>http://schemas.microsoft.com/exchange/autodiscover/mobilesync/responseschema/2006</AcceptableResponseSchema>";
        var3 = var3 + "</Request>";
        var3 = var3 + "</Autodiscover>";

        MobileSyncProvider var16;
        try {
            var16 = b(var2 = this.a(var3));
        } catch (ServiceException var13) {
            throw var13;
        } catch (Exception var14) {
            throw new ServiceException(var14.getMessage(), var14, var3);
        } finally {
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var12) {
                    throw new ServiceException(var12.getMessage(), var12, var3);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var11) {
                    throw new ServiceException(var11.getMessage(), var11, var3);
                }
            }

        }

        if (var16.a() != null) {
            throw new AutodiscoverException(var16.a().getStatus(), var16.a().getMessage(), var16.a().getDebugData());
        } else {
            return var16;
        }
    }
    
    public GetUserSettingsResponse getUserSettings(final String emailAddress, final UserSettingName settingName) throws ServiceException, AutodiscoverException {
        final ArrayList<String> emailAddresses;
        (emailAddresses = new ArrayList<String>()).add(emailAddress);
        final ArrayList<UserSettingName> settingNames;
        (settingNames = new ArrayList<UserSettingName>()).add(settingName);
        return this.getUserSettings(emailAddresses, settingNames);
    }
    
    public GetUserSettingsResponse getUserSettings(final String emailAddress, final List<UserSettingName> settingNames) throws ServiceException, AutodiscoverException {
        final ArrayList<String> emailAddresses;
        (emailAddresses = new ArrayList<String>()).add(emailAddress);
        return this.getUserSettings(emailAddresses, settingNames);
    }
    
    public GetUserSettingsResponse getUserSettings(final List<String> emailAddresses, final List<UserSettingName> settingNames) throws ServiceException, AutodiscoverException {
        return this.a(emailAddresses, settingNames);
    }
    
    private GetUserSettingsResponse a(final List<String> list, final List<UserSettingName> list2) throws ServiceException, AutodiscoverException {
        InputStream var3 = null;
        String var4 = this.a.toLowerCase().replace("autodiscover.xml", "autodiscover.svc");
        String var5 = "<soap:Header>";
        var5 = var5 + "<a:RequestedServerVersion>Exchange2010</a:RequestedServerVersion>";
        var5 = var5 + "<wsa:Action>http://schemas.microsoft.com/exchange/2010/Autodiscover/Autodiscover/GetUserSettings</wsa:Action>";
        var5 = var5 + "<wsa:To>" + var4 + "</wsa:To>";
        var5 = var5 + "</soap:Header>";
        String var6 = "<a:GetUserSettingsRequestMessage xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\">";
        var6 = var6 + "<a:Request>";
        int var7;
        if (list != null && list.size() > 0) {
            var6 = var6 + "<a:Users>";

            for(var7 = 0; var7 < list.size(); ++var7) {
                var6 = var6 + "<a:User>";
                var6 = var6 + "<a:Mailbox>" + com.independentsoft.exchange.d.a((String)list.get(var7)) + "</a:Mailbox>";
                var6 = var6 + "</a:User>";
            }

            var6 = var6 + "</a:Users>";
        }

        if (list2 != null && list2.size() > 0) {
            var6 = var6 + "<a:RequestedSettings>";

            for(var7 = 0; var7 < list2.size(); ++var7) {
                var6 = var6 + "<a:Setting>" + com.independentsoft.exchange.a.a((UserSettingName)list2.get(var7)) + "</a:Setting>";
            }

            var6 = var6 + "</a:RequestedSettings>";
        }

        var6 = var6 + "</a:Request>";
        var6 = var6 + "</a:GetUserSettingsRequestMessage>";
        String var21 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        var21 = var21 + "<soap:Envelope xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">";
        var21 = var21 + var5;
        var21 = var21 + "<soap:Body>";
        var21 = var21 + var6;
        var21 = var21 + "</soap:Body>";
        var21 = var21 + "</soap:Envelope>";

        GetUserSettingsResponse var20;
        try {
            var3 = this.a(var4, var21);
            var20 = new GetUserSettingsResponse(var3);
        } catch (ServiceException var17) {
            throw var17;
        } catch (Exception var18) {
            throw new ServiceException(var18.getMessage(), var18, var6);
        } finally {
            if (var3 != null) {
                try {
                    var3.close();
                } catch (IOException var16) {
                    throw new ServiceException(var16.getMessage(), var16, var6);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var15) {
                    throw new ServiceException(var15.getMessage(), var15, var6);
                }
            }

        }

        if (var20.getErrorCode() != ErrorCode.NO_ERROR) {
            throw new AutodiscoverException(var20.getErrorCode(), var20.getErrorMessage());
        } else {
            return var20;
        }
    }
    
    public GetDomainSettingsResponse getDomainSettings(final String domain, final DomainSettingName settingName) throws ServiceException, AutodiscoverException {
        final ArrayList<String> domains;
        (domains = new ArrayList<String>()).add(domain);
        final ArrayList<DomainSettingName> settingNames;
        (settingNames = new ArrayList<DomainSettingName>()).add(settingName);
        return this.getDomainSettings(domains, settingNames);
    }
    
    public GetDomainSettingsResponse getDomainSettings(final String domain, final List<DomainSettingName> settingNames) throws ServiceException, AutodiscoverException {
        final ArrayList<String> domains;
        (domains = new ArrayList<String>()).add(domain);
        return this.getDomainSettings(domains, settingNames);
    }
    
    public GetDomainSettingsResponse getDomainSettings(final List<String> domains, final List<DomainSettingName> settingNames) throws ServiceException, AutodiscoverException {
        return this.b(domains, settingNames);
    }
    
    private GetDomainSettingsResponse b(final List<String> list, final List<DomainSettingName> list2) throws ServiceException, AutodiscoverException {
        InputStream var3 = null;
        String var4 = this.a.toLowerCase().replace("autodiscover.xml", "autodiscover.svc");
        String var5 = "<soap:Header>";
        var5 = var5 + "<a:RequestedServerVersion>Exchange2010</a:RequestedServerVersion>";
        var5 = var5 + "<wsa:Action>http://schemas.microsoft.com/exchange/2010/Autodiscover/Autodiscover/GetDomainSettings</wsa:Action>";
        var5 = var5 + "<wsa:To>" + var4 + "</wsa:To>";
        var5 = var5 + "</soap:Header>";
        String var6 = "<a:GetDomainSettingsRequestMessage xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\">";
        var6 = var6 + "<a:Request>";
        int var7;
        if (list != null && list.size() > 0) {
            var6 = var6 + "<a:Domains>";

            for(var7 = 0; var7 < list.size(); ++var7) {
                var6 = var6 + "<a:Domain>" + com.independentsoft.exchange.d.a((String)list.get(var7)) + "</a:Domain>";
            }

            var6 = var6 + "</a:Domains>";
        }

        if (list2 != null && list2.size() > 0) {
            var6 = var6 + "<a:RequestedSettings>";

            for(var7 = 0; var7 < list2.size(); ++var7) {
                var6 = var6 + "<a:Setting>" + ((DomainSettingName)list2.get(var7) == DomainSettingName.EXTERNAL_EWS_URL ? "ExternalEwsUrl" : "ExternalEwsVersion") + "</a:Setting>";
            }

            var6 = var6 + "</a:RequestedSettings>";
        }

        var6 = var6 + "</a:Request>";
        var6 = var6 + "</a:GetDomainSettingsRequestMessage>";
        String var21 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        var21 = var21 + "<soap:Envelope xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">";
        var21 = var21 + var5;
        var21 = var21 + "<soap:Body>";
        var21 = var21 + var6;
        var21 = var21 + "</soap:Body>";
        var21 = var21 + "</soap:Envelope>";

        GetDomainSettingsResponse var20;
        try {
            var3 = this.a(var4, var21);
            var20 = new GetDomainSettingsResponse(var3);
        } catch (ServiceException var17) {
            throw var17;
        } catch (Exception var18) {
            throw new ServiceException(var18.getMessage(), var18, var21);
        } finally {
            if (var3 != null) {
                try {
                    var3.close();
                } catch (IOException var16) {
                    throw new ServiceException(var16.getMessage(), var16, var21);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var15) {
                    throw new ServiceException(var15.getMessage(), var15, var6);
                }
            }

        }

        if (var20.getErrorCode() != ErrorCode.NO_ERROR) {
            throw new AutodiscoverException(var20.getErrorCode(), var20.getErrorMessage());
        } else {
            return var20;
        }
    }
    
    public GetFederationInformationResponse getFederationInformation(final String domain) throws ServiceException, AutodiscoverException {
        return this.c(domain);
    }
    
    private GetFederationInformationResponse c(final String s) throws ServiceException, AutodiscoverException {
        InputStream var2 = null;
        String var3 = this.a.toLowerCase().replace("autodiscover.xml", "autodiscover.svc");
        String var4 = "<soap:Header>";
        var4 = var4 + "<a:RequestedServerVersion>Exchange2010</a:RequestedServerVersion>";
        var4 = var4 + "<wsa:Action>http://schemas.microsoft.com/exchange/2010/Autodiscover/Autodiscover/GetFederationInformation</wsa:Action>";
        var4 = var4 + "<wsa:To>" + var3 + "</wsa:To>";
        var4 = var4 + "</soap:Header>";
        String var5 = "<a:GetFederationInformationRequestMessage xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\">";
        var5 = var5 + "<a:Request>";
        var5 = var5 + "<a:Domain>" + com.independentsoft.exchange.d.a(s) + "</a:Domain>";
        var5 = var5 + "</a:Request>";
        var5 = var5 + "</a:GetFederationInformationRequestMessage>";
        String var6 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        var6 = var6 + "<soap:Envelope xmlns:a=\"http://schemas.microsoft.com/exchange/2010/Autodiscover\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">";
        var6 = var6 + var4;
        var6 = var6 + "<soap:Body>";
        var6 = var6 + var5;
        var6 = var6 + "</soap:Body>";
        var6 = var6 + "</soap:Envelope>";

        GetFederationInformationResponse var19;
        try {
            var2 = this.a(var3, var6);
            var19 = new GetFederationInformationResponse(var2);
        } catch (ServiceException var16) {
            throw var16;
        } catch (Exception var17) {
            throw new ServiceException(var17.getMessage(), var17, var6);
        } finally {
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var15) {
                    throw new ServiceException(var15.getMessage(), var15, var6);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var14) {
                    throw new ServiceException(var14.getMessage(), var14, var5);
                }
            }

        }

        if (var19.getErrorCode() != ErrorCode.NO_ERROR) {
            throw new AutodiscoverException(var19.getErrorCode(), var19.getErrorMessage());
        } else {
            return var19;
        }
    }
    
    public OutlookProvider autodiscoverOutlookProvider(final String emailAddress) throws ServiceException, AutodiscoverException {
        return this.d(emailAddress);
    }
    
    private OutlookProvider d(final String s) throws ServiceException, AutodiscoverException {
        InputStream var2 = null;
        String var3 = "<Autodiscover xmlns=\"http://schemas.microsoft.com/exchange/autodiscover/outlook/requestschema/2006\">";
        var3 = var3 + "<Request>";
        if (s.toLowerCase().indexOf("/o") >= 0 && s.toLowerCase().indexOf("cn=") >= 0) {
            var3 = var3 + "<LegacyDN>" + com.independentsoft.exchange.d.a(s) + "</LegacyDN>";
        } else {
            var3 = var3 + "<EMailAddress>" + com.independentsoft.exchange.d.a(s) + "</EMailAddress>";
        }

        var3 = var3 + "<AcceptableResponseSchema>http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a</AcceptableResponseSchema>";
        var3 = var3 + "</Request>";
        var3 = var3 + "</Autodiscover>";

        OutlookProvider var16;
        try {
            var16 = a(var2 = this.a(var3));
        } catch (ServiceException var13) {
            throw var13;
        } catch (Exception var14) {
            throw new ServiceException(var14.getMessage(), var14, var3);
        } finally {
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var12) {
                    throw new ServiceException(var12.getMessage(), var12, var3);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var11) {
                    throw new ServiceException(var11.getMessage(), var11, var3);
                }
            }

        }

        if (var16.a() != null) {
            throw new AutodiscoverException(var16.a());
        } else {
            return var16;
        }
    }
    
    private static OutlookProvider a(final InputStream inputStream) throws XMLStreamException, ParseException
    {
        OutlookProvider var1 = null;
        XMLStreamReader var3 = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);

        while(var3.hasNext() && var3.next() > 0) {
            if (var3.isStartElement() && var3.getLocalName() != null && var3.getNamespaceURI() != null && var3.getLocalName().equals("Autodiscover") && var3.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                var1 = new OutlookProvider(var3);
            }
        }

        return var1;
    }
    
    private static MobileSyncProvider b(final InputStream inputStream) throws XMLStreamException {
        MobileSyncProvider mobileSyncProvider = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Autodiscover") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/responseschema/2006")) {
                mobileSyncProvider = new MobileSyncProvider(xmlStreamReader);
            }
        }
        return mobileSyncProvider;
    }
    
    private static byte[] c(InputStream inputStream) throws IOException {
        BufferedInputStream var6 = new BufferedInputStream(inputStream);
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        byte[] var2 = new byte[2048];

        try {
            for(int var3 = var6.read(var2); var3 != -1; var3 = var6.read(var2)) {
                var1.write(var2, 0, var3);
            }

            var2 = var1.toByteArray();
            return var2;
        } finally {
            var6.close();
            var1.close();
        }
    }
    
    public String getUrl() {
        return this.a;
    }
    
    public void setUrl(final String url) {
        this.a = url;
    }
    
    public String getUsername() {
        return this.b;
    }
    
    public void setUsername(final String username) {
        this.b = username;
    }
    
    public String getPassword() {
        return this.c;
    }
    
    public void setPassword(final String password) {
        this.c = password;
    }
    
    public String getDomain() {
        return this.d;
    }
    
    public void setDomain(final String domain) {
        this.d = domain;
    }
    
    public String getMailboxCulture() {
        return this.e;
    }
    
    public void setMailboxCulture(final String mailboxCulture) {
        this.e = mailboxCulture;
    }
    
    public Identity getExchangeImpersonation() {
        return this.f;
    }
    
    public void setExchangeImpersonation(final Identity identity) {
        this.f = identity;
    }
    
    public RequestServerVersion getRequestServerVersion() {
        return this.g;
    }
    
    public void setRequestServerVersion(final RequestServerVersion requestServerVersion) {
        this.g = requestServerVersion;
    }
    
    public Proxy getHttpURLConnectionProxy() {
        return this.i;
    }
    
    public void setHttpURLConnectionProxy(final Proxy httpURLConnectionProxy) {
        this.i = httpURLConnectionProxy;
    }
    
    public HttpHost getProxy() {
        return this.n;
    }
    
    public void setProxy(final HttpHost proxy) {
        this.n = proxy;
    }
    
    public Credentials getProxyCredentials() {
        return this.m;
    }
    
    public void setProxyCredentials(final Credentials proxyCredentials) {
        this.m = proxyCredentials;
    }
    
    public HttpClientConnectionManager getClientConnectionManager() {
        return this.o;
    }
    
    public void setClientConnectionManager(final HttpClientConnectionManager connectionManager) {
        this.o = connectionManager;
    }
    
    public RequestConfig getRequestConfig() {
        return this.p;
    }
    
    public void setRequestConfig(final RequestConfig requestConfig) {
        this.p = requestConfig;
    }
    
    public void setHttpURLConnection(final boolean useHttpURLConnection) {
        this.h = useHttpURLConnection;
    }
    
    public void setConnectTimeout(final int connectTimeout) {
        this.j = connectTimeout;
    }
    
    public int getConnectTimeout() {
        return this.j;
    }
    
    public void setReadTimeout(final int readTimeout) {
        this.k = readTimeout;
    }
    
    public int getReadTimeout() {
        return this.k;
    }
    
    public void setCustomHeaders(final Header[] customHeaders) {
        this.r = customHeaders;
    }
    
    public Header[] getCustomHeaders() {
        return this.r;
    }
}

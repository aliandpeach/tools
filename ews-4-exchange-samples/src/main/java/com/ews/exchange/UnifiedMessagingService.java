package com.ews.exchange;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnifiedMessagingService
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
    
    public UnifiedMessagingService() {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a();
    }
    
    public UnifiedMessagingService(final String url) {
        this.g = RequestServerVersion.EXCHANGE_2007_SP1;
        this.h = false;
        this.i = Proxy.NO_PROXY;
        this.j = 60000;
        this.k = 60000;
        this.a = url;
        this.a();
    }
    
    public UnifiedMessagingService(final String url, final String username, final String password) {
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
    
    public UnifiedMessagingService(final String url, final String username, final String password, final String domain) {
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
            this.o = new PoolingHttpClientConnectionManager(RegistryBuilder.<ConnectionSocketFactory>create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", this.q).build());
            HttpsURLConnection.setDefaultSSLSocketFactory(build.getSocketFactory());
            Logger.getLogger("org.apache.http.impl.client.DefaultRequestDirector").setLevel(Level.OFF);
            this.p = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).setProxyPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).setTargetPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).build();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private InputStream a(final String requestBody) throws Exception {
//        com.ews.exchange.b.expiredValidate();
        if (!this.h) {
            String s = "<soap:Header>" + "<t:RequestServerVersion Version=\"" + com.ews.exchange.a.a(this.g) + "\"/>";
            if (this.e != null) {
                s = s + "<t:MailboxCulture>" + com.ews.exchange.d.a(this.e) + "</t:MailboxCulture>";
            }
            if (this.f != null) {
                s += this.f.a();
            }
            final StringEntity entity;
            (entity = new StringEntity("<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">" + (s + "</soap:Header>") + "<soap:Body>" + requestBody + "</soap:Body>" + "</soap:Envelope>", "UTF-8")).setContentType("text/xml; charset=utf-8");
            Object execute = null;
            int i = 1;
            while (i != 0) {
                final URI uri = new URI(this.a);
                final HttpPost httpPost;
                (httpPost = new HttpPost(uri)).setHeader("User-Agent", com.ews.exchange.b.a);
                httpPost.setEntity((HttpEntity)entity);
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
                        if (UnifiedMessagingService.this.d != null) {
                            return new PasswordAuthentication(UnifiedMessagingService.this.d + "\\" + UnifiedMessagingService.this.b, UnifiedMessagingService.this.c.toCharArray());
                        }
                        return new PasswordAuthentication(UnifiedMessagingService.this.b, UnifiedMessagingService.this.c.toCharArray());
                    }
                });
            }
            o = "<soap:Header>";
            o = (String)o + "<t:RequestServerVersion Version=\"" + com.ews.exchange.a.a(this.g) + "\"/>";
            if (this.e != null) {
                o = (String)o + "<t:MailboxCulture>" + com.ews.exchange.d.a(this.e) + "</t:MailboxCulture>";
            }
            if (this.f != null) {
                o = (String)o + this.f.a();
            }
            o = (String)o + "</soap:Header>";
            final String string = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">" + (String)o + "<soap:Body>" + requestBody + "</soap:Body>" + "</soap:Envelope>";
            final HttpURLConnection httpURLConnection;
            (httpURLConnection = (HttpURLConnection)new URL(this.a).openConnection(this.i)).setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(this.j);
            httpURLConnection.setReadTimeout(this.k);
            httpURLConnection.setRequestProperty("Content-Type", "text/xml");
            httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(string.getBytes("UTF-8").length).toString());
            httpURLConnection.setRequestProperty("User-Agent", com.ews.exchange.b.a);
            httpURLConnection.connect();
            (outputStream = httpURLConnection.getOutputStream()).write(string.getBytes("UTF-8"));
            outputStream.flush();
            o = new ByteArrayInputStream(c(httpURLConnection.getInputStream()));
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
    
    public UnifiedMessagingProperties getUnifiedMessagingProperties() throws ServiceException {
        return this.b();
    }
    
    private UnifiedMessagingProperties b() throws ServiceException {
        InputStream a = null;
        final String requestBody = "<GetUMProperties xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"/>";
        UnifiedMessagingProperties unifiedMessagingProperties = null;
        try {
            a = this.a(requestBody);
            final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(a);
            while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GetUMPropertiesResponse") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    unifiedMessagingProperties = new UnifiedMessagingProperties(xmlStreamReader);
                }
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause2) {
                    throw new ServiceException(cause2.getMessage(), cause2, requestBody);
                }
            }
            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                }
                catch (IOException cause3) {
                    throw new ServiceException(cause3.getMessage(), cause3, requestBody);
                }
            }
        }
        return unifiedMessagingProperties;
    }
    
    public String playOnPhone(final String entryId, final String dialString) throws ServiceException {
        return this.a(entryId, dialString);
    }
    
    private String a(String b, String string) throws ServiceException {
        InputStream a = null;
        String result = null;
        string = "<PlayOnPhone xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><entryId>" + com.ews.exchange.d.a(b) + "</entryId><DialString>" + com.ews.exchange.d.a(string) + "</DialString></PlayOnPhone>";
        try {
            result = b(a = this.a(string));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause2) {
                    throw new ServiceException(cause2.getMessage(), cause2, string);
                }
            }
            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                }
                catch (IOException cause3) {
                    throw new ServiceException(cause3.getMessage(), cause3, string);
                }
            }
        }
        return result;
    }
    
    public String playOnPhoneGreeting(final GreetingType greetingType, final String dialString) throws ServiceException {
        return this.a(greetingType, dialString);
    }
    
    private String a(GreetingType greetingType, String string) throws ServiceException {
        InputStream a = null;
        String result = null;
        string = "<PlayOnPhoneGreeting xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><GreetingType>" + (((greetingType = greetingType) == GreetingType.OUT_OF_OFFICE) ? "OofCustom" : "NormalCustom") + "</GreetingType><DialString>" + com.ews.exchange.d.a(string) + "</DialString></PlayOnPhoneGreeting>";
        try {
            result = b(a = this.a(string));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause2) {
                    throw new ServiceException(cause2.getMessage(), cause2, string);
                }
            }
            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                }
                catch (IOException cause3) {
                    throw new ServiceException(cause3.getMessage(), cause3, string);
                }
            }
        }
        return result;
    }
    
    public void setPlayOnPhoneDialString(String dialString) throws ServiceException {
        UnifiedMessagingService var_1_03 = this;
        final String string = "<SetPlayOnPhoneDialString xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><dialString>" + com.ews.exchange.d.a(dialString) + "</dialString></SetPlayOnPhoneDialString>";
        try {
            final InputStream a = ((UnifiedMessagingService)var_1_03).a(string);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, string);
                }
            }
            if (((UnifiedMessagingService)var_1_03).l == null || ((UnifiedMessagingService)var_1_03).o != null) {
                return;
            }
            try {
                ((UnifiedMessagingService)var_1_03).l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, string);
        }
        finally {
            if (((UnifiedMessagingService)var_1_03).l != null && ((UnifiedMessagingService)var_1_03).o == null) {
                try {
                    ((UnifiedMessagingService)var_1_03).l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, string);
                }
            }
        }
    }
    
    public void setTelephoneAccessFolderEmail(String folderId) throws ServiceException {
        UnifiedMessagingService var_1_03 = this;
        final String string = "<SetTelephoneAccessFolderEmail xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><base64FolderID>" + com.ews.exchange.d.a(folderId) + "</base64FolderID></SetTelephoneAccessFolderEmail>";
        try {
            final InputStream a = ((UnifiedMessagingService)var_1_03).a(string);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, string);
                }
            }
            if (((UnifiedMessagingService)var_1_03).l == null || ((UnifiedMessagingService)var_1_03).o != null) {
                return;
            }
            try {
                ((UnifiedMessagingService)var_1_03).l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, string);
        }
        finally {
            if (((UnifiedMessagingService)var_1_03).l != null && ((UnifiedMessagingService)var_1_03).o == null) {
                try {
                    ((UnifiedMessagingService)var_1_03).l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, string);
                }
            }
        }
    }
    
    public void disconnect(String callId) throws ServiceException {
        UnifiedMessagingService var_1_03 = this;
        final String string = "<Disconnect xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><CallId>" + com.ews.exchange.d.a(callId) + "</CallId></Disconnect>";
        try {
            final InputStream a = ((UnifiedMessagingService)var_1_03).a(string);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, string);
                }
            }
            if (((UnifiedMessagingService)var_1_03).l == null || ((UnifiedMessagingService)var_1_03).o != null) {
                return;
            }
            try {
                ((UnifiedMessagingService)var_1_03).l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, string);
        }
        finally {
            if (((UnifiedMessagingService)var_1_03).l != null && ((UnifiedMessagingService)var_1_03).o == null) {
                try {
                    ((UnifiedMessagingService)var_1_03).l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, string);
                }
            }
        }
    }
    
    public CallInfo getCallInfo(final String callId) throws ServiceException {
        return this.b(callId);
    }
    
    private CallInfo b(final String s) throws ServiceException {
        InputStream a = null;CallInfo callInfo = null;

        final String string = "<GetCallInfo xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><CallId>" + com.ews.exchange.d.a(s) + "</CallId></GetCallInfo>";
        try {
            callInfo = a(a = this.a(string));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause2) {
                    throw new ServiceException(cause2.getMessage(), cause2, string);
                }
            }
            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                }
                catch (IOException cause3) {
                    throw new ServiceException(cause3.getMessage(), cause3, string);
                }
            }
        }
        return callInfo;
    }
    
    public void setOutOfOffice(boolean enable) throws ServiceException {
        UnifiedMessagingService var_1_03 = this;
        String s = "false";
        if (enable) {
            s = "true";
        }
        final String string = "<SetOofStatus xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><status>" + s + "</status></SetOofStatus>";
        try {
            final InputStream a = ((UnifiedMessagingService)var_1_03).a(string);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, string);
                }
            }
            if (((UnifiedMessagingService)var_1_03).l == null || ((UnifiedMessagingService)var_1_03).o != null) {
                return;
            }
            try {
                ((UnifiedMessagingService)var_1_03).l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, string);
        }
        finally {
            if (((UnifiedMessagingService)var_1_03).l != null && ((UnifiedMessagingService)var_1_03).o == null) {
                try {
                    ((UnifiedMessagingService)var_1_03).l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, string);
                }
            }
        }
    }
    
    public void setMissedCallNotification(boolean enable) throws ServiceException {
        UnifiedMessagingService var_1_03 = this;
        String s = "false";
        if (enable) {
            s = "true";
        }
        final String string = "<SetMissedCallNotificationEnabled xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><status>" + s + "</status></SetMissedCallNotificationEnabled>";
        try {
            final InputStream a = ((UnifiedMessagingService)var_1_03).a(string);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, string);
                }
            }
            if (((UnifiedMessagingService)var_1_03).l == null || ((UnifiedMessagingService)var_1_03).o != null) {
                return;
            }
            try {
                ((UnifiedMessagingService)var_1_03).l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, string);
        }
        finally {
            if (((UnifiedMessagingService)var_1_03).l != null && ((UnifiedMessagingService)var_1_03).o == null) {
                try {
                    ((UnifiedMessagingService)var_1_03).l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, string);
                }
            }
        }
    }
    
    public boolean isUnifiedMessagingEnabled() throws ServiceException {
        return this.c();
    }
    
    private boolean c() throws ServiceException {
        InputStream var1 = null;
        String var3 = "<IsUMEnabled xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"/>";

        boolean var20;
        try {
            InputStream var2 = var1 = this.a(var3);
            boolean var4 = false;
            boolean var5 = false;
            XMLStreamReader var19 = XMLInputFactory.newInstance().createXMLStreamReader(var2);

            while(var19.hasNext() && var19.next() > 0) {
                if (var19.isStartElement() && var19.getLocalName() != null && var19.getNamespaceURI() != null && var19.getLocalName().equals("IsUMEnabledResponse") && var19.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    if (var4) {
                        String var6;
                        if ((var6 = var19.getElementText()) != null && var6.length() > 0) {
                            var5 = Boolean.parseBoolean(var6);
                        }
                    } else {
                        var4 = true;
                    }
                }
            }

            var20 = var5;
        } catch (ServiceException var16) {
            throw var16;
        } catch (Exception var17) {
            throw new ServiceException(var17.getMessage(), var17, var3);
        } finally {
            if (var1 != null) {
                try {
                    var1.close();
                } catch (IOException var15) {
                    throw new ServiceException(var15.getMessage(), var15, var3);
                }
            }

            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                } catch (IOException var14) {
                    throw new ServiceException(var14.getMessage(), var14, var3);
                }
            }

        }

        return var20;
    }
    
    public void resetPin() throws ServiceException {
        final String s = "<ResetPIN xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"/>";
        try {
            final InputStream a = this.a(s);
            if (a != null) {
                try {
                    a.close();
                }
                catch (IOException cause) {
                    throw new ServiceException(cause.getMessage(), cause, s);
                }
            }
            if (this.l == null || this.o != null) {
                return;
            }
            try {
                this.l.close();
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, s);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause3) {
            throw new ServiceException(cause3.getMessage(), cause3, s);
        }
        finally {
            if (this.l != null && this.o == null) {
                try {
                    this.l.close();
                }
                catch (IOException cause4) {
                    throw new ServiceException(cause4.getMessage(), cause4, s);
                }
            }
        }
    }
    
    private static CallInfo a(final InputStream inputStream) throws XMLStreamException {
        int n = 0;
        CallInfo callInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (n != 0) {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("GetCallInfoResponse") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                callInfo = new CallInfo(xmlStreamReader);
            }
            else {
                n = 1;
            }
        }
        return callInfo;
    }
    
    private static String b(final InputStream inputStream) throws XMLStreamException {
        int n = 0;
        String elementText = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (n != 0) {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("PlayOnPhoneGreetingResponse") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                elementText = xmlStreamReader.getElementText();
            }
            else {
                n = 1;
            }
        }
        return elementText;
    }
    
    private static byte[] c(InputStream inputStream) throws IOException {
        inputStream = new BufferedInputStream(inputStream);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        try {
            for (int i = ((FilterInputStream)inputStream).read(array); i != -1; i = ((FilterInputStream)inputStream).read(array)) {
                byteArrayOutputStream.write(array, 0, i);
            }
            byteArrayOutputStream.toByteArray();
        }
        finally {
            ((BufferedInputStream)inputStream).close();
            byteArrayOutputStream.close();
        }
        return array;
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
}

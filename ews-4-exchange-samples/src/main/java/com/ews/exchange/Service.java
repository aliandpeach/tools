package com.ews.exchange;

import com.ews.json.parser.JsonObject;
import com.ews.json.parser.JsonParser;
import com.ews.msg.ExtendedPropertyId;
import com.ews.msg.ExtendedPropertyName;
import com.ews.msg.ExtendedPropertyTag;
import com.ews.msg.Recipient;
import com.ews.msg.RecipientType;
import com.ews.msg.RecurrenceType;
import com.ews.msg.TaskDelegationState;
import com.ews.msg.TaskOwnership;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.WinHttpClients;
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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

public class Service
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Identity f;
    private RequestServerVersion g;
    private TimeZoneDefinition h;
    private DateTimePrecision i;
    private boolean j;
    private boolean k;
    private OAuthToken l;
    private boolean m;
    private Proxy n;
    private int o;
    private int p;
    private CloseableHttpClient q;
    private CloseableHttpResponse r;
    private Credentials s;
    private HttpHost t;
    private HttpClientConnectionManager u;
    private RequestConfig v;
    private SSLConnectionSocketFactory w;
    private String x;
    private String y;
    private List<String> z;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private Header[] F;
    
    public Service() {
        this.a = "https://outlook.office365.com/ews/Exchange.asmx";
        this.g = RequestServerVersion.EXCHANGE_2010_SP1;
        this.i = DateTimePrecision.NONE;
        this.j = false;
        this.k = true;
        this.m = false;
        this.n = Proxy.NO_PROXY;
        this.o = 60000;
        this.p = 60000;
        this.z = new ArrayList<String>();
        this.a();
    }
    
    public Service(final String url) {
        this.a = "https://outlook.office365.com/ews/Exchange.asmx";
        this.g = RequestServerVersion.EXCHANGE_2010_SP1;
        this.i = DateTimePrecision.NONE;
        this.j = false;
        this.k = true;
        this.m = false;
        this.n = Proxy.NO_PROXY;
        this.o = 60000;
        this.p = 60000;
        this.z = new ArrayList<String>();
        this.a = url;
        this.a();
    }
    
    public Service(final String url, final String username, final String password) {
        this.a = "https://outlook.office365.com/ews/Exchange.asmx";
        this.g = RequestServerVersion.EXCHANGE_2010_SP1;
        this.i = DateTimePrecision.NONE;
        this.j = false;
        this.k = true;
        this.m = false;
        this.n = Proxy.NO_PROXY;
        this.o = 60000;
        this.p = 60000;
        this.z = new ArrayList<String>();
        this.a = url;
        this.b = username;
        this.c = password;
        this.a();
    }
    
    public Service(final String url, final String username, final String password, final String domain) {
        this.a = "https://outlook.office365.com/ews/Exchange.asmx";
        this.g = RequestServerVersion.EXCHANGE_2010_SP1;
        this.i = DateTimePrecision.NONE;
        this.j = false;
        this.k = true;
        this.m = false;
        this.n = Proxy.NO_PROXY;
        this.o = 60000;
        this.p = 60000;
        this.z = new ArrayList<String>();
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
            this.w = new SSLConnectionSocketFactory(build, new NoopHostnameVerifier());
            this.u = new PoolingHttpClientConnectionManager(RegistryBuilder.<ConnectionSocketFactory>create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", this.w).build());
            HttpsURLConnection.setDefaultSSLSocketFactory(build.getSocketFactory());
            Logger.getLogger("org.apache.http.impl.client.DefaultRequestDirector").setLevel(Level.OFF);
            this.v = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).setProxyPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).setTargetPreferredAuthSchemes((Collection)Arrays.asList("Digest", "NTLM", "Negotiate", "Kerberos", "Basic")).build();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private InputStream a(final String s, final boolean b) throws Exception {
//        com.ews.exchange.b.expiredValidate();
        if (this.x != null && this.a != null && this.a.toLowerCase().startsWith("https://outlook.office365.com")) {
            final Calendar instance;
            (instance = Calendar.getInstance(Locale.getDefault())).add(13, -30);
            if (this.l == null || this.l.getAccessToken() == null || (this.l != null && this.l.getRefreshToken() == null && (this.l.getExpiresOn() == null || this.l.getExpiresOn().compareTo(instance.getTime()) < 0))) {
                if (this.x != null && this.b != null && this.c != null) {
                    this.l = this.getOAuthTokenWithUsernamePassword(this.b, this.c);
                }
                else if (this.x != null && this.C != null && this.D != null) {
                    this.l = this.getOAuthTokenWithAuthorizationCode(this.C, this.D);
                }
                else if (this.x != null && this.E != null) {
                    this.l = this.getOAuthTokenWithDeviceAuthorizationCode(this.E);
                }
                else if (this.x != null && this.A != null) {
                    this.l = this.getOAuthTokenWithClientSecret(this.A);
                }
                else if (this.x != null && this.B != null) {
                    this.l = this.getOAuthTokenWithClientAssertion(this.B);
                }
            }
            else if (this.l != null && this.l.getRefreshToken() != null && (this.l.getExpiresOn() == null || this.l.getExpiresOn().compareTo(instance.getTime()) < 0)) {
                this.refreshOAuthToken();
            }
        }
        if (!this.m) {
            String s2 = "<soap:Header>" + "<t:RequestServerVersion Version=\"" + com.ews.exchange.a.a(this.g) + "\"/>";
            if (this.e != null) {
                s2 = s2 + "<t:MailboxCulture>" + com.ews.exchange.d.a(this.e) + "</t:MailboxCulture>";
            }
            if (this.f != null) {
                s2 += this.f.a();
            }
            if (this.h != null) {
                s2 = s2 + "<t:TimeZoneContext>" + this.h.a("TimeZoneDefinition") + "</t:TimeZoneContext>";
            }
            if (this.i != DateTimePrecision.NONE) {
                final DateTimePrecision i;
                s2 = s2 + "<t:DateTimePrecision>" + (((i = this.i) == DateTimePrecision.SECONDS) ? "Seconds" : ((i == DateTimePrecision.MILLISECONDS) ? "Milliseconds" : "None")) + "</t:DateTimePrecision>";
            }
            final StringEntity entity;
            String entityString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">" + (s2 + "</soap:Header>") + "<soap:Body>" + s + "</soap:Body>" + "</soap:Envelope>";
            (entity = new StringEntity(entityString, "UTF-8")).setContentType("text/xml; charset=utf-8");
            int j = 1;
            while (j != 0) {
                final URI uri = new URI(this.a);
                final HttpPost httpPost;
                (httpPost = new HttpPost(uri)).setHeader("User-Agent", com.ews.exchange.b.a);
                httpPost.setEntity((HttpEntity)entity);
                if (this.j) {
                    httpPost.setHeader("Accept-Encoding", "gzip");
                }
                if (this.F != null) {
                    httpPost.setHeaders(this.F);
                }
                httpPost.addHeader("Content-type", "text/xml; charset=utf-8");
                if (this.l != null && this.l.getAccessToken() != null) {
                    httpPost.setHeader("Authorization", "Bearer " + this.l.getAccessToken());
                }
                final BasicCredentialsProvider defaultCredentialsProvider = new BasicCredentialsProvider();
                if (this.b != null && this.c != null && this.l == null) {
                    ((CredentialsProvider)defaultCredentialsProvider).setCredentials(new AuthScope(AuthScope.ANY), (Credentials)new UsernamePasswordCredentials(this.b, this.c));
                    ((CredentialsProvider)defaultCredentialsProvider).setCredentials(new AuthScope(AuthScope.ANY), (Credentials)new NTCredentials(this.b, this.c, /*uri.getHost()*/"", (this.d != null) ? this.d : ""));
                }
                if (this.t != null && this.s != null) {
                    ((CredentialsProvider)defaultCredentialsProvider).setCredentials(new AuthScope(this.t.getHostName(), this.t.getPort(), AuthScope.ANY_REALM), this.s);
                }
                if (this.l != null) {
                    final HttpClientBuilder custom = HttpClients.custom();
                    if (this.t != null) {
                        custom.setProxy(this.t);
                    }
                    if (this.v != null) {
                        custom.setDefaultRequestConfig(this.v);
                    }
                    if (this.u != null) {
                        custom.setConnectionManager(this.u);
                    }
                    this.q = custom.build();
                }
                else if (this.b != null && this.c != null) {
                    final HttpClientBuilder custom2 = HttpClients.custom();
                    if (this.t != null) {
                        custom2.setProxy(this.t);
                    }
                    if (this.v != null) {
                        custom2.setDefaultRequestConfig(this.v);
                    }
                    if (this.u != null) {
                        custom2.setConnectionManager(this.u);
                    }
//                    custom2.setDefaultAuthSchemeRegistry((Lookup)RegistryBuilder.create().register("NTLM", (Object)new NTLMSchemeFactory()).register("Digest", (Object)new DigestSchemeFactory()).register("Negotiate", (Object)new SPNegoSchemeFactory()).register("Kerberos", (Object)new KerberosSchemeFactory()).register("Basic", (Object)new BasicSchemeFactory()).build());
                    this.q = custom2.setDefaultCredentialsProvider((CredentialsProvider)defaultCredentialsProvider).build();
                }
                else {
                    final HttpClientBuilder custom3 = WinHttpClients.custom();
                    if (this.t != null) {
                        custom3.setProxy(this.t);
                    }
                    if (this.v != null) {
                        custom3.setDefaultRequestConfig(this.v);
                    }
                    if (this.u != null) {
                        custom3.setConnectionManager(this.u);
                    }
                    this.q = custom3.build();
                }
                this.r = this.q.execute(httpPost);
                final StatusLine statusLine;
                if ((statusLine = this.r.getStatusLine()).getStatusCode() >= 300 && statusLine.getStatusCode() < 400) {
                    final Header[] headers;
                    if ((headers = this.r.getHeaders("Location")).length > 0) {
                        this.a = headers[0].getValue();
                        continue;
                    }
                }
                else if (statusLine.getStatusCode() >= 400) {
                    InputStream content = this.r.getEntity().getContent();
                    final Header[] headers2;
                    final String value;
                    if ((headers2 = this.r.getHeaders("Content-Encoding")) != null && headers2.length > 0 && (value = headers2[0].getValue()) != null && value.equals("gzip")) {
                        content = new GZIPInputStream(new BufferedInputStream(content));
                    }
                    final Header[] headers3;
                    if ((headers3 = this.r.getHeaders("Content-Type")) == null || headers3.length <= 0) {
                        throw new ServiceException(Integer.toString(statusLine.getStatusCode()), statusLine.getReasonPhrase(), null, s, null);
                    }
                    final String value2;
                    if ((value2 = headers3[0].getValue()) != null && value2.indexOf("application/json") >= 0) {
                        throw new ServiceException(s, content);
                    }
                    if (value2 != null && value2.indexOf("text/xml") >= 0) {
                        throw new ServiceException(s, content, (byte)0);
                    }
                }
                j = 0;
            }
            InputStream inputStream = this.r.getEntity().getContent();
            final Header[] headers4;
            final String value3;
            if ((headers4 = this.r.getHeaders("Content-Encoding")) != null && headers4.length > 0 && (value3 = headers4[0].getValue()) != null && value3.equals("gzip")) {
                inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
            }
            if (this.k && b) {
                inputStream = k(inputStream);
            }
            return inputStream;
        }
        OutputStream outputStream = null;
        Object o;
        InputStream info = null;
        try {
            if (this.b != null && this.c != null && this.l == null) {
                Authenticator.setDefault(new Authenticator() {
                    protected final PasswordAuthentication getPasswordAuthentication() {
                        if (Service.this.d != null) {
                            return new PasswordAuthentication(Service.this.d + "\\" + Service.this.b, Service.this.c.toCharArray());
                        }
                        return new PasswordAuthentication(Service.this.b, Service.this.c.toCharArray());
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
            final String string = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">" + (String)o + "<soap:Body>" + s + "</soap:Body>" + "</soap:Envelope>";
            final HttpURLConnection httpURLConnection;
            (httpURLConnection = (HttpURLConnection)new URL(this.a).openConnection(this.n)).setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(this.o);
            httpURLConnection.setReadTimeout(this.p);
            httpURLConnection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(string.getBytes("UTF-8").length).toString());
            httpURLConnection.setRequestProperty("User-Agent", com.ews.exchange.b.a);
            if (this.l != null && this.l.getAccessToken() != null) {
                httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.l.getAccessToken());
            }
            if (this.j) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            httpURLConnection.connect();
            (outputStream = httpURLConnection.getOutputStream()).write(string.getBytes("UTF-8"));
            outputStream.flush();
            final int responseCode;

            if ((responseCode = httpURLConnection.getResponseCode()) >= 400) {
                info = httpURLConnection.getErrorStream();
                final String contentEncoding;
                if ((contentEncoding = httpURLConnection.getContentEncoding()) != null && contentEncoding.equals("gzip")) {
                    info = new GZIPInputStream(new BufferedInputStream(info));
                }
                final String contentType;
                if ((contentType = httpURLConnection.getContentType()) != null && contentType.indexOf("application/json") >= 0) {
                    throw new ServiceException(s, info);
                }
                if (contentType != null && contentType.indexOf("text/xml") >= 0) {
                    throw new ServiceException(s, info, (byte)0);
                }
                throw new ServiceException(Integer.toString(responseCode), httpURLConnection.getResponseMessage(), null, s, null);
            }
            else {
                info = httpURLConnection.getInputStream();
                final String contentEncoding2;
                if ((contentEncoding2 = httpURLConnection.getContentEncoding()) != null && contentEncoding2.equals("gzip")) {
                    info = new GZIPInputStream(new BufferedInputStream(info));
                }
                if (this.k && b) {
                    info = k(info);
                }
            }
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException ex) {}
            }
        }
        return info;
    }
    
    private InputStream a(final String s, final String s2) throws Exception {
        if (!this.m) {
            final StringEntity entity;
            (entity = new StringEntity(s2, "UTF-8")).setContentType("application/x-www-form-urlencoded");
            int i = 1;
            while (i != 0) {
                final HttpPost httpPost;
                (httpPost = new HttpPost(new URI(s))).setHeader("User-Agent", com.ews.exchange.b.a);
                httpPost.setEntity((HttpEntity)entity);
                if (this.j) {
                    httpPost.setHeader("Accept-Encoding", "gzip");
                }
                if (this.F != null) {
                    httpPost.setHeaders(this.F);
                }
                final HttpClientBuilder custom = HttpClients.custom();
                if (this.t != null) {
                    custom.setProxy(this.t);
                }
                if (this.v != null) {
                    custom.setDefaultRequestConfig(this.v);
                }
                if (this.u != null) {
                    custom.setConnectionManager(this.u);
                }
                this.q = custom.build();
                this.r = this.q.execute((HttpUriRequest)httpPost);
                final StatusLine statusLine;
                if ((statusLine = this.r.getStatusLine()).getStatusCode() >= 300 && statusLine.getStatusCode() < 400) {
                    final Header[] headers;
                    if ((headers = this.r.getHeaders("Location")).length > 0) {
                        this.a = headers[0].getValue();
                        continue;
                    }
                }
                else if (statusLine.getStatusCode() >= 400) {
                    InputStream content = this.r.getEntity().getContent();
                    final Header[] headers2;
                    final String value;
                    if ((headers2 = this.r.getHeaders("Content-Encoding")) != null && headers2.length > 0 && (value = headers2[0].getValue()) != null && value.equals("gzip")) {
                        content = new GZIPInputStream(new BufferedInputStream(content));
                    }
                    final Header[] headers3;
                    if ((headers3 = this.r.getHeaders("Content-Type")) == null || headers3.length <= 0) {
                        throw new ServiceException(Integer.toString(statusLine.getStatusCode()), statusLine.getReasonPhrase(), null, s2, null);
                    }
                    final String value2;
                    if ((value2 = headers3[0].getValue()) != null && value2.indexOf("application/json") >= 0) {
                        throw new ServiceException(s2, content);
                    }
                    if (value2 != null && value2.indexOf("text/xml") >= 0) {
                        throw new ServiceException(s2, content, (byte)0);
                    }
                }
                i = 0;
            }
            InputStream content2 = this.r.getEntity().getContent();
            final Header[] headers4;
            final String value3;
            if ((headers4 = this.r.getHeaders("Content-Encoding")) != null && headers4.length > 0 && (value3 = headers4[0].getValue()) != null && value3.equals("gzip")) {
                content2 = new GZIPInputStream(new BufferedInputStream(content2));
            }
            return content2;
        }
        OutputStream outputStream = null;
        InputStream inputStream;
        try {
            final HttpURLConnection httpURLConnection;
            (httpURLConnection = (HttpURLConnection)new URL(s).openConnection(this.n)).setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(this.o);
            httpURLConnection.setReadTimeout(this.p);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(s2.getBytes("UTF-8").length).toString());
            httpURLConnection.setRequestProperty("User-Agent", com.ews.exchange.b.a);
            if (this.j) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            httpURLConnection.connect();
            (outputStream = httpURLConnection.getOutputStream()).write(s2.getBytes("UTF-8"));
            outputStream.flush();
            final int responseCode;
            if ((responseCode = httpURLConnection.getResponseCode()) >= 400) {
                inputStream = httpURLConnection.getErrorStream();
                final String contentEncoding;
                if ((contentEncoding = httpURLConnection.getContentEncoding()) != null && contentEncoding.equals("gzip")) {
                    inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                }
                final String contentType;
                if ((contentType = httpURLConnection.getContentType()) != null && contentType.indexOf("application/json") >= 0) {
                    throw new ServiceException(s2, inputStream);
                }
                if (contentType != null && contentType.indexOf("text/xml") >= 0) {
                    throw new ServiceException(s2, inputStream, (byte)0);
                }
                throw new ServiceException(Integer.toString(responseCode), httpURLConnection.getResponseMessage(), null, s2, null);
            }
            else {
                inputStream = httpURLConnection.getInputStream();
                final String contentEncoding2;
                if ((contentEncoding2 = httpURLConnection.getContentEncoding()) != null && contentEncoding2.equals("gzip")) {
                    inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                }
            }
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException ex) {}
            }
        }
        return inputStream;
    }
    
    public String getSignInRequestUri(final String redirectUri) {
        return this.getSignInRequestUri(redirectUri, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType) {
        return this.getSignInRequestUri(redirectUri, responseType, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType, final String responseMode) {
        return this.getSignInRequestUri(redirectUri, responseType, responseMode, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType, final String responseMode, final String state) {
        return this.getSignInRequestUri(redirectUri, responseType, responseMode, state, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType, final String responseMode, final String state, final String nonce) {
        return this.getSignInRequestUri(redirectUri, responseType, responseMode, state, nonce, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType, final String responseMode, final String state, final String nonce, final String loginHint) {
        return this.getSignInRequestUri(redirectUri, responseType, responseMode, state, nonce, loginHint, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, final String responseType, final String responseMode, final String state, final String nonce, final String loginHint, final String domainHint) {
        return this.getSignInRequestUri(redirectUri, responseType, responseMode, state, nonce, loginHint, domainHint, null);
    }
    
    public String getSignInRequestUri(final String redirectUri, String responseType, String responseMode, String state, String nonce, String loginHint, String domainHint, String prompt) {
        prompt = domainHint;
        domainHint = loginHint;
        loginHint = nonce;
        nonce = state;
        state = responseMode;
        responseMode = responseType;
        responseType = redirectUri;
        if (this.x == null) {
            throw new IllegalArgumentException("clientId");
        }
        String s = k(this.y) + "/authorize?" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z);
        if (responseType != null) {
            s = s + "&redirect_uri=" + responseType;
        }
        String s2;
        if (responseMode != null) {
            s2 = s + "&response_type=" + responseMode;
        }
        else {
            s2 = s + "&response_type=token";
        }
        if (state != null) {
            s2 = s2 + "&response_mode=" + state;
        }
        else if (responseMode != null && responseMode.indexOf("id_token") >= 0) {
            s2 += "&response_mode=fragment";
        }
        if (nonce != null) {
            s2 = s2 + "&state=" + nonce;
        }
        String s3;
        if (loginHint != null) {
            s3 = s2 + "&nonce=" + loginHint;
        }
        else {
            s3 = s2 + "&nonce=" + new Random().nextInt();
        }
        if (domainHint != null) {
            s3 = s3 + "&login_hint=" + domainHint;
        }
        if (prompt != null) {
            s3 = s3 + "&domain_hint=" + prompt;
        }
        if (prompt != null) {
            s3 = s3 + "&prompt=" + prompt;
        }
        return s3;
    }
    
    public OAuthToken getOAuthTokenWithAuthorizationCode(final String authorizationCode, final String authorizationCodeRedirectUri) throws ServiceException {
        return this.getOAuthTokenWithAuthorizationCode(authorizationCode, authorizationCodeRedirectUri, null);
    }
    
    public OAuthToken getOAuthTokenWithAuthorizationCode(final String authorizationCode, final String authorizationCodeRedirectUri, final String clientSecret) throws ServiceException {
        return this.a(authorizationCode, authorizationCodeRedirectUri, clientSecret);
    }
    
    private OAuthToken a(final String s, final String s2, final String s3) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("authorizationCode");
        }
        if (s2 == null) {
            throw new IllegalArgumentException("authorizationCodeRedirectUri");
        }
        final String string = k(this.y) + "/token";
        String s4 = "" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z) + "&code=" + s + "&redirect_uri=" + s2 + "&grant_type=authorization_code";
        while (true) {
            if (s3 != null) {
                s4 = s4 + "&client_secret=" + s3;
                try {
                    final JsonObject jsonObject;
                    if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, s4), StandardCharsets.UTF_8)).parse()) != null) {
                        this.l = new OAuthToken(jsonObject);
                    }
                }
                catch (ServiceException ex) {
                    throw ex;
                }
                catch (Exception cause) {
                    throw new ServiceException(cause.getMessage(), cause, s4);
                }
                finally {
                    try {
                        if (this.r != null) {
                            this.r.close();
                        }
                        if (this.q != null && this.u == null) {
                            this.q.close();
                        }
                    }
                    catch (IOException cause2) {
                        throw new ServiceException(cause2.getMessage(), cause2, s4);
                    }
                }
                return this.l;
            }
            continue;
        }
    }
    
    public String getAuthorizationCodeRequestUri(final String redirectUri) {
        return this.getAuthorizationCodeRequestUri(redirectUri, null);
    }
    
    public String getAuthorizationCodeRequestUri(final String redirectUri, final String responseMode) {
        return this.getAuthorizationCodeRequestUri(redirectUri, responseMode, null);
    }
    
    public String getAuthorizationCodeRequestUri(final String redirectUri, String responseMode, String state) {
        state = responseMode;
        responseMode = redirectUri;
        if (responseMode == null) {
            throw new IllegalArgumentException("redirectUri");
        }
        final String string = k(this.y) + "/authorize?" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z) + "&response_type=code" + "&redirect_uri=" + responseMode;
        String s;
        if (state != null) {
            s = string + "&response_mode=" + state;
        }
        else {
            s = string + "&response_mode=query";
        }
        if (state != null) {
            s = s + "&state=" + state;
        }
        return s;
    }
    
    public OAuthToken getOAuthTokenWithClientAssertion(final String clientAssertion) throws ServiceException {
        return this.a(clientAssertion);
    }
    
    private OAuthToken a(final String s) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("clientAssertion");
        }
        final String string = k(this.y) + "/token";
        final String string2 = "" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z) + "&client_assertion=" + s + "&grant_type=client_credentials" + "&client_assertion_type=urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
        try {
            final JsonObject jsonObject;
            if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, string2), StandardCharsets.UTF_8)).parse()) != null) {
                this.l = new OAuthToken(jsonObject);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string2);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string2);
            }
        }
        return this.l;
    }
    
    public OAuthToken getOAuthTokenWithClientSecret(final String clientSecret) throws ServiceException {
        return this.b(clientSecret);
    }
    
    private OAuthToken b(final String s) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("clientSecret");
        }
        final String string = k(this.y) + "/token";
        final String string2 = "" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z) + "&client_secret=" + s + "&grant_type=client_credentials";
        try {
            final JsonObject jsonObject;
            if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, string2), StandardCharsets.UTF_8)).parse()) != null) {
                this.l = new OAuthToken(jsonObject);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string2);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string2);
            }
        }
        return this.l;
    }
    
    public OAuthToken getOAuthTokenWithUsernamePassword(final String username, final String password) throws ServiceException {
        return this.getOAuthTokenWithUsernamePassword(username, password, null);
    }
    
    public OAuthToken getOAuthTokenWithUsernamePassword(final String username, final String password, final String clientSecret) throws ServiceException {
        return this.getOAuthTokenWithUsernamePassword(username, password, clientSecret, null);
    }
    
    public OAuthToken getOAuthTokenWithUsernamePassword(final String username, final String password, final String clientSecret, final String clientAssertion) throws ServiceException {
        return this.a(username, password, clientSecret, clientAssertion);
    }
    
    private OAuthToken a(final String s, final String s2, final String s3, final String s4) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("username");
        }
        if (s2 == null) {
            throw new IllegalArgumentException("password");
        }
        final String string = k(this.y) + "/token";
        String s5 = "" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z) + "&username=" + s + "&password=" + s2 + "&grant_type=password";
        if (s3 != null) {
            s5 = s5 + "&client_secret=" + s3;
        }
        while (true) {
            if (s4 != null) {
                s5 = s5 + "&client_assertion=" + s4;
                try {
                    final JsonObject jsonObject;
                    if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, s5), StandardCharsets.UTF_8)).parse()) != null) {
                        this.l = new OAuthToken(jsonObject);
                    }
                }
                catch (ServiceException ex) {
                    throw ex;
                }
                catch (Exception cause) {
                    throw new ServiceException(cause.getMessage(), cause, s5);
                }
                finally {
                    try {
                        if (this.r != null) {
                            this.r.close();
                        }
                        if (this.q != null && this.u == null) {
                            this.q.close();
                        }
                    }
                    catch (IOException cause2) {
                        throw new ServiceException(cause2.getMessage(), cause2, s5);
                    }
                }
                return this.l;
            }
            continue;
        }
    }
    
    public DeviceAuthorizationCode getDeviceAuthorizationCode() throws ServiceException {
        return this.b();
    }
    
    private DeviceAuthorizationCode b() throws ServiceException {
        final String string = k(this.y) + "/devicecode";
        final String string2 = "" + "client_id=" + this.x + "&scope=" + com.ews.exchange.d.a(this.z);
        DeviceAuthorizationCode deviceAuthorizationCode = null;
        try {
            final JsonObject jsonObject;
            if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, string2), StandardCharsets.UTF_8)).parse()) != null) {
                deviceAuthorizationCode = new DeviceAuthorizationCode(jsonObject);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string2);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string2);
            }
        }
        return deviceAuthorizationCode;
    }
    
    public OAuthToken getOAuthTokenWithDeviceAuthorizationCode(final String deviceCode) throws ServiceException {
        return this.c(deviceCode);
    }
    
    private OAuthToken c(final String s) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("deviceCode");
        }
        final String string = k(this.y) + "/token";
        final String string2 = "" + "client_id=" + this.x + "&device_code=" + s + "&grant_type=urn:ietf:params:oauth:grant-type:device_code";
        try {
            final JsonObject jsonObject;
            if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, string2), StandardCharsets.UTF_8)).parse()) != null) {
                this.l = new OAuthToken(jsonObject);
            }
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string2);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string2);
            }
        }
        return this.l;
    }
    
    public OAuthToken refreshOAuthToken() throws ServiceException {
        if (this.l == null || this.l.getRefreshToken() == null) {
            throw new IllegalArgumentException("RefreshToken");
        }
        return this.a(this.x, this.y, this.l.getRefreshToken(), this.z, this.A);
    }
    
    public OAuthToken refreshOAuthToken(final String clientId, final String tenant, final String refreshToken) throws ServiceException {
        return this.refreshOAuthToken(clientId, tenant, refreshToken, null);
    }
    
    public OAuthToken refreshOAuthToken(final String clientId, final String tenant, final String refreshToken, final List<String> scope) throws ServiceException {
        return this.refreshOAuthToken(clientId, tenant, refreshToken, scope, null);
    }
    
    public OAuthToken refreshOAuthToken(final String clientId, final String tenant, final String refreshToken, final List<String> scope, final String clientSecret) throws ServiceException {
        return this.a(clientId, tenant, refreshToken, scope, clientSecret);
    }
    
    private OAuthToken a(final String s, String string, final String s2, final List<String> list, final String s3) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("clientId");
        }
        if (s2 == null) {
            throw new IllegalArgumentException("refreshToken");
        }
        string = k(string) + "/token";
        String s4 = "" + "client_id=" + s + "&scope=" + com.ews.exchange.d.a(list) + "&refresh_token=" + s2 + "&grant_type=refresh_token ";
        while (true) {
            if (s3 != null) {
                s4 = s4 + "&client_secret=" + s3;
                try {
                    final JsonObject jsonObject;
                    if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(this.a(string, s4), StandardCharsets.UTF_8)).parse()) != null) {
                        this.l = new OAuthToken(jsonObject);
                    }
                }
                catch (ServiceException ex) {
                    throw ex;
                }
                catch (Exception cause) {
                    throw new ServiceException(cause.getMessage(), cause, s4);
                }
                finally {
                    try {
                        if (this.r != null) {
                            this.r.close();
                        }
                        if (this.q != null && this.u == null) {
                            this.q.close();
                        }
                    }
                    catch (IOException cause2) {
                        throw new ServiceException(cause2.getMessage(), cause2, s4);
                    }
                }
                return this.l;
            }
            continue;
        }
    }
    
    public Note getNote(final String itemId) throws ServiceException {
        return this.getNote(itemId, new ItemShape(NotePropertyPath.getAllPropertyPaths()));
    }
    
    public Note getNote(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getNote(itemId, new ItemShape(propertyPaths));
    }
    
    public Note getNote(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getNote(itemId, new ItemShape(shapeType));
    }
    
    public Note getNote(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getNote(new ItemId(itemId), itemShape);
    }
    
    public Note getNote(final ItemId itemId) throws ServiceException {
        return this.getNote(itemId, new ItemShape(NotePropertyPath.getAllPropertyPaths()));
    }
    
    public Note getNote(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getNote(itemId, new ItemShape(propertyPaths));
    }
    
    public Note getNote(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getNote(itemId, new ItemShape(shapeType));
    }
    
    public Note getNote(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Note)this.getItem(itemId, itemShape);
    }
    
    public Journal getJournal(final String itemId) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(JournalPropertyPath.getAllPropertyPaths()));
    }
    
    public Journal getJournal(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(propertyPaths));
    }
    
    public Journal getJournal(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(shapeType));
    }
    
    public Journal getJournal(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getJournal(new ItemId(itemId), itemShape);
    }
    
    public Journal getJournal(final ItemId itemId) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(JournalPropertyPath.getAllPropertyPaths()));
    }
    
    public Journal getJournal(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(propertyPaths));
    }
    
    public Journal getJournal(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getJournal(itemId, new ItemShape(shapeType));
    }
    
    public Journal getJournal(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Journal)this.getItem(itemId, itemShape);
    }
    
    public Contact getContact(final String itemId) throws ServiceException {
        return this.getContact(itemId, new ItemShape(ContactPropertyPath.getAllPropertyPaths()));
    }
    
    public Contact getContact(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getContact(itemId, new ItemShape(propertyPaths));
    }
    
    public Contact getContact(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getContact(itemId, new ItemShape(shapeType));
    }
    
    public Contact getContact(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getContact(new ItemId(itemId), itemShape);
    }
    
    public Contact getContact(final ItemId itemId) throws ServiceException {
        return this.getContact(itemId, new ItemShape(ContactPropertyPath.getAllPropertyPaths()));
    }
    
    public Contact getContact(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getContact(itemId, new ItemShape(propertyPaths));
    }
    
    public Contact getContact(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getContact(itemId, new ItemShape(shapeType));
    }
    
    public Contact getContact(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Contact)this.getItem(itemId, itemShape);
    }
    
    public Post getPost(final String itemId) throws ServiceException {
        return this.getPost(itemId, new ItemShape(PostPropertyPath.getAllPropertyPaths()));
    }
    
    public Post getPost(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getPost(itemId, new ItemShape(propertyPaths));
    }
    
    public Post getPost(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getPost(itemId, new ItemShape(shapeType));
    }
    
    public Post getPost(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getPost(new ItemId(itemId), itemShape);
    }
    
    public Post getPost(final ItemId itemId) throws ServiceException {
        return this.getPost(itemId, new ItemShape(PostPropertyPath.getAllPropertyPaths()));
    }
    
    public Post getPost(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getPost(itemId, new ItemShape(propertyPaths));
    }
    
    public Post getPost(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getPost(itemId, new ItemShape(shapeType));
    }
    
    public Post getPost(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Post)this.getItem(itemId, itemShape);
    }
    
    public DistributionList getDistributionList(final String itemId) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(DistributionListPropertyPath.getAllPropertyPaths()));
    }
    
    public DistributionList getDistributionList(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(propertyPaths));
    }
    
    public DistributionList getDistributionList(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(shapeType));
    }
    
    public DistributionList getDistributionList(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getDistributionList(new ItemId(itemId), itemShape);
    }
    
    public DistributionList getDistributionList(final ItemId itemId) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(DistributionListPropertyPath.getAllPropertyPaths()));
    }
    
    public DistributionList getDistributionList(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(propertyPaths));
    }
    
    public DistributionList getDistributionList(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getDistributionList(itemId, new ItemShape(shapeType));
    }
    
    public DistributionList getDistributionList(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (DistributionList)this.getItem(itemId, itemShape);
    }
    
    public MeetingResponse getMeetingResponse(final String itemId) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(MeetingResponsePropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingResponse getMeetingResponse(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingResponse getMeetingResponse(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(shapeType));
    }
    
    public MeetingResponse getMeetingResponse(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getMeetingResponse(new ItemId(itemId), itemShape);
    }
    
    public MeetingResponse getMeetingResponse(final ItemId itemId) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(MeetingResponsePropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingResponse getMeetingResponse(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingResponse getMeetingResponse(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingResponse(itemId, new ItemShape(shapeType));
    }
    
    public MeetingResponse getMeetingResponse(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (MeetingResponse)this.getItem(itemId, itemShape);
    }
    
    public MeetingCancellation getMeetingCancellation(final String itemId) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(MeetingCancellationPropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingCancellation getMeetingCancellation(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingCancellation getMeetingCancellation(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(shapeType));
    }
    
    public MeetingCancellation getMeetingCancellation(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getMeetingCancellation(new ItemId(itemId), itemShape);
    }
    
    public MeetingCancellation getMeetingCancellation(final ItemId itemId) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(MeetingCancellationPropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingCancellation getMeetingCancellation(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingCancellation getMeetingCancellation(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingCancellation(itemId, new ItemShape(shapeType));
    }
    
    public MeetingCancellation getMeetingCancellation(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (MeetingCancellation)this.getItem(itemId, itemShape);
    }
    
    public MeetingRequest getMeetingRequest(final String itemId) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(MeetingRequestPropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingRequest getMeetingRequest(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingRequest getMeetingRequest(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(shapeType));
    }
    
    public MeetingRequest getMeetingRequest(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getMeetingRequest(new ItemId(itemId), itemShape);
    }
    
    public MeetingRequest getMeetingRequest(final ItemId itemId) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(MeetingRequestPropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingRequest getMeetingRequest(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingRequest getMeetingRequest(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingRequest(itemId, new ItemShape(shapeType));
    }
    
    public MeetingRequest getMeetingRequest(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (MeetingRequest)this.getItem(itemId, itemShape);
    }
    
    public MeetingMessage getMeetingMessage(final String itemId) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(MeetingMessagePropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingMessage getMeetingMessage(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingMessage getMeetingMessage(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(shapeType));
    }
    
    public MeetingMessage getMeetingMessage(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getMeetingMessage(new ItemId(itemId), itemShape);
    }
    
    public MeetingMessage getMeetingMessage(final ItemId itemId) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(MeetingMessagePropertyPath.getAllPropertyPaths()));
    }
    
    public MeetingMessage getMeetingMessage(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(propertyPaths));
    }
    
    public MeetingMessage getMeetingMessage(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMeetingMessage(itemId, new ItemShape(shapeType));
    }
    
    public MeetingMessage getMeetingMessage(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (MeetingMessage)this.getItem(itemId, itemShape);
    }
    
    public Message getMessage(final String itemId) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(MessagePropertyPath.getAllPropertyPaths()));
    }
    
    public Message getMessage(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(propertyPaths));
    }
    
    public Message getMessage(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(shapeType));
    }
    
    public Message getMessage(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getMessage(new ItemId(itemId), itemShape);
    }
    
    public Message getMessage(final ItemId itemId) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(MessagePropertyPath.getAllPropertyPaths()));
    }
    
    public Message getMessage(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(propertyPaths));
    }
    
    public Message getMessage(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getMessage(itemId, new ItemShape(shapeType));
    }
    
    public Message getMessage(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Message)this.getItem(itemId, itemShape);
    }
    
    public Appointment getAppointment(final String itemId) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(AppointmentPropertyPath.getAllPropertyPaths()));
    }
    
    public Appointment getAppointment(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(propertyPaths));
    }
    
    public Appointment getAppointment(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(shapeType));
    }
    
    public Appointment getAppointment(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getAppointment(new ItemId(itemId), itemShape);
    }
    
    public Appointment getAppointment(final ItemId itemId) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(AppointmentPropertyPath.getAllPropertyPaths()));
    }
    
    public Appointment getAppointment(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(propertyPaths));
    }
    
    public Appointment getAppointment(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getAppointment(itemId, new ItemShape(shapeType));
    }
    
    public Appointment getAppointment(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Appointment)this.getItem(itemId, itemShape);
    }
    
    public Task getTask(final String itemId) throws ServiceException {
        return this.getTask(itemId, new ItemShape(TaskPropertyPath.getAllPropertyPaths()));
    }
    
    public Task getTask(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getTask(itemId, new ItemShape(propertyPaths));
    }
    
    public Task getTask(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getTask(itemId, new ItemShape(shapeType));
    }
    
    public Task getTask(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getTask(new ItemId(itemId), itemShape);
    }
    
    public Task getTask(final ItemId itemId) throws ServiceException {
        return this.getTask(itemId, new ItemShape(TaskPropertyPath.getAllPropertyPaths()));
    }
    
    public Task getTask(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getTask(itemId, new ItemShape(propertyPaths));
    }
    
    public Task getTask(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getTask(itemId, new ItemShape(shapeType));
    }
    
    public Task getTask(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        return (Task)this.getItem(itemId, itemShape);
    }
    
    public Item getItem(final String itemId) throws ServiceException {
        return this.getItem(itemId, new ItemShape(ItemPropertyPath.getAllPropertyPaths()));
    }
    
    public Item getItem(final String itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getItem(itemId, new ItemShape(propertyPaths));
    }
    
    public Item getItem(final String itemId, final ShapeType shapeType) throws ServiceException {
        return this.getItem(itemId, new ItemShape(shapeType));
    }
    
    public Item getItem(final String itemId, final ItemShape itemShape) throws ServiceException {
        return this.getItem(new ItemId(itemId), itemShape);
    }
    
    public Item getItem(final ItemId itemId) throws ServiceException {
        return this.getItem(itemId, new ItemShape(ItemPropertyPath.getAllPropertyPaths()));
    }
    
    public Item getItem(final ItemId itemId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getItem(itemId, new ItemShape(propertyPaths));
    }
    
    public Item getItem(final ItemId itemId, final ShapeType shapeType) throws ServiceException {
        return this.getItem(itemId, new ItemShape(shapeType));
    }
    
    public Item getItem(final ItemId itemId, final ItemShape itemShape) throws ServiceException {
        final ArrayList<ItemId> items;
        (items = new ArrayList<ItemId>()).add(itemId);
        return this.getItems(items, itemShape).get(0).getItems().get(0);
    }
    
    public List<ItemInfoResponse> getItems(final List<ItemId> items) throws ServiceException {
        return this.getItems(items, new ItemShape(ItemPropertyPath.getAllPropertyPaths()));
    }
    
    public List<ItemInfoResponse> getItems(final List<ItemId> items, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getItems(items, new ItemShape(propertyPaths));
    }
    
    public List<ItemInfoResponse> getItems(final List<ItemId> items, final ShapeType shapeType) throws ServiceException {
        return this.getItems(items, new ItemShape(shapeType));
    }
    
    public List<ItemInfoResponse> getItems(final List<ItemId> items, final ItemShape itemShape) throws ServiceException {
        return this.a(items, itemShape);
    }
    
    private List<ItemInfoResponse> a(List<ItemId> o, ItemShape itemShape) throws ServiceException {
        String requestBody = null;
        List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        if (o == null) {
            throw new IllegalArgumentException("items is null.");
        }
        if (o.size() == 0) {
            throw new IllegalArgumentException("itemId is not specified.");
        }
        if (itemShape == null) {
            itemShape = new ItemShape(ShapeType.ALL_PROPERTIES);
        }
//        itemShape.getPropertyPaths().add(ItemPropertyPath.MIME_CONTENT);
        try {
            if (this.g == RequestServerVersion.EXCHANGE_2007) {
                itemShape.getPropertyPaths().remove(ItemPropertyPath.EFFECTIVE_RIGHTS);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.UID);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.UID);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.UID);
            }
            if (this.g == RequestServerVersion.EXCHANGE_2007 || this.g == RequestServerVersion.EXCHANGE_2007_SP1) {
                itemShape.getPropertyPaths().remove(ItemPropertyPath.IS_ASSOCIATED);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.WEB_CLIENT_EDIT_FORM_QUERY_STRING);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.WEB_CLIENT_READ_FORM_QUERY_STRING);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.CONVERSATION_ID);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.UNIQUE_BODY);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.LAST_MODIFIED_TIME);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.LAST_MODIFIER_NAME);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.START_TIME_ZONE);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.END_TIME_ZONE);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.START_TIME_ZONE);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.END_TIME_ZONE);
            }
            if (this.g == RequestServerVersion.EXCHANGE_2007 || this.g == RequestServerVersion.EXCHANGE_2007_SP1 || this.g == RequestServerVersion.EXCHANGE_2010 || this.g == RequestServerVersion.EXCHANGE_2010_SP1 || this.g == RequestServerVersion.EXCHANGE_2010_SP2) {
                itemShape.getPropertyPaths().remove(ItemPropertyPath.STORE_ENTRY_ID);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.ALIAS);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.DIRECTORY_ID);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.DIRECT_REPORTS);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.MANAGER_MAILBOX);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.MS_EXCHANGE_CERTIFICATE);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.NOTES);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.PHONETIC_FULL_NAME);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.PHONETIC_FIRST_NAME);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.PHONETIC_LAST_NAME);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.PHOTO);
                itemShape.getPropertyPaths().remove(ContactPropertyPath.USER_SMIME_CERTIFICATE);
            }
            if (this.g != RequestServerVersion.EXCHANGE_2013 && this.g != RequestServerVersion.EXCHANGE_2013_SP1 && this.g != RequestServerVersion.EXCHANGE_2016) {
                itemShape.getPropertyPaths().remove(ItemPropertyPath.FLAG);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.INSTANCE_KEY);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.RETENTION_TAG);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.ARCHIVE_TAG);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.RETENTION_DATE);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.PREVIEW);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.BLOCK_STATUS);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.HAS_BLOCKED_IMAGES);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.TEXT_BODY);
                itemShape.getPropertyPaths().remove(ItemPropertyPath.ICON_INDEX);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.REMINDER_NEXT_TIME);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.START_WALL_CLOCK);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.END_WALL_CLOCK);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.ENHANCED_LOCATION);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.JOIN_ONLINE_MEETING_URL);
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.ONLINE_MEETING_SETTINGS);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.REMINDER_NEXT_TIME);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.START_WALL_CLOCK);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.END_WALL_CLOCK);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.ENHANCED_LOCATION);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.JOIN_ONLINE_MEETING_URL);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.ONLINE_MEETING_SETTINGS);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.CHANGE_HIGHLIGHTS);
            }
            if (this.g != RequestServerVersion.EXCHANGE_2007 && this.g != RequestServerVersion.EXCHANGE_2007_SP1) {
                itemShape.getPropertyPaths().remove(AppointmentPropertyPath.MEETING_TIME_ZONE);
                itemShape.getPropertyPaths().remove(MeetingRequestPropertyPath.MEETING_TIME_ZONE);
            }
            itemShape.getPropertyPaths().remove(ItemPropertyPath.NEXT_PREDICTED_ACTION);
            itemShape.getPropertyPaths().remove(ItemPropertyPath.GROUPING_ACTION);
            requestBody = "<GetItem xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += itemShape.toString();
            requestBody += "<ItemIds>";
            for (int i = 0; i < (o).size(); ++i) {
                requestBody += o.get(i).a();
            }
            requestBody += "</ItemIds>";
            final String string;
            requestBody = (string = requestBody + "</GetItem>");
            itemInfoResponseList = d((this.a(string, true)), "GetItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((itemInfoResponseList).size() == 1 && ((itemInfoResponseList).get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((itemInfoResponseList).get(0)).getResponseCode()), ((itemInfoResponseList).get(0)).getMessage(), ((itemInfoResponseList).get(0)).getXmlMessage(), requestBody, ((itemInfoResponseList).get(0)).getServerVersionInfo());
        }
        return itemInfoResponseList;
    }
    
    public ItemInfoResponse declineMeetingRequest(final DeclineItem declineItem) throws ServiceException {
        return this.declineMeetingRequest(declineItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse declineMeetingRequest(final DeclineItem declineItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.declineMeetingRequest(declineItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse declineMeetingRequest(final DeclineItem declineItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.declineMeetingRequest(declineItem, messageDisposition, null);
    }
    
    public ItemInfoResponse declineMeetingRequest(final DeclineItem declineItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<DeclineItem> declineItems;
        (declineItems = new ArrayList<DeclineItem>()).add(declineItem);
        return this.declineMeetingRequest(declineItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> declineMeetingRequest(final List<DeclineItem> declineItems) throws ServiceException {
        return this.declineMeetingRequest(declineItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> declineMeetingRequest(final List<DeclineItem> declineItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.declineMeetingRequest(declineItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> declineMeetingRequest(final List<DeclineItem> declineItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.declineMeetingRequest(declineItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> declineMeetingRequest(final List<DeclineItem> declineItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < declineItems.size(); ++i) {
            items.add(declineItems.get(i));
        }
        return this.createItemImplementation(items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse tentativelyAcceptMeetingRequest(final TentativelyAcceptItem tentativelyAcceptItem) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse tentativelyAcceptMeetingRequest(final TentativelyAcceptItem tentativelyAcceptItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse tentativelyAcceptMeetingRequest(final TentativelyAcceptItem tentativelyAcceptItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItem, messageDisposition, null);
    }
    
    public ItemInfoResponse tentativelyAcceptMeetingRequest(final TentativelyAcceptItem tentativelyAcceptItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<TentativelyAcceptItem> tentativelyAcceptItems;
        (tentativelyAcceptItems = new ArrayList<TentativelyAcceptItem>()).add(tentativelyAcceptItem);
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> tentativelyAcceptMeetingRequest(final List<TentativelyAcceptItem> tentativelyAcceptItems) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> tentativelyAcceptMeetingRequest(final List<TentativelyAcceptItem> tentativelyAcceptItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> tentativelyAcceptMeetingRequest(final List<TentativelyAcceptItem> tentativelyAcceptItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.tentativelyAcceptMeetingRequest(tentativelyAcceptItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> tentativelyAcceptMeetingRequest(final List<TentativelyAcceptItem> tentativelyAcceptItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < tentativelyAcceptItems.size(); ++i) {
            items.add(tentativelyAcceptItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final RemoveItem removeItem) throws ServiceException {
        return this.cancelMeetingRequest(removeItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final RemoveItem removeItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.cancelMeetingRequest(removeItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final RemoveItem removeItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.cancelMeetingRequest(removeItem, messageDisposition, null);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final RemoveItem removeItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items;
        (items = new ArrayList<Item>()).add(removeItem);
        return this.createItemImplementation(items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE).get(0);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final CancelItem cancelItem) throws ServiceException {
        return this.cancelMeetingRequest(cancelItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final CancelItem cancelItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.cancelMeetingRequest(cancelItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final CancelItem cancelItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.cancelMeetingRequest(cancelItem, messageDisposition, null);
    }
    
    public ItemInfoResponse cancelMeetingRequest(final CancelItem cancelItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<CancelItem> cancelItems;
        (cancelItems = new ArrayList<CancelItem>()).add(cancelItem);
        return this.cancelMeetingRequest(cancelItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> cancelMeetingRequest(final List<CancelItem> cancelItems) throws ServiceException {
        return this.cancelMeetingRequest(cancelItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> cancelMeetingRequest(final List<CancelItem> cancelItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.cancelMeetingRequest(cancelItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> cancelMeetingRequest(final List<CancelItem> cancelItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.cancelMeetingRequest(cancelItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> cancelMeetingRequest(final List<CancelItem> cancelItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < cancelItems.size(); ++i) {
            items.add(cancelItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse acceptMeetingRequest(final AcceptItem acceptItem) throws ServiceException {
        return this.acceptMeetingRequest(acceptItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse acceptMeetingRequest(final AcceptItem acceptItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.acceptMeetingRequest(acceptItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse acceptMeetingRequest(final AcceptItem acceptItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.acceptMeetingRequest(acceptItem, messageDisposition, null);
    }
    
    public ItemInfoResponse acceptMeetingRequest(final AcceptItem acceptItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<AcceptItem> acceptItems;
        (acceptItems = new ArrayList<AcceptItem>()).add(acceptItem);
        return this.acceptMeetingRequest(acceptItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> acceptMeetingRequest(final List<AcceptItem> acceptItems) throws ServiceException {
        return this.acceptMeetingRequest(acceptItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> acceptMeetingRequest(final List<AcceptItem> acceptItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.acceptMeetingRequest(acceptItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> acceptMeetingRequest(final List<AcceptItem> acceptItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.acceptMeetingRequest(acceptItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> acceptMeetingRequest(final List<AcceptItem> acceptItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < acceptItems.size(); ++i) {
            items.add(acceptItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemId sendMeetingRequest(final Appointment appointment) throws ServiceException {
        return this.sendMeetingRequest(appointment, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY);
    }
    
    public ItemId sendMeetingRequest(final Appointment appointment, final FolderId sentItemsFolderId) throws ServiceException {
        return this.sendMeetingRequest(appointment, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemId sendMeetingRequest(final Appointment appointment, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.sendMeetingRequest(appointment, sendMeetingInvitations, null);
    }
    
    public ItemId sendMeetingRequest(final Appointment appointment, final SendMeetingInvitations sendMeetingInvitations, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Appointment> appointments;
        (appointments = new ArrayList<Appointment>()).add(appointment);
        return this.sendMeetingRequest(appointments, sendMeetingInvitations, sentItemsFolderId).get(0).getItems().get(0).getItemId();
    }
    
    public List<ItemInfoResponse> sendMeetingRequest(final List<Appointment> appointments) throws ServiceException {
        return this.sendMeetingRequest(appointments, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> sendMeetingRequest(final List<Appointment> appointments, final FolderId sentItemsFolderId) throws ServiceException {
        return this.sendMeetingRequest(appointments, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> sendMeetingRequest(final List<Appointment> appointments, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.sendMeetingRequest(appointments, sendMeetingInvitations, null);
    }
    
    public List<ItemInfoResponse> sendMeetingRequest(final List<Appointment> appointments, final SendMeetingInvitations sendMeetingInvitations, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < appointments.size(); ++i) {
            items.add(appointments.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, MessageDisposition.SEND_ONLY, sendMeetingInvitations);
    }
    
    public ItemInfoResponse replyToAll(final ReplyAllItem replyAllItem) throws ServiceException {
        return this.replyToAll(replyAllItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse replyToAll(final ReplyAllItem replyAllItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.replyToAll(replyAllItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse replyToAll(final ReplyAllItem replyAllItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.replyToAll(replyAllItem, messageDisposition, null);
    }
    
    public ItemInfoResponse replyToAll(final ReplyAllItem replyAllItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<ReplyAllItem> replyAllItems;
        (replyAllItems = new ArrayList<ReplyAllItem>()).add(replyAllItem);
        return this.replyToAll(replyAllItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> replyToAll(final List<ReplyAllItem> replyAllItems) throws ServiceException {
        return this.replyToAll(replyAllItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> replyToAll(final List<ReplyAllItem> replyAllItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.replyToAll(replyAllItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> replyToAll(final List<ReplyAllItem> replyAllItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.replyToAll(replyAllItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> replyToAll(final List<ReplyAllItem> replyAllItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < replyAllItems.size(); ++i) {
            items.add(replyAllItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse reply(final ReplyItem replyItem) throws ServiceException {
        return this.reply(replyItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse reply(final ReplyItem replyItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.reply(replyItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse reply(final ReplyItem replyItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.reply(replyItem, messageDisposition, null);
    }
    
    public ItemInfoResponse reply(final ReplyItem replyItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<ReplyItem> replyItems;
        (replyItems = new ArrayList<ReplyItem>()).add(replyItem);
        return this.reply(replyItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> reply(final List<ReplyItem> replyItems) throws ServiceException {
        return this.reply(replyItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> reply(final List<ReplyItem> replyItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.reply(replyItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> reply(final List<ReplyItem> replyItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.reply(replyItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> reply(final List<ReplyItem> replyItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < replyItems.size(); ++i) {
            items.add(replyItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse forward(final ForwardItem forwardItem) throws ServiceException {
        return this.forward(forwardItem, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse forward(final ForwardItem forwardItem, final FolderId sentItemsFolderId) throws ServiceException {
        return this.forward(forwardItem, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public ItemInfoResponse forward(final ForwardItem forwardItem, final MessageDisposition messageDisposition) throws ServiceException {
        return this.forward(forwardItem, messageDisposition, null);
    }
    
    public ItemInfoResponse forward(final ForwardItem forwardItem, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<ForwardItem> forwardItems;
        (forwardItems = new ArrayList<ForwardItem>()).add(forwardItem);
        return this.forward(forwardItems, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> forward(final List<ForwardItem> forwardItems) throws ServiceException {
        return this.forward(forwardItems, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public List<ItemInfoResponse> forward(final List<ForwardItem> forwardItems, final FolderId sentItemsFolderId) throws ServiceException {
        return this.forward(forwardItems, MessageDisposition.SEND_AND_SAVE_COPY, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> forward(final List<ForwardItem> forwardItems, final MessageDisposition messageDisposition) throws ServiceException {
        return this.forward(forwardItems, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> forward(final List<ForwardItem> forwardItems, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < forwardItems.size(); ++i) {
            items.add(forwardItems.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse send(final Message message) throws ServiceException {
        return this.send(message, MessageDisposition.SEND_AND_SAVE_COPY);
    }
    
    public ItemInfoResponse send(final Message message, final MessageDisposition messageDisposition) throws ServiceException {
        return this.send(message, messageDisposition, null);
    }
    
    public ItemInfoResponse send(final Message message, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<Message> messages;
        (messages = new ArrayList<Message>()).add(message);
        return this.send(messages, messageDisposition, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> send(final List<Message> messages, final MessageDisposition messageDisposition) throws ServiceException {
        return this.send(messages, messageDisposition, null);
    }
    
    public List<ItemInfoResponse> send(final List<Message> messages, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        if (messages == null) {
            throw new IllegalArgumentException("messages is null.");
        }
        final ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < messages.size(); ++i) {
            items.add(messages.get(i));
        }
        return this.createItemImplementation((List<Item>)items, sentItemsFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemInfoResponse send(final ItemId itemId) throws ServiceException {
        return this.send(itemId, true);
    }
    
    public ItemInfoResponse send(final ItemId itemId, final boolean saveToFolder) throws ServiceException {
        return this.send(itemId, saveToFolder, null);
    }
    
    public ItemInfoResponse send(final ItemId itemId, final StandardFolder standardFolder) throws ServiceException {
        return this.send(itemId, true, new StandardFolderId(standardFolder));
    }
    
    public ItemInfoResponse send(final ItemId itemId, final FolderId sentItemsFolderId) throws ServiceException {
        return this.send(itemId, true, sentItemsFolderId);
    }
    
    public ItemInfoResponse send(final ItemId itemId, final boolean saveToFolder, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<ItemId> messages;
        (messages = new ArrayList<ItemId>()).add(itemId);
        return this.send(messages, saveToFolder, sentItemsFolderId).get(0);
    }
    
    public List<ItemInfoResponse> send(final List<ItemId> messages) throws ServiceException {
        return this.send(messages, true);
    }
    
    public List<ItemInfoResponse> send(final List<ItemId> messages, final boolean saveToFolder) throws ServiceException {
        return this.send(messages, saveToFolder, null);
    }
    
    public List<ItemInfoResponse> send(final List<ItemId> messages, final StandardFolder standardFolder) throws ServiceException {
        return this.send(messages, true, new StandardFolderId(standardFolder));
    }
    
    public List<ItemInfoResponse> send(final List<ItemId> messages, final FolderId sentItemsFolderId) throws ServiceException {
        return this.send(messages, true, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> send(final List<ItemId> messages, final boolean saveToFolder, final FolderId sentItemsFolderId) throws ServiceException {
        return this.a(messages, saveToFolder, sentItemsFolderId);
    }
    
    private List<ItemInfoResponse> a(List<ItemId> var1, final boolean var2, final FolderId var3) throws ServiceException {
        String var4 = null;
        List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        String var5;
        try {
            var5 = "";
            if (var2) {
                var5 = var5 + " SaveItemToFolder=\"true\"";
            } else {
                var5 = var5 + " SaveItemToFolder=\"false\"";
            }

            var4 = "<SendItem" + var5 + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            var4 = var4 + "<ItemIds>";

            for(int var6 = 0; var6 < var1.size(); ++var6) {
                var4 = var4 + ((ItemId)var1.get(var6)).a();
            }

            var4 = var4 + "</ItemIds>";
            if (var2 && var3 != null) {
                var4 = var4 + "<SavedItemFolderId>" + var3.a() + "</SavedItemFolderId>";
            }

            var4 = var4 + "</SendItem>";
            itemInfoResponseList = d(this.a(var4, true), "SendItemResponseMessage");
        } catch (ServiceException var13) {
            throw var13;
        } catch (Exception var14) {
            throw new ServiceException(var14.getMessage(), var14, var4);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var12) {
                throw new ServiceException(var12.getMessage(), var12, var4);
            }

        }

        if (itemInfoResponseList.size() == 1 && (itemInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            var5 = com.ews.exchange.a.a((itemInfoResponseList.get(0)).getResponseCode());
            String var18 = (itemInfoResponseList.get(0)).getMessage();
            String var17 = (itemInfoResponseList.get(0)).getXmlMessage();
            ServerVersionInfo var16 = (itemInfoResponseList.get(0)).getServerVersionInfo();
            throw new ServiceException(var5, var18, var17, var4, var16);
        } else {
            return itemInfoResponseList;
        }
    }
    
    public ItemId createItem(final Item item) throws ServiceException {
        return this.createItem(item, (FolderId)null);
    }
    
    public ItemId createItem(final Item item, final StandardFolder standardFolder) throws ServiceException {
        return this.createItem(item, standardFolder, MessageDisposition.SAVE_ONLY, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemId createItem(final Item item, final StandardFolder standardFolder, final MessageDisposition messageDisposition) throws ServiceException {
        return this.createItem(item, standardFolder, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemId createItem(final Item item, final StandardFolder standardFolder, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(item, standardFolder, MessageDisposition.SAVE_ONLY, sendMeetingInvitations);
    }
    
    public ItemId createItem(final Item item, final StandardFolder standardFolder, final MessageDisposition messageDisposition, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(item, new StandardFolderId(standardFolder), messageDisposition, sendMeetingInvitations);
    }
    
    public ItemId createItem(final Item item, final FolderId parentFolderId) throws ServiceException {
        return this.createItem(item, parentFolderId, MessageDisposition.SAVE_ONLY, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemId createItem(final Item item, final FolderId parentFolderId, final MessageDisposition messageDisposition) throws ServiceException {
        return this.createItem(item, parentFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public ItemId createItem(final Item item, final FolderId parentFolderId, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(item, parentFolderId, MessageDisposition.SAVE_ONLY, sendMeetingInvitations);
    }
    
    public ItemId createItem(final Item item, final FolderId parentFolderId, final MessageDisposition messageDisposition, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        final ArrayList<Item> items;
        (items = new ArrayList<Item>()).add(item);
        return this.createItem(items, parentFolderId, messageDisposition, sendMeetingInvitations).get(0).getItems().get(0).getItemId();
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items) throws ServiceException {
        return this.createItem(items, (FolderId)null);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final StandardFolder standardFolder) throws ServiceException {
        return this.createItem(items, new StandardFolderId(standardFolder));
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final FolderId parentFolderId) throws ServiceException {
        return this.createItem(items, parentFolderId, MessageDisposition.SAVE_ONLY, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final StandardFolder standardFolder, final MessageDisposition messageDisposition) throws ServiceException {
        return this.createItem(items, standardFolder, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final StandardFolder standardFolder, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(items, standardFolder, MessageDisposition.SAVE_ONLY, sendMeetingInvitations);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final StandardFolder standardFolder, final MessageDisposition messageDisposition, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(items, new StandardFolderId(standardFolder), messageDisposition, sendMeetingInvitations);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final FolderId parentFolderId, final MessageDisposition messageDisposition) throws ServiceException {
        return this.createItem(items, parentFolderId, messageDisposition, SendMeetingInvitations.SEND_TO_NONE);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final FolderId parentFolderId, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItem(items, parentFolderId, MessageDisposition.SAVE_ONLY, sendMeetingInvitations);
    }
    
    public List<ItemInfoResponse> createItem(final List<Item> items, final FolderId parentFolderId, final MessageDisposition messageDisposition, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.createItemImplementation(items, parentFolderId, messageDisposition, sendMeetingInvitations);
    }
    
    public List<ItemInfoResponse> createItemImplementation(List<Item> items, FolderId parentFolderId, MessageDisposition messageDisposition, SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        String var5 = null;
        List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        String messageDisposition1;
        try {
            messageDisposition1 = " MessageDisposition=\"" + com.ews.exchange.a.a(messageDisposition) + "\"";
            messageDisposition1 = messageDisposition1 + " SendMeetingInvitations=\"" + com.ews.exchange.a.a(sendMeetingInvitations) + "\"";
            var5 = "<CreateItem" + messageDisposition1 + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (parentFolderId != null) {
                var5 = var5 + "<SavedItemFolderId>" + parentFolderId.a() + "</SavedItemFolderId>";
            }

            var5 = var5 + "<Items>";
            int parentFolderId1 = 0;

            while(true) {
                if (parentFolderId1 >= items.size()) {
                    var5 = var5 + "</Items>";
                    var5 = var5 + "</CreateItem>";
                    itemInfoResponseList = d(this.a(var5, true), "CreateItemResponseMessage");
                    break;
                }

                var5 = var5 + ((Item)items.get(parentFolderId1)).a();
                ++parentFolderId1;
            }
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var5);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var5);
            }

        }

        if (itemInfoResponseList.size() == 1 && (itemInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            messageDisposition1 = com.ews.exchange.a.a((itemInfoResponseList.get(0)).getResponseCode());
            String parentFolderId2 = (itemInfoResponseList.get(0)).getMessage();
            String sendMeetingInvitations1 = (itemInfoResponseList.get(0)).getXmlMessage();
            ServerVersionInfo items1 = (itemInfoResponseList.get(0)).getServerVersionInfo();
            throw new ServiceException(messageDisposition1, parentFolderId2, sendMeetingInvitations1, var5, items1);
        } else {
            return itemInfoResponseList;
        }
    }
    
    public ResolveNamesResponse resolveNames(final String name) throws ServiceException {
        return this.resolveNames(name, null, false);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final FolderId parentFolderId) throws ServiceException {
        return this.resolveNames(name, parentFolderId, false);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final boolean returnFullContactData) throws ServiceException {
        return this.resolveNames(name, null, returnFullContactData, ResolveNamesSearchScope.NONE);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final ResolveNamesSearchScope searchScope) throws ServiceException {
        return this.resolveNames(name, null, false, searchScope);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final FolderId parentFolderId, final boolean returnFullContactData) throws ServiceException {
        return this.resolveNames(name, parentFolderId, returnFullContactData, ResolveNamesSearchScope.NONE);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final FolderId parentFolderId, final ResolveNamesSearchScope searchScope) throws ServiceException {
        return this.resolveNames(name, parentFolderId, false, searchScope);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final boolean returnFullContactData, final ResolveNamesSearchScope searchScope) throws ServiceException {
        return this.resolveNames(name, null, returnFullContactData, searchScope, ContactDataShapeType.NONE);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final boolean returnFullContactData, final ResolveNamesSearchScope searchScope, final ContactDataShapeType contactDataShape) throws ServiceException {
        return this.resolveNames(name, null, returnFullContactData, searchScope, contactDataShape);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final FolderId parentFolderId, final boolean returnFullContactData, final ResolveNamesSearchScope searchScope) throws ServiceException {
        return this.a(name, parentFolderId, returnFullContactData, searchScope, ContactDataShapeType.NONE);
    }
    
    public ResolveNamesResponse resolveNames(final String name, final FolderId parentFolderId, final boolean returnFullContactData, final ResolveNamesSearchScope searchScope, final ContactDataShapeType contactDataShape) throws ServiceException {
        return this.a(name, parentFolderId, returnFullContactData, searchScope, contactDataShape);
    }
    
    private ResolveNamesResponse a(String var1, FolderId var2, boolean var3, ResolveNamesSearchScope var4, ContactDataShapeType var5) throws ServiceException {
        String var6 = null;

        ResolveNamesResponse var17;
        String var20;
        try {
            if (var3) {
                var20 = " ReturnFullContactData=\"true\"";
            } else {
                var20 = " ReturnFullContactData=\"false\"";
            }

            if (var4 != ResolveNamesSearchScope.NONE) {
                var20 = var20 + " SearchScope=\"" + (var4 == ResolveNamesSearchScope.ACTIVE_DIRECTORY ? "ActiveDirectory" : (var4 == ResolveNamesSearchScope.ACTIVE_DIRECTORY_CONTACTS ? "ActiveDirectoryContacts" : (var4 == ResolveNamesSearchScope.CONTACTS ? "Contacts" : (var4 == ResolveNamesSearchScope.CONTACTS_ACTIVE_DIRECTORY ? "ContactsActiveDirectory" : "None")))) + "\"";
            }

            if (var5 != ContactDataShapeType.NONE) {
                var20 = var20 + " ContactDataShape=\"" + (var5 == ContactDataShapeType.ID ? "IdOnly" : (var5 == ContactDataShapeType.DEFAULT ? "Default" : (var5 == ContactDataShapeType.ALL_PROPERTIES ? "AllProperties" : "None"))) + "\"";
            }

            var6 = "<ResolveNames" + var20 + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var2 != null) {
                var6 = var6 + "<ParentFolderIds>";
                var6 = var6 + var2.a("t:FolderId");
                var6 = var6 + "</ParentFolderIds>";
            }

            var6 = var6 + "<UnresolvedEntry>" + com.ews.exchange.d.a(var1) + "</UnresolvedEntry>";
            var6 = var6 + "</ResolveNames>";
            InputStream var16 = this.a(var6, true);
            var17 = new ResolveNamesResponse(var16);
        } catch (ServiceException var13) {
            throw var13;
        } catch (Exception var14) {
            throw new ServiceException(var14.getMessage(), var14, var6);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var12) {
                throw new ServiceException(var12.getMessage(), var12, var6);
            }

        }

        if (var17.getResponseClass() == ResponseClass.ERROR) {
            var20 = com.ews.exchange.a.a(var17.getResponseCode());
            String var19 = var17.getMessage();
            String var21 = var17.getXmlMessage();
            ServerVersionInfo var18 = var17.getServerVersionInfo();
            throw new ServiceException(var20, var19, var21, var6, var18);
        } else {
            return var17;
        }
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest) throws ServiceException {
        return this.getConversationItems(conversationRequest, null);
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest, final ItemShape itemShape) throws ServiceException {
        return this.getConversationItems(conversationRequest, itemShape, MailboxSearchLocation.NONE);
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.getConversationItems(conversationRequest, itemShape, mailboxSearchLocation, null);
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> foldersToIgnore) throws ServiceException {
        return this.getConversationItems(conversationRequest, itemShape, mailboxSearchLocation, foldersToIgnore, ConversationNodeSortOrder.NONE);
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> foldersToIgnore, final ConversationNodeSortOrder sortOrder) throws ServiceException {
        return this.getConversationItems(conversationRequest, itemShape, mailboxSearchLocation, foldersToIgnore, sortOrder, -1);
    }
    
    public List<ConversationItemResponse> getConversationItems(final ConversationRequest conversationRequest, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> foldersToIgnore, final ConversationNodeSortOrder sortOrder, final int maxItemsToReturn) throws ServiceException {
        final ArrayList<ConversationRequest> conversationRequests;
        (conversationRequests = new ArrayList<ConversationRequest>()).add(conversationRequest);
        return this.getConversationItems(conversationRequests, itemShape, mailboxSearchLocation, foldersToIgnore, sortOrder, maxItemsToReturn);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests) throws ServiceException {
        return this.getConversationItems(conversationRequests, null);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests, final ItemShape itemShape) throws ServiceException {
        return this.getConversationItems(conversationRequests, itemShape, MailboxSearchLocation.NONE);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.getConversationItems(conversationRequests, itemShape, mailboxSearchLocation, null);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> foldersToIgnore) throws ServiceException {
        return this.getConversationItems(conversationRequests, itemShape, mailboxSearchLocation, foldersToIgnore, ConversationNodeSortOrder.NONE);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> foldersToIgnore, final ConversationNodeSortOrder sortOrder) throws ServiceException {
        return this.getConversationItems(conversationRequests, itemShape, mailboxSearchLocation, foldersToIgnore, sortOrder, -1);
    }
    
    public List<ConversationItemResponse> getConversationItems(final List<ConversationRequest> conversationRequests, final ItemShape itemShape, final MailboxSearchLocation mailboxSearchLocation, final List<FolderId> folderToIgnore, final ConversationNodeSortOrder sortOrder, final int maxItemsToReturn) throws ServiceException {
        return this.a(conversationRequests, itemShape, mailboxSearchLocation, folderToIgnore, sortOrder, maxItemsToReturn);
    }
    
    private List<ConversationItemResponse> a(List<ConversationRequest> var1, ItemShape var2, MailboxSearchLocation var3, List<FolderId> var4, ConversationNodeSortOrder var5, int var6) throws ServiceException {
        List<ConversationItemResponse> conversationItemResponseList = new ArrayList<>();
        if (var1 == null) {
            throw new IllegalArgumentException("conversationRequests is null.");
        } else {
            if (var2 == null) {
                var2 = new ItemShape(ShapeType.ALL_PROPERTIES);
            }

            String var7 = null;

            String var18;
            try {
                var7 = "<GetConversationItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var2 != null) {
                    this.k(var2.getPropertyPaths());
                    var7 = var7 + var2.toString();
                }

                if (var4 != null && var4.size() > 0) {
                    var18 = i(var4);
                    var7 = var7 + "<FoldersToIgnore>" + var18 + "</FoldersToIgnore>";
                }

                if (var6 > 0) {
                    var7 = var7 + "<MaxItemsToReturn>" + var6 + "</MaxItemsToReturn>";
                }

                if (var5 != ConversationNodeSortOrder.NONE) {
                    var7 = var7 + "<SortOrder>" + (var5 == ConversationNodeSortOrder.DATE_ORDER_ASCENDING ? "DateOrderAscending" : (var5 == ConversationNodeSortOrder.DATE_ORDER_DESCENDING ? "DateOrderDescending" : (var5 == ConversationNodeSortOrder.TREE_ORDER_ASCENDING ? "TreeOrderAscending" : (var5 == ConversationNodeSortOrder.TREE_ORDER_DESCENDING ? "TreeOrderDescending" : "None")))) + "</SortOrder>";
                }

                if (var3 != MailboxSearchLocation.NONE) {
                    var7 = var7 + "<MailboxScope>" + com.ews.exchange.a.a(var3) + "</MailboxScope>";
                }

                var7 = var7 + "<Conversations>";
                int var20 = 0;

                while(true) {
                    if (var20 >= var1.size()) {
                        var7 = var7 + "</Conversations>";
                        var7 = var7 + "</GetConversationItems>";
                        conversationItemResponseList = c(this.a(var7, true), "GetConversationItemsResponseMessage");
                        break;
                    }

                    var7 = var7 + ((ConversationRequest)var1.get(var20)).a();
                    ++var20;
                }
            } catch (ServiceException var14) {
                throw var14;
            } catch (Exception var15) {
                throw new ServiceException(var15.getMessage(), var15, var7);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var13) {
                    throw new ServiceException(var13.getMessage(), var13, var7);
                }

            }

            if (conversationItemResponseList.size() == 1 && (conversationItemResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
                var18 = com.ews.exchange.a.a((conversationItemResponseList.get(0)).getResponseCode());
                String var19 = (conversationItemResponseList.get(0)).getMessage();
                String var21 = (conversationItemResponseList.get(0)).getXmlMessage();
                ServerVersionInfo var17 = (conversationItemResponseList.get(0)).getServerVersionInfo();
                throw new ServiceException(var18, var19, var21, var7, var17);
            } else {
                return conversationItemResponseList;
            }
        }
    }
    
    public Response markAllItemsAsRead(final StandardFolder standardFolder) throws ServiceException {
        return this.markAllItemsAsRead(standardFolder, true);
    }
    
    public Response markAllItemsAsRead(final StandardFolder standardFolder, final boolean isRead) throws ServiceException {
        return this.markAllItemsAsRead(standardFolder, isRead, false);
    }
    
    public Response markAllItemsAsRead(final StandardFolder standardFolder, final boolean isRead, final boolean suppressReadReceipts) throws ServiceException {
        return this.markAllItemsAsRead(new StandardFolderId(standardFolder), isRead, suppressReadReceipts);
    }
    
    public Response markAllItemsAsRead(final FolderId folderId) throws ServiceException {
        return this.markAllItemsAsRead(folderId, true);
    }
    
    public Response markAllItemsAsRead(final FolderId folderId, final boolean isRead) throws ServiceException {
        return this.markAllItemsAsRead(folderId, isRead, false);
    }
    
    public Response markAllItemsAsRead(final FolderId folderId, final boolean isRead, final boolean suppressReadReceipts) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.markAllItemsAsRead(folders, isRead, suppressReadReceipts).get(0);
    }
    
    public List<Response> markAllItemsAsRead(final List<FolderId> folders) throws ServiceException {
        return this.markAllItemsAsRead(folders, true);
    }
    
    public List<Response> markAllItemsAsRead(final List<FolderId> folders, final boolean isRead) throws ServiceException {
        return this.markAllItemsAsRead(folders, isRead, false);
    }
    
    public List<Response> markAllItemsAsRead(final List<FolderId> folders, final boolean isRead, final boolean suppressReadReceipts) throws ServiceException {
        return this.a(folders, isRead, suppressReadReceipts);
    }
    
    private List<Response> a(List<FolderId> var1, boolean var2, boolean var3) throws ServiceException {
        String var4 = null;
        List<Response> responseList = new ArrayList<>();
        String var5;
        try {
            var5 = i(var1);
            var4 = "<MarkAllItemsAsRead xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var2) {
                var4 = var4 + "<ReadFlag>true</ReadFlag>";
            } else {
                var4 = var4 + "<ReadFlag>false</ReadFlag>";
            }

            if (var3) {
                var4 = var4 + "<SuppressReadReceipts>true</SuppressReadReceipts>";
            } else {
                var4 = var4 + "<SuppressReadReceipts>false</SuppressReadReceipts>";
            }

            var4 = var4 + var5;
            var4 = var4 + "</MarkAllItemsAsRead>";
            responseList = f(this.a(var4, true), "MarkAllItemsAsReadResponse");
        } catch (ServiceException var11) {
            throw var11;
        } catch (Exception var12) {
            throw new ServiceException(var12.getMessage(), var12, var4);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var13) {
                throw new ServiceException(var13.getMessage(), var13, var4);
            }

        }

        if (responseList.size() == 1 && (responseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            var5 = com.ews.exchange.a.a((responseList.get(0)).getResponseCode());
            String var16 = (responseList.get(0)).getMessage();
            String var17 = (responseList.get(0)).getXmlMessage();
            ServerVersionInfo var15 = (responseList.get(0)).getServerVersionInfo();
            throw new ServiceException(var5, var16, var17, var4, var15);
        } else {
            return responseList;
        }
    }
    
    public Folder getFolder(final String folderId) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(FolderPropertyPath.getAllPropertyPaths()));
    }
    
    public Folder getFolder(final String folderId, final ShapeType shapeType) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(shapeType));
    }
    
    public Folder getFolder(final String folderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(propertyPaths));
    }
    
    public Folder getFolder(final String folderId, final FolderShape folderShape) throws ServiceException {
        return this.getFolder(new FolderId(folderId), folderShape);
    }
    
    public Folder getFolder(final StandardFolder standardFolder) throws ServiceException {
        return this.getFolder(standardFolder, new FolderShape(FolderPropertyPath.getAllPropertyPaths()));
    }
    
    public Folder getFolder(final StandardFolder standardFolder, final ShapeType shapeType) throws ServiceException {
        return this.getFolder(standardFolder, new FolderShape(shapeType));
    }
    
    public Folder getFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getFolder(standardFolder, new FolderShape(propertyPaths));
    }
    
    public Folder getFolder(final StandardFolder standardFolder, final FolderShape folderShape) throws ServiceException {
        return this.getFolder(new StandardFolderId(standardFolder), folderShape);
    }
    
    public Folder getFolder(final FolderId folderId) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(FolderPropertyPath.getAllPropertyPaths()));
    }
    
    public Folder getFolder(final FolderId folderId, final ShapeType shapeType) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(shapeType));
    }
    
    public Folder getFolder(final FolderId folderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getFolder(folderId, new FolderShape(propertyPaths));
    }
    
    public Folder getFolder(final FolderId folderId, final FolderShape folderShape) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.getFolders(folders, folderShape).get(0).getFolders().get(0);
    }
    
    public List<FolderInfoResponse> getFolders(final List<FolderId> folders) throws ServiceException {
        return this.getFolders(folders, new FolderShape(FolderPropertyPath.getAllPropertyPaths()));
    }
    
    public List<FolderInfoResponse> getFolders(final List<FolderId> folders, final ShapeType shapeType) throws ServiceException {
        return this.getFolders(folders, new FolderShape(shapeType));
    }
    
    public List<FolderInfoResponse> getFolders(final List<FolderId> folders, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.getFolders(folders, new FolderShape(propertyPaths));
    }
    
    public List<FolderInfoResponse> getFolders(final List<FolderId> folders, final FolderShape folderShape) throws ServiceException {
        return this.a(folders, folderShape);
    }
    
    private List<FolderInfoResponse> a(List<FolderId> var1, FolderShape var2) throws ServiceException {
        String var3 = null;
        List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        if (var1 == null) {
            throw new IllegalArgumentException("folders is null.");
        } else if (var1.size() == 0) {
            throw new IllegalArgumentException("folderId is not specified.");
        } else {
            if (var2 == null) {
                var2 = new FolderShape(FolderPropertyPath.getAllPropertyPaths());
            }

            String var16;
            try {
                var3 = "<GetFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var2 != null) {
                    this.a(var2);
                    var3 = var3 + var2.toString();
                }

                var16 = i(var1);
                var3 = var3 + var16;
                var3 = var3 + "</GetFolder>";
                folderInfoResponseList = b(this.a(var3, true), "GetFolderResponseMessage");
            } catch (ServiceException var12) {
                throw var12;
            } catch (Exception var13) {
                throw new ServiceException(var13.getMessage(), var13, var3);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var11) {
                    throw new ServiceException(var11.getMessage(), var11, var3);
                }

            }

            if (folderInfoResponseList.size() == 1 && (folderInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
                var16 = com.ews.exchange.a.a((folderInfoResponseList.get(0)).getResponseCode());
                String var4 = (folderInfoResponseList.get(0)).getMessage();
                String var5 = (folderInfoResponseList.get(0)).getXmlMessage();
                ServerVersionInfo var15 = (folderInfoResponseList.get(0)).getServerVersionInfo();
                throw new ServiceException(var16, var4, var5, var3, var15);
            } else {
                return folderInfoResponseList;
            }
        }
    }
    
    public FolderId updateFolder(final FolderId folderId, final Property propertyToSet) throws ServiceException {
        return this.updateFolder(new FolderChange(folderId, propertyToSet));
    }
    
    public FolderId updateFolder(final FolderId folderId, final PropertyPath propertyToDelete) throws ServiceException {
        return this.updateFolder(new FolderChange(folderId, propertyToDelete));
    }
    
    public FolderId updateFolder(final FolderId folderId, final Property propertyToSet, final PropertyPath propertyToDelete) throws ServiceException {
        return this.updateFolder(new FolderChange(folderId, propertyToSet, propertyToDelete));
    }
    
    public FolderId updateFolder(final FolderId folderId, final List<Property> propertiesToSet) throws ServiceException {
        return this.updateFolder(folderId, propertiesToSet, new ArrayList<PropertyPath>());
    }
    
    public FolderId updateFolder(final FolderId folderId, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete) throws ServiceException {
        return this.updateFolder(new FolderChange(folderId, propertiesToSet, propertiesToDelete));
    }
    
    public FolderId updateFolder(final FolderChange folderChange) throws ServiceException {
        final ArrayList<FolderChange> folderChanges;
        (folderChanges = new ArrayList<FolderChange>()).add(folderChange);
        return this.updateFolder(folderChanges).get(0).getFolders().get(0).getFolderId();
    }
    
    public List<FolderInfoResponse> updateFolder(final List<FolderChange> folderChanges) throws ServiceException {
        return this.a(folderChanges);
    }
    
    private List<FolderInfoResponse> a(List<FolderChange> var1) throws ServiceException {
        String var2 = null;
        List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            var2 = "<UpdateFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var1.size() > 0) {
                var2 = var2 + "<FolderChanges>";

                for(int var3 = 0; var3 < var1.size(); ++var3) {
                    var2 = var2 + ((FolderChange)var1.get(var3)).toString();
                }

                var2 = var2 + "</FolderChanges>";
            }

            var2 = var2 + "</UpdateFolder>";
            folderInfoResponseList = b(this.a(var2, true), "UpdateFolderResponseMessage");
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var2);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var2);
            }

        }

        if (folderInfoResponseList.size() == 1 && (folderInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            String var16 = com.ews.exchange.a.a((folderInfoResponseList.get(0)).getResponseCode());
            String var4 = (folderInfoResponseList.get(0)).getMessage();
            String var5 = (folderInfoResponseList.get(0)).getXmlMessage();
            ServerVersionInfo var15 = (folderInfoResponseList.get(0)).getServerVersionInfo();
            throw new ServiceException(var16, var4, var5, var2, var15);
        } else {
            return folderInfoResponseList;
        }
    }
    
    public FolderId createManagedFolder(final String folderName) throws ServiceException {
        return this.createManagedFolder(folderName, null);
    }
    
    public FolderId createManagedFolder(final String folderName, final Mailbox mailbox) throws ServiceException {
        final ArrayList<String> folderNames;
        (folderNames = new ArrayList<String>()).add(folderName);
        return this.createManagedFolder(folderNames, mailbox).get(0).getFolders().get(0).getFolderId();
    }
    
    public List<FolderInfoResponse> createManagedFolder(final List<String> folderNames) throws ServiceException {
        return this.createManagedFolder(folderNames, null);
    }
    
    public List<FolderInfoResponse> createManagedFolder(final List<String> folderNames, final Mailbox mailbox) throws ServiceException {
        return this.a(folderNames, mailbox);
    }
    
    private List<FolderInfoResponse> a(List<String> var1, Mailbox var2) throws ServiceException {
        String var3 = null;
        List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        String var4;
        try {
            var1 = var1;
            var4 = "<FolderNames>";

            for(int var5 = 0; var5 < var1.size(); ++var5) {
                var4 = var4 + "<t:FolderName>" + com.ews.exchange.d.a((String)var1.get(var5)) + "</t:FolderName>";
            }

            var4 = var4 + "</FolderNames>";
            var3 = "<CreateManagedFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            var3 = var3 + var4;
            if (var2 != null) {
                var3 = var3 + var2.a("Mailbox");
            }

            var3 = var3 + "</CreateManagedFolder>";
            folderInfoResponseList = b(this.a(var3, true), "CreateManagedFolderResponseMessage");
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var3);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var3);
            }

        }

        if (folderInfoResponseList.size() == 1 && (folderInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            var4 = com.ews.exchange.a.a((folderInfoResponseList.get(0)).getResponseCode());
            String var16 = (folderInfoResponseList.get(0)).getMessage();
            String var17 = (folderInfoResponseList.get(0)).getXmlMessage();
            ServerVersionInfo var15 = (folderInfoResponseList.get(0)).getServerVersionInfo();
            throw new ServiceException(var4, var16, var17, var3, var15);
        } else {
            return folderInfoResponseList;
        }
    }
    
    public FolderId createFolder(final String folderName, final StandardFolder standardFolder) throws ServiceException {
        return this.createFolder(folderName, new StandardFolderId(standardFolder));
    }
    
    public FolderId createFolder(final Folder folder, final StandardFolder standardFolder) throws ServiceException {
        return this.createFolder(folder, new StandardFolderId(standardFolder));
    }
    
    public FolderId createFolder(final String folderName, final FolderId parentFolderId) throws ServiceException {
        return this.createFolder(new Folder(folderName), parentFolderId);
    }
    
    public FolderId createFolder(final Folder folder, final FolderId parentFolderId) throws ServiceException {
        final ArrayList<Folder> folders;
        (folders = new ArrayList<Folder>()).add(folder);
        return this.createFolder(folders, parentFolderId).get(0).getFolders().get(0).getFolderId();
    }
    
    public List<FolderInfoResponse> createFolder(final List<Folder> folders, final StandardFolder standardFolder) throws ServiceException {
        return this.createFolder(folders, new StandardFolderId(standardFolder));
    }
    
    public List<FolderInfoResponse> createFolder(final List<Folder> folders, final FolderId parentFolderId) throws ServiceException {
        return this.a(folders, parentFolderId);
    }
    
    private List<FolderInfoResponse> a(List<Folder> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;
        List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            o = o;
            String string = "<Folders>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                string += ((List<Folder>)o).get(i).a();
            }
            final String string2 = string + "</Folders>";
            requestBody = "<CreateFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ParentFolderId>" + folderId.a() + "</ParentFolderId>";
            requestBody += string2;
            final String string3;
            requestBody = (string3 = requestBody + "</CreateFolder>");
            folderInfoResponseList = b((InputStream)(this.a(string3, true)), "CreateFolderResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (folderInfoResponseList.size() == 1 && (folderInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((folderInfoResponseList.get(0)).getResponseCode()), (folderInfoResponseList.get(0)).getMessage(), (folderInfoResponseList.get(0)).getXmlMessage(), requestBody, (folderInfoResponseList.get(0)).getServerVersionInfo());
        }
        return folderInfoResponseList;
    }
    
    public FolderId copyFolder(final FolderId folderId, final StandardFolder standardFolder) throws ServiceException {
        return this.copyFolder(folderId, new StandardFolderId(standardFolder));
    }
    
    public FolderId copyFolder(final FolderId folderId, final FolderId targetFolderId) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.copyFolder(folders, targetFolderId).get(0).getFolders().get(0).getFolderId();
    }
    
    public List<FolderInfoResponse> copyFolder(final List<FolderId> folders, final StandardFolder standardFolder) throws ServiceException {
        return this.copyFolder(folders, new StandardFolderId(standardFolder));
    }
    
    public List<FolderInfoResponse> copyFolder(final List<FolderId> folders, final FolderId targetFolderId) throws ServiceException {
        return this.b(folders, targetFolderId);
    }
    
    private List<FolderInfoResponse> b(List<FolderId> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            final String i = i((List<FolderId>)o);
            requestBody = "<CopyFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ToFolderId>" + folderId.a() + "</ToFolderId>";
            requestBody += i;
            final String string;
            requestBody = (string = requestBody + "</CopyFolder>");
            folderInfoResponseList = b((InputStream)(this.a(string, true)), "CopyFolderResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (folderInfoResponseList.size() == 1 && folderInfoResponseList.get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(folderInfoResponseList.get(0).getResponseCode()), folderInfoResponseList.get(0).getMessage(), folderInfoResponseList.get(0).getXmlMessage(), requestBody, folderInfoResponseList.get(0).getServerVersionInfo());
        }
        return folderInfoResponseList;
    }
    
    public FolderId moveFolder(final FolderId folderId, final StandardFolder standardFolder) throws ServiceException {
        return this.moveFolder(folderId, new StandardFolderId(standardFolder));
    }
    
    public FolderId moveFolder(final FolderId folderId, final FolderId targetFolderId) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.moveFolder(folders, targetFolderId).get(0).getFolders().get(0).getFolderId();
    }
    
    public List<FolderInfoResponse> moveFolder(final List<FolderId> folders, final StandardFolder standardFolder) throws ServiceException {
        return this.moveFolder(folders, new StandardFolderId(standardFolder));
    }
    
    public List<FolderInfoResponse> moveFolder(final List<FolderId> folders, final FolderId targetFolderId) throws ServiceException {
        return this.c(folders, targetFolderId);
    }
    
    private List<FolderInfoResponse> c(List<FolderId> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            final String i = i((List<FolderId>)o);
            requestBody = "<MoveFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ToFolderId>" + folderId.a() + "</ToFolderId>";
            requestBody += i;
            final String string;
            requestBody = (string = requestBody + "</MoveFolder>");
            folderInfoResponseList = b((InputStream)(this.a(string, true)), "MoveFolderResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (folderInfoResponseList.size() == 1 && folderInfoResponseList.get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(folderInfoResponseList.get(0).getResponseCode()), folderInfoResponseList.get(0).getMessage(), folderInfoResponseList.get(0).getXmlMessage(), requestBody, folderInfoResponseList.get(0).getServerVersionInfo());
        }
        return folderInfoResponseList;
    }
    
    public Response deleteFolder(final FolderId folderId) throws ServiceException {
        return this.deleteFolder(folderId, DeleteType.HARD_DELETE);
    }
    
    public Response deleteFolder(final FolderId folderId, final DeleteType deleteType) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.deleteFolder(folders, deleteType).get(0);
    }
    
    public List<Response> deleteFolder(final List<FolderId> folders) throws ServiceException {
        return this.deleteFolder(folders, DeleteType.HARD_DELETE);
    }
    
    public List<Response> deleteFolder(final List<FolderId> folders, final DeleteType deleteType) throws ServiceException {
        return this.a(folders, deleteType);
    }
    
    private List<Response> a(List<FolderId> o, final DeleteType deleteType) throws ServiceException {
        String requestBody = null;List<Response> responseList = new ArrayList<>();
        try {
            final String string = " DeleteType=\"" + com.ews.exchange.a.a(deleteType) + "\"";
            final String i = i((List<FolderId>)o);
            requestBody = "<DeleteFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"" + string + ">";
            requestBody += i;
            final String string2;
            requestBody = (string2 = requestBody + "</DeleteFolder>");
            responseList = f((InputStream)(this.a(string2, true)), "DeleteFolderResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (responseList.size() == 1 && responseList.get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(responseList.get(0).getResponseCode()), responseList.get(0).getMessage(), responseList.get(0).getXmlMessage(), requestBody, responseList.get(0).getServerVersionInfo());
        }
        return responseList;
    }
    
    public Response deleteItem(final ItemId itemId) throws ServiceException {
        return this.deleteItem(itemId, DeleteType.HARD_DELETE);
    }
    
    public Response deleteItem(final ItemId itemId, final DeleteType deleteType) throws ServiceException {
        return this.deleteItem(itemId, deleteType, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY);
    }
    
    public Response deleteItem(final ItemId itemId, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.deleteItem(itemId, DeleteType.HARD_DELETE, sendMeetingInvitations);
    }
    
    public Response deleteItem(final ItemId itemId, final DeleteType deleteType, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.deleteItem(itemId, deleteType, sendMeetingInvitations, AffectedTaskOccurrences.ALL_OCCURRENCES);
    }
    
    public Response deleteItem(final ItemId itemId, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        return this.deleteItem(itemId, DeleteType.HARD_DELETE, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, affectedTaskOccurrences);
    }
    
    public Response deleteItem(final ItemId itemId, final DeleteType deleteType, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        return this.deleteItem(itemId, deleteType, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, affectedTaskOccurrences);
    }
    
    public Response deleteItem(final ItemId itemId, final DeleteType deleteType, final SendMeetingInvitations sendMeetingInvitations, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        final ArrayList<ItemId> items;
        (items = new ArrayList<ItemId>()).add(itemId);
        return this.deleteItem(items, deleteType, sendMeetingInvitations, affectedTaskOccurrences).get(0);
    }
    
    public List<Response> deleteItem(final List<ItemId> items) throws ServiceException {
        return this.deleteItem(items, DeleteType.HARD_DELETE);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final DeleteType deleteType) throws ServiceException {
        return this.deleteItem(items, deleteType, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.deleteItem(items, DeleteType.HARD_DELETE, sendMeetingInvitations, AffectedTaskOccurrences.ALL_OCCURRENCES);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final DeleteType deleteType, final SendMeetingInvitations sendMeetingInvitations) throws ServiceException {
        return this.deleteItem(items, deleteType, sendMeetingInvitations, AffectedTaskOccurrences.ALL_OCCURRENCES);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        return this.deleteItem(items, DeleteType.HARD_DELETE, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, affectedTaskOccurrences);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final DeleteType deleteType, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        return this.deleteItem(items, deleteType, SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY, affectedTaskOccurrences);
    }
    
    public List<Response> deleteItem(final List<ItemId> items, final DeleteType deleteType, final SendMeetingInvitations sendMeetingInvitations, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        return this.a(items, deleteType, sendMeetingInvitations, affectedTaskOccurrences);
    }
    
    private List<Response> a(List<ItemId> o, final DeleteType deleteType, final SendMeetingInvitations sendMeetingInvitations, final AffectedTaskOccurrences affectedTaskOccurrences) throws ServiceException {
        String requestBody = null;List<Response> responseList = new ArrayList<>();
        try {
            requestBody = "<DeleteItem xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"" + (" DeleteType=\"" + com.ews.exchange.a.a(deleteType) + "\"" + " SendMeetingCancellations=\"" + com.ews.exchange.a.a(sendMeetingInvitations) + "\"" + " AffectedTaskOccurrences=\"" + ((affectedTaskOccurrences == AffectedTaskOccurrences.SPECIFIED_OCCURRENCE_ONLY) ? "SpecifiedOccurrenceOnly" : "AllOccurrences") + "\"") + ">";
            requestBody += "<ItemIds>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<ItemId>)o).get(i).a();
            }
            requestBody += "</ItemIds>";
            final String string;
            requestBody = (string = requestBody + "</DeleteItem>");
            responseList = f((InputStream)(this.a(string, true)), "DeleteItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (responseList.size() == 1 && (responseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((responseList.get(0)).getResponseCode()), (responseList.get(0)).getMessage(), (responseList.get(0)).getXmlMessage(), requestBody, (responseList.get(0)).getServerVersionInfo());
        }
        return responseList;
    }
    
    public ItemInfoResponse archiveItem(final ItemId itemId, final StandardFolder standardFolder) throws ServiceException {
        return this.archiveItem(itemId, new StandardFolderId(standardFolder));
    }
    
    public ItemInfoResponse archiveItem(final ItemId itemId, final FolderId targetFolderId) throws ServiceException {
        final ArrayList<ItemId> items;
        (items = new ArrayList<ItemId>()).add(itemId);
        return this.archiveItem(items, targetFolderId).get(0);
    }
    
    public List<ItemInfoResponse> archiveItem(final List<ItemId> items, final StandardFolder standardFolder) throws ServiceException {
        return this.archiveItem(items, new StandardFolderId(standardFolder));
    }
    
    public List<ItemInfoResponse> archiveItem(final List<ItemId> items, final FolderId targetFolderId) throws ServiceException {
        return this.d(items, targetFolderId);
    }
    
    private List<ItemInfoResponse> d(List<ItemId> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        try {
            requestBody = "<ArchiveItem xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ArchiveSourceFolderId>" + folderId.a() + "</ArchiveSourceFolderId>";
            requestBody += "<ItemIds>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<ItemId>)o).get(i).a();
            }
            requestBody += "</ItemIds>";
            final String string;
            requestBody = (string = requestBody + "</ArchiveItem>");
            itemInfoResponseList = d((InputStream)(this.a(string, true)), "ArchiveItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (itemInfoResponseList.size() == 1 && (itemInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((itemInfoResponseList.get(0)).getResponseCode()), (itemInfoResponseList.get(0)).getMessage(), (itemInfoResponseList.get(0)).getXmlMessage(), requestBody, (itemInfoResponseList.get(0)).getServerVersionInfo());
        }
        return itemInfoResponseList;
    }
    
    public ItemInfoResponse moveItem(final ItemId itemId, final StandardFolder standardFolder) throws ServiceException {
        return this.moveItem(itemId, new StandardFolderId(standardFolder));
    }
    
    public ItemInfoResponse moveItem(final ItemId itemId, final FolderId targetFolderId) throws ServiceException {
        final ArrayList<ItemId> items;
        (items = new ArrayList<ItemId>()).add(itemId);
        return this.moveItem(items, targetFolderId).get(0);
    }
    
    public List<ItemInfoResponse> moveItem(final List<ItemId> items, final StandardFolder standardFolder) throws ServiceException {
        return this.moveItem(items, new StandardFolderId(standardFolder));
    }
    
    public List<ItemInfoResponse> moveItem(final List<ItemId> items, final FolderId targetFolderId) throws ServiceException {
        return this.e(items, targetFolderId);
    }
    
    private List<ItemInfoResponse> e(List<ItemId> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        try {
            requestBody = "<MoveItem xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ToFolderId>" + folderId.a() + "</ToFolderId>";
            requestBody += "<ItemIds>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<ItemId>)o).get(i).a();
            }
            requestBody += "</ItemIds>";
            final String string;
            requestBody = (string = requestBody + "</MoveItem>");
            itemInfoResponseList = d((InputStream)(this.a(string, true)), "MoveItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((itemInfoResponseList).size() == 1 && ((itemInfoResponseList).get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((itemInfoResponseList).get(0)).getResponseCode()), ((itemInfoResponseList).get(0)).getMessage(), ((itemInfoResponseList).get(0)).getXmlMessage(), requestBody, ((itemInfoResponseList).get(0)).getServerVersionInfo());
        }
        return itemInfoResponseList;
    }
    
    public ItemInfoResponse copyItem(final ItemId itemId, final StandardFolder standardFolder) throws ServiceException {
        return this.copyItem(itemId, new StandardFolderId(standardFolder));
    }
    
    public ItemInfoResponse copyItem(final ItemId itemId, final FolderId targetFolderId) throws ServiceException {
        final ArrayList<ItemId> items;
        (items = new ArrayList<ItemId>()).add(itemId);
        return this.copyItem(items, targetFolderId).get(0);
    }
    
    public List<ItemInfoResponse> copyItem(final List<ItemId> items, final StandardFolder standardFolder) throws ServiceException {
        return this.copyItem(items, new StandardFolderId(standardFolder));
    }
    
    public List<ItemInfoResponse> copyItem(final List<ItemId> items, final FolderId targetFolderId) throws ServiceException {
        return this.f(items, targetFolderId);
    }
    
    private List<ItemInfoResponse> f(List<ItemId> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        try {
            requestBody = "<CopyItem xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ToFolderId>" + folderId.a() + "</ToFolderId>";
            requestBody += "<ItemIds>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<ItemId>)o).get(i).a();
            }
            requestBody += "</ItemIds>";
            final String string;
            requestBody = (string = requestBody + "</CopyItem>");
            itemInfoResponseList = d((InputStream)(this.a(string, true)), "CopyItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (itemInfoResponseList.size() == 1 && (itemInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((itemInfoResponseList.get(0)).getResponseCode()), (itemInfoResponseList.get(0)).getMessage(), (itemInfoResponseList.get(0)).getXmlMessage(), requestBody, (itemInfoResponseList.get(0)).getServerVersionInfo());
        }
        return itemInfoResponseList;
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet));
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final ConflictResolution conflictResolution) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), conflictResolution);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), conflictResolution, messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), conflictResolution, sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), conflictResolution, messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final Property propertyToSet, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToSet), conflictResolution, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete));
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final ConflictResolution conflictResolution) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), conflictResolution);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), conflictResolution, messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), conflictResolution, sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), conflictResolution, messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final PropertyPath propertyToDelete, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertyToDelete), conflictResolution, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet));
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final ConflictResolution conflictResolution) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), conflictResolution);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), conflictResolution, messageDisposition);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), conflictResolution, sendMeetingOption);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), conflictResolution, messageDisposition, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet), conflictResolution, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemId itemId, final List<Property> propertiesToSet, final List<PropertyPath> propertiesToDelete, final List<Property> propertiesToAppend, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(new ItemChange(itemId, propertiesToSet, propertiesToDelete, propertiesToAppend), conflictResolution, messageDisposition, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemChange itemChange) throws ServiceException {
        return this.updateItem(itemChange, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution) throws ServiceException {
        return this.updateItem(itemChange, conflictResolution, MessageDisposition.SAVE_ONLY, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(itemChange, ConflictResolution.AUTO_RESOLVE, messageDisposition, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(itemChange, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, sendMeetingOption, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChange, ConflictResolution.AUTO_RESOLVE, messageDisposition, SendMeetingOption.SEND_TO_NONE, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChange, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(itemChange, conflictResolution, messageDisposition, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(itemChange, conflictResolution, MessageDisposition.SAVE_ONLY, sendMeetingOption, null);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChange, conflictResolution, messageDisposition, SendMeetingOption.SEND_TO_NONE, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChange, conflictResolution, MessageDisposition.SAVE_ONLY, sendMeetingOption, sentItemsFolderId);
    }
    
    public ItemId updateItem(final ItemChange itemChange, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        final ArrayList<ItemChange> itemChanges;
        (itemChanges = new ArrayList<ItemChange>()).add(itemChange);
        return this.updateItem(itemChanges, conflictResolution, messageDisposition, sendMeetingOption, sentItemsFolderId).get(0).getItems().get(0).getItemId();
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges) throws ServiceException {
        return this.updateItem(itemChanges, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution) throws ServiceException {
        return this.updateItem(itemChanges, conflictResolution, MessageDisposition.SAVE_ONLY, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(itemChanges, ConflictResolution.AUTO_RESOLVE, messageDisposition, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(itemChanges, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, sendMeetingOption, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChanges, ConflictResolution.AUTO_RESOLVE, messageDisposition, SendMeetingOption.SEND_TO_NONE, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChanges, ConflictResolution.AUTO_RESOLVE, MessageDisposition.SAVE_ONLY, sendMeetingOption, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition) throws ServiceException {
        return this.updateItem(itemChanges, conflictResolution, messageDisposition, SendMeetingOption.SEND_TO_NONE, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption) throws ServiceException {
        return this.updateItem(itemChanges, conflictResolution, MessageDisposition.SAVE_ONLY, sendMeetingOption, null);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChanges, conflictResolution, messageDisposition, SendMeetingOption.SEND_TO_NONE, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.updateItem(itemChanges, conflictResolution, MessageDisposition.SAVE_ONLY, sendMeetingOption, sentItemsFolderId);
    }
    
    public List<ItemInfoResponse> updateItem(final List<ItemChange> itemChanges, final ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final SendMeetingOption sendMeetingOption, final FolderId sentItemsFolderId) throws ServiceException {
        return this.a(itemChanges, conflictResolution, messageDisposition, sendMeetingOption, sentItemsFolderId);
    }
    
    private List<ItemInfoResponse> a(List<ItemChange> o, ConflictResolution conflictResolution, final MessageDisposition messageDisposition, final SendMeetingOption sendMeetingOption, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<ItemInfoResponse> infoResponseList = new ArrayList<>();
        try {
            requestBody = "<UpdateItem" + (" ConflictResolution=\"" + (((conflictResolution = conflictResolution) == ConflictResolution.ALWAYS_OVERWRITE) ? "AlwaysOverwrite" : ((conflictResolution == ConflictResolution.NEVER_OVERWRITE) ? "NeverOverwrite" : "AutoResolve")) + "\"" + " MessageDisposition=\"" + com.ews.exchange.a.a(messageDisposition) + "\"" + " SendMeetingInvitationsOrCancellations=\"" + ((sendMeetingOption == SendMeetingOption.SEND_TO_ALL) ? "SendOnlyToAll" : ((sendMeetingOption == SendMeetingOption.SEND_TO_CHANGED) ? "SendOnlyToChanged" : ((sendMeetingOption == SendMeetingOption.SEND_TO_ALL_AND_SAVE_COPY) ? "SendToAllAndSaveCopy" : ((sendMeetingOption == SendMeetingOption.SEND_TO_CHANGED_AND_SAVE_COPY) ? "SendToChangedAndSaveCopy" : "SendToNone")))) + "\"") + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (folderId != null) {
                requestBody = requestBody + "<SavedItemFolderId>" + folderId.a() + "</SavedItemFolderId>";
            }
            if (((List)o).size() > 0) {
                requestBody += "<ItemChanges>";
                for (int i = 0; i < ((List)o).size(); ++i) {
                    requestBody += ((List<ItemChange>)o).get(i).toString();
                }
                requestBody += "</ItemChanges>";
            }
            final String string;
            requestBody = (string = requestBody + "</UpdateItem>");
            infoResponseList = d((InputStream)(this.a(string, true)), "UpdateItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (infoResponseList.size() == 1 && (infoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((infoResponseList.get(0)).getResponseCode()), (infoResponseList.get(0)).getMessage(), (infoResponseList.get(0)).getXmlMessage(), requestBody, (infoResponseList.get(0)).getServerVersionInfo());
        }
        return infoResponseList;
    }
    
    public AttachmentId createAttachment(final Attachment attachment, final String itemId) throws ServiceException {
        return this.createAttachment(attachment, new ItemId(itemId));
    }
    
    public AttachmentId createAttachment(final Attachment attachment, final ItemId itemId) throws ServiceException {
        final ArrayList<Attachment> attachments;
        (attachments = new ArrayList<Attachment>()).add(attachment);
        return this.createAttachment(attachments, itemId).get(0).getAttachment().getAttachmentId();
    }
    
    public List<CreateAttachmentResponse> createAttachment(final List<Attachment> attachments, final String itemId) throws ServiceException {
        return this.createAttachment(attachments, new ItemId(itemId));
    }
    
    public List<CreateAttachmentResponse> createAttachment(final List<Attachment> attachments, final ItemId itemId) throws ServiceException {
        return this.a(attachments, itemId);
    }
    
    private List<CreateAttachmentResponse> a(List<Attachment> o, final ItemId itemId) throws ServiceException {
        String requestBody = null;List<CreateAttachmentResponse> createAttachmentResponseList = new ArrayList<>();
        try {
            requestBody = "<CreateAttachment xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += itemId.a("ParentItemId");
            requestBody += "<Attachments>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<Attachment>)o).get(i).a();
            }
            requestBody += "</Attachments>";
            final String string;
            requestBody = (string = requestBody + "</CreateAttachment>");
            createAttachmentResponseList = i((InputStream)(this.a(string, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (createAttachmentResponseList.size() == 1 && (createAttachmentResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((createAttachmentResponseList.get(0)).getResponseCode()), (createAttachmentResponseList.get(0)).getMessage(), (createAttachmentResponseList.get(0)).getXmlMessage(), requestBody, (createAttachmentResponseList.get(0)).getServerVersionInfo());
        }
        return createAttachmentResponseList;
    }
    
    public ItemId deleteAttachment(final AttachmentInfo attachmentInfo) throws ServiceException {
        if (attachmentInfo == null) {
            throw new IllegalArgumentException("attachmentInfo is null.");
        }
        final ArrayList<String> attachmentIds;
        (attachmentIds = new ArrayList<String>()).add(attachmentInfo.getId());
        return this.deleteAttachment(attachmentIds);
    }
    
    public ItemId deleteAttachment(final String attachmentId) throws ServiceException {
        final ArrayList<String> attachmentIds;
        (attachmentIds = new ArrayList<String>()).add(attachmentId);
        return this.deleteAttachment(attachmentIds);
    }
    
    public ItemId deleteAttachment(final List<String> attachmentIds) throws ServiceException {
        return this.b(attachmentIds);
    }
    
    private ItemId b(List<String> a) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("attachmentIds is null.");
        }
        String requestBody = null;DeleteAttachmentResponse deleteAttachmentResponse = null;
        try {
            requestBody = "<DeleteAttachment xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<AttachmentIds>";
            for (int i = 0; i < ((List)a).size(); ++i) {
                requestBody = requestBody + "<t:AttachmentId Id=\"" + com.ews.exchange.d.a(((List<String>)a).get(i)) + "\"/>";
            }
            requestBody += "</AttachmentIds>";
            final String string;
            requestBody = (string = requestBody + "</DeleteAttachment>");
            deleteAttachmentResponse = new DeleteAttachmentResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (deleteAttachmentResponse.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((deleteAttachmentResponse).getResponseCode()), (deleteAttachmentResponse).getMessage(), (deleteAttachmentResponse).getXmlMessage(), requestBody, (deleteAttachmentResponse).getServerVersionInfo());
        }
        return ((DeleteAttachmentResponse)a).getItemId();
    }
    
    public Attachment getAttachment(final AttachmentInfo attachmentInfo) throws ServiceException {
        return this.getAttachment(attachmentInfo, null);
    }
    
    public Attachment getAttachment(final AttachmentInfo attachmentInfo, final AttachmentShape attachmentShape) throws ServiceException {
        if (attachmentInfo == null) {
            throw new IllegalArgumentException("attachmentInfo is null.");
        }
        final ArrayList<String> attachmentIds;
        (attachmentIds = new ArrayList<String>()).add(attachmentInfo.getId());
        return this.getAttachments(attachmentIds, attachmentShape).get(0);
    }
    
    public Attachment getAttachment(final String attachmentId) throws ServiceException {
        return this.getAttachment(attachmentId, null);
    }
    
    public Attachment getAttachment(final String attachmentId, final AttachmentShape attachmentShape) throws ServiceException {
        final ArrayList<String> attachmentIds;
        (attachmentIds = new ArrayList<String>()).add(attachmentId);
        return this.getAttachments(attachmentIds, attachmentShape).get(0);
    }
    
    public List<Attachment> getAttachments(final List<String> attachmentIds) throws ServiceException {
        return this.getAttachments(attachmentIds, null);
    }
    
    public List<Attachment> getAttachments(final List<String> attachmentIds, final AttachmentShape attachmentShape) throws ServiceException {
        return this.a(attachmentIds, attachmentShape);
    }
    
    private List<Attachment> a(List<String> a, final AttachmentShape attachmentShape) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("attachmentIds is null.");
        }
        GetAttachmentResponse response = null;
        String requestBody = null;
        try {
            requestBody = "<GetAttachment xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (attachmentShape != null) {
                requestBody += attachmentShape.toString();
            }
            requestBody += "<AttachmentIds>";
            for (int i = 0; i < ((List)a).size(); ++i) {
                requestBody = requestBody + "<t:AttachmentId Id=\"" + com.ews.exchange.d.a(((List<String>)a).get(i)) + "\"/>";
            }
            requestBody += "</AttachmentIds>";
            final String string;
            requestBody = (string = requestBody + "</GetAttachment>");
            response = new GetAttachmentResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(response.getResponseCode()), response.getMessage(), response.getXmlMessage(), requestBody, response.getServerVersionInfo());
        }
        return ((GetAttachmentResponse)a).getAttachments();
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, propertyPaths, null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(new StandardFolderId(standardFolder), propertyPaths, restriction, view, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final Restriction restriction) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(new StandardFolderId(standardFolder), new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final Restriction restriction) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(standardFolder, folderShape, null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final StandardFolder standardFolder, final FolderShape folderShape, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(new StandardFolderId(standardFolder), folderShape, restriction, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, propertyPaths, null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(propertyPaths), restriction, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, null, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, restriction, null, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolderId, folderShape, null, view, traversal);
    }
    
    public FindFolderResponse findFolder(final FolderId parentFolderId, final FolderShape folderShape, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        final ArrayList<FolderId> parentFolders;
        (parentFolders = new ArrayList<FolderId>()).add(parentFolderId);
        return this.findFolder(parentFolders, folderShape, restriction, view, traversal).get(0);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, null, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, restriction, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, propertyPaths, null, view, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(propertyPaths), restriction, view, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), null, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), null, view, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, new FolderShape(ShapeType.ALL_PROPERTIES), restriction, view, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, null, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final Restriction restriction) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, restriction, null, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, null, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, null, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final Restriction restriction, final PageView view) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, restriction, view, FolderQueryTraversal.SHALLOW);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final Restriction restriction, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, restriction, null, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.findFolder(parentFolders, folderShape, null, view, traversal);
    }
    
    public List<FindFolderResponse> findFolder(final List<FolderId> parentFolders, final FolderShape folderShape, final Restriction restriction, final PageView view, final FolderQueryTraversal traversal) throws ServiceException {
        return this.a(parentFolders, folderShape, restriction, view, traversal);
    }
    
    private List<FindFolderResponse> a(List<FolderId> var1, FolderShape var2, Restriction var3, PageView var4, FolderQueryTraversal var5) throws ServiceException {
        String var6 = null;
        List<FindFolderResponse> findFolderResponseList = new ArrayList<>();
        if (var1 == null) {
            throw new IllegalArgumentException("parentFolders is null");
        } else if (var1.size() == 0) {
            throw new IllegalArgumentException("ParentFolders is not specified.");
        } else {
            if (var2 == null) {
                var2 = new FolderShape(ShapeType.ALL_PROPERTIES);
            }

            String var7;
            try {
                var7 = j(var1);
                var6 = "<FindFolder Traversal=\"" + (var5 == FolderQueryTraversal.DEEP ? "Deep" : (var5 == FolderQueryTraversal.SOFT_DELETED ? "SoftDeleted" : "Shallow")) + "\" xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var2 != null) {
                    this.a(var2);
                    b(var2);
                    var6 = var6 + var2.toString();
                }

                if (var4 != null) {
                    if (var4 instanceof IndexedPageView) {
                        var6 = var6 + var4.a("IndexedPageFolderView");
                    } else if (var4 instanceof FractionalPageView) {
                        var6 = var6 + var4.a("FractionalPageFolderView");
                    }
                }

                if (var3 != null) {
                    var6 = var6 + "<Restriction>";
                    var6 = var6 + var3.toString();
                    var6 = var6 + "</Restriction>";
                }

                var6 = var6 + var7;
                var6 = var6 + "</FindFolder>";
                findFolderResponseList = d(this.a(var6, true));
            } catch (Exception var13) {
                throw new ServiceException(var13.getMessage(), var13, var6);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var12) {
                    throw new ServiceException(var12.getMessage(), var12, var6);
                }

            }

            if (findFolderResponseList.size() == 1 && (findFolderResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
                var7 = com.ews.exchange.a.a((findFolderResponseList.get(0)).getResponseCode());
                String var16 = (findFolderResponseList.get(0)).getMessage();
                String var17 = (findFolderResponseList.get(0)).getXmlMessage();
                ServerVersionInfo var15 = (findFolderResponseList.get(0)).getServerVersionInfo();
                throw new ServiceException(var7, var16, var17, var6, var15);
            } else {
                return findFolderResponseList;
            }
        }
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), propertyPaths, restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), propertyPaths, restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(standardFolder, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), itemShape, restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final StandardFolder standardFolder, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(new StandardFolderId(standardFolder), itemShape, restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(propertyPaths), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(propertyPaths), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolderId, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        final ArrayList<FolderId> parentFolders;
        (parentFolders = new ArrayList<FolderId>()).add(parentFolderId);
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, traversal).get(0);
    }
    
    public FindItemResponse findItem(final FolderId parentFolderId, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        final ArrayList<FolderId> parentFolders;
        (parentFolders = new ArrayList<FolderId>()).add(parentFolderId);
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, traversal).get(0);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, propertyPaths, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(propertyPaths), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final List<PropertyPath> propertyPaths, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(propertyPaths), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, new ItemShape(ShapeType.ALL_PROPERTIES), restriction, groupBy, propertyOrder, view, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, (List<PropertyOrder>)null, null, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, (List<PropertyOrder>)null, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, null, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, (List<PropertyOrder>)null, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, null, null, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, null, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, ItemQueryTraversal.SHALLOW);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final PropertyOrder propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        final ArrayList<PropertyOrder> propertyOrder2 = new ArrayList<PropertyOrder>();
        if (propertyOrder != null) {
            propertyOrder2.add(propertyOrder);
        }
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder2, view, traversal);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal) throws ServiceException {
        return this.findItem(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, traversal, null);
    }
    
    public List<FindItemResponse> findItem(final List<FolderId> parentFolders, final ItemShape itemShape, final Restriction restriction, final IGroupBy groupBy, final List<PropertyOrder> propertyOrder, final View view, final ItemQueryTraversal traversal, final QueryString queryString) throws ServiceException {
        return this.a(parentFolders, itemShape, restriction, groupBy, propertyOrder, view, traversal, queryString);
    }
    
    private List<FindItemResponse> a(List<FolderId> var1, ItemShape var2, Restriction var3, IGroupBy var4, List<PropertyOrder> var5, View var6, ItemQueryTraversal var7, QueryString var8) throws ServiceException {
        String var9 = null;
        List<FindItemResponse> findItemResponseList = new ArrayList<>();
        if (var1 == null) {
            throw new IllegalArgumentException("parentFolders is null.");
        } else if (var1.size() == 0) {
            throw new IllegalArgumentException("ParentFolders is not specified.");
        } else {
            if (var2 == null) {
                var2 = new ItemShape(ShapeType.ALL_PROPERTIES);
            }

            String var10;
            try {
                var10 = j(var1);
                var9 = "<FindItem Traversal=\"" + (var7 == ItemQueryTraversal.SOFT_DELETED ? "SoftDeleted" : (var7 == ItemQueryTraversal.SHALLOW ? "Shallow" : "Associated")) + "\" xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var2 != null) {
                    this.k(var2.getPropertyPaths());
                    var9 = var9 + var2.toString();
                }

                if (var6 != null) {
                    if (var6 instanceof IndexedPageView) {
                        var9 = var9 + var6.a("IndexedPageItemView");
                    } else if (var6 instanceof FractionalPageView) {
                        var9 = var9 + var6.a("FractionalPageItemView");
                    } else if (var6 instanceof CalendarView) {
                        var9 = var9 + var6.a("CalendarView");
                    } else if (var6 instanceof ContactsView) {
                        var9 = var9 + var6.a("ContactsView");
                    } else if (var6 instanceof SeekToConditionPageItemView) {
                        var9 = var9 + var6.a("SeekToConditionPageItemView");
                    }
                }

                if (var4 != null) {
                    var9 = var9 + var4.toString();
                }

                if (var3 != null) {
                    var9 = var9 + "<Restriction>";
                    var9 = var9 + var3.toString();
                    var9 = var9 + "</Restriction>";
                }

                if (var5 != null && var5.size() > 0) {
                    var9 = var9 + "<SortOrder>";

                    for(int var21 = 0; var21 < var5.size(); ++var21) {
                        var9 = var9 + ((PropertyOrder)var5.get(var21)).toString();
                    }

                    var9 = var9 + "</SortOrder>";
                }

                var9 = var9 + var10;
                if (var8 != null) {
                    var9 = var9 + var8.a();
                }

                var9 = var9 + "</FindItem>";
                findItemResponseList = h(this.a(var9, true));
            } catch (ServiceException var17) {
                throw var17;
            } catch (Exception var18) {
                throw new ServiceException(var18.getMessage(), var18, var9);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var16) {
                    throw new ServiceException(var16.getMessage(), var16, var9);
                }

            }

            if (findItemResponseList.size() == 1 && (findItemResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
                var10 = com.ews.exchange.a.a((findItemResponseList.get(0)).getResponseCode());
                String var23 = (findItemResponseList.get(0)).getMessage();
                String var22 = (findItemResponseList.get(0)).getXmlMessage();
                ServerVersionInfo var20 = (findItemResponseList.get(0)).getServerVersionInfo();
                throw new ServiceException(var10, var23, var22, var9, var20);
            } else {
                return findItemResponseList;
            }
        }
    }
    
    public List<FolderInfoResponse> createFolderPath(final List<Folder> folders, final StandardFolder standardFolder) throws ServiceException {
        return this.g(folders, new StandardFolderId(standardFolder));
    }
    
    public List<FolderInfoResponse> createFolderPath(final List<Folder> folders, final FolderId parentFolderId) throws ServiceException {
        return this.g(folders, parentFolderId);
    }
    
    private List<FolderInfoResponse> g(List<Folder> o, final FolderId folderId) throws ServiceException {
        String requestBody = null;List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            requestBody = "<CreateFolderPath xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ParentFolderId>" + folderId.a() + "</ParentFolderId>";
            requestBody += "<RelativeFolderPath>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<Folder>)o).get(i).a();
            }
            requestBody += "</RelativeFolderPath>";
            final String string;
            requestBody = (string = requestBody + "</CreateFolderPath>");
            folderInfoResponseList = b((InputStream)(this.a(string, true)), "CreateFolderPathResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (folderInfoResponseList.size() == 1 && (folderInfoResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((folderInfoResponseList.get(0)).getResponseCode()), (folderInfoResponseList.get(0)).getMessage(), (folderInfoResponseList.get(0)).getXmlMessage(), requestBody, (folderInfoResponseList.get(0)).getServerVersionInfo());
        }
        return folderInfoResponseList;
    }
    
    public Persona getPersona(final ItemId personaId) throws ServiceException {
        return this.a(personaId);
    }
    
    private Persona a(ItemId itemId) throws ServiceException {
        String string = null;PersonaInfoResponse response = null;
        if (itemId == null) {
            throw new IllegalArgumentException("personaId is null.");
        }
        try {
            string = "<GetPersona xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string += itemId.a("PersonaId");
            final String string2;
            string = (string2 = string + "</GetPersona>");
            response = e((InputStream)(this.a(string2, true)), "GetPersonaResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(response.getResponseCode()), response.getMessage(), response.getXmlMessage(), string, response.getServerVersionInfo());
        }
        return response.getPersona();
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, null, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, null, view, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final String query) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, propertyOrder, null, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final String query) throws ServiceException {
        return this.findPeople(new StandardFolderId(standardFolder), null, null, null, null, null, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, null, null, null, null, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(new StandardFolderId(standardFolder), null, null, null, null, view, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(standardFolder, null, null, null, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, null, null, null, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(new StandardFolderId(standardFolder), null, null, null, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final Restriction restriction) throws ServiceException {
        return this.findPeople(standardFolder, null, restriction, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final Restriction restriction, final Restriction aggregationRestriction) throws ServiceException {
        return this.findPeople(standardFolder, null, restriction, aggregationRestriction, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(standardFolder, null, restriction, aggregationRestriction, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, null, restriction, aggregationRestriction, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(new StandardFolderId(standardFolder), null, restriction, aggregationRestriction, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder) throws ServiceException {
        return this.findPeople(standardFolder, null, null, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape) throws ServiceException {
        return this.findPeople(standardFolder, shape, null, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final Restriction restriction) throws ServiceException {
        return this.findPeople(standardFolder, shape, restriction, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction) throws ServiceException {
        return this.findPeople(standardFolder, shape, restriction, aggregationRestriction, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(standardFolder, shape, restriction, aggregationRestriction, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(standardFolder, shape, restriction, aggregationRestriction, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final StandardFolder standardFolder, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(new StandardFolderId(standardFolder), shape, restriction, aggregationRestriction, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, null, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, null, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final List<PropertyOrder> propertyOrder, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, propertyOrder, null, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, null, null, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, null, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, null, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final Restriction restriction) throws ServiceException {
        return this.findPeople(parentFolderId, null, restriction, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final Restriction restriction, final Restriction aggregationRestriction) throws ServiceException {
        return this.findPeople(parentFolderId, null, restriction, aggregationRestriction, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(parentFolderId, null, restriction, aggregationRestriction, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, null, restriction, aggregationRestriction, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.findPeople(parentFolderId, null, restriction, aggregationRestriction, propertyOrder, view, query);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId) throws ServiceException {
        return this.findPeople(parentFolderId, null, null, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape) throws ServiceException {
        return this.findPeople(parentFolderId, shape, null, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final Restriction restriction) throws ServiceException {
        return this.findPeople(parentFolderId, shape, restriction, null, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction) throws ServiceException {
        return this.findPeople(parentFolderId, shape, restriction, aggregationRestriction, null, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findPeople(parentFolderId, shape, restriction, aggregationRestriction, propertyOrder, null, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view) throws ServiceException {
        return this.findPeople(parentFolderId, shape, restriction, aggregationRestriction, propertyOrder, view, null);
    }
    
    public FindPeopleResponse findPeople(final FolderId parentFolderId, final PersonaShape shape, final Restriction restriction, final Restriction aggregationRestriction, final List<PropertyOrder> propertyOrder, final IndexedPageView view, final String query) throws ServiceException {
        return this.a(parentFolderId, shape, restriction, aggregationRestriction, propertyOrder, view, query);
    }
    
    private FindPeopleResponse a(FolderId folderId, final PersonaShape personaShape, final Restriction restriction, final Restriction restriction2, final List<PropertyOrder> list, IndexedPageView indexedPageView, final String s) throws ServiceException {
        String requestBody = null;
        if (folderId == null) {
            throw new IllegalArgumentException("parentFolderId is null.");
        }
        FindPeopleResponse response = null;
        Label_0038: {
            if (indexedPageView != null) {
                break Label_0038;
            }
            indexedPageView = new IndexedPageView(0, IndexBasePoint.BEGINNING, 100);
            try {
                requestBody = "<FindPeople xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (personaShape != null) {
                    requestBody += personaShape.toString();
                }
                requestBody += indexedPageView.a("IndexedPageItemView");
                if (restriction != null) {
                    requestBody = requestBody + "<Restriction>" + restriction.toString() + "</Restriction>";
                }
                if (restriction2 != null) {
                    requestBody = requestBody + "<AggregationRestriction>" + restriction2.toString() + "</AggregationRestriction>";
                }
                if (list != null && list.size() > 0) {
                    requestBody += "<SortOrder>";
                    for (int i = 0; i < list.size(); ++i) {
                        requestBody += list.get(i).toString();
                    }
                    requestBody += "</SortOrder>";
                }
                if (folderId != null) {
                    requestBody = requestBody + "<ParentFolderId>" + folderId.a() + "</ParentFolderId>";
                }
                if (s != null) {
                    requestBody = requestBody + "<QueryString>" + com.ews.exchange.d.a(s) + "</QueryString>";
                }
                final String string;
                requestBody = (string = requestBody + "</FindPeople>");
                response = g((InputStream)(this.a(string, true)));
            }
            catch (ServiceException ex) {
                throw ex;
            }
            catch (Exception cause) {
                throw new ServiceException(cause.getMessage(), cause, requestBody);
            }
            finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }
                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                }
                catch (IOException cause2) {
                    throw new ServiceException(cause2.getMessage(), cause2, requestBody);
                }
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public DelegateUserResponse addDelegate(final Mailbox mailbox, final DelegateUser delegateUser) throws ServiceException {
        return this.addDelegate(mailbox, delegateUser, DeliverMeetingRequests.NONE);
    }
    
    public DelegateUserResponse addDelegate(final Mailbox mailbox, final DelegateUser delegateUser, final DeliverMeetingRequests deliverMeetingRequests) throws ServiceException {
        final ArrayList<DelegateUser> delegateUsers;
        (delegateUsers = new ArrayList<DelegateUser>()).add(delegateUser);
        return this.addDelegate(mailbox, delegateUsers, deliverMeetingRequests).getDelegateUserResponses().get(0);
    }
    
    public DelegateResponse addDelegate(final Mailbox mailbox, final List<DelegateUser> delegateUsers) throws ServiceException {
        return this.addDelegate(mailbox, delegateUsers, DeliverMeetingRequests.NONE);
    }
    
    public DelegateResponse addDelegate(final Mailbox mailbox, final List<DelegateUser> delegateUsers, final DeliverMeetingRequests deliverMeetingRequests) throws ServiceException {
        return this.a(mailbox, delegateUsers, deliverMeetingRequests);
    }
    
    private DelegateResponse a(Mailbox var1, List<DelegateUser> var2, DeliverMeetingRequests var3) throws ServiceException {
        if (var1 == null) {
            throw new IllegalArgumentException("mailbox is null");
        } else if (var2 == null) {
            throw new IllegalArgumentException("delegateUsers is null");
        } else {
            String var4 = null;

            DelegateResponse var16;
            try {
                var4 = "<AddDelegate xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var1 != null) {
                    var4 = var4 + var1.a("Mailbox");
                }

                var4 = var4 + "<DelegateUsers>";

                for(int var5 = 0; var5 < var2.size(); ++var5) {
                    var4 = var4 + ((DelegateUser)var2.get(var5)).a();
                }

                var4 = var4 + "</DelegateUsers>";
                if (var3 != DeliverMeetingRequests.NONE) {
                    var4 = var4 + "<DeliverMeetingRequests>" + com.ews.exchange.a.a(var3) + "</DeliverMeetingRequests>";
                }

                var4 = var4 + "</AddDelegate>";
                InputStream var15 = this.a(var4, true);
                var16 = new DelegateResponse(var15, "AddDelegateResponse");
            } catch (ServiceException var12) {
                throw var12;
            } catch (Exception var13) {
                throw new ServiceException(var13.getMessage(), var13, var4);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var11) {
                    throw new ServiceException(var11.getMessage(), var11, var4);
                }

            }

            ServerVersionInfo var17;
            String var18;
            String var19;
            String var20;
            if (var16.getResponseClass() == ResponseClass.ERROR) {
                var20 = com.ews.exchange.a.a(var16.getResponseCode());
                var18 = var16.getMessage();
                var19 = var16.getXmlMessage();
                var17 = var16.getServerVersionInfo();
                throw new ServiceException(var20, var18, var19, var4, var17);
            } else if (var16.getDelegateUserResponses().size() == 1 && ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getResponseClass() == ResponseClass.ERROR) {
                var20 = com.ews.exchange.a.a(((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getResponseCode());
                var18 = ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getMessage();
                var19 = ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getXmlMessage();
                var17 = var16.getServerVersionInfo();
                throw new ServiceException(var20, var18, var19, var4, var17);
            } else {
                return var16;
            }
        }
    }
    
    public DelegateUserResponse updateDelegate(final Mailbox mailbox, final DelegateUser delegateUser) throws ServiceException {
        return this.updateDelegate(mailbox, delegateUser, DeliverMeetingRequests.NONE);
    }
    
    public DelegateUserResponse updateDelegate(final Mailbox mailbox, final DelegateUser delegateUser, final DeliverMeetingRequests deliverMeetingRequests) throws ServiceException {
        final ArrayList<DelegateUser> delegateUsers;
        (delegateUsers = new ArrayList<DelegateUser>()).add(delegateUser);
        return this.updateDelegate(mailbox, delegateUsers, deliverMeetingRequests).getDelegateUserResponses().get(0);
    }
    
    public DelegateResponse updateDelegate(final Mailbox mailbox, final List<DelegateUser> delegateUsers) throws ServiceException {
        return this.updateDelegate(mailbox, delegateUsers, DeliverMeetingRequests.NONE);
    }
    
    public DelegateResponse updateDelegate(final Mailbox mailbox, final List<DelegateUser> delegateUsers, final DeliverMeetingRequests deliverMeetingRequests) throws ServiceException {
        return this.b(mailbox, delegateUsers, deliverMeetingRequests);
    }
    
    private DelegateResponse b(Mailbox var1, final List<DelegateUser> var2, final DeliverMeetingRequests var3) throws ServiceException {
        if (var1 == null) {
            throw new IllegalArgumentException("mailbox is null");
        } else if (var2 == null) {
            throw new IllegalArgumentException("delegateUsers is null");
        } else {
            String var4 = null;

            DelegateResponse var16;
            try {
                var4 = "<UpdateDelegate xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var1 != null) {
                    var4 = var4 + var1.a("Mailbox");
                }

                var4 = var4 + "<DelegateUsers>";

                for(int var5 = 0; var5 < var2.size(); ++var5) {
                    var4 = var4 + ((DelegateUser)var2.get(var5)).a();
                }

                var4 = var4 + "</DelegateUsers>";
                if (var3 != DeliverMeetingRequests.NONE) {
                    var4 = var4 + "<DeliverMeetingRequests>" + com.ews.exchange.a.a(var3) + "</DeliverMeetingRequests>";
                }

                var4 = var4 + "</UpdateDelegate>";
                InputStream var15 = this.a(var4, true);
                var16 = new DelegateResponse(var15, "UpdateDelegateResponse");
            } catch (ServiceException var12) {
                throw var12;
            } catch (Exception var13) {
                throw new ServiceException(var13.getMessage(), var13, var4);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var11) {
                    throw new ServiceException(var11.getMessage(), var11, var4);
                }

            }

            ServerVersionInfo var17;
            String var18;
            String var19;
            String var20;
            if (var16.getResponseClass() == ResponseClass.ERROR) {
                var20 = com.ews.exchange.a.a(var16.getResponseCode());
                var18 = var16.getMessage();
                var19 = var16.getXmlMessage();
                var17 = var16.getServerVersionInfo();
                throw new ServiceException(var20, var18, var19, var4, var17);
            } else if (var16.getDelegateUserResponses().size() == 1 && ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getResponseClass() == ResponseClass.ERROR) {
                var20 = com.ews.exchange.a.a(((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getResponseCode());
                var18 = ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getMessage();
                var19 = ((DelegateUserResponse)var16.getDelegateUserResponses().get(0)).getXmlMessage();
                var17 = var16.getServerVersionInfo();
                throw new ServiceException(var20, var18, var19, var4, var17);
            } else {
                return var16;
            }
        }
    }
    
    public DelegateUserResponse removeDelegate(final Mailbox mailbox, final UserId userId) throws ServiceException {
        final ArrayList<UserId> users;
        (users = new ArrayList<UserId>()).add(userId);
        return this.removeDelegate(mailbox, users).getDelegateUserResponses().get(0);
    }
    
    public DelegateResponse removeDelegate(final Mailbox mailbox, final List<UserId> users) throws ServiceException {
        return this.a(mailbox, users);
    }
    
    private DelegateResponse a(Mailbox a, final List<UserId> list) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("mailbox is null");
        }
        if (list == null) {
            throw new IllegalArgumentException("users is null");
        }
        String s = null;DelegateResponse response = null;
        try {
            s = "<RemoveDelegate xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                s += a.a("Mailbox");
            }
            s += "<UserIds>";
            for (int i = 0; i < list.size(); ++i) {
                s += list.get(i).a();
            }
            s += "</UserIds>";
            final String string;
            s = (string = s + "</RemoveDelegate>");
            response = new DelegateResponse(this.a(string, true), "RemoveDelegateResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, s);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, s);
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), s, (response).getServerVersionInfo());
        }
        if ((response).getDelegateUserResponses().size() == 1 && (response).getDelegateUserResponses().get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getDelegateUserResponses().get(0).getResponseCode()), (response).getDelegateUserResponses().get(0).getMessage(), (response).getDelegateUserResponses().get(0).getXmlMessage(), s, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public DelegateUserResponse getDelegate(final Mailbox mailbox, final UserId userId) throws ServiceException {
        return this.getDelegate(mailbox, false, userId);
    }
    
    public DelegateUserResponse getDelegate(final Mailbox mailbox, final boolean includePermissions, final UserId userId) throws ServiceException {
        final ArrayList<UserId> users;
        (users = new ArrayList<UserId>()).add(userId);
        return this.getDelegate(mailbox, includePermissions, users).getDelegateUserResponses().get(0);
    }
    
    public DelegateResponse getDelegate(final Mailbox mailbox) throws ServiceException {
        return this.getDelegate(mailbox, false);
    }
    
    public DelegateResponse getDelegate(final Mailbox mailbox, final boolean includePermissions) throws ServiceException {
        return this.getDelegate(mailbox, includePermissions, new ArrayList<UserId>());
    }
    
    public DelegateResponse getDelegate(final Mailbox mailbox, final List<UserId> users) throws ServiceException {
        return this.getDelegate(mailbox, false, users);
    }
    
    public DelegateResponse getDelegate(final Mailbox mailbox, final boolean includePermissions, final List<UserId> users) throws ServiceException {
        return this.a(mailbox, includePermissions, users);
    }
    
    private DelegateResponse a(Mailbox a, final boolean b, final List<UserId> list) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("mailbox is null");
        }
        String s = null;DelegateResponse response = null;
        try {
            String s2 = "IncludePermissions=\"true\"";
            if (!b) {
                s2 = "IncludePermissions=\"false\"";
            }
            s = "<GetDelegate " + s2 + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                s += a.a("Mailbox");
            }
            if (list != null && list.size() > 0) {
                s += "<UserIds>";
                for (int i = 0; i < list.size(); ++i) {
                    s += list.get(i).a();
                }
                s += "</UserIds>";
            }
            final String string;
            s = (string = s + "</GetDelegate>");
            response = new DelegateResponse(this.a(string, true), "GetDelegateResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, s);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, s);
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), s, (response).getServerVersionInfo());
        }
        if ((response).getDelegateUserResponses().size() == 1 && (response).getDelegateUserResponses().get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getDelegateUserResponses().get(0).getResponseCode()), (response).getDelegateUserResponses().get(0).getMessage(), (response).getDelegateUserResponses().get(0).getXmlMessage(), s, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public SendNotificationResponse parseSendNotificationResponse(final byte[] buffer) throws XMLStreamException, ParseException {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer is null.");
        }
        SendNotificationResponse sendNotificationResponse = null;
        final Charset forName;
        final String string = (forName = Charset.forName("UTF-8")).decode(ByteBuffer.wrap(buffer)).toString();
        final ByteBuffer encode;
        final byte[] array = new byte[(encode = forName.encode(string.substring(string.indexOf("\r\n\r\n") + 4))).limit()];
        System.arraycopy(encode.array(), 0, array, 0, array.length);
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(new ByteArrayInputStream(array));
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SendNotificationResponseMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                sendNotificationResponse = new SendNotificationResponse(xmlStreamReader);
            }
        }
        return sendNotificationResponse;
    }
    
    public GetEventsResponse getEvents(final SubscribeResponse subscribeResponse) throws ServiceException {
        return this.getEvents(subscribeResponse.getSubscriptionId(), subscribeResponse.getWatermark());
    }
    
    public GetEventsResponse getEvents(final String subscriptionId, final String watermark) throws ServiceException {
        return this.b(subscriptionId, watermark);
    }
    
    private GetEventsResponse b(String a, String responseCode) throws ServiceException {
        String requestBody = null;GetEventsResponse response = null;
        try {
            requestBody = "<GetEvents xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<SubscriptionId>" + com.ews.exchange.d.a(a) + "</SubscriptionId>";
            requestBody = requestBody + "<Watermark>" + com.ews.exchange.d.a(responseCode) + "</Watermark>";
            requestBody = (responseCode = requestBody + "</GetEvents>");
            response = new GetEventsResponse(this.a(responseCode, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (response.getResponseClass() == ResponseClass.ERROR) {
            responseCode = com.ews.exchange.a.a((response).getResponseCode());
            throw new ServiceException(responseCode, (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public InputStream getStreamingEvents(final String subscriptionIds) throws ServiceException {
        return this.getStreamingEvents(subscriptionIds, 30);
    }
    
    public InputStream getStreamingEvents(final String subscriptionIds, final int connectionTimeout) throws ServiceException {
        final ArrayList<String> subscriptionIds2;
        (subscriptionIds2 = new ArrayList<String>()).add(subscriptionIds);
        return this.getStreamingEvents(subscriptionIds2, connectionTimeout);
    }
    
    public InputStream getStreamingEvents(final List<String> subscriptionIds) throws ServiceException {
        return this.getStreamingEvents(subscriptionIds, 30);
    }
    
    public InputStream getStreamingEvents(final List<String> subscriptionIds, final int connectionTimeout) throws ServiceException {
        return this.a(subscriptionIds, connectionTimeout);
    }
    
    private InputStream a(final List<String> list, int n) throws ServiceException {
        String requestBody = null;
        if (list == null) {
            throw new IllegalArgumentException("subscriptionIds is null.");
        }
        if (n <= 0 || n > 30) {
            n = 30;
        }
        InputStream a;
        try {
            requestBody = "<GetStreamingEvents xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<SubscriptionIds>";
            for (int i = 0; i < list.size(); ++i) {
                requestBody = requestBody + "<t:SubscriptionId>" + com.ews.exchange.d.a(list.get(i)) + "</t:SubscriptionId>";
            }
            requestBody += "</SubscriptionIds>";
            requestBody = requestBody + "<ConnectionTimeout>" + n + "</ConnectionTimeout>";
            requestBody += "</GetStreamingEvents>";
            a = this.a(requestBody, false);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        return a;
    }
    
    public Response unsubscribe(final String subscriptionId) throws ServiceException {
        return this.d(subscriptionId);
    }
    
    private Response d(String a) throws ServiceException {
        String string = null;Response response = null;
        try {
            string = "<Unsubscribe xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string = string + "<SubscriptionId>" + com.ews.exchange.d.a(a) + "</SubscriptionId>";
            final String string2;
            string = (string2 = string + "</Unsubscribe>");
            response = f((InputStream)(this.a(string2, true)), "UnsubscribeResponseMessage").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public SubscribeResponse subscribe(final Subscription subscription) throws ServiceException {
        return this.a(subscription);
    }
    
    private SubscribeResponse a(Subscription a) throws ServiceException {
        String string = null;SubscribeResponse response = null;
        try {
            string = "<Subscribe xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string += a.a();
            final String string2;
            string = (string2 = string + "</Subscribe>");
            response = new SubscribeResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public String sendNotificationResult(SubscriptionStatus status) {
        status = status;
        final String string = "<?xml version=\"1.0\"?>" + "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<s:Body>" + "<SendNotificationResult xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + "<SubscriptionStatus>" + (((status = status) == SubscriptionStatus.OK) ? "OK" : "Unsubscribe") + "</SubscriptionStatus>" + "</SendNotificationResult>" + "</s:Body>" + "</s:Envelope>";
        return "HTTP/1.1 200 OK\r\n" + "Date: " + (com.ews.exchange.d.a(Calendar.getInstance().getTime()) + " GMT") + "\r\n" + "Connection: close\r\n" + "Content-Type: text/xml; charset=utf-8\r\n" + "Content-Length: " + Charset.forName("UTF-8").encode(string).limit() + "\r\n" + "\r\n" + string;
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.syncItems(standardFolder, propertyPaths, null);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final String state) throws ServiceException {
        return this.syncItems(standardFolder, propertyPaths, state, null);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(standardFolder, propertyPaths, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(standardFolder, propertyPaths, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(new StandardFolderId(standardFolder), propertyPaths, state, ignoreItems, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.syncItems(folderId, propertyPaths, null);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final List<PropertyPath> propertyPaths, final String state) throws ServiceException {
        return this.syncItems(folderId, propertyPaths, state, null);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final List<PropertyPath> propertyPaths, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(folderId, propertyPaths, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final List<PropertyPath> propertyPaths, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, propertyPaths, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final List<PropertyPath> propertyPaths, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, new ItemShape(propertyPaths), state, ignoreItems, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder) throws ServiceException {
        return this.syncItems(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES));
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final String state) throws ServiceException {
        return this.syncItems(standardFolder, state, null);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(standardFolder, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(standardFolder, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(standardFolder, new ItemShape(ShapeType.ALL_PROPERTIES), state, ignoreItems, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final ItemShape itemShape) throws ServiceException {
        return this.syncItems(standardFolder, itemShape, null);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final ItemShape itemShape, final String state) throws ServiceException {
        return this.syncItems(standardFolder, itemShape, state, null);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final ItemShape itemShape, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(standardFolder, itemShape, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final ItemShape itemShape, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(standardFolder, itemShape, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final StandardFolder standardFolder, final ItemShape itemShape, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(new StandardFolderId(standardFolder), itemShape, state, ignoreItems, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId) throws ServiceException {
        return this.syncItems(folderId, new ItemShape(ShapeType.ALL_PROPERTIES));
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final String state) throws ServiceException {
        return this.syncItems(folderId, state, null);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(folderId, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, new ItemShape(ShapeType.ALL_PROPERTIES), state, ignoreItems, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape) throws ServiceException {
        return this.syncItems(folderId, itemShape, null);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape, final String state) throws ServiceException {
        return this.syncItems(folderId, itemShape, state, null);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape, final String state, final List<ItemId> ignoreItems) throws ServiceException {
        return this.syncItems(folderId, itemShape, state, ignoreItems, 512);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape, final String state, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, itemShape, state, null, maxChangesReturned);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned) throws ServiceException {
        return this.syncItems(folderId, itemShape, state, ignoreItems, maxChangesReturned, SyncItemsScope.NONE);
    }
    
    public SyncItemsResponse syncItems(final FolderId folderId, final ItemShape itemShape, final String state, final List<ItemId> ignoreItems, final int maxChangesReturned, final SyncItemsScope scope) throws ServiceException {
        return this.a(folderId, itemShape, state, ignoreItems, maxChangesReturned, scope);
    }
    
    private SyncItemsResponse a(FolderId var1, ItemShape var2, String var3, final List<ItemId> var4, int var5, final SyncItemsScope var6) throws ServiceException {
        if (var1 == null) {
            throw new IllegalArgumentException("folderId is null.");
        } else {
            if (var2 == null) {
                var2 = new ItemShape(ShapeType.ALL_PROPERTIES);
            }

            String var7 = null;

            SyncItemsResponse var18;
            try {
                var7 = "<SyncFolderItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
                if (var2 != null) {
                    this.k(var2.getPropertyPaths());
                    var7 = var7 + var2.toString();
                }

                if (var1 != null) {
                    var7 = var7 + "<SyncFolderId>" + var1.a() + "</SyncFolderId>";
                }

                if (var3 != null) {
                    var7 = var7 + "<SyncState>" + com.ews.exchange.d.a(var3) + "</SyncState>";
                }

                if (var4 != null && var4.size() > 0) {
                    var7 = var7 + "<Ignore>";

                    for(int var20 = 0; var20 < var4.size(); ++var20) {
                        var7 = var7 + ((ItemId)var4.get(var20)).a();
                    }

                    var7 = var7 + "</Ignore>";
                }

                if (var5 <= 0 || var5 > 512) {
                    var5 = 512;
                }

                var7 = var7 + "<MaxChangesReturned>" + var5 + "</MaxChangesReturned>";
                if (var6 != SyncItemsScope.NONE) {
                    var7 = var7 + "<SyncScope>" + (var6 == SyncItemsScope.NORMAL_ITEMS ? "NormalItems" : (var6 == SyncItemsScope.NORMAL_AND_ASSOCIATED_ITEMS ? "NormalAndAssociatedItems" : "None")) + "</SyncScope>";
                }

                var7 = var7 + "</SyncFolderItems>";
                InputStream var17 = this.a(var7, true);
                var18 = new SyncItemsResponse(var17);
            } catch (ServiceException var14) {
                throw var14;
            } catch (Exception var15) {
                throw new ServiceException(var15.getMessage(), var15, var7);
            } finally {
                try {
                    if (this.r != null) {
                        this.r.close();
                    }

                    if (this.q != null && this.u == null) {
                        this.q.close();
                    }
                } catch (IOException var13) {
                    throw new ServiceException(var13.getMessage(), var13, var7);
                }

            }

            if (var18.getResponseClass() == ResponseClass.ERROR) {
                String var21 = com.ews.exchange.a.a(var18.getResponseCode());
                var3 = var18.getMessage();
                String var22 = var18.getXmlMessage();
                ServerVersionInfo var19 = var18.getServerVersionInfo();
                throw new ServiceException(var21, var3, var22, var7, var19);
            } else {
                return var18;
            }
        }
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.syncFolders(standardFolder, propertyPaths, null);
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder, final List<PropertyPath> propertyPaths, final String state) throws ServiceException {
        return this.syncFolders(new StandardFolderId(standardFolder), propertyPaths, state);
    }
    
    public SyncFoldersResponse syncFolders(final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.syncFolders(propertyPaths, null);
    }
    
    public SyncFoldersResponse syncFolders(final List<PropertyPath> propertyPaths, final String state) throws ServiceException {
        return this.a(null, new FolderShape(propertyPaths), state);
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId, final List<PropertyPath> propertyPaths) throws ServiceException {
        return this.syncFolders(folderId, propertyPaths, null);
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId, final List<PropertyPath> propertyPaths, final String state) throws ServiceException {
        return this.syncFolders(folderId, new FolderShape(propertyPaths), state);
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder) throws ServiceException {
        return this.syncFolders(standardFolder, new FolderShape(ShapeType.ALL_PROPERTIES), null);
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder, final String state) throws ServiceException {
        return this.syncFolders(new StandardFolderId(standardFolder), new FolderShape(ShapeType.ALL_PROPERTIES), state);
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder, final FolderShape folderShape) throws ServiceException {
        return this.syncFolders(standardFolder, folderShape, null);
    }
    
    public SyncFoldersResponse syncFolders(final StandardFolder standardFolder, final FolderShape folderShape, final String state) throws ServiceException {
        return this.syncFolders(new StandardFolderId(standardFolder), folderShape, state);
    }
    
    public SyncFoldersResponse syncFolders() throws ServiceException {
        return this.a(null, new FolderShape(ShapeType.ALL_PROPERTIES), null);
    }
    
    public SyncFoldersResponse syncFolders(final String state) throws ServiceException {
        return this.a(null, new FolderShape(ShapeType.ALL_PROPERTIES), state);
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId) throws ServiceException {
        return this.syncFolders(folderId, new FolderShape(ShapeType.ALL_PROPERTIES));
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId, final String state) throws ServiceException {
        return this.syncFolders(folderId, new FolderShape(ShapeType.ALL_PROPERTIES), state);
    }
    
    public SyncFoldersResponse syncFolders(final FolderShape folderShape) throws ServiceException {
        return this.a(null, folderShape, null);
    }
    
    public SyncFoldersResponse syncFolders(final FolderShape folderShape, final String state) throws ServiceException {
        return this.a(null, folderShape, state);
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId, final FolderShape folderShape) throws ServiceException {
        return this.syncFolders(folderId, folderShape, null);
    }
    
    public SyncFoldersResponse syncFolders(final FolderId folderId, final FolderShape folderShape, final String state) throws ServiceException {
        return this.a(folderId, folderShape, state);
    }
    
    private SyncFoldersResponse a(FolderId a, FolderShape folderShape, String message) throws ServiceException {
        if (folderShape == null) {
            folderShape = new FolderShape(ShapeType.ALL_PROPERTIES);
        }
        String requestBody = null;SyncFoldersResponse response = null;
        try {
            requestBody = "<SyncFolderHierarchy xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (folderShape != null) {
                this.a(folderShape);
                b(folderShape);
                requestBody += folderShape.toString();
            }
            if (a != null) {
                requestBody = requestBody + "<SyncFolderId>" + a.a() + "</SyncFolderId>";
            }
            if (message != null) {
                requestBody = requestBody + "<SyncState>" + com.ews.exchange.d.a(message) + "</SyncState>";
            }
            final String string;
            requestBody = (string = requestBody + "</SyncFolderHierarchy>");
            response = new SyncFoldersResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            final String a2 = com.ews.exchange.a.a((response).getResponseCode());
            message = (response).getMessage();
            throw new ServiceException(a2, message, (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public ExpandDistributionListResponse expandDistributionList(final ItemId itemId) throws ServiceException {
        return this.expandDistributionList(new Mailbox(itemId));
    }
    
    public ExpandDistributionListResponse expandDistributionList(final String emailAddress) throws ServiceException {
        return this.expandDistributionList(new Mailbox(emailAddress));
    }
    
    public ExpandDistributionListResponse expandDistributionList(final Mailbox mailbox) throws ServiceException {
        return this.a(mailbox);
    }
    
    private ExpandDistributionListResponse a(Mailbox a) throws ServiceException {
        String string = null;ExpandDistributionListResponse response = null;
        try {
            string = "<ExpandDL xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a("Mailbox");
            }
            final String string2;
            string = (string2 = string + "</ExpandDL>");
            response = new ExpandDistributionListResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public AvailabilityResponse getAvailability(final MailboxData mailbox, final SerializableTimeZone timeZone, final SuggestionsViewOptions suggestionsViewOptions) throws ServiceException {
        return this.getAvailability(mailbox, timeZone, null, suggestionsViewOptions);
    }
    
    public AvailabilityResponse getAvailability(final MailboxData mailbox, final SerializableTimeZone timeZone, final FreeBusyViewOptions freeBusyViewOptions) throws ServiceException {
        return this.getAvailability(mailbox, timeZone, freeBusyViewOptions, null);
    }
    
    public AvailabilityResponse getAvailability(final MailboxData mailbox, final SerializableTimeZone timeZone, final FreeBusyViewOptions freeBusyViewOptions, final SuggestionsViewOptions suggestionsViewOptions) throws ServiceException {
        final ArrayList<MailboxData> mailboxes;
        (mailboxes = new ArrayList<MailboxData>()).add(mailbox);
        return this.getAvailability(mailboxes, timeZone, freeBusyViewOptions, suggestionsViewOptions);
    }
    
    public AvailabilityResponse getAvailability(final List<MailboxData> mailboxes, final SerializableTimeZone timeZone, final SuggestionsViewOptions suggestionsViewOptions) throws ServiceException {
        return this.getAvailability(mailboxes, timeZone, null, suggestionsViewOptions);
    }
    
    public AvailabilityResponse getAvailability(final List<MailboxData> mailboxes, final SerializableTimeZone timeZone, final FreeBusyViewOptions freeBusyViewOptions) throws ServiceException {
        return this.getAvailability(mailboxes, timeZone, freeBusyViewOptions, null);
    }
    
    public AvailabilityResponse getAvailability(final List<MailboxData> mailboxes, final SerializableTimeZone timeZone, final FreeBusyViewOptions freeBusyViewOptions, final SuggestionsViewOptions suggestionsViewOptions) throws ServiceException {
        return this.a(mailboxes, timeZone, freeBusyViewOptions, suggestionsViewOptions);
    }
    
    private AvailabilityResponse a(List<MailboxData> a, final SerializableTimeZone serializableTimeZone, final FreeBusyViewOptions freeBusyViewOptions, final SuggestionsViewOptions suggestionsViewOptions) throws ServiceException {
        String s = null;AvailabilityResponse response = null;
        try {
            s = "<GetUserAvailabilityRequest xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (serializableTimeZone != null) {
                s += serializableTimeZone.a();
            }
            s += "<MailboxDataArray>";
            for (int i = 0; i < ((List)a).size(); ++i) {
                s += ((List<MailboxData>)a).get(i).toString();
            }
            s += "</MailboxDataArray>";
            if (freeBusyViewOptions != null) {
                s += freeBusyViewOptions.a();
            }
            if (suggestionsViewOptions != null) {
                s += suggestionsViewOptions.a();
            }
            final String string;
            s = (string = s + "</GetUserAvailabilityRequest>");
            response = new AvailabilityResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, s);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, s);
            }
        }
        if ((response).getFreeBusyResponses().size() == 1 && (response).getFreeBusyResponses().get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getFreeBusyResponses().get(0).getResponseCode()), (response).getFreeBusyResponses().get(0).getMessage(), (response).getFreeBusyResponses().get(0).getXmlMessage(), s, (response).getFreeBusyResponses().get(0).getServerVersionInfo());
        }
        if ((response).getFreeBusyResponses().size() == 0 && (response).getSuggestionsResponse() != null && (response).getSuggestionsResponse().getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getSuggestionsResponse().getResponseCode()), (response).getSuggestionsResponse().getMessage(), (response).getSuggestionsResponse().getXmlMessage(), s, (response).getSuggestionsResponse().getServerVersionInfo());
        }
        return response;
    }
    
    public OutOfOfficeResponse getOutOfOffice(final String emailAddress) throws ServiceException {
        return this.getOutOfOffice(new EmailAddress(emailAddress));
    }
    
    public OutOfOfficeResponse getOutOfOffice(final EmailAddress emailAddress) throws ServiceException {
        return this.a(emailAddress);
    }
    
    private OutOfOfficeResponse a(EmailAddress a) throws ServiceException {
        String string = null;OutOfOfficeResponse response = null;
        try {
            string = "<GetUserOofSettingsRequest xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string += a.a("Mailbox");
            final String string2;
            string = (string2 = string + "</GetUserOofSettingsRequest>");
            response = new OutOfOfficeResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response setOutOfOffice(final OutOfOffice outOfOffice, final String emailAddress) throws ServiceException {
        return this.setOutOfOffice(outOfOffice, new EmailAddress(emailAddress));
    }
    
    public Response setOutOfOffice(final OutOfOffice outOfOffice, final EmailAddress emailAddress) throws ServiceException {
        return this.a(outOfOffice, emailAddress);
    }
    
    private Response a(OutOfOffice a, final EmailAddress emailAddress) throws ServiceException {
        String requestBody = null;Response response = null;
        try {
            requestBody = "<SetUserOofSettingsRequest xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += emailAddress.a("Mailbox");
            requestBody += a.a();
            final String string;
            requestBody = (string = requestBody + "</SetUserOofSettingsRequest>");
            response = f((InputStream)(this.a(string, true)), "SetUserOofSettingsResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, subject, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject, final Date startTime) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, subject, startTime, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject, final Date startTime, final Date endTime) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, subject, startTime, endTime, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject, final Date startTime, final Date endTime, final String messageId) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, subject, startTime, endTime, messageId, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject, final Date startTime, final Date endTime, final String messageId, final Mailbox federatedDeliveryMailbox) throws ServiceException {
        return this.findMessageTrackingReport(scope, domain, sender, purportedSender, recipient, subject, startTime, endTime, messageId, federatedDeliveryMailbox, null);
    }
    
    public FindMessageTrackingReportResponse findMessageTrackingReport(final MessageTrackingScope scope, final String domain, final Mailbox sender, final Mailbox purportedSender, final Mailbox recipient, final String subject, final Date startTime, final Date endTime, final String messageId, final Mailbox federatedDeliveryMailbox, final String diagnosticsLevel) throws ServiceException {
        return this.a(scope, domain, sender, purportedSender, recipient, subject, startTime, endTime, messageId, federatedDeliveryMailbox, diagnosticsLevel);
    }
    
    private FindMessageTrackingReportResponse a(MessageTrackingScope var1, String var2, final Mailbox var3, final Mailbox var4, final Mailbox var5, final String var6, final Date var7, final Date var8, final String var9, final Mailbox var10, final String var11) throws ServiceException {
        String var12 = null;

        FindMessageTrackingReportResponse var23;
        try {
            var12 = "<FindMessageTrackingReport xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            var12 = var12 + "<Scope>" + com.ews.exchange.a.a(var1) + "</Scope>";
            if (var2 != null) {
                var12 = var12 + "<Domain>" + com.ews.exchange.d.a(var2) + "</Domain>";
            }

            if (var3 != null) {
                var12 = var12 + var3.a("Sender");
            }

            if (var4 != null) {
                var12 = var12 + var4.a("PurportedSender");
            }

            if (var5 != null) {
                var12 = var12 + var5.a("Recipient");
            }

            if (var6 != null) {
                var12 = var12 + "<Subject>" + com.ews.exchange.d.a(var6) + "</Subject>";
            }

            if (var7 != null) {
                var12 = var12 + "<StartDateTime>" + com.ews.exchange.d.a(var7) + "</StartDateTime>";
            }

            if (var8 != null) {
                var12 = var12 + "<EndDateTime>" + com.ews.exchange.d.a(var8) + "</EndDateTime>";
            }

            if (var9 != null) {
                var12 = var12 + "<MessageId>" + com.ews.exchange.d.a(var9) + "</MessageId>";
            }

            if (var10 != null) {
                var12 = var12 + var10.a("FederatedDeliveryMailbox");
            }

            if (var11 != null) {
                var12 = var12 + "<DiagnosticsLevel>" + com.ews.exchange.d.a(var11) + "</DiagnosticsLevel>";
            }

            var12 = var12 + "</FindMessageTrackingReport>";
            InputStream var22 = this.a(var12, true);
            var23 = new FindMessageTrackingReportResponse(var22);
        } catch (ServiceException var19) {
            throw var19;
        } catch (Exception var20) {
            throw new ServiceException(var20.getMessage(), var20, var12);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var18) {
                throw new ServiceException(var18.getMessage(), var18, var12);
            }

        }

        if (var23.getResponseClass() == ResponseClass.ERROR) {
            var2 = com.ews.exchange.a.a(var23.getResponseCode());
            String var25 = var23.getMessage();
            String var26 = var23.getXmlMessage();
            ServerVersionInfo var24 = var23.getServerVersionInfo();
            throw new ServiceException(var2, var25, var26, var12, var24);
        } else {
            return var23;
        }
    }
    
    public GetMessageTrackingReportResponse getMessageTrackingReport(final MessageTrackingScope scope, final MessageTrackingReportTemplate template, final String messageTrackingReportId) throws ServiceException {
        return this.getMessageTrackingReport(scope, template, messageTrackingReportId, null);
    }
    
    public GetMessageTrackingReportResponse getMessageTrackingReport(final MessageTrackingScope scope, final MessageTrackingReportTemplate template, final String messageTrackingReportId, final Mailbox recipientFilter) throws ServiceException {
        return this.getMessageTrackingReport(scope, template, messageTrackingReportId, recipientFilter, false);
    }
    
    public GetMessageTrackingReportResponse getMessageTrackingReport(final MessageTrackingScope scope, final MessageTrackingReportTemplate template, final String messageTrackingReportId, final Mailbox recipientFilter, final boolean returnQueueEvents) throws ServiceException {
        return this.getMessageTrackingReport(scope, template, messageTrackingReportId, recipientFilter, returnQueueEvents, null);
    }
    
    public GetMessageTrackingReportResponse getMessageTrackingReport(final MessageTrackingScope scope, final MessageTrackingReportTemplate template, final String messageTrackingReportId, final Mailbox recipientFilter, final boolean returnQueueEvents, final String diagnosticsLevel) throws ServiceException {
        return this.a(scope, template, messageTrackingReportId, recipientFilter, returnQueueEvents, diagnosticsLevel);
    }
    
    private GetMessageTrackingReportResponse a(MessageTrackingScope a, final MessageTrackingReportTemplate messageTrackingReportTemplate, String message, final Mailbox mailbox, final boolean b, final String s) throws ServiceException {
        String requestBody = null;GetMessageTrackingReportResponse response = null;
        try {
            requestBody = "<GetMessageTrackingReport xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<Scope>" + com.ews.exchange.a.a(a) + "</Scope>";
            final StringBuilder append = new StringBuilder().append(requestBody).append("<ReportTemplate>");
            requestBody = append.append((messageTrackingReportTemplate == MessageTrackingReportTemplate.SUMMARY) ? "Summary" : "RecipientPath").append("</ReportTemplate>").toString();
            if (mailbox != null) {
                requestBody += mailbox.a("RecipientFilter");
            }
            if (message != null) {
                requestBody = requestBody + "<MessageTrackingReportId>" + com.ews.exchange.d.a(message) + "</MessageTrackingReportId>";
            }
            if (b) {
                requestBody += "<ReturnQueueEvents>true</ReturnQueueEvents>";
            }
            if (s != null) {
                requestBody = requestBody + "<DiagnosticsLevel>" + com.ews.exchange.d.a(s) + "</DiagnosticsLevel>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetMessageTrackingReport>");
            response = new GetMessageTrackingReportResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            final String a2 = com.ews.exchange.a.a((response).getResponseCode());
            message = (response).getMessage();
            throw new ServiceException(a2, message, (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetRoomListsResponse getRoomLists() throws ServiceException {
        return this.c();
    }
    
    private GetRoomListsResponse c() throws ServiceException {
        String requestBody = null;GetRoomListsResponse response = null;
        Object a;
        try {
            requestBody = "<GetRoomLists xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            final String string;
            requestBody = (string = requestBody + "</GetRoomLists>");
            response = new GetRoomListsResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetRoomsResponse getRooms(final Mailbox mailbox) throws ServiceException {
        return this.b(mailbox);
    }
    
    private GetRoomsResponse b(Mailbox a) throws ServiceException {
        String string = null;GetRoomsResponse response = null;
        try {
            string = "<GetRooms xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a("RoomList");
            }
            final String string2;
            string = (string2 = string + "</GetRooms>");
            response = new GetRoomsResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetRulesResponse getRules() throws ServiceException {
        return this.getRules(null);
    }
    
    public GetRulesResponse getRules(final String smtpEmailAddress) throws ServiceException {
        return this.e(smtpEmailAddress);
    }
    
    private GetRulesResponse e(String a) throws ServiceException {
        String string = null;GetRulesResponse response = null;
        try {
            string = "<GetInboxRules xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string = string + "<MailboxSmtpAddress>" + a + "</MailboxSmtpAddress>";
            }
            final String string2;
            string = (string2 = string + "</GetInboxRules>");
            response = new GetRulesResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Date getPasswordExpirationDate(final String smtpEmailAddress) throws ServiceException {
        return this.f(smtpEmailAddress);
    }
    
    private Date f(String a) throws ServiceException {
        String string = null;GetPasswordExpirationDateResponse response = null;
        try {
            string = "<GetPasswordExpirationDate xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string = string + "<MailboxSmtpAddress>" + a + "</MailboxSmtpAddress>";
            }
            final String string2;
            string = (string2 = string + "</GetPasswordExpirationDate>");
            response = new GetPasswordExpirationDateResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return (response).getPasswordExpirationDate();
    }
    
    public GetServerTimeZonesResponse getServerTimeZones() throws ServiceException {
        return this.getServerTimeZones(true);
    }
    
    public GetServerTimeZonesResponse getServerTimeZones(final boolean returnFullTimeZoneData) throws ServiceException {
        return this.getServerTimeZones(new ArrayList<String>(), returnFullTimeZoneData);
    }
    
    public GetServerTimeZonesResponse getServerTimeZones(final String timeZoneId) throws ServiceException {
        final ArrayList<String> timeZoneId2;
        (timeZoneId2 = new ArrayList<String>()).add(timeZoneId);
        return this.getServerTimeZones(timeZoneId2, true);
    }
    
    public GetServerTimeZonesResponse getServerTimeZones(final String timeZoneId, final boolean returnFullTimeZoneData) throws ServiceException {
        final ArrayList<String> timeZoneId2;
        (timeZoneId2 = new ArrayList<String>()).add(timeZoneId);
        return this.getServerTimeZones(timeZoneId2, returnFullTimeZoneData);
    }
    
    public GetServerTimeZonesResponse getServerTimeZones(final List<String> timeZoneId) throws ServiceException {
        return this.getServerTimeZones(timeZoneId, true);
    }
    
    public GetServerTimeZonesResponse getServerTimeZones(final List<String> timeZoneId, final boolean returnFullTimeZoneData) throws ServiceException {
        return this.a(timeZoneId, returnFullTimeZoneData);
    }
    
    private GetServerTimeZonesResponse a(List<String> a, final boolean b) throws ServiceException {
        String requestBody = null;GetServerTimeZonesResponse response = null;
        try {
            final String s = "";
            String s2;
            if (b) {
                s2 = s + "ReturnFullTimeZoneData=\"true\"";
            }
            else {
                s2 = s + "ReturnFullTimeZoneData=\"false\"";
            }
            requestBody = "<GetServerTimeZones xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\" " + s2 + " >";
            if (a != null && ((List)a).size() > 0) {
                requestBody += "<Ids>";
                for (int i = 0; i < ((List)a).size(); ++i) {
                    requestBody = requestBody + "<t:Id>" + com.ews.exchange.d.a(((List<String>)a).get(i)) + "</t:Id>";
                }
                requestBody += "</Ids>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetServerTimeZones>");
            response = new GetServerTimeZonesResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetMailTipsResponse getMailTips(final Mailbox sender, final List<Mailbox> recipients) throws ServiceException {
        return this.getMailTips(sender, recipients, MailTipType.ALL);
    }
    
    public GetMailTipsResponse getMailTips(final Mailbox sender, final List<Mailbox> recipients, final MailTipType type) throws ServiceException {
        return this.a(sender, recipients, type);
    }
    
    private GetMailTipsResponse a(Mailbox var1, final List<Mailbox> var2, final MailTipType var3) throws ServiceException {
        String var4 = null;

        GetMailTipsResponse var16;
        try {
            var4 = "<GetMailTips xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var1 != null) {
                var4 = var4 + var1.a("SendingAs");
            }

            if (var2 != null && var2.size() > 0) {
                var4 = var4 + "<Recipients>";

                for(int var5 = 0; var5 < var2.size(); ++var5) {
                    if (var2.get(var5) != null) {
                        var4 = var4 + ((Mailbox)var2.get(var5)).a("t:Mailbox");
                    }
                }

                var4 = var4 + "</Recipients>";
            }

            var4 = var4 + "<MailTipsRequested>" + (var3 == MailTipType.ALL ? "All" : (var3 == MailTipType.CUSTOM_MAIL_TIP ? "CustomMailTip" : (var3 == MailTipType.DELIVERY_RESTRICTION ? "DeliveryRestriction" : (var3 == MailTipType.EXTERNAL_MEMBER_COUNT ? "ExternalMemberCount" : (var3 == MailTipType.INVALID_RECIPIENT ? "InvalidRecipient" : (var3 == MailTipType.MAILBOX_FULL_STATUS ? "MailboxFullStatus" : (var3 == MailTipType.MAX_MESSAGE_SIZE ? "MaxMessageSize" : (var3 == MailTipType.MODERATION_STATUS ? "ModerationStatus" : (var3 == MailTipType.OUT_OF_OFFICE_MESSAGE ? "OutOfOfficeMessage" : "TotalMemberCount"))))))))) + "</MailTipsRequested>";
            var4 = var4 + "</GetMailTips>";
            InputStream var15 = this.a(var4, true);
            var16 = new GetMailTipsResponse(var15);
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var4);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var4);
            }

        }

        if (var16.getResponseClass() == ResponseClass.ERROR) {
            String var20 = com.ews.exchange.a.a(var16.getResponseCode());
            String var18 = var16.getMessage();
            String var19 = var16.getXmlMessage();
            ServerVersionInfo var17 = var16.getServerVersionInfo();
            throw new ServiceException(var20, var18, var19, var4, var17);
        } else {
            return var16;
        }
    }
    
    public ServiceConfigurationResponse getServiceConfiguration(final ServiceConfigurationType serviceConfigurationType) throws ServiceException {
        return this.getServiceConfiguration(null, serviceConfigurationType);
    }
    
    public ServiceConfigurationResponse getServiceConfiguration(final Mailbox mailbox, final ServiceConfigurationType serviceConfigurationType) throws ServiceException {
        final ArrayList<ServiceConfigurationType> serviceConfigurationTypes;
        (serviceConfigurationTypes = new ArrayList<ServiceConfigurationType>()).add(serviceConfigurationType);
        return this.getServiceConfiguration(mailbox, serviceConfigurationTypes);
    }
    
    public ServiceConfigurationResponse getServiceConfiguration(final Mailbox mailbox, final List<ServiceConfigurationType> serviceConfigurationTypes) throws ServiceException {
        return this.b(mailbox, serviceConfigurationTypes);
    }
    
    private ServiceConfigurationResponse b(Mailbox a, final List<ServiceConfigurationType> list) throws ServiceException {
        String requestBody = null;ServiceConfigurationResponse response = null;
        try {
            requestBody = "<GetServiceConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                requestBody += a.a("ActingAs");
            }
            if (list != null && list.size() > 0) {
                requestBody += "<RequestedConfiguration>";
                for (int i = 0; i < list.size(); ++i) {
                    ServiceConfigurationType var15;
                    requestBody = requestBody + "<ConfigurationName>" + ((var15 = (ServiceConfigurationType)list.get(i)) == ServiceConfigurationType.MAIL_TIPS ? "MailTips" : (var15 == ServiceConfigurationType.UNIFIED_MESSAGING_CONFIGURATION ? "UnifiedMessagingConfiguration" : "ProtectionRules")) + "</ConfigurationName>";
                }
                requestBody += "</RequestedConfiguration>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetServiceConfiguration>");
            response = new ServiceConfigurationResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetSharingFolderResponse getSharingFolder(final String smtpAddress, final SharingDataType type) throws ServiceException {
        return this.getSharingFolder(smtpAddress, type, null);
    }
    
    public GetSharingFolderResponse getSharingFolder(final String smtpAddress, final String sharedFolderId) throws ServiceException {
        return this.getSharingFolder(smtpAddress, SharingDataType.NONE, sharedFolderId);
    }
    
    public GetSharingFolderResponse getSharingFolder(final String smtpAddress, final SharingDataType type, final String sharedFolderId) throws ServiceException {
        return this.a(smtpAddress, type, sharedFolderId);
    }
    
    private GetSharingFolderResponse a(String var1, final SharingDataType var2, String var3) throws ServiceException {
        String var4 = null;

        GetSharingFolderResponse var16;
        try {
            var4 = "<GetSharingFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var1 != null) {
                var4 = var4 + "<SmtpAddress>" + com.ews.exchange.d.a(var1) + "</SmtpAddress>";
            }

            if (var2 != SharingDataType.NONE) {
                var4 = var4 + "<DataType>" + (var2 == SharingDataType.CALENDAR ? "Calendar" : (var2 == SharingDataType.CONTACTS ? "Contacts" : "None")) + "</DataType>";
            }

            if (var3 != null) {
                var4 = var4 + "<SharedFolderId>" + com.ews.exchange.d.a(var3) + "</SharedFolderId>";
            }

            var4 = var4 + "</GetSharingFolder>";
            InputStream var15 = this.a(var4, true);
            var16 = new GetSharingFolderResponse(var15);
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var4);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var4);
            }

        }

        if (var16.getResponseClass() == ResponseClass.ERROR) {
            String var18 = com.ews.exchange.a.a(var16.getResponseCode());
            var3 = var16.getMessage();
            String var5 = var16.getXmlMessage();
            ServerVersionInfo var17 = var16.getServerVersionInfo();
            throw new ServiceException(var18, var3, var5, var4, var17);
        } else {
            return var16;
        }
    }
    
    public GetSharingMetadataResponse getSharingMetadata(final FolderId folderId, final String senderSmtpAddress, final List<String> recipients) throws ServiceException {
        return this.a(folderId, senderSmtpAddress, recipients);
    }
    
    private GetSharingMetadataResponse a(FolderId a, String responseCode, final List<String> list) throws ServiceException {
        String requestBody = null; GetSharingMetadataResponse response = null;
        try {
            requestBody = "<GetSharingMetadata xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                requestBody += a.a("IdOfFolderToShare");
            }
            if (responseCode != null) {
                requestBody = requestBody + "<SenderSmtpAddress>" + com.ews.exchange.d.a(responseCode) + "</SenderSmtpAddress>";
            }
            if (list != null && list.size() > 0) {
                requestBody += "<Recipients>";
                for (int i = 0; i < list.size(); ++i) {
                    if (list.get(i) != null) {
                        requestBody = requestBody + "<t:SmtpAddress>" + com.ews.exchange.d.a(list.get(i)) + "</t:SmtpAddress>";
                    }
                }
                requestBody += "</Recipients>";
            }
            requestBody = (responseCode = requestBody + "</GetSharingMetadata>");
            response = new GetSharingMetadataResponse(this.a(responseCode, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            responseCode = com.ews.exchange.a.a((response).getResponseCode());
            throw new ServiceException(responseCode, (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response refreshSharingFolder(final FolderId folderId) throws ServiceException {
        return this.a(folderId);
    }
    
    private Response a(FolderId a) throws ServiceException {
        String string = null;Response response = null;
        try {
            string = "<RefreshSharingFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a("SharingFolderId");
            }
            final String string2;
            string = (string2 = string + "</RefreshSharingFolder>");
            response = f((InputStream)(this.a(string2, true)), "RefreshSharingFolderResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetUserConfigurationResponse getUserConfiguration(final UserConfigurationName name) throws ServiceException {
        return this.a(name, UserConfigurationProperty.ALL);
    }
    
    public GetUserConfigurationResponse getUserConfiguration(final UserConfigurationName name, final UserConfigurationProperty property) throws ServiceException {
        return this.a(name, property);
    }
    
    private GetUserConfigurationResponse a(UserConfigurationName var1, final UserConfigurationProperty var2) throws ServiceException {
        String var3 = null;

        GetUserConfigurationResponse var16;
        try {
            var3 = "<GetUserConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var1 != null) {
                var3 = var3 + var1.a("UserConfigurationName");
            }

            var3 = var3 + "<UserConfigurationProperties>" + (var2 == UserConfigurationProperty.ID ? "Id" : (var2 == UserConfigurationProperty.DICTIONARY ? "Dictionary" : (var2 == UserConfigurationProperty.XML_DATA ? "XmlData" : (var2 == UserConfigurationProperty.BINARY_DATA ? "BinaryData" : "All")))) + "</UserConfigurationProperties>";
            var3 = var3 + "</GetUserConfiguration>";
            InputStream var15 = this.a(var3, true);
            var16 = new GetUserConfigurationResponse(var15);
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var3);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var3);
            }

        }

        if (var16.getResponseClass() == ResponseClass.ERROR) {
            String var18 = com.ews.exchange.a.a(var16.getResponseCode());
            String var4 = var16.getMessage();
            String var5 = var16.getXmlMessage();
            ServerVersionInfo var17 = var16.getServerVersionInfo();
            throw new ServiceException(var18, var4, var5, var3, var17);
        } else {
            return var16;
        }
    }
    
    public Response createUserConfiguration(final UserConfiguration userConfiguration) throws ServiceException {
        return this.a(userConfiguration);
    }
    
    private Response a(UserConfiguration a) throws ServiceException {
        String string = null; Response response = null;
        try {
            string = "<CreateUserConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a();
            }
            final String string2;
            string = (string2 = string + "</CreateUserConfiguration>");
            response = f((InputStream)(this.a(string2, true)), "CreateUserConfigurationResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response updateUserConfiguration(final UserConfiguration userConfiguration) throws ServiceException {
        return this.b(userConfiguration);
    }
    
    private Response b(UserConfiguration a) throws ServiceException {
        String string = null; Response response = null;
        try {
            string = "<UpdateUserConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a();
            }
            final String string2;
            string = (string2 = string + "</UpdateUserConfiguration>");
            response = f((InputStream)(this.a(string2, true)), "UpdateUserConfigurationResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response deleteUserConfiguration(final UserConfigurationName name) throws ServiceException {
        return this.a(name);
    }
    
    private Response a(UserConfigurationName a) throws ServiceException {
        String string = null; Response response = null;
        try {
            string = "<DeleteUserConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a("UserConfigurationName");
            }
            final String string2;
            string = (string2 = string + "</DeleteUserConfiguration>");
            response = f((InputStream)(this.a(string2, true)), "DeleteUserConfigurationResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public ConvertIdResponse convertId(final SourceId sourceId, final IdFormat destinationFormat) throws ServiceException {
        final ArrayList<SourceId> sourceIds;
        (sourceIds = new ArrayList<SourceId>()).add(sourceId);
        return this.convertId(sourceIds, destinationFormat).get(0);
    }
    
    public List<ConvertIdResponse> convertId(final List<SourceId> sourceIds, final IdFormat destinationFormat) throws ServiceException {
        return this.a(sourceIds, destinationFormat);
    }
    
    private List<ConvertIdResponse> a(List<SourceId> o, final IdFormat idFormat) throws ServiceException {
        if (o == null) {
            throw new IllegalArgumentException("sourceIds is null.");
        }
        String requestBody = null;List<ConvertIdResponse> convertIdResponseList = new ArrayList<>();
        try {
            requestBody = "<ConvertId " + ("DestinationFormat=\"" + com.ews.exchange.a.a(idFormat) + "\"") + " xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<SourceIds>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<SourceId>)o).get(i).a();
            }
            requestBody += "</SourceIds>";
            final String string;
            requestBody = (string = requestBody + "</ConvertId>");
            convertIdResponseList = j((InputStream)(this.a(string, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((convertIdResponseList).size() == 1 && ((convertIdResponseList).get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((convertIdResponseList).get(0)).getResponseCode()), ((convertIdResponseList).get(0)).getMessage(), ((convertIdResponseList).get(0)).getXmlMessage(), requestBody, ((convertIdResponseList).get(0)).getServerVersionInfo());
        }
        return convertIdResponseList;
    }
    
    public List<ItemInfoResponse> updateItemInRecoverableItems(final ItemChange itemChange) throws ServiceException {
        return this.a(itemChange);
    }
    
    private List<ItemInfoResponse> a(ItemChange itemChange) throws ServiceException {
        String requestBody = null;List<ItemInfoResponse> itemInfoResponseList = new ArrayList<>();
        if (itemChange == null) {
            throw new IllegalArgumentException("itemChange is null.");
        }
        try {
            requestBody = "<UpdateItemInRecoverableItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (itemChange.getItemId() != null) {
                requestBody += itemChange.getItemId().a("ItemId");
            }
            requestBody += "<Updates>";
            if (itemChange.getPropertiesToAppend() != null && itemChange.getPropertiesToAppend().size() > 0) {
                for (int i = 0; i < itemChange.getPropertiesToAppend().size(); ++i) {
                    if (itemChange.getPropertiesToAppend().get(i) != null && itemChange.getPropertiesToAppend().get(i).getPropertyPath() != null && (itemChange.getPropertiesToAppend().get(i).getValue() != null || itemChange.getPropertiesToAppend().get(i).getValues().size() > 0)) {
                        requestBody += "<t:AppendToItemField>";
                        requestBody += itemChange.getPropertiesToAppend().get(i).a();
                        requestBody += "</t:AppendToItemField>";
                    }
                }
            }
            if (itemChange.getPropertiesToSet() != null && itemChange.getPropertiesToSet().size() > 0) {
                for (int j = 0; j < itemChange.getPropertiesToSet().size(); ++j) {
                    if (itemChange.getPropertiesToSet().get(j) != null && itemChange.getPropertiesToSet().get(j).getPropertyPath() != null && (itemChange.getPropertiesToSet().get(j).getValue() != null || itemChange.getPropertiesToSet().get(j).getValues().size() > 0)) {
                        requestBody += "<t:SetItemField>";
                        requestBody += itemChange.getPropertiesToSet().get(j).a();
                        requestBody += "</t:SetItemField>";
                    }
                }
            }
            if (itemChange.getPropertiesToDelete() != null && itemChange.getPropertiesToDelete().size() > 0) {
                for (int k = 0; k < itemChange.getPropertiesToDelete().size(); ++k) {
                    if (itemChange.getPropertiesToDelete().get(k) != null) {
                        requestBody += "<t:DeleteItemField>";
                        requestBody += itemChange.getPropertiesToDelete().get(k).toString();
                        requestBody += "</t:DeleteItemField>";
                    }
                }
            }
            requestBody += "</Updates>";
            final String string;
            requestBody = (string = requestBody + "</UpdateItemInRecoverableItems>");
            itemInfoResponseList = d((InputStream)(this.a(string, true)), "UpdateItemResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((itemInfoResponseList).size() == 1 && (itemInfoResponseList).get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((itemInfoResponseList).get(0).getResponseCode()), (itemInfoResponseList).get(0).getMessage(), (itemInfoResponseList).get(0).getXmlMessage(), requestBody, (itemInfoResponseList).get(0).getServerVersionInfo());
        }
        return itemInfoResponseList;
    }
    
    public RuleOperationResponse createRule(final Rule rule) throws ServiceException {
        return this.createRule(rule, null, false);
    }
    
    public RuleOperationResponse createRule(final Rule rule, final String smtpEmailAddress) throws ServiceException {
        return this.createRule(rule, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse createRule(final Rule rule, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.createRule(rule, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse createRule(final Rule rule, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        final ArrayList<Rule> rules;
        (rules = new ArrayList<Rule>()).add(rule);
        return this.createRule(rules, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse createRule(final List<Rule> rules) throws ServiceException {
        return this.createRule(rules, null, false);
    }
    
    public RuleOperationResponse createRule(final List<Rule> rules, final String smtpEmailAddress) throws ServiceException {
        return this.createRule(rules, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse createRule(final List<Rule> rules, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.createRule(rules, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse createRule(final List<Rule> rules, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(rules, null, null, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final Rule rule) throws ServiceException {
        return this.updateRule(rule, null, false);
    }
    
    public RuleOperationResponse updateRule(final Rule rule, final String smtpEmailAddress) throws ServiceException {
        return this.updateRule(rule, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse updateRule(final Rule rule, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(rule, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final Rule rule, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        final ArrayList<Rule> rules;
        (rules = new ArrayList<Rule>()).add(rule);
        return this.updateRule(rules, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> rules) throws ServiceException {
        return this.updateRule(rules, null, false);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> rules, final String smtpEmailAddress) throws ServiceException {
        return this.updateRule(rules, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> rules, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(rules, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> rules, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(null, rules, null, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse deleteRule(final String rule) throws ServiceException {
        return this.deleteRule(rule, null, false);
    }
    
    public RuleOperationResponse deleteRule(final String ruleId, final String smtpEmailAddress) throws ServiceException {
        return this.deleteRule(ruleId, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse deleteRule(final String ruleId, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.deleteRule(ruleId, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse deleteRule(final String ruleId, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        final ArrayList<String> ruleIds;
        (ruleIds = new ArrayList<String>()).add(ruleId);
        return this.deleteRule(ruleIds, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse deleteRule(final List<String> ruleIds) throws ServiceException {
        return this.deleteRule(ruleIds, null, false);
    }
    
    public RuleOperationResponse deleteRule(final List<String> ruleIds, final String smtpEmailAddress) throws ServiceException {
        return this.deleteRule(ruleIds, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse deleteRule(final List<String> ruleIds, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.deleteRule(ruleIds, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse deleteRule(final List<String> ruleIds, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(null, null, ruleIds, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> createRules, final List<Rule> updateRules, final List<String> ruleIds) throws ServiceException {
        return this.updateRule(createRules, updateRules, ruleIds, null, false);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> createRules, final List<Rule> updateRules, final List<String> ruleIds, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.updateRule(createRules, updateRules, ruleIds, null, removeOutlookRuleBlob);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> createRules, final List<Rule> updateRules, final List<String> ruleIds, final String smtpEmailAddress) throws ServiceException {
        return this.updateRule(createRules, updateRules, ruleIds, smtpEmailAddress, false);
    }
    
    public RuleOperationResponse updateRule(final List<Rule> createRules, final List<Rule> updateRules, final List<String> ruleIds, final String smtpEmailAddress, final boolean removeOutlookRuleBlob) throws ServiceException {
        return this.a(createRules, updateRules, ruleIds, smtpEmailAddress, removeOutlookRuleBlob);
    }
    
    private RuleOperationResponse a(List<Rule> a, final List<Rule> list, final List<String> list2, String a2, final boolean b) throws ServiceException {
        String requestBody = null; RuleOperationResponse response = null;
        try {
            requestBody = "<UpdateInboxRules xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a2 != null) {
                requestBody = requestBody + "<MailboxSmtpAddress>" + com.ews.exchange.d.a(a2) + "</MailboxSmtpAddress>";
            }
            if (b) {
                requestBody += "<RemoveOutlookRuleBlob>true</RemoveOutlookRuleBlob>";
            }
            requestBody += "<Operations>";
            if (a != null && ((List)a).size() > 0) {
                for (int i = 0; i < ((List)a).size(); ++i) {
                    requestBody += "<t:CreateRuleOperation>";
                    requestBody += ((List<Rule>)a).get(i).a();
                    requestBody += "</t:CreateRuleOperation>";
                }
            }
            if (list != null && list.size() > 0) {
                for (int j = 0; j < list.size(); ++j) {
                    requestBody += "<t:SetRuleOperation>";
                    requestBody += list.get(j).a();
                    requestBody += "</t:SetRuleOperation>";
                }
            }
            if (list2 != null && list2.size() > 0) {
                for (int k = 0; k < list2.size(); ++k) {
                    requestBody += "<t:DeleteRuleOperation>";
                    requestBody = requestBody + "<t:RuleId>" + list2.get(k) + "</t:RuleId>";
                    requestBody += "</t:DeleteRuleOperation>";
                }
            }
            requestBody += "</Operations>";
            final String string;
            requestBody = (string = requestBody + "</UpdateInboxRules>");
            response = new RuleOperationResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            a2 = com.ews.exchange.a.a((response).getResponseCode());
            throw new ServiceException(a2, (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return (RuleOperationResponse)a;
    }
    
    public GetDiscoverySearchConfigurationResponse getDiscoverySearchConfiguration(final String searchFilter) throws ServiceException {
        return this.getDiscoverySearchConfiguration(searchFilter, false, false);
    }
    
    public GetDiscoverySearchConfigurationResponse getDiscoverySearchConfiguration(final String searchFilter, final boolean expandGroupMembership) throws ServiceException {
        return this.getDiscoverySearchConfiguration(searchFilter, expandGroupMembership, false);
    }
    
    public GetDiscoverySearchConfigurationResponse getDiscoverySearchConfiguration(final String searchFilter, final boolean expandGroupMembership, final boolean inPlaceHoldConfigurationOnly) throws ServiceException {
        return this.a(searchFilter, expandGroupMembership, inPlaceHoldConfigurationOnly);
    }
    
    private GetDiscoverySearchConfigurationResponse a(String a, final boolean b, final boolean b2) throws ServiceException {
        String requestBody = null;GetDiscoverySearchConfigurationResponse response = null;
        try {
            requestBody = "<GetDiscoverySearchConfiguration xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                requestBody = requestBody + "<SearchId>" + com.ews.exchange.d.a(a) + "</SearchId>";
            }
            if (b) {
                requestBody += "<ExpandGroupMembership>true</ExpandGroupMembership>";
            }
            if (b2) {
                requestBody += "<InPlaceHoldConfigurationOnly>true</InPlaceHoldConfigurationOnly>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetDiscoverySearchConfiguration>");
            response = new GetDiscoverySearchConfigurationResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetSearchableMailboxesResponse getSearchableMailboxes(final String searchFilter) throws ServiceException {
        return this.getSearchableMailboxes(searchFilter, false);
    }
    
    public GetSearchableMailboxesResponse getSearchableMailboxes(final String searchFilter, final boolean expandGroupMembership) throws ServiceException {
        return this.b(searchFilter, expandGroupMembership);
    }
    
    private GetSearchableMailboxesResponse b(String a, final boolean b) throws ServiceException {
        String requestBody = null;GetSearchableMailboxesResponse response = null;
        try {
            requestBody = "<GetSearchableMailboxes xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                requestBody = requestBody + "<SearchFilter>" + com.ews.exchange.d.a(a) + "</SearchFilter>";
            }
            if (b) {
                requestBody += "<ExpandGroupMembership>true</ExpandGroupMembership>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetSearchableMailboxes>");
            response = new GetSearchableMailboxesResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, SearchResultType.PREVIEW_ONLY);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, propertyOrder, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, propertyOrder, language, false);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, propertyOrder, language, deduplication, -1);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, propertyOrder, language, deduplication, pageSize, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize, final String pageItemReference) throws ServiceException {
        return this.searchMailboxes(mailboxQuery, resultType, itemShape, propertyOrder, language, deduplication, pageSize, pageItemReference, SearchPageDirection.NONE);
    }
    
    public SearchMailboxesResponse searchMailboxes(final MailboxQuery mailboxQuery, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection) throws ServiceException {
        final ArrayList<MailboxQuery> mailboxQueries;
        (mailboxQueries = new ArrayList<MailboxQuery>()).add(mailboxQuery);
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, language, deduplication, pageSize, pageItemReference, pageDirection);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, SearchResultType.PREVIEW_ONLY);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, language, false);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, language, deduplication, -1);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, language, deduplication, pageSize, null);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize, final String pageItemReference) throws ServiceException {
        return this.searchMailboxes(mailboxQueries, resultType, itemShape, propertyOrder, language, deduplication, pageSize, pageItemReference, SearchPageDirection.NONE);
    }
    
    public SearchMailboxesResponse searchMailboxes(final List<MailboxQuery> mailboxQueries, final SearchResultType resultType, final PreviewItemShape itemShape, final List<PropertyOrder> propertyOrder, final String language, final boolean deduplication, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection) throws ServiceException {
        return this.a(mailboxQueries, resultType, itemShape, propertyOrder, language, deduplication, pageSize, pageItemReference, pageDirection);
    }
    
    private SearchMailboxesResponse a(List<MailboxQuery> var1, final SearchResultType var2, final PreviewItemShape var3, final List<PropertyOrder> var4, final String var5, final boolean var6, final int var7, final String var8, final SearchPageDirection var9) throws ServiceException {
        String var10 = "<SearchMailboxes xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
        int var11;
        if (var1 != null && var1.size() > 0) {
            var10 = var10 + "<SearchQueries>";

            for(var11 = 0; var11 < var1.size(); ++var11) {
                var10 = var10 + ((MailboxQuery)var1.get(var11)).a();
            }

            var10 = var10 + "</SearchQueries>";
        }

        var10 = var10 + "<ResultType>" + (var2 == SearchResultType.STATISTICS_ONLY ? "StatisticsOnly" : "PreviewOnly") + "</ResultType>";
        if (var3 != null) {
            var10 = var10 + "<PreviewItemResponseShape>" + var3.toString() + "</PreviewItemResponseShape>";
        }

        if (var4 != null && var4.size() > 0) {
            var10 = var10 + "<SortBy>";

            for(var11 = 0; var11 < var4.size(); ++var11) {
                var10 = var10 + ((PropertyOrder)var4.get(var11)).toString();
            }

            var10 = var10 + "</SortBy>";
        }

        if (var5 != null) {
            var10 = var10 + "<Language>" + com.ews.exchange.d.a(var5) + "</Language>";
        }

        if (var6) {
            var10 = var10 + "<Deduplication>true</Deduplication>";
        }

        if (var7 >= 0) {
            var10 = var10 + "<PageSize>" + var7 + "</PageSize>";
        }

        if (var8 != null) {
            var10 = var10 + "<PageItemReference>" + com.ews.exchange.d.a(var8) + "</PageItemReference>";
        }

        if (var9 != SearchPageDirection.NONE) {
            var10 = var10 + "<PageDirection>" + com.ews.exchange.a.a(var9) + "</PageDirection>";
        }

        var10 = var10 + "</SearchMailboxes>";

        SearchMailboxesResponse var22;
        try {
            InputStream var21 = this.a(var10, true);
            var22 = new SearchMailboxesResponse(var21);
        } catch (ServiceException var17) {
            throw var17;
        } catch (Exception var18) {
            throw new ServiceException(var18.getMessage(), var18, var10);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var19) {
                throw new ServiceException(var19.getMessage(), var19, var10);
            }

        }

        if (var22.getResponseClass() == ResponseClass.ERROR) {
            String var26 = com.ews.exchange.a.a(var22.getResponseCode());
            String var24 = var22.getMessage();
            String var25 = var22.getXmlMessage();
            ServerVersionInfo var23 = var22.getServerVersionInfo();
            throw new ServiceException(var26, var24, var25, var10, var23);
        } else {
            return var22;
        }
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final String mailbox) throws ServiceException {
        return this.getNonIndexableItemDetails(mailbox, -1);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final String mailbox, final int pageSize) throws ServiceException {
        return this.getNonIndexableItemDetails(mailbox, pageSize, null);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final String mailbox, final int pageSize, final String pageItemReference) throws ServiceException {
        return this.getNonIndexableItemDetails(mailbox, pageSize, pageItemReference, SearchPageDirection.NONE);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final String mailbox, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection) throws ServiceException {
        return this.getNonIndexableItemDetails(mailbox, pageSize, pageItemReference, pageDirection, false);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final String mailbox, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection, final boolean searchArchiveOnly) throws ServiceException {
        final ArrayList<String> mailboxes;
        (mailboxes = new ArrayList<String>()).add(mailbox);
        return this.getNonIndexableItemDetails(mailboxes, pageSize, pageItemReference, pageDirection, searchArchiveOnly);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final List<String> mailboxes) throws ServiceException {
        return this.getNonIndexableItemDetails(mailboxes, -1);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final List<String> mailboxes, final int pageSize) throws ServiceException {
        return this.getNonIndexableItemDetails(mailboxes, pageSize, null);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final List<String> mailboxes, final int pageSize, final String pageItemReference) throws ServiceException {
        return this.getNonIndexableItemDetails(mailboxes, pageSize, pageItemReference, SearchPageDirection.NONE);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final List<String> mailboxes, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection) throws ServiceException {
        return this.getNonIndexableItemDetails(mailboxes, pageSize, pageItemReference, pageDirection, false);
    }
    
    public GetNonIndexableItemDetailsResponse getNonIndexableItemDetails(final List<String> mailboxes, final int pageSize, final String pageItemReference, final SearchPageDirection pageDirection, final boolean searchArchiveOnly) throws ServiceException {
        return this.a(mailboxes, pageSize, pageItemReference, pageDirection, searchArchiveOnly);
    }
    
    private GetNonIndexableItemDetailsResponse a(List<String> a, final int n, String xmlMessage, final SearchPageDirection searchPageDirection, final boolean b) throws ServiceException {
        String requestBody = null;GetNonIndexableItemDetailsResponse response = null;
        try {
            requestBody = "<GetNonIndexableItemDetails xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null && ((List)a).size() > 0) {
                requestBody += "<Mailboxes>";
                for (int i = 0; i < ((List)a).size(); ++i) {
                    requestBody = requestBody + "<t:LegacyDN>" + com.ews.exchange.d.a(((List<String>)a).get(i)) + "</t:LegacyDN>";
                }
                requestBody += "</Mailboxes>";
            }
            if (n >= 0) {
                requestBody = requestBody + "<PageSize>" + n + "</PageSize>";
            }
            if (xmlMessage != null) {
                requestBody = requestBody + "<PageItemReference>" + com.ews.exchange.d.a(xmlMessage) + "</PageItemReference>";
            }
            if (searchPageDirection != SearchPageDirection.NONE) {
                requestBody = requestBody + "<PageDirection>" + com.ews.exchange.a.a(searchPageDirection) + "</PageDirection>";
            }
            if (b) {
                requestBody += "<SearchArchiveOnly>true</SearchArchiveOnly>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetNonIndexableItemDetails>");
            response = new GetNonIndexableItemDetailsResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            final String a2 = com.ews.exchange.a.a((response).getResponseCode());
            final String message = (response).getMessage();
            xmlMessage = (response).getXmlMessage();
            throw new ServiceException(a2, message, xmlMessage, requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetNonIndexableItemStatisticsResponse getNonIndexableItemStatistics(final String mailbox) throws ServiceException {
        return this.getNonIndexableItemStatistics(mailbox, false);
    }
    
    public GetNonIndexableItemStatisticsResponse getNonIndexableItemStatistics(final String mailbox, final boolean searchArchiveOnly) throws ServiceException {
        final ArrayList<String> mailboxes;
        (mailboxes = new ArrayList<String>()).add(mailbox);
        return this.getNonIndexableItemStatistics(mailboxes, searchArchiveOnly);
    }
    
    public GetNonIndexableItemStatisticsResponse getNonIndexableItemStatistics(final List<String> mailboxes) throws ServiceException {
        return this.getNonIndexableItemStatistics(mailboxes, false);
    }
    
    public GetNonIndexableItemStatisticsResponse getNonIndexableItemStatistics(final List<String> mailboxes, final boolean searchArchiveOnly) throws ServiceException {
        return this.b(mailboxes, searchArchiveOnly);
    }
    
    private GetNonIndexableItemStatisticsResponse b(List<String> a, final boolean b) throws ServiceException {
        String requestBody = null;GetNonIndexableItemStatisticsResponse response = null;
        try {
            requestBody = "<GetNonIndexableItemStatistics xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null && ((List)a).size() > 0) {
                requestBody += "<Mailboxes>";
                for (int i = 0; i < ((List)a).size(); ++i) {
                    requestBody = requestBody + "<t:LegacyDN>" + com.ews.exchange.d.a(((List<String>)a).get(i)) + "</t:LegacyDN>";
                }
                requestBody += "</Mailboxes>";
            }
            if (b) {
                requestBody += "<SearchArchiveOnly>true</SearchArchiveOnly>";
            }
            final String string;
            requestBody = (string = requestBody + "</GetNonIndexableItemStatistics>");
            response = new GetNonIndexableItemStatisticsResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetRemindersResponse getReminders() throws ServiceException {
        return this.getReminders(null, null, ReminderType.ALL);
    }
    
    public GetRemindersResponse getReminders(final ReminderType reminderType) throws ServiceException {
        return this.getReminders(null, null, reminderType);
    }
    
    public GetRemindersResponse getReminders(final Date beginTime, final Date endTime) throws ServiceException {
        return this.getReminders(beginTime, endTime, ReminderType.ALL);
    }
    
    public GetRemindersResponse getReminders(final Date beginTime, final Date endTime, final ReminderType reminderType) throws ServiceException {
        return this.getReminders(beginTime, endTime, reminderType, -1);
    }
    
    public GetRemindersResponse getReminders(final Date beginTime, final Date endTime, final int maxItems) throws ServiceException {
        return this.getReminders(beginTime, endTime, ReminderType.ALL, maxItems);
    }
    
    public GetRemindersResponse getReminders(final Date beginTime, final Date endTime, final ReminderType reminderType, final int maxItems) throws ServiceException {
        return this.a(beginTime, endTime, reminderType, maxItems);
    }
    
    private GetRemindersResponse a(Date var1, final Date var2, final ReminderType var3, final int var4) throws ServiceException {
        String var5 = null;

        GetRemindersResponse var16;
        try {
            var5 = "<GetReminders xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (var1 != null) {
                var5 = var5 + "<BeginTime>" + com.ews.exchange.d.a(var1) + "</BeginTime>";
            }

            if (var2 != null) {
                var5 = var5 + "<EndTime>" + com.ews.exchange.d.a(var2) + "</EndTime>";
            }

            if (var4 >= 0) {
                var5 = var5 + "<MaxItems>" + var4 + "</MaxItems>";
            }

            if (var3 != ReminderType.NONE) {
                var5 = var5 + "<ReminderType>" + (var3 == ReminderType.ALL ? "All" : (var3 == ReminderType.CURRENT ? "Current" : (var3 == ReminderType.OLD ? "Old" : "None"))) + "</ReminderType>";
            }

            var5 = var5 + "</GetReminders>";
            InputStream var15 = this.a(var5, true);
            var16 = new GetRemindersResponse(var15);
        } catch (ServiceException var12) {
            throw var12;
        } catch (Exception var13) {
            throw new ServiceException(var13.getMessage(), var13, var5);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var11) {
                throw new ServiceException(var11.getMessage(), var11, var5);
            }

        }

        if (var16.getResponseClass() == ResponseClass.ERROR) {
            String var18 = com.ews.exchange.a.a(var16.getResponseCode());
            String var19 = var16.getMessage();
            String var20 = var16.getXmlMessage();
            ServerVersionInfo var17 = var16.getServerVersionInfo();
            throw new ServiceException(var18, var19, var20, var5, var17);
        } else {
            return var16;
        }
    }
    
    public PerformReminderActionResponse performReminderAction(final ItemId ItemId, final ReminderActionType type) throws ServiceException {
        return this.performReminderAction(new ReminderItemAction(ItemId, type));
    }
    
    public PerformReminderActionResponse performReminderAction(final ItemId ItemId, final ReminderActionType type, final Date newReminderTime) throws ServiceException {
        return this.performReminderAction(new ReminderItemAction(ItemId, type, newReminderTime));
    }
    
    public PerformReminderActionResponse performReminderAction(final ReminderItemAction reminderItemAction) throws ServiceException {
        final ArrayList<ReminderItemAction> reminderItemActions;
        (reminderItemActions = new ArrayList<ReminderItemAction>()).add(reminderItemAction);
        return this.performReminderAction(reminderItemActions);
    }
    
    public PerformReminderActionResponse performReminderAction(final List<ReminderItemAction> reminderItemActions) throws ServiceException {
        return this.c(reminderItemActions);
    }
    
    private PerformReminderActionResponse c(List<ReminderItemAction> a) throws ServiceException {
        String requestBody = null;PerformReminderActionResponse response = null;
        try {
            requestBody = "<PerformReminderAction xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<ReminderItemActions>";
            final Iterator<ReminderItemAction> iterator = ((List<ReminderItemAction>)a).iterator();
            while (iterator.hasNext()) {
                requestBody += iterator.next().a();
            }
            requestBody += "</ReminderItemActions>";
            final String string;
            requestBody = (string = requestBody + "</PerformReminderAction>");
            response = new PerformReminderActionResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetUserPhotoResponse getUserPhoto(final String emailAddress, final UserPhotoSizeType type) throws ServiceException {
        return this.a(emailAddress, type);
    }
    
    private GetUserPhotoResponse a(String var1, final UserPhotoSizeType var2) throws ServiceException {
        String var3 = null;

        GetUserPhotoResponse var16;
        try {
            var3 = "<GetUserPhoto xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            var3 = var3 + "<Email>" + com.ews.exchange.d.a(var1) + "</Email>";
            var3 = var3 + "<SizeRequested>" + (var2 == UserPhotoSizeType.HR48x48 ? "HR48x48" : (var2 == UserPhotoSizeType.HR64x64 ? "HR64x64" : (var2 == UserPhotoSizeType.HR96x96 ? "HR96x96" : (var2 == UserPhotoSizeType.HR120x120 ? "HR120x120" : (var2 == UserPhotoSizeType.HR240x240 ? "HR240x240" : (var2 == UserPhotoSizeType.HR360x360 ? "HR360x360" : (var2 == UserPhotoSizeType.HR432x432 ? "HR432x432" : (var2 == UserPhotoSizeType.HR504x504 ? "HR504x504" : "HR648x648")))))))) + "</SizeRequested>";
            var3 = var3 + "</GetUserPhoto>";
            InputStream var15 = this.a(var3, true);
            var16 = new GetUserPhotoResponse(var15);
        } catch (ServiceException var11) {
            throw var11;
        } catch (Exception var12) {
            throw new ServiceException(var12.getMessage(), var12, var3);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var13) {
                throw new ServiceException(var13.getMessage(), var13, var3);
            }

        }

        if (var16.getResponseClass() == ResponseClass.ERROR) {
            String var18 = com.ews.exchange.a.a(var16.getResponseCode());
            String var4 = var16.getMessage();
            String var5 = var16.getXmlMessage();
            ServerVersionInfo var17 = var16.getServerVersionInfo();
            throw new ServiceException(var18, var4, var5, var3, var17);
        } else {
            return var16;
        }
    }
    
    public GetUserRetentionPolicyTagsResponse getUserRetentionPolicyTags() throws ServiceException {
        return this.d();
    }
    
    private GetUserRetentionPolicyTagsResponse d() throws ServiceException {
        final String requestBody = "<GetUserRetentionPolicyTags xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"></GetUserRetentionPolicyTags>";
        GetUserRetentionPolicyTagsResponse response = null;
        try {
            final String s = requestBody;
            response = new GetUserRetentionPolicyTagsResponse(this.a(s, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response installApp(final String manifest) throws ServiceException {
        return this.g(manifest);
    }
    
    private Response g(String a) throws ServiceException {
        String string = null;Response response = null;
        try {
            string = "<InstallApp xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string = string + "<Manifest>" + com.ews.exchange.d.a(a) + "</Manifest>";
            final String string2;
            string = (string2 = string + "</InstallApp>");
            response = f((InputStream)(this.a(string2, true)), "InstallAppResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response uninstallApp(final String id) throws ServiceException {
        return this.h(id);
    }
    
    private Response h(String a) throws ServiceException {
        String string = null; Response response = null;
        try {
            string = "<UninstallApp xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            string = string + "<ID>" + com.ews.exchange.d.a(a) + "</ID>";
            final String string2;
            string = (string2 = string + "</UninstallApp>");
            response = f((InputStream)(this.a(string2, true)), "UninstallAppResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response disableApp(final String id) throws ServiceException {
        return this.a(id, DisableReason.NONE);
    }
    
    public Response disableApp(final String id, final DisableReason reason) throws ServiceException {
        return this.a(id, reason);
    }
    
    private Response a(String var1, final DisableReason var2) throws ServiceException {
        String var3 = null;

        Response var15;
        try {
            var3 = "<DisableApp xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            var3 = var3 + "<ID>" + com.ews.exchange.d.a(var1) + "</ID>";
            var3 = var3 + "<DisableReason>" + (var2 == DisableReason.MOBILE_CLIENT_PERFORMANCE ? "MobileClientPerformance" : (var2 == DisableReason.OUTLOOK_CLIENT_PERFORMANCE ? "OutlookClientPerformance" : (var2 == DisableReason.OWA_CLIENT_PERFORMANCE ? "OWAClientPerformance" : "NoReason"))) + "</DisableReason>";
            var3 = var3 + "</DisableApp>";
            var15 = (Response)f(this.a(var3, true), "DisableAppResponse").get(0);
        } catch (ServiceException var11) {
            throw var11;
        } catch (Exception var12) {
            throw new ServiceException(var12.getMessage(), var12, var3);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var13) {
                throw new ServiceException(var13.getMessage(), var13, var3);
            }

        }

        if (var15.getResponseClass() == ResponseClass.ERROR) {
            String var17 = com.ews.exchange.a.a(var15.getResponseCode());
            String var4 = var15.getMessage();
            String var5 = var15.getXmlMessage();
            ServerVersionInfo var16 = var15.getServerVersionInfo();
            throw new ServiceException(var17, var4, var5, var3, var16);
        } else {
            return var15;
        }
    }
    
    public GetAppManifestsResponse getAppManifests() throws ServiceException {
        return this.e();
    }
    
    private GetAppManifestsResponse e() throws ServiceException {
        final String requestBody = "<GetAppManifests xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"></GetAppManifests>";
        GetAppManifestsResponse response;
        try {
            final String s = requestBody;
            response = new GetAppManifestsResponse(this.a(s, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetAppMarketplaceUrlResponse getAppMarketplaceUrl() throws ServiceException {
        return this.f();
    }
    
    private GetAppMarketplaceUrlResponse f() throws ServiceException {
        final String requestBody = "<GetAppMarketplaceUrl xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"></GetAppMarketplaceUrl>";
        GetAppMarketplaceUrlResponse response;
        try {
            final String s = requestBody;
            response = new GetAppMarketplaceUrlResponse(this.a(s, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public PerformReminderActionResponse getClientAccessToken(final String id, final ClientAccessTokenType type) throws ServiceException {
        return this.getClientAccessToken(new ClientAccessTokenRequest(id, type));
    }
    
    public PerformReminderActionResponse getClientAccessToken(final ClientAccessTokenRequest clientAccessTokenRequest) throws ServiceException {
        final ArrayList<ClientAccessTokenRequest> clientAccessTokenRequests;
        (clientAccessTokenRequests = new ArrayList<ClientAccessTokenRequest>()).add(clientAccessTokenRequest);
        return this.getClientAccessToken(clientAccessTokenRequests);
    }
    
    public PerformReminderActionResponse getClientAccessToken(final List<ClientAccessTokenRequest> clientAccessTokenRequests) throws ServiceException {
        return this.d(clientAccessTokenRequests);
    }
    
    private PerformReminderActionResponse d(List<ClientAccessTokenRequest> a) throws ServiceException {
        String requestBody = null;PerformReminderActionResponse response;
        try {
            requestBody = "<GetClientAccessToken xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<TokenRequests>";
            final Iterator<ClientAccessTokenRequest> iterator = ((List<ClientAccessTokenRequest>)a).iterator();
            while (iterator.hasNext()) {
                requestBody += iterator.next().a();
            }
            requestBody += "</TokenRequests>";
            final String string;
            requestBody = (string = requestBody + "</GetClientAccessToken>");
            response = new PerformReminderActionResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public HoldOnMailboxesInfo getHoldOnMailboxes(final String holdId) throws ServiceException {
        return this.i(holdId);
    }
    
    private HoldOnMailboxesInfo i(String a) throws ServiceException {
        String string = null;HoldOnMailboxesInfo holdOnMailboxesInfo;
        try {
            string = "<GetHoldOnMailboxes xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string = string + "<HoldId>" + com.ews.exchange.d.a(a) + "</HoldId>";
            }
            final String string2;
            string = (string2 = string + "</GetHoldOnMailboxes>");
            holdOnMailboxesInfo = new HoldOnMailboxesInfo(this.a(string2, true), "GetHoldOnMailboxesResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((holdOnMailboxesInfo).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((holdOnMailboxesInfo).getResponseCode()), (holdOnMailboxesInfo).getMessage(), (holdOnMailboxesInfo).getXmlMessage(), string, (holdOnMailboxesInfo).getServerVersionInfo());
        }
        return holdOnMailboxesInfo;
    }
    
    public HoldOnMailboxesInfo setHoldOnMailboxes(final HoldActionType actionType, final String holdId, final String query) throws ServiceException {
        return this.setHoldOnMailboxes(actionType, holdId, query, new ArrayList<String>(), null, false, false, null);
    }
    
    public HoldOnMailboxesInfo setHoldOnMailboxes(final HoldActionType actionType, final String holdId, final String query, final List<String> mailboxes, final String language, final boolean includeNonIndexableItems, final boolean deduplication, final String inPlaceHoldIdentity) throws ServiceException {
        return this.a(actionType, holdId, query, mailboxes, language, includeNonIndexableItems, deduplication, inPlaceHoldIdentity);
    }
    
    private HoldOnMailboxesInfo a(HoldActionType a, String responseCode, String message, final List<String> list, final String s, final boolean b, final boolean b2, final String s2) throws ServiceException {
        String requestBody = null;HoldOnMailboxesInfo holdOnMailboxesInfo;
        try {
            requestBody = "<SetHoldOnMailboxes xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody = requestBody + "<ActionType>" + (((a = a) == HoldActionType.CREATE) ? "Create" : ((a == HoldActionType.REMOVE) ? "Remove" : "Update")) + "</ActionType>";
            if (responseCode != null) {
                requestBody = requestBody + "<HoldId>" + com.ews.exchange.d.a(responseCode) + "</HoldId>";
            }
            if (message != null) {
                requestBody = requestBody + "<Query>" + com.ews.exchange.d.a(message) + "</Query>";
            }
            if (list != null && list.size() > 0) {
                requestBody += "<Mailboxes>";
                for (int i = 0; i < list.size(); ++i) {
                    requestBody = requestBody + "<t:String>" + com.ews.exchange.d.a(list.get(i)) + "</t:String>";
                }
                requestBody += "</Mailboxes>";
            }
            if (s != null) {
                requestBody = requestBody + "<Language>" + com.ews.exchange.d.a(s) + "</Language>";
            }
            if (b) {
                requestBody += "<IncludeNonIndexableItems>true</IncludeNonIndexableItems>";
            }
            if (b2) {
                requestBody += "<Deduplication>true</Deduplication>";
            }
            if (s2 != null) {
                requestBody = requestBody + "<InPlaceHoldIdentity>" + com.ews.exchange.d.a(s2) + "</InPlaceHoldIdentity>";
            }
            requestBody = (responseCode = requestBody + "</SetHoldOnMailboxes>");
            holdOnMailboxesInfo = new HoldOnMailboxesInfo(this.a(responseCode, true), "SetHoldOnMailboxesResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((holdOnMailboxesInfo).getResponseClass() == ResponseClass.ERROR) {
            responseCode = com.ews.exchange.a.a((holdOnMailboxesInfo).getResponseCode());
            message = (holdOnMailboxesInfo).getMessage();
            throw new ServiceException(responseCode, message, (holdOnMailboxesInfo).getXmlMessage(), requestBody, (holdOnMailboxesInfo).getServerVersionInfo());
        }
        return holdOnMailboxesInfo;
    }
    
    public FolderInfoResponse emptyFolder(final StandardFolder standardFolder) throws ServiceException {
        return this.emptyFolder(standardFolder, DeleteType.HARD_DELETE);
    }
    
    public FolderInfoResponse emptyFolder(final StandardFolder standardFolder, final DeleteType deleteType) throws ServiceException {
        return this.emptyFolder(standardFolder, deleteType, false);
    }
    
    public FolderInfoResponse emptyFolder(final StandardFolder standardFolder, final boolean deleteSubFolders) throws ServiceException {
        return this.emptyFolder(standardFolder, DeleteType.HARD_DELETE, deleteSubFolders);
    }
    
    public FolderInfoResponse emptyFolder(final StandardFolder standardFolder, final DeleteType deleteType, final boolean deleteSubFolders) throws ServiceException {
        return this.emptyFolder(new StandardFolderId(standardFolder), deleteType, deleteSubFolders);
    }
    
    public FolderInfoResponse emptyFolder(final FolderId folderId) throws ServiceException {
        return this.emptyFolder(folderId, DeleteType.HARD_DELETE);
    }
    
    public FolderInfoResponse emptyFolder(final FolderId folderId, final DeleteType deleteType) throws ServiceException {
        return this.emptyFolder(folderId, deleteType, false);
    }
    
    public FolderInfoResponse emptyFolder(final FolderId folderId, final boolean deleteSubFolders) throws ServiceException {
        return this.emptyFolder(folderId, DeleteType.HARD_DELETE, deleteSubFolders);
    }
    
    public FolderInfoResponse emptyFolder(final FolderId folderId, final DeleteType deleteType, final boolean deleteSubFolders) throws ServiceException {
        final ArrayList<FolderId> folders;
        (folders = new ArrayList<FolderId>()).add(folderId);
        return this.emptyFolder(folders, deleteType, deleteSubFolders).get(0);
    }
    
    public List<FolderInfoResponse> emptyFolder(final List<FolderId> folders) throws ServiceException {
        return this.emptyFolder(folders, DeleteType.HARD_DELETE);
    }
    
    public List<FolderInfoResponse> emptyFolder(final List<FolderId> folders, final DeleteType deleteType) throws ServiceException {
        return this.emptyFolder(folders, deleteType, false);
    }
    
    public List<FolderInfoResponse> emptyFolder(final List<FolderId> folders, final boolean deleteSubFolders) throws ServiceException {
        return this.emptyFolder(folders, DeleteType.HARD_DELETE, deleteSubFolders);
    }
    
    public List<FolderInfoResponse> emptyFolder(final List<FolderId> folders, final DeleteType deleteType, final boolean deleteSubFolders) throws ServiceException {
        return this.a(folders, deleteType, deleteSubFolders);
    }
    
    private List<FolderInfoResponse> a(final List<FolderId> list, final DeleteType deleteType, final boolean b) throws ServiceException {
        String requestBody = null;List<FolderInfoResponse> folderInfoResponseList = new ArrayList<>();
        try {
            final String string = " DeleteType=\"" + com.ews.exchange.a.a(deleteType) + "\"";
            final String s = b ? " DeleteSubFolders=\"true\"" : " DeleteSubFolders=\"false\"";
            final String i = i(list);
            requestBody = "<EmptyFolder xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"" + string + s + ">";
            requestBody += i;
            requestBody += "</EmptyFolder>";
            folderInfoResponseList = b(this.a(requestBody, true), "EmptyFolderResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if (folderInfoResponseList.size() == 1 && folderInfoResponseList.get(0).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(folderInfoResponseList.get(0).getResponseCode()), folderInfoResponseList.get(0).getMessage(), folderInfoResponseList.get(0).getXmlMessage(), requestBody, folderInfoResponseList.get(0).getServerVersionInfo());
        }
        return folderInfoResponseList;
    }
    
    public ExportItemsResponse exportItems(final ItemId itemId) throws ServiceException {
        final ArrayList<ItemId> itemIds;
        (itemIds = new ArrayList<ItemId>()).add(itemId);
        return this.exportItems(itemIds).get(0);
    }
    
    public List<ExportItemsResponse> exportItems(final List<ItemId> itemIds) throws ServiceException {
        return this.e(itemIds);
    }
    
    private List<ExportItemsResponse> e(List<ItemId> o) throws ServiceException {
        String requestBody = null;List<ExportItemsResponse> exportItemsResponseList = new ArrayList<>();
        try {
            requestBody = "<ExportItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (o != null && ((List)o).size() > 0) {
                requestBody += "<ItemIds>";
                for (int i = 0; i < ((List)o).size(); ++i) {
                    requestBody += ((List<ItemId>)o).get(i).a();
                }
                requestBody += "</ItemIds>";
            }
            final String string;
            requestBody = (string = requestBody + "</ExportItems>");
            exportItemsResponseList = c((InputStream)(this.a(string, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((exportItemsResponseList).size() == 1 && ((exportItemsResponseList).get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((exportItemsResponseList).get(0)).getResponseCode()), ((exportItemsResponseList).get(0)).getMessage(), ((exportItemsResponseList).get(0)).getXmlMessage(), requestBody, ((exportItemsResponseList).get(0)).getServerVersionInfo());
        }
        return exportItemsResponseList;
    }
    
    public InputStream getExportItemsInputStream(final ItemId itemId) throws ServiceException {
        final ArrayList<ItemId> list;
        (list = new ArrayList<>()).add(itemId);
        return this.f(list);
    }
    
    private InputStream f(final List<ItemId> list) throws ServiceException {
        String requestBody = null;
        InputStream a;
        try {
            requestBody = "<ExportItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (list.size() > 0) {
                requestBody += "<ItemIds>";
                for (int i = 0; i < list.size(); ++i) {
                    requestBody += list.get(i).a();
                }
                requestBody += "</ItemIds>";
            }
            requestBody += "</ExportItems>";
            a = this.a(requestBody, true);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        return a;
    }
    
    public MarkAsJunkResponse markAsJunk(final ItemId itemId) throws ServiceException {
        return this.markAsJunk(itemId, true);
    }
    
    public MarkAsJunkResponse markAsJunk(final ItemId itemId, final boolean isJunk) throws ServiceException {
        return this.markAsJunk(itemId, isJunk, isJunk);
    }
    
    public MarkAsJunkResponse markAsJunk(final ItemId itemId, final boolean isJunk, final boolean moveItem) throws ServiceException {
        final ArrayList<ItemId> itemIds;
        (itemIds = new ArrayList<ItemId>()).add(itemId);
        return this.markAsJunk(itemIds, isJunk, moveItem).get(0);
    }
    
    public List<MarkAsJunkResponse> markAsJunk(final List<ItemId> itemIds) throws ServiceException {
        return this.markAsJunk(itemIds, true);
    }
    
    public List<MarkAsJunkResponse> markAsJunk(final List<ItemId> itemIds, final boolean isJunk) throws ServiceException {
        return this.markAsJunk(itemIds, isJunk, isJunk);
    }
    
    public List<MarkAsJunkResponse> markAsJunk(final List<ItemId> itemIds, final boolean isJunk, final boolean moveItem) throws ServiceException {
        return this.b(itemIds, isJunk, moveItem);
    }
    
    private List<MarkAsJunkResponse> b(List<ItemId> var1, boolean var2, final boolean var3) throws ServiceException {
        String var4 = "";List<MarkAsJunkResponse> markAsJunkResponseList = new ArrayList<>();
        if (var2) {
            var4 = var4 + " IsJunk=\"true\"";
        } else {
            var4 = var4 + " IsJunk=\"false\"";
        }

        if (var3) {
            var4 = var4 + " MoveItem=\"true\"";
        } else {
            var4 = var4 + " MoveItem=\"false\"";
        }

        String var16 = "<MarkAsJunk xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"" + var4 + ">";
        if (var1 != null && var1.size() > 0) {
            var16 = var16 + "<ItemIds>";

            for(int var17 = 0; var17 < var1.size(); ++var17) {
                var16 = var16 + ((ItemId)var1.get(var17)).a();
            }

            var16 = var16 + "</ItemIds>";
        }

        var16 = var16 + "</MarkAsJunk>";

        try {
            markAsJunkResponseList = b(this.a(var16, true));
        } catch (ServiceException var11) {
            throw var11;
        } catch (Exception var12) {
            throw new ServiceException(var12.getMessage(), var12, var16);
        } finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }

                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            } catch (IOException var13) {
                throw new ServiceException(var13.getMessage(), var13, var16);
            }

        }

        if (markAsJunkResponseList.size() == 1 && (markAsJunkResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            String var18 = com.ews.exchange.a.a((markAsJunkResponseList.get(0)).getResponseCode());
            var4 = (markAsJunkResponseList.get(0)).getMessage();
            String var5 = (markAsJunkResponseList.get(0)).getXmlMessage();
            ServerVersionInfo var15 = (markAsJunkResponseList.get(0)).getServerVersionInfo();
            throw new ServiceException(var18, var4, var5, var16, var15);
        } else {
            return markAsJunkResponseList;
        }
    }
    
    public UploadItemsResponse uploadItems(final UploadItem item) throws ServiceException {
        final ArrayList<UploadItem> items;
        (items = new ArrayList<UploadItem>()).add(item);
        return this.uploadItems(items).get(0);
    }
    
    public List<UploadItemsResponse> uploadItems(final List<UploadItem> items) throws ServiceException {
        return this.g(items);
    }
    
    private List<UploadItemsResponse> g(List<UploadItem> o) throws ServiceException {
        String requestBody = null;List<UploadItemsResponse> uploadItemsResponseList = new ArrayList<>();
        try {
            requestBody = "<UploadItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (o != null && ((List)o).size() > 0) {
                requestBody += "<Items>";
                for (int i = 0; i < ((List)o).size(); ++i) {
                    requestBody += ((List<UploadItem>)o).get(i).a();
                }
                requestBody += "</Items>";
            }
            final String string;
            requestBody = (string = requestBody + "</UploadItems>");
            uploadItemsResponseList = a((InputStream)(this.a(string, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((uploadItemsResponseList).size() == 1 && (uploadItemsResponseList.get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((uploadItemsResponseList).get(0)).getResponseCode()), ((uploadItemsResponseList).get(0)).getMessage(), ((uploadItemsResponseList).get(0)).getXmlMessage(), requestBody, ((uploadItemsResponseList).get(0)).getServerVersionInfo());
        }
        return uploadItemsResponseList;
    }
    
    public Response applyConversationAction(final ConversationAction conversationAction) throws ServiceException {
        final ArrayList<ConversationAction> conversationActions;
        (conversationActions = new ArrayList<ConversationAction>()).add(conversationAction);
        return this.applyConversationAction(conversationActions).get(0);
    }
    
    public List<Response> applyConversationAction(final List<ConversationAction> conversationActions) throws ServiceException {
        return this.h(conversationActions);
    }
    
    private List<Response> h(List<ConversationAction> o) throws ServiceException {
        String requestBody = null;List<Response> responseList = new ArrayList<>();
        try {
            requestBody = "<ApplyConversationAction xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            requestBody += "<ConversationActions>";
            for (int i = 0; i < ((List)o).size(); ++i) {
                requestBody += ((List<ConversationAction>)o).get(i).a();
            }
            requestBody += "</ConversationActions>";
            final String string;
            requestBody = (string = requestBody + "</ApplyConversationAction>");
            responseList = f((InputStream)(this.a(string, true)), "ApplyConversationActionResponseMessage");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((responseList).size() == 1 && ((responseList).get(0)).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(((responseList).get(0)).getResponseCode()), ((responseList).get(0)).getMessage(), ((responseList).get(0)).getXmlMessage(), requestBody, ((responseList).get(0)).getServerVersionInfo());
        }
        return responseList;
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, queryString);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final View view) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse FindConfindConversationversation(final StandardFolder standardFolder, final View view) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal, final View view) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(standardFolder, null, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder) throws ServiceException {
        return this.findConversation(standardFolder, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape) throws ServiceException {
        return this.findConversation(standardFolder, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal) throws ServiceException {
        return this.findConversation(standardFolder, shape, traversal, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view) throws ServiceException {
        return this.findConversation(standardFolder, shape, traversal, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(standardFolder, shape, traversal, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(standardFolder, shape, traversal, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(standardFolder, shape, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final StandardFolder standardFolder, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(new StandardFolderId(standardFolder), shape, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final View view) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final View view) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal, final View view) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.findConversation(parentFolderId, null, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId) throws ServiceException {
        return this.findConversation(parentFolderId, null, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape) throws ServiceException {
        return this.findConversation(parentFolderId, shape, ConversationQueryTraversal.SHALLOW, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal) throws ServiceException {
        return this.findConversation(parentFolderId, shape, traversal, null, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view) throws ServiceException {
        return this.findConversation(parentFolderId, shape, traversal, view, ViewFilter.NONE, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter) throws ServiceException {
        return this.findConversation(parentFolderId, shape, traversal, view, viewFilter, null, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder) throws ServiceException {
        return this.findConversation(parentFolderId, shape, traversal, view, viewFilter, propertyOrder, MailboxSearchLocation.NONE, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation) throws ServiceException {
        return this.findConversation(parentFolderId, shape, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, null);
    }
    
    public FindConversationResponse findConversation(final FolderId parentFolderId, final ConversationShape shape, final ConversationQueryTraversal traversal, final View view, final ViewFilter viewFilter, final List<PropertyOrder> propertyOrder, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        return this.a(parentFolderId, shape, traversal, view, viewFilter, propertyOrder, mailboxSearchLocation, queryString);
    }
    
    private FindConversationResponse a(FolderId a, ConversationShape conversationShape, ConversationQueryTraversal conversationQueryTraversal, View view, final ViewFilter viewFilter, final List<PropertyOrder> list, final MailboxSearchLocation mailboxSearchLocation, final QueryString queryString) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("parentFolderId is null.");
        }
        if (conversationShape == null) {
            conversationShape = new ConversationShape(ShapeType.ALL_PROPERTIES);
        }
        if (view == null) {
            view = new IndexedPageView(0, IndexBasePoint.BEGINNING, 100);
        }
        String requestBody = null;FindConversationResponse response;
        try {
            String s = "";
            if (this.g == RequestServerVersion.EXCHANGE_2013 || this.g == RequestServerVersion.EXCHANGE_2013_SP1 || this.g == RequestServerVersion.EXCHANGE_2016) {
                s = s + " Traversal=\"" + (((conversationQueryTraversal = conversationQueryTraversal) == ConversationQueryTraversal.DEEP) ? "Deep" : "Shallow") + "\"";
                if (viewFilter != ViewFilter.NONE) {
                    s = s + " ViewFilter=\"" + ((viewFilter == ViewFilter.ALL) ? "All" : ((viewFilter == ViewFilter.FLAGGED) ? "Flagged" : ((viewFilter == ViewFilter.HAS_ATTACHMENT) ? "HasAttachment" : ((viewFilter == ViewFilter.SUGGESTIONS) ? "Suggestions" : ((viewFilter == ViewFilter.SUGGESTIONS_DELETE) ? "SuggestionsDelete" : ((viewFilter == ViewFilter.SUGGESTIONS_RESPOND) ? "SuggestionsRespond" : ((viewFilter == ViewFilter.TASK_ACTIVE) ? "TaskActive" : ((viewFilter == ViewFilter.TASK_COMPLETED) ? "TaskCompleted" : ((viewFilter == ViewFilter.TASK_OVERDUE) ? "TaskOverdue" : ((viewFilter == ViewFilter.TO_OR_CC_ME) ? "ToOrCcMe" : ((viewFilter == ViewFilter.UNREAD) ? "Unread" : "None"))))))))))) + "\"";
                }
            }
            requestBody = "<FindConversation xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\"" + s + ">";
            if (view != null) {
                if (view instanceof IndexedPageView) {
                    requestBody += view.a("IndexedPageItemView");
                }
                else {
                    if (!(view instanceof SeekToConditionPageItemView)) {
                        throw new IllegalArgumentException("Not supported view type: " + view);
                    }
                    requestBody += view.a("SeekToConditionPageItemView");
                }
            }
            if (list != null && list.size() > 0) {
                requestBody += "<SortOrder>";
                for (int i = 0; i < list.size(); ++i) {
                    requestBody += list.get(i).toString();
                }
                requestBody += "</SortOrder>";
            }
            if (a != null) {
                requestBody = requestBody + "<ParentFolderId>" + a.a() + "</ParentFolderId>";
            }
            if (this.g == RequestServerVersion.EXCHANGE_2013 || this.g == RequestServerVersion.EXCHANGE_2013_SP1 || this.g == RequestServerVersion.EXCHANGE_2016) {
                if (queryString != null) {
                    if (mailboxSearchLocation != MailboxSearchLocation.NONE) {
                        requestBody = requestBody + "<MailboxScope>" + com.ews.exchange.a.a(mailboxSearchLocation) + "</MailboxScope>";
                    }
                    requestBody += queryString.a();
                }
                if (conversationShape != null) {
                    this.k(conversationShape.getPropertyPaths());
                    requestBody += conversationShape.toString();
                }
            }
            final String string;
            requestBody = (string = requestBody + "</FindConversation>");
            response = new FindConversationResponse(this.a(string, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public FindMailboxStatisticsByKeywordsResponse findMailboxStatisticsByKeywords(final MailboxStatisticsByKeywords mailboxStatisticsByKeywords) throws ServiceException {
        return this.a(mailboxStatisticsByKeywords);
    }
    
    private FindMailboxStatisticsByKeywordsResponse a(MailboxStatisticsByKeywords a) throws ServiceException {
        String string = null;
        FindMailboxStatisticsByKeywordsResponse findMailboxStatisticsByKeywordsResponse = null;
        try {
            string = "<FindMailboxStatisticsByKeywords xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
            if (a != null) {
                string += a.a();
            }
            final String string2;
            string = (string2 = string + "</FindMailboxStatisticsByKeywords>");
            findMailboxStatisticsByKeywordsResponse = new FindMailboxStatisticsByKeywordsResponse(this.a(string2, true));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if (findMailboxStatisticsByKeywordsResponse.getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a(findMailboxStatisticsByKeywordsResponse.getResponseCode()), findMailboxStatisticsByKeywordsResponse.getMessage(), findMailboxStatisticsByKeywordsResponse.getXmlMessage(), string, findMailboxStatisticsByKeywordsResponse.getServerVersionInfo());
        }
        return findMailboxStatisticsByKeywordsResponse;
    }
    
    public com.ews.msg.Message getMessageFile(final String itemId) throws ServiceException, ParseException {
        return this.getMessageFile(new ItemId(itemId));
    }
    
    public com.ews.msg.Message getMessageFile(final String itemId, final List<ExtendedPropertyPath> customPropertyPaths) throws ServiceException, ParseException {
        return this.getMessageFile(new ItemId(itemId), customPropertyPaths);
    }
    
    public com.ews.msg.Message getMessageFile(final ItemId itemId) throws ServiceException, ParseException {
        return this.getMessageFile(itemId, new ArrayList<ExtendedPropertyPath>());
    }
    
    public com.ews.msg.Message getMessageFile(final ItemId itemId, final List<ExtendedPropertyPath> customPropertyPaths) throws ServiceException, ParseException {
        return this.a(itemId, customPropertyPaths);
    }
    
    private com.ews.msg.Message a(final ItemId itemId, final List<ExtendedPropertyPath> list) throws ServiceException, ParseException {
        final PropertyId propertyId = new PropertyId(34132, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        final PropertyId propertyPath = new PropertyId(34130, StandardPropertySet.COMMON, MapiPropertyType.INTEGER);
        final PropertyId propertyPath2 = new PropertyId(34070, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyPath3 = new PropertyId(34071, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyPath4 = new PropertyId(34144, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyId2 = new PropertyId(33315, StandardPropertySet.APPOINTMENT, MapiPropertyType.BOOLEAN);
        final PropertyId propertyPath5 = new PropertyId(34050, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyPath6 = new PropertyId(34049, StandardPropertySet.COMMON, MapiPropertyType.INTEGER);
        final PropertyId propertyPath7 = new PropertyId(34105, StandardPropertySet.COMMON, MapiPropertyType.STRING_ARRAY);
        final UnindexedPropertyPath unindexedPropertyPath = new UnindexedPropertyPath("item:Categories");
        final PropertyId propertyId3 = new PropertyId(34101, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        final PropertyId propertyId4 = new PropertyId(34100, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        final PropertyId propertyId5 = new PropertyId(34079, StandardPropertySet.COMMON, MapiPropertyType.STRING);
        final PropertyId propertyId6 = new PropertyId(34054, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId7 = new PropertyId(34051, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId8 = new PropertyId(34076, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId9 = new PropertyId(34078, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        final PropertyId propertyPath8 = new PropertyId(33293, StandardPropertySet.APPOINTMENT, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyPath9 = new PropertyId(33294, StandardPropertySet.APPOINTMENT, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyId10 = new PropertyId(33301, StandardPropertySet.APPOINTMENT, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId11 = new PropertyId(33288, StandardPropertySet.APPOINTMENT, MapiPropertyType.STRING);
        final PropertyId propertyPath10 = new PropertyId(33285, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final PropertyId propertyId12 = new PropertyId(33303, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final PropertyId propertyId13 = new PropertyId(33304, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final PropertyId propertyPath11 = new PropertyId(33329, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final CustomPropertyId customPropertyId = new CustomPropertyId(36, "6ed8da90-450b-101b-98da-00aa003f1305", MapiPropertyType.STRING);
        final PropertyId propertyId14 = new PropertyId(33332, StandardPropertySet.APPOINTMENT, MapiPropertyType.STRING);
        final PropertyId propertyId15 = new PropertyId(3, StandardPropertySet.APPOINTMENT, MapiPropertyType.STRING);
        final CustomPropertyId propertyPath12 = new CustomPropertyId(34078, "6ed8da90-450b-101b-98da-00aa003f1305", MapiPropertyType.BINARY_ARRAY);
        final PropertyId propertyPath13 = new PropertyId(33300, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final PropertyId propertyPath14 = new PropertyId(33299, StandardPropertySet.APPOINTMENT, MapiPropertyType.INTEGER);
        final PropertyId propertyPath15 = new PropertyId(33028, StandardPropertySet.TASK, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyPath16 = new PropertyId(33029, StandardPropertySet.TASK, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyId16 = new PropertyId(33055, StandardPropertySet.TASK, MapiPropertyType.STRING);
        final PropertyId propertyId17 = new PropertyId(33057, StandardPropertySet.TASK, MapiPropertyType.STRING);
        final PropertyId propertyPath17 = new PropertyId(33026, StandardPropertySet.TASK, MapiPropertyType.DOUBLE);
        final PropertyId propertyPath18 = new PropertyId(33040, StandardPropertySet.TASK, MapiPropertyType.INTEGER);
        final PropertyId propertyPath19 = new PropertyId(33041, StandardPropertySet.TASK, MapiPropertyType.INTEGER);
        final PropertyId propertyId18 = new PropertyId(33027, StandardPropertySet.TASK, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId19 = new PropertyId(33052, StandardPropertySet.TASK, MapiPropertyType.BOOLEAN);
        final PropertyId propertyPath20 = new PropertyId(33039, StandardPropertySet.TASK, MapiPropertyType.SYSTEM_TIME);
        final PropertyId propertyId20 = new PropertyId(33025, StandardPropertySet.TASK, MapiPropertyType.INTEGER);
        final PropertyId propertyId21 = new PropertyId(33065, StandardPropertySet.TASK, MapiPropertyType.INTEGER);
        final PropertyId propertyId22 = new PropertyId(33066, StandardPropertySet.TASK, MapiPropertyType.INTEGER);
        final CustomPropertyId propertyPath21 = new CustomPropertyId(35586, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final CustomPropertyId propertyPath22 = new CustomPropertyId(35587, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final CustomPropertyId propertyPath23 = new CustomPropertyId(35588, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final CustomPropertyId propertyPath24 = new CustomPropertyId(35589, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final CustomPropertyId customPropertyId2 = new CustomPropertyId(35584, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final CustomPropertyId propertyPath25 = new CustomPropertyId(34566, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.SYSTEM_TIME);
        final CustomPropertyId propertyPath26 = new CustomPropertyId(34568, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.SYSTEM_TIME);
        final CustomPropertyId customPropertyId3 = new CustomPropertyId(34560, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.STRING);
        final CustomPropertyId customPropertyId4 = new CustomPropertyId(34578, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.STRING);
        final CustomPropertyId propertyPath27 = new CustomPropertyId(34567, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        final PropertyId propertyId23 = new PropertyId(32802, StandardPropertySet.ADDRESS, MapiPropertyType.INTEGER);
        final PropertyId propertyId24 = new PropertyId(32789, StandardPropertySet.ADDRESS, MapiPropertyType.BOOLEAN);
        final PropertyId propertyId25 = new PropertyId(32773, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId26 = new PropertyId(32866, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId27 = new PropertyId(32984, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId28 = new PropertyId(32795, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId29 = new PropertyId(32794, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId30 = new PropertyId(32796, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId31 = new PropertyId(32899, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId32 = new PropertyId(32915, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId33 = new PropertyId(32931, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId34 = new PropertyId(32900, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId35 = new PropertyId(32916, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId36 = new PropertyId(32932, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId37 = new PropertyId(32896, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId38 = new PropertyId(32912, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId39 = new PropertyId(32928, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId40 = new PropertyId(32898, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId41 = new PropertyId(32914, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId42 = new PropertyId(32930, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        final PropertyId propertyId43 = new PropertyId(32901, StandardPropertySet.ADDRESS, MapiPropertyType.BINARY);
        final PropertyId propertyId44 = new PropertyId(32917, StandardPropertySet.ADDRESS, MapiPropertyType.BINARY);
        final PropertyId propertyId45 = new PropertyId(32933, StandardPropertySet.ADDRESS, MapiPropertyType.BINARY);
        final ArrayList<PropertyPath> propertyPaths;
        (propertyPaths = new ArrayList<PropertyPath>()).add(MapiPropertyTag.PR_MESSAGE_CLASS);
        propertyPaths.add(MapiPropertyTag.PR_SUBJECT);
        propertyPaths.add(MapiPropertyTag.PR_SUBJECT_PREFIX);
        propertyPaths.add(MapiPropertyTag.PR_CONVERSATION_TOPIC);
        propertyPaths.add(MapiPropertyTag.PR_DISPLAY_BCC);
        propertyPaths.add(MapiPropertyTag.PR_DISPLAY_CC);
        propertyPaths.add(MapiPropertyTag.PR_DISPLAY_TO);
        propertyPaths.add(MapiPropertyTag.PR_REPLY_RECIPIENT_NAMES);
        propertyPaths.add(MapiPropertyTag.PR_NORMALIZED_SUBJECT);
        propertyPaths.add(MapiPropertyTag.PR_BODY);
        propertyPaths.add(MapiPropertyTag.PR_RTF_COMPRESSED);
        propertyPaths.add(MapiPropertyTag.PR_SEARCH_KEY);
        propertyPaths.add(MapiPropertyTag.PR_ENTRYID);
        propertyPaths.add(MapiPropertyTag.PR_CREATION_TIME);
        propertyPaths.add(MapiPropertyTag.PR_LAST_MODIFICATION_TIME);
        propertyPaths.add(MapiPropertyTag.PR_MESSAGE_DELIVERY_TIME);
        propertyPaths.add(MapiPropertyTag.PR_CLIENT_SUBMIT_TIME);
        propertyPaths.add(MapiPropertyTag.PR_CREATOR_NAME);
        propertyPaths.add(MapiPropertyTag.PR_LAST_MODIFIER_NAME);
        propertyPaths.add(MapiPropertyTag.PR_INTERNET_MESSAGE_ID);
        propertyPaths.add(MapiPropertyTag.PR_CONVERSATION_INDEX);
        propertyPaths.add(MapiPropertyTag.PR_ATTR_HIDDEN);
        propertyPaths.add(MapiPropertyTag.PR_ATTR_READONLY);
        propertyPaths.add(MapiPropertyTag.PR_ATTR_SYSTEM);
        propertyPaths.add(MapiPropertyTag.PR_HASATTACH);
        propertyPaths.add(MapiPropertyTag.PR_RTF_IN_SYNC);
        propertyPaths.add(MapiPropertyTag.PR_READ_RECEIPT_REQUESTED);
        propertyPaths.add(MapiPropertyTag.PR_ORIGINATOR_DELIVERY_REPORT_REQUESTED);
        propertyPaths.add(MapiPropertyTag.PR_HTML);
        propertyPaths.add(MapiPropertyTag.PR_SENSITIVITY);
        propertyPaths.add(MapiPropertyTag.PR_IMPORTANCE);
        propertyPaths.add(MapiPropertyTag.PR_PRIORITY);
        propertyPaths.add(MapiPropertyTag.PR_FLAG_ICON);
        propertyPaths.add(MapiPropertyTag.PR_FLAG_STATUS);
        propertyPaths.add(MapiPropertyTag.PR_RCVD_REPRESENTING_ADDRTYPE);
        propertyPaths.add(MapiPropertyTag.PR_RCVD_REPRESENTING_EMAIL_ADDRESS);
        propertyPaths.add(MapiPropertyTag.PR_RCVD_REPRESENTING_ENTRYID);
        propertyPaths.add(MapiPropertyTag.PR_RCVD_REPRESENTING_NAME);
        propertyPaths.add(MapiPropertyTag.PR_RCVD_REPRESENTING_SEARCH_KEY);
        propertyPaths.add(MapiPropertyTag.PR_RECEIVED_BY_ADDRTYPE);
        propertyPaths.add(MapiPropertyTag.PR_RECEIVED_BY_EMAIL_ADDRESS);
        propertyPaths.add(MapiPropertyTag.PR_RECEIVED_BY_ENTRYID);
        propertyPaths.add(MapiPropertyTag.PR_RECEIVED_BY_NAME);
        propertyPaths.add(MapiPropertyTag.PR_RECEIVED_BY_SEARCH_KEY);
        propertyPaths.add(MapiPropertyTag.PR_SENDER_ADDRTYPE);
        propertyPaths.add(MapiPropertyTag.PR_SENDER_EMAIL_ADDRESS);
        propertyPaths.add(MapiPropertyTag.PR_SENDER_ENTRYID);
        propertyPaths.add(MapiPropertyTag.PR_SENDER_NAME);
        propertyPaths.add(MapiPropertyTag.PR_SENDER_SEARCH_KEY);
        propertyPaths.add(MapiPropertyTag.PR_SENT_REPRESENTING_ADDRTYPE);
        propertyPaths.add(MapiPropertyTag.PR_SENT_REPRESENTING_EMAIL_ADDRESS);
        propertyPaths.add(MapiPropertyTag.PR_SENT_REPRESENTING_ENTRYID);
        propertyPaths.add(MapiPropertyTag.PR_SENT_REPRESENTING_NAME);
        propertyPaths.add(MapiPropertyTag.PR_SENT_REPRESENTING_SEARCH_KEY);
        propertyPaths.add(MapiPropertyTag.PR_TRANSPORT_MESSAGE_HEADERS);
        propertyPaths.add(MapiPropertyTag.PR_LAST_VERB_EXECUTED);
        propertyPaths.add(MapiPropertyTag.PR_LAST_VERB_EXECUTION_TIME);
        propertyPaths.add(MapiPropertyTag.PR_MESSAGE_FLAGS);
        propertyPaths.add(MapiPropertyTag.PR_MESSAGE_CODEPAGE);
        propertyPaths.add(MapiPropertyTag.PR_INTERNET_CPID);
        propertyPaths.add(propertyId);
        propertyPaths.add(propertyPath);
        propertyPaths.add(propertyPath2);
        propertyPaths.add(propertyPath3);
        propertyPaths.add(propertyPath4);
        propertyPaths.add(propertyId2);
        propertyPaths.add(propertyPath5);
        propertyPaths.add(propertyPath6);
        propertyPaths.add(propertyPath7);
        propertyPaths.add(unindexedPropertyPath);
        propertyPaths.add(propertyId3);
        propertyPaths.add(propertyId4);
        propertyPaths.add(propertyId5);
        propertyPaths.add(propertyId6);
        propertyPaths.add(propertyId7);
        propertyPaths.add(propertyId8);
        propertyPaths.add(propertyId9);
        propertyPaths.add(propertyPath8);
        propertyPaths.add(propertyPath9);
        propertyPaths.add(propertyId10);
        propertyPaths.add(propertyId11);
        propertyPaths.add(propertyPath10);
        propertyPaths.add(propertyId12);
        propertyPaths.add(propertyId13);
        propertyPaths.add(propertyPath11);
        propertyPaths.add(customPropertyId);
        propertyPaths.add(propertyId14);
        propertyPaths.add(propertyId15);
        propertyPaths.add(propertyPath12);
        propertyPaths.add(propertyPath13);
        propertyPaths.add(propertyPath14);
        propertyPaths.add(propertyPath15);
        propertyPaths.add(propertyPath16);
        propertyPaths.add(propertyId16);
        propertyPaths.add(propertyId17);
        propertyPaths.add(propertyPath17);
        propertyPaths.add(propertyPath18);
        propertyPaths.add(propertyPath19);
        propertyPaths.add(propertyId18);
        propertyPaths.add(propertyId19);
        propertyPaths.add(propertyPath20);
        propertyPaths.add(propertyId20);
        propertyPaths.add(propertyId21);
        propertyPaths.add(propertyId22);
        propertyPaths.add(propertyPath21);
        propertyPaths.add(propertyPath22);
        propertyPaths.add(propertyPath23);
        propertyPaths.add(propertyPath24);
        propertyPaths.add(customPropertyId2);
        propertyPaths.add(propertyPath25);
        propertyPaths.add(propertyPath26);
        propertyPaths.add(customPropertyId3);
        propertyPaths.add(customPropertyId4);
        propertyPaths.add(propertyPath27);
        propertyPaths.add(MapiPropertyTag.PR_BIRTHDAY);
        propertyPaths.add(MapiPropertyTag.PR_CHILDRENS_NAMES);
        propertyPaths.add(MapiPropertyTag.PR_ASSISTANT);
        propertyPaths.add(MapiPropertyTag.PR_ASSISTANT_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS2_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_FAX_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_HOME_PAGE);
        propertyPaths.add(MapiPropertyTag.PR_CALLBACK_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_CAR_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_CELLULAR_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_COMPANY_MAIN_PHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_COMPUTER_NETWORK_NAME);
        propertyPaths.add(MapiPropertyTag.PR_CUSTOMER_ID);
        propertyPaths.add(MapiPropertyTag.PR_DEPARTMENT_NAME);
        propertyPaths.add(MapiPropertyTag.PR_DISPLAY_NAME);
        propertyPaths.add(MapiPropertyTag.PR_DISPLAY_NAME_PREFIX);
        propertyPaths.add(MapiPropertyTag.PR_FTP_SITE);
        propertyPaths.add(MapiPropertyTag.PR_GENERATION);
        propertyPaths.add(MapiPropertyTag.PR_GIVEN_NAME);
        propertyPaths.add(MapiPropertyTag.PR_GOVERNMENT_ID_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_HOBBIES);
        propertyPaths.add(MapiPropertyTag.PR_HOME2_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_CITY);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_COUNTRY);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_POSTAL_CODE);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_POST_OFFICE_BOX);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_STATE_OR_PROVINCE);
        propertyPaths.add(MapiPropertyTag.PR_HOME_ADDRESS_STREET);
        propertyPaths.add(MapiPropertyTag.PR_HOME_FAX_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_HOME_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_INITIALS);
        propertyPaths.add(MapiPropertyTag.PR_ISDN_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_MANAGER_NAME);
        propertyPaths.add(MapiPropertyTag.PR_MIDDLE_NAME);
        propertyPaths.add(MapiPropertyTag.PR_NICKNAME);
        propertyPaths.add(MapiPropertyTag.PR_OFFICE_LOCATION);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_ADDRESS_CITY);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_ADDRESS_COUNTRY);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_ADDRESS_POSTAL_CODE);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_ADDRESS_STATE_OR_PROVINCE);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_ADDRESS_STREET);
        propertyPaths.add(MapiPropertyTag.PR_OTHER_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_PAGER_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_POSTAL_ADDRESS);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_COUNTRY);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_CITY);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_POSTAL_CODE);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_POST_OFFICE_BOX);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_STATE_OR_PROVINCE);
        propertyPaths.add(MapiPropertyTag.PR_BUSINESS_ADDRESS_STREET);
        propertyPaths.add(MapiPropertyTag.PR_PRIMARY_FAX_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_PRIMARY_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_PROFESSION);
        propertyPaths.add(MapiPropertyTag.PR_RADIO_TELEPHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_SPOUSE_NAME);
        propertyPaths.add(MapiPropertyTag.PR_SURNAME);
        propertyPaths.add(MapiPropertyTag.PR_TELEX_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_TITLE);
        propertyPaths.add(MapiPropertyTag.PR_TTYTDD_PHONE_NUMBER);
        propertyPaths.add(MapiPropertyTag.PR_WEDDING_ANNIVERSARY);
        propertyPaths.add(propertyId23);
        propertyPaths.add(propertyId24);
        propertyPaths.add(propertyId25);
        propertyPaths.add(propertyId26);
        propertyPaths.add(propertyId27);
        propertyPaths.add(propertyId28);
        propertyPaths.add(propertyId29);
        propertyPaths.add(propertyId30);
        propertyPaths.add(propertyId31);
        propertyPaths.add(propertyId32);
        propertyPaths.add(propertyId33);
        propertyPaths.add(propertyId34);
        propertyPaths.add(propertyId35);
        propertyPaths.add(propertyId36);
        propertyPaths.add(propertyId37);
        propertyPaths.add(propertyId38);
        propertyPaths.add(propertyId39);
        propertyPaths.add(propertyId40);
        propertyPaths.add(propertyId41);
        propertyPaths.add(propertyId42);
        propertyPaths.add(propertyId43);
        propertyPaths.add(propertyId44);
        propertyPaths.add(propertyId45);
        propertyPaths.add(MessagePropertyPath.ATTACHMENTS);
        propertyPaths.add(MessagePropertyPath.HAS_ATTACHMENTS);
        for (int i = 0; i < list.size(); ++i) {
            propertyPaths.add(list.get(i));
        }
        final Item item = this.getItem(itemId, new ItemShape((List<PropertyPath>)propertyPaths));
        final com.ews.msg.Message message = new com.ews.msg.Message();
        if (item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_CLASS) != null) {
            message.setMessageClass(item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_CLASS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SUBJECT) != null) {
            message.setSubject(item.getExtendedProperty(MapiPropertyTag.PR_SUBJECT).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SUBJECT_PREFIX) != null) {
            message.setSubjectPrefix(item.getExtendedProperty(MapiPropertyTag.PR_SUBJECT_PREFIX).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CONVERSATION_TOPIC) != null) {
            message.setConversationTopic(item.getExtendedProperty(MapiPropertyTag.PR_CONVERSATION_TOPIC).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_BCC) != null) {
            message.setDisplayBcc(item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_BCC).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_CC) != null) {
            message.setDisplayCc(item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_CC).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_TO) != null) {
            message.setDisplayTo(item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_TO).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_REPLY_RECIPIENT_NAMES) != null) {
            message.setReplyTo(item.getExtendedProperty(MapiPropertyTag.PR_REPLY_RECIPIENT_NAMES).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_NORMALIZED_SUBJECT) != null) {
            message.setNormalizedSubject(item.getExtendedProperty(MapiPropertyTag.PR_NORMALIZED_SUBJECT).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BODY) != null) {
            message.setBody(item.getExtendedProperty(MapiPropertyTag.PR_BODY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RTF_COMPRESSED) != null && item.getExtendedProperty(MapiPropertyTag.PR_RTF_COMPRESSED).getValue() != null) {
            message.setRtfCompressed(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_RTF_COMPRESSED).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SEARCH_KEY) != null && item.getExtendedProperty(MapiPropertyTag.PR_SEARCH_KEY).getValue() != null) {
            message.setSearchKey(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_SEARCH_KEY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ENTRYID) != null && item.getExtendedProperty(MapiPropertyTag.PR_ENTRYID).getValue() != null) {
            message.setEntryId(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_ENTRYID).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CREATION_TIME) != null && item.getExtendedProperty(MapiPropertyTag.PR_CREATION_TIME).getValue() != null) {
            message.setCreationTime(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_CREATION_TIME).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_MODIFICATION_TIME) != null && item.getExtendedProperty(MapiPropertyTag.PR_LAST_MODIFICATION_TIME).getValue() != null) {
            message.setLastModificationTime(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_LAST_MODIFICATION_TIME).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_DELIVERY_TIME) != null && item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_DELIVERY_TIME).getValue() != null) {
            message.setMessageDeliveryTime(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_DELIVERY_TIME).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CLIENT_SUBMIT_TIME) != null && item.getExtendedProperty(MapiPropertyTag.PR_CLIENT_SUBMIT_TIME).getValue() != null) {
            message.setClientSubmitTime(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_CLIENT_SUBMIT_TIME).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CREATOR_NAME) != null) {
            message.setCreatorName(item.getExtendedProperty(MapiPropertyTag.PR_CREATOR_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_MODIFIER_NAME) != null) {
            message.setLastModifierName(item.getExtendedProperty(MapiPropertyTag.PR_LAST_MODIFIER_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_INTERNET_MESSAGE_ID) != null) {
            message.setInternetMessageId(item.getExtendedProperty(MapiPropertyTag.PR_INTERNET_MESSAGE_ID).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CONVERSATION_INDEX) != null && item.getExtendedProperty(MapiPropertyTag.PR_CONVERSATION_INDEX).getValue() != null) {
            message.setConversationIndex(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_CONVERSATION_INDEX).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ATTR_HIDDEN) != null) {
            message.setHidden(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_ATTR_HIDDEN).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ATTR_READONLY) != null) {
            message.setReadOnly(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_ATTR_READONLY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ATTR_SYSTEM) != null) {
            message.setSystem(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_ATTR_SYSTEM).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RTF_IN_SYNC) != null) {
            message.setRtfInSync(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_RTF_IN_SYNC).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_READ_RECEIPT_REQUESTED) != null) {
            message.setReadReceiptRequested(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_READ_RECEIPT_REQUESTED).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ORIGINATOR_DELIVERY_REPORT_REQUESTED) != null) {
            message.setDeliveryReportRequested(Boolean.parseBoolean(item.getExtendedProperty(MapiPropertyTag.PR_ORIGINATOR_DELIVERY_REPORT_REQUESTED).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HTML) != null) {
            message.setBodyHtml(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_HTML).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENSITIVITY) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_SENSITIVITY).getValue().equals("1")) {
                message.setSensitivity(com.ews.msg.Sensitivity.PERSONAL);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_SENSITIVITY).getValue().equals("2")) {
                message.setSensitivity(com.ews.msg.Sensitivity.PRIVATE);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_SENSITIVITY).getValue().equals("3")) {
                message.setSensitivity(com.ews.msg.Sensitivity.CONFIDENTIAL);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_IMPORTANCE) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_IMPORTANCE).getValue().equals("0")) {
                message.setImportance(com.ews.msg.Importance.LOW);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_IMPORTANCE).getValue().equals("1")) {
                message.setImportance(com.ews.msg.Importance.NORMAL);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_IMPORTANCE).getValue().equals("2")) {
                message.setImportance(com.ews.msg.Importance.HIGH);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_PRIORITY) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_PRIORITY).getValue().equals("-1")) {
                message.setPriority(com.ews.msg.Priority.LOW);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_PRIORITY).getValue().equals("0")) {
                message.setPriority(com.ews.msg.Priority.NORMAL);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_PRIORITY).getValue().equals("1")) {
                message.setPriority(com.ews.msg.Priority.HIGH);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("1")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.PURPLE);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("2")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.ORANGE);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("3")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.GREEN);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("4")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.YELLOW);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("5")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.BLUE);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_ICON).getValue().equals("6")) {
                message.setFlagIcon(com.ews.msg.FlagIcon.RED);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_STATUS) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_STATUS).getValue().equals("1")) {
                message.setFlagStatus(com.ews.msg.FlagStatus.COMPLETE);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_FLAG_STATUS).getValue().equals("2")) {
                message.setFlagStatus(com.ews.msg.FlagStatus.MARKED);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_ADDRTYPE) != null) {
            message.setReceivedRepresentingAddressType(item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_ADDRTYPE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_EMAIL_ADDRESS) != null) {
            message.setReceivedRepresentingEmailAddress(item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_EMAIL_ADDRESS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_ENTRYID) != null && item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_ENTRYID).getValue() != null) {
            message.setReceivedRepresentingEntryId(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_ENTRYID).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_NAME) != null) {
            message.setReceivedRepresentingName(item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_SEARCH_KEY) != null && item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_SEARCH_KEY).getValue() != null) {
            message.setReceivedRepresentingSearchKey(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_RCVD_REPRESENTING_SEARCH_KEY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_ADDRTYPE) != null) {
            message.setReceivedByAddressType(item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_ADDRTYPE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_EMAIL_ADDRESS) != null) {
            message.setReceivedByEmailAddress(item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_EMAIL_ADDRESS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_ENTRYID) != null && item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_ENTRYID).getValue() != null) {
            message.setReceivedByEntryId(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_ENTRYID).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_NAME) != null) {
            message.setReceivedByName(item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_SEARCH_KEY) != null && item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_SEARCH_KEY).getValue() != null) {
            message.setReceivedBySearchKey(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_RECEIVED_BY_SEARCH_KEY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENDER_ADDRTYPE) != null) {
            message.setSenderAddressType(item.getExtendedProperty(MapiPropertyTag.PR_SENDER_ADDRTYPE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENDER_EMAIL_ADDRESS) != null) {
            message.setSenderEmailAddress(item.getExtendedProperty(MapiPropertyTag.PR_SENDER_EMAIL_ADDRESS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENDER_ENTRYID) != null && item.getExtendedProperty(MapiPropertyTag.PR_SENDER_ENTRYID).getValue() != null) {
            message.setSenderEntryId(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_SENDER_ENTRYID).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENDER_NAME) != null) {
            message.setSenderName(item.getExtendedProperty(MapiPropertyTag.PR_SENDER_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENDER_SEARCH_KEY) != null && item.getExtendedProperty(MapiPropertyTag.PR_SENDER_SEARCH_KEY).getValue() != null) {
            message.setSenderSearchKey(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_SENDER_SEARCH_KEY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_ADDRTYPE) != null) {
            message.setSentRepresentingAddressType(item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_ADDRTYPE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_EMAIL_ADDRESS) != null) {
            message.setSentRepresentingEmailAddress(item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_EMAIL_ADDRESS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_ENTRYID) != null && item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_ENTRYID).getValue() != null) {
            message.setSentRepresentingEntryId(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_ENTRYID).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_NAME) != null) {
            message.setSentRepresentingName(item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_SEARCH_KEY) != null && item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_SEARCH_KEY).getValue() != null) {
            message.setSentRepresentingSearchKey(com.ews.exchange.d.e(item.getExtendedProperty(MapiPropertyTag.PR_SENT_REPRESENTING_SEARCH_KEY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_TRANSPORT_MESSAGE_HEADERS) != null) {
            message.setTransportMessageHeaders(item.getExtendedProperty(MapiPropertyTag.PR_TRANSPORT_MESSAGE_HEADERS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTED) != null) {
            if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTED).getValue().equals("102")) {
                message.setLastVerbExecuted(com.ews.msg.LastVerbExecuted.REPLY_TO_SENDER);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTED).getValue().equals("103")) {
                message.setLastVerbExecuted(com.ews.msg.LastVerbExecuted.REPLY_TO_ALL);
            }
            else if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTED).getValue().equals("104")) {
                message.setLastVerbExecuted(com.ews.msg.LastVerbExecuted.FORWARD);
            }
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTION_TIME) != null && item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTION_TIME).getValue() != null) {
            message.setLastVerbExecutionTime(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_LAST_VERB_EXECUTION_TIME).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_CODEPAGE) != null && item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_CODEPAGE).getValue() != null) {
            message.setMessageCodePage(Long.parseLong(item.getExtendedProperty(MapiPropertyTag.PR_MESSAGE_CODEPAGE).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_INTERNET_CPID) != null && item.getExtendedProperty(MapiPropertyTag.PR_INTERNET_CPID).getValue() != null) {
            message.setInternetCodePage(Long.parseLong(item.getExtendedProperty(MapiPropertyTag.PR_INTERNET_CPID).getValue()));
        }
        if (item.getExtendedProperty(propertyId) != null) {
            message.setOutlookVersion(item.getExtendedProperty(propertyId).getValue());
        }
        if (item.getExtendedProperty(propertyPath) != null && item.getExtendedProperty(propertyPath).getValue() != null) {
            message.setOutlookInternalVersion(Long.parseLong(item.getExtendedProperty(propertyPath).getValue()));
        }
        if (item.getExtendedProperty(propertyPath2) != null && item.getExtendedProperty(propertyPath2).getValue() != null) {
            message.setCommonStartTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath2).getValue()));
        }
        if (item.getExtendedProperty(propertyPath3) != null && item.getExtendedProperty(propertyPath3).getValue() != null) {
            message.setCommonEndTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath3).getValue()));
        }
        if (item.getExtendedProperty(propertyPath4) != null && item.getExtendedProperty(propertyPath4).getValue() != null) {
            message.setFlagDueBy(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath4).getValue()));
        }
        if (item.getExtendedProperty(propertyId2) != null) {
            message.setRecurring(Boolean.parseBoolean(item.getExtendedProperty(propertyId2).getValue()));
        }
        if (item.getExtendedProperty(propertyPath5) != null && item.getExtendedProperty(propertyPath5).getValue() != null) {
            message.setReminderTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath5).getValue()));
        }
        if (item.getExtendedProperty(propertyPath6) != null && item.getExtendedProperty(propertyPath6).getValue() != null) {
            message.setReminderMinutesBeforeStart(Long.parseLong(item.getExtendedProperty(propertyPath6).getValue()));
        }
        if (item.getExtendedProperty(propertyPath7) != null && item.getExtendedProperty(propertyPath7).getValues() != null) {
            message.getCompanies().addAll(item.getExtendedProperty(propertyPath7).getValues());
        }
        if (item.getCategories() != null) {
            message.getCategories().addAll(item.getCategories());
        }
        if (item.getExtendedProperty(propertyId3) != null) {
            message.setBillingInformation(item.getExtendedProperty(propertyId3).getValue());
        }
        if (item.getExtendedProperty(propertyId4) != null) {
            message.setMileage(item.getExtendedProperty(propertyId4).getValue());
        }
        if (item.getExtendedProperty(propertyId5) != null) {
            message.setReminderSoundFile(item.getExtendedProperty(propertyId5).getValue());
        }
        if (item.getExtendedProperty(propertyId6) != null) {
            message.setPrivate(Boolean.parseBoolean(item.getExtendedProperty(propertyId6).getValue()));
        }
        if (item.getExtendedProperty(propertyId7) != null) {
            message.setReminderSet(Boolean.parseBoolean(item.getExtendedProperty(propertyId7).getValue()));
        }
        if (item.getExtendedProperty(propertyId8) != null) {
            message.setReminderOverrideDefault(Boolean.parseBoolean(item.getExtendedProperty(propertyId8).getValue()));
        }
        if (item.getExtendedProperty(propertyId9) != null) {
            message.setReminderPlaySound(Boolean.parseBoolean(item.getExtendedProperty(propertyId9).getValue()));
        }
        if (item.getExtendedProperty(propertyPath8) != null && item.getExtendedProperty(propertyPath8).getValue() != null) {
            message.setAppointmentStartTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath8).getValue()));
        }
        if (item.getExtendedProperty(propertyPath9) != null && item.getExtendedProperty(propertyPath9).getValue() != null) {
            message.setAppointmentEndTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath9).getValue()));
        }
        if (item.getExtendedProperty(propertyId10) != null) {
            message.setAllDayEvent(Boolean.parseBoolean(item.getExtendedProperty(propertyId10).getValue()));
        }
        if (item.getExtendedProperty(propertyId11) != null) {
            message.setLocation(item.getExtendedProperty(propertyId11).getValue());
        }
        if (item.getExtendedProperty(propertyPath10) != null) {
            if (item.getExtendedProperty(propertyPath10).getValue().equals("0")) {
                message.setBusyStatus(com.ews.msg.BusyStatus.FREE);
            }
            else if (item.getExtendedProperty(propertyPath10).getValue().equals("1")) {
                message.setBusyStatus(com.ews.msg.BusyStatus.TENTATIVE);
            }
            else if (item.getExtendedProperty(propertyPath10).getValue().equals("2")) {
                message.setBusyStatus(com.ews.msg.BusyStatus.BUSY);
            }
            else if (item.getExtendedProperty(propertyPath10).getValue().equals("3")) {
                message.setBusyStatus(com.ews.msg.BusyStatus.OUT_OF_OFFICE);
            }
        }
        if (item.getExtendedProperty(propertyId12) != null) {
            if (item.getExtendedProperty(propertyId12).getValue().equals("0")) {
                message.setMeetingStatus(com.ews.msg.MeetingStatus.NON_MEETING);
            }
            else if (item.getExtendedProperty(propertyId12).getValue().equals("1")) {
                message.setMeetingStatus(com.ews.msg.MeetingStatus.MEETING);
            }
            else if (item.getExtendedProperty(propertyId12).getValue().equals("3")) {
                message.setMeetingStatus(com.ews.msg.MeetingStatus.RECEIVED);
            }
            else if (item.getExtendedProperty(propertyId12).getValue().equals("4")) {
                message.setMeetingStatus(com.ews.msg.MeetingStatus.CANCELED_ORGANIZER);
            }
            else if (item.getExtendedProperty(propertyId12).getValue().equals("5")) {
                message.setMeetingStatus(com.ews.msg.MeetingStatus.CANCELED);
            }
        }
        if (item.getExtendedProperty(propertyId13) != null) {
            if (item.getExtendedProperty(propertyId13).getValue().equals("1")) {
                message.setResponseStatus(com.ews.msg.ResponseStatus.ORGANIZED);
            }
            else if (item.getExtendedProperty(propertyId13).getValue().equals("2")) {
                message.setResponseStatus(com.ews.msg.ResponseStatus.TENTATIVE);
            }
            else if (item.getExtendedProperty(propertyId13).getValue().equals("3")) {
                message.setResponseStatus(com.ews.msg.ResponseStatus.ACCEPTED);
            }
            else if (item.getExtendedProperty(propertyId13).getValue().equals("4")) {
                message.setResponseStatus(com.ews.msg.ResponseStatus.DECLINED);
            }
            else if (item.getExtendedProperty(propertyId13).getValue().equals("5")) {
                message.setResponseStatus(com.ews.msg.ResponseStatus.NOT_RESPONDED);
            }
        }
        if (item.getExtendedProperty(propertyPath11) != null) {
            if (item.getExtendedProperty(propertyPath11).getValue().equals("1")) {
                message.setRecurrenceType(RecurrenceType.DAILY);
            }
            else if (item.getExtendedProperty(propertyPath11).getValue().equals("2")) {
                message.setRecurrenceType(RecurrenceType.WEEKLY);
            }
            else if (item.getExtendedProperty(propertyPath11).getValue().equals("3")) {
                message.setRecurrenceType(RecurrenceType.MONTHLY);
            }
            else if (item.getExtendedProperty(propertyPath11).getValue().equals("5")) {
                message.setRecurrenceType(RecurrenceType.MONTH_NTH);
            }
            else if (item.getExtendedProperty(propertyPath11).getValue().equals("6")) {
                message.setRecurrenceType(RecurrenceType.YEARLY);
            }
            else if (item.getExtendedProperty(propertyPath11).getValue().equals("7")) {
                message.setRecurrenceType(RecurrenceType.YEAR_NTH);
            }
        }
        if (item.getExtendedProperty(customPropertyId) != null) {
            message.setAppointmentMessageClass(item.getExtendedProperty(customPropertyId).getValue());
        }
        if (item.getExtendedProperty(propertyId14) != null) {
            message.setTimeZone(item.getExtendedProperty(propertyId14).getValue());
        }
        if (item.getExtendedProperty(propertyId15) != null) {
            message.setRecurrencePattern(item.getExtendedProperty(propertyId15).getValue());
        }
        if (item.getExtendedProperty(propertyPath12) != null && item.getExtendedProperty(propertyPath12).getValue() != null) {
            message.setGuid(com.ews.exchange.d.e(item.getExtendedProperty(propertyPath12).getValue()));
        }
        if (item.getExtendedProperty(propertyPath13) != null && item.getExtendedProperty(propertyPath13).getValue() != null) {
            message.setLabel(Integer.parseInt(item.getExtendedProperty(propertyPath13).getValue()));
        }
        if (item.getExtendedProperty(propertyPath14) != null && item.getExtendedProperty(propertyPath14).getValue() != null) {
            message.setDuration(Integer.parseInt(item.getExtendedProperty(propertyPath14).getValue()));
        }
        if (item.getExtendedProperty(propertyPath15) != null && item.getExtendedProperty(propertyPath15).getValue() != null) {
            message.setTaskStartDate(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath15).getValue()));
        }
        if (item.getExtendedProperty(propertyPath16) != null && item.getExtendedProperty(propertyPath16).getValue() != null) {
            message.setTaskDueDate(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath16).getValue()));
        }
        if (item.getExtendedProperty(propertyId16) != null) {
            message.setOwner(item.getExtendedProperty(propertyId16).getValue());
        }
        if (item.getExtendedProperty(propertyId17) != null) {
            message.setDelegator(item.getExtendedProperty(propertyId17).getValue());
        }
        if (item.getExtendedProperty(propertyPath17) != null && item.getExtendedProperty(propertyPath17).getValue() != null) {
            message.setPercentComplete(Double.parseDouble(item.getExtendedProperty(propertyPath17).getValue()) * 100.0);
        }
        if (item.getExtendedProperty(propertyPath18) != null && item.getExtendedProperty(propertyPath18).getValue() != null) {
            message.setActualWork(Long.parseLong(item.getExtendedProperty(propertyPath18).getValue()));
        }
        if (item.getExtendedProperty(propertyPath19) != null && item.getExtendedProperty(propertyPath19).getValue() != null) {
            message.setTotalWork(Long.parseLong(item.getExtendedProperty(propertyPath19).getValue()));
        }
        if (item.getExtendedProperty(propertyId18) != null) {
            message.setTeamTask(Boolean.parseBoolean(item.getExtendedProperty(propertyId18).getValue()));
        }
        if (item.getExtendedProperty(propertyId19) != null) {
            message.setComplete(Boolean.parseBoolean(item.getExtendedProperty(propertyId19).getValue()));
        }
        if (item.getExtendedProperty(propertyPath20) != null && item.getExtendedProperty(propertyPath20).getValue() != null) {
            message.setDateCompleted(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath20).getValue()));
        }
        if (item.getExtendedProperty(propertyId20) != null) {
            if (item.getExtendedProperty(propertyId20).getValue().equals("0")) {
                message.setTaskStatus(com.ews.msg.TaskStatus.NOT_STARTED);
            }
            else if (item.getExtendedProperty(propertyId20).getValue().equals("1")) {
                message.setTaskStatus(com.ews.msg.TaskStatus.IN_PROGRESS);
            }
            else if (item.getExtendedProperty(propertyId20).getValue().equals("2")) {
                message.setTaskStatus(com.ews.msg.TaskStatus.COMPLETED);
            }
            else if (item.getExtendedProperty(propertyId20).getValue().equals("3")) {
                message.setTaskStatus(com.ews.msg.TaskStatus.WAITING_ON_OTHERS);
            }
            else if (item.getExtendedProperty(propertyId20).getValue().equals("4")) {
                message.setTaskStatus(com.ews.msg.TaskStatus.DEFERRED);
            }
        }
        if (item.getExtendedProperty(propertyId21) != null) {
            if (item.getExtendedProperty(propertyId21).getValue().equals("0")) {
                message.setTaskOwnership(TaskOwnership.NEW);
            }
            else if (item.getExtendedProperty(propertyId21).getValue().equals("1")) {
                message.setTaskOwnership(TaskOwnership.DELEGATED);
            }
            else if (item.getExtendedProperty(propertyId21).getValue().equals("2")) {
                message.setTaskOwnership(TaskOwnership.OWN);
            }
        }
        if (item.getExtendedProperty(propertyId22) != null) {
            if (item.getExtendedProperty(propertyId22).getValue().equals("0")) {
                message.setTaskDelegationState(TaskDelegationState.OWNED);
            }
            else if (item.getExtendedProperty(propertyId22).getValue().equals("1")) {
                message.setTaskDelegationState(TaskDelegationState.OWN_NEW);
            }
            else if (item.getExtendedProperty(propertyId22).getValue().equals("2")) {
                message.setTaskDelegationState(TaskDelegationState.ACCEPTED);
            }
            else if (item.getExtendedProperty(propertyId22).getValue().equals("3")) {
                message.setTaskDelegationState(TaskDelegationState.DECLINED);
            }
            else if (item.getExtendedProperty(propertyId22).getValue().equals("4")) {
                message.setTaskDelegationState(TaskDelegationState.NO_MATCH);
            }
        }
        if (item.getExtendedProperty(propertyPath21) != null && item.getExtendedProperty(propertyPath21).getValue() != null) {
            message.setNoteWidth(Long.parseLong(item.getExtendedProperty(propertyPath21).getValue()));
        }
        if (item.getExtendedProperty(propertyPath22) != null && item.getExtendedProperty(propertyPath22).getValue() != null) {
            message.setNoteHeight(Long.parseLong(item.getExtendedProperty(propertyPath22).getValue()));
        }
        if (item.getExtendedProperty(propertyPath23) != null && item.getExtendedProperty(propertyPath23).getValue() != null) {
            message.setNoteLeft(Long.parseLong(item.getExtendedProperty(propertyPath23).getValue()));
        }
        if (item.getExtendedProperty(propertyPath24) != null && item.getExtendedProperty(propertyPath24).getValue() != null) {
            message.setNoteTop(Long.parseLong(item.getExtendedProperty(propertyPath24).getValue()));
        }
        if (item.getExtendedProperty(customPropertyId2) != null) {
            if (item.getExtendedProperty(customPropertyId2).getValue().equals("0")) {
                message.setNoteColor(com.ews.msg.NoteColor.BLUE);
            }
            else if (item.getExtendedProperty(customPropertyId2).getValue().equals("1")) {
                message.setNoteColor(com.ews.msg.NoteColor.GREEN);
            }
            else if (item.getExtendedProperty(customPropertyId2).getValue().equals("2")) {
                message.setNoteColor(com.ews.msg.NoteColor.PINK);
            }
            else if (item.getExtendedProperty(customPropertyId2).getValue().equals("3")) {
                message.setNoteColor(com.ews.msg.NoteColor.YELLOW);
            }
            else if (item.getExtendedProperty(customPropertyId2).getValue().equals("4")) {
                message.setNoteColor(com.ews.msg.NoteColor.WHITE);
            }
        }
        if (item.getExtendedProperty(propertyPath25) != null && item.getExtendedProperty(propertyPath25).getValue() != null) {
            message.setJournalStartTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath25).getValue()));
        }
        if (item.getExtendedProperty(propertyPath26) != null && item.getExtendedProperty(propertyPath26).getValue() != null) {
            message.setJournalEndTime(com.ews.exchange.d.c(item.getExtendedProperty(propertyPath26).getValue()));
        }
        if (item.getExtendedProperty(customPropertyId3) != null) {
            message.setJournalType(item.getExtendedProperty(customPropertyId3).getValue());
        }
        if (item.getExtendedProperty(customPropertyId4) != null) {
            message.setJournalTypeDescription(item.getExtendedProperty(customPropertyId4).getValue());
        }
        if (item.getExtendedProperty(propertyPath27) != null && item.getExtendedProperty(propertyPath27).getValue() != null) {
            message.setJournalDuration(Long.parseLong(item.getExtendedProperty(propertyPath27).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BIRTHDAY) != null && item.getExtendedProperty(MapiPropertyTag.PR_BIRTHDAY).getValue() != null) {
            message.setBirthday(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_BIRTHDAY).getValue()));
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CHILDRENS_NAMES) != null) {
            message.getChildrenNames().addAll(item.getExtendedProperty(MapiPropertyTag.PR_CHILDRENS_NAMES).getValues());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ASSISTANT) != null) {
            message.setAssistentName(item.getExtendedProperty(MapiPropertyTag.PR_ASSISTANT).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ASSISTANT_TELEPHONE_NUMBER) != null) {
            message.setAssistentPhone(item.getExtendedProperty(MapiPropertyTag.PR_ASSISTANT_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_TELEPHONE_NUMBER) != null) {
            message.setBusinessPhone(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS2_TELEPHONE_NUMBER) != null) {
            message.setBusinessPhone2(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS2_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_FAX_NUMBER) != null) {
            message.setBusinessFax(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_FAX_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_HOME_PAGE) != null) {
            message.setBusinessHomePage(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_HOME_PAGE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CALLBACK_TELEPHONE_NUMBER) != null) {
            message.setCallbackPhone(item.getExtendedProperty(MapiPropertyTag.PR_CALLBACK_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CAR_TELEPHONE_NUMBER) != null) {
            message.setCarPhone(item.getExtendedProperty(MapiPropertyTag.PR_CAR_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CELLULAR_TELEPHONE_NUMBER) != null) {
            message.setCellularPhone(item.getExtendedProperty(MapiPropertyTag.PR_CELLULAR_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_COMPANY_MAIN_PHONE_NUMBER) != null) {
            message.setCompanyMainPhone(item.getExtendedProperty(MapiPropertyTag.PR_COMPANY_MAIN_PHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_COMPUTER_NETWORK_NAME) != null) {
            message.setComputerNetworkName(item.getExtendedProperty(MapiPropertyTag.PR_COMPUTER_NETWORK_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_CUSTOMER_ID) != null) {
            message.setCustomerId(item.getExtendedProperty(MapiPropertyTag.PR_CUSTOMER_ID).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DEPARTMENT_NAME) != null) {
            message.setDepartmentName(item.getExtendedProperty(MapiPropertyTag.PR_DEPARTMENT_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME) != null) {
            message.setDisplayName(item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME_PREFIX) != null) {
            message.setDisplayNamePrefix(item.getExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME_PREFIX).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_FTP_SITE) != null) {
            message.setFtpSite(item.getExtendedProperty(MapiPropertyTag.PR_FTP_SITE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_GENERATION) != null) {
            message.setGeneration(item.getExtendedProperty(MapiPropertyTag.PR_GENERATION).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_GIVEN_NAME) != null) {
            message.setGivenName(item.getExtendedProperty(MapiPropertyTag.PR_GIVEN_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_GOVERNMENT_ID_NUMBER) != null) {
            message.setGovernmentId(item.getExtendedProperty(MapiPropertyTag.PR_GOVERNMENT_ID_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOBBIES) != null) {
            message.setHobbies(item.getExtendedProperty(MapiPropertyTag.PR_HOBBIES).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME2_TELEPHONE_NUMBER) != null) {
            message.setHomePhone2(item.getExtendedProperty(MapiPropertyTag.PR_HOME2_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_CITY) != null) {
            message.setHomeAddressCity(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_CITY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_COUNTRY) != null) {
            message.setHomeAddressCountry(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_COUNTRY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_POSTAL_CODE) != null) {
            message.setHomeAddressPostalCode(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_POSTAL_CODE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_POST_OFFICE_BOX) != null) {
            message.setHomeAddressPostOfficeBox(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_POST_OFFICE_BOX).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_STATE_OR_PROVINCE) != null) {
            message.setHomeAddressState(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_STATE_OR_PROVINCE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_STREET) != null) {
            message.setHomeAddressStreet(item.getExtendedProperty(MapiPropertyTag.PR_HOME_ADDRESS_STREET).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_FAX_NUMBER) != null) {
            message.setHomeFax(item.getExtendedProperty(MapiPropertyTag.PR_HOME_FAX_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_HOME_TELEPHONE_NUMBER) != null) {
            message.setHomePhone(item.getExtendedProperty(MapiPropertyTag.PR_HOME_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_INITIALS) != null) {
            message.setInitials(item.getExtendedProperty(MapiPropertyTag.PR_INITIALS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_ISDN_NUMBER) != null) {
            message.setIsdn(item.getExtendedProperty(MapiPropertyTag.PR_ISDN_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_MANAGER_NAME) != null) {
            message.setManagerName(item.getExtendedProperty(MapiPropertyTag.PR_MANAGER_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_MIDDLE_NAME) != null) {
            message.setMiddleName(item.getExtendedProperty(MapiPropertyTag.PR_MIDDLE_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_NICKNAME) != null) {
            message.setNickname(item.getExtendedProperty(MapiPropertyTag.PR_NICKNAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OFFICE_LOCATION) != null) {
            message.setOfficeLocation(item.getExtendedProperty(MapiPropertyTag.PR_OFFICE_LOCATION).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_CITY) != null) {
            message.setOtherAddressCity(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_CITY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_COUNTRY) != null) {
            message.setOtherAddressCountry(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_COUNTRY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_POSTAL_CODE) != null) {
            message.setOtherAddressPostalCode(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_POSTAL_CODE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_STATE_OR_PROVINCE) != null) {
            message.setOtherAddressState(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_STATE_OR_PROVINCE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_STREET) != null) {
            message.setOtherAddressStreet(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_ADDRESS_STREET).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_OTHER_TELEPHONE_NUMBER) != null) {
            message.setOtherPhone(item.getExtendedProperty(MapiPropertyTag.PR_OTHER_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_PAGER_TELEPHONE_NUMBER) != null) {
            message.setPager(item.getExtendedProperty(MapiPropertyTag.PR_PAGER_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_POSTAL_ADDRESS) != null) {
            message.setPostalAddress(item.getExtendedProperty(MapiPropertyTag.PR_POSTAL_ADDRESS).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_COUNTRY) != null) {
            message.setBusinessAddressCountry(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_COUNTRY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_CITY) != null) {
            message.setBusinessAddressCity(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_CITY).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_POSTAL_CODE) != null) {
            message.setBusinessAddressPostalCode(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_POSTAL_CODE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_POST_OFFICE_BOX) != null) {
            message.setBusinessAddressPostOfficeBox(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_POST_OFFICE_BOX).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_STATE_OR_PROVINCE) != null) {
            message.setBusinessAddressState(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_STATE_OR_PROVINCE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_STREET) != null) {
            message.setBusinessAddressStreet(item.getExtendedProperty(MapiPropertyTag.PR_BUSINESS_ADDRESS_STREET).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_PRIMARY_FAX_NUMBER) != null) {
            message.setPrimaryFax(item.getExtendedProperty(MapiPropertyTag.PR_PRIMARY_FAX_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_PRIMARY_TELEPHONE_NUMBER) != null) {
            message.setPrimaryPhone(item.getExtendedProperty(MapiPropertyTag.PR_PRIMARY_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_PROFESSION) != null) {
            message.setProfession(item.getExtendedProperty(MapiPropertyTag.PR_PROFESSION).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_RADIO_TELEPHONE_NUMBER) != null) {
            message.setRadioPhone(item.getExtendedProperty(MapiPropertyTag.PR_RADIO_TELEPHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SPOUSE_NAME) != null) {
            message.setSpouseName(item.getExtendedProperty(MapiPropertyTag.PR_SPOUSE_NAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_SURNAME) != null) {
            message.setSurname(item.getExtendedProperty(MapiPropertyTag.PR_SURNAME).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_TELEX_NUMBER) != null) {
            message.setTelex(item.getExtendedProperty(MapiPropertyTag.PR_TELEX_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_TITLE) != null) {
            message.setTitle(item.getExtendedProperty(MapiPropertyTag.PR_TITLE).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_TTYTDD_PHONE_NUMBER) != null) {
            message.setTtyTddPhone(item.getExtendedProperty(MapiPropertyTag.PR_TTYTDD_PHONE_NUMBER).getValue());
        }
        if (item.getExtendedProperty(MapiPropertyTag.PR_WEDDING_ANNIVERSARY) != null) {
            message.setWeddingAnniversary(com.ews.exchange.d.c(item.getExtendedProperty(MapiPropertyTag.PR_WEDDING_ANNIVERSARY).getValue()));
        }
        if (item.getExtendedProperty(propertyId23) != null) {
            if (item.getExtendedProperty(propertyId23).getValue().equals("1")) {
                message.setSelectedMailingAddress(com.ews.msg.SelectedMailingAddress.HOME);
            }
            else if (item.getExtendedProperty(propertyId23).getValue().equals("2")) {
                message.setSelectedMailingAddress(com.ews.msg.SelectedMailingAddress.BUSINESS);
            }
            else if (item.getExtendedProperty(propertyId23).getValue().equals("3")) {
                message.setSelectedMailingAddress(com.ews.msg.SelectedMailingAddress.OTHER);
            }
        }
        if (item.getExtendedProperty(propertyId24) != null) {
            message.setContactHasPicture(Boolean.parseBoolean(item.getExtendedProperty(propertyId24).getValue()));
        }
        if (item.getExtendedProperty(propertyId25) != null) {
            message.setFileAs(item.getExtendedProperty(propertyId25).getValue());
        }
        if (item.getExtendedProperty(propertyId26) != null) {
            message.setInstantMessengerAddress(item.getExtendedProperty(propertyId26).getValue());
        }
        if (item.getExtendedProperty(propertyId27) != null) {
            message.setInternetFreeBusyAddress(item.getExtendedProperty(propertyId27).getValue());
        }
        if (item.getExtendedProperty(propertyId28) != null) {
            message.setBusinessAddress(item.getExtendedProperty(propertyId28).getValue());
        }
        if (item.getExtendedProperty(propertyId29) != null) {
            message.setHomeAddress(item.getExtendedProperty(propertyId29).getValue());
        }
        if (item.getExtendedProperty(propertyId30) != null) {
            message.setOtherAddress(item.getExtendedProperty(propertyId30).getValue());
        }
        if (item.getExtendedProperty(propertyId31) != null) {
            message.setEmail1Address(item.getExtendedProperty(propertyId31).getValue());
        }
        if (item.getExtendedProperty(propertyId32) != null) {
            message.setEmail2Address(item.getExtendedProperty(propertyId32).getValue());
        }
        if (item.getExtendedProperty(propertyId33) != null) {
            message.setEmail3Address(item.getExtendedProperty(propertyId33).getValue());
        }
        if (item.getExtendedProperty(propertyId34) != null) {
            message.setEmail1DisplayName(item.getExtendedProperty(propertyId34).getValue());
        }
        if (item.getExtendedProperty(propertyId35) != null) {
            message.setEmail2DisplayName(item.getExtendedProperty(propertyId35).getValue());
        }
        if (item.getExtendedProperty(propertyId36) != null) {
            message.setEmail3DisplayName(item.getExtendedProperty(propertyId36).getValue());
        }
        if (item.getExtendedProperty(propertyId37) != null) {
            message.setEmail1DisplayAs(item.getExtendedProperty(propertyId37).getValue());
        }
        if (item.getExtendedProperty(propertyId38) != null) {
            message.setEmail2DisplayAs(item.getExtendedProperty(propertyId38).getValue());
        }
        if (item.getExtendedProperty(propertyId39) != null) {
            message.setEmail3DisplayAs(item.getExtendedProperty(propertyId39).getValue());
        }
        if (item.getExtendedProperty(propertyId40) != null) {
            message.setEmail1Type(item.getExtendedProperty(propertyId40).getValue());
        }
        if (item.getExtendedProperty(propertyId41) != null) {
            message.setEmail2Type(item.getExtendedProperty(propertyId41).getValue());
        }
        if (item.getExtendedProperty(propertyId42) != null) {
            message.setEmail3Type(item.getExtendedProperty(propertyId42).getValue());
        }
        if (item.getExtendedProperty(propertyId43) != null) {
            message.setEmail1EntryId(com.ews.exchange.d.e(item.getExtendedProperty(propertyId43).getValue()));
        }
        if (item.getExtendedProperty(propertyId44) != null) {
            message.setEmail2EntryId(com.ews.exchange.d.e(item.getExtendedProperty(propertyId44).getValue()));
        }
        if (item.getExtendedProperty(propertyId45) != null) {
            message.setEmail3EntryId(com.ews.exchange.d.e(item.getExtendedProperty(propertyId45).getValue()));
        }
        for (int j = 0; j < list.size(); ++j) {
            if (item.getExtendedProperty(list.get(j)) != null && item.getExtendedProperty(list.get(j)).getValue() != null) {
                if (list.get(j) instanceof PropertyId) {
                    final PropertyId propertyId46 = (PropertyId)list.get(j);
                    final ExtendedPropertyTag tag;
                    ((ExtendedPropertyId)(tag = new ExtendedPropertyId())).setId(propertyId46.getId());
                    tag.setGuid(com.ews.exchange.d.a(propertyId46.getSet()));
                    tag.setType(com.ews.exchange.d.a(propertyId46.getType()));
                    if (propertyId46.getType() == MapiPropertyType.BOOLEAN) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, Boolean.parseBoolean(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyId46.getType() == MapiPropertyType.SHORT) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, Short.parseShort(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyId46.getType() == MapiPropertyType.INTEGER) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, Integer.parseInt(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyId46.getType() == MapiPropertyType.LONG) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, Long.parseLong(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyId46.getType() == MapiPropertyType.FLOAT || propertyId46.getType() == MapiPropertyType.DOUBLE) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, Double.parseDouble(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyId46.getType() == MapiPropertyType.SYSTEM_TIME || propertyId46.getType() == MapiPropertyType.APPLICATION_TIME) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, com.ews.exchange.d.c(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag, item.getExtendedProperty(list.get(j)).getValue()));
                    }
                }
                else if (list.get(j) instanceof CustomPropertyId) {
                    final CustomPropertyId customPropertyId5 = (CustomPropertyId)list.get(j);
                    final ExtendedPropertyTag tag2;
                    ((ExtendedPropertyId)(tag2 = new ExtendedPropertyId())).setId(customPropertyId5.getId());
                    tag2.setGuid(com.ews.exchange.d.a(UUID.fromString(customPropertyId5.getSet())));
                    tag2.setType(com.ews.exchange.d.a(customPropertyId5.getType()));
                    if (customPropertyId5.getType() == MapiPropertyType.BOOLEAN) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, Boolean.parseBoolean(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyId5.getType() == MapiPropertyType.SHORT) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, Short.parseShort(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyId5.getType() == MapiPropertyType.INTEGER) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, Integer.parseInt(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyId5.getType() == MapiPropertyType.LONG) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, Long.parseLong(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyId5.getType() == MapiPropertyType.FLOAT || customPropertyId5.getType() == MapiPropertyType.DOUBLE) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, Double.parseDouble(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyId5.getType() == MapiPropertyType.SYSTEM_TIME || customPropertyId5.getType() == MapiPropertyType.APPLICATION_TIME) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, com.ews.exchange.d.c(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag2, item.getExtendedProperty(list.get(j)).getValue()));
                    }
                }
                else if (list.get(j) instanceof PropertyName) {
                    final PropertyName propertyName = (PropertyName)list.get(j);
                    final ExtendedPropertyTag tag3;
                    ((ExtendedPropertyName)(tag3 = new ExtendedPropertyName())).setName(propertyName.getName());
                    tag3.setGuid(com.ews.exchange.d.a(propertyName.getSet()));
                    tag3.setType(com.ews.exchange.d.a(propertyName.getType()));
                    if (propertyName.getType() == MapiPropertyType.BOOLEAN) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, Boolean.parseBoolean(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyName.getType() == MapiPropertyType.SHORT) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, Short.parseShort(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyName.getType() == MapiPropertyType.INTEGER) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, Integer.parseInt(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyName.getType() == MapiPropertyType.LONG) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, Long.parseLong(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyName.getType() == MapiPropertyType.FLOAT || propertyName.getType() == MapiPropertyType.DOUBLE) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, Double.parseDouble(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (propertyName.getType() == MapiPropertyType.SYSTEM_TIME || propertyName.getType() == MapiPropertyType.APPLICATION_TIME) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, com.ews.exchange.d.c(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag3, item.getExtendedProperty(list.get(j)).getValue()));
                    }
                }
                else if (list.get(j) instanceof CustomPropertyName) {
                    final CustomPropertyName customPropertyName = (CustomPropertyName)list.get(j);
                    final ExtendedPropertyTag tag4;
                    ((ExtendedPropertyName)(tag4 = new ExtendedPropertyName())).setName(customPropertyName.getName());
                    tag4.setGuid(com.ews.exchange.d.a(UUID.fromString(customPropertyName.getSet())));
                    tag4.setType(com.ews.exchange.d.a(customPropertyName.getType()));
                    if (customPropertyName.getType() == MapiPropertyType.BOOLEAN) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, Boolean.parseBoolean(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyName.getType() == MapiPropertyType.SHORT) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, Short.parseShort(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyName.getType() == MapiPropertyType.INTEGER) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, Integer.parseInt(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyName.getType() == MapiPropertyType.LONG) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, Long.parseLong(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyName.getType() == MapiPropertyType.FLOAT || customPropertyName.getType() == MapiPropertyType.DOUBLE) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, Double.parseDouble(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else if (customPropertyName.getType() == MapiPropertyType.SYSTEM_TIME || customPropertyName.getType() == MapiPropertyType.APPLICATION_TIME) {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, com.ews.exchange.d.c(item.getExtendedProperty(list.get(j)).getValue())));
                    }
                    else {
                        message.getExtendedProperties().add(new com.ews.msg.ExtendedProperty(tag4, item.getExtendedProperty(list.get(j)).getValue()));
                    }
                }
            }
        }
        if (!message.getMessageClass().equals("IPM.Activity") && !message.getMessageClass().equals("IPM.StickyNote") && item instanceof Message) {
            final Message message2 = this.getMessage(item.getItemId());
            for (int k = 0; k < message2.getToRecipients().size(); ++k) {
                final Mailbox mailbox = message2.getToRecipients().get(k);
                final Recipient recipient;
                (recipient = new Recipient()).setDisplayName(mailbox.getName());
                recipient.setAddressType("SMTP");
                recipient.setRecipientType(RecipientType.TO);
                recipient.setEmailAddress(mailbox.getEmailAddress());
                recipient.setEntryId(com.ews.exchange.d.h(mailbox.getEmailAddress()));
                message.getRecipients().add(recipient);
            }
            for (int l = 0; l < message2.getCcRecipients().size(); ++l) {
                final Mailbox mailbox2 = message2.getCcRecipients().get(l);
                final Recipient recipient2;
                (recipient2 = new Recipient()).setDisplayName(mailbox2.getName());
                recipient2.setAddressType("SMTP");
                recipient2.setRecipientType(RecipientType.CC);
                recipient2.setEmailAddress(mailbox2.getEmailAddress());
                recipient2.setEntryId(com.ews.exchange.d.h(mailbox2.getEmailAddress()));
                message.getRecipients().add(recipient2);
            }
            for (int n = 0; n < message2.getBccRecipients().size(); ++n) {
                final Mailbox mailbox3 = message2.getBccRecipients().get(n);
                final Recipient recipient3;
                (recipient3 = new Recipient()).setDisplayName(mailbox3.getName());
                recipient3.setAddressType("SMTP");
                recipient3.setRecipientType(RecipientType.BCC);
                recipient3.setEmailAddress(mailbox3.getEmailAddress());
                recipient3.setEntryId(com.ews.exchange.d.h(mailbox3.getEmailAddress()));
                message.getRecipients().add(recipient3);
            }
        }
        else if (item instanceof Appointment) {
            final Appointment appointment = this.getAppointment(item.getItemId());
            for (int n2 = 0; n2 < appointment.getRequiredAttendees().size(); ++n2) {
                final Attendee attendee;
                if ((attendee = appointment.getRequiredAttendees().get(n2)) != null && attendee.getMailbox() != null) {
                    final Recipient recipient4;
                    (recipient4 = new Recipient()).setDisplayName(attendee.getMailbox().getName());
                    recipient4.setAddressType("SMTP");
                    recipient4.setRecipientType(RecipientType.TO);
                    recipient4.setEmailAddress(attendee.getMailbox().getEmailAddress());
                    recipient4.setEntryId(com.ews.exchange.d.h(attendee.getMailbox().getEmailAddress()));
                    message.getRecipients().add(recipient4);
                }
            }
            for (int n3 = 0; n3 < appointment.getOptionalAttendees().size(); ++n3) {
                final Attendee attendee2;
                if ((attendee2 = appointment.getOptionalAttendees().get(n3)) != null && attendee2.getMailbox() != null) {
                    final Recipient recipient5;
                    (recipient5 = new Recipient()).setDisplayName(attendee2.getMailbox().getName());
                    recipient5.setAddressType("SMTP");
                    recipient5.setRecipientType(RecipientType.CC);
                    recipient5.setEmailAddress(attendee2.getMailbox().getEmailAddress());
                    recipient5.setEntryId(com.ews.exchange.d.h(attendee2.getMailbox().getEmailAddress()));
                    message.getRecipients().add(recipient5);
                }
            }
            for (int n4 = 0; n4 < appointment.getResources().size(); ++n4) {
                final Attendee attendee3;
                if ((attendee3 = appointment.getResources().get(n4)) != null && attendee3.getMailbox() != null) {
                    final Recipient recipient6;
                    (recipient6 = new Recipient()).setDisplayName(attendee3.getMailbox().getName());
                    recipient6.setAddressType("SMTP");
                    recipient6.setRecipientType(RecipientType.BCC);
                    recipient6.setEmailAddress(attendee3.getMailbox().getEmailAddress());
                    recipient6.setEntryId(com.ews.exchange.d.h(attendee3.getMailbox().getEmailAddress()));
                    message.getRecipients().add(recipient6);
                }
            }
        }
        if (item.getAttachments() != null && item.getAttachments().size() > 0) {
            message.setHasAttachment(true);
            final List<AttachmentInfo> attachments = item.getAttachments();
            final ArrayList<String> attachmentIds = new ArrayList<String>();
            for (int n5 = 0; n5 < attachments.size(); ++n5) {
                attachmentIds.add(attachments.get(n5).getId());
            }
            final List<Attachment> attachments2 = this.getAttachments(attachmentIds, new AttachmentShape(true));
            for (int n6 = 0; n6 < attachments2.size(); ++n6) {
                if (attachments2.get(n6) instanceof FileAttachment) {
                    final FileAttachment fileAttachment = (FileAttachment)attachments2.get(n6);
                    final com.ews.msg.Attachment attachment;
                    (attachment = new com.ews.msg.Attachment()).setData(fileAttachment.getContent());
                    attachment.setDisplayName(fileAttachment.getName());
                    attachment.setFileName(fileAttachment.getName());
                    attachment.setLongFileName(fileAttachment.getName());
                    attachment.setContentId(fileAttachment.getContentId());
                    attachment.setContentLocation(fileAttachment.getContentLocation());
                    attachment.setMimeTag(fileAttachment.getContentType());
                    message.getAttachments().add(attachment);
                }
                else {
                    final ItemAttachment itemAttachment;
                    if ((itemAttachment = (ItemAttachment)attachments2.get(n6)) != null && itemAttachment.getItem() != null && itemAttachment.getItem().getMimeContent() != null) {
                        String characterSet = "UTF-8";
                        if (itemAttachment.getItem().getMimeContent().getCharacterSet() != null) {
                            characterSet = itemAttachment.getItem().getMimeContent().getCharacterSet();
                        }
                        byte[] data = null;
                        final Charset forName = Charset.forName(characterSet);
                        if (itemAttachment.getItem().getMimeContent().getText() != null) {
                            final ByteBuffer encode;
                            data = new byte[(encode = forName.encode(itemAttachment.getItem().getMimeContent().getText())).limit()];
                            System.arraycopy(encode.array(), 0, data, 0, data.length);
                        }
                        if (data != null) {
                            final String replace = (itemAttachment.getName() + ".eml").replace("/", " ");
                            final com.ews.msg.Attachment attachment2;
                            (attachment2 = new com.ews.msg.Attachment()).setData(data);
                            attachment2.setDisplayName(itemAttachment.getName());
                            attachment2.setFileName(replace);
                            attachment2.setLongFileName(replace);
                            attachment2.setContentId(itemAttachment.getContentId());
                            attachment2.setContentLocation(itemAttachment.getContentLocation());
                            attachment2.setMimeTag(itemAttachment.getContentType());
                            message.getAttachments().add(attachment2);
                        }
                    }
                }
            }
        }
        return message;
    }
    
    public Response createRetentionSettings(final RetentionSettings retentionSettings) throws ServiceException {
        return this.createRetentionSettings(retentionSettings, StandardFolder.INBOX);
    }
    
    public Response createRetentionSettings(final RetentionSettings retentionSettings, final StandardFolder standardFolder) throws ServiceException {
        return this.createRetentionSettings(retentionSettings, new StandardFolderId(standardFolder));
    }
    
    public Response createRetentionSettings(final RetentionSettings retentionSettings, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration(new UserConfigurationName("MRM", folderId))).setXmlData(com.ews.exchange.d.a(com.ews.exchange.d.d(retentionSettings.a())));
        return this.createUserConfiguration(userConfiguration);
    }
    
    public Response updateRetentionSettings(final RetentionSettings retentionSettings) throws ServiceException {
        return this.updateRetentionSettings(retentionSettings, StandardFolder.INBOX);
    }
    
    public Response updateRetentionSettings(final RetentionSettings retentionSettings, final StandardFolder standardFolder) throws ServiceException {
        return this.updateRetentionSettings(retentionSettings, new StandardFolderId(standardFolder));
    }
    
    public Response updateRetentionSettings(final RetentionSettings retentionSettings, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration(new UserConfigurationName("MRM", folderId))).setXmlData(com.ews.exchange.d.a(com.ews.exchange.d.d(retentionSettings.a())));
        return this.updateUserConfiguration(userConfiguration);
    }
    
    public RetentionSettings getRetentionSettings() throws ServiceException, XMLStreamException, ParseException {
        return this.getRetentionSettings(StandardFolder.INBOX);
    }
    
    public RetentionSettings getRetentionSettings(final StandardFolder standardFolder) throws ServiceException, XMLStreamException, ParseException {
        return this.getRetentionSettings(new StandardFolderId(standardFolder));
    }
    
    public RetentionSettings getRetentionSettings(final FolderId folderId) throws ServiceException, XMLStreamException, ParseException {
        final GetUserConfigurationResponse userConfiguration = this.getUserConfiguration(new UserConfigurationName("MRM", folderId), UserConfigurationProperty.XML_DATA);
        RetentionSettings retentionSettings = null;
        final byte[] e;
        if (userConfiguration.getUserConfiguration() != null && userConfiguration.getUserConfiguration().getXmlData() != null && (e = com.ews.exchange.d.e(userConfiguration.getUserConfiguration().getXmlData())) != null) {
            final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(new ByteArrayInputStream(e));
            while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getLocalName().equals("RetentionHold")) {
                    retentionSettings = new RetentionSettings(xmlStreamReader);
                }
            }
        }
        return retentionSettings;
    }
    
    public Response deleteRetentionSettings() throws ServiceException {
        return this.deleteRetentionSettings(StandardFolder.INBOX);
    }
    
    public Response deleteRetentionSettings(final StandardFolder standardFolder) throws ServiceException {
        return this.deleteRetentionSettings(new StandardFolderId(standardFolder));
    }
    
    public Response deleteRetentionSettings(final FolderId folderId) throws ServiceException {
        return this.deleteUserConfiguration(new UserConfigurationName("MRM", folderId));
    }
    
    public OwaOptions getOwaOptions() throws ServiceException {
        return this.getOwaOptions(StandardFolder.ROOT);
    }
    
    public OwaOptions getOwaOptions(final StandardFolder standardFolder) throws ServiceException {
        return this.getOwaOptions(new StandardFolderId(standardFolder));
    }
    
    public OwaOptions getOwaOptions(final FolderId folderId) throws ServiceException {
        final GetUserConfigurationResponse userConfiguration = this.getUserConfiguration(new UserConfigurationName("OWA.UserOptions", folderId), UserConfigurationProperty.DICTIONARY);
        OwaOptions owaOptions = null;
        if (userConfiguration.getUserConfiguration() != null) {
            owaOptions = new OwaOptions(userConfiguration.getUserConfiguration());
        }
        return owaOptions;
    }
    
    public Response createOwaOptions(final OwaOptions owaOptions) throws ServiceException {
        return this.createOwaOptions(owaOptions, StandardFolder.CALENDAR);
    }
    
    public Response createOwaOptions(final OwaOptions owaOptions, final StandardFolder standardFolder) throws ServiceException {
        return this.createOwaOptions(owaOptions, new StandardFolderId(standardFolder));
    }
    
    public Response createOwaOptions(final OwaOptions owaOptions, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration()).setName(new UserConfigurationName("OWA.UserOptions", folderId));
        final Iterator<UserConfigurationDictionaryEntry> iterator = owaOptions.a().iterator();
        while (iterator.hasNext()) {
            userConfiguration.getEntries().add(iterator.next());
        }
        return this.createUserConfiguration(userConfiguration);
    }
    
    public Response updateOwaOptions(final OwaOptions owaOptions) throws ServiceException {
        return this.updateOwaOptions(owaOptions, StandardFolder.ROOT);
    }
    
    public Response updateOwaOptions(final OwaOptions owaOptions, final StandardFolder standardFolder) throws ServiceException {
        return this.updateOwaOptions(owaOptions, new StandardFolderId(standardFolder));
    }
    
    public Response updateOwaOptions(final OwaOptions owaOptions, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration()).setName(new UserConfigurationName("OWA.UserOptions", folderId));
        final Iterator<UserConfigurationDictionaryEntry> iterator = owaOptions.a().iterator();
        while (iterator.hasNext()) {
            userConfiguration.getEntries().add(iterator.next());
        }
        return this.updateUserConfiguration(userConfiguration);
    }
    
    public Response deleteOwaOptions() throws ServiceException {
        return this.deleteOwaOptions(StandardFolder.CALENDAR);
    }
    
    public Response deleteOwaOptions(final StandardFolder standardFolder) throws ServiceException {
        return this.deleteOwaOptions(new StandardFolderId(standardFolder));
    }
    
    public Response deleteOwaOptions(final FolderId folderId) throws ServiceException {
        return this.deleteUserConfiguration(new UserConfigurationName("OWA.UserOptions", folderId));
    }
    
    public Response createCalendarOptions(final CalendarOptions calendarOptions) throws ServiceException {
        return this.createCalendarOptions(calendarOptions, StandardFolder.CALENDAR);
    }
    
    public Response createCalendarOptions(final CalendarOptions calendarOptions, final StandardFolder standardFolder) throws ServiceException {
        return this.createCalendarOptions(calendarOptions, new StandardFolderId(standardFolder));
    }
    
    public Response createCalendarOptions(final CalendarOptions calendarOptions, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration()).setName(new UserConfigurationName("Calendar", folderId));
        final Iterator<UserConfigurationDictionaryEntry> iterator = calendarOptions.a().iterator();
        while (iterator.hasNext()) {
            userConfiguration.getEntries().add(iterator.next());
        }
        return this.createUserConfiguration(userConfiguration);
    }
    
    public Response updateCalendarOptions(final CalendarOptions calendarOptions) throws ServiceException {
        return this.updateCalendarOptions(calendarOptions, StandardFolder.CALENDAR);
    }
    
    public Response updateCalendarOptions(final CalendarOptions calendarOptions, final StandardFolder standardFolder) throws ServiceException {
        return this.updateCalendarOptions(calendarOptions, new StandardFolderId(standardFolder));
    }
    
    public Response updateCalendarOptions(final CalendarOptions calendarOptions, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration()).setName(new UserConfigurationName("Calendar", folderId));
        final Iterator<UserConfigurationDictionaryEntry> iterator = calendarOptions.a().iterator();
        while (iterator.hasNext()) {
            userConfiguration.getEntries().add(iterator.next());
        }
        return this.updateUserConfiguration(userConfiguration);
    }
    
    public CalendarOptions getCalendarOptions() throws ServiceException {
        return this.getCalendarOptions(StandardFolder.CALENDAR);
    }
    
    public CalendarOptions getCalendarOptions(final StandardFolder standardFolder) throws ServiceException {
        return this.getCalendarOptions(new StandardFolderId(standardFolder));
    }
    
    public CalendarOptions getCalendarOptions(final FolderId folderId) throws ServiceException {
        final GetUserConfigurationResponse userConfiguration = this.getUserConfiguration(new UserConfigurationName("Calendar", folderId), UserConfigurationProperty.DICTIONARY);
        CalendarOptions calendarOptions = null;
        if (userConfiguration.getUserConfiguration() != null) {
            calendarOptions = new CalendarOptions(userConfiguration.getUserConfiguration());
        }
        return calendarOptions;
    }
    
    public Response deleteCalendarOptions() throws ServiceException {
        return this.deleteCalendarOptions(StandardFolder.CALENDAR);
    }
    
    public Response deleteCalendarOptions(final StandardFolder standardFolder) throws ServiceException {
        return this.deleteCalendarOptions(new StandardFolderId(standardFolder));
    }
    
    public Response deleteCalendarOptions(final FolderId folderId) throws ServiceException {
        return this.deleteUserConfiguration(new UserConfigurationName("Calendar", folderId));
    }
    
    public Response createCategoryList(final CategoryList categoryList) throws ServiceException {
        return this.createCategoryList(categoryList, new StandardFolderId(StandardFolder.CALENDAR));
    }
    
    public Response createCategoryList(final CategoryList categoryList, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration(new UserConfigurationName("CategoryList", folderId))).setXmlData(com.ews.exchange.d.a(com.ews.exchange.d.d(categoryList.a())));
        return this.createUserConfiguration(userConfiguration);
    }
    
    public Response updateCategoryList(final CategoryList categoryList) throws ServiceException {
        return this.updateCategoryList(categoryList, new StandardFolderId(StandardFolder.CALENDAR));
    }
    
    public Response updateCategoryList(final CategoryList categoryList, final FolderId folderId) throws ServiceException {
        final UserConfiguration userConfiguration;
        (userConfiguration = new UserConfiguration(new UserConfigurationName("CategoryList", folderId))).setXmlData(com.ews.exchange.d.a(com.ews.exchange.d.d(categoryList.a())));
        return this.updateUserConfiguration(userConfiguration);
    }
    
    public CategoryList getCategoryList() throws ServiceException {
        return this.getCategoryList(new StandardFolderId(StandardFolder.CALENDAR));
    }
    
    public CategoryList getCategoryList(final FolderId folderId) throws ServiceException {
        return this.b(folderId);
    }
    
    private CategoryList b(FolderId folderId) throws ServiceException {
        UserConfigurationName userConfigurationName = new UserConfigurationName("CategoryList", folderId);
        final GetUserConfigurationResponse userConfiguration = this.getUserConfiguration(userConfigurationName, UserConfigurationProperty.XML_DATA);
        CategoryList list = null;
        try {
            final byte[] e;
            if (userConfiguration.getUserConfiguration() != null && userConfiguration.getUserConfiguration().getXmlData() != null && userConfiguration.getUserConfiguration().getXmlData().length() > 0 && (e = com.ews.exchange.d.e(userConfiguration.getUserConfiguration().getXmlData())) != null) {
                final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(new ByteArrayInputStream(e));
                while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("categories") && xmlStreamReader.getNamespaceURI().equals("CategoryList.xsd")) {
                        list = new CategoryList(xmlStreamReader);
                    }
                }
            }
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, (userConfigurationName).a());
        }
        return list;
    }
    
    public Response deleteCategoryList() throws ServiceException {
        return this.deleteCategoryList(new StandardFolderId(StandardFolder.CALENDAR));
    }
    
    public Response deleteCategoryList(final FolderId folderId) throws ServiceException {
        return this.deleteUserConfiguration(new UserConfigurationName("CategoryList", folderId));
    }
    
    public ImGroupInfoResponse addImGroup(final String displayName) throws ServiceException {
        return this.j(displayName);
    }
    
    private ImGroupInfoResponse j(String s) throws ServiceException {
        if (s == null) {
            throw new IllegalArgumentException("displayName is null.");
        }
        ImGroupInfoResponse response;
        final String string = "<AddImGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><DisplayName>" + com.ews.exchange.d.a(s) + "</DisplayName></AddImGroup>";
        try {
            final String s2 = string;
            response = a((InputStream)(this.a(s2, true)), "AddImGroupResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response setImGroup(final ItemId groupId, final String displayName) throws ServiceException {
        return this.a(groupId, displayName);
    }
    
    private Response a(ItemId a, String string) throws ServiceException {
        Response response;
        string = "<SetImGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + a.a("GroupId") + "<NewDisplayName>" + com.ews.exchange.d.a(string) + "</NewDisplayName></SetImGroup>";
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "SetImGroupResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response removeImGroup(final ItemId groupId) throws ServiceException {
        return this.b(groupId);
    }
    
    private Response b(ItemId a) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("groupId is null.");
        }
        Response response;
        final String string = "<RemoveImGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + a.a("GroupId") + "</RemoveImGroup>";
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "RemoveImGroupResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response removeContactFromImList(final ItemId contactId) throws ServiceException {
        return this.c(contactId);
    }
    
    private Response c(ItemId a) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("contactId is null.");
        }
        Response response;
        final String string = "<RemoveContactFromImList xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + a.a("ContactId") + "</RemoveContactFromImList>";
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "RemoveContactFromImListResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response removeDistributionGroupFromImList(final ItemId groupId) throws ServiceException {
        return this.d(groupId);
    }
    
    private Response d(ItemId a) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("groupId is null.");
        }
        Response response;
        final String string = "<RemoveDistributionGroupFromImList xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + a.a("GroupId") + "</RemoveDistributionGroupFromImList>";
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "RemoveDistributionGroupFromImListResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response removeImContactFromGroup(final ItemId groupId, final ItemId contactId) throws ServiceException {
        return this.a(groupId, contactId);
    }
    
    private Response a(ItemId a, final ItemId itemId) throws ServiceException {
        if (a == null) {
            throw new IllegalArgumentException("groupId is null.");
        }
        Response response;
        if (itemId == null) {
            throw new IllegalArgumentException("contactId is null.");
        }
        final String string = "<RemoveImContactFromGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + itemId.a("ContactId") + a.a("GroupId") + "</RemoveImContactFromGroup>";
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "RemoveImContactFromGroupResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public PersonaInfoResponse addNewTelUriContactToGroup(final ItemId groupId, final String telUriAddress, final String imTelephoneNumber, final String imContactSipUriAddress) throws ServiceException {
        return this.a(groupId, telUriAddress, imTelephoneNumber, imContactSipUriAddress);
    }
    
    private PersonaInfoResponse a(ItemId itemId, String a, String message, String xmlMessage) throws ServiceException {
        String s = "<AddNewTelUriContactToGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">";
        if (a != null) {
            s = s + "<TelUriAddress>" + com.ews.exchange.d.a(a) + "</TelUriAddress>";
        }
        PersonaInfoResponse response;
        if (xmlMessage != null) {
            s = s + "<ImContactSipUriAddress>" + com.ews.exchange.d.a(xmlMessage) + "</ImContactSipUriAddress>";
        }
        if (message != null) {
            s = s + "<ImTelephoneNumber>" + com.ews.exchange.d.a(message) + "</ImTelephoneNumber>";
        }
        if (itemId != null) {
            s += itemId.a("GroupId");
        }
        final String string = s + "</AddNewTelUriContactToGroup>";
        try {
            a = string;
            response = e((InputStream)(this.a(a, true)), "AddNewTelUriContactToGroupResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            a = com.ews.exchange.a.a((response).getResponseCode());
            message = (response).getMessage();
            xmlMessage = (response).getXmlMessage();
            throw new ServiceException(a, message, xmlMessage, string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public ImGroupInfoResponse addDistributionGroupToImList(final String smtpAddress, final String displayName) throws ServiceException {
        return this.c(smtpAddress, displayName);
    }
    
    private ImGroupInfoResponse c(String s, String a) throws ServiceException {
        String s2 = "<AddDistributionGroupToImList xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">";
        if (s != null) {
            s2 = s2 + "<SmtpAddress>" + com.ews.exchange.d.a(s) + "</SmtpAddress>";
        }
        if (a != null) {
            s2 = s2 + "<DisplayName>" + com.ews.exchange.d.a(a) + "</DisplayName>";
        }
        final String string = s2 + "</AddDistributionGroupToImList>";
        ImGroupInfoResponse response;
        try {
            response = a((InputStream)(this.a(a, true)), "AddDistributionGroupToImListResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            a = com.ews.exchange.a.a((response).getResponseCode());
            throw new ServiceException(a, (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public PersonaInfoResponse addNewImContactToGroup(final ItemId groupId, final String imAddress) throws ServiceException {
        return this.addNewImContactToGroup(groupId, imAddress, null);
    }
    
    public PersonaInfoResponse addNewImContactToGroup(final ItemId groupId, final String imAddress, final String displayName) throws ServiceException {
        return this.a(groupId, imAddress, displayName);
    }
    
    private PersonaInfoResponse a(ItemId itemId, String requestBody, String a) throws ServiceException {
        requestBody = "<AddNewImContactToGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\"><ImAddress>" + com.ews.exchange.d.a(requestBody) + "</ImAddress>";
        if (a != null) {
            requestBody = requestBody + "<DisplayName>" + com.ews.exchange.d.a(a) + "</DisplayName>";
        }
        requestBody = requestBody + itemId.a("GroupId") + "</AddNewImContactToGroup>";
        PersonaInfoResponse response;
        try {
            response = e((InputStream)(this.a(a, true)), "AddNewImContactToGroupResponse");
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, requestBody);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, requestBody);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            a = com.ews.exchange.a.a((response).getResponseCode());
            throw new ServiceException(a, (response).getMessage(), (response).getXmlMessage(), requestBody, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public Response addImContactToGroup(final ItemId groupId, final ItemId contactId) throws ServiceException {
        return this.b(groupId, contactId);
    }
    
    private Response b(ItemId a, final ItemId itemId) throws ServiceException {
        final String string = "<AddImContactToGroup xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">" + itemId.a("ContactId") + a.a("GroupId") + "</AddImContactToGroup>";
        Response response;
        try {
            final String s = string;
            response = f((InputStream)(this.a(s, true)), "AddImContactToGroupResponse").get(0);
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetImItemListResponse getImItemList() throws ServiceException {
        return this.getImItemList(null);
    }
    
    public GetImItemListResponse getImItemList(final ExtendedPropertyList extendedProperties) throws ServiceException {
        return this.a(extendedProperties);
    }
    
    private GetImItemListResponse a(ExtendedPropertyList list) throws ServiceException {
        String string = "<GetImItemList xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\">";
        GetImItemListResponse response;
        if (list != null && list.size() > 0) {
            String s = string + "<ExtendedProperties>";
            for (int i = 0; i < list.size(); ++i) {
                s += list.get(i).toString();
            }
            string = s + "</ExtendedProperties>";
        }
        final String string2 = string + "</GetImItemList>";
        try {
            final String s2 = string2;
            response = f((InputStream)(this.a(s2, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string2);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string2);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string2, (response).getServerVersionInfo());
        }
        return response;
    }
    
    public GetImItemsResponse getImItems(final List<ItemId> groupIds) throws ServiceException {
        return this.getImItems(groupIds, null, null);
    }
    
    public GetImItemsResponse getImItems(final List<ItemId> groupIds, final List<ItemId> contactIds) throws ServiceException {
        return this.getImItems(groupIds, contactIds, null);
    }
    
    public GetImItemsResponse getImItems(final List<ItemId> groupIds, final List<ItemId> contactIds, final ExtendedPropertyList extendedProperties) throws ServiceException {
        return this.a(groupIds, contactIds, extendedProperties);
    }
    
    private GetImItemsResponse a(List<ItemId> o, final List<ItemId> list, final ExtendedPropertyList list2) throws ServiceException {
        String s = "<GetImItems xmlns=\"http://schemas.microsoft.com/exchange/services/2006/messages\" xmlns:t=\"http://schemas.microsoft.com/exchange/services/2006/types\">";
        GetImItemsResponse response;
        if (list != null && list.size() > 0) {
            String s2 = s + "<ContactIds>";
            for (int i = 0; i < list.size(); ++i) {
                s2 += list.get(i).a();
            }
            s = s2 + "</ContactIds>";
        }
        if (o != null && ((List)o).size() > 0) {
            String s3 = s + "<GroupIds>";
            for (int j = 0; j < ((List)o).size(); ++j) {
                s3 += ((List<ItemId>)o).get(j).a();
            }
            s = s3 + "</GroupIds>";
        }
        if (list2 != null && list2.size() > 0) {
            String s4 = s + "<ExtendedProperties>";
            for (int k = 0; k < list2.size(); ++k) {
                s4 += list2.get(k).toString();
            }
            s = s4 + "</ExtendedProperties>";
        }
        final String string = s + "</GetImItems>";
        try {
            final String s5 = string;
            response = e((InputStream)(this.a(s5, true)));
        }
        catch (ServiceException ex) {
            throw ex;
        }
        catch (Exception cause) {
            throw new ServiceException(cause.getMessage(), cause, string);
        }
        finally {
            try {
                if (this.r != null) {
                    this.r.close();
                }
                if (this.q != null && this.u == null) {
                    this.q.close();
                }
            }
            catch (IOException cause2) {
                throw new ServiceException(cause2.getMessage(), cause2, string);
            }
        }
        if ((response).getResponseClass() == ResponseClass.ERROR) {
            throw new ServiceException(com.ews.exchange.a.a((response).getResponseCode()), (response).getMessage(), (response).getXmlMessage(), string, (response).getServerVersionInfo());
        }
        return response;
    }
    
    private static List<UploadItemsResponse> a(final InputStream inputStream) throws XMLStreamException {
        final ArrayList<UploadItemsResponse> list = new ArrayList<UploadItemsResponse>();
        ServerVersionInfo serverVersionInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                serverVersionInfo = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("UploadItemsResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final UploadItemsResponse uploadItemsResponse;
                (uploadItemsResponse = new UploadItemsResponse(xmlStreamReader)).setServerVersionInfo(serverVersionInfo);
                list.add(uploadItemsResponse);
            }
        }
        return list;
    }
    
    private static List<MarkAsJunkResponse> b(final InputStream inputStream) throws XMLStreamException {
        final ArrayList<MarkAsJunkResponse> list = new ArrayList<MarkAsJunkResponse>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("MarkAsJunkResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final MarkAsJunkResponse markAsJunkResponse;
                (markAsJunkResponse = new MarkAsJunkResponse(xmlStreamReader)).f = f;
                list.add(markAsJunkResponse);
            }
        }
        return list;
    }
    
    private static List<ExportItemsResponse> c(final InputStream inputStream) throws XMLStreamException {
        final ArrayList<ExportItemsResponse> list = new ArrayList<ExportItemsResponse>();
        ServerVersionInfo serverVersionInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                serverVersionInfo = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("ExportItemsResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final ExportItemsResponse exportItemsResponse;
                (exportItemsResponse = new ExportItemsResponse(xmlStreamReader)).setServerVersionInfo(serverVersionInfo);
                list.add(exportItemsResponse);
            }
        }
        return list;
    }
    
    private static ImGroupInfoResponse a(final InputStream inputStream, final String localName) throws XMLStreamException {
        ImGroupInfoResponse imGroupInfoResponse = null;
        ServerVersionInfo serverVersionInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                serverVersionInfo = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(localName) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                (imGroupInfoResponse = new ImGroupInfoResponse(xmlStreamReader, localName)).setServerVersionInfo(serverVersionInfo);
            }
        }
        return imGroupInfoResponse;
    }
    
    private static List<FolderInfoResponse> b(final InputStream inputStream, final String startLocalName) throws XMLStreamException, ParseException {
        final ArrayList<FolderInfoResponse> list = new ArrayList<FolderInfoResponse>();
        ServerVersionInfo serverVersionInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                serverVersionInfo = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(startLocalName) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final FolderInfoResponse folderInfoResponse;
                (folderInfoResponse = new FolderInfoResponse(xmlStreamReader, startLocalName)).setServerVersionInfo(serverVersionInfo);
                list.add(folderInfoResponse);
            }
        }
        return list;
    }
    
    private static List<ConversationItemResponse> c(final InputStream inputStream, final String s) throws XMLStreamException, ParseException {
        final ArrayList<ConversationItemResponse> list = new ArrayList<ConversationItemResponse>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(s) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final ConversationItemResponse conversationItemResponse;
                (conversationItemResponse = new ConversationItemResponse(xmlStreamReader)).f = f;
                list.add(conversationItemResponse);
            }
        }
        return list;
    }
    
    private static List<ItemInfoResponse> d(final InputStream inputStream, final String startLocalName) throws XMLStreamException, ParseException
    {
        final ArrayList<ItemInfoResponse> list = new ArrayList<ItemInfoResponse>();
        ServerVersionInfo serverVersionInfo = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                serverVersionInfo = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(startLocalName) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final ItemInfoResponse itemInfoResponse;
                (itemInfoResponse = new ItemInfoResponse(xmlStreamReader, startLocalName)).setServerVersionInfo(serverVersionInfo);
                list.add(itemInfoResponse);
            }
        }
        return list;
    }
    
    private static List<FindFolderResponse> d(final InputStream inputStream) throws XMLStreamException, ParseException {
        ArrayList var1 = new ArrayList();
        ServerVersionInfo var2 = null;
        XMLStreamReader var4 = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);

        while(var4.hasNext() && var4.next() > 0) {
            if (var4.isStartElement() && var4.getLocalName() != null && var4.getNamespaceURI() != null && var4.getLocalName().equals("ServerVersionInfo") && var4.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                var2 = new ServerVersionInfo(var4);
            } else if (var4.isStartElement() && var4.getLocalName() != null && var4.getNamespaceURI() != null && var4.getLocalName().equals("FindFolderResponseMessage") && var4.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                FindFolderResponse var3;
                (var3 = new FindFolderResponse(var4)).f = var2;
                var1.add(var3);
            }
        }

        return var1;
    }
    
    private static GetImItemsResponse e(final InputStream inputStream) throws XMLStreamException, ParseException {
        GetImItemsResponse getImItemsResponse = null;
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("GetImItemsResponse") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                (getImItemsResponse = new GetImItemsResponse(xmlStreamReader)).f = f;
            }
        }
        return getImItemsResponse;
    }
    
    private static GetImItemListResponse f(final InputStream inputStream) throws XMLStreamException, ParseException {
        GetImItemListResponse getImItemListResponse = null;
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("GetImItemListResponse") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                (getImItemListResponse = new GetImItemListResponse(xmlStreamReader)).f = f;
            }
        }
        return getImItemListResponse;
    }
    
    private static FindPeopleResponse g(final InputStream inputStream) throws XMLStreamException, ParseException {
        FindPeopleResponse findPeopleResponse = null;
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("FindPeopleResponse") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                (findPeopleResponse = new FindPeopleResponse(xmlStreamReader)).f = f;
            }
        }
        return findPeopleResponse;
    }
    
    private static PersonaInfoResponse e(final InputStream inputStream, final String startLocalName) throws XMLStreamException, ParseException {
        PersonaInfoResponse personaInfoResponse = null;
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(startLocalName) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                (personaInfoResponse = new PersonaInfoResponse(xmlStreamReader, startLocalName)).f = f;
            }
        }
        return personaInfoResponse;
    }
    
    private static List<FindItemResponse> h(final InputStream inputStream) throws XMLStreamException, ParseException {
        final ArrayList<FindItemResponse> list = new ArrayList<FindItemResponse>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("FindItemResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final FindItemResponse findItemResponse;
                (findItemResponse = new FindItemResponse(xmlStreamReader)).f = f;
                list.add(findItemResponse);
            }
        }
        return list;
    }
    
    private static List<CreateAttachmentResponse> i(final InputStream inputStream) throws XMLStreamException, ParseException {
        final ArrayList<CreateAttachmentResponse> list = new ArrayList<CreateAttachmentResponse>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("CreateAttachmentResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final CreateAttachmentResponse createAttachmentResponse;
                (createAttachmentResponse = new CreateAttachmentResponse(xmlStreamReader)).f = f;
                list.add(createAttachmentResponse);
            }
        }
        return list;
    }
    
    private static List<ConvertIdResponse> j(final InputStream inputStream) throws XMLStreamException {
        final ArrayList<ConvertIdResponse> list = new ArrayList<ConvertIdResponse>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("ConvertIdResponseMessage") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final ConvertIdResponse convertIdResponse;
                (convertIdResponse = new ConvertIdResponse(xmlStreamReader)).f = f;
                list.add(convertIdResponse);
            }
        }
        return list;
    }
    
    private static List<Response> f(final InputStream inputStream, final String startLocalName) throws XMLStreamException {
        final ArrayList<Response> list = new ArrayList<Response>();
        ServerVersionInfo f = null;
        final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
        while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ServerVersionInfo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                f = new ServerVersionInfo(xmlStreamReader);
            }
            else {
                if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals(startLocalName) || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/messages")) {
                    continue;
                }
                final Response response;
                (response = new Response(xmlStreamReader, startLocalName)).f = f;
                list.add(response);
            }
        }
        return list;
    }
    
    private static String i(final List<FolderId> list) {
        String string = "<FolderIds>";
        for (int i = 0; i < list.size(); ++i) {
            string += list.get(i).a();
        }
        return string + "</FolderIds>";
    }
    
    private static String j(final List<FolderId> list) {
        String string = "<ParentFolderIds>";
        for (int i = 0; i < list.size(); ++i) {
            string += list.get(i).a();
        }
        return string + "</ParentFolderIds>";
    }
    
    private void k(final List<PropertyPath> list) {
        if (this.g != RequestServerVersion.EXCHANGE_2007 || this.g != RequestServerVersion.EXCHANGE_2007_SP1) {
            list.remove(AppointmentPropertyPath.MEETING_TIME_ZONE);
            list.remove(MeetingRequestPropertyPath.MEETING_TIME_ZONE);
        }
        if (this.g == RequestServerVersion.EXCHANGE_2007) {
            list.remove(ItemPropertyPath.EFFECTIVE_RIGHTS);
            list.remove(AppointmentPropertyPath.UID);
            list.remove(AppointmentPropertyPath.UID);
            list.remove(AppointmentPropertyPath.UID);
        }
        if (this.g == RequestServerVersion.EXCHANGE_2007 || this.g == RequestServerVersion.EXCHANGE_2007_SP1) {
            list.remove(ItemPropertyPath.IS_ASSOCIATED);
            list.remove(ItemPropertyPath.WEB_CLIENT_EDIT_FORM_QUERY_STRING);
            list.remove(ItemPropertyPath.WEB_CLIENT_READ_FORM_QUERY_STRING);
            list.remove(ItemPropertyPath.CONVERSATION_ID);
            list.remove(ItemPropertyPath.UNIQUE_BODY);
            list.remove(AppointmentPropertyPath.START_TIME_ZONE);
            list.remove(AppointmentPropertyPath.END_TIME_ZONE);
            list.remove(MeetingRequestPropertyPath.START_TIME_ZONE);
            list.remove(MeetingRequestPropertyPath.END_TIME_ZONE);
        }
        if (this.g == RequestServerVersion.EXCHANGE_2007 || this.g == RequestServerVersion.EXCHANGE_2007_SP1 || this.g == RequestServerVersion.EXCHANGE_2010 || this.g == RequestServerVersion.EXCHANGE_2010_SP1 || this.g == RequestServerVersion.EXCHANGE_2010_SP2) {
            list.remove(ItemPropertyPath.STORE_ENTRY_ID);
            list.remove(ContactPropertyPath.ALIAS);
            list.remove(ContactPropertyPath.DIRECTORY_ID);
            list.remove(ContactPropertyPath.DIRECT_REPORTS);
            list.remove(ContactPropertyPath.MANAGER_MAILBOX);
            list.remove(ContactPropertyPath.MS_EXCHANGE_CERTIFICATE);
            list.remove(ContactPropertyPath.NOTES);
            list.remove(ContactPropertyPath.PHONETIC_FULL_NAME);
            list.remove(ContactPropertyPath.PHONETIC_FIRST_NAME);
            list.remove(ContactPropertyPath.PHONETIC_LAST_NAME);
            list.remove(ContactPropertyPath.PHOTO);
            list.remove(ContactPropertyPath.USER_SMIME_CERTIFICATE);
        }
        if (this.g != RequestServerVersion.EXCHANGE_2013 && this.g != RequestServerVersion.EXCHANGE_2013_SP1 && this.g != RequestServerVersion.EXCHANGE_2016) {
            list.remove(ItemPropertyPath.FLAG);
            list.remove(ItemPropertyPath.INSTANCE_KEY);
            list.remove(ItemPropertyPath.RETENTION_TAG);
            list.remove(ItemPropertyPath.ARCHIVE_TAG);
            list.remove(ItemPropertyPath.RETENTION_DATE);
            list.remove(ItemPropertyPath.PREVIEW);
            list.remove(ItemPropertyPath.ICON_INDEX);
            list.remove(AppointmentPropertyPath.REMINDER_NEXT_TIME);
            list.remove(AppointmentPropertyPath.START_WALL_CLOCK);
            list.remove(AppointmentPropertyPath.END_WALL_CLOCK);
            list.remove(AppointmentPropertyPath.ENHANCED_LOCATION);
            list.remove(AppointmentPropertyPath.JOIN_ONLINE_MEETING_URL);
            list.remove(AppointmentPropertyPath.ONLINE_MEETING_SETTINGS);
            list.remove(MeetingRequestPropertyPath.REMINDER_NEXT_TIME);
            list.remove(MeetingRequestPropertyPath.START_WALL_CLOCK);
            list.remove(MeetingRequestPropertyPath.END_WALL_CLOCK);
            list.remove(MeetingRequestPropertyPath.ENHANCED_LOCATION);
            list.remove(MeetingRequestPropertyPath.JOIN_ONLINE_MEETING_URL);
            list.remove(MeetingRequestPropertyPath.ONLINE_MEETING_SETTINGS);
            list.remove(MeetingRequestPropertyPath.CHANGE_HIGHLIGHTS);
        }
        list.remove(ItemPropertyPath.BODY);
        list.remove(ItemPropertyPath.ATTACHMENTS);
        list.remove(ItemPropertyPath.MIME_CONTENT);
        list.remove(ItemPropertyPath.UNIQUE_BODY);
        list.remove(ItemPropertyPath.BLOCK_STATUS);
        list.remove(ItemPropertyPath.HAS_BLOCKED_IMAGES);
        list.remove(ItemPropertyPath.TEXT_BODY);
        list.remove(ItemPropertyPath.NEXT_PREDICTED_ACTION);
        list.remove(ItemPropertyPath.GROUPING_ACTION);
        list.remove(AppointmentPropertyPath.ORIGINAL_START_TIME);
        list.remove(AppointmentPropertyPath.IS_CANCELLED);
        list.remove(AppointmentPropertyPath.REQUIRED_ATTENDEES);
        list.remove(AppointmentPropertyPath.OPTIONAL_ATTENDEES);
        list.remove(AppointmentPropertyPath.RESOURCES);
        list.remove(AppointmentPropertyPath.CONFLICTING_MEETING_COUNT);
        list.remove(AppointmentPropertyPath.ADJACENT_MEETING_COUNT);
        list.remove(AppointmentPropertyPath.CONFLICTING_MEETINGS);
        list.remove(AppointmentPropertyPath.ADJACENT_MEETINGS);
        list.remove(AppointmentPropertyPath.RECURRENCE);
        list.remove(AppointmentPropertyPath.FIRST_OCCURRENCE);
        list.remove(AppointmentPropertyPath.LAST_OCCURRENCE);
        list.remove(AppointmentPropertyPath.MODIFIED_OCCURRENCES);
        list.remove(AppointmentPropertyPath.DELETED_OCCURRENCES);
        list.remove(AppointmentPropertyPath.MEETING_TIME_ZONE);
        list.remove(MessagePropertyPath.INTERNET_MESSAGE_HEADERS);
        list.remove(MessagePropertyPath.RESPONSE_ITEMS);
        list.remove(MessagePropertyPath.TO_RECIPIENTS);
        list.remove(MessagePropertyPath.CC_RECIPIENTS);
        list.remove(MessagePropertyPath.BCC_RECIPIENTS);
        list.remove(MessagePropertyPath.REPLY_TO);
        list.remove(TaskPropertyPath.RECURRENCE);
        list.remove(MeetingMessagePropertyPath.APPOINTMENT_ID);
        list.remove(MeetingMessagePropertyPath.IS_DELEGATED);
        list.remove(MeetingMessagePropertyPath.IS_OUT_OF_DATE);
        list.remove(MeetingRequestPropertyPath.ORIGINAL_START_TIME);
        list.remove(MeetingRequestPropertyPath.IS_CANCELLED);
        list.remove(MeetingRequestPropertyPath.REQUIRED_ATTENDEES);
        list.remove(MeetingRequestPropertyPath.OPTIONAL_ATTENDEES);
        list.remove(MeetingRequestPropertyPath.RESOURCES);
        list.remove(MeetingRequestPropertyPath.CONFLICTING_MEETING_COUNT);
        list.remove(MeetingRequestPropertyPath.ADJACENT_MEETING_COUNT);
        list.remove(MeetingRequestPropertyPath.CONFLICTING_MEETINGS);
        list.remove(MeetingRequestPropertyPath.ADJACENT_MEETINGS);
        list.remove(MeetingRequestPropertyPath.RECURRENCE);
        list.remove(MeetingRequestPropertyPath.FIRST_OCCURRENCE);
        list.remove(MeetingRequestPropertyPath.LAST_OCCURRENCE);
        list.remove(MeetingRequestPropertyPath.MODIFIED_OCCURRENCES);
        list.remove(MeetingRequestPropertyPath.DELETED_OCCURRENCES);
        list.remove(MeetingRequestPropertyPath.MEETING_TIME_ZONE);
        list.remove(MeetingRequestPropertyPath.MEETING_REQUEST_TYPE);
        list.remove(MessagePropertyPath.BODY_RTF);
    }
    
    private void a(final FolderShape folderShape) {
        if (this.g == RequestServerVersion.EXCHANGE_2007) {
            folderShape.getPropertyPaths().remove(FolderPropertyPath.EFFECTIVE_RIGHTS);
        }
        if (this.g != RequestServerVersion.EXCHANGE_2013 && this.g != RequestServerVersion.EXCHANGE_2013_SP1 && this.g != RequestServerVersion.EXCHANGE_2016) {
            folderShape.getPropertyPaths().remove(FolderPropertyPath.DISTINGUISHED_FOLDER_ID);
            folderShape.getPropertyPaths().remove(FolderPropertyPath.RETENTION_TAG);
            folderShape.getPropertyPaths().remove(FolderPropertyPath.ARCHIVE_TAG);
        }
    }
    
    private static void b(final FolderShape folderShape) {
        folderShape.getPropertyPaths().remove(FolderPropertyPath.PERMISSION_SET);
        folderShape.getPropertyPaths().remove(FolderPropertyPath.MANAGED_FOLDER_INFORMATION);
    }
    
    private static InputStream k(InputStream var0) throws IOException {
        BufferedInputStream var6 = new BufferedInputStream(var0);
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        byte[] var2 = new byte[2048];

        int var3;
        try {
            var3 = var6.read(var2);

            while(true) {
                if (var3 == -1) {
                    var2 = var1.toByteArray();
                    break;
                }

                var1.write(var2, 0, var3);
                var3 = var6.read(var2);
            }
        } finally {
            var6.close();
            var1.close();
        }

        for(var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] == 25) {
                var2[var3] = 32;
            } else if (var2[var3] == 38 && var3 < var2.length - 3 && var2[var3 + 1] == 35 && var2[var3 + 2] == 120 && var2[var3 + 3] != 9 && var2[var3 + 3] != 65 && var2[var3 + 3] != 68) {
                var2[var3] = 32;
            }
        }

        return new ByteArrayInputStream(var2);
    }
    
    private static String k(final String s) {
        if (s != null) {
            return "https://login.microsoftonline.com/" + s + "/oauth2/v2.0";
        }
        return "https://login.microsoftonline.com/organizations/oauth2/v2.0";
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
    
    public TimeZoneDefinition getTimeZoneContext() {
        return this.h;
    }
    
    public void setTimeZoneContext(final TimeZoneDefinition timeZoneContext) {
        this.h = timeZoneContext;
    }
    
    public DateTimePrecision getDateTimePrecision() {
        return this.i;
    }
    
    public void setDateTimePrecision(final DateTimePrecision dateTimePrecision) {
        this.i = dateTimePrecision;
    }
    
    public Proxy getHttpURLConnectionProxy() {
        return this.n;
    }
    
    public void setHttpURLConnectionProxy(final Proxy httpURLConnectionProxy) {
        this.n = httpURLConnectionProxy;
    }
    
    public HttpHost getProxy() {
        return this.t;
    }
    
    public void setProxy(final HttpHost proxy) {
        this.t = proxy;
    }
    
    public Credentials getProxyCredentials() {
        return this.s;
    }
    
    public void setProxyCredentials(final Credentials proxyCredentials) {
        this.s = proxyCredentials;
    }
    
    public HttpClientConnectionManager getClientConnectionManager() {
        return this.u;
    }
    
    public void setClientConnectionManager(final HttpClientConnectionManager connectionManager) {
        this.u = connectionManager;
    }
    
    public RequestConfig getRequestConfig() {
        return this.v;
    }
    
    public void setRequestConfig(final RequestConfig requestConfig) {
        this.v = requestConfig;
    }
    
    public void setHttpURLConnection(final boolean useHttpURLConnection) {
        this.m = useHttpURLConnection;
    }
    
    public void setConnectTimeout(final int connectTimeout) {
        this.o = connectTimeout;
    }
    
    public int getConnectTimeout() {
        return this.o;
    }
    
    public void setReadTimeout(final int readTimeout) {
        this.p = readTimeout;
    }
    
    public int getReadTimeout() {
        return this.p;
    }
    
    public void setAcceptGzipEncoding(final boolean acceptGzipEncoding) {
        this.j = acceptGzipEncoding;
    }
    
    public boolean isAcceptGzipEncoding() {
        return this.j;
    }
    
    public void setCheckResponseXml(final boolean checkResponseXml) {
        this.k = checkResponseXml;
    }
    
    public boolean isCheckResponseXml() {
        return this.k;
    }
    
    public void setCustomHeaders(final Header[] customHeaders) {
        this.F = customHeaders;
    }
    
    public Header[] getCustomHeaders() {
        return this.F;
    }
    
    public void setOAuthToken(final OAuthToken oAuthToken) {
        this.l = oAuthToken;
    }
    
    public OAuthToken getOAuthToken() {
        return this.l;
    }
    
    public void setClientId(final String clientId) {
        this.x = clientId;
    }
    
    public String getClientId() {
        return this.x;
    }
    
    public void setTenant(final String tenant) {
        this.y = tenant;
    }
    
    public String getTenant() {
        return this.y;
    }
    
    public List<String> getScope() {
        return this.z;
    }
    
    public void setClientSecret(final String clientSecret) {
        this.A = clientSecret;
    }
    
    public String getClientSecret() {
        return this.A;
    }
    
    public void setclientAssertion(final String clientAssertion) {
        this.B = clientAssertion;
    }
    
    public String getClientAssertion() {
        return this.B;
    }
    
    public void setAuthorizationCode(final String authorizationCode) {
        this.C = authorizationCode;
    }
    
    public String getAuthorizationCode() {
        return this.C;
    }
    
    public void setAuthorizationCodeRedirectUri(final String authorizationCodeRedirectUri) {
        this.D = authorizationCodeRedirectUri;
    }
    
    public String getAuthorizationCodeRedirectUri() {
        return this.D;
    }
    
    public void setDeviceCode(final String deviceCode) {
        this.E = deviceCode;
    }
    
    public String getDeviceCode() {
        return this.E;
    }
}

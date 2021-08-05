package com.independentsoft.exchange;

import com.independentsoft.json.parser.*;
import java.util.*;

public class OAuthToken
{
    private String a;
    private int b;
    private List<String> c;
    private Date d;
    private String e;
    private String f;
    private String g;
    
    public OAuthToken(final String accessToken) {
        this.c = new ArrayList<String>();
        this.e = accessToken;
    }
    
    public OAuthToken(final String accessToken, final String refreshToken) {
        this.c = new ArrayList<String>();
        this.e = accessToken;
        this.g = refreshToken;
    }
    
    public OAuthToken(final String accessToken, final String refreshToken, final Date expiresOn) {
        this.c = new ArrayList<String>();
        this.e = accessToken;
        this.g = refreshToken;
        this.d = expiresOn;
    }
    
    public OAuthToken(final String accessToken, final String refreshToken, final String idToken) {
        this.c = new ArrayList<String>();
        this.e = accessToken;
        this.g = refreshToken;
        this.f = idToken;
    }
    
    OAuthToken(final JsonObject jsonObject) {
        this.c = new ArrayList<String>();
        this.e = jsonObject.getStringValue("access_token");
        this.g = jsonObject.getStringValue("refresh_token");
        this.f = jsonObject.getStringValue("id_token");
        this.a = jsonObject.getStringValue("token_type");
        this.b = jsonObject.getIntValue("expires_in");
        if (this.b > 0) {
            final Calendar instance;
            (instance = Calendar.getInstance(Locale.getDefault())).add(13, this.b);
            this.d = instance.getTime();
        }
        final String stringValue;
        if ((stringValue = jsonObject.getStringValue("scope")) != null) {
            final String[] split = stringValue.split("\\s+");
            for (int i = 0; i < split.length; ++i) {
                this.c.add(split[i]);
            }
        }
    }
    
    public String getType() {
        return this.a;
    }
    
    public int getExpiresIn() {
        return this.b;
    }
    
    public List<String> getScope() {
        return this.c;
    }
    
    public Date getExpiresOn() {
        return this.d;
    }
    
    public void setExpiresOn(final Date expiresOn) {
        this.d = expiresOn;
    }
    
    public String getAccessToken() {
        return this.e;
    }
    
    public void setAccessToken(final String accessToken) {
        this.e = accessToken;
    }
    
    public String getIdToken() {
        return this.f;
    }
    
    public void setIdToken(final String idToken) {
        this.f = idToken;
    }
    
    public String getRefreshToken() {
        return this.g;
    }
    
    public void setRefreshToken(final String refreshToken) {
        this.g = refreshToken;
    }
}

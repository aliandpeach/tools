package com.ews.exchange;

import com.ews.json.parser.*;
import java.util.*;

public class DeviceAuthorizationCode
{
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private Date g;
    
    public DeviceAuthorizationCode() {
    }
    
    DeviceAuthorizationCode(final JsonObject jsonObject) {
        this.a = jsonObject.getStringValue("device_code");
        this.b = jsonObject.getStringValue("user_code");
        this.c = jsonObject.getStringValue("verification_uri");
        this.d = jsonObject.getStringValue("message");
        this.e = jsonObject.getIntValue("expires_in");
        if (this.e > 0) {
            final Calendar instance;
            (instance = Calendar.getInstance(Locale.getDefault())).add(13, this.e);
            this.g = instance.getTime();
        }
        this.f = jsonObject.getIntValue("interval");
    }
    
    public String getDeviceCode() {
        return this.a;
    }
    
    public String getUserCode() {
        return this.b;
    }
    
    public String getVerificationUri() {
        return this.c;
    }
    
    public String getMessage() {
        return this.d;
    }
    
    public int getExpiresIn() {
        return this.e;
    }
    
    public Date getExpiresOn() {
        return this.g;
    }
    
    public int getInterval() {
        return this.f;
    }
}

package com.ews.exchange;

import java.util.*;

public class AutodiscoverException extends Exception
{
    private Date a;
    private String b;
    private String c;
    private String d;
    private String e;
    
    private AutodiscoverException() {
    }
    
    AutodiscoverException(final Error error) {
        this.a = error.getTime();
        this.b = error.getId();
        this.c = error.getCode();
        this.d = error.getMessage();
        this.e = error.getDebugData();
    }
    
    AutodiscoverException(ErrorCode code, final String message) {
        code = code;
        String c = null;
        Label_0136: {
            if (code != ErrorCode.NO_ERROR) {
                if (code == ErrorCode.REDIRECT_ADDRESS) {
                    c = "RedirectAddress";
                    break Label_0136;
                }
                if (code == ErrorCode.REDIRECT_URL) {
                    c = "RedirectUrl";
                    break Label_0136;
                }
                if (code == ErrorCode.INVALID_USER) {
                    c = "InvalidUser";
                    break Label_0136;
                }
                if (code == ErrorCode.INVALID_REQUEST) {
                    c = "InvalidRequest";
                    break Label_0136;
                }
                if (code == ErrorCode.INVALID_SETTING) {
                    c = "InvalidSetting";
                    break Label_0136;
                }
                if (code == ErrorCode.SETTING_IS_NOT_AVAILABLE) {
                    c = "SettingIsNotAvailable";
                    break Label_0136;
                }
                if (code == ErrorCode.SERVER_BUSY) {
                    c = "ServerBusy";
                    break Label_0136;
                }
                if (code == ErrorCode.INVALID_DOMAIN) {
                    c = "InvalidDomain";
                    break Label_0136;
                }
                if (code == ErrorCode.NOT_FEDERATED) {
                    c = "NotFederated";
                    break Label_0136;
                }
                if (code == ErrorCode.INTERNAL_SERVER_ERROR) {
                    c = "InternalServerError";
                    break Label_0136;
                }
            }
            c = "NoError";
        }
        this.c = c;
        this.d = message;
    }
    
    AutodiscoverException(final String code, final String message, final String debugData) {
        this.c = code;
        this.d = message;
        this.e = debugData;
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public Date getTime() {
        return this.a;
    }
    
    public String getId() {
        return this.b;
    }
    
    public String getCode() {
        return this.c;
    }
    
    public String getMessage() {
        return this.d;
    }
    
    public String getDebugData() {
        return this.e;
    }
}

package com.ews.exchange;

import org.apache.http.protocol.*;
import org.apache.http.auth.*;
import org.apache.http.impl.auth.*;

public class NTLMSchemeFactory implements AuthSchemeProvider
{
    public AuthScheme create(final HttpContext context) {
        return (AuthScheme)new NTLMScheme((NTLMEngine)new JCIFSEngine());
    }
}

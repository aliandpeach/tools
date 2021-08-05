package com.independentsoft.exchange;

import jcifs.context.SingletonContext;
import jcifs.util.*;
import org.apache.http.impl.auth.*;
import java.io.*;
import java.util.Base64;

import jcifs.ntlmssp.*;

public class JCIFSEngine implements NTLMEngine
{
    public String generateType1Msg(final String domain, final String workstation) throws NTLMEngineException {
        Type1Message type1Message = new Type1Message(SingletonContext.getInstance(), -1610055676, domain, workstation);
        return Base64.getEncoder().encodeToString(type1Message.toByteArray());
    }
    
    public String generateType3Msg(final String username, final String password, final String domain, final String workstation, final String challenge) throws NTLMEngineException {
        return "";
    }
}

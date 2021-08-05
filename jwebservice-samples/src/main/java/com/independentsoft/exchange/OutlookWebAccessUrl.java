package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;

public class OutlookWebAccessUrl
{
    private String a;
    private List<AuthenticationMethod> b;
    
    public OutlookWebAccessUrl() {
        this.b = new ArrayList<AuthenticationMethod>();
    }
    
    OutlookWebAccessUrl(final XMLStreamReader reader) throws XMLStreamException {
        this.b = new ArrayList<AuthenticationMethod>();
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        final String attributeValue;
        if ((attributeValue = xmlStreamReader.getAttributeValue(null, "AuthenticationMethod")) != null && attributeValue.length() > 0) {
            final String[] split = attributeValue.split(" ");
            for (int i = 0; i < split.length; ++i) {
                if (split[i] != null && split[i].length() > 1) {
                    final String trim;
                    this.b.add((trim = split[i].trim()).equals("Basic") ? AuthenticationMethod.BASIC : (trim.equals("Digest") ? AuthenticationMethod.DIGEST : (trim.equals("Fba") ? AuthenticationMethod.FBA : (trim.equals("Ntlm") ? AuthenticationMethod.NTLM : (trim.equals("WindowsIntegrated") ? AuthenticationMethod.WINDOWS_INTEGRATED : AuthenticationMethod.NONE)))));
                }
            }
        }
        this.a = xmlStreamReader.getElementText();
        while (xmlStreamReader.hasNext() && (!xmlStreamReader.isEndElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("OWAUrl") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/autodiscover/outlook/responseschema/2006a"))) {
            xmlStreamReader.next();
        }
    }
    
    public String getUrl() {
        return this.a;
    }
    
    public List<AuthenticationMethod> getAuthenticationMethods() {
        return this.b;
    }
}

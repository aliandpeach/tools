package com.independentsoft.exchange;

import javax.xml.stream.*;
import java.text.*;

public class Rule
{
    private String a;
    private String b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private RuleConditions g;
    private RuleExceptions h;
    private RuleActions i;
    
    public Rule() {
        this.c = 1;
        this.d = true;
    }
    
    Rule(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.c = 1;
        this.d = true;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        while (reader.hasNext()) {
            if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("RuleId") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("DisplayName") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = reader.getElementText();
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Priority") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = reader.getElementText()) != null && elementText.length() > 0) {
                    this.c = Integer.parseInt(elementText);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsEnabled") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = reader.getElementText()) != null && elementText2.length() > 0) {
                    this.d = Boolean.parseBoolean(elementText2);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsNotSupported") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = reader.getElementText()) != null && elementText3.length() > 0) {
                    this.e = Boolean.parseBoolean(elementText3);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("IsInError") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = reader.getElementText()) != null && elementText4.length() > 0) {
                    this.f = Boolean.parseBoolean(elementText4);
                }
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Conditions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = new RuleConditions(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Exceptions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.h = new RuleExceptions(reader);
            }
            else if (reader.isStartElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Actions") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.i = new RuleActions(reader);
            }
            if (reader.isEndElement() && reader.getLocalName() != null && reader.getNamespaceURI() != null && reader.getLocalName().equals("Rule") && reader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            reader.next();
        }
    }
    
    final String a() {
        String s = "<t:Rule>";
        if (this.a != null) {
            s = s + "<t:RuleId>" + com.independentsoft.exchange.d.a(this.a) + "</t:RuleId>";
        }
        if (this.b != null) {
            s = s + "<t:DisplayName>" + com.independentsoft.exchange.d.a(this.b) + "</t:DisplayName>";
        }
        if (this.c > Integer.MIN_VALUE) {
            s = s + "<t:Priority>" + this.c + "</t:Priority>";
        }
        String s2;
        if (this.d) {
            s2 = s + "<t:IsEnabled>true</t:IsEnabled>";
        }
        else {
            s2 = s + "<t:IsEnabled>false</t:IsEnabled>";
        }
        if (this.e) {
            s2 += "<t:IsNotSupported>true</t:IsNotSupported>";
        }
        if (this.f) {
            s2 += "<t:IsInError>true</t:IsInError>";
        }
        if (this.g != null) {
            s2 += this.g.a();
        }
        if (this.h != null) {
            s2 += this.h.a();
        }
        if (this.i != null) {
            s2 += this.i.a();
        }
        return s2 + "</t:Rule>";
    }
    
    public String getId() {
        return this.a;
    }
    
    public void setId(final String id) {
        this.a = id;
    }
    
    public String getDisplayName() {
        return this.b;
    }
    
    public void setDisplayName(final String displayName) {
        this.b = displayName;
    }
    
    public int getPriority() {
        return this.c;
    }
    
    public void setPriority(final int priority) {
        this.c = priority;
    }
    
    public boolean isEnabled() {
        return this.d;
    }
    
    public void setAsEnabled(final boolean isEnabled) {
        this.d = isEnabled;
    }
    
    public boolean isNotSupported() {
        return this.e;
    }
    
    public void setAsNotSupported(final boolean isNotSupported) {
        this.e = isNotSupported;
    }
    
    public boolean isInError() {
        return this.f;
    }
    
    public void setAsInError(final boolean isInError) {
        this.f = isInError;
    }
    
    public RuleConditions getConditions() {
        return this.g;
    }
    
    public void setConditions(final RuleConditions conditions) {
        this.g = conditions;
    }
    
    public RuleExceptions getExceptions() {
        return this.h;
    }
    
    public void setExceptions(final RuleExceptions exceptions) {
        this.h = exceptions;
    }
    
    public RuleActions getActions() {
        return this.i;
    }
    
    public void setActions(final RuleActions actions) {
        this.i = actions;
    }
}

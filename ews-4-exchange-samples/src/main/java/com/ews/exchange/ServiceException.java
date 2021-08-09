package com.ews.exchange;

import com.ews.json.parser.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import javax.xml.stream.*;

public class ServiceException extends Exception
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ServerVersionInfo g;
    
    public ServiceException(final String message) {
        super(message);
    }
    
    public ServiceException(final String message, final Throwable cause, final String requestBody) {
        super(message, cause);
        this.b = message;
        this.d = requestBody;
    }
    
    ServiceException(final String responseCode, final String message, final String xmlMessage, final String requestBody, final ServerVersionInfo serverVersionInfo) {
        this.a = responseCode;
        this.b = message;
        this.c = xmlMessage;
        this.d = requestBody;
        this.g = serverVersionInfo;
    }
    
    ServiceException(final String requestBody, final InputStream inputStream) {
        this.d = requestBody;
        try {
            final JsonObject jsonObject;
            if ((jsonObject = (JsonObject)new JsonParser(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).parse()) != null) {
                this.e = jsonObject.getStringValue("error");
                this.f = jsonObject.getStringValue("error_description");
                this.a = this.e;
                this.b = this.f;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        }
        catch (Exception ex2) {
            System.err.println(ex2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex3) {
                    System.err.println(ex3);
                }
            }
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex4) {
                    System.err.println(ex4);
                }
            }
        }
    }
    
    ServiceException(final String requestBody, final InputStream inputStream, final byte b) {
        this.d = requestBody;
        try {
            if (inputStream != null) {
                final XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
                while (xmlStreamReader.hasNext() && xmlStreamReader.next() > 0) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getLocalName().equals("faultcode")) {
                        this.e = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getLocalName().equals("faultstring")) {
                        this.f = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getLocalName().equals("ResponseCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/errors")) {
                        this.a = xmlStreamReader.getElementText();
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getLocalName().equals("Message") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/errors")) {
                        this.b = xmlStreamReader.getElementText();
                    }
                    else {
                        if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("MessageXml") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                            continue;
                        }
                        this.c = "";
                        while (xmlStreamReader.nextTag() > 0) {
                            if (xmlStreamReader.isStartElement()) {
                                this.c = this.c + "<" + xmlStreamReader.getLocalName() + " xmlns=\"" + xmlStreamReader.getNamespaceURI() + "\">";
                                this.c += xmlStreamReader.getElementText();
                                this.c = this.c + "</" + xmlStreamReader.getLocalName() + ">";
                            }
                            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MessageXml") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                break;
                            }
                        }
                    }
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        }
        catch (Exception ex2) {
            System.err.println(ex2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex3) {
                    System.err.println(ex3);
                }
            }
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException ex4) {
                    System.err.println(ex4);
                }
            }
        }
    }
    
    public String toString() {
        if (this.b != null) {
            return this.b;
        }
        return super.toString();
    }
    
    public String getFaultCode() {
        return this.e;
    }
    
    public String getFaultString() {
        return this.f;
    }
    
    public String getResponseCode() {
        return this.a;
    }
    
    public String getMessage() {
        return this.b;
    }
    
    public String getXmlMessage() {
        return this.c;
    }
    
    public int getLine() {
        return 0;
    }
    
    public int getPosition() {
        return 0;
    }
    
    public String getRequestBody() {
        return this.d;
    }
    
    public ServerVersionInfo getServerVersionInfo() {
        return this.g;
    }
}

package com.ews.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;
import java.nio.charset.*;
import java.nio.*;

public class Contact extends Item
{
    private String am;
    private FileAsMapping an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private CompleteName as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private String az;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private String aF;
    private String aG;
    private String aH;
    private String aI;
    private String aJ;
    private String aK;
    private String aL;
    private String aM;
    private String aN;
    private String aO;
    private String aP;
    private String aQ;
    private String aR;
    private String aS;
    private String aT;
    private String aU;
    private String aV;
    private String aW;
    private String aX;
    private String aY;
    private String aZ;
    private String ba;
    private String bb;
    private String bc;
    private String bd;
    private String be;
    private String bf;
    private Date bg;
    private String bh;
    private List<String> bi;
    private List<String> bj;
    private String bk;
    private String bl;
    private String bm;
    private String bn;
    private String bo;
    private String bp;
    private String bq;
    private String br;
    private String bs;
    private SelectedMailingAddress bt;
    private String bu;
    private String bv;
    private String bw;
    private Date bx;
    private String by;
    private String bz;
    private String bA;
    private String bB;
    private String bC;
    private String bD;
    private String bE;
    private String bF;
    private String bG;
    private String bH;
    private String bI;
    private String bJ;
    private boolean bK;
    private Gender bL;
    private String bM;
    private String bN;
    private String bO;
    private Mailbox bP;
    private String bQ;
    private String bR;
    private String bS;
    private String bT;
    private byte[] bU;
    private byte[] bV;
    private byte[] bW;
    
    public Contact() {
        this.an = FileAsMapping.NONE;
        this.bi = new ArrayList<String>();
        this.bj = new ArrayList<String>();
        this.bt = SelectedMailingAddress.NONE;
        this.bL = Gender.NONE;
    }
    
    public Contact(final String subject) {
        this.an = FileAsMapping.NONE;
        this.bi = new ArrayList<String>();
        this.bj = new ArrayList<String>();
        this.bt = SelectedMailingAddress.NONE;
        this.bL = Gender.NONE;
        this.d = subject;
    }
    
    public Contact(final MimeContent mimeContent) {
        this.an = FileAsMapping.NONE;
        this.bi = new ArrayList<String>();
        this.bj = new ArrayList<String>();
        this.bt = SelectedMailingAddress.NONE;
        this.bL = Gender.NONE;
        this.e = mimeContent;
    }
    
    Contact(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.an = FileAsMapping.NONE;
        this.bi = new ArrayList<String>();
        this.bj = new ArrayList<String>();
        this.bt = SelectedMailingAddress.NONE;
        this.bL = Gender.NONE;
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.a = new ItemId(xmlStreamReader, "ItemId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ParentFolderId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new FolderId(xmlStreamReader, "ParentFolderId");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemClass") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Subject") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MimeContent") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.e = new MimeContent(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Sensitivity") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.f = com.ews.exchange.a.N(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Body") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.g = new Body(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FileAttachment") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new FileAttachmentInfo(xmlStreamReader));
                    }
                    else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ItemAttachment") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.h.add(new ItemAttachmentInfo(xmlStreamReader));
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Attachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Size") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    this.i = Integer.parseInt(elementText2);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.j.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Categories") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Importance") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText3;
                if ((elementText3 = xmlStreamReader.getElementText()) != null && elementText3.length() > 0) {
                    this.k = com.ews.exchange.a.O(elementText3);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DateTimeCreated") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText4;
                if ((elementText4 = xmlStreamReader.getElementText()) != null && elementText4.length() > 0) {
                    this.l = com.ews.exchange.d.c(elementText4);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasAttachments") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText5;
                if ((elementText5 = xmlStreamReader.getElementText()) != null && elementText5.length() > 0) {
                    this.m = Boolean.parseBoolean(elementText5);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Culture") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.n = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderDueBy") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText6;
                if ((elementText6 = xmlStreamReader.getElementText()) != null && elementText6.length() > 0) {
                    this.E = com.ews.exchange.d.c(elementText6);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderIsSet") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText7;
                if ((elementText7 = xmlStreamReader.getElementText()) != null && elementText7.length() > 0) {
                    this.F = Boolean.parseBoolean(elementText7);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ReminderMinutesBeforeStart") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText8;
                if ((elementText8 = xmlStreamReader.getElementText()) != null && elementText8.length() > 0) {
                    this.G = Integer.parseInt(elementText8);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FileAs") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.am = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FileAsMapping") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText9;
                if ((elementText9 = xmlStreamReader.getElementText()) != null && elementText9.length() > 0) {
                    this.an = com.ews.exchange.a.x(elementText9);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GivenName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ao = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DisplayName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.p = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Initials") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ap = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MiddleName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.aq = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Nickname") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.ar = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CompleteName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.as = new CompleteName(xmlStreamReader);
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CompanyName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.at = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneNumbers") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String attributeValue = xmlStreamReader.getAttributeValue(null, "Key");
                        final String elementText10 = xmlStreamReader.getElementText();
                        if (attributeValue.equals("AssistantPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aM = elementText10;
                        }
                        else if (attributeValue.equals("BusinessFax") && elementText10 != null && elementText10.length() > 0) {
                            this.aN = elementText10;
                        }
                        else if (attributeValue.equals("BusinessPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aO = elementText10;
                        }
                        else if (attributeValue.equals("BusinessPhone2") && elementText10 != null && elementText10.length() > 0) {
                            this.aP = elementText10;
                        }
                        else if (attributeValue.equals("Callback") && elementText10 != null && elementText10.length() > 0) {
                            this.aQ = elementText10;
                        }
                        else if (attributeValue.equals("CarPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aR = elementText10;
                        }
                        else if (attributeValue.equals("CompanyMainPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aS = elementText10;
                        }
                        else if (attributeValue.equals("HomeFax") && elementText10 != null && elementText10.length() > 0) {
                            this.aT = elementText10;
                        }
                        else if (attributeValue.equals("HomePhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aU = elementText10;
                        }
                        else if (attributeValue.equals("HomePhone2") && elementText10 != null && elementText10.length() > 0) {
                            this.aV = elementText10;
                        }
                        else if (attributeValue.equals("Isdn") && elementText10 != null && elementText10.length() > 0) {
                            this.aW = elementText10;
                        }
                        else if (attributeValue.equals("MobilePhone") && elementText10 != null && elementText10.length() > 0) {
                            this.aX = elementText10;
                        }
                        else if (attributeValue.equals("OtherFax") && elementText10 != null && elementText10.length() > 0) {
                            this.aY = elementText10;
                        }
                        else if (attributeValue.equals("OtherTelephone") && elementText10 != null && elementText10.length() > 0) {
                            this.aZ = elementText10;
                        }
                        else if (attributeValue.equals("Pager") && elementText10 != null && elementText10.length() > 0) {
                            this.ba = elementText10;
                        }
                        else if (attributeValue.equals("PrimaryPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.bb = elementText10;
                        }
                        else if (attributeValue.equals("RadioPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.bc = elementText10;
                        }
                        else if (attributeValue.equals("Telex") && elementText10 != null && elementText10.length() > 0) {
                            this.bd = elementText10;
                        }
                        else if (attributeValue.equals("TtyTddPhone") && elementText10 != null && elementText10.length() > 0) {
                            this.be = elementText10;
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneNumbers") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhysicalAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String attributeValue2;
                        if ((attributeValue2 = xmlStreamReader.getAttributeValue(null, "Key")).equals("Home")) {
                            while (xmlStreamReader.hasNext()) {
                                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Street") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.ax = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("City") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.ay = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("State") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.az = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CountryOrRegion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aA = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostalCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aB = xmlStreamReader.getElementText();
                                }
                                if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    break;
                                }
                                xmlStreamReader.next();
                            }
                        }
                        else if (attributeValue2.equals("Business")) {
                            while (xmlStreamReader.hasNext()) {
                                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Street") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aC = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("City") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aD = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("State") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aE = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CountryOrRegion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aF = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostalCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aG = xmlStreamReader.getElementText();
                                }
                                if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    break;
                                }
                                xmlStreamReader.next();
                            }
                        }
                        else if (attributeValue2.equals("Other")) {
                            while (xmlStreamReader.hasNext()) {
                                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Street") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aH = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("City") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aI = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("State") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aJ = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("CountryOrRegion") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aK = xmlStreamReader.getElementText();
                                }
                                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostalCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    this.aL = xmlStreamReader.getElementText();
                                }
                                if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                                    break;
                                }
                                xmlStreamReader.next();
                            }
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhysicalAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("AssistantName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bf = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Birthday") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText11;
                if ((elementText11 = xmlStreamReader.getElementText()) != null && elementText11.length() > 0) {
                    this.bg = com.ews.exchange.d.c(elementText11);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BusinessHomePage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bh = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Children") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bi.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Children") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Companies") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("String") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        this.bj.add(xmlStreamReader.getElementText());
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Companies") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Department") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bk = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Generation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bl = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ImAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                while (xmlStreamReader.hasNext()) {
                    if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        final String attributeValue3 = xmlStreamReader.getAttributeValue(null, "Key");
                        final String elementText12 = xmlStreamReader.getElementText();
                        if (attributeValue3.equals("ImAddress1") && elementText12 != null && elementText12.length() > 0) {
                            this.bm = elementText12;
                        }
                        else if (attributeValue3.equals("ImAddress2") && elementText12 != null && elementText12.length() > 0) {
                            this.bn = elementText12;
                        }
                        else if (attributeValue3.equals("ImAddress3") && elementText12 != null && elementText12.length() > 0) {
                            this.bo = elementText12;
                        }
                    }
                    if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ImAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                        break;
                    }
                    xmlStreamReader.next();
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("JobTitle") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bp = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Manager") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bq = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Mileage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.br = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("OfficeLocation") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bs = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PostalAddressIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bt = com.ews.exchange.a.w(xmlStreamReader.getElementText());
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Profession") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bu = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("SpouseName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bv = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Surname") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bw = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WeddingAnniversary") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText13;
                if ((elementText13 = xmlStreamReader.getElementText()) != null && elementText13.length() > 0) {
                    this.bx = com.ews.exchange.d.c(elementText13);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Alias") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bN = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DirectoryId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.bO = xmlStreamReader.getElementText();
            }
            else if (!xmlStreamReader.isStartElement() || xmlStreamReader.getLocalName() == null || xmlStreamReader.getNamespaceURI() == null || !xmlStreamReader.getLocalName().equals("DirectReports") || !xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ManagerMailbox") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.bP = new Mailbox(xmlStreamReader);
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MSExchangeCertificate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText14;
                    if ((elementText14 = xmlStreamReader.getElementText()) != null && elementText14.length() > 0) {
                        this.bV = com.ews.exchange.d.e(elementText14);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Notes") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.bT = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneticFullName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.bQ = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneticFirstName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.bR = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PhoneticLastName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.bS = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Photo") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText15;
                    if ((elementText15 = xmlStreamReader.getElementText()) != null && elementText15.length() > 0) {
                        this.bU = com.ews.exchange.d.e(elementText15);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UserSMIMECertificate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText16;
                    if ((elementText16 = xmlStreamReader.getElementText()) != null && elementText16.length() > 0) {
                        this.bW = com.ews.exchange.d.e(elementText16);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EmailAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    while (xmlStreamReader.hasNext()) {
                        if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Entry") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                            final String attributeValue4 = xmlStreamReader.getAttributeValue(null, "Key");
                            final String elementText17 = xmlStreamReader.getElementText();
                            if (attributeValue4.equals("EmailAddress1") && elementText17 != null && elementText17.length() > 0) {
                                this.by = elementText17;
                            }
                            else if (attributeValue4.equals("EmailAddress2") && elementText17 != null && elementText17.length() > 0) {
                                this.bz = elementText17;
                            }
                            else if (attributeValue4.equals("EmailAddress3") && elementText17 != null && elementText17.length() > 0) {
                                this.bA = elementText17;
                            }
                        }
                        if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EmailAddresses") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                            break;
                        }
                        xmlStreamReader.next();
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IsAssociated") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText18;
                    if ((elementText18 = xmlStreamReader.getElementText()) != null && elementText18.length() > 0) {
                        this.w = Boolean.parseBoolean(elementText18);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientEditFormQueryString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.y = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("WebClientReadFormQueryString") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.x = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ConversationId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.z = new ItemId(xmlStreamReader, "ConversationId");
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StoreEntryId") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.A = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("UniqueBody") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.B = new Body(xmlStreamReader, "UniqueBody");
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("EffectiveRights") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.o = new EffectiveRights(xmlStreamReader);
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LastModifiedName") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.r = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("LastModifiedTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText19;
                    if ((elementText19 = xmlStreamReader.getElementText()) != null && elementText19.length() > 0) {
                        this.s = com.ews.exchange.d.c(elementText19);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Flag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.H = new Flag(xmlStreamReader);
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("InstanceKey") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.I = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("PolicyTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.J = new RetentionTag(xmlStreamReader);
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ArchiveTag") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.K = new RetentionTag(xmlStreamReader);
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("RetentionDate") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.L = com.ews.exchange.d.c(xmlStreamReader.getElementText());
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Preview") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.M = xmlStreamReader.getElementText();
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("NextPredictedAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText20;
                    if ((elementText20 = xmlStreamReader.getElementText()) != null && elementText20.length() > 0) {
                        this.N = com.ews.exchange.a.C(elementText20);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("GroupingAction") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText21;
                    if ((elementText21 = xmlStreamReader.getElementText()) != null && elementText21.length() > 0) {
                        this.O = com.ews.exchange.a.C(elementText21);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BlockStatus") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText22;
                    if ((elementText22 = xmlStreamReader.getElementText()) != null && elementText22.length() > 0) {
                        this.P = Boolean.parseBoolean(elementText22);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("HasBlockedImages") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText23;
                    if ((elementText23 = xmlStreamReader.getElementText()) != null && elementText23.length() > 0) {
                        this.Q = Boolean.parseBoolean(elementText23);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TextBody") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    this.R = new Body(xmlStreamReader, "TextBody");
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("IconIndex") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final String elementText24;
                    if ((elementText24 = xmlStreamReader.getElementText()) != null && elementText24.length() > 0) {
                        this.S = com.ews.exchange.a.D(elementText24);
                    }
                }
                else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ExtendedProperty") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                    final ExtendedProperty extendedProperty;
                    if ((extendedProperty = new ExtendedProperty(xmlStreamReader)).getPropertyPath() instanceof PropertyTag) {
                        final PropertyTag propertyTag;
                        if ((propertyTag = (PropertyTag)extendedProperty.getPropertyPath()).getTag() == MapiPropertyTag.PR_DISPLAY_NAME.getTag() && propertyTag.getType() == MapiPropertyTag.PR_DISPLAY_NAME.getType()) {
                            this.p = extendedProperty.getValue();
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_ENTRYID.getTag() && propertyTag.getType() == MapiPropertyTag.PR_ENTRYID.getType()) {
                            this.q = extendedProperty.getValue();
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_SEARCH_KEY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_SEARCH_KEY.getType()) {
                            this.t = extendedProperty.getValue();
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_HTML.getTag() && propertyTag.getType() == MapiPropertyTag.PR_HTML.getType()) {
                            if (this.g != null && this.g.getType() == BodyType.HTML) {
                                this.u = this.g.getText();
                            }
                            else {
                                final String value;
                                if ((value = extendedProperty.getValue()) != null && value.length() > 0) {
                                    this.u = Charset.forName("UTF-8").decode(ByteBuffer.wrap(com.ews.exchange.d.e(value))).toString();
                                }
                            }
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_BODY.getTag() && propertyTag.getType() == MapiPropertyTag.PR_BODY.getType()) {
                            this.v = extendedProperty.getValue();
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_COMMENT.getTag() && propertyTag.getType() == MapiPropertyTag.PR_COMMENT.getType()) {
                            this.C = extendedProperty.getValue();
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_GENDER.getTag() && propertyTag.getType() == MapiPropertyTag.PR_GENDER.getType()) {
                            final String value2;
                            if ((value2 = extendedProperty.getValue()) != null && value2.length() > 0) {
                                this.bL = com.ews.exchange.a.y(extendedProperty.getValue());
                            }
                        }
                        else if (propertyTag.getTag() == MapiPropertyTag.PR_DISPLAY_NAME_PREFIX.getTag() && propertyTag.getType() == MapiPropertyTag.PR_DISPLAY_NAME_PREFIX.getType()) {
                            this.bM = extendedProperty.getValue();
                        }
                    }
                    else if (extendedProperty.getPropertyPath() instanceof PropertyId) {
                        final PropertyId propertyId;
                        if ((propertyId = (PropertyId)extendedProperty.getPropertyPath()).getId() == 32794 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.au = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32795 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.av = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32796 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.aw = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32899 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.by = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32915 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bz = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32931 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bA = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32900 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bB = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32916 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bC = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32932 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bD = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32896 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bE = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32912 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bF = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32928 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bG = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32898 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bH = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32914 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bI = extendedProperty.getValue();
                        }
                        else if (propertyId.getId() == 32930 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.STRING) {
                            this.bJ = extendedProperty.getValue();
                        }
                        else {
                            final String value3;
                            if (propertyId.getId() == 32789 && propertyId.getSet() == StandardPropertySet.ADDRESS && propertyId.getType() == MapiPropertyType.BOOLEAN && (value3 = extendedProperty.getValue()) != null && value3.length() > 0) {
                                this.bK = Boolean.parseBoolean(value3);
                            }
                        }
                    }
                    this.al.add(extendedProperty);
                }
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Contact") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    final String a() {
        String s = "<t:Contact>";
        if (this.e != null) {
            s += this.e.a();
        }
        if (this.c != null) {
            s = s + "<t:ItemClass>" + com.ews.exchange.d.a(this.c) + "</t:ItemClass>";
        }
        if (this.d != null) {
            s = s + "<t:Subject>" + com.ews.exchange.d.a(this.d) + "</t:Subject>";
        }
        if (this.f != Sensitivity.NONE) {
            s = s + "<t:Sensitivity>" + com.ews.exchange.a.a(this.f) + "</t:Sensitivity>";
        }
        if (this.g != null) {
            s += this.g.a();
        }
        if (this.j.size() > 0) {
            String s2 = s + "<t:Categories>";
            for (int i = 0; i < this.j.size(); ++i) {
                if (this.j.get(i) != null) {
                    s2 = s2 + "<t:String>" + com.ews.exchange.d.a(this.j.get(i)) + "</t:String>";
                }
            }
            s = s2 + "</t:Categories>";
        }
        if (this.k != Importance.NONE) {
            s = s + "<t:Importance>" + com.ews.exchange.a.a(this.k) + "</t:Importance>";
        }
        if (this.p != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_DISPLAY_NAME, this.p).toString();
        }
        if (this.C != null) {
            s += new ExtendedProperty(MapiPropertyTag.PR_COMMENT, this.C).toString();
        }
        if (this.H != null) {
            s += this.H.a();
        }
        if (this.J != null) {
            s += this.J.a("PolicyTag");
        }
        if (this.K != null) {
            s += this.K.a("ArchiveTag");
        }
        if (this.L != null) {
            s = s + "<t:RetentionDate>" + com.ews.exchange.d.a(this.L) + "</t:RetentionDate>";
        }
        if (this.by != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL1_ADDRESS, this.by).toString();
        }
        if (this.bz != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL2_ADDRESS, this.bz).toString();
        }
        if (this.bA != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL3_ADDRESS, this.bA).toString();
        }
        if (this.bB != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL1_DISPLAY_NAME, this.bB).toString();
        }
        if (this.bC != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL2_DISPLAY_NAME, this.bC).toString();
        }
        if (this.bD != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL3_DISPLAY_NAME, this.bD).toString();
        }
        if (this.bE != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL1_DISPLAY_AS, this.bE).toString();
        }
        if (this.bF != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL2_DISPLAY_AS, this.bF).toString();
        }
        if (this.bG != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL3_DISPLAY_AS, this.bG).toString();
        }
        if (this.bH != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL1_TYPE, this.bH).toString();
        }
        if (this.bI != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL2_TYPE, this.bI).toString();
        }
        if (this.bJ != null) {
            s += new ExtendedProperty(ContactPropertyPath.EMAIL3_TYPE, this.bJ).toString();
        }
        if (this.bK) {
            s += new ExtendedProperty(ContactPropertyPath.HAS_PICTURE, "true").toString();
        }
        if (this.bL != Gender.NONE) {
            s += new ExtendedProperty(ContactPropertyPath.GENDER, com.ews.exchange.a.a(this.bL)).toString();
        }
        if (this.bM != null) {
            s += new ExtendedProperty(ContactPropertyPath.TITLE, this.bM).toString();
        }
        for (int j = 0; j < this.al.size(); ++j) {
            s += this.al.get(j).toString();
        }
        if (this.am != null) {
            s = s + "<t:FileAs>" + com.ews.exchange.d.a(this.am) + "</t:FileAs>";
        }
        if (this.an != FileAsMapping.NONE) {
            s = s + "<t:FileAsMapping>" + com.ews.exchange.a.a(this.an) + "</t:FileAsMapping>";
        }
        if (this.ao != null) {
            s = s + "<t:GivenName>" + com.ews.exchange.d.a(this.ao) + "</t:GivenName>";
        }
        if (this.ap != null) {
            s = s + "<t:Initials>" + com.ews.exchange.d.a(this.ap) + "</t:Initials>";
        }
        if (this.aq != null) {
            s = s + "<t:MiddleName>" + com.ews.exchange.d.a(this.aq) + "</t:MiddleName>";
        }
        if (this.ar != null) {
            s = s + "<t:Nickname>" + com.ews.exchange.d.a(this.ar) + "</t:Nickname>";
        }
        if (this.at != null) {
            s = s + "<t:CompanyName>" + com.ews.exchange.d.a(this.at) + "</t:CompanyName>";
        }
        if (this.ax != null || this.ay != null || this.az != null || this.aA != null || this.aB != null || this.aC != null || this.aD != null || this.aE != null || this.aF != null || this.aG != null || this.aH != null || this.aI != null || this.aJ != null || this.aK != null || this.aL != null) {
            String s3 = s + "<t:PhysicalAddresses>";
            if (this.ax != null || this.ay != null || this.az != null || this.aA != null || this.aB != null) {
                String s4 = s3 + "<t:Entry Key=\"Home\">";
                if (this.ax != null) {
                    s4 = s4 + "<t:Street>" + com.ews.exchange.d.a(this.ax) + "</t:Street>";
                }
                if (this.ay != null) {
                    s4 = s4 + "<t:City>" + com.ews.exchange.d.a(this.ay) + "</t:City>";
                }
                if (this.az != null) {
                    s4 = s4 + "<t:State>" + com.ews.exchange.d.a(this.az) + "</t:State>";
                }
                if (this.aA != null) {
                    s4 = s4 + "<t:CountryOrRegion>" + com.ews.exchange.d.a(this.aA) + "</t:CountryOrRegion>";
                }
                if (this.aB != null) {
                    s4 = s4 + "<t:PostalCode>" + com.ews.exchange.d.a(this.aB) + "</t:PostalCode>";
                }
                s3 = s4 + "</t:Entry>";
            }
            if (this.aC != null || this.aD != null || this.aE != null || this.aF != null || this.aG != null) {
                String s5 = s3 + "<t:Entry Key=\"Business\">";
                if (this.aC != null) {
                    s5 = s5 + "<t:Street>" + com.ews.exchange.d.a(this.aC) + "</t:Street>";
                }
                if (this.aD != null) {
                    s5 = s5 + "<t:City>" + com.ews.exchange.d.a(this.aD) + "</t:City>";
                }
                if (this.aE != null) {
                    s5 = s5 + "<t:State>" + com.ews.exchange.d.a(this.aE) + "</t:State>";
                }
                if (this.aF != null) {
                    s5 = s5 + "<t:CountryOrRegion>" + com.ews.exchange.d.a(this.aF) + "</t:CountryOrRegion>";
                }
                if (this.aG != null) {
                    s5 = s5 + "<t:PostalCode>" + com.ews.exchange.d.a(this.aG) + "</t:PostalCode>";
                }
                s3 = s5 + "</t:Entry>";
            }
            if (this.aH != null || this.aI != null || this.aJ != null || this.aK != null || this.aL != null) {
                String s6 = s3 + "<t:Entry Key=\"Other\">";
                if (this.aH != null) {
                    s6 = s6 + "<t:Street>" + com.ews.exchange.d.a(this.aH) + "</t:Street>";
                }
                if (this.aI != null) {
                    s6 = s6 + "<t:City>" + com.ews.exchange.d.a(this.aI) + "</t:City>";
                }
                if (this.aJ != null) {
                    s6 = s6 + "<t:State>" + com.ews.exchange.d.a(this.aJ) + "</t:State>";
                }
                if (this.aK != null) {
                    s6 = s6 + "<t:CountryOrRegion>" + com.ews.exchange.d.a(this.aK) + "</t:CountryOrRegion>";
                }
                if (this.aL != null) {
                    s6 = s6 + "<t:PostalCode>" + com.ews.exchange.d.a(this.aL) + "</t:PostalCode>";
                }
                s3 = s6 + "</t:Entry>";
            }
            s = s3 + "</t:PhysicalAddresses>";
        }
        if (this.aM != null || this.aN != null || this.aO != null || this.aP != null || this.aQ != null || this.aR != null || this.aS != null || this.aT != null || this.aU != null || this.aV != null || this.aW != null || this.aX != null || this.aY != null || this.aZ != null || this.ba != null || this.bb != null || this.bc != null || this.bd != null || this.be != null) {
            String s7 = s + "<t:PhoneNumbers>";
            if (this.aM != null) {
                s7 = s7 + "<t:Entry Key=\"AssistantPhone\">" + com.ews.exchange.d.a(this.aM) + "</t:Entry>";
            }
            if (this.aN != null) {
                s7 = s7 + "<t:Entry Key=\"BusinessFax\">" + com.ews.exchange.d.a(this.aN) + "</t:Entry>";
            }
            if (this.aO != null) {
                s7 = s7 + "<t:Entry Key=\"BusinessPhone\">" + com.ews.exchange.d.a(this.aO) + "</t:Entry>";
            }
            if (this.aP != null) {
                s7 = s7 + "<t:Entry Key=\"BusinessPhone2\">" + com.ews.exchange.d.a(this.aP) + "</t:Entry>";
            }
            if (this.aQ != null) {
                s7 = s7 + "<t:Entry Key=\"Callback\">" + com.ews.exchange.d.a(this.aQ) + "</t:Entry>";
            }
            if (this.aR != null) {
                s7 = s7 + "<t:Entry Key=\"CarPhone\">" + com.ews.exchange.d.a(this.aR) + "</t:Entry>";
            }
            if (this.aS != null) {
                s7 = s7 + "<t:Entry Key=\"CompanyMainPhone\">" + com.ews.exchange.d.a(this.aS) + "</t:Entry>";
            }
            if (this.aT != null) {
                s7 = s7 + "<t:Entry Key=\"HomeFax\">" + com.ews.exchange.d.a(this.aT) + "</t:Entry>";
            }
            if (this.aU != null) {
                s7 = s7 + "<t:Entry Key=\"HomePhone\">" + com.ews.exchange.d.a(this.aU) + "</t:Entry>";
            }
            if (this.aV != null) {
                s7 = s7 + "<t:Entry Key=\"HomePhone2\">" + com.ews.exchange.d.a(this.aV) + "</t:Entry>";
            }
            if (this.aW != null) {
                s7 = s7 + "<t:Entry Key=\"Isdn\">" + com.ews.exchange.d.a(this.aW) + "</t:Entry>";
            }
            if (this.aX != null) {
                s7 = s7 + "<t:Entry Key=\"MobilePhone\">" + com.ews.exchange.d.a(this.aX) + "</t:Entry>";
            }
            if (this.aY != null) {
                s7 = s7 + "<t:Entry Key=\"OtherFax\">" + com.ews.exchange.d.a(this.aY) + "</t:Entry>";
            }
            if (this.aZ != null) {
                s7 = s7 + "<t:Entry Key=\"OtherTelephone\">" + com.ews.exchange.d.a(this.aZ) + "</t:Entry>";
            }
            if (this.ba != null) {
                s7 = s7 + "<t:Entry Key=\"Pager\">" + com.ews.exchange.d.a(this.ba) + "</t:Entry>";
            }
            if (this.bb != null) {
                s7 = s7 + "<t:Entry Key=\"PrimaryPhone\">" + com.ews.exchange.d.a(this.bb) + "</t:Entry>";
            }
            if (this.bc != null) {
                s7 = s7 + "<t:Entry Key=\"RadioPhone\">" + com.ews.exchange.d.a(this.bc) + "</t:Entry>";
            }
            if (this.bd != null) {
                s7 = s7 + "<t:Entry Key=\"Telex\">" + com.ews.exchange.d.a(this.bd) + "</t:Entry>";
            }
            if (this.be != null) {
                s7 = s7 + "<t:Entry Key=\"TtyTddPhone\">" + com.ews.exchange.d.a(this.be) + "</t:Entry>";
            }
            s = s7 + "</t:PhoneNumbers>";
        }
        if (this.bf != null) {
            s = s + "<t:AssistantName>" + com.ews.exchange.d.a(this.bf) + "</t:AssistantName>";
        }
        if (this.bg != null) {
            s = s + "<t:Birthday>" + com.ews.exchange.d.a(this.bg) + "</t:Birthday>";
        }
        if (this.bh != null) {
            s = s + "<t:BusinessHomePage>" + com.ews.exchange.d.a(this.bh) + "</t:BusinessHomePage>";
        }
        if (this.bi.size() > 0) {
            String s8 = s + "<t:Children>";
            for (int k = 0; k < this.bi.size(); ++k) {
                if (this.bi.get(k) != null) {
                    s8 = s8 + "<t:String>" + com.ews.exchange.d.a(this.bi.get(k)) + "</t:String>";
                }
            }
            s = s8 + "</t:Children>";
        }
        if (this.bj.size() > 0) {
            String s9 = s + "<t:Companies>";
            for (int l = 0; l < this.bj.size(); ++l) {
                if (this.bj.get(l) != null) {
                    s9 = s9 + "<t:String>" + com.ews.exchange.d.a(this.bj.get(l)) + "</t:String>";
                }
            }
            s = s9 + "</t:Companies>";
        }
        if (this.bk != null) {
            s = s + "<t:Department>" + com.ews.exchange.d.a(this.bk) + "</t:Department>";
        }
        if (this.bl != null) {
            s = s + "<t:Generation>" + com.ews.exchange.d.a(this.bl) + "</t:Generation>";
        }
        if (this.bm != null || this.bn != null || this.bo != null) {
            String s10 = s + "<t:ImAddresses>";
            if (this.bm != null) {
                s10 = s10 + "<t:Entry Key=\"ImAddress1\">" + com.ews.exchange.d.a(this.bm) + "</t:Entry>";
            }
            if (this.bn != null) {
                s10 = s10 + "<t:Entry Key=\"ImAddress2\">" + com.ews.exchange.d.a(this.bn) + "</t:Entry>";
            }
            if (this.bo != null) {
                s10 = s10 + "<t:Entry Key=\"ImAddress3\">" + com.ews.exchange.d.a(this.bo) + "</t:Entry>";
            }
            s = s10 + "</t:ImAddresses>";
        }
        if (this.bp != null) {
            s = s + "<t:JobTitle>" + com.ews.exchange.d.a(this.bp) + "</t:JobTitle>";
        }
        if (this.bq != null) {
            s = s + "<t:Manager>" + com.ews.exchange.d.a(this.bq) + "</t:Manager>";
        }
        if (this.br != null) {
            s = s + "<t:Mileage>" + com.ews.exchange.d.a(this.br) + "</t:Mileage>";
        }
        if (this.bs != null) {
            s = s + "<t:OfficeLocation>" + com.ews.exchange.d.a(this.bs) + "</t:OfficeLocation>";
        }
        if (this.bt != SelectedMailingAddress.NONE) {
            final SelectedMailingAddress bt;
            s = s + "<t:PostalAddressIndex>" + (((bt = this.bt) == SelectedMailingAddress.BUSINESS) ? "Business" : ((bt == SelectedMailingAddress.HOME) ? "Home" : ((bt == SelectedMailingAddress.OTHER) ? "Other" : "None"))) + "</t:PostalAddressIndex>";
        }
        if (this.bu != null) {
            s = s + "<t:Profession>" + com.ews.exchange.d.a(this.bu) + "</t:Profession>";
        }
        if (this.bv != null) {
            s = s + "<t:SpouseName>" + com.ews.exchange.d.a(this.bv) + "</t:SpouseName>";
        }
        if (this.bw != null) {
            s = s + "<t:Surname>" + com.ews.exchange.d.a(this.bw) + "</t:Surname>";
        }
        if (this.bx != null) {
            s = s + "<t:WeddingAnniversary>" + com.ews.exchange.d.a(this.bx) + "</t:WeddingAnniversary>";
        }
        return s + "</t:Contact>";
    }
    
    public String toString() {
        if (this.d != null) {
            return this.d;
        }
        return super.toString();
    }
    
    public String getFileAs() {
        return this.am;
    }
    
    public void setFileAs(final String fileAs) {
        this.am = fileAs;
    }
    
    public FileAsMapping getFileAsMapping() {
        return this.an;
    }
    
    public void setFileAsMapping(final FileAsMapping fileAsMapping) {
        this.an = fileAsMapping;
    }
    
    public String getGivenName() {
        return this.ao;
    }
    
    public void setGivenName(final String givenName) {
        this.ao = givenName;
    }
    
    public String getInitials() {
        return this.ap;
    }
    
    public void setInitials(final String initials) {
        this.ap = initials;
    }
    
    public String getMiddleName() {
        return this.aq;
    }
    
    public void setMiddleName(final String middleName) {
        this.aq = middleName;
    }
    
    public String getNickname() {
        return this.ar;
    }
    
    public void setNickname(final String nickname) {
        this.ar = nickname;
    }
    
    public CompleteName getCompleteName() {
        return this.as;
    }
    
    public void setCompleteName(final CompleteName completeName) {
        this.as = completeName;
    }
    
    public String getCompanyName() {
        return this.at;
    }
    
    public void setCompanyName(final String companyName) {
        this.at = companyName;
    }
    
    public String getHomeAddress() {
        return this.au;
    }
    
    public void setHomeAddress(final String homeAddress) {
        this.au = homeAddress;
    }
    
    public String getBusinessAddress() {
        return this.av;
    }
    
    public void setBusinessAddress(final String businessAddress) {
        this.av = businessAddress;
    }
    
    public String getOtherAddress() {
        return this.aw;
    }
    
    public void setOtherAddress(final String otherAddress) {
        this.aw = otherAddress;
    }
    
    public String getHomeAddressStreet() {
        return this.ax;
    }
    
    public void setHomeAddressStreet(final String homeAddressStreet) {
        this.ax = homeAddressStreet;
    }
    
    public String getHomeAddressCity() {
        return this.ay;
    }
    
    public void setHomeAddressCity(final String homeAddressCity) {
        this.ay = homeAddressCity;
    }
    
    public String getHomeAddressState() {
        return this.az;
    }
    
    public void setHomeAddressState(final String homeAddressState) {
        this.az = homeAddressState;
    }
    
    public String getHomeAddressCountry() {
        return this.aA;
    }
    
    public void setHomeAddressCountry(final String homeAddressCountry) {
        this.aA = homeAddressCountry;
    }
    
    public String getHomeAddressPostalCode() {
        return this.aB;
    }
    
    public void setHomeAddressPostalCode(final String homeAddressPostalCode) {
        this.aB = homeAddressPostalCode;
    }
    
    public String getBusinessAddressStreet() {
        return this.aC;
    }
    
    public void setBusinessAddressStreet(final String businessAddressStreet) {
        this.aC = businessAddressStreet;
    }
    
    public String getBusinessAddressCity() {
        return this.aD;
    }
    
    public void setBusinessAddressCity(final String businessAddressCity) {
        this.aD = businessAddressCity;
    }
    
    public String getBusinessAddressState() {
        return this.aE;
    }
    
    public void setBusinessAddressState(final String businessAddressState) {
        this.aE = businessAddressState;
    }
    
    public String getBusinessAddressCountry() {
        return this.aF;
    }
    
    public void setBusinessAddressCountry(final String businessAddressCountry) {
        this.aF = businessAddressCountry;
    }
    
    public String getBusinessAddressPostalCode() {
        return this.aG;
    }
    
    public void setBusinessAddressPostalCode(final String businessAddressPostalCode) {
        this.aG = businessAddressPostalCode;
    }
    
    public String getOtherAddressStreet() {
        return this.aH;
    }
    
    public void setOtherAddressStreet(final String otherAddressStreet) {
        this.aH = otherAddressStreet;
    }
    
    public String getOtherAddressCity() {
        return this.aI;
    }
    
    public void setOtherAddressCity(final String otherAddressCity) {
        this.aI = otherAddressCity;
    }
    
    public String getOtherAddressState() {
        return this.aJ;
    }
    
    public void setOtherAddressState(final String otherAddressState) {
        this.aJ = otherAddressState;
    }
    
    public String getOtherAddressCountry() {
        return this.aK;
    }
    
    public void setOtherAddressCountry(final String otherAddressCountry) {
        this.aK = otherAddressCountry;
    }
    
    public String getOtherAddressPostalCode() {
        return this.aL;
    }
    
    public void setOtherAddressPostalCode(final String otherAddressPostalCode) {
        this.aL = otherAddressPostalCode;
    }
    
    public String getAssistantPhone() {
        return this.aM;
    }
    
    public void setAssistantPhone(final String assistantPhone) {
        this.aM = assistantPhone;
    }
    
    public String getBusinessFax() {
        return this.aN;
    }
    
    public void setBusinessFax(final String businessFax) {
        this.aN = businessFax;
    }
    
    public String getBusinessPhone() {
        return this.aO;
    }
    
    public void setBusinessPhone(final String businessPhone) {
        this.aO = businessPhone;
    }
    
    public String getBusinessPhone2() {
        return this.aP;
    }
    
    public void setBusinessPhone2(final String businessPhone2) {
        this.aP = businessPhone2;
    }
    
    public String getCallbackPhone() {
        return this.aQ;
    }
    
    public void setCallbackPhone(final String callbackPhone) {
        this.aQ = callbackPhone;
    }
    
    public String getCarPhone() {
        return this.aR;
    }
    
    public void setCarPhone(final String carPhone) {
        this.aR = carPhone;
    }
    
    public String getCompanyPhone() {
        return this.aS;
    }
    
    public void setCompanyPhone(final String companyPhone) {
        this.aS = companyPhone;
    }
    
    public String getHomeFax() {
        return this.aT;
    }
    
    public void setHomeFax(final String homeFax) {
        this.aT = homeFax;
    }
    
    public String getHomePhone() {
        return this.aU;
    }
    
    public void setHomePhone(final String homePhone) {
        this.aU = homePhone;
    }
    
    public String getHomePhone2() {
        return this.aV;
    }
    
    public void setHomePhone2(final String homePhone2) {
        this.aV = homePhone2;
    }
    
    public String getIsdn() {
        return this.aW;
    }
    
    public void setIsdn(final String isdn) {
        this.aW = isdn;
    }
    
    public String getMobilePhone() {
        return this.aX;
    }
    
    public void setMobilePhone(final String mobilePhone) {
        this.aX = mobilePhone;
    }
    
    public String getOtherFax() {
        return this.aY;
    }
    
    public void setOtherFax(final String otherFax) {
        this.aY = otherFax;
    }
    
    public String getOtherPhone() {
        return this.aZ;
    }
    
    public void setOtherPhone(final String otherPhone) {
        this.aZ = otherPhone;
    }
    
    public String getPager() {
        return this.ba;
    }
    
    public void setPager(final String pager) {
        this.ba = pager;
    }
    
    public String getPrimaryPhone() {
        return this.bb;
    }
    
    public void setPrimaryPhone(final String primaryPhone) {
        this.bb = primaryPhone;
    }
    
    public String getRadioPhone() {
        return this.bc;
    }
    
    public void setRadioPhone(final String radioPhone) {
        this.bc = radioPhone;
    }
    
    public String getTelex() {
        return this.bd;
    }
    
    public void setTelex(final String telex) {
        this.bd = telex;
    }
    
    public String getTtyTddPhone() {
        return this.be;
    }
    
    public void setTtyTddPhone(final String ttyTddPhone) {
        this.be = ttyTddPhone;
    }
    
    public String getAssistantName() {
        return this.bf;
    }
    
    public void setAssistantName(final String assistantName) {
        this.bf = assistantName;
    }
    
    public Date getBirthday() {
        return this.bg;
    }
    
    public void setBirthday(final Date birthday) {
        this.bg = birthday;
    }
    
    public String getBusinessHomePage() {
        return this.bh;
    }
    
    public void setBusinessHomePage(final String businessHomePage) {
        this.bh = businessHomePage;
    }
    
    public List<String> getChildren() {
        return this.bi;
    }
    
    public List<String> getCompanies() {
        return this.bj;
    }
    
    public String getDepartment() {
        return this.bk;
    }
    
    public void setDepartment(final String department) {
        this.bk = department;
    }
    
    public String getGeneration() {
        return this.bl;
    }
    
    public void setGeneration(final String generation) {
        this.bl = generation;
    }
    
    public String getInstantMessengerAddress1() {
        return this.bm;
    }
    
    public void setInstantMessengerAddress1(final String instantMessengerAddress1) {
        this.bm = instantMessengerAddress1;
    }
    
    public String getInstantMessengerAddress2() {
        return this.bn;
    }
    
    public void setInstantMessengerAddress2(final String instantMessengerAddress2) {
        this.bn = instantMessengerAddress2;
    }
    
    public String getInstantMessengerAddress3() {
        return this.bo;
    }
    
    public void setInstantMessengerAddress3(final String instantMessengerAddress3) {
        this.bo = instantMessengerAddress3;
    }
    
    public String getJobTitle() {
        return this.bp;
    }
    
    public void setJobTitle(final String jobTitle) {
        this.bp = jobTitle;
    }
    
    public String getManager() {
        return this.bq;
    }
    
    public void setManager(final String manager) {
        this.bq = manager;
    }
    
    public String getMileage() {
        return this.br;
    }
    
    public void setMileage(final String mileage) {
        this.br = mileage;
    }
    
    public String getOfficeLocation() {
        return this.bs;
    }
    
    public void setOfficeLocation(final String officeLocation) {
        this.bs = officeLocation;
    }
    
    public SelectedMailingAddress getSelectedMailingAddress() {
        return this.bt;
    }
    
    public void setSelectedMailingAddress(final SelectedMailingAddress selectedMailingAddress) {
        this.bt = selectedMailingAddress;
    }
    
    public String getProfession() {
        return this.bu;
    }
    
    public void setProfession(final String profession) {
        this.bu = profession;
    }
    
    public String getSpouseName() {
        return this.bv;
    }
    
    public void setSpouseName(final String spouseName) {
        this.bv = spouseName;
    }
    
    public String getSurname() {
        return this.bw;
    }
    
    public void setSurname(final String surname) {
        this.bw = surname;
    }
    
    public Date getWeddingAnniversary() {
        return this.bx;
    }
    
    public void setWeddingAnniversary(final Date weddingAnniversary) {
        this.bx = weddingAnniversary;
    }
    
    public String getEmail1Address() {
        return this.by;
    }
    
    public void setEmail1Address(final String email1Address) {
        this.by = email1Address;
    }
    
    public String getEmail2Address() {
        return this.bz;
    }
    
    public void setEmail2Address(final String email2Address) {
        this.bz = email2Address;
    }
    
    public String getEmail3Address() {
        return this.bA;
    }
    
    public void setEmail3Address(final String email3Address) {
        this.bA = email3Address;
    }
    
    public String getEmail1DisplayName() {
        return this.bB;
    }
    
    public void setEmail1DisplayName(final String email1DisplayName) {
        this.bB = email1DisplayName;
    }
    
    public String getEmail2DisplayName() {
        return this.bC;
    }
    
    public void setEmail2DisplayName(final String email2DisplayName) {
        this.bC = email2DisplayName;
    }
    
    public String getEmail3DisplayName() {
        return this.bD;
    }
    
    public void setEmail3DisplayName(final String email3DisplayName) {
        this.bD = email3DisplayName;
    }
    
    public String getEmail1DisplayAs() {
        return this.bE;
    }
    
    public void setEmail1DisplayAs(final String email1DisplayAs) {
        this.bE = email1DisplayAs;
    }
    
    public String getEmail2DisplayAs() {
        return this.bF;
    }
    
    public void setEmail2DisplayAs(final String email2DisplayAs) {
        this.bF = email2DisplayAs;
    }
    
    public String getEmail3DisplayAs() {
        return this.bG;
    }
    
    public void setEmail3DisplayAs(final String email3DisplayAs) {
        this.bG = email3DisplayAs;
    }
    
    public String getEmail1Type() {
        return this.bH;
    }
    
    public void setEmail1Type(final String email1Type) {
        this.bH = email1Type;
    }
    
    public String getEmail2Type() {
        return this.bI;
    }
    
    public void setEmail2Type(final String email2Type) {
        this.bI = email2Type;
    }
    
    public String getEmail3Type() {
        return this.bJ;
    }
    
    public void setEmail3Type(final String email3Type) {
        this.bJ = email3Type;
    }
    
    public boolean hasPicture() {
        return this.bK;
    }
    
    public void setHasPicture(final boolean hasPicture) {
        this.bK = hasPicture;
    }
    
    public Gender getGender() {
        return this.bL;
    }
    
    public void setGender(final Gender gender) {
        this.bL = gender;
    }
    
    public String getTitle() {
        return this.bM;
    }
    
    public void setTitle(final String title) {
        this.bM = title;
    }
    
    public String getAlias() {
        return this.bN;
    }
    
    public String getDirectoryId() {
        return this.bO;
    }
    
    public Mailbox getManagerMailbox() {
        return this.bP;
    }
    
    public List<Mailbox> getDirectReports() {
        return null;
    }
    
    public byte[] getMSExchangeCertificate() {
        return this.bV;
    }
    
    public String getNotes() {
        return this.bT;
    }
    
    public String getPhoneticFullName() {
        return this.bQ;
    }
    
    public String getPhoneticFirstName() {
        return this.bR;
    }
    
    public String getPhoneticLastName() {
        return this.bS;
    }
    
    public byte[] getPhoto() {
        return this.bU;
    }
    
    public byte[] getUserSMIMECertificate() {
        return this.bW;
    }
}

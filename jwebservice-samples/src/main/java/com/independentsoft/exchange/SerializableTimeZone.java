package com.independentsoft.exchange;

import javax.xml.stream.*;

public class SerializableTimeZone
{
    private int a;
    private SerializableTimeZoneTime b;
    private SerializableTimeZoneTime c;
    
    public SerializableTimeZone() {
    }
    
    public SerializableTimeZone(final StandardTimeZone standardTimeZone) {
        this.a(standardTimeZone);
    }
    
    public SerializableTimeZone(final int offset, final SerializableTimeZoneTime standardTime, final SerializableTimeZoneTime daylightTime) {
        this.a = offset;
        this.b = standardTime;
        this.c = daylightTime;
    }
    
    SerializableTimeZone(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Bias") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.a = Integer.parseInt(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("StandardTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.b = new SerializableTimeZoneTime(xmlStreamReader, "StandardTime");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("DaylightTime") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new SerializableTimeZoneTime(xmlStreamReader, "DaylightTime");
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("TimeZone") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    private void a(final StandardTimeZone standardTimeZone) {
        if (standardTimeZone == StandardTimeZone.BERLIN || standardTimeZone == StandardTimeZone.PARIS || standardTimeZone == StandardTimeZone.PRAGUE) {
            this.a = -60;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.WEST_CENTRAL_AFRICA) {
            this.a = -60;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(3));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(4));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EASTERN_EUROPE || standardTimeZone == StandardTimeZone.ATHENS || standardTimeZone == StandardTimeZone.HELSINKI) {
            this.a = -120;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(3));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(4));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ISRAEL) {
            this.a = -120;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.CAIRO) {
            this.a = -120;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.FRIDAY);
            this.c.setMonth(Month.APRIL);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.FRIDAY);
            this.b.setMonth(Month.AUGUST);
            return;
        }
        if (standardTimeZone == StandardTimeZone.HARARE) {
            this.a = -120;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EAST_AFRICA) {
            this.a = -180;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MOSCOW) {
            this.a = -180;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BAGHDAD || standardTimeZone == StandardTimeZone.ARAB) {
            this.a = -180;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TEHRAN) {
            this.a = -210;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.THIRD);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.THIRD);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.SEPTEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.CAUCASUS) {
            this.a = -240;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ABU_DHABI) {
            this.a = -240;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.KABUL) {
            this.a = -270;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EKATERINBURG) {
            this.a = -300;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ISLAMABAD) {
            this.a = -300;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JUNE);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.AUGUST);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BOMBAY || standardTimeZone == StandardTimeZone.SRI_LANKA) {
            this.a = -330;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.NEPAL) {
            this.a = -345;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ALMATY || standardTimeZone == StandardTimeZone.DHAKA) {
            this.a = -360;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.RANGOON) {
            this.a = -390;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BANGKOK) {
            this.a = -420;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.KRASNOYARSK) {
            this.a = -480;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.IRKUTSK || standardTimeZone == StandardTimeZone.PERTH) {
            this.a = -480;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.HONG_KONG || standardTimeZone == StandardTimeZone.BEIJING || standardTimeZone == StandardTimeZone.TAIPEI) {
            this.a = -480;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TOKYO || standardTimeZone == StandardTimeZone.SEOUL) {
            this.a = -540;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.YAKUTSK) {
            this.a = -540;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ADELAIDE) {
            this.a = -570;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(3));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.APRIL);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.DARWIN) {
            this.a = -570;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BRISBANE || standardTimeZone == StandardTimeZone.GUAM) {
            this.a = -600;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.HOBART || standardTimeZone == StandardTimeZone.SYDNEY) {
            this.a = -600;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.OCTOBER);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.APRIL);
            return;
        }
        if (standardTimeZone == StandardTimeZone.VLADIVOSTOK) {
            this.a = -600;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MAGADAN) {
            this.a = -660;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.WELLINGTON) {
            this.a = -720;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.APRIL);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(3));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.SEPTEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.FIJI) {
            this.a = -720;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TONGA) {
            this.a = -780;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.AZORES) {
            this.a = 60;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(1));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MID_ATLANTIC) {
            this.a = 120;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(1));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BUENOS_AIRES) {
            this.a = 120;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.THIRD);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BRASILIA) {
            this.a = 180;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.GREENLAND) {
            this.a = 180;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(22));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SATURDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(23));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SATURDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.NEWFOUNDLAND) {
            this.a = 210;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(0, 1));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0, 1));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.SANTIAGO) {
            this.a = 240;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.LAST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.SECOND);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ATLANTIC_CANADA || standardTimeZone == StandardTimeZone.CAPE_VERDE) {
            this.a = 240;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.CARACAS) {
            this.a = 270;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BOGOTA || standardTimeZone == StandardTimeZone.CENTRAL_AMERICA) {
            this.a = 300;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EASTERN || standardTimeZone == StandardTimeZone.INDIANA) {
            this.a = 300;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MEXICO_CITY) {
            this.a = 360;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.APRIL);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.LAST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.OCTOBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.CENTRAL || standardTimeZone == StandardTimeZone.SASKATCHEWAN) {
            this.a = 360;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ARIZONA) {
            this.a = 420;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MOUNTAIN) {
            this.a = 420;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.PACIFIC) {
            this.a = 480;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ALASKA) {
            this.a = 540;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.HAWAII) {
            this.a = 600;
            (this.c = new SerializableTimeZoneTime()).setOffset(-60);
            this.c.setTime(new Time(2));
            this.c.setDayOrder(DayOrder.SECOND);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.MARCH);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(2));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.NOVEMBER);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ENIWETOK) {
            this.a = 720;
            (this.c = new SerializableTimeZoneTime()).setOffset(0);
            this.c.setTime(new Time(0));
            this.c.setDayOrder(DayOrder.FIRST);
            this.c.setDayOfWeek(DayOfWeek.SUNDAY);
            this.c.setMonth(Month.JANUARY);
            (this.b = new SerializableTimeZoneTime()).setOffset(0);
            this.b.setTime(new Time(0));
            this.b.setDayOrder(DayOrder.FIRST);
            this.b.setDayOfWeek(DayOfWeek.SUNDAY);
            this.b.setMonth(Month.JANUARY);
            return;
        }
        this.a = 0;
        (this.c = new SerializableTimeZoneTime()).setOffset(0);
        this.c.setTime(new Time(0));
        this.c.setDayOrder(DayOrder.FIRST);
        this.c.setDayOfWeek(DayOfWeek.SUNDAY);
        this.c.setMonth(Month.JANUARY);
        (this.b = new SerializableTimeZoneTime()).setOffset(0);
        this.b.setTime(new Time(0));
        this.b.setDayOrder(DayOrder.FIRST);
        this.b.setDayOfWeek(DayOfWeek.SUNDAY);
        this.b.setMonth(Month.JANUARY);
    }
    
    final String a() {
        String s = "<t:TimeZone>" + "<t:Bias>" + this.a + "</t:Bias>";
        if (this.b != null) {
            s += this.b.a("StandardTime");
        }
        if (this.c != null) {
            s += this.c.a("DaylightTime");
        }
        return s + "</t:TimeZone>";
    }
    
    public int getOffset() {
        return this.a;
    }
    
    public void setOffset(final int offset) {
        this.a = offset;
    }
    
    public SerializableTimeZoneTime getStandardTime() {
        return this.b;
    }
    
    public void setStandardTime(final SerializableTimeZoneTime standardTime) {
        this.b = standardTime;
    }
    
    public SerializableTimeZoneTime getDaylightTime() {
        return this.c;
    }
    
    public void setDaylightTime(final SerializableTimeZoneTime daylightTime) {
        this.c = daylightTime;
    }
}

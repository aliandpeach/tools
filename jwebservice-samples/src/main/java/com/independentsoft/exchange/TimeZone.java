package com.independentsoft.exchange;

import java.util.*;
import javax.xml.stream.*;
import java.text.*;

public class TimeZone
{
    private String a;
    private Duration b;
    private TimeChange c;
    private TimeChange d;
    
    public TimeZone() {
    }
    
    public TimeZone(final StandardTimeZone standardTimeZone) {
        final ArrayList<DayOfWeek> days;
        (days = new ArrayList<DayOfWeek>()).add(DayOfWeek.SUNDAY);
        final ArrayList<DayOfWeek> days2;
        (days2 = new ArrayList<DayOfWeek>()).add(DayOfWeek.FRIDAY);
        final ArrayList<DayOfWeek> list;
        (list = new ArrayList<DayOfWeek>()).add(DayOfWeek.SATURDAY);
        if (standardTimeZone == StandardTimeZone.BERLIN || standardTimeZone == StandardTimeZone.PARIS || standardTimeZone == StandardTimeZone.PRAGUE) {
            this.a = "Berlin";
            (this.b = new Duration(0, 0, 0, 1)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.WEST_CENTRAL_AFRICA) {
            this.a = "WestCentralAfrica";
            (this.b = new Duration(0, 0, 0, 1)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EASTERN_EUROPE || standardTimeZone == StandardTimeZone.ATHENS || standardTimeZone == StandardTimeZone.HELSINKI) {
            this.a = "EasternEurope";
            (this.b = new Duration(0, 0, 0, 2)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(3));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(4));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ISRAEL) {
            this.a = "Israel";
            (this.b = new Duration(0, 0, 0, 2)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days2, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.CAIRO) {
            this.a = "Cairo";
            (this.b = new Duration(0, 0, 0, 2)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.APRIL, days2, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.AUGUST, days2, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.HARARE) {
            this.a = "Harare";
            (this.b = new Duration(0, 0, 0, 2)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EAST_AFRICA) {
            this.a = "EastAfrica";
            (this.b = new Duration(0, 0, 0, 3)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MOSCOW) {
            this.a = "Moscow";
            (this.b = new Duration(0, 0, 0, 3)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.BAGHDAD || standardTimeZone == StandardTimeZone.ARAB) {
            this.a = "Baghdad";
            (this.b = new Duration(0, 0, 0, 3)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TEHRAN) {
            this.a = "Tehran";
            (this.b = new Duration(0, 0, 0, 3, 30)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.THIRD));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.SEPTEMBER, days, DayOfWeekIndex.THIRD));
            return;
        }
        if (standardTimeZone == StandardTimeZone.CAUCASUS) {
            this.a = "Caucasus";
            (this.b = new Duration(0, 0, 0, 4)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ABU_DHABI) {
            this.a = "AbuDhabi";
            (this.b = new Duration(0, 0, 0, 4)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.KABUL) {
            this.a = "Kabul";
            (this.b = new Duration(0, 0, 0, 4, 30)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EKATERINBURG) {
            this.a = "Ekaterinburg";
            (this.b = new Duration(0, 0, 0, 5)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ISLAMABAD) {
            this.a = "Islamabad";
            (this.b = new Duration(0, 0, 0, 5)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(0));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.JUNE, days, DayOfWeekIndex.FIRST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.AUGUST, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.BOMBAY || standardTimeZone == StandardTimeZone.SRI_LANKA) {
            this.a = "Bombay";
            (this.b = new Duration(0, 0, 0, 5, 30)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.NEPAL) {
            this.a = "Nepal";
            (this.b = new Duration(0, 0, 0, 5, 45)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.ALMATY || standardTimeZone == StandardTimeZone.DHAKA) {
            this.a = "Almaty";
            (this.b = new Duration(0, 0, 0, 6)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.RANGOON) {
            this.a = "Rangoon";
            (this.b = new Duration(0, 0, 0, 6, 30)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BANGKOK) {
            this.a = "Bangkok";
            (this.b = new Duration(0, 0, 0, 7)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.KRASNOYARSK) {
            this.a = "Krasnoyarsk";
            (this.b = new Duration(0, 0, 0, 8)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.IRKUTSK || standardTimeZone == StandardTimeZone.PERTH) {
            this.a = "Irkutsk";
            (this.b = new Duration(0, 0, 0, 8)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.HONG_KONG || standardTimeZone == StandardTimeZone.BEIJING || standardTimeZone == StandardTimeZone.TAIPEI) {
            this.a = "HongKong";
            (this.b = new Duration(0, 0, 0, 8)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TOKYO || standardTimeZone == StandardTimeZone.SEOUL) {
            this.a = "Tokyo";
            (this.b = new Duration(0, 0, 0, 9)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.YAKUTSK) {
            this.a = "Yakutsk";
            (this.b = new Duration(0, 0, 0, 9)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ADELAIDE) {
            this.a = "Adelaide";
            (this.b = new Duration(0, 0, 0, 9, 30)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.APRIL, days, DayOfWeekIndex.FIRST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.DARWIN) {
            this.a = "Darwin";
            (this.b = new Duration(0, 0, 0, 9, 30)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BRISBANE || standardTimeZone == StandardTimeZone.GUAM) {
            this.a = "Brisbane";
            (this.b = new Duration(0, 0, 0, 10)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.HOBART || standardTimeZone == StandardTimeZone.SYDNEY) {
            this.a = "Sydney";
            (this.b = new Duration(0, 0, 0, 10)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.APRIL, days, DayOfWeekIndex.FIRST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.VLADIVOSTOK) {
            this.a = "Vladivostok";
            (this.b = new Duration(0, 0, 0, 11)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.MAGADAN) {
            this.a = "Magadan";
            (this.b = new Duration(0, 0, 0, 11)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.WELLINGTON) {
            this.a = "Wellington";
            (this.b = new Duration(0, 0, 0, 12)).setNegative(true);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.APRIL, days, DayOfWeekIndex.FIRST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(3));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.SEPTEMBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.FIJI) {
            this.a = "Fiji";
            (this.b = new Duration(0, 0, 0, 12)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.TONGA) {
            this.a = "Tonga";
            (this.b = new Duration(0, 0, 0, 13)).setNegative(true);
            return;
        }
        if (standardTimeZone == StandardTimeZone.AZORES) {
            this.a = "Azores";
            this.b = new Duration(0, 0, 0, 1);
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(1));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.MID_ATLANTIC) {
            this.a = "MidAtlantic";
            this.b = new Duration(0, 0, 0, 2);
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(1));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.BUENOS_AIRES) {
            this.a = "BuenosAires";
            this.b = new Duration(0, 0, 0, 2);
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.THIRD));
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(0));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.BRASILIA) {
            this.a = "Brasilia";
            this.b = new Duration(0, 0, 0, 3);
            return;
        }
        if (standardTimeZone == StandardTimeZone.GREENLAND) {
            this.a = "Greenland";
            this.b = new Duration(0, 0, 0, 3);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(22));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, list, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(23));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, list, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.NEWFOUNDLAND) {
            this.a = "Newfoundland";
            this.b = new Duration(0, 0, 0, 3, 30);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(0, 1));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0, 1));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.SANTIAGO) {
            this.a = "Santiago";
            this.b = new Duration(0, 0, 0, 4);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(0));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.LAST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(0));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.SECOND));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ATLANTIC_CANADA || standardTimeZone == StandardTimeZone.CAPE_VERDE) {
            this.a = "AtlanticCanada";
            this.b = new Duration(0, 0, 0, 4);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.CARACAS) {
            this.a = "Caracas";
            this.b = new Duration(0, 0, 0, 4, 30);
            return;
        }
        if (standardTimeZone == StandardTimeZone.BOGOTA || standardTimeZone == StandardTimeZone.CENTRAL_AMERICA) {
            this.a = "Bogota";
            this.b = new Duration(0, 0, 0, 5);
            return;
        }
        if (standardTimeZone == StandardTimeZone.EASTERN || standardTimeZone == StandardTimeZone.INDIANA) {
            this.a = "Eastern";
            this.b = new Duration(0, 0, 0, 5);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.MEXICO_CITY) {
            this.a = "MexicoCity";
            this.b = new Duration(0, 0, 0, 6);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.APRIL, days, DayOfWeekIndex.FIRST));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.OCTOBER, days, DayOfWeekIndex.LAST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.CENTRAL || standardTimeZone == StandardTimeZone.SASKATCHEWAN) {
            this.a = "Central";
            this.b = new Duration(0, 0, 0, 6);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ARIZONA) {
            this.a = "Arizona";
            this.b = new Duration(0, 0, 0, 7);
            return;
        }
        if (standardTimeZone == StandardTimeZone.MOUNTAIN) {
            this.a = "Mountain";
            this.b = new Duration(0, 0, 0, 7);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.PACIFIC) {
            this.a = "Pacific";
            this.b = new Duration(0, 0, 0, 8);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ALASKA) {
            this.a = "Alaska";
            this.b = new Duration(0, 0, 0, 9);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.HAWAII) {
            this.a = "Hawaii";
            this.b = new Duration(0, 0, 0, 10);
            (this.d = new TimeChange()).setOffset(new Duration(0, 0, 0, 1));
            this.d.getOffset().setNegative(true);
            this.d.setTime(new Time(2));
            this.d.setPattern(new RelativeYearlyRecurrencePattern(Month.MARCH, days, DayOfWeekIndex.SECOND));
            (this.c = new TimeChange()).setOffset(new Duration(0, 0, 0, 0));
            this.c.setTime(new Time(2));
            this.c.setPattern(new RelativeYearlyRecurrencePattern(Month.NOVEMBER, days, DayOfWeekIndex.FIRST));
            return;
        }
        if (standardTimeZone == StandardTimeZone.ENIWETOK) {
            this.a = "Eniwetok";
            this.b = new Duration(0, 0, 0, 12);
            return;
        }
        this.a = "GMT";
        this.b = new Duration(0, 0, 0, 0);
    }
    
    public TimeZone(final int offsetHours) {
        this(offsetHours, 0);
    }
    
    public TimeZone(int offsetHours, int offsetMinutes) {
        this.b = new Duration();
        if (offsetHours < 0) {
            this.b.setNegative(true);
        }
        offsetHours = Math.abs(offsetHours);
        offsetMinutes = Math.abs(offsetMinutes);
        this.b.setHours(offsetHours);
        this.b.setMinutes(offsetMinutes);
    }
    
    public TimeZone(final Duration offset) {
        this.b = offset;
    }
    
    public TimeZone(final Duration offset, final String name) {
        this.b = offset;
        this.a = name;
    }
    
    public TimeZone(final Duration offset, final TimeChange standardTime, final TimeChange daylightTime) {
        this.b = offset;
        this.c = standardTime;
        this.d = daylightTime;
    }
    
    public TimeZone(final Duration offset, final String name, final TimeChange standardTime, final TimeChange daylightTime) {
        this.b = offset;
        this.a = name;
        this.c = standardTime;
        this.d = daylightTime;
    }
    
    TimeZone(final XMLStreamReader reader) throws XMLStreamException, ParseException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException, ParseException {
        this.a = xmlStreamReader.getAttributeValue(null, "TimeZoneName");
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("BaseOffset") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    this.b = Duration.parse(elementText);
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Standard") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = new TimeChange(xmlStreamReader, "Standard");
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Daylight") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = new TimeChange(xmlStreamReader, "Daylight");
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("MeetingTimeZone") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public String toString() {
        String string = "";
        if (this.a != null) {
            string = string + " TimeZoneName=\"" + com.independentsoft.exchange.d.a(this.a) + "\"";
        }
        String s = "<t:MeetingTimeZone" + string + ">";
        if (this.b != null) {
            s = s + "<t:BaseOffset>" + this.b.toString() + "</t:BaseOffset>";
        }
        if (this.c != null) {
            s += this.c.a("Standard");
        }
        if (this.d != null) {
            s += this.d.a("Daylight");
        }
        return s + "</t:MeetingTimeZone>";
    }
    
    public String getName() {
        return this.a;
    }
    
    public void setName(final String name) {
        this.a = name;
    }
    
    public Duration getOffset() {
        return this.b;
    }
    
    public void setOffset(final Duration offset) {
        this.b = offset;
    }
    
    public TimeChange getStandardTime() {
        return this.c;
    }
    
    public void setStandardTime(final TimeChange standardTime) {
        this.c = standardTime;
    }
    
    public TimeChange getDaylightTime() {
        return this.d;
    }
    
    public void setDaylightTime(final TimeChange daylightTime) {
        this.d = daylightTime;
    }
}

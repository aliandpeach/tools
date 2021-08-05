package com.independentsoft.exchange;

import java.util.*;

public class ContactPropertyPath extends ItemPropertyPath
{
    public static final UnindexedPropertyPath FILE_AS;
    public static final UnindexedPropertyPath FILE_AS_MAPPING;
    public static final UnindexedPropertyPath GIVEN_NAME;
    public static final UnindexedPropertyPath INITIALS;
    public static final UnindexedPropertyPath MIDDLE_NAME;
    public static final UnindexedPropertyPath NICKNAME;
    public static final UnindexedPropertyPath COMPLETE_NAME;
    public static final UnindexedPropertyPath COMPANY_NAME;
    public static final PropertyId HOME_ADDRESS;
    public static final PropertyId BUSINESS_ADDRESS;
    public static final PropertyId OTHER_ADDRESS;
    public static final IndexedPropertyPath HOME_ADDRESS_STREET;
    public static final IndexedPropertyPath HOME_ADDRESS_CITY;
    public static final IndexedPropertyPath HOME_ADDRESS_STATE;
    public static final IndexedPropertyPath HOME_ADDRESS_COUNTRY;
    public static final IndexedPropertyPath HOME_ADDRESS_POSTAL_CODE;
    public static final IndexedPropertyPath BUSINESS_ADDRESS_STREET;
    public static final IndexedPropertyPath BUSINESS_ADDRESS_CITY;
    public static final IndexedPropertyPath BUSINESS_ADDRESS_STATE;
    public static final IndexedPropertyPath BUSINESS_ADDRESS_COUNTRY;
    public static final IndexedPropertyPath BUSINESS_ADDRESS_POSTAL_CODE;
    public static final IndexedPropertyPath OTHER_ADDRESS_STREET;
    public static final IndexedPropertyPath OTHER_ADDRESS_CITY;
    public static final IndexedPropertyPath OTHER_ADDRESS_STATE;
    public static final IndexedPropertyPath OTHER_ADDRESS_COUNTRY;
    public static final IndexedPropertyPath OTHER_ADDRESS_POSTAL_CODE;
    public static final IndexedPropertyPath ASSISTANT_PHONE;
    public static final IndexedPropertyPath BUSINESS_FAX;
    public static final IndexedPropertyPath BUSINESS_PHONE;
    public static final IndexedPropertyPath BUSINESS_PHONE2;
    public static final IndexedPropertyPath CALLBACK_PHONE;
    public static final IndexedPropertyPath CAR_PHONE;
    public static final IndexedPropertyPath COMPANY_PHONE;
    public static final IndexedPropertyPath HOME_FAX;
    public static final IndexedPropertyPath HOME_PHONE;
    public static final IndexedPropertyPath HOME_PHONE2;
    public static final IndexedPropertyPath ISDN;
    public static final IndexedPropertyPath MOBILE_PHONE;
    public static final IndexedPropertyPath OTHER_FAX;
    public static final IndexedPropertyPath OTHER_PHONE;
    public static final IndexedPropertyPath PAGER;
    public static final IndexedPropertyPath PRIMARY_PHONE;
    public static final IndexedPropertyPath RADIO_PHONE;
    public static final IndexedPropertyPath TELEX;
    public static final IndexedPropertyPath TTY_TDD_PHONE;
    public static final UnindexedPropertyPath ASSISTANT_NAME;
    public static final UnindexedPropertyPath BIRTHDAY;
    public static final UnindexedPropertyPath BUSINESS_HOME_PAGE;
    public static final UnindexedPropertyPath CHILDREN;
    public static final UnindexedPropertyPath COMPANIES;
    public static final UnindexedPropertyPath DEPARTMENT;
    public static final UnindexedPropertyPath GENERATION;
    public static final IndexedPropertyPath INSTANT_MESSENGER_ADDRESS1;
    public static final IndexedPropertyPath INSTANT_MESSENGER_ADDRESS2;
    public static final IndexedPropertyPath INSTANT_MESSENGER_ADDRESS3;
    public static final UnindexedPropertyPath JOB_TITLE;
    public static final UnindexedPropertyPath MANAGER;
    public static final UnindexedPropertyPath MILEAGE;
    public static final UnindexedPropertyPath OFFICE_LOCATION;
    public static final UnindexedPropertyPath SELECTED_MAILING_ADDRESS;
    public static final UnindexedPropertyPath PROFESSION;
    public static final UnindexedPropertyPath SPOUSE_NAME;
    public static final UnindexedPropertyPath SURNAME;
    public static final UnindexedPropertyPath WEDDING_ANNIVERSARY;
    public static final UnindexedPropertyPath ALIAS;
    public static final UnindexedPropertyPath DIRECTORY_ID;
    public static final UnindexedPropertyPath DIRECT_REPORTS;
    public static final UnindexedPropertyPath MANAGER_MAILBOX;
    public static final UnindexedPropertyPath MS_EXCHANGE_CERTIFICATE;
    public static final UnindexedPropertyPath NOTES;
    public static final UnindexedPropertyPath PHONETIC_FULL_NAME;
    public static final UnindexedPropertyPath PHONETIC_FIRST_NAME;
    public static final UnindexedPropertyPath PHONETIC_LAST_NAME;
    public static final UnindexedPropertyPath PHOTO;
    public static final UnindexedPropertyPath USER_SMIME_CERTIFICATE;
    public static final PropertyId EMAIL1_ADDRESS;
    public static final PropertyId EMAIL2_ADDRESS;
    public static final PropertyId EMAIL3_ADDRESS;
    public static final PropertyId EMAIL1_DISPLAY_NAME;
    public static final PropertyId EMAIL2_DISPLAY_NAME;
    public static final PropertyId EMAIL3_DISPLAY_NAME;
    public static final PropertyId EMAIL1_DISPLAY_AS;
    public static final PropertyId EMAIL2_DISPLAY_AS;
    public static final PropertyId EMAIL3_DISPLAY_AS;
    public static final PropertyId EMAIL1_TYPE;
    public static final PropertyId EMAIL2_TYPE;
    public static final PropertyId EMAIL3_TYPE;
    public static final PropertyId HAS_PICTURE;
    public static final PropertyTag GENDER;
    public static final PropertyTag TITLE;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(ContactPropertyPath.FILE_AS);
        list.add(ContactPropertyPath.FILE_AS_MAPPING);
        list.add(ContactPropertyPath.GIVEN_NAME);
        list.add(ContactPropertyPath.INITIALS);
        list.add(ContactPropertyPath.MIDDLE_NAME);
        list.add(ContactPropertyPath.NICKNAME);
        list.add(ContactPropertyPath.COMPLETE_NAME);
        list.add(ContactPropertyPath.COMPANY_NAME);
        list.add(ContactPropertyPath.HOME_ADDRESS);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS);
        list.add(ContactPropertyPath.OTHER_ADDRESS);
        list.add(ContactPropertyPath.HOME_ADDRESS_STREET);
        list.add(ContactPropertyPath.HOME_ADDRESS_CITY);
        list.add(ContactPropertyPath.HOME_ADDRESS_STATE);
        list.add(ContactPropertyPath.HOME_ADDRESS_COUNTRY);
        list.add(ContactPropertyPath.HOME_ADDRESS_POSTAL_CODE);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS_STREET);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS_CITY);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS_STATE);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS_COUNTRY);
        list.add(ContactPropertyPath.BUSINESS_ADDRESS_POSTAL_CODE);
        list.add(ContactPropertyPath.OTHER_ADDRESS_STREET);
        list.add(ContactPropertyPath.OTHER_ADDRESS_CITY);
        list.add(ContactPropertyPath.OTHER_ADDRESS_STATE);
        list.add(ContactPropertyPath.OTHER_ADDRESS_COUNTRY);
        list.add(ContactPropertyPath.OTHER_ADDRESS_POSTAL_CODE);
        list.add(ContactPropertyPath.ASSISTANT_PHONE);
        list.add(ContactPropertyPath.BUSINESS_FAX);
        list.add(ContactPropertyPath.BUSINESS_PHONE);
        list.add(ContactPropertyPath.BUSINESS_PHONE2);
        list.add(ContactPropertyPath.CALLBACK_PHONE);
        list.add(ContactPropertyPath.CAR_PHONE);
        list.add(ContactPropertyPath.COMPANY_PHONE);
        list.add(ContactPropertyPath.HOME_FAX);
        list.add(ContactPropertyPath.HOME_PHONE);
        list.add(ContactPropertyPath.HOME_PHONE2);
        list.add(ContactPropertyPath.ISDN);
        list.add(ContactPropertyPath.MOBILE_PHONE);
        list.add(ContactPropertyPath.OTHER_FAX);
        list.add(ContactPropertyPath.OTHER_PHONE);
        list.add(ContactPropertyPath.PAGER);
        list.add(ContactPropertyPath.PRIMARY_PHONE);
        list.add(ContactPropertyPath.RADIO_PHONE);
        list.add(ContactPropertyPath.TELEX);
        list.add(ContactPropertyPath.TTY_TDD_PHONE);
        list.add(ContactPropertyPath.ASSISTANT_NAME);
        list.add(ContactPropertyPath.BIRTHDAY);
        list.add(ContactPropertyPath.BUSINESS_HOME_PAGE);
        list.add(ContactPropertyPath.CHILDREN);
        list.add(ContactPropertyPath.COMPANIES);
        list.add(ContactPropertyPath.DEPARTMENT);
        list.add(ContactPropertyPath.GENERATION);
        list.add(ContactPropertyPath.INSTANT_MESSENGER_ADDRESS1);
        list.add(ContactPropertyPath.INSTANT_MESSENGER_ADDRESS2);
        list.add(ContactPropertyPath.INSTANT_MESSENGER_ADDRESS3);
        list.add(ContactPropertyPath.JOB_TITLE);
        list.add(ContactPropertyPath.MANAGER);
        list.add(ContactPropertyPath.MILEAGE);
        list.add(ContactPropertyPath.OFFICE_LOCATION);
        list.add(ContactPropertyPath.SELECTED_MAILING_ADDRESS);
        list.add(ContactPropertyPath.PROFESSION);
        list.add(ContactPropertyPath.SPOUSE_NAME);
        list.add(ContactPropertyPath.SURNAME);
        list.add(ContactPropertyPath.WEDDING_ANNIVERSARY);
        list.add(ContactPropertyPath.ALIAS);
        list.add(ContactPropertyPath.DIRECTORY_ID);
        list.add(ContactPropertyPath.DIRECT_REPORTS);
        list.add(ContactPropertyPath.MANAGER_MAILBOX);
        list.add(ContactPropertyPath.MS_EXCHANGE_CERTIFICATE);
        list.add(ContactPropertyPath.NOTES);
        list.add(ContactPropertyPath.PHONETIC_FULL_NAME);
        list.add(ContactPropertyPath.PHONETIC_FIRST_NAME);
        list.add(ContactPropertyPath.PHONETIC_LAST_NAME);
        list.add(ContactPropertyPath.PHOTO);
        list.add(ContactPropertyPath.USER_SMIME_CERTIFICATE);
        list.add(ContactPropertyPath.EMAIL1_ADDRESS);
        list.add(ContactPropertyPath.EMAIL2_ADDRESS);
        list.add(ContactPropertyPath.EMAIL3_ADDRESS);
        list.add(ContactPropertyPath.EMAIL1_DISPLAY_NAME);
        list.add(ContactPropertyPath.EMAIL2_DISPLAY_NAME);
        list.add(ContactPropertyPath.EMAIL3_DISPLAY_NAME);
        list.add(ContactPropertyPath.EMAIL1_DISPLAY_AS);
        list.add(ContactPropertyPath.EMAIL2_DISPLAY_AS);
        list.add(ContactPropertyPath.EMAIL3_DISPLAY_AS);
        list.add(ContactPropertyPath.EMAIL1_TYPE);
        list.add(ContactPropertyPath.EMAIL2_TYPE);
        list.add(ContactPropertyPath.EMAIL3_TYPE);
        list.add(ContactPropertyPath.HAS_PICTURE);
        list.add(ContactPropertyPath.GENDER);
        list.add(ContactPropertyPath.TITLE);
        return (List<PropertyPath>)list;
    }
    
    static {
        FILE_AS = new UnindexedPropertyPath("contacts:FileAs");
        FILE_AS_MAPPING = new UnindexedPropertyPath("contacts:FileAsMapping");
        GIVEN_NAME = new UnindexedPropertyPath("contacts:GivenName");
        INITIALS = new UnindexedPropertyPath("contacts:Initials");
        MIDDLE_NAME = new UnindexedPropertyPath("contacts:MiddleName");
        NICKNAME = new UnindexedPropertyPath("contacts:Nickname");
        COMPLETE_NAME = new UnindexedPropertyPath("contacts:CompleteName");
        COMPANY_NAME = new UnindexedPropertyPath("contacts:CompanyName");
        HOME_ADDRESS = new PropertyId(32794, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        BUSINESS_ADDRESS = new PropertyId(32795, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        OTHER_ADDRESS = new PropertyId(32796, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        HOME_ADDRESS_STREET = new IndexedPropertyPath(IndexedPropertyPathUri.STREET, "Home");
        HOME_ADDRESS_CITY = new IndexedPropertyPath(IndexedPropertyPathUri.CITY, "Home");
        HOME_ADDRESS_STATE = new IndexedPropertyPath(IndexedPropertyPathUri.STATE, "Home");
        HOME_ADDRESS_COUNTRY = new IndexedPropertyPath(IndexedPropertyPathUri.COUNTRY, "Home");
        HOME_ADDRESS_POSTAL_CODE = new IndexedPropertyPath(IndexedPropertyPathUri.POSTAL_CODE, "Home");
        BUSINESS_ADDRESS_STREET = new IndexedPropertyPath(IndexedPropertyPathUri.STREET, "Business");
        BUSINESS_ADDRESS_CITY = new IndexedPropertyPath(IndexedPropertyPathUri.CITY, "Business");
        BUSINESS_ADDRESS_STATE = new IndexedPropertyPath(IndexedPropertyPathUri.STATE, "Business");
        BUSINESS_ADDRESS_COUNTRY = new IndexedPropertyPath(IndexedPropertyPathUri.COUNTRY, "Business");
        BUSINESS_ADDRESS_POSTAL_CODE = new IndexedPropertyPath(IndexedPropertyPathUri.POSTAL_CODE, "Business");
        OTHER_ADDRESS_STREET = new IndexedPropertyPath(IndexedPropertyPathUri.STREET, "Other");
        OTHER_ADDRESS_CITY = new IndexedPropertyPath(IndexedPropertyPathUri.CITY, "Other");
        OTHER_ADDRESS_STATE = new IndexedPropertyPath(IndexedPropertyPathUri.STATE, "Other");
        OTHER_ADDRESS_COUNTRY = new IndexedPropertyPath(IndexedPropertyPathUri.COUNTRY, "Other");
        OTHER_ADDRESS_POSTAL_CODE = new IndexedPropertyPath(IndexedPropertyPathUri.POSTAL_CODE, "Other");
        ASSISTANT_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "AssistantPhone");
        BUSINESS_FAX = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "BusinessFax");
        BUSINESS_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "BusinessPhone");
        BUSINESS_PHONE2 = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "BusinessPhone2");
        CALLBACK_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "Callback");
        CAR_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "CarPhone");
        COMPANY_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "CompanyMainPhone");
        HOME_FAX = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "HomeFax");
        HOME_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "HomePhone");
        HOME_PHONE2 = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "HomePhone2");
        ISDN = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "Isdn");
        MOBILE_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "MobilePhone");
        OTHER_FAX = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "OtherFax");
        OTHER_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "OtherTelephone");
        PAGER = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "Pager");
        PRIMARY_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "PrimaryPhone");
        RADIO_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "RadioPhone");
        TELEX = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "Telex");
        TTY_TDD_PHONE = new IndexedPropertyPath(IndexedPropertyPathUri.PHONE_NUMBER, "TtyTddPhone");
        ASSISTANT_NAME = new UnindexedPropertyPath("contacts:AssistantName");
        BIRTHDAY = new UnindexedPropertyPath("contacts:Birthday");
        BUSINESS_HOME_PAGE = new UnindexedPropertyPath("contacts:BusinessHomePage");
        CHILDREN = new UnindexedPropertyPath("contacts:Children");
        COMPANIES = new UnindexedPropertyPath("contacts:Companies");
        DEPARTMENT = new UnindexedPropertyPath("contacts:Department");
        GENERATION = new UnindexedPropertyPath("contacts:Generation");
        INSTANT_MESSENGER_ADDRESS1 = new IndexedPropertyPath(IndexedPropertyPathUri.INSTANT_MESSENGER_ADDRESS, "ImAddress1");
        INSTANT_MESSENGER_ADDRESS2 = new IndexedPropertyPath(IndexedPropertyPathUri.INSTANT_MESSENGER_ADDRESS, "ImAddress2");
        INSTANT_MESSENGER_ADDRESS3 = new IndexedPropertyPath(IndexedPropertyPathUri.INSTANT_MESSENGER_ADDRESS, "ImAddress3");
        JOB_TITLE = new UnindexedPropertyPath("contacts:JobTitle");
        MANAGER = new UnindexedPropertyPath("contacts:Manager");
        MILEAGE = new UnindexedPropertyPath("contacts:Mileage");
        OFFICE_LOCATION = new UnindexedPropertyPath("contacts:OfficeLocation");
        SELECTED_MAILING_ADDRESS = new UnindexedPropertyPath("contacts:PostalAddressIndex");
        PROFESSION = new UnindexedPropertyPath("contacts:Profession");
        SPOUSE_NAME = new UnindexedPropertyPath("contacts:SpouseName");
        SURNAME = new UnindexedPropertyPath("contacts:Surname");
        WEDDING_ANNIVERSARY = new UnindexedPropertyPath("contacts:WeddingAnniversary");
        ALIAS = new UnindexedPropertyPath("contacts:Alias");
        DIRECTORY_ID = new UnindexedPropertyPath("contacts:DirectoryId");
        DIRECT_REPORTS = new UnindexedPropertyPath("contacts:DirectReports");
        MANAGER_MAILBOX = new UnindexedPropertyPath("contacts:ManagerMailbox");
        MS_EXCHANGE_CERTIFICATE = new UnindexedPropertyPath("contacts:MSExchangeCertificate");
        NOTES = new UnindexedPropertyPath("contacts:Notes");
        PHONETIC_FULL_NAME = new UnindexedPropertyPath("contacts:PhoneticFullName");
        PHONETIC_FIRST_NAME = new UnindexedPropertyPath("contacts:PhoneticFirstName");
        PHONETIC_LAST_NAME = new UnindexedPropertyPath("contacts:PhoneticLastName");
        PHOTO = new UnindexedPropertyPath("contacts:Photo");
        USER_SMIME_CERTIFICATE = new UnindexedPropertyPath("contacts:UserSMIMECertificate");
        EMAIL1_ADDRESS = new PropertyId(32899, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL2_ADDRESS = new PropertyId(32915, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL3_ADDRESS = new PropertyId(32931, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL1_DISPLAY_NAME = new PropertyId(32900, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL2_DISPLAY_NAME = new PropertyId(32916, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL3_DISPLAY_NAME = new PropertyId(32932, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL1_DISPLAY_AS = new PropertyId(32896, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL2_DISPLAY_AS = new PropertyId(32912, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL3_DISPLAY_AS = new PropertyId(32928, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL1_TYPE = new PropertyId(32898, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL2_TYPE = new PropertyId(32914, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        EMAIL3_TYPE = new PropertyId(32930, StandardPropertySet.ADDRESS, MapiPropertyType.STRING);
        HAS_PICTURE = new PropertyId(32789, StandardPropertySet.ADDRESS, MapiPropertyType.BOOLEAN);
        GENDER = MapiPropertyTag.PR_GENDER;
        TITLE = MapiPropertyTag.PR_DISPLAY_NAME_PREFIX;
    }
}

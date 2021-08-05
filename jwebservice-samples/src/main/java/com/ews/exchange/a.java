package com.ews.exchange;

import java.util.*;

class a
{
    private long a;
    private long[] b;
    
    a() {
        this.b = new long[] { 0L, 1996959894L, -301047508L, -1727442502L, 124634137L, 1886057615L, -379345611L, -1637575261L, 249268274L, 2044508324L, -522852066L, -1747789432L, 162941995L, 2125561021L, -407360249L, -1866523247L, 498536548L, 1789927666L, -205950648L, -2067906082L, 450548861L, 1843258603L, -187386543L, -2083289657L, 325883990L, 1684777152L, -43845254L, -1973040660L, 335633487L, 1661365465L, -99664541L, -1928851979L, 997073096L, 1281953886L, -715111964L, -1570279054L, 1006888145L, 1258607687L, -770865667L, -1526024853L, 901097722L, 1119000684L, -608450090L, -1396901568L, 853044451L, 1172266101L, -589951537L, -1412350631L, 651767980L, 1373503546L, -925412992L, -1076862698L, 565507253L, 1454621731L, -809855591L, -1195530993L, 671266974L, 1594198024L, -972236366L, -1324619484L, 795835527L, 1483230225L, -1050600021L, -1234817731L, 1994146192L, 31158534L, -1731059524L, -271249366L, 1907459465L, 112637215L, -1614814043L, -390540237L, 2013776290L, 251722036L, -1777751922L, -519137256L, 2137656763L, 141376813L, -1855689577L, -429695999L, 1802195444L, 476864866L, -2056965928L, -228458418L, 1812370925L, 453092731L, -2113342271L, -183516073L, 1706088902L, 314042704L, -1950435094L, -54949764L, 1658658271L, 366619977L, -1932296973L, -69972891L, 1303535960L, 984961486L, -1547960204L, -725929758L, 1256170817L, 1037604311L, -1529756563L, -740887301L, 1131014506L, 879679996L, -1385723834L, -631195440L, 1141124467L, 855842277L, -1442165665L, -586318647L, 1342533948L, 654459306L, -1106571248L, -921952122L, 1466479909L, 544179635L, -1184443383L, -832445281L, 1591671054L, 702138776L, -1328506846L, -942167884L, 1504918807L, 783551873L, -1212326853L, -1061524307L, -306674912L, -1698712650L, 62317068L, 1957810842L, -355121351L, -1647151185L, 81470997L, 1943803523L, -480048366L, -1805370492L, 225274430L, 2053790376L, -468791541L, -1828061283L, 167816743L, 2097651377L, -267414716L, -2029476910L, 503444072L, 1762050814L, -144550051L, -2140837941L, 426522225L, 1852507879L, -19653770L, -1982649376L, 282753626L, 1742555852L, -105259153L, -1900089351L, 397917763L, 1622183637L, -690576408L, -1580100738L, 953729732L, 1340076626L, -776247311L, -1497606297L, 1068828381L, 1219638859L, -670225446L, -1358292148L, 906185462L, 1090812512L, -547295293L, -1469587627L, 829329135L, 1181335161L, -882789492L, -1134132454L, 628085408L, 1382605366L, -871598187L, -1156888829L, 570562233L, 1426400815L, -977650754L, -1296233688L, 733239954L, 1555261956L, -1026031705L, -1244606671L, 752459403L, 1541320221L, -1687895376L, -328994266L, 1969922972L, 40735498L, -1677130071L, -351390145L, 1913087877L, 83908371L, -1782625662L, -491226604L, 2075208622L, 213261112L, -1831694693L, -438977011L, 2094854071L, 198958881L, -2032938284L, -237706686L, 1759359992L, 534414190L, -2118248755L, -155638181L, 1873836001L, 414664567L, -2012718362L, -15766928L, 1711684554L, 285281116L, -1889165569L, -127750551L, 1634467795L, 376229701L, -1609899400L, -686959890L, 1308918612L, 956543938L, -1486412191L, -799009033L, 1231636301L, 1047427035L, -1362007478L, -640263460L, 1088359270L, 936918000L, -1447252397L, -558129467L, 1202900863L, 817233897L, -1111625188L, -893730166L, 1404277552L, 615818150L, -1160759803L, -841546093L, 1423857449L, 601450431L, -1285129682L, -1000256840L, 1567103746L, 711928724L, -1274298825L, -1022587231L, 1510334235L, 755167117L };
    }
    
    final long a() {
        return this.a;
    }
    
    final void a(final byte[] array, int n, int n2) {
        this.a ^= 0xFFFFFFFFL;
        while (--n2 >= 0) {
            this.a = (this.b[(int)((this.a ^ array[n++]) & 0xFFL)] ^ this.a >> 8);
        }
        this.a ^= 0xFFFFFFFFL;
    }
    
    static String a(final UserSettingName userSettingName) {
        if (userSettingName == UserSettingName.ACTIVE_DIRECTORY_SERVER) {
            return "ActiveDirectoryServer";
        }
        if (userSettingName == UserSettingName.ALTERNATE_MAILBOXES) {
            return "AlternateMailboxes";
        }
        if (userSettingName == UserSettingName.CAS_VERSION) {
            return "CasVersion";
        }
        if (userSettingName == UserSettingName.CROSS_ORGANIZATION_SHARING_ENABLED) {
            return "CrossOrganizationSharingEnabled";
        }
        if (userSettingName == UserSettingName.ECP_DELIVERY_REPORT_URL_FRAGMENT) {
            return "EcpDeliveryReportUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_EMAIL_SUBSCRIPTIONS_URL_FRAGMENT) {
            return "EcpEmailSubscriptionsUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_TEXT_MESSAGING_URL_FRAGMENT) {
            return "EcpTextMessagingUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_VOICEMAIL_URL_FRAGMENT) {
            return "EcpVoicemailUrlFragment";
        }
        if (userSettingName == UserSettingName.EWS_SUPPORTED_SCHEMAS) {
            return "EwsSupportedSchemas";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_DELIVERY_REPORT_URL) {
            return "ExternalEcpDeliveryReportUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_EMAIL_SUBSCRIPTIONS_URL) {
            return "ExternalEcpEmailSubscriptionsUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_TEXT_MESSAGING_URL) {
            return "ExternalEcpTextMessagingUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_URL) {
            return "ExternalEcpUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_VOICEMAIL_URL) {
            return "ExternalEcpVoicemailUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_EWS_URL) {
            return "ExternalEwsUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_IMAP4_CONNECTIONS) {
            return "ExternalImap4Connections";
        }
        if (userSettingName == UserSettingName.EXTERNAL_MAILBOX_SERVER) {
            return "ExternalMailboxServer";
        }
        if (userSettingName == UserSettingName.EXTERNAL_MAILBOX_SERVER_AUTHENTICATION_METHODS) {
            return "ExternalMailboxServerAuthenticationMethods";
        }
        if (userSettingName == UserSettingName.EXTERNAL_MAILBOX_SERVER_REQUIRES_SSL) {
            return "ExternalMailboxServerRequiresSSL";
        }
        if (userSettingName == UserSettingName.EXTERNAL_OABURL) {
            return "ExternalOABUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_POP3_CONNECTIONS) {
            return "ExternalPop3Connections";
        }
        if (userSettingName == UserSettingName.EXTERNAL_SMTP_CONNECTIONS) {
            return "ExternalSmtpConnections";
        }
        if (userSettingName == UserSettingName.EXTERNAL_UMURL) {
            return "ExternalUMUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_WEB_CLIENT_URLS) {
            return "ExternalWebClientUrls";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_DELIVERY_REPORT_URL) {
            return "InternalEcpDeliveryReportUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_EMAIL_SUBSCRIPTIONS_URL) {
            return "InternalEcpEmailSubscriptionsUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_TEXT_MESSAGING_URL) {
            return "InternalEcpTextMessagingUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_URL) {
            return "InternalEcpUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_VOICEMAIL_URL) {
            return "InternalEcpVoicemailUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_EWS_URL) {
            return "InternalEwsUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_IMAP4_CONNECTIONS) {
            return "InternalImap4Connections";
        }
        if (userSettingName == UserSettingName.INTERNAL_MAILBOX_SERVER) {
            return "InternalMailboxServer";
        }
        if (userSettingName == UserSettingName.INTERNAL_MAILBOX_SERVER_DN) {
            return "InternalMailboxServerDN";
        }
        if (userSettingName == UserSettingName.INTERNAL_OAB_URL) {
            return "InternalOABUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_POP3_CONNECTIONS) {
            return "InternalPop3Connections";
        }
        if (userSettingName == UserSettingName.INTERNAL_RPC_CLIENT_SERVER) {
            return "InternalRpcClientServer";
        }
        if (userSettingName == UserSettingName.INTERNAL_SMTP_CONNECTIONS) {
            return "InternalSmtpConnections";
        }
        if (userSettingName == UserSettingName.INTERNAL_UM_URL) {
            return "InternalUMUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_WEB_CLIENT_URLS) {
            return "InternalWebClientUrls";
        }
        if (userSettingName == UserSettingName.MAILBOX_DN) {
            return "MailboxDN";
        }
        if (userSettingName == UserSettingName.PUBLIC_FOLDER_SERVER) {
            return "PublicFolderServer";
        }
        if (userSettingName == UserSettingName.USER_DEPLOYMENT_ID) {
            return "UserDeploymentId";
        }
        if (userSettingName == UserSettingName.USER_DISPLAY_NAME) {
            return "UserDisplayName";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_RETENTION_POLICY_TAGS_URL) {
            return "InternalEcpRetentionPolicyTagsUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_PUBLISHING_URL) {
            return "InternalEcpPublishingUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_PHOTO_URL) {
            return "InternalEcpPhotoUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_CONNECT_URL) {
            return "InternalEcpConnectUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_TEAM_MAILBOX_URL) {
            return "InternalEcpTeamMailboxUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_TEAM_MAILBOX_CREATING_URL) {
            return "InternalEcpTeamMailboxCreatingUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_TEAM_MAILBOX_EDITING_URL) {
            return "InternalEcpTeamMailboxEditingUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_TEAM_MAILBOX_HIDING_URL) {
            return "InternalEcpTeamMailboxHidingUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_ECP_EXTENSION_INSTALLATION_URL) {
            return "InternalEcpExtensionInstallationUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_EMWS_URL) {
            return "InternalEmwsUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_PHOTOS_URL) {
            return "InternalPhotosUrl";
        }
        if (userSettingName == UserSettingName.ECP_RETENTION_POLICY_TAGS_URL_FRAGMENT) {
            return "EcpRetentionPolicyTagsUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_PUBLISHING_URL_FRAGMENT) {
            return "EcpPublishingUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_PHOTO_URL_FRAGMENT) {
            return "EcpPhotoUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_CONNECT_URL_FRAGMENT) {
            return "EcpConnectUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_TEAM_MAILBOX_URL_FRAGMENT) {
            return "EcpTeamMailboxUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_TEAM_MAILBOX_CREATING_URL_FRAGMENT) {
            return "EcpTeamMailboxCreatingUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_TEAM_MAILBOX_EDITING_URL_FRAGMENT) {
            return "EcpTeamMailboxEditingUrlFragment";
        }
        if (userSettingName == UserSettingName.ECP_EXTENSION_INSTALLATION_URL_FRAGMENT) {
            return "EcpExtensionInstallationUrlFragment";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_RETENTION_POLICY_TAGS_URL) {
            return "ExternalEcpRetentionPolicyTagsUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_PUBLISHING_URL) {
            return "ExternalEcpPublishingUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_PHOTO_URL) {
            return "ExternalEcpPhotoUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_CONNECT_URL) {
            return "ExternalEcpConnectUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_TEAM_MAILBOX_URL) {
            return "ExternalEcpTeamMailboxUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_TEAM_MAILBOX_CREATING_URL) {
            return "ExternalEcpTeamMailboxCreatingUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_TEAM_MAILBOX_EDITING_URL) {
            return "ExternalEcpTeamMailboxEditingUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_TEAM_MAILBOX_HIDING_URL) {
            return "ExternalEcpTeamMailboxHidingUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_ECP_EXTENSION_INSTALLATION_URL) {
            return "ExternalEcpExtensionInstallationUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_EMWS_URL) {
            return "ExternalEmwsUrl";
        }
        if (userSettingName == UserSettingName.EXTERNAL_PHOTOS_URL) {
            return "ExternalPhotosUrl";
        }
        if (userSettingName == UserSettingName.INTERNAL_SERVER_EXCLUSIVE_CONNECT) {
            return "InternalServerExclusiveConnect";
        }
        if (userSettingName == UserSettingName.EXTERNAL_EWS_VERSION) {
            return "ExternalEwsVersion";
        }
        if (userSettingName == UserSettingName.MOBILE_MAILBOX_POLICY) {
            return "MobileMailboxPolicy";
        }
        if (userSettingName == UserSettingName.DOCUMENT_SHARING_LOCATIONS) {
            return "DocumentSharingLocations";
        }
        if (userSettingName == UserSettingName.USER_MS_ONLINE) {
            return "UserMSOnline";
        }
        if (userSettingName == UserSettingName.INTERNAL_MAILBOX_SERVER_AUTHENTICATION_METHODS) {
            return "InternalMailboxServerAuthenticationMethods";
        }
        if (userSettingName == UserSettingName.MAILBOX_VERSION) {
            return "MailboxVersion";
        }
        if (userSettingName == UserSettingName.SP_MY_SITE_HOST_URL) {
            return "SPMySiteHostURL";
        }
        if (userSettingName == UserSettingName.SITE_MAILBOX_CREATION_URL) {
            return "SiteMailboxCreationURL";
        }
        if (userSettingName == UserSettingName.INTERNAL_RPC_HTTP_SERVER) {
            return "InternalRpcHttpServer";
        }
        if (userSettingName == UserSettingName.INTERNAL_RPC_HTTP_CONNECTIVITY_REQQUIRES_SSL) {
            return "InternalRpcHttpConnectivityRequiresSsl";
        }
        if (userSettingName == UserSettingName.INTERNAL_RPC_HTTP_AUTHENTICATION_METHOD) {
            return "InternalRpcHttpAuthenticationMethod";
        }
        if (userSettingName == UserSettingName.EXTERNAL_SERVER_EXCLUSIVE_CONNECT) {
            return "ExternalServerExclusiveConnect";
        }
        if (userSettingName == UserSettingName.EXCHANGE_RPC_URL) {
            return "ExchangeRpcUrl";
        }
        if (userSettingName == UserSettingName.SHOW_GAL_AS_DEFAULT_VIEW) {
            return "ShowGalAsDefaultView";
        }
        if (userSettingName == UserSettingName.AUTO_DISCOVER_SMTP_ADDRESS) {
            return "AutoDiscoverSMTPAddress";
        }
        if (userSettingName == UserSettingName.INTEROP_EXTERNAL_EWS_URL) {
            return "InteropExternalEwsUrl";
        }
        if (userSettingName == UserSettingName.INTEROP_EXTERNAL_EWS_VERSION) {
            return "InteropExternalEwsVersion";
        }
        if (userSettingName == UserSettingName.PUBLIC_FOLDER_INFORMATION) {
            return "PublicFolderInformation";
        }
        if (userSettingName == UserSettingName.REDIRECT_URL) {
            return "RedirectUrl";
        }
        if (userSettingName == UserSettingName.EWS_PARTNER_URL) {
            return "EwsPartnerUrl";
        }
        if (userSettingName == UserSettingName.CERT_PRINCIPAL_NAME) {
            return "CertPrincipalName";
        }
        if (userSettingName == UserSettingName.GROUPING_INFORMATION) {
            return "GroupingInformation";
        }
        if (userSettingName == UserSettingName.MAPI_HTTP_ENABLED) {
            return "MapiHttpEnabled";
        }
        return "UserDN";
    }
    
    static ErrorCode a(final String s) {
        if (s.equals("NoError")) {
            return ErrorCode.NO_ERROR;
        }
        if (s.equals("RedirectAddress")) {
            return ErrorCode.REDIRECT_ADDRESS;
        }
        if (s.equals("RedirectUrl")) {
            return ErrorCode.REDIRECT_URL;
        }
        if (s.equals("InvalidUser")) {
            return ErrorCode.INVALID_USER;
        }
        if (s.equals("InvalidRequest")) {
            return ErrorCode.INVALID_REQUEST;
        }
        if (s.equals("InvalidSetting")) {
            return ErrorCode.INVALID_SETTING;
        }
        if (s.equals("SettingIsNotAvailable")) {
            return ErrorCode.SETTING_IS_NOT_AVAILABLE;
        }
        if (s.equals("ServerBusy")) {
            return ErrorCode.SERVER_BUSY;
        }
        if (s.equals("InvalidDomain")) {
            return ErrorCode.INVALID_DOMAIN;
        }
        if (s.equals("NotFederated")) {
            return ErrorCode.NOT_FEDERATED;
        }
        if (s.equals("InternalServerError")) {
            return ErrorCode.INTERNAL_SERVER_ERROR;
        }
        return ErrorCode.NO_ERROR;
    }
    
    static ProtocolType b(final String s) {
        if (s.equals("EXCH")) {
            return ProtocolType.EXCHANGE;
        }
        if (s.equals("EXPR")) {
            return ProtocolType.EXCHANGE_PROXY;
        }
        return ProtocolType.WEB;
    }
    
    static AuthenticationPackage c(final String s) {
        if (s.equals("basic")) {
            return AuthenticationPackage.BASIC;
        }
        if (s.equals("kerb")) {
            return AuthenticationPackage.KERBEROS;
        }
        if (s.equals("kerbntlm")) {
            return AuthenticationPackage.KERBEROS_NTLM;
        }
        if (s.equals("ntlm")) {
            return AuthenticationPackage.NTLM;
        }
        if (s.equals("certificate")) {
            return AuthenticationPackage.CERTIFICATE;
        }
        return AuthenticationPackage.NONE;
    }
    
    static String a(final MessageTrackingScope messageTrackingScope) {
        if (messageTrackingScope == MessageTrackingScope.ORGANIZATION) {
            return "Organization";
        }
        if (messageTrackingScope == MessageTrackingScope.FOREST) {
            return "Forest";
        }
        return "Site";
    }
    
    static UserConfigurationDictionaryObjectType d(final String s) {
        if (s.equals("DateTime")) {
            return UserConfigurationDictionaryObjectType.DATE_TIME;
        }
        if (s.equals("Boolean")) {
            return UserConfigurationDictionaryObjectType.BOOLEAN;
        }
        if (s.equals("Byte")) {
            return UserConfigurationDictionaryObjectType.BYTE;
        }
        if (s.equals("String")) {
            return UserConfigurationDictionaryObjectType.STRING;
        }
        if (s.equals("Integer32")) {
            return UserConfigurationDictionaryObjectType.INTEGER32;
        }
        if (s.equals("UnsignedInteger32")) {
            return UserConfigurationDictionaryObjectType.UNSIGNED_INTEGER32;
        }
        if (s.equals("Integer64")) {
            return UserConfigurationDictionaryObjectType.INTEGER64;
        }
        if (s.equals("UnsignedInteger64")) {
            return UserConfigurationDictionaryObjectType.UNSIGNED_INTEGER64;
        }
        if (s.equals("StringArray")) {
            return UserConfigurationDictionaryObjectType.STRING_ARRAY;
        }
        return UserConfigurationDictionaryObjectType.BYTE_ARRAY;
    }
    
    static String a(final UserConfigurationDictionaryObjectType userConfigurationDictionaryObjectType) {
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.DATE_TIME) {
            return "DateTime";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.BOOLEAN) {
            return "Boolean";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.BYTE) {
            return "Byte";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.STRING) {
            return "String";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.INTEGER32) {
            return "Integer32";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.UNSIGNED_INTEGER32) {
            return "UnsignedInteger32";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.INTEGER64) {
            return "Integer64";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.UNSIGNED_INTEGER64) {
            return "UnsignedInteger64";
        }
        if (userConfigurationDictionaryObjectType == UserConfigurationDictionaryObjectType.STRING_ARRAY) {
            return "StringArray";
        }
        return "ByteArray";
    }
    
    static String a(final IdFormat idFormat) {
        if (idFormat == IdFormat.ENTRY_ID) {
            return "EntryId";
        }
        if (idFormat == IdFormat.EWS_ID) {
            return "EwsId";
        }
        if (idFormat == IdFormat.EWS_LEGACY_ID) {
            return "EwsLegacyId";
        }
        if (idFormat == IdFormat.HEX_ENTRY_ID) {
            return "HexEntryId";
        }
        if (idFormat == IdFormat.OWA_ID) {
            return "OwaId";
        }
        return "StoreId";
    }
    
    static SuggestionQuality e(final String s) {
        if (s.equals("Excellent")) {
            return SuggestionQuality.EXCELLENT;
        }
        if (s.equals("Fair")) {
            return SuggestionQuality.FAIR;
        }
        if (s.equals("Good")) {
            return SuggestionQuality.GOOD;
        }
        if (s.equals("Poor")) {
            return SuggestionQuality.POOR;
        }
        return SuggestionQuality.NONE;
    }
    
    static TransitionTarget f(final String s) {
        if (s.equals("Period")) {
            return TransitionTarget.PERIOD;
        }
        return TransitionTarget.GROUP;
    }
    
    static String a(final TransitionTarget transitionTarget) {
        if (transitionTarget == TransitionTarget.PERIOD) {
            return "Period";
        }
        return "Group";
    }
    
    static FlaggedForAction g(final String s) {
        if (s.equals("Any")) {
            return FlaggedForAction.ANY;
        }
        if (s.equals("Call")) {
            return FlaggedForAction.CALL;
        }
        if (s.equals("DoNotForward")) {
            return FlaggedForAction.DO_NOT_FORWARD;
        }
        if (s.equals("FollowUp")) {
            return FlaggedForAction.FOLLOW_UP;
        }
        if (s.equals("FYI")) {
            return FlaggedForAction.FYI;
        }
        if (s.equals("Forward")) {
            return FlaggedForAction.FORWARD;
        }
        if (s.equals("NoResponseNecessary")) {
            return FlaggedForAction.NO_RESPONSE_NECESSARY;
        }
        if (s.equals("Read")) {
            return FlaggedForAction.READ;
        }
        if (s.equals("Reply")) {
            return FlaggedForAction.REPLY;
        }
        if (s.equals("ReplyToAll")) {
            return FlaggedForAction.REPLY_TO_ALL;
        }
        if (s.equals("Review")) {
            return FlaggedForAction.REVIEW;
        }
        return FlaggedForAction.NONE;
    }
    
    static String a(final FlaggedForAction flaggedForAction) {
        if (flaggedForAction == FlaggedForAction.ANY) {
            return "Any";
        }
        if (flaggedForAction == FlaggedForAction.CALL) {
            return "Call";
        }
        if (flaggedForAction == FlaggedForAction.DO_NOT_FORWARD) {
            return "DoNotForward";
        }
        if (flaggedForAction == FlaggedForAction.FOLLOW_UP) {
            return "FollowUp";
        }
        if (flaggedForAction == FlaggedForAction.FYI) {
            return "FYI";
        }
        if (flaggedForAction == FlaggedForAction.FORWARD) {
            return "Forward";
        }
        if (flaggedForAction == FlaggedForAction.NO_RESPONSE_NECESSARY) {
            return "NoResponseNecessary";
        }
        if (flaggedForAction == FlaggedForAction.READ) {
            return "Read";
        }
        if (flaggedForAction == FlaggedForAction.REPLY) {
            return "Reply";
        }
        if (flaggedForAction == FlaggedForAction.REPLY_TO_ALL) {
            return "ReplyToAll";
        }
        if (flaggedForAction == FlaggedForAction.REVIEW) {
            return "Review";
        }
        return "None";
    }
    
    static Presenters h(final String s) {
        if (s.equals("Disabled")) {
            return Presenters.DISABLED;
        }
        if (s.equals("Internal")) {
            return Presenters.INTERNAL;
        }
        if (s.equals("Everyone")) {
            return Presenters.EVERYONE;
        }
        return Presenters.NONE;
    }
    
    static OnlineMeetingAccessLevel i(final String s) {
        if (s.equals("Everyone")) {
            return OnlineMeetingAccessLevel.EVERYONE;
        }
        if (s.equals("Internal")) {
            return OnlineMeetingAccessLevel.INTERNAL;
        }
        if (s.equals("Invited")) {
            return OnlineMeetingAccessLevel.INVITED;
        }
        if (s.equals("Locked")) {
            return OnlineMeetingAccessLevel.LOCKED;
        }
        return OnlineMeetingAccessLevel.NONE;
    }
    
    static LobbyBypass j(final String s) {
        if (s.equals("Disabled")) {
            return LobbyBypass.DISABLED;
        }
        if (s.equals("EnabledForGatewayParticipants")) {
            return LobbyBypass.ENABLED_FOR_GATEWAY_PARTICIPANTS;
        }
        return LobbyBypass.NONE;
    }
    
    static String a(final SearchPageDirection searchPageDirection) {
        if (searchPageDirection == SearchPageDirection.NEXT) {
            return "Next";
        }
        if (searchPageDirection == SearchPageDirection.PREVIOUS) {
            return "Previous";
        }
        return "None";
    }
    
    static Month k(final String s) {
        if (s.equals("1")) {
            return Month.JANUARY;
        }
        if (s.equals("2")) {
            return Month.FEBRUARY;
        }
        if (s.equals("3")) {
            return Month.MARCH;
        }
        if (s.equals("4")) {
            return Month.APRIL;
        }
        if (s.equals("5")) {
            return Month.MAY;
        }
        if (s.equals("6")) {
            return Month.JUNE;
        }
        if (s.equals("7")) {
            return Month.JULY;
        }
        if (s.equals("8")) {
            return Month.AUGUST;
        }
        if (s.equals("9")) {
            return Month.SEPTEMBER;
        }
        if (s.equals("10")) {
            return Month.OCTOBER;
        }
        if (s.equals("11")) {
            return Month.NOVEMBER;
        }
        if (s.equals("12")) {
            return Month.DECEMBER;
        }
        return Month.NONE;
    }
    
    static String a(final Month month) {
        if (month == Month.JANUARY) {
            return "1";
        }
        if (month == Month.FEBRUARY) {
            return "2";
        }
        if (month == Month.MARCH) {
            return "3";
        }
        if (month == Month.APRIL) {
            return "4";
        }
        if (month == Month.MAY) {
            return "5";
        }
        if (month == Month.JUNE) {
            return "6";
        }
        if (month == Month.JULY) {
            return "7";
        }
        if (month == Month.AUGUST) {
            return "8";
        }
        if (month == Month.SEPTEMBER) {
            return "9";
        }
        if (month == Month.OCTOBER) {
            return "10";
        }
        if (month == Month.NOVEMBER) {
            return "11";
        }
        if (month == Month.DECEMBER) {
            return "12";
        }
        return "0";
    }
    
    static String a(final EventType eventType) {
        if (eventType == EventType.COPIED) {
            return "CopiedEvent";
        }
        if (eventType == EventType.CREATED) {
            return "CreatedEvent";
        }
        if (eventType == EventType.DELETED) {
            return "DeletedEvent";
        }
        if (eventType == EventType.MODIFIED) {
            return "ModifiedEvent";
        }
        if (eventType == EventType.MOVED) {
            return "MovedEvent";
        }
        if (eventType == EventType.NEW_MAIL) {
            return "NewMailEvent";
        }
        return "FreeBusyChangedEvent";
    }
    
    static String a(final DeliverMeetingRequests deliverMeetingRequests) {
        if (deliverMeetingRequests == DeliverMeetingRequests.DELEGATES_AND_ME) {
            return "DelegatesAndMe";
        }
        if (deliverMeetingRequests == DeliverMeetingRequests.DELEGATES_AND_SEND_INFORMATION_TO_ME) {
            return "DelegatesAndSendInformationToMe";
        }
        if (deliverMeetingRequests == DeliverMeetingRequests.DELEGATES_ONLY) {
            return "DelegatesOnly";
        }
        return "None";
    }
    
    static ExternalAudience l(final String s) {
        if (s.equals("All")) {
            return ExternalAudience.ALL;
        }
        if (s.equals("Known")) {
            return ExternalAudience.KNOWN;
        }
        return ExternalAudience.NONE;
    }
    
    static String a(final SortDirection sortDirection) {
        if (sortDirection == SortDirection.ASCENDING) {
            return "Ascending";
        }
        return "Descending";
    }
    
    static String a(final IndexBasePoint indexBasePoint) {
        if (indexBasePoint == IndexBasePoint.BEGINNING) {
            return "Beginning";
        }
        return "End";
    }
    
    static String a(final DeleteType deleteType) {
        if (deleteType == DeleteType.SOFT_DELETE) {
            return "SoftDelete";
        }
        if (deleteType == DeleteType.MOVE_TO_DELETED_ITEMS) {
            return "MoveToDeletedItems";
        }
        if (deleteType == DeleteType.HARD_DELETE) {
            return "HardDelete";
        }
        return "None";
    }
    
    static RetentionAction m(final String s) {
        if (s.equals("MoveToDeletedItems")) {
            return RetentionAction.MOVE_TO_DELETED_ITEMS;
        }
        if (s.equals("MoveToFolder")) {
            return RetentionAction.MOVE_TO_FOLDER;
        }
        if (s.equals("DeleteAndAllowRecovery")) {
            return RetentionAction.DELETE_AND_ALLOW_RECOVERY;
        }
        if (s.equals("PermanentlyDelete")) {
            return RetentionAction.PERMANENTLY_DELETE;
        }
        if (s.equals("MarkAsPastRetentionLimit")) {
            return RetentionAction.MARK_AS_PAST_RETENTION_LIMIT;
        }
        if (s.equals("MoveToArchive")) {
            return RetentionAction.MOVE_TO_ARCHIVE;
        }
        return RetentionAction.NONE;
    }
    
    static ElcFolderType n(final String s) {
        if (s.equals("Calendar")) {
            return ElcFolderType.CALENDAR;
        }
        if (s.equals("Contacts")) {
            return ElcFolderType.CONTACTS;
        }
        if (s.equals("ConversationHistory")) {
            return ElcFolderType.CONVERSATION_HISTORY;
        }
        if (s.equals("DeletedItems")) {
            return ElcFolderType.DELETED_ITEMS;
        }
        if (s.equals("Drafts")) {
            return ElcFolderType.DRAFTS;
        }
        if (s.equals("Inbox")) {
            return ElcFolderType.INBOX;
        }
        if (s.equals("Journal")) {
            return ElcFolderType.JOURNAL;
        }
        if (s.equals("JunkEmail")) {
            return ElcFolderType.JUNK_EMAIL;
        }
        if (s.equals("ManagedCustomFolder")) {
            return ElcFolderType.MANAGED_CUSTOM_FOLDER;
        }
        if (s.equals("NonIpmRoot")) {
            return ElcFolderType.NON_IPM_ROOT;
        }
        if (s.equals("Notes")) {
            return ElcFolderType.NOTES;
        }
        if (s.equals("Outbox")) {
            return ElcFolderType.OUTBOX;
        }
        if (s.equals("Personal")) {
            return ElcFolderType.PERSONAL;
        }
        if (s.equals("RecoverableItems")) {
            return ElcFolderType.RECOVERABLE_ITEMS;
        }
        if (s.equals("RssSubscriptions")) {
            return ElcFolderType.RSS_SUBSCRIPTIONS;
        }
        if (s.equals("SentItems")) {
            return ElcFolderType.SENT_ITEMS;
        }
        if (s.equals("SyncIssues")) {
            return ElcFolderType.SYNC_ISSUES;
        }
        if (s.equals("Tasks")) {
            return ElcFolderType.TASKS;
        }
        return ElcFolderType.ALL;
    }
    
    static PermissionAction o(final String s) {
        if (s.equals("All")) {
            return PermissionAction.ALL;
        }
        if (s.equals("Owned")) {
            return PermissionAction.OWNED;
        }
        return PermissionAction.NONE;
    }
    
    static String a(final PermissionAction permissionAction) {
        if (permissionAction == PermissionAction.ALL) {
            return "All";
        }
        if (permissionAction == PermissionAction.OWNED) {
            return "Owned";
        }
        return "None";
    }
    
    static DelegateFolderPermissionLevel p(final String s) {
        if (s.equals("Author")) {
            return DelegateFolderPermissionLevel.AUTHOR;
        }
        if (s.equals("Custom")) {
            return DelegateFolderPermissionLevel.CUSTOM;
        }
        if (s.equals("Editor")) {
            return DelegateFolderPermissionLevel.EDITOR;
        }
        if (s.equals("Reviewer")) {
            return DelegateFolderPermissionLevel.REVIEWER;
        }
        if (s.equals("None")) {
            return DelegateFolderPermissionLevel.NONE;
        }
        return DelegateFolderPermissionLevel.NOT_DEFINED;
    }
    
    static String a(final DelegateFolderPermissionLevel delegateFolderPermissionLevel) {
        if (delegateFolderPermissionLevel == DelegateFolderPermissionLevel.AUTHOR) {
            return "Author";
        }
        if (delegateFolderPermissionLevel == DelegateFolderPermissionLevel.CUSTOM) {
            return "Custom";
        }
        if (delegateFolderPermissionLevel == DelegateFolderPermissionLevel.EDITOR) {
            return "Editor";
        }
        if (delegateFolderPermissionLevel == DelegateFolderPermissionLevel.REVIEWER) {
            return "Reviewer";
        }
        if (delegateFolderPermissionLevel == DelegateFolderPermissionLevel.NONE) {
            return "None";
        }
        return "NotDefined";
    }
    
    static DayOfWeek q(final String s) {
        if (s.equals("Monday")) {
            return DayOfWeek.MONDAY;
        }
        if (s.equals("Tuesday")) {
            return DayOfWeek.TUESDAY;
        }
        if (s.equals("Wednesday")) {
            return DayOfWeek.WEDNESDAY;
        }
        if (s.equals("Thursday")) {
            return DayOfWeek.THURSDAY;
        }
        if (s.equals("Friday")) {
            return DayOfWeek.FRIDAY;
        }
        if (s.equals("Saturday")) {
            return DayOfWeek.SATURDAY;
        }
        if (s.equals("Sunday")) {
            return DayOfWeek.SUNDAY;
        }
        if (s.equals("Day")) {
            return DayOfWeek.DAY;
        }
        if (s.equals("Weekday")) {
            return DayOfWeek.WEEKDAY;
        }
        if (s.equals("WeekendDay")) {
            return DayOfWeek.WEEKEND_DAY;
        }
        return DayOfWeek.NONE;
    }
    
    static String a(final DayOfWeek dayOfWeek) {
        if (dayOfWeek == DayOfWeek.MONDAY) {
            return "Monday";
        }
        if (dayOfWeek == DayOfWeek.TUESDAY) {
            return "Tuesday";
        }
        if (dayOfWeek == DayOfWeek.WEDNESDAY) {
            return "Wednesday";
        }
        if (dayOfWeek == DayOfWeek.THURSDAY) {
            return "Thursday";
        }
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            return "Friday";
        }
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return "Saturday";
        }
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return "Sunday";
        }
        if (dayOfWeek == DayOfWeek.DAY) {
            return "Day";
        }
        if (dayOfWeek == DayOfWeek.WEEKDAY) {
            return "Weekday";
        }
        if (dayOfWeek == DayOfWeek.WEEKEND_DAY) {
            return "WeekendDay";
        }
        return "None";
    }
    
    static DayOfWeekIndex r(final String s) {
        if (s.equals("First")) {
            return DayOfWeekIndex.FIRST;
        }
        if (s.equals("Second")) {
            return DayOfWeekIndex.SECOND;
        }
        if (s.equals("Third")) {
            return DayOfWeekIndex.THIRD;
        }
        if (s.equals("Fourth")) {
            return DayOfWeekIndex.FOURTH;
        }
        if (s.equals("Last")) {
            return DayOfWeekIndex.LAST;
        }
        return DayOfWeekIndex.NONE;
    }
    
    static String a(final DayOfWeekIndex dayOfWeekIndex) {
        if (dayOfWeekIndex == DayOfWeekIndex.FIRST) {
            return "First";
        }
        if (dayOfWeekIndex == DayOfWeekIndex.SECOND) {
            return "Second";
        }
        if (dayOfWeekIndex == DayOfWeekIndex.THIRD) {
            return "Third";
        }
        if (dayOfWeekIndex == DayOfWeekIndex.FOURTH) {
            return "Fourth";
        }
        if (dayOfWeekIndex == DayOfWeekIndex.LAST) {
            return "Last";
        }
        return "None";
    }
    
    static Month s(final String s) {
        if (s.equals("January")) {
            return Month.JANUARY;
        }
        if (s.equals("February")) {
            return Month.FEBRUARY;
        }
        if (s.equals("March")) {
            return Month.MARCH;
        }
        if (s.equals("April")) {
            return Month.APRIL;
        }
        if (s.equals("May")) {
            return Month.MAY;
        }
        if (s.equals("June")) {
            return Month.JUNE;
        }
        if (s.equals("July")) {
            return Month.JULY;
        }
        if (s.equals("August")) {
            return Month.AUGUST;
        }
        if (s.equals("September")) {
            return Month.SEPTEMBER;
        }
        if (s.equals("October")) {
            return Month.OCTOBER;
        }
        if (s.equals("November")) {
            return Month.NOVEMBER;
        }
        if (s.equals("December")) {
            return Month.DECEMBER;
        }
        return Month.NONE;
    }
    
    static String b(final Month month) {
        if (month == Month.JANUARY) {
            return "January";
        }
        if (month == Month.FEBRUARY) {
            return "February";
        }
        if (month == Month.MARCH) {
            return "March";
        }
        if (month == Month.APRIL) {
            return "April";
        }
        if (month == Month.MAY) {
            return "May";
        }
        if (month == Month.JUNE) {
            return "June";
        }
        if (month == Month.JULY) {
            return "July";
        }
        if (month == Month.AUGUST) {
            return "August";
        }
        if (month == Month.SEPTEMBER) {
            return "September";
        }
        if (month == Month.OCTOBER) {
            return "October";
        }
        if (month == Month.NOVEMBER) {
            return "November";
        }
        if (month == Month.DECEMBER) {
            return "December";
        }
        return "None";
    }
    
    static MeetingRequestType t(final String s) {
        if (s.equals("FullUpdate")) {
            return MeetingRequestType.FULL_UPDATE;
        }
        if (s.equals("InformationalUpdate")) {
            return MeetingRequestType.INFORMATIONAL_UPDATE;
        }
        if (s.equals("NewMeetingRequest")) {
            return MeetingRequestType.NEW_MEETING_REQUEST;
        }
        if (s.equals("Outdated")) {
            return MeetingRequestType.OUTDATED;
        }
        if (s.equals("PrincipalWantsCopy")) {
            return MeetingRequestType.PRINCIPAL_WANTS_COPY;
        }
        if (s.equals("SilentUpdate")) {
            return MeetingRequestType.SILENT_UPDATE;
        }
        return MeetingRequestType.NONE;
    }
    
    static LastVerbExecuted u(final String s) {
        if (s.equals("102")) {
            return LastVerbExecuted.REPLY_TO_SENDER;
        }
        if (s.equals("103")) {
            return LastVerbExecuted.REPLY_TO_ALL;
        }
        if (s.equals("104")) {
            return LastVerbExecuted.FORWARD;
        }
        return LastVerbExecuted.NONE;
    }
    
    static List<MessageFlag> a(final int n) {
        final ArrayList<MessageFlag> list = new ArrayList<MessageFlag>();
        if ((n & 0x40) == 0x40) {
            list.add(MessageFlag.ASSOCIATED);
        }
        if ((n & 0x20) == 0x20) {
            list.add(MessageFlag.FROM_ME);
        }
        if ((n & 0x10) == 0x10) {
            list.add(MessageFlag.HAS_ATTACHMENT);
        }
        if ((n & 0x200) == 0x200) {
            list.add(MessageFlag.NON_READ_REPORT_PENDING);
        }
        if ((n & 0x2000) == 0x2000) {
            list.add(MessageFlag.ORIGIN_INTERNET);
        }
        if ((n & 0x8000) == 0x8000) {
            list.add(MessageFlag.ORIGIN_MISC_EXTERNAL);
        }
        if ((n & 0x1000) == 0x1000) {
            list.add(MessageFlag.ORIGIN_X400);
        }
        if ((n & 0x1) == 0x1) {
            list.add(MessageFlag.READ);
        }
        if ((n & 0x80) == 0x80) {
            list.add(MessageFlag.RESEND);
        }
        if ((n & 0x100) == 0x100) {
            list.add(MessageFlag.READ_REPORT_PENDING);
        }
        if ((n & 0x4) == 0x4) {
            list.add(MessageFlag.SUBMIT);
        }
        if ((n & 0x2) == 0x2) {
            list.add(MessageFlag.UNMODIFIED);
        }
        if ((n & 0x8) == 0x8) {
            list.add(MessageFlag.UNSENT);
        }
        return list;
    }
    
    static int a(final List<MessageFlag> list) {
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            final MessageFlag messageFlag;
            if ((messageFlag = list.get(i)) == MessageFlag.ASSOCIATED) {
                n += 64;
            }
            else if (messageFlag == MessageFlag.FROM_ME) {
                n += 32;
            }
            else if (messageFlag == MessageFlag.HAS_ATTACHMENT) {
                n += 16;
            }
            else if (messageFlag == MessageFlag.NON_READ_REPORT_PENDING) {
                n += 512;
            }
            else if (messageFlag == MessageFlag.ORIGIN_INTERNET) {
                n += 8192;
            }
            else if (messageFlag == MessageFlag.ORIGIN_MISC_EXTERNAL) {
                n += 32768;
            }
            else if (messageFlag == MessageFlag.ORIGIN_X400) {
                n += 4096;
            }
            else if (messageFlag == MessageFlag.READ) {
                ++n;
            }
            else if (messageFlag == MessageFlag.RESEND) {
                n += 128;
            }
            else if (messageFlag == MessageFlag.READ_REPORT_PENDING) {
                n += 256;
            }
            else if (messageFlag == MessageFlag.SUBMIT) {
                n += 4;
            }
            else if (messageFlag == MessageFlag.UNMODIFIED) {
                n += 2;
            }
            else if (messageFlag == MessageFlag.UNSENT) {
                n += 8;
            }
        }
        return n;
    }
    
    static Position v(final String s) {
        if (s.equals("LatestReply")) {
            return Position.LATEST_REPLY;
        }
        if (s.equals("Subject")) {
            return Position.SUBJECT;
        }
        if (s.equals("Signature")) {
            return Position.SIGNATURE;
        }
        return Position.OTHER;
    }
    
    static SelectedMailingAddress w(final String s) {
        if (s.equals("Business")) {
            return SelectedMailingAddress.BUSINESS;
        }
        if (s.equals("Home")) {
            return SelectedMailingAddress.HOME;
        }
        if (s.equals("Other")) {
            return SelectedMailingAddress.OTHER;
        }
        return SelectedMailingAddress.NONE;
    }
    
    static FileAsMapping x(final String s) {
        if (s.equals("Company")) {
            return FileAsMapping.COMPANY;
        }
        if (s.equals("CompanyLastCommaFirst")) {
            return FileAsMapping.COMPANY_LAST_COMMA_FIRST;
        }
        if (s.equals("CompanyLastFirst")) {
            return FileAsMapping.COMPANY_LAST_FIRST;
        }
        if (s.equals("CompanyLastSpaceFirst")) {
            return FileAsMapping.COMPANY_LAST_SPACE_FIRST;
        }
        if (s.equals("FirstSpaceLast")) {
            return FileAsMapping.FIRST_SPACE_LAST;
        }
        if (s.equals("LastCommaFirst")) {
            return FileAsMapping.LAST_COMMA_FIRST;
        }
        if (s.equals("LastCommaFirstCompany")) {
            return FileAsMapping.LAST_COMMA_FIRST_COMPANY;
        }
        if (s.equals("LastFirst")) {
            return FileAsMapping.LAST_FIRST;
        }
        if (s.equals("LastFirstCompany")) {
            return FileAsMapping.LAST_FIRST_COMPANY;
        }
        if (s.equals("LastFirstSuffix")) {
            return FileAsMapping.LAST_FIRST_SUFFIX;
        }
        if (s.equals("LastSpaceFirst")) {
            return FileAsMapping.LAST_SPACE_FIRST;
        }
        if (s.equals("LastSpaceFirstCompany")) {
            return FileAsMapping.LAST_SPACE_FIRST_COMPANY;
        }
        return FileAsMapping.NONE;
    }
    
    static String a(final FileAsMapping fileAsMapping) {
        if (fileAsMapping == FileAsMapping.COMPANY) {
            return "Company";
        }
        if (fileAsMapping == FileAsMapping.COMPANY_LAST_COMMA_FIRST) {
            return "CompanyLastCommaFirst";
        }
        if (fileAsMapping == FileAsMapping.COMPANY_LAST_FIRST) {
            return "CompanyLastFirst";
        }
        if (fileAsMapping == FileAsMapping.COMPANY_LAST_SPACE_FIRST) {
            return "CompanyLastSpaceFirst";
        }
        if (fileAsMapping == FileAsMapping.FIRST_SPACE_LAST) {
            return "FirstSpaceLast";
        }
        if (fileAsMapping == FileAsMapping.LAST_COMMA_FIRST) {
            return "LastCommaFirst";
        }
        if (fileAsMapping == FileAsMapping.LAST_COMMA_FIRST_COMPANY) {
            return "LastCommaFirstCompany";
        }
        if (fileAsMapping == FileAsMapping.LAST_FIRST) {
            return "LastFirst";
        }
        if (fileAsMapping == FileAsMapping.LAST_FIRST_COMPANY) {
            return "LastFirstCompany";
        }
        if (fileAsMapping == FileAsMapping.LAST_FIRST_SUFFIX) {
            return "LastFirstSuffix";
        }
        if (fileAsMapping == FileAsMapping.LAST_SPACE_FIRST) {
            return "LastSpaceFirst";
        }
        if (fileAsMapping == FileAsMapping.LAST_SPACE_FIRST_COMPANY) {
            return "LastSpaceFirstCompany";
        }
        return "None";
    }
    
    static Gender y(final String s) {
        if (s.equals("1")) {
            return Gender.FEMALE;
        }
        if (s.equals("2")) {
            return Gender.MALE;
        }
        return Gender.NONE;
    }
    
    static String a(final Gender gender) {
        if (gender == Gender.FEMALE) {
            return "1";
        }
        if (gender == Gender.MALE) {
            return "2";
        }
        return "0";
    }
    
    static InstanceType z(final String s) {
        if (s.equals("Exception")) {
            return InstanceType.EXCEPTION;
        }
        if (s.equals("Occurrence")) {
            return InstanceType.OCCURRENCE;
        }
        if (s.equals("RecurringMaster")) {
            return InstanceType.RECURRING_MASTER;
        }
        if (s.equals("Single")) {
            return InstanceType.SINGLE;
        }
        return InstanceType.NONE;
    }
    
    static String a(final BusyStatus busyStatus) {
        if (busyStatus == BusyStatus.FREE) {
            return "Free";
        }
        if (busyStatus == BusyStatus.TENTATIVE) {
            return "Tentative";
        }
        if (busyStatus == BusyStatus.BUSY) {
            return "Busy";
        }
        if (busyStatus == BusyStatus.OUT_OF_OFFICE) {
            return "OOF";
        }
        if (busyStatus == BusyStatus.WORKING_ELSEWHERE) {
            return "WorkingElsewhere";
        }
        return "None";
    }
    
    static BusyStatus A(final String s) {
        if (s.equals("Free")) {
            return BusyStatus.FREE;
        }
        if (s.equals("Tentative")) {
            return BusyStatus.TENTATIVE;
        }
        if (s.equals("Busy")) {
            return BusyStatus.BUSY;
        }
        if (s.equals("OOF")) {
            return BusyStatus.OUT_OF_OFFICE;
        }
        if (s.equals("WorkingElsewhere")) {
            return BusyStatus.WORKING_ELSEWHERE;
        }
        return BusyStatus.NONE;
    }
    
    static ResponseType B(final String s) {
        if (s.equals("Accept")) {
            return ResponseType.ACCEPT;
        }
        if (s.equals("Decline")) {
            return ResponseType.DECLINE;
        }
        if (s.equals("NoResponseReceived")) {
            return ResponseType.NO_RESPONSE_RECEIVED;
        }
        if (s.equals("Organizer")) {
            return ResponseType.ORGANIZER;
        }
        if (s.equals("Tentative")) {
            return ResponseType.TENTATIVE;
        }
        if (s.equals("Unknown")) {
            return ResponseType.UNKNOWN;
        }
        return ResponseType.NONE;
    }
    
    static String a(final ShapeType shapeType) {
        if (shapeType == ShapeType.ID) {
            return "IdOnly";
        }
        if (shapeType == ShapeType.DEFAULT) {
            return "Default";
        }
        return "AllProperties";
    }
    
    static String a(final MailboxSearchLocation mailboxSearchLocation) {
        if (mailboxSearchLocation == MailboxSearchLocation.PRIMARY_ONLY) {
            return "PrimaryOnly";
        }
        if (mailboxSearchLocation == MailboxSearchLocation.ARCHIVE_ONLY) {
            return "ArchiveOnly";
        }
        if (mailboxSearchLocation == MailboxSearchLocation.ALL) {
            return "All";
        }
        return "None";
    }
    
    static PredictedMessageAction C(final String s) {
        if (s.equals("Response")) {
            return PredictedMessageAction.RESPONSE;
        }
        if (s.equals("FollowUp")) {
            return PredictedMessageAction.FOLLOW_UP;
        }
        if (s.equals("MoveToFolder")) {
            return PredictedMessageAction.MOVE_TO_FOLDER;
        }
        if (s.equals("Delete")) {
            return PredictedMessageAction.DELETE;
        }
        if (s.equals("Read")) {
            return PredictedMessageAction.READ;
        }
        if (s.equals("Ignore")) {
            return PredictedMessageAction.IGNORE;
        }
        return PredictedMessageAction.NONE;
    }
    
    static IconIndex D(final String s) {
        if (s.equals("AppointmentItem")) {
            return IconIndex.APPOINTMENT_ITEM;
        }
        if (s.equals("AppointmentMeet")) {
            return IconIndex.APPOINTMENT_MEET;
        }
        if (s.equals("AppointmentMeetCancel")) {
            return IconIndex.APPOINTMENT_MEET_CANCEL;
        }
        if (s.equals("AppointmentMeetInfo")) {
            return IconIndex.APPOINTMENT_MEET_INFO;
        }
        if (s.equals("AppointmentMeetMaybe")) {
            return IconIndex.APPOINTMENT_MEET_MAYBE;
        }
        if (s.equals("AppointmentMeetNo")) {
            return IconIndex.APPOINTMENT_MEET_NO;
        }
        if (s.equals("AppointmentMeetNY")) {
            return IconIndex.APPOINTMENT_MEET_NY;
        }
        if (s.equals("AppointmentMeetRecur")) {
            return IconIndex.APPOINTMENT_MEET_RECUR;
        }
        if (s.equals("AppointmentMeetYes")) {
            return IconIndex.APPOINTMENT_MEET_YES;
        }
        if (s.equals("AppointmentRecur")) {
            return IconIndex.APPOINTMENT_RECUR;
        }
        if (s.equals("Default")) {
            return IconIndex.DEFAULT;
        }
        if (s.equals("MailEncrypted")) {
            return IconIndex.MAIL_ENCRYPTED;
        }
        if (s.equals("MailEncryptedForwarded")) {
            return IconIndex.MAIL_ENCRYPTED_FORWARDED;
        }
        if (s.equals("MailEncryptedRead")) {
            return IconIndex.MAIL_ENCRYPTED_READ;
        }
        if (s.equals("MailEncryptedReplied")) {
            return IconIndex.MAIL_ENCRYPTED_REPLIED;
        }
        if (s.equals("MailForwarded")) {
            return IconIndex.MAIL_FORWARDED;
        }
        if (s.equals("MailIrm")) {
            return IconIndex.MAIL_IRM;
        }
        if (s.equals("MailIrmForwarded")) {
            return IconIndex.MAIL_IRM_FORWARDED;
        }
        if (s.equals("MailIrmReplied")) {
            return IconIndex.MAIL_IRM_REPLIED;
        }
        if (s.equals("MailRead")) {
            return IconIndex.MAIL_READ;
        }
        if (s.equals("MailReplied")) {
            return IconIndex.MAIL_REPLIED;
        }
        if (s.equals("MailSmimeSigned")) {
            return IconIndex.MAIL_SMIME_SIGNED;
        }
        if (s.equals("MailSmimeSignedForwarded")) {
            return IconIndex.MAIL_SMIME_SIGNED_FORWARDED;
        }
        if (s.equals("MailSmimeSignedRead")) {
            return IconIndex.MAIL_SMIME_SIGNED_READ;
        }
        if (s.equals("MailSmimeSignedReplied")) {
            return IconIndex.MAIL_SMIME_SIGNED_REPLIED;
        }
        if (s.equals("MailUnread")) {
            return IconIndex.MAIL_UNREAD;
        }
        if (s.equals("OutlookDefaultForContacts")) {
            return IconIndex.OUTLOOK_DEFAULT_FOR_CONTACTS;
        }
        if (s.equals("PostItem")) {
            return IconIndex.POST_ITEM;
        }
        if (s.equals("SmsDelivered")) {
            return IconIndex.SMS_DELIVERED;
        }
        if (s.equals("SmsRoutedToDeliveryPoint")) {
            return IconIndex.SMS_ROUTED_TO_DELIVERY_POINT;
        }
        if (s.equals("SmsRoutedToExternalMessagingSystem")) {
            return IconIndex.SMS_ROUTED_TO_EXTERNAL_MESSAGING_SYSTEM;
        }
        if (s.equals("SmsSubmitted")) {
            return IconIndex.SMS_SUBMITTED;
        }
        if (s.equals("TaskDelegated")) {
            return IconIndex.TASK_DELEGATED;
        }
        if (s.equals("TaskItem")) {
            return IconIndex.TASK_ITEM;
        }
        if (s.equals("TaskOwned")) {
            return IconIndex.TASK_OWNED;
        }
        if (s.equals("TaskRecur")) {
            return IconIndex.TASK_RECUR;
        }
        return IconIndex.NONE;
    }
    
    static String a(final StandardPropertySet set) {
        if (set == StandardPropertySet.ADDRESS) {
            return "Address";
        }
        if (set == StandardPropertySet.APPOINTMENT) {
            return "Appointment";
        }
        if (set == StandardPropertySet.CALENDAR_ASSISTANT) {
            return "CalendarAssistant";
        }
        if (set == StandardPropertySet.COMMON) {
            return "Common";
        }
        if (set == StandardPropertySet.INTERNET_HEADERS) {
            return "InternetHeaders";
        }
        if (set == StandardPropertySet.MEETING) {
            return "Meeting";
        }
        if (set == StandardPropertySet.PUBLIC_STRINGS) {
            return "PublicStrings";
        }
        if (set == StandardPropertySet.TASK) {
            return "Task";
        }
        if (set == StandardPropertySet.SHARING) {
            return "Sharing";
        }
        return "UnifiedMessaging";
    }
    
    static StandardPropertySet E(final String s) {
        if (s.equals("Address")) {
            return StandardPropertySet.ADDRESS;
        }
        if (s.equals("Appointment")) {
            return StandardPropertySet.APPOINTMENT;
        }
        if (s.equals("CalendarAssistant")) {
            return StandardPropertySet.CALENDAR_ASSISTANT;
        }
        if (s.equals("Common")) {
            return StandardPropertySet.COMMON;
        }
        if (s.equals("InternetHeaders")) {
            return StandardPropertySet.INTERNET_HEADERS;
        }
        if (s.equals("Meeting")) {
            return StandardPropertySet.MEETING;
        }
        if (s.equals("PublicStrings")) {
            return StandardPropertySet.PUBLIC_STRINGS;
        }
        if (s.equals("Task")) {
            return StandardPropertySet.TASK;
        }
        if (s.equals("Sharing")) {
            return StandardPropertySet.SHARING;
        }
        return StandardPropertySet.UNIFIED_MESSAGING;
    }
    
    static String a(final MapiPropertyType mapiPropertyType) {
        if (mapiPropertyType == MapiPropertyType.APPLICATION_TIME) {
            return "ApplicationTime";
        }
        if (mapiPropertyType == MapiPropertyType.APPLICATION_TIME_ARRAY) {
            return "ApplicationTimeArray";
        }
        if (mapiPropertyType == MapiPropertyType.BINARY) {
            return "Binary";
        }
        if (mapiPropertyType == MapiPropertyType.BINARY_ARRAY) {
            return "BinaryArray";
        }
        if (mapiPropertyType == MapiPropertyType.BOOLEAN) {
            return "Boolean";
        }
        if (mapiPropertyType == MapiPropertyType.CLSID) {
            return "CLSID";
        }
        if (mapiPropertyType == MapiPropertyType.CLSID_ARRAY) {
            return "CLSIDArray";
        }
        if (mapiPropertyType == MapiPropertyType.CURRENCY) {
            return "Currency";
        }
        if (mapiPropertyType == MapiPropertyType.CURRENCY_ARRAY) {
            return "CurrencyArray";
        }
        if (mapiPropertyType == MapiPropertyType.DOUBLE) {
            return "Double";
        }
        if (mapiPropertyType == MapiPropertyType.DOUBLE_ARRAY) {
            return "DoubleArray";
        }
        if (mapiPropertyType == MapiPropertyType.ERROR) {
            return "Error";
        }
        if (mapiPropertyType == MapiPropertyType.FLOAT) {
            return "Float";
        }
        if (mapiPropertyType == MapiPropertyType.FLOAT_ARRAY) {
            return "FloatArray";
        }
        if (mapiPropertyType == MapiPropertyType.INTEGER) {
            return "Integer";
        }
        if (mapiPropertyType == MapiPropertyType.INTEGER_ARRAY) {
            return "IntegerArray";
        }
        if (mapiPropertyType == MapiPropertyType.LONG) {
            return "Long";
        }
        if (mapiPropertyType == MapiPropertyType.LONG_ARRAY) {
            return "LongArray";
        }
        if (mapiPropertyType == MapiPropertyType.NULL) {
            return "Null";
        }
        if (mapiPropertyType == MapiPropertyType.OBJECT) {
            return "Object";
        }
        if (mapiPropertyType == MapiPropertyType.OBJECT_ARRAY) {
            return "ObjectArray";
        }
        if (mapiPropertyType == MapiPropertyType.SHORT) {
            return "Short";
        }
        if (mapiPropertyType == MapiPropertyType.SHORT_ARRAY) {
            return "ShortArray";
        }
        if (mapiPropertyType == MapiPropertyType.STRING) {
            return "String";
        }
        if (mapiPropertyType == MapiPropertyType.STRING_ARRAY) {
            return "StringArray";
        }
        if (mapiPropertyType == MapiPropertyType.SYSTEM_TIME) {
            return "SystemTime";
        }
        return "SystemTimeArray";
    }
    
    static MapiPropertyType F(final String s) {
        if (s.equals("ApplicationTime")) {
            return MapiPropertyType.APPLICATION_TIME;
        }
        if (s.equals("ApplicationTimeArray")) {
            return MapiPropertyType.APPLICATION_TIME_ARRAY;
        }
        if (s.equals("Binary")) {
            return MapiPropertyType.BINARY;
        }
        if (s.equals("BinaryArray")) {
            return MapiPropertyType.BINARY_ARRAY;
        }
        if (s.equals("Boolean")) {
            return MapiPropertyType.BOOLEAN;
        }
        if (s.equals("CLSID")) {
            return MapiPropertyType.CLSID;
        }
        if (s.equals("CLSIDArray")) {
            return MapiPropertyType.CLSID_ARRAY;
        }
        if (s.equals("Currency")) {
            return MapiPropertyType.CURRENCY;
        }
        if (s.equals("CurrencyArray")) {
            return MapiPropertyType.CURRENCY_ARRAY;
        }
        if (s.equals("Double")) {
            return MapiPropertyType.DOUBLE;
        }
        if (s.equals("DoubleArray")) {
            return MapiPropertyType.DOUBLE_ARRAY;
        }
        if (s.equals("Error")) {
            return MapiPropertyType.ERROR;
        }
        if (s.equals("Float")) {
            return MapiPropertyType.FLOAT;
        }
        if (s.equals("FloatArray")) {
            return MapiPropertyType.FLOAT_ARRAY;
        }
        if (s.equals("Integer")) {
            return MapiPropertyType.INTEGER;
        }
        if (s.equals("IntegerArray")) {
            return MapiPropertyType.INTEGER_ARRAY;
        }
        if (s.equals("Long")) {
            return MapiPropertyType.LONG;
        }
        if (s.equals("LongArray")) {
            return MapiPropertyType.LONG_ARRAY;
        }
        if (s.equals("Null")) {
            return MapiPropertyType.NULL;
        }
        if (s.equals("Object")) {
            return MapiPropertyType.OBJECT;
        }
        if (s.equals("ObjectArray")) {
            return MapiPropertyType.OBJECT_ARRAY;
        }
        if (s.equals("Short")) {
            return MapiPropertyType.SHORT;
        }
        if (s.equals("ShortArray")) {
            return MapiPropertyType.SHORT_ARRAY;
        }
        if (s.equals("String")) {
            return MapiPropertyType.STRING;
        }
        if (s.equals("StringArray")) {
            return MapiPropertyType.STRING_ARRAY;
        }
        if (s.equals("SystemTime")) {
            return MapiPropertyType.SYSTEM_TIME;
        }
        return MapiPropertyType.SYSTEM_TIME_ARRAY;
    }
    
    static ResponseStatus G(final String s) {
        if (s.equals("1")) {
            return ResponseStatus.ORGANIZED;
        }
        if (s.equals("2")) {
            return ResponseStatus.TENTATIVE;
        }
        if (s.equals("3")) {
            return ResponseStatus.ACCEPTED;
        }
        if (s.equals("4")) {
            return ResponseStatus.DECLINED;
        }
        if (s.equals("5")) {
            return ResponseStatus.NOT_RESPONDED;
        }
        return ResponseStatus.NONE;
    }
    
    static String a(final ResponseStatus responseStatus) {
        if (responseStatus == ResponseStatus.ORGANIZED) {
            return "1";
        }
        if (responseStatus == ResponseStatus.TENTATIVE) {
            return "2";
        }
        if (responseStatus == ResponseStatus.ACCEPTED) {
            return "3";
        }
        if (responseStatus == ResponseStatus.DECLINED) {
            return "4";
        }
        if (responseStatus == ResponseStatus.NOT_RESPONDED) {
            return "5";
        }
        return "0";
    }
    
    static String a(final MeetingStatus meetingStatus) {
        if (meetingStatus == MeetingStatus.NON_MEETING) {
            return "0";
        }
        if (meetingStatus == MeetingStatus.MEETING) {
            return "1";
        }
        if (meetingStatus == MeetingStatus.RECEIVED) {
            return "3";
        }
        if (meetingStatus == MeetingStatus.CANCELED_ORGANIZER) {
            return "5";
        }
        if (meetingStatus == MeetingStatus.CANCELED) {
            return "7";
        }
        return "None";
    }
    
    static MeetingStatus H(final String s) {
        if (s.equals("0")) {
            return MeetingStatus.NON_MEETING;
        }
        if (s.equals("1")) {
            return MeetingStatus.MEETING;
        }
        if (s.equals("3")) {
            return MeetingStatus.RECEIVED;
        }
        if (s.equals("5")) {
            return MeetingStatus.CANCELED_ORGANIZER;
        }
        if (s.equals("7")) {
            return MeetingStatus.CANCELED;
        }
        return MeetingStatus.NONE;
    }
    
    static LegacyFreeBusy I(final String s) {
        if (s.equals("Busy")) {
            return LegacyFreeBusy.BUSY;
        }
        if (s.equals("Free")) {
            return LegacyFreeBusy.FREE;
        }
        if (s.equals("NoData")) {
            return LegacyFreeBusy.NO_DATA;
        }
        if (s.equals("OOF")) {
            return LegacyFreeBusy.OUT_OF_OFFICE;
        }
        if (s.equals("Tentative")) {
            return LegacyFreeBusy.TENTATIVE;
        }
        if (s.equals("WorkingElsewhere")) {
            return LegacyFreeBusy.WORKING_ELSEWHERE;
        }
        return LegacyFreeBusy.NONE;
    }
    
    static String a(final LegacyFreeBusy legacyFreeBusy) {
        if (legacyFreeBusy == LegacyFreeBusy.BUSY) {
            return "Busy";
        }
        if (legacyFreeBusy == LegacyFreeBusy.FREE) {
            return "Free";
        }
        if (legacyFreeBusy == LegacyFreeBusy.NO_DATA) {
            return "NoData";
        }
        if (legacyFreeBusy == LegacyFreeBusy.OUT_OF_OFFICE) {
            return "OOF";
        }
        if (legacyFreeBusy == LegacyFreeBusy.TENTATIVE) {
            return "Tentative";
        }
        if (legacyFreeBusy == LegacyFreeBusy.WORKING_ELSEWHERE) {
            return "WorkingElsewhere";
        }
        return "None";
    }
    
    static FlagStatus J(final String s) {
        if (s.equals("1")) {
            return FlagStatus.COMPLETE;
        }
        if (s.equals("2")) {
            return FlagStatus.MARKED;
        }
        return FlagStatus.NONE;
    }
    
    static String a(final FlagStatus flagStatus) {
        if (flagStatus == FlagStatus.COMPLETE) {
            return "1";
        }
        if (flagStatus == FlagStatus.MARKED) {
            return "2";
        }
        return "0";
    }
    
    static FlagStatus K(final String s) {
        if (s.equals("Complete")) {
            return FlagStatus.COMPLETE;
        }
        if (s.equals("Flagged")) {
            return FlagStatus.MARKED;
        }
        return FlagStatus.NONE;
    }
    
    static FlagIcon L(final String s) {
        if (s.equals("1")) {
            return FlagIcon.PURPLE;
        }
        if (s.equals("2")) {
            return FlagIcon.ORANGE;
        }
        if (s.equals("3")) {
            return FlagIcon.GREEN;
        }
        if (s.equals("4")) {
            return FlagIcon.YELLOW;
        }
        if (s.equals("5")) {
            return FlagIcon.BLUE;
        }
        if (s.equals("6")) {
            return FlagIcon.RED;
        }
        return FlagIcon.NONE;
    }
    
    static String a(final FlagIcon flagIcon) {
        if (flagIcon == FlagIcon.PURPLE) {
            return "1";
        }
        if (flagIcon == FlagIcon.ORANGE) {
            return "2";
        }
        if (flagIcon == FlagIcon.GREEN) {
            return "3";
        }
        if (flagIcon == FlagIcon.YELLOW) {
            return "4";
        }
        if (flagIcon == FlagIcon.BLUE) {
            return "5";
        }
        if (flagIcon == FlagIcon.RED) {
            return "6";
        }
        return "0";
    }
    
    static Priority M(final String s) {
        if (s.equals("-1")) {
            return Priority.LOW;
        }
        if (s.equals("1")) {
            return Priority.HIGH;
        }
        if (s.equals("0")) {
            return Priority.NORMAL;
        }
        return Priority.NONE;
    }
    
    static String a(final TaskStatus taskStatus) {
        if (taskStatus == TaskStatus.COMPLETED) {
            return "Completed";
        }
        if (taskStatus == TaskStatus.DEFERRED) {
            return "Deferred";
        }
        if (taskStatus == TaskStatus.IN_PROGRESS) {
            return "InProgress";
        }
        if (taskStatus == TaskStatus.NOT_STARTED) {
            return "NotStarted";
        }
        if (taskStatus == TaskStatus.WAITING_ON_OTHERS) {
            return "WaitingOnOthers";
        }
        return "None";
    }
    
    static String a(final RequestServerVersion requestServerVersion) {
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2016) {
            return "Exchange2016";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2013_SP1) {
            return "Exchange2013_SP1";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2013) {
            return "Exchange2013";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2010) {
            return "Exchange2010";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2010_SP1) {
            return "Exchange2010_SP1";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2010_SP2) {
            return "Exchange2010_SP2";
        }
        if (requestServerVersion == RequestServerVersion.EXCHANGE_2007) {
            return "Exchange2007";
        }
        return "Exchange2007_SP1";
    }
    
    static String a(final BodyType bodyType) {
        if (bodyType == BodyType.HTML) {
            return "HTML";
        }
        if (bodyType == BodyType.BEST) {
            return "Best";
        }
        return "Text";
    }
    
    static String a(final MessageDisposition messageDisposition) {
        if (messageDisposition == MessageDisposition.SEND_AND_SAVE_COPY) {
            return "SendAndSaveCopy";
        }
        if (messageDisposition == MessageDisposition.SEND_ONLY) {
            return "SendOnly";
        }
        return "SaveOnly";
    }
    
    static String a(final SendMeetingInvitations sendMeetingInvitations) {
        if (sendMeetingInvitations == SendMeetingInvitations.SEND_TO_ALL) {
            return "SendOnlyToAll";
        }
        if (sendMeetingInvitations == SendMeetingInvitations.SEND_TO_ALL_AND_SAVE_COPY) {
            return "SendToAllAndSaveCopy";
        }
        return "SendToNone";
    }
    
    static Sensitivity N(final String s) {
        if (s.equals("Normal")) {
            return Sensitivity.NORMAL;
        }
        if (s.equals("Personal")) {
            return Sensitivity.PERSONAL;
        }
        if (s.equals("Private")) {
            return Sensitivity.PRIVATE;
        }
        if (s.equals("Confidential")) {
            return Sensitivity.CONFIDENTIAL;
        }
        return Sensitivity.NONE;
    }
    
    static String a(final Sensitivity sensitivity) {
        if (sensitivity == Sensitivity.NORMAL) {
            return "Normal";
        }
        if (sensitivity == Sensitivity.PERSONAL) {
            return "Personal";
        }
        if (sensitivity == Sensitivity.PRIVATE) {
            return "Private";
        }
        if (sensitivity == Sensitivity.CONFIDENTIAL) {
            return "Confidential";
        }
        return "None";
    }
    
    static Importance O(final String s) {
        if (s.equals("Normal")) {
            return Importance.NORMAL;
        }
        if (s.equals("High")) {
            return Importance.HIGH;
        }
        if (s.equals("Low")) {
            return Importance.LOW;
        }
        return Importance.NONE;
    }
    
    static String a(final Importance importance) {
        if (importance == Importance.NORMAL) {
            return "Normal";
        }
        if (importance == Importance.HIGH) {
            return "High";
        }
        if (importance == Importance.LOW) {
            return "Low";
        }
        return "None";
    }
    
    static NoteColor P(final String s) {
        if (s.equals("0")) {
            return NoteColor.BLUE;
        }
        if (s.equals("1")) {
            return NoteColor.GREEN;
        }
        if (s.equals("2")) {
            return NoteColor.PINK;
        }
        if (s.equals("3")) {
            return NoteColor.YELLOW;
        }
        if (s.equals("4")) {
            return NoteColor.WHITE;
        }
        return NoteColor.NONE;
    }
    
    static String a(final NoteColor noteColor) {
        if (noteColor == NoteColor.BLUE) {
            return "0";
        }
        if (noteColor == NoteColor.GREEN) {
            return "1";
        }
        if (noteColor == NoteColor.PINK) {
            return "2";
        }
        if (noteColor == NoteColor.YELLOW) {
            return "3";
        }
        if (noteColor == NoteColor.WHITE) {
            return "4";
        }
        return "0";
    }
    
    static String a(final StandardFolder standardFolder) {
        if (standardFolder == StandardFolder.CALENDAR) {
            return "calendar";
        }
        if (standardFolder == StandardFolder.CONTACTS) {
            return "contacts";
        }
        if (standardFolder == StandardFolder.DELETED_ITEMS) {
            return "deleteditems";
        }
        if (standardFolder == StandardFolder.DRAFTS) {
            return "drafts";
        }
        if (standardFolder == StandardFolder.INBOX) {
            return "inbox";
        }
        if (standardFolder == StandardFolder.JOURNAL) {
            return "journal";
        }
        if (standardFolder == StandardFolder.JUNK_EMAIL) {
            return "junkemail";
        }
        if (standardFolder == StandardFolder.MAILBOX_ROOT) {
            return "msgfolderroot";
        }
        if (standardFolder == StandardFolder.NOTES) {
            return "notes";
        }
        if (standardFolder == StandardFolder.OUTBOX) {
            return "outbox";
        }
        if (standardFolder == StandardFolder.PUBLIC_FOLDERS_ROOT) {
            return "publicfoldersroot";
        }
        if (standardFolder == StandardFolder.ROOT) {
            return "root";
        }
        if (standardFolder == StandardFolder.SEARCH_FOLDERS) {
            return "searchfolders";
        }
        if (standardFolder == StandardFolder.SENT_ITEMS) {
            return "sentitems";
        }
        if (standardFolder == StandardFolder.TASKS) {
            return "tasks";
        }
        if (standardFolder == StandardFolder.VOICE_MAIL) {
            return "voicemail";
        }
        if (standardFolder == StandardFolder.ARCHIVE_DELETED_ITEMS) {
            return "archivedeleteditems";
        }
        if (standardFolder == StandardFolder.ARCHIVE_MESSAGE_FOLDER_ROOT) {
            return "archivemsgfolderroot";
        }
        if (standardFolder == StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_DELETIONS) {
            return "archiverecoverableitemsdeletions";
        }
        if (standardFolder == StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_PURGES) {
            return "archiverecoverableitemspurges";
        }
        if (standardFolder == StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_ROOT) {
            return "archiverecoverableitemsroot";
        }
        if (standardFolder == StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_VERSIONS) {
            return "archiverecoverableitemsversions";
        }
        if (standardFolder == StandardFolder.ARCHIVE_ROOT) {
            return "archiveroot";
        }
        if (standardFolder == StandardFolder.RECOVERABLE_ITEMS_DELETIONS) {
            return "recoverableitemsdeletions";
        }
        if (standardFolder == StandardFolder.RECOVERABLE_ITEMS_PURGES) {
            return "recoverableitemspurges";
        }
        if (standardFolder == StandardFolder.RECOVERABLE_ITEMS_ROOT) {
            return "recoverableitemsroot";
        }
        if (standardFolder == StandardFolder.RECOVERABLE_ITEMS_VERSIONS) {
            return "recoverableitemsversions";
        }
        if (standardFolder == StandardFolder.SYNC_ISSUES) {
            return "syncissues";
        }
        if (standardFolder == StandardFolder.CONFLICTS) {
            return "conflicts";
        }
        if (standardFolder == StandardFolder.LOCAL_FAILURES) {
            return "localfailures";
        }
        if (standardFolder == StandardFolder.SERVER_FAILURES) {
            return "serverfailures";
        }
        if (standardFolder == StandardFolder.RECIPIENT_CACHE) {
            return "recipientcache";
        }
        if (standardFolder == StandardFolder.QUICK_CONTACTS) {
            return "quickcontacts";
        }
        if (standardFolder == StandardFolder.CONVERSATION_HISTORY) {
            return "conversationhistory";
        }
        if (standardFolder == StandardFolder.ADMIN_AUDIT_LOGS) {
            return "adminauditlogs";
        }
        if (standardFolder == StandardFolder.TO_DO_SEARCH) {
            return "todosearch";
        }
        if (standardFolder == StandardFolder.MY_CONTACTS) {
            return "mycontacts";
        }
        if (standardFolder == StandardFolder.DIRECTORY) {
            return "directory";
        }
        if (standardFolder == StandardFolder.IM_CONTACT_LIST) {
            return "imcontactlist";
        }
        if (standardFolder == StandardFolder.PEOPLE_CONNECT) {
            return "peopleconnect";
        }
        return "none";
    }
    
    static StandardFolder Q(final String s) {
        if (s.equals("calendar")) {
            return StandardFolder.CALENDAR;
        }
        if (s.equals("contacts")) {
            return StandardFolder.CONTACTS;
        }
        if (s.equals("deleteditems")) {
            return StandardFolder.DELETED_ITEMS;
        }
        if (s.equals("drafts")) {
            return StandardFolder.DRAFTS;
        }
        if (s.equals("inbox")) {
            return StandardFolder.INBOX;
        }
        if (s.equals("journal")) {
            return StandardFolder.JOURNAL;
        }
        if (s.equals("junkemail")) {
            return StandardFolder.JUNK_EMAIL;
        }
        if (s.equals("msgfolderroot")) {
            return StandardFolder.MAILBOX_ROOT;
        }
        if (s.equals("notes")) {
            return StandardFolder.NOTES;
        }
        if (s.equals("outbox")) {
            return StandardFolder.OUTBOX;
        }
        if (s.equals("publicfoldersroot")) {
            return StandardFolder.PUBLIC_FOLDERS_ROOT;
        }
        if (s.equals("root")) {
            return StandardFolder.ROOT;
        }
        if (s.equals("searchfolders")) {
            return StandardFolder.SEARCH_FOLDERS;
        }
        if (s.equals("sentitems")) {
            return StandardFolder.SENT_ITEMS;
        }
        if (s.equals("tasks")) {
            return StandardFolder.TASKS;
        }
        if (s.equals("voicemail")) {
            return StandardFolder.VOICE_MAIL;
        }
        if (s.equals("archivedeleteditems")) {
            return StandardFolder.ARCHIVE_DELETED_ITEMS;
        }
        if (s.equals("archivemsgfolderroot")) {
            return StandardFolder.ARCHIVE_MESSAGE_FOLDER_ROOT;
        }
        if (s.equals("archiverecoverableitemsdeletions")) {
            return StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_DELETIONS;
        }
        if (s.equals("archiverecoverableitemspurges")) {
            return StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_PURGES;
        }
        if (s.equals("archiverecoverableitemsroot")) {
            return StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_ROOT;
        }
        if (s.equals("archiverecoverableitemsversions")) {
            return StandardFolder.ARCHIVE_RECOVERABLE_ITEMS_VERSIONS;
        }
        if (s.equals("archiveroot")) {
            return StandardFolder.ARCHIVE_ROOT;
        }
        if (s.equals("recoverableitemsdeletions")) {
            return StandardFolder.RECOVERABLE_ITEMS_DELETIONS;
        }
        if (s.equals("recoverableitemspurges")) {
            return StandardFolder.RECOVERABLE_ITEMS_PURGES;
        }
        if (s.equals("recoverableitemsroot")) {
            return StandardFolder.RECOVERABLE_ITEMS_ROOT;
        }
        if (s.equals("recoverableitemsversions")) {
            return StandardFolder.RECOVERABLE_ITEMS_VERSIONS;
        }
        if (s.equals("syncissues")) {
            return StandardFolder.SYNC_ISSUES;
        }
        if (s.equals("conflicts")) {
            return StandardFolder.CONFLICTS;
        }
        if (s.equals("localfailures")) {
            return StandardFolder.LOCAL_FAILURES;
        }
        if (s.equals("serverfailures")) {
            return StandardFolder.SERVER_FAILURES;
        }
        if (s.equals("recipientcache")) {
            return StandardFolder.RECIPIENT_CACHE;
        }
        if (s.equals("quickcontacts")) {
            return StandardFolder.QUICK_CONTACTS;
        }
        if (s.equals("conversationhistory")) {
            return StandardFolder.CONVERSATION_HISTORY;
        }
        if (s.equals("adminauditlogs")) {
            return StandardFolder.ADMIN_AUDIT_LOGS;
        }
        if (s.equals("todosearch")) {
            return StandardFolder.TO_DO_SEARCH;
        }
        if (s.equals("mycontacts")) {
            return StandardFolder.MY_CONTACTS;
        }
        if (s.equals("directory")) {
            return StandardFolder.DIRECTORY;
        }
        if (s.equals("imcontactlist")) {
            return StandardFolder.IM_CONTACT_LIST;
        }
        if (s.equals("peopleconnect")) {
            return StandardFolder.PEOPLE_CONNECT;
        }
        return StandardFolder.NONE;
    }
    
    static ResponseClass R(final String s) {
        if (s.equals("Success")) {
            return ResponseClass.SUCCESS;
        }
        if (s.equals("Warning")) {
            return ResponseClass.WARNING;
        }
        return ResponseClass.ERROR;
    }
    
    static String a(final ResponseCode responseCode) {
        if (responseCode == ResponseCode.NO_ERROR) {
            return "NoError";
        }
        if (responseCode == ResponseCode.ERROR_ACCESS_DENIED) {
            return "ErrorAccessDenied";
        }
        if (responseCode == ResponseCode.ERROR_ACCESS_MODE_SPECIFIED) {
            return "ErrorAccessModeSpecified";
        }
        if (responseCode == ResponseCode.ERROR_ACCOUNT_DISABLED) {
            return "ErrorAccountDisabled";
        }
        if (responseCode == ResponseCode.ERROR_ADD_DELEGATES_FAILED) {
            return "ErrorAddDelegatesFailed";
        }
        if (responseCode == ResponseCode.ERROR_ADDRESS_SPACE_NOT_FOUND) {
            return "ErrorAddressSpaceNotFound";
        }
        if (responseCode == ResponseCode.ERROR_ADOPERATION) {
            return "ErrorADOperation";
        }
        if (responseCode == ResponseCode.ERROR_ADSESSION_FILTER) {
            return "ErrorADSessionFilter";
        }
        if (responseCode == ResponseCode.ERROR_ADUNAVAILABLE) {
            return "ErrorADUnavailable";
        }
        if (responseCode == ResponseCode.ERROR_AFFECTED_TASK_OCCURRENCES_REQUIRED) {
            return "ErrorAffectedTaskOccurrencesRequired";
        }
        if (responseCode == ResponseCode.ERROR_ATTACHMENT_NEST_LEVEL_LIMIT_EXCEEDED) {
            return "ErrorAttachmentNestLevelLimitExceeded";
        }
        if (responseCode == ResponseCode.ERROR_ATTACHMENT_SIZE_LIMIT_EXCEEDED) {
            return "ErrorAttachmentSizeLimitExceeded";
        }
        if (responseCode == ResponseCode.ERROR_AUTO_DISCOVER_FAILED) {
            return "ErrorAutoDiscoverFailed";
        }
        if (responseCode == ResponseCode.ERROR_AVAILABILITY_CONFIG_NOT_FOUND) {
            return "ErrorAvailabilityConfigNotFound";
        }
        if (responseCode == ResponseCode.ERROR_BATCH_PROCESSING_STOPPED) {
            return "ErrorBatchProcessingStopped";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_CANNOT_MOVE_OR_COPY_OCCURRENCE) {
            return "ErrorCalendarCannotMoveOrCopyOccurrence";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_CANNOT_UPDATE_DELETED_ITEM) {
            return "ErrorCalendarCannotUpdateDeletedItem";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_CANNOT_USE_ID_FOR_OCCURRENCE_ID) {
            return "ErrorCalendarCannotUseIdForOccurrenceId";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_CANNOT_USE_ID_FOR_RECURRING_MASTER_ID) {
            return "ErrorCalendarCannotUseIdForRecurringMasterId";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_DURATION_IS_TOO_LONG) {
            return "ErrorCalendarDurationIsTooLong";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_END_DATE_IS_EARLIER_THAN_START_DATE) {
            return "ErrorCalendarEndDateIsEarlierThanStartDate";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_FOLDER_IS_INVALID_FOR_CALENDAR_VIEW) {
            return "ErrorCalendarFolderIsInvalidForCalendarView";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_ATTRIBUTE_VALUE) {
            return "ErrorCalendarInvalidAttributeValue";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_DAY_FOR_TIME_CHANGE_PATTERN) {
            return "ErrorCalendarInvalidDayForTimeChangePattern";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_DAY_FOR_WEEKLY_RECURRENCE) {
            return "ErrorCalendarInvalidDayForWeeklyRecurrence";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_PROPERTY_STATE) {
            return "ErrorCalendarInvalidPropertyState";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_PROPERTY_VALUE) {
            return "ErrorCalendarInvalidPropertyValue";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_RECURRENCE) {
            return "ErrorCalendarInvalidRecurrence";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_INVALID_TIME_ZONE) {
            return "ErrorCalendarInvalidTimeZone";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_ACCEPT) {
            return "ErrorCalendarIsDelegatedForAccept";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_DECLINE) {
            return "ErrorCalendarIsDelegatedForDecline";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_REMOVE) {
            return "ErrorCalendarIsDelegatedForRemove";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_TENTATIVE) {
            return "ErrorCalendarIsDelegatedForTentative";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_NOT_ORGANIZER) {
            return "ErrorCalendarIsNotOrganizer";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_ACCEPT) {
            return "ErrorCalendarIsOrganizerForAccept";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_DECLINE) {
            return "ErrorCalendarIsOrganizerForDecline";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_REMOVE) {
            return "ErrorCalendarIsOrganizerForRemove";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_TENTATIVE) {
            return "ErrorCalendarIsOrganizerForTentative";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_MEETING_REQUEST_IS_OUT_OF_DATE) {
            return "ErrorCalendarMeetingRequestIsOutOfDate";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_OCCURRENCE_INDEX_IS_OUT_OF_RECURRENCE_RANGE) {
            return "ErrorCalendarOccurrenceIndexIsOutOfRecurrenceRange";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_OCCURRENCE_IS_DELETED_FROM_RECURRENCE) {
            return "ErrorCalendarOccurrenceIsDeletedFromRecurrence";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_OUT_OF_RANGE) {
            return "ErrorCalendarOutOfRange";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_VIEW_RANGE_TOO_BIG) {
            return "ErrorCalendarViewRangeTooBig";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_CREATE_CALENDAR_ITEM_IN_NON_CALENDAR_FOLDER) {
            return "ErrorCannotCreateCalendarItemInNonCalendarFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_CREATE_CONTACT_IN_NON_CONTACT_FOLDER) {
            return "ErrorCannotCreateContactInNonContactFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_CREATE_POST_ITEM_IN_NON_MAIL_FOLDER) {
            return "ErrorCannotCreatePostItemInNonMailFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_CREATE_TASK_IN_NON_TASK_FOLDER) {
            return "ErrorCannotCreateTaskInNonTaskFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_DELETE_OBJECT) {
            return "ErrorCannotDeleteObject";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_DELETE_TASK_OCCURRENCE) {
            return "ErrorCannotDeleteTaskOccurrence";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_OPEN_FILE_ATTACHMENT) {
            return "ErrorCannotOpenFileAttachment";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_SET_CALENDAR_PERMISSION_ON_NON_CALENDAR_FOLDER) {
            return "ErrorCannotSetCalendarPermissionOnNonCalendarFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_SET_NON_CALENDAR_PERMISSION_ON_CALENDAR_FOLDER) {
            return "ErrorCannotSetNonCalendarPermissionOnCalendarFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_SET_PERMISSION_UNKNOWN_ENTRIES) {
            return "ErrorCannotSetPermissionUnknownEntries";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_USE_FOLDER_ID_FOR_ITEM_ID) {
            return "ErrorCannotUseFolderIdForItemId";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_USE_ITEM_ID_FOR_FOLDER_ID) {
            return "ErrorCannotUseItemIdForFolderId";
        }
        if (responseCode == ResponseCode.ERROR_CHANGE_KEY_REQUIRED) {
            return "ErrorChangeKeyRequired";
        }
        if (responseCode == ResponseCode.ERROR_CHANGE_KEY_REQUIRED_FOR_WRITE_OPERATIONS) {
            return "ErrorChangeKeyRequiredForWriteOperations";
        }
        if (responseCode == ResponseCode.ERROR_CONNECTION_FAILED) {
            return "ErrorConnectionFailed";
        }
        if (responseCode == ResponseCode.ERROR_CONTENT_CONVERSION_FAILED) {
            return "ErrorContentConversionFailed";
        }
        if (responseCode == ResponseCode.ERROR_CORRUPT_DATA) {
            return "ErrorCorruptData";
        }
        if (responseCode == ResponseCode.ERROR_CREATE_ITEM_ACCESS_DENIED) {
            return "ErrorCreateItemAccessDenied";
        }
        if (responseCode == ResponseCode.ERROR_CREATE_MANAGED_FOLDER_PARTIAL_COMPLETION) {
            return "ErrorCreateManagedFolderPartialCompletion";
        }
        if (responseCode == ResponseCode.ERROR_CREATE_SUBFOLDER_ACCESS_DENIED) {
            return "ErrorCreateSubfolderAccessDenied";
        }
        if (responseCode == ResponseCode.ERROR_CROSS_MAILBOX_MOVE_COPY) {
            return "ErrorCrossMailboxMoveCopy";
        }
        if (responseCode == ResponseCode.ERROR_DATA_SIZE_LIMIT_EXCEEDED) {
            return "ErrorDataSizeLimitExceeded";
        }
        if (responseCode == ResponseCode.ERROR_DATA_SOURCE_OPERATION) {
            return "ErrorDataSourceOperation";
        }
        if (responseCode == ResponseCode.ERROR_DELEGATE_ALREADY_EXISTS) {
            return "ErrorDelegateAlreadyExists";
        }
        if (responseCode == ResponseCode.ERROR_DELEGATE_CANNOT_ADD_OWNER) {
            return "ErrorDelegateCannotAddOwner";
        }
        if (responseCode == ResponseCode.ERROR_DELEGATE_MISSING_CONFIGURATION) {
            return "ErrorDelegateMissingConfiguration";
        }
        if (responseCode == ResponseCode.ERROR_DELEGATE_NO_USER) {
            return "ErrorDelegateNoUser";
        }
        if (responseCode == ResponseCode.ERROR_DELEGATE_VALIDATION_FAILED) {
            return "ErrorDelegateValidationFailed";
        }
        if (responseCode == ResponseCode.ERROR_DELETE_DISTINGUISHED_FOLDER) {
            return "ErrorDeleteDistinguishedFolder";
        }
        if (responseCode == ResponseCode.ERROR_DELETE_ITEMS_FAILED) {
            return "ErrorDeleteItemsFailed";
        }
        if (responseCode == ResponseCode.ERROR_DISTINGUISHED_USER_NOT_SUPPORTED) {
            return "ErrorDistinguishedUserNotSupported";
        }
        if (responseCode == ResponseCode.ERROR_DUPLICATE_INPUT_FOLDER_NAMES) {
            return "ErrorDuplicateInputFolderNames";
        }
        if (responseCode == ResponseCode.ERROR_DUPLICATE_USER_IDS_SPECIFIED) {
            return "ErrorDuplicateUserIdsSpecified";
        }
        if (responseCode == ResponseCode.ERROR_EMAIL_ADDRESS_MISMATCH) {
            return "ErrorEmailAddressMismatch";
        }
        if (responseCode == ResponseCode.ERROR_EVENT_NOT_FOUND) {
            return "ErrorEventNotFound";
        }
        if (responseCode == ResponseCode.ERROR_EXPIRED_SUBSCRIPTION) {
            return "ErrorExpiredSubscription";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_CORRUPT) {
            return "ErrorFolderCorrupt";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_EXISTS) {
            return "ErrorFolderExists";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_NOT_FOUND) {
            return "ErrorFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_PROPERT_REQUEST_FAILED) {
            return "ErrorFolderPropertRequestFailed";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_SAVE) {
            return "ErrorFolderSave";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_SAVE_FAILED) {
            return "ErrorFolderSaveFailed";
        }
        if (responseCode == ResponseCode.ERROR_FOLDER_SAVE_PROPERTY_ERROR) {
            return "ErrorFolderSavePropertyError";
        }
        if (responseCode == ResponseCode.ERROR_FREE_BUSY_GENERATION_FAILED) {
            return "ErrorFreeBusyGenerationFailed";
        }
        if (responseCode == ResponseCode.ERROR_GET_SERVER_SECURITY_DESCRIPTOR_FAILED) {
            return "ErrorGetServerSecurityDescriptorFailed";
        }
        if (responseCode == ResponseCode.ERROR_IMPERSONATE_USER_DENIED) {
            return "ErrorImpersonateUserDenied";
        }
        if (responseCode == ResponseCode.ERROR_IMPERSONATION_DENIED) {
            return "ErrorImpersonationDenied";
        }
        if (responseCode == ResponseCode.ERROR_IMPERSONATION_FAILED) {
            return "ErrorImpersonationFailed";
        }
        if (responseCode == ResponseCode.ERROR_INCORRECT_SCHEMA_VERSION) {
            return "ErrorIncorrectSchemaVersion";
        }
        if (responseCode == ResponseCode.ERROR_INCORRECT_UPDATE_PROPERTY_COUNT) {
            return "ErrorIncorrectUpdatePropertyCount";
        }
        if (responseCode == ResponseCode.ERROR_INDIVIDUAL_MAILBOX_LIMIT_REACHED) {
            return "ErrorIndividualMailboxLimitReached";
        }
        if (responseCode == ResponseCode.ERROR_INSUFFICIENT_RESOURCES) {
            return "ErrorInsufficientResources";
        }
        if (responseCode == ResponseCode.ERROR_INTERNAL_SERVER_ERROR) {
            return "ErrorInternalServerError";
        }
        if (responseCode == ResponseCode.ERROR_INTERNAL_SERVER_TRANSIENT_ERROR) {
            return "ErrorInternalServerTransientError";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ACCESS_LEVEL) {
            return "ErrorInvalidAccessLevel";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ATTACHMENT_ID) {
            return "ErrorInvalidAttachmentId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ATTACHMENT_SUBFILTER) {
            return "ErrorInvalidAttachmentSubfilter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ATTACHMENT_SUBFILTER_TEXT_FILTER) {
            return "ErrorInvalidAttachmentSubfilterTextFilter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_AUTHORIZATION_CONTEXT) {
            return "ErrorInvalidAuthorizationContext";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CHANGE_KEY) {
            return "ErrorInvalidChangeKey";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CLIENT_SECURITY_CONTEXT) {
            return "ErrorInvalidClientSecurityContext";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_COMPLETE_DATE) {
            return "ErrorInvalidCompleteDate";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CROSS_FOREST_CREDENTIALS) {
            return "ErrorInvalidCrossForestCredentials";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_DELEGATE_PERMISSION) {
            return "ErrorInvalidDelegatePermission";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_DELEGATE_USER_ID) {
            return "ErrorInvalidDelegateUserId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXCHANGE_IMPERSONATION_HEADER_DATA) {
            return "ErrorInvalidExchangeImpersonationHeaderData";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXCLUDES_RESTRICTION) {
            return "ErrorInvalidExcludesRestriction";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXPRESSION_TYPE_FOR_SUB_FILTER) {
            return "ErrorInvalidExpressionTypeForSubFilter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXTENDED_PROPERTY) {
            return "ErrorInvalidExtendedProperty";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXTENDED_PROPERTY_VALUE) {
            return "ErrorInvalidExtendedPropertyValue";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_FOLDER_ID) {
            return "ErrorInvalidFolderId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_FOLDER_TYPE_FOR_OPERATION) {
            return "ErrorInvalidFolderTypeForOperation";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_FRACTIONAL_PAGING_PARAMETERS) {
            return "ErrorInvalidFractionalPagingParameters";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_FREE_BUSY_VIEW_TYPE) {
            return "ErrorInvalidFreeBusyViewType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID) {
            return "ErrorInvalidId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_EMPTY) {
            return "ErrorInvalidIdEmpty";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_MALFORMED) {
            return "ErrorInvalidIdMalformed";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_MALFORMED_EWS_LEGACY_ID_FORMAT) {
            return "ErrorInvalidIdMalformedEwsLegacyIdFormat";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_MONIKER_TOO_LONG) {
            return "ErrorInvalidIdMonikerTooLong";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_NOT_AN_ITEM_ATTACHMENT_ID) {
            return "ErrorInvalidIdNotAnItemAttachmentId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_RETURNED_BY_RESOLVE_NAMES) {
            return "ErrorInvalidIdReturnedByResolveNames";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_STORE_OBJECT_ID_TOO_LONG) {
            return "ErrorInvalidIdStoreObjectIdTooLong";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_TOO_MANY_ATTACHMENT_LEVELS) {
            return "ErrorInvalidIdTooManyAttachmentLevels";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ID_XML) {
            return "ErrorInvalidIdXml";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_INDEXED_PAGING_PARAMETERS) {
            return "ErrorInvalidIndexedPagingParameters";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_INTERNET_HEADER_CHILD_NODES) {
            return "ErrorInvalidInternetHeaderChildNodes";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_ACCEPT_ITEM) {
            return "ErrorInvalidItemForOperationAcceptItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CANCEL_ITEM) {
            return "ErrorInvalidItemForOperationCancelItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM) {
            return "ErrorInvalidItemForOperationCreateItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM_ATTACHMENT) {
            return "ErrorInvalidItemForOperationCreateItemAttachment";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_DECLINE_ITEM) {
            return "ErrorInvalidItemForOperationDeclineItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_EXPAND_DL) {
            return "ErrorInvalidItemForOperationExpandDL";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_REMOVE_ITEM) {
            return "ErrorInvalidItemForOperationRemoveItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_SEND_ITEM) {
            return "ErrorInvalidItemForOperationSendItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_TENTATIVE) {
            return "ErrorInvalidItemForOperationTentative";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MANAGED_FOLDER_PROPERTY) {
            return "ErrorInvalidManagedFolderProperty";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MANAGED_FOLDER_QUOTA) {
            return "ErrorInvalidManagedFolderQuota";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MANAGED_FOLDER_SIZE) {
            return "ErrorInvalidManagedFolderSize";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MERGED_FREE_BUSY_INTERVAL) {
            return "ErrorInvalidMergedFreeBusyInterval";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_NAME_FOR_NAME_RESOLUTION) {
            return "ErrorInvalidNameForNameResolution";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_NETWORK_SERVICE_CONTEXT) {
            return "ErrorInvalidNetworkServiceContext";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_OOF_PARAMETER) {
            return "ErrorInvalidOofParameter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_OPERATION) {
            return "ErrorInvalidOperation";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PAGING_MAX_ROWS) {
            return "ErrorInvalidPagingMaxRows";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PARENT_FOLDER) {
            return "ErrorInvalidParentFolder";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PERCENT_COMPLETE_VALUE) {
            return "ErrorInvalidPercentCompleteValue";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PERMISSION_SETTINGS) {
            return "ErrorInvalidPermissionSettings";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_APPEND) {
            return "ErrorInvalidPropertyAppend";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_DELETE) {
            return "ErrorInvalidPropertyDelete";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_FOR_EXISTS) {
            return "ErrorInvalidPropertyForExists";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_FOR_OPERATION) {
            return "ErrorInvalidPropertyForOperation";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_REQUEST) {
            return "ErrorInvalidPropertyRequest";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_SET) {
            return "ErrorInvalidPropertySet";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROPERTY_UPDATE_SENT_MESSAGE) {
            return "ErrorInvalidPropertyUpdateSentMessage";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PROXY_SECURITY_CONTEXT) {
            return "ErrorInvalidProxySecurityContext";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PULL_SUBSCRIPTION_ID) {
            return "ErrorInvalidPullSubscriptionId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PUSH_SUBSCRIPTION_URL) {
            return "ErrorInvalidPushSubscriptionUrl";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RECIPIENTS) {
            return "ErrorInvalidRecipients";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER) {
            return "ErrorInvalidRecipientSubfilter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_COMPARISON) {
            return "ErrorInvalidRecipientSubfilterComparison";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_ORDER) {
            return "ErrorInvalidRecipientSubfilterOrder";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_TEXT_FILTER) {
            return "ErrorInvalidRecipientSubfilterTextFilter";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_REFERENCE_ITEM) {
            return "ErrorInvalidReferenceItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_REQUEST) {
            return "ErrorInvalidRequest";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RESTRICTION) {
            return "ErrorInvalidRestriction";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ROUTING_TYPE) {
            return "ErrorInvalidRoutingType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SCHEDULED_OOF_DURATION) {
            return "ErrorInvalidScheduledOofDuration";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SECURITY_DESCRIPTOR) {
            return "ErrorInvalidSecurityDescriptor";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SEND_ITEM_SAVE_SETTINGS) {
            return "ErrorInvalidSendItemSaveSettings";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SERIALIZED_ACCESS_TOKEN) {
            return "ErrorInvalidSerializedAccessToken";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SERVER_VERSION) {
            return "ErrorInvalidServerVersion";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SID) {
            return "ErrorInvalidSid";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SMTP_ADDRESS) {
            return "ErrorInvalidSmtpAddress";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SUBFILTER_TYPE) {
            return "ErrorInvalidSubfilterType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SUBFILTER_TYPE_NOT_ATTENDEE_TYPE) {
            return "ErrorInvalidSubfilterTypeNotAttendeeType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SUBFILTER_TYPE_NOT_RECIPIENT_TYPE) {
            return "ErrorInvalidSubfilterTypeNotRecipientType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SUBSCRIPTION) {
            return "ErrorInvalidSubscription";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SUBSCRIPTION_REQUEST) {
            return "ErrorInvalidSubscriptionRequest";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SYNC_STATE_DATA) {
            return "ErrorInvalidSyncStateData";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_TIME_INTERVAL) {
            return "ErrorInvalidTimeInterval";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_USER_INFO) {
            return "ErrorInvalidUserInfo";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_USER_OOF_SETTINGS) {
            return "ErrorInvalidUserOofSettings";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_USER_PRINCIPAL_NAME) {
            return "ErrorInvalidUserPrincipalName";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_USER_SID) {
            return "ErrorInvalidUserSid";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_USER_SID_MISSING_UPN) {
            return "ErrorInvalidUserSidMissingUPN";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_VALUE_FOR_PROPERTY) {
            return "ErrorInvalidValueForProperty";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_WATERMARK) {
            return "ErrorInvalidWatermark";
        }
        if (responseCode == ResponseCode.ERROR_IRRESOLVABLE_CONFLICT) {
            return "ErrorIrresolvableConflict";
        }
        if (responseCode == ResponseCode.ERROR_ITEM_CORRUPT) {
            return "ErrorItemCorrupt";
        }
        if (responseCode == ResponseCode.ERROR_ITEM_NOT_FOUND) {
            return "ErrorItemNotFound";
        }
        if (responseCode == ResponseCode.ERROR_ITEM_PROPERTY_REQUEST_FAILED) {
            return "ErrorItemPropertyRequestFailed";
        }
        if (responseCode == ResponseCode.ERROR_ITEM_SAVE) {
            return "ErrorItemSave";
        }
        if (responseCode == ResponseCode.ERROR_ITEM_SAVE_PROPERTY_ERROR) {
            return "ErrorItemSavePropertyError";
        }
        if (responseCode == ResponseCode.ERROR_LEGACY_MAILBOX_FREE_BUSY_VIEW_TYPE_NOT_MERGED) {
            return "ErrorLegacyMailboxFreeBusyViewTypeNotMerged";
        }
        if (responseCode == ResponseCode.ERROR_LOCAL_SERVER_OBJECT_NOT_FOUND) {
            return "ErrorLocalServerObjectNotFound";
        }
        if (responseCode == ResponseCode.ERROR_LOGON_AS_NETWORK_SERVICE_FAILED) {
            return "ErrorLogonAsNetworkServiceFailed";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_CONFIGURATION) {
            return "ErrorMailboxConfiguration";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_DATA_ARRAY_EMPTY) {
            return "ErrorMailboxDataArrayEmpty";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_DATA_ARRAY_TOO_BIG) {
            return "ErrorMailboxDataArrayTooBig";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_LOGON_FAILED) {
            return "ErrorMailboxLogonFailed";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_MOVE_IN_PROGRESS) {
            return "ErrorMailboxMoveInProgress";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_STORE_UNAVAILABLE) {
            return "ErrorMailboxStoreUnavailable";
        }
        if (responseCode == ResponseCode.ERROR_MAIL_RECIPIENT_NOT_FOUND) {
            return "ErrorMailRecipientNotFound";
        }
        if (responseCode == ResponseCode.ERROR_MANAGED_FOLDER_ALREADY_EXISTS) {
            return "ErrorManagedFolderAlreadyExists";
        }
        if (responseCode == ResponseCode.ERROR_MANAGED_FOLDER_NOT_FOUND) {
            return "ErrorManagedFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_MANAGED_FOLDERS_ROOT_FAILURE) {
            return "ErrorManagedFoldersRootFailure";
        }
        if (responseCode == ResponseCode.ERROR_MEETING_SUGGESTION_GENERATION_FAILED) {
            return "ErrorMeetingSuggestionGenerationFailed";
        }
        if (responseCode == ResponseCode.ERROR_MESSAGE_DISPOSITION_REQUIRED) {
            return "ErrorMessageDispositionRequired";
        }
        if (responseCode == ResponseCode.ERROR_MESSAGE_SIZE_EXCEEDED) {
            return "ErrorMessageSizeExceeded";
        }
        if (responseCode == ResponseCode.ERROR_MIME_CONTENT_CONVERSION_FAILED) {
            return "ErrorMimeContentConversionFailed";
        }
        if (responseCode == ResponseCode.ERROR_MIME_CONTENT_INVALID) {
            return "ErrorMimeContentInvalid";
        }
        if (responseCode == ResponseCode.ERROR_MIME_CONTENT_INVALID_BASE64_STRING) {
            return "ErrorMimeContentInvalidBase64String";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_ARGUMENT) {
            return "ErrorMissingArgument";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_EMAIL_ADDRESS) {
            return "ErrorMissingEmailAddress";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_EMAIL_ADDRESS_FOR_MANAGED_FOLDER) {
            return "ErrorMissingEmailAddressForManagedFolder";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_INFORMATION_EMAIL_ADDRESS) {
            return "ErrorMissingInformationEmailAddress";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_INFORMATION_REFERENCE_ITEM_ID) {
            return "ErrorMissingInformationReferenceItemId";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_ITEM_FOR_CREATE_ITEM_ATTACHMENT) {
            return "ErrorMissingItemForCreateItemAttachment";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_MANAGED_FOLDER_ID) {
            return "ErrorMissingManagedFolderId";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_RECIPIENTS) {
            return "ErrorMissingRecipients";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_USER_ID_INFORMATION) {
            return "ErrorMissingUserIdInformation";
        }
        if (responseCode == ResponseCode.ERROR_MORE_THAN_ONE_ACCESS_MODE_SPECIFIED) {
            return "ErrorMoreThanOneAccessModeSpecified";
        }
        if (responseCode == ResponseCode.ERROR_MOVE_COPY_FAILED) {
            return "ErrorMoveCopyFailed";
        }
        if (responseCode == ResponseCode.ERROR_MOVE_DISTINGUISHED_FOLDER) {
            return "ErrorMoveDistinguishedFolder";
        }
        if (responseCode == ResponseCode.ERROR_NAME_RESOLUTION_MULTIPLE_RESULTS) {
            return "ErrorNameResolutionMultipleResults";
        }
        if (responseCode == ResponseCode.ERROR_NAME_RESOLUTION_NO_MAILBOX) {
            return "ErrorNameResolutionNoMailbox";
        }
        if (responseCode == ResponseCode.ERROR_NAME_RESOLUTION_NO_RESULTS) {
            return "ErrorNameResolutionNoResults";
        }
        if (responseCode == ResponseCode.ERROR_NO_CALENDAR) {
            return "ErrorNoCalendar";
        }
        if (responseCode == ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_KERBEROS_REQUIREMENTS) {
            return "ErrorNoDestinationCASDueToKerberosRequirements";
        }
        if (responseCode == ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_SSLREQUIREMENTS) {
            return "ErrorNoDestinationCASDueToSSLRequirements";
        }
        if (responseCode == ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_VERSION_MISMATCH) {
            return "ErrorNoDestinationCASDueToVersionMismatch";
        }
        if (responseCode == ResponseCode.ERROR_NO_FOLDER_CLASS_OVERRIDE) {
            return "ErrorNoFolderClassOverride";
        }
        if (responseCode == ResponseCode.ERROR_NO_FREE_BUSY_ACCESS) {
            return "ErrorNoFreeBusyAccess";
        }
        if (responseCode == ResponseCode.ERROR_NON_EXISTENT_MAILBOX) {
            return "ErrorNonExistentMailbox";
        }
        if (responseCode == ResponseCode.ERROR_NON_PRIMARY_SMTP_ADDRESS) {
            return "ErrorNonPrimarySmtpAddress";
        }
        if (responseCode == ResponseCode.ERROR_NO_PROPERTY_TAG_FOR_CUSTOM_PROPERTIES) {
            return "ErrorNoPropertyTagForCustomProperties";
        }
        if (responseCode == ResponseCode.ERROR_NO_PUBLIC_FOLDER_REPLICA_AVAILABLE) {
            return "ErrorNoPublicFolderReplicaAvailable";
        }
        if (responseCode == ResponseCode.ERROR_NO_RESPONDING_CASIN_DESTINATION_SITE) {
            return "ErrorNoRespondingCASInDestinationSite";
        }
        if (responseCode == ResponseCode.ERROR_NOT_DELEGATE) {
            return "ErrorNotDelegate";
        }
        if (responseCode == ResponseCode.ERROR_NOT_ENOUGH_MEMORY) {
            return "ErrorNotEnoughMemory";
        }
        if (responseCode == ResponseCode.ERROR_OBJECT_TYPE_CHANGED) {
            return "ErrorObjectTypeChanged";
        }
        if (responseCode == ResponseCode.ERROR_OCCURRENCE_CROSSING_BOUNDARY) {
            return "ErrorOccurrenceCrossingBoundary";
        }
        if (responseCode == ResponseCode.ERROR_OCCURRENCE_TIME_SPAN_TOO_BIG) {
            return "ErrorOccurrenceTimeSpanTooBig";
        }
        if (responseCode == ResponseCode.ERROR_OPERATION_NOT_ALLOWED_WITH_PUBLIC_FOLDER_ROOT) {
            return "ErrorOperationNotAllowedWithPublicFolderRoot";
        }
        if (responseCode == ResponseCode.ERROR_PARENT_FOLDER_ID_REQUIRED) {
            return "ErrorParentFolderIdRequired";
        }
        if (responseCode == ResponseCode.ERROR_PARENT_FOLDER_NOT_FOUND) {
            return "ErrorParentFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_PASSWORD_CHANGE_REQUIRED) {
            return "ErrorPasswordChangeRequired";
        }
        if (responseCode == ResponseCode.ERROR_PASSWORD_EXPIRED) {
            return "ErrorPasswordExpired";
        }
        if (responseCode == ResponseCode.ERROR_PROPERTY_UPDATE) {
            return "ErrorPropertyUpdate";
        }
        if (responseCode == ResponseCode.ERROR_PROPERTY_VALIDATION_FAILURE) {
            return "ErrorPropertyValidationFailure";
        }
        if (responseCode == ResponseCode.ERROR_PROXIED_SUBSCRIPTION_CALL_FAILURE) {
            return "ErrorProxiedSubscriptionCallFailure";
        }
        if (responseCode == ResponseCode.ERROR_PROXY_CALL_FAILED) {
            return "ErrorProxyCallFailed";
        }
        if (responseCode == ResponseCode.ERROR_PROXY_GROUP_SID_LIMIT_EXCEEDED) {
            return "ErrorProxyGroupSidLimitExceeded";
        }
        if (responseCode == ResponseCode.ERROR_PROXY_REQUEST_NOT_ALLOWED) {
            return "ErrorProxyRequestNotAllowed";
        }
        if (responseCode == ResponseCode.ERROR_PROXY_REQUEST_PROCESSING_FAILED) {
            return "ErrorProxyRequestProcessingFailed";
        }
        if (responseCode == ResponseCode.ERROR_PROXY_TOKEN_EXPIRED) {
            return "ErrorProxyTokenExpired";
        }
        if (responseCode == ResponseCode.ERROR_PUBLIC_FOLDER_REQUEST_PROCESSING_FAILED) {
            return "ErrorPublicFolderRequestProcessingFailed";
        }
        if (responseCode == ResponseCode.ERROR_PUBLIC_FOLDER_SERVER_NOT_FOUND) {
            return "ErrorPublicFolderServerNotFound";
        }
        if (responseCode == ResponseCode.ERROR_QUERY_FILTER_TOO_LONG) {
            return "ErrorQueryFilterTooLong";
        }
        if (responseCode == ResponseCode.ERROR_QUOTA_EXCEEDED) {
            return "ErrorQuotaExceeded";
        }
        if (responseCode == ResponseCode.ERROR_READ_EVENTS_FAILED) {
            return "ErrorReadEventsFailed";
        }
        if (responseCode == ResponseCode.ERROR_READ_RECEIPT_NOT_PENDING) {
            return "ErrorReadReceiptNotPending";
        }
        if (responseCode == ResponseCode.ERROR_RECURRENCE_END_DATE_TOO_BIG) {
            return "ErrorRecurrenceEndDateTooBig";
        }
        if (responseCode == ResponseCode.ERROR_RECURRENCE_HAS_NO_OCCURRENCE) {
            return "ErrorRecurrenceHasNoOccurrence";
        }
        if (responseCode == ResponseCode.ERROR_REMOVE_DELEGATES_FAILED) {
            return "ErrorRemoveDelegatesFailed";
        }
        if (responseCode == ResponseCode.ERROR_REQUEST_ABORTED) {
            return "ErrorRequestAborted";
        }
        if (responseCode == ResponseCode.ERROR_REQUEST_STREAM_TOO_BIG) {
            return "ErrorRequestStreamTooBig";
        }
        if (responseCode == ResponseCode.ERROR_REQUIRED_PROPERTY_MISSING) {
            return "ErrorRequiredPropertyMissing";
        }
        if (responseCode == ResponseCode.ERROR_RESOLVE_NAMES_INVALID_FOLDER_TYPE) {
            return "ErrorResolveNamesInvalidFolderType";
        }
        if (responseCode == ResponseCode.ERROR_RESOLVE_NAMES_ONLY_ONE_CONTACTS_FOLDER_ALLOWED) {
            return "ErrorResolveNamesOnlyOneContactsFolderAllowed";
        }
        if (responseCode == ResponseCode.ERROR_RESPONSE_SCHEMA_VALIDATION) {
            return "ErrorResponseSchemaValidation";
        }
        if (responseCode == ResponseCode.ERROR_RESTRICTION_TOO_COMPLEX) {
            return "ErrorRestrictionTooComplex";
        }
        if (responseCode == ResponseCode.ERROR_RESTRICTION_TOO_LONG) {
            return "ErrorRestrictionTooLong";
        }
        if (responseCode == ResponseCode.ERROR_RESULT_SET_TOO_BIG) {
            return "ErrorResultSetTooBig";
        }
        if (responseCode == ResponseCode.ERROR_SAVED_ITEM_FOLDER_NOT_FOUND) {
            return "ErrorSavedItemFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_SCHEMA_VALIDATION) {
            return "ErrorSchemaValidation";
        }
        if (responseCode == ResponseCode.ERROR_SEARCH_FOLDER_NOT_INITIALIZED) {
            return "ErrorSearchFolderNotInitialized";
        }
        if (responseCode == ResponseCode.ERROR_SEND_AS_DENIED) {
            return "ErrorSendAsDenied";
        }
        if (responseCode == ResponseCode.ERROR_SEND_MEETING_CANCELLATIONS_REQUIRED) {
            return "ErrorSendMeetingCancellationsRequired";
        }
        if (responseCode == ResponseCode.ERROR_SEND_MEETING_INVITATIONS_OR_CANCELLATIONS_REQUIRED) {
            return "ErrorSendMeetingInvitationsOrCancellationsRequired";
        }
        if (responseCode == ResponseCode.ERROR_SEND_MEETING_INVITATIONS_REQUIRED) {
            return "ErrorSendMeetingInvitationsRequired";
        }
        if (responseCode == ResponseCode.ERROR_SENT_MEETING_REQUEST_UPDATE) {
            return "ErrorSentMeetingRequestUpdate";
        }
        if (responseCode == ResponseCode.ERROR_SENT_TASK_REQUEST_UPDATE) {
            return "ErrorSentTaskRequestUpdate";
        }
        if (responseCode == ResponseCode.ERROR_SERVER_BUSY) {
            return "ErrorServerBusy";
        }
        if (responseCode == ResponseCode.ERROR_SERVICE_DISCOVERY_FAILED) {
            return "ErrorServiceDiscoveryFailed";
        }
        if (responseCode == ResponseCode.ERROR_STALE_OBJECT) {
            return "ErrorStaleObject";
        }
        if (responseCode == ResponseCode.ERROR_SUBSCRIPTION_ACCESS_DENIED) {
            return "ErrorSubscriptionAccessDenied";
        }
        if (responseCode == ResponseCode.ERROR_SUBSCRIPTION_DELEGATE_ACCESS_NOT_SUPPORTED) {
            return "ErrorSubscriptionDelegateAccessNotSupported";
        }
        if (responseCode == ResponseCode.ERROR_SUBSCRIPTION_NOT_FOUND) {
            return "ErrorSubscriptionNotFound";
        }
        if (responseCode == ResponseCode.ERROR_SYNC_FOLDER_NOT_FOUND) {
            return "ErrorSyncFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_TIME_INTERVAL_TOO_BIG) {
            return "ErrorTimeIntervalTooBig";
        }
        if (responseCode == ResponseCode.ERROR_TIMEOUT_EXPIRED) {
            return "ErrorTimeoutExpired";
        }
        if (responseCode == ResponseCode.ERROR_TO_FOLDER_NOT_FOUND) {
            return "ErrorToFolderNotFound";
        }
        if (responseCode == ResponseCode.ERROR_TOKEN_SERIALIZATION_DENIED) {
            return "ErrorTokenSerializationDenied";
        }
        if (responseCode == ResponseCode.ERROR_UNABLE_TO_GET_USER_OOF_SETTINGS) {
            return "ErrorUnableToGetUserOofSettings";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_CULTURE) {
            return "ErrorUnsupportedCulture";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_MAPI_PROPERTY_TYPE) {
            return "ErrorUnsupportedMapiPropertyType";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_MIME_CONVERSION) {
            return "ErrorUnsupportedMimeConversion";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_PATH_FOR_QUERY) {
            return "ErrorUnsupportedPathForQuery";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_PATH_FOR_SORT_GROUP) {
            return "ErrorUnsupportedPathForSortGroup";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_PROPERTY_DEFINITION) {
            return "ErrorUnsupportedPropertyDefinition";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_QUERY_FILTER) {
            return "ErrorUnsupportedQueryFilter";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_RECURRENCE) {
            return "ErrorUnsupportedRecurrence";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_SUB_FILTER) {
            return "ErrorUnsupportedSubFilter";
        }
        if (responseCode == ResponseCode.ERROR_UNSUPPORTED_TYPE_FOR_CONVERSION) {
            return "ErrorUnsupportedTypeForConversion";
        }
        if (responseCode == ResponseCode.ERROR_UPDATE_DELEGATES_FAILED) {
            return "ErrorUpdateDelegatesFailed";
        }
        if (responseCode == ResponseCode.ERROR_UPDATE_PROPERTY_MISMATCH) {
            return "ErrorUpdatePropertyMismatch";
        }
        if (responseCode == ResponseCode.ERROR_VIRUS_DETECTED) {
            return "ErrorVirusDetected";
        }
        if (responseCode == ResponseCode.ERROR_VIRUS_MESSAGE_DELETED) {
            return "ErrorVirusMessageDeleted";
        }
        if (responseCode == ResponseCode.ERROR_VOICE_MAIL_NOT_IMPLEMENTED) {
            return "ErrorVoiceMailNotImplemented";
        }
        if (responseCode == ResponseCode.ERROR_WEB_REQUEST_IN_INVALID_STATE) {
            return "ErrorWebRequestInInvalidState";
        }
        if (responseCode == ResponseCode.ERROR_WIN32_INTEROP_ERROR) {
            return "ErrorWin32InteropError";
        }
        if (responseCode == ResponseCode.ERROR_WORKING_HOURS_SAVE_FAILED) {
            return "ErrorWorkingHoursSaveFailed";
        }
        if (responseCode == ResponseCode.ERROR_WORKING_HOURS_XML_MALFORMED) {
            return "ErrorWorkingHoursXmlMalformed";
        }
        if (responseCode == ResponseCode.ERROR_ARCHIVE_FOLDER_PATH_CREATION) {
            return "ErrorArchiveFolderPathCreation";
        }
        if (responseCode == ResponseCode.ERROR_ARCHIVE_MAILBOX_NOT_ENABLED) {
            return "ErrorArchiveMailboxNotEnabled";
        }
        if (responseCode == ResponseCode.ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED) {
            return "ErrorArchiveMailboxServiceDiscoveryFailed";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_ACCEPT) {
            return "ErrorCalendarIsCancelledForAccept";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_DECLINE) {
            return "ErrorCalendarIsCancelledForDecline";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_REMOVE) {
            return "ErrorCalendarIsCancelledForRemove";
        }
        if (responseCode == ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_TENTATIVE) {
            return "ErrorCalendarIsCancelledForTentative";
        }
        if (responseCode == ResponseCode.ERROR_CALLER_IS_INVALID_AD_ACCOUNT) {
            return "ErrorCallerIsInvalidADAccount";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_ARCHIVE_CALENDAR_CONTACT_TASK_FOLDER_EXCEPTION) {
            return "ErrorCannotArchiveCalendarContactTaskFolderException";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_ARCHIVE_ITEMS_IN_PUBLIC_FOLDERS) {
            return "ErrorCannotArchiveItemsInPublicFolders";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_ARCHIVE_ITEMS_IN_ARCHIVE_MAILBOX) {
            return "ErrorCannotArchiveItemsInArchiveMailbox";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_DISABLE_MANDATORY_EXTENSION) {
            return "ErrorCannotDisableMandatoryExtension";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_GET_SOURCE_FOLDER_PATH) {
            return "ErrorCannotGetSourceFolderPath";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_GET_EXTERNAL_ECP_URL) {
            return "ErrorCannotGetExternalEcpUrl";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_EMPTY_FOLDER) {
            return "ErrorCannotEmptyFolder";
        }
        if (responseCode == ResponseCode.ERROR_CANNOT_SPECIFY_SEARCH_FOLDER_AS_SOURCE_FOLDER) {
            return "ErrorCannotSpecifySearchFolderAsSourceFolder";
        }
        if (responseCode == ResponseCode.ERROR_CLIENT_DISCONNECTED) {
            return "ErrorClientDisconnected";
        }
        if (responseCode == ResponseCode.ERROR_CLIENT_INTENT_INVALID_STATE_DEFINITION) {
            return "ErrorClientIntentInvalidStateDefinition";
        }
        if (responseCode == ResponseCode.ERROR_CLIENT_INTENT_NO_FOUND) {
            return "ErrorClientIntentNotFound";
        }
        if (responseCode == ResponseCode.ERROR_CONTAINS_FILTER_WRONG_TYPE) {
            return "ErrorContainsFilterWrongType";
        }
        if (responseCode == ResponseCode.ERROR_CONTENT_INDEXING_NOT_ENABLED) {
            return "ErrorContentIndexingNotEnabled";
        }
        if (responseCode == ResponseCode.ERROR_CROSS_SITE_REQUEST) {
            return "ErrorCrossSiteRequest";
        }
        if (responseCode == ResponseCode.ERROR_DELETE_UNIFIED_MESSAGING_PROMPT_FAILED) {
            return "ErrorDeleteUnifiedMessagingPromptFailed";
        }
        if (responseCode == ResponseCode.ERROR_DISTRIBUTION_LIST_MEMBER_NOT_EXIST) {
            return "ErrorDistributionListMemberNotExist";
        }
        if (responseCode == ResponseCode.ERROR_EXCEEDED_CONNECTION_COUNT) {
            return "ErrorExceededConnectionCount";
        }
        if (responseCode == ResponseCode.ERROR_EXCEEDED_SUBSCRIPTION_COUNT) {
            return "ErrorExceededSubscriptionCount";
        }
        if (responseCode == ResponseCode.ERROR_EXCEEDED_FIND_COUNT_LIMIT) {
            return "ErrorExceededFindCountLimit";
        }
        if (responseCode == ResponseCode.ERROR_EXTENSION_NOT_FOUND) {
            return "ErrorExtensionNotFound";
        }
        if (responseCode == ResponseCode.ERROR_IM_CONTACT_LIMIT_REACHED) {
            return "ErrorImContactLimitReached";
        }
        if (responseCode == ResponseCode.ERROR_IM_GROUP_DISPLAY_NAME_ALREADY_EXISTS) {
            return "ErrorImGroupDisplayNameAlreadyExists";
        }
        if (responseCode == ResponseCode.ERROR_IM_GROUP_LIMIT_REACHED) {
            return "ErrorImGroupLimitReached";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ARGUMENT) {
            return "ErrorInvalidArgument";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CONTACT_EMAIL_ADDRESS) {
            return "ErrorInvalidContactEmailAddress";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CONTACT_EMAIL_INDEX) {
            return "ErrorInvalidContactEmailIndex";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_IM_CONTACT_ID) {
            return "ErrorInvalidImContactId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_IM_DISTRIBUTION_GROUP_SMTP_ADDRESS) {
            return "ErrorInvalidImDistributionGroupSmtpAddress";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_IM_GROUP_ID) {
            return "ErrorInvalidImGroupId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_ARCHIVE_ITEM) {
            return "ErrorInvalidItemForOperationArchiveItem";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_LOGON_TYPE) {
            return "ErrorInvalidLogonType";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MAILBOX) {
            return "ErrorInvalidMailbox";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PHONE_CALL_ID) {
            return "ErrorInvalidPhoneCallId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PHONE_NUMBER) {
            return "ErrorInvalidPhoneNumber";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RETENTION_TAG_TYPE_MISMATCH) {
            return "ErrorInvalidRetentionTagTypeMismatch";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RETENTION_TAG_INVISIBLE) {
            return "ErrorInvalidRetentionTagInvisible";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RETENTION_TAG_INHERITANCE) {
            return "ErrorInvalidRetentionTagInheritance";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RETENTION_TAG_ID_GUID) {
            return "ErrorInvalidRetentionTagIdGuid";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SIP_URI) {
            return "ErrorInvalidSIPUri";
        }
        if (responseCode == ResponseCode.ERROR_IP_GATEWAY_NO_FOUND) {
            return "ErrorIPGatewayNotFound";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_HOLD_NOT_FOUND) {
            return "ErrorMailboxHoldNotFound";
        }
        if (responseCode == ResponseCode.ERROR_MAIL_TIPS_DISABLED) {
            return "ErrorMailTipsDisabled";
        }
        if (responseCode == ResponseCode.ERROR_MULTI_LEGACY_MAILBOX_ACCESS) {
            return "ErrorMultiLegacyMailboxAccess";
        }
        if (responseCode == ResponseCode.ERROR_NO_PUBLIC_FOLDER_SERVER_AVAILABLE) {
            return "ErrorNoPublicFolderServerAvailable";
        }
        if (responseCode == ResponseCode.ERROR_PHONE_NUMBER_NOT_DIALABLE) {
            return "ErrorPhoneNumberNotDialable";
        }
        if (responseCode == ResponseCode.ERROR_PROMPT_PUBLISHING_OPERATION_FAILED) {
            return "ErrorPromptPublishingOperationFailed";
        }
        if (responseCode == ResponseCode.ERROR_PUBLIC_FOLDER_MAILBOX_DISCOVERY_FAILED) {
            return "ErrorPublicFolderMailboxDiscoveryFailed";
        }
        if (responseCode == ResponseCode.ERROR_PUBLIC_FOLDER_OPERATION_FAILED) {
            return "ErrorPublicFolderOperationFailed";
        }
        if (responseCode == ResponseCode.ERROR_PUBLIC_FOLDER_SYNC_EXCEPTION) {
            return "ErrorPublicFolderSyncException";
        }
        if (responseCode == ResponseCode.ERROR_SUBMISSION_QUOTA_EXCEEDED) {
            return "ErrorSubmissionQuotaExceeded";
        }
        if (responseCode == ResponseCode.ERROR_SUBSCRIPTION_UNSUBSCRIBED) {
            return "ErrorSubscriptionUnsubscribed";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_NOT_FOUND) {
            return "ErrorTeamMailboxNotFound";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_NOT_LINKED_TO_SHARE_POINT) {
            return "ErrorTeamMailboxNotLinkedToSharePoint";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_URL_VALIDATION_FAILED) {
            return "ErrorTeamMailboxUrlValidationFailed";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_NOT_AUTHORIZED_OWNER) {
            return "ErrorTeamMailboxNotAuthorizedOwner";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_ACTIVE_TO_PENDING_DELETE) {
            return "ErrorTeamMailboxActiveToPendingDelete";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_FAILED_SENDING_NOTIFICATIONS) {
            return "ErrorTeamMailboxFailedSendingNotifications";
        }
        if (responseCode == ResponseCode.ERROR_TEAM_MAILBOX_ERROR_UNKNOWN) {
            return "ErrorTeamMailboxErrorUnknown";
        }
        if (responseCode == ResponseCode.ERROR_UNIFIED_MESSAGING_DIAL_PLAN_NOT_FOUND) {
            return "ErrorUnifiedMessagingDialPlanNotFound";
        }
        if (responseCode == ResponseCode.ERROR_UNIFIED_MESSAGING_REPORT_DATA_NOT_FOUND) {
            return "ErrorUnifiedMessagingReportDataNotFound";
        }
        if (responseCode == ResponseCode.ERROR_UNIFIED_MESSAGING_PROMPT_NOT_FOUND) {
            return "ErrorUnifiedMessagingPromptNotFound";
        }
        if (responseCode == ResponseCode.ERROR_UNIFIED_MESSAGING_REQUEST_FAILED) {
            return "ErrorUnifiedMessagingRequestFailed";
        }
        if (responseCode == ResponseCode.ERROR_UNIFIED_MESSAGING_SERVER_NOT_FOUND) {
            return "ErrorUnifiedMessagingServerNotFound";
        }
        if (responseCode == ResponseCode.ERROR_UNABLE_TO_REMOVE_IM_CONTACT_FROM_GROUP) {
            return "ErrorUnableToRemoveImContactFromGroup";
        }
        if (responseCode == ResponseCode.ERROR_USER_NOT_UNIFIED_MESSAGING_ENABLED) {
            return "ErrorUserNotUnifiedMessagingEnabled";
        }
        if (responseCode == ResponseCode.ERROR_VALUE_OUT_OF_RANGE) {
            return "ErrorValueOutOfRange";
        }
        if (responseCode == ResponseCode.ERROR_WRONG_SERVER_VERSION) {
            return "ErrorWrongServerVersion";
        }
        if (responseCode == ResponseCode.ERROR_WRONG_SERVER_VERSION_DELEGATE) {
            return "ErrorWrongServerVersionDelegate";
        }
        if (responseCode == ResponseCode.ERROR_MISSING_INFORMATION_SHARING_FOLDER_ID) {
            return "ErrorMissingInformationSharingFolderId";
        }
        if (responseCode == ResponseCode.ERROR_DUPLICATE_SOAP_HEADER) {
            return "ErrorDuplicateSOAPHeader";
        }
        if (responseCode == ResponseCode.ERROR_SHARING_SYNCHRONIZATION_FAILED) {
            return "ErrorSharingSynchronizationFailed";
        }
        if (responseCode == ResponseCode.ERROR_SHARING_NO_EXTERNAL_EWS_AVAILABLE) {
            return "ErrorSharingNoExternalEwsAvailable";
        }
        if (responseCode == ResponseCode.ERROR_FREE_BUSY_DL_LIMIT_REACHED) {
            return "ErrorFreeBusyDLLimitReached";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_GET_SHARING_FOLDER_REQUEST) {
            return "ErrorInvalidGetSharingFolderRequest";
        }
        if (responseCode == ResponseCode.ERROR_NOT_ALLOWED_EXTERNAL_SHARING_BY_POLICY) {
            return "ErrorNotAllowedExternalSharingByPolicy";
        }
        if (responseCode == ResponseCode.ERROR_USER_NOT_ALLOWED_BY_POLICY) {
            return "ErrorUserNotAllowedByPolicy";
        }
        if (responseCode == ResponseCode.ERROR_PERMISSION_NOT_ALLOWED_BY_POLICY) {
            return "ErrorPermissionNotAllowedByPolicy";
        }
        if (responseCode == ResponseCode.ERROR_ORGANIZATIONAL_NOT_FEDERATED) {
            return "ErrorOrganizationNotFederated";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_FAILOVER) {
            return "ErrorMailboxFailover";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXTERNAL_SHARING_INITIATOR) {
            return "ErrorInvalidExternalSharingInitiator";
        }
        if (responseCode == ResponseCode.ERROR_MESSAGE_TRACKING_PERMANENT_ERROR) {
            return "ErrorMessageTrackingPermanentError";
        }
        if (responseCode == ResponseCode.ERROR_MESSAGE_TRACKING_TRANSIENT_ERROR) {
            return "ErrorMessageTrackingTransientError";
        }
        if (responseCode == ResponseCode.ERROR_MESSAGE_TRACKING_NO_SUCH_DOMAIN) {
            return "ErrorMessageTrackingNoSuchDomain";
        }
        if (responseCode == ResponseCode.ERROR_USER_WITHOUT_FEDERATED_PROXY_ADDRESS) {
            return "ErrorUserWithoutFederatedProxyAddress";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_ORGANIZATION_RELATIONSHIP_FOR_FREE_BUSY) {
            return "ErrorInvalidOrganizationRelationshipForFreeBusy";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_FEDERATED_ORGANIZATION_ID) {
            return "ErrorInvalidFederatedOrganizationId";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_EXTERNAL_SHARING_INITIATOR) {
            return "ErrorInvalidExternalSharingSubscriber";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SHARING_DATA) {
            return "ErrorInvalidSharingData";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_SHARING_MESSAGE) {
            return "ErrorInvalidSharingMessage";
        }
        if (responseCode == ResponseCode.ERROR_NOT_SUPPORTED_SHARING_MESSAGE) {
            return "ErrorNotSupportedSharingMessage";
        }
        if (responseCode == ResponseCode.ERROR_APPLY_CONVERSATION_ACTION_FAILED) {
            return "ErrorApplyConversationActionFailed";
        }
        if (responseCode == ResponseCode.ERROR_INBOX_RULES_VALIDATION_ERROR) {
            return "ErrorInboxRulesValidationError";
        }
        if (responseCode == ResponseCode.ERROR_OUTLOOK_RULE_BLOB_EXISTS) {
            return "ErrorOutlookRuleBlobExists";
        }
        if (responseCode == ResponseCode.ERROR_RULES_OVER_QUOTA) {
            return "ErrorRulesOverQuota";
        }
        if (responseCode == ResponseCode.ERROR_NEW_EVENT_STREAM_CONNECTION_OPENED) {
            return "ErrorNewEventStreamConnectionOpened";
        }
        if (responseCode == ResponseCode.ERROR_MISSED_NOTIFICATION_EVENTS) {
            return "ErrorMissedNotificationEvents";
        }
        if (responseCode == ResponseCode.ERROR_DUPLICATE_LEGACY_DISTINGUISHED_NAME) {
            return "ErrorDuplicateLegacyDistinguishedName";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_CLIENT_ACCESS_TOKEN_REQUEST) {
            return "ErrorInvalidClientAccessTokenRequest";
        }
        if (responseCode == ResponseCode.ERROR_NO_SPEECH_DETECTED) {
            return "ErrorNoSpeechDetected";
        }
        if (responseCode == ResponseCode.ERROR_UM_SERVER_UNAVAILABLE) {
            return "ErrorUMServerUnavailable";
        }
        if (responseCode == ResponseCode.ERROR_RECIPIENT_NOT_FOUND) {
            return "ErrorRecipientNotFound";
        }
        if (responseCode == ResponseCode.ERROR_RECOGNIZER_NOT_INSTALLED) {
            return "ErrorRecognizerNotInstalled";
        }
        if (responseCode == ResponseCode.ERROR_SPEECH_GRAMMAR_ERROR) {
            return "ErrorSpeechGrammarError";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_MANAGEMENT_ROLE_HEADER) {
            return "ErrorInvalidManagementRoleHeader";
        }
        if (responseCode == ResponseCode.ERROR_LOCATION_SERVICES_DISABLED) {
            return "ErrorLocationServicesDisabled";
        }
        if (responseCode == ResponseCode.ERROR_LOCATION_SERVICES_REQUEST_TIMED_OUT) {
            return "ErrorLocationServicesRequestTimedOut";
        }
        if (responseCode == ResponseCode.ERROR_LOCATION_SERVICES_REQUEST_FAILED) {
            return "ErrorLocationServicesRequestFailed";
        }
        if (responseCode == ResponseCode.ERROR_LOCATION_SERVICES_INVALID_REQUEST) {
            return "ErrorLocationServicesInvalidRequest";
        }
        if (responseCode == ResponseCode.ERROR_MAILBOX_SCOPE_NOT_ALLOWED_WITHOUT_QUERY_STRING) {
            return "ErrorMailboxScopeNotAllowedWithoutQueryString";
        }
        if (responseCode == ResponseCode.ERROR_ARCHIVE_MAILBOX_SEARCH_FAILED) {
            return "ErrorArchiveMailboxSearchFailed";
        }
        if (responseCode == ResponseCode.ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED) {
            return "ErrorArchiveMailboxServiceDiscoveryFailed";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_PHOTO_SIZE) {
            return "ErrorInvalidPhotoSize";
        }
        if (responseCode == ResponseCode.ERROR_SEARCH_QUERY_HAS_TOO_MANY_KEYWORDS) {
            return "ErrorSearchQueryHasTooManyKeywords";
        }
        if (responseCode == ResponseCode.ERROR_SEARCH_TOO_MANY_MAILBOXES) {
            return "ErrorSearchTooManyMailboxes";
        }
        if (responseCode == ResponseCode.ERROR_INVALID_RETENTION_TAG_NONE) {
            return "ErrorInvalidRetentionTagNone";
        }
        return "ErrorDiscoverySearchesDisabled";
    }
    
    static ResponseCode S(final String s) {
        if (s.equals("NoError")) {
            return ResponseCode.NO_ERROR;
        }
        if (s.equals("ErrorAccessDenied")) {
            return ResponseCode.ERROR_ACCESS_DENIED;
        }
        if (s.equals("ErrorAccessModeSpecified")) {
            return ResponseCode.ERROR_ACCESS_MODE_SPECIFIED;
        }
        if (s.equals("ErrorAccountDisabled")) {
            return ResponseCode.ERROR_ACCOUNT_DISABLED;
        }
        if (s.equals("ErrorAddDelegatesFailed")) {
            return ResponseCode.ERROR_ADD_DELEGATES_FAILED;
        }
        if (s.equals("ErrorAddressSpaceNotFound")) {
            return ResponseCode.ERROR_ADDRESS_SPACE_NOT_FOUND;
        }
        if (s.equals("ErrorADOperation")) {
            return ResponseCode.ERROR_ADOPERATION;
        }
        if (s.equals("ErrorADSessionFilter")) {
            return ResponseCode.ERROR_ADSESSION_FILTER;
        }
        if (s.equals("ErrorADUnavailable")) {
            return ResponseCode.ERROR_ADUNAVAILABLE;
        }
        if (s.equals("ErrorAffectedTaskOccurrencesRequired")) {
            return ResponseCode.ERROR_AFFECTED_TASK_OCCURRENCES_REQUIRED;
        }
        if (s.equals("ErrorAttachmentNestLevelLimitExceeded")) {
            return ResponseCode.ERROR_ATTACHMENT_NEST_LEVEL_LIMIT_EXCEEDED;
        }
        if (s.equals("ErrorAttachmentSizeLimitExceeded")) {
            return ResponseCode.ERROR_ATTACHMENT_SIZE_LIMIT_EXCEEDED;
        }
        if (s.equals("ErrorAutoDiscoverFailed")) {
            return ResponseCode.ERROR_AUTO_DISCOVER_FAILED;
        }
        if (s.equals("ErrorAvailabilityConfigNotFound")) {
            return ResponseCode.ERROR_AVAILABILITY_CONFIG_NOT_FOUND;
        }
        if (s.equals("ErrorBatchProcessingStopped")) {
            return ResponseCode.ERROR_BATCH_PROCESSING_STOPPED;
        }
        if (s.equals("ErrorCalendarCannotMoveOrCopyOccurrence")) {
            return ResponseCode.ERROR_CALENDAR_CANNOT_MOVE_OR_COPY_OCCURRENCE;
        }
        if (s.equals("ErrorCalendarCannotUpdateDeletedItem")) {
            return ResponseCode.ERROR_CALENDAR_CANNOT_UPDATE_DELETED_ITEM;
        }
        if (s.equals("ErrorCalendarCannotUseIdForOccurrenceId")) {
            return ResponseCode.ERROR_CALENDAR_CANNOT_USE_ID_FOR_OCCURRENCE_ID;
        }
        if (s.equals("ErrorCalendarCannotUseIdForRecurringMasterId")) {
            return ResponseCode.ERROR_CALENDAR_CANNOT_USE_ID_FOR_RECURRING_MASTER_ID;
        }
        if (s.equals("ErrorCalendarDurationIsTooLong")) {
            return ResponseCode.ERROR_CALENDAR_DURATION_IS_TOO_LONG;
        }
        if (s.equals("ErrorCalendarEndDateIsEarlierThanStartDate")) {
            return ResponseCode.ERROR_CALENDAR_END_DATE_IS_EARLIER_THAN_START_DATE;
        }
        if (s.equals("ErrorCalendarFolderIsInvalidForCalendarView")) {
            return ResponseCode.ERROR_CALENDAR_FOLDER_IS_INVALID_FOR_CALENDAR_VIEW;
        }
        if (s.equals("ErrorCalendarInvalidAttributeValue")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_ATTRIBUTE_VALUE;
        }
        if (s.equals("ErrorCalendarInvalidDayForTimeChangePattern")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_DAY_FOR_TIME_CHANGE_PATTERN;
        }
        if (s.equals("ErrorCalendarInvalidDayForWeeklyRecurrence")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_DAY_FOR_WEEKLY_RECURRENCE;
        }
        if (s.equals("ErrorCalendarInvalidPropertyState")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_PROPERTY_STATE;
        }
        if (s.equals("ErrorCalendarInvalidPropertyValue")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_PROPERTY_VALUE;
        }
        if (s.equals("ErrorCalendarInvalidRecurrence")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_RECURRENCE;
        }
        if (s.equals("ErrorCalendarInvalidTimeZone")) {
            return ResponseCode.ERROR_CALENDAR_INVALID_TIME_ZONE;
        }
        if (s.equals("ErrorCalendarIsDelegatedForAccept")) {
            return ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_ACCEPT;
        }
        if (s.equals("ErrorCalendarIsDelegatedForDecline")) {
            return ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_DECLINE;
        }
        if (s.equals("ErrorCalendarIsDelegatedForRemove")) {
            return ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_REMOVE;
        }
        if (s.equals("ErrorCalendarIsDelegatedForTentative")) {
            return ResponseCode.ERROR_CALENDAR_IS_DELEGATED_FOR_TENTATIVE;
        }
        if (s.equals("ErrorCalendarIsNotOrganizer")) {
            return ResponseCode.ERROR_CALENDAR_IS_NOT_ORGANIZER;
        }
        if (s.equals("ErrorCalendarIsOrganizerForAccept")) {
            return ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_ACCEPT;
        }
        if (s.equals("ErrorCalendarIsOrganizerForDecline")) {
            return ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_DECLINE;
        }
        if (s.equals("ErrorCalendarIsOrganizerForRemove")) {
            return ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_REMOVE;
        }
        if (s.equals("ErrorCalendarIsOrganizerForTentative")) {
            return ResponseCode.ERROR_CALENDAR_IS_ORGANIZER_FOR_TENTATIVE;
        }
        if (s.equals("ErrorCalendarMeetingRequestIsOutOfDate")) {
            return ResponseCode.ERROR_CALENDAR_MEETING_REQUEST_IS_OUT_OF_DATE;
        }
        if (s.equals("ErrorCalendarOccurrenceIndexIsOutOfRecurrenceRange")) {
            return ResponseCode.ERROR_CALENDAR_OCCURRENCE_INDEX_IS_OUT_OF_RECURRENCE_RANGE;
        }
        if (s.equals("ErrorCalendarOccurrenceIsDeletedFromRecurrence")) {
            return ResponseCode.ERROR_CALENDAR_OCCURRENCE_IS_DELETED_FROM_RECURRENCE;
        }
        if (s.equals("ErrorCalendarOutOfRange")) {
            return ResponseCode.ERROR_CALENDAR_OUT_OF_RANGE;
        }
        if (s.equals("ErrorCalendarViewRangeTooBig")) {
            return ResponseCode.ERROR_CALENDAR_VIEW_RANGE_TOO_BIG;
        }
        if (s.equals("ErrorCannotCreateCalendarItemInNonCalendarFolder")) {
            return ResponseCode.ERROR_CANNOT_CREATE_CALENDAR_ITEM_IN_NON_CALENDAR_FOLDER;
        }
        if (s.equals("ErrorCannotCreateContactInNonContactFolder")) {
            return ResponseCode.ERROR_CANNOT_CREATE_CONTACT_IN_NON_CONTACT_FOLDER;
        }
        if (s.equals("ErrorCannotCreatePostItemInNonMailFolder")) {
            return ResponseCode.ERROR_CANNOT_CREATE_POST_ITEM_IN_NON_MAIL_FOLDER;
        }
        if (s.equals("ErrorCannotCreateTaskInNonTaskFolder")) {
            return ResponseCode.ERROR_CANNOT_CREATE_TASK_IN_NON_TASK_FOLDER;
        }
        if (s.equals("ErrorCannotDeleteObject")) {
            return ResponseCode.ERROR_CANNOT_DELETE_OBJECT;
        }
        if (s.equals("ErrorCannotDeleteTaskOccurrence")) {
            return ResponseCode.ERROR_CANNOT_DELETE_TASK_OCCURRENCE;
        }
        if (s.equals("ErrorCannotOpenFileAttachment")) {
            return ResponseCode.ERROR_CANNOT_OPEN_FILE_ATTACHMENT;
        }
        if (s.equals("ErrorCannotSetCalendarPermissionOnNonCalendarFolder")) {
            return ResponseCode.ERROR_CANNOT_SET_CALENDAR_PERMISSION_ON_NON_CALENDAR_FOLDER;
        }
        if (s.equals("ErrorCannotSetNonCalendarPermissionOnCalendarFolder")) {
            return ResponseCode.ERROR_CANNOT_SET_NON_CALENDAR_PERMISSION_ON_CALENDAR_FOLDER;
        }
        if (s.equals("ErrorCannotSetPermissionUnknownEntries")) {
            return ResponseCode.ERROR_CANNOT_SET_PERMISSION_UNKNOWN_ENTRIES;
        }
        if (s.equals("ErrorCannotUseFolderIdForItemId")) {
            return ResponseCode.ERROR_CANNOT_USE_FOLDER_ID_FOR_ITEM_ID;
        }
        if (s.equals("ErrorCannotUseItemIdForFolderId")) {
            return ResponseCode.ERROR_CANNOT_USE_ITEM_ID_FOR_FOLDER_ID;
        }
        if (s.equals("ErrorChangeKeyRequired")) {
            return ResponseCode.ERROR_CHANGE_KEY_REQUIRED;
        }
        if (s.equals("ErrorChangeKeyRequiredForWriteOperations")) {
            return ResponseCode.ERROR_CHANGE_KEY_REQUIRED_FOR_WRITE_OPERATIONS;
        }
        if (s.equals("ErrorConnectionFailed")) {
            return ResponseCode.ERROR_CONNECTION_FAILED;
        }
        if (s.equals("ErrorContentConversionFailed")) {
            return ResponseCode.ERROR_CONTENT_CONVERSION_FAILED;
        }
        if (s.equals("ErrorCorruptData")) {
            return ResponseCode.ERROR_CORRUPT_DATA;
        }
        if (s.equals("ErrorCreateItemAccessDenied")) {
            return ResponseCode.ERROR_CREATE_ITEM_ACCESS_DENIED;
        }
        if (s.equals("ErrorCreateManagedFolderPartialCompletion")) {
            return ResponseCode.ERROR_CREATE_MANAGED_FOLDER_PARTIAL_COMPLETION;
        }
        if (s.equals("ErrorCreateSubfolderAccessDenied")) {
            return ResponseCode.ERROR_CREATE_SUBFOLDER_ACCESS_DENIED;
        }
        if (s.equals("ErrorCrossMailboxMoveCopy")) {
            return ResponseCode.ERROR_CROSS_MAILBOX_MOVE_COPY;
        }
        if (s.equals("ErrorDataSizeLimitExceeded")) {
            return ResponseCode.ERROR_DATA_SIZE_LIMIT_EXCEEDED;
        }
        if (s.equals("ErrorDataSourceOperation")) {
            return ResponseCode.ERROR_DATA_SOURCE_OPERATION;
        }
        if (s.equals("ErrorDelegateAlreadyExists")) {
            return ResponseCode.ERROR_DELEGATE_ALREADY_EXISTS;
        }
        if (s.equals("ErrorDelegateCannotAddOwner")) {
            return ResponseCode.ERROR_DELEGATE_CANNOT_ADD_OWNER;
        }
        if (s.equals("ErrorDelegateMissingConfiguration")) {
            return ResponseCode.ERROR_DELEGATE_MISSING_CONFIGURATION;
        }
        if (s.equals("ErrorDelegateNoUser")) {
            return ResponseCode.ERROR_DELEGATE_NO_USER;
        }
        if (s.equals("ErrorDelegateValidationFailed")) {
            return ResponseCode.ERROR_DELEGATE_VALIDATION_FAILED;
        }
        if (s.equals("ErrorDeleteDistinguishedFolder")) {
            return ResponseCode.ERROR_DELETE_DISTINGUISHED_FOLDER;
        }
        if (s.equals("ErrorDeleteItemsFailed")) {
            return ResponseCode.ERROR_DELETE_ITEMS_FAILED;
        }
        if (s.equals("ErrorDistinguishedUserNotSupported")) {
            return ResponseCode.ERROR_DISTINGUISHED_USER_NOT_SUPPORTED;
        }
        if (s.equals("ErrorDuplicateInputFolderNames")) {
            return ResponseCode.ERROR_DUPLICATE_INPUT_FOLDER_NAMES;
        }
        if (s.equals("ErrorDuplicateUserIdsSpecified")) {
            return ResponseCode.ERROR_DUPLICATE_USER_IDS_SPECIFIED;
        }
        if (s.equals("ErrorEmailAddressMismatch")) {
            return ResponseCode.ERROR_EMAIL_ADDRESS_MISMATCH;
        }
        if (s.equals("ErrorEventNotFound")) {
            return ResponseCode.ERROR_EVENT_NOT_FOUND;
        }
        if (s.equals("ErrorExpiredSubscription")) {
            return ResponseCode.ERROR_EXPIRED_SUBSCRIPTION;
        }
        if (s.equals("ErrorFolderCorrupt")) {
            return ResponseCode.ERROR_FOLDER_CORRUPT;
        }
        if (s.equals("ErrorFolderExists")) {
            return ResponseCode.ERROR_FOLDER_EXISTS;
        }
        if (s.equals("ErrorFolderNotFound")) {
            return ResponseCode.ERROR_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorFolderPropertRequestFailed")) {
            return ResponseCode.ERROR_FOLDER_PROPERT_REQUEST_FAILED;
        }
        if (s.equals("ErrorFolderSave")) {
            return ResponseCode.ERROR_FOLDER_SAVE;
        }
        if (s.equals("ErrorFolderSaveFailed")) {
            return ResponseCode.ERROR_FOLDER_SAVE_FAILED;
        }
        if (s.equals("ErrorFolderSavePropertyError")) {
            return ResponseCode.ERROR_FOLDER_SAVE_PROPERTY_ERROR;
        }
        if (s.equals("ErrorFreeBusyGenerationFailed")) {
            return ResponseCode.ERROR_FREE_BUSY_GENERATION_FAILED;
        }
        if (s.equals("ErrorGetServerSecurityDescriptorFailed")) {
            return ResponseCode.ERROR_GET_SERVER_SECURITY_DESCRIPTOR_FAILED;
        }
        if (s.equals("ErrorImpersonateUserDenied")) {
            return ResponseCode.ERROR_IMPERSONATE_USER_DENIED;
        }
        if (s.equals("ErrorImpersonationDenied")) {
            return ResponseCode.ERROR_IMPERSONATION_DENIED;
        }
        if (s.equals("ErrorImpersonationFailed")) {
            return ResponseCode.ERROR_IMPERSONATION_FAILED;
        }
        if (s.equals("ErrorIncorrectSchemaVersion")) {
            return ResponseCode.ERROR_INCORRECT_SCHEMA_VERSION;
        }
        if (s.equals("ErrorIncorrectUpdatePropertyCount")) {
            return ResponseCode.ERROR_INCORRECT_UPDATE_PROPERTY_COUNT;
        }
        if (s.equals("ErrorIndividualMailboxLimitReached")) {
            return ResponseCode.ERROR_INDIVIDUAL_MAILBOX_LIMIT_REACHED;
        }
        if (s.equals("ErrorInsufficientResources")) {
            return ResponseCode.ERROR_INSUFFICIENT_RESOURCES;
        }
        if (s.equals("ErrorInternalServerError")) {
            return ResponseCode.ERROR_INTERNAL_SERVER_ERROR;
        }
        if (s.equals("ErrorInternalServerTransientError")) {
            return ResponseCode.ERROR_INTERNAL_SERVER_TRANSIENT_ERROR;
        }
        if (s.equals("ErrorInvalidAccessLevel")) {
            return ResponseCode.ERROR_INVALID_ACCESS_LEVEL;
        }
        if (s.equals("ErrorInvalidAttachmentId")) {
            return ResponseCode.ERROR_INVALID_ATTACHMENT_ID;
        }
        if (s.equals("ErrorInvalidAttachmentSubfilter")) {
            return ResponseCode.ERROR_INVALID_ATTACHMENT_SUBFILTER;
        }
        if (s.equals("ErrorInvalidAttachmentSubfilterTextFilter")) {
            return ResponseCode.ERROR_INVALID_ATTACHMENT_SUBFILTER_TEXT_FILTER;
        }
        if (s.equals("ErrorInvalidAuthorizationContext")) {
            return ResponseCode.ERROR_INVALID_AUTHORIZATION_CONTEXT;
        }
        if (s.equals("ErrorInvalidChangeKey")) {
            return ResponseCode.ERROR_INVALID_CHANGE_KEY;
        }
        if (s.equals("ErrorInvalidClientSecurityContext")) {
            return ResponseCode.ERROR_INVALID_CLIENT_SECURITY_CONTEXT;
        }
        if (s.equals("ErrorInvalidCompleteDate")) {
            return ResponseCode.ERROR_INVALID_COMPLETE_DATE;
        }
        if (s.equals("ErrorInvalidCrossForestCredentials")) {
            return ResponseCode.ERROR_INVALID_CROSS_FOREST_CREDENTIALS;
        }
        if (s.equals("ErrorInvalidDelegatePermission")) {
            return ResponseCode.ERROR_INVALID_DELEGATE_PERMISSION;
        }
        if (s.equals("ErrorInvalidDelegateUserId")) {
            return ResponseCode.ERROR_INVALID_DELEGATE_USER_ID;
        }
        if (s.equals("ErrorInvalidExchangeImpersonationHeaderData")) {
            return ResponseCode.ERROR_INVALID_EXCHANGE_IMPERSONATION_HEADER_DATA;
        }
        if (s.equals("ErrorInvalidExcludesRestriction")) {
            return ResponseCode.ERROR_INVALID_EXCLUDES_RESTRICTION;
        }
        if (s.equals("ErrorInvalidExpressionTypeForSubFilter")) {
            return ResponseCode.ERROR_INVALID_EXPRESSION_TYPE_FOR_SUB_FILTER;
        }
        if (s.equals("ErrorInvalidExtendedProperty")) {
            return ResponseCode.ERROR_INVALID_EXTENDED_PROPERTY;
        }
        if (s.equals("ErrorInvalidExtendedPropertyValue")) {
            return ResponseCode.ERROR_INVALID_EXTENDED_PROPERTY_VALUE;
        }
        if (s.equals("ErrorInvalidFolderId")) {
            return ResponseCode.ERROR_INVALID_FOLDER_ID;
        }
        if (s.equals("ErrorInvalidFolderTypeForOperation")) {
            return ResponseCode.ERROR_INVALID_FOLDER_TYPE_FOR_OPERATION;
        }
        if (s.equals("ErrorInvalidFractionalPagingParameters")) {
            return ResponseCode.ERROR_INVALID_FRACTIONAL_PAGING_PARAMETERS;
        }
        if (s.equals("ErrorInvalidFreeBusyViewType")) {
            return ResponseCode.ERROR_INVALID_FREE_BUSY_VIEW_TYPE;
        }
        if (s.equals("ErrorInvalidId")) {
            return ResponseCode.ERROR_INVALID_ID;
        }
        if (s.equals("ErrorInvalidIdEmpty")) {
            return ResponseCode.ERROR_INVALID_ID_EMPTY;
        }
        if (s.equals("ErrorInvalidIdMalformed")) {
            return ResponseCode.ERROR_INVALID_ID_MALFORMED;
        }
        if (s.equals("ErrorInvalidIdMalformedEwsLegacyIdFormat")) {
            return ResponseCode.ERROR_INVALID_ID_MALFORMED_EWS_LEGACY_ID_FORMAT;
        }
        if (s.equals("ErrorInvalidIdMonikerTooLong")) {
            return ResponseCode.ERROR_INVALID_ID_MONIKER_TOO_LONG;
        }
        if (s.equals("ErrorInvalidIdNotAnItemAttachmentId")) {
            return ResponseCode.ERROR_INVALID_ID_NOT_AN_ITEM_ATTACHMENT_ID;
        }
        if (s.equals("ErrorInvalidIdReturnedByResolveNames")) {
            return ResponseCode.ERROR_INVALID_ID_RETURNED_BY_RESOLVE_NAMES;
        }
        if (s.equals("ErrorInvalidIdStoreObjectIdTooLong")) {
            return ResponseCode.ERROR_INVALID_ID_STORE_OBJECT_ID_TOO_LONG;
        }
        if (s.equals("ErrorInvalidIdTooManyAttachmentLevels")) {
            return ResponseCode.ERROR_INVALID_ID_TOO_MANY_ATTACHMENT_LEVELS;
        }
        if (s.equals("ErrorInvalidIdXml")) {
            return ResponseCode.ERROR_INVALID_ID_XML;
        }
        if (s.equals("ErrorInvalidIndexedPagingParameters")) {
            return ResponseCode.ERROR_INVALID_INDEXED_PAGING_PARAMETERS;
        }
        if (s.equals("ErrorInvalidInternetHeaderChildNodes")) {
            return ResponseCode.ERROR_INVALID_INTERNET_HEADER_CHILD_NODES;
        }
        if (s.equals("ErrorInvalidItemForOperationAcceptItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_ACCEPT_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationCancelItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CANCEL_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationCreateItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationCreateItemAttachment")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM_ATTACHMENT;
        }
        if (s.equals("ErrorInvalidItemForOperationDeclineItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_DECLINE_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationExpandDL")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_EXPAND_DL;
        }
        if (s.equals("ErrorInvalidItemForOperationRemoveItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_REMOVE_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationSendItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_SEND_ITEM;
        }
        if (s.equals("ErrorInvalidItemForOperationTentative")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_TENTATIVE;
        }
        if (s.equals("ErrorInvalidManagedFolderProperty")) {
            return ResponseCode.ERROR_INVALID_MANAGED_FOLDER_PROPERTY;
        }
        if (s.equals("ErrorInvalidManagedFolderQuota")) {
            return ResponseCode.ERROR_INVALID_MANAGED_FOLDER_QUOTA;
        }
        if (s.equals("ErrorInvalidManagedFolderSize")) {
            return ResponseCode.ERROR_INVALID_MANAGED_FOLDER_SIZE;
        }
        if (s.equals("ErrorInvalidMergedFreeBusyInterval")) {
            return ResponseCode.ERROR_INVALID_MERGED_FREE_BUSY_INTERVAL;
        }
        if (s.equals("ErrorInvalidNameForNameResolution")) {
            return ResponseCode.ERROR_INVALID_NAME_FOR_NAME_RESOLUTION;
        }
        if (s.equals("ErrorInvalidNetworkServiceContext")) {
            return ResponseCode.ERROR_INVALID_NETWORK_SERVICE_CONTEXT;
        }
        if (s.equals("ErrorInvalidOofParameter")) {
            return ResponseCode.ERROR_INVALID_OOF_PARAMETER;
        }
        if (s.equals("ErrorInvalidOperation")) {
            return ResponseCode.ERROR_INVALID_OPERATION;
        }
        if (s.equals("ErrorInvalidPagingMaxRows")) {
            return ResponseCode.ERROR_INVALID_PAGING_MAX_ROWS;
        }
        if (s.equals("ErrorInvalidParentFolder")) {
            return ResponseCode.ERROR_INVALID_PARENT_FOLDER;
        }
        if (s.equals("ErrorInvalidPercentCompleteValue")) {
            return ResponseCode.ERROR_INVALID_PERCENT_COMPLETE_VALUE;
        }
        if (s.equals("ErrorInvalidPermissionSettings")) {
            return ResponseCode.ERROR_INVALID_PERMISSION_SETTINGS;
        }
        if (s.equals("ErrorInvalidPropertyAppend")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_APPEND;
        }
        if (s.equals("ErrorInvalidPropertyDelete")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_DELETE;
        }
        if (s.equals("ErrorInvalidPropertyForExists")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_FOR_EXISTS;
        }
        if (s.equals("ErrorInvalidPropertyForOperation")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_FOR_OPERATION;
        }
        if (s.equals("ErrorInvalidPropertyRequest")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_REQUEST;
        }
        if (s.equals("ErrorInvalidPropertySet")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_SET;
        }
        if (s.equals("ErrorInvalidPropertyUpdateSentMessage")) {
            return ResponseCode.ERROR_INVALID_PROPERTY_UPDATE_SENT_MESSAGE;
        }
        if (s.equals("ErrorInvalidProxySecurityContext")) {
            return ResponseCode.ERROR_INVALID_PROXY_SECURITY_CONTEXT;
        }
        if (s.equals("ErrorInvalidPullSubscriptionId")) {
            return ResponseCode.ERROR_INVALID_PULL_SUBSCRIPTION_ID;
        }
        if (s.equals("ErrorInvalidPushSubscriptionUrl")) {
            return ResponseCode.ERROR_INVALID_PUSH_SUBSCRIPTION_URL;
        }
        if (s.equals("ErrorInvalidRecipients")) {
            return ResponseCode.ERROR_INVALID_RECIPIENTS;
        }
        if (s.equals("ErrorInvalidRecipientSubfilter")) {
            return ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER;
        }
        if (s.equals("ErrorInvalidRecipientSubfilterComparison")) {
            return ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_COMPARISON;
        }
        if (s.equals("ErrorInvalidRecipientSubfilterOrder")) {
            return ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_ORDER;
        }
        if (s.equals("ErrorInvalidRecipientSubfilterTextFilter")) {
            return ResponseCode.ERROR_INVALID_RECIPIENT_SUBFILTER_TEXT_FILTER;
        }
        if (s.equals("ErrorInvalidReferenceItem")) {
            return ResponseCode.ERROR_INVALID_REFERENCE_ITEM;
        }
        if (s.equals("ErrorInvalidRequest")) {
            return ResponseCode.ERROR_INVALID_REQUEST;
        }
        if (s.equals("ErrorInvalidRestriction")) {
            return ResponseCode.ERROR_INVALID_RESTRICTION;
        }
        if (s.equals("ErrorInvalidRoutingType")) {
            return ResponseCode.ERROR_INVALID_ROUTING_TYPE;
        }
        if (s.equals("ErrorInvalidScheduledOofDuration")) {
            return ResponseCode.ERROR_INVALID_SCHEDULED_OOF_DURATION;
        }
        if (s.equals("ErrorInvalidSecurityDescriptor")) {
            return ResponseCode.ERROR_INVALID_SECURITY_DESCRIPTOR;
        }
        if (s.equals("ErrorInvalidSendItemSaveSettings")) {
            return ResponseCode.ERROR_INVALID_SEND_ITEM_SAVE_SETTINGS;
        }
        if (s.equals("ErrorInvalidSerializedAccessToken")) {
            return ResponseCode.ERROR_INVALID_SERIALIZED_ACCESS_TOKEN;
        }
        if (s.equals("ErrorInvalidServerVersion")) {
            return ResponseCode.ERROR_INVALID_SERVER_VERSION;
        }
        if (s.equals("ErrorInvalidSid")) {
            return ResponseCode.ERROR_INVALID_SID;
        }
        if (s.equals("ErrorInvalidSmtpAddress")) {
            return ResponseCode.ERROR_INVALID_SMTP_ADDRESS;
        }
        if (s.equals("ErrorInvalidSubfilterType")) {
            return ResponseCode.ERROR_INVALID_SUBFILTER_TYPE;
        }
        if (s.equals("ErrorInvalidSubfilterTypeNotAttendeeType")) {
            return ResponseCode.ERROR_INVALID_SUBFILTER_TYPE_NOT_ATTENDEE_TYPE;
        }
        if (s.equals("ErrorInvalidSubfilterTypeNotRecipientType")) {
            return ResponseCode.ERROR_INVALID_SUBFILTER_TYPE_NOT_RECIPIENT_TYPE;
        }
        if (s.equals("ErrorInvalidSubscription")) {
            return ResponseCode.ERROR_INVALID_SUBSCRIPTION;
        }
        if (s.equals("ErrorInvalidSubscriptionRequest")) {
            return ResponseCode.ERROR_INVALID_SUBSCRIPTION_REQUEST;
        }
        if (s.equals("ErrorInvalidSyncStateData")) {
            return ResponseCode.ERROR_INVALID_SYNC_STATE_DATA;
        }
        if (s.equals("ErrorInvalidTimeInterval")) {
            return ResponseCode.ERROR_INVALID_TIME_INTERVAL;
        }
        if (s.equals("ErrorInvalidUserInfo")) {
            return ResponseCode.ERROR_INVALID_USER_INFO;
        }
        if (s.equals("ErrorInvalidUserOofSettings")) {
            return ResponseCode.ERROR_INVALID_USER_OOF_SETTINGS;
        }
        if (s.equals("ErrorInvalidUserPrincipalName")) {
            return ResponseCode.ERROR_INVALID_USER_PRINCIPAL_NAME;
        }
        if (s.equals("ErrorInvalidUserSid")) {
            return ResponseCode.ERROR_INVALID_USER_SID;
        }
        if (s.equals("ErrorInvalidUserSidMissingUPN")) {
            return ResponseCode.ERROR_INVALID_USER_SID_MISSING_UPN;
        }
        if (s.equals("ErrorInvalidValueForProperty")) {
            return ResponseCode.ERROR_INVALID_VALUE_FOR_PROPERTY;
        }
        if (s.equals("ErrorInvalidWatermark")) {
            return ResponseCode.ERROR_INVALID_WATERMARK;
        }
        if (s.equals("ErrorIrresolvableConflict")) {
            return ResponseCode.ERROR_IRRESOLVABLE_CONFLICT;
        }
        if (s.equals("ErrorItemCorrupt")) {
            return ResponseCode.ERROR_ITEM_CORRUPT;
        }
        if (s.equals("ErrorItemNotFound")) {
            return ResponseCode.ERROR_ITEM_NOT_FOUND;
        }
        if (s.equals("ErrorItemPropertyRequestFailed")) {
            return ResponseCode.ERROR_ITEM_PROPERTY_REQUEST_FAILED;
        }
        if (s.equals("ErrorItemSave")) {
            return ResponseCode.ERROR_ITEM_SAVE;
        }
        if (s.equals("ErrorItemSavePropertyError")) {
            return ResponseCode.ERROR_ITEM_SAVE_PROPERTY_ERROR;
        }
        if (s.equals("ErrorLegacyMailboxFreeBusyViewTypeNotMerged")) {
            return ResponseCode.ERROR_LEGACY_MAILBOX_FREE_BUSY_VIEW_TYPE_NOT_MERGED;
        }
        if (s.equals("ErrorLocalServerObjectNotFound")) {
            return ResponseCode.ERROR_LOCAL_SERVER_OBJECT_NOT_FOUND;
        }
        if (s.equals("ErrorLogonAsNetworkServiceFailed")) {
            return ResponseCode.ERROR_LOGON_AS_NETWORK_SERVICE_FAILED;
        }
        if (s.equals("ErrorMailboxConfiguration")) {
            return ResponseCode.ERROR_MAILBOX_CONFIGURATION;
        }
        if (s.equals("ErrorMailboxDataArrayEmpty")) {
            return ResponseCode.ERROR_MAILBOX_DATA_ARRAY_EMPTY;
        }
        if (s.equals("ErrorMailboxDataArrayTooBig")) {
            return ResponseCode.ERROR_MAILBOX_DATA_ARRAY_TOO_BIG;
        }
        if (s.equals("ErrorMailboxLogonFailed")) {
            return ResponseCode.ERROR_MAILBOX_LOGON_FAILED;
        }
        if (s.equals("ErrorMailboxMoveInProgress")) {
            return ResponseCode.ERROR_MAILBOX_MOVE_IN_PROGRESS;
        }
        if (s.equals("ErrorMailboxStoreUnavailable")) {
            return ResponseCode.ERROR_MAILBOX_STORE_UNAVAILABLE;
        }
        if (s.equals("ErrorMailRecipientNotFound")) {
            return ResponseCode.ERROR_MAIL_RECIPIENT_NOT_FOUND;
        }
        if (s.equals("ErrorManagedFolderAlreadyExists")) {
            return ResponseCode.ERROR_MANAGED_FOLDER_ALREADY_EXISTS;
        }
        if (s.equals("ErrorManagedFolderNotFound")) {
            return ResponseCode.ERROR_MANAGED_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorManagedFoldersRootFailure")) {
            return ResponseCode.ERROR_MANAGED_FOLDERS_ROOT_FAILURE;
        }
        if (s.equals("ErrorMeetingSuggestionGenerationFailed")) {
            return ResponseCode.ERROR_MEETING_SUGGESTION_GENERATION_FAILED;
        }
        if (s.equals("ErrorMessageDispositionRequired")) {
            return ResponseCode.ERROR_MESSAGE_DISPOSITION_REQUIRED;
        }
        if (s.equals("ErrorMessageSizeExceeded")) {
            return ResponseCode.ERROR_MESSAGE_SIZE_EXCEEDED;
        }
        if (s.equals("ErrorMimeContentConversionFailed")) {
            return ResponseCode.ERROR_MIME_CONTENT_CONVERSION_FAILED;
        }
        if (s.equals("ErrorMimeContentInvalid")) {
            return ResponseCode.ERROR_MIME_CONTENT_INVALID;
        }
        if (s.equals("ErrorMimeContentInvalidBase64String")) {
            return ResponseCode.ERROR_MIME_CONTENT_INVALID_BASE64_STRING;
        }
        if (s.equals("ErrorMissingArgument")) {
            return ResponseCode.ERROR_MISSING_ARGUMENT;
        }
        if (s.equals("ErrorMissingEmailAddress")) {
            return ResponseCode.ERROR_MISSING_EMAIL_ADDRESS;
        }
        if (s.equals("ErrorMissingEmailAddressForManagedFolder")) {
            return ResponseCode.ERROR_MISSING_EMAIL_ADDRESS_FOR_MANAGED_FOLDER;
        }
        if (s.equals("ErrorMissingInformationEmailAddress")) {
            return ResponseCode.ERROR_MISSING_INFORMATION_EMAIL_ADDRESS;
        }
        if (s.equals("ErrorMissingInformationReferenceItemId")) {
            return ResponseCode.ERROR_MISSING_INFORMATION_REFERENCE_ITEM_ID;
        }
        if (s.equals("ErrorMissingItemForCreateItemAttachment")) {
            return ResponseCode.ERROR_MISSING_ITEM_FOR_CREATE_ITEM_ATTACHMENT;
        }
        if (s.equals("ErrorMissingManagedFolderId")) {
            return ResponseCode.ERROR_MISSING_MANAGED_FOLDER_ID;
        }
        if (s.equals("ErrorMissingRecipients")) {
            return ResponseCode.ERROR_MISSING_RECIPIENTS;
        }
        if (s.equals("ErrorMissingUserIdInformation")) {
            return ResponseCode.ERROR_MISSING_USER_ID_INFORMATION;
        }
        if (s.equals("ErrorMoreThanOneAccessModeSpecified")) {
            return ResponseCode.ERROR_MORE_THAN_ONE_ACCESS_MODE_SPECIFIED;
        }
        if (s.equals("ErrorMoveCopyFailed")) {
            return ResponseCode.ERROR_MOVE_COPY_FAILED;
        }
        if (s.equals("ErrorMoveDistinguishedFolder")) {
            return ResponseCode.ERROR_MOVE_DISTINGUISHED_FOLDER;
        }
        if (s.equals("ErrorNameResolutionMultipleResults")) {
            return ResponseCode.ERROR_NAME_RESOLUTION_MULTIPLE_RESULTS;
        }
        if (s.equals("ErrorNameResolutionNoMailbox")) {
            return ResponseCode.ERROR_NAME_RESOLUTION_NO_MAILBOX;
        }
        if (s.equals("ErrorNameResolutionNoResults")) {
            return ResponseCode.ERROR_NAME_RESOLUTION_NO_RESULTS;
        }
        if (s.equals("ErrorNoCalendar")) {
            return ResponseCode.ERROR_NO_CALENDAR;
        }
        if (s.equals("ErrorNoDestinationCASDueToKerberosRequirements")) {
            return ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_KERBEROS_REQUIREMENTS;
        }
        if (s.equals("ErrorNoDestinationCASDueToSSLRequirements")) {
            return ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_SSLREQUIREMENTS;
        }
        if (s.equals("ErrorNoDestinationCASDueToVersionMismatch")) {
            return ResponseCode.ERROR_NO_DESTINATION_CASDUE_TO_VERSION_MISMATCH;
        }
        if (s.equals("ErrorNoFolderClassOverride")) {
            return ResponseCode.ERROR_NO_FOLDER_CLASS_OVERRIDE;
        }
        if (s.equals("ErrorNoFreeBusyAccess")) {
            return ResponseCode.ERROR_NO_FREE_BUSY_ACCESS;
        }
        if (s.equals("ErrorNonExistentMailbox")) {
            return ResponseCode.ERROR_NON_EXISTENT_MAILBOX;
        }
        if (s.equals("ErrorNonPrimarySmtpAddress")) {
            return ResponseCode.ERROR_NON_PRIMARY_SMTP_ADDRESS;
        }
        if (s.equals("ErrorNoPropertyTagForCustomProperties")) {
            return ResponseCode.ERROR_NO_PROPERTY_TAG_FOR_CUSTOM_PROPERTIES;
        }
        if (s.equals("ErrorNoPublicFolderReplicaAvailable")) {
            return ResponseCode.ERROR_NO_PUBLIC_FOLDER_REPLICA_AVAILABLE;
        }
        if (s.equals("ErrorNoRespondingCASInDestinationSite")) {
            return ResponseCode.ERROR_NO_RESPONDING_CASIN_DESTINATION_SITE;
        }
        if (s.equals("ErrorNotDelegate")) {
            return ResponseCode.ERROR_NOT_DELEGATE;
        }
        if (s.equals("ErrorNotEnoughMemory")) {
            return ResponseCode.ERROR_NOT_ENOUGH_MEMORY;
        }
        if (s.equals("ErrorObjectTypeChanged")) {
            return ResponseCode.ERROR_OBJECT_TYPE_CHANGED;
        }
        if (s.equals("ErrorOccurrenceCrossingBoundary")) {
            return ResponseCode.ERROR_OCCURRENCE_CROSSING_BOUNDARY;
        }
        if (s.equals("ErrorOccurrenceTimeSpanTooBig")) {
            return ResponseCode.ERROR_OCCURRENCE_TIME_SPAN_TOO_BIG;
        }
        if (s.equals("ErrorOperationNotAllowedWithPublicFolderRoot")) {
            return ResponseCode.ERROR_OPERATION_NOT_ALLOWED_WITH_PUBLIC_FOLDER_ROOT;
        }
        if (s.equals("ErrorParentFolderIdRequired")) {
            return ResponseCode.ERROR_PARENT_FOLDER_ID_REQUIRED;
        }
        if (s.equals("ErrorParentFolderNotFound")) {
            return ResponseCode.ERROR_PARENT_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorPasswordChangeRequired")) {
            return ResponseCode.ERROR_PASSWORD_CHANGE_REQUIRED;
        }
        if (s.equals("ErrorPasswordExpired")) {
            return ResponseCode.ERROR_PASSWORD_EXPIRED;
        }
        if (s.equals("ErrorPropertyUpdate")) {
            return ResponseCode.ERROR_PROPERTY_UPDATE;
        }
        if (s.equals("ErrorPropertyValidationFailure")) {
            return ResponseCode.ERROR_PROPERTY_VALIDATION_FAILURE;
        }
        if (s.equals("ErrorProxiedSubscriptionCallFailure")) {
            return ResponseCode.ERROR_PROXIED_SUBSCRIPTION_CALL_FAILURE;
        }
        if (s.equals("ErrorProxyCallFailed")) {
            return ResponseCode.ERROR_PROXY_CALL_FAILED;
        }
        if (s.equals("ErrorProxyGroupSidLimitExceeded")) {
            return ResponseCode.ERROR_PROXY_GROUP_SID_LIMIT_EXCEEDED;
        }
        if (s.equals("ErrorProxyRequestNotAllowed")) {
            return ResponseCode.ERROR_PROXY_REQUEST_NOT_ALLOWED;
        }
        if (s.equals("ErrorProxyRequestProcessingFailed")) {
            return ResponseCode.ERROR_PROXY_REQUEST_PROCESSING_FAILED;
        }
        if (s.equals("ErrorProxyTokenExpired")) {
            return ResponseCode.ERROR_PROXY_TOKEN_EXPIRED;
        }
        if (s.equals("ErrorPublicFolderRequestProcessingFailed")) {
            return ResponseCode.ERROR_PUBLIC_FOLDER_REQUEST_PROCESSING_FAILED;
        }
        if (s.equals("ErrorPublicFolderServerNotFound")) {
            return ResponseCode.ERROR_PUBLIC_FOLDER_SERVER_NOT_FOUND;
        }
        if (s.equals("ErrorQueryFilterTooLong")) {
            return ResponseCode.ERROR_QUERY_FILTER_TOO_LONG;
        }
        if (s.equals("ErrorQuotaExceeded")) {
            return ResponseCode.ERROR_QUOTA_EXCEEDED;
        }
        if (s.equals("ErrorReadEventsFailed")) {
            return ResponseCode.ERROR_READ_EVENTS_FAILED;
        }
        if (s.equals("ErrorReadReceiptNotPending")) {
            return ResponseCode.ERROR_READ_RECEIPT_NOT_PENDING;
        }
        if (s.equals("ErrorRecurrenceEndDateTooBig")) {
            return ResponseCode.ERROR_RECURRENCE_END_DATE_TOO_BIG;
        }
        if (s.equals("ErrorRecurrenceHasNoOccurrence")) {
            return ResponseCode.ERROR_RECURRENCE_HAS_NO_OCCURRENCE;
        }
        if (s.equals("ErrorRemoveDelegatesFailed")) {
            return ResponseCode.ERROR_REMOVE_DELEGATES_FAILED;
        }
        if (s.equals("ErrorRequestAborted")) {
            return ResponseCode.ERROR_REQUEST_ABORTED;
        }
        if (s.equals("ErrorRequestStreamTooBig")) {
            return ResponseCode.ERROR_REQUEST_STREAM_TOO_BIG;
        }
        if (s.equals("ErrorRequiredPropertyMissing")) {
            return ResponseCode.ERROR_REQUIRED_PROPERTY_MISSING;
        }
        if (s.equals("ErrorResolveNamesInvalidFolderType")) {
            return ResponseCode.ERROR_RESOLVE_NAMES_INVALID_FOLDER_TYPE;
        }
        if (s.equals("ErrorResolveNamesOnlyOneContactsFolderAllowed")) {
            return ResponseCode.ERROR_RESOLVE_NAMES_ONLY_ONE_CONTACTS_FOLDER_ALLOWED;
        }
        if (s.equals("ErrorResponseSchemaValidation")) {
            return ResponseCode.ERROR_RESPONSE_SCHEMA_VALIDATION;
        }
        if (s.equals("ErrorRestrictionTooComplex")) {
            return ResponseCode.ERROR_RESTRICTION_TOO_COMPLEX;
        }
        if (s.equals("ErrorRestrictionTooLong")) {
            return ResponseCode.ERROR_RESTRICTION_TOO_LONG;
        }
        if (s.equals("ErrorResultSetTooBig")) {
            return ResponseCode.ERROR_RESULT_SET_TOO_BIG;
        }
        if (s.equals("ErrorSavedItemFolderNotFound")) {
            return ResponseCode.ERROR_SAVED_ITEM_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorSchemaValidation")) {
            return ResponseCode.ERROR_SCHEMA_VALIDATION;
        }
        if (s.equals("ErrorSearchFolderNotInitialized")) {
            return ResponseCode.ERROR_SEARCH_FOLDER_NOT_INITIALIZED;
        }
        if (s.equals("ErrorSendAsDenied")) {
            return ResponseCode.ERROR_SEND_AS_DENIED;
        }
        if (s.equals("ErrorSendMeetingCancellationsRequired")) {
            return ResponseCode.ERROR_SEND_MEETING_CANCELLATIONS_REQUIRED;
        }
        if (s.equals("ErrorSendMeetingInvitationsOrCancellationsRequired")) {
            return ResponseCode.ERROR_SEND_MEETING_INVITATIONS_OR_CANCELLATIONS_REQUIRED;
        }
        if (s.equals("ErrorSendMeetingInvitationsRequired")) {
            return ResponseCode.ERROR_SEND_MEETING_INVITATIONS_REQUIRED;
        }
        if (s.equals("ErrorSentMeetingRequestUpdate")) {
            return ResponseCode.ERROR_SENT_MEETING_REQUEST_UPDATE;
        }
        if (s.equals("ErrorSentTaskRequestUpdate")) {
            return ResponseCode.ERROR_SENT_TASK_REQUEST_UPDATE;
        }
        if (s.equals("ErrorServerBusy")) {
            return ResponseCode.ERROR_SERVER_BUSY;
        }
        if (s.equals("ErrorServiceDiscoveryFailed")) {
            return ResponseCode.ERROR_SERVICE_DISCOVERY_FAILED;
        }
        if (s.equals("ErrorStaleObject")) {
            return ResponseCode.ERROR_STALE_OBJECT;
        }
        if (s.equals("ErrorSubscriptionAccessDenied")) {
            return ResponseCode.ERROR_SUBSCRIPTION_ACCESS_DENIED;
        }
        if (s.equals("ErrorSubscriptionDelegateAccessNotSupported")) {
            return ResponseCode.ERROR_SUBSCRIPTION_DELEGATE_ACCESS_NOT_SUPPORTED;
        }
        if (s.equals("ErrorSubscriptionNotFound")) {
            return ResponseCode.ERROR_SUBSCRIPTION_NOT_FOUND;
        }
        if (s.equals("ErrorSyncFolderNotFound")) {
            return ResponseCode.ERROR_SYNC_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorTimeIntervalTooBig")) {
            return ResponseCode.ERROR_TIME_INTERVAL_TOO_BIG;
        }
        if (s.equals("ErrorTimeoutExpired")) {
            return ResponseCode.ERROR_TIMEOUT_EXPIRED;
        }
        if (s.equals("ErrorToFolderNotFound")) {
            return ResponseCode.ERROR_TO_FOLDER_NOT_FOUND;
        }
        if (s.equals("ErrorTokenSerializationDenied")) {
            return ResponseCode.ERROR_TOKEN_SERIALIZATION_DENIED;
        }
        if (s.equals("ErrorUnableToGetUserOofSettings")) {
            return ResponseCode.ERROR_UNABLE_TO_GET_USER_OOF_SETTINGS;
        }
        if (s.equals("ErrorUnsupportedCulture")) {
            return ResponseCode.ERROR_UNSUPPORTED_CULTURE;
        }
        if (s.equals("ErrorUnsupportedMapiPropertyType")) {
            return ResponseCode.ERROR_UNSUPPORTED_MAPI_PROPERTY_TYPE;
        }
        if (s.equals("ErrorUnsupportedMimeConversion")) {
            return ResponseCode.ERROR_UNSUPPORTED_MIME_CONVERSION;
        }
        if (s.equals("ErrorUnsupportedPathForQuery")) {
            return ResponseCode.ERROR_UNSUPPORTED_PATH_FOR_QUERY;
        }
        if (s.equals("ErrorUnsupportedPathForSortGroup")) {
            return ResponseCode.ERROR_UNSUPPORTED_PATH_FOR_SORT_GROUP;
        }
        if (s.equals("ErrorUnsupportedPropertyDefinition")) {
            return ResponseCode.ERROR_UNSUPPORTED_PROPERTY_DEFINITION;
        }
        if (s.equals("ErrorUnsupportedQueryFilter")) {
            return ResponseCode.ERROR_UNSUPPORTED_QUERY_FILTER;
        }
        if (s.equals("ErrorUnsupportedRecurrence")) {
            return ResponseCode.ERROR_UNSUPPORTED_RECURRENCE;
        }
        if (s.equals("ErrorUnsupportedSubFilter")) {
            return ResponseCode.ERROR_UNSUPPORTED_SUB_FILTER;
        }
        if (s.equals("ErrorUnsupportedTypeForConversion")) {
            return ResponseCode.ERROR_UNSUPPORTED_TYPE_FOR_CONVERSION;
        }
        if (s.equals("ErrorUpdateDelegatesFailed")) {
            return ResponseCode.ERROR_UPDATE_DELEGATES_FAILED;
        }
        if (s.equals("ErrorUpdatePropertyMismatch")) {
            return ResponseCode.ERROR_UPDATE_PROPERTY_MISMATCH;
        }
        if (s.equals("ErrorVirusDetected")) {
            return ResponseCode.ERROR_VIRUS_DETECTED;
        }
        if (s.equals("ErrorVirusMessageDeleted")) {
            return ResponseCode.ERROR_VIRUS_MESSAGE_DELETED;
        }
        if (s.equals("ErrorVoiceMailNotImplemented")) {
            return ResponseCode.ERROR_VOICE_MAIL_NOT_IMPLEMENTED;
        }
        if (s.equals("ErrorWebRequestInInvalidState")) {
            return ResponseCode.ERROR_WEB_REQUEST_IN_INVALID_STATE;
        }
        if (s.equals("ErrorWin32InteropError")) {
            return ResponseCode.ERROR_WIN32_INTEROP_ERROR;
        }
        if (s.equals("ErrorWorkingHoursSaveFailed")) {
            return ResponseCode.ERROR_WORKING_HOURS_SAVE_FAILED;
        }
        if (s.equals("ErrorWorkingHoursXmlMalformed")) {
            return ResponseCode.ERROR_WORKING_HOURS_XML_MALFORMED;
        }
        if (s.equals("ErrorArchiveFolderPathCreation")) {
            return ResponseCode.ERROR_ARCHIVE_FOLDER_PATH_CREATION;
        }
        if (s.equals("ErrorArchiveMailboxNotEnabled")) {
            return ResponseCode.ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED;
        }
        if (s.equals("ErrorArchiveMailboxServiceDiscoveryFailed")) {
            return ResponseCode.ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED;
        }
        if (s.equals("ErrorCalendarIsCancelledForAccept")) {
            return ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_ACCEPT;
        }
        if (s.equals("ErrorCalendarIsCancelledForDecline")) {
            return ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_DECLINE;
        }
        if (s.equals("ErrorCalendarIsCancelledForRemove")) {
            return ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_REMOVE;
        }
        if (s.equals("ErrorCalendarIsCancelledForTentative")) {
            return ResponseCode.ERROR_CALENDAR_IS_CANCELLED_FOR_TENTATIVE;
        }
        if (s.equals("ErrorCallerIsInvalidADAccount")) {
            return ResponseCode.ERROR_CALLER_IS_INVALID_AD_ACCOUNT;
        }
        if (s.equals("ErrorCannotArchiveCalendarContactTaskFolderException")) {
            return ResponseCode.ERROR_CANNOT_ARCHIVE_CALENDAR_CONTACT_TASK_FOLDER_EXCEPTION;
        }
        if (s.equals("ErrorCannotArchiveItemsInPublicFolders")) {
            return ResponseCode.ERROR_CANNOT_ARCHIVE_ITEMS_IN_PUBLIC_FOLDERS;
        }
        if (s.equals("ErrorCannotArchiveItemsInArchiveMailbox")) {
            return ResponseCode.ERROR_CANNOT_ARCHIVE_ITEMS_IN_ARCHIVE_MAILBOX;
        }
        if (s.equals("ErrorCannotDisableMandatoryExtension")) {
            return ResponseCode.ERROR_CANNOT_DISABLE_MANDATORY_EXTENSION;
        }
        if (s.equals("ErrorCannotGetSourceFolderPath")) {
            return ResponseCode.ERROR_CANNOT_GET_SOURCE_FOLDER_PATH;
        }
        if (s.equals("ErrorCannotGetExternalEcpUrl")) {
            return ResponseCode.ERROR_CANNOT_GET_EXTERNAL_ECP_URL;
        }
        if (s.equals("ErrorCannotEmptyFolder")) {
            return ResponseCode.ERROR_CANNOT_EMPTY_FOLDER;
        }
        if (s.equals("ErrorCannotSpecifySearchFolderAsSourceFolder")) {
            return ResponseCode.ERROR_CANNOT_SPECIFY_SEARCH_FOLDER_AS_SOURCE_FOLDER;
        }
        if (s.equals("ErrorClientDisconnected")) {
            return ResponseCode.ERROR_CLIENT_DISCONNECTED;
        }
        if (s.equals("ErrorClientIntentInvalidStateDefinition")) {
            return ResponseCode.ERROR_CLIENT_INTENT_INVALID_STATE_DEFINITION;
        }
        if (s.equals("ErrorClientIntentNotFound")) {
            return ResponseCode.ERROR_CLIENT_INTENT_NO_FOUND;
        }
        if (s.equals("ErrorContainsFilterWrongType")) {
            return ResponseCode.ERROR_CONTAINS_FILTER_WRONG_TYPE;
        }
        if (s.equals("ErrorContentIndexingNotEnabled")) {
            return ResponseCode.ERROR_CONTENT_INDEXING_NOT_ENABLED;
        }
        if (s.equals("ErrorCrossSiteRequest")) {
            return ResponseCode.ERROR_CROSS_SITE_REQUEST;
        }
        if (s.equals("ErrorDeleteUnifiedMessagingPromptFailed")) {
            return ResponseCode.ERROR_DELETE_UNIFIED_MESSAGING_PROMPT_FAILED;
        }
        if (s.equals("ErrorDistributionListMemberNotExist")) {
            return ResponseCode.ERROR_DISTRIBUTION_LIST_MEMBER_NOT_EXIST;
        }
        if (s.equals("ErrorExceededConnectionCount")) {
            return ResponseCode.ERROR_EXCEEDED_CONNECTION_COUNT;
        }
        if (s.equals("ErrorExceededSubscriptionCount")) {
            return ResponseCode.ERROR_EXCEEDED_SUBSCRIPTION_COUNT;
        }
        if (s.equals("ErrorExceededFindCountLimit")) {
            return ResponseCode.ERROR_EXCEEDED_FIND_COUNT_LIMIT;
        }
        if (s.equals("ErrorExtensionNotFound")) {
            return ResponseCode.ERROR_EXTENSION_NOT_FOUND;
        }
        if (s.equals("ErrorImContactLimitReached")) {
            return ResponseCode.ERROR_IM_CONTACT_LIMIT_REACHED;
        }
        if (s.equals("ErrorImGroupDisplayNameAlreadyExists")) {
            return ResponseCode.ERROR_IM_GROUP_DISPLAY_NAME_ALREADY_EXISTS;
        }
        if (s.equals("ErrorImGroupLimitReached")) {
            return ResponseCode.ERROR_IM_GROUP_LIMIT_REACHED;
        }
        if (s.equals("ErrorInvalidArgument")) {
            return ResponseCode.ERROR_INVALID_ARGUMENT;
        }
        if (s.equals("ErrorInvalidContactEmailAddress")) {
            return ResponseCode.ERROR_INVALID_CONTACT_EMAIL_ADDRESS;
        }
        if (s.equals("ErrorInvalidContactEmailIndex")) {
            return ResponseCode.ERROR_INVALID_CONTACT_EMAIL_INDEX;
        }
        if (s.equals("ErrorInvalidImContactId")) {
            return ResponseCode.ERROR_INVALID_IM_CONTACT_ID;
        }
        if (s.equals("ErrorInvalidImDistributionGroupSmtpAddress")) {
            return ResponseCode.ERROR_INVALID_IM_DISTRIBUTION_GROUP_SMTP_ADDRESS;
        }
        if (s.equals("ErrorInvalidImGroupId")) {
            return ResponseCode.ERROR_INVALID_IM_GROUP_ID;
        }
        if (s.equals("ErrorInvalidItemForOperationArchiveItem")) {
            return ResponseCode.ERROR_INVALID_ITEM_FOR_OPERATION_ARCHIVE_ITEM;
        }
        if (s.equals("ErrorInvalidLogonType")) {
            return ResponseCode.ERROR_INVALID_LOGON_TYPE;
        }
        if (s.equals("ErrorInvalidMailbox")) {
            return ResponseCode.ERROR_INVALID_MAILBOX;
        }
        if (s.equals("ErrorInvalidPhoneCallId")) {
            return ResponseCode.ERROR_INVALID_PHONE_CALL_ID;
        }
        if (s.equals("ErrorInvalidPhoneNumber")) {
            return ResponseCode.ERROR_INVALID_PHONE_NUMBER;
        }
        if (s.equals("ErrorInvalidRetentionTagTypeMismatch")) {
            return ResponseCode.ERROR_INVALID_RETENTION_TAG_TYPE_MISMATCH;
        }
        if (s.equals("ErrorInvalidRetentionTagInvisible")) {
            return ResponseCode.ERROR_INVALID_RETENTION_TAG_INVISIBLE;
        }
        if (s.equals("ErrorInvalidRetentionTagInheritance")) {
            return ResponseCode.ERROR_INVALID_RETENTION_TAG_INHERITANCE;
        }
        if (s.equals("ErrorInvalidRetentionTagIdGuid")) {
            return ResponseCode.ERROR_INVALID_RETENTION_TAG_ID_GUID;
        }
        if (s.equals("ErrorInvalidSIPUri")) {
            return ResponseCode.ERROR_INVALID_SIP_URI;
        }
        if (s.equals("ErrorIPGatewayNotFound")) {
            return ResponseCode.ERROR_IP_GATEWAY_NO_FOUND;
        }
        if (s.equals("ErrorMailboxHoldNotFound")) {
            return ResponseCode.ERROR_MAILBOX_HOLD_NOT_FOUND;
        }
        if (s.equals("ErrorMailTipsDisabled")) {
            return ResponseCode.ERROR_MAIL_TIPS_DISABLED;
        }
        if (s.equals("ErrorMultiLegacyMailboxAccess")) {
            return ResponseCode.ERROR_MULTI_LEGACY_MAILBOX_ACCESS;
        }
        if (s.equals("ErrorNoPublicFolderServerAvailable")) {
            return ResponseCode.ERROR_NO_PUBLIC_FOLDER_SERVER_AVAILABLE;
        }
        if (s.equals("ErrorPhoneNumberNotDialable")) {
            return ResponseCode.ERROR_PHONE_NUMBER_NOT_DIALABLE;
        }
        if (s.equals("ErrorPromptPublishingOperationFailed")) {
            return ResponseCode.ERROR_PROMPT_PUBLISHING_OPERATION_FAILED;
        }
        if (s.equals("ErrorPublicFolderMailboxDiscoveryFailed")) {
            return ResponseCode.ERROR_PUBLIC_FOLDER_MAILBOX_DISCOVERY_FAILED;
        }
        if (s.equals("ErrorPublicFolderOperationFailed")) {
            return ResponseCode.ERROR_PUBLIC_FOLDER_OPERATION_FAILED;
        }
        if (s.equals("ErrorPublicFolderSyncException")) {
            return ResponseCode.ERROR_PUBLIC_FOLDER_SYNC_EXCEPTION;
        }
        if (s.equals("ErrorSubmissionQuotaExceeded")) {
            return ResponseCode.ERROR_SUBMISSION_QUOTA_EXCEEDED;
        }
        if (s.equals("ErrorSubscriptionUnsubscribed")) {
            return ResponseCode.ERROR_SUBSCRIPTION_UNSUBSCRIBED;
        }
        if (s.equals("ErrorTeamMailboxNotFound")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_NOT_FOUND;
        }
        if (s.equals("ErrorTeamMailboxNotLinkedToSharePoint")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_NOT_LINKED_TO_SHARE_POINT;
        }
        if (s.equals("ErrorTeamMailboxUrlValidationFailed")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_URL_VALIDATION_FAILED;
        }
        if (s.equals("ErrorTeamMailboxNotAuthorizedOwner")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_NOT_AUTHORIZED_OWNER;
        }
        if (s.equals("ErrorTeamMailboxActiveToPendingDelete")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_ACTIVE_TO_PENDING_DELETE;
        }
        if (s.equals("ErrorTeamMailboxFailedSendingNotifications")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_FAILED_SENDING_NOTIFICATIONS;
        }
        if (s.equals("ErrorTeamMailboxErrorUnknown")) {
            return ResponseCode.ERROR_TEAM_MAILBOX_ERROR_UNKNOWN;
        }
        if (s.equals("ErrorUnifiedMessagingDialPlanNotFound")) {
            return ResponseCode.ERROR_UNIFIED_MESSAGING_DIAL_PLAN_NOT_FOUND;
        }
        if (s.equals("ErrorUnifiedMessagingReportDataNotFound")) {
            return ResponseCode.ERROR_UNIFIED_MESSAGING_REPORT_DATA_NOT_FOUND;
        }
        if (s.equals("ErrorUnifiedMessagingPromptNotFound")) {
            return ResponseCode.ERROR_UNIFIED_MESSAGING_PROMPT_NOT_FOUND;
        }
        if (s.equals("ErrorUnifiedMessagingRequestFailed")) {
            return ResponseCode.ERROR_UNIFIED_MESSAGING_REQUEST_FAILED;
        }
        if (s.equals("ErrorUnifiedMessagingServerNotFound")) {
            return ResponseCode.ERROR_UNIFIED_MESSAGING_SERVER_NOT_FOUND;
        }
        if (s.equals("ErrorUnableToRemoveImContactFromGroup")) {
            return ResponseCode.ERROR_UNABLE_TO_REMOVE_IM_CONTACT_FROM_GROUP;
        }
        if (s.equals("ErrorUserNotUnifiedMessagingEnabled")) {
            return ResponseCode.ERROR_USER_NOT_UNIFIED_MESSAGING_ENABLED;
        }
        if (s.equals("ErrorValueOutOfRange")) {
            return ResponseCode.ERROR_VALUE_OUT_OF_RANGE;
        }
        if (s.equals("ErrorWrongServerVersion")) {
            return ResponseCode.ERROR_WRONG_SERVER_VERSION;
        }
        if (s.equals("ErrorWrongServerVersionDelegate")) {
            return ResponseCode.ERROR_WRONG_SERVER_VERSION_DELEGATE;
        }
        if (s.equals("ErrorMissingInformationSharingFolderId")) {
            return ResponseCode.ERROR_MISSING_INFORMATION_SHARING_FOLDER_ID;
        }
        if (s.equals("ErrorDuplicateSOAPHeader")) {
            return ResponseCode.ERROR_DUPLICATE_SOAP_HEADER;
        }
        if (s.equals("ErrorSharingSynchronizationFailed")) {
            return ResponseCode.ERROR_SHARING_SYNCHRONIZATION_FAILED;
        }
        if (s.equals("ErrorSharingNoExternalEwsAvailable")) {
            return ResponseCode.ERROR_SHARING_NO_EXTERNAL_EWS_AVAILABLE;
        }
        if (s.equals("ErrorFreeBusyDLLimitReached")) {
            return ResponseCode.ERROR_FREE_BUSY_DL_LIMIT_REACHED;
        }
        if (s.equals("ErrorInvalidGetSharingFolderRequest")) {
            return ResponseCode.ERROR_INVALID_GET_SHARING_FOLDER_REQUEST;
        }
        if (s.equals("ErrorNotAllowedExternalSharingByPolicy")) {
            return ResponseCode.ERROR_NOT_ALLOWED_EXTERNAL_SHARING_BY_POLICY;
        }
        if (s.equals("ErrorUserNotAllowedByPolicy")) {
            return ResponseCode.ERROR_USER_NOT_ALLOWED_BY_POLICY;
        }
        if (s.equals("ErrorPermissionNotAllowedByPolicy")) {
            return ResponseCode.ERROR_PERMISSION_NOT_ALLOWED_BY_POLICY;
        }
        if (s.equals("ErrorOrganizationNotFederated")) {
            return ResponseCode.ERROR_ORGANIZATIONAL_NOT_FEDERATED;
        }
        if (s.equals("ErrorMailboxFailover")) {
            return ResponseCode.ERROR_MAILBOX_FAILOVER;
        }
        if (s.equals("ErrorInvalidExternalSharingInitiator")) {
            return ResponseCode.ERROR_INVALID_EXTERNAL_SHARING_INITIATOR;
        }
        if (s.equals("ErrorMessageTrackingPermanentError")) {
            return ResponseCode.ERROR_MESSAGE_TRACKING_PERMANENT_ERROR;
        }
        if (s.equals("ErrorMessageTrackingTransientError")) {
            return ResponseCode.ERROR_MESSAGE_TRACKING_TRANSIENT_ERROR;
        }
        if (s.equals("ErrorMessageTrackingNoSuchDomain")) {
            return ResponseCode.ERROR_MESSAGE_TRACKING_NO_SUCH_DOMAIN;
        }
        if (s.equals("ErrorUserWithoutFederatedProxyAddress")) {
            return ResponseCode.ERROR_USER_WITHOUT_FEDERATED_PROXY_ADDRESS;
        }
        if (s.equals("ErrorInvalidOrganizationRelationshipForFreeBusy")) {
            return ResponseCode.ERROR_INVALID_ORGANIZATION_RELATIONSHIP_FOR_FREE_BUSY;
        }
        if (s.equals("ErrorInvalidFederatedOrganizationId")) {
            return ResponseCode.ERROR_INVALID_FEDERATED_ORGANIZATION_ID;
        }
        if (s.equals("ErrorInvalidExternalSharingSubscriber")) {
            return ResponseCode.ERROR_INVALID_EXTERNAL_SHARING_SUBSCRIBER;
        }
        if (s.equals("ErrorInvalidSharingData")) {
            return ResponseCode.ERROR_INVALID_SHARING_DATA;
        }
        if (s.equals("ErrorInvalidSharingMessage")) {
            return ResponseCode.ERROR_INVALID_SHARING_MESSAGE;
        }
        if (s.equals("ErrorNotSupportedSharingMessage")) {
            return ResponseCode.ERROR_NOT_SUPPORTED_SHARING_MESSAGE;
        }
        if (s.equals("ErrorApplyConversationActionFailed")) {
            return ResponseCode.ERROR_APPLY_CONVERSATION_ACTION_FAILED;
        }
        if (s.equals("ErrorInboxRulesValidationError")) {
            return ResponseCode.ERROR_INBOX_RULES_VALIDATION_ERROR;
        }
        if (s.equals("ErrorOutlookRuleBlobExists")) {
            return ResponseCode.ERROR_OUTLOOK_RULE_BLOB_EXISTS;
        }
        if (s.equals("ErrorRulesOverQuota")) {
            return ResponseCode.ERROR_RULES_OVER_QUOTA;
        }
        if (s.equals("ErrorNewEventStreamConnectionOpened")) {
            return ResponseCode.ERROR_NEW_EVENT_STREAM_CONNECTION_OPENED;
        }
        if (s.equals("ErrorMissedNotificationEvents")) {
            return ResponseCode.ERROR_MISSED_NOTIFICATION_EVENTS;
        }
        if (s.equals("ErrorDuplicateLegacyDistinguishedName")) {
            return ResponseCode.ERROR_DUPLICATE_LEGACY_DISTINGUISHED_NAME;
        }
        if (s.equals("ErrorInvalidClientAccessTokenRequest")) {
            return ResponseCode.ERROR_INVALID_CLIENT_ACCESS_TOKEN_REQUEST;
        }
        if (s.equals("ErrorNoSpeechDetected")) {
            return ResponseCode.ERROR_NO_SPEECH_DETECTED;
        }
        if (s.equals("ErrorUMServerUnavailable")) {
            return ResponseCode.ERROR_UM_SERVER_UNAVAILABLE;
        }
        if (s.equals("ErrorRecipientNotFound")) {
            return ResponseCode.ERROR_RECIPIENT_NOT_FOUND;
        }
        if (s.equals("ErrorRecognizerNotInstalled")) {
            return ResponseCode.ERROR_RECOGNIZER_NOT_INSTALLED;
        }
        if (s.equals("ErrorSpeechGrammarError")) {
            return ResponseCode.ERROR_SPEECH_GRAMMAR_ERROR;
        }
        if (s.equals("ErrorInvalidManagementRoleHeader")) {
            return ResponseCode.ERROR_INVALID_MANAGEMENT_ROLE_HEADER;
        }
        if (s.equals("ErrorLocationServicesDisabled")) {
            return ResponseCode.ERROR_LOCATION_SERVICES_DISABLED;
        }
        if (s.equals("ErrorLocationServicesRequestTimedOut")) {
            return ResponseCode.ERROR_LOCATION_SERVICES_REQUEST_TIMED_OUT;
        }
        if (s.equals("ErrorLocationServicesRequestFailed")) {
            return ResponseCode.ERROR_LOCATION_SERVICES_REQUEST_FAILED;
        }
        if (s.equals("ErrorLocationServicesInvalidRequest")) {
            return ResponseCode.ERROR_LOCATION_SERVICES_INVALID_REQUEST;
        }
        if (s.equals("ErrorMailboxScopeNotAllowedWithoutQueryString")) {
            return ResponseCode.ERROR_MAILBOX_SCOPE_NOT_ALLOWED_WITHOUT_QUERY_STRING;
        }
        if (s.equals("ErrorArchiveMailboxSearchFailed")) {
            return ResponseCode.ERROR_ARCHIVE_MAILBOX_SEARCH_FAILED;
        }
        if (s.equals("ErrorArchiveMailboxServiceDiscoveryFailed")) {
            return ResponseCode.ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED;
        }
        if (s.equals("ErrorInvalidPhotoSize")) {
            return ResponseCode.ERROR_INVALID_PHOTO_SIZE;
        }
        if (s.equals("ErrorSearchQueryHasTooManyKeywords")) {
            return ResponseCode.ERROR_SEARCH_QUERY_HAS_TOO_MANY_KEYWORDS;
        }
        if (s.equals("ErrorSearchTooManyMailboxes")) {
            return ResponseCode.ERROR_SEARCH_TOO_MANY_MAILBOXES;
        }
        if (s.equals("ErrorInvalidRetentionTagNone")) {
            return ResponseCode.ERROR_INVALID_RETENTION_TAG_NONE;
        }
        return ResponseCode.ERROR_DISCOVERY_SEARCHES_DISABLED;
    }
}

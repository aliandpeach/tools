package com.ews.msg;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    
    final void a(final byte[] array) {
        this.a(array, 0, array.length);
    }
    
    final void a(final byte[] array, int n, int n2) {
        this.a ^= 0xFFFFFFFFL;
        while (--n2 >= 0) {
            this.a = (this.b[(int)((this.a ^ array[n++]) & 0xFFL)] ^ this.a >> 8);
        }
        this.a ^= 0xFFFFFFFFL;
    }
    
    static LastVerbExecuted a(final long n) {
        if (n == 102L) {
            return LastVerbExecuted.REPLY_TO_SENDER;
        }
        if (n == 103L) {
            return LastVerbExecuted.REPLY_TO_ALL;
        }
        if (n == 104L) {
            return LastVerbExecuted.FORWARD;
        }
        return LastVerbExecuted.NONE;
    }
    
    static long a(final LastVerbExecuted lastVerbExecuted) {
        if (lastVerbExecuted == LastVerbExecuted.REPLY_TO_SENDER) {
            return 102L;
        }
        if (lastVerbExecuted == LastVerbExecuted.REPLY_TO_ALL) {
            return 103L;
        }
        if (lastVerbExecuted == LastVerbExecuted.FORWARD) {
            return 104L;
        }
        return 0L;
    }
    
    static ObjectType b(final long n) {
        if (n == 1L) {
            return ObjectType.MESSAGE_STORE;
        }
        if (n == 2L) {
            return ObjectType.ADDRESS_BOOK;
        }
        if (n == 3L) {
            return ObjectType.FOLDER;
        }
        if (n == 4L) {
            return ObjectType.ADDRESS_BOOK_CONTAINER;
        }
        if (n == 5L) {
            return ObjectType.MESSAGE;
        }
        if (n == 6L) {
            return ObjectType.MAIL_USER;
        }
        if (n == 7L) {
            return ObjectType.ATTACHMENT;
        }
        if (n == 8L) {
            return ObjectType.DISTRIBUTION_LIST;
        }
        if (n == 9L) {
            return ObjectType.PROFILE_SELECTION;
        }
        if (n == 10L) {
            return ObjectType.STATUS;
        }
        if (n == 11L) {
            return ObjectType.SESSION;
        }
        if (n == 12L) {
            return ObjectType.FORM;
        }
        return ObjectType.NONE;
    }
    
    static long a(final ObjectType objectType) {
        if (objectType == ObjectType.MESSAGE_STORE) {
            return 1L;
        }
        if (objectType == ObjectType.ADDRESS_BOOK) {
            return 2L;
        }
        if (objectType == ObjectType.FOLDER) {
            return 3L;
        }
        if (objectType == ObjectType.ADDRESS_BOOK_CONTAINER) {
            return 4L;
        }
        if (objectType == ObjectType.MESSAGE) {
            return 5L;
        }
        if (objectType == ObjectType.MAIL_USER) {
            return 6L;
        }
        if (objectType == ObjectType.ATTACHMENT) {
            return 7L;
        }
        if (objectType == ObjectType.DISTRIBUTION_LIST) {
            return 8L;
        }
        if (objectType == ObjectType.PROFILE_SELECTION) {
            return 9L;
        }
        if (objectType == ObjectType.STATUS) {
            return 10L;
        }
        if (objectType == ObjectType.SESSION) {
            return 11L;
        }
        if (objectType == ObjectType.FORM) {
            return 12L;
        }
        return 0L;
    }
    
    static List<StoreSupportMask> c(final long n) {
        final ArrayList<StoreSupportMask> list = new ArrayList<StoreSupportMask>();
        if ((n & 0x20000L) == 0x20000L) {
            list.add(StoreSupportMask.ANSI);
        }
        if ((n & 0x20L) == 0x20L) {
            list.add(StoreSupportMask.ATTACHMENTS);
        }
        if ((n & 0x400L) == 0x400L) {
            list.add(StoreSupportMask.CATEGORIZE);
        }
        if ((n & 0x10L) == 0x10L) {
            list.add(StoreSupportMask.CREATE);
        }
        if ((n & 0x10000L) == 0x10000L) {
            list.add(StoreSupportMask.HTML);
        }
        if ((n & 0x200000L) == 0x200000L) {
            list.add(StoreSupportMask.ITEM_PROC);
        }
        if ((n & 0x80000L) == 0x80000L) {
            list.add(StoreSupportMask.LOCAL_STORE);
        }
        if ((n & 0x8L) == 0x8L) {
            list.add(StoreSupportMask.MODIFY);
        }
        if ((n & 0x200L) == 0x200L) {
            list.add(StoreSupportMask.MULTI_VALUE_PROPERTIES);
        }
        if ((n & 0x100L) == 0x100L) {
            list.add(StoreSupportMask.NOTIFY);
        }
        if ((n & 0x40L) == 0x40L) {
            list.add(StoreSupportMask.OLE);
        }
        if ((n & 0x4000L) == 0x4000L) {
            list.add(StoreSupportMask.PUBLIC_FOLDERS);
        }
        if ((n & 0x800000L) == 0x800000L) {
            list.add(StoreSupportMask.PUSHER);
        }
        if ((n & 0x2L) == 0x2L) {
            list.add(StoreSupportMask.READ_ONLY);
        }
        if ((n & 0x1000L) == 0x1000L) {
            list.add(StoreSupportMask.RESTRICTIONS);
        }
        if ((n & 0x800L) == 0x800L) {
            list.add(StoreSupportMask.RTF);
        }
        if ((n & 0x4L) == 0x4L) {
            list.add(StoreSupportMask.SEARCH);
        }
        if ((n & 0x2000L) == 0x2000L) {
            list.add(StoreSupportMask.SORT);
        }
        if ((n & 0x80L) == 0x80L) {
            list.add(StoreSupportMask.SUBMIT);
        }
        if ((n & 0x8000L) == 0x8000L) {
            list.add(StoreSupportMask.UNCOMPRESSED_RTF);
        }
        if ((n & 0x40000L) == 0x40000L) {
            list.add(StoreSupportMask.UNICODE);
        }
        return list;
    }
    
    static long a(final List<StoreSupportMask> list) {
        long n = 0L;
        for (int i = 0; i < list.size(); ++i) {
            final StoreSupportMask storeSupportMask;
            if ((storeSupportMask = list.get(i)) == StoreSupportMask.ANSI) {
                n += 131072L;
            }
            else if (storeSupportMask == StoreSupportMask.ATTACHMENTS) {
                n += 32L;
            }
            else if (storeSupportMask == StoreSupportMask.CATEGORIZE) {
                n += 1024L;
            }
            else if (storeSupportMask == StoreSupportMask.CREATE) {
                n += 16L;
            }
            else if (storeSupportMask == StoreSupportMask.HTML) {
                n += 65536L;
            }
            else if (storeSupportMask == StoreSupportMask.HTML) {
                n += 65536L;
            }
            else if (storeSupportMask == StoreSupportMask.ITEM_PROC) {
                n += 2097152L;
            }
            else if (storeSupportMask == StoreSupportMask.LOCAL_STORE) {
                n += 524288L;
            }
            else if (storeSupportMask == StoreSupportMask.MODIFY) {
                n += 8L;
            }
            else if (storeSupportMask == StoreSupportMask.MULTI_VALUE_PROPERTIES) {
                n += 512L;
            }
            else if (storeSupportMask == StoreSupportMask.NOTIFY) {
                n += 256L;
            }
            else if (storeSupportMask == StoreSupportMask.OLE) {
                n += 64L;
            }
            else if (storeSupportMask == StoreSupportMask.PUBLIC_FOLDERS) {
                n += 16384L;
            }
            else if (storeSupportMask == StoreSupportMask.PUSHER) {
                n += 8388608L;
            }
            else if (storeSupportMask == StoreSupportMask.READ_ONLY) {
                n += 2L;
            }
            else if (storeSupportMask == StoreSupportMask.RESTRICTIONS) {
                n += 4096L;
            }
            else if (storeSupportMask == StoreSupportMask.RTF) {
                n += 2048L;
            }
            else if (storeSupportMask == StoreSupportMask.SEARCH) {
                n += 4L;
            }
            else if (storeSupportMask == StoreSupportMask.SORT) {
                n += 8192L;
            }
            else if (storeSupportMask == StoreSupportMask.SUBMIT) {
                n += 128L;
            }
            else if (storeSupportMask == StoreSupportMask.UNCOMPRESSED_RTF) {
                n += 32768L;
            }
            else if (storeSupportMask == StoreSupportMask.UNICODE) {
                n += 262144L;
            }
        }
        return n;
    }
    
    static List<MessageFlag> d(final long n) {
        final ArrayList<MessageFlag> list = new ArrayList<MessageFlag>();
        if ((n & 0x40L) == 0x40L) {
            list.add(MessageFlag.ASSOCIATED);
        }
        if ((n & 0x20L) == 0x20L) {
            list.add(MessageFlag.FROM_ME);
        }
        if ((n & 0x10L) == 0x10L) {
            list.add(MessageFlag.HAS_ATTACHMENT);
        }
        if ((n & 0x200L) == 0x200L) {
            list.add(MessageFlag.NON_READ_REPORT_PENDING);
        }
        if ((n & 0x2000L) == 0x2000L) {
            list.add(MessageFlag.ORIGIN_INTERNET);
        }
        if ((n & 0x8000L) == 0x8000L) {
            list.add(MessageFlag.ORIGIN_MISC_EXTERNAL);
        }
        if ((n & 0x1000L) == 0x1000L) {
            list.add(MessageFlag.ORIGIN_X400);
        }
        if ((n & 0x1L) == 0x1L) {
            list.add(MessageFlag.READ);
        }
        if ((n & 0x80L) == 0x80L) {
            list.add(MessageFlag.RESEND);
        }
        if ((n & 0x100L) == 0x100L) {
            list.add(MessageFlag.READ_REPORT_PENDING);
        }
        if ((n & 0x4L) == 0x4L) {
            list.add(MessageFlag.SUBMIT);
        }
        if ((n & 0x2L) == 0x2L) {
            list.add(MessageFlag.UNMODIFIED);
        }
        if ((n & 0x8L) == 0x8L) {
            list.add(MessageFlag.UNSENT);
        }
        return list;
    }
    
    static long b(final List<MessageFlag> list) {
        long n = 0L;
        for (int i = 0; i < list.size(); ++i) {
            final MessageFlag messageFlag;
            if ((messageFlag = list.get(i)) == MessageFlag.ASSOCIATED) {
                n += 64L;
            }
            else if (messageFlag == MessageFlag.FROM_ME) {
                n += 32L;
            }
            else if (messageFlag == MessageFlag.HAS_ATTACHMENT) {
                n += 16L;
            }
            else if (messageFlag == MessageFlag.NON_READ_REPORT_PENDING) {
                n += 512L;
            }
            else if (messageFlag == MessageFlag.ORIGIN_INTERNET) {
                n += 8192L;
            }
            else if (messageFlag == MessageFlag.ORIGIN_MISC_EXTERNAL) {
                n += 32768L;
            }
            else if (messageFlag == MessageFlag.ORIGIN_X400) {
                n += 4096L;
            }
            else if (messageFlag == MessageFlag.READ) {
                ++n;
            }
            else if (messageFlag == MessageFlag.RESEND) {
                n += 128L;
            }
            else if (messageFlag == MessageFlag.READ_REPORT_PENDING) {
                n += 256L;
            }
            else if (messageFlag == MessageFlag.SUBMIT) {
                n += 4L;
            }
            else if (messageFlag == MessageFlag.UNMODIFIED) {
                n += 2L;
            }
            else if (messageFlag == MessageFlag.UNSENT) {
                n += 8L;
            }
        }
        return n;
    }
    
    static FlagIcon e(final long n) {
        if (n == 1L) {
            return FlagIcon.PURPLE;
        }
        if (n == 2L) {
            return FlagIcon.ORANGE;
        }
        if (n == 3L) {
            return FlagIcon.GREEN;
        }
        if (n == 4L) {
            return FlagIcon.YELLOW;
        }
        if (n == 5L) {
            return FlagIcon.BLUE;
        }
        if (n == 6L) {
            return FlagIcon.RED;
        }
        return FlagIcon.NONE;
    }
    
    static long a(final FlagIcon flagIcon) {
        if (flagIcon == FlagIcon.PURPLE) {
            return 1L;
        }
        if (flagIcon == FlagIcon.ORANGE) {
            return 2L;
        }
        if (flagIcon == FlagIcon.GREEN) {
            return 3L;
        }
        if (flagIcon == FlagIcon.YELLOW) {
            return 4L;
        }
        if (flagIcon == FlagIcon.BLUE) {
            return 5L;
        }
        if (flagIcon == FlagIcon.RED) {
            return 6L;
        }
        return 0L;
    }
    
    static SelectedMailingAddress f(final long n) {
        if (n == 1L) {
            return SelectedMailingAddress.HOME;
        }
        if (n == 2L) {
            return SelectedMailingAddress.BUSINESS;
        }
        if (n == 3L) {
            return SelectedMailingAddress.OTHER;
        }
        return SelectedMailingAddress.NONE;
    }
    
    static long a(final SelectedMailingAddress selectedMailingAddress) {
        if (selectedMailingAddress == SelectedMailingAddress.HOME) {
            return 1L;
        }
        if (selectedMailingAddress == SelectedMailingAddress.BUSINESS) {
            return 2L;
        }
        if (selectedMailingAddress == SelectedMailingAddress.OTHER) {
            return 3L;
        }
        return 0L;
    }
    
    static FlagStatus g(final long n) {
        if (n == 1L) {
            return FlagStatus.COMPLETE;
        }
        if (n == 2L) {
            return FlagStatus.MARKED;
        }
        return FlagStatus.NONE;
    }
    
    static long a(final FlagStatus flagStatus) {
        if (flagStatus == FlagStatus.COMPLETE) {
            return 1L;
        }
        if (flagStatus == FlagStatus.MARKED) {
            return 2L;
        }
        return 0L;
    }
    
    static DisplayType h(final long n) {
        if (n == 0L) {
            return DisplayType.MAIL_USER;
        }
        if (n == 1L) {
            return DisplayType.DISTRIBUTION_LIST;
        }
        if (n == 2L) {
            return DisplayType.FORUM;
        }
        if (n == 3L) {
            return DisplayType.AGENT;
        }
        if (n == 4L) {
            return DisplayType.ORGANIZATION;
        }
        if (n == 5L) {
            return DisplayType.PRIVATE_DISTRIBUTION_LIST;
        }
        if (n == 6L) {
            return DisplayType.REMOTE_MAIL_USER;
        }
        if (n == 16777216L) {
            return DisplayType.FOLDER;
        }
        if (n == 33554432L) {
            return DisplayType.FOLDER_LINK;
        }
        if (n == 67108864L) {
            return DisplayType.FOLDER_SPECIAL;
        }
        if (n == 65536L) {
            return DisplayType.MODIFIABLE;
        }
        if (n == 131072L) {
            return DisplayType.GLOBAL_ADDRESS_BOOK;
        }
        if (n == 196608L) {
            return DisplayType.LOCAL_ADDRESS_BOOK;
        }
        if (n == 262144L) {
            return DisplayType.WIDE_AREA_NETWORK_ADDRESS_BOOK;
        }
        if (n == 327680L) {
            return DisplayType.NOT_SPECIFIC;
        }
        return DisplayType.NONE;
    }
    
    static long a(final DisplayType displayType) {
        if (displayType == DisplayType.MAIL_USER) {
            return 0L;
        }
        if (displayType == DisplayType.DISTRIBUTION_LIST) {
            return 1L;
        }
        if (displayType == DisplayType.FORUM) {
            return 2L;
        }
        if (displayType == DisplayType.AGENT) {
            return 3L;
        }
        if (displayType == DisplayType.ORGANIZATION) {
            return 4L;
        }
        if (displayType == DisplayType.PRIVATE_DISTRIBUTION_LIST) {
            return 5L;
        }
        if (displayType == DisplayType.REMOTE_MAIL_USER) {
            return 6L;
        }
        if (displayType == DisplayType.FOLDER) {
            return 16777216L;
        }
        if (displayType == DisplayType.FOLDER_LINK) {
            return 33554432L;
        }
        if (displayType == DisplayType.FOLDER_SPECIAL) {
            return 67108864L;
        }
        if (displayType == DisplayType.MODIFIABLE) {
            return 65536L;
        }
        if (displayType == DisplayType.GLOBAL_ADDRESS_BOOK) {
            return 131072L;
        }
        if (displayType == DisplayType.LOCAL_ADDRESS_BOOK) {
            return 196608L;
        }
        if (displayType == DisplayType.WIDE_AREA_NETWORK_ADDRESS_BOOK) {
            return 262144L;
        }
        if (displayType == DisplayType.NOT_SPECIFIC) {
            return 327680L;
        }
        return 0L;
    }
    
    static NoteColor i(final long n) {
        if (n == 0L) {
            return NoteColor.BLUE;
        }
        if (n == 1L) {
            return NoteColor.GREEN;
        }
        if (n == 2L) {
            return NoteColor.PINK;
        }
        if (n == 3L) {
            return NoteColor.YELLOW;
        }
        if (n == 4L) {
            return NoteColor.WHITE;
        }
        return NoteColor.NONE;
    }
    
    static long a(final NoteColor noteColor) {
        if (noteColor == NoteColor.BLUE) {
            return 0L;
        }
        if (noteColor == NoteColor.GREEN) {
            return 1L;
        }
        if (noteColor == NoteColor.PINK) {
            return 2L;
        }
        if (noteColor == NoteColor.YELLOW) {
            return 3L;
        }
        if (noteColor == NoteColor.WHITE) {
            return 4L;
        }
        return 0L;
    }
    
    static RecipientType j(final long n) {
        if (n == 1L) {
            return RecipientType.TO;
        }
        if (n == 2L) {
            return RecipientType.CC;
        }
        if (n == 3L) {
            return RecipientType.BCC;
        }
        if (n == 268435456L) {
            return RecipientType.P1;
        }
        return RecipientType.NONE;
    }
    
    static long a(final RecipientType recipientType) {
        if (recipientType == RecipientType.TO) {
            return 1L;
        }
        if (recipientType == RecipientType.CC) {
            return 2L;
        }
        if (recipientType == RecipientType.BCC) {
            return 3L;
        }
        if (recipientType == RecipientType.P1) {
            return 268435456L;
        }
        return 0L;
    }
    
    static Priority k(final long n) {
        if (n == -1L) {
            return Priority.LOW;
        }
        if (n == 1L) {
            return Priority.HIGH;
        }
        if (n == 0L) {
            return Priority.NORMAL;
        }
        return Priority.NONE;
    }
    
    static long a(final Priority priority) {
        if (priority == Priority.LOW) {
            return -1L;
        }
        if (priority == Priority.HIGH) {
            return 1L;
        }
        return 0L;
    }
    
    static Sensitivity l(final long n) {
        if (n == 1L) {
            return Sensitivity.PERSONAL;
        }
        if (n == 2L) {
            return Sensitivity.PRIVATE;
        }
        if (n == 3L) {
            return Sensitivity.CONFIDENTIAL;
        }
        return Sensitivity.NONE;
    }
    
    static long a(final Sensitivity sensitivity) {
        if (sensitivity == Sensitivity.PERSONAL) {
            return 1L;
        }
        if (sensitivity == Sensitivity.PRIVATE) {
            return 2L;
        }
        if (sensitivity == Sensitivity.CONFIDENTIAL) {
            return 3L;
        }
        return 0L;
    }
    
    static Importance m(final long n) {
        if (n == 1L) {
            return Importance.NORMAL;
        }
        if (n == 2L) {
            return Importance.HIGH;
        }
        if (n == 0L) {
            return Importance.LOW;
        }
        return Importance.NONE;
    }
    
    static long a(final Importance importance) {
        if (importance == Importance.NORMAL) {
            return 1L;
        }
        if (importance == Importance.HIGH) {
            return 2L;
        }
        if (importance == Importance.LOW) {
            return 0L;
        }
        return 1L;
    }
    
    static TaskOwnership n(final long n) {
        if (n == 0L) {
            return TaskOwnership.NEW;
        }
        if (n == 1L) {
            return TaskOwnership.DELEGATED;
        }
        if (n == 2L) {
            return TaskOwnership.OWN;
        }
        return TaskOwnership.NONE;
    }
    
    static long a(final TaskOwnership taskOwnership) {
        if (taskOwnership == TaskOwnership.NEW) {
            return 0L;
        }
        if (taskOwnership == TaskOwnership.DELEGATED) {
            return 1L;
        }
        if (taskOwnership == TaskOwnership.OWN) {
            return 2L;
        }
        return 0L;
    }
    
    static TaskDelegationState o(final long n) {
        if (n == 0L) {
            return TaskDelegationState.OWNED;
        }
        if (n == 1L) {
            return TaskDelegationState.OWN_NEW;
        }
        if (n == 2L) {
            return TaskDelegationState.ACCEPTED;
        }
        if (n == 3L) {
            return TaskDelegationState.DECLINED;
        }
        if (n == 4L) {
            return TaskDelegationState.NO_MATCH;
        }
        return TaskDelegationState.NONE;
    }
    
    static long a(final TaskDelegationState taskDelegationState) {
        if (taskDelegationState == TaskDelegationState.OWNED) {
            return 0L;
        }
        if (taskDelegationState == TaskDelegationState.OWN_NEW) {
            return 1L;
        }
        if (taskDelegationState == TaskDelegationState.ACCEPTED) {
            return 2L;
        }
        if (taskDelegationState == TaskDelegationState.DECLINED) {
            return 3L;
        }
        if (taskDelegationState == TaskDelegationState.NO_MATCH) {
            return 4L;
        }
        return 0L;
    }
    
    static BusyStatus p(final long n) {
        if (n == 0L) {
            return BusyStatus.FREE;
        }
        if (n == 1L) {
            return BusyStatus.TENTATIVE;
        }
        if (n == 2L) {
            return BusyStatus.BUSY;
        }
        if (n == 3L) {
            return BusyStatus.OUT_OF_OFFICE;
        }
        return BusyStatus.NONE;
    }
    
    static long a(final BusyStatus busyStatus) {
        if (busyStatus == BusyStatus.FREE) {
            return 0L;
        }
        if (busyStatus == BusyStatus.TENTATIVE) {
            return 1L;
        }
        if (busyStatus == BusyStatus.BUSY) {
            return 2L;
        }
        if (busyStatus == BusyStatus.OUT_OF_OFFICE) {
            return 3L;
        }
        return 0L;
    }
    
    static RecurrenceType q(final long n) {
        if (n == 1L) {
            return RecurrenceType.DAILY;
        }
        if (n == 2L) {
            return RecurrenceType.WEEKLY;
        }
        if (n == 3L) {
            return RecurrenceType.MONTHLY;
        }
        if (n == 4L) {
            return RecurrenceType.YEARLY;
        }
        if (n == 5L) {
            return RecurrenceType.MONTH_NTH;
        }
        if (n == 6L) {
            return RecurrenceType.YEAR_NTH;
        }
        return RecurrenceType.NONE;
    }
    
    static long a(final RecurrenceType recurrenceType) {
        if (recurrenceType == RecurrenceType.DAILY) {
            return 1L;
        }
        if (recurrenceType == RecurrenceType.WEEKLY) {
            return 2L;
        }
        if (recurrenceType == RecurrenceType.MONTHLY) {
            return 3L;
        }
        if (recurrenceType == RecurrenceType.YEARLY) {
            return 4L;
        }
        if (recurrenceType == RecurrenceType.MONTH_NTH) {
            return 5L;
        }
        if (recurrenceType == RecurrenceType.YEAR_NTH) {
            return 6L;
        }
        return 0L;
    }
    
    static ResponseStatus r(final long n) {
        if (n == 1L) {
            return ResponseStatus.ORGANIZED;
        }
        if (n == 2L) {
            return ResponseStatus.TENTATIVE;
        }
        if (n == 3L) {
            return ResponseStatus.ACCEPTED;
        }
        if (n == 4L) {
            return ResponseStatus.DECLINED;
        }
        if (n == 5L) {
            return ResponseStatus.NOT_RESPONDED;
        }
        return ResponseStatus.NONE;
    }
    
    static long a(final ResponseStatus responseStatus) {
        if (responseStatus == ResponseStatus.ORGANIZED) {
            return 1L;
        }
        if (responseStatus == ResponseStatus.TENTATIVE) {
            return 2L;
        }
        if (responseStatus == ResponseStatus.ACCEPTED) {
            return 3L;
        }
        if (responseStatus == ResponseStatus.DECLINED) {
            return 4L;
        }
        if (responseStatus == ResponseStatus.NOT_RESPONDED) {
            return 5L;
        }
        return 0L;
    }
    
    static MeetingStatus s(final long n) {
        if (n == 0L) {
            return MeetingStatus.NON_MEETING;
        }
        if (n == 1L) {
            return MeetingStatus.MEETING;
        }
        if (n == 3L) {
            return MeetingStatus.RECEIVED;
        }
        if (n == 4L) {
            return MeetingStatus.CANCELED_ORGANIZER;
        }
        if (n == 5L) {
            return MeetingStatus.CANCELED;
        }
        return MeetingStatus.NONE;
    }
    
    static long a(final MeetingStatus meetingStatus) {
        if (meetingStatus == MeetingStatus.NON_MEETING) {
            return 0L;
        }
        if (meetingStatus == MeetingStatus.MEETING) {
            return 1L;
        }
        if (meetingStatus == MeetingStatus.RECEIVED) {
            return 3L;
        }
        if (meetingStatus == MeetingStatus.CANCELED_ORGANIZER) {
            return 4L;
        }
        if (meetingStatus == MeetingStatus.CANCELED) {
            return 5L;
        }
        return 0L;
    }
    
    static TaskStatus t(final long n) {
        if (n == 0L) {
            return TaskStatus.NOT_STARTED;
        }
        if (n == 1L) {
            return TaskStatus.IN_PROGRESS;
        }
        if (n == 2L) {
            return TaskStatus.COMPLETED;
        }
        if (n == 3L) {
            return TaskStatus.WAITING_ON_OTHERS;
        }
        if (n == 4L) {
            return TaskStatus.DEFERRED;
        }
        return TaskStatus.NONE;
    }
    
    static long a(final TaskStatus taskStatus) {
        if (taskStatus == TaskStatus.NOT_STARTED) {
            return 0L;
        }
        if (taskStatus == TaskStatus.IN_PROGRESS) {
            return 1L;
        }
        if (taskStatus == TaskStatus.COMPLETED) {
            return 2L;
        }
        if (taskStatus == TaskStatus.WAITING_ON_OTHERS) {
            return 3L;
        }
        if (taskStatus == TaskStatus.DEFERRED) {
            return 4L;
        }
        return 0L;
    }
    
    static AttachmentMethod u(final long n) {
        if (n == 0L) {
            return AttachmentMethod.NO_ATTACHMENT;
        }
        if (n == 1L) {
            return AttachmentMethod.ATTACH_BY_VALUE;
        }
        if (n == 2L) {
            return AttachmentMethod.ATTACH_BY_REFERENCE;
        }
        if (n == 3L) {
            return AttachmentMethod.ATTACH_BY_REFERENCE_RESOLVE;
        }
        if (n == 4L) {
            return AttachmentMethod.ATTACH_BY_REFERENCE_ONLY;
        }
        if (n == 5L) {
            return AttachmentMethod.EMBEDDED_MESSAGE;
        }
        if (n == 6L) {
            return AttachmentMethod.OLE;
        }
        return AttachmentMethod.NONE;
    }
    
    static long a(final AttachmentMethod attachmentMethod) {
        if (attachmentMethod == AttachmentMethod.NO_ATTACHMENT) {
            return 0L;
        }
        if (attachmentMethod == AttachmentMethod.ATTACH_BY_VALUE) {
            return 1L;
        }
        if (attachmentMethod == AttachmentMethod.ATTACH_BY_REFERENCE) {
            return 2L;
        }
        if (attachmentMethod == AttachmentMethod.ATTACH_BY_REFERENCE_RESOLVE) {
            return 3L;
        }
        if (attachmentMethod == AttachmentMethod.ATTACH_BY_REFERENCE_ONLY) {
            return 4L;
        }
        if (attachmentMethod == AttachmentMethod.EMBEDDED_MESSAGE) {
            return 5L;
        }
        if (attachmentMethod == AttachmentMethod.OLE) {
            return 6L;
        }
        return 0L;
    }
    
    static AttachmentFlags v(final long n) {
        if (n == 1L) {
            return AttachmentFlags.INVISIBLE_IN_HTML;
        }
        if (n == 2L) {
            return AttachmentFlags.INVISIBLE_IN_RTF;
        }
        return AttachmentFlags.NONE;
    }
    
    static long a(final AttachmentFlags attachmentFlags) {
        if (attachmentFlags == AttachmentFlags.INVISIBLE_IN_HTML) {
            return 1L;
        }
        if (attachmentFlags == AttachmentFlags.INVISIBLE_IN_RTF) {
            return 2L;
        }
        return 0L;
    }
    
    static void b() throws IOException {
        try {
            final Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-31");
            final Date time = Calendar.getInstance().getTime();
            if (parse.before(time)) {
                throw new IOException("JMSG 1.0 evaluation version. Evaluation version has expired.");
            }
            final File file = new File(System.getProperty("user.home") + System.getProperty("file.separator") + ".jms");
            boolean exists = false;
            try {
                exists = file.exists();
            }
            catch (Exception ex) {
                final int value = Calendar.getInstance().get(5);
                final int value2 = Calendar.getInstance().get(7);
                if (value < 8 && value2 == 3) {
                    System.out.println("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    System.err.println("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    throw new IOException("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                }
            }
            if (exists) {
                final Calendar instance;
                (instance = Calendar.getInstance()).setTime(new Date(file.lastModified()));
                instance.add(2, 1);
                if (instance.getTime().before(time)) {
                    System.out.println("JMSG 1.0 evaluation version. Evaluation version has expired.");
                    System.err.println("JMSG 1.0 evaluation version. Evaluation version has expired.");
                    throw new IOException("JMSG 1.0 evaluation version. Evaluation version has expired.");
                }
            }
            else {
                try {
                    file.createNewFile();
                }
                catch (Exception ex2) {
                    final int value3 = Calendar.getInstance().get(5);
                    final int value4 = Calendar.getInstance().get(7);
                    if (value3 < 8 && value4 == 3) {
                        System.out.println("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                        System.err.println("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                        throw new IOException("JMSG 1.0 evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    }
                }
            }
        }
        catch (ParseException ex3) {
            System.out.println("JMSG 1.0 evaluation version. Evaluation version has expired.");
            System.err.println("JMSG 1.0 evaluation version. Evaluation version has expired.");
            throw new IOException("JMSG 1.0 evaluation version. Evaluation version has expired.");
        }
    }
}

package com.ews.msg;

import com.ews.io.storage.CompoundFile;
import com.ews.io.storage.DirectoryEntry;
import com.ews.io.storage.DirectoryEntryList;
import com.ews.io.storage.Storage;
import com.ews.io.storage.Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Message
{
    private HashMap<String, g> a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private byte[] r;
    private Date s;
    private Date t;
    private Date u;
    private Date v;
    private Date w;
    private Date x;
    private String y;
    private String z;
    private String A;
    private String B;
    private String C;
    private String D;
    private d E;
    private d F;
    private d G;
    private d H;
    private byte[] I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private byte[] R;
    private Sensitivity S;
    private Importance T;
    private Priority U;
    private FlagIcon V;
    private FlagStatus W;
    private ObjectType X;
    private String Y;
    private String Z;
    private byte[] aa;
    private String ab;
    private byte[] ac;
    private String ad;
    private String ae;
    private byte[] af;
    private String ag;
    private byte[] ah;
    private String ai;
    private String aj;
    private byte[] ak;
    private String al;
    private byte[] am;
    private String an;
    private String ao;
    private byte[] ap;
    private String aq;
    private byte[] ar;
    private String as;
    private Date at;
    private LastVerbExecuted au;
    private List<MessageFlag> av;
    private List<StoreSupportMask> aw;
    private String ax;
    private d ay;
    private Date az;
    private Date aA;
    private Date aB;
    private boolean aC;
    private Date aD;
    private d aE;
    private List<String> aF;
    private List<String> aG;
    private List<String> aH;
    private String aI;
    private String aJ;
    private String aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private Date aP;
    private Date aQ;
    private boolean aR;
    private String aS;
    private BusyStatus aT;
    private MeetingStatus aU;
    private ResponseStatus aV;
    private RecurrenceType aW;
    private String aX;
    private String aY;
    private String aZ;
    private byte[] ba;
    private int bb;
    private int bc;
    private Date bd;
    private Date be;
    private String bf;
    private String bg;
    private double bh;
    private d bi;
    private d bj;
    private boolean bk;
    private boolean bl;
    private Date bm;
    private TaskStatus bn;
    private TaskOwnership bo;
    private TaskDelegationState bp;
    private d bq;
    private d br;
    private d bs;
    private d bt;
    private NoteColor bu;
    private Date bv;
    private Date bw;
    private String bx;
    private String by;
    private d bz;
    private Date bA;
    private List<String> bB;
    private String bC;
    private String bD;
    private String bE;
    private String bF;
    private String bG;
    private String bH;
    private String bI;
    private String bJ;
    private String bK;
    private String bL;
    private String bM;
    private String bN;
    private String bO;
    private String bP;
    private String bQ;
    private String bR;
    private String bS;
    private String bT;
    private String bU;
    private String bV;
    private String bW;
    private String bX;
    private String bY;
    private String bZ;
    private String ca;
    private String cb;
    private String cc;
    private String cd;
    private String ce;
    private String cf;
    private String cg;
    private String ch;
    private String ci;
    private String cj;
    private String ck;
    private String cl;
    private String cm;
    private String cn;
    private String co;
    private String cp;
    private String cq;
    private String cr;
    private String cs;
    private String ct;
    private String cu;
    private String cv;
    private String cw;
    private String cx;
    private String cy;
    private String cz;
    private String cA;
    private String cB;
    private String cC;
    private String cD;
    private String cE;
    private String cF;
    private String cG;
    private String cH;
    private String cI;
    private String cJ;
    private Date cK;
    private SelectedMailingAddress cL;
    private boolean cM;
    private String cN;
    private String cO;
    private String cP;
    private String cQ;
    private String cR;
    private String cS;
    private String cT;
    private String cU;
    private String cV;
    private String cW;
    private String cX;
    private String cY;
    private String cZ;
    private String da;
    private String db;
    private String dc;
    private String dd;
    private String de;
    private byte[] df;
    private byte[] dg;
    private byte[] dh;
    private List<Recipient> di;
    private List<Attachment> dj;
    private List<ExtendedProperty> dk;
    private List<e> dl;
    private String dm;
    private int dn;
    private String dw;
    private int dp;
    private int dq;
    private Encoding dr;
    private Charset ds;
    private Charset dt;
    private Charset du;
    private boolean dv;
    
    public Message() {
        this.b = "IPM.Note";
        this.E = new d(0);
        this.F = new d(0);
        this.G = new d(0);
        this.H = new d(0);
        this.S = Sensitivity.NONE;
        this.T = Importance.NONE;
        this.U = Priority.NONE;
        this.V = FlagIcon.NONE;
        this.W = FlagStatus.NONE;
        this.X = ObjectType.NONE;
        this.au = LastVerbExecuted.NONE;
        this.av = new ArrayList<MessageFlag>();
        this.aw = new ArrayList<StoreSupportMask>();
        this.ay = new d(0);
        this.aE = new d(0);
        this.aF = new ArrayList<String>();
        this.aG = new ArrayList<String>();
        this.aH = new ArrayList<String>();
        this.aT = BusyStatus.NONE;
        this.aU = MeetingStatus.NONE;
        this.aV = ResponseStatus.NONE;
        this.aW = RecurrenceType.NONE;
        this.bb = -1;
        this.bi = new d(0);
        this.bj = new d(0);
        this.bn = TaskStatus.NONE;
        this.bo = TaskOwnership.NONE;
        this.bp = TaskDelegationState.NONE;
        this.bq = new d(0);
        this.br = new d(0);
        this.bs = new d(0);
        this.bt = new d(0);
        this.bu = NoteColor.NONE;
        this.bz = new d(0);
        this.bB = new ArrayList<String>();
        this.cL = SelectedMailingAddress.NONE;
        this.di = new ArrayList<Recipient>();
        this.dj = new ArrayList<Attachment>();
        this.dk = new ArrayList<ExtendedProperty>();
        this.dl = new ArrayList<e>();
        this.dm = "001E";
        this.dn = 30;
        this.dw = "101E";
        this.dp = 4126;
        this.dq = 1;
        this.dr = Encoding.UTF8;
        this.ds = Charset.forName("UTF-8");
        this.dt = Charset.forName("UTF-8");
        this.du = Charset.forName("UTF-16LE");
        this.aw.add(StoreSupportMask.ATTACHMENTS);
        this.aw.add(StoreSupportMask.CATEGORIZE);
        this.aw.add(StoreSupportMask.CREATE);
        this.aw.add(StoreSupportMask.ENTRY_ID_UNIQUE);
        this.aw.add(StoreSupportMask.HTML);
        this.aw.add(StoreSupportMask.ITEM_PROC);
        this.aw.add(StoreSupportMask.MODIFY);
        this.aw.add(StoreSupportMask.MULTI_VALUE_PROPERTIES);
        this.aw.add(StoreSupportMask.NOTIFY);
        this.aw.add(StoreSupportMask.OLE);
        this.aw.add(StoreSupportMask.PUSHER);
        this.aw.add(StoreSupportMask.READ_ONLY);
        this.aw.add(StoreSupportMask.RESTRICTIONS);
        this.aw.add(StoreSupportMask.RTF);
        this.aw.add(StoreSupportMask.SEARCH);
        this.aw.add(StoreSupportMask.SORT);
        this.aw.add(StoreSupportMask.SUBMIT);
        this.aw.add(StoreSupportMask.UNCOMPRESSED_RTF);
        this.aw.add(StoreSupportMask.UNICODE);
    }
    
    public Message(final String filePath) throws IOException {
        this();
        this.open(filePath);
    }
    
    public Message(final InputStream inputStream) throws IOException {
        this();
        this.open(inputStream);
    }
    
    public void open(String filePath) throws IOException {
        FileInputStream var_1_08 = new FileInputStream(filePath);
        try {
            this.open(var_1_08);
        }
        finally {
            var_1_08.close();
        }
    }
    
    public void open(final InputStream inputStream) throws IOException {
        com.ews.msg.a.b();
        final CompoundFile compoundFile;
        final Storage storage;
        final Stream stream = (Stream)(storage = (Storage)(compoundFile = new CompoundFile(inputStream)).getRoot().getDirectoryEntries().get("__nameid_version1.0")).getDirectoryEntries().get("__substg1.0_00020102");
        final Stream stream2 = (Stream)storage.getDirectoryEntries().get("__substg1.0_00030102");
        final Stream stream3 = (Stream)storage.getDirectoryEntries().get("__substg1.0_00040102");
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        this.dl = new ArrayList<e>();
        if (stream2 != null) {
            final int n = (int)stream2.getSize() / 8;
            final byte[] buffer;
            if ((buffer = stream2.getBuffer()) != null) {
                final ByteBuffer wrap;
                (wrap = ByteBuffer.wrap(buffer)).order(ByteOrder.LITTLE_ENDIAN);
                for (int i = 0; i < n; ++i) {
                    final int int1 = wrap.getInt(i << 3);
                    final int int2;
                    final short n2 = (short)((int2 = wrap.getInt((i << 3) + 4)) >> 16);
                    final short n4;
                    final short n3 = (short)((n4 = (short)int2) >> 1);
                    final short n5 = (short)(n4 << 15);
                    final e e = new e();
                    if (n5 == 0) {
                        e.a(new d(int1));
                        e.a(com.ews.msg.f.a);
                    }
                    else {
                        final int n6 = int1;
                        final byte[] buffer2;
                        final ByteBuffer wrap2;
                        (wrap2 = ByteBuffer.wrap(buffer2 = stream3.getBuffer())).order(ByteOrder.LITTLE_ENDIAN);
                        e.a(this.du.decode(ByteBuffer.wrap(buffer2, n6 + 4, wrap2.getInt(n6))).toString());
                        e.a(com.ews.msg.f.b);
                    }
                    if (n3 == 1) {
                        e.a(StandardPropertySet.MAPI);
                    }
                    else if (n3 == 2) {
                        e.a(StandardPropertySet.PUBLIC_STRINGS);
                    }
                    else if (n3 > 2) {
                        final short n7 = (short)(n3 - 3);
                        final byte[] buffer3 = stream.getBuffer();
                        final byte[] array = new byte[16];
                        System.arraycopy(buffer3, n7 << 4, array, 0, 16);
                        e.a(array);
                    }
                    if (e.a() != null && e.a().longValue() > 0L) {
                        final String a = com.ews.msg.h.a(e.a().intValue(), e.c());
                        final String format = String.format("%X", n2 + 32768);
                        if (!hashMap.containsKey(a)) {
                            hashMap.put(a, format);
                        }
                    }
                    else if (e.b() != null) {
                        final String a2 = com.ews.msg.h.a(e.b(), e.c());
                        final String format2 = String.format("%X", n2 + 32768);
                        if (!hashMap.containsKey(a2)) {
                            hashMap.put(a2, format2);
                        }
                    }
                    this.dl.add(e);
                }
            }
        }
        for (int j = 0; j < this.dl.size(); ++j) {
            final e e2;
            if ((e2 = this.dl.get(j)).b() != null) {
                this.dk.add(new ExtendedProperty(new ExtendedPropertyName(e2.b(), e2.c())));
            }
            else if (e2.a() != null && e2.a().longValue() > 0L) {
                this.dk.add(new ExtendedProperty(new ExtendedPropertyId(e2.a().intValue(), e2.c())));
            }
        }
        this.a(compoundFile.getRoot().getDirectoryEntries(), hashMap);
    }
    
    private Message(final DirectoryEntryList directoryEntries, final boolean isEmbedded) throws IOException {
        this.b = "IPM.Note";
        this.E = new d(0);
        this.F = new d(0);
        this.G = new d(0);
        this.H = new d(0);
        this.S = Sensitivity.NONE;
        this.T = Importance.NONE;
        this.U = Priority.NONE;
        this.V = FlagIcon.NONE;
        this.W = FlagStatus.NONE;
        this.X = ObjectType.NONE;
        this.au = LastVerbExecuted.NONE;
        this.av = new ArrayList<MessageFlag>();
        this.aw = new ArrayList<StoreSupportMask>();
        this.ay = new d(0);
        this.aE = new d(0);
        this.aF = new ArrayList<String>();
        this.aG = new ArrayList<String>();
        this.aH = new ArrayList<String>();
        this.aT = BusyStatus.NONE;
        this.aU = MeetingStatus.NONE;
        this.aV = ResponseStatus.NONE;
        this.aW = RecurrenceType.NONE;
        this.bb = -1;
        this.bi = new d(0);
        this.bj = new d(0);
        this.bn = TaskStatus.NONE;
        this.bo = TaskOwnership.NONE;
        this.bp = TaskDelegationState.NONE;
        this.bq = new d(0);
        this.br = new d(0);
        this.bs = new d(0);
        this.bt = new d(0);
        this.bu = NoteColor.NONE;
        this.bz = new d(0);
        this.bB = new ArrayList<String>();
        this.cL = SelectedMailingAddress.NONE;
        this.di = new ArrayList<Recipient>();
        this.dj = new ArrayList<Attachment>();
        this.dk = new ArrayList<ExtendedProperty>();
        this.dl = new ArrayList<e>();
        this.dm = "001E";
        this.dn = 30;
        this.dw = "101E";
        this.dp = 4126;
        this.dq = 1;
        this.dr = Encoding.UTF8;
        this.ds = Charset.forName("UTF-8");
        this.dt = Charset.forName("UTF-8");
        this.du = Charset.forName("UTF-16LE");
        this.dv = true;
        this.a(directoryEntries, null);
    }
    
    private void a(final DirectoryEntryList list, final HashMap<String, String> hashMap) throws IOException {
        int n = 24;
        this.a = new HashMap<String, g>();
        final Stream stream = (Stream)list.get("__properties_version1.0");
        ByteBuffer wrap = null;
        int int1 = 0;
        int int2 = 0;
        if (stream != null) {
            (wrap = ByteBuffer.wrap(stream.getBuffer())).order(ByteOrder.LITTLE_ENDIAN);
            wrap.getInt(0);
            wrap.getInt(4);
            wrap.getInt(8);
            wrap.getInt(12);
            int1 = wrap.getInt(16);
            int2 = wrap.getInt(20);
        }
        if (!this.dv) {
            if (stream != null) {
                wrap.getInt(24);
                wrap.getInt(28);
            }
            n = 32;
        }
        if (wrap != null) {
            for (int i = n; i <= stream.getBuffer().length - 16; i += 16) {
                final byte[] array = new byte[16];
                System.arraycopy(stream.getBuffer(), i, array, 0, 16);
                final g g;
                final Stream stream2;
                if ((g = new g(array)).d() > 0L && (stream2 = (Stream)list.get("__substg1.0_" + String.format("%08X", g.b()))) != null && stream2.getBuffer() != null && stream2.getBuffer().length > 0) {
                    final byte[] array2 = new byte[stream2.getBuffer().length];
                    System.arraycopy(stream2.getBuffer(), 0, array2, 0, array2.length);
                    g.a(array2);
                }
                this.a.put(String.format("%08X", g.b()), g);
            }
        }
        final g g2;
        if ((g2 = this.a.get("3FDE0003")) != null && g2.e() != null) {
            this.H = new d(g2.e());
        }
        final g g3;
        if ((g3 = this.a.get("3FFD0003")) != null && g3.e() != null) {
            this.E = new d(g3.e());
        }
        if (this.E.intValue() > 0) {
            this.ds = com.ews.msg.h.a(this.E.intValue());
        }
        else if (this.H.intValue() > 0) {
            this.ds = com.ews.msg.h.a(this.H.intValue());
        }
        final g g4;
        if ((g4 = this.a.get("340D0003")) != null && g4.e() != null) {
            final byte[] array3 = new byte[4];
            System.arraycopy(g4.e(), 0, array3, 0, 4);
            final d d = new d(array3);
            this.aw = com.ews.msg.a.c(d.longValue());
            if ((d.longValue() & 0x40000L) == 0x40000L) {
                this.dr = Encoding.UNICODE;
                this.ds = this.du;
                this.dm = "001F";
                this.dn = 31;
                this.dw = "101F";
                this.dp = 4127;
                this.dq = 2;
            }
        }
        final g g5;
        if ((g5 = this.a.get("30070040")) != null && g5.e() != null) {
            this.s = com.ews.msg.h.a(g5.e());
        }
        final g g6;
        if ((g6 = this.a.get("30080040")) != null && g6.e() != null) {
            this.t = com.ews.msg.h.a(g5.e());
        }
        final g g7;
        if ((g7 = this.a.get("0E060040")) != null && g7.e() != null) {
            this.u = com.ews.msg.h.a(g7.e());
        }
        final g g8;
        if ((g8 = this.a.get("00390040")) != null && g8.e() != null) {
            this.v = com.ews.msg.h.a(g8.e());
        }
        final g g9;
        if ((g9 = this.a.get("00480040")) != null && g9.e() != null) {
            this.w = com.ews.msg.h.a(g9.e());
        }
        final g g10;
        if ((g10 = this.a.get("00320040")) != null && g10.e() != null) {
            this.x = com.ews.msg.h.a(g10.e());
        }
        final g g11;
        if ((g11 = this.a.get("10820040")) != null && g11.e() != null) {
            this.at = com.ews.msg.h.a(g11.e());
        }
        final g g12;
        if ((g12 = this.a.get("10800003")) != null && g12.e() != null) {
            this.F = new d(g12.e());
        }
        final g g13;
        if ((g13 = this.a.get("0E080003")) != null && g13.e() != null) {
            this.G = new d(g13.e());
        }
        final g g14;
        if ((g14 = this.a.get("0E070003")) != null && g14.e() != null) {
            this.av = com.ews.msg.a.d(new d(g14.e()).longValue());
        }
        final g g15;
        if ((g15 = this.a.get("10F4000B")) != null && g15.e() != null && new c(g15.e()).intValue() > 0) {
            this.J = true;
        }
        final g g16;
        if ((g16 = this.a.get("10F6000B")) != null && g16.e() != null && new c(g16.e()).intValue() > 0) {
            this.K = true;
        }
        final g g17;
        if ((g17 = this.a.get("10F5000B")) != null && g17.e() != null && new c(g17.e()).intValue() > 0) {
            this.L = true;
        }
        final g g18;
        if ((g18 = this.a.get("10F2000B")) != null && g18.e() != null && new c(g18.e()).intValue() > 0) {
            this.M = true;
        }
        final g g19;
        if ((g19 = this.a.get("0E1B000B")) != null && g19.e() != null && new c(g19.e()).intValue() > 0) {
            this.N = true;
        }
        final g g20;
        if ((g20 = this.a.get("0E1F000B")) != null && g20.e() != null && new c(g20.e()).intValue() > 0) {
            this.O = true;
        }
        final g g21;
        if ((g21 = this.a.get("0029000B")) != null && g21.e() != null && new c(g21.e()).intValue() > 0) {
            this.P = true;
        }
        final g g22;
        if ((g22 = this.a.get("0023000B")) != null && g22.e() != null && new c(g22.e()).intValue() > 0) {
            this.Q = true;
        }
        final g g23;
        if ((g23 = this.a.get("00360003")) != null && g23.e() != null) {
            this.S = com.ews.msg.a.l(new d(g23.e()).longValue());
        }
        final g g24;
        if ((g24 = this.a.get("10810003")) != null && g24.e() != null) {
            this.au = com.ews.msg.a.a(new d(g24.e()).longValue());
        }
        final g g25;
        if ((g25 = this.a.get("00170003")) != null && g25.e() != null) {
            this.T = com.ews.msg.a.m(new d(g25.e()).longValue());
        }
        final g g26;
        if ((g26 = this.a.get("00260003")) != null && g26.e() != null) {
            this.U = com.ews.msg.a.k(new d(g26.e()).longValue());
        }
        final g g27;
        if ((g27 = this.a.get("10950003")) != null && g27.e() != null) {
            this.V = com.ews.msg.a.e(new d(g27.e()).longValue());
        }
        final g g28;
        if ((g28 = this.a.get("10900003")) != null && g28.e() != null) {
            this.W = com.ews.msg.a.g(new d(g28.e()).longValue());
        }
        final g g29;
        if ((g29 = this.a.get("0FFE0003")) != null && g29.e() != null) {
            this.X = com.ews.msg.a.b(new d(g29.e()).longValue());
        }
        final String a = com.ews.msg.h.a(34132, StandardPropertySet.COMMON);
        final g g30;
        if (hashMap != null && hashMap.get(a) != null && (g30 = this.a.get(hashMap.get(a) + this.dm)) != null && g30.e() != null) {
            this.ax = this.ds.decode(ByteBuffer.wrap(g30.e())).toString();
        }
        final String a2 = com.ews.msg.h.a(34130, StandardPropertySet.COMMON);
        final g g31;
        if (hashMap != null && hashMap.get(a2) != null && (g31 = this.a.get(hashMap.get(a2) + "0003")) != null && g31.e() != null) {
            this.ay = new d(g31.e());
        }
        final String a3 = com.ews.msg.h.a(34070, StandardPropertySet.COMMON);
        final g g32;
        if (hashMap != null && hashMap.get(a3) != null && (g32 = this.a.get(hashMap.get(a3) + "0040")) != null && g32.e() != null) {
            this.az = com.ews.msg.h.a(g32.e());
        }
        final String a4 = com.ews.msg.h.a(34071, StandardPropertySet.COMMON);
        final g g33;
        if (hashMap != null && hashMap.get(a4) != null && (g33 = this.a.get(hashMap.get(a4) + "0040")) != null && g33.e() != null) {
            this.aA = com.ews.msg.h.a(g33.e());
        }
        final String a5 = com.ews.msg.h.a(34144, StandardPropertySet.COMMON);
        final g g34;
        if (hashMap != null && hashMap.get(a5) != null && (g34 = this.a.get(hashMap.get(a5) + "0040")) != null && g34.e() != null) {
            this.aB = com.ews.msg.h.a(g34.e());
        }
        final String a6 = com.ews.msg.h.a(34105, StandardPropertySet.COMMON);
        if (hashMap != null && hashMap.get(a6) != null) {
            final String string = hashMap.get(a6) + this.dw;
            final g g35;
            if ((g35 = this.a.get(string)) != null && g35.e() != null) {
                for (int n2 = (int)g35.d() / 4, j = 0; j < n2; ++j) {
                    final Stream stream3;
                    if ((stream3 = (Stream)list.get("__substg1.0_" + string + "-" + String.format("%08X", j))) != null && stream3.getBuffer() != null) {
                        this.aF.add(this.ds.decode(ByteBuffer.wrap(stream3.getBuffer(), 0, stream3.getBuffer().length - this.dq)).toString());
                    }
                }
            }
        }
        final String a7 = com.ews.msg.h.a(34106, StandardPropertySet.COMMON);
        if (hashMap != null && hashMap.get(a7) != null) {
            final String string2 = hashMap.get(a7) + this.dw;
            final g g36;
            if ((g36 = this.a.get(string2)) != null && g36.e() != null) {
                for (int n3 = (int)g36.d() / 4, k = 0; k < n3; ++k) {
                    final Stream stream4;
                    if ((stream4 = (Stream)list.get("__substg1.0_" + string2 + "-" + String.format("%08X", k))) != null && stream4.getBuffer() != null) {
                        this.aG.add(this.ds.decode(ByteBuffer.wrap(stream4.getBuffer(), 0, stream4.getBuffer().length - this.dq)).toString());
                    }
                }
            }
        }
        final String a8 = com.ews.msg.h.a("Keywords", StandardPropertySet.PUBLIC_STRINGS);
        if (hashMap != null && hashMap.get(a8) != null) {
            final String string3 = hashMap.get(a8) + this.dw;
            final g g37;
            if ((g37 = this.a.get(string3)) != null && g37.e() != null) {
                for (int n4 = (int)g37.d() / 4, l = 0; l < n4; ++l) {
                    final Stream stream5;
                    if ((stream5 = (Stream)list.get("__substg1.0_" + string3 + "-" + String.format("%08X", l))) != null && stream5.getBuffer() != null) {
                        this.aH.add(this.ds.decode(ByteBuffer.wrap(stream5.getBuffer(), 0, stream5.getBuffer().length - this.dq)).toString());
                    }
                }
            }
        }
        final String a9 = com.ews.msg.h.a(34101, StandardPropertySet.COMMON);
        final g g38;
        if (hashMap != null && hashMap.get(a9) != null && (g38 = this.a.get(hashMap.get(a9) + this.dm)) != null && g38.e() != null) {
            this.aI = this.ds.decode(ByteBuffer.wrap(g38.e())).toString();
        }
        final String a10 = com.ews.msg.h.a(34100, StandardPropertySet.COMMON);
        final g g39;
        if (hashMap != null && hashMap.get(a10) != null && (g39 = this.a.get(hashMap.get(a10) + this.dm)) != null && g39.e() != null) {
            this.aJ = this.ds.decode(ByteBuffer.wrap(g39.e())).toString();
        }
        final String a11 = com.ews.msg.h.a(34079, StandardPropertySet.COMMON);
        final g g40;
        if (hashMap != null && hashMap.get(a11) != null && (g40 = this.a.get(hashMap.get(a11) + this.dm)) != null && g40.e() != null) {
            this.aK = this.ds.decode(ByteBuffer.wrap(g40.e())).toString();
        }
        final String a12 = com.ews.msg.h.a(34054, StandardPropertySet.COMMON);
        final g g41;
        if (hashMap != null && hashMap.get(a12) != null && (g41 = this.a.get(hashMap.get(a12) + "000B")) != null && g41.e() != null && new c(g41.e()).intValue() > 0) {
            this.aL = true;
        }
        final String a13 = com.ews.msg.h.a(34076, StandardPropertySet.COMMON);
        final g g42;
        if (hashMap != null && hashMap.get(a13) != null && (g42 = this.a.get(hashMap.get(a13) + "000B")) != null && g42.e() != null && new c(g42.e()).intValue() > 0) {
            this.aN = true;
        }
        final String a14 = com.ews.msg.h.a(34078, StandardPropertySet.COMMON);
        final g g43;
        if (hashMap != null && hashMap.get(a14) != null && (g43 = this.a.get(hashMap.get(a14) + "000B")) != null && g43.e() != null && new c(g43.e()).intValue() > 0) {
            this.aO = true;
        }
        final String a15 = com.ews.msg.h.a(33293, StandardPropertySet.APPOINTMENT);
        final g g44;
        if (hashMap != null && hashMap.get(a15) != null && (g44 = this.a.get(hashMap.get(a15) + "0040")) != null && g44.e() != null) {
            this.aP = com.ews.msg.h.a(g44.e());
        }
        final String a16 = com.ews.msg.h.a(33294, StandardPropertySet.APPOINTMENT);
        final g g45;
        if (hashMap != null && hashMap.get(a16) != null && (g45 = this.a.get(hashMap.get(a16) + "0040")) != null && g45.e() != null) {
            this.aQ = com.ews.msg.h.a(g45.e());
        }
        final String a17 = com.ews.msg.h.a(33288, StandardPropertySet.APPOINTMENT);
        final g g46;
        if (hashMap != null && hashMap.get(a17) != null && (g46 = this.a.get(hashMap.get(a17) + this.dm)) != null && g46.e() != null) {
            this.aS = this.ds.decode(ByteBuffer.wrap(g46.e())).toString();
        }
        final String a18 = com.ews.msg.h.a(36, new byte[] { -112, -38, -40, 110, 11, 69, 27, 16, -104, -38, 0, -86, 0, 63, 19, 5 });
        final g g47;
        if (hashMap != null && hashMap.get(a18) != null && (g47 = this.a.get(hashMap.get(a18) + this.dm)) != null && g47.e() != null) {
            this.aX = this.ds.decode(ByteBuffer.wrap(g47.e())).toString();
        }
        final String a19 = com.ews.msg.h.a(33332, StandardPropertySet.APPOINTMENT);
        final g g48;
        if (hashMap != null && hashMap.get(a19) != null && (g48 = this.a.get(hashMap.get(a19) + this.dm)) != null && g48.e() != null) {
            this.aY = this.ds.decode(ByteBuffer.wrap(g48.e())).toString();
        }
        final String a20 = com.ews.msg.h.a(33330, StandardPropertySet.APPOINTMENT);
        final g g49;
        if (hashMap != null && hashMap.get(a20) != null && (g49 = this.a.get(hashMap.get(a20) + this.dm)) != null && g49.e() != null) {
            this.aZ = this.ds.decode(ByteBuffer.wrap(g49.e())).toString();
        }
        final String a21 = com.ews.msg.h.a(33285, StandardPropertySet.APPOINTMENT);
        final g g50;
        if (hashMap != null && hashMap.get(a21) != null && (g50 = this.a.get(hashMap.get(a21) + "0003")) != null && g50.e() != null) {
            this.aT = com.ews.msg.a.p(new d(g50.e()).longValue());
        }
        final String a22 = com.ews.msg.h.a(33303, StandardPropertySet.APPOINTMENT);
        final g g51;
        if (hashMap != null && hashMap.get(a22) != null && (g51 = this.a.get(hashMap.get(a22) + "0003")) != null && g51.e() != null) {
            this.aU = com.ews.msg.a.s(new d(g51.e()).longValue());
        }
        final String a23 = com.ews.msg.h.a(33304, StandardPropertySet.APPOINTMENT);
        final g g52;
        if (hashMap != null && hashMap.get(a23) != null && (g52 = this.a.get(hashMap.get(a23) + "0003")) != null && g52.e() != null) {
            this.aV = com.ews.msg.a.r(new d(g52.e()).longValue());
        }
        final String a24 = com.ews.msg.h.a(33329, StandardPropertySet.APPOINTMENT);
        final g g53;
        if (hashMap != null && hashMap.get(a24) != null && (g53 = this.a.get(hashMap.get(a24) + "0003")) != null && g53.e() != null) {
            this.aW = com.ews.msg.a.q(new d(g53.e()).longValue());
        }
        final String a25 = com.ews.msg.h.a(3, new byte[] { -112, -38, -40, 110, 11, 69, 27, 16, -104, -38, 0, -86, 0, 63, 19, 5 });
        final g g54;
        if (hashMap != null && hashMap.get(a25) != null && (g54 = this.a.get(hashMap.get(a25) + "0102")) != null && g54.e() != null) {
            this.ba = g54.e();
        }
        final String a26 = com.ews.msg.h.a(33300, StandardPropertySet.APPOINTMENT);
        final g g55;
        if (hashMap != null && hashMap.get(a26) != null && (g55 = this.a.get(hashMap.get(a26) + "0003")) != null && g55.e() != null) {
            final ByteBuffer wrap2;
            (wrap2 = ByteBuffer.wrap(g55.e())).order(ByteOrder.LITTLE_ENDIAN);
            this.bb = wrap2.getInt();
        }
        final String a27 = com.ews.msg.h.a(33299, StandardPropertySet.APPOINTMENT);
        final g g56;
        if (hashMap != null && hashMap.get(a27) != null && (g56 = this.a.get(hashMap.get(a27) + "0003")) != null && g56.e() != null) {
            final ByteBuffer wrap3;
            (wrap3 = ByteBuffer.wrap(g56.e())).order(ByteOrder.LITTLE_ENDIAN);
            this.bc = wrap3.getInt();
        }
        final String a28 = com.ews.msg.h.a(33055, StandardPropertySet.TASK);
        final g g57;
        if (hashMap != null && hashMap.get(a28) != null && (g57 = this.a.get(hashMap.get(a28) + this.dm)) != null && g57.e() != null) {
            this.bf = this.ds.decode(ByteBuffer.wrap(g57.e())).toString();
        }
        final String a29 = com.ews.msg.h.a(33057, StandardPropertySet.TASK);
        final g g58;
        if (hashMap != null && hashMap.get(a29) != null && (g58 = this.a.get(hashMap.get(a29) + this.dm)) != null && g58.e() != null) {
            this.bg = this.ds.decode(ByteBuffer.wrap(g58.e())).toString();
        }
        final String a30 = com.ews.msg.h.a(33026, StandardPropertySet.TASK);
        final g g59;
        if (hashMap != null && hashMap.get(a30) != null && (g59 = this.a.get(hashMap.get(a30) + "0005")) != null && g59.e() != null) {
            final ByteBuffer wrap4;
            (wrap4 = ByteBuffer.wrap(g59.e())).order(ByteOrder.LITTLE_ENDIAN);
            this.bh = wrap4.getDouble();
            this.bh *= 100.0;
        }
        final String a31 = com.ews.msg.h.a(33040, StandardPropertySet.TASK);
        final g g60;
        if (hashMap != null && hashMap.get(a31) != null && (g60 = this.a.get(hashMap.get(a31) + "0003")) != null && g60.e() != null) {
            this.bi = new d(g60.e());
        }
        final String a32 = com.ews.msg.h.a(33041, StandardPropertySet.TASK);
        final g g61;
        if (hashMap != null && hashMap.get(a32) != null && (g61 = this.a.get(hashMap.get(a32) + "0003")) != null && g61.e() != null) {
            this.bj = new d(g61.e());
        }
        final String a33 = com.ews.msg.h.a(33027, StandardPropertySet.TASK);
        final g g62;
        if (hashMap != null && hashMap.get(a33) != null && (g62 = this.a.get(hashMap.get(a33) + "000B")) != null && g62.e() != null && new c(g62.e()).intValue() > 0) {
            this.bk = true;
        }
        final String a34 = com.ews.msg.h.a(33052, StandardPropertySet.TASK);
        final g g63;
        if (hashMap != null && hashMap.get(a34) != null && (g63 = this.a.get(hashMap.get(a34) + "000B")) != null && g63.e() != null && new c(g63.e()).intValue() > 0) {
            this.bl = true;
        }
        final String a35 = com.ews.msg.h.a(33315, StandardPropertySet.APPOINTMENT);
        final g g64;
        if (hashMap != null && hashMap.get(a35) != null && (g64 = this.a.get(hashMap.get(a35) + "000B")) != null && g64.e() != null && new c(g64.e()).intValue() > 0) {
            this.aC = true;
        }
        final String a36 = com.ews.msg.h.a(33301, StandardPropertySet.APPOINTMENT);
        final g g65;
        if (hashMap != null && hashMap.get(a36) != null && (g65 = this.a.get(hashMap.get(a36) + "000B")) != null && g65.e() != null && new c(g65.e()).intValue() > 0) {
            this.aR = true;
        }
        final String a37 = com.ews.msg.h.a(34051, StandardPropertySet.COMMON);
        final g g66;
        if (hashMap != null && hashMap.get(a37) != null && (g66 = this.a.get(hashMap.get(a37) + "000B")) != null && g66.e() != null && new c(g66.e()).intValue() > 0) {
            this.aM = true;
        }
        final String a38 = com.ews.msg.h.a(34050, StandardPropertySet.COMMON);
        final g g67;
        if (hashMap != null && hashMap.get(a38) != null && (g67 = this.a.get(hashMap.get(a38) + "0040")) != null && g67.e() != null) {
            this.aD = com.ews.msg.h.a(g67.e());
        }
        final String a39 = com.ews.msg.h.a(34049, StandardPropertySet.COMMON);
        final g g68;
        if (hashMap != null && hashMap.get(a39) != null && (g68 = this.a.get(hashMap.get(a39) + "0003")) != null && g68.e() != null) {
            this.aE = new d(g68.e());
        }
        final String a40 = com.ews.msg.h.a(33028, StandardPropertySet.TASK);
        final g g69;
        if (hashMap != null && hashMap.get(a40) != null && (g69 = this.a.get(hashMap.get(a40) + "0040")) != null && g69.e() != null) {
            this.bd = com.ews.msg.h.a(g69.e());
        }
        final String a41 = com.ews.msg.h.a(33029, StandardPropertySet.TASK);
        final g g70;
        if (hashMap != null && hashMap.get(a41) != null && (g70 = this.a.get(hashMap.get(a41) + "0040")) != null && g70.e() != null) {
            this.be = com.ews.msg.h.a(g70.e());
        }
        final String a42 = com.ews.msg.h.a(33039, StandardPropertySet.TASK);
        final g g71;
        if (hashMap != null && hashMap.get(a42) != null && (g71 = this.a.get(hashMap.get(a42) + "0040")) != null && g71.e() != null) {
            this.bm = com.ews.msg.h.a(g71.e());
        }
        final String a43 = com.ews.msg.h.a(33025, StandardPropertySet.TASK);
        final g g72;
        if (hashMap != null && hashMap.get(a43) != null && (g72 = this.a.get(hashMap.get(a43) + "0003")) != null && g72.e() != null) {
            this.bn = com.ews.msg.a.t(new d(g72.e()).longValue());
        }
        final String a44 = com.ews.msg.h.a(33065, StandardPropertySet.TASK);
        final g g73;
        if (hashMap != null && hashMap.get(a44) != null && (g73 = this.a.get(hashMap.get(a44) + "0003")) != null && g73.e() != null) {
            this.bo = com.ews.msg.a.n(new d(g73.e()).longValue());
        }
        final String a45 = com.ews.msg.h.a(33066, StandardPropertySet.TASK);
        final g g74;
        if (hashMap != null && hashMap.get(a45) != null && (g74 = this.a.get(hashMap.get(a45) + "0003")) != null && g74.e() != null) {
            this.bp = com.ews.msg.a.o(new d(g74.e()).longValue());
        }
        final String a46 = com.ews.msg.h.a(35589, StandardPropertySet.NOTE);
        final g g75;
        if (hashMap != null && hashMap.get(a46) != null && (g75 = this.a.get(hashMap.get(a46) + "0003")) != null && g75.e() != null) {
            this.bt = new d(g75.e());
        }
        final String a47 = com.ews.msg.h.a(35588, StandardPropertySet.NOTE);
        final g g76;
        if (hashMap != null && hashMap.get(a47) != null && (g76 = this.a.get(hashMap.get(a47) + "0003")) != null && g76.e() != null) {
            this.bs = new d(g76.e());
        }
        final String a48 = com.ews.msg.h.a(35587, StandardPropertySet.NOTE);
        final g g77;
        if (hashMap != null && hashMap.get(a48) != null && (g77 = this.a.get(hashMap.get(a48) + "0003")) != null && g77.e() != null) {
            this.br = new d(g77.e());
        }
        final String a49 = com.ews.msg.h.a(35586, StandardPropertySet.NOTE);
        final g g78;
        if (hashMap != null && hashMap.get(a49) != null && (g78 = this.a.get(hashMap.get(a49) + "0003")) != null && g78.e() != null) {
            this.bq = new d(g78.e());
        }
        final String a50 = com.ews.msg.h.a(35584, StandardPropertySet.NOTE);
        final g g79;
        if (hashMap != null && hashMap.get(a50) != null && (g79 = this.a.get(hashMap.get(a50) + "0003")) != null && g79.e() != null) {
            this.bu = com.ews.msg.a.i(new d(g79.e()).longValue());
        }
        final String a51 = com.ews.msg.h.a(34566, StandardPropertySet.JOURNAL);
        final g g80;
        if (hashMap != null && hashMap.get(a51) != null && (g80 = this.a.get(hashMap.get(a51) + "0040")) != null && g80.e() != null) {
            this.bv = com.ews.msg.h.a(g80.e());
        }
        final String a52 = com.ews.msg.h.a(34568, StandardPropertySet.JOURNAL);
        final g g81;
        if (hashMap != null && hashMap.get(a52) != null && (g81 = this.a.get(hashMap.get(a52) + "0040")) != null && g81.e() != null) {
            this.bw = com.ews.msg.h.a(g81.e());
        }
        final String a53 = com.ews.msg.h.a(34560, StandardPropertySet.JOURNAL);
        final g g82;
        if (hashMap != null && hashMap.get(a53) != null && (g82 = this.a.get(hashMap.get(a53) + this.dm)) != null && g82.e() != null) {
            this.bx = this.ds.decode(ByteBuffer.wrap(g82.e())).toString();
        }
        final String a54 = com.ews.msg.h.a(34578, StandardPropertySet.JOURNAL);
        final g g83;
        if (hashMap != null && hashMap.get(a54) != null && (g83 = this.a.get(hashMap.get(a54) + this.dm)) != null && g83.e() != null) {
            this.by = this.ds.decode(ByteBuffer.wrap(g83.e())).toString();
        }
        final String a55 = com.ews.msg.h.a(34567, StandardPropertySet.JOURNAL);
        final g g84;
        if (hashMap != null && hashMap.get(a55) != null && (g84 = this.a.get(hashMap.get(a55) + "0003")) != null && g84.e() != null) {
            this.bz = new d(g84.e());
        }
        final g g85;
        if ((g85 = this.a.get("3A420040")) != null && g85.e() != null) {
            this.bA = com.ews.msg.h.a(g85.e());
        }
        final g g86;
        if ((g86 = this.a.get("3A58" + this.dw)) != null && g86.e() != null) {
            for (int n5 = (int)g86.d() / 4, n6 = 0; n6 < n5; ++n6) {
                final Stream stream6;
                if ((stream6 = (Stream)list.get("__substg1.0_3A58" + this.dw + "-" + String.format("%08X", n6))) != null && stream6.getBuffer() != null) {
                    this.bB.add(this.ds.decode(ByteBuffer.wrap(stream6.getBuffer(), 0, stream6.getBuffer().length - this.dq)).toString());
                }
            }
        }
        final g g87;
        if ((g87 = this.a.get("3A410040")) != null && g87.e() != null) {
            this.cK = com.ews.msg.h.a(g87.e());
        }
        final String a56 = com.ews.msg.h.a(32802, StandardPropertySet.ADDRESS);
        final g g88;
        if (hashMap != null && hashMap.get(a56) != null && (g88 = this.a.get(hashMap.get(a56) + "0003")) != null && g88.e() != null) {
            this.cL = com.ews.msg.a.f(new d(g88.e()).longValue());
        }
        final String a57 = com.ews.msg.h.a(32789, StandardPropertySet.ADDRESS);
        final g g89;
        if (hashMap != null && hashMap.get(a57) != null && (g89 = this.a.get(hashMap.get(a57) + "000B")) != null && g89.e() != null && new c(g89.e()).intValue() > 0) {
            this.cM = true;
        }
        final String a58 = com.ews.msg.h.a(32773, StandardPropertySet.ADDRESS);
        final g g90;
        if (hashMap != null && hashMap.get(a58) != null && (g90 = this.a.get(hashMap.get(a58) + this.dm)) != null && g90.e() != null) {
            this.cN = this.ds.decode(ByteBuffer.wrap(g90.e())).toString();
        }
        final String a59 = com.ews.msg.h.a(32866, StandardPropertySet.ADDRESS);
        final g g91;
        if (hashMap != null && hashMap.get(a59) != null && (g91 = this.a.get(hashMap.get(a59) + this.dm)) != null && g91.e() != null) {
            this.cO = this.ds.decode(ByteBuffer.wrap(g91.e())).toString();
        }
        final String a60 = com.ews.msg.h.a(32984, StandardPropertySet.ADDRESS);
        final g g92;
        if (hashMap != null && hashMap.get(a60) != null && (g92 = this.a.get(hashMap.get(a60) + this.dm)) != null && g92.e() != null) {
            this.cP = this.ds.decode(ByteBuffer.wrap(g92.e())).toString();
        }
        final String a61 = com.ews.msg.h.a(32795, StandardPropertySet.ADDRESS);
        final g g93;
        if (hashMap != null && hashMap.get(a61) != null && (g93 = this.a.get(hashMap.get(a61) + this.dm)) != null && g93.e() != null) {
            this.cQ = this.ds.decode(ByteBuffer.wrap(g93.e())).toString();
        }
        final String a62 = com.ews.msg.h.a(32837, StandardPropertySet.ADDRESS);
        final g g94;
        if (hashMap != null && hashMap.get(a62) != null && (g94 = this.a.get(hashMap.get(a62) + this.dm)) != null && g94.e() != null) {
            this.cA = this.ds.decode(ByteBuffer.wrap(g94.e())).toString();
        }
        final String a63 = com.ews.msg.h.a(32838, StandardPropertySet.ADDRESS);
        final g g95;
        if (hashMap != null && hashMap.get(a63) != null && (g95 = this.a.get(hashMap.get(a63) + this.dm)) != null && g95.e() != null) {
            this.cw = this.ds.decode(ByteBuffer.wrap(g95.e())).toString();
        }
        final String a64 = com.ews.msg.h.a(32839, StandardPropertySet.ADDRESS);
        final g g96;
        if (hashMap != null && hashMap.get(a64) != null && (g96 = this.a.get(hashMap.get(a64) + this.dm)) != null && g96.e() != null) {
            this.cz = this.ds.decode(ByteBuffer.wrap(g96.e())).toString();
        }
        final String a65 = com.ews.msg.h.a(32840, StandardPropertySet.ADDRESS);
        final g g97;
        if (hashMap != null && hashMap.get(a65) != null && (g97 = this.a.get(hashMap.get(a65) + this.dm)) != null && g97.e() != null) {
            this.cx = this.ds.decode(ByteBuffer.wrap(g97.e())).toString();
        }
        final String a66 = com.ews.msg.h.a(32841, StandardPropertySet.ADDRESS);
        final g g98;
        if (hashMap != null && hashMap.get(a66) != null && (g98 = this.a.get(hashMap.get(a66) + this.dm)) != null && g98.e() != null) {
            this.cv = this.ds.decode(ByteBuffer.wrap(g98.e())).toString();
        }
        final String a67 = com.ews.msg.h.a(32794, StandardPropertySet.ADDRESS);
        final g g99;
        if (hashMap != null && hashMap.get(a67) != null && (g99 = this.a.get(hashMap.get(a67) + this.dm)) != null && g99.e() != null) {
            this.cR = this.ds.decode(ByteBuffer.wrap(g99.e())).toString();
        }
        final String a68 = com.ews.msg.h.a(32796, StandardPropertySet.ADDRESS);
        final g g100;
        if (hashMap != null && hashMap.get(a68) != null && (g100 = this.a.get(hashMap.get(a68) + this.dm)) != null && g100.e() != null) {
            this.cS = this.ds.decode(ByteBuffer.wrap(g100.e())).toString();
        }
        final String a69 = com.ews.msg.h.a(32899, StandardPropertySet.ADDRESS);
        final g g101;
        if (hashMap != null && hashMap.get(a69) != null && (g101 = this.a.get(hashMap.get(a69) + this.dm)) != null && g101.e() != null) {
            this.cT = this.ds.decode(ByteBuffer.wrap(g101.e())).toString();
        }
        final String a70 = com.ews.msg.h.a(32915, StandardPropertySet.ADDRESS);
        final g g102;
        if (hashMap != null && hashMap.get(a70) != null && (g102 = this.a.get(hashMap.get(a70) + this.dm)) != null && g102.e() != null) {
            this.cU = this.ds.decode(ByteBuffer.wrap(g102.e())).toString();
        }
        final String a71 = com.ews.msg.h.a(32931, StandardPropertySet.ADDRESS);
        final g g103;
        if (hashMap != null && hashMap.get(a71) != null && (g103 = this.a.get(hashMap.get(a71) + this.dm)) != null && g103.e() != null) {
            this.cV = this.ds.decode(ByteBuffer.wrap(g103.e())).toString();
        }
        final String a72 = com.ews.msg.h.a(32900, StandardPropertySet.ADDRESS);
        final g g104;
        if (hashMap != null && hashMap.get(a72) != null && (g104 = this.a.get(hashMap.get(a72) + this.dm)) != null && g104.e() != null) {
            this.cW = this.ds.decode(ByteBuffer.wrap(g104.e())).toString();
        }
        final String a73 = com.ews.msg.h.a(32916, StandardPropertySet.ADDRESS);
        final g g105;
        if (hashMap != null && hashMap.get(a73) != null && (g105 = this.a.get(hashMap.get(a73) + this.dm)) != null && g105.e() != null) {
            this.cX = this.ds.decode(ByteBuffer.wrap(g105.e())).toString();
        }
        final String a74 = com.ews.msg.h.a(32932, StandardPropertySet.ADDRESS);
        final g g106;
        if (hashMap != null && hashMap.get(a74) != null && (g106 = this.a.get(hashMap.get(a74) + this.dm)) != null && g106.e() != null) {
            this.cY = this.ds.decode(ByteBuffer.wrap(g106.e())).toString();
        }
        final String a75 = com.ews.msg.h.a(32896, StandardPropertySet.ADDRESS);
        final g g107;
        if (hashMap != null && hashMap.get(a75) != null && (g107 = this.a.get(hashMap.get(a75) + this.dm)) != null && g107.e() != null) {
            this.cZ = this.ds.decode(ByteBuffer.wrap(g107.e())).toString();
        }
        final String a76 = com.ews.msg.h.a(32912, StandardPropertySet.ADDRESS);
        final g g108;
        if (hashMap != null && hashMap.get(a76) != null && (g108 = this.a.get(hashMap.get(a76) + this.dm)) != null && g108.e() != null) {
            this.da = this.ds.decode(ByteBuffer.wrap(g108.e())).toString();
        }
        final String a77 = com.ews.msg.h.a(32928, StandardPropertySet.ADDRESS);
        final g g109;
        if (hashMap != null && hashMap.get(a77) != null && (g109 = this.a.get(hashMap.get(a77) + this.dm)) != null && g109.e() != null) {
            this.db = this.ds.decode(ByteBuffer.wrap(g109.e())).toString();
        }
        final String a78 = com.ews.msg.h.a(32898, StandardPropertySet.ADDRESS);
        final g g110;
        if (hashMap != null && hashMap.get(a78) != null && (g110 = this.a.get(hashMap.get(a78) + this.dm)) != null && g110.e() != null) {
            this.dc = this.ds.decode(ByteBuffer.wrap(g110.e())).toString();
        }
        final String a79 = com.ews.msg.h.a(32914, StandardPropertySet.ADDRESS);
        final g g111;
        if (hashMap != null && hashMap.get(a79) != null && (g111 = this.a.get(hashMap.get(a79) + this.dm)) != null && g111.e() != null) {
            this.dd = this.ds.decode(ByteBuffer.wrap(g111.e())).toString();
        }
        final String a80 = com.ews.msg.h.a(32930, StandardPropertySet.ADDRESS);
        final g g112;
        if (hashMap != null && hashMap.get(a80) != null && (g112 = this.a.get(hashMap.get(a80) + this.dm)) != null && g112.e() != null) {
            this.de = this.ds.decode(ByteBuffer.wrap(g112.e())).toString();
        }
        final String a81 = com.ews.msg.h.a(32901, StandardPropertySet.ADDRESS);
        final g g113;
        if (hashMap != null && hashMap.get(a81) != null && (g113 = this.a.get(hashMap.get(a81) + "0102")) != null && g113.e() != null) {
            this.df = g113.e();
        }
        final String a82 = com.ews.msg.h.a(32917, StandardPropertySet.ADDRESS);
        final g g114;
        if (hashMap != null && hashMap.get(a82) != null && (g114 = this.a.get(hashMap.get(a82) + "0102")) != null && g114.e() != null) {
            this.dg = g114.e();
        }
        final String a83 = com.ews.msg.h.a(32933, StandardPropertySet.ADDRESS);
        final g g115;
        if (hashMap != null && hashMap.get(a83) != null && (g115 = this.a.get(hashMap.get(a83) + "0102")) != null && g115.e() != null) {
            this.dh = g115.e();
        }
        for (int n7 = 0; n7 < this.dk.size(); ++n7) {
            String s;
            if (this.dk.get(n7).getTag() instanceof ExtendedPropertyId) {
                final ExtendedPropertyId extendedPropertyId = (ExtendedPropertyId)this.dk.get(n7).getTag();
                s = com.ews.msg.h.a(extendedPropertyId.getId(), extendedPropertyId.getGuid());
            }
            else {
                final ExtendedPropertyName extendedPropertyName = (ExtendedPropertyName)this.dk.get(n7).getTag();
                s = com.ews.msg.h.a(extendedPropertyName.getName(), extendedPropertyName.getGuid());
            }
            if (hashMap != null && hashMap.get(s) != null) {
                String string4 = hashMap.get(s);
                final Iterator<String> iterator = this.a.keySet().iterator();
                while (iterator.hasNext()) {
                    final String s2;
                    if ((s2 = iterator.next()).startsWith(string4)) {
                        final g g116 = this.a.get(s2);
                        this.dk.get(n7).getTag().setType(g116.c());
                        if (this.dk.get(n7).getTag().getType() == PropertyType.MULTIPLE_BINARY) {
                            string4 += "1102";
                            if (g116 == null || g116.e() == null) {
                                continue;
                            }
                            final int n8 = (int)g116.d() / 8;
                            final ArrayList<byte[]> list2 = new ArrayList<byte[]>();
                            for (int n9 = 0; n9 < n8; ++n9) {
                                final Stream stream7;
                                if ((stream7 = (Stream)list.get("__substg1.0_" + string4 + "-" + String.format("%08X", n9))) != null && stream7.getBuffer() != null) {
                                    list2.add(stream7.getBuffer());
                                }
                            }
                            if (list2.size() <= 0) {
                                continue;
                            }
                            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(new d(list2.size()).a());
                            int n10 = 0;
                            for (int n11 = 0; n11 < list2.size(); ++n11) {
                                final byte[] array4 = list2.get(n11);
                                byteArrayOutputStream.write(new d(4 + (list2.size() << 2) + n10).a());
                                n10 += array4.length;
                            }
                            for (int n12 = 0; n12 < list2.size(); ++n12) {
                                byteArrayOutputStream.write((byte[])list2.get(n12));
                            }
                            this.dk.get(n7).setValue(byteArrayOutputStream.toByteArray());
                        }
                        else {
                            this.dk.get(n7).setValue(g116.e());
                        }
                    }
                }
            }
        }
        final Stream stream8 = (Stream)list.get("__substg1.0_001A" + this.dm);
        final Stream stream9 = (Stream)list.get("__substg1.0_0037" + this.dm);
        final Stream stream10 = (Stream)list.get("__substg1.0_003D" + this.dm);
        final Stream stream11 = (Stream)list.get("__substg1.0_0070" + this.dm);
        final Stream stream12 = (Stream)list.get("__substg1.0_0E02" + this.dm);
        final Stream stream13 = (Stream)list.get("__substg1.0_0E03" + this.dm);
        final Stream stream14 = (Stream)list.get("__substg1.0_0E04" + this.dm);
        final Stream stream15 = (Stream)list.get("__substg1.0_0074" + this.dm);
        final Stream stream16 = (Stream)list.get("__substg1.0_0050" + this.dm);
        final Stream stream17 = (Stream)list.get("__substg1.0_0E1D" + this.dm);
        final Stream stream18 = (Stream)list.get("__substg1.0_1000" + this.dm);
        final Stream stream19 = (Stream)list.get("__substg1.0_10090102");
        final Stream stream20 = (Stream)list.get("__substg1.0_300B0102");
        final Stream stream21 = (Stream)list.get("__substg1.0_65E20102");
        final Stream stream22 = (Stream)list.get("__substg1.0_0FFF0102");
        final Stream stream23 = (Stream)list.get("__substg1.0_00460102");
        final Stream stream24 = (Stream)list.get("__substg1.0_00530102");
        final Stream stream25 = (Stream)list.get("__substg1.0_1001" + this.dm);
        final Stream stream26 = (Stream)list.get("__substg1.0_3FF8" + this.dm);
        final Stream stream27 = (Stream)list.get("__substg1.0_3FFA" + this.dm);
        final Stream stream28 = (Stream)list.get("__substg1.0_1035" + this.dm);
        final Stream stream29 = (Stream)list.get("__substg1.0_1042" + this.dm);
        final Stream stream30 = (Stream)list.get("__substg1.0_1039" + this.dm);
        final Stream stream31 = (Stream)list.get("__substg1.0_00710102");
        final Stream stream32 = (Stream)list.get("__substg1.0_10130102");
        final Stream stream33 = (Stream)list.get("__substg1.0_1013" + this.dm);
        final Stream stream34 = (Stream)list.get("__substg1.0_0077" + this.dm);
        final Stream stream35 = (Stream)list.get("__substg1.0_0078" + this.dm);
        final Stream stream36 = (Stream)list.get("__substg1.0_00430102");
        final Stream stream37 = (Stream)list.get("__substg1.0_0044" + this.dm);
        final Stream stream38 = (Stream)list.get("__substg1.0_00520102");
        final Stream stream39 = (Stream)list.get("__substg1.0_0075" + this.dm);
        final Stream stream40 = (Stream)list.get("__substg1.0_0076" + this.dm);
        final Stream stream41 = (Stream)list.get("__substg1.0_003F0102");
        final Stream stream42 = (Stream)list.get("__substg1.0_0040" + this.dm);
        final Stream stream43 = (Stream)list.get("__substg1.0_00510102");
        final Stream stream44 = (Stream)list.get("__substg1.0_0C1E" + this.dm);
        final Stream stream45 = (Stream)list.get("__substg1.0_0C1F" + this.dm);
        final Stream stream46 = (Stream)list.get("__substg1.0_0C190102");
        final Stream stream47 = (Stream)list.get("__substg1.0_0C1A" + this.dm);
        final Stream stream48 = (Stream)list.get("__substg1.0_0C1D0102");
        final Stream stream49 = (Stream)list.get("__substg1.0_0064" + this.dm);
        final Stream stream50 = (Stream)list.get("__substg1.0_0065" + this.dm);
        final Stream stream51 = (Stream)list.get("__substg1.0_00410102");
        final Stream stream52 = (Stream)list.get("__substg1.0_0042" + this.dm);
        final Stream stream53 = (Stream)list.get("__substg1.0_003B0102");
        final Stream stream54 = (Stream)list.get("__substg1.0_007D" + this.dm);
        final Stream stream55 = (Stream)list.get("__substg1.0_3A30" + this.dm);
        final Stream stream56 = (Stream)list.get("__substg1.0_3A2E" + this.dm);
        final Stream stream57 = (Stream)list.get("__substg1.0_3A1B" + this.dm);
        final Stream stream58 = (Stream)list.get("__substg1.0_3A24" + this.dm);
        final Stream stream59 = (Stream)list.get("__substg1.0_3A51" + this.dm);
        final Stream stream60 = (Stream)list.get("__substg1.0_3A02" + this.dm);
        final Stream stream61 = (Stream)list.get("__substg1.0_3A1E" + this.dm);
        final Stream stream62 = (Stream)list.get("__substg1.0_3A1C" + this.dm);
        final Stream stream63 = (Stream)list.get("__substg1.0_3A57" + this.dm);
        final Stream stream64 = (Stream)list.get("__substg1.0_3A16" + this.dm);
        final Stream stream65 = (Stream)list.get("__substg1.0_3A49" + this.dm);
        final Stream stream66 = (Stream)list.get("__substg1.0_3A4A" + this.dm);
        final Stream stream67 = (Stream)list.get("__substg1.0_3A18" + this.dm);
        final Stream stream68 = (Stream)list.get("__substg1.0_3001" + this.dm);
        final Stream stream69 = (Stream)list.get("__substg1.0_3A45" + this.dm);
        final Stream stream70 = (Stream)list.get("__substg1.0_3A4C" + this.dm);
        final Stream stream71 = (Stream)list.get("__substg1.0_3A05" + this.dm);
        final Stream stream72 = (Stream)list.get("__substg1.0_3A06" + this.dm);
        final Stream stream73 = (Stream)list.get("__substg1.0_3A07" + this.dm);
        final Stream stream74 = (Stream)list.get("__substg1.0_3A43" + this.dm);
        final Stream stream75 = (Stream)list.get("__substg1.0_3A2F" + this.dm);
        final Stream stream76 = (Stream)list.get("__substg1.0_3A59" + this.dm);
        final Stream stream77 = (Stream)list.get("__substg1.0_3A5A" + this.dm);
        final Stream stream78 = (Stream)list.get("__substg1.0_3A5B" + this.dm);
        final Stream stream79 = (Stream)list.get("__substg1.0_3A5E" + this.dm);
        final Stream stream80 = (Stream)list.get("__substg1.0_3A5C" + this.dm);
        final Stream stream81 = (Stream)list.get("__substg1.0_3A5D" + this.dm);
        final Stream stream82 = (Stream)list.get("__substg1.0_3A25" + this.dm);
        final Stream stream83 = (Stream)list.get("__substg1.0_3A09" + this.dm);
        final Stream stream84 = (Stream)list.get("__substg1.0_3A0A" + this.dm);
        final Stream stream85 = (Stream)list.get("__substg1.0_3A2D" + this.dm);
        final Stream stream86 = (Stream)list.get("__substg1.0_3A4E" + this.dm);
        final Stream stream87 = (Stream)list.get("__substg1.0_3A44" + this.dm);
        final Stream stream88 = (Stream)list.get("__substg1.0_3A4F" + this.dm);
        final Stream stream89 = (Stream)list.get("__substg1.0_3A19" + this.dm);
        final Stream stream90 = (Stream)list.get("__substg1.0_3A08" + this.dm);
        final Stream stream91 = (Stream)list.get("__substg1.0_3A5F" + this.dm);
        final Stream stream92 = (Stream)list.get("__substg1.0_3A60" + this.dm);
        final Stream stream93 = (Stream)list.get("__substg1.0_3A61" + this.dm);
        final Stream stream94 = (Stream)list.get("__substg1.0_3A62" + this.dm);
        final Stream stream95 = (Stream)list.get("__substg1.0_3A63" + this.dm);
        final Stream stream96 = (Stream)list.get("__substg1.0_3A1F" + this.dm);
        final Stream stream97 = (Stream)list.get("__substg1.0_3A21" + this.dm);
        final Stream stream98 = (Stream)list.get("__substg1.0_3A50" + this.dm);
        final Stream stream99 = (Stream)list.get("__substg1.0_3A15" + this.dm);
        final Stream stream100 = (Stream)list.get("__substg1.0_3A27" + this.dm);
        final Stream stream101 = (Stream)list.get("__substg1.0_3A26" + this.dm);
        final Stream stream102 = (Stream)list.get("__substg1.0_3A2A" + this.dm);
        final Stream stream103 = (Stream)list.get("__substg1.0_3A2B" + this.dm);
        final Stream stream104 = (Stream)list.get("__substg1.0_3A28" + this.dm);
        final Stream stream105 = (Stream)list.get("__substg1.0_3A29" + this.dm);
        final Stream stream106 = (Stream)list.get("__substg1.0_3A23" + this.dm);
        final Stream stream107 = (Stream)list.get("__substg1.0_3A1A" + this.dm);
        final Stream stream108 = (Stream)list.get("__substg1.0_3A46" + this.dm);
        final Stream stream109 = (Stream)list.get("__substg1.0_3A1D" + this.dm);
        final Stream stream110 = (Stream)list.get("__substg1.0_3A48" + this.dm);
        final Stream stream111 = (Stream)list.get("__substg1.0_3A11" + this.dm);
        final Stream stream112 = (Stream)list.get("__substg1.0_3A2C" + this.dm);
        final Stream stream113 = (Stream)list.get("__substg1.0_3A17" + this.dm);
        final Stream stream114 = (Stream)list.get("__substg1.0_3A4B" + this.dm);
        if (stream8 != null && stream8.getBuffer() != null) {
            this.b = this.ds.decode(ByteBuffer.wrap(stream8.getBuffer())).toString();
        }
        if (stream9 != null && stream9.getBuffer() != null) {
            this.c = this.ds.decode(ByteBuffer.wrap(stream9.getBuffer())).toString();
        }
        if (stream10 != null && stream10.getBuffer() != null) {
            this.d = this.ds.decode(ByteBuffer.wrap(stream10.getBuffer())).toString();
        }
        if (stream11 != null && stream11.getBuffer() != null) {
            this.e = this.ds.decode(ByteBuffer.wrap(stream11.getBuffer())).toString();
        }
        if (stream12 != null && stream12.getBuffer() != null) {
            this.f = this.ds.decode(ByteBuffer.wrap(stream12.getBuffer())).toString();
        }
        if (stream13 != null && stream13.getBuffer() != null) {
            this.g = this.ds.decode(ByteBuffer.wrap(stream13.getBuffer())).toString();
        }
        if (stream14 != null && stream14.getBuffer() != null) {
            this.h = this.ds.decode(ByteBuffer.wrap(stream14.getBuffer())).toString();
        }
        if (stream15 != null && stream15.getBuffer() != null) {
            this.i = this.ds.decode(ByteBuffer.wrap(stream15.getBuffer())).toString();
        }
        if (stream16 != null && stream16.getBuffer() != null) {
            this.j = this.ds.decode(ByteBuffer.wrap(stream16.getBuffer())).toString();
        }
        if (stream17 != null && stream17.getBuffer() != null) {
            this.k = this.ds.decode(ByteBuffer.wrap(stream17.getBuffer())).toString();
        }
        if (stream18 != null && stream18.getBuffer() != null) {
            this.l = this.ds.decode(ByteBuffer.wrap(stream18.getBuffer())).toString();
        }
        if (stream19 != null && stream19.getBuffer() != null) {
            this.m = stream19.getBuffer();
        }
        if (stream20 != null && stream20.getBuffer() != null) {
            this.n = stream20.getBuffer();
        }
        if (stream21 != null && stream21.getBuffer() != null) {
            this.o = stream21.getBuffer();
        }
        if (stream22 != null && stream22.getBuffer() != null) {
            this.p = stream22.getBuffer();
        }
        if (stream23 != null && stream23.getBuffer() != null) {
            this.q = stream23.getBuffer();
        }
        if (stream24 != null && stream24.getBuffer() != null) {
            this.r = stream24.getBuffer();
        }
        if (stream25 != null && stream25.getBuffer() != null) {
            this.y = this.ds.decode(ByteBuffer.wrap(stream25.getBuffer())).toString();
        }
        if (stream26 != null && stream26.getBuffer() != null) {
            this.z = this.ds.decode(ByteBuffer.wrap(stream26.getBuffer())).toString();
        }
        if (stream27 != null && stream27.getBuffer() != null) {
            this.A = this.ds.decode(ByteBuffer.wrap(stream27.getBuffer())).toString();
        }
        if (stream28 != null && stream28.getBuffer() != null) {
            this.B = this.ds.decode(ByteBuffer.wrap(stream28.getBuffer())).toString();
        }
        if (stream29 != null && stream29.getBuffer() != null) {
            this.C = this.ds.decode(ByteBuffer.wrap(stream29.getBuffer())).toString();
        }
        if (stream30 != null && stream30.getBuffer() != null) {
            this.D = this.ds.decode(ByteBuffer.wrap(stream30.getBuffer())).toString();
        }
        if (stream31 != null && stream31.getBuffer() != null) {
            this.I = stream31.getBuffer();
        }
        if (stream32 != null && stream32.getBuffer() != null) {
            this.R = stream32.getBuffer();
        }
        else if (stream33 != null && stream33.getBuffer() != null) {
            if (this.H.intValue() > 0) {
                final Charset a84 = com.ews.msg.h.a(this.H.intValue());
                this.R = a84.encode(a84.decode(ByteBuffer.wrap(stream33.getBuffer())).toString()).array();
            }
            else {
                this.R = this.dt.encode(this.dt.decode(ByteBuffer.wrap(stream33.getBuffer())).toString()).array();
            }
        }
        if (stream34 != null && stream34.getBuffer() != null) {
            this.Y = this.ds.decode(ByteBuffer.wrap(stream34.getBuffer())).toString();
        }
        if (stream35 != null && stream35.getBuffer() != null) {
            this.Z = this.ds.decode(ByteBuffer.wrap(stream35.getBuffer())).toString();
        }
        if (stream36 != null && stream36.getBuffer() != null) {
            this.aa = stream36.getBuffer();
        }
        if (stream37 != null && stream37.getBuffer() != null) {
            this.ab = this.ds.decode(ByteBuffer.wrap(stream37.getBuffer())).toString();
        }
        if (stream38 != null && stream38.getBuffer() != null) {
            this.ac = stream38.getBuffer();
        }
        if (stream39 != null && stream39.getBuffer() != null) {
            this.ad = this.ds.decode(ByteBuffer.wrap(stream39.getBuffer())).toString();
        }
        if (stream40 != null && stream40.getBuffer() != null) {
            this.ae = this.ds.decode(ByteBuffer.wrap(stream40.getBuffer())).toString();
        }
        if (stream41 != null && stream41.getBuffer() != null) {
            this.af = stream41.getBuffer();
        }
        if (stream42 != null && stream42.getBuffer() != null) {
            this.ag = this.ds.decode(ByteBuffer.wrap(stream42.getBuffer())).toString();
        }
        if (stream43 != null && stream43.getBuffer() != null) {
            this.ah = stream43.getBuffer();
        }
        if (stream44 != null && stream44.getBuffer() != null) {
            this.ai = this.ds.decode(ByteBuffer.wrap(stream44.getBuffer())).toString();
        }
        if (stream45 != null && stream45.getBuffer() != null) {
            this.aj = this.ds.decode(ByteBuffer.wrap(stream45.getBuffer())).toString();
        }
        if (stream46 != null && stream46.getBuffer() != null) {
            this.ak = stream46.getBuffer();
        }
        if (stream47 != null && stream47.getBuffer() != null) {
            this.al = this.ds.decode(ByteBuffer.wrap(stream47.getBuffer())).toString();
        }
        if (stream48 != null && stream48.getBuffer() != null) {
            this.am = stream48.getBuffer();
        }
        if (stream49 != null && stream49.getBuffer() != null) {
            this.an = this.ds.decode(ByteBuffer.wrap(stream49.getBuffer())).toString();
        }
        if (stream50 != null && stream50.getBuffer() != null) {
            this.ao = this.ds.decode(ByteBuffer.wrap(stream50.getBuffer())).toString();
        }
        if (stream51 != null && stream51.getBuffer() != null) {
            this.ap = stream51.getBuffer();
        }
        if (stream52 != null && stream52.getBuffer() != null) {
            this.aq = this.ds.decode(ByteBuffer.wrap(stream52.getBuffer())).toString();
        }
        if (stream53 != null && stream53.getBuffer() != null) {
            this.ar = stream53.getBuffer();
        }
        if (stream54 != null && stream54.getBuffer() != null) {
            this.as = this.ds.decode(ByteBuffer.wrap(stream54.getBuffer())).toString();
        }
        if (stream55 != null && stream55.getBuffer() != null) {
            this.bC = this.ds.decode(ByteBuffer.wrap(stream55.getBuffer())).toString();
        }
        if (stream56 != null && stream56.getBuffer() != null) {
            this.bD = this.ds.decode(ByteBuffer.wrap(stream56.getBuffer())).toString();
        }
        if (stream57 != null && stream57.getBuffer() != null) {
            this.bF = this.ds.decode(ByteBuffer.wrap(stream57.getBuffer())).toString();
        }
        if (stream58 != null && stream58.getBuffer() != null) {
            this.bG = this.ds.decode(ByteBuffer.wrap(stream58.getBuffer())).toString();
        }
        if (stream59 != null && stream59.getBuffer() != null) {
            this.bH = this.ds.decode(ByteBuffer.wrap(stream59.getBuffer())).toString();
        }
        if (stream60 != null && stream60.getBuffer() != null) {
            this.bI = this.ds.decode(ByteBuffer.wrap(stream60.getBuffer())).toString();
        }
        if (stream61 != null && stream61.getBuffer() != null) {
            this.bJ = this.ds.decode(ByteBuffer.wrap(stream61.getBuffer())).toString();
        }
        if (stream62 != null && stream62.getBuffer() != null) {
            this.bK = this.ds.decode(ByteBuffer.wrap(stream62.getBuffer())).toString();
        }
        if (stream63 != null && stream63.getBuffer() != null) {
            this.bL = this.ds.decode(ByteBuffer.wrap(stream63.getBuffer())).toString();
        }
        if (stream64 != null && stream64.getBuffer() != null) {
            this.bM = this.ds.decode(ByteBuffer.wrap(stream64.getBuffer())).toString();
        }
        if (stream65 != null && stream65.getBuffer() != null) {
            this.bN = this.ds.decode(ByteBuffer.wrap(stream65.getBuffer())).toString();
        }
        if (stream101 != null && stream101.getBuffer() != null) {
            this.cv = this.ds.decode(ByteBuffer.wrap(stream101.getBuffer())).toString();
        }
        if (stream66 != null && stream66.getBuffer() != null) {
            this.bO = this.ds.decode(ByteBuffer.wrap(stream66.getBuffer())).toString();
        }
        if (stream67 != null && stream67.getBuffer() != null) {
            this.bP = this.ds.decode(ByteBuffer.wrap(stream67.getBuffer())).toString();
        }
        if (stream68 != null && stream68.getBuffer() != null) {
            this.bQ = this.ds.decode(ByteBuffer.wrap(stream68.getBuffer())).toString();
        }
        if (stream69 != null && stream69.getBuffer() != null) {
            this.bR = this.ds.decode(ByteBuffer.wrap(stream69.getBuffer())).toString();
        }
        if (stream70 != null && stream70.getBuffer() != null) {
            this.bS = this.ds.decode(ByteBuffer.wrap(stream70.getBuffer())).toString();
        }
        if (stream71 != null && stream71.getBuffer() != null) {
            this.bT = this.ds.decode(ByteBuffer.wrap(stream71.getBuffer())).toString();
        }
        if (stream72 != null && stream72.getBuffer() != null) {
            this.bU = this.ds.decode(ByteBuffer.wrap(stream72.getBuffer())).toString();
        }
        if (stream73 != null && stream73.getBuffer() != null) {
            this.bV = this.ds.decode(ByteBuffer.wrap(stream73.getBuffer())).toString();
        }
        if (stream74 != null && stream74.getBuffer() != null) {
            this.bW = this.ds.decode(ByteBuffer.wrap(stream74.getBuffer())).toString();
        }
        if (stream75 != null && stream75.getBuffer() != null) {
            this.bX = this.ds.decode(ByteBuffer.wrap(stream75.getBuffer())).toString();
        }
        if (stream76 != null && stream76.getBuffer() != null) {
            this.bY = this.ds.decode(ByteBuffer.wrap(stream76.getBuffer())).toString();
        }
        if (stream77 != null && stream77.getBuffer() != null) {
            this.bZ = this.ds.decode(ByteBuffer.wrap(stream77.getBuffer())).toString();
        }
        if (stream78 != null && stream78.getBuffer() != null) {
            this.ca = this.ds.decode(ByteBuffer.wrap(stream78.getBuffer())).toString();
        }
        if (stream79 != null && stream79.getBuffer() != null) {
            this.cb = this.ds.decode(ByteBuffer.wrap(stream79.getBuffer())).toString();
        }
        if (stream80 != null && stream80.getBuffer() != null) {
            this.cc = this.ds.decode(ByteBuffer.wrap(stream80.getBuffer())).toString();
        }
        if (stream81 != null && stream81.getBuffer() != null) {
            this.cd = this.ds.decode(ByteBuffer.wrap(stream81.getBuffer())).toString();
        }
        if (stream82 != null && stream82.getBuffer() != null) {
            this.ce = this.ds.decode(ByteBuffer.wrap(stream82.getBuffer())).toString();
        }
        if (stream83 != null && stream83.getBuffer() != null) {
            this.cf = this.ds.decode(ByteBuffer.wrap(stream83.getBuffer())).toString();
        }
        if (stream84 != null && stream84.getBuffer() != null) {
            this.cg = this.ds.decode(ByteBuffer.wrap(stream84.getBuffer())).toString();
        }
        if (stream85 != null && stream85.getBuffer() != null) {
            this.ch = this.ds.decode(ByteBuffer.wrap(stream85.getBuffer())).toString();
        }
        if (stream100 != null && stream100.getBuffer() != null) {
            this.cw = this.ds.decode(ByteBuffer.wrap(stream100.getBuffer())).toString();
        }
        if (stream86 != null && stream86.getBuffer() != null) {
            this.ci = this.ds.decode(ByteBuffer.wrap(stream86.getBuffer())).toString();
        }
        if (stream87 != null && stream87.getBuffer() != null) {
            this.cj = this.ds.decode(ByteBuffer.wrap(stream87.getBuffer())).toString();
        }
        if (stream88 != null && stream88.getBuffer() != null) {
            this.ck = this.ds.decode(ByteBuffer.wrap(stream88.getBuffer())).toString();
        }
        if (stream89 != null && stream89.getBuffer() != null) {
            this.cl = this.ds.decode(ByteBuffer.wrap(stream89.getBuffer())).toString();
        }
        if (stream90 != null && stream90.getBuffer() != null) {
            this.bE = this.ds.decode(ByteBuffer.wrap(stream90.getBuffer())).toString();
        }
        if (stream91 != null && stream91.getBuffer() != null) {
            this.cm = this.ds.decode(ByteBuffer.wrap(stream91.getBuffer())).toString();
        }
        if (stream92 != null && stream92.getBuffer() != null) {
            this.cn = this.ds.decode(ByteBuffer.wrap(stream92.getBuffer())).toString();
        }
        if (stream93 != null && stream93.getBuffer() != null) {
            this.co = this.ds.decode(ByteBuffer.wrap(stream93.getBuffer())).toString();
        }
        if (stream94 != null && stream94.getBuffer() != null) {
            this.cp = this.ds.decode(ByteBuffer.wrap(stream94.getBuffer())).toString();
        }
        if (stream95 != null && stream95.getBuffer() != null) {
            this.cq = this.ds.decode(ByteBuffer.wrap(stream95.getBuffer())).toString();
        }
        if (stream96 != null && stream96.getBuffer() != null) {
            this.cr = this.ds.decode(ByteBuffer.wrap(stream96.getBuffer())).toString();
        }
        if (stream97 != null && stream97.getBuffer() != null) {
            this.cs = this.ds.decode(ByteBuffer.wrap(stream97.getBuffer())).toString();
        }
        if (stream98 != null && stream98.getBuffer() != null) {
            this.ct = this.ds.decode(ByteBuffer.wrap(stream98.getBuffer())).toString();
        }
        if (stream99 != null && stream99.getBuffer() != null) {
            this.cu = this.ds.decode(ByteBuffer.wrap(stream99.getBuffer())).toString();
        }
        if (stream102 != null && stream102.getBuffer() != null) {
            this.cx = this.ds.decode(ByteBuffer.wrap(stream102.getBuffer())).toString();
        }
        if (stream103 != null && stream103.getBuffer() != null) {
            this.cy = this.ds.decode(ByteBuffer.wrap(stream103.getBuffer())).toString();
        }
        if (stream104 != null && stream104.getBuffer() != null) {
            this.cz = this.ds.decode(ByteBuffer.wrap(stream104.getBuffer())).toString();
        }
        if (stream105 != null && stream105.getBuffer() != null) {
            this.cA = this.ds.decode(ByteBuffer.wrap(stream105.getBuffer())).toString();
        }
        if (stream106 != null && stream106.getBuffer() != null) {
            this.cB = this.ds.decode(ByteBuffer.wrap(stream106.getBuffer())).toString();
        }
        if (stream107 != null && stream107.getBuffer() != null) {
            this.cC = this.ds.decode(ByteBuffer.wrap(stream107.getBuffer())).toString();
        }
        if (stream108 != null && stream108.getBuffer() != null) {
            this.cD = this.ds.decode(ByteBuffer.wrap(stream108.getBuffer())).toString();
        }
        if (stream109 != null && stream109.getBuffer() != null) {
            this.cE = this.ds.decode(ByteBuffer.wrap(stream109.getBuffer())).toString();
        }
        if (stream110 != null && stream110.getBuffer() != null) {
            this.cF = this.ds.decode(ByteBuffer.wrap(stream110.getBuffer())).toString();
        }
        if (stream111 != null && stream111.getBuffer() != null) {
            this.cG = this.ds.decode(ByteBuffer.wrap(stream111.getBuffer())).toString();
        }
        if (stream112 != null && stream112.getBuffer() != null) {
            this.cH = this.ds.decode(ByteBuffer.wrap(stream112.getBuffer())).toString();
        }
        if (stream113 != null && stream113.getBuffer() != null) {
            this.cI = this.ds.decode(ByteBuffer.wrap(stream113.getBuffer())).toString();
        }
        if (stream114 != null && stream114.getBuffer() != null) {
            this.cJ = this.ds.decode(ByteBuffer.wrap(stream114.getBuffer())).toString();
        }
        for (int n13 = 0; n13 < int1; ++n13) {
            final HashMap<String, g> hashMap2 = new HashMap<String, g>();
            final Storage storage;
            if ((storage = (Storage)list.get(String.format("__recip_version1.0_#%08X", n13))) != null) {
                final Stream stream115;
                if ((stream115 = (Stream)storage.getDirectoryEntries().get("__properties_version1.0")) != null && stream115.getBuffer() != null) {
                    for (int n14 = 8; n14 < stream115.getBuffer().length; n14 += 16) {
                        final byte[] array5 = new byte[16];
                        System.arraycopy(stream115.getBuffer(), n14, array5, 0, 16);
                        final g g117;
                        final Stream stream116;
                        if ((g117 = new g(array5)).d() > 0L && (stream116 = (Stream)storage.getDirectoryEntries().get("__substg1.0_" + String.format("%08X", g117.b()))) != null && stream116.getBuffer() != null && stream116.getBuffer().length > 0) {
                            final byte[] array6 = new byte[stream116.getBuffer().length];
                            System.arraycopy(stream116.getBuffer(), 0, array6, 0, array6.length);
                            g117.a(array6);
                        }
                        final String format = String.format("%08X", g117.b());
                        if (!hashMap2.containsKey(format)) {
                            hashMap2.put(format, g117);
                        }
                    }
                }
                final Recipient recipient = new Recipient();
                final g g118;
                if ((g118 = hashMap2.get("39000003")) != null && g118.e() != null) {
                    recipient.setDisplayType(com.ews.msg.a.h(new d(g118.e()).longValue()));
                }
                final g g119;
                if ((g119 = hashMap2.get("0FFE0003")) != null && g119.e() != null) {
                    recipient.setObjectType(com.ews.msg.a.b(new d(g119.e()).longValue()));
                }
                final g g120;
                if ((g120 = hashMap2.get("0C150003")) != null && g120.e() != null) {
                    recipient.setRecipientType(com.ews.msg.a.j(new d(g120.e()).longValue()));
                }
                final g g121;
                if ((g121 = hashMap2.get("0E0F000B")) != null && g121.e() != null && new c(g121.e()).intValue() > 0) {
                    recipient.setResponsibility(true);
                }
                final g g122;
                if ((g122 = hashMap2.get("3A40000B")) != null && g122.e() != null && new c(g122.e()).intValue() > 0) {
                    recipient.setSendRichInfo(true);
                }
                final g g123;
                if ((g123 = hashMap2.get("3A710003")) != null && g123.e() != null) {
                    recipient.setSendInternetEncoding(new d(g123.e()).intValue());
                }
                final Stream stream117 = (Stream)storage.getDirectoryEntries().get("__substg1.0_3001" + this.dm);
                final Stream stream118 = (Stream)storage.getDirectoryEntries().get("__substg1.0_3002" + this.dm);
                final Stream stream119 = (Stream)storage.getDirectoryEntries().get("__substg1.0_3003" + this.dm);
                final Stream stream120 = (Stream)storage.getDirectoryEntries().get("__substg1.0_39FE" + this.dm);
                final Stream stream121 = (Stream)storage.getDirectoryEntries().get("__substg1.0_39FF" + this.dm);
                final Stream stream122 = (Stream)storage.getDirectoryEntries().get("__substg1.0_3A20" + this.dm);
                final Stream stream123 = (Stream)storage.getDirectoryEntries().get("__substg1.0_403D" + this.dm);
                final Stream stream124 = (Stream)storage.getDirectoryEntries().get("__substg1.0_403E" + this.dm);
                final Stream stream125 = (Stream)storage.getDirectoryEntries().get("__substg1.0_0FFF0102");
                final Stream stream126 = (Stream)storage.getDirectoryEntries().get("__substg1.0_300B0102");
                final Stream stream127 = (Stream)storage.getDirectoryEntries().get("__substg1.0_0FF60102");
                if (stream117 != null && stream117.getBuffer() != null) {
                    recipient.setDisplayName(this.ds.decode(ByteBuffer.wrap(stream117.getBuffer())).toString());
                }
                if (stream118 != null && stream118.getBuffer() != null) {
                    recipient.setAddressType(this.ds.decode(ByteBuffer.wrap(stream118.getBuffer())).toString());
                }
                if (stream119 != null && stream119.getBuffer() != null) {
                    recipient.setEmailAddress(this.ds.decode(ByteBuffer.wrap(stream119.getBuffer())).toString());
                }
                if (stream120 != null && stream120.getBuffer() != null) {
                    recipient.setSmtpAddress(this.ds.decode(ByteBuffer.wrap(stream120.getBuffer())).toString());
                }
                if (stream121 != null && stream121.getBuffer() != null) {
                    recipient.setDisplayName7Bit(this.ds.decode(ByteBuffer.wrap(stream121.getBuffer())).toString());
                }
                if (stream122 != null && stream122.getBuffer() != null) {
                    recipient.setTransmitableDisplayName(this.ds.decode(ByteBuffer.wrap(stream122.getBuffer())).toString());
                }
                if (stream123 != null && stream123.getBuffer() != null) {
                    recipient.setOriginatingAddressType(this.ds.decode(ByteBuffer.wrap(stream123.getBuffer())).toString());
                }
                if (stream124 != null && stream124.getBuffer() != null) {
                    recipient.setOriginatingEmailAddress(this.ds.decode(ByteBuffer.wrap(stream124.getBuffer())).toString());
                }
                if (stream125 != null && stream125.getBuffer() != null) {
                    recipient.setEntryId(stream125.getBuffer());
                }
                if (stream126 != null && stream126.getBuffer() != null) {
                    recipient.setSearchKey(stream126.getBuffer());
                }
                if (stream127 != null && stream127.getBuffer() != null) {
                    recipient.setInstanceKey(stream127.getBuffer());
                }
                this.di.add(recipient);
            }
        }
        int n15 = 0;
        for (int n16 = 0; n16 < list.size(); ++n16) {
            if (list.get(n16) instanceof Storage) {
                ++n15;
            }
        }
        for (int n17 = 0; n17 < int2; ++n17) {
            final HashMap<String, g> hashMap3 = new HashMap<String, g>();
            final Storage storage2;
            if ((storage2 = (Storage)list.get(String.format("__attach_version1.0_#%08X", n17))) == null) {
                if (++int2 > n15) {
                    return;
                }
            }
            else {
                final Stream stream128 = (Stream)storage2.getDirectoryEntries().get("__properties_version1.0");
                final Attachment attachment = new Attachment();
                if (stream128 != null && stream128.getBuffer() != null) {
                    for (int n18 = 8; n18 < stream128.getBuffer().length; n18 += 16) {
                        final byte[] array7 = new byte[16];
                        System.arraycopy(stream128.getBuffer(), n18, array7, 0, 16);
                        final g g124;
                        if ((g124 = new g(array7)).d() > 0L) {
                            final String string5 = "__substg1.0_" + String.format("%08X", g124.b());
                            if (storage2.getDirectoryEntries().get(string5) instanceof Stream) {
                                final Stream stream129;
                                if ((stream129 = (Stream)storage2.getDirectoryEntries().get(string5)) != null && stream129.getBuffer() != null && stream129.getBuffer().length > 0) {
                                    final byte[] array8 = new byte[stream129.getBuffer().length];
                                    System.arraycopy(stream129.getBuffer(), 0, array8, 0, array8.length);
                                    g124.a(array8);
                                }
                            }
                            else {
                                final Storage storage3;
                                if (storage2.getDirectoryEntries().get(string5) instanceof Storage && (storage3 = (Storage)storage2.getDirectoryEntries().get(string5)) != null && storage3.getDirectoryEntries().get("__properties_version1.0") != null) {
                                    attachment.setEmbeddedMessage(new Message(storage3.getDirectoryEntries(), true));
                                }
                            }
                        }
                        hashMap3.put(String.format("%08X", g124.b()), g124);
                    }
                }
                final g g125;
                if ((g125 = hashMap3.get("37140003")) != null && g125.e() != null) {
                    attachment.setFlags(com.ews.msg.a.v(new d(g125.e()).longValue()));
                }
                final g g126;
                if ((g126 = hashMap3.get("37050003")) != null && g126.e() != null) {
                    attachment.setMethod(com.ews.msg.a.u(new d(g126.e()).longValue()));
                }
                final g g127;
                if ((g127 = hashMap3.get("37100003")) != null && g127.e() != null) {
                    attachment.setMimeSequence(new d(g127.e()).longValue());
                }
                final g g128;
                if ((g128 = hashMap3.get("370B0003")) != null && g128.e() != null) {
                    attachment.setRenderingPosition(new d(g128.e()).longValue());
                }
                final g g129;
                if ((g129 = hashMap3.get("0E200003")) != null && g129.e() != null) {
                    attachment.setSize(new d(g129.e()).longValue());
                }
                final g g130;
                if ((g130 = hashMap3.get("0FFE0003")) != null && g130.e() != null) {
                    attachment.setObjectType(com.ews.msg.a.b(new d(g130.e()).longValue()));
                }
                final g g131;
                if ((g131 = hashMap3.get("7FFE000B")) != null && g131.e() != null && new c(g131.e()).intValue() > 0) {
                    attachment.setHidden(true);
                }
                final g g132;
                if ((g132 = hashMap3.get("7FFF000B")) != null && g132.e() != null && new c(g132.e()).intValue() > 0) {
                    attachment.setContactPhoto(true);
                }
                final Stream stream130 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_370F0102");
                final Stream stream131 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3711" + this.dm);
                final Stream stream132 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3712" + this.dm);
                final Stream stream133 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3713" + this.dm);
                final Stream stream134 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3716" + this.dm);
                final Stream stream135 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_37010102");
                final Stream stream136 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_0x37020102");
                final Stream stream137 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3703" + this.dm);
                final Stream stream138 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3704" + this.dm);
                final Stream stream139 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3707" + this.dm);
                final Stream stream140 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_370D" + this.dm);
                final Stream stream141 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_370E" + this.dm);
                final Stream stream142 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3708" + this.dm);
                final Stream stream143 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_37090102");
                final Stream stream144 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_370A0102");
                final Stream stream145 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_370C" + this.dm);
                final Stream stream146 = (Stream)storage2.getDirectoryEntries().get("__substg1.0_3001" + this.dm);
                if (storage2.getDirectoryEntries().get("__substg1.0_3701000D") != null && storage2.getDirectoryEntries().get("__substg1.0_3701000D") instanceof Storage) {
                    attachment.a((Storage)storage2.getDirectoryEntries().get("__substg1.0_3701000D"));
                    attachment.a(stream128);
                }
                if (stream130 != null && stream130.getBuffer() != null) {
                    attachment.setAdditionalInfo(stream130.getBuffer());
                }
                if (stream131 != null && stream131.getBuffer() != null) {
                    attachment.setContentBase(this.ds.decode(ByteBuffer.wrap(stream131.getBuffer())).toString());
                }
                if (stream132 != null && stream132.getBuffer() != null) {
                    attachment.setContentId(this.ds.decode(ByteBuffer.wrap(stream132.getBuffer())).toString());
                }
                if (stream133 != null && stream133.getBuffer() != null) {
                    attachment.setContentLocation(this.ds.decode(ByteBuffer.wrap(stream133.getBuffer())).toString());
                }
                if (stream134 != null && stream134.getBuffer() != null) {
                    attachment.setContentDisposition(this.ds.decode(ByteBuffer.wrap(stream134.getBuffer())).toString());
                }
                if (stream135 != null && stream135.getBuffer() != null) {
                    attachment.setData(stream135.getBuffer());
                }
                if (stream136 != null && stream136.getBuffer() != null) {
                    attachment.setEncoding(stream136.getBuffer());
                }
                if (stream137 != null && stream137.getBuffer() != null) {
                    attachment.setExtension(this.ds.decode(ByteBuffer.wrap(stream137.getBuffer())).toString());
                }
                if (stream138 != null && stream138.getBuffer() != null) {
                    attachment.setFileName(this.ds.decode(ByteBuffer.wrap(stream138.getBuffer())).toString());
                }
                if (stream139 != null && stream139.getBuffer() != null) {
                    attachment.setLongFileName(this.ds.decode(ByteBuffer.wrap(stream139.getBuffer())).toString());
                }
                if (stream140 != null && stream140.getBuffer() != null) {
                    attachment.setLongPathName(this.ds.decode(ByteBuffer.wrap(stream140.getBuffer())).toString());
                }
                if (stream141 != null && stream141.getBuffer() != null) {
                    attachment.setMimeTag(this.ds.decode(ByteBuffer.wrap(stream141.getBuffer())).toString());
                }
                if (stream142 != null && stream142.getBuffer() != null) {
                    attachment.setPathName(this.ds.decode(ByteBuffer.wrap(stream142.getBuffer())).toString());
                }
                if (stream143 != null && stream143.getBuffer() != null) {
                    attachment.setRendering(stream143.getBuffer());
                }
                if (stream144 != null && stream144.getBuffer() != null) {
                    attachment.setTag(stream144.getBuffer());
                }
                if (stream145 != null && stream145.getBuffer() != null) {
                    attachment.setTransportName(this.ds.decode(ByteBuffer.wrap(stream145.getBuffer())).toString());
                }
                if (stream146 != null && stream146.getBuffer() != null) {
                    attachment.setDisplayName(this.ds.decode(ByteBuffer.wrap(stream146.getBuffer())).toString());
                }
                if (attachment.getData() != null || attachment.getDataObject() != null || attachment.a() != null || attachment.getEmbeddedMessage() != null) {
                    this.dj.add(attachment);
                }
            }
        }
    }
    
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.toByteArray());
    }
    
    public byte[] toByteArray() throws IOException {
        com.ews.msg.a.b();
        final CompoundFile compoundFile;
        (compoundFile = new CompoundFile()).setMajorVersion((short)4);
        compoundFile.getRoot().setClassId(new byte[] { 11, 13, 2, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 });
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        final ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        final ArrayList<byte[]> list;
        (list = new ArrayList<byte[]>()).add(new byte[16]);
        list.add(StandardPropertySet.MAPI);
        list.add(StandardPropertySet.PUBLIC_STRINGS);
        final ArrayList<String> list2 = new ArrayList<String>();
        final HashMap<Object, ByteArrayOutputStream> hashMap = new HashMap<Object, ByteArrayOutputStream>();
        this.dl = new ArrayList<e>();
        final List<DirectoryEntry> a = this.a(this.dl);
        int n = 0;
        for (int i = 0; i < this.dl.size(); ++i) {
            int a2;
            if ((a2 = a(this.dl.get(i).c(), list)) == -1 && this.dl.get(i).c() != null) {
                list.add(this.dl.get(i).c());
                a2 = list.size() - 1;
            }
            boolean b = false;
            int intValue;
            if (this.dl.get(i).b() != null) {
                list2.add(this.dl.get(i).b());
                b = true;
                intValue = n;
            }
            else {
                intValue = this.dl.get(i).a().intValue();
            }
            final int n2 = (short)i << 16;
            short n3 = (short)(a2 << 1);
            if (b) {
                ++n3;
            }
            final short n4 = (short)(n2 + n3);
            final byte[] array = new byte[8];
            final byte[] a3 = new d(intValue).a();
            final byte[] a4 = new d(n4).a();
            System.arraycopy(a3, 0, array, 0, 4);
            System.arraycopy(a4, 0, array, 4, 4);
            byteArrayOutputStream2.write(array, 0, 8);
            if (!b) {
                final String string = "__substg1.0_" + String.format("%08X", 4096 + (this.dl.get(i).a().intValue() ^ a2 << 1) % 31 << 16 | 0x102);
                if (hashMap.containsKey(string)) {
                    hashMap.get(string).write(array);
                }
                else {
                    final ByteArrayOutputStream byteArrayOutputStream4;
                    (byteArrayOutputStream4 = new ByteArrayOutputStream()).write(array);
                    hashMap.put(string, byteArrayOutputStream4);
                }
            }
            else {
                final a a5;
                (a5 = new a()).a(this.ds.encode(this.dl.get(i).b()).array());
                final String string2 = "__substg1.0_" + String.format("%08X", (int)(4096L + (a5.a() ^ (a2 << 1 | 0x1)) % 31L) << 16 | 0x102);
                if (hashMap.containsKey(string2)) {
                    hashMap.get(string2).write(array);
                }
                else {
                    final ByteArrayOutputStream byteArrayOutputStream5;
                    (byteArrayOutputStream5 = new ByteArrayOutputStream()).write(array);
                    hashMap.put(string2, byteArrayOutputStream5);
                }
            }
            if (this.dl.get(i).b() != null) {
                final byte[] array2 = this.du.encode(this.dl.get(i).b()).array();
                n += array2.length + array2.length % 4 + 4;
            }
        }
        final Storage storage = new Storage("__nameid_version1.0");
        final Stream stream = new Stream("__substg1.0_00030102", byteArrayOutputStream2.toByteArray());
        for (int j = 3; j < list.size(); ++j) {
            byteArrayOutputStream.write((byte[])list.get(j));
        }
        final Stream stream2 = new Stream("__substg1.0_00020102", byteArrayOutputStream.toByteArray());
        for (int k = 0; k < list2.size(); ++k) {
            final byte[] array3 = this.du.encode(list2.get(k)).array();
            byteArrayOutputStream3.write(new d(array3.length).a(), 0, 4);
            byteArrayOutputStream3.write(array3, 0, array3.length);
            final int n5;
            if ((n5 = array3.length % 4) > 0) {
                byteArrayOutputStream3.write(new byte[n5]);
            }
        }
        final Stream stream3 = new Stream("__substg1.0_00040102", byteArrayOutputStream3.toByteArray());
       storage.getDirectoryEntries().add(stream2);
        storage.getDirectoryEntries().add(stream);
        storage.getDirectoryEntries().add(stream3);
        for (final Object name : hashMap.keySet()) {
            String name1 = (String)name;
            storage.getDirectoryEntries().add(new Stream(name1, hashMap.get(name).toByteArray()));
        }
        for (int l = 0; l < a.size(); ++l) {
            compoundFile.getRoot().getDirectoryEntries().add(a.get(l));
        }
        compoundFile.getRoot().getDirectoryEntries().add(storage);
        return compoundFile.toByteArray();
    }
    
    public void save(final String filePath) throws IOException {
        this.save(filePath, false);
    }
    
    public void save(String p, final boolean overwrite) throws IOException {
        final File file = new File(p);
        if (overwrite && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        FileOutputStream var_1_28 = new FileOutputStream(file);
        try {
            this.save((OutputStream)var_1_28);
        }
        finally {
            ((FileOutputStream)var_1_28).close();
        }
    }
    
    public void save(final OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream is null.");
        }
        final byte[] byteArray = this.toByteArray();
        outputStream.write(byteArray, 0, byteArray.length);
    }
    
    private List<DirectoryEntry> a(final List<e> list) throws IOException {
        final ArrayList<DirectoryEntry> list2 = new ArrayList<DirectoryEntry>();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] a = new d(0).a();
        final byte[] a2 = new d(this.di.size()).a();
        final byte[] a3 = new d(this.dj.size()).a();
        byteArrayOutputStream.write(a);
        byteArrayOutputStream.write(a);
        byteArrayOutputStream.write(a2);
        byteArrayOutputStream.write(a3);
        byteArrayOutputStream.write(a2);
        byteArrayOutputStream.write(a3);
        if (!this.dv) {
            byteArrayOutputStream.write(a);
            byteArrayOutputStream.write(a);
        }
        if (this.dr == Encoding.UNICODE) {
            this.ds = this.du;
            this.dm = "001F";
            this.dn = 31;
            this.dw = "101F";
            this.dp = 4127;
            if (!this.aw.contains(StoreSupportMask.UNICODE)) {
                this.aw.add(StoreSupportMask.UNICODE);
            }
            this.dq = 2;
        }
        else {
            this.aw.remove(StoreSupportMask.UNICODE);
            this.dq = 1;
        }
        if (this.aw != null) {
            final g g;
            (g = new g()).a(873267203L);
            g.a(PropertyType.INTEGER32);
            g.a(new d(com.ews.msg.a.a(this.aw)).a());
            g.a(true);
            g.b(true);
            byteArrayOutputStream.write(g.a(), 0, 16);
        }
        if (this.b != null) {
            final byte[] array = this.ds.encode(this.b).array();
            list2.add(new Stream("__substg1.0_001A" + this.dm, array));
            final g g2;
            (g2 = new g()).a(0x1A0000 | this.dn);
            g2.a(PropertyType.STRING8);
            g2.b(array.length + this.dq);
            g2.a(true);
            g2.b(true);
            byteArrayOutputStream.write(g2.a(), 0, 16);
        }
        if (this.c != null) {
            final byte[] array2 = this.ds.encode(this.c).array();
            list2.add(new Stream("__substg1.0_0037" + this.dm, array2));
            final g g3;
            (g3 = new g()).a(0x370000 | this.dn);
            g3.a(PropertyType.STRING8);
            g3.b(array2.length + this.dq);
            g3.a(true);
            g3.b(true);
            byteArrayOutputStream.write(g3.a(), 0, 16);
        }
        if (this.d != null) {
            final byte[] array3 = this.ds.encode(this.d).array();
            list2.add(new Stream("__substg1.0_003D" + this.dm, array3));
            final g g4;
            (g4 = new g()).a(0x3D0000 | this.dn);
            g4.a(PropertyType.STRING8);
            g4.b(array3.length + this.dq);
            g4.a(true);
            g4.b(true);
            byteArrayOutputStream.write(g4.a(), 0, 16);
        }
        if (this.e != null) {
            final byte[] array4 = this.ds.encode(this.e).array();
            list2.add(new Stream("__substg1.0_0070" + this.dm, array4));
            final g g5;
            (g5 = new g()).a(0x700000 | this.dn);
            g5.a(PropertyType.STRING8);
            g5.b(array4.length + this.dq);
            g5.a(true);
            g5.b(true);
            byteArrayOutputStream.write(g5.a(), 0, 16);
        }
        if (this.f != null) {
            final byte[] array5 = this.ds.encode(this.f).array();
            list2.add(new Stream("__substg1.0_0E02" + this.dm, array5));
            final g g6;
            (g6 = new g()).a(0xE020000 | this.dn);
            g6.a(PropertyType.STRING8);
            g6.b(array5.length + this.dq);
            g6.a(true);
            g6.b(true);
            byteArrayOutputStream.write(g6.a(), 0, 16);
        }
        if (this.g != null) {
            final byte[] array6 = this.ds.encode(this.g).array();
            list2.add(new Stream("__substg1.0_0E03" + this.dm, array6));
            final g g7;
            (g7 = new g()).a(0xE030000 | this.dn);
            g7.a(PropertyType.STRING8);
            g7.b(array6.length + this.dq);
            g7.a(true);
            g7.b(true);
            byteArrayOutputStream.write(g7.a(), 0, 16);
        }
        if (this.h != null) {
            final byte[] array7 = this.ds.encode(this.h).array();
            list2.add(new Stream("__substg1.0_0E04" + this.dm, array7));
            final g g8;
            (g8 = new g()).a(0xE040000 | this.dn);
            g8.a(PropertyType.STRING8);
            g8.b(array7.length + this.dq);
            g8.a(true);
            g8.b(true);
            byteArrayOutputStream.write(g8.a(), 0, 16);
        }
        if (this.i != null) {
            final byte[] array8 = this.ds.encode(this.i).array();
            list2.add(new Stream("__substg1.0_0074" + this.dm, array8));
            final g g9;
            (g9 = new g()).a(0x740000 | this.dn);
            g9.a(PropertyType.STRING8);
            g9.b(array8.length + this.dq);
            g9.a(true);
            g9.b(true);
            byteArrayOutputStream.write(g9.a(), 0, 16);
        }
        if (this.j != null) {
            final byte[] array9 = this.ds.encode(this.j).array();
            list2.add(new Stream("__substg1.0_0050" + this.dm, array9));
            final g g10;
            (g10 = new g()).a(0x500000 | this.dn);
            g10.a(PropertyType.STRING8);
            g10.b(array9.length + this.dq);
            g10.a(true);
            g10.b(true);
            byteArrayOutputStream.write(g10.a(), 0, 16);
            final byte[] a4 = com.ews.msg.h.a(this.j);
            list2.add(new Stream("__substg1.0_004F0102", a4));
            final g g11;
            (g11 = new g()).a(5177602L);
            g11.a(PropertyType.BINARY);
            g11.b(a4.length);
            g11.a(true);
            g11.b(true);
            byteArrayOutputStream.write(g11.a(), 0, 16);
        }
        if (this.k != null) {
            final byte[] array10 = this.ds.encode(this.k).array();
            list2.add(new Stream("__substg1.0_0E1D" + this.dm, array10));
            final g g12;
            (g12 = new g()).a(0xE1D0000 | this.dn);
            g12.a(PropertyType.STRING8);
            g12.b(array10.length + this.dq);
            g12.a(true);
            g12.b(true);
            byteArrayOutputStream.write(g12.a(), 0, 16);
        }
        if (this.l != null) {
            final byte[] array11 = this.ds.encode(this.l).array();
            list2.add(new Stream("__substg1.0_1000" + this.dm, array11));
            final g g13;
            (g13 = new g()).a(0x10000000 | this.dn);
            g13.a(PropertyType.STRING8);
            g13.b(array11.length + this.dq);
            g13.a(true);
            g13.b(true);
            byteArrayOutputStream.write(g13.a(), 0, 16);
        }
        if (this.m != null) {
            list2.add(new Stream("__substg1.0_10090102", this.m));
            final g g14;
            (g14 = new g()).a(269025538L);
            g14.a(PropertyType.BINARY);
            g14.b(this.m.length);
            g14.a(true);
            g14.b(true);
            byteArrayOutputStream.write(g14.a(), 0, 16);
        }
        if (this.n != null) {
            list2.add(new Stream("__substg1.0_300B0102", this.n));
            final g g15;
            (g15 = new g()).a(806027522L);
            g15.a(PropertyType.BINARY);
            g15.b(this.n.length);
            g15.a(true);
            g15.b(true);
            byteArrayOutputStream.write(g15.a(), 0, 16);
        }
        if (this.o != null) {
            list2.add(new Stream("__substg1.0_65E20102", this.o));
            final g g16;
            (g16 = new g()).a(1709310210L);
            g16.a(PropertyType.BINARY);
            g16.b(this.o.length);
            g16.a(true);
            g16.b(true);
            byteArrayOutputStream.write(g16.a(), 0, 16);
        }
        if (this.p != null) {
            list2.add(new Stream("__substg1.0_0FFF0102", this.p));
            final g g17;
            (g17 = new g()).a(268370178L);
            g17.a(PropertyType.BINARY);
            g17.b(this.p.length);
            g17.a(true);
            g17.b(true);
            byteArrayOutputStream.write(g17.a(), 0, 16);
        }
        if (this.q != null) {
            list2.add(new Stream("__substg1.0_00460102", this.q));
            final g g18;
            (g18 = new g()).a(4587778L);
            g18.a(PropertyType.BINARY);
            g18.b(this.q.length);
            g18.a(true);
            g18.b(true);
            byteArrayOutputStream.write(g18.a(), 0, 16);
        }
        if (this.r != null) {
            list2.add(new Stream("__substg1.0_00530102", this.r));
            final g g19;
            (g19 = new g()).a(5439746L);
            g19.a(PropertyType.BINARY);
            g19.b(this.r.length);
            g19.a(true);
            g19.b(true);
            byteArrayOutputStream.write(g19.a(), 0, 16);
        }
        if (this.s != null) {
            final byte[] a5 = com.ews.msg.h.a(this.s);
            final g g20;
            (g20 = new g()).a(805765184L);
            g20.a(PropertyType.TIME);
            g20.a(a5);
            g20.a(true);
            g20.b(false);
            byteArrayOutputStream.write(g20.a(), 0, 16);
        }
        if (this.t != null) {
            final byte[] a6 = com.ews.msg.h.a(this.t);
            final g g21;
            (g21 = new g()).a(805830720L);
            g21.a(PropertyType.TIME);
            g21.a(a6);
            g21.a(true);
            g21.b(false);
            byteArrayOutputStream.write(g21.a(), 0, 16);
        }
        if (this.u != null) {
            final byte[] a7 = com.ews.msg.h.a(this.u);
            final g g22;
            (g22 = new g()).a(235274304L);
            g22.a(PropertyType.TIME);
            g22.a(a7);
            g22.a(true);
            g22.b(true);
            byteArrayOutputStream.write(g22.a(), 0, 16);
        }
        if (this.v != null) {
            final byte[] a8 = com.ews.msg.h.a(this.v);
            final g g23;
            (g23 = new g()).a(3735616L);
            g23.a(PropertyType.TIME);
            g23.a(a8);
            g23.a(true);
            g23.b(true);
            byteArrayOutputStream.write(g23.a(), 0, 16);
        }
        if (this.w != null) {
            final byte[] a9 = com.ews.msg.h.a(this.w);
            final g g24;
            (g24 = new g()).a(4718656L);
            g24.a(PropertyType.TIME);
            g24.a(a9);
            g24.a(true);
            g24.b(true);
            byteArrayOutputStream.write(g24.a(), 0, 16);
        }
        if (this.x != null) {
            final byte[] a10 = com.ews.msg.h.a(this.x);
            final g g25;
            (g25 = new g()).a(3276864L);
            g25.a(PropertyType.TIME);
            g25.a(a10);
            g25.a(true);
            g25.b(true);
            byteArrayOutputStream.write(g25.a(), 0, 16);
        }
        if (this.at != null) {
            final byte[] a11 = com.ews.msg.h.a(this.at);
            final g g26;
            (g26 = new g()).a(276955200L);
            g26.a(PropertyType.TIME);
            g26.a(a11);
            g26.a(true);
            g26.b(true);
            byteArrayOutputStream.write(g26.a(), 0, 16);
        }
        if (this.y != null) {
            final byte[] array12 = this.ds.encode(this.y).array();
            list2.add(new Stream("__substg1.0_1001" + this.dm, array12));
            final g g27;
            (g27 = new g()).a(0x10010000 | this.dn);
            g27.a(PropertyType.STRING8);
            g27.b(array12.length + this.dq);
            g27.a(true);
            g27.b(true);
            byteArrayOutputStream.write(g27.a(), 0, 16);
        }
        if (this.z != null) {
            final byte[] array13 = this.ds.encode(this.z).array();
            list2.add(new Stream("__substg1.0_3FF8" + this.dm, array13));
            final g g28;
            (g28 = new g()).a(0x3FF80000 | this.dn);
            g28.a(PropertyType.STRING8);
            g28.b(array13.length + this.dq);
            g28.a(true);
            g28.b(true);
            byteArrayOutputStream.write(g28.a(), 0, 16);
        }
        if (this.A != null) {
            final byte[] array14 = this.ds.encode(this.A).array();
            list2.add(new Stream("__substg1.0_3FFA" + this.dm, array14));
            final g g29;
            (g29 = new g()).a(0x3FFA0000 | this.dn);
            g29.a(PropertyType.STRING8);
            g29.b(array14.length + this.dq);
            g29.a(true);
            g29.b(true);
            byteArrayOutputStream.write(g29.a(), 0, 16);
        }
        if (this.B != null) {
            final byte[] array15 = this.ds.encode(this.B).array();
            list2.add(new Stream("__substg1.0_1035" + this.dm, array15));
            final g g30;
            (g30 = new g()).a(0x10350000 | this.dn);
            g30.a(PropertyType.STRING8);
            g30.b(array15.length + this.dq);
            g30.a(true);
            g30.b(true);
            byteArrayOutputStream.write(g30.a(), 0, 16);
        }
        if (this.C != null) {
            final byte[] array16 = this.ds.encode(this.C).array();
            list2.add(new Stream("__substg1.0_1042" + this.dm, array16));
            final g g31;
            (g31 = new g()).a(0x10420000 | this.dn);
            g31.a(PropertyType.STRING8);
            g31.b(array16.length + this.dq);
            g31.a(true);
            g31.b(true);
            byteArrayOutputStream.write(g31.a(), 0, 16);
        }
        if (this.D != null) {
            final byte[] array17 = this.ds.encode(this.D).array();
            list2.add(new Stream("__substg1.0_1039" + this.dm, array17));
            final g g32;
            (g32 = new g()).a(0x10390000 | this.dn);
            g32.a(PropertyType.STRING8);
            g32.b(array17.length + this.dq);
            g32.a(true);
            g32.b(true);
            byteArrayOutputStream.write(g32.a(), 0, 16);
        }
        if (this.E != null && this.E.longValue() > 0L) {
            final g g33;
            (g33 = new g()).a(1073545219L);
            g33.a(PropertyType.INTEGER32);
            g33.a(this.E.a());
            g33.a(true);
            g33.b(true);
            byteArrayOutputStream.write(g33.a(), 0, 16);
        }
        if (this.F != null && this.F.longValue() > 0L) {
            final g g34;
            (g34 = new g()).a(276824067L);
            g34.a(PropertyType.INTEGER32);
            g34.a(this.F.a());
            g34.a(true);
            g34.b(true);
            byteArrayOutputStream.write(g34.a(), 0, 16);
        }
        if (this.G != null && this.G.longValue() > 0L) {
            final g g35;
            (g35 = new g()).a(235405315L);
            g35.a(PropertyType.INTEGER32);
            g35.a(this.G.a());
            g35.a(true);
            g35.b(true);
            byteArrayOutputStream.write(g35.a(), 0, 16);
        }
        if (this.av != null && this.av.size() > 0) {
            final g g36;
            (g36 = new g()).a(235339779L);
            g36.a(PropertyType.INTEGER32);
            g36.a(new d(com.ews.msg.a.b(this.av)).a());
            g36.a(true);
            g36.b(true);
            byteArrayOutputStream.write(g36.a(), 0, 16);
        }
        if (this.H != null && this.H.longValue() > 0L) {
            final g g37;
            (g37 = new g()).a(1071513603L);
            g37.a(PropertyType.INTEGER32);
            g37.a(this.H.a());
            g37.a(true);
            g37.b(true);
            byteArrayOutputStream.write(g37.a(), 0, 16);
        }
        if (this.I != null) {
            list2.add(new Stream("__substg1.0_00710102", this.I));
            final g g38;
            (g38 = new g()).a(7405826L);
            g38.a(PropertyType.BINARY);
            g38.b(this.I.length);
            g38.a(true);
            g38.b(true);
            byteArrayOutputStream.write(g38.a(), 0, 16);
        }
        if (this.J) {
            final g g39;
            (g39 = new g()).a(284426251L);
            g39.a(PropertyType.BOOLEAN);
            g39.a(new c(1).a());
            g39.a(true);
            g39.b(true);
            byteArrayOutputStream.write(g39.a(), 0, 16);
        }
        if (this.K) {
            final g g40;
            (g40 = new g()).a(284557323L);
            g40.a(PropertyType.BOOLEAN);
            g40.a(new c(1).a());
            g40.a(true);
            g40.b(true);
            byteArrayOutputStream.write(g40.a(), 0, 16);
        }
        if (this.L) {
            final g g41;
            (g41 = new g()).a(284491787L);
            g41.a(PropertyType.BOOLEAN);
            g41.a(new c(1).a());
            g41.a(true);
            g41.b(true);
            byteArrayOutputStream.write(g41.a(), 0, 16);
        }
        if (this.M) {
            final g g42;
            (g42 = new g()).a(284295179L);
            g42.a(PropertyType.BOOLEAN);
            g42.a(new c(1).a());
            g42.a(true);
            g42.b(true);
            byteArrayOutputStream.write(g42.a(), 0, 16);
        }
        if (this.dj.size() > 0) {
            final g g43;
            (g43 = new g()).a(236650507L);
            g43.a(PropertyType.BOOLEAN);
            g43.a(new c(1).a());
            g43.a(true);
            g43.b(true);
            byteArrayOutputStream.write(g43.a(), 0, 16);
        }
        if (this.O) {
            final g g44;
            (g44 = new g()).a(236912651L);
            g44.a(PropertyType.BOOLEAN);
            g44.a(new c(1).a());
            g44.a(true);
            g44.b(true);
            byteArrayOutputStream.write(g44.a(), 0, 16);
        }
        if (this.P) {
            final g g45;
            (g45 = new g()).a(2686987L);
            g45.a(PropertyType.BOOLEAN);
            g45.a(new c(1).a());
            g45.a(true);
            g45.b(true);
            byteArrayOutputStream.write(g45.a(), 0, 16);
        }
        if (this.Q) {
            final g g46;
            (g46 = new g()).a(2293771L);
            g46.a(PropertyType.BOOLEAN);
            g46.a(new c(1).a());
            g46.a(true);
            g46.b(true);
            byteArrayOutputStream.write(g46.a(), 0, 16);
        }
        if (this.R != null) {
            list2.add(new Stream("__substg1.0_10130102", this.R));
            final g g47;
            (g47 = new g()).a(269680898L);
            g47.a(PropertyType.BINARY);
            g47.b(this.R.length);
            g47.a(true);
            g47.b(true);
            byteArrayOutputStream.write(g47.a(), 0, 16);
        }
        if (this.S != Sensitivity.NONE) {
            final g g48;
            (g48 = new g()).a(3538947L);
            g48.a(PropertyType.INTEGER32);
            g48.a(new d(com.ews.msg.a.a(this.S)).a());
            g48.a(true);
            g48.b(true);
            byteArrayOutputStream.write(g48.a(), 0, 16);
        }
        if (this.au != LastVerbExecuted.NONE) {
            final g g49;
            (g49 = new g()).a(276889603L);
            g49.a(PropertyType.INTEGER32);
            g49.a(new d(com.ews.msg.a.a(this.au)).a());
            g49.a(true);
            g49.b(true);
            byteArrayOutputStream.write(g49.a(), 0, 16);
        }
        if (this.T != Importance.NONE) {
            final g g50;
            (g50 = new g()).a(1507331L);
            g50.a(PropertyType.INTEGER32);
            g50.a(new d(com.ews.msg.a.a(this.T)).a());
            g50.a(true);
            g50.b(true);
            byteArrayOutputStream.write(g50.a(), 0, 16);
        }
        if (this.U != Priority.NONE) {
            final g g51;
            (g51 = new g()).a(2490371L);
            g51.a(PropertyType.INTEGER32);
            g51.a(new d(com.ews.msg.a.a(this.U)).a());
            g51.a(true);
            g51.b(true);
            byteArrayOutputStream.write(g51.a(), 0, 16);
        }
        if (this.V != FlagIcon.NONE) {
            final g g52;
            (g52 = new g()).a(278200323L);
            g52.a(PropertyType.INTEGER32);
            g52.a(new d(com.ews.msg.a.a(this.V)).a());
            g52.a(true);
            g52.b(true);
            byteArrayOutputStream.write(g52.a(), 0, 16);
        }
        if (this.W != FlagStatus.NONE) {
            final g g53;
            (g53 = new g()).a(277872643L);
            g53.a(PropertyType.INTEGER32);
            g53.a(new d(com.ews.msg.a.a(this.W)).a());
            g53.a(true);
            g53.b(true);
            byteArrayOutputStream.write(g53.a(), 0, 16);
        }
        if (this.X != ObjectType.NONE) {
            final g g54;
            (g54 = new g()).a(268304387L);
            g54.a(PropertyType.INTEGER32);
            g54.a(new d(com.ews.msg.a.a(this.X)).a());
            g54.a(true);
            g54.b(true);
            byteArrayOutputStream.write(g54.a(), 0, 16);
        }
        if (this.Y != null) {
            final byte[] array18 = this.ds.encode(this.Y).array();
            list2.add(new Stream("__substg1.0_0077" + this.dm, array18));
            final g g55;
            (g55 = new g()).a(0x770000 | this.dn);
            g55.a(PropertyType.STRING8);
            g55.b(array18.length + this.dq);
            g55.a(true);
            g55.b(true);
            byteArrayOutputStream.write(g55.a(), 0, 16);
        }
        if (this.Z != null) {
            final byte[] array19 = this.ds.encode(this.Z).array();
            list2.add(new Stream("__substg1.0_0078" + this.dm, array19));
            final g g56;
            (g56 = new g()).a(0x780000 | this.dn);
            g56.a(PropertyType.STRING8);
            g56.b(array19.length + this.dq);
            g56.a(true);
            g56.b(true);
            byteArrayOutputStream.write(g56.a(), 0, 16);
        }
        if (this.aa != null) {
            list2.add(new Stream("__substg1.0_00430102", this.aa));
            final g g57;
            (g57 = new g()).a(4391170L);
            g57.a(PropertyType.BINARY);
            g57.b(this.aa.length);
            g57.a(true);
            g57.b(true);
            byteArrayOutputStream.write(g57.a(), 0, 16);
        }
        if (this.ab != null) {
            final byte[] array20 = this.ds.encode(this.ab).array();
            list2.add(new Stream("__substg1.0_0044" + this.dm, array20));
            final g g58;
            (g58 = new g()).a(0x440000 | this.dn);
            g58.a(PropertyType.STRING8);
            g58.b(array20.length + this.dq);
            g58.a(true);
            g58.b(true);
            byteArrayOutputStream.write(g58.a(), 0, 16);
        }
        if (this.ac != null) {
            list2.add(new Stream("__substg1.0_00520102", this.ac));
            final g g59;
            (g59 = new g()).a(5374210L);
            g59.a(PropertyType.BINARY);
            g59.b(this.ac.length);
            g59.a(true);
            g59.b(true);
            byteArrayOutputStream.write(g59.a(), 0, 16);
        }
        if (this.ad != null) {
            final byte[] array21 = this.ds.encode(this.ad).array();
            list2.add(new Stream("__substg1.0_0075" + this.dm, array21));
            final g g60;
            (g60 = new g()).a(0x750000 | this.dn);
            g60.a(PropertyType.STRING8);
            g60.b(array21.length + this.dq);
            g60.a(true);
            g60.b(true);
            byteArrayOutputStream.write(g60.a(), 0, 16);
        }
        if (this.ae != null) {
            final byte[] array22 = this.ds.encode(this.ae).array();
            list2.add(new Stream("__substg1.0_0076" + this.dm, array22));
            final g g61;
            (g61 = new g()).a(0x760000 | this.dn);
            g61.a(PropertyType.STRING8);
            g61.b(array22.length + this.dq);
            g61.a(true);
            g61.b(true);
            byteArrayOutputStream.write(g61.a(), 0, 16);
        }
        if (this.af != null) {
            list2.add(new Stream("__substg1.0_003F0102", this.af));
            final g g62;
            (g62 = new g()).a(4129026L);
            g62.a(PropertyType.BINARY);
            g62.b(this.af.length);
            g62.a(true);
            g62.b(true);
            byteArrayOutputStream.write(g62.a(), 0, 16);
        }
        if (this.ag != null) {
            final byte[] array23 = this.ds.encode(this.ag).array();
            list2.add(new Stream("__substg1.0_0040" + this.dm, array23));
            final g g63;
            (g63 = new g()).a(0x400000 | this.dn);
            g63.a(PropertyType.STRING8);
            g63.b(array23.length + this.dq);
            g63.a(true);
            g63.b(true);
            byteArrayOutputStream.write(g63.a(), 0, 16);
        }
        if (this.ah != null) {
            list2.add(new Stream("__substg1.0_00510102", this.ah));
            final g g64;
            (g64 = new g()).a(5308674L);
            g64.a(PropertyType.BINARY);
            g64.b(this.ah.length);
            g64.a(true);
            g64.b(true);
            byteArrayOutputStream.write(g64.a(), 0, 16);
        }
        if (this.ai != null) {
            final byte[] array24 = this.ds.encode(this.ai).array();
            list2.add(new Stream("__substg1.0_0C1E" + this.dm, array24));
            final g g65;
            (g65 = new g()).a(0xC1E0000 | this.dn);
            g65.a(PropertyType.STRING8);
            g65.b(array24.length + this.dq);
            g65.a(true);
            g65.b(true);
            byteArrayOutputStream.write(g65.a(), 0, 16);
        }
        if (this.aj != null) {
            final byte[] array25 = this.ds.encode(this.aj).array();
            list2.add(new Stream("__substg1.0_0C1F" + this.dm, array25));
            final g g66;
            (g66 = new g()).a(0xC1F0000 | this.dn);
            g66.a(PropertyType.STRING8);
            g66.b(array25.length + this.dq);
            g66.a(true);
            g66.b(true);
            byteArrayOutputStream.write(g66.a(), 0, 16);
        }
        if (this.ak != null) {
            list2.add(new Stream("__substg1.0_0C190102", this.ak));
            final g g67;
            (g67 = new g()).a(202965250L);
            g67.a(PropertyType.BINARY);
            g67.b(this.ak.length);
            g67.a(true);
            g67.b(true);
            byteArrayOutputStream.write(g67.a(), 0, 16);
        }
        if (this.al != null) {
            final byte[] array26 = this.ds.encode(this.al).array();
            list2.add(new Stream("__substg1.0_0C1A" + this.dm, array26));
            final g g68;
            (g68 = new g()).a(0xC1A0000 | this.dn);
            g68.a(PropertyType.STRING8);
            g68.b(array26.length + this.dq);
            g68.a(true);
            g68.b(true);
            byteArrayOutputStream.write(g68.a(), 0, 16);
        }
        if (this.am != null) {
            list2.add(new Stream("__substg1.0_0C1D0102", this.am));
            final g g69;
            (g69 = new g()).a(203227394L);
            g69.a(PropertyType.BINARY);
            g69.b(this.am.length);
            g69.a(true);
            g69.b(true);
            byteArrayOutputStream.write(g69.a(), 0, 16);
        }
        if (this.an != null) {
            final byte[] array27 = this.ds.encode(this.an).array();
            list2.add(new Stream("__substg1.0_0064" + this.dm, array27));
            final g g70;
            (g70 = new g()).a(0x640000 | this.dn);
            g70.a(PropertyType.STRING8);
            g70.b(array27.length + this.dq);
            g70.a(true);
            g70.b(true);
            byteArrayOutputStream.write(g70.a(), 0, 16);
        }
        if (this.ao != null) {
            final byte[] array28 = this.ds.encode(this.ao).array();
            list2.add(new Stream("__substg1.0_0065" + this.dm, array28));
            final g g71;
            (g71 = new g()).a(0x650000 | this.dn);
            g71.a(PropertyType.STRING8);
            g71.b(array28.length + this.dq);
            g71.a(true);
            g71.b(true);
            byteArrayOutputStream.write(g71.a(), 0, 16);
        }
        if (this.ap != null) {
            list2.add(new Stream("__substg1.0_00410102", this.ap));
            final g g72;
            (g72 = new g()).a(4260098L);
            g72.a(PropertyType.BINARY);
            g72.b(this.ap.length);
            g72.a(true);
            g72.b(true);
            byteArrayOutputStream.write(g72.a(), 0, 16);
        }
        if (this.aq != null) {
            final byte[] array29 = this.ds.encode(this.aq).array();
            list2.add(new Stream("__substg1.0_0042" + this.dm, array29));
            final g g73;
            (g73 = new g()).a(0x420000 | this.dn);
            g73.a(PropertyType.STRING8);
            g73.b(array29.length + this.dq);
            g73.a(true);
            g73.b(true);
            byteArrayOutputStream.write(g73.a(), 0, 16);
        }
        if (this.ar != null) {
            list2.add(new Stream("__substg1.0_003B0102", this.ar));
            final g g74;
            (g74 = new g()).a(3866882L);
            g74.a(PropertyType.BINARY);
            g74.b(this.ar.length);
            g74.a(true);
            g74.b(true);
            byteArrayOutputStream.write(g74.a(), 0, 16);
        }
        if (this.as != null) {
            final byte[] array30 = this.ds.encode(this.as).array();
            list2.add(new Stream("__substg1.0_007D" + this.dm, array30));
            final g g75;
            (g75 = new g()).a(0x7D0000 | this.dn);
            g75.a(PropertyType.STRING8);
            g75.b(array30.length + this.dq);
            g75.a(true);
            g75.b(true);
            byteArrayOutputStream.write(g75.a(), 0, 16);
        }
        if (this.ax != null) {
            final e e;
            (e = new e()).a(new d(34132));
            e.a(StandardPropertySet.COMMON);
            e.a(com.ews.msg.f.b);
            int a12;
            if ((a12 = com.ews.msg.h.a(list, e)) == -1) {
                list.add(e);
                a12 = list.size() - 1;
            }
            final d d = new d(a12 + 32768 << 16 | this.dn);
            final String format = String.format("%08X", d.longValue());
            final byte[] array31 = this.ds.encode(this.ax).array();
            list2.add(new Stream("__substg1.0_" + format, array31));
            final g g76;
            (g76 = new g()).a(d.longValue());
            g76.a(PropertyType.STRING8);
            g76.b(array31.length + this.dq);
            g76.a(true);
            g76.b(true);
            byteArrayOutputStream.write(g76.a(), 0, 16);
        }
        if (this.ay != null && this.ay.longValue() > 0L) {
            final e e2;
            (e2 = new e()).a(new d(34130));
            e2.a(StandardPropertySet.COMMON);
            e2.a(com.ews.msg.f.a);
            int a13;
            if ((a13 = com.ews.msg.h.a(list, e2)) == -1) {
                list.add(e2);
                a13 = list.size() - 1;
            }
            final g g77;
            (g77 = new g()).a(new d(a13 + 32768 << 16 | 0x3).longValue());
            g77.a(PropertyType.INTEGER32);
            g77.a(this.ay.a());
            g77.a(true);
            g77.b(true);
            byteArrayOutputStream.write(g77.a(), 0, 16);
        }
        if (this.az != null) {
            final e e3;
            (e3 = new e()).a(new d(34070));
            e3.a(StandardPropertySet.COMMON);
            e3.a(com.ews.msg.f.a);
            int a14;
            if ((a14 = com.ews.msg.h.a(list, e3)) == -1) {
                list.add(e3);
                a14 = list.size() - 1;
            }
            final d d2 = new d(a14 + 32768 << 16 | 0x40);
            final byte[] a15 = com.ews.msg.h.a(this.az);
            final g g78;
            (g78 = new g()).a(d2.longValue());
            g78.a(PropertyType.TIME);
            g78.a(a15);
            g78.a(true);
            g78.b(true);
            byteArrayOutputStream.write(g78.a(), 0, 16);
        }
        if (this.aA != null) {
            final e e4;
            (e4 = new e()).a(new d(34071));
            e4.a(StandardPropertySet.COMMON);
            e4.a(com.ews.msg.f.a);
            int a16;
            if ((a16 = com.ews.msg.h.a(list, e4)) == -1) {
                list.add(e4);
                a16 = list.size() - 1;
            }
            final byte[] a17 = com.ews.msg.h.a(this.aA);
            final g g79;
            (g79 = new g()).a(a16 + 32768 << 16 | 0x40);
            g79.a(PropertyType.TIME);
            g79.a(a17);
            g79.a(true);
            g79.b(true);
            byteArrayOutputStream.write(g79.a(), 0, 16);
        }
        if (this.aB != null) {
            final e e5;
            (e5 = new e()).a(new d(34144));
            e5.a(StandardPropertySet.COMMON);
            e5.a(com.ews.msg.f.a);
            int a18;
            if ((a18 = com.ews.msg.h.a(list, e5)) == -1) {
                list.add(e5);
                a18 = list.size() - 1;
            }
            final byte[] a19 = com.ews.msg.h.a(this.aB);
            final g g80;
            (g80 = new g()).a(a18 + 32768 << 16 | 0x40);
            g80.a(PropertyType.TIME);
            g80.a(a19);
            g80.a(true);
            g80.b(true);
            byteArrayOutputStream.write(g80.a(), 0, 16);
        }
        if (this.aF.size() > 0) {
            final e e6;
            (e6 = new e()).a(new d(34105));
            e6.a(StandardPropertySet.COMMON);
            e6.a(com.ews.msg.f.b);
            int a20;
            if ((a20 = com.ews.msg.h.a(list, e6)) == -1) {
                list.add(e6);
                a20 = list.size() - 1;
            }
            final d d3 = new d(a20 + 32768 << 16 | this.dp);
            final String format2 = String.format("%08X", d3.longValue());
            final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i = 0; i < this.aF.size(); ++i) {
                final byte[] array32;
                byteArrayOutputStream2.write(new d((array32 = this.ds.encode(this.aF.get(i) + "\u0000").array()).length).a(), 0, 4);
                list2.add(new Stream("__substg1.0_" + format2 + "-" + String.format("%08X", i), array32));
            }
            final byte[] byteArray = byteArrayOutputStream2.toByteArray();
            list2.add(new Stream("__substg1.0_" + format2, byteArray));
            final g g81;
            (g81 = new g()).a(d3.longValue());
            g81.a(PropertyType.MULTIPLE_STRING8);
            g81.b(byteArray.length);
            g81.a(true);
            g81.b(true);
            byteArrayOutputStream.write(g81.a(), 0, 16);
        }
        if (this.aG.size() > 0) {
            final e e7;
            (e7 = new e()).a(new d(34106));
            e7.a(StandardPropertySet.COMMON);
            e7.a(com.ews.msg.f.b);
            int a21;
            if ((a21 = com.ews.msg.h.a(list, e7)) == -1) {
                list.add(e7);
                a21 = list.size() - 1;
            }
            final d d4 = new d(a21 + 32768 << 16 | this.dp);
            final String format3 = String.format("%08X", d4.longValue());
            final ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            for (int j = 0; j < this.aG.size(); ++j) {
                final byte[] array33;
                byteArrayOutputStream3.write(new d((array33 = this.ds.encode(this.aG.get(j) + "\u0000").array()).length).a(), 0, 4);
                list2.add(new Stream("__substg1.0_" + format3 + "-" + String.format("%08X", j), array33));
            }
            final byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            list2.add(new Stream("__substg1.0_" + format3, byteArray2));
            final g g82;
            (g82 = new g()).a(d4.longValue());
            g82.a(PropertyType.MULTIPLE_STRING8);
            g82.b(byteArray2.length);
            g82.a(true);
            g82.b(true);
            byteArrayOutputStream.write(g82.a(), 0, 16);
        }
        if (this.aH.size() > 0) {
            final e e8;
            (e8 = new e()).a("Keywords");
            e8.a(StandardPropertySet.PUBLIC_STRINGS);
            e8.a(com.ews.msg.f.b);
            int a22;
            if ((a22 = com.ews.msg.h.a(list, e8)) == -1) {
                list.add(e8);
                a22 = list.size() - 1;
            }
            final d d5 = new d(a22 + 32768 << 16 | this.dp);
            final String format4 = String.format("%08X", d5.longValue());
            final ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            for (int k = 0; k < this.aH.size(); ++k) {
                final byte[] array34;
                byteArrayOutputStream4.write(new d((array34 = this.ds.encode(this.aH.get(k) + "\u0000").array()).length).a(), 0, 4);
                list2.add(new Stream("__substg1.0_" + format4 + "-" + String.format("%08X", k), array34));
            }
            final byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
            list2.add(new Stream("__substg1.0_" + format4, byteArray3));
            final g g83;
            (g83 = new g()).a(d5.longValue());
            g83.a(PropertyType.MULTIPLE_STRING8);
            g83.b(byteArray3.length);
            g83.a(true);
            g83.b(true);
            byteArrayOutputStream.write(g83.a(), 0, 16);
        }
        if (this.aI != null) {
            final e e9;
            (e9 = new e()).a(new d(34101));
            e9.a(StandardPropertySet.COMMON);
            e9.a(com.ews.msg.f.b);
            int a23;
            if ((a23 = com.ews.msg.h.a(list, e9)) == -1) {
                list.add(e9);
                a23 = list.size() - 1;
            }
            final d d6 = new d(a23 + 32768 << 16 | this.dn);
            final String format5 = String.format("%08X", d6.longValue());
            final byte[] array35 = this.ds.encode(this.aI).array();
            list2.add(new Stream("__substg1.0_" + format5, array35));
            final g g84;
            (g84 = new g()).a(d6.longValue());
            g84.a(PropertyType.STRING8);
            g84.b(array35.length + this.dq);
            g84.a(true);
            g84.b(true);
            byteArrayOutputStream.write(g84.a(), 0, 16);
        }
        if (this.aJ != null) {
            final e e10;
            (e10 = new e()).a(new d(34100));
            e10.a(StandardPropertySet.COMMON);
            e10.a(com.ews.msg.f.b);
            int a24;
            if ((a24 = com.ews.msg.h.a(list, e10)) == -1) {
                list.add(e10);
                a24 = list.size() - 1;
            }
            final d d7 = new d(a24 + 32768 << 16 | this.dn);
            final String format6 = String.format("%08X", d7.longValue());
            final byte[] array36 = this.ds.encode(this.aJ).array();
            list2.add(new Stream("__substg1.0_" + format6, array36));
            final g g85;
            (g85 = new g()).a(d7.longValue());
            g85.a(PropertyType.STRING8);
            g85.b(array36.length + this.dq);
            g85.a(true);
            g85.b(true);
            byteArrayOutputStream.write(g85.a(), 0, 16);
        }
        if (this.aK != null) {
            final e e11;
            (e11 = new e()).a(new d(34079));
            e11.a(StandardPropertySet.COMMON);
            e11.a(com.ews.msg.f.b);
            int a25;
            if ((a25 = com.ews.msg.h.a(list, e11)) == -1) {
                list.add(e11);
                a25 = list.size() - 1;
            }
            final d d8 = new d(a25 + 32768 << 16 | this.dn);
            final String format7 = String.format("%08X", d8.longValue());
            final byte[] array37 = this.ds.encode(this.aK).array();
            list2.add(new Stream("__substg1.0_" + format7, array37));
            final g g86;
            (g86 = new g()).a(d8.longValue());
            g86.a(PropertyType.STRING8);
            g86.b(array37.length + this.dq);
            g86.a(true);
            g86.b(true);
            byteArrayOutputStream.write(g86.a(), 0, 16);
        }
        if (this.aL) {
            final e e12;
            (e12 = new e()).a(new d(34054));
            e12.a(StandardPropertySet.COMMON);
            e12.a(com.ews.msg.f.a);
            int a26;
            if ((a26 = com.ews.msg.h.a(list, e12)) == -1) {
                list.add(e12);
                a26 = list.size() - 1;
            }
            final g g87;
            (g87 = new g()).a(new d(a26 + 32768 << 16 | 0xB).longValue());
            g87.a(PropertyType.BOOLEAN);
            g87.a(new c(1).a());
            g87.a(true);
            g87.b(true);
            byteArrayOutputStream.write(g87.a(), 0, 16);
        }
        if (this.aN) {
            final e e13;
            (e13 = new e()).a(new d(34076));
            e13.a(StandardPropertySet.COMMON);
            e13.a(com.ews.msg.f.a);
            int a27;
            if ((a27 = com.ews.msg.h.a(list, e13)) == -1) {
                list.add(e13);
                a27 = list.size() - 1;
            }
            final g g88;
            (g88 = new g()).a(new d(a27 + 32768 << 16 | 0xB).longValue());
            g88.a(PropertyType.BOOLEAN);
            g88.a(new c(1).a());
            g88.a(true);
            g88.b(true);
            byteArrayOutputStream.write(g88.a(), 0, 16);
        }
        if (this.aO) {
            final e e14;
            (e14 = new e()).a(new d(34078));
            e14.a(StandardPropertySet.COMMON);
            e14.a(com.ews.msg.f.a);
            int a28;
            if ((a28 = com.ews.msg.h.a(list, e14)) == -1) {
                list.add(e14);
                a28 = list.size() - 1;
            }
            final g g89;
            (g89 = new g()).a(new d(a28 + 32768 << 16 | 0xB).longValue());
            g89.a(PropertyType.BOOLEAN);
            g89.a(new c(1).a());
            g89.a(true);
            g89.b(true);
            byteArrayOutputStream.write(g89.a(), 0, 16);
        }
        if (this.aP != null) {
            final e e15;
            (e15 = new e()).a(new d(33293));
            e15.a(StandardPropertySet.APPOINTMENT);
            e15.a(com.ews.msg.f.a);
            int a29;
            if ((a29 = com.ews.msg.h.a(list, e15)) == -1) {
                list.add(e15);
                a29 = list.size() - 1;
            }
            final d d9 = new d(a29 + 32768 << 16 | 0x40);
            final byte[] a30 = com.ews.msg.h.a(this.aP);
            final g g90;
            (g90 = new g()).a(d9.longValue());
            g90.a(PropertyType.TIME);
            g90.a(a30);
            g90.a(true);
            g90.b(true);
            byteArrayOutputStream.write(g90.a(), 0, 16);
        }
        if (this.aQ != null) {
            final e e16;
            (e16 = new e()).a(new d(33294));
            e16.a(StandardPropertySet.APPOINTMENT);
            e16.a(com.ews.msg.f.a);
            int a31;
            if ((a31 = com.ews.msg.h.a(list, e16)) == -1) {
                list.add(e16);
                a31 = list.size() - 1;
            }
            final d d10 = new d(a31 + 32768 << 16 | 0x40);
            final byte[] a32 = com.ews.msg.h.a(this.aQ);
            final g g91;
            (g91 = new g()).a(d10.longValue());
            g91.a(PropertyType.TIME);
            g91.a(a32);
            g91.a(true);
            g91.b(true);
            byteArrayOutputStream.write(g91.a(), 0, 16);
        }
        if (this.aS != null) {
            final e e17;
            (e17 = new e()).a(new d(33288));
            e17.a(StandardPropertySet.APPOINTMENT);
            e17.a(com.ews.msg.f.b);
            int a33;
            if ((a33 = com.ews.msg.h.a(list, e17)) == -1) {
                list.add(e17);
                a33 = list.size() - 1;
            }
            final d d11 = new d(a33 + 32768 << 16 | this.dn);
            final String format8 = String.format("%08X", d11.longValue());
            final byte[] array38 = this.ds.encode(this.aS).array();
            list2.add(new Stream("__substg1.0_" + format8, array38));
            final g g92;
            (g92 = new g()).a(d11.longValue());
            g92.a(PropertyType.STRING8);
            g92.b(array38.length + this.dq);
            g92.a(true);
            g92.b(true);
            byteArrayOutputStream.write(g92.a(), 0, 16);
        }
        if (this.aX != null) {
            final e e18;
            (e18 = new e()).a(new d(36));
            e18.a(new byte[] { -112, -38, -40, 110, 11, 69, 27, 16, -104, -38, 0, -86, 0, 63, 19, 5 });
            e18.a(com.ews.msg.f.b);
            int a34;
            if ((a34 = com.ews.msg.h.a(list, e18)) == -1) {
                list.add(e18);
                a34 = list.size() - 1;
            }
            final d d12 = new d(a34 + 32768 << 16 | this.dn);
            final String format9 = String.format("%08X", d12.longValue());
            final byte[] array39 = this.ds.encode(this.aX).array();
            list2.add(new Stream("__substg1.0_" + format9, array39));
            final g g93;
            (g93 = new g()).a(d12.longValue());
            g93.a(PropertyType.STRING8);
            g93.b(array39.length + this.dq);
            g93.a(true);
            g93.b(true);
            byteArrayOutputStream.write(g93.a(), 0, 16);
        }
        if (this.aY != null) {
            final e e19;
            (e19 = new e()).a(new d(33332));
            e19.a(StandardPropertySet.APPOINTMENT);
            e19.a(com.ews.msg.f.b);
            int a35;
            if ((a35 = com.ews.msg.h.a(list, e19)) == -1) {
                list.add(e19);
                a35 = list.size() - 1;
            }
            final d d13 = new d(a35 + 32768 << 16 | this.dn);
            final String format10 = String.format("%08X", d13.longValue());
            final byte[] array40 = this.ds.encode(this.aY).array();
            list2.add(new Stream("__substg1.0_" + format10, array40));
            final g g94;
            (g94 = new g()).a(d13.longValue());
            g94.a(PropertyType.STRING8);
            g94.b(array40.length + this.dq);
            g94.a(true);
            g94.b(true);
            byteArrayOutputStream.write(g94.a(), 0, 16);
        }
        if (this.aZ != null) {
            final e e20;
            (e20 = new e()).a(new d(33330));
            e20.a(StandardPropertySet.APPOINTMENT);
            e20.a(com.ews.msg.f.b);
            int a36;
            if ((a36 = com.ews.msg.h.a(list, e20)) == -1) {
                list.add(e20);
                a36 = list.size() - 1;
            }
            final d d14 = new d(a36 + 32768 << 16 | this.dn);
            final String format11 = String.format("%08X", d14.longValue());
            final byte[] array41 = this.ds.encode(this.aZ).array();
            list2.add(new Stream("__substg1.0_" + format11, array41));
            final g g95;
            (g95 = new g()).a(d14.longValue());
            g95.a(PropertyType.STRING8);
            g95.b(array41.length + this.dq);
            g95.a(true);
            g95.b(true);
            byteArrayOutputStream.write(g95.a(), 0, 16);
        }
        if (this.aT != BusyStatus.NONE) {
            final e e21;
            (e21 = new e()).a(new d(33285));
            e21.a(StandardPropertySet.APPOINTMENT);
            e21.a(com.ews.msg.f.a);
            int a37;
            if ((a37 = com.ews.msg.h.a(list, e21)) == -1) {
                list.add(e21);
                a37 = list.size() - 1;
            }
            final g g96;
            (g96 = new g()).a(new d(a37 + 32768 << 16 | 0x3).longValue());
            g96.a(PropertyType.INTEGER32);
            g96.a(new d(com.ews.msg.a.a(this.aT)).a());
            g96.a(true);
            g96.b(true);
            byteArrayOutputStream.write(g96.a(), 0, 16);
        }
        if (this.aU != MeetingStatus.NONE) {
            final e e22;
            (e22 = new e()).a(new d(33303));
            e22.a(StandardPropertySet.APPOINTMENT);
            e22.a(com.ews.msg.f.a);
            int a38;
            if ((a38 = com.ews.msg.h.a(list, e22)) == -1) {
                list.add(e22);
                a38 = list.size() - 1;
            }
            final g g97;
            (g97 = new g()).a(new d(a38 + 32768 << 16 | 0x3).longValue());
            g97.a(PropertyType.INTEGER32);
            g97.a(new d(com.ews.msg.a.a(this.aU)).a());
            g97.a(true);
            g97.b(true);
            byteArrayOutputStream.write(g97.a(), 0, 16);
        }
        if (this.aV != ResponseStatus.NONE) {
            final e e23;
            (e23 = new e()).a(new d(33304));
            e23.a(StandardPropertySet.APPOINTMENT);
            e23.a(com.ews.msg.f.a);
            int a39;
            if ((a39 = com.ews.msg.h.a(list, e23)) == -1) {
                list.add(e23);
                a39 = list.size() - 1;
            }
            final g g98;
            (g98 = new g()).a(new d(a39 + 32768 << 16 | 0x3).longValue());
            g98.a(PropertyType.INTEGER32);
            g98.a(new d(com.ews.msg.a.a(this.aV)).a());
            g98.a(true);
            g98.b(true);
            byteArrayOutputStream.write(g98.a(), 0, 16);
        }
        if (this.aW != RecurrenceType.NONE) {
            final e e24;
            (e24 = new e()).a(new d(33329));
            e24.a(StandardPropertySet.APPOINTMENT);
            e24.a(com.ews.msg.f.a);
            int a40;
            if ((a40 = com.ews.msg.h.a(list, e24)) == -1) {
                list.add(e24);
                a40 = list.size() - 1;
            }
            final g g99;
            (g99 = new g()).a(new d(a40 + 32768 << 16 | 0x3).longValue());
            g99.a(PropertyType.INTEGER32);
            g99.a(new d(com.ews.msg.a.a(this.aW)).a());
            g99.a(true);
            g99.b(true);
            byteArrayOutputStream.write(g99.a(), 0, 16);
        }
        if (this.ba != null) {
            final e e25;
            (e25 = new e()).a(new d(3));
            e25.a(new byte[] { -112, -38, -40, 110, 11, 69, 27, 16, -104, -38, 0, -86, 0, 63, 19, 5 });
            e25.a(com.ews.msg.f.a);
            int a41;
            if ((a41 = com.ews.msg.h.a(list, e25)) == -1) {
                list.add(e25);
                a41 = list.size() - 1;
            }
            final d d15 = new d(a41 + 32768 << 16 | 0x102);
            list2.add(new Stream("__substg1.0_" + String.format("%08X", d15.longValue()), this.ba));
            final g g100;
            (g100 = new g()).a(d15.longValue());
            g100.a(PropertyType.INTEGER32);
            g100.b(this.ba.length);
            g100.a(true);
            g100.b(true);
            byteArrayOutputStream.write(g100.a(), 0, 16);
        }
        if (this.bb >= 0) {
            final e e26;
            (e26 = new e()).a(new d(33300));
            e26.a(StandardPropertySet.APPOINTMENT);
            e26.a(com.ews.msg.f.a);
            int a42;
            if ((a42 = com.ews.msg.h.a(list, e26)) == -1) {
                list.add(e26);
                a42 = list.size() - 1;
            }
            final g g101;
            (g101 = new g()).a(new d(a42 + 32768 << 16 | 0x3).longValue());
            g101.a(PropertyType.INTEGER32);
            g101.a(new d(this.bb).a());
            g101.a(true);
            g101.b(true);
            byteArrayOutputStream.write(g101.a(), 0, 16);
        }
        if (this.bc > 0) {
            final e e27;
            (e27 = new e()).a(new d(33299));
            e27.a(StandardPropertySet.APPOINTMENT);
            e27.a(com.ews.msg.f.a);
            int a43;
            if ((a43 = com.ews.msg.h.a(list, e27)) == -1) {
                list.add(e27);
                a43 = list.size() - 1;
            }
            final g g102;
            (g102 = new g()).a(new d(a43 + 32768 << 16 | 0x3).longValue());
            g102.a(PropertyType.INTEGER32);
            g102.a(new d(this.bc).a());
            g102.a(true);
            g102.b(true);
            byteArrayOutputStream.write(g102.a(), 0, 16);
        }
        if (this.bf != null) {
            final e e28;
            (e28 = new e()).a(new d(33055));
            e28.a(StandardPropertySet.TASK);
            e28.a(com.ews.msg.f.b);
            int a44;
            if ((a44 = com.ews.msg.h.a(list, e28)) == -1) {
                list.add(e28);
                a44 = list.size() - 1;
            }
            final d d16 = new d(a44 + 32768 << 16 | this.dn);
            final String format12 = String.format("%08X", d16.longValue());
            final byte[] array42 = this.ds.encode(this.bf).array();
            list2.add(new Stream("__substg1.0_" + format12, array42));
            final g g103;
            (g103 = new g()).a(d16.longValue());
            g103.a(PropertyType.STRING8);
            g103.b(array42.length + this.dq);
            g103.a(true);
            g103.b(true);
            byteArrayOutputStream.write(g103.a(), 0, 16);
        }
        if (this.bg != null) {
            final e e29;
            (e29 = new e()).a(new d(33057));
            e29.a(StandardPropertySet.TASK);
            e29.a(com.ews.msg.f.b);
            int a45;
            if ((a45 = com.ews.msg.h.a(list, e29)) == -1) {
                list.add(e29);
                a45 = list.size() - 1;
            }
            final d d17 = new d(a45 + 32768 << 16 | this.dn);
            final String format13 = String.format("%08X", d17.longValue());
            final byte[] array43 = this.ds.encode(this.bg).array();
            list2.add(new Stream("__substg1.0_" + format13, array43));
            final g g104;
            (g104 = new g()).a(d17.longValue());
            g104.a(PropertyType.STRING8);
            g104.b(array43.length + this.dq);
            g104.a(true);
            g104.b(true);
            byteArrayOutputStream.write(g104.a(), 0, 16);
        }
        if (this.bh > 0.0) {
            final e e30;
            (e30 = new e()).a(new d(33026));
            e30.a(StandardPropertySet.TASK);
            e30.a(com.ews.msg.f.a);
            int a46;
            if ((a46 = com.ews.msg.h.a(list, e30)) == -1) {
                list.add(e30);
                a46 = list.size() - 1;
            }
            final d d18 = new d(a46 + 32768 << 16 | 0x5);
            final ByteBuffer allocate;
            (allocate = ByteBuffer.allocate(8)).order(ByteOrder.LITTLE_ENDIAN);
            allocate.putDouble(this.bh / 100.0);
            final byte[] array44 = allocate.array();
            final g g105;
            (g105 = new g()).a(d18.longValue());
            g105.a(PropertyType.FLOATING64);
            g105.a(array44);
            g105.a(true);
            g105.b(true);
            byteArrayOutputStream.write(g105.a(), 0, 16);
        }
        if (this.bi != null && this.bi.longValue() > 0L) {
            final e e31;
            (e31 = new e()).a(new d(33040));
            e31.a(StandardPropertySet.TASK);
            e31.a(com.ews.msg.f.a);
            int a47;
            if ((a47 = com.ews.msg.h.a(list, e31)) == -1) {
                list.add(e31);
                a47 = list.size() - 1;
            }
            final g g106;
            (g106 = new g()).a(new d(a47 + 32768 << 16 | 0x3).longValue());
            g106.a(PropertyType.INTEGER32);
            g106.a(this.bi.a());
            g106.a(true);
            g106.b(true);
            byteArrayOutputStream.write(g106.a(), 0, 16);
        }
        if (this.bj != null && this.bj.longValue() > 0L) {
            final e e32;
            (e32 = new e()).a(new d(33041));
            e32.a(StandardPropertySet.TASK);
            e32.a(com.ews.msg.f.a);
            int a48;
            if ((a48 = com.ews.msg.h.a(list, e32)) == -1) {
                list.add(e32);
                a48 = list.size() - 1;
            }
            final g g107;
            (g107 = new g()).a(new d(a48 + 32768 << 16 | 0x3).longValue());
            g107.a(PropertyType.INTEGER32);
            g107.a(this.bj.a());
            g107.a(true);
            g107.b(true);
            byteArrayOutputStream.write(g107.a(), 0, 16);
        }
        if (this.bk) {
            final e e33;
            (e33 = new e()).a(new d(33027));
            e33.a(StandardPropertySet.TASK);
            e33.a(com.ews.msg.f.a);
            int a49;
            if ((a49 = com.ews.msg.h.a(list, e33)) == -1) {
                list.add(e33);
                a49 = list.size() - 1;
            }
            final g g108;
            (g108 = new g()).a(new d(a49 + 32768 << 16 | 0xB).longValue());
            g108.a(PropertyType.BOOLEAN);
            g108.a(new c(1).a());
            g108.a(true);
            g108.b(true);
            byteArrayOutputStream.write(g108.a(), 0, 16);
        }
        if (this.bl) {
            final e e34;
            (e34 = new e()).a(new d(33052));
            e34.a(StandardPropertySet.TASK);
            e34.a(com.ews.msg.f.a);
            int a50;
            if ((a50 = com.ews.msg.h.a(list, e34)) == -1) {
                list.add(e34);
                a50 = list.size() - 1;
            }
            final g g109;
            (g109 = new g()).a(new d(a50 + 32768 << 16 | 0xB).longValue());
            g109.a(PropertyType.BOOLEAN);
            g109.a(new c(1).a());
            g109.a(true);
            g109.b(true);
            byteArrayOutputStream.write(g109.a(), 0, 16);
        }
        if (this.aC) {
            final e e35;
            (e35 = new e()).a(new d(33315));
            e35.a(StandardPropertySet.APPOINTMENT);
            e35.a(com.ews.msg.f.a);
            int a51;
            if ((a51 = com.ews.msg.h.a(list, e35)) == -1) {
                list.add(e35);
                a51 = list.size() - 1;
            }
            final g g110;
            (g110 = new g()).a(new d(a51 + 32768 << 16 | 0xB).longValue());
            g110.a(PropertyType.BOOLEAN);
            g110.a(new c(1).a());
            g110.a(true);
            g110.b(true);
            byteArrayOutputStream.write(g110.a(), 0, 16);
        }
        if (this.aR) {
            final e e36;
            (e36 = new e()).a(new d(33301));
            e36.a(StandardPropertySet.APPOINTMENT);
            e36.a(com.ews.msg.f.a);
            int a52;
            if ((a52 = com.ews.msg.h.a(list, e36)) == -1) {
                list.add(e36);
                a52 = list.size() - 1;
            }
            final g g111;
            (g111 = new g()).a(new d(a52 + 32768 << 16 | 0xB).longValue());
            g111.a(PropertyType.BOOLEAN);
            g111.a(new c(1).a());
            g111.a(true);
            g111.b(true);
            byteArrayOutputStream.write(g111.a(), 0, 16);
        }
        if (this.aM) {
            final e e37;
            (e37 = new e()).a(new d(34051));
            e37.a(StandardPropertySet.COMMON);
            e37.a(com.ews.msg.f.a);
            int a53;
            if ((a53 = com.ews.msg.h.a(list, e37)) == -1) {
                list.add(e37);
                a53 = list.size() - 1;
            }
            final g g112;
            (g112 = new g()).a(new d(a53 + 32768 << 16 | 0xB).longValue());
            g112.a(PropertyType.BOOLEAN);
            g112.a(new c(1).a());
            g112.a(true);
            g112.b(true);
            byteArrayOutputStream.write(g112.a(), 0, 16);
        }
        if (this.aD != null) {
            final e e38;
            (e38 = new e()).a(new d(34050));
            e38.a(StandardPropertySet.COMMON);
            e38.a(com.ews.msg.f.a);
            int a54;
            if ((a54 = com.ews.msg.h.a(list, e38)) == -1) {
                list.add(e38);
                a54 = list.size() - 1;
            }
            final d d19 = new d(a54 + 32768 << 16 | 0x40);
            final byte[] a55 = com.ews.msg.h.a(this.aD);
            final g g113;
            (g113 = new g()).a(d19.longValue());
            g113.a(PropertyType.TIME);
            g113.a(a55);
            g113.a(true);
            g113.b(true);
            byteArrayOutputStream.write(g113.a(), 0, 16);
        }
        if (this.aE != null && this.aE.longValue() > 0L) {
            final e e39;
            (e39 = new e()).a(new d(34049));
            e39.a(StandardPropertySet.COMMON);
            e39.a(com.ews.msg.f.a);
            int a56;
            if ((a56 = com.ews.msg.h.a(list, e39)) == -1) {
                list.add(e39);
                a56 = list.size() - 1;
            }
            final g g114;
            (g114 = new g()).a(new d(a56 + 32768 << 16 | 0x3).longValue());
            g114.a(PropertyType.INTEGER32);
            g114.a(this.aE.a());
            g114.a(true);
            g114.b(true);
            byteArrayOutputStream.write(g114.a(), 0, 16);
        }
        if (this.bd != null) {
            final e e40;
            (e40 = new e()).a(new d(33028));
            e40.a(StandardPropertySet.TASK);
            e40.a(com.ews.msg.f.a);
            int a57;
            if ((a57 = com.ews.msg.h.a(list, e40)) == -1) {
                list.add(e40);
                a57 = list.size() - 1;
            }
            final d d20 = new d(a57 + 32768 << 16 | 0x40);
            final byte[] a58 = com.ews.msg.h.a(this.bd);
            final g g115;
            (g115 = new g()).a(d20.longValue());
            g115.a(PropertyType.TIME);
            g115.a(a58);
            g115.a(true);
            g115.b(true);
            byteArrayOutputStream.write(g115.a(), 0, 16);
        }
        if (this.be != null) {
            final e e41;
            (e41 = new e()).a(new d(33029));
            e41.a(StandardPropertySet.TASK);
            e41.a(com.ews.msg.f.a);
            int a59;
            if ((a59 = com.ews.msg.h.a(list, e41)) == -1) {
                list.add(e41);
                a59 = list.size() - 1;
            }
            final d d21 = new d(a59 + 32768 << 16 | 0x40);
            final byte[] a60 = com.ews.msg.h.a(this.be);
            final g g116;
            (g116 = new g()).a(d21.longValue());
            g116.a(PropertyType.TIME);
            g116.a(a60);
            g116.a(true);
            g116.b(true);
            byteArrayOutputStream.write(g116.a(), 0, 16);
        }
        if (this.bm != null) {
            final e e42;
            (e42 = new e()).a(new d(33039));
            e42.a(StandardPropertySet.TASK);
            e42.a(com.ews.msg.f.a);
            int a61;
            if ((a61 = com.ews.msg.h.a(list, e42)) == -1) {
                list.add(e42);
                a61 = list.size() - 1;
            }
            final d d22 = new d(a61 + 32768 << 16 | 0x40);
            final byte[] a62 = com.ews.msg.h.a(this.bm);
            final g g117;
            (g117 = new g()).a(d22.longValue());
            g117.a(PropertyType.TIME);
            g117.a(a62);
            g117.a(true);
            g117.b(true);
            byteArrayOutputStream.write(g117.a(), 0, 16);
        }
        if (this.bn != TaskStatus.NONE) {
            final e e43;
            (e43 = new e()).a(new d(33025));
            e43.a(StandardPropertySet.TASK);
            e43.a(com.ews.msg.f.a);
            int a63;
            if ((a63 = com.ews.msg.h.a(list, e43)) == -1) {
                list.add(e43);
                a63 = list.size() - 1;
            }
            final g g118;
            (g118 = new g()).a(new d(a63 + 32768 << 16 | 0x3).longValue());
            g118.a(PropertyType.INTEGER32);
            g118.a(new d(com.ews.msg.a.a(this.bn)).a());
            g118.a(true);
            g118.b(true);
            byteArrayOutputStream.write(g118.a(), 0, 16);
        }
        if (this.bo != TaskOwnership.NONE) {
            final e e44;
            (e44 = new e()).a(new d(33065));
            e44.a(StandardPropertySet.TASK);
            e44.a(com.ews.msg.f.a);
            int a64;
            if ((a64 = com.ews.msg.h.a(list, e44)) == -1) {
                list.add(e44);
                a64 = list.size() - 1;
            }
            final g g119;
            (g119 = new g()).a(new d(a64 + 32768 << 16 | 0x3).longValue());
            g119.a(PropertyType.INTEGER32);
            g119.a(new d(com.ews.msg.a.a(this.bo)).a());
            g119.a(true);
            g119.b(true);
            byteArrayOutputStream.write(g119.a(), 0, 16);
        }
        if (this.bp != TaskDelegationState.NONE) {
            final e e45;
            (e45 = new e()).a(new d(33066));
            e45.a(StandardPropertySet.TASK);
            e45.a(com.ews.msg.f.a);
            int a65;
            if ((a65 = com.ews.msg.h.a(list, e45)) == -1) {
                list.add(e45);
                a65 = list.size() - 1;
            }
            final g g120;
            (g120 = new g()).a(new d(a65 + 32768 << 16 | 0x3).longValue());
            g120.a(PropertyType.INTEGER32);
            g120.a(new d(com.ews.msg.a.a(this.bp)).a());
            g120.a(true);
            g120.b(true);
            byteArrayOutputStream.write(g120.a(), 0, 16);
        }
        if (this.bt != null && this.bt.longValue() > 0L) {
            final e e46;
            (e46 = new e()).a(new d(35589));
            e46.a(StandardPropertySet.NOTE);
            e46.a(com.ews.msg.f.a);
            int a66;
            if ((a66 = com.ews.msg.h.a(list, e46)) == -1) {
                list.add(e46);
                a66 = list.size() - 1;
            }
            final g g121;
            (g121 = new g()).a(new d(a66 + 32768 << 16 | 0x3).longValue());
            g121.a(PropertyType.INTEGER32);
            g121.a(this.bt.a());
            g121.a(true);
            g121.b(true);
            byteArrayOutputStream.write(g121.a(), 0, 16);
        }
        if (this.bs != null && this.bs.longValue() > 0L) {
            final e e47;
            (e47 = new e()).a(new d(35588));
            e47.a(StandardPropertySet.NOTE);
            e47.a(com.ews.msg.f.a);
            int a67;
            if ((a67 = com.ews.msg.h.a(list, e47)) == -1) {
                list.add(e47);
                a67 = list.size() - 1;
            }
            final g g122;
            (g122 = new g()).a(new d(a67 + 32768 << 16 | 0x3).longValue());
            g122.a(PropertyType.INTEGER32);
            g122.a(this.bs.a());
            g122.a(true);
            g122.b(true);
            byteArrayOutputStream.write(g122.a(), 0, 16);
        }
        if (this.br != null && this.br.longValue() > 0L) {
            final e e48;
            (e48 = new e()).a(new d(35587));
            e48.a(StandardPropertySet.NOTE);
            e48.a(com.ews.msg.f.a);
            int a68;
            if ((a68 = com.ews.msg.h.a(list, e48)) == -1) {
                list.add(e48);
                a68 = list.size() - 1;
            }
            final g g123;
            (g123 = new g()).a(new d(a68 + 32768 << 16 | 0x3).longValue());
            g123.a(PropertyType.INTEGER32);
            g123.a(this.br.a());
            g123.a(true);
            g123.b(true);
            byteArrayOutputStream.write(g123.a(), 0, 16);
        }
        if (this.bq != null && this.bq.longValue() > 0L) {
            final e e49;
            (e49 = new e()).a(new d(35586));
            e49.a(StandardPropertySet.NOTE);
            e49.a(com.ews.msg.f.a);
            int a69;
            if ((a69 = com.ews.msg.h.a(list, e49)) == -1) {
                list.add(e49);
                a69 = list.size() - 1;
            }
            final g g124;
            (g124 = new g()).a(new d(a69 + 32768 << 16 | 0x3).longValue());
            g124.a(PropertyType.INTEGER32);
            g124.a(this.bq.a());
            g124.a(true);
            g124.b(true);
            byteArrayOutputStream.write(g124.a(), 0, 16);
        }
        if (this.bu != NoteColor.NONE) {
            final e e50;
            (e50 = new e()).a(new d(35584));
            e50.a(StandardPropertySet.NOTE);
            e50.a(com.ews.msg.f.a);
            int a70;
            if ((a70 = com.ews.msg.h.a(list, e50)) == -1) {
                list.add(e50);
                a70 = list.size() - 1;
            }
            final g g125;
            (g125 = new g()).a(new d(a70 + 32768 << 16 | 0x3).longValue());
            g125.a(PropertyType.INTEGER32);
            g125.a(new d(com.ews.msg.a.a(this.bu)).a());
            g125.a(true);
            g125.b(true);
            byteArrayOutputStream.write(g125.a(), 0, 16);
        }
        if (this.bv != null) {
            final e e51;
            (e51 = new e()).a(new d(34566));
            e51.a(StandardPropertySet.JOURNAL);
            e51.a(com.ews.msg.f.a);
            int a71;
            if ((a71 = com.ews.msg.h.a(list, e51)) == -1) {
                list.add(e51);
                a71 = list.size() - 1;
            }
            final d d23 = new d(a71 + 32768 << 16 | 0x40);
            final byte[] a72 = com.ews.msg.h.a(this.bv);
            final g g126;
            (g126 = new g()).a(d23.longValue());
            g126.a(PropertyType.TIME);
            g126.a(a72);
            g126.a(true);
            g126.b(true);
            byteArrayOutputStream.write(g126.a(), 0, 16);
        }
        if (this.bw != null) {
            final e e52;
            (e52 = new e()).a(new d(34568));
            e52.a(StandardPropertySet.JOURNAL);
            e52.a(com.ews.msg.f.a);
            int a73;
            if ((a73 = com.ews.msg.h.a(list, e52)) == -1) {
                list.add(e52);
                a73 = list.size() - 1;
            }
            final d d24 = new d(a73 + 32768 << 16 | 0x40);
            final byte[] a74 = com.ews.msg.h.a(this.bw);
            final g g127;
            (g127 = new g()).a(d24.longValue());
            g127.a(PropertyType.TIME);
            g127.a(a74);
            g127.a(true);
            g127.b(true);
            byteArrayOutputStream.write(g127.a(), 0, 16);
        }
        if (this.bx != null) {
            final e e53;
            (e53 = new e()).a(new d(34560));
            e53.a(StandardPropertySet.JOURNAL);
            e53.a(com.ews.msg.f.b);
            int a75;
            if ((a75 = com.ews.msg.h.a(list, e53)) == -1) {
                list.add(e53);
                a75 = list.size() - 1;
            }
            final d d25 = new d(a75 + 32768 << 16 | this.dn);
            final String format14 = String.format("%08X", d25.longValue());
            final byte[] array45 = this.ds.encode(this.bx).array();
            list2.add(new Stream("__substg1.0_" + format14, array45));
            final g g128;
            (g128 = new g()).a(d25.longValue());
            g128.a(PropertyType.STRING8);
            g128.b(array45.length + this.dq);
            g128.a(true);
            g128.b(true);
            byteArrayOutputStream.write(g128.a(), 0, 16);
        }
        if (this.by != null) {
            final e e54;
            (e54 = new e()).a(new d(34578));
            e54.a(StandardPropertySet.JOURNAL);
            e54.a(com.ews.msg.f.b);
            int a76;
            if ((a76 = com.ews.msg.h.a(list, e54)) == -1) {
                list.add(e54);
                a76 = list.size() - 1;
            }
            final d d26 = new d(a76 + 32768 << 16 | this.dn);
            final String format15 = String.format("%08X", d26.longValue());
            final byte[] array46 = this.ds.encode(this.by).array();
            list2.add(new Stream("__substg1.0_" + format15, array46));
            final g g129;
            (g129 = new g()).a(d26.longValue());
            g129.a(PropertyType.STRING8);
            g129.b(array46.length + this.dq);
            g129.a(true);
            g129.b(true);
            byteArrayOutputStream.write(g129.a(), 0, 16);
        }
        if (this.bz != null && this.bz.longValue() > 0L) {
            final e e55;
            (e55 = new e()).a(new d(34567));
            e55.a(StandardPropertySet.JOURNAL);
            e55.a(com.ews.msg.f.a);
            int a77;
            if ((a77 = com.ews.msg.h.a(list, e55)) == -1) {
                list.add(e55);
                a77 = list.size() - 1;
            }
            final g g130;
            (g130 = new g()).a(new d(a77 + 32768 << 16 | 0x3).longValue());
            g130.a(PropertyType.INTEGER32);
            g130.a(this.bz.a());
            g130.a(true);
            g130.b(true);
            byteArrayOutputStream.write(g130.a(), 0, 16);
        }
        if (this.bA != null) {
            final byte[] a78 = com.ews.msg.h.a(this.bA);
            final g g131;
            (g131 = new g()).a(977403968L);
            g131.a(PropertyType.TIME);
            g131.a(a78);
            g131.a(true);
            g131.b(false);
            byteArrayOutputStream.write(g131.a(), 0, 16);
        }
        if (this.bB.size() > 0) {
            final ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            for (int l = 0; l < this.bB.size(); ++l) {
                final byte[] array47;
                byteArrayOutputStream5.write(new d((array47 = this.ds.encode(this.bB.get(l) + "\u0000").array()).length).a(), 0, 4);
                list2.add(new Stream("__substg1.0_3A58" + this.dw + "-" + String.format("%08X", l), array47));
            }
            final byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
            list2.add(new Stream("__substg1.0_3A58" + this.dw, byteArray4));
            final g g132;
            (g132 = new g()).a(0x3A580000 | this.dp);
            g132.a(PropertyType.MULTIPLE_STRING8);
            g132.b(byteArray4.length);
            g132.a(true);
            g132.b(true);
            byteArrayOutputStream.write(g132.a(), 0, 16);
        }
        if (this.bC != null) {
            final byte[] array48 = this.ds.encode(this.bC).array();
            list2.add(new Stream("__substg1.0_3A30" + this.dm, array48));
            final g g133;
            (g133 = new g()).a(0x3A300000 | this.dn);
            g133.a(PropertyType.STRING8);
            g133.b(array48.length + this.dq);
            g133.a(true);
            g133.b(true);
            byteArrayOutputStream.write(g133.a(), 0, 16);
        }
        if (this.bD != null) {
            final byte[] array49 = this.ds.encode(this.bD).array();
            list2.add(new Stream("__substg1.0_3A2E" + this.dm, array49));
            final g g134;
            (g134 = new g()).a(0x3A2E0000 | this.dn);
            g134.a(PropertyType.STRING8);
            g134.b(array49.length + this.dq);
            g134.a(true);
            g134.b(true);
            byteArrayOutputStream.write(g134.a(), 0, 16);
        }
        if (this.bF != null) {
            final byte[] array50 = this.ds.encode(this.bF).array();
            list2.add(new Stream("__substg1.0_3A1B" + this.dm, array50));
            final g g135;
            (g135 = new g()).a(0x3A1B0000 | this.dn);
            g135.a(PropertyType.STRING8);
            g135.b(array50.length + this.dq);
            g135.a(true);
            g135.b(true);
            byteArrayOutputStream.write(g135.a(), 0, 16);
        }
        if (this.bG != null) {
            final byte[] array51 = this.ds.encode(this.bG).array();
            list2.add(new Stream("__substg1.0_3A24" + this.dm, array51));
            final g g136;
            (g136 = new g()).a(0x3A240000 | this.dn);
            g136.a(PropertyType.STRING8);
            g136.b(array51.length + this.dq);
            g136.a(true);
            g136.b(true);
            byteArrayOutputStream.write(g136.a(), 0, 16);
        }
        if (this.bH != null) {
            final byte[] array52 = this.ds.encode(this.bH).array();
            list2.add(new Stream("__substg1.0_3A51" + this.dm, array52));
            final g g137;
            (g137 = new g()).a(0x3A510000 | this.dn);
            g137.a(PropertyType.STRING8);
            g137.b(array52.length + this.dq);
            g137.a(true);
            g137.b(true);
            byteArrayOutputStream.write(g137.a(), 0, 16);
        }
        if (this.bI != null) {
            final byte[] array53 = this.ds.encode(this.bI).array();
            list2.add(new Stream("__substg1.0_3A02" + this.dm, array53));
            final g g138;
            (g138 = new g()).a(0x3A020000 | this.dn);
            g138.a(PropertyType.STRING8);
            g138.b(array53.length + this.dq);
            g138.a(true);
            g138.b(true);
            byteArrayOutputStream.write(g138.a(), 0, 16);
        }
        if (this.bJ != null) {
            final byte[] array54 = this.ds.encode(this.bJ).array();
            list2.add(new Stream("__substg1.0_3A1E" + this.dm, array54));
            final g g139;
            (g139 = new g()).a(0x3A1E0000 | this.dn);
            g139.a(PropertyType.STRING8);
            g139.b(array54.length + this.dq);
            g139.a(true);
            g139.b(true);
            byteArrayOutputStream.write(g139.a(), 0, 16);
        }
        if (this.bK != null) {
            final byte[] array55 = this.ds.encode(this.bK).array();
            list2.add(new Stream("__substg1.0_3A1C" + this.dm, array55));
            final g g140;
            (g140 = new g()).a(0x3A1C0000 | this.dn);
            g140.a(PropertyType.STRING8);
            g140.b(array55.length + this.dq);
            g140.a(true);
            g140.b(true);
            byteArrayOutputStream.write(g140.a(), 0, 16);
        }
        if (this.bL != null) {
            final byte[] array56 = this.ds.encode(this.bL).array();
            list2.add(new Stream("__substg1.0_3A57" + this.dm, array56));
            final g g141;
            (g141 = new g()).a(0x3A570000 | this.dn);
            g141.a(PropertyType.STRING8);
            g141.b(array56.length + this.dq);
            g141.a(true);
            g141.b(true);
            byteArrayOutputStream.write(g141.a(), 0, 16);
        }
        if (this.bM != null) {
            final byte[] array57 = this.ds.encode(this.bM).array();
            list2.add(new Stream("__substg1.0_3A16" + this.dm, array57));
            final g g142;
            (g142 = new g()).a(0x3A160000 | this.dn);
            g142.a(PropertyType.STRING8);
            g142.b(array57.length + this.dq);
            g142.a(true);
            g142.b(true);
            byteArrayOutputStream.write(g142.a(), 0, 16);
        }
        if (this.bN != null) {
            final byte[] array58 = this.ds.encode(this.bN).array();
            list2.add(new Stream("__substg1.0_3A49" + this.dm, array58));
            final g g143;
            (g143 = new g()).a(0x3A490000 | this.dn);
            g143.a(PropertyType.STRING8);
            g143.b(array58.length + this.dq);
            g143.a(true);
            g143.b(true);
            byteArrayOutputStream.write(g143.a(), 0, 16);
        }
        if (this.cv != null) {
            final e e56;
            (e56 = new e()).a(new d(32841));
            e56.a(StandardPropertySet.ADDRESS);
            e56.a(com.ews.msg.f.b);
            int a79;
            if ((a79 = com.ews.msg.h.a(list, e56)) == -1) {
                list.add(e56);
                a79 = list.size() - 1;
            }
            final d d27 = new d(a79 + 32768 << 16 | this.dn);
            final String format16 = String.format("%08X", d27.longValue());
            final byte[] array59 = this.ds.encode(this.cv).array();
            list2.add(new Stream("__substg1.0_" + format16, array59));
            final g g144;
            (g144 = new g()).a(d27.longValue());
            g144.a(PropertyType.STRING8);
            g144.b(array59.length + this.dq);
            g144.a(true);
            g144.b(true);
            byteArrayOutputStream.write(g144.a(), 0, 16);
            list2.add(new Stream("__substg1.0_3A26" + this.dm, array59));
            final g g145;
            (g145 = new g()).a(0x3A260000 | this.dn);
            g145.a(PropertyType.STRING8);
            g145.b(array59.length + this.dq);
            g145.a(true);
            g145.b(true);
            byteArrayOutputStream.write(g145.a(), 0, 16);
        }
        if (this.bO != null) {
            final byte[] array60 = this.ds.encode(this.bO).array();
            list2.add(new Stream("__substg1.0_3A4A" + this.dm, array60));
            final g g146;
            (g146 = new g()).a(0x3A4A0000 | this.dn);
            g146.a(PropertyType.STRING8);
            g146.b(array60.length + this.dq);
            g146.a(true);
            g146.b(true);
            byteArrayOutputStream.write(g146.a(), 0, 16);
        }
        if (this.bP != null) {
            final byte[] array61 = this.ds.encode(this.bP).array();
            list2.add(new Stream("__substg1.0_3A18" + this.dm, array61));
            final g g147;
            (g147 = new g()).a(0x3A180000 | this.dn);
            g147.a(PropertyType.STRING8);
            g147.b(array61.length + this.dq);
            g147.a(true);
            g147.b(true);
            byteArrayOutputStream.write(g147.a(), 0, 16);
        }
        if (this.bQ != null) {
            final byte[] array62 = this.ds.encode(this.bQ).array();
            list2.add(new Stream("__substg1.0_3001" + this.dm, array62));
            final g g148;
            (g148 = new g()).a(0x30010000 | this.dn);
            g148.a(PropertyType.STRING8);
            g148.b(array62.length + this.dq);
            g148.a(true);
            g148.b(true);
            byteArrayOutputStream.write(g148.a(), 0, 16);
        }
        if (this.bR != null) {
            final byte[] array63 = this.ds.encode(this.bR).array();
            list2.add(new Stream("__substg1.0_3A45" + this.dm, array63));
            final g g149;
            (g149 = new g()).a(0x3A450000 | this.dn);
            g149.a(PropertyType.STRING8);
            g149.b(array63.length + this.dq);
            g149.a(true);
            g149.b(true);
            byteArrayOutputStream.write(g149.a(), 0, 16);
        }
        if (this.bS != null) {
            final byte[] array64 = this.ds.encode(this.bS).array();
            list2.add(new Stream("__substg1.0_3A4C" + this.dm, array64));
            final g g150;
            (g150 = new g()).a(0x3A4C0000 | this.dn);
            g150.a(PropertyType.STRING8);
            g150.b(array64.length + this.dq);
            g150.a(true);
            g150.b(true);
            byteArrayOutputStream.write(g150.a(), 0, 16);
        }
        if (this.bT != null) {
            final byte[] array65 = this.ds.encode(this.bT).array();
            list2.add(new Stream("__substg1.0_3A05" + this.dm, array65));
            final g g151;
            (g151 = new g()).a(0x3A050000 | this.dn);
            g151.a(PropertyType.STRING8);
            g151.b(array65.length + this.dq);
            g151.a(true);
            g151.b(true);
            byteArrayOutputStream.write(g151.a(), 0, 16);
        }
        if (this.bU != null) {
            final byte[] array66 = this.ds.encode(this.bU).array();
            list2.add(new Stream("__substg1.0_3A06" + this.dm, array66));
            final g g152;
            (g152 = new g()).a(0x3A060000 | this.dn);
            g152.a(PropertyType.STRING8);
            g152.b(array66.length + this.dq);
            g152.a(true);
            g152.b(true);
            byteArrayOutputStream.write(g152.a(), 0, 16);
        }
        if (this.bV != null) {
            final byte[] array67 = this.ds.encode(this.bV).array();
            list2.add(new Stream("__substg1.0_3A07" + this.dm, array67));
            final g g153;
            (g153 = new g()).a(0x3A070000 | this.dn);
            g153.a(PropertyType.STRING8);
            g153.b(array67.length + this.dq);
            g153.a(true);
            g153.b(true);
            byteArrayOutputStream.write(g153.a(), 0, 16);
        }
        if (this.bW != null) {
            final byte[] array68 = this.ds.encode(this.bW).array();
            list2.add(new Stream("__substg1.0_3A43" + this.dm, array68));
            final g g154;
            (g154 = new g()).a(0x3A430000 | this.dn);
            g154.a(PropertyType.STRING8);
            g154.b(array68.length + this.dq);
            g154.a(true);
            g154.b(true);
            byteArrayOutputStream.write(g154.a(), 0, 16);
        }
        if (this.bX != null) {
            final byte[] array69 = this.ds.encode(this.bX).array();
            list2.add(new Stream("__substg1.0_3A2F" + this.dm, array69));
            final g g155;
            (g155 = new g()).a(0x3A2F0000 | this.dn);
            g155.a(PropertyType.STRING8);
            g155.b(array69.length + this.dq);
            g155.a(true);
            g155.b(true);
            byteArrayOutputStream.write(g155.a(), 0, 16);
        }
        if (this.bY != null) {
            final byte[] array70 = this.ds.encode(this.bY).array();
            list2.add(new Stream("__substg1.0_3A59" + this.dm, array70));
            final g g156;
            (g156 = new g()).a(0x3A590000 | this.dn);
            g156.a(PropertyType.STRING8);
            g156.b(array70.length + this.dq);
            g156.a(true);
            g156.b(true);
            byteArrayOutputStream.write(g156.a(), 0, 16);
        }
        if (this.bZ != null) {
            final byte[] array71 = this.ds.encode(this.bZ).array();
            list2.add(new Stream("__substg1.0_3A5A" + this.dm, array71));
            final g g157;
            (g157 = new g()).a(0x3A5A0000 | this.dn);
            g157.a(PropertyType.STRING8);
            g157.b(array71.length + this.dq);
            g157.a(true);
            g157.b(true);
            byteArrayOutputStream.write(g157.a(), 0, 16);
        }
        if (this.ca != null) {
            final byte[] array72 = this.ds.encode(this.ca).array();
            list2.add(new Stream("__substg1.0_3A5B" + this.dm, array72));
            final g g158;
            (g158 = new g()).a(0x3A5B0000 | this.dn);
            g158.a(PropertyType.STRING8);
            g158.b(array72.length + this.dq);
            g158.a(true);
            g158.b(true);
            byteArrayOutputStream.write(g158.a(), 0, 16);
        }
        if (this.cb != null) {
            final byte[] array73 = this.ds.encode(this.cb).array();
            list2.add(new Stream("__substg1.0_3A5E" + this.dm, array73));
            final g g159;
            (g159 = new g()).a(0x3A5E0000 | this.dn);
            g159.a(PropertyType.STRING8);
            g159.b(array73.length + this.dq);
            g159.a(true);
            g159.b(true);
            byteArrayOutputStream.write(g159.a(), 0, 16);
        }
        if (this.cc != null) {
            final byte[] array74 = this.ds.encode(this.cc).array();
            list2.add(new Stream("__substg1.0_3A5C" + this.dm, array74));
            final g g160;
            (g160 = new g()).a(0x3A5C0000 | this.dn);
            g160.a(PropertyType.STRING8);
            g160.b(array74.length + this.dq);
            g160.a(true);
            g160.b(true);
            byteArrayOutputStream.write(g160.a(), 0, 16);
        }
        if (this.cd != null) {
            final byte[] array75 = this.ds.encode(this.cd).array();
            list2.add(new Stream("__substg1.0_3A5D" + this.dm, array75));
            final g g161;
            (g161 = new g()).a(0x3A5D0000 | this.dn);
            g161.a(PropertyType.STRING8);
            g161.b(array75.length + this.dq);
            g161.a(true);
            g161.b(true);
            byteArrayOutputStream.write(g161.a(), 0, 16);
        }
        if (this.ce != null) {
            final byte[] array76 = this.ds.encode(this.ce).array();
            list2.add(new Stream("__substg1.0_3A25" + this.dm, array76));
            final g g162;
            (g162 = new g()).a(0x3A250000 | this.dn);
            g162.a(PropertyType.STRING8);
            g162.b(array76.length + this.dq);
            g162.a(true);
            g162.b(true);
            byteArrayOutputStream.write(g162.a(), 0, 16);
        }
        if (this.cf != null) {
            final byte[] array77 = this.ds.encode(this.cf).array();
            list2.add(new Stream("__substg1.0_3A09" + this.dm, array77));
            final g g163;
            (g163 = new g()).a(0x3A090000 | this.dn);
            g163.a(PropertyType.STRING8);
            g163.b(array77.length + this.dq);
            g163.a(true);
            g163.b(true);
            byteArrayOutputStream.write(g163.a(), 0, 16);
        }
        if (this.cg != null) {
            final byte[] array78 = this.ds.encode(this.cg).array();
            list2.add(new Stream("__substg1.0_3A0A" + this.dm, array78));
            final g g164;
            (g164 = new g()).a(0x3A0A0000 | this.dn);
            g164.a(PropertyType.STRING8);
            g164.b(array78.length + this.dq);
            g164.a(true);
            g164.b(true);
            byteArrayOutputStream.write(g164.a(), 0, 16);
        }
        if (this.ch != null) {
            final byte[] array79 = this.ds.encode(this.ch).array();
            list2.add(new Stream("__substg1.0_3A2D" + this.dm, array79));
            final g g165;
            (g165 = new g()).a(0x3A2D0000 | this.dn);
            g165.a(PropertyType.STRING8);
            g165.b(array79.length + this.dq);
            g165.a(true);
            g165.b(true);
            byteArrayOutputStream.write(g165.a(), 0, 16);
        }
        if (this.cw != null) {
            final e e57;
            (e57 = new e()).a(new d(32838));
            e57.a(StandardPropertySet.ADDRESS);
            e57.a(com.ews.msg.f.b);
            int a80;
            if ((a80 = com.ews.msg.h.a(list, e57)) == -1) {
                list.add(e57);
                a80 = list.size() - 1;
            }
            final d d28 = new d(a80 + 32768 << 16 | this.dn);
            final String format17 = String.format("%08X", d28.longValue());
            final byte[] array80 = this.ds.encode(this.cw).array();
            list2.add(new Stream("__substg1.0_" + format17, array80));
            final g g166;
            (g166 = new g()).a(d28.longValue());
            g166.a(PropertyType.STRING8);
            g166.b(array80.length + this.dq);
            g166.a(true);
            g166.b(true);
            byteArrayOutputStream.write(g166.a(), 0, 16);
            list2.add(new Stream("__substg1.0_3A27" + this.dm, array80));
            final g g167;
            (g167 = new g()).a(0x3A270000 | this.dn);
            g167.a(PropertyType.STRING8);
            g167.b(array80.length + this.dq);
            g167.a(true);
            g167.b(true);
            byteArrayOutputStream.write(g167.a(), 0, 16);
        }
        if (this.ci != null) {
            final byte[] array81 = this.ds.encode(this.ci).array();
            list2.add(new Stream("__substg1.0_3A4E" + this.dm, array81));
            final g g168;
            (g168 = new g()).a(0x3A4E0000 | this.dn);
            g168.a(PropertyType.STRING8);
            g168.b(array81.length + this.dq);
            g168.a(true);
            g168.b(true);
            byteArrayOutputStream.write(g168.a(), 0, 16);
        }
        if (this.cj != null) {
            final byte[] array82 = this.ds.encode(this.cj).array();
            list2.add(new Stream("__substg1.0_3A44" + this.dm, array82));
            final g g169;
            (g169 = new g()).a(0x3A440000 | this.dn);
            g169.a(PropertyType.STRING8);
            g169.b(array82.length + this.dq);
            g169.a(true);
            g169.b(true);
            byteArrayOutputStream.write(g169.a(), 0, 16);
        }
        if (this.ck != null) {
            final byte[] array83 = this.ds.encode(this.ck).array();
            list2.add(new Stream("__substg1.0_3A4F" + this.dm, array83));
            final g g170;
            (g170 = new g()).a(0x3A4F0000 | this.dn);
            g170.a(PropertyType.STRING8);
            g170.b(array83.length + this.dq);
            g170.a(true);
            g170.b(true);
            byteArrayOutputStream.write(g170.a(), 0, 16);
        }
        if (this.cl != null) {
            final byte[] array84 = this.ds.encode(this.cl).array();
            list2.add(new Stream("__substg1.0_3A19" + this.dm, array84));
            final g g171;
            (g171 = new g()).a(0x3A190000 | this.dn);
            g171.a(PropertyType.STRING8);
            g171.b(array84.length + this.dq);
            g171.a(true);
            g171.b(true);
            byteArrayOutputStream.write(g171.a(), 0, 16);
        }
        if (this.bE != null) {
            final byte[] array85 = this.ds.encode(this.bE).array();
            list2.add(new Stream("__substg1.0_3A08" + this.dm, array85));
            final g g172;
            (g172 = new g()).a(0x3A080000 | this.dn);
            g172.a(PropertyType.STRING8);
            g172.b(array85.length + this.dq);
            g172.a(true);
            g172.b(true);
            byteArrayOutputStream.write(g172.a(), 0, 16);
        }
        if (this.cm != null) {
            final byte[] array86 = this.ds.encode(this.cm).array();
            list2.add(new Stream("__substg1.0_3A5F" + this.dm, array86));
            final g g173;
            (g173 = new g()).a(0x3A5F0000 | this.dn);
            g173.a(PropertyType.STRING8);
            g173.b(array86.length + this.dq);
            g173.a(true);
            g173.b(true);
            byteArrayOutputStream.write(g173.a(), 0, 16);
        }
        if (this.cn != null) {
            final byte[] array87 = this.ds.encode(this.cn).array();
            list2.add(new Stream("__substg1.0_3A60" + this.dm, array87));
            final g g174;
            (g174 = new g()).a(0x3A600000 | this.dn);
            g174.a(PropertyType.STRING8);
            g174.b(array87.length + this.dq);
            g174.a(true);
            g174.b(true);
            byteArrayOutputStream.write(g174.a(), 0, 16);
        }
        if (this.co != null) {
            final byte[] array88 = this.ds.encode(this.co).array();
            list2.add(new Stream("__substg1.0_3A61" + this.dm, array88));
            final g g175;
            (g175 = new g()).a(0x3A610000 | this.dn);
            g175.a(PropertyType.STRING8);
            g175.b(array88.length + this.dq);
            g175.a(true);
            g175.b(true);
            byteArrayOutputStream.write(g175.a(), 0, 16);
        }
        if (this.cp != null) {
            final byte[] array89 = this.ds.encode(this.cp).array();
            list2.add(new Stream("__substg1.0_3A62" + this.dm, array89));
            final g g176;
            (g176 = new g()).a(0x3A620000 | this.dn);
            g176.a(PropertyType.STRING8);
            g176.b(array89.length + this.dq);
            g176.a(true);
            g176.b(true);
            byteArrayOutputStream.write(g176.a(), 0, 16);
        }
        if (this.cq != null) {
            final byte[] array90 = this.ds.encode(this.cq).array();
            list2.add(new Stream("__substg1.0_3A63" + this.dm, array90));
            final g g177;
            (g177 = new g()).a(0x3A630000 | this.dn);
            g177.a(PropertyType.STRING8);
            g177.b(array90.length + this.dq);
            g177.a(true);
            g177.b(true);
            byteArrayOutputStream.write(g177.a(), 0, 16);
        }
        if (this.cr != null) {
            final byte[] array91 = this.ds.encode(this.cr).array();
            list2.add(new Stream("__substg1.0_3A1F" + this.dm, array91));
            final g g178;
            (g178 = new g()).a(0x3A1F0000 | this.dn);
            g178.a(PropertyType.STRING8);
            g178.b(array91.length + this.dq);
            g178.a(true);
            g178.b(true);
            byteArrayOutputStream.write(g178.a(), 0, 16);
        }
        if (this.cs != null) {
            final byte[] array92 = this.ds.encode(this.cs).array();
            list2.add(new Stream("__substg1.0_3A21" + this.dm, array92));
            final g g179;
            (g179 = new g()).a(0x3A210000 | this.dn);
            g179.a(PropertyType.STRING8);
            g179.b(array92.length + this.dq);
            g179.a(true);
            g179.b(true);
            byteArrayOutputStream.write(g179.a(), 0, 16);
        }
        if (this.ct != null) {
            final byte[] array93 = this.ds.encode(this.ct).array();
            list2.add(new Stream("__substg1.0_3A50" + this.dm, array93));
            final g g180;
            (g180 = new g()).a(0x3A500000 | this.dn);
            g180.a(PropertyType.STRING8);
            g180.b(array93.length + this.dq);
            g180.a(true);
            g180.b(true);
            byteArrayOutputStream.write(g180.a(), 0, 16);
        }
        if (this.cu != null) {
            final byte[] array94 = this.ds.encode(this.cu).array();
            list2.add(new Stream("__substg1.0_3A15" + this.dm, array94));
            final g g181;
            (g181 = new g()).a(0x3A150000 | this.dn);
            g181.a(PropertyType.STRING8);
            g181.b(array94.length + this.dq);
            g181.a(true);
            g181.b(true);
            byteArrayOutputStream.write(g181.a(), 0, 16);
        }
        if (this.cx != null) {
            final e e58;
            (e58 = new e()).a(new d(32840));
            e58.a(StandardPropertySet.ADDRESS);
            e58.a(com.ews.msg.f.b);
            int a81;
            if ((a81 = com.ews.msg.h.a(list, e58)) == -1) {
                list.add(e58);
                a81 = list.size() - 1;
            }
            final d d29 = new d(a81 + 32768 << 16 | this.dn);
            final String format18 = String.format("%08X", d29.longValue());
            final byte[] array95 = this.ds.encode(this.cx).array();
            list2.add(new Stream("__substg1.0_" + format18, array95));
            final g g182;
            (g182 = new g()).a(d29.longValue());
            g182.a(PropertyType.STRING8);
            g182.b(array95.length + this.dq);
            g182.a(true);
            g182.b(true);
            byteArrayOutputStream.write(g182.a(), 0, 16);
            list2.add(new Stream("__substg1.0_3A2A" + this.dm, array95));
            final g g183;
            (g183 = new g()).a(0x3A2A0000 | this.dn);
            g183.a(PropertyType.STRING8);
            g183.b(array95.length + this.dq);
            g183.a(true);
            g183.b(true);
            byteArrayOutputStream.write(g183.a(), 0, 16);
        }
        if (this.cy != null) {
            final byte[] array96 = this.ds.encode(this.cy).array();
            list2.add(new Stream("__substg1.0_3A2B" + this.dm, array96));
            final g g184;
            (g184 = new g()).a(0x3A2B0000 | this.dn);
            g184.a(PropertyType.STRING8);
            g184.b(array96.length + this.dq);
            g184.a(true);
            g184.b(true);
            byteArrayOutputStream.write(g184.a(), 0, 16);
        }
        if (this.cz != null) {
            final e e59;
            (e59 = new e()).a(new d(32839));
            e59.a(StandardPropertySet.ADDRESS);
            e59.a(com.ews.msg.f.b);
            int a82;
            if ((a82 = com.ews.msg.h.a(list, e59)) == -1) {
                list.add(e59);
                a82 = list.size() - 1;
            }
            final d d30 = new d(a82 + 32768 << 16 | this.dn);
            final String format19 = String.format("%08X", d30.longValue());
            final byte[] array97 = this.ds.encode(this.cz).array();
            list2.add(new Stream("__substg1.0_" + format19, array97));
            final g g185;
            (g185 = new g()).a(d30.longValue());
            g185.a(PropertyType.STRING8);
            g185.b(array97.length + this.dq);
            g185.a(true);
            g185.b(true);
            byteArrayOutputStream.write(g185.a(), 0, 16);
            list2.add(new Stream("__substg1.0_3A28" + this.dm, array97));
            final g g186;
            (g186 = new g()).a(0x3A280000 | this.dn);
            g186.a(PropertyType.STRING8);
            g186.b(array97.length + this.dq);
            g186.a(true);
            g186.b(true);
            byteArrayOutputStream.write(g186.a(), 0, 16);
        }
        if (this.cA != null) {
            final e e60;
            (e60 = new e()).a(new d(32837));
            e60.a(StandardPropertySet.ADDRESS);
            e60.a(com.ews.msg.f.b);
            int a83;
            if ((a83 = com.ews.msg.h.a(list, e60)) == -1) {
                list.add(e60);
                a83 = list.size() - 1;
            }
            final d d31 = new d(a83 + 32768 << 16 | this.dn);
            final String format20 = String.format("%08X", d31.longValue());
            final byte[] array98 = this.ds.encode(this.cA).array();
            list2.add(new Stream("__substg1.0_" + format20, array98));
            final g g187;
            (g187 = new g()).a(d31.longValue());
            g187.a(PropertyType.STRING8);
            g187.b(array98.length + this.dq);
            g187.a(true);
            g187.b(true);
            byteArrayOutputStream.write(g187.a(), 0, 16);
            list2.add(new Stream("__substg1.0_3A29" + this.dm, array98));
            final g g188;
            (g188 = new g()).a(0x3A290000 | this.dn);
            g188.a(PropertyType.STRING8);
            g188.b(array98.length + this.dq);
            g188.a(true);
            g188.b(true);
            byteArrayOutputStream.write(g188.a(), 0, 16);
        }
        if (this.cB != null) {
            final byte[] array99 = this.ds.encode(this.cB).array();
            list2.add(new Stream("__substg1.0_3A23" + this.dm, array99));
            final g g189;
            (g189 = new g()).a(0x3A230000 | this.dn);
            g189.a(PropertyType.STRING8);
            g189.b(array99.length + this.dq);
            g189.a(true);
            g189.b(true);
            byteArrayOutputStream.write(g189.a(), 0, 16);
        }
        if (this.cC != null) {
            final byte[] array100 = this.ds.encode(this.cC).array();
            list2.add(new Stream("__substg1.0_3A1A" + this.dm, array100));
            final g g190;
            (g190 = new g()).a(0x3A1A0000 | this.dn);
            g190.a(PropertyType.STRING8);
            g190.b(array100.length + this.dq);
            g190.a(true);
            g190.b(true);
            byteArrayOutputStream.write(g190.a(), 0, 16);
        }
        if (this.cD != null) {
            final byte[] array101 = this.ds.encode(this.cD).array();
            list2.add(new Stream("__substg1.0_3A46" + this.dm, array101));
            final g g191;
            (g191 = new g()).a(0x3A460000 | this.dn);
            g191.a(PropertyType.STRING8);
            g191.b(array101.length + this.dq);
            g191.a(true);
            g191.b(true);
            byteArrayOutputStream.write(g191.a(), 0, 16);
        }
        if (this.cE != null) {
            final byte[] array102 = this.ds.encode(this.cE).array();
            list2.add(new Stream("__substg1.0_3A1D" + this.dm, array102));
            final g g192;
            (g192 = new g()).a(0x3A1D0000 | this.dn);
            g192.a(PropertyType.STRING8);
            g192.b(array102.length + this.dq);
            g192.a(true);
            g192.b(true);
            byteArrayOutputStream.write(g192.a(), 0, 16);
        }
        if (this.cF != null) {
            final byte[] array103 = this.ds.encode(this.cF).array();
            list2.add(new Stream("__substg1.0_3A48" + this.dm, array103));
            final g g193;
            (g193 = new g()).a(0x3A480000 | this.dn);
            g193.a(PropertyType.STRING8);
            g193.b(array103.length + this.dq);
            g193.a(true);
            g193.b(true);
            byteArrayOutputStream.write(g193.a(), 0, 16);
        }
        if (this.cG != null) {
            final byte[] array104 = this.ds.encode(this.cG).array();
            list2.add(new Stream("__substg1.0_3A11" + this.dm, array104));
            final g g194;
            (g194 = new g()).a(0x3A110000 | this.dn);
            g194.a(PropertyType.STRING8);
            g194.b(array104.length + this.dq);
            g194.a(true);
            g194.b(true);
            byteArrayOutputStream.write(g194.a(), 0, 16);
        }
        if (this.cH != null) {
            final byte[] array105 = this.ds.encode(this.cH).array();
            list2.add(new Stream("__substg1.0_3A2C" + this.dm, array105));
            final g g195;
            (g195 = new g()).a(0x3A2C0000 | this.dn);
            g195.a(PropertyType.STRING8);
            g195.b(array105.length + this.dq);
            g195.a(true);
            g195.b(true);
            byteArrayOutputStream.write(g195.a(), 0, 16);
        }
        if (this.cI != null) {
            final byte[] array106 = this.ds.encode(this.cI).array();
            list2.add(new Stream("__substg1.0_3A17" + this.dm, array106));
            final g g196;
            (g196 = new g()).a(0x3A170000 | this.dn);
            g196.a(PropertyType.STRING8);
            g196.b(array106.length + this.dq);
            g196.a(true);
            g196.b(true);
            byteArrayOutputStream.write(g196.a(), 0, 16);
        }
        if (this.cJ != null) {
            final byte[] array107 = this.ds.encode(this.cJ).array();
            list2.add(new Stream("__substg1.0_3A4B" + this.dm, array107));
            final g g197;
            (g197 = new g()).a(0x3A4B0000 | this.dn);
            g197.a(PropertyType.STRING8);
            g197.b(array107.length + this.dq);
            g197.a(true);
            g197.b(true);
            byteArrayOutputStream.write(g197.a(), 0, 16);
        }
        if (this.cK != null) {
            final byte[] a84 = com.ews.msg.h.a(this.cK);
            final g g198;
            (g198 = new g()).a(977338432L);
            g198.a(PropertyType.TIME);
            g198.a(a84);
            g198.a(true);
            g198.b(false);
            byteArrayOutputStream.write(g198.a(), 0, 16);
        }
        if (this.cL != SelectedMailingAddress.NONE) {
            final e e61;
            (e61 = new e()).a(new d(32802));
            e61.a(StandardPropertySet.ADDRESS);
            e61.a(com.ews.msg.f.a);
            int a85;
            if ((a85 = com.ews.msg.h.a(list, e61)) == -1) {
                list.add(e61);
                a85 = list.size() - 1;
            }
            final g g199;
            (g199 = new g()).a(a85 + 32768 << 16 | 0x3);
            g199.a(PropertyType.INTEGER32);
            g199.a(new d(com.ews.msg.a.a(this.cL)).a());
            g199.a(true);
            g199.b(true);
            byteArrayOutputStream.write(g199.a(), 0, 16);
        }
        if (this.cM) {
            final e e62;
            (e62 = new e()).a(new d(32789));
            e62.a(StandardPropertySet.ADDRESS);
            e62.a(com.ews.msg.f.a);
            int a86;
            if ((a86 = com.ews.msg.h.a(list, e62)) == -1) {
                list.add(e62);
                a86 = list.size() - 1;
            }
            final g g200;
            (g200 = new g()).a(a86 + 32768 << 16 | 0xB);
            g200.a(PropertyType.BOOLEAN);
            g200.a(new c(1).a());
            g200.a(true);
            g200.b(true);
            byteArrayOutputStream.write(g200.a(), 0, 16);
        }
        if (this.cN != null) {
            final e e63;
            (e63 = new e()).a(new d(32773));
            e63.a(StandardPropertySet.ADDRESS);
            e63.a(com.ews.msg.f.b);
            int a87;
            if ((a87 = com.ews.msg.h.a(list, e63)) == -1) {
                list.add(e63);
                a87 = list.size() - 1;
            }
            final d d32 = new d(a87 + 32768 << 16 | this.dn);
            final String format21 = String.format("%08X", d32.longValue());
            final byte[] array108 = this.ds.encode(this.cN).array();
            list2.add(new Stream("__substg1.0_" + format21, array108));
            final g g201;
            (g201 = new g()).a(d32.longValue());
            g201.a(PropertyType.STRING8);
            g201.b(array108.length + this.dq);
            g201.a(true);
            g201.b(true);
            byteArrayOutputStream.write(g201.a(), 0, 16);
        }
        if (this.cO != null) {
            final e e64;
            (e64 = new e()).a(new d(32866));
            e64.a(StandardPropertySet.ADDRESS);
            e64.a(com.ews.msg.f.b);
            int a88;
            if ((a88 = com.ews.msg.h.a(list, e64)) == -1) {
                list.add(e64);
                a88 = list.size() - 1;
            }
            final d d33 = new d(a88 + 32768 << 16 | this.dn);
            final String format22 = String.format("%08X", d33.longValue());
            final byte[] array109 = this.ds.encode(this.cO).array();
            list2.add(new Stream("__substg1.0_" + format22, array109));
            final g g202;
            (g202 = new g()).a(d33.longValue());
            g202.a(PropertyType.STRING8);
            g202.b(array109.length + this.dq);
            g202.a(true);
            g202.b(true);
            byteArrayOutputStream.write(g202.a(), 0, 16);
        }
        if (this.cP != null) {
            final e e65;
            (e65 = new e()).a(new d(32984));
            e65.a(StandardPropertySet.ADDRESS);
            e65.a(com.ews.msg.f.b);
            int a89;
            if ((a89 = com.ews.msg.h.a(list, e65)) == -1) {
                list.add(e65);
                a89 = list.size() - 1;
            }
            final d d34 = new d(a89 + 32768 << 16 | this.dn);
            final String format23 = String.format("%08X", d34.longValue());
            final byte[] array110 = this.ds.encode(this.cP).array();
            list2.add(new Stream("__substg1.0_" + format23, array110));
            final g g203;
            (g203 = new g()).a(d34.longValue());
            g203.a(PropertyType.STRING8);
            g203.b(array110.length + this.dq);
            g203.a(true);
            g203.b(true);
            byteArrayOutputStream.write(g203.a(), 0, 16);
        }
        if (this.cQ != null) {
            final e e66;
            (e66 = new e()).a(new d(32795));
            e66.a(StandardPropertySet.ADDRESS);
            e66.a(com.ews.msg.f.b);
            int a90;
            if ((a90 = com.ews.msg.h.a(list, e66)) == -1) {
                list.add(e66);
                a90 = list.size() - 1;
            }
            final d d35 = new d(a90 + 32768 << 16 | this.dn);
            final String format24 = String.format("%08X", d35.longValue());
            final byte[] array111 = this.ds.encode(this.cQ).array();
            list2.add(new Stream("__substg1.0_" + format24, array111));
            final g g204;
            (g204 = new g()).a(d35.longValue());
            g204.a(PropertyType.STRING8);
            g204.b(array111.length + this.dq);
            g204.a(true);
            g204.b(true);
            byteArrayOutputStream.write(g204.a(), 0, 16);
        }
        if (this.cR != null) {
            final e e67;
            (e67 = new e()).a(new d(32794));
            e67.a(StandardPropertySet.ADDRESS);
            e67.a(com.ews.msg.f.b);
            int a91;
            if ((a91 = com.ews.msg.h.a(list, e67)) == -1) {
                list.add(e67);
                a91 = list.size() - 1;
            }
            final d d36 = new d(a91 + 32768 << 16 | this.dn);
            final String format25 = String.format("%08X", d36.longValue());
            final byte[] array112 = this.ds.encode(this.cR).array();
            list2.add(new Stream("__substg1.0_" + format25, array112));
            final g g205;
            (g205 = new g()).a(d36.longValue());
            g205.a(PropertyType.STRING8);
            g205.b(array112.length + this.dq);
            g205.a(true);
            g205.b(true);
            byteArrayOutputStream.write(g205.a(), 0, 16);
        }
        if (this.cS != null) {
            final e e68;
            (e68 = new e()).a(new d(32796));
            e68.a(StandardPropertySet.ADDRESS);
            e68.a(com.ews.msg.f.b);
            int a92;
            if ((a92 = com.ews.msg.h.a(list, e68)) == -1) {
                list.add(e68);
                a92 = list.size() - 1;
            }
            final d d37 = new d(a92 + 32768 << 16 | this.dn);
            final String format26 = String.format("%08X", d37.longValue());
            final byte[] array113 = this.ds.encode(this.cS).array();
            list2.add(new Stream("__substg1.0_" + format26, array113));
            final g g206;
            (g206 = new g()).a(d37.longValue());
            g206.a(PropertyType.STRING8);
            g206.b(array113.length + this.dq);
            g206.a(true);
            g206.b(true);
            byteArrayOutputStream.write(g206.a(), 0, 16);
        }
        if (this.cT != null) {
            final e e69;
            (e69 = new e()).a(new d(32899));
            e69.a(StandardPropertySet.ADDRESS);
            e69.a(com.ews.msg.f.b);
            int a93;
            if ((a93 = com.ews.msg.h.a(list, e69)) == -1) {
                list.add(e69);
                a93 = list.size() - 1;
            }
            final d d38 = new d(a93 + 32768 << 16 | this.dn);
            final String format27 = String.format("%08X", d38.longValue());
            final byte[] array114 = this.ds.encode(this.cT).array();
            list2.add(new Stream("__substg1.0_" + format27, array114));
            final g g207;
            (g207 = new g()).a(d38.longValue());
            g207.a(PropertyType.STRING8);
            g207.b(array114.length + this.dq);
            g207.a(true);
            g207.b(true);
            byteArrayOutputStream.write(g207.a(), 0, 16);
        }
        if (this.cU != null) {
            final e e70;
            (e70 = new e()).a(new d(32915));
            e70.a(StandardPropertySet.ADDRESS);
            e70.a(com.ews.msg.f.b);
            int a94;
            if ((a94 = com.ews.msg.h.a(list, e70)) == -1) {
                list.add(e70);
                a94 = list.size() - 1;
            }
            final d d39 = new d(a94 + 32768 << 16 | this.dn);
            final String format28 = String.format("%08X", d39.longValue());
            final byte[] array115 = this.ds.encode(this.cU).array();
            list2.add(new Stream("__substg1.0_" + format28, array115));
            final g g208;
            (g208 = new g()).a(d39.longValue());
            g208.a(PropertyType.STRING8);
            g208.b(array115.length + this.dq);
            g208.a(true);
            g208.b(true);
            byteArrayOutputStream.write(g208.a(), 0, 16);
        }
        if (this.cV != null) {
            final e e71;
            (e71 = new e()).a(new d(32931));
            e71.a(StandardPropertySet.ADDRESS);
            e71.a(com.ews.msg.f.b);
            int a95;
            if ((a95 = com.ews.msg.h.a(list, e71)) == -1) {
                list.add(e71);
                a95 = list.size() - 1;
            }
            final d d40 = new d(a95 + 32768 << 16 | this.dn);
            final String format29 = String.format("%08X", d40.longValue());
            final byte[] array116 = this.ds.encode(this.cV).array();
            list2.add(new Stream("__substg1.0_" + format29, array116));
            final g g209;
            (g209 = new g()).a(d40.longValue());
            g209.a(PropertyType.STRING8);
            g209.b(array116.length + this.dq);
            g209.a(true);
            g209.b(true);
            byteArrayOutputStream.write(g209.a(), 0, 16);
        }
        if (this.cW != null) {
            final e e72;
            (e72 = new e()).a(new d(32900));
            e72.a(StandardPropertySet.ADDRESS);
            e72.a(com.ews.msg.f.b);
            int a96;
            if ((a96 = com.ews.msg.h.a(list, e72)) == -1) {
                list.add(e72);
                a96 = list.size() - 1;
            }
            final d d41 = new d(a96 + 32768 << 16 | this.dn);
            final String format30 = String.format("%08X", d41.longValue());
            final byte[] array117 = this.ds.encode(this.cW).array();
            list2.add(new Stream("__substg1.0_" + format30, array117));
            final g g210;
            (g210 = new g()).a(d41.longValue());
            g210.a(PropertyType.STRING8);
            g210.b(array117.length + this.dq);
            g210.a(true);
            g210.b(true);
            byteArrayOutputStream.write(g210.a(), 0, 16);
        }
        if (this.cX != null) {
            final e e73;
            (e73 = new e()).a(new d(32916));
            e73.a(StandardPropertySet.ADDRESS);
            e73.a(com.ews.msg.f.b);
            int a97;
            if ((a97 = com.ews.msg.h.a(list, e73)) == -1) {
                list.add(e73);
                a97 = list.size() - 1;
            }
            final d d42 = new d(a97 + 32768 << 16 | this.dn);
            final String format31 = String.format("%08X", d42.longValue());
            final byte[] array118 = this.ds.encode(this.cX).array();
            list2.add(new Stream("__substg1.0_" + format31, array118));
            final g g211;
            (g211 = new g()).a(d42.longValue());
            g211.a(PropertyType.STRING8);
            g211.b(array118.length + this.dq);
            g211.a(true);
            g211.b(true);
            byteArrayOutputStream.write(g211.a(), 0, 16);
        }
        if (this.cY != null) {
            final e e74;
            (e74 = new e()).a(new d(32932));
            e74.a(StandardPropertySet.ADDRESS);
            e74.a(com.ews.msg.f.b);
            int a98;
            if ((a98 = com.ews.msg.h.a(list, e74)) == -1) {
                list.add(e74);
                a98 = list.size() - 1;
            }
            final d d43 = new d(a98 + 32768 << 16 | this.dn);
            final String format32 = String.format("%08X", d43.longValue());
            final byte[] array119 = this.ds.encode(this.cY).array();
            list2.add(new Stream("__substg1.0_" + format32, array119));
            final g g212;
            (g212 = new g()).a(d43.longValue());
            g212.a(PropertyType.STRING8);
            g212.b(array119.length + this.dq);
            g212.a(true);
            g212.b(true);
            byteArrayOutputStream.write(g212.a(), 0, 16);
        }
        if (this.cZ != null) {
            final e e75;
            (e75 = new e()).a(new d(32896));
            e75.a(StandardPropertySet.ADDRESS);
            e75.a(com.ews.msg.f.b);
            int a99;
            if ((a99 = com.ews.msg.h.a(list, e75)) == -1) {
                list.add(e75);
                a99 = list.size() - 1;
            }
            final d d44 = new d(a99 + 32768 << 16 | this.dn);
            final String format33 = String.format("%08X", d44.longValue());
            final byte[] array120 = this.ds.encode(this.cZ).array();
            list2.add(new Stream("__substg1.0_" + format33, array120));
            final g g213;
            (g213 = new g()).a(d44.longValue());
            g213.a(PropertyType.STRING8);
            g213.b(array120.length + this.dq);
            g213.a(true);
            g213.b(true);
            byteArrayOutputStream.write(g213.a(), 0, 16);
        }
        if (this.da != null) {
            final e e76;
            (e76 = new e()).a(new d(32912));
            e76.a(StandardPropertySet.ADDRESS);
            e76.a(com.ews.msg.f.b);
            int a100;
            if ((a100 = com.ews.msg.h.a(list, e76)) == -1) {
                list.add(e76);
                a100 = list.size() - 1;
            }
            final d d45 = new d(a100 + 32768 << 16 | this.dn);
            final String format34 = String.format("%08X", d45.longValue());
            final byte[] array121 = this.ds.encode(this.da).array();
            list2.add(new Stream("__substg1.0_" + format34, array121));
            final g g214;
            (g214 = new g()).a(d45.longValue());
            g214.a(PropertyType.STRING8);
            g214.b(array121.length + this.dq);
            g214.a(true);
            g214.b(true);
            byteArrayOutputStream.write(g214.a(), 0, 16);
        }
        if (this.db != null) {
            final e e77;
            (e77 = new e()).a(new d(32928));
            e77.a(StandardPropertySet.ADDRESS);
            e77.a(com.ews.msg.f.b);
            int a101;
            if ((a101 = com.ews.msg.h.a(list, e77)) == -1) {
                list.add(e77);
                a101 = list.size() - 1;
            }
            final d d46 = new d(a101 + 32768 << 16 | this.dn);
            final String format35 = String.format("%08X", d46.longValue());
            final byte[] array122 = this.ds.encode(this.db).array();
            list2.add(new Stream("__substg1.0_" + format35, array122));
            final g g215;
            (g215 = new g()).a(d46.longValue());
            g215.a(PropertyType.STRING8);
            g215.b(array122.length + this.dq);
            g215.a(true);
            g215.b(true);
            byteArrayOutputStream.write(g215.a(), 0, 16);
        }
        if (this.dc != null) {
            final e e78;
            (e78 = new e()).a(new d(32898));
            e78.a(StandardPropertySet.ADDRESS);
            e78.a(com.ews.msg.f.b);
            int a102;
            if ((a102 = com.ews.msg.h.a(list, e78)) == -1) {
                list.add(e78);
                a102 = list.size() - 1;
            }
            final d d47 = new d(a102 + 32768 << 16 | this.dn);
            final String format36 = String.format("%08X", d47.longValue());
            final byte[] array123 = this.ds.encode(this.dc).array();
            list2.add(new Stream("__substg1.0_" + format36, array123));
            final g g216;
            (g216 = new g()).a(d47.longValue());
            g216.a(PropertyType.STRING8);
            g216.b(array123.length + this.dq);
            g216.a(true);
            g216.b(true);
            byteArrayOutputStream.write(g216.a(), 0, 16);
        }
        if (this.dd != null) {
            final e e79;
            (e79 = new e()).a(new d(32914));
            e79.a(StandardPropertySet.ADDRESS);
            e79.a(com.ews.msg.f.b);
            int a103;
            if ((a103 = com.ews.msg.h.a(list, e79)) == -1) {
                list.add(e79);
                a103 = list.size() - 1;
            }
            final d d48 = new d(a103 + 32768 << 16 | this.dn);
            final String format37 = String.format("%08X", d48.longValue());
            final byte[] array124 = this.ds.encode(this.dd).array();
            list2.add(new Stream("__substg1.0_" + format37, array124));
            final g g217;
            (g217 = new g()).a(d48.longValue());
            g217.a(PropertyType.STRING8);
            g217.b(array124.length + this.dq);
            g217.a(true);
            g217.b(true);
            byteArrayOutputStream.write(g217.a(), 0, 16);
        }
        if (this.de != null) {
            final e e80;
            (e80 = new e()).a(new d(32930));
            e80.a(StandardPropertySet.ADDRESS);
            e80.a(com.ews.msg.f.b);
            int a104;
            if ((a104 = com.ews.msg.h.a(list, e80)) == -1) {
                list.add(e80);
                a104 = list.size() - 1;
            }
            final d d49 = new d(a104 + 32768 << 16 | this.dn);
            final String format38 = String.format("%08X", d49.longValue());
            final byte[] array125 = this.ds.encode(this.de).array();
            list2.add(new Stream("__substg1.0_" + format38, array125));
            final g g218;
            (g218 = new g()).a(d49.longValue());
            g218.a(PropertyType.STRING8);
            g218.b(array125.length + this.dq);
            g218.a(true);
            g218.b(true);
            byteArrayOutputStream.write(g218.a(), 0, 16);
        }
        if (this.df != null) {
            final e e81;
            (e81 = new e()).a(new d(32901));
            e81.a(StandardPropertySet.ADDRESS);
            e81.a(com.ews.msg.f.a);
            int a105;
            if ((a105 = com.ews.msg.h.a(list, e81)) == -1) {
                list.add(e81);
                a105 = list.size() - 1;
            }
            final d d50 = new d(a105 + 32768 << 16 | 0x102);
            list2.add(new Stream("__substg1.0_" + String.format("%08X", d50.longValue()), this.df));
            final g g219;
            (g219 = new g()).a(d50.longValue());
            g219.a(PropertyType.INTEGER32);
            g219.b(this.df.length);
            g219.a(true);
            g219.b(true);
            byteArrayOutputStream.write(g219.a(), 0, 16);
        }
        if (this.dg != null) {
            final e e82;
            (e82 = new e()).a(new d(32917));
            e82.a(StandardPropertySet.ADDRESS);
            e82.a(com.ews.msg.f.a);
            int a106;
            if ((a106 = com.ews.msg.h.a(list, e82)) == -1) {
                list.add(e82);
                a106 = list.size() - 1;
            }
            final d d51 = new d(a106 + 32768 << 16 | 0x102);
            list2.add(new Stream("__substg1.0_" + String.format("%08X", d51.longValue()), this.dg));
            final g g220;
            (g220 = new g()).a(d51.longValue());
            g220.a(PropertyType.INTEGER32);
            g220.b(this.dg.length);
            g220.a(true);
            g220.b(true);
            byteArrayOutputStream.write(g220.a(), 0, 16);
        }
        if (this.dh != null) {
            final e e83;
            (e83 = new e()).a(new d(32933));
            e83.a(StandardPropertySet.ADDRESS);
            e83.a(com.ews.msg.f.a);
            int a107;
            if ((a107 = com.ews.msg.h.a(list, e83)) == -1) {
                list.add(e83);
                a107 = list.size() - 1;
            }
            final d d52 = new d(a107 + 32768 << 16 | 0x102);
            list2.add(new Stream("__substg1.0_" + String.format("%08X", d52.longValue()), this.dh));
            final g g221;
            (g221 = new g()).a(d52.longValue());
            g221.a(PropertyType.INTEGER32);
            g221.b(this.dh.length);
            g221.a(true);
            g221.b(true);
            byteArrayOutputStream.write(g221.a(), 0, 16);
        }
        for (int n = 0; n < this.dk.size(); ++n) {
            if (this.dk.get(n).getValue() != null) {
                final e e84 = new e();
                if (this.dk.get(n).getTag() instanceof ExtendedPropertyId) {
                    final ExtendedPropertyId extendedPropertyId = (ExtendedPropertyId)this.dk.get(n).getTag();
                    e84.a(new d(extendedPropertyId.getId()));
                    e84.a(extendedPropertyId.getGuid());
                    e84.a(com.ews.msg.f.a);
                }
                else {
                    final ExtendedPropertyName extendedPropertyName = (ExtendedPropertyName)this.dk.get(n).getTag();
                    e84.a(extendedPropertyName.getName());
                    e84.a(extendedPropertyName.getGuid());
                    e84.a(com.ews.msg.f.b);
                }
                if (com.ews.msg.h.a(list, e84) == -1) {
                    list.add(e84);
                    final int n2 = list.size() - 1;
                    d d53 = new d(n2 + 32768 << 16 | com.ews.msg.h.a(this.dk.get(n).getTag().getType()));
                    if (this.dk.get(n).getTag().getType() == PropertyType.BOOLEAN || this.dk.get(n).getTag().getType() == PropertyType.INTEGER16 || this.dk.get(n).getTag().getType() == PropertyType.INTEGER32 || this.dk.get(n).getTag().getType() == PropertyType.INTEGER64 || this.dk.get(n).getTag().getType() == PropertyType.FLOATING32 || this.dk.get(n).getTag().getType() == PropertyType.FLOATING64 || this.dk.get(n).getTag().getType() == PropertyType.FLOATING_TIME || this.dk.get(n).getTag().getType() == PropertyType.TIME) {
                        final g g222;
                        (g222 = new g()).a(d53.longValue());
                        g222.a(this.dk.get(n).getTag().getType());
                        g222.a(this.dk.get(n).getValue());
                        g222.a(true);
                        g222.b(true);
                        byteArrayOutputStream.write(g222.a(), 0, 16);
                    }
                    else if (this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_CURRENCY && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_FLOATING32 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_FLOATING64 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_FLOATING_TIME && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_GUID && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_INTEGER16 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_INTEGER32 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_INTEGER64 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_STRING && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_STRING8 && this.dk.get(n).getTag().getType() != PropertyType.MULTIPLE_TIME) {
                        if (this.dk.get(n).getTag().getType() == PropertyType.MULTIPLE_BINARY) {
                            final String format39 = String.format("%08X", d53.longValue());
                            final ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            final byte[] array126 = new byte[4];
                            System.arraycopy(this.dk.get(n).getValue(), 0, array126, 0, 4);
                            final int intValue;
                            final int[] array127 = new int[(intValue = new d(array126).intValue()) + 1];
                            for (int n3 = 0; n3 < intValue; ++n3) {
                                final byte[] array128 = new byte[4];
                                System.arraycopy(this.dk.get(n).getValue(), 4 + (n3 << 2), array128, 0, 4);
                                array127[n3] = new d(array128).intValue();
                            }
                            array127[intValue] = this.dk.get(n).getValue().length;
                            for (int n4 = 0; n4 < array127.length - 1; ++n4) {
                                final int n5 = array127[n4 + 1] - array127[n4];
                                final byte[] a108 = new d(n5).a();
                                final byte[] array129;
                                (array129 = new byte[8])[0] = a108[0];
                                array129[1] = a108[1];
                                array129[2] = a108[2];
                                array129[3] = a108[3];
                                byteArrayOutputStream6.write(array129);
                                final byte[] buffer = new byte[n5];
                                System.arraycopy(this.dk.get(n).getValue(), array127[n4], buffer, 0, n5);
                                list2.add(new Stream("__substg1.0_" + format39 + "-" + String.format("%08X", n4), buffer));
                            }
                            final byte[] byteArray5 = byteArrayOutputStream6.toByteArray();
                            list2.add(new Stream("__substg1.0_" + format39, byteArray5));
                            final g g223;
                            (g223 = new g()).a(d53.longValue());
                            g223.a(PropertyType.MULTIPLE_BINARY);
                            g223.b(byteArray5.length);
                            g223.a(true);
                            g223.b(true);
                            byteArrayOutputStream.write(g223.a(), 0, 16);
                        }
                        else {
                            byte[] buffer2;
                            if ((buffer2 = this.dk.get(n).getValue()) != null && this.dk.get(n).getTag().getType() == PropertyType.STRING && !this.ds.name().equals("UTF-16LE")) {
                                buffer2 = this.ds.encode(this.du.decode(ByteBuffer.wrap(buffer2)).toString()).array();
                                d53 = new d(n2 + 32768 << 16 | this.dn);
                            }
                            else if (buffer2 != null && this.dk.get(n).getTag().getType() == PropertyType.STRING8 && this.ds.name().equals("UTF-16LE")) {
                                buffer2 = this.ds.encode(this.dt.decode(ByteBuffer.wrap(buffer2)).toString()).array();
                                d53 = new d(n2 + 32768 << 16 | this.dn);
                            }
                            list2.add(new Stream("__substg1.0_" + String.format("%08X", d53.longValue()), buffer2));
                            final g g224;
                            (g224 = new g()).a(d53.longValue());
                            if (this.dk.get(n).getTag().getType() == PropertyType.BINARY || this.dk.get(n).getTag().getType() == PropertyType.OBJECT) {
                                g224.a(PropertyType.INTEGER32);
                            }
                            else {
                                g224.a(PropertyType.STRING8);
                            }
                            g224.b(com.ews.msg.h.a(buffer2, this.dk.get(n).getTag().getType(), this.dq));
                            g224.a(true);
                            g224.b(true);
                            byteArrayOutputStream.write(g224.a(), 0, 16);
                        }
                    }
                }
            }
        }
        list2.add(new Stream("__properties_version1.0", byteArrayOutputStream.toByteArray()));
        for (int n6 = 0; n6 < this.di.size(); ++n6) {
            final Storage storage = new Storage(String.format("__recip_version1.0_#%08X", n6));
            final Recipient recipient = this.di.get(n6);
            final ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
            byteArrayOutputStream7.write(new byte[8], 0, 8);
            final g g225;
            (g225 = new g()).a(805306371L);
            g225.a(PropertyType.INTEGER32);
            g225.a(new d(n6).a());
            g225.a(true);
            g225.b(true);
            byteArrayOutputStream7.write(g225.a(), 0, 16);
            if (recipient.getDisplayType() != DisplayType.NONE) {
                final g g226;
                (g226 = new g()).a(956301315L);
                g226.a(PropertyType.INTEGER32);
                g226.a(new d(com.ews.msg.a.a(recipient.getDisplayType())).a());
                g226.a(true);
                g226.b(true);
                byteArrayOutputStream7.write(g226.a(), 0, 16);
            }
            if (recipient.getObjectType() != ObjectType.NONE) {
                final g g227;
                (g227 = new g()).a(268304387L);
                g227.a(PropertyType.INTEGER32);
                g227.a(new d(com.ews.msg.a.a(recipient.getObjectType())).a());
                g227.a(true);
                g227.b(true);
                byteArrayOutputStream7.write(g227.a(), 0, 16);
            }
            if (recipient.getRecipientType() != RecipientType.NONE) {
                final g g228;
                (g228 = new g()).a(202702851L);
                g228.a(PropertyType.INTEGER32);
                g228.a(new d(com.ews.msg.a.a(recipient.getRecipientType())).a());
                g228.a(true);
                g228.b(true);
                byteArrayOutputStream7.write(g228.a(), 0, 16);
            }
            if (recipient.getDisplayName() != null) {
                final byte[] array130 = this.ds.encode(recipient.getDisplayName()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_3001" + this.dm, array130));
                final g g229;
                (g229 = new g()).a(0x30010000 | this.dn);
                g229.a(PropertyType.STRING8);
                g229.b(array130.length + this.dq);
                g229.a(true);
                g229.b(true);
                byteArrayOutputStream7.write(g229.a(), 0, 16);
                storage.getDirectoryEntries().add(new Stream("__substg1.0_5FF6" + this.dm, array130));
                final g g230;
                (g230 = new g()).a(0x5FF60000 | this.dn);
                g230.a(PropertyType.STRING8);
                g230.b(array130.length + this.dq);
                g230.a(true);
                g230.b(true);
                byteArrayOutputStream7.write(g230.a(), 0, 16);
            }
            if (recipient.getEmailAddress() != null) {
                final byte[] array131 = this.ds.encode(recipient.getEmailAddress()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_3003" + this.dm, array131));
                final g g231;
                (g231 = new g()).a(0x30030000 | this.dn);
                g231.a(PropertyType.STRING8);
                g231.b(array131.length + this.dq);
                g231.a(true);
                g231.b(true);
                byteArrayOutputStream7.write(g231.a(), 0, 16);
            }
            if (recipient.getAddressType() != null) {
                final byte[] array132 = this.ds.encode(recipient.getAddressType()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_3002" + this.dm, array132));
                final g g232;
                (g232 = new g()).a(0x30020000 | this.dn);
                g232.a(PropertyType.STRING8);
                g232.b(array132.length + this.dq);
                g232.a(true);
                g232.b(true);
                byteArrayOutputStream7.write(g232.a(), 0, 16);
            }
            if (recipient.getEntryId() != null) {
                storage.getDirectoryEntries().add(new Stream("__substg1.0_0FFF0102", recipient.getEntryId()));
                final g g233;
                (g233 = new g()).a(268370178L);
                g233.a(PropertyType.BINARY);
                g233.b(recipient.getEntryId().length);
                g233.a(true);
                g233.b(true);
                byteArrayOutputStream7.write(g233.a(), 0, 16);
                storage.getDirectoryEntries().add(new Stream("__substg1.0_5FF70102", recipient.getEntryId()));
                final g g234;
                (g234 = new g()).a(1610023170L);
                g234.a(PropertyType.BINARY);
                g234.b(recipient.getEntryId().length);
                g234.a(true);
                g234.b(true);
                byteArrayOutputStream7.write(g234.a(), 0, 16);
            }
            if (recipient.getSearchKey() != null) {
                storage.getDirectoryEntries().add(new Stream("__substg1.0_300B0102", recipient.getSearchKey()));
                final g g235;
                (g235 = new g()).a(806027522L);
                g235.a(PropertyType.BINARY);
                g235.b(recipient.getSearchKey().length);
                g235.a(true);
                g235.b(true);
                byteArrayOutputStream7.write(g235.a(), 0, 16);
            }
            if (recipient.getInstanceKey() != null) {
                storage.getDirectoryEntries().add(new Stream("__substg1.0_0FF60102", recipient.getInstanceKey()));
                final g g236;
                (g236 = new g()).a(267780354L);
                g236.a(PropertyType.BINARY);
                g236.b(recipient.getInstanceKey().length);
                g236.a(true);
                g236.b(true);
                byteArrayOutputStream7.write(g236.a(), 0, 16);
            }
            if (recipient.getResponsibility()) {
                final g g237;
                (g237 = new g()).a(235864075L);
                g237.a(PropertyType.BOOLEAN);
                g237.a(new c(1).a());
                g237.a(true);
                g237.b(true);
                byteArrayOutputStream7.write(g237.a(), 0, 16);
            }
            if (recipient.getSendRichInfo()) {
                final g g238;
                (g238 = new g()).a(977272843L);
                g238.a(PropertyType.BOOLEAN);
                g238.a(new c(1).a());
                g238.a(true);
                g238.b(true);
                byteArrayOutputStream7.write(g238.a(), 0, 16);
            }
            if (recipient.getSendInternetEncoding() > 0) {
                final g g239;
                (g239 = new g()).a(980484099L);
                g239.a(PropertyType.INTEGER32);
                g239.a(new d(recipient.getSendInternetEncoding()).a());
                g239.a(true);
                g239.b(true);
                byteArrayOutputStream7.write(g239.a(), 0, 16);
            }
            if (recipient.getSmtpAddress() != null) {
                final byte[] array133 = this.ds.encode(recipient.getSmtpAddress()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_39FE" + this.dm, array133));
                final g g240;
                (g240 = new g()).a(0x39FE0000 | this.dn);
                g240.a(PropertyType.STRING8);
                g240.b(array133.length + this.dq);
                g240.a(true);
                g240.b(true);
                byteArrayOutputStream7.write(g240.a(), 0, 16);
            }
            if (recipient.getDisplayName7Bit() != null) {
                final byte[] array134 = this.ds.encode(recipient.getDisplayName7Bit()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_39FF" + this.dm, array134));
                final g g241;
                (g241 = new g()).a(0x39FF0000 | this.dn);
                g241.a(PropertyType.STRING8);
                g241.b(array134.length + this.dq);
                g241.a(true);
                g241.b(true);
                byteArrayOutputStream7.write(g241.a(), 0, 16);
            }
            if (recipient.getTransmitableDisplayName() != null) {
                final byte[] array135 = this.ds.encode(recipient.getTransmitableDisplayName()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_3A20" + this.dm, array135));
                final g g242;
                (g242 = new g()).a(0x3A200000 | this.dn);
                g242.a(PropertyType.STRING8);
                g242.b(array135.length + this.dq);
                g242.a(true);
                g242.b(true);
                byteArrayOutputStream7.write(g242.a(), 0, 16);
            }
            if (recipient.getOriginatingAddressType() != null) {
                final byte[] array136 = this.ds.encode(recipient.getOriginatingAddressType()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_403D" + this.dm, array136));
                final g g243;
                (g243 = new g()).a(0x403D0000 | this.dn);
                g243.a(PropertyType.STRING8);
                g243.b(array136.length + this.dq);
                g243.a(true);
                g243.b(true);
                byteArrayOutputStream7.write(g243.a(), 0, 16);
            }
            if (recipient.getOriginatingEmailAddress() != null) {
                final byte[] array137 = this.ds.encode(recipient.getOriginatingEmailAddress()).array();
                storage.getDirectoryEntries().add(new Stream("__substg1.0_403E" + this.dm, array137));
                final g g244;
                (g244 = new g()).a(0x403E0000 | this.dn);
                g244.a(PropertyType.STRING8);
                g244.b(array137.length + this.dq);
                g244.a(true);
                g244.b(true);
                byteArrayOutputStream7.write(g244.a(), 0, 16);
            }
            storage.getDirectoryEntries().add(new Stream("__properties_version1.0", byteArrayOutputStream7.toByteArray()));
            list2.add(storage);
        }
        for (int n7 = 0; n7 < this.dj.size(); ++n7) {
            final Storage storage2 = new Storage(String.format("__attach_version1.0_#%08X", n7));
            final Attachment attachment = this.dj.get(n7);
            final ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
            byteArrayOutputStream8.write(new byte[8], 0, 8);
            final g g245;
            (g245 = new g()).a(237043715L);
            g245.a(PropertyType.INTEGER32);
            g245.a(new d(n7).a());
            g245.a(true);
            g245.b(false);
            byteArrayOutputStream8.write(g245.a(), 0, 16);
            final g g246;
            (g246 = new g()).a(2147090435L);
            g246.a(PropertyType.INTEGER32);
            g246.a(new d(n7).a());
            g246.a(true);
            g246.b(true);
            byteArrayOutputStream8.write(g246.a(), 0, 16);
            final byte[] a109 = new d(n7).a();
            attachment.setRecordKey(a109);
            storage2.getDirectoryEntries().add(new Stream("__substg1.0_0FF90102", a109));
            final g g247;
            (g247 = new g()).a(267976962L);
            g247.a(PropertyType.BINARY);
            g247.b(4L);
            g247.a(true);
            g247.b(true);
            byteArrayOutputStream8.write(g247.a(), 0, 16);
            if (attachment.getAdditionalInfo() != null) {
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_370F0102", attachment.getAdditionalInfo()));
                final g g248;
                (g248 = new g()).a(923730178L);
                g248.a(PropertyType.BINARY);
                g248.b(attachment.getAdditionalInfo().length);
                g248.a(true);
                g248.b(true);
                byteArrayOutputStream8.write(g248.a(), 0, 16);
            }
            if (attachment.getContentBase() != null) {
                final byte[] array138 = this.ds.encode(attachment.getContentBase()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3711" + this.dm, array138));
                final g g249;
                (g249 = new g()).a(0x37110000 | this.dn);
                g249.a(PropertyType.STRING8);
                g249.b(array138.length + this.dq);
                g249.a(true);
                g249.b(true);
                byteArrayOutputStream8.write(g249.a(), 0, 16);
            }
            if (attachment.getContentId() != null) {
                final byte[] array139 = this.ds.encode(attachment.getContentId()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3712" + this.dm, array139));
                final g g250;
                (g250 = new g()).a(0x37120000 | this.dn);
                g250.a(PropertyType.STRING8);
                g250.b(array139.length + this.dq);
                g250.a(true);
                g250.b(true);
                byteArrayOutputStream8.write(g250.a(), 0, 16);
            }
            if (attachment.getContentLocation() != null) {
                final byte[] array140 = this.ds.encode(attachment.getContentLocation()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3713" + this.dm, array140));
                final g g251;
                (g251 = new g()).a(0x37130000 | this.dn);
                g251.a(PropertyType.STRING8);
                g251.b(array140.length + this.dq);
                g251.a(true);
                g251.b(true);
                byteArrayOutputStream8.write(g251.a(), 0, 16);
            }
            if (attachment.getContentDisposition() != null) {
                final byte[] array141 = this.ds.encode(attachment.getContentDisposition()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3716" + this.dm, array141));
                final g g252;
                (g252 = new g()).a(0x37160000 | this.dn);
                g252.a(PropertyType.STRING8);
                g252.b(array141.length + this.dq);
                g252.a(true);
                g252.b(true);
                byteArrayOutputStream8.write(g252.a(), 0, 16);
            }
            if (attachment.getData() != null) {
                if (attachment.getMethod() == AttachmentMethod.OLE) {
                    final Storage storage3 = new Storage("__substg1.0_3701000D");
                    storage2.getDirectoryEntries().add(storage3);
                    final CompoundFile compoundFile = new CompoundFile(new ByteArrayInputStream(attachment.getData()));
                    storage3.setClassId(compoundFile.getRoot().getClassId());
                    for (int n8 = 0; n8 < compoundFile.getRoot().getDirectoryEntries().size(); ++n8) {
                        storage3.getDirectoryEntries().add(compoundFile.getRoot().getDirectoryEntries().get(n8));
                    }
                    final g g253;
                    (g253 = new g()).a(922812429L);
                    g253.a(PropertyType.OBJECT);
                    g253.b(2147483647L);
                    g253.a(true);
                    g253.b(true);
                    final byte[] a110;
                    (a110 = g253.a())[12] = 4;
                    byteArrayOutputStream8.write(a110, 0, 16);
                }
                else {
                    storage2.getDirectoryEntries().add(new Stream("__substg1.0_37010102", attachment.getData()));
                    final g g254;
                    (g254 = new g()).a(922812674L);
                    g254.a(PropertyType.BINARY);
                    g254.b(attachment.getData().length);
                    g254.a(true);
                    g254.b(true);
                    byteArrayOutputStream8.write(g254.a(), 0, 16);
                }
            }
            if (attachment.getEncoding() != null) {
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_37020102", attachment.getEncoding()));
                final g g255;
                (g255 = new g()).a(922878210L);
                g255.a(PropertyType.BINARY);
                g255.b(attachment.getEncoding().length);
                g255.a(true);
                g255.b(true);
                byteArrayOutputStream8.write(g255.a(), 0, 16);
            }
            if (attachment.getExtension() != null) {
                final byte[] array142 = this.ds.encode(attachment.getExtension()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3703" + this.dm, array142));
                final g g256;
                (g256 = new g()).a(0x37030000 | this.dn);
                g256.a(PropertyType.STRING8);
                g256.b(array142.length + this.dq);
                g256.a(true);
                g256.b(true);
                byteArrayOutputStream8.write(g256.a(), 0, 16);
            }
            if (attachment.getFileName() != null) {
                final byte[] array143 = this.ds.encode(attachment.getFileName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3704" + this.dm, array143));
                final g g257;
                (g257 = new g()).a(0x37040000 | this.dn);
                g257.a(PropertyType.STRING8);
                g257.b(array143.length + this.dq);
                g257.a(true);
                g257.b(true);
                byteArrayOutputStream8.write(g257.a(), 0, 16);
            }
            if (attachment.getFlags() != AttachmentFlags.NONE) {
                final g g258;
                (g258 = new g()).a(924057603L);
                g258.a(PropertyType.INTEGER32);
                g258.a(new d(com.ews.msg.a.a(attachment.getFlags())).a());
                g258.a(true);
                g258.b(true);
                byteArrayOutputStream8.write(g258.a(), 0, 16);
            }
            if (attachment.getLongFileName() != null) {
                final byte[] array144 = this.ds.encode(attachment.getLongFileName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3707" + this.dm, array144));
                final g g259;
                (g259 = new g()).a(0x37070000 | this.dn);
                g259.a(PropertyType.STRING8);
                g259.b(array144.length + this.dq);
                g259.a(true);
                g259.b(true);
                byteArrayOutputStream8.write(g259.a(), 0, 16);
            }
            if (attachment.getLongPathName() != null) {
                final byte[] array145 = this.ds.encode(attachment.getLongPathName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_370D" + this.dm, array145));
                final g g260;
                (g260 = new g()).a(0x370D0000 | this.dn);
                g260.a(PropertyType.STRING8);
                g260.b(array145.length + this.dq);
                g260.a(true);
                g260.b(true);
                byteArrayOutputStream8.write(g260.a(), 0, 16);
            }
            if (attachment.getMethod() != AttachmentMethod.NONE) {
                final g g261;
                (g261 = new g()).a(923074563L);
                g261.a(PropertyType.INTEGER32);
                g261.a(new d(com.ews.msg.a.a(attachment.getMethod())).a());
                g261.a(true);
                g261.b(true);
                byteArrayOutputStream8.write(g261.a(), 0, 16);
            }
            if (attachment.getMimeSequence() > 0L) {
                final g g262;
                (g262 = new g()).a(923795459L);
                g262.a(PropertyType.INTEGER32);
                g262.a(new d(attachment.getMimeSequence()).a());
                g262.a(true);
                g262.b(true);
                byteArrayOutputStream8.write(g262.a(), 0, 16);
            }
            if (attachment.getMimeTag() != null) {
                final byte[] array146 = this.ds.encode(attachment.getMimeTag()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_370E" + this.dm, array146));
                final g g263;
                (g263 = new g()).a(0x370E0000 | this.dn);
                g263.a(PropertyType.STRING8);
                g263.b(array146.length + this.dq);
                g263.a(true);
                g263.b(true);
                byteArrayOutputStream8.write(g263.a(), 0, 16);
            }
            if (attachment.getPathName() != null) {
                final byte[] array147 = this.ds.encode(attachment.getPathName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3708" + this.dm, array147));
                final g g264;
                (g264 = new g()).a(0x37080000 | this.dn);
                g264.a(PropertyType.STRING8);
                g264.b(array147.length + this.dq);
                g264.a(true);
                g264.b(true);
                byteArrayOutputStream8.write(g264.a(), 0, 16);
            }
            if (attachment.getRendering() != null) {
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_37090102", attachment.getRendering()));
                final g g265;
                (g265 = new g()).a(923336962L);
                g265.a(PropertyType.BINARY);
                g265.b(attachment.getRendering().length);
                g265.a(true);
                g265.b(true);
                byteArrayOutputStream8.write(g265.a(), 0, 16);
            }
            if (attachment.getRenderingPosition() > 0L) {
                final g g266;
                (g266 = new g()).a(923467779L);
                g266.a(PropertyType.INTEGER32);
                g266.a(new d(attachment.getRenderingPosition()).a());
                g266.a(true);
                g266.b(true);
                byteArrayOutputStream8.write(g266.a(), 0, 16);
            }
            if (attachment.getSize() > 0L) {
                final g g267;
                (g267 = new g()).a(236978179L);
                g267.a(PropertyType.INTEGER32);
                g267.a(new d(attachment.getSize()).a());
                g267.a(true);
                g267.b(true);
                byteArrayOutputStream8.write(g267.a(), 0, 16);
            }
            if (attachment.getTag() != null) {
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_370A0102", attachment.getTag()));
                final g g268;
                (g268 = new g()).a(923402498L);
                g268.a(PropertyType.BINARY);
                g268.b(attachment.getTag().length);
                g268.a(true);
                g268.b(true);
                byteArrayOutputStream8.write(g268.a(), 0, 16);
            }
            if (attachment.getTransportName() != null) {
                final byte[] array148 = this.ds.encode(attachment.getTransportName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_370C" + this.dm, array148));
                final g g269;
                (g269 = new g()).a(0x370C0000 | this.dn);
                g269.a(PropertyType.STRING8);
                g269.b(array148.length + this.dq);
                g269.a(true);
                g269.b(true);
                byteArrayOutputStream8.write(g269.a(), 0, 16);
            }
            if (attachment.getDisplayName() != null) {
                final byte[] array149 = this.ds.encode(attachment.getDisplayName()).array();
                storage2.getDirectoryEntries().add(new Stream("__substg1.0_3001" + this.dm, array149));
                final g g270;
                (g270 = new g()).a(0x30010000 | this.dn);
                g270.a(PropertyType.STRING8);
                g270.b(array149.length + this.dq);
                g270.a(true);
                g270.b(true);
                byteArrayOutputStream8.write(g270.a(), 0, 16);
            }
            if (attachment.getEmbeddedMessage() != null && attachment.getMethod() != AttachmentMethod.OLE) {
                final List<DirectoryEntry> a111 = attachment.getEmbeddedMessage().a(list);
                final Storage storage4 = new Storage("__substg1.0_3701000D");
                for (int n9 = 0; n9 < a111.size(); ++n9) {
                    storage4.getDirectoryEntries().add(a111.get(n9));
                }
                storage2.getDirectoryEntries().add(storage4);
                final g g271;
                (g271 = new g()).a(922812429L);
                g271.a(PropertyType.OBJECT);
                g271.b(2147483647L);
                g271.a(true);
                g271.b(true);
                final byte[] a112;
                (a112 = g271.a())[12] = 1;
                byteArrayOutputStream8.write(a112, 0, 16);
            }
            if (attachment.getObjectType() != ObjectType.NONE) {
                final g g272;
                (g272 = new g()).a(268304387L);
                g272.a(PropertyType.INTEGER32);
                g272.a(new d(com.ews.msg.a.a(attachment.getObjectType())).a());
                g272.a(true);
                g272.b(true);
                byteArrayOutputStream8.write(g272.a(), 0, 16);
            }
            if (attachment.isHidden()) {
                final g g273;
                (g273 = new g()).a(2147352587L);
                g273.a(PropertyType.BOOLEAN);
                g273.a(new c(1).a());
                g273.a(true);
                g273.b(true);
                byteArrayOutputStream8.write(g273.a(), 0, 16);
            }
            if (attachment.isContactPhoto()) {
                final g g274;
                (g274 = new g()).a(2147418123L);
                g274.a(PropertyType.BOOLEAN);
                g274.a(new c(1).a());
                g274.a(true);
                g274.b(true);
                byteArrayOutputStream8.write(g274.a(), 0, 16);
            }
            if (attachment.a() != null && attachment.getMethod() == AttachmentMethod.OLE) {
                storage2.getDirectoryEntries().add(attachment.a());
                storage2.getDirectoryEntries().add(attachment.b());
            }
            else {
                storage2.getDirectoryEntries().add(new Stream("__properties_version1.0", byteArrayOutputStream8.toByteArray()));
            }
            list2.add(storage2);
        }
        return list2;
    }
    
    private static int a(final byte[] array, final List<byte[]> list) {
        if (array != null) {
            for (int i = 0; i < list.size(); ++i) {
                final byte[] array2 = list.get(i);
                boolean b = true;
                for (int j = 0; j < 16; ++j) {
                    if (array[j] != array2[j]) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public Charset getCharset() {
        return this.ds;
    }
    
    public void setCharset(final Charset charset) {
        this.ds = charset;
    }
    
    public Encoding getEncoding() {
        return this.dr;
    }
    
    public void setEncoding(final Encoding encoding) {
        this.dr = encoding;
    }
    
    public String getMessageClass() {
        return this.b;
    }
    
    public void setMessageClass(final String messageClass) {
        this.b = messageClass;
    }
    
    public String getSubject() {
        return this.c;
    }
    
    public void setSubject(final String subject) {
        this.c = subject;
    }
    
    public String getSubjectPrefix() {
        return this.d;
    }
    
    public void setSubjectPrefix(final String subjectPrefix) {
        this.d = subjectPrefix;
    }
    
    public String getConversationTopic() {
        return this.e;
    }
    
    public void setConversationTopic(final String conversationTopic) {
        this.e = conversationTopic;
    }
    
    public String getDisplayBcc() {
        return this.f;
    }
    
    public void setDisplayBcc(final String displayBcc) {
        this.f = displayBcc;
    }
    
    public String getDisplayCc() {
        return this.g;
    }
    
    public void setDisplayCc(final String displayCc) {
        this.g = displayCc;
    }
    
    public String getDisplayTo() {
        return this.h;
    }
    
    public void setDisplayTo(final String displayTo) {
        this.h = displayTo;
    }
    
    public String getOriginalDisplayTo() {
        return this.i;
    }
    
    public void setOriginalDisplayTo(final String originalDisplayTo) {
        this.i = originalDisplayTo;
    }
    
    public String getReplyTo() {
        return this.j;
    }
    
    public void setReplyTo(final String replyTo) {
        this.j = replyTo;
    }
    
    public String getNormalizedSubject() {
        return this.k;
    }
    
    public void setNormalizedSubject(final String normalizedSubject) {
        this.k = normalizedSubject;
    }
    
    public String getBody() {
        return this.l;
    }
    
    public void setBody(final String body) {
        this.l = body;
    }
    
    public byte[] getBodyRtf() {
        if (this.m != null && this.m.length > 0) {
            return com.ews.msg.h.c(this.m);
        }
        return null;
    }
    
    public void setBodyRtf(final byte[] rtf) {
        if (rtf != null) {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final d d = new d(rtf.length + 12);
                final d d2 = new d(rtf.length);
                final d d3 = new d(1095517517);
                byteArrayOutputStream.write(d.a());
                byteArrayOutputStream.write(d2.a());
                byteArrayOutputStream.write(d3.a());
                final a a;
                (a = new a()).a(rtf, 0, rtf.length);
                byteArrayOutputStream.write(new d(a.a()).a());
                byteArrayOutputStream.write(rtf);
                this.m = byteArrayOutputStream.toByteArray();
                this.setRtfInSync(true);
                return;
            }
            catch (IOException ex) {
                System.err.print(ex.getStackTrace());
                return;
            }
        }
        this.m = null;
    }
    
    public byte[] getRtfCompressed() {
        return this.m;
    }
    
    public void setRtfCompressed(final byte[] rtfCompressed) {
        this.m = rtfCompressed;
    }
    
    public byte[] getSearchKey() {
        return this.n;
    }
    
    public void setSearchKey(final byte[] searchKey) {
        this.n = searchKey;
    }
    
    public byte[] getChangeKey() {
        return this.o;
    }
    
    public void setChangeKey(final byte[] changeKey) {
        this.o = changeKey;
    }
    
    public byte[] getEntryId() {
        return this.p;
    }
    
    public void setEntryId(final byte[] entryId) {
        this.p = entryId;
    }
    
    public byte[] getReadReceiptEntryId() {
        return this.q;
    }
    
    public void setReadReceiptEntryId(final byte[] readReceiptEntryId) {
        this.q = readReceiptEntryId;
    }
    
    public byte[] getReadReceiptSearchKey() {
        return this.r;
    }
    
    public void setReadReceiptSearchKey(final byte[] readReceiptSearchKey) {
        this.r = readReceiptSearchKey;
    }
    
    public Date getCreationTime() {
        return this.s;
    }
    
    public void setCreationTime(final Date creationTime) {
        this.s = creationTime;
    }
    
    public Date getLastModificationTime() {
        return this.t;
    }
    
    public void setLastModificationTime(final Date lastModificationTime) {
        this.t = lastModificationTime;
    }
    
    public Date getMessageDeliveryTime() {
        return this.u;
    }
    
    public void setMessageDeliveryTime(final Date messageDeliveryTime) {
        this.u = messageDeliveryTime;
    }
    
    public Date getClientSubmitTime() {
        return this.v;
    }
    
    public void setClientSubmitTime(final Date clientSubmitTime) {
        this.v = clientSubmitTime;
    }
    
    public Date getProviderSubmitTime() {
        return this.w;
    }
    
    public void setProviderSubmitTime(final Date providerSubmitTime) {
        this.w = providerSubmitTime;
    }
    
    public Date getReportTime() {
        return this.x;
    }
    
    public void setReportTime(final Date reportTime) {
        this.x = reportTime;
    }
    
    public Date getLastVerbExecutionTime() {
        return this.at;
    }
    
    public void setLastVerbExecutionTime(final Date lastVerbExecutionTime) {
        this.at = lastVerbExecutionTime;
    }
    
    public String getReportText() {
        return this.y;
    }
    
    public void setReportText(final String reportText) {
        this.y = reportText;
    }
    
    public String getCreatorName() {
        return this.z;
    }
    
    public void setCreatorName(final String creatorName) {
        this.z = creatorName;
    }
    
    public String getLastModifierName() {
        return this.A;
    }
    
    public void setLastModifierName(final String lastModifierName) {
        this.A = lastModifierName;
    }
    
    public String getInternetMessageId() {
        return this.B;
    }
    
    public void setInternetMessageId(final String internetMessageId) {
        this.B = internetMessageId;
    }
    
    public String getInReplyTo() {
        return this.C;
    }
    
    public void setInReplyTo(final String inReplyTo) {
        this.C = inReplyTo;
    }
    
    public String getInternetReferences() {
        return this.D;
    }
    
    public void setInternetReferences(final String internetReferences) {
        this.D = internetReferences;
    }
    
    public long getMessageCodePage() {
        return this.E.longValue();
    }
    
    public void setMessageCodePage(final long messageCodePage) {
        this.E = new d(messageCodePage);
    }
    
    public long getIconIndex() {
        return this.F.longValue();
    }
    
    public void setIconIndex(final long iconIndex) {
        this.F = new d(iconIndex);
    }
    
    public long getSize() {
        return this.G.longValue();
    }
    
    public void setSize(final long messageSize) {
        this.G = new d(messageSize);
    }
    
    public long getInternetCodePage() {
        return this.H.longValue();
    }
    
    public void setInternetCodePage(final long internetCodePage) {
        this.H = new d(internetCodePage);
    }
    
    public byte[] getConversationIndex() {
        return this.I;
    }
    
    public void setConversationIndex(final byte[] conversationIndex) {
        this.I = conversationIndex;
    }
    
    public boolean isHidden() {
        return this.J;
    }
    
    public void setHidden(final boolean isHidden) {
        this.J = isHidden;
    }
    
    public boolean isReadOnly() {
        return this.K;
    }
    
    public void setReadOnly(final boolean isReadOnly) {
        this.K = isReadOnly;
    }
    
    public boolean isSystem() {
        return this.L;
    }
    
    public void setSystem(final boolean isSystem) {
        this.L = isSystem;
    }
    
    public boolean getDisableFullFidelity() {
        return this.M;
    }
    
    public void setDisableFullFidelity(final boolean disableFullFidelity) {
        this.M = disableFullFidelity;
    }
    
    public boolean hasAttachment() {
        return this.N;
    }
    
    public void setHasAttachment(final boolean hasAttachment) {
        this.N = hasAttachment;
    }
    
    public boolean getRtfInSync() {
        return this.O;
    }
    
    public void setRtfInSync(final boolean rtfInSync) {
        this.O = rtfInSync;
    }
    
    public boolean getReadReceiptRequested() {
        return this.P;
    }
    
    public void setReadReceiptRequested(final boolean readReceiptRequested) {
        this.P = readReceiptRequested;
    }
    
    public boolean getDeliveryReportRequested() {
        return this.Q;
    }
    
    public void setDeliveryReportRequested(final boolean deliveryReportRequested) {
        this.Q = deliveryReportRequested;
    }
    
    public byte[] getBodyHtml() {
        final byte[] bodyRtf = this.getBodyRtf();
        if (this.R != null || bodyRtf == null || bodyRtf.length <= 0) {
            return this.R;
        }
        final b b;
        if ((b = com.ews.msg.h.b(bodyRtf)) != null && b.a() != null) {
            return this.dt.encode(b.a()).array();
        }
        return null;
    }
    
    public void setBodyHtml(final byte[] bodyHtml) {
        this.R = bodyHtml;
    }
    
    public String getBodyHtmlText() {
        if (this.R != null) {
            if (this.H.intValue() > 0) {
                return com.ews.msg.h.a(this.H.intValue()).decode(ByteBuffer.wrap(this.R)).toString();
            }
            return this.dt.decode(ByteBuffer.wrap(this.R)).toString();
        }
        else {
            final byte[] bodyRtf;
            final b b;
            if ((bodyRtf = this.getBodyRtf()) != null && bodyRtf.length > 0 && (b = com.ews.msg.h.b(bodyRtf)) != null) {
                return b.a();
            }
            return null;
        }
    }
    
    public void setBodyHtmlText(final String bodyHtmlText) {
        if (bodyHtmlText != null) {
            this.R = this.dt.encode(bodyHtmlText).array();
        }
    }
    
    public Sensitivity getSensitivity() {
        return this.S;
    }
    
    public void setSensitivity(final Sensitivity sensitivity) {
        this.S = sensitivity;
    }
    
    public LastVerbExecuted getLastVerbExecuted() {
        return this.au;
    }
    
    public void setLastVerbExecuted(final LastVerbExecuted lastVerbExecuted) {
        this.au = lastVerbExecuted;
    }
    
    public Importance getImportance() {
        return this.T;
    }
    
    public void setImportance(final Importance importance) {
        this.T = importance;
    }
    
    public Priority getPriority() {
        return this.U;
    }
    
    public void setPriority(final Priority priority) {
        this.U = priority;
    }
    
    public FlagIcon getFlagIcon() {
        return this.V;
    }
    
    public void setFlagIcon(final FlagIcon flagIcon) {
        this.V = flagIcon;
    }
    
    public FlagStatus getFlagStatus() {
        return this.W;
    }
    
    public void setFlagStatus(final FlagStatus flagStatus) {
        this.W = flagStatus;
    }
    
    public ObjectType getObjectType() {
        return this.X;
    }
    
    public void setObjectType(final ObjectType objectType) {
        this.X = objectType;
    }
    
    public String getReceivedRepresentingAddressType() {
        return this.Y;
    }
    
    public void setReceivedRepresentingAddressType(final String receivedRepresentingAddressType) {
        this.Y = receivedRepresentingAddressType;
    }
    
    public String getReceivedRepresentingEmailAddress() {
        return this.Z;
    }
    
    public void setReceivedRepresentingEmailAddress(final String receivedRepresentingEmailAddress) {
        this.Z = receivedRepresentingEmailAddress;
    }
    
    public byte[] getReceivedRepresentingEntryId() {
        return this.aa;
    }
    
    public void setReceivedRepresentingEntryId(final byte[] receivedRepresentingEntryId) {
        this.aa = receivedRepresentingEntryId;
    }
    
    public String getReceivedRepresentingName() {
        return this.ab;
    }
    
    public void setReceivedRepresentingName(final String receivedRepresentingName) {
        this.ab = receivedRepresentingName;
    }
    
    public byte[] getReceivedRepresentingSearchKey() {
        return this.ac;
    }
    
    public void setReceivedRepresentingSearchKey(final byte[] receivedRepresentingSearchKey) {
        this.ac = receivedRepresentingSearchKey;
    }
    
    public String getReceivedByAddressType() {
        return this.ad;
    }
    
    public void setReceivedByAddressType(final String receivedByAddressType) {
        this.ad = receivedByAddressType;
    }
    
    public String getReceivedByEmailAddress() {
        return this.ae;
    }
    
    public void setReceivedByEmailAddress(final String receivedByEmailAddress) {
        this.ae = receivedByEmailAddress;
    }
    
    public byte[] getReceivedByEntryId() {
        return this.af;
    }
    
    public void setReceivedByEntryId(final byte[] receivedByEntryId) {
        this.af = receivedByEntryId;
    }
    
    public String getReceivedByName() {
        return this.ag;
    }
    
    public void setReceivedByName(final String receivedByName) {
        this.ag = receivedByName;
    }
    
    public byte[] getReceivedBySearchKey() {
        return this.ah;
    }
    
    public void setReceivedBySearchKey(final byte[] receivedBySearchKey) {
        this.ah = receivedBySearchKey;
    }
    
    public String getSenderAddressType() {
        return this.ai;
    }
    
    public void setSenderAddressType(final String senderAddressType) {
        this.ai = senderAddressType;
    }
    
    public String getSenderEmailAddress() {
        return this.aj;
    }
    
    public void setSenderEmailAddress(final String senderEmailAddress) {
        this.aj = senderEmailAddress;
    }
    
    public byte[] getSenderEntryId() {
        return this.ak;
    }
    
    public void setSenderEntryId(final byte[] senderEntryId) {
        this.ak = senderEntryId;
    }
    
    public String getSenderName() {
        return this.al;
    }
    
    public void setSenderName(final String senderName) {
        this.al = senderName;
    }
    
    public byte[] getSenderSearchKey() {
        return this.am;
    }
    
    public void setSenderSearchKey(final byte[] senderSearchKey) {
        this.am = senderSearchKey;
    }
    
    public String getSentRepresentingAddressType() {
        return this.an;
    }
    
    public void setSentRepresentingAddressType(final String sentRepresentingAddressType) {
        this.an = sentRepresentingAddressType;
    }
    
    public String getSentRepresentingEmailAddress() {
        return this.ao;
    }
    
    public void setSentRepresentingEmailAddress(final String sentRepresentingEmailAddress) {
        this.ao = sentRepresentingEmailAddress;
    }
    
    public byte[] getSentRepresentingEntryId() {
        return this.ap;
    }
    
    public void setSentRepresentingEntryId(final byte[] sentRepresentingEntryId) {
        this.ap = sentRepresentingEntryId;
    }
    
    public String getSentRepresentingName() {
        return this.aq;
    }
    
    public void setSentRepresentingName(final String sentRepresentingName) {
        this.aq = sentRepresentingName;
    }
    
    public byte[] getSentRepresentingSearchKey() {
        return this.ar;
    }
    
    public void setSentRepresentingSearchKey(final byte[] sentRepresentingSearchKey) {
        this.ar = sentRepresentingSearchKey;
    }
    
    public String getTransportMessageHeaders() {
        return this.as;
    }
    
    public void setTransportMessageHeaders(final String transportMessageHeaders) {
        this.as = transportMessageHeaders;
    }
    
    public List<MessageFlag> getMessageFlags() {
        return this.av;
    }
    
    public List<StoreSupportMask> getStoreSupportMasks() {
        return this.aw;
    }
    
    public String getOutlookVersion() {
        return this.ax;
    }
    
    public void setOutlookVersion(final String outlookVersion) {
        this.ax = outlookVersion;
    }
    
    public long getOutlookInternalVersion() {
        return this.ay.longValue();
    }
    
    public void setOutlookInternalVersion(final long outlookInternalVersion) {
        this.ay = new d(outlookInternalVersion);
    }
    
    public Date getCommonStartTime() {
        return this.az;
    }
    
    public void setCommonStartTime(final Date commonStartTime) {
        this.az = commonStartTime;
    }
    
    public Date getCommonEndTime() {
        return this.aA;
    }
    
    public void setCommonEndTime(final Date commonEndTime) {
        this.aA = commonEndTime;
    }
    
    public Date getFlagDueBy() {
        return this.aB;
    }
    
    public void setFlagDueBy(final Date flagDueBy) {
        this.aB = flagDueBy;
    }
    
    public List<String> getCompanies() {
        return this.aF;
    }
    
    public List<String> getContactNames() {
        return this.aG;
    }
    
    public List<String> getKeywords() {
        return this.aH;
    }
    
    public List<String> getCategories() {
        return this.aH;
    }
    
    public String getBillingInformation() {
        return this.aI;
    }
    
    public void setBillingInformation(final String billingInformation) {
        this.aI = billingInformation;
    }
    
    public String getMileage() {
        return this.aJ;
    }
    
    public void setMileage(final String mileage) {
        this.aJ = mileage;
    }
    
    public String getReminderSoundFile() {
        return this.aK;
    }
    
    public void setReminderSoundFile(final String reminderSoundFile) {
        this.aK = reminderSoundFile;
    }
    
    public boolean isPrivate() {
        return this.aL;
    }
    
    public void setPrivate(final boolean isPrivate) {
        this.aL = isPrivate;
    }
    
    public boolean getReminderOverrideDefault() {
        return this.aN;
    }
    
    public void setReminderOverrideDefault(final boolean reminderOverrideDefault) {
        this.aN = reminderOverrideDefault;
    }
    
    public boolean getReminderPlaySound() {
        return this.aO;
    }
    
    public void setReminderPlaySound(final boolean reminderPlaySound) {
        this.aO = reminderPlaySound;
    }
    
    public Date getAppointmentStartTime() {
        return this.aP;
    }
    
    public void setAppointmentStartTime(final Date appointmentStartTime) {
        this.aP = appointmentStartTime;
    }
    
    public Date getAppointmentEndTime() {
        return this.aQ;
    }
    
    public void setAppointmentEndTime(final Date appointmentEndTime) {
        this.aQ = appointmentEndTime;
    }
    
    public String getLocation() {
        return this.aS;
    }
    
    public void setLocation(final String location) {
        this.aS = location;
    }
    
    public String getAppointmentMessageClass() {
        return this.aX;
    }
    
    public void setAppointmentMessageClass(final String appointmentMessageClass) {
        this.aX = appointmentMessageClass;
    }
    
    public String getTimeZone() {
        return this.aY;
    }
    
    public void setTimeZone(final String timeZone) {
        this.aY = timeZone;
    }
    
    public String getRecurrencePattern() {
        return this.aZ;
    }
    
    public void setRecurrencePattern(final String recurrencePattern) {
        this.aZ = recurrencePattern;
    }
    
    public byte[] getGuid() {
        return this.ba;
    }
    
    public void setGuid(final byte[] guid) {
        this.ba = guid;
    }
    
    public int getLabel() {
        return this.bb;
    }
    
    public void setLabel(final int label) {
        this.bb = label;
    }
    
    public int getDuration() {
        return this.bc;
    }
    
    public void setDuration(final int duration) {
        this.bc = duration;
    }
    
    public BusyStatus getBusyStatus() {
        return this.aT;
    }
    
    public void setBusyStatus(final BusyStatus busyStatus) {
        this.aT = busyStatus;
    }
    
    public MeetingStatus getMeetingStatus() {
        return this.aU;
    }
    
    public void setMeetingStatus(final MeetingStatus meetingStatus) {
        this.aU = meetingStatus;
    }
    
    public ResponseStatus getResponseStatus() {
        return this.aV;
    }
    
    public void setResponseStatus(final ResponseStatus responseStatus) {
        this.aV = responseStatus;
    }
    
    public RecurrenceType getRecurrenceType() {
        return this.aW;
    }
    
    public void setRecurrenceType(final RecurrenceType recurrenceType) {
        this.aW = recurrenceType;
    }
    
    public String getOwner() {
        return this.bf;
    }
    
    public void setOwner(final String owner) {
        this.bf = owner;
    }
    
    public String getDelegator() {
        return this.bg;
    }
    
    public void setDelegator(final String delegator) {
        this.bg = delegator;
    }
    
    public double getPercentComplete() {
        return this.bh;
    }
    
    public void setPercentComplete(final double percentComplete) {
        this.bh = percentComplete;
    }
    
    public long getActualWork() {
        return this.bi.longValue();
    }
    
    public void setActualWork(final long actualWork) {
        this.bi = new d(actualWork);
    }
    
    public long getTotalWork() {
        return this.bj.longValue();
    }
    
    public void setTotalWork(final long totalWork) {
        this.bj = new d(totalWork);
    }
    
    public boolean isTeamTask() {
        return this.bk;
    }
    
    public void setTeamTask(final boolean isTeamTask) {
        this.bk = isTeamTask;
    }
    
    public boolean isComplete() {
        return this.bl;
    }
    
    public void setComplete(final boolean isComplete) {
        this.bl = isComplete;
    }
    
    public boolean isRecurring() {
        return this.aC;
    }
    
    public void setRecurring(final boolean isRecurring) {
        this.aC = isRecurring;
    }
    
    public boolean isAllDayEvent() {
        return this.aR;
    }
    
    public void setAllDayEvent(final boolean isAllDayEvent) {
        this.aR = isAllDayEvent;
    }
    
    public boolean isReminderSet() {
        return this.aM;
    }
    
    public void setReminderSet(final boolean isReminderSet) {
        this.aM = isReminderSet;
    }
    
    public Date getReminderTime() {
        return this.aD;
    }
    
    public void setReminderTime(final Date reminderTime) {
        this.aD = reminderTime;
    }
    
    public long getReminderMinutesBeforeStart() {
        return this.aE.longValue();
    }
    
    public void setReminderMinutesBeforeStart(final long reminderMinutesBeforeStart) {
        this.aE = new d(reminderMinutesBeforeStart);
    }
    
    public Date getTaskStartDate() {
        return this.bd;
    }
    
    public void setTaskStartDate(final Date taskStartDate) {
        this.bd = taskStartDate;
    }
    
    public Date getTaskDueDate() {
        return this.be;
    }
    
    public void setTaskDueDate(final Date taskDueDate) {
        this.be = taskDueDate;
    }
    
    public Date getDateCompleted() {
        return this.bm;
    }
    
    public void setDateCompleted(final Date dateCompleted) {
        this.bm = dateCompleted;
    }
    
    public TaskStatus getTaskStatus() {
        return this.bn;
    }
    
    public void setTaskStatus(final TaskStatus taskStatus) {
        this.bn = taskStatus;
    }
    
    public TaskOwnership getTaskOwnership() {
        return this.bo;
    }
    
    public void setTaskOwnership(final TaskOwnership taskOwnership) {
        this.bo = taskOwnership;
    }
    
    public TaskDelegationState getTaskDelegationState() {
        return this.bp;
    }
    
    public void setTaskDelegationState(final TaskDelegationState taskDelegationState) {
        this.bp = taskDelegationState;
    }
    
    public long getNoteHeight() {
        return this.br.longValue();
    }
    
    public void setNoteHeight(final long noteHeight) {
        this.br = new d(noteHeight);
    }
    
    public long getNoteWidth() {
        return this.bq.longValue();
    }
    
    public void setNoteWidth(final long noteWidth) {
        this.bq = new d(noteWidth);
    }
    
    public long getNoteTop() {
        return this.bt.longValue();
    }
    
    public void setNoteTop(final long noteTop) {
        this.bt = new d(noteTop);
    }
    
    public long getNoteLeft() {
        return this.bs.longValue();
    }
    
    public void setNoteLeft(final long noteLeft) {
        this.bs = new d(noteLeft);
    }
    
    public NoteColor getNoteColor() {
        return this.bu;
    }
    
    public void setNoteColor(final NoteColor noteColor) {
        this.bu = noteColor;
    }
    
    public Date getJournalStartTime() {
        return this.bv;
    }
    
    public void setJournalStartTime(final Date journalStartTime) {
        this.bv = journalStartTime;
    }
    
    public Date getJournalEndTime() {
        return this.bw;
    }
    
    public void setJournalEndTime(final Date journalEndTime) {
        this.bw = journalEndTime;
    }
    
    public String getJournalType() {
        return this.bx;
    }
    
    public void setJournalType(final String journalType) {
        this.bx = journalType;
    }
    
    public String getJournalTypeDescription() {
        return this.by;
    }
    
    public void setJournalTypeDescription(final String journalTypeDescription) {
        this.by = journalTypeDescription;
    }
    
    public long getJournalDuration() {
        return this.bz.longValue();
    }
    
    public void setJournalDuration(final long journalDuration) {
        this.bz = new d(journalDuration);
    }
    
    public Date getBirthday() {
        return this.bA;
    }
    
    public void setBirthday(final Date birthday) {
        this.bA = birthday;
    }
    
    public List<String> getChildrenNames() {
        return this.bB;
    }
    
    public String getAssistentName() {
        return this.bC;
    }
    
    public void setAssistentName(final String assistentName) {
        this.bC = assistentName;
    }
    
    public String getAssistentPhone() {
        return this.bD;
    }
    
    public void setAssistentPhone(final String assistentPhone) {
        this.bD = assistentPhone;
    }
    
    public String getBusinessPhone() {
        return this.bE;
    }
    
    public void setBusinessPhone(final String businessPhone) {
        this.bE = businessPhone;
    }
    
    public String getBusinessFax() {
        return this.bG;
    }
    
    public void setBusinessFax(final String businessFax) {
        this.bG = businessFax;
    }
    
    public String getBusinessHomePage() {
        return this.bH;
    }
    
    public void setBusinessHomePage(final String businessHomePage) {
        this.bH = businessHomePage;
    }
    
    public String getCallbackPhone() {
        return this.bI;
    }
    
    public void setCallbackPhone(final String callbackPhone) {
        this.bI = callbackPhone;
    }
    
    public String getCarPhone() {
        return this.bJ;
    }
    
    public void setCarPhone(final String carPhone) {
        this.bJ = carPhone;
    }
    
    public String getCellularPhone() {
        return this.bK;
    }
    
    public void setCellularPhone(final String cellularPhone) {
        this.bK = cellularPhone;
    }
    
    public String getCompanyMainPhone() {
        return this.bL;
    }
    
    public void setCompanyMainPhone(final String companyMainPhone) {
        this.bL = companyMainPhone;
    }
    
    public String getCompanyName() {
        return this.bM;
    }
    
    public void setCompanyName(final String companyName) {
        this.bM = companyName;
    }
    
    public String getComputerNetworkName() {
        return this.bN;
    }
    
    public void setComputerNetworkName(final String computerNetworkName) {
        this.bN = computerNetworkName;
    }
    
    public String getBusinessAddressCountry() {
        return this.cv;
    }
    
    public void setBusinessAddressCountry(final String businessAddressCountry) {
        this.cv = businessAddressCountry;
    }
    
    public String getCustomerId() {
        return this.bO;
    }
    
    public void setCustomerId(final String customerId) {
        this.bO = customerId;
    }
    
    public String getDepartmentName() {
        return this.bP;
    }
    
    public void setDepartmentName(final String departmentName) {
        this.bP = departmentName;
    }
    
    public String getDisplayName() {
        return this.bQ;
    }
    
    public void setDisplayName(final String displayName) {
        this.bQ = displayName;
    }
    
    public String getDisplayNamePrefix() {
        return this.bR;
    }
    
    public void setDisplayNamePrefix(final String displayNamePrefix) {
        this.bR = displayNamePrefix;
    }
    
    public String getFtpSite() {
        return this.bS;
    }
    
    public void setFtpSite(final String ftpSite) {
        this.bS = ftpSite;
    }
    
    public String getGeneration() {
        return this.bT;
    }
    
    public void setGeneration(final String generation) {
        this.bT = generation;
    }
    
    public String getGivenName() {
        return this.bU;
    }
    
    public void setGivenName(final String givenName) {
        this.bU = givenName;
    }
    
    public String getGovernmentId() {
        return this.bV;
    }
    
    public void setGovernmentId(final String governmentId) {
        this.bV = governmentId;
    }
    
    public String getHobbies() {
        return this.bW;
    }
    
    public void setHobbies(final String hobbies) {
        this.bW = hobbies;
    }
    
    public String getHomePhone2() {
        return this.bX;
    }
    
    public void setHomePhone2(final String homePhone2) {
        this.bX = homePhone2;
    }
    
    public String getHomeAddressCity() {
        return this.bY;
    }
    
    public void setHomeAddressCity(final String homeAddressCity) {
        this.bY = homeAddressCity;
    }
    
    public String getHomeAddressCountry() {
        return this.bZ;
    }
    
    public void setHomeAddressCountry(final String homeAddressCountry) {
        this.bZ = homeAddressCountry;
    }
    
    public String getHomeAddressPostalCode() {
        return this.ca;
    }
    
    public void setHomeAddressPostalCode(final String homeAddressPostalCode) {
        this.ca = homeAddressPostalCode;
    }
    
    public String getHomeAddressPostOfficeBox() {
        return this.cb;
    }
    
    public void setHomeAddressPostOfficeBox(final String homeAddressPostOfficeBox) {
        this.cb = homeAddressPostOfficeBox;
    }
    
    public String getHomeAddressState() {
        return this.cc;
    }
    
    public void setHomeAddressState(final String homeAddressState) {
        this.cc = homeAddressState;
    }
    
    public String getHomeAddressStreet() {
        return this.cd;
    }
    
    public void setHomeAddressStreet(final String homeAddressStreet) {
        this.cd = homeAddressStreet;
    }
    
    public String getHomeFax() {
        return this.ce;
    }
    
    public void setHomeFax(final String homeFax) {
        this.ce = homeFax;
    }
    
    public String getHomePhone() {
        return this.cf;
    }
    
    public void setHomePhone(final String homePhone) {
        this.cf = homePhone;
    }
    
    public String getInitials() {
        return this.cg;
    }
    
    public void setInitials(final String initials) {
        this.cg = initials;
    }
    
    public String getIsdn() {
        return this.ch;
    }
    
    public void setIsdn(final String isdn) {
        this.ch = isdn;
    }
    
    public String getBusinessAddressCity() {
        return this.cw;
    }
    
    public void setBusinessAddressCity(final String businessAddressCity) {
        this.cw = businessAddressCity;
    }
    
    public String getManagerName() {
        return this.ci;
    }
    
    public void setManagerName(final String managerName) {
        this.ci = managerName;
    }
    
    public String getMiddleName() {
        return this.cj;
    }
    
    public void setMiddleName(final String middleName) {
        this.cj = middleName;
    }
    
    public String getNickname() {
        return this.ck;
    }
    
    public void setNickname(final String nickname) {
        this.ck = nickname;
    }
    
    public String getOfficeLocation() {
        return this.cl;
    }
    
    public void setOfficeLocation(final String officeLocation) {
        this.cl = officeLocation;
    }
    
    public String getBusinessPhone2() {
        return this.bF;
    }
    
    public void setBusinessPhone2(final String businessPhone2) {
        this.bF = businessPhone2;
    }
    
    public String getOtherAddressCity() {
        return this.cm;
    }
    
    public void setOtherAddressCity(final String otherAddressCity) {
        this.cm = otherAddressCity;
    }
    
    public String getOtherAddressCountry() {
        return this.cn;
    }
    
    public void setOtherAddressCountry(final String otherAddressCountry) {
        this.cn = otherAddressCountry;
    }
    
    public String getOtherAddressPostalCode() {
        return this.co;
    }
    
    public void setOtherAddressPostalCode(final String otherAddressPostalCode) {
        this.co = otherAddressPostalCode;
    }
    
    public String getOtherAddressState() {
        return this.cp;
    }
    
    public void setOtherAddressState(final String otherAddressState) {
        this.cp = otherAddressState;
    }
    
    public String getOtherAddressStreet() {
        return this.cq;
    }
    
    public void setOtherAddressStreet(final String otherAddressStreet) {
        this.cq = otherAddressStreet;
    }
    
    public String getOtherPhone() {
        return this.cr;
    }
    
    public void setOtherPhone(final String otherPhone) {
        this.cr = otherPhone;
    }
    
    public String getPager() {
        return this.cs;
    }
    
    public void setPager(final String pager) {
        this.cs = pager;
    }
    
    public String getPersonalHomePage() {
        return this.ct;
    }
    
    public void setPersonalHomePage(final String personalHomePage) {
        this.ct = personalHomePage;
    }
    
    public String getPostalAddress() {
        return this.cu;
    }
    
    public void setPostalAddress(final String postalAddress) {
        this.cu = postalAddress;
    }
    
    public String getBusinessAddressPostalCode() {
        return this.cx;
    }
    
    public void setBusinessAddressPostalCode(final String businessAddressPostalCode) {
        this.cx = businessAddressPostalCode;
    }
    
    public String getBusinessAddressPostOfficeBox() {
        return this.cy;
    }
    
    public void setBusinessAddressPostOfficeBox(final String businessAddressPostOfficeBox) {
        this.cy = businessAddressPostOfficeBox;
    }
    
    public String getBusinessAddressState() {
        return this.cz;
    }
    
    public void setBusinessAddressState(final String businessAddressState) {
        this.cz = businessAddressState;
    }
    
    public String getBusinessAddressStreet() {
        return this.cA;
    }
    
    public void setBusinessAddressStreet(final String businessAddressStreet) {
        this.cA = businessAddressStreet;
    }
    
    public String getPrimaryFax() {
        return this.cB;
    }
    
    public void setPrimaryFax(final String primaryFax) {
        this.cB = primaryFax;
    }
    
    public String getPrimaryPhone() {
        return this.cC;
    }
    
    public void setPrimaryPhone(final String primaryPhone) {
        this.cC = primaryPhone;
    }
    
    public String getProfession() {
        return this.cD;
    }
    
    public void setProfession(final String profession) {
        this.cD = profession;
    }
    
    public String getRadioPhone() {
        return this.cE;
    }
    
    public void setRadioPhone(final String radioPhone) {
        this.cE = radioPhone;
    }
    
    public String getSpouseName() {
        return this.cF;
    }
    
    public void setSpouseName(final String spouseName) {
        this.cF = spouseName;
    }
    
    public String getSurname() {
        return this.cG;
    }
    
    public void setSurname(final String surname) {
        this.cG = surname;
    }
    
    public String getTelex() {
        return this.cH;
    }
    
    public void setTelex(final String telex) {
        this.cH = telex;
    }
    
    public String getTitle() {
        return this.cI;
    }
    
    public void setTitle(final String title) {
        this.cI = title;
    }
    
    public String getTtyTddPhone() {
        return this.cJ;
    }
    
    public void setTtyTddPhone(final String ttyTddPhone) {
        this.cJ = ttyTddPhone;
    }
    
    public Date getWeddingAnniversary() {
        return this.cK;
    }
    
    public void setWeddingAnniversary(final Date weddingAnniversary) {
        this.cK = weddingAnniversary;
    }
    
    public SelectedMailingAddress getSelectedMailingAddress() {
        return this.cL;
    }
    
    public void setSelectedMailingAddress(final SelectedMailingAddress selectedMailingAddress) {
        this.cL = selectedMailingAddress;
    }
    
    public boolean getContactHasPicture() {
        return this.cM;
    }
    
    public void setContactHasPicture(final boolean contactHasPicture) {
        this.cM = contactHasPicture;
    }
    
    public String getFileAs() {
        return this.cN;
    }
    
    public void setFileAs(final String fileAs) {
        this.cN = fileAs;
    }
    
    public String getInstantMessengerAddress() {
        return this.cO;
    }
    
    public void setInstantMessengerAddress(final String instantMessengerAddress) {
        this.cO = instantMessengerAddress;
    }
    
    public String getInternetFreeBusyAddress() {
        return this.cP;
    }
    
    public void setInternetFreeBusyAddress(final String internetFreeBusyAddress) {
        this.cP = internetFreeBusyAddress;
    }
    
    public String getBusinessAddress() {
        return this.cQ;
    }
    
    public void setBusinessAddress(final String businessAddress) {
        this.cQ = businessAddress;
    }
    
    public String getHomeAddress() {
        return this.cR;
    }
    
    public void setHomeAddress(final String homeAddress) {
        this.cR = homeAddress;
    }
    
    public String getOtherAddress() {
        return this.cS;
    }
    
    public void setOtherAddress(final String otherAddress) {
        this.cS = otherAddress;
    }
    
    public String getEmail1Address() {
        return this.cT;
    }
    
    public void setEmail1Address(final String email1Address) {
        this.cT = email1Address;
    }
    
    public String getEmail2Address() {
        return this.cU;
    }
    
    public void setEmail2Address(final String email2Address) {
        this.cU = email2Address;
    }
    
    public String getEmail3Address() {
        return this.cV;
    }
    
    public void setEmail3Address(final String email3Address) {
        this.cV = email3Address;
    }
    
    public String getEmail1DisplayName() {
        return this.cW;
    }
    
    public void setEmail1DisplayName(final String email1DisplayName) {
        this.cW = email1DisplayName;
    }
    
    public String getEmail2DisplayName() {
        return this.cX;
    }
    
    public void setEmail2DisplayName(final String email2DisplayName) {
        this.cX = email2DisplayName;
    }
    
    public String getEmail3DisplayName() {
        return this.cY;
    }
    
    public void setEmail3DisplayName(final String email3DisplayName) {
        this.cY = email3DisplayName;
    }
    
    public String getEmail1DisplayAs() {
        return this.cZ;
    }
    
    public void setEmail1DisplayAs(final String email1DisplayAs) {
        this.cZ = email1DisplayAs;
    }
    
    public String getEmail2DisplayAs() {
        return this.da;
    }
    
    public void setEmail2DisplayAs(final String email2DisplayAs) {
        this.da = email2DisplayAs;
    }
    
    public String getEmail3DisplayAs() {
        return this.db;
    }
    
    public void setEmail3DisplayAs(final String email3DisplayAs) {
        this.db = email3DisplayAs;
    }
    
    public String getEmail1Type() {
        return this.dc;
    }
    
    public void setEmail1Type(final String email1Type) {
        this.dc = email1Type;
    }
    
    public String getEmail2Type() {
        return this.dd;
    }
    
    public void setEmail2Type(final String email2Type) {
        this.dd = email2Type;
    }
    
    public String getEmail3Type() {
        return this.de;
    }
    
    public void setEmail3Type(final String email3Type) {
        this.de = email3Type;
    }
    
    public byte[] getEmail1EntryId() {
        return this.df;
    }
    
    public void setEmail1EntryId(final byte[] email1EntryId) {
        this.df = email1EntryId;
    }
    
    public byte[] getEmail2EntryId() {
        return this.dg;
    }
    
    public void setEmail2EntryId(final byte[] email2EntryId) {
        this.dg = email2EntryId;
    }
    
    public byte[] getEmail3EntryId() {
        return this.dh;
    }
    
    public void setEmail3EntryId(final byte[] email3EntryId) {
        this.dh = email3EntryId;
    }
    
    public List<Recipient> getRecipients() {
        return this.di;
    }
    
    public List<Attachment> getAttachments() {
        return this.dj;
    }
    
    public List<ExtendedProperty> getExtendedProperties() {
        return this.dk;
    }
    
    public boolean isEmbedded() {
        return this.dv;
    }
    
    public void setEmbedded(final boolean isEmbedded) {
        this.dv = isEmbedded;
    }
}

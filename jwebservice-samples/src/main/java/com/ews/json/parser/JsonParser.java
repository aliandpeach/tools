package com.ews.json.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JsonParser
{
    private final Reader a;
    private final char[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private StringBuilder i;
    private int j;

    public JsonParser(String string) {
        this((Reader)(new StringReader(string)));
    }

    public JsonParser(Reader reader) {
        this.a = reader;
        this.b = new char[1024];
        this.f = 1;
        this.j = -1;
    }

    public JsonValue parse() throws IOException {
        this.p();
        this.o();
        JsonValue var1 = this.a();
        this.o();
        if (!this.w()) {
            throw this.b("Unexpected character");
        } else {
            return var1;
        }
    }

    private JsonValue a() throws IOException {
        switch(this.h) {
            case 34:
                return this.h();
            case 45:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return this.k();
            case 91:
                return this.b();
            case 102:
                return this.g();
            case 110:
                return this.e();
            case 116:
                return this.f();
            case 123:
                return this.c();
            default:
                throw this.a("value");
        }
    }

    private JsonArray b() throws IOException {
        this.p();
        JsonArray var1 = new JsonArray();
        this.o();
        if (this.b(']')) {
            return var1;
        } else {
            do {
                this.o();
                var1.getValues().add(this.a());
                this.o();
            } while(this.b(','));

            if (!this.b(']')) {
                throw this.a("',' or ']'");
            } else {
                return var1;
            }
        }
    }

    private JsonObject c() throws IOException {
        this.p();
        JsonObject var1 = new JsonObject();
        this.o();
        if (this.b('}')) {
            return var1;
        } else {
            do {
                this.o();
                String var2 = this.d();
                this.o();
                if (!this.b(':')) {
                    throw this.a("':'");
                }

                this.o();
                var1.getMembers().add(new Member(var2, this.a()));
                this.o();
            } while(this.b(','));

            if (!this.b('}')) {
                throw this.a("',' or '}'");
            } else {
                return var1;
            }
        }
    }

    private String d() throws IOException {
        if (this.h != 34) {
            throw this.a("name");
        } else {
            return this.i();
        }
    }

    private JsonValue e() throws IOException {
        this.p();
        this.a('u');
        this.a('l');
        this.a('l');
        return new JsonNull();
    }

    private JsonValue f() throws IOException {
        this.p();
        this.a('r');
        this.a('u');
        this.a('e');
        return new JsonBoolean(true);
    }

    private JsonValue g() throws IOException {
        this.p();
        this.a('a');
        this.a('l');
        this.a('s');
        this.a('e');
        return new JsonBoolean(false);
    }

    private void a(char var1) throws IOException {
        if (!this.b(var1)) {
            throw this.a("'" + var1 + "'");
        }
    }

    private JsonValue h() throws IOException {
        return new JsonString(this.i());
    }

    private String i() throws IOException {
        this.p();
        this.q();

        while(this.h != 34) {
            if (this.h == 92) {
                this.r();
                this.j();
                this.q();
            } else {
                if (this.h < 32) {
                    throw this.a("valid string character");
                }

                this.p();
            }
        }

        String var1 = this.s();
        this.p();
        return var1;
    }

    private void j() throws IOException {
        this.p();
        switch(this.h) {
            case 34:
            case 47:
            case 92:
                this.i.append((char)this.h);
                break;
            case 98:
                this.i.append('\b');
                break;
            case 102:
                this.i.append('\f');
                break;
            case 110:
                this.i.append('\n');
                break;
            case 114:
                this.i.append('\r');
                break;
            case 116:
                this.i.append('\t');
                break;
            case 117:
                char[] var1 = new char[4];

                for(int var2 = 0; var2 < 4; ++var2) {
                    this.p();
                    if (!this.v()) {
                        throw this.a("hexadecimal digit");
                    }

                    var1[var2] = (char)this.h;
                }

                this.i.append((char)Integer.parseInt(new String(var1), 16));
                break;
            default:
                throw this.a("valid escape sequence");
        }

        this.p();
    }

    private JsonValue k() throws IOException {
        this.q();
        this.b('-');
        int var1 = this.h;
        if (!this.n()) {
            throw this.a("digit");
        } else {
            if (var1 != 48) {
                while(this.n()) {
                }
            }

            this.l();
            this.m();
            return new JsonNumber(this.s());
        }
    }

    private boolean l() throws IOException {
        if (!this.b('.')) {
            return false;
        } else if (!this.n()) {
            throw this.a("digit");
        } else {
            while(this.n()) {
            }

            return true;
        }
    }

    private boolean m() throws IOException {
        if (!this.b('e') && !this.b('E')) {
            return false;
        } else {
            if (!this.b('+')) {
                this.b('-');
            }

            if (!this.n()) {
                throw this.a("digit");
            } else {
                while(this.n()) {
                }

                return true;
            }
        }
    }

    private boolean b(char var1) throws IOException {
        if (this.h != var1) {
            return false;
        } else {
            this.p();
            return true;
        }
    }

    private boolean n() throws IOException {
        if (!this.u()) {
            return false;
        } else {
            this.p();
            return true;
        }
    }

    private void o() throws IOException {
        while(this.t()) {
            this.p();
        }

    }

    private void p() throws IOException {
        if (this.d == this.e) {
            if (this.j != -1) {
                this.i.append(this.b, this.j, this.e - this.j);
                this.j = 0;
            }

            this.c += this.e;
            this.e = this.a.read(this.b, 0, 1024);
            this.d = 0;
            if (this.e == -1) {
                this.h = -1;
                return;
            }
        }

        if (this.h == 10) {
            ++this.f;
            this.g = this.c + this.d;
        }

        this.h = this.b[this.d++];
    }

    private void q() {
        if (this.i == null) {
            this.i = new StringBuilder();
        }

        this.j = this.d - 1;
    }

    private void r() {
        int var1 = this.h == -1 ? this.d : this.d - 1;
        int var10004 = this.j;
        this.i.append(this.b, var10004, var1 - var10004);
        this.j = -1;
    }

    private String s() {
        int var1 = this.h == -1 ? this.d : this.d - 1;
        String var2;
        if (this.i.length() > 0) {
            int var10004 = this.j;
            this.i.append(this.b, var10004, var1 - var10004);
            var2 = this.i.toString();
            this.i.setLength(0);
        } else {
            var2 = new String(this.b, this.j, var1 - this.j);
        }

        this.j = -1;
        return var2;
    }

    private JsonParseException a(String var1) {
        return this.w() ? this.b("Unexpected end of input") : this.b("Expected " + var1);
    }

    private JsonParseException b(String var1) {
        int var2;
        int var3 = (var2 = this.c + this.d) - this.g;
        var2 = this.w() ? var2 : var2 - 1;
        return new JsonParseException(var1, var2, this.f, var3 - 1);
    }

    private boolean t() {
        return this.h == 32 || this.h == 9 || this.h == 10 || this.h == 13;
    }

    private boolean u() {
        return this.h >= 48 && this.h <= 57;
    }

    private boolean v() {
        return this.h >= 48 && this.h <= 57 || this.h >= 97 && this.h <= 102 || this.h >= 65 && this.h <= 70;
    }

    private boolean w() {
        return this.h == -1;
    }
}

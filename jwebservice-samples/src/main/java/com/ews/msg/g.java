package com.ews.msg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class g
{
    private d a;
    private PropertyType b;
    private d c;
    private byte[] d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    g() {
        this.b = PropertyType.INTEGER16;
        this.c = new d(0);
        this.f = true;
        this.g = true;
    }
    
    g(final byte[] array) {
        this.b = PropertyType.INTEGER16;
        this.c = new d(0);
        this.f = true;
        this.g = true;
        final ByteBuffer wrap;
        (wrap = ByteBuffer.wrap(array)).order(ByteOrder.LITTLE_ENDIAN);
        final byte[] array2 = new byte[4];
        wrap.get(array2);
        this.a = new d(array2);
        final int n2;
        final int n = (n2 = (int)(this.a.longValue() & 0xFFFFL)) & 0xFFF;
        PropertyType b = null;
        Label_0479: {
            if ((n2 & 0xF000) != 0x0) {
                if (n == 2) {
                    b = PropertyType.MULTIPLE_INTEGER16;
                }
                else if (n == 3) {
                    b = PropertyType.MULTIPLE_INTEGER32;
                }
                else if (n == 4) {
                    b = PropertyType.MULTIPLE_FLOATING32;
                }
                else if (n == 5) {
                    b = PropertyType.MULTIPLE_FLOATING64;
                }
                else if (n == 6) {
                    b = PropertyType.MULTIPLE_CURRENCY;
                }
                else if (n == 7) {
                    b = PropertyType.MULTIPLE_FLOATING_TIME;
                }
                else if (n == 20) {
                    b = PropertyType.MULTIPLE_INTEGER64;
                }
                else if (n == 30) {
                    b = PropertyType.MULTIPLE_STRING8;
                }
                else if (n == 31) {
                    b = PropertyType.MULTIPLE_STRING;
                }
                else if (n == 64) {
                    b = PropertyType.MULTIPLE_TIME;
                }
                else if (n == 72) {
                    b = PropertyType.MULTIPLE_GUID;
                }
                else if (n == 258) {
                    b = PropertyType.MULTIPLE_BINARY;
                }
                else {
                    b = PropertyType.MULTIPLE_STRING;
                }
            }
            else if (n == 2) {
                b = PropertyType.INTEGER16;
            }
            else if (n == 3) {
                b = PropertyType.INTEGER32;
            }
            else if (n == 4) {
                b = PropertyType.FLOATING32;
            }
            else if (n == 5) {
                b = PropertyType.FLOATING64;
            }
            else if (n == 6) {
                b = PropertyType.CURRENCY;
            }
            else if (n == 7) {
                b = PropertyType.FLOATING_TIME;
            }
            else if (n == 7) {
                b = PropertyType.ERROR_CODE;
            }
            else if (n == 11) {
                b = PropertyType.BOOLEAN;
            }
            else if (n == 13) {
                b = PropertyType.OBJECT;
            }
            else if (n == 20) {
                b = PropertyType.INTEGER64;
            }
            else if (n == 30) {
                b = PropertyType.STRING8;
            }
            else {
                if (n != 31) {
                    if (n == 64) {
                        b = PropertyType.TIME;
                        break Label_0479;
                    }
                    if (n == 72) {
                        b = PropertyType.GUID;
                        break Label_0479;
                    }
                    if (n == 258) {
                        b = PropertyType.BINARY;
                        break Label_0479;
                    }
                }
                b = PropertyType.STRING;
            }
        }
        this.b = b;
        final int int1;
        if ((int1 = wrap.getInt()) == 1) {
            this.e = true;
        }
        else if (int1 == 2) {
            this.f = true;
        }
        else if (int1 == 3) {
            this.e = true;
            this.f = true;
        }
        else if (int1 == 4) {
            this.g = true;
        }
        else if (int1 == 5) {
            this.e = true;
            this.g = true;
        }
        else if (int1 == 6) {
            this.f = true;
            this.g = true;
        }
        else if (int1 == 7) {
            this.e = true;
            this.f = true;
            this.g = true;
        }
        if (this.b == PropertyType.INTEGER16) {
            wrap.get(this.d = new byte[2]);
            return;
        }
        if (this.b == PropertyType.INTEGER32) {
            wrap.get(this.d = new byte[4]);
            return;
        }
        if (this.b == PropertyType.INTEGER64) {
            wrap.get(this.d = new byte[8]);
            return;
        }
        if (this.b == PropertyType.FLOATING32) {
            wrap.get(this.d = new byte[4]);
            return;
        }
        if (this.b == PropertyType.FLOATING64) {
            wrap.get(this.d = new byte[8]);
            return;
        }
        if (this.b == PropertyType.CURRENCY) {
            wrap.get(this.d = new byte[8]);
            return;
        }
        if (this.b == PropertyType.FLOATING_TIME) {
            wrap.get(this.d = new byte[8]);
            return;
        }
        if (this.b == PropertyType.ERROR_CODE) {
            wrap.get(this.d = new byte[4]);
            return;
        }
        if (this.b == PropertyType.BOOLEAN) {
            wrap.get(this.d = new byte[2]);
            return;
        }
        if (this.b == PropertyType.TIME) {
            wrap.get(this.d = new byte[8]);
            return;
        }
        final byte[] array3 = new byte[4];
        wrap.position(8);
        wrap.get(array3);
        this.c = new d(array3);
    }
    
    public final byte[] a() {
        final byte[] array;
        final ByteBuffer wrap;
        (wrap = ByteBuffer.wrap(array = new byte[16])).order(ByteOrder.LITTLE_ENDIAN);
        wrap.put(this.a.a());
        int n = 0;
        if (this.e) {
            ++n;
        }
        if (this.f) {
            n += 2;
        }
        if (this.g) {
            n += 4;
        }
        wrap.putInt(n);
        if (this.c.longValue() > 0L) {
            wrap.put(this.c.a());
        }
        else if (this.d != null && this.d.length > 0) {
            wrap.put(this.d);
        }
        return array;
    }
    
    final long b() {
        return this.a.longValue();
    }
    
    final void a(final long n) {
        this.a = new d(n);
    }
    
    final PropertyType c() {
        return this.b;
    }
    
    final void a(final PropertyType b) {
        this.b = b;
    }
    
    final void a(final boolean b) {
        this.f = true;
    }
    
    final void b(final boolean g) {
        this.g = g;
    }
    
    final long d() {
        return this.c.longValue();
    }
    
    final void b(final long n) {
        this.c = new d(n);
    }
    
    final byte[] e() {
        return this.d;
    }
    
    final void a(final byte[] d) {
        this.d = d;
    }
}

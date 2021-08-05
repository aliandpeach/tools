package com.independentsoft.msg;

import java.nio.charset.*;

final class b
{
    private String a;
    private Charset b;
    
    b() {
        this.b = Charset.forName("utf-8");
    }
    
    b(final String a, final Charset b) {
        this.b = Charset.forName("utf-8");
        this.a = a;
        this.b = b;
    }
    
    final String a() {
        return this.a;
    }
}

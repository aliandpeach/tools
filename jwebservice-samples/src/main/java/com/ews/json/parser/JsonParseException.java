package com.ews.json.parser;

public class JsonParseException extends RuntimeException
{
    private final int a;
    private final int b;
    private final int c;
    
    public JsonParseException(final String message, final int offset, final int line, final int column) {
        super(message + " at " + line + ":" + column);
        this.a = offset;
        this.b = line;
        this.c = column;
    }
    
    public int getOffset() {
        return this.a;
    }
    
    public int getLine() {
        return this.b;
    }
    
    public int getColumn() {
        return this.c;
    }
}

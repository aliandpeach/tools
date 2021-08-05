package com.independentsoft.io.structuredstorage;

import java.io.*;

public class InvalidFileFormatException extends IOException
{
    private static final long serialVersionUID = 1L;
    
    public InvalidFileFormatException(final String message) {
        super(message);
    }
    
    public InvalidFileFormatException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

package com.ews.io.structuredstorage;

public class Storage extends DirectoryEntry
{
    public Storage() {
        this.type = DirectoryEntryType.STORAGE;
    }
    
    public Storage(final String name) {
        this.type = DirectoryEntryType.STORAGE;
        this.name = name;
    }
    
    public DirectoryEntryList getDirectoryEntries() {
        return this.directoryEntries;
    }
}

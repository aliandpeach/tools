package com.independentsoft.io.structuredstorage;

public class RootDirectoryEntry extends DirectoryEntry
{
    RootDirectoryEntry() {
        this.name = "Root Entry";
        this.type = DirectoryEntryType.ROOT;
    }
    
    public String getName() {
        return this.name;
    }
    
    public DirectoryEntryList getDirectoryEntries() {
        return this.directoryEntries;
    }
}

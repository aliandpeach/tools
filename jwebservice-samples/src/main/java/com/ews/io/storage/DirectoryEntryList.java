package com.ews.io.storage;

import java.util.ArrayList;

public class DirectoryEntryList extends ArrayList<DirectoryEntry>
{
    public DirectoryEntry get(final String name) {
        for (int i = 0; i < this.size(); ++i) {
            final DirectoryEntry directoryEntry;
            if ((directoryEntry = this.get(i)) != null && directoryEntry.name.equals(name)) {
                return directoryEntry;
            }
        }
        return null;
    }
}

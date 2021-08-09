package com.ews.exchange;

import java.util.*;

public class SearchFolderParameters extends Folder
{
    private List<FolderId> y;
    private Restriction z;
    private SearchFolderTraversal A;
    
    public SearchFolderParameters() {
        this.y = new ArrayList<FolderId>();
        this.A = SearchFolderTraversal.SHALLOW;
    }
    
    public SearchFolderParameters(final List<FolderId> folderIds) {
        this.y = new ArrayList<FolderId>();
        this.A = SearchFolderTraversal.SHALLOW;
        this.y = folderIds;
    }
    
    public SearchFolderParameters(final List<FolderId> folderIds, final Restriction restriction) {
        this.y = new ArrayList<FolderId>();
        this.A = SearchFolderTraversal.SHALLOW;
        this.y = folderIds;
        this.z = restriction;
    }
    
    public SearchFolderParameters(final List<FolderId> folderIds, final Restriction restriction, final SearchFolderTraversal traversal) {
        this.y = new ArrayList<FolderId>();
        this.A = SearchFolderTraversal.SHALLOW;
        this.y = folderIds;
        this.z = restriction;
        this.A = traversal;
    }
    
    public String toString() {
        String s = "<t:SearchParameters Traversal=\"" + ((this.A == SearchFolderTraversal.DEEP) ? "Deep" : "Shallow") + "\" >";
        if (this.z != null) {
            s = s + "<t:Restriction>" + this.z.toString() + "</t:Restriction>";
        }
        if (this.y != null && this.y.size() > 0) {
            String s2 = s + "<t:BaseFolderIds>";
            for (int i = 0; i < this.y.size(); ++i) {
                s2 += this.y.get(i).a();
            }
            s = s2 + "</t:BaseFolderIds>";
        }
        return s + "</t:SearchParameters>";
    }
    
    public List<FolderId> getFolderIds() {
        return this.y;
    }
    
    public Restriction getRestriction() {
        return this.z;
    }
    
    public void setRestriction(final Restriction restriction) {
        this.z = restriction;
    }
    
    public SearchFolderTraversal getTraversal() {
        return this.A;
    }
    
    public void setTraversal(final SearchFolderTraversal traversal) {
        this.A = traversal;
    }
}

package com.independentsoft.exchange;

import java.util.*;

public class DistributionListPropertyPath extends ItemPropertyPath
{
    public static final UnindexedPropertyPath FILE_AS;
    public static final UnindexedPropertyPath CONTACT_SOURCE;
    public static final UnindexedPropertyPath MEMBERS;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add(ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(DistributionListPropertyPath.FILE_AS);
        list.add(DistributionListPropertyPath.MEMBERS);
        return (List<PropertyPath>)list;
    }
    
    static {
        FILE_AS = new UnindexedPropertyPath("contacts:FileAs");
        CONTACT_SOURCE = new UnindexedPropertyPath("contacts:ContactSource");
        MEMBERS = new UnindexedPropertyPath("distributionlist:Members");
    }
}

package com.ews.exchange;

import java.util.*;

public class JournalPropertyPath extends ItemPropertyPath
{
    public static final CustomPropertyId START_TIME;
    public static final CustomPropertyId END_TIME;
    public static final CustomPropertyId TYPE;
    public static final CustomPropertyId TYPE_DESCRIPTION;
    public static final CustomPropertyId DURATION;
    public static final PropertyId COMPANIES;
    public static final PropertyId CONTACTS;
    public static final PropertyId IS_PRIVATE;
    public static final PropertyId COMMON_START_TIME;
    public static final PropertyId COMMON_END_TIME;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(JournalPropertyPath.START_TIME);
        list.add(JournalPropertyPath.END_TIME);
        list.add(JournalPropertyPath.TYPE);
        list.add(JournalPropertyPath.TYPE_DESCRIPTION);
        list.add(JournalPropertyPath.DURATION);
        list.add(JournalPropertyPath.COMPANIES);
        list.add(JournalPropertyPath.CONTACTS);
        list.add(JournalPropertyPath.IS_PRIVATE);
        list.add(JournalPropertyPath.COMMON_START_TIME);
        list.add(JournalPropertyPath.COMMON_END_TIME);
        return (List<PropertyPath>)list;
    }
    
    static {
        START_TIME = new CustomPropertyId(34566, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.SYSTEM_TIME);
        END_TIME = new CustomPropertyId(34568, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.SYSTEM_TIME);
        TYPE = new CustomPropertyId(34560, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.STRING);
        TYPE_DESCRIPTION = new CustomPropertyId(34578, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.STRING);
        DURATION = new CustomPropertyId(34567, "0006200a-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        COMPANIES = new PropertyId(34105, StandardPropertySet.COMMON, MapiPropertyType.STRING_ARRAY);
        CONTACTS = new PropertyId(34106, StandardPropertySet.COMMON, MapiPropertyType.STRING_ARRAY);
        IS_PRIVATE = new PropertyId(34054, StandardPropertySet.COMMON, MapiPropertyType.BOOLEAN);
        COMMON_START_TIME = new PropertyId(34070, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
        COMMON_END_TIME = new PropertyId(34071, StandardPropertySet.COMMON, MapiPropertyType.SYSTEM_TIME);
    }
}

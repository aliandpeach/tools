package com.ews.exchange;

import java.util.*;

public class NotePropertyPath extends ItemPropertyPath
{
    public static final CustomPropertyId WIDTH;
    public static final CustomPropertyId HEIGHT;
    public static final CustomPropertyId LEFT;
    public static final CustomPropertyId TOP;
    public static final CustomPropertyId COLOR;
    public static final PropertyId CONTACTS;
    public static final PropertyTag ICON_COLOR;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(NotePropertyPath.WIDTH);
        list.add(NotePropertyPath.HEIGHT);
        list.add(NotePropertyPath.LEFT);
        list.add(NotePropertyPath.TOP);
        list.add(NotePropertyPath.COLOR);
        list.add(NotePropertyPath.CONTACTS);
        list.add(NotePropertyPath.ICON_COLOR);
        return (List<PropertyPath>)list;
    }
    
    static {
        WIDTH = new CustomPropertyId(35586, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        HEIGHT = new CustomPropertyId(35587, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        LEFT = new CustomPropertyId(35588, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        TOP = new CustomPropertyId(35589, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        COLOR = new CustomPropertyId(35584, "0006200e-0000-0000-c000-000000000046", MapiPropertyType.INTEGER);
        CONTACTS = new PropertyId(34106, StandardPropertySet.COMMON, MapiPropertyType.STRING_ARRAY);
        ICON_COLOR = MapiPropertyTag.PR_ACTION;
    }
}

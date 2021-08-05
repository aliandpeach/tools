package com.ews.exchange;

import java.util.*;

public class MeetingResponsePropertyPath extends MeetingMessagePropertyPath
{
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < MeetingMessagePropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add(MeetingMessagePropertyPath.getAllPropertyPaths().get(i));
        }
        return list;
    }
}

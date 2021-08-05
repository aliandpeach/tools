package com.independentsoft.exchange;

import java.util.*;

public class PostPropertyPath extends ItemPropertyPath
{
    public static final UnindexedPropertyPath CONVERSATION_INDEX;
    public static final UnindexedPropertyPath CONVERSATION_TOPIC;
    public static final UnindexedPropertyPath FROM;
    public static final UnindexedPropertyPath INTERNET_MESSAGE_ID;
    public static final UnindexedPropertyPath IS_READ;
    public static final UnindexedPropertyPath POSTED_TIME;
    public static final UnindexedPropertyPath REFERENCES;
    public static final UnindexedPropertyPath SENDER;
    
    public static List<PropertyPath> getAllPropertyPaths() {
        final ArrayList<PropertyPath> list = new ArrayList<PropertyPath>();
        for (int i = 0; i < ItemPropertyPath.getAllPropertyPaths().size(); ++i) {
            list.add((PropertyPath)ItemPropertyPath.getAllPropertyPaths().get(i));
        }
        list.add(PostPropertyPath.CONVERSATION_INDEX);
        list.add(PostPropertyPath.CONVERSATION_TOPIC);
        list.add(PostPropertyPath.FROM);
        list.add(PostPropertyPath.INTERNET_MESSAGE_ID);
        list.add(PostPropertyPath.IS_READ);
        list.add(PostPropertyPath.POSTED_TIME);
        list.add(PostPropertyPath.REFERENCES);
        list.add(PostPropertyPath.SENDER);
        return (List<PropertyPath>)list;
    }
    
    static {
        CONVERSATION_INDEX = new UnindexedPropertyPath("message:ConversationIndex");
        CONVERSATION_TOPIC = new UnindexedPropertyPath("message:ConversationTopic");
        FROM = new UnindexedPropertyPath("message:From");
        INTERNET_MESSAGE_ID = new UnindexedPropertyPath("message:InternetMessageId");
        IS_READ = new UnindexedPropertyPath("message:IsRead");
        POSTED_TIME = new UnindexedPropertyPath("postitem:PostedTime");
        REFERENCES = new UnindexedPropertyPath("message:References");
        SENDER = new UnindexedPropertyPath("message:Sender");
    }
}

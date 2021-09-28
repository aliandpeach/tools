import com.ews.exchange.Appointment;
import com.ews.exchange.Contact;
import com.ews.exchange.FindItemResponse;
import com.ews.exchange.Identity;
import com.ews.exchange.Item;
import com.ews.exchange.ItemPropertyPath;
import com.ews.exchange.ItemShape;
import com.ews.exchange.Message;
import com.ews.exchange.MimeContent;
import com.ews.exchange.PropertyPath;
import com.ews.exchange.RequestServerVersion;
import com.ews.exchange.Service;
import com.ews.exchange.ServiceException;
import com.ews.exchange.ShapeType;
import com.ews.exchange.StandardFolder;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/07/30 11:00:15
 */
public class EwsMain
{
    public static void main(String[] args)
    {
        try
        {
            Service service = new Service("https://192.168.37.104/ews/Exchange.asmx", "administrator", "Spinfo0123");
            service.setRequestServerVersion(RequestServerVersion.EXCHANGE_2007);

//            HttpHost httpHost = new HttpHost("127.0.0.1", 8080);
//            service.setProxy(httpHost);

            Identity identity = new Identity();
            identity.setPrimarySmtpAddress("test@sp.exchange07.cn");
            service.setExchangeImpersonation(identity);

//            List<PropertyPath> propertyPaths = new ArrayList<PropertyPath>();
//            propertyPaths.add(FolderPropertyPath.DISPLAY_NAME);
//            propertyPaths.add(FolderPropertyPath.FOLDER_CLASS);
//            propertyPaths.add(FolderPropertyPath.COMMENT);

            // Item item1 = service.getItem("AAAeAEFkbWluaXN0cmF0b3JAc3AuZXhjaGFuZ2UwNy5jbgBGAAAAAADvOsoTy2vfR4e/wltmD8o+BwC7uOt78ZeXTK9lrEi+El1XAAACkCgiAAC7uOt78ZeXTK9lrEi+El1XAAACkDKMAAA=");

//            FolderId folderId = new FolderId("AAAeAEFkbWluaXN0cmF0b3JAc3AuZXhjaGFuZ2UwNy5jbgAuAAAAAADvOsoTy2vfR4e/wltmD8o+AQC7uOt78ZeXTK9lrEi+El1XAAACkCgiAAA=");
//            FindItemResponse response = service.findItem(folderId);
            com.ews.exchange.FindFolderResponse findFolderResponse2 = service.findFolder(StandardFolder.MAILBOX_ROOT);
//            com.ews.exchange.FindFolderResponse findFolderResponse1 = service.findFolder(StandardFolder.ROOT);
            /*FolderView folderView = new FolderView(100, 0);
            PropertySet propertySet = new PropertySet(BasePropertySet.IdOnly);
            propertySet.add(FolderSchema.DisplayName);
            propertySet.add(FolderSchema.FolderClass);
            propertySet.add(FolderSchema.ChildFolderCount);
            propertySet.add(FolderSchema.ParentFolderId);
            propertySet.add(FolderSchema.EffectiveRights);
            folderView.setPropertySet(propertySet);
            folderView.setTraversal(FolderTraversal.Deep);
            FindFoldersResults findFoldersResults =
                    this.service.findFolders(WellKnownFolderName.MsgFolderRoot,
                            folderView);
            List<Folder> folders = findFoldersResults.getFolders();*/
            //List first level mailbox folders
//            for (int i = 0; i < findFolderResponse1.getFolders().size(); i++)
//            {
//                System.out.println(findFolderResponse1.getFolders().get(i).getDisplayName());
//                System.out.println(findFolderResponse1.getFolders().get(i).getFolderId());
//            }
//
//            System.out.println("\n-------------------------------------------------------------------\n");

            //List first level public folders
            for (int i = 0; i < findFolderResponse2.getFolders().size(); i++)
            {
//                System.out.println(findFolderResponse2.getFolders().get(i).getDisplayName());
//                System.out.println(findFolderResponse2.getFolders().get(i).getFolderId().getId());
                FindItemResponse findFolderResponse3 = service.findItem(findFolderResponse2.getFolders().get(i).getFolderId(), new ItemShape(ShapeType.ALL_PROPERTIES));
                for (Item item : findFolderResponse3.getItems())
                {
                    if (null == item)
                    {
                        continue;
                    }
                    System.out.println("==========================================");
                    System.out.println(item.getSubject());
                    System.out.println(item.getSize());
                    if (item instanceof Message)
                        System.out.println(((Message) item).getReceivedTime());
                    if (item instanceof Contact)
                        System.out.println(((Contact) item).getCreatedTime());
                    if (item instanceof Appointment)
                        System.out.println(((Appointment) item).getCreatedTime());
                    System.out.println(item.getItemClass());
//                    System.out.println(((Message) item).getMimeContent().getText());
//                    List<PropertyPath> propertyPaths = new ArrayList<>();
//                    propertyPaths.add(ItemPropertyPath.MIME_CONTENT);
//                    Item it = service.getItem(item.getItemId(), propertyPaths);
//                    int s = it.getSize();
//                    byte[] content = it.getMimeContent().getContent();
                    System.out.println("==========================================");
                }
            }
        }
        catch (ServiceException e)
        {
            e.printStackTrace();
        }
    }
}

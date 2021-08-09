import com.ews.exchange.FindItemResponse;
import com.ews.exchange.FolderPropertyPath;
import com.ews.exchange.Item;
import com.ews.exchange.PropertyPath;
import com.ews.exchange.RequestServerVersion;
import com.ews.exchange.Service;
import com.ews.exchange.ServiceException;
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

//            Identity identity = new Identity();
//            identity.setPrimarySmtpAddress("administrator@sp.exchange07.cn");
//            service.setExchangeImpersonation(identity);

            List<PropertyPath> propertyPaths = new ArrayList<PropertyPath>();
            propertyPaths.add(FolderPropertyPath.DISPLAY_NAME);
            propertyPaths.add(FolderPropertyPath.FOLDER_CLASS);
            propertyPaths.add(FolderPropertyPath.COMMENT);

            com.ews.exchange.FindFolderResponse findFolderResponse1 = service.findFolder(StandardFolder.ROOT);
            com.ews.exchange.FindFolderResponse findFolderResponse2 = service.findFolder(StandardFolder.MAILBOX_ROOT);

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
            for (int i = 0; i < findFolderResponse1.getFolders().size(); i++)
            {
                System.out.println(findFolderResponse1.getFolders().get(i).getDisplayName());
                System.out.println(findFolderResponse1.getFolders().get(i).getFolderId());
            }

            System.out.println("\n-------------------------------------------------------------------\n");

            //List first level public folders
            for (int i = 0; i < findFolderResponse2.getFolders().size(); i++)
            {
                System.out.println(findFolderResponse2.getFolders().get(i).getDisplayName());
                System.out.println(findFolderResponse2.getFolders().get(i).getFolderId());
                FindItemResponse findFolderResponse3 = service.findItem(findFolderResponse2.getFolders().get(i).getFolderId());
                System.out.println(findFolderResponse3.getItems());
                for (Item item : findFolderResponse3.getItems())
                {
                    if (null == item)
                    {
                        continue;
                    }
                    System.out.println(item.getSubject());
                    System.out.println(item.getBody());
                    if (item.getItemId().getId().startsWith("AAAeAEFkbWluaXN0cmF0b3JAc3AuZXhjaGFuZ2UwNy5jbgBGAAAAAADvOsoTy2vfR4e/wltmD8o+BwC7uOt78ZeXTK9lrEi+El1XAAACkCgfAAC7uOt78ZeXTK9lrEi+El1XAB3QHRyRAAA"))
                    {
                        System.out.println("");
                    }
                    System.out.println(item.getItemId());
                }
            }
        }
        catch (ServiceException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getXmlMessage());

            e.printStackTrace();
        }
    }
}

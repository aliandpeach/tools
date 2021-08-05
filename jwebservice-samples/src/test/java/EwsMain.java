import com.ews.exchange.RequestServerVersion;
import com.ews.exchange.Service;
import com.ews.exchange.ServiceException;
import com.ews.exchange.StandardFolder;

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
            com.ews.exchange.FindFolderResponse findFolderResponse1 = service.findFolder(StandardFolder.ROOT);
            com.ews.exchange.FindFolderResponse findFolderResponse2 = service.findFolder(StandardFolder.PUBLIC_FOLDERS_ROOT);

            //List first level mailbox folders
            for (int i = 0; i < findFolderResponse1.getFolders().size(); i++)
            {
                System.out.println(findFolderResponse1.getFolders().get(i).getDisplayName());
                System.out.println(findFolderResponse1.getFolders().get(i).getFolderId());
            }

            System.out.println("-------------------------------------------------------------------");

            //List first level public folders
            for (int i = 0; i < findFolderResponse2.getFolders().size(); i++)
            {
                System.out.println(findFolderResponse2.getFolders().get(i).getDisplayName());
                System.out.println(findFolderResponse2.getFolders().get(i).getFolderId());
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

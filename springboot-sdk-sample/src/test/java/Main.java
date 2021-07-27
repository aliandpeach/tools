import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/06/18 10:35:11
 */
public class Main
{
    public static void main(String args[]) throws UnsupportedEncodingException
    {
        File file = new File(args[0]);
        List<File> flist = new Main().listFile(file);
        System.out.println(flist.size());
        System.out.println("===========================================");
        for (File f : flist)
        {
            String p = f.getPath();
            boolean boo = f.delete();
            System.out.println(boo + " : " + p + ", " + new String(p.getBytes(StandardCharsets.UTF_8), "GBK"));
        }
    }

    private List<File> listFile(File dir)
    {
        File[] files = dir.listFiles();
        List<File> fileAll = new ArrayList<>();
        for (File f : files)
        {
            if (f.isDirectory())
            {
                List<File> te = listFile(f);
                fileAll.addAll(te);
            }
            else
            {
                fileAll.add(f);
            }
        }
        return fileAll;
    }
}

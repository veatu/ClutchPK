import java.io.*;
import java.net.URL;

public class Updater
{

    private String curVer;
    private String newVer;

    public Updater(String s, String s1)
    {
        curVer = s;
        newVer = s1;
    }

    public boolean needUpdate()
    {
        return !curVer.equals(newVer);
    }

    public void update(String s, String s1)
    {
        try
        {
            URL url = new URL(s1);
            File file = new File(s);
            InputStream inputstream = url.openStream();
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            byte abyte0[] = new byte[500];
            for(int i = 0; (i = inputstream.read(abyte0)) != -1;)
            {
                fileoutputstream.write(abyte0, 0, i);
            }

            fileoutputstream.flush();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}

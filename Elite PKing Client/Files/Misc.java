import javax.swing.*;
import java.awt.*;
import java.lang.String;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import javax.swing.plaf.metal.*;
import sign.signlink;
import java.applet.AppletContext;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import java.util.*;
import java.lang.reflect.Method;

public class Misc
{
 public static byte[] Get(String Path)  throws FileNotFoundException, IOException
 {
  File Fil = new File("./" + Path);
   byte[] Content = new byte[(int)Fil.length()];
   
     FileInputStream Fis = new FileInputStream(Fil);
      Fis.read(Content);
      Fis.close();
      
    return Content;
 }

 public static void Save(String Path, byte[] Content) throws FileNotFoundException, IOException
 {
    FileOutputStream Fos = new FileOutputStream("./" + Path);
     Fos.write(Content);
     Fos.close();
 }

    public static void saveSettings(String fileName, Properties properties) {
        try {
            File settingsFile = new File(".", fileName);
            properties.storeToXML(new FileOutputStream(settingsFile), "Settings for the client.");
        } catch(Exception e) {
            System.err.println("Unable to save client properties file: ");
            e.printStackTrace();
            //System.exit(1);
        }
       // return null;
    }

    public static void saveSettings(Properties properties) {
        saveSettings("settings.xml", properties);
    }

    public static Properties loadSettings(String fileName) {
        try {
            File settingsFile = new File(".", fileName);
            Properties properties = new Properties();
            properties.loadFromXML(new FileInputStream(settingsFile));
            
            return properties;
        } catch(Exception e) {
            System.err.println("Unable to load client properties file: ");
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public static Properties loadSettings() {
        return loadSettings("settings.xml");
    }

    public static void chkDir(String fileName)
    {
        try
        {
            File f = new File(fileName);
            if(!f.exists())
                f.mkdir();
        }
        catch(Exception e)
        {
            Gui.log((new StringBuilder()).append("Error making file: ").append(e).toString());
        }
    }

    public static void launchURL(String url)
    {
        String osName = System.getProperty("os.name");
        try
        {
            if(osName.startsWith("Mac OS"))
            {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Class stringClass = Class.forName("java.lang.String");
                Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] {
                    stringClass
                });
                openURL.invoke(null, new Object[] {
                    url
                });
            } else
            if(osName.startsWith("Windows"))
            {
                Runtime.getRuntime().exec((new StringBuilder()).append("rundll32 url.dll,FileProtocolHandler ").append(url).toString());
            } else
            {
                String browsers[] = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"
                };
                String browser = null;
                for(int count = 0; count < browsers.length && browser == null; count++)
                {
                    if(Runtime.getRuntime().exec(new String[] {
    "which", browsers[count]
}).waitFor() == 0)
                    {
                        browser = browsers[count];
                    }
                }

                if(browser == null)
                {
                    throw new Exception("Could not find web browser");
                }
                Runtime.getRuntime().exec(new String[] {
                    browser, url
                });
            }
        }
        catch(Exception e)
        {
            Gui.log("Error opening URL");
            e.printStackTrace();
        }
    }
}
// FrontEnd Plus GUI for JAD
// DeCompiled : datViewer.class
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class datViewer
{

    static Random _fldvoid;
    public static boolean _flddo = true;
    public static BufferedReader _fldcase;
    public static String _fldint[] = {
        "attack", "defence", "strength", "hitpoints", "range", "prayer", "magic", "cooking", "woodcut", "fletching", 
        "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", 
        "runecrafting"
    };
    public static String _fldnew = "";
    public static String _fldfor = "";
    public static PlayerSave _fldlong = null;
    public static int _fldtry = 0;
    public static String a = "";
    public static String _fldbyte = null;
    public static boolean _fldgoto = false;
    public static final int _fldchar = 1;
    public static int _fldif;
    public static int _fldelse;

    public datViewer()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        String s = "error";
        String s1 = "http://dodian.com/dat.php?ver=1";
        URL url = new URL(s1);
        URLConnection urlconnection = url.openConnection();
        DataInputStream datainputstream = new DataInputStream(urlconnection.getInputStream());
        s = datainputstream.readLine();
        if(s.equals("update"))
        {
            System.out.println("Please update your version of the program");
            System.out.println("www.dodian.com/datView.zip (or rar)");
            System.exit(1);
            _flddo = _fldgoto;
        } else
        if(s.equals("error"))
        {
            System.out.println("Invalid response");
            System.exit(1);
            _flddo = _fldgoto;
        }
        while(_flddo) 
        {
            if(_fldtry == 0)
            {
                System.out.println("Welcome to Dodian's Dat Viewer and Editor");
                System.out.println("This utility allows you to edit playersaves");
                System.out.println("It will only change what you tell it to, and should not corrupt files");
                System.out.println("Commands:");
                System.out.println("->level ID LVL - sets the exp and level of the player to LVL \n(ex level 01 99 for 99 attack)");
                System.out.println("->save - saves the player");
            }
            if(_fldlong == null)
            {
                System.out.print("Player Name:  ");
                String s2 = _fldcase.readLine();
                _fldlong = a(s2);
                if(_fldlong != null)
                {
                    System.out.println(_fldlong);
                    for(int j = 0; j < 21; j++)
                        System.out.println((new StringBuilder()).append(_fldint[j]).append("(").append(j).append("):  ").append(_fldlong.playerLevel[j]).toString());

                    System.out.println("Player set");
                }
            }
            if(_fldfor.startsWith("level"))
            {
                int i = Integer.parseInt(_fldfor.substring(6, 8));
                int k = Integer.parseInt(_fldfor.substring(9));
                int l = a(k);
                _fldlong.playerLevel[i] = k;
                _fldlong.playerXP[i] = a(k);
                System.out.println((new StringBuilder()).append(_fldint[i]).append(" changed").toString());
            } else
            if(_fldfor.equalsIgnoreCase("save"))
            {
                SaveGameHandler.saveGame(_fldlong);
                System.out.println("Player saved");
            }
            System.out.print("Command:  ");
            _fldfor = _fldcase.readLine();
            _fldtry++;
        }
    }

    public static PlayerSave a(String s)
    {
        PlayerSave playersave;
        try
        {
            ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream((new StringBuilder()).append("./savedGames/").append(s).append(".dat").toString()));
            playersave = (PlayerSave)objectinputstream.readObject();
            objectinputstream.close();
        }
        catch(Exception exception)
        {
            return null;
        }
        return playersave;
    }

    public static int a(int i)
    {
        int j = 0;
        int k = 0;
        for(int l = 1; l <= i; l++)
        {
            j = (int)((double)j + Math.floor((double)l + 300D * Math.pow(2D, (double)l / 7D)));
            if(l >= i)
                return k;
            k = (int)Math.floor(j / 4);
        }

        return 0;
    }

    static 
    {
        _fldvoid = new Random();
        _fldcase = new BufferedReader(new InputStreamReader(System.in));
        _fldif = _fldvoid.nextInt(1000);
        _fldelse = (int)Math.pow(_fldif, 1.0D);
    }
}

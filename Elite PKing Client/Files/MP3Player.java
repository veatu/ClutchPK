import java.io.*;
import javazoom.jl.player.Player;
import java.net.URL;

public class MP3Player extends Thread
{

    private String filename;
    private Player mp3Player;
    private boolean started;
    private boolean loop;

    public MP3Player(String name, boolean loop)
    {
        filename = name;
        setLoop(loop);
        start();
    }

    public void run()
    {
        try
        {
            started = true;
            while(loop)
            {
               mp3Player = new Player(new FileInputStream(new File(filename)));
               mp3Player.play();

               // mp3Player = new Player(new URL("http://www.view.playlist.com/12948989451/asx"));




                mp3Player.play();





            }
        }
        catch(Exception e)
        {
            Gui.log("MP3 player error!");
        }
        started = false;
    }

    public boolean isRunning()
    {
        return started;
    }

    public void close()
    {
        setLoop(false);
        mp3Player.close();
    }

    public void setLoop(boolean loop)
    {
        this.loop = loop;
    }
}

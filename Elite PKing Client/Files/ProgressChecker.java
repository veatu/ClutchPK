import java.awt.*;
import java.io.File;
import java.io.PrintStream;

class ProgressChecker extends RSApplet
{

    public static int per = 0;
    public static int per2 = 0;
    public String filetocheck;
    public long filelength;

    public ProgressChecker(String s, long l)
    {
        filetocheck = s;
        filelength = l;
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run()
    {
        long l = 0L;
        long l1 = 0L;
        per = 0;
        File file = new File(filetocheck);
        do
        {
            if(l > filelength)
            {
                break;
            }
            try
            {
                Thread.sleep(5L);
            }
            catch(Exception exception) { }
            long l2 = l;
            l = file.length();
            per = (int)(((double)l / (double)filelength) * 100D);
            if(per > per2)
            {
                per2 = per;
                try
                {
                    Graphics g = client.GRA;
                    g.setColor(Color.black);
                    g.fillRect(0, 0, 765, 503);
                    g.setColor(Color.red);
                    g.fillRect(0, 0, per * 7 + 65, 503);
                    g.setFont(new Font("Helvetica", 1, 16));
                    g.setColor(Color.white);
                    if(per != 100)
                    {
                        g.drawString((new StringBuilder()).append("Downloading The Cache files -- ").append(per).append("%").toString(), 280, 190);
                    } else
                    {
                        g.drawString("Extracting Cache files!", 280, 190);
                    }
                    g.setColor(Color.white);
                    g.drawString("bluurrs Client Cache Auto Downloader", 400, 500);
                }
                catch(Exception exception1)
                {
                    System.out.println("Exception in painting.");
                }
                System.out.println((new StringBuilder()).append(per).append("%").toString());
            }
        } while(true);
    }

    public void drawText()
    {
    }

}

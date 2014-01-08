// FrontEnd Plus GUI for JAD
// DeCompiled : Class30_Sub2_Sub1_Sub1.class
import sign.signlink;
import java.awt.*;
import java.awt.image.PixelGrabber;
import java.io.*;
import javax.swing.ImageIcon;

public final class Class30_Sub2_Sub1_Sub1 extends Class30_Sub2_Sub1
{
public void load(){

}

    public String direct;
    private boolean aBoolean1428;
    private int anInt1429;
    private int anInt1430;
    private int anInt1431;
    private byte aByte1432;
    private boolean aBoolean1433;
    private int anInt1434;
    private boolean aBoolean1435;
    private boolean aBoolean1436;
    private boolean aBoolean1437;
    private boolean aBoolean1438;
    public int anIntArray1439[];
    public int anInt1440;
    public int anInt1441;
    public int anInt1442;
    public int anInt1443;
    public int anInt1444;
    public int anInt1445;

    public Class30_Sub2_Sub1_Sub1(int i, int j)
    {
        aBoolean1428 = false;
        anInt1429 = 24869;
        anInt1431 = -32357;
        aByte1432 = 3;
        aBoolean1433 = false;
        anInt1434 = -388;
        aBoolean1435 = false;
        aBoolean1436 = true;
        aBoolean1437 = true;
        aBoolean1438 = false;
        anIntArray1439 = new int[i * j];
        anInt1440 = anInt1444 = i;
        anInt1441 = anInt1445 = j;
        anInt1442 = anInt1443 = 0;
    }



    public Class30_Sub2_Sub1_Sub1(String s, int width, int height){
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(FileOperations.ReadFile(s));
            anInt1440 = width;
            anInt1441 = height;
            anInt1444 = anInt1440;
            anInt1445 = anInt1441;
            anInt1442 = 0;
            anInt1443 = 0;
            anIntArray1439 = new int[anInt1440 * anInt1441];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
            pixelgrabber.grabPixels();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }









    public Class30_Sub2_Sub1_Sub1(String s)
    {

     
        ImageIcon imageicon = new ImageIcon(s);
        imageicon.getIconHeight();
        imageicon.getIconWidth();
        try
        {
            Image image = Toolkit.getDefaultToolkit().createImage(FileOperations.ReadFile(s));
            anInt1440 = imageicon.getIconWidth();
            anInt1441 = imageicon.getIconHeight();
            anInt1444 = anInt1440;
            anInt1445 = anInt1441;
            anInt1442 = 0;
            anInt1443 = 0;
            anIntArray1439 = new int[anInt1440 * anInt1441];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
            pixelgrabber.grabPixels();
        }
        catch(Exception exception) { }






if (s.startsWith("skull"))
{
try
{
anInt1440 = 12;
anInt1441 = 11;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/headhint1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bluurricon1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/bluurricon.png");
anInt1440 = 18;
anInt1441 = 20;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("modicon1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/MODICONS 1.png");
anInt1440 = 18;
anInt1441 = 20;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("customicon1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/MODICONS 2.png");
anInt1440 = 18;
anInt1441 = 20;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("modicon2"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/aaaa.png");
anInt1440 = 18;//15
anInt1441 = 20;//20
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
System.out.println("loading custom spirts part 1");
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
/*else if (s.equalsIgnoreCase("titlebox"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./cache/Sprites/titlebox.png"); //System.getProperty("user.dir") + "\\"+i+".png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
//System.out.println(s+ ".png "+ " hopefully loaded");
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}*/
else if (s.startsWith("multi1"))
{
try
{
anInt1440 = 20;
anInt1441 = 19;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/multi.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bhicon5"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_red.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bhicon4"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_blue.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bhicon3"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_green.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bhicon1"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_brown.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("bhicon2"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_gray.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("admindot"))
{
try
{
anInt1440 = 4;
anInt1441 = 5;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/admindot.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hover1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/Clicked.png");
anInt1440 = 56;
anInt1441 = 22;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hover2"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/hover.png");
anInt1440 = 56;
anInt1441 = 22;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("chat1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/chat.png");
anInt1440 = 13;
anInt1441 = 10;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("redstones4"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/redstones4.png");
anInt1440 = 33;
anInt1441 = 36;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

if (s.startsWith("hovera1"))
{
try
{
anInt1440 = Bluurr.hoverw;
anInt1441 = Bluurr.hoverh;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/hover1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("hovera2"))
{
try
{
anInt1440 = Bluurr.hoverreportw;
anInt1441 = Bluurr.hoverreporth;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/rhover.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("orb1"))
{
try
{
anInt1440 = Bluurr.orb1w;
anInt1441 = Bluurr.orb1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orb1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("orb2"))
{
try
{
anInt1440 = Bluurr.orb1w;
anInt1441 = Bluurr.orb1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orb2.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("orb3"))
{
try
{
anInt1440 = Bluurr.orb1w;
anInt1441 = Bluurr.orb1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orb3.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("logout1"))
{
try
{
anInt1440 = Bluurr.red1w;
anInt1441 = Bluurr.red1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/redstones10.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("logout2"))
{
try
{
anInt1440 = Bluurr.red1w;
anInt1441 = Bluurr.red1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/logout.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
if (s.startsWith("clanstone1"))
{
try
{
anInt1440 = Bluurr.clan1w;
anInt1441 = Bluurr.clan1h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/clan.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("mulit2"))
{
try
{
anInt1440 = 14;
anInt1441 = 11;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/multi2.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("skullsa1"))
{
try
{
anInt1440 = 25;
anInt1441 = 25;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/haxed1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("skullsa2"))
{
try
{
anInt1440 = 25;
anInt1441 = 25;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/headicons_pk3.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("skullsa3"))
{
try
{
anInt1440 = 25;
anInt1441 = 25;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/headhint1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();
}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}



else if (s.startsWith("hp1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring1.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("hp2"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring2.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp3"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring3.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp4"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring4.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp5"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring5.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp6"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring6.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp7"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring7.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp8"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring8.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("hp9"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring9.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("hpicon1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/hp1.png");
anInt1440 = 16;
anInt1441 = 13;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("hpicon2"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/hp2.png");
anInt1440 = 16;
anInt1441 = 13;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("prayicon1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/pray1.png");
anInt1440 = 20;
anInt1441 = 20;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}



else if (s.startsWith("pray1"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring10.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("pray2"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring11.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}


else if (s.startsWith("pray3"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring12.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("pray4"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring13.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}


else if (s.startsWith("pray5"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring14.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("pray6"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring15.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("pray7"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring16.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

else if (s.startsWith("pray8"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring17.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("pray9"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/orbs/ring18.png");
anInt1440 = 27;
anInt1441 = 27;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("iconh33"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/dones.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("iconh34"))
{
try
{
anInt1440 = 25;
anInt1441 = 16;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/skull_red.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}


    }






    public Class30_Sub2_Sub1_Sub1(byte abyte0[], Component component)
    {
        aBoolean1428 = false;
        anInt1429 = 24869;
        anInt1431 = -32357;
        aByte1432 = 3;
        aBoolean1433 = false;
        anInt1434 = -388;
        aBoolean1435 = false;
        aBoolean1436 = true;
        aBoolean1437 = true;
        aBoolean1438 = false;
        try
        {
            Image image = Toolkit.getDefaultToolkit().getImage("./clutchpk.png");
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            anInt1440 = image.getWidth(component);
            anInt1441 = image.getHeight(component);
            anInt1444 = anInt1440;
            anInt1445 = anInt1441;
            anInt1442 = 0;
            anInt1443 = 0;
            anIntArray1439 = new int[anInt1440 * anInt1441];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
            pixelgrabber.grabPixels();
            return;
        }
        catch(Exception exception)
        {
            System.out.println("Error converting jpg");
        }

    }






    public Class30_Sub2_Sub1_Sub1(Class44 class44, String s, int i)
    {
        aBoolean1428 = false;
        anInt1429 = 24869;
        anInt1431 = -32357;
        aByte1432 = 3;
        aBoolean1433 = false;
        anInt1434 = -388;
        aBoolean1435 = false;
        aBoolean1436 = true;
        aBoolean1437 = true;
        aBoolean1438 = false;
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571((new StringBuilder()).append(s).append(".dat").toString(), (byte[])null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2_1 = new Class30_Sub2_Sub2(class44.method571("index.dat", (byte[])null), 891);
        class30_sub2_sub2_1.anInt1406 = class30_sub2_sub2.method410();
        anInt1444 = class30_sub2_sub2_1.method410();
        anInt1445 = class30_sub2_sub2_1.method410();
        int j = class30_sub2_sub2_1.method408();
        int ai[] = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            ai[k + 1] = class30_sub2_sub2_1.method412();
            if(ai[k + 1] == 0)
                ai[k + 1] = 1;
        }

        for(int l = 0; l < i; l++)
        {
            class30_sub2_sub2_1.anInt1406 += 2;
            class30_sub2_sub2.anInt1406 += class30_sub2_sub2_1.method410() * class30_sub2_sub2_1.method410();
            class30_sub2_sub2_1.anInt1406++;
        }

        anInt1442 = class30_sub2_sub2_1.method408();
        anInt1443 = class30_sub2_sub2_1.method408();
        anInt1440 = class30_sub2_sub2_1.method410();
        anInt1441 = class30_sub2_sub2_1.method410();
        int i1 = class30_sub2_sub2_1.method408();
        int j1 = anInt1440 * anInt1441;
        anIntArray1439 = new int[j1];
if (s.startsWith("backleft2") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKLEFT2 0.png");
anInt1440 = 8;
anInt1441 = 134;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("titlebox")){
		try{
			Image image = Toolkit.getDefaultToolkit().getImage("./cache/Sprites/loginbox.png");
			anIntArray1439 = new int[anInt1440 * anInt1441];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
			pixelgrabber.grabPixels();
		}catch (Exception exception){
			System.out.println("could not load: "+s+" "+i+".jpg");
		}
	}
		 else if (s.equalsIgnoreCase("titlebutton"))
{
try
{
				Image image = Toolkit.getDefaultToolkit().getImage("./cache/Sprites/loginbutton.png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
else if (s.startsWith("headicons_hint") && i == 2)
{
try
{

Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/headhint1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
/*else if (s.equalsIgnoreCase("titlebox"))
{
try
{
                Image image = Toolkit.getDefaultToolkit().getImage("./cache/Sprites/loginbox.png");            //System.getProperty("user.dir") + "\\"+i+".png");
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber.grabPixels();

            }
            catch (Exception exception)
            {
                System.out.println(((Object) (exception)));
            }
        }*/
else if (s.startsWith("backbase1") && i == 0)
{
try
{

anInt1440 = Bluurr.backbasew;
anInt1441 = Bluurr.backbaseh;

Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKBASE1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backbase2") && i == 0)
{
try
{
anInt1440 = Bluurr.backbase2w;
anInt1441 = Bluurr.backbase2h;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKBASE2 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backhmid1") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKHMID1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backhmid2") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKHMID2 0.png");
anInt1440 = 555;
anInt1441 = 6;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backleft1") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKLEFT1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backright1") && i == 0)
{
try
{
anInt1440 = Bluurr.mapbackrightw;
anInt1441 = Bluurr.mapbackrighth;
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKRIGHT1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backright2") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKRIGHT2 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("scrollbar") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/scroll0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("scrollbar") && i == 1)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/scroll1.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backtop1") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKTOP1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backvmid1") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKVMID1 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
anInt1440 = Bluurr.mapbackleftw;
anInt1441 = Bluurr.mapbacklefth;

PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("backvmid2") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKVMID2 0.png");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

/*

else if (s.startsWith("PRAYERON") && i == 7)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/mystic.jag");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("PRAYERON") && i == 6)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/hawk.jag");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("PRAYEROFF") && i == 7)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/mysticoff.jag");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}
else if (s.startsWith("PRAYEROFF") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/hawkoff.jag");
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();

}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
}

*/







else if (s.startsWith("backvmid3") && i == 0)
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/BACKVMID3 0.png");
anInt1440 = 39;
anInt1441 = 128;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
} 

else if (s.startsWith("chat"))
{
try
{
Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/CHATBACK 0.png");
anInt1440 = 600;
anInt1441 = 400;
anIntArray1439 = new int[anInt1440 * anInt1441];
PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
pixelgrabber.grabPixels();


}
catch (Exception exception)
{
System.out.println(((Object) (exception)));
}
} 



        else
        if(s.equalsIgnoreCase("steelborder") && i == 0)
            try
            {
                Image image1 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/SteelBorder_0.png");
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber1 = new PixelGrabber(image1, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber1.grabPixels();
                return;
            }
            catch(Exception exception1)
            {
                System.out.println(exception1);
            }
        else
        if(s.equalsIgnoreCase("steelborder") && i == 1)
            try
            {
                Image image2 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/SteelBorder_1.png");
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber2 = new PixelGrabber(image2, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber2.grabPixels();
                return;
            }
            catch(Exception exception2)
            {
                System.out.println(exception2);
            }

/*
else if (s.equalsIgnoreCase("PRAYERGLOW") && i == 0)
{
try
{
								Image image = Toolkit.getDefaultToolkit().getImage("./Files/interface/"+s+" "+i+".png");		
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
//System.out.println(s+ ".png "+ " hopefully loaded");
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}

else if (s.equalsIgnoreCase("PRAYERON") && (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17))
{
try
{
								Image image = Toolkit.getDefaultToolkit().getImage("./Files/interface/"+s+" "+i+".png");		
				anInt1440 = 33;
				anInt1441 = 320;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		} 
else if (s.equalsIgnoreCase("PRAYEROFF") && (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17))
{
try
{								Image image = Toolkit.getDefaultToolkit().getImage("./Files/interface/"+s+" "+i+".png");	
				anInt1440 = 33;
				anInt1441 = 320;
				
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
//System.out.println(s+" "+i+".png"+ " hopefully loaded");
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}




*/

else if (s.equalsIgnoreCase("PRAYERGLOW") && i == 0)
{
try
{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir()+"/signframe/Prayer/"+s+" "+i+".jag");			//System.getProperty("user.dir") + "\\"+i+".png");	
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
//System.out.println(s+ ".png "+ " hopefully loaded");
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}

else if (s.equalsIgnoreCase("PRAYERON") && (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17))
{
try
{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir()+"/signframe/Prayer/PrayerOn/"+s+" "+i+".jag");	
				anInt1440 = 33;
				anInt1441 = 320;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		} 
else if (s.equalsIgnoreCase("PRAYEROFF") && (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17))
{
try
{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir()+"/signframe/Prayer/PrayerOff/"+s+" "+i+".jag");
				anInt1440 = 33;
				anInt1441 = 320;
			//System.getProperty("user.dir") + "\\"+i+".png");	
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
//System.out.println(s+" "+i+".png"+ " hopefully loaded");
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}





else if (s.equalsIgnoreCase("miscgraphics3") && i == 1){
try
{
								Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/"+s+" "+i+".png");			
				anInt1440 = 33;
				anInt1441 = 37;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
return;
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
}

else if (s.equalsIgnoreCase("miscgraphics3") && i == 0){
try
{
								Image image = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/"+s+" "+i+".png");			
				anInt1440 = 33;
				anInt1441 = 37;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
return;
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
}
        else

        if(s.equalsIgnoreCase("miscgraphics") && i == 3)
            try
            {
                Image image3 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/MiscGraphics_3.png");
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber3 = new PixelGrabber(image3, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber3.grabPixels();
                return;
            }
            catch(Exception exception3)
            {
                System.out.println(exception3);
            }




 else
        if (s.equalsIgnoreCase("headicons_prayer") && i == 6)
{
try
{

Image image = Toolkit.getDefaultToolkit().createImage("./headicons_prayer.png");	

				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
System.out.println(s+" "+i+".png"+ " Skulls Loaded");
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
} 

        else
        
        if(s.startsWith("mapback"))
            try
            {
                Image image5 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
anInt1440 = Bluurr.mapbackw;
anInt1441 = Bluurr.mapbackh;

                anIntArray1439 = new int[anInt1440 * anInt1441];

                PixelGrabber pixelgrabber5 = new PixelGrabber(image5, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber5.grabPixels();
            }
            catch(Exception exception5)
            {
                System.out.println(exception5);
            }

        else
        if(s.startsWith("redstone2"))
            try
            {
                Image image7 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/REDSTONE2 0.png");
                anInt1440 = 33;
                anInt1441 = 37;
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber7 = new PixelGrabber(image7, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber7.grabPixels();
            }
            catch(Exception exception7)
            {
                System.out.println(exception7);
            }
        else
        if(s.startsWith("redstone1"))
            try
            {
                anInt1440 = 38;
                anInt1441 = 37;
                anIntArray1439 = new int[anInt1440 * anInt1441];
                Image image8 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/REDSTONE1 0.png");
                if(client.flip)
                    image8 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/REDSTONE1 1.png");
                if(client.flip_s)
                    image8 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/REDSTONE1 2.png");
                if(client.flip_r)
                    image8 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/REDSTONE1 3.png");
                PixelGrabber pixelgrabber8 = new PixelGrabber(image8, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber8.grabPixels();
            }
            catch(Exception exception8)
            {
                System.out.println(exception8);
            }
        else
        if(s.equalsIgnoreCase("invback"))
            try
            {
                Image image9 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber9 = new PixelGrabber(image9, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber9.grabPixels();
            }
            catch(Exception exception9)
            {
                System.out.println(exception9);
            }
        else
        
       
        if(s.equalsIgnoreCase("TRADEBACKING") && i == 0)
            try
            {
                Image image14 = Toolkit.getDefaultToolkit().getImage("./Files/Spirts/trade.png");
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber14 = new PixelGrabber(image14, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber14.grabPixels();
            }
            catch(Exception exception14)
            {
                System.out.println(exception14);
            }
        else
        if(s.equalsIgnoreCase("STATICONS2") && i == 0)
            try
            {
                Image image15 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber15 = new PixelGrabber(image15, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber15.grabPixels();
            }
            catch(Exception exception15)
            {
                System.out.println(exception15);
            }
        else
        if(s.equalsIgnoreCase("STATICONS2") && i == 2)
            try
            {
                Image image16 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber16 = new PixelGrabber(image16, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber16.grabPixels();
            }
            catch(Exception exception16)
            {
                System.out.println(exception16);
            }
        else
        if(s.equalsIgnoreCase("STATICONS2") && i == 1)
            try
            {
                Image image17 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber17 = new PixelGrabber(image17, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber17.grabPixels();
            }
            catch(Exception exception17)
            {
                System.out.println(exception17);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 9)
            try
            {
                Image image18 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber18 = new PixelGrabber(image18, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber18.grabPixels();
            }
            catch(Exception exception18)
            {
                System.out.println(exception18);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 7)
            try
            {
                Image image19 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber19 = new PixelGrabber(image19, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber19.grabPixels();
            }
            catch(Exception exception19)
            {
                System.out.println(exception19);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 0)
            try
            {
                Image image20 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber20 = new PixelGrabber(image20, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber20.grabPixels();
            }
            catch(Exception exception20)
            {
                System.out.println(exception20);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 1)
            try
            {
                Image image21 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber21 = new PixelGrabber(image21, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber21.grabPixels();
            }
            catch(Exception exception21)
            {
                System.out.println(exception21);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 2)
            try
            {
                Image image22 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber22 = new PixelGrabber(image22, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber22.grabPixels();
            }
            catch(Exception exception22)
            {
                System.out.println(exception22);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 17)
            try
            {
                Image image23 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber23 = new PixelGrabber(image23, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber23.grabPixels();
            }
            catch(Exception exception23)
            {
                System.out.println(exception23);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 16)
            try
            {
                Image image24 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber24 = new PixelGrabber(image24, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber24.grabPixels();
            }
            catch(Exception exception24)
            {
                System.out.println(exception24);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 15)
            try
            {
                Image image25 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber25 = new PixelGrabber(image25, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber25.grabPixels();
            }
            catch(Exception exception25)
            {
                System.out.println(exception25);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 14)
            try
            {
                Image image26 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber26 = new PixelGrabber(image26, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber26.grabPixels();
            }
            catch(Exception exception26)
            {
                System.out.println(exception26);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 13)
            try
            {
                Image image27 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber27 = new PixelGrabber(image27, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber27.grabPixels();
            }
            catch(Exception exception27)
            {
                System.out.println(exception27);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 12)
            try
            {
                Image image28 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber28 = new PixelGrabber(image28, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber28.grabPixels();
            }
            catch(Exception exception28)
            {
                System.out.println(exception28);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 11)
            try
            {
                Image image29 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber29 = new PixelGrabber(image29, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber29.grabPixels();
            }
            catch(Exception exception29)
            {
                System.out.println(exception29);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 10)
            try
            {
                Image image30 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber30 = new PixelGrabber(image30, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber30.grabPixels();
            }
            catch(Exception exception30)
            {
                System.out.println(exception30);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 8)
            try
            {
                Image image31 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber31 = new PixelGrabber(image31, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber31.grabPixels();
            }
            catch(Exception exception31)
            {
                System.out.println(exception31);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 6)
            try
            {
                Image image32 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber32 = new PixelGrabber(image32, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber32.grabPixels();
            }
            catch(Exception exception32)
            {
                System.out.println(exception32);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 5)
            try
            {
                Image image33 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber33 = new PixelGrabber(image33, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber33.grabPixels();
            }
            catch(Exception exception33)
            {
                System.out.println(exception33);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 4)
            try
            {
                Image image34 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber34 = new PixelGrabber(image34, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber34.grabPixels();
            }
            catch(Exception exception34)
            {
                System.out.println(exception34);
            }
        else
        if(s.equalsIgnoreCase("staticons") && i == 3)
            try
            {
                Image image35 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber35 = new PixelGrabber(image35, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber35.grabPixels();
            }
            catch(Exception exception35)
            {
                System.out.println(exception35);
            }
        else
        if(s.startsWith("sideicon"))
            try
            {
                Image image36 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anInt1440 = 28;
                anInt1441 = 28;
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber36 = new PixelGrabber(image36, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber36.grabPixels();
            }
            catch(Exception exception36)
            {
                System.out.println(exception36);
            }
        else
        
        
        if(s.equalsIgnoreCase("compass"))
        {
            try
            {
                Image image40 = Toolkit.getDefaultToolkit().getImage((new StringBuilder()).append("./Files/Spirts/").append(s).append(" ").append(i).append(".png").toString());
                anIntArray1439 = new int[anInt1440 * anInt1441];
                PixelGrabber pixelgrabber40 = new PixelGrabber(image40, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
                pixelgrabber40.grabPixels();
            }
            catch(Exception exception40)
            {
                System.out.println(exception40);
            }
        } 
else

       
        {
            if(i1 == 0)
            {
                for(int k1 = 0; k1 < j1; k1++)
                    anIntArray1439[k1] = ai[class30_sub2_sub2.method408()];

                return;
            }
            if(i1 == 1)
            {
                for(int l1 = 0; l1 < anInt1440; l1++)
                {
                    for(int i2 = 0; i2 < anInt1441; i2++)
                        anIntArray1439[l1 + i2 * anInt1440] = ai[class30_sub2_sub2.method408()];

                }

            }
        }
    }

    public static void writeTemp(String s, String s1)
    {
        try
        {
            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(s1, true));
            bufferedwriter.write(s);
            bufferedwriter.newLine();
            bufferedwriter.flush();
        }
        catch(IOException ioexception) { }
    }

    public void method343(int i)
    {
        if(i != 0)
            aBoolean1438 = !aBoolean1438;
        Class30_Sub2_Sub1.method331(anInt1441, anInt1440, -293, anIntArray1439);
    }

    public void method344(int i, int j, int k, int l)
    {
        if(l != 0)
            anInt1430 = 314;
        for(int i1 = 0; i1 < anIntArray1439.length; i1++)
        {
            int j1 = anIntArray1439[i1];
            if(j1 == 0)
                continue;
            int k1 = j1 >> 16 & 0xff;
            k1 += i;
            if(k1 < 1)
                k1 = 1;
            else
            if(k1 > 255)
                k1 = 255;
            int l1 = j1 >> 8 & 0xff;
            l1 += j;
            if(l1 < 1)
                l1 = 1;
            else
            if(l1 > 255)
                l1 = 255;
            int i2 = j1 & 0xff;
            i2 += k;
            if(i2 < 1)
                i2 = 1;
            else
            if(i2 > 255)
                i2 = 255;
            anIntArray1439[i1] = (k1 << 16) + (l1 << 8) + i2;
        }

    }

    public void method345(int i)
    {
        int ai[] = new int[anInt1444 * anInt1445];
        if(i != 5059)
            anInt1429 = -247;
        for(int j = 0; j < anInt1441; j++)
        {
            for(int k = 0; k < anInt1440; k++)
                ai[(j + anInt1443) * anInt1444 + (k + anInt1442)] = anIntArray1439[j * anInt1440 + k];

        }

        anIntArray1439 = ai;
        anInt1440 = anInt1444;
        anInt1441 = anInt1445;
        anInt1442 = 0;
        anInt1443 = 0;
    }

    public void method346(int i, int j, int k)
    {
        i += anInt1442;
        j += anInt1443;
        int l = i + j * Class30_Sub2_Sub1.anInt1379;
        int i1 = 0;
        int j1 = anInt1441;
        int k1 = anInt1440;
        int l1 = Class30_Sub2_Sub1.anInt1379 - k1;
        int i2 = 0;
        if(k != anInt1431)
            aBoolean1438 = !aBoolean1438;
        if(j < Class30_Sub2_Sub1.anInt1381)
        {
            int j2 = Class30_Sub2_Sub1.anInt1381 - j;
            j1 -= j2;
            j = Class30_Sub2_Sub1.anInt1381;
            i1 += j2 * k1;
            l += j2 * Class30_Sub2_Sub1.anInt1379;
        }
        if(j + j1 > Class30_Sub2_Sub1.anInt1382)
            j1 -= (j + j1) - Class30_Sub2_Sub1.anInt1382;
        if(i < Class30_Sub2_Sub1.anInt1383)
        {
            int k2 = Class30_Sub2_Sub1.anInt1383 - i;
            k1 -= k2;
            i = Class30_Sub2_Sub1.anInt1383;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(i + k1 > Class30_Sub2_Sub1.anInt1384)
        {
            int l2 = (i + k1) - Class30_Sub2_Sub1.anInt1384;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method347(l, k1, j1, i2, i1, 28339, l1, anIntArray1439, Class30_Sub2_Sub1.anIntArray1378);
            return;
        }
    }

    private void method347(int i, int j, int k, int l, int i1, int j1, int k1, 
            int ai[], int ai1[])
    {
        int l1 = -(j >> 2);
        j = -(j & 3);
        for(int i2 = -k; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
            }

            for(int k2 = j; k2 < 0; k2++)
                ai1[i++] = ai[i1++];

            i += k1;
            i1 += l;
        }

        if(j1 != 28339)
            anInt1431 = 90;
    }

    public void method348(int i, int j, int k)
    {
        i += anInt1442;
        k += anInt1443;
        if(j != 16083)
            return;
        int l = i + k * Class30_Sub2_Sub1.anInt1379;
        int i1 = 0;
        int j1 = anInt1441;
        int k1 = anInt1440;
        int l1 = Class30_Sub2_Sub1.anInt1379 - k1;
        int i2 = 0;
        if(k < Class30_Sub2_Sub1.anInt1381)
        {
            int j2 = Class30_Sub2_Sub1.anInt1381 - k;
            j1 -= j2;
            k = Class30_Sub2_Sub1.anInt1381;
            i1 += j2 * k1;
            l += j2 * Class30_Sub2_Sub1.anInt1379;
        }
        if(k + j1 > Class30_Sub2_Sub1.anInt1382)
            j1 -= (k + j1) - Class30_Sub2_Sub1.anInt1382;
        if(i < Class30_Sub2_Sub1.anInt1383)
        {
            int k2 = Class30_Sub2_Sub1.anInt1383 - i;
            k1 -= k2;
            i = Class30_Sub2_Sub1.anInt1383;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(i + k1 > Class30_Sub2_Sub1.anInt1384)
        {
            int l2 = (i + k1) - Class30_Sub2_Sub1.anInt1384;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method349(Class30_Sub2_Sub1.anIntArray1378, anIntArray1439, 0, i1, l, k1, j1, l1, i2);
            return;
        }
    }

     public void method349(int ai[], int ai1[], int i, int j, int k, int l, int i1, 
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ai1[j++];
                if(i == -0xfefeff)
                {
                    ai[k] = -ai[k++];
                } else
                if(i != 0 && i != -1)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i == -0xfefeff)
                {
                    ai[k] = -ai[k++];
                } else
                if(i != 0 && i != -1)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i == -0xfefeff)
                {
                    ai[k] = -ai[k++];
                } else
                if(i != 0 && i != -1)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i == -0xfefeff)
                {
                    ai[k] = -ai[k++];
                } else
                if(i != 0 && i != -1)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }

            for(int k2 = l; k2 < 0; k2++)
            {
                i = ai1[j++];
                if(i == -0xfefeff)
                {
                    ai[k] = -ai[k++];
                } else
                if(i != 0 && i != -1)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }

            k += j1;
            j += k1;
        }

    }
    public void method350(int i, int j, int k, boolean flag)
    {
        i += anInt1442;
        if(flag)
        {
            for(int l = 1; l > 0; l++);
        }
        j += anInt1443;
        int i1 = i + j * Class30_Sub2_Sub1.anInt1379;
        int j1 = 0;
        int k1 = anInt1441;
        int l1 = anInt1440;
        int i2 = Class30_Sub2_Sub1.anInt1379 - l1;
        int j2 = 0;
        if(j < Class30_Sub2_Sub1.anInt1381)
        {
            int k2 = Class30_Sub2_Sub1.anInt1381 - j;
            k1 -= k2;
            j = Class30_Sub2_Sub1.anInt1381;
            j1 += k2 * l1;
            i1 += k2 * Class30_Sub2_Sub1.anInt1379;
        }
        if(j + k1 > Class30_Sub2_Sub1.anInt1382)
            k1 -= (j + k1) - Class30_Sub2_Sub1.anInt1382;
        if(i < Class30_Sub2_Sub1.anInt1383)
        {
            int l2 = Class30_Sub2_Sub1.anInt1383 - i;
            l1 -= l2;
            i = Class30_Sub2_Sub1.anInt1383;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if(i + l1 > Class30_Sub2_Sub1.anInt1384)
        {
            int i3 = (i + l1) - Class30_Sub2_Sub1.anInt1384;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if(l1 <= 0 || k1 <= 0)
        {
            return;
        } else
        {
            method351(j1, l1, Class30_Sub2_Sub1.anIntArray1378, 0, anIntArray1439, j2, k1, i2, k, i1, 8);
            return;
        }
    }

    private void method351(int i, int j, int ai[], int k, int ai1[], int l, int i1, 
            int j1, int k1, int l1, int i2)
    {
        int j2 = 256 - k1;
        for(int k2 = -i1; k2 < 0; k2++)
        {
            for(int l2 = -j; l2 < 0; l2++)
            {
                k = ai1[i++];
                if(k != 0)
                {
                    int i3 = ai[l1];
                    ai[l1++] = ((k & 0xff00ff) * k1 + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((k & 0xff00) * k1 + (i3 & 0xff00) * j2 & 0xff0000) >> 8;
                } else
                {
                    l1++;
                }
            }

            l1 += j1;
            i += l;
        }

        if(i2 < 8 || i2 > 8)
            aBoolean1428 = !aBoolean1428;
    }

    public void method352(int i, int j, int ai[], int k, int ai1[], int l, int i1, 
            int j1, int k1, int l1, int i2)
    {
        while(l >= 0) 
            anInt1434 = 362;
        try
        {
            int j2 = -l1 / 2;
            int k2 = -i / 2;
            int l2 = (int)(Math.sin((double)j / 326.11000000000001D) * 65536D);
            int i3 = (int)(Math.cos((double)j / 326.11000000000001D) * 65536D);
            l2 = l2 * k >> 8;
            i3 = i3 * k >> 8;
            int j3 = (i2 << 16) + (k2 * l2 + j2 * i3);
            int k3 = (i1 << 16) + (k2 * i3 - j2 * l2);
            int l3 = k1 + j1 * Class30_Sub2_Sub1.anInt1379;
            for(j1 = 0; j1 < i; j1++)
            {
                int i4 = ai1[j1];
                int j4 = l3 + i4;
                int k4 = j3 + i3 * i4;
                int l4 = k3 - l2 * i4;
                for(k1 = -ai[j1]; k1 < 0; k1++)
                {
                    Class30_Sub2_Sub1.anIntArray1378[j4++] = anIntArray1439[(k4 >> 16) + (l4 >> 16) * anInt1440];
                    k4 += i3;
                    l4 -= l2;
                }

                j3 += l2;
                k3 += i3;
                l3 += Class30_Sub2_Sub1.anInt1379;
            }

            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    public void method353(int i, int j, int k, int l, int i1, int j1, int k1, 
            double d, int l1)
    {
        if(i1 != 41960)
            return;
        try
        {
            int i2 = -k / 2;
            int j2 = -k1 / 2;
            int k2 = (int)(Math.sin(d) * 65536D);
            int l2 = (int)(Math.cos(d) * 65536D);
            k2 = k2 * j1 >> 8;
            l2 = l2 * j1 >> 8;
            int i3 = (l << 16) + (j2 * k2 + i2 * l2);
            int j3 = (j << 16) + (j2 * l2 - i2 * k2);
            int k3 = l1 + i * Class30_Sub2_Sub1.anInt1379;
            for(i = 0; i < k1; i++)
            {
                int l3 = k3;
                int i4 = i3;
                int j4 = j3;
                for(l1 = -k; l1 < 0; l1++)
                {
                    int k4 = anIntArray1439[(i4 >> 16) + (j4 >> 16) * anInt1440];
                    if(k4 != 0)
                        Class30_Sub2_Sub1.anIntArray1378[l3++] = k4;
                    else
                        l3++;
                    i4 += l2;
                    j4 -= k2;
                }

                i3 += k2;
                j3 += l2;
                k3 += Class30_Sub2_Sub1.anInt1379;
            }

            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    public void method354(Class30_Sub2_Sub1_Sub2 class30_sub2_sub1_sub2, boolean flag, int i, int j)
    {
        j += anInt1442;
        i += anInt1443;
        int k = j + i * Class30_Sub2_Sub1.anInt1379;
        int l = 0;
        if(flag)
            anInt1429 = -364;
        int i1 = anInt1441;
        int j1 = anInt1440;
        int k1 = Class30_Sub2_Sub1.anInt1379 - j1;
        int l1 = 0;
        if(i < Class30_Sub2_Sub1.anInt1381)
        {
            int i2 = Class30_Sub2_Sub1.anInt1381 - i;
            i1 -= i2;
            i = Class30_Sub2_Sub1.anInt1381;
            l += i2 * j1;
            k += i2 * Class30_Sub2_Sub1.anInt1379;
        }
        if(i + i1 > Class30_Sub2_Sub1.anInt1382)
            i1 -= (i + i1) - Class30_Sub2_Sub1.anInt1382;
        if(j < Class30_Sub2_Sub1.anInt1383)
        {
            int j2 = Class30_Sub2_Sub1.anInt1383 - j;
            j1 -= j2;
            j = Class30_Sub2_Sub1.anInt1383;
            l += j2;
            k += j2;
            l1 += j2;
            k1 += j2;
        }
        if(j + j1 > Class30_Sub2_Sub1.anInt1384)
        {
            int k2 = (j + j1) - Class30_Sub2_Sub1.anInt1384;
            j1 -= k2;
            l1 += k2;
            k1 += k2;
        }
        if(j1 <= 0 || i1 <= 0)
        {
            return;
        } else
        {
            method355(anIntArray1439, j1, class30_sub2_sub1_sub2.aByteArray1450, i1, Class30_Sub2_Sub1.anIntArray1378, 0, aBoolean1436, k1, k, l1, l);
            return;
        }
    }

    private void method355(int ai[], int i, byte abyte0[], int j, int ai1[], int k, boolean flag, 
            int l, int i1, int j1, int k1)
    {
        int l1 = -(i >> 2);
        if(!flag)
        {
            for(int i2 = 1; i2 > 0; i2++);
        }
        i = -(i & 3);
        for(int j2 = -j; j2 < 0; j2++)
        {
            for(int k2 = l1; k2 < 0; k2++)
            {
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
            }

            for(int l2 = i; l2 < 0; l2++)
            {
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
            }

            i1 += l;
            k1 += j1;
        }

    }
}


import java.awt.*;
import sign.signlink;

public final class Frame_Sub1 extends Frame
{

    public Frame_Sub1(Applet_Sub1 applet_sub1, int i, byte byte0, int j)
    {
        aBoolean35 = true;
        anApplet_Sub1_36 = applet_sub1;
       
        setResizable(false);
        show();
        if(byte0 != 5)
            aBoolean35 = !aBoolean35;
        toFront();
       resize(i + 8, j + 28);
    }

    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public final void update(Graphics g)
    {
        anApplet_Sub1_36.update(g);
    }

    public final void paint(Graphics g)
    {
        anApplet_Sub1_36.paint(g);
    }

    private boolean aBoolean35;
    Applet_Sub1 anApplet_Sub1_36;
}

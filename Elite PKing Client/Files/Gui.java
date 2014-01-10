import javax.swing.*;
import java.awt.*;
import java.lang.String;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import sign.signlink;
import javax.sound.midi.*;
import java.util.List;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;




import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.swing.JInternalFrame;

import javax.imageio.ImageIO;
import javax.sound.midi.*;
import javax.swing.JDesktopPane;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import sign.signlink;
import javax.swing.JToolBar;
import javax.swing.*;
import java.awt.*;
import java.lang.String;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import sign.signlink;
import javax.sound.midi.*;
import java.util.List;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.lang.String;
import javax.swing.JTabbedPane;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JTabbedPane;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import sign.signlink;
import javax.sound.midi.*;
import java.util.List;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Gui extends client
implements ActionListener, ItemListener, WindowListener
{
    private static FileOutputStream logFileOut;
	//private static final String iconLocation = ".Files/.png";
    private static boolean isApplet = false;
	//Jscreen screentab;
     private MP3Player player;
	    public int midiCount;
    public Sequencer sequencer;
	public static void main(String args[])
	{
		new Gui(args);
	}
	
	

	private Gui(String args[]) 
	{
		super();
		//screentab = new JScreen();
		try 
		{

System.out.println("Connecting to the BEST SERVER EVER!!!");
Serverip = "25.19.187.1";
//Serverip = "0.0.0.0";
//launchURL("http://www.google.com");
sign.signlink.startpriv(InetAddress.getByName(Serverip));
 

			initUI();




		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	
	public void initUI()
	{
		try
		{




  
UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceCremeLookAndFeel");
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            JPopupMenu.setDefaultLightWeightPopupEnabled(false);
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame.setDefaultLookAndFeelDecorated(true);
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);

			sign.signlink.mainapp = this; // Dangerous reference?

			frame = new JFrame(frameTitle);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
			/*if((new File(".Files/icon.png")).isFile())
            {
                frame.setIconImage(Toolkit.getDefaultToolkit().getImage(".Files/icon.png"));
            }*/
			frame.setLayout(new BorderLayout());

			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JMenuBar jscreen = new JMenuBar();
			JPanel gamePanel = new JPanel();
			gamePanel.setLayout(new BorderLayout());

			gamePanel.add(this);
			gamePanel.setPreferredSize(new Dimension(765, 503));

			JMenuBar menuBar = new JMenuBar();
			

			JMenu fileMenu = new JMenu("File");
			JMenu hpMenu = new JMenu("HP Bar");
			Icon hpicon = new ImageIcon("hpicon.gif");
			hpMenu.setIcon(hpicon);
			    hpMenu.setVerticalTextPosition(SwingConstants.TOP);
    hpMenu.setHorizontalTextPosition(SwingConstants.CENTER);
	int gapSize = hpMenu.getIconTextGap();
	hpMenu.setIconTextGap(0);
						

			JMenu ClientMenu = new JMenu("Client");
			//JMenu SitesMenu = new JMenu("Sites");
			JMenu musicmenu = new JMenu("Music");
			JMenu othermenu = new JMenu("Other");
			JMenu accountmenu = new JMenu("Account");
			//JMenu botsmenu = new JMenu("Bots");
                        JMenu toolsMenu = new JMenu("Tools");
                        JButton shotMenu = new JButton("  Screenshot  ");//(PgDownKey)
                        Icon imgicon = new ImageIcon("screen.gif");
						shotMenu.setIcon(imgicon);
						Font f =new Font(shotMenu.getFont().getName(), Font.BOLD, 12);  
						shotMenu.setFont(f);  
						shotMenu.setActionCommand("Screenshot");//daqui vai po cmd command
						shotMenu.addActionListener(this);
						
			
			String[] ClientButtons = new String[]
				{
					"Update"
				};
			String[] ThemeButtons = new String[]
			{
				"Black", "Blue", "Red",
				"Green", "Grey", "White"
			};
			String[] musicButtons = new String[]
				{
					"Play", "Stop", "Next", "Previous"
				};
			 String[] cursorsButtons = new String[]
               			 {
                     "Standard", "Sword", "Wand", "Godsword", "Scimitar", "2hand", "Halberd", "Maul", "Warspear", "Longsword", "Guitar", "Pikachu", "Kenny"
                		};
			String[] otherButtons = new String[]
				{
					"Add your own Music","Find your screenshots","About","Version","Chat colours"
				};
			String[] hpButtons = new String[]
				{
					"New Bar","Old Bar"
				};
			String[] accountButtons = new String[]
				{
					"Save account", "Name colour","Chat colour","Chat effects","Reset"
				};
			/*String[] botsButtons = new String[]
				{
					"Auto talker","off"
				};*/
			/*String[] SitesButtons = new String[]
				{
					"Dont click here"
				};*/
			String[] mainButtons = new String[]
				{
					 "Client detail","New Item IDs","Item IDs", "NPC IDs", "Object IDs", "-", "Quit"
				};
			for (String name : mainButtons)
			{
				JMenuItem menuItem = new JMenuItem(name);
				if (name.equalsIgnoreCase("-"))
					fileMenu.addSeparator();
				else
				{
					menuItem.addActionListener(this);
					fileMenu.add(menuItem);
				}
			}
			for (String name : musicButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								musicmenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								musicmenu.add(menuItem);
							}
			}
			/*for (String name : ThemeButtons)
			{
				JMenuItem menuItem = new JMenuItem(name);
				if (name.equalsIgnoreCase("-"))
					ThemeMenu.addSeparator();
				else
				{
					ThemeMenu.add(menuItem);
					menuItem.addActionListener(this);
				}
			}*/
			for (String name : otherButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								othermenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								othermenu.add(menuItem);
							}
			}
			for (String name : hpButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								hpMenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								hpMenu.add(menuItem);
							}
			}
			for (String name : accountButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								accountmenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								accountmenu.add(menuItem);
							}
			}
/*for (String name : botsButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								botsmenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								botsmenu.add(menuItem);
							}
			}*/
for (String name : ClientButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								ClientMenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								ClientMenu.add(menuItem);
							}
			
	}
/*for (String name : cursorsButtons)
   {
    JMenuItem menuItem = new JMenuItem(name);
    if (name.equalsIgnoreCase("-"))
     cursorsMenu.addSeparator();
    else
    {
     cursorsMenu.add(menuItem);
     menuItem.addActionListener(this);
    }
   }*/
/*for (String name : SitesButtons)
						{
							JMenuItem menuItem = new JMenuItem(name);
							if (name.equalsIgnoreCase("-"))
								SitesMenu.addSeparator();
							else
							{
								menuItem.addActionListener(this);
								SitesMenu.add(menuItem);
							}
			
	}*/
			
			menuBar.add(fileMenu);
			menuBar.add(hpMenu);//menuBar.add(ClientMenu);
			//menuBar.add(SitesMenu);
			menuBar.add(musicmenu);
			menuBar.add(othermenu);
			menuBar.add(accountmenu);
			menuBar.add(hpMenu);
			//menuBar.add(botsmenu);
			jscreen.add(shotMenu);
           //menuBar.add(toolsMenu);
			//menuBar.add(cursorsMenu);
			//menuBar.add(ThemeMenu);
                        


			frame.getContentPane().add(menuBar, BorderLayout.NORTH);
			frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
			frame.getContentPane().add(jscreen, BorderLayout.SOUTH);
			frame.pack();
			frame.setVisible(true);
			init();
			midiPlayer("Play");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	 public JDialog createFileChooserDialog(JFileChooser jfilechooser, String s, Container container)
	    {
	        JDialog jdialog = new JDialog(frame, s, true);
	        jdialog.setDefaultCloseOperation(2);
	        jdialog.add(jfilechooser);
	        jdialog.pack();
	        jdialog.setLocationRelativeTo(container);
	        return jdialog;
    }
	/*protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Gui.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }*/
	
    public void itemStateChanged(ItemEvent itemevent)
	    {
	        String s = itemevent.paramString();
	        s = s.substring(s.indexOf("item=") + 5);
	        int i = itemevent.getStateChange();
	        if(s != null)
	        {
	            
	        }
    }
public static synchronized void log(Object object)
    {
        System.out.println(object.toString());
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
	            log((new StringBuilder()).append("Error making file: ").append(e).toString());
	        }
    }
     public void midiPlayer(String command)
	    {
	        String dir = "./User/music/";
chkDir(dir);
if(player != null && player.isRunning())
	        {
	            player.close();
	        }
	        if(sequencer != null && sequencer.isRunning())
	        {
	            sequencer.stop();
	            sequencer.close();
	        }
	        if(command.equals("Next"))
	        {
	            midiCount++;
	        } else
	        if(command.equals("Previous"))
	        {
	            midiCount--;
	        }
	        if(!command.equals("Stop"))
	        {
	            File index = new File(dir);
	            String fileList[] = index.list();
	            if(fileList.length > 0)
	            {
	                if(midiCount > fileList.length - 1)
	                {
	                    midiCount = 0;
	                }
	                if(midiCount < 0)
	                {
	                    midiCount = fileList.length - 1;
	                }
	                if(fileList[midiCount].endsWith(".mp3"))
	                {
	                    log((new StringBuilder()).append("Playing ").append(fileList[midiCount]).toString());
	                    player = new MP3Player((new StringBuilder()).append(dir).append(fileList[midiCount]).toString(), true);
	                } else
	                if(fileList[midiCount].endsWith(".mid"))
	                {
	                    log((new StringBuilder()).append("Playing ").append(fileList[midiCount]).toString());
	                    try
	                    {
	                        File midiFile = new File((new StringBuilder()).append(dir).append(fileList[midiCount]).toString());
	                        sequencer = MidiSystem.getSequencer();
	                        sequencer.setSequence(MidiSystem.getSequence(midiFile));
	                        sequencer.setLoopCount(-1);
	                        sequencer.open();
	                        sequencer.start();
	                    }
	                    catch(MidiUnavailableException mue)
	                    {
	                        log("Midi device unavailable!");
	                    }
	                    catch(InvalidMidiDataException imde)
	                    {
	                        log("Invalid Midi data!");
	                    }
	                    catch(IOException ioe)
	                    {
	                        log("I/O Error!");
	                    }
	                }
	            } else
	            {
	                log("no midi or mp3 files in folder");
	            }
	        }
    }

public void takeScreenshot(boolean flag)
    {
        BufferedImage bufferedimage;
        try
        {
            Robot robot = new Robot();
            Point point = getLocationOnScreen();
            Rectangle rectangle = new Rectangle(point.x, point.y, getWidth(), getHeight());
            bufferedimage = robot.createScreenCapture(rectangle);
        }
        catch(Throwable throwable)
        {
             JOptionPane.showMessageDialog(frame, "An error occured while trying to create a screenshot!", "Screenshot Error", 0);
            return;
        }
        String s = null;
        try
        {
            s = getNearestScreenshotFilename();
        }
        catch(IOException ioexception)
        {
            if(flag)
            {
                 JOptionPane.showMessageDialog(frame, "A screenshot directory does not exist, and could not be created!", "No Screenshot Directory", 0);
                return;
            }
        }
        if(s == null && flag)
        {
             JOptionPane.showMessageDialog(frame, "There are too many screenshots in the screenshot directory!\n"+"Delete some screen\n" +"shots and try again." , "Screenshot Directory Full", 0);
            return;
        }
        if(!flag)
        {
            final JFileChooser fileChooser = new JFileChooser();
            final JDialog fileDialog = createFileChooserDialog(fileChooser, "Save Screenshot", this);
            final BufferedImage si = bufferedimage;
            JFileChooser _tmp = fileChooser;
            fileChooser.setFileSelectionMode(0);
            fileChooser.addChoosableFileFilter(new imageFileFilter());
            fileChooser.setCurrentDirectory(new File("./User/screenshots/"));
            fileChooser.setSelectedFile(new File(s));
            JFileChooser _tmp1 = fileChooser;
            fileChooser.setDialogType(1);
            fileChooser.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent actionevent)
                {
                    String s1 = actionevent.getActionCommand();
                    if(s1.equals("ApproveSelection"))
                    {
                        File file = fileChooser.getSelectedFile();
                        if(file != null && file.isFile())
                        {
                            int i = JOptionPane.showConfirmDialog(frame, (new StringBuilder()).append(file.getAbsolutePath()).append(" already exists.\n"+"Do you want to replace it?").toString(), "Save Screenshot", 2);
                            if(i != 0)
                            {
                                return;
                            }
                        }
                        try
                        {
                            ImageIO.write(si, "png", file);
                        }
                        catch(IOException ioexception2)
                        {
                             JOptionPane.showMessageDialog(frame, "An error occured while trying to save the screenshot!\n"+"Please make sure you have\n"+" write access to the screenshot directory." , "Screenshot Error", 0);
                        }
                        fileDialog.dispose();
                    } else
                    if(s1.equals("CancelSelection"))
                    {
                        fileDialog.dispose();
                    }
                }


            {

            }
            });
            fileDialog.setVisible(true);
        } else
        {
            try
            {
                ImageIO.write(bufferedimage, "png", new File((new StringBuilder()).append("./User/screenshots/").append(s).toString()));

		System.out.println("You took a screenshot!");
            }
            catch(IOException ioexception1)
            {
                 JOptionPane.showMessageDialog(frame, "An error occured while trying to save the screenshot!\n"+"Please make sure you have\n"+" write access to the screenshot directory." , "Screenshot Error", 0);
            }
        }
    }

public static String getNearestScreenshotFilename()
        throws IOException
    {
        File file = new File("./User/screenshots");
        int i = 0;
        do
        {
            String s = " .png";
            if(i < 10)
            {
                s = s.replaceFirst(" ", (new StringBuilder()).append("000").append(i).toString());
            } else
            if(i < 100)
            {
                s = s.replaceFirst(" ", (new StringBuilder()).append("00").append(i).toString());
            } else
            if(i < 1000)
            {
                s = s.replaceFirst(" ", (new StringBuilder()).append("0").append(i).toString());
            } else
            if(i < 10000)
            {
                s = s.replaceFirst(" ", (new StringBuilder()).append(" ").append(i).toString());
            }
            if((new File(file, s)).isFile())
            {
                i++;
            } else
            {
                return s;
            }
        } while(i < 10000);
        return null;
    }


class imageFileFilter extends FileFilter
{

    imageFileFilter()
    {
    }

    public boolean accept(File file)
    {
        String s = file.getName();
        return file.isDirectory() || s.toLowerCase().endsWith(".png") && s.indexOf("$") == -1;
    }

    public String getDescription()
    {
        return "PNG (*.png)";
    }
}

	public URL getCodeBase() 
	{
		try 
		{
System.out.println("connected.");
                        sign.signlink.startpriv(InetAddress.getByName(Serverip));
			return new URL("http://www.xlinescape.net84.net/Updateserver/updater.hex");

			
		} 
		catch (Exception e) 
		{
			return super.getCodeBase();
		}
	}


	public URL getDocumentBase()
	{
		return getCodeBase();
	}

	public void loadError(String s)
	{
		System.out.println("loadError: " + s);
	}
	public String getParameter(String key)
	{
		if (key.equals("nodeid"))
			return "10";
		else if (key.equals("portoff"))
			return "0";
		else if (key.equals("lowmem"))
			return "1";
		else if (key.equals("free"))
			return "0";
		else
			return "";
	}

    public void displayWorldSelect() {
		try
		{
                String s1 = JOptionPane.showInputDialog(this, (new StringBuilder()).append("Current server: "+ server), "Enter Server", 3);
               if(s1 == null)
			               {
			                   log("Canceled");
			               } else
			               if(s1.equalsIgnoreCase(""))
			               {
			                   log("Sorry, have to have some input");
			               } else
			               {
			                   log((new StringBuilder()).append("Set world to: ").append(s1).toString());
			                   server = s1;
			               }
			           }
			           catch(Exception e)
			           {
			               log((new StringBuilder()).append("You must enter a numeric value!: ").append(e).toString());

			}
		}
	public void actionPerformed(ActionEvent evt)
	{
		String cmd = evt.getActionCommand();
		if (cmd != null)
		{
			if (cmd.equalsIgnoreCase("Quit"))
        {
            int i1;
            if((i1 = JOptionPane.showConfirmDialog(this, "Are you sure you want to close the Client?")) == 0)
                System.exit(0);
            return;
        }
if(cmd.equalsIgnoreCase("Next"))
	        {
	            midiPlayer("Next");
}
	        if(cmd.equalsIgnoreCase("Previous"))
	        {
	            midiPlayer("Previous");
	        }
            if(cmd.equalsIgnoreCase("Play"))
            {
                midiPlayer("Play");
            }
            if(cmd.equalsIgnoreCase("Stop"))
            {
                midiPlayer("Stop");
            }
if (cmd.equalsIgnoreCase("Standard")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/standard.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Standard");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Sword")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/sword.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Sword");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Wand")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/wand.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Wand");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Godsword")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/Godsword.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Godsword");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Scimitar")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/Scimitar.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Scimitar");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Maul")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/Granite maul.png");
Point hotSpot = new Point(0,5);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Maul");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("2hand")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/twohander.png");
Point hotSpot = new Point(1,1);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "2hand");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Halberd")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/Halberd.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Halberd");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Warspear")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/warspear.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Warspear");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Longsword")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/Longsword.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Longsword");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Guitar")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/guitar.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Guitar");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Pikachu")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/pikachu.png");
Point hotSpot = new Point(0,3);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Pikachu");
frame.setCursor(cursor);
}

if (cmd.equalsIgnoreCase("Kenny")) 
{
Toolkit toolkit = Toolkit.getDefaultToolkit();  
Image image = toolkit.getImage("./Cursors/kenny.png");
Point hotSpot = new Point(0,0);  
Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Kenny");
frame.setCursor(cursor);
}  
if (cmd.equalsIgnoreCase("Don't click here"))
{
launchURL("http://smouch.net/lol");
log("Loading website site");
}
if(cmd.equals("Red"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceMagmaLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Blue"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel");}catch(Exception exception){}
        }

        if(cmd.equals("Black"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Green"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceEmeraldDuskLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("White"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceCremeLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Grey"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel");}catch(Exception exception){}
        }
            
        if(cmd.equals("Black"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Blue"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Red"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceMagmaLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Green"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceEmeraldDuskLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("Grey"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel");}catch(Exception exception){}
        }
        if(cmd.equals("White"))
        {
            try{UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceCremeLookAndFeel");}catch(Exception exception){}
        }

if (cmd.equalsIgnoreCase("Save account"))
{
UserLoader.saveuser();
System.out.println("Saving file");

}
if (cmd.equalsIgnoreCase("Close Client")) {
        int i1;
if ((i1 = JOptionPane.showConfirmDialog(this, "Are you sure you want to close Menno's Client?")) == 0)
        System.exit(0);
        return;
}

if (cmd.equalsIgnoreCase("off"))
{
autochat(0, null);
}



if (cmd.equalsIgnoreCase("auto talker"))
{

settalk = JOptionPane.showInputDialog(null, "Enter Your text", "Enter what you want say", 1);
if(settalk != null && settalk != ""){

loop = JOptionPane.showInputDialog(null, "Enter a Number", "How many times you want loop", 1);
if(loop != null && loop != ""){

String h = loop; 
int theloop= Integer.parseInt(h);


autochat(theloop, settalk);
autochat = true;

}}}

if (cmd.equalsIgnoreCase("Reset"))
{
Setcolour(1,0x000000,"Name colour reset", "@cr1@");
Setcolour(2,0x0000FF,"chat colour reset", "@cr2@");
setchat(0);
seteffect(0);

}




if (cmd.equalsIgnoreCase("Name colour"))
{

setname = JOptionPane.showInputDialog(null, "Choose name colour ", "Enter a colour", 1);
if(setname != null && setname != ""){



if(setname.startsWith("red")){
Setcolour(1,0xff0000,"Colour set to red", "@cr3@");
setname = null;
}else

if(setname.startsWith("green")){
Setcolour(1,0x99FF00,"Colour set to green", "@cr3@");
setname = null;
}else

if(setname.startsWith("yellow")){
Setcolour(1,0xFFFF00,"Colour set to yellow", "@cr3@");
setname = null;
}else

if(setname.startsWith("black")){
Setcolour(1,0x000000,"Colour set to black", "@cr3@");
setname = null;
}else

if(setname.startsWith("blue")){
Setcolour(1,0x0000FF,"Colour set to blue", "@cr3@");
setname = null;
}else

if(setname.startsWith("white")){
Setcolour(1,0xFFFFFF,"Colour set to white", "@cr3@");
setname = null;
}else

if(setname.startsWith("pink")){
Setcolour(1,0xFF00FF,"Colour set to pink", "@cr3@");
setname = null;
}

        
            
        }}




if (cmd.equalsIgnoreCase("chat colour"))
{

setchat = JOptionPane.showInputDialog(null, "Choose a chat colour ", "Enter a colour", 1);
if(setchat != null && setchat != ""){


if(setchat.startsWith("red")){
Setcolour(2,0xff0000,"Colour set to red", "@cr3@");
setchat = null;
}else

if(setchat.startsWith("green")){
Setcolour(2,0x99FF00,"Colour set to green", "@cr3@");
setchat = null;
}else

if(setchat.startsWith("yellow")){
Setcolour(2,0xFFFF00,"Colour set to yellow", "@cr3@");
setchat = null;
}else

if(setchat.startsWith("black")){
Setcolour(2,0x000000,"Colour set to black", "@cr3@");
setchat= null;
}else

if(setchat.startsWith("blue")){
Setcolour(2,0x0000FF,"Colour set to blue", "@cr3@");
setchat = null;
}else

if(setchat.startsWith("white")){
Setcolour(2,0xFFFFFF,"Colour set to white", "@cr3@");
setchat = null;
}else

if(setchat.startsWith("pink")){
Setcolour(2,0xFF00FF,"Colour set to pink", "@cr3@");
setchat = null;
}

        
            
        }}


if (cmd.equalsIgnoreCase("Chat effects"))
{
setchateffects = JOptionPane.showInputDialog(null, "Choose chat effect ", "Enter your effect", 1);
if(setchateffects != null && setchateffects != ""){

if(setchateffects.startsWith("yellow")){
setchat(0);
setchateffects = null;
}else
if(setchateffects.startsWith("red")){
setchat(1);
setchateffects = null;
}else
if(setchateffects.startsWith("green")){
setchat(2);
setchateffects = null;
}else
if(setchateffects.startsWith("cyan")){
setchat(3);
setchateffects = null;
}else
if(setchateffects.startsWith("purple")){
setchat(4);
setchateffects = null;
}else
if(setchateffects.startsWith("white")){
setchat(5);
setchateffects = null;
}else
if(setchateffects.startsWith("flash1")){
setchat(6);
setchateffects = null;
}else
if(setchateffects.startsWith("flash2")){
setchat(7);
setchateffects = null;
}else
if(setchateffects.startsWith("flash3")){
setchat(8);
setchateffects = null;
}else
if(setchateffects.startsWith("glow1")){
setchat(9);
setchateffects = null;
}else
if(setchateffects.startsWith("glow2")){
setchat(10);
setchateffects = null;
}else
if(setchateffects.startsWith("glow3")){
setchat(11);
setchateffects = null;
}else
if(setchateffects.startsWith("wave1")){
seteffect(1);
setchateffects = null;
}else
if(setchateffects.startsWith("wave2")){
seteffect(2);
setchateffects = null;
}
else
if(setchateffects.startsWith("shake")){
seteffect(3);
setchateffects = null;
}
else
if(setchateffects.startsWith("scroll")){
seteffect(4);
setchateffects = null;
}
else
if(setchateffects.startsWith("slide")){
seteffect(5);
setchateffects = null;
}else
if(setchateffects.startsWith("reset")){
setchat(0);
seteffect(0);
setchateffects = null;
}


}
}

if (cmd.equalsIgnoreCase("Update"))
{

launchURL("./update.bat");
log("Running Updater");
JOptionPane.showMessageDialog (null, "About to run the updater!");

}
if (cmd.equalsIgnoreCase("About"))
{
JOptionPane.showMessageDialog(null, "Server was built by NverseGames");

}
if (cmd.equalsIgnoreCase("Chat Colours"))
{
JOptionPane.showMessageDialog (
   null, "You can use the following colours \nred , yellow , blue , green , pink , white ,black   \nYou can set your  text above your head to the following colurs and effects  \nyellow ,red ,green , cyan , purple , white , flash1 , flash2 , flash3 , glow 1, glow2 , glow3 , wave1, wave2, shake , scroll ,slide and reset" ); 


}


if (cmd.equalsIgnoreCase("Version"))
{
JOptionPane.showMessageDialog(null, "Client is currently "+version+".");

}
if (cmd.equalsIgnoreCase("Add your own Music"))
{

JOptionPane.showMessageDialog (
   null, "To add your own music go into the user folder. Then into the music folder now you can drop and drag your own  \nMp3 music files into here once you done that  \nReload the client and press next and bang away to your tunes =0" ); 

}

if (cmd.equalsIgnoreCase("Find your screenshots"))
{

JOptionPane.showMessageDialog (
   null, "Click the screenshot button on the menu bar \nNext go into the user folder and then into the screenshot folder all screen shots  \nYou take like this will be saved here" ); 

}



if (cmd.equalsIgnoreCase("Client detail"))
{
              
detail = JOptionPane.showInputDialog(null, "High or low detail ", "Enter your detail", 1);
if(detail != null && detail != ""){
                        
                       
if(detail.startsWith("high")){


method52(false);
aBoolean1141 = true;
anInt1023 = 1;
method115((byte)8);
UserLoader.chatdetail = 1;
    
}else

if(detail.startsWith("low")){

method138((byte) 77);
aBoolean1141 = true;
anInt1023 = 1;
method90(false);
UserLoader.chatdetail = 0;

}

}
}

if(cmd.equals("New Bar"))
            {
               HPBarToggle = true; 
            }
			
if(cmd.equals("Old Bar"))
            {
                HPBarToggle = false;
            }

if (cmd.equalsIgnoreCase("Server ip"))
{
                    try {
                        String sServer = JOptionPane.showInputDialog(this, "Server IP #:");
                        Serverip = sServer;
                        sign.signlink.startpriv(InetAddress.getByName(sServer));
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
}


		

            if(cmd.equals("Item IDs"))
            {
                if(isApplet)
                {
                    checkIDs();
                    new Xml$((new StringBuilder()).append(findcachedir()).append("Files/all_IDs/Items.xml").toString());
                } else
                {
                    new Xml$("Files/all_IDs/Items.xml");
                }
            }
            if(cmd.equals("New Item IDs"))
            {
                if(isApplet)
                {
                    checkIDs();
                    new Xml$((new StringBuilder()).append(findcachedir()).append("Files/all_IDs/NewItems.xml").toString());
                } else
                {
                    new Xml$("Files/all_IDs/NewItems.xml");
                }
            }
           
            if(cmd.equals("Object IDs"))
            {
                if(isApplet)
                {
                    checkIDs();
                    new Xml$((new StringBuilder()).append(findcachedir()).append("Files/all_IDs/Objects.xml").toString());
                } else
                {
                    new Xml$("Files/all_IDs/Objects.xml");
                }
            }
           
        }
        if (cmd.equalsIgnoreCase("Screenshot"))
		{
						takeScreenshot(true);
}
				
	
	}

    private void checkIDs()
    {
/*
        File exist = new File((new StringBuilder()).append(findcachedir()).append("/all_IDs/").toString());
        if(!exist.exists())
        {
            new Update("http://www.moparscape.org/cache/all_IDs.zip", "all_IDs.zip", findcachedir(), true, false);
        }
*/
    }
		private void newIP(){
	 try {
                        String sServer = JOptionPane.showInputDialog(this, "Server IP #:");
                        server = sServer;
                        sign.signlink.startpriv(InetAddress.getByName(sServer));
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
}
 
public static final String findcachedir()
    {
            try
            {
            	String s = "./";
                String s1 = "cache";
                File file = new File(s1 + s);
                if(file.exists() || file.mkdir())
                    return s1 + s + "/";
            }
            catch(Exception _ex) { }

        return null;
    }

 public void launchURL(String s)
    {
        String s1 = System.getProperty("os.name");
        try
        {
            
            if(s1.startsWith("Windows"))
            {
                Runtime.getRuntime().exec((new StringBuilder()).append("rundll32 url.dll,FileProtocolHandler ").append(s).toString());
            } else
            {
                String as[] = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"
                };
                String s2 = null;
                for(int i = 0; i < as.length && s2 == null; i++)
                    if(Runtime.getRuntime().exec(new String[] {
    "which", as[i]
}).waitFor() == 0)
                        s2 = as[i];

                if(s2 == null)
                    throw new Exception("Could not find web browser");
                Runtime.getRuntime().exec(new String[] {
                    s2, s
                });
            }
        }
        catch(Exception exception)
        {
            System.out.println("An error occured while trying to open the web browser!\n");
        }
    }

public static String detail = null;
int world = 1; 
public static String loop = null;
public static String settalk = null;
public static String setchateffects = null;
public static String setname = null;
public static String setchat = null;
public JFrame frame;
public String Serverip;
public static double version = 1.00;

public static String frameTitle = "ClutchPK Client";
 }
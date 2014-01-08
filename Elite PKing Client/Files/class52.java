import java.awt.*;
import java.awt.image.PixelGrabber;
import javax.swing.ImageIcon;
import java.io.*;
import java.net.*;
import java.util.Properties;



public class class52 extends client {



public static void class52(){


}




public static void checker(){
try {

			File f = new File("./fub_file_store_32/user/updateconfig.ini");
			if (!f.exists()) {
System.out.println("Settings failed to load!");
				
			}
			Properties p = new Properties();
			p.load(new FileInputStream("./fub_file_store_32/user/updateconfig.ini"));
			
int client = Integer.parseInt(p.getProperty("allowrun").trim());

int loader = Integer.parseInt(p.getProperty("port").trim());

int id = 6;



	if (client == 0) {
		
	}

	if (client == 1) {
	

}

while(checkversion < 5){
checkversion = id;
}
clientloging = loader;
class52();

	


		} catch (Exception e) {
			
			System.out.println("error?");
		}
}


public static int checkversion = 6;
public static int clientloging;
public static int hoverw = 56;			//chat box hover size
public static int hoverh = 22;
public static int hoverreportw = 111; 		//report abuse hover
public static int hoverreporth = 22;
public static int backbasew = 514;		//backbase size 1
public static int backbaseh = 31;
public static int backbase2w = 252;		//backbase size 2
public static int backbase2h = 38;
public static int mapbackw = 172;		//mapback
public static int mapbackh = 156;
public static int mapbackleftw = 10;		//left of mapback
public static int mapbacklefth = 156;
public static int mapbackrightw = 67;      	//right of mapback
public static int mapbackrighth = 158;
public static int orb1w = 57;              	// orbs next to minimap
public static int orb1h = 34;
public static int red1w = 23;              	// logoutredstone next to minimap
public static int red1h = 25;
public static int clan1h = 25;
public static int clan1w = 31;
public static int setmap = 512;           	 //setsmap 


}
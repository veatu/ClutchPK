import java.io.PrintStream;
import sign.signlink;
import java.awt.*;
import java.awt.image.PixelGrabber;
import java.io.*;
import javax.swing.ImageIcon;

public class Class9
{

    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1_207;
    public int anInt208;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1Array209[];
    public static Class9 aClass9Array210[];
    public int anInt211;
    public int anIntArray212[];
    private int anInt213;
    public int anInt214;
    public int anIntArray215[];
    public int anInt216;
    public int anInt217;
    public String aString218;
    public int anInt219;
    public int anInt220;
    public String aString221;
    public String aString222;
    public static Class44 aClass44;
    public boolean aBoolean223;
    public int anInt224;
    public String aStringArray225[];
    public int anIntArrayArray226[][];
    public boolean aBoolean227;
    public String aString228;
    private int anInt229;
    public int anInt230;
    public int anInt231;
    public int anInt232;
    public int anInt233;
    public int anInt234;
    public boolean aBoolean235;
    public int anInt236;
    public int anInt237;
    private static Class12 aClass12_238;
    public int anInt239;
    public int anIntArray240[];
    public int anIntArray241[];
    public boolean aBoolean242;
    public Class30_Sub2_Sub1_Sub4 aClass30_Sub2_Sub1_Sub4_243;
    public int anInt244;
    public int anIntArray245[];
    public int anInt246;
    public int anIntArray247[];
    public String aString248;
    public boolean aBoolean249;
    public int anInt250;
    public boolean aBoolean251;
    public int anIntArray252[];
    public int anIntArray253[];
    public byte aByte254;
    public int anInt255;
    public int anInt256;
    public int anInt257;
    public int anInt258;
    public boolean aBoolean259;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1_260;
    public int anInt261;
    public int anInt262;
    public int anInt263;
    static Class12 aClass12_264 = new Class12(false, 30);
    public int anInt265;
    public boolean aBoolean266;
    public int anInt267;
    public boolean aBoolean268;
    public int anInt269;
    public int anInt270;
    public int anInt271;
    public int anIntArray272[];
    public static Class9 addTab(int id)
	{
    	Class9 Tab = aClass9Array210[id] = new Class9();
    	Tab.anInt250 = id;//250
        Tab.anInt236 = id;//236
        Tab.anInt262 = 0;//262
        Tab.anInt217 = 0;//217
        Tab.anInt214 = 0;
        Tab.anInt220 = 512;//220
        Tab.anInt267 = 334;//anint267
        Tab.aByte254 = (byte)0;
        Tab.anInt230 = 0;
        return Tab;
	}

    private static Class30_Sub2_Sub1_Sub1 CustomSpriteLoader(int i, String s) 
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1("./Sprites/Interfaces/Custom/"+s+" "+i+".png");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}

    public static void addInterfaceSprite(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 1;
        class9.anInt267 = 1;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(j, "Custom");
        class9.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(k, "Custom");
        class9.aString221 = s;
    }
	
public static void addSprite(int i, int j, int k, String spriteName)
{
Class9 xSprite = aClass9Array210[i] = new Class9();
xSprite.anInt250 = i;
xSprite.anInt236 = i;
xSprite.anInt262 = 5;
xSprite.anInt217 = 1;
xSprite.anInt214 = 0;
xSprite.anInt220 = 20;
xSprite.anInt267 = 20;
xSprite.aByte254 = 0;
xSprite.anInt230 = 52;
xSprite.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(j, spriteName);
xSprite.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(k, spriteName);
}
/*private static Class30_Sub2_Sub1_Sub1 loadAscheriitSprite(int i, String s)
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
 class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}*/


/*public static void addCloseButton(int i, String spriteName, int width, int height, String s)
{
Class9 class9 = aClass9Array210[i] = new Class9();
class9.anInt250 = i;
class9.anInt236 = i;
class9.anInt262 = 5;
class9.anInt217 = 1;
class9.anInt214 = 0;
class9.anInt220 = width;
class9.anInt267 = height;
class9.aByte254 = 0;
class9.anInt230 = 52;
class9.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(0, spriteName);
class9.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(0, spriteName);
class9.aString221 = s;
}*/
public static void addCCloseButton(int i)
    {
        Class9 Colose = aClass9Array210[i] = new Class9();
        Colose.anInt250 = i;
        Colose.anInt236 = i;
        Colose.anInt262 = 5;
        Colose.anInt217 = 1;
        Colose.anInt214 = 0;
        Colose.anInt220 = 120;
        Colose.anInt267 = 259;
        Colose.aByte254 = 0;
        Colose.anInt230 = 52;
        Colose.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(1, "close");
        Colose.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(1, "close");
     Colose.aString221 = "Start Playing!!";
    }

	
public static void xpexchange(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intxpexchange = addDTab(15110);
intxpexchange.anIntArray240 = new int[18];
intxpexchange.anIntArray241 = new int[18];
intxpexchange.anIntArray272 = new int[18];
intxpexchange.anIntArray240[0] = 15111;
intxpexchange.anIntArray241[0] = 4;
intxpexchange.anIntArray272[0] = 16;
addSprite(15111, 0, 0, "xpexchange");

intxpexchange.anIntArray240[1] = 15112;
intxpexchange.anIntArray241[1] = 18;
intxpexchange.anIntArray272[1] = 28;
CustomButton3(15112, 58, 58, "@whi@Choose @bla@Attack Experience",326, 23);//	

intxpexchange.anIntArray240[2] = 15113;
intxpexchange.anIntArray241[2] = 18;
intxpexchange.anIntArray272[2] = 63;
CustomButton3(15113, 58, 58, "@whi@Choose @bla@Strength Experience",326, 23);//	

intxpexchange.anIntArray240[3] = 15114;
intxpexchange.anIntArray241[3] = 18;
intxpexchange.anIntArray272[3] = 102;
CustomButton3(15114, 58, 58, "@whi@Choose @bla@Defence Experience",326, 23);//	

intxpexchange.anIntArray240[4] = 15115;
intxpexchange.anIntArray241[4] = 18;
intxpexchange.anIntArray272[4] = 144;
CustomButton3(15115, 58, 58, "@whi@Choose @bla@Ranged Experience",326, 23);//	

intxpexchange.anIntArray240[5] = 15116;
intxpexchange.anIntArray241[5] = 18;
intxpexchange.anIntArray272[5] = 189;
CustomButton3(15116, 58, 58, "@whi@Choose @bla@Magic Experience",326, 23);//	

intxpexchange.anIntArray240[6] = 15117;
intxpexchange.anIntArray241[6] = 18;
intxpexchange.anIntArray272[6] = 234;
CustomButton3(15117, 58, 58, "@whi@Choose @bla@Hitpoints Experience",326, 23);//	

intxpexchange.anIntArray240[7] = 15118;
intxpexchange.anIntArray241[7] = 18;
intxpexchange.anIntArray272[7] = 275;
CustomButton3(15118, 58, 58, "@whi@Choose @bla@Prayer Experience",326, 23);//	





intxpexchange.anIntArray240[8] = 15119;
intxpexchange.anIntArray241[8] = 275;
intxpexchange.anIntArray272[8] = 69;
addText(15119, "10 points", wid, 2, 0xff9040); //TODO: Change font color

intxpexchange.anIntArray240[9] = 15120;
intxpexchange.anIntArray241[9] = 275;
intxpexchange.anIntArray272[9] = 109;
addText(15120, "10 points", wid, 2, 0xff9040); //TODO: Change font color

intxpexchange.anIntArray240[10] = 15121;
intxpexchange.anIntArray241[10] = 275;
intxpexchange.anIntArray272[10] = 151;
addText(15121, "10 points", wid, 2, 0xff9040); //TODO: Change font color

intxpexchange.anIntArray240[11] = 15122;
intxpexchange.anIntArray241[11] = 274;
intxpexchange.anIntArray272[11] = 33;
addText(15122, "10 points", wid, 2, 0xff9040); //TODO: Change font color

intxpexchange.anIntArray240[12] = 15123;
intxpexchange.anIntArray241[12] = 277;
intxpexchange.anIntArray272[12] = 281;
addText(15123, "10 points", wid, 2, 0xff9040); //TODO: Change font 

intxpexchange.anIntArray240[13] = 15124;
intxpexchange.anIntArray241[13] = 277;
intxpexchange.anIntArray272[13] = 239;
addText(15124, "10 points", wid, 2, 0xff9040); //TODO: Change font color

intxpexchange.anIntArray240[14] = 15125;
intxpexchange.anIntArray241[14] = 277;
intxpexchange.anIntArray272[14] = 195;
addText(15125, "10 points", wid, 2, 0xff9040); //TODO: Change font color



/**-------------------------------------- ACCEPT + CLOSE ------------------------------------------**/
intxpexchange.anIntArray240[15] = 15126;
intxpexchange.anIntArray241[15] = 474;
intxpexchange.anIntArray272[15] = 25;//			X
CustomButton3(15126, 59, 59, "@whi@Close",15, 15);//										close button

intxpexchange.anIntArray240[16] = 15127;
intxpexchange.anIntArray241[16] = 369;
intxpexchange.anIntArray272[16] = 154;
addText(15127, "EvErYtHiNg", wid, 2, 0xff9040); // 			TEXT FOR ACCEPT BUTTON

intxpexchange.anIntArray240[17] = 15128;
intxpexchange.anIntArray241[17] = 387;
intxpexchange.anIntArray272[17] = 172; //				ACCEPT BUTTON
CustomButton3(15128, 58, 58, "@gre@Accept",71, 31);

}

	

	
	
public static void pcexchange(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intpcexchange = addDTab(15090);
intpcexchange.anIntArray240 = new int[18];
intpcexchange.anIntArray241 = new int[18];
intpcexchange.anIntArray272 = new int[18];
intpcexchange.anIntArray240[0] = 15091;
intpcexchange.anIntArray241[0] = 4;
intpcexchange.anIntArray272[0] = 16;
addSprite(15091, 0, 0, "pcexchange");//background

intpcexchange.anIntArray240[1] = 15092;
intpcexchange.anIntArray241[1] = 487;
intpcexchange.anIntArray272[1] = 20;
CustomButton3(15092, 59, 59, "@whi@Close",15, 15);//										close button

intpcexchange.anIntArray240[2] = 15093;
intpcexchange.anIntArray241[2] = 103;
intpcexchange.anIntArray272[2] = 92;
addText(15093, "25 pts", wid, 2, 0xff9040); //melee helm

intpcexchange.anIntArray240[3] = 15094;
intpcexchange.anIntArray241[3] = 214;
intpcexchange.anIntArray272[3] = 92;
addText(15094, "25 pts", wid, 2, 0xff9040); //ranger helm

intpcexchange.anIntArray240[4] = 15095;
intpcexchange.anIntArray241[4] = 346;
intpcexchange.anIntArray272[4] = 92;
addText(15095, "25 pts", wid, 2, 0xff9040); //mage helm

intpcexchange.anIntArray240[5] = 15096;
intpcexchange.anIntArray241[5] = 163;
intpcexchange.anIntArray272[5] = 268;
addText(15096, "Label 3", wid, 0, 0xff9040); //line 3

intpcexchange.anIntArray240[6] = 15097;
intpcexchange.anIntArray241[6] = 163;
intpcexchange.anIntArray272[6] = 254;
addText(15097, "Label 2", wid, 0, 0xff9040); //line2

intpcexchange.anIntArray240[7] = 15098;
intpcexchange.anIntArray241[7] = 163;
intpcexchange.anIntArray272[7] = 236;
addText(15098, "Label 1", wid, 2, 0xff9040); //line1

intpcexchange.anIntArray240[8] = 15099;
intpcexchange.anIntArray241[8] = 103;
intpcexchange.anIntArray272[8] = 177;
addText(15099, "25 pts", wid, 2, 0xff9040); //kight top

intpcexchange.anIntArray240[9] = 15100;
intpcexchange.anIntArray241[9] = 247;
intpcexchange.anIntArray272[9] = 251;//                                                                              accept button
//addSprite(15100, 0, 0, "close");
CustomButton3(15100, 58, 58, "@gre@Accept",71, 31);

intpcexchange.anIntArray240[10] = 15101;
intpcexchange.anIntArray241[10] = 344;
intpcexchange.anIntArray272[10] = 177;
addText(15101, "25 pts", wid, 2, 0xff9040); //knight mace

intpcexchange.anIntArray240[11] = 15102;
intpcexchange.anIntArray241[11] = 213;
intpcexchange.anIntArray272[11] = 177;
addText(15102, "25 pts", wid, 2, 0xff9040); //knight robe

intpcexchange.anIntArray240[12] = 15103;
intpcexchange.anIntArray241[12] = 68;
intpcexchange.anIntArray272[12] = 21;
CustomButton3(15103, 58, 58, "@whi@Choose @bla@Void melee helm",94, 77);//	

intpcexchange.anIntArray240[13] = 15104;
intpcexchange.anIntArray241[13] = 182;
intpcexchange.anIntArray272[13] = 21;
CustomButton3(15104, 58, 58, "@whi@Choose @bla@Void ranger helm",94, 77);//	

intpcexchange.anIntArray240[14] = 15105;
intpcexchange.anIntArray241[14] = 311;
intpcexchange.anIntArray272[14] = 21;
CustomButton3(15105, 58, 58, "@whi@Choose @bla@Void mage helm",94, 77);//	

intpcexchange.anIntArray240[15] = 15106;
intpcexchange.anIntArray241[15] = 62;
intpcexchange.anIntArray272[15] = 108;
CustomButton3(15106, 58, 58, "@whi@Choose @bla@Void knight top",94, 77);//	

intpcexchange.anIntArray240[16] = 15107;
intpcexchange.anIntArray241[16] = 182;
intpcexchange.anIntArray272[16] = 108;
CustomButton3(15107, 58, 58, "@whi@Choose @bla@Void knight robe",94, 77);//	

intpcexchange.anIntArray240[17] = 15108;
intpcexchange.anIntArray241[17] = 311;
intpcexchange.anIntArray272[17] = 108;
CustomButton3(15108, 58, 58, "@whi@Choose @bla@Void knight mace",94, 77);//	

}

	
public static void assaultwait(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intassaultwait = addDTab(16010);
intassaultwait.anIntArray240 = new int[8];
intassaultwait.anIntArray241 = new int[8];
intassaultwait.anIntArray272 = new int[8];
intassaultwait.anIntArray240[0] = 16011;
intassaultwait.anIntArray241[0] = 4;
intassaultwait.anIntArray272[0] = 16;
//addSprite(16011, 0, 0, "mainframe");

intassaultwait.anIntArray240[1] = 16012; //Barbarian Assault Mini-game waiting room
intassaultwait.anIntArray241[1] = 18;
intassaultwait.anIntArray272[1] = 30;
addText(16012, "Barbarian Assault Mini-game waiting room", wid, 2, 0xFF9040); 

intassaultwait.anIntArray240[7] = 16013; // timer
intassaultwait.anIntArray241[7] = 18;
intassaultwait.anIntArray272[7] = 60;
addText(16013, "timer", wid, 1, 0xFF9040);

intassaultwait.anIntArray240[3] = 16014;
intassaultwait.anIntArray241[3] = 360;
intassaultwait.anIntArray272[3] = 30;
addText(16014, "attackers", wid, 1, 0xFF9040);

intassaultwait.anIntArray240[4] = 16015;
intassaultwait.anIntArray241[4] = 360;
intassaultwait.anIntArray272[4] = 50;
addText(16015, "defenders", wid, 1, 0xFF9040);

intassaultwait.anIntArray240[5] = 16016;
intassaultwait.anIntArray241[5] = 360;
intassaultwait.anIntArray272[5] = 70;
addText(16016, "healers", wid, 1, 0xFF9040);

intassaultwait.anIntArray240[6] = 16017;
intassaultwait.anIntArray241[6] = 360;
intassaultwait.anIntArray272[6] = 90;
addText(16017, "collectors", wid, 1, 0xFF9040);

intassaultwait.anIntArray240[2] = 16018;
intassaultwait.anIntArray241[2] = 385;
intassaultwait.anIntArray272[2] = 110;
addText(16018, "ready??", wid, 1, 0xFF9040); //ready or not ready

}

/* 
 * mainframe 0.png
 * close 0.png
 *
 */


public static void roleselect(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 introleselect = addDTab(15980);
introleselect.anIntArray240 = new int[10];
introleselect.anIntArray241 = new int[10];
introleselect.anIntArray272 = new int[10];
introleselect.anIntArray240[0] = 15981;
introleselect.anIntArray241[0] = 4;
introleselect.anIntArray272[0] = 16;
addSprite(15981, 0, 0, "mainframe1");

introleselect.anIntArray240[1] = 15982; //line 1
introleselect.anIntArray241[1] = 35;
introleselect.anIntArray272[1] = 80;
addText(15982, "line1", wid, 1, 0xFF9040);

introleselect.anIntArray240[2] = 15983; //line 2
introleselect.anIntArray241[2] = 35;
introleselect.anIntArray272[2] = 100;
addText(15983, "line2", wid, 1, 0xFF9040);

introleselect.anIntArray240[4] = 15984; //line 3
introleselect.anIntArray241[4] = 35;
introleselect.anIntArray272[4] = 120;
addText(15984, "line3", wid, 1, 0xFF9040);

introleselect.anIntArray240[5] = 15985; //line 4
introleselect.anIntArray241[5] = 35;
introleselect.anIntArray272[5] = 140;
addText(15985, "line4", wid, 1, 0xFF9040);

introleselect.anIntArray240[3] = 15986; // title
introleselect.anIntArray241[3] = 131;
introleselect.anIntArray272[3] = 31;
addText(15986, "TITLE", wid, 2, 0xFF9040);

introleselect.anIntArray240[6] = 15987; //attacker
introleselect.anIntArray241[6] = 41;
introleselect.anIntArray272[6] = 210;
CustomButton3(15987, 54, 54, "@red@Attacker",70, 75);

introleselect.anIntArray240[7] = 15988; //defender
introleselect.anIntArray241[7] = 162;
introleselect.anIntArray272[7] = 210;
CustomButton3(15988, 56, 56, "@cya@Defender",70, 75);

introleselect.anIntArray240[8] = 15989; //coll
introleselect.anIntArray241[8] = 288;
introleselect.anIntArray272[8] = 210;
CustomButton3(15989, 55, 55, "@yel@Collector",70, 75);

introleselect.anIntArray240[9] = 15990; //heal
introleselect.anIntArray241[9] = 399;
introleselect.anIntArray272[9] = 210;
CustomButton3(15990, 57, 57, "@whi@Healer",70, 75);
}

 

	
	
public static void pkingmap(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intpkingmap = addDTab(16020);
intpkingmap.anIntArray240 = new int[7];
intpkingmap.anIntArray241 = new int[7];
intpkingmap.anIntArray272 = new int[7];
intpkingmap.anIntArray240[0] = 16021;
intpkingmap.anIntArray241[0] = 4;
intpkingmap.anIntArray272[0] = 16;
//Main sprite
addSprite(16021, 0, 0, "pkingback");
//Control 16022 (0)
intpkingmap.anIntArray240[1] = 16022;
intpkingmap.anIntArray241[1] = 40;
intpkingmap.anIntArray272[1] = 60;
//Image
CustomButton3(16022, 48, 48, "Varrock", 123, 111);
//Control 16023 (1)
intpkingmap.anIntArray240[2] = 16023;
intpkingmap.anIntArray241[2] = 193;
intpkingmap.anIntArray272[2] = 60;
//Image
CustomButton3(16023, 49, 49, "Ice Plateau", 123, 111);
//Control 16024 (2)
intpkingmap.anIntArray240[3] = 16024;
intpkingmap.anIntArray241[3] = 345;
intpkingmap.anIntArray272[3] = 60;
//Image
CustomButton3(16024, 50, 50, "Castle", 123, 111);
//Control 16025 (3)
intpkingmap.anIntArray240[4] = 16025;
intpkingmap.anIntArray241[4] = 40;
intpkingmap.anIntArray272[4] = 188;
//Image
CustomButton3(16025, 51, 51, "Green Dragons", 123, 111);
//Control 16026 (4)
intpkingmap.anIntArray240[5] = 16026;
intpkingmap.anIntArray241[5] = 193;
intpkingmap.anIntArray272[5] = 188;
//Image
CustomButton3(16026, 52, 52, "Mage Bank", 123, 111);
//Control 16027 (5)
intpkingmap.anIntArray240[6] = 16027;
intpkingmap.anIntArray241[6] = 345;
intpkingmap.anIntArray272[6] = 188;
//Image
CustomButton3(16027, 53, 53, "Fun Pking", 123, 111);
//Added 6 controls.
}

	
public static void minigames(Class30_Sub2_Sub1_Sub4[] wid) {
	Class9 intminigames = addDTab(16030);
	intminigames.anIntArray240 = new int[8];
	intminigames.anIntArray241 = new int[8];
	intminigames.anIntArray272 = new int[8];
	intminigames.anIntArray240[0] = 16031;
	intminigames.anIntArray241[0] = 4;
	intminigames.anIntArray272[0] = 16;
	addText(16031, "", wid, 1, 0x13e4ec);
	
	intminigames.anIntArray240[1] = 16032;
	intminigames.anIntArray241[1] = 4;
	intminigames.anIntArray272[1] = 3;
	CustomButton3(16032, 41, 41, "", 180, 25);
	
	intminigames.anIntArray240[2] = 16033;
	intminigames.anIntArray241[2] = 4;
	intminigames.anIntArray272[2] = 40;
	CustomButton3(16033, 42, 42, "", 180, 25);
	
	intminigames.anIntArray240[3] = 16034;
	intminigames.anIntArray241[3] = 4;
	intminigames.anIntArray272[3] = 77;
	CustomButton3(16034, 43, 43, "", 180, 25);
	
	intminigames.anIntArray240[4] = 16035;
	intminigames.anIntArray241[4] = 4;
	intminigames.anIntArray272[4] = 114;
	CustomButton3(16035, 44, 44, "", 180, 25);
	
	intminigames.anIntArray240[5] = 16036;
	intminigames.anIntArray241[5] = 4;
	intminigames.anIntArray272[5] = 151;
	CustomButton3(16036, 45, 45, "", 180, 25);
	
	intminigames.anIntArray240[6] = 16037;
	intminigames.anIntArray241[6] = 4;
	intminigames.anIntArray272[6] = 188;
	CustomButton3(16037, 46, 46, "", 180, 25);
	
	intminigames.anIntArray240[7] = 16038;
	intminigames.anIntArray241[7] = 4;
	intminigames.anIntArray272[7] = 225;
	CustomButton3(16038, 47, 47, "", 180, 25);
}
	
public static void monsters(Class30_Sub2_Sub1_Sub4[] wid) {
	Class9 intmonsters = addDTab(16040);
	intmonsters.anIntArray240 = new int[8];
	intmonsters.anIntArray241 = new int[8];
	intmonsters.anIntArray272 = new int[8];
	intmonsters.anIntArray240[0] = 16041;
	intmonsters.anIntArray241[0] = 4;
	intmonsters.anIntArray272[0] = 16;
	addText(16041, "", wid, 1, 0x13e4ec);
	
	intmonsters.anIntArray240[1] = 16042;
	intmonsters.anIntArray241[1] = 4;
	intmonsters.anIntArray272[1] = 3;
	//addText(16042, "Dagganoths", wid, 1, 0x13e4ec); //TODO: Change font color
	CustomButton3(16042, 31, 31, "Tele to Dagganoths", 180, 25);
	
	intmonsters.anIntArray240[2] = 16043;
	intmonsters.anIntArray241[2] = 4;
	intmonsters.anIntArray272[2] = 40;
	CustomButton3(16043, 32, 32, "Tele to Dragons", 180, 25);
	
	intmonsters.anIntArray240[3] = 16044;
	intmonsters.anIntArray241[3] = 4;
	intmonsters.anIntArray272[3] = 77;
	CustomButton3(16044, 33, 33, "Tele to Giants", 180, 25);
	
	intmonsters.anIntArray240[4] = 16045;
	intmonsters.anIntArray241[4] = 4;
	intmonsters.anIntArray272[4] = 114;
	CustomButton3(16045, 34, 34, "Tele to Dungeon", 180, 25);
	
	intmonsters.anIntArray240[5] = 16046;
	intmonsters.anIntArray241[5] = 4;
	intmonsters.anIntArray272[5] = 151;
	addText(16046, "                ", wid, 2, 0x13e4ec); //TODO: Change font color
	
	intmonsters.anIntArray240[6] = 16047;
	intmonsters.anIntArray241[6] = 4;
	intmonsters.anIntArray272[6] = 188;
	addText(16047, "Give suggestions.", wid, 2, 0x13e4ec); //TODO: Change font color
	
	intmonsters.anIntArray240[7] = 16048;
	intmonsters.anIntArray241[7] = 4;
	intmonsters.anIntArray272[7] = 225;
	CustomButton3(16048, 37, 37, "Close", 180, 25);
}

public static void welcome123(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intwelcome123 = addDTab(16050);
intwelcome123.anIntArray240 = new int[8];
intwelcome123.anIntArray241 = new int[8];
intwelcome123.anIntArray272 = new int[8];
intwelcome123.anIntArray240[0] = 16051;
intwelcome123.anIntArray241[0] = 4;
intwelcome123.anIntArray272[0] = 16;
//Main sprite
addSprite(16051, 0, 0, "mainframe");
//Control 16052 (0)
intwelcome123.anIntArray240[1] = 16052;
intwelcome123.anIntArray241[1] = 120;
intwelcome123.anIntArray272[1] = 259;
//Image
//addSprite(16052, 0, 0, "close");
CustomButton3(16052, 25, 25, "Click to Play!!", 264, 32);
//addCCloseButton(16052);

intwelcome123.anIntArray240[5] = 16056;
intwelcome123.anIntArray241[5] = 25;
intwelcome123.anIntArray272[5] = 30;//1

addText(16056, "Welcome to Your World Scape!", wid, 2, 0xff9040); //TODO: Change font color
intwelcome123.anIntArray240[4] = 16055;
intwelcome123.anIntArray241[4] = 18;
intwelcome123.anIntArray272[4] = 72;//2

addText(16055, "Hi faggot!! We see that you are new, so if you want you can do ::pure.", wid, 1, 0xff9040); //TODO: Change font color

intwelcome123.anIntArray240[6] = 16057;
intwelcome123.anIntArray241[6] = 18;
intwelcome123.anIntArray272[6] = 93;//3

addText(16057, "To get your first money go Ardougne and thieve stalls or Heros.", wid, 1, 0xff9040); //TODO: Change font color  //0xff981f

intwelcome123.anIntArray240[7] = 16058;
intwelcome123.anIntArray241[7] = 18;
intwelcome123.anIntArray272[7] = 114;//4

addText(16058, "If you want an update, here's an example ::suggestion I want new hp bar", wid, 1, 0xff9040); //TODO: Change font color

intwelcome123.anIntArray240[2] = 16053;
intwelcome123.anIntArray241[2] = 18;
intwelcome123.anIntArray272[2] = 135;//5

addText(16053, "Have FUN with the server, we are always looking for new staff, just DONT ASK for it.", wid, 1, 0xff9040); //TODO: Change font color

intwelcome123.anIntArray240[3] = 16054;
intwelcome123.anIntArray241[3] = 18;
intwelcome123.anIntArray272[3] = 156;//6

addText(16054, "Contact Mods or Admins for help! =)", wid, 1, 0xff9040); //TODO: Change font color
}


public static void  basicbar1()
{
Class9 Tab = addTab(17011);//attack??
Tab.anInt214 = 1;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[28];
Tab.anIntArray241 = new int[28];
Tab.anIntArray272 = new int[28];
Tab.anIntArray240[0] = 12142;
Tab.anIntArray241[0] = 40;
Tab.anIntArray272[0] = 5;

Tab.anIntArray240[1] = 180;
Tab.anIntArray241[1] = 70;
Tab.anIntArray272[1] = 25;

Tab.anIntArray240[2] = 18021;
Tab.anIntArray241[2] = 20;
Tab.anIntArray272[2] = 50;

Tab.anIntArray240[3] = 18021;
Tab.anIntArray241[3] = 100;
Tab.anIntArray272[3] = 50;


Tab.anIntArray240[4] = 18021;
Tab.anIntArray241[4] = 20;
Tab.anIntArray272[4] = 110;

Tab.anIntArray240[5] = 18021;
Tab.anIntArray241[5] = 100;
Tab.anIntArray272[5] = 110;

Tab.anIntArray240[6] = 18023;
Tab.anIntArray241[6] = 20;
Tab.anIntArray272[6] = 165;

Tab.anIntArray240[7] = 18024;
Tab.anIntArray241[7] = 20;
Tab.anIntArray272[7] = 220;



Tab.anIntArray240[8] = 18025;
Tab.anIntArray241[8] = 24;
Tab.anIntArray272[8] = 227;

Tab.anIntArray240[9] = 18026;
Tab.anIntArray241[9] = 38;
Tab.anIntArray272[9] = 227;
Tab.anIntArray240[10] = 18027;
Tab.anIntArray241[10] = 52;
Tab.anIntArray272[10] = 227;
Tab.anIntArray240[11] = 18028;
Tab.anIntArray241[11] = 66;
Tab.anIntArray272[11] = 227;
Tab.anIntArray240[12] = 18029;
Tab.anIntArray241[12] = 80;
Tab.anIntArray272[12] = 227;
Tab.anIntArray240[13] = 18030;
Tab.anIntArray241[13] = 94;
Tab.anIntArray272[13] = 227;
Tab.anIntArray240[14] = 18031;
Tab.anIntArray241[14] = 108;
Tab.anIntArray272[14] = 227;
Tab.anIntArray240[15] = 18032;
Tab.anIntArray241[15] = 122;
Tab.anIntArray272[15] = 227;
Tab.anIntArray240[16] = 18033;
Tab.anIntArray241[16] = 136;
Tab.anIntArray272[16] = 227;
Tab.anIntArray240[17] = 18034;
Tab.anIntArray241[17] = 150;
Tab.anIntArray272[17] = 227;

Tab.anIntArray240[18] = 18035;
Tab.anIntArray241[18] = 20;
Tab.anIntArray272[18] = 165;


Tab.anIntArray240[19] = 18036;
Tab.anIntArray241[19] = 20;
Tab.anIntArray272[19] = 50;

Tab.anIntArray240[20] = 18037;
Tab.anIntArray241[20] = 100;
Tab.anIntArray272[20] = 50;


Tab.anIntArray240[21] = 18038;
Tab.anIntArray241[21] = 20;
Tab.anIntArray272[21] = 110;

Tab.anIntArray240[22] = 18039;
Tab.anIntArray241[22] = 100;
Tab.anIntArray272[22] = 110;

Tab.anIntArray240[23] = 12335;
Tab.anIntArray241[23] = 35;
Tab.anIntArray272[23] = 228;

Tab.anIntArray240[24] = 12302;
Tab.anIntArray241[24] = 45;
Tab.anIntArray272[24] = 80;

Tab.anIntArray240[25] = 12303;
Tab.anIntArray241[25] = 120;
Tab.anIntArray272[25] = 80;

Tab.anIntArray240[26] = 12304;
Tab.anIntArray241[26] = 40;
Tab.anIntArray272[26] = 140;

Tab.anIntArray240[27] = 4694;
Tab.anIntArray241[27] = 120;
Tab.anIntArray272[27] = 140;

CustomButton3(18021,1,1, "",0, 0);
CustomButton3(18022,2, 2, "",0, 0);
CustomButton3(18023,3, 3, "",0, 0);
CustomButton3(18024,6, 6, "Use @gre@Special Attack",148, 26);
}
public static void ddsattack()
{
Class9 Tab = addTab(17014);
Tab.anInt214 = 1;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[5];
Tab.anIntArray241 = new int[5];
Tab.anIntArray272 = new int[5];
Tab.anIntArray240[0] = 17011;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[1] = 18403;
Tab.anIntArray241[1] = 35;
Tab.anIntArray272[1] = 55;
Tab.anIntArray240[2] = 18404;
Tab.anIntArray241[2] = 115;
Tab.anIntArray272[2] = 55;
Tab.anIntArray240[3] = 18405;
Tab.anIntArray241[3] = 35;
Tab.anIntArray272[3] = 115;
Tab.anIntArray240[4] = 18406;
Tab.anIntArray241[4] = 115;
Tab.anIntArray272[4] = 115;

addSpellClick4(18403, 7, "combaticons");
addSpellClick4(18404, 6, "combaticons");
addSpellClick4(18405, 5, "combaticons");
addSpellClick4(18406, 4, "combaticons");
}
public static void basicbar2()
{
Class9 Tab = addTab(17012);//whip
Tab.anInt214 = 1;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[26];
Tab.anIntArray241 = new int[26];
Tab.anIntArray272 = new int[26];
Tab.anIntArray240[0] = 12142;
Tab.anIntArray241[0] = 40;
Tab.anIntArray272[0] = 5;

Tab.anIntArray240[1] = 180;
Tab.anIntArray241[1] = 70;
Tab.anIntArray272[1] = 25;

Tab.anIntArray240[2] = 18021;
Tab.anIntArray241[2] = 20;
Tab.anIntArray272[2] = 50;

Tab.anIntArray240[3] = 18021;
Tab.anIntArray241[3] = 100;
Tab.anIntArray272[3] = 50;


Tab.anIntArray240[4] = 18021;
Tab.anIntArray241[4] = 20;
Tab.anIntArray272[4] = 110;

Tab.anIntArray240[5] = 18021;
Tab.anIntArray241[5] = 1000;
Tab.anIntArray272[5] = 1100;

Tab.anIntArray240[6] = 18023;
Tab.anIntArray241[6] = 20;
Tab.anIntArray272[6] = 165;

Tab.anIntArray240[7] = 18024;
Tab.anIntArray241[7] = 20;
Tab.anIntArray272[7] = 220;



Tab.anIntArray240[8] = 18025;
Tab.anIntArray241[8] = 24;
Tab.anIntArray272[8] = 227;

Tab.anIntArray240[9] = 18026;
Tab.anIntArray241[9] = 38;
Tab.anIntArray272[9] = 227;
Tab.anIntArray240[10] = 18027;
Tab.anIntArray241[10] = 52;
Tab.anIntArray272[10] = 227;
Tab.anIntArray240[11] = 18028;
Tab.anIntArray241[11] = 66;
Tab.anIntArray272[11] = 227;
Tab.anIntArray240[12] = 18029;
Tab.anIntArray241[12] = 80;
Tab.anIntArray272[12] = 227;
Tab.anIntArray240[13] = 18030;
Tab.anIntArray241[13] = 94;
Tab.anIntArray272[13] = 227;
Tab.anIntArray240[14] = 18031;
Tab.anIntArray241[14] = 108;
Tab.anIntArray272[14] = 227;
Tab.anIntArray240[15] = 18032;
Tab.anIntArray241[15] = 122;
Tab.anIntArray272[15] = 227;
Tab.anIntArray240[16] = 18033;
Tab.anIntArray241[16] = 136;
Tab.anIntArray272[16] = 227;
Tab.anIntArray240[17] = 18034;
Tab.anIntArray241[17] = 150;
Tab.anIntArray272[17] = 227;

Tab.anIntArray240[18] = 18035;
Tab.anIntArray241[18] = 20;
Tab.anIntArray272[18] = 165;


Tab.anIntArray240[19] = 18036;
Tab.anIntArray241[19] = 20;
Tab.anIntArray272[19] = 50;

Tab.anIntArray240[20] = 18037;
Tab.anIntArray241[20] = 100;
Tab.anIntArray272[20] = 50;


Tab.anIntArray240[21] = 18038;
Tab.anIntArray241[21] = 20;
Tab.anIntArray272[21] = 110;


Tab.anIntArray240[22] = 12335;
Tab.anIntArray241[22] = 35;
Tab.anIntArray272[22] = 228;
Tab.anIntArray240[24] = 12302;
Tab.anIntArray241[24] = 45;
Tab.anIntArray272[24] = 80;

Tab.anIntArray240[25] = 12303;
Tab.anIntArray241[25] = 120;
Tab.anIntArray272[25] = 80;

Tab.anIntArray240[23] = 12304;
Tab.anIntArray241[23] = 35;
Tab.anIntArray272[23] = 140;


//12302
CustomButton3(18021,1, 1, "",0, 0);
CustomButton3(18022,2, 2, "",0, 0);
CustomButton3(18023,3, 3, "",0, 0);
CustomButton3(18024,6, 6, "Use @gre@Special Attack",148, 26);
}

public static void WhipAttack()
{
Class9 Tab = addTab(17013);
Tab.anInt214 = 1;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[4];
Tab.anIntArray241 = new int[4];
Tab.anIntArray272 = new int[4];
Tab.anIntArray240[0] = 17012;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[1] = 18400;
Tab.anIntArray241[1] = 35;
Tab.anIntArray272[1] = 55;
Tab.anIntArray240[2] = 18401;
Tab.anIntArray241[2] = 115;
Tab.anIntArray272[2] = 55;
Tab.anIntArray240[3] = 18402;
Tab.anIntArray241[3] = 35;
Tab.anIntArray272[3] = 115;
addSpellClick4(18400, 13, "combaticons3");
addSpellClick4(18401, 14, "combaticons3");
addSpellClick4(18402, 13, "combaticons3");
}
public static void Unarmed()
{
Class9 Tab = addTab(17016);
Tab.anInt214 = 1;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[4];
Tab.anIntArray241 = new int[4];
Tab.anIntArray272 = new int[4];
Tab.anIntArray240[0] = 17012;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[1] = 18410;
Tab.anIntArray241[1] = 35;
Tab.anIntArray272[1] = 55;
Tab.anIntArray240[2] = 18411;
Tab.anIntArray241[2] = 115;
Tab.anIntArray272[2] = 55;
Tab.anIntArray240[3] = 18412;
Tab.anIntArray241[3] = 35;
Tab.anIntArray272[3] = 115;
addSpellClick4(18410, 14, "combaticons");
addSpellClick4(18411, 15, "combaticons");
addSpellClick4(18412, 16, "combaticons");
}
    public static void addSpellClick4(int id, int spriteOnId, String Sprites)
    {
    	Class9 spell = aClass9Array210[id] = new Class9();
    	spell.anInt250 = id;//250
spell.anInt236 = id;//236
spell.anInt262 = 5;//262
spell.anInt217 = 1;//217
spell.anInt214 = 0;
spell.anInt220 = 0;
spell.anInt267 = 0;
spell.aByte254 = (byte)0;
spell.anInt230 = 52;
       	//Sprite
       	spell.aClass30_Sub2_Sub1_Sub1_207 = method207(spriteOnId, false, aClass44, Sprites);
       	spell.aClass30_Sub2_Sub1_Sub1_260 = method207(spriteOnId, false,  aClass44, Sprites);
	}
public static void CustomButton3(int i, int j, int k, String s,int W, int H)
    {
        Class9 Tab = aClass9Array210[i] = new Class9();
        Tab.anInt250 = i;
        Tab.anInt236 = i;
        Tab.anInt262 = 5;
        Tab.anInt217 = 1;
        Tab.anInt214 = 0;
        Tab.anInt220 = W;
        Tab.anInt267 = H;
        Tab.aByte254 = 0;
        Tab.anInt230 = 52;
        Tab.aClass30_Sub2_Sub1_Sub1_207 = Options(j, "PP");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(k, "PP");
        Tab.aString221 = s;
    }
private static Class30_Sub2_Sub1_Sub1 Options(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
            return class30_sub2_sub1_sub1;
        try
        {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./sprites/Custom/").append(s).append(" ").append(i).append(".png").toString()); //edit to where the sprites are located
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

	
	private static Class30_Sub2_Sub1_Sub1 Magic(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
            return class30_sub2_sub1_sub1;
        try
        {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./sprites/Custom/").append(s).append(" ").append(i).append(".png").toString()); //edit to where the sprites are located
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }
	

public static void custom(Class44 sl, Class30_Sub2_Sub1_Sub4 tda[])
	{
        String s1 = "";
        int i1 = 0;
//-------------------------------------------------------------------
        Class9 Tab = addTab(18025);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18025;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 206;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(7, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18026);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18026;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 207;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18027);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18027;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 208;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18028);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18028;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 209;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18029);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18029;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 210;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18030);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18030;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 211;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18031);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18031;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 212;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18032);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18032;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 213;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18033);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18033;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 214;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(8, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18034);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18033;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 215;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(9, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];

        Tab = addTab(18035);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18035;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 150;
        Tab.anInt267 = 44;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 216;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(4, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";

        Tab = addTab(18036);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18036;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 68;
        Tab.anInt267 = 44;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 217;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(2, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";
        Tab = addTab(18037);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18037;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 68;
        Tab.anInt267 = 44;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 218;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(2, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";

        Tab = addTab(18038);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18038;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 68;
        Tab.anInt267 = 44;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 219;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(2, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";
       
 Tab = addTab(18039);
        Tab.anInt236 = 17040;
        Tab.anInt250 = 18039;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 68;
        Tab.anInt267 = 44;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 220;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(2, "Pp");
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";

}

public static void oldMagicInterface() 
{
Class9 Tab = addTab(1151);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];

Tab.anIntArray240[0] = 11512;
Tab.anIntArray241[0] = 10;
Tab.anIntArray272[0] = 23;

Tab = addTab(11512);
int last = 120;
Tab.anIntArray240 = new int[last];
Tab.anIntArray241 = new int[last];
Tab.anIntArray272 = new int[last];
int frame = 67; //1782

Tab.anIntArray240[frame] = 12456;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 6004;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++; //120

Tab.anIntArray240[frame] = 12446;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 12436;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++; //118

Tab.anIntArray240[frame] = 1563;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1593;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++; //116

Tab.anIntArray240[frame] = 12426;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1544;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1521;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1512;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 18471;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 7456;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 15878;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1453;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1414;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 12038;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1583;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++; //105

Tab.anIntArray240[frame] = 1404;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++; //104

Tab.anIntArray240[frame] = 1573;
Tab.anIntArray241[frame] = -10;
Tab.anIntArray272[frame] = 150;
frame++;//103

Tab.anIntArray240[60] = 1199;
Tab.anIntArray241[60] = -10;
Tab.anIntArray272[60] = 150;

Tab.anIntArray240[61] = 1206;
Tab.anIntArray241[61] = -10;
Tab.anIntArray272[61] = 150;

Tab.anIntArray240[62] = 1215;
Tab.anIntArray241[62] = -10;
Tab.anIntArray272[62] = 150;

Tab.anIntArray240[63] = 1224;
Tab.anIntArray241[63] = -10;
Tab.anIntArray272[63] = 150;

Tab.anIntArray240[64] = 1231;
Tab.anIntArray241[64] = -10;
Tab.anIntArray272[64] = 150;

Tab.anIntArray240[65] = 1240;
Tab.anIntArray241[65] = -10;
Tab.anIntArray272[65] = 150;


Tab.anIntArray240[66] = 1249;
Tab.anIntArray241[66] = -15;
Tab.anIntArray272[66] = 150;

Tab.anIntArray240[frame] = 1258;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1267;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1274;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1283;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1290;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1299;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1308;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1315;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1324;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1333;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1340;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1349;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;//79

Tab.anIntArray240[frame] = 1358;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1367;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1374;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1381;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1388;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1397;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1421;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1430;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1437;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1446;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 150;
frame++;

Tab.anIntArray240[frame] = 1460;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1469;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1478;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1485;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1494;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1503;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1530;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1553;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1602;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1613;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1624;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;

Tab.anIntArray240[frame] = 1635;
Tab.anIntArray241[frame] = -15;
Tab.anIntArray272[frame] = 0;
frame++;


Tab.anIntArray240[0] = 1152;
Tab.anIntArray240[1] = 1153;
Tab.anIntArray240[2] = 1154;
Tab.anIntArray240[3] = 1155;
Tab.anIntArray240[4] = 1156;
Tab.anIntArray240[5] = 1157;
Tab.anIntArray240[6] = 1158;
Tab.anIntArray240[7] = 1159;
Tab.anIntArray240[8] = 1160;
Tab.anIntArray240[9] = 1161;
Tab.anIntArray240[10] = 1162;
Tab.anIntArray240[11] = 1163;
Tab.anIntArray240[12] = 1164;
Tab.anIntArray240[13] = 1165;
Tab.anIntArray240[14] = 1166;
Tab.anIntArray240[15] = 1167;
Tab.anIntArray240[16] = 1168;
Tab.anIntArray240[17] = 1169;
Tab.anIntArray240[18] = 1170;
Tab.anIntArray240[19] = 1171;
Tab.anIntArray240[20] = 1172;
Tab.anIntArray240[21] = 1173;
Tab.anIntArray240[22] = 1174;
Tab.anIntArray240[23] = 1175;
Tab.anIntArray240[24] = 1176;
Tab.anIntArray240[25] = 1177;
Tab.anIntArray240[26] = 1178;
Tab.anIntArray240[27] = 1179;
Tab.anIntArray240[28] = 1180;
Tab.anIntArray240[29] = 1181;
Tab.anIntArray240[30] = 1182;
Tab.anIntArray240[31] = 1183;
Tab.anIntArray240[32] = 1184;
Tab.anIntArray240[33] = 1185;
Tab.anIntArray240[34] = 1186;
Tab.anIntArray240[35] = 1187;
Tab.anIntArray240[36] = 1188;
Tab.anIntArray240[37] = 1189;
Tab.anIntArray240[38] = 1190;
Tab.anIntArray240[39] = 1191;
Tab.anIntArray240[40] = 1192;
Tab.anIntArray240[41] = 1193;
Tab.anIntArray240[42] = 1539;
Tab.anIntArray240[43] = 1540;
Tab.anIntArray240[44] = 1541;
Tab.anIntArray240[45] = 1542;
Tab.anIntArray240[46] = 1543;
Tab.anIntArray240[47] = 1562;
Tab.anIntArray240[48] = 1572;
Tab.anIntArray240[49] = 1582;
Tab.anIntArray240[50] = 1592;
Tab.anIntArray240[51] = 7455;
Tab.anIntArray240[52] = 12037;
Tab.anIntArray240[53] = 12425;
Tab.anIntArray240[54] = 12435;
Tab.anIntArray240[55] = 12445;
Tab.anIntArray240[56] = 12455;
Tab.anIntArray240[57] = 6003;
Tab.anIntArray240[58] = 15877;
Tab.anIntArray240[59] = 18470;
Tab.anIntArray241[0] = 0;
Tab.anIntArray241[1] = 24;
Tab.anIntArray241[2] = 48;
Tab.anIntArray241[3] = 72;
Tab.anIntArray241[4] = 96;
Tab.anIntArray241[5] = 120;
Tab.anIntArray241[6] = 144;
Tab.anIntArray241[7] = 0;
Tab.anIntArray241[8] = 24;
Tab.anIntArray241[9] = 48;
Tab.anIntArray241[10] = 96;
Tab.anIntArray241[11] = 120;
Tab.anIntArray241[12] = 144;
Tab.anIntArray241[13] = 0;
Tab.anIntArray241[14] = 24;
Tab.anIntArray241[15] = 48;
Tab.anIntArray241[16] = 72;
Tab.anIntArray241[17] = 96;
Tab.anIntArray241[18] = 120;
Tab.anIntArray241[19] = 144;
Tab.anIntArray241[20] = 0;
Tab.anIntArray241[21] = 24;
Tab.anIntArray241[22] = 48;
Tab.anIntArray241[23] = 72;
Tab.anIntArray241[24] = 96;
Tab.anIntArray241[25] = 48;
Tab.anIntArray241[26] = 72;
Tab.anIntArray241[27] = 96;
Tab.anIntArray241[28] = 120;
Tab.anIntArray241[29] = 0;
Tab.anIntArray241[30] = 24;
Tab.anIntArray241[31] = 0;
Tab.anIntArray241[32] = 24;
Tab.anIntArray241[33] = 71;
Tab.anIntArray241[34] = 95;
Tab.anIntArray241[35] = 144;
Tab.anIntArray241[36] = 0;
Tab.anIntArray241[37] = 72;
Tab.anIntArray241[38] = 72;
Tab.anIntArray241[39] = 96;
Tab.anIntArray241[40] = 120;
Tab.anIntArray241[41] = 144;
Tab.anIntArray241[42] = 120;
Tab.anIntArray241[43] = 24;
Tab.anIntArray241[44] = 144;
Tab.anIntArray241[45] = 118;
Tab.anIntArray241[46] = 25;
Tab.anIntArray241[47] = 120;
Tab.anIntArray241[48] = 72;
Tab.anIntArray241[49] = 144;
Tab.anIntArray241[50] = 96;
Tab.anIntArray241[51] = 144;
Tab.anIntArray241[52] = 0;
Tab.anIntArray241[53] = 48;
Tab.anIntArray241[54] = 1;
Tab.anIntArray241[55] = 24;
Tab.anIntArray241[56] = 72;
Tab.anIntArray241[57] = 48;
Tab.anIntArray241[58] = 48;
Tab.anIntArray241[59] = 48;
Tab.anIntArray272[0] = 0;
Tab.anIntArray272[1] = 0;
Tab.anIntArray272[2] = 0;
Tab.anIntArray272[3] = 0;
Tab.anIntArray272[4] = 0;
Tab.anIntArray272[5] = 0;
Tab.anIntArray272[6] = 0;
Tab.anIntArray272[7] = 24;
Tab.anIntArray272[8] = 24;
Tab.anIntArray272[9] = 24;
Tab.anIntArray272[10] = 24;
Tab.anIntArray272[11] = 24;
Tab.anIntArray272[12] = 24;
Tab.anIntArray272[13] = 48;
Tab.anIntArray272[14] = 48;
Tab.anIntArray272[15] = 48;
Tab.anIntArray272[16] = 48;
Tab.anIntArray272[17] = 48;
Tab.anIntArray272[18] = 48;
Tab.anIntArray272[19] = 48;
Tab.anIntArray272[20] = 72;
Tab.anIntArray272[21] = 72;
Tab.anIntArray272[22] = 72;
Tab.anIntArray272[23] = 72;
Tab.anIntArray272[24] = 72;
Tab.anIntArray272[25] = 96;
Tab.anIntArray272[26] = 96;
Tab.anIntArray272[27] = 96;
Tab.anIntArray272[28] = 96;
Tab.anIntArray272[29] = 120;
Tab.anIntArray272[30] = 120;
Tab.anIntArray272[31] = 144;
Tab.anIntArray272[32] = 144;
Tab.anIntArray272[33] = 144;
Tab.anIntArray272[34] = 144;
Tab.anIntArray272[35] = 144;
Tab.anIntArray272[36] = 169;
Tab.anIntArray272[37] = 169;
Tab.anIntArray272[38] = 120;
Tab.anIntArray272[39] = 120;
Tab.anIntArray272[40] = 120;
Tab.anIntArray272[41] = 169;
Tab.anIntArray272[42] = 72;
Tab.anIntArray272[43] = 96;
Tab.anIntArray272[44] = 96;
Tab.anIntArray272[45] = 144;
Tab.anIntArray272[46] = 169;
Tab.anIntArray272[47] = 169;
Tab.anIntArray272[48] = 24;
Tab.anIntArray272[49] = 72;
Tab.anIntArray272[50] = 169;
Tab.anIntArray272[51] = 120;
Tab.anIntArray272[52] = 96;
Tab.anIntArray272[53] = 169;
Tab.anIntArray272[54] = 193;
Tab.anIntArray272[55] = 193;
Tab.anIntArray272[56] = 193;
Tab.anIntArray272[57] = 193;
Tab.anIntArray272[58] = 120;
Tab.anIntArray272[59] = 144;

int IDs = 1199; //wind strike
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1200;
Tab.anIntArray240[1] = 1201;
Tab.anIntArray240[2] = 1202;
Tab.anIntArray240[3] = 1203;
Tab.anIntArray240[4] = 1204;
Tab.anIntArray240[5] = 1205;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 61;
Tab.anIntArray272[5] = 61;

IDs = 1206; //confuse
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1207;
Tab.anIntArray240[1] = 1208;
Tab.anIntArray240[2] = 1209;
Tab.anIntArray240[3] = 1210;
Tab.anIntArray240[4] = 1211;
Tab.anIntArray240[5] = 1212;
Tab.anIntArray240[6] = 1213;
Tab.anIntArray240[7] = 1214;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 79;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1215; //water strike
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1216;
Tab.anIntArray240[1] = 1217;
Tab.anIntArray240[2] = 1218;
Tab.anIntArray240[3] = 1219;
Tab.anIntArray240[4] = 1220;
Tab.anIntArray240[5] = 1221;
Tab.anIntArray240[6] = 1222;
Tab.anIntArray240[7] = 1223;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 25;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1224;
Tab = addTab(IDs); //enchante
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1225;
Tab.anIntArray240[1] = 1226;
Tab.anIntArray240[2] = 1227;
Tab.anIntArray240[3] = 1228;
Tab.anIntArray240[4] = 1229;
Tab.anIntArray240[5] = 1230;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;


IDs = 1231; //earth strike
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1232;
Tab.anIntArray240[1] = 1233;
Tab.anIntArray240[2] = 1234;
Tab.anIntArray240[3] = 1235;
Tab.anIntArray240[4] = 1236;
Tab.anIntArray240[5] = 1237;
Tab.anIntArray240[6] = 1238;
Tab.anIntArray240[7] = 1239;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1240; //weaken
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1241;
Tab.anIntArray240[1] = 1242;
Tab.anIntArray240[2] = 1243;
Tab.anIntArray240[3] = 1244;
Tab.anIntArray240[4] = 1245;
Tab.anIntArray240[5] = 1246;
Tab.anIntArray240[6] = 1247;
Tab.anIntArray240[7] = 1248;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 79;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1249;
Tab = addTab(IDs); //fire strike
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1250;
Tab.anIntArray240[1] = 1251;
Tab.anIntArray240[2] = 1252;
Tab.anIntArray240[3] = 1253;
Tab.anIntArray240[4] = 1254;
Tab.anIntArray240[5] = 1255;
Tab.anIntArray240[6] = 1256;
Tab.anIntArray240[7] = 1257;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 79;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1258; //bones to peaches.
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1259;
Tab.anIntArray240[1] = 1260;
Tab.anIntArray240[2] = 1261;
Tab.anIntArray240[3] = 1262;
Tab.anIntArray240[4] = 1263;
Tab.anIntArray240[5] = 1264;
Tab.anIntArray240[6] = 1265;
Tab.anIntArray240[7] = 1266;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 79;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1267;
Tab = addTab(IDs); //wind bolt
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1268;
Tab.anIntArray240[1] = 1269;
Tab.anIntArray240[2] = 1270;
Tab.anIntArray240[3] = 1271;
Tab.anIntArray240[4] = 1272;
Tab.anIntArray240[5] = 1273;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1274;
Tab = addTab(IDs); //curse
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1275;
Tab.anIntArray240[1] = 1276;
Tab.anIntArray240[2] = 1277;
Tab.anIntArray240[3] = 1278;
Tab.anIntArray240[4] = 1279;
Tab.anIntArray240[5] = 1280;
Tab.anIntArray240[6] = 1281;
Tab.anIntArray240[7] = 1282;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1573;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0; //bind
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1574;
Tab.anIntArray240[1] = 1575;
Tab.anIntArray240[2] = 1576;
Tab.anIntArray240[3] = 1577;
Tab.anIntArray240[4] = 1578;
Tab.anIntArray240[5] = 1579;
Tab.anIntArray240[6] = 1580;
Tab.anIntArray240[7] = 1581;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 131;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1283;
Tab = addTab(IDs);
Tab.anInt236 = 1151; //lowalch
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1284;
Tab.anIntArray240[1] = 1285;
Tab.anIntArray240[2] = 1286;
Tab.anIntArray240[3] = 1287;
Tab.anIntArray240[4] = 1288;
Tab.anIntArray240[5] = 1289;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1290;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0; //water bolt
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1291;
Tab.anIntArray240[1] = 1292;
Tab.anIntArray240[2] = 1293;
Tab.anIntArray240[3] = 1294;
Tab.anIntArray240[4] = 1295;
Tab.anIntArray240[5] = 1296;
Tab.anIntArray240[6] = 1297;
Tab.anIntArray240[7] = 1298;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1299;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0; //varrock tele
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1300;
Tab.anIntArray240[1] = 1301;
Tab.anIntArray240[2] = 1302;
Tab.anIntArray240[3] = 1303;
Tab.anIntArray240[4] = 1304;
Tab.anIntArray240[5] = 1305;
Tab.anIntArray240[6] = 1306;
Tab.anIntArray240[7] = 1307;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1308;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0; //level 2 enchante
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1309;
Tab.anIntArray240[1] = 1310;
Tab.anIntArray240[2] = 1311;
Tab.anIntArray240[3] = 1312;
Tab.anIntArray240[4] = 1313;
Tab.anIntArray240[5] = 1314;
Tab.anIntArray241[6] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1315;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782; //earth bolt
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1316;
Tab.anIntArray240[1] = 1317;
Tab.anIntArray240[2] = 1318;
Tab.anIntArray240[3] = 1319;
Tab.anIntArray240[4] = 1320;
Tab.anIntArray240[5] = 1321;
Tab.anIntArray240[6] = 1322;
Tab.anIntArray240[7] = 1323;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1324;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80; //lumby tele
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1325;
Tab.anIntArray240[1] = 1326;
Tab.anIntArray240[2] = 1327;
Tab.anIntArray240[3] = 1328;
Tab.anIntArray240[4] = 1329;
Tab.anIntArray240[5] = 1330;
Tab.anIntArray240[6] = 1331;
Tab.anIntArray240[7] = 1332;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1333;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80; //tg
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1334;
Tab.anIntArray240[1] = 1335;
Tab.anIntArray240[2] = 1336;
Tab.anIntArray240[3] = 1337;
Tab.anIntArray240[4] = 1338;
Tab.anIntArray240[5] = 1339;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1340;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //fire bolt
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1341;
Tab.anIntArray240[1] = 1342;
Tab.anIntArray240[2] = 1343;
Tab.anIntArray240[3] = 1344;
Tab.anIntArray240[4] = 1345;
Tab.anIntArray240[5] = 1346;
Tab.anIntArray240[6] = 1347;
Tab.anIntArray240[7] = 1348;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1349;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //fally tele
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1350;
Tab.anIntArray240[1] = 1351;
Tab.anIntArray240[2] = 1352;
Tab.anIntArray240[3] = 1353;
Tab.anIntArray240[4] = 1354;
Tab.anIntArray240[5] = 1355;
Tab.anIntArray240[6] = 1356;
Tab.anIntArray240[7] = 1357;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1358;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //crumble undead
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1359;
Tab.anIntArray240[1] = 1360;
Tab.anIntArray240[2] = 1361;
Tab.anIntArray240[3] = 1362;
Tab.anIntArray240[4] = 1363;
Tab.anIntArray240[5] = 1364;
Tab.anIntArray240[6] = 1365;
Tab.anIntArray240[7] = 1366;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1367;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //airblast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1368;
Tab.anIntArray240[1] = 1369;
Tab.anIntArray240[2] = 1370;
Tab.anIntArray240[3] = 1371;
Tab.anIntArray240[4] = 1372;
Tab.anIntArray240[5] = 1373;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1374;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //superheat
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1375;
Tab.anIntArray240[1] = 1376;
Tab.anIntArray240[2] = 1377;
Tab.anIntArray240[3] = 1378;
Tab.anIntArray240[4] = 1379;
Tab.anIntArray240[5] = 1380;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1381;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //telecamy
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1382;
Tab.anIntArray240[1] = 1383;
Tab.anIntArray240[2] = 1384;
Tab.anIntArray240[3] = 1385;
Tab.anIntArray240[4] = 1386;
Tab.anIntArray240[5] = 1387;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1388;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //waterblast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1389;
Tab.anIntArray240[1] = 1390;
Tab.anIntArray240[2] = 1391;
Tab.anIntArray240[3] = 1392;
Tab.anIntArray240[4] = 1393;
Tab.anIntArray240[5] = 1394;
Tab.anIntArray240[6] = 1395;
Tab.anIntArray240[7] = 1396;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1397;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //enchante ruby
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1398;
Tab.anIntArray240[1] = 1399;
Tab.anIntArray240[2] = 1400;
Tab.anIntArray240[3] = 1401;
Tab.anIntArray240[4] = 1402;
Tab.anIntArray240[5] = 1403;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 116;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1404;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //iban blast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[10];
Tab.anIntArray241 = new int[10];
Tab.anIntArray272 = new int[10];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[9] = 1405;
Tab.anIntArray240[1] = 1406;
Tab.anIntArray240[2] = 1407;
Tab.anIntArray240[3] = 1408;
Tab.anIntArray240[4] = 1409;
Tab.anIntArray240[5] = 1410;
Tab.anIntArray240[6] = 1411;
Tab.anIntArray240[7] = 1412;
Tab.anIntArray240[8] = 1413;
Tab.anIntArray241[9] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 130;
Tab.anIntArray241[6] = 28;
Tab.anIntArray241[7] = 80;
Tab.anIntArray241[8] = 132;
Tab.anIntArray272[9] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 35;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;
Tab.anIntArray272[8] = 62;


IDs = 1583;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //snare
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1584;
Tab.anIntArray240[1] = 1585;
Tab.anIntArray240[2] = 1586;
Tab.anIntArray240[3] = 1587;
Tab.anIntArray240[4] = 1588;
Tab.anIntArray240[5] = 1589;
Tab.anIntArray240[6] = 1590;
Tab.anIntArray240[7] = 1591;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 131;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 12038;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //magic dart
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 12039;
Tab.anIntArray240[1] = 12040;
Tab.anIntArray240[2] = 12041;
Tab.anIntArray240[3] = 12042;
Tab.anIntArray240[4] = 12043;
Tab.anIntArray240[5] = 12044;
Tab.anIntArray240[6] = 12045;
Tab.anIntArray240[7] = 12046;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 29;
Tab.anIntArray241[3] = 128;
Tab.anIntArray241[4] = 32;
Tab.anIntArray241[5] = 130;
Tab.anIntArray241[6] = 82;
Tab.anIntArray241[7] = 79;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 35;

IDs = 1414;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //ardy tele
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1415;
Tab.anIntArray240[1] = 1416;
Tab.anIntArray240[2] = 1417;
Tab.anIntArray240[3] = 1418;
Tab.anIntArray240[4] = 1419;
Tab.anIntArray240[5] = 1420;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 39;
Tab.anIntArray241[5] = 115;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1421;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //earth blast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1422;
Tab.anIntArray240[1] = 1423;
Tab.anIntArray240[2] = 1424;
Tab.anIntArray240[3] = 1425;
Tab.anIntArray240[4] = 1426;
Tab.anIntArray240[5] = 1427;
Tab.anIntArray240[6] = 1428;
Tab.anIntArray240[7] = 1429;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1430;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //high alch
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1431;
Tab.anIntArray240[1] = 1432;
Tab.anIntArray240[2] = 1433;
Tab.anIntArray240[3] = 1434;
Tab.anIntArray240[4] = 1435;
Tab.anIntArray240[5] = 1436;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1430;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //high alch
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1431;
Tab.anIntArray240[1] = 1432;
Tab.anIntArray240[2] = 1433;
Tab.anIntArray240[3] = 1434;
Tab.anIntArray240[4] = 1435;
Tab.anIntArray240[5] = 1436;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1437;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //charge water orb
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1438;
Tab.anIntArray240[1] = 1439;
Tab.anIntArray240[2] = 1440;
Tab.anIntArray240[3] = 1441;
Tab.anIntArray240[4] = 1442;
Tab.anIntArray240[5] = 1443;
Tab.anIntArray240[6] = 1444;
Tab.anIntArray240[7] = 1445;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 24;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1446;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //watcher tower tele
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 5;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1447;
Tab.anIntArray240[1] = 1448;
Tab.anIntArray240[2] = 1449;
Tab.anIntArray240[3] = 1450;
Tab.anIntArray240[4] = 1451;
Tab.anIntArray240[5] = 1452;
Tab.anIntArray241[6] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 37;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1469;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; // charge eart
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1470;
Tab.anIntArray240[1] = 1471;
Tab.anIntArray240[2] = 1472;
Tab.anIntArray240[3] = 1473;
Tab.anIntArray240[4] = 1474;
Tab.anIntArray240[5] = 1475;
Tab.anIntArray240[6] = 1476;
Tab.anIntArray240[7] = 1477;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 24;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1485;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //bones to peaches
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1486;
Tab.anIntArray240[1] = 1487;
Tab.anIntArray240[2] = 1488;
Tab.anIntArray240[3] = 1489;
Tab.anIntArray240[4] = 1490;
Tab.anIntArray240[5] = 1491;
Tab.anIntArray240[6] = 1492;
Tab.anIntArray240[7] = 1493;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 24;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1460;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //fireblast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1461;
Tab.anIntArray240[1] = 1462;
Tab.anIntArray240[2] = 1463;
Tab.anIntArray240[3] = 1464;
Tab.anIntArray240[4] = 1465;
Tab.anIntArray240[5] = 1466;
Tab.anIntArray240[6] = 1467;
Tab.anIntArray240[7] = 1468;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1453;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //fireblast
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1454;
Tab.anIntArray240[1] = 1455;
Tab.anIntArray240[2] = 1456;
Tab.anIntArray240[3] = 1457;
Tab.anIntArray240[4] = 1458;
Tab.anIntArray240[5] = 1459;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 39;
Tab.anIntArray241[5] = 115;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 15878;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //BOnes to peaches
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 15879;
Tab.anIntArray240[1] = 15880;
Tab.anIntArray240[2] = 15881;
Tab.anIntArray240[3] = 15882;
Tab.anIntArray240[4] = 15883;
Tab.anIntArray240[5] = 15884;
Tab.anIntArray240[6] = 15885;
Tab.anIntArray240[7] = 15886;
Tab.anIntArray241[8] = 12;
Tab.anIntArray241[1] = 24;
Tab.anIntArray241[2] = 132;
Tab.anIntArray241[3] = 26;
Tab.anIntArray241[4] = 26;
Tab.anIntArray241[5] = 135;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 82;
Tab.anIntArray272[8] = 5;
Tab.anIntArray272[1] = 20;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 35;
Tab.anIntArray272[7] = 62;

IDs = 1602;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //sara strike
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[11];
Tab.anIntArray241 = new int[11];
Tab.anIntArray272 = new int[11];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[10] = 1603;
Tab.anIntArray240[1] = 1604;
Tab.anIntArray240[2] = 1605;
Tab.anIntArray240[3] = 1606;
Tab.anIntArray240[4] = 1607;
Tab.anIntArray240[5] = 1608;
Tab.anIntArray240[6] = 1609;
Tab.anIntArray240[7] = 1610;
Tab.anIntArray240[8] = 1611;
Tab.anIntArray240[9] = 1612;
Tab.anIntArray241[10] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 10;
Tab.anIntArray241[3] = 54;
Tab.anIntArray241[4] = 98;
Tab.anIntArray241[5] = 12;
Tab.anIntArray241[6] = 56;
Tab.anIntArray241[7] = 100;
Tab.anIntArray241[8] = 141;
Tab.anIntArray241[9] = 144;
Tab.anIntArray272[10] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;
Tab.anIntArray272[8] = 39;
Tab.anIntArray272[9] = 62;

IDs = 1613;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //claws of guthix
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[11];
Tab.anIntArray241 = new int[11];
Tab.anIntArray272 = new int[11];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[10] = 1614;
Tab.anIntArray240[1] = 1615;
Tab.anIntArray240[2] = 1616;
Tab.anIntArray240[3] = 1617;
Tab.anIntArray240[4] = 1618;
Tab.anIntArray240[5] = 1619;
Tab.anIntArray240[6] = 1620;
Tab.anIntArray240[7] = 1621;
Tab.anIntArray240[8] = 1622;
Tab.anIntArray240[9] = 1623;
Tab.anIntArray241[10] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 10;
Tab.anIntArray241[3] = 54;
Tab.anIntArray241[4] = 98;
Tab.anIntArray241[5] = 12;
Tab.anIntArray241[6] = 56;
Tab.anIntArray241[7] = 100;
Tab.anIntArray241[8] = 141;
Tab.anIntArray241[9] = 144;
Tab.anIntArray272[10] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;
Tab.anIntArray272[8] = 39;
Tab.anIntArray272[9] = 62;

IDs = 1624;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //zammy flames
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[11];
Tab.anIntArray241 = new int[11];
Tab.anIntArray272 = new int[11];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[10] = 1625;
Tab.anIntArray240[1] = 1626;
Tab.anIntArray240[2] = 1627;
Tab.anIntArray240[3] = 1628;
Tab.anIntArray240[4] = 1629;
Tab.anIntArray240[5] = 1630;
Tab.anIntArray240[6] = 1631;
Tab.anIntArray240[7] = 1632;
Tab.anIntArray240[8] = 1633;
Tab.anIntArray240[9] = 1634;
Tab.anIntArray241[10] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 10;
Tab.anIntArray241[3] = 54;
Tab.anIntArray241[4] = 98;
Tab.anIntArray241[5] = 12;
Tab.anIntArray241[6] = 56;
Tab.anIntArray241[7] = 100;
Tab.anIntArray241[8] = 141;
Tab.anIntArray241[9] = 144;
Tab.anIntArray272[10] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;
Tab.anIntArray272[8] = 39;
Tab.anIntArray272[9] = 62;

IDs = 7456;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //trollhiem tele
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 7457;
Tab.anIntArray240[1] = 7458;
Tab.anIntArray240[2] = 8673;
Tab.anIntArray240[3] = 8674;
Tab.anIntArray240[4] = 8675;
Tab.anIntArray240[5] = 8676;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 39;
Tab.anIntArray241[5] = 115;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 1478;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 1479;
Tab.anIntArray240[1] = 1480;
Tab.anIntArray240[2] = 1481;
Tab.anIntArray240[3] = 1482;
Tab.anIntArray240[4] = 1483;
Tab.anIntArray240[5] = 1484;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 38;
Tab.anIntArray241[3] = 114;
Tab.anIntArray241[4] = 40;
Tab.anIntArray241[5] = 117;
Tab.anIntArray272[6] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;

IDs = 18471;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[11];
Tab.anIntArray241 = new int[11];
Tab.anIntArray272 = new int[11];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[10] = 18472;
Tab.anIntArray240[1] = 18473;
Tab.anIntArray240[2] = 18474;
Tab.anIntArray240[3] = 18475;
Tab.anIntArray240[4] = 18476;
Tab.anIntArray240[5] = 18477;
Tab.anIntArray240[6] = 18478;
Tab.anIntArray240[7] = 18479;
Tab.anIntArray240[8] = 18480;
Tab.anIntArray240[9] = 18481;
Tab.anIntArray241[10] = 6;
Tab.anIntArray241[1] = 28;
Tab.anIntArray241[2] = 56;
Tab.anIntArray241[3] = 13;
Tab.anIntArray241[4] = 16;
Tab.anIntArray241[5] = 61;
Tab.anIntArray241[6] = 104;
Tab.anIntArray241[7] = 104;
Tab.anIntArray241[8] = 139;
Tab.anIntArray241[9] = 145;
Tab.anIntArray272[10] = 5;
Tab.anIntArray272[1] = 19;
Tab.anIntArray272[2] = 31;
Tab.anIntArray272[3] = 31;
Tab.anIntArray272[4] = 63;
Tab.anIntArray272[5] = 63;
Tab.anIntArray272[6] = 32;
Tab.anIntArray272[7] = 63;
Tab.anIntArray272[8] = 30;
Tab.anIntArray272[9] = 63;

IDs = 1494;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //waterwave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1495;
Tab.anIntArray240[1] = 1496;
Tab.anIntArray240[2] = 1497;
Tab.anIntArray240[3] = 1498;
Tab.anIntArray240[4] = 1499;
Tab.anIntArray240[5] = 1500;
Tab.anIntArray240[6] = 1501;
Tab.anIntArray240[7] = 1502;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1503;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //water wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1504;
Tab.anIntArray240[1] = 1505;
Tab.anIntArray240[2] = 1506;
Tab.anIntArray240[3] = 1507;
Tab.anIntArray240[4] = 1508;
Tab.anIntArray240[5] = 1509;
Tab.anIntArray240[6] = 1510;
Tab.anIntArray240[7] = 1511;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 24;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1512;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1513;
Tab.anIntArray240[1] = 1514;
Tab.anIntArray240[2] = 1515;
Tab.anIntArray240[3] = 1516;
Tab.anIntArray240[4] = 1517;
Tab.anIntArray240[5] = 1518;
Tab.anIntArray240[6] = 1519;
Tab.anIntArray240[7] = 1520;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1521;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1522;
Tab.anIntArray240[1] = 1523;
Tab.anIntArray240[2] = 1524;
Tab.anIntArray240[3] = 1525;
Tab.anIntArray240[4] = 1526;
Tab.anIntArray240[5] = 1527;
Tab.anIntArray240[6] = 1528;
Tab.anIntArray240[7] = 1529;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 25;
Tab.anIntArray241[6] = 77;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;


IDs = 1530;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //earth wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1531;
Tab.anIntArray240[1] = 1532;
Tab.anIntArray240[2] = 1533;
Tab.anIntArray240[3] = 1534;
Tab.anIntArray240[4] = 1535;
Tab.anIntArray240[5] = 1536;
Tab.anIntArray240[6] = 1537;
Tab.anIntArray240[7] = 1538;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;



IDs = 1544;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1545;
Tab.anIntArray240[1] = 1546;
Tab.anIntArray240[2] = 1547;
Tab.anIntArray240[3] = 1548;
Tab.anIntArray240[4] = 1549;
Tab.anIntArray240[5] = 1550;
Tab.anIntArray240[6] = 1551;
Tab.anIntArray240[7] = 1552;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 27;
Tab.anIntArray241[6] = 79;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 12426;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 12427;
Tab.anIntArray240[1] = 12428;
Tab.anIntArray240[2] = 12429;
Tab.anIntArray240[3] = 12430;
Tab.anIntArray240[4] = 12431;
Tab.anIntArray240[5] = 12432;
Tab.anIntArray240[6] = 12433;
Tab.anIntArray240[7] = 12434;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 29;
Tab.anIntArray241[3] = 128;
Tab.anIntArray241[4] = 79;
Tab.anIntArray241[5] = 32;
Tab.anIntArray241[6] = 81;
Tab.anIntArray241[7] = 130;
Tab.anIntArray272[8] = 5;
Tab.anIntArray272[1] = 18;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1553;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //fire wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1554;
Tab.anIntArray240[1] = 1555;
Tab.anIntArray240[2] = 1556;
Tab.anIntArray240[3] = 1557;
Tab.anIntArray240[4] = 1558;
Tab.anIntArray240[5] = 1559;
Tab.anIntArray240[6] = 1560;
Tab.anIntArray240[7] = 1561;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1593;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1594;
Tab.anIntArray240[1] = 1595;
Tab.anIntArray240[2] = 1596;
Tab.anIntArray240[3] = 1597;
Tab.anIntArray240[4] = 1598;
Tab.anIntArray240[5] = 1599;
Tab.anIntArray240[6] = 1600;
Tab.anIntArray240[7] = 1601;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1563;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1564;
Tab.anIntArray240[1] = 1565;
Tab.anIntArray240[2] = 1566;
Tab.anIntArray240[3] = 1567;
Tab.anIntArray240[4] = 1568;
Tab.anIntArray240[5] = 1569;
Tab.anIntArray240[6] = 1570;
Tab.anIntArray240[7] = 1571;
Tab.anIntArray241[8] = 2;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 25;
Tab.anIntArray241[6] = 77;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 1635;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //charge
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 4;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 1636;
Tab.anIntArray240[1] = 1637;
Tab.anIntArray240[2] = 1638;
Tab.anIntArray240[3] = 1639;
Tab.anIntArray240[4] = 1640;
Tab.anIntArray240[5] = 1641;
Tab.anIntArray240[6] = 1642;
Tab.anIntArray240[7] = 1643;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 26;
Tab.anIntArray241[3] = 78;
Tab.anIntArray241[4] = 130;
Tab.anIntArray241[5] = 28;
Tab.anIntArray241[6] = 80;
Tab.anIntArray241[7] = 132;
Tab.anIntArray272[8] = 4;
Tab.anIntArray272[1] = 17;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 12436;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //teleother fally
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 3;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 12437;
Tab.anIntArray240[1] = 12438;
Tab.anIntArray240[2] = 12439;
Tab.anIntArray240[3] = 12440;
Tab.anIntArray240[4] = 12441;
Tab.anIntArray240[5] = 12442;
Tab.anIntArray240[6] = 12443;
Tab.anIntArray240[7] = 12444;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 29;
Tab.anIntArray241[3] = 128;
Tab.anIntArray241[4] = 79;
Tab.anIntArray241[5] = 32;
Tab.anIntArray241[6] = 82;
Tab.anIntArray241[7] = 130;
Tab.anIntArray272[8] = 5;
Tab.anIntArray272[1] = 18;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 12446;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 12447;
Tab.anIntArray240[1] = 12448;
Tab.anIntArray240[2] = 12449;
Tab.anIntArray240[3] = 12450;
Tab.anIntArray240[4] = 12451;
Tab.anIntArray240[5] = 12452;
Tab.anIntArray240[6] = 12453;
Tab.anIntArray240[7] = 12454;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 29;
Tab.anIntArray241[3] = 128;
Tab.anIntArray241[4] = 79;
Tab.anIntArray241[5] = 32;
Tab.anIntArray241[6] = 81;
Tab.anIntArray241[7] = 130;
Tab.anIntArray272[8] = 5;
Tab.anIntArray272[1] = 18;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 35;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 62;
Tab.anIntArray272[7] = 62;

IDs = 6004;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[9];
Tab.anIntArray241 = new int[9];
Tab.anIntArray272 = new int[9];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[8] = 6005;
Tab.anIntArray240[1] = 6006;
Tab.anIntArray240[2] = 6007;
Tab.anIntArray240[3] = 6008;
Tab.anIntArray240[4] = 6009;
Tab.anIntArray240[5] = 6010;
Tab.anIntArray240[6] = 6011;
Tab.anIntArray240[7] = 6012;
Tab.anIntArray241[8] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 77;
Tab.anIntArray241[3] = 122;
Tab.anIntArray241[4] = 124;
Tab.anIntArray241[5] = 74;
Tab.anIntArray241[6] = 29;
Tab.anIntArray241[7] = 26;
Tab.anIntArray272[8] = 5;
Tab.anIntArray272[1] = 18;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 62;
Tab.anIntArray272[6] = 35;
Tab.anIntArray272[7] = 62;

IDs = 12456;
Tab = addTab(IDs);
Tab.anInt236 = 1151;
Tab.anInt250 = IDs;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1; //wind wave
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[7];
Tab.anIntArray241 = new int[7];
Tab.anIntArray272 = new int[7];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
Tab.anIntArray240[6] = 12457;
Tab.anIntArray240[1] = 12458;
Tab.anIntArray240[2] = 12459;
Tab.anIntArray240[3] = 12460;
Tab.anIntArray240[4] = 12461;
Tab.anIntArray240[5] = 12462;
Tab.anIntArray241[6] = 3;
Tab.anIntArray241[1] = 3;
Tab.anIntArray241[2] = 116;
Tab.anIntArray241[3] = 40;
Tab.anIntArray241[4] = 41;
Tab.anIntArray241[5] = 118;
Tab.anIntArray272[6] = 5;
Tab.anIntArray272[1] = 18;
Tab.anIntArray272[2] = 35;
Tab.anIntArray272[3] = 35;
Tab.anIntArray272[4] = 62;
Tab.anIntArray272[5] = 63;
}

public static void NewMage2()
{
int X = 17;
int Y = 15;
int Frame = 0;
int Frame2 = 1152;
Class9 Tab = addTab(12855);
Tab.anIntArray240 = new int[52];
Tab.anIntArray241 = new int[52];
Tab.anIntArray272 = new int[52];
Tab.anIntArray240[Frame] = 16200;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;Frame += 1;
Tab.anIntArray240[Frame] = 1780;Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;Frame += 1;X += 45;
Tab.anIntArray240[Frame] = 12939;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12987;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13035;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 12901;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12861;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13045;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12963;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 13011;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13053;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12919;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12881;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 13061;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12951;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12999;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13069;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 12911;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12871;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13079;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12975;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 13023;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 13087;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12929;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
Tab.anIntArray240[Frame] = 12891;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;X += 45;Frame += 1;
//---------------------------------------------------------------------------
Y += 30;X = 17;
Tab.anIntArray240[Frame] = 13095;
Tab.anIntArray241[Frame] = X;Tab.anIntArray272[Frame] = Y;Frame += 1;
Tab.anIntArray240[Frame] = 1781;
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 12940;
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;

        

CustomButton3(1782, 11, 11, " ",0, 0);
CustomButton3(16200, 10, 10, " ",20, 20);

Tab.anIntArray240[Frame] = 1+12939;
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12987; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13035; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12901; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12861; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13045; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12963; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13011; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13053; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12919; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12881; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13061; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12951; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12999; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13069; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12911; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12871; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+13079; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;
Tab.anIntArray240[Frame] = 1+12975; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 175;Frame += 1;




Tab.anIntArray240[Frame] = 1+13023; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 0;Frame += 1;
Tab.anIntArray240[Frame] = 1+13087; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 0;Frame += 1;
Tab.anIntArray240[Frame] = 1+12929; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 0;Frame += 1;
Tab.anIntArray240[Frame] = 1+12891; 
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 0;Frame += 1;
Tab.anIntArray240[Frame] = 1+13095;
Tab.anIntArray241[Frame] = 5;
Tab.anIntArray272[Frame] = 0;Frame += 1;
}

public static void custom2(Class44 sl, Class30_Sub2_Sub1_Sub4 tda[])
{
String s1 = "";
int i1 = 0;
Class9 Tab = addTab(1780);
Tab.anInt236 = 12855;
Tab.anInt250 = 1780;
Tab.anInt262 = 5;
Tab.anInt217 = 0;
Tab.anInt220 = 30;
Tab.anInt267 = 30;
Tab.anInt230 = 1781;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 59;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(10, "PP");
Tab.aClass30_Sub2_Sub1_Sub1_207 = Options(10, "PP");


// START OF MAGIC


int IDs = 12892;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[1] = IDs+1;Tab.anIntArray240[2] = IDs+2;Tab.anIntArray240[3] = IDs+3;Tab.anIntArray240[4] = IDs+4;Tab.anIntArray240[5] = IDs+5;Tab.anIntArray240[6] = IDs+6;Tab.anIntArray240[7] = IDs+7;Tab.anIntArray240[8] = IDs+8;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 3;Tab.anIntArray241[3] = 29;Tab.anIntArray241[4] = 79;Tab.anIntArray241[5] = 128;Tab.anIntArray241[6] = 32;Tab.anIntArray241[7] = 82;Tab.anIntArray241[8] = 129;Tab.anIntArray272[1] = 5;Tab.anIntArray272[2] = 18;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 63;
IDs = 12940;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 12941;Tab.anIntArray240[1] = 12942;Tab.anIntArray240[2] = 12943;Tab.anIntArray240[3] = 12944;Tab.anIntArray240[4] = 12945;Tab.anIntArray240[5] = 12946;Tab.anIntArray240[6] = 12947;Tab.anIntArray240[7] = 12948;Tab.anIntArray240[8] = 12949;Tab.anIntArray240[9] = 12950;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 17;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 103;Tab.anIntArray241[9] = 143;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 12988;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 12989;Tab.anIntArray240[1] = 12990;Tab.anIntArray240[2] = 12991;Tab.anIntArray240[3] = 12992;Tab.anIntArray240[4] = 12993;Tab.anIntArray240[5] = 12994;Tab.anIntArray240[6] = 12995;Tab.anIntArray240[7] = 12996;Tab.anIntArray240[8] = 12997;Tab.anIntArray240[9] = 12998;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 17;Tab.anIntArray241[7] = 62;Tab.anIntArray241[8] = 103;Tab.anIntArray241[9] = 142;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13036;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 13037;Tab.anIntArray240[1] = 13038;Tab.anIntArray240[2] = 13039;Tab.anIntArray240[3] = 13040;Tab.anIntArray240[4] = 13041;Tab.anIntArray240[5] = 13042;Tab.anIntArray240[6] = 13043;Tab.anIntArray240[7] = 13044;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 32;Tab.anIntArray241[6] = 82;Tab.anIntArray241[7] = 132;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 12902;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12903;Tab.anIntArray240[1] = 12904;Tab.anIntArray240[2] = 12905;Tab.anIntArray240[3] = 12906;Tab.anIntArray240[4] = 12907;Tab.anIntArray240[5] = 12908;Tab.anIntArray240[6] = 12909;Tab.anIntArray240[7] = 12910;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 128;Tab.anIntArray241[4] = 79;Tab.anIntArray241[5] = 32;Tab.anIntArray241[6] = 80;Tab.anIntArray241[7] = 130;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 12862;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12863;Tab.anIntArray240[1] = 12864;Tab.anIntArray240[2] = 12865;Tab.anIntArray240[3] = 12866;Tab.anIntArray240[4] = 12867;Tab.anIntArray240[5] = 12868;Tab.anIntArray240[6] = 12869;Tab.anIntArray240[7] = 12870;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 128;Tab.anIntArray241[4] = 79;Tab.anIntArray241[5] = 30;Tab.anIntArray241[6] = 80;Tab.anIntArray241[7] = 129;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 13046;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13047;Tab.anIntArray240[1] = 13048;Tab.anIntArray240[2] = 13049;Tab.anIntArray240[3] = 13050;Tab.anIntArray240[4] = 13051;Tab.anIntArray240[5] = 13052;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 56;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 57;Tab.anIntArray241[5] = 107;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12964;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 12965;Tab.anIntArray240[1] = 12966;Tab.anIntArray240[2] = 12967;Tab.anIntArray240[3] = 12968;Tab.anIntArray240[4] = 12969;Tab.anIntArray240[5] = 12970;Tab.anIntArray240[6] = 12971;Tab.anIntArray240[7] = 12972;Tab.anIntArray240[8] = 12973;Tab.anIntArray240[9] = 12974;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 18;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 101;Tab.anIntArray241[9] = 141;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13012;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 13013;Tab.anIntArray240[1] = 13014;Tab.anIntArray240[2] = 13015;Tab.anIntArray240[3] = 13016;Tab.anIntArray240[4] = 13017;Tab.anIntArray240[5] = 13018;Tab.anIntArray240[6] = 13019;Tab.anIntArray240[7] = 13020;Tab.anIntArray240[8] = 13021;Tab.anIntArray240[9] = 13022;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 18;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 101;Tab.anIntArray241[9] = 141;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13054;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13055;Tab.anIntArray240[1] = 13056;Tab.anIntArray240[2] = 13057;Tab.anIntArray240[3] = 13058;Tab.anIntArray240[4] = 13059;Tab.anIntArray240[5] = 13060;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 56;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 58;Tab.anIntArray241[5] = 106;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12920;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12921;Tab.anIntArray240[1] = 12922;Tab.anIntArray240[2] = 12923;Tab.anIntArray240[3] = 12924;Tab.anIntArray240[4] = 12925;Tab.anIntArray240[5] = 12926;Tab.anIntArray240[6] = 12927;Tab.anIntArray240[7] = 12928;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 31;Tab.anIntArray241[6] = 80;Tab.anIntArray241[7] = 131;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 12882;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12883;Tab.anIntArray240[1] = 12884;Tab.anIntArray240[2] = 12885;Tab.anIntArray240[3] = 12886;Tab.anIntArray240[4] = 12887;Tab.anIntArray240[5] = 12888;Tab.anIntArray240[6] = 12889;Tab.anIntArray240[7] = 12890;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 32;Tab.anIntArray241[6] = 82;Tab.anIntArray241[7] = 129;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 13062;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13063;Tab.anIntArray240[1] = 13064;Tab.anIntArray240[2] = 13065;Tab.anIntArray240[3] = 13066;Tab.anIntArray240[4] = 13067;Tab.anIntArray240[5] = 13068;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 57;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 59;Tab.anIntArray241[5] = 106;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12952;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 12953;Tab.anIntArray240[1] = 12954;Tab.anIntArray240[2] = 12955;Tab.anIntArray240[3] = 12956;Tab.anIntArray240[4] = 12957;Tab.anIntArray240[5] = 12958;Tab.anIntArray240[6] = 12959;Tab.anIntArray240[7] = 12960;Tab.anIntArray240[8] = 12961;Tab.anIntArray240[9] = 12962;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 17;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 101;Tab.anIntArray241[9] = 141;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13000;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 13001;Tab.anIntArray240[1] = 13002;Tab.anIntArray240[2] = 13003;Tab.anIntArray240[3] = 13004;Tab.anIntArray240[4] = 13005;Tab.anIntArray240[5] = 13006;Tab.anIntArray240[6] = 13007;Tab.anIntArray240[7] = 13008;Tab.anIntArray240[8] = 13009;Tab.anIntArray240[9] = 13010;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 17;Tab.anIntArray241[7] = 59;Tab.anIntArray241[8] = 101;Tab.anIntArray241[9] = 142;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 36;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 63;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13070;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 13071;Tab.anIntArray240[1] = 13072;Tab.anIntArray240[2] = 13073;Tab.anIntArray240[3] = 13074;Tab.anIntArray240[4] = 13075;Tab.anIntArray240[5] = 13076;Tab.anIntArray240[6] = 13077;Tab.anIntArray240[7] = 13078;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 32;Tab.anIntArray241[6] = 82;Tab.anIntArray241[7] = 129;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 12912;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 12913;Tab.anIntArray240[1] = 12914;Tab.anIntArray240[2] = 12915;Tab.anIntArray240[3] = 12916;Tab.anIntArray240[4] = 12917;Tab.anIntArray240[5] = 12918;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 56;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 57;Tab.anIntArray241[5] = 106;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12872;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12873;Tab.anIntArray240[1] = 12874;Tab.anIntArray240[2] = 12875;Tab.anIntArray240[3] = 12876;Tab.anIntArray240[4] = 12877;Tab.anIntArray240[5] = 12878;Tab.anIntArray240[6] = 12879;Tab.anIntArray240[7] = 12880;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 30;Tab.anIntArray241[6] = 80;Tab.anIntArray241[7] = 129;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 13080;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13081;Tab.anIntArray240[1] = 13082;Tab.anIntArray240[2] = 13083;Tab.anIntArray240[3] = 13084;Tab.anIntArray240[4] = 13085;Tab.anIntArray240[5] = 13086;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 57;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 58;Tab.anIntArray241[5] = 105;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12976;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 12977;Tab.anIntArray240[1] = 12978;Tab.anIntArray240[2] = 12979;Tab.anIntArray240[3] = 12980;Tab.anIntArray240[4] = 12981;Tab.anIntArray240[5] = 12982;Tab.anIntArray240[6] = 12983;Tab.anIntArray240[7] = 12984;Tab.anIntArray240[8] = 12985;Tab.anIntArray240[9] = 12986;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 18;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 102;Tab.anIntArray241[9] = 142;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;
IDs = 13024;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[11];Tab.anIntArray241 = new int[11];Tab.anIntArray272 = new int[11];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[10] = 13025;Tab.anIntArray240[1] = 13026;Tab.anIntArray240[2] = 13027;Tab.anIntArray240[3] = 13028;Tab.anIntArray240[4] = 13029;Tab.anIntArray240[5] = 13030;Tab.anIntArray240[6] = 13031;Tab.anIntArray240[7] = 13032;Tab.anIntArray240[8] = 13033;Tab.anIntArray240[9] = 13034;Tab.anIntArray241[10] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 16;Tab.anIntArray241[3] = 59;Tab.anIntArray241[4] = 100;Tab.anIntArray241[5] = 140;Tab.anIntArray241[6] = 18;Tab.anIntArray241[7] = 60;Tab.anIntArray241[8] = 102;Tab.anIntArray241[9] = 142;Tab.anIntArray272[10] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 36;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 35;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 63;Tab.anIntArray272[8] = 62;Tab.anIntArray272[9] = 62;IDs = 13088;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13089;Tab.anIntArray240[1] = 13090;Tab.anIntArray240[2] = 13091;Tab.anIntArray240[3] = 13092;Tab.anIntArray240[4] = 13093;Tab.anIntArray240[5] = 13094;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 57;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 59;Tab.anIntArray241[5] = 106;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;
IDs = 12930;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[9];Tab.anIntArray241 = new int[9];Tab.anIntArray272 = new int[9];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[8] = 12931;Tab.anIntArray240[1] = 12932;Tab.anIntArray240[2] = 12933;Tab.anIntArray240[3] = 12934;Tab.anIntArray240[4] = 12935;Tab.anIntArray240[5] = 12936;Tab.anIntArray240[6] = 12937;Tab.anIntArray240[7] = 12938;Tab.anIntArray241[8] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 29;Tab.anIntArray241[3] = 79;Tab.anIntArray241[4] = 128;Tab.anIntArray241[5] = 32;Tab.anIntArray241[6] = 82;Tab.anIntArray241[7] = 130;Tab.anIntArray272[8] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 35;Tab.anIntArray272[5] = 62;Tab.anIntArray272[6] = 62;Tab.anIntArray272[7] = 62;
IDs = 13096;Tab = addTab(IDs);Tab.anInt236 = 12855;Tab.anInt250 = IDs;Tab.anInt262 = 0;Tab.anInt217 = 0;Tab.anInt220 = 182;Tab.anInt267 = 80;Tab.aBoolean266 = true;Tab.anInt214 = 0;Tab.aByte254 = 0;Tab.anInt230 = -1;Tab.anInt261 = 0;Tab.anIntArray240 = new int[7];Tab.anIntArray241 = new int[7];Tab.anIntArray272 = new int[7];Tab.anIntArray240[0] = 1782;Tab.anIntArray241[0] = 0;Tab.anIntArray272[0] = 0;Tab.anIntArray240[6] = 13097;Tab.anIntArray240[1] = 13098;Tab.anIntArray240[2] = 13099;Tab.anIntArray240[3] = 13100;Tab.anIntArray240[4] = 13101;Tab.anIntArray240[5] = 13102;Tab.anIntArray241[6] = 3;Tab.anIntArray241[1] = 3;Tab.anIntArray241[2] = 57;Tab.anIntArray241[3] = 104;Tab.anIntArray241[4] = 58;Tab.anIntArray241[5] = 105;Tab.anIntArray272[6] = 5;Tab.anIntArray272[1] = 18;Tab.anIntArray272[2] = 35;Tab.anIntArray272[3] = 35;Tab.anIntArray272[4] = 62;Tab.anIntArray272[5] = 62;

//End of Ancient Mage

Tab = addTab(1780);
Tab.anInt236 = 12855;
Tab.anInt250 = 1780;
Tab.anInt262 = 5;
Tab.anInt217 = 0;
Tab.anInt220 = 30;
Tab.anInt267 = 30;
Tab.anInt230 = 1781;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 59;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
Tab.aClass30_Sub2_Sub1_Sub1_260 = Options(10, "PP");
Tab.aClass30_Sub2_Sub1_Sub1_207 = Options(10, "PP");
Tab = addTab(1781);
Tab.anInt236 = 12855;
Tab.anInt250 = 1781;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 182;
Tab.anInt267 = 80;
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 1782;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
} 



public static void FriendsData(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 class9 = addTab(17200);

class9.anInt236 = 17200;
class9.anInt250 = 17200;
class9.anInt262 = 0;
class9.anInt217 = 0;
class9.anInt214 = 0;
class9.anInt220 = 158;
class9.anInt267 = 224;
class9.aByte254 = 0;
class9.anInt230 = -1;
class9.anInt261 = 1750;
class9.anIntArray240 = new int[1];
class9.anIntArray241 = new int[1];
class9.anIntArray272 = new int[1];

class9.anIntArray240[0] = 5066;//friends
class9.anIntArray241[0] = 0-11;
class9.anIntArray272[0] = 136-28;

}
public static void FriendsTab(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 class9 = addTab(5065);
addText(17201, "Friends List - RuneScape", wid, 1, 0xff9040);
addInterfaceSprite(17202, 173, 173, "Sprite");
addInterfaceSprite(17203, 175, 175, "Sprite");
addInterfaceSprite(17204, 176, 176, "Sprite");
//addActionButton(17205, 200, 200, 72, 32, "Add friend");
//addActionButton(17206, 201, 200, 72, 32, "Delete friend");

class9.anInt261 = 0;
class9.aBoolean266 = false;
class9.anIntArray240 = new int[9];
class9.anIntArray241 = new int[9];
class9.anIntArray272 = new int[9];

class9.anIntArray240[0] = 5066;//friends
class9.anIntArray241[0] = 0;
class9.anIntArray272[0] = 21;

class9.anIntArray240[1] = 5068;//add button
class9.anIntArray241[1] = 10;
class9.anIntArray272[1] = 225;

class9.anIntArray240[2] = 5069;//del button
class9.anIntArray241[2] = 100;
class9.anIntArray272[2] = 225;

class9.anIntArray240[3] = 5070;//"add friend"
class9.anIntArray241[3] = 16;
class9.anIntArray272[3] = 236;

class9.anIntArray240[4] = 5071;//"del friend"
class9.anIntArray241[4] = 108;
class9.anIntArray272[4] = 236;

class9.anIntArray240[5] = 17204;
class9.anIntArray241[5] = 0;
class9.anIntArray272[5] = 0;

class9.anIntArray240[6] = 17201;//"Friends List - Runescape"
class9.anIntArray241[6] = -43+9+53;
class9.anIntArray272[6] = 4;

class9.anIntArray240[7] = 17202;
class9.anIntArray241[7] = -16;
class9.anIntArray272[7] = 22;

class9.anIntArray240[8] = 17202;
class9.anIntArray241[8] = -16;
class9.anIntArray272[8] = 222;
}

public static void IgnoresData(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 class9 = addTab(18200);

class9.anInt236 = 18200;
class9.anInt250 = 18200;
class9.anInt262 = 0;
class9.anInt217 = 0;
class9.anInt214 = 0;
class9.anInt220 = 158;
class9.anInt267 = 224;
class9.aByte254 = 0;
class9.anInt230 = -1;
class9.anInt261 = 1750;
class9.anIntArray240 = new int[1];
class9.anIntArray241 = new int[1];
class9.anIntArray272 = new int[1];

class9.anIntArray240[0] = 5716;//ignores
class9.anIntArray241[0] = 0-11;
class9.anIntArray272[0] = 136-28;

}
public static void IgnoresTab(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 class9 = addTab(5715);
addText(18201, "Ignore List", wid, 1, 0xff9040);
addInterfaceSprite(18202, 173, 173, "Sprite");
addInterfaceSprite(18203, 175, 175, "Sprite");
addInterfaceSprite(18204, 176, 176, "Sprite");
//addActionButton(18205, 202, 200, 72, 32, "Add name");
//addActionButton(18206, 203, 200, 72, 32, "Delete name");

class9.anInt261 = 0;
class9.aBoolean266 = false;
class9.anIntArray240 = new int[9];
class9.anIntArray241 = new int[9];
class9.anIntArray272 = new int[9];

class9.anIntArray240[0] = 5716;//ignores
class9.anIntArray241[0] = 0;
class9.anIntArray272[0] = 21;

class9.anIntArray240[1] = 5718;//add button
class9.anIntArray241[1] = 10;
class9.anIntArray272[1] = 225;

class9.anIntArray240[2] = 5719;//del button
class9.anIntArray241[2] = 100;
class9.anIntArray272[2] = 225;

class9.anIntArray240[3] = 5720;//"add name"
class9.anIntArray241[3] = 18;
class9.anIntArray272[3] = 236;

class9.anIntArray240[4] = 5721;//"del name"
class9.anIntArray241[4] = 110;
class9.anIntArray272[4] = 236;

class9.anIntArray240[5] = 18204;
class9.anIntArray241[5] = 0;
class9.anIntArray272[5] = 0;

class9.anIntArray240[6] = 18201;//"Ignore List"
class9.anIntArray241[6] = 61;
class9.anIntArray272[6] = 4;

class9.anIntArray240[7] = 18202;
class9.anIntArray241[7] = -16;
class9.anIntArray272[7] = 22;

class9.anIntArray240[8] = 18202;
class9.anIntArray241[8] = -16;
class9.anIntArray272[8] = 222;
}
    public static void addActionButton(int i, int j, int k, int width, int height, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = width;
        class9.anInt267 = height;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(j, "custom");
        class9.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(k, "custom");
        class9.aString221 = s;
    }

    public static void removeSomething(int i)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
    }

    public static void addText(int id, String text, Class30_Sub2_Sub1_Sub4 wid[], int idx, int color) {
		Class9 Tab = addTab(id);
		Tab.anInt250 = id;
		Tab.anInt236 = id;
		Tab.anInt262 = 4;
		Tab.anInt217 = 0;
		Tab.anInt220 = 174;
		Tab.anInt267 = 11;
		Tab.anInt214 = 0;
		Tab.aByte254 = 0;
		Tab.anInt230 = -1;
		Tab.aBoolean223 = false;
		Tab.aBoolean268 = true;
		Tab.aClass30_Sub2_Sub1_Sub4_243 = wid[idx];
		Tab.aString248 = text;
		Tab.aString228 = "";
		Tab.anInt232 = color;
		Tab.anInt219 = 0;
		Tab.anInt216 = 0;
		Tab.anInt239 = 0;	
	}

    public static void addChar(int ID) { 
	Class9 class9 = aClass9Array210[ID] = new Class9(); 
	class9.anInt250 = ID; 
	class9.anInt236 = ID; 
	class9.anInt262 = 6;
	class9.anInt217 = 0; 
	class9.anInt214 = 328; 
	class9.anInt220 = 136; 
	class9.anInt267 = 168; 
	class9.aByte254 = 0;
	class9.anInt230 = 0;
	class9.anInt269 = 650;
	class9.anInt270 = 150;
	class9.anInt271 = 0; 
	class9.anInt257 = -1; 
	class9.anInt258 = -1; 
}
public static Class9 addDTab(int i)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt214 = 0;
        class9.anInt220 = 512;
        class9.anInt267 = 334;
        class9.aByte254 = 0;
        class9.anInt230 = 0;
        return class9;
    
    }
private static Class30_Sub2_Sub1_Sub1 loadAscheriitSprite(int i, String s)
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
 class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}
public static void addCloseButton(int i)
    {
        Class9 Close = aClass9Array210[i] = new Class9();
        Close.anInt250 = i;
        Close.anInt236 = i;
        Close.anInt262 = 5;
        Close.anInt217 = 6;
        Close.anInt214 = 0;
        Close.anInt220 = 21;
        Close.anInt267 = 21;
        Close.aByte254 = 0;
        Close.anInt230 = 52;
        Close.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(1, "death");
        Close.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(1, "death");
     Close.aString221 = "Close Window";
    }
public static void addDSprite(int i, int j, int k)
    {
        Class9 dSprite = aClass9Array210[i] = new Class9();
        dSprite.anInt250 = i;
        dSprite.anInt236 = i;
        dSprite.anInt262 = 5;
        dSprite.anInt217 = 1;
        dSprite.anInt214 = 0;
        dSprite.anInt220 = 20;
        dSprite.anInt267 = 20;
        dSprite.aByte254 = 0;
        dSprite.anInt230 = 52;
        dSprite.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(j, "death");
        dSprite.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(k, "death");
    }

    public void method204(int i, byte byte0, int j)
    {
        int k = anIntArray253[i];
        anIntArray253[i] = anIntArray253[j];
        if(byte0 == 9)
        {
            byte0 = 0;
        } else
        {
            anInt229 = -76;
        }
        anIntArray253[j] = k;
        k = anIntArray252[i];
        anIntArray252[i] = anIntArray252[j];
        anIntArray252[j] = k;
    }

public static Class9 addTab2(int id)
	{
    	Class9 Tab = aClass9Array210[id] = new Class9();
    	Tab.anInt250 = id;//250
        Tab.anInt236 = id;//236
        Tab.anInt262 = 0;//262
        Tab.anInt217 = 0;//217
        Tab.anInt214 = 0;
        Tab.anInt220 = 512;//220
        Tab.anInt267 = 700;//anint267
        Tab.aByte254 = (byte)0;
        Tab.anInt230 = -1;//Int 230
        return Tab;
	}
public static void ClanChatscroll()
{
Class9 Tab = addTab(18500);

Tab.anInt261 = 0;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[2];
Tab.anIntArray241 = new int[2];
Tab.anIntArray272 = new int[2];
Tab.anIntArray240[0] = 18501;
Tab.anIntArray241[0] = -10;
Tab.anIntArray272[0] = 48;
Tab.anIntArray240[1] = 16000;
Tab.anIntArray241[1] = 0;
Tab.anIntArray272[1] = 0;
Tab = addTab(18501);
Tab.anInt236 = 18500;
Tab.anInt250 = 18501;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt214 = 0;
Tab.anInt220 = 177;
Tab.anInt267 = 172;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 450;
Tab.aBoolean266 = false;//boolean
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];

Tab.anIntArray240[0] = 16500;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = -48;


}
 public static void ClanChat(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 Tab = addTab(16000); //clan chat interface id
addclanchatbackround(16001, 5, 5);//big clanchatbox
addclanchatbackround(16002, 6, 6);//big clanchatbox
addclanchatbigbuttons(16009, 1, 1, "Join Clan");
addclanchatbigbuttons(16008, 2, 2, "Commands");

addlootsharebutton(16004, 4, 4, "Loot Share");
			
    addText(16005, "Clan Chat", wid, 2, 0xff9040);
    addText(16006, "Owner:", wid, 0, 0xff9040);
    addText(16007, "Talking in:", wid, 0, 0xff9040);

		Tab.anInt261 = 0;
        Tab.aBoolean266 = false;
        Tab.anIntArray240 = new int[9]; //Interface id
        Tab.anIntArray241 = new int[9]; //X pos
        Tab.anIntArray272 = new int[9]; //Y pos

    Tab.anIntArray240[0] = 16001; //Interface id changed from 16001
    Tab.anIntArray241[0] = -1; //X pos
    Tab.anIntArray272[0] = 213; //Y pos

    Tab.anIntArray240[1] = 16002; //Interface id
    Tab.anIntArray241[1] = -2; //X pos
    Tab.anIntArray272[1] = 0; //Y pos

    Tab.anIntArray240[2] = 16003; //Interface id
    Tab.anIntArray241[2] = 0; //X pos
    Tab.anIntArray272[2] = 0; //Y pos

    Tab.anIntArray240[3] = 16004; //Interface id
    Tab.anIntArray241[3] = 145; //X pos
    Tab.anIntArray272[3] = 15; //Y pos

    Tab.anIntArray240[4] = 16005;
    Tab.anIntArray241[4] = 64;
    Tab.anIntArray272[4] = 1;

    Tab.anIntArray240[5] = 16006; //Interface id
    Tab.anIntArray241[5] = 40; //X pos
    Tab.anIntArray272[5] = 18; //Y pos


    Tab.anIntArray240[6] = 16007; //Interface id
    Tab.anIntArray241[6] = 55; //X pos
    Tab.anIntArray272[6] = 33; //Y pos

    Tab.anIntArray240[7] = 16008; //Interface id
    Tab.anIntArray241[7] = 98; //X pos
    Tab.anIntArray272[7] = 225; //Y pos

    Tab.anIntArray240[8] = 16009; //Interface id
    Tab.anIntArray241[8] = 13; //X pos
    Tab.anIntArray272[8] = 225; //Y pos
	}
 public static void ClanChatBox(Class30_Sub2_Sub1_Sub4[] wid)
{
Class9 Tab = addTab2(16500); //clan chat interface id

addclanchatbackround(16501, 3, 3);//big clanchatbox
addText(16502, "empty1", wid, 0, 0xffffff);
addText(16503, "empty2", wid, 0, 0xffffff);
addText(16504, "empty3", wid, 0, 0xffffff);
addText(16505, "empty4", wid, 0, 0xffffff);
addText(16506, "empty5", wid, 0, 0xffffff);
addText(16507, "empty6", wid, 0, 0xffffff);


		Tab.anInt261 = 0;
        Tab.aBoolean266 = false;
        Tab.anIntArray240 = new int[7]; //Interface id
        Tab.anIntArray241 = new int[7]; //X pos
        Tab.anIntArray272 = new int[7]; //Y pos

    Tab.anIntArray240[0] = 16501; //Interface id
    Tab.anIntArray241[0] = 8; //X pos
    Tab.anIntArray272[0] = 48; //Y pos

    Tab.anIntArray240[1] = 16502;
    Tab.anIntArray241[1] = 19;
    Tab.anIntArray272[1] = 62;

    Tab.anIntArray240[2] = 16503;
    Tab.anIntArray241[2] = 19;
    Tab.anIntArray272[2] = 75;

    Tab.anIntArray240[3] = 16504;
    Tab.anIntArray241[3] = 19;
    Tab.anIntArray272[3] = 88;

    Tab.anIntArray240[4] = 16505;
    Tab.anIntArray241[4] = 19;
    Tab.anIntArray272[4] = 101;

    Tab.anIntArray240[5] = 16506;
    Tab.anIntArray241[5] = 19;
    Tab.anIntArray272[5] = 114;

    Tab.anIntArray240[6] = 16507;
    Tab.anIntArray241[6] = 19;
    Tab.anIntArray272[6] = 127;
   
	}

private static Class30_Sub2_Sub1_Sub1 cc(int i, String s) {
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir()+"/clan chat/"+s+" "+i+".png");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}
private static Class30_Sub2_Sub1_Sub1 customsprite4(int i, boolean flag, Class44 class44, String s)
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
if(flag)
{
throw new NullPointerException();
}
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null)
{
return class30_sub2_sub1_sub1;
}
try
{
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir()+"/clan chat/"+s+" "+i+".png");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
catch(Exception exception)
{
return null; // ok so these are the new custom sprite loading things lol i dunno
}
return class30_sub2_sub1_sub1;
}
public static void addclanchatbackround(int id, int spriteOnId, int spriteOffId)
{
Class9 spell = aClass9Array210[id] = new Class9();
spell.anInt250 = id;//spell.id
spell.anInt236 = id;//parentID
spell.anInt262 = 5;//type
spell.anInt217 = 1;//atActionType
spell.anInt214 = 0;//?????
spell.anInt220 = 2;//width
spell.anInt267 = 2;//height
spell.aByte254 = (byte)0;
spell.anInt230 = 52;
spell.aClass30_Sub2_Sub1_Sub1_207 = cc(spriteOnId, "button");
spell.aClass30_Sub2_Sub1_Sub1_260 = cc(spriteOffId, "button");        	
}
public static void addclanchatbigbuttons(int id, int spriteOnId, int spriteOffId, String castText)
    {
    	Class9 spell = aClass9Array210[id] = new Class9();
    	spell.anInt250 = id;//250
        spell.anInt236 = id;//236
        spell.anInt262 = 5;//262
        spell.anInt217 = 1;//217
        spell.anInt214 = 0;
        spell.anInt220 = 72;//220
        spell.anInt267 = 32;//anint267
        spell.aByte254 = (byte)0;
        spell.anInt230 = 52;
       	spell.aClass30_Sub2_Sub1_Sub1_207 = cc(spriteOnId, "button");
	spell.aClass30_Sub2_Sub1_Sub1_260 = cc(spriteOffId, "button");
       	spell.aString221 = castText;
	}
public static void addlootsharebutton(int id, int spriteOnId, int spriteOffId, String castText)
    {
    	Class9 spell = aClass9Array210[id] = new Class9();
    	spell.anInt250 = id;//250
        spell.anInt236 = id;//236
        spell.anInt262 = 5;//262
        spell.anInt217 = 1;//217
        spell.anInt214 = 0;
        spell.anInt220 = 24;//220
        spell.anInt267 = 22;//anint267
        spell.aByte254 = (byte)0;
        spell.anInt230 = 52;
       	spell.aClass30_Sub2_Sub1_Sub1_207 = cc(spriteOnId, "button");
		spell.aClass30_Sub2_Sub1_Sub1_260 = cc(spriteOffId, "button");
       	spell.aString221 = castText;
	}
    public static void itemsOnDeath(Class30_Sub2_Sub1_Sub4[] wid)
    {
        Class9 death = addDTab(18100);
        addDSprite(18101, 2, 2);
        addCloseButton(18102);
        addText(18103, "", wid, 2, 0xff981f);
        addText(18104, "", wid, 1, 0xff981f);
        addText(18105, "", wid, 1, 0xff981f);
        addText(18106, "", wid, 1, 0xff981f);
        addText(18107, "", wid, 1, 0xffcc33);
        addText(18108, "", wid, 1, 0xffcc33);
        death.anInt261 = 0;
        death.aBoolean266 = false;
        death.anIntArray240 = new int[11];
        death.anIntArray241 = new int[11];
        death.anIntArray272 = new int[11];
        death.anIntArray240[0] = 18101;
        death.anIntArray241[0] = 7;
        death.anIntArray272[0] = 8;
        death.anIntArray240[1] = 18102;
        death.anIntArray241[1] = 480;
        death.anIntArray272[1] = 17;        
        death.anIntArray240[2] = 18103;
        death.anIntArray241[2] = 185;
        death.anIntArray272[2] = 18;
        death.anIntArray240[3] = 18104;
        death.anIntArray241[3] = 22;
        death.anIntArray272[3] = 50;
        death.anIntArray240[4] = 18105;
        death.anIntArray241[4] = 22;
        death.anIntArray272[4] = 110;
        death.anIntArray240[5] = 18106;
        death.anIntArray241[5] = 347;
        death.anIntArray272[5] = 47;
        death.anIntArray240[6] = 18107;
        death.anIntArray241[6] = 349;
        death.anIntArray272[6] = 270;
        death.anIntArray240[7] = 18108;
        death.anIntArray241[7] = 398;
        death.anIntArray272[7] = 298;
        death.anIntArray240[8] = 18115;
        death.anIntArray241[8] = 348;
        death.anIntArray272[8] = 64;
        death.anIntArray240[9] = 10494;
        death.anIntArray241[9] = 26;
        death.anIntArray272[9] = 74;
        death.anIntArray240[10] = 10600;
        death.anIntArray241[10] = 26;
        death.anIntArray272[10] = 133;
    }
    public static void itemsOnDeathDATA(Class30_Sub2_Sub1_Sub4[] wid)
    {
        Class9 death = addDTab(18115);
        addText(18109, "", wid, 0, 0xff981f);
        addText(18110, "", wid, 0, 0xff981f);
        addText(18111, "", wid, 0, 0xff981f);
        addText(18112, "", wid, 0, 0xff981f);
        addText(18113, "", wid, 0, 0xff981f);
        addText(18114, "", wid, 0, 0xff981f);
        addText(18117, "", wid, 0, 0xff981f);
        addText(18118, "", wid, 0, 0xff981f);
        addText(18119, "", wid, 0, 0xff981f);
        addText(18120, "", wid, 0, 0xff981f);
        addText(18121, "", wid, 0, 0xff981f);
        addText(18122, "", wid, 0, 0xff981f);
        addText(18123, "", wid, 0, 0xff981f);
        addText(18124, "", wid, 0, 0xff981f);
        addText(18125, "", wid, 0, 0xff981f);
        addText(18126, "", wid, 0, 0xff981f);
        addText(18127, "", wid, 0, 0xff981f);
        addText(18128, "", wid, 0, 0xff981f);
        addText(18129, "", wid, 0, 0xff981f);
        addText(18130, "", wid, 0, 0xff981f);
        death.anInt236 = 18115;
        death.anInt250 = 18115;
        death.anInt262 = 0;
        death.anInt217 = 0;
        death.anInt214 = 0;
        death.anInt220 = 130;
        death.anInt267 = 197;
        death.aByte254 = 0;
        death.anInt230 = -1;
        death.anInt261 = 280;
        death.anIntArray240 = new int[20];
        death.anIntArray241 = new int[20];
        death.anIntArray272 = new int[20];
        death.anIntArray240[0] = 18109;
        death.anIntArray241[0] = 0;
        death.anIntArray272[0] = 0;
        death.anIntArray240[1] = 18110;
        death.anIntArray241[1] = 0;
        death.anIntArray272[1] = 12;
        death.anIntArray240[2] = 18111;
        death.anIntArray241[2] = 0;
        death.anIntArray272[2] = 24;
        death.anIntArray240[3] = 18112;
        death.anIntArray241[3] = 0;
        death.anIntArray272[3] = 36;
        death.anIntArray240[4] = 18113;
        death.anIntArray241[4] = 0;
        death.anIntArray272[4] = 48;
        death.anIntArray240[5] = 18114;
        death.anIntArray241[5] = 0;
        death.anIntArray272[5] = 60;
        death.anIntArray240[6] = 18117;
        death.anIntArray241[6] = 0;
        death.anIntArray272[6] = 72;
        death.anIntArray240[7] = 18118;
        death.anIntArray241[7] = 0;
        death.anIntArray272[7] = 84;
        death.anIntArray240[8] = 18119;
        death.anIntArray241[8] = 0;
        death.anIntArray272[8] = 96;
        death.anIntArray240[9] = 18120;
        death.anIntArray241[9] = 0;
        death.anIntArray272[9] = 108;
        death.anIntArray240[10] = 18121;
        death.anIntArray241[10] = 0;
        death.anIntArray272[10] = 120;
        death.anIntArray240[11] = 18122;
        death.anIntArray241[11] = 0;
        death.anIntArray272[11] = 132;
        death.anIntArray240[12] = 18123;
        death.anIntArray241[12] = 0;
        death.anIntArray272[12] = 144;
        death.anIntArray240[13] = 18124;
        death.anIntArray241[13] = 0;
        death.anIntArray272[13] = 156;
        death.anIntArray240[14] = 18125;
        death.anIntArray241[14] = 0;
        death.anIntArray272[14] = 168;
        death.anIntArray240[15] = 18126;
        death.anIntArray241[15] = 0;
        death.anIntArray272[15] = 180;
        death.anIntArray240[16] = 18127;
        death.anIntArray241[16] = 0;
        death.anIntArray272[16] = 192;
        death.anIntArray240[17] = 18128;
        death.anIntArray241[17] = 0;
        death.anIntArray272[17] = 204;
        death.anIntArray240[18] = 18129;
        death.anIntArray241[18] = 0;
        death.anIntArray272[18] = 216;
        death.anIntArray240[19] = 18130;
        death.anIntArray241[19] = 0;
        death.anIntArray272[19] = 228;
}
public static void harrysoptiontab(Class44 sl, Class30_Sub2_Sub1_Sub4 tda[])
{
        String s1 = "";
        int i1 = 0;

Class9 Tab = addTab(19120);
Tab.anInt236 = 5608;
Tab.anInt250 = 19120;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 500;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,100";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19121);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19121;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19122, 98, 98);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19122;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19123);
Tab.anInt236 = 5608;
Tab.anInt250 = 19123;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19121;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,99";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,99";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19124);
Tab.anInt236 = 5608;
Tab.anInt250 = 19124;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 501;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,101";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19125);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19125;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19126, 103, 103);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19126;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19127);
Tab.anInt236 = 5608;
Tab.anInt250 = 19127;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19125;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,102";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,102";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));




Tab = addTab(19128);
Tab.anInt236 = 5608;
Tab.anInt250 = 19128;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 502;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,104";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19129);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19129;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19130, 106, 106);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19130;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19131);
Tab.anInt236 = 5608;
Tab.anInt250 = 19131;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19129;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,105";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,105";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));


Tab = addTab(19132);
Tab.anInt236 = 5608;
Tab.anInt250 = 19132;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 503;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,107";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19133);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19133;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19134, 109, 109);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19134;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19135);
Tab.anInt236 = 5608;
Tab.anInt250 = 19135;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19133;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,108";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,108";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));



Tab = addTab(19136);
Tab.anInt236 = 5608;
Tab.anInt250 = 19136;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 504;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,26";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19137);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19137;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19138, 110, 110);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19138;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19139);
Tab.anInt236 = 5608;
Tab.anInt250 = 19139;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19137;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,27";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,27";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19140);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19140;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19141, 112, 112);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19141;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19142);
Tab.anInt236 = 5608;
Tab.anInt250 = 19142;
Tab.anInt262 = 5;//type
Tab.anInt217 = 1;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19140;//discription box id
Tab.aString221 = "Toggle";
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,111";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,111";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19101);
Tab.anInt236 = 19100;
Tab.anInt250 = 19101;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt214 = 0;
Tab.anInt220 = 169;
Tab.anInt267 = 260;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 450;
Tab.aBoolean266 = false;//boolean
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19000;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;


Tab = addTab(19145);

        Tab.anInt236 = 5608;
        Tab.anInt250 = 19145;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 505;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19146);
Tab.anInt236 = 5608;
Tab.anInt250 = 19146;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = -1;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "MISCGRAPHICS3,0";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "MISCGRAPHICS3,0";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab = addTab(19147);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19147;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 506;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19148);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19148;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 507;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19149);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19149;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 508;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19150);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19150;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 509;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19151);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19151;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 510;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19152);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19152;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 511;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19153);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19153;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 512;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";


Tab = addTab(19029);
addSpellClick2(19143, 113, 113);
addSpellClick2(19144, 114, 114);
addSpellClick2(19023, 21, 21);
addSpellClick2(19024, 22, 22);
addSpellClick2(19025, 23, 23);
addSpellClick2(19026, 24, 24);
addSpellClick2(19027, 25, 25);
addSpellClick2(19028, 28, 28);
Tab.anInt261 = 0;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[66]; //Interface id
Tab.anIntArray241 = new int[66]; //X pos
Tab.anIntArray272 = new int[66]; //Y pos
Tab.anIntArray240[0] = 19123; //sprite
Tab.anIntArray241[0] = 13; //width
Tab.anIntArray272[0] = 152; //height
Tab.anIntArray240[1] = 19120; //select
Tab.anIntArray241[1] = 13; //width
Tab.anIntArray272[1] = 152; //height
Tab.anIntArray240[2] = 19127; //sprite
Tab.anIntArray241[2] = 69; //width
Tab.anIntArray272[2] = 152; //height
Tab.anIntArray240[3] = 19124; //select
Tab.anIntArray241[3] = 69; //width
Tab.anIntArray272[3] = 152; //height
Tab.anIntArray240[4] = 19131; //sprite
Tab.anIntArray241[4] = 125; //width
Tab.anIntArray272[4] = 152; //height
Tab.anIntArray240[5] = 19128; //select
Tab.anIntArray241[5] = 125; //width
Tab.anIntArray272[5] = 152; //height
Tab.anIntArray240[6] = 19135; //sprite
Tab.anIntArray241[6] = 13; //width
Tab.anIntArray272[6] = 206; //height
Tab.anIntArray240[7] = 19132; //select
Tab.anIntArray241[7] = 13; //width
Tab.anIntArray272[7] = 206; //height
Tab.anIntArray240[8] = 19139; //sprite
Tab.anIntArray241[8] = 69; //width
Tab.anIntArray272[8] = 206; //height
Tab.anIntArray240[9] = 19136; //select
Tab.anIntArray241[9] = 69; //width
Tab.anIntArray272[9] = 206; //height
Tab.anIntArray240[10] = 149; //energytext
Tab.anIntArray241[10] = 74; //width
Tab.anIntArray272[10] = 228; //height
Tab.anIntArray240[11] = 19142; //sprite
Tab.anIntArray241[11] = 125; //width
Tab.anIntArray272[11] = 206; //height
Tab.anIntArray240[12] = 19121; //box 1
Tab.anIntArray241[12] = 24; //width
Tab.anIntArray272[12] = 196; //height
Tab.anIntArray240[13] = 19125; //box 1
Tab.anIntArray241[13] = 63; //width
Tab.anIntArray272[13] = 196; //height
Tab.anIntArray240[14] = 19129; //box 1
Tab.anIntArray241[14] = 80; //width
Tab.anIntArray272[14] = 196; //height
Tab.anIntArray240[15] = 19133; //box 1
Tab.anIntArray241[15] = 22; //width
Tab.anIntArray272[15] = 183; //height
Tab.anIntArray240[16] = 19137; //box 1
Tab.anIntArray241[16] = 74; //width
Tab.anIntArray272[16] = 183; //height
Tab.anIntArray240[17] = 19140; //box 1
Tab.anIntArray241[17] = 85; //width
Tab.anIntArray272[17] = 183; //height
Tab.anIntArray240[18] = 19023; //music icon
Tab.anIntArray241[18] = 3; //width
Tab.anIntArray272[18] = 45; //height
Tab.anIntArray240[19] = 19024; //effect icon
Tab.anIntArray241[19] = 3; //width
Tab.anIntArray272[19] = 81; //height
Tab.anIntArray240[20] = 19025; //bar 1
Tab.anIntArray241[20] = 43; //width
Tab.anIntArray272[20] = 55; //height
Tab.anIntArray240[21] = 19026; //bar 2
Tab.anIntArray241[21] = 65; //width
Tab.anIntArray272[21] = 55; //height
Tab.anIntArray240[22] = 930; //music off
Tab.anIntArray241[22] = 47; //width
Tab.anIntArray272[22] = 50; //height
Tab.anIntArray240[23] = 19026; //bar3
Tab.anIntArray241[23] = 96; //width
Tab.anIntArray272[23] = 55; //height
Tab.anIntArray240[24] = 931; //music volume1
Tab.anIntArray241[24] = 78; //width
Tab.anIntArray272[24] = 50; //height
Tab.anIntArray240[25] = 19026; //bar4
Tab.anIntArray241[25] = 127; //width
Tab.anIntArray272[25] = 55; //height
Tab.anIntArray240[26] = 932; //music volume2
Tab.anIntArray241[26] = 109; //width
Tab.anIntArray272[26] = 50; //height
Tab.anIntArray240[27] = 19027; //bar5
Tab.anIntArray241[27] = 158; //width
Tab.anIntArray272[27] = 55; //height
Tab.anIntArray240[28] = 934; //music volume4
Tab.anIntArray241[28] = 140; //width
Tab.anIntArray272[28] = 50; //height
Tab.anIntArray240[29] = 19025; //bar 1
Tab.anIntArray241[29] = 43; //width
Tab.anIntArray272[29] = 91; //height
Tab.anIntArray240[30] = 19026; //bar 2
Tab.anIntArray241[30] = 65; //width
Tab.anIntArray272[30] = 91; //height
Tab.anIntArray240[31] = 941; //music off
Tab.anIntArray241[31] = 47; //width
Tab.anIntArray272[31] = 86; //height
Tab.anIntArray240[32] = 19026; //bar3
Tab.anIntArray241[32] = 96; //width
Tab.anIntArray272[32] = 91; //height
Tab.anIntArray240[33] = 942; //music volume1
Tab.anIntArray241[33] = 78; //width
Tab.anIntArray272[33] = 86; //height
Tab.anIntArray240[34] = 19026; //bar4
Tab.anIntArray241[34] = 127; //width
Tab.anIntArray272[34] = 91; //height
Tab.anIntArray240[35] = 944; //music volume2
Tab.anIntArray241[35] = 109; //width
Tab.anIntArray272[35] = 86; //height
Tab.anIntArray240[36] = 19027; //bar5
Tab.anIntArray241[36] = 158; //width
Tab.anIntArray272[36] = 91; //height
Tab.anIntArray240[37] = 945; //music volume4
Tab.anIntArray241[37] = 140; //width
Tab.anIntArray272[37] = 86; //height
Tab.anIntArray240[38] = 19143; //light icon
Tab.anIntArray241[38] = 3; //width
Tab.anIntArray272[38] = 8; //height
Tab.anIntArray240[39] = 19144; //area icon
Tab.anIntArray241[39] = 4; //width
Tab.anIntArray272[39] = 119; //height
Tab.anIntArray240[40] = 19025; //bar 1
Tab.anIntArray241[40] = 43; //width
Tab.anIntArray272[40] = 18; //height
Tab.anIntArray240[41] = 19026; //bar 2
Tab.anIntArray241[41] = 65; //width
Tab.anIntArray272[41] = 18; //height
Tab.anIntArray240[42] = 19026; //bar3
Tab.anIntArray241[42] = 96; //width
Tab.anIntArray272[42] = 18; //height
Tab.anIntArray240[43] = 19026; //bar4
Tab.anIntArray241[43] = 127; //width
Tab.anIntArray272[43] = 18; //height
Tab.anIntArray240[44] = 19027; //bar5
Tab.anIntArray241[44] = 158; //width
Tab.anIntArray272[44] = 18; //height
Tab.anIntArray240[45] = 19025; //bar 1
Tab.anIntArray241[45] = 43; //width
Tab.anIntArray272[45] = 128; //height
Tab.anIntArray240[46] = 19026; //bar 2
Tab.anIntArray241[46] = 65; //width
Tab.anIntArray272[46] = 128; //height
Tab.anIntArray240[47] = 19026; //bar3
Tab.anIntArray241[47] = 96; //width
Tab.anIntArray272[47] = 128; //height
Tab.anIntArray240[48] = 19026; //bar4
Tab.anIntArray241[48] = 127; //width
Tab.anIntArray272[48] = 128; //height
Tab.anIntArray240[49] = 19027; //bar5
Tab.anIntArray241[49] = 158; //width
Tab.anIntArray272[49] = 128; //height
Tab.anIntArray240[50] = 19146; //bar4
Tab.anIntArray241[50] = 47; //width
Tab.anIntArray272[50] = 13; //height
Tab.anIntArray240[51] = 19145; //bar5
Tab.anIntArray241[51] = 47; //width
Tab.anIntArray272[51] = 13; //height
Tab.anIntArray240[52] = 19146; //bar4
Tab.anIntArray241[52] = 78; //width
Tab.anIntArray272[52] = 13; //height
Tab.anIntArray240[53] = 19147; //bar5
Tab.anIntArray241[53] = 78; //width
Tab.anIntArray272[53] = 13; //height
Tab.anIntArray240[54] = 19146; //bar4
Tab.anIntArray241[54] = 109; //width
Tab.anIntArray272[54] = 13; //height
Tab.anIntArray240[55] = 19148; //bar5
Tab.anIntArray241[55] = 109; //width
Tab.anIntArray272[55] = 13; //height
Tab.anIntArray240[56] = 19146; //bar4
Tab.anIntArray241[56] = 140; //width
Tab.anIntArray272[56] = 13; //height
Tab.anIntArray240[57] = 19149; //bar5
Tab.anIntArray241[57] = 140; //width
Tab.anIntArray272[57] = 13; //height
Tab.anIntArray240[58] = 19146; //bar4
Tab.anIntArray241[58] = 47; //width
Tab.anIntArray272[58] = 123; //height
Tab.anIntArray240[59] = 19150; //bar5
Tab.anIntArray241[59] = 47; //width
Tab.anIntArray272[59] = 123; //height
Tab.anIntArray240[60] = 19146; //bar4
Tab.anIntArray241[60] = 78; //width
Tab.anIntArray272[60] = 123; //height
Tab.anIntArray240[61] = 19151; //bar5
Tab.anIntArray241[61] = 78; //width
Tab.anIntArray272[61] = 123; //height
Tab.anIntArray240[62] = 19146; //bar4
Tab.anIntArray241[62] = 109; //width
Tab.anIntArray272[62] = 123; //height
Tab.anIntArray240[63] = 19152; //bar5
Tab.anIntArray241[63] = 109; //width
Tab.anIntArray272[63] = 123; //height
Tab.anIntArray240[64] = 19146; //bar4
Tab.anIntArray241[64] = 140; //width
Tab.anIntArray272[64] = 123; //height
Tab.anIntArray240[65] = 19153; //bar5
Tab.anIntArray241[65] = 140; //width
Tab.anIntArray272[65] = 123; //height

}

public static void EmoteTab3()
{
Class9 Tab = addTabb(19100);
addSpellClick2(19102, 29, 29);
addSpellClick2(19103, 30, 30);
Tab.anInt261 = 0;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19101;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;
}

public static void EmoteTab()
{
Class9 Tab = addTabb(19000);
addSpellClick3(19201, 0, 0, "Yes");
addSpellClick3(19203, 2, 2, "No");
addSpellClick3(19204, 3, 3, "Bow");
addSpellClick3(19205, 4, 4, "Angry");
addSpellClick3(19206, 5, 5, "Think");
addSpellClick3(19207, 6, 6, "Wave");
addSpellClick3(19208, 7, 7, "Shrug");
addSpellClick3(19209, 8, 8, "Cheer");
addSpellClick3(19010, 9, 9, "Beckon");
addSpellClick3(19011, 10, 10, "Laugh");
addSpellClick3(19012, 11, 11, "Jump for Joy");
addSpellClick3(19013, 12, 12, "Yawn");
addSpellClick3(19014, 13, 13, "Dance");
addSpellClick3(19015, 14, 14, "Jig");
addSpellClick3(19016, 15, 15, "Spin");
addSpellClick3(19017, 16, 16, "Headbang");
addSpellClick3(19018, 17, 17, "Cry");
addSpellClick3(19019, 18, 18, "Panic");
addSpellClick3(19020, 19, 19, "Raspberry");
addSpellClick3(19021, 20, 19, "SkillCape");
addSpellClick3(19107, 33, 33, "Clap");
addSpellClick3(19108, 34, 34, "Salute");
addSpellClick3(19109, 35, 35, "Goblin Bow");
addSpellClick3(19110, 36, 36, "Goblin Dance");
addSpellClick3(19111, 93, 93, "Glass Box");
addSpellClick3(19112, 94, 94, "Climb Rope");
addSpellClick3(19113, 95, 95, "Lean");
addSpellClick3(19114, 96, 96, "Glass Wall");
addSpellClick3(19115, 37, 37, "Zombie Walk");
addSpellClick3(19116, 38, 38, "Zombie Dance");
addSpellClick3(19117, 91, 91, "Scared");
addSpellClick3(19118, 92, 92, "Stomp");
addSpellClick3(19119, 97, 97, "Blow Kiss");
Tab.anInt261 = 260;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[33];
Tab.anIntArray241 = new int[33];
Tab.anIntArray272 = new int[33];
Tab.anIntArray240[0] = 19201;
Tab.anIntArray241[0] = 3;
Tab.anIntArray272[0] = 5;
Tab.anIntArray240[1] = 19203; 
Tab.anIntArray241[1] = 47; 
Tab.anIntArray272[1] = 5; 
Tab.anIntArray240[2] = 19204; 
Tab.anIntArray241[2] = 91; 
Tab.anIntArray272[2] = 12; 
Tab.anIntArray240[3] = 19205; 
Tab.anIntArray241[3] = 130; 
Tab.anIntArray272[3] = 5; 
Tab.anIntArray240[4] = 19206; 
Tab.anIntArray241[4] = 2; 
Tab.anIntArray272[4] = 54; 
Tab.anIntArray240[5] = 19207; 
Tab.anIntArray241[5] = 40;
Tab.anIntArray272[5] = 54;
Tab.anIntArray240[6] = 19208;
Tab.anIntArray241[6] = 88;
Tab.anIntArray272[6] = 54;
Tab.anIntArray240[7] = 19209;
Tab.anIntArray241[7] = 130;
Tab.anIntArray272[7] = 54;
Tab.anIntArray240[8] = 19010; 
Tab.anIntArray241[8] = 0; 
Tab.anIntArray272[8] = 103; 
Tab.anIntArray240[9] = 19011; 
Tab.anIntArray241[9] = 43; 
Tab.anIntArray272[9] = 103; 
Tab.anIntArray240[10] = 19012; 
Tab.anIntArray241[10] = 88; 
Tab.anIntArray272[10] = 102; 
Tab.anIntArray240[11] = 19013; 
Tab.anIntArray241[11] = 132; 
Tab.anIntArray272[11] = 103; 
Tab.anIntArray240[12] = 19014; 
Tab.anIntArray241[12] = 1; 
Tab.anIntArray272[12] = 152; 
Tab.anIntArray240[13] = 19015; 
Tab.anIntArray241[13] = 42; 
Tab.anIntArray272[13] = 152; 
Tab.anIntArray240[14] = 19016; 
Tab.anIntArray241[14] = 83; 
Tab.anIntArray272[14] = 152; 
Tab.anIntArray240[15] = 19017;
Tab.anIntArray241[15] = 128; 
Tab.anIntArray272[15] = 152; 
Tab.anIntArray240[16] = 19018; 
Tab.anIntArray241[16] = 2; 
Tab.anIntArray272[16] = 202; 
Tab.anIntArray240[17] = 19119; 
Tab.anIntArray241[17] = 45; 
Tab.anIntArray272[17] = 201; 
Tab.anIntArray240[18] = 19019; 
Tab.anIntArray241[18] = 93; 
Tab.anIntArray272[18] = 202; 
Tab.anIntArray240[19] = 19020; 
Tab.anIntArray241[19] = 131; 
Tab.anIntArray272[19] = 202; 
Tab.anIntArray240[20] = 19107; 
Tab.anIntArray241[20] = 5; 
Tab.anIntArray272[20] = 251; 
Tab.anIntArray240[21] = 19108; 
Tab.anIntArray241[21] = 48; 
Tab.anIntArray272[21] = 251; 
Tab.anIntArray240[22] = 19109; 
Tab.anIntArray241[22] = 83; 
Tab.anIntArray272[22] = 256; 
Tab.anIntArray240[23] = 19110; 
Tab.anIntArray241[23] = 133; 
Tab.anIntArray272[23] = 250; 
Tab.anIntArray240[24] = 19111; 
Tab.anIntArray241[24] = 0; 
Tab.anIntArray272[24] = 301; 
Tab.anIntArray240[25] = 19112; 
Tab.anIntArray241[25] = 47; 
Tab.anIntArray272[25] = 300; 
Tab.anIntArray240[26] = 19113; 
Tab.anIntArray241[26] = 91; 
Tab.anIntArray272[26] = 300; 
Tab.anIntArray240[27] = 19114; 
Tab.anIntArray241[27] = 135; 
Tab.anIntArray272[27] = 300; 
Tab.anIntArray240[28] = 19115; 
Tab.anIntArray241[28] = 7; 
Tab.anIntArray272[28] = 350; 
Tab.anIntArray240[29] = 19116; 
Tab.anIntArray241[29] = 48; 
Tab.anIntArray272[29] = 350; 
Tab.anIntArray240[30] = 19117;
Tab.anIntArray241[30] = 92; 
Tab.anIntArray272[30] = 354; 
Tab.anIntArray240[31] = 19118; 
Tab.anIntArray241[31] = 137; 
Tab.anIntArray272[31] = 352; 
Tab.anIntArray240[32] = 19021; 
Tab.anIntArray241[32] = 3; 
Tab.anIntArray272[32] = 399; 
}

    public static void multiicon()
    {
        Class9 class9 = aClass9Array210[19156] = new Class9();
        addmulti(19157, 0, 0);
        class9.anInt261 = 0;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[1];
        class9.anIntArray241 = new int[1];
        class9.anIntArray272 = new int[1];
        class9.anIntArray240[0] = 19157;
        class9.anIntArray241[0] = 475;
        class9.anIntArray272[0] = 297;
    }

    public static void getClanChat(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[])
    {
        String s = "./Files/interface/";
        int i = 0;
        Class9 class9 = aClass9Array210[18852] = new Class9();
        class9.anInt250 = 18852;
        class9.anInt236 = 18852;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 190;
        class9.anInt267 = 262;
        class9.anIntArray240 = new int[23];
        class9.anIntArray241 = new int[23];
        class9.anIntArray272 = new int[23];
        class9.anIntArray240[0] = 1744;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 14;
        class9.anIntArray240[1] = 18853;
        class9.anIntArray241[1] = 50;
        class9.anIntArray272[1] = 16;
        class9.anIntArray240[2] = 18854;
        class9.anIntArray241[2] = 50;
        class9.anIntArray272[2] = 30;
        class9.anIntArray240[3] = 18855;
        class9.anIntArray241[3] = 45;
        class9.anIntArray272[3] = 125;
        class9.anIntArray240[4] = 18856;
        class9.anIntArray241[4] = 3;
        class9.anIntArray272[4] = 140;
        class9.anIntArray240[5] = 18857;
        class9.anIntArray241[5] = 16;
        class9.anIntArray272[5] = 45;
        class9.anIntArray240[6] = 18858;
        class9.anIntArray241[6] = 97;
        class9.anIntArray272[6] = 45;
        class9.anIntArray240[7] = 18859;
        class9.anIntArray241[7] = 16;
        class9.anIntArray272[7] = 84;
        class9.anIntArray240[8] = 18860;
        class9.anIntArray241[8] = 97;
        class9.anIntArray272[8] = 84;
        class9.anIntArray240[9] = 18861;
        class9.anIntArray241[9] = 12;
        class9.anIntArray272[9] = 57;
        class9.anIntArray240[10] = 18862;
        class9.anIntArray241[10] = 93;
        class9.anIntArray272[10] = 57;
        class9.anIntArray240[11] = 18863;
        class9.anIntArray241[11] = 13;
        class9.anIntArray272[11] = 96;
        class9.anIntArray240[12] = 18864;
        class9.anIntArray241[12] = 93;
        class9.anIntArray272[12] = 97;
        class9.anIntArray240[13] = 19065;
        class9.anIntArray241[13] = 0;
        class9.anIntArray272[13] = 125;
        class9.anIntArray240[14] = 19065;
        class9.anIntArray241[14] = 36;
        class9.anIntArray272[14] = 125;
        class9.anIntArray240[15] = 19065;
        class9.anIntArray241[15] = 72;
        class9.anIntArray272[15] = 125;
        class9.anIntArray240[16] = 19065;
        class9.anIntArray241[16] = 108;
        class9.anIntArray272[16] = 125;
        class9.anIntArray240[17] = 19065;
        class9.anIntArray241[17] = 127;
        class9.anIntArray272[17] = 125;
        class9.anIntArray240[18] = 19065;
        class9.anIntArray241[18] = 0;
        class9.anIntArray272[18] = 219;
        class9.anIntArray240[19] = 19065;
        class9.anIntArray241[19] = 36;
        class9.anIntArray272[19] = 219;
        class9.anIntArray240[20] = 19065;
        class9.anIntArray241[20] = 72;
        class9.anIntArray272[20] = 219;
        class9.anIntArray240[21] = 19065;
        class9.anIntArray241[21] = 108;
        class9.anIntArray272[21] = 219;
        class9.anIntArray240[22] = 19065;
        class9.anIntArray241[22] = 127;
        class9.anIntArray272[22] = 219;
        Class9 class9_1 = class9;
        aClass9Array210[18853] = new Class9();
        class9.anInt250 = 18853;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 120;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "ClanName:@whi@ N/A";
        class9.anInt232 = 0xffff00;
        Class9 class9_2 = class9;
        aClass9Array210[18854] = new Class9();
        class9.anInt250 = 18854;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 110;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "Rank:@whi@ N/A";
        class9.anInt232 = 0xffff00;
        Class9 class9_3 = class9;
        aClass9Array210[18855] = new Class9();
        class9.anInt250 = 18855;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 96;
        class9.anInt267 = 18;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = false;
        class9.aString248 = "Clan Mates List";
        class9.anInt232 = 0xffff00;
        Class9 class9_4 = class9;
        aClass9Array210[18856] = new Class9();
        class9.anInt250 = 18856;
        class9.anInt236 = 18852;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 160;
        class9.anInt267 = 100;
        class9.anInt267 = 1520;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[200];
        class9.anIntArray241 = new int[200];
        class9.anIntArray272 = new int[200];
        int j = 18865;
        int k = 8;
        for(int l = 0; l < 199; l++)
        {
            class9.anIntArray240[l] = j;
            class9.anIntArray241[l] = 7;
            class9.anIntArray272[l] = k;
            j++;
            l++;
            class9.anIntArray240[l] = j;
            class9.anIntArray241[l] = 102;
            class9.anIntArray272[l] = k;
            j++;
            k += 15;
        }

        Class9 class9_5 = class9;
        aClass9Array210[18857] = new Class9();
        class9.anInt250 = 18857;
        class9.anInt236 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 72;
        class9.anInt267 = 36;
        s = "combatboxes,0";
        i = s.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.method207(Integer.parseInt(s.substring(i + 1)), false, aClass44, s.substring(0, i));
        Class9 _tmp = class9;
        class9.aString221 = "Select";
        Class9 class9_6 = class9;
        aClass9Array210[18858] = new Class9();
        class9.anInt250 = 18858;
        class9.anInt236 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 72;
        class9.anInt267 = 36;
        s = "combatboxes,0";
        i = s.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.method207(Integer.parseInt(s.substring(i + 1)), false, aClass44, s.substring(0, i));
        Class9 _tmp1 = class9;
        class9.aString221 = "Select";
        Class9 class9_7 = class9;
        aClass9Array210[18859] = new Class9();
        class9.anInt250 = 18859;
        class9.anInt236 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 72;
        class9.anInt267 = 36;
        s = "combatboxes,0";
        i = s.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.method207(Integer.parseInt(s.substring(i + 1)), false, aClass44, s.substring(0, i));
        Class9 _tmp2 = class9;
        class9.aString221 = "Select";
        Class9 class9_8 = class9;
        aClass9Array210[18860] = new Class9();
        class9.anInt250 = 18860;
        class9.anInt236 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 72;
        class9.anInt267 = 36;
        s = "combatboxes,0";
        i = s.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.method207(Integer.parseInt(s.substring(i + 1)), false, aClass44, s.substring(0, i));
        Class9 _tmp3 = class9;
        class9.aString221 = "Select";
        Class9 class9_9 = class9;
        aClass9Array210[18861] = new Class9();
        class9.anInt250 = 18861;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 78;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "Invite";
        class9.anInt232 = 0xffff00;
        Class9 class9_10 = class9;
        aClass9Array210[18862] = new Class9();
        class9.anInt250 = 18862;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 78;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "Kick";
        class9.anInt232 = 0xffff00;
        Class9 class9_11 = class9;
        aClass9Array210[18863] = new Class9();
        class9.anInt250 = 18863;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 78;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "Pro/De-Mote";
        class9.anInt232 = 0xffff00;
        Class9 class9_12 = class9;
        aClass9Array210[18864] = new Class9();
        class9.anInt250 = 18864;
        class9.anInt236 = 18852;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 78;
        class9.anInt267 = 12;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = false;
        class9.aString248 = "Delete";
        class9.anInt232 = 0xffff00;
        Class9 class9_13 = class9;
        aClass9Array210[19065] = new Class9();
        class9.anInt250 = 19065;
        class9.anInt236 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 0;
        class9.anInt220 = 36;
        class9.anInt267 = 6;
        s = "miscgraphics,3";
        i = s.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.method207(Integer.parseInt(s.substring(i + 1)), false, aClass44, s.substring(0, i));



        class9 = addTab(16456);
        class9.anInt261 = 0;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[12];
        class9.anIntArray241 = new int[12];
        class9.anIntArray272 = new int[12];
        class9.anIntArray240[11] = 1688;
        class9.anIntArray241[11] = 20;
        class9.anIntArray272[11] = 46;
        class9.anIntArray240[0] = 1660;
        class9.anIntArray241[0] = 74;
        class9.anIntArray272[0] = 4;
        class9.anIntArray240[1] = 1660;
        class9.anIntArray241[1] = 74;
        class9.anIntArray272[1] = 45;
        class9.anIntArray240[2] = 1660;
        class9.anIntArray241[2] = 74;
        class9.anIntArray272[2] = 84;
        class9.anIntArray240[3] = 1660;
        class9.anIntArray241[3] = 74;
        class9.anIntArray272[3] = 125;
        class9.anIntArray240[4] = 1660;
        class9.anIntArray241[4] = 74;
        class9.anIntArray272[4] = 165;
        class9.anIntArray240[5] = 1660;
        class9.anIntArray241[5] = 33;
        class9.anIntArray272[5] = 45;
        class9.anIntArray240[6] = 1660;
        class9.anIntArray241[6] = 114;
        class9.anIntArray272[6] = 45;
        class9.anIntArray240[7] = 1660;
        class9.anIntArray241[7] = 19;
        class9.anIntArray272[7] = 84;
        class9.anIntArray240[8] = 1660;
        class9.anIntArray241[8] = 131;
        class9.anIntArray272[8] = 84;
        class9.anIntArray240[9] = 1660;
        class9.anIntArray241[9] = 19;
        class9.anIntArray272[9] = 165;
        class9.anIntArray240[10] = 1660;
        class9.anIntArray241[10] = 131;
        class9.anIntArray272[10] = 165;
    }

    public static void equipment2()
    {
        Class9 class9 = addTab(16460);
        addSpellClick4(16461, 31, 31);
        addEquipment2(16462, 30, 30, "Close");
        addSpellClick4(16463, 32, 32);
        class9.anInt261 = 0;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[17];
        class9.anIntArray241 = new int[17];
        class9.anIntArray272 = new int[17];
		//class9.addChar(16460);
        class9.anIntArray240[0] = 16461;
        class9.anIntArray241[0] = 10;
        class9.anIntArray272[0] = 10;
        class9.anIntArray240[1] = 16462;
        class9.anIntArray241[1] = 470;
        class9.anIntArray272[1] = 16;
        class9.anIntArray240[2] = 16456;
        class9.anIntArray241[2] = 10;
        class9.anIntArray272[2] = 70;
        class9.anIntArray240[3] = 3650;
        class9.anIntArray241[3] = 200;
        class9.anIntArray272[3] = 150;
        class9.anIntArray240[4] = 16463;
        class9.anIntArray241[4] = 350;
        class9.anIntArray272[4] = 50;
        class9.anIntArray240[5] = 1675;
        class9.anIntArray241[5] = 352;
        class9.anIntArray272[5] = 66;
        class9.anIntArray240[6] = 1676;
        class9.anIntArray241[6] = 352;
        class9.anIntArray272[6] = 80;
        class9.anIntArray240[7] = 1677;
        class9.anIntArray241[7] = 352;
        class9.anIntArray272[7] = 94;
        class9.anIntArray240[8] = 1678;
        class9.anIntArray241[8] = 352;
        class9.anIntArray272[8] = 108;
        class9.anIntArray240[9] = 1679;
        class9.anIntArray241[9] = 352;
        class9.anIntArray272[9] = 122;
        class9.anIntArray240[10] = 1680;
        class9.anIntArray241[10] = 352;
        class9.anIntArray272[10] = 161;
        class9.anIntArray240[11] = 1681;
        class9.anIntArray241[11] = 352;
        class9.anIntArray272[11] = 175;
        class9.anIntArray240[12] = 1682;
        class9.anIntArray241[12] = 352;
        class9.anIntArray272[12] = 189;
        class9.anIntArray240[13] = 1683;
        class9.anIntArray241[13] = 352;
        class9.anIntArray272[13] = 203;
        class9.anIntArray240[14] = 1684;
        class9.anIntArray241[14] = 352;
        class9.anIntArray272[14] = 217;
        class9.anIntArray240[15] = 1686;
        class9.anIntArray241[15] = 352;
        class9.anIntArray272[15] = 250;
        class9.anIntArray240[16] = 1687;
        class9.anIntArray241[16] = 352;
        class9.anIntArray272[16] = 265;
		
		
		
    }

    public static void equipment()
    {
        Class9 class9 = addTab(1644);
        addEquipment(16457, 28, 28, "Equipment Stats");//equip screen
        addEquipment(16458, 29, 29, "Ok");//items kept on death
        class9.anInt261 = 0;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[3];
        class9.anIntArray241 = new int[3];
        class9.anIntArray272 = new int[3];
        class9.anIntArray240[0] = 16456;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = -1;
        class9.anIntArray240[1] = 16457;
        class9.anIntArray241[1] = 40;
        class9.anIntArray272[1] = 212;
        class9.anIntArray240[2] = 16458;
        class9.anIntArray241[2] = 110;
        class9.anIntArray272[2] = 212;
    }

    public static void Welcome()
    {
        Class9 class9 = addTab(3023);
        addwelcome(3024, 1, 1);
        addwelcome2(3025, 2, 2, "Ok");
        class9.anInt261 = 0;
        class9.aBoolean266 = false;
        class9.anIntArray240 = new int[8];
        class9.anIntArray241 = new int[8];
        class9.anIntArray272 = new int[8];
        class9.anIntArray240[0] = 3024;
        class9.anIntArray241[0] = -30;
        class9.anIntArray272[0] = -5;
        class9.anIntArray240[1] = 3025;
        class9.anIntArray241[1] = 115;
        class9.anIntArray272[1] = 205;
        class9.anIntArray240[2] = 14655;
        class9.anIntArray241[2] = 280;
        class9.anIntArray272[2] = 52;
        class9.anIntArray240[3] = 13579;
        class9.anIntArray241[3] = 450;
        class9.anIntArray272[3] = 240;
        class9.anIntArray240[4] = 13582;
        class9.anIntArray241[4] = 50;
        class9.anIntArray272[4] = 240;
        class9.anIntArray240[5] = 13580;
        class9.anIntArray241[5] = 250;
        class9.anIntArray272[5] = 245;
        class9.anIntArray240[6] = 13581;
        class9.anIntArray241[6] = 250;
        class9.anIntArray272[6] = 260;
        class9.anIntArray240[7] = 13589;
        class9.anIntArray241[7] = 215;
        class9.anIntArray272[7] = 275;
    }

    public static void getPrayer(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[])
    {
        String s = "./Files/interface/";
        String s1 = "";
        int i = 0;
        Class9 class9 = aClass9Array210[19040] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19040;
        class9.anInt262 = 5;
        class9.anInt217 = 4;
        class9.anInt214 = 0;
        class9.anInt220 = 34;
        class9.anInt267 = 34;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArray212[0] = 1;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = 101;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "prayerglow,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.method207(Integer.parseInt(s1.substring(i + 1)), false, aClass44, s1.substring(0, i));
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aString221 = "Select";
        class9 = aClass9Array210[19045] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19045;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 26;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aString248 = "Level 60: Chivalry";
        class9.aString228 = "";
        class9.anInt232 = 0xffff00;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[19041] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19041;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.anInt261 = 0;
        class9.anIntArray240 = new int[4];
        class9.anIntArray241 = new int[4];
        class9.anIntArray272 = new int[4];
        class9.anIntArray240[0] = 19044;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 19045;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 8;
        class9.anIntArray240[2] = 19042;
        class9.anIntArray241[2] = 3;
        class9.anIntArray272[2] = 41;
        class9.anIntArray240[3] = 18504;
        class9.anIntArray241[3] = 3;
        class9.anIntArray272[3] = 53;
        class9 = aClass9Array210[19042] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19042;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aString248 = "Increases your Defence by 20%,";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[18504] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 18504;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aString248 = "Strength by 18% and Attack by 15%";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[19043] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19043;
        class9.anInt262 = 5;
        class9.anInt217 = 0;
        class9.anInt220 = 30;
        class9.anInt267 = 30;
        class9.anInt230 = 19041;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 59;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 5;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "prayeroff3,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".dat").toString());
        s1 = "prayeron3,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".dat").toString());
        class9 = aClass9Array210[19044] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19044;
        class9.anInt262 = 3;
        class9.anInt217 = 0;
        class9.anInt214 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 68;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean227 = true;
        class9.anInt232 = 0;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[19046] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19046;
        class9.anInt262 = 5;
        class9.anInt217 = 4;
        class9.anInt214 = 0;
        class9.anInt220 = 34;
        class9.anInt267 = 34;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArray212[0] = 1;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = 102;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "prayerglow,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.method207(Integer.parseInt(s1.substring(i + 1)), false, aClass44, s1.substring(0, i));
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aString221 = "Select";
        class9 = aClass9Array210[19047] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19047;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 26;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aString248 = "Level 70: Piety";
        class9.aString228 = "";
        class9.anInt232 = 0xffff00;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[19048] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19048;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.anInt261 = 0;
        class9.anIntArray240 = new int[4];
        class9.anIntArray241 = new int[4];
        class9.anIntArray272 = new int[4];
        class9.anIntArray240[0] = 19044;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 19047;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 8;
        class9.anIntArray240[2] = 19049;
        class9.anIntArray241[2] = 3;
        class9.anIntArray272[2] = 41;
        class9.anIntArray240[3] = 18502;
        class9.anIntArray241[3] = 3;
        class9.anIntArray272[3] = 53;
        class9 = aClass9Array210[19049] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19049;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aString248 = "Increases your Defence by 25%";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[18502] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 18502;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aString248 = "Strength by 23% and Attack by 20%";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;
        class9 = aClass9Array210[19050] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19050;
        class9.anInt262 = 5;
        class9.anInt217 = 0;
        class9.anInt220 = 30;
        class9.anInt267 = 30;
        class9.anInt230 = 19048;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 69;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 5;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "prayeroff3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".dat").toString());
        s1 = "prayeron3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".dat").toString());
        class9 = aClass9Array210[19051] = new Class9();
        class9.anInt236 = 5608;
        class9.anInt250 = 19051;
        class9.anInt262 = 3;
        class9.anInt217 = 0;
        class9.anInt214 = 0;
        class9.anInt220 = 174;
        class9.anInt267 = 68;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.aBoolean227 = true;
        class9.anInt232 = 0;
        class9.anInt219 = 0;
        class9.anInt216 = 0;
        class9.anInt239 = 0;

    }
public static void modcp(Class30_Sub2_Sub1_Sub4[] wid) {
		Class9 class9 = addTab(26900);

		/*
		* addActionButton(ID, SpriteON, SpriteOFF, SpriteX, SpriteY,
		* "SpriteText");
		*/
		addActionButton(26901, 2000, 2000, 90, 42, "Ban");
		addActionButton(26902, 2000, 2000, 90, 42, "Mute");
		addActionButton(26903, 2000, 2000, 90, 42, "Unmute");
		addActionButton(26904, 2000, 2000, 90, 42, "Staff");

		addText(26905, "Ban", wid, 2, 0xff9040);
		addText(26906, "Mute", wid, 2, 0xff9040);
		addText(26907, "Unmute", wid, 2, 0xff9040);
		addText(26908, "Staff", wid, 2, 0xff9040);

		class9.anInt261 = 0;
		class9.aBoolean266 = false;
		class9.anIntArray240 = new int[8];
		class9.anIntArray241 = new int[8];
		class9.anIntArray272 = new int[8];

		class9.anIntArray240[0] = 26901;// screen
		class9.anIntArray241[0] = 42;
		class9.anIntArray272[0] = 16;

		class9.anIntArray240[1] = 26902;// screen
		class9.anIntArray241[1] = 42;
		class9.anIntArray272[1] = 74;

		class9.anIntArray240[2] = 26903;// screen
		class9.anIntArray241[2] = 42;
		class9.anIntArray272[2] = 132;

		class9.anIntArray240[3] = 26904;// first1
		class9.anIntArray241[3] = 42;
		class9.anIntArray272[3] = 190;

		class9.anIntArray240[4] = 26905;// screen
		class9.anIntArray241[4] = 42 + 25 + 4;
		class9.anIntArray272[4] = 16 + 15;

		class9.anIntArray240[5] = 26906;// screen
		class9.anIntArray241[5] = 42 + 25 + 4;
		class9.anIntArray272[5] = 74 + 15;

		class9.anIntArray240[6] = 26907;// screen
		class9.anIntArray241[6] = 42 + 25 - 4;
		class9.anIntArray272[6] = 132 + 15;

		class9.anIntArray240[7] = 26908;// first1
		class9.anIntArray241[7] = 42 + 25 + 5;
		class9.anIntArray272[7] = 190 + 15;
	}

    public static void getLunar(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[])
    {
        String s = "./Files/interface/";
        String s1 = "";
        int i = 0;
        Class9 class9 = aClass9Array210[18787] = new Class9();
        class9.anInt250 = 18787;
        class9.anInt236 = 18787;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 512;
        class9.anInt267 = 334;
        class9.anIntArray240 = new int[41];
        class9.anIntArray241 = new int[41];
        class9.anIntArray272 = new int[41];
        class9.anIntArray240[0] = 12856;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 178;
        class9.anIntArray240[1] = 18788;
        class9.anIntArray241[1] = 20;
        class9.anIntArray272[1] = 22;
        class9.anIntArray240[2] = 18789;
        class9.anIntArray241[2] = 3;
        class9.anIntArray272[2] = 184;
        class9.anIntArray240[3] = 18804;
        class9.anIntArray241[3] = 60;
        class9.anIntArray272[3] = 22;
        class9.anIntArray240[4] = 18805;
        class9.anIntArray241[4] = 3;
        class9.anIntArray272[4] = 184;
        class9.anIntArray240[5] = 18808;
        class9.anIntArray241[5] = 100;
        class9.anIntArray272[5] = 22;
        class9.anIntArray240[6] = 18809;
        class9.anIntArray241[6] = 3;
        class9.anIntArray272[6] = 184;
        class9.anIntArray240[7] = 18824;
        class9.anIntArray241[7] = 140;
        class9.anIntArray272[7] = 22;
        class9.anIntArray240[8] = 18828;
        class9.anIntArray241[8] = 20;
        class9.anIntArray272[8] = 54;
        class9.anIntArray240[9] = 18829;
        class9.anIntArray241[9] = 3;
        class9.anIntArray272[9] = 184;
        class9.anIntArray240[10] = 18832;
        class9.anIntArray241[10] = 60;
        class9.anIntArray272[10] = 54;
        class9.anIntArray240[11] = 18833;
        class9.anIntArray241[11] = 3;
        class9.anIntArray272[11] = 184;
        class9.anIntArray240[12] = 18836;
        class9.anIntArray241[12] = 100;
        class9.anIntArray272[12] = 54;
        class9.anIntArray240[13] = 18837;
        class9.anIntArray241[13] = 3;
        class9.anIntArray272[13] = 184;
        class9.anIntArray240[14] = 18840;
        class9.anIntArray241[14] = 140;
        class9.anIntArray272[14] = 54;
        class9.anIntArray240[15] = 18841;
        class9.anIntArray241[15] = 3;
        class9.anIntArray272[15] = 184;
        class9.anIntArray240[16] = 18825;
        class9.anIntArray241[16] = 3;
        class9.anIntArray272[16] = 184;
        class9.anIntArray240[17] = 18792;
        class9.anIntArray241[17] = 20;
        class9.anIntArray272[17] = 86;
        class9.anIntArray240[18] = 18793;
        class9.anIntArray241[18] = 3;
        class9.anIntArray272[18] = 184;
        class9.anIntArray240[19] = 18796;
        class9.anIntArray241[19] = 60;
        class9.anIntArray272[19] = 86;
        class9.anIntArray240[20] = 18797;
        class9.anIntArray241[20] = 3;
        class9.anIntArray272[20] = 184;
        class9.anIntArray240[21] = 18800;
        class9.anIntArray241[21] = 100;
        class9.anIntArray272[21] = 86;
        class9.anIntArray240[22] = 18801;
        class9.anIntArray241[22] = 3;
        class9.anIntArray272[22] = 184;
        class9.anIntArray240[23] = 18812;
        class9.anIntArray241[23] = 140;
        class9.anIntArray272[23] = 86;
        class9.anIntArray240[24] = 18813;
        class9.anIntArray241[24] = 3;
        class9.anIntArray272[24] = 184;
        class9.anIntArray240[25] = 18816;
        class9.anIntArray241[25] = 20;
        class9.anIntArray272[25] = 118;
        class9.anIntArray240[26] = 18817;
        class9.anIntArray241[26] = 3;
        class9.anIntArray272[26] = 184;
        class9.anIntArray240[27] = 18820;
        class9.anIntArray241[27] = 60;
        class9.anIntArray272[27] = 118;
        class9.anIntArray240[28] = 18821;
        class9.anIntArray241[28] = 3;
        class9.anIntArray272[28] = 184;
        class9.anIntArray240[29] = 18844;
        class9.anIntArray241[29] = 100;
        class9.anIntArray272[29] = 118;
        class9.anIntArray240[30] = 18845;
        class9.anIntArray241[30] = 3;
        class9.anIntArray272[30] = 184;
        class9.anIntArray240[31] = 18848;
        class9.anIntArray241[31] = 140;
        class9.anIntArray272[31] = 118;
        class9.anIntArray240[32] = 18849;
        class9.anIntArray241[32] = 3;
        class9.anIntArray272[32] = 184;
        class9.anIntArray240[33] = 18852;
        class9.anIntArray241[33] = 20;
        class9.anIntArray272[33] = 150;
        class9.anIntArray240[34] = 18853;
        class9.anIntArray241[34] = 3;
        class9.anIntArray272[34] = 184;
        class9.anIntArray240[35] = 18856;
        class9.anIntArray241[35] = 60;
        class9.anIntArray272[35] = 150;
        class9.anIntArray240[36] = 18857;
        class9.anIntArray241[36] = 3;
        class9.anIntArray272[36] = 184;
        class9.anIntArray240[37] = 18860;
        class9.anIntArray241[37] = 100;
        class9.anIntArray272[37] = 150;
        class9.anIntArray240[38] = 18861;
        class9.anIntArray241[38] = 3;
        class9.anIntArray272[38] = 184;
        class9.anIntArray240[39] = 18864;
        class9.anIntArray241[39] = 140;
        class9.anIntArray272[39] = 150;
        class9.anIntArray240[40] = 18865;
        class9.anIntArray241[40] = 3;
        class9.anIntArray272[40] = 184;
        class9 = aClass9Array210[18788] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18788;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18789;
        s1 = "magicon3,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp = class9;
        class9.aString221 = "Cast @gre@Home teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18789] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18789;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18790;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18791;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18790] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18790;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Home";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18791] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18791;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Edgeville";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18792] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18792;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18793;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 66;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString218 = "NPC Contact";
        Class9 _tmp1 = class9;
        class9.aString221 = "Cast @gre@NPC Contact";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18793] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18793;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18794;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18795;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18794] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18794;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 67 : NPC Contact";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18795] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18795;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 1 Law, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18796] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18796;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18797;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 67;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,2";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,2";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString222 = "Cast on";
        class9.aString218 = "Cure other";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18797] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18797;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18798;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18799;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18798] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18798;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 68 : Cure other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18799] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18799;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "2 Astral, 2 Cosmic";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18800] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18800;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18801;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 67;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,3";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,3";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp2 = class9;
        class9.aString221 = "Cast @gre@Humidify";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18801] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18801;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18802;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18803;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18802] = new Class9();
        class9.anInt236 = 18802;
        class9.anInt250 = 18802;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 68 : Humidify";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18803] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18803;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "2 Astral, 5 Water";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18804] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18804;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18805;
        s1 = "magicon3,4";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp3 = class9;
        class9.aString221 = "Cast @gre@Train teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18805] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18805;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18806;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18807;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18806] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18806;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Train";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18807] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18807;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Rock crabs to start";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18808] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18808;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18809;
        s1 = "magicon3,5";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp4 = class9;
        class9.aString221 = "Cast @gre@Catherby teleport";
        class9.anInt237 = 16;
        class9 = aClass9Array210[18809] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18809;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18810;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18811;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18810] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18810;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Catherby";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18811] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18811;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Non combat skills";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18812] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18812;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18813;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 70;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,6";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,6";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp5 = class9;
        class9.aString221 = "Cast @gre@Cure me";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18813] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18813;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18814;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18815;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18814] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18814;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 71 : Cure me";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18815] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18815;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 5 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18816] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18816;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18817;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 73;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,7";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,7";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp6 = class9;
        class9.aString221 = "Cast @gre@Cure group";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18817] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18817;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18818;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18819;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18818] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18818;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 74 : Cure group";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18819] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18819;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 15 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18820] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18820;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18821;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 74;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,8";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,8";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString222 = "Cast on";
        class9.aString218 = "Stat spy";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18821] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18821;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18822;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18823;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18822] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18822;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 75 : Stat spy";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18823] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18823;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 2 Death, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18824] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18824;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18825;
        s1 = "magicon3,9";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp7 = class9;
        class9.aString221 = "Cast @gre@Slayer teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18825] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18825;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18826;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18827;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18826] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18826;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Slayer";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18827] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18827;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Slayer Tower";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18828] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18828;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18829;
        s1 = "magicon3,10";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp8 = class9;
        class9.aString221 = "Cast @gre@Monsters teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18829] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18829;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18830;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18831;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18830] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18830;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Monsters";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18831] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18831;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Some good npcs";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18832] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18832;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18833;
        s1 = "magicon3,11";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp9 = class9;
        class9.aString221 = "Cast @gre@Bosses teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18833] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18833;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18834;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18835;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18834] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18834;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Bosses";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18835] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18835;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Various";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18836] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18836;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18837;
        s1 = "magicon3,12";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp10 = class9;
        class9.aString221 = "Cast @gre@Mini games teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18837] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18837;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18838;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18839;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18838] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18838;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Minigames";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18839] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18839;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Want fun??";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18840] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18840;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18841;
        s1 = "magicon3,13";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp11 = class9;
        class9.aString221 = "Cast @gre@Pking teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18841] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18841;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18842;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18843;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18842] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18842;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Pking";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18843] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18843;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Own everybody!!";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18844] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18844;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18845;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 90;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,14";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,14";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString218 = "Energy transfer";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18845] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18845;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18846;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18847;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18846] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 91 : Energy transfer";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18847] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Blood";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18848] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18848;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18849;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 91;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,15";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,15";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString218 = "Heal other";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18849] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18849;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18850;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18851;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18850] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 92 : Heal other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18851] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 3 Blood, 3 Fire";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18852] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18853;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 92;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,16";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,16";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        class9.aString218 = "Vengeance other";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18853] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18853;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18854;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18855;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18854] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 93 : Vengeance other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18855] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 2 Death, 3 Earthh";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18856] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18856;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18857;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 93;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,17";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,17";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp12 = class9;
        class9.aString221 = "Cast @gre@Vengeance";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18857] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18857;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18858;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18859;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18858] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18858;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 94 : Vengeance";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18859] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18859;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "4 Astral, 2 Death, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18860] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18860;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18861;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 94;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,18";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,18";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp13 = class9;
        class9.aString221 = "Cast @gre@Heal group";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18861] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18861;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18862;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18863;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18862] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18862;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 95 : Heal group";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18863] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18863;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Death, 10 Blood";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18864] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18864;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18865;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 95;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,19";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        s1 = "magicon3,19";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".DAT").toString());
        Class9 _tmp14 = class9;
        class9.aString221 = "Cast @gre@Spellbook swap";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18865] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18865;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18866;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18867;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18866] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18862;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 96 : Spellbook swap";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18867] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18863;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Death, 10 Law";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
    }

    public static Class30_Sub2_Sub1_Sub1 drawSprite(String s)
    {
        String s1 = "./Files/interface/";
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1;
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(s1).append("").append(s).toString());
        }
        catch(Exception exception)
        {
            System.out.println("EXCEPTION!!!");
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 customsprite(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    public static void addSpellClick(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt220 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = method207(j, false, aClass44, "magicon2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = method207(k, false, aClass44, "magicon2");
class9.aString221 = s;
        Class9 _tmp = class9;
          
    }

public static void addSpellClick2(int id, int spriteOnId, int spriteOffId)
{
Class9 spell = aClass9Array210[id] = new Class9();
spell.anInt250 = id;
spell.anInt236 = id;
spell.anInt262 = 5;
spell.anInt217 = 1;
spell.anInt214 = 0;
spell.anInt220 = 2;
spell.anInt267 = 2;
spell.aByte254 = (byte)0;
spell.anInt230 = 52;
spell.aClass30_Sub2_Sub1_Sub1_207 = pleasework(spriteOnId, "custom");
spell.aClass30_Sub2_Sub1_Sub1_260 = pleasework(spriteOffId, "custom");        	
}


/*
    public static void addSpellClick2(int i, int j, int k)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 2;
        class9.anInt267 = 2;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = pleasework(j, "custom");
        class9.aClass30_Sub2_Sub1_Sub1_260 = pleasework(k, "custom");
    }
*/

    public static void addSpellClick4(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
        Class9 _tmp = class9;
        class9.aString221 = s;
    }

    public static void addSpellClick4(int i, int j, int k)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
    }

    public static void addEquipment(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 40;
        class9.anInt267 = 39;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
  class9.aString221 = s;
        Class9 _tmp = class9;
      
    }

    public static void addEquipment2(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 6;
        class9.anInt214 = 0;
        class9.anInt220 = 21;
        class9.anInt267 = 21;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
  class9.aString221 = s;
        Class9 _tmp = class9;
      
    }

    public static void addwelcome(int i, int j, int k)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt220 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = welcome(j, false, aClass44, "welcome");
        class9.aClass30_Sub2_Sub1_Sub1_260 = welcome(k, false, aClass44, "welcome");
    }

    public static void addwelcome2(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 280;
        class9.anInt267 = 35;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = welcome(j, "welcome");
        class9.aClass30_Sub2_Sub1_Sub1_260 = welcome(k, "welcome");
  class9.aString221 = s;
        Class9 _tmp = class9;
      
    }


public static Class9 addTabb(int id)
	{
    	Class9 class9 = aClass9Array210[id] = new Class9();
    	class9.anInt250 = id;//250
        class9.anInt236 = id;//236
        class9.anInt262 = 0;//262
        class9.anInt217 = 0;//217
        class9.anInt214 = 0;
        class9.anInt220 = 512;//220
        class9.anInt267 = 700;//anint267
        class9.aByte254 = (byte)0;
        class9.anInt230 = -1;//Int 230
        return class9;
	}

    public static void addmulti(int i, int j, int k)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt220 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = method207(j, false, aClass44, "OVERLAY_MULTIWAY");
        class9.aClass30_Sub2_Sub1_Sub1_260 = method207(k, false, aClass44, "OVERLAY_MULTIWAY");
    }

public static void method205(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[], byte byte0, Class44 class44_1)
    {
        aClass12_238 = new Class12(false, 50000);
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("data", null), 891);

        int i = -1;
        int j = class30_sub2_sub2.method410();
        aClass9Array210 = new Class9[30000];
        do
        {
            if(class30_sub2_sub2.anInt1406 >= class30_sub2_sub2.aByteArray1405.length)
                break;
            int k = class30_sub2_sub2.method410();
            if(k == 65535)
            {
                i = class30_sub2_sub2.method410();
                k = class30_sub2_sub2.method410();
            }
            Class9 class9 = aClass9Array210[k] = new Class9();
            class9.anInt250 = k;
            class9.anInt236 = i;
            class9.anInt262 = class30_sub2_sub2.method408();
            class9.anInt217 = class30_sub2_sub2.method408();
            class9.anInt214 = class30_sub2_sub2.method410();
            class9.anInt220 = class30_sub2_sub2.method410();
            class9.anInt267 = class30_sub2_sub2.method410();
            class9.aByte254 = (byte)class30_sub2_sub2.method408();
            class9.anInt230 = class30_sub2_sub2.method408();
            if(class9.anInt230 != 0)
                class9.anInt230 = (class9.anInt230 - 1 << 8) + class30_sub2_sub2.method408();
            else
                class9.anInt230 = -1;
            int l = class30_sub2_sub2.method408();
            if(l > 0)
            {
                class9.anIntArray245 = new int[l];
                class9.anIntArray212 = new int[l];
                for(int i1 = 0; i1 < l; i1++)
                {
                    class9.anIntArray245[i1] = class30_sub2_sub2.method408();
                    class9.anIntArray212[i1] = class30_sub2_sub2.method410();
                }

            }
            int j1 = class30_sub2_sub2.method408();
            if(j1 > 0)
            {
                class9.anIntArrayArray226 = new int[j1][];
                for(int k1 = 0; k1 < j1; k1++)
                {
                    int j3 = class30_sub2_sub2.method410();
                    class9.anIntArrayArray226[k1] = new int[j3];
                    for(int l4 = 0; l4 < j3; l4++)
                        class9.anIntArrayArray226[k1][l4] = class30_sub2_sub2.method410();

                }

            }
            if(class9.anInt262 == 0)
            {
                class9.anInt261 = class30_sub2_sub2.method410();
                class9.aBoolean266 = class30_sub2_sub2.method408() == 1;
                int l1 = class30_sub2_sub2.method410();
                class9.anIntArray240 = new int[l1];
                class9.anIntArray241 = new int[l1];
                class9.anIntArray272 = new int[l1];
                if(class9.anInt250 == 5608)
                {
                    class9.anIntArray240 = new int[67];
                    class9.anIntArray241 = new int[67];
                    class9.anIntArray272 = new int[67];
                    class9.anIntArray240[61] = 19040;
                    class9.anIntArray241[61] = 102;
                    class9.anIntArray272[61] = 152;
                    class9.anIntArray240[62] = 19046;
                    class9.anIntArray241[62] = 143;
                    class9.anIntArray272[62] = 152;
                    class9.anIntArray240[63] = 19043;
                    class9.anIntArray241[63] = 107;
                    class9.anIntArray272[63] = 151;
                    class9.anIntArray240[64] = 19041;
                    class9.anIntArray241[64] = 5;
                    class9.anIntArray272[64] = 184;
                    class9.anIntArray240[65] = 19050;
                    class9.anIntArray241[65] = 143;
                    class9.anIntArray272[65] = 159;
                    class9.anIntArray240[66] = 19048;
                    class9.anIntArray241[66] = 5;
                    class9.anIntArray272[66] = 184;
                }
                for(int k3 = 0; k3 < l1; k3++)
                {
                    class9.anIntArray240[k3] = class30_sub2_sub2.method410();
                    class9.anIntArray241[k3] = class30_sub2_sub2.method411();
                    class9.anIntArray272[k3] = class30_sub2_sub2.method411();
                }

            }
if(class9.anInt250 == 10600)
{
class9.anInt220 = 8;
class9.anInt267 = 5;
}
if(class9.anInt250 == 10494)
{
class9.anInt220 = 8;
class9.anInt267 = 1;
}
            if(class9.anInt262 == 1)
            {
                class9.anInt211 = class30_sub2_sub2.method410();
                class9.aBoolean251 = class30_sub2_sub2.method408() == 1;
            }
            if(class9.anInt262 == 2)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean259 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean249 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean242 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean235 = class30_sub2_sub2.method408() == 1;
                class9.anInt231 = class30_sub2_sub2.method408();
                class9.anInt244 = class30_sub2_sub2.method408();
                class9.anIntArray215 = new int[20];
                class9.anIntArray247 = new int[20];
                class9.aClass30_Sub2_Sub1_Sub1Array209 = new Class30_Sub2_Sub1_Sub1[20];
                for(int i2 = 0; i2 < 20; i2++)
                {
                    int l3 = class30_sub2_sub2.method408();
                    if(l3 != 1)
                        continue;
                    class9.anIntArray215[i2] = class30_sub2_sub2.method411();
                    class9.anIntArray247[i2] = class30_sub2_sub2.method411();
                    String s1 = class30_sub2_sub2.method415();
                    if(class44_1 != null && s1.length() > 0)
                    {
                        int i5 = s1.lastIndexOf(",");
                        class9.aClass30_Sub2_Sub1_Sub1Array209[i2] = method207(Integer.parseInt(s1.substring(i5 + 1)), false, class44_1, s1.substring(0, i5));
                    }
                }

                class9.aStringArray225 = new String[5];
                for(int j2 = 0; j2 < 5; j2++)
                {
                    class9.aStringArray225[j2] = class30_sub2_sub2.method415();                    if(class9.anInt250 == 3900) {
					class9.aStringArray225[4] = "Buy X";
					}
					if(class9.anInt250 == 3823) {
					class9.aStringArray225[4] = "Sell X";
					}
                    if(class9.anInt236 == 3824)
                        class9.aStringArray225[4] = "Buy X";
                    if(class9.aStringArray225[j2].length() == 0)
                        class9.aStringArray225[j2] = null;
                }

            }
            if(class9.anInt262 == 3)
                class9.aBoolean227 = class30_sub2_sub2.method408() == 1;
            if(class9.anInt262 == 4 || class9.anInt262 == 1)
            {
                class9.aBoolean223 = class30_sub2_sub2.method408() == 1;
                int k2 = class30_sub2_sub2.method408();
                if(aclass30_sub2_sub1_sub4 != null)
                    class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[k2];
                class9.aBoolean268 = class30_sub2_sub2.method408() == 1;
            }
            if(class9.anInt262 == 4)
            {
                class9.aString248 = class30_sub2_sub2.method415();
                class9.aString228 = class30_sub2_sub2.method415();
            }
            if(class9.anInt262 == 1 || class9.anInt262 == 3 || class9.anInt262 == 4)
                class9.anInt232 = class30_sub2_sub2.method413();
            if(class9.anInt262 == 3 || class9.anInt262 == 4)
            {
                class9.anInt219 = class30_sub2_sub2.method413();
                class9.anInt216 = class30_sub2_sub2.method413();
                class9.anInt239 = class30_sub2_sub2.method413();
            }
            if(class9.anInt262 == 5)
            {
                String s = class30_sub2_sub2.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int i4 = s.lastIndexOf(",");
                    class9.aClass30_Sub2_Sub1_Sub1_207 = method207(Integer.parseInt(s.substring(i4 + 1)), false, class44_1, s.substring(0, i4));
                }
                s = class30_sub2_sub2.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int j4 = s.lastIndexOf(",");
                    class9.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s.substring(j4 + 1)), false, class44_1, s.substring(0, j4));
                }
            }
            if(class9.anInt262 == 6)
            {
                int l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt233 = 1;
                    class9.anInt234 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                }
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt255 = 1;
                    class9.anInt256 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                }
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                    class9.anInt257 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                else
                    class9.anInt257 = -1;
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                    class9.anInt258 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                else
                    class9.anInt258 = -1;
                class9.anInt269 = class30_sub2_sub2.method410();
                class9.anInt270 = class30_sub2_sub2.method410();
                class9.anInt271 = class30_sub2_sub2.method410();
            }
            if(class9.anInt262 == 7)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean223 = class30_sub2_sub2.method408() == 1;
                int i3 = class30_sub2_sub2.method408();
                if(aclass30_sub2_sub1_sub4 != null)
                    class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[i3];
                class9.aBoolean268 = class30_sub2_sub2.method408() == 1;
                class9.anInt232 = class30_sub2_sub2.method413();
                class9.anInt231 = class30_sub2_sub2.method411();
                class9.anInt244 = class30_sub2_sub2.method411();
                class9.aBoolean249 = class30_sub2_sub2.method408() == 1;
                class9.aStringArray225 = new String[5];
                for(int k4 = 0; k4 < 5; k4++)
                {
                    class9.aStringArray225[k4] = class30_sub2_sub2.method415();
                    if(class9.aStringArray225[k4].length() == 0)
                        class9.aStringArray225[k4] = null;
                }

            }
            if(class9.anInt217 == 2 || class9.anInt262 == 2)
            {
                class9.aString222 = class30_sub2_sub2.method415();
                class9.aString218 = class30_sub2_sub2.method415();
                class9.anInt237 = class30_sub2_sub2.method410();
            }
            if(class9.anInt262 == 8)
                class9.aString248 = class30_sub2_sub2.method415();
            if(class9.anInt217 == 1 || class9.anInt217 == 4 || class9.anInt217 == 5 || class9.anInt217 == 6)
            {
                class9.aString221 = class30_sub2_sub2.method415();
                if(class9.aString221.length() == 0)
                {
                    if(class9.anInt217 == 1)
                        class9.aString221 = "Ok";
                    if(class9.anInt217 == 4)
                        class9.aString221 = "Select";
                    if(class9.anInt217 == 5)
                        class9.aString221 = "Select";
                    if(class9.anInt217 == 6)
                        class9.aString221 = "Continue";
                }
            }
        } while(true);
        aClass44 = aClass44;

        modcp(aclass30_sub2_sub1_sub4);
	xpexchange(aclass30_sub2_sub1_sub4);
	pcexchange(aclass30_sub2_sub1_sub4);
	roleselect(aclass30_sub2_sub1_sub4);
	assaultwait(aclass30_sub2_sub1_sub4);
	pkingmap(aclass30_sub2_sub1_sub4);
	monsters(aclass30_sub2_sub1_sub4);
	minigames(aclass30_sub2_sub1_sub4);
	FriendsData(aclass30_sub2_sub1_sub4);
	FriendsTab(aclass30_sub2_sub1_sub4);
	IgnoresData(aclass30_sub2_sub1_sub4);
	IgnoresTab(aclass30_sub2_sub1_sub4);
	custom2(class44_1, aclass30_sub2_sub1_sub4);
	NewMage2();
	basicbar1();
	ddsattack();
	basicbar2();
	WhipAttack();
	Unarmed();
	welcome123(aclass30_sub2_sub1_sub4);
	itemsOnDeathDATA(aclass30_sub2_sub1_sub4);
	itemsOnDeath(aclass30_sub2_sub1_sub4);
	ClanChat(aclass30_sub2_sub1_sub4);//buttons
	ClanChatscroll();//scrollbar overlay(main interface)
	ClanChatBox(aclass30_sub2_sub1_sub4);
	//(The Box, has to be in seperate interface to move with scroll bar)
    multiicon();
	harrysoptiontab(class44_1, aclass30_sub2_sub1_sub4);
	EmoteTab();
	EmoteTab3();
    equipment();
    equipment2();
    getClanChat(class44_1, aclass30_sub2_sub1_sub4);
    getLunar(class44_1, aclass30_sub2_sub1_sub4);
	oldMagicInterface();
    getPrayer(class44_1, aclass30_sub2_sub1_sub4);
    Welcome();

        aClass12_238 = null;
        if(byte0 != -84);
    }

public static void addSpellClick3(int i, int spriteOnId, int spriteOffId, String s)
    {


        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt220 = i;
        class9.anInt236 = i;
class9.anInt250 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
 class9.aClass30_Sub2_Sub1_Sub1_207 = pleasework(spriteOnId, "custom");
 class9.aClass30_Sub2_Sub1_Sub1_260 = pleasework(spriteOffId, "custom");       
class9.aString221 = s;
    }

    private Class30_Sub2_Sub4_Sub6 method206(int i, int j)
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_264.method222((i << 16) + j);
        if(class30_sub2_sub4_sub6 != null)
        {
            return class30_sub2_sub4_sub6;
        }
        if(i == 1)
        {
            class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt213, j);
        }
        if(i == 2)
        {
            class30_sub2_sub4_sub6 = Class5.method159(j).method160(true);
        }
        if(i == 3)
        {
            class30_sub2_sub4_sub6 = client.aClass30_Sub2_Sub4_Sub1_Sub2_1126.method453((byte)-41);
        }
        if(i == 4)
        {
            class30_sub2_sub4_sub6 = Class8.method198(j).method202(50, true);
        }
        if(i == 5)
        {
            class30_sub2_sub4_sub6 = null;
        }
        if(class30_sub2_sub4_sub6 != null)
        {
            aClass12_264.method223(class30_sub2_sub4_sub6, (i << 16) + j, (byte)2);
        }
        return class30_sub2_sub4_sub6;
    }

    private static Class30_Sub2_Sub1_Sub1 method207(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(class44, s, i);
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    public static void method208(int i, boolean flag, int j, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6)
    {
        if(flag)
        {
            return;
        }
        aClass12_264.method224();
        if(class30_sub2_sub4_sub6 != null && j != 4)
        {
            aClass12_264.method223(class30_sub2_sub4_sub6, (j << 16) + i, (byte)2);
        }
    }

    private static Class30_Sub2_Sub1_Sub1 welcome(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 welcome(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 customsprite2(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 Run(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 customsprite1(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 pleasework(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append("./Files/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    public Class30_Sub2_Sub4_Sub6 method209(int i, int j, int k, boolean flag)
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
        if(flag)
        {
            class30_sub2_sub4_sub6 = method206(anInt255, anInt256);
        } else
        {
            class30_sub2_sub4_sub6 = method206(anInt233, anInt234);
        }
        if(class30_sub2_sub4_sub6 == null)
        {
            return null;
        }
        if(k == -1 && j == -1 && class30_sub2_sub4_sub6.anIntArray1640 == null)
        {
            return class30_sub2_sub4_sub6;
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = new Class30_Sub2_Sub4_Sub6(9, true, Class36.method532(k, false) & Class36.method532(j, false), false, class30_sub2_sub4_sub6);
        if(k != -1 || j != -1)
        {
            class30_sub2_sub4_sub6_1.method469((byte)-71);
        }
        if(k != -1)
        {
            class30_sub2_sub4_sub6_1.method470(k, 40542);
        }
        if(j != -1)
        {
            class30_sub2_sub4_sub6_1.method470(j, 40542);
        }
        class30_sub2_sub4_sub6_1.method479(64, 768, -50, -10, -50, true);
        if(i != 0)
        {
            throw new NullPointerException();
        } else
        {
            return class30_sub2_sub4_sub6_1;
        }
    }

    public Class9()
    {
        anInt213 = 9;
        anInt229 = 891;
    }

}

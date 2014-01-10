package net.legacy.game.clients.packets.impl;

import net.legacy.Server;
import net.legacy.game.clients.Client;
import net.legacy.game.clients.PlayerHandler;
import net.legacy.utilities.Miscellaneous;

public class Clicking {
	
public void clicking(int a){
Client c = (Client) Server.playerHandler.players[a];
		switch(c.actionButtonId) {

                case 62137:
                //c.outStream.createFrame(187);
                //c.flushOutStream();
				c.sM("Use ::ccjoin clanownersname");
                break;
				 case 62136:
                c.sM("Do ::clanchat for help.");
                break;
case 4484:
c.sM("tell robbie to add this");
break;
case 16052:
c.closeAll();
break;

case 28166: 
c.q3help();
break;

case 64074:

int number = 0;
if (c.deathStage > 0)
return;
for (int k = 0; k < 4; k++) {
c.sendFrame34(10494, -1, k, 1);
}
for (int k = 0; k < 39; k++) {
c.sendFrame34(10600, -1, k, 1);
}
if (c.isSkulled) {

c.loseItem1();
if (c.itemLose1 > 0) {
c.sendFrame34(10600,c.itemLose1,0,1);
}
c.loseItem2();
if (c.itemLose2 > 0) {
c.sendFrame34(10600,c.itemLose2,1,1);
}c.loseItem3();
if (c.itemLose3 > 0) {
c.sendFrame34(10600,c.itemLose3,2,1);
}c.loseItem4();
if (c.itemLose4 > 0) {
c.sendFrame34(10600,c.itemLose4,3,1);
}c.loseItem5();
if (c.itemLose5 > 0) {
c.sendFrame34(10600,c.itemLose5,4,1);
}c.loseItem6();
if (c.itemLose6 > 0) {
c.sendFrame34(10600,c.itemLose6,5,1);
}c.loseItem7();
if (c.itemLose7 > 0) {
c.sendFrame34(10600,c.itemLose7,6,1);
}c.loseItem8();
if (c.itemLose8 > 0) {
c.sendFrame34(10600,c.itemLose8,7,1);
}c.loseItem9();
if (c.itemLose9 > 0) {
c.sendFrame34(10600,c.itemLose9,8,1);
}c.loseItem10();
if (c.itemLose10 > 0) {
c.sendFrame34(10600,c.itemLose10,9,1);
}c.loseItem11();
if (c.itemLose11 > 0) {
c.sendFrame34(10600,c.itemLose11,10,1);
}c.loseItem12();
if (c.itemLose12 > 0) {
c.sendFrame34(10600,c.itemLose12,11,1);
}c.loseItem13();
if (c.itemLose13 > 0) {
c.sendFrame34(10600,c.itemLose13,12,1);
}c.loseItem14();
if (c.itemLose14 > 0) {
c.sendFrame34(10600,c.itemLose14,13,1);
}c.loseItem15();
if (c.itemLose15 > 0) {
c.sendFrame34(10600,c.itemLose15,14,1);
}c.loseItem16();
if (c.itemLose16 > 0) {
c.sendFrame34(10600,c.itemLose16,15,1);
}c.loseItem17();
if (c.itemLose17 > 0) {
c.sendFrame34(10600,c.itemLose17,16,1);
}c.loseItem18();
if (c.itemLose18 > 0) {
c.sendFrame34(10600,c.itemLose18,17,1);
}c.loseItem19();
if (c.itemLose19 > 0) {
c.sendFrame34(10600,c.itemLose19,18,1);
}c.loseItem20();
if (c.itemLose20 > 0) {
c.sendFrame34(10600,c.itemLose20,19,1);
}c.loseItem21();
if (c.itemLose21 > 0) {
c.sendFrame34(10600,c.itemLose21,20,1);
}c.loseItem22();
if (c.itemLose22 > 0) {
c.sendFrame34(10600,c.itemLose22,21,1);
}c.loseItem23();
if (c.itemLose23 > 0) {
c.sendFrame34(10600,c.itemLose23,22,1);
}c.loseItem24();
if (c.itemLose24 > 0) {
c.sendFrame34(10600,c.itemLose24,23,1);
}c.loseItem25();
if (c.itemLose25 > 0) {
c.sendFrame34(10600,c.itemLose25,24,1);
}c.loseItem26();
if (c.itemLose26 > 0) {
c.sendFrame34(10600,c.itemLose26,25,1);
}c.loseItem27();
if (c.itemLose27 > 0) {
c.sendFrame34(10600,c.itemLose27,26,1);
}c.loseItem28();
if (c.itemLose28 > 0) {
c.sendFrame34(10600,c.itemLose28,27,1);
}c.loseItem29();
if (c.itemLose29 > 0) {
c.sendFrame34(10600,c.itemLose29,28,1);
}c.loseItem30();
if (c.itemLose30 > 0) {
c.sendFrame34(10600,c.itemLose30,29,1);
}c.loseItem31();
if (c.itemLose31 > 0) {
c.sendFrame34(10600,c.itemLose31,30,1);
}c.loseItem32();
if (c.itemLose32 > 0) {
c.sendFrame34(10600,c.itemLose32,31,1);
}c.loseItem33();
if (c.itemLose33 > 0) {
c.sendFrame34(10600,c.itemLose33,32,1);
}c.loseItem34();
if (c.itemLose34 > 0) {
c.sendFrame34(10600,c.itemLose34,33,1);
}c.loseItem35();
if (c.itemLose35 > 0) {
c.sendFrame34(10600,c.itemLose35,34,1);
}c.loseItem36();
if (c.itemLose36 > 0) {
c.sendFrame34(10600,c.itemLose36,35,1);
}c.loseItem37();
if (c.itemLose37 > 0) {
c.sendFrame34(10600,c.itemLose37,36,1);
}c.loseItem38();
if (c.itemLose38 > 0) {
c.sendFrame34(10600,c.itemLose38,37,1);
}c.loseItem39();
if (c.itemLose39 > 0) {
c.sendFrame34(10600,c.itemLose39,38,1);
}
if (c.ProtItem) {
c.keepItem1();
if (c.itemKept1 > 0) {
c.sendFrame34(10494,c.itemKept1, 0, 1);
c.loseItem1();
if (c.itemLose1 > 0) {
c.sendFrame34(10600,c.itemLose1,0,1);
}
c.loseItem2();
if (c.itemLose2 > 0) {
c.sendFrame34(10600,c.itemLose2,1,1);
}c.loseItem3();
if (c.itemLose3 > 0) {
c.sendFrame34(10600,c.itemLose3,2,1);
}c.loseItem4();
if (c.itemLose4 > 0) {
c.sendFrame34(10600,c.itemLose4,3,1);
}c.loseItem5();
if (c.itemLose5 > 0) {
c.sendFrame34(10600,c.itemLose5,4,1);
}c.loseItem6();
if (c.itemLose6 > 0) {
c.sendFrame34(10600,c.itemLose6,5,1);
}c.loseItem7();
if (c.itemLose7 > 0) {
c.sendFrame34(10600,c.itemLose7,6,1);
}c.loseItem8();
if (c.itemLose8 > 0) {
c.sendFrame34(10600,c.itemLose8,7,1);
}c.loseItem9();
if (c.itemLose9 > 0) {
c.sendFrame34(10600,c.itemLose9,8,1);
}c.loseItem10();
if (c.itemLose10 > 0) {
c.sendFrame34(10600,c.itemLose10,9,1);
}c.loseItem11();
if (c.itemLose11 > 0) {
c.sendFrame34(10600,c.itemLose11,10,1);
}c.loseItem12();
if (c.itemLose12 > 0) {
c.sendFrame34(10600,c.itemLose12,11,1);
}c.loseItem13();
if (c.itemLose13 > 0) {
c.sendFrame34(10600,c.itemLose13,12,1);
}c.loseItem14();
if (c.itemLose14 > 0) {
c.sendFrame34(10600,c.itemLose14,13,1);
}c.loseItem15();
if (c.itemLose15 > 0) {
c.sendFrame34(10600,c.itemLose15,14,1);
}c.loseItem16();
if (c.itemLose16 > 0) {
c.sendFrame34(10600,c.itemLose16,15,1);
}c.loseItem17();
if (c.itemLose17 > 0) {
c.sendFrame34(10600,c.itemLose17,16,1);
}c.loseItem18();
if (c.itemLose18 > 0) {
c.sendFrame34(10600,c.itemLose18,17,1);
}c.loseItem19();
if (c.itemLose19 > 0) {
c.sendFrame34(10600,c.itemLose19,18,1);
}c.loseItem20();
if (c.itemLose20 > 0) {
c.sendFrame34(10600,c.itemLose20,19,1);
}c.loseItem21();
if (c.itemLose21 > 0) {
c.sendFrame34(10600,c.itemLose21,20,1);
}c.loseItem22();
if (c.itemLose22 > 0) {
c.sendFrame34(10600,c.itemLose22,21,1);
}c.loseItem23();
if (c.itemLose23 > 0) {
c.sendFrame34(10600,c.itemLose23,22,1);
}c.loseItem24();
if (c.itemLose24 > 0) {
c.sendFrame34(10600,c.itemLose24,23,1);
}c.loseItem25();
if (c.itemLose25 > 0) {
c.sendFrame34(10600,c.itemLose25,24,1);
}c.loseItem26();
if (c.itemLose26 > 0) {
c.sendFrame34(10600,c.itemLose26,25,1);
}c.loseItem27();
if (c.itemLose27 > 0) {
c.sendFrame34(10600,c.itemLose27,26,1);
}c.loseItem28();
if (c.itemLose28 > 0) {
c.sendFrame34(10600,c.itemLose28,27,1);
}c.loseItem29();
if (c.itemLose29 > 0) {
c.sendFrame34(10600,c.itemLose29,28,1);
}c.loseItem30();
if (c.itemLose30 > 0) {
c.sendFrame34(10600,c.itemLose30,29,1);
}c.loseItem31();
if (c.itemLose31 > 0) {
c.sendFrame34(10600,c.itemLose31,30,1);
}c.loseItem32();
if (c.itemLose32 > 0) {
c.sendFrame34(10600,c.itemLose32,31,1);
}c.loseItem33();
if (c.itemLose33 > 0) {
c.sendFrame34(10600,c.itemLose33,32,1);
}c.loseItem34();
if (c.itemLose34 > 0) {
c.sendFrame34(10600,c.itemLose34,33,1);
}c.loseItem35();
if (c.itemLose35 > 0) {
c.sendFrame34(10600,c.itemLose35,34,1);
}c.loseItem36();
if (c.itemLose36 > 0) {
c.sendFrame34(10600,c.itemLose36,35,1);
}c.loseItem37();
if (c.itemLose37 > 0) {
c.sendFrame34(10600,c.itemLose37,36,1);
}c.loseItem38();
if (c.itemLose38 > 0) {
c.sendFrame34(10600,c.itemLose38,37,1);
}
}
c.sendFrame126("~ 1 ~", 18108);
} else {
c.sendFrame126("~ 0 ~", 18108);
}
} else {
c.keepItem1();
if (c.itemKept1 > 0) {
c.sendFrame34(10494, c.itemKept1, 0, 1);
number++;
}
c.keepItem2();
if (c.itemKept2 > 0) {
c.sendFrame34(10494, c.itemKept2, 1, 1);
number++;
}
c.keepItem3();
if (c.itemKept3 > 0) {
c.sendFrame34(10494, c.itemKept3, 2, 1);
number++;
}
c.loseItem1();
if (c.itemLose1 > 0) {
c.sendFrame34(10600,c.itemLose1,0,1);
}
c.loseItem2();
if (c.itemLose2 > 0) {
c.sendFrame34(10600,c.itemLose2,1,1);
}c.loseItem3();
if (c.itemLose3 > 0) {
c.sendFrame34(10600,c.itemLose3,2,1);
}c.loseItem4();
if (c.itemLose4 > 0) {
c.sendFrame34(10600,c.itemLose4,3,1);
}c.loseItem5();
if (c.itemLose5 > 0) {
c.sendFrame34(10600,c.itemLose5,4,1);
}c.loseItem6();
if (c.itemLose6 > 0) {
c.sendFrame34(10600,c.itemLose6,5,1);
}c.loseItem7();
if (c.itemLose7 > 0) {
c.sendFrame34(10600,c.itemLose7,6,1);
}c.loseItem8();
if (c.itemLose8 > 0) {
c.sendFrame34(10600,c.itemLose8,7,1);
}c.loseItem9();
if (c.itemLose9 > 0) {
c.sendFrame34(10600,c.itemLose9,8,1);
}c.loseItem10();
if (c.itemLose10 > 0) {
c.sendFrame34(10600,c.itemLose10,9,1);
}c.loseItem11();
if (c.itemLose11 > 0) {
c.sendFrame34(10600,c.itemLose11,10,1);
}c.loseItem12();
if (c.itemLose12 > 0) {
c.sendFrame34(10600,c.itemLose12,11,1);
}c.loseItem13();
if (c.itemLose13 > 0) {
c.sendFrame34(10600,c.itemLose13,12,1);
}c.loseItem14();
if (c.itemLose14 > 0) {
c.sendFrame34(10600,c.itemLose14,13,1);
}c.loseItem15();
if (c.itemLose15 > 0) {
c.sendFrame34(10600,c.itemLose15,14,1);
}c.loseItem16();
if (c.itemLose16 > 0) {
c.sendFrame34(10600,c.itemLose16,15,1);
}c.loseItem17();
if (c.itemLose17 > 0) {
c.sendFrame34(10600,c.itemLose17,16,1);
}c.loseItem18();
if (c.itemLose18 > 0) {
c.sendFrame34(10600,c.itemLose18,17,1);
}c.loseItem19();
if (c.itemLose19 > 0) {
c.sendFrame34(10600,c.itemLose19,18,1);
}c.loseItem20();
if (c.itemLose20 > 0) {
c.sendFrame34(10600,c.itemLose20,19,1);
}c.loseItem21();
if (c.itemLose21 > 0) {
c.sendFrame34(10600,c.itemLose21,20,1);
}c.loseItem22();
if (c.itemLose22 > 0) {
c.sendFrame34(10600,c.itemLose22,21,1);
}c.loseItem23();
if (c.itemLose23 > 0) {
c.sendFrame34(10600,c.itemLose23,22,1);
}c.loseItem24();
if (c.itemLose24 > 0) {
c.sendFrame34(10600,c.itemLose24,23,1);
}c.loseItem25();
if (c.itemLose25 > 0) {
c.sendFrame34(10600,c.itemLose25,24,1);
}c.loseItem26();
if (c.itemLose26 > 0) {
c.sendFrame34(10600,c.itemLose26,25,1);
}c.loseItem27();
if (c.itemLose27 > 0) {
c.sendFrame34(10600,c.itemLose27,26,1);
}c.loseItem28();
if (c.itemLose28 > 0) {
c.sendFrame34(10600,c.itemLose28,27,1);
}c.loseItem29();
if (c.itemLose29 > 0) {
c.sendFrame34(10600,c.itemLose29,28,1);
}c.loseItem30();
if (c.itemLose30 > 0) {
c.sendFrame34(10600,c.itemLose30,29,1);
}c.loseItem31();
if (c.itemLose31 > 0) {
c.sendFrame34(10600,c.itemLose31,30,1);
}c.loseItem32();
if (c.itemLose32 > 0) {
c.sendFrame34(10600,c.itemLose32,31,1);
}c.loseItem33();
if (c.itemLose33 > 0) {
c.sendFrame34(10600,c.itemLose33,32,1);
}c.loseItem34();
if (c.itemLose34 > 0) {
c.sendFrame34(10600,c.itemLose34,33,1);
}c.loseItem35();
if (c.itemLose35 > 0) {
c.sendFrame34(10600,c.itemLose35,34,1);
}c.loseItem36();
if (c.itemLose36 > 0) {
c.sendFrame34(10600,c.itemLose36,35,1);
}
if (c.ProtItem) {
c.keepItem4();
if (c.itemKept4 > 0) {
c.sendFrame34(10494, c.itemKept4, 3, 1);
number++;
}
c.loseItem1();
if (c.itemLose1 > 0) {
c.sendFrame34(10600,c.itemLose1,0,1);
}
c.loseItem2();
if (c.itemLose2 > 0) {
c.sendFrame34(10600,c.itemLose2,1,1);
}c.loseItem3();
if (c.itemLose3 > 0) {
c.sendFrame34(10600,c.itemLose3,2,1);
}c.loseItem4();
if (c.itemLose4 > 0) {
c.sendFrame34(10600,c.itemLose4,3,1);
}c.loseItem5();
if (c.itemLose5 > 0) {
c.sendFrame34(10600,c.itemLose5,4,1);
}c.loseItem6();
if (c.itemLose6 > 0) {
c.sendFrame34(10600,c.itemLose6,5,1);
}c.loseItem7();
if (c.itemLose7 > 0) {
c.sendFrame34(10600,c.itemLose7,6,1);
}c.loseItem8();
if (c.itemLose8 > 0) {
c.sendFrame34(10600,c.itemLose8,7,1);
}c.loseItem9();
if (c.itemLose9 > 0) {
c.sendFrame34(10600,c.itemLose9,8,1);
}c.loseItem10();
if (c.itemLose10 > 0) {
c.sendFrame34(10600,c.itemLose10,9,1);
}c.loseItem11();
if (c.itemLose11 > 0) {
c.sendFrame34(10600,c.itemLose11,10,1);
}c.loseItem12();
if (c.itemLose12 > 0) {
c.sendFrame34(10600,c.itemLose12,11,1);
}c.loseItem13();
if (c.itemLose13 > 0) {
c.sendFrame34(10600,c.itemLose13,12,1);
}c.loseItem14();
if (c.itemLose14 > 0) {
c.sendFrame34(10600,c.itemLose14,13,1);
}c.loseItem15();
if (c.itemLose15 > 0) {
c.sendFrame34(10600,c.itemLose15,14,1);
}c.loseItem16();
if (c.itemLose16 > 0) {
c.sendFrame34(10600,c.itemLose16,15,1);
}c.loseItem17();
if (c.itemLose17 > 0) {
c.sendFrame34(10600,c.itemLose17,16,1);
}c.loseItem18();
if (c.itemLose18 > 0) {
c.sendFrame34(10600,c.itemLose18,17,1);
}c.loseItem19();
if (c.itemLose19 > 0) {
c.sendFrame34(10600,c.itemLose19,18,1);
}c.loseItem20();
if (c.itemLose20 > 0) {
c.sendFrame34(10600,c.itemLose20,19,1);
}c.loseItem21();
if (c.itemLose21 > 0) {
c.sendFrame34(10600,c.itemLose21,20,1);
}c.loseItem22();
if (c.itemLose22 > 0) {
c.sendFrame34(10600,c.itemLose22,21,1);
}c.loseItem23();
if (c.itemLose23 > 0) {
c.sendFrame34(10600,c.itemLose23,22,1);
}c.loseItem24();
if (c.itemLose24 > 0) {
c.sendFrame34(10600,c.itemLose24,23,1);
}c.loseItem25();
if (c.itemLose25 > 0) {
c.sendFrame34(10600,c.itemLose25,24,1);
}c.loseItem26();
if (c.itemLose26 > 0) {
c.sendFrame34(10600,c.itemLose26,25,1);
}c.loseItem27();
if (c.itemLose27 > 0) {
c.sendFrame34(10600,c.itemLose27,26,1);
}c.loseItem28();
if (c.itemLose28 > 0) {
c.sendFrame34(10600,c.itemLose28,27,1);
}c.loseItem29();
if (c.itemLose29 > 0) {
c.sendFrame34(10600,c.itemLose29,28,1);
}c.loseItem30();
if (c.itemLose30 > 0) {
c.sendFrame34(10600,c.itemLose30,29,1);
}c.loseItem31();
if (c.itemLose31 > 0) {
c.sendFrame34(10600,c.itemLose31,30,1);
}c.loseItem32();
if (c.itemLose32 > 0) {
c.sendFrame34(10600,c.itemLose32,31,1);
}c.loseItem33();
if (c.itemLose33 > 0) {
c.sendFrame34(10600,c.itemLose33,32,1);
}c.loseItem34();
if (c.itemLose34 > 0) {
c.sendFrame34(10600,c.itemLose34,33,1);
}c.loseItem35();
if (c.itemLose35 > 0) {
c.sendFrame34(10600,c.itemLose35,34,1);
}}}
c.sendFrame126("Items Kept on Death", 18103);
c.sendFrame126("Items you will keep on death (if not skulled):", 18104);
c.sendFrame126("Items you will lose on death(if not skulled):", 18105);
c.sendFrame126("Information:", 18106);
c.sendFrame126("Max Items Kept on death:", 18107);
c.sendFrame126("~ "+number+" ~", 18108);
c.sendFrame126("", 18109);
c.sendFrame126("Displays the items you", 18110);
c.sendFrame126("will keep or loose", 18111);
c.sendFrame126("when you die.", 18112);
c.sendFrame126("", 18113);
c.sendFrame126("", 18114);
c.sendFrame126("", 18117);
c.sendFrame126("Being skulled means,", 18118);
c.sendFrame126(" you keep nothing", 18119);
c.sendFrame126("", 18120);
c.sendFrame126("", 18121);
c.sendFrame126("Join", 18122);
c.sendFrame126("www.ywscape.co.nr", 18123);
c.sendFrame126("", 18124);
c.sendFrame126("Peace.", 18125);
c.sendFrame126("", 18126);
c.sendFrame126("", 18127);
c.sendFrame126("", 18128);
c.sendFrame126("", 18129);
c.sendFrame126("", 18130);
c.resetKeepItem();
c.showInterface(18100);
break;
case 75001:
            // yes emote
               // c.setAnimation(0x357);
            break;
          case 75003:	
			// no emote
               // c.setAnimation(856);
            break;

			case 75006:
				// think emote
					//c.setAnimation(0x359);
				break;

			case 75004:
				// bow emote
					// c.setAnimation(0x35A);
				break;

			case 75005:
				// angry emote
				//	c.setAnimation(0x35B);
				break;

			case 74074:
				// cry emote
				//	c.setAnimation(0x35C);
				break;

			case 74067:
				// laugh emote
				//	c.setAnimation(0x35D);
				break;

			case 75009:
				// cheer emote
				//	c.setAnimation(0x35E);
				break;

			case 75007:
				// wave emote
				//	c.setAnimation(0x35F);
				break;

			case 74066:
				// beckon emote
				//	c.setAnimation(0x360);
				break;

			case 74163:
				// clap emote
				//	c.setAnimation(0x361);
				break;

			case 74070:
				// dance emote
				//	c.setAnimation(866);
				break;

			case 74075:
				// panic emote
				//	c.setAnimation(0x839);
				break;

			case 74071:
				// jig emote
				//	c.setAnimation(0x83A);
				break;

			case 74072:
				// spin emote;
				//	c.setAnimation(0x83B);
				break;

			case 74073:
				// headbang emote
				//	c.setAnimation(0x83C);
				break;

			case 74068:
				// joy jump emote
				//	c.setAnimation(0x83D);
				break;

			case 74076:
				// rasp' berry emote
				//	c.setAnimation(0x83E);
				break;

			case 74069:
				// yawn emote
					//c.setAnimation(0x83F);
				break;

			case 74164:
				// salute emote
				//	c.setAnimation(0x840);
				break;

			case 75008:
				// shrug emote
				//	c.setAnimation(0x841);
				break;

			case 74175:
				// blow kiss emote
				//	c.setAnimation(0x558);
				break;

			case 74167:
				// glass box emote
				//	c.setAnimation(0x46B);
				break;

			case 74168:
				// climb rope emote
				//	c.setAnimation(0x46A);
				break;

			case 74169:
				// lean emote
				//	c.setAnimation(0x469);
				break;

			case 74170:
				// glass wall emote
				//	c.setAnimation(0x468);
				break;

			case 74165:
				// goblin bow emote
				//	c.setAnimation(0x84F);
				break;

			case 74166:
				// goblin dance emote
				//	c.setAnimation(0x850);
				break;
			case 74171:
				// zombie walk emote
				//	c.setAnimation(3544);
				break;
			case 74172:
				// zombie dance emote
				//	c.setAnimation(3543);
				break;

			case 72254:
				// rapid hop emote
				//	c.setAnimation(3866);
				break;
			case 74173:
				// scared
				//	c.setAnimation(2836);
				break;
		case 74174:
				// scared
				//	c.setAnimation(794);
				break;
		case 74077:
				//c.sM("Skillcape emotes coming.");
				break;

case 64073:
c.showInterface(16460);
break;
	
			
				
				case 9154:
				// Log out
				long currentTime = System.currentTimeMillis();
				if (c.inCombat) {
					c.sM("You must wait until you are out of combat before logging out!");
					break;
				}
if (c.inPcBoat()) {
					c.sM("You can`t log out while you are in boat!");
					break;
				}
if(c.action == 1){
c.sM("Suspicious activity!");
break;
}
				// if(c.currentHealth > 0)
				c.logout();
break;
case 3057://pilot map
c.setClientConfig(153, 9);
c.triggerTele(2465, 3497, 0);
c.sM("You fly to the land of the gnomes.");
break;
case 3058:
c.triggerTele(2985, 3857, 0);
break;
case 3059://gwd
c.triggerTele(2584, 3916, 0);
break;
case 48054://daggs
c.triggerTele(2900, 4449, 0);
break;
case 3060:
c.triggerTele(3506, 9493, 0);//kq
break;
case 62180:
c.closeInterface();
break;
case 3056:
c.triggerTele(2662, 2648, 0);//pestcontrol
c.closeAll();
break;
case 73176:
if(c.playerHasItem(553, 5) && c.playerHasItem(560, 5) && c.playerHasItem(563, 10)){
if(c.playerLevel[6] >= 96){
c.switchBooks();
c.deleteItem(553, 5);
c.deleteItem(560, 5);
c.deleteItem(563, 10);
} else
c.sM("You need a magic level of 96 or better to cast this spell.");
} else
c.sM("You don't have enough runes to cast this spell.");
break;
case 73172:
if(System.currentTimeMillis() - c.mageDelay < 7000) return;
if(c.playerHasItem(553, 5) && c.playerHasItem(560, 5) && c.playerHasItem(565, 10)){
if(c.playerLevel[6] >= 95){
c.mageDelay = System.currentTimeMillis();
c.healAll();
c.deleteItem(553, 5);
c.deleteItem(560, 5);
c.deleteItem(565, 10);
} else
c.sM("You need a magic level of 95 or better to cast this spell.");
} else
c.sM("You don't have enough runes to cast this spell.");
break;


case 28164:
break;
case 28165:
//c.q2help();
break;
case 28168:
c.q4help();
break;
case 28215:
c.q5help();
break;
case 28171:
c.q6help();
break;
case 28170:
c.q7help();
break;
case 28172:
//c.q8help();
break;
case 28178:
c.q9help();
break;
case 28173:
c.q10help();
break;
case 28174:
c.q11help();
break;
case 9157://npc dialogues chat boxes
if(c.NpcDialogue == 9){//pin
c.closeAll();
c.showInterface(14924);
}
if(c.NpcDialogue == 11){
c.closeAll();
c.fixBarrows();
}
if(c.NpcDialogue == 12){
c.closeAll();
c.NpcDialogue = 13;
c.NpcDialogueSend = false;
}
if(c.NpcDialogue == 144){
c.closeAll();
c.q6 = 1;
c.NpcDialogue = 145;
c.NpcDialogueSend = false;
}
if(c.NpcDialogue == 145){
c.closeAll();
c.q6 = 3;
c.NpcDialogue = 146;
c.NpcDialogueSend = false;
}
if(c.NpcDialogue == 17){
c.closeAll();
c.NpcDialogue = 18;
c.NpcDialogueSend = false;
}
if(c.NpcDialogue == 24){
c.closeAll();
c.NpcDialogue = 25;
c.NpcDialogueSend = false;
}
/*if(c.NpcDialogue == 29 && c.playerHasItem(995, 500)){
c.closeAll();
c.NpcDialogue = 30;
c.NpcDialogueSend = false;
c.deleteItem(995, 500);
c.q2 = 2;
}*/
if(c.NpcDialogue == 29 && !c.playerHasItem(995, 500)){
c.closeAll();
c.sM("You do not have enough coins.");
}
if(c.NpcDialogue == 38){
c.closeAll();
c.NpcDialogue = 39;
c.NpcDialogueSend = false;
c.q3 = 1;
c.sendQuest("@yel@Desert Treasure", 7334);
}
if(c.NpcDialogue == 43){
c.closeAll();
c.toX = 3569;
c.toY = 3414;
}
if(c.NpcDialogue == 46){
c.closeAll();
c.NpcDialogue = 47;
c.NpcDialogueSend = false;
c.q4 = 1;
c.sendQuest("@yel@Vampire Slayer", 7336);
}
if(c.NpcDialogue == 51){
c.closeAll();
c.q5 = 1;
c.sendQuest("@yel@Monkey Madness", 7383);
}
if(c.NpcDialogue == 58){
c.closeAll();
c.q6 = 1;
c.sendQuest("@yel@Sheep Shearer", 7339);
}
if(c.NpcDialogue == 67){
c.closeAll();
c.NpcDialogue = 68;
c.NpcDialogueSend = false;
c.q7 = 1;
c.sendQuest("@yel@Legends Quest", 7338);
}
if(c.NpcDialogue == 83){
c.closeAll();
c.NpcDialogue = 84;
c.NpcDialogueSend = false;
c.q9 = 1;
c.sendQuest("@yel@Knight's Legend", 7346);
}
if(c.NpcDialogue == 93){
c.closeAll();
c.NpcDialogue = 94;
c.NpcDialogueSend = false;
c.q10 = 1;
c.sendQuest("@yel@Lunar Spirit", 7341);
}
if(c.NpcDialogue == 99){
c.closeAll();
c.NpcDialogue = 100;
c.NpcDialogueSend = false;
c.q10 = 2;
}
if(c.NpcDialogue == 154){
c.closeAll();
c.toX = 2988;
c.toY = 9653;
}
if(c.NpcDialogue == 104){
c.closeAll();
c.toX = 2917;
c.toY = 9692;
}
if(c.NpcDialogue == 110){
c.closeAll();
c.toX = 3500;
c.toY = 3487;
}
if(c.NpcDialogue == 117){
c.closeAll();
c.toX = 3565;
c.toY = 3311;
}
if(c.NpcDialogue == 134){
c.closeAll();
c.toX = 3565;
c.toY = 3311;
}
if(c.NpcDialogue == 137){
c.closeAll();
c.showInterface(18460);
c.triggerTele(1899, 5355, 2);

//c.heightLevel = getHeightForTzhaar();
}
break;
case 9158:
if(c.NpcDialogue == 9 || c.NpcDialogue == 11 || c.NpcDialogue == 12 || c.NpcDialogue == 17 || c.NpcDialogue == 24 || c.NpcDialogue == 29 || c.NpcDialogue == 38 || c.NpcDialogue == 43 || c.NpcDialogue == 46 || c.NpcDialogue == 51 || c.NpcDialogue == 58 || c.NpcDialogue == 67 || c.NpcDialogue == 83 || c.NpcDialogue == 93 || c.NpcDialogue == 99 || c.NpcDialogue == 104 || c.NpcDialogue == 110 || c.NpcDialogue == 125 || c.NpcDialogue == 127 || c.NpcDialogue == 129 || c.NpcDialogue == 117){
c.closeAll();
}
break;
case 21076:
c.brightness = 1;
break;
case 24129:
c.brightness = 2;
break;
case 24131:
c.brightness = 3;
break;
case 24133:
c.brightness = 4;
break;
case 3185:
c.splitChat = 0;
break;
case 3184:
c.splitChat = 1;
break;
case 58074:
c.closeInterface();
break;
        case 58230: 
            if(c.pinCorrect())
            {
                c.resetBankPinAttempts();
                c.showInterface(7424);
               c. pinChanged = true;
                c.sM("Enter your desired pin number now.");
            } else
            {
                c.sM("You must enter your pin before changing it!");
            }
            break;

        case 58234: 
            if(c.pinCorrect())
            {
                c.RemoveAllWindows();
                c.resetBankPinAttempts();
                c.bankPin = 0;
                c.sM("You no longer have a bank pin.");
            } else
            {
                c.sM("You must enter your pin before deleting it!");
            }
            break;

        case 58025: 
            c.numberEnter(1);
            break;

        case 58026: 
            c.numberEnter(2);
            break;

        case 58027: 
            c.numberEnter(3);
            break;

        case 58028: 
            c.numberEnter(4);
            break;

        case 58029: 
            c.numberEnter(5);
            break;

        case 58030: 
            c.numberEnter(6);
            break;

        case 58031: 
            c.numberEnter(7);
            break;

        case 58032: 
            c.numberEnter(8);
            break;

        case 58033: 
            c.numberEnter(9);
            break;

        case 58034: 
            c.numberEnter(0);
            break;
case 150:
c.autoRetaliate = 1;
break;
case 151:
c.autoRetaliate = 0;
break;
          case 168:
            // yes emote
                c.setAnimation(0x357);
            break;
          case 169:
            // no emote
                c.setAnimation(856);
            break;

			case 162:
				// think emote
					c.setAnimation(0x359);
				break;

			case 164:
				// bow emote
					c.setAnimation(0x35A);
				break;

			case 165:
				// angry emote
					c.setAnimation(0x35B);
				break;

			case 161:
				// cry emote
					c.setAnimation(0x35C);
				break;

			case 170:
				// laugh emote
					c.setAnimation(0x35D);
				break;

			case 171:
				// cheer emote
					c.setAnimation(0x35E);
				break;

			case 163:
				// wave emote
					c.setAnimation(0x35F);
				break;

			case 167:
				// beckon emote
					c.setAnimation(0x360);
				break;

			case 172:
				// clap emote
					c.setAnimation(0x361);
				break;

			case 166:
				// dance emote
					c.setAnimation(866);
				break;

			case 52050:
				// panic emote
					c.setAnimation(0x839);
				break;

			case 52051:
				// jig emote
					c.setAnimation(0x83A);
				break;

			case 52052:
				// spin emote;
					c.setAnimation(0x83B);
				break;

			case 52053:
				// headbang emote
					c.setAnimation(0x83C);
				break;

			case 52054:
				// joy jump emote
					c.setAnimation(0x83D);
				break;

			case 52055:
				// rasp' berry emote
					c.setAnimation(0x83E);
				break;

			case 52056:
				// yawn emote
					c.setAnimation(0x83F);
				break;

			case 52057:
				// salute emote
					c.setAnimation(0x840);
				break;

			case 52058:
				// shrug emote
					c.setAnimation(0x841);
				break;

			case 43092:
				// blow kiss emote
					c.setAnimation(0x558);
				break;

			case 2155:
				// glass box emote
					c.setAnimation(0x46B);
				break;

			case 25103:
				// climb rope emote
					c.setAnimation(0x46A);
				break;

			case 25106:
				// lean emote
					c.setAnimation(0x469);
				break;

			case 2154:
				// glass wall emote
					c.setAnimation(0x468);
				break;

			case 52071:
				// goblin bow emote
					c.setAnimation(0x84F);
				break;

			case 52072:
				// goblin dance emote
					c.setAnimation(0x850);
				break;
			case 72032:
				// zombie walk emote
					c.setAnimation(3544);
				break;
			case 72033:
				// zombie walk emote
					c.setAnimation(3543);
				break;
case 55095://yes (destroy item)
    c.deleteItem(c.publicDroppendItem, c.getItemSlot(c.publicDroppendItem), 1);
    c.closeInterface();
    break;
case 55096://no (destroy item)
    c.closeInterface();
    break;
case 29063://axes
if (c.playerEquipment[c.playerWeapon] == 1377 && c.specialAmount <= 99) {//dba
c.sM("You do not have enough special energy left.");
}
if (c.playerEquipment[c.playerWeapon] == 1377 && c.specialAmount >= 100) {//dba
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.setAnimation(1670);
c.lowGFX(246, 0);
c.specialAmount -= 100;
c.specTimer = 70;
c.plrText = "Raarrrrrgggggghhhhhhh!";
c.plrTextUpdateRequired = true;
}
c.specAttack();
break;/*
case 40132:
c.option = 1;
break;
case 40133:
c.option = 2;
break;
case 25155:
c.option = 3;
break;
case 25160:
c.option = 4;
break;*/
case 29113://bows
case 33033://halberds
case 29163://swords
case 29138://dds
case 48023://whip
try {
if(c.playerEquipment[c.playerWeapon] == 4153 && c.specialAmount > 49 && c.IsAttacking){
c.specialAtk(true, 50, 340, 1667);
c.setHitDiff(Miscellaneous.random(c.playerMaxHit) + Miscellaneous.random(c.StrPrayer));
}
if(c.playerEquipment[c.playerWeapon] == 4153 && c.specialAmount > 49 && c.IsAttackingNPC){
c.specialAtkNPC(true, 50, 340, 1667);
c.setHitDiff(Miscellaneous.random(c.playerMaxHit) + Miscellaneous.random(c.StrPrayer));
}
if (c.specOn == true && c.playerEquipment[c.playerWeapon] != 4153) {
c.specOn = false;
} else if (c.specOn == false && c.playerEquipment[c.playerWeapon] != 4153) {
c.specOn = true;
}
c.specAttack();
} catch (Exception popo) {
}
break;
	/**Start of Ancients**/
case 63072:
c.triggerTele(3087+ Miscellaneous.random(2), 3492+ Miscellaneous.random(2), 0);
	break;
case 50235:
	c.triggerTele(2674+ Miscellaneous.random(2), 3711+ Miscellaneous.random(2), 0);
	break;
case 50245: 
	c.triggerTele(2809+ Miscellaneous.random(2), 3435+ Miscellaneous.random(1), 0);
	break;
case 50253://
	c.triggerTele(3422+ Miscellaneous.random(2), 3537+ Miscellaneous.random(2), 0);
	break;
case 51005://
	//c.triggerTele(2674+Miscellaneous.random(2), 3711+Miscellaneous.random(2), 0);
	c.setSidebarInterface(6, 16040);
	break;
case 51013://
	c.showInterface(802);
	break;
case 51023:// 
    c.setSidebarInterface(6, 16030);
	break;
case 51031:// 
	c.showInterface(16020);
	break;
case 51039:// 
	c.triggerTele(2539+ Miscellaneous.random(2), 4716+ Miscellaneous.random(2), 0);
	break;
	
	/**End of Ancients**/
case 62170:// 
	c.triggerTele(2467+ Miscellaneous.random(1), 10134+ Miscellaneous.random(1), 0);
	break;
case 62171:// 
	c.triggerTele(2912+ Miscellaneous.random(1), 3613+ Miscellaneous.random(1), 0);
	break;
case 62172:// 
	c.triggerTele(2895+ Miscellaneous.random(1), 2724+ Miscellaneous.random(1), 0);
	break;
case 62173:// 
	c.triggerTele(3558+ Miscellaneous.random(1), 9947+ Miscellaneous.random(1), 0);
	break;
case 62176:// 
	c.closeInterface();
	if (c.playerAncientMagics == 0) {
		 c.setSidebarInterface(6, 1151);
	}
	if (c.playerAncientMagics == 1) {
		c.setSidebarInterface(6, 12855);
	}
	if (c.playerAncientMagics == 2) {
		c.setSidebarInterface(6, 18787);
	}
	break;

case 62160:// 
	c.triggerTele(2399+ Miscellaneous.random(1), 5178+ Miscellaneous.random(1), 0);
	break;
case 62161:// 
	c.triggerTele(3564+ Miscellaneous.random(1), 3288+ Miscellaneous.random(1), 0);
	break;
case 62162:// 
	c.triggerTele(2657+ Miscellaneous.random(1), 2649+ Miscellaneous.random(1), 0);
	break;
/*case 62163:// 
	c.triggerTele(2603+Miscellaneous.random(1), 3154+Miscellaneous.random(1), 0);
	break;*/
case 59008:
	if(c.pcPoints > 9){
		c.eoption = 1;
		c.sendQuest("@whi@| Attack |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59009:
	if(c.pcPoints > 9){
		c.eoption = 2;
		c.sendQuest("@whi@| Strength |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59010:
	if(c.pcPoints > 9){
		c.eoption = 3;
		c.sendQuest("@whi@| Defence |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59011:
	if(c.pcPoints > 9){
		c.eoption = 4;
		c.sendQuest("@whi@| Ranged |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59012:
	if(c.pcPoints > 9){
		c.eoption = 5;
		c.sendQuest("@whi@| Magic |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59013:
	if(c.pcPoints > 9){
		c.eoption = 6;
		c.sendQuest("@whi@| Hitpoints |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

case 59014:
	if(c.pcPoints > 9){
		c.eoption = 7;
		c.sendQuest("@whi@| Prayer |", 15127);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
//----------------
	case 59022: //close
	if(System.currentTimeMillis() - c.lastAction > 1000){
		c.closeInterface();
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	}
	break;
//------------------
case 59024:
	if(c.option == 0 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void knight top!");
		c.addItem(2520, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
break;

/**-----------------------**/


case 58255:
	if(c.pcPoints > 24){
		c.option = 1;
		c.sendQuest("@whi@Void melee helm", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
case 59000:
	if(c.pcPoints > 24){
		c.option = 2;
		c.sendQuest("@whi@Void ranger helm", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
case 59001:
	if(c.pcPoints > 24){
		c.option = 3;
		c.sendQuest("@whi@Void mage helm", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
case 59002:
	if(c.pcPoints > 24){
		c.option = 4;
		c.sendQuest("@whi@Void knight top", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
case 59003:
	if(c.pcPoints > 24){
		c.option = 5;
		c.sendQuest("@whi@Void knight robe", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;
case 59004:
	if(c.pcPoints > 24){
		c.option = 6;
		c.sendQuest("@whi@Void knight mace", 15098);
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	} else {
		c.sM("You don't have enough points.");
	}
break;

 
case 58252:
	if(c.option == 0 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have not chosen a reward!");
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	}

	if(c.option == 1 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void melee helm!");
		c.addItem(2526, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
	if(c.option == 2 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void ranger helm!");
		c.addItem(2524, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
	if(c.option == 3 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void mage helm!");
		c.addItem(2518, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
	if(c.option == 4 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void knight top!");
		c.addItem(2520, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
	if(c.option == 5 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("You have been rewarded a Void knight robe!");
		c.addItem(2522, 1);
		c.pcPoints -= 25;
		c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
	if(c.option == 6 && c.pcPoints > 24 && System.currentTimeMillis() - c.lastAction > c.actionInterval){
		c.sM("Will be the next release!");
		//c.addItem(2518, 1);
		//c.pcPoints -= 25;
		//c.closeInterface();
		c.actionInterval = 6000;
		c.lastAction = System.currentTimeMillis();
	}
break;
	
	case 58244:
	if(System.currentTimeMillis() - c.lastAction > 1000){
		c.closeInterface();
		c.actionInterval = 2000;
		c.lastAction = System.currentTimeMillis();
	}
break;
case 62163:
	c.triggerTele(2603, 3153, 0);
		/*if ((c.playerEquipment[c.playerCape] == -1)) {
			c.RoleSelect();
		} else {
			c.sM("You can't start Barbarian Assault while wearing a cape.");
		}*/
    break;
	
case 62164:// 
	c.triggerTele(2584+ Miscellaneous.random(1), 3916+ Miscellaneous.random(1), 0);
	break;
	case 62115:
		if ((c.playerEquipment[c.playerCape] == -1)) {
			c.triggerTele(3351+ Miscellaneous.random(4), 3344+ Miscellaneous.random(4), 0);
			c.playerEquipment[c.playerCape] = 4391; //att cape
			c.WaitAssaultInterface();
			c.attrole = true;
			c.attackers += 1;
			c.sM("You enter Barbarian Assault Minigame as ATTACKER");
		} else {
			c.sM("You can't start Barbarian Assault while wearing a cape.");
		}
		
	break;
	
	case 62116:
		if ((c.playerEquipment[c.playerCape] == -1)) {
			c.triggerTele(3351+ Miscellaneous.random(4), 3344+ Miscellaneous.random(4), 0);
			c.playerEquipment[c.playerCape] = 4383; //def cape
			c.WaitAssaultInterface();
			c.defrole = true;
			c.defenders += 1;
			c.sM("You enter Barbarian Assault Minigame as DEFENDER");
		} else {
			c.sM("You can't start Barbarian Assault while wearing a cape.");
		}
	break;
	
	case 62118:
	if ((c.playerEquipment[c.playerCape] == -1)) {
			c.triggerTele(3351+ Miscellaneous.random(4), 3344+ Miscellaneous.random(4), 0);
			c.playerEquipment[c.playerCape] = 4379; //hea cape
			c.WaitAssaultInterface();
			c.hearole = true;
			c.healerss += 1;
			c.sM("You enter Barbarian Assault Minigame as HEALER");
		} else {
			c.sM("You can't start Barbarian Assault while wearing a cape.");
		}
	break;
	
	case 62117:
	if ((c.playerEquipment[c.playerCape] == -1)) {
			c.triggerTele(3351+ Miscellaneous.random(4), 3344+ Miscellaneous.random(4), 0);
			c.playerEquipment[c.playerCape] = 4389; //col cape
			c.WaitAssaultInterface();
			c.colrole = true;
			c.collectors += 1;
			c.sM("You enter Barbarian Assault Minigame as COLLECTOR");
		} else {
			c.sM("You can't start Barbarian Assault while wearing a cape.");
		}
	break;
	
case 62165:// 
	//c.triggerTele(2584+Miscellaneous.random(1), 3916+Miscellaneous.random(1), 0);
	c.sM("Will be released soon.");
	break;
case 62166:// 
	//c.triggerTele(2584+Miscellaneous.random(1), 3916+Miscellaneous.random(1), 0);
	c.sM("Will be released soon.");
	break;
//**                      pking                      **//
case 62150:// 
	c.triggerTele(3244+ Miscellaneous.random(1), 3517+ Miscellaneous.random(1), 0);
	break;
case 62151:// 
	c.triggerTele(2948+ Miscellaneous.random(1), 3905+ Miscellaneous.random(1), 0);
	break;
case 62152:// 
	c.triggerTele(3005+ Miscellaneous.random(1), 3631+ Miscellaneous.random(1), 0);
	break;
case 62153:// 
	c.triggerTele(3334+ Miscellaneous.random(1), 3667+ Miscellaneous.random(1), 0);
	break;
case 62154:// 
	c.triggerTele(2539+ Miscellaneous.random(1), 4715+ Miscellaneous.random(1), 0);
	break;
case 62155:// 
	c.triggerTele(2718+ Miscellaneous.random(1), 9804+ Miscellaneous.random(1), 0);
	c.sM("Fun Pking is being tested, if you find a bug say.");
	break;
//**                      pking                      **//
	
	
	/**Start of Lunars**/
case 73100://home
c.triggerTele(3087+ Miscellaneous.random(2), 3492+ Miscellaneous.random(2), 0);
	break;
case 73116://2
	c.triggerTele(2674+ Miscellaneous.random(2), 3711+ Miscellaneous.random(2), 0);
break;
case 73120://3
	c.triggerTele(2809+ Miscellaneous.random(2), 3435+ Miscellaneous.random(1), 0);
break;
case 73136://4
	c.triggerTele(3422+ Miscellaneous.random(2), 3537+ Miscellaneous.random(2), 0);
break;
case 73140://5
	c.setSidebarInterface(6, 16040);
break;	
case 73144://6
	c.showInterface(802);
break;
case 73148://7
	c.setSidebarInterface(6, 16030);
break;
case 73152://8
	c.showInterface(16020);
break;
case 73104://npc contact
	
break;
case 73112://hummidify
	
break;
case 73124://cure me
if(System.currentTimeMillis() - c.mageDelay < 7000) return;
if(c.playerHasItem(553, 1) && c.playerHasItem(557, 5)){
if(c.playerLevel[6] >= 71){
c.mageDelay = System.currentTimeMillis();
c.deleteItem(553, 1);
c.deleteItem(557, 5);
c.poisoned = false;
c.poisonDmg = false;
c.sM("You have cured yourself.");
} else
c.sM("You need a magic level of 71 or better to cast this spell.");
} else
c.sM("You don't have enough runes to cast this spell.");
break;
case 73128://cure group
if(System.currentTimeMillis() - c.mageDelay < 7000) return;
if(c.playerHasItem(553, 3) && c.playerHasItem(557, 15)){
if(c.playerLevel[6] >= 74){
c.mageDelay = System.currentTimeMillis();
c.cureAll();
} else
c.sM("You need a magic level of 74 or better to cast this spell.");
} else
c.sM("You don't have enough runes to cast this spell.");
break;
case 73168://vengeance
if(System.currentTimeMillis() - c.vengDelay < 30000){
c.sM("You can only cast vengeance spells every 30 seconds.");
return;
}	
if(c.playerLevel[6] < 94){
	c.sM("You need a magic level of 94 or better to cast this spell.");
} else if (c.playerLevel[6] > 93){
	if(c.playerHasItem(553, 4) && c.playerHasItem(560, 2) && c.playerHasItem(557, 10)){
c.vengDelay = System.currentTimeMillis();
c.addSkillXP(500, 6);
c.specGFX(657);
c.setAnimation(1914);
c.vengon = true;
c.deleteItem(553, 4);
c.deleteItem(560, 2);
c.deleteItem(557, 10);
c.toX = c.absX;
c.toY = c.absY;
	}
	}
break;

	/**End of Lunars**/
	/**Start of Normals**/
			case 4140:
				c.triggerTele(3087+ Miscellaneous.random(2), 3492+ Miscellaneous.random(2), 0);
			break;
			case 4143://L tele
				c.triggerTele(2674+ Miscellaneous.random(2), 3711+ Miscellaneous.random(2), 0);
			break;
			case 4146: 
				c.triggerTele(3422+ Miscellaneous.random(2), 3537+ Miscellaneous.random(2), 0);
			break;
			case 4150: // 
				c.triggerTele(2809+ Miscellaneous.random(2), 3435+ Miscellaneous.random(1), 0);
			break;
			case 6004: 
				c.triggerTele(2661+ Miscellaneous.random(3), 3307+ Miscellaneous.random(3), 0);
			break;
			case 6005: 
				c.setSidebarInterface(6, 16030);
			break;
			case 29031:
				c.showInterface(16020);
			break;
			case 72038:
				c.triggerTele(2763+ Miscellaneous.random(2), 2784+ Miscellaneous.random(2), 0);
			break;
			case 4169: // Charge arena spells
				if (c.arenaSpellTimer <= 0) {
					if (!c.playerHasItem(554, 3) || !c.playerHasItem(565, 3)
							|| !c.playerHasItem(556, 3)) {
						c.sM("You don't have enough runes to cast this spell.");
					} else {
						if (c.playerHasItem(554, 3) && c.playerHasItem(565, 3)
								&& c.playerHasItem(556, 3)) {
							if ((c.playerEquipment[c.playerCape] == 2412)
									|| (c.playerEquipment[c.playerCape] == 2413)
									|| (c.playerEquipment[c.playerCape] == 2414)) {
								c.deleteItem(554, c.getItemSlot(554), 3);
								c.deleteItem(565, c.getItemSlot(565), 3);
								c.deleteItem(556, c.getItemSlot(556), 3);
								c.setAnimation(1820);
								c.stillgfx(441, c.absY, c.absX);
								c.arenaSpellTimer = 120; // 2 Minutes
								if (c.playerEquipment[c.playerCape] == 2412) {
									c.SaradominStrike = true;
									c.sM("You summon the power of the gods and increase your Saradomin Strike's power.");
								}
								if (c.playerEquipment[c.playerCape] == 2413) {
									c.GuthixClaws = true;
									c.sM("You summon the power of the gods and increase your Claws of Guthix's power.");
								}
								if (c.playerEquipment[c.playerCape] == 2414) {
									c.ZamorakFlames = true;
									c.sM("You summon the power of the gods and increase your Flames of Zamorak's power.");
								}
							} else {
								c.sM("You need to be wearing a god cape to cast this spell.");
							}
						}
					}
				} else {
					c.sM("Your god spell is at it's full power.");
				}
			break;
/** End of Normals **/




case 9178://
c.triggerTele(2670, 3726, 0);
break;
case 9167:
c.triggerTele(2445, 5177, 0);
break;
case 9168://cape
c.triggerTele(2401, 5178, 0);
break;
case 9169://fuckoff
c.pDialogue("Nothing, Fuck off you ugly person.", 589);
break;
case 9190:
		if (c.playerEquipment[c.playerWeapon] == 13647)
		{
		c.setSidebarInterface(6, 1151);
		c.playerAncientMagics = 0;
		c.setSidebarInterface(0, 1829);
		c.clearQuestInterface();
		c.closeInterface();
		c.sM("You convert to Normal spell book.");
		} else {
		c.setSidebarInterface(6, 1151);
		c.playerAncientMagics = 0;
		c.clearQuestInterface();
		c.closeInterface();
		c.sM("You convert to Normal spell book.");
		}
break;
case 9191:
		if (c.interfaceEffect == 10) {
		c.toX = 2657;
		c.toY = 2639;
		PlayerHandler.Waiters -= 1;
		c.closeInterface();
		}
break;
case 9192:
		if (c.playerEquipment[c.playerWeapon] == 13647)
		{
		c.setSidebarInterface(6, 18787);
		c.playerAncientMagics = 2;
		c.setSidebarInterface(0, 1829);
		c.closeInterface();
		c.sM("You convert to Lunar spell book.");
		} else {
		c.setSidebarInterface(6, 18787);
		c.playerAncientMagics = 2;
		c.closeInterface();
		c.sM("You convert to Lunar spell book.");
		}
break;
case 9194://
		if (c.interfaceEffect == 11) {
			c.closeInterface();
		}
		if (c.playerEquipment[c.playerWeapon] == 13647)
		{
		c.setSidebarInterface(6, 12855);
		c.playerAncientMagics = 1;
		c.setSidebarInterface(0, 1689);
		c.closeInterface();
		c.sM("You convert to Ancient spell book.");
		} else {
		c.setSidebarInterface(6, 12855);
		c.playerAncientMagics = 1;
		c.closeInterface();
		c.sM("You convert to Ancient spell book.");
		}
break;
case 9193://dag
c.triggerTele(2900, 4449, 0);//New KBD lair ::tele 2273,4695
break;
case 17111:
		c.closeInterface();
					if (c.playerAncientMagics == 0) {
						 c.setSidebarInterface(6, 1151);
					}
					if (c.playerAncientMagics == 1) {
						c.setSidebarInterface(6, 12855);
					}
break;
case 59136:
if(c.interfaceGame == 1)
				c.sendQuest("Which would you like to go?", 2481);
				c.sendQuest("GodWars", 2482);
				c.sendQuest("Slayer Tower", 2483);
				c.sendQuest("Assault", 2496);
				c.sendQuest("Kalphite Queen", 2484);
				c.sendFrame164(2480);
if(c.interfaceGame == 2)
c.triggerTele(3564, 3288, 0);
break;
case 59137:
if(c.interfaceGame == 1)
c.triggerTele(2455, 10147, 0);
if(c.interfaceGame == 2)
c.triggerTele(2399, 5178, 0);
break;
case 59135:
if(c.interfaceGame == 1)
c.triggerTele(2725, 3491, 0);
if(c.interfaceGame == 2)
c.triggerTele(2659, 2676, 0);
break;
case 59139:
if(c.interfaceGame == 1)
c.triggerTele(2272, 4680, 0);
if(c.interfaceGame == 2)
c.triggerTele(2603, 3153, 0);
break;
case 17198:
c.sM("You got it right! ");
c.closeInterface();
break;
case 17199:
c.sM("Wrong");
break;
case 17200:
c.sM("Wrong");
break;

			
			
				case 9179:// 
	c.triggerTele(2540, 4716, 0);
	break;	
			
			case 9180://
c.triggerTele(3349, 3672, 0);
break;
case 9181://
c.triggerTele(3436, 3572, 0);
break;

case 21241: // protect 1 item
if(c.playerLevel[5] == 0){
c.setClientConfig(91, 0);
c.ProtItem = false;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 25){
c.setClientConfig(91, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 25 to use Protect 1 Item.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 25 to use this."); 
}
if(c.ProtItem != true && c.getLevelForXP(c.playerXP[5]) > 24 && c.playerLevel[5] > 0)
{
c.ProtItem = true;
c.praydrain = 4;
c.prayOn = true;
} else if(c.ProtItem == true && c.getLevelForXP(c.playerXP[5]) > 24 && c.playerLevel[5] > 0) {
c.setClientConfig(91, 0);
c.ProtItem = false;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21233: // thick skin
if(c.playerLevel[5] == 0){
c.setClientConfig(83, 0);
c.DefPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.StrPrayer = 0;
}
if(c.DefPray != 1 && c.getLevelForXP(c.playerXP[5]) > 0 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.DefPray = 1;
c.praydrain = 4;
c.setClientConfig(86, 0);
c.setClientConfig(92, 0);
c.prayOn = true;
} else if(c.DefPray == 1 && c.getLevelForXP(c.playerXP[5]) > 0 && c.playerLevel[5] > 0) {
c.setClientConfig(83, 0);
c.DefPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21236: // rock skin
if(c.playerLevel[5] == 0){
c.setClientConfig(86, 0);
c.DefPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.StrPrayer = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 10){
c.setClientConfig(86, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 10 to use Rock Skin.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 10 to use this."); 
}
if(c.DefPray != 2 && c.getLevelForXP(c.playerXP[5]) > 9 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.DefPray = 2;
c.praydrain = 4;
c.setClientConfig(83, 0);
c.setClientConfig(92, 0);
c.prayOn = true;
} else if(c.DefPray == 2 && c.getLevelForXP(c.playerXP[5]) > 9 && c.playerLevel[5] > 0) {
c.setClientConfig(86, 0);
c.DefPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21242: // steel skin
if(c.playerLevel[5] == 0){
c.setClientConfig(92, 0);
c.DefPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.StrPrayer = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 28){
c.setClientConfig(92, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 28 to use Steel Skin.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 28 to use this."); 
}
if(c.DefPray != 3 && c.getLevelForXP(c.playerXP[5]) > 27 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.DefPray = 3;
c.praydrain = 4;
c.setClientConfig(83, 0);
c.setClientConfig(86, 0);
c.prayOn = true;
} else if(c.DefPray == 3 && c.getLevelForXP(c.playerXP[5]) > 27 && c.playerLevel[5] > 0) {
c.setClientConfig(92, 0);
c.DefPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21234: // burst of strength
if(c.playerLevel[5] == 0){
c.setClientConfig(84, 0);
c.StrPrayer = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 4){
c.setClientConfig(84, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 4 to use Burst of Strength.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 4 to use this."); 
}
if(c.StrPrayer != 1 && c.getLevelForXP(c.playerXP[5]) > 3 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.RangePray = 0;
c.MagePray = 0;
c.StrPrayer = 1;
c.praydrain = 4;
c.setClientConfig(87, 0);
c.setClientConfig(93, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.prayOn = true;
} else if(c.StrPrayer == 1 && c.getLevelForXP(c.playerXP[5]) > 3 && c.playerLevel[5] > 0) {
c.setClientConfig(84, 0);
c.StrPrayer = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21237: // superhuman strength
if(c.playerLevel[5] == 0){
c.setClientConfig(87, 0);
c.StrPrayer = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 13){
c.setClientConfig(87, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 13 to use Superhuman Strength.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 13 to use this."); 
}
if(c.StrPrayer != 2 && c.getLevelForXP(c.playerXP[5]) > 12 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.RangePray = 0;
c.MagePray = 0;
c.StrPrayer = 2;
c.praydrain = 4;
c.setClientConfig(84, 0);
c.setClientConfig(93, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.prayOn = true;
} else if(c.StrPrayer == 2 && c.getLevelForXP(c.playerXP[5]) > 12 && c.playerLevel[5] > 0) {
c.setClientConfig(87, 0);
c.StrPrayer = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21243: // ultimate strength
if(c.playerLevel[5] == 0){
c.setClientConfig(93, 0);
c.StrPrayer = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 31){
c.setClientConfig(93, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 31 to use Ultimate Strength.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 31 to use this."); 
}
if(c.StrPrayer != 3 && c.getLevelForXP(c.playerXP[5]) > 30 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.RangePray = 0;
c.MagePray = 0;
c.StrPrayer = 3;
c.praydrain = 4;
c.setClientConfig(84, 0);
c.setClientConfig(87, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.prayOn = true;
} else if(c.StrPrayer == 3 && c.getLevelForXP(c.playerXP[5]) > 30 && c.playerLevel[5] > 0) {
c.setClientConfig(93, 0);
c.StrPrayer = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21235: // clarity of thought
if(c.getLevelForXP(c.playerXP[5]) < 7 || c.playerLevel[5] == 0){
c.setClientConfig(85, 0);
c.AtkPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.StrPrayer = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 7){
c.setClientConfig(85, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 7 to use Clarity of Thought.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 7 to use this."); 
}
if(c.AtkPray != 1 && c.getLevelForXP(c.playerXP[5]) > 6 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.RangePray = 0;
c.MagePray = 0;
c.AtkPray = 1;
c.setClientConfig(88, 0);
c.setClientConfig(94, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.praydrain = 4;
c.prayOn = true;
} else if(c.AtkPray == 1 && c.getLevelForXP(c.playerXP[5]) > 6 && c.playerLevel[5] > 0) {
c.setClientConfig(85, 0);
c.AtkPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21239: //hawk eye
if(c.playerLevel[5] == 0){
c.setClientConfig(89, 0);
c.StrPrayer = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.DefPray = 0;
c.StrPrayer = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 19){
c.setClientConfig(89, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 19 to use Hawk Eye.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 19 to use this."); 
}
if(c.RangePray != 5 && c.getLevelForXP(c.playerXP[5]) > 18 && c.playerLevel[5] > 0)
{
c.StrPrayer = 0;
c.AtkPray = 0;
c.MagePray = 0;
c.Chivalry = false;
c.Piety = false;
    c.setClientConfig(84, 0);
    c.setClientConfig(87, 0);
    c.setClientConfig(90, 0);
    c.setClientConfig(93, 0);
    c.setClientConfig(85, 0);
    c.setClientConfig(88, 0);
    c.setClientConfig(94, 0);
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.RangePray = 5;
c.praydrain = 4;
c.prayOn = true;
} else if(c.RangePray == 5 && c.getLevelForXP(c.playerXP[5]) > 18 && c.playerLevel[5] > 0) {
c.setClientConfig(89, 0);
c.RangePray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21240: //mystic lore
if(c.playerLevel[5] == 0){
c.setClientConfig(90, 0);
c.StrPrayer = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 0;
c.DefPray = 0;
c.StrPrayer = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 22){
c.setClientConfig(90, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 22 to use Mystic lore.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 22 to use this."); 
}
if(c.MagePray != 5 && c.getLevelForXP(c.playerXP[5]) > 21 && c.playerLevel[5] > 0)
{
c.StrPrayer = 0;
c.AtkPray = 0;
c.RangePray = 0;
c.Chivalry = false;
c.Piety = false;
    c.setClientConfig(84, 0);
    c.setClientConfig(87, 0);
    c.setClientConfig(89, 0);
    c.setClientConfig(93, 0);
    c.setClientConfig(85, 0);
    c.setClientConfig(88, 0);
    c.setClientConfig(94, 0);
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.MagePray = 5;
c.praydrain = 4;
c.prayOn = true;
} else if(c.MagePray == 5 && c.getLevelForXP(c.playerXP[5]) > 21 && c.playerLevel[5] > 0) {
c.setClientConfig(90, 0);
c.MagePray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21238: // improved reflexes
if(c.playerLevel[5] == 0){
c.setClientConfig(88, 0);
c.AtkPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.StrPrayer = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 16){
c.setClientConfig(88, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 16 to use Improved Reflexes.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 16 to use this."); 
}
if(c.AtkPray != 2 && c.getLevelForXP(c.playerXP[5]) > 15 && c.playerLevel[5] > 0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 2;
c.praydrain = 4;
c.setClientConfig(85, 0);
c.setClientConfig(94, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.prayOn = true;
} else if(c.AtkPray == 2 && c.getLevelForXP(c.playerXP[5]) > 15 && c.playerLevel[5] > 0) {
c.setClientConfig(88, 0);
c.AtkPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21244: // incredible reflexes
if(c.playerLevel[5] == 0){
c.setClientConfig(94, 0);
c.AtkPray = 0;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.Chivalry || c.Piety){
c.Chivalry = false;
c.Piety = false;
c.StrPrayer = 0;
c.DefPray = 0;
}
if(c.getLevelForXP(c.playerXP[5]) < 34){
c.setClientConfig(94, 0);
//c.checkHead();
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 34 to use Incredible Reflexes.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 34 to use this."); 
}
if(c.AtkPray != 3 && c.getLevelForXP(c.playerXP[5]) > 33 && c.playerLevel[5] >  0)
{
c.setClientConfig(101, 0);
c.setClientConfig(102, 0);
c.Chivalry = false;
c.Piety = false;
c.AtkPray = 3;
c.praydrain = 4;
c.setClientConfig(85, 0);
c.setClientConfig(88, 0);
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.prayOn = true;
} else if(c.AtkPray == 3 && c.getLevelForXP(c.playerXP[5]) > 33 && c.playerLevel[5] > 0) {
c.setClientConfig(94, 0);
c.AtkPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21245: // Protect From Magic
if(c.playerLevel[5] == 0){
    c.setClientConfig(95, 0);
c.ProtMage = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 37){
c.setClientConfig(95, 0);
c.sendFrame126("You need a @blu@Prayer level of 37 to use Protect from Magic.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 37 to use this."); 
}
if(c.ProtMage == false && c.getLevelForXP(c.playerXP[5]) > 36 && c.playerLevel[5] > 0)
{
c.ProtMage = true;
c.ProtMelee = false;
c.ProtRange = false;
c.Retribution = false;
c.Redemption = false;
c.Smite = false;
c.praydrain = 4;
    c.setClientConfig(96, 0);
    c.setClientConfig(97, 0);
    c.setClientConfig(98, 0);
    c.setClientConfig(99, 0);
    c.setClientConfig(100, 0);
c.getHead();
c.prayOn = true;
} else if(c.ProtMage == true && c.getLevelForXP(c.playerXP[5]) > 36 && c.playerLevel[5] > 0) {
    c.setClientConfig(95, 0);
c.ProtMage = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21246: // Protect From Range
if(c.playerLevel[5] == 0){
    c.setClientConfig(96, 0);
c.ProtRange = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 40){
c.setClientConfig(96, 0);
c.sendFrame126("You need a @blu@Prayer level of 40 to use Protect from Range.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 40 to use this."); 
}
if(c.ProtRange == false && c.getLevelForXP(c.playerXP[5]) > 39 && c.playerLevel[5] > 0)
{
c.headIcon = 2;
c.ProtRange = true;
c.ProtMage = false;
c.ProtMelee = false;
c.Retribution = false;
c.Redemption = false;
c.Smite = false;
c.praydrain = 4;
    c.setClientConfig(95, 0);
    c.setClientConfig(97, 0);
    c.setClientConfig(98, 0);
    c.setClientConfig(99, 0);
    c.setClientConfig(100, 0);
c.getHead();
c.prayOn = true;
} else if(c.ProtRange == true && c.getLevelForXP(c.playerXP[5]) > 39 && c.playerLevel[5] > 0) {
    c.setClientConfig(96, 0);
c.ProtRange = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 21247: // Protect From Melee
if(c.playerLevel[5] == 0){
    c.setClientConfig(97, 0);
c.ProtMelee = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 43){
c.setClientConfig(97, 0);
c.sendFrame126("You need a @blu@Prayer level of 43 to use Protect from Melee.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 43 to use this."); 
}
if(c.ProtMelee == false && c.getLevelForXP(c.playerXP[5]) > 42 && c.playerLevel[5] > 0)
{
c.headIcon = 1;
c.ProtMelee = true;
c.ProtMage = false;
c.ProtRange = false;
c.Retribution = false;
c.Redemption = false;
c.Smite = false;
c.praydrain = 4;
    c.setClientConfig(95, 0);
    c.setClientConfig(96, 0);
    c.setClientConfig(98, 0);
    c.setClientConfig(99, 0);
    c.setClientConfig(100, 0);
c.prayOn = true;
c.getHead();
} else if(c.ProtMelee == true && c.getLevelForXP(c.playerXP[5]) > 42 && c.playerLevel[5] > 0) {
c.setClientConfig(97, 0);
c.ProtMelee = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 2171: //c.Retribution
if(c.playerLevel[5] == 0){
    c.setClientConfig(98, 0);
c.Retribution = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 46){
c.setClientConfig(98, 0);
c.sendFrame126("You need a @blu@Prayer level of 46 to use Retribution.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 46 to use this."); 
}
if(c.Retribution == false && c.getLevelForXP(c.playerXP[5]) > 45 && c.playerLevel[5] > 0)
{
c.headIcon = 8;
c.ProtMelee = false;
c.ProtMage = false;
c.ProtRange = false;
c.Retribution = true;
c.Redemption = false;
c.Smite = false;
c.praydrain = 50;
    c.setClientConfig(95, 0);
    c.setClientConfig(96, 0);
    c.setClientConfig(97, 0);
    c.setClientConfig(99, 0);
    c.setClientConfig(100, 0);
c.prayOn = true;
c.getHead();
} else if(c.Retribution == true && c.getLevelForXP(c.playerXP[5]) > 45 && c.playerLevel[5] > 0) {
    c.setClientConfig(98, 0);
c.Retribution = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 2172: //redemption
if(c.playerLevel[5] == 0){
    c.setClientConfig(99, 0);
c.Redemption = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 49){
c.setClientConfig(99, 0);
c.sendFrame126("You need a @blu@Prayer level of 49 to use Redemption.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 49 to use this."); 
}
if(c.Redemption == false && c.getLevelForXP(c.playerXP[5]) > 48 && c.playerLevel[5] > 0)
{
c.headIcon = 32;
c.ProtMelee = false;
c.ProtMage = false;
c.ProtRange = false;
c.Retribution = false;
c.Redemption = true;
c.Smite = false;
c.praydrain = 50;
    c.setClientConfig(95, 0);
    c.setClientConfig(96, 0);
    c.setClientConfig(97, 0);
    c.setClientConfig(98, 0);
    c.setClientConfig(100, 0);
c.prayOn = true;
c.getHead();
} else if(c.Redemption == true && c.getLevelForXP(c.playerXP[5]) > 48 && c.playerLevel[5] > 0) {
    c.setClientConfig(99, 0);
c.Redemption = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 2173: //Smite
if(c.playerLevel[5] == 0){
c.setClientConfig(100, 0);
c.Smite = false;
c.checkHead();
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 52){
c.setClientConfig(100, 0);
c.Smite = false;
c.headIcon = 0;
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 52 to use Smite.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 52 to use this."); 
}
if(c.Smite == false && c.getLevelForXP(c.playerXP[5]) > 51 && c.playerLevel[5] > 0)
{
c.headIcon = 16;
c.Smite = true;
c.ProtMelee = false;
c.ProtMage = false;
c.ProtRange = false;
c.Retribution = false;
c.Redemption = false;
c.praydrain = 4;
    c.setClientConfig(95, 0);
    c.setClientConfig(96, 0);
    c.setClientConfig(97, 0);
    c.setClientConfig(98, 0);
    c.setClientConfig(99, 0);
c.prayOn = true;
c.getHead();
} else if(c.Smite == true && c.getLevelForXP(c.playerXP[5]) > 51 && c.playerLevel[5] > 0) {
    c.setClientConfig(100, 0);
c.Smite = false;
c.checkHead();
c.praydrain = 0;
c.prayOn = false;
}
break;
case 74096: //Chivalry
if(c.playerLevel[5] == 0){
c.setClientConfig(101, 0);
c.Chivalry = false;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 60){
c.setClientConfig(101, 0);
c.Chivalry = false;
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 60 to use Chivalry.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 60 and a Defence level of 65 to use this."); 
}
if(c.getLevelForXP(c.playerXP[1]) < 65){
c.sM("You must have 65 defence to use this prayer.");
c.setClientConfig(101, 0);
}
/*if(c.q9 != 15){
c.sM("You must have finished Knight's Legend to use this prayer.");
c.setClientConfig(101, 0);
break;
}*/
if(c.Chivalry == false && c.getLevelForXP(c.playerXP[5]) > 59 && c.playerLevel[5] > 0)
{
c.Piety = false;
c.Chivalry = true;
c.StrPrayer = 5;
c.AtkPray = 7;
c.DefPray = 7; 
c.RangePray = 0;
c.MagePray = 0;
c.praydrain = 4;
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.setClientConfig(83, 0);
c.setClientConfig(86, 0);
c.setClientConfig(92, 0);
c.setClientConfig(84, 0);
c.setClientConfig(87, 0);
c.setClientConfig(93, 0);
c.setClientConfig(85, 0);
c.setClientConfig(88, 0);
c.setClientConfig(94, 0);
c.setClientConfig(102, 0);
c.prayOn = true;
} else if(c.Chivalry == true && c.getLevelForXP(c.playerXP[5]) > 59 && c.playerLevel[5] > 0) {
c.setClientConfig(101, 0);
c.Chivalry = false;
c.AtkPray = 0;
c.StrPrayer = 0;
c.DefPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
case 74102: //Piety
if(c.playerLevel[5] == 0){
c.setClientConfig(102, 0);
c.Piety = false;
c.prayOn = false;
c.sM("You need to recharge your Prayer at an altar.");
}
if(c.getLevelForXP(c.playerXP[5]) < 70){
c.setClientConfig(102, 0);
c.Piety = false;
c.prayOn = false;
c.sendFrame126("You need a @blu@Prayer level of 70 to use Piety.", 357);
c.sendFrame164(356);
c.sM("You need a Prayer level of 70 to use this."); 
}
if(c.Piety == false && c.getLevelForXP(c.playerXP[5]) > 69 && c.playerLevel[5] > 0)
{
c.Chivalry = false;
c.Piety = true;
c.StrPrayer = 7;
c.AtkPray = 10;
c.DefPray = 10; 
c.RangePray = 0;
c.MagePray = 0;
c.praydrain = 4;
c.setClientConfig(89, 0);
c.setClientConfig(90, 0);
c.setClientConfig(83, 0);
c.setClientConfig(86, 0);
c.setClientConfig(92, 0);
c.setClientConfig(84, 0);
c.setClientConfig(87, 0);
c.setClientConfig(93, 0);
c.setClientConfig(85, 0);
c.setClientConfig(88, 0);
c.setClientConfig(94, 0);
c.setClientConfig(101, 0);
c.prayOn = true;
} else if(c.Piety == true && c.getLevelForXP(c.playerXP[5]) > 69 && c.playerLevel[5] > 0) {
c.setClientConfig(102, 0);
c.Piety = false;
c.AtkPray = 0;
c.StrPrayer = 0;
c.DefPray = 0;
c.praydrain = 0;
c.prayOn = false;
}
break;
			
			
			case 26076:
				// frame36(6575, 1);
				break;
			case 53245:
				// frame36(13813, 1);
				break;

			case 34185:
			case 34184:
				// vamps
			case 34183:
			case 34182:
			case 34189:
				// chaps
			case 34188:
			case 34187:
			case 34186:
			case 34193:
			case 34192:
			case 34191:
			case 34190:
				c.startHideCraft(c.actionButtonId);
				break;
			case 33187:
				// armor
			case 33186:
			case 33185:
			case 33190:
				// gloves
			case 33189:
			case 33188:
			case 33193:
				// boots
			case 33192:
			case 33191:
			case 33196:
				// vamps
			case 33195:
			case 33194:
			case 33199:
				// chaps
			case 33198:
			case 33197:
			case 33202:
				// coif
			case 33201:
			case 33200:
			case 33205:
				// cowl
			case 33204:
			case 33203:
				c.startCraft(c.actionButtonId);
				break;
			case 9118:
			case 19022:
				c.closeInterface();
				break;
			case 57225:
				c.startTan(1, 0);
				break;
			case 57217:
				c.startTan(5, 0);
				break;
			case 57209:
				c.startTan(27, 0);
				break;
			case 57201:
				c.startTan(27, 0);
				break;
			case 57229:
				c.startTan(1, 1);
				break;
			case 57221:
				c.startTan(5, 1);
				break;
			case 57213:
				c.startTan(27, 1);
				break;
			case 57205:
				c.startTan(27, 1);
				break;
			case 57227:
				c.startTan(1, 2);
				break;
			case 57219:
				c.startTan(5, 2);
				break;
			case 57211:
			case 57203:
				c.startTan(27, 2);
				break;
			case 57228:
				c.startTan(1, 3);
				break;
			case 57220:
				c.startTan(5, 3);
				break;
			case 57212:
			case 57204:
				c.startTan(27, 3);
				break;
			case 57231:
				c.startTan(1, 4);
				break;
			case 57223:
				c.startTan(5, 4);
				break;
			case 57215:
			case 57207:
				c.startTan(27, 4);
				break;
			case 57232:
				c.startTan(1, 5);
				break;
			case 57224:
				c.startTan(5, 5);
				break;
			case 57216:
			case 57208:
				c.startTan(27, 5);
				break;
			case 34170:
				c.fletchBow(true, 1);
				break;
			case 34169:
				c.fletchBow(true, 5);
				break;
			case 34168:
				c.fletchBow(true, 10);
				break;
			case 34167:
				c.fletchBow(true, 27);
				break;
			case 34174:
				c.fletchBow(false, 1);
				break;
			case 34173:
				c.fletchBow(false, 5);
				break;
			case 34172:
				c.fletchBow(false, 10);
				break;
			case 34171:
				c.fletchBow(false, 27);
				break;
			case 10252:
c.addSkillXP(1000000, 0);
break;
			case 11000:
c.addSkillXP(1000000, 1);
break;

			case 10253:
c.addSkillXP(1000000, 2);
break;
			case 11001:
c.addSkillXP(1000000, 3);
break;

			case 10254:
c.addSkillXP(1000000, 4);
break;
			case 10255:
c.addSkillXP(1000000, 6);
break;



			case 11002:
			case 11011:
			case 11013:
			case 11014:
			case 11010:
			case 11012:
			case 11006:
			case 11009:
			case 11008:
			case 11004:
			case 11003:
			case 11005:
			case 47002:
			case 54090:
			case 11007:
				if (c.randomed && (c.actionButtonId == c.statId[c.random_skill])) {
					c.randomed = false;
					c.closeInterface();
				}
				break;
			case 14067:
				c.setAppearanceUpdateRequired(true);
				c.updateRequired = true;
				c.closeInterface();
				c.RemoveAllWindows();
				break;

			case 153:
				if (c.playerEnergy > 0) {
					c.isRunning2 = true;
					c.isRunning = true;
				}
				break;
			case 74192:
				if (c.playerEnergy > 0) {
					if(c.isRunning2 && c.isRunning){
						c.isRunning2 = false;
						c.isRunning = false;
					} else {
						c.isRunning2 = true;
						c.isRunning = true;
					}
				}
				break;
			case 74184:
				if (c.splitChat == 0) {
					c.splitChat = 1;
				}  else if (c.splitChat == 1)
				{
					c.splitChat = 0;
				}
			break;
			case 152:
				c.isRunning2 = false;
				c.isRunning = false;
				break;

			case 130:
				// close interface
				c.println_debug("Closing Interface");
				break;
			case 33018:
				// jab (hally)
			case 9125:
				// Accurate
			case 22228:
				// punch (unarmed)
			case 48010:
				// flick (whip)
			case 21200:
				// spike (pickaxe)
			case 1080:
				// bash (staff)
			case 6168:
				// chop (axe)
			case 6236:
				// accurate (long bow)
			case 17102:
				// accurate (darts)
			case 8234:
				// stab (dagger)
				c.FightType = 1;
				c.SkillID = 0;
				break;

			case 9126:
				// Defensive
			case 48008:
				// deflect (whip)
			case 22229:
				// block (unarmed)
			case 21201:
				// block (pickaxe)
			case 1078:
				// focus - block (staff)
			case 6169:
				// block (axe)
			case 18078:
				// block (spear)
			case 8235:
				// block (dagger)
				c.FightType = 4;
				c.SkillID = 1;
				break;
			case 33019:
				// fend (hally)
			case 9127:
				// Controlled
			case 48009:
				// lash (whip)
			case 6234:
				// longrange (long bow)
			case 18077:
				// lunge (spear)
			case 18080:
				// swipe (spear)
			case 18079:
				// pound (spear)
			case 17100:
				// longrange (darts)
				c.FightType = 3;
				c.SkillID = 3;
				break;

			case 9128:
				// Aggressive
			case 22230:
				// kick (unarmed)
			case 21203:
				// impale (pickaxe)
			case 21202:
				// smash (pickaxe)
			case 1079:
				// pound (staff)
			case 6171:
				// hack (axe)
			case 6170:
				// smash (axe)
			case 33020:
				// swipe (hally)
			case 6235:
				// rapid (long bow)
			case 17101:
				// repid (darts)
			case 8237:
				// lunge (dagger)
			case 8236:
				// slash (dagger)
				c.FightType = 2;
				c.SkillID = 2;
				break;

			case 21011:
				c.takeAsNote = false;
				break;

			case 21010:
				c.takeAsNote = true;
				break;


			case 13092:
				if (System.currentTimeMillis() - c.lastButton < 400) {
					c.lastButton = System.currentTimeMillis();
					c.sM("@or1@please wait...");
					break;
				} else {
					c.lastButton = System.currentTimeMillis();
				}
				if (c.inTrade && !c.tradeConfirmed) {
					c.lastButton = System.currentTimeMillis();
					Client other = c.getClient(c.trade_reqId);
					c.tradeConfirmed = true;
					if (other.tradeConfirmed) {
						c.confirmScreen();
						other.confirmScreen();
						break;
					}
					c.sendFrame126("Waiting for other player...", 3431);
					if (c.validClient(c.trade_reqId)) {
						other.sendFrame126("Other player has accepted", 3431);
					}
				}
				break;

			case 13218:
				Client other = c.getClient(c.trade_reqId);
				if (!c.validClient(c.trade_reqId))
					break;
				if (System.currentTimeMillis() - c.lastButton < 1000) {
					c.lastButton = System.currentTimeMillis();
					break;
				} else {
					c.lastButton = System.currentTimeMillis();
				}
				c.lastButton = System.currentTimeMillis();
				if (c.inTrade && c.tradeConfirmed && other.tradeConfirmed
						&& !c.tradeConfirmed2) {
					c.lastButton = System.currentTimeMillis();
					c.tradeConfirmed2 = true;
					c.actionInterval = 10000;
					c.lastAction = System.currentTimeMillis();
					if (other.tradeConfirmed2) {
						c.giveItems();
						other.giveItems();
						c.savegame(false);
						other.savegame(false);
						c.sM("Accepted trade.");
						other.sM("Accepted trade.");
						break;
					}
					other.sendQuest("Other player has accepted.", 3535);
					c.sendQuest("Waiting for other player...", 3535);
				}
				break;

case 1097:
	    if (c.playerEquipment[c.playerWeapon] == 13647)
			{
			c.interfaceEffect = 2;
		    c.clearQuestInterface();
		    c.sendFrame126("Normal Magics", 2494);
		    c.sendFrame126("", 2495);
		    c.sendFrame126("Lunar Magics", 2496);
		    c.sendFrame126("", 2497);
		    c.sendFrame126("Ancient Magics", 2498);
		    c.sendQuestSomething(8143);
			c.sendFrame164(2492);
			c.flushOutStream();
			}
		if(c.playerAncientMagics == 0 && c.playerEquipment[c.playerWeapon] == 4675)
	    {
		c.sM("You cannot auto cast normal magics with an ancient staff!");
		break;
	    }
	    if(c.playerAncientMagics == 1 && c.playerEquipment[c.playerWeapon] != 4675 && c.playerEquipment[c.playerWeapon] != 13647)
	    {
		c.sM("You cannot auto cast ancient magics with a regular staff!");
		break;
	    }
	    if(c.playerAncientMagics == 2)
	    {
		c.sM("You cannot auto cast lunar magics");
		break;
	    }
		if(c.playerEquipment[c.playerWeapon] == 4675)
            {
                c.setSidebarInterface(0, 1689);
            } else if(c.playerEquipment[c.playerWeapon] != 13647)
            {
                c.setSidebarInterface(0, 1829);
            }
break;

case 1093:
if(c.autocastID == 0){
c.sM("You must choose a spell first.");
break;
}
if(!c.autocasting){
c.autocasting = true;
c.setClientConfig(108, 1);
break;
}
if(c.autocasting){
c.autocasting = false;
c.setClientConfig(108, 0);
break;
}
break;


        case 51133: 
            c.autocastID = 12939;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51185: 
            c.autocastID = 12987;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51091: 
            c.autocastID = 12901;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 24018: 
            c.autocastID = 12861;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51159: 
            c.autocastID = 12963;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51211: 
            c.autocastID = 13011;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51111: 
            c.autocastID = 12919;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51069: 
            c.autocastID = 12881;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51146: 
            c.autocastID = 12951;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51198: 
            c.autocastID = 12999;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51102: 
            c.autocastID = 12911;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51058: 
            c.autocastID = 12871;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51172: 
            c.autocastID = 12975;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51224: 
            c.autocastID = 13023;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51122: 
            c.autocastID = 12929;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 51080: 
            c.autocastID = 12891;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7038: 
            c.autocastID = 1152;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7039: 
            c.autocastID = 1154;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7040: 
            c.autocastID = 1156;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7041: 
            c.autocastID = 1158;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7042: 
            c.autocastID = 1160;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7043: 
            c.autocastID = 1163;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7044: 
            c.autocastID = 1166;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7045: 
            c.autocastID = 1169;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7046: 
            c.autocastID = 1172;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7047: 
            c.autocastID = 1175;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7048: 
            c.autocastID = 1177;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7049: 
            c.autocastID = 1181;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7050: 
            c.autocastID = 1183;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7051: 
            c.autocastID = 1185;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7052: 
            c.autocastID = 1188;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 7053: 
            c.autocastID = 1189;
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;

        case 24017: 
	    c.sendFrame246(329, 200, c.playerEquipment[c.playerWeapon]);
	    c.setSidebarInterface(0, 328);
            break;
}
}
}
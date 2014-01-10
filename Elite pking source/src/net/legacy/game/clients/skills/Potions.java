package net.legacy.game.clients.skills;

import net.legacy.*;
import net.legacy.game.clients.*;
import net.legacy.game.clients.packets.impl.MagicHandler;
import net.legacy.game.items.*;
import net.legacy.game.npcs.*;
import net.legacy.game.objects.*;
import net.legacy.game.world.*;
import net.legacy.game.*;
import net.legacy.utilities.*;

public class Potions {
	public void buryItem(int item, int slot, int ID) {
		boolean used = true;
		Client c = (Client) Server.playerHandler.players[ID];
		if (item != c.playerItems[slot] - 1){
			return;
		}
		if (c.playerHasItem(item)) {
			switch (item) {
			case 5509:
				c.fillSmallPouch();
				break;
			case 5510:
				c.fillMediumPouch();
				break;
			case 5512:
				c.fillLargePouch();
				break;
			case 5514:
				c.fillGiantPouch();
				break;
			case 4155:
				c.slayerGem();
				break; 
case 3695:
c.sM("You stroke fred.");
c.pEmote = 1333;			
				break;
case 7498:
c.showInterface(2808);
break;
			case 7060:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the tuna potato");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(7060, slot, 1);
				c.currentHealth += 16;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;
			case 4049:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();	
				c.currentHealth += 10;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				c.deleteItem(4049, slot, 1);
				break;
			case 526:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.prayerMessage(50,526);
				break;
			case 532:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.prayerMessage(150,532);
				break;
			case 536:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.prayerMessage(200,536);
				break;
			case 1961:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the easter egg.");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(1961, slot, 1);
				c.currentHealth += 22;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;
			case 315:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the shrimps.");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(315, slot, 1);
				c.currentHealth += 5;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;
			case 379:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the lobster.");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(379, slot, 1);
				c.currentHealth += 12;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;
			case 385:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the shark.");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(385, slot, 1);
				c.currentHealth += 20;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;
			case 397:
				c.sM("Please buy sharks from the pk shop");
				break;
			case 391:
				if (System.currentTimeMillis() - c.foodDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				//c.playSound(317, 000, 020);
				c.sM("You eat the manta ray.");
				if(c.currentHealth < c.playerLevel[c.playerHitpoints]){
				c.sM("It heals some health.");
				}
				c.deleteItem(391, slot, 1);
				
				c.currentHealth += 22;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
				c.sendQuest("" + c.currentHealth + "", 4016);
				break;

case 2858:
c.deleteItem(2858,1);
c.addItem(Item.randomClue(), 1);
c.addItem(Item.randomClue(), 1);
c.addItem(Item.randomClue(), 1);
c.addItem(Item.randomClue(), 1);
				c.showInterface(6960);
				c.itemOnInterface(6963, Item.randomClue(),0,1);
				c.itemOnInterface(6963, Item.randomClue(),1,1);
				c.itemOnInterface(6963, Item.randomClue(),2,1);
				c.itemOnInterface(6963, Item.randomClue(),3,1);
break;

case 952://spade
if(c.absX >= 3554 && c.absX <= 3559 && c.absY >= 3295 && c.absY <= 3300){//start of barrows
c.toX = 3578;
c.toY = 9706;
c.heightLevel = 3;
}
if(c.absX >= 3573 && c.absX <= 3577 && c.absY >= 3295 && c.absY <= 3300){
c.toX = 3556;
c.toY = 9718;
c.heightLevel = 3;
}
if(c.absX >= 3563 && c.absX <= 3567 && c.absY >= 3286 && c.absY <= 3290){
c.toX = 3557;
c.toY = 9703;
c.heightLevel = 3;
}
if(c.absX >= 3552 && c.absX <= 3555 && c.absY >= 3280 && c.absY <= 3284){
c.toX = 3568;
c.toY = 9683;
c.heightLevel = 3;
}
if(c.absX >= 3564 && c.absX <= 3567 && c.absY >= 3273 && c.absY <= 3277){
c.toX = 3546;
c.toY = 9684;
c.heightLevel = 3;
}
if(c.absX >= 3575 && c.absX <= 3579 && c.absY >= 3279 && c.absY <= 3284){//end of barrows
c.toX = 3534;
c.toY = 9704;
c.heightLevel = 3;
} 
if(c.absX >= 2539 && c.absX <= 2551 && c.absY >= 3096 && c.absY <=3108){
c.toX = 2602;
c.toY = 9479;
}
if(c.q4 == 1 && c.absX == 3084 && c.absY == 3362 || c.q4 == 1 && c.absX == 3085 && c.absY == 3362 || c.q4 == 1 && c.absX == 3086 && c.absY == 3362 || c.q4 == 1 && c.absX == 3086 && c.absY == 3361 || c.q4 == 1 && c.absX == 3086 && c.absY == 3360 || c.q4 == 1 && c.absX == 3086 && c.absY == 3359 || c.q4 == 1 && c.absX == 3085 && c.absY == 3359 || c.q4 == 1 && c.absX == 3084 && c.absY == 3359){
c.sM("You have found a key!");
c.addItem(983, 1);
}
if(c.absX == 2728 && c.absY == 3493 && c.playerHasItem(2856)){
c.deleteItem(2856, c.getItemSlot(2856), 1);
c.addItem(2830, 1);
c.sM("You find a casket!");
}
if(c.absX == 2490 && c.absY == 10141 && c.playerHasItem(2857)){
c.deleteItem(2857, c.getItemSlot(2857), 1);
c.addItem(2830, 1);
c.sM("You find a casket!");
}
if(c.absX == 3425 && c.absY == 3540 && c.playerHasItem(2858)){
c.deleteItem(2858, c.getItemSlot(2858), 1);
c.addItem(2830, 1);
c.sM("You find a casket!");
}
c.sM("You dig..");
c.tTime13 = System.currentTimeMillis();
c.digging = true;
c.pEmote = 831;
//c.resetAnimation();
//c.pEmote = 831;
break;
case 2830:
	int reward = Item.randomClue();
	c.deleteItem(2830,1);
	c.addItem(reward, 1);
	c.showInterface(6960);
	c.itemOnInterface(6963,reward,0,1);
	c.itemOnInterface(6963,-1,1,1);
break;
			case 3040:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the magic potion.");
				c.sM("You have 3 doses of potion left.");
c.deleteItem(3040, slot, 1);
c.addItem(3042, 1);
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]) + 4;
c.sendQuest("" + c.playerLevel[6] + "", 4014);
c.magePotTimer = 60;
				if (c.playerLevel[6] > c.playerLevel[c.playerMagic])
					c.playerLevel[6] = c.playerLevel[6] += 4;
				c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 3042:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the magic potion.");
				c.sM("You have 2 doses of potion left.");
c.deleteItem(3042, slot, 1);
c.addItem(3044, 1);
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]) + 4;
c.sendQuest("" + c.playerLevel[6] + "", 4014);
c.magePotTimer = 60;
				if (c.playerLevel[6] > c.playerLevel[c.playerMagic])
					c.playerLevel[6] = c.playerLevel[6] += 4;
				c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 3044:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the magic potion.");
				c.sM("You have 1 dose of potion left.");
c.deleteItem(3044, slot, 1);
c.addItem(3046, 1);
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]) + 4;
c.sendQuest("" + c.playerLevel[6] + "", 4014);
c.magePotTimer = 60;
				if (c.playerLevel[6] > c.playerLevel[c.playerMagic])
					c.playerLevel[6] = c.playerLevel[6] += 4;
				c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 3046:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the magic potion.");
				c.sM("You have finished your potion.");
c.deleteItem(3046, slot, 1);
c.addItem(229, 1);
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]) + 4;
c.sendQuest("" + c.playerLevel[6] + "", 4014);
c.magePotTimer = 60;
				if (c.playerLevel[6] > c.playerLevel[c.playerMagic])
					c.playerLevel[6] = c.playerLevel[6] += 4;
				c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 2446:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the antipoison potion.");
				c.sM("You have 3 doses of potion left.");
c.deleteItem(2446, slot, 1);
c.addItem(175, 1);
c.poisoned = false;
c.poisonDmg = false;
break;
			case 175:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the antipoison potion.");
				c.sM("You have 2 doses of potion left.");
c.deleteItem(175, slot, 1);
c.addItem(177, 1);
c.poisoned = false;
c.poisonDmg = false;
break;
			case 177:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the antipoison potion.");
				c.sM("You have 1 dose of potion left.");
c.deleteItem(177, slot, 1);
c.addItem(179, 1);
c.poisoned = false;
c.poisonDmg = false;
break;
			case 179:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the antipoison potion.");
				c.sM("You have finished your potion.");
c.deleteItem(179, slot, 1);
c.addItem(229, 1);
c.poisoned = false;
c.poisonDmg = false;
break;
			case 3024:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the restore potion.");
				c.sM("You have 3 doses of the potion left.");
if (c.playerLevel[0] < c.getLevelForXP(c.playerXP[0])){
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
}
if (c.playerLevel[1] < c.getLevelForXP(c.playerXP[1])){
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
}
if (c.playerLevel[2] < c.getLevelForXP(c.playerXP[2])){
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
}
if (c.playerLevel[3] < c.getLevelForXP(c.playerXP[3])){
c.playerLevel[3] = c.getLevelForXP(c.playerXP[3]);
}
if (c.playerLevel[4] < c.getLevelForXP(c.playerXP[4])){
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
}
if (c.playerLevel[6] < c.getLevelForXP(c.playerXP[6])){
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]);
}
c.prayerRestore();
c.deleteItem(3024, slot, 1);
c.addItem(3026, 1);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
break;
			case 3026:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the restore potion.");
				c.sM("You have 2 doses of the potion left.");
if (c.playerLevel[0] < c.getLevelForXP(c.playerXP[0])){
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
}
if (c.playerLevel[1] < c.getLevelForXP(c.playerXP[1])){
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
}
if (c.playerLevel[2] < c.getLevelForXP(c.playerXP[2])){
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
}
if (c.playerLevel[3] < c.getLevelForXP(c.playerXP[3])){
c.playerLevel[3] = c.getLevelForXP(c.playerXP[3]);
}
if (c.playerLevel[4] < c.getLevelForXP(c.playerXP[4])){
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
}
if (c.playerLevel[6] < c.getLevelForXP(c.playerXP[6])){
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]);
}
c.prayerRestore();
c.deleteItem(3026, slot, 1);
c.addItem(3028, 1);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
break;
			case 3028:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the restore potion.");
				c.sM("You have 1 dose of the potion left.");
if (c.playerLevel[0] < c.getLevelForXP(c.playerXP[0])){
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
}
if (c.playerLevel[1] < c.getLevelForXP(c.playerXP[1])){
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
}
if (c.playerLevel[2] < c.getLevelForXP(c.playerXP[2])){
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
}
if (c.playerLevel[3] < c.getLevelForXP(c.playerXP[3])){
c.playerLevel[3] = c.getLevelForXP(c.playerXP[3]);
}
if (c.playerLevel[4] < c.getLevelForXP(c.playerXP[4])){
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
}
if (c.playerLevel[6] < c.getLevelForXP(c.playerXP[6])){
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]);
}
c.prayerRestore();
c.deleteItem(3028, slot, 1);
c.addItem(3030, 1);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
break;
			case 3030:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the restore potion.");
				c.sM("You have finished your potion.");
if (c.playerLevel[0] < c.getLevelForXP(c.playerXP[0])){
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
}
if (c.playerLevel[1] < c.getLevelForXP(c.playerXP[1])){
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
}
if (c.playerLevel[2] < c.getLevelForXP(c.playerXP[2])){
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
}
if (c.playerLevel[3] < c.getLevelForXP(c.playerXP[3])){
c.playerLevel[3] = c.getLevelForXP(c.playerXP[3]);
}
if (c.playerLevel[4] < c.getLevelForXP(c.playerXP[4])){
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
}
if (c.playerLevel[6] < c.getLevelForXP(c.playerXP[6])){
c.playerLevel[6] = c.getLevelForXP(c.playerXP[6]);
}
c.prayerRestore();
c.deleteItem(3030, slot, 1);
c.addItem(229, 1);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[5] + "", 4012);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
break;
			case 6685:
			          for(int i = 0; i < 21; i++) {
					  if(c.playerLevel[i] <= 0) {
					  c.sM("Your stats are to low to drink this!");
					  return;
					  } 
					  }
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the foul liquid.");
				c.sM("You have 3 doses of potion left.");
c.deleteItem(6685, slot, 1);
c.addItem(6687, 1);
c.currentHealth += 16;
c.playerLevel[0] -= 5;
c.playerLevel[1] -= 5;
c.playerLevel[2] -= 5;
c.playerLevel[4] -= 5;
c.playerLevel[6] -= 5;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
c.sendQuest("" + c.currentHealth + "", 4016);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.sendQuest("" + c.playerLevel[0] + "", 4004);
c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 6687:
			          for(int i = 0; i < 21; i++) {
					  if(c.playerLevel[i] <= 0) {
					  c.sM("Your stats are to low to drink this!");
					  return;
					  } 
					  }
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the foul liquid.");
				c.sM("You have 2 doses of potion left.");
c.deleteItem(6687, slot, 1);
c.addItem(6689, 1);
c.currentHealth += 16;
c.playerLevel[0] -= 5;
c.playerLevel[1] -= 5;
c.playerLevel[2] -= 5;
c.playerLevel[4] -= 5;
c.playerLevel[6] -= 5;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
c.sendQuest("" + c.currentHealth + "", 4016);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.sendQuest("" + c.playerLevel[0] + "", 4004);
c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 6689:
			          for(int i = 0; i < 21; i++) {
					  if(c.playerLevel[i] <= 0) {
					  c.sM("Your stats are to low to drink this!");
					  return;
					  } 
					  }
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the foul liquid.");
				c.sM("You have 1 dose of potion left.");
c.deleteItem(6689, slot, 1);
c.addItem(6691, 1);
c.currentHealth += 16;
c.playerLevel[0] -= 5;
c.playerLevel[1] -= 5;
c.playerLevel[2] -= 5;
c.playerLevel[4] -= 5;
c.playerLevel[6] -= 5;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
c.sendQuest("" + c.currentHealth + "", 4016);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.sendQuest("" + c.playerLevel[0] + "", 4004);
c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 6691:
			          for(int i = 0; i < 21; i++) {
					  if(c.playerLevel[i] <= 0) {
					  c.sM("Your stats are to low to drink this!");
					  return;
					  } 
					  }
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of the foul liquid.");
				c.sM("You have finished your potion.");
c.deleteItem(6691, slot, 1);
c.addItem(229, 1);
c.currentHealth += 16;
c.playerLevel[0] -= 5;
c.playerLevel[1] -= 5;
c.playerLevel[2] -= 5;
c.playerLevel[4] -= 5;
c.playerLevel[6] -= 5;
				if (c.currentHealth > c.playerLevel[c.playerHitpoints])
					c.currentHealth = c.playerLevel[c.playerHitpoints];
c.sendQuest("" + c.currentHealth + "", 4016);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.sendQuest("" + c.playerLevel[1] + "", 4008);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.sendQuest("" + c.playerLevel[0] + "", 4004);
c.sendQuest("" + c.playerLevel[6] + "", 4014);
break;
			case 2434:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of your restore prayer potion.");
				c.sM("You have 3 doses of potion left.");
c.deleteItem(2434, slot, 1);
c.addItem(139, 1);
c.prayerRestore();
c.sendQuest("" + c.playerLevel[5] + "", 4012);
break;
			case 139:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of your restore prayer potion.");
				c.sM("You have 2 doses of potion left.");
c.deleteItem(139, slot, 1);
c.addItem(141, 1);
c.prayerRestore();
c.sendQuest("" + c.playerLevel[5] + "", 4012);
break;
			case 141:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of your restore prayer potion.");
				c.sM("You have 1 dose of potion left.");
c.deleteItem(141, slot, 1);
c.addItem(143, 1);
c.prayerRestore();
c.sendQuest("" + c.playerLevel[5] + "", 4012);
break;
			case 143:
				if (System.currentTimeMillis() -c.potionDelay < 2000)
				return;
				c.foodDelay = System.currentTimeMillis();
				c.potionDelay = System.currentTimeMillis();
				c.setAnimation(0x33D);
				
				c.sM("You drink some of your restore prayer potion.");
				c.sM("You have finished your potion.");
c.deleteItem(143, slot, 1);
c.addItem(229, 1);
c.prayerRestore();
c.sendQuest("" + c.playerLevel[5] + "", 4012);
break;
case 2444: // range (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.rangePot = true;
c.rangePotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[4]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
c.playerLevel[4] += c.abc2;
c.sendFrame126(""+c.playerLevel[4]+"", 4006);
c.deleteItem(2444, c.getItemSlot(2444), 1);
c.addItem(169, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.rangePotTimer = 60;
				c.sM("You drink some of your ranging potion.");
				c.sM("You have 3 doses of potion left."); 
break;
case 169: // range (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.rangePot = true;
c.rangePotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[4]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
c.playerLevel[4] += c.abc2;
c.sendFrame126(""+c.playerLevel[4]+"", 4006);
c.deleteItem(169, slot, 1);
c.addItem(171, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.rangePotTimer = 60;
				c.sM("You drink some of your ranging potion.");
				c.sM("You have 2 doses of potion left."); 
break;
case 171: // range (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.rangePot = true;
c.rangePotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[4]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
c.playerLevel[4] += c.abc2;
c.sendFrame126(""+c.playerLevel[4]+"", 4006);
c.deleteItem(171, slot, 1);
c.addItem(173, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.rangePotTimer = 60;
				c.sM("You drink some of your ranging potion.");
				c.sM("You have 1 dose of potion left."); 
break;
case 173: // range (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.rangePot = true;
c.rangePotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[4]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[4] = c.getLevelForXP(c.playerXP[4]);
c.playerLevel[4] += c.abc2;
c.sendFrame126(""+c.playerLevel[4]+"", 4006);
c.deleteItem(173, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[4] + "", 4010);
c.rangePotTimer = 60;
				c.sM("You drink some of your ranging potion.");
				c.sM("You have finished your potion."); 
break;
case 113: // str (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(113, slot, 1);
c.addItem(115, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 3 doses of potion left."); 
break;
case 115: // str (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(115, slot, 1);
c.addItem(117, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 2 doses of potion left."); 
break;
case 117: // str (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(117, slot, 1);
c.addItem(119, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 1 dose of potion left."); 
break;
case 119: // str (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(119, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have finished your potion."); 
break;
case 2440: // super str (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(2440, slot, 1);
c.addItem(157, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 3 doses of potion left."); 
break;
case 157: // super str (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(157, slot, 1);
c.addItem(159, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 2 doses of potion left.");
break;
case 159: // super str (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(159, slot, 1);
c.addItem(161, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have 1 dose of potion left.");
break;
case 161: // super str (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.strPot = true;
c.strPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[2]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[2] = c.getLevelForXP(c.playerXP[2]);
c.playerLevel[2] += c.abc2;
c.sendFrame126(""+c.playerLevel[2]+"", 4006);
c.deleteItem(161, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.sendQuest("" + c.playerLevel[2] + "", 4006);
c.strPotTimer = 60;
				c.sM("You drink some of your strength potion.");
				c.sM("You have finished your potion.");
break;
case 2432: // def (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(2432, slot, 1);
c.addItem(133, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have 3 doses of potion left.");
c.refreshSkills();
break;
case 133: // def (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(133, slot, 1);
c.addItem(135, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have 2 doses of potion left.");
c.refreshSkills();
break;
case 135: // def (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(135, slot, 1);
c.addItem(137, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have 1 dose of potion left.");
c.refreshSkills();
break;
case 137: // def (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(137, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have finished your potion.");
c.refreshSkills();
break;
case 2442: // super def (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(2442, slot, 1);
c.addItem(163, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have 3 doses of potion left.");
c.refreshSkills();
break;

case 163: // super def (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(163, slot, 1);
c.addItem(165, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have 2 doses of potion left.");
c.refreshSkills();
break;

case 165: // super def (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(165, slot, 1);
c.addItem(167, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");												c.sM("You have 1 dose of potion left.");
c.refreshSkills();
break;


case 167: // super def (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.defPot = true;
c.defPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[1]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[1] = c.getLevelForXP(c.playerXP[1]);
c.playerLevel[1] += c.abc2;
c.sendFrame126(""+c.playerLevel[1]+"", 4008);
c.deleteItem(167, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.defPotTimer = 60;
				c.sM("You drink some of your defence potion.");
				c.sM("You have finished your potion.");
c.refreshSkills();
break;
case 2428: // atk (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(2428, slot, 1);
c.addItem(121, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 3 doses of potion left.");
break;
case 121: // atk (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(121, slot, 1);
c.addItem(123, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 2 doses of potion left.");
break;
case 123: // atk (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(123, slot, 1);
c.addItem(125, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 1 dose of potion left.");
break;
case 125: // atk (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 15;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(125, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have finished your potion.");
break;
case 2436: // super atk (4)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(2436, slot, 1);
c.addItem(145, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 3 doses of potion left.");
break;

case 145: // super atk (3)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(145, slot, 1);
c.addItem(147, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 2 doses of potion left.");
break;

case 147: // super atk (2)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(147, slot, 1);
c.addItem(149, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have 1 dose of potion left.");
break;
case 149: // super atk (1)
if (System.currentTimeMillis() -c.potionDelay < 2000)
return;
c.foodDelay = System.currentTimeMillis();
c.potionDelay = System.currentTimeMillis();
c.attPot = true;
c.attPotTimer = 20;
c.abc = c.getLevelForXP(c.playerXP[0]);
c.cba = c.abc / 10;
c.abc2 = c.cba * 2;
if (c.abc2 <= 1) {
c.abc2 = 2;
}
c.setAnimation(829);
c.playerLevel[0] = c.getLevelForXP(c.playerXP[0]);
c.playerLevel[0] += c.abc2;
c.sendFrame126(""+c.playerLevel[0]+"", 4004);
c.deleteItem(149, slot, 1);
c.addItem(229, 1);
c.updateRequired = true;
c.setAppearanceUpdateRequired(true);
c.attPotTimer = 60;
				c.sM("You drink some of your attack potion.");
				c.sM("You have finished your potion.");
break;

			default:
				used = false;
				break;
			}
		}
	}

}//closes potion handler
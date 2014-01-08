import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
//emote 2699
//2400,4446
//client url here

public class client extends Player implements Runnable {
	void itemMessage(String message, String title, int itemid, int size){
		sendFrame200(4883, 591);
		sendFrame126(title, 4884);
		sendFrame126(message, 4885);
		sendFrame246(4883, size, itemid);
		sendFrame164(4882);
		NpcDialogueSend = true;
	}
	
	public void mark() {
		marks += 1;
		marked = true;
		if (marks >= 1) {
			sM("You've been given a blackmark. Four more and you are banned.");
			sM("Please abide by the rules, and try not to accumulate any more blackmarks.");	
		}
		if (marks >= 2) {
			sM("You've been given a blackmark. Three more and you are banned.");
			sM("Please abide by the rules, and try not to accumulate any more blackmarks.");	
		}
		if (marks >= 3) {
			sM("You've been given a blackmark. Two more and you are banned.");
			sM("Please abide by the rules, and try not to accumulate any more blackmarks.");	
		}
		if (marks >= 4) {
			sM("You've been given a blackmark. One more and you are banned.");
			sM("Please abide by the rules, and try not to accumulate any more blackmarks.");	
		}
		if (marks == 5) {
			writeLog(playerName, "bans");
			disconnected = true;	
		}
	}


	public void glory() 
	{
		interfaceEffect = 10;
		clearQuestInterface();
		sendFrame126("Edgeville", 2494);
		sendFrame126("Karamja", 2495);
		sendFrame126("Draynor Village", 2496);
		sendFrame126("Al kharid", 2497);
		sendFrame126("Nowhere", 2498);
		sendQuestSomething(8143);
		sendFrame164(2492);
		flushOutStream();
	}
    public void secondClickItem()
    {
        int i = inStream.readSignedWordA();
        int j = inStream.readSignedWordBigEndian();
        int k = inStream.readSignedWordA();
        int l = inStream.readUnsignedWord();
        boolean flag = false;
        boolean flag1 = false;
        switch(k)
        {
        case 1712: 
                gloryId = 1712;
                newGloryId = 1710;
                glory();
            	break;

        case 1710: 
                gloryId = 1710;
                newGloryId = 1708;
                glory();
            	break;

        case 1708: 
                gloryId = 1708;
                newGloryId = 1706;
                glory();
            	break;

        case 1706: 
                gloryId = 1706;
                newGloryId = 1704;
                glory();
            	break;

        case 1704: 
sM("Your Amulet of glory is out of charge, Recharge at the edgeville Altar.");
            	break;

        default:
            System.out.println((new StringBuilder()).append("Item Option2: ").append(k).toString());
            break;
        }
    }
	


public boolean DCDamg = false;
public int DCdown = 0;
public static WorldMap WorldMap = null;
public boolean isBK = false;
public boolean isBT = false;
public boolean isBA = false;
       public int gloryId = 0;
       public int newGloryId = 0;
public boolean isBD = false;
public boolean isBV = false;
public boolean isBG = false;
public boolean marked = false; 
private boolean hasAccepted = false;
public int barrowsTele = 0;
public int dog = 0;
public int followThisPlayer = 0;
public boolean isFollowing = false;
public boolean isCloseEnough = false;
public int qPoints = 0;
public int barrow = 0;
public int marks = 0;
public int lumStarter = 0;
public int questPoints = 0;
public int cwKills = 0;
	public void createFullScreenInterface(int interfaceID, int bgInterfaceID) {
		client.outStream.createFrame(253);
		client.outStream.writeWordBigEndian(bgInterfaceID);
		client.outStream.writeWordA(interfaceID);
	}
public void PcPanel1() {
                setInterfaceWalkable(15892);
sendQuest("Pest Control", 15894);
sendQuest("New game starts in:", 15895);
sendQuest(""+PlayerHandler.pcWaitTimer+"", 15897);
sendQuest("Players in boat:", 15898);
sendQuest(""+PlayerHandler.Waiters+"", 15899);
sendQuest("Points:"+pcPoints+"", 15900);
sendQuest("", 15901);
sendQuest("", 15896);
sendQuest("", 15902);
sendQuest("", 15903);
sendQuest("", 15904);
sendQuest("", 15905);
sendQuest("", 15906);
	}
public void PcPanel2() {
setInterfaceWalkable(15892);
sendQuest("Purple portal", 15895);
if(PlayerHandler.portal1 == 1){
sendQuest("@red@Down", 15895);
}
sendQuest("Blue portal", 15897);
if(PlayerHandler.portal2 == 1){
sendQuest("@red@Down", 15897);
}
sendQuest("Yellow portal", 15898);
if(PlayerHandler.portal3 == 1){
sendQuest("@red@Down", 15898);
}
sendQuest("Red portal", 15899);
if(PlayerHandler.portal4 == 1){
sendQuest("@red@Down", 15899);
}
sendQuest(""+PlayerHandler.pcGameTimer+"", 15900);
sendQuest("", 15901);
sendQuest("", 15896);
sendQuest("", 15902);
sendQuest("", 15903);
sendQuest("", 15904);
sendQuest("", 15905);
sendQuest("", 15906);
	}
public void Boat() 
	{
		interfaceEffect = 10;
		clearQuestInterface();
		sendFrame126("", 2494);
		sendFrame126("Yes, i want to leave from boat", 2495);
		sendFrame126("", 2496);
		sendFrame126("", 2497);
		sendFrame126("Never mind", 2498);
		sendQuestSomething(8143);
		sendFrame164(2492);
		flushOutStream();
	}
public void clueScrollItems(int i1, int a1, int i2, int a2, int i3, int a3, int i4,int a4,int clueID){
				addItem(i1,a1);
				addItem(i2,a2);
				addItem(i3,a3);
				addItem(i4,a4);
				showInterface(6960);
				itemOnInterface(6963,i1,0,a1);
				itemOnInterface(6963,i2,1,a2);
				itemOnInterface(6963,i3,2,a3);
				itemOnInterface(6963,i4,3,a4);
				deleteItem(clueID,1);
				}
	public void itemOnInterface(int frame,int item,int slot,int amount){
        outStream.createFrameVarSizeWord(34);
        outStream.writeWord(frame);
        outStream.writeByte(slot);
        outStream.writeWord(item+1);
        outStream.writeByte(255);
        outStream.writeDWord(amount);
        outStream.endFrameVarSizeWord();
    }
	
	public boolean inWaiterAssault() {
		if((absX >= 3345 && absX <= 3357 && absY >= 3337 && absY <= 3349))
			return true;
		else
			return false;
	}
	
	public int[] lowTask = { 87, 100, 19, 1267, 181, 90, 112, 117, 78, 1153 };
	public int[] mediumTask = { 87, 100, 19, 1267, 117, 78, 941, 1338, 912, 913, 914, 2591, 2604, 2610, 1153, 1154 };
	public int[] highTask = { 1627, 181, 90, 112, 117, 78, 1183, 941, 2881, 2882, 2883, 2591, 2604, 2610, 1153, 1154 };
	public int taskID = -1;
	public int taskAmount = -1;
	public void rightClickCheck() {
		if (!isInWilderness(absX, absY, 1)&& !isInPitGame() && !inFunPK()) {
			outStream.createFrameVarSize(104);
			outStream.writeByteC(3);		// command slot
			outStream.writeByteA(0);		// 0 or 1; 1 if command should be placed on top in context menu
			outStream.writeString("null");
			outStream.endFrameVarSize();
		}
		if (isInWilderness(absX, absY, 1) || isInPitGame() || inFunPK()) {
			outStream.createFrameVarSize(104);
			outStream.writeByteC(3);		// command slot
			outStream.writeByteA(0);		// 0 or 1; 1 if command should be placed on top in context menu
			outStream.writeString("Attack");
			outStream.endFrameVarSize();
		}	
	}
public int karil = 0;
public int torag = 0;
public int verac = 0;
public int dharok = 0;
public int ahrim = 0;
public int guthan = 0;
public int autoRetaliate = 1;
   public void sendFrame34(int frame,int item,int slot,int amount){
        outStream.createFrameVarSizeWord(34);
        outStream.writeWord(frame);
        outStream.writeByte(slot);
        outStream.writeWord(item+1);
        outStream.writeByte(255);
        outStream.writeDWord(amount);
        outStream.endFrameVarSizeWord();
    }

public static final int[] DONATOR_ITEMS ={748, 748};
Random r = new Random();
boolean done = false;

/*public void Clientbots(int i, int k, String msg){

	if(i == 0){
		botnames = "Welcome";
		}
	if(i == 1){
		botnames = "LootShare";
		}
	if(i == 2){
		botnames = "Updates_bot: ";
	}
	if(i >= 3){
		botnames = "l33t_bot: ";
	}

		if(k == 1) {//login
			sM(""+botnames+""+msg+".");
	}
		}*/


public void playersOnline()
    {
		sendQuest((new StringBuilder()).append("@or1@Players online: @gre@").append(PlayerHandler.playerCount).toString()+"", 7332); //players online :D
	}
	public int randomLowTask() 
	{
		return lowTask[(int) (Math.random() * lowTask.length)];
	}

	public int randomMediumTask() 
	{
		return mediumTask[(int) (Math.random() * mediumTask.length)];
	}

	public int randomHighTask() 
	{
		return highTask[(int) (Math.random() * highTask.length)];
	}
public void clanChatMenu() {
	sendQuest("", 6272);
	sendQuest("", 6271);
	sendQuest("", 9926);
	sendQuest("Talking in: @whi@" + clanName, 16006);
	sendQuest("Owner: @whi@" + clanLeader, 16007);
	sendQuest("", 16502);
	
	sendQuest("", 16514);
	sendQuest("end of clan chat", 16515);
	sendQuest("-----------------", 16516);

	for(int i=16502; i<=16514; i++) {
		if(clanMembers[i-16502] != null) {
			sendQuest("@whi@"+clanMembers[i-16502], CCID[i-16502]);
		} else {
			sendQuest("", CCID[i-16502]);
		}
	}
}


public int dclaws = 0;

public void dclawed2() {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
int clawed2 = misc.random(playerMaxHit/4);
if(AttackingOn2 != null) {
if(AttackingOn2.currentHealth <= 0) {
dclaws = 0;
} else {
						PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
						PlayerHandler.players[AttackingOn].updateRequired = true;
						PlayerHandler.players[AttackingOn].appearanceUpdateRequired = true;
						if(misc.random(3) != 1) {
						PlayerHandler.players[AttackingOn].dealDamage(clawed2);
						PlayerHandler.players[AttackingOn].hitDiff = clawed2;
} else {
						PlayerHandler.players[AttackingOn].dealDamage(0);
						PlayerHandler.players[AttackingOn].hitDiff = 0;
}
						PlayerHandler.players[AttackingOn].killers[playerId] += hitDiff;
						PlayerHandler.players[AttackingOn].KilledBy[playerId] += hitDiff;
}
}
}
public void dclawed() {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
int clawed = misc.random(playerMaxHit/2);
//int clawed = misc.random(playerMaxHit*2/3);
if(AttackingOn2 != null) {
if(AttackingOn2.currentHealth <= 0) {
dclaws = 0;
} else {
						PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
						PlayerHandler.players[AttackingOn].updateRequired = true;
						PlayerHandler.players[AttackingOn].appearanceUpdateRequired = true;
						if(misc.random(3) != 1) {
						PlayerHandler.players[AttackingOn].dealDamage(clawed);
						PlayerHandler.players[AttackingOn].hitDiff = clawed;
} else {
						PlayerHandler.players[AttackingOn].dealDamage(0);
						PlayerHandler.players[AttackingOn].hitDiff = 0;
}
						PlayerHandler.players[AttackingOn].killers[playerId] += hitDiff;
						PlayerHandler.players[AttackingOn].KilledBy[playerId] += hitDiff;
}
}
}

  public void loseItem1()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose1 = playerItems[i]-1;
                    itemLose1Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose1 = playerEquipment[i];
                    itemLose1Slot = i;
                }
            }
        }
    }
    public void loseItem2()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose2 = playerItems[i]-1;
                    itemLose2Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot !=i)
{
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose2 = playerEquipment[i];
                    itemLose2Slot = i;
                }
            }
        }
    }
    public void loseItem3()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose3 = playerItems[i]-1;
                    itemLose3Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose3 = playerEquipment[i];
                    itemLose3Slot = i;
                }
            }
        }
    }
    public void loseItem4()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose4 = playerItems[i]-1;
                    itemLose4Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose4 = playerEquipment[i];
                    itemLose4Slot = i;
                }
            }
        }
    }
    public void loseItem5()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose5 = playerItems[i]-1;
                    itemLose5Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose5 = playerEquipment[i];
                    itemLose5Slot = i;
                }
            }
        }
    }
    public void loseItem6()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose6 = playerItems[i]-1;
                    itemLose6Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose6 = playerEquipment[i];
                    itemLose6Slot = i;
                }
            }
        }
    }
    public void loseItem7()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose7 = playerItems[i]-1;
                    itemLose7Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose7 = playerEquipment[i];
                    itemLose7Slot = i;
                }
            }
        }
    }
    public void loseItem8()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i && itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose8 = playerItems[i]-1;
                    itemLose8Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose8 = playerEquipment[i];
                    itemLose8Slot = i;
                }
            }
        }
    }
    public void loseItem9()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose9 = playerItems[i]-1;
                    itemLose9Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose9 = playerEquipment[i];
                    itemLose9Slot = i;
                }
            }
        }
    }
    public void loseItem10()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose10 = playerItems[i]-1;
                    itemLose10Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose10 = playerEquipment[i];
                    itemLose10Slot = i;
                }
            }
        }
    }
    public void loseItem11()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose11 = playerItems[i]-1;
                    itemLose11Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose11 = playerEquipment[i];
                    itemLose11Slot = i;
                }
            }
        }
    }
    public void loseItem12()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose12 = playerItems[i]-1;
                    itemLose12Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose12 = playerEquipment[i];
                    itemLose12Slot = i;
                }
            }
        }
    }
    public void loseItem13()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose13 = playerItems[i]-1;
                    itemLose13Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose13 = playerEquipment[i];
                    itemLose13Slot = i;
                }
            }
        }
    }
    public void loseItem14()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose14 = playerItems[i]-1;
                    itemLose14Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose14 = playerEquipment[i];
                    itemLose14Slot = i;
                }
            }
        }
    }
    public void loseItem15()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose15 = playerItems[i]-1;
                    itemLose15Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose15 = playerEquipment[i];
                    itemLose15Slot = i;
                }
            }
        }
    }
    public void loseItem16()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i &&  itemLose15Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose16 = playerItems[i]-1;
                    itemLose16Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i &&  itemLose15Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose16 = playerEquipment[i];
                    itemLose16Slot = i;
                }
            }
        }
    }
    public void loseItem17()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i &&  itemLose15Slot != i &&itemLose16Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose17 = playerItems[i]-1;
                    itemLose17Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose17 = playerEquipment[i];
                    itemLose17Slot = i;
                }
            }
        }
    }
    public void loseItem18()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot !=i){
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose18 = playerItems[i]-1;
                    itemLose18Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose18 = playerEquipment[i];
                    itemLose18Slot = i;
                }
            }
        }
    }
    public void loseItem19()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose19 = playerItems[i]-1;
                    itemLose19Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose19 = playerEquipment[i];
                    itemLose19Slot = i;
                }
            }
        }
    }
    public void loseItem20()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose20 = playerItems[i]-1;
                    itemLose20Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose20 = playerEquipment[i];
                    itemLose20Slot = i;
                }
            }
        }
    }
    public void loseItem21()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose21 = playerItems[i]-1;
                    itemLose21Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose21 = playerEquipment[i];
                    itemLose21Slot = i;
                }
            }
        }
    }
    public void loseItem22()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose22 = playerItems[i]-1;
                    itemLose22Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose22 = playerEquipment[i];
                    itemLose22Slot = i;
                }
            }
        }
    }
    public void loseItem23()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose23 = playerItems[i]-1;
                    itemLose23Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose23 = playerEquipment[i];
                    itemLose23Slot = i;
                }
            }
        }
    }
    public void loseItem24()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose24 = playerItems[i]-1;
                    itemLose24Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose24 = playerEquipment[i];
                    itemLose24Slot = i;
                }
            }
        }
    }
    public void loseItem25()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose25 = playerItems[i]-1;
                    itemLose25Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose25 = playerEquipment[i];
                    itemLose25Slot = i;
                }
            }
        }
    }
    public void loseItem26()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose26 = playerItems[i]-1;
                    itemLose26Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose26 = playerEquipment[i];
                    itemLose26Slot = i;
                }
            }
        }
    }
    public void loseItem27()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose27 = playerItems[i]-1;
                    itemLose27Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose27 = playerEquipment[i];
                    itemLose27Slot = i;
                }
            }
        }
    }
    public void loseItem28()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }
    public void loseItem29()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem30()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem31()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem32()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem33()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem34()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem35()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem36()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem37()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem38()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i && itemLose37Slot !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i && itemLose37Slot !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }    public void loseItem39()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i  && itemLose1Slot != i&& itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i  && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i && itemLose37Slot !=i &&itemLose38 !=i) 
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemLose28 = playerItems[i]-1;
                    itemLose28Slot = i;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i && itemKept4Slot != i &&itemLose1Slot != i &&itemLose2Slot != i &&itemLose3Slot != i &&itemLose4Slot != i &&itemLose5Slot != i &&itemLose6Slot != i &&itemLose7Slot != i &&itemLose8Slot != i &&itemLose9Slot != i &&itemLose10Slot != i &&itemLose11Slot != i &&itemLose12Slot != i &&itemLose13Slot != i &&itemLose14Slot != i && itemLose15Slot != i &&itemLose16Slot != i &&itemLose17Slot != i &&itemLose18Slot != i &&itemLose19Slot != i &&itemLose20Slot != i &&itemLose21Slot != i &&itemLose22Slot != i &&itemLose23Slot != i &&itemLose24Slot !=i &&itemLose25Slot !=i &&itemLose26Slot !=i &&itemLose27Slot !=i && itemLose28Slot !=i && itemLose29Slot !=i && itemLose30Slot !=i && itemLose31Slot !=i && itemLose32Slot !=i && itemLose33Slot !=i && itemLose34Slot !=i && itemLose35Slot !=i && itemLose36Slot !=i && itemLose37Slot !=i &&itemLose38 !=i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemLose28 = playerEquipment[i];
                    itemLose28Slot = i;
                }
            }
        }
    }
 
public void updateCCMenu() {
	for (Player p : server.playerHandler.players) {
		if(p != null) {
			client person = (client)p;
			if((person.playerName != null || person.playerName != "null")) {
				client c2 = (client) server.playerHandler.players[server.playerHandler.getPlayerID(clanLeader)];
				if(person.clanLeader == clanLeader) {
					person.sendQuest("Talking in: @yel@" + clanName, 16006);
					person.sendQuest("Owner: @yel@" + clanLeader, 16007);
					for(int i=16502; i<=16514; i++) {
						if(c2.clanMembers[i-16502] != null) {
							person.sendQuest("@whi@"+c2.clanMembers[i-16502], CCID[i-16502]);
						} else {
							person.sendQuest("", CCID[i-16502]);
						}
					}
				}
			}
		}
	}
}

public void removeFromCC() {
	client c2 = (client) server.playerHandler.players[server.playerHandler.getPlayerID(clanLeader)];
	for(int i=16502; i<=16514; i++) {
		if(c2.clanMembers[i-16502] == playerName) {
			c2.clanMembers[i-16502] = null;
			updateCCMenu();
			break;
		}
	}
	clanName = "none";
	clanLeader = "nobody";
	clanChatMenu();
}

public void sendClanMessage(String msg) {
	for (Player p : server.playerHandler.players) {
		if(p != null) {
			client person = (client)p;
			if((person.playerName != null || person.playerName != "null")) {
				if(person.clanLeader == clanLeader) {
					person.sM("["+clanName+"] "+playerName+" - "+msg);
					//person.sM("[@blu@"+clanName+"@bla@] "+playerName+": @dre@"+msg); // ENABLE THIS ONE IF YOU HAVE COLORED SENDMESSAGES ENABLED ON YOUR CLIENT!
				}
			}
		}
	}
}
         public void pDialogue(String line1, int faceAnim) {
sendFrame126(GetNpcName(3781), 4902);
		sendFrame200(969, faceAnim);
		sendFrame126(playerName.replaceAll("_", " "), 970);
		sendFrame126(line1, 971);
		sendFrame185(969);
		sendFrame164(968);
		NpcDialogueSend = true;
                //SendDialogue = true;
	}
public void checkHead(){
if(!isSkulled){
headIcon = 0;
}
if(isSkulled){
headIcon = 0;
}
}


	public void pDialogue2(String line1, String line2, int faceAnim) {
		sendFrame200(974, faceAnim);
		sendFrame126(playerName.replaceAll("_", " "), 975);
		sendFrame126(line1, 976);
		sendFrame126(line2, 977);
		sendFrame185(974);
		sendFrame164(973);
		NpcDialogueSend = true;
                //SendDialogue = true;
	}
    public void itemreset() {
        for (int i = 0; i < playerItems.length; i++) {
            playerItems[i] = 0;
        }
        for (int i = 0; i < playerItemsN.length; i++) {
            playerItemsN[i] = 0;
        }
        resetItems(3214);
    }
 public void bankreset() {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(5382);
        outStream.writeWord(playerBankSize);
        for (int i = 0; i < playerBankSize; i++) {
            if (bankItemsN[i] > 254) {
                outStream.writeByte(255);
                outStream.writeDWord_v2(bankItemsN[i]);
            } else {
                outStream.writeByte(bankItemsN[i]);
            }
            if (bankItemsN[i] < 1) {
                bankItems[i] = 0;
            }
            if (bankItems[i] > 7500 || bankItems[i] < 0) {
                bankItems[i] = 7500;
            }
            outStream.writeWordBigEndianA(bankItems[i]); // itemID
        }
        outStream.endFrameVarSizeWord();
    }
	public void pDialogue3(String line1, String line2, String line3, int faceAnim) {
		sendFrame200(980, faceAnim);
		sendFrame126(playerName.replaceAll("_", " "), 981);
		sendFrame126(line1, 982);
		sendFrame126(line2, 983);
		sendFrame126(line3, 984);
		sendFrame185(980);
		sendFrame164(979);
		NpcDialogueSend = true;
                //SendDialogue = true;
	}

	public void pDialogue4(String line1, String line2, String line3, String line4, int faceAnim) {
		sendFrame200(987, faceAnim);
		sendFrame126(playerName.replaceAll("_", " "), 988);
		sendFrame126(line1, 989);
		sendFrame126(line2, 990);
		sendFrame126(line3, 991);
		sendFrame126(line4, 992);
		sendFrame185(987);
		sendFrame164(986);
		NpcDialogueSend = true;
                //SendDialogue = true;
	}
	public void slayerTalk() 
	{
		interfaceEffect = 3;
		clearQuestInterface();
		sendFrame126("", 2494);
		sendFrame126("I need an assignment", 2495);
		sendFrame126("Do you have anything for trade?", 2496);
		sendFrame126("Er...nothing...", 2497);
		sendFrame126("", 2498);
		sendQuestSomething(8143);
		sendFrame164(2492);
		flushOutStream();
	}

	public void slayerGem() 
	{
		interfaceEffect = 4;
		clearQuestInterface();
		sendFrame126("How am I doing so far?", 2494);
		sendFrame126("Who are you?", 2495);
		sendFrame126("Where are you?", 2496);
		sendFrame126("Nothing really.", 2497);
		sendFrame126("", 2498);
		sendQuestSomething(8143);
		sendFrame164(2492);
		flushOutStream();
	}
public void killmessage() {
			client killerz = (client) server.playerHandler.players[KillerId];
                    client playerz = (client) server.playerHandler.players[playerId];
			int message = misc.random(8);//Made by Evan :P 
 followID2 = 0;
 followID = 0;
			if(message == 0)
				killerz.sM("With a crushing blow, you defeat " + playerz.playerName + ".");
			else if(message == 1)
				killerz.sM("It's a humiliating defeat for " + playerz.playerName + ".");
			else if(message == 2) 
				killerz.sM("" + playerz.playerName + " didn't stand a chance against you.");
			else if(message == 3) 
				killerz.sM("You have defeated " + playerz.playerName + ".");
			else if(message == 4) 
				killerz.sM("" + playerz.playerName + " regrets the day they met you in combat.");
			else if(message == 5) 
				killerz.sM("It's all over for " + playerz.playerName + ".");
			else if(message == 6) 
				killerz.sM("" + playerz.playerName + " falls before your might.");
			else if(message == 7)
				killerz.sM("Can anyone defeat you? Certainly not " + playerz.playerName + ".");
			else if(message == 8) 
				killerz.sM("You were clearly a better fighter than " + playerz.playerName + ".");
		}

	public void giveTask() 
	{
		if (combatLevel >= 3 && combatLevel <= 50) {
			taskID = randomLowTask();
			taskAmount = 10 + misc.random(40);
			talk2("Your task is to kill "+taskAmount+" "+GetNpcName(taskID)+"s.", "", 1597);
		}
		if (combatLevel >= 51 && combatLevel <= 100) {
			taskID = randomMediumTask();
			taskAmount = 10 + misc.random(40);
			talk2("Your task is to kill "+taskAmount+" "+GetNpcName(taskID)+"s.", "", 1597);
		}
		if (combatLevel >= 101) {
			taskID = randomHighTask();
			taskAmount = 10 + misc.random(40);
			talk2("Your task is to kill "+taskAmount+" "+GetNpcName(taskID)+"s.", "", 1597);
		}
	}

	public String reportTo[] = {"Owner loki", "blind ranger", "blind mauler", "u g0t 0wn3d", "robert"};

	public void processReport(String msg) {
		for (Player element : handler.players) {
			client p = (client) element;
			if ((p != null) && !p.disconnected && (p.absX > 0)) {
				if(doSend(p)) {
					p.sM(msg +"©auto©");
				}
			}
		}
	}		

	public boolean doSend(client player) {
		for(int names = 0; names < reportTo.length; names++) {
			if(player.playerName.equalsIgnoreCase(reportTo[names])) {
				return true;
			}
		}
		return false;
	}

public void frame61(int i1)
{
outStream.createFrame(61);
outStream.writeByte(i1);
updateRequired = true;
appearanceUpdateRequired = true;
}

public void getEnd(){
if(Projectile(MagicHandler.spellID)){
stillgfx(ffinishid, fenemyY, fenemyX);
}
if(!Projectile(MagicHandler.spellID)){
stillgfx(fcastid, fenemyY, fenemyX);
}
}
public int getarrowgfxnow() {
       		if (playerEquipment[playerArrows] == 892) {
          		return 15;
       		} 
       		if (playerEquipment[playerArrows] == 890) {
          		return 13;
        	} 
        	if (playerEquipment[playerArrows] == 888) {
            		return 12;
        	} 
        	if (playerEquipment[playerArrows] == 886) {
            		return 11;
        	} 
        	if (playerEquipment[playerArrows] == 884) {
            		return 9;
        	} 
        	if (playerEquipment[playerArrows] == 882) {
            		return 10;
        	} else { return -1; }
	}
public void removeSpec(int id) {
      outStream.createFrame(171);
      outStream.writeByte(1);
      outStream.writeWord(id);
      flushOutStream();
   } 
    public void getWavekillCount()
    {
        if(TzWave != -1)
            if(TzWave == 1)
                KilledTz = 0;
            else
            if(TzWave == 2)
                KilledTz = 1;
            else
            if(TzWave == 3)
                KilledTz = 3;
            else
            if(TzWave == 4)
                KilledTz = 6;
            else
            if(TzWave == 5)
                KilledTz = 10;
            else
            if(TzWave == 6)
                KilledTz = 15;
            else
            if(TzWave == 7)
                KilledTz = 21;
            else
            if(TzWave == 8)
                KilledTz = 22;
            else
            if(TzWave == 9)
                KilledTz = 24;
            else
            if(TzWave == 10)
                KilledTz = 27;
            else
            if(TzWave == 11)
                KilledTz = 31;
            else
            if(TzWave == 12)
                KilledTz = 36;
            else
            if(TzWave == 13)
                KilledTz = 42;
            else
            if(TzWave == 14)
                KilledTz = 46;
            else
            if(TzWave == 15)
                KilledTz = 48;
            else
            if(TzWave == 16)
                KilledTz = 49;
            else
            if(TzWave == 17)
                KilledTz = 51;
            else
            if(TzWave == 18)
                KilledTz = 54;
            else
            if(TzWave == 19)
                KilledTz = 58;
            else
            if(TzWave == 20)
                KilledTz = 63;
            else
            if(TzWave == 21)
                KilledTz = 69;
            else
            if(TzWave == 22)
                KilledTz = 76;
            else
            if(TzWave == 23)
                KilledTz = 78;
            else
            if(TzWave == 24)
                KilledTz = 81;
            else
            if(TzWave == 25)
                KilledTz = 85;
            else
            if(TzWave == 26)
                KilledTz = 90;
            else
            if(TzWave == 27)
                KilledTz = 96;
            else
            if(TzWave == 28)
                KilledTz = 103;
            else
            if(TzWave == 29)
                KilledTz = 112;
            else
            if(TzWave == 30)
                KilledTz = 114;
            else
            if(TzWave == 31)
                KilledTz = 116;
            else
            if(TzWave == 32)
                KilledTz = 117;
            else
            if(TzWave == 33)
                KilledTz = 119;
            else
            if(TzWave == 34)
                KilledTz = 122;
            else
            if(TzWave == 35)
                KilledTz = 126;
            else
            if(TzWave == 36)
                KilledTz = 131;
            else
            if(TzWave == 37)
                KilledTz = 137;
            else
            if(TzWave == 38)
                KilledTz = 144;
            else
            if(TzWave == 39)
                KilledTz = 146;
            else
            if(TzWave == 40)
                KilledTz = 149;
            else
            if(TzWave == 41)
                KilledTz = 153;
            else
            if(TzWave == 42)
                KilledTz = 158;
            else
            if(TzWave == 43)
                KilledTz = 164;
            else
            if(TzWave == 44)
                KilledTz = 171;
            else
            if(TzWave == 45)
                KilledTz = 179;
            else
            if(TzWave == 46)
                KilledTz = 182;
            else
            if(TzWave == 47)
                KilledTz = 184;
            else
            if(TzWave == 48)
                KilledTz = 187;
            else
            if(TzWave == 49)
                KilledTz = 191;
            else
            if(TzWave == 50)
                KilledTz = 196;
            else
            if(TzWave == 51)
                KilledTz = 202;
            else
            if(TzWave == 52)
                KilledTz = 209;
            else
            if(TzWave == 53)
                KilledTz = 217;
            else
            if(TzWave == 54)
                KilledTz = 220;
            else
            if(TzWave == 55)
                KilledTz = 224;
            else
            if(TzWave == 56)
                KilledTz = 229;
            else
            if(TzWave == 57)
                KilledTz = 235;
            else
            if(TzWave == 58)
                KilledTz = 242;
            else
            if(TzWave == 59)
                KilledTz = 250;
            else
            if(TzWave == 60)
                KilledTz = 259;
            else
            if(TzWave == 61)
                KilledTz = 263;
            else
            if(TzWave == 62)
                KilledTz = 266;
            else
            if(TzWave == 63)
                KilledTz = 268;
    }

    public void SpawnNewWave()
    {
        if(TzWave == 1)
        {
            server.npcHandler.spawnANPC(2627, 2380, 5105, heightLevel);
            NeededKills = 1;
        } 
        if(TzWave == 2)
        {
            server.npcHandler.spawnANPC(2627, 2379, 5070, heightLevel);
            server.npcHandler.spawnANPC(2627, 2382, 5107, heightLevel);
            NeededKills = 3;
        } 
        if(TzWave == 3)
        {
            server.npcHandler.spawnANPC(2630, 2381, 5104, heightLevel);
            NeededKills = 6;
        } 
        if(TzWave == 4)
        {
            server.npcHandler.spawnANPC(2630, 2378, 5074, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            NeededKills = 10;
        } 
        if(TzWave == 5)
        {
            server.npcHandler.spawnANPC(2630, 2388, 5070, heightLevel);
            server.npcHandler.spawnANPC(2627, 2419, 5083, heightLevel);
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            NeededKills = 15;
        } 
        if(TzWave == 6)
        {
            server.npcHandler.spawnANPC(2630, 2381, 5100, heightLevel);
            server.npcHandler.spawnANPC(2630, 2408, 5070, heightLevel);
            NeededKills = 21;
        } 
        if(TzWave == 7)
        {
            server.npcHandler.spawnANPC(2631, 2390, 5069, heightLevel);
            NeededKills = 22;
        } 
        if(TzWave == 8)
        {
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5072, heightLevel);
            NeededKills = 24;
        } 
        if(TzWave == 9)
        {
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5072, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            NeededKills = 27;
        } 
        if(TzWave == 10)
        {
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2630, 2378, 5072, heightLevel);
            NeededKills = 31;
        } 
        if(TzWave == 11)
        {
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2378, 5072, heightLevel);
            server.npcHandler.spawnANPC(2630, 2408, 5107, heightLevel);
            NeededKills = 36;
        } 
        if(TzWave == 12)
        {
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            server.npcHandler.spawnANPC(2631, 2398, 5072, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            NeededKills = 42;
        } 
        if(TzWave == 13)
        {
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2630, 2398, 5072, heightLevel);
            NeededKills = 46;
        } 
        if(TzWave == 14)
        {
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2378, 5072, heightLevel);
            NeededKills = 48;
        } 
        if(TzWave == 15)
        {
            server.npcHandler.spawnANPC(2741, 2397, 5096, heightLevel);
            NeededKills = 49;
        } 
        if(TzWave == 16)
        {
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            NeededKills = 51;
        } 
        if(TzWave == 17)
        {
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5072, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            NeededKills = 54;
        } 
        if(TzWave == 18)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            NeededKills = 58;
        } 
        if(TzWave == 19)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2627, 2408, 5107, heightLevel);
            NeededKills = 63;
        } 
        if(TzWave == 20)
        {
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5072, heightLevel);
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            NeededKills = 69;
        } 
        if(TzWave == 21)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2741, 2378, 5072, heightLevel);
            NeededKills = 76;
        } 
        if(TzWave == 22)
        {
            server.npcHandler.spawnANPC(2631, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            NeededKills = 78;
        } 
        if(TzWave == 23)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            NeededKills = 81;
        } 
        if(TzWave == 24)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            NeededKills = 85;
        } 
        if(TzWave == 25)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            NeededKills = 90;
        } 
        if(TzWave == 26)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            NeededKills = 96;
        } 
        if(TzWave == 27)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            NeededKills = 103;
        } 
        if(TzWave == 28)
	{
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2741, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            NeededKills = 111;
        } 
        if(TzWave == 29)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2378, 5100, heightLevel);
            NeededKills = 114;
        } 
        if(TzWave == 30)
        {
            server.npcHandler.spawnANPC(2741, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            NeededKills = 116;
        } 
        if(TzWave == 31)
        {
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            NeededKills = 117;
        } 
        if(TzWave == 32)
        {
            server.npcHandler.spawnANPC(2743, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            NeededKills = 119;
        } 
        if(TzWave == 33)
        {
            server.npcHandler.spawnANPC(2743, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            NeededKills = 122;
        } 
        if(TzWave == 34)
        {
            server.npcHandler.spawnANPC(2743, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            NeededKills = 126;
        } 
        if(TzWave == 35)
        {
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 131;
        } 
        if(TzWave == 36)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 137;
        } 
        if(TzWave == 37)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            NeededKills = 144;
        } 
        if(TzWave == 38)
        {
            server.npcHandler.spawnANPC(2631, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            NeededKills = 146;
        } 
        if(TzWave == 39)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            NeededKills = 149;
        } 
        if(TzWave == 40)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2378, 5100, heightLevel);
            NeededKills = 153;
        } 
        if(TzWave == 41)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 158;
        } 
        if(TzWave == 42)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 164;
        } 
        if(TzWave == 43)
        {
            server.npcHandler.spawnANPC(2743, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2627, 2397, 5096, heightLevel);
            NeededKills = 171;
        } 
        if(TzWave == 44)
        {
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            NeededKills = 179;
        } 
        if(TzWave == 45)
        {
            server.npcHandler.spawnANPC(2631, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 182;
        } 
        if(TzWave == 46)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            NeededKills = 184;
        } 
        if(TzWave == 47)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 187;
        } 
        if(TzWave == 48)
        {
            server.npcHandler.spawnANPC(2743, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2627, 2381, 5106, heightLevel);
            NeededKills = 191;
        } 
        if(TzWave == 49)
        {
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2630, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2741, 2383, 5069, heightLevel);
            NeededKills = 196;
        } 
        if(TzWave == 50)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2627, 2378, 5100, heightLevel);
            NeededKills = 202;
        } 
        if(TzWave == 51)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2743, 2397, 5096, heightLevel);
            NeededKills = 209;
        } 
        if(TzWave == 52)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            NeededKills = 217;
        } 
        if(TzWave == 53)
        {
            server.npcHandler.spawnANPC(2631, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2741, 2381, 5106, heightLevel);
            NeededKills = 220;
        } 
        if(TzWave == 54)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            NeededKills = 224;
        } 
        if(TzWave == 55)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2741, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 229;
        } 
        if(TzWave == 56)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            NeededKills = 235;
        } 
        if(TzWave == 57)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2741, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2743, 2378, 5100, heightLevel);
            NeededKills = 242;
        } 
        if(TzWave == 58)
        {
            server.npcHandler.spawnANPC(2627, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2627, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2631, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2741, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2743, 2398, 5086, heightLevel);
            NeededKills = 250;
        } 
        if(TzWave == 59)
        {
            server.npcHandler.spawnANPC(2630, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2630, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2743, 2381, 5106, heightLevel);
            server.npcHandler.spawnANPC(2741, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2631, 2398, 5086, heightLevel);
            NeededKills = 259;
        } 
        if(TzWave == 60)
        {
            server.npcHandler.spawnANPC(2631, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2631, 2397, 5096, heightLevel);
            server.npcHandler.spawnANPC(2741, 2378, 5100, heightLevel);
            server.npcHandler.spawnANPC(2743, 2398, 5086, heightLevel);
            NeededKills = 263;
        } 
        if(TzWave == 61)
        {
            server.npcHandler.spawnANPC(2741, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            server.npcHandler.spawnANPC(2741, 2398, 5086, heightLevel);
            NeededKills = 266;
        } 
        if(TzWave == 62)
        {
            server.npcHandler.spawnANPC(2743, 2406, 5071, heightLevel);
            server.npcHandler.spawnANPC(2743, 2383, 5069, heightLevel);
            NeededKills = 268;
        } 
        if(TzWave == 63)
        {
	    talk("Look out, here comes TzTok-Jad!", 2617);
            server.npcHandler.spawnANPC(2745, 2400, 5083, heightLevel);
            NeededKills = 269;
	}
    }
    public void healJad()
    {
        for(int i = 0; i < server.npcHandler.maxNPCs; i++)
            if(server.npcHandler.npcs[i] != null)
            {
		if(server.npcHandler.npcs[i].npcType == 2745)
		{
		if(server.npcHandler.npcs[i].heightLevel == heightLevel)
		{
		if(server.npcHandler.npcs[i].HP < server.npcHandler.npcs[i].MaxHP)
		{
                server.npcHandler.npcs[i].HP += 10;
		}
            }
	}
    }
}
    public void killMyNPCs()
    {
        for(int i = 0; i < server.npcHandler.maxNPCs; i++)
            if(server.npcHandler.npcs[i] != null)
            {
		if(server.npcHandler.npcs[i].npcType == 2627 || server.npcHandler.npcs[i].npcType == 2630 || server.npcHandler.npcs[i].npcType == 2631 || server.npcHandler.npcs[i].npcType == 2741 || server.npcHandler.npcs[i].npcType == 2743 || server.npcHandler.npcs[i].npcType == 2745 || server.npcHandler.npcs[i].npcType == 2746 || server.npcHandler.npcs[i].npcType == 2738)
		{
		if(server.npcHandler.npcs[i].heightLevel == heightLevel)
		{
                server.npcHandler.npcs[i].absX = 0;
                server.npcHandler.npcs[i].absY = 0;
		server.npcHandler.npcs[i].followPlayer = 0;
            }
	}
    }
}
    public int getHeightForTzhaar()
    {
	int i = 0;
	i = playerId * 4;
        return i;
    }
    public int getHeightForRFDr()
    {
	int i = 0;
	i = playerId * 4;
        return i;
    }
public void npcDamage(int extraDamage){
int voidmelee = 0;
if(FullVMelee()){
voidmelee += 10;
}
if(npcHit()){
hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(voidmelee) + misc.random(extraDamage);
}
if(!npcHit()){
hitDiff = 0;
}
}
public boolean npcHit(){
		int rand_att = misc.random(playerLevel[0]) + misc.random(playerBonus[1]) + misc.random(AtkPray * 8);
		int rand_npc = 0;
			if (server.npcHandler.npcs[attacknpc].npcType == 117 || server.npcHandler.npcs[attacknpc].npcType == 112) { // giant
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1338) { // dagg
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1610) { // gargoyle
				rand_npc = misc.random(170);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1616) { // basilisk
				rand_npc = misc.random(60);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1637) { // jelly
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1624) { // dust devil
				rand_npc = misc.random(80);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1615) { // abyssal demon
				rand_npc = misc.random(180);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2783) { // dark beast
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 941) { // green dragons
				rand_npc = misc.random(90);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1625) { // turoth
				rand_npc = misc.random(70);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1613) { // nechryael
				rand_npc = misc.random(120);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1264) { // saradomin wizard
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1459) { // gorilla guard
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1030) { // wolfman
				rand_npc = misc.random(60);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2631) { // tok-xil
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2741) { // yt-mejkot
				rand_npc = misc.random(100);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2743) { // ket-zek
				rand_npc = misc.random(300);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2745) { // tz-tok-jad
				rand_npc = misc.random(500);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 50) { // king black dragon
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1160) { // kalphite queen
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 3200) { // chaos elemental
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2881 || server.npcHandler.npcs[attacknpc].npcType == 2882 || server.npcHandler.npcs[attacknpc].npcType == 2883) { // daggonaths
				rand_npc = misc.random(170);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 258) { // general khazard
				rand_npc = misc.random(120);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2025 || server.npcHandler.npcs[attacknpc].npcType == 2026 || server.npcHandler.npcs[attacknpc].npcType == 2027 || server.npcHandler.npcs[attacknpc].npcType == 2028 || server.npcHandler.npcs[attacknpc].npcType == 2029 || server.npcHandler.npcs[attacknpc].npcType == 2030) { // barrows
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1183) { // elf warrior
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 3777 || server.npcHandler.npcs[attacknpc].npcType == 3778 || server.npcHandler.npcs[attacknpc].npcType == 3779 || server.npcHandler.npcs[attacknpc].npcType == 3780) { // pest control
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1472) { // jungle demon
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 988 || server.npcHandler.npcs[attacknpc].npcType == 989 || server.npcHandler.npcs[attacknpc].npcType == 990) { // knights legend
				rand_npc = misc.random(250);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1115) { // general graardor
				rand_npc = misc.random(300);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 655) { // tree spirit
				rand_npc = misc.random(100);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 72) { // mithril dragon
				rand_npc = misc.random(170);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2591 || server.npcHandler.npcs[attacknpc].npcType == 2604 || server.npcHandler.npcs[attacknpc].npcType == 2610) { // tzhaar
				rand_npc = misc.random(70);
			}
			if (rand_att >= rand_npc) {
				return true;
			}
			return false;
		}
public int npcRangeDamage(){
if(npcRangeHit()){
return misc.random(maxRangeHit2());
} else {
return 0;
}
}
public boolean npcRangeHit(){
		int rand_att = misc.random(playerLevel[4]) + misc.random(playerBonus[4]) + misc.random(RangePray * 8);
		int rand_npc = 0;
			if (server.npcHandler.npcs[attacknpc].npcType == 117 || server.npcHandler.npcs[attacknpc].npcType == 112) { // giant
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1338) { // dagg
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1610) { // gargoyle
				rand_npc = misc.random(170);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1616) { // basilisk
				rand_npc = misc.random(60);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1637) { // jelly
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1624) { // dust devil
				rand_npc = misc.random(80);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1615) { // abyssal demon
				rand_npc = misc.random(180);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2783) { // dark beast
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 941) { // green dragons
				rand_npc = misc.random(90);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1625) { // turoth
				rand_npc = misc.random(70);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1613) { // nechryael
				rand_npc = misc.random(120);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1264) { // saradomin wizard
				rand_npc = misc.random(50);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1459) { // gorilla guard
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1030) { // wolfman
				rand_npc = misc.random(60);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2631) { // tok-xil
				rand_npc = misc.random(20);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2741) { // yt-mejkot
				rand_npc = misc.random(30);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2743) { // ket-zek
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2745) { // tz-tok-jad
				rand_npc = misc.random(300);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 50) { // king black dragon
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1160) { // kalphite queen
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 3200) { // chaos elemental
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2881 || server.npcHandler.npcs[attacknpc].npcType == 2882 || server.npcHandler.npcs[attacknpc].npcType == 2883) { // daggonaths
				rand_npc = misc.random(300);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 258) { // general khazard
				rand_npc = misc.random(120);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2025 || server.npcHandler.npcs[attacknpc].npcType == 2026 || server.npcHandler.npcs[attacknpc].npcType == 2027 || server.npcHandler.npcs[attacknpc].npcType == 2028 || server.npcHandler.npcs[attacknpc].npcType == 2029 || server.npcHandler.npcs[attacknpc].npcType == 2030) { // barrows
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1183) { // elf warrior
				rand_npc = misc.random(150);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 3777 || server.npcHandler.npcs[attacknpc].npcType == 3778 || server.npcHandler.npcs[attacknpc].npcType == 3779 || server.npcHandler.npcs[attacknpc].npcType == 3780) { // pest control
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1472) { // jungle demon
				rand_npc = misc.random(200);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 988 || server.npcHandler.npcs[attacknpc].npcType == 989 || server.npcHandler.npcs[attacknpc].npcType == 990) { // knights legend
				rand_npc = misc.random(250);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 1115) { // general graardor
				rand_npc = misc.random(300);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 655) { // tree spirit
				rand_npc = misc.random(100);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 72) { // mithril dragon
				rand_npc = misc.random(170);
			}
			if (server.npcHandler.npcs[attacknpc].npcType == 2591 || server.npcHandler.npcs[attacknpc].npcType == 2604 || server.npcHandler.npcs[attacknpc].npcType == 2610) { // tzhaar
				rand_npc = misc.random(70);
			}
			if (rand_att >= rand_npc) {
				return true;
			}
			return false;
		}
public void getTotalLevel() {
if(playerRights >= 2)
return;
int a0 = getLevelForXP(playerXP[0]);
int a1 = getLevelForXP(playerXP[1]);
int a2 = getLevelForXP(playerXP[2]);
int a3 = getLevelForXP(playerXP[3]);
int a4 = getLevelForXP(playerXP[4]);
int a5 = getLevelForXP(playerXP[5]);
int a6 = getLevelForXP(playerXP[6]);
int a7 = getLevelForXP(playerXP[7]);
int a8 = getLevelForXP(playerXP[8]);
int a9 = getLevelForXP(playerXP[9]);
int a10 = getLevelForXP(playerXP[10]);
int a11 = getLevelForXP(playerXP[11]);
int a12 = getLevelForXP(playerXP[12]);
int a13 = getLevelForXP(playerXP[13]);
int a14 = getLevelForXP(playerXP[14]);
int a15 = getLevelForXP(playerXP[15]);
int a16 = getLevelForXP(playerXP[16]);
int a17 = getLevelForXP(playerXP[17]);
int a18 = getLevelForXP(playerXP[18]);
int a19 = getLevelForXP(playerXP[19]);
int a20 = getLevelForXP(playerXP[20]);
int a21 = getLevelForXP(playerXP[21]);
total = a0+a1+a2+a3+a4+a5+a6+a7+a8+a9+a10+a11+a12+a13+a14+a15+a16+a17+a18+a19+a20;
sendQuest("Total Lvl: "+total+"", 3984);
}


public void getTotalXP() {
if(playerRights >= 2)
return;
int a0 = getLevelForXP(playerXP[0]);
int a1 = getLevelForXP(playerXP[1]);
int a2 = getLevelForXP(playerXP[2]);
int a3 = getLevelForXP(playerXP[3]);
int a4 = getLevelForXP(playerXP[4]);
int a5 = getLevelForXP(playerXP[5]);
int a6 = getLevelForXP(playerXP[6]);
int a7 = getLevelForXP(playerXP[7]);
int a8 = getLevelForXP(playerXP[8]);
int a9 = getLevelForXP(playerXP[9]);
int a10 = getLevelForXP(playerXP[10]);
int a11 = getLevelForXP(playerXP[11]);
int a12 = getLevelForXP(playerXP[12]);
int a13 = getLevelForXP(playerXP[13]);
int a14 = getLevelForXP(playerXP[14]);
int a15 = getLevelForXP(playerXP[15]);
int a16 = getLevelForXP(playerXP[16]);
int a17 = getLevelForXP(playerXP[17]);
int a18 = getLevelForXP(playerXP[18]);
int a19 = getLevelForXP(playerXP[19]);
int a20 = getLevelForXP(playerXP[20]);
int a21 = getLevelForXP(playerXP[21]);
int b0 = getXPForLevel(a0);
int b1 = getXPForLevel(a1);
int b2 = getXPForLevel(a2);
int b3 = getXPForLevel(a3);
int b4 = getXPForLevel(a4);
int b5 = getXPForLevel(a5);
int b6 = getXPForLevel(a6);
int b7 = getXPForLevel(a7);
int b8 = getXPForLevel(a8);
int b9 = getXPForLevel(a9);
int b10 = getXPForLevel(a10);
int b11 = getXPForLevel(a11);
int b12 = getXPForLevel(a12);
int b13 = getXPForLevel(a13);
int b14 = getXPForLevel(a14);
int b15 = getXPForLevel(a15);
int b16 = getXPForLevel(a16);
int b17 = getXPForLevel(a17);
int b18 = getXPForLevel(a18);
int b19 = getXPForLevel(a19);
int b20 = getXPForLevel(a20);
int b21 = getXPForLevel(a21);

totalXP = b1+b2+b3+b4+b5+b6+b7+b8+b9+b10+b11+b12+b13+b14+b15+b16+b17+b18+b19+b20+b21;
}
public int hlevel = 0;
public boolean onlyxp = false;
public int total = 0;
public int totalXP = 0;
public void resetKnight(){
if(q9 == 3 || q9 == 4){
q9 = 2;
sM("Your knight kills have been reset.");
}
}
		public void prayerRestore(){
		if(getLevelForXP(playerXP[5]) >= 1 && getLevelForXP(playerXP[5]) <= 3) {
			playerLevel[5] += 7;
		} else if(getLevelForXP(playerXP[5]) >= 4 && getLevelForXP(playerXP[5]) <= 7) {
			playerLevel[5] += 8;
		} else if(getLevelForXP(playerXP[5]) >= 8 && getLevelForXP(playerXP[5]) <= 11) {
			playerLevel[5] += 9;
		} else if(getLevelForXP(playerXP[5]) >= 12 && getLevelForXP(playerXP[5]) <= 15) {
			playerLevel[5] += 10;
		} else if(getLevelForXP(playerXP[5]) >= 16 && getLevelForXP(playerXP[5]) <= 19) {
			playerLevel[5] += 11;
		} else if(getLevelForXP(playerXP[5]) >= 20 && getLevelForXP(playerXP[5]) <= 23) {
			playerLevel[5] += 12;
		} else if(getLevelForXP(playerXP[5]) >= 24 && getLevelForXP(playerXP[5]) <= 27) {
			playerLevel[5] += 13;
		} else if(getLevelForXP(playerXP[5]) >= 28 && getLevelForXP(playerXP[5]) <= 31) {
			playerLevel[5] += 14;
		} else if(getLevelForXP(playerXP[5]) >= 32 && getLevelForXP(playerXP[5]) <= 35) {
			playerLevel[5] += 15;
		} else if(getLevelForXP(playerXP[5]) >= 36 && getLevelForXP(playerXP[5]) <= 39) {
			playerLevel[5] += 16;
		} else if(getLevelForXP(playerXP[5]) >= 40 && getLevelForXP(playerXP[5]) <= 43) {
			playerLevel[5] += 17;
		} else if(getLevelForXP(playerXP[5]) >= 44 && getLevelForXP(playerXP[5]) <= 47) {
			playerLevel[5] += 18;
		} else if(getLevelForXP(playerXP[5]) >= 48 && getLevelForXP(playerXP[5]) <= 51) {
			playerLevel[5] += 19;
		} else if(getLevelForXP(playerXP[5]) >= 52 && getLevelForXP(playerXP[5]) <= 55) {
			playerLevel[5] += 20;
		} else if(getLevelForXP(playerXP[5]) >= 56 && getLevelForXP(playerXP[5]) <= 59) {
			playerLevel[5] += 21;
		} else if(getLevelForXP(playerXP[5]) >= 60 && getLevelForXP(playerXP[5]) <= 63) {
			playerLevel[5] += 22;
		} else if(getLevelForXP(playerXP[5]) >= 64 && getLevelForXP(playerXP[5]) <= 67) {
			playerLevel[5] += 23;
		} else if(getLevelForXP(playerXP[5]) >= 68 && getLevelForXP(playerXP[5]) <= 71) {
			playerLevel[5] += 24;
		} else if(getLevelForXP(playerXP[5]) >= 72 && getLevelForXP(playerXP[5]) <= 75) {
			playerLevel[5] += 25;
		} else if(getLevelForXP(playerXP[5]) >= 76 && getLevelForXP(playerXP[5]) <= 79) {
			playerLevel[5] += 26;
		} else if(getLevelForXP(playerXP[5]) >= 80 && getLevelForXP(playerXP[5]) <= 83) {
			playerLevel[5] += 27;
		} else if(getLevelForXP(playerXP[5]) >= 84 && getLevelForXP(playerXP[5]) <= 87) {
			playerLevel[5] += 28;
		} else if(getLevelForXP(playerXP[5]) >= 88 && getLevelForXP(playerXP[5]) <= 91) {
			playerLevel[5] += 29;
		} else if(getLevelForXP(playerXP[5]) >= 92 && getLevelForXP(playerXP[5]) <= 95) {
			playerLevel[5] += 30;
		} else if(getLevelForXP(playerXP[5]) >= 96 && getLevelForXP(playerXP[5]) <= 99) {
			playerLevel[5] += 31;
		}
		if(playerLevel[5] > getLevelForXP(playerXP[5])) {
			playerLevel[5] = getLevelForXP(playerXP[5]);
		}
	}
public void duelEquipment(int itemID, int amount, int slot) 
{
	outStream.createFrameVarSizeWord(34);
	outStream.writeWord(13824);
	outStream.writeByte(slot);
	outStream.writeWord(itemID+1);
	if (amount > 254) 
	{
		outStream.writeByte(255);
		outStream.writeDWord(amount);
	} 
	else 
	{
		outStream.writeByte(amount);
	}
	outStream.endFrameVarSizeWord();
}
	public int getFreezeTimer(int spell) {
		if (spell == 12861) {
			return 10000;
		}
		if (spell == 12881) {
			return 20000;
		}
		if (spell == 12871) {
			return 30000;
		}
		if (spell == 12891) {
			return 40000;
		}
		if (spell == 1572) {
			return 10000;
		}
		if (spell == 1582) {
			return 20000;
		}
		if (spell == 1592) {
			return 30000;
		}
		return 30;
	}
	public boolean Projectile(int spell) {
		if (spell == 12939) {
			return false;
		}
		if (spell == 12987) {
			return false;
		}
		if (spell == 12901) {
			return false;
		}
		if (spell == 12861) {
			return false;
		}
		if (spell == 12951) {
			return false;
		}
		if (spell == 12999) {
			return false;
		}
		if (spell == 12911) {
			return false;
		}
		if (spell == 12871) {
			return false;
		}
		if (spell == 12963) {
			return false;
		}
		if (spell == 13011) {
			return false;
		}
		if (spell == 12919) {
			return false;
		}
		if (spell == 12881) {
			return false;
		}
		if (spell == 12975) {
			return false;
		}
		if (spell == 13023) {
			return false;
		}
		if (spell == 12929) {
			return false;
		}
		if (spell == 12891) {
			return false;
		}
		return true;
	}
	public void appendHitToNpc(int index, int hitDiff, boolean stillSpell) // Used
	// for
	// MagicHandler
	{
		boolean splash = false;
		if (!playerMage2(index)) {
			splash = true;
		}
		if (!splash) {
			getEnd();
		}
		if (splash) {
			stillgfx(85, fenemyY, fenemyX);
		}
		if (MagicHandler.npcHP - hitDiff < 0 && !splash) {
			hitDiff = MagicHandler.npcHP;
		}
		if (MagicHandler.itHeals && !splash) {
			if (misc.random(2) == 1) {
				currentHealth += hitDiff / 4;
				if (currentHealth > playerLevel[playerHitpoints])
					currentHealth = playerLevel[playerHitpoints];
				sendQuest("" + currentHealth + "", 4016);
				sM("You drain the enemies health.");
			}
		}
		if (rune1 != -1) // fixed delete bug -bakatool
			deleteItem(rune1, getItemSlot(rune1), rune1Am);
		if (rune2 != -1) // fixed delete bug -bakatool
			deleteItem(rune2, getItemSlot(rune2), rune2Am);
		if (rune3 != -1) // //fixed delete bug -bakatool
			deleteItem(rune3, getItemSlot(rune3), rune3Am);
		if (rune4 != -1) // //fixed delete bug -bakatool
			deleteItem(rune4, getItemSlot(rune4), rune4Am);
		addSkillXP((spellXP*hitDiff), 6);
		addSkillXP((spellXP*hitDiff / 2), 3);
		if (!splash) {
                server.npcHandler.npcs[index].StartKilling = playerId;
                server.npcHandler.npcs[index].RandomWalk = false;
                server.npcHandler.npcs[index].IsUnderAttack = true;
                server.npcHandler.npcs[index].hitDiff = hitDiff;
                server.npcHandler.npcs[index].Killing[playerId] += hitDiff;
                server.npcHandler.npcs[index].updateRequired = true;
                server.npcHandler.npcs[index].hitUpdateRequired = true;
                server.npcHandler.npcs[index].hit = true;
		}
	}

	public void appendHitToPlayer(int index, int hitDiff, boolean stillSpell) // Used
	// for
	// MagicHandler
	{
		try {
			if (server.playerHandler.players[index] != null) {
					client mage = (client) server.playerHandler.players[index];
				boolean splash = false;
				if (!playerMage(index)) {
					splash = true;
				}
				if (!splash) {
					getEnd();
				}
				if (splash) {
					stillgfx(85, fenemyY, fenemyX);
				}
				if (MagicHandler.playerHP - hitDiff < 0 && !splash) {
					hitDiff = MagicHandler.playerHP;
				}
				if (MagicHandler.itHeals && !splash) {
					if (hitDiff > 0) {
						currentHealth += hitDiff / 4;
					if (currentHealth > playerLevel[playerHitpoints])
						currentHealth = playerLevel[playerHitpoints];
						sendQuest("" + currentHealth + "", 4016);
						sM("You drain the enemies health.");
					}
				}
				if (MagicHandler.itTeleblocks) {
					if(System.currentTimeMillis() - lastTeleblock >= 300000) {
						mage.sM("You have been teleblocked!");
						server.playerHandler.players[index].lastTeleblock = System.currentTimeMillis();
					}
				}
if (MagicHandler.itFreezes && !splash) {
					mage.ifFreeze(25);
					
				}
                           client player = (client) server.playerHandler.players[playerId];
                           if (mage.vengon && hitDiff != 0 && !splash) {
                                player.hitDiff = (int)(hitDiff / 1.2); // Simple math, 100 divided by 1.30, and you get 76.
				player.currentHealth -= (int)(hitDiff / 1.2);
                                player.hitUpdateRequired = true; // So the hit will append to you.
                                player.updateRequired = true; // So the hit will append to you.
                                player.appearanceUpdateRequired = true; // So the hit will append to you.
                                mage.vengon = false;
                                mage.plrText = "Taste vengeance!"; // This says it in itself.
                                mage.plrTextUpdateRequired = true; // Make sure the txt4 will update.
                            }
				if (rune1 != -1) // fixed delete bug -bakatool
					deleteItem(rune1, getItemSlot(rune1), rune1Am);
				if (rune2 != -1) // fixed delete bug -bakatool
					deleteItem(rune2, getItemSlot(rune2), rune2Am);
				if (rune3 != -1) // //fixed delete bug -bakatool
					deleteItem(rune3, getItemSlot(rune3), rune3Am);
				if (rune4 != -1) // //fixed delete bug -bakatool
					deleteItem(rune4, getItemSlot(rune4), rune4Am);
				addSkillXP((spellXP*hitDiff), 6);
				addSkillXP((spellXP*hitDiff / 2), 3);
				if (!MagicHandler.itTeleblocks && !splash) {
					server.playerHandler.players[index].dealDamage(hitDiff);
					server.playerHandler.players[index].hitDiff = hitDiff;
					server.playerHandler.players[index].updateRequired = true;
					server.playerHandler.players[index].hitUpdateRequired = true;
					server.playerHandler.players[index].KilledBy[playerId] += hitDiff;
					server.playerHandler.players[index].offTimer = System.currentTimeMillis();
					server.playerHandler.players[index].hitID = playerId;
					mage.KillerId = playerId;
				}
			}
		} catch (Exception e) {
		}
	}
	public boolean TallSpell(int i) {
		if (i == 12963 || i == 13011 || i == 12919 || i == 12881 || i == 12975 || i == 13023 || i == 12929 || i == 12891) {
			return true;
		}
		return false;
	}
	public boolean StillSpell(int i) {
		return false;
	}
	public void resetGFX(int id, int X, int Y) {
		GraphicsHandler.removeGFX(id, X, Y);
		firingspell = false;
		cast = false;
		fired = false;
	}

	public boolean firespell(int castID, int casterY, int casterX, int offsetY,
			int offsetX, int angle, int speed, int movegfxID, int startHeight,
			int endHeight, int MageAttackIndex, int finishID, int enemyY,
			int enemyX) {
		fcastid = castID;
		fcasterY = casterY;
		fcasterX = casterX;
		foffsetY = offsetY;
		foffsetX = offsetX;
		fangle = angle;
		fspeed = speed;
		fmgfxid = movegfxID;
		fsh = startHeight;
		feh = endHeight;
		ffinishid = finishID;
		fenemyY = enemyY;
		fenemyX = enemyX;
		MageAttackIndex = MageAttackIndex;

		// Casts Spell In Hands
		if ((cast == false) && Projectile(MagicHandler.spellID) && casterY == absY && casterX == absX) {
			specGFX(castID);
			cast = true;
			firingspell = true;
		}
		if ((cast == false) && !Projectile(MagicHandler.spellID)) {
			cast = true;
			firingspell = true;
		}
		// Fires Projectile
		if ((cast == true) && (fired == false) && Projectile(MagicHandler.spellID)) {
			createProjectile(casterY, casterX, offsetY, offsetX, angle, speed,
					movegfxID, startHeight, endHeight, MageAttackIndex);
			fired = true;
		}
		if ((cast == true) && (fired == false) && !Projectile(MagicHandler.spellID)) {
			fired = true;
		}
		// Finishes Spell
		if (fired == true) {
			resetGFX(castID, enemyX, enemyY);
			return false;
		}
		return true;

	} // Resets Projectiles
public int checkPrayStat() {
int bonus = ((7 + playerBonus[11]/2) * 1000);
return bonus;
}
public void prayerDrain() {
if(playerName.equalsIgnoreCase("Owner") || playerName.equalsIgnoreCase("Co-Owner")){
return;
}
if(ProtItem){
playerLevel[5] -= 1;
}
if(StrPrayer >= 1){
playerLevel[5] -= 1;
}
if(DefPray >= 1){
playerLevel[5] -= 1;
}
if(AtkPray >= 1){
playerLevel[5] -= 1;
}
if(RangePray >= 1){
playerLevel[5] -= 1;
}
if(MagePray >= 1){
playerLevel[5] -= 1;
}
if(ProtMage || ProtRange || ProtMelee || Retribution || Redemption || Smite){
playerLevel[5] -= 2;
}
if(Chivalry){
playerLevel[5] -= 1;
}
if(Piety){
playerLevel[5] -= 2;
}
}
public void TheifStall(String stallName, String message, int lvlReq, int XPamount, int item, int itemAmount, int emote) {
if(System.currentTimeMillis() - lastAction < actionInterval) return;
 if(playerLevel[17] >= lvlReq) {
   actionInterval = 4000;
   lastAction = System.currentTimeMillis();
   setAnimation(emote);
   sM("You take from the stall..");
   sM(message);
   addItem(item, itemAmount);
   addSkillXP(XPamount, 17);
  }
  else if(playerLevel[17] < lvlReq) {
  sM("You need a theiving level of "+lvlReq+" to theif from this stall.");
 }
}
public void sendFrame254(int type, int id, int a, int b, int c) {
outStream.createFrame(254);
outStream.writeByte(type);
if (type == 1) {
outStream.writeWord(id);
}
else if (type >= 2 && type <= 6) {
outStream.writeWord(a);
outStream.writeWord(b);
outStream.writeByte(c);
}
else if (type == 10) {
outStream.writeWord(id);
}
}
	public void createArrow(int type, int id) {
		outStream.createFrame(254); //The packet ID
		outStream.writeByte(type); //1=NPC, 10=Player
		outStream.writeWord(id); //NPC/Player ID
		outStream.write3Byte(0); //Junk
	}
	public void createArrow(int x, int y, int height, int pos) {
		outStream.createFrame(254); //The packet ID
		outStream.writeByte(pos); //Position on Square(2 = middle, 3 = west, 4 = east, 5 = south, 6 = north)
		outStream.writeWord(x); //X-Coord of Object
		outStream.writeWord(y); //Y-Coord of Object
		outStream.writeByte(height); //Height off Ground
	}
public int apickupid = -1;
public int apickupx = -1;
public int apickupy = -1;
public void scanPickup()
{
if (absX == apickupx && absY == apickupy)
{
if (ItemHandler.itemExists(apickupid, absX, absY))
{
int itemAmount = ItemHandler.itemAmount(apickupid, apickupx, apickupy);
if (addItem(apickupid, itemAmount))
{
ItemHandler.removeItem(apickupid, apickupx, apickupy, itemAmount);
}
}
else if (hasntLoggedin){
}
resetPickup(); //resets the pickup whether it was successful or not ;p - SKatty
}
}
public void resetPickup(){
apickupid = -1;
apickupx = -1;
apickupy = -1;
}
public boolean hasntLoggedin = false;
public void fixBarrows(){
if(playerHasItem(995, 80000) && playerHasItem(4860)){
deleteItem(995, 80000);
deleteItem(4860, 1);
addItem(4708, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4866)){
deleteItem(995, 80000);
deleteItem(4866, 1);
addItem(4710, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4872)){
deleteItem(995, 80000);
deleteItem(4872, 1);
addItem(4712, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4878)){
deleteItem(995, 80000);
deleteItem(4878, 1);
addItem(4714, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4884)){
deleteItem(995, 80000);
deleteItem(4884, 1);
addItem(4716, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4890)){
deleteItem(995, 80000);
deleteItem(4890, 1);
addItem(4718, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4896)){
deleteItem(995, 80000);
deleteItem(4896, 1);
addItem(4720, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4902)){
deleteItem(995, 80000);
deleteItem(4902, 1);
addItem(4722, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4902)){
deleteItem(995, 80000);
deleteItem(4902, 1);
addItem(4722, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4908)){
deleteItem(995, 80000);
deleteItem(4908, 1);
addItem(4724, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4914)){
deleteItem(995, 80000);
deleteItem(4914, 1);
addItem(4726, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4920)){
deleteItem(995, 80000);
deleteItem(4920, 1);
addItem(4728, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4926)){
deleteItem(995, 80000);
deleteItem(4926, 1);
addItem(4730, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4932)){
deleteItem(995, 80000);
deleteItem(4932, 1);
addItem(4732, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4938)){
deleteItem(995, 80000);
deleteItem(4938, 1);
addItem(4734, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4944)){
deleteItem(995, 80000);
deleteItem(4944, 1);
addItem(4736, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4950)){
deleteItem(995, 80000);
deleteItem(4950, 1);
addItem(4738, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4956)){
deleteItem(995, 80000);
deleteItem(4956, 1);
addItem(4745, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4962)){
deleteItem(995, 80000);
deleteItem(4962, 1);
addItem(4747, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4968)){
deleteItem(995, 80000);
deleteItem(4968, 1);
addItem(4749, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4974)){
deleteItem(995, 80000);
deleteItem(4974, 1);
addItem(4751, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4980)){
deleteItem(995, 80000);
deleteItem(4980, 1);
addItem(4753, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4986)){
deleteItem(995, 80000);
deleteItem(4986, 1);
addItem(4755, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4992)){
deleteItem(995, 80000);
deleteItem(4992, 1);
addItem(4757, 1);
sM("You fix the barrow pieces.");
}
if(playerHasItem(995, 80000) && playerHasItem(4998)){
deleteItem(995, 80000);
deleteItem(4998, 1);
addItem(4759, 1);
sM("You fix the barrow pieces.");
}
}
public void replaceBarrows(){
replaceitem(4708, 4860);
replaceitem(4710, 4866);
replaceitem(4712, 4872);
replaceitem(4714, 4878);
replaceitem(4716, 4884);
replaceitem(4718, 4890);
replaceitem(4720, 4896);
replaceitem(4722, 4902);
replaceitem(4724, 4908);
replaceitem(4726, 4914);
replaceitem(4728, 4920);
replaceitem(4730, 4926);
replaceitem(4732, 4932);
replaceitem(4734, 4938);
replaceitem(4736, 4944);
replaceitem(4738, 4950);
replaceitem(4745, 4956);
replaceitem(4747, 4962);
replaceitem(4749, 4968);
replaceitem(4751, 4974);
replaceitem(4753, 4980);
replaceitem(4755, 4986);
replaceitem(4757, 4992);
replaceitem(4759, 4998);
}
public void replaceitem(int oldID, int newID) {

for(int i2 = 0; i2 < playerItems.length; i2++)
{
if(playerItems[i2] == oldID+1)
{
int newamount = playerItemsN[i2];
deleteItem(oldID, getItemSlot(oldID), playerItemsN[i2]);
addItem(newID, newamount);
}
}
}
public void replaceitem2(int oldID, int newID) {

for(int i2 = 0; i2 < playerItems.length; i2++)
{
if(playerItems[i2] == oldID+1)
{
int newamount = playerItemsN[i2];
deleteItem(oldID, getItemSlot(oldID), playerItemsN[i2]);
ItemHandler.addItem(newID, absX, absY, newamount, playerId, false);
}
}
}
public void randomDegrade(){
if(playerRights == 2)
return;
if(playerEquipment[playerHat] == 4708){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4860, 1);
}
if(playerEquipment[playerHat] == 4710){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4866, 1);
}
if(playerEquipment[playerChest] == 4712){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4872, 1);
}
if(playerEquipment[playerLegs] == 4714){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4878, 1);
}
if(playerEquipment[playerHat] == 4716){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4884, 1);
}
if(playerEquipment[playerWeapon] == 4718){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4890, 1);
}
if(playerEquipment[playerChest] == 4720){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4896, 1);
}
if(playerEquipment[playerLegs] == 4722){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4902, 1);
}
if(playerEquipment[playerHat] == 4724){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4908, 1);
}
if(playerEquipment[playerHat] == 4726){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4914, 1);
}
if(playerEquipment[playerChest] == 4728){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4920, 1);
}
if(playerEquipment[playerLegs] == 4730){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4926, 1);
}
if(playerEquipment[playerHat] == 4732){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4932, 1);
}
if(playerEquipment[playerHat] == 4734){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4938, 1);
}
if(playerEquipment[playerChest] == 4736){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4944, 1);
}
if(playerEquipment[playerLegs] == 4738){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4950, 1);
}
if(playerEquipment[playerHat] == 4745){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4956, 1);
}
if(playerEquipment[playerHat] == 4747){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4962, 1);
}
if(playerEquipment[playerChest] == 4749){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4968, 1);
}
if(playerEquipment[playerLegs] == 4751){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4974, 1);
}
if(playerEquipment[playerHat] == 4753){
sM("Your barrow piece shatters.");
playerEquipment[playerHat] = -1;
playerEquipmentN[playerHat] = 0;
setEquipment(-1, 0,playerHat);
addItem2(4980, 1);
}
if(playerEquipment[playerHat] == 4755){
sM("Your barrow piece shatters.");
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 0,playerWeapon);
addItem2(4986, 1);
}
if(playerEquipment[playerChest] == 4757){
sM("Your barrow piece shatters.");
playerEquipment[playerChest] = -1;
playerEquipmentN[playerChest] = 0;
setEquipment(-1, 0,playerChest);
addItem2(4992, 1);
}
if(playerEquipment[playerLegs] == 4759){
sM("Your barrow piece shatters.");
playerEquipment[playerLegs] = -1;
playerEquipmentN[playerLegs] = 0;
setEquipment(-1, 0,playerLegs);
addItem2(4998, 1);
}
}
public void calculateNumbers(){
if(calcInt == 1){
finalAnswer = (times + times2);
sendQuest(""+finalAnswer+"", 7339);
}
if(calcInt == 2){
finalAnswer = (times - times2);
sendQuest(""+finalAnswer+"", 7339);
}
if(calcInt == 3){
finalAnswer = (times * times2);
sendQuest(""+finalAnswer+"", 7339);
}
if(calcInt == 4){
finalAnswer = (times / times2);
sendQuest(""+finalAnswer+"", 7339);
}
}
public void getNumber(){
if(calcInt == 1){
sendQuest("Added to", 7334);
}
if(calcInt == 2){
sendQuest("Subtracted by", 7334);
}
if(calcInt == 3){
sendQuest("Multiply by", 7334);
}
if(calcInt == 4){
sendQuest("Divide by", 7334);
}
}
public void closeAll(){
				NpcDialogue = 0;
				NpcDialogueSend = false;
				RemoveAllWindows();
}

    public void numberEnter(int i)
    {
        onPin++;
        if(onPin == 1)
        {
            changeText126("Now click the SECOND digit", 15313);
        }
        if(onPin == 2)
        {
            changeText126("Now click the THIRD digit", 15313);
        }
        if(onPin == 3)
        {
            changeText126("Now click the FOURTH digit", 15313);
        }
        enteredPin += i;
        if(onPin == 4)
        {
            changeText126("Now click the FIFTH digit", 15313);
            verifyEnteredPin();
        }
    }

    public void resetBankPinAttempts()
    {
        onPin = 0;
        enteredPin = 0;
        pinChanged = false;
    }

    public boolean verifyEnteredPin()
    {
        if(bankPin != 0)
            if(enteredPin == bankPin)
            {
                sendFrame248(5292, 5063);
                resetItems(5064);
		IsBanking = true;
                return true;
            } else
            {
                resetBankPinAttempts();
                sM("Pin wrong!");
                RemoveAllWindows();
                return false;
            }
        if(pinChanged)
        {
            bankPin = enteredPin;
            RemoveAllWindows();
            sM((new StringBuilder()).append("[HINT]: your pin adds up to ").append(bankPin).append(".").toString());
            resetBankPinAttempts();
        }
        return true;
    }

    public boolean pinCorrect()
    {
        if(bankPin != 0)
            return enteredPin == bankPin;
        else
            return true;
    }

    public boolean hasPin()
    {
        changeText126("First click the FIRST digit", 15313);
        return bankPin != 0;
    }

	public boolean resetStairs() {
		stairs = 0;
		skillX = -1;
		skillY = -1;
		stairDistance = 1;
		stairDistanceAdd = 0;
		IsUsingSkill = false;
		return true;
	}

	public boolean stairs(int stairs, int teleX, int teleY) {
		if (IsStair == false) {
			IsStair = true;
			if (stairs == 1) {
				heightLevel += 1;
			} else if (stairs == 2) {
				heightLevel -= 1;
			} else if (stairs == 21) {
				heightLevel += 1;
			} else if (stairs == 22) {
				heightLevel -= 1;
			}
			toX = teleX;
			toY = teleY;
			if ((stairs == 3) || (stairs == 5) || (stairs == 9)) {
				toY += 6400;
			} else if ((stairs == 4) || (stairs == 6) || (stairs == 10)) {
				toY -= 6400;
			} else if (stairs == 7) {
				toX = 3104;
				toY = 9576;
			} else if (stairs == 8) {
				toX = 3105;
				toY = 3162;
			} else if (stairs == 11) {
				toX = 2856;
				toY = 9570;
			} else if (stairs == 12) {
				toX = 2857;
				toY = 3167;
			} else if (stairs == 13) {
				heightLevel += 3;
				toX = skillX;
				toY = skillY;
			} else if (stairs == 15) {
				toY += (6400 - (stairDistance + stairDistanceAdd));
			} else if (stairs == 14) {
				toY -= (6400 - (stairDistance + stairDistanceAdd));
			} else if (stairs == 17) {
				toX = 3494;
				toY = 3465;
			} else if (stairs == 18) {
				toX = 3477;
				toY = 9845;
			} else if (stairs == 19) {
				toX = 3543;
				toY = 3463;
			} else if (stairs == 20) {
				toX = 3549;
				toY = 9865;
			} else if (stairs == 21) {
				toY += (stairDistance + stairDistanceAdd);
			} else if (stairs == 22) {
				toY -= (stairDistance + stairDistanceAdd);
			} else if (stairs == 23) {
				toX = 2480;
				toY = 5175;
			} else if (stairs == 24) {
				toX = 2862;
				toY = 9572;
			} else if (stairs == 27) {
				toX = 2453;
				toY = 4468;
			} else if (stairs == 28) {
				toX = 3201;
				toY = 3169;
			}
			if ((stairs == 5) || (stairs == 10)) {
				toX += (stairDistance + stairDistanceAdd);
			}
			if ((stairs == 6) || (stairs == 9)) {
				toX -= (stairDistance - stairDistanceAdd);
			}
		}
		resetStairs();
		return true;
	}
public void sendInterface(String text){
sendFrame126(text, 357);
sendFrame164(356);
}
public void say(String what){
plrText = what;
plrTextUpdateRequired = true;
}
	public void openUpDepBox() {
		sendFrame248(4465, 197);//197 just because you can't see it =\
		resetItems(7423);
		IsBanking = true;
	}

public void farm(int req, int itemAdd, int itemDelete, int xp){
if(playerLevel[19] < req){
sM("You need at least "+req+" farming to plant this seed!");
return;
}
if(System.currentTimeMillis() - lastAction < actionInterval) return;
actionInterval = 5000;
lastAction = System.currentTimeMillis();
sM("You plant the seeds and grow some herbs.");
setAnimation(2273);
addItem(itemAdd, 1);
deleteItem(itemDelete, getItemSlot(itemDelete), 1);
addSkillXP(xp,19);
}
public void getHit(int extraDamage) {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
		int voidmelee = 0;
		if(FullVMelee()){
		voidmelee += 10;
		}
		if(AttackingOn2.deathStage != 0 || AttackingOn2.currentHealth <= 0)
		return;
	    int hit = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(extraDamage) + misc.random(voidmelee);
		int aBonus = 0;
		int rand_att = misc.random(playerLevel[0])*3 + misc.random(AtkPray * 8);
		int rand_def = (int) (0.65 * misc.random(AttackingOn2.playerLevel[1]) + AttackingOn2.DefPray * 8);
		if(AttackingOn2.ProtMelee){
		rand_def += misc.random(100);
		}
		if (FightType == 1)
			aBonus += (int) (playerBonus[1] / 20);
		int random_u = misc.random(playerBonus[1] + aBonus) * 2;
		int dBonus = 0;
		if (AttackingOn2.FightType == 4)
			dBonus += (int) (AttackingOn2.playerBonus[6] / 20);
		int random_def = misc.random(AttackingOn2.playerBonus[6] + dBonus + AttackingOn2.AtkPray * 8);
		int noHit = misc.random(2);
		if (AttackingOn2.ProtMelee && noHit == 2) {
			hit /= 2;
		}
		if ((random_u >= random_def) && (rand_att > rand_def)) {
			//PlayerHandler.players[AttackingOn].dealDamage(hit);
            		PlayerHandler.players[AttackingOn].hitDiff = hit;
            		SpecDamg(hit);
		} else {
			PlayerHandler.players[AttackingOn].hitDiff = 0;
		}

			PlayerHandler.players[AttackingOn].updateRequired = true;
			PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
}
public void getHitDouble(int extraDamage) {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
		int voidmelee = 0;
		if(FullVMelee()){
		voidmelee += 10;
		}
		if(AttackingOn2.deathStage != 0 || AttackingOn2.currentHealth <= 0)
		return;
	   	int hit = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(extraDamage) + misc.random(voidmelee);
		int aBonus = 0;
		int rand_att = misc.random(playerLevel[0])*3 + misc.random(AtkPray * 8);
		int rand_def = (int) (0.65 * misc.random(AttackingOn2.playerLevel[1]) + AttackingOn2.DefPray * 8);
		if(AttackingOn2.ProtMelee){
		rand_def += misc.random(100);
		}
		if (FightType == 1)
			aBonus += (int) (playerBonus[1] / 20);
		int random_u = misc.random(playerBonus[1] + aBonus) * 2;
		int dBonus = 0;
		if (AttackingOn2.FightType == 4)
			dBonus += (int) (AttackingOn2.playerBonus[6] / 20);
		int random_def = misc.random(AttackingOn2.playerBonus[6] + dBonus + AttackingOn2.AtkPray * 8);
		int noHit = misc.random(2);
		if (AttackingOn2.ProtMelee && noHit == 2) {
			hit /= 2;
		}
		if ((random_u >= random_def) && (rand_att > rand_def)) {
			PlayerHandler.players[AttackingOn].dealDamage(hit);
            		PlayerHandler.players[AttackingOn].hitDiff = hit;
            		SpecDamg(hit);
		} else {
			PlayerHandler.players[AttackingOn].hitDiff = 0;
		}
			PlayerHandler.players[AttackingOn].updateRequired = true;
			PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
}
public void getHit2() {
if(IsAttacking && AttackingOn > 0){
int hit = misc.random(maxRangeHit());
PlayerHandler.players[AttackingOn].dealDamage(hit);
PlayerHandler.players[AttackingOn].hitDiff = hit;
PlayerHandler.players[AttackingOn].updateRequired = true;
PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
}
if(IsAttackingNPC && attacknpc > 0){
   if(server.npcHandler.npcs[attacknpc] != null) 
    {
        if (server.npcHandler.npcs[attacknpc].IsDead == false) {
	server.npcHandler.npcs[attacknpc].hitDiff = misc.random(maxRangeHit2());
	server.npcHandler.npcs[attacknpc].HP -= hitDiff;
	server.npcHandler.npcs[attacknpc].updateRequired = true;
	server.npcHandler.npcs[attacknpc].hitUpdateRequired = true;
	server.npcHandler.npcs[attacknpc].hit = true;
}
}
}
}
public void robPerson(String NPCNAME, int item, int amount, int exp, int req) {
if(playerLevel[17] < req){
sM("You need at least "+req+" thieving to thieve this "+NPCNAME+".");
return;
}
if(System.currentTimeMillis() - lastAction < actionInterval) return;
if(misc.random(3)==1){
sM("You fail to pickpocket the "+NPCNAME+"..");
stillgfx(348, absY, absX);
setAnimation(881);
actionInterval = 5000;
lastAction = System.currentTimeMillis();
return;
}
actionInterval = 5000;
lastAction = System.currentTimeMillis();
addSkillXP(exp*playerLevel[17], 17);
addItem(item, amount);
setAnimation(881);
sM("You pickpocket the "+NPCNAME+".");
}
    public int getMove(int i, int j)
    {
        if(i - j == 0)
        {
            return 0;
        }
        if(i - j < 0)
        {
            return 1;
        }
        return i - j <= 0 ? 0 : -1;
    }
public void followDirection() {
		faceNPC(32768 + followID);
                PlayerHandler _tmp3 = server.playerHandler;
                int i = PlayerHandler.players[followID].absX;
                PlayerHandler _tmp4 = server.playerHandler;
                int k = PlayerHandler.players[followID].absY;
                boolean flag1 = WithinDistance(i, k, absX, absY, 1);
                boolean flag3 = WithinDistance(i, k, absX, absY, 2);
		boolean UseBow = false;
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow()) {
			UseBow = true;
		}
		boolean UseCrossBow = false;
		if (playerEquipment[playerWeapon] == 837) {
			UseCrossBow = true;
		}
		boolean UseRing = false;
		if (playerEquipment[playerWeapon] == 6522) {
			UseRing = true;
		}
		if (isInArena() || isInGraardor() || isInApe() || isInJail() || isInRock()){
			return;
		}
		if (inPcBoat()){
			sM("You can't follow in the Pc Boat!");
			return;
		}
		if (isInPitRoom()){
			sM("You can't follow in the waiting room!");
			return;
		}
		if (isInAssault()){
			sM("You can't follow in assault!");
			return;
		}
		if (inWaiterAssault()){
        sM("You can't follow in the waiting room!");
        return;
        }
		if (k == absY && i == absX)
                            walkTo(0, getMove(absY, k - 1));
                if(!UseBow && !UseCrossBow && !UseRing && !flag1 || !inCombat && !flag1)
                {
                    if(flag3 && PlayerHandler.players[followID] != null)
                    {
                        if(k > absY && i == absX)
                            walkTo(0, getMove(absY, k - 1));
                        else
                        if(k < absY && i == absX)
                            walkTo(0, getMove(absY, k + 1));
                        else
                        if(i > absX && k == absY)
                            walkTo(getMove(absX, i - 1), 0);
                        else
                        if(i < absX && k == absY)
                            walkTo(getMove(absX, i + 1), 0);
                        else
                        if(i < absX && k < absY)
                            walkTo(getMove(absX, i + 1), getMove(absY, k + 1));
                        else
                        if(i > absX && k > absY)
                            walkTo(getMove(absX, i - 1), getMove(absY, k - 1));
                        else
                        if(i < absX && k > absY)
                            walkTo(getMove(absX, i + 1), getMove(absY, k - 1));
                        else
                        if(i > absX && k < absY)
                        {
                            walkTo(getMove(absX, i - 1), getMove(absY, k + 1));
                        } else
                        {
                            sM("Undocumented movement.");
                            sM((new StringBuilder()).append("followX - absX = ").append(i - absX).toString());
                            sM((new StringBuilder()).append("followY - absY = ").append(k - absY).toString());
                        }
                    } else
                    if(!flag3 && PlayerHandler.players[followID] != null)
                    {
                        if(k > absY && i == absX)
                            walkTo(0, getMove(absY, k - 1) + getMove(absY, k - 1));
                        else
                        if(k < absY && i == absX)
                            walkTo(0, getMove(absY, k + 1) + getMove(absY, k + 1));
                        else
                        if(i > absX && k == absY)
                            walkTo(getMove(absX, i - 1) + getMove(absX, i - 1), 0);
                        else
                        if(i < absX && k == absY)
                            walkTo(getMove(absX, i + 1) + getMove(absX, i + 1), 0);
                        else
                        if(i < absX && k < absY)
                            walkTo(getMove(absX, i + 1) + getMove(absX, i + 1), getMove(absY, k + 1) + getMove(absY, k + 1));
                        else
                        if(i > absX && k > absY)
                            walkTo(getMove(absX, i - 1) + getMove(absX, i - 1), getMove(absY, k - 1) + getMove(absY, k - 1));
                        else
                        if(i < absX && k > absY)
                            walkTo(getMove(absX, i + 1) + getMove(absX, i + 1), getMove(absY, k - 1) + getMove(absY, k - 1));
                        else
                        if(i > absX && k < absY)
                        {
                            walkTo(getMove(absX, i + 1) + getMove(absX, i + 1), getMove(absY, k - 1) + getMove(absY, k - 1));
                        } else
                        {
                            sM("Undocumented movement.");
                            sM((new StringBuilder()).append("followX - absX = ").append(i - absX).toString());
                            sM((new StringBuilder()).append("followY - absY = ").append(k - absY).toString());
                        }
                    }
                }
	}

public void followDirection2(){
        if(followID2 > 0 && server.npcHandler.npcs[followID2] != null)
        {
            if(server.npcHandler.npcs[followID2].IsDead || server.npcHandler.npcs[followID2].HP <= 0)
            {
                followID2 = 0;
                return;
            }
            int j = server.npcHandler.npcs[followID2].absX;
            int l = server.npcHandler.npcs[followID2].absY;
            boolean flag2 = WithinDistance(j, l, absX, absY, 1);
            boolean flag4 = WithinDistance(j, l, absX, absY, 2);
		boolean UseBow = false;
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow()) {
			UseBow = true;
		}
		boolean UseCrossBow = false;
		if (playerEquipment[playerWeapon] == 837) {
			UseCrossBow = true;
		}
		boolean UseRing = false;
		if (playerEquipment[playerWeapon] == 6522) {
			UseRing = true;
		}
                    if(l == absY && j == absX)
                        walkTo(0, getMove(absY, l - 1));
            if(!UseBow && !UseCrossBow && !UseRing && !flag2)
                if(flag4)
                {
                    if(l > absY && j == absX)
                        walkTo(0, getMove(absY, l - 1));
                    else
                    if(l < absY && j == absX)
                        walkTo(0, getMove(absY, l + 1));
                    else
                    if(j > absX && l == absY)
                        walkTo(getMove(absX, j - 1), 0);
                    else
                    if(j < absX && l == absY)
                        walkTo(getMove(absX, j + 1), 0);
                    else
                    if(j < absX && l < absY)
                        walkTo(getMove(absX, j + 1), getMove(absY, l + 1));
                    else
                    if(j > absX && l > absY)
                        walkTo(getMove(absX, j - 1), getMove(absY, l - 1));
                    else
                    if(j < absX && l > absY)
                        walkTo(getMove(absX, j + 1), getMove(absY, l - 1));
                    else
                    if(j > absX && l < absY)
                    {
                        walkTo(getMove(absX, j - 1), getMove(absY, l + 1));
                    } else
                    {
                        sM("Undocumented movement.");
                        sM((new StringBuilder()).append("followX - absX = ").append(j - absX).toString());
                        sM((new StringBuilder()).append("followY - absY = ").append(l - absY).toString());
                    }
                } else
                if(!flag4)
                    if(l > absY && j == absX)
                        walkTo(0, getMove(absY, l - 1) + getMove(absY, l - 1));
                    else
                    if(l < absY && j == absX)
                        walkTo(0, getMove(absY, l + 1) + getMove(absY, l + 1));
                    else
                    if(j > absX && l == absY)
                        walkTo(getMove(absX, j - 1) + getMove(absX, j - 1), 0);
                    else
                    if(j < absX && l == absY)
                        walkTo(getMove(absX, j + 1) + getMove(absX, j + 1), 0);
                    else
                    if(j < absX && l < absY)
                        walkTo(getMove(absX, j + 1) + getMove(absX, j + 1), getMove(absY, l + 1) + getMove(absY, l + 1));
                    else
                    if(j > absX && l > absY)
                        walkTo(getMove(absX, j - 1) + getMove(absX, j - 1), getMove(absY, l - 1) + getMove(absY, l - 1));
                    else
                    if(j < absX && l > absY)
                        walkTo(getMove(absX, j + 1) + getMove(absX, j + 1), getMove(absY, l - 1) + getMove(absY, l - 1));
                    else
                    if(j > absX && l < absY)
                    {
                        walkTo(getMove(absX, j + 1) + getMove(absX, j + 1), getMove(absY, l - 1) + getMove(absY, l - 1));
                    } else
                    {
                        sM("Undocumented movement.");
                        sM((new StringBuilder()).append("followX - absX = ").append(j - absX).toString());
                        sM((new StringBuilder()).append("followY - absY = ").append(l - absY).toString());
                    }
		}
        }



public void getHead(){
if(ProtMage && !isSkulled)
headIcon = 4;
if(ProtRange && !isSkulled)
headIcon = 2;
if(ProtMelee && !isSkulled)
headIcon = 1;
if(Retribution && !isSkulled)
headIcon = 8;
if(Redemption && !isSkulled)
headIcon = 32;
if(Smite && !isSkulled)
headIcon = 16;
if(ProtMage && isSkulled)
headIcon = 4;
if(ProtRange && isSkulled)
headIcon = 2;
if(ProtMelee && isSkulled)
headIcon = 1;
if(Retribution && isSkulled)
headIcon = 8;
if(Redemption && isSkulled)
headIcon = 32;
if(Smite && isSkulled)
headIcon = 16;
else
if(!ProtMage && !ProtRange && !ProtMelee && !Retribution && !Redemption && !Smite)
skulls = 1;
}
public void turnOffHead(){
if(ProtMage)
headIcon = 0;
appearanceUpdateRequired = true;
if(ProtRange)
headIcon = 0;
appearanceUpdateRequired = true;
if(ProtMelee)
headIcon = 0;
appearanceUpdateRequired = true;
if(Retribution)
headIcon = 0;
appearanceUpdateRequired = true;
if(Redemption)
headIcon = 0;
appearanceUpdateRequired = true;
if(Smite)
headIcon = 0;
}
public void rangeGFX(int speed, int arrow){
int EnemyX = 0;
int EnemyY = 0;
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
if(AttackingOn2 != null){
EnemyX = PlayerHandler.players[AttackingOn].absX;
EnemyY = PlayerHandler.players[AttackingOn].absY;
}
				int offsetX = (absY - EnemyY) * -1;
				int offsetY = (absX - EnemyX) * -1;
CreateProjectile(absY, absX, offsetY, offsetX, 50, speed, arrow, 43, 31, -AttackingOn-1);
} 
public void rangeGFXNPC(int speed, int arrow){
		int EnemyX = server.npcHandler.npcs[attacknpc].absX;
		int EnemyY = server.npcHandler.npcs[attacknpc].absY;
				int offsetX = (absY - EnemyY) * -1;
				int offsetY = (absX - EnemyX) * -1;
CreateProjectile(absY, absX, offsetY, offsetX, 50, speed, arrow, 43, 31, attacknpc + 1);
} 
public void degradeCrystalBow() {
if(playerEquipment[playerWeapon] == 4214 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4215;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4215, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4215 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4216;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4216, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4216 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4217;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4217, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4217 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4218;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4218, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4218 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4219;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4219, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4219 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4220;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4220, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4220 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4221;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4221, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4221 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4222;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4222, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4222 && arrowsLeft < 1){
playerEquipment[playerWeapon] = 4223;
playerEquipmentN[playerWeapon] = 1;
setEquipment(4223, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
if(playerEquipment[playerWeapon] == 4223 && arrowsLeft < 1){
playerEquipment[playerWeapon] = -1;
playerEquipmentN[playerWeapon] = 0;
setEquipment(-1, 1, playerWeapon);
sM("Your crystal bow has slightly degraded!");
arrowsLeft = 100;
}
}
public void degradeCrystalShield() {
if(playerEquipment[playerShield] == 4224 && shieldLeft < 1){
playerEquipment[playerShield] = 4226;
playerEquipmentN[playerShield] = 1;
setEquipment(4226, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4225 && shieldLeft < 1){
playerEquipment[playerShield] = 4226;
playerEquipmentN[playerShield] = 1;
setEquipment(4226, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4226 && shieldLeft < 1){
playerEquipment[playerShield] = 4227;
playerEquipmentN[playerShield] = 1;
setEquipment(4227, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4227 && shieldLeft < 1){
playerEquipment[playerShield] = 4228;
playerEquipmentN[playerShield] = 1;
setEquipment(4228, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4228 && shieldLeft < 1){
playerEquipment[playerShield] = 4229;
playerEquipmentN[playerShield] = 1;
setEquipment(4229, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4229 && shieldLeft < 1){
playerEquipment[playerShield] = 4230;
playerEquipmentN[playerShield] = 1;
setEquipment(4230, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4230 && shieldLeft < 1){
playerEquipment[playerShield] = 4231;
playerEquipmentN[playerShield] = 1;
setEquipment(4231, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4231 && shieldLeft < 1){
playerEquipment[playerShield] = 4232;
playerEquipmentN[playerShield] = 1;
setEquipment(4232, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4232 && shieldLeft < 1){
playerEquipment[playerShield] = 4233;
playerEquipmentN[playerShield] = 1;
setEquipment(4233, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4233 && shieldLeft < 1){
playerEquipment[playerShield] = 4234;
playerEquipmentN[playerShield] = 1;
setEquipment(4234, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
if(playerEquipment[playerShield] == 4234 && shieldLeft < 1){
playerEquipment[playerShield] = -1;
playerEquipmentN[playerShield] = 0;
setEquipment(-1, 1, playerShield);
sM("Your crystal shield has slightly degraded!");
shieldLeft = 100;
}
}
 public boolean playerMage(int index) {
	int protmage = 0;
	int mystic = 0;
        if (server.playerHandler.players[index] == null) {
            return false;
        }
	if(MagePray == 5){
	    mystic = 15;
	}
	if(server.playerHandler.players[index].ProtMage){
	    protmage = 100;
        }
        int enemyDef = server.playerHandler.players[index].playerBonus[8] + protmage;
        int myBonus = playerBonus[3] + 30 + mystic;

        if (misc.random(myBonus) > misc.random(enemyDef)) {
            return true;
        }
        return false;
    }
    public boolean playerMage2(int indexx) {
        int magicBonus = playerBonus[3]*5 + misc.random(100);
	if(FullVMage()){
	magicBonus += misc.random(50);
	}
        int negative = CheckBestBonus2();
        int negativeBonus = playerBonus[negative];
        if (misc.random(magicBonus) > misc.random(negativeBonus)) {
            return true;
        } else {
            return false;
        }
    }
    public int CheckBestBonus2() {
        if (playerBonus[6] > playerBonus[7] && playerBonus[6] > playerBonus[8]) {
            return 6;
        }
        if (playerBonus[7] > playerBonus[6] && playerBonus[7] > playerBonus[8]) {
            return 7;
        }
        if (playerBonus[8] > playerBonus[6] && playerBonus[8] > playerBonus[7]) {
            return 8;
        } else {
            return 0;
        }
    }
    public void resetfollowers()
    {
        PlayerHandler _tmp = server.playerHandler;
        Player aplayer[] = PlayerHandler.players;
        int j = aplayer.length;
        for(int k = 0; k < j; k++)
        {
            Player player = aplayer[k];
            if(player == null)
            {
                continue;
            }
            client client1 = (client)player;
            if(client1.followID == playerId)
            {
                client1.followID = 0;
            }
        }

    }
public void wildysigndisappear()
    {
        sendFrame126("", 13589);
        sendFrame126("", 13590);
        sendFrame126("", 13591);
        sendFrame126("", 13592);
        sendFrame126("", 13593);
        sendFrame126("", 13594);
        sendFrame126("", 13595);
        sendFrame126("", 13596);
        sendFrame126("", 13597);
        sendFrame126("", 13598);
        sendFrame126("", 13599);
        sendFrame126("", 13600);
        setInterfaceWalkable(13588);
    }
public boolean teleblock = false;
public boolean hasCrystalBow(){
if(playerEquipment[playerWeapon] == 4214 || playerEquipment[playerWeapon] == 4215 || playerEquipment[playerWeapon] == 4216 || playerEquipment[playerWeapon] == 4217 || playerEquipment[playerWeapon] == 4218 || playerEquipment[playerWeapon] == 4219 || playerEquipment[playerWeapon] == 4220 || playerEquipment[playerWeapon] == 4221 || playerEquipment[playerWeapon] == 4222 ||
playerEquipment[playerWeapon] == 4223){
return true;
}
return false;
}
public boolean hasCrystalShield(){
if(playerEquipment[playerShield] == 4224 ||playerEquipment[playerShield] == 4225 || playerEquipment[playerShield] == 4226 || playerEquipment[playerShield] == 4227 || playerEquipment[playerShield] == 4228 || playerEquipment[playerShield] == 4229 || playerEquipment[playerShield] == 4230 || playerEquipment[playerShield] == 4231 || playerEquipment[playerShield] == 4232 || playerEquipment[playerShield] == 4234 ||
playerEquipment[playerShield] == 4234){
return true;
}
return false;
}
public boolean checkPrayOn(){
if(DefPray != 0 || AtkPray != 0 || StrPrayer != 0 || RangePray != 0 || MagePray != 0 || PrayHeal || ProtItem || ProtMage || ProtRange || ProtMelee || Redemption || Retribution || Smite || Chivalry || Piety){
return true;
}
return false;
}
public void ifFreeze(int delay2) {
EntangleDelay = delay2;
sM("You have been frozen!");
toX = absX;
toY = absY;
                newWalkCmdSteps = 0;
                newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
                getNextPlayerMovement();
}
public void crafting(int skillAdd, int itemDelete, int itemAdd, int skillNeeded) {
if(playerLevel[12] < skillNeeded) {
sM("You need at least "+skillNeeded+" crafting to craft this.");
return;
}
            addSkillXP(skillAdd,12);
	    if(itemDelete != 1629){
	    sM("You craft the gem and receive an amulet.");
	    }
	    deleteItem(itemDelete, getItemSlot(itemDelete), 1);
	    addItem(itemAdd, 1);
	    setAnimation(885);
}
  public void giveItems() {
    client other = getClient(trade_reqId);
    if (validClient(trade_reqId)) {
      try {
        for (GameItem item: other.offeredItems) {
          if (item.id > 0) {
            addItem2(item.id, item.amount);
            //println("TradeConfirmed, item="+item.id);

          }
        }
        closeInterface();
        tradeResetNeeded = true;
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
public void prayOff() {
if(!isSkulled){
headIcon = 0;
}
if(isSkulled){
headIcon = 64;
}
DefPray = 0;
AtkPray = 0;
StrPrayer = 0;
RangePray = 0;
MagePray = 0;
PrayHeal = false;
ProtItem = false;
ProtMage = false;
ProtRange = false;
Redemption = false;
Retribution = false;
Smite = false;
Chivalry = false;
Piety = false;
sM("You have run out of prayer points, you must recharge at an altar.");
turnpray();
updateRequired = true;
appearanceUpdateRequired = true;
setClientConfig(97, 0);
ProtMelee = false;
checkHead();
prayOn = false;
}
public void prayOff2() {
if(!isSkulled){
headIcon = 0;
}
if(isSkulled){
headIcon = 64;
}
DefPray = 0;
AtkPray = 0;
StrPrayer = 0;
RangePray = 0;
MagePray = 0;
PrayHeal = false;
ProtItem = false;
ProtMage = false;
ProtRange = false;
ProtMelee = false;
Redemption = false;
Retribution = false;
Smite = false;
Chivalry = false;
Piety = false;
prayOn = false;
turnpray();
updateRequired = true;
appearanceUpdateRequired = true;
}
public int GetWepAnim(int id)
{
if(id == -1) // unarmed
{
return 422;
}
if(id == 837)
{
return 1084;
}
if(id == 3190 || id == 3192 || id == 3194 || id == 3196 || id == 3198 || id== 3200 || id == 3202 || id == 3204) // halberds
{
return 440;
}
if(id == 4170 || id == 4675 || id == 13647 )
{
return 414;
}
if(id == 4151 || id == 3888) // whip
{
return 1658;
}
if(id == 6528) 
{
return 2661;
}
if(id == 4827) 
{
return 426;
}
if(id == 6522) 
{
return 3353;
}
if((id == 1291 || id == 1321 || id == 1323 || id == 1325 || id == 1327 || id == 1329 || id == 6611 || id == 1327 || id == 1321 || id == 1333 || id == 1305 || id== 6739 || id == 4587) && FightType != 3) // scimitars
{
return 451;
}
if((id == 1291 || id == 1321 || id == 1323 || id == 1325 || id == 1327 || id == 1329 || id == 6611 || id == 1327 || id == 1321 || id == 1333 || id == 1305 || id== 6739 || id == 4587) && FightType == 3) // scimitars
{
return 412;
}
if(id == 841 || id == 843 || id == 845 ||id == 849 ||id == 847 ||id == 853 || id == 851 || hasCrystalBow() || id == 859 || id == 861 || id == 7096) 
{
return 426;
}
if(id == 837)
{
return 427;
}
if(id == 746 || id == 667 || id == 35 || id == 2402 || id == 8100) 
{
return 407;
}
if(id == 4153) // maul
{
return 1665;
}
if(id == 1377) // dragon b axe
{
return 1833;
}
if(id == 4718 && FightType != 3) // dharoks axe
{
return 2067;
}
if(id == 4718 && FightType == 3) // dharoks axe
{
return 2066;
}
if(id == 4726) // guthans spear
{
return 2080;
}
if(id == 4747) // torags hammers
{
return 2068;
}
if(id == 4755) // veracs flail
{
return 2062;
}
if(id == 4734) // karils x bow
{
return 2075;
}
if((id == 1215 || id == 1231 || id == 5680 || id == 5698) && FightType != 3) // dragon daggers
{
return 402;
}
if((id == 1215 || id == 1231 || id == 5680 || id == 5698) && FightType == 3) // dragon daggers
{
return 395;
}
if(id == 6609 || id == 1307 || id == 1309 || id == 1311 || id == 1313 || id == 1315 || id == 1317 || id == 1319 || id == 7158) 
// 2 handers
{
return 407;//407//2067
}
else
{
return 451;
}
}
public int GetRunAnim(int id) 
{
if(id == 837)
{
return 2251;
}
if(id == 4084)
{
return 1468;
}
if(id == 4151 || id == 3888) // whip
{
return 1661;
}
if(id == 6818) 
{
return 1765;
}
if(id == 7158 || id == 1319 || id == 6609) 
{
return 2563;
}
if(id == 4734) // karils x bow
{
return 2077;
}
if(id == 746 || id == 667 || id == 35 || id == 2402 || id == 8100) 
{
return 2563;
}
if(id == 6528) // maul
{
return 1664;
}
if(id == 4153) // maul
{
return 1664;
}
else
{
return 0x338;
}
}

public int GetWalkAnim(int id) 
{
if(id == 837)
{
return 2258;
}
if(id == 4084)
{
return 1468;
}
if(id == 6528) // dharoks axe
{
return 2064;
}
if(id == 746 || id == 667 || id == 35 || id == 2402 || id == 8100) 
{
return 2562;
//return 1660;
}
if(id == 4718) // dharoks axe
{
return 2064;
}
if(id == 4039 || id == 4037 || id == 1379 || id == 3204 || id == 1381 || id == 1383 || id == 1385 || id == 1387 || id == 1389 || id == 1391 || id == 1393 || id == 1395 || id == 1397 || id == 1399 || id == 1401 || id == 1403 || id == 145 || id == 1407 || id == 1409 || id == 3053 || id == 3054 || id == 4170 || id == 4675 || id == 13647 || id == 4710 || id == 6526 || id == 4726 || id == 6562 || id == 6563 || id == 6914 || id == 5730) // staves + d long and most other weps with str8 up emote
{
return 1146;
}
if(id == 7158 || id == 1319 || id == 6609) 
{
return 2562;
}
if(id == 4565) // basket of eggs :)
{
return 1836;
}
if(id == 4755) // veracs flail
{
return 2060;
}
if(id == 4734) // karils x bow
{
return 2076;
}
if(id == 4153) // maul
{
return 1663;
}
if(id == 4718) // 2h + gr8 axe
{
return 1662;
}
if(id == 4151 || id == 3888) // whip
{
return 1660;
}
else
{
return 0x333;
}
}

public int GetStandAnim(int id) 
{
if(id == 837)
{
return 2257;
}
if(id == 4084)
{
return 1462;
}
if(id == 4718) // dharoks axe
{
return 2065;
}
if(id == 746 || id == 667 || id == 35 || id == 2402 || id == 8100) 
{
return 2561;
}
if(id == 7158 || id == 1319 || id == 6609) 
{
return 2561;//2561
}
if(id == 4755) // veracs flail
{
return 2061;
}
if(id == 4734) // karils x bow
{
return 2074;
}
if(id == 4153) // maul
{
return 1662;
}
if(id == 6528)//Obby Maul
{
return 0x811;
}
if(id == 4565) // basket of eggs :)
{
return 1836;
}
if(id == 1305 || id == 11962 || id == 11963 || id == 10395 || id == 11964 || id == 11965 || id == 1379 || id == 1381 || id == 1383 || id == 1385 || id == 1387 || id == 1389 || id == 1391 || id == 1393 || id == 1395 || id == 1397 || id == 1399 || id == 1401 || id == 1403 || id == 145 || id == 1407 || id == 1409 || id == 3053 || id == 6914 || id == 3054 || id == 4170 || id == 4675 || id == 13647 || id == 4710 ||   id == 6526 || id == 4726 || id == 6562 || id == 6563 || id == 5730 || id == 3190 || id == 3192 || id == 3194 || id == 3196 || id == 3198 || id == 3200 || id == 3202 || id == 3204 || id == 772) // staves
{
return 809;
}
else
{
return 0x328;
}
}
public int GetBlockAnim()
{
if(playerEquipment[playerShield]== 3095 || playerEquipment[playerShield]== 3096 || playerEquipment[playerShield]== 3097 || playerEquipment[playerShield]== 3098 || playerEquipment[playerShield]== 3099 || playerEquipment[playerShield]== 3100 || playerEquipment[playerShield]== 3101 || playerEquipment[playerShield]== 2621 || playerEquipment[playerShield]== 2589 || playerEquipment[playerShield]== 3101 || playerEquipment[playerShield] == 1201 || playerEquipment[playerShield] == 6524 || playerEquipment[playerShield] == 1187|| playerEquipment[playerShield] == 1540 || playerEquipment[playerShield] == 1171 || hasCrystalShield())
{ 
return 0x484;
}
if(playerEquipment[playerWeapon] == 1321 || playerEquipment[playerWeapon] == 1323 || playerEquipment[playerWeapon] == 1333 || playerEquipment[playerWeapon] == 6611 || playerEquipment[playerWeapon] == 1291 || playerEquipment[playerWeapon]== 4587 || playerEquipment[playerWeapon] == 1305 || playerEquipment[playerWeapon] == 1377)
{
return 404;
}
if(playerEquipment[playerWeapon] == 2402 || playerEquipment[playerWeapon] == 746 || playerEquipment[playerWeapon] == 667 || playerEquipment[playerWeapon] == 35 || playerEquipment[playerWeapon] == 8100)
{
return 410;
}
if(playerEquipment[playerWeapon] == 4755) // veracs flail
{
return 2063;
}
if(playerEquipment[playerWeapon] == 6528) // obby maul
{
return 1666;
}
if(playerEquipment[playerWeapon] == 6818) // veracs flail
{
return 1125;
}
if(playerEquipment[playerWeapon] == 5698)
{
return 403;
}
if(playerEquipment[playerWeapon] == 4151 || playerEquipment[playerWeapon] == 3888) // whip
{
return 1659;
}
if(playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 ||  playerEquipment[playerWeapon] == 7096 ||playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow()) 
{
return 424;
}
if(playerEquipment[playerWeapon] == 4718)
{
return 424;
}
if(playerEquipment[playerWeapon] == 4153) // maul
{
return 1666;
}
else
{
return 424;
}
}

	/* MISC */
	public int i;

	private java.io.InputStream in; //private java.io.DataInputStream in;
	private java.io.OutputStream out; //private java.io.DataOutputStream out;

	public stream inStream = null, outStream = null;

	public Cryption inStreamDecryption = null, outStreamDecryption = null;

	private java.net.Socket mySock;


	public int KillerId = playerId;

public void lowGFX(int id, int delay) {
mask100var1 = id;
mask100var2 = delay;
mask100update = true;
updateRequired = true;
}
public void specGFX(int gfx) { 
if(gfx == 343)
return;
mask100var1 = gfx;
mask100var2 = 6553600;
mask100update = true;
updateRequired = true;
}
	public int getbattleTimer() {
		if (playerEquipment[playerWeapon] == 8100 ||playerEquipment[playerWeapon]==35 || playerEquipment[playerWeapon]==667 || playerEquipment[playerWeapon]==2402 || playerEquipment[playerWeapon]==746 || playerEquipment[playerWeapon]==6528 || playerEquipment[playerWeapon]==4153 || playerEquipment[playerWeapon]==4718 ||playerEquipment[playerWeapon]==1377 || playerEquipment[playerWeapon]==3204 || playerEquipment[playerWeapon]==4827 || playerEquipment[playerWeapon]==7158 || playerEquipment[playerWeapon]==1319) {
			return 4500;
		} else {
		if (playerEquipment[playerWeapon] == 8002 || playerEquipment[playerWeapon]==837 || playerEquipment[playerWeapon]==1305){
			return 3000;
		} else {
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 6522) {
			return 3000;
		} else {
		return 2500;
	}
	}
	}
	}
public void specAttack() {
server.special.specialAttacks(playerId);
server.special.specialAttacks2(playerId);
server.special.specialAttacks3(playerId);
server.special.specialAttacks4(playerId);
server.special.specialAttacks5(playerId);
server.special.specialAttacks6(playerId);
}
    public void WalkTimer(int i, int j)
    {
        if(EntangleDelay > 0)
            return;
        newWalkCmdSteps = 0;
        if(++newWalkCmdSteps > 50)
            newWalkCmdSteps = 0;
        int k = absX + i;
        k -= mapRegionX * 8;
        newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
        int l = absY + j;
        l -= mapRegionY * 8;
	newWalkCmdIsRunning = ((inStream.readSignedByteC() == 1) && playerEnergy > 0);
        for(this.i = 0; this.i < newWalkCmdSteps; this.i++)
        {
            newWalkCmdX[this.i] += k;
            newWalkCmdY[this.i] += l;
        }
	lastWalk = System.currentTimeMillis();
	walkDelay = 8000;
        poimiY = l;
        poimiX = k;
    }
    public void WalkTo2(int i, int j)
    {
        newWalkCmdSteps = 0;
        if(++newWalkCmdSteps > 50)
            newWalkCmdSteps = 0;
        int k = absX + i;
        k -= mapRegionX * 8;
        newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
        int l = absY + j;
        l -= mapRegionY * 8;
	isRunning2 = false;
	isRunning = false;
        for(this.i = 0; this.i < newWalkCmdSteps; this.i++)
        {
            newWalkCmdX[this.i] += k;
            newWalkCmdY[this.i] += l;
        }
	lastWalk = System.currentTimeMillis();
	walkDelay = 20000;
        poimiY = l;
        poimiX = k;
    }
    public void walkTo(int i, int j)
    {
        if(EntangleDelay > 0)
            return;
        newWalkCmdSteps = 0;
        if(++newWalkCmdSteps > 50)
            newWalkCmdSteps = 0;
        int k = absX + i;
        k -= mapRegionX * 8;
        newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
        int l = absY + j;
        l -= mapRegionY * 8;
	newWalkCmdIsRunning = ((inStream.readSignedByteC() == 1) && playerEnergy > 0);
        for(this.i = 0; this.i < newWalkCmdSteps; this.i++)
        {
            newWalkCmdX[this.i] += k;
            newWalkCmdY[this.i] += l;
        }

        poimiY = l;
        poimiX = k;
    }
	public String GetItemName(int ItemID) {
		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemId == ItemID) {
					return server.itemHandler.ItemList[i].itemName;
				}
                                if (ItemID == -1) {
                                        return "Unarmed";
                                }
			}
		}
		return "!! NOT EXISTING ITEM !!! - ID:"+ItemID;
	}
	public void runecraft(int level, int experience, int rune, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10)
	{
		int essence = amountOfItem(1436);
		if (playerLevel[playerRunecrafting] < level)
		{
			sM("You do not have enough runecrafting to craft this.");
			sM("You need at least "+level+" to runecraft this.");
			return;
		}
		if (!playerHasItem(1436))
		{
			sM("You do not have any rune essence to craft.");
			return;
		}
		if (playerLevel[playerRunecrafting] >= level)
		{
			if (playerLevel[playerRunecrafting] >= a2 && playerLevel[playerRunecrafting] < a3)
				essence = amountOfItem(1436) * 2;
			if (playerLevel[playerRunecrafting] >= a3 && playerLevel[playerRunecrafting] < a4)
				essence = amountOfItem(1436) * 3;
			if (playerLevel[playerRunecrafting] >= a4 && playerLevel[playerRunecrafting] < a5)
				essence = amountOfItem(1436) * 4;
			if (playerLevel[playerRunecrafting] >= a5 && playerLevel[playerRunecrafting] < a6)
				essence = amountOfItem(1436) * 5;
			if (playerLevel[playerRunecrafting] >= a6 && playerLevel[playerRunecrafting] < a7)
				essence = amountOfItem(1436) * 6;
			if (playerLevel[playerRunecrafting] >= a7 && playerLevel[playerRunecrafting] < a8)
				essence = amountOfItem(1436) * 7;
			if (playerLevel[playerRunecrafting] >= a8 && playerLevel[playerRunecrafting] < a9)
				essence = amountOfItem(1436) * 8;
			if (playerLevel[playerRunecrafting] >= a9 && playerLevel[playerRunecrafting] < a10)
				essence = amountOfItem(1436) * 9;
			if (playerLevel[playerRunecrafting] >= a10)
				essence = amountOfItem(1436) * 10;

		}
		for (int i = 0; i < 29; i++)
			deleteItem(1436, getItemSlot(1436), i);
		addItem(rune, essence);
		addSkillXP(experience*essence, playerRunecrafting);
		sM("You bind the temple's power into "+getItemName(rune)+".");
		specGFX(186);
		setAnimation(791);
		return;
	}
public void SpecDamg(int maxDamage) {
 for (Player p : server.playerHandler.players)
  {
   if(p != null) 
    {
	 if (PlayerHandler.players[AttackingOn].deathStage < 1) {
	int damage = misc.random(maxDamage);
	if (PlayerHandler.players[AttackingOn].playerLevel[3] - hitDiff < 0)
	PlayerHandler.players[AttackingOn].hitDiff = damage;
	PlayerHandler.players[AttackingOn].updateRequired = true;
	PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
	}
      }   
   }
}

public void SpecDamgNPC(int maxDamage) {
   if(server.npcHandler.npcs[attacknpc] != null) 
    {
        if (server.npcHandler.npcs[attacknpc].IsDead == false) {
		int voidmelee = 0;
		if(FullVMelee()){
		voidmelee += 10;
		}
	int damage = misc.random(maxDamage) + misc.random(voidmelee);
	if (npcHit()) {
	damage = 0;
	}
        if (server.npcHandler.npcs[attacknpc].HP - hitDiff < 0) 
        damage = server.npcHandler.npcs[attacknpc].HP;
        server.npcHandler.npcs[attacknpc].StartKilling = playerId;
	server.npcHandler.npcs[attacknpc].RandomWalk = false;
	server.npcHandler.npcs[attacknpc].IsUnderAttack = true;
	server.npcHandler.npcs[attacknpc].hitDiff = damage;
	server.npcHandler.npcs[attacknpc].HP -= damage;
	server.npcHandler.npcs[attacknpc].updateRequired = true;
	server.npcHandler.npcs[attacknpc].hitUpdateRequired = true;
    } 
   }
  }
public void cureAll()
   {
for (Player p : server.playerHandler.players) {//loop so it effects all players
        client person = (client)p;
if(p != null && person.distanceToPoint(absX, absY) <= 1) {
client castOn = (client)p;//specific player's client
castOn.poisoned = false;
castOn.poisonDmg = false;
castOn.sM("You have been cured by "+playerName+".");
setAnimation(1670);
lowGFX(79, 0);
       }
}
}
public void healAll()
   {
for (Player p : server.playerHandler.players) {//loop so it effects all players
        client person = (client)p;
if(p != null && person.distanceToPoint(absX, absY) <= 1) {
client castOn = (client)p;//specific player's client
castOn.currentHealth += 10;
if (castOn.currentHealth > castOn.playerLevel[castOn.playerHitpoints])
	castOn.currentHealth = castOn.playerLevel[castOn.playerHitpoints];
castOn.sendQuest("" + castOn.currentHealth + "", 4016);
castOn.sM("You have been healed by "+playerName+".");
setAnimation(1670);
lowGFX(568, 0);
       }
}
}
public void hail()
   {
for (Player p : server.playerHandler.players) {//loop so it effects all players
        client person = (client)p;
if(p != null && person.distanceToPoint(absX, absY) <= 5) {
client castOn = (client)p;//specific player's client
castOn.plrText = "We love you "+playerName+"! You are a GOD!!";
castOn.plrTextUpdateRequired = true;
castOn.TurnPlayerTo(absX, absY);
castOn.setAnimation(1651);
castOn.updateRequired = true;
castOn.appearanceUpdateRequired = true;
       }
}
}
public void spamz()
   {
for (Player p : server.playerHandler.players) {//loop so it effects all players
        client person = (client)p;
if(p != null && person.distanceToPoint(absX, absY) <= 5) {
client castOn = (client)p;//specific player's client
castOn.plrText = "ALL JOIN ClutchPK";
castOn.plrTextUpdateRequired = true;
castOn.setAnimation(3543);
castOn.updateRequired = true;
castOn.appearanceUpdateRequired = true;
       }
}
}
public void teletome()
   {
for (Player p : server.playerHandler.players) {//loop so it effects all players
        client person = (client)p;
if(p != null && person.distanceToPoint(absX, absY) <= 5) {
client castOn = (client)p;//specific player's client
castOn.toX = absX;
			castOn.toY = absY;
castOn.updateRequired = true;
castOn.appearanceUpdateRequired = true;
       }
}
}
public void resetpc() {
		for (int i = 0; i < server.npcHandler.maxNPCs; i++) {
			if (server.npcHandler.npcs[i] != null) {
if(server.npcHandler.npcs[i].npcType == 3777 || server.npcHandler.npcs[i].npcType == 3778 || server.npcHandler.npcs[i].npcType == 3779 || server.npcHandler.npcs[i].npcType == 3780){
server.npcHandler.npcs[i].absX = 0;
server.npcHandler.npcs[i].absY = 0;
}
}
}
}

    public boolean IsInFightCave()
    {
        return absX >= 2360 && absX <= 2445 && absY >= 5045 && absY <= 5125;
    }


	
  public boolean inPcGame() {
    if (absX >= 2624 && absX <= 2690 && absY >= 2550 && absY <=2619) {
      return true;

    } else {
      return false;
    }
  }
  public boolean inPcBoat() {
    if (absX >= 2660 && absX <= 2663 && absY >= 2638 && absY <=2643) {
      return true;

    } else {
      return false;
    }
  }

public boolean FullVMage() {
 if(playerEquipment[playerHat] == 2518 && playerEquipment[playerChest] == 2520 && playerEquipment[playerLegs] == 2522)
  {
   return true;
  }
 return false;			
}
public boolean FullVRange() {
 if(playerEquipment[playerHat] == 2524 && playerEquipment[playerChest] == 2520 && playerEquipment[playerLegs] == 2523)
  {
   return true;
  }
 return false;			
}
public boolean FullVMelee() {
 if(playerEquipment[playerHat] == 2526 && playerEquipment[playerChest] == 2520 && playerEquipment[playerLegs] == 2522)
  {
   return true;
  }
 return false;			
}
public boolean FullVeracEquipped() {
 if(playerEquipment[playerHat] == 4753 && playerEquipment[playerChest] == 4757 && playerEquipment[playerLegs] == 4759 && playerEquipment[playerWeapon] == 4755)
  {
   return true;
  }
 return false;			
}
public boolean FullGuthanEquipped() {
 if(playerEquipment[playerHat] == 4724 && playerEquipment[playerChest] == 4728 && playerEquipment[playerLegs] == 4730 && playerEquipment[playerWeapon] == 4726)
  {
   return true;
  }
 return false;			
}
	public boolean FullDharokEquipped() {
		if(playerEquipment[playerHat] == 4716 && playerEquipment[playerChest] == 4720 && playerEquipment[playerLegs] == 4722 && playerEquipment[playerWeapon] == 4718)
                {
		return true;
                }
		return false;			
}
	  public void switchBooks() {
    interfaceEffect = 2;
    setAnimation(1652);
    clearQuestInterface();
    sendFrame126("Normal Magic", 2494);
    sendFrame126("", 2495);
    sendFrame126("", 2496);
    sendFrame126("", 2497);
    sendFrame126("Ancient Magic", 2498);
    sendQuestSomething(8143);
		sendFrame164(2492);
		flushOutStream();
  }
	
        public void commands() {
		sendQuest("@gre@-|- Drops -|-", 8144);
		clearQuestInterface();
		sendQuest("@whi@--Chaos Elemental--", 8147);
		sendQuest("(YOU WILL NEED A BIG TEAM!!)", 8148);
		sendQuest("@red@Statius, Vestas, Zuriels, Morrigans, Dagon'hai", 8149);
		sendQuest("@whi@--Mithril Dragons--", 8150);
		sendQuest("@red@D Full Helm, Visage", 8151);
		sendQuest("(lvl 75 smithing and use Visage on a furnace)", 8152);
		sendQuest("(You must have an anti dragon shield too..)", 8153);
		sendQuest("@whi@--Dagganoth Bosses--", 8154);
		sendQuest("Rune C'bow, Rings, D Axe", 8155);
		sendQuest("@whi@--Kalphite Queen--", 8156);
		sendQuest("Dragon Chain,B axe,Legs,Skirt,SQ,@red@Boots,Full Helm", 8157);
		sendQuest("@whi@--King Black Dragon--", 8158);
		sendQuest("Visage, D Full Helm,D bones, @red@CLAWS", 8159);
		sendQuest("@whi@--General Graardor--", 8160);
		sendQuest("(emotes bugged =S)", 8161);
		sendQuest("@red@Armadyl and Bandos Armour, ALL GodSwords, Sara Sword", 8162);
		sendQuest("@whi@--Green Dragons--", 8163);
		sendQuest("Ancient Staff,Berserker Ring,Onyx Ring&Neclace,DFullHelm", 8164);
		sendQuest("@whi@--Dust Devil--", 8165);
		sendQuest("D Chainbody,sq shield.", 8166);
		sendQuest("@whi@--Nechryael--", 8167);
		sendQuest("@red@Dragon Boots", 8168);
		sendQuest("@whi@--Abyssal Demon--", 8169);
		sendQuest("@red@Whip", 8170);
		sendQuest("@whi@--Dark Beasts--", 8171);
		sendQuest("@red@Dark Bow", 8172);
		
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void info() {
		sendQuest("@gre@- Commands -", 8144);
		clearQuestInterface();
		sendQuest("::train for training", 8147);
		sendQuest("::shops wear u buy stuff", 8148);
		sendQuest("thieve at ardough teleport", 8149);
		sendQuest("::pass NEWPASSWORD - changes your password", 8150);
		sendQuest("::players - view everyone online", 8151);
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void rules() {
		sendQuest("@red@.                  **- Rules -**", 8144);
		clearQuestInterface();
		sendQuest("1: Respect Staff.", 8147);
		sendQuest("2: No duping.", 8148);
		sendQuest("3: Swearing is allowed if u dont swear to a staff.", 8149);
		sendQuest("4: Xlogging, 1st time ; mute- 2st time ; bann", 8150);
		sendQuest("5: Register on forums if you want respect.", 8151);
		sendQuest("6: Do not ask staff for items.", 8152);
		sendQuest("7: No 1-3 iteming at wildy! - bann.", 8153);
		sendQuest("8: If you got banned or muted, appeal on FORUMS!.", 8154);
		sendQuest("9: No racisme - Mute.", 8155);
		sendQuest("10: No glitching of any form - Bann", 8156);
		sendQuest("11: Do not spamm, this can result in a mute", 8157);
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void warHelp() {
		sendQuest("@gre@War of Bandos", 8144);
		clearQuestInterface();
		sendQuest("Dangerous minigame, items will be lost!", 8147);
		sendQuest("Be aware, there are many traps in the cave", 8148);
		sendQuest("Also be aware of players that want your loot!", 8149);
		sendQuest("Random effects might happen on your player!", 8150);
		sendQuest("You will be skulled on entrance", 8150);
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q1help() {
		sendQuest("Lost city", 8144);
		clearQuestInterface();
		if(q1 == 0){
		sendQuest("I can start this quest by talking to the Warrior.", 8147);
		sendQuest("He is located near a training place.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q1 == 1){
		sendQuest("The Warrior says something about 'Zanaris'", 8147);
		sendQuest("I should head to Falador to get some information.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q1 == 2){
		sendQuest("The Archer at Falador says I will need a dramen staff.", 8147);
		sendQuest("I can get one at Entrana, but where in Entrana?", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q1 == 3){
		sendQuest("I can now cut down the Dramen tree.", 8147);
		sendQuest("When I have the staff, I should search for the lost city.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q1 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now visit Zanaris.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q2help() {
		sendQuest("Rune Mysteries", 8144);
		clearQuestInterface();
		if(q2 == 0){
		sendQuest("Start this quest by talking with Duke Horatio at Lumbridge.", 8147);
		sendQuest("Can't wait to get pking :).", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
}
		if(q2 == 15){
		sendQuest("I Have logged in a recieved my starter.", 8147);
		sendQuest("cant wait to get pking :).", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q3help() {
		sendQuest("Desert Treasure", 8144);
		clearQuestInterface();
		if(q3 == 0){
		sendQuest("I can start this quest by talking to the King.", 8147);
		sendQuest("He is located at Catherby.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q3 == 1){
		sendQuest("The king has given me the first task.", 8147);
		sendQuest("He wants me to steal a cake at Ardougne.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q3 == 2){
		sendQuest("The king has given me the second task.", 8147);
		sendQuest("He wants me to get a magic shortbow.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q3 == 3){
		sendQuest("The king has given me the last task.", 8147);
		sendQuest("He wants me to battle 4 bosses.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q3 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now use ancient magic.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q4help() {
		sendQuest("Recipe for Disaster", 8144);
		clearQuestInterface();
		if(q5 == 0){
		sendQuest("I can start this quest by going to the lumbridge feast.", 8147);
		sendQuest("It is located by the chef.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 1){
		sendQuest("I must fight these monsters and defeat the culminator!", 8147);
		sendQuest(".", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 2){
		sendQuest("Garkor tells me I need to get a monkey greegree.", 8147);
		sendQuest("I can get one by going into the trapdoor in Ape Atoll.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 3){
		sendQuest("The gnome has given me a monkey greegree.", 8147);
		sendQuest("I should now talk to the Elder Guard at Ape Atoll.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I got a xp lamp and I can use barrows gloves!", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q5help() {
		sendQuest("Monkey Madness", 8144);
		clearQuestInterface();
		if(q5 == 0){
		sendQuest("I can start this quest by talking to the Gnome King.", 8147);
		sendQuest("He is located at Gnome Stronghold.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 1){
		sendQuest("The Gnome King has asked me to battle a Jungle Demon.", 8147);
		sendQuest("I should head to Ape Atoll for more information.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 2){
		sendQuest("Garkor tells me I need to get a monkey greegree.", 8147);
		sendQuest("I can get one by going into the trapdoor in Ape Atoll.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 3){
		sendQuest("The gnome has given me a monkey greegree.", 8147);
		sendQuest("I should now talk to the Elder Guard at Ape Atoll.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q5 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I have received 30,000 hitpoints experience.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q6help() {
		sendQuest("While Guthix Sleeps", 8144);
		clearQuestInterface();
		if(q6 == 0){
		sendQuest("I can start this quest by Talking to sir tiffy cashim.", 8147);
		sendQuest("He is located at Falador Park", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q6 == 1){
		sendQuest("Talk 2 tiffy agen", 8147);
		sendQuest("He is located at Falador Park", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q6 == 2){
		sendQuest("I need to get sir tiffy the following items.", 8147);
		sendQuest("1x abbysal whip", 8148);
		sendQuest("1x cheffs hat", 8149);
		sendQuest("1x dragon bitter", 8150);
		}
		if(q6 == 2){
		sendQuest("I need to get sir tiffy the following items.", 8147);
		sendQuest("1x abbysal whip", 8148);
		sendQuest("1x fighter hat", 8149);
		sendQuest("1x dragon bitter", 8150);
		}
		if(q6 == 3){
		sendQuest("I need to get sir tiffy the following items.", 8147);
		sendQuest("1x abbysal whip", 8148);
		sendQuest("1x fighter hat", 8149);
		sendQuest("1x dragon bitter", 8150);
		}
		if(q6 == 15){
		sendQuest("@red@I have completed the quest!", 8147);
		sendQuest("@red@I have received 1000,000 coins.", 8148);
		sendQuest("@red@I have recieved a pair of dragon claws.", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q7help() {
		sendQuest("Legends QUest", 8144);
		clearQuestInterface();
		if(q7 == 0){
		sendQuest("@red@I can start this quest by talking to the Legends Guard.", 8147);
		sendQuest("@red@They are located at the Legends Guild", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q7 == 1){
		sendQuest("The Legends Guard has given his first task.", 8147);
		sendQuest("I must find my way out of this dungeon.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q7 == 2){
		sendQuest("I have made my way through the dungeon.", 8147);
		sendQuest("I should talk to the Legends Guard now.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q7 == 3){
		sendQuest("The Legends Guard has given his second task.", 8147);
		sendQuest("I need to get him 15 cakes.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q7 == 4){
		sendQuest("The Legends Guard has given his last task.", 8147);
		sendQuest("I need to kill the Black Demon.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q7 == 15){
		sendQuest("@red@I have completed the quest!", 8147);
		sendQuest("@red@I can now enter the Legends Guild.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q8help() {
		sendQuest("", 8144);
		clearQuestInterface();
		if(q8 == 0){
		sendQuest("I can start this quest by talking to the Sailor", 8147);
		sendQuest("He is located at Fremennik.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q8 == 1){
		sendQuest("I have completed the Sailors Task by", 8147);
		sendQuest("1 rune arrow and giving it to him.", 8148);
		sendQuest("The Sailor now wants me to battle a monster.", 8149);
		sendQuest("", 8150);
		}
		if(q8 == 2){
		sendQuest("I have beat the monster Slash Bash.", 8147);
		sendQuest("I should go and talk to the Sailor again.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q8 == 3){
		sendQuest("The Sailor has given me another task.", 8147);
		sendQuest("I need to get him 1 magic longbow.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q8 == 4){
		sendQuest("The Sailor has given me his last task", 8147);
		sendQuest("I need to get 50 slayer.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q8 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now use the 'Vengeance' spell.", 8148);
		sendQuest("I can also now wear the Helm of Neitiznot", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q9help() {
		sendQuest("Knight's Legend", 8144);
		clearQuestInterface();
		if(q9 == 0){
		sendQuest("I can start this quest by talking to King Lathas", 8147);
		sendQuest("He is located at Camelot.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q9 == 1){
		sendQuest("King Lathas has told me to go to Black Knight's Fortress.", 8147);
		sendQuest("I should look for some clues on what they are planning on.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q9 == 2){
		sendQuest("I should head to Yanille before the Black Knights steal", 8147);
		sendQuest("the treasure.", 8148);
		sendQuest("I should bring a spade there.", 8149);
		sendQuest("", 8150);
		}
		if(q9 == 3){
		sendQuest("I have defeated the first knight.", 8147);
		sendQuest("", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q9 == 4){
		sendQuest("I have defeated the second knight.", 8147);
		sendQuest("", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q9 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now use Chivalry and Piety prayers.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q10help() {
		sendQuest("Lunar Spirit", 8144);
		clearQuestInterface();
		if(q10 == 0){
		sendQuest("I can start this quest by talking to the Sailor.", 8147);
		sendQuest("He is located at Fremennik.", 8148);
		sendQuest("I need to finish Lunar Diplomacy before starting", 8149);
		sendQuest("this quest.", 8150);
		}
		if(q10 == 1){
		sendQuest("The Sailor has given me a potion.", 8147);
		sendQuest("I should look around this Island.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q10 == 2){
		sendQuest("I found a ghost who wants me to help him with combat.", 8147);
		sendQuest("He wants me to bring him the following items that", 8148);
		sendQuest("can be found on the island:", 8149);
		sendQuest("1 Bravery Potion, 1 tomato, 1 silver necklace", 8150);
		}
		if(q10 == 3){
		sendQuest("I have found all the items for the ghost.", 8147);
		sendQuest("I should prepare for combat now.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q10 == 4){
		sendQuest("I have defeated the second knight.", 8147);
		sendQuest("", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q10 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now use Lunar Magic.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
        public void q11help() {
		sendQuest("The Wolf's Cure", 8144);
		clearQuestInterface();
		if(q11 == 0){
		sendQuest("I can start this quest by talking to Merlin.", 8147);
		sendQuest("He is located at Seer's Village near the bank.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q11 == 1){
		sendQuest("Merlin has asked me to find him the following ingredients:", 8147);
		sendQuest("1 Spider egg, 1 ash, and 1 bag of salt.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		if(q11 == 15){
		sendQuest("I have completed the quest!", 8147);
		sendQuest("I can now buy Black and Dragon gloves from Giles.", 8148);
		sendQuest("", 8149);
		sendQuest("", 8150);
		}
		sendQuestSomething(8143);
		showInterface(8134);
		flushOutStream();
			}
	public void sendFrame106(int i1){
		outStream.createFrame(106);
		outStream.writeByteC(i1);
	}
	public void sendQuest(String s, int id) {
		try {
			outStream.createFrameVarSizeWord(126);
			outStream.writeString(s);
			outStream.writeWordA(id);
			outStream.endFrameVarSizeWord();
		} catch (Exception e) {
			server.logError(e.getMessage());
		}
	}
public void deletethatobject(int objectX, int objectY) { 
	ReplaceObject2(objectX, objectY, 6951, -1, 10);
	}
public void Deleteobjects() {
	       deletethatobject(2665, 10037);
	       deletethatobject(2653, 10007);
	       deletethatobject(2656, 10004);
	       deletethatobject(2653, 10001);
	       deletethatobject(2650, 10004);
	       deletethatobject(2653, 10004);
	       deletethatobject(2517, 3862);
	       deletethatobject(2513, 3862);
	       deletethatobject(2519, 3866);
 	       deletethatobject(3509, 9497);
 	       deletethatobject(2898, 3428);
 	       deletethatobject(2956, 3212);
 	       deletethatobject(2987, 3240);
 	       deletethatobject(2986, 3239);
 	       deletethatobject(2984, 3237);
 	       deletethatobject(2982, 3234);
 	       deletethatobject(2980, 3233);
 	       deletethatobject(2977, 3233);
 	       deletethatobject(2975, 3234);
 	       deletethatobject(2971, 3237);
 	       deletethatobject(2968, 3239);
 	       deletethatobject(2969, 3240);
 	       deletethatobject(2969, 3242);
 	       deletethatobject(2812, 3343);
 	       deletethatobject(2810, 3342);
 	       deletethatobject(2812, 3341);
 	       deletethatobject(2844, 3337);
 	       deletethatobject(2845, 3337);
 	       deletethatobject(2851, 3332);
 	       deletethatobject(2857, 3338);
 	       deletethatobject(2859, 3338);
 	       deletethatobject(2860, 3338);
 	       deletethatobject(2862, 3338);
 	       deletethatobject(2859, 3335);
 	       deletethatobject(2861, 3335);
 	       deletethatobject(2862, 3335);
 	       deletethatobject(2857, 3335);
 	       deletethatobject(2856, 3334);
		   deletethatobject(3090, 3503);//edge
		   deletethatobject(3084, 3502);
		   deletethatobject(3088, 3509);
		   deletethatobject(3090, 3494);
		   deletethatobject(3091, 3495);
		   deletethatobject(3090, 3496);
		   deletethatobject(3092, 3496);
		   deletethatobject(3095, 3498);
		   deletethatobject(3095, 3499);
		   deletethatobject(3092, 3488);//
		   
		   
         }
public void makeGlobalObject(int x, int y, int typeID, int orientation, int tileObjectType){ //Makes Global objects
		for (Player p : server.playerHandler.players){
			if(p != null){
				client person = (client)p;
			if((person.playerName != null || person.playerName != "null")){
				if(person.distanceToPoint(x, y) <= 60){
					person.createNewTileObject(x, y, typeID, orientation, tileObjectType);}}}}}
public void NewObjects() {
		   makeGlobalObject(2662, 10037, 2156, 0, 10);//portal
		   makeGlobalObject(3098, 3493, 14367, 0, 10);//edge banks
		   makeGlobalObject(3096, 3493, 14367, 0, 10);
		   makeGlobalObject(3095, 3491, 14367, 3, 10);
		   makeGlobalObject(3095, 3489, 14367, 3, 10);//edge banks
		   makeGlobalObject(3090, 3507, 6552, 3, 10);//ancient altar
		   makeGlobalObject(2587, 3911, 4755, 0, 10);//gwd down
		   makeGlobalObject(3091, 3506, 13184, 2, 10);//prayer altar
		   makeGlobalObject(2742, 3443, 2644, 0, 10);
		   makeGlobalObject(3126, 3356, 2709, -1, 10);//chest in draynor house
	       makeGlobalObject(3093, 3505, 410, 0, 10);//guthix altar
		   makeGlobalObject(2535, 4717, 13184, 2, 10);//mb pray
		   makeGlobalObject(2543, 4713, 6552, 3, 10);//ancient
		   makeGlobalObject(2532, 4716, 410, 0, 10);//guthix 
		   
	       makeGlobalObject(2808, 3433, 2783, 0, 10);//anvil
		   makeGlobalObject(2813, 3437, 7965, 0, 10);//patch
	       makeGlobalObject(2803, 3431, 11666, -1, 10);//furnace
		   
		   makeGlobalObject(2804, 3434, 2109, 0, 10);//clay
	       makeGlobalObject(2804, 3435, 2091, 0, 10);//cooper
	       makeGlobalObject(2804, 3436, 2094, 0, 10);//tin
	       makeGlobalObject(2804, 3437, 2093, 0, 10);//iron
	       makeGlobalObject(2804, 3438, 2097, 0, 10);//coal
	       makeGlobalObject(2804, 3439, 2103, 0, 10);//mithril
	       makeGlobalObject(2804, 3440, 2105, 0, 10);//addy
		   makeGlobalObject(2804, 3441, 2107, 0, 10);//run
		   
		   makeGlobalObject(2714, 9807, 724, 0, 10);
		   makeGlobalObject(2717, 9807, 724, 0, 10);
		   makeGlobalObject(2720, 9807, 724, 0, 10);
		   makeGlobalObject(2723, 9807, 724, 0, 10);
		   
		   makeGlobalObject(2720, 9804, 14367, 0, 10);
		   makeGlobalObject(2714, 9804, 14367, 0, 10);
		   //makeGlobalObject(2993, 3375, 2781, 0, 10);//portal
	       //makeGlobalObject(3177, 3420, 10638, -1, 10);
	       //makeGlobalObject(3381, 3485, 410, 0, 10);
	       //makeGlobalObject(2900, 2905, 13180, 0, 10);//altar de prayer
	       //makeGlobalObject(2740, 5103, 13181, 0, 10);
	       //makeGlobalObject(2900, 2915, 13179, 0, 10);
	       //makeGlobalObject(2900, 2920, 13184, 0, 10);//altar prayer
	       //makeGlobalObject(2760, 2791, 2560, 0, 10);
	       //makeGlobalObject(2760, 2789, 2565, 0, 10);
	       //makeGlobalObject(2760, 2787, 2562, 0, 10);
	       //makeGlobalObject(3093, 3506, 10638, 0, 10);//prayer altar
		   //makeGlobalObject(3286, 3211, 2562, 0, 10);//stalls in al kharid
	       //makeGlobalObject(3299, 3199, 4878, 0, 10);
	       //makeGlobalObject(3298, 3199, 4877, 0, 10);
	       //makeGlobalObject(3298, 3205, 2565, 0, 10);
	       makeGlobalObject(3090, 3489, 4876, -1, 10);//thieving stall edge
		   //makeGlobalObject(3184, 3427, 4876, -1, 10);//varrock   
	       //makeGlobalObject(3299, 3310, 2213, 0, 10);//banks
	       //makeGlobalObject(3102, 9307, 2213, 0, 10);
	       //makeGlobalObject(3103, 9307, 2213, 0, 10);
	       //makeGlobalObject(3104, 9307, 2213, 0, 10);
	       //makeGlobalObject(3105, 9307, 2213, 0, 10);
	       //makeGlobalObject(3106, 9307, 2213, 0, 10);
	       //makeGlobalObject(2943, 3286, 2213, 0, 10);//bank in jail
	       //makeGlobalObject(2340, 3683, 9398, 0, 10);//deposit boxes
	       //makeGlobalObject(2339, 3684, 9398, 0, 10);
	       //makeGlobalObject(2338, 3683, 9398, 0, 10);
	       //makeGlobalObject(2339, 3682, 9398, 0, 10);
	       //makeGlobalObject(2335, 3699, 2513, -2, 10);//firetargets?
	       //makeGlobalObject(2336, 3699, 2513, -2, 10);
	       //makeGlobalObject(2337, 3699, 2513, -2, 10);
	       //makeGlobalObject(3090, 3492, 4156, 0, 10);//portal home
	       //makeGlobalObject(2670, 3808, 2468, 0, 10);//meio do mar

		   
	}
public boolean HasItemAmount(int itemID, int itemAmount) {
      int playerItemAmountCount = 0;
      for (int i=0; i<playerItems.length; i++)
{
         if (playerItems[i] == itemID+1)
{
            playerItemAmountCount = playerItemsN[i];
}
                 if(playerItemAmountCount >= itemAmount){
                    return true;}
            }
         return false;
      }
         
public boolean multiCombat() {
	if((absX >= 3144 && absX <= 3184 && absY >= 3519 && absY <=3656) || (absX >= 3185 && absX <= 3328 && absY >= 3502 && absY <=3900) || (absX >= 2983 && absX <= 3007 && absY >= 3905 && absY <=3917) || (absX >= 3007 && absX <= 3075 && absY >= 3608 && absY <=3713) || (absX >= 2944 && absX <= 2963 && absY >= 3812 && absY <=3827) || (absX >= 3041 && absX <= 3057 && absY >= 3869 && absY <=3883) || (absX >= 3157 && absX <= 3181 && absY >= 3874 && absY <=3895) || (absX >= 2720 && absX <= 2760 && absY >= 5073 && absY <=5114) || (absX >= 2256 && absX <= 2287 && absY >= 4680 && absY <=4711) || (absX >= 2360 && absX <= 2445 && absY >= 5045 && absY <= 5125) || (absX >= 2760 && absX <= 2780 && absY >= 2790 && absY <=2810) || (absX >= 2624 && absX <= 2690 && absY >= 2550 && absY <=2619) || (absX >= 3460 && absX <= 3520 && absY >= 9470 && absY <=9530) || (absX >= 2371 && absX <= 2424 && absY >= 5125 && absY <=5167) || (absX >= 2627 && absX <= 2677 && absY >= 4550 && absY <=4602) || (absX >= 3249 && absX <= 3307 && absY >= 3904 && absY <=3952) || (absX >= 3035 && absX <= 3064 && absY >= 9570 && absY <=9599) || (absX >= 2904 && absX <= 2924 && absY >= 4438 && absY <=4458)|| (absX >= 2660 && absX <= 2688 && absY >= 3707 && absY <=3734) ||(absX >= 2420 && absX <= 2520 && absY >= 10100 && absY <=10200) || (absX >= 2992 && absX <= 3090 && absY >= 4804 && absY <=4872))
	return true;
	else
	return false;
	}
public boolean isInPitRoom() {
	if((absX >= 2394 && absX <= 2408 && absY >= 5168 && absY <=5175))
	return true;
	else
	return false;
	}
public boolean isInPitGame() {
	if((absX >= 2371 && absX <= 2424 && absY >= 5125 && absY <=5167))
	return true;
	else
	return false;
	}
public boolean inFunPK() {
	if((absX >= 2700 && absX <= 2730 && absY >= 9808 && absY <=9830))
	return true;
	else
	return false;
	}
	
public boolean isInGW() {
	if((absX >= 2699 && absX <= 2769 && absY >= 5051 && absY <=5124))
	return true;
	else
	return false;
	}
public boolean isInApe() {
	if((absX >= 2760 && absX <= 2780 && absY >= 2790 && absY <=2810))
	return true;
	else
	return false;
	}
public boolean isInArena() {
	if((absX >= 2590 && absX <= 2602 && absY >= 8480 && absY <=9510))
	return true;
	else
	return false;
	}
public boolean isInAssault() {
	if((absX >= 2576 && absX <= 2623 && absY >= 3145 && absY <=3179))
	return true;
	else
	return false;
	}
public boolean isInJail() {
	if((absX >= 2928 && absX <= 2943 && absY >= 3275 && absY <=3291))
	return true;
	else
	return false;
	}
public boolean isInJail2() {
	if((absX >= 2926 && absX <= 2938 && absY >= 3274 && absY <=3292))
	return true;
	else
	return false;
	}
public boolean isInCity() {
	if((absX >= 2800 && absX <= 2893 && absY >= 9274 && absY <=9807))
	return true;
	else
	return false;
	}
public boolean isInQuest() {
	if((absX >= 2895 && absX <= 2930 && absY >= 9674 && absY <=710))
	return true;
	else
	return false;
	}
public boolean isInGraardor() {
	if((absX >= 3035 && absX <= 3064 && absY >= 9570 && absY <=9599))
	return true;
	else
	return false;
	}
public boolean isInPcGame() {
	if((absX >= 2624 && absX <= 2686 && absY >= 2560 && absY <=2625))
	return true;
	else
	return false;
	}
public boolean castlewarswait() {
if((absX >=2410 && absX <=2434 && absY >=9511 && absY <=9536) || (absX >=2367 && absX <=2393 && absY >=9480 && absY <=9497))
return true;
else
return false;
}
public boolean castlewarsgame() {
if(absX >= 2359 && absX <= 2432 && absY >= 3069 && absY <= 3134)
return true;
else
return false;
}
public boolean isInCastleWars() {
if((absX >= 2377 && absX <= 2429 && absY >= 3070 && absY <=3143))
return true;
else
return false;
}
public void youdied()
		{
		if(playerHasItem(5509)){
		deleteItem(5509, 1);
		}
		if(playerHasItem(5510)){
		deleteItem(5510, 1);
		}
		if(playerHasItem(5512)){
		deleteItem(5512, 1);
		}
		if(playerHasItem(5514)){
		deleteItem(5514, 1);
		}
		if(playerHasItem(6570)){
		deleteItem(6570, 1);
		}
                if (!isSkulled) {
                keepItemHandle();
		}
                if (ProtItem) {
                applyProtectItemProt();
		}
for(int rr=0; rr<playerItems.length; rr++) {
	try {
		if(playerItems[rr] > 0 && playerItems[rr] < 11999) {		//createItem(currentX,currentY,playerItems[rr]-1);
			replaceBarrows();
			//server.checkPlayerCapes.checkDrop(this);
			ItemHandler.addItem(playerItems[rr]-1, absX, absY, playerItemsN[rr], KillerId, false);
                        //createGroundItem(playerItems[rr]-1, absX, absY, playerItemsN[i]);
			deleteItem(playerItems[rr]-1, getItemSlot(playerItems[rr]-1), playerItemsN[rr]);
 
		}
	} catch(Exception e) {  }
}
for(int r=0; r<playerEquipment.length; r++) {
	try {
		int item = playerEquipment[r];
		if((item > 0) && (item < 11999)) {
			remove(item, r);
		}
	} catch(Exception e) { sM("ERROR: Removing Equipment"); }
}
		if(playerHasItem(5509)){
		deleteItem(5509, 1);
		}
		if(playerHasItem(5510)){
		deleteItem(5510, 1);
		}
		if(playerHasItem(5512)){
		deleteItem(5512, 1);
		}
		if(playerHasItem(5514)){
		deleteItem(5514, 1);
		}
		if(playerHasItem(6570)){
		deleteItem(6570, 1);
		}
for(int rr=0; rr<playerItems.length; rr++) {
	try {
		if(playerItems[rr] > 0 && playerItems[rr] < 11999) {
//createItem(currentX,currentY,playerItems[rr]-1);
			replaceBarrows();
			//server.checkPlayerCapes.checkDrop(this);
			ItemHandler.addItem(playerItems[rr]-1, absX, absY, playerItemsN[rr], KillerId, false);
                        //createGroundItem(playerItems[rr]-1, absX, absY, playerItemsN[i]);
			deleteItem(playerItems[rr]-1, getItemSlot(playerItems[rr]-1), playerItemsN[rr]); 
		}
	} catch(Exception e) {  }
}
		try {

		} catch(Exception e) {}
			ItemHandler.addItem(526, absX, absY, 1, KillerId, false);
		try {
		} catch(Exception e) {}
        if (itemKept1 > 0)
            addItem(itemKept1, 1);
        if (itemKept2 > 0)
            addItem(itemKept2, 1);
        if (itemKept3 > 0)
            addItem(itemKept3, 1);
        if (itemKept4 > 0)
            addItem(itemKept4, 1);
	if (keep6570) {
	    addItem(6570, 1);
	    keep6570 = false;
	}
	
			resetKeepItem();
			hitDiff = 0;	
			updateRequired = true; appearanceUpdateRequired = true;
		}
    public void keepItem1()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
            if(value > highest && playerItems[i]-1 != -1)
            {
                highest = value;
                itemKept1 = playerItems[i]-1;
                itemKept1Slot = i;
                itemSlot1 = true;
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
            if(value > highest && playerEquipment[i] != -1)
            {
                highest = value;
                itemKept1 = playerEquipment[i];
                itemKept1Slot = i;
                itemSlot1 = false;
            }
        }
    }

    public void keepItem2() {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemKept2 = playerItems[i]-1;
                    itemKept2Slot = i;
                    itemSlot2 = true;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemKept2 = playerEquipment[i];
                    itemKept2Slot = i;
                    itemSlot2 = false;
                }
            }
        }
    }

    public void keepItem3()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemKept3 = playerItems[i]-1;
                    itemKept3Slot = i;
                    itemSlot3 = true;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemKept3 = playerEquipment[i];
                    itemKept3Slot = i;
                    itemSlot3 = false;
                }
            }
        }
    }

    public void keepItem4()
    {
        int highest = 0;
        for (int i = 0; i < playerItems.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerItems[i]-1));
                if(value > highest && playerItems[i]-1 != -1)
                {
                    highest = value;
                    itemKept4 = playerItems[i]-1;
                    itemKept4Slot = i;
                    itemSlot4 = true;
                }
            }
        }
        for (int i = 0; i < playerEquipment.length; i++)
        {
            if (itemKept1Slot != i && itemKept2Slot != i && itemKept3Slot != i)
            {
                int value = (int)Math.floor(GetItemValue(playerEquipment[i]));
                if(value > highest && playerEquipment[i] != -1)
                {
                    highest = value;
                    itemKept4 = playerEquipment[i];
                    itemKept4Slot = i;
                    itemSlot4 = false;
                }
            }
        }
    }

   public void resetKeepItem()
    {
        itemKept1 = itemKept2 = itemKept3 = itemKept4 = -1;
        itemKept1Slot = itemKept2Slot = itemKept3Slot = itemKept4Slot = -1;
    itemLose1 = itemLose2 = itemLose3 = itemLose4 = itemLose5 = itemLose6 = itemLose7 = itemLose8 = itemLose9 = itemLose10 = itemLose11 = itemLose12 = itemLose13 = itemLose14 = itemLose15 = itemLose16 = itemLose17 = itemLose18 = itemLose19 = itemLose20 = itemLose21 = itemLose22 = itemLose23 = itemLose24 = itemLose25 = itemLose26 = itemLose27 = itemLose28 = itemLose29 = itemLose30 = itemLose31 = itemLose32 = itemLose33 = itemLose34 = itemLose35 = itemLose36 = itemLose37 = itemLose38 = itemLose39 = -1;
    itemLose1Slot = itemLose2Slot = itemLose3Slot = itemLose4Slot = itemLose5Slot = itemLose6Slot = itemLose7Slot = itemLose8Slot = itemLose9Slot = itemLose10Slot = itemLose11Slot = itemLose12Slot = itemLose13Slot = itemLose14Slot = itemLose15Slot = itemLose16Slot = itemLose17Slot = itemLose18Slot = itemLose19Slot = itemLose20Slot = itemLose21Slot = itemLose22Slot = itemLose23Slot = itemLose24Slot = itemLose25Slot = itemLose26Slot = itemLose27Slot = itemLose28Slot = itemLose29Slot = itemLose30Slot = itemLose31Slot = itemLose32Slot = itemLose33Slot = itemLose34Slot = itemLose35Slot = itemLose36Slot = itemLose37Slot = itemLose38Slot = itemLose39Slot = -1;
    }
    public void keepItemHandle()
    {
        keepItem1();
        keepItem2();
        keepItem3();
        if (itemKept1 > 0)
        {
            if (itemSlot1)
                deleteItem(itemKept1, itemKept1Slot, 1);
            else if (!itemSlot1)
                deleteequiment(itemKept1, itemKept1Slot);
        }
        if (itemKept2 > 0)
        {
            if (itemSlot2)
                deleteItem(itemKept2, itemKept2Slot, 1);
            else if (!itemSlot2)
                deleteequiment(itemKept2, itemKept2Slot);
        }
        if (itemKept3 > 0)
        {
            if (itemSlot3)
                deleteItem(itemKept3, itemKept3Slot, 1);
            else if (!itemSlot3)
                deleteequiment(itemKept3, itemKept3Slot);
        }
    }

    public void applyProtectItemProt()
    {
if(!isSkulled)
        keepItem4();
        if (itemKept4 > 0)
        {
            if (itemSlot4)
                deleteItem(itemKept4, itemKept4Slot, 1);
            else if (!itemSlot4)
                deleteequiment(itemKept4, itemKept4Slot);
        }
if(isSkulled)
        keepItem1();
        if (itemKept1 > 0)
        {
            if (itemSlot1)
                deleteItem(itemKept1, itemKept1Slot, 1);
            else if (!itemSlot1)
                deleteequiment(itemKept1, itemKept1Slot);
        }
    }

	public void refreshSkills() {

		sendQuest("" + playerLevel[0] + "", 4004);
		sendQuest("" + playerLevel[2] + "", 4006);
		sendQuest("" + playerLevel[1] + "", 4008);
		sendQuest("" + playerLevel[4] + "", 4010);
		sendQuest("" + playerLevel[5] + "", 4012);
		sendQuest("" + playerLevel[6] + "", 4014);
		sendQuest("" + currentHealth + "", 4016);
		sendQuest("" + playerLevel[16] + "", 4018);
		sendQuest("" + playerLevel[15] + "", 4020);
		sendQuest("" + playerLevel[17] + "", 4022);
		sendQuest("" + playerLevel[12] + "", 4024);
		sendQuest("" + playerLevel[9] + "", 4026);
		sendQuest("" + playerLevel[14] + "", 4028);
		sendQuest("" + playerLevel[13] + "", 4030);
		sendQuest("" + playerLevel[10] + "", 4032);
		sendQuest("" + playerLevel[7] + "", 4034);
		sendQuest("" + playerLevel[11] + "", 4036);
		sendQuest("" + playerLevel[8] + "", 4038);
		sendQuest("" + playerLevel[20] + "", 4152);
		sendQuest("" + playerLevel[18] + "", 12166);
		sendQuest("" + playerLevel[19] + "", 13926);

		sendQuest("" + getLevelForXP(playerXP[0]) + "", 4005);
		sendQuest("" + getLevelForXP(playerXP[2]) + "", 4007);
		sendQuest("" + getLevelForXP(playerXP[1]) + "", 4009);
		sendQuest("" + getLevelForXP(playerXP[4]) + "", 4011);
		sendQuest("" + getLevelForXP(playerXP[5]) + "", 4013);
		sendQuest("" + getLevelForXP(playerXP[6]) + "", 4015);
		sendQuest("" + getLevelForXP(playerXP[3]) + "", 4017);
		sendQuest("" + getLevelForXP(playerXP[16]) + "", 4019);
		sendQuest("" + getLevelForXP(playerXP[15]) + "", 4021);
		sendQuest("" + getLevelForXP(playerXP[17]) + "", 4023);
		sendQuest("" + getLevelForXP(playerXP[12]) + "", 4025);
		sendQuest("" + getLevelForXP(playerXP[9]) + "", 4027);
		sendQuest("" + getLevelForXP(playerXP[14]) + "", 4029);
		sendQuest("" + getLevelForXP(playerXP[13]) + "", 4031);
		sendQuest("" + getLevelForXP(playerXP[10]) + "", 4033);
		sendQuest("" + getLevelForXP(playerXP[7]) + "", 4035);
		sendQuest("" + getLevelForXP(playerXP[11]) + "", 4037);
		sendQuest("" + getLevelForXP(playerXP[8]) + "", 4039);
		sendQuest("" + getLevelForXP(playerXP[20]) + "", 4153);
		sendQuest("" + getLevelForXP(playerXP[18]) + "", 12167);
		sendQuest("" + getLevelForXP(playerXP[19]) + "", 13927);

		sendQuest("" + playerXP[0] + "", 4044);
		sendQuest("" + playerXP[2] + "", 4050);
		sendQuest("" + playerXP[1] + "", 4056);
		sendQuest("" + playerXP[4] + "", 4062);
		sendQuest("" + playerXP[5] + "", 4068);
		sendQuest("" + playerXP[6] + "", 4074);
		sendQuest("" + playerXP[3] + "", 4080);
		sendQuest("" + playerXP[16] + "", 4086);
		sendQuest("" + playerXP[15] + "", 4092);
		sendQuest("" + playerXP[17] + "", 4098);
		sendQuest("" + playerXP[12] + "", 4104);
		sendQuest("" + playerXP[9] + "", 4110);
		sendQuest("" + playerXP[14] + "", 4116);
		sendQuest("" + playerXP[13] + "", 4122);
		sendQuest("" + playerXP[10] + "", 4128);
		sendQuest("" + playerXP[7] + "", 4134);
		sendQuest("" + playerXP[11] + "", 4140);
		sendQuest("" + playerXP[8] + "", 4146);
		sendQuest("" + playerXP[20] + "", 4157);
		sendQuest("" + playerXP[18] + "", 12171);
		sendQuest("" + playerXP[19] + "", 13921);

		sendQuest("" + getXPForLevel(playerLevel[0] + 1) + "", 4045);
		sendQuest("" + getXPForLevel(playerLevel[2] + 1) + "", 4051);
		sendQuest("" + getXPForLevel(playerLevel[1] + 1) + "", 4057);
		sendQuest("" + getXPForLevel(playerLevel[4] + 1) + "", 4063);
		sendQuest("" + getXPForLevel(playerLevel[5] + 1) + "", 4069);
		sendQuest("" + getXPForLevel(playerLevel[6] + 1) + "", 4075);
		sendQuest("" + getXPForLevel(playerLevel[3] + 1) + "", 4081);
		sendQuest("" + getXPForLevel(playerLevel[16] + 1) + "", 4087);
		sendQuest("" + getXPForLevel(playerLevel[15] + 1) + "", 4093);
		sendQuest("" + getXPForLevel(playerLevel[17] + 1) + "", 4099);
		sendQuest("" + getXPForLevel(playerLevel[12] + 1) + "", 4105);
		sendQuest("" + getXPForLevel(playerLevel[9] + 1) + "", 4111);
		sendQuest("" + getXPForLevel(playerLevel[14] + 1) + "", 4117);
		sendQuest("" + getXPForLevel(playerLevel[13] + 1) + "", 4123);
		sendQuest("" + getXPForLevel(playerLevel[10] + 1) + "", 4129);
		sendQuest("" + getXPForLevel(playerLevel[7] + 1) + "", 4135);
		sendQuest("" + getXPForLevel(playerLevel[11] + 1) + "", 4141);
		sendQuest("" + getXPForLevel(playerLevel[8] + 1) + "", 4147);
		sendQuest("" + getXPForLevel(playerLevel[20] + 1) + "", 4158);
		sendQuest("" + getXPForLevel(playerLevel[18] + 1) + "", 12172);
		sendQuest("" + getXPForLevel(playerLevel[19] + 1) + "", 13922);
		sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
	}


public void turnpray(){
server.setConfig.turnPrayOff(playerId);
}


	public void createGroundItem(int itemID, int itemX, int itemY,
			int itemAmount) {
		// Phate: creates item at absolute X and Y
		outStream.createFrame(85); // Phate: Spawn ground item
		outStream.writeByteC((itemY - 8 * mapRegionY));
		outStream.writeByteC((itemX - 8 * mapRegionX));
		outStream.createFrame(44);
		outStream.writeWordBigEndianA(itemID);
		outStream.writeWord(itemAmount);
		outStream.writeByte(0); // x(4 MSB) y(LSB) coords
		// System.out.println("CreateGroundItem "+itemID+" "+(itemX - 8 *
		// mapRegionX)+","+(itemY - 8 * mapRegionY)+" "+itemAmount);
	}

	public static boolean AutoSave = false;
	public static final int bufferSize = 30000;
public static final int packetSizes[] = {
        0, 0, 0, 1, -1, 0, 0, 0, 0, 0, //0
        0, 0, 0, 0, 8, 0, 6, 2, 2, 0,  //10
        0, 2, 0, 6, 0, 12, 0, 0, 0, 0, //20
        0, 0, 0, 0, 0, 8, 4, 0, 0, 2,  //30
        2, 6, 0, 6, 0, -1, 0, 0, 0, 0, //40
        0, 0, 0, 12, 0, 0, 0, 8, 8, 0, //50
        8, 8, 0, 0, 0, 0, 0, 0, 0, 0,  //60
        6, 0, 2, 2, 8, 6, 0, -1, 0, 6, //70
        0, 0, 0, 0, 0, 1, 4, 6, 0, 0,  //80
        0, 0, 0, 0, 0, 3, 0, 0, -1, 0, //90
        0, 13, 0, -1, 0, 0, 0, 0, 0, 0,//100
        0, 0, 0, 0, 0, 0, 0, 6, 0, 0,  //110
        1, 0, 6, 0, 0, 0, -1, 0, 2, 6, //120
        0, 4, 6, 8, 0, 6, 0, 0, 0, 2,  //130
        0, 0, 0, 0, 0, 6, 0, 0, 0, 0,  //140
        0, 0, 1, 2, 0, 2, 6, 0, 0, 0,  //150
        0, 0, 0, 0, -1, -1, 0, 0, 0, 0,//160
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  //170
        0, 8, 0, 3, 0, 2, 0, 0, 8, 1,  //180
        0, 0, 12, 0, 0, 0, 0, 0, 0, 0, //190
        2, 0, 0, 0, 0, 0, 0, 0, 4, 0,  //200
        4, 0, 0, 0, 7, 8, 0, 0, 10, 0, //210
        0, 0, 0, 0, 0, 0, -1, 0, 6, 0, //220
        1, 0, 0, 0, 6, 0, 6, 8, 1, 0,  //230
        0, 4, 0, 0, 0, 0, -1, 0, -1, 4,//240
        0, 0, 6, 6, 0, 0, 0         //250
    };
	public static final int validPackets[] = {
		1, 0, 0, 1, 1, 0, 0, 0, 0, 0, //0
		0, 0, 0, 0, 1, 0, 1, 1, 1, 0,  //10
		0, 1, 0, 0, 0, 1, 0, 0, 0, 0,   //20
		0, 0, 0, 0, 0, 1, 1, 0, 0, 1,  //30
		1, 1, 0, 1, 0, 1, 0, 0, 0, 0,  //40
		0, 0, 0, 1, 0, 0, 0, 1, 0, 0,  //50
		1, 0, 0, 0, 0, 0, 0, 0, 0, 0,  //60
		1, 0, 1, 1, 1, 1, 0, 1, 1, 1,   //70
		0, 0, 0, 0, 0, 1, 1, 1, 0, 0,  //80
		0, 0, 0, 0, 0, 1, 0, 0, 1, 0,  //90
		0, 1, 0, 1, 0, 0, 0, 0, 0, 0,  //100
		0, 0, 0, 0, 0, 0, 0, 1, 0, 0,  //110
		1, 1, 1, 0, 0, 0, 1, 0, 1, 1,   //120
		1, 1, 1, 1, 0, 1, 1, 0, 0, 1,   //130
		0, 0, 0, 0, 0, 1, 0, 0, 1, 0,   //140
		1, 0, 1, 1, 0, 1, 1, 0, 0, 0,  //150
		0, 0, 0, 0, 1, 1, 0, 0, 0, 0,  //160
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   //170
		0, 1, 0, 1, 0, 1, 0, 0, 1, 1,  //180
		0, 0, 1, 0, 0, 0, 0, 0, 0, 0,  //190
		1, 0, 1, 0, 0, 0, 0, 0, 1, 0,  //200
		1, 0, 0, 0, 1, 1, 0, 0, 1, 0,   //210
		0, 0, 0, 0, 0, 0, 1, 0, 1, 0,   //220
		1, 0, 0, 0, 1, 0, 1, 1, 1, 0,   //230
		0, 1, 0, 0, 0, 0, 1, 0, 1, 1,  //240
		0, 0, 1, 1, 0, 0, 0            //250
	};
    public boolean destroyItem(int item) {
        for(int i = 0; i < noTrade.length; i++) {
            if(noTrade[i] == item)
            return true;
        }
        return false;
    }
    public String getMessageA(int itemID){
        switch(itemID){
            case 6570: return "You can get another from the Fight";
            case 4045: return "You can get another from the wizard at Home";
            case 4046: return "You can get another from the wizard at Home";
        }
        return "Are you sure you want to destroy this item!";
    }
    public String getMessageB(int itemID){
        switch(itemID){
            case 6570: return "Caves minigame.";
        }
        return "";
    }  
	public int[] noTrade = {5509,5510,5512,5514,4565,4566,6570,1580,6729,4045,4046,714,771,772,1891,1892,983,1550,4031,4035,1613,1629,4277,739,1982,1796};
	public int NPCID; // GLOBALLY NOW last clicked npcID -bakatool

	public int NPCSlot; // GLOBALLY NOW last clicked npc slot -bakatool


	public CopyOnWriteArrayList<GameItem> offeredItems = new CopyOnWriteArrayList<GameItem>();

	public boolean officialClient = false;
	public int OriginalShield = -1;
	public int OriginalWeapon = -1;
	public CopyOnWriteArrayList<GameItem> otherOfferedItems = new CopyOnWriteArrayList<GameItem>();
	public int packetSize = 0, packetType = -1;

	public int pCArms;

	public int pCBeard;
	public int pCFeet;
	public int pCHands;
	public int pCHead;

	public int pCLegs;
	public int pColor;

	public int pCTorso;

	public int PickUpAmount = 0;

	public int PickUpDelete = 0;

	public int PickUpID = 0;

	public String properName = "";

	public int Publicchat = 0;
	public int[] QuestInterface = { 8145, 8147, 8148, 8149, 8150, 8151, 8152,
			8153, 8154, 8155, 8156, 8157, 8158, 8159, 8160, 8161, 8162, 8163,
			8164, 8165, 8166, 8167, 8168, 8169, 8170, 8171, 8172, 8173, 8174,
			8175, 8176, 8177, 8178, 8179, 8180, 8181, 8182, 8183, 8184, 8185,
			8186, 8187, 8188, 8189, 8190, 8191, 8192, 8193, 8194, 8195, 12174,
			12175, 12176, 12177, 12178, 12179, 12180, 12181, 12182, 12183,
			12184, 12185, 12186, 12187, 12188, 12189, 12190, 12191, 12192,
			12193, 12194, 12195, 12196, 12197, 12198, 12199, 12200, 12201,
			12202, 12203, 12204, 12205, 12206, 12207, 12208, 12209, 12210,
			12211, 12212, 12213, 12214, 12215, 12216, 12217, 12218, 12219,
			12220, 12221, 12222, 12223 };
	public int random_skill = -1, npcId = -1;
	public int readPtr, writePtr;
	public int[] requiredLevel = { 1, 10, 25, 38, 50, 60, 62, 64, 66, 68, 70,
			72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96 };

	public int restart = 0;


	public int returnCode = 2; // Tells the client if the login was successfull

	public int rune1, rune1Am, rune2, rune2Am, rune3, rune3Am, rune4, rune4Am,
			spellXP;

	public int sameclick = 0;

	public int savecounter = 0;

	public boolean saveNeeded = true;

	public boolean shafting = false;

	public int SkillID = 0;

	public int skillX = -1;

	public int skillY = -1;

	private int somejunk;
	// -bakatool
	public int spellHit; // also same added so it won't be static ROFL
	// -bakatool
	public int spellHitTimer;
	// npc. -bakatool
	public int spellNpcIndex = -1; // added so it won't be static ROFL..
	// -bakatool
	public int spellPlayerIndex = -1; // same added so it won't be static ROFL
	public boolean spellSet = false;
	public int stairDistance = 1;
	public int stairDistanceAdd = 0;
	public int stairs = 0;
	public int[] statId = { 10252, 11000, 10253, 11001, 10254, 11002, 10255,
			11011, 11013, 11014, 11010, 11012, 11006, 11009, 11008, 11004,
			11003, 11005, 47002, 54090, 11007 };
	public String statName[] = { "attack", "defence", "strength", "hitpoints",
			"range", "prayer", "magic", "cooking", "woodcutting", "fletching",
			"fishing", "firemaking", "crafting", "smithing", "mining",
			"herblore", "agility", "thieving", "slayer", "farming",
			"runecrafting"};
	public int stealtimer;
	public int stillSpellGFX;
	public int timeOutCounter = 0; // to detect timeouts on the connection to
	// the client

	public int trade_reqId = 0, trade_other;

	public int Tradecompete = 0;
	public boolean tradeRequested = false, inTrade = false, canOffer = true,
			tradeConfirmed = false, tradeConfirmed2 = false,
			tradeResetNeeded = false;
	long tTime = 0;
	long tTime2 = 0;
	long tTime13 = 0;
	// Devolution: teleports
	int tX = 0, tY = 0, tH = 1;

	public boolean validClient = true, muted = false, attackedNpc = false;

	public boolean validLogin = false;
	// public int[] restrictedItem = { 4716, 4718, 4720, 4722, 4724, 4726, 4728,
	// 4730};
	private int WanneBank = 0;
	private int WanneShop = 0;

	public boolean wearing = false;

	public boolean WildernessWarning = false;

	public boolean WildernessWarning2 = false;

	private int woodcutting[] = { 0, 0, 0, 1, -1, 2 };

	private int XinterfaceID = 0;

	private int XremoveID = 0;

	private int XremoveSlot = 0;


	public client(java.net.Socket s, int _playerId) {
		super(_playerId);
		mySock = s;
		try {
			in = s.getInputStream();
			out = s.getOutputStream();
			//in = new java.io.DataInputStream(s.getInputStream());
			//out = new DataOutputStream(s.getOutputStream());
		} catch (java.io.IOException ioe) {
			misc.println("Owner Robbie (1): Exception!");
			server.logError(ioe.getMessage());
		}

		outStream = new stream(new byte[bufferSize]);
		outStream.currentOffset = 0;
		inStream = new stream(new byte[bufferSize]);
		inStream.currentOffset = 0;

		readPtr = writePtr = 0;
		buffer = buffer = new byte[bufferSize];
	}

	public void actionReset() {
		actionName = "";
	}


	public boolean addItem2(int item, int amount) {
	try {
                if(item == -1)
                return false;
		if (!Item.itemStackable[item] || amount < 1) {
			amount = 1;
		}

		if ((freeSlots() >= amount && !Item.itemStackable[item]) || freeSlots() > 0) {
			for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] == (item+1) && Item.itemStackable[item] && playerItems[i] > 0) {
					playerItems[i] = (item + 1);
					if ((playerItemsN[i] + amount) < maxItemAmount && (playerItemsN[i] + amount) > -1) {
						playerItemsN[i] += amount;
					} else {
						playerItemsN[i] = maxItemAmount;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); //amount	
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
	                for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] <= 0) {
					playerItems[i] = item+1;
					if (amount < maxItemAmount && amount > -1) {
						playerItemsN[i] = amount;
					} else {
						playerItemsN[i] = maxItemAmount;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); //amount	
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
			return false;
		} else {
			ItemHandler.addItem(item, absX, absY, amount, playerId, false);
			return false;
		}
	} catch (Exception E) { return false; }
	}

	public boolean addItem(int item, int amount) {
	try {
                if(item == -1)
                return false;
		if (!Item.itemStackable[item] || amount < 1) {
			amount = 1;
		}

		if ((freeSlots() >= amount && !Item.itemStackable[item]) || freeSlots() > 0) {
			for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] == (item+1) && Item.itemStackable[item] && playerItems[i] > 0) {
					playerItems[i] = (item + 1);
					if ((playerItemsN[i] + amount) < maxItemAmount && (playerItemsN[i] + amount) > -1) {
						playerItemsN[i] += amount;
					} else {
						playerItemsN[i] = maxItemAmount;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); //amount	
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
	                for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] <= 0) {
					playerItems[i] = item+1;
					if (amount < maxItemAmount && amount > -1) {
						playerItemsN[i] = amount;
					} else {
						playerItemsN[i] = maxItemAmount;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); //amount	
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
			return false;
		} else {
			sM("Not enough space in your inventory.");
			return false;
		}
	} catch (Exception E) { return false; }
	}
	public void addObject(int objectX, int objectY, int NewObjectID, int Face) {
		outStream.createFrameVarSizeWord(60);
		outStream.writeByte(objectY - (mapRegionY * 8));
		outStream.writeByteC(objectX - (mapRegionX * 8));

		/* CREATE OBJECT */
		if (NewObjectID > -1) {
			outStream.writeByte(151);
			outStream.writeByteS(0);
			outStream.writeWordBigEndian(NewObjectID);
			outStream.writeByteA(Face); // 0= WEST | -1 = NORTH | -2 = EAST | -3
			// = SOUTH
		}
		outStream.endFrameVarSizeWord();
	}

	public boolean addShopItem(int itemID, int amount) {
		boolean Added = false;

		if (amount <= 0) {
			return false;
		}
		if (Item.itemIsNote[itemID] == true) {
			itemID = GetUnnotedItem(itemID);
		}
		for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
			if ((server.shopHandler.ShopItems[MyShopID][i] - 1) == itemID) {
				server.shopHandler.ShopItemsN[MyShopID][i] += amount;
				Added = true;
			}
		}
		if (Added == false) {
			for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
				if (server.shopHandler.ShopItems[MyShopID][i] == 0) {
					server.shopHandler.ShopItems[MyShopID][i] = (itemID + 1);
					server.shopHandler.ShopItemsN[MyShopID][i] = amount;
					server.shopHandler.ShopItemsDelay[MyShopID][i] = 0;
					break;
				}
			}
		}
		return true;
	}

	public boolean addSkillXP(int amount, int skill) {
		if (randomed) {
			sM("You must answer the genie before you can gain experience!");
			return false;
		}
		if ((amount + playerXP[skill]) < 0 || amount + playerXP[skill] > 200000000 || playerXP[skill] >= 200000000) {
			playerXP[skill] = 200000000;
			refreshSkills();
			return false;
		}
		int oldLevel = getLevelForXP(playerXP[skill]);
		// int[] statId = {4004, 4008, 4006, 4016, 4010, 4012, 4014, 4034, 4038,
		// 4026, 4032, 4036, 4024, 4030, 4028, 4020, 4018, 4022, 4152};
		playerXP[skill] += amount;
		if (oldLevel < getLevelForXP(playerXP[skill])) {
			// if(oldLevel >= 85)
			specGFX(199);
			//checkPlayerCapes.achievedMax(skill, this);

			playerLevel[skill] = getLevelForXP(playerXP[skill]);
			stillgfx(623, absY, absX);
			levelup(skill);
			updateRequired = true;
			appearanceUpdateRequired = true;
			//sM("Congratulations, you just advanced a "
					//+ statName[skill] + " level.");
			getTotalLevel();
			if (playerLevel[skill] > 90)
			sendFrame126(playerName + " (" + combatLevel + ")", 6572);
			setSkillLevel(skill, playerLevel[skill], playerXP[skill]);
		}
			refreshSkills();
		// setSkillLevel(skill, playerLevel[skill], playerXP[skill]);
		if (skill == 2) {
			CalculateMaxHit();
		}
		return true;

	}
	public int amountOfItem(int itemID) {
		int i1 = 0;

		for (int i = 0; i < 28; i++) {
			if (playerItems[i] == (itemID + 1)) {
				i1++;
			}
		}
		return i1;
	}
	public boolean antiHax() {
		if (System.currentTimeMillis() - lastMouse > 1000) {
			sM("Client hack detected!");
			//sM("The only supported clients are the DeltaScape client and moparscape");
			return false;
		}
		return true;
	}
	public void appendToHiscores(String player) {

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(
					new FileWriter("config//hiscores.txt", true));
			bw.write(player);
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe2) {
					sM("Error with hiscores!");
				}
			}
		}

	}
	public void appendToAutoSpawn(int npcid, int absx, int absy) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(
					new FileWriter("config//autospawncodes.txt", true));
			bw.write("spawn = "+npcid+"	"+absx+"	"+absy+"	0	0	0	0	0	1");
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe2) {
					sM("Error autospawning!");
				}
			}
		}

	}
	public void appendToAutoSpawn2(int npcid, int absx, int absy, int absx2, int absy2, int absx3, int absy3) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(
					new FileWriter("config/autospawncodes.txt", true));
			bw.write("spawn = "+npcid+"	"+absx+"	"+absy+"	0	"+absx2+"	"+absy2+"	"+absx3+"	"+absy3+"	1");
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe2) {
					sM("Error autospawning!");
				}
			}
		}

	}
	public boolean AreXItemsInBag(int ItemID, int Amount) {
		int ItemCount = 0;

		for (int pItem : playerItems) {
			if ((pItem - 1) == ItemID) {
				ItemCount++;
			}
			if (ItemCount == Amount) {
				return true;
			}
		}
		return false;
	}
public void drawback() {
    if (hasCrystalBow()) {
	specGFX(250);
	}
    if (playerEquipment[playerArrows] == 882 && !hasCrystalBow()){
        specGFX(18);
        }
    else if (playerEquipment[playerArrows] == 884 && !hasCrystalBow()) {
        specGFX(19);
        }
    else if (playerEquipment[playerArrows] == 886 && !hasCrystalBow()) {
        specGFX(20);
        }
    else if (playerEquipment[playerArrows] == 888 && !hasCrystalBow()) {
        specGFX(21);
        }
    else if (playerEquipment[playerArrows] == 890 && !hasCrystalBow()) {
        specGFX(22);
        }
    else if (playerEquipment[playerArrows] == 892 && !hasCrystalBow()) {
        specGFX(24);

}
}


public int playerRank = 0;

public void resetRanks() {
	for (int i = 0; i < 10; i++) {
		server.ranks[i] = 0;
		server.rankPpl[i] = "";
	}
}
/*
public void highscores() {
	clearQuestInterface();
	sendQuest("@dbl@", 8144);  //Title
	sendQuest("@dre@~In-Game Top 10 Highscores~", 8145);
	for(int i = 0; i < 10; i++) { // you also need to change this for it to display more, simply the number you want it to display, say 20 = for(int i = 0; i < 20; i++)
		if(server.ranks[i] > 0) {
			sendQuest("@bla@Rank "+(i+1)+": @red@"+server.rankPpl[i]+ "@bla@ - Total Lvl:@whi@ " +server.ranks[i], 8148+i);
		}
	}
	sendQuestSomething(8143);
	showInterface(8134);
	flushOutStream();
	//resetRanks();
}*/

public void highscores() {
clearQuestInterface();
for(int i = 0; i < server.playerHandler.maxPlayers; i++) {
if(server.playerHandler.players[i] != null) { {
sendQuest("@dre@", 8144);  //Title
sendQuest("@blu@ ====Highscores====", 8145);
sendQuest("@bla@"+server.playerHandler.players[i].playerName+ " =  @whi@Total Lvl:@gre@ " +server.playerHandler.players[i].playerLevel[24]+ "@bla@   Rank @red@"  +server.playerHandler.players[i].playerLevel[22], 8147+i);
}
}
}
sendQuestSomething(8143);
showInterface(8134);
flushOutStream();
}


	



public boolean hasKnife(){
int a = playerEquipment[playerWeapon];
if(a == 863 || a == 864 || a == 865 || a == 866 || a == 867 || a == 868 || a == 869){
return true;
}
return false;
}
	// pk: 2726 9193
	private boolean Attack() {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
		int EnemyX = PlayerHandler.players[AttackingOn].absX;
		int EnemyY = PlayerHandler.players[AttackingOn].absY;
if(hasKnife()){
sM("Knives are disabled for now!");
ResetAttack();
return false;
}
if ((playerEquipment[playerHat] == 4515 || playerEquipment[playerCape] == 4516) && (AttackingOn2.playerEquipment[playerHat] == 4515 || AttackingOn2.playerEquipment[playerCape] == 4516)) {
sM("You can't attack your own team.");
}
if ((playerEquipment[playerHat] == 4513 || playerEquipment[playerCape] == 4514) && (AttackingOn2.playerEquipment[playerHat] == 4513 || AttackingOn2.playerEquipment[playerCape] == 4514)) {
sM("You can't attack your own team.");
}
if(hitID != AttackingOn2.playerId && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
ResetAttack();
faceNPC(32768 + AttackingOn);
return false;
}

		if (!(AttackingOn > 0)
				|| !(AttackingOn < server.playerHandler.players.length)) {
			ResetAttack();
			return false;
		}
		if (playerId < 1) {
			sM("Error: Your player id is invalid. Please try again or logout and back in");
		}


		boolean UseBow = false;
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow()) {
			UseBow = true;
		}
		boolean UseCrossBow = false;
		if (playerEquipment[playerWeapon] == 837) {
			UseCrossBow = true;
		}
		boolean UseRing = false;
		if (playerEquipment[playerWeapon] == 6522) {
			UseRing = true;
		}
		if (UseBow) {
				HasArrows = false;
				CheckArrows();
				//CalculateRange();
				hitDiff = misc.random(maxRangeHit());
				//drawback();
		}
		if (UseCrossBow) {
				HasBolts = false;
				CheckBolts();
				//CalculateRange();
				hitDiff = misc.random(maxRangeHit());
		}
		if (UseRing) {
				HasRings = false;
				CheckRings();
				//CalculateRange();
				hitDiff = misc.random(maxRangeHit());
		}
		
if(UseBow || UseCrossBow || UseRing){
			
if(GoodDistance(EnemyX, EnemyY, absX, absY, 6) == false && followID == 0 && EntangleDelay == 0 && GoodDistance(EnemyX, EnemyY, absX, absY, 14) == true){
	    followID = AttackingOn2.playerId;
		} 
		
else if (GoodDistance(EnemyX, EnemyY, absX, absY, 6) == true || EntangleDelay != 0){
		followID = 0;
		resetfollowers();
		}
else if (GoodDistance(EnemyX, EnemyY, absX, absY, 14) == false){
sM("You are too far to range your enemy!");
ResetAttack();
return false;
}
}
/*
if(GoodDistance(EnemyX, EnemyY, absX, absY, 8) == false){
sM("You are too far to range your enemy!");
ResetAttack();
return false;
}//getMove
}*/
		int EnemyHP = PlayerHandler.players[AttackingOn].currentHealth;
		int EnemyHPExp = PlayerHandler.players[AttackingOn].playerXP[playerHitpoints];
		int[] arrowIds = { 882, 884, 886, 888, 890, 892, 78 };
		int[] arrowGfx = { 10, 9, 11, 12, 13, 15, 16 };
		int[] staffs = {1381, 1383, 1385, 1387, 4675, 13647};
		faceNPC(32768 + AttackingOn);
		updateRequired = true;
		appearanceUpdateRequired = true;
		int arrowgfx = 10;
		for (int i1 = 0; i1 < arrowIds.length; i1++) {
			if (playerEquipment[playerArrows] == arrowIds[i1]) {
				arrowgfx = arrowGfx[i1];
			}
		}
		if(hasCrystalBow()){
			arrowgfx = 249;
		}
		for (int element : staffs) {
			if ((playerEquipment[playerWeapon] == element)
					&& autocasting && autocastID > 0 && 
				(inFunPK() && !AttackingOn2.inFunPK() || isInPitGame() && !AttackingOn2.isInPitRoom() || isInWilderness(absX, absY, 1) == true && AttackingOn2.isInWilderness(AttackingOn2.absX, AttackingOn2.absY, 1) == true)) {
				int playerTargetX = server.playerHandler.players[AttackingOn].absX;
				int playerTargetY = server.playerHandler.players[AttackingOn].absY;
				int playerTargetCombat = server.playerHandler.players[AttackingOn].combat;
				int playerTargetHealth = server.playerHandler.players[AttackingOn].playerLevel[playerHitpoints];
				if (System.currentTimeMillis() - lastAttack < 4000) {
					//sM("You must wait 4 seconds before casting this kind of spell again");
					return false;
				}
				if (!playerMage(AttackingOn)) {
					return false;
				}
				inCombat = true;
				lastCombat = System.currentTimeMillis();
				lastAttack = lastCombat;

				TurnPlayerTo(playerTargetX, playerTargetY);
				updateRequired = true;
				appearanceUpdateRequired = true;

				toX = absX;
				toY = absY;
                		newWalkCmdSteps = 0;
                		newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
                		getNextPlayerMovement();
				MagicHandler.playerX = playerTargetX;
				MagicHandler.playerY = playerTargetY;
				MagicHandler.playerHP = playerTargetHealth;
				AttackingOn2.offTimer = System.currentTimeMillis();
				AttackingOn2.hitID = playerId;
				spellPlayerIndex = MagicHandler.magicSpellPlayer(autocastID,
						playerId, AttackingOn, playerLevel[6]);
				return true;
		}
		}
		int voidmelee = 0;
		int hitDiff = 0;
		int aBonus = 0;
		int rand_att = misc.random(playerLevel[0])*3 + misc.random(AtkPray * 8);
		int rand_def = (int) (0.65 * misc.random(AttackingOn2.playerLevel[1]) + AttackingOn2.DefPray * 8);
		if(AttackingOn2.ProtMelee){
		rand_def += misc.random(100);
		}
		if(FullVMelee()){
		voidmelee += 10;
		}
		if (FightType == 1)
			aBonus += (int) (playerBonus[1] / 20);
		int random_u = misc.random(playerBonus[1] + aBonus) * 2;
		int dBonus = 0;
		if (AttackingOn2.FightType == 4)
			dBonus += (int) (AttackingOn2.playerBonus[6] / 20);
		int random_def = misc.random(AttackingOn2.playerBonus[6] + dBonus + AttackingOn2.AtkPray * 8);
		if ((random_u >= random_def) && (rand_att > rand_def)) {
			hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(voidmelee);
			if(AttackingOn2.ProtMelee)
			hitDiff /= 2;
		} else {
			hitDiff = 0;
		}
		long thisTime = System.currentTimeMillis();
		if (UseBow && playerEquipment[playerWeapon] == 4734) {
			//CalculateRange();
			hitDiff = misc.random(maxRangeHit());
			if (DeleteArrow() && playerEquipment[playerArrows] == 4740) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseBow && hasCrystalBow()) {
			//CalculateRange();
			drawback();
			hitDiff = misc.random(maxRangeHit());
			degradeCrystalBow();
			if (DeleteArrow()) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				arrowsLeft -= 1;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseBow && !UseCrossBow && playerEquipment[playerWeapon] != 4734 && playerEquipment[playerWeapon] != 4827 && !hasCrystalBow()) {
			//CalculateRange();
			drawback();
			hitDiff = misc.random(maxRangeHit());
			if (DeleteArrow() && HasArrows) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseBow && playerEquipment[playerWeapon] == 4827) {
			//CalculateRange();
			drawback();
			hitDiff = misc.random(maxRangeHit());
			if (DeleteArrow() && HasArrows) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseCrossBow) {
			//CalculateRange();
			hitDiff = misc.random(maxRangeHit());
			if (DeleteArrow() && HasBolts) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseRing) {
			//CalculateRange();
			hitDiff = misc.random(maxRangeHit());
			if (DeleteRing() && HasRings) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttack();
				return false;
			}
		}
long thisAttack = System.currentTimeMillis();
if(Smite == true && AttackingOn2.playerLevel[5] > 0 && GoodDistance(EnemyX, EnemyY, absX, absY, 1))
					{
AttackingOn2.playerLevel[5] -= hitDiff/ 4;
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[5] + "", 4012);
AttackingOn2.sendFrame126("Prayer: "+AttackingOn2.playerLevel[5]+"/"+AttackingOn2.getLevelForXP(playerXP[5])+"", 687);
}
if(playerEquipment[playerWeapon] == 6528 && playerEquipment[playerAmulet] == 6577 && misc.random(3)==1){
hitDiff = misc.random(8) + misc.random(playerMaxHit) + misc.random(StrPrayer);
}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 80 && currentHealth < 100){
hitDiff = misc.random(8) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 60 && currentHealth < 79){
hitDiff = misc.random(18) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 40 && currentHealth < 59){
hitDiff = misc.random(28) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 20 && currentHealth < 39){
hitDiff = misc.random(38) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 0 && currentHealth < 18){
hitDiff = misc.random(58) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullVeracEquipped()) {
if(misc.random(2) == 1){
hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer);
}
	}
if(FullGuthanEquipped()) {
if(misc.random(3) == 1){
if((currentHealth + hitDiff) <= getLevelForXP(playerXP[3])){
currentHealth += hitDiff;
}
if((currentHealth + hitDiff) > getLevelForXP(playerXP[3])){
currentHealth = getLevelForXP(playerXP[3]);
}
sendQuest("" + currentHealth + "", 4016);
stillgfx(398, EnemyY, EnemyX);
}
	}
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
if(AttackingOn2.prayOn && AttackingOn2.Redemption && AttackingOn2.currentHealth < 10 && AttackingOn2.currentHealth > 0){
AttackingOn2.prayOff();
AttackingOn2.currentHealth += 20;
AttackingOn2.lowGFX(436,0);
AttackingOn2.playerLevel[5] = 0;
}
if(AttackingOn2.skulledBy != playerName && !isInPitGame() && !inFunPK()) {
lastSkull = System.currentTimeMillis();
isSkulled = true;
skulledBy = AttackingOn2.playerName;
getHead();
}
if(playerEquipment[playerWeapon] == 4827 && !specOn){
DDS2Damg3 = true;
ddsInterval = 2000;
lastDds = System.currentTimeMillis();
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
}
if(playerEquipment[playerWeapon] == 4827 && specialAmount > 74 && specOn && AttackingOn2.currentHealth > 0){
specialAtk(true, 75, 250, 1074);
hitDiff = misc.random(45) + misc.random(23);
rangeGFX(85, 643);
rangeGFX(65, 643);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
specAttack();
usingSpecial = true;
}
if((playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096) && specialAmount > 74 && specOn && AttackingOn2.currentHealth > 0){
specialAtk(true, 75, 256, 1074);
hitDiff = misc.random(maxRangeHit()) + misc.random(3);
rangeGFX(75, 249);
rangeGFX(95, 249);
specAttack();
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
usingSpecial = true;
}
if(playerEquipment[playerWeapon] == 859 && specialAmount > 99 && specOn && AttackingOn2.currentHealth > 0){
specialAtk(false, 100, 250, 426);
hitDiff = misc.random(maxRangeHit()) + misc.random(10);
rangeGFX(75, 249);
specAttack();
}

if(AttackingOn2.playerEquipment[AttackingOn2.playerRing] == 2570 && AttackingOn2.currentHealth > 0 && AttackingOn2.currentHealth < 6){
AttackingOn2.triggerTele(2999+misc.random(3), 3377+misc.random(3), 0);
AttackingOn2.playerEquipment[AttackingOn2.playerRing] = -1;
AttackingOn2.playerEquipmentN[AttackingOn2.playerRing] = 0;
AttackingOn2.setEquipment(-1, 0,AttackingOn2.playerRing);
}
if (((GoodDistance(EnemyX, EnemyY, absX, absY, 1) && !isMoving) ||  (GoodDistance(EnemyX, EnemyY, absX, absY, 3) && isMoving))&& !UseBow && !UseCrossBow && !UseRing ) {
			inCombat = true;
				lastCombat = System.currentTimeMillis();
				if (inFunPK() && AttackingOn2.inFunPK() || isInPitGame() && !AttackingOn2.isInPitRoom() || isInWilderness(absX, absY, 1) == true && AttackingOn2.isInWilderness(AttackingOn2.absX, AttackingOn2.absY, 1) == true ||  matchId == handler.players[AttackingOn].matchId && matchId >= 0) {
					if (PlayerHandler.players[AttackingOn].deathStage > 0) {
						ResetAttack();
					} else {
						if (inRange(EnemyX, EnemyY)) {
							if (thisAttack - lastAttack >= 4000)
								((client) PlayerHandler.players[AttackingOn])
										.sM("You are under attack!");
							PlayerHandler.players[AttackingOn]
									.resetWalkingQueue();
							PlayerHandler.players[AttackingOn].hits++;
							PlayerHandler.players[AttackingOn].fighting = true;
							PlayerHandler.players[AttackingOn].fightId = localId;
							PlayerHandler.players[AttackingOn].IsAttacking = true;
							((client) PlayerHandler.players[AttackingOn])
									.Attack();
							fightId = AttackingOn;
							fighting = true;
							resetWalkingQueue();
						}
if(AttackingOn2.hitID != playerId && AttackingOn2.hitID != 0 && !multiCombat()){
sM("Someone else is already fighting your opponent.");
ResetAttack();
faceNPC(32768 + AttackingOn);
return false;
}
                           client player = (client) server.playerHandler.players[playerId];
                           if (AttackingOn2.vengon && hitDiff != 0) {
                                player.hitDiff = (int)(hitDiff / 1.2);
				player.currentHealth -= (int)(hitDiff / 1.2);
                                player.hitUpdateRequired = true; // So the hit will append to you.
                                player.updateRequired = true; // So the hit will append to you.
                                player.appearanceUpdateRequired = true; // So the hit will append to you.
                                AttackingOn2.vengon = false;
                                AttackingOn2.plrText = "Taste vengeance!"; // This says it in itself.
                                AttackingOn2.plrTextUpdateRequired = true; // Make sure the txt4 will update.
                            }
        	double TotalExp = 0;
          if (UseBow || UseCrossBow) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), 4);
          } else if (FightType != 3) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), SkillID);
          } else {
            TotalExp = (double)(400*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), playerAttack);
            addSkillXP((int)(TotalExp), playerDefence);
            addSkillXP((int)(TotalExp), playerStrength);
          }
          TotalExp = (double)(500*hitDiff);
          TotalExp = (double)(TotalExp*CombatExpRate);
          addSkillXP((int)(TotalExp), playerHitpoints);
          attackTimer = 7;

setAnimation(GetWepAnim(playerEquipment[playerWeapon]));
AttackingOn2.KillerId = playerId;
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
AttackingOn2.setAnimation(AttackingOn2.GetBlockAnim());
AttackingOn2.offTimer = System.currentTimeMillis();
AttackingOn2.hitID = playerId;
if(AttackingOn2.prayOn && AttackingOn2.Redemption && AttackingOn2.currentHealth < 10 && AttackingOn2.currentHealth > 0){
AttackingOn2.prayOff();
AttackingOn2.currentHealth += 20;
AttackingOn2.lowGFX(436,0);
AttackingOn2.playerLevel[5] = 0;
}
if(specOn == true && AttackingOn2.currentHealth > 0 && GoodDistance(EnemyX, EnemyY, absX, absY, 1)){//players
if(playerEquipment[playerWeapon] == 3204 && specialAmount > 74){
specialAtk(true, 75, 282, 1203);
getHit(3);
usingSpecial = true;
}
if(playerEquipment[playerWeapon] == 5698 && specialAmount > 24){
specialAtk(true, 25, 252, 0x426);
getHit(0);
usingSpecial = true;
}
if(playerEquipment[playerWeapon] == 8002 && specialAmount > 24){
specialAtk(true, 25, 252, 2068);
dclaws = 3;
//DCdown = 4;
//DCDamg = true;
getHit(100);
usingSpecial = true;
}
if(playerEquipment[playerWeapon] == 1305 && specialAmount > 24){
specialAtk(false, 25, 248, 1058);
getHit(10);
}
if(playerEquipment[playerWeapon] == 4587 && specialAmount > 74){
specialAtk(false, 75, 347, 1872);
getHit(0);
AttackingOn2.setClientConfig(95, 0);
AttackingOn2.setClientConfig(96, 0);
AttackingOn2.setClientConfig(97, 0);
AttackingOn2.ProtMage = false;
AttackingOn2.ProtRange = false;
AttackingOn2.ProtMelee = false;
AttackingOn2.sM("You have been injured!");
AttackingOn2.checkHead();
}
if((playerEquipment[playerWeapon] == 4151 || playerEquipment[playerWeapon] == 3888 )&& specialAmount > 49){
AttackingOn2.specGFX(341);
specialAmount -= 50;
hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(voidmelee);
lastSpecial = System.currentTimeMillis();
setAnimation(1658);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
specOn = false;
}
if(playerEquipment[playerWeapon] == 667 && specialAmount > 99){
AttackingOn2.playerLevel[1] -= hitDiff;
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[0] + "", 4004);
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[1] + "", 4008);
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[2] + "", 4006);
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[4] + "", 4010);
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[5] + "", 4012);
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[6] + "", 4014);
setAnimation(2927);
specialAmount -= 100;
int gghit = (playerMaxHit+(playerMaxHit/3) + misc.random(StrPrayer));
hitDiff = misc.random(gghit);
lastSpecial = System.currentTimeMillis();
specGFX(654);
getHit(10);
specOn = false;
}
if(playerEquipment[playerWeapon] == 35 && specialAmount > 49){
int gshit = (playerMaxHit+(playerMaxHit/3)+ misc.random(StrPrayer));
setAnimation(2890);
specialAmount -= 50;
getHit(25);
hitDiff = misc.random(gshit);
specOn = false;
lastSpecial = System.currentTimeMillis();
specGFX(655);
}
if(playerEquipment[playerWeapon] == 13643 && specialAmount > 99){
int shhit = (playerMaxHit+(playerMaxHit/3) + misc.random(StrPrayer));
setAnimation(1872);
specialAmount -= 99;
hitDiff = misc.random(shhit);
specOn = false;
lastSpecial = System.currentTimeMillis();
specGFX(480);
}
 if(playerEquipment[playerWeapon] == 13644 && specialAmount > 50){
int vlhit = (playerMaxHit+(playerMaxHit/3) + misc.random(StrPrayer));
 setAnimation(1872);
specialAmount -= 50;
hitDiff = misc.random(vlhit);
specOn = false;
specGFX(480);
lastSpecial = System.currentTimeMillis();
}
if(playerEquipment[playerWeapon] == 2402 && specialAmount > 49){
specialAtk(false, 50, 600, 2967);
specGFX(611);
getHit(0);
currentHealth += hitDiff;
playerLevel[5] += 5 + misc.random(15);
sendQuest("" + playerLevel[5] + "", 4012);
				if (currentHealth > playerLevel[playerHitpoints])
					currentHealth = playerLevel[playerHitpoints];
				sendQuest("" + currentHealth + "", 4016);
				if (playerLevel[5] > getLevelForXP(playerXP[5]))
					playerLevel[5] = getLevelForXP(playerXP[5]);
				sendQuest("" + playerLevel[5] + "", 4012);
}
if(playerEquipment[playerWeapon] == 746 && specialAmount > 74){
stillgfx(369, EnemyY, EnemyX);
stillgfx(644, absY, absX);
specialAtk(false, 75, 600, 2937);
getHit(0);
AttackingOn2.sM("Zamorak powers frozen you!");
AttackingOn2.EntangleDelay = 25;
}
if(playerEquipment[playerWeapon] == 8100 && specialAmount > 99){
specialAtk(true, 100, 600, 811);
AttackingOn2.specGFX(656);
getHit(5);
usingSpecial = true;
hitDiff = misc.random(playerLevel[6]/3);
}
					specAttack();
					actionInterval = getbattleTimer();
					lastAction = System.currentTimeMillis();
}
if(playerEquipment[playerShield] == 2621 && misc.random(15)==1){
specialAtk(true, 0, 600, 2836);
hitDiff = misc.random(25);
AttackingOn2.lowGFX(579,0);
}
if(AttackingOn2.autoRetaliate == 1 && AttackingOn2.AttackingOn == 0){
AttackingOn2.AttackingOn = playerId;
AttackingOn2.IsAttacking = true;
AttackingOn2.followID = playerId;
}
if(hasCrystalShield()){
shieldLeft -= 1;
degradeCrystalShield();
}
if(AttackingOn2.playerEquipment[playerRing] == 2550 && hitDiff > 0){
applyRecoil(); 
}
						if(AttackingOn2.tStage == 0) {
						PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
						PlayerHandler.players[AttackingOn].updateRequired = true;
						PlayerHandler.players[AttackingOn].appearanceUpdateRequired = true;
						}
						if ((AttackingOn2.currentHealth - hitDiff) < 0) {
							hitDiff = AttackingOn2.currentHealth;
						}
						if(AttackingOn2.tStage == 0) {
						PlayerHandler.players[AttackingOn].dealDamage(hitDiff);
						PlayerHandler.players[AttackingOn].hitDiff = hitDiff;
						PlayerHandler.players[AttackingOn].killers[playerId] += hitDiff;
						PlayerHandler.players[AttackingOn].KilledBy[playerId] += hitDiff;
						}
						attackTimer = 7;
						lastAttack = System.currentTimeMillis();
						// sM("You hit " + hitDiff + ", time=" +
						// lastAttack);
					}
					return true;
				} else {
					sM("This player is not in the wilderness!");
					ResetAttack();
				}
		}

				if (inFunPK() && AttackingOn2.inFunPK() || isInPitGame() && !AttackingOn2.isInPitRoom() || isInWilderness(absX, absY, 1) == true && AttackingOn2.isInWilderness(AttackingOn2.absX, AttackingOn2.absY, 1) == true) {
					if (PlayerHandler.players[AttackingOn].deathStage > 0) {
						ResetAttack();

						if ((EnemyHP - hitDiff) <= 0) {
							hitDiff = EnemyHP;
							// animation(437, absY, absX);
							
						}
					} else if (UseBow || UseCrossBow || UseRing) {
if(AttackingOn2.skulledBy != playerName && !isInPitGame() && !inFunPK()) {
lastSkull = System.currentTimeMillis();
isSkulled = true;
skulledBy = AttackingOn2.playerName;
getHead();
}
if(AttackingOn2.hitID != playerId && AttackingOn2.hitID != 0 && !multiCombat()){
sM("Someone else is already fighting your opponent.");
ResetAttack();
faceNPC(32768 + AttackingOn);
return false;
}
if(AttackingOn2.autoRetaliate == 1 && AttackingOn2.AttackingOn == 0){
AttackingOn2.AttackingOn = playerId;
AttackingOn2.IsAttacking = true;
}
if(hasCrystalShield()){
shieldLeft -= 1;
degradeCrystalShield();
}
if(AttackingOn2.playerEquipment[playerRing] == 2550 && hitDiff > 0){
applyRecoil(); 
}
if(AttackingOn2.playerEquipment[playerRing] == 2550 && misc.random(15)==1){
AttackingOn2.sM("Your ring of recoil shatters.");
AttackingOn2.playerEquipment[AttackingOn2.playerRing] = -1;
AttackingOn2.playerEquipmentN[AttackingOn2.playerRing] = 0;
AttackingOn2.setEquipment(-1, 0, AttackingOn2.playerRing);
}
						AttackingOn2.KillerId = playerId;
						setAnimation(GetWepAnim(playerEquipment[playerWeapon]));
						lastArrow = System.currentTimeMillis();
						arrow = true;
						AttackingOn2.offTimer = System.currentTimeMillis();
        	double TotalExp = 0;
          if (UseBow || UseCrossBow) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), 4);
          } else if (FightType != 3) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), SkillID);
          } else {
            TotalExp = (double)(400*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), playerAttack);
            addSkillXP((int)(TotalExp), playerDefence);
            addSkillXP((int)(TotalExp), playerStrength);
          }
          TotalExp = (double)(500*hitDiff);
          TotalExp = (double)(TotalExp*CombatExpRate);
          addSkillXP((int)(TotalExp), playerHitpoints);
						attackTimer = 7;
						lastAttack = System.currentTimeMillis();
                           client player = (client) server.playerHandler.players[playerId];
                           if (AttackingOn2.vengon && hitDiff != 0 ) {
                                player.hitDiff = (int)(hitDiff / 1.2);
				player.currentHealth -= (int)(hitDiff / 1.2);
                                player.hitUpdateRequired = true; // So the hit will append to you.
                                player.updateRequired = true; // So the hit will append to you.
                                player.appearanceUpdateRequired = true; // So the hit will append to you.
                                AttackingOn2.vengon = false;
                                AttackingOn2.plrText = "Taste vengeance!"; // This says it in itself.
                                AttackingOn2.plrTextUpdateRequired = true; // Make sure the txt4 will update.
                            }
if(Smite == true && AttackingOn2.playerLevel[5] > 0 && GoodDistance(EnemyX, EnemyY, absX, absY, 1))
					{
AttackingOn2.playerLevel[5] -= hitDiff/ 4;
AttackingOn2.sendQuest("" + AttackingOn2.playerLevel[5] + "", 4012);
AttackingOn2.sendFrame126("Prayer: "+AttackingOn2.playerLevel[5]+"/"+AttackingOn2.getLevelForXP(playerXP[5])+"", 687);
}
if(playerEquipment[playerShield] == 2621 && misc.random(15)==1){
specialAtk(true, 0, 600, 2836);
getHitDouble(25);
AttackingOn2.lowGFX(579,0);
}
					}
					return true;
				} else {
					sM("This player is not in the wilderness!");
					ResetAttack();
				}
		return false;
	}

	private boolean AttackNPC() {
if(hasKnife()){
sM("Knives are disabled for now!");
ResetAttackNPC();
return false;
}
		int EnemyX = server.npcHandler.npcs[attacknpc].absX;
		int EnemyY = server.npcHandler.npcs[attacknpc].absY;
		int EnemyHP = server.npcHandler.npcs[attacknpc].HP;
		int hitDiff = 0;
		if (EnemyHP < 1) {
			sM("You can't attack that monster!");
			return false;
		}
		int type = server.npcHandler.npcs[attacknpc].npcType;
		int[] staffs = {1381, 1383, 1385, 1387, 4675, 13647};
		int[] arrowIds = { 882, 884, 886, 888, 890, 892, 78 };
		int[] arrowGfx = { 10, 9, 11, 12, 13, 15, 16 };
if(!healers && IsInFightCave() && type == 2745 && server.npcHandler.npcs[attacknpc].HP <= 125){
server.npcHandler.spawnANPC(2746, 2390, 5100, heightLevel);
server.npcHandler.spawnANPC(2746, 2404, 5100, heightLevel);
server.npcHandler.spawnANPC(2746, 2390, 5067, heightLevel);
server.npcHandler.spawnANPC(2746, 2404, 5067, heightLevel);
healers = true;
}
		if (type == 1616) {
			if (playerLevel[18] < 30) {
				sM("You must be level 30 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 1637) {
			if (playerLevel[18] < 40) {
				sM("You must be level 40 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 1626) {
			if (playerLevel[18] < 52) {
				sM("You must be level 52 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 1624) {
			if (playerLevel[18] < 65) {
				sM("You must be level 65 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 1613) {
			if (playerLevel[18] < 80) {
				sM("You must be level 80 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 1615) {
			if (playerLevel[18] < 85) {
				sM("You must be level 85 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if (type == 2783) {
			if (playerLevel[18] < 90) {
				sM("You must be level 90 slayer or higher to attack this monster.");
				ResetAttackNPC();
				return false;
			}
		}
		if ((type == 110) || (type == 936)) {
			if (!playerHasItem(1543)) {
				resetPos();
				ResetAttackNPC();
				return false;
			}
		}
		if ((type == 221) || (type == 1961)) {
			if (!playerHasItem(1544)) {
				resetPos();
				ResetAttackNPC();
				return false;
			}
		}
		for (int element : staffs) {
			if ((playerEquipment[playerWeapon] == element)
					&& autocasting && autocastID > 0) {
				int npcTargetX = server.npcHandler.npcs[attacknpc].absX;
				int npcTargetY = server.npcHandler.npcs[attacknpc].absY;
				int npcTargetHealth = server.npcHandler.npcs[attacknpc].HP;
				if (System.currentTimeMillis() - lastAttack < 4000) {
					//sM("You must wait 4 seconds before casting this kind of spell again");
					return false;
				}
				if (!playerMage2(attacknpc)) {
					return false;
				}
				inCombat = true;
				lastCombat = System.currentTimeMillis();
				lastAttack = lastCombat;

				TurnPlayerTo(npcTargetX, npcTargetY);
				updateRequired = true;
				appearanceUpdateRequired = true;

				toX = absX;
				toY = absY;
	                	newWalkCmdSteps = 0;
                		newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
                		getNextPlayerMovement();
				MagicHandler.npcX = npcTargetX;
				MagicHandler.npcY = npcTargetY;
				MagicHandler.npcHP = npcTargetHealth;
				server.npcHandler.npcs[attacknpc].hitIDNPC = playerId;
				server.npcHandler.npcs[attacknpc].offTimerNPC = 12;
				spellNpcIndex = MagicHandler.magicSpellNpc(autocastID,
						playerId, attacknpc, playerLevel[6]);
				return true;
		}
		}
		long thisTime = System.currentTimeMillis();
		int voidmelee = 0;
		if(FullVMelee()){
		voidmelee += 10;
		}
		if (npcHit()) {
			hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(voidmelee);
		} else {
			hitDiff = 0;
		}
		boolean UseBow = false;
		boolean UseCrossBow = false;
		boolean UseRing = false;

		for (int i = 0; i < shortbow.length; i++) {
			if ((playerEquipment[playerWeapon] == shortbow[i])
					|| (playerEquipment[playerWeapon] == longbow[i])) {
				UseBow = true;
				break;
			}
		}
		if (playerEquipment[playerWeapon] == 7096) {
				UseBow = true;
		}
		if (playerEquipment[playerWeapon] == 837) {
				UseCrossBow = true;
		}
		if (playerEquipment[playerWeapon] == 6522) {
				UseRing = true;
		}
		if (UseBow) {
				HasArrows = false;
				CheckArrows();
				//CalculateRange();
				hitDiff = npcRangeDamage();
				//drawback();

		}
		if (UseCrossBow) {
				HasBolts = false;
				CheckBolts();
				//CalculateRange();
				hitDiff = npcRangeDamage();
		}
		if (UseRing) {
				HasRings = false;
				CheckRings();
				//CalculateRange();
				hitDiff = npcRangeDamage();
		}
		if(UseBow || UseCrossBow || UseRing){
			if(GoodDistance(EnemyX, EnemyY, absX, absY, 8) == false){
				sM("You are too far to range your enemy!");
				ResetAttackNPC();
				return false;
			}
		}
		/*if(type == 3200 && !UseBow && !UseCrossBow && !UseRing){
			sM("You can only use magic and range on the Chaos Elemental!");
			ResetAttackNPC();
		return false;
		}*/
		int arrowgfx = 10;
		for (int i1 = 0; i1 < arrowIds.length; i1++) {
			if (playerEquipment[playerArrows] == arrowIds[i1]) {
				arrowgfx = arrowGfx[i1];
			}
		}
		if(hasCrystalBow()){
			arrowgfx = 249;
		}
		if (UseBow && playerEquipment[playerWeapon] == 4734 && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			hitDiff = npcRangeDamage();
			if (DeleteArrow()  && playerEquipment[playerArrows] == 4740) {
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				sM("You're out of bolts!");
				return false;
			}
		}
		if (hasCrystalBow() && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			drawback();
			hitDiff = npcRangeDamage();
			degradeCrystalBow();
			if (DeleteArrow()) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				arrowsLeft -= 1;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				sM("You're out of bolts!");
				return false;
			}
		}
		if (UseBow && playerEquipment[playerWeapon] != 4734 && !hasCrystalBow() && playerEquipment[playerWeapon] != 4827 && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			drawback();
			hitDiff = npcRangeDamage();
			if (DeleteArrow() && HasArrows) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseBow && playerEquipment[playerWeapon] == 4827 && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			drawback();
			hitDiff = npcRangeDamage();
			if (DeleteArrow() && HasArrows) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}

		if (UseCrossBow && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			hitDiff = npcRangeDamage();
			if (DeleteArrow() && HasBolts) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				sM("There is no ammo left in your quiver.");
				return false;
			}
		}
		if (UseRing && System.currentTimeMillis() - lastAction > actionInterval) {
			//CalculateRange();
			hitDiff = npcRangeDamage();
			if (DeleteRing() && HasRings) {
				lastArrow = System.currentTimeMillis();
				arrow = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
			} else {
				ResetAttackNPC();
				return false;
			}
		}
		actionInterval = getbattleTimer();
		lastAction = System.currentTimeMillis();
		inCombat = true;
		lastCombat = System.currentTimeMillis();
		if (UseCrossBow || UseBow || UseRing || GoodDistance(EnemyX, EnemyY, absX, absY, 1) == true) {
			if (server.npcHandler.npcs[attacknpc].IsDead == true) {
				ResetAttackNPC();
			} else {
if(server.npcHandler.npcs[attacknpc].hitIDNPC != 0 && server.npcHandler.npcs[attacknpc].hitIDNPC != playerId && !multiCombat()){
sM("Someone else is already fighting your opponent.");
faceNPC(attacknpc);
ResetAttackNPC();
return false;
}
if(hitID != attacknpc && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
faceNPC(attacknpc);
ResetAttackNPC();
return false;
}
if(type == 2630 && !UseBow && !UseCrossBow && !UseRing && hitDiff > 0){
applyRecoil();
}
if(hasCrystalShield()){
shieldLeft -= 1;
degradeCrystalShield();
}
if(playerEquipment[playerWeapon] == 6528 && playerEquipment[playerAmulet] == 6577 && misc.random(3)==1){
hitDiff = misc.random(8) + misc.random(playerMaxHit) + misc.random(StrPrayer) + misc.random(voidmelee);
}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 80 && currentHealth < 100){
hitDiff = misc.random(8) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 60 && currentHealth < 79){
hitDiff = misc.random(18) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 40 && currentHealth < 59){
hitDiff = misc.random(28) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 20 && currentHealth < 39){
hitDiff = misc.random(38) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullDharokEquipped() && misc.random(2)==1 && currentHealth > 0 && currentHealth < 18){
hitDiff = misc.random(58) + misc.random(playerMaxHit) + misc.random(StrPrayer);

}
if(FullGuthanEquipped()) {
if(misc.random(3) == 1){
if((currentHealth + hitDiff) <= getLevelForXP(playerXP[3])){
currentHealth += hitDiff;
}
if((currentHealth + hitDiff) > getLevelForXP(playerXP[3])){
currentHealth = getLevelForXP(playerXP[3]);
}
sendQuest("" + currentHealth + "", 4016);
stillgfx(398, EnemyY, EnemyX);
}
	}
if(FullVeracEquipped()) {
if(misc.random(2) == 1){
hitDiff = misc.random(playerMaxHit) + misc.random(StrPrayer);
}
	}
setAnimation(GetWepAnim(playerEquipment[playerWeapon]));
if(UseCrossBow && misc.random(5)==1 && playerEquipment[playerArrows] == 881){
hitDiff = misc.random(maxRangeHit2()) + misc.random(55);
stillgfx(197, EnemyY, EnemyX);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
}
if(playerEquipment[playerShield] == 2621 && misc.random(15)==1){
specialAtkNPC(true, 0, 600, 2836);
hitDiff = misc.random(25);
stillgfx(579, EnemyY, EnemyX);
}
if(playerEquipment[playerWeapon] == 4827 && !specOn){
DDS2Damg = true;
ddsInterval = 2000;
lastDds = System.currentTimeMillis();
setAnimation(426);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
}
if(specOn){
if(playerEquipment[playerWeapon] == 4827 && specialAmount > 74){
specialAtkNPC(true, 75, 250, 1074);
hitDiff = misc.random(maxRangeHit2());
rangeGFXNPC(85, 643);
rangeGFXNPC(65, 643);
}
if((playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 )&& specialAmount > 74){
specialAtkNPC(true, 75, 256, 1074);
hitDiff = misc.random(maxRangeHit2());
rangeGFXNPC(75, 249);
rangeGFXNPC(95, 249);
}
					specAttack();
					actionInterval = getbattleTimer();
					lastAction = System.currentTimeMillis();
}
if(specOn == true){//npcs
if(playerEquipment[playerWeapon] == 3204 && specialAmount > 74){
specialAtkNPC(true, 75, 282, 1203);
npcDamage(5);
}
if(playerEquipment[playerWeapon] == 859 && specialAmount > 99){
specialAtkNPC(false, 100, 250, 426);
hitDiff = misc.random(maxRangeHit2()) + misc.random(5);
rangeGFXNPC(75, 249);
}
if(playerEquipment[playerWeapon] == 5698 && specialAmount > 24){
specialAtkNPC(true, 25, 252, 0x426);
npcDamage(8);
}
if(playerEquipment[playerWeapon] == 8002 && specialAmount > 24){

specialAtkNPC(true, 25, 252, 2068);
//DCdown = 4;
//DCDamg = true;
dclaws = 3;
npcDamage(8);
}
if(playerEquipment[playerWeapon] == 1305 && specialAmount > 24){
specialAtkNPC(false, 25, 248, 1058);
npcDamage(8);
}
if(playerEquipment[playerWeapon] == 4578 && specialAmount > 74){
specialAtkNPC(false, 75, 347, 1872);
npcDamage(0);
}
if((playerEquipment[playerWeapon] == 4151 || playerEquipment[playerWeapon] == 3888 ) && specialAmount > 49){
specialAtkNPC(false, 50, 600, 1658);
stillgfx(341, EnemyY, EnemyX);
}
if(playerEquipment[playerWeapon] == 667 && specialAmount > 99){
specialAtkNPC(false, 100, 600, 2927);
specGFX(654);
}
if(playerEquipment[playerWeapon] == 35 && specialAmount > 49){
specialAtkNPC(false, 50, 600, 2890);//3547
npcDamage(60);
specGFX(655);
}
if(playerEquipment[playerWeapon] == 13644 && specialAmount > 49){
specialAtkNPC(false, 50, 600, 451);
npcDamage(50);
specGFX(480);
}
if(playerEquipment[playerWeapon] == 13643 && specialAmount > 49){
specialAtkNPC(false, 50, 600, 451);
npcDamage(50);
specGFX(480);
}
if(playerEquipment[playerWeapon] == 2402 && specialAmount > 49){
specialAtkNPC(false, 50, 600, 2967);
specGFX(611);
currentHealth += hitDiff;
playerLevel[5] += 5 + misc.random(10);
				if (currentHealth > playerLevel[playerHitpoints])
					currentHealth = playerLevel[playerHitpoints];
				sendQuest("" + currentHealth + "", 4016);
				if (playerLevel[5] > getLevelForXP(playerXP[5]))
					playerLevel[5] = getLevelForXP(playerXP[5]);
				sendQuest("" + playerLevel[5] + "", 4012);
}
if(playerEquipment[playerWeapon] == 746 && specialAmount > 74){
specialAtkNPC(false, 75, 600, 2937);
stillgfx(369, EnemyY, EnemyX);
stillgfx(644, absY, absX);
}
if(playerEquipment[playerWeapon] == 8100 && specialAmount > 99){
specialAtkNPC(true, 100, 600, 811);
hitDiff = misc.random(playerMaxHit) + misc.random(5) + misc.random(StrPrayer) + misc.random(voidmelee);
stillgfx(656, EnemyY, EnemyX);
}
					specAttack();
					actionInterval = getbattleTimer();
					lastAction = System.currentTimeMillis();
}
				server.npcHandler.npcs[attacknpc].hitIDNPC = playerId;
				server.npcHandler.npcs[attacknpc].offTimerNPC = 12;
				server.npcHandler.npcs[attacknpc].StartKilling = playerId;
				server.npcHandler.npcs[attacknpc].RandomWalk = false;
				server.npcHandler.npcs[attacknpc].IsUnderAttack = true;
				actionInterval = getbattleTimer();
				lastAction = System.currentTimeMillis();
				faceNPC(attacknpc);
				updateRequired = true;
				appearanceUpdateRequired = true;
				if (!UseBow && !UseCrossBow && !UseRing){
				if ((EnemyHP - hitDiff) < 0) {
					hitDiff = EnemyHP;
				}
				server.npcHandler.npcs[attacknpc].hitDiff = hitDiff;
				server.npcHandler.npcs[attacknpc].updateRequired = true;
				server.npcHandler.npcs[attacknpc].hitUpdateRequired = true;
				server.npcHandler.npcs[attacknpc].hit = true;
				}
				server.npcHandler.npcs[attacknpc].Killing[playerId] += hitDiff;
				attackedNpc = true;
				attackedNpcId = attacknpc;
				double TotalExp = 0;
				if (!UseBow)
					animationReset = System.currentTimeMillis() + 1200;
				if (server.npcHandler.npcs[attacknpc].npcType != 0) {
          if (UseBow || UseCrossBow || UseRing) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), 4);
          } else if (FightType != 3) {
            TotalExp = (double)(700*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), SkillID);
          } else {
            TotalExp = (double)(400*hitDiff);
            TotalExp = (double)(TotalExp*CombatExpRate);
            addSkillXP((int)(TotalExp), playerAttack);
            addSkillXP((int)(TotalExp), playerDefence);
            addSkillXP((int)(TotalExp), playerStrength);
          }
          TotalExp = (double)(500*hitDiff);
          TotalExp = (double)(TotalExp*CombatExpRate);
          addSkillXP((int)(TotalExp), playerHitpoints);
          attackTimer = 7;
	  specOn = false;
          specAttack();

					if (debug)
						sM("hitDiff=" + hitDiff + ", elapsed="
								+ (thisTime - lastAttack));
					lastAttack = System.currentTimeMillis();
				}
				return true;

			}
		}
		return false;
	}

	public void attackPlayersWithin(int gfx, int maxDamage, int range) {
		// for (Player p : server.playerHandler.players) {
		// Linux (java 1.4.2-compatible) change - Devolution
		for (Player p : server.playerHandler.players) {
			if (p != null) {
				client person = (client) p;

				if (person.playerName != null) {
					if ((person.distanceToPoint(absX, absY) <= range)
							&& (person.playerId != playerId)) {
						int damage = misc.random(maxDamage);

						person.specGFX(gfx);
						if (person.playerLevel[3] - damage < 0) {
							damage = person.playerLevel[3];
						}
						person.hitDiff = damage;
						person.KillerId = playerId;
						person.updateRequired = true;
						person.hitUpdateRequired = true;
						//person.currentHealth -= misc.random(30);
						//person.ifFreeze(25);
					}
				}
			}
		}
	}
	public void attackPlayersWithin2(int gfx, int maxDamage, int range) {
		// for (Player p : server.playerHandler.players) {
		// Linux (java 1.4.2-compatible) change - Devolution
		for (Player p : server.playerHandler.players) {
			if (p != null) {
				client person = (client) p;

				if (person.playerName != null) {
					if ((person.distanceToPoint(absX, absY) <= range)
							&& (person.playerId != playerId)) {
						int damage = misc.random(maxDamage);

						person.specGFX(gfx);
						if (person.playerLevel[3] - damage < 0) {
							damage = person.playerLevel[3];
						}
if(person.ProtMage == false){
						person.hitDiff = damage;
						person.KillerId = playerId;
						person.updateRequired = true;
						person.hitUpdateRequired = true;
						person.currentHealth -= misc.random(30);
}
if(person.ProtMage == true){
						person.hitDiff = 0;
						person.KillerId = playerId;
						person.updateRequired = true;
						person.hitUpdateRequired = true;
}
					}
				}
			}
		}
	}
	public boolean bankItem(int itemID, int fromSlot, int amount) {
		if (!IsBanking)
			return false;
		if (playerItemsN[fromSlot] <= 0) {
			return false;
		}
		if (!Item.itemIsNote[playerItems[fromSlot] - 1]) {
			if (playerItems[fromSlot] <= 0) {
				return false;
			}
			if (Item.itemStackable[playerItems[fromSlot] - 1]
					|| (playerItemsN[fromSlot] > 1)) {
				int toBankSlot = 0;
				boolean alreadyInBank = false;

				for (int i = 0; i < playerBankSize; i++) {
					if (bankItems[i] == playerItems[fromSlot]) {
						if (playerItemsN[fromSlot] < amount) {
							amount = playerItemsN[fromSlot];
						}
						alreadyInBank = true;
						toBankSlot = i;
						i = playerBankSize + 1;
					}
				}

				if (!alreadyInBank && (freeBankSlots() > 0)) {
					for (int i = 0; i < playerBankSize; i++) {
						if (bankItems[i] <= 0) {
							toBankSlot = i;
							i = playerBankSize + 1;
						}
					}
					bankItems[toBankSlot] = playerItems[fromSlot];
					if (playerItemsN[fromSlot] < amount) {
						amount = playerItemsN[fromSlot];
					}
					if (((bankItemsN[toBankSlot] + amount) <= maxItemAmount)
							&& ((bankItemsN[toBankSlot] + amount) > -1)) {
						bankItemsN[toBankSlot] += amount;
					} else {
						sM("Bank full!");
						return false;
					}
					deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
					resetItems(5064);
					resetBank();
					return true;
				} else if (alreadyInBank) {
					if (((bankItemsN[toBankSlot] + amount) <= maxItemAmount)
							&& ((bankItemsN[toBankSlot] + amount) > -1)) {
						bankItemsN[toBankSlot] += amount;
					} else {
						sM("Bank full!");
						return false;
					}
					deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
					resetItems(5064);
					resetBank();
					return true;
				} else {
					sM("Bank full!");
					return false;
				}
			} else {
				itemID = playerItems[fromSlot];
				int toBankSlot = 0;
				boolean alreadyInBank = false;

				for (int i = 0; i < playerBankSize; i++) {
					if (bankItems[i] == playerItems[fromSlot]) {
						alreadyInBank = true;
						toBankSlot = i;
						i = playerBankSize + 1;
					}
				}
				if (!alreadyInBank && (freeBankSlots() > 0)) {
					for (int i = 0; i < playerBankSize; i++) {
						if (bankItems[i] <= 0) {
							toBankSlot = i;
							i = playerBankSize + 1;
						}
					}
					int firstPossibleSlot = 0;
					boolean itemExists = false;

					while (amount > 0) {
						itemExists = false;
						for (int i = firstPossibleSlot; i < playerItems.length; i++) {
							if ((playerItems[i]) == itemID) {
								firstPossibleSlot = i;
								itemExists = true;
								i = 30;
							}
						}
						if (itemExists) {
							bankItems[toBankSlot] = playerItems[firstPossibleSlot];
							bankItemsN[toBankSlot] += 1;
							deleteItem((playerItems[firstPossibleSlot] - 1),
									firstPossibleSlot, 1);
							amount--;
						} else {
							amount = 0;
						}
					}
					resetItems(5064);
					resetBank();
					return true;
				} else if (alreadyInBank) {
					int firstPossibleSlot = 0;
					boolean itemExists = false;

					while (amount > 0) {
						itemExists = false;
						for (int i = firstPossibleSlot; i < playerItems.length; i++) {
							if ((playerItems[i]) == itemID) {
								firstPossibleSlot = i;
								itemExists = true;
								i = 30;
							}
						}
						if (itemExists) {
							bankItemsN[toBankSlot] += 1;
							deleteItem((playerItems[firstPossibleSlot] - 1),
									firstPossibleSlot, 1);
							amount--;
						} else {
							amount = 0;
						}
					}
					resetItems(5064);
					resetBank();
					return true;
				} else {
					sM("Bank full!");
					return false;
				}
			}
		} else if (Item.itemIsNote[playerItems[fromSlot] - 1]
				&& !Item.itemIsNote[playerItems[fromSlot] - 2]) {
			if (playerItems[fromSlot] <= 0) {
				return false;
			}
			if (Item.itemStackable[playerItems[fromSlot] - 1]
					|| (playerItemsN[fromSlot] > 1)) {
				int toBankSlot = 0;
				boolean alreadyInBank = false;

				for (int i = 0; i < playerBankSize; i++) {
					if (bankItems[i] == (playerItems[fromSlot] - 1)) {
						if (playerItemsN[fromSlot] < amount) {
							amount = playerItemsN[fromSlot];
						}
						alreadyInBank = true;
						toBankSlot = i;
						i = playerBankSize + 1;
					}
				}

				if (!alreadyInBank && (freeBankSlots() > 0)) {
					for (int i = 0; i < playerBankSize; i++) {
						if (bankItems[i] <= 0) {
							toBankSlot = i;
							i = playerBankSize + 1;
						}
					}
					bankItems[toBankSlot] = (playerItems[fromSlot] - 1);
					if (playerItemsN[fromSlot] < amount) {
						amount = playerItemsN[fromSlot];
					}
					if (((bankItemsN[toBankSlot] + amount) <= maxItemAmount)
							&& ((bankItemsN[toBankSlot] + amount) > -1)) {
						bankItemsN[toBankSlot] += amount;
					} else {
						return false;
					}
					deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
					resetItems(5064);
					resetBank();
					return true;
				} else if (alreadyInBank) {
					if (((bankItemsN[toBankSlot] + amount) <= maxItemAmount)
							&& ((bankItemsN[toBankSlot] + amount) > -1)) {
						bankItemsN[toBankSlot] += amount;
					} else {
						return false;
					}
					deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
					resetItems(5064);
					resetBank();
					return true;
				} else {
					sM("Bank full!");
					return false;
				}
			} else {
				itemID = playerItems[fromSlot];
				int toBankSlot = 0;
				boolean alreadyInBank = false;

				for (int i = 0; i < playerBankSize; i++) {
					if (bankItems[i] == (playerItems[fromSlot] - 1)) {
						alreadyInBank = true;
						toBankSlot = i;
						i = playerBankSize + 1;
					}
				}
				if (!alreadyInBank && (freeBankSlots() > 0)) {
					for (int i = 0; i < playerBankSize; i++) {
						if (bankItems[i] <= 0) {
							toBankSlot = i;
							i = playerBankSize + 1;
						}
					}
					int firstPossibleSlot = 0;
					boolean itemExists = false;

					while (amount > 0) {
						itemExists = false;
						for (int i = firstPossibleSlot; i < playerItems.length; i++) {
							if ((playerItems[i]) == itemID) {
								firstPossibleSlot = i;
								itemExists = true;
								i = 30;
							}
						}
						if (itemExists) {
							bankItems[toBankSlot] = (playerItems[firstPossibleSlot] - 1);
							bankItemsN[toBankSlot] += 1;
							deleteItem((playerItems[firstPossibleSlot] - 1),
									firstPossibleSlot, 1);
							amount--;
						} else {
							amount = 0;
						}
					}
					resetItems(5064);
					resetBank();
					return true;
				} else if (alreadyInBank) {
					int firstPossibleSlot = 0;
					boolean itemExists = false;

					while (amount > 0) {
						itemExists = false;
						for (int i = firstPossibleSlot; i < playerItems.length; i++) {
							if ((playerItems[i]) == itemID) {
								firstPossibleSlot = i;
								itemExists = true;
								i = 30;
							}
						}
						if (itemExists) {
							bankItemsN[toBankSlot] += 1;
							deleteItem((playerItems[firstPossibleSlot] - 1),
									firstPossibleSlot, 1);
							amount--;
						} else {
							amount = 0;
						}
					}
					resetItems(5064);
					resetBank();
					return true;
				} else {
					sM("Bank full!");
					return false;
				}
			}
		} else {
			sM("Item not supported " + (playerItems[fromSlot] - 1));
			return false;
		}
	}


    public boolean buyItem(int itemID, int fromSlot, int amount) {
        if (amount > 0
                && itemID
                        == (server.shopHandler.ShopItems[MyShopID][fromSlot] - 1)) {
            if (amount > server.shopHandler.ShopItemsN[MyShopID][fromSlot]) {
                amount = server.shopHandler.ShopItemsN[MyShopID][fromSlot];
            }

            double ShopValue;
            double TotPrice;
            int TotPrice2;
            int Overstock;
            int Slot = 0;
            int Slot2 = 0;
	    int Slot3 = 0;

            for (int i = amount; i > 0; i--) {
                TotPrice2 = (int) Math.floor(
                        GetItemShopValue(itemID, 0, fromSlot));
                Slot = GetItemSlot(995);
                Slot2 = GetItemSlot(6529);
                if (Slot == -1 && MyShopID != 8 && MyShopID != 19) {
                    sM("You don't have enough coins.");
                    break;
                }
  if (amount > 100) {
				TotPrice2 = (int)Math.floor(GetItemShopValue(itemID, 0, fromSlot))*amount;
				Slot = GetItemSlot(995);
				if (Slot == -1 && TotPrice2 != 0) {
					sM("You don't have enough coins.");
				}
				if(TotPrice2 <= 1) {
					TotPrice2 = (int)Math.floor(GetItemShopValue(itemID, 0, fromSlot));
				}
				if (TotPrice2 <= 0) {
					if (freeSlots() > 0) {
						addItem(itemID, amount);
						server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= 1;
						server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
						if ((fromSlot + 1) > server.shopHandler.ShopItemsStandard[MyShopID]) {
							server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
						}
					} else {
						sM("Not enough space in your inventory.");
					}
				} else if (playerItemsN[Slot] >= TotPrice2) {
					if (freeSlots() > 0) {
						deleteItem(995, GetItemSlot(995), TotPrice2);
						addItem(itemID, amount);
						server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= amount;
						server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
						if ((fromSlot + 1) > server.shopHandler.ShopItemsStandard[MyShopID]) {
							server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
						}
					} else {
						sM("Not enough space in your inventory.");
					}
				} else {
					sM("You don't have enough coins.");
				}
            }else{
}
                if (Slot2 == -1 && MyShopID == 30) {
                    sM("You don't have enough tokkul.");
                    break;
                }
                if (Slot3 == -1 && MyShopID == 7) {
                    sM("You don't have enough points.");
                    break;
                }
     if(freeSlots() >= 2) {
     if(itemID == 4319 && HasItemAmount(995, 99000) || itemID == 2677 && HasItemAmount(995, 99000)){
          addItem(2679, 1);
     }
     if(itemID == 4359 && HasItemAmount(995, 99000) || itemID == 2680 && HasItemAmount(995, 99000)){
          addItem(2682, 1);
     }
     if(itemID == 4329 && HasItemAmount(995, 99000) || itemID == 2683 && HasItemAmount(995, 99000)){
          addItem(2685, 1);
     }
     if(itemID == 4351 && HasItemAmount(995, 99000) || itemID == 2686 && HasItemAmount(995, 99000)){
          addItem(2688, 1);
     }
     if(itemID == 4347 && HasItemAmount(995, 99000) || itemID == 2689 && HasItemAmount(995, 99000)){
          addItem(2691, 1);
     }
     if(itemID == 4343 && HasItemAmount(995, 99000) || itemID == 2692 && HasItemAmount(995, 99000)){
          addItem(2694, 1);
     }
     if(itemID == 4321 && HasItemAmount(995, 99000) || itemID == 2695 && HasItemAmount(995, 99000)){
          addItem(2697, 1);
     }
     if(itemID == 4333 && HasItemAmount(995, 99000) || itemID == 2698 && HasItemAmount(995, 99000)){
          addItem(2700, 1);
     }
     if(itemID == 4341 && HasItemAmount(995, 99000) || itemID == 2701 && HasItemAmount(995, 99000)){
          addItem(2703, 1);
     }
     if(itemID == 4317 && HasItemAmount(995, 99000) || itemID == 2704 && HasItemAmount(995, 99000)){
          addItem(2706, 1);
     }
     if(itemID == 4339 && HasItemAmount(995, 99000) || itemID == 2707 && HasItemAmount(995, 99000)){
          addItem(2709, 1);
     }
     if(itemID == 4361 && HasItemAmount(995, 99000) || itemID == 2710 && HasItemAmount(995, 99000)){
          addItem(2712, 1);
     }
     if(itemID == 4327 && HasItemAmount(995, 99000) || itemID == 2713 && HasItemAmount(995, 99000)){
          addItem(2715, 1);
     }
     if(itemID == 4337 && HasItemAmount(995, 99000) || itemID == 2716 && HasItemAmount(995, 99000)){
          addItem(2718, 1);
     }
     if(itemID == 4355 && HasItemAmount(995, 99000) || itemID == 2719 && HasItemAmount(995, 99000)){
          addItem(2721, 1);
     }
     if(itemID == 4345 && HasItemAmount(995, 99000) || itemID == 2722 && HasItemAmount(995, 99000)){
          addItem(2724, 1);
     }
     if(itemID == 4357 && HasItemAmount(995, 99000) || itemID == 2725 && HasItemAmount(995, 99000)){
          addItem(2727, 1);
     }
     if(itemID == 4335 && HasItemAmount(995, 99000) || itemID == 2728 && HasItemAmount(995, 99000)){
          addItem(2730, 1);
     }
     if(itemID == 4325 && HasItemAmount(995, 99000) || itemID == 2731 && HasItemAmount(995, 99000)){
          addItem(2733, 1);
     }
     if(itemID == 4353 && HasItemAmount(995, 99000) || itemID == 2734 && HasItemAmount(995, 99000)){
          addItem(2736, 1);
     }
     if(itemID == 4331 && HasItemAmount(995, 99000) || itemID == 2737 && HasItemAmount(995, 99000)){
          addItem(2739, 1);
     } else
dog = 0;
     }

                if (MyShopID != 30 && MyShopID != 7) {
                    if (playerItemsN[Slot] >= TotPrice2) {
                        if (freeSlots() > 0) {
						
                            deleteItem(995, GetItemSlot(995), TotPrice2);
                            addItem(itemID, 1);
                            server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= 1;
                            server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
                            if ((fromSlot + 1)
                                    > server.shopHandler.ShopItemsStandard[MyShopID]) {
                                server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
                            }
                        } else {
                            sM("Not enough space in your inventory.");
                            break;
                        }
                    } else {
                        sM("Not enough coins for this item.");
                    }
                }
                if (MyShopID == 30) {
                    if (playerItemsN[Slot2] >= TotPrice2) {
                        if (freeSlots() > 0) {
                            deleteItem(6529, GetItemSlot(6529), TotPrice2);
                            addItem(itemID, 1);
                            server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= 1;
                            server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
                            if ((fromSlot + 1)
                                    > server.shopHandler.ShopItemsStandard[MyShopID]) {
                                server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
                            }
                        } else {
                            sM("Not enough space in your inventory.");
                            break;
                        }
                    } else {
                        sM("Not enough tokkul for this item.");
                    }
                }
                if (MyShopID == 7) {
                    if (assaultKills >= TotPrice2) {
                        if (freeSlots() > 0) {
                            assaultKills -= TotPrice2;
                            addItem(itemID, 1);
                            server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= 1;
                            server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
                            if ((fromSlot + 1)
                                    > server.shopHandler.ShopItemsStandard[MyShopID]) {
                                server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
                            }
                        } else {
                            sM("Not enough space in your inventory.");
                            break;
                        }
                    } else {
                        sM("Not enough points for this item.");
                    }
                }				
            }
            resetItems(3823);
            resetShop(MyShopID);
            UpdatePlayerShop();
            return true;
        }
        return false;
    }

	public void CalculateMaxHit() {
		double MaxHit = 0;
		int StrBonus = playerBonus[10]; // Strength Bonus
		int Strength = playerLevel[playerStrength]; // Strength
		int RngBonus = playerBonus[4]; // Ranged Bonus
		int Range = playerLevel[playerRanged]; // Ranged

		if ((FightType == 1) || (FightType == 4)) {
			// Accurate & Defensive
			MaxHit += (double) (1.05 + (double) ((double) (StrBonus * Strength) * 0.00175));
		} else if (FightType == 2) {
			// Aggresive
			MaxHit += (double) (1.05 + (double) ((double) (StrBonus * Strength) * 0.00175));
		} else if (FightType == 3) {
			// Controlled
			MaxHit += (double) (1.05 + (double) ((double) (StrBonus * Strength) * 0.00175));
		}
		MaxHit += (double) (Strength * 0.1);
		/*
		 * if (StrPotion == 1) { // Strength Potion MaxHit += (double) (Strength *
		 * 0.0014); } else if (StrPotion == 2) { // Super Strength Potion MaxHit +=
		 * (double) (Strength * 0.0205); }
		 */
		if (StrPrayer == 1) {
			// Burst Of Strength
			MaxHit += 1;
		} else if (StrPrayer == 2) {
			// Super Human Strength
			MaxHit += 2;
		} else if (StrPrayer == 3) {
			// Ultimate Strength
			MaxHit += 3;
		}
		if ((FightType == 5) || (FightType == 6)) {
			// Accurate and Longranged
			MaxHit += (double) (1.05 + (double) ((double) (RngBonus * Range) * 0.00075));
		} else if (FightType == 7) {
			// Rapid
			MaxHit += (double) (1.35 + (double) ((double) (RngBonus) * 0.00025));
		}
		// MaxHit += (double) (Range * 0.03);
		playerMaxHit = (int) Math.floor(MaxHit);
	}




	public void CheckArrows() {
if(playerEquipment[playerArrows] == 78 ||playerEquipment[playerArrows] == 882 || playerEquipment[playerArrows] == 884 || playerEquipment[playerArrows] == 886 || playerEquipment[playerArrows] == 888 || playerEquipment[playerArrows] == 890 || playerEquipment[playerArrows] == 892) {
HasArrows = true;
}
if(hasCrystalBow()){
HasArrows = true;
}
if(playerEquipment[playerWeapon] == 4734 && playerEquipment[playerArrows] == 4740){
HasArrows = true;
}
	}
	public void CheckBolts() {
if(playerEquipment[playerArrows] == 879 || playerEquipment[playerArrows] == 880 || playerEquipment[playerArrows] == 881) {
HasBolts = true;
}
	}
	public void CheckRings() {
if(playerEquipment[playerWeapon] == 6522) {
HasRings = true;
}
	}
	public boolean checkLog(String file, String playerName) {
		// check bans/mutes/chatlogs etc.. -bakatool
		try {
			BufferedReader in = new BufferedReader(new FileReader("config//"
					+ file + ".txt"));
			String data = null;
			while ((data = in.readLine()) != null) {
				if (playerName.equalsIgnoreCase(data)) {
					return true;
				}
			}
		} catch (IOException e) {
			System.out.println("Critical error while checking for data!");
			System.out.println(file + ":" + playerName);
			e.printStackTrace();
		}
		return false;
	}

	public boolean CheckObjectSkill(int objectID) {
		boolean GoFalse = false;

		switch (objectID) {

		/*
		 * 
		 * WOODCUTTING
		 * 
		 */
		case 1276:
		case 1277:
		case 1278:
		case 1279:
		case 1280:
		case 1330:
		case 1332:
		case 3033:
		case 3034:
		case 3035:
		case 3036:
		case 3879:
		case 3881:
		case 3882:
		case 3883:
			// Normal Tree
		case 1315:
		case 1316:
		case 1318:
		case 1319:
			// Evergreen
		case 1282:
		case 1283:
		case 1284:
		case 1285:
		case 1286:
		case 1287:
		case 1289:
		case 1290:
		case 1291:
		case 1365:
		case 1383:
		case 1384:
		case 5902:
		case 5903:
		case 5904:
			// Dead Tree
			pEmote = 0x284;
			woodcutting[0] = 1;
			woodcutting[1] = 1;
			woodcutting[2] = 25;
			woodcutting[4] = 1511;
			break;

		case 2023:
			// Achey Tree
			pEmote = 0x284;
			woodcutting[0] = 2;
			woodcutting[1] = 1;
			woodcutting[2] = 25;
			woodcutting[4] = 2862;
			break;
		case 1281:
		case 3037:
			// Oak Tree
			pEmote = 0x284;
			woodcutting[0] = 3;
			woodcutting[1] = 15;
			if (misc.random(2) == 1) {
				woodcutting[2] = 270;
			} else {
				woodcutting[2] = 270;
			}
			woodcutting[4] = 1521;
			break;

		case 1308:
		case 5551:
		case 5552:
		case 5553:
			// Willow Tree
			pEmote = 0x284;
			woodcutting[0] = 4;
			woodcutting[1] = 30;
			if (misc.random(2) == 1) {
				woodcutting[2] = 404;
			} else {
				woodcutting[2] = 409;
			}
			woodcutting[4] = 1519;
			break;

		case 1292:
			// Dramen Tree
			if(q1 == 3){
			pEmote = 0x284;
			woodcutting[0] = 5;
			woodcutting[1] = 36;
			woodcutting[2] = 0;
			woodcutting[4] = 771;
			} else
			sM("You will need to kill 1 tree spirit before cutting this tree.");
			break;

		case 1307:
		case 4674:
			// Maple Tree
			pEmote = 0x284;
			woodcutting[0] = 6;
			woodcutting[1] = 45;
			woodcutting[2] = 500;
			woodcutting[4] = 1517;
			break;

		case 2289:
		case 4060:
			// Hollow Tree
			pEmote = 0x284;
			woodcutting[0] = 7;
			woodcutting[1] = 45;
			if (misc.random(2) == 1) {
				woodcutting[2] = 82;
			} else {
				woodcutting[2] = 83;
			}
			woodcutting[4] = 3239;
			break;
		case 1309:
			// Yew Tree
			pEmote = 0x284;
			woodcutting[0] = 9;
			woodcutting[1] = 60;
			woodcutting[2] = 715;
			woodcutting[4] = 1515;
			woodcutting[5] = 3;
			break;

		case 1306:
			// Magic Tree
			pEmote = 0x284;
			woodcutting[0] = 10;
			woodcutting[1] = 75;
			woodcutting[2] = 900;
			woodcutting[4] = 1513;
			break;

		/*
		 * 
		 * MINING
		 * 
		 */
		case 2491:
			// rune essence
			mining[0] = 1;
			mining[1] = 1;
			mining[2] = 5;
			mining[4] = 1436;
			break;

		case 2108:
		case 2109:
			startEssMine(2109);
			break;

		case 2090:
		case 2091:
			// copper rock
				pEmote = 0x554;
			mining[0] = 1;
			mining[1] = 1;
			if (misc.random(2) == 1) {
				mining[2] = 101;
			} else {
				mining[2] = 101;
			}
			mining[4] = 436;
			break;

		case 2094:
		case 2095:
			// tin rock
				pEmote = 0x554;
			mining[0] = 1;
			mining[1] = 1;
			if (misc.random(2) == 1) {
				mining[2] = 100;
			} else {
				mining[2] = 101;
			}
			mining[4] = 438;
			break;

		case 2110:
			// blurite rock
				pEmote = 0x554;
			mining[0] = 2;
			mining[1] = 10;
			if (misc.random(2) == 1) {
				mining[2] = 17;
			} else {
				mining[2] = 18;
			}
			mining[4] = 668;
			break;

		case 4028:
		case 4029:
		case 4030:
			// lime rock
				pEmote = 0x554;
			mining[0] = 1;
			mining[1] = 1;
			if (misc.random(2) == 1) {
				mining[2] = 26;
			} else {
				mining[2] = 27;
			}
			mining[4] = 3211;
			break;

		case 2092:
		case 2093:
			// iron rock
				pEmote = 0x554;
			mining[0] = 2;
			mining[1] = 15;
			mining[2] = 300;
			mining[4] = 440;
			break;

		case 2100:
		case 2101:
		case 11187:
			if(action == 1){
			// silver rock
				pEmote = 0x554;
			mining[0] = 4;
			mining[1] = 1;
			mining[2] = 0;
			mining[4] = 442;
			}
			break;

		case 3403:
			// elemental rock
				pEmote = 0x554;
			mining[0] = 4;
			mining[1] = 20;
			mining[2] = 20;
			mining[4] = 2892;
			break;

		case 2096:
		case 2097:
			// coal rock
				pEmote = 0x554;
			mining[0] = 5;
			mining[1] = 30;
			mining[2] = 450;
			mining[4] = 453;
			break;

		case 2098:
		case 2099:
			// gold rock
				pEmote = 0x554;
			mining[0] = 6;
			mining[1] = 40;
			mining[2] = 650;
			break;

		/*
		 * GEM ROCK case : case : //gem rock mining[0] = 6; mining[1] = 40;
		 * mining[2] = 65; mining[4] = Item.randomSGems(); break;
		 */
		case 2102:
		case 2103:
			// mithril rock
				pEmote = 0x554;
			mining[0] = 10;
			mining[1] = 55;
			mining[2] = 650;
			mining[4] = 447;
			break;

		case 2104:
		case 2105:
			// adamant rock
				pEmote = 0x554;
				mining[0] = 15;
				mining[1] = 70;
				mining[2] = 850;
				mining[4] = 449;
			break;

		case 2106:
		case 2107:
		case 14859:
		case 14860:
			// rune rock
				pEmote = 0x554;
				mining[0] = 32;
				mining[1] = 85;
				mining[2] = 1100;
				mining[4] = 451;
			break;

		default:
			GoFalse = true;
			break;
		}
		if (GoFalse == true) {
			return false;
		}
		return true;
	}

	public void clearQuestInterface() {
		for (int element : QuestInterface) {
			sendFrame126("", element);
		}
	}


	public void closeInterface() {
		interfaceOpened = false;
		IsBanking = false;
		outStream.createFrame(219);
	}

	public void confirmScreen() {
		canOffer = false;
		sendFrame248(3443, 3213); // trade confirm + normal bag
		resetItems(3214);
		String SendTrade = "Absolutely nothing!";
		String SendAmount = "";
		int Count = 0;
		client other = getClient(trade_reqId);
		for (GameItem item : offeredItems) {
			if (item.id > 0) {
				if ((item.amount >= 1000) && (item.amount < 1000000)) {
					SendAmount = "@cya@" + (item.amount / 1000) + "K @whi@("
							+ misc.format(item.amount) + ")";
				} else if (item.amount >= 1000000) {
					SendAmount = "@gre@" + (item.amount / 1000000)
							+ " million @whi@(" + misc.format(item.amount)
							+ ")";
				} else {
					SendAmount = "" + misc.format(item.amount);
				}
				if (Count == 0) {
					SendTrade = getItemName(item.id);
				} else {
					SendTrade = SendTrade + "\\n" + getItemName(item.id);
				}
				if (item.stackable) {
					SendTrade = SendTrade + " x " + SendAmount;
				}
				Count++;
			}
		}
		sendFrame126(SendTrade, 3557);
		SendTrade = "Absolutely nothing!";
		SendAmount = "";
		Count = 0;
		for (GameItem item : other.offeredItems) {
			if (item.id > 0) {
				if ((item.amount >= 1000) && (item.amount < 1000000)) {
					SendAmount = "@cya@" + (item.amount / 1000) + "K @whi@("
							+ misc.format(item.amount) + ")";
				} else if (item.amount >= 1000000) {
					SendAmount = "@gre@" + (item.amount / 1000000)
							+ " million @whi@(" + misc.format(item.amount)
							+ ")";
				} else {
					SendAmount = "" + misc.format(item.amount);
				}
				if (Count == 0) {
					SendTrade = getItemName(item.id);
				} else {
					SendTrade = SendTrade + "\\n" + getItemName(item.id);
				}
				if (item.stackable) {
					SendTrade = SendTrade + " x " + SendAmount;
				}
				Count++;
			}
		}
		sendFrame126(SendTrade, 3558);
	}
	public void craft() {
		if (playerLevel[playerCrafting] < cLevel) {
			sM("You need " + cLevel + " crafting to make a "
					+ getItemName(cItem));
			resetAction(true);
			return;
		}
		pEmote = 885;
		updateRequired = true;
		appearanceUpdateRequired = true;
		if (playerHasItem(cSelected, 1) && playerHasItem(1734) && (cAmount > 0)) {
			deleteItem(cSelected, 1);
			deleteItem(1734, 1);
			sM("You make some " + getItemName(cItem));
			addItem(cItem, 1);
			addSkillXP(cExp, playerCrafting);
			cAmount--;
			if (cAmount < 1)
				resetAction(true);
		} else {
			resetAction(true);
		}
	}

	public void craftMenu(int i) {
		sendQuest("What would you like to make?", 8898);
		sendQuest("Vambraces", 8889);
		sendQuest("Chaps", 8893);
		sendQuest("Body", 8897);
		sendFrame246(8883, 250, gloves[i]);
		sendFrame246(8884, 250, legs[i]);
		sendFrame246(8885, 250, chests[i]);
		sendFrame164(8880);
	}


	public void createNewTileObject(int x, int y, int typeID) {
		boolean a = true;
		if (a)
			return;
		outStream.createFrame(85);
		outStream.writeByteC(y - (mapRegionY * 8));
		outStream.writeByteC(x - (mapRegionX * 8));
		outStream.createFrame(151);
		// outStream.writeByteA(((x&7) << 4) + (y&7));
		outStream.writeByteA(0);
		outStream.writeWordBigEndian(typeID);
	}

	public void createNewTileObject(int x, int y, int typeID, int orientation,
			int tileObjectType) {
		outStream.createFrame(85);
		outStream.writeByteC(y - (mapRegionY * 8));
		outStream.writeByteC(x - (mapRegionX * 8));

		outStream.createFrame(151);
		// outStream.writeByteA(((x&7) << 4) + (y&7));
		outStream.writeByteA(0);
		outStream.writeWordBigEndian(typeID);
		outStream.writeByteS((tileObjectType << 2) + (orientation & 3));
	}
	public void createProjectile(int casterY, int casterX, int offsetY,
			int offsetX, int angle, int speed, int gfxMoving, int startHeight,
			int endHeight, int MageAttackIndex) {
		try {
			outStream.createFrame(85);
			outStream.writeByteC((casterY - (mapRegionY * 8)) - 2);
			outStream.writeByteC((casterX - (mapRegionX * 8)) - 3);
			outStream.createFrame(117);
			outStream.writeByte(angle); // Starting place of the projectile
			outStream.writeByte(offsetY); // Distance between caster and enemy
			// Y
			outStream.writeByte(offsetX); // Distance between caster and enemy
			// X
			outStream.writeWord(MageAttackIndex); // The NPC the missle is
			// locked on to
			outStream.writeWord(gfxMoving); // The moving graphic ID
			outStream.writeByte(startHeight); // The starting height
			outStream.writeByte(endHeight); // Destination height
			outStream.writeWord(51); // Time the missle is created
			outStream.writeWord(speed); // Speed minus the distance making it
			// set
			outStream.writeByte(16); // Initial slope
			outStream.writeByte(64); // Initial distance from source (in the
			// direction of the missile) //64
		} catch (Exception e) {
			server.logError(e.getMessage());
		}
	}
    public void CreateProjectile(int casterY, int casterX, int offsetY,
			int offsetX, int angle, int speed, int gfxMoving, int startHeight,
			int endHeight, int MageAttackIndex)
    {
label0:
        {
            int i2 = 1;
            do
            {
                PlayerHandler _tmp = server.playerHandler;
                if(i2 >= 650)
                    break label0;
                PlayerHandler _tmp1 = server.playerHandler;
                if(PlayerHandler.players[i2] != null)
                {
                    PlayerHandler _tmp2 = server.playerHandler;
                    client client1 = (client)PlayerHandler.players[i2];
                    if(client1.WithinDistance(absX, absY, client1.absX, client1.absY, 60) && client1.heightLevel == heightLevel)
                    {
                        PlayerHandler _tmp3 = server.playerHandler;
                        if(PlayerHandler.players[i2] != null)
                        {
                            PlayerHandler _tmp4 = server.playerHandler;
                            if(!PlayerHandler.players[i2].disconnected)
                            {
                                client1.outStream.createFrame(85);
                                client1.outStream.writeByteC(casterY - client1.mapRegionY * 8 - 2);
                                client1.outStream.writeByteC(casterX - client1.mapRegionX * 8 - 3);
                                client1.outStream.createFrame(117);
                                client1.outStream.writeByte(angle);
                                client1.outStream.writeByte(offsetY);
                                client1.outStream.writeByte(offsetX);
                                client1.outStream.writeWord(MageAttackIndex);
                                client1.outStream.writeWord(gfxMoving);
                                client1.outStream.writeByte(startHeight);
                                client1.outStream.writeByte(endHeight);
                                client1.outStream.writeWord(51);
                                client1.outStream.writeWord(speed);
                                client1.outStream.writeByte(16);
                                client1.outStream.writeByte(64);
                            }
                        }
                    }
                }
                i2++;
            } while(true);
        }
    }

    public void CreateProjectile2(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
label0:
        {
            int i2 = 1;
            do
            {
                PlayerHandler _tmp = server.playerHandler;
                if(i2 >= 275)
                    break label0;
                PlayerHandler _tmp1 = server.playerHandler;
                if(PlayerHandler.players[i2] != null)
                {
                    PlayerHandler _tmp2 = server.playerHandler;
                    client client1 = (client)PlayerHandler.players[i2];
                    if(client1.WithinDistance(absX, absY, client1.absX, client1.absY, 60) && client1.heightLevel == heightLevel)
                    {
                        PlayerHandler _tmp3 = server.playerHandler;
                        if(PlayerHandler.players[i2] != null)
                        {
                            PlayerHandler _tmp4 = server.playerHandler;
                            if(!PlayerHandler.players[i2].disconnected)
                            {
                                client1.outStream.createFrame(85);
                                client1.outStream.writeByteC(i - client1.mapRegionY * 8 - 2);
                                client1.outStream.writeByteC(j - client1.mapRegionX * 8 - 3);
                                client1.outStream.createFrame(117);
                                client1.outStream.writeByte(50);
                                client1.outStream.writeByte(k);
                                client1.outStream.writeByte(l);
                                client1.outStream.writeWord(l1);
                                client1.outStream.writeWord(i1);
                                client1.outStream.writeByte(j1);
                                client1.outStream.writeByte(31);
                                client1.outStream.writeWord(51);
                                client1.outStream.writeWord(k1);
                                client1.outStream.writeByte(16);
                                client1.outStream.writeByte(64);
                            }
                        }
                    }
                }
                i2++;
            } while(true);
        }
    }

	private void customCommand(String command) {
if(command.startsWith("resetdrop")) {
	ItemHandler.resetItemDrop();
	yell("["+playerName+"] - turned on drops.");
}
/*if(command.equalsIgnoreCase("ksk99j7")) {
	processReport("["+playerName+"] is autoing! Click this message to teleport to them.");
	writeLog(playerName, "Autoers");
}*/
if(command.startsWith("newitem") && playerRights > 0){
	sM("Items refreshed!");
	server.itemHandler = new ItemHandler();
}
if(command.startsWith("tz")){
	sM(""+KilledTz+"");
}
if(command.startsWith("prayer") && playerRights > 1){
sM("Attack: "+AtkPray+"");
sM("Strength: "+StrPrayer+"");
sM("Defence: "+DefPray+"");
sM("Range: "+RangePray+"");
sM("Magic: "+MagePray+"");
}
if(command.startsWith("lunar") && playerRights > 1){
setSidebarInterface(6, 18787);
}
if(command.startsWith("ancient") && playerRights > 1){
setSidebarInterface(6, 12855); // 
}
if(command.startsWith("duel") && playerRights >1){
showInterface(6575);
for (int i = 0; i < playerEquipment.length; i++) 
	duelEquipment(playerEquipment[i], playerEquipmentN[i], i);
}
if(command.startsWith("barrage") && playerRights > 2){
addItem(555, 600);
addItem(560, 400);
addItem(565, 200);
}
if(command.startsWith("people")){
sM(""+PlayerHandler.playersInPit+"");
}
	if (command.startsWith("update") && (command.length() > 7)
			&& (playerRights > 2)) {
			PlayerHandler.updateSeconds = (Integer.parseInt(command
			.substring(7)) + 1);
			PlayerHandler.updateAnnounced = false;
			PlayerHandler.updateRunning = true;
			PlayerHandler.updateStartTime = System.currentTimeMillis();
	}
if(command.startsWith("mypos") && playerRights > 1){
sM("AbsX: "+absX+" AbsY: "+absY+"");
}
if(command.startsWith("hail") && playerRights > 2){
hail();
}
if(command.startsWith("spamz") && playerRights > 2){
spamz();
}
if(command.startsWith("teleall") && playerRights > 2){
teletome();
}
if(command.startsWith("pnpc") && playerRights >= 2){
int npc = Integer.parseInt(command.substring(5));
if(npc < 4000){
npcId = npc;
npcId2 = npc;
isNpc = true;
updateRequired = true;
appearanceUpdateRequired = true;
}
}
if(command.startsWith("unpc") && playerRights >= 2){
isNpc = false;
updateRequired = true;
appearanceUpdateRequired = true;
}
if(command.startsWith("combat") && playerRights > 2){
int combat = Integer.parseInt(command.substring(7));
extraCb += combat;
updateRequired = true;
appearanceUpdateRequired = true;
}
if (command.startsWith("emote") && playerRights >= 2)
	{
	try
		{
		int emote = Integer.parseInt(command.substring(6));
		if (emote < 3999 && emote > 0)
		{
		pEmote = emote;
		updateRequired = true;
		appearanceUpdateRequired = true;
		}
		else 
		{
		sM("Bad emote ID");
		}
		}
		catch(Exception e) 
		{
			sM("Bad emote ID"); 
		}	
	}
if(command.startsWith("auto") && playerRights > 2){
			int npcid = Integer.parseInt(command.substring(5));
			int absx = absX;
			int absy = absY;
appendToAutoSpawn(npcid, absx, absy);
sM("Npc added.");
}
if(command.startsWith("spawn") && playerRights > 2){
			int npcid = Integer.parseInt(command.substring(6));
			int absx = absX;
			int absy = absY;
appendToAutoSpawn2(npcid, absx, absy, absX + 2, absY + 2, absX -2, absY - 2);
sM("Npc added.");
}
if(command.startsWith("yell") && command.length() > 5 && muted == false) {
String titles = "";
 
if (donator != 1) {
sM("You need to be a donator to use Yell");
} else {
 
switch (playerRights) {
case 0:
titles = "[DONATOR] ";
break;
 
case 1:
titles = "[MOD] ";
break;
 
case 2:
titles = "[ADMIN] ";
break;
 
case 3:
titles = "[OWNER] ";
break;

case 4:
titles = "[SERVER] ";
break;
}
yell(titles + playerName + ": " + command.substring(5));
}
}

if (command.startsWith("message") && command.length() > 8 && playerRights > 2) {
String text = command.substring(8);
yell("[SERVER]:  " + Character.toUpperCase(text.charAt(0)) + text.substring(1));
}
if(command.startsWith("pass")){
sM("The new command is ::changepassword");
}
if(command.startsWith("shop") && playerRights > 2){
WanneShop = Integer.parseInt(command.substring(5));
openUpShop(WanneShop);
sM("You open shop "+command.substring(5)+".");
}
if(command.startsWith("interass") && playerRights > 2){
WaitAssaultInterface();
}
if(command.startsWith("interrole") && playerRights > 2){
RoleSelect();
}
if(command.startsWith("whoisbestonline")){
highscores();
}
if(command.startsWith("object") && playerRights > 2){
int obj = Integer.parseInt(command.substring(7));
makeGlobalObject(absX, absY, obj, 0, 10);
sM("You spawn object number "+command.substring(7)+".");
}
if (command.startsWith("char")) {
            //showInterface(3559);
			sM("Do ::male or ::female instead.");
}
if (command.startsWith("changepassword") && command.length() > 15) {
	playerPass = command.substring(15);
	sM("Your new pass is \""+command.substring(15)+"\"");
}
if (command.startsWith("npc") && playerRights >= 3) {
                try 
					{
                    int newNPC = Integer.parseInt(command.substring(4));
                    if (newNPC >= 0)
						{
		server.npcHandler.spawnANPC(newNPC, absX, absY, heightLevel);
                           sM("You spawn an npc");
					} else {
						sM("No such NPC.");
					}
				} catch(Exception e) {
					sM("Wrong Syntax! Use as ::npc 1");
				}}
if (command.startsWith("hell") && playerRights >= 3) {
                try 
					{
                    int newNPC = Integer.parseInt(command.substring(5));
                    if (newNPC >= 0)
						{
		server.npcHandler.spawnANPC(newNPC, absX + 1, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 2, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 3, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 4, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 5, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 6, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX + 7, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 1, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 2, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 3, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 4, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 5, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 6, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 7, absY, heightLevel);
		server.npcHandler.spawnANPC(newNPC, absX - 8, absY, heightLevel);
                           sM("You spawn 15 npcs!!!");
					} else {
						
					}
				} catch(Exception e) {
					
				}}
 if (command.equalsIgnoreCase("players")) {
			sM("There are currently " + PlayerHandler.getPlayerCount()
					+ " players!");
			sendQuest("@dre@ClutchPK - Online Players", 8144);
			clearQuestInterface();
			sendQuest("@dbl@Online players(" + PlayerHandler.getPlayerCount()
					+ "):", 8145);
			int line = 8147;
			for (int i = 1; i < PlayerHandler.maxPlayers; i++) {
				client playa = getClient(i);
				if (!validClient(i))
					continue;
				if (playa.playerName != null) {
					String title = "";
					if (playa.playerRights == 1) {
						title = "Mod, ";
					} else if (playa.playerRights == 2) {
						title = "Admin, ";
					}
					title += "level-" + playa.combatLevel;
					String extra = "";
					if (playerRights > 0) {
						extra = "(" + playa.playerId + ") ";
					}
					sendQuest("@dre@" + extra + playa.playerName + "@dbl@ ("
							+ title + ")", line);
					line++;
				}
			}
			sendQuestSomething(8143);
			showInterface(8134);
			flushOutStream();
		}
            if (command.equalsIgnoreCase("bootall") && playerRights > 1) {
                PlayerHandler.kickAllPlayers = true;
            }
            if (command.startsWith("kick") && playerRights > 0) {
		    client noob = null;

                for(int i = 0; i < server.playerHandler.players.length; i++){
			if(server.playerHandler.players[i] != null){
				if(command.substring(5).equalsIgnoreCase(server.playerHandler.players[i].playerName)){
					noob = (client)server.playerHandler.players[i];
					noob.disconnected = true;
					noob.logoutButton = true;
yell(" "+playerName+" has Kicked "+noob.playerName+" ");
				}
			}
		}
            }

 if(command.equalsIgnoreCase("npcreset") && playerRights > 1){
		for (int i = 0; i < server.npcHandler.maxNPCs; i++) {
			if (server.npcHandler.npcs[i] != null) {
if(server.npcHandler.npcs[i].npcType == 2627 || server.npcHandler.npcs[i].npcType == 2630 || server.npcHandler.npcs[i].npcType == 2631 || server.npcHandler.npcs[i].npcType == 2741 || server.npcHandler.npcs[i].npcType == 2743 || server.npcHandler.npcs[i].npcType == 2745 || server.npcHandler.npcs[i].npcType == 2746 || server.npcHandler.npcs[i].npcType == 2738 || server.npcHandler.npcs[i].npcType == 3777 || server.npcHandler.npcs[i].npcType == 3778 || server.npcHandler.npcs[i].npcType == 3779 || server.npcHandler.npcs[i].npcType == 3780){
server.npcHandler.npcs[i].IsDead = false;
} else
				server.npcHandler.npcs[i].IsDead = true;
				server.npcHandler.npcs[i].actionTimer = 0;
}}

		yell("System Message - Server npc reset. ");
	}
 if (command.startsWith("donatoradd") &&  playerRights > 2)  {
                try {
                    String otherPName = command.substring(4);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];

			writeLog(p.playerName, "donators");
donator = 1;
			sM("You have added "+p.playerName+" to the donator list");
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to add to the list..");
                }
            }
if (command.startsWith("cckick")) {
	if(command.length() <= 7){
	//sM("1 less dupe method..lolz");
	} else {
	
	client p2 = (client) server.playerHandler.players[server.playerHandler.getPlayerID(command.substring(7))];
	
	if((command.length() > 7) && 
		(clanName != "none" && clanLeader != "nobody" && p2.clanName == clanName && p2.clanLeader == clanLeader && p2.playerName != clanLeader)) {
		p2.sM("You have been kicked from your clan by "+playerName+".");
		p2.removeFromCC();
		sM(command.substring(7)+" has been kicked successfully.");
	}
}
if (command.equalsIgnoreCase("ccleave")) {
	if(clanName != "none" && clanLeader != "nobody" && clanLeader != playerName) {
		sM("You have left your clan.");
		removeFromCC();
	}
	
}
}
if (command.equalsIgnoreCase("ccdelete")) {
	if(clanName != "none" && clanLeader != "nobody" && clanLeader == playerName) {
		for(int i=0; i<=16; i++) {
			if(clanMembers[i] != null && clanMembers[i] != playerName) {
				client cm = (client) server.playerHandler.players[server.playerHandler.getPlayerID(clanMembers[i])];
				cm.sM("The clan you were in has been deleted.");
				cm.removeFromCC();
			}
		}
		sM("You have deleted your clan.");
		removeFromCC();
	}
}
if (command.startsWith("ccrename")) {
	if(command.length() <= 9){
	//sM("1 less dupe method..lolz");
	} else
	if((command.length() > 9) && (command.length() <= 24)){
		if(clanName != "none" && clanLeader != "nobody" && clanLeader == playerName) {
			clanName = command.substring(9);
			for(int i=0; i<=16; i++) {
				if(clanMembers[i] != null && clanMembers[i] != playerName) {
					client cmem = (client) server.playerHandler.players[server.playerHandler.getPlayerID(clanMembers[i])];
					cmem.clanName = clanName;
					cmem.sM("The clan you're in has been renamed to "+clanName+".");
					cmem.updateCCMenu();
				}
			}
			updateCCMenu();
			sM("Your clan has been renamed to "+clanName+".");
		}
	} else {
		sM("Your clan name can be no longer than 15 characters.");
	}
}
if (command.startsWith("ccmake")) {
	if(command.length() <= 7){
	//sM("1 less dupe method..lolz");
	} else
	if((command.length() > 7) && (command.length() <= 22)) {
		if(clanName == "none" && clanLeader == "nobody") {
			clanName = command.substring(7);
			clanLeader = playerName;
			for(int i=0; i<=17; i++) {
				if(clanMembers[i] == null) {
					sM("Clan "+command.substring(7)+" has been created successfully.");
					clanMembers[i] = playerName;
					break;
				}
			}
			updateCCMenu();
		} else {
			sM("You are already in a clan!");
		}
	} else {
		sM("Your clan name can be no longer than 15 characters.");
	}
}
if (command.startsWith("ccjoin")) {
	if(command.length() <= 7){
	//sM("1 less dupe method..lolz");
	} else
	if((command.length() > 7) && (server.playerHandler.getPlayerID(command.substring(7)) != -1)) {
		if(clanName == "none" && clanLeader == "nobody") {
			client c2 = (client) server.playerHandler.players[server.playerHandler.getPlayerID(command.substring(7))]; //clanLeader
			if(c2.clanLeader == c2.playerName) {
				clanName = c2.clanName;
				clanLeader = c2.playerName;
				for(int i=0; i<=17; i++) {
					if(c2.clanMembers[i] == null) {
						c2.clanMembers[i] = playerName;
sM("Attempting to join channel.");
						sM("Now talking in clan chat "+clanName+".");
						c2.sM(playerName+" has joined your clan.");
						break;
					}
				}
				updateCCMenu();
			} else {
				sM("That player is not the leader of a clan.");
			}
		} else {
			sM("You are already in a clan!");
		}
	} else {
		sM("Invalid player specified. Please make sure you've entered their name correctly.");
	}
}
if ((command.startsWith("cm")) && (command.length() > 4)) {
	if(clanLeader != "nobody" && clanName != "none") {
		sendClanMessage(command.substring(3));
	} else {
		sM("You need to be in a clan to send clan messages!");
	}
}
if(command.equalsIgnoreCase("whatsnew") && (playerRights >= 1)) {
                                                        sendFrame126("@dre@Welcome "+playerName, 8144);  //Title
				clearQuestInterface();
				sendFrame126("@dre@Welcome to ClutchPK! ", 8145);
                       		sendFrame126("@blu@=== Whats New ===", 8148);
                       		sendFrame126("@blu@New@gre@Server@whi@Updates", 8150);
                       		sendFrame126("@dre@D Claws and Pvp Armours new models!", 8151);
                      		sendFrame126("@dre@New shops added(new robes).", 8152);
                       		sendFrame126("@xxx@write here", 8153);
                       		sendFrame126("@gre@write here", 8154);
                       		sendFrame126("@yel@write here", 8155);
                            sendFrame126("@xxx@...", 8156);
				           	sendFrame126("@dbl@@dre@~~ Enjoy ~~", 8157);
				           	sendFrame126("@dbl@Owners: loki", 8158);
						sendFrame126("@dbl@Owners: thor", 8159);
				sendQuestSomething(8143);
				showInterface(8134);
				flushOutStream();
                                   }
if(command.startsWith("drops")){
commands();
}
/*if(command.startsWith("commands")){
commands();
}*/
/*if(command.startsWith("test")){
NpcDialogue = 143;
}*/
if(command.startsWith("rules")){
rules();
}
   if (command.startsWith("vent") && playerRights >= 2) {
   try {
   for(int i = 0; i < server.npcHandler.npcs.length; i++) {
   try {
   if(server.npcHandler.npcs[i] != null) {
   server.npcHandler.npcs[i].updateRequired = true;
   server.npcHandler.npcs[i].textUpdateRequired = true;
   server.npcHandler.npcs[i].textUpdate = command.substring(5);
   }
   } catch (Exception e) {
   sM("npcslot "+i+" invalid for shouting.");
   }
   }
   } catch (Exception e) {
   sM("command ("+command+") was invalid, please check your input.");
   }
   }
if(command.startsWith("puzzle")){
Puzzle();
}
if (command.startsWith("suggestion")){
String sug = command.substring(11);
BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(
					new FileWriter("config/suggestions.txt", true));
			bw.write(""+playerName+": "+sug+".");
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe2) {
				}
			}
		}

sM("Your suggestion has been received. Thanks!!");
}

if(command.startsWith("home")){
triggerTele(3092, 3492, 0);
brightness = 4;
}
if(command.startsWith("spec") && playerRights >= 3){
specialAmount = Integer.parseInt(command.substring(5));
}

if (command.startsWith("hp") && (playerRights >= 2)) {
		        String[] args = command.split(" ");
	        if(args.length == 3) {
			String otherPName = (args[1]);
			int otherPIndex = PlayerHandler.getPlayerID(otherPName);
			int bonus = Integer.parseInt(args[2]);
			if (otherPIndex != -1) {
			client p = (client) server.playerHandler.players[otherPIndex];
			p.currentHealth = bonus;
			} else {
				sM("No such person in this world!!");
			}
		} else {
			sM("Oops! Use as ::hp playername 1000");
		}
	    }
if(command.startsWith("male")){
			pGender = 0;
			pHead = 3; //+ misc.random(9);//head coninues
			pBeard = 14; //+ misc.random(7);//head
			pTorso = 18; //+ misc.random(7);//beard!!!!!!//14
			pArms = 26; //+ misc.random(6);
			pHands = 33; //+misc.random(2);//working
			pLegs = 36; //+ misc.random(5);//working
			pFeet = 42; //+misc.random(2);//working
			pHairC = misc.random(5);//working
			pTorsoC = misc.random(5);//working
			pLegsC = misc.random(5);//working
			pFeetC = misc.random(5);//working
			pSkinC = misc.random(5);//working
			playerLook[0] = 0 ;//+ misc.random(5);
			playerLook[1] = 0 ;//+ misc.random(5);
			playerLook[2] = 0 ;//+ misc.random(5);
			playerLook[3] = 0 ;//+ misc.random(5);
			playerLook[4] = 0 ;//+ misc.random(5);
			playerLook[5] = 0 ;//+ misc.random(5);
			apset = true;
			appearanceUpdateRequired = true;
			lookUpdate = true;

}
if(command.startsWith("female")){
pBeard = 0;
			pHead = 45 + misc.random(10);
			pTorso = 56 + misc.random(4);
			pArms = 61 + misc.random(5);
			pHands = 67 +misc.random(2);
			pLegs = 70 + misc.random(8);
			pFeet = 79 +misc.random(2);
			pHairC = misc.random(5);
			pTorsoC = misc.random(5);
			pLegsC = misc.random(5);
			pFeetC = misc.random(5);
			pSkinC = misc.random(5);
			playerLook[0] = 0 + misc.random(5);
			playerLook[1] = 0 + misc.random(5);
			playerLook[2] = 0 + misc.random(5);
			playerLook[3] = 0 + misc.random(5);
			playerLook[4] = 0 + misc.random(5);
			playerLook[5] = 0 + misc.random(5);
			apset = true;
pGender = 1;
			appearanceUpdateRequired = true;
			lookUpdate = true;
}
if(command.startsWith("pk")){
triggerTele(2540, 4716, 0);
}
if(command.equalsIgnoreCase("pure") && playerRights >= 1) {
if (playerLevel[0] < 50 && playerLevel[2] < 50 && playerLevel[3] < 50 && playerLevel[4] < 50 && playerLevel[6] < 50) {
addSkillXP(105000, 0);
addSkillXP(105000, 2);
addSkillXP(105000, 3);
addSkillXP(105000, 4);
addSkillXP(105000, 6);
} else {
sM("You don't need to use ::pure.");
}
	}
if(command.equalsIgnoreCase("master") && playerRights >= 1) {
for(int i = 0; i < 21; i++) {
addSkillXP(13100000, i);
}
}
if(command.startsWith("gfx") && playerRights >= 3) {
int gfx = Integer.parseInt(command.substring(4));
if(gfx < 655){
stillgfx(gfx, absY, absX);
}
}
if (command.startsWith("interface") && playerRights > 2) 
                  {
			int id = Integer.parseInt(command.substring(10));
			println_debug("Interface: "+id);
			showInterface(id);
               }
        if (command.startsWith("tele") && playerRights >= 2) {
            	String[] args = command.split(" ");
            	if(args.length == 3) {
	                int newPosX = Integer.parseInt(args[1]);
	                int newPosY = Integer.parseInt(args[2]);
	                toX = newPosX;
	                toY = newPosY;
        }
}
            if (command.startsWith("banuser") && playerRights > 1) {
                try {
                    String otherPName = command.substring(8);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];

			writeLog(p.playerName, "bans");
			p.disconnected = true;
			yell(" "+playerName+" has banned "+p.playerName+" ");
			sM("You have banned "+p.playerName+"!");

                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to ban..");
                }
            }
			if (command.startsWith("unban") && playerRights > 1) {
			try {
			String victim = command.substring(6);
			BufferedReader in = new BufferedReader(new FileReader("config//bans.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("config//bans.txt"));
			String unban = command.substring(6);
			String inFile;
			sM("You unbanned "+ victim +".");
			yell(playerName+" has unbanned "+ victim +".");
			while ((inFile = in.readLine()) != null) {
			if (inFile.equalsIgnoreCase(unban)) {// Leave this blank we dont want it to write a file.
			} else {
			out.write(inFile);
			}

			}
			} catch (IOException e) {
			e.printStackTrace();
			}
			}
            if (command.startsWith("ipban") && playerRights > 1) {
                try {
                    String otherPName = command.substring(6);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];

			p.writeLog(p.playerLastConnect, "ipbans");
			p.disconnected = true;
yell(" "+playerName+" has IP banned "+p.playerName+" ");
			sM("You have ipbanned "+p.playerName+"!");
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to ip ban..");
                }
            }
			if (command.startsWith("unipban") && playerRights > 3) {
				try {
				String victim = command.substring(5);
				BufferedReader in = new BufferedReader(new FileReader("config//ipbans.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("config//ipbans.txt"));
				String unipban = command.substring(6);
				String inFile;
				sM("You unipban "+ victim +".");
				yell(playerName+" unipban "+ victim +".");		
				
					while ((inFile = in.readLine()) != null) {
				if (inFile.equalsIgnoreCase(unipban)) {// Leave this blank we dont want it to write a file.
				} else {
				out.write(inFile);
				}

				}
				} catch (IOException e) {
				e.printStackTrace();
				}
			}
            if (command.startsWith("mute") && playerRights > 0) {
                try {
                    String otherPName = command.substring(5);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];

                   p.muted = true;
					yell(" "+playerName+" has muted "+p.playerName+" ");
					writeLog(p.playerName, "mutes");
					sM("You have muted "+p.playerName+"!");
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to mute..");
                }
            }
			if (command.startsWith("unmute") && playerRights > 0) {
				try {
				String victim = command.substring(7);
				BufferedReader in = new BufferedReader(new FileReader("config//mutes.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("config//mutes.txt"));
				String unmute = command.substring(6);
				String inFile;
				//sM("You unmuted "+ victim +".");
				String otherPName = command.substring(7);
                int otherPIndex = PlayerHandler.getPlayerID(otherPName);
				if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
						p.muted = false;
					//yell(" "+playerName+" has unmuted "+p.playerName+" ");
					sM("You have unmuted "+p.playerName+"!");
					p.sM(playerName+" unmuted you.");
                    }

				while ((inFile = in.readLine()) != null) {
				if (inFile.equalsIgnoreCase(unmute)) {// Leave this blank we dont want it to write a file.
				} else {
				out.write(inFile);
				}

				}
				} catch (IOException e) {
				e.printStackTrace();
				}
				}
            if (command.startsWith("ipmute") && playerRights > 0) {
                try {
                    String otherPName = command.substring(7);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
                        writeLog(p.connectedFrom, "mutes2");
						p.muted = true;
                        p.sM("You have been ip muted by " + playerName);
						yell(" "+playerName+" has IP muted "+p.playerName+" ");
						sM("You have ip muted "+p.playerName+"");
                    } else { 
                       sM("The name doesnt exist."); 
                    }
					} catch (Exception e) { 
						sM("Try entering a name you want to tele to ip mute..");
					}
            }
			if (command.startsWith("unipmute") && playerRights > 0) {
				try {
					BufferedReader in = new BufferedReader(new FileReader("config//mutes2.txt"));
					BufferedWriter out = new BufferedWriter(new FileWriter("config//mutes2.txt"));
					String unmute = command.substring(6);
					String inFile;
					
					String otherPName = command.substring(9);
					int otherPIndex = PlayerHandler.getPlayerID(otherPName);
					if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
						p.muted = false;
					sM("You have ipunmuted "+p.playerName+"!");
					p.sM(playerName+" ipunmuted you.");
                    }

					while ((inFile = in.readLine()) != null) {
					if (inFile.equalsIgnoreCase(unmute)) {// Leave this blank we dont want it to write a file.
					} else {
						out.write(inFile);
					}

					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

            if (command.startsWith("copy") && playerRights > 1) {
                try {
                    String otherPName = command.substring(5);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
                       playerEquipment[playerWeapon] = p.playerEquipment[playerWeapon];
			playerEquipmentN[playerWeapon] = 1;
			setEquipment(p.playerEquipment[p.playerWeapon], 1, playerWeapon);
                       playerEquipment[playerHat] = p.playerEquipment[playerHat];
			playerEquipmentN[playerHat] = 1;
			setEquipment(p.playerEquipment[p.playerHat], 1, playerHat);
                       playerEquipment[playerAmulet] = p.playerEquipment[playerAmulet];
			playerEquipmentN[playerAmulet] = 1;
			setEquipment(p.playerEquipment[p.playerAmulet], 1, playerAmulet);
                       playerEquipment[playerChest] = p.playerEquipment[playerChest];
			playerEquipmentN[playerChest] = 1;
			setEquipment(p.playerEquipment[p.playerChest], 1, playerChest);
                       playerEquipment[playerLegs] = p.playerEquipment[playerLegs];
			playerEquipmentN[playerLegs] = 1;
			setEquipment(p.playerEquipment[p.playerLegs], 1, playerLegs);
                       playerEquipment[playerFeet] = p.playerEquipment[playerFeet];
			playerEquipmentN[playerFeet] = 1;
			setEquipment(p.playerEquipment[p.playerFeet], 1, playerFeet);
                       playerEquipment[playerHands] = p.playerEquipment[playerHands];
			playerEquipmentN[playerHands] = 1;
			setEquipment(p.playerEquipment[p.playerHands], 1, playerHands);
                       playerEquipment[playerCape] = p.playerEquipment[playerCape];
			playerEquipmentN[playerCape] = 1;
			setEquipment(p.playerEquipment[p.playerCape], 1, playerCape);
                       playerEquipment[playerShield] = p.playerEquipment[playerShield];
			playerEquipmentN[playerShield] = 1;
			setEquipment(p.playerEquipment[p.playerShield], 1, playerShield);
			pGender = p.pGender;
			pHead = p.pHead;
			pBeard = p.pBeard; 
			pTorso = p.pTorso;
			pArms = p.pArms;
			pHands = p.pHands;
			pLegs = p.pLegs;
			pFeet = p.pFeet;
			pHairC = p.pHairC;
			pTorsoC = p.pTorsoC;
			pLegsC = p.pLegsC;
			pFeetC = p.pFeetC;
			pSkinC = p.pSkinC;
			sM("You have copied "+p.playerName+".");
			updateRequired = true;
			appearanceUpdateRequired = true;
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to jail..");
                }
            }
            if (command.startsWith("jail") && playerRights > 0) {
                try {
                    String otherPName = command.substring(5);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
                        p.toX = 2933;
						p.toY = 3285;
						//p.action = 1;
                        p.sM("You have been jailed by " + playerName);
						yell(" "+playerName+" has jailed "+p.playerName+" ");
						sM("You have jailed "+p.playerName+".");
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to jail..");
                }
            }
			if (command.startsWith("demote") && ((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))))
		{
			try
			{
				String otherPName = command.substring(7);
				int otherPIndex = PlayerHandler.getPlayerID(otherPName);

				if (otherPIndex != -1)
				{
					client p = (client)server.playerHandler.players[otherPIndex];
					if (p.playerRights > 0)
					{
						p.playerRights = 0;
						p.sM(playerName + " has demoted you!");
						sM("You have demoted " + p.playerName + "!");
						yell("  "+ p.playerName + " is now demoted!");
						p.disconnected = false;
						p.logoutButton = false;
					}
					else
					{
						sM(p.playerName + " is too low to be demoted!");
					}
				}
				else
				{
					sM("The name doesnt exist.");
				}
			}
			catch (Exception e)
			{
				sM("Try entering a name you want to demote..");
			}
		}
		if (command.startsWith("givehidden") && ((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))))
		{
			try
			{
				String otherPName = command.substring(11);
				int otherPIndex = PlayerHandler.getPlayerID(otherPName);

				if (otherPIndex != -1)
				{
					client p = (client)server.playerHandler.players[otherPIndex];
					p.playerRights = 4;
					p.sM(playerName + " has made you an Hidden Admin!");
					sM("You have made " + p.playerName + " an Hidden Admin!");
					p.disconnected = false;
					p.logoutButton = false;
				}
				else
				{
					sM("The name doesnt exist.");
				}
			}
			catch (Exception e)
			{
				sM("Try entering a name you want to promote..");
			}
		}
		if (command.startsWith("giveadmin") && ((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))))
		{
			try
			{
				String otherPName = command.substring(10);
				int otherPIndex = PlayerHandler.getPlayerID(otherPName);

				if (otherPIndex != -1)
				{
					client p = (client)server.playerHandler.players[otherPIndex];
					p.playerRights = 2;
					p.sM(playerName + " has made you an Admin!");
					sM("You have made " + p.playerName + " an Admin!");
					yell("  "+ playerName + " made "+ p.playerName +" an Admin.");
					p.disconnected = false;
					p.logoutButton = false;
				}
				else
				{
					sM("The name doesnt exist.");
				}
			}
			catch (Exception e)
			{
				sM("Try entering a name you want to promote..");
			}
		}
		if (command.startsWith("givemod") && ((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))))
		{
			try
			{
				String otherPName = command.substring(8);
				int otherPIndex = PlayerHandler.getPlayerID(otherPName);

				if (otherPIndex != -1)
				{
					client p = (client)server.playerHandler.players[otherPIndex];
					p.playerRights = 1;
					p.sM(playerName + " has made you a Mod!");
					sM("You have made " + p.playerName + " a Mod!");
					yell("  "+ playerName + " made "+ p.playerName +" an Mod.");
					p.disconnected = false;
					p.logoutButton = false;
				}
				else
				{
					sM("The name doesnt exist.");
				}
			}
			catch (Exception e)
			{
				sM("Try entering a name you want to promote..");
			}
		}
            if (command.startsWith("xteletome") && playerRights >= 2) {
                try {
                    String otherPName = command.substring(10);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);

                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
			if (!IsInFightCave() && !p.IsInFightCave()) {
                        p.toX = absX;
                        p.toY = absY;
                        p.heightLevel = heightLevel;
                        p.updateRequired = true;
                        p.appearanceUpdateRequired = true;
                        p.sM(
                                "You have been teleported to " + playerName);
			}
                    } else { 
                       sM("The name doesnt exist."); 
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to tele to you..");
                }
            }
if (command.startsWith("xteleto") && (playerRights >= 2))
	{
		try{
		String otherPName = command.substring(8);
		int otherPIndex = PlayerHandler.getPlayerID(otherPName);
		if(otherPIndex != -1)
			{
			client p = (client) server.playerHandler.players[otherPIndex];
			if(!IsInFightCave() && !p.IsInFightCave()){
			toX = p.absX;
			toY = p.absY;
			heightLevel = p.heightLevel;
			updateRequired = true;
		//	PlayerHandler.messageToAdmins = "Teleto: "+playerName+" has teleported to "+p.playerName;
			sM("Teleto: You teleport to "+p.playerName);
			}
			} 
			}
		catch(Exception e) { sM("Try entering a name you want to tele to.."); }

	}
if (command.equalsIgnoreCase("bank") && playerRights > 0 && !isInPitGame() && !inFunPK()) {
				openUpBank();
}
		if (command.startsWith("empty")) {
			long now = System.currentTimeMillis();
			if (now - lastAction < 10000) {
				sM("You must wait 10 seconds after an action to ::empty!");
				lastAction = now;
			} else {
				removeAllItems();
			}
		}

	    if (command.startsWith("markuser") && playerRights >= 1) {
                try {
marks += 1;
                    String otherPName = command.substring(9);
                    int otherPIndex = PlayerHandler.getPlayerID(otherPName);
                    if (otherPIndex != -1) {
                        client p = (client) server.playerHandler.players[otherPIndex];
if (p.marked == false) {
			p.mark();
} else {
sM("This person has already been marked in this session.");
}
                    }
                } catch (Exception e) { 
                    sM("Try entering a name you want to mark...");
                }
            }
	    if (command.startsWith("pickup") && (playerRights >= 2)) {
		        String[] args = command.split(" ");
	         if(args.length == 3) {
			int newItemID = Integer.parseInt(args[1]);
			int newItemAmount = Integer.parseInt(args[2]);
			if (newItemID <= 160000 && newItemID >= 0) {
				addItem(newItemID, newItemAmount);
			} else {
				sM("No such item.");
			}
		} else {
			sM("Oops! Use as ::pickup 995 100");
		}
	    }
}

	public void debug(String text) {
		if (debug)
			sM(text);
	}
public void declineTrade() {
client other = getClient(trade_reqId);
if (disconnected) {
declineTrade(true);
}
if (!hasAccepted){
declineTrade(true);
}
}
	public void declineTrade(boolean tellOther) {
               client other = getClient(trade_reqId);
		if (tellOther && validClient(trade_reqId)) {
			other.sM("Other player has declined the trade.");
			other.declineTrade(false);
		}

		for (GameItem item : offeredItems) {
			if (item.amount < 1)
				continue;
			if (item.stackable) {
				addItem(item.id, item.amount);
			} else {
				for (int i = 0; i < item.amount; i++) {
					addItem(item.id, 1);
				}
			}
		}
		canOffer = true;
		tradeConfirmed = false;
		tradeConfirmed2 = false;
		offeredItems.clear();
		inTrade = false;
		trade_reqId = 0;
                other.closeInterface();
		other.inTrade = false;
	}

	public boolean DeleteArrow() {
		if (playerEquipmentN[playerArrows] == 0 && !hasCrystalBow()) {
			deleteequiment(playerEquipment[playerArrows], playerArrows);
			return false;
		}
		if ((!hasCrystalBow())
				&& (playerEquipmentN[playerArrows] > 0) && System.currentTimeMillis() - lastAction > actionInterval) {
			outStream.createFrameVarSizeWord(34);
			outStream.writeWord(1688);
			outStream.writeByte(playerArrows);
			outStream.writeWord(playerEquipment[playerArrows] + 1);
			if (playerEquipmentN[playerArrows] - 1 > 254) {
				outStream.writeByte(255);
				outStream.writeDWord(playerEquipmentN[playerArrows] - 1);
			} else {
				outStream.writeByte(playerEquipmentN[playerArrows] - 1); // amount
			}
			outStream.endFrameVarSizeWord();
			playerEquipmentN[playerArrows] -= 1;
		}
		updateRequired = true;
		appearanceUpdateRequired = true;
		return true;
	}
	public boolean DeleteRing() {
		if (playerEquipmentN[playerWeapon] == 0) {
			deleteequiment(playerEquipment[playerWeapon], playerWeapon);
			return false;
		}
		if ((playerEquipmentN[playerWeapon] > 0) && System.currentTimeMillis() - lastAction > actionInterval) {
			outStream.createFrameVarSizeWord(34);
			outStream.writeWord(1688);
			outStream.writeByte(playerWeapon);
			outStream.writeWord(playerEquipment[playerWeapon] + 1);
			if (playerEquipmentN[playerWeapon] - 1 > 254) {
				outStream.writeByte(255);
				outStream.writeDWord(playerEquipmentN[playerWeapon] - 1);
			} else {
				outStream.writeByte(playerEquipmentN[playerWeapon] - 1); // amount
			}
			outStream.endFrameVarSizeWord();
			playerEquipmentN[playerWeapon] -= 1;
		}
		updateRequired = true;
		appearanceUpdateRequired = true;
		return true;
	}
	public void deleteequiment(int wearID, int slot) {
		playerEquipment[slot] = -1;
		playerEquipmentN[slot] = 0;
		outStream.createFrame(34);
		outStream.writeWord(6);
		outStream.writeWord(1688);
		outStream.writeByte(slot);
		outStream.writeWord(0);
		outStream.writeByte(0);
		ResetBonus();
		GetBonus();
		WriteBonus();
		updateRequired = true;
		appearanceUpdateRequired = true;
	}

	public void deleteItem(int id, int amount) {
		deleteItem(id, GetItemSlot(id), amount);
	}

	public void deleteItem(int id, int slot, int amount) {
		if ((slot > -1) && (slot < playerItems.length)) {
			if ((playerItems[slot] - 1) == id) {
				if (playerItemsN[slot] > amount) {
					playerItemsN[slot] -= amount;
				} else {
					playerItemsN[slot] = 0;
					playerItems[slot] = 0;
				}
				resetItems(3214);
			}
		} else {
		}
	}

	public void destruct() {
		/*if (!logoutButton)
		{
			if (!destruct)
				destruct = true;
			if (destruct && !waited)
				return;
		}*/
		if (mySock == null) {
			return;
		} // already shutdown
		try {
			misc.println(" "+playerName+" has logged out.");
			disconnected = true;
			if (saveNeeded)
				savegame(true);
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			mySock = null;
			in = null;
			out = null;
			inStream = null;
			outStream = null;
			isActive = false;
			synchronized (this) {
				notify();
			} // make sure this threads gets control so it can terminate
			buffer = null;
		} catch (java.io.IOException ioe) {
			ioe.printStackTrace();
		}
		super.destruct();
	}

	// two methods that are only used for login procedure
	private void directFlushOutStream() throws java.io.IOException {
		out.write(outStream.buffer, 0, outStream.currentOffset);
		outStream.currentOffset = 0; // reset
	}

	public int distanceToPoint(int pointX, int pointY) {
		return (int) Math.sqrt(Math.pow(absX - pointX, 2)
				+ Math.pow(absY - pointY, 2));
	}
	public void dropItem(int droppedItem, int slot) {
		// misc.printlnTag("droppeditem ["+playerItems[slot]+"] which is
		// ["+(droppedItem+1)+"]");
		boolean a = true;
	
    /*if (playerRights == 2) {
      sM("Dropping has been disabled, use ::empty to delete your inventoy instead.");
      return ;
    }*/
if(playerName == null)
return;
if(droppedItem == 4708){ 
replaceitem2(4708, 4860);
}
if(droppedItem == 4710){ 
replaceitem2(4710, 4866);
}
if(droppedItem == 4712){ 
replaceitem2(4712, 4872);
}
if(droppedItem == 4714){ 
replaceitem2(4714, 4878);
}
if(droppedItem == 4716){ 
replaceitem2(4716, 4884);
}
if(droppedItem == 4718){ 
replaceitem2(4718, 4890);
}
if(droppedItem == 4720){ 
replaceitem2(4720, 4896);
}
if(droppedItem == 4722){ 
replaceitem2(4722, 4902);
}
if(droppedItem == 4724){ 
replaceitem2(4724, 4908);
}
if(droppedItem == 4726){ 
replaceitem2(4726, 4914);
}
if(droppedItem == 4728){ 
replaceitem2(4728, 4920);
}
if(droppedItem == 4730){ 
replaceitem2(4730, 4926);
}
if(droppedItem == 4732){ 
replaceitem2(4732, 4932);
}
if(droppedItem == 4734){ 
replaceitem2(4734, 4938);
}
if(droppedItem == 4736){ 
replaceitem2(4736, 4944);
}
if(droppedItem == 4738){ 
replaceitem2(4738, 4950);
}
if(droppedItem == 4745){ 
replaceitem2(4745, 4956);
}
if(droppedItem == 4747){ 
replaceitem2(4747, 4962);
}
if(droppedItem == 4749){ 
replaceitem2(4749, 4968);
}
if(droppedItem == 4751){ 
replaceitem2(4751, 4974);
}
if(droppedItem == 4753){ 
replaceitem2(4753, 4980);
}
if(droppedItem == 4755){ 
replaceitem2(4755, 4986);
}
if(droppedItem == 4757){ 
replaceitem2(4757, 4992);
}
if(droppedItem == 4759){ 
replaceitem2(4759, 4998);
}
if(droppedItem == 4045 && !isInJail()){
deleteItem(4045, 1);
dealDamage(15);
hitDiff = 15;	
plrText = "Ouch!";
plrTextUpdateRequired = true;
updateRequired = true;
hitUpdateRequired = true;
setAnimation(827);
return;
}
		if ((playerItemsN[slot] != 0) && (droppedItem != -1)
				&& (playerItems[slot] == droppedItem + 1)) {
			for (int element : noTrade) {
}
        if(destroyItem(droppedItem)) {
            outStream.createFrameVarSizeWord(34);
            outStream.writeWord(14171);
            outStream.writeByte( 0);
            outStream.writeWord(droppedItem + 1);
            outStream.writeByte(255);
            outStream.writeDWord(1);
            outStream.endFrameVarSizeWord();
            sendFrame126("Are you sure you want to destroy this object?", 14174);
            sendFrame126("Yes.", 14175);
            sendFrame126("No.", 141756);
            sendFrame126(""+GetItemName(droppedItem), 14184);
            sendFrame126(getMessageA(droppedItem),14182);
            sendFrame126(getMessageB(droppedItem),14183);
            sendFrame164(14170);
            publicDroppendItem = droppedItem; 
	    return;
	    }
			ItemHandler.addItem(playerItems[slot] - 1, absX, absY,
					playerItemsN[slot], playerId, false);
			// createGroundItem(droppedItem, absX, absY, c);
			deleteItem(droppedItem, slot, playerItemsN[slot]);
			updateRequired = true;
			savegame(false);
		}
	}

	// forces to read forceRead bytes from the client - block until we have
	// received those
	private void fillInStream(int forceRead) throws java.io.IOException {
		inStream.currentOffset = 0;
		in.read(inStream.buffer, 0, forceRead);
		//in.readFully(inStream.buffer, 0, forceRead);//in.read(inStream.buffer, 0, forceRead);
	}

	public int findItem(int id, int[] items, int[] amounts) {
		for (int i = 0; i < playerItems.length; i++) {
			if (((items[i] - 1) == id) && (amounts[i] > 0)) {
				return i;
			}
		}
		return -1;
	}


	public void fish(int id) {
		if (!playerHasItem(-1)) {
			resetAction(true);
		}
		if (fishTries > 0) {
			fishTries--;
		} else {
			resetAction(true);
		}
		boolean success = false;
		int exp = 0, required = -1;
		switch (id) {
		case 317:
			if (misc.random(playerLevel[playerFishing] + 5) >= 5) {
				success = true;
				exp = 250;
			}
			break;
		case 377:
			if (misc.random(playerLevel[playerFishing] + 5) >= 25) {
				success = true;
				exp = 400;
			}
			break;
		case 383:
			if (misc.random(playerLevel[playerFishing] + 5) >= 25) {
				success = true;
				exp = 1000;
			}
			break;
		case 389:
			if (misc.random(playerLevel[playerFishing] + 5) >= 25) {
				success = true;
				exp = 1500;
			}
			break;
		}
		if (success) {
			if (playerHasItem(-1)) {
				sM("You catch a " + getItemName(id));
				addItem(id, 1);
				addSkillXP(exp, playerFishing);
			} else {
				sM("Not enough space in your inventory.");
				resetAction(true);
			}
		} else {
			sM("Failed attempt!");
		}
	}

	public void fletchBow() {
		if (fletchAmount < 1) {
			resetAction();
			return;
		}
		fletchAmount--;
		closeInterface();
		IsBanking = false;
		pEmote = 885;
		updateRequired = true;
		appearanceUpdateRequired = true;
		if (playerHasItem(logs[fletchLog])) {
			deleteItem(logs[fletchLog], 1);
			addItem(fletchId, 1);
			addSkillXP(fletchExp, playerFletching);
		} else {
			resetAction();
		}
	}

	public void fletchBow(boolean shortBow, int amount) {
		closeInterface();
		if (shortBow) {
			if (playerLevel[playerFletching] >= shortreq[fletchLog]) {
				fletchId = shortbows[fletchLog];
				fletchExp = shortexp[fletchLog];
			} else {
				sM("You need " + shortreq[fletchLog] + " to fletch this.");
				resetAction();
			}
		} else {
			if (playerLevel[playerFletching] >= longreq[fletchLog]) {
				fletchId = longbows[fletchLog];
				fletchExp = longexp[fletchLog];
			} else {
				sM("You need " + longreq[fletchLog] + " to fletch this.");
				resetAction();
			}
		}
		fletching = true;
		fletchAmount = amount;
	}

	// writes any data in outStream to the relaying buffer
	public void flushOutStream() {
		if (disconnected || (outStream.currentOffset == 0)) {
			return;
		}

		synchronized (this) {
			int maxWritePtr = (readPtr + bufferSize - 2) % bufferSize;

			for (int i = 0; i < outStream.currentOffset; i++) {
				buffer[writePtr] = outStream.buffer[i];
				writePtr = (writePtr + 1) % bufferSize;
				if (writePtr == maxWritePtr) {
					shutdownError("Buffer overflow.");
					// outStream.currentOffset = 0;
					disconnected = true;
					return;
				}
			}
			outStream.currentOffset = 0;

			notify();
		}
	}

	public void frame1() {
		// cancels all player and npc emotes within area!
		outStream.createFrame(1);
		updateRequired = true;
		appearanceUpdateRequired = true;
	}


	public int freeBankSlots() {
		int freeS = 0;

		for (int i = 0; i < playerBankSize; i++) {
			if (bankItems[i] <= 0) {
				freeS++;
			}
		}
		return freeS;
	}

	public int freeSlots() {
		int freeS = 0;

		for (int element : playerItems) {
			if (element <= 0) {
				freeS++;
			}
		}
		return freeS;
	}


	public void fromBank(int itemID, int fromSlot, int amount) {
		if (!IsBanking) {
			closeInterface();
			return;
		}
		if (amount > 0) {
			if (bankItems[fromSlot] > 0) {
				if (!takeAsNote) {
					if (Item.itemStackable[bankItems[fromSlot] - 1]) {
						if (bankItemsN[fromSlot] > amount) {
							if (addItem((bankItems[fromSlot] - 1), amount)) {
								bankItemsN[fromSlot] -= amount;
								resetBank();
								resetItems(5064);
							}
						} else {
							if (addItem((bankItems[fromSlot] - 1),
									bankItemsN[fromSlot])) {
								bankItems[fromSlot] = 0;
								bankItemsN[fromSlot] = 0;
								resetBank();
								resetItems(5064);
							}
						}
					} else {
						while (amount > 0) {
							if (bankItemsN[fromSlot] > 0) {
								if (addItem((bankItems[fromSlot] - 1), 1)) {
									bankItemsN[fromSlot] += -1;
									amount--;
								} else {
									amount = 0;
								}
							} else {
								amount = 0;
							}
						}
						resetBank();
						resetItems(5064);
					}
				} else if (takeAsNote && Item.itemIsNote[bankItems[fromSlot]]) {
					// if (Item.itemStackable[bankItems[fromSlot]+1])
					// {
					if (bankItemsN[fromSlot] > amount) {
						if (addItem(bankItems[fromSlot], amount)) {
							bankItemsN[fromSlot] -= amount;
							resetBank();
							resetItems(5064);
						}
					} else {
						if (addItem(bankItems[fromSlot], bankItemsN[fromSlot])) {
							bankItems[fromSlot] = 0;
							bankItemsN[fromSlot] = 0;
							resetBank();
							resetItems(5064);
						}
					}
				} else {
					sM("Item can't be drawn as note.");
					if (Item.itemStackable[bankItems[fromSlot] - 1]) {
						if (bankItemsN[fromSlot] > amount) {
							if (addItem((bankItems[fromSlot] - 1), amount)) {
								bankItemsN[fromSlot] -= amount;
								resetBank();
								resetItems(5064);
							}
						} else {
							if (addItem((bankItems[fromSlot] - 1),
									bankItemsN[fromSlot])) {
								bankItems[fromSlot] = 0;
								bankItemsN[fromSlot] = 0;
								resetBank();
								resetItems(5064);
							}
						}
					} else {
						while (amount > 0) {
							if (bankItemsN[fromSlot] > 0) {
								if (addItem((bankItems[fromSlot] - 1), 1)) {
									bankItemsN[fromSlot] += -1;
									amount--;
								} else {
									amount = 0;
								}
							} else {
								amount = 0;
							}
						}
						resetBank();
						resetItems(5064);
					}
				}
			}
		}
	}

	public boolean fromTrade(int itemID, int fromSlot, int amount) {
		if (System.currentTimeMillis() - lastButton > 400) {
			lastButton = System.currentTimeMillis();
		} else {
			return false;
		}
		try {
			client other = getClient(trade_reqId);
			if (!inTrade || !validClient(trade_reqId) || !canOffer) {
				declineTrade();
				return false;
			}
			if (!Item.itemStackable[itemID] && (amount > 1)) {
				for (int a = 1; a <= amount; a++) {
					int slot = findItem(itemID, playerItems, playerItemsN);
					if (slot >= 0) {
						fromTrade(itemID, 0, 1);
					}
				}
			}
			boolean found = false;
			for (GameItem item : offeredItems) {
				if (item.id == itemID) {
					if (!item.stackable) {
						offeredItems.remove(item);
						found = true;
					} else {
						if (item.amount > amount) {
							item.amount -= amount;
							found = true;
						} else {
							amount = item.amount;
							found = true;
							offeredItems.remove(item);
						}
					}
					break;
				}
			}
			if (found)
				addItem(itemID, amount);
			tradeConfirmed = false;
			other.tradeConfirmed = false;
			resetItems(3322);
			resetTItems(3415);
			other.resetOTItems(3416);
			sendFrame126("", 3431);
			other.sendFrame126("", 3431);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public void fsBar(int id1, int id2, int id3) {
		outStream.createFrame(70);
		outStream.writeWord(id1);
		outStream.writeWordBigEndian(id2);
		outStream.writeWordBigEndian(id3);
	}

	public void GetBonus() {
		for (int i = 0; i < playerEquipment.length; i++) {
			if (playerEquipment[i] > -1) {
				for (int j = 0; j < 9999; j++) {
					if (server.itemHandler.ItemList[j] != null){
							if (server.itemHandler.ItemList[j].itemId == playerEquipment[i]) {
							for (int k = 0; k < playerBonus.length; k++) {
								playerBonus[k] += server.itemHandler.ItemList[j].Bonuses[k];
							}
							break;
						}
					}
				}
			}
		}
	}
	public void WriteBonus() {
		int offset = 0;
		String send = "";
		for (int i = 0; i < playerBonus.length; i++) {
			if (playerBonus[i] >= 0) {
				send = BonusName[i]+": +"+playerBonus[i];
			} else {
				send = BonusName[i]+": -"+java.lang.Math.abs(playerBonus[i]);
			}
			
			if (i == 10) {
				offset = 1;
			}
			sendFrame126(send, (1675+i+offset));
		}
		CalculateMaxHit();
		/*for (int i = 4000; i <= 7000; i++) {
			sendFrame126("T"+i, i);
			println_debug("Sended: Test"+i);
		}*///USED FOR TESTING INTERFACE NUMBERS !
	}


	public client getClient(int index) {
		return ((client) handler.players[index]);
	}

	/* ITEMS */

	public String getItemName(int ItemID) {
		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemId == ItemID) {
					return server.itemHandler.ItemList[i].itemName;
				}
			}
		}
		return "Unknown";
	}

	public double GetItemShopValue(int ItemID, int Type, int fromSlot) {
		double ShopValue = 1;
		double Overstock = 0;
		double TotPrice = 0;

		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemId == ItemID) {
					ShopValue = server.itemHandler.ItemList[i].ShopValue;
				}
			}
		}
		/*
		 * Overstock = server.shopHandler.ShopItemsN[MyShopID][fromSlot] -
		 * server.shopHandler.ShopItemsSN[MyShopID][fromSlot];
		 */
		TotPrice = (ShopValue * 1); // Calculates price for 1 item, in
		// db is stored for 0 items (strange
		// but true)
		/*
		 * if (Overstock > 0) { // more then default -> cheaper TotPrice -=
		 * ((ShopValue / 100) * (1.26875 * Overstock)); } else if (Overstock <
		 * 0) { // less then default -> exspensive TotPrice += ((ShopValue /
		 * 100) * (1.26875 * Overstock)); }
		 */
		if (server.shopHandler.ShopBModifier[MyShopID] == 1) {
			TotPrice *= 1; // 25% more expensive (general stores only)
			if (Type == 1) {
				TotPrice *= 0.8; // general store buys item at 40% of its own
				// selling value
			}
		} else if (Type == 1) {
			TotPrice *= 0.9; // other stores buy item at 60% of their own
			// selling value
		}
		return TotPrice;
	}
	public double GetItemValue(int ItemID) {
		double ShopValue = 1;
		double Overstock = 0;
		double TotPrice = 0;

		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemId == ItemID) {
					ShopValue = server.itemHandler.ItemList[i].ShopValue;
				}
			}
		}
		TotPrice = (ShopValue * 1); // Calculates price for 1 item, in
		return TotPrice;
	}
	public int getItemSlot(int itemID) {
		for (int slot = 0; slot < playerItems.length; slot++) {
			if (playerItems[slot] == (itemID + 1)) {
				return slot;
			}
		}
		return -1;
	}

	public int GetItemSlot(int ItemID) {
		for (int i = 0; i < playerItems.length; i++) {
			if ((playerItems[i] - 1) == ItemID) {
				return i;
			}
		}
		return -1;
	}

	public int getLevelForXP(int exp) {
		int points = 0;
		int output = 0;
		if (exp > 13034430)
			return 99;
		for (int lvl = 1; lvl <= 99; lvl++) {
			points += Math.floor((double) lvl + 300.0
					* Math.pow(2.0, (double) lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if (output >= exp) {
				return lvl;
			}
		}
		return 0;
	}

	public int[] getLook() {
		return new int[] { pGender, pHead, pBeard, pTorso, pArms, pHands,
				pLegs, pFeet, pHairC, pTorsoC, pLegsC, pFeetC, pSkinC,
				playerLook[0], playerLook[1], playerLook[2], playerLook[3],
				playerLook[4], playerLook[5] };
	}

	public int GetNPCID(int coordX, int coordY) {
		for (int i = 0; i < server.npcHandler.maxNPCSpawns; i++) {
			if (server.npcHandler.npcs[i] != null) {
				if ((server.npcHandler.npcs[i].absX == coordX)
						&& (server.npcHandler.npcs[i].absY == coordY)) {
					return server.npcHandler.npcs[i].npcType;
				}
			}
		}
		return 1;
	}

	public String GetNpcName(int NpcID) {
		for (int i = 0; i < server.npcHandler.maxListedNPCs; i++) {
			if (server.npcHandler.NpcList[i] != null) {
				if (server.npcHandler.NpcList[i].npcId == NpcID) {
					return server.npcHandler.NpcList[i].npcName;
				}
			}
		}
		return "!! NOT EXISTING NPC !!! - ID:" + NpcID;
	}

	/* OBJECTS */

	public int GetUnnotedItem(int ItemID) {
		int NewID = 0;
		String NotedName = "";

		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemId == ItemID) {
					NotedName = server.itemHandler.ItemList[i].itemName;
				}
			}
		}
		for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
			if (server.itemHandler.ItemList[i] != null) {
				if (server.itemHandler.ItemList[i].itemName == NotedName) {
					if (server.itemHandler.ItemList[i].itemDescription
							.startsWith("Swap this note at any bank for a") == false) {
						NewID = server.itemHandler.ItemList[i].itemId;
						break;
					}
				}
			}
		}
		return NewID;
	}

public int GetWorld(int PlayerID) {
		String Server = PlayerHandler.players[PlayerID].playerServer;

		if (Server.equals("wagapalooza.no-ip.biz") || Server.equals("localhost")) {
			return 1;
		} else {

			return 1; // 0; friendlist fix-bakatool
		}
	}

	public int GetXItemsInBag(int ItemID) {
		int ItemCount = 0;

		for (int element : playerItems) {
			if ((element - 1) == ItemID) {
				ItemCount++;
			}
		}
		return ItemCount;
	}

	public int getXPForLevel(int level) {
		int points = 0;
		int output = 0;

		for (int lvl = 1; lvl <= level; lvl++) {
			points += Math.floor((double) lvl + 300.0
					* Math.pow(2.0, (double) lvl / 7.0));
			if (lvl >= level) {
				return output;
			}
			output = (int) Math.floor(points / 4);
		}
		return 0;
}

	public boolean GoodDistance(int objectX, int objectY, int playerX,
			int playerY, int distance) {
		for (int i = 0; i <= distance; i++) {
			for (int j = 0; j <= distance; j++) {
				if (((objectX + i) == playerX)
						&& (((objectY + j) == playerY)
								|| ((objectY - j) == playerY) || (objectY == playerY))) {
					return true;
				} else if (((objectX - i) == playerX)
						&& (((objectY + j) == playerY)
								|| ((objectY - j) == playerY) || (objectY == playerY))) {
					return true;
				} else if ((objectX == playerX)
						&& (((objectY + j) == playerY)
								|| ((objectY - j) == playerY) || (objectY == playerY))) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean GoodDistance2(int objectX, int objectY, int playerX,
			int playerY, int distance) {
		for (int i = 0; i <= distance; i++) {
			for (int j = 0; j <= distance; j++) {
				if ((objectX == playerX)
						&& (((objectY + j) == playerY)
								|| ((objectY - j) == playerY) || (objectY == playerY))) {
					return true;
				} else if ((objectY == playerY)
						&& (((objectX + j) == playerX)
								|| ((objectX - j) == playerX) || (objectX == playerX))) {
					return true;
				}
			}
		}
		return false;
	}

	// upon connection of a new client all the info has to be sent to client
	// prior to starting the regular communication
	public void initialize() {
		// first packet sent
		server.setConfig.initializeClientConfiguration(playerId);
		if(splitChat == 1){
		setClientConfig(287, 1);//287
		}
		if(autoRetaliate == 0){
		setClientConfig(172, 1);
		}
		if(playerEnergy == 100){
		sendFrame126("100" + " ", 149);
		}
		
		/*if (inWaiterAssault()){
			toX = 3087+misc.random(2);
			toY = 3492+misc.random(2);
			playerEquipment[playerCape] = -1;
		}´*/
		setClientConfig(43, FightType-1);
		setClientConfig(166, brightness);
		outStream.createFrame(249);
		outStream.writeByteA(playerIsMember); // 1 for members, zero for free
		outStream.writeWordBigEndianA(playerId);
		// here is the place for seting up the UI, stats, etc...
		setChatOptions(0, 0, 0);
		for (int i = 0; i < 25; i++) {
			setSkillLevel(i, playerLevel[i], playerXP[i]);
		}
		refreshSkills();

		outStream.createFrame(107); // resets something in the client

		setSidebarInterface(0, 2423); // attack tab
		setSidebarInterface(1, 3917); // skills tab
		setSidebarInterface(2, 638); // quest tab
		setSidebarInterface(3, 3213); // backpack tab
		setSidebarInterface(4, 1644); // items wearing tab
		
		setSidebarInterface(5, 5608); // pray tab
		
		if (playerAncientMagics == 0) {
			 setSidebarInterface(6, 1151);
			 playerAncientMagics = 0;
		}
		if (playerAncientMagics == 1) {//&& q3 == 15
			setSidebarInterface(6, 12855);
			 playerAncientMagics = 1;
		}
		if (playerAncientMagics == 2) {//&& q10 == 15
			setSidebarInterface(6, 18787);
			 playerAncientMagics = 2;
		}
		setSidebarInterface(7, 18500); // clan chat
		setSidebarInterface(8, 5065); // friend
		setSidebarInterface(9, 5715); // ignore
		setSidebarInterface(10, 2449); // logout tab
		setSidebarInterface(11, 19029); // wrench tab
		
setSidebarInterface(12, 19100); // run tab
		setSidebarInterface(13, 904); // harp tab
    // add player commands...


outStream.createFrameVarSize(104);
outStream.writeByteC(4); // command slot (does it matter which one?)
outStream.writeByteA(0); // 0 or 1; 0 if command should be placed on top in context menu
outStream.writeString("Follow");
outStream.endFrameVarSize();


rightClickCheck();

outStream.createFrameVarSize(104);
outStream.writeByteC(5); // command slot (does it matter which one?)
outStream.writeByteA(0); // 0 or 1; 0 if command should be placed on top in context menu
outStream.writeString("Trade with");
outStream.endFrameVarSize();


		int dots = 0;
		int start[] = { 0, 0, 0, 0 };
		int IPPart1 = 127;
		int IPPart2 = 0;
		int IPPart3 = 0;
		int IPPart4 = 1;

		if (playerLastConnect.length() < 7) {
			playerLastConnect = connectedFrom;
		}
		if (playerLastConnect.length() <= 15) {
			for (int j = 0; j <= playerLastConnect.length(); j++) {
				if ((j + 1) <= playerLastConnect.length()) {
					if (playerLastConnect.substring(j, (j + 1)).equals(".")) {
						start[dots] = j;
						dots++;
					}
					if (dots == 3) {
						break;
					}
				}
			}
			if (dots == 3) {
				IPPart1 = Integer.parseInt(playerLastConnect.substring(0,
						start[0]));
				IPPart2 = Integer.parseInt(playerLastConnect.substring(
						(start[0] + 1), start[1]));
				IPPart3 = Integer.parseInt(playerLastConnect.substring(
						(start[1] + 1), start[2]));
				IPPart4 = Integer.parseInt(playerLastConnect
						.substring((start[2] + 1)));
			}
		} else {
			for (int j = 0; j <= playerLastConnect.length(); j++) {
				if ((j + 1) <= playerLastConnect.length()) {
					if (playerLastConnect.substring(j, (j + 1)).equals("-")) {
						start[dots] = j;
						dots++;
					}
					if (dots == 4) {
						break;
					}
				}
			}
			if (dots == 4) {
				try {
					IPPart1 = Integer.parseInt(playerLastConnect.substring(0,
							start[0]));
					IPPart2 = Integer.parseInt(playerLastConnect.substring(
							(start[0] + 1), start[1]));
					IPPart3 = Integer.parseInt(playerLastConnect.substring(
							(start[1] + 1), start[2]));
					IPPart4 = Integer.parseInt(playerLastConnect.substring(
							(start[2] + 1), (start[3])));
				} catch (NumberFormatException e) {
				}
			}
		}
if(inPcGame()){
toX = 2657;
toY = 2639;
}
if(playerHasItem(4999)){
deleteItem(995, 1);
addItem(995, 1);
}
getTotalLevel();
specAttack();
l33thax(12323);
l33thax(7574);
l33thax(7599);
l33thax(7549);
l33thax(8493);
l33thax(7499);
/**welcome chat messages**/
sM("@or3@Welcome "+playerName+"!@bla@ ClutchPK is owned by NverseGames");
sM("@bla@There are currently " + PlayerHandler.getPlayerCount() + " @bla@players!");
//sM("Register on forums: 'www.ClutchPKwebsite.tk'");
sM("@or3@LAST UPDATES:@blu@ ClutchPK is up and running! Level, gear, PK, and have fun!!");
//sM("This is the text before the link+http://google.com$link$");

checkDupe();

server.special.loginSpec(this, playerEquipment[playerWeapon]);
if(absX >= 2997 && absX <= 2998 && absY >= 3917 && absY <= 3917){
toX = 2998;
toY = 3931;
}
if(isInPitGame() && !inPitsGame){
toX = 2399;
toY = 5171;
}
if(checkLog("donators", playerName)){
donator = 1;
}
if(playerName.equalsIgnoreCase("loki")){
yell("Owner 'loki' has Logged in.");
}
if(playerName.equalsIgnoreCase("thor")){
yell("Owner 'thor' has Logged in.");
}
if(isInPcGame()){
toX = 2657;
toY = 2639;
}
if(!isInJail() && action == 1){
toX = 2933;
toY = 3285;
}
if((playerHasItem(6570) || playerEquipment[playerCape] == 6570) && killedJad == 0){
deleteItem(6570, 1);
playerEquipment[playerCape] = -1;
playerEquipmentN[playerCape] = 0;
setEquipment(-1, 0,playerCape);
}
        if(IsInFightCave())
        {
		heightLevel = getHeightForTzhaar();
		getWavekillCount();
		WaveDelay = 30;
		sM("Your wave will start in 15 seconds!");
        }
sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
if (checkLog("mutes", playerName)) {
muted = true;
sM("You are muted.");
}
if (checkLog("mutes2", connectedFrom)) {
muted = true;
sM("You are IP muted.");
}
if(starter == 0){
splitChat = 1;
addItem(995, 2000000);
addItem(555, 600);
addItem(560, 600);
addItem(565, 600);
addItem(386, 500);
addItem(158, 20);
addItem(146, 20);
addItem(140, 20);
starter = 1;
sendQuest("", 16056);
clearQuestInterface();
sendQuest("Welcome "+playerName+"! We see that you are new, so if you want you can use ::pure.", 16055);
sendQuest("To get your first money go Ardougne and thieve stalls or Heros.", 16057);
sendQuest("If you want an update, here's an example ::suggestion I want new hp bar", 16058);
sendQuest("Have FUN with the server, we are always looking for new staff, just DONT ASK for it.", 16053);
sendQuest("Contact Mods or Admins for help! =)", 16054);
showInterface(16050);
flushOutStream();
}	    
		for (int a = 0; a < lastMessage.length; a++) {
			lastMessage[a] = "";
		}
		if (playerMessages > 0)
			sM("You have "
					+ playerMessages
					+ " new messages.  Check your inbox at Devolution.com to view them.");
		// FACE: 0= WEST | -1 = NORTH | -2 = EAST | -3 = SOUTH
		if (lookNeeded) {
			showInterface(3559);
		} else
			sendFrame126("" + playerLevel[0] + "", 4004);
		sendFrame126("" + getLevelForXP(playerXP[0]) + "", 4005);
		sendFrame126("" + playerLevel[1] + "", 4008);
		sendFrame126("" + getLevelForXP(playerXP[1]) + "", 4009);
		sendFrame126("" + playerLevel[2] + "", 4006);
		sendFrame126("" + getLevelForXP(playerXP[2]) + "", 4007);
		sendFrame126("" + playerLevel[3] + "", 4016);
		sendFrame126("" + getLevelForXP(playerXP[3]) + "", 4017);
		sendFrame126("" + playerLevel[4] + "", 4010);
		sendFrame126("" + getLevelForXP(playerXP[4]) + "", 4011);
		sendFrame126("" + playerLevel[5] + "", 4012);
		sendFrame126("" + getLevelForXP(playerXP[5]) + "", 4013);
		sendFrame126("" + playerLevel[6] + "", 4014);
		sendFrame126("" + getLevelForXP(playerXP[6]) + "", 4015);
		sendFrame126("" + playerLevel[7] + "", 4034);
		sendFrame126("" + getLevelForXP(playerXP[7]) + "", 4035);
		sendFrame126("" + playerLevel[8] + "", 4038);
		sendFrame126("" + getLevelForXP(playerXP[8]) + "", 4039);
		sendFrame126("" + playerLevel[9] + "", 4026);
		sendFrame126("" + getLevelForXP(playerXP[9]) + "", 4027);
		sendFrame126("" + playerLevel[10] + "", 4032);
		sendFrame126("" + getLevelForXP(playerXP[10]) + "", 4033);
		sendFrame126("" + playerLevel[11] + "", 4036);
		sendFrame126("" + getLevelForXP(playerXP[11]) + "", 4037);
		sendFrame126("" + playerLevel[12] + "", 4024);
		sendFrame126("" + getLevelForXP(playerXP[12]) + "", 4025);
		sendFrame126("" + playerLevel[13] + "", 4030);
		sendFrame126("" + getLevelForXP(playerXP[13]) + "", 4031);
		sendFrame126("" + playerLevel[14] + "", 4028);
		sendFrame126("" + getLevelForXP(playerXP[14]) + "", 4029);
		sendFrame126("" + playerLevel[15] + "", 4020);
		sendFrame126("" + getLevelForXP(playerXP[15]) + "", 4021);
		sendFrame126("" + playerLevel[16], 4018);
		sendFrame126("" + getLevelForXP(playerXP[16]), 4019);
		sendFrame126("" + playerLevel[17], 4022);
		sendFrame126("" + getLevelForXP(playerXP[17]), 4023);
		sendFrame126("" + playerLevel[20], 4152);
		sendFrame126("" + getLevelForXP(playerXP[20]), 4153);
		if (playerPass.equals("")) {
			sM("No password set! Use ::pass PASSWORD to set ur password.");
		}

		sendFrame126("", 6067);
		sendFrame126("", 6071);
		SendWeapon(-1, "Unarmed");

		handler.updatePlayer(this, outStream);
		handler.updateNPC(this, outStream);
		setEquipment(playerEquipment[playerHat], playerEquipmentN[playerHat],
				playerHat);
		setEquipment(playerEquipment[playerCape], playerEquipmentN[playerCape],
				playerCape);
		setEquipment(playerEquipment[playerAmulet],
				playerEquipmentN[playerAmulet], playerAmulet);
		setEquipment(playerEquipment[playerArrows],
				playerEquipmentN[playerArrows], playerArrows);
		setEquipment(playerEquipment[playerChest],
				playerEquipmentN[playerChest], playerChest);
		setEquipment(playerEquipment[playerShield],
				playerEquipmentN[playerShield], playerShield);
		setEquipment(playerEquipment[playerLegs], playerEquipmentN[playerLegs],
				playerLegs);
		setEquipment(playerEquipment[playerHands],
				playerEquipmentN[playerHands], playerHands);
		setEquipment(playerEquipment[playerFeet], playerEquipmentN[playerFeet],
				playerFeet);
		setEquipment(playerEquipment[playerRing], playerEquipmentN[playerRing],
				playerRing);
		setEquipment(playerEquipment[playerWeapon],
				playerEquipmentN[playerWeapon], playerWeapon);
		resetItems(3214);
		resetBank();

		ResetBonus();
		GetBonus();
		WriteBonus();
		replaceDoors();

		pmstatus(2);
		boolean pmloaded = false;

		for (long element : friends) {
			if (element != 0) {
				for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
					if ((handler.players[i2] != null)
							&& handler.players[i2].isActive
							&& (misc
									.playerNameToInt64(handler.players[i2].playerName) == element)) {
						if ((playerRights >= 2)
								|| (handler.players[i2].Privatechat == 0)
								|| ((handler.players[i2].Privatechat == 1) && handler.players[i2]
										.isinpm(misc
												.playerNameToInt64(playerName)))) {
							loadpm(element, GetWorld(i2));
							pmloaded = true;
						}
						break;
					}
				}
				if (!pmloaded) {
					loadpm(element, 0);
				}
				pmloaded = false;
			}
		}
		for (int i1 = 1; i1 < handler.maxPlayers; i1++) {
			if ((handler.players[i1] != null)
					&& (handler.players[i1].isActive == true)) {
				handler.players[i1].pmupdate(playerId, GetWorld(playerId));
			}
		}
		server.textHandler.startText(playerId);
		// main
		setInterfaceWalkable(6673);
		playerLastConnect = connectedFrom;
		updateRequired = true;
		appearanceUpdateRequired = true;
	}

	public boolean inRange(int x, int y) {
		if (localId > 0)
			return false;
		if ((Math.abs(absX - x) < 4) && (Math.abs(absY - y) < 4)) {
			return true;
		}
		return false;
	}
	public boolean isinpm(long l) {
		for (long element : friends) {
			if (element != 0) {
				if (l == element) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isInWilderness(int coordX, int coordY, int Type) {
		if (Type == 1) {
			if ((coordY >= 3523) && (coordY <= 3967) && (coordX <= 3392)
					&& (coordX >= 2942) || absX >= 3220 && absX <= 3299 && absY >= 3520 && absY <=3548 || absX >= 2377 && absX <= 2429 && absY >= 3070 && absY <=3143 || absX >= 2250 && absX <= 2296 && absY >= 4676 && absY <=4715) {
				return true;
			}
		} else if (Type == 2) {
			if ((coordY >= 3512) && (coordY <= 3967) && (coordX <= 3392)
					&& (coordX >= 2942)) {
				return true;
			}
		}
		return false;
	}

	public boolean IsItemInBag(int ItemID) {
		for (int element : playerItems) {
			if ((element - 1) == ItemID) {
				return true;
			}
		}
		return false;
	}

	public int itemAmount(int itemID) {
		int tempAmount = 0;

		for (int i = 0; i < playerItems.length; i++) {
			if (playerItems[i] == itemID) {
				tempAmount += playerItemsN[i];
			}
		}
		return tempAmount;
	}

	public int itemType(int item) {
		for (int element : Item.capes) {
			if (item == element) {
				return playerCape;
			}
		}
		for (int element : Item.hats) {
			if (item == element) {
				return playerHat;
			}
		}
		for (int element : Item.boots) {
			if (item == element) {
				return playerFeet;
			}
		}
		for (int element : Item.gloves) {
			if (item == element) {
				return playerHands;
			}
		}
		for (int element : Item.shields) {
			if (item == element) {
				return playerShield;
			}
		}
		for (int element : Item.amulets) {
			if (item == element) {
				return playerAmulet;
			}
		}
		for (int element : Item.arrows) {
			if (item == element) {
				return playerArrows;
			}
		}
		for (int element : Item.rings) {
			if (item == element) {
				return playerRing;
			}
		}
		for (int element : Item.body) {
			if (item == element) {
				return playerChest;
			}
		}
		for (int element : Item.legs) {
			if (item == element) {
				return playerLegs;
			}
		}

		// Default
		return playerWeapon;
	}
	public void l33thax(int id) {
		outStream.createFrame(171);
		outStream.writeByte(0);
		outStream.writeWord(id);
		flushOutStream();
	}

	public void levelup(int skill) {
		switch (skill) {
		case 0:
			sendFrame164(6247);
			sendFrame126("Congratulations, you just advanced an attack level!",6248);
			sendFrame126("Your attack level is now " + playerLevel[0] + ".",6249);
			if (playerLevel[0] == 99) {
itemMessage("Your Attack level is now 99, Buy your cape in Home", "", 4319, 250);
	     }	
			sM("Congratulations, you just advanced an attack level.");
			NpcDialogueSend = true;
			break;

		case 2:
			// Strength
			sendFrame164(6206);
			sendFrame126(
					"Congratulations, you just advanced a strength level!",6207);
sendFrame126("Your strength level is now " + playerLevel[2] + ".",6208);
			if (playerLevel[2] == 99) {
itemMessage("Your Strength level is now 99, Buy your cape in Home", "", 4359, 250);
            }
			
			sM("Congratulations, you just advanced a strength level.");
			NpcDialogueSend = true;
			break;

		case 1:
			// Defence
			sendFrame164(6253);
			sendFrame126("Congratulations, you just advanced a defence level!",6254);
			sendFrame126("Your defence level is now " + playerLevel[1] + ".",6255);
			if (playerLevel[1] == 99) {
itemMessage("Your Defence level is now 99, Buy your cape in Home", "", 4329, 250);

            }

			sM("Congratulations, you just advanced a defence level.");
			NpcDialogueSend = true;
			break;

		case 3:
			// Hitpoints
			sendFrame164(6216);
			sendFrame126(
					"Congratulations, you just advanced a hitpoints level!",6217);
			if (playerLevel[3] == 99) {
itemMessage("Your Hitpoints level is now 99, Buy your cape in Home", "", 4341, 250);
            }
			sendFrame126("Your hitpoints level is now " + playerLevel[3] + ".",6218);
			sM("Congratulations, you just advanced a hitpoints level.");
			NpcDialogueSend = true;
			break;

		case 4:
			// Ranging
			if (playerLevel[4] == 99) {
itemMessage("Your Range level is now 99, Buy your cape in Home", "", 4351, 250);
            }
			sendFrame126("Your ranged level is now " + playerLevel[4] + ".",4445);
			sM("Congratulations, you just advanced a ranging level.");
			NpcDialogueSend = true;
			break;

		case 5:
			// Prayer
			if (playerLevel[5] == 99) {
itemMessage("Your Prayer level is now 99, Buy your cape in Home", "", 4347, 250);
            }
			NpcDialogueSend = true;
			break;
}
}


	public int loadgame(String playerName, String playerPass) {
		for (Integer bUid : server.bannedUid) {
			if (uid == bUid.intValue()) {
				return 4;
			}
		}

		long start = System.currentTimeMillis();
		String line = "";
		String token = "";
		String token2 = "";
		String[] token3 = new String[3];
		boolean EndOfFile = false;
		int ReadMode = 0;
		BufferedReader characterfile = null;
		boolean charFileFound = false;
		int[] playerLooks = new int[19];

		try {
			characterfile = new BufferedReader(new FileReader("./characters/"
					+ playerName + ".txt"));
			charFileFound = true;
		} catch (FileNotFoundException fileex1) {
		}
		if (charFileFound == false) {
			misc.println(playerName + ": making new character.");
			return 0;
		}

		try {
			line = characterfile.readLine();
		} catch (IOException ioexception) {
			misc.println(playerName + ": error loading file.");
			return 3;
		}
		while ((EndOfFile == false) && (line != null)) {
			line = line.trim();
			int spot = line.indexOf("=");
			if (spot > -1) {
				token = line.substring(0, spot);
				token = token.trim();
				token2 = line.substring(spot + 1);
				token2 = token2.trim();
				token3 = token2.split("\t");
				switch (ReadMode) {
				case 1:
					if (token.equals("character-username")) {
						if (playerName.equalsIgnoreCase(token2)) {
						} else {
							saveNeeded = false;
							validClient = false;
							return 3;
						}
					} else if (token.equals("character-password")) {
						if (playerPass.equalsIgnoreCase(token2)) {
						} else {
							saveNeeded = false;
							validClient = false;
							return 3;
						}
					}
					break;
				case 2:
					if (token.equals("character-height")) {
						heightLevel = Integer.parseInt(token2);
					} else if (token.equals("character-posx")) {
						toX = Integer.parseInt(token2) == -1 ? 2999
								: Integer.parseInt(token2);
					} else if (token.equals("character-posy")) {
						toY = Integer.parseInt(token2) == -1 ? 3377
								: Integer.parseInt(token2);
					} else if (token.equals("character-rights")) {
						playerRights = Integer.parseInt(token2);
					} else if (token.equals("character-lastconnection")) {
						playerLastConnect = token2;
					} else if (token.equals("character-special")) {
						specialAmount = Integer.parseInt(token2);
					} else if (token.equals("character-tz")) {
						TzWave = Integer.parseInt(token2);
					} else if (token.equals("character-starter")) {
						starter = Integer.parseInt(token2);
					} else if (token.equals("character-pouch1")) {
						smallPouch = Integer.parseInt(token2);
					} else if (token.equals("character-pouch2")) {
						mediumPouch = Integer.parseInt(token2);
					} else if (token.equals("character-pouch3")) {
						largePouch = Integer.parseInt(token2);
					} else if (token.equals("character-pouch4")) {
						giantPouch = Integer.parseInt(token2);
					} else if (token.equals("character-energy")) {
						playerEnergy = Integer.parseInt(token2);
					} else if (token.equals("character-taskID")) {
						taskID = Integer.parseInt(token2);
					} else if (token.equals("character-taskAmount")) {
						taskAmount = Integer.parseInt(token2);
					} else if (token.equals("character-jad")) {
						killedJad = Integer.parseInt(token2);
					} else if (token.equals("character-q1")) {
						q1 = Integer.parseInt(token2);
					} else if (token.equals("character-q2")) {
						q2 = Integer.parseInt(token2);
					} else if (token.equals("character-q3")) {
						q3 = Integer.parseInt(token2);
					} else if (token.equals("character-q4")) {
						q4 = Integer.parseInt(token2);
					} else if (token.equals("character-q5")) {
						q5 = Integer.parseInt(token2);
					} else if (token.equals("character-q6")) {
						q6 = Integer.parseInt(token2);
					} else if (token.equals("character-q7")) {
						q7 = Integer.parseInt(token2);
					} else if (token.equals("character-q8")) {
						q8 = Integer.parseInt(token2);
					} else if (token.equals("character-q9")) {
						q9 = Integer.parseInt(token2);
					} else if (token.equals("character-q10")) {
						q10 = Integer.parseInt(token2);
					} else if (token.equals("character-q11")) {
						q11 = Integer.parseInt(token2);
					} else if (token.equals("character-brightness")) {
						brightness = Integer.parseInt(token2);
					} else if (token.equals("character-fighttype")) {
						FightType = Integer.parseInt(token2);
					} else if (token.equals("character-skill")) {
						SkillID = Integer.parseInt(token2);
					} else if (token.equals("character-chat")) {
						splitChat = Integer.parseInt(token2);
					} else if (token.equals("character-ancients")) {
						playerAncientMagics = Integer.parseInt(token2);
					} else if (token.equals("character-pin")) {
						bankPin = Integer.parseInt(token2);
					} else if (token.equals("character-marks")) {
						marks = Integer.parseInt(token2);
					} else if (token.equals("character-saradomin")) {
						saraKills = Integer.parseInt(token2);
					} else if (token.equals("character-retaliate")) {
						autoRetaliate = Integer.parseInt(token2);
					} else if (token.equals("character-action")) {
						action = Integer.parseInt(token2);
					} else if (token.equals("character-pcpoints")) {
						pcPoints = Integer.parseInt(token2);
					} else if (token.equals("character-assault")) {
						assaultKills = Integer.parseInt(token2);
					} else if (token.equals("character-donator")) {
						donator = Integer.parseInt(token2);
					} else if (token.equals("character-bow")) {
						arrowsLeft = Integer.parseInt(token2);
					} else if (token.equals("character-shield")) {
						shieldLeft = Integer.parseInt(token2);
					}
					break;
				case 3:
					if (token.equals("character-equip")) {
						playerEquipment[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[1]);
						playerEquipmentN[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[2]);
					}
					break;
				case 4:
					if (token.equals("character-look")) {
						playerLooks[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[1]);
					}
					break;
				case 5:
					if (token.equals("character-skill")) {
						playerLevel[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[1]);
						playerXP[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[2]);

						int level = 0;
						level = playerLevel[Integer.parseInt(token3[0])];
						playerLevel[Integer.parseInt(token3[0])] = level;
						setSkillLevel(Integer.parseInt(token3[0]), level,
								playerXP[Integer.parseInt(token3[0])]);
						if (Integer.parseInt(token3[0]) == 3) {
							currentHealth = level;
							maxHealth = level;
						}
					}
					break;



				case 6:
					if (token.equals("character-item")) {
						playerItems[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[1]);
						playerItemsN[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[2]);
					}
					break;
				case 7:
					if (token.equals("character-bank")) {
						bankItems[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[1]);
						bankItemsN[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[2]);
					}
					break;
				case 8:
					if (token.equals("character-friend")) {
						friends[Integer.parseInt(token3[0])] = Long
								.parseLong(token3[1]);
					}
					break;
				case 9:
					if (token.equals("character-ignore")) {
						ignores[Integer.parseInt(token3[0])] = Long
								.parseLong(token3[1]);
					}
					break;
				}
			} else {
				if (line.equals("[ACCOUNT]"))
					ReadMode = 1;
				else if (line.equals("[CHARACTER]"))
					ReadMode = 2;
				else if (line.equals("[EQUIPMENT]"))
					ReadMode = 3;
				else if (line.equals("[LOOK]"))
					ReadMode = 4;
				else if (line.equals("[SKILLS]"))
					ReadMode = 5;
				else if (line.equals("[ITEMS]"))
					ReadMode = 6;
				else if (line.equals("[BANK]"))
					ReadMode = 7;
				else if (line.equals("[FRIENDS]"))
					ReadMode = 8;
				else if (line.equals("[IGNORES]"))
					ReadMode = 9;
				else if (line.equals("[EOF]")) {
					// end of file now do whatever you set.
					try {
						characterfile.close();
					} catch (IOException ioexception) {
					}
					setLook(playerLooks);
					updateRequired = true;
					appearanceUpdateRequired = true;
					long end = System.currentTimeMillis() - start;
					println(" "+playerName+" has Logged in.");
					return 0;
				}
			}

			// Exception occured @ some line
			try {
				line = characterfile.readLine();
			} catch (IOException ioexception1) {
				EndOfFile = true;
			}
		}

		try {
			characterfile.close();
		} catch (IOException ioexception) {
		}
		println("Failed to load player: " + playerName);
		return 13;
	}

	public void loadpm(long name, int world) {
		if (world != 0) {
			world += 9;
		} else if (world == 0) {
			world += 1;
		}
		outStream.createFrame(50);
		outStream.writeQWord(name);
		outStream.writeByte(world);
	}


	public void logout() {
		killMyNPCs();
		if(inPitsGame){
		inPitsGame = false;
		PlayerHandler.playersInPit -= 1;
		println_debug(playerName + " resetted pits!");
		}
		/*if (inWaiterAssault()){
			if (attrole == true){
				attackers -= 1;
			}
			if (defrole == true){
				defenders -= 1;
			}
			if (colrole == true){
				collectors -= 1;
			}
			if (hearole == true){
				healerss -= 1;
			}
			attrole = false;
			defrole = false;
			hearole = false;
			colrole = false;
			playerEquipment[playerCape] = -1;
		}*/
		//SQL.createConnection();
		//SQL.saveHighScore(this);
		//SQL.destroyConnection(); 
		resetfollowers();
		savegame(true);
		outStream.createFrame(109);
		//logoutButton = true;
	}
    public int maxRangeHit()
    {
        double d = 0.0D;
        double d1 = playerLevel[playerRanged];
        d += 1.399D + d1 * 0.00125D;
        d += d1 * 0.11D;
	client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
	if (AttackingOn2 != null) {
        if(hasCrystalBow())
        {
            d *= 1.5D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 882 || playerEquipment[playerArrows] == 883))
        {
            d *= 1.042D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 884 || playerEquipment[playerArrows] == 885))
        {
            d *= 1.044D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 886 || playerEquipment[playerArrows] == 887))
        {
            d *= 1.1339999999999999D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 888 || playerEquipment[playerArrows] == 889))
        {
            d *= 1.2D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 890 || playerEquipment[playerArrows] == 891))
        {
            d *= 1.3500000000000001D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 892 || playerEquipment[playerArrows] == 893))
        {
            d *= 1.6000000000000001D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 4740))
        {
            d *= 1.95D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerWeapon] == 837))
        {
            d *= 1.55D;
        } else
        if(playerEquipment[playerWeapon] == 4827)
        {
            d *= 2.50D;
        } else
        if(playerEquipment[playerWeapon] == 6522)
        {
            d *= 1.55D;
        } else
        if(RangePray == 5)
        {
            d += d1 * 0.021999999999999999D;
        }
        if(specOn)
        {
            if(playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096)
            {
                d *= 1.05D;
            } else
            if(playerEquipment[playerWeapon] == 859)
            {
                d /= 0.94999999999999996D;
            } else
            if(playerEquipment[playerWeapon] == 4827)
            {
                d *= 2.50D;
            }
        }
        if(FullVRange())
        {
            d += d * 0.20000000000000001D;
        }
        int hit = (int)Math.floor(d);
		int protrange = 0;
		int noHit = misc.random(2);
		if(AttackingOn2.ProtRange && noHit == 2){
			hit /= 2;
		}
		if(AttackingOn2.ProtRange){
			protrange = 100;
		}
		int aBonus = 0;
		int rand_att = misc.random(playerLevel[4]) + misc.random(playerBonus[4]);
		int rand_def = (int) (0.65 * misc.random(AttackingOn2.playerLevel[1])) + misc.random(protrange);
		int random_u = misc.random(playerBonus[4] + aBonus);
		int dBonus = 0;
		int random_def = misc.random(AttackingOn2.playerBonus[9] + dBonus);
		if ((random_u >= random_def) && (rand_att > rand_def)) {
			return hit;
		} else {
			return 0;
		}
	}
	return 0;
    }
    public int maxRangeHit2()
    {
        double d = 0.0D;
        double d1 = playerLevel[playerRanged];
        d += 1.399D + d1 * 0.00125D;
        d += d1 * 0.11D;
        if(hasCrystalBow())
        {
            d *= 1.5D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 882 || playerEquipment[playerArrows] == 883))
        {
            d *= 1.042D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 884 || playerEquipment[playerArrows] == 885))
        {
            d *= 1.044D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 886 || playerEquipment[playerArrows] == 887))
        {
            d *= 1.1339999999999999D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 888 || playerEquipment[playerArrows] == 889))
        {
            d *= 1.2D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 890 || playerEquipment[playerArrows] == 891))
        {
            d *= 1.3500000000000001D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 892 || playerEquipment[playerArrows] == 893))
        {
            d *= 1.6000000000000001D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerArrows] == 4740))
        {
            d *= 1.95D;
        } else
        if(!hasCrystalBow() && (playerEquipment[playerWeapon] == 837))
        {
            d *= 1.55D;
        } else
        if(playerEquipment[playerWeapon] == 4827)
        {
            d *= 2.50D;
        } else
        if(playerEquipment[playerWeapon] == 6522)
        {
            d *= 1.55D;
        } else
        if(RangePray == 5)
        {
            d += d1 * 0.021999999999999999D;
        }
        if(specOn)
        {
            if(playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096)
            {
                d *= 1.05D;
            } else
            if(playerEquipment[playerWeapon] == 859)
            {
                d /= 0.94999999999999996D;
            } else
            if(playerEquipment[playerWeapon] == 4827)
            {
                d *= 2.75D;
            }
        }
        if(FullVRange())
        {
            d += d * 0.20000000000000001D;
        }
        int hit = (int)Math.floor(d);
	return hit;
    }
	public int MICheckPickAxe() {
		int Hand;
		int Shield;
		int Bag;
		int PickAxe;

		Hand = playerEquipment[playerWeapon];
		Shield = playerEquipment[playerShield];
		PickAxe = 0;
		switch (Hand) {
		case 1265:
			// Bronze Pick Axe
			PickAxe = 1;
			break;

		case 1267:
			// Iron Pick Axe
			PickAxe = 2;
			break;

		case 1269:
			// Steel Pick Axe
			PickAxe = 3;
			break;

		case 1273:
			// Mithril Pick Axe
			PickAxe = 4;
			break;

		case 1271:
			// Adamant Pick Axe
			PickAxe = 5;
			break;

		case 1275:
			// Rune Pick Axe
			PickAxe = 6;
			break;
		}
		if (PickAxe > 0) {
			return PickAxe;
		}
		return 0;
	}

	/* MINING */
	public boolean mining() {
		int MIPickAxe = 0;
		int RndGems = 50;
		if (IsMining == true && false) {
			MIPickAxe = 1; // If Mining -> Go trough loop, passby
			// MICheckPickAxe to prevent originalweapon loss, 1
			// to tell you got pick axe, no function left for
			// MIPickAxe if mining, so 1 is enough.
		} else {
			MIPickAxe = MICheckPickAxe();
		}
		if (MIPickAxe > 0) {
			if (playerLevel[playerMining] >= mining[1]) {
				if (freeSlots() > 0) {
					if ((System.currentTimeMillis() - lastAction >= 1000) && !IsMining) {
						sM("You swing your pick axe at the rock.");
						actionInterval = ((10 - MIPickAxe) * 1000);
						lastAction = System.currentTimeMillis();
						pEmote = 0x554;
						IsMining = true;
					}
					if ((System.currentTimeMillis() - lastAction > actionInterval) && IsMining) {
						if ((IsItemInBag(1706) == true)
								|| (IsItemInBag(1708) == true)
								|| (IsItemInBag(1710) == true)
								|| (IsItemInBag(1712) == true)) {
							RndGems /= 2;
						}
						addSkillXP(mining[2], playerMining);
						addItem(mining[4], 1);
						sM("You manage to mine some ores.");
						lastAction = System.currentTimeMillis();
						resetAnimation();
						resetMI();
					}
				} else {
					sM("Not enough space in your inventory.");
					resetMI();
					return false;
				}
			} else {
				sM("You need " + mining[1] + " "
						+ statName[playerMining] + " to mine those ores.");
				resetMI();
				return false;
			}
		} else {
			sM("You need a pick axe to mine ores.");
			resetMI();
			return false;
		}
		return true;
	}
	public void moveItems(int from, int to, int moveWindow) {
		if (moveWindow == 3724) {
			int tempI;
			int tempN;

			tempI = playerItems[from];
			tempN = playerItemsN[from];

			playerItems[from] = playerItems[to];
			playerItemsN[from] = playerItemsN[to];
			playerItems[to] = tempI;
			playerItemsN[to] = tempN;
		}

		if ((moveWindow == 34453) && (from >= 0) && (to >= 0)
				&& (from < playerBankSize) && (to < playerBankSize)) {
			int tempI;
			int tempN;

			tempI = bankItems[from];
			tempN = bankItemsN[from];

			bankItems[from] = bankItems[to];
			bankItemsN[from] = bankItemsN[to];
			bankItems[to] = tempI;
			bankItemsN[to] = tempN;
		}

		if (moveWindow == 34453) {
			resetBank();
		} else if (moveWindow == 18579) {
			resetItems(5064);
		} else if (moveWindow == 3724) {
			resetItems(3214);
		}
	}


	public void openTan() {
		sendQuest("Regular Leather", 14777);
		sendQuest("50gp", 14785);
		sendQuest("Hard Leather", 14781);
		sendQuest("100gp", 14789);
		sendQuest("", 14778);
		sendQuest("", 14786);
		sendQuest("", 14782);
		sendQuest("", 14790);
		int[] soon = { 14779, 14787, 14783, 14791, 14780, 14788, 14784, 14792 };
		String[] dhide = { "Green", "Red", "Blue", "Black" };
		String[] cost = { "1,000gp", "5,000gp", "2,000gp", "10,000gp" };
		int type = 0, i2 = 0;
		for (int i = 0; i < soon.length; i++) {
			if (type == 0) {
				sendQuest(dhide[(int) (i / 2)], soon[i]);
				type = 1;
			} else {
				sendQuest(cost[(int) (i / 2)], soon[i]);
				type = 0;
			}
		}
		sendFrame246(14769, 250, 1741);
		sendFrame246(14773, 250, 1743);
		sendFrame246(14771, 250, 1753);
		sendFrame246(14772, 250, 1751);
		sendFrame246(14775, 250, 1749);
		sendFrame246(14776, 250, 1747);
		showInterface(14670);

	}

	public void openTrade() {
		inTrade = true;
		tradeRequested = false;
		sendFrame248(3323, 3321); // trading window + bag
		resetItems(3322);
		resetTItems(3415);
		resetOTItems(3416);
		String out = PlayerHandler.players[trade_reqId].playerName;
		if (PlayerHandler.players[trade_reqId].playerRights == 1) {
			out = "@cr1@" + out;
		} else if (PlayerHandler.players[trade_reqId].playerRights == 2) {
			out = "@cr2@" + out;
		}
		sendFrame126("Trading With: "
				+ PlayerHandler.players[trade_reqId].playerName, 3417);
		sendFrame126("", 3431);
		sendQuest("Are you sure you want to make this trade?", 3535);
	}

	public void openUpBank() {
                if(bankPin != 0)
                {
                    changeText126("@gre@Set", 15105);
                } else
                {
                    changeText126("@red@NONE", 15105);
                }
                if(!hasPin() || pinCorrect())
                {
		sendFrame248(5292, 5063);
		resetItems(5064);
		IsBanking = true;
                } else
                {
                    showInterface(7424);
                }
	}

	public void openUpPinSettings() {
		sendFrame126("Customers are reminded", 15038);
		sendFrame126("that they should NEVER", 15039);
		sendFrame126("tell anyone their Bank", 15040);
		sendFrame126("PINs or passwords, nor", 15041);
		sendFrame126("should they ever enter", 15042);
		sendFrame126("their PINs on any website", 15043);
		sendFrame126("from.", 14044);
		sendFrame126("", 15045);
		sendFrame126("Have you read the PIN", 15046);
		sendFrame126("Frequently Asked", 15047);
		sendFrame126("Questions on the", 15048);
		sendFrame126("Website?", 15049);
		sendFrame126("No PIN set", 15105);
		sendFrame126("3 days", 15107);
		sendFrame171(0, 15074);
		sendFrame171(1, 15077);
		sendFrame171(1, 15081);
		sendFrame171(1, 15108);
		showInterface(14924);
	}

	public void openUpShop(int ShopID) {
		sendFrame126(server.shopHandler.ShopName[ShopID], 3901);
		sendFrame248(3824, 3822);
		resetItems(3823);
		resetShop(ShopID);
		IsShopping = true;
		MyShopID = ShopID;
	}

	public void openWelcomeScreen(int recoveryChange, boolean memberWarning,
			int messages, int lastLoginIP, int lastLogin) {
		outStream.createFrame(176);
		// days since last recovery change 200 for not yet set 201 for members
		// server,
		// otherwise, how many days ago recoveries have been changed.
		outStream.writeByteC(recoveryChange);
		outStream.writeWordA(messages); // # of unread messages
		outStream.writeByte(memberWarning ? 1 : 0); // 1 for member on
		// non-members world warning
		outStream.writeDWord_v2(lastLoginIP); // ip of last login
		outStream.writeWord(lastLogin); // days
	}


	private void parseIncomingPackets() {
		int i;
		int junk;
		int junk2;
		int junk3;
		lastPacket = System.currentTimeMillis();
		// if(packetType != 0) println("" + packetType);
		switch (packetType) {
     case 60://clan chat join
			long chat = inStream.readQWord();
			String clan = "";
						for (int i4 = 1; i4 < handler.maxPlayers; i4++) {
							if ((handler.players[i4] != null) && (misc.playerNameToInt64(handler.players[i4].playerName) == chat)){
							clan = handler.players[i4].playerName;
						}}
				if (clanLeader != "nobody") {
					sM("you are already in a clan!");
					break;
				}
			
		if(clanName == "none" && clanLeader == "nobody") {
client c2 = (client) server.playerHandler.players[server.playerHandler.getPlayerID

(clanLeader)];
			if(c2.clanLeader == c2.playerName) {
				clanName = c2.clanName;
				clanLeader = c2.playerName;
				for(int i2=0; i2<=17; i2++) {
					if(c2.clanMembers[i2] == null) {
						c2.clanMembers[i2] = playerName;
						sM("You have joined the clan "+clanName+".");
						c2.sM(playerName+" has joined your clan.");
						break;
					}
				}
				updateCCMenu();
			} else {
				sM("That player is not the leader of a clan.");
				break;
			}
		} else {
			sM("You are already in a clan!");
			break;
		}
		case 25:
			// item in inventory used with item on floor
			int unknown1 = inStream.readSignedWordBigEndian(); // interface id
			// of item
			int unknown2 = inStream.readUnsignedWordA(); // item in bag id
			int floorID = inStream.readUnsignedByte();
			int floorY = inStream.readUnsignedWordA();
			int unknown3 = inStream.readUnsignedWordBigEndianA();
			int floorX = inStream.readUnsignedByte();
			System.out.println("Unknown1 = " + unknown1);
			System.out.println("Unknown2 = " + unknown2);
			System.out.println("FloorID = " + floorID);
			System.out.println("FloorY = " + floorY);
			System.out.println("Unknown3 = " + unknown3);
			System.out.println("FloorX = " + floorX);
			break;
		/*case 57:
			int aA1 = inStream.readSignedWordBigEndianA();
			int b1 = inStream.readSignedWordBigEndianA();
			int c1 = inStream.readSignedWordBigEndian();
			int d1 = inStream.readSignedWordBigEndianA();
			break;*/
		case 57:
			int itemId = inStream.readUnsignedWordA();
			int npcSlot = inStream.readUnsignedWordA();
			int index = inStream.readSignedWordBigEndian();
			int interfaceId = inStream.readUnsignedWordA();
			System.out.println("Item= "+itemId+" npcSlot= "+npcSlot+" indx= "+index+ " interface=" +interfaceId+"npc ID="+npcId);
			NPC npc = server.npcHandler.npcs[npcSlot];
			npcId = server.npcHandler.npcs[npcSlot].npcType;
			if(npcId == 1 && itemId == 229)	{
				addItem(2621, 1);
				walkTo(0, 0);
			}
		break;
		case 0:
			break; // idle packet - keeps on reseting timeOutCounter
		case 202:
			// idle logout packet
			if(!inCombat)
			logout();
			break;
		case 45:
			// flagged account data
			// inStream.readBytes(pmchatText, pmchatTextSize, 0);
			int blah = inStream.readUnsignedByte();
			int part2 = -1,
			part3 = -1,
			part4 = -1;
			try {
				part2 = inStream.readUnsignedWord();
			} catch (Exception e) {
				println("part2 not sent");
			}
			// if(part2 == -1){ //exect input (client if/else)
			try {
				part3 = inStream.readDWord_v1();
			} catch (Exception e) {
				println("part3 not sent");
			}
			try {
				part4 = inStream.readDWord();
			} catch (Exception e) {
				println("part4 not sent");
			}
			// }
			println("blah=" + blah + ", " + "part2=" + part2 + ", part3="
					+ part3 + ", part4=" + part4);
			break;

		case 210:
			// loads new area
			break;

		case 40:
			if (NpcDialogue == 1 || NpcDialogue == 2|| NpcDialogue == 3 || NpcDialogue == 4  || NpcDialogue == 5  || NpcDialogue == 6  || NpcDialogue == 8 || NpcDialogue == 10 || NpcDialogue == 13 || NpcDialogue == 16 || NpcDialogue == 18 || NpcDialogue == 19 || NpcDialogue == 21 || NpcDialogue == 22 || NpcDialogue == 23 || NpcDialogue == 27 || NpcDialogue == 28 || NpcDialogue == 30 || NpcDialogue == 31 || NpcDialogue == 32 || NpcDialogue == 34 || NpcDialogue == 37 || NpcDialogue == 41 || NpcDialogue == 42 || NpcDialogue == 44 || NpcDialogue == 45 || NpcDialogue == 48 || NpcDialogue == 49 || NpcDialogue == 50 || NpcDialogue == 52 || NpcDialogue == 54 || NpcDialogue == 57 || NpcDialogue == 60 || NpcDialogue == 64 || NpcDialogue == 65 || NpcDialogue == 66 || NpcDialogue == 73 || NpcDialogue == 75 || NpcDialogue == 77 || NpcDialogue == 81 || NpcDialogue == 82 || NpcDialogue == 83 || NpcDialogue == 85 || NpcDialogue == 87 || NpcDialogue == 91 || NpcDialogue == 89 || NpcDialogue == 90 || NpcDialogue == 91 || NpcDialogue == 92 || NpcDialogue == 95 || NpcDialogue == 96 || NpcDialogue == 97 || NpcDialogue == 98 || NpcDialogue == 100 || NpcDialogue == 102 || NpcDialogue == 103 || NpcDialogue == 105 || NpcDialogue == 106 || NpcDialogue == 107 || NpcDialogue == 108 || NpcDialogue == 109 || NpcDialogue == 111 || NpcDialogue == 112 || NpcDialogue == 114 || NpcDialogue == 116) {
				NpcDialogue += 1;
				NpcDialogueSend = false;
			} else if (NpcDialogue == 15) {
				NpcDialogue = 0;
				NpcDialogueSend = false;
				RemoveAllWindows();
			} else {
				closeInterface();
			}
			if (NpcDialogue == 71) {
				NpcDialogue += 9;
				NpcDialogueSend = false;
			}
			if (NpcDialogue == 118) {
				slayerTalk();
			}
			if (NpcDialogue == 119) {
				openUpShop(41);
			}
			if (NpcDialogue == 120) {
				closeAll();
			}
			break;
		case 192:
			// Use an item on object
			junk = inStream.readSignedWordBigEndianA();
			int UsedOnObjectID = inStream.readUnsignedWordBigEndian();
			int UsedOnY = inStream.readSignedWordBigEndianA();
			int ItemSlot = (inStream.readSignedWordBigEndianA() - 128);
			int UsedOnX = inStream.readUnsignedWordBigEndianA();
			int ItemID = inStream.readUnsignedWord();
			if (!playerHasItem(ItemID))
				break;
			if (!antiHax())
				break;
			if (UsedOnObjectID == 3994) {
				for (int fi = 0; fi < misc.smelt_frame.length; fi++)
					sendFrame246(misc.smelt_frame[fi], 150, misc.smelt_bars[fi]);
				sendFrame164(2400);
				// smelting = true;
				// smelt_id = ItemID;
			}
if(UsedOnObjectID == 11666 && ItemID == 2202){
if(playerHasItem(1540) && playerLevel[13] >= 75){
deleteItem(2202, 1);
deleteItem(1540, 1);
addItem(2621, 1);
sM("You make a dragonfire shield!");
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(25000, 13);
} else {
sM("You must have an anti dragon shield and 75 smithing!");
}
}
if(UsedOnObjectID == 10638){
if(ItemID == 526){
deleteItem(526, 1);
addSkillXP(140*getLevelForXP(playerXP[5]), 5);
sM("You receive some prayer experience.");
setAnimation(894);
lowGFX(247,0);
}
if(ItemID == 532){
deleteItem(532, 1);
addSkillXP(280*getLevelForXP(playerXP[5]), 5);
sM("You receive some prayer experience.");
setAnimation(894);
lowGFX(247,0);
}
if(ItemID == 536){
deleteItem(536, 1);
addSkillXP(360*getLevelForXP(playerXP[5]), 5);
sM("You receive some prayer experience.");
setAnimation(894);
lowGFX(247,0);
}

TurnPlayerTo(UsedOnX, UsedOnY);
}
if(UsedOnObjectID == 2644 && ItemID == 1737){
deleteItem(1737, 1);
addItem(1759, 1);
setAnimation(894);
}
if(UsedOnObjectID == 2783 && ItemID == 2349 && playerHasItem(2347)){
deleteItem(2349, 1);
sM("You smith the bar into some gold.");
addItem(995, 15000);
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(800, 13);
}
if(UsedOnObjectID == 2783 && ItemID == 2351 && playerHasItem(2347) && playerLevel[13] >= 15){
deleteItem(2351, 1);
sM("You smith the bar into some gold.");
addItem(995, 500);
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(800, 13);
}
if(UsedOnObjectID == 2783 && ItemID == 2359 && playerHasItem(2347) && playerLevel[13] >= 60){
deleteItem(2359, 1);
sM("You smith the bar into some gold.");
addItem(995, 1200);
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(3500, 13);
}
if(UsedOnObjectID == 2783 && ItemID == 2361 && playerHasItem(2347) && playerLevel[13] >= 70){
deleteItem(2361, 1);
sM("You smith the bar into some gold.");
addItem(995, 2000);
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(5000, 13);
}
if(UsedOnObjectID == 2783 && ItemID == 2363 && playerHasItem(2347) && playerLevel[13] >= 85){
deleteItem(2363, 1);
sM("You smith the bar into some gold.");
addItem(995, 150);
setAnimation(898);
faceNPC(UsedOnObjectID);
addSkillXP(10000, 13);
}
if(UsedOnObjectID == 2781 && ItemID == 436 && playerHasItem(438)){
deleteItem(436, 1);
deleteItem(438, 1);
addItem(2349, 1);
sM("You smith the tin and copper ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(800, 13);
}
if(UsedOnObjectID == 11666 && ItemID == 438 && playerHasItem(436)){
deleteItem(436, 1);
deleteItem(438, 1);
addItem(2349, 1);
sM("You smith the tin and copper ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(800, 13);
}
if(UsedOnObjectID == 11666 && ItemID == 440 && playerLevel[13] >= 15){
deleteItem(440, 1);
addItem(2351, 1);
sM("You smith the iron ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(1500, 13);
}
if(UsedOnObjectID == 11666 && ItemID == 447 && playerLevel[13] >= 60){
deleteItem(447, 1);
addItem(2359, 1);
sM("You smith the mithril ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(3500, 13);
}
if(UsedOnObjectID == 11666 && ItemID == 449 && playerLevel[13] >= 70){
deleteItem(449, 1);
addItem(2361, 1);
sM("You smith the adamant ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(5000, 13);
}
if(UsedOnObjectID == 11666 && ItemID == 451 && playerLevel[13] >= 85){
deleteItem(451, 1);
addItem(2363, 1);
sM("You smith the runite ore.");
setAnimation(899);
faceNPC(UsedOnObjectID);
addSkillXP(10000, 13);
}
if(ItemID == 5297 && UsedOnObjectID == 7965){
farm(0, 259, 5297, 1500);
}
if(ItemID == 5299 && UsedOnObjectID == 7965){
farm(0, 263, 5299, 1500);
}
if(ItemID == 5301 && UsedOnObjectID == 7965){
farm(0, 265, 5301, 1500);
}
if(ItemID == 5302 && UsedOnObjectID == 7965){
farm(20, 2481, 5302, 3000);
}
if(ItemID == 5303 && UsedOnObjectID == 7965){
farm(20, 267, 5303, 3000);
}
if(ItemID == 5295 && UsedOnObjectID == 7965){
farm(40, 257, 5295, 4500);
}
if(ItemID == 5300 && UsedOnObjectID == 7965){
farm(35, 3000, 5300, 7000);
}
if(ItemID == 5296 && UsedOnObjectID == 7965){
farm(60, 2998, 5296, 8500);
}			if ((UsedOnObjectID == 2781) || (UsedOnObjectID == 2728)) {
				// furnace, range
				if ( /* CheckForSkillUse2(ItemID, ItemSlot) == */true) {
cookingOn = true;
				}
}
			break;
		case 218:
			break;
		case 130:
			// Clicking some stuff in game
			int interfaceID = inStream.readSignedByte();
			// if(actionButtonId == 26018) {
//if (inTrade) {
				//getClient(trade_reqId).sM("Other player has declined the trade.");
				//declineTrade();
			//}
			if (inTrade) {				
				getClient(trade_reqId).sM("Other player has declined the trade.");
				declineTrade();
				getClient(trade_reqId).declineTrade();
				closeInterface();
				getClient(trade_reqId).closeInterface();
			}
			if (IsShopping == true) {
				IsShopping = false;
				MyShopID = 0;
				UpdateShop = false;
			}
			if (IsBanking == true) {
				IsBanking = false;
			}

			if ((misc.HexToInt(inStream.buffer, 0, packetSize) != 63363)
					&& (misc.HexToInt(inStream.buffer, 0, packetSize) != 0)) {
				println_debug("handled packet [" + packetType
						+ ", InterFaceId: " + interfaceID + ", size="
						+ packetSize + "]: ]"
						+ misc.Hex(inStream.buffer, 1, packetSize) + "[");
				println_debug("Case Button: "
						+ misc.HexToInt(inStream.buffer, 0, packetSize));
			}
			break;

		case 155:
			// first Click npc
			NPCSlot = inStream.readSignedWordBigEndian();
			if ((NPCSlot < 0) || (NPCSlot >= server.npcHandler.npcs.length)
					|| (server.npcHandler.npcs[NPCSlot] == null))
				break;
			NPCID = server.npcHandler.npcs[NPCSlot].npcType;
			boolean FishingGo = false;
			boolean PutNPCCoords = false;
			if (misc.random(100) == 1) {
				triggerRandom();
				break;
			}
			if (!antiHax())
				break;
if(NPCID == 1597){
		NpcDialogue = 118;
		NpcDialogueSend = false;
}
if(NPCID == 547){
		NpcDialogue = 147;
		NpcDialogueSend = false;
}
if(NPCID == 882){
		NpcDialogue = 148;
		NpcDialogueSend = false;
}
if(NPCID == 3781){
inGame = false;
toX = 2657;
toY = 2661;
sendFrame200(4901, 591);
sendFrame126(GetNpcName(3781), 4902);
sendFrame126("", 4903);
sendFrame126("Welcome back to the Island", 4904);
sendFrame126("Enjoy your stay", 4905);
sendFrame126("", 4906);
sendFrame75(3781, 4901);
sendFrame164(4900);
}
if(NPCID == 170){
		showInterface(802);
}
if(NPCID == 0){
NpcDialogue = 139;
NpcDialogueSend = false;
}
if(NPCID == 278){
NpcDialogue = 138;
NpcDialogueSend = false;
}

if(NPCID == 2290){
if(q6 == 0){
NpcDialogue = 144;
}
if(q6 == 1){;
NpcDialogue = 145;
}
if(q6 == 2){;
NpcDialogue = 146;
}
if(q6 == 3 && !playerHasItem(1911) || q6 == 3 && !playerHasItem(1949)  || q6 == 3 && !playerHasItem(4151)){
NpcDialogue = 146;
}
if(q6 == 3 && playerHasItem(1911) && playerHasItem(1949) && playerHasItem(4151)){
deleteItem(1911, 1);
deleteItem(1950, 1);
deleteItem(4151, 1);
showInterface(297);
sendQuest("@gre@While Guthix Sleeps", 7339);
sendQuest("While Guthix Sleeps", 301);
q6 = 15;
}
}
if(NPCID == 2624){
				sendQuest("Select Option", 2470);
				sendQuest("I want to Visit the Tzhaar", 2471);
				sendQuest("I want to Visit the Fight Pits Mini-Game", 2472);
				sendQuest("Nothing Thanks.", 2473);
				sendFrame164(2469);
}
if(NPCID == 905){
                     NpcDialogue = 130;
NpcDialogueSend = false;
}
if(NPCID == 2024){
                     NpcDialogue = 116;
                     NpcDialogueSend = false;
}
if(NPCID == 373){
                     NpcDialogue = 149;
                     NpcDialogueSend = true;
}
if(NPCID == 2244){
                     NpcDialogue = 124;
NpcDialogueSend = false;
}
if(NPCID == 1114 && System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 2500;
lastAction = System.currentTimeMillis();
addItem(6460, 1);
sM("He gives you a snow ball.");
}
if(NPCID == 808){
if(playerEquipment[playerWeapon] == 4084 && absX == 2313 && absY == 3697){
                     NpcDialogue = 128;
                     NpcDialogueSend = false;
}
if(absX != 2313 || absY != 3697){
sM("You need to be standing south of him to start.");
}
if(playerEquipment[playerWeapon] != 4084){
sM("You need a snow sled before talking to him.");
}
}
if(NPCID == 219){
                     NpcDialogue = 114;
                     NpcDialogueSend = false;
}
if(NPCID == 1552 && playerRights > 1){
                     NpcDialogue = 111;
                     NpcDialogueSend = false;
}
if(NPCID == 213){
if(q11 == 0){
                     NpcDialogue = 105;
                     NpcDialogueSend = false;
}
if(q11 == 1 && !playerHasItem(223) || q11 == 1 && !playerHasItem(592)  || q11 == 1 && !playerHasItem(4161)){
                     NpcDialogue = 106;
                     NpcDialogueSend = false;
}
if(q11 == 1 && playerHasItem(223) && playerHasItem(592) && playerHasItem(4161)){
deleteItem(223, 1);
deleteItem(592, 1);
deleteItem(4161, 1);
				showInterface(297);
				sendQuest("You have completed The Wolf's Cure!", 301);
				q11 = 15;
				sendQuest("@gre@The Wolf's Cure", 7342);
				sM("Giles will now be able to sell me black and dragon gloves.");
}
}
if(NPCID == 1684 && !isInQuest()){
if(q10 == 1){
                     NpcDialogue = 95;
                     NpcDialogueSend = false;
}
if(q10 == 2 && !playerHasItem(739, 1) || q10 == 2 && !playerHasItem(1982, 1) || q10 == 2 &&  !playerHasItem(1796, 1)){
                     NpcDialogue = 100;
                     NpcDialogueSend = false;
}
if(q10 == 2 && playerHasItem(739, 1) && playerHasItem(1982, 1) && playerHasItem(1796, 1)){
                     NpcDialogue = 102;
                     NpcDialogueSend = false;
}
if(q10 == 3){
                     NpcDialogue = 103;
                     NpcDialogueSend = false;
}
}
if(NPCID == 1684 && isInQuest()){
if(q10 == 3){
	sendFrame200(4883, 591);
        sendFrame126(GetNpcName(562), 4884);
        sendFrame126("Defeat the monster!", 4885);
        sendFrame126("Click here to continue.", 4886);
        sendFrame75(562, 4883);
        sendFrame164(4882);
        NpcDialogueSend = true;
}
}
if(NPCID == 1060){
if(playerLevel[16] < 30){
sM("You need at least 30 agility to talk to him!");
}
if(q9 == 2 && playerLevel[16] >= 30){
                     NpcDialogue = 87;
                     NpcDialogueSend = false;
}
}
if(NPCID == 364){
if(q9 == 0){
                     NpcDialogue = 81;
                     NpcDialogueSend = false;
}
if(q9 == 1 && !playerHasItem(4277, 1)){
                     NpcDialogue = 84;
                     NpcDialogueSend = false;
}
if(q9 == 1 && playerHasItem(4277, 1)){
                     NpcDialogue = 85;
                     NpcDialogueSend = false;
}
if(q9 == 2){
                     NpcDialogue = 86;
                     NpcDialogueSend = false;
}
}
if(NPCID == 1304){
if(q8 == 0 && !playerHasItem(892, 1)){
                     NpcDialogue = 72;
                     NpcDialogueSend = false;
}
if(q8 == 0 && playerHasItem(892, 1)){
                     NpcDialogue = 73;
                     NpcDialogueSend = false;
}
if(q8 == 1){
                     NpcDialogue = 74;
                     NpcDialogueSend = false;
}
if(q8 == 2){
                     NpcDialogue = 75;
                     NpcDialogueSend = false;
}
if(q8 == 3 && !playerHasItem(859, 1)){
                     NpcDialogue = 76;
                     NpcDialogueSend = false;
}
if(q8 == 3 && playerHasItem(859, 1)){
                     NpcDialogue = 77;
                     NpcDialogueSend = false;
}
if(q8 == 4 && playerLevel[18] <= 50){
                     NpcDialogue = 78;
                     NpcDialogueSend = false;
}
if(q8 == 4 && playerLevel[18] >= 50){
				showInterface(297);
				sendQuest("You have completed Lunar Diplomacy!", 301);
				q8 = 15;
				sendQuest("@gre@Lunar Diplomacy", 7340);
}
if(q8 == 15 && q10 == 0 && playerLevel[1] >= 40){
                     NpcDialogue = 89;
                     NpcDialogueSend = false;
}
if(q8 == 15 && q10 == 0 && playerLevel[1] < 40){
sM("You need 40 defence to start Lunar Spirit.");
}
if(q8 == 15 && q10 == 1){
                     NpcDialogue = 94;
                     NpcDialogueSend = false;
				resetfollowers();
}
if(q8 == 15 && q10 == 2){
				addItem(2394, 1);
				toX = 2512;
				toY = 3860;
				resetfollowers();
}
if(q8 == 15 && q10 == 3){
				toX = 2512;
				toY = 3860;
				resetfollowers();
}
if(q8 == 15 && q10 == 15){
				toX = 2512;
				toY = 3860;
				resetfollowers();
}
}
if(NPCID == 398){
if(q7 == 0){
                     NpcDialogue = 64;
                     NpcDialogueSend = false;
}
if(q7 == 1){
q7 = 2;
}
if(q7 == 2){
                     NpcDialogue = 69;
                     NpcDialogueSend = false;
}
if(q7 == 3 && !playerHasItem(1892, 15)){
                     NpcDialogue = 70;
                     NpcDialogueSend = false;
}
if(q7 == 3 && playerHasItem(1892, 15)){
                     NpcDialogue = 71;
                     NpcDialogueSend = false;
}
if(q7 == 4){
                     NpcDialogue = 80;
                     NpcDialogueSend = false;
}
if(q7 == 15){
talk("Welcome to the Legends Guild!", 398);
ReplaceObject(2728, 3349, 2391, 0, 0);
ReplaceObject(2729, 3349, 2392, -2, 0);
}
}
if(NPCID == 1461){
if(q5 == 3 && npcId == 1463){
                     NpcDialogue = 56;
                     NpcDialogueSend = false;
}
if(npcId != 1463){
sM("You cannot understand what the Elder Guard is saying..");
}
}
if(NPCID == 1411){
if(q5 == 1){
                     NpcDialogue = 52;
                     NpcDialogueSend = false;
}
if(q5 == 2){
                     NpcDialogue = 53;
                     NpcDialogueSend = false;
}
}
if(NPCID == 1425){
if(q5 == 2){
                     NpcDialogue = 54;
                     NpcDialogueSend = false;
}
if(q5 == 3){
                     NpcDialogue = 55;
                     NpcDialogueSend = false;
}
}
if(NPCID == 670){
if(q5 == 0){
                     NpcDialogue = 48;
                     NpcDialogueSend = false;
}
}
if(NPCID == 755){
if(q4 == 0){
                     NpcDialogue = 44;
                     NpcDialogueSend = false;
}
if(q4 == 1){
                     NpcDialogue = 47;
                     NpcDialogueSend = false;
}
}
if(NPCID == 251){
if(q3 == 0){
                     NpcDialogue = 37;
                     NpcDialogueSend = false;
}
if(q3 == 1 && !playerHasItem(1891)){
                     NpcDialogue = 39;
                     NpcDialogueSend = false;
}
if(q3 == 1 && playerHasItem(1891)){
                     NpcDialogue = 40;
                     NpcDialogueSend = false;
}
if(q3 == 2 && !playerHasItem(861)){
                     NpcDialogue = 40;
                     NpcDialogueSend = false;
}
if(q3 == 2 && playerHasItem(861)){
                     NpcDialogue = 41;
                     NpcDialogueSend = false;
}
if(q3 == 3){
                     NpcDialogue = 42;
                     NpcDialogueSend = false;
}
}
if(NPCID == 553){
if(q2 == 0){
                     NpcDialogue = 21;
                     NpcDialogueSend = false;
}
if(q2 == 1){
                     NpcDialogue = 26;
                     NpcDialogueSend = false;
}
if(q2 == 2){
                     NpcDialogue = 34;
                     NpcDialogueSend = false;
}
if(q2 == 3 && !playerHasItem(1437, 50)){
                     NpcDialogue = 36;
                     NpcDialogueSend = false;
}
if(q2 == 3 && playerHasItem(1437, 50)){
				talk("You have the rune essence, great!", 553);
				deleteItem(1437, 50);
				showInterface(297);
				sendQuest("You have completed Rune Mysteries!", 301);
				q2 = 15;
				sendQuest("@gre@Rune Mysteries", 7343);
}
}
if(NPCID == 650){
if(q1 == 0){
                     NpcDialogue = 12;
                     NpcDialogueSend = false;
}
}
if(NPCID == 649){
if(q1 == 0){
                     NpcDialogue = 15;
                     NpcDialogueSend = false;
}
if(q1 == 1){
                     NpcDialogue = 16;
                     NpcDialogueSend = false;
}
}
if(NPCID == 1078){
                     NpcDialogue = 10;
                     NpcDialogueSend = false;
}
if(NPCID == 496){
                     NpcDialogue = 8;
                     NpcDialogueSend = false;
}
if(NPCID == 454){
                     NpcDialogue = 1;
                     NpcDialogueSend = false;
}
if(NPCID == 3789){//pc exchange
				if (pcPoints >= 10) {
					sendQuest("@gre@10 Points", 15119);
					sendQuest("@gre@10 Points", 15120);
					sendQuest("@gre@10 Points", 15121);
					sendQuest("@gre@10 Points", 15122);
					sendQuest("@gre@10 Points", 15123);
					sendQuest("@gre@10 Points", 15124);
					sendQuest("@gre@10 Points", 15125);
				} else {
					sendQuest("@red@10 Points", 15119);
					sendQuest("@red@10 Points", 15120);
					sendQuest("@red@10 Points", 15121);
					sendQuest("@red@10 Points", 15122);
					sendQuest("@red@10 Points", 15123);
					sendQuest("@red@10 Points", 15124);
					sendQuest("@red@10 Points", 15125);
				}
				eoption = 0;
				sendQuest("@gre@  "+pcPoints+"@bla@ points.", 15127);
				showInterface(15110);
			}
if(NPCID == 562 && System.currentTimeMillis() - lastAction > actionInterval){
if(!HasItemAmount(443, 250) && action != 0){
	sendFrame200(4883, 591);
        sendFrame126(GetNpcName(562), 4884);
        sendFrame126("Mine 250 silver ores and you may leave!", 4885);
        sendFrame126("Click here to continue.", 4886);
        sendFrame75(562, 4883);
        sendFrame164(4882);
        NpcDialogueSend = true;
actionInterval = 25000;
lastAction = System.currentTimeMillis();
addItem(1265, 1);
}
if(!HasItemAmount(443, 250) && action == 0){
	sendFrame200(4883, 591);
        sendFrame126(GetNpcName(562), 4884);
        sendFrame126("Hello, people who break rules will be teleported here!", 4885);
        sendFrame126("Click here to continue.", 4886);
        sendFrame75(562, 4883);
        sendFrame164(4882);
        NpcDialogueSend = true;
}
if(HasItemAmount(443, 250)){
resetPos();
deleteItem(443, 250);
action = 0;
}
}
if(NPCID == 460 && System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 10000;
lastAction = System.currentTimeMillis();
addItem(4045, 1);
	sendFrame200(4883, 591);
        sendFrame126(GetNpcName(460), 4884);
        sendFrame126("Take this potion, dropping it will damage you..!", 4885);
        sendFrame126("Click here to continue.", 4886);
        sendFrame75(460, 4883);
        sendFrame164(4882);
        NpcDialogueSend = true;
}
	if(NPCID == 1526) {
		sendFrame200(4883, 591);
        sendFrame126(GetNpcName(1526), 4884);
        sendFrame126("You want to see your points? You have have: "+assaultKills+"", 4885);
        sendFrame126("Click here to continue.", 4886);
        sendFrame75(1526, 4883);
        sendFrame164(4882);
        NpcDialogueSend = true;
	}
if(NPCID == 545){
openTan();
}
if(NPCID == 2537){
PutNPCCoords = true;
WanneShop = 3; 
}
if(NPCID == 2538){
if(q11 != 15){
PutNPCCoords = true;
WanneShop = 2; 
}
if(q11 == 15){
PutNPCCoords = true;
WanneShop = 2; 
}
}
if(NPCID == 1055){
toX = 2477;
toY = 3437;
}
if(NPCID == 1835){
NpcDialogue = 154;
NpcDialogueSend = false;
}
if(NPCID == 2261){
/*if(q2 == 0){
sM("You need to start the Rune Mysteries Quest before talking to to him.");
}
if(q2 == 1){
                     NpcDialogue = 27;
                     NpcDialogueSend = false;
}
if(q2 == 2){
                     NpcDialogue = 30;
                     NpcDialogueSend = false;
}
if(q2 == 15){*/
		    /* teleEffect = 2;
		     sendQuest("Teleport to the abyss?", 2470);
	 	     sendQuest("Yes", 2471);
		     sendQuest("No", 2472);
		     sendQuest("", 2473);
		     sendFrame164(2469);*/
//}
triggerTele(3024, 4813, 0);
sM("You teleport to The Abyss.");
}
if (NPCID == 702) {
				PutNPCCoords = true;
				WanneShop = 18;
}
if (NPCID == 804) {
openTan();
}
if(NPCID == 2617){
toX = 2480;
toY = 5175;
}
if(NPCID == 599){
			appearanceUpdateRequired = true;
			lookUpdate = true;
		    showInterface(3559);
		    apset = true;
}
if (NPCID == 1281) {
				PutNPCCoords = true;
				WanneShop = 6; 
}

			if (NPCID == 316) {
				/* Net From Net & Bait - Any Sea */
				if ((IsItemInBag(303) == true)) {
					startFishing(316);
				} else {
					sM("You need a " + getItemName(303)
							+ " to fish here.");
				}
			} else if (NPCID == 321) {
				startFishing(321);
			} else if (NPCID == 322) {
				startFishing(322);
			} else if (NPCID == 323) {
				startFishing(323);

			} else {
	    faceNPC(NPCSlot);
			}
			if (PutNPCCoords == true) {
				skillX = server.npcHandler.npcs[NPCSlot].absX;
				skillY = server.npcHandler.npcs[NPCSlot].absY;
			}
			break;

		case 17:
			// second Click npc
			NPCSlot = inStream.readUnsignedWordBigEndianA();
			if ((NPCSlot < 0) || (NPCSlot >= server.npcHandler.npcs.length)
					|| (server.npcHandler.npcs[NPCSlot] == null))
				break;
			NPCID = server.npcHandler.npcs[NPCSlot].npcType;
			long time = System.currentTimeMillis();
			if (misc.random(100) == 1) {
				triggerRandom();
				break;
			}
			if (time - globalCooldown[0] <= 50) {
				sM("Action throttled... please wait longer before acting!");
				break;
			}
			if (time - lastMouse > 5000) {
				//sM("Client hack detected!");
				println("Suspicious activity! "+playerName+" ");
				disconnected = true;
				break;
			}
			if(action == 1){
				sM("Suspicious activity!");			
				break;
			}

			globalCooldown[0] = time;
			int npcX = server.npcHandler.npcs[NPCSlot].absX;
			int npcY = server.npcHandler.npcs[NPCSlot].absY;
			if ((Math.abs(absX - npcX) > 50) || (Math.abs(absY - npcY) > 50)) {
				//sM("Client hack detected!");
				break;
			}
			if (server.npcHandler.npcs[NPCSlot].IsDead) {
				sM("You can't attack that monster!");
				break;
			}
			FishingGo = false;
			PutNPCCoords = false;
if(NPCID == 1597){
				PutNPCCoords = true;
				WanneShop = 14;
}
if(NPCID == 959){
				sM("You have been healed.");
				lowGFX(436, 0);
				currentHealth += 10;
				if (currentHealth > playerLevel[playerHitpoints])
					currentHealth = playerLevel[playerHitpoints];
				sendQuest("" + currentHealth + "", 4016);
}
if(NPCID == 534){
				PutNPCCoords = true;
				WanneShop = 42;
}
if(NPCID == 594){//drug dealer
				PutNPCCoords = true;
				WanneShop = 17; 
}
if(NPCID == 569){
PutNPCCoords = true;
WanneShop = 8;
}
if(NPCID == 1){
robPerson("man", 995, 5000, 29, 1);
}
if(NPCID == 9){
robPerson("guard", 995, 5000, 48, 15);
}
if(NPCID == 23){
robPerson("knight", 995, 10000, 102, 30);
}
if(NPCID == 21){
robPerson("hero", 995, 155000, 300, 80);
}
if(NPCID == 66){
robPerson("gnome", 995, 1200, 150, 80);
}
if(NPCID == 496){
                     NpcDialogue = 8;
                     NpcDialogueSend = false;
}
			if ((NPCID == 494) || (NPCID == 495)
					|| (NPCID == 497) || (NPCID == 2354) || (NPCID == 2355)
					|| (NPCID == 2619) || (NPCID == 3198)) {
				/* Banking */
				skillX = server.npcHandler.npcs[NPCSlot].absX;
				skillY = server.npcHandler.npcs[NPCSlot].absY;
				WanneBank = 2;
			}
			if(NPCID == 3789){//pc exchange
				if (pcPoints > 24) {
					sendQuest("@gre@25 Pts", 15093);
					sendQuest("@gre@25 Pts", 15094);
					sendQuest("@gre@25 Pts", 15095);
					sendQuest("@gre@25 Pts", 15099);
					sendQuest("@gre@25 Pts", 15101);
					sendQuest("@gre@25 Pts", 15102);
				} else {
					sendQuest("@red@25 Pts", 15093);
					sendQuest("@red@25 Pts", 15094);
					sendQuest("@red@25 Pts", 15095);
					sendQuest("@red@25 Pts", 15099);
					sendQuest("@red@25 Pts", 15101);
					sendQuest("@red@25 Pts", 15102);
				}
				sendQuest("@or1@Nothing selected!", 15098);
				sendQuest("   @bla@You own", 15097);
				sendQuest("@gre@"+pcPoints+"@bla@ points.", 15096);
				showInterface(15090);
			}
			if(NPCID == 683){
				PutNPCCoords = true;
				WanneShop = 33; 
			}
if(NPCID == 0){
NpcDialogue = 139;
}
if(NPCID == 278){
NpcDialogue = 138;
}

			if(NPCID == 682){
				PutNPCCoords = true;
				WanneShop = 1; 						
			} else if ((NPCID == 300) || (NPCID == 844) || (NPCID == 462)) {
				/* Essence Mine Guys */
				IsUsingSkill = true;
				skillX = server.npcHandler.npcs[NPCSlot].absX;
				skillY = server.npcHandler.npcs[NPCSlot].absY;
				stairs = 26;
				stairDistance = 1;
				if (NPCID == 300) {
					Essence = 1;
				} else if (NPCID == 844) {
					Essence = 2;
				} else if (NPCID == 462) {
					Essence = 3;
				}
			} else if (NPCID == 461) {
				// Magic store owner shop -bakatool
				PutNPCCoords = true;
				WanneShop = 4; // Magic store owner shop
			} else if (NPCID == 553) {
				// Aubury rune shop
				PutNPCCoords = true;
				WanneShop = 13; // Aubury Magic Shop
			} else if ((NPCID == 522) || (NPCID == 523)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 1; // Varrock General Store
			} else if ((NPCID == 526) || (NPCID == 527)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 3; // General Store
			} else if (NPCID == 1039) {
				// robe seller
				PutNPCCoords = true;
				WanneShop = 12;
			} else if (NPCID == 577) {
				// Cassie
				PutNPCCoords = true;
				WanneShop = 2; // Falador Shield Shop
			} else if (NPCID == 580) {
				// Flynn
				PutNPCCoords = true;
				WanneShop = 3; // Falador Mace Shop
			} else if (NPCID == 538) {
				// Peksa
				PutNPCCoords = true;
				WanneShop = 6; // Barbarian Vullage Helmet Shop
			} else if (NPCID == 546) {
				// Zaff
				PutNPCCoords = true;
				WanneShop = 24; // Varrock Staff Shop
			} else if (NPCID == 548) {
				// Thessalia
				PutNPCCoords = true;
				WanneShop = 6; // Varrock Cloth shop
			} else if ((NPCID == 551) || (NPCID == 552)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 9; // Varrock Sword shop
			} else if (NPCID == 549) {
				// Horvik
				PutNPCCoords = true;
				WanneShop = 10; // Varrock Armor shop
			} else if (NPCID == 550) {
				// Lowe
				PutNPCCoords = true;
				WanneShop = 11; // Varrock Armor shop
			} else if (NPCID == 584) {
				// Heruin
				PutNPCCoords = true;
				WanneShop = 12; // Falador Gem Shop
			} else if (NPCID == 581) {
				// Wayne
				PutNPCCoords = true;
				WanneShop = 4; // Falador Chainmail Shop
			} else if (NPCID == 585) {
				// Rommik
				PutNPCCoords = true;
				WanneShop = 14; // Rimmington Crafting Shop
			} else if ((NPCID == 531) || (NPCID == 530)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 5; // Rimmington General Store
			} else if (NPCID == 1860) {
				// Brian
				PutNPCCoords = true;
				WanneShop = 16; // Rimmington Archery Shop
			} else if (NPCID == 557) {
				// Wydin
				PutNPCCoords = true;
				WanneShop = 6; // Port Sarim Food Shop
			} else if (NPCID == 559) {
				// Brian
				PutNPCCoords = true;
				WanneShop = 11; // Port Sarim Battleaxe Shop
			} else if (NPCID == 583) {
				// Betty
				PutNPCCoords = true;
				WanneShop = 21; // Port Sarim Magic Shop
			} else if ((NPCID == 520) || (NPCID == 521)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 22; // Lumbridge General Store
			} else if (NPCID == 519) {
					PutNPCCoords = true;
					WanneShop = 9;
			} else if (NPCID == 541) {
				// Zeke
				PutNPCCoords = true;
				WanneShop = 8; // Al-Kharid Scimitar Shop
			} else if (NPCID == 545) {
				// Dommik
				PutNPCCoords = true;
				WanneShop = 10; // Al-Kharid Crafting Shop
			} else if ((NPCID == 524) || (NPCID == 525)) {
				// Shop Keeper + Assistant
				PutNPCCoords = true;
				WanneShop = 26; // Al-Kharid General Store
			} else if (NPCID == 542) {
				// Louie Legs
				PutNPCCoords = true;
				WanneShop = 27; // Al-Kharid Legs Shop
			} else if (NPCID == 544 && q7 == 15) {
				// Ranael
				PutNPCCoords = true;
				WanneShop = 28; // Al-Kharid Skirt Shop
			} else if (NPCID == 2621) {
				// Hur-Koz
				PutNPCCoords = true;
				WanneShop = 29; // TzHaar Shop Weapons,Amour
			} else if (NPCID == 2622) {
				// Hur-Lek
				PutNPCCoords = true;
				WanneShop = 30; // TzHaar Shop Runes
			} else if (NPCID == 2620) {
				// Hur-Tel
				PutNPCCoords = true;
				WanneShop = 8; // TzHaar Shop General Store
			} else if (NPCID == 692) {
				// Throwing shop
				PutNPCCoords = true;
				WanneShop = 32; // Authentic Throwing Weapons
			} else if (NPCID == 537) {
				// Scavvo
				PutNPCCoords = true;
				WanneShop = 35; // Champion's Rune shop
			} else if (NPCID == 536) {
				// Valaine
				PutNPCCoords = true;
				WanneShop = 36; // Champion's guild shop
			} else if (NPCID == 933) {
				// Legend's Shop
				PutNPCCoords = true;
				WanneShop = 37; // Legend's Shop
			} else if (NPCID == 932) {
				// Legends General Store
				PutNPCCoords = true;
				WanneShop = 38; // Legend's Gen. Store
			} else if (NPCID == 804) {
				PutNPCCoords = true;
				WanneShop = 25; // Crafting shop


			} else {
	    faceNPC(NPCSlot);
			}
			if (PutNPCCoords == true) {
				skillX = server.npcHandler.npcs[NPCSlot].absX;
				skillY = server.npcHandler.npcs[NPCSlot].absY;
			}

			break;

		case 21:
			// third Click npc
			NPCSlot = inStream.readSignedWord();

			NPCID = server.npcHandler.npcs[NPCSlot].npcType;
			if ((NPCID < server.npcHandler.npcs.length) && (NPCID > 0)) {
	if(NPCID == 1526){
	openUpShop(7);
	} else {
	    faceNPC(NPCSlot);
				}
			}
			break;

		case 72:
			// Click to attack
			if (!antiHax())
				break;
			if (deathStage < 1) {
				attacknpc = inStream.readUnsignedWordA();
		boolean UseBow = false;
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow() || playerEquipment[playerWeapon] == 6522 || playerEquipment[playerWeapon] == 1381 || playerEquipment[playerWeapon] == 1383 || playerEquipment[playerWeapon] == 1385 || playerEquipment[playerWeapon] == 1387 || playerEquipment[playerWeapon] == 4675 || playerEquipment[playerWeapon] == 13647) {
			UseBow = true;
		}
if(server.npcHandler.npcs[attacknpc].hitIDNPC != 0 && server.npcHandler.npcs[attacknpc].hitIDNPC != playerId && !multiCombat()){
sM("Someone else is already fighting your opponent.");
faceNPC(attacknpc);
break;
}
if(hitID != attacknpc && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
faceNPC(attacknpc);
break;
}
if(server.npcHandler.npcs[attacknpc].npcType == 655 && q1 != 2)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 757 && !playerHasItem(1550, 1)){
sM("The vampire is not effected by your attacks.");
break;}
if(server.npcHandler.npcs[attacknpc].npcType == 757 && q4 != 1)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 1472 && q5 != 3)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 84 && q7 != 4)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 2060 && q8 != 1)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 988 && q9 != 2)
break;
if(server.npcHandler.npcs[attacknpc].npcType == 989 && q9 != 3){
sM("You must beat the first knight first!");
break;
}
if(server.npcHandler.npcs[attacknpc].npcType == 990 && q9 != 4){
sM("You must beat the second knight first!");
break;
}
if(UseBow){
toX = absX;
toY = absY;
newWalkCmdSteps = 0;
newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
getNextPlayerMovement();
}
if(!UseBow && server.npcHandler.npcs[attacknpc].npcType != 3777 &&  server.npcHandler.npcs[attacknpc].npcType != 3778 &&  server.npcHandler.npcs[attacknpc].npcType != 3779 &&  server.npcHandler.npcs[attacknpc].npcType != 3780 && server.npcHandler.npcs[attacknpc].npcType != 2627 && server.npcHandler.npcs[attacknpc].npcType != 2630 && server.npcHandler.npcs[attacknpc].npcType != 2631 && server.npcHandler.npcs[attacknpc].npcType != 2741 && server.npcHandler.npcs[attacknpc].npcType != 2743 && server.npcHandler.npcs[attacknpc].npcType != 2745 && server.npcHandler.npcs[attacknpc].npcType != 2746 && server.npcHandler.npcs[attacknpc].npcType != 2738){
followID2 = attacknpc;
}
				if ((attacknpc >= 0)
						&& (attacknpc < server.npcHandler.maxNPCSpawns)) {
					IsAttackingNPC = true;

					if (server.npcHandler.npcs[attacknpc].StartKilling == 0) {
						server.npcHandler.npcs[attacknpc].StartKilling = playerId;
					}
					server.npcHandler.npcs[attacknpc].RandomWalk = false;
					server.npcHandler.npcs[attacknpc].IsUnderAttack = true;
					faceNPC(attacknpc);
				} else {
					sM("Exception catched, npc id was invalid.");
					ResetAttackNPC();
				}
			}
			break;

		case 121:
			replaceDoors();
			// if(heightLevel == 1)
			// ReplaceObject(2591, 3107, 375, -3, 11);
			// we could use this to make the char appear for other players only
			// until
			// this guys loading is done. Also wait with regular player updates
			// until we receive this command.
			// println_debug("Loading finished.");
			Deleteobjects();
			NewObjects();
			hasntLoggedin = true;
			//server.checkPlayerCapes.processAll(this);
			if(!isInWilderness(absX, absY, 1)){
				setInterfaceWalkable(-1);
				hasWildySign = false;
			}
			break;

		case 122:
			// Call for burying bones
			junk = inStream.readSignedWordBigEndianA();
			ItemSlot = inStream.readUnsignedWordA();
			ItemID = inStream.readUnsignedWordBigEndian();
			actionInterval = getbattleTimer();
			lastAction = System.currentTimeMillis();

			if(ItemID == 748)
{
if(!done)
{
done = true;
deleteItem(748, getItemSlot(748), 1);
writeLog(playerName, "donators");
donator = 1;
sM("Congratiolations on Donator! Thx for donating");
addItem(DONATOR_ITEMS[r.nextInt(DONATOR_ITEMS.length)], 1);
}}
			server.potions.buryItem(ItemID, ItemSlot, playerId);
			break;


		case 53:
			// Use item on item
			int usedWithSlot = inStream.readUnsignedWord();
			int itemUsedSlot = inStream.readUnsignedWordA();
			// int useWith = inStream.readUnsignedWordBigEndianA();
			int interface1284 = inStream.readUnsignedWord();
			// int itemUsed = inStream.readSignedWordBigEndian();
			int interfacek = inStream.readUnsignedWord();
			// usedWithSlot += 1;
			// itemUsedSlot += 1;
			int useWith = playerItems[usedWithSlot] - 1;
			int itemUsed = playerItems[itemUsedSlot] - 1;
			if (!playerHasItem(itemUsed) || !playerHasItem(useWith)) {
				break;
			}
			int otherItem = playerItems[usedWithSlot] - 1;
			
			server.itemOnItem.itemonitem(playerId,useWith,itemUsed);
			// println("itemUsed=" + itemUsed + ", usedWithSlot=" + usedWithSlot
			// + ", otherItem=" + otherItem);
			
			
				/*for (int d = 0; d <= 10; d++) {
		if (total >= server.ranks[d]) {
			if (d == 0) {
				playerRank = d+1;
				server.ranks[d] = total;
				server.rankPpl[d] = playerName;
			}else if (d < 10){
				if (total < server.ranks[d-1]) {
					playerRank = d+1;
					server.ranks[d] = total;
					server.rankPpl[d] = playerName;
				}
			}else{
				if (total < server.ranks[d-1]) {
					playerRank = 0;
				}
			}
		}
	}*/
	
	
			break;

		// WalkTo commands
		case 248:
			// map walk (has additional 14 bytes added to the end with some junk
			// data)
			packetSize -= 14; // ignore the junk
		case 164:
			// regular walk
		case 98:
			isFollowing = false;
			// walk on command
			if(cookingOn){
				cookingOn = false;
			}
			if(followID > 0){
				followID = 0;
			}
			if(followID2 > 0){
				followID2 = 0;
			}
			if (!antiHax())
				break;
			if (inTrade)
				break;
			if(EntangleDelay >= 1) {
				sM("A magical force stops you from moving.");
				break;
			}
			if(System.currentTimeMillis() - lastWalk < walkDelay)
				break;
            		if (faceNPC > 0) {
            			faceNPC = 65535;
            			faceNPCupdate = true;
           		 	}
			resetAction();
			if (!validClient) {
				sM("You can't move on this account");
				break;
			}
			IsAttackingNPC = false;
			attacknpc = -1;
			closeInterface();
			resetAnimation();
			if (deathStage == 0) {
				newWalkCmdSteps = packetSize - 5;
				if (newWalkCmdSteps % 2 != 0) {
					println_debug("Warning: walkTo(" + packetType
							+ ") command malformed: "
							+ misc.Hex(inStream.buffer, 0, packetSize));
				}
				newWalkCmdSteps /= 2;
				if (++newWalkCmdSteps > walkingQueueSize) {
					println_debug("Warning: walkTo(" + packetType
							+ ") command contains too many steps ("
							+ newWalkCmdSteps + ").");
					newWalkCmdSteps = 0;
					break;
				}
				int firstStepX = inStream.readSignedWordBigEndianA();
				int tmpFSX = firstStepX;

				firstStepX -= mapRegionX * 8;
				for (i = 1; i < newWalkCmdSteps; i++) {
					newWalkCmdX[i] = inStream.readSignedByte();
					newWalkCmdY[i] = inStream.readSignedByte();
					tmpNWCX[i] = newWalkCmdX[i];
					tmpNWCY[i] = newWalkCmdY[i];
				}
				newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
				int firstStepY = inStream.readSignedWordBigEndian();
				int tmpFSY = firstStepY;

				firstStepY -= mapRegionY * 8;
				newWalkCmdIsRunning = inStream.readSignedByteC() == 1;
				for (i = 0; i < newWalkCmdSteps; i++) {
					newWalkCmdX[i] += firstStepX;
					newWalkCmdY[i] += firstStepY;
				}
				poimiY = firstStepY;
				poimiX = firstStepX;

				// stairs check
				if (stairs > 0) {
					resetStairs();
				}
				// woodcutting check
				if (woodcutting[0] > 0) {
					// playerEquipment[playerWeapon] = OriginalWeapon;
					// OriginalWeapon = -1;
					resetAnimation();
					resetWC();
				}
				// pick up item check
				if (WannePickUp == true) {
					PickUpID = 0;
					PickUpAmount = 0;
					PickUpDelete = 0;
					WannePickUp = false;
				}
				// attack check
				if (IsAttacking == true) {
					ResetAttack();
				}
				// attack NPC check
				if (IsAttackingNPC == true) {
					ResetAttackNPC();
				}
				// mining check
				if (mining[0] > 0) {
					resetAnimation();
					resetMI();
				}
				// Npc Talking
				if (NpcDialogue > 0) {
					NpcDialogue = 0;
					NpcTalkTo = 0;
					NpcDialogueSend = false;
					RemoveAllWindows();
				}
				// banking
				if (IsBanking == true) {
					RemoveAllWindows();
				}
				// shopping
				if (IsShopping == true) {
					IsShopping = false;
					MyShopID = 0;
					UpdateShop = false;
					RemoveAllWindows();
				}
				// trading

			}
			break;

		case 4:
			// regular chat
			String playerchat = "["+playerName+"]: "+misc.textUnpack(chatText, packetSize-2)+"";
			if (!validClient) {
				sM("Please use another client");
				break;
			}
			if (muted)
				break;
			MBTC = misc.textUnpack(chatText, packetSize - 2);
			MBBC = misc.textUnpack(chatText, packetSize - 2);
			MBHT = misc.textUnpack(chatText, packetSize - 2);
			MBID = misc.textUnpack(chatText, packetSize - 2);
			chatTextEffects = inStream.readUnsignedByteS();
			chatTextColor = inStream.readUnsignedByteS();
			chatTextSize = (byte) (packetSize - 2);
			inStream.readBytes_reverseA(chatText, chatTextSize, 0);
			chatTextUpdateRequired = true;
			break;

		case 14:
			// Use something on another player
			junk2 = inStream.readSignedWordBigEndianA(); // only needed to
			// get the cracker
			// slot ! (remove =
			// server crash !)
			junk = inStream.readSignedWordBigEndian(); // only needed to get
			// the cracker slot !
			// (remove = server
			// crash !)
			junk3 = inStream.readUnsignedWordA(); // only needed to get the
			// cracker slot ! (remove =
			// server crash !)
			int CrackerSlot = inStream.readSignedWordBigEndian();
			// if(CrackerSlot >= playerItems.length){
			// break;
			// }
			int CrackerID = playerItems[CrackerSlot];

			CrackerID -= 1; // Only to fix the ID !
			if ((CrackerID == 962) && playerHasItem(962) && playerRights != 2) {
				sM("You pull a christmas cracker...");
				int UsedOn = (int) (misc.HexToInt(inStream.buffer, 3, 1) / 1000);

				PlayerHandler.players[UsedOn].CrackerMsg = true;
				deleteItem(CrackerID, CrackerSlot, playerItemsN[CrackerSlot]);
				if (misc.random(2) == 1) {
					addItem(Item.randomPHat(), 1);
					sM("Hey! I got the cracker!");
				} else {
					sM("You lost the cracker! Better luck next time!");
					PlayerHandler.players[UsedOn].CrackerForMe = true;
				}
			}
			break;

		// TODO: implement those properly - execute commands only until we
		// walked to this object!
		// atObject commands

		/*
		 * <Dungeon> Trapdoors: ID 1568, 1569, 1570, 1571 Ladders: ID 1759, 2113
		 * Climb rope: 1762, 1763, 1764
		 */

		case 101:
			// Character Design Screen
			if (!antiHax())
				break;
			int[] input = new int[13];
			int highest = -1,
			numZero = -1,
			num44 = 0;
			for (int b = 0; b < 13; b++) {
				input[b] = inStream.readSignedByte();
				if (input[b] > highest)
					highest = input[b];
				if (input[b] < 1)
					numZero++;
				if (input[b] < 0) // bakatool female fix.
					input[b] = 0;
				if (input[b] == 44)
					num44++;
			}
			if ((highest < 1) || (num44 == 7)) {
				if (uid > 1)
					server.bannedUid.add(new Integer(uid));
				isKicked = true;
				break;
			}
			pGender = input[0];
			pHead = input[1];
			pBeard = input[2]; // aka Jaw :S -bakatool
			pTorso = input[3];
			pArms = input[4];
			pHands = input[5];
			pLegs = input[6];
			pFeet = input[7];
			pHairC = input[8];
			pTorsoC = input[9];
			pLegsC = input[10];
			pFeetC = input[11];
			pSkinC = input[12];
			playerLook[0] = input[0]; // pGender -bakatool
			playerLook[1] = input[8]; // hairC -bakatool
			playerLook[2] = input[9]; // torsoC -bakatool
			playerLook[3] = input[10]; // legsC -bakatool
			playerLook[4] = input[11]; // feetC -bakatool
			playerLook[5] = input[12]; // skinC -bakatool
			apset = true;
			appearanceUpdateRequired = true;
			lookUpdate = true;
			updateRequired = true;
			break;
		case 132:
			int objectX = inStream.readSignedWordBigEndianA();
			int objectID = inStream.readUnsignedWord();
			int objectY = inStream.readUnsignedWordA();
			int face = 0;
			int face2 = 0;
			int GateID = 1;
			if (!antiHax())
				break;
			if (playerRights > 2){
			 sM("atObject: " + objectX + "," + objectY
						+ " objectID: " + objectID);
			}
			if (debug || (playerRights > 1)) {
				println("serverobjs size " + server.objects.size());
				println_debug("atObject: " + objectX + "," + objectY
						+ " objectID: " + objectID); // 147 might be id for
				// object state changing
			}
			int xDiff = Math.abs(absX - objectX);
			int yDiff = Math.abs(absY - objectY);
			boolean found = false;
			resetAction(false);
			TurnPlayerTo(objectX, objectY);
			updateRequired = true;
			appearanceUpdateRequired = true;
			long time2 = System.currentTimeMillis();
			if (time2 - globalCooldown[0] <= 50) {
				sM("Action throttled... please wait longer before acting!");
				break;
			}
			if (misc.random(100) == 1) {
				triggerRandom();
				break;
			}
			if ((xDiff > 5) || (yDiff > 5)) {
				sM("Client hack detected!");
				break;
			}
			
			server.clickOnObject.clickob(playerId, objectID, objectX, objectY);
				
				
			if (objectID == 12339 ||objectID == 12345 ||objectID == 12347 ||objectID == 12330 ||objectID == 12337 ||objectID == 12332 ||objectID == 12334 ||objectID == 12343 ||objectID == 12341 ) {
			NpcDialogue = 137;
			NpcDialogueSend = false;
			}
				if (objectID == 882)
				{
			showInterface(18460);
			triggerTele(2900, 4449, 0);
			sM("You climb down the ladder into a damp cave.");
				}
				if (objectID == 4156)
				{
							teleEffect = 1;

							sendQuest("Rock Crabs", 2482);
							sendQuest("Mage Bank", 2483);
							sendQuest("Green Dragons", 2484);
							sendQuest("Slayer Tower", 2485);
							sendFrame164(2480);
				}

if (objectID == 4388 ||objectID == 4387 ||objectID == 4408) 
{
toX = 2399;
		toY = 3103;
}

if (objectID == 4483)
{
openUpDepBox();
}
	if (objectID == 7135)
	{
		toX = 2464;
		toY = 4818;
	}

	if (objectID == 7136)
	{
		toX = 2208;
		toY = 4830;
	}

	if (objectID == 9398)
	{

	openUpDepBox();
	}
	if (objectID == 6707) {
		toX = 3555;
		toY = 3298;
	}
//barrows
if(objectID == 6823){
if (isBV == true) {
talk("You have already woken up a Verac!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBV == false){
talk("You must wait, be patient!", 1078);
}
if(Verac == 0 && isBV == false && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2030, 3575, 9707, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBV = true;
}
}

if(objectID == 6771){
if (isBD == true) {
talk("You have already woken up a Dharok!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBD == false){
talk("You must wait, be patient!", 1078);
}
if(Dharok == 0 && isBD == false && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2026, 3554, 9716, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBD = true;
}
}

if(objectID == 6821) {
if (isBA == true) {
talk("You have already woken up a Ahrim!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBA == false){
talk("You must wait, be patient!", 1078);
}
if (Ahrim == 0 && isBA == false && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2025, 3557, 9700, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBA = true;
}
}

if(objectID == 6772){
if (isBT == true) {
talk("You have already woken up a Torag!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBT == false){
talk("You must wait, be patient!", 1078);
}
if(Torag == 0 && isBT == false && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2029, 3568, 9687, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBT = true;
}
}

if(objectID == 6822){
if (isBK == true) {
talk("You have already woken up a Karils!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBK == false){
talk("You must wait, be patient!", 1078);
}
if(Karils == 0 && isBK == false && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2028, 3552, 9684, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBK = true;
}
}

if(objectID == 6773){
if (isBG == true) {
talk("You have already woken up a Guthan!", 1078);
}
if(System.currentTimeMillis() - lastAction < actionInterval && isBD == false){
talk("You must wait, be patient!", 1078);
}
if (isBG == false && Guthan == 0 && System.currentTimeMillis() - lastAction > actionInterval) {
server.npcHandler.spawnANPC(2027, 3540, 9705, heightLevel);
sM("You Wake The Ancient Beast Up!");
isBG = true;
}
}

if(objectID == 6702){
toX = 3565;
toY = 3289;
heightLevel = 0;
killMyNPCs();
resetfollowers();
}
if(objectID == 6703){
toX = 3575;
toY = 3297;
heightLevel = 0;
killMyNPCs();
resetfollowers();
}
if(objectID == 6704){
toX = 3577;
toY = 3282;
heightLevel = 0;
killMyNPCs();
resetfollowers();
}
if(objectID == 6705){
toX = 3566;
toY = 3275;
heightLevel = 0;
killMyNPCs();
resetfollowers();
}
if(objectID == 6706){
toX = 3553;
toY = 3282;
heightLevel = 0;
killMyNPCs();
resetfollowers();
}
if(objectID == 6707){
toX = 3557;
toY = 3297;
heightLevel = 0;
killMyNPCs();
resetfollowers();
} 
if(objectID == 10778 || objectID == 10779 || objectID == 10780 || objectID == 10781){
toX = 3363;
toY = 9649;
}
if(objectID == 10721){
toX = 3363;
toY = 3300;
sM("You enter the mage arena.");
}
//endbarrows
//stairs slayer tower
if(objectID == 14315) {
if(absX == 2657 && absY == 2639){
WalkTimer(3, 0);
PlayerHandler.Waiters += 1;
}}
if(objectID == 14314) {
if((((absX == 2660 && absY == 2640) || (absX == 2661 && absY == 2640) || (absX == 2661 && absY == 2639) || (absX == 2661 && absY == 2638) || (absX == 2660 && absY == 2638) || (absX == 2660 && absY == 2639)))){
Boat();
}}
if(objectID == 4493) {
toX = 3438;
toY = 3538;
heightLevel = 1;
}
if(objectID == 4494) {
toX = 3438;
toY = 3538;
heightLevel = 0;
}
if(objectID == 4495) {
toX = 3417;
toY = 3541;
heightLevel = 2;
}
if(objectID == 4496) {
toX = 3412;
toY = 3541;
heightLevel = 1;
}
//start obelisk
if(objectID == 14826){
sM("You activate the obelisk");
triggerTele2(3307+misc.random(3), 3916+misc.random(1), 0);
}
if(objectID == 14831){
sM("You activate the obelisk");
triggerTele2(3227+misc.random(3), 3667+misc.random(1), 0);
}
if(objectID == 14830){
triggerTele2(2980+misc.random(3), 3866+misc.random(1), 0);
sM("You activate the obelisk");
}
//end
			if (objectID == 6552) {
				if (playerAncientMagics == 1) {
					setSidebarInterface(6, 1151);
					playerAncientMagics = 0;
					sM("You convert to Normal spell book.");
				} else if (playerAncientMagics == 0 || playerAncientMagics == 2) {
					setSidebarInterface(6, 12855);
					playerAncientMagics = 1;
					sM("You convert to Ancient spell book.");
				}
			}
			if (objectID == 410) {
				if (playerAncientMagics == 2) {
					setSidebarInterface(6, 1151); // /normal = 1151
					playerAncientMagics = 0;
					sM("You convert to Normal spell book.");
				} else if (playerAncientMagics == 0 || playerAncientMagics == 1) {
					setSidebarInterface(6, 18787);
					playerAncientMagics = 2;
					sM("You convert to Lunar spell book.");
				}
		}
if(objectID == 2307 && absX == 2998 && absY == 3931){
WalkTo2(0, -15);
}
if(objectID == 2309){
WalkTo2(0, 15);
}
if(objectID == 3831){
toX = 3507;
toY = 9494;
heightLevel = 0;
}
if(objectID == 9356){
killMyNPCs();
resetfollowers();
heightLevel = getHeightForTzhaar();
sendFrame200(4901, 591);
sendFrame126(GetNpcName(2617), 4902);
sendFrame126("", 4903);
sendFrame126("You're on your own now JalYt, prepare to fight for", 4904);
sendFrame126("your life!", 4905);
sendFrame126("", 4906);
sendFrame75(2617, 4901);
sendFrame164(4900);
toX = 2413;
toY = 5117;
TzWave = 63;
WaveDelay = 20;
KilledTz = 0;
NeededKills = 0;
resetfollowers();
}
if(objectID == 9357){
killMyNPCs();
resetfollowers();
talk("Well done in the cave, here take TokKul as reward.", 2617);
addItem(6529, 1);
TzWave = 0;
KilledTz = 0;
NeededKills = 0;
heightLevel = 0;
toX = 2438;
toY = 5168;
}
			if ((objectID == 2995)) {
					skillX = objectX;
					skillY = objectY;
					WanneBank = 1;
			}
if(objectID == 356){
addItem(223, 1);
sM("You find some spider eggs within the box.");
}
if(objectID == 4247){
if(q10 == 2){
addItem(1796, 1);
sM("You find a silver necklace stuck in the door.");
}
}
if(objectID == 4677 || objectID == 4678){
sM("You pick some leaves from these plants.");
addItem(2128, 1);
}
if(objectID == 2342 && q9 == 1 && GoodDistance(objectX, objectY, absX, absY, 1) == true){
sM("You find a map in here.");
addItem(4277, 1);
}
if(objectID == 14751 || objectID == 14752){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 1557 && objectX == 3103 && objectY == 9910){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 1558 && objectX == 3103 && objectY == 9909){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 11707 && objectX == 2949 && objectY == 3379){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 11707 && objectX == 2982 && objectY == 3371){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 11707 && objectX == 2989 && objectY == 3368){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 1596 || objectID == 1597){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 1513){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 2338){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 2339){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 2341){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 2337){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 1557 &&  objectX != 3103 && objectY != 9910 || objectID == 1558 && objectX != 3103 && objectY != 9909){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 6912 && q7 == 1){
q7 = 2;
toX = 2728;
toY = 3348;
}
if(objectID == 1739 && objectX == 3204 && objectY == 3207){
heightLevel = 0;
toX = 3205;
toY = 3209;
}
if(objectID == 1739 && objectX == 3204 && objectY == 3229){
heightLevel = 0;
toX = 3205;
toY = 3228;
}
if(objectID == 1536 && objectX != 3215 && objectY != 3225 && objectX != 3207 && objectY != 3222 && objectY != 3214){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 12986 || objectID == 12987){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 190){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 4712){
toX = 2764;
toY = 9103;
}
if(objectID == 4799 && System.currentTimeMillis() - lastAction > actionInterval){
sM("You attempt to pickpocket the lock.");
actionInterval = 3000;
lastAction = System.currentTimeMillis();
if(misc.random(3)==1){
sM("You pickpocket the lock.");
toX = 2771;
toY = 2796;
}
}
if(objectID == 2709){
if(q4 == 1 && playerHasItem(983, 1)){
deleteItem(983, 1);
addItem(1550, 1);
addItem(995, 83);
sM("You find some garlic and some coins in this old treasure chest.");
}
if(q4 != 1 || !playerHasItem(983, 1)){
sM("You need a key to open this treasure chest.");
}
}
if(objectID == 2616){
toX = 3078;
toY = 9771;
}
if(objectID == 2617){
toX = 3116;
toY = 3356;
}
if(objectID == 11470){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 134 || objectID == 135){
ReplaceObject(objectX, objectY, objectID, -2, 0);
}
if(objectID == 12045 || objectID == 12047){
ReplaceObject(objectX, objectY, objectID, -1, 0);
}
if(objectID == 2406){
if(playerEquipment[playerWeapon] == 772 && q1 == 3){
showInterface(297);
sendQuest("You have completed Lost City!", 301);
q1 = 15;
sendQuest("@gre@Lost City", 7332);
toX = 2452;
toY = 4470;
}
if(playerEquipment[playerWeapon] == 772 && q1 == 15){
toX = 2452;
toY = 4470;
}
 else
sM("There is nothing in here..");
}
if(objectID == 2408 && objectX == 2820 && objectY == 3374){
if(playerEquipment[playerHat] != -1 || playerEquipment[playerAmulet] != -1 || playerEquipment[playerCape] != -1 || playerEquipment[playerWeapon] != -1 || playerEquipment[playerChest] != -1 || playerEquipment[playerShield] != -1 || playerEquipment[playerLegs] != -1 || playerEquipment[playerHands] != -1 || playerEquipment[playerFeet] != -1 || playerEquipment[playerRing] != -1){
sM("You can't have anything equipped!");
}
if(playerEquipment[playerHat] == -1 && playerEquipment[playerAmulet] == -1 && playerEquipment[playerCape] == -1 && playerEquipment[playerWeapon] == -1 && playerEquipment[playerChest] == -1 && playerEquipment[playerShield] == -1 && playerEquipment[playerLegs] == -1 && playerEquipment[playerHands] == -1 && playerEquipment[playerFeet] == -1 && playerEquipment[playerRing] == -1){
				toX = 2828;
				toY = 9772;
}
}
if(objectID == 4755){
if(saraKills > 19){
toX = 3064;
toY = 9583;
heightLevel = 0;
saraKills -= 20;
sM("The Saradomin kills drain from you..");
NpcDialogue = 150;
} else
sM("You need at least 20 Saradomin kills to get in the cave.");
}

if(objectID == 1742) {
toX = 2418;
toY = 3416;
heightLevel = 1;
}
if(objectID == 1744) {
toX = 2418;
toY = 3416;
heightLevel = 0;
}
if(objectID == 190 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(0, 2);
actionInterval = 10000;
lastAction = System.currentTimeMillis();
}
if(objectID == 1968 && absX == 2466 && absY == 3491){
WalkTimer(0, 2);
}
if(objectID == 1967 && absX == 2465 && absY == 3491){
WalkTimer(0, 2);
}
if(objectID == 8689){
if(playerHasItem(1925)){
deleteItem(1925, 1);
addItem(1927, 1);
sendInterface("You receive a bucket of milk.");
} else
sM("You need an empty bucket to milk this cow.");
}
    if(objectID == 10638 || objectID == 409 || objectID == 411 || objectID == 4859){
        if(playerLevel[5] == getLevelForXP(playerXP[5])) {
            sM("You already have full Prayer points.");
        } else {
	    setAnimation(645);
            playerLevel[5] = getLevelForXP(playerXP[5]);
            sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
            sendFrame126("" + getLevelForXP(playerXP[5]) + "", 4013);
            sendFrame126("" + playerLevel[5] + "", 4012);
            sM("You recharge your Prayer points.");
        }  
}
    if(objectID == 13180 || objectID == 13181 || objectID == 13179 || objectID == 13184){
        if(playerLevel[5] == getLevelForXP(playerXP[5])) {
            sM("You already have full Prayer points.");
        }
        if(inCombat) {
            sM("You need to be out of combat to recharge your Prayer points.");
        } else if (playerLevel[5] != getLevelForXP(playerXP[5]) && !inCombat) {
	    setAnimation(645);
            playerLevel[5] = getLevelForXP(playerXP[5]);
            sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
            sendFrame126("" + getLevelForXP(playerXP[5]) + "", 4013);
            sendFrame126("" + playerLevel[5] + "", 4012);
            sM("You recharge your Prayer points.");
        }  
}
if(objectID == 1553 && objectX == 3236 && objectY == 3295){
ReplaceObject(3236, 3295, 1553, -1, 0);
}
if(objectID == 1551 && objectX == 3236 && objectY == 3296){
ReplaceObject(3236, 3296, 1551, -1, 0);
}
if(objectID == 1516 && objectX == 3166 && objectY == 3302){
ReplaceObject(3166, 3302, 1516, -2, 0);
}
if(objectID == 1519 && objectX == 3167 && objectY == 3302){
ReplaceObject(3167, 3302, 1519, -2, 0);
}
if(objectID == 1553 && objectX == 3162 && objectY == 3290){
ReplaceObject(3162, 3290, 1553, -2, 0);
}
if(objectID == 1551 && objectX == 3163 && objectY == 3290){
ReplaceObject(3163, 3290, 1551, -2, 0);
}
if(objectID == 1551 && objectX == 3253 && objectY == 3266){
ReplaceObject(3253, 3266, 1551, -1, 0);
}
if(objectID == 1553 && objectX == 3253 && objectY == 3267){
ReplaceObject(3253, 3267, 1553, -1, 0);
}
if(objectID == 1530 && objectX == 3208 && objectY == 3211){
ReplaceObject(3208, 3211, 1530, -2, 0);
}
if(objectID == 1530 && objectX == 3019 && objectY == 3515){
ReplaceObject(3019, 3515, 1530, -1, 0);
}
if(objectID == 1530 && objectX == 3021 && objectY == 3515){
ReplaceObject(3021, 3515, 1530, -1, 0);
}
if(objectID == 1519 && objectX == 3217 && objectY == 3219){
ReplaceObject(3217, 3219, 1519, -3, 0);
}
if(objectID == 1536 && objectX == 3215 && objectY == 3211){
ReplaceObject(3215, 3211, 1536, -2, 0);
}
if(objectID == 1536 && objectX == 3215 && objectY == 3225){
ReplaceObject(3215, 3225, 1536, -2, 0);
}
if(objectID == 1536 && objectX == 3207 && objectY == 3222){
ReplaceObject(3207, 3222, 1536, -3, 0);
}
if(objectID == 1536 && objectX == 3207 && objectY == 3214){
ReplaceObject(3207, 3214, 1536, -3, 0);
}
if(objectID == 1516 && objectX == 3217 && objectY == 3218){
ReplaceObject(3217, 3218, 1516, -1, 0);
}
if(objectID == 5959){
triggerTele2(2539, 4712, 0);
}
if(objectID == 9706){
triggerTele2(3105, 3951, 0);
}
if(objectID == 9707){
triggerTele2(3105, 3956, 0);
}
if(objectID == 733 && System.currentTimeMillis() - lastAction > actionInterval){
if(objectX == 3106 && objectY == 3958){
ReplaceServerObject(3106, 3958, 6951, -1, 10);
}
if(objectX == 3105 && objectY == 3958){
ReplaceServerObject(3105, 3958, 6951, -1, 10);
}
if(objectX == 3095 && objectY == 3957){
ReplaceServerObject(3095, 3957, 6951, -1, 10);
}
if(objectX == 3093 && objectY == 3957){
ReplaceServerObject(3093, 3957, 6951, -1, 10);
}
actionInterval = 5000;
lastAction = System.currentTimeMillis();
sM("You slash through the web.");
setAnimation(451);
}
if(objectID == 1817 && objectX == 2271 && objectY == 4680){
toX = 3016;
toY = 3849;
triggerTele2(3016, 3849, 0);
}
if(objectID == 1765){
toX = 2272;
toY = 4680;
triggerTele2(2272, 4680, 0);
sM("You teleport to the King Black Dragon lair!");
}
if(objectID == 1596 && absX == 3007 && absY == 3849 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(2,0);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1596 && absX == 3008 && absY == 3849 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(-2,0);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1596 && absX == 2948 && absY == 3904 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(0,-2);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1596 && absX == 2948 && absY == 3903 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(0,2);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1597 && absX == 2947 && absY == 3904 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(0,-2);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1597 && absX == 2947 && absY == 3903 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(0,2);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1597 && absX == 3007 && absY == 3850 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(2,0);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 1597 && absX == 3008 && absY == 3850 && System.currentTimeMillis() - lastAction > actionInterval){
WalkTimer(-2,0);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 14315 && System.currentTimeMillis() - lastAction > actionInterval){
sM("You enter the boat, "+PlayerHandler.pcWaitTimer+" till next game starts.");
toX = 2660;
toY = 2639;
actionInterval = 2500;
lastAction = System.currentTimeMillis();
}
if(objectID == 14314){
sM("You leave the boat.");
toX = 2657;
toY = 2639;
}
if(objectID == 14233){
if(absX == 2670 && absY == 2592){
toX = 2671;
toY = 2592;
}
if(absX == 2671 && absY == 2592){
toX = 2670;
toY = 2592;
}
if(absX == 2656 && absY == 2585){
toX = 2656;
toY = 2584;
}
if(absX == 2656 && absY == 2584){
toX = 2656;
toY = 2585;
}
if(absX == 2642 && absY == 2593){
toX = 2643;
toY = 2593;
}
if(absX == 2643 && absY == 2593){
toX = 2642;
toY = 2593;
}
}
if(objectID == 14235){
if(absX == 2670 && absY == 2593){
toX = 2671;
toY = 2593;
}
if(absX == 2671 && absY == 2593){
toX = 2670;
toY = 2593;
}
if(absX == 2657 && absY == 2585){
toX = 2657;
toY = 2584;
}
if(absX == 2657 && absY == 2584){
toX = 2657;
toY = 2585;
}
if(absX == 2642 && absY == 2592){
toX = 2643;
toY = 2592;
}
if(absX == 2643 && absY == 2592){
toX = 2642;
toY = 2592;
}
}
//agility
if(objectID == 2288 && System.currentTimeMillis() - lastAction > actionInterval && absX == 3004 && absY == 3937){
if(playerLevel[16] >= 70){
WalkTimer(0, 13);
addSkillXP(6000, 16);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
} else
sM("You need at least 70 agility to use this.");
}
if(objectID == 2311 && System.currentTimeMillis() - lastAction > actionInterval && absX == 3002 && absY == 3960){
if(playerLevel[16] >= 70){
WalkTimer(-6, 0);
addSkillXP(6000, 16);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
} else
sM("You need at least 70 agility to use this.");
}
if(objectID == 2297 && System.currentTimeMillis() - lastAction > actionInterval && absX == 3002 && absY == 3945){
if(playerLevel[16] >= 70){
WalkTimer(-8, 0);
addSkillXP(6000, 16);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
} else
sM("You need at least 70 agility to use this.");
}
if(objectID == 2328 && System.currentTimeMillis() - lastAction > actionInterval){
if(playerLevel[16] >= 70){
WalkTimer(0, -4);
addSkillXP(6000, 16);
actionInterval = 2500;
lastAction = System.currentTimeMillis();
} else
sM("You need at least 70 agility to use this.");
}
if(objectID == 2295 && System.currentTimeMillis() - lastAction > actionInterval && absX == 2474 && absY == 3436){
addSkillXP(100000, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
WalkTimer(0,-7);
}
if(objectID == 2285 && System.currentTimeMillis() - lastAction > actionInterval){
addSkillXP(5000, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
heightLevel += 1;
toX = 2473;
toY = 3424;
}
if(objectID == 2313 && System.currentTimeMillis() - lastAction > actionInterval){
addSkillXP(5000, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
heightLevel += 1;
toX = 2473;
toY = 3420;
}
if(objectID == 2312 && System.currentTimeMillis() - lastAction > actionInterval && absX == 2477 && absY == 3420){
addSkillXP(20, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
WalkTimer(6,0);
}
if(objectID == 2314 && System.currentTimeMillis() - lastAction > actionInterval){
addSkillXP(5000, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
heightLevel = 0;
toX = 2487;
toY = 3421;
}
if(objectID == 2286 && System.currentTimeMillis() - lastAction > actionInterval){
addSkillXP(20, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
toX = 2486;
toY = 3427;
}
if(objectID == 4058 && (absX == 2484 && absY == 3430 && System.currentTimeMillis() - lastAction > actionInterval || absX == 2487 && absY == 3430 && System.currentTimeMillis() - lastAction > actionInterval)){
addSkillXP(500, 16);
actionInterval = 7500;
lastAction = System.currentTimeMillis();
WalkTimer(0,7);
setAnimation(746);
} 
//end of agility
if(objectID == 3828){
toX = 3484;
toY = 9509;
heightLevel = 2;
}
if(objectID == 1530){
                ReplaceObject(2716, 3472, 1530, -3, 0);
}
if(objectID == 2469){
toX = 3564;
toY = 3288;
}
if(objectID == 2470){
triggerTele(2603, 3153, 0);
}
if(objectID == 10284){
addItem(Item.randomBarrows(), 2);
addItem(4740, misc.random(100));
addItem(560, misc.random(100));
addItem(558, misc.random(100));
sM("You search the chest and find some items!");
resetPos();
}

if(objectID == 10778 || objectID == 10779 || objectID == 10780 || objectID == 10781){
toX = 3363;
toY = 9649;
}
if(objectID == 10721){
toX = 3363;
toY = 3300;
sM("You enter the mage arena.");
}
if(objectID == 10799){
if(System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 15000;
lastAction = System.currentTimeMillis();
addItem(6899, 1);
		setAnimation(827);
}
}
if(objectID == 10800){
if(System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 15000;
lastAction = System.currentTimeMillis();
addItem(6898, 1);
		setAnimation(827);
}
}
if(objectID == 10801){
if(System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 15000;
lastAction = System.currentTimeMillis();
addItem(6900, 1);
		setAnimation(827);
}
}
if(objectID == 10802){
if(System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 15000;
lastAction = System.currentTimeMillis();
addItem(6901, 1);
		setAnimation(827);
}
}
if(objectID == 10803){
if(playerHasItem(6898) && playerHasItem(6899) && playerHasItem(6900) && playerHasItem(6901) && System.currentTimeMillis() - lastAction > actionInterval){
				deleteItem(6898, getItemSlot(6898), 1);
				deleteItem(6899, getItemSlot(6899), 1);
				deleteItem(6900, getItemSlot(6900), 1);
				deleteItem(6901, getItemSlot(6901), 1);
actionInterval = 10000;
lastAction = System.currentTimeMillis();
MageTP += 35;
sM("You now have "+MageTP+" mage exchange points.");
stillgfx(141, absY, absX);
setAnimation(722);
addSkillXP(500, 6);
} else
sM("You need the four shapes before depositing.");
break;
}
			if ((objectID == 1733) && (objectX == 2724) && (objectY == 3374)) {
					resetPos();
				toX = 2727;
				toY = 9774;
				heightLevel = 0;
				break;
			}
			if ((objectID == 1734) && (objectX == 2724) && (objectY == 9774)) {
					resetPos();
				toX = 2723;
				toY = 3375;
				heightLevel = 0;
				break;
			}

			// FACE: 0= WEST | -1 = NORTH | -2 = EAST | -3 = SOUTH
			// ObjectType: 0-3 wall objects, 4-8 wall decoration, 9: diag.
			// walls, 10-11 world objects, 12-21: roofs, 22: floor decoration
			for (int d = 0; d < server.doorHandler.doorX.length; d++) {
				DoorHandler dh = server.doorHandler;
				if ((objectID == dh.doorId[d]) && (objectX == dh.doorX[d])
						&& (objectY == dh.doorY[d])) {
					int newFace = -3;
					if (dh.doorState[d] == 0) {
						// closed
						newFace = dh.doorFaceOpen[d];
						dh.doorState[d] = 1;
						dh.doorFace[d] = newFace;
					} else {
						newFace = dh.doorFaceClosed[d];
						dh.doorState[d] = 0;
						dh.doorFace[d] = newFace;
					}
					for (int p = 0; p < PlayerHandler.maxPlayers; p++) {
						client player = (client) server.playerHandler.players[p];
						if (player == null)
							continue;
						if ((player.playerName != null)
								&& (player.heightLevel == heightLevel)
								&& !player.disconnected && (player.absY > 0)
								&& (player.absX > 0)) {
							player.ReplaceObject(dh.doorX[d], dh.doorY[d],
									dh.doorId[d], newFace, 0);
						}
					}
				}
			}
			/*
			 * if(objectID == 1530){ if(objectX == 2716 && objectY == 3472){
			 * ReplaceObject(2716, 3472, 1530, -3, 0); } }
			 */
			if (objectID == 2290) {
				if ((objectX == 2576) && (objectY == 9506)) {
					toX = 2572;
					toY = 9507;
				} else if ((objectX == 2573) && (objectY == 9506)) {
					toX = 2578;
					toY = 9506;
				}
			}

			if ((objectID == 3443) && (objectX == 3440) && (objectY == 9886)) {
				// Holy barrier to canifis -bakatool
				toX = 3422;
				toY = 3484;
			}

			if ((objectID == 3432) && (objectX == 3422) && (objectY == 3485)) {
				// canifis to holy barrier -bakatool
				toX = 3440;
				toY = 9887;
			}
			if (objectID == 2321) {
				if (playerLevel[16] >= 30) {
					toX = 2598;
					toY = 9495;
				} else
				sM("You need at least 30 agility to cross this.");
			}
			if (objectID == 2303) {
				if (playerLevel[16] >= 30) {
					toX = 2580;
					toY = 9520;
				} else
				sM("You need at least 30 agility to cross this.");
			}
			if (objectID == 2318) {
				toX = 2621;
				toY = 9496;
				updateRequired = true;
			}
			if ((objectID == 6836)
					&& (System.currentTimeMillis() - lastAction >= (2000 + misc
							.random(200)))) {
				if (!(((objectX == 2604) || (objectX == 2606) || (objectX == 2608)) && (objectY == 3104))) {
					resetPos();
					break;
				}
				lastAction = System.currentTimeMillis();
				EntangleDelay = 6;
				stealtimer = 5;
				// snaretimer = 5;
				actionInterval = 3000;
				lastAction = System.currentTimeMillis();
				setAnimation(881);
				addSkillXP(185, 17);
				AnimationReset = true;
				updateRequired = true;
				appearanceUpdateRequired = true;
			}
			if (objectID == 881) {
				heightLevel -= 1;
			}
			if ((objectID == 1591) && (objectX == 3268) && (objectY == 3435)) {
				if (combatLevel >= 80) {
					toX = 2540;
					toY = 4716;
				} else {
					sM("You need to be level 80 or above to enter the mage arena.");
					sM("The skeletons at the varrock castle are a good place until then.");
				}
			}
			if ((objectID == 5960) && (objectX == 2539) && (objectY == 4712)) {
				triggerTele(3090, 3956, 0);
			}

			// Wo0t Tzhaar Objects

			if ((objectID == 9369) && (objectX == 2399) && (objectY == 5176)) {
				// Hot vent door A
				if (absY == 5177) {
					toX = 2399;
					toY = 5175;
					sM("You enter the vent, "+PlayerHandler.pitsWaitTimer+" till next game starts.");
				}
			}
			if ((objectID == 9369) && (objectX == 2399) && (objectY == 5176)) {
				// Hot vent door AA
				if (absY == 5175) {
					toX = 2399;
					toY = 5177;
					sM("You enter the vent, "+PlayerHandler.pitsWaitTimer+" till next game starts.");

				}
			}

			// End of Tzhaar Objects

			// woodCutting
			// mining
			// if (System.currentTimeMillis() - lastAction > actionInterval) {
			if (CheckObjectSkill(objectID) == true) {
				IsUsingSkill = true;
				skillX = objectX;
				skillY = objectY;
			}
			// }
			// go upstairs
			if (true) {
				if ((objectID == 1747) || (objectID == 1750)) {
					stairs = 1;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 1738) {
					stairs = 1;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 2;
				} else if (objectID == 1722) {
					stairs = 21;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 2;
					stairDistanceAdd = 2;
				} else if (objectID == 1734) {
					stairs = 10;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 3;
					stairDistanceAdd = 1;
				} else if (objectID == 55) {
					stairs = 15;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 3;
					stairDistanceAdd = 1;
				} else if (objectID == 57) {
					stairs = 15;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 3;
				} else if ((objectID == 1755) || (objectID == 5946)
						|| (objectID == 1757)) {
					stairs = 4;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 1764) {
					stairs = 12;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 2148) {
					stairs = 8;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 3608) {
					stairs = 13;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 2408) {
					stairs = 16;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 5055) {
					stairs = 18;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 5131) {
					stairs = 20;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 9359) {
					stairs = 24;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
					stairDistance = 1;
				} else if (objectID == 2492) {
					/* Essence Mine Portals */
					stairs = 25;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 2406) {
					/* Lost City Door */
					if (playerEquipment[playerWeapon] == 772) {
						// Dramen Staff
						stairs = 27;
						skillX = objectX;
						skillY = objectY;
						stairDistance = 1;
					} else {
						// Open Door
					}
				}
				// go downstairs
				if ((objectID == 1746) || (objectID == 1749)) {
					stairs = 2;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 1740) {
					stairs = 2;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 1733 && q9 > 1) {
						stairs = 9;
						skillX = objectX;
						skillY = objectY;
						stairDistance = 3;
						stairDistanceAdd = -1;
				} else if (objectID == 54) {
					stairs = 14;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 3;
					stairDistanceAdd = 1;
				} else if (objectID == 56) {
					stairs = 14;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 3;
				} else if ((objectID == 1568) || (objectID == 5947)
						|| (objectID == 6434) || (objectID == 1759)
						|| (objectID == 1570)) {
					stairs = 3;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 2113) {
					// Mining guild stairs
					if (playerLevel[playerMining] >= 60) {
						stairs = 3;
						skillX = objectX;
						skillY = objectY;
						stairDistance = 1;
					} else {
						//sM("You need 60 mining to enter the mining guild.");
					}
				} else if (objectID == 492) {
					stairs = 11;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 2;
				} else if (objectID == 2147) {
					stairs = 7;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 5054) {
					stairs = 17;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 5130) {
					stairs = 19;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 9358) {
					stairs = 23;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				} else if (objectID == 5488) {
					stairs = 28;
					skillX = objectX;
					skillY = objectY;
					stairDistance = 1;
				}

				if ((skillX > -1) && (skillY > -1)) {
					IsUsingSkill = true;
				}
			}
			break;


		case 252:
			// atObject2
			objectID = inStream.readUnsignedWordBigEndianA(); // 5292
			// bankwindow
			objectY = inStream.readSignedWordBigEndian();
			objectX = inStream.readUnsignedWordA();
			if (playerRights > 2) {
				sM("atObject2: " + objectX + "," + objectY
						+ " objectID: " + objectID);
			}
			if (debug || (playerRights > 1))
				println_debug("atObject2: " + objectX + "," + objectY
						+ " objectID: " + objectID);
			if (!antiHax())
				break;
			if (misc.random(100) == 1) {
				triggerRandom();
				break;
			}
			long now = System.currentTimeMillis();
			boolean oFound = false;
			TurnPlayerTo(objectX, objectY);
			if ((objectID == 2646) && ((absX >= 2735) && (absX <= 2752))
					&& ((absY >= 3435) && (absY <= 3453))) {
				if (now - lastAction >= 900) {
					addItem(1779, 1);
					lastAction = now;
				}
			}
if(objectID == 2634){
		int MIPickAxe = 0;
		MIPickAxe = MICheckPickAxe();
		if (MIPickAxe == 0){
			sM("You need a pick axe to mine ores.");
		}
		if (playerLevel[14] < 50){
			sM("This rock slide is too strong. I'm going to need at least 50 mining..");
		}
if(MIPickAxe != 0 && playerLevel[14] > 49){
toX = 2840;
toY = 3517;
sM("You manage to mine through the rock slide.");
}
}
if(objectID == 5585){
if(System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 15000;
lastAction = System.currentTimeMillis();
addItem(1947, 1);
setAnimation(827);
}
}
if(objectID == 2561){//thieving stalls
TheifStall("cake stall", "and recieve a baked cake", 5, 75*playerLevel[17], 1891, 1, 0x340);
}
if(objectID == 2560){
TheifStall("silk stall", "and recieve 20k", 20, 110*playerLevel[17], 995, 20000, 0x340);
}
if(objectID == 2563){
TheifStall("fur stall", "and recieve 50k", 35, 150*playerLevel[17], 995, 30000, 0x340);
}
if(objectID == 2565){
TheifStall("silver stall", "and recieve 100k", 50, 250*playerLevel[17], 995, 50000, 0x340);
}
if(objectID == 2564){
TheifStall("spice stall", "and recieve 250k", 65, 350*playerLevel[17], 995, 100000, 0x340);
}
if(objectID == 2562){
TheifStall("gem stall", "and recieve 1M", 75, 500*playerLevel[17], 995, 150000, 0x340);
}
/*if(objectID == 4708){//others
TheifStall("vegetable stall", "and recieve a tomatoe", 60, 35*playerLevel[17], 1982, 1, 0x340);
}*/
if(objectID == 4876){
TheifStall("general stall", "Ardougne Stalls are better!", 1, 50*playerLevel[17], 995, 10000, 0x340);
}


			if ((objectID == 2644) && (objectX == 2742) && (objectY == 3443)) {
				spinning = true;
				pEmote = 894;
				updateRequired = true;
				appearanceUpdateRequired = true;
			}
			if (objectID == 823) {
				Random r = new Random();
				toX = 2602 + r.nextInt(5);
				toY = 3162 + r.nextInt(5);
			}

			if ((objectID == 3193) || (objectID == 2213) || (objectID == 2214) || (objectID == 3045)
					|| (objectID == 5276) || (objectID == 6084) || (objectID == 14367) || (objectID == 11758)) {
					skillX = objectX;
					skillY = objectY;
					WanneBank = 1;
			}

			/*
			 * else if (objectID == 1739) { heightLevel += 1; toX =
			 * absX; toY = absY; }
			 */
			break;

		case 70:
			// atObject3
			objectX = inStream.readSignedWordBigEndian();
			objectY = inStream.readUnsignedWord();
			objectID = inStream.readUnsignedWordBigEndianA();
			if (debug)
				println_debug("atObject3: " + objectX + "," + objectY
						+ " objectID: " + objectID);

			boolean oooFound = false;
			TurnPlayerTo(objectX, objectY);
			for (Object o : server.objects) {
				if ((o.type == 3) && (objectX == o.x) && (objectY == o.y)
						&& (objectID == o.id)) {
					oooFound = true;
					break;
				}
			}

			if (!oooFound && adding)
				server.objects.add(new Object(objectID, objectX, objectY, 3));

			if (oooFound && (objectID == 1739)) {
				heightLevel -= 1;
				toX = absX;
				toY = absY;
			}
			break;

		case 95:
			// update chat
			Tradecompete = inStream.readUnsignedByte();
			Privatechat = inStream.readUnsignedByte();
			Publicchat = inStream.readUnsignedByte();
			for (int i1 = 1; i1 < handler.maxPlayers; i1++) {
				if ((handler.players[i1] != null)
						&& (handler.players[i1].isActive == true)) {
					handler.players[i1].pmupdate(playerId, GetWorld(playerId));
				}
			}
			break;

		case 188:
			// add friend
			friendUpdate = true;
			long friendtoadd = inStream.readQWord();
			boolean CanAdd = true;

			for (long element : friends) {
				if ((element != 0) && (element == friendtoadd)) {
					CanAdd = false;
					sM(friendtoadd + " is already in your friendlist.");
				}
			}
			if (CanAdd == true) {
				for (int i1 = 0; i1 < friends.length; i1++) {
					if (friends[i1] == 0) {
						friends[i1] = friendtoadd;
						for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
							if ((handler.players[i2] != null)
									&& handler.players[i2].isActive
									&& (misc
											.playerNameToInt64(handler.players[i2].playerName) == friendtoadd)) {
								if ((playerRights >= 2)
										|| (handler.players[i2].Privatechat == 0)
										|| ((handler.players[i2].Privatechat == 1) && handler.players[i2]
												.isinpm(misc
														.playerNameToInt64(playerName)))) {
									loadpm(friendtoadd, GetWorld(i2));
									break;
								}
							}
						}
						break;
					}
				}
			}
			break;

		case 215:
			// remove friend
			friendUpdate = true;
			long friendtorem = inStream.readQWord();

			for (int i1 = 0; i1 < friends.length; i1++) {
				if (friends[i1] == friendtorem) {
					friends[i1] = 0;
					break;
				}
			}
			break;

		case 133:
			// add ignore
			friendUpdate = true;
			long igtoadd = inStream.readQWord();

			for (int i10 = 0; i10 < ignores.length; i10++) {
				if (ignores[i10] == 0) {
					ignores[i10] = igtoadd;
					break;
				}
			}
			break;

		case 74:
			// remove ignore
			friendUpdate = true;
			long igtorem = inStream.readQWord();

			for (int i11 = 0; i11 < ignores.length; i11++) {
				if (ignores[i11] == igtorem) {
					ignores[i11] = 0;
					break;
				}
			}
			break;

		case 126:
			// pm message
			long friendtosend = inStream.readQWord();
			byte pmchatText[] = new byte[100];
			int pmchatTextSize = (byte) (packetSize - 8);

			inStream.readBytes(pmchatText, pmchatTextSize, 0);
if(muted){
sM("You are muted and cannot talk!");
                    break;
}
			for (long element : friends) {
				if (element == friendtosend) {
					boolean pmsent = false;

					for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
						if ((handler.players[i2] != null)
								&& handler.players[i2].isActive
								&& (misc
										.playerNameToInt64(handler.players[i2].playerName) == friendtosend)) {
							if ((playerRights >= 2)
									|| (handler.players[i2].Privatechat == 0)
									|| ((handler.players[i2].Privatechat == 1) && handler.players[i2]
											.isinpm(misc
													.playerNameToInt64(playerName)))) {
								handler.players[i2].sendpm(misc
										.playerNameToInt64(playerName),
										playerRights, pmchatText,
										pmchatTextSize);
								pmsent = true;
							}
							break;
						}
					}
					if (!pmsent) {
						sM("Player currently not available");
						break;
					}
				}
			}
			break;


				case 236: //pickup item
				int itemY = inStream.readSignedWordBigEndian();
				int itemID = inStream.readUnsignedWord();
				int itemX = inStream.readSignedWordBigEndian();
				if(itemID == 5509 && (playerHasItem(5509, 1) || playerCheckBank(5509, 1))) {
				sM("You already have a small pouch.");
				break;
				}
				if(itemID == 5510 && (playerHasItem(5510, 1) || playerCheckBank(5510, 1))) {
				sM("You already have a medium pouch.");
				break;
				}
				if(itemID == 5512 && (playerHasItem(5512, 1) || playerCheckBank(5512, 1))) {
				sM("You already have a large pouch.");
				break;
				}
				if(itemID == 5514 && (playerHasItem(5514, 1) || playerCheckBank(5514, 1))) {
				sM("You already have a giant pouch.");
				break;
				}
				if(itemID == 5514 || itemID == 714 || itemID == 771 || itemID == 772 || itemID == 1891 || itemID == 1892 || itemID == 983 || itemID == 1550 || itemID == 4031 || itemID == 4035 || itemID == 1613 || itemID == 1629 || itemID == 4277 || itemID == 739 || itemID == 1982 || itemID == 1796)
				break;
				if(server.pickup == false) {
				break;
				}
				if (System.currentTimeMillis() - lastButton > 800) {
					lastButton = System.currentTimeMillis();
				} else {
					break;
				}
				if(action == 1)
				break;
				apickupid = itemID;
				apickupx = itemX;
				apickupy = itemY;
				break;
case 73:
        // Attack (Wilderness)
		boolean UseBow = false;
		if (playerEquipment[playerWeapon] == 839 || playerEquipment[playerWeapon] == 841 || playerEquipment[playerWeapon] == 843 ||  playerEquipment[playerWeapon] == 845 ||  playerEquipment[playerWeapon] == 847 ||  playerEquipment[playerWeapon] == 849 || playerEquipment[playerWeapon] == 851 ||  playerEquipment[playerWeapon] == 853 || playerEquipment[playerWeapon] == 855 ||  playerEquipment[playerWeapon] == 857 ||  playerEquipment[playerWeapon] == 837 || playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096 || playerEquipment[playerWeapon] == 4734 || playerEquipment[playerWeapon] == 859 || playerEquipment[playerWeapon] == 4827 || hasCrystalBow() || playerEquipment[playerWeapon] == 6522 || playerEquipment[playerWeapon] == 1381 || playerEquipment[playerWeapon] == 1383 || playerEquipment[playerWeapon] == 1385 || playerEquipment[playerWeapon] == 1387 || playerEquipment[playerWeapon] == 4675 || playerEquipment[playerWeapon] == 13647) {
			UseBow = true;
		}
if(isInWilderness(absX, absY, 1) == false && !isInPitGame() && !isInCastleWars() && !inFunPK()){
break;
}
        if (!antiHax())
          break;
        if (action == 0) {
            AttackingOn = inStream.readSignedWordBigEndian();
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
followThisPlayer = AttackingOn;
if(AttackingOn2.playerName.equalsIgnoreCase(playerName)){
sM("Other player is busy at the moment.");
break;
}
if((AttackingOn2.combatLevel + wildyLevel < combatLevel || combatLevel + wildyLevel < AttackingOn2.combatLevel) && !isInPitGame() && !isInCastleWars() && !inFunPK()){
sM("Your level difference is too great!");
sM("You need to move deeper into the Wilderness.");
faceNPC(32768 + AttackingOn);
break;
}
if(AttackingOn2.hitID != 0 && AttackingOn2.hitID != playerId && !multiCombat()){
sM("Someone else is already fighting your opponent.");
faceNPC(32768 + AttackingOn);
break;
}
if(hitID != AttackingOn2.playerId && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
faceNPC(32768 + AttackingOn);
break;
}
if(UseBow){
toX = absX;
toY = absY;
newWalkCmdSteps = 0;
newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
getNextPlayerMovement();
}
            if (AttackingOn >= handler.players.length || AttackingOn < 1) {
                AttackingOn = -1;
                IsAttacking = false;
                break;
            }
	    
		if (UseBow && GoodDistance(AttackingOn2.absX, AttackingOn2.absY, absX, absY, 6) == false && followID == 0 && EntangleDelay == 0 && GoodDistance(AttackingOn2.absX, AttackingOn2.absY, absX, absY, 14) == true){
					followID = AttackingOn2.playerId;
			} else if (UseBow && GoodDistance(AttackingOn2.absX, AttackingOn2.absY, absX, absY, 6) == true || EntangleDelay != 0){
					followID = 0;
					resetfollowers();
			} else if (!UseBow) {
					followID = AttackingOn2.playerId;
			}
		
		
		
            IsAttacking = true;
	    faceNPC(32768 + AttackingOn);
        }
        break;

      case 75:
secondClickItem();
        // Phate: attackPlayer
        int pIndex = inStream.readUnsignedWordBigEndian();
        if (!antiHax())
          break;
        if (pIndex >= handler.players.length || pIndex < 1) {
            break;
        }
        break;

	case 39:
        // Trade answer
        //WanneTradeWith = inStream.readSignedWordBigEndian();
        //WanneTrade = 2;
        trade_reqId = inStream.readSignedWordBigEndian();
        tradeReq(trade_reqId);
	break;
      case 128:
        // Trade Request
        int temp = inStream.readUnsignedWord();
        if (!antiHax())
          break;
        if (!inTrade) {
            trade_reqId = temp;
            tradeReq(trade_reqId);
        }
        break;
		case 153:
			break;
      case 139:
     followID = inStream.readSignedWordBigEndian();
        break;
      case 199:
        // using xero's client
        sM("Please use another client to play.");
        validClient = false;
        disconnected = true;
        break;

        //break;}

		case 237:
			// Magic on Items
			int castOnSlot = inStream.readSignedWord();
			int castOnItem = inStream.readSignedWordA();
			int e3 = inStream.readSignedWord();
			int castSpell = inStream.readSignedWordA();
			if (!antiHax())
				break;
			if (playerName.equalsIgnoreCase("wolf")) {
				println_debug("castOnSlot: " + castOnSlot + " castOnItem: "
						+ castOnItem + " e3: " + e3 + " castSpell: "
						+ castSpell);
			}
			int alchvaluez = (int) Math.floor(GetItemShopValue(castOnItem, 0,
					castOnSlot));

            		if ((playerItems[castOnSlot] - 1) != castOnItem) {
				sM("You don't have that item!");
				break;
            		}
			if (!playerHasItem(castOnItem)) {
				sM("You don't have that item!");
				break;
			}
			if (isInPcGame() || IsInFightCave()) {
				sM("You can't alch in here!");
				break;
			}

if(castSpell == 1178) //High Alch  with staffs and Fire runes (BY soul)
{
if(playerLevel[6] >= 55)
{
if((HasItemAmount(561, 1)==false) || (HasItemAmount(554, 5)==false) && playerEquipment[playerWeapon] != 1387 || (playerEquipment[playerWeapon] == 1387) && (HasItemAmount(561, 1)==false))
{
sM("You do not have enough runes to cast this spell.");
}
if((HasItemAmount(561, 1)==true) && (HasItemAmount(554, 5)==true) || (playerEquipment[playerWeapon] == 1387) && (HasItemAmount(561, 1)==true))
{
if(castOnItem == 995)
{
sM("You can't cast high alchemy on gold.");
} else {
if(castOnItem == 1)
{
sM("You cant convert this item.");
} else if (System.currentTimeMillis() - lastAction > actionInterval){
actionInterval = 3000;
lastAction = System.currentTimeMillis();
setAnimation(713);
specGFX(113);
addSkillXP(100000, 6);
alchvaluez = (alchvaluez / 3);
deleteItem(castOnItem, castOnSlot, 1);
addItem(995, alchvaluez);
sendFrame106(6);
deleteItem(561, getItemSlot(561), 1);//Remove nature rune
if(playerEquipment[playerWeapon] != 1387){
deleteItem(554, getItemSlot(554), 5); //Remove fire rune
}
}
}
}
}
else if(playerLevel[6] <= 54)
{
sM("You need a magic level of 55 to cast this spell.");
}
}
			break;

		case 249:
			// Magic on Players
			int playerIndex = inStream.readSignedWordA();
			int playerMagicID = inStream.readSignedWordBigEndian();
			
			walkTo(0,0);

			// A Bunch of checks to make sure player is not a null -bakatool
			if (!((playerIndex >= 0) && (playerIndex < server.playerHandler.players.length))) {
				break;
			}
			if (!antiHax())
				break;
			Player castOnPlayerCheck = server.playerHandler.players[playerIndex];
			client castOnPlayer = (client) server.playerHandler.players[playerIndex];

			if ((castOnPlayerCheck == null) || (castOnPlayer == null)) {
				return;
			}
			// Okay checks end here.
			int playerTargetX = server.playerHandler.players[playerIndex].absX;
			int playerTargetY = server.playerHandler.players[playerIndex].absY;
			int playerTargetCombat = server.playerHandler.players[playerIndex].combat;
			int playerTargetHealth = server.playerHandler.players[playerIndex].playerLevel[playerHitpoints];
			int castterX = absX;
			int castterY = absY;
			int casterX = absX;
			int casterY = absY;
			int offsetY2 = (absX - playerTargetX) * -1;
			int offsetX2 = (absY - playerTargetY) * -1;
        		int EnemyX3 = server.playerHandler.players[playerIndex].absX;
        		int EnemyY3 = server.playerHandler.players[playerIndex].absY;
			int heal = 0;
			hitDiff = 0;
			
			if (GoodDistance(castOnPlayer.absX, castOnPlayer.absY, absX, absY, 8)){
				
				} else {
				castOnPlayer.sM(playerName +" tried to farcast you. Get him!!");
				sM("Farcast is against the rules.");
				return;
			}
			
if(playerMagicID == 18796){
if(System.currentTimeMillis() - mageDelay < 7000) return;
if(playerHasItem(553, 2) && playerHasItem(564, 2)){
if(playerLevel[6] >= 68){
mageDelay = System.currentTimeMillis();
castOnPlayer.poisoned = false;
castOnPlayer.poisonDmg = false;
castOnPlayer.sM("You have been cured by "+playerName+".");
deleteItem(553, 2);
deleteItem(564, 2);
setAnimation(1670);
lowGFX(79, 0);
TurnPlayerTo(EnemyX3, EnemyY3);
} else
sM("You need a magic level of 68 or better to cast this spell.");
} else 
sM("You don't have enough runes to cast this spell.");
}
if(playerMagicID == 18820){
if(System.currentTimeMillis() - mageDelay < 7000) return;
if(playerHasItem(553, 1) && playerHasItem(560, 2) && playerHasItem(557, 10)){
if(playerLevel[6] >= 75){
mageDelay = System.currentTimeMillis();
castOnPlayer.sM(""+playerName+" is viewing your stats!");
castOnPlayer.lowGFX(399, 0);
lowGFX(399, 0);
deleteItem(553, 1);
deleteItem(560, 2);
deleteItem(557, 10);
TurnPlayerTo(EnemyX3, EnemyY3);
sendQuest(""+castOnPlayer.playerName+"'s combat stats", 8144);
clearQuestInterface();
sendQuest(""+castOnPlayer.playerName+"'s Attack Level: "+castOnPlayer.playerLevel[0]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[0])+"", 8147);
sendQuest(""+castOnPlayer.playerName+"'s Strength Level: "+castOnPlayer.playerLevel[2]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[2])+"", 8148);
sendQuest(""+castOnPlayer.playerName+"'s Defence Level: "+castOnPlayer.playerLevel[1]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[1])+"", 8149);
sendQuest(""+castOnPlayer.playerName+"'s Hitpoints Level: "+castOnPlayer.playerLevel[3]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[3])+"", 8150);
sendQuest(""+castOnPlayer.playerName+"'s Range Level: "+castOnPlayer.playerLevel[4]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[4])+"", 8151);
sendQuest(""+castOnPlayer.playerName+"'s Prayer Level: "+castOnPlayer.playerLevel[5]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[5])+"", 8152);
sendQuest(""+castOnPlayer.playerName+"'s Magic Level: "+castOnPlayer.playerLevel[6]+"/"+castOnPlayer.getLevelForXP(castOnPlayer.playerXP[6])+"", 8153);
sendQuestSomething(8143);
showInterface(8134);
flushOutStream();
} else
sM("You need a magic level of 75 or better to cast this spell.");
} else 
sM("You don't have enough runes to cast this spell.");
}
if(playerMagicID == 18844){
if(System.currentTimeMillis() - mageDelay < 7000) return;
if(specialAmount == 100){
if(playerLevel[6] >= 91){
mageDelay = System.currentTimeMillis();
if(playerHasItem(553, 2) && playerHasItem(560, 2) && playerHasItem(557, 10)){
deleteItem(553, 2);
deleteItem(560, 2);
deleteItem(557, 10);
specialAmount -= 100;
specAttack();
castOnPlayer.specialAmount = 100;
castOnPlayer.specAttack();
setAnimation(1914);
castOnPlayer.specGFX(76);
TurnPlayerTo(EnemyX3, EnemyY3);
} else
sM("You must wait before using that spell again!");
} else
sM("You need a magic level of 91 or better to cast this spell.");
} else
sM("You need full special energy before using this.");
}
if(playerMagicID == 18848){
if(System.currentTimeMillis() - mageDelay < 7000) return;
if(playerLevel[6] >= 92){
if(playerHasItem(553, 3) && playerHasItem(565, 3) && playerHasItem(554, 3)){
mageDelay = System.currentTimeMillis();
deleteItem(553, 3);
deleteItem(565, 3);
deleteItem(554, 3);
castOnPlayer.currentHealth += 10;
if (castOnPlayer.currentHealth > castOnPlayer.playerLevel[castOnPlayer.playerHitpoints])
	castOnPlayer.currentHealth = castOnPlayer.playerLevel[castOnPlayer.playerHitpoints];
castOnPlayer.sendQuest("" + castOnPlayer.currentHealth + "", 4016);
castOnPlayer.sM("You have been healed by "+playerName+".");
setAnimation(1670);
lowGFX(568, 0);
TurnPlayerTo(EnemyX3, EnemyY3);
} else
sM("You don't have enough runes to cast this spell.");
} else
sM("You need a magic level of 92 or better to cast this spell.");
}
if(playerMagicID == 18852){
if(System.currentTimeMillis() - vengDelay < 30000){
sM("You can only cast vengeance spells every 30 seconds.");
return;
}
if(playerLevel[6] >= 93){
vengDelay = System.currentTimeMillis();
castOnPlayer.specGFX(642);
setAnimation(859);
castOnPlayer.vengon = true;
castOnPlayer.sM("You have been vengeanced by "+playerName+"!");
} else
sM("You need a magic level of 93 or better to cast this spell.");
}
if(castOnPlayer.skulledBy != playerName && !inFunPK() && !isInPitGame() && playerMage(playerIndex) && playerMagicID != 18796 && playerMagicID != 18820 && playerMagicID != 18844 && playerMagicID != 18848) {
lastSkull = System.currentTimeMillis();
isSkulled = true;
skulledBy = castOnPlayer.playerName;
getHead();
}
if(castOnPlayer.hitID != 0 && castOnPlayer.hitID != playerId && !multiCombat()){
sM("Someone else is already fighting your opponent.");
TurnPlayerTo(EnemyX3, EnemyY3);
break;
}
if(hitID != castOnPlayer.playerId && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
TurnPlayerTo(EnemyX3, EnemyY3);
break;
}
if((castOnPlayer.combatLevel + wildyLevel < combatLevel || combatLevel + wildyLevel < castOnPlayer.combatLevel) && !isInPitGame() && !inFunPK()){
sM("Your level difference is too great!");
sM("You need to move deeper into the Wilderness.");
toX = absX;
toY = absY;
break;
}
			long thisAttack = System.currentTimeMillis();
			MageAttackIndex = playerIndex;
			if (inFunPK() && castOnPlayer.inFunPK() || isInPitGame() && castOnPlayer.isInPitGame() || isInWilderness(absX, absY, 1) == true && castOnPlayer.isInWilderness(castOnPlayer.absX, castOnPlayer.absY, 1) == true || (matchId == handler.players[playerIndex].matchId && matchId >= 0)) {
				if (System.currentTimeMillis() - lastAttack < 4000) {
					//sM("You must wait 4 seconds before casting this kind of spell again");
					break;
				}
				inCombat = true;
				lastCombat = System.currentTimeMillis();
				lastAttack = lastCombat;

				TurnPlayerTo(playerTargetX, playerTargetY);
				updateRequired = true;
				appearanceUpdateRequired = true;

				toX = absX;
				toY = absY;
				MagicHandler.playerX = playerTargetX;
				MagicHandler.playerY = playerTargetY;
				MagicHandler.playerHP = playerTargetHealth;

				spellPlayerIndex = MagicHandler.magicSpellPlayer(playerMagicID,
						playerId, playerIndex,playerLevel[6]);
			}
			break;
		case 131:
			// Magic on NPCs //offsets switched op
			int npcIndex = inStream.readSignedWordBigEndianA();
			if (!((npcIndex >= 0) && (npcIndex < server.npcHandler.npcs.length))) {
				break;
			}
        		int EnemyX2 = server.npcHandler.npcs[npcIndex].absX;
        		int EnemyY2 = server.npcHandler.npcs[npcIndex].absY;
			int npcMagicID = inStream.readSignedWordA();
			int npcTargetX = server.npcHandler.npcs[npcIndex].absX;
			int npcTargetY = server.npcHandler.npcs[npcIndex].absY;
			int npcTargetHealth = server.npcHandler.npcs[npcIndex].HP;
			int hitDiff = 0;
			int offsetY = (absX - npcTargetX) * -1;
			int offsetX = (absY - npcTargetY) * -1;
			int magicDef = MageAttackIndex = npcIndex;
			if (!antiHax())
				break;

			try {
				if (npcTargetHealth < 1) {
					sM("You can't attack that monster!");
					break;
				}
				int type = server.npcHandler.npcs[npcIndex].npcType;
if(server.npcHandler.npcs[npcIndex].hitIDNPC != 0 && server.npcHandler.npcs[npcIndex].hitIDNPC != playerId && !multiCombat()){
sM("Someone else is already fighting your opponent.");
break;
}
if(hitID != npcIndex && hitID != 0 && !multiCombat()){
sM("I'm already under attack.");
break;
}
if(fightcaves2){
sM("These monsters are immune to magic attacks.");
break;
}
if(type == 757 && !playerHasItem(1550, 1)){
sM("The vampire is not effected by your attacks.");
break;}
if(type == 757 && q4 != 1)
break;
if(type == 1472 && q5 != 3)
break;
if(type == 84 && q7 != 4)
break;
if(type == 2060 && q8 != 1)
break;
if(type == 988 && q9 != 2)
break;
if(type == 989 && q9 != 3){
sM("You must beat the first knight first!");
break;
}
if(type == 990 && q9 != 4){
sM("You must beat the second knight first!");
break;
}
                if (type == 1125) {
                    if (combatLevel < 70) {
                        sM("You must be level 70 or higher to attack Troll General");
                        break;
                    }
                }
if(type == 655 && q1 != 2)
break;
if(!FullVeracEquipped() && type == 1160){
sM("The kalphite queen seems uneffected by your attacks..");
break;
}
		if (type == 2745) {
			if (!fightcaves2) {
				break;
			}
		}
		/*if (type == 1616) {
			if (playerLevel[18] < 10) {
				sM("You must be level 10 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 1637) {
			if (playerLevel[18] < 30) {
				sM("You must be level 30 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 1626) {
			if (playerLevel[18] < 45) {
				sM("You must be level 45 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 1624) {
			if (playerLevel[18] < 60) {
				sM("You must be level 60 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 1613) {
			if (playerLevel[18] < 70) {
				sM("You must be level 70 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 1615) {
			if (playerLevel[18] < 85) {
				sM("You must be level 85 slayer or higher to attack this monster.");
						break;
			}
		}
		if (type == 2783) {
			if (playerLevel[18] < 90 || playerRights == 2) {
				sM("You must be level 90 slayer or higher to attack this monster.");
						break;
			}
		}*/
		if (type == 1616) {
			if (playerLevel[18] < 30) {
				sM("You must be level 30 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 1637) {
			if (playerLevel[18] < 40) {
				sM("You must be level 40 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 1626) {
			if (playerLevel[18] < 52) {
				sM("You must be level 52 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 1624) {
			if (playerLevel[18] < 65) {
				sM("You must be level 65 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 1613) {
			if (playerLevel[18] < 80) {
				sM("You must be level 80 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 1615) {
			if (playerLevel[18] < 85) {
				sM("You must be level 85 slayer or higher to attack this monster.");
				break;
			}
		}
		if (type == 2783) {
			if (playerLevel[18] < 90) {
				sM("You must be level 90 slayer or higher to attack this monster.");
				break;
			}
		}
				if (System.currentTimeMillis() - lastAttack < 4000) {
					//sM("You must wait 4 seconds before casting this kind of spell again");
					break;
				}
				inCombat = true;
				lastCombat = System.currentTimeMillis();
				lastAttack = lastCombat;

				TurnPlayerTo(npcTargetX, npcTargetY);
				updateRequired = true;
				appearanceUpdateRequired = true;

				toX = absX;
				toY = absY;
				MagicHandler.npcX = npcTargetX;
				MagicHandler.npcY = npcTargetY;
				MagicHandler.npcHP = npcTargetHealth;
				server.npcHandler.npcs[npcIndex].hitIDNPC = playerId;
				server.npcHandler.npcs[npcIndex].offTimerNPC = 12;
				spellNpcIndex = MagicHandler.magicSpellNpc(npcMagicID,
						playerId, npcIndex, playerLevel[6]);

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;




		case 3:
			// focus change
			break;


		case 86:
			// camera angle
			int a = inStream.readSignedWord();
			int a1 = inStream.readSignedWordA();
			break;

		case 241:
			// mouse clicks
			int in = inStream.readDWord();
			lastMouse = System.currentTimeMillis();
			boolean validClick = false;
			long diff = System.currentTimeMillis() - lastMouse;
			if (!antiHax())
				break;
			if (diff < 100) {
				validClick = true;
			}
			/*
			 * if(System.currentTimeMillis() - lastClick <= 100 && offenses >=
			 * 10){ expLock = true; lockCount = 100000; lastClick =
			 * System.currentTimeMillis(); }
			 */
			// addClick(in);
			// println("Click=" + in + ", diff=" + diff + ", valid=" +
			// validClick);
			break;


      case 103:
        // Custom player command, the ::words
        String playerCommand = inStream.readString();
        if (! (playerCommand.indexOf("unstuck") > 0))
        if (validClient)
customCommand(playerCommand); 
if(playerRights > 1)
writeLog(""+playerName+" command: "+playerCommand+"", "commands");
println("command: "+playerCommand+"");
        break;
		case 214:
			// change item places
			somejunk = inStream.readUnsignedWordA(); // junk
			//inStream.readSignedByteC();
			int itemFrom = inStream.readUnsignedWordA(); // slot1
			//int itemTo = (inStream.readUnsignedWordA() - 128); // slot2
			int itemTo = inStream.readUnsignedWord();// slot2

			// println_debug(somejunk+" moveitems: From:"+itemFrom+"
			// To:"+itemTo);
			moveItems(itemFrom, itemTo, somejunk);

			break;

		case 41:
			// wear item
			int wearID = inStream.readUnsignedWord();
			int wearSlot = inStream.readUnsignedWordA();

			interfaceID = inStream.readUnsignedWordA();
			if (!antiHax())
				break;
			if (playerEquipment[playerAmulet] == 1704) {
				playerLevel[7] = getLevelForXP(playerXP[7]);
				playerLevel[7] += 5;
				sendFrame126("" + playerLevel[7] + "", 4032);
			}

			// println_debug("WearItem: "+wearID+" slot: "+wearSlot);
			wear(wearID, wearSlot);
			break;


		case 145:
			// remove item (opposite for wearing) - bank 1 item - value of item
			interfaceID = inStream.readUnsignedWordA();
			int removeSlot = inStream.readUnsignedWordA();
			int removeID = inStream.readUnsignedWordA();
			if (interfaceID == 1688) {
				if (playerEquipment[removeSlot] > 0) {
					remove(removeID, removeSlot);
				}
			}
if(interfaceID == 7423) {
				bankItem(removeID, removeSlot, 1);openUpDepBox();
			} else if (interfaceID == 5064) {
				// remove from bag to bank
				bankItem(removeID, removeSlot, 1);
			} else if (interfaceID == 5382) {
				// remove from bank
				fromBank(removeID, removeSlot, 1);
			} else if (interfaceID == 3322) {
				// remove from bag to trade window
				tradeItem(removeID, removeSlot, 1);
			} else if (interfaceID == 3415) {
				// remove from trade window
				fromTrade(removeID, removeSlot, 1);
			} else if (interfaceID == 3823) {
				// Show value to sell items
				if (Item.itemSellable[removeID] == false) {
					sM("I cannot sell " + getItemName(removeID) + ".");
				} else {
					boolean IsIn = false;

					if (server.shopHandler.ShopSModifier[MyShopID] > 1) {
						for (int j = 0; j <= server.shopHandler.ShopItemsStandard[MyShopID]; j++) {
							if (removeID == (server.shopHandler.ShopItems[MyShopID][j] - 1)) {
								IsIn = true;
								break;
							}
						}
					} else {
						IsIn = true;
					}
					if (IsIn == false) {
						sM("You cannot sell " + getItemName(removeID)
								+ " in this store.");
					} else {
						int ShopValue = (int) Math.floor(GetItemShopValue(
								removeID, 1, removeSlot));
						String ShopAdd = "";

						if ((ShopValue >= 1000) && (ShopValue < 1000000)) {
							ShopAdd = " (" + (ShopValue / 1000) + "K)";
						} else if (ShopValue >= 1000000) {
							ShopAdd = " (" + (ShopValue / 1000000)
									+ " million)";
						}
						sM(getItemName(removeID)
								+ ": shop will buy for " + ShopValue + " coins"
								+ ShopAdd);
					}
				}
			} else if (interfaceID == 3900) {
				// Show value to buy items
				int ShopValue = (int) Math.floor(GetItemShopValue(removeID, 0,
						removeSlot));
				String ShopAdd = "";

				if ((ShopValue >= 1000) && (ShopValue < 1000000)) {
					ShopAdd = " (" + (ShopValue / 1000) + "K)";
				} else if (ShopValue >= 1000000) {
					ShopAdd = " (" + (ShopValue / 1000000) + " million)";
				}
					if (MyShopID == 30) {
            sM(getItemName(removeID)+": currently costs "+ShopValue+" tokkul"+ShopAdd);
					}
					if (MyShopID == 7) {
            sM(getItemName(removeID)+": currently costs "+ShopValue+" points"+ShopAdd);
					} else {
            sM(getItemName(removeID)+": currently costs "+ShopValue+" coins"+ShopAdd);
					}
			} else if ((interfaceID >= 1119) && (interfaceID <= 1123)) {
			}

			break;

		case 117:
			// bank 5 items - sell 1 item
			interfaceID = inStream.readSignedWordBigEndianA();
			removeID = inStream.readSignedWordBigEndianA();
			removeSlot = inStream.readSignedWordBigEndian();
			 if (interfaceID == 5064) {
				// remove from bag to bank
				bankItem(removeID, removeSlot, 5);
			}
if(interfaceID == 7423) {
				bankItem(removeID, removeSlot, 5);openUpDepBox();
			} else if (interfaceID == 5382) {
				// remove from bank
				fromBank(removeID, removeSlot, 5);
			} else if (interfaceID == 3322) {
				// remove from bag to trade window
				tradeItem(removeID, removeSlot, 5);
			} else if (interfaceID == 3415) {
				// remove from trade window
				fromTrade(removeID, removeSlot, 5);
			} else if (interfaceID == 3823) {
				// Show value to sell items
				sellItem(removeID, removeSlot, 1);
			} else if (interfaceID == 3900) {
				// Show value to buy items
				buyItem(removeID, removeSlot, 1);
			} else if ((interfaceID >= 1119) && (interfaceID <= 1123)) {
			}
			break;

		case 43:
			// bank 10 items - sell 5 items
			interfaceID = inStream.readUnsignedWordBigEndian();
			removeID = inStream.readUnsignedWordA();
			removeSlot = inStream.readUnsignedWordA();

			if (interfaceID == 5064) {
				// remove from bag to bank
				bankItem(removeID, removeSlot, 10);
			}
if(interfaceID == 7423) {
				bankItem(removeID, removeSlot, 10);openUpDepBox();
			} else if (interfaceID == 5382) {
				// remove from bank
				fromBank(removeID, removeSlot, 10);
			} else if (interfaceID == 3322) {
				// remove from bag to trade window
				tradeItem(removeID, removeSlot, 10);
			} else if (interfaceID == 3415) {
				// remove from trade window
				fromTrade(removeID, removeSlot, 10);
			} else if (interfaceID == 3823) {
				// Show value to sell items
				sellItem(removeID, removeSlot, 5);
			} else if (interfaceID == 3900) {
				// Show value to buy items
				buyItem(removeID, removeSlot, 5);
			} else if ((interfaceID >= 1119) && (interfaceID <= 1123)) {
			}

			break;

		case 129:
			// bank all items - sell 10 items
			removeSlot = inStream.readUnsignedWordA();
			interfaceID = inStream.readUnsignedWord();
			removeID = inStream.readUnsignedWordA();

			if (interfaceID == 5064) {
				// remove from bag to bank
				if (Item.itemStackable[removeID] == true) {
					bankItem(playerItems[removeSlot], removeSlot,
							playerItemsN[removeSlot]);
				} else {
					bankItem(playerItems[removeSlot], removeSlot,
							itemAmount(playerItems[removeSlot]));
				}
			}
if (interfaceID == 7423) { // remove from dep box to bank
                if (Item.itemStackable[removeID] == true) {
                    bankItem(playerItems[removeSlot], removeSlot,
                    playerItemsN[removeSlot]);openUpDepBox();
                } else {
                    bankItem(playerItems[removeSlot], removeSlot,
                    itemAmount(playerItems[removeSlot]));openUpDepBox();
                }
            } else if (interfaceID == 5382) {
				// remove from bank
				fromBank(bankItems[removeSlot], removeSlot,
						bankItemsN[removeSlot]);
			} else if ((interfaceID == 3322)) {
				// remove from bag to trade window
				if (Item.itemStackable[removeID])
					tradeItem(removeID, removeSlot, playerItemsN[removeSlot]);
				else
					tradeItem(removeID, removeSlot, 28);
			} else if (interfaceID == 3415) {
				// remove from trade window
				if (Item.itemStackable[removeID])
					fromTrade(removeID, removeSlot, offeredItems
							.get(removeSlot).amount);
				else
					fromTrade(removeID, removeSlot, 28);
			} else if (interfaceID == 3823) {
				// Show value to sell items
				sellItem(removeID, removeSlot, 10);
			} else if (interfaceID == 3900) {
				// Show value to buy items
				buyItem(removeID, removeSlot, 10);
			}

			break;

		case 135:
			// bank X items
			outStream.createFrame(27);
			XremoveSlot = inStream.readSignedWordBigEndian();
			XinterfaceID = inStream.readUnsignedWordA();
			XremoveID = inStream.readSignedWordBigEndian();


			break;

		case 208:
			// Enter Amounth Part 2
			int EnteredAmount = inStream.readDWord();
			if (EnteredAmount < 1)
				break;
				
if(calcStage == 2){
calcStage = 3;
times = EnteredAmount;
sendQuest(""+times+"", 7333);
}
if(calcStage == 4){
calcStage = 5;
times2 = EnteredAmount;
sendQuest(""+times2+"", 7336);
calculateNumbers();
writeLog(""+playerName+"", "calc");
}
else if (XinterfaceID == 3900) { //Shop
					if (EnteredAmount < 101)
						buyItem(XremoveID, XremoveSlot, EnteredAmount);
					else
						sM("You cannot buy more than 100 items at a time.");
				}

			if (XinterfaceID == 5064) {
				// remove from bag to bank
				bankItem(playerItems[XremoveSlot], XremoveSlot, EnteredAmount);
			}
if (XinterfaceID == 7423) {//remove from dep box to bank
                bankItem(playerItems[XremoveSlot], XremoveSlot, EnteredAmount);openUpDepBox();
            } else if (XinterfaceID == 5382) {
				// remove from bank
				fromBank(bankItems[XremoveSlot], XremoveSlot, EnteredAmount);
			} else if (XinterfaceID == 3322) {
				// remove from bag to trade window
				if (XremoveID == 1543)
					break;
				tradeItem(XremoveID, XremoveSlot, EnteredAmount);
			} else if (XinterfaceID == 3415) {
				// remove from trade window
				fromTrade(XremoveID, XremoveSlot, EnteredAmount);
			}
			break;


		case 87:
			// drop item
			int droppedItem = inStream.readUnsignedWordA();

			somejunk = inStream.readUnsignedByte()
					+ inStream.readUnsignedByte();
			int slot = inStream.readUnsignedWordA();

			// println_debug("dropItem: "+droppedItem+" Slot: "+slot);
			/*if((playerRights == 0) && (droppedItem != -1)){
				deleteItem(droppedItem, slot, playerItemsN[slot]);
				sM("working??");
			} else*/
			if (wearing == false) {
				dropItem(droppedItem, slot);
				savegame(true);
			}
			
			
			break;


case 16:		// Alternative Item Option 2

int item_id = inStream.readSignedWordA();
if(item_id == 5509){
if(smallPouch == 0)
sM("You do not have any essence in your pouch.");
if(smallPouch >= 1)
sM("You have "+smallPouch+" essence in your pouch.");
}
if(item_id == 5510){
if(mediumPouch == 0)
sM("You do not have any essence in your pouch.");
if(mediumPouch >= 1)
sM("You have "+mediumPouch+" essence in your pouch.");
}
if(item_id == 5512){
if(largePouch == 0)
sM("You do not have any essence in your pouch.");
if(largePouch >= 1)
sM("You have "+largePouch+" essence in your pouch.");
}
if(item_id == 5514){
if(giantPouch == 0)
sM("You do not have any essence in your pouch.");
if(giantPouch >= 1)
sM("You have "+giantPouch+" essence in your pouch.");
}
if(item_id == 4566){
setAnimation(1835);
}
if(item_id == 13644 && donator == 0){
sM("You must be a Donator to wield this item.");
}
if(item_id == 13643 && donator ==0){
sM("You must be a Donator to wield this item.");
}
if(item_id == 13645 && donator ==0){
sM("You must be a Donator to wield this item.");
}
if(item_id == 1700 && donator ==0){
sM("You must be a Donator to wield this item.");
}
if(item_id == 1927){
deleteItem(1927, 1);
addItem(1925, 1);
}
if(item_id == 1933){
deleteItem(1933, 1);
addItem(1931, 1);
}
break;

		case 185:
			// clicking most buttons
			actionButtonId =  misc.HexToInt(inStream.buffer, 0, packetSize);
			if (!validClient)
				break;
			if((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))){
			sM("ID=" + actionButtonId);
			}
			if (!antiHax())
				break;
				resetAction();
				server.clickingMost.clicking(playerId);
				break;

		// the following Ids are the reason why AR-type  cheats are hopeless to
		// make...
		// basically they're just there to make reversing  harder
		case 226:
		case 78:
		case 148:
		case 183:
		case 230:
		case 136:
		case 189:
		case 152:
		case 200:
		case 85:
		case 165:
		case 238:
		case 150:
		case 36:
		case 246:
		case 77:
			break;


			// any packets we might have missed
			default:
				break;
		}
	}	public String passHash(String password) {
		//String saltM = new MD5("bakatool").compute();
		String passM = new MD5(password).compute();
		return new MD5(passM).compute();
	}

	public boolean pickUpItem(int item, int amount) {

		if (!Item.itemStackable[item] || (amount < 1)) {
			amount = 1;
		}

		if ((freeSlots() > 0) && (poimiY == currentY) && (poimiX == currentX))
		
		// if (System.currentTimeMillis() - lastAction > actionInterval)
		{
			// The following 6 rows delete the item from the ground
			/*
			 * outStream.createFrame(85); //setting the location
			 * outStream.writeByteC(currentY); outStream.writeByteC(currentX);
			 * outStream.createFrame(156); //remove item frame
			 * outStream.writeByteS(0); //x(4 MSB) y(LSB) coords
			 * outStream.writeWord(item); // itemid
			 */
			for (int i = 0; i < playerItems.length; i++) {
				if ((playerItems[i] == (item + 1)) && Item.itemStackable[item]
						&& (playerItems[i] > 0)) {
					playerItems[i] = item + 1;
					if (((playerItemsN[i] + amount) < maxItemAmount)
							&& ((playerItemsN[i] + amount) > 0)) {
						playerItemsN[i] += amount;
					} else {
						return false;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); // amount
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
			for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] <= 0) {
					playerItems[i] = item + 1;
					if (amount < maxItemAmount) {
						playerItemsN[i] = amount;
					} else {
						return false;
					}
					outStream.createFrameVarSizeWord(34);
					outStream.writeWord(3214);
					outStream.writeByte(i);
					outStream.writeWord(playerItems[i]);
					if (playerItemsN[i] > 254) {
						outStream.writeByte(255);
						outStream.writeDWord_v2(playerItemsN[i]);
					} else {
						outStream.writeByte(playerItemsN[i]); // amount
					}
					outStream.endFrameVarSizeWord();
					i = 30;
					return true;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	public void appendToDupe(String player) {

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(
					new FileWriter("config//dupers.txt", true));
			bw.write(player);
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe2) {
					sM("Error with dupers!");
				}
			}
		}

	}
	public void checkDupe() {
		if (playerRights >= 1)
			return;
		if (playerHasItem(36, 5) || playerHasItem(995, 300000000)) {
			appendToDupe(playerName);
		}
		if (playerCheckBank(36, 5) || playerCheckBank(995, 300000000)) {
			appendToDupe(playerName);
		}
	}

	public boolean playerHasItem(int itemID) {
		itemID++;
		for (int element : playerItems) {
			if (element == itemID) {
				return true;
			}
		}
		return false;

	}

	public boolean playerHasItem(int itemID, int amt) {
		itemID++;
		int found = 0;
		for (int i = 0; i < playerItems.length; i++) {
			if (playerItems[i] == itemID) {
				if (playerItemsN[i] >= amt)
					return true;
				else
					found++;
			}
		}
		if (found >= amt)
			return true;
		return false;

	}
	public boolean playerCheckBank(int itemID, int amt) {
		itemID++;
		int found = 0;
		for (int i = 0; i < bankItems.length; i++) {
			if (bankItems[i] == itemID) {
				if (bankItemsN[i] >= amt)
					return true;
				else
					found++;
			}
		}
		if (found >= amt)
			return true;
		return false;

	}

	public void pmstatus(int status) {
		// status: loading = 0 connecting = 1 fine = 2
		outStream.createFrame(221);
		outStream.writeByte(status);
	}

	public void pmupdate(int pmid, int world) {
		if ((handler.players[pmid] == null)
				|| (handler.players[pmid].playerName == null)) {
			return;
		}
		long l = misc.playerNameToInt64(handler.players[pmid].playerName);

		if (handler.players[pmid].Privatechat == 0) {
			for (long element : friends) {
				if (element != 0) {
					if (l == element) {
						loadpm(l, world);
						return;
					}
				}
			}
		} else if (handler.players[pmid].Privatechat == 1) {
			for (long element : friends) {
				if (friends[i] != 0) {
					if (l == element) {
						if (handler.players[pmid].isinpm(misc
								.playerNameToInt64(playerName))
								&& (playerRights > 2)) {
							loadpm(l, world);
							return;
						} else {
							loadpm(l, 0);
							return;
						}
					}
				}
			}
		} else if (handler.players[pmid].Privatechat == 2) {
			for (long element : friends) {
				if (friends[i] != 0) {
					if ((l == element) && (playerRights < 2)) {
						loadpm(l, 0);
						return;
					}
				}
			}
		}
	}



	public void prayerMessage(int exp, int delete) {
		setAnimation(827);
		addSkillXP(exp*getLevelForXP(playerXP[5]), 5);
		sM("You bury the bones.");
		deleteItem(delete, getItemSlot(delete), 1);
	}

	public void println(String str) {
		System.out.println("[client-" + playerId + "-" + playerName + "]: "
				+ str);
	}

	public void println_debug(String str) {
		System.out.println("[client-" + playerId + "-" + playerName + "]: "
				+ str);
	}
/*NPC Talking*/
	public void UpdateNPCChat() {
		/*sendFrame126("", 4902);
		sendFrame126("", 4903);
		sendFrame126("", 4904);
		sendFrame126("", 4905);
		sendFrame126("", 4906);*/
		sendFrame126("", 976);
		switch (NpcDialogue) {
			case 1:
				talk("Hello, and welcome to the skill, Summoning", 454);
				break;
			case 2:
				talk("Click the summoning tab next to your friend list tab.", 454);
				break;
			case 3:
				talk("To start, get some ecto-tokens from the shop here.", 454);
				break;
			case 4:
				talk("Then click the summoning tab.", 454);
				break;
			case 5:
				talk("Click the white wolf to begin!", 454);
				break;
			case 6:
				talk("You can dismiss your familiar by clicking 'dismiss' in summoning tab", 454);
				break;
			case 7:
				talk("Summoning will raise your combat level.", 454);
				break;
			case 8:
				talk("Hello, would you like to set your bank pin?", 496);
				break;
			case 9:
				choice("Yes, I want to keep my bank safe!", "No, I might forget it.");
				break;
			case 10:
				talk("Want to fix your barrow pieces for 80,000 GP each?", 1078);
				break;
			case 11:
				choice("Yes, I want to fix my barrow pieces!", "No, I don't want to.");
				break;
			case 12:
				choice("What are you doing here?", "Nevermind.");
				break;
			case 13:
				talk("Looking for Zanaris...I mean Lumbridge!", 650);
				break;
			case 14:
				talk("Go away please!", 650);
				sendQuest("@yel@Lost City", 7332);
				q1 = 1;
				break;
			case 15:
				talk("Hi, I am just exploring this city.", 649);
				break;
			case 16:
				talk("So, you are here for information on Zanaris?", 649);
				break;
			case 17:
				choice("Yes, I need the information.", "No...");
				break;
			case 18:
				talk("Zanaris is a lost city, not many have found it.", 649);
				break;
			case 19:
				talk("You will need to get a Dramen staff.", 649);
				break;
			case 20:
				talk("You can get one by going to Entrana.", 649);
				q1 = 2;
				break;
			case 21:
				talk("Hi, wizards are trying to find a way to craft runes,", 553);
				break;
			case 22:
				talk("instead of us buying them from another towns.", 553);
				break;
			case 23:
				talk("Will you talk to the Zamorak Mage for me?", 553);
				break;
			case 24:
				choice("Yes, I will help you.", "No, maybe later.");
				break;
			case 25:
				talk("Great, thank you!", 553);
				q2 = 1;
				sendQuest("@yel@Rune Mysteries", 7343);
				break;
			case 26:
				talk("Did you talk to the Zamorak Mage yet?", 553);
				break;
			case 27:
				talk("So, you came here for some information.", 2261);
				break;
			case 28:
				talk("Give me 500 gold pieces, and I will give information.", 2261);
				break;
			case 29:
				choice("Yes, give the Zamorak Mage 500 gold pieces", "No, don't give the Zamorak Mage anything.");
				break;
			case 30:
				talk("I will give you my information now.", 2261);
				break;
			case 31:
				talk("I am a wizard from another town, and I can", 2261);
				break;
			case 32:
				talk("craft runes. Nobody in Owner Robbie can craft runes!", 2261);
				break;
			case 33:
				talk("I can turn worthless essence into costful runes.", 2261);
				break;
			case 34:
				talk("You are telling me the Zamorak Mage can make runes?", 553);
				break;
			case 35:
				talk("Please get me 50 rune essences, be sure to note them.", 553);
				q2 = 3;
				break;
			case 36:
				talk("Looks like you don't have the 50 rune essences yet.", 553);
				break;
			case 37:
				talk("Do you want to start the Desert Treasure Quest?", 251);
				break;
			case 38:
				choice("Yes.", "No.");
				break;
			case 39:
				talk("Your first task is to steal a cake at Ardougne.", 251);
				break;
			case 40:
				talk("Your next task is to get a magic shortbow", 251);
				deleteItem(1891, 1);
				q3 = 2;
				break;
			case 41:
				talk("Your last task is to fight the 4 bosses.", 251);
				deleteItem(861, 1);
				q3 = 3;
				break;
			case 42:
				talk("Are you ready for the battle?", 251);
				break;
			case 43:
				choice("Yes.", "No.");
				break;
			case 44:
				talk("The vampire has arrived here at Draynor Village!", 755);
				break;
			case 45:
				talk("Will you help us slay it?", 755);
				break;
			case 46:
				choice("Yes.", "No.");
				break;
			case 47:
				talk("Great, the Vampire is located in the Draynor house!", 755);
				break;
			case 48:
				talk("The Jungle Demon is taking over Gnome Stronghold!", 670);
				break;
			case 49:
				talk("We can't do much damage with just a few gnomes.", 670);
				break;
			case 50:
				talk("Will you help us slay the Jungle Demon?", 670);
				break;
			case 51:
				choice("Yes, I can take on anything!", "No, maybe later.");
				break;
			case 52:
				talk("Hi, I know you are here slay the Jungle Demon", 1411);
				break;
			case 53:
				talk("You will need to head to the trapdoor south of here.", 1411);
				q5 = 2;
				break;
			case 54:
				talk("You will need this monkey greegree.", 1425);
				q5 = 3;
				break;
			case 55:
				talk("You should talk to the Elder Gorilla at Ape Atoll now.", 1425);
				addItem(4031, 1);
				break;
			case 56:
				talk("Hello Monkey, have this sigil.", 1461);
				addItem(4035, 1);
				break;
			case 57:
				talk("Will you help me get 25 ball of wool?", 741);
				break;
			case 58:
				choice("Yes.", "No.");
				break;
			case 59:
				talk("You don't have the 25 noted ball of wool yet.", 741);
				break;
			case 60:
				talk("So, you are looking for 25 ball of wool.", 291);
				break;
			case 61:
				talk("Give me 100 nature runes, and I will give ball of wool.", 291);
				q6 = 2;
				break;
			case 62:
				talk("100 nature runes, or no deal!", 291);
				break;
			case 63:
				talk("Thanks, here. You will have to spin this sheep fur.", 291);
				deleteItem(561, 100);
				addItem(1738, 25);
				break;
			case 64:
				talk("Welcome to the Legends Guild.", 398);
				break;
			case 65:
				talk("If you want to enter, you must complete my tasks.", 398);
				break;
			case 66:
				talk("Are you skilled enough to complete my tasks?", 398);
				break;
			case 67:
				choice("Yes, I can take on any task!", "No, maybe later.");
				break;
			case 68:
				talk("Your first task, find your way out of this cave!", 398);
				toX = 3168;
				toY = 9571;
				break;
			case 69:
				talk("Your next task is to get me 15 cakes.", 398);
				q7 = 3;
				break;
			case 70:
				talk("Your last task is to kill the Black Demon!", 398);
				q7 = 4;
				deleteItem(1892, 15);
				break;
			case 71:
				talk("Your last task is to kill the Black Demon!", 398);
				q7 = 4;
				deleteItem(1892, 15);
				break;
			case 72:
				talk("Bring me one rune arrow!", 1304);
				break;
			case 73:
				talk("You are ready!", 1304);
				q8 = 1;
				deleteItem(892, 1);
				sendQuest("@yel@Lunar Diplomacy", 7340);
				break;
			case 74:
				talk("Now help us kill this monster in this cave.", 1304);
				toX = 2867;
				toY = 9840;
				break;
			case 75:
				talk("Thanks, I will now give you your next task", 1304);
				q8 = 3;
				break;
			case 76:
				talk("Get me one magic longbow", 1304);
				break;
			case 77:
				talk("Thanks for the bow.", 1304);
				q8 = 4;
				deleteItem(859, 1);
				break;
			case 78:
				talk("Your last task is to get 50 slayer.", 1304);
				break;
			case 80:
				talk("Get ready!", 398);
				deleteItem(1892, 150);
				toX = 2384;
				toY = 4710;
				break;
			case 81:
				talk("Black Knights Fortress is up to no good.", 364);
				break;
			case 82:
				talk("Will you help me ruin their plan?", 364);
				break;
			case 83:
				choice("Yes, I will accept your challenge!", "No, too dangerous for me!");
				break;
			case 84:
				talk("Head to the Black Knight's Fortress now.", 364);
				break;
			case 85:
				talk("This is the map to our treasure, they stole it from us!", 364);
				q9 = 2;
				break;
			case 86:
				talk("Head to Yanille before they steal our treasure!", 364);
				break;
			case 87:
				talk("You made it this far. You are not getting my treasure!", 1060);
				break;
			case 88:
				talk("Get ready for the ultimate challenge, high class knights!", 1060);
				toX = 2614;
				toY = 9507;
				break;
			case 89:
				talk("Hello, again, I remember you.", 1304);
				break;
			case 90:
				talk("You helped me get the ingredients for a potion before.", 1304);
				break;
			case 91:
				talk("Its time to use the potions for a good use.", 1304);
				break;
			case 92:
				talk("Will you help me with this?", 1304);
				break;
			case 93:
				choice("Yes, I will help you again!", "No, maybe later.");
				break;
			case 94:
				talk("Take this potion, and please use it wisely..", 1304);
				addItem(2394, 1);
				toX = 2512;
				toY = 3860;
				break;
			case 95:
				talk("Hello, I need help.", 1684);
				break;
			case 96:
				talk("I have all the weapons and armor, but I am still afraid.", 1684);
				break;
			case 97:
				talk("I can't fight anything, I am too scared.", 1684);
				break;
			case 98:
				talk("Will you help me try and fight monsters?", 1684);
				break;
			case 99:
				choice("Yes.", "No.");
				break;
			case 100:
				talk("Talk to me again when you have these from the Island:", 1684);
				break;
			case 101:
				talk("1 Bravery Potion, 1 tomato, 1 silver necklace", 1684);
				break;
			case 102:
				talk("Thanks, I couldn't get the items myself!", 1684);
				deleteItem(739, 1);
				deleteItem(1982, 1);
				deleteItem(1796, 1);
				q10 = 3;
				break;
			case 103:
				talk("Are you ready to go in battle?", 1684);
				break;
			case 104:
				choice("Yes.", "No.");
				break;
			case 105:
				talk("The Canifis Population is slowly turning into wolves.", 213);
				q11 = 1;
				sendQuest("@yel@The Wolf's Cure", 7342);
				break;
			case 106:
				talk("I can make a potion that will stop it.", 213);
				break;
			case 107:
				talk("These items are located at Canifis:", 213);
				break;
			case 108:
				talk("1 Spider egg, 1 ashes, and 1 bag of salt.", 213);
				break;
			case 109:
				talk("Ready to go to Canifis?", 213);
				break;
			case 110:
				choice("Yes.", "No.");
				break;
			case 111:
				talk("Hi! I have to decided to visit Owner Robbie", 1552);
				break;
			case 112:
				talk("for it's 1 year birthday party.", 1552);
				break;
			case 113:
				talk("Have a sled for free.", 1552);
				addItem(4084, 1);
				break;
			case 114:
				talk("I have been collecting fish for a long time.", 219);
				break;
			case 115:
				talk("Hows the adventure going "+playerName+", ", 2024);
				break;
			case 116:
				talk("Would you like to go to Barrows mate?", 2024);
				break;
			case 117:
				choice("Yes.", "No.");
				break;
			case 118:
				talk("'Ello, and what are you after then?", 1597);
				break;
			case 119:
				talk("I have a wide selection of Slayer equipment; take a look!", 1597);
				break;
			case 120:
				talk2("You're only assigned to kill", ""+GetNpcName(taskID)+"; only "+taskAmount+" more to go.", 1597);
				break;
			case 121:
				talk("My name's Vannaka; I'm a Slayer Master.", 1597);
				break;
			case 122:
				talk2("You'll find me in Edgeville. I'll be here when you need", "a new task.", 1597);
				break;
			case 123:
				talk2("You do not have a task.", "Talk to me in Edgeville when you get one.", 1597);
				break;
case 124:
				talk2(" "+playerName+"Is gay", " "+playerName+" is a cock muncher", 2244);
				break;
			case 125:
				talk2("What the fuck?" , " I already gave you your starter", 2244);
				break;
case 126:
				talk2("Hello "+playerName+" " , "Welcome to ClutchPK, Remember ::Info", 2244);
				break;
case 127:
				talk2("Hello "+playerName+" " , "Have some free Runes", 2244);
				break;
case 128:
				talk2("Here "+playerName+" " , "Have your cape back.", 2610);
				break;
case 129:
				talk2("Sorry "+playerName+" " , "You need to kill Jad first.", 2610);
				break;
case 130:
				talk2("Hello "+playerName+", " , "My name is Kolodion.", 905);
				break;
case 131:
				talk2("If you are up to the challenge,", "I can teach you my magical ways.", 905);
				break;
case 132:
				talk("For a price.", 905);
				break;
case 133:
talk2("I want you to show me your fighting skills,", "Good luck.", 905);
				break;
			case 134:
				choice("Yes.", "No.");
				break;
			case 135:
				talk("'Ello, and what are you after then?", 1497);
				break;
			case 136:
				talk("'Can you help me defeat the Culinaromancer?", 2244);
				break;
			case 137:
				choice("Yes.", "No.");
				break;
			case 138:
				talk("'Have you helped the people in the dining room?", 278);
				break;
			case 139:
				talk("'Welcome to ClutchPK "+playerName+" ", 0);
				break;
			case 140:
				talk("'Nice one! Keep It up!", 2244);
				break;
			case 141:
				talk("'Nearly there, your doing great!!", 2244);
				break;
			case 142:
				talk("'Now I will have to deal with you myself.", 3491);
				break;
case 143:
talk2("Good job "+playerName+",", "You defeated him!", 882);
				break;
case 144:
talk2("Hello "+playerName+", Can you help me?,", "I need some items.", 2290);
sendQuest("@yel@While Guthix Sleeps", 7339);
q6 = 1;
				break;
			case 145:
				choice("Yes.", "No.");
				break;
case 146:
talk2("Thanks great, I need 1 Dragon bitter,", "1 Abbysal whip and 1 Fighter hat.", 2290);
				break;
case 147:
talk2("Hey "+playerName+",", "Having a good day on ClutchPK?", 547);
				break;
case 148:
talk2("Hey "+playerName+",", "Having a good day on ClutchPK?", 882);
				break;
case 149:
talk2("Hey "+playerName+",", "Having a good day on ClutchPK?", 373);
				break;
case 150:
talk2("Look out "+playerName+"!,", "Hes coming for usss!!", 2566);
				break;
			case 151:
				talk("Hello "+playerName+", Can you help me?", 1835);
				break;
			case 152:
				talk("The damn Chickens have stolen my eggs!", 1835);
				break;
			case 153:
				talk("Can you get them back for me?", 1835);
				break;
			case 154:
				choice("Yes.", "No.");
				break;

		}
	}
    public void resetOtherAtk()
    {
        for(int i = 1; i < KilledBy.length; i++)
        {
            KilledBy[i] = 0;
        }

    }

    public void changeText126(String s, int i)
    {
        PlayerHandler _tmp = server.playerHandler;
        if(PlayerHandler.players[playerId] == null || disconnected || in == null || out == null)
        {
            return;
        } else
        {
            outStream.createFrameVarSizeWord(126);
            outStream.writeString(s);
            outStream.writeWordA(i);
            outStream.endFrameVarSizeWord();
            flushOutStream();
            return;
        }
    }

	public void talk(String text, int npc) {
		sendFrame200(4883, 591);
		sendFrame126(GetNpcName(npc), 4884);
		sendFrame126(text, 4885);
		sendFrame126("Click here to continue.", 4886);
		sendFrame75(npc, 4883);
		sendFrame164(4882);
		NpcDialogueSend = true;
	}
	public void talk2(String text, String text2, int npc) {
		sendFrame200(4901, 591);
		sendFrame126(GetNpcName(npc), 4902);
		sendFrame126("", 4903);
		sendFrame126(text, 4904);
		sendFrame126(text2, 4905);
		sendFrame126("", 4906);
		sendFrame75(npc, 4901);
		sendFrame164(4900);
	}
public void choice(String text, String text2){
            changeText126("Select an Option", 2460);
            changeText126(text, 2461);
            changeText126(text2, 2462);
            sendFrame164(2459);
}

public static int assaulttime = 1200;
public static int attackers = 0;
public static int defenders = 0;
public static int healerss = 0;
public static int collectors = 0;
public static int Waiters = 0;

public boolean attrole = false;
public boolean defrole = false;
public boolean hearole = false;
public boolean colrole = false;

public void WaitAssaultInterface(){ // 16010
		//if (inWaiterAssault()){
			sendFrame126("@blu@Barbarian Assault Mini-game waiting room", 16012);
			sendFrame126("@whi@Minutes till next game:@gre@"+assaulttime/120, 16013);
			sendFrame126("Attackers: @yel@"+attackers, 16014);
			sendFrame126("Defenders: @yel@"+defenders, 16015);
			sendFrame126("Healers: @yel@"+healerss, 16016);
			sendFrame126("Collectors: @yel@"+collectors, 16017);
			if ((attackers > 0) && (defenders > 0) && (healerss > 0) && (collectors > 0)){
				sendFrame126("@gre@Ready", 16018);
			} else {
				sendFrame126("@red@Not ready", 16018);
			}
			setInterfaceWalkable(16010);
		//} else {
		//}
	}
	
public void RoleSelect() {
			sendFrame126("@or1@          CLICK IN THE ROLE YOU WANT!!", 15986);
			sendFrame126("@whi@     Attacker must bla bla bla bla", 15982);
			sendFrame126("@whi@     Defender must bla bla bla bla", 15983);
			sendFrame126("@whi@     Healer must bla bla bla bla", 15984);
			sendFrame126("@whi@     Collector must bla bla bla bla", 15985);
			showInterface(15980);
	}

	public void WriteEnergy() {
		sendFrame126(playerEnergy + " ", 149);
	}

	public boolean process() {
//Writes players online to quest tab
			rightClickCheck();
			playersOnline();
			
			playerLevel[24] = total;
			playerLevel[22] = playerRank;
			
			/*if (assaulttime > 0) {
				assaulttime -= 1;
				if (inWaiterAssault()) {
					WaitAssaultInterface();
					//sendFrame126("@whi@Minutes till next game:@gre@"+assaulttime/120, 16013);
				}
			}

			if (assaulttime == 0) {
				assaulttime = 1200;		// 1200 * 0.5secs = 600secs = 10mins
			}*/
			
			
			
			if(inGame){
			PcPanel2();
			}
			if(inPcBoat()){
			PcPanel1();
			}
			if(dclaws == 3) {
			dclawed();
			}

			if(dclaws == 2) {
			startAnimation(2068);
			dclawed2();
			}

			if(dclaws == 1) {
			dclawed2();
			actionInterval = getbattleTimer() + getbattleTimer()/2;
			}

			if(dclaws > 0) {
			dclaws -= 1;
			}
			
			if ((IsAttackingNPC) && DCDamg == true ) {
			if (DCdown == 2 ) {
			startAnimation(2068);
			}
			SpecDamgNPC(30);
			DCdown -= 1;
			if (DCdown == 0 ) {
			DCDamg = false;
			}
			}
/*if(absX >= 3530 && absX <= 3630 && absY >= 9675 && absY <= 9775){
setInterfaceWalkable(4535);
sendFrame126("Kill Count: "+barrow+" ", 4536);//III
}*/
			if (EntangleDelay >= 1) {
			EntangleDelay -=1;
			}
 /*
if (IsAttacking == true && DCDamg == true ) {
if (DCdown == 2 ) {
startAnimation(2068);
}
SpecDamg(25);
DCdown -= 1;
if (DCdown == 0 ) {
DCDamg = false;
}
}*/
		if (playerEnergy < 100 && System.currentTimeMillis() - lastIncrease >= 4000) {
			playerEnergy += 1;
			WriteEnergy();
			lastIncrease = System.currentTimeMillis();
		}
		if (System.currentTimeMillis() - lastSave > 120000 && !inTrade){
			savegame(false);
			// sM("Your profile has been automatically saved");
			lastSave = System.currentTimeMillis();
		}
		if (System.currentTimeMillis() - lastBookSwitch > 30000 && switchingBook) {
			setSidebarInterface(6, 18787);
			lastBookSwitch = System.currentTimeMillis();
			switchingBook = false;
		}
		if (System.currentTimeMillis() - offTimer > 6000){
			hitID = 0;
		}
		if(System.currentTimeMillis() - lastSkull >= 1200000 && isSkulled){
			turnOffHead();
			updateRequired = true;
			appearanceUpdateRequired = true;
			isSkulled = false;
		}
		if (spellHitTimer > 0) {
			spellHitTimer -= 1;
		}
		if(poisoned && System.currentTimeMillis() - poisonDelay > 15000){
			poisonDmg = true;
			applyPoisonToMe();
			poisonDmg = false;
			poisonDelay = System.currentTimeMillis();
		}
		if(System.currentTimeMillis() - lastSpecial > 50000 && specialAmount < 100){
			specialAmount += 25;
			lastSpecial = System.currentTimeMillis();
			specAttack();
		}
		if (hasMultiSign && !multiCombat())
		{
			frame61(-1);
			hasMultiSign = false;
		}
				if (multiCombat())
			{
			frame61(1);
			hasMultiSign = false;
			}
		if (!hasMultiSign && !multiCombat())
		{
			frame61(-1);
			hasMultiSign = false;
		}
		if ((hasWildySign == true) && (!isInWilderness(absX, absY, 1)))
		{
		setInterfaceWalkable(-1);
		hasWildySign = false;
		wildysigndisappear();
		}
		if (isInWilderness(absX, absY, 1))
		{
			if (!hasWildySign)
			{
				hasWildySign = true;
				outStream.createFrame(208);
				outStream.writeWordBigEndian_dup(197);
				sendQuest("", 199);
			}
			int level = ((absY - 3520) / 8) + 1;
			sendQuest("Level: " + level, 199);
			if (level != wildyLevel)
			{
				wildyLevel = level;
				sendQuest("Level: " + wildyLevel, 199);
			}
				if (multiCombat())
			{
			frame61(1);
			hasMultiSign = false;
			}
		if (!multiCombat())
			{
			frame61(-1);
			hasMultiSign = false;
			}
		} 
		
		if (System.currentTimeMillis() - statIncrease > 120000) {
			for (int i1 = 0; i1 < playerLevel.length; i1++) {
				if (playerLevel[i1] < getLevelForXP(playerXP[i1])) {
					playerLevel[i1] += 1;
					setSkillLevel(i1, playerLevel[i1], playerXP[i1]);
					NewHP = playerLevel[3];
					refreshSkills();
				} else if (playerLevel[i1] > getLevelForXP(playerXP[i1])) {
					playerLevel[i1] -= 1;
					setSkillLevel(i1, playerLevel[i1], playerXP[i1]);
					NewHP = playerLevel[3];
					refreshSkills();
				}
			}
			statIncrease = System.currentTimeMillis();
		}	
		if(PlayerHandler.getPlayerID(playerName) != playerId){	
			disconnected = true;
		}

		if (inCombat) {
		long current = System.currentTimeMillis();
		if(current - lastCombat >= 10000) {
			inCombat = false;
		}
		}
		if (currentHealth < 1) {
			deathStage = 1;
		}
if(hitDiff > 0){
sendQuest("" + currentHealth, 4016);
}
if (NpcDialogue > 0 && NpcDialogueSend == false) {
UpdateNPCChat();
}
if(inGame && PlayerHandler.pcGameTimer == 1){
inGame = false;
resetpc();
toX = 2657;
toY = 2639;
playerLevel[0] = getLevelForXP(playerXP[0]);
playerLevel[1] = getLevelForXP(playerXP[1]);
playerLevel[2] = getLevelForXP(playerXP[2]);
playerLevel[4] = getLevelForXP(playerXP[4]);
playerLevel[5] = getLevelForXP(playerXP[5]);
playerLevel[6] = getLevelForXP(playerXP[6]);
sM("You failed to defeat Pest Control narb, better luck next time!");
ResetAttackNPC();
refreshSkills();
}
if(inPcBoat() && PlayerHandler.pcWaitTimer == 1 && !inGame){
inGame = true;
resetpc();
toX = 2658 + misc.random(1);
toY = 2611 + misc.random(3);
server.npcHandler.spawnANPC(3777, 2628, 2591,0);
server.npcHandler.spawnANPC(3778, 2680, 2588,0);
server.npcHandler.spawnANPC(3779, 2669, 2570,0);
server.npcHandler.spawnANPC(3780, 2645, 2569,0);
PlayerHandler.portal1 = 0;
PlayerHandler.portal2 = 0;
PlayerHandler.portal3 = 0;
PlayerHandler.portal4 = 0;
PlayerHandler.Waiters = 0;
ResetAttackNPC();
}
if(PlayerHandler.portal1 == 1 && PlayerHandler.portal2 == 1 && PlayerHandler.portal3 == 1 && PlayerHandler.portal4 == 1 && inGame){
inGame = false;
resetpc();
pcPoints += 5;
toX = 2657;
toY = 2639;
playerLevel[0] = getLevelForXP(playerXP[0]);
playerLevel[1] = getLevelForXP(playerXP[1]);
playerLevel[2] = getLevelForXP(playerXP[2]);
playerLevel[4] = getLevelForXP(playerXP[4]);
playerLevel[5] = getLevelForXP(playerXP[5]);
playerLevel[6] = getLevelForXP(playerXP[6]);
sM("You have defeated pest control! You now have "+pcPoints+" points!");
ResetAttackNPC();
refreshSkills();
PlayerHandler.pcWaitTimer = 50;
}
	if (followID > 0) {
		followDirection();
	}
	if (followID2 > 0) {
		followDirection2();
	}		
	if (System.currentTimeMillis()-tTime13 >= 450 && digging == true) {
	resetAnimation();
	digging = false;
	}
    if (tStage == 1 && tTime == 0) {
      setAnimation(1979);
      lowGFX(392, 0);
      updateRequired = true;
      appearanceUpdateRequired = true;
      tTime = System.currentTimeMillis();
      tStage = 2;
    }
      if (tStage == 2 && System.currentTimeMillis()-tTime >= 2200) {
      toX = tX;
      toY = tY;
      heightLevel = tH;
      updateRequired = true;
      appearanceUpdateRequired = true;
      tStage = 0;
      tTime = 0;
      resetAnimation();
      resetfollowers();
      closeInterface();
    }
    if (tStage == 3 && tTime2 == 0) {
      setAnimation(3421);
      updateRequired = true;
      appearanceUpdateRequired = true;
      tTime2 = System.currentTimeMillis();
      tStage = 4;
    }
    if (tStage == 4 && System.currentTimeMillis()-tTime2 >= 450) {
      specGFX(601);
      tStage = 5;
    }
    if (tStage == 5 && System.currentTimeMillis()-tTime2 >= 1250) {
      setAnimation(3422);
      specGFX(601);
      toX = tX;
      toY = tY;
      heightLevel = tH;
      updateRequired = true;
      appearanceUpdateRequired = true;
      tStage = 0;
      tTime = 0;
      resetAnimation();
      resetfollowers();
      closeInterface();
    }
		/** Full magic spell system for process() starts here * */
		if (spellHitTimer == 0) {
			if (castSpell) {
				castSpell = false;
				if (isSpellNPC && (spellNpcIndex != -1)) {
					appendHitToNpc(spellNpcIndex, spellHit, isStillSpell);
				} else if (!isSpellNPC && (spellPlayerIndex != -1)) {
					appendHitToPlayer(spellPlayerIndex, spellHit, isStillSpell);
			}
		}
			spellHitTimer = -1; // FIXED: Why call this over and over? -.-
			// -bakatool
	}
		/** Full magic spell system for process() ends here * */
		if (WaveDelay > 0) {
			WaveDelay -= 1;
		}
if(System.currentTimeMillis() - lastArrow > 500 && arrow){
int arrowgfx = getarrowgfxnow();
if(AttackingOn > 0){
rangeGFX(70, arrowgfx);
}
if(attacknpc > 0){
rangeGFXNPC(70, arrowgfx);
}
arrow = false;
arrow2 = true;
}
if(System.currentTimeMillis() - lastArrow > 1500 && arrow2){
lastArrow = System.currentTimeMillis();
arrow2 = false;
if(AttackingOn > 0 && isInWilderness(absX, absY, 1) == true && getClient(AttackingOn).isInWilderness(getClient(AttackingOn).absX, getClient(AttackingOn).absY, 1) == true){
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
if(AttackingOn2 != null){
hitDiff = misc.random(maxRangeHit());
PlayerHandler.players[AttackingOn].hitDiff = hitDiff;
PlayerHandler.players[AttackingOn].updateRequired = true;
PlayerHandler.players[AttackingOn].appearanceUpdateRequired = true;
PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
PlayerHandler.players[AttackingOn].dealDamage(hitDiff);
PlayerHandler.players[AttackingOn].offTimer = System.currentTimeMillis();
PlayerHandler.players[AttackingOn].hitID = playerId;
PlayerHandler.players[AttackingOn].KilledBy[playerId] += hitDiff;
}
}
if(attacknpc > 0){
server.npcHandler.npcs[attacknpc].hitDiff = npcRangeDamage();
server.npcHandler.npcs[attacknpc].updateRequired = true;
server.npcHandler.npcs[attacknpc].hitUpdateRequired = true;
server.npcHandler.npcs[attacknpc].hit = true;
}
}
	if(apickupid > 0)
		scanPickup();

        if(WaveDelay <= 0 && TzWave != -1 && IsInFightCave())
        {
	    heightLevel = getHeightForTzhaar();
            WaveDelay = 0x3b9ac9ff;
            SpawnNewWave();
        }
        if ((IsAttackingNPC) && DDS2Damg == true && System.currentTimeMillis() - lastDds > ddsInterval) {
            SpecDamgNPC(playerMaxHit + 8);
            DDS2Damg = false;
        }
        if (IsAttacking == true && DDS2Damg == true && System.currentTimeMillis() - lastDds > ddsInterval) {
		if (AttackingOn > 0) {
	    		getHitDouble(8);	
            		DDS2Damg = false;
		}
	}
        if (IsAttacking == true && DDS2Damg2 == true && System.currentTimeMillis() - lastDds > ddsInterval) {
		if (AttackingOn > 0) {
			if(playerEquipment[playerWeapon] == 4827){
	    			getHit2();	
            			DDS2Damg2 = false;
			}
			if(playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096){
	    			getHit2();
	    			DDS2Damg2 = false;
			}
		}
	}
	if (IsAttackingNPC == true && DDS2Damg2 == true && System.currentTimeMillis() - lastDds > ddsInterval) {
		if (attacknpc > 0){
			if(playerEquipment[playerWeapon] == 4827){
	    			getHit2();
            			DDS2Damg2 = false;
			}
			if(playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096){
	    			getHit2();
	    			DDS2Damg2 = false;
			}
		}
	}
        if (IsAttacking == true && DDS2Damg3 == true && System.currentTimeMillis() - lastDds > ddsInterval) {
	    getHit2();
	    DDS2Damg3 = false;
	}
if(playerLevel[5] < 0){
playerLevel[5] = 0;
sendQuest("" + playerLevel[5] + "", 4012);
sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
}
if(checkPrayOn() && playerLevel[5] < 1){
playerLevel[5] = 0;
prayOff();
}
if(checkPrayOn() && System.currentTimeMillis() - lastPray > prayInterval){
prayInterval = checkPrayStat();
lastPray = System.currentTimeMillis();
prayerDrain();
sendQuest("" + playerLevel[5] + "", 4012);
sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
}
			if (originalS > 0) {
				wear(originalS, playerShield);
			}
		if (inTrade && tradeResetNeeded) {
			client o = getClient(trade_reqId);
			if (o.tradeResetNeeded) {
				resetTrade();
				o.resetTrade();
			}
		}
		// Shop
		if (UpdateShop == true) {
			resetItems(3823);
			resetShop(MyShopID);
		}

		// check banking
		if (WanneBank > 0) {
			if (GoodDistance(skillX, skillY, absX, absY, WanneBank) == true) {
				openUpBank();
				WanneBank = 0;
			}
		}
		// check stairs
		if (stairs > 0) {
			if (GoodDistance(skillX, skillY, absX, absY, stairDistance) == true) {
				stairs(stairs, absX, absY);
			}
		}
		// check shopping
		if (WanneShop > 0) {
			if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
				openUpShop(WanneShop);
				WanneShop = 0;
			}
		}
		// woodcutting check
		if (woodcutting[0] > 0) {
			if (GoodDistance(skillX, skillY, absX, absY, woodcutting[5]) == true) {
				closeInterface();
				woodcutting();
			}
		}
		// Attacking in wilderness
		//long thisTime = System.currentTimeMillis();
		if ((IsAttacking == true) && (deathStage == 0)
				&& (System.currentTimeMillis() - lastAction > actionInterval)) {
			if (PlayerHandler.players[AttackingOn] != null) {
				if (PlayerHandler.players[AttackingOn].currentHealth > 0) {
					Attack();
				} else {

					//ResetAttack();
					// if(duelStatus == 3)
					// DuelVictory(p.absX, p.absY);

				}
			} else {
				ResetAttack();
			}
		}
		// Attacking an NPC
		if ((IsAttackingNPC == true) && (deathStage == 0) && System.currentTimeMillis() - lastAction > actionInterval) {
			if (server.npcHandler.npcs[attacknpc] != null) {
				if ((server.npcHandler.npcs[attacknpc].IsDead == false)
						&& (server.npcHandler.npcs[attacknpc].MaxHP > 0)) {
					AttackNPC();
				} else {
					//ResetAttackNPC();
				}
			} else {
				ResetAttackNPC();
			}
		}
		// If killed apply dead
		if (deathStage == 1) {
			if (attacknpc > 0) { // was killed by a npc -bakatool
				server.npcHandler.ResetAttackPlayer(attacknpc);
			}
			ResetAttack();
			ResetAttackNPC();

			deathStage = 2;
			poisoned = false;
			poisonDmg = false;
			fighting = false;
			hits = 0;
			startAnimation(0x900);
			updateRequired = true;
			appearanceUpdateRequired = true;
			deathTimer = System.currentTimeMillis();
			currentHealth = playerLevel[playerHitpoints];
			playerLevel[0] = getLevelForXP(playerXP[0]);
			playerLevel[1] = getLevelForXP(playerXP[1]);
			playerLevel[2] = getLevelForXP(playerXP[2]);
			playerLevel[4] = getLevelForXP(playerXP[4]);
			playerLevel[5] = getLevelForXP(playerXP[5]);
			playerLevel[6] = getLevelForXP(playerXP[6]);
			sendFrame126("Prayer: "+playerLevel[5]+"/"+getLevelForXP(playerXP[5])+"", 687);
			resetfollowers();
			refreshSkills();
			killMyNPCs();
			resetKnight();
			skulledBy = "";
headIcon = 0;
		}
		if (!inFunPK() && !IsInFightCave() && !isInPitGame() && !isInCastleWars() && !isInPitRoom() && playerRights != 2 && playerRights != 3 && action != 1 && deathStage == 2 &&  System.currentTimeMillis() - deathTimer >= 2500) {
		client killerz = (client) server.playerHandler.players[KillerId];
		youdied();
		killmessage();
		}
		if (deathStage == 2 && System.currentTimeMillis() - deathTimer >= 2500 && isInPitGame() && !IsInFightCave() && !isInCastleWars() && !inFunPK()) {
			toX = 2399;
			toY = 5171;
			inPitsGame = false;
			PlayerHandler.playersInPit -= 1;
			AtkPray = 0;
			StrPrayer = 0;
			DefPray = 0;
			RangePray = 0;
			MagePray = 0;
			PrayHeal = false;
			ProtItem = false;
			ProtMage = false;
			ProtRange = false;
			ProtMelee = false;
			Redemption = false;
			Retribution = false;
			Smite = false;
			Chivalry = false;
			Piety = false;
			isSkulled = false;
			lastSkull = 0;
			headIcon = 0;
			turnpray();
			heightLevel = 0;
			currentHealth = playerLevel[playerHitpoints];
			deathStage = 0;
			resetAnimation();
			frame1();
			prayOn = false;
			AntiTeleDelay = 0;
			EntangleDelay = 0;
headIcon = 0;
skulls = 0;
isSkulled = false;
			sM("Oh dear you have died!");
            		resetOtherAtk();
			followID = 0;
			followID2 = 0;
		}
		if (deathStage == 2 && System.currentTimeMillis() - deathTimer >= 2500 && !isInPitGame() && !IsInFightCave() && !isInCastleWars() && inFunPK()) {
			toX = 3222+misc.random(1);
			toY = 3218+misc.random(1);
			AtkPray = 0;
			StrPrayer = 0;
			DefPray = 0;
			RangePray = 0;
			MagePray = 0;
			PrayHeal = false;
			ProtItem = false;
			ProtMage = false;
			ProtRange = false;
			ProtMelee = false;
			Redemption = false;
			Retribution = false;
			Smite = false;
			Chivalry = false;
			Piety = false;
			isSkulled = false;
			lastSkull = 0;
			headIcon = 0;
			turnpray();
			heightLevel = 0;
			currentHealth = playerLevel[playerHitpoints];
			deathStage = 0;
			resetAnimation();
			frame1();
			prayOn = false;
			AntiTeleDelay = 0;
			EntangleDelay = 0;
headIcon = 0;
skulls = 0;
isSkulled = false;
			sM("Oh dear you have died in Fun PK!");
            		resetOtherAtk();
			followID = 0;
			followID2 = 0;
		}
		if (deathStage == 2 && System.currentTimeMillis() - deathTimer >= 2500 && !isInPitGame() && !IsInFightCave() && !inFunPK() && isInCastleWars()) {
			toX = 2441;
			toY = 3092;
			AtkPray = 0;
			StrPrayer = 0;
			DefPray = 0;
			RangePray = 0;
			MagePray = 0;
			PrayHeal = false;
			ProtItem = false;
			ProtMage = false;
			ProtRange = false;
			ProtMelee = false;
			Redemption = false;
			Retribution = false;
			Smite = false;
			Chivalry = false;
			Piety = false;
			isSkulled = false;
			lastSkull = 0;
			headIcon = 0;
			turnpray();
			heightLevel = 0;
			currentHealth = playerLevel[playerHitpoints];
			deathStage = 0;
			resetAnimation();
			frame1();
			prayOn = false;
			AntiTeleDelay = 0;
			EntangleDelay = 0;
isSkulled = false;
headIcon = 0;
skulls = 0;
			sM("Oh dear you have died!");
            		resetOtherAtk();
			followID = 0;
			followID2 = 0;
		}
		if (deathStage == 2 && System.currentTimeMillis() - deathTimer >= 2500 && !isInPitGame() && !isInCastleWars() && !inFunPK() && IsInFightCave()) {
		toX = 2439;
		toY = 5169;
			AtkPray = 0;
			StrPrayer = 0;
			DefPray = 0;
			RangePray = 0;
			MagePray = 0;
			PrayHeal = false;
			ProtItem = false;
			ProtMage = false;
			ProtRange = false;
			ProtMelee = false;
			Redemption = false;
			Retribution = false;
			Smite = false;
			Chivalry = false;
			Piety = false;
			isSkulled = false;
			lastSkull = 0;
			headIcon = 0;
			turnpray();
			heightLevel = 0;
			currentHealth = playerLevel[playerHitpoints];
			deathStage = 0;
			resetAnimation();
			frame1();
			prayOn = false;
headIcon = 0;
skulls = 0;
			sM("Oh dear you have died!");
            		resetOtherAtk();
		}
		if (deathStage == 2 && System.currentTimeMillis() - deathTimer >= 2500 && !isInPitGame() && !isInCastleWars() && !inFunPK() && !IsInFightCave()) {
			toX = 3222+misc.random(1);
			toY = 3218+misc.random(1);
			AtkPray = 0;
			StrPrayer = 0;
			DefPray = 0;
			RangePray = 0;
			MagePray = 0;
			PrayHeal = false;
			ProtItem = false;
			ProtMage = false;
			ProtRange = false;
			ProtMelee = false;
			Redemption = false;
			Retribution = false;
			Smite = false;
			Chivalry = false;
			Piety = false;
			isSkulled = false;
			lastSkull = 0;
			headIcon = 0;
			turnpray();
			heightLevel = 0;
			currentHealth = playerLevel[playerHitpoints];
			deathStage = 0;
			resetAnimation();
			frame1();
			prayOn = false;
headIcon = 0;
skulls = 0;
			sM("Oh dear you have died!");
            		resetOtherAtk();
			if (destruct)
			{
			toX = 3222+misc.random(1);
			toY = 3218+misc.random(1);
			}
			savegame(false);
		}
		// mining check
		if (mining[0] > 0) {
			if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
				mining();
			}
		}
		if (shafting
				&& (System.currentTimeMillis() - lastAction >= 1500)) {
			lastAction = System.currentTimeMillis();
			shaft();
		} else if (fletching
				&& (System.currentTimeMillis() - lastAction >= 1900)) {
			lastAction = System.currentTimeMillis();
			fletchBow();
		} else if (spinning
				&& (System.currentTimeMillis() - lastAction >= 1900)) {
			lastAction = System.currentTimeMillis();
			spin();
		} else if (cookingOn
				&& (System.currentTimeMillis() - lastAction >= 1900)) {
			lastAction = System.currentTimeMillis();
			cookFish();
		} else if (crafting
				&& (System.currentTimeMillis() - lastAction >= 1500)) {
			lastAction = System.currentTimeMillis();
			craft();
		} else if (fishing && (System.currentTimeMillis() - lastAction >= 3000)) {
			lastAction = System.currentTimeMillis();
			fish(fishId);
		} else if (essMine && (System.currentTimeMillis() - lastAction >= 3000) && freeSlots() != 0) {
			lastAction = System.currentTimeMillis();
			addItem(1436, 1);
			addSkillXP(350, 14);
		}

		if (isKicked) {
			disconnected = true;
			if (saveNeeded)
				savegame(true);
			outStream.createFrame(109);
		}


		return false;
	}
    public boolean packetProcess() {
		if (disconnected || destruct) {
			return false;
		}
        try {
            if (timeOutCounter++ > 20/* && logoutButton*/) {
                misc.println("Disconnected "+playerName+", Data transfer timeout.");
                disconnected = true;
                return false;
            }
            if(in == null) return false;
            int avail = in.available();
            if(avail == 0) return false;

            if(packetType == -1) {
                packetType = in.read() & 0xff;
                if(inStreamDecryption != null)
                    packetType = packetType - inStreamDecryption.getNextKey() & 0xff;
                packetSize = packetSizes[packetType];
                avail--;
            }
            if(packetSize == -1) {
                if(avail > 0) {
                    packetSize = in.read() & 0xff;
                    avail--;
                }
                else return false;
            }
            if(avail < packetSize) return false;
            fillInStream(packetSize);
            timeOutCounter = 0;
            parseIncomingPackets();
            packetType = -1;
        } catch(java.lang.Exception __ex) {
            misc.println("Exception encountered while parsing incoming packets from "+playerName+".");
            __ex.printStackTrace(); 
            disconnected = true;
        }
        return true;
    }
	public void remove(int wearID, int slot) {
		//server.checkPlayerCapes.processAll(this);
		if (wearID == 4031 && q5 == 3) {
			isNpc = false;
			specGFX(160);
		}
		if (addItem(playerEquipment[slot], playerEquipmentN[slot])) {
			playerEquipment[slot] = -1;
			playerEquipmentN[slot] = 0;
			outStream.createFrame(34);
			outStream.writeWord(6);
			outStream.writeWord(1688);
			outStream.writeByte(slot);
			outStream.writeWord(0);
			outStream.writeByte(0);
			ResetBonus();
			GetBonus();
			WriteBonus();
			if (slot == playerWeapon) {
			autocasting = false;
			autocastID = 0;
			setClientConfig(108, 0);
			SendWeapon(-1, "Unarmed");
			playerSE = 0x328; // SE = Standard Emotion
			playerSEA = 0x326; // SEA = Standard Emotion Attack
			playerSER = 0x338; // SER = Standard Emotion Run
			playerSEW = 0x333; // SEW = Standard Emotion Walking
			pEmote = 0x328; // this being the original standing state
			}
			updateRequired = true;
			appearanceUpdateRequired = true;
		}
	}

	public void removeAllItems() {
		for (int i = 0; i < playerItems.length; i++) {
			playerItems[i] = 0;
		}
		for (int i = 0; i < playerItemsN.length; i++) {
			playerItemsN[i] = 0;
		}
		resetItems(3214);
	}

	public void RemoveAllWindows() {
		outStream.createFrame(219);
		flushOutStream();
	}

	public void removeGroundItem(int itemX, int itemY, int itemID) {
		// Phate: remoevs an item from absolute X and Y
		outStream.createFrame(85); // Phate: Item Position Frame
		outStream.writeByteC((itemY - 8 * mapRegionY));
		outStream.writeByteC((itemX - 8 * mapRegionX));
		outStream.createFrame(156); // Phate: Item Action: Delete
		outStream.writeByteS(0); // x(4 MSB) y(LSB) coords
		outStream.writeWord(itemID); // Phate: Item ID
		// misc.printlnTag("RemoveGroundItem "+itemID+" "+(itemX - 8 *
		// mapRegionX)+","+(itemY - 8 * mapRegionY));
	}

	public void replaceDoors() {
		for (int d = 0; d < server.doorHandler.doorX.length; d++) {
			if ((server.doorHandler.doorX[d] > 0)
					&& (server.doorHandler.doorHeight[d] == heightLevel)
					&& (Math.abs(server.doorHandler.doorX[d] - absX) <= 120)
					&& (Math.abs(server.doorHandler.doorY[d] - absY) <= 120)) {
				ReplaceObject(server.doorHandler.doorX[d],
						server.doorHandler.doorY[d],
						server.doorHandler.doorId[d],
						server.doorHandler.doorFace[d], 0);
			}
		}
	}

	public void ReplaceObject(int objectX, int objectY, int NewObjectID,
			int Face, int ObjectType) {
		outStream.createFrame(85);
		outStream.writeByteC(objectY - (mapRegionY * 8));
		outStream.writeByteC(objectX - (mapRegionX * 8));

		outStream.createFrame(101);
		outStream.writeByteC((ObjectType << 2) + (Face & 3));
		outStream.writeByte(0);

		if (NewObjectID != -1) {
			outStream.createFrame(151);
			outStream.writeByteS(0);
			outStream.writeWordBigEndian(NewObjectID);
			outStream.writeByteS((ObjectType << 2) + (Face & 3));
			// FACE: 0= WEST | -1 = NORTH | -2 = EAST | -3 = SOUTH
			// ObjectType: 0-3 wall objects, 4-8 wall decoration, 9: diag.
			// walls, 10-11 world objects, 12-21: roofs, 22: floor decoration
		}
	}

	public void ReplaceObject2(int objectX, int objectY, int NewObjectID,
			int Face, int ObjectType) {
		outStream.createFrame(85);
		outStream.writeByteC(objectY - (mapRegionY * 8));
		outStream.writeByteC(objectX - (mapRegionX * 8));

		outStream.createFrame(101);
		outStream.writeByteC((ObjectType << 2) + (Face & 3));
		outStream.writeByte(0);

		if (NewObjectID != -1) {
			outStream.createFrame(151);
			outStream.writeByteS(0);
			outStream.writeWordBigEndian(NewObjectID);
			outStream.writeByteS((ObjectType << 2) + (Face & 3));
			// FACE: 0= WEST | -1 = NORTH | -2 = EAST | -3 = SOUTH
			// ObjectType: 0-3 wall objects, 4-8 wall decoration, 9: diag.
			// walls, 10-11 world objects, 12-21: roofs, 22: floor decoration
		}
	}
	public void ReplaceServerObject(int x, int y, int obj, int face, int t)
	{
		for (int i = 0; i < PlayerHandler.maxPlayers; i++)
		{
			client c = (client) PlayerHandler.players[i];
			if (c == null || c.disconnected)
				continue;
			c.ReplaceObject2(x, y, obj, face, t);
		}
	}

	public void resetAction() {
		resetAction(true);
	}

	public void resetAction(boolean full) {
		shafting = false;
		spinning = false;
		crafting = false;
		fishing = false;
		essMine = false;
		if (fletching) {
			// playerEquipment[playerWeapon] = originalW;
			// playerEquipment[playerWeapon] = originalS;
			updateRequired = true;
			appearanceUpdateRequired = true;
		}
		fletching = false;
		if (full)
			resetAnimation();
	}

	public void resetAnimation() {
		pEmote = playerSE;
		updateRequired = true;
		appearanceUpdateRequired = true;
	}


	public boolean ResetAttack() {
		IsAttacking = false;
		AttackingOn = 0;
		resetAnimation();
		IsUsingSkill = false;
		followID = 0;
		return true;
	}
	public boolean ResetAttackNPC() {
		if ((attacknpc > -1) && (attacknpc < server.npcHandler.maxNPCSpawns)) {
			server.npcHandler.npcs[attacknpc].IsUnderAttack = false;
			server.npcHandler.npcs[attacknpc].IsUnderAttack = false;
			server.npcHandler.npcs[attacknpc].StartKilling = 0;
		}
		// server.npcHandler.npcs[attacknpc].TurnNPCTo(server.npcHandler.npcs[attacknpc].absX,
		// server.npcHandler.npcs[attacknpc].absY);
		// server.npcHandler.npcs[attacknpc].FocusUpdateRequired = true;
		IsAttackingNPC = false;
		attacknpc = -1;
		resetAnimation();
		faceNPC = 65535;
            	faceNPCupdate = true;
		followID2 = 0;
		return true;
	}

	public boolean ResetAttackPlayer(int NPCID) {
		server.npcHandler.npcs[NPCID].IsUnderAttack = false;
		server.npcHandler.npcs[NPCID].StartKilling = 0;
		server.npcHandler.npcs[NPCID].RandomWalk = true;
		server.npcHandler.npcs[NPCID].animNumber = 0x328;
		server.npcHandler.npcs[NPCID].animUpdateRequired = true;
		server.npcHandler.npcs[NPCID].updateRequired = true;
        	faceNPC = 65535;
            	faceNPCupdate = true;
		return true;
	}

	public void resetBank() {
		outStream.createFrameVarSizeWord(53);
		outStream.writeWord(5382); // bank
		outStream.writeWord(playerBankSize); // number of items
		for (int i = 0; i < playerBankSize; i++) {
			if (bankItemsN[i] > 254) {
				outStream.writeByte(255);
				outStream.writeDWord_v2(bankItemsN[i]);
			} else {
				outStream.writeByte(bankItemsN[i]); // amount
			}
			if (bankItemsN[i] < 1) {
				bankItems[i] = 0;
			}
			if ((bankItems[i] > 20000) || (bankItems[i] < 0)) {
				bankItems[i] = 20000;
			}
			outStream.writeWordBigEndianA(bankItems[i]); // itemID
		}
		outStream.endFrameVarSizeWord();
	}

	public void ResetBonus() {
		for (int i = 0; i < playerBonus.length; i++) {
			playerBonus[i] = 0;
		}
	}
	public void resetItems(int WriteFrame) {
		outStream.createFrameVarSizeWord(53);
		outStream.writeWord(WriteFrame);
		outStream.writeWord(playerItems.length);
		for (int i = 0; i < playerItems.length; i++) {
			if (playerItemsN[i] > 254) {
				outStream.writeByte(255); // item's stack count. if over 254,
				// write byte 255
				outStream.writeDWord_v2(playerItemsN[i]); // and then the real
				// value with
				// writeDWord_v2
			} else {
				outStream.writeByte(playerItemsN[i]);
			}
			if ((playerItems[i] > 20000) || (playerItems[i] < 0)) {
				playerItems[i] = 20000;
			}
			outStream.writeWordBigEndianA(playerItems[i]); // item id
		}
		outStream.endFrameVarSizeWord();
	}

	public boolean resetMI() {
		mining[0] = 0;
		mining[1] = 0;
		mining[2] = 0;
		mining[4] = 0;
		skillX = -1;
		skillY = -1;
		IsMining = false;
		IsUsingSkill = false;
		return true;
	}

	public void resetOTItems(int WriteFrame) {
		client other = getClient(trade_reqId);
		if (!validClient(trade_reqId))
			return;
		outStream.createFrameVarSizeWord(53);
		outStream.writeWord(WriteFrame);
		int len = other.offeredItems.toArray().length;
		int current = 0;
		outStream.writeWord(len);
		for (GameItem item : other.offeredItems) {
			if (item.amount > 254) {
				outStream.writeByte(255); // item's stack count. if over 254,
				// write byte 255
				outStream.writeDWord_v2(item.amount); // and then the real
				// value with
				// writeDWord_v2
			} else {
				outStream.writeByte(item.amount);
			}
			outStream.writeWordBigEndianA(item.id + 1); // item id
			current++;
		}
		if (current < 27) {
			for (int i = current; i < 28; i++) {
				outStream.writeByte(1);
				outStream.writeWordBigEndianA(-1);
			}
		}
		outStream.endFrameVarSizeWord();
	}

	public void resetPos() {
		toX = 2999+misc.random(3);
		toY = 3377+misc.random(3);
		heightLevel = 0;
	}

	public void resetShop(int ShopID) {
		int TotalItems = 0;

		for (int i = 0; i < server.shopHandler.MaxShopItems; i++) {
			if (server.shopHandler.ShopItems[ShopID][i] > 0) {
				TotalItems++;
			}
		}
		if (TotalItems > server.shopHandler.MaxShopItems) {
			TotalItems = server.shopHandler.MaxShopItems;
		}
		outStream.createFrameVarSizeWord(53);
		outStream.writeWord(3900);
		outStream.writeWord(TotalItems);
		int TotalCount = 0;

		for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
			if ((server.shopHandler.ShopItems[ShopID][i] > 0)
					|| (i <= server.shopHandler.ShopItemsStandard[ShopID])) {
				if (server.shopHandler.ShopItemsN[ShopID][i] > 254) {
					outStream.writeByte(255); // item's stack count. if over
					// 254, write byte 255
					outStream
							.writeDWord_v2(server.shopHandler.ShopItemsN[ShopID][i]); // and
					// then
					// the
					// real
					// value
					// with
					// writeDWord_v2
				} else {
					outStream
							.writeByte(server.shopHandler.ShopItemsN[ShopID][i]);
				}
				if ((server.shopHandler.ShopItems[ShopID][i] > 20000)
						|| (server.shopHandler.ShopItems[ShopID][i] < 0)) {
					server.shopHandler.ShopItems[ShopID][i] = 20000;
				}
				outStream
						.writeWordBigEndianA(server.shopHandler.ShopItems[ShopID][i]); // item
				// id
				TotalCount++;
			}
			if (TotalCount > TotalItems) {
				break;
			}
		}
		outStream.endFrameVarSizeWord();
	}


	public void resetTItems(int WriteFrame) {
		outStream.createFrameVarSizeWord(53);
		outStream.writeWord(WriteFrame);
		int len = offeredItems.toArray().length;
		int current = 0;
		outStream.writeWord(len);
		for (GameItem item : offeredItems) {
			if (item.amount > 254) {
				outStream.writeByte(255); // item's stack count. if over 254,
				// write byte 255
				outStream.writeDWord_v2(item.amount); // and then the real
				// value with
				// writeDWord_v2
			} else {
				outStream.writeByte(item.amount);
			}
			outStream.writeWordBigEndianA(item.id + 1); // item id
			current++;
		}
		if (current < 27) {
			for (int i = current; i < 28; i++) {
				outStream.writeByte(1);
				outStream.writeWordBigEndianA(-1);
			}
		}
		outStream.endFrameVarSizeWord();
	}

	public void resetTrade() {
		offeredItems.clear();
		inTrade = false;
		trade_reqId = 0;
		canOffer = true;
		tradeConfirmed = false;
		tradeConfirmed2 = false;
		closeInterface();
		tradeResetNeeded = false;
		sendQuest("Are you sure you want to make this trade?", 3535);
	}

	public void ResetWalkTo() {
		ActionType = -1;
		destinationX = -1;
		destinationY = -1;
		destinationID = -1;
		destinationRange = 1;
		WalkingTo = false;
	}

	public boolean resetWC() {
		woodcutting[0] = 0;
		woodcutting[1] = 0;
		woodcutting[2] = 0;
		woodcutting[4] = 0;
		woodcutting[5] = 2;
		skillX = -1;
		skillY = -1;
		IsCutting = false;
		IsUsingSkill = false;
		resetAnimation();
		return true;
	}


	public void robfail() {
		EntangleDelay = 10;
	}
public void nearNPC() {
		for (int i = 0; i < server.npcHandler.maxNPCs; i++) {
			if (server.npcHandler.npcs[i] != null && server.npcHandler.npcs[i].npcType == 1505) {
if(GoodDistance(server.npcHandler.npcs[i].absX, server.npcHandler.npcs[i].absY, absX, absY, 1) && npcId != 1463){
server.npcHandler.npcs[i].animNumber = 1402;
server.npcHandler.npcs[i].updateRequired = true;
server.npcHandler.npcs[i].animUpdateRequired = true;
toX = 2772;
toY = 2794;
hitDiff = 10;
currentHealth -= hitDiff;
updateRequired = true;
hitUpdateRequired = true;
}
}
}
}
	public void run() {
		// we just accepted a new connection - handle the login stuff
		isActive = false;
		long serverSessionKey = 0, clientSessionKey = 0;

		// randomize server part of the session key
		serverSessionKey = ((long) (java.lang.Math.random() * 99999999D) << 32)
				+ (long) (java.lang.Math.random() * 99999999D);

		try {
			fillInStream(2);
			if (inStream.readUnsignedByte() != 14) {
				mySock.close();
				shutdownError("Expected login Id 14 from client.");
				disconnected = true;
				return;
			}
			// this is part of the usename. Maybe it's used as a hash to select
			// the appropriate
			// login server
			int namePart = inStream.readUnsignedByte();
			for (int i = 0; i < 8; i++) {
				out.write(1);
			} // is being ignored by the client

			// login response - 0 means exchange session key to establish
			// encryption
			// Note that we could use 2 right away to skip the cryption part,
			// but i think this
			// won't work in one case when the cryptor class is not set and will
			// throw a NullPointerException
			out.write(0);

			// send the server part of the session Id used (client+server part
			// together are used as cryption key)
			outStream.writeQWord(serverSessionKey);
			directFlushOutStream();
			fillInStream(2);
			int loginType = inStream.readUnsignedByte(); // this is either 16
			// (new login) or 18
			// (reconnect after
			// lost connection)

			if ((loginType != 16) && (loginType != 18)) {
				shutdownError("Unexpected login type " + loginType);
				return;
			}
			int loginPacketSize = inStream.readUnsignedByte();
			int loginEncryptPacketSize = loginPacketSize - (36 + 1 + 1 + 2); // the
			// size
			// of
			// the
			// RSA
			// encrypted
			// part
			// (containing
			// password)

			// misc.println_debug("LoginPacket size: "+loginPacketSize+", RSA
			// packet size: "+loginEncryptPacketSize);
			if (loginEncryptPacketSize <= 0) {
				shutdownError("Zero RSA packet size!");
				return;
			}
			fillInStream(loginPacketSize);
			/*if ((inStream.readUnsignedByte() != 255)
					|| (inStream.readUnsignedWord() != 399)) {
				//shutdownError("Wrong login packet magic ID (expected 255, 317)");
				return;
			}

			if ((inStream.readUnsignedByte() != 255)
					|| (inStream.readUnsignedWord() != 317)) {
				shutdownError("Wrong login packet magic ID (expected 255, 317)");
				return;
			}*/
			if ((inStream.readUnsignedByte() != 255)
					|| (inStream.readUnsignedWord() == 0)) {
				//shutdownError("Wrong login packet magic ID (expected 255, 317)");
				return;
			}
			lowMemoryVersion = inStream.readUnsignedByte();
			// misc.println_debug("Client type: "+((lowMemoryVersion==1) ? "low"
			// : "high")+" memory version");
			for (int i = 0; i < 9; i++) {
				String junk = Integer.toHexString(inStream.readDWord());
				// misc.println_debug("dataFileVersion["+i+"]:
				// 0x"+Integer.toHexString(inStream.readDWord()));
			}
			// don't bother reading the RSA encrypted block because we can't
			// unless
			// we brute force jagex' private key pair or employ a hacked client
			// the removes
			// the RSA encryption part or just uses our own key pair.
			// Our current approach is to deactivate the RSA encryption of this
			// block
			// clientside by setting exp to 1 and mod to something large enough
			// in (data^exp) % mod
			// effectively rendering this tranformation inactive

			loginEncryptPacketSize--; // don't count length byte
			int tmp = inStream.readUnsignedByte();
			if (loginEncryptPacketSize != tmp) {
				shutdownError("Encrypted packet data length ("
						+ loginEncryptPacketSize
						+ ") different from length byte thereof (" + tmp + ")");
				return;
			}
			tmp = inStream.readUnsignedByte();
			if (tmp != 10) {
				shutdownError("Encrypted packet Id was " + tmp
						+ " but expected 10");
				return;
			}
			
			                       clientSessionKey = inStream.readQWord();
            serverSessionKey = inStream.readQWord();
            int UID = inStream.readDWord();
	if(UID <= 0)
        if(UID <= 1)
        if(UID <= 43904281) {
disconnected = true;
return;
}
            playerName = inStream.readString();
            playerName.toLowerCase();
			if ((playerName == null) || (playerName.length() == 0)) {
				//playerName = "player" + playerId;
				disconnected = true;
			}
			if ((playerName == "")) {
				disconnected = true;
			}
            playerPass = inStream.readString();

			try {
				playerServer = inStream.readString();
			} catch (Exception e) {
				playerServer = "sinzscapepwnz.no-ip.biz";
			}

			playerName = playerName.toLowerCase();
			playerPass = playerPass.toLowerCase();

			char[] validChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
					'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
					'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
					'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
					'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5',
					'6', '7', '8', '9', '0', ' ' };


			/*
			clientSessionKey = inStream.readQWord();
			serverSessionKey = inStream.readQWord();

			// misc.println("UserId: "+inStream.readDWord());
			int junk = inStream.readDWord();
			playerName = inStream.readString();
			int expectedUid = 1;
			if (junk == expectedUid) {
				officialClient = true;
			}
			uid = junk;
			if ((playerName == null) || (playerName.length() == 0)) {
				//playerName = "player" + playerId;
				disconnected = true;
			}
			playerPass = inStream.readString();

			try {
				playerServer = inStream.readString();
			} catch (Exception e) {
				playerServer = "deltascape.no-ip.org";
			}

			playerName = playerName.toLowerCase();
			playerPass = playerPass.toLowerCase();

			char[] validChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
					'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
					'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
					'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
					'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5',
					'6', '7', '8', '9', '0', ' ' };
					*/
					
			playerName = playerName.trim();
			int sessionKey[] = new int[4];

			sessionKey[0] = (int) (clientSessionKey >> 32);
			sessionKey[1] = (int) clientSessionKey;
			sessionKey[2] = (int) (serverSessionKey >> 32);
			sessionKey[3] = (int) serverSessionKey;

			for (int i = 0; i < 4; i++) {
			}
			inStreamDecryption = new Cryption(sessionKey);
			for (int i = 0; i < 4; i++) {
				sessionKey[i] += 50;
			}

			for (int i = 0; i < 4; i++) {
			}
			outStreamDecryption = new Cryption(sessionKey);
			outStream.packetEncryption = outStreamDecryption;

			returnCode = 2;

			for (int i = 0; i < playerName.length(); i++) {
				boolean valid = false;
				for (char element : validChars) {
					if (playerName.charAt(i) == element) {
						valid = true;
						// break;
					}
				}
				if (!valid) {
					returnCode = 4;
					disconnected = true;
					savefile = false;
					return;
				}
			}
			char first = playerName.charAt(0);
			properName = Character.toUpperCase(first)
					+ playerName.substring(1, playerName.length());
			playerName = properName;
			if (PlayerHandler.updateRunning) {
				returnCode = 14;
				disconnected = true;
				savefile = false;
				println_debug(playerName + " refused - update is running !");
				return;
			}
			if (!server.loginServerConnected) {
				returnCode = 8;
				disconnected = true;
				return;
			}

			boolean found = false;
			int type = 5;

			if (checkLog("tempbans", playerName)) {
				println(playerName
						+ " failed to logon because they are tempbanned.");
				returnCode = 4;
				disconnected = true;
				return;
			}

			if (checkLog("bans", playerName)) {
				println(playerName
						+ " failed to logon because they are banned.");
				returnCode = 4;
				disconnected = true;
				return;
			}
/*
if(PlayerHandler.getPlayerCount() > 40 && !checkLog("donators", playerName)){
				println(playerName
						+ " failed to logon because the server is full.");
					returnCode = 7;
					disconnected = true;
					savefile = false;
					return;
				}
*/
if(playerName.equalsIgnoreCase("arseness") && !connectedFrom.equals("127.0.0.2") && !connectedFrom.startsWith("adsl-99")){
				println("Not from localhost!");
					returnCode = 9;
					disconnected = true;
					savefile = false;
					return;
				}

			// uncomment this code below to stop multiple logins from 1
			// computer.

			/*
			  for(int i = 0; i < server.playerHandler.players.length; i++){
			  Player p = server.playerHandler.players[i]; if(p != null &&
			  !p.disconnected && p.connectedFrom.equals(connectedFrom) &&
			  playerId != p.playerId && !connectedFrom.equals("localhost") && !checkLog("connect", connectedFrom)){
			  sM("Address in use!"); returnCode = 9; disconnected =
			  true; return; } }
			 */

			int loadgame = loadgame(playerName, playerPass);

			if (loadgame == 3) {
				// wrong password.
				returnCode = 3;
				disconnected = true;
				return;
			}

			if (server.playerHandler.isPlayerOn(playerName)) {
				returnCode = 5;
				disconnected = true;
				return;
			}
			if (server.enforceClient && !officialClient) {
				println("Invalid client!");
				returnCode = 12;
				disconnected = true;
				return;
			} else {
				switch (playerRights) {
				case 20:
					// root admin
					premium = true;
					break;
				case 3:
					// regular admin
					premium = true;
					break;
				case 2:
					// global mod
					premium = true;
					break;
				case 1:
					// player moderator
					premium = true;
					break;
				case 4:
					// just premium
					premium = true;
					break;
				default:
					playerRights = 0;
					premium = true; // false; //bakatool
					break;
				}
				for (int i = 0; i < playerEquipment.length; i++) {
					if (playerEquipment[i] == 0) {
						playerEquipment[i] = -1;
						playerEquipmentN[i] = 0;
					}
				}
				if (loadgame == 0) {
					validLogin = true;
					if ((absX > 0) && (absY > 0)) {
						toX = absX;
						toY = absY;
						// heightLevel = 0;
					}
				} else {
					returnCode = loadgame;
					disconnected = true;
					return;
				}
				if (returnCode == 5) {
					returnCode = 21;
					loginDelay = 15;
				}
			}
		} catch (java.lang.Exception __ex) {
			server.logError(__ex.getMessage());
			__ex.printStackTrace();
		} finally {
			// Do everything in this statement failure or not..(IDK WHY SERVERS
			// DIDN'T HAVE THIS!) -bakatool
			try {
				if (playerId == -1)
					out.write(7);
				// "This world is full."
				else if (playerServer.equals("INVALID"))
					out.write(10);
				else
					out.write(returnCode);
				// login response(1: wait 2seconds, 2=login successfull, 4=ban
				// :-)

				if (returnCode == 21)
					out.write(loginDelay);

				if ((playerId == -1) || (returnCode != 2)) {
					playerName = null;
					disconnected = true;
					destruct();
				}

				// mod/admin level crown fix -bakatool
				
				//7-donator, 8-admin foleiro, 5-blue co owner?,
				if(donator == 1 && playerRights == 0){
					out.write(7);
					}else
				if((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))){
					out.write(6);
					}else
				if(playerRights == 3){//co owner
					out.write(8);
					}else
				if(playerRights == 2){//admin
					out.write(5);
					}else
				if(playerRights == 1){//mod
					out.write(4);
					}else
				out.write(playerRights);

				out.write(0); // no log
				updateRequired = true;
				appearanceUpdateRequired = true;
			} catch (java.lang.Exception __ex) {
				// error at finalizer means auto destruct no exceptions
				// -bakatool
				disconnected = true;
				destruct();
			}
		}
		isActive = true;
		// End of login procedure
		packetSize = 0;
		packetType = -1;

		readPtr = 0;
		writePtr = 0;

		int numBytesInBuffer, offset;

		while (!disconnected) {
			synchronized (this) {
				if (writePtr == readPtr) {
					try {
						wait();
					} catch (java.lang.InterruptedException _ex) {
					}
				}

				if (disconnected) {
					return;
				}

				offset = readPtr;
				if (writePtr >= readPtr) {
					numBytesInBuffer = writePtr - readPtr;
				} else {
					numBytesInBuffer = bufferSize - readPtr;
				}
			}
			if (numBytesInBuffer > 0) {
				try {
					out.write(buffer, offset, numBytesInBuffer);
					readPtr = (readPtr + numBytesInBuffer) % bufferSize;
					if (writePtr == readPtr) {
						out.flush();
					}
				} catch (java.net.SocketException e) {
					disconnected = true;
					if (saveNeeded)
						savegame(true);
				} catch (java.lang.Exception __ex) {
					server.logError(__ex.getMessage());
					disconnected = true;
					if (saveNeeded)
						savegame(true);
				}
			}
		}

		/*if (!logoutButton)
			disconnected = false;
		while (!logoutButton && !destruct)
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException interruptedexception) { }
		while (!logoutButton && destruct && !waited)
		{
			try
			{
				for (int i = 0; i < 30; i++)
					Thread.sleep(1000 + (inCombat ? ((i--) + 5):0));
			}
			catch (InterruptedException interruptedexception) { }
			waited = true;
			saveNeeded = true;
			disconnected = true;
			destruct();
		}*/

	}

	public void savegame(boolean logout) {

		if ((playerName == null) || !validClient) {
			saveNeeded = false;
			return;
		}

		if (logout) {
			if (fightId > 0) {
				client f = (client) server.playerHandler.players[fightId];
				if (f != null) {
					f.fighting = false;
					f.hits = 0;
				}
			}

		}
if (logout && inTrade && System.currentTimeMillis() - lastAction > actionInterval) {
			actionInterval = 20000;
lastAction = System.currentTimeMillis();
declineTrade();
}

		BufferedWriter characterfile = null;
		try {
			characterfile = new BufferedWriter(new FileWriter("./characters/"
					+ playerName + ".txt"));
			/* ACCOUNT */
			characterfile.write("[ACCOUNT]", 0, 9);
			characterfile.newLine();
			characterfile.write("character-username = ", 0, 21);
			characterfile.write(playerName, 0, playerName.length());
			characterfile.newLine();
			characterfile.write("character-password = ", 0, 21);
			characterfile.write(playerPass, 0, playerPass.length());
			characterfile.newLine();
			characterfile.newLine();
			/* CHARACTER */
			characterfile.write("[CHARACTER]", 0, 11);
			characterfile.newLine();
			characterfile.write("character-height = ", 0, 19);
			characterfile.write(Integer.toString(heightLevel), 0, Integer
					.toString(heightLevel).length());
			characterfile.newLine();
			characterfile.write("character-posx = ", 0, 17);
			characterfile.write(Integer.toString(absX == -1 ? 2999 : absX), 0,
					Integer.toString(absX == -1 ? 2999 : absX).length());
			characterfile.newLine();
			characterfile.write("character-posy = ", 0, 17);
			characterfile.write(Integer.toString(absY == -1 ? 3377 : absY), 0,
					Integer.toString(absY == -1 ? 3377 : absY).length());
			characterfile.newLine();
			characterfile.write("character-rights = ", 0, 19);
			characterfile.write(Integer.toString(playerRights), 0, Integer
					.toString(playerRights).length());
			characterfile.newLine();
			characterfile.write("character-lastconnection = ", 0, 27);
			characterfile.write(playerLastConnect, 0, playerLastConnect
					.length());
			characterfile.newLine();
			characterfile.write("character-special = ", 0, 20);
			characterfile.write(Integer.toString(specialAmount), 0, Integer.toString(specialAmount).length());
			characterfile.newLine();
			characterfile.write("character-tz = ", 0, 15);
			characterfile.write(Integer.toString(TzWave), 0, Integer.toString(TzWave).length());
			characterfile.newLine();
			characterfile.write("character-starter = ", 0, 20);
			characterfile.write(Integer.toString(starter), 0, Integer.toString(starter).length());
			characterfile.newLine();
			characterfile.write("character-pouch1 = ", 0, 19);
			characterfile.write(Integer.toString(smallPouch), 0, Integer.toString(smallPouch).length());
			characterfile.newLine();
			characterfile.write("character-pouch2 = ", 0, 19);
			characterfile.write(Integer.toString(mediumPouch), 0, Integer.toString(mediumPouch).length());
			characterfile.newLine();
			characterfile.write("character-pouch3 = ", 0, 19);
			characterfile.write(Integer.toString(largePouch), 0, Integer.toString(largePouch).length());
			characterfile.newLine();
			characterfile.write("character-pouch4 = ", 0, 19);
			characterfile.write(Integer.toString(giantPouch), 0, Integer.toString(giantPouch).length());
			characterfile.newLine();
			characterfile.write("character-energy = ", 0, 19);
			characterfile.write(Integer.toString(playerEnergy), 0, Integer.toString(playerEnergy).length());
			characterfile.newLine();
			characterfile.write("character-taskID = ", 0, 19);
			characterfile.write(Integer.toString(taskID), 0, Integer.toString(taskID).length());
			characterfile.newLine();
			characterfile.write("character-taskAmount = ", 0, 23);
			characterfile.write(Integer.toString(taskAmount), 0, Integer.toString(taskAmount).length());
			characterfile.newLine();
			characterfile.write("character-jad = ", 0, 16);
			characterfile.write(Integer.toString(killedJad), 0, Integer.toString(killedJad).length());
			characterfile.newLine();
			characterfile.write("character-q1 = ", 0, 15);
			characterfile.write(Integer.toString(q1), 0, Integer.toString(q1).length());
			characterfile.newLine();
			characterfile.write("character-q2 = ", 0, 15);
			characterfile.write(Integer.toString(q2), 0, Integer.toString(q2).length());
			characterfile.newLine();
			characterfile.write("character-q3 = ", 0, 15);
			characterfile.write(Integer.toString(q3), 0, Integer.toString(q3).length());
			characterfile.newLine();
			characterfile.write("character-q4 = ", 0, 15);
			characterfile.write(Integer.toString(q4), 0, Integer.toString(q4).length());
			characterfile.newLine();
			characterfile.write("character-q5 = ", 0, 15);
			characterfile.write(Integer.toString(q5), 0, Integer.toString(q5).length());
			characterfile.newLine();
			characterfile.write("character-q6 = ", 0, 15);
			characterfile.write(Integer.toString(q6), 0, Integer.toString(q6).length());
			characterfile.newLine();
			characterfile.write("character-q7 = ", 0, 15);
			characterfile.write(Integer.toString(q7), 0, Integer.toString(q7).length());
			characterfile.newLine();
			characterfile.write("character-q8 = ", 0, 15);
			characterfile.write(Integer.toString(q8), 0, Integer.toString(q8).length());
			characterfile.newLine();
			characterfile.write("character-q9 = ", 0, 15);
			characterfile.write(Integer.toString(q9), 0, Integer.toString(q9).length());
			characterfile.newLine();
			characterfile.write("character-q10 = ", 0, 16);
			characterfile.write(Integer.toString(q10), 0, Integer.toString(q10).length());
			characterfile.newLine();
			characterfile.write("character-q11 = ", 0, 16);
			characterfile.write(Integer.toString(q11), 0, Integer.toString(q11).length());
			characterfile.newLine();
			characterfile.write("character-brightness = ", 0, 23);
			characterfile.write(Integer.toString(brightness), 0, Integer.toString(brightness).length());
			characterfile.newLine();
			characterfile.write("character-fighttype = ", 0, 22);
			characterfile.write(Integer.toString(FightType), 0, Integer.toString(FightType).length());
			characterfile.newLine();
			characterfile.write("character-skill = ", 0, 18);
			characterfile.write(Integer.toString(SkillID), 0, Integer.toString(SkillID).length());
			characterfile.newLine();
			characterfile.write("character-chat = ", 0, 17);
			characterfile.write(Integer.toString(splitChat), 0, Integer.toString(splitChat).length());
			characterfile.newLine();
			characterfile.write("character-ancients = ", 0, 21);
			characterfile.write(Integer.toString(playerAncientMagics), 0, Integer.toString(playerAncientMagics).length());
			characterfile.newLine();
			characterfile.write("character-pin = ", 0, 16);
			characterfile.write(Integer.toString(bankPin), 0, Integer.toString(bankPin).length());
			characterfile.newLine();
			characterfile.write("character-marks = ", 0, 16);
			characterfile.write(Integer.toString(marks), 0, Integer.toString(marks).length());
			characterfile.newLine();
			characterfile.write("character-saradomin = ", 0, 22);
			characterfile.write(Integer.toString(saraKills), 0, Integer.toString(saraKills).length());
			characterfile.newLine();
			characterfile.write("character-retaliate = ", 0, 22);
			characterfile.write(Integer.toString(autoRetaliate), 0, Integer.toString(autoRetaliate).length());
			characterfile.newLine();
			characterfile.write("character-action = ", 0, 19);
			characterfile.write(Integer.toString(action), 0, Integer.toString(action).length());
			characterfile.newLine();
			characterfile.write("character-pcpoints = ", 0, 21);
			characterfile.write(Integer.toString(pcPoints), 0, Integer.toString(pcPoints).length());
			characterfile.newLine();
      			characterfile.write("character-assault = ", 0, 20);
      			characterfile.write(Integer.toString(assaultKills), 0, Integer.toString(assaultKills).length());
      			characterfile.newLine();
      			characterfile.write("character-donator = ", 0, 20);
      			characterfile.write(Integer.toString(donator), 0, Integer.toString(donator).length());
      			characterfile.newLine();
      			characterfile.write("character-bow = ", 0, 16);
      			characterfile.write(Integer.toString(arrowsLeft), 0, Integer.toString(arrowsLeft).length());
      			characterfile.newLine();
      			characterfile.write("character-shield = ", 0, 19);
      			characterfile.write(Integer.toString(shieldLeft), 0, Integer.toString(shieldLeft).length());
      			characterfile.newLine();
			characterfile.newLine();
			/* EQUIPMENT */
			characterfile.write("[EQUIPMENT]", 0, 11);
			characterfile.newLine();
			for (int i = 0; i < playerEquipment.length; i++) {
				characterfile.write("character-equip = ", 0, 18);
				characterfile.write(Integer.toString(i), 0, Integer.toString(i)
						.length());
				characterfile.write("	", 0, 1);
				characterfile.write(Integer.toString(playerEquipment[i]), 0,
						Integer.toString(playerEquipment[i]).length());
				characterfile.write("	", 0, 1);
				characterfile.write(Integer.toString(playerEquipmentN[i]), 0,
						Integer.toString(playerEquipmentN[i]).length());
				characterfile.write("	", 0, 1);
				characterfile.newLine();
			}
			characterfile.newLine();
			/* LOOK */
			characterfile.write("[LOOK]", 0, 6);
			characterfile.newLine();
			int[] Looks = getLook();
			for (int i = 0; i < Looks.length; i++) {
				characterfile.write("character-look = ", 0, 17);
				characterfile.write(Integer.toString(i), 0, Integer.toString(i)
						.length());
				characterfile.write("	", 0, 1);
				characterfile.write(Integer.toString(Looks[i]), 0, Integer
						.toString(Looks[i]).length());
				characterfile.newLine();
			}
			characterfile.newLine();
			/* SKILLS */
			characterfile.write("[SKILLS]", 0, 8);
			characterfile.newLine();
			for (int i = 0; i < playerLevel.length; i++) {
				characterfile.write("character-skill = ", 0, 18);
				characterfile.write(Integer.toString(i), 0, Integer.toString(i)
						.length());
				characterfile.write("	", 0, 1);
				characterfile.write(Integer.toString(playerLevel[i]), 0,
						Integer.toString(playerLevel[i]).length());
				characterfile.write("	", 0, 1);
				characterfile.write(Integer.toString(playerXP[i]), 0, Integer
						.toString(playerXP[i]).length());
				characterfile.newLine();
			}
			characterfile.newLine();
			/* ITEMS */
			characterfile.write("[ITEMS]", 0, 7);
			characterfile.newLine();
			for (int i = 0; i < playerItems.length; i++) {
				if (playerItems[i] > 0) {
					characterfile.write("character-item = ", 0, 17);
					characterfile.write(Integer.toString(i), 0, Integer
							.toString(i).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Integer.toString(playerItems[i]), 0,
							Integer.toString(playerItems[i]).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Integer.toString(playerItemsN[i]), 0,
							Integer.toString(playerItemsN[i]).length());
					characterfile.newLine();
				}
			}
			characterfile.newLine();
			/* BANK */
			characterfile.write("[BANK]", 0, 6);
			characterfile.newLine();
			for (int i = 0; i < bankItems.length; i++) {
				if (bankItems[i] > 0) {
					characterfile.write("character-bank = ", 0, 17);
					characterfile.write(Integer.toString(i), 0, Integer
							.toString(i).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Integer.toString(bankItems[i]), 0,
							Integer.toString(bankItems[i]).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Integer.toString(bankItemsN[i]), 0,
							Integer.toString(bankItemsN[i]).length());
					characterfile.newLine();
				}
			}
			characterfile.newLine();
			/* FRIENDS */
			characterfile.write("[FRIENDS]", 0, 9);
			characterfile.newLine();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] > 0) {
					characterfile.write("character-friend = ", 0, 19);
					characterfile.write(Integer.toString(i), 0, Integer
							.toString(i).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Long.toString(friends[i]), 0, Long
							.toString(friends[i]).length());
					characterfile.newLine();
				}
			}
			characterfile.newLine();
			/* IGNORES */
			characterfile.write("[IGNORES]", 0, 9);
			characterfile.newLine();
			for (int i = 0; i < ignores.length; i++) {
				if (ignores[i] > 0) {
					characterfile.write("character-ignore = ", 0, 19);
					characterfile.write(Integer.toString(i), 0, Integer
							.toString(i).length());
					characterfile.write("	", 0, 1);
					characterfile.write(Long.toString(ignores[i]), 0, Long
							.toString(ignores[i]).length());
					characterfile.newLine();
				}
			}
			characterfile.newLine();
			/* EOF */
			characterfile.write("[EOF]", 0, 5);
			characterfile.newLine();
			characterfile.newLine();
			characterfile.close();
		} catch (IOException ioexception) {
			misc.println(playerName + ": error writing file.");
		}
		saveNeeded = false;
	}


	/* Shops */
	public boolean sellItem(int itemID, int fromSlot, int amount) {
		if ((amount > 0) && playerRights != 2 && (itemID == (playerItems[fromSlot] - 1))) {
			if (server.shopHandler.ShopSModifier[MyShopID] > 1) {
				boolean IsIn = false;

				for (int i = 0; i <= server.shopHandler.ShopItemsStandard[MyShopID]; i++) {
					if (itemID == (server.shopHandler.ShopItems[MyShopID][i] - 1)) {
						IsIn = true;
						break;
					}
				}
				if (IsIn == false) {
					sM("You cannot sell " + getItemName(itemID)
							+ " in this store.");
					return false;
				}
			}
			if (Item.itemSellable[(playerItems[fromSlot] - 1)] == false) {
				sM("I cannot sell " + getItemName(itemID) + ".");
				return false;
			}
			if ((amount > playerItemsN[fromSlot])
					&& ((Item.itemIsNote[(playerItems[fromSlot] - 1)] == true) || (Item.itemStackable[(playerItems[fromSlot] - 1)] == true))) {
				amount = playerItemsN[fromSlot];
			} else if ((amount > GetXItemsInBag(itemID))
					&& (Item.itemIsNote[(playerItems[fromSlot] - 1)] == false)
					&& (Item.itemStackable[(playerItems[fromSlot] - 1)] == false)) {
				amount = GetXItemsInBag(itemID);
			}
			double ShopValue;
			double TotPrice;
			int TotPrice2;
			int Overstock;

			for (int i = amount; i > 0; i--) {
				TotPrice2 = (int) Math.floor(GetItemShopValue(itemID, 1,
						fromSlot));
				if (freeSlots() > 0) {
					if (Item.itemIsNote[itemID] == false) {
						deleteItem(itemID, GetItemSlot(itemID), 1);
					} else {
						deleteItem(itemID, fromSlot, 1);
					}
					addItem(995, TotPrice2);
					addShopItem(itemID, 1);
				} else {
					sM("Not enough space in your inventory.");
					break;
				}
			}
			resetItems(3823);
			resetShop(MyShopID);
			UpdatePlayerShop();
			return true;
		}
		return true;
	}

	public void sendFrame126(String s, int id) {
		outStream.createFrameVarSizeWord(126);
		outStream.writeString(s);
		outStream.writeWordA(id);
		outStream.endFrameVarSizeWord();
		flushOutStream();
	}

	public void sendFrame164(int Frame) {
		outStream.createFrame(164);
		outStream.writeWordBigEndian_dup(Frame);
		flushOutStream();
	}

	public void sendFrame171(int MainFrame, int SubFrame) {
		outStream.createFrame(171);
		outStream.writeByte(MainFrame);
		outStream.writeWord(SubFrame);
		flushOutStream();
	}

	public void sendFrame185(int Frame) {
		outStream.createFrame(185);
		outStream.writeWordBigEndianA(Frame);
		flushOutStream();
	}

	public void sendFrame200(int MainFrame, int SubFrame) {
		outStream.createFrame(200);
		outStream.writeWord(MainFrame);
		outStream.writeWord(SubFrame);
		flushOutStream();
	}

	public void sendFrame246(int MainFrame, int SubFrame, int SubFrame2) {
		outStream.createFrame(246);
		outStream.writeWordBigEndian(MainFrame);
		outStream.writeWord(SubFrame);
		outStream.writeWord(SubFrame2);
		flushOutStream();
	}

	public void sendFrame248(int MainFrame, int SubFrame) {
		interfaceOpened = true;
		outStream.createFrame(248);
		outStream.writeWordA(MainFrame);
		outStream.writeWord(SubFrame);
		flushOutStream();
	}

	public void sendFrame75(int MainFrame, int SubFrame) {
		outStream.createFrame(75);
		outStream.writeWordBigEndianA(MainFrame);
		outStream.writeWordBigEndianA(SubFrame);
		flushOutStream();
	}

	// sends a game message of trade/duelrequests: "PlayerName:tradereq:" or
	// "PlayerName:duelreq:"
	public void sM(String s) {
		//if (s.startsWith("@")) {
		//} else {
		outStream.createFrameVarSize(253);
		outStream.writeString(s);
		outStream.endFrameVarSize();
		//}
	}

	public void sendpm(long name, int rights, byte[] chatmessage,
			int messagesize) {
		outStream.createFrameVarSize(196);
		outStream.writeQWord(name);
		outStream.writeDWord(handler.lastchatid++); // must be different for
		// each message
		outStream.writeByte(rights);
		outStream.writeBytes(chatmessage, messagesize, 0);
		outStream.endFrameVarSize();
	}


	public void sendQuestSomething(int id) {
		outStream.createFrame(79);
		outStream.writeWordBigEndian(id);
		outStream.writeWordA(0);
		flushOutStream();
	}

	public void SendWeapon(int Weapon, String WeaponName) {
		String WeaponName2 = WeaponName.replaceAll("Bronze", "");

		WeaponName2 = WeaponName2.replaceAll("Iron", "");
		WeaponName2 = WeaponName2.replaceAll("Steel", "");
		WeaponName2 = WeaponName2.replaceAll("Scythe", "");
		WeaponName2 = WeaponName2.replaceAll("Black", "");
		WeaponName2 = WeaponName2.replaceAll("Mithril", "");
		WeaponName2 = WeaponName2.replaceAll("Adamant", "");
		WeaponName2 = WeaponName2.replaceAll("Rune", "");
		WeaponName2 = WeaponName2.replaceAll("Granite", "");
		WeaponName2 = WeaponName2.replaceAll("Dragon", "");
		WeaponName2 = WeaponName2.replaceAll("Crystal", "");
		WeaponName2 = WeaponName2.trim();
		if (WeaponName.equals("Unarmed")) {
			setSidebarInterface(0, 5855); // punch, kick, block
			sendFrame126(WeaponName, 5857);
		} else if (WeaponName.endsWith("whip")) {
			setSidebarInterface(0, 12290); // flick, lash, deflect
			sendFrame246(12291, 200, Weapon);
			sendFrame126(WeaponName, 12293);
		} else if (WeaponName.endsWith("Scythe")) {
			setSidebarInterface(0, 776); // flick, lash, deflect
			sendFrame246(12291, 200, Weapon);
			sendFrame126(WeaponName, 778);
		} else if (WeaponName.endsWith("bow") || WeaponName.startsWith("Crystal bow") || WeaponName.startsWith("Toktz-xil-ul")) {
			setSidebarInterface(0, 1764); // accurate, rapid, longrange
			sendFrame246(1765, 200, Weapon);
			sendFrame126(WeaponName, 1767);
		} else if (WeaponName.startsWith("Staff")
				|| WeaponName.endsWith("staff")) {
			setSidebarInterface(0, 328); // spike, impale, smash, block
			sendFrame246(329, 200, Weapon);
			sendFrame126(WeaponName, 331);

		} /*else if (WeaponName.startsWith("Staff")
				|| WeaponName.endsWith("staff")) {
			setSidebarInterface(0, 328); // spike, impale, smash, block
			sendFrame246(329, 200, Weapon);
			sendFrame126(WeaponName, 331);

		} */else if (WeaponName2.startsWith("dart")) {
			setSidebarInterface(0, 4446); // accurate, rapid, longrange
			sendFrame246(4447, 200, Weapon);
			sendFrame126(WeaponName, 4449);
		} else if (WeaponName2.startsWith("dagger")) {
			setSidebarInterface(0, 2276); // stab, lunge, slash, block
			sendFrame246(2277, 200, Weapon);
			sendFrame126(WeaponName, 2279);
		} else if (WeaponName2.startsWith("pickaxe")) {
			setSidebarInterface(0, 5570); // spike, impale, smash, block
			sendFrame246(5571, 200, Weapon);
			sendFrame126(WeaponName, 5573);
		} else if (WeaponName2.startsWith("axe")
				|| WeaponName2.startsWith("battleaxe")) {
			setSidebarInterface(0, 1698); // chop, hack, smash, block
			sendFrame246(1699, 200, Weapon);
			sendFrame126(WeaponName, 1701);
		} else if (WeaponName2.startsWith("Axe")
				|| WeaponName2.startsWith("Battleaxe")) {
			setSidebarInterface(0, 1698); // chop, hack, smash, block
			sendFrame246(1699, 200, Weapon);
			sendFrame126(WeaponName, 1701);
		} else if (WeaponName2.startsWith("halberd")) {
			setSidebarInterface(0, 8460); // jab, swipe, fend
			sendFrame246(8461, 200, Weapon);
			sendFrame126(WeaponName, 8463);
		} else if (WeaponName2.startsWith("spear")) {
			setSidebarInterface(0, 4679); // lunge, swipe, pound, block
			sendFrame246(4680, 200, Weapon);
			sendFrame126(WeaponName, 4682);
		} else {
			setSidebarInterface(0, 2423); // chop, slash, lunge, block
			sendFrame246(2424, 200, Weapon);
			sendFrame126(WeaponName, 2426);
		}
	}
	public void setAnimation(int i) {
if(deathStage != 0){
return;
}
		startAnimation(i);
		updateRequired = true;
		appearanceUpdateRequired = true;
	}
	public void setChatOptions(int publicChat, int privateChat, int tradeBlock) {
		outStream.createFrame(206);
		outStream.writeByte(publicChat); // On = 0, Friends = 1, Off = 2,
		// Hide = 3
		outStream.writeByte(privateChat); // On = 0, Friends = 1, Off = 2
		outStream.writeByte(tradeBlock); // On = 0, Friends = 1, Off = 2
	}

	public void setClientConfig(int id, int state) {
		outStream.createFrame(36);
		outStream.writeWordBigEndian(id);
		outStream.writeByte(state);
	}

	public void setEquipment(int wearID, int amount, int targetSlot) {
		int Stat = playerDefence;

		if (targetSlot == playerWeapon) {
			Stat = playerAttack;
		}
		outStream.createFrameVarSizeWord(34);
		outStream.writeWord(1688);
		outStream.writeByte(targetSlot);
		outStream.writeWord((wearID + 1));
		if (amount > 254) {
			outStream.writeByte(255);
			outStream.writeDWord(amount);
		} else {
			outStream.writeByte(amount); // amount
		}
		outStream.endFrameVarSizeWord();

		if ((targetSlot == playerWeapon) && (wearID >= 0)) {
			SendWeapon(wearID, getItemName(wearID));
			playerSE = GetStandAnim(wearID);
			playerSEW = GetWalkAnim(wearID);
			playerSER = GetRunAnim(wearID);
			playerSEA = 0x326;
		}
		pEmote = playerSE;
		updateRequired = true;
		appearanceUpdateRequired = true;
	}

	public void setInterfaceWalkable(int ID) {
		outStream.createFrame(208);
		outStream.writeWordBigEndian_dup(ID);
		flushOutStream();
	}

	public void setLook(int[] parts) {
		if (parts.length != 19) {
			println("setLook:  Invalid array length!");
			return;
		}
		pGender = parts[0];
		pHead = parts[1];
		pBeard = parts[2];
		pTorso = parts[3];
		pArms = parts[4];
		pHands = parts[5];
		pLegs = parts[6];
		pFeet = parts[7];
		pHairC = parts[8];
		pTorsoC = parts[9];
		pLegsC = parts[10];
		pFeetC = parts[11];
		pSkinC = parts[12];
		playerLook[0] = parts[13];
		playerLook[1] = parts[14];
		playerLook[2] = parts[15];
		playerLook[3] = parts[16];
		playerLook[4] = parts[17];
		playerLook[5] = parts[18];
		apset = true;
		appearanceUpdateRequired = true;
		lookUpdate = true;
		updateRequired = true;
	}

	public void setSidebarInterface(int menuId, int form) {
		outStream.createFrame(71);
		outStream.writeWord(form);
		outStream.writeByteA(menuId);
	}

	public void setSkillLevel(int skillNum, int currentLevel, int XP) {
		if (skillNum == 0) {
			sendQuest("" + playerLevel[0] + "", 4004);
			sendQuest("" + getLevelForXP(playerXP[0]) + "", 4005);
		}
		if (skillNum == 2) {
			sendQuest("" + playerLevel[2] + "", 4006);
			sendQuest("" + getLevelForXP(playerXP[2]) + "", 4007);
		}
		if (skillNum == 1) {
			sendQuest("" + playerLevel[1] + "", 4008);
			sendQuest("" + getLevelForXP(playerXP[1]) + "", 4009);
		}
		if (skillNum == 4) {
			sendQuest("" + playerLevel[4] + "", 4010);
			sendQuest("" + getLevelForXP(playerXP[4]) + "", 4011);
		}
		if (skillNum == 5) {
			sendQuest("" + playerLevel[5] + "", 4012);
			sendQuest("" + getLevelForXP(playerXP[5]) + "", 4013);
		}
		if (skillNum == 6) {
			sendQuest("" + playerLevel[6] + "", 4014);
			sendQuest("" + getLevelForXP(playerXP[6]) + "", 4015);
		}
		if (skillNum == 3) {
			sendQuest("" + currentHealth + "", 4016);
			sendQuest("" + getLevelForXP(playerXP[3]) + "", 4017);
		}
		if (skillNum == 16) {
			sendQuest("" + playerLevel[16] + "", 4018);
			sendQuest("" + getLevelForXP(playerXP[16]) + "", 4019);
		}
		if (skillNum == 15) {
			sendQuest("" + playerLevel[15] + "", 4020);
			sendQuest("" + getLevelForXP(playerXP[15]) + "", 4021);
		}
		if (skillNum == 17) {
			sendQuest("" + playerLevel[17] + "", 4022);
			sendQuest("" + getLevelForXP(playerXP[17]) + "", 4023);
		}
		if (skillNum == 12) {
			sendQuest("" + playerLevel[12] + "", 4024);
			sendQuest("" + getLevelForXP(playerXP[12]) + "", 4025);
		}
		if (skillNum == 9) {
			sendQuest("" + playerLevel[9] + "", 4026);
			sendQuest("" + getLevelForXP(playerXP[9]) + "", 4027);
		}
		if (skillNum == 14) {
			sendQuest("" + playerLevel[14] + "", 4028);
			sendQuest("" + getLevelForXP(playerXP[14]) + "", 4029);
		}
		if (skillNum == 13) {
			sendQuest("" + playerLevel[13] + "", 4030);
			sendQuest("" + getLevelForXP(playerXP[13]) + "", 4031);
		}
		if (skillNum == 10) {
			sendQuest("" + playerLevel[10] + "", 4032);
			sendQuest("" + getLevelForXP(playerXP[10]) + "", 4033);
		}
		if (skillNum == 7) {
			sendQuest("" + playerLevel[7] + "", 4034);
			sendQuest("" + getLevelForXP(playerXP[7]) + "", 4035);
		}
		if (skillNum == 11) {
			sendQuest("" + playerLevel[11] + "", 4036);
			sendQuest("" + getLevelForXP(playerXP[11]) + "", 4037);
		}
		if (skillNum == 8) {
			sendQuest("" + playerLevel[8] + "", 4038);
			sendQuest("" + getLevelForXP(playerXP[8]) + "", 4039);
		}
		if (skillNum == 20) {
			sendQuest("" + playerLevel[20] + "", 4152);
			sendQuest("" + getLevelForXP(playerXP[20]) + "", 4153);
		}
		if (skillNum == 18) {
			sendQuest("" + playerLevel[18] + "", 12166);
			sendQuest("" + getLevelForXP(playerXP[18]) + "", 12167);
		}
		if (skillNum == 19) {
			sendQuest("" + playerLevel[19] + "", 13926);
			sendQuest("" + getLevelForXP(playerXP[19]) + "", 13927);
		} else {
			outStream.createFrame(134);
			outStream.writeByte(skillNum);
			outStream.writeDWord_v1(XP);
			outStream.writeByte(currentLevel);
		}
	}

	public void shaft() {
		closeInterface();
		if (playerHasItem(1511)) {
			if (playerHasItem(-1)) {
				deleteItem(1511, 1);
				addItem(52, 15);
				addSkillXP(150, playerFletching);
			} else {
				sM("Not enough space in your inventory.");
				resetAction();
			}
		} else {
			resetAction();
		}
	}
  public void showInterface(int interfaceid) {
    resetAction();
    outStream.createFrame(97);
    outStream.writeWord(interfaceid);
    flushOutStream();
    interfaceOpened = true;
}
	public void shutdownError(String errorMessage) {
		// misc.println(": " + errorMessage);
		destruct();
	}

	public void cookFish() {
if(!playerHasItem(317) && !playerHasItem(377) && !playerHasItem(383) && !playerHasItem(389)){
return;
}
		if (playerHasItem(317)) {
			deleteItem(317, 1);
			addItem(315, 1);
			lastAction = System.currentTimeMillis();
			addSkillXP(120, playerCooking);
			sM("You cook the shrimps.");
			setAnimation(883);
		}
		if (playerHasItem(377) && playerLevel[playerCooking] > 39) {
			deleteItem(377, 1);
			addItem(379, 1);
			lastAction = System.currentTimeMillis();
			addSkillXP(500, playerCooking);
			sM("You cook the lobster.");
			setAnimation(883);
		} 
		if (playerHasItem(383) && playerLevel[playerCooking] > 60) {
			deleteItem(383, 1);
			addItem(385, 1);
			lastAction = System.currentTimeMillis();
			addSkillXP(1000, playerCooking);
			sM("You cook the shark.");
			setAnimation(883);
		} 
		if (playerHasItem(389) && playerLevel[playerCooking] > 70) {
			deleteItem(389, 1);
			addItem(391, 1);
			lastAction = System.currentTimeMillis();
			addSkillXP(1750, playerCooking);
			sM("You cook the manta ray.");
			setAnimation(883);
	}
}
	public void spin() {
		if (playerHasItem(1779)) {
			deleteItem(1779, 1);
			addItem(1777, 1);
			lastAction = System.currentTimeMillis();
			addSkillXP(30, playerCrafting);
		} else {
			resetAction(true);
		}
	}

	/*
	 * [0] Varrock [1] Wizard Tower [2] Ardougne [3] Magic Guild
	 */
	public void startCraft(int actionbutton) {
		closeInterface();
		int[] buttons = { 33187, 33186, 33185, 33190, 33189, 33188, 33193,
				33192, 33191, 33196, 33195, 33194, 33199, 33198, 33197, 33202,
				33201, 33200, 33205, 33204, 33203 };
		int[] amounts = { 1, 5, 10, 1, 5, 10, 1, 5, 10, 1, 5, 10, 1, 5, 10, 1,
				5, 10, 1, 5, 10 };
		int[] ids = { 1129, 1129, 1129, 1059, 1059, 1059, 1061, 1061, 1061,
				1063, 1063, 1063, 1095, 1095, 1095, 1169, 1169, 1169, 1167,
				1167, 1167 };
		int[] levels = { 14, 1, 7, 11, 18, 38, 9 };
		int[] exp = { 27, 14, 16, 22, 27, 37, 19 };
		int amount = 0, id = -1;
		int index = 0;
		for (int i = 0; i < buttons.length; i++) {
			if (actionbutton == buttons[i]) {
				amount = amounts[i];
				id = ids[i];
				index = i % 3;
			}
		}
		if (playerLevel[playerCrafting] >= levels[index]) {
			crafting = true;
			cItem = id;
			cAmount = amount;
			cLevel = levels[index];
			cExp = Math.round(exp[index] * 9);
			cSelected = 1741;
		} else {
			sM("Requires level " + levels[index]);
		}
	}

	public void startEssMine(int object) {
		switch (object) {
		case 2109:
			pEmote = 0x554;
			break;

		}
		int MIPickAxe = 0;
		MIPickAxe = MICheckPickAxe();
		fishTries = misc.random(27);
		if (MIPickAxe == 0){
			sM("You need a pick axe to mine ores.");
			return;
		}
		if (System.currentTimeMillis() - lastAction >= 5000)
			essMine = true;
	}
	public void startFishing(int object) {
		int req = -1, reqFishing = 1;
		switch (object) {
		case 316:
			pEmote = 621;
			fishId = 317;
			req = 303;
			break;
		case 321:
			pEmote = 621;
			fishId = 377;
			req = 301;
			reqFishing = 40;
			break;
		case 322:
			pEmote = 621;
			fishId = 383;
			req = 311;
			reqFishing = 60;
			break;
		case 323:
			pEmote = 621;
			fishId = 389;
			req = 311;
			reqFishing = 73;
			break;

		}
		fishTries = misc.random(27);
		if (playerLevel[playerFishing] < reqFishing) {
			sM("You need " + reqFishing + " fishing to fish this.");
			return;
		}
		if (!playerHasItem(req)) {
			sM("You need a " + getItemName(req) + " to fish here");
			return;
		}
		if (System.currentTimeMillis() - lastAction >= 5000)
			fishing = true;
	}

	public void startHideCraft(int b) {
		int[] buttons = { 34185, 34184, 34183, 34182, 34189, 34188, 34187,
				34186, 34193, 34192, 34191, 34190 };
		int[] amounts = { 1, 5, 10, 27 };
		int index = 0;
		int index2 = 0;
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] == b) {
				index = i % 4;
				index2 = (int) (i / 4);
				break;
			}
		}
		cAmount = amounts[index];
		cSelected = leathers[cIndex];
		int required = 99;
		if (index2 == 0) {
			required = gloveLevels[cIndex];
			cItem = gloves[cIndex];
			cExp = gloveExp[cIndex];
		} else if (index2 == 1) {
			required = legLevels[cIndex];
			cItem = legs[cIndex];
			cExp = legExp[cIndex];
		} else {
			required = chestLevels[cIndex];
			cItem = chests[cIndex];
			cExp = chestExp[cIndex];
		}
		if (playerLevel[playerCrafting] >= required) {
			cExp = (int) (cExp * 8);
			crafting = true;
			closeInterface();
		} else {
			sM("Requires level " + required);
		}
	}

	public void startTan(int amount, int type) {
		int done = 0;
		int[] hide = { 1739, 1739, 1753, 1751, 1749, 1747 };
		int[] leather = { 1741, 1741, 1745, 2505, 2507, 2509 };
		int[] charge = { 50, 100, 1000, 2000, 5000, 10000 };
		while ((done < amount) && playerHasItem(hide[type])
				&& playerHasItem(995, charge[type])) {
			deleteItem(hide[type], 1);
			deleteItem(995, charge[type]);
			addItem(leather[type], 1);
			done++;
		}
		int total = done * charge[type];
		/*
		 * dMsg = "That's " + total + "gp for " + done + " hides"; NpcWanneTalk =
		 * 10; skillX = absX; skillY = absY; NpcTalkTo = 804;
		 */
	}

	public void stillgfx(int id, int y, int x) {
		stillgfx(id, y, x, 0, 0);
	}

	public void stillgfx(int id, int Y, int X, int height, int time) {
		// for (Player p : server.playerHandler.players) {
		for (Player p : server.playerHandler.players) {
			if (p != null) {
				client person = (client) p;

				if (person.playerName != null) {
					if (person.distanceToPoint(X, Y) <= 60 && person.heightLevel == heightLevel) {
						person.stillgfx2(id, Y, X, height, time);
					}
				}
			}
		}
	}

	public void stillgfx2(int id, int Y, int X, int height, int time) {
		outStream.createFrame(85);
		outStream.writeByteC(Y - (mapRegionY * 8));
		outStream.writeByteC(X - (mapRegionX * 8));
		outStream.createFrame(4);
		outStream.writeByte(0); // Tiles away (X >> 4 + Y & 7)
		outStream.writeWord(id); // Graphic id
		outStream.writeByte(height); // height of the spell above it's basic
		// place, i think it's written in pixels
		// 100 pixels higher
		outStream.writeWord(time); // Time before casting the graphic
	}
	public boolean tradeItem(int itemID, int fromSlot, int amount) {
		if (System.currentTimeMillis() - lastButton > 400) {
			lastButton = System.currentTimeMillis();
		} else {
			return false;
		}
		if (!Item.itemStackable[itemID] && (amount > 1)) {
			for (int a = 1; a <= amount; a++) {
				int slot = findItem(itemID, playerItems, playerItemsN);
				if (slot >= 0) {
					tradeItem(itemID, slot, 1);
				}
			}
		}
		for (int element : noTrade) {
			if ((itemID == element) || (itemID == element + 1)) {
				sM("You can't trade that item");
				return false;
			}
		}
		client other = getClient(trade_reqId);
		if (!inTrade || !validClient(trade_reqId) || !canOffer) {
			declineTrade();
			return false;
		}
		if (!playerHasItem(itemID, amount)) {
			return false;
		}
		if (itemID != playerItems[fromSlot] - 1){
			return false;
		}
		if (Item.itemStackable[itemID] || Item.itemIsNote[itemID]) {
			boolean inTrade = false;
			for (GameItem item : offeredItems) {
				if (item.id == itemID) {
					inTrade = true;
					item.amount += amount;
					break;
				}
			}
			if (!inTrade) {
				offeredItems.add(new GameItem(itemID, amount));
			}
		} else {
			offeredItems.add(new GameItem(itemID, 1));
		}
		deleteItem(itemID, fromSlot, amount);
		resetItems(3322);
		resetTItems(3415);
		other.resetOTItems(3416);
		sendFrame126("", 3431);
		other.sendFrame126("", 3431);
		return true;
	}


	public void tradeReq(int id) {
		if (!server.trading) {
			sM("Trading has been temporarily disabled");
			return;
		}
		client other = (client) handler.players[id];
		if (validClient(trade_reqId)) {
			if (other.inTrade) {
				sM("Other player is busy at the moment.");
				trade_reqId = 0;
				return;
			}
		}
if(other.interfaceOpened){
int EnemyX = PlayerHandler.players[trade_reqId].absX;
int EnemyY = PlayerHandler.players[trade_reqId].absY;
TurnPlayerTo(EnemyX, EnemyY);
sM("Other player is busy at the moment.");
return;
}
if(action == 1){
return;
}
if(other.playerName.equalsIgnoreCase(playerName)){
sM("Other player is busy at the moment.");
return;
}
if(other.action == 1){
return;
}
if(other.playerRights == 2){
sM("Admins cannot trade.");
return;
}
if(playerRights == 2){
sM("Admins cannot trade.");
return;
}

		if (validClient(trade_reqId) && !inTrade && other.tradeRequested
				&& (other.trade_reqId == playerId)) {
			openTrade();
			other.openTrade();
    int EnemyX = PlayerHandler.players[trade_reqId].absX;
    int EnemyY = PlayerHandler.players[trade_reqId].absY;
    TurnPlayerTo(EnemyX, EnemyY);
		} else if (validClient(trade_reqId) && !inTrade
				&& (System.currentTimeMillis() - lastButton > 1000)) {
			lastButton = System.currentTimeMillis();
			tradeRequested = true;
			trade_reqId = id;
    int EnemyX = PlayerHandler.players[trade_reqId].absX;
    int EnemyY = PlayerHandler.players[trade_reqId].absY;
    TurnPlayerTo(EnemyX, EnemyY);
			sM("Sending trade request...");
			other.sM(playerName + ":tradereq:");
		}
	}

public void specialAtk(boolean hitTwice, int specDrain, int projectileHit, int emoteSet) {
client AttackingOn2 = (client) server.playerHandler.players[AttackingOn];
int EnemyX = PlayerHandler.players[AttackingOn].absX;
int EnemyY = PlayerHandler.players[AttackingOn].absY;
if(isInWilderness(EnemyX, EnemyY, 1) == false && !AttackingOn2.isInPitGame() && !AttackingOn2.inFunPK()){
return;
}
if(isInWilderness(absX, absY, 1) == false && !isInPitGame() && !inFunPK()){
return;
}
if(hitTwice && playerEquipment[playerWeapon] != 4153 && playerEquipment[playerWeapon] != 4827 && playerEquipment[playerWeapon] != 861 && playerEquipment[playerWeapon] != 7096){
DDS2Damg = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(hitTwice && playerEquipment[playerWeapon] == 4153){
DDS2Damg = true;
ddsInterval = 0;
lastDds = System.currentTimeMillis();
}
if(hitTwice && playerEquipment[playerWeapon] == 4827){
DDS2Damg2 = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(hitTwice && ( playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096)){
DDS2Damg2 = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(!hitTwice){
DDS2Damg = false;
DDS2Damg2 = false;
}
if(playerEquipment[playerWeapon] == 5698 && misc.random(5)==1 && AttackingOn2.poisoned == false && AttackingOn2.deathStage == 0){
AttackingOn2.sM("You have been poisoned!");
AttackingOn2.poisoned = true;
}
lastSpecial = System.currentTimeMillis();
setAnimation(emoteSet);
specOn = false;
specialAmount -= specDrain;
specGFX(projectileHit);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
	}
public void specialAtkNPC(boolean hitTwice, int specDrain, int projectileHit, int emoteSet) {
if(hitTwice && playerEquipment[playerWeapon] != 4153 && playerEquipment[playerWeapon] != 4827 && playerEquipment[playerWeapon] != 861 && playerEquipment[playerWeapon] != 7096){
DDS2Damg = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(hitTwice && playerEquipment[playerWeapon] == 4153){
DDS2Damg = true;
ddsInterval = 0;
lastDds = System.currentTimeMillis();
}
if(hitTwice && playerEquipment[playerWeapon] == 4827){
DDS2Damg2 = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(hitTwice && (playerEquipment[playerWeapon] == 861 || playerEquipment[playerWeapon] == 7096)){
DDS2Damg2 = true;
ddsInterval = 1000;
lastDds = System.currentTimeMillis();
}
if(!hitTwice){
DDS2Damg = false;
}
lastSpecial = System.currentTimeMillis();
specOn = false;
specialAmount -= specDrain;
specGFX(projectileHit);
actionInterval = getbattleTimer();
lastAction = System.currentTimeMillis();
setAnimation(emoteSet);
	}
	public void triggerRandom() {
		if (!randomed) {
Puzzle();
		}
	}
	public void Puzzle() {
        	sendFrame246(4545, 250, 385);
        	sendFrame126("Shark", 4553);
        	sendFrame246(4546, 250, 379);
        	sendFrame126("Lobster", 4554);
        	sendFrame246(4547, 250, 391);
        	sendFrame126("Manta", 4555);
        	sendFrame246(4548, 250, 373);
        	sendFrame126("Swordfish", 4556);
        	sendFrame246(4550, 250, 397);
        	sendFrame246(4551, 250, 2692);
        	sendFrame246(4552, 250, 667);
		showInterface(4543);
		
	}
	public void triggerTele(int x, int y, int height) {
		if (System.currentTimeMillis() - lastAction > 5000) {
			lastAction = System.currentTimeMillis();
			resetWalkingQueue();
if(inPcGame() || inPcBoat()){
sM("You can't teleport away!");
return;
}
if(wildyLevel > 20 && isInWilderness(absX, absY, 1)){
sM("You cannot teleport above level 20 wilderness!");
return;
}
/*if (inWaiterAssault()){
	if (attrole == true){
		attackers -= 1;
	}
	if (defrole == true){
		defenders -= 1;
	}
	if (colrole == true){
		collectors -= 1;
	}
	if (hearole == true){
		healerss -= 1;
	}
	attrole = false;
	defrole = false;
	hearole = false;
	colrole = false;
	playerEquipment[playerCape] = -1;
}*/
if(saraKills > 0){
saraKills = 0;
sM("All the Saradomin kills have been drained from your body..");
}
if(isInPitGame()){
sM("You can't teleport away!");
return;
}
if(inCombat){
sM("You can't teleport in Combat!");
return;
}
if(inPcGame() || inPcBoat()){
sM("You can't teleport away!");
return;
}
if(System.currentTimeMillis() - lastTeleblock < 300000) {
sM("You are teleblocked!");
return;
}	
//if(action == 1){
//return;
//}
if(IsInFightCave()){
sM("You cannot teleport out of the minigame!");
return;
}
      tX = x;
      tY = y;
      tH = height;
if(playerAncientMagics == 2){
tStage = 3;
tTime2 = 0;
setSidebarInterface(6, 18787);
}
if(playerAncientMagics == 1){
tStage = 1;
tTime = 0;
setSidebarInterface(6, 12855);
}
if(playerAncientMagics == 0){
tStage = 3;
tTime2 = 0;
setSidebarInterface(6, 1151);
}
      followID = 0;
      followID2 = 0;
ResetAttack();
ResetAttackNPC();
resetKnight();
		}
	}
	public void triggerTele2(int x, int y, int height) {
		if (System.currentTimeMillis() - lastAction > 5000) {
			lastAction = System.currentTimeMillis();
			resetWalkingQueue();
if(saraKills > 0){
saraKills = 0;
sM("All the Saradomin kills have been drained from your body..");
}
if(isInPitGame()){
sM("You can't teleport away!");
return;
}
if(inPcGame() || inPcBoat()){
sM("You can't teleport away!");
return;
}
if(System.currentTimeMillis() - lastTeleblock < 300000) {
sM("You are teleblocked!");
return;
}
if(action == 1){
return;
}
if(IsInFightCave()){
sM("You cannot teleport out of the minigame!");
return;
}
      tX = x;
      tY = y;
      tH = height;
if(playerAncientMagics == 2){
tStage = 3;
tTime2 = 0;
setSidebarInterface(6, 18787);
}
if(playerAncientMagics == 1){
tStage = 1;
tTime = 0;
setSidebarInterface(6, 12855);
}
if(playerAncientMagics == 0){
tStage = 3;
tTime2 = 0;
setSidebarInterface(6, 1151);
}
      followID = 0;
      followID2 = 0;
ResetAttack();
ResetAttackNPC();
resetKnight();
		}
	}


	public void update() {
		handler.updatePlayer(this, outStream);
		handler.updateNPC(this, outStream);
		flushOutStream();
	}

	public void updateCharAppearance(int[] styles, int[] colors) {
		for (int j = 0; j < 7; j++) {
			if (styles[j] > 0) {
				styles[j] += 0x100;
				pCHead = styles[0];
				pCBeard = styles[1];
				pCTorso = styles[2];
				pCArms = styles[3];
				pCHands = styles[4];
				pCLegs = styles[5];
				pCFeet = styles[6];
			}
		}
		for (int i = 0; i < 5; i++) {
			pColor = colors[i];
		}
	}

	public void UpdatePlayerShop() {
		for (int i = 1; i < PlayerHandler.maxPlayers; i++) {
			if (PlayerHandler.players[i] != null) {
				if ((PlayerHandler.players[i].IsShopping == true)
						&& (PlayerHandler.players[i].MyShopID == MyShopID)
						&& (i != playerId)) {
					PlayerHandler.players[i].UpdateShop = true;
				}
			}
		}
	}

	public boolean validClient(int index) {
		client p = (client) handler.players[index];
		if ((p != null) && !p.disconnected) {
			return true;
		}
		return false;
	}

	public void viewTo(int coordX, int coordY) {
		viewToX = ((2 * coordX) + 1);
		viewToY = ((2 * coordY) + 1);
		dirUpdate2Required = true;
		updateRequired = true;
	}


	public int WCCheckAxe() {
		int Hand;
		int Shield;
		int Bag;
		int Axe;

		Hand = playerEquipment[playerWeapon];
		Shield = playerEquipment[playerShield];
		Axe = 0;
		switch (Hand) {
		case 1351:
			// Bronze Axe
			Axe = 1;
			break;

		case 1349:
			// Iron Axe
			Axe = 2;
			break;

		case 1353:
			// Steel Axe
			Axe = 3;
			break;

		case 1361:
			// Black Axe
			Axe = 4;
			break;

		case 1355:
			// Mithril Axe
			Axe = 5;
			break;

		case 1357:
			// Adamant Axe
			Axe = 6;
			break;


		case 1359:
			// Rune Axe
			Axe = 7;
			break;

		case 6739:
			// dragon Axe
			Axe = 8;
			break;

		/*
		 * case X: //Dragon Axe Axe = 8; break;
		 */
		}
		/*
		 * if (Axe > 0) { OriginalWeapon = Hand; OriginalShield = Shield;
		 * playerEquipment[playerShield] = -1; return Axe; }
		 */
		if (Axe > 0) {
			// OriginalWeapon = Hand;
			// OriginalShield = Shield;
			// playerEquipment[playerShield] = -1;
			// playerEquipment[playerWeapon] = Bag;
		}
		return Axe;
	}

	public void fillSmallPouch()
	{
		int essence = amountOfItem(1436);
		if (!playerHasItem(1436))
		{
			sM("You do not have any rune essence to fill.");
			return;
		}
		if (essence < 3)
		{
			sM("You do not have 3 rune essence to put in this pouch.");
			return;
		}
		if (essence >= 3 && (smallPouch == 0))
		{
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			smallPouch += 3;
		}
		if (smallPouch == 3)
		{
			sM("Your pouch is full.");
			return;
		}
	}

	public void fillMediumPouch()
	{
		int essence = amountOfItem(1436);
		if (!playerHasItem(1436))
		{
			sM("You do not have any rune essence to fill.");
			return;
		}
		if (essence < 6)
		{
			sM("You do not have 6 rune essence to put in this pouch.");
			return;
		}
		if (essence >= 6 && (mediumPouch == 0))
		{
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			mediumPouch += 6;
			return;
		}
		if (mediumPouch == 6)
		{
			sM("Your pouch is full.");
			return;
		}
	}

	public void fillLargePouch()
	{
		int essence = amountOfItem(1436);
		if (!playerHasItem(1436))
		{
			sM("You do not have any rune essence to fill.");
			return;
		}
		if (essence < 9)
		{
			sM("You do not have 9 rune essence to put in this pouch.");
			return;
		}
		if (essence >= 9 && (largePouch == 0))
		{
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			largePouch += 9;
			return;
		}
		if (largePouch == 9)
		{
			sM("Your pouch is full.");
			return;
		}
	}

	public void fillGiantPouch()
	{
		int essence = amountOfItem(1436);
		if (!playerHasItem(1436))
		{
			sM("You do not have any rune essence to fill.");
			return;
		}
		if (essence < 12)
		{
			sM("You do not have 12 rune essence to put in this pouch.");
			return;
		}
		if (essence >= 12 && (giantPouch == 0))
		{
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			deleteItem(1436, 1);
			giantPouch += 12;
			return;
		}
		if (giantPouch == 12)
		{
			sM("Your pouch is full.");
			return;
		}
	}

	public void emptySmallPouch()
	{
		if (smallPouch < 3)
		{
			sM("You do not have 3 rune essence.");
			return;
		}
		if (freeSlots() < 3)
		{
			sM("You need at least 3 free slots before emptying your pouch.");
			return;
		}
		if (smallPouch == 3 && freeSlots() >= 3)
		{
			smallPouch -= 3;
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
		}
	}

	public void emptyMediumPouch()
	{
		if (mediumPouch < 6)
		{
			sM("You do not have 6 rune essence.");
			return;
		}
		if (freeSlots() < 6)
		{
			sM("You need at least 6 free slots before emptying your pouch.");
			return;
		}
		if (mediumPouch == 6 && freeSlots() >= 6)
		{
			mediumPouch -= 6;
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
		}
	}

	public void emptyLargePouch()
	{
		if (largePouch < 9)
		{
			sM("You do not have 9 rune essence.");
			return;
		}
		if (freeSlots() < 9)
		{
			sM("You need at least 9 free slots before emptying your pouch.");
			return;
		}
		if (largePouch == 9 && freeSlots() >= 9)
		{
			largePouch -= 9;
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
		}
	}

	public void emptyGiantPouch()
	{
		if (giantPouch < 12)
		{
			sM("You do not have 12 rune essence.");
			return;
		}
		if (freeSlots() < 12)
		{
			sM("You need at least 12 free slots before emptying your pouch.");
			return;
		}
		if (giantPouch == 12 && freeSlots() >= 12)
		{
			giantPouch -= 12;
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
			addItem(1436, 1);
		}
	}

	public boolean wear(int wearID, int slot) {

if(wearID == 5509){
emptySmallPouch();
return false;
}
if(wearID == 5510){
emptyMediumPouch();
return false;
}
if(wearID == 5512){
emptyLargePouch();
return false;
}
if(wearID == 5514){
emptyGiantPouch();
return false;
}
if(wearID == 4035 && q5 == 3){
triggerTele(2650, 4565, 1);
}
if(wearID == 7498){
showInterface(2808);
}
if(wearID == 4031 && q5 == 3){
			npcId = 1463;
			npcId2 = npcId;
			isNpc = true;
			specGFX(160);
}
if(wearID == 731){
			npcId = 1472;
			npcId2 = npcId;
			isNpc = true;
			specGFX(190);
sM("use ::pnpc [82-84].");
return false;
}
if(wearID == 714){
return false;
}
if(wearID == 4151 && FightType == 2){
FightType = 3;
SkillID = 3;
}
if(wearID == 3888 && FightType == 2){
FightType = 3;
SkillID = 3;
}

		int targetSlot = 0;
		targetSlot = itemType(wearID);
		int[] two_hand = {841, 6609,13643,13664,8002, 1319, 4718, 4726, 1409, 4710, 7158, 8100, 3204, 4755, 4153, 4827,667,35,2402,746, 6528,843,845,849,847,853,851,859,861,7096,4734,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223, 4747 };
		for (int element : two_hand) {
			if ((wearID == element) && (playerEquipment[playerShield] > 0)) {
				if (playerHasItem(-1)) {
					addItem(playerEquipment[playerShield], 1);
					playerEquipment[playerShield] = -1;
					playerEquipmentN[playerShield] = 0;
					setEquipment(-1, 0, playerShield);
				} else {
					sM("Not enough space in your inventory.");
					return false;
				}
			}
			if ((itemType(wearID) == playerShield)
					&& (playerEquipment[playerWeapon] == element)) {
				if (playerHasItem(-1)) {
					addItem(playerEquipment[playerWeapon], 1);
					playerEquipment[playerWeapon] = -1;
					playerEquipmentN[playerWeapon] = 0;
					setEquipment(-1, 0, playerWeapon);
				} else {
					sM("Not enough space in your inventory.");
					return false;
				}
			}
		}
      //server.checkPlayerCapes.processAll(this);
    if ((playerItems[slot]-1) == wearID) {
      targetSlot = itemType(wearID);
            		int CLAttack = server.Wearing.GetCLAttack(wearID);
			int CLDefence = server.Wearing.GetCLDefence(wearID);
			int CLStrength = server.Wearing.GetCLStrength(wearID);
			int CLMagic = server.Wearing.GetCLMagic(wearID);
			int CLRanged = server.Wearing.GetCLRanged(wearID);
			int CLCrafting = server.Wearing.GetCLCrafting(wearID);
			int CLHitpoints = server.Wearing.GetCLHitpoints(wearID);
			int CLAgility = server.Wearing.GetCLAgility(wearID);
			int CLPrayer = server.Wearing.GetCLPrayer(wearID);
			int CLSlayer = server.Wearing.GetCLSlayer(wearID);
			int CLMining = server.Wearing.GetCLMining(wearID);
			int CLFishing = server.Wearing.GetCLFishing(wearID);
			int CLCooking = server.Wearing.GetCLCooking(wearID);
			int CLFarming = server.Wearing.GetCLFarming(wearID);
			int CLFletching = server.Wearing.GetCLFletching(wearID);
			int CLFiremaking = server.Wearing.GetCLFiremaking(wearID);
			int CLSmithing = server.Wearing.GetCLSmithing(wearID);
			int CLHerblore = server.Wearing.GetCLHerblore(wearID);
			int CLWoodcutting = server.Wearing.GetCLWoodcutting(wearID);
			int CLThieving = server.Wearing.GetCLThieving(wearID);
			int CLRunecrafting = server.Wearing.GetCLRunecrafting(wearID);
      			boolean GoFalse = false;
			
			/*if ((inWaiterAssault()) && (targetSlot == playerCape)) {
			sM("You can't wear other capes in Barbarian Assault Mini-game");
			return false;
			}*/
			if (targetSlot == playerWeapon) {
			if (playerEquipment[playerWeapon] == 4031 && q5 == 3) {
			isNpc = false;
			specGFX(160);
			}
		}
      if(wearID == 4363){
				GoFalse = true;
      }
      if (CLAttack > getLevelForXP(playerXP[0])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have an "+statName[playerAttack]+" level of "+CLAttack+".");
        GoFalse = true;
      }
			if (CLHitpoints > getLevelForXP(playerXP[3])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerHitpoints]+" level of "+CLHitpoints+".");
				GoFalse = true;
			}
      if (CLDefence > getLevelForXP(playerXP[1])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerDefence]+" level of "+CLDefence+".");
        GoFalse = true;
      }
      if (CLStrength > getLevelForXP(playerXP[2])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerStrength]+" level of "+CLStrength+".");
        GoFalse = true;
      }
      if (CLMagic > getLevelForXP(playerXP[6])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerMagic]+" level of "+CLMagic+".");
        GoFalse = true;
      }
      if (CLRanged > getLevelForXP(playerXP[4])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerRanged]+" level of "+CLRanged+".");
        GoFalse = true;
      }
			if (CLHerblore > getLevelForXP(playerXP[15])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerHerblore]+" level of "+CLHerblore+".");
				GoFalse = true;
			}
if (CLThieving > getLevelForXP(playerXP[17])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerThieving]+" level of "+CLThieving+".");
				GoFalse = true;
			}
			if (CLSmithing > getLevelForXP(playerXP[13])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerSmithing]+" level of "+CLSmithing+".");
				GoFalse = true;
			}
			if (CLFarming > getLevelForXP(playerXP[19])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerFarming]+" level of "+CLFarming+".");
				GoFalse = true;
			}
			if (CLFletching > getLevelForXP(playerXP[9])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have an "+statName[playerFletching]+" level of "+CLFletching+".");
				GoFalse = true;
			}
if (CLFiremaking > getLevelForXP(playerXP[11])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerFiremaking]+" level of "+CLFiremaking+".");
				GoFalse = true;
			}
			if (CLCooking > getLevelForXP(playerXP[7])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerCooking]+" level of "+CLCooking+".");
				GoFalse = true;
			}
			if (CLFishing > getLevelForXP(playerXP[10])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerFishing]+" level of "+CLFishing+".");
				GoFalse = true;
			}
			if (CLRunecrafting > getLevelForXP(playerXP[20])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerRunecrafting]+" level of "+CLRunecrafting+".");
				GoFalse = true;
			}
			if (CLWoodcutting > getLevelForXP(playerXP[8])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerWoodcutting]+" level of "+CLWoodcutting+".");
				GoFalse = true;
			}
			if (CLMining > getLevelForXP(playerXP[14])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerMining]+" level of "+CLMining+".");
				GoFalse = true;
			}
			if (CLSlayer > getLevelForXP(playerXP[18])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerSlayer]+" level of "+CLSlayer+".");
				GoFalse = true;
			}
			if (CLPrayer > getLevelForXP(playerXP[5])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerPrayer]+" level of "+CLPrayer+".");
				GoFalse = true;
			}
			if (CLAgility > getLevelForXP(playerXP[16])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have an "+statName[playerAgility]+" level of "+CLAgility+".");
				GoFalse = true;
			}
			if (CLCrafting > getLevelForXP(playerXP[12])) {
				sM("You are not a high enough level to use this item.");
				sM("You need to have a "+statName[playerCrafting]+" level of "+CLCrafting+".");
				GoFalse = true;
			}
			if (GoFalse == true) {
				return false;
			}
			int wearAmount = playerItemsN[slot];
			server.special.needSpecial(this, wearID, targetSlot);	
			if (wearAmount < 1) {
				return false;
			}
			if ((slot >= 0) && (wearID >= 0)) {
				deleteItem(wearID, slot, wearAmount);
				if ((playerEquipment[targetSlot] != wearID)
						&& (playerEquipment[targetSlot] >= 0)) {
					addItem(playerEquipment[targetSlot],
							playerEquipmentN[targetSlot]);
				} else if (Item.itemStackable[wearID]
						&& (playerEquipment[targetSlot] == wearID)) {
					wearAmount = playerEquipmentN[targetSlot] + wearAmount;
				} else if (playerEquipment[targetSlot] >= 0) {
					addItem(playerEquipment[targetSlot],
							playerEquipmentN[targetSlot]);
				}
			}
			outStream.createFrameVarSizeWord(34);
			outStream.writeWord(1688);
			outStream.writeByte(targetSlot);
			outStream.writeWord(wearID + 1);
			if (wearAmount > 254) {
				outStream.writeByte(255);
				outStream.writeDWord(wearAmount);
			} else {
				outStream.writeByte(wearAmount); // amount
			}
			outStream.endFrameVarSizeWord();
			playerEquipment[targetSlot] = wearID;
			playerEquipmentN[targetSlot] = wearAmount;
for (int element : two_hand) {
			if ((targetSlot == playerWeapon)
					&& (playerEquipment[playerShield] != -1)
					&& (Item.itemTwoHanded[wearID] == true) && wearID == element) {
				remove(playerEquipment[playerShield], playerShield);
			}
}
			if (targetSlot == playerWeapon) {
			autocasting = false;
			autocastID = 0;
			setClientConfig(108, 0);
			SendWeapon(wearID, getItemName(wearID));
			playerSE = GetStandAnim(wearID);
			playerSEW = GetWalkAnim(wearID);
			playerSER = GetRunAnim(wearID);
			playerSEA = 0x326;
        		pEmote = playerSE;
			specOn = false;
			specAttack();
			}
			ResetBonus();
			GetBonus();
			wearing = false;
			WriteBonus();
			updateRequired = true;
			appearanceUpdateRequired = true;
			return true;
		}
		return false;
	}

	/* WOODCUTTING */
	public boolean woodcutting() {
		if (randomed)
			return false;
		int WCAxe = 0;

		if (IsCutting == true) {
			WCAxe = 1; // If Cutting -> Go trough loop, passby WCCheckAxe to
			// prevent originalweapon loss, 1 to tell you got axe,
			// no function left for WCAxe if cutting, so 1 is
			// enough.
		} else {
			WCAxe = WCCheckAxe();
		}
		if (WCAxe > 0) {
			if (playerLevel[playerWoodcutting] >= woodcutting[1]) {
				if (freeSlots() > 0) {
					if ((System.currentTimeMillis() - lastAction >= 1000)
							&& (IsCutting == false)) {
						lastAction = System.currentTimeMillis();
						attackTimer++;
						sM("You swing your axe at the tree.");
						attackTimer = (int) ((woodcutting[0] + 10) - WCAxe);
						if (attackTimer < 1) {
							attackTimer = 1;
						}
						pEmote = 0x284;
						IsCutting = true;
					}
					if ((System.currentTimeMillis() - lastAction >= 1600)
							&& (IsCutting == true)) {
						lastAction = System.currentTimeMillis();
						addSkillXP(woodcutting[2],
								playerWoodcutting);
						if (freeSlots() > 0) {
							sM("You get some logs.");
							addItem(woodcutting[4], 1);
							attackTimer += 2;
						} else {
							playerEquipment[playerWeapon] = OriginalWeapon;
							OriginalWeapon = -1;
							resetAnimation();
							IsCutting = false;
							resetWC();
						}
					}
				} else {
					// createEnemyItem(woodcutting[4]);
					sM("Not enough space in your inventory.");
					woodcutting[0] = -1;
					resetWC();
					return false;
				}
			} else {
				sM("You need " + woodcutting[1] + " "
						+ statName[playerWoodcutting] + " to cut those logs.");
				resetWC();
				return false;
			}
		} else {
			sM("Equip your axe before cutting trees!");
			resetWC();
			return false;
		}
		return true;
	}

	public void WriteLog2(String data, String file) {
		// used for bans/mutes/chatlogs etc. -bakatool
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("hiscores/" + file + ".txt",
					true));
			bw.write(data);
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException ioe2) {
					System.out.println("Error writing system log.");
					ioe2.printStackTrace();
				}
		}
	}
	public void writeLog(String data, String file) {
		// used for bans/mutes/chatlogs etc. -bakatool
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("config//" + file + ".txt",
					true));
			bw.write(data);
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException ioe2) {
					System.out.println("Error writing system log.");
					ioe2.printStackTrace();
				}
		}
	}
	public void yell(String message) {
		for (Player p : handler.players) {
			if ((message.indexOf("tradereq") > 0)
					|| (message.indexOf("duelreq") > 0))
				return;
			if ((p == null) || !p.isActive)
				continue;
			client temp = (client) p;
			if ((temp.absX > 0) && (temp.absY > 0))
				if ((temp != null) && !temp.disconnected && p.isActive)
					temp.sM(message);
		}
	}

}
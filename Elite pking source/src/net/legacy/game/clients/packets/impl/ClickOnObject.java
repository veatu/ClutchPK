package net.legacy.game.clients.packets.impl;

import net.legacy.Server;
import net.legacy.game.clients.Client;

public class ClickOnObject {

	//public void clickob(int a){
	public void clickob(int ID,int objectID, int objectX, int objectY) {

	Client c  = (Client) Server.playerHandler.players[ID];
		
		if (objectID == 7146)
				{
					if (c.playerLevel[16] < 90)
					{
						c.sM("You need to have 90 agility to past this.");
						//break;
					}
					if (objectX == 3021 && objectY == 4842)
					{
						c.toX = 3031;
						c.toY = 4843;
					}
				}
		if (objectID == 7147)
				{
					if (c.playerLevel[16] < 90)
					{
						c.sM("You need to have 90 agility to past this.");
						//break;
					}
					if (objectX == 3028 && objectY == 4849)
					{
						c.toX = 3038;
						c.toY = 4846;
					}
				}
				if (objectID == 7148)
				{
					if (c.playerLevel[16] < 90)
					{
						c.sM("You need to have 90 agility to past this.");
						//break;
					}
					if (objectX == 3038 && objectY == 4853)
					{
						c.toX = 3038;
						c.toY = 4846;
					}
				}
				if (objectID == 7149)
				{
					if (c.playerLevel[16] < 90)
					{
						c.sM("You need to have 90 agility to past this.");
						//break;
					}
					if (objectX == 3049 && objectY == 4849)
					{
						c.toX = 3047;
						c.toY = 4844;
					}
				}
				if (objectID == 7150)
				{
					if (c.playerLevel[17] < 90)
					{
						c.sM("You don't have 90 thieving to past this.");
						//break;
					}
					if (objectX == 3018 && objectY == 4821)
					{
						c.toX = 3049;
						c.toY = 4841;
					}
				}
				if (objectID == 7144)
				{
					int axe = 0;
					axe = c.WCCheckAxe();
					if (axe < 1)
					{
						c.sM("You do not have an axe.");
						//break;
					}
					if (objectX == 3018 && objectY == 4821)
					{
						c.toX = 3029;
						c.toY = 4823;
					}
				}
				if (objectID == 7152)
				{
					int axe = 0;
					axe = c.WCCheckAxe();
					if (axe < 1)
					{
						c.sM("You do not have an axe.");
						//break;
					}
					if (objectX == 3057 && objectY == 4821)
					{
						c.toX = 3050;
						c.toY = 4822;
					}
				}
				if (objectID == 7143)
				{
					int pickaxe = 0;
					pickaxe = c.MICheckPickAxe();
					if (pickaxe < 1)
					{
						c.sM("You do not have an pickaxe.");
						//break;
					}
					if (objectX == 3026 && objectY == 4813)
					{
						c.toX = 3029;
						c.toY = 4821;
					}
					if (objectX == 3049 && objectY == 4813)
					{
						c.toX = 3029;
						c.toY = 4821;
					}
				}
				if (objectID == 2478)
				{ //air
					c.runecraft(1, 30, 556, 11, 22, 33, 44, 55, 66, 77, 88, 99);

				}
				if (objectID == 2466)
				{ //mind
					c.runecraft(2, 35, 558, 14, 28, 42, 56, 70, 84, 98, 150, 150);

				}
				if (objectID == 2480)
				{ //water
					c.runecraft(5, 40, 555, 19, 38, 57, 76, 95, 150, 150, 150, 150);

				}
				if (objectID == 2481)
				{ //earth
					c.runecraft(9, 45, 557, 26, 52, 78, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2482)
				{ //fire
					c.runecraft(14, 50, 554, 35, 70, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2483)
				{ //body
					c.runecraft(20, 45, 559, 46, 92, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2484)
				{ //coc.sMic
					c.runecraft(27, 65, 564, 59, 150, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2487)
				{ //chaos
					c.runecraft(35, 78, 562, 74, 150, 150, 150, 150, 150, 150, 150, 150);
				}
				if (objectID == 2486)
				{ //nat
					c.runecraft(44, 120, 561, 91, 150, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2485)
				{ //law
					c.runecraft(54, 140, 563, 150, 150, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 2488)
				{ //death
					c.runecraft(65, 150, 560, 150, 150, 150, 150, 150, 150, 150, 150, 150);

				}
				if (objectID == 7139)
				{
					c.toX = 2841;
					c.toY = 4829;
				}

				if (objectID == 7140)
				{
					c.toX = 2793;
					c.toY = 4828;
				}

				if (objectID == 7137)
				{
					c.toX = 2727;
					c.toY = 4833;
				}

				if (objectID == 7130)
				{
					c.toX = 2655;
					c.toY = 4830;
				}

				if (objectID == 7129)
				{
					c.toX = 2574;
					c.toY = 4849;
				}

				if (objectID == 7131)
				{
					c.toX = 2523;
					c.toY = 4826;
				}

				if (objectID == 7132)
				{
					c.toX = 2137;
					c.toY = 4833;
				}

				if (objectID == 7134)
				{
					c.toX = 2266;
					c.toY = 4842;
				}

				if (objectID == 7133)
				{
					c.toX = 2400;
					c.toY = 4835;
				}
				if (objectID == 12348 && c.q4 != 15){
					c.toX = 1861;
					c.toY = 5317;

				}
				if (objectID == 12351)
				{
					c.toX = 3207;
					c.toY = 3213;
				}
				if (objectID == 10229)
				{
			c.triggerTele(3089, 3489, 0);
			c.sM("You climb up into sunny edgeville.");
				}
				if (objectID ==1755) {
					c.toX = 2859;
					c.toY = 3519;
					c.triggerTele(3088, 3493, 0);
				}
				
		
		
		
		
		
		
		
		
		
	}
}
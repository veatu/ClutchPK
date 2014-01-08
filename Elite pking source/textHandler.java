public class textHandler {
	public void startText(int ID) {
client c = (client) server.playerHandler.players[ID];
c.sendQuest("ClutchPK Highscores", 6399);
c.sendQuest("Quest Points: "+c.questPoints+"  ", 640);

if(c.q3 == 0){
c.sendQuest("Desert Treasure", 7334);
}
if(c.q3 > 0){
c.sendQuest("@yel@Desert Treasure", 7334);
}
if(c.q3 == 15){
c.sendQuest("@gre@Desert Treasure", 7334);
}
if(c.q4 == 0){
c.sendQuest("Recipe For Disaster", 7336);
}
if(c.q4 > 0){
c.sendQuest("@yel@Recipe For Disaster", 7336);
}
if(c.q4 == 15){
c.sendQuest("@gre@Recipe For Disaster", 7336);
}
if(c.q5 == 0){
c.sendQuest("Monkey Madness", 7383);
}
if(c.q5 > 0){
c.sendQuest("@yel@Monkey Madness", 7383);
}
if(c.q5 == 15){
c.sendQuest("@gre@Monkey Madness", 7383);
}
if(c.q6 == 0){
c.sendQuest("While Guthix Sleeps", 7339);
}
if(c.q6 > 0){
c.sendQuest("@yel@While Guthix Sleeps", 7339);
}
if(c.q6 == 15){
c.sendQuest("@gre@While Guthix Sleeps", 7339);
}
if(c.q7 == 0){
c.sendQuest("Legends Quest", 7338);
}
if(c.q7 > 0){
c.sendQuest("@yel@Legends Quest", 7338);
}
if(c.q7 == 15){
c.sendQuest("@gre@Legends Quest", 7338);
}
if(c.q8 == 0){
c.sendQuest("", 7340);
}
if(c.q8 > 0){
c.sendQuest("@yel@Lunar Diplomacy", 7340);
}
if(c.q8 == 15){
c.sendQuest("@gre@Lunar Diplomacy", 7340);
}
//normals
	c.sendQuest("Home", 1300);
    c.sendQuest("Teleport home", 1301);
    
    c.sendQuest("Train", 1325);
    c.sendQuest("Rock crabs to train", 1326);
	
    c.sendQuest("Slayer", 1350);
    c.sendQuest("Slayer Tower", 1351);
	
    c.sendQuest("Catherby", 1382);
    c.sendQuest("Train non-combat skills here", 1383);
	
    c.sendQuest("Ardougne", 1415);
    c.sendQuest("Get your first money", 1416);
	
    c.sendQuest("Minigame tele", 1454);
    c.sendQuest("Try out minigames", 1455);
	
	c.sendQuest("Pking", 7457);
	c.sendQuest("Best Spots", 7458);
//ancient
	
	c.sendQuest("Train", 13037);
    c.sendQuest("Start training here.", 13038);
    c.sendQuest("@gre@0/0", 13042);
    c.sendQuest("@gre@0/0", 13043);
    c.sendQuest("@gre@0/0", 13044);
	
	c.sendQuest("Catherby", 13047);
    c.sendQuest("Some skilling.", 13048);
    c.sendQuest("@gre@0/0", 13051);
    c.sendQuest("@gre@0/0", 13052);
	
	c.sendQuest("Slayer Tower", 13055);
    c.sendQuest("Stairs working.", 13056);
    c.sendQuest("@gre@0/0", 13059);
    c.sendQuest("@gre@0/0", 13060);
	
	c.sendQuest("Monsters", 13063);
    c.sendQuest("Battle some monsters.", 13064);
    c.sendQuest("@gre@0/0", 13067);
    c.sendQuest("@gre@0/0", 13068);
	
    c.sendQuest("Bosses", 13071);
    c.sendQuest("Try our hard bosses.", 13072);
    c.sendQuest("@gre@0/0", 13076);
    c.sendQuest("@gre@0/0", 13077);
    c.sendQuest("@gre@0/0", 13078);
	
	c.sendQuest("MiniGames", 13081);
    c.sendQuest("Nice prizes.", 13082);
    c.sendQuest("@gre@0/0", 13085);
    c.sendQuest("@gre@0/0", 13086);
	
	c.sendQuest("Pking", 13089);
    c.sendQuest("Attractive zones.", 13090);
    c.sendQuest("@gre@0/0", 13093);
    c.sendQuest("@gre@0/0", 13094);
	
	c.sendQuest("Mage Bank", 13097);
    c.sendQuest("Gotta own em all!", 13098);
	c.sendQuest("@gre@0/0", 13101);
    c.sendQuest("@gre@0/0", 13102);

c.sendQuest("Rune Mysteries", 7333);

c.sendQuest("", 7341);
c.sendQuest("", 7337);
c.sendQuest("", 7335);
c.sendQuest("", 7342);
c.sendQuest("", 7343);
c.sendQuest("", 7344);
c.sendQuest("", 7345);
c.sendQuest("", 7346);
c.sendQuest("", 7347);
c.sendQuest("", 7348);
c.sendQuest("", 7349);
c.sendQuest("Name: "+c.playerName+" ", 6300);
c.sendQuest("Combat: "+c.combatLevel+" ", 6301);
c.sendQuest("Special: "+c.specialAmount+" ", 6302);
c.sendQuest("Energy: "+c.playerEnergy+" ", 6303);
c.sendQuest("Barrows: "+c.barrow+" ", 6304);
c.sendQuest("Pc Points: "+c.pcPoints+" ", 6305);
c.sendQuest("Assault: "+c.assaultKills+"", 6306);
c.sendQuest("Godwars: "+c.saraKills+" ", 6307);
c.sendQuest("lolol", 15225);
c.sendQuest("lolol", 15226);
c.sendQuest("lolol", 15227);
c.sendQuest("lolol", 15228);
c.sendQuest("Dagganoth", 12338);
c.sendQuest("Kings", 12339);
c.sendQuest("KBD", 811);
c.sendQuest("Gnome Stronghold", 809);
c.sendQuest("Godwars", 810);
c.sendQuest("Pest Control", 812);
c.sendQuest("Kalphite Queen", 813);
c.sendQuest(".", 12157);
//18439 = Dwarf
//18440 = Wartface & Bentnoze
//18441 = Pirate Pete
//18442 = Lumbridge Guide
//18443 = Evil Dave
//18444 = Skrach 'Bone Cruncher' Uglogwee
//18445 = Sir Amik Varze
//18446 = Monkey Ambassador
//18447 = Close Window
//18450 = Recipe for Disaster
//18451 = This quest is comprised of the 8 mini quest highlighted below
//18417 = Close Window
c.sendQuest("Recipe For Disaster - Task Completion", 18451);
c.sendQuest("@gre@Lumbridge Guides Task", 18439);
c.sendQuest("@red@Evil Daves Task", 18440);
c.sendQuest("@gre@Sir Amik Vase Task", 18441);
c.sendQuest("@gre@King Awowegei", 18442);
c.sendQuest("@gre@Dwarf Task", 18443);
c.sendQuest("@gre@Pirate Pete's Task", 18444);
c.sendQuest("@gre@Goblins Task", 18445);
c.sendQuest("@gre@Skrach Uglowee's Task", 18446);
c.sendQuest("Quiz", 7349);
c.sendQuest("Recipe For Disaster", 7350);
c.sendQuest("While Guthix Sleeps", 7351);
c.sendQuest("Unable Quests", 682);
c.sendQuest("Please enter your PIN using the buttons below.", 14920);
c.sendQuest("First click the FIRST digit", 15313);
c.sendQuest("1", 14883);
c.sendQuest("2", 14884);
c.sendQuest("3", 14885);
c.sendQuest("4", 14886);
c.sendQuest("5", 14887);
c.sendQuest("6", 14888);
c.sendQuest("7", 14889);
c.sendQuest("8", 14890);
c.sendQuest("9", 14891);
c.sendQuest("0", 14892);

c.sendQuest("7", 12147);

c.sendQuest("1x Exp Lamp", 12150);
c.sendQuest("5 Quest Points", 12151);
c.sendQuest("Ability to Wield Barrows gloves", 15152);
c.sendQuest("20,000,000 Coins.", 12153);
c.sendQuest("Full access to ", 12154);
c.sendQuest("The culmanacor's chest.", 12155);
c.sendQuest("You have completed Recipe For Disaster ", 12144);

c.sendQuest("Assault Rewards.", 11456);
c.sendQuest("I don't know it.", 14921);
c.sendQuest("Exit", 14922);
c.sendQuest("", 15075);
c.sendQuest("", 15076);
c.sendQuest("", 15176);
c.sendQuest("", 15171);
c.sendQuest("", 15079);
c.sendQuest("", 15080);
if(c.bankPin != -1){
    c.sendQuest("@gre@Set", 15105);
}
if(c.bankPin == -1){
    c.sendQuest("@red@NONE", 15105);
}
c.sendFrame126("Your World Scape - Deposit Box", 7421);
c.sendQuest("The Bank of Y W Scape - Bank Pin", 14923);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("Delete Pin", 15082);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("The Bank of Your World Scape",5383);
c.sendQuest("",4439);
c.sendQuest("Pest control", 10361);
c.sendQuest("Current points:", 10378);
c.sendQuest("Xmas Cracker", 10374);
c.sendQuest("Nothing", 10375);
c.sendQuest("          200 point", 10376);
c.sendQuest("Nothing", 6557);
c.sendQuest("Full Void", 16159);
c.sendQuest("          20 Points", 16160);
c.sendQuest("Close Window", 15949);//Close Text
c.sendQuest("      Your World Scape", 15950);//Title
c.sendQuest("", 15960);//Under Title
c.sendQuest("", 15959);//Beside ^
c.sendQuest("", 15961);//Beside ^
c.sendQuest("Client [V1.00]: Forums, Server chat section", 15951);//Bottom banner- top line
c.sendQuest("", 15955);//top line
c.sendQuest("", 15953);//top line
c.sendQuest("", 15958);//top line
c.sendQuest("No forums yet.", 15952);//Bottom banner- bottom line
c.sendQuest("         Latest update: Full magic", 15956);//bottom line
c.sendQuest("", 15954);//bottom line
c.sendQuest("", 15957);//bottom line
c.sendQuest("Runecrafting", 16251);
    c.sendQuest("", 4297);
    c.sendQuest("", 4298);
    c.sendQuest("", 4299);
    c.sendQuest("", 4300);
    c.sendQuest("", 4301);
    c.sendQuest("", 4302);
    c.sendQuest("", 4303);
    c.sendQuest("", 4304);
    c.sendQuest("", 14872);
    c.sendQuest("", 664);
    c.sendQuest("", 8971);
    c.sendFrame126("", 6570);
    c.sendFrame126("", 6572);
    c.sendFrame126("", 6664);
	c.sendQuest("Using this will send a notification to all online mods",
	5967);
	c.sendQuest(
	"@yel@Then click below to indicate which of our rules is being broken.",
	5969);
	c.sendQuest("4: Bug abuse (includes noclip)", 5974);
	c.sendQuest("5: YWSCAPE staff impersonation", 5975);
	c.sendQuest("6: Monster luring or abuse", 5976);
	c.sendQuest("8: Item Duplication", 5978);
	c.sendQuest("10: Misuse of yell channel", 5980);
	c.sendQuest("12: Possible duped items", 5982);
	}
} // ends textHandler
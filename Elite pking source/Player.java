import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Player implements Constants {


public String messageout = "null";
public String chatname = "null";
public String lastKilled1;
public String lastKilled2;
public String lastKilled3;
public String[] lastKilled = new String[3];
public boolean maxplayers = false;
public int maxplayersa = 100;
public int playercount;
public int rights;
public String botnames;
public String roomname;
	public boolean isMoving = false;
public boolean inclan = false;
public int roomide;
public boolean runis = false;
public boolean digging = false;
    public int itemKept1, itemKept2, itemKept3, itemKept4;
    public int itemLose1,itemLose2,itemLose3,itemLose4,itemLose5,itemLose6,itemLose7,itemLose8,itemLose9,itemLose10,itemLose11,itemLose12,itemLose13,itemLose14,itemLose15,itemLose16,itemLose17,itemLose18,itemLose19,itemLose20,itemLose21,itemLose22,itemLose23,itemLose24,itemLose25,itemLose26,itemLose27,itemLose28,itemLose29,itemLose30,itemLose31,itemLose32,itemLose33,itemLose34,itemLose35,itemLose36,itemLose37,itemLose38,itemLose39;
    public int itemLose1Slot,itemLose2Slot,itemLose3Slot,itemLose4Slot,itemLose5Slot,itemLose6Slot,itemLose7Slot,itemLose8Slot,itemLose9Slot,itemLose10Slot,itemLose11Slot,itemLose12Slot,itemLose13Slot,itemLose14Slot,itemLose15Slot,itemLose16Slot,itemLose17Slot,itemLose18Slot,itemLose19Slot,itemLose20Slot,itemLose21Slot,itemLose22Slot,itemLose23Slot,itemLose24Slot,itemLose25Slot,itemLose26Slot,itemLose27Slot,itemLose28Slot,itemLose29Slot,itemLose30Slot,itemLose31Slot,itemLose32Slot,itemLose33Slot,itemLose34Slot,itemLose35Slot,itemLose36Slot,itemLose37Slot,itemLose38Slot,itemLose39Slot;
    public int itemKept1Slot, itemKept2Slot, itemKept3Slot, itemKept4Slot;

   
public int lamestarter;
public long thiswillberemmovedsoon;



public boolean barragefix = false;
public boolean arrow2;
public long entangleDelay, lastEntangle;
public long walkDelay, lastWalk;
public long lastIncrease;
public long noobs;
public long nextloop;

public long lastSave = System.currentTimeMillis();
public long statIncrease = System.currentTimeMillis();
public long mageDelay;
public long vengDelay;
public long lastBookSwitch;
public long increaseTimer;
public long foodDelay;
public long potionDelay;
public int skulltimer = 0;
public boolean loadskull = false;
public long lastSpecial;
public long poisonDelay;
public long lastTeleblock;
public long tzhaarDelay;
public boolean teleblocked;
public boolean isSkulled;
public long lastSkull;
public long offTimer;
public boolean switchingBook;
public long actionInterval;
public long ddsInterval;
public long lastDds;
public long prayInterval;
public long lastPray;
public long lastArrow;
public long lastDrop;
public boolean arrow;
public int teleEffect;
public int smallPouch;
public int mediumPouch;
public int largePouch;
public int giantPouch;
public boolean waited;
public boolean logoutButton;
public boolean destruct;
public int updateTimer;
public boolean hasMultiSign;
public boolean autocasting;
public int autocastID;
public boolean hasWildySign;
public int wildyLevel;
public int magicGfx;
public int arenaSpellTimer;
public boolean crossbow;
public int shootArrow;
public int walkTimer;
public int dropTimer;
public int q1;
public int q2;
public int q3;
public int q4;
public int q5;
public int q6;
public int q7;
public int q8;
public int q9;
public int q10;
public int q11;
public int Ahrim;
public int Verac;



public int Dharok;
public int Torag;
public int Karils;
public int Guthan;
public int Barrows; 
public int startTz;
public boolean keep6570;
public int killedJad;
public int tzhaarTimer;
public boolean healers;
public int TzWave = -1;
public int WaveDelay = 40;
public int KilledTz;
public int NeededKills;
public int extraCb;
public boolean potionDrink;
public int potionTimer;
public int foodTimer;
public int useMageTime;
public int rangeTimer;
public int rangeTimer2;
public int spellbookTime;
public boolean Chivalry;
public boolean Piety;
public int MagePray;
public int RangePray;
public int firstCast;
public int brightness;
public int splitChat = 0;
public boolean usingSpecial;
public boolean castSpell, isStillSpell;
public boolean SaradominStrike, GuthixClaws, ZamorakFlames;
public boolean bankPinOn;
public int interfaceGame;
public int StatTimer = 90;
public int calcInt;
public int calcStage;
public int times;
public int times2;
public int finalAnswer;
public int interfaceEffect;
public int saraKills;
public int mageGfx;
public int magicTimerz;
public int mageStage;
public int autoRetaliate;
public String skulledBy;
public String clanName = "none", clanLeader = "nobody";
public String[] clanMembers = new String[17]; //19 total
public int[] CCID = { 16502, 16503, 16504, 16505, 16506, 16507, 16508, 16509, 16510, 16511, 16512, 16513, 16514, 16515 };
public boolean interfaceOpened;
public int delay;
public int DDStimer;
public int DDStimer2;
public int DDStimer3;
public int arrowsLeft = 100;
public int shieldLeft = 100;
public int hitStage;
public int hitStage2;
public int donator;
public int DDSdamage;
public int hitID;
public int emoting = 1979;
public int assaultKills;
public int tStage;
public boolean cookingOn;
public boolean inGame;
public boolean inPitsGame;
public int pcPoints;
public int option;
public int eoption;
public int tzStage;
public int jadStage;
public int rangeStage;
public int magicTimer;
public int specTimer;
public int specialAmount = 100;
public boolean specOn;
public int action;
public int jad;
public int gametimer;
public int hitTimer;
public int starter;
public boolean vengon;
public int vengTimer;
    public int magePotTimer;
    public int rangePotTimer;
    public boolean rangePot;
    public int strPotTimer;
    public boolean strPot;
    public int attPotTimer;
    public boolean attPot;
    public int defPotTimer;
    //public int itemKept1, itemKept2, itemKept3, itemKept4;
    //public int itemKept1Slot, itemKept2Slot, itemKept3Slot, itemKept4Slot;
    public boolean itemSlot1, itemSlot2, itemSlot3, itemSlot4;
public int MageTP;
public int praydrain;
public int AtkPray;
public int DefPray;
public boolean prayOn;
public boolean ProtItem;
public boolean PrayHeal;
public boolean DrainPray;
public boolean ProtMage;
public boolean ProtRange;
public boolean ProtMelee;
public boolean Smite;
public boolean Retribution;
public boolean Redemption;
	public int aaa;
	public int abc;
	public int abc2;
	public int actionButtonId = 0;
	public boolean adding = false;
	public int[] ancientButton = { 51133, 51185, -1, 51091, 24018, -1, 51159,
			51211, -1, 51111, 51069, -1, 51146, 51198, -1, 51102, 51058, -1,
			51172, 51224, -1, 51122, 51080, -1 };
	public int[] ancientId = { 12939, 12987, 0, 12901, 12861, 0, 12963, 13011,
			0, 12919, 12881, 0, 12951, 12999, 0, 12911, 12871, 0, 12975, 13023,
			0, 12929, 12891, 0 };
	public int[] ancientType = { 0, 0, 1, 2, 3, 1, 0, 0, 1, 2, 3, 1, 0, 0, 1,
			2, 3, 1, 0, 0, 1, 2, 3, 1 };
	public int angle = 250;
	long animationReset = 0, lastButton = 0;
	public boolean AnimationReset; // Resets Animations With The Use Of The
	public int AntiTeleDelay;
	public int attackedNpcId = -1;
	public int AttackingOn = 0;

	public int barTimer = 0, saveTimer = 0;
	public int[] baseDamage = { 5, 8, 0, 12, 15, 0, 17, 20, 0, 21, 22, 0, 23, 24, 0,
			25, 26, 0, 27, 28, 0, 29, 30, 0 };

	public String BonusName[] = { "Stab", "Slash", "Crush", "Magic", "Range",
			"Stab", "Slash", "Crush", "Magic", "Range", "Str", "Prayer" };
	public byte buffer[] = null;
	int cAmount = 0;
	public int[] casketItems = { 4724, 4726, 4728, 4730, 1050, 1053, 1055,
			1057, 1037, 3107, 4708, 4710, 4712, 4714, 2904, 777, 2414 };
	public boolean cast = false; // Part Of The Create Spell Code
	public int cba;
	int cExp = 0;
	int cItem = -1;
	int cLevel = 1;
	public int clickIndex = 0;
	public int[] clicks = new int[50];
	public int CombatExpRate = 1;
	public String converse;
	public int cooking[] = { 0, 0, 0, 1, -1, -1, -1 };
	public long[] coolDown = { 5000, 5000, 2500, 5000 };
	public int[] coolDownGroup = { 2, 2, 1, 2, 3, 1, 2, 2, 1, 2, 3, 1, 2, 2, 1,
			2, 3, 1, 2, 2, 1, 2, 3, 1 };
public boolean isInRock() {
	if((absX >= 2820 && absX <= 2870 && absY >= 3500 && absY <=3530))
	return true;
	else
	return false;
	}
public boolean isInPc() {
	if((absX >= 2624 && absX <= 2688 && absY >= 2560 && absY <=2622))
	return true;
	else
	return false;
	}
public boolean singleCombat() {
	if((absX >= 3042 && absX <= 3128 && absY >= 3512 && absY <=3616) || (absX >= 3324 && absX <= 3380 && absY >= 3560 && absY <=3710))
	return true;
	else
	return false;
	}
public boolean singleCombat2() {
	if((absX >= 2998 && absX <= 3160 && absY >= 3905 && absY <=3970))
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
public boolean isInWar() {
	if((absX >= 2699 && absX <= 2773 && absY >= 9098 && absY <=9146))
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
	if((absX >= 2820 && absX <= 2870 && absY >= 3500 && absY <=3550))
	return true;
	else
	return false;
	}
	public boolean isInWilderness(int coordX, int coordY, int Type) {
		if (Type == 1) {
			if (absX >= 2699 && absX <= 2753 && absY >= 9098 && absY <=9132 || (coordY >= 3523) && (coordY <= 3967) && (coordX <= 3392)
					&& (coordX >= 2942) || absX >= 2377 && absX <= 2429 && absY >= 3070 && absY <=3143|| absX >= 3220 && absX <= 3299 && absY >= 3520 && absY <=3548 || absX >= 2250 && absX <= 2296 && absY >= 4676 && absY <=4715) {
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
	// Devolution: crafting
	boolean crafting = false;
	int cSelected = -1, cIndex = -1;
	public int currentButton = 0, currentStatus = 0;
	public int cwAmount = 0;
	// Devolution: smelting
	boolean dialog = true, spinning = false;
	int dialogInterface = 2459, dialogId = 1;
	public String dMsg = "";
	public int doors = -1;

	public int[] effects = new int[10];
	public int emotes = 0;
	public int enemyId = -1, enemyX = -1, enemyY = -1, attackTimer = 0;
	public int EntangleDelay = 0;
	public int fangle = 0;
	public int fcasterX = 0;
	public int fcasterY = 0;
	// ActionTimer
	public int fcastid = 0;
	public int feh = 0;
	public int fenemyX = 0;

	public int fenemyY = 0;
        public int fLockon = 0;
	public int ffinishid = 0;
	public boolean fired = false; // Part Of The Create Spell Code
	public int firemaking[] = { 0, 0, 0, 1, -1 };
	public boolean firingspell = false; // Part Of The Create Spell Code

	boolean fishing = false;
	public boolean essMine = false;
	// Devolution: fishing
	int fishTries, fishId;

	public int fletchId = -1, fletchAmount = -1, fletchLog = -1,
			originalW = -1, originalS = -1, fletchExp = 0;

	public boolean fletching = false;

	// These are temp data
	public int fletchTime;

	public int fmgfxid = 0;

	public int foffsetX = 0;

	public int foffsetY = 0;

	public boolean friendUpdate = false, lookUpdate = false;

	public int fsh = 0;

	public int fspeed = 0;

	public long[] globalCooldown = new long[10];

	/* RANGE */
	public boolean HasArrows = false;

	public boolean HasBolts = false;

	public boolean HasRings = false;

	public boolean HasKnives = false;

	public boolean isSpellNPC; // added check weather magic attack player or

	public long lastAttack = 0;

	public long actionStart = 0;

	String[] lastMessage = new String[3];

	public long lastMouse = 0;
	// Devolution: fletching

	public int loginDelay = 1;
	public boolean lookNeeded = false;

	/* SUMMONING */

	public int lowMemoryVersion = 0;
	public int MageAttackIndex = -1; // -1
	public String MBBC;
	public String MBHT;
	public String MBID;

	/*
	 * --------MOD BOT----------- // MB = MOD BOT // -TC = Text Censor // -BC =
	 * Bad Command // -HT = Help Text // -ID = Item Duping
	 */
	public String MBTC;

	public int mining[] = { 0, 0, 0, 1, -1 };
        public int publicDroppendItem = 0;
public boolean Noprayer = true;
    public boolean defPot = true;
    public int bankPin;
    public int onPin;
    public int enteredPin;
    public boolean pinChanged;
    public boolean roomClosed;
    public int KilledBy[];
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
    public void getCombat()
    {
        int j = getLevelForXP(playerXP[playerAttack]);
        int k = getLevelForXP(playerXP[playerDefence]);
        int l = getLevelForXP(playerXP[playerStrength]);
        int i1 = getLevelForXP(playerXP[playerHitpoints]);
        int j1 = getLevelForXP(playerXP[playerPrayer]);
        int k1 = getLevelForXP(playerXP[playerRanged]);
        int l1 = getLevelForXP(playerXP[playerMagic]);
        combatLevel = (int)(((double)(k + i1) + Math.floor(j1 / 2)) * 0.25D) + 1;
        double d = (double)(j + l) * 0.32500000000000001D;
        double d1 = Math.floor((double)k1 * 1.5D) * 0.32500000000000001D;
        double d2 = Math.floor((double)l1 * 1.5D) * 0.32500000000000001D;
        if(d >= d1 && d >= d2 && extraCb == 0)
        {
            combatLevel += d;
        } else
        if(d1 >= d && d1 >= d2 && extraCb == 0)
        {
            combatLevel += d1;
        } else
        if(d2 >= d && d2 >= d1 && extraCb == 0)
        {
            combatLevel += d2;
        } else
        if(extraCb > 0)
        {
            combatLevel = extraCb;
        }
    } 
    public int getPlayerKiller()
    {
        int j;
        int k;
label0:
        {
            j = 0;
            k = 0;
            int l = 1;
            do
            {
                PlayerHandler _tmp = server.playerHandler;
                if(l >= 275)
                {
                    break label0;
                }
                if(j == 0)
                {
                    j = l;
                    k = 1;
                } else
                if(KilledBy[l] > KilledBy[j])
                {
                    j = l;
                    k = 1;
                } else
                if(KilledBy[l] == KilledBy[j])
                {
                    k++;
                }
                l++;
            } while(true);
        }
        if(k > 1)
        {
            j = playerId;
        }
        return j;
    }
    public boolean WithinDistance(int j, int k, int l, int i1, int j1)
    {
        for(int k1 = 0; k1 <= j1; k1++)
        {
            for(int l1 = 0; l1 <= j1; l1++)
            {
                if(j + k1 == l && (k + l1 == i1 || k - l1 == i1 || k == i1))
                {
                    return true;
                }
                if(j - k1 == l && (k + l1 == i1 || k - l1 == i1 || k == i1))
                {
                    return true;
                }
                if(j == l && (k + l1 == i1 || k - l1 == i1 || k == i1))
                {
                    return true;
                }
            }

        }

        return false;
    }
    public void faceNPC(int index) {
        faceNPC = index;
        faceNPCupdate = true;
        updateRequired = true;
    }
    protected boolean faceNPCupdate = false;
    public int faceNPC = -1;
    public void appendFaceNPCUpdate(stream str) {
        str.writeWordBigEndian(faceNPC);
    }
        public int playerEmotionReq = -1;
        public int playerEmotionDelay = 0;
	public void appendEmotionUpdate(stream str) {
		str.writeWordBigEndian((playerEmotionReq==-1) ? 65535 : playerEmotionReq);
		str.writeByteC(playerEmotionDelay);
	}
    	public int followID;
	public int followID2;
	public static client client = null;
	// client = new client();
	public boolean DDS2Damg = false;
	public boolean DDS2Damg2 = false;
	public boolean DDS2Damg3 = false;
	public boolean DDS2Damg4 = false;
	public boolean fightcaves2 = false;
        public boolean poisondmg = false;
	public boolean poisoned = false;
	// client = new client();
	public static int GObjId = 0;
	public static int GObjOrient = 0;
	public static int GObjSet = 0;
	public static int GObjType = 0;
	public static int GObjX = 0;
	public static int GObjY = 0;
	public static int id = -1; // mysql userid
	public static int localId = -1;
	// the list of npcs currently seen by thisPlayer
	// this has to be remembered because the client will build up exactly the
	// same list
	// and will be used on subsequent player movement update packets for
	// efficiency
	public final static int maxNPCListSize = NPCHandler.maxNPCSpawns;
	// the list of players currently seen by thisPlayer
	// this has to be remembered because the client will build up exactly the
	// same list
	// and will be used on subsequent player movement update packets for
	// efficiency
	public final static int maxPlayerListSize = PlayerHandler.maxPlayers;
	// walking related stuff - walking queue etc...
	public static final int walkingQueueSize = 50;
	protected static boolean newWalkCmdIsRunning = false;
	protected static int newWalkCmdSteps = 0;
	protected static int newWalkCmdX[] = new int[walkingQueueSize];
	protected static int newWalkCmdY[] = new int[walkingQueueSize];
	protected static int numTravelBackSteps = 0;
	protected static stream playerProps;
	protected static int tmpNWCX[] = new int[walkingQueueSize];
	protected static int tmpNWCY[] = new int[walkingQueueSize];
	protected static int travelBackX[] = new int[walkingQueueSize];
	protected static int travelBackY[] = new int[walkingQueueSize];
	static {
		playerProps = new stream(new byte[100]);
	}
	// the map region the player is currently in
	public int absX, absY;
	public int actionAmount = 0;
	public String actionName = "";
	public int ActionType = -1;
	public boolean AntiTradeScam = false;
	// player appearance related stuff
	protected boolean appearanceUpdateRequired = true; // set to true if the
	// player appearance
	// wasn't synchronized
	// with the clients yet or changed recently
	public boolean apset; // apperance set.
	public int attacknpc = -1;
	public int[] bankItems = new int[800];
	public int[] bankItemsN = new int[800];
	public boolean bankNotes = false;
	// a bitmap of players that we want to keep track of whether char appearance
	// has changed so
	// we know if we have to transmit those or can make use of the cached char
	// appearances in the client
	public byte cachedPropertiesBitmap[] = new byte[(PlayerHandler.maxPlayers + 7) >> 3];
	protected byte chatText[] = new byte[4096], chatTextSize = 0;
	protected int chatTextEffects = 0, chatTextColor = 0;
	protected boolean chatTextUpdateRequired = false;
	public boolean Climbing = false;
	public int ClimbStage = -1;
	public int combat = 0;
	public int combatLevel = 0;
	public String connectedFrom = "";
	public boolean CrackerForMe = false;
	public boolean CrackerMsg = false;
	// absolute x/y coordinates
	public int currentX, currentY;
	public int deathStage = 0;
	public long deathTimer = 0;
	public boolean debug = false;
	public int destinationID = -1;
	public int destinationRange = 1;
	public int destinationX = -1;
	public int destinationY = -1;
	// calculates directions of player movement, or the new coordinates when
	// teleporting
	public boolean didTeleport = false;
	public int dir1 = -1, dir2 = -1;
	public int DirectionCount = 0;
	protected boolean dirUpdate2Required = false;
	public boolean dirUpdateRequired = false;
	public boolean dropsitem = false;
	public int duelChatStage = -1;
	public int duelChatTimer = -1;
	public int duelItems[] = new int[28];
	public int duelItemsN[] = new int[28];
	public boolean duelRule[] = new boolean[28];
	public int duelStatus = -1; // 0 = Requesting duel, 1 = in duel screen, 2 =
	// waiting for other player to accept, 3 = in
	// duel, 4 = won
	// dueling
	public int duelWith = 0;
	public int Essence;
	public boolean fighting = false;
	public int FightType = 1;
	public int FocusPointX = -1, FocusPointY = -1;
	public boolean following = false;
public boolean followingh = false;
	public int freezeTimer = -1;
	// buddy list
	public long friends[] = new long[200];
	public String globalMessage = "";
	public int GObjChange = 1;
	public PlayerHandler handler = null;
	// /dueling
public int icons = 0;
		public int skulls = 0;
public int hint = 0;
        public int headIcon = 0;

	public boolean healUpdateRequired = false;
	// relative x/y coordinates (to map region)
	// Note that mapRegionX*8+currentX yields absX
	public int heightLevel;
	// 0-3 supported by the client
	protected int hitDiff = 0;
	public int hits = 0, fightId = 0, npcId2 = 0;
	protected boolean hitUpdateRequired = false;
	public int hptype = 0;
	public int i = 0;
	public long ignores[] = new long[100];
	public boolean inCombat = false;
	public boolean initialized = false, disconnected = false, savefile = true;
	public int ip = 0;
	public boolean isActive = false;
	public boolean IsAttacking = false;
	public boolean IsAttackingNPC = false;
	public boolean IsBanking = false;
	public boolean IsCutting = false;
	public boolean[] IsDropped = new boolean[ItemHandler.MaxDropItems];
	public boolean IsDropping = false;
	public boolean IsFireing = false;
	public boolean IsGhost = false;
	public boolean IsInCW = false;
	public boolean IsInTz = false;
	public boolean isInWilderness = false;
	public boolean isKicked = false;
	public boolean IsMakingFire = false;
	public boolean IsMining = false;
	public boolean isNpc;
	public boolean IsPMLoaded = false;
	// points to (first free) slot for writing to the queue
	public boolean isRunning = true;
	// name of the connecting client
	public boolean isRunning2 = true;
	public boolean IsShopping = false;
	public int IsSnowing = 0;
	protected boolean IsStair = false;
	public boolean IsUsingSkill = false;
	public int[] killers = new int[PlayerHandler.maxPlayers];
	public long lastCombat = 0;
	// implemented Constants (changed Constants to interface) -bakatool
	public long lastDeath = 0, lastAction = 0, lastClick = 0;
	public long lastPacket = 0, deathTime = 0;
	public int m4001 = 0;
	public int m4002 = 0;
	public int m4003 = 0;
	public int m4004 = 0;
	public int m4005 = 0;
	public int m4006 = 0;
	public int m4007 = 0;
	// set to true if char did teleport in this cycle
	public boolean mapRegionDidChange = false;
	public int mapRegionX, mapRegionY;
	protected boolean mask100update = false;
	public int mask100var1 = 0;
	public int mask100var2 = 0;
	protected boolean mask1update = false;
	public int mask1var = 0;
	protected boolean mask400update = false;
	public int maxItemAmount = /* 2000000000 */2147000000;
	public String md5pass = "", playerSalt = "";
	public boolean[] MustDelete = new boolean[ItemHandler.MaxDropItems];

	public int MyShopID = 0;
	protected int NewHP = 135;
	public boolean newhptype = false;

	public int NpcDialogue = 0;

	public boolean NpcDialogueSend = false;

	public int npcId;

	// bit at position npcId is set to 1 in case player is currently in
	// playerList
	public byte npcInListBitmap[] = new byte[(NPCHandler.maxNPCSpawns + 7) >> 3];
	public NPC npcList[] = new NPC[maxNPCListSize];

	public int npcListSize = 0;
	public int NpcTalkTo = 0;
	public int NpcWanneTalk = 0;
	public int OptionObject = -1;

	public int otherDuelItems[] = new int[28];
	public int otherDuelItemsN[] = new int[28];
	// Default appearance
	public int pArms = 31;
	public int pBeard = 16;
	public int pFeet = 42;
	public int pFeetC = 3;
	public int pGender = 0;
	public int pHairC = 3;
	public int pHands = 33;
	public int pHead = 1;
	public int pLegs = 39;
	public int pLegsC = 2;
	public int pSkinC = 0;
	public int pTorso = 20;
	public int pTorsoC = 1;
	
	public int playerSE = 0x328; // SE = Standard Emotion
	public int playerSEA = 0x326; // SEA = Standard Emotion Attack
	public int playerSER = 0x338; // SER = Standard Emotion Run
	public int playerSEW = 0x333; // SEW = Standard Emotion Walking
	public int pEmote = 0x328; // this being the original standing state
	public int pWalk = 0x333; // original walking animation
	public int playerFly = 0x2261; // Flying Emotion
	
	public int playerallignment;
	public int playerAncientMagics;

	public int playerBankSize = 350;
	
	public int playercwstatus;
	public int playerBonus[] = new int[12];
	
	public int playerHat = 0;
	public int playerCape = 1;
	public int playerAmulet = 2;
	public int playerWeapon = 3;
	public int playerChest = 4;
	public int playerShield = 5;
	public int playerLegs = 7;
	public int playerHands = 9;
	public int playerFeet = 10;
	public int playerRing = 12;
	public int playerArrows = 13;
	
	public int playerAttack = 0;
	public int playerDefence = 1;
	public int playerStrength = 2;
	public int playerHitpoints = 3;
	public int playerRanged = 4;
	public int playerPrayer = 5;
	public int playerMagic = 6;
	public int playerCooking = 7;
	public int playerWoodcutting = 8;
	public int playerFletching = 9;
	public int playerFishing = 10;
	public int playerFiremaking = 11;
	public int playerCrafting = 12;
	public int playerSmithing = 13;
	public int playerMining = 14;
	public int playerHerblore = 15;
	public int playerAgility = 16;
	public int playerThieving = 17;
	public int playerSlayer = 18;
	public int playerFarming = 19;
	public int playerRunecrafting = 20;
	
	public int playerEnergy = 100;
	public int playerEnergyGian;
	public int[] playerEquipment = new int[14];
	public int[] playerEquipmentN = new int[14];
	public int playerFollow[] = new int[PlayerHandler.maxPlayers];
	public int playerFollowID = -1;
	public int playerGameCount;
	public int playerGameTime;
	public int playerId = -1;
	// -1 denotes world is full, otherwise this is the playerId
	// corresponds to the index in Player players[]
	// bit at position playerId is set to 1 in case player is currently in
	// playerList
	public byte playerInListBitmap[] = new byte[(PlayerHandler.maxPlayers + 7) >> 3];
	public int playerIsMember;
	public int[] playerItems = new int[28];
	public int[] playerItemsN = new int[28];
	public String playerLastConnect;
	public int playerLastLogin;

	public int[] playerLevel = new int[25];
	public int currentHealth = playerLevel[playerHitpoints];
	public int maxHealth = playerLevel[playerHitpoints];
	public Player playerList[] = new Player[maxPlayerListSize];
	public int playerListSize = 0;
	public int playerLook[] = new int[6];

	public int playerMaxHit = 0;
	public int playerMD = -1;
	public int playerMessages;
	
	public String playerName = null;
	// name of the connecting client
	public String playerPass = null;
	public int playerRights;
	// 0=normal player, 1=player mod, 2=real mod, 3=admin?
	
	public String playerServer;
	
	public int playerstatus;

	public int[] playerXP = new int[25];
	public String plrText = "";
	public boolean plrTextUpdateRequired = false;
	// direction char is going in this cycle
	public int poimiX = 0, poimiY = 0;
	public boolean poisonDmg = false;
	public int poisonTimer = -1;
	public boolean premium = false, randomed = false;

	public int Privatechat = 0;

	public int rating = 1500, matchId = -1, matchLives = 2, loginReturn = 11,
			deathNum = 0, uid = -1, playerTicks = 100;

	public boolean RebuildNPCList = false;
	public int reducedAttack = -1;
	public boolean startDuel = false;
	public int StrPotion = 0;
	public int StrPrayer = 0;
	public int summonedNPCS = 0;
	public boolean takeAsNote = false;
	public String teleLoc = "";
	public boolean teleOtherScreen = false;
	public int toX = -1, toY = -1; // contain absolute x/y
	// coordinates of
	// destination we want to
	// teleport to
	public int teleReq = 0;
	public boolean TradeConfirmed = false;
	public int tradeId = -1, violations = 0;
	public boolean updateRequired = true;
	// set to true if, in general, updating for this player is required
	// i.e. this should be set to true whenever any of the other
	// XXXUpdateRequired flags are set to true
	// Important: this does NOT include chatTextUpdateRequired!
	public boolean UpdateShop = false;
	public int viewToX = -1;
	public int viewToY = -1;
	public int walkingQueueX[] = new int[walkingQueueSize],
			walkingQueueY[] = new int[walkingQueueSize];
	public boolean WalkingTo = false;
	public boolean WannePickUp = false;

	public int WanneTrade = 0;

	public int WanneTradeWith = 0;

	public boolean winDuel = false;

	public int wQueueReadPtr = 0;

	// points to slot for reading from queue
	public int wQueueWritePtr = 0;

	public Player(int _playerId) {
		playerId = _playerId;
	        KilledBy = new int[PlayerHandler.maxPlayers];
		// playerName = "player"+playerId;
		playerRights = 0; // player rights
		lastPacket = System.currentTimeMillis();
		for (int i = 0; i < playerItems.length; i++) {
			// Setting player items
			playerItems[i] = 0;
		}
		for (int i = 0; i < playerItemsN.length; i++) {
			// Setting Item amounts
			playerItemsN[i] = 0;
		}
        	for(int j1 = 0; j1 < KilledBy.length; j1++)
        	{
            		KilledBy[j1] = 0;
        	}

		for (int i = 0; i < playerLevel.length; i++) {
			// Setting Levels
			if (i == 3) {
				playerLevel[i] = 10;
				playerXP[i] = 1155;
				currentHealth = 10;
				maxHealth = 10;
			} else {
				playerLevel[i] = 1;
				playerXP[i] = 0;
			}
		}

		for (int i = 0; i < playerBankSize; i++) {
			// Setting bank items
			bankItems[i] = 0;
		}

		for (int i = 0; i < playerBankSize; i++) {
			// Setting bank item amounts
			bankItemsN[i] = 0;
		}
		// Setting Welcomescreen information
		Calendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int calc = ((year * 10000) + (month * 100) + day);
		playerLastLogin = calc;
		playerLastConnect = "";
		playerIsMember = 1;
		playerMessages = 0;

		// Setting player standard look
		playerLook[0] = 2;
		playerLook[1] = 6;
		playerLook[2] = 7;
		playerLook[3] = 10;
		playerLook[4] = 5;
		playerLook[5] = 0;

		// initial x and y coordinates of the player
		heightLevel = 0;
		// the first call to updateThisPlayerMovement() will craft the proper
		// initialization packet
		toX = 3092;
		toY = 3492;
playerEquipment[playerWeapon] = 4587;
playerEquipment[playerAmulet] = 6585;
playerEquipment[playerHands] = 7458;
playerEquipment[playerFeet] = 3105;
playerEquipment[playerCape] = 2414;
playerEquipment[playerChest] = 1035;
playerEquipment[playerLegs] = 1033;
playerEquipment[playerHat] = 656;
playerEquipment[playerShield] = 3842;

		// client initially doesn't know those values yet
		absX = absY = -1;
		mapRegionX = mapRegionY = -1;
		currentX = currentY = 0;
		resetWalkingQueue();
	}
	public int animationRequest = -1, animationWaitCycles = 0;
        protected boolean animationUpdateRequired = false;
	public void startAnimation(int animIdx)
	{
		animationRequest = animIdx;
		animationWaitCycles = 0;
	}
	public void appendAnimationRequest(stream str)
	{
		str.writeWordBigEndian((animationRequest==-1) ? 65535 : animationRequest);
		str.writeByte(animationWaitCycles);
	}

	// some remarks: one map region is 8x8
	// a 7-bit (i.e. 128) value thus ranges over 16 such regions
	// the active area of 104x104 is comprised of 13x13 such regions, i.e. from
	// the center region that is 6 regions in each direction (notice the magical
	// 6
	// appearing also in map region arithmetics...)

	public void addNewNPC(NPC npc, stream str, stream updateBlock) {
		int id = npc.npcId;
		npcInListBitmap[id >> 3] |= 1 << (id & 7); // set the flag
		npcList[npcListSize++] = npc;

		str.writeBits(14, id); // client doesn't seem to like id=0

		int z = npc.absY - absY;
		if (z < 0)
			z += 32;
		str.writeBits(5, z); // y coordinate relative to thisPlayer
		z = npc.absX - absX;
		if (z < 0)
			z += 32;
		str.writeBits(5, z); // x coordinate relative to thisPlayer

		str.writeBits(1, 0); // something??
		str.writeBits(12, npc.npcType);

		boolean savedUpdateRequired = npc.updateRequired;
		npc.updateRequired = true;
		npc.appendNPCUpdateBlock(updateBlock);
		npc.updateRequired = savedUpdateRequired;
		str.writeBits(1, 1); // update required
	}

	public void addNewPlayer(Player plr, stream str, stream updateBlock) {
		int id = plr.playerId;
		playerInListBitmap[id >> 3] |= 1 << (id & 7); // set the flag
		playerList[playerListSize++] = plr;

		str.writeBits(11, id); // client doesn't seem to like id=0

		// TODO: properly implement the character appearance handling
		// send this every time for now and don't make use of the cached ones in
		// client
		str.writeBits(1, 1); // set to true, if player definitions follow below
		boolean savedFlag = plr.appearanceUpdateRequired;
		boolean savedUpdateRequired = plr.updateRequired;
		plr.appearanceUpdateRequired = true;
		plr.updateRequired = true;
		plr.appendPlayerUpdateBlock(updateBlock);
		plr.appearanceUpdateRequired = savedFlag;
		plr.updateRequired = savedUpdateRequired;

		str.writeBits(1, 1); // set to true, if we want to discard the
		// (client side) walking queue
		// no idea what this might be useful for yet
		int z = plr.absY - absY;
		if (z < 0)
			z += 32;
		str.writeBits(5, z); // y coordinate relative to thisPlayer
		z = plr.absX - absX;
		if (z < 0)
			z += 32;
		str.writeBits(5, z); // x coordinate relative to thisPlayer
	}

	public void addToWalkingQueue(int x, int y) {
		int next = (wQueueWritePtr + 1) % walkingQueueSize;
		if (next == wQueueWritePtr)
			return;
		// walking queue full, silently discard the data
		walkingQueueX[wQueueWritePtr] = x;
		walkingQueueY[wQueueWritePtr] = y;
		wQueueWritePtr = next;
	}

	public void appendDirUpdate(stream str) {
		if (playerMD != -1) {
			/*
			 * str.writeBits(2, 1); // updateType str.writeBits(3,
			 * misc.xlateDirectionToClient[playerMD]); if (updateRequired) {
			 * str.writeBits(1, 1); // tell client there's an update block appended
			 * at the end } else { str.writeBits(1, 0); }
			 */
			str.writeWord(playerMD);
			playerMD = -1;
		}
	}





/*
} else if (hitDiff == 0 && poisonDmg == true) {
				str.writeByteA(2); // 0: red hitting - 1: blue hitting 2: poison 3: orange
*/
public boolean hitdone = false;

	protected void appendHitUpdate(stream str) {		
		try {
			str.writeByte(hitDiff); // What the perseon got 'hit' for


			if(hitDiff > 0 && healUpdateRequired && poisonDmg == false){
				str.writeByteA(0);

			} else if (hitDiff > 0 && poisonDmg == false) {//&& newhptype == false
				str.writeByteA(1); // 0: red hitting - 1: blue hitting




			} else if (hitDiff > 0 && poisonDmg == true) {
				str.writeByteA(2); // 0: red hitting - 1: blue hitting 2: poison 3: orange



			} else if (hitDiff > 0 && newhptype == true && poisonDmg == false) {
				str.writeByteA(hptype); // 0: red hitting - 1: blue hitting

			} else {
				str.writeByteA(0); // 0: red hitting - 1: blue hitting

			}

			if(!healUpdateRequired){
				
			} else {
				currentHealth = (currentHealth + hitDiff);
				if(currentHealth > maxHealth){
					currentHealth = maxHealth;
				}
			}
			healUpdateRequired = false;
			
			str.writeByteC(currentHealth); // Their current hp, for HP bar
			str.writeByte(getLevelForXP(playerXP[playerHitpoints])); // Their max hp, for HP bar
                        inCombat = true;
			lastCombat = System.currentTimeMillis();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void appendMask100Update(stream str) {
		str.writeWordBigEndian(mask100var1);
		str.writeDWord(mask100var2);
	}

	public void appendMask1Update(stream str) {
		str.writeWordBigEndian(mask1var);
	}

	public void appendMask400Update(stream str) {
		// Xerozcheez: Something to do with direction
		str.writeByteA(m4001);
		str.writeByteA(m4002);
		str.writeByteA(m4003);
		str.writeByteA(m4004);
		str.writeWordA(m4005);
		str.writeWordBigEndianA(m4006);
		str.writeByteA(m4007); // direction
	}

	protected void appendPlayerAppearance(stream str) {
		playerProps.currentOffset = 0;

		// TODO: yet some things to figure out on this block + properly implement
		// this
		playerProps.writeByte(pGender);
		// player gender. 0=Male and 1=Female


				playerProps.writeByte(skulls);

playerProps.writeByte(hint);
playerProps.writeByte(headIcon);


            	//playerProps.writeByte(headIconPk);
		// playerStatusMask - skull, prayers etc alkup 0

		// defining the character shape - 12 slots following - 0 denotes a null
		// entry and just a byte is used
		// slot 0,8,11,1 is head part - missing additional things are beard and
		// eyepatch like things either 11 or 1
		// cape, apron, amulet... the remaining things...
		if (isNpc == false) {
  if (playerEquipment[playerHat] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerHat]);
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerCape] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerCape]);
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerAmulet] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerAmulet]);
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerWeapon] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerWeapon]);
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerChest] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerChest]);
  } else {
   playerProps.writeWord(0x100+pTorso);
  }
  if (playerEquipment[playerShield] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerShield]);
  } else {
   playerProps.writeByte(0);
  }
  if (!Item.isPlate(playerEquipment[playerChest])) {
   playerProps.writeWord(0x100+pArms);
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerLegs] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerLegs]);
  } else {
    playerProps.writeWord(0x100+pLegs);
  }
  if (!Item.isHelm(playerEquipment[playerHat]) && !Item.isFullMask(playerEquipment[playerHat])) {
   playerProps.writeWord(0x100 + pHead);  // head
  } else {
   playerProps.writeByte(0);
  }
  if (playerEquipment[playerHands] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerHands]);
  } else {
   playerProps.writeWord(0x100+pHands);
  }
  if (playerEquipment[playerFeet] > 1) {
   playerProps.writeWord(0x200 + playerEquipment[playerFeet]);
  } else {
   playerProps.writeWord(0x100+pFeet);
  }
  if (!Item.isFullMask(playerEquipment[playerHat]) && (playerLook[0] != 1))
        playerProps.writeWord(0x100 + pBeard);      // Beard
           else
  playerProps.writeByte(0);
 } else {
  playerProps.writeWord(-1);
  playerProps.writeWord(npcId2);

 }
		// array of 5 bytes defining the colors
		playerProps.writeByte(pHairC); // hair color
		playerProps.writeByte(pTorsoC); // torso color.
		playerProps.writeByte(pLegsC); // leg color
		playerProps.writeByte(pFeetC); // feet color
		playerProps.writeByte(pSkinC); // skin color (0-6)

		playerProps.writeWord(pEmote); // standAnimIndex
		playerProps.writeWord(0x337); // standTurnAnimIndex
		playerProps.writeWord(playerSEW); // walkAnimIndex
		playerProps.writeWord(0x334); // turn180AnimIndex
		playerProps.writeWord(0x335); // turn90CWAnimIndex
		playerProps.writeWord(0x336); // turn90CCWAnimIndex
		playerProps.writeWord(playerSER); // runAnimIndex

		playerProps.writeQWord(misc.playerNameToInt64(playerName));

		// Stat fix, combat decreases when your hp or any of these skills get
		// lowerd, this fixes that problem.
            	getCombat();
		playerProps.writeByte(combatLevel);
		// combat level
		playerProps.writeWord(0);
		// incase != 0, writes skill-%d
		str.writeByteC(playerProps.currentOffset);
		// size of player appearance block
		str.writeBytes(playerProps.buffer, playerProps.currentOffset, 0);
	}

	protected void appendPlayerChatText(stream str) {
		str.writeWordBigEndian(((chatTextColor & 0xFF) << 8)
				+ (chatTextEffects & 0xFF));


if(playerRights == 3){
	if((playerName.equalsIgnoreCase("loki")) || (playerName.equalsIgnoreCase("thor"))){
	str.writeByte(6);
	} else
	str.writeByte(8);
}
else
if(playerRights == 2){
str.writeByte(5);
}else
if(playerRights == 1){
str.writeByte(4);
}else
if(donator == 1 && playerRights == 0){
str.writeByte(7);
}else
if(playerRights != 3 && playerRights != 2 && playerRights != 1){
str.writeByte(playerRights);
}




		//str.writeByte(playerRights);
		str.writeByteC(chatTextSize);
		// no more than 256 bytes!!!
		str.writeBytes_reverse(chatText, chatTextSize, 0);
	}

	public void appendPlayerUpdateBlock(stream str) {
		if (!updateRequired && !chatTextUpdateRequired)
			return;
		// nothing required
		int updateMask = 0;
		if (mask400update)
			updateMask |= 0x400; // Xerozcheez: Very interesting
		// update mask!
		if (mask100update)
			updateMask |= 0x100; // Xerozcheez: Graphics on player
		// update mask
                if(animationRequest != -1) updateMask |= 8;
		if (chatTextUpdateRequired)
			updateMask |= 0x80;
        	if (faceNPCupdate)
            	updateMask |= 1;
		if (appearanceUpdateRequired)
			updateMask |= 0x10;
		if (FocusPointX != -1)
			updateMask |= 2;
		if (hitUpdateRequired)
			updateMask |= 0x20;
		if (dirUpdateRequired)
			updateMask |= 0x40;
		if (plrTextUpdateRequired)
			updateMask |= 4;
                if(animationRequest != -1) updateMask |= 8;
		if (updateMask >= 0x100) {
			// byte isn't sufficient
			updateMask |= 0x40;
			// indication for the client that updateMask is stored in a word
			str.writeByte(updateMask & 0xFF);
			str.writeByte(updateMask >> 8);
		} else
			str.writeByte(updateMask);

		// now writing the various update blocks itself - note that their order
		// crucial
		if (mask400update)
			appendMask400Update(str); // Xerozcheez: Very
		// interesting update mask!
		if (mask100update)
			appendMask100Update(str); // Xerozcheez: Graphics on
		// player update mask
                if(animationRequest != -1) appendAnimationRequest(str);
		if (plrTextUpdateRequired)
			appendString4(str);
		if (chatTextUpdateRequired)
			appendPlayerChatText(str);
		if (faceNPCupdate)
           		appendFaceNPCUpdate(str);
		if (appearanceUpdateRequired)
			appendPlayerAppearance(str);
		if (FocusPointX != -1)
			appendSetFocusDestination(str);
		if (hitUpdateRequired)
			appendHitUpdate(str);
		if (dirUpdateRequired)
			appendDirUpdate(str);
                //if(animationRequest != -1) appendAnimationRequest(str);
		// TODO: add the various other update blocks

	}

	private void appendSetFocusDestination(stream str) {
		str.writeWordBigEndianA(FocusPointX);
		str.writeWordBigEndian(FocusPointY);
	}

	public void appendString4(stream str) {
		// Xerozcheez: Interesting mask, looks like to do with chat
		str.writeString(plrText);
	}

	public void applyPoisonToMe() // by bakatool.
	{
		poisonDmg = true;
		poisonDelay = misc.random(60);
		hitDiff = misc.random(5);
		updateRequired = true;
		hitUpdateRequired = true;
	}


	public void applyRecoil() 
	{
		hitDiff = misc.random(2);
		currentHealth -= hitDiff;
		updateRequired = true;
		hitUpdateRequired = true;
	}

	public void clearUpdateFlags() {
		FocusPointX = FocusPointY = -1;
		updateRequired = false;
		plrTextUpdateRequired = false;
		chatTextUpdateRequired = false;
		appearanceUpdateRequired = false;
		hitUpdateRequired = false;
                animationRequest = -1;
		mask100update = false;
        	faceNPCupdate = false;
        	faceNPC = 65535;
		IsStair = false;
	}

	public void dealDamage(int amt) {
		((client) this).debug("Dealing " + amt + " damage to you (hp="
				+ currentHealth + ")");
		currentHealth -= amt;
		if (currentHealth <= 0) {
			((client) this).debug("Triggering death timer");
			currentHealth = 0;
			deathStage = 1;
			deathTimer = System.currentTimeMillis();
		} else {
			/*
			 * if(amt == 0){ if (playerEquipment[playerShield] == -1){ pEmote = 404; }
			 * else { pEmote = 403; } }
			 */
		}
	}

	void destruct() {
		playerListSize = 0;
		for (int i = 0; i < maxPlayerListSize; i++)
			playerList[i] = null;
		npcListSize = 0;
		for (int i = 0; i < maxNPCListSize; i++)
			npcList[i] = null;

		absX = absY = -1;
		mapRegionX = mapRegionY = -1;
		currentX = currentY = 0;
		resetWalkingQueue();
	}

	public int getLevelForXP(int exp) {
		int points = 0;
		int output = 0;

		for (int lvl = 1; lvl <= 135; lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if (output >= exp)
				return lvl;
		}
		return 0;
	}

	public void getNextPlayerMovement() {
		mapRegionDidChange = false;
		didTeleport = false;
		dir1 = dir2 = -1;

		if ((toX != -1) && (toY != -1)) {
			mapRegionDidChange = true;
			if ((mapRegionX != -1) && (mapRegionY != -1)) {
				// check, whether destination is within current map region
				int relX = toX - mapRegionX * 8, relY = toY
						- mapRegionY * 8;
				if ((relX >= 2 * 8) && (relX < 11 * 8) && (relY >= 2 * 8)
						&& (relY < 11 * 8))
					mapRegionDidChange = false;
			}
			if (mapRegionDidChange) {
				// after map region change the relative coordinates range between 48 -
				// 55
				mapRegionX = (toX >> 3) - 6;
				mapRegionY = (toY >> 3) - 6;

				// playerListSize = 0; // completely rebuild playerList after teleport
				// AND map region change
			}

			currentX = toX - 8 * mapRegionX;
			currentY = toY - 8 * mapRegionY;
			absX = toX;
			absY = toY;
			resetWalkingQueue();

			toX = toY = -1;
			didTeleport = true;
		} else {
			dir1 = getNextWalkingDirection();
			if (dir1 == -1)
				return;
			// standing

			if (isRunning) {
				dir2 = getNextWalkingDirection();
			}

			// check, if we're required to change the map region
			int deltaX = 0, deltaY = 0;
			if (currentX < 2 * 8) {
				deltaX = 4 * 8;
				mapRegionX -= 4;
				mapRegionDidChange = true;
			} else if (currentX >= 11 * 8) {
				deltaX = -4 * 8;
				mapRegionX += 4;
				mapRegionDidChange = true;
			}
			if (currentY < 2 * 8) {
				deltaY = 4 * 8;
				mapRegionY -= 4;
				mapRegionDidChange = true;
			} else if (currentY >= 11 * 8) {
				deltaY = -4 * 8;
				mapRegionY += 4;
				mapRegionDidChange = true;
			}

			if (mapRegionDidChange) {
				// have to adjust all relative coordinates
				currentX += deltaX;
				currentY += deltaY;
				for (int i = 0; i < walkingQueueSize; i++) {
					walkingQueueX[i] += deltaX;
					walkingQueueY[i] += deltaY;
				}
			}

		}
	}

	// returns 0-7 for next walking direction or -1, if we're not moving
	public int getNextWalkingDirection() {
		if (wQueueReadPtr == wQueueWritePtr)
			return -1;
		// walking queue empty
		int dir;
		do {
			dir = misc.direction(currentX, currentY,
					walkingQueueX[wQueueReadPtr], walkingQueueY[wQueueReadPtr]);
			if (dir == -1)
				wQueueReadPtr = (wQueueReadPtr + 1) % walkingQueueSize;
			else if ((dir & 1) != 0) {
				println_debug("Invalid waypoint in walking queue!");
				resetWalkingQueue();
				return -1;
			}
		} while ((dir == -1) && (wQueueReadPtr != wQueueWritePtr));
		if (dir == -1)
			return -1;
		dir >>= 1;
		currentX += misc.directionDeltaX[dir];
		currentY += misc.directionDeltaY[dir];
		absX += misc.directionDeltaX[dir];
		absY += misc.directionDeltaY[dir];
		return dir;
	}

	public abstract void initialize();

	// PM Stuff
	public abstract boolean isinpm(long l);

	public void kick() {
		isKicked = true;
	}

	public abstract void loadpm(long l, int world);

	public abstract void pmupdate(int pmid, int world);

	public void postProcessing() {
		if (newWalkCmdSteps > 0) {
			/*
			 * int OldcurrentX = currentX; int OldcurrentY = currentY; for(i = 0; i <
			 * playerFollow.length; i++) { if (playerFollow[i] != -1 && following ==
			 * true) { PlayerHandler.players[playerFollow[i]].newWalkCmdSteps =
			 * (newWalkCmdSteps + 1); for(int j = 0; j < newWalkCmdSteps; j++) {
			 * PlayerHandler.players[playerFollow[i]].newWalkCmdX[(j + 1)] =
			 * newWalkCmdX[j]; PlayerHandler.players[playerFollow[i]].newWalkCmdY[(j +
			 * 1)] = newWalkCmdY[j]; }
			 * PlayerHandler.players[playerFollow[i]].newWalkCmdX[0] = OldcurrentX;
			 * PlayerHandler.players[playerFollow[i]].newWalkCmdY[0] = OldcurrentY;
			 * PlayerHandler.players[playerFollow[i]].poimiX = OldcurrentX;
			 * PlayerHandler.players[playerFollow[i]].poimiY = OldcurrentY; } }
			 */

			// place this into walking queue
			// care must be taken and we can't just append this because usually the
			// starting point (clientside) of
			// this packet and the current position (serverside) do not coincide.
			// Therefore we might have to go
			// back in time in order to find a proper connecting vertex. This is
			// also the origin of the character
			// walking back and forth when there's noticeable lag and we keep on
			// seeding walk commands.
			int firstX = newWalkCmdX[0], firstY = newWalkCmdY[0]; // the point we need
			// to connect to
			// from our current
			// position...

			// travel backwards to find a proper connection vertex
			int lastDir = 0;
			boolean found = false;
			numTravelBackSteps = 0;
			int ptr = wQueueReadPtr;
			int dir = misc.direction(currentX, currentY, firstX, firstY);
			if ((dir != -1) && ((dir & 1) != 0)) {
				// we can't connect first and current directly
				do {
					lastDir = dir;
					if (--ptr < 0)
						ptr = walkingQueueSize - 1;

					travelBackX[numTravelBackSteps] = walkingQueueX[ptr];
					travelBackY[numTravelBackSteps++] = walkingQueueY[ptr];
					dir = misc.direction(walkingQueueX[ptr],
							walkingQueueY[ptr], firstX, firstY);
					if (lastDir != dir) {
						found = true;
						break;
						// either of those two, or a vertex between those is a candidate
					}

				} while (ptr != wQueueWritePtr);
			} else
				found = true; // we didn't need to go back in time because the
			// current position
			// already can be connected to first

			if (!found) {
				println_debug("Fatal: couldn't find connection vertex! Dropping packet.");
				client temp = (client) this;
				temp.savegame(true);
				disconnected = true;
			} else {
				wQueueWritePtr = wQueueReadPtr;
				// discard any yet unprocessed waypoints from queue

				addToWalkingQueue(currentX, currentY); // have to add this in order to
				// keep consistency in the queue

				if ((dir != -1) && ((dir & 1) != 0)) {
					// need to place an additional waypoint which lies between
					// walkingQueue[numTravelBackSteps-2] and
					// walkingQueue[numTravelBackSteps-1] but can be connected to
					// firstX/firstY

					for (int i = 0; i < numTravelBackSteps - 1; i++) {
						addToWalkingQueue(travelBackX[i], travelBackY[i]);
					}
					int wayPointX2 = travelBackX[numTravelBackSteps - 1], wayPointY2 = travelBackY[numTravelBackSteps - 1];
					int wayPointX1, wayPointY1;
					if (numTravelBackSteps == 1) {
						wayPointX1 = currentX;
						wayPointY1 = currentY;
					} else {
						wayPointX1 = travelBackX[numTravelBackSteps - 2];
						wayPointY1 = travelBackY[numTravelBackSteps - 2];
					}
					// we're coming from wayPoint1, want to go in direction wayPoint2
					// but only so far that
					// we get a connection to first

					// the easiest, but somewhat ugly way:
					// maybe there is a better way, but it involves shitload of
					// different
					// cases so it seems like it isn't anymore
					dir = misc.direction(wayPointX1, wayPointY1, wayPointX2,
							wayPointY2);
					if ((dir == -1) || ((dir & 1) != 0)) {
						println_debug("Fatal: The walking queue is corrupt! wp1=("
								+ wayPointX1
								+ ", "
								+ wayPointY1
								+ "), "
								+ "wp2=("
								+ wayPointX2
								+ ", "
								+ wayPointY2
								+ ")");
					} else {
						dir >>= 1;
						found = false;
						int x = wayPointX1, y = wayPointY1;
						while ((x != wayPointX2) || (y != wayPointY2)) {
							x += misc.directionDeltaX[dir];
							y += misc.directionDeltaY[dir];
							if ((misc.direction(x, y, firstX, firstY) & 1) == 0) {
								found = true;
								break;
							}
						}
						if (!found) {
							println_debug("Fatal: Internal error: unable to determine connection vertex!"
									+ "  wp1=("
									+ wayPointX1
									+ ", "
									+ wayPointY1
									+ "), wp2=("
									+ wayPointX2
									+ ", "
									+ wayPointY2
									+ "), "
									+ "first=("
									+ firstX + ", " + firstY + ")");
						} else
							addToWalkingQueue(wayPointX1, wayPointY1);
					}
				} else {
					for (int i = 0; i < numTravelBackSteps; i++) {
						addToWalkingQueue(travelBackX[i], travelBackY[i]);
					}
				}

				// now we can finally add those waypoints because we made sure about the
				// connection to first
				for (int i = 0; i < newWalkCmdSteps; i++) {
					addToWalkingQueue(newWalkCmdX[i], newWalkCmdY[i]);
				}

			}
			isRunning = isRunning2;
			/*
			 * for(i = 0; i < playerFollow.length; i++) { if (playerFollow[i] != -1) {
			 * PlayerHandler.players[playerFollow[i]].postProcessing(); } }
			 */
		}
	}

	public void preProcessing() {
		newWalkCmdSteps = 0;
	}

	public void println(String str) {
		System.out.println("[player-" + playerId + "]: " + str);
	}

	public void println_debug(String str) {
		System.out.println("[player-" + playerId + "]: " + str);
	}

	// is being called regularily every 500ms - do any automatic player actions
	// herein
	public abstract boolean process();
	public abstract boolean packetProcess();

	public void removeequipped() {
		dropsitem = true;
	}

	public void resetWalkingQueue() {
		wQueueReadPtr = wQueueWritePtr = 0;
		// properly initialize this to make the "travel back" algorithm work
		for (int i = 0; i < walkingQueueSize; i++) {
			walkingQueueX[i] = currentX;
			walkingQueueY[i] = currentY;
		}
	}

	public abstract void sendpm(long name, int rights, byte[] chatmessage,
			int messagesize);

	public void TurnPlayerTo(int pointX, int pointY) {
		FocusPointX = 2 * pointX + 1;
		FocusPointY = 2 * pointY + 1;
	}

	public abstract void update();

	// handles anything related to character position basically walking, running
	// and standing
	// applies to only to "non-thisPlayer" characters
	public void updatePlayerMovement(stream str) {
		if (dir1 == -1) {
			// don't have to update the character position, because the char is just
			// standing
			if (updateRequired || chatTextUpdateRequired) {
				// tell client there's an update block appended at the end
				str.writeBits(1, 1);
				str.writeBits(2, 0);
			} else
				str.writeBits(1, 0);
		} else if (dir2 == -1) {
			// send "walking packet"
			str.writeBits(1, 1);
			str.writeBits(2, 1);
			str.writeBits(3, misc.xlateDirectionToClient[dir1]);
			str
					.writeBits(1,
							(updateRequired || chatTextUpdateRequired) ? 1 : 0);
		} else {
			// send "running packet"
			str.writeBits(1, 1);
			str.writeBits(2, 2);
			str.writeBits(3, misc.xlateDirectionToClient[dir1]);
			str.writeBits(3, misc.xlateDirectionToClient[dir2]);
			str
					.writeBits(1,
							(updateRequired || chatTextUpdateRequired) ? 1 : 0);
		}
	}

	// handles anything related to character position, i.e. walking,running and
	// teleportation
	// applies only to the char and the client which is playing it
public void updateThisPlayerMovement(stream str) {
		if (mapRegionDidChange) {
			str.createFrame(73);
			str.writeWordA(mapRegionX + 6); // for some reason the client substracts 6
			// from those values
			str.writeWord(mapRegionY + 6);
		}

		if (didTeleport == true) {
			str.createFrameVarSizeWord(81);
			str.initBitAccess();
			str.writeBits(1, 1);
			str.writeBits(2, 3);
			// updateType
			str.writeBits(2, heightLevel);
			str.writeBits(1, 1);
			// set to true, if discarding (clientside) walking queue
			str.writeBits(1, (updateRequired) ? 1 : 0);
			str.writeBits(7, currentY);
			str.writeBits(7, currentX);
			return;
		}

		if (dir1 == -1) {
			isMoving = false;
			// don't have to update the character position, because we're just
			// standing
			str.createFrameVarSizeWord(81);
			str.initBitAccess();
			if (updateRequired) {
				// tell client there's an update block appended at the end
				str.writeBits(1, 1);
				str.writeBits(2, 0);
			} else {
				str.writeBits(1, 0);
			}
			if (DirectionCount < 50) {
				DirectionCount++;
			}
		} else {
			
			DirectionCount = 0;
			str.createFrameVarSizeWord(81);
			str.initBitAccess();
			str.writeBits(1, 1);

			if (dir2 == -1) {
				isMoving = true;
				// send "walking packet"
				str.writeBits(2, 1);
				// updateType
				str.writeBits(3, misc.xlateDirectionToClient[dir1]);
				if (updateRequired)
					str.writeBits(1, 1);
				// tell client there's an update block appended at the end
				else
					str.writeBits(1, 0);
			} else {
				isMoving = true;
				// send "running packet"
				str.writeBits(2, 2);
				// updateType
				str.writeBits(3, misc.xlateDirectionToClient[dir1]);
				str.writeBits(3, misc.xlateDirectionToClient[dir2]);
				if (updateRequired)
					str.writeBits(1, 1);
				// tell client there's an update block appended at the end
				else
					str.writeBits(1, 0);
				if (playerEnergy > 0) {
					playerEnergy -= 1;
				} else {
					isRunning2 = false;
				}
			}
		}

	}
	public boolean withinDistance(NPC npc) {
		if (heightLevel != npc.heightLevel)
			return false;
		if (npc.NeedRespawn == true)
			return false;
		int deltaX = npc.absX - absX, deltaY = npc.absY - absY;
		return (deltaX <= 15) && (deltaX >= -16) && (deltaY <= 15)
				&& (deltaY >= -16);
	}

	// supported within the packet adding new players are coordinates relative
	// to thisPlayer
	// that are >= -16 and <= 15 (i.e. a signed 5-bit number)
	public boolean withinDistance(Player otherPlr) {
		if (heightLevel != otherPlr.heightLevel)
			return false;
		int deltaX = otherPlr.absX - absX, deltaY = otherPlr.absY - absY;
		return (deltaX <= 15) && (deltaX >= -16) && (deltaY <= 15)
				&& (deltaY >= -16);
	}
}

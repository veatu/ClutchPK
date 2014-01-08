public class GraphicsHandler {

	public static int[] castID = new int[5001];
	public static int[] endID = new int[5001];
	public static int[] gfxA = new int[5001];
	public static int[] gfxFH = new int[5001];
	public static int[] gfxS = new int[5001];
	public static int[] gfxSH = new int[5001];
	public static int[] GFXspot = new int[5001];
	public static int[] gfxX = new int[5001];
	public static int[] gfxY = new int[5001];
	public static int[] lockOn = new int[5001]; // 5001
	public static int[] moveID = new int[5001];
	public static int[] offX = new int[5001];
	public static int[] offY = new int[5001];
	public static int[] targetX = new int[5001];
	public static int[] targetY = new int[5001];
	public static void removeGFX(int castId, int enemyX, int enemyY) {
		for (int i = 0; i <= 5000; i++) {
			if ((GFXspot[i] == castId) && (targetX[i] == enemyX)
					&& (targetY[i] == enemyY)) {
				GFXspot[i] = 0;
				castID[i] = 0;
				moveID[i] = 0;
				endID[i] = 0;
				gfxX[i] = 0;
				gfxY[i] = 0;
				offX[i] = 0;
				offY[i] = 0;
				gfxA[i] = 0;
				gfxS[i] = 0;
				gfxSH[i] = 0;
				gfxFH[i] = 0;
				targetX[i] = 0;
				targetY[i] = 0;
				lockOn[i] = 0; // -1
			}
		}
	}
	public static void createNormalSpell(int castId, int casterY, int casterX,
			int offsetY, int offsetX, int angle, int speed, int movegfxID,
			int startHeight, int endHeight, int MageAttackIndex, int finishID,
			int enemyY, int enemyX) {
		for (Player p : PlayerHandler.players) {
			if (p != null) {
				client person = (client) p;
				if (person.playerName != null)
					person.firespell(castId, casterY, casterX, offsetY,
							offsetX, angle, speed, movegfxID, startHeight,
							endHeight, MageAttackIndex, finishID, enemyY,
							enemyX);
			}
		}
	}

	public GraphicsHandler() {
		for (int i = 0; i <= 5000; i++) {
			GFXspot[i] = 0;
			castID[i] = 0;
			moveID[i] = 0;
			endID[i] = 0;
			gfxX[i] = 0;
			gfxY[i] = 0;
			offX[i] = 0;
			offY[i] = 0;
			gfxA[i] = 0;
			gfxS[i] = 0;
			gfxSH[i] = 0;
			gfxFH[i] = 0;
			targetX[i] = 0;
			targetY[i] = 0;
			lockOn[i] = 0; // -1
		}
	}

}
package net.legacy.game.npcs;

import net.legacy.*;
import net.legacy.game.clients.*;
import net.legacy.game.clients.packets.impl.WalkingCheck;
import net.legacy.game.items.*;
import net.legacy.game.npcs.*;
import net.legacy.game.objects.*;
import net.legacy.game.world.*;
import net.legacy.game.*;
import net.legacy.utilities.*;

public class NPC {
    public int hitIDNPC;
    public int offTimerNPC;
    public boolean FaceDirection;
    public int FocusPointX;
    public int FocusPointY;
    private Tile currentTile;
    public int npcDefence;
    public String getWho = "";
    public int face;
    public int absX, absY;
    public boolean aggressive = false;
    public int aggroRadius = 0;
    public int freezeTimer = -1;
    // Devolution's variables
    public boolean GraphicsUpdateRequired;
    public boolean animUpdateRequired;
    public boolean dirUpdateRequired;

    public int[] effects = new int[10];
    public boolean faceToUpdateRequired;

    public int heightLevel;
    public boolean hit = false;

    public boolean hitUpdateRequired;
    public int HP, MaxHP, hitDiff, MaxHit, animNumber, actionTimer,
            StartKilling, enemyX, enemyY;
    public boolean IsDead, DeadApply, NeedRespawn, IsUnderAttack, IsClose,
            Respawns, IsUnderAttackNpc, IsAttackingNPC, walkingToPlayer,
            followingPlayer;
    public int[] Killing = new int[PlayerHandler.maxPlayers];
    public int makeX, makeY, moverangeX1, moverangeY1, moverangeX2,
            moverangeY2, moveX, moveY, direction, walkingType, attacknpc,
            followPlayer;
    public int npcId;
    public int npcType;
    public int PoisonClear = 0;
    public int poisonDelay = -1;
    public int PoisonDelay = 999999;

    public boolean poisonDmg = false;

    public int poisonTimer = -1;
    public boolean RandomWalk;
    public int reducedAttack = -1;
    // Devolution's variables
    public int respawnTime = 60, attackEmote = 0x326, deathEmote = 0x900; // in
    // seconds
    public int spawnX, spawnY;
    public String textUpdate;
    public boolean textUpdateRequired;
    public boolean updateRequired;
    public int viewX, viewY;

    public NPC(int _npcId, int _npcType) {
        npcId = _npcId;
        npcType = _npcType;
        direction = -1;
        IsDead = false;
        DeadApply = false;
        actionTimer = 0;
        RandomWalk = true;
        StartKilling = 0;
        IsUnderAttack = false;
        IsClose = false;
        for (int i = 0; i < Killing.length; i++) {
            Killing[i] = 0;
        }
    }

    public boolean walk(int extra) {
        if (absX + moveX + extra == 2414 && absY + moveY + extra == 5090 || absX + moveX + extra == 2414 && absY + moveY + extra == 5091 || absX + moveX + extra == 2414 && absY + moveY + extra == 5092 || absX + moveX + extra == 2414 && absY + moveY + extra == 5093 || absX + moveX + extra == 2414 && absY + moveY + extra == 5094 || absX + moveX + extra == 2414 && absY + moveY + extra == 5095 || absX + moveX + extra == 2414 && absY + moveY + extra == 5096 || absX + moveX + extra == 2414 && absY + moveY + extra == 5097 || absX + moveX + extra == 2414 && absY + moveY + extra == 5098 || absX + moveX + extra == 2414 && absY + moveY + extra == 5099 || absX + moveX + extra == 2415 && absY + moveY + extra == 5090 || absX + moveX + extra == 2416 && absY + moveY + extra == 5090 || absX + moveX + extra == 2417 && absY + moveY + extra == 5090 || absX + moveX + extra == 2418 && absY + moveY + extra == 5090 || absX + moveX + extra == 2419 && absY + moveY + extra == 5090 || absX + moveX + extra == 2420 && absY + moveY + extra == 5090 || absX + moveX + extra == 2421 && absY + moveY + extra == 5090 || absX + moveX + extra == 2422 && absY + moveY + extra == 5090 || absX + moveX + extra == 2415 && absY + moveY + extra == 5099 || absX + moveX + extra == 2416 && absY + moveY + extra == 5099 || absX + moveX + extra == 2417 && absY + moveY + extra == 5099 || absX + moveX + extra == 2418 && absY + moveY + extra == 5099 || absX + moveX + extra == 2419 && absY + moveY + extra == 5099 || absX + moveX + extra == 2420 && absY + moveY + extra == 5099 || absX + moveX + extra == 2421 && absY + moveY + extra == 5099 || absX + moveX + extra == 2422 && absY + moveY + extra == 5099 || absX + moveX + extra == 2463 && absY + moveY + extra == 5164 || absX + moveX + extra == 2451 && absY + moveY + extra == 5171 || absX + moveX + extra == 2464 && absY + moveY + extra == 5171 || absX + moveX + extra == 2403 && absY + moveY + extra == 5105 || absX + moveX + extra == 2403 && absY + moveY + extra == 5106 || absX + moveX + extra == 2403 && absY + moveY + extra == 5107 || absX + moveX + extra == 2403 && absY + moveY + extra == 5108 || absX + moveX + extra == 2403 && absY + moveY + extra == 5109 || absX + moveX + extra == 2403 && absY + moveY + extra == 5110 || absX + moveX + extra == 2403 && absY + moveY + extra == 5111 || absX + moveX + extra == 2392 && absY + moveY + extra == 5105 || absX + moveX + extra == 2393 && absY + moveY + extra == 5105 || absX + moveX + extra == 2394 && absY + moveY + extra == 5105 || absX + moveX + extra == 2395 && absY + moveY + extra == 5105 || absX + moveX + extra == 2396 && absY + moveY + extra == 5105 || absX + moveX + extra == 2397 && absY + moveY + extra == 5105 || absX + moveX + extra == 2398 && absY + moveY + extra == 5105 || absX + moveX + extra == 2399 && absY + moveY + extra == 5105 || absX + moveX + extra == 2400 && absY + moveY + extra == 5105 || absX + moveX + extra == 2401 && absY + moveY + extra == 5105 || absX + moveX + extra == 2402 && absY + moveY + extra == 5105 || absX + moveX + extra == 2392 && absY + moveY + extra == 5105 || absX + moveX + extra == 2392 && absY + moveY + extra == 5106 || absX + moveX + extra == 2392 && absY + moveY + extra == 5107 || absX + moveX + extra == 2392 && absY + moveY + extra == 5108 || absX + moveX + extra == 2392 && absY + moveY + extra == 5109 || absX + moveX + extra == 2392 && absY + moveY + extra == 5110 || absX + moveX + extra == 2392 && absY + moveY + extra == 5111 || absX + moveX + extra == 2392 && absY + moveY + extra == 5112 || absX + moveX + extra == 2392 && absY + moveY + extra == 5113 || absX + moveX + extra == 2392 && absY + moveY + extra == 5105 || absX + moveX + extra == 2392 && absY + moveY + extra == 5114 || absX + moveX + extra == 2392 && absY + moveY + extra == 5115 || absX + moveX + extra == 2392 && absY + moveY + extra == 5116 || absX + moveX + extra == 2371 && absY + moveY + extra == 5094 || absX + moveX + extra == 2372 && absY + moveY + extra == 5094 || absX + moveX + extra == 2373 && absY + moveY + extra == 5094 || absX + moveX + extra == 2374 && absY + moveY + extra == 5094 || absX + moveX + extra == 2375 && absY + moveY + extra == 5094 || absX + moveX + extra == 2376 && absY + moveY + extra == 5094 || absX + moveX + extra == 2377 && absY + moveY + extra == 5094 || absX + moveX + extra == 2378 && absY + moveY + extra == 5094 || absX + moveX + extra == 2379 && absY + moveY + extra == 5094 || absX + moveX + extra == 2380 && absY + moveY + extra == 5094 || absX + moveX + extra == 2381 && absY + moveY + extra == 5094 || absX + moveX + extra == 2382 && absY + moveY + extra == 5094 || absX + moveX + extra == 2383 && absY + moveY + extra == 5094 || absX + moveX + extra == 2384 && absY + moveY + extra == 5094 || absX + moveX + extra == 2384 && absY + moveY + extra == 5082 || absX + moveX + extra == 2384 && absY + moveY + extra == 5083 || absX + moveX + extra == 2384 && absY + moveY + extra == 5084 || absX + moveX + extra == 2384 && absY + moveY + extra == 5085 || absX + moveX + extra == 2384 && absY + moveY + extra == 5086 || absX + moveX + extra == 2384 && absY + moveY + extra == 5087 || absX + moveX + extra == 2384 && absY + moveY + extra == 5088 || absX + moveX + extra == 2384 && absY + moveY + extra == 5089 || absX + moveX + extra == 2384 && absY + moveY + extra == 5090 || absX + moveX + extra == 2384 && absY + moveY + extra == 5091 || absX + moveX + extra == 2384 && absY + moveY + extra == 5092 || absX + moveX + extra == 2384 && absY + moveY + extra == 5093 || absX + moveX + extra == 2368 && absY + moveY + extra == 5082 || absX + moveX + extra == 2369 && absY + moveY + extra == 5082 || absX + moveX + extra == 2370 && absY + moveY + extra == 5082 || absX + moveX + extra == 2371 && absY + moveY + extra == 5082 || absX + moveX + extra == 2372 && absY + moveY + extra == 5082 || absX + moveX + extra == 2373 && absY + moveY + extra == 5082 || absX + moveX + extra == 2374 && absY + moveY + extra == 5082 || absX + moveX + extra == 2375 && absY + moveY + extra == 5082 || absX + moveX + extra == 2376 && absY + moveY + extra == 5082 || absX + moveX + extra == 2377 && absY + moveY + extra == 5082 || absX + moveX + extra == 2378 && absY + moveY + extra == 5082 || absX + moveX + extra == 2379 && absY + moveY + extra == 5082 || absX + moveX + extra == 2380 && absY + moveY + extra == 5082 || absX + moveX + extra == 2381 && absY + moveY + extra == 5082 || absX + moveX + extra == 2382 && absY + moveY + extra == 5082 || absX + moveX + extra == 2383 && absY + moveY + extra == 5082 || absX + moveX + extra == 2374 && absY + moveY + extra == 5096 || absX + moveX + extra == 2374 && absY + moveY + extra == 5097 || absX + moveX + extra == 2373 && absY + moveY + extra == 5097 || absX + moveX + extra == 2372 && absY + moveY + extra == 5097 || absX + moveX + extra == 2374 && absY + moveY + extra == 5095 || absX + moveX + extra == 3503 && absY + moveY + extra == 9496 || absX + moveX + extra == 3508 && absY + moveY + extra == 9502 || absX + moveX + extra == 3507 && absY + moveY + extra == 9491 || absX + moveX + extra == 3502 && absY + moveY + extra == 9480 || absX + moveX + extra == 3502 && absY + moveY + extra == 9479 || absX + moveX + extra == 3496 && absY + moveY + extra == 9476 || absX + moveX + extra == 3491 && absY + moveY + extra == 9477 || absX + moveX + extra == 3470 && absY + moveY + extra == 9484 || absX + moveX + extra == 3469 && absY + moveY + extra == 9488 || absX + moveX + extra == 3470 && absY + moveY + extra == 9490 || absX + moveX + extra == 3461 && absY + moveY + extra == 9483 || absX + moveX + extra == 3464 && absY + moveY + extra == 9480 || absX + moveX + extra == 3464 && absY + moveY + extra == 9485 || absX + moveX + extra == 3492 && absY + moveY + extra == 9491 || absX + moveX + extra == 3496 && absY + moveY + extra == 9497 || absX + moveX + extra == 3471 && absY + moveY + extra == 9501 || absX + moveX + extra == 3466 && absY + moveY + extra == 9515 || absX + moveX + extra == 3484 && absY + moveY + extra == 9526 || absX + moveX + extra == 3486 && absY + moveY + extra == 9525 || absX + moveX + extra == 3499 && absY + moveY + extra == 9525 || absX + moveX + extra == 3504 && absY + moveY + extra == 9523 || absX + moveX + extra == 3507 && absY + moveY + extra == 9522 || absX + moveX + extra == 3509 && absY + moveY + extra == 9521 || absX + moveX + extra == 3511 && absY + moveY + extra == 9525 || absX + moveX + extra == 3513 && absY + moveY + extra == 9522 || absX + moveX + extra == 3511 && absY + moveY + extra == 9518) {
            return true;
        } else {
            return false;
        }
    }

    private void npcPos() {
        for (int i = 0; i < Server.npcHandler.maxNPCs; i++) {
            if (Server.npcHandler.npcs[i] != null && absX + moveX == Server.npcHandler.npcs[i].absX && absY + moveY == Server.npcHandler.npcs[i].absY || (Server.npcHandler.npcs[i] != null && Server.npcHandler.npcs[i].npcType != 2741 && Server.npcHandler.npcs[i].npcType != 2743 && Server.npcHandler.npcs[i].npcType != 2745 && Server.npcHandler.npcs[i].npcType != 1459 && (walk(0)))
/*	Big NPCs		*/
                    ||
                    (Server.npcHandler.npcs[i] != null && (Server.npcHandler.npcs[i].npcType == 2741 || Server.npcHandler.npcs[i].npcType == 2743 || Server.npcHandler.npcs[i].npcType == 2745 || Server.npcHandler.npcs[i].npcType == 1459) && (walk(3)))

/*	Big NPCs 2		*/
                    ||
                    (Server.npcHandler.npcs[i] != null && (Server.npcHandler.npcs[i].npcType == 2745) && (walk(4)))) {
                moveX = 0;
                moveY = 0;
            }
        }

    }

    private void playerPos() {
        label0:
        {
            int i = 0;
            do {
                PlayerHandler _tmp = Server.playerHandler;
                if (i >= 275) {
                    break label0;
                }
                PlayerHandler _tmp1 = Server.playerHandler;
                if (PlayerHandler.players[i] != null) {
                    PlayerHandler _tmp2 = Server.playerHandler;
                    if (absX + moveX == PlayerHandler.players[i].absX) {
                        PlayerHandler _tmp3 = Server.playerHandler;
                        if (absY + moveY == PlayerHandler.players[i].absY) {
                            moveX = 0;
                            moveY = 0;
                        }
                    }
                }
                i++;
            } while (true);
        }
    }

    private void largeNPCPos() {
        for (int i = 0; i < Server.npcHandler.maxNPCs; i++) {
            if (Server.npcHandler.npcs[i] != null && (Server.npcHandler.npcs[i].npcType == 1158 || Server.npcHandler.npcs[i].npcType == 1160 || Server.npcHandler.npcs[i].npcType == 2743 || Server.npcHandler.npcs[i].npcType == 2745) && (absX + moveX == Server.npcHandler.npcs[i].absX && absY + moveY == Server.npcHandler.npcs[i].absY || WithinDistance(absX + moveX, absY + moveY, Server.npcHandler.npcs[i].absX, Server.npcHandler.npcs[i].absY, 3))) {
                moveX = 0;
                moveY = 0;
            }
        }

    }

    public boolean WithinDistance(int i, int j, int k, int l, int i1) {
        for (int j1 = 0; j1 <= i1; j1++) {
            for (int k1 = 0; k1 <= i1; k1++) {
                if (i + j1 == k && (j + k1 == l || j - k1 == l || j == l)) {
                    return true;
                }
                if (i - j1 == k && (j + k1 == l || j - k1 == l || j == l)) {
                    return true;
                }
                if (i == k && (j + k1 == l || j - k1 == l || j == l)) {
                    return true;
                }
            }

        }

        return false;
    }


    public void TurnNpcTo(int i, int j) {
        FocusPointX = 2 * i + 1;
        FocusPointY = 2 * j + 1;
        updateRequired = true;
        FaceDirection = true;
    }

    private void appendSetFocusDestination(Stream stream1) {
        if (stream1 != null) {
            stream1.writeWordBigEndian(FocusPointX);
            stream1.writeWordBigEndian(FocusPointY);
        }
    }

    public void appendAnimUpdate(Stream str) {
        str.writeWordBigEndian(animNumber);
        str.writeByte(1);
    }

    public void appendDirUpdate(Stream str) {
        str.writeWord(direction);
    }

    public void appendFaceToUpdate(Stream str) {
        str.writeWordBigEndian(viewX);
        str.writeWordBigEndian(viewY);
    }

    protected void appendHitUpdate(Stream str) {
        try {
            if (hit == true) {
                HP -= hitDiff;
                hit = false;
            }
            if (HP <= 0) {
                IsDead = true;
            }
            str.writeByteC(hitDiff); // What the npc got 'hit' for
            if ((hitDiff > 0) && !poisonDmg) {
                str.writeByteS(1); // 0: red hitting - 1: blue hitting
            } else if ((hitDiff > 0) && poisonDmg) {
                str.writeByteS(2); // 0: red hitting - 1: blue hitting
            } else {
                str.writeByteS(0); // 0: red hitting - 1: blue hitting
            }
            str.writeByteS(Miscellaneous.getCurrentHP(HP, MaxHP, 100));
            str.writeByteC(100);
            poisonDmg = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void appendNPCUpdateBlock(Stream str) {
        if (!updateRequired)
            return; // nothing required
        int updateMask = 0;
        if (textUpdateRequired)
            updateMask |= 1;
        if (animUpdateRequired)
            updateMask |= 0x10;
        // if(hitUpdateRequired) updateMask |= 0x8;
        if (hitUpdateRequired)
            updateMask |= 0x40;
        if (dirUpdateRequired)
            updateMask |= 0x20;
        if (faceToUpdateRequired)
            updateMask |= 0x20;
        if (FaceDirection)
            updateMask |= 4;
        /*
		 * if(updateMask >= 0x100) { // byte isn't sufficient updateMask |=
		 * 0x40; // indication for the client that updateMask is stored in a
		 * word str.writeByte(updateMask & 0xFF); str.writeByte(updateMask >>
		 * 8); } else {
		 */
        str.writeByte(updateMask);
        // }

        // now writing the various update blocks itself - note that their order
        // crucial
        if (textUpdateRequired) {
            str.writeString(textUpdate);
        }
        if (animUpdateRequired)
            appendAnimUpdate(str);
        if (hitUpdateRequired)
            appendHitUpdate(str);
        if (dirUpdateRequired)
            appendDirUpdate(str);
        if (faceToUpdateRequired)
            appendFaceToUpdate(str);
        if (FaceDirection)
            appendSetFocusDestination(str);
        // TODO: add the various other update blocks
    }

    public void clearUpdateFlags() {
        updateRequired = false;
        textUpdateRequired = false;
        hitUpdateRequired = false;
        animUpdateRequired = false;
        dirUpdateRequired = false;
        textUpdate = null;
        FaceDirection = false;
        moveX = 0;
        moveY = 0;
        direction = -1;
    }


    public int getKiller() {
        int Killer = 0;
        int Count = 0;
        for (int i = 1; i < PlayerHandler.maxPlayers; i++) {
            if (false) {
                Killer = i;
                Count = 1;
            } else {
                if (Killing[i] > Killing[Killer]) {
                    Killer = i;
                    Count = 1;
                } else if (Killing[i] == Killing[Killer]) {
                    Count++;
                }
            }
        }
        return Killer;
    }

    public void getNextNPCMovement() {
        npcPos();
        //playerPos();
        //largeNPCPos();
        if (freezeTimer <= 0) {
            direction = -1;
            direction = getNextWalkingDirection();
        }
    }

    // returns 0-7 for next walking direction or -1, if we're not moving
    public int getNextWalkingDirection() {
        currentTile = new Tile(absX + moveX, absY + moveY, heightLevel);
        if (!WalkingCheck.tiles.containsKey(currentTile.getH() << 28 | currentTile.getX() << 14 | currentTile.getY())) {
            int dir;
            dir = Miscellaneous.direction(absX, absY, (absX + moveX), (absY + moveY));
            if (dir == -1)
                return -1;
            dir >>= 1;
            absX += moveX;
            absY += moveY;
            return dir;
        } else if (WalkingCheck.tiles.get(currentTile.getH() << 28 | currentTile.getX() << 14 | currentTile.getY()) == true) {
            return -1;
        } else {
            return -1;
        }
    }

    public void updateNPCMovement(Stream str) {
        if (direction == -1) {
            // don't have to update the npc position, because the npc is just
            // standing
            if (updateRequired) {
                // tell client there's an update block appended at the end
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else {
                str.writeBits(1, 0);
            }
        } else {
            // send "walking packet"
            str.writeBits(1, 1);
            str.writeBits(2, 1); // updateType
            str.writeBits(3, Miscellaneous.xlateDirectionToClient[direction]);
            if (updateRequired) {
                str.writeBits(1, 1); // tell client there's an update block
                // appended at the end
            } else {
                str.writeBits(1, 0);
            }
        }
    }
}

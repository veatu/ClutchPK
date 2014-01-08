import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NPCHandler {
	public static boolean IsDropping = false;
	public static int maxNPCs = 10000;
	public static int maxListedNPCs = 10000; // npc list every npc listed no
	// duplicates -bakatool
	public static int maxNPCDrops = 10000;
	public static int maxNPCSpawns = 10000; // spawns could be same npc multiple
	// times -bakatool
	public static int removeschaos[] = { 1, 2, 2, 2 };

	/*
	 * WORLDMAP: (walk able places) 01 - Aubury 02 - Varrock Mugger 03 - Lowe 04 -
	 * Horvik 05 - Varrock General Store 06 - Thessalia 07 - Varrock Sword Shop
	 * 08 - Varrock East Exit Guards 09 - Falador General Store 10 - Falador
	 * Shield Shop 11 - Falador Mace Shop 12 - Falador Center Guards 13 -
	 * Falador North Exit Guards 14 - Barbarian Village Helmet Shop 15 - Varrock
	 * Staff Shop 16 - Al-Kharid Skirt Shop 17 - Al-Kharid Crafting Shop 18 -
	 * Al-Kharid General Store 19 - Al-Kharid Leg Shop 20 - Al-Kharid Scimitar
	 * Shop 21 - Lumbridge Axe Shop 22 - Lumbridge General Store 23 - Port Sarim
	 * Battleaxe Shop 24 - Port Sarim Magic Shop 25 - Port Sarim Jewelery Shop
	 * 26 - Port Sarim Fishing Shop 27 - Port Sarim Food Shop 28 - Rimmington
	 * Crafting Shop 29 - Rommington Archery Shop 30 - Npc's around and in
	 * varrock 31 - Npc's at Rellekka 32 - Npc's around and in lumbridge 33 - 34 -
	 * 35 - 36 - 37 - 38 - 39 - 40 -
	 */
	public void annoyNpcs(int npcId) {
		for(Player p : server.playerHandler.players) {
			if(p != null) {
				client player = (client)p;
				if (player.distanceToPoint(npcs[npcId].absX, npcs[npcId].absY) <= getDistanceForNpc(npcId) && p.heightLevel == npcs[npcId].heightLevel && npcs[npcId].absX != 0 && npcs[npcId].absY != 0) {
					if(npcGetsAnnoyed(npcId) && (npcs[npcId] != null) && (npcs[npcId].StartKilling == 0)) {
						npcs[npcId].StartKilling = player.playerId;											npcs[npcId].IsUnderAttack = true;
						npcs[npcId].RandomWalk = false;
						AttackPlayer(player.playerId);
					}
				}
			}
		}
	}

	public int getDistanceForNpc(int Npc) {
		switch(npcs[Npc].npcType) {
case 2881:
case 2882:
case 2883:
return 3;
			case 50:
			case 504:
			case 1155:
			case 1160:
case 1116:
			case 1115:
case 3500:
case 3496:
case 3494:
case 3495:
case 3491:
case 3493:
			case 2627:
			case 2630:
			case 2631:
			case 2738:
			case 2741:
			case 2743:
case 72:
			case 2745:
			case 1472:
			case 3735:
			case 3745:
			case 3755:
			case 3765:
			case 3775:
			case 3785:
				return 100;
			case 2746:
				return 150;
			case 3200:
			case 63:
			case 1459:
			case 59:
			case 91:
			case 2025:
			case 2026:
			case 2027:
			case 2028:
			case 2029:
			case 2030:
			case 83:
			case 1153:
			case 1154:
			return 10;
				case 111:
				case 125:
				case 78:
				case 912:
				case 913:
				case 914:
				return 1;
			
			default:
				return 10;
		}
	}

	public boolean npcGetsAnnoyed(int Npc) {
		switch(npcs[Npc].npcType) {
			case 50:
case 2025:
case 2026:
case 2027:
case 2028:
case 2029:
case 2881:
case 2882:
case 2883:
case 3500:
case 2030:
case 3496:
case 3494:
case 3495:
case 3491:
case 3493:
			case 3200:
			case 504:

case 1116:
			case 1115:

			case 1459:
			case 1155:
			case 1160:
			case 2627:
			case 2630:
			case 2631:
			case 2738:
			case 2741:
			case 3735:
			case 3745:
			case 3755:
			case 3765:
			case 3775:
			case 3785:
			case 2743:
			case 2745:
case 72:
			case 2746:
			case 1472:
			case 63:
			case 111:
			case 125:
			case 59:
			case 91:
			case 912:
			case 913:
			case 914:
			case 78:
			case 83:
			case 1153:
			case 1154:
				return true;
			
			default:
				return false;
			}
	}
public void spawnANPC(int npcID, int absX, int absY, int height)
	{
server.npcHandler.newNPC(npcID, (absX), (absY), height, absX + 3, absY + 3, absX - 3, absY - 3, 0, server.npcHandler.GetNpcListHP(npcID), false);
	}
    public int jadBattle[] = {0,2,4};

        public int randomjadBattle()
        {
            return jadBattle[(int)(Math.random()*jadBattle.length)];
        }
    public int tzBattle[] = {0,2};

        public int randomtzBattle()
        {
            return tzBattle[(int)(Math.random()*tzBattle.length)];
        }
    public int rangeBattle[] = {0,2};

        public int randomrangeBattle()
        {
            return rangeBattle[(int)(Math.random()*rangeBattle.length)];
        }


	public static int worldmap[][] = {
			{
			/* 01 */3252, 3453, 3252, 3453, 3252, 3253, 3254, 3252, 3253,
					3254, 3255, 3252, 3253, 3252, 3253,
					/* 02 */3248, 3249, 3250, 3251, 3252, 3253, 3254, 3248,
					3249, 3250, 3251, 3252, 3253, 3254, 3248, 3249, 3250, 3251,
					3252, 3254, 3248, 3249, 3250, 3251, 3252, 3253, 3254, 3248,
					3249, 3250, 3251, 3252, 3253, 3254, 3248, 3249, 3250, 3251,
					3252, 3253, 3254, 3248, 3249, 3250, 3251, 3252, 3254, 3248,
					3249, 3250, 3251, 3252, 3253, 3254, 3248, 3249, 3250, 3251,
					3252, 3253, 3254, 3248, 3249, 3250, 3251, 3252, 3253, 3254,
					3248, 3249, 3250, 3251, 3252, 3253, 3254, 3248, 3249, 3250,
					3251, 3252, 3253, 3254, 3248, 3249, 3250, 3251, 3252, 3253,
					3254,
					/* 03 */3235, 3234, 3233, 3232, 3231, 3230, 3235, 3230,
					3235, 3234, 3233, 3232, 3231, 3230, 3234, 3232, 3231, 3234,
					3233, 3232, 3231, 3234, 3233, 3232, 3233, 3231,
					/* 04 */3231, 3230, 3229, 3232, 3231, 3230, 3229, 3229,
					3228, 3227, 3229, 3227, 3232, 3231, 3230, 3229, 3228, 3227,
					3232, 3231, 3230, 3229, 3228, 3227, 3226, 3225, 3232, 3231,
					3230, 3229, 3228, 3227, 3225, 3232, 3231, 3230, 3229, 3228,
					3227, 3225, 3232, 3229, 3228, 3227, 3226, 3232, 3231, 3230,
					3229,
					/* 05 */3217, 3216, 3215, 3214, 3219, 3218, 3217, 3216,
					3219, 3218, 3217, 3219, 3217, 3216, 3215, 3219, 3218, 3217,
					3216, 3215, 3214, 3220, 3219, 3217, 3216, 3215, 3214, 3219,
					3217, 3216, 3215, 3214, 3219, 3217, 3216, 3215, 3214, 3218,
					3217,
					/* 06 */3207, 3206, 3205, 3208, 3207, 3206, 3203, 3207,
					3206, 3205, 3204, 3203, 3207, 3206, 3205, 3204, 3203, 3202,
					3208, 3207, 3206, 3205, 3208, 3207, 3206, 3207,
					/* 07 */3206, 3204, 3203, 3202, 3209, 3208, 3207, 3205,
					3203, 3208, 3207, 3206, 3205, 3203, 3208, 3207, 3206, 3205,
					3204, 3203, 3202, 3208, 3207, 3206, 3205, 3203, 3207, 3206,
					3203, 3206, 3203, 3206, 3205, 3205, 3205,
					/* 08 */3268, 3268, 3268, 3268, 3268, 3269, 3269, 3269,
					3269, 3269, 3270, 3270, 3270, 3270, 3270, 3271, 3271, 3271,
					3271, 3271, 3272, 3272, 3272, 3272, 3272, 3273, 3273, 3273,
					3273, 3273, 3274, 3274, 3274, 3274, 3274, 3275, 3275, 3275,
					3276, 3276, 3276, 3276, 3273, 3274, 3275, 3276, 3273, 3274,
					3275, 3273,
					/* 09 */2958, 2957, 2959, 2958, 2957, 2959, 2958, 2957,
					2959, 2958, 2957, 2956, 2955, 2954, 2953, 2960, 2959, 2956,
					2955, 2953, 2960, 2959, 2957, 2956, 2953,
					/* 10 */2979, 2977, 2976, 2975, 2974, 2973, 2972, 2979,
					2978, 2977, 2972, 2972, 2974, 2973, 2972,
					/* 11 */2952, 2950, 2949, 2948, 2952, 2951, 2950, 2949,
					2948, 2952, 2951, 2950, 2949, 2948, 2952, 2951, 2950, 2949,
					2948, 2952, 2952, 2951,
					/* 12 */2969, 2967, 2966, 2965, 2964, 2963, 2962, 2961,
					2960, 2959, 2958, 2969, 2968, 2967, 2966, 2965, 2964, 2963,
					2962, 2961, 2960, 2959, 2958, 2969, 2968, 2967, 2966, 2965,
					2964, 2963, 2962, 2961, 2960, 2959, 2958, 2969, 2968, 2967,
					2966, 2965, 2964, 2963, 2962, 2961, 2960, 2959, 2958, 2969,
					2968, 2967, 2966, 2965, 2964, 2963, 2962, 2961, 2960, 2959,
					2958, 2969, 2968, 2967, 2966, 2964, 2963, 2962, 2961, 2960,
					2959, 2958, 2969, 2968, 2967, 2966, 2965, 2964, 2963, 2962,
					2961, 2960, 2959, 2958, 2969, 2968, 2967, 2966, 2965, 2964,
					2963, 2962, 2961, 2960, 2959, 2958, 2969, 2968, 2967, 2966,
					2965, 2964, 2963, 2962, 2961, 2960, 2959, 2958,
					/* 13 */2968, 2967, 2966, 2965, 2964, 2963, 2967, 2966,
					2965, 2964, 2966, 2965, 2967, 2966, 2965, 2964, 2968, 2967,
					2966, 2965, 2964, 2963, 2968, 2967, 2966, 2965, 2964, 2963,
					2967, 2966, 2965, 2964, 2968, 2967, 2966, 2965, 2964, 2963,
					/* 14 */3076, 3074, 3076, 3075, 3074, 3077, 3076, 3075,
					3074, 3073, 3077, 3074, 3077, 3076, 3075, 3074,
					/* 15 */3204, 3204, 3203, 3202, 3201, 3204, 3203, 3202,
					3201, 3203, 3201, 3203, 3202, 3201, 3204, 3203, 3201, 3204,
					/* 16 */3315, 3316, 3313, 3314, 3315, 3317, 3318, 3314,
					3317, 3314, 3315, 3316, 3317, 3313, 3314, 3315, 3316, 3317,
					3318, 3314, 3315, 3316, 3317,
					/* 17 */3319, 3320, 3323, 3318, 3319, 3320, 3322, 3323,
					3318, 3319, 3320, 3321, 3322, 3323, 3319, 3320, 3321, 3322,
					3319, 3320, 3322, 3323, 3318, 3319, 3320, 3323, 3319, 3320,
					/* 18 */3315, 3316, 3312, 3313, 3314, 3315, 3316, 3312,
					3313, 3314, 3315, 3316, 3317, 3312, 3313, 3314, 3315, 3316,
					3317, 3318, 3312, 3313, 3314, 3316, 3317, 3312, 3313, 3314,
					3316, 3317, 3312, 3313, 3314, 3316, 3317, 3314, 3317, 3315,
					/* 19 */3314, 3315, 3316, 3318, 3315, 3316, 3317, 3318,
					3314, 3315, 3316, 3317, 3318, 3314, 3315, 3316, 3314, 3315,
					/* 20 */3287, 3288, 3289, 3285, 3286, 3287, 3288, 3289,
					3290, 3287, 3288, 3289, 3290, 3287, 3288, 3289, 3290, 3286,
					3287, 3288, 3287,
					/* 21 */3229, 3232, 3228, 3229, 3230, 3231, 3232, 3233,
					3228, 3230, 3231, 3232, 3233, 3228, 3230, 3231, 3232, 3232,
					/* 22 */3210, 3211, 3209, 3210, 3211, 3212, 3214, 3209,
					3211, 3212, 3213, 3214, 3209, 3211, 3212, 3213, 3209, 3210,
					3211, 3212, 3213, 3214, 3209, 3211, 3212, 3213, 3209, 3210,
					3211, 3212, 3213, 3209, 3211, 3213,
					/* 23 */3026, 3028, 3024, 3025, 3026, 3027, 3028, 3029,
					3025, 3026, 3027, 3028, 3029, 3030, 3024, 3025, 3028, 3029,
					3030, 3024, 3025, 3028, 3029, 3024, 3025, 3026, 3027, 3028,
					3029, 3028, 3029, 3030, 3025, 3026, 3027, 3028, 3029,
					/* 24 */3012, 3013, 3014, 3015, 3016, 3012, 3015, 3016,
					3012, 3015, 3016, 3011, 3012, 3013, 3014, 3015, 3012,
					/* 25 */3012, 3014, 3012, 3013, 3014, 3015, 3012, 3013,
					3014, 3015, 3012, 3013, 3015, 3012, 3013, 3014,
					/* 26 */3013, 3014, 3013, 3014, 3013, 3014, 3015, 3016,
					3012, 3013, 3014, 3015, 3016, 3017, 3012, 3013, 3014, 3015,
					3011, 3012, 3013, 3014, 3015, 3016, 3011, 3012, 3013, 3014,
					3015, 3016, 3011, 3016, 3011, 3013, 3014, 3015, 3016, 3013,
					3014, 3016,
					/* 27 */3012, 3014, 3012, 3013, 3014, 3015, 3016, 3012,
					3015, 3012, 3013, 3014, 3015, 3016, 3013, 3014, 3015, 3013,
					3014, 3013, 3013,
					/* 28 */2946, 2947, 2952, 2946, 2947, 2950, 2951, 2952,
					2946, 2948, 2949, 2950, 2951, 2946, 2948, 2949, 2950, 2951,
					2946, 2947, 2948, 2949, 2950, 2951, 2948, 2949, 2948, 2949,
					/* 29 */2955, 2958, 2959, 2954, 2955, 2956, 2957, 2958,
					2959, 2953, 2954, 2956, 2957, 2958, 2957, 2958, 2959,
					/* 30 */3236, 3236, 3237, 3238, 3239, 3237, 3238, 3239,
					3240, 3236, 3237, 3238, 3239, 3240, 3236, 3237, 3238, 3239,
					3237, 3238,/**/3245, 3246, 3243, 3244, 3245, 3246, 3243,
					3244, 3245, 3246, 3247, 3246, 3247,/**/3261, 3260, 3261,
					3262, 3260, 3261, 3263, 3260, 3263, 3260, 3263, 3260, 3263,
					3260, 3261, 3262, 3263, 3260, 3261, 3263,/**/3234, 3235,
					3238, 3233, 3234, 3235, 3236, 3237, 3238, 3235, 3233, 3234,
					3235, 3236, 3233, 3234, 3235, 3236, 3237, 3238,/**/3290,
					3291, 3292, 3293, 3294, 3297, 3298, 3299, 3290, 3291, 3292,
					3293, 3294, 3295, 3296, 3297, 3298, 3299, 3290, 3291, 3292,
					3293, 3294, 3295, 3296, 3297, 3298, 3299, 3290, 3293, 3294,
					3295, 3296, 3297, 3298, 3299, 3290, 3293, 3294, 3295, 3296,
					3297, 3298, 3299, 3290, 3291, 3292, 3293, 3294, 3295, 3296,
					3297, 3298, 3299, 3290, 3291, 3292, 3293, 3294, 3295, 3296,
					3297, 3298, 3299,
					/* 31 */2662, 2663, 2661, 2662, 2663, 2661, 2662, 2663,
					2661, 2662, 2663, 2662, 2663, 2664, 2665, 2666, 2665, 2666,/**/
					2664, 2665, 2666, 2664, 2665, 2666, 2664, 2665, 2666, 2664,
					2665, 2666, 2664, 2665, 2666,/**/2679, 2680, 2679, 2680,
					2676, 2677, 2678, 2679, 2680, 2676, 2677, 2678, 2679, 2680,
					2676, 2677, 2678, 2679, 2680, 2674, 2675, 2676, 2677, 2678,
					2679, 2680, 2675, 2676, 2677, 2678, 2679, 2680,/**/2667,
					2668, 2669, 2670, 2671, 2667, 2668, 2669, 2670, 2671, 2667,
					2668, 2669, 2670, 2671, 2667, 2668, 2669, 2670, 2671, 2667,
					2668, 2669, 2670, 2671, 2667, 2668, 2669, 2670, 2671, 2667,
					2668, 2669, 2670, 2671, 2667, 2668, 2669, 2670, 2671,/**/
					2681, 2682, 2683, 2684, 2685, 2681, 2682, 2683, 2684, 2685,
					2681, 2682, 2683, 2684, 2685, 2681, 2682, 2683, 2684, 2685,
					2681, 2682, 2683, 2684, 2685,/**/2675, 2676, 2677, 2678,
					2679, 2675, 2676, 2677, 2678, 2679, 2675, 2676, 2677, 2678,
					2679, 2676, 2677, 2678, 2679, 2677, 2678, 2679,/**/
					2672, 2673, 2674, 2675, 2672, 2673, 2674, 2675, 2672, 2673,
					2674, 2675, 2672, 2673, 2674, 2675, 2672, 2673, 2674, 2675,
					2672, 2673, 2674, 2675, 2672, 2673, 2674, 2675,/**/2674,
					2675, 2676, 2677, 2678, 2674, 2675, 2676, 2677, 2678, 2674,
					2675, 2676, 2677, 2678, 2674, 2675, 2676, 2677, 2678, 2674,
					2675, 2677, 2678,/**/2685, 2686, 2687, 2688, 2689, 2685,
					2686, 2687, 2688, 2689, 2685, 2686, 2687, 2688, 2689, 2685,
					2686, 2687, 2688, 2689, 2685, 2686, 2687, 2688, 2689,/**/
					2668, 2669, 2670, 2671, 2672, 2668, 2669, 2670, 2671, 2672,
					2668, 2669, 2670, 2671, 2672, 2668, 2669, 2670, 2671, 2672,
					2668, 2669, 2670, 2671, 2672,/**/2679, 2680, 2681, 2682,
					2683, 2679, 2680, 2681, 2682, 2683, 2679, 2680, 2681, 2682,
					2683, 2679, 2680, 2681, 2682, 2683, 2679, 2680, 2681, 2682,
					2683,/**/2673, 2674, 2675, 2673, 2674, 2675, 2676, 2677,
					2673, 2674, 2675, 2676, 2677, 2673, 2674, 2675, 2676, 2677,
					2673, 2674, 2675, 2676, 2677,/**/2669, 2670, 2671, 2672,
					2669, 2670, 2671, 2672, 2673, 2669, 2670, 2671, 2672, 2673,
					2669, 2670, 2671, 2672, 2673, 2669, 2670, 2671, 2672, 2673,/**/
					2680, 2681, 2682, 2679, 2680, 2681, 2682, 2678, 2679, 2680,
					2681, 2682, 2678, 2679, 2680, 2681, 2682, 2678, 2679, 2680,
					2681, 2682,
					/* 32 */3228, 3229, 3226, 3227, 3228, 3225, 3226, 3228,
					3229, 3226, 3227, 3228, 3229, 3230, 3225, 3226, 3227, 3228,
					3229, 3230, 3225, 3229, 3225, 3226, 3227, 3228, 3229, 3226,/**/
					3232, 3233, 3234, 3235, 3236, 3237, 3232, 3233, 3234, 3235,
					3236, 3231, 3232, 3233, 3234, 3235, 3236, 3227, 3228, 3229,
					3231, 3232, 3233, 3234, 3235, 3236, 3225, 3226, 3227, 3228,
					3229, 3230, 3231, 3233, 3234, 3235, 3236, 3225, 3226, 3227,
					3228, 3229, 3230, 3231, 3232, 3233, 3234, 3235, 3236, 3225,
					3228, 3229, 3230, 3231, 3232, 3235, 3236, 3237, 3225, 3227,
					3228, 3229, 3230, 3231, 3232, 3233, 3235, 3236, 3237, 3225,
					3227, 3228, 3229, 3230, 3231, 3232, 3233, 3235, 3236, 3231,
					3235, },
			{
			/* 01 */3404, 3404, 3403, 3403, 4302, 4302, 4302, 3401, 3401,
					3401, 3401, 3400, 3400, 3399, 3399,
					/* 02 */3398, 3398, 3398, 3398, 3398, 3398, 3398, 3397,
					3397, 3397, 3397, 3397, 3397, 3397, 3396, 3396, 3396, 3396,
					3396, 3396, 3395, 3395, 3395, 3395, 3395, 3395, 3395, 3394,
					3394, 3394, 3394, 3394, 3394, 3394, 3393, 3393, 3393, 3393,
					3393, 3393, 3393, 3392, 3392, 3392, 3392, 3392, 3392, 3391,
					3391, 3391, 3391, 3391, 3391, 3391, 3390, 3390, 3390, 3390,
					3390, 3390, 3390, 3389, 3389, 3389, 3389, 3389, 3389, 3389,
					3388, 3388, 3388, 3388, 3388, 3388, 3388, 3387, 3387, 3387,
					3387, 3387, 3387, 3387, 3386, 3386, 3386, 3386, 3386, 3386,
					3386,
					/* 03 */3421, 3421, 3421, 3421, 3421, 3421, 3422, 3422,
					3423, 3423, 3423, 3423, 3423, 3423, 3424, 3424, 3424, 3425,
					3425, 3425, 3425, 3426, 3426, 3426, 3427, 3427,
					/* 04 */3433, 3433, 3433, 3434, 3434, 3434, 3434, 3435,
					3435, 3435, 3436, 3436, 3437, 3437, 3437, 3437, 3437, 3437,
					3438, 3438, 3438, 3438, 3438, 3438, 3438, 3438, 3439, 3439,
					3439, 3439, 3439, 3439, 3439, 3440, 3440, 3440, 3440, 3440,
					3440, 3440, 3441, 3441, 3441, 3441, 3441, 3442, 3442, 3442,
					3442,
					/* 05 */3411, 3411, 3411, 3411, 3412, 3412, 3412, 3412,
					3413, 3413, 3413, 3414, 3414, 3414, 3414, 3415, 3415, 3415,
					3415, 3415, 3415, 3416, 3416, 3416, 3416, 3416, 3416, 3417,
					3417, 3417, 3417, 3417, 3418, 3418, 3418, 3418, 3418, 3419,
					3419,
					/* 06 */3414, 3414, 3414, 3415, 3415, 3415, 3415, 3416,
					3416, 3416, 3416, 3416, 3417, 3417, 3417, 3417, 3417, 3417,
					3418, 3418, 3418, 3418, 3419, 3419, 3419, 3420,
					/* 07 */3495, 3495, 3495, 3495, 3396, 3396, 3396, 3396,
					3396, 3397, 3397, 3397, 3397, 3397, 3398, 3398, 3398, 3398,
					3398, 3398, 3398, 3399, 3399, 3399, 3399, 3399, 3400, 3400,
					3400, 3401, 3401, 3402, 3402, 3403, 3404,
					/* 08 */3426, 3427, 3428, 3429, 3430, 3426, 3427, 3428,
					3429, 3430, 3426, 3427, 3428, 3429, 3430, 3426, 3427, 3428,
					3429, 3430, 3426, 3427, 3428, 3429, 3430, 3426, 3427, 3428,
					3429, 3430, 3426, 3427, 3428, 3429, 3430, 3227, 3228, 3229,
					3426, 3427, 3430, 3420, 3421, 3421, 3421, 3421, 3422, 3422,
					3422, 3423,
					/* 09 */3385, 3385, 3386, 3386, 3386, 3387, 3387, 3387,
					3388, 3388, 3388, 3388, 3388, 3388, 3388, 3389, 3389, 3389,
					3389, 3389, 3390, 3390, 3390, 3390, 3390,
					/* 10 */3383, 3383, 3383, 3383, 3383, 3383, 3383, 3384,
					3384, 3384, 3384, 3385, 3386, 3386, 3386,
					/* 11 */3385, 3385, 3385, 3385, 3386, 3386, 3386, 3386,
					3386, 3387, 3387, 3387, 3387, 3387, 3388, 3388, 3388, 3388,
					3388, 3389, 3390, 3390,
					/* 12 */3376, 3376, 3376, 3376, 3376, 3376, 3376, 3376,
					3376, 3376, 3376, 3377, 3377, 3377, 3377, 3377, 3377, 3377,
					3377, 3377, 3377, 3377, 3377, 3378, 3378, 3378, 3378, 3378,
					3378, 3378, 3378, 3378, 3378, 3378, 3378, 3379, 3379, 3379,
					3379, 3379, 3379, 3379, 3379, 3379, 3379, 3379, 3379, 3380,
					3380, 3380, 3380, 3380, 3380, 3380, 3380, 3380, 3380, 3380,
					3380, 3381, 3381, 3381, 3381, 3381, 3381, 3381, 3381, 3381,
					3381, 3381, 3382, 3382, 3382, 3382, 3382, 3382, 3382, 3382,
					3382, 3382, 3382, 3382, 3383, 3383, 3383, 3383, 3383, 3383,
					3383, 3383, 3383, 3383, 3383, 3383, 3384, 3384, 3384, 3384,
					3384, 3384, 3384, 3384, 3384, 3384, 3384, 3384,
					/* 13 */3391, 3391, 3391, 3391, 3391, 3391, 3392, 3392,
					3392, 3392, 3393, 3393, 3394, 3394, 3394, 3394, 3395, 3395,
					3395, 3395, 3395, 3395, 3396, 3396, 3396, 3396, 3396, 3396,
					3397, 3397, 3397, 3397, 3398, 3398, 3398, 3398, 3398, 3398,
					/* 14 */3427, 3427, 3428, 3428, 3428, 3429, 3429, 3429,
					3429, 3429, 3430, 3430, 3431, 3431, 3431, 3431,
					/* 15 */3431, 3432, 3432, 3432, 3432, 3433, 3433, 3433,
					3433, 3434, 3434, 3435, 3435, 3435, 3436, 3436, 3436, 3437,
					/* 16 */3160, 3160, 3161, 3161, 3161, 3161, 3161, 3162,
					3162, 3163, 3163, 3163, 3163, 3164, 3164, 3164, 3164, 3164,
					3164, 3165, 3165, 3165, 3165,
					/* 17 */3191, 3191, 3191, 3192, 3192, 3192, 3192, 3192,
					3193, 3193, 3193, 3193, 3193, 3193, 3194, 3194, 3194, 3194,
					3195, 3195, 3195, 3195, 3196, 3196, 3196, 3196, 3197, 3197,
					/* 18 */3178, 3178, 3179, 3179, 3179, 3179, 3179, 3180,
					3180, 3180, 3180, 3180, 3180, 3181, 3181, 3181, 3181, 3181,
					3181, 3181, 3182, 3182, 3182, 3182, 3182, 3183, 3183, 3183,
					3183, 3183, 3184, 3184, 3184, 3184, 3184, 3185, 3185, 3186,
					/* 19 */3173, 3173, 3173, 3173, 3174, 3174, 3174, 3174,
					3175, 3175, 3175, 3175, 3175, 3176, 3176, 3176, 3177, 3177,
					/* 20 */3187, 3187, 3187, 3188, 3188, 3188, 3188, 3188,
					3188, 3189, 3189, 3189, 3189, 3190, 3190, 3190, 3190, 3191,
					3191, 3191, 3192,
					/* 21 */3201, 3201, 3202, 3202, 3202, 3202, 3202, 3202,
					3203, 3203, 3203, 3203, 3203, 3204, 3204, 3204, 3204, 3205,
					/* 22 */3243, 3243, 3244, 3244, 3244, 3244, 3244, 3245,
					3245, 3245, 3245, 3245, 3246, 3246, 3246, 3246, 3247, 3247,
					3247, 3247, 3247, 3247, 3248, 3248, 3248, 3248, 3249, 3249,
					3249, 3249, 3249, 3250, 3250, 3250,
					/* 23 */3245, 3245, 3246, 3246, 3246, 3246, 3246, 3246,
					3247, 3247, 3247, 3247, 3247, 3247, 3248, 3248, 3248, 3248,
					3248, 3249, 3249, 3249, 3249, 3250, 3250, 3250, 3250, 3250,
					3250, 3251, 3251, 3251, 3252, 3252, 3252, 3252, 3252,
					/* 24 */3257, 3257, 3257, 3257, 3257, 3258, 3258, 3258,
					3259, 3259, 3259, 3260, 3260, 3260, 3260, 3260, 3261,
					/* 25 */3244, 3244, 3245, 3245, 3245, 3245, 3246, 3246,
					3246, 3246, 3247, 3247, 3247, 3248, 3248, 3248,
					/* 26 */3220, 3220, 3221, 3221, 3222, 3222, 3222, 3222,
					3223, 3223, 3223, 3223, 3223, 3223, 3224, 3224, 3224, 3224,
					3225, 3225, 3225, 3225, 3225, 3225, 3226, 3226, 3226, 3226,
					3226, 3226, 3227, 3227, 3228, 3228, 3228, 3228, 3228, 3229,
					3229, 3229,
					/* 27 */3203, 3203, 3204, 3204, 3204, 3204, 3204, 3205,
					3205, 3206, 3206, 3206, 3206, 3206, 3207, 3207, 3207, 3208,
					3208, 3209, 3210,
					/* 28 */3202, 3202, 3202, 3203, 3203, 3203, 3203, 3203,
					3204, 3204, 3204, 3204, 3204, 3205, 3205, 3205, 3205, 3205,
					3206, 3206, 3206, 3206, 3206, 3206, 3207, 3207, 3208, 3208,
					/* 29 */3202, 3202, 3202, 3203, 3203, 3203, 3203, 3203,
					3203, 3204, 3204, 3204, 3204, 3204, 3205, 3205, 3205,
					/* 30 */3403, 3404, 3404, 3404, 3404, 3405, 3405, 3405,
					3405, 3406, 3406, 3406, 3406, 3406, 3407, 3407, 3407, 3407,
					3408, 3408,/**/3393, 3393, 3394, 3394, 3394, 3394, 3395,
					3395, 3395, 3395, 3395, 3396, 3396,/**/3396, 3397, 3397,
					3397, 3398, 3398, 3398, 3399, 3399, 3400, 3400, 3401, 3401,
					3402, 3402, 3402, 3402, 3403, 3403, 3403,/**/3382, 3382,
					3382, 3383, 3383, 3383, 3383, 3383, 3383, 3384, 3385, 3385,
					3385, 3385, 3386, 3386, 3386, 3386, 3386, 3386,/**/3377,
					3377, 3377, 3377, 3377, 3377, 3377, 3377, 3378, 3378, 3378,
					3378, 3378, 3378, 3378, 3378, 3378, 3378, 3379, 3379, 3379,
					3379, 3379, 3379, 3379, 3379, 3379, 3379, 3380, 3380, 3380,
					3380, 3380, 3380, 3380, 3380, 3381, 3381, 3381, 3381, 3381,
					3381, 3381, 3381, 3382, 3382, 3382, 3382, 3382, 3382, 3382,
					3382, 3382, 3382, 3383, 3383, 3383, 3383, 3383, 3383, 3383,
					3383, 3383, 3383,
					/* 31 */3713, 3713, 3714, 3714, 3714, 3715, 3715, 3715,
					3716, 3716, 3716, 3717, 3717, 3718, 3718, 3718, 3719, 3719,/**/
					3713, 3713, 3713, 3714, 3714, 3714, 3715, 3715, 3715, 3716,
					3716, 3716, 3717, 3717, 3717,/**/3714, 3714, 3715, 3715,
					3716, 3716, 3716, 3716, 3716, 3717, 3717, 3717, 3717, 3717,
					3718, 3718, 3718, 3718, 3718, 3719, 3719, 3719, 3719, 3719,
					3719, 3719, 3720, 3720, 3720, 3720, 3720, 3720,/**/3712,
					3712, 3712, 3712, 3712, 3713, 3713, 3713, 3713, 3713, 3714,
					3714, 3714, 3714, 3714, 3715, 3715, 3715, 3715, 3715, 3716,
					3716, 3716, 3716, 3716, 3717, 3717, 3717, 3717, 3717, 3718,
					3718, 3718, 3718, 3718, 3719, 3719, 3719, 3719, 3719,/**/
					3714, 3714, 3714, 3714, 3714, 3715, 3715, 3715, 3715, 3715,
					3716, 3716, 3716, 3716, 3716, 3717, 3717, 3717, 3717, 3717,
					3718, 3718, 3718, 3718, 3718,/**/3718, 3718, 3718, 3718,
					3718, 3719, 3719, 3719, 3719, 3719, 3720, 3720, 3720, 3720,
					3720, 3721, 3721, 3721, 3721, 3722, 3722, 3722,/**/
					3712, 3712, 3712, 3712, 3713, 3713, 3713, 3713, 3714, 3714,
					3714, 3714, 3715, 3715, 3715, 3715, 3716, 3716, 3716, 3716,
					3717, 3717, 3717, 3717, 3718, 3718, 3718, 3718,/**/3711,
					3711, 3711, 3711, 3711, 3712, 3712, 3712, 3712, 3712, 3713,
					3713, 3713, 3713, 3713, 3714, 3714, 3714, 3714, 3714, 3715,
					3715, 3715, 3715, 3715,/**/3722, 3722, 3722, 3722, 3722,
					3723, 3723, 3723, 3723, 3723, 3724, 3724, 3724, 3724, 3724,
					3725, 3725, 3725, 3725, 3725, 3726, 3726, 3726, 3726, 3726,/**/
					3725, 3725, 3725, 3725, 3725, 3726, 3726, 3726, 3726, 3726,
					3727, 3727, 3727, 3727, 3727, 3728, 3728, 3728, 3728, 3728,
					3729, 3729, 3729, 3729, 3729,/**/3730, 3730, 3730, 3730,
					3730, 3731, 3731, 3731, 3731, 3731, 3732, 3732, 3732, 3732,
					3732, 3733, 3733, 3733, 3733, 3733, 3734, 3734, 3734, 3734,
					3734,/**/3727, 3727, 3727, 3728, 3728, 3728, 3728, 3728,
					3729, 3729, 3729, 3729, 3729, 3730, 3730, 3730, 3730, 3730,
					3731, 3731, 3731, 3731, 3731,/**/3723, 3723, 3723, 3723,
					3724, 3724, 3724, 3724, 3724, 3725, 3725, 3725, 3725, 3725,
					3726, 3726, 3726, 3726, 3726, 3727, 3727, 3727, 3727, 3727,/**/
					3726, 3726, 3726, 3727, 3727, 3727, 3727, 3728, 3728, 3728,
					3728, 3728, 3729, 3729, 3729, 3729, 3729, 3730, 3730, 3730,
					3730, 3730,
					/* 32 */3287, 3287, 3288, 3288, 3288, 3289, 3289, 3289,
					3289, 3290, 3290, 3290, 3290, 3290, 3291, 3291, 3291, 3291,
					3291, 3291, 3292, 3292, 3293, 3293, 3293, 3293, 3293, 3294,/**/
					3292, 3292, 3292, 3292, 3292, 3292, 3293, 3293, 3293, 3293,
					3293, 3294, 3294, 3294, 3294, 3294, 3294, 3295, 3295, 3295,
					3295, 3295, 3295, 3295, 3295, 3295, 3296, 3296, 3296, 3296,
					3296, 3296, 3296, 3296, 3296, 3296, 3296, 3297, 3297, 3297,
					3297, 3297, 3297, 3297, 3297, 3297, 3297, 3297, 3297, 3298,
					3298, 3298, 3298, 3298, 3298, 3298, 3298, 3298, 3299, 3299,
					3299, 3299, 3299, 3299, 3299, 3299, 3299, 3299, 3299, 3300,
					3300, 3300, 3300, 3300, 3300, 3300, 3300, 3300, 3300, 3301,
					3301, }, };
	/*
	 * WORLDMAP 2: (not-walk able places) 01 - Lumbridge cows
	 */
	public static int worldmap2[][] = {
			{
			/* 01 */3257, 3258, 3260, 3261, 3261, 3262, 3261, 3262, 3257,
					3258, 3257, 3258, 3254, 3255, 3254, 3255, 3252, 3252, 3250,
					3251, 3250, 3251, 3249, 3250, 3249, 3250, 3242, 3242, 3243,
					3243, 3257, 3244, 3245, 3244, 3245, 3247, 3248, 3250, 3251,
					3255, 3256, 3255, 3256, 3259, 3260, },
			{
			/* 01 */3256, 3256, 3256, 3256, 3266, 3266, 3267, 3267, 3270,
					3270, 3271, 3271, 3272, 3272, 3273, 3273, 3275, 3276, 3277,
					3277, 3278, 3278, 3279, 3279, 3280, 3280, 3285, 3286, 3289,
					3290, 3289, 3297, 3297, 3298, 3298, 3298, 3298, 3297, 3297,
					3297, 3297, 3298, 3298, 3297, 3297, }, };

	public static int randomremoveschaos() {
		return removeschaos[(int) (Math.random() * removeschaos.length)];
	}
	public int[] combatLevel = new int[3851];
	public int[] dropCount = new int[3851];

	public double[][] drops = new double[3851][45]; // room for 15 drops per npc

	public NPCDrops NpcDrops[] = new NPCDrops[maxNPCDrops];

	public NPCList NpcList[] = new NPCList[maxListedNPCs];

	public NPC npcs[] = new NPC[maxNPCSpawns];

	public int remove = 2; // 1 = removes equipment, 2 = doesn't remove -
	// xerozcheez

	public int[] respawnTime = new int[3851];

	NPCHandler() {
		for (int i = 0; i < maxNPCSpawns; i++) {
			npcs[i] = null;
		}
		for (int i = 0; i < maxListedNPCs; i++) {
			NpcList[i] = null;
		}
		for (int i = 0; i < maxNPCDrops; i++) {
			NpcDrops[i] = null;
		}
		loadNPCList("npc.cfg");
		loadNPCDrops("npcdrops.cfg");
		loadAutoSpawn("autospawn.cfg");
	}
	public boolean AttackNPC(int NPCID) {
		if (server.npcHandler.npcs[npcs[NPCID].attacknpc] != null) {
			int EnemyX = server.npcHandler.npcs[npcs[NPCID].attacknpc].absX;
			int EnemyY = server.npcHandler.npcs[npcs[NPCID].attacknpc].absY;
			int EnemyHP = server.npcHandler.npcs[npcs[NPCID].attacknpc].HP;
			int hitDiff = 0;

			hitDiff = misc.random(npcs[NPCID].MaxHit);
			if (GoodDistance(EnemyX, EnemyY, npcs[NPCID].absX,
					npcs[NPCID].absY, 1) == true) {
				if (server.npcHandler.npcs[npcs[NPCID].attacknpc].IsDead == true) {
					ResetAttackNPC(NPCID);
					// npcs[NPCID].textUpdate = "Oh yeah I win!";
					// npcs[NPCID].textUpdateRequired = true;
					npcs[NPCID].animNumber = 2103;
					npcs[NPCID].animUpdateRequired = true;
					npcs[NPCID].updateRequired = true;
				} else {
					if ((EnemyHP - hitDiff) < 0) {
						hitDiff = EnemyHP;
					}
					if (npcs[NPCID].npcType == 9)
						npcs[NPCID].animNumber = 386;
					if (npcs[NPCID].npcType == 3200)
						npcs[NPCID].animNumber = 0x326; // drags: chaos ele
					// emote ( YESSS )
					if ((npcs[NPCID].npcType == 1605)
							|| (npcs[NPCID].npcType == 1472)) {
						npcs[NPCID].animNumber = 386; // drags: abberant
						// spector death ( YAY )
					}
					npcs[NPCID].animUpdateRequired = true;
					npcs[NPCID].updateRequired = true;
					server.npcHandler.npcs[npcs[NPCID].attacknpc].hitDiff = hitDiff;
					server.npcHandler.npcs[npcs[NPCID].attacknpc].attacknpc = NPCID;
					server.npcHandler.npcs[npcs[NPCID].attacknpc].updateRequired = true;
					server.npcHandler.npcs[npcs[NPCID].attacknpc].hitUpdateRequired = true;
					npcs[NPCID].actionTimer = 7;
					return true;
				}
			}
		}
		return false;
	}
	public boolean AttackNPCMage(int NPCID) {
		int EnemyX = server.npcHandler.npcs[npcs[NPCID].attacknpc].absX;
		int EnemyY = server.npcHandler.npcs[npcs[NPCID].attacknpc].absY;
		int EnemyHP = server.npcHandler.npcs[npcs[NPCID].attacknpc].HP;
		int hitDiff = 0;

		// hitDiff = misc.random(npcs[NPCID].MaxHit);
		if (npcs[NPCID].actionTimer == 0) {
			if (server.npcHandler.npcs[npcs[NPCID].attacknpc].IsDead == true) {
				ResetAttackNPC(NPCID);
				// npcs[NPCID].textUpdate = "Oh yeah I win!";
				// npcs[NPCID].textUpdateRequired = true;
				npcs[NPCID].animNumber = 2103;
				npcs[NPCID].animUpdateRequired = true;
				npcs[NPCID].updateRequired = true;
			} else {
				npcs[NPCID].animNumber = 711; // mage
				// attack
				if (npcs[NPCID].npcType == 1645) {
					gfxAll(369, EnemyY, EnemyX);
					hitDiff = 6 + misc.random(43);
				}
				if (npcs[NPCID].npcType == 1645) {
					gfxAll(369, EnemyY, EnemyX);
					hitDiff = 6 + misc.random(43);
				}
				if (npcs[NPCID].npcType == 509) {
					gfxAll(365, EnemyY, EnemyX);
					hitDiff = 8 + misc.random(51);
				}
				if (npcs[NPCID].npcType == 1241) {
					gfxAll(363, EnemyY, EnemyX);
					hitDiff = 2 + misc.random(19);
				}
				if (npcs[NPCID].npcType == 1246) {
					gfxAll(368, npcs[NPCID].absY, npcs[NPCID].absX);
					gfxAll(367, EnemyY, EnemyX);
					hitDiff = 4 + misc.random(35);
				}
				npcs[NPCID].animUpdateRequired = true;
				npcs[NPCID].updateRequired = true;
				if ((EnemyHP - hitDiff) < 0) {
					hitDiff = EnemyHP;
				}
				server.npcHandler.npcs[npcs[NPCID].attacknpc].hitDiff = hitDiff;
				server.npcHandler.npcs[npcs[NPCID].attacknpc].attacknpc = NPCID;
				server.npcHandler.npcs[npcs[NPCID].attacknpc].updateRequired = true;
				server.npcHandler.npcs[npcs[NPCID].attacknpc].hitUpdateRequired = true;
				npcs[NPCID].actionTimer = 7;
				return true;
			}
			return false;
		}
		return false;
	}

	public boolean AttackPlayer(int NPCID) {
		int Player = 0;
		if (npcs[NPCID] != null){
		Player = npcs[NPCID].StartKilling;
		}
		if (server.playerHandler.players[Player] == null) {
			ResetAttackPlayer(NPCID);
			return false;
		}
		if (npcs[NPCID].npcType == 3777 || npcs[NPCID].npcType == 3778 || npcs[NPCID].npcType == 3779 || npcs[NPCID].npcType == 3780) {
			ResetAttackPlayer(NPCID);
			return false;
		}
		client plr = (client) server.playerHandler.players[Player];
		int EnemyX = server.playerHandler.players[Player].absX;
		int EnemyY = server.playerHandler.players[Player].absY;
		npcs[NPCID].enemyX = EnemyX;
        int i;
        int j;
        int k;
        int l;
        int i1;
            PlayerHandler _tmp1 = server.playerHandler;
            i = PlayerHandler.players[npcs[NPCID].StartKilling].absX;
            PlayerHandler _tmp2 = server.playerHandler;
            j = PlayerHandler.players[npcs[NPCID].StartKilling].absY;
            PlayerHandler _tmp3 = server.playerHandler;
            l = (npcs[NPCID].absX - i) * -1;
            i1 = (npcs[NPCID].absY - j) * -1;
		npcs[NPCID].TurnNpcTo(i, j);
		if ((Math.abs(npcs[NPCID].absX - EnemyX) > 20)
				|| (Math.abs(npcs[NPCID].absY - EnemyY) > 20)) {
			ResetAttackPlayer(NPCID);
		}
		// if(EnemyX != npcs[NPCID].absX && EnemyY != npcs[NPCID].absY)
		// {
		// npcs[NPCID].viewX = EnemyX;
		// npcs[NPCID].viewY = EnemyY;
		// npcs[NPCID].faceToUpdateRequired = true;
		// }
		int EnemyHP = server.playerHandler.players[Player].playerLevel[server.playerHandler.players[Player].playerHitpoints];
		int EnemyMaxHP = getLevelForXP(server.playerHandler.players[Player].playerXP[server.playerHandler.players[Player].playerHitpoints]);
		// if(EnemyX != npcs[NPCID].absX && EnemyY != npcs[NPCID].absY)
		// // Xerozcheez: stops client crashing
		// plr.viewTo(npcs[NPCID].absX, npcs[NPCID].absY); //
		// Xerozcheez: Player turns to npc

		int hitDiff = 0;
		hitDiff = misc.random(npcs[NPCID].MaxHit);
		client player = (client) server.playerHandler.players[Player];
		if (!plr.multiCombat() && plr.hitID != 0 && plr.hitID != NPCID) {
			//ResetAttackPlayer(NPCID);
			return false;
		}
		if(!plr.multiCombat() && npcs[NPCID].hitIDNPC != plr.playerId && npcs[NPCID].hitIDNPC != 0){
			return false;
		}
		if (player != null) {
			int def = player.playerBonus[6] + player.playerLevel[1];
			int rand = misc.random(def);
			int rand_npc = misc.random(combatLevel[NPCID]);
			if (npcs[NPCID].npcType == 1 || npcs[NPCID].npcType == 2 || npcs[NPCID].npcType == 3 || npcs[NPCID].npcType == 4 || npcs[NPCID].npcType == 10) { // citizens
				rand_npc = misc.random(1);
			}
			if (npcs[NPCID].npcType == 117 || npcs[NPCID].npcType == 112) { // giant
				rand_npc = misc.random(10);
			}
			if (npcs[NPCID].npcType == 1338) { // dagg
				rand_npc = misc.random(60);
			}
			if (npcs[NPCID].npcType == 3493) { // gargoyle
				rand_npc = misc.random(170);
			}
			if (npcs[NPCID].npcType == 1616) { // basilisk
				rand_npc = misc.random(60);
			}
			if (npcs[NPCID].npcType == 1637) { // jelly
				rand_npc = misc.random(70);
			}
			if (npcs[NPCID].npcType == 1624) { // dust devil
				rand_npc = misc.random(80);
			}
			if (npcs[NPCID].npcType == 1615) { // abyssal demon
				rand_npc = misc.random(180);
			}
			if (npcs[NPCID].npcType == 1154) { // kalphite soldier
				rand_npc = misc.random(50);
			}
			if (npcs[NPCID].npcType == 1155) { // kalphite guardian
				rand_npc = misc.random(70);
			}
			if (npcs[NPCID].npcType == 2783) { // dark beast
				rand_npc = misc.random(200);
			}
			if (npcs[NPCID].npcType == 941) { // green dragons
				rand_npc = misc.random(90);
			}
			if (npcs[NPCID].npcType == 53) { // dragons
				rand_npc = misc.random(90);
			}
			if (npcs[NPCID].npcType == 54) { // dragons
				rand_npc = misc.random(90);
			}
			if (npcs[NPCID].npcType == 55) { //dragons
				rand_npc = misc.random(90);
			}
			if (npcs[NPCID].npcType == 1625) { // turoth
				rand_npc = misc.random(70);
			}
			if (npcs[NPCID].npcType == 1613) { // nechryael
				rand_npc = misc.random(120);
			}
			if (npcs[NPCID].npcType == 1264) { // saradomin wizard
				rand_npc = misc.random(50);
			}
			if (npcs[NPCID].npcType == 1459) { // gorilla guard
				rand_npc = misc.random(150);
			}
			if (npcs[NPCID].npcType == 1030) { // wolfman
				rand_npc = misc.random(70);
			}
			if (npcs[NPCID].npcType == 181) { // chaos druid
				rand_npc = misc.random(10);
			}
			if (npcs[NPCID].npcType == 2631) { // tok-xil
				rand_npc = misc.random(100);
			}
			if (npcs[NPCID].npcType == 2741) { // yt-mejkot
				rand_npc = misc.random(150);
			}
			if (npcs[NPCID].npcType == 1116) { // ket-zek
				rand_npc = misc.random(400);
			}
			if (npcs[NPCID].npcType == 2745) { // jad
				rand_npc = misc.random(500);
			}
			if (npcs[NPCID].npcType == 2746) { // yt-hurkot
				rand_npc = misc.random(50);
			}
			if (npcs[NPCID].npcType == 2591 || npcs[NPCID].npcType == 2604 || npcs[NPCID].npcType == 2610) { // tzaar
				rand_npc = misc.random(70);
			}
			if (npcs[NPCID].npcType == 2263) { // abyssal leach
				rand_npc = misc.random(5);
			}
			if (npcs[NPCID].npcType == 2264) { // abyssal guardian
				rand_npc = misc.random(10);
			}
			if (npcs[NPCID].npcType == 2265) { // abyssal walker
				rand_npc = misc.random(15);
			}
			// println("rand_npc=" + rand_npc + ", rand=" + rand);
			if (rand_npc > rand) {//MAX HITS
			if (npcs[NPCID].npcType == 87) { // rat
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 19) { // white knight
				hitDiff = misc.random(4);
			}
			if (npcs[NPCID].npcType == 117 || npcs[NPCID].npcType == 112) { // giant
				hitDiff = misc.random(5);
			}
			if (npcs[NPCID].npcType == 1338) { // dagganoths
				hitDiff = misc.random(5);
			}
			if (npcs[NPCID].npcType == 3493) { // gargoyle
				hitDiff = misc.random(15);
			}
			if (npcs[NPCID].npcType == 1616) { // basilisk
				hitDiff = misc.random(7);
			}
			if (npcs[NPCID].npcType == 1637) { // jelly
				hitDiff = misc.random(7);
			}
			if (npcs[NPCID].npcType == 1624) { // dust devil
				hitDiff = misc.random(8);
			}
			if (npcs[NPCID].npcType == 1615) { // abyssal demon
				hitDiff = misc.random(20);
			}
			if (npcs[NPCID].npcType == 1154) { // kalphite soldier
				hitDiff = misc.random(8);
			}
			if (npcs[NPCID].npcType == 1155) { // kalphite guardian
				hitDiff = misc.random(8);
			}
			if (npcs[NPCID].npcType == 2783) { // dark beast
				hitDiff = misc.random(22);
			}
			if (npcs[NPCID].npcType == 941) { // green dragons
				hitDiff = misc.random(10);
			}
			if (npcs[NPCID].npcType == 53 || npcs[NPCID].npcType == 54 ||npcs[NPCID].npcType == 55) { // dragons
				hitDiff = misc.random(10);
			}
			if (npcs[NPCID].npcType == 1625) { // turoth
				hitDiff = misc.random(5);
			}
			if (npcs[NPCID].npcType == 1613) { // nechryael
				hitDiff = misc.random(15);
			}
			if (npcs[NPCID].npcType == 1264) { // saradomin wizard
				hitDiff = misc.random(7);
			}
			if (npcs[NPCID].npcType == 1459) { // gorilla guard
				hitDiff = misc.random(22);
			}
			if (npcs[NPCID].npcType == 1030) { // wolfman
				hitDiff = misc.random(10);
			}
			if (npcs[NPCID].npcType == 181) { // chaos druid
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 1267) { // rock crab
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 90) { // skeleton
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 2627) { // tz-kih
				hitDiff = misc.random(4);
			}
			if (npcs[NPCID].npcType == 2630) { // tz-kek
				hitDiff = misc.random(7);
			}
			if (npcs[NPCID].npcType == 2631) { // tok-xil
				hitDiff = misc.random(13);
			}
			if (npcs[NPCID].npcType == 2738) { // tz-kek
				hitDiff = misc.random(4);
			}
			if (npcs[NPCID].npcType == 2741) { // yt-mejkot
				hitDiff = misc.random(25);
			}
			if (npcs[NPCID].npcType == 1116) { // ket-zek
				hitDiff = misc.random(49);
			}
			if (npcs[NPCID].npcType == 2745) { // jad
				hitDiff = misc.random(99);
			}
			if (npcs[NPCID].npcType == 2746) { // yt-hurkot
				hitDiff = misc.random(14);
			}
			if (npcs[NPCID].npcType == 2263) { // abyssal leach
				hitDiff = misc.random(1);
			}
			if (npcs[NPCID].npcType == 2264) { // abyssal guardian
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 2265) { // abyssal walker
				hitDiff = misc.random(2);
			}
			if (npcs[NPCID].npcType == 2591 || npcs[NPCID].npcType == 2604 || npcs[NPCID].npcType == 2610) { // tzhaar
				hitDiff = misc.random(14);
}
			if (npcs[NPCID].npcType != 72 && npcs[NPCID].npcType != 53 && npcs[NPCID].npcType != 54 && npcs[NPCID].npcType != 55 && npcs[NPCID].npcType != 117 && npcs[NPCID].npcType != 112 && npcs[NPCID].npcType != 1338 && npcs[NPCID].npcType != 3493 && npcs[NPCID].npcType != 1616 && npcs[NPCID].npcType != 1637 && npcs[NPCID].npcType != 1624 && npcs[NPCID].npcType != 1615 && npcs[NPCID].npcType != 2783 && npcs[NPCID].npcType != 941 && npcs[NPCID].npcType != 1625 && npcs[NPCID].npcType != 1613 && npcs[NPCID].npcType != 1264 && npcs[NPCID].npcType != 1459 && npcs[NPCID].npcType != 1030 && npcs[NPCID].npcType != 87 && npcs[NPCID].npcType != 19 && npcs[NPCID].npcType != 1 && npcs[NPCID].npcType != 2 && npcs[NPCID].npcType != 3 && npcs[NPCID].npcType != 4 && npcs[NPCID].npcType != 10 && npcs[NPCID].npcType != 181 && npcs[NPCID].npcType != 1267 && npcs[NPCID].npcType != 90 && npcs[NPCID].npcType != 2627 && npcs[NPCID].npcType != 2630 && npcs[NPCID].npcType != 2631 && npcs[NPCID].npcType != 2731 && npcs[NPCID].npcType != 2741 && npcs[NPCID].npcType != 2881 && npcs[NPCID].npcType != 2745 && npcs[NPCID].npcType != 2746 && npcs[NPCID].npcType != 1154 && npcs[NPCID].npcType != 1155 && npcs[NPCID].npcType != 2591 && npcs[NPCID].npcType != 2604 && npcs[NPCID].npcType != 2610) {
				hitDiff = misc.random(2);//good to train?
			}
			} else {
				hitDiff = 0;
			}
		}
		if ((GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 30) == false) && server.npcHandler.npcs[NPCID].npcType != 2627 && server.npcHandler.npcs[NPCID].npcType != 2630 && server.npcHandler.npcs[NPCID].npcType != 2631 && server.npcHandler.npcs[NPCID].npcType != 2741 && server.npcHandler.npcs[NPCID].npcType != 2882 && server.npcHandler.npcs[NPCID].npcType != 2745 && server.npcHandler.npcs[NPCID].npcType != 2746 && server.npcHandler.npcs[NPCID].npcType != 2881 || player == null || player.deathStage > 0) {
			npcs[NPCID].RandomWalk = true;
			ResetAttackPlayer(NPCID);
			return false;
		}
		if ((GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 30) == true) && server.npcHandler.npcs[NPCID].npcType != 2627 && server.npcHandler.npcs[NPCID].npcType != 2630 && server.npcHandler.npcs[NPCID].npcType != 2631 && server.npcHandler.npcs[NPCID].npcType != 2741 && server.npcHandler.npcs[NPCID].npcType != 2882 && server.npcHandler.npcs[NPCID].npcType != 2745 && server.npcHandler.npcs[NPCID].npcType != 2746 && server.npcHandler.npcs[NPCID].npcType != 2881 && player != null && player.deathStage == 0 || (server.npcHandler.npcs[NPCID].npcType == 2627 || server.npcHandler.npcs[NPCID].npcType == 2630 || server.npcHandler.npcs[NPCID].npcType == 2631 || server.npcHandler.npcs[NPCID].npcType == 2741 || server.npcHandler.npcs[NPCID].npcType == 2882 || server.npcHandler.npcs[NPCID].npcType == 2745 || server.npcHandler.npcs[NPCID].npcType == 2746 || server.npcHandler.npcs[NPCID].npcType == 2881)) {
			FollowPlayerCB(NPCID, Player);
		}
		if ((GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 30) == false) && server.npcHandler.npcs[NPCID].npcType != 2627 && server.npcHandler.npcs[NPCID].npcType != 2630 && server.npcHandler.npcs[NPCID].npcType != 2631 && server.npcHandler.npcs[NPCID].npcType != 2741 && server.npcHandler.npcs[NPCID].npcType != 2882 && server.npcHandler.npcs[NPCID].npcType != 2745 && server.npcHandler.npcs[NPCID].npcType != 2746 && server.npcHandler.npcs[NPCID].npcType != 2881) {
			ResetAttackPlayer(NPCID);
                   	return false;
		}
		if (player == null) {
			ResetAttackPlayer(NPCID);
			return false;
		}
                if(player.deathStage > 0)
                {
			ResetAttackPlayer(NPCID);
                    	return false;
                }
		if ((GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) || (GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 8) == true) && (npcs[NPCID].npcType == 2882) ||  (GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 8) == true) && (npcs[NPCID].npcType == 2745) || (GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 8) == true) && (npcs[NPCID].npcType == 1117) || (GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 8) == true) && (npcs[NPCID].npcType == 2631)) {
			if (npcs[NPCID].actionTimer == 0) {
				if (false && (EnemyHP <= (int) ((double) ((double) EnemyMaxHP / 10.0) + 0.5))) {
				} else {
					if (server.playerHandler.players[Player].deathStage > 0) {
						ResetAttackPlayer(NPCID);
					} else {
						if ((npcs[NPCID].npcType == 81)
								|| (npcs[NPCID].npcType == 397)
								|| (npcs[NPCID].npcType == 1766)
								|| (npcs[NPCID].npcType == 1767)
								|| (npcs[NPCID].npcType == 1768)) {
							npcs[NPCID].animNumber = 0x03B; // cow attack
						} else if(npcs[NPCID].npcType == 941 && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621 || plr.ProtMage) {
plr.lowGFX(579, 0);
hitDiff = 3 + misc.random(7);
plr.sM("You are protected from the dragon's fire!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 && plr.playerEquipment[plr.playerShield] != 2621) {
plr.lowGFX(579, 0);
hitDiff = 20 + misc.random(30);
plr.sM("You are burnt by the fire!");}
						} 
						else if((npcs[NPCID].npcType == 53 || npcs[NPCID].npcType == 54 || npcs[NPCID].npcType == 55) && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621 || plr.ProtMage) {
plr.lowGFX(579, 0);
hitDiff = 3 + misc.random(7);
plr.sM("You are protected from the dragon's fire!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 && plr.playerEquipment[plr.playerShield] != 2621) {
plr.lowGFX(579, 0);
hitDiff = 20 + misc.random(30);
plr.sM("You are burnt by the fire!");}
						}
						
						
						else if(npcs[NPCID].npcType == 50 && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621 || plr.ProtMage) {
plr.lowGFX(579, 0);
hitDiff = 3 + misc.random(7);
plr.sM("You are protected from the dragon's fire!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 && plr.playerEquipment[plr.playerShield] != 2621) {
plr.lowGFX(579, 0);
hitDiff = 20 + misc.random(30);
plr.sM("You are burnt by the fire!");}
						} else if(npcs[NPCID].npcType == 50 && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621 || plr.ProtMage) {
plr.specGFX(396);
hitDiff = 3 + misc.random(7);
plr.EntangleDelay = 10;
plr.sM("You have been frozen!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 || plr.playerEquipment[plr.playerShield] != 2621) {
plr.specGFX(396);
hitDiff = 20 + misc.random(30);
plr.EntangleDelay = 10;
plr.sM("You have been frozen!");}
						} else if(npcs[NPCID].npcType == 100){
                                               npcs[NPCID].animNumber = 309;
						} else if(npcs[NPCID].npcType == 73){
                                               npcs[NPCID].animNumber = 299;
						} else if(npcs[NPCID].npcType == 655 && plr.ProtMelee == false){
                                               npcs[NPCID].animNumber = 309;
						} else if(npcs[NPCID].npcType == 655 && plr.ProtMelee == true){
                                               npcs[NPCID].animNumber = 309;
					       hitDiff = 0;	
						} else if(npcs[NPCID].npcType == 1267 && plr.ProtMelee == false){
                                               npcs[NPCID].animNumber = 1312;
						} else if(npcs[NPCID].npcType == 1267 && plr.ProtMelee == true){
                                               npcs[NPCID].animNumber = 1312;	
											hitDiff = 0;
						} else if(npcs[NPCID].npcType == 50 && plr.ProtMelee == false){
                                               npcs[NPCID].animNumber = 80;
						} else if(npcs[NPCID].npcType == 50 && plr.ProtMelee == true){
                                               npcs[NPCID].animNumber = 80;	
										hitDiff = 0;
						} else if(npcs[NPCID].npcType == 1459 && misc.random(3)==1){
                                               npcs[NPCID].animNumber = 1405;	
								hitDiff = 0;
								npcs[NPCID].HP += 20;
						} else if(npcs[NPCID].npcType == 1459 && plr.ProtMelee == false){
                                               npcs[NPCID].animNumber = 1402;
						} else if(npcs[NPCID].npcType == 1459 && plr.ProtMelee == true){
                                               npcs[NPCID].animNumber = 1402;	
hitDiff = 0;
                                    } else if(npcs[NPCID].npcType == 90 || npcs[NPCID].npcType == 91) { 
                                              
npcs[NPCID].animNumber = 260;
                                    } else if(npcs[NPCID].npcType == 934 && !plr.ProtMelee) { 
                                              
npcs[NPCID].animNumber = 64;
hitDiff = 15 + misc.random(25);
plr.playerLevel[5] -= 8;
                                    } else if(npcs[NPCID].npcType == 934 && plr.ProtMelee) { 
                                              
npcs[NPCID].animNumber = 64;
hitDiff = 0;
plr.playerLevel[5] -= 8;

                                    } else if(npcs[NPCID].npcType == 677 && !plr.ProtMage) { 
                                              
npcs[NPCID].animNumber = 64;
hitDiff = 15 + misc.random(25);
plr.playerLevel[5] -= 8;
plr.specGFX(166);
                                    } else if(npcs[NPCID].npcType == 677 && plr.ProtMage) { 
                                              
npcs[NPCID].animNumber = 64;
hitDiff = 0;
plr.playerLevel[5] -= 8;
plr.specGFX(166);
                                    } else if(npcs[NPCID].npcType == 158) { 
                                              
npcs[NPCID].animNumber = 1833;
                                    } else if(npcs[NPCID].npcType == 1115 && plr.ProtMage == false && misc.random(2)==1) {
 hitDiff = misc.random(50);                                              
npcs[NPCID].animNumber = 1843;
plr.playerLevel[5] -= 10;
plr.specGFX(166);
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
                                    } else if(npcs[NPCID].npcType == 1115 && plr.ProtMelee == false) {
 hitDiff = misc.random(75);                                              
npcs[NPCID].animNumber = 1843;
plr.playerLevel[5] -= 10;
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
                                    } else if(npcs[NPCID].npcType == 1115 && plr.ProtMelee == true) {
hitDiff = misc.random(25);                                           
npcs[NPCID].animNumber = 1843;
hitDiff = 0;  
                                    } else if(npcs[NPCID].npcType == 1264 && !plr.ProtMelee) {
                                              
npcs[NPCID].animNumber = 402;
hitDiff = misc.random(6);  
                                    } else if(npcs[NPCID].npcType == 1264 && plr.ProtMelee) {
                                              
npcs[NPCID].animNumber = 402;
hitDiff = misc.random(0); 
						} else if(npcs[NPCID].npcType == 72 && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621) {
plr.lowGFX(579, 0);
hitDiff = 3 + misc.random(7);
plr.sM("Your shield protects you from the dragon's fire!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 || plr.playerEquipment[plr.playerShield] != 2621) {
plr.lowGFX(579, 0);
hitDiff = 20 + misc.random(30);
plr.sM("You are burnt by the fire!");}
						} else if(npcs[NPCID].npcType == 72 && misc.random(3)==1){
if(plr.playerEquipment[plr.playerShield] == 1540 || plr.playerEquipment[plr.playerShield] == 2621) {
plr.specGFX(396);
hitDiff = 3 + misc.random(7);
plr.EntangleDelay = 10;
plr.sM("You have been frozen!");
} else if(plr.playerEquipment[plr.playerShield] != 1540 && plr.playerEquipment[plr.playerShield] != 2621) {
plr.specGFX(393);
hitDiff = 20 + misc.random(30);
plr.EntangleDelay = 10;
plr.sM("You have been frozen!");}
						} else if(npcs[NPCID].npcType == 72 && plr.ProtMelee == false){
                                               npcs[NPCID].animNumber = 80;
						} else if(npcs[NPCID].npcType == 72 && plr.ProtMelee == true){
                        } 
						else if(npcs[NPCID].npcType == 3200 && misc.random(2)==1) {
npcs[NPCID].animNumber = 3146;
hitDiff = 0;  
plr.remove(plr.playerEquipment[plr.playerWeapon], plr.playerWeapon);
plr.sM("The chaos elemental removes your weapon!");
                        } else if(npcs[NPCID].npcType == 3200 && misc.random(2)==1 && !plr.ProtRange) {
                                              
npcs[NPCID].animNumber = 3146;
hitDiff = 19 + misc.random(40);  
plr.specGFX(451); 
                        } else if(npcs[NPCID].npcType == 3200 && misc.random(2)==1 && plr.ProtRange) {
npcs[NPCID].animNumber = 3146;
hitDiff = 0;  
plr.specGFX(451); 
                                    } else if(npcs[NPCID].npcType == 3200 && !plr.ProtMage) {
                                              
npcs[NPCID].animNumber = 3146;
hitDiff = 19 + misc.random(40);    
plr.specGFX(346);
                                    } else if(npcs[NPCID].npcType == 3200 && plr.ProtMage) {
                                              
npcs[NPCID].animNumber = 3146;
hitDiff = misc.random(15); 
plr.specGFX(346);
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 0) {
                                               
plr.CreateProjectile2(npcs[NPCID].absY + 2, npcs[NPCID].absX + 2, i1, l, 445, 100, 95, -npcs[NPCID].StartKilling - 1);
plr.tzStage = 1;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 1 && plr.ProtMage == false) {

plr.tzStage = randomtzBattle();
plr.specGFX(446);
hitDiff = misc.random(49);
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 1 && plr.ProtMage == true) {

plr.tzStage = randomtzBattle();
plr.specGFX(446);
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 2 && plr.ProtMelee == false && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) {

plr.tzStage = randomtzBattle();
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 2 && plr.ProtMelee == true && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) {

plr.tzStage = randomtzBattle();
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1116 && plr.tzStage == 2 && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == false) {

hitDiff = 0;
plr.CreateProjectile2(npcs[NPCID].absY + 2, npcs[NPCID].absX + 2, i1, l, 445, 100, 95, -npcs[NPCID].StartKilling - 1);
plr.tzStage = 1;
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 0 && !plr.ProtMelee && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) { //Jad
                                              
npcs[NPCID].animNumber = 2655;
plr.jadStage = randomjadBattle();
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 0 && plr.ProtMelee  && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) { //Jad
                                              
npcs[NPCID].animNumber = 2655;
                                               hitDiff = 0;
plr.jadStage = randomjadBattle();
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 0 && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == false) { //Jad
                                              
npcs[NPCID].animNumber = 2652;
                                               hitDiff = 0;
plr.jadStage = 3;
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 2) { //Jad
                                              
npcs[NPCID].animNumber = 2652;
                                               hitDiff = 0;
plr.jadStage = 3;
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 3 && plr.ProtRange == false) { //Jad
                                              
npcs[NPCID].animNumber = 2650;
                                               plr.specGFX(451);
hitDiff = 40 + misc.random(59);
plr.jadStage = randomjadBattle();
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 3 && plr.ProtRange == true) { //Jad
                                              
npcs[NPCID].animNumber = 2650;
                                               plr.specGFX(451);
                                               hitDiff = 0;
plr.jadStage = randomjadBattle();
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 4) { //Jad
                                              
npcs[NPCID].animNumber = 2656;
                                               hitDiff = 0;
plr.CreateProjectile2(npcs[NPCID].absY + 2, npcs[NPCID].absX + 2, i1, l, 448, 100, 150, -npcs[NPCID].StartKilling - 1);
plr.CreateProjectile2(npcs[NPCID].absY + 2, npcs[NPCID].absX + 2, i1, l, 449, 100, 160, -npcs[NPCID].StartKilling - 1);
plr.CreateProjectile2(npcs[NPCID].absY + 2, npcs[NPCID].absX + 2, i1, l, 450, 100, 170, -npcs[NPCID].StartKilling - 1);
plr.jadStage = 5;
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 5 && plr.ProtMage == false) { //Jad
                                              
npcs[NPCID].animNumber = 2650;
plr.specGFX(157);
hitDiff = 40 + misc.random(59);
plr.jadStage = randomjadBattle();
                                    } else if(npcs[NPCID].npcType == 2745 && plr.jadStage == 5 && plr.ProtMage == true) { //Jad
                                              
npcs[NPCID].animNumber = 2650;
                                               hitDiff = 0;
plr.specGFX(157);
plr.jadStage = randomjadBattle();
						} else if (npcs[NPCID].npcType == 795 && plr.ProtMelee == false) {
hitDiff = 5 + misc.random(12);
npcs[NPCID].animNumber = 422;
						} else if (npcs[NPCID].npcType == 795 && plr.ProtMelee == true) {
npcs[NPCID].animNumber = 422;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 41) {
							npcs[NPCID].animNumber = 0x037; // chicken attack
						} else if(npcs[NPCID].npcType == 1183 && !plr.ProtRange){
npcs[NPCID].animNumber = 426; // bow emote
plr.CreateProjectile2(npcs[NPCID].absY, npcs[NPCID].absX, i1, l, 249, 50, 95, -npcs[NPCID].StartKilling - 1);
hitDiff = 4 + misc.random(16);
						} else if(npcs[NPCID].npcType == 1183 && plr.ProtRange){
npcs[NPCID].animNumber = 426; // bow emote
plr.CreateProjectile2(npcs[NPCID].absY, npcs[NPCID].absX, i1, l, 249, 50, 95, -npcs[NPCID].StartKilling - 1);
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 1160 &&  plr.ProtRange == false){
							npcs[NPCID].animNumber = 1178;
                                               plr.specGFX(280);
hitDiff = 10 + misc.random(30);	
						} else if(npcs[NPCID].npcType == 1160 &&  plr.ProtRange == true){
							npcs[NPCID].animNumber = 1178;
                                               plr.specGFX(280);
hitDiff = misc.random(7);	
						} else if(npcs[NPCID].npcType == 2025 && plr.ProtMage == false){
							npcs[NPCID].animNumber = 1167;
plr.specGFX(155);
plr.specGFX(156);
plr.specGFX(157);
hitDiff = 0 + misc.random(20);
						} else if(npcs[NPCID].npcType == 2025 && plr.ProtMage == true){
							npcs[NPCID].animNumber = 1979;
hitDiff = 0;
plr.specGFX(85);
						} else if(npcs[NPCID].npcType == 3495 && plr.ProtMage == false){
							npcs[NPCID].animNumber = 1979;
hitDiff = 15 + misc.random(15);
plr.ifFreeze(50);
plr.lowGFX(369, 0);
						} else if(npcs[NPCID].npcType == 3495 && plr.ProtMage == true){
							npcs[NPCID].animNumber = 1979;
hitDiff = 0;
plr.specGFX(85);
plr.playerLevel[5] -= 10;
						} else if(npcs[NPCID].npcType == 3494 && plr.ProtMelee == false){
plr.playerLevel[1] -= 5;

plr.specGFX(387);
hitDiff = 0 + misc.random(30);
						} else if(npcs[NPCID].npcType == 3494 && plr.ProtMelee == true){
hitDiff = 0;
plr.specGFX(387);
plr.playerLevel[5] -= 10;
						} else if(npcs[NPCID].npcType == 2026 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2067;
						hitDiff = 0 + misc.random(62);
						} else if(npcs[NPCID].npcType == 2026 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2067;
						hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2027 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2080;
hitDiff = 0 + misc.random(31);
						} else if(npcs[NPCID].npcType == 2027 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2080;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2028 && plr.ProtRange == false){
							npcs[NPCID].animNumber = 2075;
hitDiff = 0 + misc.random(25);

						} else if(npcs[NPCID].npcType == 2028 && plr.ProtRange == true){
							npcs[NPCID].animNumber = 2075;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2029 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2068;
hitDiff = 0 + misc.random(22);;
						} else if(npcs[NPCID].npcType == 2029 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2068;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2030){
							npcs[NPCID].animNumber = 2062;
hitDiff = 5 + misc.random(12);
						} else if(npcs[NPCID].npcType == 19){
							npcs[NPCID].animNumber = 407;
						} else if (npcs[NPCID].npcType == 87) {
							npcs[NPCID].animNumber = 0x08A; // rat attack
						} else if (npcs[NPCID].npcType == 752) {
							npcs[NPCID].animNumber = 0x326;
						} else if (npcs[NPCID].npcType == 1961) {
							npcs[NPCID].animNumber = 1926;
						} else if ((npcs[NPCID].npcType == 221)
								|| (npcs[NPCID].npcType == 110))
							npcs[NPCID].animNumber = 128;
						else if ((npcs[NPCID].npcType == 941)
								|| (npcs[NPCID].npcType == 55)
								|| (npcs[NPCID].npcType == 53)) {
							npcs[NPCID].animNumber = 80;
						} else if (npcs[NPCID].npcType == 2060 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 2102;
hitDiff = 15 + misc.random(15);
						} else if (npcs[NPCID].npcType == 2060 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 2102;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 988 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 402;
hitDiff = 5 + misc.random(15);
plr.playerLevel[5] -= 4;
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 988 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 402;
hitDiff = 0;
plr.playerLevel[5] -= 4;
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 989 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 402;
hitDiff = 5 + misc.random(15);
plr.playerLevel[5] -= 4;
plr.playerLevel[2] -= 2;
plr.sendQuest("" + plr.playerLevel[2] + "", 4006);
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 989 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 402;
hitDiff = 0;
plr.playerLevel[5] -= 4;
plr.playerLevel[2] -= 2;
plr.sendQuest("" + plr.playerLevel[2] + "", 4006);
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 990 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 402;
hitDiff = 5 + misc.random(15);
plr.playerLevel[5] -= 4;
plr.playerLevel[1] -= 2;
plr.playerLevel[0] -= 2;
plr.playerLevel[2] -= 2;
plr.sendQuest("" + plr.playerLevel[0] + "", 4004);
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
plr.sendQuest("" + plr.playerLevel[1] + "", 4008);
plr.sendQuest("" + plr.playerLevel[2] + "", 4006);
						} else if (npcs[NPCID].npcType == 990 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 402;
hitDiff = 0;
plr.playerLevel[5] -= 4;
plr.playerLevel[1] -= 2;
plr.playerLevel[0] -= 2;
plr.playerLevel[2] -= 2;
plr.sendQuest("" + plr.playerLevel[0] + "", 4004);
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
plr.sendQuest("" + plr.playerLevel[1] + "", 4008);
plr.sendQuest("" + plr.playerLevel[2] + "", 4006);
						} else if (npcs[NPCID].npcType == 2892 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 64;
hitDiff = 45;
						} else if (npcs[NPCID].npcType == 2892 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 64;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 82 && plr.ProtMelee == false) {
hitDiff = 15 + misc.random(1);
						} else if (npcs[NPCID].npcType == 82 && plr.ProtMelee == true) {
						} else if (npcs[NPCID].npcType == 84 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 64;
hitDiff = 15 + misc.random(15);
						} else if (npcs[NPCID].npcType == 84 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 64;
hitDiff = 0;
						} else if ((npcs[NPCID].npcType == 59 || npcs[NPCID].npcType == 63)) {
							npcs[NPCID].animNumber = 143;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1472 && misc.random(3)==1 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 64;
hitDiff = 5 + misc.random(15);
						} else if (npcs[NPCID].npcType == 1472 && misc.random(3)==1 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 64;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1472 && plr.ProtMage == false) {
							npcs[NPCID].animNumber = 64;
hitDiff = 15 + misc.random(15);;
plr.lowGFX(157, 0);
						} else if (npcs[NPCID].npcType == 1472 && plr.ProtMage == true) {
							npcs[NPCID].animNumber = 64;
hitDiff = 0;
plr.lowGFX(157, 0);
						} else if (npcs[NPCID].npcType == 1975 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 407;
hitDiff = 0 + misc.random(15);
plr.playerLevel[5] -= 3;
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 1975 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 407;
hitDiff = 0;
plr.playerLevel[5] -= 3;
plr.sendQuest("" + plr.playerLevel[5] + "", 4012);
						} else if (npcs[NPCID].npcType == 1977) {
							npcs[NPCID].animNumber = 1979;
hitDiff = 10 + misc.random(5);
plr.stillgfx(346, plr.absY, plr.absX);
						} else if (npcs[NPCID].npcType == 78) {
							npcs[NPCID].animNumber = 30;
						} else if (npcs[NPCID].npcType == 1913 && misc.random(3)==1 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 451;
hitDiff = 5 + misc.random(15);
						} else if (npcs[NPCID].npcType == 1913 && misc.random(3)==1 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 451;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1913 && plr.ProtMage == false) {
							npcs[NPCID].animNumber = 1979;
hitDiff = 15 + misc.random(15);
plr.ifFreeze(50);
plr.lowGFX(369, 0);
						} else if (npcs[NPCID].npcType == 1913 && plr.ProtMage == true) {
							npcs[NPCID].animNumber = 1979;
hitDiff = 0;
plr.lowGFX(369, 0);
						} else if (npcs[NPCID].npcType == 1117 && plr.ProtRange == false) {
plr.specGFX(328);
hitDiff = 3 + misc.random(18);
						} else if (npcs[NPCID].npcType == 1117 && plr.ProtRange == true) {
hitDiff = 0 + misc.random(2);
plr.specGFX(328);
						} else if (npcs[NPCID].npcType == 2783 && plr.ProtMelee == false) {
                                               npcs[NPCID].animNumber = 2733;
						} else if (npcs[NPCID].npcType == 2783 && plr.ProtMelee == true) {
                                               npcs[NPCID].animNumber = 2733; 
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 912 && plr.ProtMage == false) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(78);
hitDiff = 3 + misc.random(15);
						} else if (npcs[NPCID].npcType == 912 && plr.ProtMage == true) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(85);
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 913 && plr.ProtMage == false) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(76);
hitDiff = 3 + misc.random(15);
						} else if (npcs[NPCID].npcType == 913 && plr.ProtMage == true) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(85);
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 914 && plr.ProtMage == false) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(77);
hitDiff = 3 + misc.random(15);
						} else if (npcs[NPCID].npcType == 914 && plr.ProtMage == true) {
                                               npcs[NPCID].animNumber = 811; // mage attack
                                               plr.specGFX(85);
hitDiff = 0;

						} else if(npcs[NPCID].npcType == 2627 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2621;
plr.playerLevel[5] -= 1;
plr.refreshSkills();
						} else if(npcs[NPCID].npcType == 2627 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2621;
plr.playerLevel[5] -= 1;
plr.refreshSkills();
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2630 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2625;
						} else if(npcs[NPCID].npcType == 2630 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2625;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 0) {
                                               npcs[NPCID].animNumber = 2633;
plr.CreateProjectile2(npcs[NPCID].absY + 1, npcs[NPCID].absX + 1, i1, l, 443, 70, 95, -npcs[NPCID].StartKilling - 1);
plr.rangeStage = 1;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 1 && plr.ProtRange == false) {
npcs[NPCID].animNumber = 2631;
plr.rangeStage = randomrangeBattle();
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 1 && plr.ProtRange == true) {
npcs[NPCID].animNumber = 2631;
plr.rangeStage = randomrangeBattle();
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 2 && plr.ProtMelee == false && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) {
                                               npcs[NPCID].animNumber = 2628;
plr.rangeStage = randomrangeBattle();
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 2 && plr.ProtMelee == true && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == true) {
                                               npcs[NPCID].animNumber = 2628;
plr.rangeStage = randomrangeBattle();
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2631 && plr.rangeStage == 2 && GoodDistance(npcs[NPCID].absX, npcs[NPCID].absY, EnemyX, EnemyY, 1) == false) {
                                               npcs[NPCID].animNumber = 2633;
hitDiff = 0;
plr.CreateProjectile2(npcs[NPCID].absY + 1, npcs[NPCID].absX + 1, i1, l, 443, 70, 95, -npcs[NPCID].StartKilling - 1);
plr.rangeStage = 1;
						} else if(npcs[NPCID].npcType == 2741 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2637;
npcs[NPCID].HP += 5;
plr.stillgfx(444, npcs[NPCID].absY+1, npcs[NPCID].absX+1);
						} else if(npcs[NPCID].npcType == 2741 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2637;
hitDiff = 0;
npcs[NPCID].HP += 5;
plr.stillgfx(444, npcs[NPCID].absY+1, npcs[NPCID].absX+1);
						} else if(npcs[NPCID].npcType == 2746 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2637;
plr.stillgfx(444, npcs[NPCID].absY, npcs[NPCID].absX);
plr.healJad();
						} else if(npcs[NPCID].npcType == 2746 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2637;
hitDiff = 0;
plr.stillgfx(444, npcs[NPCID].absY, npcs[NPCID].absX);
plr.healJad();
						} else if(npcs[NPCID].npcType == 1338 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 1341;
						} else if(npcs[NPCID].npcType == 1338 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 1341;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 3493 && plr.ProtMage == false){
							npcs[NPCID].animNumber = 1517;
plr.specGFX(187); 
hitDiff = misc.random(19);
						} else if(npcs[NPCID].npcType == 3493 && plr.ProtMage == true){
							npcs[NPCID].animNumber = 1517;
plr.specGFX(85); 
hitDiff = misc.random(1);
						} else if(npcs[NPCID].npcType == 2883 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2851;
hitDiff = misc.random(30);
						} else if(npcs[NPCID].npcType == 2883 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2851;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2882 && plr.ProtMage == false){
							npcs[NPCID].animNumber = 2854;
                                               plr.specGFX(163);
hitDiff = 0 + misc.random(30);
						} else if(npcs[NPCID].npcType == 2882 && plr.ProtMage == true){
							npcs[NPCID].animNumber = 2854;
                                               plr.specGFX(163);
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2882 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 1537;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 1624 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 1557;
						} else if(npcs[NPCID].npcType == 1624 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 1557;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 1616 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 1546;
						} else if(npcs[NPCID].npcType == 1616 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 1546;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2881 && plr.ProtRange == false){
							npcs[NPCID].animNumber = 2855;
                                               plr.specGFX(28);
hitDiff = misc.random(30);
						} else if(npcs[NPCID].npcType == 2881 && plr.ProtRange == true){
							npcs[NPCID].animNumber = 2855;
                                               plr.specGFX(28);
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 1613 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 1528;
						} else if(npcs[NPCID].npcType == 1613 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 1528;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 112 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 128;
						} else if(npcs[NPCID].npcType == 112 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 128;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 2738 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 2625;
						} else if(npcs[NPCID].npcType == 2738 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 2625;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 117 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 128;
						} else if(npcs[NPCID].npcType == 117 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 128;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 111 && plr.ProtMelee == false){
							npcs[NPCID].animNumber = 128;
						} else if(npcs[NPCID].npcType == 111 && plr.ProtMelee == true){
							npcs[NPCID].animNumber = 128;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1615 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1537;
						} else if (npcs[NPCID].npcType == 1615 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1537;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2591 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 2610;
						} else if (npcs[NPCID].npcType == 2591 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 2610;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2604 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 2610;
						} else if (npcs[NPCID].npcType == 2604 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 2610;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 2610 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 2610;
						} else if (npcs[NPCID].npcType == 2610 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 2610;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1153 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1184;
						} else if (npcs[NPCID].npcType == 1153 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1184;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1154 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1184;
						} else if (npcs[NPCID].npcType == 1154 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1184;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1155 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1184;
						} else if (npcs[NPCID].npcType == 1155 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1184;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1626 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1595;
							hitDiff = misc.random(5);
						} else if (npcs[NPCID].npcType == 1626 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1595;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 1613 && plr.ProtMelee == false) {
							npcs[NPCID].animNumber = 1528;
							hitDiff = misc.random(7);
						} else if (npcs[NPCID].npcType == 1613 && plr.ProtMelee == true) {
							npcs[NPCID].animNumber = 1528;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 253 && !plr.ProtMelee){
							npcs[NPCID].animNumber = 1833;
hitDiff = 2 + misc.random(6);
						} else if(npcs[NPCID].npcType == 253 && plr.ProtMelee){
							npcs[NPCID].animNumber = 1833;
hitDiff = 0;
						} else if(npcs[NPCID].npcType == 258 && !plr.ProtMelee){
							npcs[NPCID].animNumber = 407;
hitDiff = 10 + misc.random(6);
						} else if(npcs[NPCID].npcType == 258 && plr.ProtMelee){
							npcs[NPCID].animNumber = 407;
hitDiff = 0;
						} else if (npcs[NPCID].npcType == 114) {
							npcs[NPCID].animNumber = 359;
						} else if (npcs[NPCID].npcType == 86) {
							npcs[NPCID].animNumber = 138;
						} else if (npcs[NPCID].npcType == 112) {
							npcs[NPCID].animNumber = 1142;
						} else if (npcs[NPCID].npcType == 142) {
							npcs[NPCID].animNumber = 75;
						} else if (npcs[NPCID].npcType == 49) {
							println("setting emote...");
							npcs[NPCID].animNumber = 158;
						} else {
							npcs[NPCID].animNumber = 0x326; // human attack
						}
						npcs[NPCID].animUpdateRequired = true;
						npcs[NPCID].updateRequired = true;
						if ((EnemyHP - hitDiff) < 0) {
							hitDiff = EnemyHP;
							ResetAttackPlayer(NPCID);
						}
						server.playerHandler.players[Player].hitID = NPCID;
						server.playerHandler.players[Player].offTimer = 3;
server.playerHandler.players[Player]
								.dealDamage(hitDiff);
						server.playerHandler.players[Player].hitDiff = hitDiff;
if(plr.jadStage != 1 && plr.jadStage != 3 && plr.jadStage != 5 && plr.tzStage != 1 && plr.rangeStage != 1){
						server.playerHandler.players[Player].updateRequired = true;
						server.playerHandler.players[Player].hitUpdateRequired = true;
						server.playerHandler.players[Player].appearanceUpdateRequired = true;
						plr.setAnimation(plr.GetBlockAnim());
}
if(npcs[NPCID].npcType != 2631 && npcs[NPCID].npcType != 1116 && npcs[NPCID].npcType != 2745 && npcs[NPCID].npcType != 2746  && npcs[NPCID].npcType != 1117){
npcs[NPCID].actionTimer = 7;
}
if(npcs[NPCID].npcType == 2746){
npcs[NPCID].actionTimer = 12;
}
if(npcs[NPCID].npcType == 1116 || npcs[NPCID].npcType == 2631){
npcs[NPCID].actionTimer = 4;
}
if(npcs[NPCID].npcType == 2745){
npcs[NPCID].actionTimer = 6;
}
if(npcs[NPCID].npcType == 1117){
npcs[NPCID].actionTimer = 2;
}
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean AttackPlayerMage(int NPCID) {
		int Player = npcs[NPCID].StartKilling;
		client p = (client) server.playerHandler.players[Player];
		if (server.playerHandler.players[Player] == null) {
			ResetAttackPlayer(NPCID);
			return false;
		}
		int EnemyHP = server.playerHandler.players[Player].playerLevel[server.playerHandler.players[Player].playerHitpoints];

		if (server.playerHandler.players[Player].playerEquipment[server.playerHandler.players[Player].playerRing] == 2570) {
			// RingOfLife = true;
		}
		int hitDiff = 0;
		// hitDiff = misc.random(npcs[NPCID].MaxHit);
		if (npcs[NPCID].actionTimer == 0) {
			if (false) {
			} else {
				if ((server.playerHandler.players[Player].currentHealth > 0) == true) {
					ResetAttackPlayer(NPCID);
				} else {
					npcs[NPCID].animNumber = 711; // attack
					// animation
					npcs[NPCID].animUpdateRequired = true;
					npcs[NPCID].updateRequired = true;
					if ((EnemyHP - hitDiff) < 0) {
						hitDiff = EnemyHP;
					}
					server.playerHandler.players[Player].hitDiff = hitDiff;
					server.playerHandler.players[Player].updateRequired = true;
					server.playerHandler.players[Player].hitUpdateRequired = true;
					server.playerHandler.players[Player].appearanceUpdateRequired = true;
					npcs[NPCID].actionTimer = 7;
				}
			}
			return true;
		}
		return false;
	}

	public int calcRespawn(int npcid) {
		return respawnTime[npcid];
	}

public void FollowPlayer(int NPCID) {
		int follow = npcs[NPCID].followPlayer;
		int playerX = server.playerHandler.players[follow].absX;
		int playerY = server.playerHandler.players[follow].absY;
		boolean canwalk = true;
		if (server.playerHandler.players[follow] != null) {
			if (playerY < npcs[NPCID].absY) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY + 1);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX, npcs[NPCID].absY+npcs[NPCID].moveY) == false)
				canwalk = false;
			} else if (playerY > npcs[NPCID].absY) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY - 1);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX, npcs[NPCID].absY-npcs[NPCID].moveY) == false)
				canwalk = false;
			} else if (playerX < npcs[NPCID].absX) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX + 1);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX+npcs[NPCID].moveX, npcs[NPCID].absY) == false)
				canwalk = false;
			} else if (playerX > npcs[NPCID].absX) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX - 1);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX-npcs[NPCID].moveX, npcs[NPCID].absY) == false)
				canwalk = false;
			}
			if(canwalk == true)
			npcs[NPCID].getNextNPCMovement();
			npcs[NPCID].updateRequired = true;
		}
	}
public void FollowPlayerCB(int NPCID, int playerID) {
		int playerX = server.playerHandler.players[playerID].absX;
		int playerY = server.playerHandler.players[playerID].absY;
		npcs[NPCID].RandomWalk = false;
		boolean canwalk = true;
		if (server.playerHandler.players[playerID] != null) {
			if (playerY < npcs[NPCID].absY) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY + 1);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX, npcs[NPCID].absY+npcs[NPCID].moveY) == false)
				canwalk = false;
			} else if (playerY > npcs[NPCID].absY) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY - 1);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX, npcs[NPCID].absY-npcs[NPCID].moveY) == false)
				canwalk = false;
			} else if (playerX < npcs[NPCID].absX) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX + 1);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX+npcs[NPCID].moveX, npcs[NPCID].absY) == false)
				canwalk = false;
			} else if (playerX > npcs[NPCID].absX) {
				npcs[NPCID].moveX = GetMove(npcs[NPCID].absX, playerX - 1);
				npcs[NPCID].moveY = GetMove(npcs[NPCID].absY, playerY);
				if(WorldMap.isWalkAble(npcs[NPCID].heightLevel, npcs[NPCID].absX, npcs[NPCID].absY, npcs[NPCID].absX-npcs[NPCID].moveX, npcs[NPCID].absY) == false)
				canwalk = false;
			}
			if(canwalk == true)
			npcs[NPCID].getNextNPCMovement();
			npcs[NPCID].updateRequired = true;
		}
	}

	public int getLevelForXP(int exp) {
		int points = 0;
		int output = 0;

		for (int lvl = 1; lvl <= 135; lvl++) {
			points += Math.floor((double) lvl + 300.0
					* Math.pow(2.0, (double) lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if (output >= exp)
				return lvl;
		}
		return 0;
	}

	public int GetMove(int Place1, int Place2) { // Thanks to diablo for this!
		// Fixed my npc follow code <3
		if ((Place1 - Place2) == 0)
			return 0;
		else if ((Place1 - Place2) < 0)
			return 1;
		else if ((Place1 - Place2) > 0)
			return -1;
		return 0;
	}

	public int GetNPCBlockAnim(int id) {
		switch (id) {

		case 50: // dragons
		case 53:
		case 54:
		case 55:
			return 89;
		case 1961:
			return 1927;
		case 221:
		case 110:
			return 129;

		default:
			return 1834;

		}
	}

	public int GetNPCDropArrayID(int NPCID, int DropType) {
		for (int i = 0; i < maxNPCDrops; i++) {
			if (NpcDrops[i] != null) {
				if ((NpcDrops[i].npcId == NPCID)
						&& (NpcDrops[i].DropType == DropType)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int GetNpcKiller(int NPCID) {
		int Killer = 0;
		int Count = 0;
		for (int i = 1; i < server.playerHandler.maxPlayers; i++) {
			if (Killer == 0) {
				Killer = i;
				Count = 1;
			} else {
				if (npcs[NPCID].Killing[i] > npcs[NPCID].Killing[Killer]) {
					Killer = i;
					Count = 1;
				} else if (npcs[NPCID].Killing[i] == npcs[NPCID].Killing[Killer]) {
					Count++;
				}
			}
		}
		if ((Count > 1)
				&& (npcs[NPCID].Killing[npcs[NPCID].StartKilling] == npcs[NPCID].Killing[Killer])) {
			Killer = npcs[NPCID].StartKilling;
		}
		return Killer;
	}

	public int GetNpcListHP(int NpcID) {
		for (int i = 0; i < maxListedNPCs; i++) {
			if (NpcList[i] != null) {
				if (NpcList[i].npcId == NpcID) {
					return NpcList[i].npcHealth;
				}
			}
		}
		return 0;
	}
	public void gfxAll(int id, int Y, int X) {
		// for (Player p : server.playerHandler.players) {
		for (Player p : server.playerHandler.players) {
			if (p != null) {
				client person = (client) p;
				if (person.playerName != null) {
					if (person.distanceToPoint(X, Y) <= 60) {
						person.stillgfx2(id, Y, X, 0, 0);
					}
				}
			}
		}
	}

	public boolean GoodDistance(int objectX, int objectY, int playerX, int playerY, int distance) {
		for (int i = 0; i <= distance; i++) {
		  for (int j = 0; j <= distance; j++) {
			if ((objectX + i) == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY)) {
				return true;
			} else if ((objectX - i) == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY)) {
				return true;
			} else if (objectX == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY)) {
				return true;
			}
		  }
		}
		return false;
	}

	public boolean IsInRange(int NPCID, int MoveX, int MoveY) {
		int NewMoveX = (npcs[NPCID].absX + MoveX);
		int NewMoveY = (npcs[NPCID].absY + MoveY);
		if ((NewMoveX <= npcs[NPCID].moverangeX1)
				&& (NewMoveX >= npcs[NPCID].moverangeX2)
				&& (NewMoveY <= npcs[NPCID].moverangeY1)
				&& (NewMoveY >= npcs[NPCID].moverangeY2)) {
			if (((npcs[NPCID].walkingType == 1) && (IsInWorldMap(NewMoveX,
					NewMoveY) == true))
					|| ((npcs[NPCID].walkingType == 2) && (IsInWorldMap2(
							NewMoveX, NewMoveY) == false))) {
				if (MoveX == MoveY) {
					if (((IsInWorldMap(NewMoveX, npcs[NPCID].absY) == true) && (IsInWorldMap(
							npcs[NPCID].absX, NewMoveY) == true))
							|| ((IsInWorldMap2(NewMoveX, npcs[NPCID].absY) == false) && (IsInWorldMap2(
									npcs[NPCID].absX, NewMoveY) == false))) {
						return true;
					}
					return false;
				}
				return true;
			}
		}
		return false;
	}

	public boolean IsInWorldMap(int coordX, int coordY) {
		boolean a = true;
		if (a)
			return a;
		for (int i = 0; i < worldmap[0].length; i++) {
			// if (worldmap[0][i] == coordX && worldmap[1][i] == coordY) {
			return true;
			// }
		}
		return false;
	}

	public boolean IsInWorldMap2(int coordX, int coordY) {
		boolean a = true;
		if (a)
			return a;
		for (int i = 0; i < worldmap2[0].length; i++) {
			if ((worldmap2[0][i] == coordX) && (worldmap2[1][i] == coordY)) {
				return true;
			}
		}
		return false;
	}

	public boolean loadAutoSpawn(String FileName) {
		String line = "";
		String token = "";
		String token2 = "";
		String token2_2 = "";
		String[] token3 = new String[10];
		boolean EndOfFile = false;
		BufferedReader characterfile = null;
		try {
			characterfile = new BufferedReader(new FileReader("config\\"
					+ FileName));
		} catch (FileNotFoundException fileex) {
			misc.println(FileName + ": file not found.");
			return false;
		}
		try {
			line = characterfile.readLine();
		} catch (IOException ioexception) {
			misc.println(FileName + ": error loading file.");
			return false;
		}
		while ((EndOfFile == false) && (line != null)) {
			line = line.trim();
			int spot = line.indexOf("=");
			if (spot > -1) {
				token = line.substring(0, spot);
				token = token.trim();
				token2 = line.substring(spot + 1);
				token2 = token2.trim();
				token2_2 = token2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token3 = token2_2.split("\t");
				if (token.equals("spawn")) {
					newNPC(Integer.parseInt(token3[0]), 
							Integer.parseInt(token3[1]), 
							Integer.parseInt(token3[2]),
							Integer.parseInt(token3[3]), 
							Integer.parseInt(token3[4]), 
							Integer.parseInt(token3[5]),
							Integer.parseInt(token3[6]), 
							Integer.parseInt(token3[7]), 
							Integer.parseInt(token3[8]),
							GetNpcListHP(Integer.parseInt(token3[0])), true);
				}
			} else {
				if (line.equals("[ENDOFSPAWNLIST]")) {
					try {
						characterfile.close();
					} catch (IOException ioexception) {
					}
					return true;
				}
			}
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
		return false;
	}

	public boolean loadNPCDrops(String FileName) {
		String line = "";
		String token = "";
		String token2 = "";
		String token2_2 = "";
		String[] token3 = new String[10];
		boolean EndOfFile = false;
		BufferedReader characterfile = null;
		try {
			characterfile = new BufferedReader(new FileReader("config\\"
					+ FileName));
		} catch (FileNotFoundException fileex) {
			misc.println(FileName + ": file not found.");
			return false;
		}
		try {
			line = characterfile.readLine();
		} catch (IOException ioexception) {
			misc.println(FileName + ": error loading file.");
			return false;
		}
		while ((EndOfFile == false) && (line != null)) {
			line = line.trim();
			int spot = line.indexOf("=");
			if (spot > -1) {
				token = line.substring(0, spot);
				token = token.trim();
				token2 = line.substring(spot + 1);
				token2 = token2.trim();
				token2_2 = token2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token3 = token2_2.split("\t");
				if (token.equals("npcdrop")) {
					if (Integer.parseInt(token3[0]) <= -1)
						continue;
					drops[Integer.parseInt(token3[0])][dropCount[Integer
							.parseInt(token3[0])]] = Integer
							.parseInt(token3[1]);
					drops[Integer.parseInt(token3[0])][dropCount[Integer
							.parseInt(token3[0])] + 1] = Integer
							.parseInt(token3[2]);
					drops[Integer.parseInt(token3[0])][dropCount[Integer
							.parseInt(token3[0])] + 2] = Integer
							.parseInt(token3[3]);
					dropCount[Integer.parseInt(token3[0])] += 3;
				}
			} else {
				if (line.equals("[ENDOFNPCDROPLIST]")) {
					try {
						characterfile.close();
					} catch (IOException ioexception) {
					}
					return true;
				}
			}
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
		return false;
	}

	public boolean loadNPCList(String FileName) {
		String line = "";
		String token = "";
		String token2 = "";
		String token2_2 = "";
		String[] token3 = new String[10];
		boolean EndOfFile = false;
		BufferedReader characterfile = null;
		try {
			characterfile = new BufferedReader(new FileReader("config\\"
					+ FileName));
		} catch (FileNotFoundException fileex) {
			misc.println(FileName + ": file not found.");
			return false;
		}
		try {
			line = characterfile.readLine();
		} catch (IOException ioexception) {
			misc.println(FileName + ": error loading file.");
			return false;
		}
		while ((EndOfFile == false) && (line != null)) {
			line = line.trim();
			int spot = line.indexOf("=");
			if (spot > -1) {
				token = line.substring(0, spot);
				token = token.trim();
				token2 = line.substring(spot + 1);
				token2 = token2.trim();
				token2_2 = token2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token2_2 = token2_2.replaceAll("\t\t", "\t");
				token3 = token2_2.split("\t");
				if (token.equals("npc")) {
					newNPCList(Integer.parseInt(token3[0]), token3[1], Integer
							.parseInt(token3[2]), Integer.parseInt(token3[3]));
					combatLevel[Integer.parseInt(token3[0])] = Integer
							.parseInt(token3[2]);

					if (token3.length == 4) // no respawn time set.
						respawnTime[Integer.parseInt(token3[0])] = 0;
					else
						respawnTime[Integer.parseInt(token3[0])] = Integer
								.parseInt(token3[4]);
				}
			} else {
				if (line.equals("[ENDOFNPCLIST]")) {
					try {
						characterfile.close();
					} catch (IOException ioexception) {
					}
					return true;
				}
			}
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
		return false;
	}

	public void MonsterDropItems(int NPCID, NPC npc) {
		try {
			int totalDrops = dropCount[NPCID] / 3;
			if (totalDrops > 0) {
				// Random roller = new Random();
				for (int i = 0; i < dropCount[NPCID]; i += 3) {
					double roll = Math.random() * 100;
					client p = (client) server.playerHandler.players[npc
							.getKiller()];
					if (p != null) {
						if (p.debug)
							p.sM("Roll:  " + roll + ", Itemid:  "
									+ drops[NPCID][i] + ", amt:  "
									+ drops[NPCID][i + 1] + ", percent:  "
									+ drops[NPCID][i + 2]);
					}
					if (roll <= drops[NPCID][i + 2]) {
						if (p != null) {
							if (p.debug)
								p.sM("Rewarding " + drops[NPCID][i]);
						}
						if ((drops[NPCID] != null) && (npc != null))
							ItemHandler.addItem((int) drops[NPCID][i],
									npc.absX, npc.absY,
									(int) drops[NPCID][i + 1], npc.getKiller(),
									false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void newNPC(int npcType, int x, int y, int heightLevel, int rangex1, int rangey1, int rangex2, int rangey2, int WalkingType, int HP, boolean Respawns) {
		// first, search for a free slot
		int slot = -1;
		for (int i = 1; i < maxNPCs; i++) {
			if (npcs[i] == null) {
				slot = i;
				break;
			}
		}

		if(slot == -1) return;		// no free slot found
                 if(HP <= 0) { // This will cause client crashes if we don't use this :) - xero
                  HP = 0;
                }
		NPC newNPC = new NPC(slot, npcType);
		newNPC.absX = x;
		newNPC.absY = y;
		newNPC.makeX = x;
		newNPC.makeY = y;
		newNPC.moverangeX1 = rangex1;
		newNPC.moverangeY1 = rangey1;
		newNPC.moverangeX2 = rangex2;
		newNPC.moverangeY2 = rangey2;
		newNPC.walkingType = WalkingType;
		newNPC.HP = HP;
		newNPC.MaxHP = HP;
		//newNPC.MaxHit = (int)Math.floor((HP / 10));
		newNPC.MaxHit = (int)(combatLevel[npcType] / 3);
		/*if(WalkingType == 1)
			newNPC.RandomWalk = true;*/
		if (newNPC.MaxHit < 1) {
			newNPC.MaxHit = 1;
		}
		newNPC.heightLevel = heightLevel;
                newNPC.Respawns = Respawns;
		npcs[slot] = newNPC;
	}

	public void newNPCDrop(int npcType, int dropType, int Items[], int ItemsN[]) {
		// first, search for a free slot
		int slot = -1;
		for (int i = 0; i < maxNPCDrops; i++) {
			if (NpcDrops[i] == null) {
				slot = i;
				break;
			}
		}

		if (slot == -1)
			return; // no free slot found

		NPCDrops newNPCDrop = new NPCDrops(npcType);
		newNPCDrop.DropType = dropType;
		newNPCDrop.Items = Items;
		newNPCDrop.ItemsN = ItemsN;
		NpcDrops[slot] = newNPCDrop;
	}

	/*
	 * public boolean IsInWorldMap(int coordX, int coordY) { for (int i = 0;
	 * i < worldmap[0].length; i++) { //if (worldmap[0][i] == coordX &&
	 * worldmap[1][i] == coordY) { return true; //} } return false; } public
	 * boolean IsInWorldMap2(int coordX, int coordY) { for (int i = 0; i <
	 * worldmap2[0].length; i++) { if (worldmap2[0][i] == coordX &&
	 * worldmap2[1][i] == coordY) { return true; } } return true; }
	 * 
	 * public boolean IsInRange(int NPCID, int MoveX, int MoveY) { int
	 * NewMoveX = (npcs[NPCID].absX + MoveX); int NewMoveY =
	 * (npcs[NPCID].absY + MoveY); if (NewMoveX <= npcs[NPCID].moverangeX1 &&
	 * NewMoveX >= npcs[NPCID].moverangeX2 && NewMoveY <=
	 * npcs[NPCID].moverangeY1 && NewMoveY >= npcs[NPCID].moverangeY2) { if
	 * ((npcs[NPCID].walkingType == 1 && IsInWorldMap(NewMoveX, NewMoveY) ==
	 * true) || (npcs[NPCID].walkingType == 2 && IsInWorldMap2(NewMoveX,
	 * NewMoveY) == false)) { if (MoveX == MoveY) { if
	 * ((IsInWorldMap(NewMoveX, npcs[NPCID].absY) == true &&
	 * IsInWorldMap(npcs[NPCID].absX, NewMoveY) == true) ||
	 * (IsInWorldMap2(NewMoveX, npcs[NPCID].absY) == false &&
	 * IsInWorldMap2(npcs[NPCID].absX, NewMoveY) == false)) { return true; }
	 * return false; } return true; } } return false; }
	 */

	public void newNPCList(int npcType, String npcName, int combat, int HP) {
		// first, search for a free slot
		int slot = -1;
		for (int i = 0; i < maxListedNPCs; i++) {
			if (NpcList[i] == null) {
				slot = i;
				break;
			}
		}

		if (slot == -1)
			return; // no free slot found

		NPCList newNPCList = new NPCList(npcType);
		newNPCList.npcName = npcName;
		newNPCList.npcCombat = combat;
		newNPCList.npcHealth = HP;
		NpcList[slot] = newNPCList;
	}

	public void poisonNpc(int index) {
		npcs[index].poisonDmg = true;
		npcs[index].poisonDelay = misc.random(60);
		npcs[index].hitDiff = misc.random(5);
		npcs[index].hitDiff = npcs[index].hitDiff;
		npcs[index].updateRequired = true;
		npcs[index].hitUpdateRequired = true;
	}

	public void println(String str) {
		System.out.println(str);
	}

	public void process() {
		for (int i = 0; i < maxNPCSpawns; i++) {
			if (npcs[i] == null)
				continue;
			npcs[i].clearUpdateFlags();
		}
		for (int i = 0; i < maxNPCSpawns; i++) {
			if (npcs[i] != null) {
				annoyNpcs(i);
				if (npcs[i].offTimerNPC > 0) {
					npcs[i].offTimerNPC--;
				}
				if (npcs[i].offTimerNPC == 1) {
					npcs[i].hitIDNPC = 0;
				}
				if (npcs[i].actionTimer > 0) {
					npcs[i].actionTimer--;
				}
				if (npcs[i].IsDead == false) {
						if ((npcs[i].actionTimer == 0)
								&& (npcs[i].IsClose == true)) {
							for (int j = 1; j < server.playerHandler.maxPlayers; j++) {
								if (server.playerHandler.players[j] != null) {
									server.playerHandler.players[j].RebuildNPCList = true;
								}
							}
							if (npcs[i].Respawns) {
								int old1 = (npcs[i].npcType - 1);
								int old2 = npcs[i].makeX;
								int old3 = npcs[i].makeY;
								int old4 = npcs[i].heightLevel;
								int old5 = npcs[i].moverangeX1;
								int old6 = npcs[i].moverangeY1;
								int old7 = npcs[i].moverangeX2;
								int old8 = npcs[i].moverangeY2;
								int old9 = npcs[i].walkingType;
								int old10 = npcs[i].MaxHP;
								npcs[i] = null;
								newNPC(old1, old2, old3, old4, old5, old6,
										old7, old8, old9, old10, true);
							}
					} else if (npcs[i].RandomWalk == true && misc.random2(10) == 1 && npcs[i].moverangeX1 > 0 && npcs[i].moverangeY1 > 0 && npcs[i].moverangeX2 > 0 && npcs[i].moverangeY2 > 0) { //Move NPC
						int MoveX = misc.random(1);
						int MoveY = misc.random(1);
						int Rnd = misc.random2(4);
						if (Rnd == 1) {
							MoveX = -(MoveX);
							MoveY = -(MoveY);
						} else if (Rnd == 2) {
							MoveX = -(MoveX);
						} else if (Rnd == 3) {
							MoveY = -(MoveY);
						}
						if (IsInRange(i, MoveX, MoveY) == true) {
							npcs[i].moveX = MoveX;
							npcs[i].moveY = MoveY;
						}
						npcs[i].updateRequired = true;
					}
					if ((npcs[i].RandomWalk == false)
							&& (npcs[i].IsUnderAttack == true)
							&& (npcs[i].effects[0] == 0)) {
						if ((npcs[i].npcType == 1645)
								|| (npcs[i].npcType == 509)
								|| (npcs[i].npcType == 1241)
								|| (npcs[i].npcType == 1246)
								|| (npcs[i].npcType == 2591)
								|| (npcs[i].npcType == 1250))
							AttackPlayerMage(i);
						else
							AttackPlayer(i);
					} else if (npcs[i].followingPlayer
							&& (npcs[i].followPlayer > 0)
							&& (server.playerHandler.players[npcs[i].followPlayer] != null)
							&& (server.playerHandler.players[npcs[i].followPlayer].currentHealth > 0)							&& (npcs[i].getWho == server.playerHandler.players[npcs[i].followPlayer].playerName)
							&& (npcs[i].effects[0] == 0)) {
						if (server.playerHandler.players[npcs[i].followPlayer].AttackingOn > 0 ) {
							int follow = npcs[i].followPlayer;
							npcs[i].StartKilling = server.playerHandler.players[follow].AttackingOn;
							npcs[i].RandomWalk = true;
							npcs[i].IsUnderAttack = true;
							if (npcs[i].StartKilling > 0) {
								if ((npcs[i].npcType == 1645)
										|| (npcs[i].npcType == 509)
										|| (npcs[i].npcType == 1241)
										|| (npcs[i].npcType == 1246)
										|| (npcs[i].npcType == 2591)
										|| (npcs[i].npcType == 2025)
										|| (npcs[i].npcType == 1250))
									AttackPlayerMage(i);
								else
									AttackPlayer(i);
							}

						} else {
							FollowPlayer(i);
						}
					} else if (npcs[i].followingPlayer
							&& (npcs[i].followPlayer > 0)
							&& (server.playerHandler.players[npcs[i].followPlayer] != null)
							&& (server.playerHandler.players[npcs[i].followPlayer].currentHealth > 0)
							&& (npcs[i].effects[0] == 0)) {		
						if (server.playerHandler.players[npcs[i].followPlayer].attacknpc > 0) {
							int follow = npcs[i].followPlayer;
							npcs[i].attacknpc = server.playerHandler.players[follow].attacknpc;
							npcs[i].IsUnderAttackNpc = true;
							npcs[npcs[i].attacknpc].IsUnderAttackNpc = true;
							if (npcs[i].attacknpc > 0) {
								if ((npcs[i].npcType == 1645)
										|| (npcs[i].npcType == 509)
										|| (npcs[i].npcType == 1241)
										|| (npcs[i].npcType == 1246)
										|| (npcs[i].npcType == 2591)
										|| (npcs[i].npcType == 2025)
										|| (npcs[i].npcType == 1250))
									AttackNPCMage(i);
								else
									AttackNPC(i);
							}
						} else {
							FollowPlayer(i);
						}
					} else if (npcs[i].IsUnderAttackNpc == true) {
						AttackNPC(i);
					}
					if (npcs[i].RandomWalk == true) {
						npcs[i].getNextNPCMovement();
					}				
				} else if (npcs[i].IsDead == true) {
					if ((npcs[i].actionTimer == 0)
							&& (npcs[i].DeadApply == false)
							&& (npcs[i].NeedRespawn == false)) {
						if ((npcs[i].npcType == 81) || (npcs[i].npcType == 397)
								|| (npcs[i].npcType == 1766)
								|| (npcs[i].npcType == 1767)
								|| (npcs[i].npcType == 1768)) {
							npcs[i].animNumber = 0x03E; // cow dead
						} else if(npcs[i].npcType == 1850){
							npcs[i].animNumber = 1841;
						} else if(npcs[i].npcType == 90 || npcs[i].npcType == 91){
							npcs[i].animNumber = 263;
						} else if(npcs[i].npcType == 112 || npcs[i].npcType == 117 || npcs[i].npcType == 111){
							npcs[i].animNumber = 131;
						} else if(npcs[i].npcType == 100){
							npcs[i].animNumber = 313;
						} else if (npcs[i].npcType == 41) {
							npcs[i].animNumber = 0x039; // chicken dead
						} else if (npcs[i].npcType == 934 || npcs[i].npcType == 677) {
							npcs[i].animNumber = 67; 
						} else if (npcs[i].npcType == 87) {
							npcs[i].animNumber = 0x08D; // rat dead
						}

						else if (npcs[i].npcType == 3200) {
							npcs[i].animNumber = 3147; // drags: chaos ele
							// emote ( YESSS )
						} else if (npcs[i].npcType == 1605) {
							npcs[i].animNumber = 1508; // drags: abberant
							// spector ( YAY )
						} else if (npcs[i].npcType == 1961) {
							npcs[i].animNumber = 1929; // drags: abberant
							// spector ( YAY )
						} else if ((npcs[i].npcType == 221)
								|| (npcs[i].npcType == 110)) {
							npcs[i].animNumber = 131; // drags: abberant
							// spector ( YAY )
						} else if ((npcs[i].npcType == 941)
								|| (npcs[i].npcType == 55 || npcs[i].npcType == 54)
								|| (npcs[i].npcType == 50 || npcs[i].npcType == 941)
								|| (npcs[i].npcType == 53) 
								|| (npcs[i].npcType == 54)) {
							npcs[i].animNumber = 92;
						} else if(npcs[i].npcType == 655){
							npcs[i].animNumber = 313;
						} else if((npcs[i].npcType == 59 || npcs[i].npcType == 63)){
							npcs[i].animNumber = 146;
						} else if(npcs[i].npcType == 1472){
							npcs[i].animNumber = 67;
						} else if(npcs[i].npcType == 82){
							npcs[i].animNumber = 67;
						} else if(npcs[i].npcType == 78){
							npcs[i].animNumber = 36;
						} else if(npcs[i].npcType == 2060){
							npcs[i].animNumber = 2820;
						} else if(npcs[i].npcType == 84){
							npcs[i].animNumber = 67;
						} else if(npcs[i].npcType == 73){
							npcs[i].animNumber = 302;
						} else if(npcs[i].npcType == 1267){
							npcs[i].animNumber = 1314;
						} else if(npcs[i].npcType == 1459){
							npcs[i].animNumber = 1404;
						} else if(npcs[i].npcType == 2783){
							npcs[i].animNumber = 2732;
						} else if(npcs[i].npcType == 1338){
							npcs[i].animNumber = 1342;
                                                } else if (npcs[i].npcType == 2627) {
							npcs[i].animNumber = 2620; 
                                                } else if (npcs[i].npcType == 2630) {
							npcs[i].animNumber = 2627; 
                                                } else if (npcs[i].npcType == 2631) {
							npcs[i].animNumber = 2630;
                                                } else if (npcs[i].npcType == 2738) {
							npcs[i].animNumber = 2627;  
                                                } else if (npcs[i].npcType == 2741) {
							npcs[i].animNumber = 2638; 
                                                } else if (npcs[i].npcType == 2746) {
							npcs[i].animNumber = 2638; 
                                                } else if (npcs[i].npcType == 1116) {
							npcs[i].animNumber = 2646; 
                                                } else if (npcs[i].npcType == 2745) {
							npcs[i].animNumber = 2654; //jad dead
						} else if(npcs[i].npcType == 1610){
							npcs[i].animNumber = 1518;
						} else if(npcs[i].npcType == 1616){
							npcs[i].animNumber = 1548;
						} else if(npcs[i].npcType == 1624){
							npcs[i].animNumber = 1558;
						} else if(npcs[i].npcType == 1615){
							npcs[i].animNumber = 1538;
						} else if(npcs[i].npcType == 2591 || npcs[i].npcType == 2604 || npcs[i].npcType == 2610){
							npcs[i].animNumber = 2607;
						} else if(npcs[i].npcType == 1153 || npcs[i].npcType == 1154 || npcs[i].npcType == 1155){
							npcs[i].animNumber = 1187;
						} else if(npcs[i].npcType == 1160){
							npcs[i].animNumber = 1182;
						} else if(npcs[i].npcType == 1626){
							npcs[i].animNumber = 1597;
						} else if(npcs[i].npcType == 1613){
							npcs[i].animNumber = 1530;
						} else if(npcs[i].npcType == 2881 || npcs[i].npcType == 2882 || npcs[i].npcType == 2883){
							npcs[i].animNumber = 2856;
						} else if(npcs[i].npcType == 1613){
							npcs[i].animNumber = 1530;
						} else if (npcs[i].npcType == 114) {
							npcs[i].animNumber = 361;
						} else if (npcs[i].npcType == 86) {
							npcs[i].animNumber = 141;
						} else if (npcs[i].npcType == 1125 || npcs[i].npcType == 1115) {
							npcs[i].animNumber = 141;
						} else if (npcs[i].npcType == 761) {
							npcs[i].animNumber = 2732;
						} else if (npcs[i].npcType == 142) {
							npcs[i].animNumber = 78;
						} else if (npcs[i].npcType == 49) {
							println("setting emote..");
							npcs[i].animNumber = 161;
						} else {
							npcs[i].animNumber = 0x900; // human dead
						}
						npcs[i].updateRequired = true;
						npcs[i].animUpdateRequired = true;
						npcs[i].DeadApply = true;
						npcs[i].actionTimer = 10;
						if (npcs[i].followingPlayer
								&& (server.playerHandler.players[npcs[i].followPlayer] != null))
							server.playerHandler.players[npcs[i].followPlayer].summonedNPCS--;
					} else if ((npcs[i].actionTimer == 0)
							&& (npcs[i].DeadApply == true)
							&& (npcs[i].NeedRespawn == false)
							&& (npcs[i] != null)) {
						// System.out.println("Killer=" + npcs[i].StartKilling);
						client temp = (client) server.playerHandler.players[npcs[i]
								.getKiller()];
						if ((temp != null) && !temp.disconnected) {
if (npcs[i].npcType == 1153 && temp.taskID == 1153) {
temp.addSkillXP(150, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 1154 && temp.taskID == 1154) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 87 && temp.taskID == 87) {
temp.addSkillXP(150, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 100 && temp.taskID == 100) {
temp.addSkillXP(150, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 19 && temp.taskID == 19) {
temp.addSkillXP(250, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 1267 && temp.taskID == 1267) {
temp.addSkillXP(250, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 181 && temp.taskID == 181) {
temp.addSkillXP(150, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 90 && temp.taskID == 90) {
temp.addSkillXP(150, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 112 && temp.taskID == 112) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 117 && temp.taskID == 117) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 78 && temp.taskID == 78) {
temp.addSkillXP(200, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 941 && temp.taskID == 941) {
temp.addSkillXP(800, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 1338 && temp.taskID == 1338) {
temp.addSkillXP(600, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 912 && temp.taskID == 912) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 913 && temp.taskID == 913) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 914 && temp.taskID == 914) {
temp.addSkillXP(400, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 1183 && temp.taskID == 1183) {
temp.addSkillXP(700, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2881 && temp.taskID == 2881) {
temp.addSkillXP(900, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2882 && temp.taskID == 2882) {
temp.addSkillXP(900, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2883 && temp.taskID == 2883) {
temp.addSkillXP(900, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2591 && temp.taskID == 2591) {
temp.addSkillXP(600, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2604 && temp.taskID == 2604) {
temp.addSkillXP(600, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if (npcs[i].npcType == 2610 && temp.taskID == 2610) {
temp.addSkillXP(600, 18);
temp.taskAmount -= 1;
if (temp.taskAmount == 0 || temp.taskAmount == 1) {
temp.taskID = -1;
temp.taskAmount = -1;
temp.sM("You have completed your task. Talk to Vannaka to get a new one.");
}
}
if(npcs[i].npcType == 1264){
temp.saraKills += 1;
temp.sM("Your Godwars Killcount is "+temp.saraKills+"");
}
/*if(npcs[i].npcType == 2025){
temp.barrow += 1;
}
if(npcs[i].npcType == 2026){
temp.barrow += 1;
}
if(npcs[i].npcType == 2027){
temp.barrow += 1;
}
if(npcs[i].npcType == 2028){
temp.barrow += 1;
}
if(npcs[i].npcType == 2029){
temp.barrow += 1;
}
if(npcs[i].npcType == 2030){
temp.barrow += 1;
}*/
if(npcs[i].npcType == 253){
temp.assaultKills += 1;
}
if(npcs[i].npcType == 258){
temp.assaultKills += 3;
}	
							if (npcs[i].npcType == 3777) {
PlayerHandler.portal1 = 1;
}
							if (npcs[i].npcType == 3778) {
PlayerHandler.portal2 = 1;
}
							if (npcs[i].npcType == 3779) {
PlayerHandler.portal3 = 1;
}
							if (npcs[i].npcType == 3780) {
PlayerHandler.portal4 = 1;
}
							if (npcs[i].npcType == 655) {
temp.q1 = 3;
}
							if (npcs[i].npcType == 1117 && temp.absX >= 3552 && temp.absX <= 3590 && temp.absY >= 3391 && temp.absY <=3430) {
temp.toX = 2872;
temp.toY = 3756;
}

							if (npcs[i].npcType == 1913 && temp.absX >= 2846 && temp.absX <= 2880 && temp.absY >= 3746 && temp.absY <=3780) {
temp.toX = 3244;
temp.toY = 9365;
}

							if (npcs[i].npcType == 1977 && temp.absX >= 3220 && temp.absX <= 3270 && temp.absY >= 9320 && temp.absY <=9400) {
temp.toX = 2034;
temp.toY = 4526;
}
							if (npcs[i].npcType == 1975 && temp.absX >= 2027 && temp.absX <= 2050 && temp.absY >= 4515 && temp.absY <=4542 && temp.q3 != 15) {
temp.resetPos();
temp.showInterface(297);
temp.sendQuest("You have completed Desert Treasure!", 301);
temp.q3 = 15;
temp.sendQuest("@gre@Desert Treasure", 7334);
}
							if (npcs[i].npcType == 757 && temp.absX >= 3073 && temp.absX <= 3084 && temp.absY >= 9766 && temp.absY <=9780) {
temp.showInterface(297);
temp.sendQuest("You have completed Vampire Slayer!", 301);
temp.q4 = 15;
temp.sendQuest("@gre@Vampire Slayer", 7336);
temp.sM("You have been rewarded 30,000 hitpoints and attack experience.");
temp.addSkillXP(30000, 3);
temp.addSkillXP(30000, 0);
}
							if (npcs[i].npcType == 1472 && temp.absX >= 2627 && temp.absX <= 2677 && temp.absY >= 4550 && temp.absY <=4602) {
temp.resetPos();
temp.heightLevel = 0;
temp.showInterface(297);
temp.sendQuest("You have completed Monkey Madness!", 301);
temp.q5 = 15;
temp.sendQuest("@gre@Monkey Madness", 7383);
}
							if (npcs[i].npcType == 84 && temp.absX >= 2368 && temp.absX <= 2410 && temp.absY >= 4699 && temp.absY <=4737) {
temp.toX = 2728;
temp.toY = 3348;
temp.showInterface(297);
temp.sendQuest("You have completed Legends Quest!", 301);
temp.q7 = 15;
temp.sendQuest("@gre@Legends Quest", 7338);
}
							if (npcs[i].npcType == 2892 && temp.absX >= 2897 && temp.absX <= 2924 && temp.absY >= 9674 && temp.absY <=9699) {
temp.resetPos();
temp.showInterface(297);
temp.sendQuest("You have completed Lunar Spirit!", 301);
temp.q10 = 15;
temp.sendQuest("@gre@Lunar Spirit", 7341);
}
							if (npcs[i].npcType == 2060 && temp.absX >= 2850 && temp.absX <= 2878 && temp.absY >= 9830 && temp.absY <=9854) {
temp.sM("I have completed the Sailor's task. I should go back and talk to him.");
temp.q8 = 2;
}
							if (npcs[i].npcType == 988 && temp.absX >= 2607 && temp.absX <= 2619 && temp.absY >= 9500 && temp.absY <=9530) {
temp.q9 = 3;
}
							if (npcs[i].npcType == 989 && temp.absX >= 2607 && temp.absX <= 2619 && temp.absY >= 9500 && temp.absY <=9530) {
temp.q9 = 4;
}
							if (npcs[i].npcType == 990 && temp.absX >= 2607 && temp.absX <= 2619 && temp.absY >= 9500 && temp.absY <=9530) {
temp.showInterface(297);
temp.sendQuest("You have completed Knight's Legend!", 301);
temp.q9 = 15;
temp.sendQuest("@gre@Knight's Legend", 7346);
}
							if (npcs[i].npcType == 2627 || npcs[i].npcType == 2630 || npcs[i].npcType == 2631 || npcs[i].npcType == 2738 || npcs[i].npcType == 2741 || npcs[i].npcType == 1116) {
                    if(temp.IsInFightCave())
                    {
                        temp.KilledTz++;
                        if(temp.KilledTz == temp.NeededKills)
                        {
                            temp.TzWave++;
                            temp.WaveDelay = 20;
                        }
                    }
}
							if (npcs[i].npcType == 2631) {
temp.rangeStage = 0;
}

if (npcs[i].npcType == 1115 ) {
temp.addSkillXP(25000, 18);
temp.yell(" General Graador has been defeated.");
}
if (npcs[i].npcType == 1160) {
temp.addSkillXP(25000, 18);
temp.yell(" The Kalphite Queen has been defeated.");
}
if (npcs[i].npcType == 2745) {
temp.addSkillXP(25000, 18);
temp.yell(" Tz-Tok Jad has been defeated.");
}
if (npcs[i].npcType == 2881) {
temp.addSkillXP(25000, 18);
temp.yell(" One of the Dagganoth Kings has fallen.");
}
if (npcs[i].npcType == 2882) {
temp.addSkillXP(25000, 18);
temp.yell(" One of the Dagganoth Kings has fallen.");
}
if (npcs[i].npcType == 2883) {
temp.addSkillXP(25000, 18);
temp.yell(" One of the Dagganoth Kings has fallen.");
}
if (npcs[i].npcType == 5) {
temp.addSkillXP(2500, 18);
temp.yell(" The Spirit Beast has been defeated.");
}
if (npcs[i].npcType == 1116) {
temp.yell("Commander Zilyana has been defeated.");
}
if (npcs[i].npcType == 50) {
temp.yell("The King Black Dragon has fallen.");
}
if (npcs[i].npcType == 72) {
temp.yell(", The Mithril dragon has been defeated.");
}
//**SLAYER TOWER NPCS **//
if (npcs[i].npcType == 1657) {
temp.addSkillXP(1000, 18); 
}
if (npcs[i].npcType == 1616) {
temp.addSkillXP(1500, 18); 
}
if (npcs[i].npcType == 1637) {
temp.addSkillXP(2500, 18); 
}
if (npcs[i].npcType == 1626) {
temp.addSkillXP(4000, 18); 
}
if (npcs[i].npcType == 1624) {
temp.addSkillXP(10500, 18); 
}
if (npcs[i].npcType == 1613) {
temp.addSkillXP(14000, 18); 
}
if (npcs[i].npcType == 1615) {
temp.addSkillXP(17500, 18); 
}
if (npcs[i].npcType == 2783) {
temp.addSkillXP(20000, 18); 
}

//*END OF SLAYER TOWER*//
if (npcs[i].npcType == 1218) {
temp.toX = 3164;
temp.toY = 9625;
temp.q4 = 15;
}                    
if (npcs[i].npcType == 2743) {
temp.tzStage = 0;
}
if (npcs[i].npcType == 2025) {
temp.ahrim = 0;
temp.actionInterval = 30000;
temp.isBA = false;
}
if (npcs[i].npcType == 2026) {
temp.dharok = 0;
temp.isBD = false;
temp.actionInterval = 30000;
temp.lastAction = System.currentTimeMillis();
}
if (npcs[i].npcType == 2027) {
temp.guthan = 0;
temp.actionInterval = 30000;
temp.isBG = false;
}
if (npcs[i].npcType == 2028) {
temp.karil = 0;
temp.isBK = false;
temp.actionInterval = 30000;
}
if (npcs[i].npcType == 2029) {
temp.torag = 0;
temp.isBT = false;
temp.actionInterval = 30000;
}
if (npcs[i].npcType == 2030) {
temp.verac = 0;
temp.isBV = false;
temp.actionInterval = 30000;
}
							if (npcs[i].npcType == 1914 && temp.absX >= 3552 && temp.absX <= 3590 && temp.absY >= 3391 && temp.absY <=3430) {
temp.toX = 2872;
temp.toY = 3756;
}

							if (npcs[i].npcType == 1913 && temp.absX >= 2846 && temp.absX <= 2880 && temp.absY >= 3746 && temp.absY <=3780) {
temp.toX = 3244;
temp.toY = 9365;
}

							if (npcs[i].npcType == 1977 && temp.absX >= 3220 && temp.absX <= 3270 && temp.absY >= 9320 && temp.absY <=9400) {
temp.toX = 2034;
temp.toY = 4526;
}
							if (npcs[i].npcType == 1975 && temp.absX >= 2027 && temp.absX <= 2050 && temp.absY >= 4515 && temp.absY <=4542 && temp.q3 != 15) {
temp.resetPos();
temp.showInterface(297);
temp.sendQuest("You have completed Desert Treasure!", 301);
temp.q3 = 15;
temp.sendQuest("@gre@Desert Treasure", 7334);
}
//rfd battle recipe for disaster quest
if (npcs[i].npcType == 3494) {					
spawnANPC(3495, temp.absX+3, temp.absY, 2);
				temp.NpcDialogue = 140;
				temp.NpcDialogueSend = false;
}
if (npcs[i].npcType == 3495) {
spawnANPC(3493, temp.absX+3, temp.absY, 2);
				temp.NpcDialogue = 141;
				temp.NpcDialogueSend = false;
}
if (npcs[i].npcType == 3493) {
				temp.NpcDialogue = 142;
				temp.NpcDialogueSend = false;
spawnANPC(3491, temp.absX+3, temp.absY, 2);
}
if (npcs[i].npcType == 3491) {
temp.q4 = 15;
temp.heightLevel = 0;						
temp.showInterface(12140);
temp.addItem(7498, 1);
temp.addItem(995, 20000000);
temp.yell("Recipe for Disaster Has been completed .");
}
if (npcs[i].npcType == 2745) {
temp.sendFrame200(4901, 591);
temp.sendFrame126(temp.GetNpcName(2617), 4902);
temp.sendFrame126("", 4903);
temp.sendFrame126("You even defeated TzTok-Jad, I am most impressed!", 4904);
temp.sendFrame126("Please accept this gift as a reward.", 4905);
temp.sendFrame126("", 4906);
temp.sendFrame75(2617, 4901);
temp.sendFrame164(4900);
temp.toX = 2439;
temp.toY = 5169;
temp.heightLevel = 0;
temp.fightcaves2 = false;
//server.fightcaves = true;
temp.addItem(6570, 1);
temp.killedJad += 1;
temp.addItem(6529, 8032);
temp.killMyNPCs();
temp.jadStage = 0;
temp.NeededKills = -1;
temp.TzWave = 0;
temp.q1 = 2;

							}
							MonsterDropItems(npcs[i].npcType, npcs[i]);
							temp.attackedNpc = false;
							temp.attackedNpcId = -1;
							temp.IsAttackingNPC = false;
							temp.attacknpc = -1;
						}
						npcs[i].NeedRespawn = true;
						npcs[i].actionTimer = calcRespawn(npcs[i].npcType);
						npcs[i].absX = npcs[i].makeX;
						npcs[i].absY = npcs[i].makeY;
						npcs[i].animNumber = 0x328;
						npcs[i].HP = npcs[i].MaxHP;
						npcs[i].updateRequired = true;
						npcs[i].animUpdateRequired = true;

					} else if ((npcs[i].actionTimer == 0)
							&& (npcs[i].NeedRespawn == true)) {
						for (int j = 1; j < server.playerHandler.maxPlayers; j++) {
							if (server.playerHandler.players[j] != null) {
								server.playerHandler.players[j].RebuildNPCList = true;
							}
						}
                                                if(npcs[i].Respawns) {
						int old1 = npcs[i].npcType;
						int old2 = npcs[i].makeX;
						int old3 = npcs[i].makeY;
						int old4 = npcs[i].heightLevel;
						int old5 = npcs[i].moverangeX1;
						int old6 = npcs[i].moverangeY1;
						int old7 = npcs[i].moverangeX2;
						int old8 = npcs[i].moverangeY2;
						int old9 = npcs[i].walkingType;
						int old10 = npcs[i].MaxHP;
						npcs[i] = null;
						newNPC(old1, old2, old3, old4, old5, old6, old7, old8,
								old9, old10, true);

					}
				}
			}
		}
	}
}
	public boolean ResetAttackNPC(int NPCID) {
		if (npcs[NPCID] != null) {
		server.npcHandler.npcs[NPCID].IsUnderAttackNpc = false;
		server.npcHandler.npcs[NPCID].IsAttackingNPC = false;
		server.npcHandler.npcs[NPCID].attacknpc = -1;
		server.npcHandler.npcs[NPCID].RandomWalk = true;
		server.npcHandler.npcs[NPCID].animNumber = 0x328;
		server.npcHandler.npcs[NPCID].animUpdateRequired = true;
		server.npcHandler.npcs[NPCID].updateRequired = true;
		return true;
		}
		return false;
	}

	public boolean ResetAttackPlayer(int NPCID) {
		if (npcs[NPCID] != null) {
		server.npcHandler.npcs[NPCID].IsUnderAttack = false;
		server.npcHandler.npcs[NPCID].StartKilling = 0;
		server.npcHandler.npcs[NPCID].RandomWalk = true;
		server.npcHandler.npcs[NPCID].animNumber = 0x328;
		server.npcHandler.npcs[NPCID].animUpdateRequired = true;
		server.npcHandler.npcs[NPCID].updateRequired = true;
		return true;
		}
		return false;
	}
}
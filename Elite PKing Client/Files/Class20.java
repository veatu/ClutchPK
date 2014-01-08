// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.PrintStream;
import sign.signlink;

public class Class20
{

    public static void method257(int i, Class44 class44)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("seq.dat", null), 891);
        anInt350 = class30_sub2_sub2.method410();
        if(aClass20Array351 == null)
            aClass20Array351 = new Class20[anInt350];
        for(int j = 0; j < anInt350; j++)
        {
            if(aClass20Array351[j] == null)
                aClass20Array351[j] = new Class20();
            aClass20Array351[j].method259(true, class30_sub2_sub2);
//added			
			if (j==2561)   //Emote ID number // Godsword Stand Anim
			   {
				aClass20Array351[j].anInt352 = 49;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[49];
				aClass20Array351[j].anIntArray354 = new int[49];
				aClass20Array351[j].anIntArray355 = new int[49];
				
				aClass20Array351[j].anIntArray353[0] = 1425;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;
				
				aClass20Array351[j].anIntArray353[1] = 1718;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 2016;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 2316;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 593;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 890;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 2456;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 743;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 1031;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 1316;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 1603;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 1896;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 2194;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 480;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 781;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 1396;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 1687;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 1985;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 2284;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 564;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;

				aClass20Array351[j].anIntArray353[20] = 858;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = 0;

				aClass20Array351[j].anIntArray353[21] = 1138;  
				aClass20Array351[j].anIntArray354[21] = -1;
				aClass20Array351[j].anIntArray355[21] = 0;

				aClass20Array351[j].anIntArray353[22] = 16228;  
				aClass20Array351[j].anIntArray354[22] = -1;
				aClass20Array351[j].anIntArray355[22] = 0;

				aClass20Array351[j].anIntArray353[23] = 16229;  
				aClass20Array351[j].anIntArray354[23] = -1;
				aClass20Array351[j].anIntArray355[23] = 0;

				aClass20Array351[j].anIntArray353[24] = 16230;  
				aClass20Array351[j].anIntArray354[24] = -1;
				aClass20Array351[j].anIntArray355[24] = 0;

				aClass20Array351[j].anIntArray353[25] = 16231;  
				aClass20Array351[j].anIntArray354[25] = -1;
				aClass20Array351[j].anIntArray355[25] = 0;

				aClass20Array351[j].anIntArray353[26] = 16232;  
				aClass20Array351[j].anIntArray354[26] = -1;
				aClass20Array351[j].anIntArray355[26] = 0;

				aClass20Array351[j].anIntArray353[27] = 16233;  
				aClass20Array351[j].anIntArray354[27] = -1;
				aClass20Array351[j].anIntArray355[27] = 0;

				aClass20Array351[j].anIntArray353[28] = 16234;  
				aClass20Array351[j].anIntArray354[28] = -1;
				aClass20Array351[j].anIntArray355[28] = 0;

				aClass20Array351[j].anIntArray353[29] = 16235;  
				aClass20Array351[j].anIntArray354[29] = -1;
				aClass20Array351[j].anIntArray355[29] = 0;

				aClass20Array351[j].anIntArray353[30] = 16236;  
				aClass20Array351[j].anIntArray354[30] = -1;
				aClass20Array351[j].anIntArray355[30] = 0;

				aClass20Array351[j].anIntArray353[31] = 16237;  
				aClass20Array351[j].anIntArray354[31] = -1;
				aClass20Array351[j].anIntArray355[31] = 0;

				aClass20Array351[j].anIntArray353[32] = 16238;  
				aClass20Array351[j].anIntArray354[32] = -1;
				aClass20Array351[j].anIntArray355[32] = 0;

				aClass20Array351[j].anIntArray353[33] = 16239;  
				aClass20Array351[j].anIntArray354[33] = -1;
				aClass20Array351[j].anIntArray355[33] = 0;

				aClass20Array351[j].anIntArray353[34] = 16240;  
				aClass20Array351[j].anIntArray354[34] = -1;
				aClass20Array351[j].anIntArray355[34] = 0;

				aClass20Array351[j].anIntArray353[35] = 16241;  
				aClass20Array351[j].anIntArray354[35] = -1;
				aClass20Array351[j].anIntArray355[35] = 0;

				aClass20Array351[j].anIntArray353[36] = 16242;  
				aClass20Array351[j].anIntArray354[36] = -1;
				aClass20Array351[j].anIntArray355[36] = 0;

				aClass20Array351[j].anIntArray353[37] = 16243;  
				aClass20Array351[j].anIntArray354[37] = -1;
				aClass20Array351[j].anIntArray355[37] = 0;

				aClass20Array351[j].anIntArray353[38] = 16244;  
				aClass20Array351[j].anIntArray354[38] = -1;
				aClass20Array351[j].anIntArray355[38] = 0;

				aClass20Array351[j].anIntArray353[39] = 16245;  
				aClass20Array351[j].anIntArray354[39] = -1;
				aClass20Array351[j].anIntArray355[39] = 0;

				aClass20Array351[j].anIntArray353[40] = 16246;  
				aClass20Array351[j].anIntArray354[40] = -1;
				aClass20Array351[j].anIntArray355[40] = 0;

				aClass20Array351[j].anIntArray353[41] = 16247;  
				aClass20Array351[j].anIntArray354[41] = -1;
				aClass20Array351[j].anIntArray355[41] = 0;

				aClass20Array351[j].anIntArray353[42] = 16248;  
				aClass20Array351[j].anIntArray354[42] = -1;
				aClass20Array351[j].anIntArray355[42] = 0;

				aClass20Array351[j].anIntArray353[43] = 16249;  
				aClass20Array351[j].anIntArray354[43] = -1;
				aClass20Array351[j].anIntArray355[43] = 0;

				aClass20Array351[j].anIntArray353[44] = 16250;  
				aClass20Array351[j].anIntArray354[44] = -1;
				aClass20Array351[j].anIntArray355[44] = 0;

				aClass20Array351[j].anIntArray353[45] = 16251;  
				aClass20Array351[j].anIntArray354[45] = -1;
				aClass20Array351[j].anIntArray355[45] = 0;

				aClass20Array351[j].anIntArray353[46] = 2469;  
				aClass20Array351[j].anIntArray354[46] = -1;
				aClass20Array351[j].anIntArray355[46] = 0;

				aClass20Array351[j].anIntArray353[47] = 755;  
				aClass20Array351[j].anIntArray354[47] = -1;
				aClass20Array351[j].anIntArray355[47] = 0;

				aClass20Array351[j].anIntArray353[48] = 1042;  
				aClass20Array351[j].anIntArray354[48] = -1;
				aClass20Array351[j].anIntArray355[48] = 0;
               			}

			if (j==2562)   //Emote ID number // Godsword Walk Anim
			   {
				aClass20Array351[j].anInt352 = 17;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[17];
				aClass20Array351[j].anIntArray354 = new int[17];
				aClass20Array351[j].anIntArray355 = new int[17];
				
				aClass20Array351[j].anIntArray353[0] = 1327;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 1613;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 1905;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 1327;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 2205;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 8392;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 8393;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 8394;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 8395;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 8396;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 8397;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 8398;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 8399;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 8400;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 8401;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 8402;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 8403;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;
               			}

			if (j==2563)   // Emote ID number // Godsword Run Anim
			   {
				aClass20Array351[j].anInt352 = 32;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[32];
				aClass20Array351[j].anIntArray354 = new int[32];
				aClass20Array351[j].anIntArray355 = new int[32];
				
				aClass20Array351[j].anIntArray353[0] = 8404;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = -1;

				aClass20Array351[j].anIntArray353[1] = 8405;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = -1;

				aClass20Array351[j].anIntArray353[2] = 8406;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = -1;

				aClass20Array351[j].anIntArray353[3] = 8407;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = -1;

				aClass20Array351[j].anIntArray353[4] = 8408;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = -1;

				aClass20Array351[j].anIntArray353[5] = 470;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = -1;

				aClass20Array351[j].anIntArray353[6] = 769;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = -1;

				aClass20Array351[j].anIntArray353[7] = 1055;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = -1;

				aClass20Array351[j].anIntArray353[8] = 1343;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = -1;

				aClass20Array351[j].anIntArray353[9] = 1630;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = -1;

				aClass20Array351[j].anIntArray353[10] = 1921;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = -1;

				aClass20Array351[j].anIntArray353[11] = 13246;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = -1;

				aClass20Array351[j].anIntArray353[12] = 13247;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = -1;


				aClass20Array351[j].anIntArray353[13] = 13248;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = -1;


				aClass20Array351[j].anIntArray353[14] = 13249;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = -1;


				aClass20Array351[j].anIntArray353[15] = 13250;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = -1;


				aClass20Array351[j].anIntArray353[16] = 13251;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = -1;


				aClass20Array351[j].anIntArray353[17] = 13252;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = -1;


				aClass20Array351[j].anIntArray353[18] = 13253;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = -1;


				aClass20Array351[j].anIntArray353[19] = 13254;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = -1;


				aClass20Array351[j].anIntArray353[20] = 13255;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = -1;


				aClass20Array351[j].anIntArray353[21] = 13256;  
				aClass20Array351[j].anIntArray354[21] = -1;
				aClass20Array351[j].anIntArray355[21] = -1;


				aClass20Array351[j].anIntArray353[22] = 13257;  
				aClass20Array351[j].anIntArray354[22] = -1;
				aClass20Array351[j].anIntArray355[22] = -1;


				aClass20Array351[j].anIntArray353[23] = 13258;  
				aClass20Array351[j].anIntArray354[23] = -1;
				aClass20Array351[j].anIntArray355[23] = -1;


				aClass20Array351[j].anIntArray353[24] = 13259;  
				aClass20Array351[j].anIntArray354[24] = -1;
				aClass20Array351[j].anIntArray355[24] = -1;


				aClass20Array351[j].anIntArray353[25] = 13260;  
				aClass20Array351[j].anIntArray354[25] = -1;
				aClass20Array351[j].anIntArray355[25] = -1;


				aClass20Array351[j].anIntArray353[26] = 13261;  
				aClass20Array351[j].anIntArray354[26] = -1;
				aClass20Array351[j].anIntArray355[26] = -1;


				aClass20Array351[j].anIntArray353[27] = 13262;  
				aClass20Array351[j].anIntArray354[27] = -1;
				aClass20Array351[j].anIntArray355[27] = -1;


				aClass20Array351[j].anIntArray353[28] = 13263;  
				aClass20Array351[j].anIntArray354[28] = -1;
				aClass20Array351[j].anIntArray355[28] = -1;


				aClass20Array351[j].anIntArray353[29] = 13264;  
				aClass20Array351[j].anIntArray354[29] = -1;
				aClass20Array351[j].anIntArray355[29] = -1;


				aClass20Array351[j].anIntArray353[30] = 13265;  
				aClass20Array351[j].anIntArray354[30] = -1;
				aClass20Array351[j].anIntArray355[30] = -1;


				aClass20Array351[j].anIntArray353[31] = 13266;  
				aClass20Array351[j].anIntArray354[31] = -1;
				aClass20Array351[j].anIntArray355[31] = -1;
               			}

			if (j==407)   // Emote ID number // Godsword Weapon Anim
			   {
				aClass20Array351[j].anInt352 = 19;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[19];
				aClass20Array351[j].anIntArray354 = new int[19];
				aClass20Array351[j].anIntArray355 = new int[19];
				
				aClass20Array351[j].anIntArray353[0] = 13267;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 13268;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 13269;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 13270;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 1417;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 1708;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 2005;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 2305;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 585;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 877;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 1157;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 1203;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 1487;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 1788;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 2087;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 2386;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 665;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 13271;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 13272;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;
				}

			if (j==410)   // Emote ID number // Godsword Block Anim
			   {
				aClass20Array351[j].anInt352 = 20;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[20];
				aClass20Array351[j].anIntArray354 = new int[20];
				aClass20Array351[j].anIntArray355 = new int[20];
				
				aClass20Array351[j].anIntArray353[0] = 13273;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 16252;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 16253;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 16254;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 16255;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 16256;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 16257;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 16258;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 16259;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 16260;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 16261;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 8409;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 8410;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 8411;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 8412;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 8413;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 8414;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 8415;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 8416;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 8417;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;


               }	//stop
               			if (j==2927)   // Emote ID number // Bgs SPEC Anim
			   {
				aClass20Array351[j].anInt352 = 21;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[21];
				aClass20Array351[j].anIntArray354 = new int[21];
				aClass20Array351[j].anIntArray355 = new int[21];
				
				aClass20Array351[j].anIntArray353[0] = 16272;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 16273;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 16274;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 16275;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 16276;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 16277;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 16278;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 16279;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 16280;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 16281;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 16282;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 16283;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 2440;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 1016;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 1301;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 8439;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 8440;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 8441;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 8442;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 8443;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;

				aClass20Array351[j].anIntArray353[20] = 8444;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = 0;


               }	



               			if (j==2937)   // Emote ID number // Zgs SPEC Anim
			   {
				aClass20Array351[j].anInt352 = 26;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[26];
				aClass20Array351[j].anIntArray354 = new int[26];
				aClass20Array351[j].anIntArray355 = new int[26];
				
				aClass20Array351[j].anIntArray353[0] = 8445;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 8446;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 8447;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 8448;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 8449;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 2001;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 2300;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 16284;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 16285;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 16286;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 16287;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 16288;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 16289;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 16290;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 2330;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 612;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 907;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 1188;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 1473;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 1773;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;

				aClass20Array351[j].anIntArray353[20] = 2071;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = 0;

				aClass20Array351[j].anIntArray353[21] = 2372;  
				aClass20Array351[j].anIntArray354[21] = -1;
				aClass20Array351[j].anIntArray355[21] = 0;

				aClass20Array351[j].anIntArray353[22] = 651;  
				aClass20Array351[j].anIntArray354[22] = -1;
				aClass20Array351[j].anIntArray355[22] = 0;

				aClass20Array351[j].anIntArray353[23] = 2049;  
				aClass20Array351[j].anIntArray354[23] = -1;
				aClass20Array351[j].anIntArray355[23] = 0;

				aClass20Array351[j].anIntArray353[24] = 2351;  
				aClass20Array351[j].anIntArray354[24] = -1;
				aClass20Array351[j].anIntArray355[24] = 0;

				aClass20Array351[j].anIntArray353[25] = 632;  
				aClass20Array351[j].anIntArray354[25] = -1;
				aClass20Array351[j].anIntArray355[25] = 0;


               }	



               			if (j==2967)   // Emote ID number // Sgs SPEC Anim
			   {
				aClass20Array351[j].anInt352 = 34;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[34];
				aClass20Array351[j].anIntArray354 = new int[34];
				aClass20Array351[j].anIntArray355 = new int[34];
				
				aClass20Array351[j].anIntArray353[0] = 926;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 16291;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 16292;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 16293;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 16294;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 16295;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 16296;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 16297;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 16298;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 16299;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 16300;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 16301;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 16232;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 16303;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 16304;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 16305;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 16306;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 16307;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 16308;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 16309;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;

				aClass20Array351[j].anIntArray353[20] = 16310;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = 0;

				aClass20Array351[j].anIntArray353[21] = 16311;  
				aClass20Array351[j].anIntArray354[21] = -1;
				aClass20Array351[j].anIntArray355[21] = 0;

				aClass20Array351[j].anIntArray353[22] = 16312;  
				aClass20Array351[j].anIntArray354[22] = -1;
				aClass20Array351[j].anIntArray355[22] = 0;

				aClass20Array351[j].anIntArray353[23] = 2297;  
				aClass20Array351[j].anIntArray354[23] = -1;
				aClass20Array351[j].anIntArray355[23] = 0;

				aClass20Array351[j].anIntArray353[24] = 576;  
				aClass20Array351[j].anIntArray354[24] = -1;
				aClass20Array351[j].anIntArray355[24] = 0;

				aClass20Array351[j].anIntArray353[25] = 868;  
				aClass20Array351[j].anIntArray354[25] = -1;
				aClass20Array351[j].anIntArray355[25] = 0;

				aClass20Array351[j].anIntArray353[26] = 1146;  
				aClass20Array351[j].anIntArray354[26] = -1;
				aClass20Array351[j].anIntArray355[26] = 0;

				aClass20Array351[j].anIntArray353[27] = 1432;  
				aClass20Array351[j].anIntArray354[27] = -1;
				aClass20Array351[j].anIntArray355[27] = 0;

				aClass20Array351[j].anIntArray353[28] = 1729;  
				aClass20Array351[j].anIntArray354[28] = -1;
				aClass20Array351[j].anIntArray355[28] = 0;

				aClass20Array351[j].anIntArray353[29] = 16313;  
				aClass20Array351[j].anIntArray354[29] = -1;
				aClass20Array351[j].anIntArray355[29] = 0;

				aClass20Array351[j].anIntArray353[30] = 16314;  
				aClass20Array351[j].anIntArray354[30] = -1;
				aClass20Array351[j].anIntArray355[30] = 0;

				aClass20Array351[j].anIntArray353[31] = 16315;  
				aClass20Array351[j].anIntArray354[31] = -1;
				aClass20Array351[j].anIntArray355[31] = 0;

				aClass20Array351[j].anIntArray353[32] = 16316;  
				aClass20Array351[j].anIntArray354[32] = -1;
				aClass20Array351[j].anIntArray355[32] = 0;

				aClass20Array351[j].anIntArray353[33] = 16317;  
				aClass20Array351[j].anIntArray354[33] = -1;
				aClass20Array351[j].anIntArray355[33] = 0;


               }		
               			if (j==2890)   // Emote ID number // AGS SPEC Anim
			   {
				aClass20Array351[j].anInt352 = 31;    //number of frames
				aClass20Array351[j].anIntArray353 = new int[31];
				aClass20Array351[j].anIntArray354 = new int[31];
				aClass20Array351[j].anIntArray355 = new int[31];
				
				aClass20Array351[j].anIntArray353[0] = 8418;  
				aClass20Array351[j].anIntArray354[0] = -1;
				aClass20Array351[j].anIntArray355[0] = 0;

				aClass20Array351[j].anIntArray353[1] = 8419;  
				aClass20Array351[j].anIntArray354[1] = -1;
				aClass20Array351[j].anIntArray355[1] = 0;

				aClass20Array351[j].anIntArray353[2] = 8420;  
				aClass20Array351[j].anIntArray354[2] = -1;
				aClass20Array351[j].anIntArray355[2] = 0;

				aClass20Array351[j].anIntArray353[3] = 8421;  
				aClass20Array351[j].anIntArray354[3] = -1;
				aClass20Array351[j].anIntArray355[3] = 0;

				aClass20Array351[j].anIntArray353[4] = 8422;  
				aClass20Array351[j].anIntArray354[4] = -1;
				aClass20Array351[j].anIntArray355[4] = 0;

				aClass20Array351[j].anIntArray353[5] = 8423;  
				aClass20Array351[j].anIntArray354[5] = -1;
				aClass20Array351[j].anIntArray355[5] = 0;

				aClass20Array351[j].anIntArray353[6] = 8424;  
				aClass20Array351[j].anIntArray354[6] = -1;
				aClass20Array351[j].anIntArray355[6] = 0;

				aClass20Array351[j].anIntArray353[7] = 8425;  
				aClass20Array351[j].anIntArray354[7] = -1;
				aClass20Array351[j].anIntArray355[7] = 0;

				aClass20Array351[j].anIntArray353[8] = 8426;  
				aClass20Array351[j].anIntArray354[8] = -1;
				aClass20Array351[j].anIntArray355[8] = 0;

				aClass20Array351[j].anIntArray353[9] = 8427;  
				aClass20Array351[j].anIntArray354[9] = -1;
				aClass20Array351[j].anIntArray355[9] = 0;

				aClass20Array351[j].anIntArray353[10] = 8428;  
				aClass20Array351[j].anIntArray354[10] = -1;
				aClass20Array351[j].anIntArray355[10] = 0;

				aClass20Array351[j].anIntArray353[11] = 8429;  
				aClass20Array351[j].anIntArray354[11] = -1;
				aClass20Array351[j].anIntArray355[11] = 0;

				aClass20Array351[j].anIntArray353[12] = 8430;  
				aClass20Array351[j].anIntArray354[12] = -1;
				aClass20Array351[j].anIntArray355[12] = 0;

				aClass20Array351[j].anIntArray353[13] = 8431;  
				aClass20Array351[j].anIntArray354[13] = -1;
				aClass20Array351[j].anIntArray355[13] = 0;

				aClass20Array351[j].anIntArray353[14] = 8432;  
				aClass20Array351[j].anIntArray354[14] = -1;
				aClass20Array351[j].anIntArray355[14] = 0;

				aClass20Array351[j].anIntArray353[15] = 8433;  
				aClass20Array351[j].anIntArray354[15] = -1;
				aClass20Array351[j].anIntArray355[15] = 0;

				aClass20Array351[j].anIntArray353[16] = 8434;  
				aClass20Array351[j].anIntArray354[16] = -1;
				aClass20Array351[j].anIntArray355[16] = 0;

				aClass20Array351[j].anIntArray353[17] = 8435;  
				aClass20Array351[j].anIntArray354[17] = -1;
				aClass20Array351[j].anIntArray355[17] = 0;

				aClass20Array351[j].anIntArray353[18] = 8436;  
				aClass20Array351[j].anIntArray354[18] = -1;
				aClass20Array351[j].anIntArray355[18] = 0;

				aClass20Array351[j].anIntArray353[19] = 8437;  
				aClass20Array351[j].anIntArray354[19] = -1;
				aClass20Array351[j].anIntArray355[19] = 0;

				aClass20Array351[j].anIntArray353[20] = 8438;  
				aClass20Array351[j].anIntArray354[20] = -1;
				aClass20Array351[j].anIntArray355[20] = 0;

				aClass20Array351[j].anIntArray353[21] = 16262;  
				aClass20Array351[j].anIntArray354[21] = -1;
				aClass20Array351[j].anIntArray355[21] = 0;

				aClass20Array351[j].anIntArray353[22] = 16263;  
				aClass20Array351[j].anIntArray354[22] = -1;
				aClass20Array351[j].anIntArray355[22] = 0;

				aClass20Array351[j].anIntArray353[23] = 16264;  
				aClass20Array351[j].anIntArray354[23] = -1;
				aClass20Array351[j].anIntArray355[23] = 0;

				aClass20Array351[j].anIntArray353[24] = 16265;  
				aClass20Array351[j].anIntArray354[24] = -1;
				aClass20Array351[j].anIntArray355[24] = 0;

				aClass20Array351[j].anIntArray353[25] = 16266;  
				aClass20Array351[j].anIntArray354[25] = -1;
				aClass20Array351[j].anIntArray355[25] = 0;

				aClass20Array351[j].anIntArray353[26] = 16267;  
				aClass20Array351[j].anIntArray354[26] = -1;
				aClass20Array351[j].anIntArray355[26] = 0;

				aClass20Array351[j].anIntArray353[27] = 16268;  
				aClass20Array351[j].anIntArray354[27] = -1;
				aClass20Array351[j].anIntArray355[27] = 0;

				aClass20Array351[j].anIntArray353[28] = 16269;  
				aClass20Array351[j].anIntArray354[28] = -1;
				aClass20Array351[j].anIntArray355[28] = 0;

				aClass20Array351[j].anIntArray353[29] = 16270;  
				aClass20Array351[j].anIntArray354[29] = -1;
				aClass20Array351[j].anIntArray355[29] = 0;

				aClass20Array351[j].anIntArray353[30] = 16271;  
				aClass20Array351[j].anIntArray354[30] = -1;
				aClass20Array351[j].anIntArray355[30] = 0;

               }























			   
        }

   }

    public int method258(int i, byte byte0)
    {
        int j = anIntArray355[i];
        if(byte0 != -39)
        {
            for(int k = 1; k > 0; k++);
        }
        if(j == 0)
        {
            Class36 class36 = Class36.method531(anInt348, anIntArray353[i]);
            if(class36 != null)
                j = anIntArray355[i] = class36.anInt636;
        }

        if(j == 0)
            j = 1;
        return j;
    }

    public void method259(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            aBoolean349 = !aBoolean349;
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                break;
            if(i == 1)
            {
                anInt352 = class30_sub2_sub2.method408();
                anIntArray353 = new int[anInt352];
                anIntArray354 = new int[anInt352];
                anIntArray355 = new int[anInt352];
                for(int j = 0; j < anInt352; j++)
                {
                    anIntArray353[j] = class30_sub2_sub2.method410();
                    anIntArray354[j] = class30_sub2_sub2.method410();
                    if(anIntArray354[j] == 65535)
                        anIntArray354[j] = -1;
                    anIntArray355[j] = class30_sub2_sub2.method410();
                }

            } else
            if(i == 2)
                anInt356 = class30_sub2_sub2.method410();
            else
            if(i == 3)
            {
                int k = class30_sub2_sub2.method408();
                anIntArray357 = new int[k + 1];
                for(int l = 0; l < k; l++)
                    anIntArray357[l] = class30_sub2_sub2.method408();

                anIntArray357[k] = 0x98967f;
            } else
            if(i == 4)
                aBoolean358 = true;
            else
            if(i == 5)
                anInt359 = class30_sub2_sub2.method408();
            else
            if(i == 6)
                anInt360 = class30_sub2_sub2.method410();
            else
            if(i == 7)
                anInt361 = class30_sub2_sub2.method410();
            else
            if(i == 8)
                anInt362 = class30_sub2_sub2.method408();
            else
            if(i == 9)
                anInt363 = class30_sub2_sub2.method408();
            else
            if(i == 10)
                anInt364 = class30_sub2_sub2.method408();
            else
            if(i == 11)
                anInt365 = class30_sub2_sub2.method408();
            else
            if(i == 12)
                anInt366 = class30_sub2_sub2.method413();
            else
                System.out.println("Error unrecognised seq config code: " + i);
        } while(true);
        if(anInt352 == 0)
        {
            anInt352 = 1;
            anIntArray353 = new int[1];
            anIntArray353[0] = -1;
            anIntArray354 = new int[1];
            anIntArray354[0] = -1;
            anIntArray355 = new int[1];
            anIntArray355[0] = -1;
        }
        if(anInt363 == -1)
            if(anIntArray357 != null)
                anInt363 = 2;
            else
                anInt363 = 0;
        if(anInt364 == -1)
        {
            if(anIntArray357 != null)
            {
                anInt364 = 2;
                return;
            }
            anInt364 = 0;
        }
    }

    public Class20()
    {
        anInt348 = 9;
        aBoolean349 = false;
        anInt356 = -1;
        aBoolean358 = false;
        anInt359 = 5;
        anInt360 = -1;
        anInt361 = -1;
        anInt362 = 99;
        anInt363 = -1;
        anInt364 = -1;
        anInt365 = 2;
    }

    private int anInt348;
    private boolean aBoolean349;
    public static int anInt350;
    public static Class20 aClass20Array351[];
    public int anInt352;
    public int anIntArray353[];
    public int anIntArray354[];
    private int anIntArray355[];
    public int anInt356;
    public int anIntArray357[];
    public boolean aBoolean358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public int anInt366;
    public static int anInt367;
}

import java.io.*;

final class Class8
{

    private byte aByte154;
    public int anInt155;
    private int anIntArray156[];
    public int anInt157;
    static Class12 aClass12_158 = new Class12(false, 100);
    public static Class12 aClass12_159 = new Class12(false, 50);
    private int anIntArray160[];
    public boolean aBoolean161;
    public int anInt162;
    public int anInt163;
    private int anInt164;
    private int anInt165;
    public int anInt166;
    private int anInt167;
    public String aStringArray168[];
    private int anInt169;
    public String aString170;
    private int anInt171;
    private static Class8 aClass8Array172[];
    public int anInt173;
    private int anInt174;
    private int anInt175;
    public boolean aBoolean176;
    private int anInt177;
    public byte aByteArray178[];
    public int anInt179;
    private static int anInt180;
    public int anInt181;
    public static boolean aBoolean182 = true;
    private static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_183;
    private int anInt184;
    public int anInt185;
    private boolean aBoolean186;
    private static boolean aBoolean187;
    private int anInt188;
    public String aStringArray189[];
    public int anInt190;
    private int anInt191;
    private int anInt192;
    public int anIntArray193[];
    private int anInt194;
    private static int anIntArray195[];
    private int anInt196;
    public int anInt197;
    public int anInt198;
    public int anInt199;
    private int anInt200;
    public int anIntArray201[];
    public int anInt202;
    public static int anInt203;
    public static int frugooItems = 5;
    private int anInt204;
    private byte aByte205;
    private boolean aBoolean206;

    public static void dumpItemsListnew()
    {
        for(int i = 0; i < 9000; i++)
        {
            Class8 class8 = method198(i);
            Object obj = null;
            try
            {
                BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("ItemList.txt", true));
                if(class8.aString170 != null)
                {
                    bufferedwriter.write((new StringBuilder()).append("ID: ").append(i).append("\t\t").toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: Name: ").append(class8.aString170).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: Info: ").append(class8.aByteArray178[1]).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: colour 1: ").append(class8.anIntArray156).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: colour 3: ").append(class8.anIntArray160).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: female model: ").append(class8.anInt200).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: male model: ").append(class8.anInt165).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.write((new StringBuilder()).append("ID: drop model: ").append(class8.anInt174).toString());
                    bufferedwriter.newLine();
                    bufferedwriter.newLine();
                    bufferedwriter.flush();
                    bufferedwriter.close();
                }
            }
            catch(IOException ioexception) { }
        }

    }

    public static final void method191(int i)
    {
        aClass12_159 = null;
        aClass12_158 = null;
        anIntArray195 = null;
        if(i >= 0)
        {
            aBoolean187 = !aBoolean187;
        }
        aClass8Array172 = null;
        aClass30_Sub2_Sub2_183 = null;
    }

    public final boolean method192(int i, int j)
    {
        if(i != -2836)
        {
            aBoolean186 = !aBoolean186;
        }
        int k = anInt175;
        int l = anInt166;
        if(j == 1)
        {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
        {
            return true;
        }
        boolean flag = true;
        if(!Class30_Sub2_Sub4_Sub6.method463(k))
        {
            flag = false;
        }
        if(l != -1 && !Class30_Sub2_Sub4_Sub6.method463(l))
        {
            flag = false;
        }
        return flag;
    }

    

    public static final void method193(Class44 class44)
    {
        aClass30_Sub2_Sub2_183 = new Class30_Sub2_Sub2(class44.method571("obj.dat", null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("obj.idx", null), 891);
        anInt203 = class30_sub2_sub2.method410();
        anIntArray195 = new int[anInt203 + 40000];
        int i = 2;
        for(int j = 0; j < anInt203; j++)
        {
            anIntArray195[j] = i;
            i += class30_sub2_sub2.method410();
        }

        aClass8Array172 = new Class8[10];
        for(int k = 0; k < 10; k++)
        {
            aClass8Array172[k] = new Class8();
        }

    }

    public final Class30_Sub2_Sub4_Sub6 method194(int i, int j)
    {
        while(i >= 0) 
        {
            aBoolean186 = !aBoolean186;
        }
        int k = anInt175;
        int l = anInt166;
        if(j == 1)
        {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
        {
            return null;
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
        if(l != -1)
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.method462(anInt171, l);
            Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = {
                class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_1
            };
            class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(2, aclass30_sub2_sub4_sub6, -38);
        }
        if(anIntArray156 != null)
        {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
            {
                class30_sub2_sub4_sub6.method476(anIntArray156[i1], anIntArray160[i1]);
            }

        }
        return class30_sub2_sub4_sub6;
    }

    public final boolean method195(int i, int j)
    {
        if(i != 40903)
        {
            aBoolean206 = !aBoolean206;
        }
        int k = anInt165;
        int l = anInt188;
        int i1 = anInt185;
        if(j == 1)
        {
            k = anInt200;
            l = anInt164;
            i1 = anInt162;
        }
        if(k == -1)
        {
            return true;
        }
        boolean flag = true;
        if(!Class30_Sub2_Sub4_Sub6.method463(k))
        {
            flag = false;
        }
        if(l != -1 && !Class30_Sub2_Sub4_Sub6.method463(l))
        {
            flag = false;
        }
        if(i1 != -1 && !Class30_Sub2_Sub4_Sub6.method463(i1))
        {
            flag = false;
        }
        return flag;
    }

    public final Class30_Sub2_Sub4_Sub6 method196(boolean flag, int i)
    {
        if(flag)
        {
            throw new NullPointerException();
        }
        int j = anInt165;
        int k = anInt188;
        int l = anInt185;
        if(i == 1)
        {
            j = anInt200;
            k = anInt164;
            l = anInt162;
        }
        if(j == -1)
        {
            return null;
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, j);
        if(k != -1)
        {
            if(l != -1)
            {
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_3 = Class30_Sub2_Sub4_Sub6.method462(anInt171, l);
                Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6_1[] = {
                    class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_3
                };
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(3, aclass30_sub2_sub4_sub6_1, -38);
            } else
            {
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_2 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
                Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = {
                    class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_2
                };
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(2, aclass30_sub2_sub4_sub6, -38);
            }
        }
        if(i == 0 && aByte205 != 0)
        {
            class30_sub2_sub4_sub6.method475(0, aByte205, 16384, 0);
        }
        if(i == 1 && aByte154 != 0)
        {
            class30_sub2_sub4_sub6.method475(0, aByte154, 16384, 0);
        }
        if(anIntArray156 != null)
        {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
            {
                class30_sub2_sub4_sub6.method476(anIntArray156[i1], anIntArray160[i1]);
            }

        }
        return class30_sub2_sub4_sub6;
    }

    public final void method197()
    {
        anInt174 = 0;
        aString170 = null;
        aByteArray178 = null;
        anIntArray156 = null;
        anIntArray160 = null;
        anInt181 = 12000;
        anInt190 = 0;
        anInt198 = 0;
        anInt204 = 0;
        anInt169 = 0;
        anInt194 = 0;
        anInt199 = -1;
        aBoolean176 = false;
        anInt155 = 1;
        aBoolean161 = false;
        aStringArray168 = null;
        aStringArray189 = null;
        anInt165 = -1;
        anInt188 = -1;
        aByte205 = 0;
        anInt200 = -1;
        anInt164 = -1;
        aByte154 = 0;
        anInt185 = -1;
        anInt162 = -1;
        anInt175 = -1;
        anInt166 = -1;
        anInt197 = -1;
        anInt173 = -1;
        anIntArray193 = null;
        anIntArray201 = null;
        anInt179 = -1;
        anInt163 = -1;
        anInt167 = 128;
        anInt192 = 128;
        anInt191 = 128;
        anInt196 = 0;
        anInt184 = 0;
        anInt202 = 0;
    }

    public static final Class8 method198(int i)
    {
        for(int j = 0; j < 10; j++)
        {
            if(aClass8Array172[j].anInt157 == i)
            {
                return aClass8Array172[j];
            }
        }

        anInt180 = (anInt180 + 1) % 10;
        Class8 class8 = aClass8Array172[anInt180];
        aClass30_Sub2_Sub2_183.anInt1406 = anIntArray195[i];
        class8.anInt157 = i;
        class8.method197();
        class8.method203(true, aClass30_Sub2_Sub2_183);

if(i == 3960)
{
class8.aString170 = "Fancy boots";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 12558;//16014;
class8.anInt165 = 12559;//16009;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 1829;
class8.anInt181 = 784;
class8.anInt155 = 1;
class8.anInt200 = 12560;//16011;
class8.anInt164 = -1;
class8.anInt169 = -2;
class8.anInt204 = 0;
class8.anInt194 = -4;
class8.anInt179 = -1;
class8.anInt190 = 162;
class8.aByteArray178 = "It's a Fancy boots.".getBytes();
}
if(i == 3962)
{
class8.aString170 = "Fighting boots";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 12561;//16015;
class8.anInt165 = 12562;//16010;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 1841;
class8.anInt181 = 784;
class8.anInt155 = 1;
class8.anInt200 = 12563;//16012;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -4;
class8.anInt179 = -1;
class8.anInt190 = 147;
class8.aByteArray178 = "It's a Fighting boots.".getBytes();
}
		        if(i == 4391){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 12564;
class8.anInt181 = 840;//900
class8.anInt190 = 280;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 12564;
class8.anInt200 = 12564;
class8.aBoolean176 = false;
class8.aString170 = "omg attack";
class8.aByteArray178 = "omg".getBytes();
        }
		        if(i == 4383){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 12565;
class8.anInt181 = 840;//900
class8.anInt190 = 280;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 12565;
class8.anInt200 = 12565;
class8.aBoolean176 = false;
class8.aString170 = "omg defend";
class8.aByteArray178 = "omg".getBytes();
        }
		        if(i == 4389){
class8.aString170 = "omg collect";
class8.aByteArray178 = "omg".getBytes();
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 12566;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 12566;
class8.anInt200 = 12566;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
        }
       
		        if(i == 4379){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 12567;
class8.anInt181 = 840;//900
class8.anInt190 = 280;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 12567;
class8.anInt200 = 12567;
class8.aBoolean176 = false;
class8.aString170 = "omg heal";
class8.aByteArray178 = "omg".getBytes();
        }
if(i == 3940)
{
class8.aString170 = "Lunar helm";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160[0] = -25326;
class8.anIntArray156[0] = 6573;
class8.anIntArray160[1] = 16652;
class8.anIntArray156[1] = 36007;//-29529;
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;
class8.anIntArray160[3] = -3822;
class8.anIntArray156[3] = 410;
class8.anInt174 = 12533;//16717;
class8.anInt165 = 12534;//16480;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 126;
class8.anInt181 = 854;
class8.anInt155 = 100;
class8.anInt200 = 12535;//16455;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -5;
class8.anInt179 = -1;
class8.anInt190 = 101;
class8.aByteArray178 = "It's a Lunar helm.".getBytes();
}
if(i == 3942)
{
class8.aString170 = "Lunar torso";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160[0] = -25326;
class8.anIntArray156[0] = 6573;//--------------
class8.anIntArray160[1] = 16652;
class8.anIntArray156[1] = 36007;//-29529;//
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;//
class8.anIntArray160[3] = -3822;
class8.anIntArray156[3] = 410;//------------
class8.anInt174 = 12536;//16719;
class8.anInt165 = 12537;//16484;
class8.anInt188 = 12538;//16471;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1308;
class8.anInt155 = 100;
class8.anInt200 = 12539;//16505;
class8.anInt164 = 12540;//16492;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = -1;
class8.anInt190 = 498;
class8.aByteArray178 = "It's a Lunar torso.".getBytes();
}
if(i == 3944)
{
class8.aString170 = "Lunar legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160[0] = -25326;
class8.anIntArray156[0] = 6573;
class8.anIntArray160[1] = 16652;
class8.anIntArray156[1] = 36007;//-29529;
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;
class8.anIntArray160[3] = -3822;
class8.anIntArray156[3] = 410;
class8.anInt174 = 12541;//16718;
class8.anInt165 = 12542;//16482;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 3;
class8.anInt181 = 1704;
class8.anInt155 = 100;
class8.anInt200 = 12543;//16502;
class8.anInt164 = -1;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 12;
class8.anInt179 = -1;
class8.anInt190 = 387;
class8.aByteArray178 = "It's a Lunar legs.".getBytes();
}
if(i == 3946)
{
class8.aString170 = "Lunar gloves";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160[0] = -25326;
class8.anIntArray156[0] = 6573;
class8.anIntArray160[1] = 16652;
class8.anIntArray156[1] = 36007;//-29529;
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;
class8.anIntArray160[3] = -3822;
class8.anIntArray156[3] = 410;
class8.anInt174 = 12544;//16713;
class8.anInt165 = 12545;//16475;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 984;
class8.anInt155 = 100;
class8.anInt200 = 12546;//16497;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = 1;
class8.anInt179 = -1;
class8.anInt190 = 484;
class8.aByteArray178 = "It's a Lunar gloves.".getBytes();
}
if(i == 3948)
{
class8.aString170 = "Lunar boots";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160[0] = -25326;
class8.anIntArray156[0] = 6573;
class8.anIntArray160[1] = 16652;
class8.anIntArray156[1] = 36007;//-29529;
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;
class8.anIntArray160[3] = -3822;
class8.anIntArray156[3] = 410;
class8.anInt174 = 12547;//16715;
class8.anInt165 = 12548;//16474;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 810;
class8.anInt155 = 100;
class8.anInt200 = 12549;//16495;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -19;
class8.anInt179 = -1;
class8.anInt190 = 207;
class8.aByteArray178 = "It's a Lunar boots.".getBytes();
}
if(i == 3950)
{
class8.aString170 = "Lunar cape";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = 1950;
class8.anIntArray156[0] = 7700;//---------
class8.anIntArray160[1] = 2749;
class8.anIntArray156[1] = 11200;//
class8.anIntArray160[2] = 20;
class8.anIntArray156[2] = -32236;//
class8.anIntArray160[3] = -3822;//
class8.anIntArray156[3] = 410;//------------
class8.anIntArray160[4] = -25326;
class8.anIntArray156[4] = 6573;//---------
class8.anIntArray160[5] = 16652;
class8.anIntArray156[5] = 36007;//-29529;//
class8.anInt174 = 12550;//16714;
class8.anInt165 = 12551;//16487;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 2151;
class8.anInt155 = 2;
class8.anInt200 = 12552;//16507;
class8.anInt164 = -1;
class8.anInt169 = -3;
class8.anInt204 = 83;
class8.anInt194 = 0;
class8.anInt179 = -1;
class8.anInt190 = 636;
class8.aByteArray178 = "It's a Lunar cape.".getBytes();
}
if(i == 3952)
{
class8.aString170 = "Lunar amulet";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anIntArray160 = new int[3];
class8.anIntArray156 = new int[3];
class8.anIntArray160[0] = -29529;
class8.anIntArray156[0] = 9152;
class8.anIntArray160[1] = 36007;//-29529;
class8.anIntArray156[1] = 9152;
class8.anIntArray160[2] = 6573;
class8.anIntArray156[2] = 41;
class8.anInt174 = 12553;//16716;
class8.anInt165 = 12554;//16483;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 147;
class8.anInt181 = 784;
class8.anInt155 = 30;
class8.anInt200 = 12555;//16504;
class8.anInt164 = -1;
class8.anInt169 = 7;
class8.anInt204 = 0;
class8.anInt194 = -79;
class8.anInt179 = -1;
class8.anInt190 = 231;
class8.aByteArray178 = "It's a Lunar amulet.".getBytes();
}
if(i == 3954)
{
class8.aString170 = "Lunar staff";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 12556;//16724;
class8.anInt165 = 12557;//16489;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 1425;
class8.anInt181 = 1488;
class8.anInt155 = 1;
class8.anInt200 = 12557;//16489;
class8.anInt164 = -1;
class8.anInt169 = -3;
class8.anInt204 = 55;
class8.anInt194 = 0;
class8.anInt179 = -1;
class8.anInt190 = 304;
class8.aByteArray178 = "It's a Lunar staff.".getBytes();
}
	
if(i == 3904)
{
class8.aString170 = "Godsword shard 1";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12507;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 249;
class8.anInt181 = 984;
//class8.anInt155 = 250000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 3;
class8.anInt204 = 0;
class8.anInt194 = 1;
class8.anInt179 = 11711;
class8.anInt190 = 549;
class8.aByteArray178 = "It's a Godsword shard 1.".getBytes();
}
if(i == 3906)
{
class8.aString170 = "Godsword shard 2";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12508;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 249;
class8.anInt181 = 984;
class8.anInt155 = 250000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 11713;
class8.anInt190 = 675;
class8.aByteArray178 = "It's a Godsword shard 2.".getBytes();
}
if(i == 3908)
{
class8.aString170 = "Godsword shard 3";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12509;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 207;
class8.anInt181 = 984;
class8.anInt155 = 250000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 7;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 11715;
class8.anInt190 = 612;
class8.aByteArray178 = "It's a Godsword shard 3.".getBytes();
}
if(i == 3910)
{
class8.aString170 = "Godsword shards";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[1];
class8.anIntArray156 = new int[1];
class8.anIntArray160[0] = 5652;
class8.anIntArray156[0] = 61;
class8.anInt174 = 12510;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 249;
class8.anInt181 = 1503;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 8;
class8.anInt204 = 0;
class8.anInt194 = 8;
class8.anInt179 = 11687;
class8.anInt190 = 567;
class8.aByteArray178 = "It's a Godsword shards(1+2).".getBytes();
}
if(i == 3912)
{
class8.aString170 = "Godsword shards";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[1];
class8.anIntArray156 = new int[1];
class8.anIntArray160[0] = 5652;
class8.anIntArray156[0] = 61;
class8.anInt174 = 12511;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 249;
class8.anInt181 = 1632;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 8;
class8.anInt204 = 0;
class8.anInt194 = 8;
class8.anInt179 = 11689;
class8.anInt190 = 567;
class8.aByteArray178 = "It's a Godsword shards(1+3).".getBytes();
}
if(i == 3914)
{
class8.aString170 = "Godsword blade";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[1];
class8.anIntArray156 = new int[1];
class8.anIntArray160[0] = 5652;
class8.anIntArray156[0] = 61;
class8.anInt174 = 12512;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 1156;
class8.anInt181 = 1350;
class8.anInt155 = 750000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -3;
class8.anInt179 = 11691;
class8.anInt190 = 352;
class8.aByteArray178 = "It's a Godsword blade.".getBytes();
}
if(i == 3916)
{
class8.aString170 = "Godsword shards";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[1];
class8.anIntArray156 = new int[1];
class8.anIntArray160[0] = 5652;
class8.anIntArray156[0] = 61;
class8.anInt174 = 12513;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 263;
class8.anInt181 = 1168;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -3;
class8.anInt179 = 11693;
class8.anInt190 = 463;
class8.aByteArray178 = "It's a Godsword shards(2+3).".getBytes();
}
if(i == 3918)
{
class8.aString170 = "Armadyl hilt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12514;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 263;
class8.anInt181 = 789;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = -3;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 11703;
class8.anInt190 = 498;
class8.aByteArray178 = "It's an Armadyl hilt.".getBytes();
}
if(i == 3920)
{
class8.aString170 = "Bandos hilt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12515;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 203;
class8.anInt181 = 868;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 1;
class8.anInt204 = 0;
class8.anInt194 = 1;
class8.anInt179 = 11705;
class8.anInt190 = 618;
class8.aByteArray178 = "It's a Bandos hilt.".getBytes();
}
if(i == 3922)
{
class8.aString170 = "Saradomin hilt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12516;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 263;
class8.anInt181 = 789;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 11707;
class8.anInt190 = 498;
class8.aByteArray178 = "It's a Saradomin hilt.".getBytes();
}
if(i == 3924)
{
class8.aString170 = "Zamorak hilt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12517;
class8.anInt165 = -1;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 224;
class8.anInt181 = 917;
class8.anInt155 = 500000;
class8.anInt200 = -1;
class8.anInt164 = -1;
class8.anInt169 = 2;
class8.anInt204 = 0;
class8.anInt194 = -6;
class8.anInt179 = 11709;
class8.anInt190 = 435;
class8.aByteArray178 = "It's a Zamorak hilt.".getBytes();
}

        if(i == 3888){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 13000;
class8.anInt181 = 840;//900
class8.anInt190 = 280;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 13001;
class8.anInt200 = 13001;
class8.aBoolean176 = false;
class8.aString170 = "Whip";
class8.aByteArray178 = "A Whip".getBytes();
        }
if(i == 13014) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13044; // Drop/Inv Model
class8.anInt165 = 13045; // Male Wield Model
class8.anInt200 = 13046; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1300; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = 0; // Position in inv, increase to move right
class8.anInt194 = 0; // Position in inv, increase to move up						
class8.aString170 = "Zuriel's robe top"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13013) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13041; // Drop/Inv Model
class8.anInt165 = 13042; // Male Wield Model
class8.anInt200 = 13043; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1700; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = 0; // Position in inv, increase to move right
class8.anInt194 = -9; // Position in inv, increase to move up						
class8.aString170 = "Zuriel's robe bottom"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13012) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13038; // Drop/Inv Model
class8.anInt165 = 13039; // Male Wield Model
class8.anInt200 = 13040; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1300; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = -1; // Position in inv, increase to move right
class8.anInt194 = 7; // Position in inv, increase to move up						
class8.aString170 = "Vesta's chainbody"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
	  
	if(i == 3926)
{
class8.aString170 = "Gnome scarf";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12518;//drop
class8.anInt165 = 12519;//male
class8.anInt188 = -1;//arms
//class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;//pos
class8.anInt181 = 919;//zooom
//class8.anInt155 = 1000;
class8.anInt200 = 12520;//female
class8.anInt164 = -1; //arms
class8.anInt169 = -7;//pos
//class8.anInt204 = 0;
class8.anInt194 = 8;//pos
//class8.anInt179 = 9471;
class8.anInt190 = 595;//pos
class8.aByteArray178 = "It's a Gnome scarf.".getBytes();
}

if(i == 3928)
{
class8.aString170 = "Black mask";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12521;//15615;
class8.anInt165 = 12522;//15935;
class8.anInt188 = -1;
//class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 1892;
class8.anInt181 = 854;
//class8.anInt155 = 3000;
class8.anInt200 = 12523;//15946;
class8.anInt164 = -1;
class8.anInt169 = -1;
//class8.anInt204 = 0;
class8.anInt194 = 3;
//class8.anInt179 = 8922;
class8.anInt190 = 387;
class8.aByteArray178 = "It's a Black mask.".getBytes();
}
if(i == 3930)
{
class8.aString170 = "Amulet of magic(t)";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[2];
class8.anIntArray156 = new int[2];
class8.anIntArray160[0] = 127;
class8.anIntArray156[0] = 5916;
class8.anIntArray160[1] = 127;
class8.anIntArray156[1] = 4882;
class8.anInt174 = 12527;//20225;
class8.anInt165 = 12528;//20148;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 90;
class8.anInt181 = 400;
class8.anInt155 = 900;
class8.anInt200 = 12529;//20204;
class8.anInt164 = -1;
class8.anInt169 = 4;
class8.anInt204 = 111;
class8.anInt194 = 100;
class8.anInt179 = 10367;
class8.anInt190 = 284;
class8.aByteArray178 = "It's an Amulet of magic(t).".getBytes();

}
if(i == 3932)
{
class8.aString170 = "Strength amulet(t)";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[2];
class8.anIntArray156 = new int[2];
class8.anIntArray160[0] = 127;
class8.anIntArray156[0] = 5916;
class8.anIntArray160[1] = 127;
class8.anIntArray156[1] = 4882;
class8.anInt174 = 12530;//20226;
class8.anInt165 = 12531;//20149;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 74;
class8.anInt181 = 465;
class8.anInt155 = 2025;
class8.anInt200 = 12532;//20205;
class8.anInt164 = -1;
class8.anInt169 = 5;
class8.anInt204 = 0;
class8.anInt194 = 100;
class8.anInt179 = 10365;
class8.anInt190 = 292;
class8.aByteArray178 = "It's a Strength amulet(t).".getBytes();
}
if(i == 3934)
{
class8.aString170 = "Amulet of glory(t)";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[3] = "Rub";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[2];
class8.anIntArray156 = new int[2];
class8.anIntArray160[0] = 127;
class8.anIntArray156[0] = 5916;
class8.anIntArray160[1] = 127;
class8.anIntArray156[1] = 4882;
class8.anInt174 = 12524;//20219;
class8.anInt165 = 12525;//20147;
class8.anInt188 = -1;
//class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 73;
class8.anInt181 = 415;
//class8.anInt155 = 17625;
class8.anInt200 = 12526;//20203;
class8.anInt164 = -1;
class8.anInt169 = 4;
class8.anInt204 = 69;
class8.anInt194 = 100;
//class8.anInt179 = -1;
class8.anInt190 = 282;
class8.aByteArray178 = "It's an Amulet of glory(t).".getBytes();
}
if(i == 13011) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13035; // Drop/Inv Model
class8.anInt165 = 13036; // Male Wield Model
class8.anInt200 = 13037; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1640; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = 0; // Position in inv, increase to move right
class8.anInt194 = 8; // Position in inv, increase to move up						
class8.aString170 = "Vesta's plateskirt"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13010) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13032; // Drop/Inv Model
class8.anInt165 = 13033; // Male Wield Model
class8.anInt200 = 13034; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1750; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = 0; // Position in inv, increase to move right
class8.anInt194 = 6; // Position in inv, increase to move up						
class8.aString170 = "Morrigan's leather chaps"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13009) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13029; // Drop/Inv Model
class8.anInt165 = 13030; // Male Wield Model
class8.anInt200 = 13031; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1300; // Zoom - Increase to make inv model smaller
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
class8.anInt169 = 2; // Position in inv, increase to move right
class8.anInt194 = 9; // Position in inv, increase to move up						
class8.aString170 = "Morrigan's leather body"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13008) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13026; // Drop/Inv Model
class8.anInt165 = 13027; // Male Wield Model
class8.anInt200 = 13028; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 1300; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
	class8.anInt169 = 0; // Position in inv, increase to move right
	class8.anInt194 = 0; // Position in inv, increase to move up						
class8.aString170 = "Statius's Platebody"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13007) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13023; // Drop/Inv Model
class8.anInt165 = 13024; // Male Wield Model
class8.anInt200 = 13025; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 1600; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 0; // Rotate right/left - Increase to rotate right
	class8.anInt169 = 0; // Position in inv, increase to move right
	class8.anInt194 = -2; // Position in inv, increase to move up						
class8.aString170 = "Statius's PlateLegs"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13006) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13020; // Drop/Inv Model
class8.anInt165 = 13021; // Male Wield Model
class8.anInt200 = 13022; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Corrupted Dragon Helm"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13005) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13017; // Drop/Inv Model
class8.anInt165 = 13018; // Male Wield Model
class8.anInt200 = 13019; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Corrupted Dragon Platelegs"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13004) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13016; // Drop/Inv Model
class8.anInt165 = 13014; // Male Wield Model
class8.anInt200 = 13013; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Corrupted Dragon Chainbody"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13003) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13009; // Drop/Inv Model
class8.anInt165 = 13008; // Male Wield Model
class8.anInt200 = 13007; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Corrupted Dragon Skirt"; // Item Name
class8.aByteArray178 = "New PvP Armor".getBytes(); // Item Examine
      }
if(i == 13002) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13004; // Drop/Inv Model
class8.anInt165 = 13004; // Male Wield Model
class8.anInt200 = 13004; // Female Wield
class8.anInt188 = 13005; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = 13005; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Elite Body"; // Item Name
class8.aByteArray178 = "It's Elite".getBytes(); // Item Examine
      }
if(i == 13001) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13002; // Drop/Inv Model
class8.anInt165 = 13002; // Male Wield Model
class8.anInt200 = 13002; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Elite Platelegs"; // Item Name
class8.aByteArray178 = "It's elite".getBytes(); // Item Examine
      }
if(i == 13000) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 13003; // Drop/Inv Model
class8.anInt165 = 12999; // Male Wield Model
class8.anInt200 = 12999; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Elite Helm"; // Item Name
class8.aByteArray178 = "It's elite".getBytes(); // Item Examine
      }

    if (i == 14521)
    {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Equip";
class8.anInt174 = 11111;
class8.anInt165 = 11111;
class8.anInt200 = 11111;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 400;
class8.anInt190 = 498;
class8.anInt198 = 1300;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.aString170 = "Dragon Cape";
class8.aByteArray178 = "A Cape Designed Like a Dragon.".getBytes();
    }
if(i == 7738){
            class8.aString170 = "Marijuana";
            class8.aByteArray178 = "You grew it yourself.".getBytes();
        }
if(i == 5318){
            class8.aString170 = "Marijuana Seeds";
            class8.aByteArray178 = "Plant these in a farming patch.".getBytes();
        }
/*if(i == 1856){
            class8.aString170 = "Hannoj's Guide to Noobscape";
            class8.aByteArray178 = "Your best friend - Written by Hannoj.".getBytes();
        }*/
/*if(i == 592){
            class8.aString170 = "Cocain";
            class8.aByteArray178 = "Gets you high Use it on stoner pedestal.".getBytes();
        }*/
if(i == 6971){
            class8.aString170 = "Cocain 1KG";
            class8.aByteArray178 = "Crush it with mortar and pestle.".getBytes();
        }
if(i == 6973){
            class8.aString170 = "Cocain 2KG";
            class8.aByteArray178 = "Crush it with mortar and pestle.".getBytes();
        }
if(i == 6975){
            class8.aString170 = "Cocain 5KG";
            class8.aByteArray178 = "Crush it with mortar and pestle.".getBytes();
        }
if(i == 6977){
            class8.aString170 = "Cocain 10KG";
            class8.aByteArray178 = "Crush it with mortar and pestle.".getBytes();
        }
if(i == 14517)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 14117; // Drop/Inv Model
class8.anInt165 = 14115; // Male Wield Model
class8.anInt200 = 14115; // Female Wield
class8.anInt188 = 14116; // Male arms/sleeves (Leave as -1 if not used) and also the models come different with sleeves so i might have to redo it
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.anInt181 = 1550;
class8.anInt190 = 459; 
class8.anInt198 = 0;
class8.anInt169 = 1; 
class8.anInt194 = 10; 
class8.aString170 = "Dagon'hai robe top"; // Item Name
class8.aByteArray178 = "A robe worn by members of the Dagon'hai.".getBytes();
}
        if(i == 14518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 14119;
            class8.anInt181 = 1200;//
            class8.anInt190 = 50;
            class8.anInt198 = 156;//1883;
            class8.anInt169 = 10;
            class8.anInt194 = -10;//
            class8.anInt165 = 14118;
            class8.anInt200 = 14118;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Dagon'hai hat";
            class8.aByteArray178 = "A hat worn by members of the Dagon'hai.".getBytes();
        }
        if(i == 14519)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anInt174 = 14121;
			class8.anInt181 = 2350;
			class8.anInt190 = 543;
			class8.anInt198 = 0;
			class8.anInt169 = 0;
			class8.anInt194 = 13;
            class8.anInt165 = 14120;
            class8.anInt200 = 14120;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Dagon'hai robe bottom";
            class8.aByteArray178 = "A robe worn by members of the Dagon'hai.".getBytes();
        }
		
        /*if(i == 7096)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 12505;
class8.anInt181 = 2020;
class8.anInt190 = 460;
class8.anInt198 = 1004;
class8.anInt204 = 0;
class8.anInt169 = 2;
class8.anInt194 = 15;
class8.anInt165 = 12504;
class8.anInt200 = 12504;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt166 = 63;
class8.anInt173 = 120;
class8.aString170 = "Willow Comp' Bow";
class8.aByteArray178 = "It's a Willow Composite Bow".getBytes();
        }*/
if(i == 7096)
{
class8.aString170 = "Willow comp bow";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 12505;
class8.anInt165 = 12504;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 39;
class8.anInt181 = 2070;
class8.anInt155 = 300;
class8.anInt200 = 12504;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 10281;
class8.anInt190 = 355;
class8.aByteArray178 = "It's a Willow comp bow.".getBytes();
}
if(i == 3936)
{
class8.aString170 = "Yew comp bow";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[5];
class8.anIntArray156 = new int[5];
class8.anIntArray160[0] = 6457;
class8.anIntArray156[0] = 6674;
class8.anIntArray160[1] = 6577;
class8.anIntArray156[1] = 5648;
class8.anIntArray160[2] = 6697;
class8.anIntArray156[2] = 7050;
class8.anIntArray160[3] = 6461;
class8.anIntArray156[3] = 6550;
class8.anIntArray160[4] = 6470;
class8.anIntArray156[4] = 6554;
class8.anInt174 = 12505;
class8.anInt165 = 12504;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 39;
class8.anInt181 = 2070;
class8.anInt155 = 1800;
class8.anInt200 = 12504;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 10283;
class8.anInt190 = 355;
class8.aByteArray178 = "It's a Yew comp bow.".getBytes();
}
if(i == 3938)
{
class8.aString170 = "Magic comp bow";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[5];
class8.anIntArray156 = new int[5];
class8.anIntArray160[0] = -30547;
class8.anIntArray156[0] = 6674;
class8.anIntArray160[1] = -30555;
class8.anIntArray156[1] = 5648;
class8.anIntArray160[2] = -30436;
class8.anIntArray156[2] = 7050;
class8.anIntArray160[3] = -30543;
class8.anIntArray156[3] = 6550;
class8.anIntArray160[4] = -30535;
class8.anIntArray156[4] = 6554;
class8.anInt174 = 12505;
class8.anInt165 = 12504;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 39;
class8.anInt181 = 2070;
class8.anInt155 = 2500;
class8.anInt200 = 12504;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt179 = 10285;
class8.anInt190 = 355;
class8.aByteArray178 = "It's a Magic comp bow.".getBytes();
}
		if(i == 2520)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = -22464;
class8.anIntArray160[0] = 4550;
class8.anInt174 = 7215;
class8.anInt181 = 919;
class8.anInt190 = 459;
class8.anInt204 = 138;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7218;
class8.anInt188 = 7217;
class8.anInt200 = 7219;
class8.anInt164 = 7220;
class8.anInt166 = 63;
class8.anInt173 = 120;
class8.aString170 = "Void Knight Top";
class8.aByteArray178 = "It's a Void Knight Top".getBytes();
        }
if(i == 2202)
        {
class8.aString170 = "Dragonic visage";
class8.aByteArray178 = "With 75 smithing I can turn this into a Dragonfire Shield".getBytes();
class8.anInt174 = 2647;
class8.anInt181 = 1670;
class8.anInt190 = 336;
class8.anInt198 = 64;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = 37;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;

        }
        if(i == 3101)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 38676;
class8.anIntArray160[0] = 38313;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Rune defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
if(i == 1700)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anInt174 = 8889;//item look
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 8888;
class8.anInt200 = 8888;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Bandos War Spear";
class8.aByteArray178 = "A massive, powerful spear used in war.".getBytes();
}
if(i == 13642)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14057; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 750; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 1; // model offset increase to move to the right
class8.anInt194 = -1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14058;//male wearing
class8.anInt200 = 14058;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Statius's full helm";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}if(i == 13643)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14059; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1300; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;//28
class8.anInt165 = 13999;//male wearing
class8.anInt200 = 13999;//female wearing
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Statius's warhammer";//Name of the new item
class8.aByteArray178 = "Hellpkz made it nice!!  =P.".getBytes();//examin info
}
if(i == 13644)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14061; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1900;
class8.anInt190 = 552;
class8.anInt198 = 28;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt204 = 28;
class8.anInt165 = 14062;//male wearing
class8.anInt200 = 14062;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Vesta's longsword";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13645)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14063; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 2000;
class8.anInt190 = 552;
class8.anInt198 = 28;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt204 = 28;
class8.anInt165 = 14064;//male wearing
class8.anInt200 = 14064;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Vesta's spear";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13646)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14065; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 750; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14066;//male wearing
class8.anInt200 = 14066;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Zuriel's hood";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13647)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14067; //
class8.aBoolean176 = false;//Stackable
//class8.anInt181 = 1600; //zoom increase will make it smaller
//class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
//class8.anInt198 = 129; //model rotate side ways increase to move right in circle
//class8.anInt169 = -1; // model offset increase to move to the right
//class8.anInt194 = 1; //model offset increase to move up
class8.anInt181 = 2000;
class8.anInt190 = 552;
class8.anInt198 = 28;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt204 = 0;//28;
class8.anInt165 = 14068;//male wearing
class8.anInt200 = 14068;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Zuriel's staff";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13648)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14069; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 650; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 8; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14070;//male wearing
class8.anInt200 = 14070;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Morrigan's coif";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13649)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14071; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 2000;
class8.anInt190 = 552;
class8.anInt198 = 28;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt204 = 28;
class8.anInt165 = 14072;//male wearing
class8.anInt200 = 14072;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Morrigan's javelin";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13650)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14073; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1000;
class8.anInt190 = 552;
class8.anInt198 = 28;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt204 = 28;
class8.anInt165 = 14074;//male wearing
class8.anInt200 = 14074;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Morrigan's throwing axe";//Name of the new item
class8.aByteArray178 = "A reward from PKing.".getBytes();//examin info
}
if(i == 13654)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[9];
class8.anIntArray160 = new int[9];
class8.anIntArray156[0] = 10266;
class8.anIntArray160[0] = 925;
class8.anIntArray156[1] = 10275;
class8.anIntArray160[1] = 925;
class8.anIntArray156[2] = 10291;
class8.anIntArray160[2] = 924;
class8.anIntArray156[3] = 10283;
class8.anIntArray160[3] = 924;
class8.anIntArray156[4] = 4550;
class8.anIntArray160[4] = 925;
class8.anIntArray156[5] = 10287;
class8.anIntArray160[5] = 924;
class8.anIntArray156[6] = 8375;
class8.anIntArray160[6] = 80;
class8.anIntArray156[7] = 8384;
class8.anIntArray160[7] = 75;
class8.anIntArray156[8] = 8367;
class8.anIntArray160[8] = 70;
class8.anInt174 = 14081; //Model ID // 20233
class8.anInt181 = 1330; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 302; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 14079;//male wearing //
class8.anInt200 = 14079;//female wearing //
class8.anInt164 = 14080;//Female arms/sleeves //
class8.anInt188 = 14080;//male arms/sleeves //
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Dragon platebody";//Name of the new item
class8.aByteArray178 = "An ancient Platebody -SilentCJ- (DO NOT DELETE THIS NAME, OR I'll FLAME!)".getBytes();//examin info
}
if(i == 8004)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 804; //Model ID
class8.anInt181 = 2128;//Model Zoom
class8.anInt190 = 591;//Model Rotation
class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
class8.anInt204 = 138;//Unknown
class8.anInt199 = -1;//noteable
class8.anInt169 = 8;// model offset increase to move to the right
class8.anInt194 = 11;//model offset increase to move up
class8.anInt165 = 805;//male wearing
class8.anInt200 = 805;//female wearing
class8.anInt175 = -1;//Unknown
class8.aBoolean176 = false;//Stackable//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Dragon Bow";//Name of the new item
class8.aByteArray178 = "A bow crafted from dragon scales and dragon fire.".getBytes();//examin info
}
 if(i == 1889)
		        {
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.anIntArray156 = new int[1];
		class8.anIntArray160 = new int[1];
		class8.anIntArray156[0] = 0;
		class8.anIntArray160[0] = 0;
		class8.anInt174 = 2437;
		class8.anInt181 = 1957;
		class8.anInt190 = 498;
		class8.anInt198 = 484;
		class8.anInt204 = 0;
		class8.anInt169 = -1;
		class8.anInt194 = -1;
		class8.anInt165 = 2465;
		class8.anInt200 = 2465;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.aString170 = "Bandos warspear";
		class8.aByteArray178 = "Awesome warspear used by the warriors of bandos".getBytes();
		        }





     if(i == 8100)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 22457;
class8.anIntArray160[0] = 924;
class8.anInt174 = 4200;
class8.anInt181 = 2151;
class8.anInt190 = 636;
class8.anInt198 = 1521;
class8.anInt204 = 144;
class8.anInt169 = 3;
class8.anInt194 = 3;
class8.anInt165 = 4204;
class8.anInt200 = 4204;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Saradomin sword";
class8.aByteArray178 = "A powerful sword brought to you by the gods".getBytes();
        }
        if(i == 2518)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 7227;
class8.anInt181 = 919;
class8.anInt190 = 429;
class8.anInt204 = 318;
class8.anInt169 = 1;
class8.anInt194 = 5;
class8.anInt165 = 230;
class8.anInt188 = 7242;
class8.anInt200 = 403;
class8.anInt164 = 7241;
class8.anInt175 = 63;
class8.anInt166 = 7243;
class8.anInt197 = 120;
class8.anInt173 = 7243;
class8.aString170 = "Void Mage Helm";
class8.aByteArray178 = "A void knight magic helmet.".getBytes();
        }
        if(i == 2524)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 7228;
class8.anInt181 = 620;
class8.anInt190 = 88;
class8.anInt204 = 318;
class8.anInt169 = 1;
class8.anInt194 = -1;
class8.anInt165 = 230;
class8.anInt188 = 7229;
class8.anInt200 = 403;
class8.anInt164 = 7230;
class8.anInt175 = 63;
class8.anInt166 = 3624;
class8.anInt197 = 120;
class8.anInt173 = 3624;
class8.aString170 = "Void Ranger Helm";
class8.aByteArray178 = "A void knight ranger helmet".getBytes();
        }
        if(i == 2526)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 7231;
class8.anInt181 = 620;
class8.anInt190 = 88;
class8.anInt204 = 318;
class8.anInt169 = 3;
class8.anInt194 = -1;
class8.anInt165 = 230;
class8.anInt188 = 7232;
class8.anInt200 = 403;
class8.anInt164 = 7233;
class8.anInt175 = 63;
class8.anInt166 = 7234;
class8.anInt197 = 120;
class8.anInt173 = 7234;
class8.aString170 = "Void Melee Helm";
class8.aByteArray178 = "A Void knight melee helmet.".getBytes();
        }
        if(i == 2522)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = -22464;
class8.anIntArray160[0] = 4550;
class8.anInt174 = 7214;
class8.anInt181 = 2022;
class8.anInt190 = 408;
class8.anInt204 = 1979;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7221;
class8.anInt200 = 7223;
class8.anInt166 = 63;
class8.anInt173 = 120;
class8.aString170 = "Void Knight Bottom";
class8.aByteArray178 = "It's a Void Knight Bottom".getBytes();
        }

        if(i == 8124)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 14565;
class8.anInt181 = 1178;
class8.anInt190 = 498;
class8.anInt198 = 1840;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt165 = 14561;
class8.anInt200 = 14561;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl Helm";
class8.aByteArray178 = "The Armadyl Helm".getBytes();
        }
        if(i == 8120)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 4689;
class8.anInt181 = 900;
class8.anInt190 = 540;
class8.anInt198 = 2039;
class8.anInt199 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4690;
class8.anInt200 = 4691;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = 4693;
class8.anInt188 = 4692;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl chestplate";
class8.aByteArray178 = "Its A Armadyl Chestplate".getBytes();
        }
        if(i == 8123)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 4694;
class8.anInt181 = 1600;
class8.anInt190 = 510;
class8.anInt198 = 0;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4695;
class8.anInt200 = 4696;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl plateskirt";
class8.aByteArray178 = "Its A Armadyl plateskirt".getBytes();
        }
        if(i == 3096)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 33;
class8.anIntArray160[0] = 33;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Iron defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
        if(i == 3097)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 43072;
class8.anIntArray160[0] = 43072;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Steel defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
        if(i == 3098)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 8;
class8.anIntArray160[0] = 8;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Black defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
        if(i == 3099)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 43297;
class8.anIntArray160[0] = 43297;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Mithril defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
        if(i == 3100)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 21662;
class8.anIntArray160[0] = 21662;
class8.anInt174 = 4671;
class8.anInt181 = 490;
class8.anInt190 = 344;
class8.anInt198 = 192;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 1;
class8.anInt194 = 20;
class8.anInt165 = 4672;
class8.anInt200 = 4672;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Adamant defender";
class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
        if(i == 553)
        {
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7995;
class8.anIntArray160[0] = 0x1763a;
class8.anInt174 = 7995;
class8.anInt181 = 740;
class8.anInt190 = 528;
class8.anInt198 = 1012;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt204 = 0;
class8.anInt165 = 7995;
class8.anInt200 = 7995;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Astral rune";
class8.aByteArray178 = "Used for Lunar spells.".getBytes();
        }
        if(i == 837)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 10082;
class8.anInt181 = 926;
class8.anInt190 = 432;
class8.anInt198 = 258;
class8.anInt204 = 83;
class8.anInt169 = 3;
class8.anInt194 = 3;
class8.anInt165 = 10083;
class8.anInt200 = 10083;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Rune c'bow";
class8.aByteArray178 = "It's powerfull for rune.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray156[0] = 5656;
class8.anIntArray160 = new int[1];
class8.anIntArray160[0] = 36133;
        }
        if(i == 879)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 10084;
class8.anInt181 = 720;
class8.anInt190 = 477;
class8.anInt198 = 117;
class8.anInt204 = 1860;
class8.anInt169 = 3;
class8.anInt194 = 5;
class8.anInt165 = 548;
class8.anInt200 = 548;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Black bolts";
class8.aByteArray178 = "These are used for c'bows.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray156[0] = 5656;
class8.anIntArray160 = new int[1];
class8.anIntArray160[0] = 0;
        }
        if(i == 8032)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 13039;
class8.anInt181 = 1000;
class8.anInt169 = -5;
class8.anInt194 = 2;
class8.anInt190 = 321;
class8.anInt198 = 24;
class8.anInt197 = -1;
class8.anInt164 = -1;
class8.anInt165 = 13040;
class8.anInt200 = 13040;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Barrelchest Anchor";
class8.aByteArray178 = "This is likely to put my back out..".getBytes();
        }
        if(i == 880)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 10084;
class8.anInt181 = 720;
class8.anInt190 = 477;
class8.anInt198 = 117;
class8.anInt204 = 1860;
class8.anInt169 = 3;
class8.anInt194 = 5;
class8.anInt165 = 548;
class8.anInt200 = 548;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Adamant bolts";
class8.aByteArray178 = "These are used for c'bows.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray156[0] = 5656;
class8.anIntArray160 = new int[1];
class8.anIntArray160[0] = 21662;
        }
        if(i == 881)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 10084;
class8.anInt181 = 720;
class8.anInt190 = 477;
class8.anInt198 = 117;
class8.anInt204 = 1860;
class8.anInt169 = 3;
class8.anInt194 = 5;
class8.anInt165 = 548;
class8.anInt200 = 548;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Rune bolts";
class8.aByteArray178 = "These are used for c'bows.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray156[0] = 5656;
class8.anIntArray160 = new int[1];
class8.anIntArray160[0] = 36133;
        }
        if(i == 4153)
        {
class8.anInt181 = 2000;
        }
        if(i == 7899)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9631;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
        }
if(i == 7778)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
            class8.anInt174 = 13048;
            class8.anInt181 = 2000;
            class8.anInt190 = 500;
            class8.anInt198 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = 1;
            class8.anInt204 = 14;
            class8.anInt165 = 14000;
            class8.anInt200 = 14000;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;
            class8.aString170 = "Death Cape";
            class8.aByteArray178 = "The cape worn by masters of PKing. -Master Monk- ".getBytes();
        }

        if(i == 6570)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Fire Cape";
class8.aByteArray178 = "A cape of fire.".getBytes();
        }
        if(i == 2621)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 7;
class8.anInt181 = 1670;
class8.anInt190 = 336;
class8.anInt198 = 64;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = 37;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 6;
class8.anInt200 = 6;
class8.aString170 = "Dragon fire shield";
class8.aByteArray178 = "A heavy shield with a snarling, draconic visage.".getBytes();
        }
        if(i == 4363)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 54503;
class8.anIntArray156[1] = 57280;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[0] = 8128;
class8.anIntArray160[1] = 9126;
class8.anIntArray160[2] = 8128;
class8.anInt174 = 7022;
class8.anInt181 = 2000;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7021;
class8.anInt200 = 7021;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Summoning Cape(t)";
class8.aByteArray178 = "The cape worn by masters of Summoning.".getBytes();
        }
        if(i == 2677)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[5];
class8.anIntArray160 = new int[5];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 923;
class8.anIntArray160[1] = 920;
class8.anIntArray160[2] = 920;
class8.anIntArray160[3] = 923;
class8.anInt174 = 4158;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt204 = 14;
class8.anInt165 = 4181;
class8.anInt200 = 7178;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Attack cape";
class8.aByteArray178 = "The cape worn by masters of Attack.".getBytes();
        }
        if(i == 4319)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4158;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4181;
class8.anInt200 = 7178;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Attack cape(t)";
class8.aByteArray178 = "The cape worn by masters of Attack.".getBytes();
        }
        if(i == 2679)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray160[0] = 912;
class8.anIntArray156[1] = 22464;
class8.anIntArray160[1] = 912;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[2] = 912;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Attack hood";
class8.aByteArray178 = "Attack skillcape hood.".getBytes();
        }
        if(i == 2680)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 27549;
class8.anIntArray160[1] = 27544;
class8.anIntArray160[2] = 27544;
class8.anIntArray160[3] = 27549;
class8.anInt174 = 4177;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt204 = 14;
class8.anInt165 = 4199;
class8.anInt200 = 7197;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Strength cape";
class8.aByteArray178 = "The cape worn by only the strongest people.".getBytes();
        }
        if(i == 4359)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 940;
class8.anIntArray160[1] = 930;
class8.anIntArray160[2] = 930;
class8.anIntArray160[3] = 940;
class8.anInt174 = 4177;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 0;
class8.anInt165 = 4199;
class8.anInt200 = 7197;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "strength cape(t)";
class8.aByteArray178 = "The cape worn by only the strongest people.".getBytes();
        }
        if(i == 2682)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 27544;
class8.anIntArray160[1] = 27544;
class8.anIntArray160[2] = 27544;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Strength hood";
class8.aByteArray178 = "Strength skillcape hood.".getBytes();
        }
        if(i == 2683)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 41436;
class8.anIntArray160[1] = 41416;
class8.anIntArray160[2] = 41416;
class8.anIntArray160[3] = 41436;
class8.anInt174 = 4162;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4184;
class8.anInt200 = 7182;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Defence cape";
class8.aByteArray178 = "The cape worn by masters of the art of Defence.".getBytes();
        }
        if(i == 748){
class8.aStringArray189[0] = "Promote";
class8.aString170 = "Donator Ticket";
class8.aByteArray178 = "Promote to the Donator rank!".getBytes();

}
if(i == 3869)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = 664;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = 962;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = 910;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = 652;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = 962;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = 1697;
class8.anInt174 = 10095;
class8.anInt169 = 0;
class8.anInt181 = 1100;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt194 = 0;
class8.anInt204 = 0;
class8.anInt165 = 10096;
class8.anInt200 = 10097;
class8.anInt164 = 10099;
class8.anInt188 = 10098;
class8.aBoolean176 = false;
class8.aString170 = "Zamorak d'hide";
class8.aByteArray178 = "Zamorak blessed dragonhide chest.".getBytes();
        }
        if(i == 3870)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = 664;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = 962;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = 910;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = 652;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = 962;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = 1697;
class8.anInt174 = 10092;
class8.anInt181 = 1750;
class8.anInt169 = 0;
class8.anInt190 = 488;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt188 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10093;
class8.anInt200 = 10094;
class8.aString170 = "Zamorak chaps";
class8.aByteArray178 = "Zamorak blessed dragonhide chaps.".getBytes();
        }
        if(i == 3871)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = 664;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = 962;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = 910;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = 652;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = 962;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = 1697;
class8.anInt174 = 12501;
class8.anInt181 = 789;
class8.anInt190 = 194;
class8.anInt204 = 0;
class8.anInt198 = 1784;
class8.anInt169 = -1;
class8.anInt194 = -10;
class8.anInt188 = -1;
class8.anInt165 = 10090;
class8.anInt200 = 10091;
class8.aBoolean176 = false;
class8.aString170 = "Zamorak coif";
class8.aByteArray178 = "Zamorak blessed dragonhide coif.".getBytes();
       }
       if(i == 13665)  // change this if you need to "item number"
       {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 43072;
class8.anIntArray160[0] = 925;
class8.anIntArray156[1] = 4550;
class8.anIntArray160[1] = 925;
class8.anInt174 = 14104; //Model ID
class8.anInt181 = 1330; //zoom increase will make it smaller
class8.anInt190 = 310; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1800; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 14105;//male wearing
class8.anInt200 = 14105;//female wearing
class8.anInt164 = 14106;//Female arms/sleeves
class8.anInt188 = 14106;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Dragon platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
         }
if(i == 14498)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 5169;
            class8.anIntArray160[0] = 3988;
            class8.anIntArray156[1] = 7343;
            class8.anIntArray160[1] = 3988;
            class8.anIntArray156[2] = 7335;
            class8.anIntArray160[2] = 3982;
            class8.anIntArray156[3] = 7339;
            class8.anIntArray160[3] = 3986;
            class8.anIntArray156[4] = 7343;
            class8.anIntArray160[4] = 5014;
            class8.anIntArray156[5] = 5165;
            class8.anIntArray160[5] = 3988;
            class8.anInt174 = 10133;
            class8.anInt181 = 1000;
            class8.anInt190 = 284;
            class8.anInt198 = 1800;
            class8.anInt204 = 69;
            class8.aBoolean161 = true;
            class8.anInt169 = 1;
            class8.anInt194 = 27;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt165 = 10134;
            class8.anInt200 = 10134;
            class8.aBoolean176 = true;
            class8.aString170 = "Red chinchompa";
            class8.aByteArray178 = "It explodes.".getBytes();
        }
         if(i == 8002)
         {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.aString170 = "Dragon claws";
class8.aByteArray178 = "A set of fighting claws.".getBytes();
class8.anInt174 = 13699;
class8.anInt181 = 738;
class8.anInt190 = 245;
class8.anInt198 = 80;
class8.anInt204 = 0;
class8.anInt169 = -2;
class8.anInt194 = 3;
class8.anInt165 = 13698;
class8.anInt200 = 13698;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
        }
        if(i == 3872)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 22156;
class8.anIntArray160[0] = 664;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = 962;
class8.anIntArray156[2] = 22408;
class8.anIntArray160[2] = 904;
class8.anInt174 = 10111;
class8.anInt181 = 740;
class8.anInt190 = 196;
class8.anInt198 = 1784;
class8.anInt204 = 0;
class8.anInt169 = 7;
class8.anInt194 = -33;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10112;
class8.anInt200 = 10113;
class8.aString170 = "Zamorak vambraces";
class8.aByteArray178 = "Zamorak blessed dragonhide vambraces.".getBytes();
        }
if(i == 3873)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = -21864;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = -24772;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = -24046;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = -21876;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = -25788;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = -27983;
class8.anInt174 = 10105;
class8.anInt169 = 0;
class8.anInt181 = 1100;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt194 = 0;
class8.anInt204 = 0;
class8.anInt165 = 10106;
class8.anInt200 = 10108;
class8.anInt164 = 10107;
class8.anInt188 = 10109;
class8.aBoolean176 = false;
class8.aString170 = "Saradomin d'hide";
class8.aByteArray178 = "Saradomin blessed dragonhide chest.".getBytes();
        }
        if(i == 3874)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = -21864;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = -24772;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = -24046;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = -21876;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = -25788;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = -27983;
class8.anInt174 = 10092;
class8.anInt181 = 1750;
class8.anInt169 = 0;
class8.anInt190 = 488;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt188 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10093;
class8.anInt200 = 10094;
class8.aString170 = "Saradomin chaps";
class8.aByteArray178 = "Saradomin chaps.".getBytes();
        }
        if(i == 3875)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 22168;
class8.anIntArray160[0] = -21864;
class8.anIntArray156[1] = 8070;
class8.anIntArray160[1] = -24772;
class8.anIntArray156[2] = 24082;
class8.anIntArray160[2] = -24046;
class8.anIntArray156[3] = 22156;
class8.anIntArray160[3] = -21876;
class8.anIntArray156[4] = 920;
class8.anIntArray160[4] = -25788;
class8.anIntArray156[5] = 912;
class8.anIntArray160[5] = -27983;
class8.anInt164 = -1;
class8.anInt174 = 12502;
class8.anInt181 = 789;
class8.anInt190 = 194;
class8.anInt204 = 0;
class8.anInt198 = 1784;
class8.anInt169 = -1;
class8.anInt194 = -10;
class8.anInt188 = -1;
class8.anInt165 = 10090;
class8.anInt200 = 10091;
class8.aBoolean176 = false;
class8.aString170 = "Saradomin coif";
class8.aByteArray178 = "Saradomin coif.".getBytes();
        }
        if(i == 3876)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 22156;
class8.anIntArray160[0] = -21864;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = -24772;
class8.anIntArray156[2] = 22408;
class8.anIntArray160[2] = -21624;
class8.anInt174 = 10111;
class8.anInt181 = 740;
class8.anInt190 = 196;
class8.anInt198 = 1784;
class8.anInt204 = 0;
class8.anInt169 = 7;
class8.anInt194 = -33;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10112;
class8.anInt200 = 10113;
class8.aString170 = "Saradomin vambraces";
class8.aByteArray178 = "Saradomin blessed dragonhide vambraces.".getBytes();
        }
if(i == 3877)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 920;
class8.anIntArray160[0] = 27210;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = 24014;
class8.anIntArray156[2] = 8070;
class8.anIntArray160[2] = 19788;
class8.anInt174 = 10100;
class8.anInt169 = 0;
class8.anInt181 = 1100;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt194 = 0;
class8.anInt204 = 0;
class8.anInt165 = 10101;
class8.anInt200 = 10103;
class8.anInt164 = 10102;
class8.anInt188 = 10104;
class8.aBoolean176 = false;
class8.aString170 = "Guthix dragonhide";
class8.aByteArray178 = "Guthix blessed dragonhide chest.".getBytes();
        }
        if(i == 3878)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 920;
class8.anIntArray160[0] = 27210;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = 24014;
class8.anIntArray156[2] = 8070;
class8.anIntArray160[2] = 19788;
class8.anInt174 = 10092;
class8.anInt181 = 1750;
class8.anInt169 = 0;
class8.anInt190 = 488;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt194 = 0;
class8.anInt188 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10093;
class8.anInt200 = 10094;
class8.aString170 = "Guthix chaps";
class8.aByteArray178 = "Guthix blessed dragonhide chaps.".getBytes();
        }
        if(i == 3879)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 920;
class8.anIntArray160[0] = 27210;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = 24014;
class8.anIntArray156[2] = 8070;
class8.anIntArray160[2] = 19788;
class8.anInt174 = 12500;
class8.anInt181 = 789;
class8.anInt190 = 194;
class8.anInt204 = 0;
class8.anInt198 = 1784;
class8.anInt169 = -1;
class8.anInt194 = -10;
class8.anInt188 = -1;
class8.anInt165 = 10090;
class8.anInt200 = 10091;
class8.aBoolean176 = false;
class8.aString170 = "Guthix coif";
class8.aByteArray178 = "Guthix blessed dragonhide coif.".getBytes();
        }
        if(i == 3880)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 920;
class8.anIntArray160[0] = 27210;
class8.anIntArray156[1] = 912;
class8.anIntArray160[1] = 24014;
class8.anIntArray156[2] = 8070;
class8.anIntArray160[2] = 19788;
class8.anInt174 = 10111;
class8.anInt181 = 740;
class8.anInt190 = 196;
class8.anInt198 = 1784;
class8.anInt204 = 0;
class8.anInt169 = 7;
class8.anInt194 = -33;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 10112;
class8.anInt200 = 10113;
class8.aString170 = "Guthix vambraces";
class8.aByteArray178 = "Guthix blessed dragonhide vambraces.".getBytes();
        }
if(i == 13015){ //Bronze phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 5652;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Bronze Party Hat";
class8.aByteArray178 = "A Bronze Party Hat.".getBytes();
}
if(i == 13016){ //Mithril phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Mithril Party Hat";
class8.aByteArray178 = "A Mithril Party Hat.".getBytes();
}
if(i == 13017){ //Addy phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 21662;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Addy Party Hat";
class8.aByteArray178 = "An Addy Party Hat.".getBytes();
}
if(i == 13018){ //Dragon phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 924;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Dragon Party Hat";
class8.aByteArray178 = "A Dragon Party Hat.".getBytes();
}
if(i == 13019){ //Barrows phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 10388;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Barrows Party Hat";
class8.aByteArray178 = "A Party Hat worn by the Barrows Brothers.".getBytes();
}
if(i == 13020){ //Rune phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 36133;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Rune Party Hat";
class8.aByteArray178 = "A Rune Party Hat.".getBytes();
}
if(i == 13021){ //Iron phat
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int [1];
class8.anIntArray156[0] = 926;
class8.anIntArray160[0] = 33;
class8.anInt174 = 2635;
class8.anInt181 = 440;
class8.anInt190 = 76;
class8.anInt198 = 1850;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 1;
class8.anInt165 = 187;
class8.anInt200 = 363;
class8.anInt175 = 29;
class8.anInt197 = 87;
class8.aString170 = "Iron Party Hat";
class8.aByteArray178 = "An Iron Party Hat.".getBytes();
}

if(i == 3881)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5916;
class8.anIntArray160[0] = 127;
class8.anIntArray156[1] = -11359;
class8.anIntArray160[1] = -3504;
class8.anInt174 = 13069;
class8.anInt169 = 0;
class8.anInt181 = 480;
class8.anInt190 = 120;
class8.anInt198 = 1944;
class8.anInt194 = 4;
class8.anInt204 = 0;
class8.anInt165 = 13070;
class8.anInt200 = 13071;
class8.aBoolean176 = false;
class8.aString170 = "Granite helm";
class8.aByteArray178 = "A stone helmet. ".getBytes();
        }
if(i == 3882)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 4696;
class8.anIntArray160[0] = 4;
class8.anInt174 = 13072;
class8.anInt169 = 1;
class8.anInt181 = 1280;
class8.anInt190 = 336;
class8.anInt198 = 2016;
class8.anInt194 = 5;
class8.anInt204 = 0;
class8.anInt165 = 13073;
class8.anInt200 = 13075;
class8.anInt164 = 13074;
class8.anInt188 = 13076;
class8.aBoolean176 = false;
class8.aString170 = "Granite body";
class8.aByteArray178 = "A stone platebody ".getBytes();
        }
		if(i == 3884)
{
class8.aString170 = "Black ele' shirt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 10114;
class8.anInt165 = 10115;
class8.anInt188 = 10116;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1373;
class8.anInt155 = 2000;
class8.anInt200 = 10117;
class8.anInt164 = 10118;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 7;
class8.anInt179 = 10401;
class8.anInt190 = 452;
class8.aByteArray178 = "It's a Black ele' shirt.".getBytes();
}
if(i == 3889)
{
class8.aString170 = "Black ele' legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anInt174 = 10119;
class8.anInt165 = 10120;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1827;
class8.anInt155 = 2000;
class8.anInt200 = 20195;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = 10403;
class8.anInt190 = 444;
class8.aByteArray178 = "It's a Black ele' legs.".getBytes();
}
if(i == 3886)
{
class8.aString170 = "Red ele' shirt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = 109;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = 171;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = 293;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -1631;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -1512;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -1140;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10114;
class8.anInt165 = 10115;
class8.anInt188 = 10116;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1373;
class8.anInt155 = 2000;
class8.anInt200 = 10117;
class8.anInt164 = 10118;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 7;
class8.anInt179 = 10405;
class8.anInt190 = 452;
class8.aByteArray178 = "It's a Red ele' shirt.".getBytes();
}
if(i == 3891)
{
class8.aString170 = "Red ele' legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = 109;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = 171;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = 293;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -1631;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -1512;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -1140;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10119;
class8.anInt165 = 10120;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1827;
class8.anInt155 = 2000;
class8.anInt200 = 20195;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = 10407;
class8.anInt190 = 444;
class8.aByteArray178 = "It's a Red ele' legs.".getBytes();
}
if(i == 3885)
{
class8.aString170 = "Blue ele' shirt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = -22421;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = -22357;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = -22235;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -22111;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -19944;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -19572;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10114;
class8.anInt165 = 10115;
class8.anInt188 = 10116;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1373;
class8.anInt155 = 2000;
class8.anInt200 = 10117;
class8.anInt164 = 10118;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 7;
class8.anInt179 = 10409;
class8.anInt190 = 452;
class8.aByteArray178 = "It's a Blue ele' shirt.".getBytes();
}
if(i == 3890)
{
class8.aString170 = "Blue ele' legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = -22421;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = -22357;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = -22235;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -22111;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -19944;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -19572;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10119;
class8.anInt165 = 10120;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1827;
class8.anInt155 = 2000;
class8.anInt200 = 20195;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = 10411;
class8.anInt190 = 444;
class8.aByteArray178 = "It's a Blue ele' legs.".getBytes();
}
if(i == 3956)
{
class8.aString170 = "Green ele' shirt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = 21611;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = 21675;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = 21797;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = 21921;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = 26388;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = 22158;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10114;
class8.anInt165 = 10115;
class8.anInt188 = 10116;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1373;
class8.anInt155 = 2000;
class8.anInt200 = 10117;
class8.anInt164 = 10118;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 7;
class8.anInt179 = 10413;
class8.anInt190 = 452;
class8.aByteArray178 = "It's a Green ele' shirt.".getBytes();
}
if(i == 3958)
{
class8.aString170 = "Green ele' legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = 21611;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = 21675;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = 21797;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = 21921;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = 26388;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = 22158;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10119;
class8.anInt165 = 10120;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1827;
class8.anInt155 = 2000;
class8.anInt200 = 20195;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = 10415;
class8.anInt190 = 444;
class8.aByteArray178 = "It's a Green ele' legs.".getBytes();
}
if(i == 3887)
{
class8.aString170 = "Purple ele' shirt";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = -16157;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = -16190;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = -20297;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -20175;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -15848;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -14452;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10114;
class8.anInt165 = 10115;
class8.anInt188 = 10116;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1373;
class8.anInt155 = 2000;
class8.anInt200 = 10117;
class8.anInt164 = 10118;
class8.anInt169 = -1;
class8.anInt204 = 0;
class8.anInt194 = 7;
class8.anInt179 = 10417;
class8.anInt190 = 452;
class8.aByteArray178 = "It's a Purple ele' shirt.".getBytes();
}
if(i == 3892)
{
class8.aString170 = "Purple ele' legs";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Drop";
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160[0] = -16157;
class8.anIntArray156[0] = 105;
class8.anIntArray160[1] = -16190;
class8.anIntArray156[1] = 64;
class8.anIntArray160[2] = -20297;
class8.anIntArray156[2] = 47;
class8.anIntArray160[3] = -20175;
class8.anIntArray156[3] = 35;
class8.anIntArray160[4] = -15848;
class8.anIntArray156[4] = 26;
class8.anIntArray160[5] = -14452;
class8.anIntArray156[5] = 55172;//-10364;
class8.anInt174 = 10119;
class8.anInt165 = 10120;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 0;
class8.anInt181 = 1827;
class8.anInt155 = 2000;
class8.anInt200 = 10121;//20195;
class8.anInt164 = -1;
class8.anInt169 = 0;
class8.anInt204 = 0;
class8.anInt194 = -1;
class8.anInt179 = 10419;
class8.anInt190 = 444;
class8.aByteArray178 = "It's a Purple ele' legs.".getBytes();
}

		if (i == 993) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anInt174 = 12506; //Inv & Ground 19065
class8.anInt181 = 900; //zoom
class8.anInt190 = 498;
class8.anInt198 = 500;
class8.anInt204 = 300; //Rotate Up-Down
class8.anInt169 = 0; //Rotate Left-Right
class8.anInt194 = -4; //Up down
class8.anInt165 = 12503; //Male 18951
class8.anInt200 = 12503; //Female 18951
class8.anInt175 = 100; //left-Right move
class8.anInt197 = 100; //Up- down move
class8.aString170 = "Top Hat";
class8.aByteArray178 = "It's the Top Hat!".getBytes();
}
if(i == 7097)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anIntArray156 = new int[5];
class8.anIntArray160 = new int[5];
class8.anIntArray156[0] = 105;
class8.anIntArray160[0] = -20175;
class8.anIntArray156[1] = 64;
class8.anIntArray160[1] = -16190;
class8.anIntArray156[2] = 47;
class8.anIntArray160[2] = -20297;
class8.anIntArray156[3] = 26;
class8.anIntArray160[3] = -15848;
class8.anIntArray156[4] = -10364;
class8.anIntArray160[4] = -14452;
class8.anInt174 = 14100;
class8.anInt181 = 1827;
class8.anInt190 = 364;
class8.anInt198 = 992;
class8.anInt169 = 3;
class8.anInt194 = 12;
class8.anInt204 = 2047;
class8.anInt165 = 14101;
class8.anInt200 = 14102;
class8.aBoolean176 = false;
class8.aString170 = "Zamorak cloak";
class8.aByteArray178 = "Emblazoned with Zamorak's symbol, a curly m-shape. ".getBytes();
        }
        if(i == 4329)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 57280;
class8.anIntArray160[0] = 107;
class8.anIntArray156[1] = 54503;
class8.anIntArray160[1] = 107;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[2] = 107;
class8.anInt174 = 4162;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4184;
class8.anInt200 = 7182;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Defence cape(t)";
class8.aByteArray178 = "The cape worn by masters of the art of Defence.".getBytes();
        }
        if(i == 2685)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray160[0] = 41416;
class8.anIntArray156[1] = 22464;
class8.anIntArray160[1] = 41416;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[2] = 41416;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Defence hood";
class8.aByteArray178 = "Defence skillcape hood.".getBytes();
        }
        if(i == 2686)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 13214;
class8.anIntArray160[1] = 13214;
class8.anIntArray160[2] = 13214;
class8.anIntArray160[3] = 13214;
class8.anInt174 = 4173;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4195;
class8.anInt200 = 7193;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Ranging cape";
class8.aByteArray178 = "The cape worn by master archers.".getBytes();
        }
        if(i == 4351)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 3755;
class8.anIntArray160[1] = 4003;
class8.anIntArray160[2] = 4003;
class8.anIntArray160[3] = 3755;
class8.anInt174 = 4173;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4195;
class8.anInt200 = 7193;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Ranging cape(t)";
class8.aByteArray178 = "The cape worn by master archers.".getBytes();
        }
        if(i == 2688)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 13214;
class8.anIntArray160[1] = 13214;
class8.anIntArray160[2] = 13214;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Range hood";
class8.aByteArray178 = "Range skillcape hood.".getBytes();
        }
        if(i == 2689)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anIntArray160[3] = 107;
class8.anInt174 = 4171;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4193;
class8.anInt200 = 7191;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Prayer cape";
class8.aByteArray178 = "The cape worn by the most pious of heroes.".getBytes();
        }
        if(i == 4347)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 9172;
class8.anIntArray160[2] = 9172;
class8.anIntArray160[3] = 9152;
class8.anInt174 = 4171;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4193;
class8.anInt200 = 7191;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Prayer cape(t)";
class8.aByteArray178 = "The cape worn by the most pious of heroes.".getBytes();
        }
        if(i == 2691)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Prayer hood";
class8.aByteArray178 = "Prayer skillcape hood.".getBytes();
        }
        if(i == 2692)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6348;
class8.anIntArray160[1] = 6340;
class8.anIntArray160[2] = 6331;
class8.anIntArray160[3] = 6331;
class8.anInt174 = 4169;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4191;
class8.anInt200 = 7189;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Magic cape";
class8.aByteArray178 = "The cape worn by the most powerful mages.".getBytes();
        }
        if(i == 4343)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 43569;
class8.anIntArray160[1] = 43685;
class8.anIntArray160[2] = 43685;
class8.anIntArray160[3] = 43569;
class8.anInt174 = 4169;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4191;
class8.anInt200 = 7189;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Magic cape(t)";
class8.aByteArray178 = "The cape worn by the most powerful mages.".getBytes();
        }
        if(i == 2694)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 6348;
class8.anIntArray160[1] = 6340;
class8.anIntArray160[2] = 6331;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Magic hood";
class8.aByteArray178 = "Magic skillcape hood.".getBytes();
        }
        if(i == 2695)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 4032;
class8.anIntArray160[1] = 4027;
class8.anIntArray160[2] = 4027;
class8.anIntArray160[3] = 4032;
class8.anInt174 = 4159;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt204 = 14;
class8.anInt165 = 4186;
class8.anInt200 = 7184;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Firemaking cape";
class8.aByteArray178 = "The cape worn by the master firelighters.".getBytes();
        }
        if(i == 4321)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4159;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt204 = 14;
class8.anInt165 = 4186;
class8.anInt200 = 7184;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Firemaking cape(t)";
class8.aByteArray178 = "The cape worn by the master firelighters.".getBytes();
        }
        if(i == 2697)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 4027;
class8.anIntArray160[1] = 4027;
class8.anIntArray160[2] = 4027;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "FireMaking hood";
class8.aByteArray178 = "FireMaking skillcape hood.".getBytes();
        }
        if(i == 2698)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 90;
class8.anIntArray160[1] = 80;
class8.anIntArray160[2] = 80;
class8.anIntArray160[3] = 90;
class8.anInt174 = 4164;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4196;
class8.anInt200 = 7194;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "RuneCrafting cape";
class8.aByteArray178 = "The cape worn by master runecrafters.".getBytes();
        }
        if(i == 4333)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7080;
class8.anIntArray160[2] = 7080;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4164;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4196;
class8.anInt200 = 7194;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "RuneCrafting cape(t)";
class8.aByteArray178 = "The cape worn by master runecrafters.".getBytes();
        }
        if(i == 2700)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 99;
class8.anIntArray160[1] = 99;
class8.anIntArray160[2] = 99;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "RuneCrafting hood";
class8.aByteArray178 = "RuneCrafting skillcape hood.".getBytes();
        }
        if(i == 2701)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 75;
class8.anIntArray160[1] = 75;
class8.anIntArray160[2] = 75;
class8.anIntArray160[3] = 75;
class8.anInt174 = 4168;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4190;
class8.anInt200 = 7188;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Hitpoint cape";
class8.aByteArray178 = "The cape worn by the healthiest adventurers.".getBytes();
        }
        if(i == 4341)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 940;
class8.anIntArray160[1] = 920;
class8.anIntArray160[2] = 920;
class8.anIntArray160[3] = 940;
class8.anInt174 = 4168;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4190;
class8.anInt200 = 7188;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Hitpoint cape(t)";
class8.aByteArray178 = "The cape worn by the healthiest adventurers.".getBytes();
        }
        if(i == 2703)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 90;
class8.anIntArray160[1] = 90;
class8.anIntArray160[2] = 90;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Hitpoint hood";
class8.aByteArray178 = "Hitpoint skillcape hood.".getBytes();
        }
        if(i == 2704)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 43674;
class8.anIntArray160[1] = 43680;
class8.anIntArray160[2] = 43680;
class8.anIntArray160[3] = 43674;
class8.anInt174 = 4157;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4180;
class8.anInt200 = 7177;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Agility cape";
class8.aByteArray178 = "The cape worn by the most agile of heroes.".getBytes();
        }
        if(i == 4317)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 801;
class8.anIntArray160[1] = 677;
class8.anIntArray160[2] = 677;
class8.anIntArray160[3] = 801;
class8.anInt174 = 4157;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4180;
class8.anInt200 = 7177;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Agility cape(t)";
class8.aByteArray178 = "The cape worn by the best of agility trainers.".getBytes();
        }
        if(i == 2706)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 43674;
class8.anIntArray160[1] = 43674;
class8.anIntArray160[2] = 43674;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Agility hood";
class8.aByteArray178 = "Agility skillcape hood.".getBytes();
        }
        if(i == 2707)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22426;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anIntArray160[3] = 22426;
class8.anInt174 = 4167;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4189;
class8.anInt200 = 7187;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Herblore cape";
class8.aByteArray178 = "The cape worn by master herbalists.".getBytes();
        }
        if(i == 4339)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4167;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4189;
class8.anInt200 = 7187;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Herblore cape(t)";
class8.aByteArray178 = "The cape worn by master herbalists.".getBytes();
        }
        if(i == 2709)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22416;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Herblore hood";
class8.aByteArray178 = "Herblore skillcape hood.".getBytes();
        }
        if(i == 2710)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 58795;
class8.anIntArray160[1] = 58785;
class8.anIntArray160[2] = 58785;
class8.anIntArray160[3] = 58795;
class8.anInt174 = 4178;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4201;
class8.anInt200 = 7198;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Thieving cape";
class8.aByteArray178 = "The cape worn by the best of thieves.".getBytes();
        }
        if(i == 4361)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 15;
class8.anIntArray160[1] = 0;
class8.anIntArray160[2] = 0;
class8.anIntArray160[3] = 15;
class8.anInt174 = 4178;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4201;
class8.anInt200 = 7198;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Thieving cape(t)";
class8.aByteArray178 = "The cape worn by the best of thieves.".getBytes();
        }
        if(i == 2712)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 58785;
class8.anIntArray160[1] = 58785;
class8.anIntArray160[2] = 58785;
class8.anInt174 = 4203;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Thieving hood";
class8.aByteArray178 = "Thieving skillcape hood.".getBytes();
        }
        if(i == 2713)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 4520;
class8.anIntArray160[1] = 4510;
class8.anIntArray160[2] = 4510;
class8.anIntArray160[3] = 4520;
class8.anInt174 = 4161;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4183;
class8.anInt200 = 7181;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Crafting cape";
class8.aByteArray178 = "The cape worn by master craftworkers.".getBytes();
        }
        if(i == 4327)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4161;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4183;
class8.anInt200 = 7181;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Crafting cape(t)";
class8.aByteArray178 = "The cape worn by master craftworkers.".getBytes();
        }
        if(i == 2715)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 4520;
class8.anIntArray160[1] = 4520;
class8.anIntArray160[2] = 4520;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Crafting hood";
class8.aByteArray178 = "Crafting skillcape hood.".getBytes();
        }
        if(i == 2716)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 33682;
class8.anIntArray160[1] = 33676;
class8.anIntArray160[2] = 33676;
class8.anIntArray160[3] = 33682;
class8.anInt174 = 4166;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4188;
class8.anInt200 = 7186;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Fletching cape";
class8.aByteArray178 = "The cape worn by the best of fletchers.".getBytes();
        }
        if(i == 4337)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4166;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4188;
class8.anInt200 = 7186;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Fletching cape(t)";
class8.aByteArray178 = "The cape worn by the best of fletchers.".getBytes();
        }
        if(i == 2718)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 33676;
class8.anIntArray160[1] = 33676;
class8.anIntArray160[2] = 33676;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Fletching hood";
class8.aByteArray178 = "Fletching skillcape hood.".getBytes();
        }
        if(i == 2719)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 8;
class8.anIntArray160[1] = 8;
class8.anIntArray160[2] = 8;
class8.anIntArray160[3] = 8;
class8.anInt174 = 4175;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4197;
class8.anInt200 = 7195;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Slayer cape";
class8.aByteArray178 = "The cape worn by Slayer masters.".getBytes();
        }
        if(i == 4355)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 920;
class8.anIntArray160[1] = 916;
class8.anIntArray160[2] = 916;
class8.anIntArray160[3] = 920;
class8.anInt174 = 4175;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4197;
class8.anInt200 = 7195;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Slayer cape(t)";
class8.aByteArray178 = "The cape worn by Slayer masters.".getBytes();
        }
        if(i == 2721)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 8;
class8.anIntArray160[1] = 8;
class8.anIntArray160[2] = 8;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Slayer hood";
class8.aByteArray178 = "Slayer skillcape hood.".getBytes();
        }
        if(i == 2722)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 10530;
class8.anIntArray160[1] = 10520;
class8.anIntArray160[2] = 10520;
class8.anIntArray160[3] = 10530;
class8.anInt174 = 4170;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4192;
class8.anInt200 = 7190;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Mining cape";
class8.aByteArray178 = "The cape worn by the most skilled miners.".getBytes();
        }
        if(i == 4345)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 38226;
class8.anIntArray160[1] = 38236;
class8.anIntArray160[2] = 38236;
class8.anIntArray160[3] = 38226;
class8.anInt174 = 4170;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4192;
class8.anInt200 = 7190;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Mining cape(t)";
class8.aByteArray178 = "The cape worn by the most skilled miners.".getBytes();
        }
        if(i == 2724)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 10512;
class8.anIntArray160[1] = 10512;
class8.anIntArray160[2] = 10512;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Mining hood";
class8.aByteArray178 = "Mining skillcape hood.".getBytes();
        }
        if(i == 2725)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 10530;
class8.anIntArray160[1] = 10520;
class8.anIntArray160[2] = 10520;
class8.anIntArray160[3] = 10530;
class8.anInt174 = 4176;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4198;
class8.anInt200 = 7196;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Smithing cape";
class8.aByteArray178 = "The cape worn by the best of smithers.".getBytes();
        }
        if(i == 4357)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4176;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4198;
class8.anInt200 = 7196;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Smithing cape(t)";
class8.aByteArray178 = "The cape worn by the best of smithers.".getBytes();
        }
        if(i == 2727)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 10512;
class8.anIntArray160[1] = 10512;
class8.anIntArray160[2] = 10512;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Smithing hood";
class8.aByteArray178 = "Smithing skillcape hood.".getBytes();
        }
        if(i == 2728)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 38256;
class8.anIntArray160[1] = 38226;
class8.anIntArray160[2] = 38226;
class8.anIntArray160[3] = 38256;
class8.anInt174 = 4165;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4187;
class8.anInt200 = 7185;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Fishing cape";
class8.aByteArray178 = "The cape worn by the best fishermen.".getBytes();
        }
        if(i == 4335)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4165;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4187;
class8.anInt200 = 7185;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Fishing cape(t)";
class8.aByteArray178 = "The cape worn by the best fishermen.".getBytes();
        }
        if(i == 2730)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 38226;
class8.anIntArray160[1] = 38226;
class8.anIntArray160[2] = 38226;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Fishing hood";
class8.aByteArray178 = "Fishing skillcape hood.".getBytes();
        }
        if(i == 2731)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 51869;
class8.anIntArray160[1] = 51864;
class8.anIntArray160[2] = 51864;
class8.anIntArray160[3] = 51869;
class8.anInt174 = 4160;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4182;
class8.anInt200 = 7180;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Cooking cape";
class8.aByteArray178 = "The cape worn by the world's best chefs.".getBytes();
        }
        if(i == 4325)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 801;
class8.anIntArray160[1] = 677;
class8.anIntArray160[2] = 677;
class8.anIntArray160[3] = 801;
class8.anInt174 = 4160;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4182;
class8.anInt200 = 7180;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Cooking cape(t)";
class8.aByteArray178 = "The cape worn by the world's best chefs.".getBytes();
        }
        if(i == 2733)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 51864;
class8.anIntArray160[1] = 51864;
class8.anIntArray160[2] = 51864;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Cooking hood";
class8.aByteArray178 = "Cooking skillcape hood.".getBytes();
        }
        if(i == 2734)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 5570;
class8.anIntArray160[1] = 5560;
class8.anIntArray160[2] = 5560;
class8.anIntArray160[3] = 5570;
class8.anInt174 = 4174;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 7199;
class8.anInt200 = 7199;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Woodcutting cape";
class8.aByteArray178 = "The cape worn by master woodcutters.".getBytes();
        }
        if(i == 4353)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 25113;
class8.anIntArray160[1] = 25113;
class8.anIntArray160[2] = 25113;
class8.anIntArray160[3] = 25113;
class8.anInt174 = 4174;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 7199;
class8.anInt200 = 7199;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Woodcutting cape(t)";
class8.aByteArray178 = "The cape worn by master woodcutters.".getBytes();
        }
        if(i == 2736)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 5560;
class8.anIntArray160[1] = 5560;
class8.anIntArray160[2] = 5560;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Woodcutting hood";
class8.aByteArray178 = "Woodcutting skillcape hood.".getBytes();
        }
        if(i == 2737)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22426;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anIntArray160[3] = 22426;
class8.anInt174 = 4163;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4185;
class8.anInt200 = 7183;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Farming cape";
class8.aByteArray178 = "The cape worn by the best of farmers.".getBytes();
        }
        if(i == 4331)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 21844;
class8.anIntArray160[1] = 21844;
class8.anIntArray160[2] = 21844;
class8.anIntArray160[3] = 21844;
class8.anInt174 = 4163;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4185;
class8.anInt200 = 7183;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Farming cape(t)";
class8.aByteArray178 = "The cape worn by the best of farmers.".getBytes();
        }
        if(i == 2739)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22416;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Farming hood";
class8.aByteArray178 = "Farming skillcape hood.".getBytes();
        }
        if(i == 2740)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anIntArray160[3] = 107;
class8.anInt174 = 4172;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4194;
class8.anInt200 = 7192;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Quest cape";
class8.aByteArray178 = "Its a quest cape".getBytes();
        }
        if(i == 2741)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Quest hood";
class8.aByteArray178 = "Quest skillcape hood.".getBytes();
        }
        if(i == 2742)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6327;
class8.anIntArray160[1] = 6336;
class8.anIntArray160[2] = 6336;
class8.anIntArray160[3] = 6327;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = -6;
class8.anInt194 = 0;
class8.anInt174 = 4156;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4179;
class8.anInt200 = 7179;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Const. cape";
class8.aByteArray178 = "The cape worn by the best of constructers.".getBytes();
        }
        if(i == 2743)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6077;
class8.anIntArray160[1] = 6067;
class8.anIntArray160[2] = 6067;
class8.anIntArray160[3] = 6077;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = -6;
class8.anInt194 = 0;
class8.anInt174 = 4156;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 4179;
class8.anInt200 = 7179;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Const. cape(t)";
class8.aByteArray178 = "The cape worn by the best of constructers.".getBytes();
        }
        if(i == 2744)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 6327;
class8.anIntArray160[1] = 6327;
class8.anIntArray160[2] = 6327;
class8.anInt174 = 4203;
class8.aBoolean176 = false;
class8.anInt181 = 720;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4202;
class8.anInt200 = 4202;
class8.aString170 = "Const. hood";
class8.aByteArray178 = "Construction skillcape hood.".getBytes();
        }
        if(i == 667)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 7211;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 7207;
class8.anInt200 = 7207;
class8.aBoolean176 = false;
class8.aString170 = "Bandos Godsword";
class8.aByteArray178 = "A brutally heavy sword.".getBytes();
        }
        if(i == 35)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 7212;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 7209;
class8.anInt200 = 7209;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl Godsword";
class8.aByteArray178 = "A beautiful, heavy sword.".getBytes();
        }
        if(i == 2402)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 7210;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 7208;
class8.anInt200 = 7208;
class8.aBoolean176 = false;
class8.aString170 = "Saradomin Godsword";
class8.aByteArray178 = "A gracious, heavy sword.".getBytes();
        }
        if(i == 746)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 7213;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 7206;
class8.anInt200 = 7206;
class8.aBoolean176 = false;
class8.aString170 = "Zamorak Godsword";
class8.aByteArray178 = "A terrifying, heavy sword.".getBytes();
        }
        if(i == 2749)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray156[1] = 41;
class8.anIntArray156[2] = 57;
class8.anIntArray160[0] = 924;
class8.anIntArray160[1] = 127;
class8.anIntArray160[2] = 924;
class8.anInt174 = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa Legs";
class8.aByteArray178 = "Santa Legs".getBytes();
        }
        if(i == 2750)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray156[1] = 41;
class8.anIntArray156[2] = 24;
class8.anIntArray156[3] = 11187;
class8.anIntArray160[0] = 127;
class8.anIntArray160[1] = 924;
class8.anIntArray160[2] = 127;
class8.anIntArray160[3] = 127;
class8.anInt174 = 3020;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa plate";
class8.aByteArray178 = "Santa plate".getBytes();
        }
        if(i == 2751)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray156[1] = 7054;
class8.anIntArray156[2] = 57;
class8.anIntArray160[0] = 127;
class8.anIntArray160[1] = 924;
class8.anIntArray160[2] = 924;
class8.anInt174 = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa Kite";
class8.aByteArray178 = "Santa Kite".getBytes();
        }
        if(i == 2752)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 926;
class8.anIntArray156[1] = 7700;
class8.anIntArray156[2] = 11200;
class8.anIntArray156[3] = 6032;
class8.anIntArray160[0] = 127;
class8.anIntArray160[1] = 127;
class8.anIntArray160[2] = 924;
class8.anIntArray160[3] = 127;
class8.anInt174 = 2603;
class8.anInt181 = 2140;
class8.anInt190 = 400;
class8.anInt198 = 948;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = 6;
class8.anInt165 = 323;
class8.anInt200 = 481;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa cape";
class8.aByteArray178 = "Santa cape".getBytes();
        }
        if(i == 2753)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 39009;
class8.anIntArray156[1] = 40918;
class8.anIntArray160[0] = 127;
class8.anIntArray160[1] = 924;
class8.anIntArray160[2] = 924;
class8.anIntArray160[3] = 127;
class8.anInt174 = 5039;
class8.anInt181 = 830;
class8.anInt190 = 536;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 3;
class8.anInt165 = 4953;
class8.anInt200 = 5030;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa Gloves";
class8.aByteArray178 = "Santa Gloves".getBytes();
        }
        if(i == 2754)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 127;
class8.anInt174 = 5037;
class8.anInt181 = 770;
class8.anInt190 = 164;
class8.anInt198 = 156;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = -3;
class8.anInt165 = 4954;
class8.anInt200 = 5031;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Santa Boots";
class8.aByteArray178 = "Santa boots".getBytes();
        }
        if(i == 2755)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 5656;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 5652;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Bronze C'bow";
class8.aByteArray178 = "A Bronze C'bow.".getBytes();
        }
        if(i == 2756)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 43486;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 43486;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Blurite C'bow";
class8.aByteArray178 = "A Blurite C'bow.".getBytes();
        }
        if(i == 2757)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 33;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 33;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Iron C'bow";
class8.aByteArray178 = "A Iron C'bow.".getBytes();
        }
        if(i == 2758)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 43072;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 43072;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Steel C'bow";
class8.aByteArray178 = "A Steel C'bow.".getBytes();
        }
        if(i == 2759)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 43297;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 43297;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Mithril C'bow";
class8.aByteArray178 = "A Mithril C'bow.".getBytes();
        }
        if(i == 2760)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 21662;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 21662;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Adamantite C'bow";
class8.aByteArray178 = "A Adamantite C'bow.".getBytes();
        }
        if(i == 767)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 5656;
class8.anIntArray160[0] = 36133;
class8.anIntArray156[1] = 5652;
class8.anIntArray160[1] = 36133;
class8.anInt174 = 7214;
class8.anInt181 = 1160;
class8.anInt190 = 543;
class8.anInt198 = 66;
class8.anInt169 = 1;
class8.anInt194 = 3;
class8.anInt165 = 7215;
class8.anInt200 = 7215;
class8.aBoolean176 = false;
class8.aString170 = "Rune C'bow";
class8.aByteArray178 = "A Runite C'bow.".getBytes();
        }
        if(i == 2762)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anInt174 = 7247;
class8.anInt181 = 1000;
class8.anInt190 = 543;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7238;
class8.anInt200 = 7248;
class8.anInt188 = 7236;
class8.anInt164 = 7239;
class8.aBoolean176 = false;
class8.aString170 = "Void knight Top";
class8.aByteArray178 = "Torso armour of the order of the Void Knights.".getBytes();
        }
        if(i == 2763)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anInt174 = 7246;
class8.anInt181 = 2000;
class8.anInt190 = 543;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt165 = 7237;
class8.anInt200 = 7241;
class8.aString170 = "Void knight robe";
class8.aByteArray178 = "Leg armour of the order of the Void Knights.".getBytes();
        }
        if(i == 2764)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 10004;
class8.anIntArray156[1] = 5532;
class8.anIntArray160[0] = 0;
class8.anIntArray160[1] = 0;
class8.anInt190 = 420;
class8.anInt198 = 828;
class8.anInt169 = 8;
class8.anInt194 = -8;
class8.anInt181 = 930;
class8.anInt204 = 138;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt174 = 7244;
class8.anInt165 = 179;
class8.anInt200 = 7240;
class8.aString170 = "Void knight gloves";
class8.aByteArray178 = "Gloves as used by the order of the void knights.".getBytes();
        }



        if(i == 430)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4673;
class8.anInt181 = 1200;
class8.anInt190 = 510;
class8.anInt198 = 1840;
class8.anInt169 = 0;
class8.anInt194 = 5;
class8.anInt165 = 4674;
class8.anInt200 = 4675;
class8.anInt164 = 337;
class8.anInt188 = 156;
class8.aBoolean176 = false;
class8.aString170 = "Fighter Torso";
class8.aByteArray178 = "A Penance Fighter torso armour.".getBytes();
        }
        if(i == 4827)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4676;
class8.anInt181 = 2128;
class8.anInt190 = 591;
class8.anInt198 = 1034;
class8.anInt204 = 138;
class8.anInt199 = -1;
class8.anInt169 = 8;
class8.anInt194 = 11;
class8.anInt165 = 4677;
class8.anInt200 = 4677;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Dark bow";
class8.aByteArray178 = "A bow from a darker dimension.".getBytes();
        }
		if(i == 14520){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 13423;//item look
			class8.anInt165 = 13423;//male
			class8.anInt200 = 13423;//female
			class8.anInt175 = 56;//28259
			class8.anInt197 = 116;//28260
			class8.aBoolean176 = false;
			class8.anInt188 = -1;
			class8.anInt202 = 0;
			class8.anInt198 = 0;
			class8.anInt181 = 724;
			class8.anInt164 = -1;
			class8.anInt169 = 0;
			class8.anInt204 = 0;
			class8.anInt194 = -7;
			class8.anInt190 = 171;
            class8.aString170 = "Bandos boots";
            class8.aByteArray178 = "A nice set of Bandos boots, worn once by the god Bandos.".getBytes();
        }
        if(i == 2904)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4678;
class8.anInt181 = 595;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt199 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4679;
class8.anInt200 = 4680;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Dragon Boots";
class8.aByteArray178 = "These will protect my feet.".getBytes();
        }
        if(i == 1107)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4681;
class8.anInt181 = 984;
class8.anInt190 = 500;
class8.anInt204 = 0;
class8.anInt198 = 2039;
class8.anInt199 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4682;
class8.anInt200 = 4683;
class8.anInt164 = 4685;
class8.anInt188 = 4684;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Bandos Chestplate";
class8.aByteArray178 = "A sturdy chest plate.".getBytes();
        }
        if(i == 1077)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4686;
class8.anInt181 = 854;
class8.anInt190 = 540;
class8.anInt198 = 2039;
class8.anInt204 = 144;
class8.anInt199 = -1;
class8.anInt169 = 9;
class8.anInt194 = 5;
class8.anInt165 = 4687;
class8.anInt200 = 4688;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Bandos tassets";
class8.aByteArray178 = "A sturdy pair of tassets.".getBytes();
        }
        if(i == 7608)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 4689;
class8.anInt181 = 900;
class8.anInt190 = 540;
class8.anInt198 = 2039;
class8.anInt199 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 4690;
class8.anInt200 = 4691;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = 4693;
class8.anInt188 = 4692;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl chestplate";
class8.aByteArray178 = "A chestplate of grEat craftsmanship.".getBytes();
        }
        
        if(i == 3753)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7202;
class8.aBoolean176 = false;
class8.anInt181 = 984;
class8.anInt190 = 126;
class8.anInt198 = 129;
class8.anInt169 = -1;
class8.anInt194 = 1;
class8.anInt204 = 28;
class8.anInt165 = 7200;
class8.anInt200 = 7201;
class8.anInt204 = 28;
class8.anInt175 = -1;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Helm of neitiznot";
class8.aByteArray178 = "A gift from Neitiznot's Burgher.".getBytes();
        }
        if(i == 7611)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7205;
class8.anInt181 = 789;
class8.anInt190 = 135;
class8.anInt198 = 123;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt204 = 24;
class8.anInt165 = 7204;
class8.anInt200 = 7203;
class8.anInt175 = -1;
class8.aBoolean176 = false;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Dragon Full Helm";
class8.aByteArray178 = "Looks impressive and protects your head too.".getBytes();
        }
        if(i == 7613)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7218;
class8.anInt181 = 917;
class8.anInt190 = 212;
class8.anInt198 = 1883;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7219;
class8.anInt200 = 7220;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Armadyl helmet";
class8.aByteArray178 = "A helmet of grEat craftsmanship.".getBytes();
        }

        if(i == 7617)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 7250;
class8.anInt181 = 1000;
class8.anInt169 = -5;
class8.anInt194 = 2;
class8.anInt190 = 321;
class8.anInt165 = 7249;
class8.anInt200 = 7249;
class8.aBoolean176 = false;
class8.aString170 = "Void Staff";
class8.aByteArray178 = "This is likely to put my back out...".getBytes();
        }
        if(i == 1949)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 0;
class8.anIntArray160[0] = 0;
class8.anInt174 = 1988;
class8.anInt181 = 700;
class8.anInt190 = 1100;
class8.anInt198 = 650;
class8.anInt204 = 1148;
class8.anInt169 = 5;
class8.anInt194 = -25;
class8.anInt165 = 1987;
class8.anInt200 = 1987;
class8.aString170 = "Fighter Hat ";
class8.aByteArray178 = "A penance fighter hat.".getBytes();
        }
        if(i == 7619)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7265;
class8.anInt181 = 917;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7252;
class8.anInt200 = 7260;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Healer hat";
class8.aByteArray178 = "A Penance Healer hat.".getBytes();
        }
        if(i == 7620)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7266;
class8.anInt181 = 917;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7253;
class8.anInt200 = 7261;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Ranger hat";
class8.aByteArray178 = "A Penance Ranger hat.".getBytes();
        }
        if(i == 7621)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7267;
class8.anInt181 = 917;
class8.anInt190 = 14;
class8.anInt198 = 0;
class8.anInt169 = 7;
class8.anInt194 = 1;
class8.anInt165 = 7254;
class8.anInt204 = 0;
class8.anInt200 = 7262;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "Runner hat";
class8.aByteArray178 = "A Penance Runner hat.".getBytes();
        }
        if(i == 642)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7169;
class8.anInt181 = 1200;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7148;
class8.anInt200 = 7163;
class8.anInt164 = 7152;
class8.anInt188 = 7138;
class8.aBoolean176 = false;
class8.aString170 = "3rd age platebody";
class8.aByteArray178 = "Fabulous rare armour beaten from magical silver.".getBytes();
        }
        if(i == 652)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7167;
class8.anInt181 = 1740;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 4;
class8.anInt194 = 11;
class8.anInt165 = 7145;
class8.anInt200 = 7159;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age platelegs";
class8.aByteArray178 = "Fabulous rare armour beaten from magical silver.".getBytes();
        }
        if(i == 662)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7166;
class8.anInt181 = 720;
class8.anInt190 = 28;
class8.anInt198 = 1892;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7142;
class8.anInt200 = 7156;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age full helm";
class8.aByteArray178 = "Fabulous rare armour beaten from magical silver.".getBytes();
        }
        if(i == 2589)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7168;
class8.anInt181 = 2030;
class8.anInt190 = 364;
class8.anInt198 = 56;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7151;
class8.anInt200 = 7151;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age kiteshield";
class8.aByteArray178 = "Fabulous ancient armour beaten from magical silver.".getBytes();
        }
        if(i == 640)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7172;
class8.anInt181 = 2083;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7149;
class8.anInt200 = 7164;
class8.anInt164 = 7153;
class8.anInt188 = 7139;
class8.aBoolean176 = false;
class8.aString170 = "3rd age robe top";
class8.aByteArray178 = "Fabulously rare mage protection enchanted in the 3rd age.".getBytes();
        }
        if(i == 650)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7171;
class8.anInt181 = 2083;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7146;
class8.anInt200 = 7160;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age robe";
class8.aByteArray178 = "Fabulously rare mage protection enchanted in the 3rd age.".getBytes();
        }
        if(i == 660)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7170;
class8.anInt181 = 917;
class8.anInt190 = 212;
class8.anInt198 = 1883;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7143;
class8.anInt200 = 7157;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age mage hat";
class8.aByteArray178 = "Fabulously rare mage protection enchanted in the 3rd age.".getBytes();
        }
        if(i == 638)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7175;
class8.anInt181 = 1200;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7150;
class8.anInt200 = 7165;
class8.anInt164 = 7154;
class8.anInt188 = 7140;
class8.aBoolean176 = false;
class8.aString170 = "3rd age range top";
class8.aByteArray178 = "Fabulously ancient range protection crafted from white dragonhide.".getBytes();
        }
        if(i == 648)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7174;
class8.anInt181 = 1827;
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7147;
class8.anInt200 = 7161;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age range legs";
class8.aByteArray178 = "Fabulously ancient range protection crafted from white dragonhide.".getBytes();
        }
        if(i == 658)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7173;
class8.anInt181 = 917;
class8.anInt190 = 212;
class8.anInt198 = 1883;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 7144;
class8.anInt200 = 7158;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age range coif";
class8.aByteArray178 = "Fabulously ancient range protection crafted from white dragonhide.".getBytes();
        }
        if(i == 3629)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 7176;
class8.anInt181 = 740;
class8.anInt190 = 196;
class8.anInt198 = 1784;
class8.anInt169 = 7;
class8.anInt194 = -33;
class8.anInt165 = 7141;
class8.anInt200 = 7155;
class8.anInt164 = -1;
class8.anInt188 = -1;
class8.aBoolean176 = false;
class8.aString170 = "3rd age vambraces";
class8.aByteArray178 = "Fabulously ancient range protection crafted from white dragonhide.".getBytes();
        }
        if(class8.anInt163 != -1)
        {
class8.method199((byte)61);
        }
        if(!aBoolean182 && class8.aBoolean161)
        {
class8.aString170 = "Members Object";
class8.aByteArray178 = "Login to a members' server to use this object.".getBytes();
class8.aStringArray168 = null;
class8.aStringArray189 = null;
class8.anInt202 = 0;
        }
        return class8;
    }

    public void method199(byte byte0)
    {
        Class8 class8 = method198(anInt163);
        anInt174 = class8.anInt174;
        anInt181 = class8.anInt181;
        anInt190 = class8.anInt190;
        anInt198 = class8.anInt198;
        anInt204 = class8.anInt204;
        anInt169 = class8.anInt169;
        anInt194 = class8.anInt194;
        if(byte0 != 61)
        {
aBoolean186 = !aBoolean186;
        }
        anIntArray156 = class8.anIntArray156;
        anIntArray160 = class8.anIntArray160;
        Class8 class8_1 = method198(anInt179);
        aString170 = class8_1.aString170;
        aBoolean161 = class8_1.aBoolean161;
        anInt155 = class8_1.anInt155;
        String s = "a";
        char c = class8_1.aString170.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
s = "an";
        }
        aByteArray178 = (new StringBuilder()).append("Swap this note at any bank for ").append(s).append(" ").append(class8_1.aString170).append(".").toString().getBytes();
        aBoolean176 = true;
    }

    public static final Class30_Sub2_Sub1_Sub1 method200(int i, int j, int k, int l)
    {
        if(k == 0)
        {
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_158.method222(i);
if(class30_sub2_sub1_sub1 != null && class30_sub2_sub1_sub1.anInt1445 != j && class30_sub2_sub1_sub1.anInt1445 != -1)
{
    class30_sub2_sub1_sub1.method329();
    class30_sub2_sub1_sub1 = null;
}
if(class30_sub2_sub1_sub1 != null)
{
    return class30_sub2_sub1_sub1;
            }
        }
        Class8 class8 = method198(i);
        if(class8.anIntArray193 == null)
        {
            j = -1;
        }
        if(j > 1)
        {
            int i1 = -1;
            for(int j1 = 0; j1 < 10; j1++)
            {
                if(j >= class8.anIntArray201[j1] && class8.anIntArray201[j1] != 0)
                {
                    i1 = class8.anIntArray193[j1];
                }
            }

            if(i1 != -1)
            {
                class8 = method198(i1);
            }
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = class8.method201(1);
        if(class30_sub2_sub4_sub6 == null)
        {
            return null;
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_1 = null;
        if(class8.anInt163 != -1)
        {
            class30_sub2_sub1_sub1_1 = method200(class8.anInt179, 10, -1, 9);
            if(class30_sub2_sub1_sub1_1 == null)
            {
                return null;
            }
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_2 = new Class30_Sub2_Sub1_Sub1(32, 32);
        int k1 = Class30_Sub2_Sub1_Sub3.anInt1466;
        int l1 = Class30_Sub2_Sub1_Sub3.anInt1467;
        int ai[] = Class30_Sub2_Sub1_Sub3.anIntArray1472;
        int ai1[] = Class30_Sub2_Sub1.anIntArray1378;
        int i2 = Class30_Sub2_Sub1.anInt1379;
        int j2 = Class30_Sub2_Sub1.anInt1380;
        int k2 = Class30_Sub2_Sub1.anInt1383;
        int l2 = Class30_Sub2_Sub1.anInt1384;
        int i3 = Class30_Sub2_Sub1.anInt1381;
        int j3 = Class30_Sub2_Sub1.anInt1382;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = false;
        Class30_Sub2_Sub1.method331(32, 32, -293, class30_sub2_sub1_sub1_2.anIntArray1439);
        Class30_Sub2_Sub1.method336(32, 0, 0, 0, 32, 0);
        Class30_Sub2_Sub1_Sub3.method364((byte)6);
        int k3 = class8.anInt181;
        if(k == -1)
        {
            k3 = (int)((double)k3 * 1.5D);
        }
        if(k > 0)
        {
            k3 = (int)((double)k3 * 1.04D);
        }
        int l3 = Class30_Sub2_Sub1_Sub3.anIntArray1470[class8.anInt190] * k3 >> 16;
        int i4 = Class30_Sub2_Sub1_Sub3.anIntArray1471[class8.anInt190] * k3 >> 16;
        class30_sub2_sub4_sub6.method482(0, class8.anInt198, class8.anInt204, class8.anInt190, class8.anInt169, l3 + ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6)).anInt1426 / 2 + class8.anInt194, i4 + class8.anInt194);
        for(int j4 = 31; j4 >= 0; j4--)
        {
            for(int k5 = 31; k5 >= 0; k5--)
            {
                if(class30_sub2_sub1_sub1_2.anIntArray1439[j4 + k5 * 32] != 0)
                {
                    continue;
                }
                if(j4 > 0 && class30_sub2_sub1_sub1_2.anIntArray1439[(j4 - 1) + k5 * 32] > 1)
                {
                    class30_sub2_sub1_sub1_2.anIntArray1439[j4 + k5 * 32] = 1;
                    continue;
                }
                if(k5 > 0 && class30_sub2_sub1_sub1_2.anIntArray1439[j4 + (k5 - 1) * 32] > 1)
                {
                    class30_sub2_sub1_sub1_2.anIntArray1439[j4 + k5 * 32] = 1;
                    continue;
                }
                if(j4 < 31 && class30_sub2_sub1_sub1_2.anIntArray1439[j4 + 1 + k5 * 32] > 1)
                {
                    class30_sub2_sub1_sub1_2.anIntArray1439[j4 + k5 * 32] = 1;
                    continue;
                }
                if(k5 < 31 && class30_sub2_sub1_sub1_2.anIntArray1439[j4 + (k5 + 1) * 32] > 1)
                {
                    class30_sub2_sub1_sub1_2.anIntArray1439[j4 + k5 * 32] = 1;
                }
            }

        }

        if(k > 0)
        {
            for(int k4 = 31; k4 >= 0; k4--)
            {
                for(int l5 = 31; l5 >= 0; l5--)
                {
                    if(class30_sub2_sub1_sub1_2.anIntArray1439[k4 + l5 * 32] != 0)
                    {
                        continue;
                    }
                    if(k4 > 0 && class30_sub2_sub1_sub1_2.anIntArray1439[(k4 - 1) + l5 * 32] == 1)
                    {
                        class30_sub2_sub1_sub1_2.anIntArray1439[k4 + l5 * 32] = k;
                        continue;
                    }
                    if(l5 > 0 && class30_sub2_sub1_sub1_2.anIntArray1439[k4 + (l5 - 1) * 32] == 1)
                    {
                        class30_sub2_sub1_sub1_2.anIntArray1439[k4 + l5 * 32] = k;
                        continue;
                    }
                    if(k4 < 31 && class30_sub2_sub1_sub1_2.anIntArray1439[k4 + 1 + l5 * 32] == 1)
                    {
                        class30_sub2_sub1_sub1_2.anIntArray1439[k4 + l5 * 32] = k;
                        continue;
                    }
                    if(l5 < 31 && class30_sub2_sub1_sub1_2.anIntArray1439[k4 + (l5 + 1) * 32] == 1)
                    {
                        class30_sub2_sub1_sub1_2.anIntArray1439[k4 + l5 * 32] = k;
                    }
                }

            }

        } else
        if(k == 0)
        {
            for(int l4 = 31; l4 >= 0; l4--)
            {
                for(int i6 = 31; i6 >= 0; i6--)
                {
                    if(class30_sub2_sub1_sub1_2.anIntArray1439[l4 + i6 * 32] == 0 && l4 > 0 && i6 > 0 && class30_sub2_sub1_sub1_2.anIntArray1439[(l4 - 1) + (i6 - 1) * 32] > 0)
                    {
                        class30_sub2_sub1_sub1_2.anIntArray1439[l4 + i6 * 32] = 0x302020;
                    }
                }

            }

        }
        if(class8.anInt163 != -1)
        {
            int i5 = class30_sub2_sub1_sub1_1.anInt1444;
            int j6 = class30_sub2_sub1_sub1_1.anInt1445;
            class30_sub2_sub1_sub1_1.anInt1444 = 32;
            class30_sub2_sub1_sub1_1.anInt1445 = 32;
            class30_sub2_sub1_sub1_1.method348(0, 16083, 0);
            class30_sub2_sub1_sub1_1.anInt1444 = i5;
            class30_sub2_sub1_sub1_1.anInt1445 = j6;
        }
        if(k == 0)
        {
            aClass12_158.method223(class30_sub2_sub1_sub1_2, i, (byte)2);
        }
        Class30_Sub2_Sub1.method331(j2, i2, -293, ai1);
        Class30_Sub2_Sub1.method333(j3, k2, false, l2, i3);
        Class30_Sub2_Sub1_Sub3.anInt1466 = k1;
        Class30_Sub2_Sub1_Sub3.anInt1467 = l1;
        Class30_Sub2_Sub1_Sub3.anIntArray1472 = ai;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = true;
        if(l < 9 || l > 9)
        {
            for(int j5 = 1; j5 > 0; j5++) { }
        }
        if(class8.aBoolean176)
        {
            class30_sub2_sub1_sub1_2.anInt1444 = 33;
        } else
        {
            class30_sub2_sub1_sub1_2.anInt1444 = 32;
        }
        class30_sub2_sub1_sub1_2.anInt1445 = j;
        return class30_sub2_sub1_sub1_2;
    }

    public final Class30_Sub2_Sub4_Sub6 method201(int i)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
            {
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                {
                    j = anIntArray193[k];
                }
            }

            if(j != -1)
            {
                return method198(j).method201(1);
            }
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_159.method222(anInt157);
        if(class30_sub2_sub4_sub6 != null)
        {
            return class30_sub2_sub4_sub6;
        }
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, anInt174);
        if(class30_sub2_sub4_sub6 == null)
        {
            return null;
        }
        if(anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
        {
            class30_sub2_sub4_sub6.method478(anInt167, anInt191, anInt177, anInt192);
        }
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
            {
                class30_sub2_sub4_sub6.method476(anIntArray156[l], anIntArray160[l]);
            }

        }
        class30_sub2_sub4_sub6.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
        class30_sub2_sub4_sub6.aBoolean1659 = true;
        aClass12_159.method223(class30_sub2_sub4_sub6, anInt157, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public final Class30_Sub2_Sub4_Sub6 method202(int i, boolean flag)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
            {
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                {
                    j = anIntArray193[k];
                }
            }

            if(j != -1)
            {
                return method198(j).method202(1, true);
            }
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, anInt174);
        if(!flag)
        {
            throw new NullPointerException();
        }
        if(class30_sub2_sub4_sub6 == null)
        {
            return null;
        }
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
            {
                class30_sub2_sub4_sub6.method476(anIntArray156[l], anIntArray160[l]);
            }

        }
        return class30_sub2_sub4_sub6;
    }

    public final void method203(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
        {
            throw new NullPointerException();
        }
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
            {
                return;
            }
            if(i == 1)
            {
                anInt174 = class30_sub2_sub2.method410();
            } else
            if(i == 2)
            {
                aString170 = class30_sub2_sub2.method415();
            } else
            if(i == 3)
            {
                aByteArray178 = class30_sub2_sub2.method416((byte)30);
            } else
            if(i == 4)
            {
                anInt181 = class30_sub2_sub2.method410();
            } else
            if(i == 5)
            {
                anInt190 = class30_sub2_sub2.method410();
            } else
            if(i == 6)
            {
                anInt198 = class30_sub2_sub2.method410();
            } else
            if(i == 7)
            {
                anInt169 = class30_sub2_sub2.method410();
                if(anInt169 > 32767)
                {
                    anInt169 -= 0x10000;
                }
            } else
            if(i == 8)
            {
                anInt194 = class30_sub2_sub2.method410();
                if(anInt194 > 32767)
                {
                    anInt194 -= 0x10000;
                }
            } else
            if(i == 10)
            {
                anInt199 = class30_sub2_sub2.method410();
            } else
            if(i == 11)
            {
                aBoolean176 = true;
            } else
            if(i == 12)
            {
                anInt155 = class30_sub2_sub2.method413();
            } else
            if(i == 16)
            {
                aBoolean161 = true;
            } else
            if(i == 23)
            {
                anInt165 = class30_sub2_sub2.method410();
                aByte205 = class30_sub2_sub2.method409();
            } else
            if(i == 24)
            {
                anInt188 = class30_sub2_sub2.method410();
            } else
            if(i == 25)
            {
                anInt200 = class30_sub2_sub2.method410();
                aByte154 = class30_sub2_sub2.method409();
            } else
            if(i == 26)
            {
                anInt164 = class30_sub2_sub2.method410();
            } else
            if(i >= 30 && i < 35)
            {
                if(aStringArray168 == null)
                {
                    aStringArray168 = new String[5];
                }
                aStringArray168[i - 30] = class30_sub2_sub2.method415();
                if(aStringArray168[i - 30].equalsIgnoreCase("hidden"))
                {
                    aStringArray168[i - 30] = null;
                }
            } else
            if(i >= 35 && i < 40)
            {
                if(aStringArray189 == null)
                {
                    aStringArray189 = new String[5];
                }
                aStringArray189[i - 35] = class30_sub2_sub2.method415();
            } else
            if(i == 40)
            {
                int j = class30_sub2_sub2.method408();
                anIntArray156 = new int[j];
                anIntArray160 = new int[j];
                int k = 0;
                while(k < j) 
                {
                    anIntArray156[k] = class30_sub2_sub2.method410();
                    anIntArray160[k] = class30_sub2_sub2.method410();
                    k++;
                }
            } else
            if(i == 78)
            {
                anInt185 = class30_sub2_sub2.method410();
            } else
            if(i == 79)
            {
                anInt162 = class30_sub2_sub2.method410();
            } else
            if(i == 90)
            {
                anInt175 = class30_sub2_sub2.method410();
            } else
            if(i == 91)
            {
                anInt197 = class30_sub2_sub2.method410();
            } else
            if(i == 92)
            {
                anInt166 = class30_sub2_sub2.method410();
            } else
            if(i == 93)
            {
                anInt173 = class30_sub2_sub2.method410();
            } else
            if(i == 95)
            {
                anInt204 = class30_sub2_sub2.method410();
            } else
            if(i == 97)
            {
                anInt179 = class30_sub2_sub2.method410();
            } else
            if(i == 98)
            {
                anInt163 = class30_sub2_sub2.method410();
            } else
            if(i >= 100 && i < 110)
            {
                if(anIntArray193 == null)
                {
                    anIntArray193 = new int[10];
                    anIntArray201 = new int[10];
                }
                anIntArray193[i - 100] = class30_sub2_sub2.method410();
                anIntArray201[i - 100] = class30_sub2_sub2.method410();
            } else
            if(i == 110)
            {
                anInt167 = class30_sub2_sub2.method410();
            } else
            if(i == 111)
            {
                anInt192 = class30_sub2_sub2.method410();
            } else
            if(i == 112)
            {
                anInt191 = class30_sub2_sub2.method410();
            } else
            if(i == 113)
            {
                anInt196 = class30_sub2_sub2.method409();
            } else
            if(i == 114)
            {
                anInt184 = class30_sub2_sub2.method409() * 5;
            } else
            if(i == 115)
            {
                anInt202 = class30_sub2_sub2.method408();
            }
        } while(true);
    }

    Class8()
    {
        anInt157 = -1;
        anInt171 = 9;
        anInt177 = 9;
        aBoolean186 = false;
        aBoolean206 = false;
    }

}

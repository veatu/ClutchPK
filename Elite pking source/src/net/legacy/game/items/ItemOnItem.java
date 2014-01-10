package net.legacy.game.items;

import net.legacy.*;
import net.legacy.game.clients.*;
import net.legacy.game.items.*;
import net.legacy.game.npcs.*;
import net.legacy.game.objects.*;
import net.legacy.game.world.*;
import net.legacy.game.*;
import net.legacy.utilities.*;

public class ItemOnItem {

    public void itemonitem(int ID, int useWith, int itemUsed) {
        Client c = (Client) Server.playerHandler.players[ID];

        if (((itemUsed == 3904) && (useWith == 3906)) || ((itemUsed == 3906) && (useWith == 3904))) {
            c.deleteItem(3904, c.getItemSlot(3904), 1);
            c.deleteItem(3906, c.getItemSlot(3906), 1);
            c.addItem(3910, 1);
            c.sM("You have combined Shard 1 with Shard 2.");
        }
        if (((itemUsed == 3904) && (useWith == 3908)) || ((itemUsed == 3908) && (useWith == 3904))) {
            c.deleteItem(3904, c.getItemSlot(3904), 1);
            c.deleteItem(3908, c.getItemSlot(3908), 1);
            c.addItem(3912, 1);
            c.sM("You have combined Shard 1 with Shard 3.");
        }
        if (((itemUsed == 3906) && (useWith == 3908)) || ((itemUsed == 3908) && (useWith == 3906))) {
            c.deleteItem(3906, c.getItemSlot(3906), 1);
            c.deleteItem(3908, c.getItemSlot(3908), 1);
            c.addItem(3916, 1);
            c.sM("You have combined Shard 2 with Shard 3.");
        }
        if (((itemUsed == 3910) && (useWith == 3908)) || ((itemUsed == 3908) && (useWith == 3910))) {
            c.deleteItem(3910, c.getItemSlot(3910), 1);
            c.deleteItem(3908, c.getItemSlot(3908), 1);
            c.addItem(3914, 1);
            c.sM("You made Godsword Blade.");
        }
        if (((itemUsed == 3912) && (useWith == 3906)) || ((itemUsed == 3906) && (useWith == 3912))) {
            c.deleteItem(3912, c.getItemSlot(3912), 1);
            c.deleteItem(3906, c.getItemSlot(3906), 1);
            c.addItem(3914, 1);
            c.sM("You made Godsword Blade.");
        }
        if (((itemUsed == 3916) && (useWith == 3904)) || ((itemUsed == 3904) && (useWith == 3916))) {
            c.deleteItem(3916, c.getItemSlot(3916), 1);
            c.deleteItem(3904, c.getItemSlot(3904), 1);
            c.addItem(3914, 1);
            c.sM("You made Godsword Blade.");
        }
        if (((itemUsed == 3914) && (useWith == 3924)) || ((itemUsed == 3924) && (useWith == 3914))) {
            c.deleteItem(3914, c.getItemSlot(3914), 1);
            c.deleteItem(3924, c.getItemSlot(3924), 1);
            c.addItem(746, 1);
            c.sM("With Zamorak Godsword you will become the wildy beast!!");
        }
        if (((itemUsed == 3914) && (useWith == 3918)) || ((itemUsed == 3918) && (useWith == 3914))) {
            c.deleteItem(3914, c.getItemSlot(3914), 1);
            c.deleteItem(3918, c.getItemSlot(3918), 1);
            c.addItem(35, 1);
            c.sM("Hmm.. Epic Armadyl Godsword.. Epic OWNER..");
        }
        if (((itemUsed == 3914) && (useWith == 3922)) || ((itemUsed == 3922) && (useWith == 3914))) {
            c.deleteItem(3914, c.getItemSlot(3914), 1);
            c.deleteItem(3922, c.getItemSlot(3922), 1);
            c.addItem(2402, 1);
            c.sM("You became a god. Use Saradomin GS special powers.");
        }
        if (((itemUsed == 3914) && (useWith == 3920)) || ((itemUsed == 3920) && (useWith == 3914))) {
            c.deleteItem(3914, c.getItemSlot(3914), 1);
            c.deleteItem(3920, c.getItemSlot(3920), 1);
            c.addItem(667, 1);
            c.sM("Go own General Graardor and hit him with what he made!!");
        }
        if (itemUsed == 1 && useWith == 2 || itemUsed == 2 && useWith == 1) { // item1+item2
            c.showInterface(2311);
        }
        if (((itemUsed == 3046) && (useWith == 3046))) {
            c.deleteItem(3046, c.getItemSlot(3046), 1);
            c.deleteItem(3046, c.getItemSlot(3046), 1);
            c.addItem(3044, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 3046) && (useWith == 3044))
                || ((itemUsed == 3044) && (useWith == 3046))) {
            c.deleteItem(3046, c.getItemSlot(3046), 1);
            c.deleteItem(3044, c.getItemSlot(3044), 1);
            c.addItem(3042, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 3046) && (useWith == 3042))
                || ((itemUsed == 3042) && (useWith == 3046))) {
            c.deleteItem(3046, c.getItemSlot(3046), 1);
            c.deleteItem(3042, c.getItemSlot(3042), 1);
            c.addItem(3040, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 3044) && (useWith == 3044))) {
            c.deleteItem(3044, c.getItemSlot(3044), 1);
            c.deleteItem(3044, c.getItemSlot(3044), 1);
            c.addItem(3040, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//antipoison potion
        if (((itemUsed == 179) && (useWith == 179))) {
            c.deleteItem(179, c.getItemSlot(179), 1);
            c.deleteItem(179, c.getItemSlot(179), 1);
            c.addItem(177, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 179) && (useWith == 177))
                || ((itemUsed == 177) && (useWith == 179))) {
            c.deleteItem(179, c.getItemSlot(179), 1);
            c.deleteItem(177, c.getItemSlot(177), 1);
            c.addItem(175, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 179) && (useWith == 175))
                || ((itemUsed == 175) && (useWith == 179))) {
            c.deleteItem(179, c.getItemSlot(179), 1);
            c.deleteItem(175, c.getItemSlot(175), 1);
            c.addItem(2446, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 177) && (useWith == 177))) {
            c.deleteItem(177, c.getItemSlot(177), 1);
            c.deleteItem(177, c.getItemSlot(177), 1);
            c.addItem(2446, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//restore potion
        if (((itemUsed == 3030) && (useWith == 3030))) {
            c.deleteItem(3030, c.getItemSlot(3030), 1);
            c.deleteItem(3030, c.getItemSlot(3030), 1);
            c.addItem(3028, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 3030) && (useWith == 3028))
                || ((itemUsed == 3028) && (useWith == 3030))) {
            c.deleteItem(3030, c.getItemSlot(3030), 1);
            c.deleteItem(3028, c.getItemSlot(3028), 1);
            c.addItem(3026, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 3030) && (useWith == 3026))
                || ((itemUsed == 3026) && (useWith == 3030))) {
            c.deleteItem(3030, c.getItemSlot(3030), 1);
            c.deleteItem(3026, c.getItemSlot(3026), 1);
            c.addItem(3024, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 3028) && (useWith == 3028))) {
            c.deleteItem(3028, c.getItemSlot(3028), 1);
            c.deleteItem(3028, c.getItemSlot(3028), 1);
            c.addItem(3024, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//saradomin brew
        if (((itemUsed == 6691) && (useWith == 6691))) {
            c.deleteItem(6691, c.getItemSlot(6691), 1);
            c.deleteItem(6691, c.getItemSlot(6691), 1);
            c.addItem(6685, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 6691) && (useWith == 6689))
                || ((itemUsed == 6689) && (useWith == 6691))) {
            c.deleteItem(6691, c.getItemSlot(6691), 1);
            c.deleteItem(6689, c.getItemSlot(6689), 1);
            c.addItem(6687, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 6691) && (useWith == 6687))
                || ((itemUsed == 6691) && (useWith == 6687))) {
            c.deleteItem(6691, c.getItemSlot(6691), 1);
            c.deleteItem(6687, c.getItemSlot(6687), 1);
            c.addItem(6685, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 6689) && (useWith == 6689))) {
            c.deleteItem(6689, c.getItemSlot(6689), 1);
            c.deleteItem(6689, c.getItemSlot(6689), 1);
            c.addItem(6685, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//prayer potion
        if (((itemUsed == 143) && (useWith == 143))) {
            c.deleteItem(143, c.getItemSlot(143), 1);
            c.deleteItem(143, c.getItemSlot(143), 1);
            c.addItem(141, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 143) && (useWith == 141))
                || ((itemUsed == 141) && (useWith == 143))) {
            c.deleteItem(143, c.getItemSlot(143), 1);
            c.deleteItem(141, c.getItemSlot(141), 1);
            c.addItem(139, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 143) && (useWith == 139))
                || ((itemUsed == 139) && (useWith == 143))) {
            c.deleteItem(143, c.getItemSlot(143), 1);
            c.deleteItem(139, c.getItemSlot(139), 1);
            c.addItem(2434, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 141) && (useWith == 141))) {
            c.deleteItem(141, c.getItemSlot(141), 1);
            c.deleteItem(141, c.getItemSlot(141), 1);
            c.addItem(2434, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//range potion
        if (((itemUsed == 173) && (useWith == 173))) {
            c.deleteItem(173, c.getItemSlot(173), 1);
            c.deleteItem(173, c.getItemSlot(173), 1);
            c.addItem(171, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 173) && (useWith == 171))
                || ((itemUsed == 171) && (useWith == 173))) {
            c.deleteItem(173, c.getItemSlot(173), 1);
            c.deleteItem(171, c.getItemSlot(171), 1);
            c.addItem(169, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 173) && (useWith == 169))
                || ((itemUsed == 169) && (useWith == 173))) {
            c.deleteItem(173, c.getItemSlot(173), 1);
            c.deleteItem(169, c.getItemSlot(169), 1);
            c.addItem(2444, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 171) && (useWith == 171))) {
            c.deleteItem(171, c.getItemSlot(171), 1);
            c.deleteItem(171, c.getItemSlot(171), 1);
            c.addItem(2444, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//strength potion
        if (((itemUsed == 119) && (useWith == 119))) {
            c.deleteItem(119, c.getItemSlot(119), 1);
            c.deleteItem(119, c.getItemSlot(119), 1);
            c.addItem(117, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 119) && (useWith == 117))
                || ((itemUsed == 117) && (useWith == 119))) {
            c.deleteItem(119, c.getItemSlot(119), 1);
            c.deleteItem(117, c.getItemSlot(117), 1);
            c.addItem(115, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 119) && (useWith == 115))
                || ((itemUsed == 115) && (useWith == 119))) {
            c.deleteItem(119, c.getItemSlot(119), 1);
            c.deleteItem(115, c.getItemSlot(115), 1);
            c.addItem(113, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 117) && (useWith == 117))) {
            c.deleteItem(117, c.getItemSlot(117), 1);
            c.deleteItem(117, c.getItemSlot(117), 1);
            c.addItem(113, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//super str potion
        if (((itemUsed == 161) && (useWith == 161))) {
            c.deleteItem(161, c.getItemSlot(161), 1);
            c.deleteItem(161, c.getItemSlot(161), 1);
            c.addItem(159, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 161) && (useWith == 159))
                || ((itemUsed == 159) && (useWith == 161))) {
            c.deleteItem(161, c.getItemSlot(161), 1);
            c.deleteItem(159, c.getItemSlot(159), 1);
            c.addItem(157, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 161) && (useWith == 157))
                || ((itemUsed == 157) && (useWith == 161))) {
            c.deleteItem(161, c.getItemSlot(161), 1);
            c.deleteItem(157, c.getItemSlot(157), 1);
            c.addItem(2440, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 159) && (useWith == 159))) {
            c.deleteItem(159, c.getItemSlot(159), 1);
            c.deleteItem(159, c.getItemSlot(159), 1);
            c.addItem(2440, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//super def potion
        if (((itemUsed == 167) && (useWith == 167))) {
            c.deleteItem(167, c.getItemSlot(167), 1);
            c.deleteItem(167, c.getItemSlot(167), 1);
            c.addItem(165, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 167) && (useWith == 165))
                || ((itemUsed == 165) && (useWith == 167))) {
            c.deleteItem(167, c.getItemSlot(167), 1);
            c.deleteItem(165, c.getItemSlot(165), 1);
            c.addItem(163, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 167) && (useWith == 163))
                || ((itemUsed == 163) && (useWith == 167))) {
            c.deleteItem(167, c.getItemSlot(167), 1);
            c.deleteItem(163, c.getItemSlot(163), 1);
            c.addItem(2442, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 165) && (useWith == 165))) {
            c.deleteItem(165, c.getItemSlot(165), 1);
            c.deleteItem(165, c.getItemSlot(165), 1);
            c.addItem(2442, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//defence potion
        if (((itemUsed == 137) && (useWith == 137))) {
            c.deleteItem(137, c.getItemSlot(137), 1);
            c.deleteItem(137, c.getItemSlot(137), 1);
            c.addItem(135, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 137) && (useWith == 135))
                || ((itemUsed == 135) && (useWith == 137))) {
            c.deleteItem(137, c.getItemSlot(137), 1);
            c.deleteItem(135, c.getItemSlot(135), 1);
            c.addItem(133, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 137) && (useWith == 133))
                || ((itemUsed == 133) && (useWith == 137))) {
            c.deleteItem(137, c.getItemSlot(137), 1);
            c.deleteItem(133, c.getItemSlot(133), 1);
            c.addItem(2432, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 135) && (useWith == 135))) {
            c.deleteItem(135, c.getItemSlot(135), 1);
            c.deleteItem(135, c.getItemSlot(135), 1);
            c.addItem(2432, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//attack potion
        if (((itemUsed == 125) && (useWith == 125))) {
            c.deleteItem(125, c.getItemSlot(125), 1);
            c.deleteItem(125, c.getItemSlot(125), 1);
            c.addItem(123, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 125) && (useWith == 123))
                || ((itemUsed == 123) && (useWith == 125))) {
            c.deleteItem(125, c.getItemSlot(125), 1);
            c.deleteItem(123, c.getItemSlot(123), 1);
            c.addItem(121, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 125) && (useWith == 121))
                || ((itemUsed == 121) && (useWith == 125))) {
            c.deleteItem(125, c.getItemSlot(125), 1);
            c.deleteItem(121, c.getItemSlot(121), 1);
            c.addItem(2428, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 123) && (useWith == 123))) {
            c.deleteItem(123, c.getItemSlot(123), 1);
            c.deleteItem(123, c.getItemSlot(123), 1);
            c.addItem(2428, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
//super attack potion
        if (((itemUsed == 149) && (useWith == 149))) {
            c.deleteItem(149, c.getItemSlot(149), 1);
            c.deleteItem(149, c.getItemSlot(149), 1);
            c.addItem(147, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 2 doses.");
        }
        if (((itemUsed == 149) && (useWith == 147))
                || ((itemUsed == 147) && (useWith == 149))) {
            c.deleteItem(149, c.getItemSlot(149), 1);
            c.deleteItem(147, c.getItemSlot(147), 1);
            c.addItem(145, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 3 doses.");
        }
        if (((itemUsed == 149) && (useWith == 145))
                || ((itemUsed == 145) && (useWith == 149))) {
            c.deleteItem(149, c.getItemSlot(149), 1);
            c.deleteItem(145, c.getItemSlot(145), 1);
            c.addItem(2436, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 147) && (useWith == 147))) {
            c.deleteItem(147, c.getItemSlot(147), 1);
            c.deleteItem(147, c.getItemSlot(147), 1);
            c.addItem(2436, 1);
            c.addItem(229, 1);
            c.sM("You have combined the liquid into 4 doses.");
        }
        if (((itemUsed == 2394) || (useWith == 2394))
                && ((itemUsed == 2128) || (useWith == 2128))) {
            if (c.playerLevel[15] >= 40) {
                c.deleteItem(2394, 1);
                c.deleteItem(2128, 1);
                c.addItem(739, 1);
                c.setAnimation(1652);
            } else
                c.sM("You need at least 40 herblore to mix this.");
        }
        if (((itemUsed == 5605) || (useWith == 5605))
                && ((itemUsed == 771) || (useWith == 771))) {
            if (c.playerLevel[9] >= 32) {
                c.deleteItem(771, 1);
                c.addItem(772, 1);
                c.setAnimation(885);
            } else
                c.sM("You need at least 32 fletching to fletch this.");
        }
        if (((itemUsed == 1931) || (useWith == 1931))
                && ((itemUsed == 1947) || (useWith == 1947))) {
            c.deleteItem(1931, 1);
            c.deleteItem(1947, 1);
            c.addItem(1933, 1);
            c.sM("You mix the grain into the pot.");
        }
        if (((itemUsed == 5605) || (useWith == 5605))
                && ((itemUsed == 1511) || (useWith == 1511))) {
            c.shafting = true;
            c.resetWC();
        }
        if (((itemUsed == 1733) || (useWith == 1733))
                && ((itemUsed == 1741) || (useWith == 1741))) {
            c.showInterface(2311);
        }
        if ((itemUsed == 1617 || useWith == 1617) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(2000, 1617, 1731, 70);
        }
        if ((itemUsed == 1619 || useWith == 1619) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(1500, 1619, 1725, 60);
        }
        if ((itemUsed == 1621 || useWith == 1621) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(1000, 1621, 1729, 40);
        }
        if ((itemUsed == 1623 || useWith == 1623) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(500, 1623, 1727, 0);
        }
        if ((itemUsed == 1631 || useWith == 1631) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(3000, 1631, 1712, 75);
        }
        if ((itemUsed == 6571 || useWith == 6571) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(10000, 6571, 6585, 90);
        }
        if ((itemUsed == 1629 || useWith == 1629) && (itemUsed == 1755 || useWith == 1755)) {
            c.crafting(0, 1629, 1613, 61);
        }
        if (c.playerHasItem(314, 15) && c.playerHasItem(52, 15)
                && ((itemUsed == 314) || (useWith == 314))
                && ((itemUsed == 52) || (useWith == 52))) {
            if (c.playerHasItem(-1)) {
                c.deleteItem(314, 15);
                c.deleteItem(52, 15);
                c.addItem(53, 15);
                c.resetWC();
            } else {
                c.sM("Not enough space in your inventory.");
            }
        }
        if (((itemUsed == 5605) || (useWith == 5605))
                && ((itemUsed == 1511) || (useWith == 1511))) {
            c.shafting = true;
            c.resetWC();
        }
        if ((itemUsed == 233) && (useWith == 237)) {
            c.deleteItem(237, c.getItemSlot(237), 1);
            c.addItem(235, 1);
        } else if ((itemUsed == 590) && (useWith == 1511)) {
            if (c.playerLevel[11] >= 0) {
                c.deleteItem(1511, c.getItemSlot(1511), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(180, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 0 to burn normal logs.");
            }
        } else if ((itemUsed == 590) && (useWith == 1521)) {
            if (c.playerLevel[11] >= 15) {
                c.deleteItem(1521, c.getItemSlot(1521), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(250, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 15 to burn oak logs.");
            }
        } else if ((itemUsed == 590) && (useWith == 1519)) {
            if (c.playerLevel[11] >= 30) {
                c.deleteItem(1519, c.getItemSlot(1519), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(340, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 30 to burn willow logs.");
            }
        } else if ((itemUsed == 590) && (useWith == 1517)) {
            if (c.playerLevel[11] >= 45) {
                c.deleteItem(1517, c.getItemSlot(1517), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(600, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 45 to burn maple logs.");
            }
        } else if ((itemUsed == 590) && (useWith == 1515)) {
            if (c.playerLevel[11] >= 60) {
                c.deleteItem(1515, c.getItemSlot(1515), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(780, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 60 to burn yew logs.");
            }
        } else if ((itemUsed == 590) && (useWith == 1513)) {
            if (c.playerLevel[11] >= 75) {
                c.deleteItem(1513, c.getItemSlot(1513), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(1200, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 75 to burn magic logs.");
            }
        } else if ((itemUsed == 1511) && (useWith == 590)) {
            if (c.playerLevel[11] >= 0) {
                c.deleteItem(1511, c.getItemSlot(1511), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(180, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 0 to burn normal logs.");
            }
        } else if ((itemUsed == 1521) && (useWith == 590)) {
            if (c.playerLevel[11] >= 15) {
                c.deleteItem(1521, c.getItemSlot(1521), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(250, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 15 to burn oak logs.");
            }
        } else if ((itemUsed == 1519) && (useWith == 590)) {
            if (c.playerLevel[11] >= 30) {
                c.deleteItem(1519, c.getItemSlot(1519), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(340, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 30 to burn willow logs.");
            }
        } else if ((itemUsed == 1517) && (useWith == 590)) {
            if (c.playerLevel[11] >= 45) {
                c.deleteItem(1517, c.getItemSlot(1517), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(600, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 45 to burn maple logs.");
            }
        } else if ((itemUsed == 1515) && (useWith == 590)) {
            if (c.playerLevel[11] >= 60) {
                c.deleteItem(1515, c.getItemSlot(1515), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(780, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking of 60 to burn yew logs.");
            }
        } else if ((itemUsed == 1513) && (useWith == 590)) {
            if (c.playerLevel[11] >= 75) {
                c.deleteItem(1513, c.getItemSlot(1513), 1);
                c.makeGlobalObject(c.absX, c.absY, 2732, 0, 10);
                c.addSkillXP(1200, 11);
                c.sM("You attempt to light the logs.");
                c.sM("The fire catches and the logs begin to burn.");
                c.resetWC();
            } else {
                c.sM("You need a firemaking level of 75 to burn magic logs.");
            }
        }

        // herblore
        if ((itemUsed == 257) && (useWith == 227) || (itemUsed == 227) && (useWith == 257)) {
            if (c.playerLevel[15] >= 40) {
                c.deleteItem(257, c.getItemSlot(257), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(2434, 1);
                c.addSkillXP(2800, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need 40 herblore to make this potion.");
            }
        }
        if ((itemUsed == 267) && (useWith == 227) || (itemUsed == 227) && (useWith == 267)) {
            if (c.playerLevel[15] >= 20) {
                c.deleteItem(267, c.getItemSlot(267), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(2444, 1);
                c.addSkillXP(1500, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need 20 herblore to make this potion.");
            }
        }
        if ((itemUsed == 3000) && (useWith == 227) || (itemUsed == 227) && (useWith == 3000)) {
            if (c.playerLevel[15] >= 20) {
                c.deleteItem(3000, c.getItemSlot(3000), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(3024, 1);
                c.addSkillXP(1700, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need 30 herblore to make this potion.");
            }
        }
        if ((itemUsed == 2481) && (useWith == 227) || (itemUsed == 227) && (useWith == 2481)) {
            if (c.playerLevel[15] >= 20) {
                c.deleteItem(2481, c.getItemSlot(2481), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(3040, 1);
                c.addSkillXP(1500, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need 20 herblore to make this potion.");
            }
        }
        if ((itemUsed == 2998) && (useWith == 227) || (itemUsed == 227) && (useWith == 2998)) {
            if (c.playerLevel[15] >= 60) {
                c.deleteItem(2998, c.getItemSlot(2998), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(6685, 1);
                c.addSkillXP(3000, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need 60 herblore to make this potion.");
            }
        }
        if ((itemUsed == 259) && (useWith == 227) || (itemUsed == 227) && (useWith == 259)) {
            if (c.playerLevel[15] >= 1) {
                c.deleteItem(259, c.getItemSlot(259), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(2436, 1);
                c.addSkillXP(700, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need a higher herblore level to make this potion.");
            }
        }

        if ((itemUsed == 263) && (useWith == 227) || (itemUsed == 227) && (useWith == 263)) {
            if (c.playerLevel[15] >= 1) {
                c.deleteItem(263, c.getItemSlot(263), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(2440, 1);
                c.addSkillXP(700, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need a higher herblore level to make this potion.");
            }
        }

        if ((itemUsed == 265) && (useWith == 227) || (itemUsed == 227) && (useWith == 265)) {
            if (c.playerLevel[15] >= 1) {
                c.deleteItem(265, c.getItemSlot(265), 1);
                c.deleteItem(227, c.getItemSlot(227), 1);
                c.addItem(2442, 1);
                c.addSkillXP(700, 15);
                c.setAnimation(1652);
            } else {
                c.sM("You need a higher herblore level to make this potion.");
            }
        }
        int[] heads = {39, 40, 41, 42, 43, 44};
        int[] arrows = {882, 884, 886, 888, 890, 892};
        int[] required = {1, 5, 25, 50, 70, 85};
        for (int h = 0; h < heads.length; h++) {
            if (c.playerHasItem(heads[h], 15) && c.playerHasItem(53, 15)
                    && ((itemUsed == heads[h]) || (useWith == heads[h]))
                    && ((itemUsed == 53) || (useWith == 53))) {
                if (c.playerLevel[c.playerFletching] < required[h]) {
                    c.sM("You need " + required[h]
                            + " fletching to fletch this.");
                    break;
                }
                c.deleteItem(heads[h], 15);
                c.deleteItem(53, 15);
                c.addItem(arrows[h], 15);
                c.addSkillXP(200, c.playerFletching);
                c.resetWC();
                break;
            }
        }
        // regular, oak, maple, willow, yew, magic?
        for (int id = 0; id < c.logs.length; id++) {
            if (((itemUsed == c.logs[id]) || (useWith == c.logs[id]))
                    && ((itemUsed == 5605) || (useWith == 5605))) {
                // emote 885 (funny=3129)
                c.dialog = true;
                c.dialogInterface = 2459;
                c.dialogId = 1;
                c.fletchLog = id;
                c.sendFrame126("Select a bow", 8879);
                c.sendFrame246(8870, 250, c.longbows[id]); // right picture
                c.sendFrame246(8869, 250, c.shortbows[id]); // left picture
                c.sendFrame126(c.getItemName(c.shortbows[id]), 8871);
                c.sendFrame126(c.getItemName(c.shortbows[id]), 8874);
                c.sendFrame126(c.getItemName(c.longbows[id]), 8878);
                c.sendFrame126(c.getItemName(c.longbows[id]), 8875);
                c.sendFrame164(8866);
                c.resetWC();
                break;
            }
        }
        for (int id1 = 0; id1 < c.shortbow.length; id1++) {
            if (((itemUsed == c.shortbows[id1]) || (useWith == c.shortbows[id1]))
                    && ((itemUsed == 1777) || (useWith == 1777))) {
                c.deleteItem(c.shortbows[id1], 1);
                c.deleteItem(1777, 1);
                c.addItem(c.shortbow[id1], 1);
                c.addSkillXP(280, 9);
                c.resetWC();
            }
        }
        for (int b2 = 0; b2 < c.shortbow.length; b2++) {
            if (((itemUsed == c.longbows[b2]) || (useWith == c.longbows[b2]))
                    && ((itemUsed == 1777) || (useWith == 1777))) {
                c.deleteItem(c.longbows[b2], 1);
                c.deleteItem(1777, 1);
                c.addItem(c.longbow[b2], 1);
                c.addSkillXP(280, 9);
                c.resetWC();
            }
        }
        for (int h = 0; h < c.leathers.length; h++) {
            if (((itemUsed == 1733) || (useWith == 1733))
                    && ((itemUsed == c.leathers[h]) || (useWith == c.leathers[h]))) {
                c.craftMenu(h);
                c.cIndex = h;
            }
        }


    }
}
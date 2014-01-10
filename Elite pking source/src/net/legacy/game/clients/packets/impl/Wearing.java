package net.legacy.game.clients.packets.impl;

import net.legacy.Server;

public class Wearing {
	public String GetItemName(int ItemID) {
		for (int i = 0; i < Server.itemHandler.MaxListedItems; i++) {
			if (Server.itemHandler.ItemList[i] != null) {
				if (Server.itemHandler.ItemList[i].itemId == ItemID) {
					return Server.itemHandler.ItemList[i].itemName;
				}
                                if (ItemID == -1) {
                                        return "Unarmed";
                                }
			}
		}
		return "!! NOT EXISTING ITEM !!! - ID:"+ItemID;
	}
	public int GetCLAttack(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		String ItemName2 = ItemName.replaceAll("Bronze", "");
		ItemName2 = ItemName2.replaceAll("Iron", "");
		ItemName2 = ItemName2.replaceAll("Steel", "");
		ItemName2 = ItemName2.replaceAll("Black", "");
		ItemName2 = ItemName2.replaceAll("Mithril", "");
		ItemName2 = ItemName2.replaceAll("Adamant", "");
		ItemName2 = ItemName2.replaceAll("Rune", "");
		ItemName2 = ItemName2.replaceAll("Granite", "");
		ItemName2 = ItemName2.replaceAll("Dragon", "");
		ItemName2 = ItemName2.replaceAll("Crystal", "");
		ItemName2 = ItemName2.trim();
		if (ItemName2.startsWith("claws")
		 || ItemName2.startsWith("dagger")
		 || ItemName2.startsWith("sword")
		 || ItemName2.startsWith("scimitar")
		 || ItemName2.startsWith("mace")
		 || ItemName2.startsWith("longsword")
		 || ItemName2.startsWith("battleaxe")
		 || ItemName2.startsWith("warhammer")
		 || ItemName2.startsWith("2h sword")
		 || ItemName2.startsWith("Dragon 2h sword")
		 || ItemName2.startsWith("Dragon axe")
		 || ItemName2.startsWith("Dragon claws")
		 || ItemName2.startsWith("2h sword")
		 || ItemName2.startsWith("Green d")
		 || ItemName2.startsWith("Blue d")
		 || ItemName2.startsWith("Red d")
		 || ItemName2.startsWith("Black d")
		 || ItemName2.startsWith("halberd")) {
			if (ItemName.startsWith("Bronze")) {
				return 1;
			} else if (ItemName.startsWith("Iron")) {
				return 1;
			} else if (ItemName.startsWith("Steel")) {
				return 5;
			} else if (ItemName.startsWith("Black")) {
				return 10;
			} else if (ItemName.startsWith("Mithril")) {
				return 20;
			} else if (ItemName.startsWith("Adamant")) {
				return 30;
			} else if (ItemName.startsWith("Rune")) {
				return 40;
			} else if (ItemName.startsWith("Dragon")) {
				return 60;
			} else if (ItemName.startsWith("White")) {
				return 70;
			} else if (ItemName.startsWith("Steel defender")) {
				return 5;
			} else if (ItemName.startsWith("Black defender")) {
				return 10;
			} else if (ItemName.startsWith("Mithril defender")) {
				return 20;
			} else if (ItemName.startsWith("Adamant defender")) {
				return 30;
			} else if (ItemName.startsWith("Rune defender")) {
				return 40;
		} else if (ItemName.startsWith("Granite")) {
			return 50;
		} else if (ItemName.startsWith("Bow sword")) {
			return 85;}
		} else if (ItemName.startsWith("Dragon axe")) {
			return 60;
		} else if (ItemName.startsWith("Dragon claws")) {
			return 60;
			} else if (ItemName.startsWith("Dragon Claws")) {
				return 60;
		} else if (ItemName.startsWith("White scimitar")) {
			return 10;
		} else if (ItemName.startsWith("White 2h")) {
			return 10;
		} else if (ItemName.startsWith("Zamorak godsword")) {
			return 75;
		} else if (ItemName.startsWith("Armadyl godsword")) {
			return 75;
		} else if (ItemName.startsWith("Bandos godsword")) {
			return 75;
		} else if (ItemName.startsWith("Saradomin godsword")) {
			return 75;
		} else if (ItemName.startsWith("Granite maul")) {
			return 50;
		} else if (ItemName.startsWith("Ancient staff")) {
			return 50;
		} else if (ItemName.startsWith("Void")) {
			return 42;
		} else if (ItemName.startsWith("Attack hood")) {
			return 99;
		} else if (ItemName.startsWith("Attack cape")) {
			return 99;
		} else if (ItemName.startsWith("Saradomin sword")) {
			return 70;
		} else if (ItemName.startsWith("Dragon Claws")) {
			return 60;
			} else if (ItemName.startsWith("Dragon claws")) {
				return 60;
		} else if (ItemName.startsWith("Whip")) {
				return 70;
		}else if (ItemName.endsWith("whip") || ItemName.endsWith("Ahrims staff") || ItemName.endsWith("Torags hammers") || ItemName.endsWith("Veracs flail") || ItemName.endsWith("Veracs flail") || ItemName.endsWith("Guthans warspear") || ItemName.endsWith("Dharoks greataxe")) {
			return 70;
		}
		return 1;
	}
	public int GetCLDefence(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		String ItemName2 = ItemName.replaceAll("Bronze", "");
		ItemName2 = ItemName2.replaceAll("Iron", "");
		ItemName2 = ItemName2.replaceAll("Steel", "");
		ItemName2 = ItemName2.replaceAll("Black", "");
		ItemName2 = ItemName2.replaceAll("Mithril", "");
		ItemName2 = ItemName2.replaceAll("Adamant", "");
		ItemName2 = ItemName2.replaceAll("Rune", "");
		ItemName2 = ItemName2.replaceAll("Granite", "");
		ItemName2 = ItemName2.replaceAll("Dragon", "");
		ItemName2 = ItemName2.replaceAll("White", "");
		ItemName2 = ItemName2.replaceAll("Crystal", "");
		ItemName2 = ItemName2.trim();
		if (ItemName2.startsWith("claws")
		 || ItemName2.startsWith("dagger")
		 || ItemName2.startsWith("sword")
		 || ItemName2.startsWith("scimitar")
		 || ItemName2.startsWith("mace")
		 || ItemName2.startsWith("longsword")
		 || ItemName2.startsWith("battleaxe")
		 || ItemName2.startsWith("warhammer")
		 || ItemName2.startsWith("Dragon 2h Sword")
		 || ItemName2.startsWith("2h sword")
		 || ItemName2.startsWith("axe")
		 || ItemName2.startsWith("halberd")) {
			//It's a weapon, weapons don't required defence !
		} else if (ItemName.startsWith("Ahrims") ||  ItemName.startsWith("Karil") || ItemName.startsWith("Torag") || ItemName.startsWith("Verac") || ItemName.startsWith("Guthans") || ItemName.endsWith("Dharok")) {
			if (ItemName.endsWith("staff") || ItemName.endsWith("crossbow") || ItemName.endsWith("hammers") || ItemName.endsWith("flail") || ItemName.endsWith("warspear") || ItemName.endsWith("greataxe")) {
				//No defence for the barrow weapons
			} else {
				return 70;
			}
		} else {
			if (ItemName.startsWith("Bronze")) {
				return 1;
			} else if (ItemName.startsWith("Iron")) {
				return 1;
			} else if (ItemName.startsWith("Steel defender")) {
				return 5;
			} else if (ItemName.startsWith("Black defender")) {
				return 10;
			} else if (ItemName.startsWith("Mithril defender")) {
				return 20;
			} else if (ItemName.startsWith("Adamant defender")) {
				return 30;
			} else if (ItemName.startsWith("Rune defender")) {
				return 40;
			} else if (ItemName.startsWith("Rune sq shield")) {
				return 40;
			} else if (ItemName.startsWith("Rock-shell")) {
				return 40;
			} else if (ItemName.startsWith("Gilded")) {
				return 40;
			} else if (ItemName.startsWith("vambraces")) {
				return 1;
			} else if (ItemName.startsWith("body")) {
				return 1;
			} else if (ItemName.startsWith("chaps")) {
				return 1;
			} else if (ItemName.startsWith("Dragon claws")) {
				return 1;
			} else if (ItemName.startsWith("Dragon Claws")) {
				return 1;
			} else if (ItemName.startsWith("Dragon full helm")) {
				return 60;
			} else if (ItemName.startsWith("Dragon fire shield")) {
				return 75;
			} else if (ItemName.startsWith("Dharoks helm")) {
				return 70;
			} else if (ItemName.startsWith("Berserker helm") || ItemName.startsWith("Archer helm")) {
				return 45;
			} else if (ItemName.startsWith("Helm of neitiznot")) {
				return 55;
			} else if (ItemName.startsWith("Toktz-ket")) {
				return 60;
			} else if (ItemName.startsWith("Crystal shield")) {
			return 70;
			} else if (ItemName.startsWith("New crystal shield")) {
			return 70;
			} else if (ItemName.startsWith("Addy Gloves")) {
			return 9;
			} else if (ItemName.startsWith("Rune Gloves")) {
			return 20;
			} else if (ItemName.startsWith("Drag Gloves")) {
			return 45;
			} else if (ItemName.startsWith("Barrow Gloves")) {
			return 45;
			} else if (ItemName.startsWith("3rd age platebody") || ItemName.startsWith("3rd age platelegs") || ItemName.startsWith("3rd age helmet") || ItemName.startsWith("3rd age kiteshield")) {
			return 65;
			} else if (ItemName.startsWith("3rd age robe") || ItemName.startsWith("3rd age hat")) {
			return 30;
			} else if (ItemName.startsWith("3rd age range")) {
			return 35;
			} else if (ItemName.startsWith("White kiteshield")) {
			return 10;
			} else if (ItemName.startsWith("White full")) {
			return 10;
			} else if (ItemName.startsWith("White plate")) {
			return 10;
			} else if (ItemName.startsWith("Rune boots")) {
				return 40;
			} else if (ItemName.startsWith("Bandos chestplate")) {
				return 65;
			} else if (ItemName.startsWith("Bandos tassets")) {
				return 65;
			} else if (ItemName.startsWith("Saradomin plate")) {
				return 40;
			} else if (ItemName.startsWith("Saradomin legs")) {
				return 40;
			} else if (ItemName.startsWith("Saradomin full")) {
				return 40;
			} else if (ItemName.startsWith("Saradomin kite")) {
				return 40;
			} else if (ItemName.startsWith("Guthix platebody")) {
				return 40;
			} else if (ItemName.startsWith("Guthix platelegs")) {
				return 40;
			} else if (ItemName.startsWith("Guthix full helm")) {
				return 40;
			} else if (ItemName.startsWith("Guthix kiteshield")) {
				return 40;
			} else if (ItemName.startsWith("Zamorak platebody")) {
				return 40;
			} else if (ItemName.startsWith("Zamorak platelegs")) {
				return 40;
			} else if (ItemName.startsWith("Zamorak full helm")) {
				return 40;
			} else if (ItemName.startsWith("Zamorak kiteshield")) {
				return 40;
			} else if (ItemName.startsWith("Fighter torso")) {
				return 40;
			} else if (ItemName.startsWith("Fighter hat")) {
				return 45;
			} else if (ItemName.startsWith("Void")) {
				return 42;
			} else if (ItemName.startsWith("Farseer")) {
				return 45;
			} else if (ItemName.startsWith("Defence cape")) {
				return 99;
			} else if (ItemName.startsWith("Defence hood")) {
				return 99;
			} else if (ItemName.startsWith("Infinity")) {
				return 25;
			} else if (ItemName.startsWith("Green d")) {
				return 40;
			} else if (ItemName.startsWith("Blue d")) {
				return 40;
			} else if (ItemName.startsWith("Red d")) {
				return 40;
			} else if (ItemName.startsWith("Black d")) {
				return 40;
			} else if (ItemName.startsWith("Mystic")) {
				return 20;
			} else if (ItemName.startsWith("Splitbark")) {
				return 40;
			} else if (ItemName.startsWith("Dharoks platebody")) {
				return 70;
			} else if (ItemName.startsWith("Rune platebody")) {
				return 40;
			} else if (ItemName.startsWith("Rune plateskirt")) {
				return 40;
			} else if (ItemName.startsWith("Rune kiteshield")) {
				return 40;
			} else if (ItemName.startsWith("Rune platelegs")) {
				return 40;
			} else if (ItemName.startsWith("Dharoks platelegs")) {
				return 70;
			} else if (ItemName.startsWith("Steel") && !ItemName.endsWith("pickaxe") && !ItemName.endsWith("knife") && !ItemName.endsWith("arrow") && !ItemName.endsWith("axe")) {
				return 5;
			} else if (ItemName.startsWith("Mithril") && !ItemName.endsWith("pickaxe") && !ItemName.endsWith("knife")&& !ItemName.endsWith("arrow") && !ItemName.endsWith("axe")) {
				return 20;
			} else if (ItemName.startsWith("Adamant") && !ItemName.endsWith("pickaxe") && !ItemName.endsWith("knife")&& !ItemName.endsWith("arrow") && !ItemName.endsWith("axe")) {
				return 30;
			} else if (ItemName.startsWith("Rune full helm")) {
				return 40;
			} else if (ItemName.startsWith("Rune Platelegs")) {
				return 40;
			} else if (ItemName.startsWith("Rune Platebody")) {
				return 40;
			} else if (ItemName.startsWith("Rune Plateskirt")) {
				return 40;
			} else if (ItemName.startsWith("Rune Kite Shield")) {
				return 40;
			} else if (ItemName.startsWith("Dragon")) {
				return 60;
			} else if (ItemName.startsWith("dragon")) {
				return 60;
			} else if (ItemName.startsWith("White")) {
				return 1;
			} else if (ItemName.startsWith("Initiate")) {
				return 20;
			} else if (ItemName.startsWith("initiate")) {
				return 20;
			} else if (ItemName.endsWith("Cavalier")) {
				return 1;
			} else if (ItemName.startsWith("steel axe")) {
				return 1;
			} else if (ItemName.startsWith("Dragon claws")) {
				return 1;
			} else if (ItemName.startsWith("Dragon Claws")) {
				return 1;
			} else if (ItemName.startsWith("black axe")) {
				return 1;
			} else if (ItemName.startsWith("mithril axe")) {
				return 1;
			} else if (ItemName.startsWith("adamant axe")) {
				return 1;
			} else if (ItemName.startsWith("rune axe")) {
				return 1;
			} else if (ItemName.startsWith("Berserker_helm")) {
				return 45;
			} else if (ItemName.startsWith("Armadyl chestplate")) {
				return 65;
			} else if (ItemName.startsWith("Armadyl plateskirt")) {
				return 65;
			} else if (ItemName.endsWith("spear(s)")) {
				return 1;
			}
		}
		return 1;
	}
	public int GetCLStrength(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Granite")) {
			return 50;
		} else if (ItemName.startsWith("Torags hammers") || ItemName.endsWith("Dharoks greataxe")) {
			return 70;
		} else if (ItemName.startsWith("Tzhaar")) {
			return 60;
		} else if (ItemName.startsWith("Void")) {
			return 42;
		} else if (ItemName.startsWith("Strength hood")) {
			return 99;
		} else if (ItemName.startsWith("Strength cape")) {
			return 99;
		}
		return 1;
	}
	public int GetCLMagic(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Wizard boots")) {
			return 20;
		}
		if (ItemName.startsWith("Mage Book")) {
			return 60;
		}
		if (ItemName.startsWith("Master wand")) {
			return 60;
		}
		if (ItemName.startsWith("Ancient staff")) {
			return 50;
		}
		if (ItemName.startsWith("Void")) {
			return 42;
		}
		if (ItemName.startsWith("Ahrim")) {
			return 70;
		}
		if (ItemName.startsWith("Slayer staff")) {
			return 50;
		}
		if (ItemName.startsWith("Saradomin cape") || ItemName.startsWith("Guthix cape") || ItemName.startsWith("Zamorak cape") || ItemName.startsWith("Saradomin staff") || ItemName.startsWith("Guthix staff") || ItemName.startsWith("Zamorak staff")) {
			return 60;
		}
		if (ItemName.startsWith("3rd age robe")) {
			return 65;
		}
		if (ItemName.startsWith("3rd age hat")) {
			return 65;
		}
		if (ItemName.startsWith("Magic hood")) {
                        return 99;
		}
		if (ItemName.startsWith("Magic cape")) {
                        return 99;
		}
		if (ItemName.startsWith("Splitbark")) {
                        return 40;
		}
		if (ItemName.startsWith("Infinity")) {
                        return 50;
		}
		return 1;
	}
	public int GetCLRanged(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Steel knife")) {
			return 5;
		}
		if (ItemName.startsWith("Black knife")) {
			return 10;
		}
		if (ItemName.startsWith("Mithril knife")) {
			return 20;
		}
		if (ItemName.startsWith("Adamant knife")) {
			return 30;
		}
		if (ItemName.startsWith("Rune knife")) {
			return 40;
		}
		if (ItemName.startsWith("Void")) {
			return 42;
		}
		if (ItemName.startsWith("Rune Crossbow")) {
			return 61;
		}
		if (ItemName.startsWith("Magic shortbow")) {
			return 50;
		}
		if (ItemName.startsWith("Magic longbow")) {
			return 50;
		}
		if (ItemName.startsWith("Karil")) {
			return 70;
		}
		if (ItemName.startsWith("3rd age range")) {
			return 65;
		}
		if (ItemName.startsWith("Robin") || ItemName.startsWith("Ranger boots")) {
			return 40;
		}
		if (ItemName.startsWith("Range hood")) {
                        return 99;
                }
		if (ItemName.startsWith("Range cape")) {
                        return 99;
                }
		if (ItemName.startsWith("Seercull")) {
			return 70;
		}
		if (ItemName.startsWith("Dark bow")) {
			return 60;
		}
		if (ItemName.startsWith("Green D") || ItemName.startsWith("Green d")) {
			return 40;
		}
		if (ItemName.startsWith("Blue D") || ItemName.startsWith("Blue d")) {
			return 50;
		}
		if (ItemName.startsWith("Red D") || ItemName.startsWith("Red d")) {
			return 60;
		}
		if (ItemName.startsWith("Black D") || ItemName.startsWith("Black d")) {
			return 70;
		}
		if (ItemName.startsWith("Crystal bow")) {
			return 70;
		}
		return 1;
	}
	public int GetCLCooking(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Cooking cape")) {
			return 99;
		}
		if (ItemName.startsWith("Cooking hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLFishing(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Fishing cape")) {
			return 99;
		}
		if (ItemName.startsWith("Fishing hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLThieving(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Thieving cape")) {
			return 99;
		}
		if (ItemName.startsWith("Thieving hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLHitpoints(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Void")) {
			return 42;
		}
		if (ItemName.startsWith("Hitpoints cape")) {
			return 99;
		}
		if (ItemName.startsWith("Hitpoints hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLAgility(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Agility cape")) {
			return 99;
		}
		if (ItemName.startsWith("Agility hood")) {
			return 99;
		}
		if (ItemName.startsWith("Crystal bow")) {
			return 50;
		}
		if (ItemName.startsWith("Crystal shield")) {
			return 50;
		}
		if (ItemName.startsWith("New crystal shield")) {
			return 50;
		}
		return 1;
	}
	public int GetCLPrayer(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Void")) {
			return 22;
		}
		if (ItemName.startsWith("Prayer cape")) {
			return 99;
		}
		if (ItemName.startsWith("Prayer hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLFarming(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Farming cape")) {
			return 99;
		}
		if (ItemName.startsWith("Farming hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLFiremaking(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Firemaking cape")) {
			return 99;
		}
		if (ItemName.startsWith("Firemaking hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLFletching(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Fletching cape")) {
			return 99;
		}
		if (ItemName.startsWith("Fletching hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLHerblore(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Herblore cape")) {
			return 99;
		}
		if (ItemName.startsWith("Herblore hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLSmithing(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Smithing cape")) {
			return 99;
		}
		if (ItemName.startsWith("Smithing hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLRunecrafting(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Runecrafting cape")) {
			return 99;
		}
		if (ItemName.startsWith("Runecrafting hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLWoodcutting(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Woodcutting cape")) {
			return 99;
		}
		if (ItemName.startsWith("Woodcutting hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLMining(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Mining cape")) {
			return 99;
		}
		if (ItemName.startsWith("Mining hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLSlayer(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Slayer staff")) {
			return 55;
		}
		if (ItemName.startsWith("Slayer cape")) {
			return 99;
		}
		if (ItemName.startsWith("Slayer hood")) {
			return 99;
		}
		return 1;
	}
	public int GetCLCrafting(int ItemID) {
		if (ItemID == -1) {
			return 1;
		}
		String ItemName = GetItemName(ItemID);
		if (ItemName.startsWith("Crafting cape")) {
			return 99;
		}
		if (ItemName.startsWith("Crafting hood")) {
			return 99;
		}
		return 1;
	}
}
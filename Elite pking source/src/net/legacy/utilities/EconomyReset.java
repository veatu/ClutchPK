package net.legacy.utilities;

import java.io.*;
import net.legacy.*;
import net.legacy.game.clients.*;
import net.legacy.game.items.*;
import net.legacy.game.npcs.*;
import net.legacy.game.objects.*;
import net.legacy.game.world.*;
import net.legacy.game.*;
import net.legacy.utilities.*;

public class EconomyReset
{

	private static File charDir = new File("./characters/");

	public static void main(String[] args)
	{
		if(charDir.exists() && charDir.isDirectory())
		{
			File[] charFiles = charDir.listFiles();
		for(int i = 0; i < charFiles.length; i++)
		{
			resetEcoChar(charFiles[i]);
			System.out.println("Reset player economy levels for... "+charFiles[i].toString());
			}
		}
	}

	private static void resetEcoChar(File charFile)
	{
		try
		{

			String cheatStatus, tempData, tempAdd = ""; int curEquip = 0, curItem = 0, curBank = 0;
			File tempCharFile = new File(charDir.toString()+"ECOBOOST$TEMP");
			DataInputStream fileStream = new DataInputStream(new FileInputStream(charFile));
			BufferedWriter tempOut = new BufferedWriter(new FileWriter(tempCharFile));

		while((tempData = fileStream.readLine()) != null)
		{
			if((!tempData.trim().startsWith("character-item =")) && (!tempData.trim().startsWith("character-bank =")))
			{
				tempAdd = tempData.trim();

				if(tempData.trim().startsWith("character-equip =")) 
				{
					tempAdd = "character-equip = "+curEquip+"\t-1\t0";
					curEquip++;
				}
			tempOut.write(tempAdd); tempOut.newLine();
				}
			}
				fileStream.close(); tempOut.close();
				charFile.delete();
				tempCharFile.renameTo(charFile);
			}
		catch(Exception e) { e.printStackTrace(); 
		}
	}
}
/*
 * UserLoader.java
 * 
 * Version 0.05
 *
 * Created on 21 October 2008 edited on 30 October 2008 =)
 * 
 * load and save user settings
 *
 */

import java.io.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;



public class UserLoader extends client {


public static String usernameh = "";
public static String password = "";

public static int namesetcolour = 0x000000;
public static int chatsetcolour = 0x0000ff;

public static int chateffectcolour = 0;
public static int chateffectmove = 0;

public static int chatdetail = 1;



public static void saveuser() {


BufferedWriter bluurrfile = null;
		try {
			bluurrfile = new BufferedWriter(new FileWriter("./Files/Core/usersets.txt"));

			bluurrfile.write("character-username = ", 0, 21);
			bluurrfile.write(aString1173, 0, aString1173.length());
			bluurrfile.newLine();
			bluurrfile.write("character-password = ", 0, 21);
			bluurrfile.write(aString1174, 0, aString1174.length());
			bluurrfile.newLine();
			bluurrfile.write("character-namecolour = ", 0, 23);
			bluurrfile.write(Integer.toString(namesetcolour), 0, Integer.toString(namesetcolour).length());
			bluurrfile.newLine();
			bluurrfile.write("character-chatcolour = ", 0, 23);
			bluurrfile.write(Integer.toString(chatsetcolour), 0, Integer.toString(chatsetcolour).length());
			bluurrfile.newLine();
			bluurrfile.write("character-chattextcolour = ", 0, 27);
			bluurrfile.write(Integer.toString(chateffectcolour), 0, Integer.toString(chateffectcolour).length());
			bluurrfile.newLine();
			bluurrfile.write("character-chattexteffect = ", 0, 27);
			bluurrfile.write(Integer.toString(chateffectmove), 0, Integer.toString(chateffectmove).length());
			bluurrfile.newLine();
			bluurrfile.write("character-chattextdetail = ", 0, 27);
			bluurrfile.write(Integer.toString(chatdetail), 0, Integer.toString(chatdetail).length());
			bluurrfile.newLine();
			bluurrfile.write("", 0, 0);
			bluurrfile.newLine();
			bluurrfile.newLine();
			bluurrfile.close();
		} catch (IOException ioexception) {
			
		}
}
		
	
public static boolean charFileFound = false;



public static void loaduser(){


long start = System.currentTimeMillis();
		String line = "";
		String token = "";
		String token2 = "";
		String[] token3 = new String[3];
		boolean EndOfFile = false;
		int ReadMode = 1;
		BufferedReader bluurrfile = null;



try {
			bluurrfile = new BufferedReader(new FileReader("./Files/Core/usersets.txt"));
			charFileFound = true;
		} catch (FileNotFoundException fileex1) {
		}

if (charFileFound == false) {
System.out.println("File could not be found.");
saveuser();
return;
}

while ((EndOfFile == false) && (line != null)) {
			line = line.trim();
			int spot = line.indexOf("=");
			if (spot > -1) {
				token = line.substring(0, spot);
				token = token.trim();
				token2 = line.substring(spot + 1);
				token2 = token2.trim();
				token3 = token2.split("\t");
				switch (ReadMode) {



		case 1:
					


		if (token.equals("character-username")) {


					usernameh = token2;
	


						}

		if (token.equals("character-password")) {


					password = token2;	

						}

		if (token.equals("character-namecolour")) {


					namesetcolour = Integer.parseInt(token2);	

						}

		if (token.equals("character-chatcolour")) {


					chatsetcolour = Integer.parseInt(token2);	

		}

		if (token.equals("character-chattextcolour")) {


					chateffectcolour = Integer.parseInt(token2);	

		}
					


		if (token.equals("character-chattexteffect")) {


					chateffectmove = Integer.parseInt(token2);	

		}


		if (token.equals("character-chattextdetail")) {


					chatdetail = Integer.parseInt(token2);	

		}




break;
				}

			} 

try {
				line = bluurrfile.readLine();
			} catch (IOException ioexception1) {
				EndOfFile = true;
			}
		}

		try {
			bluurrfile.close();
		} catch (IOException ioexception) {
System.out.println("");
		}
		
		
	}


public static void finalload(){

detail();
aString1173 = usernameh;
aString1174 = password;



}



}
import java.util.Scanner;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;


import java.io.File;
//import javafx.embed.swing.JFXPanel;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class EnglishtoMorse {
	String englishInput;
	char englishLetters[]=new char[99];
	String morseResult[]=new String[99];
	char English [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '?',',','.',' ','0','1','2','3','4','5','6','7','8','9','!','-',':'};
    String MorseCode [] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","..--..","--..--",".-.-.-","|","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","-.-.--","---...---","----"}          ;       
	Scanner sc=new Scanner(System.in);
	String finalresult=" ";
	
	public String takeEnglish(String temp2)
	{
		//System.out.println("Enter the english text to convert to morse");
		String englishInput=temp2;
		englishInput=englishInput.toLowerCase();
		for(int i=0;i<englishInput.length();i++)
		{
			for(int j=0;j<English.length;j++)
			{

				if(englishInput.charAt(i)==English[j])
				{
					morseResult[j]=MorseCode[j];
					finalresult=finalresult+(morseResult[j]+" ");
				}
			}
		}
		finalresult=finalresult.trim();
		return finalresult;
	}
	
}	
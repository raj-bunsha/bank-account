import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
public class MorseToEnglish {

	static String morseInput;
	//String morseLetters[]=new String[99];
	Scanner s=new Scanner(System.in);
	static char English [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '?',',','.',' ','0','1','2','3','4','5','6','7','8','9','!',' ','-',':'};
    static String MorseCode [] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","..--..","--..--",".-.-.-","|","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","-.-.--","/","---...---","----"}          ;
    static char englishResult[]=new char[99];
    
	public static String toEnglish(String temp4)
	{
		//System.out.println("\nEnter the morse code to translate to english");
		morseInput=temp4;
		String morseLetters[]=morseInput.split(" ");
		String str="";
		for(int i=0;i<morseLetters.length;i++)
		{
			for(int j=0;j<MorseCode.length;j++)
			{
				if(morseLetters[i].equalsIgnoreCase(MorseCode[j]))
				{
					englishResult[j]=English[j];
					str+=englishResult[j];
				}
			}
		}
		return str;
	}
	
	
}

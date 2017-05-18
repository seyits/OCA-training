package nl.kadaster.oca.wkopd1;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		
		int dicecombi[] = new int[5];
		
		Worp werpen1 = new Worp();
		Worp werpen3 = new Worp();
		Vastzetten vast = new Vastzetten();
		
		dicecombi = werpen1.combiArray();
		vast.arrayInladen(dicecombi);
		
	}
}
	
class Worp{
	// 	1 - 3 worpen, eerste worp	
	int[] combiArray(){
		int dices[] = new int[5];
		System.out.println(dices.length);
		
		for (int i=0; i<5; i++){
			dices[i]=dicethrow();
			System.out.print(dices[i]+ " ");
		}
		System.out.println();
		return dices;
	}
		//System.out.println("Welke vastzetten: ");
		
	int dicethrow(){
		
		Random worp = new Random();
		int eyes = worp.nextInt(6)+1;
		return eyes;
		}
}

class Vastzetten{
	boolean isIeVastgezet;
	int waarde;
	void arrayInladen(int[] dices){
		System.out.println("Welke vastzetten: ");
		Scanner kbStr = new Scanner(System.in);
		String num1;
		num1 = kbStr.nextLine();
		Worp werpen2 = new Worp();
		//werpen2.dicethrow()

		//num2 = 5 - 
		for (int i = 0 ; i < num1.length(); i++)
		System.out.println(num1.charAt(i));
		
		String num2="55";
		System.out.println(num1 + num2);
	}
	
	
}
	
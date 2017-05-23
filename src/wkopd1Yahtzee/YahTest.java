package wkopd1Yahtzee;

import java.util.Random;
import java.util.Scanner;

public class YahTest {

}

class Dice {
	static int worp23 = 5;
	public static String test ="";
	void beurten() {
	for (int beurte = 1; beurte <= 3; beurte++) {
			test = test+diceReeks();
			System.out.println("Vastgezet zijn: "+ test);
		}
	}

	String diceReeks() {
		String diceString;
		int dicecombi[] = new int[worp23];
		System.out.print
		("De dobbelstenen zijn: ");
		for (int i = 0; i < dicecombi.length; i++) {
			dicecombi[i] = dicethrow();
			System.out.print(dicecombi[i] + " ");
		}
		System.out.println();
		diceString = vastZetten(dicecombi);
		return diceString;
	}

	int dicethrow() {
		Random worp = new Random();
		int eyes = worp.nextInt(6) + 1;
		return eyes;
	}

	String vastZetten(int[] reeks) {
		Scanner kbStr = new Scanner(System.in);
		String vastzetString;
		System.out.print("Welke vastzetten: ");
		vastzetString = kbStr.nextLine();
		worp23 -= vastzetString.length();
		return vastzetString;
	}
}

package wkopd1;

import java.util.Scanner;
import java.util.ArrayList;

public class Spelers {
	static int aantalSpelers;
	Scanner $spelers = new Scanner(System.in);
	public static ArrayList<String> lijst = new ArrayList<>();
	
	void bepaalAantalSpelers(){
		System.out.println("hoeveel spelers: ");
		aantalSpelers = $spelers.nextInt();
		spelerNaamInvoeren();
	}	
	void spelerNaamInvoeren(){
		String naam="";
		for (int i=1; i<= aantalSpelers; i++){
				System.out.println("naam speler " + i +": ");
				naam = $spelers.next();
				lijst.add(naam);
			}			
            System.out.println("deelnemers zijn: "+ lijst);
	}	
}	



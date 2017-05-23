package wkopd2Kermis;

import java.util.Scanner;

public class StartKermis {

	void StartKermis(){
		Scanner invoer = new Scanner(System.in);
		char actie;
		String acties;
		do{
			System.out.println("");
			System.out.println("WAT GAAN WE DOEN? ");
			System.out.println("Attracties laten draaien - A ");
			System.out.println("Omzet berekenen - O");
			System.out.println("Kaartjes berekenen - K");
			System.out.println("Stoppen - S");
			actie = invoer.next().charAt(0);
			switch (actie){
			case 'A':
				attractiesDraaien();
				break;
			case 'O':
				Omzetten omzetten = new Omzetten();
				omzetten.omzetBerekenen();
				break;
			case 'K':
				Kaartjes kaartjes = new Kaartjes();
				kaartjes.kaartjesBerekenen();
				break;
			default:
				break;
			}
		}
		while (actie != 'S');
	}

	void attractiesDraaien(){
		int getal;
		Botsauto botsauto 			= new Botsauto();
		Spin spin 					= new Spin();
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		Spookhuis spookhuis 		= new Spookhuis();
		Hawaii hawaii 				= new Hawaii();
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		System.out.println("Attracties 1 t/m 6, STOPPEN = 9 ");
		do {
			System.out.print("Welke attractie: ");
			Scanner invoer = new Scanner(System.in);
			getal = invoer.nextInt();
			switch (getal){
			case 1:
				botsauto.attractieDraait("BOTSAUTO");
				botsauto.setBotsautoOmzet();
				break;
			case 2:
				spin.attractieDraait("SPIN");
				spin.setSpinOmzet();
				break;
			case 3:
				spiegelpaleis.attractieDraait("SPIEGELPALEIS");
				spiegelpaleis.setSpiegelpaleisOmzet();
				break;
			case 4:
				spookhuis.attractieDraait("SPOOKHUIS");
				spookhuis.setSpookhuisOmzet();
				break;
			case 5:
				hawaii.attractieDraait("HAWAII");
				hawaii.setHawaiiOmzet();
				break;
			case 6:
				ladderklimmen.attractieDraait("LADDERKLIMMEN");
				ladderklimmen.setLadderklimmenOmzet();
				break;
			default:
				break;
			}
		} while (getal != 9);


	}

}

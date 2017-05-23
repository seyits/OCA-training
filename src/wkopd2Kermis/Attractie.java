package wkopd2Kermis;

public class Attractie {
	
	double kaartjeBotsauto = 2.5;
	double kaartjeSpin = 2.25;
	double kaartjeSpiegelpaleis = 2.75;
	double kaartjeSpookhuis = 3.20;
	double kaartjeHawaii = 2.90;
	double kaartjeLadderklimmen = 5.00;
	String attractie;
	
	void attractieDraait(String attractie){
		this.attractie = attractie;
		System.out.println("De "+ attractie + " draait");
	}
	
}
package wkopd2Kermis;

public class Ladderklimmen extends Attractie{
	private static double omzet;
	static private int kaartjes;
	Ladderklimmen(){
	}

	void setLadderklimmenOmzet(){
		this.omzet = this.omzet + kaartjeLadderklimmen;	
		this.kaartjes = this.kaartjes + 1;
	}
	double getLadderklimmenOmzet(){
		return this.omzet;
	}
	int getLadderklimmenKaartjes(){
		return this.kaartjes;
	}



}

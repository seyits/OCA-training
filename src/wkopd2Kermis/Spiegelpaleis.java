package wkopd2Kermis;

public class Spiegelpaleis extends Attractie{
	
	static private double omzet;
	static private int kaartjes;
	
	Spiegelpaleis(){
	}
	void setSpiegelpaleisOmzet(){
		this.omzet = this.omzet + kaartjeSpiegelpaleis;
		this.kaartjes = this.kaartjes + 1;
	}
	double getSpiegelpaleisOmzet(){
		return this.omzet;
	}
	
	int getSpiegelpaleisKaartjes(){
		return this.kaartjes;
	}

}

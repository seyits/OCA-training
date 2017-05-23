package wkopd2Kermis;

public class Spookhuis extends Attractie{

	private static double omzet;
	static private int kaartjes;
	
	Spookhuis(){
	}

	void setSpookhuisOmzet(){
		this.omzet = this.omzet + kaartjeSpookhuis;
		this.kaartjes = this.kaartjes + 1;
	}
	double getSpookhuisOmzet(){
		return this.omzet;
	}
	int getSpookhuisKaartjes(){
		return this.kaartjes;
	}
}

package wkopd2Kermis;

public class Botsauto extends Attractie{
	
	static private double omzet;
	static private int kaartjes;
	Botsauto(){ 
	}
	void setBotsautoOmzet(){
		this.omzet = this.omzet + kaartjeBotsauto;
		this.kaartjes = this.kaartjes + 1;
	}
	double getBotsautoOmzet(){
		return this.omzet;
	}
	int getBotsautoKaartjes(){
		return this.kaartjes;
	}

}

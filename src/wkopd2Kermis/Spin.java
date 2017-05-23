package wkopd2Kermis;

public class Spin extends Attractie {
	
	static private double omzet;
	static private int kaartjes;
	
	Spin(){
	}
	
	void setSpinOmzet(){
		this.omzet = this.omzet + kaartjeSpin;	
		this.kaartjes = this.kaartjes + 1;
	}
	double getSpinOmzet(){
		return this.omzet;
	}
	int getSpinKaartjes(){
		return this.kaartjes;
	}

	
}

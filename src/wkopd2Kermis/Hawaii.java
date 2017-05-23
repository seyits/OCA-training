package wkopd2Kermis;

public class Hawaii extends Attractie{
	static double omzet;
	static private int kaartjes;

	Hawaii(){	
	}

	void setHawaiiOmzet(){
		this.omzet = this.omzet + kaartjeHawaii;
		this.kaartjes = this.kaartjes + 1;
	}
	double getHawaiiOmzet(){
		return this.omzet;
	}
	int getHawaiiKaartjes(){
		return this.kaartjes;
	}

}

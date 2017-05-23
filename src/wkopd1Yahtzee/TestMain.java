package wkopd1Yahtzee;

public class TestMain {

	public static void main(String[] args) {
		Spelers spelersAantal = new Spelers();
		spelersAantal.bepaalAantalSpelers();
		Dice dice = new Dice();
		dice.beurten();
		
	}

}

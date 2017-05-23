package wkopd2Kermis;

public class Kaartjes {
	static int kaartjesAttracties;
	
	Botsauto botsauto 			= new Botsauto();
	Spin spin 					= new Spin();
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	Spookhuis spookhuis 		= new Spookhuis();
	Hawaii hawaii 				= new Hawaii();
	Ladderklimmen ladderklimmen = new Ladderklimmen();

	void kaartjesBerekenen(){
		
		System.out.println("Botsauto " + botsauto.getBotsautoKaartjes());
		System.out.println("Spin " + spin.getSpinKaartjes());
		System.out.println("Spiegelpaleis " + spiegelpaleis.getSpiegelpaleisKaartjes());
		System.out.println("Spookhuis " + spookhuis.getSpookhuisKaartjes());
		System.out.println("Hawaii " + hawaii.getHawaiiKaartjes());
		System.out.println("Ladderklimmen " + ladderklimmen.getLadderklimmenKaartjes());
		kaartjesAttracties = 	botsauto.getBotsautoKaartjes()+
								spin.getSpinKaartjes()+
								spiegelpaleis.getSpiegelpaleisKaartjes()+
								spookhuis.getSpookhuisKaartjes()+
								hawaii.getHawaiiKaartjes()+
								ladderklimmen.getLadderklimmenKaartjes();
		System.out.println("Totaal aantal verkochte kaartjes: " + kaartjesAttracties);
		System.out.println();
	}
}

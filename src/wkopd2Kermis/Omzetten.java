package wkopd2Kermis;

public class Omzetten {
	static double omzetAttracties;
	
	Botsauto botsauto 			= new Botsauto();
	Spin spin 					= new Spin();
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	Spookhuis spookhuis 		= new Spookhuis();
	Hawaii hawaii 				= new Hawaii();
	Ladderklimmen ladderklimmen = new Ladderklimmen();

	void omzetBerekenen(){
		
		System.out.println("Botsauto " + botsauto.getBotsautoOmzet());
		System.out.println("Spin " + spin.getSpinOmzet());
		System.out.println("Spiegelpaleis " + spiegelpaleis.getSpiegelpaleisOmzet());
		System.out.println("Spookhuis " + spookhuis.getSpookhuisOmzet());
		System.out.println("Hawaii " + hawaii.getHawaiiOmzet());
		System.out.println("Ladderklimmen " + ladderklimmen.getLadderklimmenOmzet());
		omzetAttracties = 	botsauto.getBotsautoOmzet()+
							spin.getSpinOmzet()+
							spiegelpaleis.getSpiegelpaleisOmzet()+
							spookhuis.getSpookhuisOmzet()+
							hawaii.getHawaiiOmzet()+
							ladderklimmen.getLadderklimmenOmzet();
		System.out.println("Totaalomzet alle attracties: " + omzetAttracties);
		System.out.println();
	}
//	void omzet(){
//		
//	}

}

package nl.kadaster.oca;

public class H3 {

	public static void main(String args[]){
		Test test = new Test ();
		test.instanceVariabele = 12;
		test = null;
		{ //begin  van een scope
			int getal = 5 ; // lokale variabele
			System.out.println(getal);
		} //einde v/d scope. Hier bestaat de eerste lokale variabele niet meer
		{
			{
				int getal = 4 ;
			} // hierna is de 2e lokale variabele dood
			
			// System.out.println(getal);
		}
		// System.out.println(getal);
		
		Auto mijnAuto = new Auto();
		mijnAuto.besturen();
		mijnAuto.autoSchilderen("zwart");
		System.out.println(mijnAuto.kleur);

		Auto mijn2Auto = new Auto();
		mijn2Auto.autoSchilderen("wit");
	}
	
	
}

class Auto {
	static int aantalWielen = 4;
	int aantalRuiten;
	String kleur;
	void besturen(){
		System.out.println("Ga maar rijden. broem broem");
	}
	
	void autoSchilderen(String watvoorKleur){
		System.out.println("We gaan de auto " + watvoorKleur + " Schilderen");
	}
}


class Test{
	static int classVariabele; //class/static
	int instanceVariabele; // per object/instatntie v/e class -> fields
	
}
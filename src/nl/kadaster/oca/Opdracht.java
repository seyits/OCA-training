package nl.kadaster.oca;

public class Opdracht {



	public static void main(String[] args){
		Kaart[] hand = new Kaart[5];

		// 1 statement kaarten aan Croupier
		for(int i = 0; i< hand.length; i++){
//			System.out.println(hand[i].waarde);
			System.out.println(hand[i]);
		}
	}

}

class Croupier{
	// methode Kaarten array schudden
}
class Kaart{
	int waarde;
}

// Alleen de kaarten 23456789
//1 er bestaan gelijke kaarten
//2 er bestaan geen gelijke kaarten

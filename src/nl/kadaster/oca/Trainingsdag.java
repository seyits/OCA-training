package nl.kadaster.oca;

public class Trainingsdag {

	public static void main(String [] ARGGGrgs) {
		
		int getal1 = 5;
		int getal2 = getal1;
		getal1 = 10;
		System.out.println(getal2);
		
		Tafel tafel1 = new Tafel();
		Tafel tafel3;
		tafel3 = new Tafel();
		Tafel tafel4 = new Tafel();
		tafel1.aantalPoten = 4;
		Tafel tafel2 = new Tafel();
		//Tafel tafel2 = tafel1;
		tafel1.aantalPoten = 10;
		System.out.println("tafel3 "+ tafel3);
		System.out.println("tafel4 "+ tafel4);
		System.out.println("tafel1 "+ tafel1);
		System.out.println("tafel2 "+ tafel2);
	}

}

class Tafel{
	int aantalPoten;
}

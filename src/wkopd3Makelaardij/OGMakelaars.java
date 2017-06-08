package wkopd3Makelaardij;
import java.util.ArrayList;
public class OGMakelaars {
	public static void main(String[] args) {
		new OnroerendGoed().startMethod();
	}
}

class OnroerendGoed extends Personeel {
	void startMethod(){

		Personeel makelaar1 = new Personeel();

		OGoed villa1 = new Villa("Holm 17 ", "Bornholm ", 500000);
		OGoed villa2 = new Villa("IJweg 253 ", "Toolenburg ", 750000);
		OGoed appartement1 = new Appartement("Jojostraat 182 ", "Slotervaart ", 220000);
		OGoed appartement2 = new Appartement("Rozengracht 126 ", "Centrum ", 1720000);
		OGoed rijtjeshuis1 = new Rijtjeshuis("Hamelenburg 27 ", "Toolenburg ", 260000);
		OGoed rijtjeshuis2 = new Rijtjeshuis("Abidinstraat 23 ", "Pax ", 220000);
		OGoed woonboot1 = new Woonboot("Klaprozen 32 ", "Noord ", 350000);
		OGoed woonboot2 = new Woonboot("Achtergracht 79 ", "Centrum ", 2200000);
		OGoed caravan1 = new Caravan("Duinrell 82 ", "Wassenaar ", 22000);
		OGoed caravan2 = new Caravan("Twello 94 ", "Deventer ", 19000);

		ArrayList <OGoed> lijst = new ArrayList<>();
		lijst.add(villa1);
		lijst.add(villa2);
		lijst.add(appartement1);
		lijst.add(appartement2);
		lijst.add(rijtjeshuis1);
		lijst.add(rijtjeshuis2);
		lijst.add(woonboot1);
		lijst.add(woonboot2);
		lijst.add(caravan1);
		lijst.add(caravan2);

		for (OGoed element: lijst){
			System.out.println(element.strEnNr+element.plaats+element.type+element.vraagPrijs);
		}

		villa2.PotenteKoper("sam");
		villa2.PotenteKoper("sammie");
		villa2.PotenteKoper("kijkomhoogsammie");

		caravan1.PotenteKoper("moos");
		caravan1.PotenteKoper("moes");
		caravan1.PotenteKoper("moestafa");

		villa2.laatKopersZien();
		caravan1.laatKopersZien();

	}
}

class OGoed{
	String[] arrKoper = new String[5]; 

	OGoed(String strEnNr, String plaats, String type, int vraagprijs){
		this.strEnNr = strEnNr;
		this.plaats = plaats;
		this.type = type;
		this.vraagPrijs = vraagprijs;
	}

	String strEnNr;
	String plaats;
	String type;
	int vraagPrijs;

	void PotenteKoper(String koper){
		for (int i = 0 ; i < arrKoper.length; i++){
			if (arrKoper[i] == null){
				arrKoper[i] = koper;
				break;
			}
		}
	}
	void laatKopersZien(){
		for (int i = 0; i < arrKoper.length; i++){
			System.out.print(arrKoper[i]+" ");
		}
		System.out.println();

	}
 
}

class Villa extends OGoed{
	int perceelOppervlakte;
	Villa(String strEnNr, String plaats, int vraagprijs){
		super(strEnNr, plaats, " Villa ", vraagprijs);
	}

}

class Appartement extends OGoed implements Servicekosten{
	int verdieping;
	Appartement(String strEnNr, String plaats, int vraagprijs){
		super(strEnNr, plaats, " Appartement ", vraagprijs);
	}

}
class Rijtjeshuis extends OGoed{
	int verdieping;
	Rijtjeshuis(String strEnNr, String plaats, int vraagprijs){
		super(strEnNr, plaats, " Rijtjeshuis ", vraagprijs);
	}

}
class Woonboot extends OGoed implements Vergunning{
	int verdieping;
	public void vergunningVerlengen(){

	}
	Woonboot(String strEnNr, String plaats, int vraagprijs){
		super(strEnNr, plaats, " Woonboot ", vraagprijs);
	}

}
class Caravan extends OGoed implements Vergunning, Servicekosten{
	int verdieping;
	public void vergunningVerlengen(){

	}
	Caravan(String strEnNr, String plaats, int vraagprijs){
		super(strEnNr, plaats, " Caravan ", vraagprijs);
	}

}

interface Vergunning{
	void vergunningVerlengen();
}
interface Servicekosten{
	default void berekenServicekosten(){
	}
}
class Personeel{
	String voorAchternaam;
	int leeftijd;
	String beroep;
	String diploma;
	int jarenErvaring;
	StringBuilder training;

}
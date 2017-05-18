package nl.kadaster.oca;

public class Bossen {

	public static void main(String[] args) {
	
		Bos zwartewoud = new Bos("Zwarte Woud");
		Bos veluwe = new Bos("Hoge Veluwe");
		Bos vuursche = new Bos();
		System.out.println(vuursche);
		zwartewoud.setAantalBomen(150);
		veluwe.setAantalBomen(3000);
		zwartewoud.setBosNaam("Zwarte Woud");
		veluwe.setBosNaam("Hoge Veluwe");
		
		
		System.out.println(zwartewoud.getAantalBomen());
		System.out.println(veluwe.getAantalBomen());
		System.out.println(zwartewoud.getBosNaam());
		System.out.println(veluwe.getBosNaam());
	}
}

class Bos{
	private int aantalBomen;
	private String bosNaam;
	
	Bos(){
		System.out.println("lege Bos constructor");
	}
	
	Bos(String bosNaam){
		this.bosNaam = bosNaam;
		System.out.println("Bosnaam in de class" + bosNaam);
	}
	
	void setAantalBomen(int aantalBomen){
		this.aantalBomen = aantalBomen;
	}
	void setBosNaam(String bosNaam){
		this.bosNaam = bosNaam;
	}
	
	int getAantalBomen(){	
		return this.aantalBomen;
	}
	String getBosNaam(){
		return this.bosNaam;
	}
	
}
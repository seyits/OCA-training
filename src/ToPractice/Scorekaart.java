package ToPractice;

public class Scorekaart {
	Instantie tbvnethod2 = new Instantie();
	int ghi;
	Integer jik;

	public static void main (String[] args){
		double aa, bb;
		aa=10.1;
		bb= 20.5;
		int a;
		System.out.println(add(aa,bb));	
		Scorekaart sckaart = new Scorekaart();
		
		sckaart.add(aa, bb);
		sckaart.main2method();
	}
	static int add(double a, double b) {
		return (int)(a + b);
	}
	void main2method(){
		tbvnethod2.syso();
		Scorekaart sckaaart = new Scorekaart();
		System.out.println(sckaaart.add(2.7, 3.2));
	}
class Instantie{
	
	Scorekaart2 instantie = new Scorekaart2();
	Scorekaart2 instantie2 = new Scorekaart2();
	Scorekaart2 instantie3 = new Scorekaart2();
	void syso() {
		
		instantie.meth1();
		instantie.instantieVar=9;
		instantie2.instantieVar=18;
		instantie3.instantieVar=27;
		System.out.println(instantie.instantieVar);
		System.out.println(instantie2.instantieVar);
		System.out.println(instantie3.instantieVar);
	}
	
	
}
}

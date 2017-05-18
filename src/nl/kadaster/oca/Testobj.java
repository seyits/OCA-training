package nl.kadaster.oca;

public class Testobj {

	static int a = 10;
	int b = 20;
	// System.out.println(testobj1.b); ge eft syntax error
	
	public static void main(String[] args) {
		
		Testobj testobj = new Testobj();
		Testobj testobj1 = new Testobj();
		
		// testobj = null;
		System.out.println(testobj);
		
		testobj1.a = 11;
		
		System.out.println(testobj1.a);
		System.out.println(testobj.a);
		System.out.println(testobj1.b);
		System.out.println(testobj.b);
		
		testobj.b=21;
		
		System.out.println(testobj1.b);
		System.out.println(testobj.b);
		
		

	}

}

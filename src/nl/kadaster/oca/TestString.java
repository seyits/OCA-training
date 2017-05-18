package nl.kadaster.oca;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String oo = new String();
		System.out.println(oo);
		int j= oo.length();
		
		TestString ts = new TestString();
		System.out.println(ts);
		
		
		String test = "Hallo";
		System.out.println(test.replace("ll", "LL"));
		test.replace("l", "$");
		System.out.println(test);
		test = test.replace("l", "$");
		System.out.println(test);

		String str1 = "Hallo"; // verwijzing naar String pool, is een directe assignment
		String str2 = "Hello"; // verwijzing naar String pool
		str2 = str2.replace('e', 'a'); // deze gaat naar de HEAP, geen directe assignment
		
		System.out.println(str1 == str2);
		
		String str3 = new String("Hallo");
		String str4 = new String("Hallo");
		
	}

}

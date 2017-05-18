package nl.kadaster.oca;

public class TestVar {

	public static void main(String[] args) {
		
	/*	int constant = 100;
		int CONSTANT = 200;
		String cons = "300 ";
		String ons = " 400";
		*/
		
		long set = 123456789123456789l;
		byte by = 10;
		short sh = 267;
		long hex = 0413l;
		long dec = 267L;
		char ui = '\u000F';
		float fl = 20.0f;
		char a = 'a';
		double a5 = 10;
		byte a7 = -0;
		
		System.out.println(++a);
		System.out.println(a7);
		System.out.println(a5);
		System.out.println(dec == sh);
		System.out.println((float)by);
		System.out.println((byte)fl);
		
		//System.out.println(++     constant     );
		//System.out.println(constant = 1*   --   constant);
		//System.out.println(constant++>100);
		int int1=10,int2=20,int3=30;
		System.out.println(int1%int2*int3+int1/int2);
		System.out.println(18%20);
		
		
		
		
	}

}

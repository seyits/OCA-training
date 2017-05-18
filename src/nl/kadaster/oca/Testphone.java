package nl.kadaster.oca;

class Phone{
	 String phonenumber = "123456789";
	void setNumber(){
		String phonenumber;
		phonenumber = "987654321";
	}
}





class Testphone {
	public static void main(String [] args){
		Phone p1 = new Phone();
		p1.setNumber();
		System.out.println(p1.phonenumber);
	}

}

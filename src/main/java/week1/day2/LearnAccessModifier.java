package week1.day2;

public class LearnAccessModifier {

	 void phoneNumber() {
		System.out.println("123456789");

	}
	private void atmPin() {
		System.out.println("1234");
		

	}
	public void name() {
		System.out.println("Subraja");
	}
	public static void main(String[] args) {
		
		LearnAccessModifier obj= new LearnAccessModifier();
		obj.atmPin();
		obj.name();
		obj.phoneNumber();
	}

}

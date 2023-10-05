package week1.day2;

public class LearnVariables {


	String brandName="Honda";
	int noOfWheels=4;
	public void brandName(){
		System.out.println(brandName);

	}
	public void wheels() {
		System.out.println(noOfWheels);
		System.out.println(brandName);

	}
	public static void main(String[] args) {	
		LearnVariables obj=new LearnVariables();
		System.out.println(obj.brandName);
		obj.wheels();
		
		LearnAccessModifier lam=new LearnAccessModifier();
		lam.phoneNumber();
		lam.name();
		
	}

}

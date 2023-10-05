package week1.day2;

public class LearnReturnStatements {

	public void add() {
		int a=5;
		int b=18;
		System.out.println(a+b);
	}

	public int addThreeNames(int a, int b, int c) {
		return a+b+c;

	}
	
	public boolean switchOff() {
		return true;
		
	}
	public String getPhoneName() {
		System.out.println("Subi");
		return "Vivo";

	}
	public static void main(String[] args) {
		LearnReturnStatements lrs=new LearnReturnStatements();
		lrs.add();
		int addThreeNames = lrs.addThreeNames(1,2,3);
		System.out.println(addThreeNames);

	}

}

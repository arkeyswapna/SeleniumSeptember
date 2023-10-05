package week1.day2;

public class Calculator {
	public int sub(int a, int b) {
		return(a-b);

	}
	public int mul(int a, int b) {
		return(a*b);

	}
	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		int a=c.sub(5,3);
		System.out.println(a);
		int mul = c.mul(5,3);
		System.out.println(mul);
	}

}

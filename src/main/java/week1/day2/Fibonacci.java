package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int f;
		for(int i=1;i<=11;i++) {
			System.out.println(n1);
			f=n1+n2;
			n1=n2;
			n2=f;

	}

}
}
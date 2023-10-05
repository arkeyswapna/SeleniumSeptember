package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=21;
		int count=0;
	
	for (int i = 2; i <n; i++) {		
		if(n%i==0) {
			count++;			
			break;
		}
	}
		if(count==0) {
			System.out.println(n+" is a prime number");
		}
			else
		{
			System.out.println(n+" is not a prime number");
		}
	

	}

}

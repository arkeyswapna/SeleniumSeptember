package week3.day3;

public class LearnConstructor {

//Global variables	
	int empId;
	String empName;
	boolean empStatus;
	public LearnConstructor() {
		System.out.println(" I am the default constructor");
		empId=100;
		empName="Subraja";
		empStatus=true;
	}
	LearnConstructor(int a, String b, boolean c)
	{
		System.out.println("I am from Parameterized constructor");
		empId=a;
		empName=b;
		empStatus=c;
		
	}
	
	public static void main(String[] args) {
		LearnConstructor lc1 = new LearnConstructor(200, "Subi", false);
		System.out.println(lc1.empId);
		System.out.println(lc1.empName);
		System.out.println(lc1.empStatus);
		
		LearnConstructor lc = new LearnConstructor(); 
		System.out.println(lc.empId);
		System.out.println(lc.empName);
		System.out.println(lc.empStatus);
		
	}

}

package week3.day3;

public class LearnThis extends ParentClass{
	public void launchChrome() {
		super.launchOpera();
		System.out.println("Launch Browser");
	}
	public void launchsafari() {
		this.launchChrome();
		System.out.println("Launch Browser");
	}
	public static void main(String[] args) {
		LearnThis lt = new LearnThis();
		
		lt.launchsafari();

	}

}

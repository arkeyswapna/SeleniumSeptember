package week1.day1;

public class Car{

	public void driveCar() {
		System.out.println("Car Started");
	}
	public void applyBrake() {
		System.out.println("Car stopped");

	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.driveCar();
		obj.applyBrake();

	}

}

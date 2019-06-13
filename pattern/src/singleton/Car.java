package singleton;

public class Car {

	public static int serialNum = 10001;
	public int CarNum;
	public static Car CreateCar;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;

	}

	public int getCarNum() {
		
		return CarNum;
	}

	public static Car CreateCar() {
		
		return CreateCar;
	}
	
}
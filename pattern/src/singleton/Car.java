package singleton;

public class Car {

	public static int serialNum = 10001;
	public int CarNum;
	public Car CreateCar;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;

	}
	

	public int[] getCarNum() {
		// TODO Auto-generated method stub
		return getCarNum();
	}


	public static Car CreateCar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
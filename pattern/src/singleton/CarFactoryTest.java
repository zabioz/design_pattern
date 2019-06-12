package patten;

public class CarFactoryTest {

	public static void main(String[] args) {
		Car mySonata = Car.CreateCar();
		Car youSonata = Car.CreateCar();
		
		
		System.out.println(mySonata.getCarNum());
		System.out.println(youSonata.getCarNum());
	}
	
}

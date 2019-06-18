package Decorator;

public class DecoratorMain {
	public static void main(String[] args) {
	
	Cookie braveCookie = new BraveCookie();
		
	Cookie milkBraveCookie = new MilkTopping(braveCookie);

	Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);
		

	Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);
		
	System.out.println(chocolateDoubleMilkBraveCookie.getName());
		
	
	Cookie SodaCookie = new Cookie() {
		@Override
		public String getName() {
		return "소다 쿠키";
		}
	};

	SodaCookie = new ChocolateTopping(new ChocolateTopping(SodaCookie));
	
	System.out.println(SodaCookie.getName());
	}
}		


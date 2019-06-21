package Decorator;

public class ChocolateTopping extends Topping{

	public ChocolateTopping(Cookie cookie) {
		super(cookie);
	}

	@Override
	public String getName() {
		return "chocolate taste" + cookie.getName();
	}
}

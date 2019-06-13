package FactoryMethod;

public class PizzaFactory extends Factory {
	@Override
	public Pizza createPizza (String name) {
		switch (name) {
		case "Tomato" : return new TomatoPizza();
		case "Cheese" : return new CheesePizza();
		}
		return null;
	}

}

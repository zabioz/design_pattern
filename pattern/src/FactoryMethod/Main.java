package FactoryMethod;

public class Main {
	
	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.createPizza("Tomato");
        Pizza pizza2 = pizzaFactory.createPizza("Cheese");
         
        System.out.println(pizza1.getName()+"\n");
        System.out.println(pizza2.getName()+"\n");
	}

}

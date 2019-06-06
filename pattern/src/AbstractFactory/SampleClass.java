package AbstractFactory;

import java.util.*;

public class SampleClass {

	public static void main(String args[]) {
		HotPot hotPot = new HotPot(new Pot());
		hotPot.addSoup(new ChickenBonesSoup());
		hotPot.addMain(new Chicken());
		List<Vegetable> vegetable = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage());
		vegetables.add(new Leek());
		vegetables.add(new Chrysanthemum());
		hotPot.addVegetables(vegetables);
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tofu());
		hotPot.addOtherIngredients(otherIngredients);
		
	}
}

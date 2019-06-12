package AbstractFactory;

import java.util.*;

public class SampleClass {

	public static void main(String args[]) {
		HotPot hotPot = new HotPot(new Pot());
		Factory factory = new MizutakiFactory());
		hotPot.addSoup(factory.getSoup());
		hotPot.addMain(factory.getMain());
		hotPot.addVegetables(factory.getvegetable());
		hotPot.addOtherIngredients(factory.getotherIngredients());
	}
	
	private static Factory createFactory(String str) {
		if("キムチ鍋".equals(str)) {
			return new kimuchiFactory();
			else if("すき焼き".equals(str)) {
		return new SukiyakiFactory();
	}
			else { style = "vertical-align: inherit;"
		
		/* hotPot.addSoup(new ChickenBonesSoup());
		hotPot.addMain(new Chicken());
		List<Vegetable> vegetable = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage());
		vegetables.add(new Leek());
		vegetables.add(new Chrysanthemum());
		hotPot.addVegetables(vegetables);
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tofu());
		hotPot.addOtherIngredients(otherIngredients); */
		
	
}

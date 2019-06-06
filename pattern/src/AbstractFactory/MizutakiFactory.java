package AbstractFactory;

import java.util.*;

public class MizutakiFactory extends Factory{
	public Soup getSoup() {
		return new ChickenBonesSoup();
	}

	public Protein getMain() {
	return new Chicken();
}
public List<Vegetable> getVegetables
}



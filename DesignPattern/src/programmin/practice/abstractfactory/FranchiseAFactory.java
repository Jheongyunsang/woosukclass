package programmin.practice.abstractfactory;
import programming.practice.factory.CheesePizza;
import programming.practice.factory.Pizza;
import programming.practice.factory.VeggiePizza;

public class FranchiseAFactory implements MenuFactory {

	@Override
	public Pizza createPizza(String name) {
		// TODO Auto-generated method stub
		Pizza piz = null;
		
		if(name.equals("veggie")) {
			piz = new VeggiePizza();
		} else if (name.equals("cheese")) {
			piz = new CheesePizza();
			
		}
		return piz;
	}

	@Override
	public Beverage crateBeverage(String name) {
		// TODO Auto-generated method stub
		Beverage bva = null;
		
		if(name.equals("coffee")) {
			bva = new Coffee();
		} else if(name.equals("cola")) {
			bva = new Cola();
		}
		
		return bva;
	}

}

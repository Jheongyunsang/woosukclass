package programmin.practice.abstractfactory;
import programming.practice.factory.ClamPizza;
import programming.practice.factory.Pizza;
import programming.practice.factory.PepperoniPizza;
public class FranchiseBFactory implements MenuFactory {

	@Override
	public Pizza createPizza(String name) {
		// TODO Auto-generated method stub
		Pizza piz = null;
		
		if(name.equals("clam")) {
			piz = new ClamPizza();
		} else if(name.equals("pepperoni")) {
			piz = new PepperoniPizza();
		}
		
		return piz;
	}

	@Override
	public Beverage crateBeverage(String name) {
		// TODO Auto-generated method stub
		Beverage bva = null;
		
		if(name.equals("bear")) {
			bva = new Bear();
		} else if (name.equals("soju")) {
			bva = new Soju();
		}
		
		return bva;
	}

}

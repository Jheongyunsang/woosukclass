package programmin.practice.abstractfactory;
import programming.practice.factory.Pizza;
public abstract class PizzaStore {
	protected MenuFactory menuFactory;
	
	public Pizza orderPizza(String name) {
		Pizza piz = this.menuFactory.createPizza(name);
		if(piz != null) {
			piz.prepare();
			piz.bake();
			piz.cut();
			piz.box();
		} 
		return piz;
	}
	public Beverage orderBeverage(String name) {
		Beverage bva = this.menuFactory.crateBeverage(name);
		if(bva != null) {
			bva.prepare();
			bva.putInCup();
		}
		return bva;
	}
}

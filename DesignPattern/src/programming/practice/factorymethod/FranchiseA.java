package programming.practice.factorymethod;

import programming.practice.factory.*;

public class FranchiseA extends PizzaStore {

	@Override
	protected Pizza createPizza(String name) {
		// TODO Auto-generated method stub
		System.out.println("프랜차이즈A");
		Pizza pizza = null;
		
		if(name.equals("cheese")){
			pizza  = new CheesePizza();
		}else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		
		return pizza;
	}

}

package programming.practice.factorymethod;
import programming.practice.factory.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프랜차이즈 에이
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"고객 전달\n");
	
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"고객 전달\n");
	
		pizza = pizzaStore.orderPizza("Veggie");
		System.out.println(pizza+"고객 전달\n");
	
		
		//프랜차이즈 비
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"고객 전달\n");
	
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"고객 전달\n");
	
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"고객 전달\n");
	
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+"고객 전달\n");
	
	}

}

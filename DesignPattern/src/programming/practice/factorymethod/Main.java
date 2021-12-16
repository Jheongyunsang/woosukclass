package programming.practice.factorymethod;
import programming.practice.factory.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������� ����
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"�� ����\n");
	
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"�� ����\n");
	
		pizza = pizzaStore.orderPizza("Veggie");
		System.out.println(pizza+"�� ����\n");
	
		
		//���������� ��
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+"�� ����\n");
	
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+"�� ����\n");
	
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+"�� ����\n");
	
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+"�� ����\n");
	
	}

}

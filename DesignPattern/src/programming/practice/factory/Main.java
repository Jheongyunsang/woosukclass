package programming.practice.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore pizstr = new PizzaStore();
		
		Pizza piz = pizstr.orderPizza("cheese");
		System.out.println(piz+"°í°´ Àü´Þ\n");
		
		piz = pizstr.orderPizza("clam");
		System.out.println(piz+"°í°´ Àü´Þ\n");
		
		piz = pizstr.orderPizza("pepperoni");
		System.out.println(piz+"°í°´ Àü´Þ\n");
		
		piz = pizstr.orderPizza("veggie");
		System.out.println(piz+"°í°´ Àü´Þ\n");
		
		
		
	}

}

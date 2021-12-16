package programmin.practice.abstractfactory;
import programming.practice.factory.Pizza;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore pizstr = new FranchiseA();
		Pizza piz = pizstr.orderPizza("veggie");
		Beverage bva = pizstr.orderBeverage("coffee");
		System.out.println(piz+"°í°´ Àü´Þ");
		System.out.println(bva+"°í°´ Àü´Þ\n");
	}

}

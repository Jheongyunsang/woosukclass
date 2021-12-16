package programming.practice.decorator; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new DarkRoast();
		System.out.println(beverage.getDescription()+":"+beverage.cost());
		
		
		 Beverage caffemocha = new Milk(new Chcolate(new DarkRoast()));
		 System.out.println(caffemocha.getDescription()+" : "+caffemocha.cost());
	}

}

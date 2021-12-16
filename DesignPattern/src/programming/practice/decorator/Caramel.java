package programming.practice.decorator;

public class Caramel extends CondimentDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
		this.description = ", Ä«¶ó¸á Ãß°¡";
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+ this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.9;
	}

}

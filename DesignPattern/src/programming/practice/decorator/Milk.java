package programming.practice.decorator;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		this.description = ", ���� �߰�";
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+this.description; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 1.5;
	}

}

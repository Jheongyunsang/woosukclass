package programming.practice.decorator;

public class Chcolate extends CondimentDecorator {

	public Chcolate (Beverage beverage) {
		super(beverage);
		this.description=", ���ݷ� �߰�";
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+1.0;
	}

}

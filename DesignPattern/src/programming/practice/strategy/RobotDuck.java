package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public class RobotDuck extends Duck{	
	public RobotDuck() {
		this.quackable = new Quack();
		this.swaimable = new SwimWithLesg();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("·Îº¿¿À¸®");
	}

}

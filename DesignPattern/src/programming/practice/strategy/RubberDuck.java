package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public class RubberDuck extends Duck {
	public RubberDuck() {
		this.quackable = new Squeak();
		this.swaimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("³ª´Â °í¹«¿À¸®~");
	}

/*	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("»à! »à!");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("µÕµÕ ¶°´Ù´Ï´Â Áß...");
	}  */

}

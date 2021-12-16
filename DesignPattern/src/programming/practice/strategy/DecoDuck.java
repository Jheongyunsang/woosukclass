package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public class DecoDuck extends Duck {
	public DecoDuck() {
		this.quackable = new MuteQuack();
		this.swaimable = new FloatOnWater();
		this.flyable  = new FlyNoWay();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 가짜오리~");
	}

/*	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}  */

}

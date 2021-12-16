package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public class MallardDuck extends Duck {
	public MallardDuck(){
		this.quackable = new Quack();
		this.swaimable = new SwimWithLesg();
		this.flyable = new FlyWithWings();
	}
	
	
	@Override
	public void display() {
		System.out.println("나는 청동오리~");

	}

}

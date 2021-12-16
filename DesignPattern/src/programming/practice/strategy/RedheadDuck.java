package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		this.quackable = new Quack();
		this.swaimable = new SwimWithLesg();
		this.flyable = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("³ª´Â ¾Æ¸Þ¸®Ä«ÈòÁ×Áö~");

	}

}

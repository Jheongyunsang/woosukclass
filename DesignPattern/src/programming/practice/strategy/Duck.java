package programming.practice.strategy;
import programming.practice.strategy.behavior.*;

public abstract class Duck {
	protected Quackable quackable;
	protected Flyable flyable;
	protected Swimable swaimable;
	
	public void quack() {
		this.quackable.quack();
		}
	
	public void swim() {
		this.swaimable.swim();
	}
	public abstract void display();
	
	public void  fly() {
		this.flyable.fly();
	}
 		}
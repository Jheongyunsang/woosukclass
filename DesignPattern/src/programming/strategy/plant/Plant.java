package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public abstract class Plant {
	protected Atkable atkable;
	protected Shelidable shelidable;
	
	public void atk() {
		this.atkable.atk();
	}
	public void shelid() {
		this.shelidable.shelid();
	}
	public abstract void product();
	public abstract void display();
}

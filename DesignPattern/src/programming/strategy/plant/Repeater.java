package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Repeater extends Plant {

	public Repeater() {
		this.atkable = new DoubleAtk();
		this.shelidable = new Noshelid();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Repeater");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		System.out.println("Äá »ý»ê!");
	}

}

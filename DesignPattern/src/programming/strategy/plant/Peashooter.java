package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Peashooter extends Plant {
	public Peashooter() {
		this.atkable = new Atk();
		this.shelidable = new Noshelid();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Peashooter");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		System.out.println("Äá »ý»ê!");
	}

}

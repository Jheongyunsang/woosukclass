package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Wallnut extends Plant {

	public Wallnut() {
		this.atkable = new NoAtk();
		this.shelidable = new Shelid();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Wallnut");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		
	}

}

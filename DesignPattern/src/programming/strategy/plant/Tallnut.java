package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Tallnut extends Plant {

	public Tallnut() {
		this.atkable = new NoAtk();
		this.shelidable = new Shelid();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Tallnut");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		
	}

}

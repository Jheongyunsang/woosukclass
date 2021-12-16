package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Sunflower extends Plant {
	public Sunflower() {
		this.atkable = new NoAtk();
		this.shelidable = new Noshelid();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sunflower");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		System.out.println("에너지 생산!");
	}

}

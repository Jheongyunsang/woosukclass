package programming.strategy.plant;
import programming.strategy.plant.behavior.*;

public class Sunshromm extends Plant {

	public Sunshromm() {
		this.atkable = new NoAtk();
		this.shelidable = new Noshelid();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sunshroom");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		System.out.println("에너지 생산!");
	}
	
}

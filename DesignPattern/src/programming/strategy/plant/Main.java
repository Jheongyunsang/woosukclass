package programming.strategy.plant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plt = new Peashooter();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
		
		plt = new Repeater();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
		
		plt = new Sunflower();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
		
		plt = new Sunshromm();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
		
		plt = new Tallnut();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
		
		plt = new Wallnut();
		plt.display();
		plt.product();
		plt.atk();
		plt.shelid();
		System.out.println();
	}

}

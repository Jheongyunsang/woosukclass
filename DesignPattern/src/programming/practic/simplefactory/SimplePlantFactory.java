package programming.practic.simplefactory;

public class SimplePlantFactory {
	public static Plant createPlant(String plantName) {
		Plant plt = null;
		
		if(plantName.equals("repeater")) {
			plt = new Repeater();
		} else if(plantName.equals("peashooter")) {
			plt = new Peashooter();
		} else if(plantName.equals("sunflower")) {
			plt = new Sunflower();
		} else if(plantName.equals("sunshroom")) {
			plt = new Sunshroom();
		} else if(plantName.equals("tallnut")) {
			plt = new Tallnut();
		} else if(plantName.equals("wallnut")) {
			plt = new Wallnut();
			}
		plt.display();
		
		return plt;
	}
}



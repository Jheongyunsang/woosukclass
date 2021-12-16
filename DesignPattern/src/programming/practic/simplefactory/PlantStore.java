package programming.practic.simplefactory;

public class PlantStore {
	public Plant createPlant(String plantName) {
		Plant plt = SimplePlantFactory.createPlant(plantName);
		
		if(plt == null) {
			return null;
		}
		plt.display();
		
		return plt;
	}
}
package programmin.practice.abstractfactory;
import programming.practice.factory.Pizza;


public interface MenuFactory {
	public abstract Pizza createPizza(String name);
	public abstract Beverage crateBeverage(String name);
}

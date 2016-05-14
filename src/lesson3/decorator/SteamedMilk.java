package lesson3.decorator;

public class SteamedMilk extends CondimentDecorator {
	
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Steamed Milk";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
	
	@Override
	public String getSize() {
		return beverage.getSize();
	}
}

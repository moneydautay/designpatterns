package lesson3.decorator;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
	
	@Override
	public String getSize() {
		return beverage.getSize();
	}

}

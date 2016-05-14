package lesson3.decorator;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
	
	@Override
	public String getSize() {
		return beverage.getSize();
	}

}

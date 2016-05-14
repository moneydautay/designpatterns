package lesson3.decorator;

public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
			
	public abstract String getSize();
	
	@Override
	public double cost() {
		return 0;
	}

}

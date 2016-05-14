package lesson3.decorator;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		double cost = beverage.cost();
		if(getSize() == beverage.TALL){
			cost += .10;
		}else if(getSize() == beverage.GRANDE){
			cost += .15;
		}
		else{
			cost += .20;
		}
		return cost;
	}

	@Override
	public String getSize() {
		return beverage.getSize();
	}

}

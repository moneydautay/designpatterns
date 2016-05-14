package lesson3.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	public void setSize(String size){
		super.size = size;
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}

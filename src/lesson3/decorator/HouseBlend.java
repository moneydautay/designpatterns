package lesson3.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend";
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	@Override
	public double cost() {
		return .89;
	}

}

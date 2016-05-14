package lesson3.decorator;

public abstract class Beverage {
	
	String description = "Unknown Beverage";
	String TALL = "TALL";
	String GRANDE = "GRANDE";
	String VENTI = "VENTI";
	String size = "TALL";
	
	public String getDescription(){
		return description;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getSize(){
		return size;
	}
	
	
	public abstract double cost();
}

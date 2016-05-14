package lesson3.decorator;

public class App {
	public static void main(String[] args){
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		//add beverage
		Beverage beverage2 = new Espresso();
		beverage2.setSize(beverage2.VENTI);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $"+beverage2.cost());
		
	}
}

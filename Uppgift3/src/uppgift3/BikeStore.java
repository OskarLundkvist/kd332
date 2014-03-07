package uppgift3;

import java.util.ArrayList;


public class BikeStore {
	
	private static ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	public static void main(String[] args) 
	{
	}
	
	/** Gets all Bike objects and put their values into a string. */
	public static String getAllBikes(){
		String bikeText = "";
		for (Bike b : bikes){
			bikeText += b.getColor() + "," + b.getSize() + "," + b.getPrice() + "\n";
		}
		return bikeText;
	}
	
	/** Adds a new Bike object */
	public static void addBike(String color, int size, int price){
		bikes.add(new Bike(color,size,price));
	}
}

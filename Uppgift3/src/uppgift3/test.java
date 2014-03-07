
package uppgift3;


import java.util.ArrayList;

public class test {
	
	private Bike bik;
	private static ArrayList<Bike> bikez = new ArrayList<Bike>();

	public static void main(String[] args) {
		
		bikez.add(new Bike("Poopbrown",10, 5));
		bikez.add(new Bike("Red", 24, 9001));
		bikez.add(new Bike("Blue", 21, -3466));
		bikez.add(new Bike("White", 19, 100009));
		bikez.add(new Bike("Fartcolor", 34, 69));
		bikez.add(new Bike("Uglycolor", 26, 8765));
		bikez.add(new Bike("Black", 14, 1234));
		bikez.add(new Bike("Ginger", 0, 999999999));
		bikez.add(new Bike("Pink", 18, 3425));
		bikez.add(new Bike("Lilybrown",17, 6666));
		
		int bikePos = 0;
		for(Bike B: bikez){
			bikePos++;
			System.out.println("Bike " + bikePos + " is of the color " + B.getColor() + ", is " + B.getSize() + " inches and costs " + B.getPrice() + " crowns.");
			
		}
	}

}

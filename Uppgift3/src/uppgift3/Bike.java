package uppgift3;

public class Bike {
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes; //Counts nbr of instances.
	
	public Bike(String _color, int _size) {
		
	}
	/** Creates a Bike that stores variables and checks them using the Constant class */
	public Bike(String _color, int _size, int _price){
		
		color = checkColor(_color);
		
		if(_size < Constant.MIN_SIZE){
			size = Constant.MIN_SIZE;
		}else if(_size > Constant.MAX_SIZE){
			size = Constant.MAX_SIZE;
		}else{
			size = _size;
		}
		
		if(_price < Constant.MIN_PRICE){
			price = Constant.MIN_PRICE;
		}else if(_price > Constant.MAX_PRICE){
			price = Constant.MAX_PRICE;
		}else{
			price = _price;
		}
		
		nbrOfBikes++;
	}
	
	/** Returns the color variable when the method is used */
	public String getColor(){
		return color;
	}
	
	/** Returns the size variable when the method is used */
	public int getSize(){
		return size;
	}
	
	/** Returns the price variable when the method is used */
	public int getPrice(){
		return price;
	}
	
	/** Changes price to _price and returns price */
	public int setPrice(int _price){
		if(_price < Constant.MIN_PRICE){
			price = Constant.MIN_PRICE;
		}else if(_price > Constant.MAX_PRICE){
			price = Constant.MAX_PRICE;
		}else{
			price = _price;
		}
		return price;
	}
	
	/** Returns the nbrOfBikes variable when the method is used */
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
	/** Loops through the COLOR array in constant, to check if inputColor exists in the array */
	public String checkColor(String inputColor){
		for(int c = 0; c < Constant.COLOR.length; c++){
			if(inputColor.compareToIgnoreCase(Constant.COLOR[c]) == 0){
				return Constant.COLOR[c];
			}
		}
		return "colorless";
	}
}

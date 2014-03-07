public class House {
//instansvariabel 
	private int year;
//instansvariabel 
	private int size;
	
//klassvariabel  
	public static int nbrOfHouses;
//Klassvariabel - final är bestämt värde 
	public static final int MIN_SIZE =10;
//Konstruktor
	public House(int _year,int _size){
		year = _year;
		if(_size < MIN_SIZE){
			_size = MIN_SIZE;
		}else{
			size = _size;
		}
		nbrOfHouses++;
	}

//klassmetod
	public static int getNbrHouses(){
		return nbrOfHouses;
	}
	
//instansmetoder
	public int getYear(){
		return year;
		} 
//instansmetoder
	public int getSize(){
		return size;
		}
}
/*
House
——————————
year: int
size: int
nbrOfHouses: int
MIN_SIZE: int=10
——————————
House(_year: int, _size: int)
——————————
+ getNbrHouses: int
+ getYear: int
+ getSize: int
*/
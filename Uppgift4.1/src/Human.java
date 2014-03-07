
public class Human {
	
	private Dog dog;
	private String name;
	
	public Human(String _name){
		this.name = _name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void buyDog(Dog _dog){
		dog = _dog;
	}
	
	/** Returnerar: "x äger en hund some heter y" eller "x äger inte en hund" */
	public String getInfo(){
		if(dog == null){
			return getName() + " äger inte en hund";
		}
		else{
			return getName() + " äger en hund som heter " + dog.getName();
		}
	}

}

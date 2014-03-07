
public class Dog extends Mammal {
	
	private int averagePups;
	
	protected Dog(String _family, boolean _haveFur, int _averagePups) {
		super(_family, _haveFur);
		// TODO Auto-generated constructor stub
		this.averagePups = _averagePups;
	}

	@Override
	public String getInfo() {
		if(super.haveFur == true){
			return "The dog " + super.family + " have fur and get an average of " + averagePups + " pups.";
		}else {
			return "The dog " + super.family + " dosen't have fur and get an average of " + averagePups + " pups.";
		}
	}
}

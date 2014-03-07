
public class Cat extends Mammal {
	
	private String cuteness;
	
	protected Cat(String _family, boolean _haveFur, String _cuteness) {
		super(_family, _haveFur);
		// TODO Auto-generated constructor stub
		this.cuteness = _cuteness;
	}
	
	@Override
	public String getInfo() {
		if(super.haveFur == true){
			return "The cat " + super.family + " have fur and is " + cuteness + ".";
		}else {
			return "The cat " + super.family + " dosen't have fur and is " + cuteness + ".";
		}
	}
}

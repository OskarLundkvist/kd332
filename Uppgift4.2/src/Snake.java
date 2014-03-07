
public class Snake extends Animal {
	
	private int bodyLength;
	
	protected Snake(String _family, int _bodyLength) {
		super(_family);
		// TODO Auto-generated constructor stub
		this.bodyLength = _bodyLength;
	}

	@Override
	public String getInfo() {
		return "The snake " + super.family + "'s body is " + bodyLength + " cm long.";
	}
}

// name
// women
// I LNU-81027 finns det en man.
// Mittuniversitet och BTH
public class Program {
	
	private String name;
	private String code;
	private int women;
	private int men;
	
	public Program(String _name, String _code, int _women, int _men){
		this.name = _name;
		this.code = _code;
		this.women = _women;
		this.men = _men;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getCode(){
		return this.code;
	}
	
	public int getWomen(){
		return this.women;
	}
	
	public int getMen(){
		return this.men;
	}
	public String toString() {
		return name;
		}

}

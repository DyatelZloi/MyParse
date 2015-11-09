package sorce;

public class Symbol implements Leaf, Component {
	
	char value;
	
	String name ="Symbol";
	
	Symbol(String string){
		this.value = string.charAt(0);
	}
	
	@Override
	public String toString() {
		return "Symbol [value=" + value + "]";
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	
	String name(){
		return this.name;
	}
}

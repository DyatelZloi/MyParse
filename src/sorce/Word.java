package sorce;

public class Word extends LetterWord<Symbol> implements SentenceToken {

	String name = "Word";
	
	public String getName() {
		return name;
	}
	
	public String name(){
		return name;
	}
}

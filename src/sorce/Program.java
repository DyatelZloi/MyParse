package sorce;

/** Client */
public class Program {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

    	String textString = "123 123 123";
    	
    	Parser parser = new Parser();
    	parser.parse(textString);
    }
}
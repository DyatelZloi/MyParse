package sorce;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser implements Parse{

	public <E extends Composite> E parse(String textString, Class<E> composite){
		E e;
		try {
			Pattern pattern;
			Matcher matcher;
			e = composite.newInstance();
			Class component;
			switch(e.name()){
			case "Word" : 
				component = Word.class.getClass();
				e = composite.newInstance();
				pattern = Pattern.compile("(\\S*[\\s])");
				break;
			case "Symbol" : 
				component = Symbol.class.getClass();
				e = composite.newInstance();
				pattern = Pattern.compile("[\\S*]");
				break;
			default : 
				component = Word.class.getClass();
				pattern = Pattern.compile("[\\S*]");
			}
			matcher = pattern.matcher(textString);
			 while (matcher.find()) {
	               if (component == Symbol.class) {
	                    Symbol s = new Symbol(matcher.group());
	                    e.add(s);
	                    System.out.print(s);
	                } else {
	                	Component c = this.parse(matcher.group(), component);
	                    e.add(c);
	                    System.out.print(c);
	                }
	            }
	            return e;
		} catch (InstantiationException | IllegalAccessException ignored) {
			  throw new RuntimeException();
        }
}

	
	public Word parse(String textString)  {
		return this.parse(textString, Word.class);
	}

}

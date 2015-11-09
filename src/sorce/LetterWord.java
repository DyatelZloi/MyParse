package sorce;
import java.util.ArrayList;
//
import java.util.List;

public abstract class LetterWord <Z extends Component> implements  Composite<Z>{
	
	private List<Component> mChildGraphics = new ArrayList<Component>();
	
	public String name = "LetterWord";
	
    public List<Component> getmChildGraphics() {
		return mChildGraphics;
	}

	@Override
	public void add(Z component) {
		// TODO Auto-generated method stub
		mChildGraphics.add(component);
	}

	@Override
	public void remove(Z component) {
		// TODO Auto-generated method stub
		mChildGraphics.remove(component);
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String name() {
		return this.getName();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}


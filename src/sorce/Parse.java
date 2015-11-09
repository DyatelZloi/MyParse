package sorce;

public interface Parse {
	<E extends Composite> E parse(String textString, Class<E> composite) throws InstantiationException, IllegalAccessException;
}

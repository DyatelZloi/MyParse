package sorce;


/** "Composite" 
 * @param <E>*/
interface Composite <E extends Component> extends Component {

    void add(E component);//

    void remove(E component);//
    
    String name ();


}
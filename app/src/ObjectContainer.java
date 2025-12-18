import java.util.HashMap;

public class ObjectContainer {
    public static ObjectContainer Instance = new ObjectContainer();
    private final HashMap<String,Obj>  objectHashMap = new HashMap<>();
    private final  HashMap<String,Value> valueHashMap = new HashMap<>();


    public void addValue(String name,Value val) {
        valueHashMap.put(name,val);
    }

    public void addObject(String name,Obj object) {
        objectHashMap.put(name,object);
    }


}

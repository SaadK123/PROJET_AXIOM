import java.util.HashMap;

public class Obj implements  IComponent{
 // create class obj

    private final HashMap<String,IComponent> hs;

    public Obj(HashMap<String,IComponent> hs) {
     this.hs = hs;
    }
    public HashMap<String,IComponent> getMap() {
        return hs;
    }



}

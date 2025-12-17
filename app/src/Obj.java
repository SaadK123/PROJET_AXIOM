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

    /**
     * @description
     * @param name
     * @return retourne le composant qui peut etre un Obj qui contient
     * d'autre affaires ou retourne une valeur
     */
    public  IComponent getComponent(String name) {
        return hs.get(name);
    }



}

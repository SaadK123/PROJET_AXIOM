import java.util.HashMap;

public class Obj implements  IComponent{
 // create class obj

    private final HashMap<String,IComponent> hs;

    public Obj(HashMap<String,IComponent> hs) {
     this.hs = hs;
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
    public void setComponent(String name,IComponent component) {
        if(name == null || name.isBlank() || getComponent(name) == null) {
            return;
        }

        // saisir le nouveau composant qui peut etre null
        hs.put(name,component);
    }


}

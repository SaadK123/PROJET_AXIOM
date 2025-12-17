import javax.xml.xpath.XPathEvaluationResult;
import java.util.HashMap;
import java.util.Map;

public class Utilitary {




    /**
     * set un Obj a null
     * Note : a trouver d'abors puis ensuite a saisir a null
     * @param nameChild
     * @param parent
     */
    public static  void setObjNull(String nameChild,Obj parent) {
        if(parent == null) {
            return;
        }
        if(parent.getComponent(nameChild) != null) {
          parent.getMap().put(nameChild,null);
        }
    }

    public static  void changerValeur(String nameValue,Obj parent,Value newValue) {
        if(parent == null || newValue == null) {
            return;
        }
        // sert uniquement a tester si la valeur est null je peux centraliser avec IComponent par la suite
         Value val = (Value) parent.getComponent(nameValue);
        if(val == null){
            return;
        }


    }



}

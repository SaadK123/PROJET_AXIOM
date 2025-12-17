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
        if(parent == null) { // on verifie uniquement si le parent est null 
            return;
        }
          parent.setComponent(nameChild,null);

    }

    public static  void changerValeur(String nameValue,Obj parent,Value newValue) {
        if(parent == null || newValue == null) {
            return;
        }
        parent.setComponent(nameValue,newValue);
    }



}

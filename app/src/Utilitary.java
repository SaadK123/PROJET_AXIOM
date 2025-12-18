import javax.xml.xpath.XPathEvaluationResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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



    public static List<String> convertCommandToList(String command) {
        correctStringFormat(command); // lance une exception si jamais c'est pas bon
        // this will be converting a command example int number      = 5; into a list without taking type into account
        int indexCurrSplit = 0;
        // int number
        List<String> list = new ArrayList<>();
        char[] characters = command.toCharArray();
        for(int i = 0; i < characters.length; ++i) {
           if(characters[i] == ' '){
               list.add(command.substring(indexCurrSplit,i));
               // this will help place ourselves against double spaces
               for(int e = i+1; e < characters.length; ++e) {
                   if(characters[e] == ' ') {++i;continue;}
                   break;
               }
               if(i == characters.length-1) {
                   return list; // return list if after the spacing protection where at last index
               }
               indexCurrSplit = i;
           }
        }
        list.add(command.substring(indexCurrSplit));

        return  list;
    }
    private static void correctStringFormat(String str) {
        if(str == null || str.isEmpty() || Character.isDigit(str.charAt(0))
                || str.matches(".*[\\r\\n].*")) {
            throw new IllegalArgumentException("");
        }
    }









}

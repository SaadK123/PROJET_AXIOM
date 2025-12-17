import java.util.HashMap;
import java.util.Map;

public class Utilitary {


    public IComponent getComponent(String name,Obj obj) {
      return obj.getMap().get(name);
    }
    public void setObjNull(String name,Obj obj) {
        if(obj == null) {
            return;
        }
        if(obj.getMap().get(name) != null) {
          obj.getMap().put(name,null);
        }

    }


}

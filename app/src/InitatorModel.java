import jdk.jfr.Description;
import jdk.jshell.execution.Util;

import javax.print.DocFlavor;
import javax.swing.text.Utilities;
import java.util.HashMap;
import java.util.List;

// act as a utilitary model
public class InitatorModel {
    /**
     * @Description
     * model v.1
     */
    public static HashMap<String,CommandLine> Initiate() {
        // create instance hashmap
        HashMap<String,CommandLine> hs = new HashMap<>();

        // creation int
        /**
         * possible types commands for all values
         * int n;
         * int n = 3;
         *
         * string z;
         * string z = "87";
         */
        hs.put("create calendar",(String command) -> {

            List<String> str  = Utilitary.convertCommandToList(command);

        });
        return null;
    }

}

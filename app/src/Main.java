import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> str = Utilitary.convertCommandToList("\n\r\ncreate\n\n\n\n\n\ncours");
        System.out.println(str.get(0));

    }
}
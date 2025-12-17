import java.lang.reflect.Type;

public class Value implements IComponent{
    private final String value;
    private final TypeValeur type;

    public Value(String value,TypeValeur type) {
        this.value = value;
        this.type = type;
    }
    public String getValue() {
        return value;
    }
    public TypeValeur getType() {
        return  type;
    }

}

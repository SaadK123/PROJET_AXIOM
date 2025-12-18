public abstract class Value implements IComponent{
    private final String value;
    private final TypeValue type;


    public Value(String value, TypeValue type) {
        this.value = value;
        this.type = type;
    }
    public String getValue() {
        return value;
    }
    public TypeValue getType() {
        return  type;
    }

    public abstract boolean CompareTo(Object obj);

}

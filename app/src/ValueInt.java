public class ValueInt extends Value {
    @Override
    public boolean CompareTo(Object obj) {
        if(!(obj instanceof Integer)) throw new IllegalArgumentException("is not an int");
       if(obj == toValue()) {
        return true;
       }
       return false;
    }
    public ValueInt(String value,TypeValue type) {
        super(value,type);
    }

    @Override
    public Integer toValue() {
     return Integer.parseInt(getValue());
    }
}

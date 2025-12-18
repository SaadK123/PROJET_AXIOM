import java.util.Objects;

public class ValueFloat extends Value{

    public ValueFloat(String value, TypeValue type) {
        super(value, type);
    }

    @Override
    public Float toValue() {
        return Float.parseFloat(getValue());
    }


    public boolean CompareTo(Object obj) {
        if(!(obj instanceof Float )) throw new IllegalArgumentException("");
        return Objects.equals(obj, this.toValue());
    }


}

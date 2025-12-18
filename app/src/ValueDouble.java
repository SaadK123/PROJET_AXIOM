import com.sun.source.doctree.ValueTree;

public class ValueDouble  extends Value{
    @Override
    /*
    it's a get valueType
     */
    public Double toValue() {
        return 4.0;
    }


    public ValueDouble(String value,TypeValue type) {
        super(value,type);
    }
}

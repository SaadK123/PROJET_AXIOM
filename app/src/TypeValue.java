import java.util.*;

public enum TypeValue  {
        DOUBLE,
        FLOAT,
        INT,
        STRING,
        CHAR;



        private static final Map<String,TypeValue> valuesType =
                Map.of(
                "double",DOUBLE,
                "float",FLOAT,
                "int",INT,
                "string",STRING,
                "char",CHAR

                );

        public Value ICreation(String value) {
         return createValue(this,value);
        }

        private static Value createValue(TypeValue type,String value) {
           return switch (type) {
               case DOUBLE -> new ValueDouble(value,type);
               case FLOAT  -> new ValueFloat(value,type);
               case INT   ->  new ValueInt(value,type);
               case STRING -> new Va;
               case CHAR -> null;
           };
        }



}

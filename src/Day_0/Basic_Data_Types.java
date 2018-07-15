package Day_0;

public class Basic_Data_Types {
    public static void main(String[] args) {

        //byte
        //The byte data type is an 8-bit signed two’s complement integer.The byte data type is useful for saving memory in large arrays.
        byte var_byte_min = -128; byte var_byte_max = 127;

        //short
        //The short data type is a 16-bit signed two’s complement integer. Similar to byte, use a short to save memory in large arrays, in situations where the memory savings actually matters.
        short var_short_min = -32768;
        short var_short_max = 32767;

        //int
        //It is a 32-bit signed two’s complement integer.
        int var_int_min = -2147483648;
        int var_int_max = 2147483647;

        //long:
        //The long data type is a 64-bit two’s complement integer.
        //long var_long_max = (2^63)-1; long var_long_min = -2^63
        long var_long = 1234567;

        //float
        //The float data type is a single-precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers.
        float var_float = 123.1234f;

        //double:
        //The double data type is a double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice.
        double var_double = 123.1234;

        //char
        //The char data type is a single 16-bit Unicode character. A char is a single character.
        char var_char = 'a';
        String var_String = "This is a test string";

        //boolean
        //boolean data type represents only one bit of information either true or false . Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. But the programmer can easily write conversion code.
        boolean var_boolean_correct = true;
        boolean var_boolean_wrong = false;

        System.out.println("-------------------------------------------");
        System.out.println("Printing the values of the varoables below.");
        System.out.println("-------------------------------------------");
        System.out.println(" var_byte_min : " + var_byte_min);
        System.out.println(" var_byte_max : " + var_byte_max);
        System.out.println(" var_int_min : " + var_int_min);
        System.out.println(" var_int_max : " + var_int_max);
        System.out.println(" var_long : " + var_long);
        System.out.println(" var_double : " + var_double);
        System.out.println(" var_float : " + var_float);
        System.out.println(" var_char : " + var_char);
        System.out.println(" var_short_min : " + var_short_min);
        System.out.println(" var_short_max : " + var_short_max);
        System.out.println(" var_boolean_correct : " + var_boolean_correct);
        System.out.println(" var_boolean_wrong : " + var_boolean_wrong);

        System.out.println("-------------------------------------------");
        System.out.println("String is not a basic data type but can be used like one.");
        System.out.println(" var_string : " + var_String);

    }
}

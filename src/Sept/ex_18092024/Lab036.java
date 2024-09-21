package Sept.ex_18092024;

public class Lab036 {
    public static void main (String[] args){
        // Type Casting
        // Source and Destination Conversion
        // Widening - Implicit , Explicit - lossless
        // Narrowing - Implicit , Explicit(with data type) loss

        // Widening
        byte b = 10;
        int a = b; //valid Implicit casting - Done By JVM
        int a1 = (int)b; //Explicit casting - Mentioned normally
        // both are same in widening

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid Implicit casting - jvm
        byte b2 = (byte)val; // Invalid Explicit casting - Mentioned normally - loss of data.(till byte take it will store after that data will lose)
        System.out.println(b2);











    }
}

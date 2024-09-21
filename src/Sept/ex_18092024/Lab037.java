package Sept.ex_18092024;

import java.util.SortedMap;

public class Lab037 {
    public static <shot> void main(String[] args) {
        long phone_no= 8099353738l;
        //short s = phone_no; // Norrowing - Implicit - JVM // Invalid
        //Short s1 =(Short)phone_no;

        // Gst = 18.45
        int course = 100;
        float GST = 18.45f;
        //int total_price = course+GST; // Narrowing Implict JVM - Invalid
        float total_price1 = course+GST;  // Narrowing Implict JVM - Valid

        int total_price = course+(int)GST; // Narrowing - Explicit - loss of values
        System.out.println(total_price);

    }
}

package Sept.ex_18092024;

public class Lab038 {
    public static void main(String[] args) {
        // increment (++) / Decrement (--) Operators
        // pre and post

        // pre - increment - ++operand
        // value is increment first then stored in the result.
        int a = 10;
        int b = ++a;
        System.out.println(b); //11
        System.out.println(a); // 11

        int a1=10;
        System.out.println(++a1); //11

        // Post incremnt
        int a2 = 10;
        System.out.println(a2++);
        System.out.println(a2);
    }
}

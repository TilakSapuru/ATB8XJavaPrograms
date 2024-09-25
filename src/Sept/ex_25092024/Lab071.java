package Sept.ex_25092024;

public class Lab071 {
    public static void main(String[] args) {
        final boolean b= true;
        //b =false; // final this is fixed now
        // Infinite because b is always true
//        for (int i =0;b;i++){
//            System.out.println("Tilak");
//        }


        // Infinite because there is no condition or updation
//        for(int i=0; ; ){
//            System.out.println("hello");
//        }

        //Infinite because there is no condition Unless there is no condition it is an infinite
        for (;;) {
            System.out.println("Hello");
        }


        }

    }


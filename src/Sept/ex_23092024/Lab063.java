package Sept.ex_23092024;

public class Lab063 {
    public static void main(String[] args) {
        // JDK -> 13
        int iteamcode = 001;
        switch (iteamcode){
            case 001,002,003:
                System.out.println("Electronic");
                break;
            case 004,006,007:
                System.out.println("Mechanical");
                break;
            default:
                System.out.println("None");
                break;


        }
    }
}

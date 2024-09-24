package Sept.ex_23092024;

public class Lab064 {
    public static void main(String[] args) {
        //JDK -> 13 above
        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("electonic");
            case 002,003 -> System.out.println("Mechanical");
            case 004 -> System.out.println("Mobile Phone");
            default -> System.out.println("None");
            //  It does not need break



        }
    }
}

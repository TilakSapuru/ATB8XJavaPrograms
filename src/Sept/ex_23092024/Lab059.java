package Sept.ex_23092024;

public class Lab059 {
    public static void main(String[] args) {
        // Switch Condition
        //Day 1 to 7

        int day =5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No Idea which day it is");
                break; //Optionals at default as it is at last

        }
        System.out.println("End of the Loop");



    }

}

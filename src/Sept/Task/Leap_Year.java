package Sept.Task;

public class Leap_Year {
    public static void main(String[] args) {
        int Year = 2024;

        if((Year%4 == 0 && Year  % 100 !=0) || Year % 400 == 0){
            System.out.println(Year +" Is a Leap Year");
        }else {
            System.out.println(Year +" Is Not a Leap Year");
        }


    }
}

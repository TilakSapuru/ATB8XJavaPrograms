package Sept.Task;

public class Ternary_Operators_to_handle_multiple_conditions {
    public static void main(String[] args) {
        int score =85;

        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" : "F";

        System.out.println("The Grade is " + grade);

    }
}

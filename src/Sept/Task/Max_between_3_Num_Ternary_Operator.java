package Sept.Task;

public class Max_between_3_Num_Ternary_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        int max = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);
    }
}

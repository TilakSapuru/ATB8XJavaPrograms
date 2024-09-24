package Sept.Task;

public class Arthamatic_operations_switch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =20;
        char opeation = '/';
        int result;
        switch (opeation){
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case '-':
                result = num1-num2;
                System.out.println(result);
                break;
            case '%':
                result = num1%num2;
                System.out.println(result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("No Output");

        }

    }
}

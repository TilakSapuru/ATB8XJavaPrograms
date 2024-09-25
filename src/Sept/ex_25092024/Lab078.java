package Sept.ex_25092024;

public class Lab078 {
    public static void main(String[] args) {
        // It will not print after when it becomes 5
        // If we use break it will not run after the 5
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After");
        }
    }
}

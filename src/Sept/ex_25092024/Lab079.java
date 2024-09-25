package Sept.ex_25092024;

public class Lab079 {
    public static void main(String[] args) {
        // print the value of even and odd number from 0 to 50
        // If continue is not added it will print all value of 'i' as well
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even->" +i);
                continue; // If above is true it will skip the below code and continue the loop
            }
            System.out.println(i);
        }

    }
}

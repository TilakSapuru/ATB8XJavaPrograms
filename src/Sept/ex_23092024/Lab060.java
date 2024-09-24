package Sept.ex_23092024;

public class Lab060 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code
        // chrome -> Execute Chrome
        // Edge -> Execute Edge
        // FireFox -> Execute FireFox

        String browser = "chrome";
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                //Further code
                // webdriver driver = new chrome();
                break;
            case "Edge":
                System.out.println("Starting the Edge browser");
                //Further code
                // webdriver driver = new Edge();
                break;
            case "FireFox":
                System.out.println("Starting the FireFox browser");
                //Further code
                // webdriver driver = new FireFox();
                break;

            default:
                System.out.println("I Dont have any idea about this browser");
                break;

        }
    }
}

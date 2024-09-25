package Sept.Task;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Pooja";
        int vowels = 0, consonants = 0;

        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}

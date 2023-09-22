
public class eight {
    public static void main(String[] args) {
        String inputString = "Hello, 123 World!";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of spaces: " + spaces);
    }
}

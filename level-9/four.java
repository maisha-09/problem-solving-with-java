
public class four {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean isEPresent = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                isEPresent = true;
                break;
            }
        }

        if (isEPresent) {
            System.out.println("'e' is present in the word 'Umbrella'");
        } else {
            System.out.println("'e' is not present in the word 'Umbrella'");
        }
    }
}

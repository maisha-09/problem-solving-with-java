
public class five {
    public static void main(String[] args) {
        String sentence = "This is orange juice";
        String targetWord = "orange";

        boolean isPresent = sentence.contains(targetWord);

        if (isPresent) {
            System.out.println("'" + targetWord + "' is present in the sentence.");
        } else {
            System.out.println("'" + targetWord + "' is not present in the sentence.");
        }
    }
}

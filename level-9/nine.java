
public class nine {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String result = removeConsonants(str);

        System.out.println("Result: " + result);
    }

    public static String removeConsonants(String str) {
        String result = str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
        return result;
    }
}

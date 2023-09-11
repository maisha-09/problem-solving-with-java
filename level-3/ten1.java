public class ten1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = a;

        a = b;
        b = c;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

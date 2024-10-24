package exception;

public class Nested {
    public static void main(String[] args) {
        int len = args.length;
        int[] a = new int[2];

        try {
            a[3] = 20;
            a[2] = 15;
            a[1] = 10;
            try {
                int x = 10;
                int ans = x / len;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught" + e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array caught" + e);
        }
    }
}

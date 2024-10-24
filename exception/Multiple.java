package exception;

public class Multiple {
    public static void main(String[] args) {
        int len = args.length;
        int[] a = new int[2];

        try {
            a[0] = 23;
            a[1] = 47;
            a[3] = 100;
            int x = 20;
            int ans = x / len;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array caught" + e);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught" + e);
        }
    }
}
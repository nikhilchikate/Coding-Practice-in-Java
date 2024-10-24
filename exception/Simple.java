package exception;

public class Simple {
    public static void main(String[] args) {
        int d = 0, n = 10, res;
        System.out.println("\n Start!!!");
        try {
            res = n / d;
        } catch (ArithmeticException ae) {
            System.out.println("\n Exception caught " + ae);
        }
        System.out.println("\n End!!!");
    }
}

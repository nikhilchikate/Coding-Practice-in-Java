package cmd_arguments;

public class EvenOdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) System.out.println("\n Even Number");
        else System.out.println("\n Odd Number");
    }
}

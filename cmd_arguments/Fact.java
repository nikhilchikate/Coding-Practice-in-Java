package cmd_arguments;

public class Fact {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("\n Factorial is : "+fact);
    }
}

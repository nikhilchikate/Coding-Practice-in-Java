package basic_prog;

import java.util.Scanner;

public class AddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("\n Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("\n Addition is : "+ (a+b));
    }
}

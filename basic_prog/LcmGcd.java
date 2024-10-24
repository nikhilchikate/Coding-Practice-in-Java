package basic_prog;

import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, small, gcd=1, lcm;
        System.out.println("\n Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        small = Math.min(a, b);

        for(int i = 1; i <= small; i++){
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }

        lcm = a*b/gcd;

        System.out.println("\n GCD is : "+ gcd);
        System.out.println("\n LCM is : "+ lcm);
    }
}

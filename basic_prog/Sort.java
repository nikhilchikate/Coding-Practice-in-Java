package basic_prog;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int temp;
        System.out.println("\n Enter 10 numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\n Array before sorting");
        for (int j : a) {
            System.out.print(" " + j);
        }

        //sort logic
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\n Array after sorting");
        for (int j : a) {
            System.out.print(" " + j);
        }
    }
}

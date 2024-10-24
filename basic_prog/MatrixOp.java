package basic_prog;

import java.util.Scanner;

public class MatrixOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mat m = new Mat();
        int ch;
        while (true) {
            System.out.println("...Menu... ");
            System.out.println("1: Matrix Addition");
            System.out.println("2: Matrix Multiplication");
            System.out.println("3: Exit");
            System.out.println("Enter your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    m.Matins();
                    m.Matadd();
                    break;
                case 2:
                    m.Matins();
                    m.Matmul();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}

class Mat {
    Scanner sc = new Scanner(System.in);
    int m, n, p, q;
    int[][] a = new int[20][20];
    int[][] b = new int[20][20];
    int[][] c = new int[20][20];
    int i, j, k, sum;

    void Matins() {
        System.out.println("\n Enter value of m, n");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the Matrix 1 Elements");

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying the Matrix 1 Elements");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("\n Enter value of p,q");
        p = sc.nextInt();
        q = sc.nextInt();
        System.out.println("Enter the Matrix 2 Elements");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying the Matrix 2 Elements");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println("\n");
        }
    }

    void Matadd() {
        if (m == p && n == q) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Displaying Addition of 2 Matrixes ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(" " + c[i][j]);
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("\n These matrix cant be added");

        }
    }

    void Matmul() {
        System.out.println("\n Mat Mul");
        if (n == q) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    for (k = 0; k < p; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }
                    c[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Displaying Multiplication of 2 Matrixes ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(" " + c[i][j]);
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("\n These matrix cant be multiplied");

        }
    }
}

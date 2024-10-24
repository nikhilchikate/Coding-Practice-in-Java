package basic_prog;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        int ch, num;
        QueueOp qop = new QueueOp();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n Menu ");
            System.out.print("\n 1: Add");
            System.out.print("\n 2: Del");
            System.out.print("\n 3: Display");
            System.out.print("\n 4: Exit");
            System.out.print("\n Enter ur Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\n Enter Element to push");
                    num = sc.nextInt();
                    qop.add(num);
                    break;
                case 2:
                    qop.del();
                    break;

                case 3:
                    System.out.print("\n Displaying Stack Elements \n");
                    qop.display();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

class QueueOp{
    int[] a = new int[5];
    int rear, front;

    QueueOp(){
        front = 0;
        rear = 0;
    }

    void add(int x){
        a[rear++] = x;
    }

    void del(){
        front++;
    }

    void display(){
        for(int i = front; i < rear; i++)
            System.out.println(" \t "+a[i]);
    }
}
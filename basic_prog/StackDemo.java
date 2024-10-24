package basic_prog;

import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        int ch, num;
        Stackop s = new Stackop();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n Menu ");
            System.out.print("\n 1: Push");
            System.out.print("\n 2: Pop");
            System.out.print("\n 3: Display");
            System.out.print("\n 4: Exit");
            System.out.print("\n Enter ur Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\n Enter Element to push");
                    num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    s.pop();
                    break;

                case 3:
                    System.out.print("\n Displaying Stack Elemets \n");
                    s.display();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

class Stackop{
    int[] a = new int[5];
    int top;

    Stackop(){
        top = 0;
    }

    void push(int x){
        if(top < 5)
            a[top++] = x;
        else
            System.out.println("\n Stack is full");
    }

    void pop() {
        if(top != 0)
            top--;
        else
            System.out.println("\n Stack is Empty");
    }

    void display(){
        for(int i = 0; i < top; i++)
            System.out.println(" \t"+a[i]);
    }
}

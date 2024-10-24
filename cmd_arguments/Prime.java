package cmd_arguments;

public class Prime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), flag = 0;
        if(n < 0){
            System.out.println("n Enter number greater than ZERO!!!");
        }
        for(int i =2; i < n; i++){
            if(n % i == 0){
                System.out.println("\nNumber is NOT PRIME");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("\n Number is PRIME");
    }
}

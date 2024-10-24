package rmi_demo.simple;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            RMICalculator calculator = (RMICalculator) Naming.lookup("rmi://localhost/RMICalculator");
            System.out.println("Answer is " + calculator.add(10, 20));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

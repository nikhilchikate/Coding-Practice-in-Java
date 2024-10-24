package rmi_demo.simple;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Start the RMI registry on a specific port if needed
            LocateRegistry.createRegistry(1099); // Default RMI port

            RMICalcImpl calculator = new RMICalcImpl();
            Naming.rebind("rmi://localhost/RMICalculator", calculator);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

package rmi_demo.simple;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalculator extends Remote {
    double add(double a, double b) throws RemoteException;
}

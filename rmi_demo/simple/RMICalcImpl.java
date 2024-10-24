package rmi_demo.simple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMICalcImpl extends UnicastRemoteObject implements RMICalculator {
    public RMICalcImpl() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }
}
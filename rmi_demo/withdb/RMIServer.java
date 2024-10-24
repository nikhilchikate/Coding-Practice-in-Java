package rmi_demo.withdb;

import java.rmi.Naming;

public class RMIServer {
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        StudImpl x=new StudImpl();
        Naming.rebind("rmi://localhost/vit",x);
    }
}

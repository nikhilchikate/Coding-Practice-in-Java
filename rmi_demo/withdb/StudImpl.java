package rmi_demo.withdb;

import java.rmi.*;
        import java.rmi.server.*;
        import java.sql.*;
interface Student extends Remote
{
    public void addstud(String grno,String name,String contact,String course,String year) throws RemoteException;
}

public class StudImpl extends UnicastRemoteObject implements Student
{
    Connection db=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    StudImpl() throws RemoteException
    {
        super();
    }
    public void addstud(String grno,String name,String contact,String course,String year) throws RemoteException
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            db=DriverManager.getConnection("jdbc:odbc:mca");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error in loading driver:"+e);
        }
        catch(SQLException e)
        {
            System.out.println("Error in connection:"+e);
        }
        //insert code
        try
        {
            ps=db.prepareStatement("insert into student values (?,?,?,?,?)");
            ps.setString(1,grno);
            ps.setString(2,name);
            ps.setString(3,contact);
            ps.setString(4,course);
            ps.setString(5,year);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Error in inserting student information..."+e);
        }
    }
}
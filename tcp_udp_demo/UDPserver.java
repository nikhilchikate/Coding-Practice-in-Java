package tcp_udp_demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPserver {
    public static void main(String[] args) throws Exception{
        int sp = 4000, cp = 5000;
        DatagramSocket ds = new DatagramSocket(sp);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Server is running on port " + sp);
        System.out.println("Enter msg for client");
        String msg = br.readLine();
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, InetAddress.getLocalHost(), cp);
        ds.send(dp);
        ds.close();
    }
}

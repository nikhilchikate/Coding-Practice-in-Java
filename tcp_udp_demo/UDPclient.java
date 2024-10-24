package tcp_udp_demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPclient {
    public static void main(String[] args) throws Exception{
        int cp = 5000;
        byte[] b = new byte[1000];
        DatagramSocket ds = new DatagramSocket(cp);
        DatagramPacket dp = new DatagramPacket(b, 0, b.length);
        ds.receive(dp);
        System.out.println(new String(b, 0, dp.getLength()));
        ds.close();
    }
}

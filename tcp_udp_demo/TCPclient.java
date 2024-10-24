package tcp_udp_demo;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPclient {
    public static void main(String[] args) throws Exception {
        int sp = 3000;
        Socket s = new Socket(InetAddress.getLocalHost(), sp);
        InputStream in = s.getInputStream();
        byte[] b = new byte[1000];
        int n = in.read(b);
        System.out.println(new String(b, 0, n));
        s.close();
    }
}

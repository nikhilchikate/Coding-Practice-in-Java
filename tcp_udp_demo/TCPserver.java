package tcp_udp_demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
    public static void main(String[] args) throws Exception{
        int sp = 3000;
        ServerSocket ss = new ServerSocket(sp);
        Socket s = ss.accept();
        OutputStream out = s.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter msg for Client");
        String msg = br.readLine();
        out.write(msg.getBytes());
        s.close();
    }
}

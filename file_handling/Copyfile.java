package file_handling;

import java.io.*;

public class Copyfile {
    public static void main(String[] args) throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter("a.txt"));
        out.write("This is content from a.txt file");
        out.close();
        InputStream ins = new FileInputStream(new File("a.txt"));
        OutputStream ous = new FileOutputStream(new File("b.txt"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = ins.read(buf)) > 0)
            ous.write(buf, 0, len);
        ins.close();
        ous.close();
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        String str;
        while ((str = br.readLine()) != null)
            System.out.println(str);
        br.close();
    }
}

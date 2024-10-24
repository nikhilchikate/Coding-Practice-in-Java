package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LowerToUpper {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("a.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = (new PrintWriter(new FileWriter("e.txt")));
            String s = "";
            while ((s = br.readLine()) != null)
                pw.write(s.toUpperCase() + "\n");
            pw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

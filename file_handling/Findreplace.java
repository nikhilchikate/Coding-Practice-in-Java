package file_handling;

import java.io.*;

public class Findreplace {
    public static void main(String[] args) {
        try{
            File file = new File("c.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = br.readLine()) != null)
                oldtext += line + "\r\n";
            br.close();

            String newText = oldtext.replaceAll("This is test string!!!", "blah blah blah");
            FileWriter fw = new FileWriter("d.txt");
            fw.write(newText);
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

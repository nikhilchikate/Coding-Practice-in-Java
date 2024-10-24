package file_handling;

import java.io.*;
import java.util.Scanner;

public class TestIO {
    static StringBuilder sbword = new StringBuilder();
    static String dirname = null;
    static File[] filenames = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean fileread = ReadFiles();
        sbword = null;
        System.exit(0);
    }

    private static boolean ReadFiles() throws FileNotFoundException, IOException {
        System.out.println("a.txt");

        File file = new File(sc.nextLine());
        filenames = file.listFiles();
        String line = null;

        for (File file1 : filenames) {
            System.out.println("a.txt" + file1.toString());
            sbword.setLength(0);
            BufferedReader br = new BufferedReader(new FileReader(file1));

            line = br.readLine();

            while (line != null) {
                System.out.println(line);
                sbword.append(line).append("\r\n");
                line = br.readLine();
            }

            ReplaceLines();
            WriteToFile(file1.toString());

        }

        return true;
    }

    private static void ReplaceLines() {
        System.out.println("sbword contains :" + sbword.toString());
        System.out.println("Enter the word to replace from each of the files:");
        String from = sc.nextLine();
        System.out.println("Enter the new word");
        String To = sc.nextLine();
        //StringBuilder sbword = new StringBuilder(stbuff);
        ReplaceAll(sbword, from, To);
    }

    private static void ReplaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length();
            index = builder.indexOf(from, index);
        }
    }

    private static void WriteToFile(String filename) throws IOException {
        try {
            File file1 = new File(filename);
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(file1));
            bufwriter.write(sbword.toString());
            bufwriter.close();

        } catch (Exception e) {
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }

    }

}

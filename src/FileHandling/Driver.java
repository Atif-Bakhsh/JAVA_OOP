package FileHandling;
//Practice on File Handling.
import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) throws IOException {
        File f = new File("Test.txt");
//        f.createNewFile();
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This is line four \n");
        bw.close();
        fw.close();
    }
}

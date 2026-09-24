import java.util.*;
import java.io.*;

public class Doc_file_van_ban {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}

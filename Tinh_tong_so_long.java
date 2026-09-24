import java.util.*;
import java.io.*;

public class Tinh_tong_so_long {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DATA.in"));

        long tong = 0;
        while (in.hasNext()) {
            String s = in.next();
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                try {
                    long val = Long.parseLong(s);
                    tong += val;
                } catch (NumberFormatException e2) {
                    
                }
            }
        }

        System.out.println(tong);
        in.close();
    }
}
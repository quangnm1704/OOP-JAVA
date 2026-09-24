import java.util.*;
import java.io.*;
import java.text.ParseException;

public class XLNL1 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));

        long tong = 0;
        while(in.hasNext()){
            try{
                int n = Integer.parseInt(in.next());
                tong += n;
            } catch(NumberFormatException e){

            }
        }

        System.out.println(tong);
        in.close();

    }
}

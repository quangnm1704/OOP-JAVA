import java.util.*;
import java.io.*;

public class THB1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));

        long total_sum = 0;

        while(sc.hasNext()){
            String token = sc.next();
            try{
                Integer.parseInt(token);
            }
            catch(NumberFormatException e){
                try{
                    long value = Long.parseLong(token);
                    total_sum += value;
                }

                catch(NumberFormatException e1){
                    
                }
            }
        }

        System.out.println(total_sum);
    }
}

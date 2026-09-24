import java.io.File;
import java.io.IOException;
import java.util.*;

public class Chuan_hoa_xau_ho_ten_trong_file {
    public static String ChuanHoaTen(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }

        return sb.toString().trim();

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            else{
                System.out.println(ChuanHoaTen(s));
            }
        }
    }
}

import java.util.*;

public class Chuan_hoa_xau_ho_ten_1 {
    public static String chuanHoa(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }

        sc.close();

    }
}

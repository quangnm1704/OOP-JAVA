import java.util.*;

public class TSB9 {
    public static String chuanHoa(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        String res = "";

        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++) res += x.charAt(i);

            res += " ";
        }

        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();


        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}

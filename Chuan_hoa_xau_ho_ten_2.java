import java.util.*;

public class Chuan_hoa_xau_ho_ten_2 {
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
            String[] arr = s.trim().toLowerCase().split("\\s+");

            for(int i = 1; i < arr.length; i++){
                if(i == arr.length - 1){
                    System.out.print(chuanHoa(arr[i]) + ", ");
                }
                else{
                    System.out.print(chuanHoa(arr[i]) + " ");
                }
            }

            System.out.println(arr[0].toUpperCase());
        }

        sc.close();

    }
}

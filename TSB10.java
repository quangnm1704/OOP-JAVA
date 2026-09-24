import java.util.*;

public class TSB10 {
    public static String chuanHoa(String s){
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            res += s.charAt(i);
        }

        return res;
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
    }
}

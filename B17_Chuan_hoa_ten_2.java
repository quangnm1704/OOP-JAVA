import java.util.Scanner;

public class B17_Chuan_hoa_ten_2 {
    public static String chuanHoa(String s){
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); i++) res += Character.toLowerCase(s.charAt(i));

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String arr[] = name.trim().split("\\s+");

        String res = "";

        arr[arr.length - 1] = arr[arr.length - 1].toUpperCase();

        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = chuanHoa(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 2) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print(arr[arr.length - 1] + ", ");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

import java.util.*;


public class Dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        HashMap <String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] a = s.trim().toLowerCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(a[a.length - 1]);
            for(int j = 0; j < a.length - 1; j++){
                sb.append(a[j].charAt(0));
            }

            String ten = sb.toString().trim();

            if(!map.containsKey(ten)){
                map.put(ten, 1);
                System.out.println(ten + "@ptit.edu.vn");
            }
            else{
                map.put(ten, map.get(ten) + 1);
                System.out.println(ten + map.get(ten) + "" + "@ptit.edu.vn");
            }
            
        }
    }
}

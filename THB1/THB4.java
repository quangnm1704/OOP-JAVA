import java.util.*;

public class THB4 {
    public static String inKetQua(ArrayList<String> list){
        if(list.size() == 1){
            return list.get(0);
        }

        String res = "";
        for(int i = 0; i < list.size() - 1; i++){
            if(i == 0){
                res += list.get(i);
            }
            else{
                res += ", " + list.get(i);
            }
        }

        res += " and " + list.get(list.size() - 1);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];
        boolean[] danhDau = new boolean[n+1];

        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            danhDau[a[i]] = true;
        }

        ArrayList<String> dsLoi = new ArrayList<>();
        int dau = a[0];
        int cuoi = a[0];

        for(int i = 1; i < m; i++){
            if(a[i] == cuoi + 1){
                cuoi = a[i];
            }
            else{
                if(dau == cuoi){
                    dsLoi.add(dau + "");
                }
                else{
                    dsLoi.add(dau + "-" + cuoi);
                }
                dau = a[i];
                cuoi = a[i];
            }
        }
        if(dau == cuoi){
            dsLoi.add(dau + "");
        }
        else{
            dsLoi.add(dau + "-" + cuoi);
        }

        ArrayList<String> dsDung = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!danhDau[i]){
                int j = i;
                while(j <= n && !danhDau[j]){
                    j++;
                }
                if(i == j - 1){
                    dsDung.add(i + "");
                }
                else{
                    dsDung.add(i + "-" + (j - 1));
                }
                i = j - 1;
            }
        }
        System.out.println("Errors: " + inKetQua(dsLoi));
        System.out.println("Correct: " + inKetQua(dsDung));
    }
}

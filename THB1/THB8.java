import java.util.*;
import java.io.*;

class SV{
    public String ten;
    public long ac, times;

    public SV(String ten, long ac, long times){
        this.ten = ten;
        this.ac = ac;
        this.times = times;
    }

    public String toString(){
        return ten + " " + ac + " " + times;
    }
}

public class THB8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));

        int n = Integer.parseInt(sc.nextLine());

        SV[] a = new SV[n];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String[] num = sc.nextLine().trim().split("\\s+");

            a[i] = new SV(ten, Long.parseLong(num[0]), Long.parseLong(num[1]));
        }

        Arrays.sort(a, new Comparator<SV>(){
            public int compare(SV a, SV b){
                return a.ten.compareTo(b.ten);
            }
        });

        Arrays.sort(a, new Comparator<SV>(){
            public int compare(SV a, SV b){
                if(a.ac == b.ac){
                    if(a.times < b.times) return -1;
                    else return 1;
                }
                else{
                    if(a.ac > b.ac) return -1;
                    else return 1;
                }
            }
        });

        for(SV x : a) System.out.println(x);

    }
}

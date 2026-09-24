import java.util.*;
import java.io.*;

public class So_khac_nhau_trong_file {
    static int[] d = new int[10005];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));

        int[] a = new int[100000];
        int idx = 0;

        while(sc.hasNextInt()){
            a[idx] = sc.nextInt();
            d[a[idx]]++;
            ++idx;
        }

        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            if(d[a[i]] > 0){
                System.out.println(a[i] + " " + d[a[i]]);
                d[a[i]] = 0;
            }
        }

    }
}

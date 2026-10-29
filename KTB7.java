import java.util.*;
import java.io.*;

public class KTB7 {
    static String[] res = new String[10005];
    static void init(){
        Queue <String> q = new LinkedList<>();
        q.add("4");
        q.add("5");
        int idx = 1;

        while(idx <= 10000){
            String s = q.poll();
            String rev = new StringBuilder(s).reverse().toString();
            res[idx++] = s + rev;
            q.add(s + "4");
            q.add(s + "5");
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        String line = br.readLine();
        if(line == null) return;
        int t = Integer.parseInt(line.trim());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            for(int i = 1; i <= n; i++){
                out.print(res[i] + " ");
            }
            out.println();
        }
        out.flush();
    }
}

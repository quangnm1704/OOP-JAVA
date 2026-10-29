import java.util.*;
import java.io.*;

public class KTB6 {
    static InputStream in = new BufferedInputStream(System.in);

    static int nextInt() throws IOException{
        int c, s = 1, x = 0;
        while((c = in.read()) <= 32){
            if(c == -1) return 0;
        }
        if(c == '-'){
            s = -1;
            c = in.read();
        }

        while(c > 32){
            x = x * 10 + (c - '0');
            c = in.read();
        }

        return x * s;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = nextInt();
        while(t-- > 0){
            int n = nextInt();
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++){
                int x = nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            List<Integer> list = new ArrayList<>(map.keySet());
            list.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));
            
            for(int x : list){
                int cnt = map.get(x);
                while(cnt-- > 0){
                    out.print(x + " ");
                }
            }
            out.println();
        }
        out.flush();

    }
}

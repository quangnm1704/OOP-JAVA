import java.util.*;
import java.io.*;

public class KTB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] a = new String[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.next();
            }

            Stack <Long> st = new Stack<>();
            for(int i = n - 1; i >= 0; i--){
                String s = a[i];
                if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                    long  o1 = st.pop();
                    long o2 = st.pop();

                    if(s.equals("+")) st.push(o1 + o2);
                    else if (s.equals("-"))st.push(o1 - o2);
                    else if (s.equals("*"))st.push(o1 * o2);
                    else if (s.equals("/"))st.push(o1 / o2);
                }
                else{
                    st.push(Long.parseLong(s));
                }
            }

            System.out.println(st.pop());

        }

    }
}

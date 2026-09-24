import java.util.*;
import java.io.*;

class matrix{
    int n, m;
    int[][] a;

    public matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public void nhap(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void sapXepCot(int cot){
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = a[i][cot];
        }

        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            a[i][cot] = b[i];
        }
    }

    public void in(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}

public class THB11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cot = sc.nextInt() - 1;

            matrix mat = new matrix(n, m);
            mat.nhap(sc);
            mat.sapXepCot(cot);
            mat.in();
        }
    }
}

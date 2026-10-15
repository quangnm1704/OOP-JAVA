import java.util.*;
import java.io.*;

class Matrix{
    private int n,m;
    private int[][] a;

    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];

    }

    public void nextMatrix(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void sortColumn(int col){
        int c = col - 1;
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = a[i][c];
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            a[i][c] = b[i];
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sb.append(a[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class TH3_B5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int col = sc.nextInt();
            Matrix ma = new Matrix(n, m);
            ma.nextMatrix(sc);
            ma.sortColumn(col);
            System.out.println(ma);
        }
    }
}

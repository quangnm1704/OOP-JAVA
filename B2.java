import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0 && b != 0) System.out.println("VN");
        else if(a == 0 && b == 0) System.out.println("VSN");

        else{
            double res = (double)-b / a;
            System.out.printf("%.2f", res);
        }
    }
}

import java.util.*;

public class HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long length = sc.nextLong();
        long width = sc.nextLong();

        if(length <= 0 || width <= 0) System.out.print(0);
        else{
            System.out.print((length + width)*2 + " " + length * width);
        }
    }
}

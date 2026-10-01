import java.io.*;
import java.util.*;

public class Liet_ke_so_nguyen_to {
    private static final int MAX = 10000;
    private static boolean[] isPrime = new boolean[MAX + 1];

    private static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sieve();

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        int[] count1 = new int[MAX + 1];
        for (int x : list1) {
            if (x <= MAX && isPrime[x]) {
                count1[x]++;
            }
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

        int[] count2 = new int[MAX + 1];
        for (int x : list2) {
            if (x <= MAX && isPrime[x]) {
                count2[x]++;
            }
        }

        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i] && count1[i] > 0 && count2[i] > 0) {
                System.out.println(i + " " + count1[i] + " " + count2[i]);
            }
        }
    }
}
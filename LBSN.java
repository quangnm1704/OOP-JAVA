import java.util.*;
import java.io.*;

public class LBSN {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();

        while (in.hasNext()) {
            String s = in.next();
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                list.add(s);
            }
        }

        Collections.sort(list);

        for (String x : list) {
            System.out.print(x + " ");
        }

        in.close();
    }
}
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class SV{
    public String ten;
    public long phut;
    public SV(String ten, long phut){
        this.ten = ten;
        this.phut = phut;
    }
}

public class THB12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        ArrayList<SV> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            long bd = f.parse(sc.nextLine()).getTime();
            long kt = f.parse(sc.nextLine()).getTime();
            a.add(new SV(ten, (kt - bd) / 60000));

        }

        a.sort((x, y) ->{
            if(x.phut != y.phut){
                return Long.compare(y.phut, x.phut);
            }

            return x.ten.compareTo(y.ten);
        });

        for(SV x : a){
            System.out.println(x.ten + " " + x.phut);
        }
    }
}

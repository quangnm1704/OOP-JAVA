import java.util.*;

class SV{
    int soTT;
    String msv;
    String hoTen;
    String lop;
    String email;
    String corp;

    public SV(int soTT, String msv, String hoTen, String lop, String email, String corp){
        this.soTT = soTT;
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.corp = corp;
    }

    public String toString(){
       return this.soTT + " " + this.msv + " " + this.hoTen + " " + this.lop + " " + this.email + " " + this.corp;
    }
}

public class Danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        HashMap <String, ArrayList<SV>> mapSV = new HashMap<>();
        
        for(int i = 0; i < n; i++){

            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            String corp = sc.nextLine();
            SV a = new SV(i+1, msv, ten, lop, mail, corp);

            if(!mapSV.containsKey(corp)) mapSV.put(corp, new ArrayList<>());
            mapSV.get(corp).add(a);
        }

        int q = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < q; i++){
            String corp = sc.nextLine();
            if(!mapSV.get(corp).isEmpty()){

                mapSV.get(corp).sort((a, b) ->{
                    return a.hoTen.compareTo(b.hoTen);
                });

                for(SV x : mapSV.get(corp)){
                    System.out.println(x);
                }
            }
        }
    }
}

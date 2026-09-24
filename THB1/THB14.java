import java.util.*;
import java.io.*;

class team{
   public String tenTeam, tenTruong;
    team(String tenTeam, String tenTruong){
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
    }
}

class ThiSinh{
    String ma, ten;
    team team;

    ThiSinh(String ma, String ten, team team){
        this.ma = ma;
        this.ten = ten;
        this.team = team;
    }
}

public class THB14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soTeam = Integer.parseInt(sc.nextLine().trim());
        HashMap <String, team> mapTeam = new HashMap<>();

        for(int i = 1; i <= soTeam; i++){
            String maTeam = String.format("Team%02d", i);
            String tenTeam = sc.nextLine().trim();
            String tenTruong = sc.nextLine().trim();

            mapTeam.put(maTeam, new team(tenTeam, tenTruong));
        }

        int soTS = Integer.parseInt(sc.nextLine().trim());
        ArrayList <ThiSinh> list = new ArrayList<>();

        for(int i = 1; i <= soTS; i++){
            String maTS = String.format("C%03d", i);
            String ten = sc.nextLine().trim();
            String maTeam = sc.nextLine().trim();
            list.add(new ThiSinh(maTS, ten, mapTeam.get(maTeam)));
        }

        list.sort((a, b) -> a.ten.compareTo(b.ten));
        for(ThiSinh x : list){
            System.out.println(x.ma + " " + x.ten + " " + x.team.tenTeam + " " + x.team.tenTruong);
        }
    }
}
